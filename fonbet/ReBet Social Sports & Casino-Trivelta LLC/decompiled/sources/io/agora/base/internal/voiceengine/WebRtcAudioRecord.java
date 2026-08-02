package io.agora.base.internal.voiceengine;

import android.annotation.TargetApi;
import android.media.AudioDeviceInfo;
import android.media.AudioManager;
import android.media.AudioRecord;
import android.media.AudioRouting;
import android.media.AudioTimestamp;
import android.os.Build;
import android.os.Handler;
import android.os.Process;
import io.agora.base.internal.CalledByNative;
import io.agora.base.internal.ContextUtils;
import io.agora.base.internal.Logging;
import io.agora.base.internal.ThreadUtils;
import java.nio.ByteBuffer;
import java.util.Arrays;

/* loaded from: classes2.dex */
public class WebRtcAudioRecord {
    private static final long AUDIO_RECORD_THREAD_JOIN_TIMEOUT_MS = 2000;
    private static final int BITS_PER_SAMPLE = 16;
    private static final int BUFFERS_PER_SECOND = 100;
    private static final int BUFFER_SIZE_FACTOR = 2;
    private static final int CALCULATE_LATENCY_PERIOD = 40;
    private static final int CALLBACK_BUFFER_SIZE_MS = 10;
    private static final boolean DEBUG = false;
    private static final int DEFAULT_FORCE_CALC_TIME = 3;
    private static final int DEFAULT_RECORD_LATENCY = 30;
    private static final int MAX_RECORD_LATENCY = 250;
    private static final String TAG = "WebRtcAudioRecord [JavaAdm]";
    private final AudioManager audioManager;
    private ByteBuffer byteBuffer;
    private WebRtcAudioEffects effects;
    private byte[] emptyBytes;
    private final long nativeAudioRecord;
    private AudioRecordRoutingListener recordRouteListener;
    private static final int DEFAULT_AUDIO_SOURCE = getDefaultAudioSource();
    private static volatile boolean microphoneMute = false;
    private static WebRtcAudioRecordErrorCallback errorCallback = null;
    private static AudioRecordRouteCallback recordRouteCallback = null;
    private static WebRtcAudioRecordSamplesReadyCallback audioSamplesReadyCallback = null;
    private int audioSource = DEFAULT_AUDIO_SOURCE;
    private AudioRecord audioRecord = null;
    private AudioRecordThread audioThread = null;
    private int mLatencyCalcCount = 0;
    private int mRecordLatency = 0;
    private long mFramesRead = 0;
    private int mBytesPerFrame = 2;
    private int mRecordLoopCounter = 0;
    private AudioRecordRoutingListenerForAPI23 recordRouteListenerForAPI23 = null;

    public interface AudioRecordRouteCallback {
        void onAudioRecordRouteNotify(int i10, AudioDeviceInfo audioDeviceInfo);
    }

    public class AudioRecordRoutingListener implements AudioRouting.OnRoutingChangedListener {
        private AudioRecordRoutingListener() {
        }

        @Override // android.media.AudioRouting.OnRoutingChangedListener
        public void onRoutingChanged(AudioRouting audioRouting) {
            AudioDeviceInfo preferredDevice = audioRouting.getPreferredDevice();
            int type = preferredDevice != null ? preferredDevice.getType() : -1;
            AudioDeviceInfo routedDevice = audioRouting.getRoutedDevice();
            if (routedDevice != null && type == -1) {
                type = routedDevice.getType();
            }
            if (routedDevice != null && WebRtcAudioRecord.recordRouteCallback != null) {
                WebRtcAudioRecord.recordRouteCallback.onAudioRecordRouteNotify(1, routedDevice);
            }
            WebRtcAudioRecord.this.mLatencyCalcCount = 3;
            Logging.d(WebRtcAudioRecord.TAG, "[USB] [AudioRecord-audioRouting] onRoutingChanged: " + type);
        }
    }

    public enum AudioRecordStartErrorCode {
        AUDIO_RECORD_START_EXCEPTION,
        AUDIO_RECORD_START_STATE_MISMATCH
    }

    public class AudioRecordThread extends Thread {
        private volatile boolean keepAlive;

        public AudioRecordThread(String str) {
            super(str);
            this.keepAlive = true;
        }

