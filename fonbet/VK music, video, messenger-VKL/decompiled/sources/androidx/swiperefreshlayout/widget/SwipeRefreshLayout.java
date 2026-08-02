package androidx.swiperefreshlayout.widget;

import android.R;
import android.content.Context;
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
import android.widget.ListView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.unity3d.services.UnityAdsConstants;
import java.util.WeakHashMap;
import ru.ok.android.webrtc.stat.call.internal.ConnectivityTracker;
import xsna.amn0;
import xsna.b0u0;
import xsna.bmn0;
import xsna.cmn0;
import xsna.iut0;
import xsna.jgz;
import xsna.odc;
import xsna.r160;
import xsna.s160;
import xsna.v160;
import xsna.vcc;
import xsna.zln0;

/* loaded from: classes.dex */
public class SwipeRefreshLayout extends ViewGroup implements r160 {
    public static final int[] O = {R.attr.enabled};
    public int A;
    public final odc B;
    public zln0 C;
    public b D;
    public amn0 E;
    public amn0 F;
    public cmn0 G;
    public boolean H;
    public int I;
    public boolean J;
    public e K;
    public final a L;
    public final c M;
    public final d N;
    public View b;
    public f c;
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
    public float o;
    public float p;
    public boolean q;
    public int r;
    public boolean s;
    public final DecelerateInterpolator t;
    public final vcc u;
    public int v;
    public int w;
    public float x;
    public int y;
    public int z;

    /* loaded from: classes12.dex */
    public class b extends Animation {
        public b() {
        }

        @Override // android.view.animation.Animation
        public final void applyTransformation(float f, Transformation transformation) {
            SwipeRefreshLayout.this.setAnimationProgress(1.0f - f);
        }
    }

    /* loaded from: classes12.dex */
    public class c extends Animation {
        public c() {
        }

        @Override // android.view.animation.Animation
        public final void applyTransformation(float f, Transformation transformation) {
            SwipeRefreshLayout swipeRefreshLayout = SwipeRefreshLayout.this;
            int abs = !swipeRefreshLayout.J ? swipeRefreshLayout.z - Math.abs(swipeRefreshLayout.y) : swipeRefreshLayout.z;
            swipeRefreshLayout.setTargetOffsetTopAndBottom((swipeRefreshLayout.w + ((int) ((abs - r1) * f))) - swipeRefreshLayout.u.getTop());
            swipeRefreshLayout.B.c(1.0f - f);
        }
    }

    /* loaded from: classes12.dex */
    public class d extends Animation {
        public d() {
        }

        @Override // android.view.animation.Animation
        public final void applyTransformation(float f, Transformation transformation) {
            SwipeRefreshLayout.this.g(f);
        }
    }

    /* loaded from: classes12.dex */
    public interface e {
        boolean a();
    }

    public interface f {
        void h();
    }

