package io.agora.base.internal.voiceengine;

import android.annotation.SuppressLint;
import android.annotation.TargetApi;
import android.media.AudioAttributes;
import android.media.AudioDeviceInfo;
import android.media.AudioFormat;
import android.media.AudioManager;
import android.media.AudioRouting;
import android.media.AudioTimestamp;
import android.media.AudioTrack;
import android.os.Handler;
import android.os.Process;
import io.agora.base.internal.CalledByNative;
import io.agora.base.internal.ContextUtils;
import io.agora.base.internal.Logging;
import io.agora.base.internal.ThreadUtils;
import java.nio.ByteBuffer;

/* loaded from: classes2.dex */
public class WebRtcAudioTrack {
    private static final long AUDIO_TRACK_THREAD_JOIN_TIMEOUT_MS = 2000;
    private static final int BITS_PER_SAMPLE = 16;
    private static final int BUFFERS_PER_SECOND = 100;
    private static final int CALCULATE_LATENCY_PERIOD = 40;
    private static final int CALLBACK_BUFFER_SIZE_MS = 10;
    private static final boolean DEBUG = false;
    private static final int DEFAULT_FORCE_CALC_TIME = 3;
    private static final int DEFAULT_PLAYOUT_LATENCY = 160;
    private static final int MAX_PLAYOUT_LATENCY = 400;
    private static final String TAG = "WebRtcAudioTrack [JavaAdm]";
    private final AudioManager audioManager;
    private AudioTrackThread audioThread;
    private AudioTrack audioTrack;
    private ByteBuffer byteBuffer;
    private byte[] emptyBytes;
    private int mBytesPerFrame;
    private long mFramesWritten;
    private int mLatencyCalcCount;
    private int mPlayPreviousUnderrun;
    private int mPlayoutLatency;
    private int mPlayoutLoopCounter;
    private int mUnderrunCount;
    private final long nativeAudioTrack;
    private final ThreadUtils.ThreadChecker threadChecker;
    private AudioTrackRoutingListener trackRouteListener;
    private AudioTrackRoutingListenerForAPI23 trackRouteListenerForAPI23;
    private static final int DEFAULT_USAGE = getDefaultUsageAttribute();
    private static boolean enableLowlatencyPlayout = false;
    private static WebRtcAudioManager rtcAudioManager = null;
    private static volatile boolean speakerMute = false;
    private static WebRtcAudioTrackErrorCallback errorCallbackOld = null;
    private static ErrorCallback errorCallback = null;
    private static AudioTrackRouteCallback trackRouteCallback = null;
    private int usageAttribute = DEFAULT_USAGE;
    private int streamType = 0;

    @TargetApi(21)
    private int contentType = 1;

    public interface AudioTrackRouteCallback {
        void onAudioTrackRouteNotify(int i10, AudioDeviceInfo audioDeviceInfo);
    }

    public class AudioTrackRoutingListener implements AudioRouting.OnRoutingChangedListener {
        private AudioTrackRoutingListener() {
        }

        @Override // android.media.AudioRouting.OnRoutingChangedListener
        public void onRoutingChanged(AudioRouting audioRouting) {
            AudioDeviceInfo preferredDevice = audioRouting.getPreferredDevice();
            int type = preferredDevice != null ? preferredDevice.getType() : -1;
            AudioDeviceInfo routedDevice = audioRouting.getRoutedDevice();
            if (routedDevice != null && type == -1) {
                type = routedDevice.getType();
            }
            if (routedDevice != null && WebRtcAudioTrack.trackRouteCallback != null) {
                WebRtcAudioTrack.trackRouteCallback.onAudioTrackRouteNotify(1, routedDevice);
            }
            WebRtcAudioTrack.this.mLatencyCalcCount = 3;
            Logging.d(WebRtcAudioTrack.TAG, "[USB] [AudioTrack-audioRouting] onRoutingChanged: " + type);
        }
    }

