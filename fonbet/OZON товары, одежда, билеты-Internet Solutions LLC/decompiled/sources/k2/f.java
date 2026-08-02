package k2;

import j2.f;
import java.util.HashMap;

/* loaded from: classes8.dex */
public final class f extends j2.d {

    /* renamed from: A0, reason: collision with root package name */
    protected int f70307A0;

    /* renamed from: B0, reason: collision with root package name */
    protected int f70308B0;

    /* renamed from: C0, reason: collision with root package name */
    protected int f70309C0;

    /* renamed from: D0, reason: collision with root package name */
    protected int f70310D0;

    /* renamed from: E0, reason: collision with root package name */
    protected int f70311E0;

    /* renamed from: F0, reason: collision with root package name */
    protected int f70312F0;

    /* renamed from: G0, reason: collision with root package name */
    protected int f70313G0;

    /* renamed from: H0, reason: collision with root package name */
    protected int f70314H0;

    /* renamed from: I0, reason: collision with root package name */
    protected float f70315I0;

    /* renamed from: J0, reason: collision with root package name */
    protected float f70316J0;

    /* renamed from: K0, reason: collision with root package name */
    protected float f70317K0;

    /* renamed from: L0, reason: collision with root package name */
    protected float f70318L0;

    /* renamed from: n0, reason: collision with root package name */
    protected m2.g f70319n0;

    /* renamed from: o0, reason: collision with root package name */
    protected HashMap<String, Float> f70320o0;

    /* renamed from: p0, reason: collision with root package name */
    protected HashMap<String, Float> f70321p0;

    /* renamed from: q0, reason: collision with root package name */
    protected HashMap<String, Float> f70322q0;

    /* renamed from: r0, reason: collision with root package name */
    protected int f70323r0;

    /* renamed from: s0, reason: collision with root package name */
    protected int f70324s0;

    /* renamed from: t0, reason: collision with root package name */
    protected int f70325t0;

    /* renamed from: u0, reason: collision with root package name */
    protected int f70326u0;

    /* renamed from: v0, reason: collision with root package name */
    protected int f70327v0;

    /* renamed from: w0, reason: collision with root package name */
    protected int f70328w0;

    /* renamed from: x0, reason: collision with root package name */
    protected int f70329x0;

    /* renamed from: y0, reason: collision with root package name */
    protected int f70330y0;

    /* renamed from: z0, reason: collision with root package name */
    protected int f70331z0;

    public f(j2.f fVar, f.d dVar) {
        super(fVar, dVar);
        this.f70323r0 = 0;
        this.f70324s0 = -1;
        this.f70325t0 = -1;
        this.f70326u0 = -1;
        this.f70327v0 = -1;
        this.f70328w0 = -1;
        this.f70329x0 = -1;
        this.f70330y0 = 2;
        this.f70331z0 = 2;
        this.f70307A0 = 0;
        this.f70308B0 = 0;
        this.f70309C0 = 0;
        this.f70310D0 = 0;
        this.f70311E0 = 0;
        this.f70312F0 = 0;
        this.f70313G0 = -1;
        this.f70314H0 = 0;
        this.f70315I0 = 0.5f;
        this.f70316J0 = 0.5f;
        this.f70317K0 = 0.5f;
        this.f70318L0 = 0.5f;
        if (dVar == f.d.VERTICAL_FLOW) {
            this.f70314H0 = 1;
        }
    }

    @Override // j2.d
    public final m2.j J() {
        if (this.f70319n0 == null) {
            this.f70319n0 = new m2.g();
        }
        return this.f70319n0;
    }

    public final void L(float f7, float f11, float f12, String str) {
        H(str);
        if (!Float.isNaN(f7)) {
            if (this.f70320o0 == null) {
                this.f70320o0 = new HashMap<>();
            }
            this.f70320o0.put(str, Float.valueOf(f7));
        }
        if (!Float.isNaN(f11)) {
            if (this.f70321p0 == null) {
                this.f70321p0 = new HashMap<>();
            }
            this.f70321p0.put(str, Float.valueOf(f11));
        }
        if (Float.isNaN(f12)) {
            return;
        }
        if (this.f70322q0 == null) {
            this.f70322q0 = new HashMap<>();
        }
        this.f70322q0.put(str, Float.valueOf(f12));
    }