    public SwipeRefreshLayout(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        this.d = false;
        this.f = -1.0f;
        this.j = new int[2];
        this.k = new int[2];
        this.r = -1;
        this.v = -1;
        this.L = new a();
        this.M = new c();
        this.N = new d();
        this.e = ViewConfiguration.get(context).getScaledTouchSlop();
        this.m = getResources().getInteger(R.integer.config_mediumAnimTime);
        setWillNotDraw(false);
        this.t = new DecelerateInterpolator(2.0f);
        DisplayMetrics displayMetrics = getResources().getDisplayMetrics();
        this.I = (int) (displayMetrics.density * 40.0f);
        this.u = new vcc(getContext());
        odc odcVar = new odc(getContext());
        this.B = odcVar;
        odcVar.h(1);
        this.u.setImageDrawable(this.B);
        this.u.setVisibility(8);
        addView(this.u);
        setChildrenDrawingOrderEnabled(true);
        int i = (int) (displayMetrics.density * 64.0f);
        this.z = i;
        this.f = i;
        this.h = new v160();
        this.i = new s160(this);
        setNestedScrollingEnabled(true);
        int i2 = -this.I;
        this.n = i2;
        this.y = i2;
        g(1.0f);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, O);
        setEnabled(obtainStyledAttributes.getBoolean(0, true));
        obtainStyledAttributes.recycle();
    }

    private void setColorViewAlpha(int i) {
        this.u.getBackground().setAlpha(i);
        this.B.setAlpha(i);
    }

    public boolean c() {
        e eVar = this.K;
        if (eVar != null) {
            return eVar.a();
        }
        View view = this.b;
        return view instanceof ListView ? jgz.k((ListView) view) : view.canScrollVertically(-1);
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
    public final boolean dispatchNestedFling(float f2, float f3, boolean z) {
        return this.i.a(f2, f3, z);
    }

    @Override // android.view.View
    public final boolean dispatchNestedPreFling(float f2, float f3) {
        return this.i.b(f2, f3);
    }

    @Override // android.view.View
    public final boolean dispatchNestedPreScroll(int i, int i2, int[] iArr, int[] iArr2) {
        return this.i.c(i, i2, iArr, iArr2, 0);
    }

    @Override // android.view.View
    public final boolean dispatchNestedScroll(int i, int i2, int i3, int i4, int[] iArr) {
        return this.i.d(i, i2, i3, i4, iArr, 0, null);
    }

    public final void e(float f2) {
        if (f2 > this.f) {
            i(true, true);
            return;
        }
        this.d = false;
        this.B.g(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
        boolean z = this.s;
        bmn0 bmn0Var = !z ? new bmn0(this) : null;
        int i = this.n;
        if (z) {
            this.w = i;
            this.x = this.u.getScaleX();
            cmn0 cmn0Var = new cmn0(this);
            this.G = cmn0Var;
            cmn0Var.setDuration(150L);
            if (bmn0Var != null) {
                this.u.a(bmn0Var);
            }
            this.u.clearAnimation();
            this.u.startAnimation(this.G);
        } else {
            this.w = i;
            d dVar = this.N;
            dVar.reset();
            dVar.setDuration(200L);
            dVar.setInterpolator(this.t);
            if (bmn0Var != null) {
                this.u.a(bmn0Var);
            }
            this.u.clearAnimation();
            this.u.startAnimation(dVar);
        }
        this.B.b(false);
    }

    public final void f(float f2) {
        amn0 amn0Var;
        amn0 amn0Var2;
        this.B.b(true);
        float min = Math.min(1.0f, Math.abs(f2 / this.f));
        float max = (((float) Math.max(min - 0.4d, ConnectivityTracker.DEFAULT_UPLINK_BITRATE)) * 5.0f) / 3.0f;
        float abs = Math.abs(f2) - this.f;
        int i = this.A;
        if (i <= 0) {
            i = this.J ? this.z - this.y : this.z;
        }
        float f3 = i;
        double max2 = Math.max(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, Math.min(abs, f3 * 2.0f) / f3) / 4.0f;
        float pow = ((float) (max2 - Math.pow(max2, 2.0d))) * 2.0f;
        int i2 = this.y + ((int) ((f3 * min) + (f3 * pow * 2.0f)));
        if (this.u.getVisibility() != 0) {
            this.u.setVisibility(0);
        }
        if (!this.s) {
            this.u.setScaleX(1.0f);
            this.u.setScaleY(1.0f);
        }
        if (this.s) {
            setAnimationProgress(Math.min(1.0f, f2 / this.f));
        }
        if (f2 < this.f) {
            if (this.B.getAlpha() > 76 && ((amn0Var2 = this.E) == null || !amn0Var2.hasStarted() || amn0Var2.hasEnded())) {
                amn0 amn0Var3 = new amn0(this, this.B.getAlpha(), 76);
                amn0Var3.setDuration(300L);
                this.u.a(null);
                this.u.clearAnimation();
                this.u.startAnimation(amn0Var3);
                this.E = amn0Var3;
            }
        } else if (this.B.getAlpha() < 255 && ((amn0Var = this.F) == null || !amn0Var.hasStarted() || amn0Var.hasEnded())) {
            amn0 amn0Var4 = new amn0(this, this.B.getAlpha(), 255);
            amn0Var4.setDuration(300L);
            this.u.a(null);
            this.u.clearAnimation();
            this.u.startAnimation(amn0Var4);
            this.F = amn0Var4;
        }
        this.B.g(Math.min(0.8f, max * 0.8f));
        this.B.c(Math.min(1.0f, max));
        this.B.e(((pow * 2.0f) + ((max * 0.4f) - 0.25f)) * 0.5f);
        setTargetOffsetTopAndBottom(i2 - this.n);
    }

    public final void g(float f2) {
        setTargetOffsetTopAndBottom((this.w + ((int) ((this.y - r0) * f2))) - this.u.getTop());
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

    public int getProgressCircleDiameter() {
        return this.I;
    }

    public int getProgressViewEndOffset() {
        return this.z;
    }

    public int getProgressViewStartOffset() {
        return this.y;
    }

    public final void h() {
        this.u.clearAnimation();
        this.B.stop();
        this.u.setVisibility(8);
        setColorViewAlpha(255);
        if (this.s) {
            setAnimationProgress(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
        } else {
            setTargetOffsetTopAndBottom(this.y - this.n);
        }
        this.n = this.u.getTop();
    }

    @Override // android.view.View
    public final boolean hasNestedScrollingParent() {
        return this.i.f(0);
    }

    public final void i(boolean z, boolean z2) {
        if (this.d != z) {
            this.H = z2;
            d();
            this.d = z;
            a aVar = this.L;
            if (!z) {
                k(aVar);
                return;
            }
            this.w = this.n;
            c cVar = this.M;
            cVar.reset();
            cVar.setDuration(200L);
            cVar.setInterpolator(this.t);
            if (aVar != null) {
                this.u.a(aVar);
            }
            this.u.clearAnimation();
            this.u.startAnimation(cVar);
        }
    }

    @Override // android.view.View
    public final boolean isNestedScrollingEnabled() {
        return this.i.d;
    }

    public final void j(float f2) {
        float f3 = this.p;
        float f4 = f2 - f3;
        float f5 = this.e;
        if (f4 <= f5 || this.q) {
            return;
        }
        this.o = f3 + f5;
        this.q = true;
        this.B.setAlpha(76);
    }

    public final void k(Animation.AnimationListener animationListener) {
        b bVar = new b();
        this.D = bVar;
        bVar.setDuration(150L);
        this.u.a(animationListener);
        this.u.clearAnimation();
        this.u.startAnimation(this.D);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        h();
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        d();
        int actionMasked = motionEvent.getActionMasked();
        if (isEnabled() && !c() && !this.d && !this.l) {
            if (actionMasked != 0) {
                if (actionMasked != 1) {
                    if (actionMasked == 2) {
                        int i = this.r;
                        if (i == -1) {
                            Log.e("SwipeRefreshLayout", "Got ACTION_MOVE event but don't have an active pointer id.");
                            return false;
                        }
                        int findPointerIndex = motionEvent.findPointerIndex(i);
                        if (findPointerIndex >= 0) {
                            j(motionEvent.getY(findPointerIndex));
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
            setTargetOffsetTopAndBottom(this.y - this.u.getTop());
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
        this.u.measure(View.MeasureSpec.makeMeasureSpec(this.I, 1073741824), View.MeasureSpec.makeMeasureSpec(this.I, 1073741824));
        this.v = -1;
        for (int i3 = 0; i3 < getChildCount(); i3++) {
            if (getChildAt(i3) == this.u) {
                this.v = i3;
                return;
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onNestedFling(View view, float f2, float f3, boolean z) {
        return this.i.a(f2, f3, z);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onNestedPreFling(View view, float f2, float f3) {
        return this.i.b(f2, f3);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedPreScroll(View view, int i, int i2, int[] iArr) {
        if (i2 > 0) {
            float f2 = this.g;
            if (f2 > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                float f3 = i2;
                if (f3 > f2) {
                    iArr[1] = i2 - ((int) f2);
                    this.g = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
                } else {
                    this.g = f2 - f3;
                    iArr[1] = i2;
                }
                f(this.g);
            }
        }
        if (this.J && i2 > 0 && this.g == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT && Math.abs(i2 - iArr[1]) > 0) {
            this.u.setVisibility(8);
        }
        int i3 = i - iArr[0];
        int i4 = i2 - iArr[1];
        int[] iArr2 = this.j;
        if (dispatchNestedPreScroll(i3, i4, iArr2, null)) {
            iArr[0] = iArr[0] + iArr2[0];
            iArr[1] = iArr[1] + iArr2[1];
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedScroll(View view, int i, int i2, int i3, int i4) {
        dispatchNestedScroll(i, i2, i3, i4, this.k);
        if (i4 + this.k[1] >= 0 || c()) {
            return;
        }
        float abs = this.g + Math.abs(r11);
        this.g = abs;
        f(abs);
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
        float f2 = this.g;
        if (f2 > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
            e(f2);
            this.g = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        }
        stopNestedScroll();
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (isEnabled() && !c() && !this.d && !this.l) {
            if (actionMasked == 0) {
                this.r = motionEvent.getPointerId(0);
                this.q = false;
                return true;
            }
            if (actionMasked == 1) {
                int findPointerIndex = motionEvent.findPointerIndex(this.r);
                if (findPointerIndex < 0) {
                    Log.e("SwipeRefreshLayout", "Got ACTION_UP event but don't have an active pointer id.");
                    return false;
                }
                if (this.q) {
                    float y = (motionEvent.getY(findPointerIndex) - this.o) * 0.5f;
                    this.q = false;
                    e(y);
                }
                this.r = -1;
                return false;
            }
            if (actionMasked == 2) {
                int findPointerIndex2 = motionEvent.findPointerIndex(this.r);
                if (findPointerIndex2 < 0) {
                    Log.e("SwipeRefreshLayout", "Got ACTION_MOVE event but have an invalid active pointer id.");
                    return false;
                }
                float y2 = motionEvent.getY(findPointerIndex2);
                j(y2);
                if (this.q) {
                    float f2 = (y2 - this.o) * 0.5f;
                    if (f2 > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                        f(f2);
                    }
                }
                return true;
            }
            if (actionMasked != 3) {
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
                if (actionIndex2 < 0) {
                    Log.e("SwipeRefreshLayout", "Got ACTION_POINTER_DOWN event but have an invalid action index.");
                    return false;
                }
                this.r = motionEvent.getPointerId(actionIndex2);
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

    public void setAnimationProgress(float f2) {
        this.u.setScaleX(f2);
        this.u.setScaleY(f2);
    }

    @Deprecated
    public void setColorScheme(int... iArr) {
        setColorSchemeResources(iArr);
    }

    public void setColorSchemeColors(int... iArr) {
        d();
        this.B.d(iArr);
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
        this.f = i;
    }

    @Override // android.view.View
    public void setEnabled(boolean z) {
        super.setEnabled(z);
        if (z) {
            return;
        }
        h();
    }

    @Override // android.view.View
    public void setNestedScrollingEnabled(boolean z) {
        this.i.g(z);
    }

    public void setOnChildScrollUpCallback(@Nullable e eVar) {
        this.K = eVar;
    }

    public void setOnRefreshListener(@Nullable f fVar) {
        this.c = fVar;
    }

    @Deprecated
    public void setProgressBackgroundColor(int i) {
        setProgressBackgroundColorSchemeResource(i);
    }

    public void setProgressBackgroundColorSchemeColor(int i) {
        this.u.setBackgroundColor(i);
    }

    public void setProgressBackgroundColorSchemeResource(int i) {
        setProgressBackgroundColorSchemeColor(getContext().getColor(i));
    }

    public void setRefreshing(boolean z) {
        if (!z || this.d == z) {
            i(z, false);
            return;
        }
        this.d = z;
        setTargetOffsetTopAndBottom((!this.J ? this.z + this.y : this.z) - this.n);
        this.H = false;
        this.u.setVisibility(0);
        this.B.setAlpha(255);
        zln0 zln0Var = new zln0(this);
        this.C = zln0Var;
        zln0Var.setDuration(this.m);
        a aVar = this.L;
        if (aVar != null) {
            this.u.a(aVar);
        }
        this.u.clearAnimation();
        this.u.startAnimation(this.C);
    }

    public void setSize(int i) {
        if (i == 0 || i == 1) {
            DisplayMetrics displayMetrics = getResources().getDisplayMetrics();
            if (i == 0) {
                this.I = (int) (displayMetrics.density * 56.0f);
            } else {
                this.I = (int) (displayMetrics.density * 40.0f);
            }
            this.u.setImageDrawable(null);
            this.B.h(i);
            this.u.setImageDrawable(this.B);
        }
    }

    public void setSlingshotDistance(int i) {
        this.A = i;
    }

    public void setTargetOffsetTopAndBottom(int i) {
        vcc vccVar = this.u;
        vccVar.bringToFront();
        WeakHashMap<View, b0u0> weakHashMap = iut0.a;
        vccVar.offsetTopAndBottom(i);
        this.n = vccVar.getTop();
    }

    @Override // android.view.View
    public final boolean startNestedScroll(int i) {
        return this.i.h(i, 0);
    }

    @Override // android.view.View
    public final void stopNestedScroll() {
        this.i.i(0);
    }

    /* loaded from: classes12.dex */
    public class a implements Animation.AnimationListener {
        public a() {
        }

        @Override // android.view.animation.Animation.AnimationListener
        public final void onAnimationEnd(Animation animation) {
            f fVar;
            SwipeRefreshLayout swipeRefreshLayout = SwipeRefreshLayout.this;
            if (!swipeRefreshLayout.d) {
                swipeRefreshLayout.h();
                return;
            }
            swipeRefreshLayout.B.setAlpha(255);
            swipeRefreshLayout.B.start();
            if (swipeRefreshLayout.H && (fVar = swipeRefreshLayout.c) != null) {
                fVar.h();
            }
            swipeRefreshLayout.n = swipeRefreshLayout.u.getTop();
        }

        @Override // android.view.animation.Animation.AnimationListener
        public final void onAnimationRepeat(Animation animation) {
        }

        @Override // android.view.animation.Animation.AnimationListener
        public final void onAnimationStart(Animation animation) {
        }
    }
}
