package androidx.media3.exoplayer;

import F1.O;
import F1.x;
import F1.y;
import G1.l;
import android.content.Context;
import android.graphics.Rect;
import android.graphics.SurfaceTexture;
import android.media.MediaFormat;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.util.Pair;
import android.view.Surface;
import android.view.SurfaceHolder;
import android.view.SurfaceView;
import android.view.TextureView;
import androidx.media3.exoplayer.ExoPlayer;
import androidx.media3.exoplayer.a;
import androidx.media3.exoplayer.h;
import androidx.media3.exoplayer.i;
import androidx.media3.exoplayer.image.ImageOutput;
import androidx.media3.exoplayer.n;
import androidx.media3.exoplayer.o;
import androidx.media3.exoplayer.r;
import androidx.media3.exoplayer.s;
import androidx.media3.exoplayer.source.A;
import androidx.media3.exoplayer.source.D;
import androidx.media3.exoplayer.source.e0;
import androidx.media3.exoplayer.trackselection.F;
import androidx.media3.exoplayer.trackselection.G;
import b1.AbstractC2332A;
import b1.AbstractC2346O;
import b1.AbstractC2355i;
import b1.C2333B;
import b1.C2334C;
import b1.C2340I;
import b1.C2350d;
import b1.C2361o;
import b1.C2364s;
import b1.C2369x;
import b1.InterfaceC2341J;
import b1.S;
import b1.T;
import b1.Y;
import b1.z;
import com.google.common.collect.AbstractC3445z;
import com.google.common.collect.E;
import com.google.common.collect.m0;
import d1.C3987c;
import e1.AbstractC4134a;
import e1.AbstractC4156x;
import e1.C4140g;
import e1.C4146m;
import e1.C4155w;
import e1.InterfaceC4143j;
import e1.InterfaceC4152t;
import e1.L;
import e1.Z;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.CopyOnWriteArraySet;
import m1.C1;
import m1.C5507g;
import m1.C5509h;
import m1.I;
import m1.N0;
import m1.T0;
import m1.h1;
import m1.j1;
import m1.k1;
import m1.m1;
import m1.n1;
import m1.o1;
import m1.z1;
import n1.G1;
import n1.InterfaceC5605a;
import n1.InterfaceC5608b;
import o1.InterfaceC5772y;
import o1.InterfaceC5773z;
import w1.InterfaceC6697b;

/* loaded from: classes.dex */
public final class h extends AbstractC2355i implements ExoPlayer {

    /* renamed from: A, reason: collision with root package name */
    public final r f21144A;

    /* renamed from: B, reason: collision with root package name */
    public final z1 f21145B;

    /* renamed from: C, reason: collision with root package name */
    public final C1 f21146C;

    /* renamed from: D, reason: collision with root package name */
    public final long f21147D;

    /* renamed from: E, reason: collision with root package name */
    public final s f21148E;

    /* renamed from: F, reason: collision with root package name */
    public final C4140g f21149F;

    /* renamed from: G, reason: collision with root package name */
    public int f21150G;

    /* renamed from: H, reason: collision with root package name */
    public boolean f21151H;

    /* renamed from: I, reason: collision with root package name */
    public int f21152I;

    /* renamed from: J, reason: collision with root package name */
    public int f21153J;

    /* renamed from: K, reason: collision with root package name */
    public boolean f21154K;

    /* renamed from: L, reason: collision with root package name */
    public boolean f21155L;

    /* renamed from: O, reason: collision with root package name */
    public E f21156O;

    /* renamed from: P, reason: collision with root package name */
    public n1 f21157P;

    /* renamed from: P4, reason: collision with root package name */
    public C5507g f21158P4;

    /* renamed from: Q4, reason: collision with root package name */
    public C2350d f21159Q4;

    /* renamed from: R, reason: collision with root package name */
    public o1 f21160R;

    /* renamed from: R4, reason: collision with root package name */
    public float f21161R4;

    /* renamed from: S4, reason: collision with root package name */
    public boolean f21162S4;

    /* renamed from: T, reason: collision with root package name */
    public e0 f21163T;

    /* renamed from: T1, reason: collision with root package name */
    public G1.l f21164T1;

    /* renamed from: T4, reason: collision with root package name */
    public C3987c f21165T4;

    /* renamed from: U4, reason: collision with root package name */
    public boolean f21166U4;

    /* renamed from: V, reason: collision with root package name */
    public ExoPlayer.c f21167V;

    /* renamed from: V1, reason: collision with root package name */
    public boolean f21168V1;

    /* renamed from: V4, reason: collision with root package name */
    public boolean f21169V4;

    /* renamed from: W, reason: collision with root package name */
    public boolean f21170W;

    /* renamed from: W4, reason: collision with root package name */
    public int f21171W4;

    /* renamed from: X, reason: collision with root package name */
    public InterfaceC2341J.b f21172X;

    /* renamed from: X4, reason: collision with root package name */
    public boolean f21173X4;

    /* renamed from: Y, reason: collision with root package name */
    public C2333B f21174Y;

    /* renamed from: Y4, reason: collision with root package name */
    public boolean f21175Y4;

    /* renamed from: Z, reason: collision with root package name */
    public C2333B f21176Z;

    /* renamed from: Z4, reason: collision with root package name */
    public C2361o f21177Z4;

    /* renamed from: a5, reason: collision with root package name */
    public Y f21178a5;

    /* renamed from: b, reason: collision with root package name */
    public final G f21179b;

    /* renamed from: b1, reason: collision with root package name */
    public androidx.media3.common.a f21180b1;

    /* renamed from: b2, reason: collision with root package name */
    public TextureView f21181b2;

    /* renamed from: b5, reason: collision with root package name */
    public C2333B f21182b5;

    /* renamed from: c, reason: collision with root package name */
    public final InterfaceC2341J.b f21183c;

    /* renamed from: c5, reason: collision with root package name */
    public h1 f21184c5;

    /* renamed from: d, reason: collision with root package name */
    public final C4146m f21185d = new C4146m();

    /* renamed from: d5, reason: collision with root package name */
    public int f21186d5;

    /* renamed from: e, reason: collision with root package name */
    public final Context f21187e;

    /* renamed from: e5, reason: collision with root package name */
    public int f21188e5;

    /* renamed from: f, reason: collision with root package name */
    public final InterfaceC2341J f21189f;

    /* renamed from: f5, reason: collision with root package name */
    public long f21190f5;

    /* renamed from: g, reason: collision with root package name */
    public final F f21191g;

    /* renamed from: g1, reason: collision with root package name */
    public androidx.media3.common.a f21192g1;

    /* renamed from: g2, reason: collision with root package name */
    public int f21193g2;

    /* renamed from: h, reason: collision with root package name */
    public final InterfaceC4152t f21194h;

    /* renamed from: i, reason: collision with root package name */
    public final i.f f21195i;

    /* renamed from: j, reason: collision with root package name */
    public final i f21196j;

    /* renamed from: k, reason: collision with root package name */
    public final C4155w f21197k;

    /* renamed from: l, reason: collision with root package name */
    public final CopyOnWriteArraySet f21198l;

    /* renamed from: m, reason: collision with root package name */
    public final AbstractC2346O.b f21199m;

    /* renamed from: n, reason: collision with root package name */
    public final List f21200n;

    /* renamed from: o, reason: collision with root package name */
    public final boolean f21201o;

    /* renamed from: p, reason: collision with root package name */
    public final D.a f21202p;

    /* renamed from: p1, reason: collision with root package name */
    public Object f21203p1;

    /* renamed from: p2, reason: collision with root package name */
    public int f21204p2;

    /* renamed from: q, reason: collision with root package name */
    public final InterfaceC5605a f21205q;

    /* renamed from: r, reason: collision with root package name */
    public final Looper f21206r;
    private final p[] renderers;

    /* renamed from: s, reason: collision with root package name */
    public final D1.d f21207s;
    private final p[] secondaryRenderers;

    /* renamed from: t, reason: collision with root package name */
    public final long f21208t;

    /* renamed from: u, reason: collision with root package name */
    public final long f21209u;

    /* renamed from: v, reason: collision with root package name */
    public final long f21210v;

    /* renamed from: w, reason: collision with root package name */
    public final InterfaceC4143j f21211w;

    /* renamed from: x, reason: collision with root package name */
    public final c f21212x;

    /* renamed from: x1, reason: collision with root package name */
    public Surface f21213x1;

    /* renamed from: x2, reason: collision with root package name */
    public L f21214x2;

    /* renamed from: y, reason: collision with root package name */
    public final d f21215y;

    /* renamed from: y1, reason: collision with root package name */
    public SurfaceHolder f21216y1;

    /* renamed from: y2, reason: collision with root package name */
    public C5507g f21217y2;

    /* renamed from: z, reason: collision with root package name */
    public final androidx.media3.exoplayer.a f21218z;

    public static final class b {
        public static /* synthetic */ void a(Context context, boolean z10, h hVar, G1 g12) {
            n1.C1 F02 = n1.C1.F0(context);
            if (F02 == null) {
                AbstractC4156x.i("ExoPlayerImpl", "MediaMetricsService unavailable.");
                return;
            }
            if (z10) {
                hVar.b(F02);
            }
            g12.b(F02.M0());
        }

        public static void b(final Context context, final h hVar, final boolean z10, final G1 g12) {
            hVar.V1().d(hVar.a2(), null).j(new Runnable() { // from class: m1.x0
                @Override // java.lang.Runnable
                public final void run() {
                    h.b.a(context, z10, hVar, g12);
                }
            });
        }
    }

    public final class c implements O, InterfaceC5772y, C1.h, InterfaceC6697b, SurfaceHolder.Callback, TextureView.SurfaceTextureListener, l.b, a.b, r.b, ExoPlayer.a {
        public c() {
        }

        @Override // o1.InterfaceC5772y
        public void A(int i10, long j10, long j11) {
            h.this.f21205q.A(i10, j10, j11);
        }

        @Override // F1.O
        public void B(long j10, int i10) {
            h.this.f21205q.B(j10, i10);
        }

