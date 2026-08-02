package defpackage;

import com.unity3d.services.core.device.MimeTypes;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public final class fu4 extends du4 {
    public final boolean e;
    public final vt4 f;
    public final boolean g;
    public final boolean h;
    public final int i;
    public final int j;
    public final int k;
    public final int l;
    public final boolean m;
    public final boolean n;
    public final int o;
    public final boolean p;
    public final boolean q;
    public final int r;

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:104:0x00f9  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x00ec  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x00e1  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x00d7 A[EDGE_INSN: B:132:0x00d7->B:70:0x00d7 BREAK  A[LOOP:0: B:62:0x00bc->B:130:0x00d4], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:49:0x008e  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00a1 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00b2  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x00c2  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x00df  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x00ea  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0152  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public fu4(int i, nsj nsjVar, int i2, vt4 vt4Var, int i3, int i4, boolean z) {
        super(i, nsjVar, i2);
        boolean z2;
        boolean z3;
        int i5;
        sm8 sm8Var;
        String str;
        int i6;
        boolean z4;
        boolean z5;
        vt4 vt4Var2;
        int i7;
        sm8 sm8Var2;
        int i8;
        int i9;
        float f;
        int i10;
        sm8 sm8Var3;
        int i11;
        int i12;
        int i13;
        this.f = vt4Var;
        boolean z6 = vt4Var.C;
        hv9 hv9Var = vt4Var.l;
        int i14 = z6 ? 24 : 16;
        int i15 = 0;
        this.n = vt4Var.B && (i4 & i14) != 0;
        if (z && (((i11 = (sm8Var3 = this.d).q) == -1 || i11 <= vt4Var.a) && ((i12 = sm8Var3.r) == -1 || i12 <= vt4Var.b))) {
            float f2 = sm8Var3.s;
            if ((f2 == -1.0f || f2 <= vt4Var.c) && ((i13 = sm8Var3.h) == -1 || i13 <= vt4Var.d)) {
                z2 = true;
                this.e = z2;
                if (z && (((i8 = (sm8Var2 = this.d).q) == -1 || i8 >= vt4Var.e) && ((i9 = sm8Var2.r) == -1 || i9 >= vt4Var.f))) {
                    f = sm8Var2.s;
                    if ((f != -1.0f || f >= vt4Var.g) && ((i10 = sm8Var2.h) == -1 || i10 >= vt4Var.h)) {
                        z3 = true;
                        this.g = z3;
                        this.h = hu4.d(i3, false);
                        sm8 sm8Var4 = this.d;
                        this.i = sm8Var4.h;
                        int i16 = sm8Var4.q;
                        this.j = (i16 != -1 || (i7 = sm8Var4.r) == -1) ? -1 : i16 * i7;
                        int i17 = sm8Var4.e;
                        int i18 = vt4Var.m;
                        int i19 = Integer.MAX_VALUE;
                        this.l = (i17 == 0 && i17 == i18) ? Integer.MAX_VALUE : Integer.bitCount(i17 & i18);
                        int i20 = this.d.e;
                        this.m = (i20 == 0 && (i20 & 1) == 0) ? false : true;
                        i5 = 0;
                        while (true) {
                            if (i5 < hv9Var.size()) {
                                String str2 = this.d.l;
                                if (str2 != null && str2.equals(hv9Var.get(i5))) {
                                    i19 = i5;
                                    break;
                                }
                                i5++;
                            } else {
                                break;
                            }
                        }
                        this.k = i19;
                        this.p = (i3 & 384) != 128;
                        this.q = (i3 & 64) != 64;
                        sm8Var = this.d;
                        str = sm8Var.l;
                        if (str != null) {
                            i6 = 4;
                            switch (str.hashCode()) {
                                case -1851077871:
                                    if (str.equals("video/dolby-vision")) {
                                        z4 = false;
                                        break;
                                    }
                                    z4 = -1;
                                    break;
                                case -1662735862:
                                    if (str.equals(MimeTypes.VIDEO_AV1)) {
                                        z4 = true;
                                        break;
                                    }
                                    z4 = -1;
                                    break;
                                case -1662541442:
                                    if (str.equals("video/hevc")) {
                                        z4 = 2;
                                        break;
                                    }
                                    z4 = -1;
                                    break;
                                case 1331836730:
                                    if (str.equals("video/avc")) {
                                        z4 = 3;
                                        break;
                                    }
                                    z4 = -1;
                                    break;
                                case 1599127257:
                                    if (str.equals(com.mbridge.msdk.playercommon.exoplayer2.util.MimeTypes.VIDEO_VP9)) {
                                        z4 = 4;
                                        break;
                                    }
                                    z4 = -1;
                                    break;
                                default:
                                    z4 = -1;
                                    break;
                            }
                            switch (z4) {
                                case false:
                                    i6 = 5;
                                    break;
                                case true:
                                    i6 = 3;
                                    break;
                                case true:
                                    i6 = 1;
                                    break;
                                case true:
                                    i6 = 2;
                                    break;
                            }
                            this.r = i6;
                            z5 = this.e;
                            vt4Var2 = this.f;
                            if ((sm8Var.e & 16384) == 0 && hu4.d(i3, vt4Var2.K) && (z5 || vt4Var2.A)) {
                                i15 = (hu4.d(i3, false) || !this.g || !z5 || sm8Var.h == -1 || vt4Var2.x || vt4Var2.w || (i14 & i3) == 0) ? 1 : 2;
                            }
                            this.o = i15;
                        }
                        i6 = 0;
                        this.r = i6;
                        z5 = this.e;
                        vt4Var2 = this.f;
                        if ((sm8Var.e & 16384) == 0) {
                            if (hu4.d(i3, false)) {
                            }
                        }
                        this.o = i15;
                    }
                }
                z3 = false;
                this.g = z3;
                this.h = hu4.d(i3, false);
                sm8 sm8Var42 = this.d;
                this.i = sm8Var42.h;
                int i162 = sm8Var42.q;
                this.j = (i162 != -1 || (i7 = sm8Var42.r) == -1) ? -1 : i162 * i7;
                int i172 = sm8Var42.e;
                int i182 = vt4Var.m;
                int i192 = Integer.MAX_VALUE;
                this.l = (i172 == 0 && i172 == i182) ? Integer.MAX_VALUE : Integer.bitCount(i172 & i182);
                int i202 = this.d.e;
                this.m = (i202 == 0 && (i202 & 1) == 0) ? false : true;
                i5 = 0;
                while (true) {
                    if (i5 < hv9Var.size()) {
                    }
                    i5++;
                }
                this.k = i192;
                this.p = (i3 & 384) != 128;
                this.q = (i3 & 64) != 64;
                sm8Var = this.d;
                str = sm8Var.l;
                if (str != null) {
                }
                i6 = 0;
                this.r = i6;
                z5 = this.e;
                vt4Var2 = this.f;
                if ((sm8Var.e & 16384) == 0) {
                }
                this.o = i15;
            }
        }
        z2 = false;
        this.e = z2;
        if (z) {
            f = sm8Var2.s;
            if (f != -1.0f) {
            }
            z3 = true;
            this.g = z3;
            this.h = hu4.d(i3, false);
            sm8 sm8Var422 = this.d;
            this.i = sm8Var422.h;
            int i1622 = sm8Var422.q;
            this.j = (i1622 != -1 || (i7 = sm8Var422.r) == -1) ? -1 : i1622 * i7;
            int i1722 = sm8Var422.e;
            int i1822 = vt4Var.m;
            int i1922 = Integer.MAX_VALUE;
            this.l = (i1722 == 0 && i1722 == i1822) ? Integer.MAX_VALUE : Integer.bitCount(i1722 & i1822);
            int i2022 = this.d.e;
            this.m = (i2022 == 0 && (i2022 & 1) == 0) ? false : true;
            i5 = 0;
            while (true) {
                if (i5 < hv9Var.size()) {
                }
                i5++;
            }
            this.k = i1922;
            this.p = (i3 & 384) != 128;
            this.q = (i3 & 64) != 64;
            sm8Var = this.d;
            str = sm8Var.l;
            if (str != null) {
            }
            i6 = 0;
            this.r = i6;
            z5 = this.e;
            vt4Var2 = this.f;
            if ((sm8Var.e & 16384) == 0) {
            }
            this.o = i15;
        }
        z3 = false;
        this.g = z3;
        this.h = hu4.d(i3, false);
        sm8 sm8Var4222 = this.d;
        this.i = sm8Var4222.h;
        int i16222 = sm8Var4222.q;
        this.j = (i16222 != -1 || (i7 = sm8Var4222.r) == -1) ? -1 : i16222 * i7;
        int i17222 = sm8Var4222.e;
        int i18222 = vt4Var.m;
        int i19222 = Integer.MAX_VALUE;
        this.l = (i17222 == 0 && i17222 == i18222) ? Integer.MAX_VALUE : Integer.bitCount(i17222 & i18222);
        int i20222 = this.d.e;
        this.m = (i20222 == 0 && (i20222 & 1) == 0) ? false : true;
        i5 = 0;
        while (true) {
            if (i5 < hv9Var.size()) {
            }
            i5++;
        }
        this.k = i19222;
        this.p = (i3 & 384) != 128;
        this.q = (i3 & 64) != 64;
        sm8Var = this.d;
        str = sm8Var.l;
        if (str != null) {
        }
        i6 = 0;
        this.r = i6;
        z5 = this.e;
        vt4Var2 = this.f;
        if ((sm8Var.e & 16384) == 0) {
        }
        this.o = i15;
    }

    public static int c(fu4 fu4Var, fu4 fu4Var2) {
        w63 b = w63.a.c(fu4Var.h, fu4Var2.h).a(fu4Var.l, fu4Var2.l).c(fu4Var.m, fu4Var2.m).c(fu4Var.e, fu4Var2.e).c(fu4Var.g, fu4Var2.g).b(Integer.valueOf(fu4Var.k), Integer.valueOf(fu4Var2.k), h4g.a);
        boolean z = fu4Var.p;
        w63 c = b.c(z, fu4Var2.p);
        boolean z2 = fu4Var.q;
        w63 c2 = c.c(z2, fu4Var2.q);
        if (z && z2) {
            c2 = c2.a(fu4Var.r, fu4Var2.r);
        }
        return c2.e();
    }

    @Override // defpackage.du4
    public final int a() {
        return this.o;
    }

    @Override // defpackage.du4
    public final boolean b(du4 du4Var) {
        fu4 fu4Var = (fu4) du4Var;
        if (!this.n && !lik.a(this.d.l, fu4Var.d.l)) {
            return false;
        }
        if (this.f.D) {
            return true;
        }
        return this.p == fu4Var.p && this.q == fu4Var.q;
    }
}
