package io.agora.rtc2.internal;

import android.content.Context;
import android.media.AudioDeviceCallback;
import android.media.AudioDeviceInfo;
import android.media.AudioManager;
import io.agora.rtc2.internal.AudioRoutingController;
import io.agora.utils2.internal.Logging;
import java.util.HashMap;

/* loaded from: classes3.dex */
public class AudioDeviceInventoryMorHigher implements AudioRoutingController.AudioDeviceInventory {
    private static final HashMap<Integer, Integer> DEVICE_TYPE_TO_ROUTE;
    private static final String TAG = "AudioRoute";
    private AudioManager mAm;
    private AudioRoutingController.AudioDeviceChangedCallback mAudioDeviceChangedCb = null;
    private AudioDeviceCallbackImpl mDevCb;

    public class AudioDeviceCallbackImpl extends AudioDeviceCallback {
        public AudioDeviceCallbackImpl() {
            Logging.i(AudioDeviceInventoryMorHigher.TAG, "AudioDeviceCallbackImpl ctor!");
        }

        @Override // android.media.AudioDeviceCallback
        public void onAudioDevicesAdded(AudioDeviceInfo[] audioDeviceInfoArr) {
            AudioDeviceInventoryMorHigher.this.processDevicesChanged(audioDeviceInfoArr, true);
        }

        @Override // android.media.AudioDeviceCallback
        public void onAudioDevicesRemoved(AudioDeviceInfo[] audioDeviceInfoArr) {
            AudioDeviceInventoryMorHigher.this.processDevicesChanged(audioDeviceInfoArr, false);
        }
    }

    static {
        HashMap<Integer, Integer> hashMap = new HashMap<>();
        DEVICE_TYPE_TO_ROUTE = hashMap;
        hashMap.put(1, 1);
        hashMap.put(2, 3);
        hashMap.put(3, 0);
        hashMap.put(4, 2);
        hashMap.put(7, 5);
        hashMap.put(11, 0);
        hashMap.put(22, 0);
        hashMap.put(9, 7);
    }

    public AudioDeviceInventoryMorHigher(Context context) {
        this.mAm = (AudioManager) context.getSystemService("audio");
    }

    private void onAudioDeviceChanged(int i10, boolean z10) {
        AudioRoutingController.AudioDeviceChangedCallback audioDeviceChangedCallback = this.mAudioDeviceChangedCb;
        if (audioDeviceChangedCallback != null) {
            audioDeviceChangedCallback.onAudioDeviceChanged(z10, i10);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void processDevicesChanged(AudioDeviceInfo[] audioDeviceInfoArr, boolean z10) {
        String str;
        for (AudioDeviceInfo audioDeviceInfo : audioDeviceInfoArr) {
            boolean isSource = audioDeviceInfo.isSource();
            int type = audioDeviceInfo.getType();
            if (type == 8) {
                str = "Not process a2dp out yet!";
            } else {
                if (!isSource) {
                    HashMap<Integer, Integer> hashMap = DEVICE_TYPE_TO_ROUTE;
                    if (hashMap.containsKey(Integer.valueOf(audioDeviceInfo.getType()))) {
                        int intValue = hashMap.get(Integer.valueOf(type)).intValue();
                        onAudioDeviceChanged(intValue, z10);
                        str = "Process device event, route: " + intValue + " connect: " + z10;
                    }
                }
                Logging.d(TAG, "Not process device type: " + type + " connect: " + z10);
            }
            Logging.i(TAG, str);
        }
    }

    @Override // io.agora.rtc2.internal.AudioRoutingController.AudioDeviceInventory
    public void dispose() {
        this.mAm.unregisterAudioDeviceCallback(this.mDevCb);
    }

    @Override // io.agora.rtc2.internal.AudioRoutingController.AudioDeviceInventory
    public void initialize() {
        AudioDeviceCallbackImpl audioDeviceCallbackImpl = new AudioDeviceCallbackImpl();
        this.mDevCb = audioDeviceCallbackImpl;
        this.mAm.registerAudioDeviceCallback(audioDeviceCallbackImpl, null);
    }

    @Override // io.agora.rtc2.internal.AudioRoutingController.AudioDeviceInventory
    public boolean isDeviceAvaliable(int i10) {
        for (AudioDeviceInfo audioDeviceInfo : this.mAm.getDevices(2)) {
            int type = audioDeviceInfo.getType();
            HashMap<Integer, Integer> hashMap = DEVICE_TYPE_TO_ROUTE;
            if (hashMap.containsKey(Integer.valueOf(type)) && hashMap.get(Integer.valueOf(type)).intValue() == i10) {
                return true;
            }
        }
        return false;
    }

    @Override // io.agora.rtc2.internal.AudioRoutingController.AudioDeviceInventory
    public void setAudioDeviceChangeCallback(AudioRoutingController.AudioDeviceChangedCallback audioDeviceChangedCallback) {
        this.mAudioDeviceChangedCb = audioDeviceChangedCallback;
    }
}
