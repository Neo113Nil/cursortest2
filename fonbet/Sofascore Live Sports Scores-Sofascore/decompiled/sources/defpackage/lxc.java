package defpackage;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class lxc {
    public final /* synthetic */ int a;
    public int b;
    public String c;
    public int d;
    public int e;
    public int f;
    public int g;
    public int h;

    public /* synthetic */ lxc(int i) {
        this.a = i;
    }

    /* JADX WARN: Code restructure failed: missing block: B:45:0x0066, code lost:
    
        if (r1 == 3) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:91:0x0104, code lost:
    
        if (r1 == 3) goto L82;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean a(int i) {
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10 = 576;
        switch (this.a) {
            case 0:
                if ((i & (-2097152)) == -2097152 && (i2 = (i >>> 19) & 3) != 1 && (i3 = (i >>> 17) & 3) != 0 && (i4 = (i >>> 12) & 15) != 0 && i4 != 15 && (i5 = (i >>> 10) & 3) != 3) {
                    this.b = i2;
                    this.c = yso.e[3 - i3];
                    int i11 = yso.f[i5];
                    this.e = i11;
                    if (i2 == 2) {
                        i11 /= 2;
                        this.e = i11;
                    } else if (i2 == 0) {
                        i11 /= 4;
                        this.e = i11;
                    }
                    int i12 = (i >>> 9) & 1;
                    if (i3 != 1) {
                        if (i3 != 2) {
                            if (i3 == 3) {
                                i10 = 384;
                            } else {
                                ilg.c();
                            }
                        }
                        i10 = 1152;
                    }
                    this.h = i10;
                    if (i3 == 3) {
                        int i13 = i2 == 3 ? yso.g[i4 - 1] : yso.h[i4 - 1];
                        this.g = i13;
                        this.d = (((i13 * 12) / i11) + i12) * 4;
                    } else if (i2 == 3) {
                        int i14 = i3 == 2 ? yso.i[i4 - 1] : yso.j[i4 - 1];
                        this.g = i14;
                        this.d = vxd.c(i14, 144, i11, i12);
                    } else {
                        int i15 = yso.k[i4 - 1];
                        this.g = i15;
                        this.d = vxd.c(i3 != 1 ? 144 : 72, i15, i11, i12);
                    }
                    this.f = ((i >> 6) & 3) == 3 ? 1 : 2;
                    break;
                }
                break;
            default:
                if ((i & (-2097152)) == -2097152 && (i6 = (i >>> 19) & 3) != 1 && (i7 = (i >>> 17) & 3) != 0 && (i8 = (i >>> 12) & 15) != 0 && i8 != 15 && (i9 = (i >>> 10) & 3) != 3) {
                    this.b = i6;
                    this.c = f5p.f[3 - i7];
                    int i16 = f5p.g[i9];
                    this.e = i16;
                    if (i6 == 2) {
                        i16 /= 2;
                        this.e = i16;
                    } else if (i6 == 0) {
                        i16 /= 4;
                        this.e = i16;
                    }
                    int i17 = (i >>> 9) & 1;
                    if (i7 != 1) {
                        if (i7 != 2) {
                            if (i7 == 3) {
                                i10 = 384;
                            } else {
                                ilg.c();
                            }
                        }
                        i10 = 1152;
                    }
                    this.h = i10;
                    if (i7 == 3) {
                        int i18 = i6 == 3 ? f5p.h[i8 - 1] : f5p.i[i8 - 1];
                        this.g = i18;
                        this.d = (((i18 * 12) / i16) + i17) * 4;
                    } else if (i6 == 3) {
                        int i19 = i7 == 2 ? f5p.j[i8 - 1] : f5p.k[i8 - 1];
                        this.g = i19;
                        this.d = vxd.c(i19, 144, i16, i17);
                    } else {
                        int i20 = f5p.l[i8 - 1];
                        this.g = i20;
                        this.d = vxd.c(i7 != 1 ? 144 : 72, i20, i16, i17);
                    }
                    this.f = ((i >> 6) & 3) == 3 ? 1 : 2;
                    break;
                }
                break;
        }
        return true;
    }
}