        @Override // java.lang.Thread, java.lang.Runnable
        public void run() {
            Process.setThreadPriority(-19);
            Logging.d(WebRtcAudioRecord.TAG, "AudioRecordThread" + WebRtcAudioUtils.getThreadInfo());
            WebRtcAudioRecord.assertTrue(WebRtcAudioRecord.this.audioRecord.getRecordingState() == 3);
            System.nanoTime();
            while (this.keepAlive) {
                int read = WebRtcAudioRecord.this.audioRecord.read(WebRtcAudioRecord.this.byteBuffer, WebRtcAudioRecord.this.byteBuffer.capacity());
                if (read == WebRtcAudioRecord.this.byteBuffer.capacity()) {
                    if (WebRtcAudioRecord.microphoneMute) {
                        WebRtcAudioRecord.this.byteBuffer.clear();
                        WebRtcAudioRecord.this.byteBuffer.put(WebRtcAudioRecord.this.emptyBytes);
                    }
                    if (this.keepAlive) {
                        WebRtcAudioRecord webRtcAudioRecord = WebRtcAudioRecord.this;
                        webRtcAudioRecord.nativeDataIsRecorded(read, webRtcAudioRecord.mRecordLatency, WebRtcAudioRecord.this.nativeAudioRecord);
                    }
                    if (WebRtcAudioRecord.audioSamplesReadyCallback != null) {
                        WebRtcAudioRecord.audioSamplesReadyCallback.onWebRtcAudioRecordSamplesReady(new AudioSamples(WebRtcAudioRecord.this.audioRecord, Arrays.copyOf(WebRtcAudioRecord.this.byteBuffer.array(), WebRtcAudioRecord.this.byteBuffer.capacity())));
                    }
                } else {
                    String str = "AudioRecord.read failed: " + read;
                    Logging.e(WebRtcAudioRecord.TAG, str);
                    if (read == -3) {
                        this.keepAlive = false;
                        WebRtcAudioRecord.this.reportWebRtcAudioRecordError(str);
                    }
                }
                if (WebRtcAudioRecord.this.mFramesRead == 0) {
                    Logging.d(WebRtcAudioRecord.TAG, "AudioRecordThread read first frame : " + (read / WebRtcAudioRecord.this.mBytesPerFrame) + " finished. ");
                }
                WebRtcAudioRecord.access$1114(WebRtcAudioRecord.this, read / r2.mBytesPerFrame);
                try {
                    if (WebRtcAudioRecord.this.mRecordLoopCounter % 40 == 0) {
                        WebRtcAudioRecord.this.calculateLatencyMillis();
                    }
                    WebRtcAudioRecord webRtcAudioRecord2 = WebRtcAudioRecord.this;
                    webRtcAudioRecord2.mRecordLoopCounter = (webRtcAudioRecord2.mRecordLoopCounter + 1) % 40;
                } catch (Throwable th2) {
                    Logging.e(WebRtcAudioRecord.TAG, "calculateLatencyMillis failed: " + th2.getMessage());
                }
            }
            try {
                if (WebRtcAudioRecord.this.audioRecord != null) {
                    WebRtcAudioRecord.this.audioRecord.stop();
                }
            } catch (IllegalStateException e10) {
                Logging.e(WebRtcAudioRecord.TAG, "AudioRecord.stop failed: " + e10.getMessage());
            }
        }

        public void stopThread() {
            Logging.d(WebRtcAudioRecord.TAG, "stopThread");
            this.keepAlive = false;
        }
    }

    public static class AudioSamples {
        private final int audioFormat;
        private final int channelCount;
        private final byte[] data;
        private final int sampleRate;

        public int getAudioFormat() {
            return this.audioFormat;
        }

        public int getChannelCount() {
            return this.channelCount;
        }

        public byte[] getData() {
            return this.data;
        }

        public int getSampleRate() {
            return this.sampleRate;
        }

        private AudioSamples(AudioRecord audioRecord, byte[] bArr) {
            this.audioFormat = audioRecord.getAudioFormat();
            this.channelCount = audioRecord.getChannelCount();
            this.sampleRate = audioRecord.getSampleRate();
            this.data = bArr;
        }
    }

