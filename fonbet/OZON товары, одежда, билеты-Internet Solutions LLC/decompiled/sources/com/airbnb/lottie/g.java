package com.airbnb.lottie;

import B5.EnumC2597a;
import B5.r;
import B5.s;
import I5.l;
import K5.e;
import M5.v;
import android.animation.Animator;
import android.animation.ValueAnimator;
import android.annotation.SuppressLint;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.ImageView;
import androidx.annotation.NonNull;
import com.airbnb.lottie.i;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.Semaphore;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public final class g extends Drawable implements Drawable.Callback, Animatable {

    /* renamed from: H, reason: collision with root package name */
    private static final ThreadPoolExecutor f57310H = new ThreadPoolExecutor(0, 2, 35, TimeUnit.MILLISECONDS, new LinkedBlockingQueue(), new O5.d());

    /* renamed from: A, reason: collision with root package name */
    private Matrix f57311A;

    /* renamed from: B, reason: collision with root package name */
    private Matrix f57312B;

    /* renamed from: C, reason: collision with root package name */
    private boolean f57313C;

    /* renamed from: D, reason: collision with root package name */
    private EnumC2597a f57314D;

    /* renamed from: E, reason: collision with root package name */
    private final Semaphore f57315E;

    /* renamed from: F, reason: collision with root package name */
    private final r f57316F;

    /* renamed from: G, reason: collision with root package name */
    private float f57317G;

    /* renamed from: a, reason: collision with root package name */
    private B5.g f57318a;

    /* renamed from: b, reason: collision with root package name */
    private final O5.e f57319b;

    /* renamed from: c, reason: collision with root package name */
    private boolean f57320c;

    /* renamed from: d, reason: collision with root package name */
    private boolean f57321d;

    /* renamed from: e, reason: collision with root package name */
    private b f57322e;

    /* renamed from: f, reason: collision with root package name */
    private final ArrayList<a> f57323f;

    /* renamed from: g, reason: collision with root package name */
    private G5.b f57324g;

    /* renamed from: h, reason: collision with root package name */
    private String f57325h;

    /* renamed from: i, reason: collision with root package name */
    private G5.a f57326i;

    /* renamed from: j, reason: collision with root package name */
    String f57327j;

    /* renamed from: k, reason: collision with root package name */
    private boolean f57328k;

    /* renamed from: l, reason: collision with root package name */
    private boolean f57329l;

    /* renamed from: m, reason: collision with root package name */
    private K5.c f57330m;

    /* renamed from: n, reason: collision with root package name */
    private int f57331n;

    /* renamed from: o, reason: collision with root package name */
    private i f57332o;

    /* renamed from: p, reason: collision with root package name */
    private boolean f57333p;

    /* renamed from: q, reason: collision with root package name */
    private final Matrix f57334q;

    /* renamed from: r, reason: collision with root package name */
    private Bitmap f57335r;

    /* renamed from: s, reason: collision with root package name */
    private Canvas f57336s;

    /* renamed from: t, reason: collision with root package name */
    private Rect f57337t;

    /* renamed from: u, reason: collision with root package name */
    private RectF f57338u;

    /* renamed from: v, reason: collision with root package name */
    private C5.a f57339v;

    /* renamed from: w, reason: collision with root package name */
    private Rect f57340w;

    /* renamed from: x, reason: collision with root package name */
    private Rect f57341x;

    /* renamed from: y, reason: collision with root package name */
    private RectF f57342y;

    /* renamed from: z, reason: collision with root package name */
    private RectF f57343z;

    /* JADX INFO: Access modifiers changed from: private */
    interface a {
        void run();
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    private static final class b {
        private static final /* synthetic */ b[] $VALUES;
        public static final b NONE;
        public static final b PLAY;
        public static final b RESUME;

        static {
            b bVar = new b("NONE", 0);
            NONE = bVar;
            b bVar2 = new b("PLAY", 1);
            PLAY = bVar2;
            b bVar3 = new b("RESUME", 2);
            RESUME = bVar3;
            $VALUES = new b[]{bVar, bVar2, bVar3};
        }

        private b() {
            throw null;
        }

        public static b valueOf(String str) {
            return (b) Enum.valueOf(b.class, str);
        }

        public static b[] values() {
            return (b[]) $VALUES.clone();
        }
    }

    public g() {
        O5.e eVar = new O5.e();
        this.f57319b = eVar;
        this.f57320c = true;
        this.f57321d = false;
        this.f57322e = b.NONE;
        this.f57323f = new ArrayList<>();
        this.f57329l = true;
        this.f57331n = 255;
        this.f57332o = i.AUTOMATIC;
        this.f57333p = false;
        this.f57334q = new Matrix();
        this.f57313C = false;
        ValueAnimator.AnimatorUpdateListener animatorUpdateListener = new ValueAnimator.AnimatorUpdateListener() { // from class: B5.q
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                com.airbnb.lottie.g.a(com.airbnb.lottie.g.this);
            }
        };
        this.f57315E = new Semaphore(1);
        this.f57316F = new r(this, 0);
        this.f57317G = -3.4028235E38f;
        eVar.addUpdateListener(animatorUpdateListener);
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x00ea  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private void D(Canvas canvas, K5.c cVar) {
        boolean z11;
        int ceil;
        if (this.f57318a == null || cVar == null) {
            return;
        }
        if (this.f57336s == null) {
            this.f57336s = new Canvas();
            this.f57343z = new RectF();
            this.f57311A = new Matrix();
            this.f57312B = new Matrix();
            this.f57337t = new Rect();
            this.f57338u = new RectF();
            this.f57339v = new C5.a();
            this.f57340w = new Rect();
            this.f57341x = new Rect();
            this.f57342y = new RectF();
        }
        canvas.getMatrix(this.f57311A);
        canvas.getClipBounds(this.f57337t);
        Rect rect = this.f57337t;
        this.f57338u.set(rect.left, rect.top, rect.right, rect.bottom);
        this.f57311A.mapRect(this.f57338u);
        j(this.f57337t, this.f57338u);
        if (this.f57329l) {
            this.f57343z.set(0.0f, 0.0f, getIntrinsicWidth(), getIntrinsicHeight());
        } else {
            cVar.a(this.f57343z, null, false);
        }
        this.f57311A.mapRect(this.f57343z);
        Rect bounds = getBounds();
        float width = bounds.width() / getIntrinsicWidth();
        float height = bounds.height() / getIntrinsicHeight();
        RectF rectF = this.f57343z;
        rectF.set(rectF.left * width, rectF.top * height, rectF.right * width, rectF.bottom * height);
        Drawable.Callback callback = getCallback();
        if (callback instanceof View) {
            ViewParent parent = ((View) callback).getParent();
            if (parent instanceof ViewGroup) {
                z11 = !((ViewGroup) parent).getClipChildren();
                if (!z11) {
                    RectF rectF2 = this.f57343z;
                    Rect rect2 = this.f57337t;
                    rectF2.intersect(rect2.left, rect2.top, rect2.right, rect2.bottom);
                }
                ceil = (int) Math.ceil(this.f57343z.width());
                int ceil2 = (int) Math.ceil(this.f57343z.height());
                if (ceil > 0 || ceil2 <= 0) {
                }
                Bitmap bitmap = this.f57335r;
                if (bitmap == null || bitmap.getWidth() < ceil || this.f57335r.getHeight() < ceil2) {
                    Bitmap createBitmap = Bitmap.createBitmap(ceil, ceil2, Bitmap.Config.ARGB_8888);
                    this.f57335r = createBitmap;
                    this.f57336s.setBitmap(createBitmap);
                    this.f57313C = true;
                } else if (this.f57335r.getWidth() > ceil || this.f57335r.getHeight() > ceil2) {
                    Bitmap createBitmap2 = Bitmap.createBitmap(this.f57335r, 0, 0, ceil, ceil2);
                    this.f57335r = createBitmap2;
                    this.f57336s.setBitmap(createBitmap2);
                    this.f57313C = true;
                }
                if (this.f57313C) {
                    Matrix matrix = this.f57334q;
                    matrix.set(this.f57311A);
                    matrix.preScale(width, height);
                    RectF rectF3 = this.f57343z;
                    matrix.postTranslate(-rectF3.left, -rectF3.top);
                    this.f57335r.eraseColor(0);
                    cVar.e(this.f57336s, matrix, this.f57331n);
                    this.f57311A.invert(this.f57312B);
                    this.f57312B.mapRect(this.f57342y, this.f57343z);
                    j(this.f57341x, this.f57342y);
                }
                this.f57340w.set(0, 0, ceil, ceil2);
                canvas.drawBitmap(this.f57335r, this.f57340w, this.f57341x, this.f57339v);
                return;
            }
        }
        z11 = false;
        if (!z11) {
        }
        ceil = (int) Math.ceil(this.f57343z.width());
        int ceil22 = (int) Math.ceil(this.f57343z.height());
        if (ceil > 0) {
        }
    }

    private boolean T() {
        B5.g gVar = this.f57318a;
        if (gVar == null) {
            return false;
        }
        float f7 = this.f57317G;
        float j11 = this.f57319b.j();
        this.f57317G = j11;
        return Math.abs(j11 - f7) * gVar.d() >= 50.0f;
    }

    public static void a(g gVar) {
        EnumC2597a enumC2597a = gVar.f57314D;
        if (enumC2597a == null) {
            enumC2597a = B5.c.a();
        }
        if (enumC2597a == EnumC2597a.ENABLED) {
            gVar.invalidateSelf();
            return;
        }
        K5.c cVar = gVar.f57330m;
        if (cVar != null) {
            cVar.v(gVar.f57319b.j());
        }
    }

    public static /* synthetic */ void b(g gVar) {
        Semaphore semaphore = gVar.f57315E;
        K5.c cVar = gVar.f57330m;
        if (cVar == null) {
            return;
        }
        try {
            semaphore.acquire();
            cVar.v(gVar.f57319b.j());
        } catch (InterruptedException unused) {
        } finally {
            semaphore.release();
        }
    }

    private boolean e() {
        return this.f57320c || this.f57321d;
    }

    private void f() {
        B5.g gVar = this.f57318a;
        if (gVar == null) {
            return;
        }
        int i11 = v.f17450d;
        Rect b11 = gVar.b();
        List list = Collections.EMPTY_LIST;
        K5.c cVar = new K5.c(this, new K5.e(list, gVar, "__container", -1L, e.a.PRE_COMP, -1L, null, list, new l(), 0, 0, 0, 0.0f, 0.0f, b11.width(), b11.height(), null, null, list, e.b.NONE, null, false, null, null, J5.h.NORMAL), gVar.k(), gVar);
        this.f57330m = cVar;
        cVar.x(this.f57329l);
    }

    private void i() {
        B5.g gVar = this.f57318a;
        if (gVar == null) {
            return;
        }
        i iVar = this.f57332o;
        int i11 = Build.VERSION.SDK_INT;
        boolean p11 = gVar.p();
        int l11 = gVar.l();
        iVar.getClass();
        int i12 = i.a.f57350a[iVar.ordinal()];
        boolean z11 = false;
        if (i12 != 1 && (i12 == 2 || ((p11 && i11 < 28) || l11 > 4))) {
            z11 = true;
        }
        this.f57333p = z11;
    }

    private static void j(Rect rect, RectF rectF) {
        rect.set((int) Math.floor(rectF.left), (int) Math.floor(rectF.top), (int) Math.ceil(rectF.right), (int) Math.ceil(rectF.bottom));
    }

    private void l(Canvas canvas) {
        K5.c cVar = this.f57330m;
        B5.g gVar = this.f57318a;
        if (cVar == null || gVar == null) {
            return;
        }
        Matrix matrix = this.f57334q;
        matrix.reset();
        if (!getBounds().isEmpty()) {
            matrix.preScale(r3.width() / gVar.b().width(), r3.height() / gVar.b().height());
            matrix.preTranslate(r3.left, r3.top);
        }
        cVar.e(canvas, matrix, this.f57331n);
    }

    private G5.a q() {
        if (getCallback() == null) {
            return null;
        }
        if (this.f57326i == null) {
            G5.a aVar = new G5.a(getCallback());
            this.f57326i = aVar;
            String str = this.f57327j;
            if (str != null) {
                aVar.b(str);
            }
        }
        return this.f57326i;
    }

    public final void A() {
        this.f57323f.clear();
        this.f57319b.o();
        if (isVisible()) {
            return;
        }
        this.f57322e = b.NONE;
    }

    public final void B() {
        if (this.f57330m == null) {
            this.f57323f.add(new a() { // from class: com.airbnb.lottie.c
                @Override // com.airbnb.lottie.g.a
                public final void run() {
                    g.this.B();
                }
            });
            return;
        }
        i();
        boolean e11 = e();
        O5.e eVar = this.f57319b;
        if (e11 || eVar.getRepeatCount() == 0) {
            if (isVisible()) {
                eVar.p();
                this.f57322e = b.NONE;
            } else {
                this.f57322e = b.PLAY;
            }
        }
        if (e()) {
            return;
        }
        J((int) (eVar.m() < 0.0f ? eVar.l() : eVar.k()));
        eVar.i();
        if (isVisible()) {
            return;
        }
        this.f57322e = b.NONE;
    }

    public final void C(Animator.AnimatorListener animatorListener) {
        this.f57319b.removeListener(animatorListener);
    }

    public final void E() {
        if (this.f57330m == null) {
            this.f57323f.add(new a() { // from class: com.airbnb.lottie.b
                @Override // com.airbnb.lottie.g.a
                public final void run() {
                    g.this.E();
                }
            });
            return;
        }
        i();
        boolean e11 = e();
        O5.e eVar = this.f57319b;
        if (e11 || eVar.getRepeatCount() == 0) {
            if (isVisible()) {
                eVar.r();
                this.f57322e = b.NONE;
            } else {
                this.f57322e = b.RESUME;
            }
        }
        if (e()) {
            return;
        }
        J((int) (eVar.m() < 0.0f ? eVar.l() : eVar.k()));
        eVar.i();
        if (isVisible()) {
            return;
        }
        this.f57322e = b.NONE;
    }

    public final void F(EnumC2597a enumC2597a) {
        this.f57314D = enumC2597a;
    }

    public final void G(boolean z11) {
        if (z11 != this.f57329l) {
            this.f57329l = z11;
            K5.c cVar = this.f57330m;
            if (cVar != null) {
                cVar.x(z11);
            }
            invalidateSelf();
        }
    }

    public final boolean H(B5.g gVar) {
        if (this.f57318a == gVar) {
            return false;
        }
        this.f57313C = true;
        h();
        this.f57318a = gVar;
        f();
        O5.e eVar = this.f57319b;
        eVar.s(gVar);
        M(eVar.getAnimatedFraction());
        ArrayList<a> arrayList = this.f57323f;
        Iterator it = new ArrayList(arrayList).iterator();
        while (it.hasNext()) {
            a aVar = (a) it.next();
            if (aVar != null) {
                aVar.run();
            }
            it.remove();
        }
        arrayList.clear();
        gVar.v();
        i();
        Drawable.Callback callback = getCallback();
        if (callback instanceof ImageView) {
            ImageView imageView = (ImageView) callback;
            imageView.setImageDrawable(null);
            imageView.setImageDrawable(this);
        }
        return true;
    }

    public final void I(String str) {
        this.f57327j = str;
        G5.a q11 = q();
        if (q11 != null) {
            q11.b(str);
        }
    }

    public final void J(final int i11) {
        if (this.f57318a == null) {
            this.f57323f.add(new a() { // from class: com.airbnb.lottie.f
                @Override // com.airbnb.lottie.g.a
                public final void run() {
                    g.this.J(i11);
                }
            });
        } else {
            this.f57319b.t(i11);
        }
    }

    public final void K(boolean z11) {
        this.f57321d = z11;
    }

    public final void L(String str) {
        this.f57325h = str;
    }

    public final void M(final float f7) {
        B5.g gVar = this.f57318a;
        if (gVar == null) {
            this.f57323f.add(new a() { // from class: com.airbnb.lottie.d
                @Override // com.airbnb.lottie.g.a
                public final void run() {
                    g.this.M(f7);
                }
            });
        } else {
            int i11 = B5.c.f2729d;
            this.f57319b.t(gVar.h(f7));
        }
    }

    public final void N(i iVar) {
        this.f57332o = iVar;
        i();
    }

    public final void O(int i11) {
        this.f57319b.setRepeatCount(i11);
    }

    public final void P(int i11) {
        this.f57319b.setRepeatMode(i11);
    }

    public final void Q(float f7) {
        this.f57319b.v(f7);
    }

    public final void R(Boolean bool) {
        this.f57320c = bool.booleanValue();
    }

    public final void S(boolean z11) {
        this.f57319b.w(z11);
    }

    public final boolean U() {
        return this.f57318a.c().e() > 0;
    }

    public final void c(Animator.AnimatorListener animatorListener) {
        this.f57319b.addListener(animatorListener);
    }

    public final <T> void d(final H5.e eVar, final T t2, final P5.c<T> cVar) {
        List list;
        K5.c cVar2 = this.f57330m;
        if (cVar2 == null) {
            this.f57323f.add(new a() { // from class: com.airbnb.lottie.e
                @Override // com.airbnb.lottie.g.a
                public final void run() {
                    g.this.d(eVar, t2, cVar);
                }
            });
            return;
        }
        boolean z11 = true;
        if (eVar == H5.e.f10622c) {
            cVar2.d(cVar, t2);
        } else if (eVar.c() != null) {
            eVar.c().d(cVar, t2);
        } else {
            if (this.f57330m == null) {
                O5.c.c("Cannot resolve KeyPath. Composition is not set yet.");
                list = Collections.EMPTY_LIST;
            } else {
                ArrayList arrayList = new ArrayList();
                this.f57330m.h(eVar, 0, arrayList, new H5.e(new String[0]));
                list = arrayList;
            }
            for (int i11 = 0; i11 < list.size(); i11++) {
                ((H5.e) list.get(i11)).c().d(cVar, t2);
            }
            z11 = true ^ list.isEmpty();
        }
        if (z11) {
            invalidateSelf();
            if (t2 == B5.v.f2810z) {
                M(this.f57319b.j());
            }
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(@NonNull Canvas canvas) {
        K5.c cVar = this.f57330m;
        if (cVar == null) {
            return;
        }
        EnumC2597a enumC2597a = this.f57314D;
        if (enumC2597a == null) {
            enumC2597a = B5.c.a();
        }
        boolean z11 = enumC2597a == EnumC2597a.ENABLED;
        ThreadPoolExecutor threadPoolExecutor = f57310H;
        Semaphore semaphore = this.f57315E;
        r rVar = this.f57316F;
        O5.e eVar = this.f57319b;
        if (z11) {
            try {
                semaphore.acquire();
            } catch (InterruptedException unused) {
                int i11 = B5.c.f2729d;
                if (z11) {
                    semaphore.release();
                    if (cVar.w() != eVar.j()) {
                        threadPoolExecutor.execute(rVar);
                        return;
                    }
                    return;
                }
                return;
            } catch (Throwable th2) {
                int i12 = B5.c.f2729d;
                if (z11) {
                    semaphore.release();
                    if (cVar.w() != eVar.j()) {
                        threadPoolExecutor.execute(rVar);
                    }
                }
                throw th2;
            }
        }
        int i13 = B5.c.f2729d;
        if (z11 && T()) {
            M(eVar.j());
        }
        if (this.f57333p) {
            D(canvas, cVar);
        } else {
            l(canvas);
        }
        this.f57313C = false;
        if (z11) {
            semaphore.release();
            if (cVar.w() != eVar.j()) {
                threadPoolExecutor.execute(rVar);
            }
        }
    }

    public final void g() {
        this.f57323f.clear();
        this.f57319b.cancel();
        if (isVisible()) {
            return;
        }
        this.f57322e = b.NONE;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getAlpha() {
        return this.f57331n;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        B5.g gVar = this.f57318a;
        if (gVar == null) {
            return -1;
        }
        return gVar.b().height();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        B5.g gVar = this.f57318a;
        if (gVar == null) {
            return -1;
        }
        return gVar.b().width();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return -3;
    }

    public final void h() {
        O5.e eVar = this.f57319b;
        if (eVar.isRunning()) {
            eVar.cancel();
            if (!isVisible()) {
                this.f57322e = b.NONE;
            }
        }
        this.f57318a = null;
        this.f57330m = null;
        this.f57324g = null;
        this.f57317G = -3.4028235E38f;
        eVar.h();
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void invalidateDrawable(@NonNull Drawable drawable) {
        Drawable.Callback callback = getCallback();
        if (callback == null) {
            return;
        }
        callback.invalidateDrawable(this);
    }

    @Override // android.graphics.drawable.Drawable
    public final void invalidateSelf() {
        if (this.f57313C) {
            return;
        }
        this.f57313C = true;
        Drawable.Callback callback = getCallback();
        if (callback != null) {
            callback.invalidateDrawable(this);
        }
    }

    @Override // android.graphics.drawable.Animatable
    public final boolean isRunning() {
        return y();
    }

    public final void k(Canvas canvas, Matrix matrix) {
        K5.c cVar = this.f57330m;
        B5.g gVar = this.f57318a;
        if (cVar == null || gVar == null) {
            return;
        }
        EnumC2597a enumC2597a = this.f57314D;
        if (enumC2597a == null) {
            enumC2597a = B5.c.a();
        }
        boolean z11 = enumC2597a == EnumC2597a.ENABLED;
        ThreadPoolExecutor threadPoolExecutor = f57310H;
        Semaphore semaphore = this.f57315E;
        r rVar = this.f57316F;
        O5.e eVar = this.f57319b;
        if (z11) {
            try {
                semaphore.acquire();
                if (T()) {
                    M(eVar.j());
                }
            } catch (InterruptedException unused) {
                if (z11) {
                    semaphore.release();
                    if (cVar.w() != eVar.j()) {
                        threadPoolExecutor.execute(rVar);
                        return;
                    }
                    return;
                }
                return;
            } catch (Throwable th2) {
                if (z11) {
                    semaphore.release();
                    if (cVar.w() != eVar.j()) {
                        threadPoolExecutor.execute(rVar);
                    }
                }
                throw th2;
            }
        }
        if (this.f57333p) {
            canvas.save();
            canvas.concat(matrix);
            D(canvas, cVar);
            canvas.restore();
        } else {
            cVar.e(canvas, matrix, this.f57331n);
        }
        this.f57313C = false;
        if (z11) {
            semaphore.release();
            if (cVar.w() != eVar.j()) {
                threadPoolExecutor.execute(rVar);
            }
        }
    }

    public final void m(boolean z11) {
        if (this.f57328k == z11) {
            return;
        }
        this.f57328k = z11;
        if (this.f57318a != null) {
            f();
        }
    }

    public final boolean n() {
        return this.f57328k;
    }

    public final Bitmap o(String str) {
        G5.b bVar = this.f57324g;
        if (bVar != null) {
            Drawable.Callback callback = getCallback();
            if (!bVar.b((callback != null && (callback instanceof View)) ? ((View) callback).getContext() : null)) {
                this.f57324g = null;
            }
        }
        if (this.f57324g == null) {
            this.f57324g = new G5.b(getCallback(), this.f57325h, this.f57318a.j());
        }
        G5.b bVar2 = this.f57324g;
        if (bVar2 != null) {
            return bVar2.a(str);
        }
        return null;
    }

    public final B5.g p() {
        return this.f57318a;
    }

    public final String r() {
        return this.f57325h;
    }

    public final s s(String str) {
        B5.g gVar = this.f57318a;
        if (gVar == null) {
            return null;
        }
        return (s) ((HashMap) gVar.j()).get(str);
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void scheduleDrawable(@NonNull Drawable drawable, @NonNull Runnable runnable, long j11) {
        Drawable.Callback callback = getCallback();
        if (callback == null) {
            return;
        }
        callback.scheduleDrawable(this, runnable, j11);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i11) {
        this.f57331n = i11;
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        O5.c.c("Use addColorFilter instead.");
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean setVisible(boolean z11, boolean z12) {
        boolean isVisible = isVisible();
        boolean visible = super.setVisible(z11, z12);
        if (z11) {
            b bVar = this.f57322e;
            if (bVar == b.PLAY) {
                B();
                return visible;
            }
            if (bVar == b.RESUME) {
                E();
                return visible;
            }
        } else {
            if (this.f57319b.isRunning()) {
                A();
                this.f57322e = b.RESUME;
                return visible;
            }
            if (isVisible) {
                this.f57322e = b.NONE;
            }
        }
        return visible;
    }

    @Override // android.graphics.drawable.Animatable
    public final void start() {
        Drawable.Callback callback = getCallback();
        if ((callback instanceof View) && ((View) callback).isInEditMode()) {
            return;
        }
        B();
    }

    @Override // android.graphics.drawable.Animatable
    public final void stop() {
        this.f57323f.clear();
        this.f57319b.i();
        if (isVisible()) {
            return;
        }
        this.f57322e = b.NONE;
    }

    public final float t() {
        return this.f57319b.j();
    }

    public final i u() {
        return this.f57333p ? i.SOFTWARE : i.HARDWARE;
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void unscheduleDrawable(@NonNull Drawable drawable, @NonNull Runnable runnable) {
        Drawable.Callback callback = getCallback();
        if (callback == null) {
            return;
        }
        callback.unscheduleDrawable(this, runnable);
    }

    public final int v() {
        return this.f57319b.getRepeatCount();
    }

    @SuppressLint({"WrongConstant"})
    public final int w() {
        return this.f57319b.getRepeatMode();
    }

    public final Typeface x(H5.c cVar) {
        G5.a q11 = q();
        if (q11 != null) {
            return q11.a(cVar);
        }
        return null;
    }

    public final boolean y() {
        O5.e eVar = this.f57319b;
        if (eVar == null) {
            return false;
        }
        return eVar.isRunning();
    }

    final boolean z() {
        if (isVisible()) {
            return this.f57319b.isRunning();
        }
        b bVar = this.f57322e;
        return bVar == b.PLAY || bVar == b.RESUME;
    }
}
