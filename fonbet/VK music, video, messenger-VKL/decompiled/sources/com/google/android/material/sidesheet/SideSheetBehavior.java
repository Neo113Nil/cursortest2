package com.google.android.material.sidesheet;

import android.R;
import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.Property;
import android.util.TypedValue;
import android.view.Gravity;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.customview.view.AbsSavedState;
import com.google.android.material.R$string;
import com.google.android.material.R$style;
import com.google.android.material.R$styleable;
import com.google.android.material.shape.MaterialShapeDrawable;
import com.google.android.material.sidesheet.SideSheetBehavior;
import com.mbridge.msdk.playercommon.exoplayer2.source.ExtractorMediaSource;
import com.unity3d.services.UnityAdsConstants;
import io.requery.android.database.sqlite.SQLiteDatabase;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.WeakHashMap;
import xsna.a0z;
import xsna.am;
import xsna.b0u0;
import xsna.cdj0;
import xsna.hlj0;
import xsna.i5s;
import xsna.ilq;
import xsna.iut0;
import xsna.lhg;
import xsna.mc;
import xsna.nl10;
import xsna.okg0;
import xsna.qd0;
import xsna.qm10;
import xsna.rm10;
import xsna.rq2;
import xsna.ryo;
import xsna.sm10;
import xsna.tgw;
import xsna.ucj0;
import xsna.uuj;
import xsna.wog0;
import xsna.wu5;
import xsna.wuj;
import xsna.xih;
import xsna.xwk;
import xsna.zm;
import xsna.zut0;

/* loaded from: classes13.dex */
public class SideSheetBehavior<V extends View> extends CoordinatorLayout.c<V> implements nl10 {
    public static final int y = R$string.side_sheet_accessibility_pane_title;
    public static final int z = R$style.Widget_Material3_SideSheet;
    public cdj0 b;

    @Nullable
    public final MaterialShapeDrawable c;

    @Nullable
    public final ColorStateList d;
    public final com.google.android.material.shape.a e;
    public final SideSheetBehavior<V>.c f;
    public final float g;
    public final boolean h;
    public int i;

    @Nullable
    public zut0 j;
    public boolean k;
    public final float l;
    public int m;
    public int n;
    public int o;
    public int p;

    @Nullable
    public WeakReference<V> q;

    @Nullable
    public WeakReference<View> r;
    public final int s;

    @Nullable
    public VelocityTracker t;

    @Nullable
    public sm10 u;
    public int v;

    @NonNull
    public final LinkedHashSet w;
    public final a x;

    public class a extends zut0.c {
        public a() {
        }

        @Override // xsna.zut0.c
        public final int clampViewPositionHorizontal(@NonNull View view, int i, int i2) {
            SideSheetBehavior sideSheetBehavior = SideSheetBehavior.this;
            return xwk.b(i, sideSheetBehavior.b.g(), sideSheetBehavior.b.f());
        }

        @Override // xsna.zut0.c
        public final int clampViewPositionVertical(@NonNull View view, int i, int i2) {
            return view.getTop();
        }

        @Override // xsna.zut0.c
        public final int getViewHorizontalDragRange(@NonNull View view) {
            SideSheetBehavior sideSheetBehavior = SideSheetBehavior.this;
            return sideSheetBehavior.m + sideSheetBehavior.p;
        }

        @Override // xsna.zut0.c
        public final void onViewDragStateChanged(int i) {
            if (i == 1) {
                SideSheetBehavior sideSheetBehavior = SideSheetBehavior.this;
                if (sideSheetBehavior.h) {
                    sideSheetBehavior.E(1);
                }
            }
        }

        @Override // xsna.zut0.c
        public final void onViewPositionChanged(@NonNull View view, int i, int i2, int i3, int i4) {
            ViewGroup.MarginLayoutParams marginLayoutParams;
            SideSheetBehavior sideSheetBehavior = SideSheetBehavior.this;
            WeakReference<View> weakReference = sideSheetBehavior.r;
            View view2 = weakReference != null ? weakReference.get() : null;
            if (view2 != null && (marginLayoutParams = (ViewGroup.MarginLayoutParams) view2.getLayoutParams()) != null) {
                sideSheetBehavior.b.p(marginLayoutParams, view.getLeft(), view.getRight());
                view2.setLayoutParams(marginLayoutParams);
            }
            LinkedHashSet linkedHashSet = sideSheetBehavior.w;
            if (linkedHashSet.isEmpty()) {
                return;
            }
            sideSheetBehavior.b.b(i);
            Iterator it = linkedHashSet.iterator();
            while (it.hasNext()) {
                ((ucj0) it.next()).b();
            }
        }