    public interface WebRtcAudioRecordErrorCallback {
        void onWebRtcAudioRecordError(String str);

        void onWebRtcAudioRecordInitError(String str);

        void onWebRtcAudioRecordStartError(AudioRecordStartErrorCode audioRecordStartErrorCode, String str);
    }

    public interface WebRtcAudioRecordSamplesReadyCallback {
        void onWebRtcAudioRecordSamplesReady(AudioSamples audioSamples);
    }

    @CalledByNative
    public WebRtcAudioRecord(long j10) {
        this.effects = null;
        this.recordRouteListener = null;
        Logging.d(TAG, "ctor" + WebRtcAudioUtils.getThreadInfo());
        this.nativeAudioRecord = j10;
        this.audioManager = (AudioManager) ContextUtils.getApplicationContext().getSystemService("audio");
        this.effects = WebRtcAudioEffects.create();
        this.recordRouteListener = new AudioRecordRoutingListener();
    }

    public static /* synthetic */ long access$1114(WebRtcAudioRecord webRtcAudioRecord, long j10) {
        long j11 = webRtcAudioRecord.mFramesRead + j10;
        webRtcAudioRecord.mFramesRead = j11;
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
        if (this.audioRecord == null) {
            Logging.e(TAG, "audioRecord is null");
            return -1;
        }
        int i10 = this.mLatencyCalcCount;
        if (i10 <= 0) {
            return -1;
        }
        this.mLatencyCalcCount = i10 - 1;
        AudioTimestamp audioTimestamp = new AudioTimestamp();
        if (this.audioRecord.getTimestamp(audioTimestamp, 0) != 0) {
            Logging.e(TAG, "audioTimestamp is unavailable");
            return -1;
        }
        int nanoTime = (int) ((System.nanoTime() - (audioTimestamp.nanoTime + (((this.mFramesRead - audioTimestamp.framePosition) * 1000000000) / this.audioRecord.getSampleRate()))) / 1000000);
        Logging.d(TAG, "AudioRecord calculateLatencyMillis--> latencyMillis: " + nanoTime + ",extraTime:20");
        if (nanoTime > 0 && nanoTime <= 250) {
            this.mRecordLatency = nanoTime + 20;
        }
        return this.mRecordLatency;
    }

    private int channelCountToConfiguration(int i10) {
        return i10 == 1 ? 16 : 12;
    }

    @CalledByNative
    private boolean enableBuiltInAEC(boolean z10) {
        Logging.d(TAG, "enableBuiltInAEC(" + z10 + ')');
        WebRtcAudioEffects webRtcAudioEffects = this.effects;
        if (webRtcAudioEffects != null) {
            return webRtcAudioEffects.setAEC(z10);
        }
        Logging.e(TAG, "Built-in AEC is not supported on this platform");
        return false;
    }

    @CalledByNative
    private boolean enableBuiltInAGC(boolean z10) {
        Logging.d(TAG, "enableBuiltInAGC(" + z10 + ')');
        WebRtcAudioEffects webRtcAudioEffects = this.effects;
        if (webRtcAudioEffects != null) {
            return webRtcAudioEffects.setAGC(z10);
        }
        Logging.e(TAG, "Built-in AGC is not supported on this platform");
        return false;
    }

    @CalledByNative
    private boolean enableBuiltInNS(boolean z10) {
        Logging.d(TAG, "enableBuiltInNS(" + z10 + ')');
        WebRtcAudioEffects webRtcAudioEffects = this.effects;
        if (webRtcAudioEffects != null) {
            return webRtcAudioEffects.setNS(z10);
        }
        Logging.e(TAG, "Built-in NS is not supported on this platform");
        return false;
    }

    private static int getDefaultAudioSource() {
        return 7;
    }

