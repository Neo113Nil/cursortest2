package com.google.android.gms.internal.ads;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zzbdo extends zzbdt {
    public static volatile Long h;
    public static final Object i = new Object();

    public zzbdo(zzbcg zzbcgVar, zzaya zzayaVar, int i2) {
        super(zzbcgVar, "9v14GmYq1mityfaROUYQVHNDWlAgc2TzwyjcWsJSVQ5o6aEyLVnDo4vbeNXmh2ew", "zGbmNDn+uB00oiAu0ISzPA2QynMDAioh3MLj5VQvTcg=", zzayaVar, i2, 33);
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
            ((zzaza) zzayaVar.b).G(longValue);
        }
    }
}
