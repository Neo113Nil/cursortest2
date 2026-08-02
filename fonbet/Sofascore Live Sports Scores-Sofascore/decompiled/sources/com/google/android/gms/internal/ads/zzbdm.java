package com.google.android.gms.internal.ads;

import java.util.HashMap;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zzbdm extends zzbdt {
    public zzbdm(zzbcg zzbcgVar, zzaya zzayaVar, int i) {
        super(zzbcgVar, "Qz9CKMoDCHphOXPELo049qp61nrfn738aUeATKOiX7hq+kw0ujtW3xI/vlQKBh37", "bze+wYBAHEMh8JSXqo0+D4B3Aq+R4fX2jHr7eo7ufbY=", zzayaVar, i, 51);
    }

    @Override // com.google.android.gms.internal.ads.zzbdt
    public final void a() {
        zzaya zzayaVar = this.d;
        synchronized (zzayaVar) {
            String str = (String) this.e.invoke(null, null);
            zzbcb zzbcbVar = new zzbcb();
            HashMap b = zzazv.b(str);
            if (b != null) {
                zzbcbVar.a = (Long) b.get(0);
                zzbcbVar.b = (Long) b.get(1);
            }
            long longValue = zzbcbVar.a.longValue();
            zzayaVar.n();
            ((zzaza) zzayaVar.b).U(longValue);
            long longValue2 = zzbcbVar.b.longValue();
            zzayaVar.n();
            ((zzaza) zzayaVar.b).V(longValue2);
        }
    }
}
