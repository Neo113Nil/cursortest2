package androidx.media3.effect;

import android.content.Context;
import android.graphics.Bitmap;
import android.opengl.EGLContext;
import android.opengl.EGLDisplay;
import android.os.Build;
import android.util.Pair;
import android.view.Surface;
import androidx.media3.effect.DefaultVideoFrameProcessor;
import androidx.media3.effect.g;
import androidx.media3.effect.j;
import androidx.media3.effect.r;
import b1.AbstractC2332A;
import b1.C2345N;
import b1.C2357k;
import b1.C2366u;
import b1.InterfaceC2336E;
import b1.InterfaceC2360n;
import b1.InterfaceC2362p;
import b1.InterfaceC2367v;
import b1.V;
import b1.W;
import com.google.common.collect.AbstractC3445z;
import com.google.common.collect.I;
import e1.AbstractC4134a;
import e1.AbstractC4151s;
import e1.AbstractC4156x;
import e1.C4146m;
import e1.S;
import e1.Z;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.Callable;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import l1.AbstractC5366l;
import l1.C;
import l1.C5368m;
import l1.C5376q;
import l1.C5381t;
import l1.InterfaceC5390x0;
import l1.InterfaceC5392y0;

/* loaded from: classes.dex */
public final class DefaultVideoFrameProcessor implements W {

    /* renamed from: b, reason: collision with root package name */
    public final Context f20595b;

    /* renamed from: c, reason: collision with root package name */
    public final InterfaceC2367v f20596c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f20597d;

    /* renamed from: e, reason: collision with root package name */
    public final EGLDisplay f20598e;

    /* renamed from: f, reason: collision with root package name */
    public final k f20599f;

    /* renamed from: g, reason: collision with root package name */
    public final r f20600g;

    /* renamed from: h, reason: collision with root package name */
    public final W.c f20601h;

    /* renamed from: i, reason: collision with root package name */
    public final Executor f20602i;

    /* renamed from: j, reason: collision with root package name */
    public final boolean f20603j;

    /* renamed from: k, reason: collision with root package name */
    public final g f20604k;

    /* renamed from: m, reason: collision with root package name */
    public final C4146m f20606m;

    /* renamed from: n, reason: collision with root package name */
    public b f20607n;

    /* renamed from: o, reason: collision with root package name */
    public b f20608o;

    /* renamed from: p, reason: collision with root package name */
    public boolean f20609p;

    /* renamed from: q, reason: collision with root package name */
    public Runnable f20610q;

    /* renamed from: t, reason: collision with root package name */
    public final C2357k f20613t;

    /* renamed from: u, reason: collision with root package name */
    public final InterfaceC2360n f20614u;

    /* renamed from: v, reason: collision with root package name */
    public final m f20615v;

    /* renamed from: w, reason: collision with root package name */
    public volatile C2366u f20616w;

    /* renamed from: x, reason: collision with root package name */
    public volatile boolean f20617x;

    /* renamed from: y, reason: collision with root package name */
    public volatile boolean f20618y;

    /* renamed from: r, reason: collision with root package name */
    public final List f20611r = new ArrayList();

    /* renamed from: s, reason: collision with root package name */
    public final Object f20612s = new Object();

    /* renamed from: l, reason: collision with root package name */
    public final List f20605l = new ArrayList();

    public static final class Factory implements W.b {

        /* renamed from: a, reason: collision with root package name */
        public final int f20619a;

        /* renamed from: b, reason: collision with root package name */
        public final boolean f20620b;

        /* renamed from: c, reason: collision with root package name */
        public final InterfaceC2367v f20621c;

        /* renamed from: d, reason: collision with root package name */
        public final ExecutorService f20622d;

        /* renamed from: e, reason: collision with root package name */
        public final j.a f20623e;

        /* renamed from: f, reason: collision with root package name */
        public final int f20624f;

        /* renamed from: g, reason: collision with root package name */
        public final boolean f20625g;

