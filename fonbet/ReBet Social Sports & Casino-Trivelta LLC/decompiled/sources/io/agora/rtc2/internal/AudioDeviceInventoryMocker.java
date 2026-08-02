package io.agora.rtc2.internal;

import android.bluetooth.BluetoothDevice;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import io.agora.rtc2.internal.AudioRoutingController;
import io.agora.utils2.internal.Logging;

/* loaded from: classes3.dex */
public class AudioDeviceInventoryMocker implements AudioRoutingController.AudioDeviceInventory {
    private static final String TAG = "AudioRoute";
    private static AudioRoutingController.MockedBroadcaseter mockedBroadcaster;
    private AudioRoutingController.AudioDeviceChangedCallback mAudioDeviceChangedCb;
    private final int STATE_DISCONNECT = -1;
    private final int STATE_CONNECT = 1;
    private final String HEADSET_EXTRA_STATE = "state";
    private HeadsetBroadcastReceiver mHeadsetReceiver = null;
    private BTHeadsetBroadcastReceiver mBTHeadsetReceiver = null;
    private int mHeadsetType = -1;

    public class BTHeadsetBroadcastReceiver extends BroadcastReceiver {
        private boolean isRegistered;

        private BTHeadsetBroadcastReceiver() {
            this.isRegistered = false;
        }

        public boolean getRegistered() {
            return this.isRegistered;
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            AudioDeviceInventoryMocker.this.processBluetoothIntent(intent);
        }

        public void setRegistered(boolean z10) {
            this.isRegistered = z10;
        }
    }

    public class HeadsetBroadcastReceiver extends BroadcastReceiver {
        private boolean isRegistered;

        private HeadsetBroadcastReceiver() {
            this.isRegistered = false;
        }

        public boolean getRegistered() {
            return this.isRegistered;
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            if (intent.getAction().equalsIgnoreCase("android.intent.action.HEADSET_PLUG") && intent.hasExtra("state")) {
                int intExtra = intent.getIntExtra("state", -1);
                int intExtra2 = intent.getIntExtra("microphone", -1);
                if (intExtra == 1) {
                    AudioDeviceInventoryMocker.this.mHeadsetType = intExtra2 == 1 ? 0 : 2;
                }
                boolean z10 = intExtra == 1;
                AudioDeviceInventoryMocker audioDeviceInventoryMocker = AudioDeviceInventoryMocker.this;
                audioDeviceInventoryMocker.onAudioDeviceChanged(audioDeviceInventoryMocker.mHeadsetType, z10);
            }
        }

        public void setRegistered(boolean z10) {
            this.isRegistered = z10;
        }
    }

    public AudioDeviceInventoryMocker() {
        Logging.i(TAG, "AudioDeviceInventoryMocker ctor!");
    }

    private void initBtBroadcastReceiver() {
        if (this.mBTHeadsetReceiver == null) {
            this.mBTHeadsetReceiver = new BTHeadsetBroadcastReceiver();
        }
        IntentFilter intentFilter = new IntentFilter("android.bluetooth.headset.profile.action.CONNECTION_STATE_CHANGED");
        intentFilter.addAction("android.bluetooth.adapter.action.STATE_CHANGED");
        if (this.mBTHeadsetReceiver.getRegistered()) {
            return;
        }
        AudioRoutingController.MockedBroadcaseter mockedBroadcaseter = mockedBroadcaster;
        if (mockedBroadcaseter != null) {
            mockedBroadcaseter.registerReceiver(this.mBTHeadsetReceiver, intentFilter);
        }
        this.mBTHeadsetReceiver.setRegistered(true);
    }