    @CalledByNative
    private int initRecording(int i10, int i11, int i12) {
        String str;
        this.mBytesPerFrame = i11 * 2;
        int i13 = i10 / 100;
        Logging.d(TAG, "initRecording(sampleRate=" + i10 + ", channels=" + i11 + ", minBufMs=" + i12 + ") audioRecord=" + this.audioRecord);
        this.byteBuffer = ByteBuffer.allocateDirect(this.mBytesPerFrame * i13);
        StringBuilder sb2 = new StringBuilder();
        sb2.append("byteBuffer.capacity: ");
        sb2.append(this.byteBuffer.capacity());
        Logging.d(TAG, sb2.toString());
        this.emptyBytes = new byte[this.byteBuffer.capacity()];
        nativeCacheDirectBufferAddress(this.byteBuffer, this.nativeAudioRecord);
        AudioRecord audioRecord = this.audioRecord;
        if (audioRecord != null) {
            if (i10 == audioRecord.getSampleRate() && i11 == this.audioRecord.getChannelCount() && this.audioRecord.getAudioSource() == this.audioSource) {
                Logging.d(TAG, "using record object " + this.audioRecord);
                Logging.d(TAG, "status=" + this.audioRecord.getState() + ",recordStatus=" + this.audioRecord.getRecordingState());
                registerRoutingListener();
                return i13;
            }
            Logging.d(TAG, "re-create record object for parameter changed");
            releaseAudioResources();
        }
        int channelCountToConfiguration = channelCountToConfiguration(i11);
        int minBufferSize = AudioRecord.getMinBufferSize(i10, channelCountToConfiguration, 2);
        if (minBufferSize == -1 || minBufferSize == -2) {
            reportWebRtcAudioRecordInitError("AudioRecord.getMinBufferSize failed: " + minBufferSize);
            return -1;
        }
        Logging.d(TAG, "AudioRecord.getMinBufferSize: " + minBufferSize);
        int max = Math.max(minBufferSize * 2, this.byteBuffer.capacity());
        int i14 = i12 * (i10 / 1000) * i11 * 2;
        int i15 = max < i14 ? i14 : max;
        Logging.d(TAG, "bufferSizeInBytes: " + i15);
        Logging.d(TAG, "initRecording audio mode: " + WebRtcAudioUtils.modeToString(this.audioManager.getMode()) + ", source: " + WebRtcAudioUtils.sourceToString(this.audioSource) + ", sampleRate: " + i10);
        if (!ContextUtils.getApplicationContext().getPackageManager().hasSystemFeature("android.hardware.microphone")) {
            Logging.d(TAG, "[USB] Before create audiorecord instance: has no PackageManager.FEATURE_MICROPHONE");
        }
        try {
            AudioRecord audioRecord2 = new AudioRecord(this.audioSource, i10, channelCountToConfiguration, 2, i15);
            this.audioRecord = audioRecord2;
            if (audioRecord2.getState() == 1) {
                WebRtcAudioEffects webRtcAudioEffects = this.effects;
                if (webRtcAudioEffects != null) {
                    webRtcAudioEffects.enable(this.audioRecord.getAudioSessionId());
                }
                logMainParameters();
                logMainParametersExtended();
                registerRoutingListener();
                return i13;
            }
            if (("Failed to create a new AudioRecord instance: instance= " + this.audioRecord) == null) {
                str = "null";
            } else {
                str = "success state = " + this.audioRecord.getState();
            }
            reportWebRtcAudioRecordInitError(str);
            releaseAudioResources();
            return -1;
        } catch (IllegalArgumentException e10) {
            reportWebRtcAudioRecordInitError("AudioRecord ctor error: " + e10.getMessage());
            releaseAudioResources();
            return -1;
        }
    }

    private void logMainParameters() {
        Logging.d(TAG, "AudioRecord: session ID: " + this.audioRecord.getAudioSessionId() + ", channels: " + this.audioRecord.getChannelCount() + ", sample rate: " + this.audioRecord.getSampleRate());
    }

    @TargetApi(23)
    private void logMainParametersExtended() {
        if (WebRtcAudioUtils.runningOnMarshmallowOrHigher()) {
            Logging.d(TAG, "AudioRecord: buffer size in frames: " + this.audioRecord.getBufferSizeInFrames());
        }
    }

    private native void nativeCacheDirectBufferAddress(ByteBuffer byteBuffer, long j10);

    /* JADX INFO: Access modifiers changed from: private */
    public native void nativeDataIsRecorded(int i10, int i11, long j10);

