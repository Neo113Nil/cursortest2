package u4;

import N3.M;
import android.util.SparseArray;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import j3.C7267i;
import j3.C7272n;
import java.util.ArrayList;
import java.util.Arrays;
import m3.C8050C;
import m3.C8065g;
import m3.N;
import n3.C8434g;
import n3.C8435h;
import u4.J;

/* loaded from: classes8.dex */
public final class o implements InterfaceC9958l {

    /* renamed from: a, reason: collision with root package name */
    private final E f100117a;

    /* renamed from: b, reason: collision with root package name */
    private final boolean f100118b;

    /* renamed from: c, reason: collision with root package name */
    private final boolean f100119c;

    /* renamed from: g, reason: collision with root package name */
    private long f100123g;

    /* renamed from: i, reason: collision with root package name */
    private String f100125i;

    /* renamed from: j, reason: collision with root package name */
    private M f100126j;

    /* renamed from: k, reason: collision with root package name */
    private a f100127k;

    /* renamed from: l, reason: collision with root package name */
    private boolean f100128l;

    /* renamed from: n, reason: collision with root package name */
    private boolean f100130n;

    /* renamed from: h, reason: collision with root package name */
    private final boolean[] f100124h = new boolean[3];

    /* renamed from: d, reason: collision with root package name */
    private final v f100120d = new v(7);

    /* renamed from: e, reason: collision with root package name */
    private final v f100121e = new v(8);

    /* renamed from: f, reason: collision with root package name */
    private final v f100122f = new v(6);

    /* renamed from: m, reason: collision with root package name */
    private long f100129m = -9223372036854775807L;

    /* renamed from: o, reason: collision with root package name */
    private final C8050C f100131o = new C8050C();

    private static final class a {

        /* renamed from: a, reason: collision with root package name */
        private final M f100132a;

        /* renamed from: b, reason: collision with root package name */
        private final boolean f100133b;

        /* renamed from: c, reason: collision with root package name */
        private final boolean f100134c;

        /* renamed from: f, reason: collision with root package name */
        private final C8435h f100137f;

        /* renamed from: g, reason: collision with root package name */
        private byte[] f100138g;

        /* renamed from: h, reason: collision with root package name */
        private int f100139h;

        /* renamed from: i, reason: collision with root package name */
        private int f100140i;

        /* renamed from: j, reason: collision with root package name */
        private long f100141j;

        /* renamed from: k, reason: collision with root package name */
        private boolean f100142k;

        /* renamed from: l, reason: collision with root package name */
        private long f100143l;

        /* renamed from: o, reason: collision with root package name */
        private boolean f100146o;

        /* renamed from: p, reason: collision with root package name */
        private long f100147p;

        /* renamed from: q, reason: collision with root package name */
        private long f100148q;

        /* renamed from: r, reason: collision with root package name */
        private boolean f100149r;

        /* renamed from: s, reason: collision with root package name */
        private boolean f100150s;

        /* renamed from: d, reason: collision with root package name */
        private final SparseArray<C8434g.m> f100135d = new SparseArray<>();

        /* renamed from: e, reason: collision with root package name */
        private final SparseArray<C8434g.l> f100136e = new SparseArray<>();

        /* renamed from: m, reason: collision with root package name */
        private C2199a f100144m = new C2199a();

        /* renamed from: n, reason: collision with root package name */
        private C2199a f100145n = new C2199a();

        /* renamed from: u4.o$a$a, reason: collision with other inner class name */
        private static final class C2199a {

            /* renamed from: a, reason: collision with root package name */
            private boolean f100151a;

            /* renamed from: b, reason: collision with root package name */
            private boolean f100152b;

            /* renamed from: c, reason: collision with root package name */
            private C8434g.m f100153c;

            /* renamed from: d, reason: collision with root package name */
            private int f100154d;

            /* renamed from: e, reason: collision with root package name */
            private int f100155e;

            /* renamed from: f, reason: collision with root package name */
            private int f100156f;

            /* renamed from: g, reason: collision with root package name */
            private int f100157g;

            /* renamed from: h, reason: collision with root package name */
            private boolean f100158h;

            /* renamed from: i, reason: collision with root package name */
            private boolean f100159i;