    public enum AudioTrackStartErrorCode {
        AUDIO_TRACK_START_EXCEPTION,
        AUDIO_TRACK_START_STATE_MISMATCH
    }

    public class AudioTrackThread extends Thread {
        private volatile boolean keepAlive;

        public AudioTrackThread(String str) {
            super(str);
            this.keepAlive = true;
        }

        @TargetApi(21)
        private int writeOnLollipop(AudioTrack audioTrack, ByteBuffer byteBuffer, int i10) {
            return audioTrack.write(byteBuffer, i10, 0);
        }

        private int writePreLollipop(AudioTrack audioTrack, ByteBuffer byteBuffer, int i10) {
            return audioTrack.write(byteBuffer.array(), byteBuffer.arrayOffset(), i10);
        }

        @Override // java.lang.Thread, java.lang.Runnable
        public void run() {
            Process.setThreadPriority(-19);
            Logging.d(WebRtcAudioTrack.TAG, "AudioTrackThread" + WebRtcAudioUtils.getThreadInfo());
            WebRtcAudioTrack.assertTrue(WebRtcAudioTrack.this.audioTrack.getPlayState() == 3);
            int capacity = WebRtcAudioTrack.this.byteBuffer.capacity();
            while (this.keepAlive) {
                WebRtcAudioTrack webRtcAudioTrack = WebRtcAudioTrack.this;
                webRtcAudioTrack.nativeGetPlayoutData(capacity, webRtcAudioTrack.mPlayoutLatency, WebRtcAudioTrack.this.nativeAudioTrack);
                WebRtcAudioTrack.assertTrue(capacity <= WebRtcAudioTrack.this.byteBuffer.remaining());
                if (WebRtcAudioTrack.speakerMute) {
                    WebRtcAudioTrack.this.byteBuffer.clear();
                    WebRtcAudioTrack.this.byteBuffer.put(WebRtcAudioTrack.this.emptyBytes);
                    WebRtcAudioTrack.this.byteBuffer.position(0);
                }
                int writeOnLollipop = WebRtcAudioUtils.runningOnLollipopOrHigher() ? writeOnLollipop(WebRtcAudioTrack.this.audioTrack, WebRtcAudioTrack.this.byteBuffer, capacity) : writePreLollipop(WebRtcAudioTrack.this.audioTrack, WebRtcAudioTrack.this.byteBuffer, capacity);
                if (writeOnLollipop != capacity) {
                    Logging.e(WebRtcAudioTrack.TAG, "AudioTrack.write played invalid number of bytes: " + writeOnLollipop);
                    if (writeOnLollipop < 0) {
                        this.keepAlive = false;
                        WebRtcAudioTrack.this.reportWebRtcAudioTrackError("AudioTrack.write failed: " + writeOnLollipop);
                    }
                }
                if (WebRtcAudioTrack.this.mFramesWritten == 0) {
                    Logging.d(WebRtcAudioTrack.TAG, "AudioTrackThread write first frame : " + writeOnLollipop + " finished.");
                }
                WebRtcAudioTrack.access$914(WebRtcAudioTrack.this, writeOnLollipop / r5.mBytesPerFrame);
                try {
                    if (WebRtcAudioTrack.this.mPlayoutLoopCounter % 40 == 0) {
                        WebRtcAudioTrack.this.calculateLatencyMillis();
                    }
                    WebRtcAudioTrack webRtcAudioTrack2 = WebRtcAudioTrack.this;
                    webRtcAudioTrack2.mPlayoutLoopCounter = (webRtcAudioTrack2.mPlayoutLoopCounter + 1) % 40;
                } catch (Throwable th2) {
                    Logging.e(WebRtcAudioTrack.TAG, "calculateLatencyMillis failed: " + th2.getMessage());
                }
                WebRtcAudioTrack.this.byteBuffer.rewind();
            }
            if (WebRtcAudioTrack.this.audioTrack != null) {
                Logging.d(WebRtcAudioTrack.TAG, "Calling AudioTrack.stop...");
                try {
                    WebRtcAudioTrack.this.audioTrack.stop();
                    Logging.d(WebRtcAudioTrack.TAG, "AudioTrack.stop is done.");
                } catch (Exception e10) {
                    Logging.e(WebRtcAudioTrack.TAG, "AudioTrack.stop failed: " + e10.getMessage());
                }
            }
        }

