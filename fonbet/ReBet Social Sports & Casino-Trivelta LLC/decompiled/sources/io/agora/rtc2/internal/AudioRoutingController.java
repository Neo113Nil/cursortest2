package io.agora.rtc2.internal;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.media.AudioDeviceInfo;
import android.media.AudioManager;
import android.os.Build;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import android.util.SparseIntArray;
import androidx.annotation.NonNull;
import io.agora.base.internal.CalledByNative;
import io.agora.base.internal.ThreadUtils;
import io.agora.base.internal.voiceengine.WebRtcAudioRecord;
import io.agora.base.internal.voiceengine.WebRtcAudioTrack;
import io.agora.rtc2.Constants;
import io.agora.utils2.internal.Logging;
import java.lang.ref.WeakReference;

/* loaded from: classes3.dex */
public class AudioRoutingController {
    public static final int AUDIO_DEVICE_EVENT_FALLBACK_TO_A2DP = 4;
    private static final int BLUETOOTH_SCO_TIMEOUT_MS = 3000;
    private static final int BT_SCO_STATE_CONNECTED = 1;
    private static final int BT_SCO_STATE_CONNECTING = 0;
    private static final int BT_SCO_STATE_DISCONNECTED = 3;
    private static final int BT_SCO_STATE_DISCONNECTING = 2;
    public static final int CMD_FORCE_TO_A2DP = 16;
    public static final int CMD_FORCE_TO_SPEAKER = 11;
    public static final int CMD_SET_DEFAULT_ROUTING = 10;
    private static final int CMD_SET_PREFER_ROUTING = 25;
    private static final int CMD_SET_ROUTING_FREEZE = 26;
    public static final int CMD_START_BT_SCO = 15;
    public static final int DEVICE_EVT_BT_OFF = 0;
    public static final int DEVICE_EVT_BT_RECONNECT = 1;
    public static final int DEVICE_OUTPUT_OUT_IP = 8388608;
    public static final int DEVICE_OUT_AUX_DIGITAL = 1024;
    public static final int DEVICE_OUT_BLUETOOTH_A2DP = 128;
    public static final int DEVICE_OUT_BLUETOOTH_A2DP_HEADPHONES = 256;
    public static final int DEVICE_OUT_BLUETOOTH_A2DP_SPEAKER = 512;
    public static final int DEVICE_OUT_EARPIECE = 1;
    public static final int DEVICE_OUT_SPEAKER = 2;
    public static final int DEVICE_OUT_USB_DEVICE = 16384;
    public static final int DEVICE_OUT_USB_HEADSET = 67108864;
    public static final int DEVICE_OUT_WIRED_HEADPHONE = 8;
    public static final int DEVICE_OUT_WIRED_HEADSET = 4;
    private static final int ERROR = 4;
    private static final int EVT_BT_HEADSET = 2;
    private static final int EVT_BT_HEADSET_RECONNECT = 23;
    private static final int EVT_BT_SCO = 3;
    public static final int EVT_CHANNEL_PROFILE = 20;
    public static final int EVT_ENGINE_ROLE_CHANGED = 21;
    private static final int EVT_HDMI = 6;
    private static final int EVT_HEADSET = 1;
    public static final int EVT_PHONE_STATE_CHANGED = 22;
    private static final int EVT_USB = 4;
    private static final int EVT_USB_HEADSET = 5;
    private static final int MAX_SCO_CONNECT_ATTEMPS = 2;
    public static final int OFF = 0;
    public static final int ON = 1;
    private static final int PHONE_STATE_MONITOR_TIMEOUT_MS = 2000;
    private static final SparseIntArray ROUTE_TYPE_TO_EVT;
    public static final int SDK_INT_FOR_DEVICE_INVENTORY = 23;
    private static final int START = 1;
    private static final int STOP = 2;
    private static final String TAG = "AudioRoute";
    private static final int UNINIT = 0;
    public static final int UNSET = -1;
    private static AudioDeviceChangedSpecialMonitor deviceSpecialMonitor = null;
    private static boolean mockBlueToothEnable = false;
    private static AudioManager mockedAudioManager;
    private static MockedBroadcaseter mockedBroadcaster;
    private AudioDeviceInventory mAudioDeviceInventory;
    private final WeakReference<Context> mContext;
    private EventHandler mEventHandler;
    private long mNativeHandle;
    private int mScoConnectionAttemps;
    private ControllerState mState;
    private boolean mIsWiredHeadsetPlugged = false;
    private int mHeadsetType = -1;
    private boolean mIsBTHeadsetPlugged = false;
    private int ROUTING_ATTR_SPEAKER_SWITCH_SUPPORT = 1;
    private int mCurrentRouting = -1;
    private int mDefaultRouting = 3;
    private int mForcedRouting = -1;
    private int mChannelProfile = -1;
    private int mEngineRole = -1;
    private boolean mPhoneInCall = false;
    private int mSpeakerCommVolume = -1;
    private int mForceUseA2dp = -1;
    private int mBtScoState = 3;
    private boolean mIsBTScoStarted = false;
    private int dynamic_timeout = BLUETOOTH_SCO_TIMEOUT_MS;
    private boolean mIsFreezed = false;
    private ControllerStopState mStopState = null;
    private ControllerStartState mStartState = null;
    private ControllerErrorState mErrorState = null;
    private final Runnable bluetoothTimeoutRunnable = new Runnable() { // from class: io.agora.rtc2.internal.AudioRoutingController.1
        @Override // java.lang.Runnable
        public void run() {
            try {
                AudioRoutingController.this.bluetoothTimeout();
            } catch (Exception e10) {
                e10.printStackTrace();
            }
        }
    };
    private final Runnable scoMonitorInPhoneCallRunnable = new Runnable() { // from class: io.agora.rtc2.internal.AudioRoutingController.2
        @Override // java.lang.Runnable
        public void run() {
            try {
                AudioRoutingController.this.scoMonitorTimeout();
            } catch (Exception e10) {
                e10.printStackTrace();
            }
        }
    };
    private ControllerAudioDeviceChangeCallback ctrlAudioDeviceCb = null;
    private boolean mDisposed = false;
    AudioManagerScoStateReceiver mScoStateReceiver = null;

    @NonNull
    private final ThreadUtils.ThreadChecker mThreadChecker = new ThreadUtils.ThreadChecker();
    private int mVersionInUsed = 1;

    public interface AudioDeviceChangedCallback {
        void onAudioDeviceChanged(boolean z10, int i10);

        void onAudioDeviceEvent(int i10);
    }