            /* renamed from: j, reason: collision with root package name */
            private boolean f100160j;

            /* renamed from: k, reason: collision with root package name */
            private boolean f100161k;

            /* renamed from: l, reason: collision with root package name */
            private int f100162l;

            /* renamed from: m, reason: collision with root package name */
            private int f100163m;

            /* renamed from: n, reason: collision with root package name */
            private int f100164n;

            /* renamed from: o, reason: collision with root package name */
            private int f100165o;

            /* renamed from: p, reason: collision with root package name */
            private int f100166p;

            static boolean a(C2199a c2199a, C2199a c2199a2) {
                int i11;
                int i12;
                boolean z11;
                if (!c2199a.f100151a) {
                    return false;
                }
                if (c2199a2.f100151a) {
                    C8434g.m mVar = c2199a.f100153c;
                    G10.a.i(mVar);
                    C8434g.m mVar2 = c2199a2.f100153c;
                    G10.a.i(mVar2);
                    if (c2199a.f100156f == c2199a2.f100156f && c2199a.f100157g == c2199a2.f100157g && c2199a.f100158h == c2199a2.f100158h && ((!c2199a.f100159i || !c2199a2.f100159i || c2199a.f100160j == c2199a2.f100160j) && ((i11 = c2199a.f100154d) == (i12 = c2199a2.f100154d) || (i11 != 0 && i12 != 0)))) {
                        int i13 = mVar2.f76447m;
                        int i14 = mVar.f76447m;
                        if ((i14 != 0 || i13 != 0 || (c2199a.f100163m == c2199a2.f100163m && c2199a.f100164n == c2199a2.f100164n)) && ((i14 != 1 || i13 != 1 || (c2199a.f100165o == c2199a2.f100165o && c2199a.f100166p == c2199a2.f100166p)) && (z11 = c2199a.f100161k) == c2199a2.f100161k && (!z11 || c2199a.f100162l == c2199a2.f100162l))) {
                            return false;
                        }
                    }
                }
                return true;
            }

            public final void b() {
                this.f100152b = false;
                this.f100151a = false;
            }

            public final boolean c() {
                if (!this.f100152b) {
                    return false;
                }
                int i11 = this.f100155e;
                return i11 == 7 || i11 == 2;
            }

            public final void d(C8434g.m mVar, int i11, int i12, int i13, int i14, boolean z11, boolean z12, boolean z13, boolean z14, int i15, int i16, int i17, int i18, int i19) {
                this.f100153c = mVar;
                this.f100154d = i11;
                this.f100155e = i12;
                this.f100156f = i13;
                this.f100157g = i14;
                this.f100158h = z11;
                this.f100159i = z12;
                this.f100160j = z13;
                this.f100161k = z14;
                this.f100162l = i15;
                this.f100163m = i16;
                this.f100164n = i17;
                this.f100165o = i18;
                this.f100166p = i19;
                this.f100151a = true;
                this.f100152b = true;
            }

            public final void e(int i11) {
                this.f100155e = i11;
                this.f100152b = true;
            }
        }

        public a(M m11, boolean z11, boolean z12) {
            this.f100132a = m11;
            this.f100133b = z11;
            this.f100134c = z12;
            byte[] bArr = new byte[UserVerificationMethods.USER_VERIFY_PATTERN];
            this.f100138g = bArr;
            this.f100137f = new C8435h(bArr, 0, 0);
            f();
        }

