package com.google.android.gms.internal.ads;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zzbdg extends zzbdt {
    public static volatile String h;
    public static final Object i = new Object();

    public zzbdg(zzbcg zzbcgVar, zzaya zzayaVar, int i2) {
        super(zzbcgVar, "XQdLYJkQLpAC0Ie4wfLqMhdIIwn1qr11ViPPFEC485DwlLnjXHhmJUbAoJDOqgC4", "EiIklDudUBV1tLFQO3J+6veHT/B2kTFeB6bPUIAs1V0=", zzayaVar, i2, 1);
    }

    @Override // com.google.android.gms.internal.ads.zzbdt
    public final void a() {
        zzaya zzayaVar = this.d;
        zzayaVar.n();
        ((zzaza) zzayaVar.b).I0("E");
        if (h == null) {
            synchronized (i) {
                try {
                    if (h == null) {
                        h = (String) this.e.invoke(null, null);
                    }
                } finally {
                }
            }
        }
        zzaya zzayaVar2 = this.d;
        synchronized (zzayaVar2) {
            String str = h;
            zzayaVar2.n();
            ((zzaza) zzayaVar2.b).I0(str);
        }
    }
}
