package m2;

import android.graphics.Bitmap;
import android.graphics.Rect;
import com.google.common.collect.AbstractC3445z;
import d1.C3985a;
import e1.AbstractC4156x;
import e1.I;
import e1.InterfaceC4148o;
import e1.J;
import e1.Z;
import e2.C4163e;
import e2.s;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import java.util.List;
import java.util.zip.Inflater;
import lb.C5444x;

/* renamed from: m2.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C5546a implements s {

    /* renamed from: a, reason: collision with root package name */
    public final J f56344a = new J();

    /* renamed from: b, reason: collision with root package name */
    public final J f56345b = new J();

    /* renamed from: c, reason: collision with root package name */
    public final b f56346c;

    /* renamed from: d, reason: collision with root package name */
    public Inflater f56347d;

    /* renamed from: m2.a$b */
    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        public boolean f56348a;

        /* renamed from: b, reason: collision with root package name */
        public boolean f56349b;

        /* renamed from: c, reason: collision with root package name */
        public int f56350c;

        /* renamed from: d, reason: collision with root package name */
        public int f56351d;

        /* renamed from: e, reason: collision with root package name */
        public Rect f56352e;
        private int[] palette;
        private final int[] colors = new int[4];

        /* renamed from: f, reason: collision with root package name */
        public int f56353f = -1;

        /* renamed from: g, reason: collision with root package name */
        public int f56354g = -1;

        /* renamed from: m2.a$b$a, reason: collision with other inner class name */
        public static final class C0810a {

            /* renamed from: a, reason: collision with root package name */
            public int f56355a;

            /* renamed from: b, reason: collision with root package name */
            public int f56356b;

            public C0810a() {
            }
        }

        public static int b(int[] iArr, int i10) {
            return (i10 < 0 || i10 >= iArr.length) ? iArr[0] : iArr[i10];
        }

        public static int c(String str) {
            try {
                return Integer.parseInt(str, 16);
            } catch (RuntimeException unused) {
                return 0;
            }
        }

        public static void k(I i10, int i11, C0810a c0810a) {
            int i12 = 0;
            for (int i13 = 1; i12 < i13 && i13 <= 64; i13 <<= 2) {
                if (i10.b() < 4) {
                    c0810a.f56355a = -1;
                    c0810a.f56356b = 0;
                    return;
                }
                i12 = (i12 << 4) | i10.h(4);
            }
            c0810a.f56355a = i12 & 3;
            if (i12 >= 4) {
                i11 = i12 >> 2;
            }
            c0810a.f56356b = i11;
        }

        public static int n(int i10, int i11) {
            return (i10 & 16777215) | ((i11 * 17) << 24);
        }

        public C3985a a(J j10) {
            Rect rect;
            if (this.palette == null || !this.f56348a || !this.f56349b || (rect = this.f56352e) == null || this.f56353f == -1 || this.f56354g == -1 || rect.width() < 2 || this.f56352e.height() < 2) {
                return null;
            }
            Rect rect2 = this.f56352e;
            int[] iArr = new int[rect2.width() * rect2.height()];
            I i10 = new I();
            j10.b0(this.f56353f);
            i10.m(j10);
            j(i10, true, rect2, iArr);
            j10.b0(this.f56354g);
            i10.m(j10);
            j(i10, false, rect2, iArr);
            return new C3985a.b().f(Bitmap.createBitmap(iArr, rect2.width(), rect2.height(), Bitmap.Config.ARGB_8888)).k(rect2.left / this.f56350c).l(0).h(rect2.top / this.f56351d, 0).i(0).n(rect2.width() / this.f56350c).g(rect2.height() / this.f56351d).a();
        }

        public final void d(int[] iArr, J j10, int i10) {
            while (j10.g() < i10 && j10.a() > 0) {
                switch (j10.M()) {
                    case 0:
                    case 1:
                    case 2:
                        break;
                    case 3:
                        if (g(iArr, j10)) {
                            break;
                        } else {
                            return;
                        }
                    case 4:
                        if (e(j10)) {
                            break;
                        } else {
                            return;
                        }
                    case 5:
                        if (f(j10)) {
                            break;
                        } else {
                            return;
                        }
                    case 6:
                        if (h(j10)) {
                            break;
                        } else {
                            return;
                        }
                    default:
                        return;
                }
            }
        }

        public final boolean e(J j10) {
            if (j10.a() < 2 || !this.f56349b) {
                return false;
            }
            int M10 = j10.M();
            int M11 = j10.M();
            int[] iArr = this.colors;
            iArr[3] = n(iArr[3], M10 >> 4);
            int[] iArr2 = this.colors;
            iArr2[2] = n(iArr2[2], M10 & 15);
            int[] iArr3 = this.colors;
            iArr3[1] = n(iArr3[1], M11 >> 4);
            int[] iArr4 = this.colors;
            iArr4[0] = n(iArr4[0], M11 & 15);
            return true;
        }

        public final boolean f(J j10) {
            if (j10.a() < 6) {
                return false;
            }
            int M10 = j10.M();
            int M11 = j10.M();
            int i10 = (M10 << 4) | (M11 >> 4);
            int M12 = ((M11 & 15) << 8) | j10.M();
            int M13 = j10.M();
            int M14 = j10.M();
            this.f56352e = new Rect(i10, (M13 << 4) | (M14 >> 4), M12 + 1, (j10.M() | ((M14 & 15) << 8)) + 1);
            return true;
        }

        public final boolean g(int[] iArr, J j10) {
            if (j10.a() < 2) {
                return false;
            }
            int M10 = j10.M();
            int M11 = j10.M();
            this.colors[3] = b(iArr, M10 >> 4);
            this.colors[2] = b(iArr, M10 & 15);
            this.colors[1] = b(iArr, M11 >> 4);
            this.colors[0] = b(iArr, M11 & 15);
            this.f56349b = true;
            return true;
        }

        public final boolean h(J j10) {
            if (j10.a() < 4) {
                return false;
            }
            this.f56353f = j10.U();
            this.f56354g = j10.U();
            return true;
        }

        public void i(String str) {
            for (String str2 : Z.A1(str.trim(), "\\r?\\n")) {
                if (str2.startsWith("palette: ")) {
                    String[] A12 = Z.A1(str2.substring(9), ",");
                    this.palette = new int[A12.length];
                    for (int i10 = 0; i10 < A12.length; i10++) {
                        this.palette[i10] = c(A12[i10].trim());
                    }
                } else if (str2.startsWith("size: ")) {
                    String[] A13 = Z.A1(str2.substring(6).trim(), C5444x.f55808b);
                    if (A13.length == 2) {
                        try {
                            this.f56350c = Integer.parseInt(A13[0]);
                            this.f56351d = Integer.parseInt(A13[1]);
                            this.f56348a = true;
                        } catch (RuntimeException e10) {
                            AbstractC4156x.j("VobsubParser", "Parsing IDX failed", e10);
                        }
                    }
                }
            }
        }

        public final void j(I i10, boolean z10, Rect rect, int[] iArr) {
            int width = rect.width();
            int height = rect.height();
            int i11 = !z10 ? 1 : 0;
            int i12 = i11 * width;
            C0810a c0810a = new C0810a();
            while (true) {
                int i13 = 0;
                do {
                    k(i10, width, c0810a);
                    int min = Math.min(c0810a.f56356b, width - i13);
                    if (min > 0) {
                        int i14 = i12 + min;
                        Arrays.fill(iArr, i12, i14, this.colors[c0810a.f56355a]);
                        i13 += min;
                        i12 = i14;
                    }
                } while (i13 < width);
                i11 += 2;
                if (i11 >= height) {
                    return;
                }
                i12 = i11 * width;
                i10.c();
            }
        }

        public void l(J j10) {
            int[] iArr = this.palette;
            if (iArr == null || !this.f56348a) {
                return;
            }
            j10.c0(j10.U() - 2);
            d(iArr, j10, j10.U());
        }

        public void m() {
            this.f56349b = false;
            this.f56352e = null;
            this.f56353f = -1;
            this.f56354g = -1;
        }
    }

    public C5546a(List list) {
        b bVar = new b();
        this.f56346c = bVar;
        bVar.i(new String((byte[]) list.get(0), StandardCharsets.UTF_8));
    }

    @Override // e2.s
    public void a(byte[] bArr, int i10, int i11, s.b bVar, InterfaceC4148o interfaceC4148o) {
        this.f56344a.Z(bArr, i11 + i10);
        this.f56344a.b0(i10);
        C3985a d10 = d();
        interfaceC4148o.accept(new C4163e(d10 != null ? AbstractC3445z.u(d10) : AbstractC3445z.t(), -9223372036854775807L, 5000000L));
    }

    @Override // e2.s
    public int c() {
        return 2;
    }

    public final C3985a d() {
        if (this.f56347d == null) {
            this.f56347d = new Inflater();
        }
        if (Z.X0(this.f56344a, this.f56345b, this.f56347d)) {
            this.f56344a.Z(this.f56345b.f(), this.f56345b.j());
        }
        this.f56346c.m();
        int a10 = this.f56344a.a();
        if (a10 < 2 || this.f56344a.U() != a10) {
            return null;
        }
        this.f56346c.l(this.f56344a);
        return this.f56346c.a(this.f56344a);
    }
}
