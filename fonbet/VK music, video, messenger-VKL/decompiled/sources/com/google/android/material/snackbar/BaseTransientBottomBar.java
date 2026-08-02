package com.google.android.material.snackbar;

import android.accessibilityservice.AccessibilityServiceInfo;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Insets;
import android.graphics.Point;
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
import android.view.Display;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.WindowInsets;
import android.view.WindowManager;
import android.view.WindowMetrics;
import android.view.accessibility.AccessibilityManager;
import android.view.animation.LinearInterpolator;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.R$attr;
import com.google.android.material.R$dimen;
import com.google.android.material.R$layout;
import com.google.android.material.R$styleable;
import com.google.android.material.behavior.SwipeDismissBehavior;
import com.google.android.material.shape.MaterialShapeDrawable;
import com.google.android.material.snackbar.BaseTransientBottomBar;
import com.google.android.material.snackbar.g;
import com.mbridge.msdk.playercommon.exoplayer2.source.ExtractorMediaSource;
import com.unity3d.services.UnityAdsConstants;
import java.util.List;
import java.util.WeakHashMap;
import xsna.am;
import xsna.b0u0;
import xsna.bqx0;
import xsna.dm10;
import xsna.fpo0;
import xsna.hk;
import xsna.ilq;
import xsna.iut0;
import xsna.j8z;
import xsna.mp6;
import xsna.op6;
import xsna.pp6;
import xsna.qm10;
import xsna.rq2;
import xsna.t1u0;
import xsna.tb30;
import xsna.u080;
import xsna.vlj;
import xsna.zm10;

/* loaded from: classes13.dex */
public abstract class BaseTransientBottomBar<B extends BaseTransientBottomBar<B>> {
    public final int a;
    public final int b;
    public final int c;
    public final TimeInterpolator d;
    public final TimeInterpolator e;
    public final TimeInterpolator f;

    @NonNull
    public final ViewGroup g;
    public final Context h;

    @NonNull
    public final g i;

    @NonNull
    public final vlj j;
    public int k;
    public int m;
    public int n;
    public int o;
    public int p;
    public int q;
    public boolean r;

    @Nullable
    public final AccessibilityManager s;
    public static final ilq u = rq2.b;
    public static final LinearInterpolator v = rq2.a;
    public static final j8z w = rq2.d;
    public static final int[] y = {R$attr.snackbarStyle};

    @NonNull
    public static final Handler x = new Handler(Looper.getMainLooper(), new a());
    public final b l = new b();

    @NonNull
    public final e t = new e();

    public static class Behavior extends SwipeDismissBehavior<View> {

        @NonNull
        public final f k;

        public Behavior() {
            f fVar = new f();
            this.h = Math.min(Math.max(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 0.1f), 1.0f);
            this.i = Math.min(Math.max(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 0.6f), 1.0f);
            this.f = 0;
            this.k = fVar;
        }

        @Override // com.google.android.material.behavior.SwipeDismissBehavior
        public final boolean D(View view) {
            this.k.getClass();
            return view instanceof g;
        }

        @Override // com.google.android.material.behavior.SwipeDismissBehavior, androidx.coordinatorlayout.widget.CoordinatorLayout.c
        public final boolean m(@NonNull CoordinatorLayout coordinatorLayout, @NonNull View view, @NonNull MotionEvent motionEvent) {
            f fVar = this.k;
            fVar.getClass();
            int actionMasked = motionEvent.getActionMasked();
            if (actionMasked != 0) {
                if (actionMasked == 1 || actionMasked == 3) {
                    com.google.android.material.snackbar.g.b().e(fVar.a);
                }
            } else if (coordinatorLayout.O((int) motionEvent.getX(), (int) motionEvent.getY(), view)) {
                com.google.android.material.snackbar.g.b().d(fVar.a);
            }
            return super.m(coordinatorLayout, view, motionEvent);
        }
    }

