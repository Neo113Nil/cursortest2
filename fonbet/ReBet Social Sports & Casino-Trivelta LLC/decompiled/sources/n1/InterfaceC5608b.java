package n1;

import android.util.SparseArray;
import androidx.media3.exoplayer.source.C2223y;
import androidx.media3.exoplayer.source.D;
import b1.AbstractC2339H;
import b1.AbstractC2346O;
import b1.C2333B;
import b1.C2334C;
import b1.C2340I;
import b1.C2350d;
import b1.C2361o;
import b1.C2364s;
import b1.InterfaceC2341J;
import d1.C3987c;
import e1.AbstractC4134a;
import java.io.IOException;
import java.util.List;
import java.util.Objects;
import m1.C5507g;
import m1.C5509h;
import o1.InterfaceC5773z;

/* renamed from: n1.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public interface InterfaceC5608b {

    /* renamed from: n1.b$a */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public final long f56808a;

        /* renamed from: b, reason: collision with root package name */
        public final AbstractC2346O f56809b;

        /* renamed from: c, reason: collision with root package name */
        public final int f56810c;

        /* renamed from: d, reason: collision with root package name */
        public final D.b f56811d;

        /* renamed from: e, reason: collision with root package name */
        public final long f56812e;

        /* renamed from: f, reason: collision with root package name */
        public final AbstractC2346O f56813f;

        /* renamed from: g, reason: collision with root package name */
        public final int f56814g;

        /* renamed from: h, reason: collision with root package name */
        public final D.b f56815h;

        /* renamed from: i, reason: collision with root package name */
        public final long f56816i;

        /* renamed from: j, reason: collision with root package name */
        public final long f56817j;

        public a(long j10, AbstractC2346O abstractC2346O, int i10, D.b bVar, long j11, AbstractC2346O abstractC2346O2, int i11, D.b bVar2, long j12, long j13) {
            this.f56808a = j10;
            this.f56809b = abstractC2346O;
            this.f56810c = i10;
            this.f56811d = bVar;
            this.f56812e = j11;
            this.f56813f = abstractC2346O2;
            this.f56814g = i11;
            this.f56815h = bVar2;
            this.f56816i = j12;
            this.f56817j = j13;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj != null && a.class == obj.getClass()) {
                a aVar = (a) obj;
                if (this.f56808a == aVar.f56808a && this.f56810c == aVar.f56810c && this.f56812e == aVar.f56812e && this.f56814g == aVar.f56814g && this.f56816i == aVar.f56816i && this.f56817j == aVar.f56817j && Objects.equals(this.f56809b, aVar.f56809b) && Objects.equals(this.f56811d, aVar.f56811d) && Objects.equals(this.f56813f, aVar.f56813f) && Objects.equals(this.f56815h, aVar.f56815h)) {
                    return true;
                }
            }
            return false;
        }

        public int hashCode() {
            return Objects.hash(Long.valueOf(this.f56808a), this.f56809b, Integer.valueOf(this.f56810c), this.f56811d, Long.valueOf(this.f56812e), this.f56813f, Integer.valueOf(this.f56814g), this.f56815h, Long.valueOf(this.f56816i), Long.valueOf(this.f56817j));
        }
    }

    /* renamed from: n1.b$b, reason: collision with other inner class name */
    public static final class C0829b {

        /* renamed from: a, reason: collision with root package name */
        public final C2364s f56818a;

        /* renamed from: b, reason: collision with root package name */
        public final SparseArray f56819b;

        public C0829b(C2364s c2364s, SparseArray sparseArray) {
            this.f56818a = c2364s;
            SparseArray sparseArray2 = new SparseArray(c2364s.d());
            for (int i10 = 0; i10 < c2364s.d(); i10++) {
                int c10 = c2364s.c(i10);
                sparseArray2.append(c10, (a) AbstractC4134a.e((a) sparseArray.get(c10)));
            }
            this.f56819b = sparseArray2;
        }

        public boolean a(int i10) {
            return this.f56818a.a(i10);
        }

        public int b(int i10) {
            return this.f56818a.c(i10);
        }

        public a c(int i10) {
            return (a) AbstractC4134a.e((a) this.f56819b.get(i10));
        }

        public int d() {
            return this.f56818a.d();
        }
    }

    void B(a aVar, b1.Y y10);

    void a0(a aVar, InterfaceC2341J.e eVar, InterfaceC2341J.e eVar2, int i10);

    void c0(a aVar, androidx.media3.exoplayer.source.B b10);

    void e(a aVar, AbstractC2339H abstractC2339H);

    void q(a aVar, C2223y c2223y, androidx.media3.exoplayer.source.B b10, IOException iOException, boolean z10);

    void q0(a aVar, C5507g c5507g);

    default void G(a aVar) {
    }

    default void d0(a aVar) {
    }

    default void h0(a aVar) {
    }

    default void n0(a aVar) {
    }

    default void w0(a aVar) {
    }

    default void x0(a aVar) {
    }

    default void z(a aVar) {
    }

    default void F(a aVar, C5507g c5507g) {
    }

    default void I(a aVar, Exception exc) {
    }

    default void K(a aVar, C2361o c2361o) {
    }

    default void L(a aVar, InterfaceC5773z.a aVar2) {
    }

    default void M(a aVar, int i10) {
    }

    default void N(a aVar, C2333B c2333b) {
    }

    default void O(a aVar, AbstractC2339H abstractC2339H) {
    }

    default void P(a aVar, int i10) {
    }

    default void W(a aVar, String str) {
    }

    default void X(a aVar, Exception exc) {
    }

    default void Y(InterfaceC2341J interfaceC2341J, C0829b c0829b) {
    }

    default void Z(a aVar, int i10) {
    }

    default void b(a aVar, long j10) {
    }

    default void b0(a aVar, InterfaceC5773z.a aVar2) {
    }

    default void d(a aVar, b1.S s10) {
    }

    default void e0(a aVar, boolean z10) {
    }

    default void f(a aVar, C2334C c2334c) {
    }

    default void g(a aVar, boolean z10) {
    }

    default void g0(a aVar, float f10) {
    }

    default void h(a aVar, C5507g c5507g) {
    }

    default void i(a aVar, C2350d c2350d) {
    }

    default void j(a aVar, int i10) {
    }

    default void j0(a aVar, int i10) {
    }

    default void k(a aVar, Exception exc) {
    }

    default void k0(a aVar, b1.T t10) {
    }

    default void l(a aVar, C2340I c2340i) {
    }

    default void l0(a aVar, C5507g c5507g) {
    }

    default void m(a aVar, C3987c c3987c) {
    }

    default void m0(a aVar, int i10) {
    }

    default void n(a aVar, Exception exc) {
    }

    default void r0(a aVar, boolean z10) {
    }

    default void s0(a aVar, List list) {
    }

    default void t(a aVar, int i10) {
    }

    default void t0(a aVar, InterfaceC2341J.b bVar) {
    }

    default void u0(a aVar, androidx.media3.exoplayer.source.B b10) {
    }

    default void v(a aVar, String str) {
    }

    default void w(a aVar, boolean z10) {
    }

    default void y(a aVar, boolean z10) {
    }

    default void A(a aVar, long j10, int i10) {
    }

    default void C(a aVar, boolean z10, int i10) {
    }

    default void E(a aVar, int i10, long j10) {
    }

    default void J(a aVar, String str, long j10) {
    }

    default void Q(a aVar, C2223y c2223y, androidx.media3.exoplayer.source.B b10) {
    }

    default void T(a aVar, boolean z10, int i10) {
    }

    default void U(a aVar, String str, long j10) {
    }

    default void V(a aVar, androidx.media3.common.a aVar2, C5509h c5509h) {
    }

    default void a(a aVar, Object obj, long j10) {
    }

    default void f0(a aVar, androidx.media3.common.a aVar2, C5509h c5509h) {
    }

    default void i0(a aVar, C2223y c2223y, androidx.media3.exoplayer.source.B b10) {
    }

    default void o(a aVar, int i10, boolean z10) {
    }

    default void o0(a aVar, int i10, int i11) {
    }

    default void p0(a aVar, b1.z zVar, int i10) {
    }

    default void x(a aVar, C2223y c2223y, androidx.media3.exoplayer.source.B b10) {
    }

    default void D(a aVar, String str, long j10, long j11) {
    }

    default void S(a aVar, String str, long j10, long j11) {
    }

    default void c(a aVar, C2223y c2223y, androidx.media3.exoplayer.source.B b10, int i10) {
    }

    default void s(a aVar, int i10, long j10, long j11) {
    }

    default void v0(a aVar, int i10, long j10, long j11) {
    }

    default void y0(a aVar, int i10, int i11, boolean z10) {
    }

    default void H(a aVar, int i10, int i11, int i12, float f10) {
    }
}
