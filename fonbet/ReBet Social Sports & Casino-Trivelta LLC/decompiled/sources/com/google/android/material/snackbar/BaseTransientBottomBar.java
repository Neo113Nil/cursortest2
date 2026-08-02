package com.google.android.material.snackbar;

import android.accessibilityservice.AccessibilityServiceInfo;
import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Insets;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.util.AttributeSet;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewTreeObserver;
import android.view.WindowInsets;
import android.view.accessibility.AccessibilityManager;
import android.widget.FrameLayout;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.core.view.AbstractC2082d0;
import androidx.core.view.C2075a;
import androidx.core.view.F0;
import androidx.core.view.J;
import com.google.android.material.behavior.SwipeDismissBehavior;
import com.google.android.material.snackbar.a;
import com.plaid.internal.EnumC3631g;
import ja.AbstractC5104a;
import java.lang.ref.WeakReference;
import java.util.List;
import n0.AbstractC5597a;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import sa.AbstractC6344a;
import y0.z;

/* loaded from: classes3.dex */
public abstract class BaseTransientBottomBar {

    /* renamed from: a, reason: collision with root package name */
    public final int f36063a;

    /* renamed from: b, reason: collision with root package name */
    public final int f36064b;

    /* renamed from: c, reason: collision with root package name */
    public final int f36065c;

    /* renamed from: d, reason: collision with root package name */
    public final TimeInterpolator f36066d;

    /* renamed from: e, reason: collision with root package name */
    public final TimeInterpolator f36067e;

    /* renamed from: f, reason: collision with root package name */
    public final TimeInterpolator f36068f;

    /* renamed from: g, reason: collision with root package name */
    public final ViewGroup f36069g;

    /* renamed from: h, reason: collision with root package name */
    public final Context f36070h;

    /* renamed from: i, reason: collision with root package name */
    public final s f36071i;

    /* renamed from: j, reason: collision with root package name */
    public final Ha.a f36072j;

    /* renamed from: k, reason: collision with root package name */
    public int f36073k;

    /* renamed from: l, reason: collision with root package name */
    public boolean f36074l;

    /* renamed from: m, reason: collision with root package name */
    public q f36075m;

    /* renamed from: p, reason: collision with root package name */
    public int f36078p;

    /* renamed from: q, reason: collision with root package name */
    public int f36079q;

    /* renamed from: r, reason: collision with root package name */
    public int f36080r;

    /* renamed from: s, reason: collision with root package name */
    public int f36081s;

    /* renamed from: t, reason: collision with root package name */
    public int f36082t;

    /* renamed from: u, reason: collision with root package name */
    public int f36083u;

    /* renamed from: v, reason: collision with root package name */
    public boolean f36084v;

    /* renamed from: w, reason: collision with root package name */
    public List f36085w;

    /* renamed from: x, reason: collision with root package name */
    public Behavior f36086x;

    /* renamed from: y, reason: collision with root package name */
    public final AccessibilityManager f36087y;

    /* renamed from: A, reason: collision with root package name */
    public static final TimeInterpolator f36058A = AbstractC5104a.f53859b;

    /* renamed from: B, reason: collision with root package name */
    public static final TimeInterpolator f36059B = AbstractC5104a.f53858a;

    /* renamed from: C, reason: collision with root package name */
    public static final TimeInterpolator f36060C = AbstractC5104a.f53861d;
    private static final int[] SNACKBAR_STYLE_ATTR = {ia.c.f48245l0};

    /* renamed from: E, reason: collision with root package name */
    public static final String f36062E = BaseTransientBottomBar.class.getSimpleName();

    /* renamed from: D, reason: collision with root package name */
    public static final Handler f36061D = new Handler(Looper.getMainLooper(), new h());

    /* renamed from: n, reason: collision with root package name */
    public boolean f36076n = false;

    /* renamed from: o, reason: collision with root package name */
    public final Runnable f36077o = new i();

    /* renamed from: z, reason: collision with root package name */
    public a.b f36088z = new l();

    public static class Behavior extends SwipeDismissBehavior<View> {

        /* renamed from: l, reason: collision with root package name */
        public final r f36089l = new r(this);

        @Override // com.google.android.material.behavior.SwipeDismissBehavior
        public boolean J(View view) {
            return this.f36089l.a(view);
        }

