package t2;

import F1.ExecutorC1153o;
import android.content.Context;
import android.os.Build;
import android.os.Looper;
import androidx.media3.effect.DefaultVideoFrameProcessor;
import b1.AbstractC2332A;
import b1.AbstractC2335D;
import b1.C2364s;
import b1.InterfaceC2360n;
import b1.W;
import b1.z;
import com.google.common.collect.AbstractC3445z;
import e1.AbstractC4134a;
import e1.C4155w;
import e1.InterfaceC4143j;
import e1.InterfaceC4152t;
import java.io.File;
import java.io.IOException;
import java.util.Objects;
import l1.AbstractC5366l;
import okhttp3.internal.ws.RealWebSocket;
import r2.InterfaceC6199b;
import t2.C6382C;
import t2.C6396g0;
import t2.C6407m;
import t2.C6418s;
import t2.C6424v;
import t2.C6429x0;
import t2.D;
import t2.F;
import t2.I0;
import t2.InterfaceC6383a;
import t2.InterfaceC6391e;
import t2.InterfaceC6399i;
import t2.V0;
import t2.a1;
import t2.g1;
import t2.p1;

/* loaded from: classes.dex */
public final class a1 {

    /* renamed from: L, reason: collision with root package name */
    public static final long f65194L;

    /* renamed from: A, reason: collision with root package name */
    public g1 f65195A;

    /* renamed from: B, reason: collision with root package name */
    public I0 f65196B;

    /* renamed from: C, reason: collision with root package name */
    public C6407m f65197C;

    /* renamed from: D, reason: collision with root package name */
    public String f65198D;

    /* renamed from: E, reason: collision with root package name */
    public String f65199E;

    /* renamed from: F, reason: collision with root package name */
    public int f65200F;

    /* renamed from: G, reason: collision with root package name */
    public Ta.o f65201G;

    /* renamed from: H, reason: collision with root package name */
    public C6396g0 f65202H;

    /* renamed from: I, reason: collision with root package name */
    public Ta.o f65203I;

    /* renamed from: J, reason: collision with root package name */
    public H0 f65204J;

    /* renamed from: K, reason: collision with root package name */
    public p1 f65205K;

    /* renamed from: a, reason: collision with root package name */
    public final Context f65206a;

    /* renamed from: b, reason: collision with root package name */
    public final V0 f65207b;

    /* renamed from: c, reason: collision with root package name */
    public final AbstractC3445z f65208c;

    /* renamed from: d, reason: collision with root package name */
    public final AbstractC3445z f65209d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f65210e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f65211f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f65212g;

    /* renamed from: h, reason: collision with root package name */
    public final boolean f65213h;

    /* renamed from: i, reason: collision with root package name */
    public final AbstractC3445z f65214i;

    /* renamed from: j, reason: collision with root package name */
    public final boolean f65215j;

    /* renamed from: k, reason: collision with root package name */
    public final boolean f65216k;

    /* renamed from: l, reason: collision with root package name */
    public final long f65217l;

    /* renamed from: m, reason: collision with root package name */
    public final int f65218m;

    /* renamed from: n, reason: collision with root package name */
    public final C4155w f65219n;

    /* renamed from: o, reason: collision with root package name */
    public final InterfaceC6383a.b f65220o;

    /* renamed from: p, reason: collision with root package name */
    public final InterfaceC6391e.a f65221p;

    /* renamed from: q, reason: collision with root package name */
    public final W.b f65222q;

    /* renamed from: r, reason: collision with root package name */
    public final InterfaceC6399i.b f65223r;

    /* renamed from: s, reason: collision with root package name */
    public final InterfaceC6199b.a f65224s;

    /* renamed from: t, reason: collision with root package name */
    public final Looper f65225t;

    /* renamed from: u, reason: collision with root package name */
    public final InterfaceC2360n f65226u;

    /* renamed from: v, reason: collision with root package name */
    public final InterfaceC4143j f65227v;

    /* renamed from: w, reason: collision with root package name */
    public final InterfaceC4152t f65228w;

    /* renamed from: x, reason: collision with root package name */
    public final d f65229x;

    /* renamed from: y, reason: collision with root package name */
    public final C6429x0.b f65230y;

    /* renamed from: z, reason: collision with root package name */
    public final C6396g0.c.a f65231z;

    public class a implements Ta.h {
        public a() {
        }