    public final void M(float f7) {
        this.f70317K0 = f7;
    }

    public final void N(int i11) {
        this.f70328w0 = i11;
    }

    public final void O(float f7) {
        this.f70315I0 = f7;
    }

    public final void P(int i11) {
        this.f70325t0 = i11;
    }

    public final void Q(int i11) {
        this.f70331z0 = i11;
    }

    public final void R(int i11) {
        this.f70308B0 = i11;
    }

    public final void S(int i11) {
        this.f70327v0 = i11;
    }

    public final void T(float f7) {
        this.f70318L0 = f7;
    }

    public final void U(int i11) {
        this.f70329x0 = i11;
    }

    public final void V(float f7) {
        this.f70316J0 = f7;
    }

    public final void W(int i11) {
        this.f70326u0 = i11;
    }

    public final void X(int i11) {
        this.f70313G0 = i11;
    }

    public final void Y(int i11) {
        this.f70314H0 = i11;
    }

    public final void Z(int i11) {
        this.f70312F0 = i11;
    }

    public final void a0(int i11) {
        this.f70309C0 = i11;
    }

    @Override // j2.d, j2.C7241a, j2.e
    public final void apply() {
        J();
        a(this.f70319n0);
        this.f70319n0.c2(this.f70314H0);
        this.f70319n0.h2(this.f70323r0);
        int i11 = this.f70313G0;
        if (i11 != -1) {
            this.f70319n0.b2(i11);
        }
        int i12 = this.f70309C0;
        if (i12 != 0) {
            this.f70319n0.p1(i12);
        }
        int i13 = this.f70311E0;
        if (i13 != 0) {
            this.f70319n0.s1(i13);
        }
        int i14 = this.f70310D0;
        if (i14 != 0) {
            this.f70319n0.q1(i14);
        }
        int i15 = this.f70312F0;
        if (i15 != 0) {
            this.f70319n0.n1(i15);
        }
        int i16 = this.f70308B0;
        if (i16 != 0) {
            this.f70319n0.V1(i16);
        }
        int i17 = this.f70307A0;
        if (i17 != 0) {
            this.f70319n0.f2(i17);
        }
        float f7 = this.f68842h;
        if (f7 != 0.5f) {
            this.f70319n0.U1(f7);
        }
        float f11 = this.f70317K0;
        if (f11 != 0.5f) {
            this.f70319n0.P1(f11);
        }
        float f12 = this.f70318L0;
        if (f12 != 0.5f) {
            this.f70319n0.X1(f12);
        }
        float f13 = this.f68844i;
        if (f13 != 0.5f) {
            this.f70319n0.e2(f13);
        }
        float f14 = this.f70315I0;
        if (f14 != 0.5f) {
            this.f70319n0.R1(f14);
        }
        float f15 = this.f70316J0;
        if (f15 != 0.5f) {
            this.f70319n0.Z1(f15);
        }
        int i18 = this.f70331z0;
        if (i18 != 2) {
            this.f70319n0.T1(i18);
        }
        int i19 = this.f70330y0;
        if (i19 != 2) {
            this.f70319n0.d2(i19);
        }
        int i21 = this.f70324s0;
        if (i21 != -1) {
            this.f70319n0.g2(i21);
        }
        int i22 = this.f70325t0;
        if (i22 != -1) {
            this.f70319n0.S1(i22);
        }
        int i23 = this.f70326u0;
        if (i23 != -1) {
            this.f70319n0.a2(i23);
        }
        int i24 = this.f70327v0;
        if (i24 != -1) {
            this.f70319n0.W1(i24);
        }
        int i25 = this.f70328w0;
        if (i25 != -1) {
            this.f70319n0.Q1(i25);
        }
        int i26 = this.f70329x0;
        if (i26 != -1) {
            this.f70319n0.Y1(i26);
        }
        I();
    }

    public final void b0(int i11) {
        this.f70310D0 = i11;
    }

    public final void c0(int i11) {
        this.f70311E0 = i11;
    }

    public final void d0(int i11) {
        this.f70330y0 = i11;
    }

    public final void e0(int i11) {
        this.f70307A0 = i11;
    }

    public final void f0(int i11) {
        this.f70324s0 = i11;
    }

    public final void g0(int i11) {
        this.f70323r0 = i11;
    }
}
