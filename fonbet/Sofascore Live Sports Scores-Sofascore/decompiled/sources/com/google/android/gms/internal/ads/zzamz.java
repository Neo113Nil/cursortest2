package com.google.android.gms.internal.ads;

import defpackage.wt3;
import java.util.Arrays;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zzamz {
    public final zzamw a;
    public final int b;
    public final long[] c;
    public final int[] d;
    public final int e;
    public final long[] f;
    public final int[] g;
    public final int[] h;
    public final long i;
    public final boolean j;

    public zzamz(zzamw zzamwVar, long[] jArr, int[] iArr, int i, long[] jArr2, int[] iArr2, int[] iArr3, boolean z, long j, int i2) {
        int length = iArr.length;
        int length2 = jArr2.length;
        zzguk.a(length == length2);
        zzguk.a(jArr.length == length2);
        int length3 = iArr2.length;
        zzguk.a(length3 == length2);
        this.a = zzamwVar;
        this.c = jArr;
        this.d = iArr;
        this.e = i;
        this.f = jArr2;
        this.g = iArr2;
        this.h = iArr3;
        this.j = z;
        this.i = j;
        this.b = i2;
        if (length3 > 0) {
            int i3 = length3 - 1;
            iArr2[i3] = iArr2[i3] | 536870912;
        }
    }

    public final int a(long j) {
        long[] jArr = this.f;
        if (jArr.length > 0) {
            int i = 0;
            if (this.j) {
                return zzfm.s(jArr, j, false);
            }
            int[] iArr = this.h;
            int length = iArr.length - 1;
            int i2 = -1;
            while (i <= length) {
                int f = wt3.f(length, i, 2, i);
                if (jArr[iArr[f]] <= j) {
                    i = f + 1;
                    i2 = f;
                } else {
                    length = f - 1;
                }
            }
            if (i2 != -1) {
                long j2 = jArr[iArr[i2]];
                if (j2 == j) {
                    while (i2 > 0) {
                        int i3 = i2 - 1;
                        if (jArr[iArr[i3]] != j2) {
                            break;
                        }
                        i2 = i3;
                    }
                }
                return iArr[i2];
            }
        }
        return -1;
    }

    public final int b(long j) {
        long[] jArr = this.f;
        if (jArr.length > 0) {
            if (this.j) {
                String str = zzfm.a;
                int binarySearch = Arrays.binarySearch(jArr, j);
                if (binarySearch < 0) {
                    return ~binarySearch;
                }
                while (true) {
                    int i = binarySearch + 1;
                    if (i >= jArr.length || jArr[i] != j) {
                        break;
                    }
                    binarySearch = i;
                }
                return binarySearch;
            }
            int[] iArr = this.h;
            int length = iArr.length - 1;
            int i2 = 0;
            int i3 = -1;
            while (i2 <= length) {
                int f = wt3.f(length, i2, 2, i2);
                if (jArr[iArr[f]] >= j) {
                    length = f - 1;
                    i3 = f;
                } else {
                    i2 = f + 1;
                }
            }
            if (i3 != -1) {
                long j2 = jArr[iArr[i3]];
                if (j2 == j) {
                    while (i3 < iArr.length - 1) {
                        int i4 = i3 + 1;
                        if (jArr[iArr[i4]] != j2) {
                            break;
                        }
                        i3 = i4;
                    }
                }
                return iArr[i3];
            }
        }
        return -1;
    }
}