        @Override // Ta.h
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public void onSuccess(Void r12) {
            a1.this.Q();
        }

        @Override // Ta.h
        public void onFailure(Throwable th2) {
            a1.this.P(C6427w0.e(new IOException("Copy output task failed for the resumed export", th2)));
        }
    }

    public class b implements Ta.h {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ long f65233a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ long f65234b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ E f65235c;

        public b(long j10, long j11, E e10) {
            this.f65233a = j10;
            this.f65234b = j11;
            this.f65235c = e10;
        }

        @Override // Ta.h
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public void onSuccess(H0 h02) {
            androidx.media3.common.a aVar;
            int i10;
            long j10 = h02.f65057d;
            if (j10 == -9223372036854775807L) {
                a1.this.f65230y.n(4);
                a1.this.S();
                return;
            }
            if (j10 != Long.MIN_VALUE) {
                long j11 = this.f65233a;
                if (j11 == Long.MIN_VALUE || j11 >= j10) {
                    androidx.media3.common.a aVar2 = h02.f65060g;
                    long o12 = (aVar2 == null || (i10 = aVar2.f20519G) == -1) ? 0L : e1.Z.o1(RealWebSocket.DEFAULT_MINIMUM_DEFLATE_SIZE, i10);
                    long j12 = h02.f65057d;
                    if (j12 == h02.f65056c) {
                        a1 a1Var = a1.this;
                        a1Var.f65197C = l1.b(a1Var.f65197C, this.f65234b, this.f65233a, h02.f65054a, true, false);
                        a1.this.f65230y.n(2);
                        a1.this.S();
                        return;
                    }
                    if (j12 - this.f65234b <= o12 || h02.f65058e) {
                        a1 a1Var2 = a1.this;
                        a1Var2.f65197C = l1.b(a1Var2.f65197C, h02.f65057d, this.f65233a, h02.f65054a, true, false);
                        a1.this.f65230y.n(2);
                        a1.this.S();
                        return;
                    }
                    a1.this.f65196B = new I0((String) AbstractC4134a.e(a1.this.f65198D), a1.this.f65224s, a1.this.f65229x, 1, false, h02.f65059f, false);
                    if (k1.m((androidx.media3.common.a) AbstractC4134a.e(h02.f65059f), a1.this.f65197C, 0, a1.this.f65207b, a1.this.f65223r, a1.this.f65196B) || ((aVar = h02.f65060g) != null && k1.l(aVar, a1.this.f65197C, 0, a1.this.f65207b, a1.this.f65223r, a1.this.f65196B))) {
                        a1.this.f65196B = null;
                        a1.this.f65230y.n(3);
                        a1.this.S();
                        return;
                    } else {
                        a1.this.f65204J = h02;
                        k1.k(a1.this.f65196B, this.f65235c.f65019g.f65397b, (androidx.media3.common.a) AbstractC4134a.e(h02.f65059f));
                        C6407m b10 = l1.b(a1.this.f65197C, this.f65234b, h02.f65057d, h02.f65054a, false, true);
                        a1 a1Var3 = a1.this;
                        a1Var3.Z(b10, (I0) AbstractC4134a.e(a1Var3.f65196B), a1.this.f65229x, 0L, false);
                        return;
                    }
                }
            }
            a1.this.f65230y.n(2);
            a1.this.S();
        }

        @Override // Ta.h
        public void onFailure(Throwable th2) {
            a1.this.f65230y.n(5);
            a1.this.S();
        }
    }

    public static final class c {

        /* renamed from: z, reason: collision with root package name */
        public static final AbstractC3445z f65237z = AbstractC3445z.x(0, 90, 180, 270);

        /* renamed from: a, reason: collision with root package name */
        public final Context f65238a;

        /* renamed from: b, reason: collision with root package name */
        public String f65239b;

        /* renamed from: c, reason: collision with root package name */
        public String f65240c;

        /* renamed from: d, reason: collision with root package name */
        public V0 f65241d;

        /* renamed from: e, reason: collision with root package name */
        public final AbstractC3445z f65242e;

        /* renamed from: f, reason: collision with root package name */
        public final AbstractC3445z f65243f;

        /* renamed from: g, reason: collision with root package name */
        public boolean f65244g;

        /* renamed from: h, reason: collision with root package name */
        public boolean f65245h;

        /* renamed from: i, reason: collision with root package name */
        public boolean f65246i;