        public final void a(int i11, int i12, byte[] bArr) {
            boolean z11;
            boolean z12;
            boolean z13;
            int i13;
            int i14;
            int i15;
            int i16;
            int i17;
            if (this.f100142k) {
                int i18 = i12 - i11;
                byte[] bArr2 = this.f100138g;
                int length = bArr2.length;
                int i19 = this.f100139h + i18;
                if (length < i19) {
                    this.f100138g = Arrays.copyOf(bArr2, i19 * 2);
                }
                System.arraycopy(bArr, i11, this.f100138g, this.f100139h, i18);
                int i21 = this.f100139h + i18;
                this.f100139h = i21;
                byte[] bArr3 = this.f100138g;
                C8435h c8435h = this.f100137f;
                c8435h.i(0, i21, bArr3);
                if (c8435h.c(8)) {
                    c8435h.k();
                    int f7 = c8435h.f(2);
                    c8435h.l(5);
                    if (c8435h.d()) {
                        c8435h.h();
                        if (c8435h.d()) {
                            int h11 = c8435h.h();
                            if (!this.f100134c) {
                                this.f100142k = false;
                                this.f100145n.e(h11);
                                return;
                            }
                            if (c8435h.d()) {
                                int h12 = c8435h.h();
                                SparseArray<C8434g.l> sparseArray = this.f100136e;
                                if (sparseArray.indexOfKey(h12) < 0) {
                                    this.f100142k = false;
                                    return;
                                }
                                C8434g.l lVar = sparseArray.get(h12);
                                C8434g.m mVar = this.f100135d.get(lVar.f76433b);
                                if (mVar.f76444j) {
                                    if (!c8435h.c(2)) {
                                        return;
                                    } else {
                                        c8435h.l(2);
                                    }
                                }
                                int i22 = mVar.f76446l;
                                if (c8435h.c(i22)) {
                                    int f11 = c8435h.f(i22);
                                    if (mVar.f76445k) {
                                        z11 = false;
                                        z12 = false;
                                        z13 = false;
                                    } else {
                                        if (!c8435h.c(1)) {
                                            return;
                                        }
                                        boolean e11 = c8435h.e();
                                        if (!e11) {
                                            z12 = false;
                                            z13 = false;
                                            z11 = e11;
                                        } else {
                                            if (!c8435h.c(1)) {
                                                return;
                                            }
                                            z11 = e11;
                                            z12 = true;
                                            z13 = c8435h.e();
                                        }
                                    }
                                    boolean z14 = this.f100140i == 5;
                                    if (!z14) {
                                        i13 = 0;
                                    } else if (!c8435h.d()) {
                                        return;
                                    } else {
                                        i13 = c8435h.h();
                                    }
                                    boolean z15 = lVar.f76434c;
                                    int i23 = mVar.f76447m;
                                    if (i23 == 0) {
                                        int i24 = mVar.f76448n;
                                        if (!c8435h.c(i24)) {
                                            return;
                                        }
                                        int f12 = c8435h.f(i24);
                                        if (z15 && !z11) {
                                            if (c8435h.d()) {
                                                i15 = c8435h.g();
                                                i14 = f12;
                                                i16 = 0;
                                                i17 = i16;
                                                this.f100145n.d(mVar, f7, h11, f11, h12, z11, z12, z13, z14, i13, i14, i15, i16, i17);
                                                this.f100142k = false;
                                            }
                                            return;
                                        }
                                        i14 = f12;
                                        i15 = 0;
                                    } else {
                                        if (i23 == 1 && !mVar.f76449o) {
                                            if (c8435h.d()) {
                                                int g10 = c8435h.g();
                                                if (!z15 || z11) {
                                                    i16 = g10;
                                                    i14 = 0;
                                                    i15 = 0;
                                                    i17 = 0;
                                                } else {
                                                    if (!c8435h.d()) {
                                                        return;
                                                    }
                                                    i17 = c8435h.g();
                                                    i16 = g10;
                                                    i14 = 0;
                                                    i15 = 0;
                                                }
                                                this.f100145n.d(mVar, f7, h11, f11, h12, z11, z12, z13, z14, i13, i14, i15, i16, i17);
                                                this.f100142k = false;
                                            }
                                            return;
                                        }
                                        i14 = 0;
                                        i15 = 0;
                                    }
                                    i16 = i15;
                                    i17 = i16;
                                    this.f100145n.d(mVar, f7, h11, f11, h12, z11, z12, z13, z14, i13, i14, i15, i16, i17);
                                    this.f100142k = false;
                                }
                            }
                        }
                    }
                }
            }
        }

