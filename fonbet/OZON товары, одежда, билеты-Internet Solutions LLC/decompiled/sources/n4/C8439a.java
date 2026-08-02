package n4;

import android.graphics.Bitmap;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.zip.Inflater;
import k4.c;
import k4.o;
import l3.C7855a;
import m3.C8050C;
import m3.InterfaceC8068j;
import m3.N;

/* renamed from: n4.a, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C8439a implements o {

    /* renamed from: a, reason: collision with root package name */
    private final C8050C f76468a = new C8050C();

    /* renamed from: b, reason: collision with root package name */
    private final C8050C f76469b = new C8050C();

    /* renamed from: c, reason: collision with root package name */
    private final C1288a f76470c = new C1288a();

    /* renamed from: d, reason: collision with root package name */
    private Inflater f76471d;

    /* renamed from: n4.a$a, reason: collision with other inner class name */
    private static final class C1288a {

        /* renamed from: a, reason: collision with root package name */
        private final C8050C f76472a = new C8050C();

        /* renamed from: b, reason: collision with root package name */
        private final int[] f76473b = new int[256];

        /* renamed from: c, reason: collision with root package name */
        private boolean f76474c;

        /* renamed from: d, reason: collision with root package name */
        private int f76475d;

        /* renamed from: e, reason: collision with root package name */
        private int f76476e;

        /* renamed from: f, reason: collision with root package name */
        private int f76477f;

        /* renamed from: g, reason: collision with root package name */
        private int f76478g;

        /* renamed from: h, reason: collision with root package name */
        private int f76479h;

        /* renamed from: i, reason: collision with root package name */
        private int f76480i;

        static void a(C1288a c1288a, C8050C c8050c, int i11) {
            c1288a.getClass();
            if (i11 % 5 != 2) {
                return;
            }
            c8050c.S(2);
            int[] iArr = c1288a.f76473b;
            Arrays.fill(iArr, 0);
            int i12 = i11 / 5;
            for (int i13 = 0; i13 < i12; i13++) {
                int E11 = c8050c.E();
                int E12 = c8050c.E();
                double d11 = E12;
                double E13 = c8050c.E() - 128;
                double E14 = c8050c.E() - 128;
                iArr[E11] = (N.i((int) ((d11 - (0.34414d * E14)) - (E13 * 0.71414d)), 0, 255) << 8) | (c8050c.E() << 24) | (N.i((int) ((1.402d * E13) + d11), 0, 255) << 16) | N.i((int) ((E14 * 1.772d) + d11), 0, 255);
            }
            c1288a.f76474c = true;
        }

        static void b(C1288a c1288a, C8050C c8050c, int i11) {
            int H11;
            c1288a.getClass();
            if (i11 < 4) {
                return;
            }
            c8050c.S(3);
            boolean z11 = (c8050c.E() & UserVerificationMethods.USER_VERIFY_PATTERN) != 0;
            int i12 = i11 - 4;
            C8050C c8050c2 = c1288a.f76472a;
            if (z11) {
                if (i12 < 7 || (H11 = c8050c.H()) < 4) {
                    return;
                }
                c1288a.f76479h = c8050c.L();
                c1288a.f76480i = c8050c.L();
                c8050c2.O(H11 - 4);
                i12 = i11 - 11;
            }
            int f7 = c8050c2.f();
            int i13 = c8050c2.i();
            if (f7 >= i13 || i12 <= 0) {
                return;
            }
            int min = Math.min(i12, i13 - f7);
            c8050c.n(f7, min, c8050c2.e());
            c8050c2.R(f7 + min);
        }

        static void c(C1288a c1288a, C8050C c8050c, int i11) {
            c1288a.getClass();
            if (i11 < 19) {
                return;
            }
            c1288a.f76475d = c8050c.L();
            c1288a.f76476e = c8050c.L();
            c8050c.S(11);
            c1288a.f76477f = c8050c.L();
            c1288a.f76478g = c8050c.L();
        }

        public final C7855a d() {
            int i11;
            if (this.f76475d == 0 || this.f76476e == 0 || this.f76479h == 0 || this.f76480i == 0) {
                return null;
            }
            C8050C c8050c = this.f76472a;
            if (c8050c.i() == 0 || c8050c.f() != c8050c.i() || !this.f76474c) {
                return null;
            }
            c8050c.R(0);
            int i12 = this.f76479h * this.f76480i;
            int[] iArr = new int[i12];
            int i13 = 0;
            while (i13 < i12) {
                int E11 = c8050c.E();
                int[] iArr2 = this.f76473b;
                if (E11 != 0) {
                    i11 = i13 + 1;
                    iArr[i13] = iArr2[E11];
                } else {
                    int E12 = c8050c.E();
                    if (E12 != 0) {
                        i11 = ((E12 & 64) == 0 ? E12 & 63 : ((E12 & 63) << 8) | c8050c.E()) + i13;
                        Arrays.fill(iArr, i13, i11, (E12 & UserVerificationMethods.USER_VERIFY_PATTERN) == 0 ? iArr2[0] : iArr2[c8050c.E()]);
                    }
                }
                i13 = i11;
            }
            Bitmap createBitmap = Bitmap.createBitmap(iArr, this.f76479h, this.f76480i, Bitmap.Config.ARGB_8888);
            C7855a.C1210a c1210a = new C7855a.C1210a();
            c1210a.f(createBitmap);
            c1210a.k(this.f76477f / this.f76475d);
            c1210a.l(0);
            c1210a.h(this.f76478g / this.f76476e, 0);
            c1210a.i(0);
            c1210a.n(this.f76479h / this.f76475d);
            c1210a.g(this.f76480i / this.f76476e);
            return c1210a.a();
        }

        public final void e() {
            this.f76475d = 0;
            this.f76476e = 0;
            this.f76477f = 0;
            this.f76478g = 0;
            this.f76479h = 0;
            this.f76480i = 0;
            this.f76472a.O(0);
            this.f76474c = false;
        }
    }

    @Override // k4.o
    public final void a(byte[] bArr, int i11, int i12, o.b bVar, InterfaceC8068j<c> interfaceC8068j) {
        C8050C c8050c = this.f76468a;
        c8050c.P(i12 + i11, bArr);
        c8050c.R(i11);
        if (this.f76471d == null) {
            this.f76471d = new Inflater();
        }
        Inflater inflater = this.f76471d;
        int i13 = N.f74289a;
        if (c8050c.a() > 0 && c8050c.m() == 120) {
            C8050C c8050c2 = this.f76469b;
            if (N.K(c8050c, c8050c2, inflater)) {
                c8050c.P(c8050c2.i(), c8050c2.e());
            }
        }
        C1288a c1288a = this.f76470c;
        c1288a.e();
        ArrayList arrayList = new ArrayList();
        while (c8050c.a() >= 3) {
            int i14 = c8050c.i();
            int E11 = c8050c.E();
            int L11 = c8050c.L();
            int f7 = c8050c.f() + L11;
            C7855a c7855a = null;
            if (f7 > i14) {
                c8050c.R(i14);
            } else {
                if (E11 != 128) {
                    switch (E11) {
                        case 20:
                            C1288a.a(c1288a, c8050c, L11);
                            break;
                        case 21:
                            C1288a.b(c1288a, c8050c, L11);
                            break;
                        case 22:
                            C1288a.c(c1288a, c8050c, L11);
                            break;
                    }
                } else {
                    c7855a = c1288a.d();
                    c1288a.e();
                }
                c8050c.R(f7);
            }
            if (c7855a != null) {
                arrayList.add(c7855a);
            }
        }
        interfaceC8068j.accept(new c(arrayList, -9223372036854775807L, -9223372036854775807L));
    }
}
