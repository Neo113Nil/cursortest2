package com.google.android.gms.ads.internal.util;

import java.util.ArrayList;
import java.util.List;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zzbf {
    public final String[] a;
    public final double[] b;
    public final double[] c;
    public final int[] d;
    public int e;

    public zzbf(zzbe zzbeVar) {
        ArrayList arrayList = zzbeVar.b;
        int size = arrayList.size();
        this.a = (String[]) zzbeVar.a.toArray(new String[size]);
        int size2 = arrayList.size();
        double[] dArr = new double[size2];
        for (int i = 0; i < size2; i++) {
            dArr[i] = ((Double) arrayList.get(i)).doubleValue();
        }
        this.b = dArr;
        ArrayList arrayList2 = zzbeVar.c;
        int size3 = arrayList2.size();
        double[] dArr2 = new double[size3];
        for (int i2 = 0; i2 < size3; i2++) {
            dArr2[i2] = ((Double) arrayList2.get(i2)).doubleValue();
        }
        this.c = dArr2;
        this.d = new int[size];
        this.e = 0;
    }

    public final void zza(double d) {
        this.e++;
        int i = 0;
        while (true) {
            double[] dArr = this.c;
            if (i >= dArr.length) {
                return;
            }
            double d2 = dArr[i];
            if (d2 <= d && d < this.b[i]) {
                int[] iArr = this.d;
                iArr[i] = iArr[i] + 1;
            }
            if (d < d2) {
                return;
            } else {
                i++;
            }
        }
    }

    public final List zzb() {
        String[] strArr = this.a;
        ArrayList arrayList = new ArrayList(strArr.length);
        for (int i = 0; i < strArr.length; i++) {
            String str = strArr[i];
            double d = this.c[i];
            double d2 = this.b[i];
            int i2 = this.d[i];
            arrayList.add(new zzbd(str, d, d2, i2 / this.e, i2));
        }
        return arrayList;
    }
}
