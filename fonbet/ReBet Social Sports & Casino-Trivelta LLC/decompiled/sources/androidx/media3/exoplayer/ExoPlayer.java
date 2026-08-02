package androidx.media3.exoplayer;

import H1.C1180m;
import Ra.t;
import android.content.Context;
import android.os.Looper;
import androidx.core.app.NotificationManagerCompat;
import androidx.media3.exoplayer.ExoPlayer;
import androidx.media3.exoplayer.d;
import androidx.media3.exoplayer.image.ImageOutput;
import androidx.media3.exoplayer.source.D;
import androidx.media3.exoplayer.trackselection.D;
import androidx.media3.exoplayer.trackselection.F;
import b1.C2350d;
import b1.InterfaceC2341J;
import e1.AbstractC4134a;
import e1.InterfaceC4143j;
import e1.Z;
import m1.P0;
import m1.i1;
import m1.m1;
import m1.n1;
import m1.o1;
import n1.C5650t0;
import n1.InterfaceC5608b;

/* loaded from: classes.dex */
public interface ExoPlayer extends InterfaceC2341J {

    public interface a {
        default void D(boolean z10) {
        }

        void G(boolean z10);
    }

    public static class c {

        /* renamed from: b, reason: collision with root package name */
        public static final c f20890b = new c(-9223372036854775807L);

        /* renamed from: a, reason: collision with root package name */
        public final long f20891a;

        public c(long j10) {
            this.f20891a = j10;
        }
    }

    void A(InterfaceC5608b interfaceC5608b);

    D N();

    int O(int i10);

    int U();

    void b(InterfaceC5608b interfaceC5608b);

    boolean isScrubbingModeEnabled();

    void q(androidx.media3.exoplayer.source.D d10, boolean z10);

    void release();

    void s(androidx.media3.exoplayer.source.D d10, long j10);

    void setImageOutput(ImageOutput imageOutput);

    void setScrubbingModeEnabled(boolean z10);

    androidx.media3.common.a y();

    public static final class b {

        /* renamed from: A, reason: collision with root package name */
        public long f20854A;

        /* renamed from: B, reason: collision with root package name */
        public long f20855B;

        /* renamed from: C, reason: collision with root package name */
        public boolean f20856C;

        /* renamed from: D, reason: collision with root package name */
        public boolean f20857D;

        /* renamed from: E, reason: collision with root package name */
        public i1 f20858E;

        /* renamed from: F, reason: collision with root package name */
        public boolean f20859F;

        /* renamed from: G, reason: collision with root package name */
        public boolean f20860G;

        /* renamed from: H, reason: collision with root package name */
        public String f20861H;

        /* renamed from: I, reason: collision with root package name */
        public boolean f20862I;

        /* renamed from: J, reason: collision with root package name */
        public s f20863J;

        /* renamed from: a, reason: collision with root package name */
        public final Context f20864a;

        /* renamed from: b, reason: collision with root package name */
        public InterfaceC4143j f20865b;

        /* renamed from: c, reason: collision with root package name */
        public long f20866c;

        /* renamed from: d, reason: collision with root package name */
        public t f20867d;

        /* renamed from: e, reason: collision with root package name */
        public t f20868e;

        /* renamed from: f, reason: collision with root package name */
        public t f20869f;

        /* renamed from: g, reason: collision with root package name */
        public t f20870g;

        /* renamed from: h, reason: collision with root package name */
        public t f20871h;

        /* renamed from: i, reason: collision with root package name */
        public Ra.f f20872i;

        /* renamed from: j, reason: collision with root package name */
        public Looper f20873j;

        /* renamed from: k, reason: collision with root package name */
        public int f20874k;

        /* renamed from: l, reason: collision with root package name */
        public C2350d f20875l;

        /* renamed from: m, reason: collision with root package name */
        public boolean f20876m;

        /* renamed from: n, reason: collision with root package name */
        public int f20877n;

        /* renamed from: o, reason: collision with root package name */
        public boolean f20878o;

        /* renamed from: p, reason: collision with root package name */
        public boolean f20879p;

        /* renamed from: q, reason: collision with root package name */
        public boolean f20880q;

        /* renamed from: r, reason: collision with root package name */
        public int f20881r;

        /* renamed from: s, reason: collision with root package name */
        public int f20882s;

        /* renamed from: t, reason: collision with root package name */
        public boolean f20883t;

        /* renamed from: u, reason: collision with root package name */
        public o1 f20884u;

        /* renamed from: v, reason: collision with root package name */
        public n1 f20885v;

        /* renamed from: w, reason: collision with root package name */
        public long f20886w;

        /* renamed from: x, reason: collision with root package name */
        public long f20887x;

        /* renamed from: y, reason: collision with root package name */
        public long f20888y;

        /* renamed from: z, reason: collision with root package name */
        public P0 f20889z;

