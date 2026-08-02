package com.google.android.gms.internal.ads;

import android.view.View;
import java.lang.ref.WeakReference;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zzbdn extends zzbdt {
    public final zzbcn h;
    public final long i;

    public zzbdn(zzbcg zzbcgVar, zzaya zzayaVar, int i, zzbcn zzbcnVar) {
        super(zzbcgVar, "CX4J+2yEJ2HtJzNjBSAFoPZxV3S124qFqsrwrEik3kHdsHRX3oIIB4d/zi0EQ0fu", "gfLiyhD2OvLSOj6bwf+kcmK11rwQ90aeBshxHD6xXgk=", zzayaVar, i, 53);
        this.h = zzbcnVar;
        if (zzbcnVar != null) {
            if (zzbcnVar.l <= -2) {
                WeakReference weakReference = zzbcnVar.h;
                if ((weakReference != null ? (View) weakReference.get() : null) == null) {
                    zzbcnVar.l = -3L;
                }
            }
            this.i = zzbcnVar.l;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbdt
    public final void a() {
        if (this.h != null) {
            long longValue = ((Long) this.e.invoke(null, Long.valueOf(this.i))).longValue();
            zzaya zzayaVar = this.d;
            zzayaVar.n();
            ((zzaza) zzayaVar.b).W(longValue);
        }
    }
}
