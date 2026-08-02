package androidx.media3.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.content.res.Resources;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.LinearInterpolator;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public final class E {

    /* renamed from: A, reason: collision with root package name */
    public boolean f22151A;

    /* renamed from: B, reason: collision with root package name */
    public boolean f22152B;

    /* renamed from: a, reason: collision with root package name */
    public final C2243l f22154a;

    /* renamed from: b, reason: collision with root package name */
    public final View f22155b;

    /* renamed from: c, reason: collision with root package name */
    public final ViewGroup f22156c;

    /* renamed from: d, reason: collision with root package name */
    public final ViewGroup f22157d;

    /* renamed from: e, reason: collision with root package name */
    public final ViewGroup f22158e;

    /* renamed from: f, reason: collision with root package name */
    public final ViewGroup f22159f;

    /* renamed from: g, reason: collision with root package name */
    public final ViewGroup f22160g;

    /* renamed from: h, reason: collision with root package name */
    public final ViewGroup f22161h;

    /* renamed from: i, reason: collision with root package name */
    public final ViewGroup f22162i;

    /* renamed from: j, reason: collision with root package name */
    public final View f22163j;

    /* renamed from: k, reason: collision with root package name */
    public final View f22164k;

    /* renamed from: l, reason: collision with root package name */
    public final AnimatorSet f22165l;

    /* renamed from: m, reason: collision with root package name */
    public final AnimatorSet f22166m;

    /* renamed from: n, reason: collision with root package name */
    public final AnimatorSet f22167n;

    /* renamed from: o, reason: collision with root package name */
    public final AnimatorSet f22168o;

    /* renamed from: p, reason: collision with root package name */
    public final AnimatorSet f22169p;

    /* renamed from: q, reason: collision with root package name */
    public final ValueAnimator f22170q;

    /* renamed from: r, reason: collision with root package name */
    public final ValueAnimator f22171r;

    /* renamed from: s, reason: collision with root package name */
    public final Runnable f22172s = new Runnable() { // from class: androidx.media3.ui.r
        @Override // java.lang.Runnable
        public final void run() {
            E.this.Y();
        }
    };

    /* renamed from: t, reason: collision with root package name */
    public final Runnable f22173t = new Runnable() { // from class: androidx.media3.ui.x
        @Override // java.lang.Runnable
        public final void run() {
            E.this.D();
        }
    };

    /* renamed from: u, reason: collision with root package name */
    public final Runnable f22174u = new Runnable() { // from class: androidx.media3.ui.y
        @Override // java.lang.Runnable
        public final void run() {
            E.this.H();
        }
    };

    /* renamed from: v, reason: collision with root package name */
    public final Runnable f22175v = new Runnable() { // from class: androidx.media3.ui.z
        @Override // java.lang.Runnable
        public final void run() {
            E.this.G();
        }
    };

    /* renamed from: w, reason: collision with root package name */
    public final Runnable f22176w = new Runnable() { // from class: androidx.media3.ui.A
        @Override // java.lang.Runnable
        public final void run() {
            E.this.E();
        }
    };

    /* renamed from: x, reason: collision with root package name */
    public final View.OnLayoutChangeListener f22177x = new View.OnLayoutChangeListener() { // from class: androidx.media3.ui.B
        @Override // android.view.View.OnLayoutChangeListener
        public final void onLayoutChange(View view, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17) {
            E.this.N(view, i10, i11, i12, i13, i14, i15, i16, i17);
        }
    };

    /* renamed from: C, reason: collision with root package name */
    public boolean f22153C = true;

    /* renamed from: z, reason: collision with root package name */
    public int f22179z = 0;

    /* renamed from: y, reason: collision with root package name */
    public final List f22178y = new ArrayList();

    public class a extends AnimatorListenerAdapter {
        public a() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            if (E.this.f22155b != null) {
                E.this.f22155b.setVisibility(4);
            }
            if (E.this.f22156c != null) {
                E.this.f22156c.setVisibility(4);
            }
            if (E.this.f22158e != null) {
                E.this.f22158e.setVisibility(4);
            }
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            if (!(E.this.f22163j instanceof DefaultTimeBar) || E.this.f22151A) {
                return;
            }
            ((DefaultTimeBar) E.this.f22163j).h(250L);
        }
    }

    public class b extends AnimatorListenerAdapter {
        public b() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            if (E.this.f22155b != null) {
                E.this.f22155b.setVisibility(0);
            }
            if (E.this.f22156c != null) {
                E.this.f22156c.setVisibility(0);
            }
            if (E.this.f22158e != null) {
                E.this.f22158e.setVisibility(E.this.f22151A ? 0 : 4);
            }
            if (!(E.this.f22163j instanceof DefaultTimeBar) || E.this.f22151A) {
                return;
            }
            ((DefaultTimeBar) E.this.f22163j).s(250L);
        }
    }

    public class c extends AnimatorListenerAdapter {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ C2243l f22182a;

        public c(C2243l c2243l) {
            this.f22182a = c2243l;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            E.this.V(1);
            if (E.this.f22152B) {
                this.f22182a.post(E.this.f22172s);
                E.this.f22152B = false;
            }
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            E.this.V(3);
        }
    }

    public class d extends AnimatorListenerAdapter {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ C2243l f22184a;

        public d(C2243l c2243l) {
            this.f22184a = c2243l;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            E.this.V(2);
            if (E.this.f22152B) {
                this.f22184a.post(E.this.f22172s);
                E.this.f22152B = false;
            }
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            E.this.V(3);
        }
    }

    public class e extends AnimatorListenerAdapter {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ C2243l f22186a;

        public e(C2243l c2243l) {
            this.f22186a = c2243l;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            E.this.V(2);
            if (E.this.f22152B) {
                this.f22186a.post(E.this.f22172s);
                E.this.f22152B = false;
            }
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            E.this.V(3);
        }
    }

    public class f extends AnimatorListenerAdapter {
        public f() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            E.this.V(0);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            E.this.V(4);
        }
    }

    public class g extends AnimatorListenerAdapter {
        public g() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            E.this.V(0);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            E.this.V(4);
        }
    }

    public class h extends AnimatorListenerAdapter {
        public h() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            if (E.this.f22159f != null) {
                E.this.f22159f.setVisibility(4);
            }
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            if (E.this.f22161h != null) {
                E.this.f22161h.setVisibility(0);
                E.this.f22161h.setTranslationX(E.this.f22161h.getWidth());
                E.this.f22161h.scrollTo(E.this.f22161h.getWidth(), 0);
            }
        }
    }

    public class i extends AnimatorListenerAdapter {
        public i() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            if (E.this.f22161h != null) {
                E.this.f22161h.setVisibility(4);
            }
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            if (E.this.f22159f != null) {
                E.this.f22159f.setVisibility(0);
            }
        }
    }

    public E(C2243l c2243l) {
        this.f22154a = c2243l;
        this.f22155b = c2243l.findViewById(X.f22322l);
        this.f22156c = (ViewGroup) c2243l.findViewById(X.f22317g);
        this.f22158e = (ViewGroup) c2243l.findViewById(X.f22333w);
        ViewGroup viewGroup = (ViewGroup) c2243l.findViewById(X.f22315e);
        this.f22157d = viewGroup;
        this.f22162i = (ViewGroup) c2243l.findViewById(X.f22309S);
        View findViewById = c2243l.findViewById(X.f22297G);
        this.f22163j = findViewById;
        this.f22159f = (ViewGroup) c2243l.findViewById(X.f22314d);
        this.f22160g = (ViewGroup) c2243l.findViewById(X.f22325o);
        this.f22161h = (ViewGroup) c2243l.findViewById(X.f22326p);
        View findViewById2 = c2243l.findViewById(X.f22291A);
        this.f22164k = findViewById2;
        View findViewById3 = c2243l.findViewById(X.f22336z);
        if (findViewById2 != null && findViewById3 != null) {
            findViewById2.setOnClickListener(new View.OnClickListener() { // from class: androidx.media3.ui.C
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    E.this.P(view);
                }
            });
            findViewById3.setOnClickListener(new View.OnClickListener() { // from class: androidx.media3.ui.C
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    E.this.P(view);
                }
            });
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(1.0f, 0.0f);
        ofFloat.setInterpolator(new LinearInterpolator());
        ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: androidx.media3.ui.D
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                E.d(E.this, valueAnimator);
            }
        });
        ofFloat.addListener(new a());
        ValueAnimator ofFloat2 = ValueAnimator.ofFloat(0.0f, 1.0f);
        ofFloat2.setInterpolator(new LinearInterpolator());
        ofFloat2.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: androidx.media3.ui.s
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                E.f(E.this, valueAnimator);
            }
        });
        ofFloat2.addListener(new b());
        Resources resources = c2243l.getResources();
        float dimension = resources.getDimension(U.f22266b) - resources.getDimension(U.f22267c);
        float dimension2 = resources.getDimension(U.f22266b);
        AnimatorSet animatorSet = new AnimatorSet();
        this.f22165l = animatorSet;
        animatorSet.setDuration(250L);
        animatorSet.addListener(new c(c2243l));
        animatorSet.play(ofFloat).with(J(0.0f, dimension, findViewById)).with(J(0.0f, dimension, viewGroup));
        AnimatorSet animatorSet2 = new AnimatorSet();
        this.f22166m = animatorSet2;
        animatorSet2.setDuration(250L);
        animatorSet2.addListener(new d(c2243l));
        animatorSet2.play(J(dimension, dimension2, findViewById)).with(J(dimension, dimension2, viewGroup));
        AnimatorSet animatorSet3 = new AnimatorSet();
        this.f22167n = animatorSet3;
        animatorSet3.setDuration(250L);
        animatorSet3.addListener(new e(c2243l));
        animatorSet3.play(ofFloat).with(J(0.0f, dimension2, findViewById)).with(J(0.0f, dimension2, viewGroup));
        AnimatorSet animatorSet4 = new AnimatorSet();
        this.f22168o = animatorSet4;
        animatorSet4.setDuration(250L);
        animatorSet4.addListener(new f());
        animatorSet4.play(ofFloat2).with(J(dimension, 0.0f, findViewById)).with(J(dimension, 0.0f, viewGroup));
        AnimatorSet animatorSet5 = new AnimatorSet();
        this.f22169p = animatorSet5;
        animatorSet5.setDuration(250L);
        animatorSet5.addListener(new g());
        animatorSet5.play(ofFloat2).with(J(dimension2, 0.0f, findViewById)).with(J(dimension2, 0.0f, viewGroup));
        ValueAnimator ofFloat3 = ValueAnimator.ofFloat(0.0f, 1.0f);
        this.f22170q = ofFloat3;
        ofFloat3.setDuration(250L);
        ofFloat3.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: androidx.media3.ui.v
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                E.a(E.this, valueAnimator);
            }
        });
        ofFloat3.addListener(new h());
        ValueAnimator ofFloat4 = ValueAnimator.ofFloat(1.0f, 0.0f);
        this.f22171r = ofFloat4;
        ofFloat4.setDuration(250L);
        ofFloat4.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: androidx.media3.ui.w
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                E.l(E.this, valueAnimator);
            }
        });
        ofFloat4.addListener(new i());
    }

    public static int B(View view) {
        if (view == null) {
            return 0;
        }
        int width = view.getWidth();
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (!(layoutParams instanceof ViewGroup.MarginLayoutParams)) {
            return width;
        }
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
        return width + marginLayoutParams.leftMargin + marginLayoutParams.rightMargin;
    }

    public static ObjectAnimator J(float f10, float f11, View view) {
        return ObjectAnimator.ofFloat(view, "translationY", f10, f11);
    }

    public static /* synthetic */ void a(E e10, ValueAnimator valueAnimator) {
        e10.getClass();
        e10.y(((Float) valueAnimator.getAnimatedValue()).floatValue());
    }

    public static /* synthetic */ void d(E e10, ValueAnimator valueAnimator) {
        e10.getClass();
        float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        View view = e10.f22155b;
        if (view != null) {
            view.setAlpha(floatValue);
        }
        ViewGroup viewGroup = e10.f22156c;
        if (viewGroup != null) {
            viewGroup.setAlpha(floatValue);
        }
        ViewGroup viewGroup2 = e10.f22158e;
        if (viewGroup2 != null) {
            viewGroup2.setAlpha(floatValue);
        }
    }

    public static /* synthetic */ void f(E e10, ValueAnimator valueAnimator) {
        e10.getClass();
        float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        View view = e10.f22155b;
        if (view != null) {
            view.setAlpha(floatValue);
        }
        ViewGroup viewGroup = e10.f22156c;
        if (viewGroup != null) {
            viewGroup.setAlpha(floatValue);
        }
        ViewGroup viewGroup2 = e10.f22158e;
        if (viewGroup2 != null) {
            viewGroup2.setAlpha(floatValue);
        }
    }

    public static /* synthetic */ void l(E e10, ValueAnimator valueAnimator) {
        e10.getClass();
        e10.y(((Float) valueAnimator.getAnimatedValue()).floatValue());
    }

    public static int z(View view) {
        if (view == null) {
            return 0;
        }
        int height = view.getHeight();
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (!(layoutParams instanceof ViewGroup.MarginLayoutParams)) {
            return height;
        }
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
        return height + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin;
    }

    public boolean A(View view) {
        return view != null && this.f22178y.contains(view);
    }

    public void C() {
        int i10 = this.f22179z;
        if (i10 == 3 || i10 == 2) {
            return;
        }
        R();
        if (!this.f22153C) {
            E();
        } else if (this.f22179z == 1) {
            H();
        } else {
            D();
        }
    }

    public final void D() {
        this.f22167n.start();
    }

    public final void E() {
        V(2);
    }

    public void F() {
        int i10 = this.f22179z;
        if (i10 == 3 || i10 == 2) {
            return;
        }
        R();
        E();
    }

    public final void G() {
        this.f22165l.start();
        Q(this.f22174u, 2000L);
    }

    public final void H() {
        this.f22166m.start();
    }

    public boolean I() {
        return this.f22179z == 0 && this.f22154a.n0();
    }

    public void K() {
        this.f22154a.addOnLayoutChangeListener(this.f22177x);
    }

    public void L() {
        this.f22154a.removeOnLayoutChangeListener(this.f22177x);
    }

    public void M(boolean z10, int i10, int i11, int i12, int i13) {
        View view = this.f22155b;
        if (view != null) {
            view.layout(0, 0, i12 - i10, i13 - i11);
        }
    }

    public final void N(View view, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17) {
        boolean a02 = a0();
        if (this.f22151A != a02) {
            this.f22151A = a02;
            view.post(new Runnable() { // from class: androidx.media3.ui.t
                @Override // java.lang.Runnable
                public final void run() {
                    E.this.Z();
                }
            });
        }
        boolean z10 = i12 - i10 != i16 - i14;
        if (this.f22151A || !z10) {
            return;
        }
        view.post(new Runnable() { // from class: androidx.media3.ui.u
            @Override // java.lang.Runnable
            public final void run() {
                E.this.O();
            }
        });
    }

    public final void O() {
        int i10;
        if (this.f22159f == null || this.f22160g == null) {
            return;
        }
        int width = (this.f22154a.getWidth() - this.f22154a.getPaddingLeft()) - this.f22154a.getPaddingRight();
        while (true) {
            if (this.f22160g.getChildCount() <= 1) {
                break;
            }
            int childCount = this.f22160g.getChildCount() - 2;
            View childAt = this.f22160g.getChildAt(childCount);
            this.f22160g.removeViewAt(childCount);
            this.f22159f.addView(childAt, 0);
        }
        View view = this.f22164k;
        if (view != null) {
            view.setVisibility(8);
        }
        int B10 = B(this.f22162i);
        int childCount2 = this.f22159f.getChildCount() - 1;
        for (int i11 = 0; i11 < childCount2; i11++) {
            B10 += B(this.f22159f.getChildAt(i11));
        }
        if (B10 <= width) {
            ViewGroup viewGroup = this.f22161h;
            if (viewGroup == null || viewGroup.getVisibility() != 0 || this.f22171r.isStarted()) {
                return;
            }
            this.f22170q.cancel();
            this.f22171r.start();
            return;
        }
        View view2 = this.f22164k;
        if (view2 != null) {
            view2.setVisibility(0);
            B10 += B(this.f22164k);
        }
        ArrayList arrayList = new ArrayList();
        for (int i12 = 0; i12 < childCount2; i12++) {
            View childAt2 = this.f22159f.getChildAt(i12);
            B10 -= B(childAt2);
            arrayList.add(childAt2);
            if (B10 <= width) {
                break;
            }
        }
        if (arrayList.isEmpty()) {
            return;
        }
        this.f22159f.removeViews(0, arrayList.size());
        for (i10 = 0; i10 < arrayList.size(); i10++) {
            this.f22160g.addView((View) arrayList.get(i10), this.f22160g.getChildCount() - 1);
        }
    }

    public final void P(View view) {
        S();
        if (view.getId() == X.f22291A) {
            this.f22170q.start();
        } else if (view.getId() == X.f22336z) {
            this.f22171r.start();
        }
    }

    public final void Q(Runnable runnable, long j10) {
        if (j10 >= 0) {
            this.f22154a.postDelayed(runnable, j10);
        }
    }

    public void R() {
        this.f22154a.removeCallbacks(this.f22176w);
        this.f22154a.removeCallbacks(this.f22173t);
        this.f22154a.removeCallbacks(this.f22175v);
        this.f22154a.removeCallbacks(this.f22174u);
    }

    public void S() {
        if (this.f22179z == 3) {
            return;
        }
        R();
        int showTimeoutMs = this.f22154a.getShowTimeoutMs();
        if (showTimeoutMs > 0) {
            if (!this.f22153C) {
                Q(this.f22176w, showTimeoutMs);
            } else if (this.f22179z == 1) {
                Q(this.f22174u, 2000L);
            } else {
                Q(this.f22175v, showTimeoutMs);
            }
        }
    }

    public void T(boolean z10) {
        this.f22153C = z10;
    }

    public void U(View view, boolean z10) {
        if (view == null) {
            return;
        }
        if (!z10) {
            view.setVisibility(8);
            this.f22178y.remove(view);
            return;
        }
        if (this.f22151A && W(view)) {
            view.setVisibility(4);
        } else {
            view.setVisibility(0);
        }
        this.f22178y.add(view);
    }

    public final void V(int i10) {
        int i11 = this.f22179z;
        this.f22179z = i10;
        if (i10 == 2) {
            this.f22154a.setVisibility(8);
        } else if (i11 == 2) {
            this.f22154a.setVisibility(0);
        }
        if (i11 != i10) {
            this.f22154a.o0();
        }
    }

    public final boolean W(View view) {
        int id2 = view.getId();
        return id2 == X.f22315e || id2 == X.f22296F || id2 == X.f22335y || id2 == X.f22300J || id2 == X.f22301K || id2 == X.f22327q || id2 == X.f22328r;
    }

    public void X() {
        if (!this.f22154a.n0()) {
            this.f22154a.setVisibility(0);
            this.f22154a.w0();
            this.f22154a.t0();
        }
        Y();
    }

    public final void Y() {
        if (!this.f22153C) {
            V(0);
            S();
            return;
        }
        int i10 = this.f22179z;
        if (i10 == 1) {
            this.f22168o.start();
        } else if (i10 == 2) {
            this.f22169p.start();
        } else if (i10 == 3) {
            this.f22152B = true;
        } else if (i10 == 4) {
            return;
        }
        S();
    }

    public final void Z() {
        ViewGroup viewGroup = this.f22158e;
        if (viewGroup != null) {
            viewGroup.setVisibility(this.f22151A ? 0 : 4);
        }
        if (this.f22163j != null) {
            int dimensionPixelSize = this.f22154a.getResources().getDimensionPixelSize(U.f22268d);
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.f22163j.getLayoutParams();
            if (marginLayoutParams != null) {
                if (this.f22151A) {
                    dimensionPixelSize = 0;
                }
                marginLayoutParams.bottomMargin = dimensionPixelSize;
                this.f22163j.setLayoutParams(marginLayoutParams);
            }
            View view = this.f22163j;
            if (view instanceof DefaultTimeBar) {
                DefaultTimeBar defaultTimeBar = (DefaultTimeBar) view;
                if (this.f22151A) {
                    defaultTimeBar.i(true);
                } else {
                    int i10 = this.f22179z;
                    if (i10 == 1) {
                        defaultTimeBar.i(false);
                    } else if (i10 != 3) {
                        defaultTimeBar.r();
                    }
                }
            }
        }
        for (View view2 : this.f22178y) {
            view2.setVisibility((this.f22151A && W(view2)) ? 4 : 0);
        }
    }

    public final boolean a0() {
        int width = (this.f22154a.getWidth() - this.f22154a.getPaddingLeft()) - this.f22154a.getPaddingRight();
        int height = (this.f22154a.getHeight() - this.f22154a.getPaddingBottom()) - this.f22154a.getPaddingTop();
        int B10 = B(this.f22156c);
        ViewGroup viewGroup = this.f22156c;
        int paddingLeft = B10 - (viewGroup != null ? viewGroup.getPaddingLeft() + this.f22156c.getPaddingRight() : 0);
        int z10 = z(this.f22156c);
        ViewGroup viewGroup2 = this.f22156c;
        return width <= Math.max(paddingLeft, B(this.f22162i) + B(this.f22164k)) || height <= (z10 - (viewGroup2 != null ? viewGroup2.getPaddingTop() + this.f22156c.getPaddingBottom() : 0)) + (z(this.f22157d) * 2);
    }

    public final void y(float f10) {
        if (this.f22161h != null) {
            this.f22161h.setTranslationX((int) (r0.getWidth() * (1.0f - f10)));
        }
        ViewGroup viewGroup = this.f22162i;
        if (viewGroup != null) {
            viewGroup.setAlpha(1.0f - f10);
        }
        ViewGroup viewGroup2 = this.f22159f;
        if (viewGroup2 != null) {
            viewGroup2.setAlpha(1.0f - f10);
        }
    }
}
