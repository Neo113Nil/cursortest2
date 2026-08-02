package com.google.android.gms.internal.ads;

import android.content.Context;
import defpackage.ico;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zzgdn extends ico {
    public static zzgdn i;

    public static final zzgdn f(Context context) {
        zzgdn zzgdnVar;
        synchronized (zzgdn.class) {
            try {
                zzgdnVar = i;
                if (zzgdnVar == null) {
                    zzgdnVar = new zzgdn(context, "paidv1_id", "paidv1_creation_time", "PaidV1LifecycleImpl");
                    i = zzgdnVar;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return zzgdnVar;
    }
}
