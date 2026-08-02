package com.google.android.gms.internal.ads;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zzbcx extends zzbdt {
    public final long h;

    public zzbcx(zzbcg zzbcgVar, zzaya zzayaVar, long j, int i) {
        super(zzbcgVar, "y0L1OSEMWW8/imV1M3pvQITWJfkGk5GAMqJuL5aNLdq8sTbK6BFpI8/D5pLc65zr", "dBSRUGPKY8JzIPoAEV0GB9RkRHGvAJPAM3BhqN1QQjE=", zzayaVar, i, 25);
        this.h = j;
    }

    @Override // com.google.android.gms.internal.ads.zzbdt
    public final void a() {
        long longValue = ((Long) this.e.invoke(null, null)).longValue();
        zzaya zzayaVar = this.d;
        synchronized (zzayaVar) {
            zzayaVar.n();
            ((zzaza) zzayaVar.b).r0(longValue);
            long j = this.h;
            if (j != 0) {
                zzayaVar.n();
                ((zzaza) zzayaVar.b).S0(longValue - j);
                zzayaVar.n();
                ((zzaza) zzayaVar.b).V0(j);
            }
        }
    }
}
