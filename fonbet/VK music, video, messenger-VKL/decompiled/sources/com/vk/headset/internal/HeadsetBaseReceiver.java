package com.vk.headset.internal;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import xsna.epx;

/* compiled from: HeadsetBaseReceiver.kt */
/* loaded from: classes.dex */
public abstract class HeadsetBaseReceiver extends BroadcastReceiver {
    public abstract String a();

    public abstract void b(Intent intent);

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        if (intent == null || context == null || !epx.f(intent.getAction(), a())) {
            return;
        }
        b(intent);
    }
}