        public final boolean b(long j11, int i11, boolean z11) {
            boolean z12 = true;
            if (this.f100140i == 9 || (this.f100134c && C2199a.a(this.f100145n, this.f100144m))) {
                if (z11 && this.f100146o) {
                    long j12 = this.f100141j;
                    int i12 = i11 + ((int) (j11 - j12));
                    long j13 = this.f100148q;
                    if (j13 != -9223372036854775807L) {
                        long j14 = this.f100147p;
                        if (j12 != j14) {
                            this.f100132a.b(j13, this.f100149r ? 1 : 0, (int) (j12 - j14), i12, null);
                        }
                    }
                }
                this.f100147p = this.f100141j;
                this.f100148q = this.f100143l;
                this.f100149r = false;
                this.f100146o = true;
            }
            boolean c11 = this.f100133b ? this.f100145n.c() : this.f100150s;
            boolean z13 = this.f100149r;
            int i13 = this.f100140i;
            if (i13 != 5 && (!c11 || i13 != 1)) {
                z12 = false;
            }
            boolean z14 = z13 | z12;
            this.f100149r = z14;
            this.f100140i = 24;
            return z14;
        }

        public final boolean c() {
            return this.f100134c;
        }

        public final void d(C8434g.l lVar) {
            this.f100136e.append(lVar.f76432a, lVar);
        }

        public final void e(C8434g.m mVar) {
            this.f100135d.append(mVar.f76438d, mVar);
        }

        public final void f() {
            this.f100142k = false;
            this.f100146o = false;
            this.f100145n.b();
        }

        public final void g(int i11, long j11, long j12, boolean z11) {
            this.f100140i = i11;
            this.f100143l = j12;
            this.f100141j = j11;
            this.f100150s = z11;
            if (!this.f100133b || i11 != 1) {
                if (!this.f100134c) {
                    return;
                }
                if (i11 != 5 && i11 != 1 && i11 != 2) {
                    return;
                }
            }
            C2199a c2199a = this.f100144m;
            this.f100144m = this.f100145n;
            this.f100145n = c2199a;
            c2199a.b();
            this.f100139h = 0;
            this.f100142k = true;
        }
    }

    public o(E e11, boolean z11, boolean z12) {
        this.f100117a = e11;
        this.f100118b = z11;
        this.f100119c = z12;
    }

    private void a(int i11, int i12, long j11, long j12) {
        boolean z11 = this.f100128l;
        E e11 = this.f100117a;
        if (!z11 || this.f100127k.c()) {
            v vVar = this.f100120d;
            vVar.b(i12);
            v vVar2 = this.f100121e;
            vVar2.b(i12);
            if (this.f100128l) {
                if (vVar.c()) {
                    C8434g.m k11 = C8434g.k(3, vVar.f100268e, vVar.f100267d);
                    e11.f(k11.f76453s);
                    this.f100127k.e(k11);
                    vVar.d();
                } else if (vVar2.c()) {
                    C8435h c8435h = new C8435h(vVar2.f100267d, 4, vVar2.f100268e);
                    int h11 = c8435h.h();
                    int h12 = c8435h.h();
                    c8435h.k();
                    this.f100127k.d(new C8434g.l(h11, h12, c8435h.e()));
                    vVar2.d();
                }
            } else if (vVar.c() && vVar2.c()) {
                ArrayList arrayList = new ArrayList();
                arrayList.add(Arrays.copyOf(vVar.f100267d, vVar.f100268e));
                arrayList.add(Arrays.copyOf(vVar2.f100267d, vVar2.f100268e));
                C8434g.m k12 = C8434g.k(3, vVar.f100268e, vVar.f100267d);
                C8435h c8435h2 = new C8435h(vVar2.f100267d, 4, vVar2.f100268e);
                int h13 = c8435h2.h();
                int h14 = c8435h2.h();
                c8435h2.k();
                C8434g.l lVar = new C8434g.l(h13, h14, c8435h2.e());
                int i13 = C8065g.f74319d;
                String format = String.format("avc1.%02X%02X%02X", Integer.valueOf(k12.f76435a), Integer.valueOf(k12.f76436b), Integer.valueOf(k12.f76437c));
                M m11 = this.f100126j;
                C7272n.a aVar = new C7272n.a();
                aVar.j0(this.f100125i);
                aVar.W("video/mp2t");
                aVar.y0("video/avc");
                aVar.U(format);
                aVar.F0(k12.f76439e);
                aVar.h0(k12.f76440f);
                C7267i.a aVar2 = new C7267i.a();
                aVar2.d(k12.f76450p);
                aVar2.c(k12.f76451q);
                aVar2.e(k12.f76452r);
                aVar2.g(k12.f76442h + 8);
                aVar2.b(k12.f76443i + 8);
                aVar.V(aVar2.a());
                aVar.u0(k12.f76441g);
                aVar.k0(arrayList);
                int i14 = k12.f76453s;
                aVar.p0(i14);
                m11.a(aVar.P());
                this.f100128l = true;
                e11.f(i14);
                this.f100127k.e(k12);
                this.f100127k.d(lVar);
                vVar.d();
                vVar2.d();
            }
        }
        v vVar3 = this.f100122f;
        if (vVar3.b(i12)) {
            int m12 = C8434g.m(vVar3.f100268e, vVar3.f100267d);
            byte[] bArr = vVar3.f100267d;
            C8050C c8050c = this.f100131o;
            c8050c.P(m12, bArr);
            c8050c.R(4);
            e11.c(j12, c8050c);
        }
        if (this.f100127k.b(j11, i11, this.f100128l)) {
            this.f100130n = false;
        }
    }

