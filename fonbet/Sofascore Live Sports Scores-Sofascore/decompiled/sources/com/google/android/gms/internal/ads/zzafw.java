package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.LinkedHashMap;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zzafw {
    public final LinkedHashMap a = new LinkedHashMap();

    public final void a(zzafv zzafvVar) {
        long[] jArr = zzafvVar.e;
        if (jArr.length > 0) {
            Long valueOf = Long.valueOf(jArr[0]);
            LinkedHashMap linkedHashMap = this.a;
            if (linkedHashMap.containsKey(valueOf)) {
                return;
            }
            linkedHashMap.put(Long.valueOf(jArr[0]), zzafvVar);
        }
    }

    public final zzafv b() {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        ArrayList arrayList4 = new ArrayList();
        for (zzafv zzafvVar : this.a.values()) {
            arrayList.add(zzafvVar.b);
            arrayList2.add(zzafvVar.c);
            arrayList3.add(zzafvVar.d);
            arrayList4.add(zzafvVar.e);
        }
        int[][] iArr = (int[][]) arrayList.toArray(new int[arrayList.size()][]);
        long j = 0;
        for (int[] iArr2 : iArr) {
            j += iArr2.length;
        }
        int i = (int) j;
        zzguk.d(j, j == ((long) i), "the total number of elements (%s) in the arrays must fit in an int");
        int[] iArr3 = new int[i];
        int i2 = 0;
        for (int[] iArr4 : iArr) {
            int length = iArr4.length;
            System.arraycopy(iArr4, 0, iArr3, i2, length);
            i2 += length;
        }
        return new zzafv(iArr3, zzhbm.a((long[][]) arrayList2.toArray(new long[arrayList2.size()][])), zzhbm.a((long[][]) arrayList3.toArray(new long[arrayList3.size()][])), zzhbm.a((long[][]) arrayList4.toArray(new long[arrayList4.size()][])));
    }
}
