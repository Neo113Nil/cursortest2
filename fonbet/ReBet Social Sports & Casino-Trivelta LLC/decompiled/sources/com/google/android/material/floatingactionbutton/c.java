package com.google.android.material.floatingactionbutton;

import android.R;
import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.FloatEvaluator;
import android.animation.ObjectAnimator;
import android.animation.StateListAnimator;
import android.animation.TimeInterpolator;
import android.animation.TypeEvaluator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Matrix;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Build;
import android.util.Property;
import android.view.View;
import android.view.ViewTreeObserver;
import com.facebook.react.uimanager.ViewProps;
import com.google.android.material.shape.i;
import com.google.android.material.shape.j;
import com.google.android.material.shape.n;
import com.google.android.material.shape.q;
import ja.AbstractC5104a;
import ja.AbstractC5105b;
import ja.AbstractC5109f;
import ja.C5108e;
import ja.C5110g;
import java.util.ArrayList;
import java.util.Iterator;
import l0.AbstractC5338c;
import za.h;

/* loaded from: classes3.dex */
public class c {

    /* renamed from: B, reason: collision with root package name */
    public ViewTreeObserver.OnPreDrawListener f35510B;

    /* renamed from: a, reason: collision with root package name */
    public n f35511a;

    /* renamed from: b, reason: collision with root package name */
    public i f35512b;

    /* renamed from: c, reason: collision with root package name */
    public Drawable f35513c;

    /* renamed from: d, reason: collision with root package name */
    public com.google.android.material.floatingactionbutton.a f35514d;

    /* renamed from: e, reason: collision with root package name */
    public Drawable f35515e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f35516f;

    /* renamed from: h, reason: collision with root package name */
    public float f35518h;

    /* renamed from: i, reason: collision with root package name */
    public float f35519i;

    /* renamed from: j, reason: collision with root package name */
    public float f35520j;

    /* renamed from: k, reason: collision with root package name */
    public int f35521k;

    /* renamed from: l, reason: collision with root package name */
    public StateListAnimator f35522l;

    /* renamed from: m, reason: collision with root package name */
    public Animator f35523m;

    /* renamed from: n, reason: collision with root package name */
    public C5110g f35524n;

    /* renamed from: o, reason: collision with root package name */
    public C5110g f35525o;

    /* renamed from: q, reason: collision with root package name */
    public int f35527q;

    /* renamed from: s, reason: collision with root package name */
    public ArrayList f35529s;

    /* renamed from: t, reason: collision with root package name */
    public ArrayList f35530t;

    /* renamed from: u, reason: collision with root package name */
    public ArrayList f35531u;

    /* renamed from: v, reason: collision with root package name */
    public final FloatingActionButton f35532v;

    /* renamed from: w, reason: collision with root package name */
    public final Ea.b f35533w;

    /* renamed from: C, reason: collision with root package name */
    public static final TimeInterpolator f35504C = AbstractC5104a.f53860c;

    /* renamed from: D, reason: collision with root package name */
    public static final int f35505D = ia.c.f48214S;

    /* renamed from: E, reason: collision with root package name */
    public static final int f35506E = ia.c.f48225b0;

    /* renamed from: F, reason: collision with root package name */
    public static final int f35507F = ia.c.f48215T;

    /* renamed from: G, reason: collision with root package name */
    public static final int f35508G = ia.c.f48221Z;
    static final int[] PRESSED_ENABLED_STATE_SET = {R.attr.state_pressed, R.attr.state_enabled};
    static final int[] HOVERED_FOCUSED_ENABLED_STATE_SET = {R.attr.state_hovered, R.attr.state_focused, R.attr.state_enabled};
    static final int[] FOCUSED_ENABLED_STATE_SET = {R.attr.state_focused, R.attr.state_enabled};
    static final int[] HOVERED_ENABLED_STATE_SET = {R.attr.state_hovered, R.attr.state_enabled};
    static final int[] ENABLED_STATE_SET = {R.attr.state_enabled};
    static final int[] EMPTY_STATE_SET = new int[0];

