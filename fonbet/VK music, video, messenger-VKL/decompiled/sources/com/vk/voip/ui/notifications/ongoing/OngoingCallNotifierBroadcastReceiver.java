package com.vk.voip.ui.notifications.ongoing;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.vk.voip.api.di.VoipCallComponent;
import xsna.fpf0;
import xsna.k7m;
import xsna.m7m;
import xsna.w8i;

/* compiled from: OngoingCallNotifierBroadcastReceiver.kt */
/* loaded from: classes7.dex */
public final class OngoingCallNotifierBroadcastReceiver extends BroadcastReceiver implements w8i {
    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        ((VoipCallComponent) ((k7m) m7m.f(this)).a(fpf0.a(VoipCallComponent.class))).Yc().a(intent);
    }
}