        /* renamed from: j, reason: collision with root package name */
        public boolean f65247j;

        /* renamed from: k, reason: collision with root package name */
        public AbstractC3445z f65248k;

        /* renamed from: l, reason: collision with root package name */
        public boolean f65249l;

        /* renamed from: m, reason: collision with root package name */
        public boolean f65250m;

        /* renamed from: n, reason: collision with root package name */
        public long f65251n;

        /* renamed from: o, reason: collision with root package name */
        public int f65252o;

        /* renamed from: p, reason: collision with root package name */
        public C4155w f65253p;

        /* renamed from: q, reason: collision with root package name */
        public InterfaceC6383a.b f65254q;

        /* renamed from: r, reason: collision with root package name */
        public InterfaceC6391e.a f65255r;

        /* renamed from: s, reason: collision with root package name */
        public W.b f65256s;

        /* renamed from: t, reason: collision with root package name */
        public InterfaceC6399i.b f65257t;

        /* renamed from: u, reason: collision with root package name */
        public InterfaceC6199b.a f65258u;

        /* renamed from: v, reason: collision with root package name */
        public Looper f65259v;

        /* renamed from: w, reason: collision with root package name */
        public InterfaceC2360n f65260w;

        /* renamed from: x, reason: collision with root package name */
        public InterfaceC4143j f65261x;

        /* renamed from: y, reason: collision with root package name */
        public C6396g0.c.a f65262y;

        public c(Context context) {
            Context applicationContext = context.getApplicationContext();
            this.f65238a = applicationContext;
            this.f65251n = a1.f65194L;
            this.f65252o = -1;
            this.f65242e = AbstractC3445z.t();
            this.f65243f = AbstractC3445z.t();
            this.f65255r = new C6418s.b();
            this.f65256s = new DefaultVideoFrameProcessor.Factory.Builder().build();
            this.f65257t = new C6382C.b(applicationContext).h();
            this.f65258u = new D.b();
            Looper a02 = e1.Z.a0();
            this.f65259v = a02;
            this.f65260w = InterfaceC2360n.f24615a;
            InterfaceC4143j interfaceC4143j = InterfaceC4143j.f45530a;
            this.f65261x = interfaceC4143j;
            this.f65253p = new C4155w(a02, interfaceC4143j, new C4155w.b() { // from class: t2.b1
                @Override // e1.C4155w.b
                public final void a(Object obj, C2364s c2364s) {
                    a1.c.a((a1.e) obj, c2364s);
                }
            });
            if (Build.VERSION.SDK_INT >= 35) {
                this.f65250m = true;
                this.f65262y = new C6396g0.b.a(context);
            }
            this.f65248k = f65237z;
        }

        public static /* synthetic */ void a(e eVar, C2364s c2364s) {
        }

        public c b(e eVar) {
            this.f65253p.c(eVar);
            return this;
        }

        public a1 c() {
            V0 v02 = this.f65241d;
            V0.b bVar = v02 == null ? new V0.b() : v02.a();
            String str = this.f65239b;
            if (str != null) {
                bVar.b(str);
            }
            String str2 = this.f65240c;
            if (str2 != null) {
                bVar.e(str2);
            }
            V0 a10 = bVar.a();
            this.f65241d = a10;
            String str3 = a10.f65179b;
            if (str3 != null) {
                d(str3);
            }
            String str4 = this.f65241d.f65180c;
            if (str4 != null) {
                d(str4);
            }
            AbstractC4134a.h(!this.f65247j || this.f65258u.b(), String.format("Muxer.Factory %s does not support writing negative timestamps to an edit list.", this.f65258u));
            return new a1(this.f65238a, this.f65241d, this.f65242e, this.f65243f, this.f65244g, this.f65245h, this.f65246i, this.f65247j, this.f65248k, this.f65249l, this.f65250m, this.f65251n, this.f65252o, this.f65253p, this.f65254q, this.f65255r, this.f65256s, this.f65257t, this.f65258u, this.f65259v, this.f65260w, this.f65261x, this.f65262y, null);
        }

        public final void d(String str) {
            AbstractC4134a.h(this.f65258u.a(AbstractC2335D.k(str)).contains(str), "Unsupported sample MIME type " + str);
        }

        public c e(String str) {
            String u10 = AbstractC2335D.u(str);
            AbstractC4134a.b(AbstractC2335D.o(u10), "Not an audio MIME type: " + u10);
            this.f65239b = u10;
            return this;
        }

