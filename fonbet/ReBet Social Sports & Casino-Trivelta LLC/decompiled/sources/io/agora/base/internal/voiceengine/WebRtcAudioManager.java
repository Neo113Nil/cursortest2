package io.agora.base.internal.voiceengine;

import android.annotation.SuppressLint;
import android.annotation.TargetApi;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.media.AudioAttributes;
import android.media.AudioManager;
import android.media.AudioManager$OnModeChangedListener;
import android.media.AudioRecord;
import android.media.AudioRecordingConfiguration;
import android.media.AudioTrack;
import android.os.Build;
import com.twilio.voice.AudioFormat;
import io.agora.base.internal.CalledByNative;
import io.agora.base.internal.ContextUtils;
import io.agora.base.internal.Logging;
import io.agora.base.internal.voiceengine.earmonitor.HardwareEarMonitorController;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Executor;

/* loaded from: classes2.dex */
public class WebRtcAudioManager {
    private static final int BITS_PER_SAMPLE = 16;
    private static final boolean DEBUG = false;
    private static final int DEFAULT_FRAME_PER_BUFFER = 256;
    private static final String TAG = "WebRtcAudioManager";
    private static final boolean blacklistDeviceForAAudioUsage = true;

    @TargetApi(24)
    private static AudioRecordingCallbackImpl mRecordingCallback;
    private static AudioManager mockedAudioManager;
    private final AudioManager audioManager;
    private HardwareEarMonitorController mHardwareEarMonitorController;

    @TargetApi(31)
    private ModeChangedListenerImpl modeChangedListener;
    private final long nativeAudioManager;
    private int nativeChannels;
    private int nativeSampleRate;
    private final Object recorderCallbackLock = new Object();
    private AudioAttributes custAudioAttr = null;
    private boolean initialized = false;
    private boolean mNeedUpdateVolume = false;
    private int mNativeAudioMode = 0;
    private int mSystemAudioMode = -2;
    private VolumeChangeReceiver mVolumeChangeReceiver = null;
    private int playoutVolume = 0;

    @TargetApi(24)
    public class AudioRecordingCallbackImpl extends AudioManager.AudioRecordingCallback {
        private WeakReference<WebRtcAudioManager> mWebRtcAudioManager;

        public AudioRecordingCallbackImpl() {
            Logging.d(WebRtcAudioManager.TAG, "AudioRecordingCallbackImpl ctor " + this);
        }