        /* JADX WARN: Code restructure failed: missing block: B:18:0x0051, code lost:
        
            if (java.lang.Math.abs(r4 - r0.b.d()) < java.lang.Math.abs(r4 - r0.b.e())) goto L19;
         */
        /* JADX WARN: Code restructure failed: missing block: B:8:0x0021, code lost:
        
            if (r0.b.l(r3) == false) goto L19;
         */
        @Override // xsna.zut0.c
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final void onViewReleased(@NonNull View view, float f, float f2) {
            int i;
            SideSheetBehavior sideSheetBehavior = SideSheetBehavior.this;
            if (!sideSheetBehavior.b.k(f)) {
                if (sideSheetBehavior.b.n(view, f)) {
                    if (!sideSheetBehavior.b.m(f, f2)) {
                    }
                    i = 5;
                } else {
                    if (f == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT || Math.abs(f) <= Math.abs(f2)) {
                        int left = view.getLeft();
                    }
                    i = 5;
                }
                sideSheetBehavior.G(view, i, true);
            }
            i = 3;
            sideSheetBehavior.G(view, i, true);
        }

        @Override // xsna.zut0.c
        public final boolean tryCaptureView(@NonNull View view, int i) {
            WeakReference<V> weakReference;
            SideSheetBehavior sideSheetBehavior = SideSheetBehavior.this;
            return (sideSheetBehavior.i == 1 || (weakReference = sideSheetBehavior.q) == null || weakReference.get() != view) ? false : true;
        }
    }

    public class b extends AnimatorListenerAdapter {
        public b() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public final void onAnimationEnd(Animator animator) {
            SideSheetBehavior sideSheetBehavior = SideSheetBehavior.this;
            sideSheetBehavior.E(5);
            WeakReference<V> weakReference = sideSheetBehavior.q;
            if (weakReference == null || weakReference.get() == null) {
                return;
            }
            sideSheetBehavior.q.get().requestLayout();
        }
    }

    public class c {
        public int a;
        public boolean b;
        public final qd0 c = new qd0(this, 13);

        public c() {
        }

        public final void a(int i) {
            SideSheetBehavior sideSheetBehavior = SideSheetBehavior.this;
            WeakReference<V> weakReference = sideSheetBehavior.q;
            if (weakReference == null || weakReference.get() == null) {
                return;
            }
            this.a = i;
            if (this.b) {
                return;
            }
            V v = sideSheetBehavior.q.get();
            WeakHashMap<View, b0u0> weakHashMap = iut0.a;
            v.postOnAnimation(this.c);
            this.b = true;
        }
    }

