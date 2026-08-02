package com.google.android.gms.internal.ads;

import java.lang.reflect.InvocationTargetException;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zzbdi extends zzbdt {
    public zzbdi(zzbcg zzbcgVar, zzaya zzayaVar, int i) {
        super(zzbcgVar, "sg/K0s1GwOZuQX5eitJmxib+wj81rdd8azNpkdJxx1Al3KmlPY0wLfmj2TGTYSv2", "x4M1RpSRK9uX9iukrRpM6KxHxc9F29fR3cS53OKE4Bs=", zzayaVar, i, 73);
    }

    @Override // com.google.android.gms.internal.ads.zzbdt
    public final void a() {
        zzaya zzayaVar = this.d;
        try {
            int i = 1;
            if (true == ((Boolean) this.e.invoke(null, this.a.a)).booleanValue()) {
                i = 2;
            }
            zzayaVar.n();
            ((zzaza) zzayaVar.b).w0(i);
        } catch (InvocationTargetException unused) {
            zzayaVar.n();
            ((zzaza) zzayaVar.b).w0(3);
        }
    }
}