        public c f(InterfaceC6399i.b bVar) {
            this.f65257t = bVar;
            return this;
        }

        public c g(String str) {
            String u10 = AbstractC2335D.u(str);
            AbstractC4134a.b(AbstractC2335D.t(u10), "Not a video MIME type: " + u10);
            this.f65240c = u10;
            return this;
        }
    }

    public final class d implements g1.b, I0.b {
        public d() {
        }

        @Override // t2.I0.b
        public void a(int i10, androidx.media3.common.a aVar, int i11, int i12) {
            if (i10 == 1) {
                a1.this.f65230y.e(aVar.f20543o).f(i11);
                if (aVar.f20518F != -1) {
                    a1.this.f65230y.h(aVar.f20518F);
                }
                if (aVar.f20519G != -1) {
                    a1.this.f65230y.o(aVar.f20519G);
                    return;
                }
                return;
            }
            if (i10 == 2) {
                a1.this.f65230y.r(aVar.f20543o).g(i11).i(aVar.f20516D).q(i12);
                if (aVar.f20551w != -1) {
                    a1.this.f65230y.m(aVar.f20551w);
                }
                if (aVar.f20550v != -1) {
                    a1.this.f65230y.s(aVar.f20550v);
                }
            }
        }

        @Override // t2.g1.b
        public void b(AbstractC3445z abstractC3445z, String str, String str2, C6427w0 c6427w0) {
            if (c6427w0.f65602a == 7003 && (a1.this.K() || a1.this.J())) {
                a1.this.f65196B = null;
                a1.this.f65195A = null;
                a1.this.f65230y.c();
                a1.this.f65230y.n(6);
                a1.this.S();
                return;
            }
            a1.this.f65230y.a(abstractC3445z);
            if (str != null) {
                a1.this.f65230y.d(str);
            }
            if (str2 != null) {
                a1.this.f65230y.p(str2);
            }
            a1.this.f65230y.k(c6427w0);
            a1.this.P(c6427w0);
            a1.this.f65195A = null;
        }

        @Override // t2.I0.b
        public void c() {
            if (a1.this.f65205K != null) {
                a1.this.f65205K.b();
            } else {
                AbstractC4134a.g(a1.this.f65217l == -9223372036854775807L);
            }
        }

        @Override // t2.g1.b
        public void d(AbstractC3445z abstractC3445z, String str, String str2) {
            a1.this.f65230y.a(abstractC3445z);
            if (str != null) {
                a1.this.f65230y.d(str);
            }
            if (str2 != null) {
                a1.this.f65230y.p(str2);
            }
            a1.this.f65195A = null;
            if (a1.this.f65200F == 1) {
                a1.this.U();
                return;
            }
            if (a1.this.f65200F == 2) {
                a1.this.f65196B = null;
                a1.this.R();
                return;
            }
            if (a1.this.f65200F == 3) {
                a1.this.F();
                return;
            }
            if (a1.this.f65200F == 5) {
                a1.this.V();
            } else {
                if (a1.this.f65200F != 6) {
                    a1.this.Q();
                    return;
                }
                a1.this.f65204J = null;
                a1.this.f65230y.n(1);
                a1.this.Q();
            }
        }

        @Override // t2.I0.b
        public void e(long j10, long j11) {
            a1.this.f65230y.j(j10).l(j11);
            ((g1) AbstractC4134a.e(a1.this.f65195A)).A();
        }

        public /* synthetic */ d(a1 a1Var, Z0 z02) {
            this();
        }
    }

    static {
        AbstractC2332A.a("media3.transformer");
        f65194L = e1.Z.S0() ? 25000L : 10000L;
    }

    public /* synthetic */ a1(Context context, V0 v02, AbstractC3445z abstractC3445z, AbstractC3445z abstractC3445z2, boolean z10, boolean z11, boolean z12, boolean z13, AbstractC3445z abstractC3445z3, boolean z14, boolean z15, long j10, int i10, C4155w c4155w, InterfaceC6383a.b bVar, InterfaceC6391e.a aVar, W.b bVar2, InterfaceC6399i.b bVar3, InterfaceC6199b.a aVar2, Looper looper, InterfaceC2360n interfaceC2360n, InterfaceC4143j interfaceC4143j, C6396g0.c.a aVar3, Z0 z02) {
        this(context, v02, abstractC3445z, abstractC3445z2, z10, z11, z12, z13, abstractC3445z3, z14, z15, j10, i10, c4155w, bVar, aVar, bVar2, bVar3, aVar2, looper, interfaceC2360n, interfaceC4143j, aVar3);
    }

