package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.SharedPreferences;
import defpackage.f0o;
import defpackage.ico;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zzgdo extends ico {
    public static zzgdo i;

    public static final zzgdo f(Context context) {
        zzgdo zzgdoVar;
        synchronized (zzgdo.class) {
            try {
                zzgdoVar = i;
                if (zzgdoVar == null) {
                    zzgdoVar = new zzgdo(context, "paidv2_id", "paidv2_creation_time", "PaidV2LifecycleImpl");
                    i = zzgdoVar;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return zzgdoVar;
    }

    public final void g() {
        synchronized (zzgdo.class) {
            try {
                f0o f0oVar = this.f;
                if (((SharedPreferences) f0oVar.c).contains(this.a)) {
                    c(false);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
