package com.vk.core.ui.refresh;

import android.R;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.Transformation;
import android.widget.AdapterView;
import android.widget.ScrollView;
import androidx.recyclerview.widget.RecyclerView;
import com.unity3d.services.UnityAdsConstants;
import com.vk.common.presentation.base.view.swiperefreshlayout.SwipeDrawableRefreshLayout;
import java.lang.reflect.InvocationTargetException;
import java.util.WeakHashMap;
import ru.ok.android.webrtc.stat.call.internal.ConnectivityTracker;
import xsna.abg0;
import xsna.b0u0;
import xsna.dhr0;
import xsna.i98;
import xsna.iut0;
import xsna.j98;
import xsna.k98;
import xsna.l98;
import xsna.om10;
import xsna.r160;
import xsna.s160;
import xsna.too0;
import xsna.ucc;
import xsna.v160;
import xsna.wov;

/* loaded from: classes17.dex */
public class BottomSwipeRefreshLayout extends ViewGroup implements r160, wov, too0 {
    public static final int[] M = {R.attr.enabled};
    public k98 A;
    public k98 B;
    public float C;
    public boolean D;
    public int E;
    public int F;
    public boolean G;
    public final a H;
    public final b I;
    public final c J;
    public boolean K;
    public int L;
    public View b;
    public SwipeDrawableRefreshLayout.g c;
    public boolean d;
    public final int e;
    public float f;
    public float g;
    public final v160 h;
    public final s160 i;
    public final int[] j;
    public final int[] k;
    public boolean l;
    public final int m;
    public int n;
    public boolean o;
    public float p;
    public float q;
    public boolean r;
    public int s;
    public final DecelerateInterpolator t;
    public final ucc u;
    public int v;
    public int w;
    public final om10 x;
    public i98 y;
    public j98 z;

    public class b extends Animation {
        public b() {
        }

        /* JADX WARN: Removed duplicated region for block: B:11:? A[RETURN, SYNTHETIC] */
        /* JADX WARN: Removed duplicated region for block: B:8:0x0042  */
        @Override // android.view.animation.Animation
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final void applyTransformation(float f, Transformation transformation) {
            float f2;
            int i;
            float f3;
            om10.b bVar;
            BottomSwipeRefreshLayout bottomSwipeRefreshLayout = BottomSwipeRefreshLayout.this;
            if (bottomSwipeRefreshLayout.G) {
                f2 = bottomSwipeRefreshLayout.C;
            } else {
                if (bottomSwipeRefreshLayout.K) {
                    i = bottomSwipeRefreshLayout.getMeasuredHeight() - ((int) bottomSwipeRefreshLayout.C);
                    bottomSwipeRefreshLayout.j((bottomSwipeRefreshLayout.w + ((int) ((i - r1) * f))) - bottomSwipeRefreshLayout.u.getTop());
                    f3 = 1.0f - f;
                    bVar = bottomSwipeRefreshLayout.x.c;
                    if (f3 == bVar.q) {
                        bVar.q = f3;
                        bVar.a();
                        return;
                    }
                    return;
                }
                f2 = bottomSwipeRefreshLayout.C - Math.abs(bottomSwipeRefreshLayout.getOriginalOffsetTop());
            }
            i = (int) f2;
            bottomSwipeRefreshLayout.j((bottomSwipeRefreshLayout.w + ((int) ((i - r1) * f))) - bottomSwipeRefreshLayout.u.getTop());
            f3 = 1.0f - f;
            bVar = bottomSwipeRefreshLayout.x.c;
            if (f3 == bVar.q) {
            }
        }
    }

    public class c extends Animation {
        public c() {
        }

        @Override // android.view.animation.Animation
        public final void applyTransformation(float f, Transformation transformation) {
            int[] iArr = BottomSwipeRefreshLayout.M;
            BottomSwipeRefreshLayout.this.h(f);
        }
    }

