package com.google.android.gms.internal.ads;

import defpackage.x5n;
import java.util.ArrayList;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zzawr {
    public final ArrayList a = new ArrayList();
    public int b = 0;

    public final int a(long j) {
        long j2;
        int[] iArr = {2001100545, 2130723407, 140753313, -149863858, -2003236720, 202391198, 23353437, 1141616124, 84353895};
        int i = iArr[0];
        int i2 = iArr[1];
        int i3 = iArr[2];
        int i4 = iArr[3];
        int i5 = iArr[4];
        int i6 = iArr[5];
        int i7 = iArr[6];
        int i8 = iArr[7];
        int y = x5n.y((i2 & (~i)) | i3, (i & i4) | i5, i6, i7);
        int i9 = i8 % 84353895;
        long[] jArr = {269441500, 1994078854, 158128940, -158130045, -1992289935, 556430036, 8936987, 2147469841, 438792350};
        long j3 = jArr[0];
        long j4 = jArr[1];
        long j5 = jArr[2];
        long j6 = jArr[3];
        long j7 = jArr[4];
        long j8 = jArr[5];
        long j9 = jArr[6];
        long j10 = jArr[7];
        long j11 = (((((~j3) & j4) | j5) + ((j3 & j6) | j7)) - j8) + j9;
        long j12 = j10 % 438792350;
        if (j >= 0) {
            j2 = (this.b + (y ^ i9)) - j;
        } else {
            j2 = (j11 ^ j12) + (-j);
        }
        if (j2 < 0 || j2 >= this.b) {
            throw new zzawp();
        }
        return (int) j2;
    }

    public final void b(zzaxa zzaxaVar) {
        int[] iArr = {524133589, 740889625, 408955079, 621796408, 24562149, 1207357565, 297783268, 1066077375, 937558955};
        int i = iArr[0];
        int i2 = iArr[1];
        int i3 = iArr[2];
        int i4 = iArr[3];
        int i5 = iArr[4];
        int i6 = iArr[5];
        int i7 = iArr[6];
        int i8 = iArr[7];
        int y = x5n.y((i2 & (~i)) | i3, (i & i4) | i5, i6, i7);
        int i9 = this.b;
        if (i9 >= ((i8 % 937558955) ^ y)) {
            throw new zzawq();
        }
        ArrayList arrayList = this.a;
        if (i9 == arrayList.size()) {
            arrayList.add(zzaxaVar);
        } else {
            arrayList.set(this.b, zzaxaVar);
        }
        this.b++;
    }

    public final zzaxa c() {
        int[] iArr = {91119157, 1459677288, 586253619, -183145911, -1567288443, 919325394, 146725508, 787086305, 459541652};
        int i = iArr[0];
        int i2 = iArr[1];
        int i3 = iArr[2];
        int i4 = iArr[3];
        int i5 = iArr[4];
        int i6 = iArr[5];
        int i7 = iArr[6];
        int i8 = iArr[7];
        int y = x5n.y((i2 & (~i)) | i3, (i & i4) | i5, i6, i7);
        int i9 = i8 % 459541652;
        int i10 = this.b;
        if (i10 <= 0) {
            throw new zzawp();
        }
        int i11 = i9 ^ y;
        ArrayList arrayList = this.a;
        zzaxa zzaxaVar = (zzaxa) arrayList.get(i10 + i11);
        arrayList.set(this.b + i11, null);
        this.b += i11;
        return zzaxaVar;
    }

    public final zzaxa d(long j) {
        return (zzaxa) this.a.get(a(j));
    }
}