        public void stopThread() {
            Logging.d(WebRtcAudioTrack.TAG, "stopThread");
            this.keepAlive = false;
        }
    }

    public interface ErrorCallback {
        void onWebRtcAudioTrackError(String str);

        void onWebRtcAudioTrackInitError(String str);

        void onWebRtcAudioTrackStartError(AudioTrackStartErrorCode audioTrackStartErrorCode, String str);
    }

    @Deprecated
    public interface WebRtcAudioTrackErrorCallback {
        void onWebRtcAudioTrackError(String str);

        void onWebRtcAudioTrackInitError(String str);

        void onWebRtcAudioTrackStartError(String str);
    }

    @CalledByNative
    public WebRtcAudioTrack(long j10, Object obj) {
        ThreadUtils.ThreadChecker threadChecker = new ThreadUtils.ThreadChecker();
        this.threadChecker = threadChecker;
        this.audioTrack = null;
        this.audioThread = null;
        this.mPlayoutLatency = 0;
        this.mFramesWritten = 0L;
        this.mBytesPerFrame = 0;
        this.mPlayoutLoopCounter = 0;
        this.mUnderrunCount = 0;
        this.mLatencyCalcCount = 0;
        this.mPlayPreviousUnderrun = 0;
        this.trackRouteListenerForAPI23 = null;
        this.trackRouteListener = null;
        threadChecker.checkIsOnValidThread();
        StringBuilder sb2 = new StringBuilder();
        sb2.append("ctor");
        sb2.append(WebRtcAudioUtils.getThreadInfo());
        sb2.append(", rtc audio manager: ");
        WebRtcAudioManager webRtcAudioManager = (WebRtcAudioManager) obj;
        sb2.append(webRtcAudioManager);
        Logging.d(TAG, sb2.toString());
        this.nativeAudioTrack = j10;
        rtcAudioManager = webRtcAudioManager;
        this.audioManager = (AudioManager) ContextUtils.getApplicationContext().getSystemService("audio");
        this.trackRouteListener = new AudioTrackRoutingListener();
    }