    @CalledByNative
    private boolean releaseAudioResources() {
        Logging.d(TAG, "record releaseAudioResources");
        boolean z10 = false;
        try {
            WebRtcAudioEffects webRtcAudioEffects = this.effects;
            if (webRtcAudioEffects != null) {
                webRtcAudioEffects.release();
                z10 = true;
            }
            AudioRecord audioRecord = this.audioRecord;
            if (audioRecord == null) {
                return z10;
            }
            audioRecord.release();
            this.audioRecord = null;
            return true;
        } catch (Exception e10) {
            Logging.w(TAG, "releaseAudioResources e: " + e10.getMessage());
            return z10;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void reportWebRtcAudioRecordError(String str) {
        Logging.e(TAG, "Run-time recording error: " + str);
        WebRtcAudioUtils.logAudioState(TAG);
        WebRtcAudioRecordErrorCallback webRtcAudioRecordErrorCallback = errorCallback;
        if (webRtcAudioRecordErrorCallback != null) {
            webRtcAudioRecordErrorCallback.onWebRtcAudioRecordError(str);
        }
    }

    private void reportWebRtcAudioRecordInitError(String str) {
        Logging.e(TAG, "Init recording error: " + str);
        WebRtcAudioUtils.logAudioState(TAG);
        WebRtcAudioRecordErrorCallback webRtcAudioRecordErrorCallback = errorCallback;
        if (webRtcAudioRecordErrorCallback != null) {
            webRtcAudioRecordErrorCallback.onWebRtcAudioRecordInitError(str);
        }
    }

    private void reportWebRtcAudioRecordStartError(AudioRecordStartErrorCode audioRecordStartErrorCode, String str) {
        Logging.e(TAG, "Start recording error: " + audioRecordStartErrorCode + ". " + str);
        WebRtcAudioUtils.logAudioState(TAG);
        WebRtcAudioRecordErrorCallback webRtcAudioRecordErrorCallback = errorCallback;
        if (webRtcAudioRecordErrorCallback != null) {
            webRtcAudioRecordErrorCallback.onWebRtcAudioRecordStartError(audioRecordStartErrorCode, str);
        }
    }

    public static void setErrorCallback(WebRtcAudioRecordErrorCallback webRtcAudioRecordErrorCallback) {
        Logging.d(TAG, "Set error callback");
        errorCallback = webRtcAudioRecordErrorCallback;
    }

    public static void setMicrophoneMute(boolean z10) {
        Logging.w(TAG, "setMicrophoneMute(" + z10 + ")");
        microphoneMute = z10;
    }

    public static void setOnAudioSamplesReady(WebRtcAudioRecordSamplesReadyCallback webRtcAudioRecordSamplesReadyCallback) {
        audioSamplesReadyCallback = webRtcAudioRecordSamplesReadyCallback;
    }

    public static void setRecordRouteCallback(AudioRecordRouteCallback audioRecordRouteCallback) {
        Logging.d(TAG, "[USB] Set AudioRecordRouteCallback");
        recordRouteCallback = audioRecordRouteCallback;
    }

    @CalledByNative
    private int startRecording() {
        Logging.d(TAG, "startRecording");
        assertTrue(this.audioRecord != null);
        assertTrue(this.audioThread == null);
        try {
            this.audioRecord.startRecording();
            int recordingState = this.audioRecord.getRecordingState();
            if (recordingState == 3) {
                this.mFramesRead = 0L;
                this.mLatencyCalcCount = 3;
                AudioRecordThread audioRecordThread = new AudioRecordThread("AudioRecordJavaThread");
                this.audioThread = audioRecordThread;
                audioRecordThread.start();
                return this.audioRecord.getAudioSessionId();
            }
            releaseAudioResources();
            reportWebRtcAudioRecordStartError(AudioRecordStartErrorCode.AUDIO_RECORD_START_STATE_MISMATCH, "AudioRecord.startRecording failed - incorrect state :" + recordingState);
            return -1;
        } catch (IllegalStateException e10) {
            releaseAudioResources();
            reportWebRtcAudioRecordStartError(AudioRecordStartErrorCode.AUDIO_RECORD_START_EXCEPTION, "AudioRecord.startRecording failed: " + e10.getMessage());
            return -1;
        }
    }

    @CalledByNative
    private boolean stopRecording() {
        AudioRecordRoutingListener audioRecordRoutingListener;
        Logging.d(TAG, "stopRecording");
        AudioRecordThread audioRecordThread = this.audioThread;
        if (audioRecordThread != null) {
            audioRecordThread.stopThread();
            if (!ThreadUtils.joinUninterruptibly(this.audioThread, AUDIO_RECORD_THREAD_JOIN_TIMEOUT_MS)) {
                Logging.e(TAG, "Join of AudioRecordJavaThread timed out");
                WebRtcAudioUtils.logAudioState(TAG);
            }
            this.audioThread = null;
        }
        AudioRecord audioRecord = this.audioRecord;
        if (audioRecord == null || (audioRecordRoutingListener = this.recordRouteListener) == null) {
            return true;
        }
        audioRecord.removeOnRoutingChangedListener(audioRecordRoutingListener);
        return true;
    }

    public void registerRoutingListener() {
        AudioRecordRouteCallback audioRecordRouteCallback;
        int i10 = Build.VERSION.SDK_INT;
        AudioDeviceInfo preferredDevice = this.audioRecord.getPreferredDevice();
        if (preferredDevice != null) {
            Logging.d(TAG, "[USB] deviceType = " + preferredDevice.getType());
        } else {
            Logging.d(TAG, "[USB] has no preferred device");
            preferredDevice = this.audioRecord.getRoutedDevice();
            if (preferredDevice != null) {
                Logging.d(TAG, "[USB] initRecording-getRoutedDevice deviceType = " + preferredDevice.getType());
            }
        }
        if (preferredDevice != null && (audioRecordRouteCallback = recordRouteCallback) != null) {
            audioRecordRouteCallback.onAudioRecordRouteNotify(0, preferredDevice);
        }
        Logging.d(TAG, "android.os.Build.VERSION.SDK_INT = " + i10);
        AudioRecordRoutingListener audioRecordRoutingListener = this.recordRouteListener;
        if (audioRecordRoutingListener != null) {
            this.audioRecord.addOnRoutingChangedListener(audioRecordRoutingListener, (Handler) null);
        }
    }

    @CalledByNative
    public synchronized int setAudioSource(int i10) {
        Logging.w(TAG, "Audio source is changed from: " + this.audioSource + " to " + i10);
        this.audioSource = i10;
        return 0;
    }

    public class AudioRecordRoutingListenerForAPI23 implements AudioRecord.OnRoutingChangedListener {
        private AudioRecordRoutingListenerForAPI23() {
        }

        @Override // android.media.AudioRecord.OnRoutingChangedListener
        public void onRoutingChanged(AudioRecord audioRecord) {
            AudioDeviceInfo preferredDevice = audioRecord.getPreferredDevice();
            int type = preferredDevice != null ? preferredDevice.getType() : -1;
            AudioDeviceInfo routedDevice = audioRecord.getRoutedDevice();
            if (routedDevice != null && type == -1) {
                type = routedDevice.getType();
            }
            if (routedDevice != null && WebRtcAudioRecord.recordRouteCallback != null) {
                WebRtcAudioRecord.recordRouteCallback.onAudioRecordRouteNotify(1, routedDevice);
            }
            Logging.d(WebRtcAudioRecord.TAG, "[USB] [AudioRecord-audioRecord] onRoutingChanged:" + type);
        }

        @Override // android.media.AudioRecord.OnRoutingChangedListener, android.media.AudioRouting.OnRoutingChangedListener
        public void onRoutingChanged(AudioRouting audioRouting) {
            AudioDeviceInfo preferredDevice = audioRouting.getPreferredDevice();
            int type = preferredDevice != null ? preferredDevice.getType() : -1;
            AudioDeviceInfo routedDevice = audioRouting.getRoutedDevice();
            if (routedDevice != null && type == -1) {
                type = routedDevice.getType();
            }
            if (routedDevice != null && WebRtcAudioRecord.recordRouteCallback != null) {
                WebRtcAudioRecord.recordRouteCallback.onAudioRecordRouteNotify(1, routedDevice);
            }
            WebRtcAudioRecord.this.mLatencyCalcCount = 3;
            Logging.d(WebRtcAudioRecord.TAG, "[USB] [AudioRecord-audioRouting] onRoutingChanged: " + type);
        }
    }
}
