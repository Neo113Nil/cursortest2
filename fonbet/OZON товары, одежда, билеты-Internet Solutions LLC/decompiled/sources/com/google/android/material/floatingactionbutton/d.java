package com.google.android.material.floatingactionbutton;

import android.R;
import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.FloatEvaluator;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.LayerDrawable;
import android.os.Build;
import android.util.Property;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewTreeObserver;
import androidx.annotation.NonNull;
import androidx.core.view.Y;
import c3.C5739a;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import j7.C7292a;
import j7.C7293b;
import j7.C7297f;
import j7.C7298g;
import j7.C7299h;
import java.util.ArrayList;
import java.util.Iterator;
import s7.C9614i;
import t7.C9774a;
import x2.i;
import y7.C10856g;
import y7.C10857h;
import y7.k;
import y7.o;

/* loaded from: classes9.dex */
class d {

    /* renamed from: B, reason: collision with root package name */
    static final C5739a f58366B = C7292a.f69465c;

    /* renamed from: C, reason: collision with root package name */
    static final int[] f58367C = {R.attr.state_pressed, R.attr.state_enabled};

    /* renamed from: D, reason: collision with root package name */
    static final int[] f58368D = {R.attr.state_hovered, R.attr.state_focused, R.attr.state_enabled};

    /* renamed from: E, reason: collision with root package name */
    static final int[] f58369E = {R.attr.state_focused, R.attr.state_enabled};

    /* renamed from: F, reason: collision with root package name */
    static final int[] f58370F = {R.attr.state_hovered, R.attr.state_enabled};

    /* renamed from: G, reason: collision with root package name */
    static final int[] f58371G = {R.attr.state_enabled};

    /* renamed from: H, reason: collision with root package name */
    static final int[] f58372H = new int[0];

    /* renamed from: A, reason: collision with root package name */
    private ViewTreeObserver.OnPreDrawListener f58373A;

    /* renamed from: a, reason: collision with root package name */
    k f58374a;

    /* renamed from: b, reason: collision with root package name */
    C10856g f58375b;

    /* renamed from: c, reason: collision with root package name */
    Drawable f58376c;

    /* renamed from: d, reason: collision with root package name */
    com.google.android.material.floatingactionbutton.a f58377d;

    /* renamed from: e, reason: collision with root package name */
    LayerDrawable f58378e;

    /* renamed from: f, reason: collision with root package name */
    boolean f58379f;

    /* renamed from: g, reason: collision with root package name */
    float f58380g;

    /* renamed from: h, reason: collision with root package name */
    float f58381h;

    /* renamed from: i, reason: collision with root package name */
    float f58382i;

    /* renamed from: j, reason: collision with root package name */
    int f58383j;

    /* renamed from: k, reason: collision with root package name */
    private Animator f58384k;

    /* renamed from: l, reason: collision with root package name */
    private C7299h f58385l;

    /* renamed from: m, reason: collision with root package name */
    private C7299h f58386m;

    /* renamed from: n, reason: collision with root package name */
    private float f58387n;

    /* renamed from: p, reason: collision with root package name */
    private int f58389p;

    /* renamed from: r, reason: collision with root package name */
    private ArrayList<Animator.AnimatorListener> f58391r;

    /* renamed from: s, reason: collision with root package name */
    private ArrayList<Animator.AnimatorListener> f58392s;

    /* renamed from: t, reason: collision with root package name */
    private ArrayList<f> f58393t;

    /* renamed from: u, reason: collision with root package name */
    final FloatingActionButton f58394u;

    /* renamed from: v, reason: collision with root package name */
    final x7.b f58395v;

    /* renamed from: o, reason: collision with root package name */
    private float f58388o = 1.0f;

    /* renamed from: q, reason: collision with root package name */
    private int f58390q = 0;

    /* renamed from: w, reason: collision with root package name */
    private final Rect f58396w = new Rect();

    /* renamed from: x, reason: collision with root package name */
    private final RectF f58397x = new RectF();

    /* renamed from: y, reason: collision with root package name */
    private final RectF f58398y = new RectF();

    /* renamed from: z, reason: collision with root package name */
    private final Matrix f58399z = new Matrix();

    final class a extends C7298g {
        a() {
        }