        /* renamed from: h, reason: collision with root package name */
        public final boolean f20626h;

        /* renamed from: i, reason: collision with root package name */
        public final boolean f20627i;

        public static final class Builder {

            /* renamed from: a, reason: collision with root package name */
            public int f20628a;

            /* renamed from: b, reason: collision with root package name */
            public ExecutorService f20629b;

            /* renamed from: c, reason: collision with root package name */
            public InterfaceC2367v f20630c;

            /* renamed from: d, reason: collision with root package name */
            public j.a f20631d;

            /* renamed from: e, reason: collision with root package name */
            public int f20632e;

            /* renamed from: f, reason: collision with root package name */
            public boolean f20633f;

            /* renamed from: g, reason: collision with root package name */
            public boolean f20634g;

            /* renamed from: h, reason: collision with root package name */
            public boolean f20635h;

            /* renamed from: i, reason: collision with root package name */
            public boolean f20636i;

            public /* synthetic */ Builder(Factory factory, a aVar) {
                this(factory);
            }

            public Builder a(ExecutorService executorService) {
                this.f20629b = executorService;
                return this;
            }

            public Builder b(InterfaceC2367v interfaceC2367v) {
                this.f20630c = interfaceC2367v;
                return this;
            }

            public Factory build() {
                return new Factory(this.f20628a, !this.f20634g, this.f20630c, this.f20629b, this.f20631d, this.f20632e, this.f20633f, this.f20635h, this.f20636i, null);
            }

            public Builder c(j.a aVar, int i10) {
                this.f20631d = aVar;
                AbstractC4134a.a(i10 >= 1);
                this.f20632e = i10;
                return this;
            }

            public Builder setEnableReplayableCache(boolean z10) {
                this.f20633f = z10;
                return this;
            }

            public Builder() {
                this.f20628a = 0;
                this.f20634g = true;
                this.f20635h = true;
                this.f20636i = true;
            }

            public Builder(Factory factory) {
                this.f20628a = factory.f20619a;
                this.f20629b = factory.f20622d;
                this.f20630c = factory.f20621c;
                this.f20631d = factory.f20623e;
                this.f20632e = factory.f20624f;
                this.f20633f = factory.f20625g;
                this.f20634g = !factory.f20620b;
                this.f20635h = factory.f20626h;
                this.f20636i = factory.f20627i;
            }
        }

        public /* synthetic */ Factory(int i10, boolean z10, InterfaceC2367v interfaceC2367v, ExecutorService executorService, j.a aVar, int i11, boolean z11, boolean z12, boolean z13, a aVar2) {
            this(i10, z10, interfaceC2367v, executorService, aVar, i11, z11, z12, z13);
        }

        public Builder l() {
            return new Builder(this, null);
        }

        @Override // b1.W.b
        /* renamed from: m, reason: merged with bridge method [inline-methods] */
        public DefaultVideoFrameProcessor a(final Context context, final InterfaceC2360n interfaceC2360n, final C2357k c2357k, final boolean z10, final Executor executor, final W.c cVar) {
            ExecutorService executorService = this.f20622d;
            if (executorService == null) {
                executorService = Z.b1("Effect:DefaultVideoFrameProcessor:GlThread");
            }
            ExecutorService executorService2 = executorService;
            boolean z11 = this.f20622d == null;
            Objects.requireNonNull(cVar);
            final r rVar = new r(executorService2, z11, new r.a() { // from class: l1.O
                @Override // androidx.media3.effect.r.a
                public final void a(b1.V v10) {
                    W.c.this.a(v10);
                }
            });
            InterfaceC2367v interfaceC2367v = this.f20621c;
            final boolean z12 = interfaceC2367v == null || this.f20622d == null;
            if (interfaceC2367v == null) {
                interfaceC2367v = new C5376q();
            }
            final InterfaceC2367v interfaceC2367v2 = interfaceC2367v;
            try {
                return (DefaultVideoFrameProcessor) executorService2.submit(new Callable() { // from class: l1.P
                    @Override // java.util.concurrent.Callable
                    public final Object call() {
                        DefaultVideoFrameProcessor F10;
                        F10 = DefaultVideoFrameProcessor.F(context, interfaceC2360n, c2357k, r0.f20619a, z10, rVar, executor, cVar, interfaceC2367v2, z12, r0.f20625g, r0.f20623e, r0.f20624f, r0.f20620b, r0.f20626h, DefaultVideoFrameProcessor.Factory.this.f20627i);
                        return F10;
                    }
                }).get();
            } catch (InterruptedException e10) {
                Thread.currentThread().interrupt();
                throw new V(e10);
            } catch (ExecutionException e11) {
                throw new V(e11);
            }
        }