        @Override // android.media.AudioManager.AudioRecordingCallback
        public void onRecordingConfigChanged(List<AudioRecordingConfiguration> list) {
            WebRtcAudioManager webRtcAudioManager = this.mWebRtcAudioManager.get();
            Logging.d(WebRtcAudioManager.TAG, "onRecordingConfigChanged " + list.size());
            if (webRtcAudioManager == null) {
                return;
            }
            synchronized (webRtcAudioManager.recorderCallbackLock) {
                try {
                    if (!webRtcAudioManager.initialized) {
                        Logging.w(WebRtcAudioManager.TAG, "dont handle recording callback when destroy!");
                        return;
                    }
                    super.onRecordingConfigChanged(list);
                    Iterator<AudioRecordingConfiguration> it = list.iterator();
                    while (it.hasNext()) {
                        Logging.d(WebRtcAudioManager.TAG, " recording client session ID: " + it.next().getClientAudioSessionId());
                    }
                    webRtcAudioManager.nativeNotifyRecordingStateChanged(list.size(), webRtcAudioManager.nativeAudioManager);
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }

        public int registerRtcAudioManager(WebRtcAudioManager webRtcAudioManager) {
            this.mWebRtcAudioManager = new WeakReference<>(webRtcAudioManager);
            return 0;
        }
    }

    public class DelayVolumeTask implements Runnable {
        private VolumeChangeReceiver volumeChangeReceiver;

        public DelayVolumeTask(VolumeChangeReceiver volumeChangeReceiver) {
            this.volumeChangeReceiver = volumeChangeReceiver;
        }

        @Override // java.lang.Runnable
        public void run() {
            VolumeChangeReceiver volumeChangeReceiver;
            try {
                Context applicationContext = ContextUtils.getApplicationContext();
                if (applicationContext != null && (volumeChangeReceiver = this.volumeChangeReceiver) != null) {
                    applicationContext.unregisterReceiver(volumeChangeReceiver);
                    Logging.d(WebRtcAudioManager.TAG, "unregister volume change receiver " + this.volumeChangeReceiver);
                }
            } catch (Exception e10) {
                Logging.e(WebRtcAudioManager.TAG, "unregister VolumeChangeReceiver failed ", e10);
            }
        }
    }

    @TargetApi(31)
    public static class ModeChangedListenerImpl implements AudioManager$OnModeChangedListener {
        private final WeakReference<WebRtcAudioManager> mWebRtcAudioManager;

        public ModeChangedListenerImpl(WebRtcAudioManager webRtcAudioManager) {
            this.mWebRtcAudioManager = new WeakReference<>(webRtcAudioManager);
        }

        public void onModeChanged(int i10) {
            WebRtcAudioManager webRtcAudioManager = this.mWebRtcAudioManager.get();
            if (webRtcAudioManager == null) {
                return;
            }
            Logging.d(WebRtcAudioManager.TAG, "onModeChanged: " + i10);
            webRtcAudioManager.updateAudioModeIfNeeded(i10);
        }
    }

    public static class VolumeChangeReceiver extends BroadcastReceiver {
        private WeakReference<WebRtcAudioManager> mWebRtcAudioManager;

        public VolumeChangeReceiver(WebRtcAudioManager webRtcAudioManager) {
            this.mWebRtcAudioManager = new WeakReference<>(webRtcAudioManager);
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            WebRtcAudioManager webRtcAudioManager = this.mWebRtcAudioManager.get();
            if (webRtcAudioManager == null) {
                return;
            }
            webRtcAudioManager.updatePlayoutVolumeChange(true);
        }
    }

    @CalledByNative
    public WebRtcAudioManager(long j10, int i10, boolean z10) {
        Executor mainExecutor;
        this.modeChangedListener = null;
        Logging.d(TAG, "ctor" + WebRtcAudioUtils.getThreadInfo() + ", this " + this);
        this.nativeAudioManager = j10;
        StringBuilder sb2 = new StringBuilder();
        sb2.append("bufferPeriodMs is: ");
        sb2.append(i10);
        Logging.w(TAG, sb2.toString());
        AudioManager audioManager = mockedAudioManager;
        if (audioManager != null) {
            this.audioManager = audioManager;
        } else {
            this.audioManager = (AudioManager) ContextUtils.getApplicationContext().getSystemService("audio");
        }
        Context applicationContext = ContextUtils.getApplicationContext();
        int i11 = Build.VERSION.SDK_INT;
        if (applicationContext != null) {
            if (mRecordingCallback == null) {
                AudioRecordingCallbackImpl audioRecordingCallbackImpl = new AudioRecordingCallbackImpl();
                mRecordingCallback = audioRecordingCallbackImpl;
                this.audioManager.registerAudioRecordingCallback(audioRecordingCallbackImpl, null);
            }
            mRecordingCallback.registerRtcAudioManager(this);
        }
        this.mHardwareEarMonitorController = new HardwareEarMonitorController(z10);
        if (i11 >= 31) {
            try {
                this.modeChangedListener = new ModeChangedListenerImpl(this);
                if (applicationContext != null) {
                    AudioManager audioManager2 = this.audioManager;
                    mainExecutor = applicationContext.getMainExecutor();
                    audioManager2.addOnModeChangedListener(mainExecutor, this.modeChangedListener);
                    updateAudioModeIfNeeded(getAudioMode());
                }
            } catch (Exception e10) {
                Logging.e(TAG, "Failed to addOnModeChangedListener", e10);
            }
        }
        Logging.w(TAG, "ctor finish");
    }

    private static void assertTrue(boolean z10) {
        if (!z10) {
            throw new AssertionError("Expected condition to be true");
        }
    }

    @CalledByNative
    private boolean checkRecordingPermission() {
        Context applicationContext = ContextUtils.getApplicationContext();
        return applicationContext == null || applicationContext.checkSelfPermission("android.permission.RECORD_AUDIO") == 0;
    }

    @CalledByNative
    private void dispose() {
        ModeChangedListenerImpl modeChangedListenerImpl;
        Logging.d(TAG, "dispose" + WebRtcAudioUtils.getThreadInfo());
        if (this.initialized) {
            this.mHardwareEarMonitorController.terminate();
            enableChatMode(false);
            int i10 = Build.VERSION.SDK_INT;
            AudioRecordingCallbackImpl audioRecordingCallbackImpl = mRecordingCallback;
            if (audioRecordingCallbackImpl != null) {
                audioRecordingCallbackImpl.registerRtcAudioManager(null);
            }
            if (i10 >= 31 && (modeChangedListenerImpl = this.modeChangedListener) != null) {
                try {
                    this.audioManager.removeOnModeChangedListener(modeChangedListenerImpl);
                    updateAudioModeIfNeeded(-2);
                } catch (Exception e10) {
                    Logging.e(TAG, "Failed to removeOnModeChangedListener", e10);
                }
            }
            synchronized (this.recorderCallbackLock) {
                this.initialized = false;
            }
        }
    }

    @CalledByNative
    private boolean enableChatMode(boolean z10) {
        assertTrue(this.audioManager != null);
        int i10 = z10 ? 3 : 0;
        this.mNativeAudioMode = i10;
        try {
            Logging.d(TAG, "set audio mode to: " + WebRtcAudioUtils.modeToString(i10) + " curr: " + WebRtcAudioUtils.modeToString(this.audioManager.getMode()));
            this.audioManager.setMode(i10);
        } catch (Exception e10) {
            Logging.e(TAG, "audioManager.setMode failed: " + e10.getMessage());
        }
        return true;
    }

    private int getAudioMode() {
        AudioManager audioManager = this.audioManager;
        if (audioManager == null) {
            return 0;
        }
        try {
            return audioManager.getMode();
        } catch (Exception e10) {
            Logging.e(TAG, "get audio mode failed ", e10);
            return 0;
        }
    }

    private int getBufferSizeByPeriod(int i10, int i11) {
        return (i10 / 1000) * i11;
    }

    @CalledByNative
    private int getCallState() {
        if (mockedAudioManager == null) {
            return getAudioMode();
        }
        Logging.d(TAG, "mock call state: " + mockedAudioManager.getRingerMode());
        return mockedAudioManager.getRingerMode();
    }

    @CalledByNative
    private int getCurrentPlayoutDevices() {
        int i10 = 0;
        try {
            i10 = ((Integer) AudioManager.class.getMethod("getDevicesForStream", Integer.TYPE).invoke(this.audioManager, Integer.valueOf(getStreamType()))).intValue();
            Logging.d(TAG, "get current playout devices: " + i10);
            return i10;
        } catch (Exception e10) {
            Logging.e(TAG, "Error getDevicesForStream! ", e10);
            return i10;
        }
    }

    private int getLowLatencyInputFramesPerBuffer() {
        assertTrue(isLowLatencyInputSupported());
        return getLowLatencyOutputFramesPerBuffer();
    }

    @TargetApi(17)
    private int getLowLatencyOutputFramesPerBuffer() {
        String property;
        assertTrue(isLowLatencyOutputSupported());
        if (WebRtcAudioUtils.runningOnJellyBeanMR1OrHigher() && (property = this.audioManager.getProperty("android.media.property.OUTPUT_FRAMES_PER_BUFFER")) != null) {
            return Integer.parseInt(property);
        }
        return 256;
    }

    private static int getMinInputFrameSize(int i10, int i11) {
        return AudioRecord.getMinBufferSize(i10, i11 == 1 ? 16 : 12, 2) / (i11 * 2);
    }

    private static int getMinOutputFrameSize(int i10, int i11) {
        return AudioTrack.getMinBufferSize(i10, i11 == 1 ? 4 : 12, 2) / (i11 * 2);
    }

    private int getNativeOutputSampleRate() {
        if (WebRtcAudioUtils.runningOnEmulator()) {
            Logging.d(TAG, "Running emulator, overriding sample rate to 8 kHz.");
            return AudioFormat.AUDIO_SAMPLE_RATE_8000;
        }
        if (WebRtcAudioUtils.isDefaultSampleRateOverridden()) {
            Logging.d(TAG, "Default sample rate is overriden to " + WebRtcAudioUtils.getDefaultSampleRateHz() + " Hz");
            return WebRtcAudioUtils.getDefaultSampleRateHz();
        }
        int sampleRateOnJellyBeanMR10OrHigher = WebRtcAudioUtils.runningOnJellyBeanMR1OrHigher() ? getSampleRateOnJellyBeanMR10OrHigher() : WebRtcAudioUtils.getDefaultSampleRateHz();
        Logging.d(TAG, "Sample rate is set to " + sampleRateOnJellyBeanMR10OrHigher + " Hz");
        return sampleRateOnJellyBeanMR10OrHigher;
    }

    @TargetApi(17)
    private int getSampleRateOnJellyBeanMR10OrHigher() {
        String property = this.audioManager.getProperty("android.media.property.OUTPUT_SAMPLE_RATE");
        return property == null ? WebRtcAudioUtils.getDefaultSampleRateHz() : Integer.parseInt(property);
    }

    private int getStreamType() {
        return this.mNativeAudioMode == 3 ? 0 : 3;
    }

    private boolean hasEarpiece() {
        return ContextUtils.getApplicationContext().getPackageManager().hasSystemFeature("android.hardware.telephony");
    }

    @CalledByNative
    private boolean init() {
        Logging.d(TAG, "init" + WebRtcAudioUtils.getThreadInfo());
        if (this.initialized) {
            return true;
        }
        this.mHardwareEarMonitorController.initialize();
        this.initialized = true;
        return true;
    }

    private boolean isAAudioSupported() {
        Logging.w(TAG, "AAudio support is currently disabled on all devices!");
        return false;
    }

    private static boolean isAcousticEchoCancelerSupported() {
        return WebRtcAudioEffects.canUseAcousticEchoCanceler();
    }

    @CalledByNative
    private boolean isCommunicationModeEnabled() {
        return getAudioMode() == 3;
    }

    private boolean isLowLatencyOutputSupported() {
        return ContextUtils.getApplicationContext().getPackageManager().hasSystemFeature("android.hardware.audio.low_latency");
    }

    private static boolean isNoiseSuppressorSupported() {
        return WebRtcAudioEffects.canUseNoiseSuppressor();
    }

    @TargetApi(23)
    private boolean isProAudioSupported() {
        return WebRtcAudioUtils.runningOnMarshmallowOrHigher() && ContextUtils.getApplicationContext().getPackageManager().hasSystemFeature("android.hardware.audio.pro");
    }

    @SuppressLint({"NewApi"})
    private boolean isVolumeFixed() {
        if (WebRtcAudioUtils.runningOnLollipopOrHigher()) {
            return this.audioManager.isVolumeFixed();
        }
        return false;
    }

    @CalledByNative
    private boolean monitorPlayoutVolumeChange(boolean z10) {
        Logging.d(TAG, "monitorPlayoutVolumeChange monitor: " + z10);
        Context applicationContext = ContextUtils.getApplicationContext();
        if (applicationContext != null && mockedAudioManager == null) {
            if (z10) {
                int streamType = getStreamType();
                int streamVolume = this.audioManager.getStreamVolume(streamType);
                if (this.mVolumeChangeReceiver == null) {
                    try {
                        this.mVolumeChangeReceiver = new VolumeChangeReceiver(this);
                        IntentFilter intentFilter = new IntentFilter();
                        intentFilter.addAction("android.media.VOLUME_CHANGED_ACTION");
                        applicationContext.registerReceiver(this.mVolumeChangeReceiver, intentFilter);
                        notifyPlayoutVolumeChange(streamVolume, streamType);
                        Logging.d(TAG, "register volume change receiver " + this.mVolumeChangeReceiver);
                        return true;
                    } catch (Exception e10) {
                        Logging.e(TAG, "Unable to create VolumeChangeReceiver, ", e10);
                    }
                }
                return false;
            }
            try {
                if (this.mVolumeChangeReceiver != null) {
                    new Thread(new DelayVolumeTask(this.mVolumeChangeReceiver)).start();
                    this.mVolumeChangeReceiver = null;
                }
                return true;
            } catch (Exception e11) {
                Logging.e(TAG, "unregister VolumeChangeReceiver failed ", e11);
            }
        }
        return false;
    }

    private native void nativeNotifyAudioModeChanged(int i10, long j10);

    private native void nativeNotifyPlayoutVolumeChange(int i10, long j10);

    /* JADX INFO: Access modifiers changed from: private */
    public native void nativeNotifyRecordingStateChanged(int i10, long j10);

    private void notifyPlayoutVolumeChange(int i10, int i11) {
        if (this.playoutVolume == i10) {
            return;
        }
        this.playoutVolume = i10;
        int streamMaxVolume = this.audioManager.getStreamMaxVolume(i11);
        if (streamMaxVolume != 0) {
            i10 = (int) ((i10 / streamMaxVolume) * 255.0f);
        }
        nativeNotifyPlayoutVolumeChange(i10, this.nativeAudioManager);
        Logging.d(TAG, "notifyPlayoutVolumeChange: " + i10);
    }

    @CalledByNative
    private int setAudioAttrCtx(AudioAttributes audioAttributes) {
        if (audioAttributes == null) {
            return 0;
        }
        Logging.d(TAG, "audioAttr " + audioAttributes.toString());
        this.custAudioAttr = audioAttributes;
        return 0;
    }

    public static void setMockedAudioManager(AudioManager audioManager) {
        mockedAudioManager = audioManager;
    }

    @CalledByNative
    private boolean setStreamVolume(int i10) {
        Logging.d(TAG, "setStreamVolume(" + i10 + ")");
        assertTrue(this.audioManager != null);
        if (isVolumeFixed()) {
            Logging.e(TAG, "The device implements a fixed volume policy.");
            return false;
        }
        this.audioManager.setStreamVolume(getStreamType(), i10, 0);
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void updateAudioModeIfNeeded(int i10) {
        if (this.mSystemAudioMode == i10) {
            return;
        }
        this.mSystemAudioMode = i10;
        nativeNotifyAudioModeChanged(i10, this.nativeAudioManager);
        Logging.d(TAG, "notify audio mode changed: " + i10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void updatePlayoutVolumeChange(boolean z10) {
        this.mNeedUpdateVolume = z10;
    }

    @CalledByNative
    private boolean updatePlayoutVolumeIfNeeded() {
        if (!this.mNeedUpdateVolume) {
            return false;
        }
        int streamType = getStreamType();
        int streamVolume = this.audioManager.getStreamVolume(streamType);
        notifyPlayoutVolumeChange(streamVolume, streamType);
        this.mNeedUpdateVolume = false;
        Logging.d(TAG, "playout volume is update to " + streamVolume + ", type " + streamType);
        return true;
    }

    @CalledByNative
    public int enableHardwareEarMonitor(boolean z10) {
        return this.mHardwareEarMonitorController.enableHardwareEarMonitor(z10);
    }

    public AudioAttributes getCustAudioAttrCtx() {
        return this.custAudioAttr;
    }

    @CalledByNative
    public boolean isHardwareEarMonitorSupported() {
        return this.mHardwareEarMonitorController.isHardwareEarMonitorSupported();
    }

    public boolean isLowLatencyInputSupported() {
        return WebRtcAudioUtils.runningOnLollipopOrHigher() && isLowLatencyOutputSupported();
    }

    @CalledByNative
    public int setHardwareEarMonitorVolume(int i10) {
        return this.mHardwareEarMonitorController.setHardwareEarMonitorVolume(i10);
    }
}
