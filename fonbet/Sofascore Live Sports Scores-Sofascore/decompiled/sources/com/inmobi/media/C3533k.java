package com.inmobi.media;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import defpackage.xw3;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* renamed from: com.inmobi.media.k, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C3533k extends BroadcastReceiver {
    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        if (Intrinsics.c(intent != null ? intent.getAction() : null, "android.media.VOLUME_CHANGED_ACTION")) {
            C3689q c3689q = C3689q.a;
            F5.a.getClass();
            if (F5.y()) {
                xw3.L(C3689q.g, null, null, new C3585m(null), 3);
            } else {
                C3689q.a((Float) null);
            }
        }
    }
}