    public class a implements Handler.Callback {
        @Override // android.os.Handler.Callback
        public final boolean handleMessage(@NonNull Message message) {
            List<AccessibilityServiceInfo> enabledAccessibilityServiceList;
            int i = message.what;
            if (i == 0) {
                BaseTransientBottomBar baseTransientBottomBar = (BaseTransientBottomBar) message.obj;
                g gVar = baseTransientBottomBar.i;
                if (gVar.getParent() == null) {
                    ViewGroup.LayoutParams layoutParams = gVar.getLayoutParams();
                    if (layoutParams instanceof CoordinatorLayout.f) {
                        CoordinatorLayout.f fVar = (CoordinatorLayout.f) layoutParams;
                        Behavior behavior = new Behavior();
                        f fVar2 = behavior.k;
                        fVar2.getClass();
                        fVar2.a = baseTransientBottomBar.t;
                        behavior.c = new com.google.android.material.snackbar.e(baseTransientBottomBar);
                        fVar.c(behavior);
                        fVar.g = 80;
                    }
                    ViewGroup viewGroup = baseTransientBottomBar.g;
                    gVar.l = true;
                    viewGroup.addView(gVar);
                    gVar.l = false;
                    baseTransientBottomBar.g();
                    gVar.setVisibility(4);
                }
                WeakHashMap<View, b0u0> weakHashMap = iut0.a;
                if (gVar.isLaidOut()) {
                    baseTransientBottomBar.f();
                    return true;
                }
                baseTransientBottomBar.r = true;
                return true;
            }
            if (i != 1) {
                return false;
            }
            BaseTransientBottomBar baseTransientBottomBar2 = (BaseTransientBottomBar) message.obj;
            int i2 = message.arg1;
            g gVar2 = baseTransientBottomBar2.i;
            AccessibilityManager accessibilityManager = baseTransientBottomBar2.s;
            if ((accessibilityManager != null && ((enabledAccessibilityServiceList = accessibilityManager.getEnabledAccessibilityServiceList(1)) == null || !enabledAccessibilityServiceList.isEmpty())) || gVar2.getVisibility() != 0) {
                baseTransientBottomBar2.d();
                return true;
            }
            if (gVar2.getAnimationMode() == 1) {
                ValueAnimator ofFloat = ValueAnimator.ofFloat(1.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
                ofFloat.setInterpolator(baseTransientBottomBar2.d);
                ofFloat.addUpdateListener(new com.google.android.material.snackbar.a(baseTransientBottomBar2));
                ofFloat.setDuration(baseTransientBottomBar2.b);
                ofFloat.addListener(new mp6(baseTransientBottomBar2, i2));
                ofFloat.start();
                return true;
            }
            ValueAnimator valueAnimator = new ValueAnimator();
            g gVar3 = baseTransientBottomBar2.i;
            int height = gVar3.getHeight();
            ViewGroup.LayoutParams layoutParams2 = gVar3.getLayoutParams();
            if (layoutParams2 instanceof ViewGroup.MarginLayoutParams) {
                height += ((ViewGroup.MarginLayoutParams) layoutParams2).bottomMargin;
            }
            valueAnimator.setIntValues(0, height);
            valueAnimator.setInterpolator(baseTransientBottomBar2.e);
            valueAnimator.setDuration(baseTransientBottomBar2.c);
            valueAnimator.addListener(new op6(baseTransientBottomBar2, i2));
            valueAnimator.addUpdateListener(new com.google.android.material.snackbar.d(baseTransientBottomBar2));
            valueAnimator.start();
            return true;
        }
    }

    public class b implements Runnable {
        public b() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            Rect rect;
            WindowMetrics currentWindowMetrics;
            BaseTransientBottomBar baseTransientBottomBar = BaseTransientBottomBar.this;
            g gVar = baseTransientBottomBar.i;
            if (gVar != null) {
                WindowManager windowManager = (WindowManager) baseTransientBottomBar.h.getSystemService("window");
                if (Build.VERSION.SDK_INT >= 30) {
                    currentWindowMetrics = windowManager.getCurrentWindowMetrics();
                    rect = currentWindowMetrics.getBounds();
                } else {
                    Display defaultDisplay = windowManager.getDefaultDisplay();
                    Point point = new Point();
                    defaultDisplay.getRealSize(point);
                    rect = new Rect();
                    rect.right = point.x;
                    rect.bottom = point.y;
                }
                int height = rect.height();
                int[] iArr = new int[2];
                gVar.getLocationInWindow(iArr);
                int height2 = (height - (gVar.getHeight() + iArr[1])) + ((int) gVar.getTranslationY());
                int i = baseTransientBottomBar.p;
                if (height2 >= i) {
                    baseTransientBottomBar.q = i;
                    return;
                }
                ViewGroup.LayoutParams layoutParams = gVar.getLayoutParams();
                if (!(layoutParams instanceof ViewGroup.MarginLayoutParams)) {
                    ilq ilqVar = BaseTransientBottomBar.u;
                    return;
                }
                int i2 = baseTransientBottomBar.p;
                baseTransientBottomBar.q = i2;
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
                marginLayoutParams.bottomMargin = (i2 - height2) + marginLayoutParams.bottomMargin;
                gVar.requestLayout();
            }
        }
    }

