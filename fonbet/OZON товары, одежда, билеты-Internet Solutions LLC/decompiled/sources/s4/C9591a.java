package s4;

import android.graphics.Bitmap;
import android.graphics.Rect;
import com.google.common.collect.AbstractC5880y;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import java.util.List;
import java.util.zip.Inflater;
import k4.c;
import k4.o;
import l3.C7855a;
import m3.C8049B;
import m3.C8050C;
import m3.InterfaceC8068j;
import m3.N;
import m3.s;

/* renamed from: s4.a, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C9591a implements o {

    /* renamed from: a, reason: collision with root package name */
    private final C8050C f98205a = new C8050C();

    /* renamed from: b, reason: collision with root package name */
    private final C8050C f98206b = new C8050C();

    /* renamed from: c, reason: collision with root package name */
    private final C2165a f98207c;

    /* renamed from: d, reason: collision with root package name */
    private Inflater f98208d;

    /* renamed from: s4.a$a, reason: collision with other inner class name */
    private static final class C2165a {

        /* renamed from: b, reason: collision with root package name */
        private boolean f98210b;

        /* renamed from: c, reason: collision with root package name */
        private boolean f98211c;

        /* renamed from: d, reason: collision with root package name */
        private int[] f98212d;

        /* renamed from: e, reason: collision with root package name */
        private int f98213e;

        /* renamed from: f, reason: collision with root package name */
        private int f98214f;

        /* renamed from: g, reason: collision with root package name */
        private Rect f98215g;

        /* renamed from: a, reason: collision with root package name */
        private final int[] f98209a = new int[4];

        /* renamed from: h, reason: collision with root package name */
        private int f98216h = -1;

        /* renamed from: i, reason: collision with root package name */
        private int f98217i = -1;

        private static int b(int[] iArr, int i11) {
            return (i11 < 0 || i11 >= iArr.length) ? iArr[0] : iArr[i11];
        }

        private void d(C8049B c8049b, boolean z11, Rect rect, int[] iArr) {
            int i11;
            int i12;
            int width = rect.width();
            int height = rect.height();
            int i13 = !z11 ? 1 : 0;
            int i14 = i13 * width;
            while (true) {
                int i15 = 0;
                do {
                    int i16 = 0;
                    for (int i17 = 1; i16 < i17 && i17 <= 64; i17 <<= 2) {
                        if (c8049b.b() < 4) {
                            i11 = -1;
                            i12 = 0;
                            break;
                        }
                        i16 = (i16 << 4) | c8049b.h(4);
                    }
                    i11 = i16 & 3;
                    i12 = i16 < 4 ? width : i16 >> 2;
                    int min = Math.min(i12, width - i15);
                    if (min > 0) {
                        int i18 = i14 + min;
                        Arrays.fill(iArr, i14, i18, this.f98209a[i11]);
                        i15 += min;
                        i14 = i18;
                    }
                } while (i15 < width);
                i13 += 2;
                if (i13 >= height) {
                    return;
                }
                i14 = i13 * width;
                c8049b.c();
            }
        }

        private static int g(int i11, int i12) {
            return (i11 & 16777215) | ((i12 * 17) << 24);
        }

        public final C7855a a(C8050C c8050c) {
            Rect rect;
            if (this.f98212d == null || !this.f98210b || !this.f98211c || (rect = this.f98215g) == null || this.f98216h == -1 || this.f98217i == -1 || rect.width() < 2 || this.f98215g.height() < 2) {
                return null;
            }
            Rect rect2 = this.f98215g;
            int[] iArr = new int[rect2.height() * rect2.width()];
            C8049B c8049b = new C8049B();
            c8050c.R(this.f98216h);
            c8049b.m(c8050c);
            d(c8049b, true, rect2, iArr);
            c8050c.R(this.f98217i);
            c8049b.m(c8050c);
            d(c8049b, false, rect2, iArr);
            Bitmap createBitmap = Bitmap.createBitmap(iArr, rect2.width(), rect2.height(), Bitmap.Config.ARGB_8888);
            C7855a.C1210a c1210a = new C7855a.C1210a();
            c1210a.f(createBitmap);
            c1210a.k(rect2.left / this.f98213e);
            c1210a.l(0);
            c1210a.h(rect2.top / this.f98214f, 0);
            c1210a.i(0);
            c1210a.n(rect2.width() / this.f98213e);
            c1210a.g(rect2.height() / this.f98214f);
            return c1210a.a();
        }

        public final void c(String str) {
            int i11;
            String trim = str.trim();
            int i12 = N.f74289a;
            for (String str2 : trim.split("\\r?\\n", -1)) {
                if (str2.startsWith("palette: ")) {
                    String[] split = str2.substring(9).split(",", -1);
                    this.f98212d = new int[split.length];
                    for (int i13 = 0; i13 < split.length; i13++) {
                        int[] iArr = this.f98212d;
                        try {
                            i11 = Integer.parseInt(split[i13].trim(), 16);
                        } catch (RuntimeException unused) {
                            i11 = 0;
                        }
                        iArr[i13] = i11;
                    }
                } else if (str2.startsWith("size: ")) {
                    String[] split2 = str2.substring(6).trim().split("x", -1);
                    if (split2.length == 2) {
                        try {
                            this.f98213e = Integer.parseInt(split2[0]);
                            this.f98214f = Integer.parseInt(split2[1]);
                            this.f98210b = true;
                        } catch (RuntimeException e11) {
                            s.g("VobsubParser", "Parsing IDX failed", e11);
                        }
                    }
                }
            }
        }

        public final void e(C8050C c8050c) {
            int[] iArr = this.f98212d;
            if (iArr == null || !this.f98210b) {
                return;
            }
            c8050c.S(c8050c.L() - 2);
            int L11 = c8050c.L();
            while (c8050c.f() < L11 && c8050c.a() > 0) {
                int E11 = c8050c.E();
                int[] iArr2 = this.f98209a;
                switch (E11) {
                    case 0:
                    case 1:
                    case 2:
                        break;
                    case 3:
                        if (c8050c.a() >= 2) {
                            int E12 = c8050c.E();
                            int E13 = c8050c.E();
                            iArr2[3] = b(iArr, E12 >> 4);
                            iArr2[2] = b(iArr, E12 & 15);
                            iArr2[1] = b(iArr, E13 >> 4);
                            iArr2[0] = b(iArr, E13 & 15);
                            this.f98211c = true;
                            break;
                        } else {
                            return;
                        }
                    case 4:
                        if (c8050c.a() >= 2 && this.f98211c) {
                            int E14 = c8050c.E();
                            int E15 = c8050c.E();
                            iArr2[3] = g(iArr2[3], E14 >> 4);
                            iArr2[2] = g(iArr2[2], E14 & 15);
                            iArr2[1] = g(iArr2[1], E15 >> 4);
                            iArr2[0] = g(iArr2[0], E15 & 15);
                            break;
                        } else {
                            return;
                        }
                    case 5:
                        if (c8050c.a() >= 6) {
                            int E16 = c8050c.E();
                            int E17 = c8050c.E();
                            int i11 = (E16 << 4) | (E17 >> 4);
                            int E18 = ((E17 & 15) << 8) | c8050c.E();
                            int E19 = c8050c.E();
                            int E21 = c8050c.E();
                            this.f98215g = new Rect(i11, (E19 << 4) | (E21 >> 4), E18 + 1, (((E21 & 15) << 8) | c8050c.E()) + 1);
                            break;
                        } else {
                            return;
                        }
                    case 6:
                        if (c8050c.a() >= 4) {
                            this.f98216h = c8050c.L();
                            this.f98217i = c8050c.L();
                            break;
                        } else {
                            return;
                        }
                    default:
                        return;
                }
            }
        }

        public final void f() {
            this.f98211c = false;
            this.f98215g = null;
            this.f98216h = -1;
            this.f98217i = -1;
        }
    }

    public C9591a(List<byte[]> list) {
        C2165a c2165a = new C2165a();
        this.f98207c = c2165a;
        c2165a.c(new String(list.get(0), StandardCharsets.UTF_8));
    }

    @Override // k4.o
    public final void a(byte[] bArr, int i11, int i12, o.b bVar, InterfaceC8068j<c> interfaceC8068j) {
        C7855a c7855a;
        C8050C c8050c = this.f98205a;
        c8050c.P(i12 + i11, bArr);
        c8050c.R(i11);
        if (this.f98208d == null) {
            this.f98208d = new Inflater();
        }
        Inflater inflater = this.f98208d;
        int i13 = N.f74289a;
        if (c8050c.a() > 0 && c8050c.m() == 120) {
            C8050C c8050c2 = this.f98206b;
            if (N.K(c8050c, c8050c2, inflater)) {
                c8050c.P(c8050c2.i(), c8050c2.e());
            }
        }
        C2165a c2165a = this.f98207c;
        c2165a.f();
        int a11 = c8050c.a();
        if (a11 < 2 || c8050c.L() != a11) {
            c7855a = null;
        } else {
            c2165a.e(c8050c);
            c7855a = c2165a.a(c8050c);
        }
        interfaceC8068j.accept(new c(c7855a != null ? AbstractC5880y.B(c7855a) : AbstractC5880y.v(), -9223372036854775807L, 5000000L));
    }
}