        public b(final Context context, final m1 m1Var) {
            this(context, new t() { // from class: m1.N
                @Override // Ra.t
                public final Object get() {
                    return ExoPlayer.b.f(m1.this);
                }
            }, new t() { // from class: m1.O
                @Override // Ra.t
                public final Object get() {
                    return ExoPlayer.b.a(context);
                }
            });
            AbstractC4134a.e(m1Var);
        }

        public static /* synthetic */ D.a a(Context context) {
            return new androidx.media3.exoplayer.source.r(context, new C1180m());
        }

        public static /* synthetic */ j b(j jVar) {
            return jVar;
        }

        public static /* synthetic */ D.a c(D.a aVar) {
            return aVar;
        }

        public static /* synthetic */ F e(F f10) {
            return f10;
        }

        public static /* synthetic */ m1 f(m1 m1Var) {
            return m1Var;
        }

        public static /* synthetic */ D1.d g(D1.d dVar) {
            return dVar;
        }

        public static /* synthetic */ F h(Context context) {
            return new androidx.media3.exoplayer.trackselection.n(context);
        }

        public ExoPlayer i() {
            AbstractC4134a.g(!this.f20859F);
            this.f20859F = true;
            return new h(this, null);
        }

        public b j(boolean z10) {
            AbstractC4134a.g(!this.f20859F);
            this.f20862I = z10;
            return this;
        }

        public b k(final D1.d dVar) {
            AbstractC4134a.g(!this.f20859F);
            AbstractC4134a.e(dVar);
            this.f20871h = new t() { // from class: m1.K
                @Override // Ra.t
                public final Object get() {
                    return ExoPlayer.b.g(D1.d.this);
                }
            };
            return this;
        }

        public b l(InterfaceC4143j interfaceC4143j) {
            AbstractC4134a.g(!this.f20859F);
            this.f20865b = interfaceC4143j;
            return this;
        }

        public b m(final j jVar) {
            AbstractC4134a.g(!this.f20859F);
            AbstractC4134a.e(jVar);
            this.f20870g = new t() { // from class: m1.J
                @Override // Ra.t
                public final Object get() {
                    return ExoPlayer.b.b(androidx.media3.exoplayer.j.this);
                }
            };
            return this;
        }

        public b n(Looper looper) {
            AbstractC4134a.g(!this.f20859F);
            AbstractC4134a.e(looper);
            this.f20873j = looper;
            return this;
        }

        public b o(final D.a aVar) {
            AbstractC4134a.g(!this.f20859F);
            AbstractC4134a.e(aVar);
            this.f20868e = new t() { // from class: m1.M
                @Override // Ra.t
                public final Object get() {
                    return ExoPlayer.b.c(D.a.this);
                }
            };
            return this;
        }

        public b p(final F f10) {
            AbstractC4134a.g(!this.f20859F);
            AbstractC4134a.e(f10);
            this.f20869f = new t() { // from class: m1.L
                @Override // Ra.t
                public final Object get() {
                    return ExoPlayer.b.e(androidx.media3.exoplayer.trackselection.F.this);
                }
            };
            return this;
        }

        public b q(boolean z10) {
            AbstractC4134a.g(!this.f20859F);
            this.f20857D = z10;
            return this;
        }

        public b(final Context context, t tVar, t tVar2) {
            this(context, tVar, tVar2, new t() { // from class: m1.P
                @Override // Ra.t
                public final Object get() {
                    return ExoPlayer.b.h(context);
                }
            }, new t() { // from class: m1.Q
                @Override // Ra.t
                public final Object get() {
                    return new androidx.media3.exoplayer.e();
                }
            }, new t() { // from class: m1.S
                @Override // Ra.t
                public final Object get() {
                    D1.d n10;
                    n10 = D1.i.n(context);
                    return n10;
                }
            }, new Ra.f() { // from class: m1.T
                @Override // Ra.f
                public final Object apply(Object obj) {
                    return new C5650t0((InterfaceC4143j) obj);
                }
            });
        }

        public b(Context context, t tVar, t tVar2, t tVar3, t tVar4, t tVar5, Ra.f fVar) {
            this.f20864a = (Context) AbstractC4134a.e(context);
            this.f20867d = tVar;
            this.f20868e = tVar2;
            this.f20869f = tVar3;
            this.f20870g = tVar4;
            this.f20871h = tVar5;
            this.f20872i = fVar;
            this.f20873j = Z.a0();
            this.f20875l = C2350d.f24567h;
            this.f20877n = 0;
            this.f20881r = 1;
            this.f20882s = 0;
            this.f20883t = true;
            this.f20884u = o1.f56300g;
            this.f20886w = 5000L;
            this.f20887x = 15000L;
            this.f20888y = 3000L;
            this.f20885v = n1.f56279i;
            this.f20889z = new d.b().a();
            this.f20865b = InterfaceC4143j.f45530a;
            this.f20854A = 500L;
            this.f20855B = 2000L;
            this.f20857D = true;
            this.f20861H = "";
            this.f20874k = NotificationManagerCompat.IMPORTANCE_UNSPECIFIED;
            this.f20863J = new g();
        }
    }
}
