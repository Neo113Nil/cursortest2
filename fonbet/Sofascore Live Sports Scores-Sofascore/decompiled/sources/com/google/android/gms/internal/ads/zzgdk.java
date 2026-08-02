package com.google.android.gms.internal.ads;

import android.content.Context;
import defpackage.f0o;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zzgdk {
    public static zzgdk b;
    public final f0o a;

    public zzgdk(Context context) {
        f0o f0oVar = f0o.d;
        if (f0oVar == null) {
            f0oVar = new f0o(context);
            f0o.d = f0oVar;
        }
        this.a = f0oVar;
    }

    public static final zzgdk a(Context context) {
        zzgdk zzgdkVar;
        synchronized (zzgdk.class) {
            try {
                zzgdkVar = b;
                if (zzgdkVar == null) {
                    zzgdkVar = new zzgdk(context);
                    b = zzgdkVar;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return zzgdkVar;
    }

    public final void b(boolean z) {
        synchronized (zzgdk.class) {
            try {
                f0o f0oVar = this.a;
                f0oVar.h(Boolean.valueOf(z), "paidv2_publisher_option");
                if (!z) {
                    f0oVar.j("paidv2_creation_time");
                    f0oVar.j("paidv2_id");
                    f0oVar.j("vendor_scoped_gpid_v2_id");
                    f0oVar.j("vendor_scoped_gpid_v2_creation_time");
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
