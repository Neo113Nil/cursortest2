package com.google.android.gms.internal.ads;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zzbdk extends zzbdt {
    public final boolean h;

    public zzbdk(zzbcg zzbcgVar, zzaya zzayaVar, int i) {
        super(zzbcgVar, "NrTiKoqiGsnW0YmEvrYFxN8MEHR3HtreklnLu5ZS2/gdKln4kN9VtqKQ3DYD1lNw", "GRpsnBes2qRtyDPKutW4bBWph7anTp6FUrz2DgBHtv0=", zzayaVar, i, 61);
        this.h = zzbcgVar.o.a;
    }

    @Override // com.google.android.gms.internal.ads.zzbdt
    public final void a() {
        long longValue = ((Long) this.e.invoke(null, this.a.a, Boolean.valueOf(this.h))).longValue();
        zzaya zzayaVar = this.d;
        synchronized (zzayaVar) {
            zzayaVar.n();
            ((zzaza) zzayaVar.b).f0(longValue);
        }
    }
}