    public class AudioDeviceChangedCallbackImpl implements AudioDeviceChangedCallback {
        private AudioDeviceChangedCallbackImpl() {
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r4v1, types: [int] */
        /* JADX WARN: Type inference failed for: r4v3 */
        /* JADX WARN: Type inference failed for: r4v4 */
        /* JADX WARN: Type inference failed for: r4v8 */
        /* JADX WARN: Type inference failed for: r5v1, types: [io.agora.rtc2.internal.AudioRoutingController] */
        /* JADX WARN: Type inference failed for: r5v2, types: [java.lang.StringBuilder] */
        @Override // io.agora.rtc2.internal.AudioRoutingController.AudioDeviceChangedCallback
        public void onAudioDeviceChanged(boolean z10, int i10) {
            String str;
            int i11 = AudioRoutingController.ROUTE_TYPE_TO_EVT.get(i10);
            if (i11 == 0) {
                str = "Not handle " + AudioRoutingController.this.getAudioRouteDesc(i10) + " device event yet!";
            } else {
                ?? r42 = z10;
                if (i10 != 5) {
                    r42 = z10 ? i10 : -1;
                }
                AudioRoutingController.this.sendEvent(i11, r42);
                str = "Device event: " + AudioRoutingController.this.evtAsString(i11) + ", arg: " + r42;
            }
            Logging.i(AudioRoutingController.TAG, str);
        }

        @Override // io.agora.rtc2.internal.AudioRoutingController.AudioDeviceChangedCallback
        public void onAudioDeviceEvent(int i10) {
            if (i10 == 0) {
                AudioRoutingController.this.cancelTimer();
                AudioRoutingController.this.cancelScoPhonestateMonitorTimer();
            } else if (i10 == 1) {
                AudioRoutingController.this.sendEvent(23, 0);
            }
        }
    }

    public interface AudioDeviceChangedSpecialMonitor {
        void AudioDeviceChangeCallback(boolean z10, AudioDeviceInfo audioDeviceInfo);

        String GetUSBDevicePID(int i10);

        String GetUSBDeviceVID(int i10);

        int GetUSBRouteType();
    }

    public interface AudioDeviceInventory {
        void dispose();

        void initialize();

        boolean isDeviceAvaliable(int i10);

        void setAudioDeviceChangeCallback(AudioDeviceChangedCallback audioDeviceChangedCallback);
    }

    public class AudioManagerScoStateReceiver extends BroadcastReceiver {
        private boolean isRegistered;

        private AudioManagerScoStateReceiver() {
            this.isRegistered = false;
        }

        public boolean getRegistered() {
            return this.isRegistered;
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            if (intent.getAction().equals("android.media.ACTION_SCO_AUDIO_STATE_UPDATED")) {
                int intExtra = intent.getIntExtra("android.media.extra.SCO_AUDIO_STATE", -99);
                Logging.i(AudioRoutingController.TAG, "Receive SCO state event, prev: " + intent.getIntExtra("android.media.extra.SCO_AUDIO_PREVIOUS_STATE", -99) + ", curr: " + intExtra);
                if (intExtra == 0) {
                    Logging.i(AudioRoutingController.TAG, "SCO state disconnected");
                    AudioRoutingController.this.sendEvent(3, 0);
                } else if (intExtra == 1) {
                    Logging.i(AudioRoutingController.TAG, "SCO state connected");
                    AudioRoutingController.this.sendEvent(3, 1);
                } else {
                    Logging.i(AudioRoutingController.TAG, "SCO device unknown event, state=" + intExtra);
                }
            }
        }

        public void setRegistered(boolean z10) {
            this.isRegistered = z10;
        }
    }

    public class ControllerAudioDeviceChangeCallback implements WebRtcAudioRecord.AudioRecordRouteCallback, WebRtcAudioTrack.AudioTrackRouteCallback {
        private ControllerAudioDeviceChangeCallback() {
        }

        @Override // io.agora.base.internal.voiceengine.WebRtcAudioRecord.AudioRecordRouteCallback
        public void onAudioRecordRouteNotify(int i10, AudioDeviceInfo audioDeviceInfo) {
            Logging.i(AudioRoutingController.TAG, "[ADM] Enter ControllerAudioDeviceChangeCallback.onAudioRecordRouteNotify");
            if (AudioRoutingController.deviceSpecialMonitor != null) {
                AudioRoutingController.deviceSpecialMonitor.AudioDeviceChangeCallback(true, audioDeviceInfo);
                AudioRoutingController.this.nativeAudioDeviceStateChanged(Integer.toString(audioDeviceInfo.getId()), audioDeviceInfo.getProductName().toString(), 1, 1);
            }
        }

        @Override // io.agora.base.internal.voiceengine.WebRtcAudioTrack.AudioTrackRouteCallback
        public void onAudioTrackRouteNotify(int i10, AudioDeviceInfo audioDeviceInfo) {
            Logging.i(AudioRoutingController.TAG, "[ADM] Enter ControllerAudioDeviceChangeCallback.onAudioTrackRouteNotify");
            if (AudioRoutingController.deviceSpecialMonitor != null) {
                AudioRoutingController.deviceSpecialMonitor.AudioDeviceChangeCallback(false, audioDeviceInfo);
                AudioRoutingController.this.sendEvent(4, AudioRoutingController.deviceSpecialMonitor.GetUSBRouteType());
            }
        }
    }

    public abstract class ControllerBaseState implements ControllerState {
        private ControllerBaseState() {
        }

        @Override // io.agora.rtc2.internal.AudioRoutingController.ControllerState
        public int getState() {
            return 0;
        }

        @Override // io.agora.rtc2.internal.AudioRoutingController.ControllerState
        public void onEvent(int i10, int i11) {
            if (i10 == 1) {
                int handleHeadsetEvent = AudioRoutingController.this.handleHeadsetEvent(i11);
                if (handleHeadsetEvent == -1) {
                    return;
                }
                AudioRoutingController.this.notifyAudioRoutingChanged(handleHeadsetEvent);
                return;
            }
            if (i10 == 2) {
                AudioRoutingController.this.notifyAudioRoutingChanged(AudioRoutingController.this.handleBluetoothHeadsetEvent(i11));
                return;
            }
            if (i10 == 4 || i10 == 5 || i10 == 6) {
                if (i11 != 6 && i11 != 7) {
                    i11 = AudioRoutingController.this.queryCurrentAudioRouting();
                }
                AudioRoutingController.this.notifyAudioRoutingChanged(i11);
                return;
            }
            if (i10 == 10) {
                AudioRoutingController.this.mDefaultRouting = i11;
                StringBuilder sb2 = new StringBuilder();
                sb2.append("User set default routing to: ");
                AudioRoutingController audioRoutingController = AudioRoutingController.this;
                sb2.append(audioRoutingController.getAudioRouteDesc(audioRoutingController.mDefaultRouting));
                Logging.i(AudioRoutingController.TAG, sb2.toString());
                return;
            }
            if (i10 != 16) {
                if (i10 == 20) {
                    AudioRoutingController.this.mChannelProfile = i11;
                    return;
                } else if (i10 == 22) {
                    AudioRoutingController.this.mPhoneInCall = i11 > 0;
                    return;
                } else {
                    if (i10 != 26) {
                        return;
                    }
                    AudioRoutingController.this.mIsFreezed = i11 > 0;
                    return;
                }
            }
            int i12 = AudioRoutingController.this.mForceUseA2dp;
            AudioRoutingController.this.mForceUseA2dp = i11 == 1 ? 1 : 0;
            StringBuilder sb3 = new StringBuilder();
            sb3.append("bluetooth protocol to: ");
            sb3.append(AudioRoutingController.this.mForceUseA2dp == 1 ? "a2dp" : "hfp");
            Logging.w(AudioRoutingController.TAG, sb3.toString());
            AudioRoutingController audioRoutingController2 = AudioRoutingController.this;
            audioRoutingController2.updateBluetoothSco(audioRoutingController2.mCurrentRouting);
            if (AudioRoutingController.this.mForceUseA2dp == i12 || AudioRoutingController.this.mCurrentRouting != 5) {
                return;
            }
            AudioRoutingController audioRoutingController3 = AudioRoutingController.this;
            audioRoutingController3.notifyAudioRoutingChanged(audioRoutingController3.mCurrentRouting);
        }

