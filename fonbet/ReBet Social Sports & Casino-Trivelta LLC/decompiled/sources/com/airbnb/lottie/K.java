package com.airbnb.lottie;

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Executor;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.Semaphore;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public class K extends Drawable implements Drawable.Callback, Animatable {

    /* renamed from: Z, reason: collision with root package name */
    public static final boolean f28350Z;

    /* renamed from: b1, reason: collision with root package name */
    public static final List f28351b1;

    /* renamed from: g1, reason: collision with root package name */
    public static final Executor f28352g1;

    /* renamed from: A, reason: collision with root package name */
    public final Matrix f28353A;

    /* renamed from: B, reason: collision with root package name */
    public Bitmap f28354B;

    /* renamed from: C, reason: collision with root package name */
    public Canvas f28355C;

    /* renamed from: D, reason: collision with root package name */
    public Rect f28356D;

    /* renamed from: E, reason: collision with root package name */
    public RectF f28357E;

    /* renamed from: F, reason: collision with root package name */
    public Paint f28358F;

    /* renamed from: G, reason: collision with root package name */
    public Rect f28359G;

    /* renamed from: H, reason: collision with root package name */
    public Rect f28360H;

    /* renamed from: I, reason: collision with root package name */
    public RectF f28361I;

    /* renamed from: J, reason: collision with root package name */
    public RectF f28362J;

    /* renamed from: K, reason: collision with root package name */
    public Matrix f28363K;

    /* renamed from: L, reason: collision with root package name */
    public Matrix f28364L;

    /* renamed from: O, reason: collision with root package name */
    public boolean f28365O;

    /* renamed from: P, reason: collision with root package name */
    public EnumC2931a f28366P;

    /* renamed from: R, reason: collision with root package name */
    public final ValueAnimator.AnimatorUpdateListener f28367R;

    /* renamed from: T, reason: collision with root package name */
    public final Semaphore f28368T;

    /* renamed from: V, reason: collision with root package name */
    public Handler f28369V;

    /* renamed from: W, reason: collision with root package name */
    public Runnable f28370W;

    /* renamed from: X, reason: collision with root package name */
    public final Runnable f28371X;

    /* renamed from: Y, reason: collision with root package name */
    public float f28372Y;

    /* renamed from: a, reason: collision with root package name */
    public C2940j f28373a;

    /* renamed from: b, reason: collision with root package name */
    public final com.airbnb.lottie.utils.j f28374b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f28375c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f28376d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f28377e;

    /* renamed from: f, reason: collision with root package name */
    public b f28378f;

    /* renamed from: g, reason: collision with root package name */
    public final ArrayList f28379g;

    /* renamed from: h, reason: collision with root package name */
    public D3.b f28380h;

    /* renamed from: i, reason: collision with root package name */
    public String f28381i;

    /* renamed from: j, reason: collision with root package name */
    public D3.a f28382j;

    /* renamed from: k, reason: collision with root package name */
    public Map f28383k;

    /* renamed from: l, reason: collision with root package name */
    public String f28384l;

    /* renamed from: m, reason: collision with root package name */
    public AbstractC2932b f28385m;

    /* renamed from: n, reason: collision with root package name */
    public b0 f28386n;

    /* renamed from: o, reason: collision with root package name */
    public final M f28387o;

    /* renamed from: p, reason: collision with root package name */
    public boolean f28388p;

    /* renamed from: q, reason: collision with root package name */
    public boolean f28389q;

    /* renamed from: r, reason: collision with root package name */
    public com.airbnb.lottie.model.layer.c f28390r;

    /* renamed from: s, reason: collision with root package name */
    public int f28391s;
    private float[] softwareRenderingOriginalCanvasMatrixElements;

    /* renamed from: t, reason: collision with root package name */
    public boolean f28392t;

    /* renamed from: u, reason: collision with root package name */
    public boolean f28393u;

    /* renamed from: v, reason: collision with root package name */
    public boolean f28394v;

    /* renamed from: w, reason: collision with root package name */
    public boolean f28395w;

    /* renamed from: x, reason: collision with root package name */
    public boolean f28396x;

    /* renamed from: y, reason: collision with root package name */
    public Z f28397y;

    /* renamed from: z, reason: collision with root package name */
    public boolean f28398z;

    public interface a {
        void a(C2940j c2940j);
    }

    public enum b {
        NONE,
        PLAY,
        RESUME
    }

    static {
        f28350Z = Build.VERSION.SDK_INT <= 25;
        f28351b1 = Arrays.asList("reduced motion", "reduced_motion", "reduced-motion", "reducedmotion");
        f28352g1 = new ThreadPoolExecutor(0, 2, 35L, TimeUnit.MILLISECONDS, new LinkedBlockingQueue(), new com.airbnb.lottie.utils.h());
    }

    public K() {
        com.airbnb.lottie.utils.j jVar = new com.airbnb.lottie.utils.j();
        this.f28374b = jVar;
        this.f28375c = true;
        this.f28376d = false;
        this.f28377e = false;
        this.f28378f = b.NONE;
        this.f28379g = new ArrayList();
        this.f28387o = new M();
        this.f28388p = false;
        this.f28389q = true;
        this.f28391s = 255;
        this.f28396x = false;
        this.f28397y = Z.AUTOMATIC;
        this.f28398z = false;
        this.f28353A = new Matrix();
        this.softwareRenderingOriginalCanvasMatrixElements = new float[9];
        this.f28365O = false;
        ValueAnimator.AnimatorUpdateListener animatorUpdateListener = new ValueAnimator.AnimatorUpdateListener() { // from class: com.airbnb.lottie.E
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                K.g(K.this, valueAnimator);
            }
        };
        this.f28367R = animatorUpdateListener;
        this.f28368T = new Semaphore(1);
        this.f28371X = new Runnable() { // from class: com.airbnb.lottie.F
            @Override // java.lang.Runnable
            public final void run() {
                K.k(K.this);
            }
        };
        this.f28372Y = -3.4028235E38f;
        jVar.addUpdateListener(animatorUpdateListener);
    }

    public static /* synthetic */ void g(K k10, ValueAnimator valueAnimator) {
        if (k10.F()) {
            k10.invalidateSelf();
            return;
        }
        com.airbnb.lottie.model.layer.c cVar = k10.f28390r;
        if (cVar != null) {
            cVar.N(k10.f28374b.k());
        }
    }

    public static boolean i0(float f10) {
        return (Float.isNaN(f10) || Float.isInfinite(f10)) ? false : true;
    }

    public static boolean j0(RectF rectF) {
        return i0(rectF.left) && i0(rectF.top) && i0(rectF.right) && i0(rectF.bottom);
    }

    public static /* synthetic */ void k(final K k10) {
        com.airbnb.lottie.model.layer.c cVar = k10.f28390r;
        if (cVar == null) {
            return;
        }
        try {
            k10.f28368T.acquire();
            cVar.N(k10.f28374b.k());
            if (f28350Z && k10.f28365O) {
                if (k10.f28369V == null) {
                    k10.f28369V = new Handler(Looper.getMainLooper());
                    k10.f28370W = new Runnable() { // from class: com.airbnb.lottie.A
                        @Override // java.lang.Runnable
                        public final void run() {
                            K.n(K.this);
                        }
                    };
                }
                k10.f28369V.post(k10.f28370W);
            }
        } catch (InterruptedException unused) {
        } catch (Throwable th2) {
            k10.f28368T.release();
            throw th2;
        }
        k10.f28368T.release();
    }

    public static /* synthetic */ void n(K k10) {
        Drawable.Callback callback = k10.getCallback();
        if (callback != null) {
            callback.invalidateDrawable(k10);
        }
    }

    public void A(L l10, boolean z10) {
        boolean a10 = this.f28387o.a(l10, z10);
        if (this.f28373a == null || !a10) {
            return;
        }
        t();
    }

    public void A0(final int i10) {
        if (this.f28373a == null) {
            this.f28379g.add(new a() { // from class: com.airbnb.lottie.J
                @Override // com.airbnb.lottie.K.a
                public final void a(C2940j c2940j) {
                    K.this.A0(i10);
                }
            });
        } else {
            this.f28374b.z(i10);
        }
    }

    public void B() {
        this.f28379g.clear();
        this.f28374b.j();
        if (isVisible()) {
            return;
        }
        this.f28378f = b.NONE;
    }

    public void B0(boolean z10) {
        this.f28376d = z10;
    }

    public final void C(int i10, int i11) {
        Bitmap bitmap = this.f28354B;
        if (bitmap == null || bitmap.getWidth() < i10 || this.f28354B.getHeight() < i11) {
            Bitmap createBitmap = Bitmap.createBitmap(i10, i11, Bitmap.Config.ARGB_8888);
            this.f28354B = createBitmap;
            this.f28355C.setBitmap(createBitmap);
            this.f28365O = true;
            return;
        }
        if (this.f28354B.getWidth() > i10 || this.f28354B.getHeight() > i11) {
            Bitmap createBitmap2 = Bitmap.createBitmap(this.f28354B, 0, 0, i10, i11);
            this.f28354B = createBitmap2;
            this.f28355C.setBitmap(createBitmap2);
            this.f28365O = true;
        }
    }

    public void C0(InterfaceC2933c interfaceC2933c) {
        D3.b bVar = this.f28380h;
        if (bVar != null) {
            bVar.d(interfaceC2933c);
        }
    }

    public final void D() {
        if (this.f28355C != null) {
            return;
        }
        this.f28355C = new Canvas();
        this.f28362J = new RectF();
        this.f28363K = new Matrix();
        this.f28364L = new Matrix();
        this.f28356D = new Rect();
        this.f28357E = new RectF();
        this.f28358F = new A3.a();
        this.f28359G = new Rect();
        this.f28360H = new Rect();
        this.f28361I = new RectF();
    }

    public void D0(String str) {
        this.f28381i = str;
    }

    public EnumC2931a E() {
        EnumC2931a enumC2931a = this.f28366P;
        return enumC2931a != null ? enumC2931a : AbstractC2935e.d();
    }

    public void E0(boolean z10) {
        this.f28388p = z10;
    }

    public boolean F() {
        return E() == EnumC2931a.ENABLED;
    }

    public void F0(final int i10) {
        if (this.f28373a == null) {
            this.f28379g.add(new a() { // from class: com.airbnb.lottie.v
                @Override // com.airbnb.lottie.K.a
                public final void a(C2940j c2940j) {
                    K.this.F0(i10);
                }
            });
        } else {
            this.f28374b.A(i10 + 0.99f);
        }
    }

    public Bitmap G(String str) {
        D3.b N10 = N();
        if (N10 != null) {
            return N10.a(str);
        }
        return null;
    }

    public void G0(final String str) {
        C2940j c2940j = this.f28373a;
        if (c2940j == null) {
            this.f28379g.add(new a() { // from class: com.airbnb.lottie.C
                @Override // com.airbnb.lottie.K.a
                public final void a(C2940j c2940j2) {
                    K.this.G0(str);
                }
            });
            return;
        }
        E3.h l10 = c2940j.l(str);
        if (l10 != null) {
            F0((int) (l10.f2996b + l10.f2997c));
            return;
        }
        throw new IllegalArgumentException("Cannot find marker with name " + str + ".");
    }

    public boolean H() {
        return this.f28396x;
    }

    public void H0(final float f10) {
        C2940j c2940j = this.f28373a;
        if (c2940j == null) {
            this.f28379g.add(new a() { // from class: com.airbnb.lottie.y
                @Override // com.airbnb.lottie.K.a
                public final void a(C2940j c2940j2) {
                    K.this.H0(f10);
                }
            });
        } else {
            this.f28374b.A(com.airbnb.lottie.utils.l.i(c2940j.p(), this.f28373a.f(), f10));
        }
    }

    public boolean I() {
        return this.f28389q;
    }

    public void I0(final int i10, final int i11) {
        if (this.f28373a == null) {
            this.f28379g.add(new a() { // from class: com.airbnb.lottie.z
                @Override // com.airbnb.lottie.K.a
                public final void a(C2940j c2940j) {
                    K.this.I0(i10, i11);
                }
            });
        } else {
            this.f28374b.B(i10, i11 + 0.99f);
        }
    }

    public C2940j J() {
        return this.f28373a;
    }

    public void J0(final String str) {
        C2940j c2940j = this.f28373a;
        if (c2940j == null) {
            this.f28379g.add(new a() { // from class: com.airbnb.lottie.u
                @Override // com.airbnb.lottie.K.a
                public final void a(C2940j c2940j2) {
                    K.this.J0(str);
                }
            });
            return;
        }
        E3.h l10 = c2940j.l(str);
        if (l10 != null) {
            int i10 = (int) l10.f2996b;
            I0(i10, ((int) l10.f2997c) + i10);
        } else {
            throw new IllegalArgumentException("Cannot find marker with name " + str + ".");
        }
    }

    public final Context K() {
        Drawable.Callback callback = getCallback();
        if (callback != null && (callback instanceof View)) {
            return ((View) callback).getContext();
        }
        return null;
    }

    public void K0(final int i10) {
        if (this.f28373a == null) {
            this.f28379g.add(new a() { // from class: com.airbnb.lottie.w
                @Override // com.airbnb.lottie.K.a
                public final void a(C2940j c2940j) {
                    K.this.K0(i10);
                }
            });
        } else {
            this.f28374b.C(i10);
        }
    }

    public final D3.a L() {
        if (getCallback() == null) {
            return null;
        }
        if (this.f28382j == null) {
            D3.a aVar = new D3.a(getCallback(), this.f28385m);
            this.f28382j = aVar;
            String str = this.f28384l;
            if (str != null) {
                aVar.c(str);
            }
        }
        return this.f28382j;
    }

    public void L0(final String str) {
        C2940j c2940j = this.f28373a;
        if (c2940j == null) {
            this.f28379g.add(new a() { // from class: com.airbnb.lottie.D
                @Override // com.airbnb.lottie.K.a
                public final void a(C2940j c2940j2) {
                    K.this.L0(str);
                }
            });
            return;
        }
        E3.h l10 = c2940j.l(str);
        if (l10 != null) {
            K0((int) l10.f2996b);
            return;
        }
        throw new IllegalArgumentException("Cannot find marker with name " + str + ".");
    }

    public int M() {
        return (int) this.f28374b.l();
    }

    public void M0(final float f10) {
        C2940j c2940j = this.f28373a;
        if (c2940j == null) {
            this.f28379g.add(new a() { // from class: com.airbnb.lottie.H
                @Override // com.airbnb.lottie.K.a
                public final void a(C2940j c2940j2) {
                    K.this.M0(f10);
                }
            });
        } else {
            K0((int) com.airbnb.lottie.utils.l.i(c2940j.p(), this.f28373a.f(), f10));
        }
    }

    public final D3.b N() {
        D3.b bVar = this.f28380h;
        if (bVar != null && !bVar.b(K())) {
            this.f28380h = null;
        }
        if (this.f28380h == null) {
            this.f28380h = new D3.b(getCallback(), this.f28381i, null, this.f28373a.j());
        }
        return this.f28380h;
    }

    public void N0(boolean z10) {
        if (this.f28393u == z10) {
            return;
        }
        this.f28393u = z10;
        com.airbnb.lottie.model.layer.c cVar = this.f28390r;
        if (cVar != null) {
            cVar.L(z10);
        }
    }

    public String O() {
        return this.f28381i;
    }

    public void O0(boolean z10) {
        this.f28392t = z10;
        C2940j c2940j = this.f28373a;
        if (c2940j != null) {
            c2940j.v(z10);
        }
    }

    public N P(String str) {
        C2940j c2940j = this.f28373a;
        if (c2940j == null) {
            return null;
        }
        return (N) c2940j.j().get(str);
    }

    public void P0(final float f10) {
        if (this.f28373a == null) {
            this.f28379g.add(new a() { // from class: com.airbnb.lottie.I
                @Override // com.airbnb.lottie.K.a
                public final void a(C2940j c2940j) {
                    K.this.P0(f10);
                }
            });
            return;
        }
        if (AbstractC2935e.h()) {
            AbstractC2935e.b("Drawable#setProgress");
        }
        this.f28374b.z(this.f28373a.h(f10));
        if (AbstractC2935e.h()) {
            AbstractC2935e.c("Drawable#setProgress");
        }
    }

    public boolean Q() {
        return this.f28388p;
    }

    public void Q0(Z z10) {
        this.f28397y = z10;
        w();
    }

    public E3.h R() {
        Iterator it = f28351b1.iterator();
        E3.h hVar = null;
        while (it.hasNext()) {
            hVar = this.f28373a.l((String) it.next());
            if (hVar != null) {
                break;
            }
        }
        return hVar;
    }

    public void R0(int i10) {
        this.f28374b.setRepeatCount(i10);
    }

    public float S() {
        return this.f28374b.n();
    }

    public void S0(int i10) {
        this.f28374b.setRepeatMode(i10);
    }

    public float T() {
        return this.f28374b.o();
    }

    public void T0(boolean z10) {
        this.f28377e = z10;
    }

    public W U() {
        C2940j c2940j = this.f28373a;
        if (c2940j != null) {
            return c2940j.n();
        }
        return null;
    }

    public void U0(float f10) {
        this.f28374b.D(f10);
    }

    public float V() {
        return this.f28374b.k();
    }

    public void V0(b0 b0Var) {
        this.f28386n = b0Var;
    }

    public Z W() {
        return this.f28398z ? Z.SOFTWARE : Z.HARDWARE;
    }

    public void W0(boolean z10) {
        this.f28374b.E(z10);
    }

    public int X() {
        return this.f28374b.getRepeatCount();
    }

    public final boolean X0() {
        C2940j c2940j = this.f28373a;
        if (c2940j == null) {
            return false;
        }
        float f10 = this.f28372Y;
        float k10 = this.f28374b.k();
        this.f28372Y = k10;
        return Math.abs(k10 - f10) * c2940j.d() >= 50.0f;
    }

    public int Y() {
        return this.f28374b.getRepeatMode();
    }

    public boolean Y0() {
        return this.f28383k == null && this.f28386n == null && this.f28373a.c().k() > 0;
    }

    public float Z() {
        return this.f28374b.p();
    }

    public b0 a0() {
        return this.f28386n;
    }

    public Typeface b0(E3.c cVar) {
        Map map = this.f28383k;
        if (map != null) {
            String a10 = cVar.a();
            if (map.containsKey(a10)) {
                return (Typeface) map.get(a10);
            }
            String b10 = cVar.b();
            if (map.containsKey(b10)) {
                return (Typeface) map.get(b10);
            }
            String str = cVar.a() + "-" + cVar.c();
            if (map.containsKey(str)) {
                return (Typeface) map.get(str);
            }
        }
        D3.a L10 = L();
        if (L10 != null) {
            return L10.b(cVar);
        }
        return null;
    }

    public final boolean c0() {
        Drawable.Callback callback = getCallback();
        if (!(callback instanceof View)) {
            return false;
        }
        if (((View) callback).getParent() instanceof ViewGroup) {
            return !((ViewGroup) r0).getClipChildren();
        }
        return false;
    }

    public boolean d0() {
        com.airbnb.lottie.utils.j jVar = this.f28374b;
        if (jVar == null) {
            return false;
        }
        return jVar.isRunning();
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        com.airbnb.lottie.model.layer.c cVar = this.f28390r;
        if (cVar == null) {
            return;
        }
        boolean F10 = F();
        if (F10) {
            try {
                this.f28368T.acquire();
            } catch (InterruptedException unused) {
                if (AbstractC2935e.h()) {
                    AbstractC2935e.c("Drawable#draw");
                }
                if (!F10) {
                    return;
                }
                this.f28368T.release();
                if (cVar.Q() == this.f28374b.k()) {
                    return;
                }
            } catch (Throwable th2) {
                if (AbstractC2935e.h()) {
                    AbstractC2935e.c("Drawable#draw");
                }
                if (F10) {
                    this.f28368T.release();
                    if (cVar.Q() != this.f28374b.k()) {
                        f28352g1.execute(this.f28371X);
                    }
                }
                throw th2;
            }
        }
        if (AbstractC2935e.h()) {
            AbstractC2935e.b("Drawable#draw");
        }
        if (F10 && X0()) {
            P0(this.f28374b.k());
        }
        if (this.f28377e) {
            try {
                if (this.f28398z) {
                    m0(canvas, cVar);
                } else {
                    z(canvas);
                }
            } catch (Throwable th3) {
                com.airbnb.lottie.utils.g.b("Lottie crashed in draw!", th3);
            }
        } else if (this.f28398z) {
            m0(canvas, cVar);
        } else {
            z(canvas);
        }
        this.f28365O = false;
        if (AbstractC2935e.h()) {
            AbstractC2935e.c("Drawable#draw");
        }
        if (F10) {
            this.f28368T.release();
            if (cVar.Q() == this.f28374b.k()) {
                return;
            }
            f28352g1.execute(this.f28371X);
        }
    }

    public boolean e0() {
        if (isVisible()) {
            return this.f28374b.isRunning();
        }
        b bVar = this.f28378f;
        return bVar == b.PLAY || bVar == b.RESUME;
    }

    public boolean f0() {
        return this.f28394v;
    }

    public boolean g0() {
        return this.f28395w;
    }

    @Override // android.graphics.drawable.Drawable
    public int getAlpha() {
        return this.f28391s;
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicHeight() {
        C2940j c2940j = this.f28373a;
        if (c2940j == null) {
            return -1;
        }
        return c2940j.b().height();
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicWidth() {
        C2940j c2940j = this.f28373a;
        if (c2940j == null) {
            return -1;
        }
        return c2940j.b().width();
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return -3;
    }

    public boolean h0(L l10) {
        return this.f28387o.b(l10);
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public void invalidateDrawable(Drawable drawable) {
        Drawable.Callback callback = getCallback();
        if (callback == null) {
            return;
        }
        callback.invalidateDrawable(this);
    }

    @Override // android.graphics.drawable.Drawable
    public void invalidateSelf() {
        Drawable.Callback callback;
        if (this.f28365O) {
            return;
        }
        this.f28365O = true;
        if ((!f28350Z || Looper.getMainLooper() == Looper.myLooper()) && (callback = getCallback()) != null) {
            callback.invalidateDrawable(this);
        }
    }

    @Override // android.graphics.drawable.Animatable
    public boolean isRunning() {
        return d0();
    }

    public void k0() {
        this.f28379g.clear();
        this.f28374b.r();
        if (isVisible()) {
            return;
        }
        this.f28378f = b.NONE;
    }

    public void l0() {
        if (this.f28390r == null) {
            this.f28379g.add(new a() { // from class: com.airbnb.lottie.G
                @Override // com.airbnb.lottie.K.a
                public final void a(C2940j c2940j) {
                    K.this.l0();
                }
            });
            return;
        }
        w();
        if (s(K()) || X() == 0) {
            if (isVisible()) {
                this.f28374b.s();
                this.f28378f = b.NONE;
            } else {
                this.f28378f = b.PLAY;
            }
        }
        if (s(K())) {
            return;
        }
        E3.h R10 = R();
        if (R10 != null) {
            A0((int) R10.f2996b);
        } else {
            A0((int) (Z() < 0.0f ? T() : S()));
        }
        this.f28374b.j();
        if (isVisible()) {
            return;
        }
        this.f28378f = b.NONE;
    }

    public final void m0(Canvas canvas, com.airbnb.lottie.model.layer.c cVar) {
        if (this.f28373a == null || cVar == null) {
            return;
        }
        D();
        canvas.getMatrix(this.f28363K);
        canvas.getClipBounds(this.f28356D);
        x(this.f28356D, this.f28357E);
        this.f28363K.mapRect(this.f28357E);
        y(this.f28357E, this.f28356D);
        if (this.f28389q) {
            this.f28362J.set(0.0f, 0.0f, getIntrinsicWidth(), getIntrinsicHeight());
        } else {
            cVar.f(this.f28362J, null, false);
        }
        this.f28363K.mapRect(this.f28362J);
        Rect bounds = getBounds();
        float width = bounds.width() / getIntrinsicWidth();
        float height = bounds.height() / getIntrinsicHeight();
        q0(this.f28362J, width, height);
        if (!c0()) {
            RectF rectF = this.f28362J;
            Rect rect = this.f28356D;
            rectF.intersect(rect.left, rect.top, rect.right, rect.bottom);
        }
        if (!j0(this.f28362J)) {
            com.airbnb.lottie.utils.g.c("Skipping software rendering: transformed bounds contain non-finite values.");
            return;
        }
        int ceil = (int) Math.ceil(this.f28362J.width());
        int ceil2 = (int) Math.ceil(this.f28362J.height());
        if (ceil <= 0 || ceil2 <= 0) {
            com.airbnb.lottie.utils.g.c("Skipping software rendering: transformed bounds have negative values.");
            return;
        }
        long j10 = ceil * ceil2;
        if (j10 > 50000000) {
            com.airbnb.lottie.utils.g.c("Skipping software rendering: bitmap request exceeds safe pixel count (" + j10 + ")");
            return;
        }
        C(ceil, ceil2);
        if (this.f28365O) {
            this.f28363K.getValues(this.softwareRenderingOriginalCanvasMatrixElements);
            float[] fArr = this.softwareRenderingOriginalCanvasMatrixElements;
            float f10 = fArr[0];
            float f11 = fArr[4];
            this.f28353A.set(this.f28363K);
            this.f28353A.preScale(width, height);
            Matrix matrix = this.f28353A;
            RectF rectF2 = this.f28362J;
            matrix.postTranslate(-rectF2.left, -rectF2.top);
            this.f28353A.postScale(1.0f / f10, 1.0f / f11);
            this.f28354B.eraseColor(0);
            this.f28355C.setMatrix(com.airbnb.lottie.utils.z.f29166a);
            this.f28355C.scale(f10, f11);
            cVar.d(this.f28355C, this.f28353A, this.f28391s, null);
            this.f28363K.invert(this.f28364L);
            this.f28364L.mapRect(this.f28361I, this.f28362J);
            y(this.f28361I, this.f28360H);
        }
        this.f28359G.set(0, 0, ceil, ceil2);
        canvas.drawBitmap(this.f28354B, this.f28359G, this.f28360H, this.f28358F);
    }

    public List n0(E3.e eVar) {
        if (this.f28390r == null) {
            com.airbnb.lottie.utils.g.c("Cannot resolve KeyPath. Composition is not set yet.");
            return Collections.EMPTY_LIST;
        }
        ArrayList arrayList = new ArrayList();
        this.f28390r.i(eVar, 0, arrayList, new E3.e(new String[0]));
        return arrayList;
    }

    public void o0() {
        if (this.f28390r == null) {
            this.f28379g.add(new a() { // from class: com.airbnb.lottie.B
                @Override // com.airbnb.lottie.K.a
                public final void a(C2940j c2940j) {
                    K.this.o0();
                }
            });
            return;
        }
        w();
        if (s(K()) || X() == 0) {
            if (isVisible()) {
                this.f28374b.w();
                this.f28378f = b.NONE;
            } else {
                this.f28378f = b.RESUME;
            }
        }
        if (s(K())) {
            return;
        }
        A0((int) (Z() < 0.0f ? T() : S()));
        this.f28374b.j();
        if (isVisible()) {
            return;
        }
        this.f28378f = b.NONE;
    }

    public void p0() {
        this.f28374b.x();
    }

    public void q(Animator.AnimatorListener animatorListener) {
        this.f28374b.addListener(animatorListener);
    }

    public final void q0(RectF rectF, float f10, float f11) {
        rectF.set(rectF.left * f10, rectF.top * f11, rectF.right * f10, rectF.bottom * f11);
    }

    public void r(final E3.e eVar, final Object obj, final G3.c cVar) {
        com.airbnb.lottie.model.layer.c cVar2 = this.f28390r;
        if (cVar2 == null) {
            this.f28379g.add(new a() { // from class: com.airbnb.lottie.x
                @Override // com.airbnb.lottie.K.a
                public final void a(C2940j c2940j) {
                    K.this.r(eVar, obj, cVar);
                }
            });
            return;
        }
        boolean z10 = true;
        if (eVar == E3.e.f2990c) {
            cVar2.e(obj, cVar);
        } else if (eVar.d() != null) {
            eVar.d().e(obj, cVar);
        } else {
            List n02 = n0(eVar);
            for (int i10 = 0; i10 < n02.size(); i10++) {
                ((E3.e) n02.get(i10)).d().e(obj, cVar);
            }
            z10 = true ^ n02.isEmpty();
        }
        if (z10) {
            invalidateSelf();
            if (obj == S.f28447H) {
                P0(V());
            }
        }
    }

    public void r0(boolean z10) {
        this.f28394v = z10;
    }

    public boolean s(Context context) {
        if (this.f28376d) {
            return true;
        }
        return this.f28375c && AbstractC2935e.f().a(context) == C3.a.STANDARD_MOTION;
    }

    public void s0(boolean z10) {
        this.f28395w = z10;
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public void scheduleDrawable(Drawable drawable, Runnable runnable, long j10) {
        Drawable.Callback callback = getCallback();
        if (callback == null) {
            return;
        }
        callback.scheduleDrawable(this, runnable, j10);
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i10) {
        this.f28391s = i10;
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        com.airbnb.lottie.utils.g.c("Use addColorFilter instead.");
    }

    @Override // android.graphics.drawable.Drawable
    public boolean setVisible(boolean z10, boolean z11) {
        boolean isVisible = isVisible();
        boolean visible = super.setVisible(z10, z11);
        if (z10) {
            b bVar = this.f28378f;
            if (bVar == b.PLAY) {
                l0();
                return visible;
            }
            if (bVar == b.RESUME) {
                o0();
                return visible;
            }
        } else {
            if (this.f28374b.isRunning()) {
                k0();
                this.f28378f = b.RESUME;
                return visible;
            }
            if (isVisible) {
                this.f28378f = b.NONE;
            }
        }
        return visible;
    }

    @Override // android.graphics.drawable.Animatable
    public void start() {
        Drawable.Callback callback = getCallback();
        if ((callback instanceof View) && ((View) callback).isInEditMode()) {
            return;
        }
        l0();
    }

    @Override // android.graphics.drawable.Animatable
    public void stop() {
        B();
    }

    public final void t() {
        C2940j c2940j = this.f28373a;
        if (c2940j == null) {
            return;
        }
        com.airbnb.lottie.model.layer.c cVar = new com.airbnb.lottie.model.layer.c(this, com.airbnb.lottie.parser.v.a(c2940j), c2940j.k(), c2940j);
        this.f28390r = cVar;
        if (this.f28393u) {
            cVar.L(true);
        }
        this.f28390r.R(this.f28389q);
    }

    public void t0(EnumC2931a enumC2931a) {
        this.f28366P = enumC2931a;
    }

    public void u() {
        this.f28379g.clear();
        this.f28374b.cancel();
        if (isVisible()) {
            return;
        }
        this.f28378f = b.NONE;
    }

    public void u0(boolean z10) {
        if (z10 != this.f28396x) {
            this.f28396x = z10;
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        Drawable.Callback callback = getCallback();
        if (callback == null) {
            return;
        }
        callback.unscheduleDrawable(this, runnable);
    }

    public void v() {
        if (this.f28374b.isRunning()) {
            this.f28374b.cancel();
            if (!isVisible()) {
                this.f28378f = b.NONE;
            }
        }
        this.f28373a = null;
        this.f28390r = null;
        this.f28380h = null;
        this.f28372Y = -3.4028235E38f;
        this.f28374b.i();
        invalidateSelf();
    }

    public void v0(boolean z10) {
        if (z10 != this.f28389q) {
            this.f28389q = z10;
            com.airbnb.lottie.model.layer.c cVar = this.f28390r;
            if (cVar != null) {
                cVar.R(z10);
            }
            invalidateSelf();
        }
    }

    public final void w() {
        C2940j c2940j = this.f28373a;
        if (c2940j == null) {
            return;
        }
        this.f28398z = this.f28397y.b(Build.VERSION.SDK_INT, c2940j.q(), c2940j.m());
    }

    public boolean w0(C2940j c2940j) {
        if (this.f28373a == c2940j) {
            return false;
        }
        this.f28365O = true;
        v();
        this.f28373a = c2940j;
        t();
        this.f28374b.y(c2940j);
        P0(this.f28374b.getAnimatedFraction());
        Iterator it = new ArrayList(this.f28379g).iterator();
        while (it.hasNext()) {
            a aVar = (a) it.next();
            if (aVar != null) {
                aVar.a(c2940j);
            }
            it.remove();
        }
        this.f28379g.clear();
        c2940j.v(this.f28392t);
        w();
        Drawable.Callback callback = getCallback();
        if (callback instanceof ImageView) {
            ImageView imageView = (ImageView) callback;
            imageView.setImageDrawable(null);
            imageView.setImageDrawable(this);
        }
        return true;
    }

    public final void x(Rect rect, RectF rectF) {
        rectF.set(rect.left, rect.top, rect.right, rect.bottom);
    }

    public void x0(String str) {
        this.f28384l = str;
        D3.a L10 = L();
        if (L10 != null) {
            L10.c(str);
        }
    }

    public final void y(RectF rectF, Rect rect) {
        rect.set((int) Math.floor(rectF.left), (int) Math.floor(rectF.top), (int) Math.ceil(rectF.right), (int) Math.ceil(rectF.bottom));
    }

    public void y0(AbstractC2932b abstractC2932b) {
        this.f28385m = abstractC2932b;
        D3.a aVar = this.f28382j;
        if (aVar != null) {
            aVar.d(abstractC2932b);
        }
    }

    public final void z(Canvas canvas) {
        com.airbnb.lottie.model.layer.c cVar = this.f28390r;
        C2940j c2940j = this.f28373a;
        if (cVar == null || c2940j == null) {
            return;
        }
        this.f28353A.reset();
        if (!getBounds().isEmpty()) {
            this.f28353A.preTranslate(r2.left, r2.top);
            this.f28353A.preScale(r2.width() / c2940j.b().width(), r2.height() / c2940j.b().height());
        }
        cVar.d(canvas, this.f28353A, this.f28391s, null);
    }

    public void z0(Map map) {
        if (map == this.f28383k) {
            return;
        }
        this.f28383k = map;
        invalidateSelf();
    }
}