        @Override // G1.l.b
        public void C(Surface surface) {
            h.this.z2(null);
        }

        @Override // G1.l.b
        public void E(Surface surface) {
            h.this.z2(surface);
        }

        @Override // androidx.media3.exoplayer.r.b
        public void F(final int i10, final boolean z10) {
            h.this.f21197k.k(30, new C4155w.a() { // from class: m1.H0
                @Override // e1.C4155w.a
                public final void invoke(Object obj) {
                    ((InterfaceC2341J.d) obj).K(i10, z10);
                }
            });
        }

        @Override // androidx.media3.exoplayer.ExoPlayer.a
        public void G(boolean z10) {
            h.this.G2();
        }

        @Override // o1.InterfaceC5772y
        public void a(final int i10) {
            h.this.f21149F.h(new Ra.f() { // from class: m1.y0
                @Override // Ra.f
                public final Object apply(Object obj) {
                    Integer valueOf;
                    valueOf = Integer.valueOf(i10);
                    return valueOf;
                }
            }, new Ra.f() { // from class: m1.A0
                @Override // Ra.f
                public final Object apply(Object obj) {
                    Integer valueOf;
                    valueOf = Integer.valueOf(i10);
                    return valueOf;
                }
            });
        }

        @Override // o1.InterfaceC5772y
        public void b(final boolean z10) {
            if (h.this.f21162S4 == z10) {
                return;
            }
            h.this.f21162S4 = z10;
            h.this.f21197k.k(23, new C4155w.a() { // from class: m1.z0
                @Override // e1.C4155w.a
                public final void invoke(Object obj) {
                    ((InterfaceC2341J.d) obj).b(z10);
                }
            });
        }

        @Override // F1.O
        public void c(final Y y10) {
            h.this.f21178a5 = y10;
            h.this.f21197k.k(25, new C4155w.a() { // from class: m1.F0
                @Override // e1.C4155w.a
                public final void invoke(Object obj) {
                    ((InterfaceC2341J.d) obj).c(b1.Y.this);
                }
            });
        }

        @Override // o1.InterfaceC5772y
        public void d(Exception exc) {
            h.this.f21205q.d(exc);
        }

        @Override // o1.InterfaceC5772y
        public void e(InterfaceC5773z.a aVar) {
            h.this.f21205q.e(aVar);
        }

        @Override // o1.InterfaceC5772y
        public void f(InterfaceC5773z.a aVar) {
            h.this.f21205q.f(aVar);
        }

        @Override // F1.O
        public void g(String str) {
            h.this.f21205q.g(str);
        }

        @Override // F1.O
        public void h(String str, long j10, long j11) {
            h.this.f21205q.h(str, j10, j11);
        }

        @Override // o1.InterfaceC5772y
        public void i(C5507g c5507g) {
            h.this.f21205q.i(c5507g);
            h.this.f21192g1 = null;
            h.this.f21158P4 = null;
        }

        @Override // o1.InterfaceC5772y
        public void j(String str) {
            h.this.f21205q.j(str);
        }

        @Override // o1.InterfaceC5772y
        public void k(String str, long j10, long j11) {
            h.this.f21205q.k(str, j10, j11);
        }

        @Override // F1.O
        public void l(C5507g c5507g) {
            h.this.f21205q.l(c5507g);
            h.this.f21180b1 = null;
            h.this.f21217y2 = null;
        }

        @Override // androidx.media3.exoplayer.a.b
        public void m() {
            h.this.D2(false, 3);
        }

        @Override // C1.h
        public void n(final List list) {
            h.this.f21197k.k(27, new C4155w.a() { // from class: m1.E0
                @Override // e1.C4155w.a
                public final void invoke(Object obj) {
                    ((InterfaceC2341J.d) obj).n(list);
                }
            });
        }

        @Override // o1.InterfaceC5772y
        public void o(long j10) {
            h.this.f21205q.o(j10);
        }

        @Override // android.view.TextureView.SurfaceTextureListener
        public void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i10, int i11) {
            h.this.y2(surfaceTexture);
            h.this.k2(i10, i11);
        }