        public final void U(BaseTransientBottomBar baseTransientBottomBar) {
            this.f36089l.c(baseTransientBottomBar);
        }

        @Override // com.google.android.material.behavior.SwipeDismissBehavior, androidx.coordinatorlayout.widget.CoordinatorLayout.c
        public boolean o(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
            this.f36089l.b(coordinatorLayout, view, motionEvent);
            return super.o(coordinatorLayout, view, motionEvent);
        }
    }

    public class a extends AnimatorListenerAdapter {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ int f36090a;

        public a(int i10) {
            this.f36090a = i10;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            BaseTransientBottomBar.this.Q(this.f36090a);
        }
    }

    public class b implements ValueAnimator.AnimatorUpdateListener {
        public b() {
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            BaseTransientBottomBar.this.f36071i.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
        }
    }

    public class c implements ValueAnimator.AnimatorUpdateListener {
        public c() {
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
            BaseTransientBottomBar.this.f36071i.setScaleX(floatValue);
            BaseTransientBottomBar.this.f36071i.setScaleY(floatValue);
        }
    }

    public class d extends AnimatorListenerAdapter {
        public d() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            BaseTransientBottomBar.this.R();
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            BaseTransientBottomBar.this.f36072j.a(BaseTransientBottomBar.this.f36065c - BaseTransientBottomBar.this.f36063a, BaseTransientBottomBar.this.f36063a);
        }
    }

    public class e implements ValueAnimator.AnimatorUpdateListener {
        public e() {
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            BaseTransientBottomBar.this.f36071i.setTranslationY(((Integer) valueAnimator.getAnimatedValue()).intValue());
        }
    }

    public class f extends AnimatorListenerAdapter {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ int f36096a;

        public f(int i10) {
            this.f36096a = i10;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            BaseTransientBottomBar.this.Q(this.f36096a);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            BaseTransientBottomBar.this.f36072j.b(0, BaseTransientBottomBar.this.f36064b);
        }
    }

    public class g implements ValueAnimator.AnimatorUpdateListener {
        public g() {
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            BaseTransientBottomBar.this.f36071i.setTranslationY(((Integer) valueAnimator.getAnimatedValue()).intValue());
        }
    }

    public class h implements Handler.Callback {
        @Override // android.os.Handler.Callback
        public boolean handleMessage(Message message) {
            int i10 = message.what;
            if (i10 == 0) {
                ((BaseTransientBottomBar) message.obj).a0();
                return true;
            }
            if (i10 != 1) {
                return false;
            }
            ((BaseTransientBottomBar) message.obj).K(message.arg1);
            return true;
        }
    }

    public class i implements Runnable {
        public i() {
        }

        @Override // java.lang.Runnable
        public void run() {
            BaseTransientBottomBar baseTransientBottomBar = BaseTransientBottomBar.this;
            if (baseTransientBottomBar.f36071i == null || baseTransientBottomBar.f36070h == null) {
                return;
            }
            int height = (xa.q.a(BaseTransientBottomBar.this.f36070h).height() - BaseTransientBottomBar.this.I()) + ((int) BaseTransientBottomBar.this.f36071i.getTranslationY());
            if (height >= BaseTransientBottomBar.this.f36082t) {
                BaseTransientBottomBar baseTransientBottomBar2 = BaseTransientBottomBar.this;
                baseTransientBottomBar2.f36083u = baseTransientBottomBar2.f36082t;
                return;
            }
            ViewGroup.LayoutParams layoutParams = BaseTransientBottomBar.this.f36071i.getLayoutParams();
            if (!(layoutParams instanceof ViewGroup.MarginLayoutParams)) {
                Log.w(BaseTransientBottomBar.f36062E, "Unable to apply gesture inset because layout params are not MarginLayoutParams");
                return;
            }
            BaseTransientBottomBar baseTransientBottomBar3 = BaseTransientBottomBar.this;
            baseTransientBottomBar3.f36083u = baseTransientBottomBar3.f36082t;
            ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin += BaseTransientBottomBar.this.f36082t - height;
            BaseTransientBottomBar.this.f36071i.requestLayout();
        }
    }

    public class j implements J {
        public j() {
        }

        @Override // androidx.core.view.J
        public F0 f(View view, F0 f02) {
            BaseTransientBottomBar.this.f36078p = f02.j();
            BaseTransientBottomBar.this.f36079q = f02.k();
            BaseTransientBottomBar.this.f36080r = f02.l();
            BaseTransientBottomBar.this.g0();
            return f02;
        }
    }

    public class k extends C2075a {
        public k() {
        }

        @Override // androidx.core.view.C2075a
        public void onInitializeAccessibilityNodeInfo(View view, z zVar) {
            super.onInitializeAccessibilityNodeInfo(view, zVar);
            zVar.a(PKIFailureInfo.badCertTemplate);
            zVar.B0(true);
        }

        @Override // androidx.core.view.C2075a
        public boolean performAccessibilityAction(View view, int i10, Bundle bundle) {
            if (i10 != 1048576) {
                return super.performAccessibilityAction(view, i10, bundle);
            }
            BaseTransientBottomBar.this.y();
            return true;
        }
    }

    public class l implements a.b {
        public l() {
        }

        @Override // com.google.android.material.snackbar.a.b
        public void a(int i10) {
            Handler handler = BaseTransientBottomBar.f36061D;
            handler.sendMessage(handler.obtainMessage(1, i10, 0, BaseTransientBottomBar.this));
        }

        @Override // com.google.android.material.snackbar.a.b
        public void show() {
            Handler handler = BaseTransientBottomBar.f36061D;
            handler.sendMessage(handler.obtainMessage(0, BaseTransientBottomBar.this));
        }
    }

    public class m implements Runnable {
        public m() {
        }

        @Override // java.lang.Runnable
        public void run() {
            BaseTransientBottomBar.this.Q(3);
        }
    }

    public class n implements SwipeDismissBehavior.c {
        public n() {
        }

        @Override // com.google.android.material.behavior.SwipeDismissBehavior.c
        public void a(View view) {
            if (view.getParent() != null) {
                view.setVisibility(8);
            }
            BaseTransientBottomBar.this.z(0);
        }

        @Override // com.google.android.material.behavior.SwipeDismissBehavior.c
        public void b(int i10) {
            if (i10 == 0) {
                com.google.android.material.snackbar.a.c().k(BaseTransientBottomBar.this.f36088z);
            } else if (i10 == 1 || i10 == 2) {
                com.google.android.material.snackbar.a.c().j(BaseTransientBottomBar.this.f36088z);
            }
        }
    }

    public class o implements Runnable {
        public o() {
        }

        @Override // java.lang.Runnable
        public void run() {
            s sVar = BaseTransientBottomBar.this.f36071i;
            if (sVar == null) {
                return;
            }
            if (sVar.getParent() != null) {
                BaseTransientBottomBar.this.f36071i.setVisibility(0);
            }
            if (BaseTransientBottomBar.this.f36071i.getAnimationMode() == 1) {
                BaseTransientBottomBar.this.c0();
            } else {
                BaseTransientBottomBar.this.e0();
            }
        }
    }

    public class p extends AnimatorListenerAdapter {
        public p() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            BaseTransientBottomBar.this.R();
        }
    }

    public static class q implements View.OnAttachStateChangeListener, ViewTreeObserver.OnGlobalLayoutListener {

        /* renamed from: a, reason: collision with root package name */
        public final WeakReference f36107a;

        /* renamed from: b, reason: collision with root package name */
        public final WeakReference f36108b;

        public q(BaseTransientBottomBar baseTransientBottomBar, View view) {
            this.f36107a = new WeakReference(baseTransientBottomBar);
            this.f36108b = new WeakReference(view);
        }

        public static q a(BaseTransientBottomBar baseTransientBottomBar, View view) {
            q qVar = new q(baseTransientBottomBar, view);
            if (view.isAttachedToWindow()) {
                xa.o.b(view, qVar);
            }
            view.addOnAttachStateChangeListener(qVar);
            return qVar;
        }

        public View b() {
            return (View) this.f36108b.get();
        }

        public void c() {
            if (this.f36108b.get() != null) {
                ((View) this.f36108b.get()).removeOnAttachStateChangeListener(this);
                xa.o.l((View) this.f36108b.get(), this);
            }
            this.f36108b.clear();
            this.f36107a.clear();
        }

        public final boolean d() {
            if (this.f36107a.get() != null) {
                return false;
            }
            c();
            return true;
        }

        @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
        public void onGlobalLayout() {
            if (d() || !((BaseTransientBottomBar) this.f36107a.get()).f36076n) {
                return;
            }
            ((BaseTransientBottomBar) this.f36107a.get()).S();
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewAttachedToWindow(View view) {
            if (d()) {
                return;
            }
            xa.o.b(view, this);
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewDetachedFromWindow(View view) {
            if (d()) {
                return;
            }
            xa.o.l(view, this);
        }
    }

    public static class r {

        /* renamed from: a, reason: collision with root package name */
        public a.b f36109a;

        public r(SwipeDismissBehavior swipeDismissBehavior) {
            swipeDismissBehavior.Q(0.1f);
            swipeDismissBehavior.O(0.6f);
            swipeDismissBehavior.R(0);
        }

        public boolean a(View view) {
            return view instanceof s;
        }

        public void b(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
            int actionMasked = motionEvent.getActionMasked();
            if (actionMasked == 0) {
                if (coordinatorLayout.w(view, (int) motionEvent.getX(), (int) motionEvent.getY())) {
                    com.google.android.material.snackbar.a.c().j(this.f36109a);
                }
            } else if (actionMasked == 1 || actionMasked == 3) {
                com.google.android.material.snackbar.a.c().k(this.f36109a);
            }
        }

        public void c(BaseTransientBottomBar baseTransientBottomBar) {
            this.f36109a = baseTransientBottomBar.f36088z;
        }
    }

    public static class s extends FrameLayout {

        /* renamed from: l, reason: collision with root package name */
        public static final View.OnTouchListener f36110l = new a();

        /* renamed from: a, reason: collision with root package name */
        public BaseTransientBottomBar f36111a;

        /* renamed from: b, reason: collision with root package name */
        public com.google.android.material.shape.n f36112b;

        /* renamed from: c, reason: collision with root package name */
        public int f36113c;

        /* renamed from: d, reason: collision with root package name */
        public final float f36114d;

        /* renamed from: e, reason: collision with root package name */
        public final float f36115e;

        /* renamed from: f, reason: collision with root package name */
        public final int f36116f;

        /* renamed from: g, reason: collision with root package name */
        public final int f36117g;

        /* renamed from: h, reason: collision with root package name */
        public ColorStateList f36118h;

        /* renamed from: i, reason: collision with root package name */
        public PorterDuff.Mode f36119i;

        /* renamed from: j, reason: collision with root package name */
        public Rect f36120j;

        /* renamed from: k, reason: collision with root package name */
        public boolean f36121k;

        public class a implements View.OnTouchListener {
            @Override // android.view.View.OnTouchListener
            public boolean onTouch(View view, MotionEvent motionEvent) {
                return true;
            }
        }

        public s(Context context, AttributeSet attributeSet) {
            super(La.a.d(context, attributeSet, 0, 0), attributeSet);
            Context context2 = getContext();
            TypedArray obtainStyledAttributes = context2.obtainStyledAttributes(attributeSet, ia.m.SnackbarLayout);
            if (obtainStyledAttributes.hasValue(ia.m.f48635E6)) {
                setElevation(obtainStyledAttributes.getDimensionPixelSize(ia.m.f48635E6, 0));
            }
            this.f36113c = obtainStyledAttributes.getInt(ia.m.f48595A6, 0);
            if (obtainStyledAttributes.hasValue(ia.m.f48655G6) || obtainStyledAttributes.hasValue(ia.m.f48665H6)) {
                this.f36112b = com.google.android.material.shape.n.e(context2, attributeSet, 0, 0).m();
            }
            this.f36114d = obtainStyledAttributes.getFloat(ia.m.f48605B6, 1.0f);
            setBackgroundTintList(Ca.c.a(context2, obtainStyledAttributes, ia.m.f48615C6));
            setBackgroundTintMode(xa.o.k(obtainStyledAttributes.getInt(ia.m.f48625D6, -1), PorterDuff.Mode.SRC_IN));
            this.f36115e = obtainStyledAttributes.getFloat(ia.m.f49097z6, 1.0f);
            this.f36116f = obtainStyledAttributes.getDimensionPixelSize(ia.m.f49087y6, -1);
            this.f36117g = obtainStyledAttributes.getDimensionPixelSize(ia.m.f48645F6, -1);
            obtainStyledAttributes.recycle();
            setOnTouchListener(f36110l);
            setFocusable(true);
            if (getBackground() == null) {
                setBackground(d());
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setBaseTransientBottomBar(BaseTransientBottomBar baseTransientBottomBar) {
            this.f36111a = baseTransientBottomBar;
        }

        public void c(ViewGroup viewGroup) {
            this.f36121k = true;
            viewGroup.addView(this);
            this.f36121k = false;
        }

        public final Drawable d() {
            int k10 = AbstractC6344a.k(this, ia.c.f48260t, ia.c.f48250o, getBackgroundOverlayColorAlpha());
            com.google.android.material.shape.n nVar = this.f36112b;
            Drawable x10 = nVar != null ? BaseTransientBottomBar.x(k10, nVar) : BaseTransientBottomBar.w(k10, getResources());
            if (this.f36118h == null) {
                return AbstractC5597a.r(x10);
            }
            Drawable r10 = AbstractC5597a.r(x10);
            r10.setTintList(this.f36118h);
            return r10;
        }

        public final void e(ViewGroup.MarginLayoutParams marginLayoutParams) {
            this.f36120j = new Rect(marginLayoutParams.leftMargin, marginLayoutParams.topMargin, marginLayoutParams.rightMargin, marginLayoutParams.bottomMargin);
        }

        public float getActionTextColorAlpha() {
            return this.f36115e;
        }

        public int getAnimationMode() {
            return this.f36113c;
        }

        public float getBackgroundOverlayColorAlpha() {
            return this.f36114d;
        }

        public int getMaxInlineActionWidth() {
            return this.f36117g;
        }

        public int getMaxWidth() {
            return this.f36116f;
        }

        @Override // android.view.ViewGroup, android.view.View
        public void onAttachedToWindow() {
            super.onAttachedToWindow();
            BaseTransientBottomBar baseTransientBottomBar = this.f36111a;
            if (baseTransientBottomBar != null) {
                baseTransientBottomBar.N();
            }
            requestApplyInsets();
        }

        @Override // android.view.ViewGroup, android.view.View
        public void onDetachedFromWindow() {
            super.onDetachedFromWindow();
            BaseTransientBottomBar baseTransientBottomBar = this.f36111a;
            if (baseTransientBottomBar != null) {
                baseTransientBottomBar.O();
            }
        }

        @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
        public void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
            super.onLayout(z10, i10, i11, i12, i13);
            BaseTransientBottomBar baseTransientBottomBar = this.f36111a;
            if (baseTransientBottomBar != null) {
                baseTransientBottomBar.P();
            }
        }

        @Override // android.widget.FrameLayout, android.view.View
        public void onMeasure(int i10, int i11) {
            super.onMeasure(i10, i11);
            if (this.f36116f > 0) {
                int measuredWidth = getMeasuredWidth();
                int i12 = this.f36116f;
                if (measuredWidth > i12) {
                    super.onMeasure(View.MeasureSpec.makeMeasureSpec(i12, 1073741824), i11);
                }
            }
        }

        public void setAnimationMode(int i10) {
            this.f36113c = i10;
        }

        @Override // android.view.View
        public void setBackground(Drawable drawable) {
            setBackgroundDrawable(drawable);
        }

        @Override // android.view.View
        public void setBackgroundDrawable(Drawable drawable) {
            if (drawable != null && this.f36118h != null) {
                drawable = AbstractC5597a.r(drawable.mutate());
                drawable.setTintList(this.f36118h);
                drawable.setTintMode(this.f36119i);
            }
            super.setBackgroundDrawable(drawable);
        }

        @Override // android.view.View
        public void setBackgroundTintList(ColorStateList colorStateList) {
            this.f36118h = colorStateList;
            if (getBackground() != null) {
                Drawable r10 = AbstractC5597a.r(getBackground().mutate());
                r10.setTintList(colorStateList);
                r10.setTintMode(this.f36119i);
                if (r10 != getBackground()) {
                    super.setBackgroundDrawable(r10);
                }
            }
        }

        @Override // android.view.View
        public void setBackgroundTintMode(PorterDuff.Mode mode) {
            this.f36119i = mode;
            if (getBackground() != null) {
                Drawable r10 = AbstractC5597a.r(getBackground().mutate());
                r10.setTintMode(mode);
                if (r10 != getBackground()) {
                    super.setBackgroundDrawable(r10);
                }
            }
        }

        @Override // android.view.View
        public void setLayoutParams(ViewGroup.LayoutParams layoutParams) {
            super.setLayoutParams(layoutParams);
            if (this.f36121k || !(layoutParams instanceof ViewGroup.MarginLayoutParams)) {
                return;
            }
            e((ViewGroup.MarginLayoutParams) layoutParams);
            BaseTransientBottomBar baseTransientBottomBar = this.f36111a;
            if (baseTransientBottomBar != null) {
                baseTransientBottomBar.g0();
            }
        }

        @Override // android.view.View
        public void setOnClickListener(View.OnClickListener onClickListener) {
            setOnTouchListener(onClickListener != null ? null : f36110l);
            super.setOnClickListener(onClickListener);
        }
    }

    public BaseTransientBottomBar(Context context, ViewGroup viewGroup, View view, Ha.a aVar) {
        if (viewGroup == null) {
            throw new IllegalArgumentException("Transient bottom bar must have non-null parent");
        }
        if (view == null) {
            throw new IllegalArgumentException("Transient bottom bar must have non-null content");
        }
        if (aVar == null) {
            throw new IllegalArgumentException("Transient bottom bar must have non-null callback");
        }
        this.f36069g = viewGroup;
        this.f36072j = aVar;
        this.f36070h = context;
        xa.l.a(context);
        s sVar = (s) LayoutInflater.from(context).inflate(F(), viewGroup, false);
        this.f36071i = sVar;
        sVar.setBaseTransientBottomBar(this);
        if (view instanceof SnackbarContentLayout) {
            SnackbarContentLayout snackbarContentLayout = (SnackbarContentLayout) view;
            snackbarContentLayout.c(sVar.getActionTextColorAlpha());
            snackbarContentLayout.setMaxInlineActionWidth(sVar.getMaxInlineActionWidth());
        }
        sVar.addView(view);
        sVar.setAccessibilityLiveRegion(1);
        sVar.setImportantForAccessibility(1);
        sVar.setFitsSystemWindows(true);
        AbstractC2082d0.x0(sVar, new j());
        AbstractC2082d0.l0(sVar, new k());
        this.f36087y = (AccessibilityManager) context.getSystemService("accessibility");
        this.f36065c = za.h.f(context, ia.c.f48214S, 250);
        this.f36063a = za.h.f(context, ia.c.f48214S, EnumC3631g.SDK_ASSET_ILLUSTRATION_SDK_NAVBAR_PLAID_LOGO_VALUE);
        this.f36064b = za.h.f(context, ia.c.f48215T, 75);
        this.f36066d = za.h.g(context, ia.c.f48225b0, f36059B);
        this.f36068f = za.h.g(context, ia.c.f48225b0, f36060C);
        this.f36067e = za.h.g(context, ia.c.f48225b0, f36058A);
    }

    public static GradientDrawable w(int i10, Resources resources) {
        float dimension = resources.getDimension(ia.e.f48308J0);
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setShape(0);
        gradientDrawable.setCornerRadius(dimension);
        gradientDrawable.setColor(i10);
        return gradientDrawable;
    }

    public static com.google.android.material.shape.i x(int i10, com.google.android.material.shape.n nVar) {
        com.google.android.material.shape.i iVar = new com.google.android.material.shape.i(nVar);
        iVar.f0(ColorStateList.valueOf(i10));
        return iVar;
    }

    public final ValueAnimator A(float... fArr) {
        ValueAnimator ofFloat = ValueAnimator.ofFloat(fArr);
        ofFloat.setInterpolator(this.f36066d);
        ofFloat.addUpdateListener(new b());
        return ofFloat;
    }

    public View B() {
        q qVar = this.f36075m;
        if (qVar == null) {
            return null;
        }
        return qVar.b();
    }

    public int C() {
        return this.f36073k;
    }

    public SwipeDismissBehavior D() {
        return new Behavior();
    }

    public final ValueAnimator E(float... fArr) {
        ValueAnimator ofFloat = ValueAnimator.ofFloat(fArr);
        ofFloat.setInterpolator(this.f36068f);
        ofFloat.addUpdateListener(new c());
        return ofFloat;
    }

    public int F() {
        return J() ? ia.i.f48493z : ia.i.f48470c;
    }

    public final int G() {
        int height = this.f36071i.getHeight();
        ViewGroup.LayoutParams layoutParams = this.f36071i.getLayoutParams();
        return layoutParams instanceof ViewGroup.MarginLayoutParams ? height + ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin : height;
    }

    public View H() {
        return this.f36071i;
    }

    public final int I() {
        int[] iArr = new int[2];
        this.f36071i.getLocationInWindow(iArr);
        return iArr[1] + this.f36071i.getHeight();
    }

    public boolean J() {
        TypedArray obtainStyledAttributes = this.f36070h.obtainStyledAttributes(SNACKBAR_STYLE_ATTR);
        int resourceId = obtainStyledAttributes.getResourceId(0, -1);
        obtainStyledAttributes.recycle();
        return resourceId != -1;
    }

    public final void K(int i10) {
        if (X() && this.f36071i.getVisibility() == 0) {
            u(i10);
        } else {
            Q(i10);
        }
    }

    public boolean L() {
        return com.google.android.material.snackbar.a.c().e(this.f36088z);
    }

    public final boolean M() {
        ViewGroup.LayoutParams layoutParams = this.f36071i.getLayoutParams();
        return (layoutParams instanceof CoordinatorLayout.f) && (((CoordinatorLayout.f) layoutParams).f() instanceof SwipeDismissBehavior);
    }

    public void N() {
        WindowInsets rootWindowInsets;
        Insets mandatorySystemGestureInsets;
        int i10;
        if (Build.VERSION.SDK_INT < 29 || (rootWindowInsets = this.f36071i.getRootWindowInsets()) == null) {
            return;
        }
        mandatorySystemGestureInsets = rootWindowInsets.getMandatorySystemGestureInsets();
        i10 = mandatorySystemGestureInsets.bottom;
        this.f36082t = i10;
        g0();
    }

    public void O() {
        if (L()) {
            f36061D.post(new m());
        }
    }

    public void P() {
        if (this.f36084v) {
            b0();
            this.f36084v = false;
        }
    }

    public void Q(int i10) {
        int size;
        com.google.android.material.snackbar.a.c().h(this.f36088z);
        if (this.f36085w != null && r2.size() - 1 >= 0) {
            android.support.v4.media.session.b.a(this.f36085w.get(size));
            throw null;
        }
        ViewParent parent = this.f36071i.getParent();
        if (parent instanceof ViewGroup) {
            ((ViewGroup) parent).removeView(this.f36071i);
        }
    }

    public void R() {
        int size;
        com.google.android.material.snackbar.a.c().i(this.f36088z);
        if (this.f36085w == null || r0.size() - 1 < 0) {
            return;
        }
        android.support.v4.media.session.b.a(this.f36085w.get(size));
        throw null;
    }

    public final void S() {
        this.f36081s = v();
        g0();
    }

    public BaseTransientBottomBar T(View view) {
        q qVar = this.f36075m;
        if (qVar != null) {
            qVar.c();
        }
        this.f36075m = view == null ? null : q.a(this, view);
        return this;
    }

    public BaseTransientBottomBar U(int i10) {
        this.f36071i.setAnimationMode(i10);
        return this;
    }

    public BaseTransientBottomBar V(int i10) {
        this.f36073k = i10;
        return this;
    }

    public final void W(CoordinatorLayout.f fVar) {
        SwipeDismissBehavior swipeDismissBehavior = this.f36086x;
        if (swipeDismissBehavior == null) {
            swipeDismissBehavior = D();
        }
        if (swipeDismissBehavior instanceof Behavior) {
            ((Behavior) swipeDismissBehavior).U(this);
        }
        swipeDismissBehavior.P(new n());
        fVar.o(swipeDismissBehavior);
        if (B() == null) {
            fVar.f18786g = 80;
        }
    }

    public boolean X() {
        AccessibilityManager accessibilityManager = this.f36087y;
        if (accessibilityManager == null) {
            return true;
        }
        List<AccessibilityServiceInfo> enabledAccessibilityServiceList = accessibilityManager.getEnabledAccessibilityServiceList(1);
        return enabledAccessibilityServiceList != null && enabledAccessibilityServiceList.isEmpty();
    }

    public final boolean Y() {
        return this.f36082t > 0 && !this.f36074l && M();
    }

    public void Z() {
        com.google.android.material.snackbar.a.c().m(C(), this.f36088z);
    }

    public final void a0() {
        if (this.f36071i.getParent() == null) {
            ViewGroup.LayoutParams layoutParams = this.f36071i.getLayoutParams();
            if (layoutParams instanceof CoordinatorLayout.f) {
                W((CoordinatorLayout.f) layoutParams);
            }
            this.f36071i.c(this.f36069g);
            S();
            this.f36071i.setVisibility(4);
        }
        if (this.f36071i.isLaidOut()) {
            b0();
        } else {
            this.f36084v = true;
        }
    }

    public final void b0() {
        if (X()) {
            t();
            return;
        }
        if (this.f36071i.getParent() != null) {
            this.f36071i.setVisibility(0);
        }
        R();
    }

    public final void c0() {
        ValueAnimator A10 = A(0.0f, 1.0f);
        ValueAnimator E10 = E(0.8f, 1.0f);
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playTogether(A10, E10);
        animatorSet.setDuration(this.f36063a);
        animatorSet.addListener(new p());
        animatorSet.start();
    }

    public final void d0(int i10) {
        ValueAnimator A10 = A(1.0f, 0.0f);
        A10.setDuration(this.f36064b);
        A10.addListener(new a(i10));
        A10.start();
    }

    public final void e0() {
        int G10 = G();
        this.f36071i.setTranslationY(G10);
        ValueAnimator valueAnimator = new ValueAnimator();
        valueAnimator.setIntValues(G10, 0);
        valueAnimator.setInterpolator(this.f36067e);
        valueAnimator.setDuration(this.f36065c);
        valueAnimator.addListener(new d());
        valueAnimator.addUpdateListener(new e());
        valueAnimator.start();
    }

    public final void f0(int i10) {
        ValueAnimator valueAnimator = new ValueAnimator();
        valueAnimator.setIntValues(0, G());
        valueAnimator.setInterpolator(this.f36067e);
        valueAnimator.setDuration(this.f36065c);
        valueAnimator.addListener(new f(i10));
        valueAnimator.addUpdateListener(new g());
        valueAnimator.start();
    }

    public final void g0() {
        ViewGroup.LayoutParams layoutParams = this.f36071i.getLayoutParams();
        if (!(layoutParams instanceof ViewGroup.MarginLayoutParams)) {
            Log.w(f36062E, "Unable to update margins because layout params are not MarginLayoutParams");
            return;
        }
        if (this.f36071i.f36120j == null) {
            Log.w(f36062E, "Unable to update margins because original view margins are not set");
            return;
        }
        if (this.f36071i.getParent() == null) {
            return;
        }
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
        int i10 = this.f36071i.f36120j.bottom + (B() != null ? this.f36081s : this.f36078p);
        int i11 = this.f36071i.f36120j.left + this.f36079q;
        int i12 = this.f36071i.f36120j.right + this.f36080r;
        int i13 = this.f36071i.f36120j.top;
        boolean z10 = (marginLayoutParams.bottomMargin == i10 && marginLayoutParams.leftMargin == i11 && marginLayoutParams.rightMargin == i12 && marginLayoutParams.topMargin == i13) ? false : true;
        if (z10) {
            marginLayoutParams.bottomMargin = i10;
            marginLayoutParams.leftMargin = i11;
            marginLayoutParams.rightMargin = i12;
            marginLayoutParams.topMargin = i13;
            this.f36071i.requestLayout();
        }
        if ((z10 || this.f36083u != this.f36082t) && Build.VERSION.SDK_INT >= 29 && Y()) {
            this.f36071i.removeCallbacks(this.f36077o);
            this.f36071i.post(this.f36077o);
        }
    }

    public void t() {
        this.f36071i.post(new o());
    }

    public final void u(int i10) {
        if (this.f36071i.getAnimationMode() == 1) {
            d0(i10);
        } else {
            f0(i10);
        }
    }

    public final int v() {
        if (B() == null) {
            return 0;
        }
        int[] iArr = new int[2];
        B().getLocationOnScreen(iArr);
        int i10 = iArr[1];
        int[] iArr2 = new int[2];
        this.f36069g.getLocationOnScreen(iArr2);
        return (iArr2[1] + this.f36069g.getHeight()) - i10;
    }

    public void y() {
        z(3);
    }

    public void z(int i10) {
        com.google.android.material.snackbar.a.c().b(this.f36088z, i10);
    }
}
