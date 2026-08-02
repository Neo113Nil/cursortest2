package com.vk.music.notifications.headset.listeners;

import android.bluetooth.BluetoothAdapter;
import android.content.Intent;
import com.vk.headset.internal.HeadsetBaseReceiver;
import xsna.bn40;
import xsna.bzu;
import xsna.r6m;

/* compiled from: HeadsetBluetoothConnectionChangedReceiver.kt */
/* loaded from: classes3.dex */
public final class HeadsetBluetoothConnectionChangedReceiver extends HeadsetBaseReceiver {
    public final bzu a = bzu.b;
    public final String b = "android.bluetooth.adapter.action.CONNECTION_STATE_CHANGED";

    @Override // com.vk.headset.internal.HeadsetBaseReceiver
    public final String a() {
        return this.b;
    }

    @Override // com.vk.headset.internal.HeadsetBaseReceiver
    public final void b(Intent intent) {
        int intExtra = intent.getIntExtra("android.bluetooth.adapter.extra.CONNECTION_STATE", Integer.MIN_VALUE);
        bn40.f("HSNMan", "Bluetooth:", "state:", Integer.valueOf(intExtra));
        bzu bzuVar = this.a;
        if (intExtra == 0) {
            bzuVar.a(false);
            return;
        }
        if (intExtra != 2) {
            return;
        }
        r6m.a.getClass();
        BluetoothAdapter defaultAdapter = BluetoothAdapter.getDefaultAdapter();
        Integer valueOf = defaultAdapter != null ? Integer.valueOf(defaultAdapter.getProfileConnectionState(1)) : null;
        Integer valueOf2 = defaultAdapter != null ? Integer.valueOf(defaultAdapter.getProfileConnectionState(2)) : null;
        if ((valueOf != null && valueOf.intValue() == 2) || (valueOf2 != null && valueOf2.intValue() == 2)) {
            bzuVar.a(true);
        }
    }
}
