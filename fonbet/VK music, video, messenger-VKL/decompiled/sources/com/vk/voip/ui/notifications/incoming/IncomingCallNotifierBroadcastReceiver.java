package com.vk.voip.ui.notifications.incoming;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.vk.voip.api.di.VoipCallComponent;
import xsna.fpf0;
import xsna.k7m;
import xsna.m7m;
import xsna.w8i;

/* compiled from: IncomingCallNotifierBroadcastReceiver.kt */
/* loaded from: classes7.dex */
public final class IncomingCallNotifierBroadcastReceiver extends BroadcastReceiver implements w8i {
    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        ((VoipCallComponent) ((k7m) m7m.f(this)).a(fpf0.a(VoipCallComponent.class))).e3().a(intent);
    }
}
