package com.google.android.gms.internal.ads;

import android.view.View;
import java.util.HashMap;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zzbdq extends zzbdt {
    public final View h;

    public zzbdq(zzbcg zzbcgVar, zzaya zzayaVar, int i, View view) {
        super(zzbcgVar, "K/Oo81d3D7QQWAvkxOkmH49qSlOsGQFHscMya6S21HBqr+GdnpBDhLtEJWB1CCZB", "Ge8je/arysmNa4UdtKuRe+4JSpIyhDOrTZ5OtsYb5ag=", zzayaVar, i, 57);
        this.h = view;
    }

    @Override // com.google.android.gms.internal.ads.zzbdt
    public final void a() {
        View view = this.h;
        if (view != null) {
            Boolean bool = (Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().a(zzbjg.u4);
            Boolean bool2 = (Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().a(zzbjg.Dc);
            String str = (String) this.e.invoke(null, view, this.a.a.getResources().getDisplayMetrics(), bool, bool2);
            zzbck zzbckVar = new zzbck();
            HashMap b = zzazv.b(str);
            if (b != null) {
                zzbckVar.a = (Long) b.get(0);
                zzbckVar.b = (Long) b.get(1);
                zzbckVar.c = (Long) b.get(2);
                zzbckVar.d = (Long) b.get(3);
                zzbckVar.e = (Long) b.get(4);
            }
            zzayy D = zzayz.D();
            long longValue = zzbckVar.a.longValue();
            D.n();
            ((zzayz) D.b).F(longValue);
            long longValue2 = zzbckVar.b.longValue();
            D.n();
            ((zzayz) D.b).G(longValue2);
            long longValue3 = zzbckVar.c.longValue();
            D.n();
            ((zzayz) D.b).H(longValue3);
            if (bool2.booleanValue()) {
                long longValue4 = zzbckVar.e.longValue();
                D.n();
                ((zzayz) D.b).E(longValue4);
            }
            if (bool.booleanValue()) {
                long longValue5 = zzbckVar.d.longValue();
                D.n();
                ((zzayz) D.b).I(longValue5);
            }
            zzayz zzayzVar = (zzayz) D.o();
            zzaya zzayaVar = this.d;
            zzayaVar.n();
            ((zzaza) zzayaVar.b).a0(zzayzVar);
        }
    }
}