        public Factory(int i10, boolean z10, InterfaceC2367v interfaceC2367v, ExecutorService executorService, j.a aVar, int i11, boolean z11, boolean z12, boolean z13) {
            this.f20619a = i10;
            this.f20620b = z10;
            this.f20621c = interfaceC2367v;
            this.f20622d = executorService;
            this.f20623e = aVar;
            this.f20624f = i11;
            this.f20625g = z11;
            this.f20626h = z12;
            this.f20627i = z13;
        }
    }

    public class a implements g.b {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Executor f20637a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ W.c f20638b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ r f20639c;

        /* renamed from: d, reason: collision with root package name */
        public final /* synthetic */ m f20640d;

        public a(Executor executor, W.c cVar, r rVar, m mVar) {
            this.f20637a = executor;
            this.f20638b = cVar;
            this.f20639c = rVar;
            this.f20640d = mVar;
        }

        @Override // androidx.media3.effect.g.b
        public void a() {
            if (!DefaultVideoFrameProcessor.this.f20617x) {
                r rVar = this.f20639c;
                final DefaultVideoFrameProcessor defaultVideoFrameProcessor = DefaultVideoFrameProcessor.this;
                rVar.j(new r.b() { // from class: l1.N
                    @Override // androidx.media3.effect.r.b
                    public final void run() {
                        DefaultVideoFrameProcessor.this.B();
                    }
                });
            } else {
                Executor executor = this.f20637a;
                final W.c cVar = this.f20638b;
                Objects.requireNonNull(cVar);
                executor.execute(new Runnable() { // from class: l1.M
                    @Override // java.lang.Runnable
                    public final void run() {
                        W.c.this.c();
                    }
                });
                AbstractC5366l.e("VideoFrameProcessor", "SignalEnded", Long.MIN_VALUE);
            }
        }

        @Override // androidx.media3.effect.g.b
        public void b(long j10) {
            m mVar = this.f20640d;
            if (mVar == null) {
                return;
            }
            mVar.r(j10);
        }
    }

    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        public final int f20642a;

        /* renamed from: b, reason: collision with root package name */
        public final androidx.media3.common.a f20643b;

        /* renamed from: c, reason: collision with root package name */
        public final List f20644c;

        /* renamed from: d, reason: collision with root package name */
        public final long f20645d;

