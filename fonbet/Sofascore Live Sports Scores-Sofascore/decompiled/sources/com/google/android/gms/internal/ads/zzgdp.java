package com.google.android.gms.internal.ads;

import android.content.Context;
import defpackage.f0o;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zzgdp {
    public static zzgdp b;
    public final f0o a;

    public zzgdp(Context context) {
        f0o f0oVar = f0o.d;
        if (f0oVar == null) {
            f0oVar = new f0o(context);
            f0o.d = f0oVar;
        }
        this.a = f0oVar;
        zzgdk.a(context);
    }

    public static final zzgdp a(Context context) {
        zzgdp zzgdpVar;
        synchronized (zzgdp.class) {
            try {
                zzgdpVar = b;
                if (zzgdpVar == null) {
                    zzgdpVar = new zzgdp(context);
                    b = zzgdpVar;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return zzgdpVar;
    }

    public final void b() {
        synchronized (zzgdp.class) {
            f0o f0oVar = this.a;
            f0oVar.j("vendor_scoped_gpid_v2_id");
            f0oVar.j("vendor_scoped_gpid_v2_creation_time");
        }
    }
}
