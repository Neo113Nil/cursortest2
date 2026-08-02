package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.List;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zzbdj extends zzbdt {
    public List h;
    public final Context i;

    public zzbdj(zzbcg zzbcgVar, zzaya zzayaVar, int i, Context context) {
        super(zzbcgVar, "XXF2CX++qjQzFfJDmqd+84h356GlStFLqQSTRbbce/csPkd7M5mpQw1l7igXWffL", "FGCYjW2JaOcRH3mqSkgHIxbWzEwOVje6sx286yuA1xM=", zzayaVar, i, 31);
        this.h = null;
        this.i = context;
    }

    @Override // com.google.android.gms.internal.ads.zzbdt
    public final void a() {
        zzaya zzayaVar = this.d;
        zzayaVar.n();
        ((zzaza) zzayaVar.b).E(-1L);
        zzayaVar.n();
        ((zzaza) zzayaVar.b).F(-1L);
        Context context = this.i;
        if (context == null) {
            context = this.a.a;
        }
        List list = this.h;
        if (list == null) {
            list = (List) this.e.invoke(null, context);
            this.h = list;
        }
        if (list == null || list.size() != 2) {
            return;
        }
        synchronized (zzayaVar) {
            long longValue = ((Long) this.h.get(0)).longValue();
            zzayaVar.n();
            ((zzaza) zzayaVar.b).E(longValue);
            long longValue2 = ((Long) this.h.get(1)).longValue();
            zzayaVar.n();
            ((zzaza) zzayaVar.b).F(longValue2);
        }
    }
}
