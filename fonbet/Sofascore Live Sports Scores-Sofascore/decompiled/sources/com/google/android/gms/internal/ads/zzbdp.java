package com.google.android.gms.internal.ads;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zzbdp extends zzbdt {
    public zzbdp(zzbcg zzbcgVar, zzaya zzayaVar, int i) {
        super(zzbcgVar, "GkIdfnRezKvEfAeB5157D8Ci3lpp/e7Oge9xr/GzO3KjC7JXvYHgpg7VRCtGuOw4", "kXUmyuEurXcq5mqFokC5oFFCqidwlGAMD9JpJXYa0Mk=", zzayaVar, i, 48);
    }

    @Override // com.google.android.gms.internal.ads.zzbdt
    public final void a() {
        zzaya zzayaVar = this.d;
        zzayaVar.q(3);
        boolean booleanValue = ((Boolean) this.e.invoke(null, this.a.a)).booleanValue();
        synchronized (zzayaVar) {
            try {
                if (booleanValue) {
                    zzayaVar.q(2);
                } else {
                    zzayaVar.q(1);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