        @Override // io.agora.rtc2.internal.AudioRoutingController.ControllerState
        public void reset() {
            AudioRoutingController.this.resetAudioRouting();
        }

        @Override // io.agora.rtc2.internal.AudioRoutingController.ControllerState
        public void setState(int i10) {
            if (i10 == getState()) {
                Logging.i(AudioRoutingController.TAG, "setState: state not changed!");
            } else {
                AudioRoutingController audioRoutingController = AudioRoutingController.this;
                audioRoutingController.mState = audioRoutingController.changeState(i10);
            }
        }
    }

    public class ControllerErrorState extends ControllerBaseState {
        private ControllerErrorState() {
            super();
        }

        @Override // io.agora.rtc2.internal.AudioRoutingController.ControllerBaseState, io.agora.rtc2.internal.AudioRoutingController.ControllerState
        public int getState() {
            return 4;
        }
    }

    public class ControllerStartState extends ControllerBaseState {
        public ControllerStartState() {
            super();
            resetImpl();
            Logging.i(AudioRoutingController.TAG, "ControllerStartState ctor, default routing: " + AudioRoutingController.this.getAudioRouteDesc(AudioRoutingController.this.mDefaultRouting) + ", current routing: " + AudioRoutingController.this.getAudioRouteDesc(AudioRoutingController.this.mCurrentRouting));
        }

        private void resetImpl() {
            AudioRoutingController audioRoutingController;
            if (AudioRoutingController.this.mDefaultRouting == -1) {
                int i10 = 1;
                if (AudioRoutingController.this.mChannelProfile == 1) {
                    audioRoutingController = AudioRoutingController.this;
                    i10 = 3;
                } else {
                    audioRoutingController = AudioRoutingController.this;
                }
                audioRoutingController.mDefaultRouting = i10;
            }
            AudioRoutingController.this.mCurrentRouting = -1;
            AudioRoutingController.this.mForcedRouting = -1;
            AudioRoutingController.this.resetAudioRouting();
        }

        @Override // io.agora.rtc2.internal.AudioRoutingController.ControllerBaseState, io.agora.rtc2.internal.AudioRoutingController.ControllerState
        public int getState() {
            return 1;
        }

        @Override // io.agora.rtc2.internal.AudioRoutingController.ControllerBaseState, io.agora.rtc2.internal.AudioRoutingController.ControllerState
        public void onEvent(int i10, int i11) {
            Logging.d(AudioRoutingController.TAG, "StartState: onEvent: " + AudioRoutingController.this.evtAsString(i10) + ", info: " + i11);
            AudioManager audioManager = AudioRoutingController.this.getAudioManager();
            if (i10 == 10) {
                AudioRoutingController.this.mDefaultRouting = i11;
                StringBuilder sb2 = new StringBuilder();
                sb2.append("User set default routing to: ");
                AudioRoutingController audioRoutingController = AudioRoutingController.this;
                sb2.append(audioRoutingController.getAudioRouteDesc(audioRoutingController.mDefaultRouting));
                Logging.i(AudioRoutingController.TAG, sb2.toString());
                return;
            }
            if (i10 == 11) {
                if (AudioRoutingController.this.mCurrentRouting == 2 || AudioRoutingController.this.mCurrentRouting == 0 || AudioRoutingController.this.mCurrentRouting == 6 || AudioRoutingController.this.mCurrentRouting == 8 || AudioRoutingController.this.mCurrentRouting == 5) {
                    Logging.i(AudioRoutingController.TAG, "StartState: not proceed with force speaker event for BT/HS");
                    return;
                }
                AudioRoutingController.this.mForcedRouting = i11 == 1 ? 3 : 1;
                AudioRoutingController audioRoutingController2 = AudioRoutingController.this;
                if (i11 == 1) {
                    audioRoutingController2.doSetAudioOutputRouting(3);
                    return;
                } else {
                    audioRoutingController2.resetAudioRouting();
                    return;
                }
            }
            if (i10 == 22) {
                Logging.i(AudioRoutingController.TAG, "Phone state changed: " + i11);
                AudioRoutingController.this.mPhoneInCall = i11 > 0;
                AudioRoutingController audioRoutingController3 = AudioRoutingController.this;
                if (i11 == 0) {
                    audioRoutingController3.resetAudioRouting();
                    return;
                } else {
                    audioRoutingController3.mCurrentRouting = -1;
                    return;
                }
            }
            if (i10 == 23) {
                Logging.i(AudioRoutingController.TAG, "Try reconnect bt: ");
                if (AudioRoutingController.this.mCurrentRouting == 5) {
                    AudioRoutingController audioRoutingController4 = AudioRoutingController.this;
                    audioRoutingController4.doSetAudioOutputRouting(audioRoutingController4.mCurrentRouting);
                    return;
                }
                return;
            }
            if (i10 == 25) {
                AudioRoutingController.this.selectRoutingForCommunication(i11);
                return;
            }
            if (i10 == 26) {
                Logging.i(AudioRoutingController.TAG, "set routing freeze " + i11);
                AudioRoutingController audioRoutingController5 = AudioRoutingController.this;
                if (i11 != 0) {
                    audioRoutingController5.mIsFreezed = true;
                    return;
                } else {
                    audioRoutingController5.mIsFreezed = false;
                    AudioRoutingController.this.resetAudioRouting();
                    return;
                }
            }
            switch (i10) {
                case 1:
                    if (i11 >= 0) {
                        AudioRoutingController.this.mHeadsetType = i11;
                        AudioRoutingController.this.mIsWiredHeadsetPlugged = true;
                    } else if (audioManager == null || !audioManager.isWiredHeadsetOn()) {
                        AudioRoutingController.this.mHeadsetType = i11;
                        AudioRoutingController.this.mIsWiredHeadsetPlugged = false;
                    }
                    if (AudioRoutingController.this.mIsWiredHeadsetPlugged && AudioRoutingController.this.mCurrentRouting != i11) {
                        AudioRoutingController.this.doSetAudioOutputRouting(i11);
                        break;
                    } else {
                        AudioRoutingController.this.resetAudioRouting();
                        break;
                    }
                    break;
                case 2:
                    if (i11 != 0 || AudioRoutingController.this.mIsBTHeadsetPlugged) {
                        AudioRoutingController audioRoutingController6 = AudioRoutingController.this;
                        if (!audioRoutingController6.mAudioDeviceInventory.isDeviceAvaliable(5) && i11 != 1) {
                            r7 = false;
                        }
                        audioRoutingController6.mIsBTHeadsetPlugged = r7;
                        Logging.i(AudioRoutingController.TAG, "Process BT event, final state: " + AudioRoutingController.this.mIsBTHeadsetPlugged + "(" + i11 + ")");
                        if (!AudioRoutingController.this.mIsBTHeadsetPlugged) {
                            AudioRoutingController.this.resetAudioRouting();
                            break;
                        } else {
                            AudioRoutingController.this.doSetAudioOutputRouting(5);
                            break;
                        }
                    }
                    break;
                case 3:
                    if (AudioRoutingController.mockBlueToothEnable && audioManager != null) {
                        audioManager.setBluetoothScoOn(false);
                    }
                    AudioRoutingController.this.mBtScoState = i11 == 1 ? 1 : 2;
                    if (!AudioRoutingController.this.mPhoneInCall) {
                        if (i11 != 1) {
                            if (i11 == 0 && AudioRoutingController.this.mCurrentRouting == 5) {
                                Logging.w(AudioRoutingController.TAG, "Sco disconnect when using Bluetooth device, use a2dp: " + AudioRoutingController.this.mForceUseA2dp);
                                if (AudioRoutingController.this.mForceUseA2dp != 1 && audioManager != null) {
                                    int mode = audioManager.getMode();
                                    if (mode != 1 && mode != 2) {
                                        if (mode == 3) {
                                            Logging.w(AudioRoutingController.TAG, "Sco try reconnect");
                                            audioManager.stopBluetoothSco();
                                            AudioRoutingController.this.doStartBTSco(audioManager);
                                            AudioRoutingController.this.startTimer();
                                            break;
                                        }
                                    } else {
                                        AudioRoutingController.this.startScoPhonestateMonitorTimer();
                                        break;
                                    }
                                }
                            }
                        } else {
                            AudioRoutingController.this.mScoConnectionAttemps = 0;
                            break;
                        }
                    }
                    break;
                case 4:
                case 5:
                case 6:
                    if (i11 != 6 && i11 != 7) {
                        AudioRoutingController.this.resetAudioRouting();
                        break;
                    } else {
                        AudioRoutingController.this.doSetAudioOutputRouting(i11);
                        break;
                    }
                default:
                    super.onEvent(i10, i11);
                    break;
            }
        }

