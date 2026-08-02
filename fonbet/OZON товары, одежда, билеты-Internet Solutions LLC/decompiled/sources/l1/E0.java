package l1;

import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes.dex */
public final class E0 implements InterfaceC7825i0 {

    /* renamed from: a, reason: collision with root package name */
    private int f72198a;

    /* renamed from: e, reason: collision with root package name */
    private float f72202e;

    /* renamed from: f, reason: collision with root package name */
    private float f72203f;

    /* renamed from: g, reason: collision with root package name */
    private float f72204g;

    /* renamed from: j, reason: collision with root package name */
    private float f72207j;

    /* renamed from: k, reason: collision with root package name */
    private float f72208k;

    /* renamed from: l, reason: collision with root package name */
    private float f72209l;

    /* renamed from: n, reason: collision with root package name */
    private long f72211n;

    /* renamed from: o, reason: collision with root package name */
    @NotNull
    private J0 f72212o;

    /* renamed from: p, reason: collision with root package name */
    private boolean f72213p;

    /* renamed from: q, reason: collision with root package name */
    private int f72214q;

    /* renamed from: r, reason: collision with root package name */
    private long f72215r;

    /* renamed from: s, reason: collision with root package name */
    @NotNull
    private Z1.d f72216s;

    /* renamed from: t, reason: collision with root package name */
    @NotNull
    private Z1.s f72217t;

    /* renamed from: u, reason: collision with root package name */
    private z0 f72218u;

    /* renamed from: v, reason: collision with root package name */
    private AbstractC7839p0 f72219v;

    /* renamed from: b, reason: collision with root package name */
    private float f72199b = 1.0f;

    /* renamed from: c, reason: collision with root package name */
    private float f72200c = 1.0f;

    /* renamed from: d, reason: collision with root package name */
    private float f72201d = 1.0f;

    /* renamed from: h, reason: collision with root package name */
    private long f72205h = C7827j0.a();

    /* renamed from: i, reason: collision with root package name */
    private long f72206i = C7827j0.a();

    /* renamed from: m, reason: collision with root package name */
    private float f72210m = 8.0f;

    public E0() {
        long j11;
        j11 = N0.f72232b;
        this.f72211n = j11;
        this.f72212o = y0.a();
        this.f72214q = 0;
        this.f72215r = 9205357640488583168L;
        this.f72216s = Z1.f.b();
        this.f72217t = Z1.s.Ltr;
    }

    public final AbstractC7839p0 A() {
        return this.f72219v;
    }

    public final z0 D() {
        return this.f72218u;
    }

    public final float E() {
        return this.f72207j;
    }

    public final float G() {
        return this.f72208k;
    }

    @Override // l1.InterfaceC7825i0
    public final void H(long j11) {
        if (C7807Z.p(this.f72205h, j11)) {
            return;
        }
        this.f72198a |= 64;
        this.f72205h = j11;
    }

    public final float I() {
        return this.f72209l;
    }

    @Override // l1.InterfaceC7825i0
    public final void J(long j11) {
        if (C7807Z.p(this.f72206i, j11)) {
            return;
        }
        this.f72198a |= UserVerificationMethods.USER_VERIFY_PATTERN;
        this.f72206i = j11;
    }

    public final float K() {
        return this.f72199b;
    }

    public final float L() {
        return this.f72200c;
    }

    public final float M() {
        return this.f72204g;
    }

    @NotNull
    public final J0 N() {
        return this.f72212o;
    }

    public final long O() {
        return this.f72206i;
    }

    public final long P() {
        return this.f72211n;
    }

    public final float S() {
        return this.f72202e;
    }

    public final float T() {
        return this.f72203f;
    }

    public final void W() {
        long j11;
        j(1.0f);
        k(1.0f);
        setAlpha(1.0f);
        n(0.0f);
        c(0.0f);
        z(0.0f);
        H(C7827j0.a());
        J(C7827j0.a());
        e(0.0f);
        f(0.0f);
        h(0.0f);
        d(8.0f);
        j11 = N0.f72232b;
        g0(j11);
        setShape(y0.a());
        x(false);
        l(null);
        q(0);
        this.f72215r = 9205357640488583168L;
        this.f72219v = null;
        this.f72198a = 0;
    }

    public final void Y(@NotNull Z1.d dVar) {
        this.f72216s = dVar;
    }

    public final void a0(@NotNull Z1.s sVar) {
        this.f72217t = sVar;
    }