    /* renamed from: g, reason: collision with root package name */
    public boolean f35517g = true;

    /* renamed from: p, reason: collision with root package name */
    public float f35526p = 1.0f;

    /* renamed from: r, reason: collision with root package name */
    public int f35528r = 0;

    /* renamed from: x, reason: collision with root package name */
    public final Rect f35534x = new Rect();

    /* renamed from: y, reason: collision with root package name */
    public final RectF f35535y = new RectF();

    /* renamed from: z, reason: collision with root package name */
    public final RectF f35536z = new RectF();

    /* renamed from: A, reason: collision with root package name */
    public final Matrix f35509A = new Matrix();

    public class a extends AnimatorListenerAdapter {

        /* renamed from: a, reason: collision with root package name */
        public boolean f35537a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ boolean f35538b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ g f35539c;

        public a(boolean z10, g gVar) {
            this.f35538b = z10;
            this.f35539c = gVar;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            this.f35537a = true;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            c.this.f35528r = 0;
            c.this.f35523m = null;
            if (this.f35537a) {
                return;
            }
            FloatingActionButton floatingActionButton = c.this.f35532v;
            boolean z10 = this.f35538b;
            floatingActionButton.b(z10 ? 8 : 4, z10);
            g gVar = this.f35539c;
            if (gVar != null) {
                gVar.b();
            }
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            c.this.f35532v.b(0, this.f35538b);
            c.this.f35528r = 1;
            c.this.f35523m = animator;
            this.f35537a = false;
        }
    }

    public class b extends AnimatorListenerAdapter {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ boolean f35541a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ g f35542b;

        public b(boolean z10, g gVar) {
            this.f35541a = z10;
            this.f35542b = gVar;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            c.this.f35528r = 0;
            c.this.f35523m = null;
            g gVar = this.f35542b;
            if (gVar != null) {
                gVar.a();
            }
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            c.this.f35532v.b(0, this.f35541a);
            c.this.f35528r = 2;
            c.this.f35523m = animator;
        }
    }

    /* renamed from: com.google.android.material.floatingactionbutton.c$c, reason: collision with other inner class name */
    public class C0501c extends AbstractC5109f {
        public C0501c() {
        }