    public class c implements u080 {
        public c() {
        }

        @Override // xsna.u080
        @NonNull
        public final bqx0 b(View view, @NonNull bqx0 bqx0Var) {
            int a = bqx0Var.a();
            BaseTransientBottomBar baseTransientBottomBar = BaseTransientBottomBar.this;
            baseTransientBottomBar.m = a;
            baseTransientBottomBar.n = bqx0Var.b();
            baseTransientBottomBar.o = bqx0Var.c();
            baseTransientBottomBar.g();
            return bqx0Var;
        }
    }

    public class d extends hk {
        public d() {
        }

        @Override // xsna.hk
        public final void onInitializeAccessibilityNodeInfo(View view, @NonNull am amVar) {
            super.onInitializeAccessibilityNodeInfo(view, amVar);
            amVar.a(ExtractorMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES);
            amVar.s(true);
        }

        @Override // xsna.hk
        public final boolean performAccessibilityAction(View view, int i, Bundle bundle) {
            if (i != 1048576) {
                return super.performAccessibilityAction(view, i, bundle);
            }
            BaseTransientBottomBar.this.a();
            return true;
        }
    }

    public class e implements g.b {
        public e() {
        }

        @Override // com.google.android.material.snackbar.g.b
        public final void a(int i) {
            Handler handler = BaseTransientBottomBar.x;
            handler.sendMessage(handler.obtainMessage(1, i, 0, BaseTransientBottomBar.this));
        }

        @Override // com.google.android.material.snackbar.g.b
        public final void show() {
            Handler handler = BaseTransientBottomBar.x;
            handler.sendMessage(handler.obtainMessage(0, BaseTransientBottomBar.this));
        }
    }

    public static class f {
        public e a;
    }

    public static class g extends FrameLayout {
        public static final a m = new a();

        @Nullable
        public BaseTransientBottomBar<?> b;

        @Nullable
        public final com.google.android.material.shape.a c;
        public int d;
        public final float e;
        public final float f;
        public final int g;
        public final int h;
        public ColorStateList i;
        public PorterDuff.Mode j;

        @Nullable
        public Rect k;
        public boolean l;

