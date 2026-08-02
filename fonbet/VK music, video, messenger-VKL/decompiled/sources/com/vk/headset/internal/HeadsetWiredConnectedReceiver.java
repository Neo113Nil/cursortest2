package com.vk.headset.internal;

import android.content.Intent;
import xsna.xyu;

/* compiled from: HeadsetWiredConnectedReceiver.kt */
/* loaded from: classes.dex */
public final class HeadsetWiredConnectedReceiver extends HeadsetBaseReceiver {
    public final xyu a;
    public final String b = "android.intent.action.HEADSET_PLUG";

    public HeadsetWiredConnectedReceiver(xyu xyuVar) {
        this.a = xyuVar;
    }

    @Override // com.vk.headset.internal.HeadsetBaseReceiver
    public final String a() {
        return this.b;
    }

    @Override // com.vk.headset.internal.HeadsetBaseReceiver
    public final void b(Intent intent) {
        this.a.a(intent.getIntExtra("state", 0) != 0);
    }
}