        @Override // android.animation.TypeEvaluator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public Matrix evaluate(float f10, Matrix matrix, Matrix matrix2) {
            c.this.f35526p = f10;
            return super.evaluate(f10, matrix, matrix2);
        }
    }

    public class d implements TypeEvaluator {

        /* renamed from: a, reason: collision with root package name */
        public final FloatEvaluator f35545a = new FloatEvaluator();

        public d() {
        }

        @Override // android.animation.TypeEvaluator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public Float evaluate(float f10, Float f11, Float f12) {
            float floatValue = this.f35545a.evaluate(f10, (Number) f11, (Number) f12).floatValue();
            if (floatValue < 0.1f) {
                floatValue = 0.0f;
            }
            return Float.valueOf(floatValue);
        }
    }

    public static class e extends i {
        public e(n nVar) {
            super(nVar);
        }

        @Override // com.google.android.material.shape.i, android.graphics.drawable.Drawable
        public boolean isStateful() {
            return true;
        }
    }

    public interface f {
        void a();

        void b();
    }

    public interface g {
        void a();

        void b();
    }

    public c(FloatingActionButton floatingActionButton, Ea.b bVar) {
        this.f35532v = floatingActionButton;
        this.f35533w = bVar;
    }

    public static /* synthetic */ void a(c cVar, float f10, float f11, float f12, float f13, float f14, float f15, float f16, Matrix matrix, ValueAnimator valueAnimator) {
        cVar.getClass();
        float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        cVar.f35532v.setAlpha(AbstractC5104a.b(f10, f11, 0.0f, 0.2f, floatValue));
        cVar.f35532v.setScaleX(AbstractC5104a.a(f12, f13, floatValue));
        cVar.f35532v.setScaleY(AbstractC5104a.a(f14, f13, floatValue));
        cVar.f35526p = AbstractC5104a.a(f15, f16, floatValue);
        cVar.e(AbstractC5104a.a(f15, f16, floatValue), matrix);
        cVar.f35532v.setImageMatrix(matrix);
    }

    public void A() {
        i iVar = this.f35512b;
        if (iVar != null) {
            j.f(this.f35532v, iVar);
        }
    }

    public void B() {
        Z();
    }

    public void C() {
        ViewTreeObserver viewTreeObserver = this.f35532v.getViewTreeObserver();
        ViewTreeObserver.OnPreDrawListener onPreDrawListener = this.f35510B;
        if (onPreDrawListener != null) {
            viewTreeObserver.removeOnPreDrawListener(onPreDrawListener);
            this.f35510B = null;
        }
    }

    public void D(float f10, float f11, float f12) {
        if (this.f35532v.getStateListAnimator() == this.f35522l) {
            StateListAnimator i10 = i(f10, f11, f12);
            this.f35522l = i10;
            this.f35532v.setStateListAnimator(i10);
        }
        if (V()) {
            Z();
        }
    }

    public void E(Rect rect) {
        x0.f.h(this.f35515e, "Didn't initialize content background");
        if (!V()) {
            this.f35533w.a(this.f35515e);
        } else {
            this.f35533w.a(new InsetDrawable(this.f35515e, rect.left, rect.top, rect.right, rect.bottom));
        }
    }

    public void F() {
        ArrayList arrayList = this.f35531u;
        if (arrayList != null) {
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                ((f) it.next()).b();
            }
        }
    }

    public void G() {
        ArrayList arrayList = this.f35531u;
        if (arrayList != null) {
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                ((f) it.next()).a();
            }
        }
    }

    public void H(ColorStateList colorStateList) {
        i iVar = this.f35512b;
        if (iVar != null) {
            iVar.setTintList(colorStateList);
        }
        com.google.android.material.floatingactionbutton.a aVar = this.f35514d;
        if (aVar != null) {
            aVar.c(colorStateList);
        }
    }

    public void I(PorterDuff.Mode mode) {
        i iVar = this.f35512b;
        if (iVar != null) {
            iVar.setTintMode(mode);
        }
    }

    public final void J(float f10) {
        if (this.f35518h != f10) {
            this.f35518h = f10;
            D(f10, this.f35519i, this.f35520j);
        }
    }

    public void K(boolean z10) {
        this.f35516f = z10;
    }

    public final void L(C5110g c5110g) {
        this.f35525o = c5110g;
    }

    public final void M(float f10) {
        if (this.f35519i != f10) {
            this.f35519i = f10;
            D(this.f35518h, f10, this.f35520j);
        }
    }

    public final void N(float f10) {
        this.f35526p = f10;
        Matrix matrix = this.f35509A;
        e(f10, matrix);
        this.f35532v.setImageMatrix(matrix);
    }

    public final void O(int i10) {
        if (this.f35527q != i10) {
            this.f35527q = i10;
            Y();
        }
    }

    public void P(int i10) {
        this.f35521k = i10;
    }

    public final void Q(float f10) {
        if (this.f35520j != f10) {
            this.f35520j = f10;
            D(this.f35518h, this.f35519i, f10);
        }
    }

    public void R(ColorStateList colorStateList) {
        Drawable drawable = this.f35513c;
        if (drawable instanceof RippleDrawable) {
            ((RippleDrawable) drawable).setColor(Da.a.d(colorStateList));
        } else if (drawable != null) {
            drawable.setTintList(Da.a.d(colorStateList));
        }
    }

    public void S(boolean z10) {
        this.f35517g = z10;
        Z();
    }

    public final void T(n nVar) {
        this.f35511a = nVar;
        i iVar = this.f35512b;
        if (iVar != null) {
            iVar.setShapeAppearanceModel(nVar);
        }
        Object obj = this.f35513c;
        if (obj instanceof q) {
            ((q) obj).setShapeAppearanceModel(nVar);
        }
        com.google.android.material.floatingactionbutton.a aVar = this.f35514d;
        if (aVar != null) {
            aVar.f(nVar);
        }
    }

    public final void U(C5110g c5110g) {
        this.f35524n = c5110g;
    }

    public boolean V() {
        return this.f35533w.c() || w();
    }

    public final boolean W() {
        return this.f35532v.isLaidOut() && !this.f35532v.isInEditMode();
    }

    public void X(g gVar, boolean z10) {
        AnimatorSet h10;
        c cVar;
        if (z()) {
            return;
        }
        Animator animator = this.f35523m;
        if (animator != null) {
            animator.cancel();
        }
        boolean z11 = this.f35524n == null;
        if (!W()) {
            this.f35532v.b(0, z10);
            this.f35532v.setAlpha(1.0f);
            this.f35532v.setScaleY(1.0f);
            this.f35532v.setScaleX(1.0f);
            N(1.0f);
            if (gVar != null) {
                gVar.a();
                return;
            }
            return;
        }
        if (this.f35532v.getVisibility() != 0) {
            this.f35532v.setAlpha(0.0f);
            this.f35532v.setScaleY(z11 ? 0.4f : 0.0f);
            this.f35532v.setScaleX(z11 ? 0.4f : 0.0f);
            N(z11 ? 0.4f : 0.0f);
        }
        C5110g c5110g = this.f35524n;
        if (c5110g != null) {
            h10 = f(c5110g, 1.0f, 1.0f, 1.0f);
            cVar = this;
        } else {
            h10 = h(1.0f, 1.0f, 1.0f, f35505D, f35506E);
            cVar = this;
        }
        h10.addListener(new b(z10, gVar));
        ArrayList arrayList = cVar.f35529s;
        if (arrayList != null) {
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                h10.addListener((Animator.AnimatorListener) it.next());
            }
        }
        h10.start();
    }

    public final void Y() {
        N(this.f35526p);
    }

    public final void Z() {
        Rect rect = this.f35534x;
        q(rect);
        E(rect);
        this.f35533w.b(rect.left, rect.top, rect.right, rect.bottom);
    }

    public void a0(float f10) {
        i iVar = this.f35512b;
        if (iVar != null) {
            iVar.e0(f10);
        }
    }

    public final void b0(ObjectAnimator objectAnimator) {
        if (Build.VERSION.SDK_INT != 26) {
            return;
        }
        objectAnimator.setEvaluator(new d());
    }

    public final void e(float f10, Matrix matrix) {
        matrix.reset();
        if (this.f35532v.getDrawable() == null || this.f35527q == 0) {
            return;
        }
        RectF rectF = this.f35535y;
        RectF rectF2 = this.f35536z;
        rectF.set(0.0f, 0.0f, r0.getIntrinsicWidth(), r0.getIntrinsicHeight());
        int i10 = this.f35527q;
        rectF2.set(0.0f, 0.0f, i10, i10);
        matrix.setRectToRect(rectF, rectF2, Matrix.ScaleToFit.CENTER);
        int i11 = this.f35527q;
        matrix.postScale(f10, f10, i11 / 2.0f, i11 / 2.0f);
    }

    public final AnimatorSet f(C5110g c5110g, float f10, float f11, float f12) {
        ArrayList arrayList = new ArrayList();
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this.f35532v, (Property<FloatingActionButton, Float>) View.ALPHA, f10);
        c5110g.e(ViewProps.OPACITY).a(ofFloat);
        arrayList.add(ofFloat);
        ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(this.f35532v, (Property<FloatingActionButton, Float>) View.SCALE_X, f11);
        c5110g.e("scale").a(ofFloat2);
        b0(ofFloat2);
        arrayList.add(ofFloat2);
        ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(this.f35532v, (Property<FloatingActionButton, Float>) View.SCALE_Y, f11);
        c5110g.e("scale").a(ofFloat3);
        b0(ofFloat3);
        arrayList.add(ofFloat3);
        e(f12, this.f35509A);
        ObjectAnimator ofObject = ObjectAnimator.ofObject(this.f35532v, new C5108e(), new C0501c(), new Matrix(this.f35509A));
        c5110g.e("iconScale").a(ofObject);
        arrayList.add(ofObject);
        AnimatorSet animatorSet = new AnimatorSet();
        AbstractC5105b.a(animatorSet, arrayList);
        return animatorSet;
    }

    public com.google.android.material.floatingactionbutton.a g(int i10, ColorStateList colorStateList) {
        Context context = this.f35532v.getContext();
        com.google.android.material.floatingactionbutton.a aVar = new com.google.android.material.floatingactionbutton.a((n) x0.f.g(this.f35511a));
        aVar.e(AbstractC5338c.getColor(context, ia.d.f48278e), AbstractC5338c.getColor(context, ia.d.f48277d), AbstractC5338c.getColor(context, ia.d.f48275b), AbstractC5338c.getColor(context, ia.d.f48276c));
        aVar.d(i10);
        aVar.c(colorStateList);
        return aVar;
    }

    public final AnimatorSet h(final float f10, final float f11, final float f12, int i10, int i11) {
        AnimatorSet animatorSet = new AnimatorSet();
        ArrayList arrayList = new ArrayList();
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        final float alpha = this.f35532v.getAlpha();
        final float scaleX = this.f35532v.getScaleX();
        final float scaleY = this.f35532v.getScaleY();
        final float f13 = this.f35526p;
        final Matrix matrix = new Matrix(this.f35509A);
        ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.google.android.material.floatingactionbutton.b
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                c.a(c.this, alpha, f10, scaleX, f11, scaleY, f13, f12, matrix, valueAnimator);
            }
        });
        arrayList.add(ofFloat);
        AbstractC5105b.a(animatorSet, arrayList);
        animatorSet.setDuration(h.f(this.f35532v.getContext(), i10, this.f35532v.getContext().getResources().getInteger(ia.h.f48462b)));
        animatorSet.setInterpolator(h.g(this.f35532v.getContext(), i11, AbstractC5104a.f53859b));
        return animatorSet;
    }

    public final StateListAnimator i(float f10, float f11, float f12) {
        StateListAnimator stateListAnimator = new StateListAnimator();
        stateListAnimator.addState(PRESSED_ENABLED_STATE_SET, j(f10, f12));
        stateListAnimator.addState(HOVERED_FOCUSED_ENABLED_STATE_SET, j(f10, f11));
        stateListAnimator.addState(FOCUSED_ENABLED_STATE_SET, j(f10, f11));
        stateListAnimator.addState(HOVERED_ENABLED_STATE_SET, j(f10, f11));
        AnimatorSet animatorSet = new AnimatorSet();
        ArrayList arrayList = new ArrayList();
        arrayList.add(ObjectAnimator.ofFloat(this.f35532v, ViewProps.ELEVATION, f10).setDuration(0L));
        arrayList.add(ObjectAnimator.ofFloat(this.f35532v, (Property<FloatingActionButton, Float>) View.TRANSLATION_Z, 0.0f).setDuration(100L));
        animatorSet.playSequentially((Animator[]) arrayList.toArray(new Animator[0]));
        animatorSet.setInterpolator(f35504C);
        stateListAnimator.addState(ENABLED_STATE_SET, animatorSet);
        stateListAnimator.addState(EMPTY_STATE_SET, j(0.0f, 0.0f));
        return stateListAnimator;
    }

    public final Animator j(float f10, float f11) {
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.play(ObjectAnimator.ofFloat(this.f35532v, ViewProps.ELEVATION, f10).setDuration(0L)).with(ObjectAnimator.ofFloat(this.f35532v, (Property<FloatingActionButton, Float>) View.TRANSLATION_Z, f11).setDuration(100L));
        animatorSet.setInterpolator(f35504C);
        return animatorSet;
    }

    public i k() {
        return new e((n) x0.f.g(this.f35511a));
    }

    public final Drawable l() {
        return this.f35515e;
    }

    public float m() {
        return this.f35532v.getElevation();
    }

    public boolean n() {
        return this.f35516f;
    }

    public final C5110g o() {
        return this.f35525o;
    }

    public float p() {
        return this.f35519i;
    }

    public void q(Rect rect) {
        if (this.f35533w.c()) {
            int u10 = u();
            int max = Math.max(u10, (int) Math.ceil(this.f35517g ? m() + this.f35520j : 0.0f));
            int max2 = Math.max(u10, (int) Math.ceil(r1 * 1.5f));
            rect.set(max, max2, max, max2);
            return;
        }
        if (!w()) {
            rect.set(0, 0, 0, 0);
        } else {
            int sizeDimension = (this.f35521k - this.f35532v.getSizeDimension()) / 2;
            rect.set(sizeDimension, sizeDimension, sizeDimension, sizeDimension);
        }
    }

    public float r() {
        return this.f35520j;
    }

    public final n s() {
        return this.f35511a;
    }

    public final C5110g t() {
        return this.f35524n;
    }

    public int u() {
        if (this.f35516f) {
            return Math.max((this.f35521k - this.f35532v.getSizeDimension()) / 2, 0);
        }
        return 0;
    }

    public void v(g gVar, boolean z10) {
        c cVar;
        AnimatorSet h10;
        if (y()) {
            return;
        }
        Animator animator = this.f35523m;
        if (animator != null) {
            animator.cancel();
        }
        if (!W()) {
            this.f35532v.b(z10 ? 8 : 4, z10);
            if (gVar != null) {
                gVar.b();
                return;
            }
            return;
        }
        C5110g c5110g = this.f35525o;
        if (c5110g != null) {
            h10 = f(c5110g, 0.0f, 0.0f, 0.0f);
            cVar = this;
        } else {
            cVar = this;
            h10 = cVar.h(0.0f, 0.4f, 0.4f, f35507F, f35508G);
        }
        h10.addListener(new a(z10, gVar));
        ArrayList arrayList = cVar.f35530t;
        if (arrayList != null) {
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                h10.addListener((Animator.AnimatorListener) it.next());
            }
        }
        h10.start();
    }

    public final boolean w() {
        return this.f35516f && this.f35532v.getSizeDimension() < this.f35521k;
    }

    public void x(ColorStateList colorStateList, PorterDuff.Mode mode, ColorStateList colorStateList2, int i10) {
        Drawable drawable;
        i k10 = k();
        this.f35512b = k10;
        k10.setTintList(colorStateList);
        if (mode != null) {
            this.f35512b.setTintMode(mode);
        }
        this.f35512b.T(this.f35532v.getContext());
        if (i10 > 0) {
            this.f35514d = g(i10, colorStateList);
            drawable = new LayerDrawable(new Drawable[]{(Drawable) x0.f.g(this.f35514d), (Drawable) x0.f.g(this.f35512b)});
        } else {
            this.f35514d = null;
            drawable = this.f35512b;
        }
        RippleDrawable rippleDrawable = new RippleDrawable(Da.a.d(colorStateList2), drawable, null);
        this.f35513c = rippleDrawable;
        this.f35515e = rippleDrawable;
    }

    public boolean y() {
        return this.f35532v.getVisibility() == 0 ? this.f35528r == 1 : this.f35528r != 2;
    }

    public boolean z() {
        return this.f35532v.getVisibility() != 0 ? this.f35528r == 2 : this.f35528r != 1;
    }
}