        @Override // android.animation.TypeEvaluator
        public final Matrix evaluate(float f7, @NonNull Matrix matrix, @NonNull Matrix matrix2) {
            d.this.f58388o = f7;
            return super.a(f7, matrix, matrix2);
        }
    }

    final class b implements ValueAnimator.AnimatorUpdateListener {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ float f58401a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ float f58402b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ float f58403c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ float f58404d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ float f58405e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ float f58406f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ float f58407g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ Matrix f58408h;

        b(float f7, float f11, float f12, float f13, float f14, float f15, float f16, Matrix matrix) {
            this.f58401a = f7;
            this.f58402b = f11;
            this.f58403c = f12;
            this.f58404d = f13;
            this.f58405e = f14;
            this.f58406f = f15;
            this.f58407g = f16;
            this.f58408h = matrix;
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
            float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
            d dVar = d.this;
            dVar.f58394u.setAlpha(C7292a.b(this.f58401a, this.f58402b, 0.0f, 0.2f, floatValue));
            float f7 = this.f58403c;
            float f11 = this.f58404d;
            float a11 = C7292a.a(f7, f11, floatValue);
            FloatingActionButton floatingActionButton = dVar.f58394u;
            floatingActionButton.setScaleX(a11);
            floatingActionButton.setScaleY(C7292a.a(this.f58405e, f11, floatValue));
            float f12 = this.f58406f;
            float f13 = this.f58407g;
            dVar.f58388o = C7292a.a(f12, f13, floatValue);
            float a12 = C7292a.a(f12, f13, floatValue);
            Matrix matrix = this.f58408h;
            dVar.h(a12, matrix);
            floatingActionButton.setImageMatrix(matrix);
        }
    }

    private class c extends h {
        @Override // com.google.android.material.floatingactionbutton.d.h
        protected final float a() {
            return 0.0f;
        }
    }

    /* renamed from: com.google.android.material.floatingactionbutton.d$d, reason: collision with other inner class name */
    private class C0884d extends h {
        C0884d() {
            super();
        }

        @Override // com.google.android.material.floatingactionbutton.d.h
        protected final float a() {
            d dVar = d.this;
            return dVar.f58380g + dVar.f58381h;
        }
    }

    private class e extends h {
        e() {
            super();
        }

        @Override // com.google.android.material.floatingactionbutton.d.h
        protected final float a() {
            d dVar = d.this;
            return dVar.f58380g + dVar.f58382i;
        }
    }

    interface f {
        void a();

        void b();
    }

    private class g extends h {
        g() {
            super();
        }

        @Override // com.google.android.material.floatingactionbutton.d.h
        protected final float a() {
            return d.this.f58380g;
        }
    }

    private abstract class h extends AnimatorListenerAdapter implements ValueAnimator.AnimatorUpdateListener {

        /* renamed from: a, reason: collision with root package name */
        private boolean f58413a;

        /* renamed from: b, reason: collision with root package name */
        private float f58414b;

        /* renamed from: c, reason: collision with root package name */
        private float f58415c;

        h() {
        }

        protected abstract float a();

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public final void onAnimationEnd(Animator animator) {
            float f7 = (int) this.f58415c;
            C10856g c10856g = d.this.f58375b;
            if (c10856g != null) {
                c10856g.A(f7);
            }
            this.f58413a = false;
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public final void onAnimationUpdate(@NonNull ValueAnimator valueAnimator) {
            boolean z11 = this.f58413a;
            d dVar = d.this;
            if (!z11) {
                C10856g c10856g = dVar.f58375b;
                this.f58414b = c10856g == null ? 0.0f : c10856g.p();
                this.f58415c = a();
                this.f58413a = true;
            }
            float f7 = this.f58414b;
            float animatedFraction = (int) ((valueAnimator.getAnimatedFraction() * (this.f58415c - f7)) + f7);
            C10856g c10856g2 = dVar.f58375b;
            if (c10856g2 != null) {
                c10856g2.A(animatedFraction);
            }
        }
    }

