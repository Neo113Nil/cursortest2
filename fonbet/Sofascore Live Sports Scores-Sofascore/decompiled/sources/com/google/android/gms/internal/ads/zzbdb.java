package com.google.android.gms.internal.ads;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zzbdb extends zzbdt {
    public static volatile Long h;
    public static final Object i = new Object();

    public zzbdb(zzbcg zzbcgVar, zzaya zzayaVar, int i2) {
        super(zzbcgVar, "AeJvLHy+YL60Equ2/UpZQs9Ok34RPgGTn80fnG3Dx4JfdgAW65En0T0IJD/U8yYs", "sawjrbkZQHxExWkkVyDhv0h3fWiUMmvl7E2YVLpKa+A=", zzayaVar, i2, 22);
    }

    @Override // com.google.android.gms.internal.ads.zzbdt
    public final void a() {
        if (h == null) {
            synchronized (i) {
                try {
                    if (h == null) {
                        h = (Long) this.e.invoke(null, null);
                    }
                } finally {
                }
            }
        }
        zzaya zzayaVar = this.d;
        synchronized (zzayaVar) {
            long longValue = h.longValue();
            zzayaVar.n();
            ((zzaza) zzayaVar.b).U0(longValue);
        }
    }
}