    public final void b0(long j11) {
        this.f72215r = j11;
    }

    @Override // l1.InterfaceC7825i0
    public final void c(float f7) {
        if (this.f72203f == f7) {
            return;
        }
        this.f72198a |= 16;
        this.f72203f = f7;
    }

    public final void c0() {
        this.f72219v = this.f72212o.mo1createOutlinePq9zytI(this.f72215r, this.f72217t, this.f72216s);
    }

    @Override // l1.InterfaceC7825i0
    public final void d(float f7) {
        if (this.f72210m == f7) {
            return;
        }
        this.f72198a |= 2048;
        this.f72210m = f7;
    }

    @Override // l1.InterfaceC7825i0
    public final void e(float f7) {
        if (this.f72207j == f7) {
            return;
        }
        this.f72198a |= 256;
        this.f72207j = f7;
    }

    @Override // l1.InterfaceC7825i0
    public final void f(float f7) {
        if (this.f72208k == f7) {
            return;
        }
        this.f72198a |= UserVerificationMethods.USER_VERIFY_NONE;
        this.f72208k = f7;
    }

    @Override // Z1.d
    public final float g() {
        return this.f72216s.g();
    }

    @Override // l1.InterfaceC7825i0
    public final void g0(long j11) {
        if (N0.c(this.f72211n, j11)) {
            return;
        }
        this.f72198a |= 4096;
        this.f72211n = j11;
    }

    @Override // l1.InterfaceC7825i0
    public final float getAlpha() {
        return this.f72201d;
    }

    @Override // l1.InterfaceC7825i0
    public final void h(float f7) {
        if (this.f72209l == f7) {
            return;
        }
        this.f72198a |= UserVerificationMethods.USER_VERIFY_ALL;
        this.f72209l = f7;
    }

    @Override // l1.InterfaceC7825i0
    public final long i() {
        return this.f72215r;
    }

    @Override // l1.InterfaceC7825i0
    public final void j(float f7) {
        if (this.f72199b == f7) {
            return;
        }
        this.f72198a |= 1;
        this.f72199b = f7;
    }

    @Override // l1.InterfaceC7825i0
    public final void k(float f7) {
        if (this.f72200c == f7) {
            return;
        }
        this.f72198a |= 2;
        this.f72200c = f7;
    }

    @Override // l1.InterfaceC7825i0
    public final void l(z0 z0Var) {
        if (Intrinsics.d(this.f72218u, z0Var)) {
            return;
        }
        this.f72198a |= 131072;
        this.f72218u = z0Var;
    }

    public final long m() {
        return this.f72205h;
    }

    @Override // l1.InterfaceC7825i0
    public final void n(float f7) {
        if (this.f72202e == f7) {
            return;
        }
        this.f72198a |= 8;
        this.f72202e = f7;
    }

    @Override // l1.InterfaceC7825i0
    public final void q(int i11) {
        if (this.f72214q == i11) {
            return;
        }
        this.f72198a |= 32768;
        this.f72214q = i11;
    }

    public final float s() {
        return this.f72210m;
    }

    @Override // l1.InterfaceC7825i0
    public final void setAlpha(float f7) {
        if (this.f72201d == f7) {
            return;
        }
        this.f72198a |= 4;
        this.f72201d = f7;
    }

    @Override // l1.InterfaceC7825i0
    public final void setShape(@NotNull J0 j02) {
        if (Intrinsics.d(this.f72212o, j02)) {
            return;
        }
        this.f72198a |= 8192;
        this.f72212o = j02;
    }

    public final boolean t() {
        return this.f72213p;
    }

    public final int u() {
        return this.f72214q;
    }

    @Override // Z1.k
    public final float u1() {
        return this.f72216s.u1();
    }

    @NotNull
    public final Z1.d v() {
        return this.f72216s;
    }

    @NotNull
    public final Z1.s w() {
        return this.f72217t;
    }

    @Override // l1.InterfaceC7825i0
    public final void x(boolean z11) {
        if (this.f72213p != z11) {
            this.f72198a |= 16384;
            this.f72213p = z11;
        }
    }

    public final int y() {
        return this.f72198a;
    }

    @Override // l1.InterfaceC7825i0
    public final void z(float f7) {
        if (this.f72204g == f7) {
            return;
        }
        this.f72198a |= 32;
        this.f72204g = f7;
    }
}