    public SideSheetBehavior() {
        this.f = new c();
        this.h = true;
        this.i = 5;
        this.l = 0.1f;
        this.s = -1;
        this.w = new LinkedHashSet();
        this.x = new a();
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public final boolean C(@NonNull CoordinatorLayout coordinatorLayout, @NonNull V v, @NonNull MotionEvent motionEvent) {
        VelocityTracker velocityTracker;
        if (!v.isShown()) {
            return false;
        }
        int actionMasked = motionEvent.getActionMasked();
        if (this.i == 1 && actionMasked == 0) {
            return true;
        }
        if (F()) {
            this.j.m(motionEvent);
        }
        if (actionMasked == 0 && (velocityTracker = this.t) != null) {
            velocityTracker.recycle();
            this.t = null;
        }
        if (this.t == null) {
            this.t = VelocityTracker.obtain();
        }
        this.t.addMovement(motionEvent);
        if (F() && actionMasked == 2 && !this.k && F()) {
            float abs = Math.abs(this.v - motionEvent.getX());
            zut0 zut0Var = this.j;
            if (abs > zut0Var.b) {
                zut0Var.c(motionEvent.getPointerId(motionEvent.getActionIndex()), v);
            }
        }
        return !this.k;
    }

    public final void D(int i) {
        if (i == 1 || i == 2) {
            throw new IllegalArgumentException(i5s.a(new StringBuilder("STATE_"), i == 1 ? "DRAGGING" : "SETTLING", " should not be set externally."));
        }
        WeakReference<V> weakReference = this.q;
        if (weakReference == null || weakReference.get() == null) {
            E(i);
            return;
        }
        V v = this.q.get();
        xih xihVar = new xih(this, i, 1);
        ViewParent parent = v.getParent();
        if (parent != null && parent.isLayoutRequested()) {
            WeakHashMap<View, b0u0> weakHashMap = iut0.a;
            if (v.isAttachedToWindow()) {
                v.post(xihVar);
                return;
            }
        }
        xihVar.run();
    }

    public final void E(int i) {
        V v;
        if (this.i == i) {
            return;
        }
        this.i = i;
        WeakReference<V> weakReference = this.q;
        if (weakReference == null || (v = weakReference.get()) == null) {
            return;
        }
        int i2 = this.i == 5 ? 4 : 0;
        if (v.getVisibility() != i2) {
            v.setVisibility(i2);
        }
        Iterator it = this.w.iterator();
        while (it.hasNext()) {
            ((ucj0) it.next()).a();
        }
        H();
    }

    public final boolean F() {
        if (this.j != null) {
            return this.h || this.i == 1;
        }
        return false;
    }

    public final void G(View view, int i, boolean z2) {
        int d;
        if (i == 3) {
            d = this.b.d();
        } else {
            if (i != 5) {
                throw new IllegalArgumentException(lhg.a(i, "Invalid state to get outer edge offset: "));
            }
            d = this.b.e();
        }
        zut0 zut0Var = this.j;
        if (zut0Var == null || (!z2 ? zut0Var.u(d, view.getTop(), view) : zut0Var.s(d, view.getTop()))) {
            E(i);
        } else {
            E(2);
            this.f.a(i);
        }
    }

    public final void H() {
        V v;
        WeakReference<V> weakReference = this.q;
        if (weakReference == null || (v = weakReference.get()) == null) {
            return;
        }
        iut0.n(SQLiteDatabase.OPEN_PRIVATECACHE, v);
        iut0.k(0, v);
        iut0.n(ExtractorMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES, v);
        iut0.k(0, v);
        final int i = 5;
        if (this.i != 5) {
            iut0.o(v, am.a.m, null, new zm() { // from class: xsna.flj0
                @Override // xsna.zm
                public final boolean a(View view) {
                    int i2 = SideSheetBehavior.y;
                    SideSheetBehavior.this.D(i);
                    return true;
                }
            });
        }
        final int i2 = 3;
        if (this.i != 3) {
            iut0.o(v, am.a.k, null, new zm() { // from class: xsna.flj0
                @Override // xsna.zm
                public final boolean a(View view) {
                    int i22 = SideSheetBehavior.y;
                    SideSheetBehavior.this.D(i2);
                    return true;
                }
            });
        }
    }

    @Override // xsna.nl10
    public final void a(@NonNull wu5 wu5Var) {
        sm10 sm10Var = this.u;
        if (sm10Var == null) {
            return;
        }
        sm10Var.f = wu5Var;
    }

    @Override // xsna.nl10
    public final void b() {
        int i;
        final ViewGroup.MarginLayoutParams marginLayoutParams;
        sm10 sm10Var = this.u;
        if (sm10Var == null) {
            return;
        }
        wu5 wu5Var = sm10Var.f;
        ValueAnimator.AnimatorUpdateListener animatorUpdateListener = null;
        sm10Var.f = null;
        int i2 = 5;
        if (wu5Var == null || Build.VERSION.SDK_INT < 34) {
            D(5);
            return;
        }
        cdj0 cdj0Var = this.b;
        if (cdj0Var != null && cdj0Var.j() != 0) {
            i2 = 3;
        }
        b bVar = new b();
        WeakReference<View> weakReference = this.r;
        final View view = weakReference != null ? weakReference.get() : null;
        if (view != null && (marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams()) != null) {
            final int c2 = this.b.c(marginLayoutParams);
            animatorUpdateListener = new ValueAnimator.AnimatorUpdateListener() { // from class: xsna.glj0
                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                    SideSheetBehavior.this.b.o(marginLayoutParams, rq2.c(c2, 0, valueAnimator.getAnimatedFraction()));
                    view.requestLayout();
                }
            };
        }
        V v = sm10Var.b;
        boolean z2 = wu5Var.d == 0;
        WeakHashMap<View, b0u0> weakHashMap = iut0.a;
        boolean z3 = (Gravity.getAbsoluteGravity(i2, v.getLayoutDirection()) & 3) == 3;
        float scaleX = v.getScaleX() * v.getWidth();
        ViewGroup.LayoutParams layoutParams = v.getLayoutParams();
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) layoutParams;
            i = z3 ? marginLayoutParams2.leftMargin : marginLayoutParams2.rightMargin;
        } else {
            i = 0;
        }
        float f = scaleX + i;
        Property property = View.TRANSLATION_X;
        if (z3) {
            f = -f;
        }
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(v, (Property<V, Float>) property, f);
        if (animatorUpdateListener != null) {
            ofFloat.addUpdateListener(animatorUpdateListener);
        }
        ofFloat.setInterpolator(new ilq());
        ofFloat.setDuration(rq2.c(sm10Var.c, sm10Var.d, wu5Var.c));
        ofFloat.addListener(new rm10(sm10Var, z2, i2));
        ofFloat.addListener(bVar);
        ofFloat.start();
    }

    @Override // xsna.nl10
    public final void d() {
        sm10 sm10Var = this.u;
        if (sm10Var == null) {
            return;
        }
        V v = sm10Var.b;
        wu5 wu5Var = sm10Var.f;
        sm10Var.f = null;
        if (wu5Var == null) {
            return;
        }
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playTogether(ObjectAnimator.ofFloat(v, (Property<V, Float>) View.SCALE_X, 1.0f), ObjectAnimator.ofFloat(v, (Property<V, Float>) View.SCALE_Y, 1.0f));
        if (v instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) v;
            for (int i = 0; i < viewGroup.getChildCount(); i++) {
                animatorSet.playTogether(ObjectAnimator.ofFloat(viewGroup.getChildAt(i), (Property<View, Float>) View.SCALE_Y, 1.0f));
            }
        }
        animatorSet.setDuration(sm10Var.e);
        animatorSet.start();
    }

    @Override // xsna.nl10
    public final void e(@NonNull wu5 wu5Var) {
        ViewGroup.MarginLayoutParams marginLayoutParams;
        sm10 sm10Var = this.u;
        if (sm10Var == null) {
            return;
        }
        cdj0 cdj0Var = this.b;
        int i = (cdj0Var == null || cdj0Var.j() == 0) ? 5 : 3;
        wu5 wu5Var2 = sm10Var.f;
        sm10Var.f = wu5Var;
        if (wu5Var2 != null) {
            sm10Var.a(wu5Var.c, i, wu5Var.d == 0);
        }
        WeakReference<V> weakReference = this.q;
        if (weakReference == null || weakReference.get() == null) {
            return;
        }
        V v = this.q.get();
        WeakReference<View> weakReference2 = this.r;
        View view = weakReference2 != null ? weakReference2.get() : null;
        if (view == null || (marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams()) == null) {
            return;
        }
        this.b.o(marginLayoutParams, (int) ((v.getScaleX() * this.m) + this.p));
        view.requestLayout();
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public final void i(@NonNull CoordinatorLayout.f fVar) {
        this.q = null;
        this.j = null;
        this.u = null;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public final void l() {
        this.q = null;
        this.j = null;
        this.u = null;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public final boolean m(@NonNull CoordinatorLayout coordinatorLayout, @NonNull V v, @NonNull MotionEvent motionEvent) {
        zut0 zut0Var;
        VelocityTracker velocityTracker;
        if ((!v.isShown() && iut0.f(v) == null) || !this.h) {
            this.k = true;
            return false;
        }
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0 && (velocityTracker = this.t) != null) {
            velocityTracker.recycle();
            this.t = null;
        }
        if (this.t == null) {
            this.t = VelocityTracker.obtain();
        }
        this.t.addMovement(motionEvent);
        if (actionMasked == 0) {
            this.v = (int) motionEvent.getX();
        } else if ((actionMasked == 1 || actionMasked == 3) && this.k) {
            this.k = false;
            return false;
        }
        return (this.k || (zut0Var = this.j) == null || !zut0Var.t(motionEvent)) ? false : true;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public final boolean n(@NonNull CoordinatorLayout coordinatorLayout, @NonNull V v, int i) {
        V v2;
        V v3;
        int h;
        int i2;
        View findViewById;
        WeakHashMap<View, b0u0> weakHashMap = iut0.a;
        if (coordinatorLayout.getFitsSystemWindows() && !v.getFitsSystemWindows()) {
            v.setFitsSystemWindows(true);
        }
        WeakReference<V> weakReference = this.q;
        MaterialShapeDrawable materialShapeDrawable = this.c;
        if (weakReference == null) {
            this.q = new WeakReference<>(v);
            this.u = new sm10(v);
            if (materialShapeDrawable != null) {
                v.setBackground(materialShapeDrawable);
                float f = this.g;
                if (f == -1.0f) {
                    f = v.getElevation();
                }
                materialShapeDrawable.setElevation(f);
            } else {
                ColorStateList colorStateList = this.d;
                if (colorStateList != null) {
                    v.setBackgroundTintList(colorStateList);
                }
            }
            int i3 = this.i == 5 ? 4 : 0;
            if (v.getVisibility() != i3) {
                v.setVisibility(i3);
            }
            H();
            if (v.getImportantForAccessibility() == 0) {
                v.setImportantForAccessibility(1);
            }
            if (iut0.f(v) == null) {
                iut0.r(v, v.getResources().getString(y));
            }
        }
        int i4 = Gravity.getAbsoluteGravity(((CoordinatorLayout.f) v.getLayoutParams()).c, i) == 3 ? 1 : 0;
        cdj0 cdj0Var = this.b;
        if (cdj0Var == null || cdj0Var.j() != i4) {
            CoordinatorLayout.f fVar = null;
            com.google.android.material.shape.a aVar = this.e;
            if (i4 == 0) {
                this.b = new okg0(this);
                if (aVar != null) {
                    WeakReference<V> weakReference2 = this.q;
                    if (weakReference2 != null && (v3 = weakReference2.get()) != null && (v3.getLayoutParams() instanceof CoordinatorLayout.f)) {
                        fVar = (CoordinatorLayout.f) v3.getLayoutParams();
                    }
                    if (fVar == null || ((ViewGroup.MarginLayoutParams) fVar).rightMargin <= 0) {
                        new wog0();
                        new wog0();
                        new wog0();
                        new wog0();
                        new ryo();
                        new ryo();
                        new ryo();
                        new ryo();
                        wuj wujVar = aVar.a;
                        wuj wujVar2 = aVar.b;
                        wuj wujVar3 = aVar.c;
                        wuj wujVar4 = aVar.d;
                        uuj uujVar = aVar.e;
                        uuj uujVar2 = aVar.h;
                        ryo ryoVar = aVar.i;
                        ryo ryoVar2 = aVar.j;
                        ryo ryoVar3 = aVar.k;
                        ryo ryoVar4 = aVar.l;
                        mc mcVar = new mc(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
                        mc mcVar2 = new mc(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
                        com.google.android.material.shape.a aVar2 = new com.google.android.material.shape.a();
                        aVar2.a = wujVar;
                        aVar2.b = wujVar2;
                        aVar2.c = wujVar3;
                        aVar2.d = wujVar4;
                        aVar2.e = uujVar;
                        aVar2.f = mcVar;
                        aVar2.g = mcVar2;
                        aVar2.h = uujVar2;
                        aVar2.i = ryoVar;
                        aVar2.j = ryoVar2;
                        aVar2.k = ryoVar3;
                        aVar2.l = ryoVar4;
                        if (materialShapeDrawable != null) {
                            materialShapeDrawable.setShapeAppearanceModel(aVar2);
                        }
                    }
                }
            } else {
                if (i4 != 1) {
                    throw new IllegalArgumentException(tgw.b(i4, "Invalid sheet edge position value: ", ". Must be 0 or 1."));
                }
                this.b = new a0z(this);
                if (aVar != null) {
                    WeakReference<V> weakReference3 = this.q;
                    if (weakReference3 != null && (v2 = weakReference3.get()) != null && (v2.getLayoutParams() instanceof CoordinatorLayout.f)) {
                        fVar = (CoordinatorLayout.f) v2.getLayoutParams();
                    }
                    if (fVar == null || ((ViewGroup.MarginLayoutParams) fVar).leftMargin <= 0) {
                        new wog0();
                        new wog0();
                        new wog0();
                        new wog0();
                        new ryo();
                        new ryo();
                        new ryo();
                        new ryo();
                        wuj wujVar5 = aVar.a;
                        wuj wujVar6 = aVar.b;
                        wuj wujVar7 = aVar.c;
                        wuj wujVar8 = aVar.d;
                        uuj uujVar3 = aVar.f;
                        uuj uujVar4 = aVar.g;
                        ryo ryoVar5 = aVar.i;
                        ryo ryoVar6 = aVar.j;
                        ryo ryoVar7 = aVar.k;
                        ryo ryoVar8 = aVar.l;
                        mc mcVar3 = new mc(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
                        mc mcVar4 = new mc(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
                        com.google.android.material.shape.a aVar3 = new com.google.android.material.shape.a();
                        aVar3.a = wujVar5;
                        aVar3.b = wujVar6;
                        aVar3.c = wujVar7;
                        aVar3.d = wujVar8;
                        aVar3.e = mcVar3;
                        aVar3.f = uujVar3;
                        aVar3.g = uujVar4;
                        aVar3.h = mcVar4;
                        aVar3.i = ryoVar5;
                        aVar3.j = ryoVar6;
                        aVar3.k = ryoVar7;
                        aVar3.l = ryoVar8;
                        if (materialShapeDrawable != null) {
                            materialShapeDrawable.setShapeAppearanceModel(aVar3);
                        }
                    }
                }
            }
        }
        if (this.j == null) {
            this.j = new zut0(coordinatorLayout.getContext(), coordinatorLayout, this.x);
        }
        int h2 = this.b.h(v);
        coordinatorLayout.R(i, v);
        this.n = coordinatorLayout.getWidth();
        this.o = this.b.i(coordinatorLayout);
        this.m = v.getWidth();
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) v.getLayoutParams();
        this.p = marginLayoutParams != null ? this.b.a(marginLayoutParams) : 0;
        int i5 = this.i;
        if (i5 == 1 || i5 == 2) {
            h = h2 - this.b.h(v);
        } else if (i5 == 3) {
            h = 0;
        } else {
            if (i5 != 5) {
                throw new IllegalStateException("Unexpected value: " + this.i);
            }
            h = this.b.e();
        }
        v.offsetLeftAndRight(h);
        if (this.r == null && (i2 = this.s) != -1 && (findViewById = coordinatorLayout.findViewById(i2)) != null) {
            this.r = new WeakReference<>(findViewById);
        }
        for (ucj0 ucj0Var : this.w) {
            if (ucj0Var instanceof hlj0) {
                ((hlj0) ucj0Var).getClass();
            }
        }
        return true;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public final boolean o(@NonNull CoordinatorLayout coordinatorLayout, @NonNull View view, int i, int i2, int i3) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        view.measure(ViewGroup.getChildMeasureSpec(i, coordinatorLayout.getPaddingRight() + coordinatorLayout.getPaddingLeft() + marginLayoutParams.leftMargin + marginLayoutParams.rightMargin + i2, marginLayoutParams.width), ViewGroup.getChildMeasureSpec(i3, coordinatorLayout.getPaddingBottom() + coordinatorLayout.getPaddingTop() + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin, marginLayoutParams.height));
        return true;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public final void w(@NonNull View view, @NonNull Parcelable parcelable) {
        int i = ((SavedState) parcelable).d;
        if (i == 1 || i == 2) {
            i = 5;
        }
        this.i = i;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    @NonNull
    public final Parcelable x(@NonNull View view) {
        return new SavedState((Parcelable) View.BaseSavedState.EMPTY_STATE, (SideSheetBehavior<?>) this);
    }

    public static class SavedState extends AbsSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new a();
        public final int d;

        public class a implements Parcelable.ClassLoaderCreator<SavedState> {
            @Override // android.os.Parcelable.ClassLoaderCreator
            @NonNull
            public final SavedState createFromParcel(@NonNull Parcel parcel, ClassLoader classLoader) {
                return new SavedState(parcel, classLoader);
            }

            @Override // android.os.Parcelable.Creator
            @NonNull
            public final Object[] newArray(int i) {
                return new SavedState[i];
            }

            @Override // android.os.Parcelable.Creator
            @Nullable
            public final Object createFromParcel(@NonNull Parcel parcel) {
                return new SavedState(parcel, (ClassLoader) null);
            }
        }

        public SavedState(@NonNull Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.d = parcel.readInt();
        }

        @Override // androidx.customview.view.AbsSavedState, android.os.Parcelable
        public final void writeToParcel(@NonNull Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeInt(this.d);
        }

        public SavedState(Parcelable parcelable, @NonNull SideSheetBehavior<?> sideSheetBehavior) {
            super(parcelable);
            this.d = sideSheetBehavior.i;
        }
    }

    public SideSheetBehavior(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f = new c();
        this.h = true;
        this.i = 5;
        this.l = 0.1f;
        this.s = -1;
        this.w = new LinkedHashSet();
        this.x = new a();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R$styleable.SideSheetBehavior_Layout);
        if (obtainStyledAttributes.hasValue(R$styleable.SideSheetBehavior_Layout_backgroundTint)) {
            this.d = qm10.a(context, obtainStyledAttributes, R$styleable.SideSheetBehavior_Layout_backgroundTint);
        }
        if (obtainStyledAttributes.hasValue(R$styleable.SideSheetBehavior_Layout_shapeAppearance)) {
            this.e = com.google.android.material.shape.a.c(context, attributeSet, 0, z).a();
        }
        if (obtainStyledAttributes.hasValue(R$styleable.SideSheetBehavior_Layout_coplanarSiblingViewId)) {
            int resourceId = obtainStyledAttributes.getResourceId(R$styleable.SideSheetBehavior_Layout_coplanarSiblingViewId, -1);
            this.s = resourceId;
            WeakReference<View> weakReference = this.r;
            if (weakReference != null) {
                weakReference.clear();
            }
            this.r = null;
            WeakReference<V> weakReference2 = this.q;
            if (weakReference2 != null) {
                V v = weakReference2.get();
                if (resourceId != -1) {
                    WeakHashMap<View, b0u0> weakHashMap = iut0.a;
                    if (v.isLaidOut()) {
                        v.requestLayout();
                    }
                }
            }
        }
        com.google.android.material.shape.a aVar = this.e;
        if (aVar != null) {
            MaterialShapeDrawable materialShapeDrawable = new MaterialShapeDrawable(aVar);
            this.c = materialShapeDrawable;
            materialShapeDrawable.initializeElevationOverlay(context);
            ColorStateList colorStateList = this.d;
            if (colorStateList != null) {
                this.c.setFillColor(colorStateList);
            } else {
                TypedValue typedValue = new TypedValue();
                context.getTheme().resolveAttribute(R.attr.colorBackground, typedValue, true);
                this.c.setTint(typedValue.data);
            }
        }
        this.g = obtainStyledAttributes.getDimension(R$styleable.SideSheetBehavior_Layout_android_elevation, -1.0f);
        this.h = obtainStyledAttributes.getBoolean(R$styleable.SideSheetBehavior_Layout_behavior_draggable, true);
        obtainStyledAttributes.recycle();
        ViewConfiguration.get(context).getScaledMaximumFlingVelocity();
    }
}