        @Override // android.view.TextureView.SurfaceTextureListener
        public boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
            h.this.z2(null);
            h.this.k2(0, 0);
            return true;
        }

        @Override // android.view.TextureView.SurfaceTextureListener
        public void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i10, int i11) {
            h.this.k2(i10, i11);
        }

        @Override // android.view.TextureView.SurfaceTextureListener
        public void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
        }

        @Override // F1.O
        public void p(Exception exc) {
            h.this.f21205q.p(exc);
        }

        @Override // o1.InterfaceC5772y
        public void q(C5507g c5507g) {
            h.this.f21158P4 = c5507g;
            h.this.f21205q.q(c5507g);
        }

        @Override // o1.InterfaceC5772y
        public void r(androidx.media3.common.a aVar, C5509h c5509h) {
            h.this.f21192g1 = aVar;
            h.this.f21205q.r(aVar, c5509h);
        }

        @Override // F1.O
        public void s(androidx.media3.common.a aVar, C5509h c5509h) {
            h.this.f21180b1 = aVar;
            h.this.f21205q.s(aVar, c5509h);
        }

        @Override // android.view.SurfaceHolder.Callback
        public void surfaceChanged(SurfaceHolder surfaceHolder, int i10, int i11, int i12) {
            h.this.k2(i11, i12);
        }

        @Override // android.view.SurfaceHolder.Callback
        public void surfaceCreated(SurfaceHolder surfaceHolder) {
            if (h.this.f21168V1) {
                h.this.z2(surfaceHolder.getSurface());
            }
        }

        @Override // android.view.SurfaceHolder.Callback
        public void surfaceDestroyed(SurfaceHolder surfaceHolder) {
            if (h.this.f21168V1) {
                h.this.z2(null);
            }
            h.this.k2(0, 0);
        }

        @Override // F1.O
        public void t(int i10, long j10) {
            h.this.f21205q.t(i10, j10);
        }

        @Override // androidx.media3.exoplayer.r.b
        public void u(int i10) {
            final C2361o Q12 = h.Q1(h.this.f21144A);
            if (Q12.equals(h.this.f21177Z4)) {
                return;
            }
            h.this.f21177Z4 = Q12;
            h.this.f21197k.k(29, new C4155w.a() { // from class: m1.G0
                @Override // e1.C4155w.a
                public final void invoke(Object obj) {
                    ((InterfaceC2341J.d) obj).P(C2361o.this);
                }
            });
        }

        @Override // F1.O
        public void v(Object obj, long j10) {
            h.this.f21205q.v(obj, j10);
            if (h.this.f21203p1 == obj) {
                h.this.f21197k.k(26, new C4155w.a() { // from class: m1.I0
                    @Override // e1.C4155w.a
                    public final void invoke(Object obj2) {
                        ((InterfaceC2341J.d) obj2).Q();
                    }
                });
            }
        }

        @Override // w1.InterfaceC6697b
        public void w(final C2334C c2334c) {
            h hVar = h.this;
            hVar.f21182b5 = hVar.f21182b5.a().M(c2334c).J();
            C2333B M12 = h.this.M1();
            if (!M12.equals(h.this.f21174Y)) {
                h.this.f21174Y = M12;
                h.this.f21197k.h(14, new C4155w.a() { // from class: m1.C0
                    @Override // e1.C4155w.a
                    public final void invoke(Object obj) {
                        ((InterfaceC2341J.d) obj).M(androidx.media3.exoplayer.h.this.f21174Y);
                    }
                });
            }
            h.this.f21197k.h(28, new C4155w.a() { // from class: m1.D0
                @Override // e1.C4155w.a
                public final void invoke(Object obj) {
                    ((InterfaceC2341J.d) obj).w(C2334C.this);
                }
            });
            h.this.f21197k.f();
        }

        @Override // o1.InterfaceC5772y
        public void x(Exception exc) {
            h.this.f21205q.x(exc);
        }

        @Override // C1.h
        public void y(final C3987c c3987c) {
            h.this.f21165T4 = c3987c;
            h.this.f21197k.k(27, new C4155w.a() { // from class: m1.B0
                @Override // e1.C4155w.a
                public final void invoke(Object obj) {
                    ((InterfaceC2341J.d) obj).y(C3987c.this);
                }
            });
        }

        @Override // F1.O
        public void z(C5507g c5507g) {
            h.this.f21217y2 = c5507g;
            h.this.f21205q.z(c5507g);
        }
    }

    public static final class d implements y, G1.a, o.b {

        /* renamed from: a, reason: collision with root package name */
        public y f21220a;

        /* renamed from: b, reason: collision with root package name */
        public G1.a f21221b;

        /* renamed from: c, reason: collision with root package name */
        public y f21222c;

        /* renamed from: d, reason: collision with root package name */
        public G1.a f21223d;

        public d() {
        }

        @Override // G1.a
        public void a(long j10, float[] fArr) {
            G1.a aVar = this.f21223d;
            if (aVar != null) {
                aVar.a(j10, fArr);
            }
            G1.a aVar2 = this.f21221b;
            if (aVar2 != null) {
                aVar2.a(j10, fArr);
            }
        }

        @Override // G1.a
        public void d() {
            G1.a aVar = this.f21223d;
            if (aVar != null) {
                aVar.d();
            }
            G1.a aVar2 = this.f21221b;
            if (aVar2 != null) {
                aVar2.d();
            }
        }

        @Override // F1.y
        public void e(long j10, long j11, androidx.media3.common.a aVar, MediaFormat mediaFormat) {
            long j12;
            long j13;
            androidx.media3.common.a aVar2;
            MediaFormat mediaFormat2;
            y yVar = this.f21222c;
            if (yVar != null) {
                yVar.e(j10, j11, aVar, mediaFormat);
                mediaFormat2 = mediaFormat;
                aVar2 = aVar;
                j13 = j11;
                j12 = j10;
            } else {
                j12 = j10;
                j13 = j11;
                aVar2 = aVar;
                mediaFormat2 = mediaFormat;
            }
            y yVar2 = this.f21220a;
            if (yVar2 != null) {
                yVar2.e(j12, j13, aVar2, mediaFormat2);
            }
        }

        @Override // androidx.media3.exoplayer.o.b
        public void t(int i10, Object obj) {
            if (i10 == 7) {
                this.f21220a = (y) obj;
                return;
            }
            if (i10 == 8) {
                this.f21221b = (G1.a) obj;
                return;
            }
            if (i10 != 10000) {
                return;
            }
            G1.l lVar = (G1.l) obj;
            if (lVar == null) {
                this.f21222c = null;
                this.f21223d = null;
            } else {
                this.f21222c = lVar.getVideoFrameMetadataListener();
                this.f21223d = lVar.getCameraMotionListener();
            }
        }
    }

    public static final class e implements T0 {

        /* renamed from: a, reason: collision with root package name */
        public final Object f21224a;

        /* renamed from: b, reason: collision with root package name */
        public final D f21225b;

        /* renamed from: c, reason: collision with root package name */
        public AbstractC2346O f21226c;

        public e(Object obj, A a10) {
            this.f21224a = obj;
            this.f21225b = a10;
            this.f21226c = a10.Z();
        }

        @Override // m1.T0
        public Object a() {
            return this.f21224a;
        }

        @Override // m1.T0
        public AbstractC2346O b() {
            return this.f21226c;
        }

        public void c(AbstractC2346O abstractC2346O) {
            this.f21226c = abstractC2346O;
        }
    }

    static {
        AbstractC2332A.a("media3.exoplayer");
    }

    public h(ExoPlayer.b bVar, InterfaceC2341J interfaceC2341J) {
        Looper looper;
        InterfaceC4143j interfaceC4143j;
        try {
            AbstractC4156x.g("ExoPlayerImpl", "Init " + Integer.toHexString(System.identityHashCode(this)) + " [AndroidXMedia3/1.8.0] [" + Z.f45507e + "]");
            this.f21187e = bVar.f20864a.getApplicationContext();
            this.f21205q = (InterfaceC5605a) bVar.f20872i.apply(bVar.f20865b);
            this.f21171W4 = bVar.f20874k;
            this.f21159Q4 = bVar.f20875l;
            this.f21193g2 = bVar.f20881r;
            this.f21204p2 = bVar.f20882s;
            this.f21162S4 = bVar.f20879p;
            this.f21147D = bVar.f20855B;
            c cVar = new c();
            this.f21212x = cVar;
            this.f21215y = new d();
            Handler handler = new Handler(bVar.f20873j);
            m1 m1Var = (m1) bVar.f20867d.get();
            p[] b10 = m1Var.b(handler, cVar, cVar, cVar, cVar);
            this.renderers = b10;
            AbstractC4134a.g(b10.length > 0);
            this.secondaryRenderers = new p[b10.length];
            int i10 = 0;
            while (true) {
                p[] pVarArr = this.secondaryRenderers;
                if (i10 >= pVarArr.length) {
                    break;
                }
                p pVar = this.renderers[i10];
                c cVar2 = this.f21212x;
                m1 m1Var2 = m1Var;
                pVarArr[i10] = m1Var2.a(pVar, handler, cVar2, cVar2, cVar2, cVar2);
                i10++;
                m1Var = m1Var2;
            }
            F f10 = (F) bVar.f20869f.get();
            this.f21191g = f10;
            this.f21202p = (D.a) bVar.f20868e.get();
            D1.d dVar = (D1.d) bVar.f20871h.get();
            this.f21207s = dVar;
            this.f21201o = bVar.f20883t;
            this.f21160R = bVar.f20884u;
            this.f21208t = bVar.f20886w;
            this.f21209u = bVar.f20887x;
            this.f21210v = bVar.f20888y;
            this.f21157P = bVar.f20885v;
            this.f21170W = bVar.f20856C;
            Looper looper2 = bVar.f20873j;
            this.f21206r = looper2;
            InterfaceC4143j interfaceC4143j2 = bVar.f20865b;
            this.f21211w = interfaceC4143j2;
            InterfaceC2341J interfaceC2341J2 = interfaceC2341J == null ? this : interfaceC2341J;
            this.f21189f = interfaceC2341J2;
            this.f21197k = new C4155w(looper2, interfaceC4143j2, new C4155w.b() { // from class: m1.d0
                @Override // e1.C4155w.b
                public final void a(Object obj, C2364s c2364s) {
                    ((InterfaceC2341J.d) obj).r0(androidx.media3.exoplayer.h.this.f21189f, new InterfaceC2341J.c(c2364s));
                }
            });
            this.f21198l = new CopyOnWriteArraySet();
            this.f21200n = new ArrayList();
            this.f21163T = new e0.a(0);
            this.f21167V = ExoPlayer.c.f20890b;
            p[] pVarArr2 = this.renderers;
            G g10 = new G(new k1[pVarArr2.length], new androidx.media3.exoplayer.trackselection.y[pVarArr2.length], T.f24511b, null);
            this.f21179b = g10;
            this.f21199m = new AbstractC2346O.b();
            InterfaceC2341J.b e10 = new InterfaceC2341J.b.a().c(1, 2, 3, 13, 14, 15, 16, 17, 18, 19, 31, 20, 30, 21, 35, 22, 24, 27, 28, 32).d(29, f10.h()).d(23, bVar.f20880q).d(25, bVar.f20880q).d(33, bVar.f20880q).d(26, bVar.f20880q).d(34, bVar.f20880q).e();
            this.f21183c = e10;
            this.f21172X = new InterfaceC2341J.b.a().b(e10).a(4).a(10).e();
            this.f21194h = interfaceC4143j2.d(looper2, null);
            i.f fVar = new i.f() { // from class: m1.e0
                @Override // androidx.media3.exoplayer.i.f
                public final void a(i.e eVar) {
                    r0.f21194h.j(new Runnable() { // from class: m1.k0
                        @Override // java.lang.Runnable
                        public final void run() {
                            androidx.media3.exoplayer.h.this.f2(eVar);
                        }
                    });
                }
            };
            this.f21195i = fVar;
            this.f21184c5 = h1.k(g10);
            this.f21205q.i0(interfaceC2341J2, looper2);
            G1 g12 = new G1(bVar.f20861H);
            i iVar = new i(this.f21187e, this.renderers, this.secondaryRenderers, f10, g10, (j) bVar.f20870g.get(), dVar, this.f21150G, this.f21151H, this.f21205q, this.f21160R, bVar.f20889z, bVar.f20854A, this.f21170W, bVar.f20862I, looper2, interfaceC4143j2, fVar, g12, bVar.f20858E, this.f21167V, this.f21215y);
            this.f21196j = iVar;
            Looper P10 = iVar.P();
            this.f21161R4 = 1.0f;
            this.f21150G = 0;
            C2333B c2333b = C2333B.f24192H;
            this.f21174Y = c2333b;
            this.f21176Z = c2333b;
            this.f21182b5 = c2333b;
            this.f21186d5 = -1;
            this.f21165T4 = C3987c.f44894d;
            this.f21166U4 = true;
            p(this.f21205q);
            dVar.d(new Handler(looper2), this.f21205q);
            J1(this.f21212x);
            long j10 = bVar.f20866c;
            if (j10 > 0) {
                iVar.I(j10);
            }
            if (Build.VERSION.SDK_INT >= 31) {
                b.b(this.f21187e, this, bVar.f20857D, g12);
            }
            C4140g c4140g = new C4140g(0, P10, looper2, interfaceC4143j2, new C4140g.a() { // from class: m1.g0
                @Override // e1.C4140g.a
                public final void a(Object obj, Object obj2) {
                    androidx.media3.exoplayer.h.this.m2(((Integer) obj).intValue(), ((Integer) obj2).intValue());
                }
            });
            this.f21149F = c4140g;
            c4140g.e(new Runnable() { // from class: m1.h0
                @Override // java.lang.Runnable
                public final void run() {
                    r0.f21149F.g(Integer.valueOf(e1.Z.J(androidx.media3.exoplayer.h.this.f21187e)));
                }
            });
            androidx.media3.exoplayer.a aVar = new androidx.media3.exoplayer.a(bVar.f20864a, P10, bVar.f20873j, this.f21212x, interfaceC4143j2);
            InterfaceC4143j interfaceC4143j3 = interfaceC4143j2;
            this.f21218z = aVar;
            aVar.d(bVar.f20878o);
            if (bVar.f20860G) {
                s sVar = bVar.f20863J;
                this.f21148E = sVar;
                sVar.b(new s.a() { // from class: m1.i0
                    @Override // androidx.media3.exoplayer.s.a
                    public final void a(boolean z10) {
                        androidx.media3.exoplayer.h.this.n2(z10);
                    }
                }, this.f21187e, looper2, P10, interfaceC4143j3);
                interfaceC4143j3 = interfaceC4143j3;
            } else {
                this.f21148E = null;
            }
            if (bVar.f20880q) {
                InterfaceC4143j interfaceC4143j4 = interfaceC4143j3;
                r rVar = new r(bVar.f20864a, this.f21212x, this.f21159Q4.b(), P10, looper2, interfaceC4143j4);
                looper = P10;
                interfaceC4143j = interfaceC4143j4;
                this.f21144A = rVar;
            } else {
                looper = P10;
                interfaceC4143j = interfaceC4143j3;
                this.f21144A = null;
            }
            z1 z1Var = new z1(bVar.f20864a, looper, interfaceC4143j);
            this.f21145B = z1Var;
            z1Var.c(bVar.f20877n != 0);
            C1 c12 = new C1(bVar.f20864a, looper, interfaceC4143j);
            this.f21146C = c12;
            c12.c(bVar.f20877n == 2);
            this.f21177Z4 = C2361o.f24616e;
            this.f21178a5 = Y.f24525e;
            this.f21214x2 = L.f45487c;
            iVar.A1(this.f21157P);
            iVar.j1(this.f21159Q4, bVar.f20876m);
            s2(1, 3, this.f21159Q4);
            s2(2, 4, Integer.valueOf(this.f21193g2));
            s2(2, 5, Integer.valueOf(this.f21204p2));
            s2(1, 9, Boolean.valueOf(this.f21162S4));
            s2(6, 8, this.f21215y);
            t2(16, Integer.valueOf(this.f21171W4));
            this.f21185d.f();
        } catch (Throwable th2) {
            this.f21185d.f();
            throw th2;
        }
    }

    public static /* synthetic */ void G0(h1 h1Var, InterfaceC2341J.d dVar) {
        dVar.D(h1Var.f56224g);
        dVar.c0(h1Var.f56224g);
    }

    public static S K1(S s10, E e10) {
        S.c a10 = s10.a();
        m0 it = e10.iterator();
        while (it.hasNext()) {
            a10.U(((Integer) it.next()).intValue(), true);
        }
        return a10.G();
    }

    public static C2361o Q1(r rVar) {
        return new C2361o.b(0).g(rVar != null ? rVar.l() : 0).f(rVar != null ? rVar.k() : 0).e();
    }

    public static /* synthetic */ void b1(int i10, InterfaceC2341J.e eVar, InterfaceC2341J.e eVar2, InterfaceC2341J.d dVar) {
        dVar.b0(i10);
        dVar.X(eVar, eVar2, i10);
    }

    public static long e2(h1 h1Var) {
        AbstractC2346O.c cVar = new AbstractC2346O.c();
        AbstractC2346O.b bVar = new AbstractC2346O.b();
        h1Var.f56218a.h(h1Var.f56219b.f21516a, bVar);
        return h1Var.f56220c == -9223372036854775807L ? h1Var.f56218a.n(bVar.f24356c, cVar).c() : bVar.o() + h1Var.f56220c;
    }

    public static h1 h2(h1 h1Var, int i10) {
        h1 h10 = h1Var.h(i10);
        return (i10 == 1 || i10 == 4) ? h10.b(false) : h10;
    }

    @Override // androidx.media3.exoplayer.ExoPlayer
    public void A(InterfaceC5608b interfaceC5608b) {
        H2();
        this.f21205q.s0((InterfaceC5608b) AbstractC4134a.e(interfaceC5608b));
    }

    public void A2(SurfaceHolder surfaceHolder) {
        H2();
        if (surfaceHolder == null) {
            N1();
            return;
        }
        r2();
        this.f21168V1 = true;
        this.f21216y1 = surfaceHolder;
        surfaceHolder.addCallback(this.f21212x);
        Surface surface = surfaceHolder.getSurface();
        if (surface == null || !surface.isValid()) {
            z2(null);
            k2(0, 0);
        } else {
            z2(surface);
            Rect surfaceFrame = surfaceHolder.getSurfaceFrame();
            k2(surfaceFrame.width(), surfaceFrame.height());
        }
    }

    public final void B2(I i10) {
        h1 h1Var = this.f21184c5;
        h1 c10 = h1Var.c(h1Var.f56219b);
        c10.f56234q = c10.f56236s;
        c10.f56235r = 0L;
        h1 h22 = h2(c10, 1);
        if (i10 != null) {
            h22 = h22.f(i10);
        }
        this.f21152I++;
        this.f21196j.S1();
        E2(h22, 0, false, 5, -9223372036854775807L, -1, false);
    }

    @Override // b1.InterfaceC2341J
    public C3987c C() {
        H2();
        return this.f21165T4;
    }

    public final void C2() {
        InterfaceC2341J.b bVar = this.f21172X;
        InterfaceC2341J.b Q10 = Z.Q(this.f21189f, this.f21183c);
        this.f21172X = Q10;
        if (Q10.equals(bVar)) {
            return;
        }
        this.f21197k.h(13, new C4155w.a() { // from class: m1.m0
            @Override // e1.C4155w.a
            public final void invoke(Object obj) {
                ((InterfaceC2341J.d) obj).S(androidx.media3.exoplayer.h.this.f21172X);
            }
        });
    }

    @Override // b1.InterfaceC2341J
    public int D() {
        H2();
        if (j()) {
            return this.f21184c5.f56219b.f21517b;
        }
        return -1;
    }

    public final void D2(boolean z10, int i10) {
        int P12 = P1(z10);
        h1 h1Var = this.f21184c5;
        if (h1Var.f56229l == z10 && h1Var.f56231n == P12 && h1Var.f56230m == i10) {
            return;
        }
        this.f21152I++;
        if (h1Var.f56233p) {
            h1Var = h1Var.a();
        }
        h1 e10 = h1Var.e(z10, i10, P12);
        this.f21196j.r1(z10, i10, P12);
        E2(e10, 0, false, 5, -9223372036854775807L, -1, false);
    }

    public final void E2(final h1 h1Var, final int i10, boolean z10, final int i11, long j10, int i12, boolean z11) {
        h1 h1Var2 = this.f21184c5;
        this.f21184c5 = h1Var;
        boolean equals = h1Var2.f56218a.equals(h1Var.f56218a);
        Pair U12 = U1(h1Var, h1Var2, z10, i11, !equals, z11);
        boolean booleanValue = ((Boolean) U12.first).booleanValue();
        final int intValue = ((Integer) U12.second).intValue();
        if (booleanValue) {
            r6 = h1Var.f56218a.q() ? null : h1Var.f56218a.n(h1Var.f56218a.h(h1Var.f56219b.f21516a, this.f21199m).f24356c, this.f24590a).f24379c;
            this.f21182b5 = C2333B.f24192H;
        }
        if (booleanValue || !h1Var2.f56227j.equals(h1Var.f56227j)) {
            this.f21182b5 = this.f21182b5.a().N(h1Var.f56227j).J();
        }
        C2333B M12 = M1();
        boolean equals2 = M12.equals(this.f21174Y);
        this.f21174Y = M12;
        boolean z12 = h1Var2.f56229l != h1Var.f56229l;
        boolean z13 = h1Var2.f56222e != h1Var.f56222e;
        if (z13 || z12) {
            G2();
        }
        boolean z14 = h1Var2.f56224g;
        boolean z15 = h1Var.f56224g;
        boolean z16 = z14 != z15;
        if (z16) {
            F2(z15);
        }
        if (!equals) {
            this.f21197k.h(0, new C4155w.a() { // from class: m1.U
                @Override // e1.C4155w.a
                public final void invoke(Object obj) {
                    InterfaceC2341J.d dVar = (InterfaceC2341J.d) obj;
                    dVar.d0(h1.this.f56218a, i10);
                }
            });
        }
        if (z10) {
            final InterfaceC2341J.e d22 = d2(i11, h1Var2, i12);
            final InterfaceC2341J.e c22 = c2(j10);
            this.f21197k.h(11, new C4155w.a() { // from class: m1.s0
                @Override // e1.C4155w.a
                public final void invoke(Object obj) {
                    androidx.media3.exoplayer.h.b1(i11, d22, c22, (InterfaceC2341J.d) obj);
                }
            });
        }
        if (booleanValue) {
            this.f21197k.h(1, new C4155w.a() { // from class: m1.t0
                @Override // e1.C4155w.a
                public final void invoke(Object obj) {
                    ((InterfaceC2341J.d) obj).e0(b1.z.this, intValue);
                }
            });
        }
        if (h1Var2.f56223f != h1Var.f56223f) {
            this.f21197k.h(10, new C4155w.a() { // from class: m1.u0
                @Override // e1.C4155w.a
                public final void invoke(Object obj) {
                    ((InterfaceC2341J.d) obj).N(h1.this.f56223f);
                }
            });
            if (h1Var.f56223f != null) {
                this.f21197k.h(10, new C4155w.a() { // from class: m1.v0
                    @Override // e1.C4155w.a
                    public final void invoke(Object obj) {
                        ((InterfaceC2341J.d) obj).J(h1.this.f56223f);
                    }
                });
            }
        }
        G g10 = h1Var2.f56226i;
        G g11 = h1Var.f56226i;
        if (g10 != g11) {
            this.f21191g.i(g11.f21915c);
            this.f21197k.h(2, new C4155w.a() { // from class: m1.w0
                @Override // e1.C4155w.a
                public final void invoke(Object obj) {
                    ((InterfaceC2341J.d) obj).g0(h1.this.f56226i.f21914b);
                }
            });
        }
        if (!equals2) {
            final C2333B c2333b = this.f21174Y;
            this.f21197k.h(14, new C4155w.a() { // from class: m1.V
                @Override // e1.C4155w.a
                public final void invoke(Object obj) {
                    ((InterfaceC2341J.d) obj).M(C2333B.this);
                }
            });
        }
        if (z16) {
            this.f21197k.h(3, new C4155w.a() { // from class: m1.W
                @Override // e1.C4155w.a
                public final void invoke(Object obj) {
                    androidx.media3.exoplayer.h.G0(h1.this, (InterfaceC2341J.d) obj);
                }
            });
        }
        if (z13 || z12) {
            this.f21197k.h(-1, new C4155w.a() { // from class: m1.X
                @Override // e1.C4155w.a
                public final void invoke(Object obj) {
                    ((InterfaceC2341J.d) obj).m0(r0.f56229l, h1.this.f56222e);
                }
            });
        }
        if (z13) {
            this.f21197k.h(4, new C4155w.a() { // from class: m1.Y
                @Override // e1.C4155w.a
                public final void invoke(Object obj) {
                    ((InterfaceC2341J.d) obj).F(h1.this.f56222e);
                }
            });
        }
        if (z12 || h1Var2.f56230m != h1Var.f56230m) {
            this.f21197k.h(5, new C4155w.a() { // from class: m1.f0
                @Override // e1.C4155w.a
                public final void invoke(Object obj) {
                    ((InterfaceC2341J.d) obj).o0(r0.f56229l, h1.this.f56230m);
                }
            });
        }
        if (h1Var2.f56231n != h1Var.f56231n) {
            this.f21197k.h(6, new C4155w.a() { // from class: m1.p0
                @Override // e1.C4155w.a
                public final void invoke(Object obj) {
                    ((InterfaceC2341J.d) obj).C(h1.this.f56231n);
                }
            });
        }
        if (h1Var2.n() != h1Var.n()) {
            this.f21197k.h(7, new C4155w.a() { // from class: m1.q0
                @Override // e1.C4155w.a
                public final void invoke(Object obj) {
                    ((InterfaceC2341J.d) obj).t0(h1.this.n());
                }
            });
        }
        if (!h1Var2.f56232o.equals(h1Var.f56232o)) {
            this.f21197k.h(12, new C4155w.a() { // from class: m1.r0
                @Override // e1.C4155w.a
                public final void invoke(Object obj) {
                    ((InterfaceC2341J.d) obj).u(h1.this.f56232o);
                }
            });
        }
        C2();
        this.f21197k.f();
        if (h1Var2.f56233p != h1Var.f56233p) {
            Iterator it = this.f21198l.iterator();
            while (it.hasNext()) {
                ((ExoPlayer.a) it.next()).G(h1Var.f56233p);
            }
        }
    }

    @Override // b1.InterfaceC2341J
    public void F(final C2350d c2350d, boolean z10) {
        H2();
        if (this.f21175Y4) {
            return;
        }
        if (!Objects.equals(this.f21159Q4, c2350d)) {
            this.f21159Q4 = c2350d;
            s2(1, 3, c2350d);
            r rVar = this.f21144A;
            if (rVar != null) {
                rVar.o(c2350d.b());
            }
            this.f21197k.h(20, new C4155w.a() { // from class: m1.j0
                @Override // e1.C4155w.a
                public final void invoke(Object obj) {
                    ((InterfaceC2341J.d) obj).V(C2350d.this);
                }
            });
        }
        this.f21196j.j1(this.f21159Q4, z10);
        this.f21197k.f();
    }

    public final void F2(boolean z10) {
    }

    public final void G2() {
        int g02 = g0();
        boolean z10 = false;
        if (g02 != 1) {
            if (g02 == 2 || g02 == 3) {
                boolean g22 = g2();
                z1 z1Var = this.f21145B;
                if (S() && !g22) {
                    z10 = true;
                }
                z1Var.d(z10);
                this.f21146C.d(S());
                return;
            }
            if (g02 != 4) {
                throw new IllegalStateException();
            }
        }
        this.f21145B.d(false);
        this.f21146C.d(false);
    }

    @Override // b1.InterfaceC2341J
    public int H() {
        H2();
        return this.f21184c5.f56231n;
    }

    public final void H2() {
        this.f21185d.b();
        if (Thread.currentThread() != J().getThread()) {
            String G10 = Z.G("Player is accessed on the wrong thread.\nCurrent thread: '%s'\nExpected thread: '%s'\nSee https://developer.android.com/guide/topics/media/issues/player-accessed-on-wrong-thread", Thread.currentThread().getName(), J().getThread().getName());
            if (this.f21166U4) {
                throw new IllegalStateException(G10);
            }
            AbstractC4156x.j("ExoPlayerImpl", G10, this.f21169V4 ? null : new IllegalStateException());
            this.f21169V4 = true;
        }
    }

    @Override // b1.InterfaceC2341J
    public AbstractC2346O I() {
        H2();
        return this.f21184c5.f56218a;
    }

    @Override // b1.InterfaceC2341J
    public Looper J() {
        return this.f21206r;
    }

    public void J1(ExoPlayer.a aVar) {
        this.f21198l.add(aVar);
    }

    @Override // b1.InterfaceC2341J
    public S K() {
        H2();
        S c10 = this.f21191g.c();
        return this.f21155L ? c10.a().L(this.f21156O).G() : c10;
    }

    public final List L1(int i10, List list) {
        ArrayList arrayList = new ArrayList();
        for (int i11 = 0; i11 < list.size(); i11++) {
            n.c cVar = new n.c((D) list.get(i11), this.f21201o);
            arrayList.add(cVar);
            this.f21200n.add(i11 + i10, new e(cVar.f21408b, cVar.f21407a));
        }
        this.f21163T = this.f21163T.g(i10, arrayList.size());
        return arrayList;
    }

    @Override // b1.InterfaceC2341J
    public void M(TextureView textureView) {
        H2();
        if (textureView == null) {
            N1();
            return;
        }
        r2();
        this.f21181b2 = textureView;
        if (textureView.getSurfaceTextureListener() != null) {
            AbstractC4156x.i("ExoPlayerImpl", "Replacing existing SurfaceTextureListener.");
        }
        textureView.setSurfaceTextureListener(this.f21212x);
        SurfaceTexture surfaceTexture = textureView.isAvailable() ? textureView.getSurfaceTexture() : null;
        if (surfaceTexture == null) {
            z2(null);
            k2(0, 0);
        } else {
            y2(surfaceTexture);
            k2(textureView.getWidth(), textureView.getHeight());
        }
    }

    public final C2333B M1() {
        AbstractC2346O I10 = I();
        if (I10.q()) {
            return this.f21182b5;
        }
        return this.f21182b5.a().L(I10.n(h0(), this.f24590a).f24379c.f24658e).J();
    }

    @Override // androidx.media3.exoplayer.ExoPlayer
    public androidx.media3.exoplayer.trackselection.D N() {
        H2();
        return new androidx.media3.exoplayer.trackselection.D(this.f21184c5.f56226i.selections);
    }

    public void N1() {
        H2();
        r2();
        z2(null);
        k2(0, 0);
    }

    @Override // androidx.media3.exoplayer.ExoPlayer
    public int O(int i10) {
        H2();
        return this.renderers[i10].f();
    }

    public void O1(SurfaceHolder surfaceHolder) {
        H2();
        if (surfaceHolder == null || surfaceHolder != this.f21216y1) {
            return;
        }
        N1();
    }

    public final int P1(boolean z10) {
        if (this.f21155L) {
            return 4;
        }
        s sVar = this.f21148E;
        if (sVar == null || sVar.a()) {
            return (this.f21184c5.f56231n != 1 || z10) ? 0 : 1;
        }
        return 3;
    }

    @Override // b1.InterfaceC2341J
    public InterfaceC2341J.b R() {
        H2();
        return this.f21172X;
    }

    public final AbstractC2346O R1() {
        return new j1(this.f21200n, this.f21163T);
    }

    @Override // b1.InterfaceC2341J
    public boolean S() {
        H2();
        return this.f21184c5.f56229l;
    }

    public final List S1(List list) {
        ArrayList arrayList = new ArrayList();
        for (int i10 = 0; i10 < list.size(); i10++) {
            arrayList.add(this.f21202p.e((z) list.get(i10)));
        }
        return arrayList;
    }

    @Override // b1.InterfaceC2341J
    public void T(final boolean z10) {
        H2();
        if (this.f21151H != z10) {
            this.f21151H = z10;
            this.f21196j.D1(z10);
            this.f21197k.h(9, new C4155w.a() { // from class: m1.l0
                @Override // e1.C4155w.a
                public final void invoke(Object obj) {
                    ((InterfaceC2341J.d) obj).I(z10);
                }
            });
            C2();
            this.f21197k.f();
        }
    }

    public final o T1(o.b bVar) {
        int Y12 = Y1(this.f21184c5);
        i iVar = this.f21196j;
        AbstractC2346O abstractC2346O = this.f21184c5.f56218a;
        if (Y12 == -1) {
            Y12 = 0;
        }
        return new o(iVar, bVar, abstractC2346O, Y12, this.f21211w, iVar.P());
    }

    @Override // androidx.media3.exoplayer.ExoPlayer
    public int U() {
        H2();
        return this.renderers.length;
    }

    public final Pair U1(h1 h1Var, h1 h1Var2, boolean z10, int i10, boolean z11, boolean z12) {
        AbstractC2346O abstractC2346O = h1Var2.f56218a;
        AbstractC2346O abstractC2346O2 = h1Var.f56218a;
        if (abstractC2346O2.q() && abstractC2346O.q()) {
            return new Pair(Boolean.FALSE, -1);
        }
        int i11 = 3;
        if (abstractC2346O2.q() != abstractC2346O.q()) {
            return new Pair(Boolean.TRUE, 3);
        }
        if (abstractC2346O.n(abstractC2346O.h(h1Var2.f56219b.f21516a, this.f21199m).f24356c, this.f24590a).f24377a.equals(abstractC2346O2.n(abstractC2346O2.h(h1Var.f56219b.f21516a, this.f21199m).f24356c, this.f24590a).f24377a)) {
            return (z10 && i10 == 0 && h1Var2.f56219b.f21519d < h1Var.f56219b.f21519d) ? new Pair(Boolean.TRUE, 0) : (z10 && i10 == 1 && z12) ? new Pair(Boolean.TRUE, 2) : new Pair(Boolean.FALSE, -1);
        }
        if (z10 && i10 == 0) {
            i11 = 1;
        } else if (z10 && i10 == 1) {
            i11 = 2;
        } else if (!z11) {
            throw new IllegalStateException();
        }
        return new Pair(Boolean.TRUE, Integer.valueOf(i11));
    }

    @Override // b1.InterfaceC2341J
    public long V() {
        H2();
        return this.f21210v;
    }

    public InterfaceC4143j V1() {
        return this.f21211w;
    }

    public final long W1(h1 h1Var) {
        if (!h1Var.f56219b.b()) {
            return Z.J1(X1(h1Var));
        }
        h1Var.f56218a.h(h1Var.f56219b.f21516a, this.f21199m);
        return h1Var.f56220c == -9223372036854775807L ? h1Var.f56218a.n(Y1(h1Var), this.f24590a).b() : this.f21199m.n() + Z.J1(h1Var.f56220c);
    }

    @Override // b1.InterfaceC2341J
    public int X() {
        H2();
        if (this.f21184c5.f56218a.q()) {
            return this.f21188e5;
        }
        h1 h1Var = this.f21184c5;
        return h1Var.f56218a.b(h1Var.f56219b.f21516a);
    }

    public final long X1(h1 h1Var) {
        if (h1Var.f56218a.q()) {
            return Z.a1(this.f21190f5);
        }
        long m10 = h1Var.f56233p ? h1Var.m() : h1Var.f56236s;
        return h1Var.f56219b.b() ? m10 : o2(h1Var.f56218a, h1Var.f56219b, m10);
    }

    @Override // b1.InterfaceC2341J
    public void Y(TextureView textureView) {
        H2();
        if (textureView == null || textureView != this.f21181b2) {
            return;
        }
        N1();
    }

    public final int Y1(h1 h1Var) {
        return h1Var.f56218a.q() ? this.f21186d5 : h1Var.f56218a.h(h1Var.f56219b.f21516a, this.f21199m).f24356c;
    }

    @Override // b1.InterfaceC2341J
    public Y Z() {
        H2();
        return this.f21178a5;
    }

    public final Pair Z1(AbstractC2346O abstractC2346O, AbstractC2346O abstractC2346O2, int i10, long j10) {
        if (abstractC2346O.q() || abstractC2346O2.q()) {
            boolean z10 = !abstractC2346O.q() && abstractC2346O2.q();
            return j2(abstractC2346O2, z10 ? -1 : i10, z10 ? -9223372036854775807L : j10);
        }
        Pair j11 = abstractC2346O.j(this.f24590a, this.f21199m, i10, Z.a1(j10));
        Object obj = ((Pair) Z.i(j11)).first;
        if (abstractC2346O2.b(obj) != -1) {
            return j11;
        }
        int Y02 = i.Y0(this.f24590a, this.f21199m, this.f21150G, this.f21151H, obj, abstractC2346O, abstractC2346O2);
        return Y02 != -1 ? j2(abstractC2346O2, Y02, abstractC2346O2.n(Y02, this.f24590a).b()) : j2(abstractC2346O2, -1, -9223372036854775807L);
    }

    public Looper a2() {
        return this.f21196j.P();
    }

    @Override // androidx.media3.exoplayer.ExoPlayer
    public void b(InterfaceC5608b interfaceC5608b) {
        this.f21205q.q0((InterfaceC5608b) AbstractC4134a.e(interfaceC5608b));
    }

    @Override // b1.InterfaceC2341J
    public int b0() {
        H2();
        if (j()) {
            return this.f21184c5.f56219b.f21518c;
        }
        return -1;
    }

    @Override // b1.InterfaceC2341J
    /* renamed from: b2, reason: merged with bridge method [inline-methods] */
    public I w() {
        H2();
        return this.f21184c5.f56223f;
    }

    @Override // b1.InterfaceC2341J
    public long c0() {
        H2();
        return this.f21209u;
    }

    public final InterfaceC2341J.e c2(long j10) {
        Object obj;
        int i10;
        z zVar;
        Object obj2;
        int h02 = h0();
        if (this.f21184c5.f56218a.q()) {
            obj = null;
            i10 = -1;
            zVar = null;
            obj2 = null;
        } else {
            h1 h1Var = this.f21184c5;
            Object obj3 = h1Var.f56219b.f21516a;
            h1Var.f56218a.h(obj3, this.f21199m);
            i10 = this.f21184c5.f56218a.b(obj3);
            obj2 = obj3;
            obj = this.f21184c5.f56218a.n(h02, this.f24590a).f24377a;
            zVar = this.f24590a.f24379c;
        }
        int i11 = i10;
        long J12 = Z.J1(j10);
        long J13 = this.f21184c5.f56219b.b() ? Z.J1(e2(this.f21184c5)) : J12;
        D.b bVar = this.f21184c5.f56219b;
        return new InterfaceC2341J.e(obj, h02, zVar, obj2, i11, J12, J13, bVar.f21517b, bVar.f21518c);
    }

    @Override // b1.InterfaceC2341J
    public C2340I d() {
        H2();
        return this.f21184c5.f56232o;
    }

    @Override // b1.InterfaceC2341J
    public long d0() {
        H2();
        return W1(this.f21184c5);
    }

    public final InterfaceC2341J.e d2(int i10, h1 h1Var, int i11) {
        int i12;
        Object obj;
        z zVar;
        Object obj2;
        int i13;
        long j10;
        long e22;
        AbstractC2346O.b bVar = new AbstractC2346O.b();
        if (h1Var.f56218a.q()) {
            i12 = i11;
            obj = null;
            zVar = null;
            obj2 = null;
            i13 = -1;
        } else {
            Object obj3 = h1Var.f56219b.f21516a;
            h1Var.f56218a.h(obj3, bVar);
            int i14 = bVar.f24356c;
            int b10 = h1Var.f56218a.b(obj3);
            Object obj4 = h1Var.f56218a.n(i14, this.f24590a).f24377a;
            zVar = this.f24590a.f24379c;
            obj2 = obj3;
            i13 = b10;
            obj = obj4;
            i12 = i14;
        }
        if (i10 == 0) {
            if (h1Var.f56219b.b()) {
                D.b bVar2 = h1Var.f56219b;
                j10 = bVar.b(bVar2.f21517b, bVar2.f21518c);
                e22 = e2(h1Var);
            } else {
                j10 = h1Var.f56219b.f21520e != -1 ? e2(this.f21184c5) : bVar.f24358e + bVar.f24357d;
                e22 = j10;
            }
        } else if (h1Var.f56219b.b()) {
            j10 = h1Var.f56236s;
            e22 = e2(h1Var);
        } else {
            j10 = bVar.f24358e + h1Var.f56236s;
            e22 = j10;
        }
        long J12 = Z.J1(j10);
        long J13 = Z.J1(e22);
        D.b bVar3 = h1Var.f56219b;
        return new InterfaceC2341J.e(obj, i12, zVar, obj2, i13, J12, J13, bVar3.f21517b, bVar3.f21518c);
    }

    @Override // b1.InterfaceC2341J
    public void e(C2340I c2340i) {
        H2();
        if (c2340i == null) {
            c2340i = C2340I.f24312d;
        }
        if (this.f21184c5.f56232o.equals(c2340i)) {
            return;
        }
        h1 g10 = this.f21184c5.g(c2340i);
        this.f21152I++;
        this.f21196j.t1(c2340i);
        E2(g10, 0, false, 5, -9223372036854775807L, -1, false);
    }

    @Override // b1.InterfaceC2341J
    public long e0() {
        H2();
        if (!j()) {
            return n0();
        }
        h1 h1Var = this.f21184c5;
        return h1Var.f56228k.equals(h1Var.f56219b) ? Z.J1(this.f21184c5.f56234q) : getDuration();
    }

    public final void f2(i.e eVar) {
        boolean z10;
        long j10;
        int i10 = this.f21152I - eVar.f21329c;
        this.f21152I = i10;
        boolean z11 = true;
        if (eVar.f21330d) {
            this.f21153J = eVar.f21331e;
            this.f21154K = true;
        }
        if (i10 == 0) {
            AbstractC2346O abstractC2346O = eVar.f21328b.f56218a;
            if (!this.f21184c5.f56218a.q() && abstractC2346O.q()) {
                this.f21186d5 = -1;
                this.f21190f5 = 0L;
                this.f21188e5 = 0;
            }
            if (!abstractC2346O.q()) {
                List F10 = ((j1) abstractC2346O).F();
                AbstractC4134a.g(F10.size() == this.f21200n.size());
                for (int i11 = 0; i11 < F10.size(); i11++) {
                    ((e) this.f21200n.get(i11)).c((AbstractC2346O) F10.get(i11));
                }
            }
            long j11 = -9223372036854775807L;
            if (this.f21154K) {
                if (eVar.f21328b.f56219b.equals(this.f21184c5.f56219b) && eVar.f21328b.f56221d == this.f21184c5.f56236s) {
                    z11 = false;
                }
                if (z11) {
                    if (abstractC2346O.q() || eVar.f21328b.f56219b.b()) {
                        j10 = eVar.f21328b.f56221d;
                    } else {
                        h1 h1Var = eVar.f21328b;
                        j10 = o2(abstractC2346O, h1Var.f56219b, h1Var.f56221d);
                    }
                    j11 = j10;
                }
                z10 = z11;
            } else {
                z10 = false;
            }
            this.f21154K = false;
            E2(eVar.f21328b, 1, z10, this.f21153J, j11, -1, false);
        }
    }

    @Override // b1.InterfaceC2341J
    public void g() {
        H2();
        h1 h1Var = this.f21184c5;
        if (h1Var.f56222e != 1) {
            return;
        }
        h1 f10 = h1Var.f(null);
        h1 h22 = h2(f10, f10.f56218a.q() ? 4 : 2);
        this.f21152I++;
        this.f21196j.H0();
        E2(h22, 1, false, 5, -9223372036854775807L, -1, false);
    }

    @Override // b1.InterfaceC2341J
    public int g0() {
        H2();
        return this.f21184c5.f56222e;
    }

    public boolean g2() {
        H2();
        return this.f21184c5.f56233p;
    }

    @Override // b1.InterfaceC2341J
    public long getCurrentPosition() {
        H2();
        return Z.J1(X1(this.f21184c5));
    }

    @Override // b1.InterfaceC2341J
    public long getDuration() {
        H2();
        if (!j()) {
            return W();
        }
        h1 h1Var = this.f21184c5;
        D.b bVar = h1Var.f56219b;
        h1Var.f56218a.h(bVar.f21516a, this.f21199m);
        return Z.J1(this.f21199m.b(bVar.f21517b, bVar.f21518c));
    }

    @Override // b1.InterfaceC2341J
    public void h(float f10) {
        H2();
        final float n10 = Z.n(f10, 0.0f, 1.0f);
        if (this.f21161R4 == n10) {
            return;
        }
        this.f21161R4 = n10;
        this.f21196j.K1(n10);
        this.f21197k.k(22, new C4155w.a() { // from class: m1.Z
            @Override // e1.C4155w.a
            public final void invoke(Object obj) {
                ((InterfaceC2341J.d) obj).f0(n10);
            }
        });
    }

    @Override // b1.InterfaceC2341J
    public int h0() {
        H2();
        int Y12 = Y1(this.f21184c5);
        if (Y12 == -1) {
            return 0;
        }
        return Y12;
    }

    @Override // b1.InterfaceC2341J
    public void i0(final int i10) {
        H2();
        if (this.f21150G != i10) {
            this.f21150G = i10;
            this.f21196j.w1(i10);
            this.f21197k.h(8, new C4155w.a() { // from class: m1.c0
                @Override // e1.C4155w.a
                public final void invoke(Object obj) {
                    ((InterfaceC2341J.d) obj).n0(i10);
                }
            });
            C2();
            this.f21197k.f();
        }
    }

    public final h1 i2(h1 h1Var, AbstractC2346O abstractC2346O, Pair pair) {
        AbstractC4134a.a(abstractC2346O.q() || pair != null);
        AbstractC2346O abstractC2346O2 = h1Var.f56218a;
        long W12 = W1(h1Var);
        h1 j10 = h1Var.j(abstractC2346O);
        if (abstractC2346O.q()) {
            D.b l10 = h1.l();
            long a12 = Z.a1(this.f21190f5);
            h1 c10 = j10.d(l10, a12, a12, a12, 0L, androidx.media3.exoplayer.source.m0.f21830d, this.f21179b, AbstractC3445z.t()).c(l10);
            c10.f56234q = c10.f56236s;
            return c10;
        }
        Object obj = j10.f56219b.f21516a;
        boolean equals = obj.equals(((Pair) Z.i(pair)).first);
        D.b bVar = !equals ? new D.b(pair.first) : j10.f56219b;
        long longValue = ((Long) pair.second).longValue();
        long a13 = Z.a1(W12);
        if (!abstractC2346O2.q()) {
            a13 -= abstractC2346O2.h(obj, this.f21199m).o();
        }
        if (!equals || longValue < a13) {
            D.b bVar2 = bVar;
            AbstractC4134a.g(!bVar2.b());
            h1 c11 = j10.d(bVar2, longValue, longValue, longValue, 0L, !equals ? androidx.media3.exoplayer.source.m0.f21830d : j10.f56225h, !equals ? this.f21179b : j10.f56226i, !equals ? AbstractC3445z.t() : j10.f56227j).c(bVar2);
            c11.f56234q = longValue;
            return c11;
        }
        if (longValue != a13) {
            D.b bVar3 = bVar;
            AbstractC4134a.g(!bVar3.b());
            long max = Math.max(0L, j10.f56235r - (longValue - a13));
            long j11 = j10.f56234q;
            if (j10.f56228k.equals(j10.f56219b)) {
                j11 = longValue + max;
            }
            h1 d10 = j10.d(bVar3, longValue, longValue, longValue, max, j10.f56225h, j10.f56226i, j10.f56227j);
            d10.f56234q = j11;
            return d10;
        }
        int b10 = abstractC2346O.b(j10.f56228k.f21516a);
        if (b10 != -1 && abstractC2346O.f(b10, this.f21199m).f24356c == abstractC2346O.h(bVar.f21516a, this.f21199m).f24356c) {
            return j10;
        }
        abstractC2346O.h(bVar.f21516a, this.f21199m);
        long b11 = bVar.b() ? this.f21199m.b(bVar.f21517b, bVar.f21518c) : this.f21199m.f24357d;
        D.b bVar4 = bVar;
        h1 c12 = j10.d(bVar4, j10.f56236s, j10.f56236s, j10.f56221d, b11 - j10.f56236s, j10.f56225h, j10.f56226i, j10.f56227j).c(bVar4);
        c12.f56234q = b11;
        return c12;
    }

    @Override // androidx.media3.exoplayer.ExoPlayer
    public boolean isScrubbingModeEnabled() {
        H2();
        return this.f21155L;
    }

    @Override // b1.InterfaceC2341J
    public boolean j() {
        H2();
        return this.f21184c5.f56219b.b();
    }

    @Override // b1.InterfaceC2341J
    public void j0(final S s10) {
        S s11;
        H2();
        if (this.f21191g.h()) {
            S K10 = K();
            if (this.f21155L) {
                this.f21156O = s10.f24443E;
                s11 = K1(s10, this.f21157P.f56280a);
            } else {
                s11 = s10;
            }
            if (!s11.equals(this.f21191g.c())) {
                this.f21191g.m(s11);
            }
            if (K10.equals(s10)) {
                return;
            }
            this.f21197k.k(19, new C4155w.a() { // from class: m1.o0
                @Override // e1.C4155w.a
                public final void invoke(Object obj) {
                    ((InterfaceC2341J.d) obj).L(b1.S.this);
                }
            });
        }
    }

    public final Pair j2(AbstractC2346O abstractC2346O, int i10, long j10) {
        if (abstractC2346O.q()) {
            this.f21186d5 = i10;
            if (j10 == -9223372036854775807L) {
                j10 = 0;
            }
            this.f21190f5 = j10;
            this.f21188e5 = 0;
            return null;
        }
        if (i10 == -1 || i10 >= abstractC2346O.p()) {
            i10 = abstractC2346O.a(this.f21151H);
            j10 = abstractC2346O.n(i10, this.f24590a).b();
        }
        return abstractC2346O.j(this.f24590a, this.f21199m, i10, Z.a1(j10));
    }

    @Override // b1.InterfaceC2341J
    public long k() {
        H2();
        return Z.J1(this.f21184c5.f56235r);
    }

    @Override // b1.InterfaceC2341J
    public void k0(SurfaceView surfaceView) {
        H2();
        O1(surfaceView == null ? null : surfaceView.getHolder());
    }

    public final void k2(final int i10, final int i11) {
        if (i10 == this.f21214x2.b() && i11 == this.f21214x2.a()) {
            return;
        }
        this.f21214x2 = new L(i10, i11);
        this.f21197k.k(24, new C4155w.a() { // from class: m1.a0
            @Override // e1.C4155w.a
            public final void invoke(Object obj) {
                ((InterfaceC2341J.d) obj).W(i10, i11);
            }
        });
        s2(2, 14, new L(i10, i11));
    }

    @Override // b1.InterfaceC2341J
    public int l0() {
        H2();
        return this.f21150G;
    }

    public final void l2() {
        h1 h1Var = this.f21184c5;
        D2(h1Var.f56229l, h1Var.f56230m);
    }

    @Override // b1.InterfaceC2341J
    public boolean m0() {
        H2();
        return this.f21151H;
    }

    public final void m2(int i10, final int i11) {
        H2();
        s2(1, 10, Integer.valueOf(i11));
        s2(2, 10, Integer.valueOf(i11));
        this.f21197k.k(21, new C4155w.a() { // from class: m1.n0
            @Override // e1.C4155w.a
            public final void invoke(Object obj) {
                ((InterfaceC2341J.d) obj).a(i11);
            }
        });
    }

    @Override // b1.InterfaceC2341J
    public long n0() {
        H2();
        if (this.f21184c5.f56218a.q()) {
            return this.f21190f5;
        }
        h1 h1Var = this.f21184c5;
        if (h1Var.f56228k.f21519d != h1Var.f56219b.f21519d) {
            return h1Var.f56218a.n(h0(), this.f24590a).d();
        }
        long j10 = h1Var.f56234q;
        if (this.f21184c5.f56228k.b()) {
            h1 h1Var2 = this.f21184c5;
            AbstractC2346O.b h10 = h1Var2.f56218a.h(h1Var2.f56228k.f21516a, this.f21199m);
            long f10 = h10.f(this.f21184c5.f56228k.f21517b);
            j10 = f10 == Long.MIN_VALUE ? h10.f24357d : f10;
        }
        h1 h1Var3 = this.f21184c5;
        return Z.J1(o2(h1Var3.f56218a, h1Var3.f56228k, j10));
    }

    public final void n2(boolean z10) {
        if (this.f21175Y4) {
            return;
        }
        if (!z10) {
            l2();
        } else if (this.f21184c5.f56231n == 3) {
            l2();
        }
    }

    @Override // b1.InterfaceC2341J
    public void o(List list, boolean z10) {
        H2();
        v2(S1(list), z10);
    }

    public final long o2(AbstractC2346O abstractC2346O, D.b bVar, long j10) {
        abstractC2346O.h(bVar.f21516a, this.f21199m);
        return j10 + this.f21199m.o();
    }

    @Override // b1.InterfaceC2341J
    public void p(InterfaceC2341J.d dVar) {
        this.f21197k.c((InterfaceC2341J.d) AbstractC4134a.e(dVar));
    }

    public final h1 p2(h1 h1Var, int i10, int i11) {
        int Y12 = Y1(h1Var);
        long W12 = W1(h1Var);
        AbstractC2346O abstractC2346O = h1Var.f56218a;
        int size = this.f21200n.size();
        this.f21152I++;
        q2(i10, i11);
        AbstractC2346O R12 = R1();
        h1 i22 = i2(h1Var, R12, Z1(abstractC2346O, R12, Y12, W12));
        int i12 = i22.f56222e;
        if (i12 != 1 && i12 != 4 && i10 < i11 && i11 == size && Y12 >= i22.f56218a.p()) {
            i22 = h2(i22, 4);
        }
        this.f21196j.N0(i10, i11, this.f21163T);
        return i22;
    }

    @Override // androidx.media3.exoplayer.ExoPlayer
    public void q(D d10, boolean z10) {
        H2();
        v2(Collections.singletonList(d10), z10);
    }

    @Override // b1.InterfaceC2341J
    public C2333B q0() {
        H2();
        return this.f21174Y;
    }

    public final void q2(int i10, int i11) {
        for (int i12 = i11 - 1; i12 >= i10; i12--) {
            this.f21200n.remove(i12);
        }
        this.f21163T = this.f21163T.a(i10, i11);
    }

    @Override // b1.InterfaceC2341J
    public void r(SurfaceView surfaceView) {
        H2();
        if (surfaceView instanceof x) {
            r2();
            z2(surfaceView);
            x2(surfaceView.getHolder());
        } else {
            if (!(surfaceView instanceof G1.l)) {
                A2(surfaceView == null ? null : surfaceView.getHolder());
                return;
            }
            r2();
            this.f21164T1 = (G1.l) surfaceView;
            T1(this.f21215y).m(10000).l(this.f21164T1).k();
            this.f21164T1.d(this.f21212x);
            z2(this.f21164T1.getVideoSurface());
            x2(surfaceView.getHolder());
        }
    }

    @Override // b1.InterfaceC2341J
    public long r0() {
        H2();
        return this.f21208t;
    }

    public final void r2() {
        if (this.f21164T1 != null) {
            T1(this.f21215y).m(10000).l(null).k();
            this.f21164T1.g(this.f21212x);
            this.f21164T1 = null;
        }
        TextureView textureView = this.f21181b2;
        if (textureView != null) {
            if (textureView.getSurfaceTextureListener() != this.f21212x) {
                AbstractC4156x.i("ExoPlayerImpl", "SurfaceTextureListener already unset or replaced.");
            } else {
                this.f21181b2.setSurfaceTextureListener(null);
            }
            this.f21181b2 = null;
        }
        SurfaceHolder surfaceHolder = this.f21216y1;
        if (surfaceHolder != null) {
            surfaceHolder.removeCallback(this.f21212x);
            this.f21216y1 = null;
        }
    }

    @Override // androidx.media3.exoplayer.ExoPlayer
    public void release() {
        AbstractC4156x.g("ExoPlayerImpl", "Release " + Integer.toHexString(System.identityHashCode(this)) + " [AndroidXMedia3/1.8.0] [" + Z.f45507e + "] [" + AbstractC2332A.b() + "]");
        H2();
        this.f21218z.d(false);
        r rVar = this.f21144A;
        if (rVar != null) {
            rVar.n();
        }
        this.f21145B.d(false);
        this.f21146C.d(false);
        s sVar = this.f21148E;
        if (sVar != null) {
            sVar.disable();
        }
        if (!this.f21196j.J0()) {
            this.f21197k.k(10, new C4155w.a() { // from class: m1.b0
                @Override // e1.C4155w.a
                public final void invoke(Object obj) {
                    ((InterfaceC2341J.d) obj).J(I.f(new N0(1), 1003));
                }
            });
        }
        this.f21197k.i();
        this.f21194h.g(null);
        this.f21207s.e(this.f21205q);
        h1 h1Var = this.f21184c5;
        if (h1Var.f56233p) {
            this.f21184c5 = h1Var.a();
        }
        h1 h22 = h2(this.f21184c5, 1);
        this.f21184c5 = h22;
        h1 c10 = h22.c(h22.f56219b);
        this.f21184c5 = c10;
        c10.f56234q = c10.f56236s;
        this.f21184c5.f56235r = 0L;
        this.f21205q.release();
        r2();
        Surface surface = this.f21213x1;
        if (surface != null) {
            surface.release();
            this.f21213x1 = null;
        }
        if (this.f21173X4) {
            android.support.v4.media.session.b.a(AbstractC4134a.e(null));
            throw null;
        }
        this.f21165T4 = C3987c.f44894d;
        this.f21175Y4 = true;
    }

    @Override // androidx.media3.exoplayer.ExoPlayer
    public void s(D d10, long j10) {
        H2();
        u2(Collections.singletonList(d10), 0, j10);
    }

    public final void s2(int i10, int i11, Object obj) {
        for (p pVar : this.renderers) {
            if (i10 == -1 || pVar.f() == i10) {
                T1(pVar).m(i11).l(obj).k();
            }
        }
        for (p pVar2 : this.secondaryRenderers) {
            if (pVar2 != null && (i10 == -1 || pVar2.f() == i10)) {
                T1(pVar2).m(i11).l(obj).k();
            }
        }
    }

    @Override // androidx.media3.exoplayer.ExoPlayer
    public void setImageOutput(ImageOutput imageOutput) {
        H2();
        s2(4, 15, imageOutput);
    }

    @Override // androidx.media3.exoplayer.ExoPlayer
    public void setScrubbingModeEnabled(boolean z10) {
        S G10;
        H2();
        if (z10 == this.f21155L) {
            return;
        }
        this.f21155L = z10;
        if (!this.f21157P.f56280a.isEmpty() && this.f21191g.h()) {
            S c10 = this.f21191g.c();
            if (z10) {
                this.f21156O = c10.f24443E;
                G10 = K1(c10, this.f21157P.f56280a);
            } else {
                G10 = c10.a().L(this.f21156O).G();
                this.f21156O = null;
            }
            if (!G10.equals(c10)) {
                this.f21191g.m(G10);
            }
        }
        this.f21196j.y1(z10);
        l2();
    }

    @Override // b1.InterfaceC2341J
    public void stop() {
        H2();
        B2(null);
        this.f21165T4 = new C3987c(AbstractC3445z.t(), this.f21184c5.f56236s);
    }

    @Override // b1.InterfaceC2341J
    public void t(int i10, int i11) {
        H2();
        AbstractC4134a.a(i10 >= 0 && i11 >= i10);
        int size = this.f21200n.size();
        int min = Math.min(i11, size);
        if (i10 >= size || i10 == min) {
            return;
        }
        h1 p22 = p2(this.f21184c5, i10, min);
        E2(p22, 0, !p22.f56219b.f21516a.equals(this.f21184c5.f56219b.f21516a), 4, X1(p22), -1, false);
    }

    public final void t2(int i10, Object obj) {
        s2(-1, i10, obj);
    }

    public void u2(List list, int i10, long j10) {
        H2();
        w2(list, i10, j10, false);
    }

    @Override // b1.InterfaceC2341J
    public void v(InterfaceC2341J.d dVar) {
        H2();
        this.f21197k.j((InterfaceC2341J.d) AbstractC4134a.e(dVar));
    }

    public void v2(List list, boolean z10) {
        H2();
        w2(list, -1, -9223372036854775807L, z10);
    }

    public final void w2(List list, int i10, long j10, boolean z10) {
        long j11;
        int i11;
        int i12;
        int i13 = i10;
        int Y12 = Y1(this.f21184c5);
        long currentPosition = getCurrentPosition();
        this.f21152I++;
        if (!this.f21200n.isEmpty()) {
            q2(0, this.f21200n.size());
        }
        List L12 = L1(0, list);
        AbstractC2346O R12 = R1();
        if (!R12.q() && i13 >= R12.p()) {
            throw new C2369x(R12, i13, j10);
        }
        if (z10) {
            i13 = R12.a(this.f21151H);
            j11 = -9223372036854775807L;
        } else {
            if (i13 == -1) {
                i11 = Y12;
                j11 = currentPosition;
                h1 i22 = i2(this.f21184c5, R12, j2(R12, i11, j11));
                i12 = i22.f56222e;
                if (i11 != -1 && i12 != 1) {
                    i12 = (!R12.q() || i11 >= R12.p()) ? 4 : 2;
                }
                h1 h22 = h2(i22, i12);
                this.f21196j.o1(L12, i11, Z.a1(j11), this.f21163T);
                E2(h22, 0, this.f21184c5.f56219b.f21516a.equals(h22.f56219b.f21516a) && !this.f21184c5.f56218a.q(), 4, X1(h22), -1, false);
            }
            j11 = j10;
        }
        i11 = i13;
        h1 i222 = i2(this.f21184c5, R12, j2(R12, i11, j11));
        i12 = i222.f56222e;
        if (i11 != -1) {
            if (R12.q()) {
            }
        }
        h1 h222 = h2(i222, i12);
        this.f21196j.o1(L12, i11, Z.a1(j11), this.f21163T);
        E2(h222, 0, this.f21184c5.f56219b.f21516a.equals(h222.f56219b.f21516a) && !this.f21184c5.f56218a.q(), 4, X1(h222), -1, false);
    }

    @Override // b1.InterfaceC2341J
    public void x(boolean z10) {
        H2();
        D2(z10, 1);
    }

    public final void x2(SurfaceHolder surfaceHolder) {
        this.f21168V1 = false;
        this.f21216y1 = surfaceHolder;
        surfaceHolder.addCallback(this.f21212x);
        Surface surface = this.f21216y1.getSurface();
        if (surface == null || !surface.isValid()) {
            k2(0, 0);
        } else {
            Rect surfaceFrame = this.f21216y1.getSurfaceFrame();
            k2(surfaceFrame.width(), surfaceFrame.height());
        }
    }

    @Override // androidx.media3.exoplayer.ExoPlayer
    public androidx.media3.common.a y() {
        H2();
        return this.f21180b1;
    }

    @Override // b1.AbstractC2355i
    public void y0(int i10, long j10, int i11, boolean z10) {
        H2();
        if (i10 == -1) {
            return;
        }
        AbstractC4134a.a(i10 >= 0);
        AbstractC2346O abstractC2346O = this.f21184c5.f56218a;
        if (abstractC2346O.q() || i10 < abstractC2346O.p()) {
            this.f21205q.H();
            this.f21152I++;
            if (j()) {
                AbstractC4156x.i("ExoPlayerImpl", "seekTo ignored because an ad is playing");
                i.e eVar = new i.e(this.f21184c5);
                eVar.b(1);
                this.f21195i.a(eVar);
                return;
            }
            h1 h1Var = this.f21184c5;
            int i12 = h1Var.f56222e;
            if (i12 == 3 || (i12 == 4 && !abstractC2346O.q())) {
                h1Var = h2(this.f21184c5, 2);
            }
            int h02 = h0();
            h1 i22 = i2(h1Var, abstractC2346O, j2(abstractC2346O, i10, j10));
            this.f21196j.a1(abstractC2346O, i10, Z.a1(j10));
            E2(i22, 0, true, 1, X1(i22), h02, z10);
        }
    }

    public final void y2(SurfaceTexture surfaceTexture) {
        Surface surface = new Surface(surfaceTexture);
        z2(surface);
        this.f21213x1 = surface;
    }

    @Override // b1.InterfaceC2341J
    public T z() {
        H2();
        return this.f21184c5.f56226i.f21914b;
    }

    public final void z2(Object obj) {
        Object obj2 = this.f21203p1;
        boolean z10 = (obj2 == null || obj2 == obj) ? false : true;
        boolean I12 = this.f21196j.I1(obj, z10 ? this.f21147D : -9223372036854775807L);
        if (z10) {
            Object obj3 = this.f21203p1;
            Surface surface = this.f21213x1;
            if (obj3 == surface) {
                surface.release();
                this.f21213x1 = null;
            }
        }
        this.f21203p1 = obj;
        if (I12) {
            return;
        }
        B2(I.f(new N0(3), 1003));
    }
}