    public static /* synthetic */ void a(a1 a1Var) {
        a1Var.getClass();
        ((g1) AbstractC4134a.e(a1Var.f65195A)).B(C6427w0.d(new IllegalStateException(e1.Z.G("Abort: no output sample written in the last %d milliseconds. DebugTrace: %s", Long.valueOf(a1Var.f65217l), AbstractC5366l.b())), 7002));
    }

    public final boolean D() {
        return Build.VERSION.SDK_INT >= 35 && this.f65216k;
    }

    public void E() {
        a0();
        g1 g1Var = this.f65195A;
        if (g1Var == null) {
            O();
            return;
        }
        try {
            g1Var.w();
            Ta.o oVar = this.f65201G;
            if (oVar != null && !oVar.isDone()) {
                this.f65201G.cancel(false);
            }
            Ta.o oVar2 = this.f65203I;
            if (oVar2 != null && !oVar2.isDone()) {
                this.f65203I.cancel(false);
            }
            O();
        } finally {
            K0 k02 = new K0();
            int G10 = G(k02);
            this.f65195A = null;
            if (D()) {
                ((C6396g0) AbstractC4134a.e(this.f65202H)).g(G10 == 2 ? k02.f65093a : -1);
            }
        }
    }

    public final void F() {
        this.f65200F = 4;
        Ta.o c10 = l1.c(new File((String) AbstractC4134a.e(this.f65199E)), new File((String) AbstractC4134a.e(this.f65198D)));
        this.f65203I = c10;
        a aVar = new a();
        InterfaceC4152t interfaceC4152t = this.f65228w;
        Objects.requireNonNull(interfaceC4152t);
        Ta.i.a(c10, aVar, new ExecutorC1153o(interfaceC4152t));
    }

    public int G(K0 k02) {
        a0();
        if (J()) {
            return 3;
        }
        if (K()) {
            return H(k02);
        }
        g1 g1Var = this.f65195A;
        if (g1Var == null) {
            return 0;
        }
        return g1Var.D(k02);
    }

    public final int H(K0 k02) {
        int D10;
        if (this.f65204J == null) {
            return 1;
        }
        long j10 = ((E) ((F) ((C6407m) AbstractC4134a.e(this.f65197C)).f65405a.get(0)).f65031a.get(0)).f65013a.f24659f.f24686b;
        H0 h02 = this.f65204J;
        float f10 = (h02.f65057d - j10) / h02.f65054a;
        if (this.f65200F == 5) {
            g1 g1Var = this.f65195A;
            if (g1Var == null || (D10 = g1Var.D(k02)) == 0 || D10 == 1) {
                return 1;
            }
            if (D10 == 2) {
                k02.f65093a = Math.round(k02.f65093a * f10);
                return 2;
            }
            if (D10 == 3) {
                return 3;
            }
            throw new IllegalStateException();
        }
        float f11 = 100.0f * f10;
        g1 g1Var2 = this.f65195A;
        if (g1Var2 == null) {
            k02.f65093a = Math.round(f11);
            return 2;
        }
        int D11 = g1Var2.D(k02);
        if (D11 == 0 || D11 == 1) {
            k02.f65093a = Math.round(f11);
            return 2;
        }
        if (D11 == 2) {
            k02.f65093a = Math.round(f11 + ((1.0f - f10) * k02.f65093a));
            return 2;
        }
        if (D11 == 3) {
            return 3;
        }
        throw new IllegalStateException();
    }

    public final void I(C6407m c6407m, String str) {
        N();
        this.f65197C = c6407m;
        this.f65198D = str;
        this.f65230y.c();
    }

    public final boolean J() {
        int i10 = this.f65200F;
        return i10 == 1 || i10 == 2 || i10 == 3 || i10 == 4;
    }

    public final boolean K() {
        int i10 = this.f65200F;
        return i10 == 5 || i10 == 6;
    }

    public final boolean L() {
        return ((C6407m) AbstractC4134a.e(this.f65197C)).f65405a.size() > 1 || ((F) this.f65197C.f65405a.get(0)).f65031a.size() > 1;
    }

