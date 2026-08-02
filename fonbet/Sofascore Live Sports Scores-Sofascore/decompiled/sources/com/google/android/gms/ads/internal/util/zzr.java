package com.google.android.gms.ads.internal.util;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import java.util.Objects;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
final class zzr extends BroadcastReceiver {
    public final /* synthetic */ zzs a;

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        boolean equals = Objects.equals(intent.getAction(), "android.intent.action.USER_PRESENT");
        zzs zzsVar = this.a;
        if (equals) {
            zzsVar.e = true;
        } else if ("android.intent.action.SCREEN_OFF".equals(intent.getAction())) {
            zzsVar.e = false;
        }
    }
}