        @Override // io.agora.rtc2.internal.AudioRoutingController.ControllerBaseState, io.agora.rtc2.internal.AudioRoutingController.ControllerState
        public void reset() {
            resetImpl();
            StringBuilder sb2 = new StringBuilder();
            sb2.append("Monitor reset: default routing: ");
            AudioRoutingController audioRoutingController = AudioRoutingController.this;
            sb2.append(audioRoutingController.getAudioRouteDesc(audioRoutingController.mDefaultRouting));
            sb2.append(", current routing: ");
            AudioRoutingController audioRoutingController2 = AudioRoutingController.this;
            sb2.append(audioRoutingController2.getAudioRouteDesc(audioRoutingController2.mCurrentRouting));
            Logging.i(AudioRoutingController.TAG, sb2.toString());
        }
    }

    public interface ControllerState {
        int getState();

        void onEvent(int i10, int i11);

        void reset();

        void setState(int i10);
    }

    public class ControllerStopState extends ControllerBaseState {
        public ControllerStopState() {
            super();
            Logging.i(AudioRoutingController.TAG, "ControllerStopState ctor");
            AudioRoutingController.this.mIsBTScoStarted = false;
            AudioRoutingController.this.mCurrentRouting = -1;
        }

        private void resetImpl() {
            AudioManager audioManager;
            AudioRoutingController.this.cancelTimer();
            AudioRoutingController.this.cancelScoPhonestateMonitorTimer();
            try {
                audioManager = AudioRoutingController.this.getAudioManager();
            } catch (Exception e10) {
                Logging.e(AudioRoutingController.TAG, "resetImpl: Exception ", e10);
            }
            if (!AudioRoutingController.this.mIsBTScoStarted) {
                if (audioManager != null && audioManager.isBluetoothScoOn()) {
                }
                AudioRoutingController.this.mCurrentRouting = -1;
            }
            AudioRoutingController.this.mIsBTScoStarted = false;
            AudioRoutingController.this.stopBtSco();
            AudioRoutingController.this.mCurrentRouting = -1;
        }

        @Override // io.agora.rtc2.internal.AudioRoutingController.ControllerBaseState, io.agora.rtc2.internal.AudioRoutingController.ControllerState
        public int getState() {
            return 2;
        }

        @Override // io.agora.rtc2.internal.AudioRoutingController.ControllerBaseState, io.agora.rtc2.internal.AudioRoutingController.ControllerState
        public void onEvent(int i10, int i11) {
            Logging.d(AudioRoutingController.TAG, "StopState: onEvent: " + AudioRoutingController.this.evtAsString(i10) + ", info: " + i11);
            try {
                AudioManager audioManager = AudioRoutingController.this.getAudioManager();
                if (i10 != 11) {
                    super.onEvent(i10, i11);
                    return;
                }
                audioManager.setSpeakerphoneOn(i11 == 1);
                AudioRoutingController.this.mCurrentRouting = i11 == 1 ? 3 : -1;
                AudioRoutingController audioRoutingController = AudioRoutingController.this;
                audioRoutingController.notifyAudioRoutingChanged(audioRoutingController.queryCurrentAudioRouting());
            } catch (Exception e10) {
                Logging.e(AudioRoutingController.TAG, "onEvent: Exception ", e10);
            }
        }

        @Override // io.agora.rtc2.internal.AudioRoutingController.ControllerBaseState, io.agora.rtc2.internal.AudioRoutingController.ControllerState
        public void reset() {
            Logging.i(AudioRoutingController.TAG, "Monitor stop state, reset");
            resetImpl();
        }
    }

    public class EventHandler extends Handler {
        public EventHandler(Looper looper) {
            super(looper);
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            if (AudioRoutingController.this.mState != null) {
                AudioRoutingController.this.mState.onEvent(message.what, message.arg1);
            }
        }
    }

    public interface MockedBroadcaseter {
        void registerReceiver(BroadcastReceiver broadcastReceiver, IntentFilter intentFilter);