    public static /* synthetic */ long access$914(WebRtcAudioTrack webRtcAudioTrack, long j10) {
        long j11 = webRtcAudioTrack.mFramesWritten + j10;
        webRtcAudioTrack.mFramesWritten = j11;
        return j11;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void assertTrue(boolean z10) {
        if (!z10) {
            throw new AssertionError("Expected condition to be true");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int calculateLatencyMillis() {
        if (this.audioTrack == null) {
            Logging.e(TAG, "audiotrack is null");
            return -1;
        }
        boolean z10 = true;
        if (WebRtcAudioUtils.runningOnNougatOrHigher()) {
            int underrunCount = this.audioTrack.getUnderrunCount();
            r4 = underrunCount != this.mUnderrunCount;
            this.mUnderrunCount = underrunCount;
        }
        int i10 = this.mLatencyCalcCount;
        if (i10 > 0) {
            this.mLatencyCalcCount = i10 - 1;
        } else {
            z10 = r4;
        }
        if (!z10) {
            return -1;
        }
        AudioTimestamp audioTimestamp = new AudioTimestamp();
        if (!this.audioTrack.getTimestamp(audioTimestamp)) {
            Logging.d(TAG, "AudioTrack Timestamp is not valid, framecount(ms): " + ((this.audioTrack.getBufferSizeInFrames() * 1000) / this.audioTrack.getSampleRate()));
            this.mPlayoutLatency = 160;
            return 160;
        }
        long sampleRate = ((this.mFramesWritten - audioTimestamp.framePosition) * 1000000000) / this.audioTrack.getSampleRate();
        int nanoTime = (int) (((audioTimestamp.nanoTime + sampleRate) - System.nanoTime()) / 1000000);
        int i11 = nanoTime + 20;
        Logging.d(TAG, "AudioTrack calculateLatencyMillis --> latencyMillis: " + nanoTime + ",extraTime: 20,frameTimeDeltaNano: " + sampleRate + ",last latency " + this.mPlayoutLatency + ",new latency: " + i11);
        if (i11 > 0 && nanoTime <= 400) {
            this.mPlayoutLatency = i11;
        }
        return this.mPlayoutLatency;
    }

    private int channelCountToConfiguration(int i10) {
        return i10 == 1 ? 4 : 12;
    }

    @TargetApi(21)
    private AudioTrack createAudioTrackOnLollipopOrHigher(int i10, int i11, int i12) {
        AudioTrack.Builder performanceMode;
        Logging.d(TAG, "createAudioTrackOnLollipopOrHigher");
        int nativeOutputSampleRate = AudioTrack.getNativeOutputSampleRate(0);
        Logging.d(TAG, "nativeOutputSampleRate: " + nativeOutputSampleRate + ", enableLowlatencyPlayout " + enableLowlatencyPlayout);
        if (i10 != nativeOutputSampleRate) {
            Logging.w(TAG, "Unable to use fast mode since requested sample rate is not native");
        }
        if (this.usageAttribute != DEFAULT_USAGE) {
            Logging.w(TAG, "A non default usage attribute is used: " + this.usageAttribute);
        }
        WebRtcAudioManager webRtcAudioManager = rtcAudioManager;
        AudioAttributes custAudioAttrCtx = webRtcAudioManager != null ? webRtcAudioManager.getCustAudioAttrCtx() : null;
        if (WebRtcAudioUtils.runningOnOreoOrHigher() && enableLowlatencyPlayout && custAudioAttrCtx != null) {
            AudioAttributes build = new AudioAttributes.Builder().setUsage(this.usageAttribute).setContentType(this.contentType).build();
            AudioFormat build2 = new AudioFormat.Builder().setEncoding(2).setSampleRate(i10).setChannelMask(i11).build();
            performanceMode = new AudioTrack.Builder().setPerformanceMode(enableLowlatencyPlayout ? 1 : 0);
            return performanceMode.setAudioAttributes(build).setAudioFormat(build2).setBufferSizeInBytes(i12).build();
        }
        if (custAudioAttrCtx == null) {
            custAudioAttrCtx = new AudioAttributes.Builder().setUsage(this.usageAttribute).setContentType(this.contentType).build();
        }
        AudioAttributes audioAttributes = custAudioAttrCtx;
        Logging.d(TAG, "AudioTrack playback attribute: " + audioAttributes.toString());
        return new AudioTrack(audioAttributes, new AudioFormat.Builder().setEncoding(2).setSampleRate(i10).setChannelMask(i11).build(), i12, 1, 0);
    }

    private AudioTrack createAudioTrackOnLowerThanLollipop(int i10, int i11, int i12) {
        return new AudioTrack(this.streamType, i10, i11, 2, i12, 1);
    }

    @CalledByNative
    private boolean enableLowlatencyPlayout(boolean z10) {
        enableLowlatencyPlayout = z10;
        return true;
    }

    private static int getDefaultUsageAttribute() {
        if (WebRtcAudioUtils.runningOnLollipopOrHigher()) {
            return getDefaultUsageAttributeOnLollipopOrHigher();
        }
        return 0;
    }

    @TargetApi(21)
    private static int getDefaultUsageAttributeOnLollipopOrHigher() {
        return 2;
    }

    @CalledByNative
    private int getStreamMaxVolume() {
        Logging.d(TAG, "getStreamMaxVolume");
        assertTrue(this.audioManager != null);
        return this.audioManager.getStreamMaxVolume(this.streamType);
    }

    @CalledByNative
    private int getStreamVolume() {
        Logging.d(TAG, "getStreamVolume");
        assertTrue(this.audioManager != null);
        return this.audioManager.getStreamVolume(this.streamType);
    }

    @TargetApi(24)
    @CalledByNative
    private int getUnderrunCount() {
        return WebRtcAudioUtils.runningOnNougatOrHigher() ? getUnderrunCountOnNougatOrHigher() : getUnderrunCountOnLowerThanNougat();
    }

    private int getUnderrunCountOnLowerThanNougat() {
        return -1;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0028  */
    @TargetApi(24)
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private int getUnderrunCountOnNougatOrHigher() {
        int i10;
        int i11;
        AudioTrack audioTrack;
        try {
            audioTrack = this.audioTrack;
        } catch (Exception e10) {
            Logging.e(TAG, "getUnderrun fail ", e10);
        }
        if (audioTrack != null && audioTrack.getPlayState() == 3) {
            i10 = this.audioTrack.getUnderrunCount();
            int i12 = i10 - this.mPlayPreviousUnderrun;
            i11 = i12 >= 0 ? i12 : 0;
            this.mPlayPreviousUnderrun = i10;
            if (i11 > 0) {
                Logging.d(TAG, "Android AudioTrack underrun count: " + i11);
            }
            return i11;
        }
        i10 = 0;
        int i122 = i10 - this.mPlayPreviousUnderrun;
        if (i122 >= 0) {
        }
        this.mPlayPreviousUnderrun = i10;
        if (i11 > 0) {
        }
        return i11;
    }

    @CalledByNative
    private boolean initPlayout(int i10, int i11, float f10, boolean z10) {
        AudioTrackRouteCallback audioTrackRouteCallback;
        Logging.d(TAG, "initPlayout(sampleRate=" + i10 + ", channels=" + i11 + ", bufferSizeFactor=" + f10 + ", enableLowlatencyPlayout = " + enableLowlatencyPlayout + ", chatMode = " + z10 + ")");
        int i12 = i11 * 2;
        this.mBytesPerFrame = i12;
        this.byteBuffer = ByteBuffer.allocateDirect(i12 * (i10 / 100));
        StringBuilder sb2 = new StringBuilder();
        sb2.append("byteBuffer.capacity: ");
        sb2.append(this.byteBuffer.capacity());
        Logging.d(TAG, sb2.toString());
        this.emptyBytes = new byte[this.byteBuffer.capacity()];
        nativeCacheDirectBufferAddress(this.byteBuffer, this.nativeAudioTrack);
        int channelCountToConfiguration = channelCountToConfiguration(i11);
        int minBufferSize = (int) (((float) AudioTrack.getMinBufferSize(i10, channelCountToConfiguration, 2)) * f10);
        Logging.d(TAG, "minBufferSizeInBytes: " + minBufferSize);
        if (minBufferSize < this.byteBuffer.capacity()) {
            reportWebRtcAudioTrackInitError("AudioTrack.getMinBufferSize returns an invalid value.");
            return false;
        }
        if (this.audioTrack != null) {
            reportWebRtcAudioTrackInitError("Conflict with existing AudioTrack.");
            releaseAudioResources();
        }
        try {
            Logging.d(TAG, "initPlayout audio mode: " + WebRtcAudioUtils.modeToString(this.audioManager.getMode()));
            if (WebRtcAudioUtils.runningOnLollipopOrHigher()) {
                initPlayoutParametersOnLollipopOrHigher(z10);
                this.audioTrack = createAudioTrackOnLollipopOrHigher(i10, channelCountToConfiguration, minBufferSize);
            } else {
                initPlayoutParametersOnLowerThanLollipop(z10);
                this.audioTrack = createAudioTrackOnLowerThanLollipop(i10, channelCountToConfiguration, minBufferSize);
            }
            AudioTrack audioTrack = this.audioTrack;
            if (audioTrack == null || audioTrack.getState() != 1) {
                reportWebRtcAudioTrackInitError("Initialization of audio track failed.");
                releaseAudioResources();
                return false;
            }
            logMainParameters();
            logMainParametersExtended();
            if (ContextUtils.getApplicationContext().getPackageManager().hasSystemFeature("android.hardware.audio.output")) {
                AudioDeviceInfo preferredDevice = this.audioTrack.getPreferredDevice();
                if (preferredDevice != null) {
                    Logging.d(TAG, "[USB] audio track deviceType = " + preferredDevice.getType());
                } else {
                    Logging.d(TAG, "[USB] audioTrack has no preferred device");
                    preferredDevice = this.audioTrack.getRoutedDevice();
                    if (preferredDevice != null) {
                        Logging.d(TAG, "[USB] initPlayout-getRoutedDevice deviceType = " + preferredDevice.getType());
                    }
                }
                if (preferredDevice != null && (audioTrackRouteCallback = trackRouteCallback) != null) {
                    audioTrackRouteCallback.onAudioTrackRouteNotify(1, preferredDevice);
                }
            } else {
                Logging.d(TAG, "[USB] audioTrack has no PackageManager.FEATURE_AUDIO_OUTPUT");
            }
            AudioTrackRoutingListener audioTrackRoutingListener = this.trackRouteListener;
            if (audioTrackRoutingListener != null) {
                this.audioTrack.addOnRoutingChangedListener(audioTrackRoutingListener, (Handler) null);
            }
            Logging.d(TAG, "Init playout finished!");
            return true;
        } catch (IllegalArgumentException e10) {
            reportWebRtcAudioTrackInitError(e10.getMessage());
            releaseAudioResources();
            return false;
        }
    }

    @TargetApi(21)
    private void initPlayoutParametersOnLollipopOrHigher(boolean z10) {
        if (z10) {
            this.contentType = 1;
            setAudioTrackUsageAttribute(2);
        } else {
            this.contentType = 2;
            setAudioTrackUsageAttribute(1);
        }
    }

    private void initPlayoutParametersOnLowerThanLollipop(boolean z10) {
        if (z10) {
            this.streamType = 0;
        } else {
            this.streamType = 3;
        }
    }

    @SuppressLint({"NewApi"})
    private boolean isVolumeFixed() {
        if (WebRtcAudioUtils.runningOnLollipopOrHigher()) {
            return this.audioManager.isVolumeFixed();
        }
        return false;
    }

    private void logMainParameters() {
        Logging.d(TAG, "AudioTrack: session ID: " + this.audioTrack.getAudioSessionId() + ", channels: " + this.audioTrack.getChannelCount() + ", sample rate: " + this.audioTrack.getSampleRate() + ", max gain: " + AudioTrack.getMaxVolume());
    }

    @TargetApi(24)
    private void logMainParametersExtended() {
        if (WebRtcAudioUtils.runningOnMarshmallowOrHigher()) {
            Logging.d(TAG, "AudioTrack: buffer size in frames: " + this.audioTrack.getBufferSizeInFrames());
        }
        if (WebRtcAudioUtils.runningOnNougatOrHigher()) {
            Logging.d(TAG, "AudioTrack: buffer capacity in frames: " + this.audioTrack.getBufferCapacityInFrames());
        }
    }

    @TargetApi(24)
    private void logUnderrunCount() {
        if (WebRtcAudioUtils.runningOnNougatOrHigher()) {
            Logging.d(TAG, "underrun count: " + this.audioTrack.getUnderrunCount());
        }
    }

    private native void nativeCacheDirectBufferAddress(ByteBuffer byteBuffer, long j10);

    /* JADX INFO: Access modifiers changed from: private */
    public native void nativeGetPlayoutData(int i10, int i11, long j10);

    private void releaseAudioResources() {
        Logging.d(TAG, "releaseAudioResources");
        AudioTrack audioTrack = this.audioTrack;
        if (audioTrack != null) {
            audioTrack.release();
            this.audioTrack = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void reportWebRtcAudioTrackError(String str) {
        Logging.e(TAG, "Run-time playback error: " + str);
        WebRtcAudioUtils.logAudioState(TAG);
        WebRtcAudioTrackErrorCallback webRtcAudioTrackErrorCallback = errorCallbackOld;
        if (webRtcAudioTrackErrorCallback != null) {
            webRtcAudioTrackErrorCallback.onWebRtcAudioTrackError(str);
        }
        ErrorCallback errorCallback2 = errorCallback;
        if (errorCallback2 != null) {
            errorCallback2.onWebRtcAudioTrackError(str);
        }
    }

    private void reportWebRtcAudioTrackInitError(String str) {
        Logging.e(TAG, "Init playout error: " + str);
        WebRtcAudioUtils.logAudioState(TAG);
        WebRtcAudioTrackErrorCallback webRtcAudioTrackErrorCallback = errorCallbackOld;
        if (webRtcAudioTrackErrorCallback != null) {
            webRtcAudioTrackErrorCallback.onWebRtcAudioTrackInitError(str);
        }
        ErrorCallback errorCallback2 = errorCallback;
        if (errorCallback2 != null) {
            errorCallback2.onWebRtcAudioTrackInitError(str);
        }
    }

    private void reportWebRtcAudioTrackStartError(AudioTrackStartErrorCode audioTrackStartErrorCode, String str) {
        Logging.e(TAG, "Start playout error: " + audioTrackStartErrorCode + ". " + str);
        WebRtcAudioUtils.logAudioState(TAG);
        WebRtcAudioTrackErrorCallback webRtcAudioTrackErrorCallback = errorCallbackOld;
        if (webRtcAudioTrackErrorCallback != null) {
            webRtcAudioTrackErrorCallback.onWebRtcAudioTrackStartError(str);
        }
        ErrorCallback errorCallback2 = errorCallback;
        if (errorCallback2 != null) {
            errorCallback2.onWebRtcAudioTrackStartError(audioTrackStartErrorCode, str);
        }
    }

    @Deprecated
    public static void setErrorCallback(WebRtcAudioTrackErrorCallback webRtcAudioTrackErrorCallback) {
        Logging.d(TAG, "Set error callback (deprecated");
        errorCallbackOld = webRtcAudioTrackErrorCallback;
    }

    public static void setSpeakerMute(boolean z10) {
        Logging.w(TAG, "setSpeakerMute(" + z10 + ")");
        speakerMute = z10;
    }

    @CalledByNative
    private boolean setStreamVolume(int i10) {
        Logging.d(TAG, "setStreamVolume(" + i10 + ")");
        assertTrue(this.audioManager != null);
        if (isVolumeFixed()) {
            Logging.e(TAG, "The device implements a fixed volume policy.");
            return false;
        }
        this.audioManager.setStreamVolume(this.streamType, i10, 0);
        return true;
    }

    public static void setTrackRouteCallback(AudioTrackRouteCallback audioTrackRouteCallback) {
        Logging.d(TAG, "[USB] Set AudioTrackRouteCallback");
        trackRouteCallback = audioTrackRouteCallback;
    }

    @CalledByNative
    private boolean startPlayout() {
        Logging.d(TAG, "startPlayout");
        assertTrue(this.audioTrack != null);
        assertTrue(this.audioThread == null);
        try {
            this.audioTrack.play();
            if (this.audioTrack.getPlayState() != 3) {
                reportWebRtcAudioTrackStartError(AudioTrackStartErrorCode.AUDIO_TRACK_START_STATE_MISMATCH, "AudioTrack.play failed - incorrect state :" + this.audioTrack.getPlayState());
                releaseAudioResources();
                return false;
            }
            this.mFramesWritten = 0L;
            this.mUnderrunCount = 0;
            this.mPlayoutLoopCounter = 0;
            this.mLatencyCalcCount = 3;
            AudioTrackThread audioTrackThread = new AudioTrackThread("AudioTrackJavaThread");
            this.audioThread = audioTrackThread;
            audioTrackThread.start();
            return true;
        } catch (IllegalStateException e10) {
            reportWebRtcAudioTrackStartError(AudioTrackStartErrorCode.AUDIO_TRACK_START_EXCEPTION, "AudioTrack.play failed: " + e10.getMessage());
            releaseAudioResources();
            return false;
        }
    }

    @CalledByNative
    private boolean stopPlayout() {
        Logging.d(TAG, "stopPlayout");
        AudioTrackThread audioTrackThread = this.audioThread;
        if (audioTrackThread != null) {
            audioTrackThread.stopThread();
            Logging.d(TAG, "Stopping the AudioTrackThread...");
            this.audioThread.interrupt();
            if (!ThreadUtils.joinUninterruptibly(this.audioThread, AUDIO_TRACK_THREAD_JOIN_TIMEOUT_MS)) {
                Logging.e(TAG, "Join of AudioTrackThread timed out.");
                WebRtcAudioUtils.logAudioState(TAG);
            }
            Logging.d(TAG, "AudioTrackThread has now been stopped.");
            this.audioThread = null;
        }
        if (this.audioTrack != null) {
            logUnderrunCount();
            AudioTrackRoutingListener audioTrackRoutingListener = this.trackRouteListener;
            if (audioTrackRoutingListener != null) {
                this.audioTrack.removeOnRoutingChangedListener(audioTrackRoutingListener);
            }
        }
        releaseAudioResources();
        this.mPlayPreviousUnderrun = 0;
        return true;
    }

    public synchronized void setAudioTrackUsageAttribute(int i10) {
        Logging.w(TAG, "Default usage attribute is changed from: " + DEFAULT_USAGE + " to " + i10);
        this.usageAttribute = i10;
    }

    public static void setErrorCallback(ErrorCallback errorCallback2) {
        Logging.d(TAG, "Set extended error callback");
        errorCallback = errorCallback2;
    }

    public class AudioTrackRoutingListenerForAPI23 implements AudioTrack.OnRoutingChangedListener {
        private AudioTrackRoutingListenerForAPI23() {
        }

        @Override // android.media.AudioTrack.OnRoutingChangedListener
        public void onRoutingChanged(AudioTrack audioTrack) {
            AudioDeviceInfo preferredDevice = audioTrack.getPreferredDevice();
            int type = preferredDevice != null ? preferredDevice.getType() : -1;
            AudioDeviceInfo routedDevice = audioTrack.getRoutedDevice();
            if (routedDevice != null && type == -1) {
                type = routedDevice.getType();
            }
            if (routedDevice != null && WebRtcAudioTrack.trackRouteCallback != null) {
                WebRtcAudioTrack.trackRouteCallback.onAudioTrackRouteNotify(1, routedDevice);
            }
            Logging.d(WebRtcAudioTrack.TAG, "[USB] [AudioTrack-audioTrack] onRoutingChanged: " + type);
        }

        @Override // android.media.AudioTrack.OnRoutingChangedListener, android.media.AudioRouting.OnRoutingChangedListener
        public void onRoutingChanged(AudioRouting audioRouting) {
            AudioDeviceInfo preferredDevice = audioRouting.getPreferredDevice();
            int type = preferredDevice != null ? preferredDevice.getType() : -1;
            AudioDeviceInfo routedDevice = audioRouting.getRoutedDevice();
            if (routedDevice != null && type == -1) {
                type = routedDevice.getType();
            }
            if (routedDevice != null && WebRtcAudioTrack.trackRouteCallback != null) {
                WebRtcAudioTrack.trackRouteCallback.onAudioTrackRouteNotify(1, routedDevice);
            }
            WebRtcAudioTrack.this.mLatencyCalcCount = 3;
            Logging.d(WebRtcAudioTrack.TAG, "[USB] [AudioTrack-audioRouting] onRoutingChanged: " + type);
        }
    }
}