    private void g(int i11, int i12, byte[] bArr) {
        if (!this.f100128l || this.f100127k.c()) {
            this.f100120d.a(i11, i12, bArr);
            this.f100121e.a(i11, i12, bArr);
        }
        this.f100122f.a(i11, i12, bArr);
        this.f100127k.a(i11, i12, bArr);
    }

    private void h(int i11, long j11, long j12) {
        if (!this.f100128l || this.f100127k.c()) {
            this.f100120d.e(i11);
            this.f100121e.e(i11);
        }
        this.f100122f.e(i11);
        this.f100127k.g(i11, j11, j12, this.f100130n);
    }

    @Override // u4.InterfaceC9958l
    public final void b() {
        this.f100123g = 0L;
        this.f100130n = false;
        this.f100129m = -9223372036854775807L;
        C8434g.a(this.f100124h);
        this.f100120d.d();
        this.f100121e.d();
        this.f100122f.d();
        this.f100117a.b();
        a aVar = this.f100127k;
        if (aVar != null) {
            aVar.f();
        }
    }

    @Override // u4.InterfaceC9958l
    public final void c(C8050C c8050c) {
        int i11;
        G10.a.i(this.f100126j);
        int i12 = N.f74289a;
        int f7 = c8050c.f();
        int i13 = c8050c.i();
        byte[] e11 = c8050c.e();
        this.f100123g += c8050c.a();
        this.f100126j.e(c8050c.a(), c8050c);
        while (true) {
            int b11 = C8434g.b(e11, f7, i13, this.f100124h);
            if (b11 == i13) {
                g(f7, i13, e11);
                return;
            }
            int i14 = e11[b11 + 3] & 31;
            if (b11 <= 0 || e11[b11 - 1] != 0) {
                i11 = 3;
            } else {
                b11--;
                i11 = 4;
            }
            int i15 = b11 - f7;
            if (i15 > 0) {
                g(f7, b11, e11);
            }
            int i16 = i13 - b11;
            long j11 = this.f100123g - i16;
            a(i16, i15 < 0 ? -i15 : 0, j11, this.f100129m);
            h(i14, j11, this.f100129m);
            f7 = b11 + i11;
        }
    }

    @Override // u4.InterfaceC9958l
    public final void d(int i11, long j11) {
        this.f100129m = j11;
        this.f100130n = ((i11 & 2) != 0) | this.f100130n;
    }

    @Override // u4.InterfaceC9958l
    public final void e(N3.r rVar, J.d dVar) {
        dVar.a();
        this.f100125i = dVar.b();
        M track = rVar.track(dVar.c(), 2);
        this.f100126j = track;
        this.f100127k = new a(track, this.f100118b, this.f100119c);
        this.f100117a.d(rVar, dVar);
    }

    @Override // u4.InterfaceC9958l
    public final void f(boolean z11) {
        G10.a.i(this.f100126j);
        int i11 = N.f74289a;
        if (z11) {
            this.f100117a.e();
            a(0, 0, this.f100123g, this.f100129m);
            h(9, this.f100123g, this.f100129m);
            a(0, 0, this.f100123g, this.f100129m);
        }
    }
}
