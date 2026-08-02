package androidx.swiperefreshlayout.widget;

import android.R;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.OvalShape;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.animation.DecelerateInterpolator;
import android.widget.ListView;
import com.unity3d.services.UnityAdsConstants;
import defpackage.api;
import defpackage.bpi;
import defpackage.bsk;
import defpackage.cpi;
import defpackage.dpi;
import defpackage.gac;
import defpackage.kjf;
import defpackage.lv2;
import defpackage.mv2;
import defpackage.o9d;
import defpackage.p9d;
import defpackage.q9d;
import defpackage.r9d;
import defpackage.t4f;
import defpackage.uif;
import defpackage.xu2;
import java.util.WeakHashMap;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public class SwipeRefreshLayout extends ViewGroup implements r9d, q9d, o9d {
    public static final int[] M = {R.attr.enabled};
    public bpi A;
    public bpi B;
    public gac C;
    public gac D;
    public boolean E;
    public int F;
    public boolean G;
    public cpi H;
    public boolean I;
    public final api J;
    public final bpi K;
    public final bpi L;
    public View a;
    public dpi b;
    public boolean c;
    public final int d;
    public float e;
    public float f;
    public final uif g;
    public final p9d h;
    public final int[] i;
    public final int[] j;
    public final int[] k;
    public boolean l;
    public final int m;
    public int n;
    public float o;
    public float p;
    public boolean q;
    public int r;
    public final DecelerateInterpolator s;
    public final xu2 t;
    public int u;
    public int v;
    public int w;
    public int x;
    public int y;
    public final mv2 z;

    public SwipeRefreshLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.c = false;
        this.e = -1.0f;
        this.i = new int[2];
        this.j = new int[2];
        this.k = new int[2];
        this.r = -1;
        this.u = -1;
        this.J = new api(this, 0);
        this.K = new bpi(this, 2);
        this.L = new bpi(this, 3);
        this.d = ViewConfiguration.get(context).getScaledTouchSlop();
        this.m = getResources().getInteger(R.integer.config_mediumAnimTime);
        setWillNotDraw(false);
        this.s = new DecelerateInterpolator(2.0f);
        DisplayMetrics displayMetrics = getResources().getDisplayMetrics();
        this.F = (int) (displayMetrics.density * 40.0f);
        xu2 xu2Var = new xu2(getContext());
        float f = xu2Var.getContext().getResources().getDisplayMetrics().density;
        TypedArray obtainStyledAttributes = xu2Var.getContext().obtainStyledAttributes(kjf.a);
        xu2Var.b = obtainStyledAttributes.getColor(0, -328966);
        obtainStyledAttributes.recycle();
        ShapeDrawable shapeDrawable = new ShapeDrawable(new OvalShape());
        WeakHashMap weakHashMap = bsk.a;
        xu2Var.setElevation(f * 4.0f);
        shapeDrawable.getPaint().setColor(xu2Var.b);
        xu2Var.setBackground(shapeDrawable);
        this.t = xu2Var;
        mv2 mv2Var = new mv2(getContext());
        this.z = mv2Var;
        mv2Var.c(1);
        this.t.setImageDrawable(this.z);
        this.t.setVisibility(8);
        addView(this.t);
        setChildrenDrawingOrderEnabled(true);
        int i = (int) (displayMetrics.density * 64.0f);
        this.x = i;
        this.e = i;
        this.g = new uif((byte) 0, 9);
        this.h = new p9d(this);
        setNestedScrollingEnabled(true);
        int i2 = -this.F;
        this.n = i2;
        this.w = i2;
        k(1.0f);
        TypedArray obtainStyledAttributes2 = context.obtainStyledAttributes(attributeSet, M);
        setEnabled(obtainStyledAttributes2.getBoolean(0, true));
        obtainStyledAttributes2.recycle();
    }

    private void setColorViewAlpha(int i) {
        this.t.getBackground().setAlpha(i);
        this.z.setAlpha(i);
    }

    public boolean a() {
        cpi cpiVar = this.H;
        View view = this.a;
        return cpiVar != null ? cpiVar.i(this, view) : view instanceof ListView ? ((ListView) view).canScrollList(-1) : view.canScrollVertically(-1);
    }

    @Override // defpackage.q9d
    public final void b(int i, View view) {
        if (i == 0) {
            onStopNestedScroll(view);
        }
    }

    @Override // defpackage.q9d
    public final void c(View view, View view2, int i, int i2) {
        if (i2 == 0) {
            onNestedScrollAccepted(view, view2, i);
        }
    }

    @Override // defpackage.q9d
    public final void d(View view, int i, int i2, int[] iArr, int i3) {
        if (i3 == 0) {
            onNestedPreScroll(view, i, i2, iArr);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        if (keyEvent == null || keyEvent.getAction() != 1 || keyEvent.getKeyCode() != 285) {
            return super.dispatchKeyEvent(keyEvent);
        }
        n(true, true);
        return true;
    }

    @Override // android.view.View
    public final boolean dispatchNestedFling(float f, float f2, boolean z) {
        return this.h.a(f, f2, z);
    }

    @Override // android.view.View
    public final boolean dispatchNestedPreFling(float f, float f2) {
        return this.h.b(f, f2);
    }

    @Override // android.view.View
    public final boolean dispatchNestedPreScroll(int i, int i2, int[] iArr, int[] iArr2) {
        return this.h.c(i, i2, iArr, iArr2, 0);
    }

    @Override // android.view.View
    public final boolean dispatchNestedScroll(int i, int i2, int i3, int i4, int[] iArr) {
        return this.h.d(i, i2, i3, i4, iArr, 0, null);
    }

    public final void e() {
        if (this.a == null) {
            for (int i = 0; i < getChildCount(); i++) {
                View childAt = getChildAt(i);
                if (!childAt.equals(this.t)) {
                    this.a = childAt;
                    return;
                }
            }
        }
    }

    public final void f(float f) {
        if (f > this.e) {
            m(true, true);
            return;
        }
        this.c = false;
        mv2 mv2Var = this.z;
        lv2 lv2Var = mv2Var.a;
        lv2Var.e = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        lv2Var.f = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        mv2Var.invalidateSelf();
        api apiVar = new api(this, 1);
        this.v = this.n;
        bpi bpiVar = this.L;
        bpiVar.reset();
        bpiVar.setDuration(200L);
        bpiVar.setInterpolator(this.s);
        xu2 xu2Var = this.t;
        xu2Var.a = apiVar;
        xu2Var.clearAnimation();
        xu2Var.startAnimation(bpiVar);
        lv2 lv2Var2 = mv2Var.a;
        if (lv2Var2.n) {
            lv2Var2.n = false;
        }
        mv2Var.invalidateSelf();
    }

    @Override // defpackage.r9d
    public final void g(View view, int i, int i2, int i3, int i4, int i5, int[] iArr) {
        if (i5 != 0) {
            return;
        }
        int i6 = iArr[1];
        if (i5 == 0) {
            this.h.d(i, i2, i3, i4, this.j, i5, iArr);
        }
        int i7 = i4 - (iArr[1] - i6);
        if ((i7 == 0 ? this.j[1] + i4 : i7) >= 0 || a()) {
            return;
        }
        float abs = this.f + Math.abs(r12);
        this.f = abs;
        j(abs);
        iArr[1] = iArr[1] + i7;
    }

    @Override // android.view.ViewGroup
    public final int getChildDrawingOrder(int i, int i2) {
        int i3 = this.u;
        return i3 < 0 ? i2 : i2 == i + (-1) ? i3 : i2 >= i3 ? i2 + 1 : i2;
    }

    @Override // android.view.ViewGroup
    public int getNestedScrollAxes() {
        uif uifVar = this.g;
        return uifVar.c | uifVar.b;
    }

    public int getProgressCircleDiameter() {
        return this.F;
    }

    public int getProgressViewEndOffset() {
        return this.x;
    }

    public int getProgressViewStartOffset() {
        return this.w;
    }

    @Override // defpackage.q9d
    public final void h(View view, int i, int i2, int i3, int i4, int i5) {
        g(view, i, i2, i3, i4, i5, this.k);
    }

    @Override // android.view.View
    public final boolean hasNestedScrollingParent() {
        return this.h.f(0);
    }

    @Override // defpackage.q9d
    public final boolean i(View view, View view2, int i, int i2) {
        if (i2 == 0) {
            return onStartNestedScroll(view, view2, i);
        }
        return false;
    }

    @Override // android.view.View
    public final boolean isNestedScrollingEnabled() {
        return this.h.d;
    }

    public final void j(float f) {
        float f2;
        gac gacVar;
        gac gacVar2;
        mv2 mv2Var = this.z;
        lv2 lv2Var = mv2Var.a;
        if (!lv2Var.n) {
            lv2Var.n = true;
        }
        mv2Var.invalidateSelf();
        float min = Math.min(1.0f, Math.abs(f / this.e));
        float max = (((float) Math.max(min - 0.4d, 0.0d)) * 5.0f) / 3.0f;
        float abs = Math.abs(f) - this.e;
        int i = this.y;
        if (i > 0) {
            f2 = i;
        } else {
            boolean z = this.G;
            int i2 = this.x;
            if (z) {
                i2 -= this.w;
            }
            f2 = i2;
        }
        double max2 = Math.max(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, Math.min(abs, f2 * 2.0f) / f2) / 4.0f;
        float pow = ((float) (max2 - Math.pow(max2, 2.0d))) * 2.0f;
        int i3 = this.w + ((int) ((f2 * min) + (f2 * pow * 2.0f)));
        xu2 xu2Var = this.t;
        if (xu2Var.getVisibility() != 0) {
            xu2Var.setVisibility(0);
        }
        xu2Var.setScaleX(1.0f);
        xu2Var.setScaleY(1.0f);
        if (f < this.e) {
            if (mv2Var.a.t > 76 && ((gacVar2 = this.C) == null || !gacVar2.hasStarted() || gacVar2.hasEnded())) {
                gac gacVar3 = new gac(this, mv2Var.a.t, 76);
                gacVar3.setDuration(300L);
                xu2Var.a = null;
                xu2Var.clearAnimation();
                xu2Var.startAnimation(gacVar3);
                this.C = gacVar3;
            }
        } else if (mv2Var.a.t < 255 && ((gacVar = this.D) == null || !gacVar.hasStarted() || gacVar.hasEnded())) {
            gac gacVar4 = new gac(this, mv2Var.a.t, 255);
            gacVar4.setDuration(300L);
            xu2Var.a = null;
            xu2Var.clearAnimation();
            xu2Var.startAnimation(gacVar4);
            this.D = gacVar4;
        }
        float min2 = Math.min(0.8f, max * 0.8f);
        lv2 lv2Var2 = mv2Var.a;
        lv2Var2.e = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        lv2Var2.f = min2;
        mv2Var.invalidateSelf();
        float min3 = Math.min(1.0f, max);
        lv2 lv2Var3 = mv2Var.a;
        if (min3 != lv2Var3.p) {
            lv2Var3.p = min3;
        }
        mv2Var.invalidateSelf();
        mv2Var.a.g = ((pow * 2.0f) + ((max * 0.4f) - 0.25f)) * 0.5f;
        mv2Var.invalidateSelf();
        setTargetOffsetTopAndBottom(i3 - this.n);
    }

    public final void k(float f) {
        setTargetOffsetTopAndBottom((this.v + ((int) ((this.w - r0) * f))) - this.t.getTop());
    }

    public final void l() {
        this.t.clearAnimation();
        this.z.stop();
        this.t.setVisibility(8);
        setColorViewAlpha(255);
        setTargetOffsetTopAndBottom(this.w - this.n);
        this.n = this.t.getTop();
    }

    public final void m(boolean z, boolean z2) {
        if (this.c != z) {
            this.E = z2;
            e();
            this.c = z;
            xu2 xu2Var = this.t;
            api apiVar = this.J;
            if (!z) {
                bpi bpiVar = new bpi(this, 1);
                this.B = bpiVar;
                bpiVar.setDuration(150L);
                xu2Var.a = apiVar;
                xu2Var.clearAnimation();
                xu2Var.startAnimation(this.B);
                return;
            }
            this.v = this.n;
            bpi bpiVar2 = this.K;
            bpiVar2.reset();
            bpiVar2.setDuration(200L);
            bpiVar2.setInterpolator(this.s);
            if (apiVar != null) {
                xu2Var.a = apiVar;
            }
            xu2Var.clearAnimation();
            xu2Var.startAnimation(bpiVar2);
        }
    }

    public final void n(boolean z, boolean z2) {
        if (!z || this.c == z) {
            m(z, false);
            return;
        }
        this.c = z;
        boolean z3 = this.G;
        int i = this.x;
        if (!z3) {
            i += this.w;
        }
        setTargetOffsetTopAndBottom(i - this.n);
        this.E = z2;
        xu2 xu2Var = this.t;
        xu2Var.setVisibility(0);
        this.z.setAlpha(255);
        bpi bpiVar = new bpi(this, 0);
        this.A = bpiVar;
        bpiVar.setDuration(this.m);
        api apiVar = this.J;
        if (apiVar != null) {
            xu2Var.a = apiVar;
        }
        xu2Var.clearAnimation();
        xu2Var.startAnimation(this.A);
    }

    public final void o(float f) {
        float f2 = this.p;
        float f3 = f - f2;
        float f4 = this.d;
        if (f3 <= f4 || this.q) {
            return;
        }
        this.o = f2 + f4;
        this.q = true;
        this.z.setAlpha(76);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        l();
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        int findPointerIndex;
        e();
        int actionMasked = motionEvent.getActionMasked();
        if (isEnabled() && !a() && !this.c && !this.l) {
            if (actionMasked != 0) {
                if (actionMasked != 1) {
                    if (actionMasked == 2) {
                        int i = this.r;
                        if (i != -1 && (findPointerIndex = motionEvent.findPointerIndex(i)) >= 0) {
                            o(motionEvent.getY(findPointerIndex));
                        }
                    } else if (actionMasked != 3) {
                        if (actionMasked == 6) {
                            int actionIndex = motionEvent.getActionIndex();
                            if (motionEvent.getPointerId(actionIndex) == this.r) {
                                this.r = motionEvent.getPointerId(actionIndex == 0 ? 1 : 0);
                            }
                        }
                    }
                    return this.q;
                }
                this.q = false;
                this.r = -1;
                return this.q;
            }
            setTargetOffsetTopAndBottom(this.w - this.t.getTop());
            int pointerId = motionEvent.getPointerId(0);
            this.r = pointerId;
            this.q = false;
            int findPointerIndex2 = motionEvent.findPointerIndex(pointerId);
            if (findPointerIndex2 >= 0) {
                this.p = motionEvent.getY(findPointerIndex2);
                return this.q;
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
        if (this.a == null) {
            e();
        }
        View view = this.a;
        if (view == null) {
            return;
        }
        int paddingLeft = getPaddingLeft();
        int paddingTop = getPaddingTop();
        view.layout(paddingLeft, paddingTop, ((measuredWidth - getPaddingLeft()) - getPaddingRight()) + paddingLeft, ((measuredHeight - getPaddingTop()) - getPaddingBottom()) + paddingTop);
        int measuredWidth2 = this.t.getMeasuredWidth();
        int measuredHeight2 = this.t.getMeasuredHeight();
        int i5 = measuredWidth / 2;
        int i6 = measuredWidth2 / 2;
        int i7 = this.n;
        this.t.layout(i5 - i6, i7, i5 + i6, measuredHeight2 + i7);
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        if (this.a == null) {
            e();
        }
        View view = this.a;
        if (view == null) {
            return;
        }
        view.measure(View.MeasureSpec.makeMeasureSpec((getMeasuredWidth() - getPaddingLeft()) - getPaddingRight(), 1073741824), View.MeasureSpec.makeMeasureSpec((getMeasuredHeight() - getPaddingTop()) - getPaddingBottom(), 1073741824));
        this.t.measure(View.MeasureSpec.makeMeasureSpec(this.F, 1073741824), View.MeasureSpec.makeMeasureSpec(this.F, 1073741824));
        this.u = -1;
        for (int i3 = 0; i3 < getChildCount(); i3++) {
            if (getChildAt(i3) == this.t) {
                this.u = i3;
                return;
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onNestedFling(View view, float f, float f2, boolean z) {
        return this.h.a(f, f2, z);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onNestedPreFling(View view, float f, float f2) {
        return this.h.b(f, f2);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedPreScroll(View view, int i, int i2, int[] iArr) {
        float f;
        if (i2 > 0) {
            float f2 = this.f;
            if (f2 > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                float f3 = i2;
                if (f3 > f2) {
                    iArr[1] = (int) f2;
                    this.f = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
                    f = 0.0f;
                } else {
                    f = f2 - f3;
                    this.f = f;
                    iArr[1] = i2;
                }
                j(f);
            }
        }
        if (this.G && i2 > 0 && this.f == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT && Math.abs(i2 - iArr[1]) > 0) {
            this.t.setVisibility(8);
        }
        int i3 = i - iArr[0];
        int i4 = i2 - iArr[1];
        int[] iArr2 = this.i;
        if (dispatchNestedPreScroll(i3, i4, iArr2, null)) {
            iArr[0] = iArr[0] + iArr2[0];
            iArr[1] = iArr[1] + iArr2[1];
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedScroll(View view, int i, int i2, int i3, int i4) {
        g(view, i, i2, i3, i4, 0, this.k);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedScrollAccepted(View view, View view2, int i) {
        this.g.b = i;
        startNestedScroll(i & 2);
        this.f = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        this.l = true;
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.getSuperState());
        setRefreshing(savedState.a);
    }

    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        return new SavedState(super.onSaveInstanceState(), this.c);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onStartNestedScroll(View view, View view2, int i) {
        return (!isEnabled() || this.c || (i & 2) == 0) ? false : true;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onStopNestedScroll(View view) {
        this.g.b = 0;
        this.l = false;
        float f = this.f;
        if (f > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
            f(f);
            this.f = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        } else {
            post(new t4f(this, 14));
        }
        stopNestedScroll();
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (isEnabled() && !a() && !this.c && !this.l) {
            if (actionMasked == 0) {
                this.r = motionEvent.getPointerId(0);
                this.q = false;
                return true;
            }
            if (actionMasked == 1) {
                int findPointerIndex = motionEvent.findPointerIndex(this.r);
                if (findPointerIndex >= 0) {
                    if (this.q) {
                        float y = (motionEvent.getY(findPointerIndex) - this.o) * 0.5f;
                        this.q = false;
                        f(y);
                    }
                    this.r = -1;
                    return false;
                }
            } else if (actionMasked == 2) {
                int findPointerIndex2 = motionEvent.findPointerIndex(this.r);
                if (findPointerIndex2 >= 0) {
                    float y2 = motionEvent.getY(findPointerIndex2);
                    o(y2);
                    if (this.q) {
                        float f = (y2 - this.o) * 0.5f;
                        if (f > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                            getParent().requestDisallowInterceptTouchEvent(true);
                            j(f);
                        }
                    }
                    return true;
                }
            } else if (actionMasked != 3) {
                if (actionMasked != 5) {
                    if (actionMasked == 6) {
                        int actionIndex = motionEvent.getActionIndex();
                        if (motionEvent.getPointerId(actionIndex) == this.r) {
                            this.r = motionEvent.getPointerId(actionIndex == 0 ? 1 : 0);
                            return true;
                        }
                    }
                    return true;
                }
                int actionIndex2 = motionEvent.getActionIndex();
                if (actionIndex2 >= 0) {
                    this.r = motionEvent.getPointerId(actionIndex2);
                    return true;
                }
            }
        }
        return false;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void requestDisallowInterceptTouchEvent(boolean z) {
        View view;
        if (this.I && (view = this.a) != null) {
            WeakHashMap weakHashMap = bsk.a;
            if (!view.isNestedScrollingEnabled()) {
                return;
            }
        }
        super.requestDisallowInterceptTouchEvent(z);
    }

    public void setAnimationProgress(float f) {
        this.t.setScaleX(f);
        this.t.setScaleY(f);
    }

    @Deprecated
    public void setColorScheme(int... iArr) {
        setColorSchemeResources(iArr);
    }

    public void setColorSchemeColors(int... iArr) {
        e();
        mv2 mv2Var = this.z;
        lv2 lv2Var = mv2Var.a;
        lv2Var.i = iArr;
        lv2Var.a(0);
        lv2Var.a(0);
        mv2Var.invalidateSelf();
    }

    public void setColorSchemeResources(int... iArr) {
        Context context = getContext();
        int[] iArr2 = new int[iArr.length];
        for (int i = 0; i < iArr.length; i++) {
            iArr2[i] = context.getColor(iArr[i]);
        }
        setColorSchemeColors(iArr2);
    }

    public void setDistanceToTriggerSync(int i) {
        this.e = i;
    }

    @Override // android.view.View
    public void setEnabled(boolean z) {
        super.setEnabled(z);
        if (z) {
            return;
        }
        l();
    }

    @Deprecated
    public void setLegacyRequestDisallowInterceptTouchEventEnabled(boolean z) {
        this.I = z;
    }

    @Override // android.view.View
    public void setNestedScrollingEnabled(boolean z) {
        this.h.g(z);
    }

    public void setOnChildScrollUpCallback(cpi cpiVar) {
        this.H = cpiVar;
    }

    public void setOnRefreshListener(dpi dpiVar) {
        this.b = dpiVar;
    }

    @Deprecated
    public void setProgressBackgroundColor(int i) {
        setProgressBackgroundColorSchemeResource(i);
    }

    public void setProgressBackgroundColorSchemeColor(int i) {
        this.t.setBackgroundColor(i);
    }

    public void setProgressBackgroundColorSchemeResource(int i) {
        setProgressBackgroundColorSchemeColor(getContext().getColor(i));
    }

    public void setRefreshing(boolean z) {
        n(z, false);
    }

    public void setSize(int i) {
        if (i == 0 || i == 1) {
            DisplayMetrics displayMetrics = getResources().getDisplayMetrics();
            if (i == 0) {
                this.F = (int) (displayMetrics.density * 56.0f);
            } else {
                this.F = (int) (displayMetrics.density * 40.0f);
            }
            this.t.setImageDrawable(null);
            this.z.c(i);
            this.t.setImageDrawable(this.z);
        }
    }

    public void setSlingshotDistance(int i) {
        this.y = i;
    }

    public void setTargetOffsetTopAndBottom(int i) {
        xu2 xu2Var = this.t;
        xu2Var.bringToFront();
        WeakHashMap weakHashMap = bsk.a;
        xu2Var.offsetTopAndBottom(i);
        this.n = xu2Var.getTop();
    }

    @Override // android.view.View
    public final boolean startNestedScroll(int i) {
        return this.h.h(i, 0);
    }

    @Override // android.view.View
    public final void stopNestedScroll() {
        this.h.i(0);
    }

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    public static class SavedState extends View.BaseSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new a();
        public final boolean a;

        public SavedState(Parcel parcel) {
            super(parcel);
            this.a = parcel.readByte() != 0;
        }

        @Override // android.view.View.BaseSavedState, android.view.AbsSavedState, android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeByte(this.a ? (byte) 1 : (byte) 0);
        }

        public SavedState(Parcelable parcelable, boolean z) {
            super(parcelable);
            this.a = z;
        }
    }
}
