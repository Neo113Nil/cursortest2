package com.google.android.gms.internal.ads;

import java.util.HashMap;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zzbdh extends zzbdt {
    public zzbdh(zzbcg zzbcgVar, zzaya zzayaVar, int i) {
        super(zzbcgVar, "IIcYtgV+jKyhXEWTRGryYoN4Hb3AaxkKFvJa61B8IsfExxFOrLfbygLFTq7UIHav", "0Td4x6cMqS7UG7AA2zcqm+bK2AW+gIwIgEtwqP1CguA=", zzayaVar, i, 3);
    }

    @Override // com.google.android.gms.internal.ads.zzbdt
    public final void a() {
        long j;
        Boolean bool = (Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().a(zzbjg.U3);
        bool.getClass();
        String str = (String) this.e.invoke(null, this.a.a, bool);
        zzbbm zzbbmVar = new zzbbm();
        long j2 = -1;
        zzbbmVar.a = -1L;
        zzbbmVar.b = -1L;
        HashMap b = zzazv.b(str);
        if (b != null) {
            j2 = ((Long) b.get(0)).longValue();
            zzbbmVar.a = j2;
            j = ((Long) b.get(1)).longValue();
            zzbbmVar.b = j;
        } else {
            j = -1;
        }
        zzaya zzayaVar = this.d;
        synchronized (zzayaVar) {
            zzayaVar.n();
            ((zzaza) zzayaVar.b).K0(j2);
            zzayaVar.n();
            ((zzaza) zzayaVar.b).d0(j);
        }
    }
}