    private void initHeadsetBroadcastReceiver() {
        if (this.mHeadsetReceiver == null) {
            this.mHeadsetReceiver = new HeadsetBroadcastReceiver();
        }
        if (this.mHeadsetReceiver.getRegistered()) {
            return;
        }
        IntentFilter intentFilter = new IntentFilter("android.intent.action.HEADSET_PLUG");
        AudioRoutingController.MockedBroadcaseter mockedBroadcaseter = mockedBroadcaster;
        if (mockedBroadcaseter != null) {
            mockedBroadcaseter.registerReceiver(this.mHeadsetReceiver, intentFilter);
        }
        this.mHeadsetReceiver.setRegistered(true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void onAudioDeviceChanged(int i10, boolean z10) {
        AudioRoutingController.AudioDeviceChangedCallback audioDeviceChangedCallback = this.mAudioDeviceChangedCb;
        if (audioDeviceChangedCallback != null) {
            audioDeviceChangedCallback.onAudioDeviceChanged(z10, i10);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void processBluetoothIntent(Intent intent) {
        String str;
        String action = intent.getAction();
        try {
            if (action.equals("android.bluetooth.headset.profile.action.CONNECTION_STATE_CHANGED")) {
                int intExtra = intent.getIntExtra("android.bluetooth.profile.extra.STATE", -99);
                int intExtra2 = intent.getIntExtra("android.bluetooth.profile.extra.PREVIOUS_STATE", -99);
                BluetoothDevice bluetoothDevice = (BluetoothDevice) intent.getParcelableExtra("android.bluetooth.device.extra.DEVICE");
                String name = bluetoothDevice != null ? bluetoothDevice.getName() : "null name";
                if (intExtra == 0) {
                    onAudioDeviceChanged(5, false);
                } else if (intExtra == 2) {
                    onAudioDeviceChanged(5, true);
                }
                str = "BT " + name + " hfp connect state : " + intExtra2 + ", " + intExtra;
            } else {
                if (!action.equals("android.bluetooth.adapter.action.STATE_CHANGED")) {
                    return;
                }
                int intExtra3 = intent.getIntExtra("android.bluetooth.adapter.extra.STATE", -99);
                int intExtra4 = intent.getIntExtra("android.bluetooth.adapter.extra.PREVIOUS_STATE", -99);
                if (intExtra3 == 10) {
                    onAudioDeviceChanged(5, false);
                }
                str = "BluetoothAdapter.ACTION_STATE_CHANGED prev " + intExtra4 + ", " + intExtra3;
            }
            Logging.d(TAG, str);
        } catch (Exception e10) {
            Logging.e(TAG, "BT broadcast receiver onReceive fail ", e10);
        }
    }

    public static void setMockedBroadcaster(AudioRoutingController.MockedBroadcaseter mockedBroadcaseter) {
        mockedBroadcaster = mockedBroadcaseter;
    }

    @Override // io.agora.rtc2.internal.AudioRoutingController.AudioDeviceInventory
    public void dispose() {
        HeadsetBroadcastReceiver headsetBroadcastReceiver = this.mHeadsetReceiver;
        if (headsetBroadcastReceiver != null && headsetBroadcastReceiver.getRegistered()) {
            AudioRoutingController.MockedBroadcaseter mockedBroadcaseter = mockedBroadcaster;
            if (mockedBroadcaseter != null) {
                mockedBroadcaseter.unRegisterReceiver(this.mHeadsetReceiver);
            }
            this.mHeadsetReceiver.setRegistered(false);
        }
        BTHeadsetBroadcastReceiver bTHeadsetBroadcastReceiver = this.mBTHeadsetReceiver;
        if (bTHeadsetBroadcastReceiver != null && bTHeadsetBroadcastReceiver.getRegistered()) {
            AudioRoutingController.MockedBroadcaseter mockedBroadcaseter2 = mockedBroadcaster;
            if (mockedBroadcaseter2 != null) {
                mockedBroadcaseter2.unRegisterReceiver(this.mBTHeadsetReceiver);
            }
            this.mBTHeadsetReceiver.setRegistered(false);
        }
        this.mHeadsetReceiver = null;
        this.mBTHeadsetReceiver = null;
    }

    @Override // io.agora.rtc2.internal.AudioRoutingController.AudioDeviceInventory
    public void initialize() {
        Logging.i(TAG, "AudioDeviceInventoryMocker initialize +");
        initHeadsetBroadcastReceiver();
        initBtBroadcastReceiver();
    }

    @Override // io.agora.rtc2.internal.AudioRoutingController.AudioDeviceInventory
    public boolean isDeviceAvaliable(int i10) {
        return i10 != 5 && (i10 == 0 || i10 == 2) && this.mHeadsetType == i10;
    }

    @Override // io.agora.rtc2.internal.AudioRoutingController.AudioDeviceInventory
    public void setAudioDeviceChangeCallback(AudioRoutingController.AudioDeviceChangedCallback audioDeviceChangedCallback) {
        this.mAudioDeviceChangedCb = audioDeviceChangedCallback;
    }
}