        public b(int i10, androidx.media3.common.a aVar, List list, long j10) {
            this.f20642a = i10;
            this.f20643b = aVar;
            this.f20644c = list;
            this.f20645d = j10;
        }
    }

    static {
        AbstractC2332A.a("media3.effect");
    }

    public DefaultVideoFrameProcessor(Context context, InterfaceC2367v interfaceC2367v, boolean z10, EGLDisplay eGLDisplay, k kVar, r rVar, W.c cVar, Executor executor, g gVar, boolean z11, C2357k c2357k, InterfaceC2360n interfaceC2360n, m mVar) {
        this.f20595b = context;
        this.f20596c = interfaceC2367v;
        this.f20597d = z10;
        this.f20598e = eGLDisplay;
        this.f20599f = kVar;
        this.f20600g = rVar;
        this.f20601h = cVar;
        this.f20602i = executor;
        this.f20603j = z11;
        this.f20613t = c2357k;
        this.f20615v = mVar;
        this.f20614u = interfaceC2360n;
        this.f20604k = gVar;
        C4146m c4146m = new C4146m();
        this.f20606m = c4146m;
        c4146m.f();
        gVar.H(new a(executor, cVar, rVar, mVar));
    }

    public static Pair C(InterfaceC2367v interfaceC2367v, EGLDisplay eGLDisplay, int i10, int[] iArr) {
        EGLContext d10 = interfaceC2367v.d(eGLDisplay, i10, iArr);
        return Pair.create(d10, interfaceC2367v.c(d10, eGLDisplay));
    }

    public static Pair D(InterfaceC2367v interfaceC2367v, EGLDisplay eGLDisplay, int[] iArr) {
        try {
            return C(interfaceC2367v, eGLDisplay, 3, iArr);
        } catch (AbstractC4151s.a unused) {
            return C(interfaceC2367v, eGLDisplay, 2, iArr);
        }
    }

    public static AbstractC3445z E(Context context, List list, C2357k c2357k, g gVar) {
        AbstractC3445z.a aVar = new AbstractC3445z.a();
        AbstractC3445z.a aVar2 = new AbstractC3445z.a();
        AbstractC3445z.a aVar3 = new AbstractC3445z.a();
        for (int i10 = 0; i10 < list.size(); i10++) {
            InterfaceC2362p interfaceC2362p = (InterfaceC2362p) list.get(i10);
            AbstractC4134a.b(interfaceC2362p instanceof InterfaceC5390x0, "DefaultVideoFrameProcessor only supports GlEffects");
            InterfaceC5390x0 interfaceC5390x0 = (InterfaceC5390x0) interfaceC2362p;
            if (interfaceC5390x0 instanceof InterfaceC5392y0) {
                aVar2.a((InterfaceC5392y0) interfaceC5390x0);
            } else {
                boolean i11 = C2357k.i(c2357k);
                AbstractC3445z m10 = aVar2.m();
                AbstractC3445z m11 = aVar3.m();
                if (!m10.isEmpty() || !m11.isEmpty()) {
                    aVar.a(C5381t.q(context, m10, m11, i11));
                    aVar2 = new AbstractC3445z.a();
                    aVar3 = new AbstractC3445z.a();
                }
                aVar.a(interfaceC5390x0.a(context, i11));
            }
        }
        gVar.I(aVar2.m(), aVar3.m());
        return aVar.m();
    }

    /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
        java.lang.NullPointerException
        */
    public static androidx.media3.effect.DefaultVideoFrameProcessor F(android.content.Context r25, b1.InterfaceC2360n r26, b1.C2357k r27, int r28, boolean r29, androidx.media3.effect.r r30, java.util.concurrent.Executor r31, b1.W.c r32, b1.InterfaceC2367v r33, boolean r34, boolean r35, androidx.media3.effect.j.a r36, int r37, boolean r38, boolean r39, boolean r40) {
        /*
            android.opengl.EGLDisplay r2 = e1.AbstractC4151s.I()
            boolean r13 = b1.C2357k.i(r27)
            if (r13 == 0) goto Lf
            int[] r0 = e1.AbstractC4151s.EGL_CONFIG_ATTRIBUTES_RGBA_1010102
        Lc:
            r1 = r33
            goto L12
        Lf:
            int[] r0 = e1.AbstractC4151s.EGL_CONFIG_ATTRIBUTES_RGBA_8888
            goto Lc
        L12:
            android.util.Pair r0 = D(r1, r2, r0)
            b1.k$b r3 = r27.a()
            r4 = 1
            b1.k$b r3 = r3.e(r4)
            r4 = 0
            b1.k$b r3 = r3.f(r4)
            b1.k r3 = r3.a()
            if (r13 == 0) goto L2d
            r11 = r28
            goto L32
        L2d:
            r5 = 2
            r11 = r28
            if (r11 != r5) goto L35
        L32:
            r16 = r3
            goto L37
        L35:
            r16 = r27
        L37:
            androidx.media3.effect.k r5 = new androidx.media3.effect.k
            java.util.Objects.requireNonNull(r32)
            l1.C r3 = new l1.C
            r7 = r32
            r3.<init>(r7)
            r15 = r25
            r18 = r30
            r19 = r31
            r22 = r38
            r23 = r39
            r24 = r40
            r17 = r1
            r20 = r3
            r14 = r5
            r21 = r11
            r14.<init>(r15, r16, r17, r18, r19, r20, r21, r22, r23, r24)
            androidx.media3.effect.g r9 = new androidx.media3.effect.g
            java.lang.Object r1 = r0.first
            r3 = r1
            android.opengl.EGLContext r3 = (android.opengl.EGLContext) r3
            java.lang.Object r0 = r0.second
            android.opengl.EGLSurface r0 = (android.opengl.EGLSurface) r0
            r1 = r25
            r5 = r27
            r11 = r28
            r12 = r29
            r6 = r30
            r10 = r37
            r15 = r4
            r8 = r7
            r7 = r31
            r4 = r0
            r0 = r9
            r9 = r36
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12)
            androidx.media3.effect.DefaultVideoFrameProcessor r1 = new androidx.media3.effect.DefaultVideoFrameProcessor
            if (r35 == 0) goto L9d
            androidx.media3.effect.m r4 = new androidx.media3.effect.m
            r3 = r25
            r4.<init>(r3, r13)
            r9 = r0
            r0 = r1
            r1 = r3
            r13 = r4
            r12 = r26
            r11 = r27
            r10 = r29
            r6 = r30
            r8 = r31
            r7 = r32
            r5 = r14
            r3 = r34
            r4 = r2
        L9a:
            r2 = r33
            goto Lb3
        L9d:
            r9 = r0
            r0 = r1
            r13 = r15
            r1 = r25
            r12 = r26
            r11 = r27
            r10 = r29
            r6 = r30
            r8 = r31
            r7 = r32
            r3 = r34
            r4 = r2
            r5 = r14
            goto L9a
        Lb3:
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.media3.effect.DefaultVideoFrameProcessor.F(android.content.Context, b1.n, b1.k, int, boolean, androidx.media3.effect.r, java.util.concurrent.Executor, b1.W$c, b1.v, boolean, boolean, androidx.media3.effect.j$a, int, boolean, boolean, boolean):androidx.media3.effect.DefaultVideoFrameProcessor");
    }

    public static String G(int i10) {
        if (i10 == 1) {
            return "Surface";
        }
        if (i10 == 2) {
            return "Bitmap";
        }
        if (i10 == 3) {
            return "Texture ID";
        }
        if (i10 == 4) {
            return "Surface with automatic frame registration";
        }
        throw new IllegalArgumentException(String.valueOf(i10));
    }

    public static boolean H(C2357k c2357k, C2357k c2357k2) {
        if (c2357k.f24604a != 6 || c2357k2.f24604a == 6 || !C2357k.i(c2357k)) {
            return false;
        }
        int i10 = c2357k2.f24606c;
        return i10 == 10 || i10 == 3;
    }

    public static boolean I(C2357k c2357k, C2357k c2357k2) {
        return c2357k.equals(C2357k.f24597h) && c2357k2.f24604a == 6 && C2357k.i(c2357k2);
    }

    public static /* synthetic */ void p(DefaultVideoFrameProcessor defaultVideoFrameProcessor) {
        defaultVideoFrameProcessor.f20604k.B(((m) Z.i(defaultVideoFrameProcessor.f20615v)).p());
        defaultVideoFrameProcessor.f20615v.s();
    }

    public static void y(InterfaceC2367v interfaceC2367v, List list, g gVar, r rVar, W.c cVar, Executor executor) {
        ArrayList arrayList = new ArrayList(list);
        arrayList.add(gVar);
        int i10 = 0;
        while (i10 < arrayList.size() - 1) {
            i iVar = (i) arrayList.get(i10);
            i10++;
            i iVar2 = (i) arrayList.get(i10);
            c cVar2 = new c(interfaceC2367v, iVar, iVar2, rVar);
            iVar.l(cVar2);
            Objects.requireNonNull(cVar);
            iVar.f(executor, new C(cVar));
            iVar2.n(cVar2);
        }
    }

    public static void z(C2357k c2357k, C2357k c2357k2) {
        if (C2357k.i(c2357k)) {
            AbstractC4134a.a(c2357k.f24604a == 6);
        }
        if (C2357k.i(c2357k) || C2357k.i(c2357k2)) {
            try {
                if (AbstractC4151s.G() != 3) {
                    throw new V("OpenGL ES 3.0 context support is required for HDR input or output.");
                }
            } catch (AbstractC4151s.a e10) {
                throw V.a(e10);
            }
        }
        AbstractC4134a.a(c2357k.g());
        AbstractC4134a.a(c2357k.f24606c != 1);
        AbstractC4134a.a(c2357k2.g());
        AbstractC4134a.a(c2357k2.f24606c != 1);
        if (C2357k.i(c2357k) != C2357k.i(c2357k2)) {
            AbstractC4134a.a(H(c2357k, c2357k2) || I(c2357k, c2357k2));
        }
    }

    public final void A(final b bVar, boolean z10) {
        z((C2357k) AbstractC4134a.e(bVar.f20643b.f20516D), this.f20613t);
        if (z10 || !this.f20611r.equals(bVar.f20644c)) {
            if (!this.f20605l.isEmpty()) {
                for (int i10 = this.f20615v == null ? 0 : 1; i10 < this.f20605l.size(); i10++) {
                    ((i) this.f20605l.get(i10)).release();
                }
                this.f20605l.clear();
            }
            m mVar = this.f20615v;
            if (mVar != null) {
                this.f20605l.add(mVar);
            }
            AbstractC3445z.a k10 = new AbstractC3445z.a().k(bVar.f20644c);
            InterfaceC2360n interfaceC2360n = this.f20614u;
            if (interfaceC2360n != InterfaceC2360n.f24615a) {
                k10.a(new C5368m(interfaceC2360n, this.f20613t));
            }
            this.f20605l.addAll(E(this.f20595b, k10.m(), this.f20613t, this.f20604k));
            this.f20599f.f((i) I.e(this.f20605l, this.f20604k));
            y(this.f20596c, this.f20605l, this.f20604k, this.f20600g, this.f20601h, this.f20602i);
            this.f20611r.clear();
            this.f20611r.addAll(bVar.f20644c);
        }
        this.f20599f.i(bVar.f20642a, new C2366u(bVar.f20643b, bVar.f20645d));
        this.f20606m.f();
        synchronized (this.f20612s) {
            try {
                Runnable runnable = this.f20610q;
                if (runnable != null) {
                    runnable.run();
                    this.f20610q = null;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        this.f20602i.execute(new Runnable() { // from class: l1.L
            @Override // java.lang.Runnable
            public final void run() {
                DefaultVideoFrameProcessor.this.f20601h.f(r1.f20642a, r1.f20643b, bVar.f20644c);
            }
        });
        b bVar2 = this.f20607n;
        if (bVar2 == null || bVar.f20643b.f20554z != bVar2.f20643b.f20554z) {
            this.f20602i.execute(new Runnable() { // from class: l1.B
                @Override // java.lang.Runnable
                public final void run() {
                    DefaultVideoFrameProcessor.this.f20601h.e(bVar.f20643b.f20554z);
                }
            });
        }
        this.f20607n = bVar;
    }

    public final void B() {
        b bVar;
        this.f20600g.m();
        synchronized (this.f20612s) {
            try {
                bVar = this.f20608o;
                if (bVar != null) {
                    this.f20608o = null;
                } else {
                    bVar = null;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        if (bVar != null) {
            A(bVar, false);
        }
    }

    public final void J() {
        try {
            try {
                this.f20599f.e();
                for (int i10 = 0; i10 < this.f20605l.size(); i10++) {
                    ((i) this.f20605l.get(i10)).release();
                }
                this.f20604k.release();
            } catch (Exception e10) {
                AbstractC4156x.e("DefaultFrameProcessor", "Error releasing shader program", e10);
            }
            if (this.f20597d) {
                try {
                    this.f20596c.e(this.f20598e);
                } catch (AbstractC4151s.a e11) {
                    AbstractC4156x.e("DefaultFrameProcessor", "Error releasing GL objects", e11);
                }
            }
        } catch (Throwable th2) {
            if (this.f20597d) {
                try {
                    this.f20596c.e(this.f20598e);
                } catch (AbstractC4151s.a e12) {
                    AbstractC4156x.e("DefaultFrameProcessor", "Error releasing GL objects", e12);
                }
            }
            throw th2;
        }
    }

    @Override // b1.W
    public void a(final long j10) {
        AbstractC4134a.h(!this.f20603j, "Calling this method is not allowed when renderFramesAutomatically is enabled");
        this.f20600g.l(new r.b() { // from class: l1.I
            @Override // androidx.media3.effect.r.b
            public final void run() {
                r0.f20604k.G(DefaultVideoFrameProcessor.this.f20596c, j10);
            }
        });
    }

    @Override // b1.W
    public boolean b(Bitmap bitmap, S s10) {
        boolean hasGainmap;
        AbstractC4134a.g(!this.f20617x);
        boolean z10 = false;
        if (!this.f20606m.e() || this.f20618y) {
            return false;
        }
        if (C2357k.i(this.f20613t)) {
            if (Build.VERSION.SDK_INT >= 34) {
                hasGainmap = bitmap.hasGainmap();
                if (hasGainmap) {
                    z10 = true;
                }
            }
            AbstractC4134a.b(z10, "VideoFrameProcessor configured for HDR output, but either received SDR input, or is on an API level that doesn't support gainmaps. SDR to HDR tonemapping is not supported.");
        }
        this.f20599f.a().h(bitmap, (C2366u) AbstractC4134a.e(this.f20616w), s10);
        return true;
    }

    @Override // b1.W
    public void c(C2345N c2345n) {
        this.f20604k.J(c2345n);
    }

    @Override // b1.W
    public Surface d() {
        return this.f20599f.c();
    }

    @Override // b1.W
    public void e() {
        m mVar = this.f20615v;
        if (mVar == null) {
            throw new UnsupportedOperationException("Replaying when enableReplayableCache is set to false");
        }
        if (mVar.q()) {
            return;
        }
        this.f20600g.j(new r.b() { // from class: l1.K
            @Override // androidx.media3.effect.r.b
            public final void run() {
                DefaultVideoFrameProcessor.p(DefaultVideoFrameProcessor.this);
            }
        });
    }

    @Override // b1.W
    public void f() {
        AbstractC5366l.e("VideoFrameProcessor", "ReceiveEndOfAllInput", Long.MIN_VALUE);
        AbstractC4134a.g(!this.f20617x);
        this.f20617x = true;
        if (this.f20618y) {
            return;
        }
        this.f20599f.h();
    }

    @Override // b1.W
    public void flush() {
        if (this.f20599f.d()) {
            this.f20617x = false;
            try {
                p a10 = this.f20599f.a();
                a10.c();
                this.f20600g.e();
                a10.l();
                final CountDownLatch countDownLatch = new CountDownLatch(1);
                a10.n(new r.b() { // from class: l1.E
                    @Override // androidx.media3.effect.r.b
                    public final void run() {
                        countDownLatch.countDown();
                    }
                });
                r rVar = this.f20600g;
                final g gVar = this.f20604k;
                Objects.requireNonNull(gVar);
                rVar.j(new r.b() { // from class: l1.F
                    @Override // androidx.media3.effect.r.b
                    public final void run() {
                        androidx.media3.effect.g.this.flush();
                    }
                });
                countDownLatch.await();
                a10.n(null);
                this.f20600g.g(new r.b() { // from class: l1.G
                    @Override // androidx.media3.effect.r.b
                    public final void run() {
                        DefaultVideoFrameProcessor.this.B();
                    }
                });
            } catch (InterruptedException e10) {
                Thread.currentThread().interrupt();
                this.f20602i.execute(new Runnable() { // from class: l1.H
                    @Override // java.lang.Runnable
                    public final void run() {
                        DefaultVideoFrameProcessor.this.f20601h.a(new b1.V(e10));
                    }
                });
            }
        }
    }

    @Override // b1.W
    public boolean g(int i10, long j10) {
        AbstractC4134a.g(!this.f20617x);
        if (!this.f20606m.e() || this.f20618y) {
            return false;
        }
        this.f20599f.a().i(i10, j10);
        return true;
    }

    @Override // b1.W
    public void h(InterfaceC2336E interfaceC2336E) {
        this.f20599f.g(interfaceC2336E);
    }

    @Override // b1.W
    public void i(int i10, androidx.media3.common.a aVar, List list, long j10) {
        if (this.f20618y) {
            return;
        }
        AbstractC5366l.f("VideoFrameProcessor", "RegisterNewInputStream", j10, "InputType %s - %dx%d", G(i10), Integer.valueOf(aVar.f20550v), Integer.valueOf(aVar.f20551w));
        this.f20616w = new C2366u(x(aVar), j10);
        try {
            this.f20606m.a();
        } catch (InterruptedException e10) {
            Thread.currentThread().interrupt();
            this.f20602i.execute(new Runnable() { // from class: l1.A
                @Override // java.lang.Runnable
                public final void run() {
                    DefaultVideoFrameProcessor.this.f20601h.a(b1.V.a(e10));
                }
            });
        }
        synchronized (this.f20612s) {
            try {
                final b bVar = new b(i10, aVar, list, j10);
                if (this.f20609p) {
                    this.f20608o = bVar;
                    this.f20606m.d();
                    this.f20599f.h();
                } else {
                    this.f20609p = true;
                    this.f20606m.d();
                    this.f20600g.j(new r.b() { // from class: l1.D
                        @Override // androidx.media3.effect.r.b
                        public final void run() {
                            DefaultVideoFrameProcessor.this.A(bVar, true);
                        }
                    });
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // b1.W
    public boolean j() {
        AbstractC4134a.g(!this.f20617x);
        AbstractC4134a.j(this.f20616w, "registerInputStream must be called before registering input frames");
        if (!this.f20606m.e() || this.f20618y) {
            return false;
        }
        this.f20599f.a().j(this.f20616w);
        return true;
    }

    @Override // b1.W
    public int k() {
        if (this.f20599f.d()) {
            return this.f20599f.a().g();
        }
        return 0;
    }

    @Override // b1.W
    public void release() {
        this.f20618y = true;
        try {
            this.f20600g.i(new r.b() { // from class: l1.J
                @Override // androidx.media3.effect.r.b
                public final void run() {
                    DefaultVideoFrameProcessor.this.J();
                }
            });
        } catch (InterruptedException e10) {
            Thread.currentThread().interrupt();
            throw new IllegalStateException(e10);
        }
    }

    public final androidx.media3.common.a x(androidx.media3.common.a aVar) {
        float f10 = aVar.f20514B;
        return f10 > 1.0f ? aVar.b().F0((int) (aVar.f20550v * aVar.f20514B)).u0(1.0f).P() : f10 < 1.0f ? aVar.b().h0((int) (aVar.f20551w / aVar.f20514B)).u0(1.0f).P() : aVar;
    }
}
