package com.google.android.gms.internal.measurement;

import java.util.HashMap;
import java.util.List;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zzk extends zzai {
    public final zzab c;

    public zzk(zzab zzabVar) {
        super("internal.eventLogger");
        this.c = zzabVar;
    }

    @Override // com.google.android.gms.internal.measurement.zzai
    public final zzao d(zzg zzgVar, List list) {
        zzh.a(3, this.a, list);
        String zzc = zzgVar.b.b(zzgVar, (zzao) list.get(0)).zzc();
        zzao zzaoVar = (zzao) list.get(1);
        zzaw zzawVar = zzgVar.b;
        long h = (long) zzh.h(zzawVar.b(zzgVar, zzaoVar).zzd().doubleValue());
        zzao b = zzawVar.b(zzgVar, (zzao) list.get(2));
        HashMap j = b instanceof zzal ? zzh.j((zzal) b) : new HashMap();
        zzab zzabVar = this.c;
        zzabVar.getClass();
        HashMap hashMap = new HashMap();
        for (String str : j.keySet()) {
            HashMap hashMap2 = zzabVar.a.c;
            hashMap.put(str, zzaa.b(hashMap2.containsKey(str) ? hashMap2.get(str) : null, j.get(str), str));
        }
        zzabVar.c.add(new zzaa(zzc, h, hashMap));
        return zzao.I7;
    }
}