        void unRegisterReceiver(BroadcastReceiver broadcastReceiver);
    }

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        ROUTE_TYPE_TO_EVT = sparseIntArray;
        sparseIntArray.put(0, 1);
        sparseIntArray.put(2, 1);
        sparseIntArray.put(5, 2);
        sparseIntArray.put(6, 4);
        sparseIntArray.put(7, 6);
    }

    @CalledByNative
    public AudioRoutingController(Context context, long j10) {
        this.mContext = new WeakReference<>(context);
        this.mNativeHandle = j10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void bluetoothTimeout() {
        AudioManager audioManager = getAudioManager();
        boolean isBluetoothScoOn = audioManager != null ? audioManager.isBluetoothScoOn() : false;
        if (this.mScoConnectionAttemps >= 2) {
            Logging.e(TAG, "Start bluetooth sco timeout, actual routing: " + queryCurrentAudioRouting());
            cancelTimer();
            nativeAudioRoutingError(Constants.ERR_AUDIO_BT_SCO_FAILED);
            checkFallbackA2dpIfNeed();
            return;
        }
        Logging.i(TAG, "Attemps trying, bt sco started: " + this.mIsBTScoStarted + " sco connected: " + isBluetoothScoOn + " " + this.mScoConnectionAttemps + " times " + this.mBtScoState + "[" + btStateAsString(this.mBtScoState) + "]");
        if (isBluetoothScoOn) {
            Logging.d(TAG, "Sco connected success.");
            cancelTimer();
            return;
        }
        startTimer();
        this.mScoConnectionAttemps++;
        stopBtSco();
        audioManager.stopBluetoothSco();
        doStartBTSco(audioManager);
    }

    private String btStateAsString(int i10) {
        if (i10 == 0) {
            return "SCO_CONNECTING";
        }
        if (i10 == 1) {
            return "SCO_CONNECTED";
        }
        if (i10 == 2) {
            return "SCO_DISCONNECTING";
        }
        if (i10 == 3) {
            return "SCO_DISCONNECTED";
        }
        return "Unknown " + i10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void cancelScoPhonestateMonitorTimer() {
        Logging.d(TAG, "cancel sco monitor timer");
        this.mEventHandler.removeCallbacks(this.scoMonitorInPhoneCallRunnable);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void cancelTimer() {
        this.mScoConnectionAttemps = 0;
        Logging.d(TAG, "cancel bluetooth timer");
        this.mEventHandler.removeCallbacks(this.bluetoothTimeoutRunnable);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public ControllerState changeState(int i10) {
        if (i10 == 2) {
            ControllerStopState controllerStopState = this.mStopState;
            if (controllerStopState == null) {
                this.mStopState = new ControllerStopState();
            } else {
                controllerStopState.reset();
            }
            return this.mStopState;
        }
        if (i10 == 1) {
            ControllerStartState controllerStartState = this.mStartState;
            if (controllerStartState == null) {
                this.mStartState = new ControllerStartState();
            } else {
                controllerStartState.reset();
            }
            return this.mStartState;
        }
        ControllerErrorState controllerErrorState = this.mErrorState;
        if (controllerErrorState == null) {
            this.mErrorState = new ControllerErrorState();
        } else {
            controllerErrorState.reset();
        }
        return this.mErrorState;
    }

    private void checkFallbackA2dpIfNeed() {
        AudioManager audioManager = getAudioManager();
        if (audioManager != null && this.mIsBTHeadsetPlugged && audioManager.isBluetoothA2dpOn()) {
            nativeAudioRoutingCallbackEvent(4);
            return;
        }
        Logging.i(TAG, "could not use a2dp also..");
        this.mIsBTHeadsetPlugged = false;
        resetAudioRouting();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int doSetAudioOutputRouting(int i10) {
        Logging.i(TAG, "Set audio output routing from " + getAudioRouteDesc(this.mCurrentRouting) + " to " + getAudioRouteDesc(i10));
        if (this.mIsFreezed || this.mPhoneInCall) {
            Logging.i(TAG, "Ignore set routing, freeze " + this.mIsFreezed + ", incall " + this.mPhoneInCall);
            return 0;
        }
        try {
            AudioManager audioManager = getAudioManager();
            boolean z10 = true;
            if (audioManager != null) {
                audioManager.setSpeakerphoneOn(i10 == 3);
            }
            if (queryCurrentAudioRouting() != i10) {
                int queryCurrentAudioRouting = queryCurrentAudioRouting();
                Logging.i(TAG, "Different audio routing from target " + i10 + ", actual routing: " + queryCurrentAudioRouting + "[" + getAudioRouteDesc(queryCurrentAudioRouting) + "]");
                if (((i10 == 3 && queryCurrentAudioRouting != 3) || (i10 == 1 && queryCurrentAudioRouting != 1)) && audioManager != null && audioManager.getMode() == 3) {
                    Logging.d(TAG, "In communication mode try recover routing! ");
                    audioManager.setMode(0);
                    audioManager.setMode(3);
                    Logging.i(TAG, "Recover mode to : " + audioManager.getMode());
                    if (i10 != 3) {
                        z10 = false;
                    }
                    audioManager.setSpeakerphoneOn(z10);
                    Logging.i(TAG, "Final speaker is on : " + audioManager.isSpeakerphoneOn());
                }
            }
            updateBluetoothSco(i10);
        } catch (Exception e10) {
            Logging.e(TAG, "Set audio output routing failed:", e10);
        }
        if (i10 != this.mCurrentRouting) {
            this.mCurrentRouting = i10;
            notifyAudioRoutingChanged(i10);
            return 0;
        }
        Logging.i(TAG, "Audio routing not changed, ignore: " + i10);
        return 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void doStartBTSco(AudioManager audioManager) {
        try {
            int mode = audioManager.getMode();
            Logging.i(TAG, "doStartBTSco " + Build.VERSION.SDK_INT + " sco on: " + audioManager.isBluetoothScoOn() + " " + mode + "[" + modeAsString(mode) + "]");
            if (audioManager.isBluetoothScoOn()) {
                audioManager.stopBluetoothSco();
                Thread.sleep(600L);
                Logging.i(TAG, "doStartBTSco in sco already on, try stop old connect firstly!");
            }
            audioManager.startBluetoothSco();
        } catch (Exception e10) {
            Logging.e(TAG, "doStartBTSco fail ", e10);
        }
    }

    private void doStopBTSco(AudioManager audioManager) {
        Logging.i(TAG, "doStopBTSco " + Build.VERSION.SDK_INT + " sco on: " + audioManager.isBluetoothScoOn());
        try {
            audioManager.stopBluetoothSco();
        } catch (Exception e10) {
            e10.printStackTrace();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public String evtAsString(int i10) {
        if (i10 == 1) {
            return "EVT_HEADSET";
        }
        if (i10 == 2) {
            return "EVT_BT_HEADSET";
        }
        if (i10 == 3) {
            return "EVT_BT_SCO";
        }
        if (i10 == 4) {
            return "EVT_USB";
        }
        if (i10 == 10) {
            return "CMD_SET_DEFAULT_ROUTING";
        }
        if (i10 == 11) {
            return "CMD_FORCE_TO_SPEAKER";
        }
        if (i10 == 16) {
            return "CMD_FORCE_TO_A2DP";
        }
        if (i10 == 20) {
            return "EVT_CHANNEL_PROFILE";
        }
        if (i10 == 22) {
            return "EVT_PHONE_STATE_CHANGED";
        }
        if (i10 == 26) {
            return "CMD_SET_ROUTING_FREEZE";
        }
        return "evt " + i10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public AudioManager getAudioManager() {
        AudioManager audioManager = mockedAudioManager;
        if (audioManager != null) {
            return audioManager;
        }
        Context context = this.mContext.get();
        if (context == null) {
            return null;
        }
        return (AudioManager) context.getSystemService("audio");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public String getAudioRouteDesc(int i10) {
        switch (i10) {
            case -1:
                return "Default";
            case 0:
                return "Headset";
            case 1:
                return "Earpiece";
            case 2:
                return "HeadsetOnly";
            case 3:
                return "Speakerphone";
            case 4:
                return "Loudspeaker";
            case 5:
                return "HeadsetBluetooth";
            case 6:
                return "USBDevice";
            case 7:
            default:
                return "Unknown";
            case 8:
                return "USB_HEADSET";
        }
    }

    private int getOutputDevicesByStream(int i10) {
        try {
            return ((Integer) AudioManager.class.getMethod("getDevicesForStream", Integer.TYPE).invoke(getAudioManager(), Integer.valueOf(i10))).intValue();
        } catch (Exception e10) {
            Logging.e(TAG, "Error while getDevicesForStream! ", e10);
            return 0;
        }
    }

    private int getSdkDeviceByAndroidType(int i10) {
        if (i10 == 2) {
            return 3;
        }
        if (i10 == 4) {
            return 0;
        }
        if (i10 == 8) {
            return 2;
        }
        if (i10 == 128 || i10 == 256 || i10 == 512) {
            return 5;
        }
        if (i10 != 1024) {
            return (i10 == 16384 || i10 == 67108864 || (i10 & 8388608) != 0) ? 0 : 3;
        }
        return 7;
    }

    private String modeAsString(int i10) {
        if (i10 == 0) {
            return "MODE_NORMAL";
        }
        if (i10 == 1) {
            return "MODE_RINGTONE";
        }
        if (i10 == 2) {
            return "MODE_IN_CALL";
        }
        if (i10 == 3) {
            return "MODE_IN_COMMUNICATION";
        }
        return "Unknown " + i10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public native void nativeAudioDeviceStateChanged(String str, String str2, int i10, int i11);

    private native void nativeAudioRoutingCallbackEvent(int i10);

    private native void nativeAudioRoutingChanged(int i10);

    private native void nativeAudioRoutingError(int i10);

    /* JADX INFO: Access modifiers changed from: private */
    public void notifyAudioRoutingChanged(int i10) {
        Logging.i(TAG, "Enter notifyAudioRoutingChanged: " + i10 + ", force a2dp: " + this.mForceUseA2dp);
        if (this.mDisposed) {
            Logging.w(TAG, "notifyAudioRoutingChanged returned cause of disposed");
            return;
        }
        if (i10 == 5 && this.mForceUseA2dp == 1 && mockedBroadcaster == null) {
            AudioManager audioManager = getAudioManager();
            if (audioManager != null && !audioManager.isBluetoothA2dpOn()) {
                Logging.w(TAG, "callback A2DP but its not ready yet");
            }
            i10 = 10;
        }
        nativeAudioRoutingChanged(i10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void resetAudioRouting() {
        boolean z10 = this.mIsBTHeadsetPlugged;
        int i10 = 5;
        if (z10 && this.mIsWiredHeadsetPlugged) {
            AudioManager audioManager = getAudioManager();
            int outputDevicesByStream = getOutputDevicesByStream((audioManager == null ? 0 : audioManager.getMode()) == 0 ? 3 : 0);
            int sdkDeviceByAndroidType = getSdkDeviceByAndroidType(outputDevicesByStream);
            Logging.i(TAG, "In multidevice connect, query target: " + sdkDeviceByAndroidType + ", " + outputDevicesByStream);
            if (sdkDeviceByAndroidType == 5 || sdkDeviceByAndroidType == this.mHeadsetType || sdkDeviceByAndroidType == 6) {
                i10 = sdkDeviceByAndroidType;
            }
        } else if (!z10) {
            if (this.mIsWiredHeadsetPlugged) {
                i10 = this.mHeadsetType;
            } else {
                i10 = this.mForcedRouting;
                if (i10 == -1) {
                    i10 = this.mDefaultRouting;
                }
            }
        }
        Logging.i(TAG, "Reset audio routing, default routing: " + getAudioRouteDesc(this.mDefaultRouting) + ", current routing: " + getAudioRouteDesc(this.mCurrentRouting) + ", target routing: " + getAudioRouteDesc(i10) + ", actual system routing: " + getAudioRouteDesc(queryCurrentAudioRouting()));
        if (this.mCurrentRouting == i10 && queryCurrentAudioRouting() == this.mCurrentRouting) {
            return;
        }
        doSetAudioOutputRouting(i10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void scoMonitorTimeout() {
        AudioManager audioManager = getAudioManager();
        if (audioManager == null || this.mCurrentRouting != 5 || this.mForceUseA2dp == 1) {
            return;
        }
        int mode = audioManager.getMode();
        if (mode == 1 || mode == 2) {
            startScoPhonestateMonitorTimer();
            return;
        }
        Logging.d(TAG, "detect phone state exit, mode=" + mode + ", mForceUseA2dp=" + this.mForceUseA2dp);
        if (mode == 3) {
            audioManager.stopBluetoothSco();
            startTimer();
            startBtSco();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0054  */
    /* JADX WARN: Removed duplicated region for block: B:27:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void selectRoutingForCommunication(int i10) {
        AudioManager audioManager = getAudioManager();
        if (audioManager == null || audioManager.getMode() != 3) {
            return;
        }
        if (i10 == 1 && audioManager.isWiredHeadsetOn()) {
            return;
        }
        Logging.i(TAG, "Api select prefer communication route: " + i10);
        if (i10 != 0) {
            if (i10 != 1) {
                if (i10 != 2) {
                    if (i10 != 3) {
                        if (i10 != 5 && i10 != 6 && i10 != 8) {
                            i10 = -1;
                        }
                    }
                }
            }
            if (i10 == -1) {
                doSetAudioOutputRouting(i10);
                return;
            }
            return;
        }
        if (!this.mAudioDeviceInventory.isDeviceAvaliable(i10)) {
            Logging.w(TAG, "Selected route is not connected");
            return;
        }
        if (i10 == -1) {
        }
    }

    public static void setAudioDeviceChangedSpecialMonitor(AudioDeviceChangedSpecialMonitor audioDeviceChangedSpecialMonitor) {
        Logging.i(TAG, "setAudioDeviceChangedSpecialMonitor");
        deviceSpecialMonitor = audioDeviceChangedSpecialMonitor;
    }

    public static void setMockBlueToothEnable(boolean z10) {
        mockBlueToothEnable = z10;
    }

    public static void setMockedAudioManager(AudioManager audioManager) {
        mockedAudioManager = audioManager;
    }

    public static void setMockedBroadcaster(MockedBroadcaseter mockedBroadcaseter) {
        mockedBroadcaster = mockedBroadcaseter;
        AudioDeviceInventoryMocker.setMockedBroadcaster(mockedBroadcaseter);
    }

    private void setupHotPlugDeviceInitValue() {
        int i10 = this.mIsBTHeadsetPlugged ? 5 : this.mIsWiredHeadsetPlugged ? this.mHeadsetType : this.mAudioDeviceInventory.isDeviceAvaliable(6) ? 6 : -1;
        if (i10 != -1) {
            notifyAudioRoutingChanged(i10);
        }
    }

    private void startBtSco() {
        AudioManager audioManager = getAudioManager();
        if (audioManager != null) {
            int mode = audioManager.getMode();
            Logging.i(TAG, "Start opening bt sco " + this.mScoConnectionAttemps + " " + mode + "[" + modeAsString(mode) + "] " + this.mBtScoState + "[" + btStateAsString(this.mBtScoState) + "] sco on: " + audioManager.isBluetoothScoOn());
            this.mBtScoState = 0;
            doStartBTSco(audioManager);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void startScoPhonestateMonitorTimer() {
        Logging.d(TAG, "start sco monitor timer for phone state");
        this.mEventHandler.postDelayed(this.scoMonitorInPhoneCallRunnable, 2000L);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void startTimer() {
        this.dynamic_timeout += this.mScoConnectionAttemps * BLUETOOTH_SCO_TIMEOUT_MS;
        Logging.w(TAG, "start bluetooth timer " + this.dynamic_timeout);
        this.mEventHandler.postDelayed(this.bluetoothTimeoutRunnable, 3000L);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void stopBtSco() {
        if (this.mIsFreezed) {
            Logging.i(TAG, "stop sco ignored for freezed");
            return;
        }
        AudioManager audioManager = getAudioManager();
        if (audioManager != null) {
            int mode = audioManager.getMode();
            Logging.i(TAG, "try to stopping bt sco " + mode + "[" + modeAsString(mode) + "] " + this.mBtScoState + "[" + btStateAsString(this.mBtScoState) + "] sco on: " + audioManager.isBluetoothScoOn());
            this.mBtScoState = !audioManager.isBluetoothScoOn() ? 3 : 2;
            doStopBTSco(audioManager);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x008a, code lost:
    
        if (r5.mIsBTScoStarted != false) goto L18;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public int updateBluetoothSco(int i10) {
        if (this.mPhoneInCall) {
            Logging.d(TAG, "Not process updateBluetoothSco in call");
            return 0;
        }
        if (this.mIsFreezed) {
            Logging.i(TAG, "update bluetoosh sco ignore for freezed");
            return 0;
        }
        Logging.d(TAG, "Update sco control, current sco : " + this.mIsBTScoStarted + ", audio route target: " + i10 + "[" + getAudioRouteDesc(i10) + "] current: " + this.mCurrentRouting + "[" + getAudioRouteDesc(this.mCurrentRouting) + "]");
        if (i10 == 5) {
            if (this.mForceUseA2dp == 0) {
                Logging.i(TAG, "Enable hfp");
                this.mIsBTScoStarted = true;
                startTimer();
                startBtSco();
            } else if (this.mIsBTScoStarted) {
                Logging.i(TAG, "Enable a2dp");
                this.mIsBTScoStarted = false;
                cancelTimer();
                stopBtSco();
            }
        } else if (this.mCurrentRouting == 5) {
        }
        return 0;
    }

    @CalledByNative
    public boolean checkVersion(int i10) {
        int i11 = this.mVersionInUsed;
        boolean z10 = true;
        if ((i11 == 0 && i10 == 1) || (i11 == 1 && i10 == 0)) {
            this.mVersionInUsed = i10;
        } else {
            z10 = false;
        }
        if (z10) {
            dispose();
            initialize();
        }
        return z10;
    }

    @CalledByNative
    public void dispose() {
        this.mThreadChecker.checkIsOnValidThread();
        if (this.mDisposed) {
            return;
        }
        this.mDisposed = true;
        this.mNativeHandle = 0L;
        AudioDeviceInventory audioDeviceInventory = this.mAudioDeviceInventory;
        if (audioDeviceInventory != null) {
            audioDeviceInventory.dispose();
        }
        try {
            AudioManagerScoStateReceiver audioManagerScoStateReceiver = this.mScoStateReceiver;
            if (audioManagerScoStateReceiver != null && audioManagerScoStateReceiver.getRegistered()) {
                MockedBroadcaseter mockedBroadcaseter = mockedBroadcaster;
                if (mockedBroadcaseter != null) {
                    mockedBroadcaseter.unRegisterReceiver(this.mScoStateReceiver);
                }
                Context context = this.mContext.get();
                if (context != null) {
                    context.unregisterReceiver(this.mScoStateReceiver);
                }
                this.mScoStateReceiver.setRegistered(false);
            }
            this.mEventHandler.getLooper().quit();
        } catch (Exception e10) {
            Logging.e(TAG, "AudioRoutingController dispose fail: ", e10);
        }
        Logging.d(TAG, "dispose");
    }

    @CalledByNative
    public String getCurrentUsbAudioDevicePID(int i10) {
        AudioDeviceChangedSpecialMonitor audioDeviceChangedSpecialMonitor = deviceSpecialMonitor;
        String GetUSBDevicePID = audioDeviceChangedSpecialMonitor != null ? audioDeviceChangedSpecialMonitor.GetUSBDevicePID(i10) : null;
        Logging.d(TAG, String.format("getPIDFromNative: mic_or_spk=%d, pid=%s", Integer.valueOf(i10), GetUSBDevicePID == null ? "null" : GetUSBDevicePID));
        return GetUSBDevicePID;
    }

    @CalledByNative
    public String getCurrentUsbAudioDeviceVID(int i10) {
        AudioDeviceChangedSpecialMonitor audioDeviceChangedSpecialMonitor = deviceSpecialMonitor;
        String GetUSBDeviceVID = audioDeviceChangedSpecialMonitor != null ? audioDeviceChangedSpecialMonitor.GetUSBDeviceVID(i10) : null;
        Logging.d(TAG, String.format("getVIDFromNative: mic_or_spk=%d, vid=%s", Integer.valueOf(i10), GetUSBDeviceVID == null ? "null" : GetUSBDeviceVID));
        return GetUSBDeviceVID;
    }

    @CalledByNative
    public long getNativeHandle() {
        this.mThreadChecker.checkIsOnValidThread();
        return this.mNativeHandle;
    }

    public int handleBluetoothHeadsetEvent(int i10) {
        boolean z10 = i10 == 1;
        this.mIsBTHeadsetPlugged = z10;
        if (z10) {
            return 5;
        }
        return queryCurrentAudioRouting();
    }

    public int handleHeadsetEvent(int i10) {
        AudioManager audioManager = getAudioManager();
        if (audioManager != null && audioManager.isWiredHeadsetOn() && this.mIsWiredHeadsetPlugged && i10 < 0) {
            Logging.i(TAG, "not handle extra headset event, as headset still connect");
            return -1;
        }
        this.mHeadsetType = i10;
        boolean z10 = i10 >= 0;
        this.mIsWiredHeadsetPlugged = z10;
        return z10 ? i10 : queryCurrentAudioRouting();
    }

    @CalledByNative
    public int initialize() {
        String str;
        Logging.i(TAG, "AudioRoutingController initialize+ (Android: " + Build.VERSION.SDK_INT + ")");
        Context context = this.mContext.get();
        if (context == null) {
            str = "context has been GCed";
        } else {
            AudioManager audioManager = getAudioManager();
            if (audioManager != null) {
                ControllerAudioDeviceChangeCallback controllerAudioDeviceChangeCallback = new ControllerAudioDeviceChangeCallback();
                this.ctrlAudioDeviceCb = controllerAudioDeviceChangeCallback;
                WebRtcAudioRecord.setRecordRouteCallback(controllerAudioDeviceChangeCallback);
                WebRtcAudioTrack.setTrackRouteCallback(this.ctrlAudioDeviceCb);
                HandlerThread handlerThread = new HandlerThread(TAG);
                handlerThread.start();
                this.mEventHandler = new EventHandler(handlerThread.getLooper());
                this.mAudioDeviceInventory = mockedBroadcaster != null ? new AudioDeviceInventoryMocker() : this.mVersionInUsed == 1 ? new AudioDeviceInventoryMorHigher(context) : new AudioDeviceInventoryLowerThanM(context);
                this.mAudioDeviceInventory.setAudioDeviceChangeCallback(new AudioDeviceChangedCallbackImpl());
                this.mAudioDeviceInventory.initialize();
                if (this.mAudioDeviceInventory.isDeviceAvaliable(0)) {
                    this.mIsWiredHeadsetPlugged = true;
                    this.mHeadsetType = 0;
                } else if (this.mAudioDeviceInventory.isDeviceAvaliable(2)) {
                    this.mIsWiredHeadsetPlugged = true;
                    this.mHeadsetType = 2;
                }
                this.mIsBTHeadsetPlugged = this.mAudioDeviceInventory.isDeviceAvaliable(5);
                this.mBtScoState = audioManager.isBluetoothScoOn() ? 1 : 3;
                StringBuilder sb2 = new StringBuilder();
                sb2.append("Headset state: ");
                sb2.append(this.mIsWiredHeadsetPlugged);
                sb2.append("(type:");
                sb2.append(this.mHeadsetType);
                sb2.append("), BT state:");
                sb2.append(this.mIsBTHeadsetPlugged);
                sb2.append("(sco: ");
                sb2.append(this.mBtScoState == 1 ? " enable " : " disable");
                sb2.append(")");
                Logging.i(TAG, sb2.toString());
                this.mScoStateReceiver = new AudioManagerScoStateReceiver();
                IntentFilter intentFilter = new IntentFilter("android.media.ACTION_SCO_AUDIO_STATE_UPDATED");
                context.registerReceiver(this.mScoStateReceiver, intentFilter);
                MockedBroadcaseter mockedBroadcaseter = mockedBroadcaster;
                if (mockedBroadcaseter != null) {
                    mockedBroadcaseter.registerReceiver(this.mScoStateReceiver, intentFilter);
                }
                this.mScoStateReceiver.setRegistered(true);
                this.mDisposed = false;
                this.mState = changeState(2);
                setupHotPlugDeviceInitValue();
                Logging.i(TAG, "AudioRoutingController initialize-");
                return 0;
            }
            str = "invalid context: can't get AudioManager";
        }
        Logging.e(TAG, str);
        return -1;
    }

    @CalledByNative
    public int queryCurrentAudioRouting() {
        int i10;
        AudioManager audioManager = getAudioManager();
        try {
            int i11 = 3;
            if (audioManager.isSpeakerphoneOn()) {
                return 3;
            }
            if (!audioManager.isBluetoothScoOn() && !audioManager.isBluetoothA2dpOn()) {
                if (audioManager.isWiredHeadsetOn()) {
                    return 0;
                }
                if (audioManager.getMode() == 0) {
                    i10 = 3;
                } else {
                    i10 = 1;
                    i11 = 0;
                }
                int sdkDeviceByAndroidType = getSdkDeviceByAndroidType(getOutputDevicesByStream(i11));
                return (sdkDeviceByAndroidType == 7 || sdkDeviceByAndroidType == 6) ? sdkDeviceByAndroidType : i10;
            }
            return 5;
        } catch (Exception e10) {
            Logging.e(TAG, "fatal error @queryCurrentAudioRouting", e10);
            return -1;
        }
    }

    @CalledByNative
    public void sendEvent(int i10, int i11) {
        Logging.d(TAG, "sendEvent: [" + i10 + "], extra arg: " + i11 + "... " + this.mEventHandler);
        EventHandler eventHandler = this.mEventHandler;
        if (eventHandler != null) {
            this.mEventHandler.sendMessage(eventHandler.obtainMessage(i10, i11, 0));
        }
    }

    @CalledByNative
    public int startMonitoring() {
        Logging.d(TAG, "startMonitoring()");
        this.mEventHandler.post(new Runnable() { // from class: io.agora.rtc2.internal.AudioRoutingController.3
            @Override // java.lang.Runnable
            public void run() {
                if (AudioRoutingController.this.mState != null) {
                    AudioRoutingController.this.mState.setState(1);
                }
            }
        });
        if (this.mIsBTHeadsetPlugged) {
            return 5;
        }
        if (this.mIsWiredHeadsetPlugged) {
            return this.mHeadsetType;
        }
        if (this.mAudioDeviceInventory.isDeviceAvaliable(6)) {
            return 6;
        }
        return this.mDefaultRouting;
    }

    @CalledByNative
    public void stopMonitoring() {
        Logging.d(TAG, "stopMonitoring()");
        this.mEventHandler.post(new Runnable() { // from class: io.agora.rtc2.internal.AudioRoutingController.4
            @Override // java.lang.Runnable
            public void run() {
                if (AudioRoutingController.this.mState != null) {
                    AudioRoutingController.this.mState.setState(2);
                }
            }
        });
    }
}