    public final boolean M() {
        if (L()) {
            return false;
        }
        return !((E) ((F) ((C6407m) AbstractC4134a.e(this.f65197C)).f65405a.get(0)).f65031a.get(0)).f65013a.f24659f.equals(z.d.f24676i);
    }

    public final void N() {
        long j10 = this.f65217l;
        if (j10 == -9223372036854775807L) {
            return;
        }
        p1 p1Var = new p1(j10, new p1.a() { // from class: t2.W0
            @Override // t2.p1.a
            public final void a() {
                a1.a(a1.this);
            }
        });
        this.f65205K = p1Var;
        p1Var.d();
    }

    public final void O() {
        p1 p1Var = this.f65205K;
        if (p1Var != null) {
            p1Var.e();
            this.f65205K = null;
        }
    }

    public final void P(final C6427w0 c6427w0) {
        O();
        final C6429x0 b10 = this.f65230y.b();
        this.f65219n.h(-1, new C4155w.a() { // from class: t2.X0
            @Override // e1.C4155w.a
            public final void invoke(Object obj) {
                a1.e eVar = (a1.e) obj;
                eVar.c((C6407m) AbstractC4134a.e(a1.this.f65197C), b10, c6427w0);
            }
        });
        this.f65219n.f();
        if (D()) {
            K0 k02 = new K0();
            ((C6396g0) AbstractC4134a.e(this.f65202H)).h(G(k02) == 2 ? k02.f65093a : -1, c6427w0, b10);
        }
        this.f65200F = 0;
    }

    public final void Q() {
        O();
        final C6429x0 b10 = this.f65230y.b();
        this.f65219n.h(-1, new C4155w.a() { // from class: t2.Y0
            @Override // e1.C4155w.a
            public final void invoke(Object obj) {
                a1.e eVar = (a1.e) obj;
                eVar.b((C6407m) AbstractC4134a.e(a1.this.f65197C), b10);
            }
        });
        this.f65219n.f();
        if (D()) {
            ((C6396g0) AbstractC4134a.e(this.f65202H)).i(b10);
        }
        this.f65200F = 0;
    }

    public final void R() {
        this.f65200F = 3;
        Z(l1.d((C6407m) AbstractC4134a.e(this.f65197C), (String) AbstractC4134a.e(this.f65198D)), new I0((String) AbstractC4134a.e(this.f65199E), this.f65224s, this.f65229x, 0, false, null, W()), this.f65229x, 0L, false);
    }

    public final void S() {
        this.f65200F = 0;
        Z((C6407m) AbstractC4134a.e(this.f65197C), new I0((String) AbstractC4134a.e(this.f65198D), this.f65224s, this.f65229x, 0, false, null, false), this.f65229x, 0L, false);
    }

    public final void T() {
        this.f65200F = 5;
        E e10 = (E) ((F) ((C6407m) AbstractC4134a.e(this.f65197C)).f65405a.get(0)).f65031a.get(0);
        b1.z zVar = e10.f65013a;
        z.d dVar = zVar.f24659f;
        long j10 = dVar.f24686b;
        long j11 = dVar.f24688d;
        Ta.o e11 = l1.e(this.f65206a, ((z.h) AbstractC4134a.e(zVar.f24655b)).f24749a.toString(), j10);
        b bVar = new b(j11, j10, e10);
        InterfaceC4152t interfaceC4152t = this.f65228w;
        Objects.requireNonNull(interfaceC4152t);
        Ta.i.a(e11, bVar, new ExecutorC1153o(interfaceC4152t));
    }

    public final void U() {
        this.f65200F = 2;
        l1.a((C6407m) AbstractC4134a.e(this.f65197C), true, false, null);
        AbstractC4134a.e(this.f65196B);
        this.f65196B.c();
        android.support.v4.media.session.b.a(AbstractC4134a.e(null));
        throw null;
    }

    public final void V() {
        this.f65200F = 6;
        E e10 = (E) ((F) ((C6407m) AbstractC4134a.e(this.f65197C)).f65405a.get(0)).f65031a.get(0);
        H0 h02 = (H0) AbstractC4134a.e(this.f65204J);
        z.d dVar = e10.f65013a.f24659f;
        long j10 = dVar.f24686b;
        C6407m b10 = l1.b(this.f65197C, h02.f65057d, dVar.f24688d, h02.f65054a, true, true);
        AbstractC4134a.e(this.f65196B);
        this.f65196B.c();
        Z(b10, this.f65196B, this.f65229x, h02.f65057d - j10, false);
    }

