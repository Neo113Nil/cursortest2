package defpackage;

import androidx.media3.common.b;
import com.unity3d.services.UnityAdsConstants;
import com.unity3d.services.core.device.MimeTypes;
import java.util.Objects;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class gu4 extends eu4 {
    public final boolean e;
    public final wt4 f;
    public final boolean g;
    public final boolean h;
    public final boolean i;
    public final int j;
    public final int k;
    public final int l;
    public final int m;
    public final int n;
    public final int o;
    public final int p;
    public final boolean q;
    public final int r;
    public final boolean s;
    public final int t;
    public final boolean u;
    public final boolean v;
    public final boolean w;
    public final int x;
    public final boolean y;
    public final String z;

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:105:0x01b9  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x0147  */
    /* JADX WARN: Removed duplicated region for block: B:149:0x013c  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x0131  */
    /* JADX WARN: Removed duplicated region for block: B:155:0x0115 A[EDGE_INSN: B:155:0x0115->B:81:0x0115 BREAK  A[LOOP:1: B:74:0x00fe->B:153:0x0112], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:156:0x00e3  */
    /* JADX WARN: Removed duplicated region for block: B:159:0x00b4 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:41:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x008e  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00a2  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00c2 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00d2  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00e1  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00f6  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0104  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0125 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:87:0x012f  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x013a  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0197  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public gu4(int i, osj osjVar, int i2, wt4 wt4Var, int i3, String str, int i4, boolean z) {
        super(i, osjVar, i2);
        boolean z2;
        boolean z3;
        int i5;
        int i6;
        int i7;
        String str2;
        int i8;
        int i9;
        boolean z4;
        int i10;
        boolean z5;
        boolean z6;
        boolean z7;
        b bVar;
        String c;
        int i11;
        b bVar2;
        int i12;
        int i13;
        float f;
        int i14;
        b bVar3;
        int i15;
        int i16;
        int i17;
        this.f = wt4Var;
        boolean z8 = wt4Var.z;
        hv9 hv9Var = wt4Var.i;
        hv9 hv9Var2 = wt4Var.k;
        int i18 = z8 ? 24 : 16;
        int i19 = 0;
        this.s = false;
        if (z && (((i15 = (bVar3 = this.d).v) == -1 || i15 <= wt4Var.a) && ((i16 = bVar3.w) == -1 || i16 <= wt4Var.b))) {
            float f2 = bVar3.z;
            if ((f2 == -1.0f || f2 <= wt4Var.c) && ((i17 = bVar3.j) == -1 || i17 <= wt4Var.d)) {
                z2 = true;
                this.e = z2;
                if (z && (((i12 = (bVar2 = this.d).v) == -1 || i12 >= 0) && ((i13 = bVar2.w) == -1 || i13 >= 0))) {
                    f = bVar2.z;
                    if ((f != -1.0f || f >= UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) && ((i14 = bVar2.j) == -1 || i14 >= 0)) {
                        z3 = true;
                        this.g = z3;
                        this.h = n51.k(i3, false);
                        b bVar4 = this.d;
                        float f3 = bVar4.z;
                        this.i = f3 == -1.0f && f3 >= 10.0f;
                        this.j = bVar4.j;
                        int i20 = bVar4.v;
                        this.k = (i20 != -1 || (i11 = bVar4.w) == -1) ? -1 : i20 * i11;
                        i5 = 0;
                        while (true) {
                            i6 = Integer.MAX_VALUE;
                            if (i5 < hv9Var2.size()) {
                                i7 = 0;
                                i5 = Integer.MAX_VALUE;
                                break;
                            } else {
                                i7 = iu4.g(this.d, (String) hv9Var2.get(i5), false);
                                if (i7 > 0) {
                                    break;
                                } else {
                                    i5++;
                                }
                            }
                        }
                        this.m = i5;
                        this.n = i7;
                        int i21 = this.d.f;
                        dwd dwdVar = iu4.k;
                        this.o = (i21 == 0 && i21 == 0) ? Integer.MAX_VALUE : Integer.bitCount(0);
                        int i22 = this.d.f;
                        this.q = (i22 == 0 && (i22 & 1) == 0) ? false : true;
                        this.r = iu4.g(this.d, str, iu4.j(str) != null);
                        b bVar5 = this.d;
                        str2 = bVar5.o;
                        i8 = i3 & 384;
                        if (i8 == 256 && (c = s3c.c(bVar5)) != null) {
                            str2 = c;
                        }
                        i9 = 0;
                        while (true) {
                            if (i9 < hv9Var.size()) {
                                if (str2 != null && str2.equals(hv9Var.get(i9))) {
                                    i6 = i9;
                                    break;
                                }
                                i9++;
                            } else {
                                break;
                            }
                        }
                        this.l = i6;
                        this.p = iu4.f(this.d, wt4Var.j);
                        this.u = i8 != 128 || i8 == 256;
                        z4 = i8 != 128;
                        this.v = z4;
                        this.w = (i3 & 64) != 64;
                        this.z = str2;
                        if (str2 != null) {
                            i10 = 4;
                            switch (str2.hashCode()) {
                                case -1851077871:
                                    if (str2.equals("video/dolby-vision")) {
                                        z5 = false;
                                        break;
                                    }
                                    z5 = -1;
                                    break;
                                case -1662735862:
                                    if (str2.equals(MimeTypes.VIDEO_AV1)) {
                                        z5 = true;
                                        break;
                                    }
                                    z5 = -1;
                                    break;
                                case -1662541442:
                                    if (str2.equals("video/hevc")) {
                                        z5 = 2;
                                        break;
                                    }
                                    z5 = -1;
                                    break;
                                case 1331836730:
                                    if (str2.equals("video/avc")) {
                                        z5 = 3;
                                        break;
                                    }
                                    z5 = -1;
                                    break;
                                case 1599127257:
                                    if (str2.equals(com.mbridge.msdk.playercommon.exoplayer2.util.MimeTypes.VIDEO_VP9)) {
                                        z5 = 4;
                                        break;
                                    }
                                    z5 = -1;
                                    break;
                                default:
                                    z5 = -1;
                                    break;
                            }
                            switch (z5) {
                                case false:
                                    i10 = 5;
                                    break;
                                case true:
                                    i10 = 3;
                                    break;
                                case true:
                                    i10 = 1;
                                    break;
                                case true:
                                    i10 = 2;
                                    break;
                            }
                            this.x = i10;
                            if (z4) {
                                w13 w13Var = this.d.E;
                                if (w13Var != null) {
                                    int i23 = w13Var.c;
                                    if (i23 == 7 || i23 == 6) {
                                        z6 = true;
                                        this.y = z6;
                                        z7 = this.e;
                                        wt4 wt4Var2 = this.f;
                                        bVar = this.d;
                                        if ((bVar.f & 16384) == 0 && n51.k(i3, wt4Var2.D) && (z7 || wt4Var2.y)) {
                                            i19 = (n51.k(i3, false) || !this.g || !z7 || bVar.j == -1 || (i18 & i3) == 0) ? 1 : 2;
                                        }
                                        this.t = i19;
                                    }
                                } else {
                                    w13 w13Var2 = w13.h;
                                }
                            }
                            z6 = false;
                            this.y = z6;
                            z7 = this.e;
                            wt4 wt4Var22 = this.f;
                            bVar = this.d;
                            if ((bVar.f & 16384) == 0) {
                                if (n51.k(i3, false)) {
                                }
                            }
                            this.t = i19;
                        }
                        i10 = 0;
                        this.x = i10;
                        if (z4) {
                        }
                        z6 = false;
                        this.y = z6;
                        z7 = this.e;
                        wt4 wt4Var222 = this.f;
                        bVar = this.d;
                        if ((bVar.f & 16384) == 0) {
                        }
                        this.t = i19;
                    }
                }
                z3 = false;
                this.g = z3;
                this.h = n51.k(i3, false);
                b bVar42 = this.d;
                float f32 = bVar42.z;
                this.i = f32 == -1.0f && f32 >= 10.0f;
                this.j = bVar42.j;
                int i202 = bVar42.v;
                this.k = (i202 != -1 || (i11 = bVar42.w) == -1) ? -1 : i202 * i11;
                i5 = 0;
                while (true) {
                    i6 = Integer.MAX_VALUE;
                    if (i5 < hv9Var2.size()) {
                    }
                    i5++;
                }
                this.m = i5;
                this.n = i7;
                int i212 = this.d.f;
                dwd dwdVar2 = iu4.k;
                this.o = (i212 == 0 && i212 == 0) ? Integer.MAX_VALUE : Integer.bitCount(0);
                int i222 = this.d.f;
                this.q = (i222 == 0 && (i222 & 1) == 0) ? false : true;
                this.r = iu4.g(this.d, str, iu4.j(str) != null);
                b bVar52 = this.d;
                str2 = bVar52.o;
                i8 = i3 & 384;
                if (i8 == 256) {
                    str2 = c;
                }
                i9 = 0;
                while (true) {
                    if (i9 < hv9Var.size()) {
                    }
                    i9++;
                }
                this.l = i6;
                this.p = iu4.f(this.d, wt4Var.j);
                this.u = i8 != 128 || i8 == 256;
                if (i8 != 128) {
                }
                this.v = z4;
                this.w = (i3 & 64) != 64;
                this.z = str2;
                if (str2 != null) {
                }
                i10 = 0;
                this.x = i10;
                if (z4) {
                }
                z6 = false;
                this.y = z6;
                z7 = this.e;
                wt4 wt4Var2222 = this.f;
                bVar = this.d;
                if ((bVar.f & 16384) == 0) {
                }
                this.t = i19;
            }
        }
        z2 = false;
        this.e = z2;
        if (z) {
            f = bVar2.z;
            if (f != -1.0f) {
            }
            z3 = true;
            this.g = z3;
            this.h = n51.k(i3, false);
            b bVar422 = this.d;
            float f322 = bVar422.z;
            this.i = f322 == -1.0f && f322 >= 10.0f;
            this.j = bVar422.j;
            int i2022 = bVar422.v;
            this.k = (i2022 != -1 || (i11 = bVar422.w) == -1) ? -1 : i2022 * i11;
            i5 = 0;
            while (true) {
                i6 = Integer.MAX_VALUE;
                if (i5 < hv9Var2.size()) {
                }
                i5++;
            }
            this.m = i5;
            this.n = i7;
            int i2122 = this.d.f;
            dwd dwdVar22 = iu4.k;
            this.o = (i2122 == 0 && i2122 == 0) ? Integer.MAX_VALUE : Integer.bitCount(0);
            int i2222 = this.d.f;
            this.q = (i2222 == 0 && (i2222 & 1) == 0) ? false : true;
            this.r = iu4.g(this.d, str, iu4.j(str) != null);
            b bVar522 = this.d;
            str2 = bVar522.o;
            i8 = i3 & 384;
            if (i8 == 256) {
            }
            i9 = 0;
            while (true) {
                if (i9 < hv9Var.size()) {
                }
                i9++;
            }
            this.l = i6;
            this.p = iu4.f(this.d, wt4Var.j);
            this.u = i8 != 128 || i8 == 256;
            if (i8 != 128) {
            }
            this.v = z4;
            this.w = (i3 & 64) != 64;
            this.z = str2;
            if (str2 != null) {
            }
            i10 = 0;
            this.x = i10;
            if (z4) {
            }
            z6 = false;
            this.y = z6;
            z7 = this.e;
            wt4 wt4Var22222 = this.f;
            bVar = this.d;
            if ((bVar.f & 16384) == 0) {
            }
            this.t = i19;
        }
        z3 = false;
        this.g = z3;
        this.h = n51.k(i3, false);
        b bVar4222 = this.d;
        float f3222 = bVar4222.z;
        this.i = f3222 == -1.0f && f3222 >= 10.0f;
        this.j = bVar4222.j;
        int i20222 = bVar4222.v;
        this.k = (i20222 != -1 || (i11 = bVar4222.w) == -1) ? -1 : i20222 * i11;
        i5 = 0;
        while (true) {
            i6 = Integer.MAX_VALUE;
            if (i5 < hv9Var2.size()) {
            }
            i5++;
        }
        this.m = i5;
        this.n = i7;
        int i21222 = this.d.f;
        dwd dwdVar222 = iu4.k;
        this.o = (i21222 == 0 && i21222 == 0) ? Integer.MAX_VALUE : Integer.bitCount(0);
        int i22222 = this.d.f;
        this.q = (i22222 == 0 && (i22222 & 1) == 0) ? false : true;
        this.r = iu4.g(this.d, str, iu4.j(str) != null);
        b bVar5222 = this.d;
        str2 = bVar5222.o;
        i8 = i3 & 384;
        if (i8 == 256) {
        }
        i9 = 0;
        while (true) {
            if (i9 < hv9Var.size()) {
            }
            i9++;
        }
        this.l = i6;
        this.p = iu4.f(this.d, wt4Var.j);
        this.u = i8 != 128 || i8 == 256;
        if (i8 != 128) {
        }
        this.v = z4;
        this.w = (i3 & 64) != 64;
        this.z = str2;
        if (str2 != null) {
        }
        i10 = 0;
        this.x = i10;
        if (z4) {
        }
        z6 = false;
        this.y = z6;
        z7 = this.e;
        wt4 wt4Var222222 = this.f;
        bVar = this.d;
        if ((bVar.f & 16384) == 0) {
        }
        this.t = i19;
    }

    public static int c(gu4 gu4Var, gu4 gu4Var2) {
        w63 c = w63.a.c(gu4Var.h, gu4Var2.h);
        Integer valueOf = Integer.valueOf(gu4Var.m);
        Integer valueOf2 = Integer.valueOf(gu4Var2.m);
        h4g h4gVar = h4g.a;
        return c.b(valueOf, valueOf2, h4gVar).a(gu4Var.n, gu4Var2.n).a(gu4Var.o, gu4Var2.o).b(Integer.valueOf(gu4Var.p), Integer.valueOf(gu4Var2.p), h4gVar).c(gu4Var.q, gu4Var2.q).a(gu4Var.r, gu4Var2.r).c(gu4Var.i, gu4Var2.i).c(gu4Var.e, gu4Var2.e).c(gu4Var.g, gu4Var2.g).b(Integer.valueOf(gu4Var.l), Integer.valueOf(gu4Var2.l), h4gVar).c(gu4Var.u, gu4Var2.u).c(gu4Var.w, gu4Var2.w).e();
    }

    @Override // defpackage.eu4
    public final int a() {
        return this.t;
    }

    @Override // defpackage.eu4
    public final boolean b(eu4 eu4Var) {
        gu4 gu4Var = (gu4) eu4Var;
        if (!this.s && !Objects.equals(this.z, gu4Var.z)) {
            return false;
        }
        this.f.getClass();
        return this.u == gu4Var.u && this.w == gu4Var.w;
    }
}
