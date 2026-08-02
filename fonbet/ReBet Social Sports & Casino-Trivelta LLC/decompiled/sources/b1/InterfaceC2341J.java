package b1;

import android.os.Looper;
import android.view.SurfaceView;
import android.view.TextureView;
import b1.C2364s;
import d1.C3987c;
import e1.Z;
import java.util.List;
import java.util.Objects;

/* renamed from: b1.J, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public interface InterfaceC2341J {

    /* renamed from: b1.J$b */
    public static final class b {

        /* renamed from: b, reason: collision with root package name */
        public static final b f24318b = new a().e();

        /* renamed from: c, reason: collision with root package name */
        public static final String f24319c = Z.K0(0);

        /* renamed from: a, reason: collision with root package name */
        public final C2364s f24320a;

        /* renamed from: b1.J$b$a */
        public static final class a {
            private static final int[] SUPPORTED_COMMANDS = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 31, 20, 21, 22, 23, 24, 25, 33, 26, 34, 35, 27, 28, 29, 30, 32};

            /* renamed from: a, reason: collision with root package name */
            public final C2364s.b f24321a = new C2364s.b();

            public a a(int i10) {
                this.f24321a.a(i10);
                return this;
            }

            public a b(b bVar) {
                this.f24321a.b(bVar.f24320a);
                return this;
            }

            public a c(int... iArr) {
                this.f24321a.c(iArr);
                return this;
            }

            public a d(int i10, boolean z10) {
                this.f24321a.d(i10, z10);
                return this;
            }

            public b e() {
                return new b(this.f24321a.e());
            }
        }

        public boolean b(int i10) {
            return this.f24320a.a(i10);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof b) {
                return this.f24320a.equals(((b) obj).f24320a);
            }
            return false;
        }

        public int hashCode() {
            return this.f24320a.hashCode();
        }

        public b(C2364s c2364s) {
            this.f24320a = c2364s;
        }
    }

    /* renamed from: b1.J$c */
    public static final class c {

        /* renamed from: a, reason: collision with root package name */
        public final C2364s f24322a;

        public c(C2364s c2364s) {
            this.f24322a = c2364s;
        }

        public boolean a(int i10) {
            return this.f24322a.a(i10);
        }

        public boolean b(int... iArr) {
            return this.f24322a.b(iArr);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof c) {
                return this.f24322a.equals(((c) obj).f24322a);
            }
            return false;
        }

        public int hashCode() {
            return this.f24322a.hashCode();
        }
    }

    /* renamed from: b1.J$e */
    public static final class e {

        /* renamed from: k, reason: collision with root package name */
        public static final String f24323k = Z.K0(0);

        /* renamed from: l, reason: collision with root package name */
        public static final String f24324l = Z.K0(1);

        /* renamed from: m, reason: collision with root package name */
        public static final String f24325m = Z.K0(2);

        /* renamed from: n, reason: collision with root package name */
        public static final String f24326n = Z.K0(3);

        /* renamed from: o, reason: collision with root package name */
        public static final String f24327o = Z.K0(4);

        /* renamed from: p, reason: collision with root package name */
        public static final String f24328p = Z.K0(5);

        /* renamed from: q, reason: collision with root package name */
        public static final String f24329q = Z.K0(6);

        /* renamed from: a, reason: collision with root package name */
        public final Object f24330a;

        /* renamed from: b, reason: collision with root package name */
        public final int f24331b;

        /* renamed from: c, reason: collision with root package name */
        public final int f24332c;

        /* renamed from: d, reason: collision with root package name */
        public final z f24333d;

        /* renamed from: e, reason: collision with root package name */
        public final Object f24334e;

        /* renamed from: f, reason: collision with root package name */
        public final int f24335f;

        /* renamed from: g, reason: collision with root package name */
        public final long f24336g;

        /* renamed from: h, reason: collision with root package name */
        public final long f24337h;

        /* renamed from: i, reason: collision with root package name */
        public final int f24338i;

        /* renamed from: j, reason: collision with root package name */
        public final int f24339j;

        public e(Object obj, int i10, z zVar, Object obj2, int i11, long j10, long j11, int i12, int i13) {
            this.f24330a = obj;
            this.f24331b = i10;
            this.f24332c = i10;
            this.f24333d = zVar;
            this.f24334e = obj2;
            this.f24335f = i11;
            this.f24336g = j10;
            this.f24337h = j11;
            this.f24338i = i12;
            this.f24339j = i13;
        }

        public boolean a(e eVar) {
            return this.f24332c == eVar.f24332c && this.f24335f == eVar.f24335f && this.f24336g == eVar.f24336g && this.f24337h == eVar.f24337h && this.f24338i == eVar.f24338i && this.f24339j == eVar.f24339j && Objects.equals(this.f24333d, eVar.f24333d);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj != null && e.class == obj.getClass()) {
                e eVar = (e) obj;
                if (a(eVar) && Objects.equals(this.f24330a, eVar.f24330a) && Objects.equals(this.f24334e, eVar.f24334e)) {
                    return true;
                }
            }
            return false;
        }

        public int hashCode() {
            return Objects.hash(this.f24330a, Integer.valueOf(this.f24332c), this.f24333d, this.f24334e, Integer.valueOf(this.f24335f), Long.valueOf(this.f24336g), Long.valueOf(this.f24337h), Integer.valueOf(this.f24338i), Integer.valueOf(this.f24339j));
        }

        public String toString() {
            String str = "mediaItem=" + this.f24332c + ", period=" + this.f24335f + ", pos=" + this.f24336g;
            if (this.f24338i == -1) {
                return str;
            }
            return str + ", contentPos=" + this.f24337h + ", adGroup=" + this.f24338i + ", ad=" + this.f24339j;
        }
    }

    boolean B();

    C3987c C();

    int D();

    boolean E(int i10);

    void F(C2350d c2350d, boolean z10);

    boolean G();

    int H();

    AbstractC2346O I();

    Looper J();

    S K();

    void L();

    void M(TextureView textureView);

    void P(z zVar);

    void Q(int i10, long j10);

    b R();

    boolean S();

    void T(boolean z10);

    long V();

    long W();

    int X();

    void Y(TextureView textureView);

    Y Z();

    boolean a0();

    int b0();

    long c0();

    C2340I d();

    long d0();

    void e(C2340I c2340i);

    long e0();

    boolean f0();

    void g();

    int g0();

    long getCurrentPosition();

    long getDuration();

    void h(float f10);

    int h0();

    void i0(int i10);

    boolean isPlaying();

    boolean j();

    void j0(S s10);

    long k();

    void k0(SurfaceView surfaceView);

    void l();

    int l0();

    int m();

    boolean m0();

    void n();

    long n0();

    void o(List list, boolean z10);

    void o0();

    void p(d dVar);

    void p0();

    void pause();

    void play();

    C2333B q0();

    void r(SurfaceView surfaceView);

    long r0();

    boolean s0();

    void seekTo(long j10);

    void stop();

    void t(int i10, int i11);

    void u();

    void v(d dVar);

    AbstractC2339H w();

    void x(boolean z10);

    T z();

    /* renamed from: b1.J$d */
    public interface d {
        default void Q() {
        }

        default void C(int i10) {
        }

        default void D(boolean z10) {
        }

        default void F(int i10) {
        }

        default void I(boolean z10) {
        }

        default void J(AbstractC2339H abstractC2339H) {
        }

        default void L(S s10) {
        }

        default void M(C2333B c2333b) {
        }

        default void N(AbstractC2339H abstractC2339H) {
        }

        default void P(C2361o c2361o) {
        }

        default void S(b bVar) {
        }

        default void V(C2350d c2350d) {
        }

        default void a(int i10) {
        }

        default void b(boolean z10) {
        }

        default void b0(int i10) {
        }

        default void c(Y y10) {
        }

        default void c0(boolean z10) {
        }

        default void f0(float f10) {
        }

        default void g0(T t10) {
        }

        default void n(List list) {
        }

        default void n0(int i10) {
        }

        default void t0(boolean z10) {
        }

        default void u(C2340I c2340i) {
        }

        default void w(C2334C c2334c) {
        }

        default void y(C3987c c3987c) {
        }

        default void K(int i10, boolean z10) {
        }

        default void W(int i10, int i11) {
        }

        default void d0(AbstractC2346O abstractC2346O, int i10) {
        }

        default void e0(z zVar, int i10) {
        }

        default void m0(boolean z10, int i10) {
        }

        default void o0(boolean z10, int i10) {
        }

        default void r0(InterfaceC2341J interfaceC2341J, c cVar) {
        }

        default void X(e eVar, e eVar2, int i10) {
        }
    }
}