        public class a implements View.OnTouchListener {
            @Override // android.view.View.OnTouchListener
            @SuppressLint({"ClickableViewAccessibility"})
            public final boolean onTouch(View view, MotionEvent motionEvent) {
                return true;
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        public g(@NonNull Context context, AttributeSet attributeSet) {
            super(zm10.a(context, attributeSet, 0, 0), attributeSet);
            GradientDrawable gradientDrawable;
            Context context2 = getContext();
            TypedArray obtainStyledAttributes = context2.obtainStyledAttributes(attributeSet, R$styleable.SnackbarLayout);
            if (obtainStyledAttributes.hasValue(R$styleable.SnackbarLayout_elevation)) {
                float dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(R$styleable.SnackbarLayout_elevation, 0);
                WeakHashMap<View, b0u0> weakHashMap = iut0.a;
                setElevation(dimensionPixelSize);
            }
            this.d = obtainStyledAttributes.getInt(R$styleable.SnackbarLayout_animationMode, 0);
            if (obtainStyledAttributes.hasValue(R$styleable.SnackbarLayout_shapeAppearance) || obtainStyledAttributes.hasValue(R$styleable.SnackbarLayout_shapeAppearanceOverlay)) {
                this.c = com.google.android.material.shape.a.c(context2, attributeSet, 0, 0).a();
            }
            this.e = obtainStyledAttributes.getFloat(R$styleable.SnackbarLayout_backgroundOverlayColorAlpha, 1.0f);
            setBackgroundTintList(qm10.a(context2, obtainStyledAttributes, R$styleable.SnackbarLayout_backgroundTint));
            setBackgroundTintMode(t1u0.e(obtainStyledAttributes.getInt(R$styleable.SnackbarLayout_backgroundTintMode, -1), PorterDuff.Mode.SRC_IN));
            this.f = obtainStyledAttributes.getFloat(R$styleable.SnackbarLayout_actionTextColorAlpha, 1.0f);
            this.g = obtainStyledAttributes.getDimensionPixelSize(R$styleable.SnackbarLayout_android_maxWidth, -1);
            this.h = obtainStyledAttributes.getDimensionPixelSize(R$styleable.SnackbarLayout_maxActionInlineWidth, -1);
            obtainStyledAttributes.recycle();
            setOnTouchListener(m);
            setFocusable(true);
            if (getBackground() == null) {
                int g = dm10.g(getBackgroundOverlayColorAlpha(), dm10.d(R$attr.colorSurface, this), dm10.d(R$attr.colorOnSurface, this));
                com.google.android.material.shape.a aVar = this.c;
                if (aVar != null) {
                    ilq ilqVar = BaseTransientBottomBar.u;
                    MaterialShapeDrawable materialShapeDrawable = new MaterialShapeDrawable(aVar);
                    materialShapeDrawable.setFillColor(ColorStateList.valueOf(g));
                    gradientDrawable = materialShapeDrawable;
                } else {
                    Resources resources = getResources();
                    ilq ilqVar2 = BaseTransientBottomBar.u;
                    float dimension = resources.getDimension(R$dimen.mtrl_snackbar_background_corner_radius);
                    GradientDrawable gradientDrawable2 = new GradientDrawable();
                    gradientDrawable2.setShape(0);
                    gradientDrawable2.setCornerRadius(dimension);
                    gradientDrawable2.setColor(g);
                    gradientDrawable = gradientDrawable2;
                }
                ColorStateList colorStateList = this.i;
                if (colorStateList != null) {
                    gradientDrawable.setTintList(colorStateList);
                }
                WeakHashMap<View, b0u0> weakHashMap2 = iut0.a;
                setBackground(gradientDrawable);
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setBaseTransientBottomBar(BaseTransientBottomBar<?> baseTransientBottomBar) {
            this.b = baseTransientBottomBar;
        }

        public float getActionTextColorAlpha() {
            return this.f;
        }

        public int getAnimationMode() {
            return this.d;
        }

        public float getBackgroundOverlayColorAlpha() {
            return this.e;
        }

        public int getMaxInlineActionWidth() {
            return this.h;
        }

        public int getMaxWidth() {
            return this.g;
        }

        @Override // android.view.ViewGroup, android.view.View
        public final void onAttachedToWindow() {
            WindowInsets rootWindowInsets;
            Insets mandatorySystemGestureInsets;
            int i;
            super.onAttachedToWindow();
            BaseTransientBottomBar<?> baseTransientBottomBar = this.b;
            if (baseTransientBottomBar != null && Build.VERSION.SDK_INT >= 29 && (rootWindowInsets = baseTransientBottomBar.i.getRootWindowInsets()) != null) {
                mandatorySystemGestureInsets = rootWindowInsets.getMandatorySystemGestureInsets();
                i = mandatorySystemGestureInsets.bottom;
                baseTransientBottomBar.p = i;
                baseTransientBottomBar.g();
            }
            WeakHashMap<View, b0u0> weakHashMap = iut0.a;
            requestApplyInsets();
        }

        @Override // android.view.ViewGroup, android.view.View
        public final void onDetachedFromWindow() {
            boolean z;
            super.onDetachedFromWindow();
            BaseTransientBottomBar<?> baseTransientBottomBar = this.b;
            if (baseTransientBottomBar != null) {
                com.google.android.material.snackbar.g b = com.google.android.material.snackbar.g.b();
                e eVar = baseTransientBottomBar.t;
                synchronized (b.a) {
                    z = true;
                    if (!b.c(eVar)) {
                        g.c cVar = b.d;
                        if (!(cVar != null && cVar.a.get() == eVar)) {
                            z = false;
                        }
                    }
                }
                if (z) {
                    BaseTransientBottomBar.x.post(new pp6(baseTransientBottomBar, 0));
                }
            }
        }

        @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
        public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
            super.onLayout(z, i, i2, i3, i4);
            BaseTransientBottomBar<?> baseTransientBottomBar = this.b;
            if (baseTransientBottomBar == null || !baseTransientBottomBar.r) {
                return;
            }
            baseTransientBottomBar.f();
            baseTransientBottomBar.r = false;
        }

        @Override // android.widget.FrameLayout, android.view.View
        public void onMeasure(int i, int i2) {
            super.onMeasure(i, i2);
            int i3 = this.g;
            if (i3 <= 0 || getMeasuredWidth() <= i3) {
                return;
            }
            super.onMeasure(View.MeasureSpec.makeMeasureSpec(i3, 1073741824), i2);
        }

        public void setAnimationMode(int i) {
            this.d = i;
        }

        @Override // android.view.View
        public void setBackground(@Nullable Drawable drawable) {
            setBackgroundDrawable(drawable);
        }

        @Override // android.view.View
        public void setBackgroundDrawable(@Nullable Drawable drawable) {
            if (drawable != null && this.i != null) {
                drawable = drawable.mutate();
                drawable.setTintList(this.i);
                drawable.setTintMode(this.j);
            }
            super.setBackgroundDrawable(drawable);
        }

        @Override // android.view.View
        public void setBackgroundTintList(@Nullable ColorStateList colorStateList) {
            this.i = colorStateList;
            if (getBackground() != null) {
                Drawable mutate = getBackground().mutate();
                mutate.setTintList(colorStateList);
                mutate.setTintMode(this.j);
                if (mutate != getBackground()) {
                    super.setBackgroundDrawable(mutate);
                }
            }
        }

        @Override // android.view.View
        public void setBackgroundTintMode(@Nullable PorterDuff.Mode mode) {
            this.j = mode;
            if (getBackground() != null) {
                Drawable mutate = getBackground().mutate();
                mutate.setTintMode(mode);
                if (mutate != getBackground()) {
                    super.setBackgroundDrawable(mutate);
                }
            }
        }

        @Override // android.view.View
        public void setLayoutParams(ViewGroup.LayoutParams layoutParams) {
            super.setLayoutParams(layoutParams);
            if (this.l || !(layoutParams instanceof ViewGroup.MarginLayoutParams)) {
                return;
            }
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
            this.k = new Rect(marginLayoutParams.leftMargin, marginLayoutParams.topMargin, marginLayoutParams.rightMargin, marginLayoutParams.bottomMargin);
            BaseTransientBottomBar<?> baseTransientBottomBar = this.b;
            if (baseTransientBottomBar != null) {
                ilq ilqVar = BaseTransientBottomBar.u;
                baseTransientBottomBar.g();
            }
        }

        @Override // android.view.View
        public void setOnClickListener(@Nullable View.OnClickListener onClickListener) {
            setOnTouchListener(onClickListener != null ? null : m);
            super.setOnClickListener(onClickListener);
        }
    }

    public BaseTransientBottomBar(@NonNull Context context, @NonNull ViewGroup viewGroup, @NonNull View view, @NonNull vlj vljVar) {
        if (view == null) {
            throw new IllegalArgumentException("Transient bottom bar must have non-null content");
        }
        if (vljVar == null) {
            throw new IllegalArgumentException("Transient bottom bar must have non-null callback");
        }
        this.g = viewGroup;
        this.j = vljVar;
        this.h = context;
        fpo0.c(context, "Theme.AppCompat", fpo0.a);
        LayoutInflater from = LayoutInflater.from(context);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(y);
        int resourceId = obtainStyledAttributes.getResourceId(0, -1);
        obtainStyledAttributes.recycle();
        g gVar = (g) from.inflate(resourceId != -1 ? R$layout.mtrl_layout_snackbar : R$layout.design_layout_snackbar, viewGroup, false);
        this.i = gVar;
        gVar.setBaseTransientBottomBar(this);
        if (view instanceof SnackbarContentLayout) {
            SnackbarContentLayout snackbarContentLayout = (SnackbarContentLayout) view;
            float actionTextColorAlpha = gVar.getActionTextColorAlpha();
            if (actionTextColorAlpha != 1.0f) {
                snackbarContentLayout.c.setTextColor(dm10.g(actionTextColorAlpha, dm10.d(R$attr.colorSurface, snackbarContentLayout), snackbarContentLayout.c.getCurrentTextColor()));
            }
            snackbarContentLayout.setMaxInlineActionWidth(gVar.getMaxInlineActionWidth());
        }
        gVar.addView(view);
        WeakHashMap<View, b0u0> weakHashMap = iut0.a;
        gVar.setAccessibilityLiveRegion(1);
        gVar.setImportantForAccessibility(1);
        gVar.setFitsSystemWindows(true);
        iut0.d.c(gVar, new c());
        iut0.q(gVar, new d());
        this.s = (AccessibilityManager) context.getSystemService("accessibility");
        this.c = tb30.c(R$attr.motionDurationLong2, 250, context);
        this.a = tb30.c(R$attr.motionDurationLong2, 150, context);
        this.b = tb30.c(R$attr.motionDurationMedium1, 75, context);
        this.d = tb30.d(context, R$attr.motionEasingEmphasizedInterpolator, v);
        this.f = tb30.d(context, R$attr.motionEasingEmphasizedInterpolator, w);
        this.e = tb30.d(context, R$attr.motionEasingEmphasizedInterpolator, u);
    }

    public void a() {
        b(3);
    }

    public final void b(int i) {
        com.google.android.material.snackbar.g b2 = com.google.android.material.snackbar.g.b();
        e eVar = this.t;
        synchronized (b2.a) {
            try {
                if (b2.c(eVar)) {
                    b2.a(b2.c, i);
                } else {
                    g.c cVar = b2.d;
                    if (cVar != null && cVar.a.get() == eVar) {
                        b2.a(b2.d, i);
                    }
                }
            } finally {
            }
        }
    }

    @NonNull
    public final g c() {
        return this.i;
    }

    public final void d() {
        com.google.android.material.snackbar.g b2 = com.google.android.material.snackbar.g.b();
        e eVar = this.t;
        synchronized (b2.a) {
            try {
                if (b2.c(eVar)) {
                    b2.c = null;
                    g.c cVar = b2.d;
                    if (cVar != null && cVar != null) {
                        b2.c = cVar;
                        b2.d = null;
                        g.b bVar = cVar.a.get();
                        if (bVar != null) {
                            bVar.show();
                        } else {
                            b2.c = null;
                        }
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        ViewParent parent = this.i.getParent();
        if (parent instanceof ViewGroup) {
            ((ViewGroup) parent).removeView(this.i);
        }
    }

    public final void e() {
        com.google.android.material.snackbar.g b2 = com.google.android.material.snackbar.g.b();
        e eVar = this.t;
        synchronized (b2.a) {
            try {
                if (b2.c(eVar)) {
                    b2.f(b2.c);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void f() {
        List<AccessibilityServiceInfo> enabledAccessibilityServiceList;
        g gVar = this.i;
        AccessibilityManager accessibilityManager = this.s;
        if (accessibilityManager == null || ((enabledAccessibilityServiceList = accessibilityManager.getEnabledAccessibilityServiceList(1)) != null && enabledAccessibilityServiceList.isEmpty())) {
            gVar.post(new com.google.android.material.snackbar.f(this));
            return;
        }
        if (gVar.getParent() != null) {
            gVar.setVisibility(0);
        }
        e();
    }

    public final void g() {
        g gVar = this.i;
        ViewGroup.LayoutParams layoutParams = gVar.getLayoutParams();
        if (!(layoutParams instanceof ViewGroup.MarginLayoutParams) || gVar.k == null || gVar.getParent() == null) {
            return;
        }
        int i = this.m;
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
        Rect rect = gVar.k;
        int i2 = rect.bottom + i;
        int i3 = rect.left + this.n;
        int i4 = rect.right + this.o;
        int i5 = rect.top;
        boolean z = (marginLayoutParams.bottomMargin == i2 && marginLayoutParams.leftMargin == i3 && marginLayoutParams.rightMargin == i4 && marginLayoutParams.topMargin == i5) ? false : true;
        if (z) {
            marginLayoutParams.bottomMargin = i2;
            marginLayoutParams.leftMargin = i3;
            marginLayoutParams.rightMargin = i4;
            marginLayoutParams.topMargin = i5;
            gVar.requestLayout();
        }
        if ((z || this.q != this.p) && Build.VERSION.SDK_INT >= 29 && this.p > 0) {
            ViewGroup.LayoutParams layoutParams2 = gVar.getLayoutParams();
            if ((layoutParams2 instanceof CoordinatorLayout.f) && (((CoordinatorLayout.f) layoutParams2).a instanceof SwipeDismissBehavior)) {
                b bVar = this.l;
                gVar.removeCallbacks(bVar);
                gVar.post(bVar);
            }
        }
    }
}
