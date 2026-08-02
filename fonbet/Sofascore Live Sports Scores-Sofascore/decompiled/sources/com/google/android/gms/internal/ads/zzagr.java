package com.google.android.gms.internal.ads;

import java.util.Arrays;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zzagr {
    public static zzagt a(zzeu zzeuVar) {
        zzeuVar.E(1);
        int M = zzeuVar.M();
        long j = zzeuVar.b;
        long j2 = M;
        int i = M / 18;
        long[] jArr = new long[i];
        long[] jArr2 = new long[i];
        int i2 = 0;
        while (true) {
            if (i2 >= i) {
                break;
            }
            long d = zzeuVar.d();
            if (d == -1) {
                jArr = Arrays.copyOf(jArr, i2);
                jArr2 = Arrays.copyOf(jArr2, i2);
                break;
            }
            jArr[i2] = d;
            jArr2[i2] = zzeuVar.d();
            zzeuVar.E(2);
            i2++;
        }
        zzeuVar.E((int) ((j + j2) - zzeuVar.b));
        return new zzagt(jArr, jArr2);
    }
}
