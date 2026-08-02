package com.google.android.gms.ads.internal.util;

import java.util.ArrayList;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zzbe {
    public final ArrayList a = new ArrayList();
    public final ArrayList b = new ArrayList();
    public final ArrayList c = new ArrayList();

    public final zzbe zza(String str, double d, double d2) {
        ArrayList arrayList;
        ArrayList arrayList2;
        ArrayList arrayList3;
        int i = 0;
        while (true) {
            arrayList = this.a;
            int size = arrayList.size();
            arrayList2 = this.b;
            arrayList3 = this.c;
            if (i >= size) {
                break;
            }
            double doubleValue = ((Double) arrayList3.get(i)).doubleValue();
            double doubleValue2 = ((Double) arrayList2.get(i)).doubleValue();
            if (d < doubleValue || (doubleValue == d && d2 < doubleValue2)) {
                break;
            }
            i++;
        }
        arrayList.add(i, str);
        arrayList3.add(i, Double.valueOf(d));
        arrayList2.add(i, Double.valueOf(d2));
        return this;
    }

    public final zzbf zzb() {
        return new zzbf(this);
    }
}
