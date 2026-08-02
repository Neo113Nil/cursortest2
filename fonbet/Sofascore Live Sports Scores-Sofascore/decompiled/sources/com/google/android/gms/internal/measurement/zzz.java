package com.google.android.gms.internal.measurement;

import java.util.Collections;
import java.util.Iterator;
import java.util.TreeMap;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zzz {
    public final TreeMap a = new TreeMap();
    public final TreeMap b = new TreeMap();

    public final void a(zzg zzgVar, zzab zzabVar) {
        zzl zzlVar = new zzl(zzabVar);
        TreeMap treeMap = this.a;
        for (Integer num : treeMap.keySet()) {
            zzaa clone = zzabVar.b.clone();
            zzao d = ((zzan) treeMap.get(num)).d(zzgVar, Collections.singletonList(zzlVar));
            int g = d instanceof zzah ? zzh.g(((zzah) d).a.doubleValue()) : -1;
            if (g == 2 || g == -1) {
                zzabVar.b = clone;
            }
        }
        TreeMap treeMap2 = this.b;
        Iterator it = treeMap2.keySet().iterator();
        while (it.hasNext()) {
            zzao d2 = ((zzan) treeMap2.get((Integer) it.next())).d(zzgVar, Collections.singletonList(zzlVar));
            if (d2 instanceof zzah) {
                zzh.g(((zzah) d2).a.doubleValue());
            }
        }
    }
}
