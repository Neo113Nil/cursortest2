package com.google.android.gms.internal.ads;

import defpackage.vxd;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zzahe {
    public int a;
    public String b;
    public int c;
    public int d;
    public int e;
    public int f;
    public int g;

    public final boolean a(int i) {
        int i2;
        int i3;
        int i4;
        int i5;
        if ((i & (-2097152)) != -2097152 || (i2 = (i >>> 19) & 3) == 1 || (i3 = (i >>> 17) & 3) == 0 || (i4 = (i >>> 12) & 15) == 0 || i4 == 15 || (i5 = (i >>> 10) & 3) == 3) {
            return false;
        }
        int i6 = i4 - 1;
        this.a = i2;
        this.b = zzahf.a[3 - i3];
        int i7 = zzahf.b[i5];
        this.d = i7;
        if (i2 == 2) {
            i7 /= 2;
            this.d = i7;
        } else if (i2 == 0) {
            i7 /= 4;
            this.d = i7;
        }
        int i8 = (i >>> 9) & 1;
        int i9 = 1152;
        if (i3 != 1) {
            if (i3 != 2) {
                i9 = 384;
            }
        } else if (i2 != 3) {
            i9 = 576;
        }
        this.g = i9;
        if (i3 == 3) {
            int i10 = i2 == 3 ? zzahf.c[i6] : zzahf.d[i6];
            this.f = i10;
            this.c = (((i10 * 12) / i7) + i8) * 4;
        } else {
            if (i2 == 3) {
                int i11 = i3 == 2 ? zzahf.e[i6] : zzahf.f[i6];
                this.f = i11;
                this.c = vxd.c(i11, 144, i7, i8);
            } else {
                int i12 = zzahf.g[i6];
                this.f = i12;
                this.c = vxd.c(i3 == 1 ? 72 : 144, i12, i7, i8);
            }
        }
        this.e = ((i >> 6) & 3) == 3 ? 1 : 2;
        return true;
    }
}
