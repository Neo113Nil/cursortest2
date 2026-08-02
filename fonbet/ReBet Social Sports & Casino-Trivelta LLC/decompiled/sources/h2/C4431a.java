package h2;

import android.graphics.Bitmap;
import d1.C3985a;
import e1.InterfaceC4148o;
import e1.J;
import e1.Z;
import e2.C4163e;
import e2.s;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.zip.Inflater;

/* renamed from: h2.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C4431a implements s {

    /* renamed from: a, reason: collision with root package name */
    public final J f47628a = new J();

    /* renamed from: b, reason: collision with root package name */
    public final J f47629b = new J();

    /* renamed from: c, reason: collision with root package name */
    public final C0712a f47630c = new C0712a();

    /* renamed from: d, reason: collision with root package name */
    public Inflater f47631d;

    /* renamed from: h2.a$a, reason: collision with other inner class name */
    public static final class C0712a {

        /* renamed from: b, reason: collision with root package name */
        public boolean f47633b;

        /* renamed from: c, reason: collision with root package name */
        public int f47634c;

        /* renamed from: d, reason: collision with root package name */
        public int f47635d;

        /* renamed from: e, reason: collision with root package name */
        public int f47636e;

        /* renamed from: f, reason: collision with root package name */
        public int f47637f;

        /* renamed from: g, reason: collision with root package name */
        public int f47638g;

        /* renamed from: h, reason: collision with root package name */
        public int f47639h;

        /* renamed from: a, reason: collision with root package name */
        public final J f47632a = new J();
        private final int[] colors = new int[256];

        public C3985a d() {
            int i10;
            if (this.f47634c == 0 || this.f47635d == 0 || this.f47638g == 0 || this.f47639h == 0 || this.f47632a.j() == 0 || this.f47632a.g() != this.f47632a.j() || !this.f47633b) {
                return null;
            }
            this.f47632a.b0(0);
            int i11 = this.f47638g * this.f47639h;
            int[] iArr = new int[i11];
            int i12 = 0;
            while (i12 < i11) {
                int M10 = this.f47632a.M();
                if (M10 != 0) {
                    i10 = i12 + 1;
                    iArr[i12] = this.colors[M10];
                } else {
                    int M11 = this.f47632a.M();
                    if (M11 != 0) {
                        i10 = ((M11 & 64) == 0 ? M11 & 63 : ((M11 & 63) << 8) | this.f47632a.M()) + i12;
                        Arrays.fill(iArr, i12, i10, (M11 & 128) == 0 ? this.colors[0] : this.colors[this.f47632a.M()]);
                    }
                }
                i12 = i10;
            }
            return new C3985a.b().f(Bitmap.createBitmap(iArr, this.f47638g, this.f47639h, Bitmap.Config.ARGB_8888)).k(this.f47636e / this.f47634c).l(0).h(this.f47637f / this.f47635d, 0).i(0).n(this.f47638g / this.f47634c).g(this.f47639h / this.f47635d).a();
        }

        public final void e(J j10, int i10) {
            int P10;
            if (i10 < 4) {
                return;
            }
            j10.c0(3);
            int i11 = i10 - 4;
            if ((j10.M() & 128) != 0) {
                if (i11 < 7 || (P10 = j10.P()) < 4) {
                    return;
                }
                this.f47638g = j10.U();
                this.f47639h = j10.U();
                this.f47632a.X(P10 - 4);
                i11 = i10 - 11;
            }
            int g10 = this.f47632a.g();
            int j11 = this.f47632a.j();
            if (g10 >= j11 || i11 <= 0) {
                return;
            }
            int min = Math.min(i11, j11 - g10);
            j10.q(this.f47632a.f(), g10, min);
            this.f47632a.b0(g10 + min);
        }

        public final void f(J j10, int i10) {
            if (i10 < 19) {
                return;
            }
            this.f47634c = j10.U();
            this.f47635d = j10.U();
            j10.c0(11);
            this.f47636e = j10.U();
            this.f47637f = j10.U();
        }

        public final void g(J j10, int i10) {
            if (i10 % 5 != 2) {
                return;
            }
            j10.c0(2);
            Arrays.fill(this.colors, 0);
            int i11 = i10 / 5;
            for (int i12 = 0; i12 < i11; i12++) {
                int M10 = j10.M();
                int M11 = j10.M();
                int M12 = j10.M();
                int M13 = j10.M();
                double d10 = M11;
                double d11 = M12 - 128;
                double d12 = M13 - 128;
                this.colors[M10] = (Z.o((int) ((d10 - (0.34414d * d12)) - (d11 * 0.71414d)), 0, 255) << 8) | (j10.M() << 24) | (Z.o((int) ((1.402d * d11) + d10), 0, 255) << 16) | Z.o((int) (d10 + (d12 * 1.772d)), 0, 255);
            }
            this.f47633b = true;
        }

        public void h() {
            this.f47634c = 0;
            this.f47635d = 0;
            this.f47636e = 0;
            this.f47637f = 0;
            this.f47638g = 0;
            this.f47639h = 0;
            this.f47632a.X(0);
            this.f47633b = false;
        }
    }

    public static C3985a d(J j10, C0712a c0712a) {
        int j11 = j10.j();
        int M10 = j10.M();
        int U10 = j10.U();
        int g10 = j10.g() + U10;
        C3985a c3985a = null;
        if (g10 > j11) {
            j10.b0(j11);
            return null;
        }
        if (M10 != 128) {
            switch (M10) {
                case 20:
                    c0712a.g(j10, U10);
                    break;
                case 21:
                    c0712a.e(j10, U10);
                    break;
                case 22:
                    c0712a.f(j10, U10);
                    break;
            }
        } else {
            c3985a = c0712a.d();
            c0712a.h();
        }
        j10.b0(g10);
        return c3985a;
    }

    @Override // e2.s
    public void a(byte[] bArr, int i10, int i11, s.b bVar, InterfaceC4148o interfaceC4148o) {
        this.f47628a.Z(bArr, i11 + i10);
        this.f47628a.b0(i10);
        if (this.f47631d == null) {
            this.f47631d = new Inflater();
        }
        if (Z.X0(this.f47628a, this.f47629b, this.f47631d)) {
            this.f47628a.Z(this.f47629b.f(), this.f47629b.j());
        }
        this.f47630c.h();
        ArrayList arrayList = new ArrayList();
        while (this.f47628a.a() >= 3) {
            C3985a d10 = d(this.f47628a, this.f47630c);
            if (d10 != null) {
                arrayList.add(d10);
            }
        }
        interfaceC4148o.accept(new C4163e(arrayList, -9223372036854775807L, -9223372036854775807L));
    }

    @Override // e2.s
    public int c() {
        return 2;
    }
}