    d(FloatingActionButton floatingActionButton, x7.b bVar) {
        this.f58394u = floatingActionButton;
        this.f58395v = bVar;
        C9614i c9614i = new C9614i();
        c9614i.a(f58367C, k(new e()));
        c9614i.a(f58368D, k(new C0884d()));
        c9614i.a(f58369E, k(new C0884d()));
        c9614i.a(f58370F, k(new C0884d()));
        c9614i.a(f58371G, k(new g()));
        c9614i.a(f58372H, k(new c()));
        this.f58387n = floatingActionButton.getRotation();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void h(float f7, @NonNull Matrix matrix) {
        matrix.reset();
        if (this.f58394u.getDrawable() == null || this.f58389p == 0) {
            return;
        }
        RectF rectF = this.f58397x;
        RectF rectF2 = this.f58398y;
        rectF.set(0.0f, 0.0f, r0.getIntrinsicWidth(), r0.getIntrinsicHeight());
        float f11 = this.f58389p;
        rectF2.set(0.0f, 0.0f, f11, f11);
        matrix.setRectToRect(rectF, rectF2, Matrix.ScaleToFit.CENTER);
        float f12 = this.f58389p / 2.0f;
        matrix.postScale(f7, f7, f12, f12);
    }

    @NonNull
    private AnimatorSet i(@NonNull C7299h c7299h, float f7, float f11, float f12) {
        ArrayList arrayList = new ArrayList();
        Property property = View.ALPHA;
        float[] fArr = {f7};
        FloatingActionButton floatingActionButton = this.f58394u;
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(floatingActionButton, (Property<FloatingActionButton, Float>) property, fArr);
        c7299h.d("opacity").a(ofFloat);
        arrayList.add(ofFloat);
        ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(floatingActionButton, (Property<FloatingActionButton, Float>) View.SCALE_X, f11);
        c7299h.d("scale").a(ofFloat2);
        int i11 = Build.VERSION.SDK_INT;
        if (i11 == 26) {
            com.google.android.material.floatingactionbutton.e eVar = new com.google.android.material.floatingactionbutton.e();
            eVar.f58417a = new FloatEvaluator();
            ofFloat2.setEvaluator(eVar);
        }
        arrayList.add(ofFloat2);
        ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(floatingActionButton, (Property<FloatingActionButton, Float>) View.SCALE_Y, f11);
        c7299h.d("scale").a(ofFloat3);
        if (i11 == 26) {
            com.google.android.material.floatingactionbutton.e eVar2 = new com.google.android.material.floatingactionbutton.e();
            eVar2.f58417a = new FloatEvaluator();
            ofFloat3.setEvaluator(eVar2);
        }
        arrayList.add(ofFloat3);
        Matrix matrix = this.f58399z;
        h(f12, matrix);
        ObjectAnimator ofObject = ObjectAnimator.ofObject(floatingActionButton, new C7297f(), new a(), new Matrix(matrix));
        c7299h.d("iconScale").a(ofObject);
        arrayList.add(ofObject);
        AnimatorSet animatorSet = new AnimatorSet();
        C7293b.a(animatorSet, arrayList);
        return animatorSet;
    }

    private AnimatorSet j(float f7, float f11, float f12) {
        AnimatorSet animatorSet = new AnimatorSet();
        ArrayList arrayList = new ArrayList();
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        FloatingActionButton floatingActionButton = this.f58394u;
        ofFloat.addUpdateListener(new b(floatingActionButton.getAlpha(), f7, floatingActionButton.getScaleX(), f11, floatingActionButton.getScaleY(), this.f58388o, f12, new Matrix(this.f58399z)));
        arrayList.add(ofFloat);
        C7293b.a(animatorSet, arrayList);
        Context context = floatingActionButton.getContext();
        int integer = floatingActionButton.getContext().getResources().getInteger(ru.ozon.app.android.R.integer.material_motion_duration_long_1);
        TypedValue a11 = v7.b.a(ru.ozon.app.android.R.attr.motionDurationLong1, context);
        if (a11 != null && a11.type == 16) {
            integer = a11.data;
        }
        animatorSet.setDuration(integer);
        animatorSet.setInterpolator(C9774a.c(floatingActionButton.getContext(), C7292a.f69464b));
        return animatorSet;
    }

    @NonNull
    private static ValueAnimator k(@NonNull h hVar) {
        ValueAnimator valueAnimator = new ValueAnimator();
        valueAnimator.setInterpolator(f58366B);
        valueAnimator.setDuration(100L);
        valueAnimator.addListener(hVar);
        valueAnimator.addUpdateListener(hVar);
        valueAnimator.setFloatValues(0.0f, 1.0f);
        return valueAnimator;
    }

    final void A(C7299h c7299h) {
        this.f58385l = c7299h;
    }

    boolean B() {
        throw null;
    }

    final void C() {
        if (q()) {
            return;
        }
        Animator animator = this.f58384k;
        if (animator != null) {
            animator.cancel();
        }
        boolean z11 = this.f58385l == null;
        int i11 = Y.f42258g;
        FloatingActionButton floatingActionButton = this.f58394u;
        boolean z12 = floatingActionButton.isLaidOut() && !floatingActionButton.isInEditMode();
        Matrix matrix = this.f58399z;
        if (!z12) {
            floatingActionButton.c(0, false);
            floatingActionButton.setAlpha(1.0f);
            floatingActionButton.setScaleY(1.0f);
            floatingActionButton.setScaleX(1.0f);
            this.f58388o = 1.0f;
            h(1.0f, matrix);
            floatingActionButton.setImageMatrix(matrix);
            return;
        }
        if (floatingActionButton.getVisibility() != 0) {
            floatingActionButton.setAlpha(0.0f);
            floatingActionButton.setScaleY(z11 ? 0.4f : 0.0f);
            floatingActionButton.setScaleX(z11 ? 0.4f : 0.0f);
            float f7 = z11 ? 0.4f : 0.0f;
            this.f58388o = f7;
            h(f7, matrix);
            floatingActionButton.setImageMatrix(matrix);
        }
        C7299h c7299h = this.f58385l;
        AnimatorSet i12 = c7299h != null ? i(c7299h, 1.0f, 1.0f, 1.0f) : j(1.0f, 1.0f, 1.0f);
        i12.addListener(new com.google.android.material.floatingactionbutton.c(this));
        ArrayList<Animator.AnimatorListener> arrayList = this.f58391r;
        if (arrayList != null) {
            Iterator<Animator.AnimatorListener> it = arrayList.iterator();
            while (it.hasNext()) {
                i12.addListener(it.next());
            }
        }
        i12.start();
    }

    void D() {
        throw null;
    }

    final void E() {
        float f7 = this.f58388o;
        this.f58388o = f7;
        Matrix matrix = this.f58399z;
        h(f7, matrix);
        this.f58394u.setImageMatrix(matrix);
    }

    final void F() {
        int i11;
        int i12;
        int i13;
        int i14;
        Rect rect = this.f58396w;
        n(rect);
        i.e(this.f58378e, "Didn't initialize content background");
        boolean B11 = B();
        x7.b bVar = this.f58395v;
        if (B11) {
            super/*android.view.View*/.setBackgroundDrawable(new InsetDrawable((Drawable) this.f58378e, rect.left, rect.top, rect.right, rect.bottom));
        } else {
            LayerDrawable layerDrawable = this.f58378e;
            FloatingActionButton.a aVar = (FloatingActionButton.a) bVar;
            if (layerDrawable != null) {
                super/*android.view.View*/.setBackgroundDrawable(layerDrawable);
            } else {
                aVar.getClass();
            }
        }
        int i15 = rect.left;
        int i16 = rect.top;
        int i17 = rect.right;
        int i18 = rect.bottom;
        FloatingActionButton floatingActionButton = FloatingActionButton.this;
        floatingActionButton.f58338i.set(i15, i16, i17, i18);
        i11 = floatingActionButton.f58335f;
        int i19 = i15 + i11;
        i12 = floatingActionButton.f58335f;
        int i21 = i16 + i12;
        i13 = floatingActionButton.f58335f;
        int i22 = i17 + i13;
        i14 = floatingActionButton.f58335f;
        floatingActionButton.setPadding(i19, i21, i22, i18 + i14);
    }

    public final void e() {
        if (this.f58392s == null) {
            this.f58392s = new ArrayList<>();
        }
        this.f58392s.add(null);
    }

    final void f(@NonNull Animator.AnimatorListener animatorListener) {
        if (this.f58391r == null) {
            this.f58391r = new ArrayList<>();
        }
        this.f58391r.add(animatorListener);
    }

    final void g(@NonNull FloatingActionButton.b bVar) {
        if (this.f58393t == null) {
            this.f58393t = new ArrayList<>();
        }
        this.f58393t.add(bVar);
    }

    float l() {
        throw null;
    }

    final C7299h m() {
        return this.f58386m;
    }

    void n(@NonNull Rect rect) {
        int o11 = this.f58379f ? (this.f58383j - this.f58394u.o()) / 2 : 0;
        int max = Math.max(o11, (int) Math.ceil(l() + this.f58382i));
        int max2 = Math.max(o11, (int) Math.ceil(r1 * 1.5f));
        rect.set(max, max2, max, max2);
    }

    final C7299h o() {
        return this.f58385l;
    }

    final void p() {
        FloatingActionButton floatingActionButton = this.f58394u;
        if (floatingActionButton.getVisibility() == 0) {
            if (this.f58390q == 1) {
                return;
            }
        } else if (this.f58390q != 2) {
            return;
        }
        Animator animator = this.f58384k;
        if (animator != null) {
            animator.cancel();
        }
        int i11 = Y.f42258g;
        if (!floatingActionButton.isLaidOut() || floatingActionButton.isInEditMode()) {
            floatingActionButton.c(4, false);
            return;
        }
        C7299h c7299h = this.f58386m;
        AnimatorSet i12 = c7299h != null ? i(c7299h, 0.0f, 0.0f, 0.0f) : j(0.0f, 0.4f, 0.4f);
        i12.addListener(new com.google.android.material.floatingactionbutton.b(this));
        ArrayList<Animator.AnimatorListener> arrayList = this.f58392s;
        if (arrayList != null) {
            Iterator<Animator.AnimatorListener> it = arrayList.iterator();
            while (it.hasNext()) {
                i12.addListener(it.next());
            }
        }
        i12.start();
    }

    final boolean q() {
        if (this.f58394u.getVisibility() != 0) {
            if (this.f58390q != 2) {
                return false;
            }
        } else if (this.f58390q == 1) {
            return false;
        }
        return true;
    }

    final void r() {
        C10856g c10856g = this.f58375b;
        FloatingActionButton floatingActionButton = this.f58394u;
        if (c10856g != null) {
            C10857h.c(floatingActionButton, c10856g);
        }
        if (this instanceof com.google.android.material.floatingactionbutton.g) {
            return;
        }
        ViewTreeObserver viewTreeObserver = floatingActionButton.getViewTreeObserver();
        if (this.f58373A == null) {
            this.f58373A = new com.google.android.material.floatingactionbutton.f(this);
        }
        viewTreeObserver.addOnPreDrawListener(this.f58373A);
    }

    final void s() {
        ViewTreeObserver viewTreeObserver = this.f58394u.getViewTreeObserver();
        ViewTreeObserver.OnPreDrawListener onPreDrawListener = this.f58373A;
        if (onPreDrawListener != null) {
            viewTreeObserver.removeOnPreDrawListener(onPreDrawListener);
            this.f58373A = null;
        }
    }

    void t(float f7, float f11, float f12) {
        throw null;
    }

    final void u() {
        float rotation = this.f58394u.getRotation();
        if (this.f58387n != rotation) {
            this.f58387n = rotation;
        }
    }

    final void v() {
        ArrayList<f> arrayList = this.f58393t;
        if (arrayList != null) {
            Iterator<f> it = arrayList.iterator();
            if (it.hasNext()) {
                it.next().a();
                throw null;
            }
        }
    }

    final void w() {
        ArrayList<f> arrayList = this.f58393t;
        if (arrayList != null) {
            Iterator<f> it = arrayList.iterator();
            if (it.hasNext()) {
                it.next().b();
                throw null;
            }
        }
    }

    final void x(C7299h c7299h) {
        this.f58386m = c7299h;
    }

    final void y(int i11) {
        if (this.f58389p != i11) {
            this.f58389p = i11;
            E();
        }
    }

    final void z(@NonNull k kVar) {
        this.f58374a = kVar;
        C10856g c10856g = this.f58375b;
        if (c10856g != null) {
            c10856g.setShapeAppearanceModel(kVar);
        }
        Object obj = this.f58376c;
        if (obj instanceof o) {
            ((o) obj).setShapeAppearanceModel(kVar);
        }
        com.google.android.material.floatingactionbutton.a aVar = this.f58377d;
        if (aVar != null) {
            aVar.d(kVar);
        }
    }
}
