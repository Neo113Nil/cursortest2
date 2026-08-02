package n3;

import Ij.C3261b;
import com.google.common.collect.AbstractC5880y;
import j3.C7267i;
import j3.C7272n;
import j3.u;
import java.lang.reflect.Array;
import java.math.RoundingMode;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import m3.C8065g;

/* renamed from: n3.g, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C8434g {

    /* renamed from: a, reason: collision with root package name */
    public static final byte[] f76385a = {0, 0, 0, 1};

    /* renamed from: b, reason: collision with root package name */
    public static final float[] f76386b = {1.0f, 1.0f, 1.0909091f, 0.90909094f, 1.4545455f, 1.2121212f, 2.1818182f, 1.8181819f, 2.909091f, 2.4242425f, 1.6363636f, 1.3636364f, 1.939394f, 1.6161616f, 1.3333334f, 1.5f, 2.0f};

    /* renamed from: c, reason: collision with root package name */
    private static final Object f76387c = new Object();

    /* renamed from: d, reason: collision with root package name */
    private static int[] f76388d = new int[10];

    /* renamed from: n3.g$a */
    /* loaded from: classes8.dex */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public final int f76389a;

        /* renamed from: b, reason: collision with root package name */
        public final int f76390b;

        public a(int i11, int i12) {
            this.f76389a = i11;
            this.f76390b = i12;
        }
    }

    /* renamed from: n3.g$b */
    /* loaded from: classes8.dex */
    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        public final int f76391a;

        /* renamed from: b, reason: collision with root package name */
        public final int f76392b;

        /* renamed from: c, reason: collision with root package name */
        public final int f76393c;

        public b(int i11, int i12, int i13) {
            this.f76391a = i11;
            this.f76392b = i12;
            this.f76393c = i13;
        }
    }

    /* renamed from: n3.g$c */
    /* loaded from: classes8.dex */
    public static final class c {

        /* renamed from: a, reason: collision with root package name */
        public final int f76394a;

        /* renamed from: b, reason: collision with root package name */
        public final boolean f76395b;

        /* renamed from: c, reason: collision with root package name */
        public final int f76396c;

        /* renamed from: d, reason: collision with root package name */
        public final int f76397d;

        /* renamed from: e, reason: collision with root package name */
        public final int[] f76398e;

        /* renamed from: f, reason: collision with root package name */
        public final int f76399f;

        public c(int i11, boolean z11, int i12, int i13, int[] iArr, int i14) {
            this.f76394a = i11;
            this.f76395b = z11;
            this.f76396c = i12;
            this.f76397d = i13;
            this.f76398e = iArr;
            this.f76399f = i14;
        }
    }

    /* renamed from: n3.g$d */
    /* loaded from: classes8.dex */
    public static final class d {

        /* renamed from: a, reason: collision with root package name */
        public final AbstractC5880y<c> f76400a;

        /* renamed from: b, reason: collision with root package name */
        public final int[] f76401b;

        public d(List<c> list, int[] iArr) {
            this.f76400a = AbstractC5880y.n(list);
            this.f76401b = iArr;
        }
    }

    /* renamed from: n3.g$e */
    /* loaded from: classes8.dex */
    public static final class e {

        /* renamed from: a, reason: collision with root package name */
        public final int f76402a;

        /* renamed from: b, reason: collision with root package name */
        public final int f76403b;

        /* renamed from: c, reason: collision with root package name */
        public final int f76404c;

        /* renamed from: d, reason: collision with root package name */
        public final int f76405d;

        /* renamed from: e, reason: collision with root package name */
        public final int f76406e;

        public e(int i11, int i12, int i13, int i14, int i15) {
            this.f76402a = i11;
            this.f76403b = i12;
            this.f76404c = i13;
            this.f76405d = i14;
            this.f76406e = i15;
        }
    }

    /* renamed from: n3.g$f */
    /* loaded from: classes8.dex */
    public static final class f {

        /* renamed from: a, reason: collision with root package name */
        public final AbstractC5880y<e> f76407a;

        /* renamed from: b, reason: collision with root package name */
        public final int[] f76408b;

        public f(List<e> list, int[] iArr) {
            this.f76407a = AbstractC5880y.n(list);
            this.f76408b = iArr;
        }
    }

    /* renamed from: n3.g$g, reason: collision with other inner class name */
    /* loaded from: classes8.dex */
    public static final class C1287g {

        /* renamed from: a, reason: collision with root package name */
        public final int f76409a;

        public C1287g(int i11) {
            this.f76409a = i11;
        }
    }

    /* renamed from: n3.g$h */
    /* loaded from: classes8.dex */
    public static final class h {

        /* renamed from: a, reason: collision with root package name */
        public final int f76410a;

        /* renamed from: b, reason: collision with root package name */
        public final c f76411b;

        /* renamed from: c, reason: collision with root package name */
        public final int f76412c;

        /* renamed from: d, reason: collision with root package name */
        public final int f76413d;

        /* renamed from: e, reason: collision with root package name */
        public final int f76414e;

        /* renamed from: f, reason: collision with root package name */
        public final int f76415f;

        /* renamed from: g, reason: collision with root package name */
        public final int f76416g;

        /* renamed from: h, reason: collision with root package name */
        public final int f76417h;

        /* renamed from: i, reason: collision with root package name */
        public final float f76418i;

        /* renamed from: j, reason: collision with root package name */
        public final int f76419j;

        /* renamed from: k, reason: collision with root package name */
        public final int f76420k;

        /* renamed from: l, reason: collision with root package name */
        public final int f76421l;

        /* renamed from: m, reason: collision with root package name */
        public final int f76422m;

        public h(int i11, c cVar, int i12, int i13, int i14, int i15, int i16, int i17, float f7, int i18, int i19, int i21, int i22) {
            this.f76410a = i11;
            this.f76411b = cVar;
            this.f76412c = i12;
            this.f76413d = i13;
            this.f76414e = i14;
            this.f76415f = i15;
            this.f76418i = f7;
            this.f76419j = i18;
            this.f76420k = i19;
            this.f76421l = i21;
            this.f76422m = i22;
            this.f76416g = i16;
            this.f76417h = i17;
        }
    }

    /* renamed from: n3.g$i */
    /* loaded from: classes8.dex */
    public static final class i {

        /* renamed from: a, reason: collision with root package name */
        public final int f76423a;

        /* renamed from: b, reason: collision with root package name */
        public final int f76424b;

        /* renamed from: c, reason: collision with root package name */
        public final int f76425c;

        public i(int i11, int i12, int i13) {
            this.f76423a = i11;
            this.f76424b = i12;
            this.f76425c = i13;
        }
    }

    /* renamed from: n3.g$j */
    /* loaded from: classes8.dex */
    public static final class j {

        /* renamed from: a, reason: collision with root package name */
        public final AbstractC5880y<i> f76426a;

        /* renamed from: b, reason: collision with root package name */
        public final int[] f76427b;

        public j(List<i> list, int[] iArr) {
            this.f76426a = AbstractC5880y.n(list);
            this.f76427b = iArr;
        }
    }

    /* renamed from: n3.g$k */
    /* loaded from: classes8.dex */
    public static final class k {

        /* renamed from: a, reason: collision with root package name */
        public final AbstractC5880y<a> f76428a;

        /* renamed from: b, reason: collision with root package name */
        public final d f76429b;

        /* renamed from: c, reason: collision with root package name */
        public final f f76430c;

        /* renamed from: d, reason: collision with root package name */
        public final j f76431d;

        public k(List list, d dVar, f fVar, j jVar) {
            this.f76428a = list != null ? AbstractC5880y.n(list) : AbstractC5880y.v();
            this.f76429b = dVar;
            this.f76430c = fVar;
            this.f76431d = jVar;
        }
    }

    /* renamed from: n3.g$l */
    /* loaded from: classes8.dex */
    public static final class l {

        /* renamed from: a, reason: collision with root package name */
        public final int f76432a;

        /* renamed from: b, reason: collision with root package name */
        public final int f76433b;

        /* renamed from: c, reason: collision with root package name */
        public final boolean f76434c;

        public l(int i11, int i12, boolean z11) {
            this.f76432a = i11;
            this.f76433b = i12;
            this.f76434c = z11;
        }
    }

    /* renamed from: n3.g$m */
    public static final class m {

        /* renamed from: a, reason: collision with root package name */
        public final int f76435a;

        /* renamed from: b, reason: collision with root package name */
        public final int f76436b;

        /* renamed from: c, reason: collision with root package name */
        public final int f76437c;

        /* renamed from: d, reason: collision with root package name */
        public final int f76438d;

        /* renamed from: e, reason: collision with root package name */
        public final int f76439e;

        /* renamed from: f, reason: collision with root package name */
        public final int f76440f;

        /* renamed from: g, reason: collision with root package name */
        public final float f76441g;

        /* renamed from: h, reason: collision with root package name */
        public final int f76442h;

        /* renamed from: i, reason: collision with root package name */
        public final int f76443i;

        /* renamed from: j, reason: collision with root package name */
        public final boolean f76444j;

        /* renamed from: k, reason: collision with root package name */
        public final boolean f76445k;

        /* renamed from: l, reason: collision with root package name */
        public final int f76446l;

        /* renamed from: m, reason: collision with root package name */
        public final int f76447m;

        /* renamed from: n, reason: collision with root package name */
        public final int f76448n;

        /* renamed from: o, reason: collision with root package name */
        public final boolean f76449o;

        /* renamed from: p, reason: collision with root package name */
        public final int f76450p;

        /* renamed from: q, reason: collision with root package name */
        public final int f76451q;

        /* renamed from: r, reason: collision with root package name */
        public final int f76452r;

        /* renamed from: s, reason: collision with root package name */
        public final int f76453s;

        public m(int i11, int i12, int i13, int i14, int i15, int i16, float f7, int i17, int i18, boolean z11, boolean z12, int i19, int i21, int i22, boolean z13, int i23, int i24, int i25, int i26) {
            this.f76435a = i11;
            this.f76436b = i12;
            this.f76437c = i13;
            this.f76438d = i14;
            this.f76439e = i15;
            this.f76440f = i16;
            this.f76441g = f7;
            this.f76442h = i17;
            this.f76443i = i18;
            this.f76444j = z11;
            this.f76445k = z12;
            this.f76446l = i19;
            this.f76447m = i21;
            this.f76448n = i22;
            this.f76449o = z13;
            this.f76450p = i23;
            this.f76451q = i24;
            this.f76452r = i25;
            this.f76453s = i26;
        }
    }

    public static void a(boolean[] zArr) {
        zArr[0] = false;
        zArr[1] = false;
        zArr[2] = false;
    }

    public static int b(byte[] bArr, int i11, int i12, boolean[] zArr) {
        int i13 = i12 - i11;
        G10.a.h(i13 >= 0);
        if (i13 == 0) {
            return i12;
        }
        if (zArr[0]) {
            a(zArr);
            return i11 - 3;
        }
        if (i13 > 1 && zArr[1] && bArr[i11] == 1) {
            a(zArr);
            return i11 - 2;
        }
        if (i13 > 2 && zArr[2] && bArr[i11] == 0 && bArr[i11 + 1] == 1) {
            a(zArr);
            return i11 - 1;
        }
        int i14 = i12 - 1;
        int i15 = i11 + 2;
        while (i15 < i14) {
            byte b11 = bArr[i15];
            if ((b11 & 254) == 0) {
                int i16 = i15 - 2;
                if (bArr[i16] == 0 && bArr[i15 - 1] == 0 && b11 == 1) {
                    a(zArr);
                    return i16;
                }
                i15 -= 2;
            }
            i15 += 3;
        }
        zArr[0] = i13 <= 2 ? !(i13 != 2 ? !(zArr[1] && bArr[i14] == 1) : !(zArr[2] && bArr[i12 + (-2)] == 0 && bArr[i14] == 1)) : bArr[i12 + (-3)] == 0 && bArr[i12 + (-2)] == 0 && bArr[i14] == 1;
        zArr[1] = i13 <= 1 ? zArr[2] && bArr[i14] == 0 : bArr[i12 + (-2)] == 0 && bArr[i14] == 0;
        zArr[2] = bArr[i14] == 0;
        return i12;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static String c(List<byte[]> list) {
        for (int i11 = 0; i11 < list.size(); i11++) {
            byte[] bArr = list.get(i11);
            int length = bArr.length;
            if (length > 3) {
                boolean[] zArr = new boolean[3];
                int i12 = AbstractC5880y.f59142c;
                AbstractC5880y.a aVar = new AbstractC5880y.a();
                int i13 = 0;
                while (i13 < bArr.length) {
                    int b11 = b(bArr, i13, bArr.length, zArr);
                    if (b11 != bArr.length) {
                        aVar.e(Integer.valueOf(b11));
                    }
                    i13 = b11 + 3;
                }
                AbstractC5880y j11 = aVar.j();
                for (int i14 = 0; i14 < j11.size(); i14++) {
                    if (((Integer) j11.get(i14)).intValue() + 3 < length) {
                        C8435h c8435h = new C8435h(bArr, ((Integer) j11.get(i14)).intValue() + 3, length);
                        b f7 = f(c8435h);
                        if (f7.f76391a == 33 && f7.f76392b == 0) {
                            c8435h.l(4);
                            int f11 = c8435h.f(3);
                            c8435h.k();
                            c g10 = g(c8435h, true, f11, null);
                            return C8065g.a(g10.f76394a, g10.f76395b, g10.f76396c, g10.f76397d, g10.f76398e, g10.f76399f);
                        }
                    }
                }
            }
        }
        return null;
    }

    public static boolean d(byte[] bArr, int i11, C7272n c7272n) {
        int i12;
        if (Objects.equals(c7272n.f69127o, "video/avc")) {
            byte b11 = bArr[4];
            if (((b11 & 96) >> 5) == 0 && ((i12 = b11 & 31) == 1 || i12 == 9 || i12 == 14)) {
                return false;
            }
        } else if (Objects.equals(c7272n.f69127o, "video/hevc")) {
            b f7 = f(new C8435h(bArr, 4, i11 + 4));
            int i13 = f7.f76391a;
            if (i13 == 35) {
                return false;
            }
            if (i13 <= 14 && i13 % 2 == 0) {
                if (f7.f76393c == c7272n.f69101F - 1) {
                    return false;
                }
            }
        }
        return true;
    }

    public static int e(C7272n c7272n) {
        if (Objects.equals(c7272n.f69127o, "video/avc")) {
            return 1;
        }
        return (Objects.equals(c7272n.f69127o, "video/hevc") || u.b(c7272n.f69123k, "video/hevc") != null) ? 2 : 0;
    }

    private static b f(C8435h c8435h) {
        c8435h.k();
        return new b(c8435h.f(6), c8435h.f(6), c8435h.f(3) - 1);
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0076  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static c g(C8435h c8435h, boolean z11, int i11, c cVar) {
        int[] iArr;
        int i12;
        boolean z12;
        int i13;
        int i14;
        boolean z13;
        int i15;
        int i16;
        int[] iArr2 = new int[6];
        if (z11) {
            int f7 = c8435h.f(2);
            z13 = c8435h.e();
            i15 = c8435h.f(5);
            i16 = 0;
            for (int i17 = 0; i17 < 32; i17++) {
                if (c8435h.e()) {
                    i16 |= 1 << i17;
                }
            }
            for (int i18 = 0; i18 < 6; i18++) {
                iArr2[i18] = c8435h.f(8);
            }
            i12 = f7;
        } else {
            if (cVar == null) {
                iArr = iArr2;
                i12 = 0;
                z12 = false;
                i13 = 0;
                i14 = 0;
                int f11 = c8435h.f(8);
                int i19 = 0;
                for (int i21 = 0; i21 < i11; i21++) {
                    if (c8435h.e()) {
                        i19 += 88;
                    }
                    if (c8435h.e()) {
                        i19 += 8;
                    }
                }
                c8435h.l(i19);
                if (i11 > 0) {
                    c8435h.l((8 - i11) * 2);
                }
                return new c(i12, z12, i13, i14, iArr, f11);
            }
            int i22 = cVar.f76394a;
            z13 = cVar.f76395b;
            i15 = cVar.f76396c;
            i16 = cVar.f76397d;
            iArr2 = cVar.f76398e;
            i12 = i22;
        }
        iArr = iArr2;
        z12 = z13;
        i13 = i15;
        i14 = i16;
        int f112 = c8435h.f(8);
        int i192 = 0;
        while (i21 < i11) {
        }
        c8435h.l(i192);
        if (i11 > 0) {
        }
        return new c(i12, z12, i13, i14, iArr, f112);
    }

    public static C1287g h(int i11, int i12, byte[] bArr) {
        byte b11;
        int i13 = i11 + 2;
        do {
            i12--;
            b11 = bArr[i12];
            if (b11 != 0) {
                break;
            }
        } while (i12 > i13);
        if (b11 == 0 || i12 <= i13) {
            return null;
        }
        C8435h c8435h = new C8435h(bArr, i13, i12 + 1);
        while (c8435h.c(16)) {
            int f7 = c8435h.f(8);
            int i14 = 0;
            while (f7 == 255) {
                i14 += 255;
                f7 = c8435h.f(8);
            }
            int i15 = i14 + f7;
            int f11 = c8435h.f(8);
            int i16 = 0;
            while (f11 == 255) {
                i16 += 255;
                f11 = c8435h.f(8);
            }
            int i17 = i16 + f11;
            if (i17 == 0 || !c8435h.c(i17)) {
                return null;
            }
            if (i15 == 176) {
                int h11 = c8435h.h();
                boolean e11 = c8435h.e();
                int h12 = e11 ? c8435h.h() : 0;
                int h13 = c8435h.h();
                int i18 = -1;
                for (int i19 = 0; i19 <= h13; i19++) {
                    i18 = c8435h.h();
                    c8435h.h();
                    int f12 = c8435h.f(6);
                    if (f12 == 63) {
                        return null;
                    }
                    c8435h.f(f12 == 0 ? Math.max(0, h11 - 30) : Math.max(0, (f12 + h11) - 31));
                    if (e11) {
                        int f13 = c8435h.f(6);
                        if (f13 == 63) {
                            return null;
                        }
                        c8435h.f(f13 == 0 ? Math.max(0, h12 - 30) : Math.max(0, (f13 + h12) - 31));
                    }
                    if (c8435h.e()) {
                        c8435h.l(10);
                    }
                }
                return new C1287g(i18);
            }
            c8435h.l(i17 * 8);
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:170:0x02f2  */
    /* JADX WARN: Removed duplicated region for block: B:176:0x030d  */
    /* JADX WARN: Removed duplicated region for block: B:219:0x03c6  */
    /* JADX WARN: Removed duplicated region for block: B:221:0x0138  */
    /* JADX WARN: Removed duplicated region for block: B:224:0x00b4  */
    /* JADX WARN: Removed duplicated region for block: B:241:0x0054  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0116  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0151  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x01a8  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x01c6  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static h i(byte[] bArr, int i11, int i12, k kVar) {
        int i13;
        int i14;
        int i15;
        int i16;
        int h11;
        int i17;
        int h12;
        int i18;
        int i19;
        int i21;
        int h13;
        int i22;
        c cVar;
        int i23;
        int i24;
        int i25;
        int i26;
        int i27;
        int i28;
        int i29;
        int i31;
        int i32;
        j jVar;
        int i33;
        int i34;
        int i35;
        f fVar;
        b f7 = f(new C8435h(bArr, i11, i12));
        C8435h c8435h = new C8435h(bArr, i11 + 2, i12);
        int i36 = 4;
        c8435h.l(4);
        int f11 = c8435h.f(3);
        int i37 = f7.f76392b;
        boolean z11 = i37 != 0 && f11 == 7;
        if (kVar != null) {
            AbstractC5880y<a> abstractC5880y = kVar.f76428a;
            if (!abstractC5880y.isEmpty()) {
                i13 = abstractC5880y.get(Math.min(i37, abstractC5880y.size() - 1)).f76389a;
                c cVar2 = null;
                if (z11) {
                    c8435h.k();
                    cVar2 = g(c8435h, true, f11, null);
                } else if (kVar != null) {
                    d dVar = kVar.f76429b;
                    int i38 = dVar.f76401b[i13];
                    AbstractC5880y<c> abstractC5880y2 = dVar.f76400a;
                    if (abstractC5880y2.size() > i38) {
                        cVar2 = abstractC5880y2.get(i38);
                    }
                }
                c8435h.h();
                if (z11) {
                    int h14 = c8435h.h();
                    if (h14 == 3) {
                        c8435h.k();
                    }
                    int h15 = c8435h.h();
                    int h16 = c8435h.h();
                    if (c8435h.e()) {
                        int h17 = c8435h.h();
                        int h18 = c8435h.h();
                        int h19 = c8435h.h();
                        int h21 = c8435h.h();
                        i14 = h15 - ((h17 + h18) * ((h14 == 1 || h14 == 2) ? 2 : 1));
                        i15 = h16 - ((h19 + h21) * (h14 == 1 ? 2 : 1));
                    } else {
                        i14 = h15;
                        i15 = h16;
                    }
                    i16 = i15;
                    h11 = c8435h.h();
                    i17 = i14;
                    h12 = c8435h.h();
                    i18 = h16;
                    i19 = h15;
                } else {
                    int f12 = c8435h.e() ? c8435h.f(8) : -1;
                    if (kVar != null && (fVar = kVar.f76430c) != null) {
                        if (f12 == -1) {
                            f12 = fVar.f76408b[i13];
                        }
                        if (f12 != -1) {
                            AbstractC5880y<e> abstractC5880y3 = fVar.f76407a;
                            if (abstractC5880y3.size() > f12) {
                                e eVar = abstractC5880y3.get(f12);
                                int i39 = eVar.f76402a;
                                i17 = eVar.f76405d;
                                int i41 = eVar.f76406e;
                                h11 = eVar.f76403b;
                                h12 = eVar.f76404c;
                                i16 = i41;
                                i18 = i16;
                                i19 = i17;
                            }
                        }
                    }
                    h11 = 0;
                    h12 = 0;
                    i17 = 0;
                    i19 = 0;
                    i16 = 0;
                    i18 = 0;
                }
                int h22 = c8435h.h();
                if (z11) {
                    i21 = -1;
                    for (int i42 = c8435h.e() ? 0 : f11; i42 <= f11; i42++) {
                        c8435h.h();
                        i21 = Math.max(c8435h.h(), i21);
                        c8435h.h();
                    }
                } else {
                    i21 = -1;
                }
                c8435h.h();
                c8435h.h();
                c8435h.h();
                c8435h.h();
                c8435h.h();
                c8435h.h();
                if (c8435h.e()) {
                    int i43 = 6;
                    if (z11 ? c8435h.e() : false) {
                        c8435h.l(6);
                    } else if (c8435h.e()) {
                        int i44 = 0;
                        while (i44 < i36) {
                            int i45 = 0;
                            while (i45 < i43) {
                                if (c8435h.e()) {
                                    int min = Math.min(64, 1 << ((i44 << 1) + 4));
                                    if (i44 > 1) {
                                        c8435h.g();
                                    }
                                    for (int i46 = 0; i46 < min; i46++) {
                                        c8435h.g();
                                    }
                                } else {
                                    c8435h.h();
                                }
                                i45 += i44 == 3 ? 3 : 1;
                                i43 = 6;
                            }
                            i44++;
                            i36 = 4;
                            i43 = 6;
                        }
                    }
                }
                c8435h.l(2);
                if (c8435h.e()) {
                    c8435h.l(8);
                    c8435h.h();
                    c8435h.h();
                    c8435h.k();
                }
                h13 = c8435h.h();
                int[] iArr = new int[0];
                int[] iArr2 = new int[0];
                i22 = 0;
                int i47 = -1;
                int i48 = -1;
                while (i22 < h13) {
                    if (i22 == 0 || !c8435h.e()) {
                        i33 = h13;
                        i34 = i22;
                        i35 = i13;
                        int h23 = c8435h.h();
                        i47 = c8435h.h();
                        int[] iArr3 = new int[h23];
                        int i49 = 0;
                        while (i49 < h23) {
                            iArr3[i49] = (i49 > 0 ? iArr3[i49 - 1] : 0) - (c8435h.h() + 1);
                            c8435h.k();
                            i49++;
                        }
                        int[] iArr4 = new int[i47];
                        int i51 = 0;
                        while (i51 < i47) {
                            iArr4[i51] = c8435h.h() + 1 + (i51 > 0 ? iArr4[i51 - 1] : 0);
                            c8435h.k();
                            i51++;
                        }
                        i48 = h23;
                        iArr = iArr3;
                        iArr2 = iArr4;
                    } else {
                        i33 = h13;
                        int i52 = i48 + i47;
                        int h24 = (1 - ((c8435h.e() ? 1 : 0) * 2)) * (c8435h.h() + 1);
                        i34 = i22;
                        int i53 = i52 + 1;
                        i35 = i13;
                        boolean[] zArr = new boolean[i53];
                        for (int i54 = 0; i54 <= i52; i54++) {
                            if (c8435h.e()) {
                                zArr[i54] = true;
                            } else {
                                zArr[i54] = c8435h.e();
                            }
                        }
                        int[] iArr5 = new int[i53];
                        int[] iArr6 = new int[i53];
                        int i55 = 0;
                        for (int i56 = i47 - 1; i56 >= 0; i56--) {
                            int i57 = iArr2[i56] + h24;
                            if (i57 < 0 && zArr[i48 + i56]) {
                                iArr5[i55] = i57;
                                i55++;
                            }
                        }
                        if (h24 < 0 && zArr[i52]) {
                            iArr5[i55] = h24;
                            i55++;
                        }
                        int i58 = i55;
                        int[] iArr7 = iArr;
                        for (int i59 = 0; i59 < i48; i59++) {
                            int i61 = iArr7[i59] + h24;
                            if (i61 < 0 && zArr[i59]) {
                                iArr5[i58] = i61;
                                i58++;
                            }
                        }
                        int[] copyOf = Arrays.copyOf(iArr5, i58);
                        int i62 = 0;
                        for (int i63 = i48 - 1; i63 >= 0; i63--) {
                            int i64 = iArr7[i63] + h24;
                            if (i64 > 0 && zArr[i63]) {
                                iArr6[i62] = i64;
                                i62++;
                            }
                        }
                        if (h24 > 0 && zArr[i52]) {
                            iArr6[i62] = h24;
                            i62++;
                        }
                        int i65 = i58;
                        int i66 = i62;
                        for (int i67 = 0; i67 < i47; i67++) {
                            int i68 = iArr2[i67] + h24;
                            if (i68 > 0 && zArr[i48 + i67]) {
                                iArr6[i66] = i68;
                                i66++;
                            }
                        }
                        iArr2 = Arrays.copyOf(iArr6, i66);
                        i47 = i66;
                        i48 = i65;
                        iArr = copyOf;
                    }
                    i22 = i34 + 1;
                    h13 = i33;
                    i13 = i35;
                }
                int i69 = i13;
                if (c8435h.e()) {
                    int h25 = c8435h.h();
                    for (int i71 = 0; i71 < h25; i71++) {
                        c8435h.l(h22 + 5);
                    }
                }
                c8435h.l(2);
                float f13 = 1.0f;
                if (c8435h.e()) {
                    cVar = cVar2;
                    i23 = h11;
                    i24 = h12;
                    i25 = i16;
                    i26 = -1;
                    i27 = -1;
                    i28 = -1;
                } else {
                    if (c8435h.e()) {
                        int f14 = c8435h.f(8);
                        if (f14 == 255) {
                            int f15 = c8435h.f(16);
                            int f16 = c8435h.f(16);
                            if (f15 != 0 && f16 != 0) {
                                f13 = f15 / f16;
                            }
                        } else if (f14 < 17) {
                            f13 = f76386b[f14];
                        } else {
                            C3261b.f(f14, "Unexpected aspect_ratio_idc value: ", "NalUnitUtil");
                        }
                    }
                    if (c8435h.e()) {
                        c8435h.k();
                    }
                    if (c8435h.e()) {
                        c8435h.l(3);
                        i32 = c8435h.e() ? 1 : 2;
                        if (c8435h.e()) {
                            int f17 = c8435h.f(8);
                            int f18 = c8435h.f(8);
                            c8435h.l(8);
                            i29 = C7267i.g(f17);
                            i31 = C7267i.h(f18);
                        } else {
                            i29 = -1;
                            i31 = -1;
                        }
                    } else {
                        if (kVar != null && (jVar = kVar.f76431d) != null) {
                            int i72 = jVar.f76427b[i69];
                            AbstractC5880y<i> abstractC5880y4 = jVar.f76426a;
                            if (abstractC5880y4.size() > i72) {
                                i iVar = abstractC5880y4.get(i72);
                                int i73 = iVar.f76423a;
                                int i74 = iVar.f76424b;
                                i31 = iVar.f76425c;
                                i29 = i73;
                                i32 = i74;
                            }
                        }
                        i29 = -1;
                        i31 = -1;
                        i32 = -1;
                    }
                    if (c8435h.e()) {
                        c8435h.h();
                        c8435h.h();
                    }
                    c8435h.k();
                    if (c8435h.e()) {
                        i16 *= 2;
                    }
                    i26 = i29;
                    i28 = i31;
                    i27 = i32;
                    cVar = cVar2;
                    i23 = h11;
                    i24 = h12;
                    i25 = i16;
                }
                return new h(f11, cVar, i23, i24, i17, i25, i19, i18, f13, i21, i26, i27, i28);
            }
        }
        i13 = 0;
        c cVar22 = null;
        if (z11) {
        }
        c8435h.h();
        if (z11) {
        }
        int h222 = c8435h.h();
        if (z11) {
        }
        c8435h.h();
        c8435h.h();
        c8435h.h();
        c8435h.h();
        c8435h.h();
        c8435h.h();
        if (c8435h.e()) {
        }
        c8435h.l(2);
        if (c8435h.e()) {
        }
        h13 = c8435h.h();
        int[] iArr8 = new int[0];
        int[] iArr22 = new int[0];
        i22 = 0;
        int i472 = -1;
        int i482 = -1;
        while (i22 < h13) {
        }
        int i692 = i13;
        if (c8435h.e()) {
        }
        c8435h.l(2);
        float f132 = 1.0f;
        if (c8435h.e()) {
        }
        return new h(f11, cVar, i23, i24, i17, i25, i19, i18, f132, i21, i26, i27, i28);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0116  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static k j(int i11, int i12, byte[] bArr) {
        int[] iArr;
        int[] iArr2;
        j jVar;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        AbstractC5880y abstractC5880y;
        boolean[][] zArr;
        int i18;
        boolean[][] zArr2;
        int[] iArr3;
        int[] iArr4;
        int i19;
        boolean z11;
        int i21;
        boolean e11;
        int i22;
        int i23;
        int i24;
        boolean e12;
        int i25;
        int i26;
        boolean z12;
        boolean z13;
        C8435h c8435h = new C8435h(bArr, i11, i12);
        f(c8435h);
        c8435h.l(4);
        boolean e13 = c8435h.e();
        boolean e14 = c8435h.e();
        int f7 = c8435h.f(6);
        int i27 = f7 + 1;
        int f11 = c8435h.f(3);
        c8435h.l(17);
        c g10 = g(c8435h, true, f11, null);
        for (int i28 = c8435h.e() ? 0 : f11; i28 <= f11; i28++) {
            c8435h.h();
            c8435h.h();
            c8435h.h();
        }
        int f12 = c8435h.f(6);
        int h11 = c8435h.h() + 1;
        int i29 = 6;
        d dVar = new d(AbstractC5880y.B(g10), new int[1]);
        boolean z14 = i27 >= 2 && h11 >= 2;
        boolean z15 = e13 && e14;
        int i31 = f12 + 1;
        boolean z16 = i31 >= i27;
        if (!z14 || !z15 || !z16) {
            return new k(null, dVar, null, null);
        }
        Class cls = Integer.TYPE;
        int[][] iArr5 = (int[][]) Array.newInstance((Class<?>) cls, h11, i31);
        int i32 = 1;
        int[] iArr6 = new int[h11];
        int[] iArr7 = new int[h11];
        iArr5[0][0] = 0;
        iArr6[0] = 1;
        iArr7[0] = 0;
        for (int i33 = 1; i33 < h11; i33++) {
            int i34 = 0;
            for (int i35 = 0; i35 <= f12; i35++) {
                if (c8435h.e()) {
                    iArr5[i33][i34] = i35;
                    iArr7[i33] = i35;
                    i34++;
                }
                iArr6[i33] = i34;
            }
        }
        if (c8435h.e()) {
            c8435h.l(64);
            if (c8435h.e()) {
                c8435h.h();
            }
            int h12 = c8435h.h();
            int i36 = 0;
            while (i36 < h12) {
                c8435h.h();
                if (i36 == 0 || c8435h.e()) {
                    boolean e15 = c8435h.e();
                    boolean e16 = c8435h.e();
                    z13 = e15;
                    z12 = e16;
                    if (e15 || e16) {
                        e11 = c8435h.e();
                        if (e11) {
                            c8435h.l(19);
                        }
                        c8435h.l(8);
                        if (e11) {
                            c8435h.l(4);
                        }
                        c8435h.l(15);
                        i23 = e15;
                        i22 = e16;
                        i24 = 0;
                        while (i24 <= f11) {
                            boolean e17 = c8435h.e();
                            if (!e17) {
                                e17 = c8435h.e();
                            }
                            if (e17) {
                                c8435h.h();
                                e12 = false;
                            } else {
                                e12 = c8435h.e();
                            }
                            if (e12) {
                                i25 = i36;
                                i26 = 0;
                            } else {
                                i25 = i36;
                                i26 = c8435h.h();
                            }
                            int[][] iArr8 = iArr5;
                            int i37 = i23 + i22;
                            int[] iArr9 = iArr7;
                            int i38 = 0;
                            while (i38 < i37) {
                                int i39 = i37;
                                for (int i41 = 0; i41 <= i26; i41++) {
                                    c8435h.h();
                                    c8435h.h();
                                    if (e11) {
                                        c8435h.h();
                                        c8435h.h();
                                    }
                                    c8435h.k();
                                }
                                i38++;
                                i37 = i39;
                            }
                            i24++;
                            i36 = i25;
                            iArr5 = iArr8;
                            iArr7 = iArr9;
                        }
                        i36++;
                    }
                } else {
                    z13 = false;
                    z12 = false;
                }
                e11 = false;
                i23 = z13;
                i22 = z12;
                i24 = 0;
                while (i24 <= f11) {
                }
                i36++;
            }
        }
        int[][] iArr10 = iArr5;
        int[] iArr11 = iArr7;
        if (!c8435h.e()) {
            return new k(null, dVar, null, null);
        }
        c8435h.b();
        c g11 = g(c8435h, false, f11, g10);
        boolean e18 = c8435h.e();
        boolean[] zArr3 = new boolean[16];
        int i42 = 0;
        for (int i43 = 0; i43 < 16; i43++) {
            boolean e19 = c8435h.e();
            zArr3[i43] = e19;
            if (e19) {
                i42++;
            }
        }
        if (i42 == 0 || !zArr3[1]) {
            return new k(null, dVar, null, null);
        }
        int[] iArr12 = new int[i42];
        for (int i44 = 0; i44 < i42 - (e18 ? 1 : 0); i44++) {
            iArr12[i44] = c8435h.f(3);
        }
        int[] iArr13 = new int[i42 + 1];
        if (e18) {
            int i45 = 1;
            while (i45 < i42) {
                int[] iArr14 = iArr13;
                for (int i46 = 0; i46 < i45; i46++) {
                    iArr14[i45] = iArr12[i46] + 1 + iArr14[i45];
                }
                i45++;
                iArr13 = iArr14;
            }
            iArr = iArr13;
            iArr[i42] = 6;
        } else {
            iArr = iArr13;
        }
        int[][] iArr15 = (int[][]) Array.newInstance((Class<?>) cls, i27, i42);
        int[] iArr16 = new int[i27];
        iArr16[0] = 0;
        boolean e21 = c8435h.e();
        int i47 = 1;
        while (i47 < i27) {
            if (e21) {
                i21 = i47;
                iArr16[i21] = c8435h.f(i29);
            } else {
                i21 = i47;
                iArr16[i21] = i21;
            }
            if (e18) {
                for (int i48 = 0; i48 < i42; i48++) {
                    iArr15[i21][i48] = (iArr16[i21] & ((1 << iArr[r29]) - 1)) >> iArr[i48];
                }
            } else {
                int i49 = 0;
                while (i49 < i42) {
                    int i51 = i49;
                    iArr15[i21][i51] = c8435h.f(iArr12[i49] + 1);
                    i49 = i51 + 1;
                }
            }
            i47 = i21 + 1;
            i29 = 6;
        }
        int[] iArr17 = new int[i31];
        int i52 = 1;
        int i53 = 0;
        while (i53 < i27) {
            iArr17[iArr16[i53]] = -1;
            int[] iArr18 = iArr17;
            int i54 = 0;
            int i55 = 0;
            while (i54 < 16) {
                if (zArr3[i54]) {
                    if (i54 == i32) {
                        iArr18[iArr16[i53]] = iArr15[i53][i55];
                    }
                    i55++;
                }
                i54++;
                i32 = 1;
            }
            if (i53 > 0) {
                int i56 = 0;
                while (true) {
                    if (i56 >= i53) {
                        z11 = true;
                        break;
                    }
                    int i57 = i56;
                    if (iArr18[iArr16[i53]] == iArr18[iArr16[i56]]) {
                        z11 = false;
                        break;
                    }
                    i56 = i57 + 1;
                }
                if (z11) {
                    i52++;
                }
            }
            i53++;
            iArr17 = iArr18;
            i32 = 1;
        }
        int[] iArr19 = iArr17;
        int f13 = c8435h.f(4);
        if (i52 < 2 || f13 == 0) {
            return new k(null, dVar, null, null);
        }
        int[] iArr20 = new int[i52];
        for (int i58 = 0; i58 < i52; i58++) {
            iArr20[i58] = c8435h.f(f13);
        }
        int[] iArr21 = new int[i31];
        for (int i59 = 0; i59 < i27; i59++) {
            iArr21[Math.min(iArr16[i59], f12)] = i59;
        }
        AbstractC5880y.a aVar = new AbstractC5880y.a();
        int i61 = 0;
        while (i61 <= f12) {
            int[] iArr22 = iArr21;
            int i62 = i52;
            int min = Math.min(iArr19[i61], i62 - 1);
            aVar.e(new a(iArr22[i61], min >= 0 ? iArr20[min] : -1));
            i61++;
            iArr21 = iArr22;
            iArr16 = iArr16;
            i52 = i62;
        }
        int[] iArr23 = iArr16;
        AbstractC5880y j11 = aVar.j();
        if (((a) j11.get(0)).f76390b == -1) {
            return new k(null, dVar, null, null);
        }
        int i63 = 1;
        while (true) {
            if (i63 > f12) {
                i63 = -1;
                break;
            }
            if (((a) j11.get(i63)).f76390b != -1) {
                break;
            }
            i63++;
        }
        if (i63 == -1) {
            return new k(null, dVar, null, null);
        }
        Class cls2 = Boolean.TYPE;
        boolean[][] zArr4 = (boolean[][]) Array.newInstance((Class<?>) cls2, i27, i27);
        boolean[][] zArr5 = (boolean[][]) Array.newInstance((Class<?>) cls2, i27, i27);
        for (int i64 = 1; i64 < i27; i64++) {
            for (int i65 = 0; i65 < i64; i65++) {
                boolean[] zArr6 = zArr4[i64];
                boolean[] zArr7 = zArr5[i64];
                boolean e22 = c8435h.e();
                zArr7[i65] = e22;
                zArr6[i65] = e22;
            }
        }
        for (int i66 = 1; i66 < i27; i66++) {
            int i67 = 0;
            while (i67 < f7) {
                boolean[][] zArr8 = zArr4;
                int i68 = 0;
                while (true) {
                    if (i68 < i66) {
                        boolean[] zArr9 = zArr5[i66];
                        if (zArr9[i68] && zArr5[i68][i67]) {
                            zArr9[i67] = true;
                            break;
                        }
                        i68++;
                    }
                }
                i67++;
                zArr4 = zArr8;
            }
        }
        boolean[][] zArr10 = zArr4;
        int[] iArr24 = new int[i31];
        for (int i69 = 0; i69 < i27; i69++) {
            int i71 = 0;
            for (int i72 = 0; i72 < i69; i72++) {
                i71 += zArr10[i69][i72] ? 1 : 0;
            }
            iArr24[iArr23[i69]] = i71;
        }
        int i73 = 0;
        for (int i74 = 0; i74 < i27; i74++) {
            if (iArr24[iArr23[i74]] == 0) {
                i73++;
            }
        }
        if (i73 > 1) {
            return new k(null, dVar, null, null);
        }
        int[] iArr25 = new int[i27];
        int[] iArr26 = new int[h11];
        if (c8435h.e()) {
            iArr2 = iArr24;
            int i75 = 0;
            while (i75 < i27) {
                int i76 = i75;
                iArr25[i76] = c8435h.f(3);
                i75 = i76 + 1;
            }
        } else {
            iArr2 = iArr24;
            Arrays.fill(iArr25, 0, i27, f11);
        }
        int i77 = 0;
        while (i77 < h11) {
            int i78 = i77;
            boolean[][] zArr11 = zArr5;
            int[] iArr27 = iArr25;
            int i79 = 0;
            for (int i81 = 0; i81 < iArr6[i78]; i81++) {
                i79 = Math.max(i79, iArr27[((a) j11.get(iArr10[i78][i81])).f76389a]);
            }
            iArr26[i78] = i79 + 1;
            i77 = i78 + 1;
            zArr5 = zArr11;
            iArr25 = iArr27;
        }
        boolean[][] zArr12 = zArr5;
        if (c8435h.e()) {
            int i82 = 0;
            while (i82 < f7) {
                int i83 = i82 + 1;
                int i84 = i83;
                while (i84 < i27) {
                    if (zArr10[i84][i82]) {
                        i19 = f7;
                        c8435h.l(3);
                    } else {
                        i19 = f7;
                    }
                    i84++;
                    f7 = i19;
                }
                i82 = i83;
            }
        }
        c8435h.k();
        int h13 = c8435h.h() + 1;
        AbstractC5880y.a aVar2 = new AbstractC5880y.a();
        aVar2.e(g10);
        if (h13 > 1) {
            aVar2.e(g11);
            for (int i85 = 2; i85 < h13; i85++) {
                g11 = g(c8435h, c8435h.e(), f11, g11);
                aVar2.e(g11);
            }
        }
        AbstractC5880y j12 = aVar2.j();
        int h14 = c8435h.h() + h11;
        if (h14 > h11) {
            return new k(null, dVar, null, null);
        }
        int f14 = c8435h.f(2);
        boolean[][] zArr13 = (boolean[][]) Array.newInstance((Class<?>) cls2, h14, i31);
        int[] iArr28 = new int[h14];
        int i86 = 0;
        int[] iArr29 = new int[h14];
        int i87 = 0;
        while (i87 < h11) {
            iArr28[i87] = i86;
            iArr29[i87] = iArr11[i87];
            if (f14 == 0) {
                i18 = i87;
                zArr2 = zArr13;
                iArr3 = iArr28;
                iArr4 = iArr26;
                Arrays.fill(zArr13[i18], i86, iArr6[i18], true);
                iArr3[i18] = iArr6[i18];
            } else {
                i18 = i87;
                zArr2 = zArr13;
                iArr3 = iArr28;
                iArr4 = iArr26;
                if (f14 == 1) {
                    int i88 = iArr11[i18];
                    for (int i89 = 0; i89 < iArr6[i18]; i89++) {
                        zArr2[i18][i89] = iArr10[i18][i89] == i88;
                    }
                    iArr3[i18] = 1;
                } else {
                    i86 = 0;
                    zArr2[0][0] = true;
                    iArr3[0] = 1;
                    i87 = i18 + 1;
                    zArr13 = zArr2;
                    iArr28 = iArr3;
                    iArr26 = iArr4;
                }
            }
            i86 = 0;
            i87 = i18 + 1;
            zArr13 = zArr2;
            iArr28 = iArr3;
            iArr26 = iArr4;
        }
        boolean[][] zArr14 = zArr13;
        int[] iArr30 = iArr28;
        int[] iArr31 = iArr26;
        int[] iArr32 = new int[i31];
        int i91 = 2;
        int[] iArr33 = new int[2];
        iArr33[1] = i31;
        iArr33[i86] = h14;
        boolean[][] zArr15 = (boolean[][]) Array.newInstance((Class<?>) cls2, iArr33);
        int i92 = 1;
        int i93 = 0;
        while (i92 < h14) {
            if (f14 == i91) {
                for (int i94 = 0; i94 < iArr6[i92]; i94++) {
                    zArr14[i92][i94] = c8435h.e();
                    int i95 = iArr30[i92];
                    boolean z17 = zArr14[i92][i94];
                    iArr30[i92] = i95 + (z17 ? 1 : 0);
                    if (z17) {
                        iArr29[i92] = iArr10[i92][i94];
                    }
                }
            }
            if (i93 == 0) {
                i17 = 0;
                if (iArr10[i92][0] == 0 && zArr14[i92][0]) {
                    for (int i96 = 1; i96 < iArr6[i92]; i96++) {
                        if (iArr10[i92][i96] == i63 && zArr14[i92][i63]) {
                            i93 = i92;
                        }
                    }
                }
            } else {
                i17 = 0;
            }
            int i97 = i17;
            while (i97 < iArr6[i92]) {
                if (h13 > 1) {
                    zArr15[i92][i97] = zArr14[i92][i97];
                    abstractC5880y = j12;
                    zArr = zArr15;
                    RoundingMode roundingMode = RoundingMode.CEILING;
                    int c11 = Q7.a.c(h13);
                    if (!zArr[i92][i97]) {
                        int i98 = ((a) j11.get(iArr10[i92][i97])).f76389a;
                        int i99 = i17;
                        while (true) {
                            if (i99 >= i97) {
                                break;
                            }
                            int i100 = i99;
                            if (zArr12[i98][((a) j11.get(iArr10[i92][i100])).f76389a]) {
                                zArr[i92][i97] = true;
                                break;
                            }
                            i99 = i100 + 1;
                        }
                    }
                    if (zArr[i92][i97]) {
                        if (i93 <= 0 || i92 != i93) {
                            c8435h.l(c11);
                        } else {
                            iArr32[i97] = c8435h.f(c11);
                        }
                    }
                } else {
                    abstractC5880y = j12;
                    zArr = zArr15;
                }
                i97++;
                j12 = abstractC5880y;
                zArr15 = zArr;
            }
            AbstractC5880y abstractC5880y2 = j12;
            boolean[][] zArr16 = zArr15;
            if (iArr30[i92] == 1 && iArr2[iArr29[i92]] > 0) {
                c8435h.k();
            }
            i92++;
            j12 = abstractC5880y2;
            zArr15 = zArr16;
            i91 = 2;
        }
        AbstractC5880y abstractC5880y3 = j12;
        boolean[][] zArr17 = zArr15;
        if (i93 == 0) {
            return new k(null, dVar, null, null);
        }
        int h15 = c8435h.h();
        int i101 = h15 + 1;
        AbstractC5880y.a m11 = AbstractC5880y.m(i101);
        int[] iArr34 = new int[i27];
        for (int i102 = 0; i102 < i101; i102 = i16 + 1) {
            int f15 = c8435h.f(16);
            int f16 = c8435h.f(16);
            if (c8435h.e()) {
                i13 = c8435h.f(2);
                if (i13 == 3) {
                    c8435h.k();
                }
                i14 = c8435h.f(4);
                i15 = c8435h.f(4);
            } else {
                i13 = 0;
                i14 = 0;
                i15 = 0;
            }
            if (c8435h.e()) {
                int h16 = c8435h.h();
                int h17 = c8435h.h();
                int h18 = c8435h.h();
                int h19 = c8435h.h();
                i16 = i102;
                f15 -= (h16 + h17) * ((i13 == 1 || i13 == 2) ? 2 : 1);
                f16 -= (h18 + h19) * (i13 == 1 ? 2 : 1);
            } else {
                i16 = i102;
            }
            m11.e(new e(i13, i14, i15, f15, f16));
        }
        if (i101 <= 1 || !c8435h.e()) {
            for (int i103 = 1; i103 < i27; i103++) {
                iArr34[i103] = Math.min(i103, h15);
            }
        } else {
            RoundingMode roundingMode2 = RoundingMode.CEILING;
            int c12 = Q7.a.c(i101);
            for (int i104 = 1; i104 < i27; i104++) {
                iArr34[i104] = c8435h.f(c12);
            }
        }
        f fVar = new f(m11.j(), iArr34);
        c8435h.l(2);
        for (int i105 = 1; i105 < i27; i105++) {
            if (iArr2[iArr23[i105]] == 0) {
                c8435h.k();
            }
        }
        for (int i106 = 1; i106 < h14; i106++) {
            boolean e23 = c8435h.e();
            int i107 = 0;
            while (i107 < iArr31[i106]) {
                if ((i107 <= 0 || !e23) ? i107 == 0 : c8435h.e()) {
                    for (int i108 = 0; i108 < iArr6[i106]; i108++) {
                        if (zArr17[i106][i108]) {
                            c8435h.h();
                        }
                    }
                    c8435h.h();
                    c8435h.h();
                }
                i107++;
            }
        }
        int h21 = c8435h.h() + 2;
        if (c8435h.e()) {
            c8435h.l(h21);
        } else {
            for (int i109 = 1; i109 < i27; i109++) {
                for (int i110 = 0; i110 < i109; i110++) {
                    if (zArr10[i109][i110]) {
                        c8435h.l(h21);
                    }
                }
            }
        }
        int h22 = c8435h.h();
        for (int i111 = 1; i111 <= h22; i111++) {
            c8435h.l(8);
        }
        if (c8435h.e()) {
            c8435h.b();
            if (!c8435h.e() ? c8435h.e() : true) {
                c8435h.k();
            }
            boolean e24 = c8435h.e();
            boolean e25 = c8435h.e();
            if (e24 || e25) {
                for (int i112 = 0; i112 < h11; i112++) {
                    for (int i113 = 0; i113 < iArr31[i112]; i113++) {
                        boolean e26 = e24 ? c8435h.e() : false;
                        boolean e27 = e25 ? c8435h.e() : false;
                        if (e26) {
                            c8435h.l(32);
                        }
                        if (e27) {
                            c8435h.l(18);
                        }
                    }
                }
            }
            boolean e28 = c8435h.e();
            int f17 = e28 ? c8435h.f(4) + 1 : i27;
            AbstractC5880y.a m12 = AbstractC5880y.m(f17);
            int[] iArr35 = new int[i27];
            for (int i114 = 0; i114 < f17; i114++) {
                c8435h.l(3);
                int i115 = c8435h.e() ? 1 : 2;
                int g12 = C7267i.g(c8435h.f(8));
                int h23 = C7267i.h(c8435h.f(8));
                c8435h.l(8);
                m12.e(new i(g12, i115, h23));
            }
            if (e28 && f17 > 1) {
                for (int i116 = 0; i116 < i27; i116++) {
                    iArr35[i116] = c8435h.f(4);
                }
            }
            jVar = new j(m12.j(), iArr35);
        } else {
            jVar = null;
        }
        return new k(j11, new d(abstractC5880y3, iArr32), fVar, jVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:104:0x0163  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x011c  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x012e  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x018e  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0268  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static m k(int i11, int i12, byte[] bArr) {
        int h11;
        boolean e11;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        boolean z11;
        boolean e12;
        int i19;
        boolean z12;
        int i21;
        int i22;
        int i23;
        int i24;
        float f7;
        int i25;
        int i26;
        int i27;
        C8435h c8435h = new C8435h(bArr, i11 + 1, i12);
        int f11 = c8435h.f(8);
        int f12 = c8435h.f(8);
        int f13 = c8435h.f(8);
        int h12 = c8435h.h();
        if (f11 == 100 || f11 == 110 || f11 == 122 || f11 == 244 || f11 == 44 || f11 == 83 || f11 == 86 || f11 == 118 || f11 == 128 || f11 == 138) {
            h11 = c8435h.h();
            e11 = h11 == 3 ? c8435h.e() : false;
            int h13 = c8435h.h();
            int h14 = c8435h.h();
            c8435h.k();
            if (c8435h.e()) {
                int i28 = h11 != 3 ? 8 : 12;
                i13 = 16;
                int i29 = 0;
                while (i29 < i28) {
                    if (c8435h.e()) {
                        int i31 = i29 < 6 ? 16 : 64;
                        int i32 = 8;
                        int i33 = 8;
                        for (int i34 = 0; i34 < i31; i34++) {
                            if (i32 != 0) {
                                i32 = ((c8435h.g() + i33) + 256) % 256;
                            }
                            if (i32 != 0) {
                                i33 = i32;
                            }
                        }
                    }
                    i29++;
                }
            } else {
                i13 = 16;
            }
            i14 = h13;
            i15 = h14;
        } else {
            h11 = 1;
            i13 = 16;
            i14 = 0;
            i15 = 0;
            e11 = false;
        }
        int h15 = c8435h.h() + 4;
        int h16 = c8435h.h();
        if (h16 == 0) {
            i18 = c8435h.h() + 4;
            i16 = 1;
            i17 = h15;
        } else {
            if (h16 == 1) {
                boolean e13 = c8435h.e();
                c8435h.g();
                c8435h.g();
                long h17 = c8435h.h();
                i16 = 1;
                i17 = h15;
                for (int i35 = 0; i35 < h17; i35++) {
                    c8435h.h();
                }
                z11 = e13;
                i18 = 0;
                c8435h.h();
                c8435h.k();
                int h18 = c8435h.h() + 1;
                int h19 = c8435h.h() + 1;
                e12 = c8435h.e();
                int i36 = 2 - (e12 ? 1 : 0);
                int i37 = h19 * i36;
                if (!e12) {
                    c8435h.k();
                }
                c8435h.k();
                int i38 = h18 * 16;
                int i39 = i37 * 16;
                if (!c8435h.e()) {
                    int h21 = c8435h.h();
                    int h22 = c8435h.h();
                    int h23 = c8435h.h();
                    int h24 = c8435h.h();
                    if (h11 != 0) {
                        int i41 = i16;
                        if (h11 != 3) {
                            i16 = 2;
                        }
                        i36 *= h11 == i41 ? 2 : i41;
                    }
                    i38 -= (h21 + h22) * i16;
                    i39 -= (h23 + h24) * i36;
                }
                int i42 = i39;
                int i43 = i38;
                int i44 = ((f11 != 44 || f11 == 86 || f11 == 100 || f11 == 110 || f11 == 122 || f11 == 244) && (f12 & 16) != 0) ? 0 : i13;
                int i45 = -1;
                float f14 = 1.0f;
                if (c8435h.e()) {
                    i19 = i44;
                    z12 = e11;
                    i21 = -1;
                    i22 = -1;
                    i23 = h16;
                    i24 = i18;
                    f7 = 1.0f;
                    i25 = -1;
                } else {
                    if (c8435h.e()) {
                        int f15 = c8435h.f(8);
                        if (f15 == 255) {
                            int i46 = i13;
                            int f16 = c8435h.f(i46);
                            int f17 = c8435h.f(i46);
                            if (f16 != 0 && f17 != 0) {
                                f14 = f16 / f17;
                            }
                        } else if (f15 < 17) {
                            f14 = f76386b[f15];
                        } else {
                            C3261b.f(f15, "Unexpected aspect_ratio_idc value: ", "NalUnitUtil");
                        }
                    }
                    if (c8435h.e()) {
                        c8435h.k();
                    }
                    if (c8435h.e()) {
                        c8435h.l(3);
                        i26 = c8435h.e() ? 1 : 2;
                        if (c8435h.e()) {
                            int f18 = c8435h.f(8);
                            int f19 = c8435h.f(8);
                            c8435h.l(8);
                            int g10 = C7267i.g(f18);
                            int h25 = C7267i.h(f19);
                            i45 = g10;
                            i27 = h25;
                        } else {
                            i27 = -1;
                        }
                    } else {
                        i26 = -1;
                        i27 = -1;
                    }
                    if (c8435h.e()) {
                        c8435h.h();
                        c8435h.h();
                    }
                    if (c8435h.e()) {
                        c8435h.l(65);
                    }
                    boolean e14 = c8435h.e();
                    if (e14) {
                        l(c8435h);
                    }
                    boolean e15 = c8435h.e();
                    if (e15) {
                        l(c8435h);
                    }
                    if (e14 || e15) {
                        c8435h.k();
                    }
                    c8435h.k();
                    if (c8435h.e()) {
                        c8435h.k();
                        c8435h.h();
                        c8435h.h();
                        c8435h.h();
                        c8435h.h();
                        i44 = c8435h.h();
                        c8435h.h();
                    }
                    int i47 = i45;
                    i24 = i18;
                    f7 = f14;
                    i25 = i47;
                    i21 = i26;
                    i19 = i44;
                    i22 = i27;
                    z12 = e11;
                    i23 = h16;
                }
                return new m(f11, f12, f13, h12, i43, i42, f7, i14, i15, z12, e12, i17, i23, i24, z11, i25, i21, i22, i19);
            }
            i16 = 1;
            i17 = h15;
            i18 = 0;
        }
        z11 = false;
        c8435h.h();
        c8435h.k();
        int h182 = c8435h.h() + 1;
        int h192 = c8435h.h() + 1;
        e12 = c8435h.e();
        int i362 = 2 - (e12 ? 1 : 0);
        int i372 = h192 * i362;
        if (!e12) {
        }
        c8435h.k();
        int i382 = h182 * 16;
        int i392 = i372 * 16;
        if (!c8435h.e()) {
        }
        int i422 = i392;
        int i432 = i382;
        if (f11 != 44) {
        }
        int i452 = -1;
        float f142 = 1.0f;
        if (c8435h.e()) {
        }
        return new m(f11, f12, f13, h12, i432, i422, f7, i14, i15, z12, e12, i17, i23, i24, z11, i25, i21, i22, i19);
    }

    private static void l(C8435h c8435h) {
        int h11 = c8435h.h() + 1;
        c8435h.l(8);
        for (int i11 = 0; i11 < h11; i11++) {
            c8435h.h();
            c8435h.h();
            c8435h.k();
        }
        c8435h.l(20);
    }

    public static int m(int i11, byte[] bArr) {
        int i12;
        synchronized (f76387c) {
            int i13 = 0;
            int i14 = 0;
            while (i13 < i11) {
                while (true) {
                    if (i13 >= i11 - 2) {
                        i13 = i11;
                        break;
                    }
                    try {
                        if (bArr[i13] == 0 && bArr[i13 + 1] == 0 && bArr[i13 + 2] == 3) {
                            break;
                        }
                        i13++;
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
                if (i13 < i11) {
                    int[] iArr = f76388d;
                    if (iArr.length <= i14) {
                        f76388d = Arrays.copyOf(iArr, iArr.length * 2);
                    }
                    f76388d[i14] = i13;
                    i13 += 3;
                    i14++;
                }
            }
            i12 = i11 - i14;
            int i15 = 0;
            int i16 = 0;
            for (int i17 = 0; i17 < i14; i17++) {
                int i18 = f76388d[i17] - i16;
                System.arraycopy(bArr, i16, bArr, i15, i18);
                int i19 = i15 + i18;
                int i21 = i19 + 1;
                bArr[i19] = 0;
                i15 = i19 + 2;
                bArr[i21] = 0;
                i16 += i18 + 3;
            }
            System.arraycopy(bArr, i16, bArr, i15, i12 - i15);
        }
        return i12;
    }
}