    public BottomSwipeRefreshLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.d = false;
        this.f = -1.0f;
        this.j = new int[2];
        this.k = new int[2];
        this.o = false;
        this.s = -1;
        this.v = -1;
        this.H = new a();
        this.I = new b();
        this.J = new c();
        this.K = false;
        this.e = ViewConfiguration.get(context).getScaledTouchSlop();
        this.m = getResources().getInteger(R.integer.config_mediumAnimTime);
        setWillNotDraw(false);
        this.t = new DecelerateInterpolator(2.0f);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, M);
        setEnabled(obtainStyledAttributes.getBoolean(0, true));
        obtainStyledAttributes.recycle();
        DisplayMetrics displayMetrics = getResources().getDisplayMetrics();
        int i = (int) (displayMetrics.density * 40.0f);
        this.E = i;
        this.F = i;
        this.u = new ucc(getContext(), -328966);
        om10 om10Var = new om10(getContext(), this);
        this.x = om10Var;
        om10Var.c.w = -328966;
        this.u.setImageDrawable(om10Var);
        this.u.setVisibility(8);
        addView(this.u);
        if (iut0.b == null) {
            try {
                iut0.b = ViewGroup.class.getDeclaredMethod("setChildrenDrawingOrderEnabled", Boolean.TYPE);
            } catch (NoSuchMethodException e) {
                Log.e("ViewCompat", "Unable to find childrenDrawingOrderEnabled", e);
            }
            iut0.b.setAccessible(true);
        }
        try {
            iut0.b.invoke(this, Boolean.TRUE);
        } catch (IllegalAccessException e2) {
            Log.e("ViewCompat", "Unable to invoke childrenDrawingOrderEnabled", e2);
        } catch (IllegalArgumentException e3) {
            Log.e("ViewCompat", "Unable to invoke childrenDrawingOrderEnabled", e3);
        } catch (InvocationTargetException e4) {
            Log.e("ViewCompat", "Unable to invoke childrenDrawingOrderEnabled", e4);
        }
        float f = displayMetrics.density * 64.0f;
        this.C = f;
        this.f = f;
        this.h = new v160();
        this.i = new s160(this);
        setNestedScrollingEnabled(true);
        Ng();
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0029, code lost:
    
        r4 = -1;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static boolean e(ViewGroup viewGroup, boolean z) {
        for (int i = 0; i < viewGroup.getChildCount(); i++) {
            View childAt = viewGroup.getChildAt(i);
            if ((childAt instanceof AdapterView) || (childAt instanceof ScrollView) || (childAt instanceof RecyclerView)) {
                int i2 = 1;
                WeakHashMap<View, b0u0> weakHashMap = iut0.a;
                return childAt.canScrollVertically(i2);
            }
            if (childAt instanceof ViewGroup) {
                return e((ViewGroup) childAt, z);
            }
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int getOriginalOffsetTop() {
        int i;
        int i2;
        if (this.K) {
            i = getMeasuredHeight();
            i2 = this.L;
        } else {
            i = -this.u.getMeasuredHeight();
            i2 = this.L;
        }
        return i + i2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setAnimationProgress(float f) {
        WeakHashMap<View, b0u0> weakHashMap = iut0.a;
        ucc uccVar = this.u;
        uccVar.setScaleX(f);
        uccVar.setScaleY(f);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setColorViewAlpha(int i) {
        this.u.getBackground().setAlpha(i);
        this.x.c.u = i;
    }

    @Override // xsna.too0
    public final void Ng() {
        abg0 abg0Var = dhr0.t;
        setColorSchemeColors(abg0Var.c(com.vkontakte.android.R.attr.vk_ui_stroke_accent));
        setProgressBackgroundColorSchemeColor(abg0Var.c(com.vkontakte.android.R.attr.vk_ui_background_modal));
    }

    public final void d() {
        if (this.b == null) {
            for (int i = 0; i < getChildCount(); i++) {
                View childAt = getChildAt(i);
                if (!childAt.equals(this.u)) {
                    this.b = childAt;
                    return;
                }
            }
        }
    }

    @Override // android.view.View
    public final boolean dispatchNestedFling(float f, float f2, boolean z) {
        return this.i.a(f, f2, z);
    }

    @Override // android.view.View
    public final boolean dispatchNestedPreFling(float f, float f2) {
        return this.i.b(f, f2);
    }

    @Override // android.view.View
    public final boolean dispatchNestedPreScroll(int i, int i2, int[] iArr, int[] iArr2) {
        return this.i.c(i, i2, iArr, iArr2, 0);
    }

    @Override // android.view.View
    public final boolean dispatchNestedScroll(int i, int i2, int i3, int i4, int[] iArr) {
        return this.i.d(i, i2, i3, i4, iArr, 0, null);
    }

    public final void f(float f) {
        if (Math.abs(f) > this.f) {
            i(true, true);
            return;
        }
        this.d = false;
        om10.b bVar = this.x.c;
        bVar.e = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        bVar.a();
        bVar.f = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        bVar.a();
        l98 l98Var = new l98(this);
        this.w = this.n;
        c cVar = this.J;
        cVar.reset();
        cVar.setDuration(200L);
        cVar.setInterpolator(this.t);
        this.u.setAnimationListener(l98Var);
        this.u.clearAnimation();
        this.u.startAnimation(cVar);
        om10.b bVar2 = this.x.c;
        if (bVar2.o) {
            bVar2.o = false;
            bVar2.a();
        }
    }

    public final void g(float f) {
        k98 k98Var;
        k98 k98Var2;
        om10 om10Var = this.x;
        om10.b bVar = om10Var.c;
        if (!bVar.o) {
            bVar.o = true;
            bVar.a();
        }
        float min = Math.min(1.0f, Math.abs(f / this.f));
        float max = (((float) Math.max(min - 0.4d, ConnectivityTracker.DEFAULT_UPLINK_BITRATE)) * 5.0f) / 3.0f;
        float abs = Math.abs(f) - this.f;
        float originalOffsetTop = this.G ? this.C - getOriginalOffsetTop() : this.C;
        double max2 = Math.max(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, Math.min(abs, originalOffsetTop * 2.0f) / originalOffsetTop) / 4.0f;
        float pow = ((float) (max2 - Math.pow(max2, 2.0d))) * 2.0f;
        float f2 = originalOffsetTop * pow;
        int originalOffsetTop2 = this.K ? getOriginalOffsetTop() - ((int) ((originalOffsetTop * min) + f2)) : getOriginalOffsetTop() + ((int) ((originalOffsetTop * min) + f2));
        ucc uccVar = this.u;
        if (uccVar.getVisibility() != 0) {
            uccVar.setVisibility(0);
        }
        WeakHashMap<View, b0u0> weakHashMap = iut0.a;
        uccVar.setScaleX(1.0f);
        uccVar.setScaleY(1.0f);
        if (Math.abs(f) < this.f) {
            if (om10Var.c.u > 76 && ((k98Var2 = this.A) == null || !k98Var2.hasStarted() || k98Var2.hasEnded())) {
                k98 k98Var3 = new k98(this, om10Var.c.u, 76);
                k98Var3.setDuration(300L);
                uccVar.setAnimationListener(null);
                uccVar.clearAnimation();
                uccVar.startAnimation(k98Var3);
                this.A = k98Var3;
            }
            float min2 = Math.min(0.8f, max * 0.8f);
            om10.b bVar2 = om10Var.c;
            bVar2.e = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
            bVar2.a();
            bVar2.f = min2;
            bVar2.a();
            float min3 = Math.min(1.0f, max);
            om10.b bVar3 = om10Var.c;
            if (min3 != bVar3.q) {
                bVar3.q = min3;
                bVar3.a();
            }
        } else if (om10Var.c.u < 255 && ((k98Var = this.B) == null || !k98Var.hasStarted() || k98Var.hasEnded())) {
            k98 k98Var4 = new k98(this, om10Var.c.u, 255);
            k98Var4.setDuration(300L);
            uccVar.setAnimationListener(null);
            uccVar.clearAnimation();
            uccVar.startAnimation(k98Var4);
            this.B = k98Var4;
        }
        om10.b bVar4 = om10Var.c;
        bVar4.g = ((pow * 2.0f) + ((max * 0.4f) - 0.25f)) * 0.5f;
        bVar4.a();
        j(originalOffsetTop2 - this.n);
    }

    @Override // android.view.ViewGroup
    public final int getChildDrawingOrder(int i, int i2) {
        int i3 = this.v;
        return i3 < 0 ? i2 : i2 == i + (-1) ? i3 : i2 >= i3 ? i2 + 1 : i2;
    }

    @Override // android.view.ViewGroup
    public int getNestedScrollAxes() {
        return this.h.a();
    }

    public int getOffset() {
        return this.L;
    }

    public int getProgressCircleDiameter() {
        ucc uccVar = this.u;
        if (uccVar != null) {
            return uccVar.getMeasuredHeight();
        }
        return 0;
    }

    public final void h(float f) {
        j((this.w + ((int) ((getOriginalOffsetTop() - this.w) * f))) - this.u.getTop());
    }

    @Override // android.view.View
    public final boolean hasNestedScrollingParent() {
        return this.i.f(0);
    }

    public final void i(boolean z, boolean z2) {
        if (this.d != z) {
            this.D = z2;
            d();
            this.d = z;
            a aVar = this.H;
            if (!z) {
                k(aVar);
                return;
            }
            this.w = this.n;
            b bVar = this.I;
            bVar.reset();
            bVar.setDuration(200L);
            bVar.setInterpolator(this.t);
            if (aVar != null) {
                this.u.setAnimationListener(aVar);
            }
            this.u.clearAnimation();
            this.u.startAnimation(bVar);
        }
    }

    @Override // android.view.View
    public final boolean isNestedScrollingEnabled() {
        return this.i.d;
    }

    public final void j(int i) {
        this.u.bringToFront();
        this.u.offsetTopAndBottom(i);
        this.n = this.u.getTop();
    }

    public final void k(a aVar) {
        j98 j98Var = new j98(this);
        this.z = j98Var;
        j98Var.setDuration(150L);
        this.u.setAnimationListener(aVar);
        this.u.clearAnimation();
        this.u.startAnimation(this.z);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        setRefreshing(false);
        destroyDrawingCache();
        clearAnimation();
        h(1.0f);
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        d();
        int actionMasked = motionEvent.getActionMasked();
        if (isEnabled()) {
            if (!(this.K ? e(this, false) : e(this, true)) && !this.d && !this.l) {
                if (actionMasked != 0) {
                    if (actionMasked != 1) {
                        if (actionMasked == 2) {
                            int i = this.s;
                            if (i == -1) {
                                Log.e("BottomSwipeRefreshLayout", "Got ACTION_MOVE event but don't have an active pointer id.");
                                return false;
                            }
                            int findPointerIndex = motionEvent.findPointerIndex(i);
                            float y = findPointerIndex < 0 ? -1.0f : motionEvent.getY(findPointerIndex);
                            if (y != -1.0f) {
                                float f = this.K ? this.p - y : y - this.p;
                                float f2 = this.e;
                                if (f > f2 && !this.r) {
                                    this.p = this.q + f2;
                                    this.r = true;
                                    this.x.c.u = 76;
                                }
                            }
                        } else if (actionMasked != 3) {
                            if (actionMasked == 6) {
                                int actionIndex = motionEvent.getActionIndex();
                                if (motionEvent.getPointerId(actionIndex) == this.s) {
                                    this.s = motionEvent.getPointerId(actionIndex == 0 ? 1 : 0);
                                }
                            }
                        }
                        return this.r;
                    }
                    this.r = false;
                    this.s = -1;
                    return this.r;
                }
                j(getOriginalOffsetTop() - this.u.getTop());
                int pointerId = motionEvent.getPointerId(0);
                this.s = pointerId;
                this.r = false;
                int findPointerIndex2 = motionEvent.findPointerIndex(pointerId);
                float y2 = findPointerIndex2 < 0 ? -1.0f : motionEvent.getY(findPointerIndex2);
                if (y2 != -1.0f) {
                    this.q = y2;
                    return this.r;
                }
            }
        }
        return false;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int measuredWidth = getMeasuredWidth();
        int measuredHeight = getMeasuredHeight();
        if (getChildCount() == 0) {
            return;
        }
        if (this.b == null) {
            d();
        }
        View view = this.b;
        if (view == null) {
            return;
        }
        int paddingLeft = getPaddingLeft();
        int paddingTop = getPaddingTop();
        view.layout(paddingLeft, paddingTop, ((measuredWidth - getPaddingLeft()) - getPaddingRight()) + paddingLeft, ((measuredHeight - getPaddingTop()) - getPaddingBottom()) + paddingTop);
        int measuredWidth2 = this.u.getMeasuredWidth();
        int measuredHeight2 = this.u.getMeasuredHeight();
        int i5 = measuredWidth / 2;
        int i6 = measuredWidth2 / 2;
        int i7 = this.n;
        this.u.layout(i5 - i6, i7, i5 + i6, measuredHeight2 + i7);
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        if (this.b == null) {
            d();
        }
        View view = this.b;
        if (view == null) {
            return;
        }
        view.measure(View.MeasureSpec.makeMeasureSpec((getMeasuredWidth() - getPaddingLeft()) - getPaddingRight(), 1073741824), View.MeasureSpec.makeMeasureSpec((getMeasuredHeight() - getPaddingTop()) - getPaddingBottom(), 1073741824));
        this.u.measure(View.MeasureSpec.makeMeasureSpec(this.E, 1073741824), View.MeasureSpec.makeMeasureSpec(this.F, 1073741824));
        if (!this.G && !this.o) {
            this.o = true;
            this.n = getOriginalOffsetTop();
        }
        this.v = -1;
        for (int i3 = 0; i3 < getChildCount(); i3++) {
            if (getChildAt(i3) == this.u) {
                this.v = i3;
                return;
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onNestedFling(View view, float f, float f2, boolean z) {
        return this.i.a(f, f2, z);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onNestedPreFling(View view, float f, float f2) {
        return this.i.b(f, f2);
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:24:? A[RETURN, SYNTHETIC] */
    @Override // android.view.ViewGroup, android.view.ViewParent
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onNestedPreScroll(View view, int i, int i2, int[] iArr) {
        int i3;
        int i4;
        int[] iArr2;
        if (i2 > 0) {
            float f = this.g;
            if (f > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT && !this.K) {
                float f2 = i2;
                if (f2 > f) {
                    iArr[1] = i2 - ((int) f);
                    this.g = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
                } else {
                    this.g = f - f2;
                    iArr[1] = i2;
                }
                g(this.g);
                if (this.G && i2 > 0 && this.g == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT && Math.abs(i2 - iArr[1]) > 0) {
                    this.u.setVisibility(8);
                }
                i3 = i - iArr[0];
                i4 = i2 - iArr[1];
                iArr2 = this.j;
                if (dispatchNestedPreScroll(i3, i4, iArr2, null)) {
                    return;
                }
                iArr[0] = iArr[0] + iArr2[0];
                iArr[1] = iArr[1] + iArr2[1];
                return;
            }
        }
        if (i2 < 0) {
            float f3 = this.g;
            if (f3 < UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT && this.K) {
                float f4 = i2;
                if (f4 < f3) {
                    iArr[1] = i2 - ((int) f3);
                    this.g = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
                } else {
                    this.g = f3 - f4;
                    iArr[1] = i2;
                }
                g(this.g);
            }
        }
        if (this.G) {
            this.u.setVisibility(8);
        }
        i3 = i - iArr[0];
        i4 = i2 - iArr[1];
        iArr2 = this.j;
        if (dispatchNestedPreScroll(i3, i4, iArr2, null)) {
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedScroll(View view, int i, int i2, int i3, int i4) {
        dispatchNestedScroll(i, i2, i3, i4, this.k);
        int i5 = i4 + this.k[1];
        if (i5 < 0 && !this.K) {
            float abs = this.g + Math.abs(i5);
            this.g = abs;
            g(abs);
        } else {
            if (i5 <= 0 || !this.K) {
                return;
            }
            float abs2 = this.g - Math.abs(i5);
            this.g = abs2;
            g(abs2);
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedScrollAccepted(View view, View view2, int i) {
        this.h.a = i;
        startNestedScroll(i & 2);
        this.g = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        this.l = true;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onStartNestedScroll(View view, View view2, int i) {
        return (!isEnabled() || this.d || (i & 2) == 0) ? false : true;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onStopNestedScroll(View view) {
        this.h.a = 0;
        this.l = false;
        float f = this.g;
        if ((f > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT && !this.K) || (f < UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT && this.K)) {
            f(f);
            this.g = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        }
        stopNestedScroll();
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (isEnabled()) {
            if (!(this.K ? e(this, false) : e(this, true)) && !this.l) {
                if (actionMasked == 0) {
                    this.s = motionEvent.getPointerId(0);
                    this.r = false;
                    return true;
                }
                if (actionMasked == 1) {
                    int findPointerIndex = motionEvent.findPointerIndex(this.s);
                    if (findPointerIndex < 0) {
                        Log.e("BottomSwipeRefreshLayout", "Got ACTION_UP event but don't have an active pointer id.");
                        return false;
                    }
                    float y = motionEvent.getY(findPointerIndex);
                    float f = this.K ? (this.p - y) * 0.5f : (y - this.p) * 0.5f;
                    this.r = false;
                    f(f);
                    this.s = -1;
                    return false;
                }
                if (actionMasked == 2) {
                    int findPointerIndex2 = motionEvent.findPointerIndex(this.s);
                    if (findPointerIndex2 < 0) {
                        Log.e("BottomSwipeRefreshLayout", "Got ACTION_MOVE event but have an invalid active pointer id.");
                        return false;
                    }
                    float y2 = motionEvent.getY(findPointerIndex2);
                    float f2 = this.K ? (this.p - y2) * 0.5f : (y2 - this.p) * 0.5f;
                    if (this.r) {
                        g(f2);
                    }
                } else if (actionMasked != 3) {
                    if (actionMasked == 5) {
                        int actionIndex = motionEvent.getActionIndex();
                        if (actionIndex < 0) {
                            Log.e("BottomSwipeRefreshLayout", "Got ACTION_POINTER_DOWN event but have an invalid action index.");
                            return false;
                        }
                        this.s = motionEvent.getPointerId(actionIndex);
                        return true;
                    }
                    if (actionMasked == 6) {
                        int actionIndex2 = motionEvent.getActionIndex();
                        if (motionEvent.getPointerId(actionIndex2) == this.s) {
                            this.s = motionEvent.getPointerId(actionIndex2 == 0 ? 1 : 0);
                            return true;
                        }
                    }
                }
                return true;
            }
        }
        return false;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void requestDisallowInterceptTouchEvent(boolean z) {
        View view = this.b;
        if (view != null) {
            WeakHashMap<View, b0u0> weakHashMap = iut0.a;
            if (!view.isNestedScrollingEnabled()) {
                return;
            }
        }
        super.requestDisallowInterceptTouchEvent(z);
    }

    public void setColorSchemeColors(int... iArr) {
        d();
        om10.b bVar = this.x.c;
        bVar.j = iArr;
        bVar.b(0);
        bVar.b(0);
    }

    public void setColorSchemeResources(int... iArr) {
        Resources resources = getResources();
        int[] iArr2 = new int[iArr.length];
        for (int i = 0; i < iArr.length; i++) {
            iArr2[i] = resources.getColor(iArr[i]);
        }
        setColorSchemeColors(iArr2);
    }

    public void setDistanceToTriggerSync(int i) {
        this.f = i;
    }

    @Override // android.view.View
    public void setNestedScrollingEnabled(boolean z) {
        this.i.g(z);
    }

    public void setOffset(int i) {
        this.u.setVisibility(8);
        this.L = i;
        if (this.K) {
            this.C = i - (getResources().getDisplayMetrics().density * 64.0f);
        } else {
            this.C = (getResources().getDisplayMetrics().density * 64.0f) + i;
        }
        this.G = true;
        this.u.invalidate();
    }

    @Override // xsna.wov
    public void setOnRefreshListener(SwipeDrawableRefreshLayout.g gVar) {
        this.c = gVar;
    }

    @Deprecated
    public void setProgressBackgroundColor(int i) {
        setProgressBackgroundColorSchemeResource(i);
    }

    public void setProgressBackgroundColorSchemeColor(int i) {
        this.u.setBackgroundColor(i);
        this.x.c.w = i;
    }

    public void setProgressBackgroundColorSchemeResource(int i) {
        setProgressBackgroundColorSchemeColor(getResources().getColor(i));
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x004d  */
    @Override // xsna.wov
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void setRefreshing(boolean z) {
        float f;
        int i;
        a aVar;
        if (!z || this.d == z) {
            i(z, false);
            return;
        }
        this.d = z;
        if (this.G) {
            f = this.C;
        } else {
            if (this.K) {
                i = getMeasuredHeight() - ((int) this.C);
                j(i - this.n);
                this.D = false;
                this.u.setVisibility(0);
                this.x.c.u = 255;
                i98 i98Var = new i98(this);
                this.y = i98Var;
                i98Var.setDuration(this.m);
                aVar = this.H;
                if (aVar != null) {
                    this.u.setAnimationListener(aVar);
                }
                this.u.clearAnimation();
                this.u.startAnimation(this.y);
            }
            f = this.C + getOriginalOffsetTop();
        }
        i = (int) f;
        j(i - this.n);
        this.D = false;
        this.u.setVisibility(0);
        this.x.c.u = 255;
        i98 i98Var2 = new i98(this);
        this.y = i98Var2;
        i98Var2.setDuration(this.m);
        aVar = this.H;
        if (aVar != null) {
        }
        this.u.clearAnimation();
        this.u.startAnimation(this.y);
    }

    public void setReversed(boolean z) {
        this.K = z;
    }

    public void setSize(int i) {
        if (i == 0 || i == 1) {
            DisplayMetrics displayMetrics = getResources().getDisplayMetrics();
            if (i == 0) {
                int i2 = (int) (displayMetrics.density * 56.0f);
                this.E = i2;
                this.F = i2;
            } else {
                int i3 = (int) (displayMetrics.density * 40.0f);
                this.E = i3;
                this.F = i3;
            }
            this.u.setImageDrawable(null);
            this.x.c(i);
            this.u.setImageDrawable(this.x);
        }
    }

    @Override // android.view.View
    public final boolean startNestedScroll(int i) {
        return this.i.h(i, 0);
    }

    @Override // android.view.View
    public final void stopNestedScroll() {
        this.i.i(0);
    }

    public class a implements Animation.AnimationListener {
        public a() {
        }

        @Override // android.view.animation.Animation.AnimationListener
        public final void onAnimationEnd(Animation animation) {
            SwipeDrawableRefreshLayout.g gVar;
            BottomSwipeRefreshLayout bottomSwipeRefreshLayout = BottomSwipeRefreshLayout.this;
            if (bottomSwipeRefreshLayout.d) {
                om10 om10Var = bottomSwipeRefreshLayout.x;
                om10Var.c.u = 255;
                om10Var.start();
                if (bottomSwipeRefreshLayout.D && (gVar = bottomSwipeRefreshLayout.c) != null) {
                    gVar.h();
                }
            } else {
                bottomSwipeRefreshLayout.x.stop();
                bottomSwipeRefreshLayout.u.setVisibility(8);
                bottomSwipeRefreshLayout.setColorViewAlpha(255);
                bottomSwipeRefreshLayout.j(bottomSwipeRefreshLayout.getOriginalOffsetTop() - bottomSwipeRefreshLayout.n);
            }
            bottomSwipeRefreshLayout.n = bottomSwipeRefreshLayout.u.getTop();
        }

        @Override // android.view.animation.Animation.AnimationListener
        public final void onAnimationRepeat(Animation animation) {
        }

        @Override // android.view.animation.Animation.AnimationListener
        public final void onAnimationStart(Animation animation) {
        }
    }
}