    public final boolean W() {
        return this.f65213h && M();
    }

    public void X(C6407m c6407m, String str) {
        a0();
        I(c6407m, str);
        if (this.f65212g && M()) {
            T();
        } else {
            Z(c6407m, new I0(str, this.f65224s, this.f65229x, 0, this.f65215j, null, W()), this.f65229x, 0L, false);
        }
    }

    public void Y(E e10, String str) {
        X(new C6407m.b(new F.b(e10).e(), new F[0]).a(), str);
    }

    public final void Z(C6407m c6407m, I0 i02, d dVar, long j10, boolean z10) {
        AbstractC4134a.h(this.f65195A == null, "There is already an export in progress.");
        V0 v02 = this.f65207b;
        if (c6407m.f65411g != 0) {
            v02 = v02.a().c(c6407m.f65411g).a();
        }
        V0 v03 = v02;
        if (D()) {
            String str = this.f65224s instanceof D.b ? D.f65007b : null;
            C6396g0.c create = ((C6396g0.c.a) AbstractC4134a.e(this.f65231z)).create();
            r2 = create instanceof C6396g0.b ? ((C6396g0.b) create).d() : null;
            this.f65202H = new C6396g0(create, "androidx.media3:media3-transformer:1.8.0", str);
        }
        A0 a02 = new A0(c6407m, this.f65219n, this.f65228w, v03);
        InterfaceC6383a.b bVar = this.f65220o;
        if (z10 || bVar == null) {
            Context context = this.f65206a;
            bVar = new r(context, new C6424v.b(context).i(), this.f65227v, r2);
        }
        InterfaceC6383a.b bVar2 = bVar;
        AbstractC5366l.h();
        g1 g1Var = new g1(this.f65206a, c6407m, v03, bVar2, this.f65221p, this.f65222q, this.f65223r, this.f65214i, this.f65218m, i02, dVar, a02, this.f65228w, this.f65226u, this.f65227v, j10, r2, W());
        this.f65195A = g1Var;
        g1Var.G();
    }

    public final void a0() {
        if (Looper.myLooper() != this.f65225t) {
            throw new IllegalStateException("Transformer is accessed on the wrong thread.");
        }
    }

    public a1(Context context, V0 v02, AbstractC3445z abstractC3445z, AbstractC3445z abstractC3445z2, boolean z10, boolean z11, boolean z12, boolean z13, AbstractC3445z abstractC3445z3, boolean z14, boolean z15, long j10, int i10, C4155w c4155w, InterfaceC6383a.b bVar, InterfaceC6391e.a aVar, W.b bVar2, InterfaceC6399i.b bVar3, InterfaceC6199b.a aVar2, Looper looper, InterfaceC2360n interfaceC2360n, InterfaceC4143j interfaceC4143j, C6396g0.c.a aVar3) {
        AbstractC4134a.h((z10 && z11) ? false : true, "Audio and video cannot both be removed.");
        this.f65206a = context;
        this.f65207b = v02;
        this.f65208c = abstractC3445z;
        this.f65209d = abstractC3445z2;
        this.f65210e = z10;
        this.f65211f = z11;
        this.f65212g = z12;
        this.f65213h = z13;
        this.f65214i = abstractC3445z3;
        this.f65215j = z14;
        this.f65216k = z15;
        this.f65217l = j10;
        this.f65218m = i10;
        this.f65219n = c4155w;
        this.f65220o = bVar;
        this.f65221p = aVar;
        this.f65222q = bVar2;
        this.f65223r = bVar3;
        this.f65224s = aVar2;
        this.f65225t = looper;
        this.f65226u = interfaceC2360n;
        this.f65227v = interfaceC4143j;
        this.f65231z = aVar3;
        this.f65200F = 0;
        this.f65228w = interfaceC4143j.d(looper, null);
        this.f65229x = new d(this, null);
        this.f65230y = new C6429x0.b();
    }

    public interface e {
        void b(C6407m c6407m, C6429x0 c6429x0);

        void c(C6407m c6407m, C6429x0 c6429x0, C6427w0 c6427w0);

        default void a(C6407m c6407m, V0 v02, V0 v03) {
        }
    }
}
