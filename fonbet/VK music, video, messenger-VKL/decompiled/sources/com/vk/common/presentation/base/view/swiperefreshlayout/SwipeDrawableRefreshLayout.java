package com.vk.common.presentation.base.view.swiperefreshlayout;

import android.R;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.util.Log;
import android.view.KeyEvent;
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
import xsna.b0u0;
import xsna.c2e0;
import xsna.csw;
import xsna.d2e0;
import xsna.fll;
import xsna.iut0;
import xsna.jgz;
import xsna.q160;
import xsna.r160;
import xsna.s160;
import xsna.t160;
import xsna.tcc;
import xsna.tln0;
import xsna.u160;
import xsna.uln0;
import xsna.v160;
import xsna.vln0;
import xsna.yh9;

/* loaded from: classes.dex */
public class SwipeDrawableRefreshLayout extends ViewGroup implements u160, t160, q160, r160 {
    public static final int[] l0 = {R.attr.enabled};

    @Nullable
    public csw A;
    public boolean B;
    public boolean C;
    public int D;
    public float E;
    public int F;
    public int G;
    public int H;
    public c2e0 I;
    public d2e0 J;
    public boolean K;
    public tln0 L;
    public b M;
    public uln0 N;
    public uln0 O;
    public vln0 P;
    public boolean Q;
    public int R;
    public boolean S;
    public RefreshPlacement T;
    public float U;
    public int V;
    public final float W;
    public boolean a0;
    public View b;
    public boolean b0;
    public g c;
    public boolean c0;
    public boolean d;
    public int d0;
    public final int e;
    public float e0;
    public float f;
    public boolean f0;
    public float g;
    public int g0;
    public final v160 h;
    public boolean h0;
    public final s160 i;
    public final a i0;
    public final int[] j;
    public final d j0;
    public final int[] k;
    public final e k0;
    public final int[] l;
    public boolean m;
    public final int n;
    public int o;
    public float p;
    public float q;
    public boolean r;
    public int s;
    public boolean t;
    public int u;
    public boolean v;
    public final DecelerateInterpolator w;
    public final tcc x;
    public int y;

    @Nullable
    public View z;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* loaded from: classes17.dex */
    public static final class RefreshPlacement {
        private static final /* synthetic */ RefreshPlacement[] $VALUES;
        public static final RefreshPlacement CenterInHeader;
        public static final RefreshPlacement FixedInset;
        public static final RefreshPlacement Overlay;

        static {
            RefreshPlacement refreshPlacement = new RefreshPlacement("Overlay", 0);
            Overlay = refreshPlacement;
            RefreshPlacement refreshPlacement2 = new RefreshPlacement("FixedInset", 1);
            FixedInset = refreshPlacement2;
            RefreshPlacement refreshPlacement3 = new RefreshPlacement("CenterInHeader", 2);
            CenterInHeader = refreshPlacement3;
            $VALUES = new RefreshPlacement[]{refreshPlacement, refreshPlacement2, refreshPlacement3};
        }

        public RefreshPlacement() {
            throw null;
        }

        public static RefreshPlacement valueOf(String str) {
            return (RefreshPlacement) Enum.valueOf(RefreshPlacement.class, str);
        }

        public static RefreshPlacement[] values() {
            return (RefreshPlacement[]) $VALUES.clone();
        }
    }

    /* loaded from: classes17.dex */
    public class b extends Animation {
        public b() {
        }

        @Override // android.view.animation.Animation
        public final void applyTransformation(float f, Transformation transformation) {
            SwipeDrawableRefreshLayout.this.setAnimationProgress(1.0f - f);
        }
    }

    /* loaded from: classes17.dex */
    public class d extends Animation {
        public d() {
        }

        @Override // android.view.animation.Animation
        public final void applyTransformation(float f, Transformation transformation) {
            SwipeDrawableRefreshLayout swipeDrawableRefreshLayout = SwipeDrawableRefreshLayout.this;
            int abs = !swipeDrawableRefreshLayout.S ? swipeDrawableRefreshLayout.G - Math.abs(swipeDrawableRefreshLayout.F) : swipeDrawableRefreshLayout.G;
            swipeDrawableRefreshLayout.setTargetOffsetTopAndBottom((swipeDrawableRefreshLayout.D + ((int) ((abs - r1) * f))) - ((swipeDrawableRefreshLayout.m() || swipeDrawableRefreshLayout.B) ? swipeDrawableRefreshLayout.o : swipeDrawableRefreshLayout.x.getTop()));
            swipeDrawableRefreshLayout.I.c(1.0f - f);
        }
    }

    /* loaded from: classes17.dex */
    public class e extends Animation {
        public e() {
        }

        @Override // android.view.animation.Animation
        public final void applyTransformation(float f, Transformation transformation) {
            SwipeDrawableRefreshLayout.this.o(f);
        }
    }

    /* loaded from: classes17.dex */
    public interface f {
    }

    public interface g {
        void h();
    }

    public SwipeDrawableRefreshLayout(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        this.d = false;
        this.f = -1.0f;
        this.j = new int[2];
        this.k = new int[2];
        this.l = new int[2];
        this.s = -1;
        this.y = -1;
        this.C = false;
        this.T = RefreshPlacement.Overlay;
        this.W = 2.25f;
        this.e0 = -1.0f;
        this.g0 = Integer.MIN_VALUE;
        this.i0 = new a();
        this.j0 = new d();
        this.k0 = new e();
        this.e = ViewConfiguration.get(context).getScaledTouchSlop();
        this.n = getResources().getInteger(R.integer.config_mediumAnimTime);
        setWillNotDraw(false);
        this.w = new DecelerateInterpolator(2.0f);
        this.R = (int) (40.0f * getResources().getDisplayMetrics().density);
        this.U = Math.round(r1 * 24.0f);
        this.J = new fll(context);
        this.x = new tcc(getContext());
        r();
        this.x.setVisibility(8);
        addView(this.x);
        this.z = this.x;
        setChildrenDrawingOrderEnabled(true);
        y();
        if (m()) {
            tcc tccVar = this.x;
            WeakHashMap<View, b0u0> weakHashMap = iut0.a;
            tccVar.setElevation(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
        }
        this.h = new v160();
        this.i = new s160(this);
        setNestedScrollingEnabled(true);
        int i = m() ? 0 : -this.R;
        this.o = i;
        this.F = i;
        o(1.0f);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, l0);
        setEnabled(obtainStyledAttributes.getBoolean(0, true));
        obtainStyledAttributes.recycle();
    }

    private void setColorViewAlpha(int i) {
        if (this.B) {
            return;
        }
        this.x.getBackground().setAlpha(i);
        this.I.setAlpha(i);
    }

    @Override // xsna.t160
    public final void H0(@NonNull View view, int i, int i2, int i3, int i4, int i5) {
        a2(view, i, i2, i3, i4, i5, this.l);
    }

    @Override // xsna.u160
    public final void a2(@NonNull View view, int i, int i2, int i3, int i4, int i5, @NonNull int[] iArr) {
        if (i5 != 0) {
            return;
        }
        int i6 = iArr[1];
        if (i5 == 0) {
            this.i.d(i, i2, i3, i4, this.k, i5, iArr);
        }
        int i7 = i4 - (iArr[1] - i6);
        int i8 = i7 == 0 ? i4 + this.k[1] : i7;
        if (!m()) {
            if (i8 >= 0 || f()) {
                return;
            }
            float abs = this.g + Math.abs(i8);
            this.g = abs;
            n(abs);
            iArr[1] = iArr[1] + i7;
            return;
        }
        if (i8 < 0) {
            this.c0 = true;
        }
        if (i8 >= 0 || f() || this.b0) {
            return;
        }
        if (this.a0 || this.c0) {
            if (this.t && this.g == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                this.g = this.o - this.F;
            }
            float abs2 = this.g + Math.abs(i8);
            this.g = abs2;
            n(abs2);
            iArr[1] = iArr[1] + i7;
        }
    }

    public final void b(int i, a aVar) {
        this.D = i;
        boolean z = this.B;
        d dVar = this.j0;
        if (z && !isAttachedToWindow()) {
            setTargetOffsetTopAndBottom(g() - this.o);
            this.I.c(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
            if (aVar != null) {
                aVar.onAnimationEnd(dVar);
                return;
            }
            return;
        }
        dVar.reset();
        dVar.setDuration(200L);
        dVar.setInterpolator(this.w);
        if (this.B) {
            dVar.setAnimationListener(aVar);
            h().clearAnimation();
            h().startAnimation(dVar);
        } else {
            if (aVar != null) {
                this.x.setAnimationListener(aVar);
            }
            this.x.clearAnimation();
            this.C = false;
            this.x.startAnimation(dVar);
        }
    }

    public final void c(int i, Animation.AnimationListener animationListener) {
        boolean z = this.B;
        e eVar = this.k0;
        if (z && !isAttachedToWindow()) {
            this.D = i;
            o(1.0f);
            if (animationListener != null) {
                animationListener.onAnimationEnd(eVar);
                return;
            }
            return;
        }
        boolean z2 = this.B;
        DecelerateInterpolator decelerateInterpolator = this.w;
        if (z2) {
            this.D = i;
            eVar.reset();
            eVar.setDuration(200L);
            eVar.setInterpolator(decelerateInterpolator);
            eVar.setAnimationListener(animationListener);
            h().clearAnimation();
            h().startAnimation(eVar);
            return;
        }
        if (!this.v) {
            this.D = i;
            eVar.reset();
            eVar.setDuration(200L);
            eVar.setInterpolator(decelerateInterpolator);
            if (animationListener != null) {
                this.x.setAnimationListener(animationListener);
            }
            this.x.clearAnimation();
            this.C = false;
            this.x.startAnimation(eVar);
            return;
        }
        this.D = i;
        this.E = this.x.getScaleX();
        vln0 vln0Var = new vln0(this);
        this.P = vln0Var;
        vln0Var.setDuration(150L);
        if (animationListener != null) {
            this.x.setAnimationListener(animationListener);
        }
        this.x.clearAnimation();
        this.C = false;
        this.x.startAnimation(this.P);
    }

    @Override // xsna.t160
    public final void c0(int i, @NonNull View view) {
        if (i == 0) {
            onStopNestedScroll(view);
        }
    }

    public final void d() {
        View h = h();
        int i = 0;
        if (this.b != null) {
            int i2 = m() ? this.o : 0;
            int i3 = i2 - this.d0;
            if (i3 != 0) {
                View view = this.b;
                view.setTranslationY(view.getTranslationY() + i3);
                this.d0 = i2;
            }
        }
        if (h != null) {
            if (m() && h.getMeasuredHeight() > 0) {
                View h2 = h();
                int l = m() ? l() : getPaddingTop();
                int max = Math.max(0, this.o - (m() ? 0 : this.F));
                i = (((this.T != RefreshPlacement.CenterInHeader || max <= 0) ? Math.round(this.U) : Math.max(0, (max - h2.getMeasuredHeight()) / 2)) + l) - h.getTop();
            }
            if (i != this.g0) {
                h.setTranslationY(i);
                this.g0 = i;
            }
        }
        z();
        postInvalidateOnAnimation();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchKeyEvent(@Nullable KeyEvent keyEvent) {
        if (keyEvent == null || keyEvent.getAction() != 1 || keyEvent.getKeyCode() != 285) {
            return super.dispatchKeyEvent(keyEvent);
        }
        u(true, true);
        return true;
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
    public final boolean dispatchNestedPreScroll(int i, int i2, @Nullable int[] iArr, @Nullable int[] iArr2) {
        return this.i.c(i, i2, iArr, iArr2, 0);
    }

    @Override // android.view.View
    public final boolean dispatchNestedScroll(int i, int i2, int i3, int i4, @Nullable int[] iArr) {
        return this.i.d(i, i2, i3, i4, iArr, 0, null);
    }

    @Override // android.view.ViewGroup
    public final boolean drawChild(Canvas canvas, View view, long j) {
        if (!m() || view != h()) {
            return super.drawChild(canvas, view, j);
        }
        int l = m() ? l() : getPaddingTop();
        int max = Math.max(0, this.o - (m() ? 0 : this.F)) + l;
        if (max <= l) {
            return false;
        }
        int save = canvas.save();
        canvas.clipRect(getPaddingLeft(), l, getWidth() - getPaddingRight(), max);
        boolean drawChild = super.drawChild(canvas, view, j);
        canvas.restoreToCount(save);
        return drawChild;
    }

    public final float e(float f2) {
        float f3 = (f2 - this.p) * 0.5f;
        return (m() && f3 > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT && this.t) ? f3 + (this.u - this.F) : f3;
    }

    public boolean f() {
        View view = this.b;
        return view instanceof ListView ? jgz.k((ListView) view) : view.canScrollVertically(-1);
    }

    public final int g() {
        return this.S ? this.G : this.G + this.F;
    }

    @Override // android.view.ViewGroup
    public final int getChildDrawingOrder(int i, int i2) {
        if (!m()) {
            int i3 = this.y;
            return i3 < 0 ? i2 : i2 == i + (-1) ? i3 : i2 >= i3 ? i2 + 1 : i2;
        }
        int indexOfChild = indexOfChild(h());
        if (indexOfChild < 0) {
            return i2;
        }
        if (this.V > 0) {
            if (i2 != i - 1) {
                return i2 >= indexOfChild ? i2 + 1 : i2;
            }
        } else if (i2 != 0) {
            return i2 <= indexOfChild ? i2 - 1 : i2;
        }
        return indexOfChild;
    }

    @Override // android.view.ViewGroup
    public int getNestedScrollAxes() {
        return this.h.a();
    }

    public int getProgressCircleDiameter() {
        return this.R;
    }

    public int getProgressViewEndOffset() {
        return this.G;
    }

    public int getProgressViewStartOffset() {
        return this.F;
    }

    public final View h() {
        View view = this.z;
        return view != null ? view : this.x;
    }

    @Override // xsna.t160
    public final boolean h4(@NonNull View view, @NonNull View view2, int i, int i2) {
        if (i2 == 0) {
            return onStartNestedScroll(view, view2, i);
        }
        return false;
    }

    @Override // android.view.View
    public final boolean hasNestedScrollingParent() {
        return this.i.f(0);
    }

    public final void i(float f2, boolean z) {
        csw cswVar = this.A;
        if (cswVar == null) {
            return;
        }
        if (z != this.f0) {
            this.f0 = z;
            cswVar.setRefreshing(z);
        }
        if (f2 != this.e0) {
            this.e0 = f2;
            this.A.a(f2);
        }
    }

    @Override // android.view.View
    public final boolean isNestedScrollingEnabled() {
        return this.i.d;
    }

    public final void j() {
        if (this.b == null) {
            for (int i = 0; i < getChildCount(); i++) {
                View childAt = getChildAt(i);
                if (!childAt.equals(this.x) && !childAt.equals(this.z)) {
                    this.b = childAt;
                    return;
                }
            }
        }
    }

    public final void k(float f2) {
        if (m() && this.d) {
            if (f2 > this.f || this.t) {
                b(this.o, null);
                return;
            } else {
                c(this.o, null);
                return;
            }
        }
        if (f2 > this.f) {
            t(true, true);
            return;
        }
        this.d = false;
        this.I.g(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
        c(this.o, this.v ? null : new c());
        this.I.b(false);
    }

    public final int l() {
        int round;
        if (this.b == null) {
            round = getPaddingTop();
        } else {
            round = Math.round(this.b.getTranslationY() + r0.getTop()) - this.d0;
        }
        return round + this.V;
    }

    @Override // xsna.t160
    public final void l0(@NonNull View view, @NonNull View view2, int i, int i2) {
        if (i2 == 0) {
            onNestedScrollAccepted(view, view2, i);
        }
    }

    public final boolean m() {
        return !(this.T == RefreshPlacement.Overlay);
    }

    public final void n(float f2) {
        uln0 uln0Var;
        uln0 uln0Var2;
        if (!this.B) {
            this.I.b(true);
        }
        float min = Math.min(1.0f, Math.abs(f2 / this.f));
        float max = (((float) Math.max(min - 0.4d, ConnectivityTracker.DEFAULT_UPLINK_BITRATE)) * 5.0f) / 3.0f;
        float abs = Math.abs(f2) - this.f;
        int i = this.H;
        if (i <= 0) {
            i = this.S ? this.G - this.F : this.G;
        }
        float f3 = i;
        double max2 = Math.max(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, Math.min(abs, f3 * 2.0f) / f3) / 4.0f;
        float pow = ((float) (max2 - Math.pow(max2, 2.0d))) * 2.0f;
        int i2 = this.F + ((int) ((f3 * min) + (f3 * pow * 2.0f)));
        if (m() || this.B) {
            i2 = Math.min(i2, (int) (Math.max(this.f, this.G) * this.W));
        }
        if (this.B) {
            View h = h();
            if (h.getVisibility() != 0) {
                h.setVisibility(0);
            }
        } else {
            if (this.x.getVisibility() != 0) {
                this.x.setVisibility(0);
            }
            if (!this.v) {
                this.x.setScaleX(1.0f);
                this.x.setScaleY(1.0f);
            }
        }
        if (this.v) {
            setAnimationProgress(Math.min(1.0f, f2 / this.f));
        }
        if (!this.B) {
            if (f2 < this.f) {
                if (this.I.getAlpha() > 76 && ((uln0Var2 = this.N) == null || !uln0Var2.hasStarted() || uln0Var2.hasEnded())) {
                    this.N = v(this.I.getAlpha(), 76);
                }
            } else if (this.I.getAlpha() < 255 && ((uln0Var = this.O) == null || !uln0Var.hasStarted() || uln0Var.hasEnded())) {
                this.O = v(this.I.getAlpha(), 255);
            }
            this.I.g(Math.min(0.8f, max * 0.8f));
            this.I.c(Math.min(1.0f, max));
            this.I.f(((pow * 2.0f) + ((max * 0.4f) - 0.25f)) * 0.5f);
        }
        setTargetOffsetTopAndBottom(i2 - this.o);
    }

    public final void o(float f2) {
        setTargetOffsetTopAndBottom((this.D + ((int) ((this.F - r0) * f2))) - ((m() || this.B) ? this.o : this.x.getTop()));
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        q();
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        int findPointerIndex;
        j();
        int actionMasked = motionEvent.getActionMasked();
        if (isEnabled() && !f() && !this.m && (m() || !this.d)) {
            if (actionMasked != 0) {
                if (actionMasked != 1) {
                    if (actionMasked == 2) {
                        int i = this.s;
                        if (i == -1) {
                            Log.e("SwipeDrawableRefreshLayout", "Got ACTION_MOVE event but don't have an active pointer id.");
                            return false;
                        }
                        if (!this.C && (findPointerIndex = motionEvent.findPointerIndex(i)) >= 0) {
                            w(motionEvent.getY(findPointerIndex));
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
                this.t = false;
                this.s = -1;
                return this.r;
            }
            if (!this.C) {
                if (!m() || (this.d && this.o > this.F)) {
                    setTargetOffsetTopAndBottom(this.F - this.x.getTop());
                } else {
                    setTargetOffsetTopAndBottom(this.F - this.o);
                }
                p();
                int pointerId = motionEvent.getPointerId(0);
                this.s = pointerId;
                this.r = false;
                int findPointerIndex2 = motionEvent.findPointerIndex(pointerId);
                if (findPointerIndex2 >= 0) {
                    this.q = motionEvent.getY(findPointerIndex2);
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
            j();
        }
        View view = this.b;
        if (view == null) {
            return;
        }
        int paddingLeft = getPaddingLeft();
        int paddingTop = getPaddingTop();
        view.layout(paddingLeft, paddingTop, ((measuredWidth - getPaddingLeft()) - getPaddingRight()) + paddingLeft, ((measuredHeight - getPaddingTop()) - getPaddingBottom()) + paddingTop);
        int measuredWidth2 = this.x.getMeasuredWidth();
        int measuredHeight2 = this.x.getMeasuredHeight();
        if (this.B) {
            View h = h();
            int measuredWidth3 = h.getMeasuredWidth();
            int measuredHeight3 = h.getMeasuredHeight();
            int i5 = measuredWidth / 2;
            int i6 = i5 - (measuredWidth3 / 2);
            int i7 = this.o;
            if (m()) {
                i7 = getPaddingTop();
            }
            h.layout(i6, i7, measuredWidth3 + i6, measuredHeight3 + i7);
            int i8 = i5 - (measuredWidth2 / 2);
            int i9 = this.F;
            int i10 = this.R;
            this.x.layout(i8, i9, i8 + i10, i10 + i9);
        } else {
            int i11 = this.o;
            if (m()) {
                i11 = getPaddingTop();
            }
            int i12 = measuredWidth / 2;
            int i13 = measuredWidth2 / 2;
            this.x.layout(i12 - i13, i11, i12 + i13, measuredHeight2 + i11);
        }
        if (m() || this.B) {
            d();
        }
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        if (this.b == null) {
            j();
        }
        View view = this.b;
        if (view == null) {
            return;
        }
        view.measure(View.MeasureSpec.makeMeasureSpec((getMeasuredWidth() - getPaddingLeft()) - getPaddingRight(), 1073741824), View.MeasureSpec.makeMeasureSpec((getMeasuredHeight() - getPaddingTop()) - getPaddingBottom(), 1073741824));
        this.x.measure(View.MeasureSpec.makeMeasureSpec(this.R, 1073741824), View.MeasureSpec.makeMeasureSpec(this.R, 1073741824));
        View h = h();
        if (h != this.x) {
            h.measure(View.MeasureSpec.makeMeasureSpec(this.R, 1073741824), View.MeasureSpec.makeMeasureSpec(this.R, 1073741824));
        }
        this.y = -1;
        for (int i3 = 0; i3 < getChildCount(); i3++) {
            if (getChildAt(i3) == this.x) {
                this.y = i3;
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
        int i;
        if (!m() || !this.d || (i = this.o) <= this.F || f3 <= UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
            return this.i.b(f2, f3);
        }
        c(i, null);
        return true;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedPreScroll(View view, int i, int i2, int[] iArr) {
        int i3;
        int i4;
        int i5;
        boolean z = this.o == this.F;
        if (m() && i2 > 0 && z && this.g == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT && !this.c0) {
            this.b0 = true;
        }
        if (i2 > 0) {
            float f2 = this.g;
            if (f2 > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                float f3 = i2;
                if (f3 > f2) {
                    iArr[1] = (int) f2;
                    this.g = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
                } else {
                    this.g = f2 - f3;
                    iArr[1] = i2;
                }
                n(this.g);
            }
        }
        if (m() && i2 > (i3 = iArr[1]) && this.g == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT && (i4 = this.o) > (i5 = this.F)) {
            int min = Math.min(i2 - i3, i4 - i5);
            iArr[1] = iArr[1] + min;
            setTargetOffsetTopAndBottom(-min);
        }
        if (this.S && i2 > 0 && this.g == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT && Math.abs(i2 - iArr[1]) > 0) {
            this.x.setVisibility(8);
        }
        int i6 = i - iArr[0];
        int i7 = i2 - iArr[1];
        int[] iArr2 = this.j;
        if (dispatchNestedPreScroll(i6, i7, iArr2, null)) {
            iArr[0] = iArr[0] + iArr2[0];
            iArr[1] = iArr[1] + iArr2[1];
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedScroll(View view, int i, int i2, int i3, int i4) {
        a2(view, i, i2, i3, i4, 0, this.l);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedScrollAccepted(View view, View view2, int i) {
        this.h.a = i;
        startNestedScroll(i & 2);
        this.g = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        this.m = true;
        p();
        this.a0 = true ^ f();
        this.b0 = false;
        this.c0 = false;
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.getSuperState());
        setRefreshing(savedState.b);
    }

    @Override // android.view.View
    @NonNull
    public final Parcelable onSaveInstanceState() {
        return new SavedState(super.onSaveInstanceState(), this.d);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onStartNestedScroll(View view, View view2, int i) {
        return m() ? isEnabled() && (i & 2) != 0 : (!isEnabled() || this.d || (i & 2) == 0) ? false : true;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onStopNestedScroll(View view) {
        int i;
        this.h.a = 0;
        this.m = false;
        this.r = false;
        float f2 = this.g;
        if (f2 > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
            k(f2);
            this.g = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        } else if (m() && this.d && (i = this.o) > this.F && i < this.G) {
            c(i, null);
        } else if (m() && this.d) {
            z();
        } else {
            post(new yh9(this, 11));
        }
        this.t = false;
        this.a0 = false;
        this.b0 = false;
        this.c0 = false;
        stopNestedScroll();
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (!this.C) {
            int actionMasked = motionEvent.getActionMasked();
            if (isEnabled() && !f() && !this.m && (m() || !this.d)) {
                if (actionMasked == 0) {
                    this.s = motionEvent.getPointerId(0);
                    this.r = false;
                    p();
                    return true;
                }
                if (actionMasked == 1) {
                    int findPointerIndex = motionEvent.findPointerIndex(this.s);
                    if (findPointerIndex < 0) {
                        Log.e("SwipeDrawableRefreshLayout", "Got ACTION_UP event but don't have an active pointer id.");
                        return false;
                    }
                    if (this.r) {
                        float e2 = e(motionEvent.getY(findPointerIndex));
                        this.r = false;
                        k(e2);
                    }
                    this.s = -1;
                    this.t = false;
                    return false;
                }
                if (actionMasked == 2) {
                    int findPointerIndex2 = motionEvent.findPointerIndex(this.s);
                    if (findPointerIndex2 < 0) {
                        Log.e("SwipeDrawableRefreshLayout", "Got ACTION_MOVE event but have an invalid active pointer id.");
                        return false;
                    }
                    float y = motionEvent.getY(findPointerIndex2);
                    w(y);
                    if (this.r) {
                        float e3 = e(y);
                        if (e3 > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                            getParent().requestDisallowInterceptTouchEvent(true);
                            n(e3);
                        }
                    }
                } else {
                    if (actionMasked == 3) {
                        this.t = false;
                        return false;
                    }
                    if (actionMasked == 5) {
                        int actionIndex = motionEvent.getActionIndex();
                        if (actionIndex < 0) {
                            Log.e("SwipeDrawableRefreshLayout", "Got ACTION_POINTER_DOWN event but have an invalid action index.");
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

    public final void p() {
        this.u = this.o;
        this.t = m() && this.d && this.u > this.F;
    }

    public final void q() {
        if (this.B) {
            View h = h();
            h.clearAnimation();
            h.setVisibility(8);
            csw cswVar = this.A;
            if (cswVar != null) {
                cswVar.setRefreshing(false);
                this.A.a(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
            }
            this.f0 = false;
            this.e0 = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
            int i = this.o;
            int i2 = this.F;
            if (i != i2) {
                setTargetOffsetTopAndBottom(i2 - i);
            }
            this.o = m() ? this.F : h.getTop();
            z();
            return;
        }
        this.x.clearAnimation();
        this.C = false;
        this.I.stop();
        this.x.setVisibility(8);
        setColorViewAlpha(255);
        if (this.v) {
            setAnimationProgress(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
        } else {
            setTargetOffsetTopAndBottom(this.F - this.o);
        }
        if (m()) {
            this.I.g(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
            this.I.b(false);
            this.o = this.F;
            z();
        } else {
            this.o = this.x.getTop();
        }
        r();
    }

    public final void r() {
        if (this.I == null || !this.J.b() || this.K) {
            c2e0 c2e0Var = this.I;
            c2e0 a2 = this.J.a();
            this.I = a2;
            if (c2e0Var != null) {
                a2.d(c2e0Var.a());
            }
            this.x.setImageDrawable(this.I);
            this.K = false;
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void requestDisallowInterceptTouchEvent(boolean z) {
        View view;
        if (this.h0 && (view = this.b) != null) {
            WeakHashMap<View, b0u0> weakHashMap = iut0.a;
            if (!view.isNestedScrollingEnabled()) {
                return;
            }
        }
        super.requestDisallowInterceptTouchEvent(z);
    }

    public final void s(int i, int i2) {
        if (m()) {
            return;
        }
        this.v = true;
        this.F = i;
        this.G = i2;
        this.S = true;
        q();
        this.d = false;
    }

    @Override // xsna.t160
    public final void s1(@NonNull View view, int i, int i2, @NonNull int[] iArr, int i3) {
        if (i3 == 0) {
            onNestedPreScroll(view, i, i2, iArr);
        }
    }

    public void setAnimationProgress(float f2) {
        if (this.B) {
            return;
        }
        this.x.setScaleX(f2);
        this.x.setScaleY(f2);
        this.I.e(f2);
    }

    @Deprecated
    public void setColorScheme(int... iArr) {
        setColorSchemeResources(iArr);
    }

    public void setColorSchemeColors(@NonNull int... iArr) {
        j();
        if (this.B) {
            return;
        }
        this.I.d(iArr);
    }

    public void setColorSchemeResources(@NonNull int... iArr) {
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
        q();
    }

    public void setInContentTopInset(int i) {
        int max = Math.max(0, i);
        if (this.V == max) {
            return;
        }
        this.V = max;
        if (m()) {
            d();
            requestLayout();
            postInvalidateOnAnimation();
        }
    }

    public void setIndicatorInset(float f2) {
        float max = Math.max(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, f2);
        if (this.U == max) {
            return;
        }
        this.U = max;
        y();
        if (!this.d || this.o <= 0) {
            d();
        } else {
            setTargetOffsetTopAndBottom((m() ? this.G : g()) - this.o);
        }
        requestLayout();
        postInvalidateOnAnimation();
    }

    public void setIndicatorPlacement(@NonNull RefreshPlacement refreshPlacement) {
        RefreshPlacement refreshPlacement2 = this.T;
        if (refreshPlacement2 == refreshPlacement) {
            return;
        }
        RefreshPlacement refreshPlacement3 = RefreshPlacement.Overlay;
        boolean z = refreshPlacement2 == refreshPlacement3;
        j();
        this.T = refreshPlacement;
        if (m()) {
            WeakHashMap<View, b0u0> weakHashMap = iut0.a;
            this.x.setElevation(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
        }
        if (z != (this.T == refreshPlacement3)) {
            y();
            int i = m() ? 0 : -this.R;
            this.F = i;
            if (this.d) {
                i = g();
            }
            this.o = i;
        }
        d();
        requestLayout();
        postInvalidateOnAnimation();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void setIndicatorView(@NonNull View view) {
        this.I.stop();
        View h = h();
        if (h != this.x) {
            removeView(h);
        }
        this.B = true;
        this.z = view;
        this.A = view instanceof csw ? (csw) view : null;
        this.x.setVisibility(8);
        this.z.setVisibility(8);
        addView(this.z);
        y();
        int i = m() ? 0 : -this.R;
        this.F = i;
        if (this.d) {
            i = g();
        }
        this.o = i;
        d();
        requestLayout();
    }

    @Deprecated
    public void setLegacyRequestDisallowInterceptTouchEventEnabled(boolean z) {
        this.h0 = z;
    }

    @Override // android.view.View
    public void setNestedScrollingEnabled(boolean z) {
        this.i.g(z);
    }

    public void setOnRefreshListener(@Nullable g gVar) {
        this.c = gVar;
    }

    @Deprecated
    public void setProgressBackgroundColor(int i) {
        setProgressBackgroundColorSchemeResource(i);
    }

    public void setProgressBackgroundColorSchemeColor(int i) {
        if (this.B) {
            return;
        }
        this.x.setBackgroundColor(i);
    }

    public void setProgressBackgroundColorSchemeResource(int i) {
        setProgressBackgroundColorSchemeColor(getContext().getColor(i));
    }

    public void setProgressDrawableFactory(@NonNull d2e0 d2e0Var) {
        this.J = d2e0Var;
        this.K = true;
    }

    public void setRefreshing(boolean z) {
        u(z, false);
    }

    public void setSize(int i) {
        if (i == 0 || i == 1) {
            DisplayMetrics displayMetrics = getResources().getDisplayMetrics();
            if (i == 0) {
                this.R = (int) (displayMetrics.density * 56.0f);
            } else {
                this.R = (int) (displayMetrics.density * 40.0f);
            }
            this.x.setImageDrawable(null);
            this.I.h(i);
            this.x.setImageDrawable(this.I);
        }
    }

    public void setSlingshotDistance(int i) {
        this.H = i;
    }

    public void setTargetOffsetTopAndBottom(int i) {
        if (m()) {
            this.o = Math.max(this.F, this.o + i);
            d();
            return;
        }
        if (!this.B) {
            tcc tccVar = this.x;
            tccVar.bringToFront();
            WeakHashMap<View, b0u0> weakHashMap = iut0.a;
            tccVar.offsetTopAndBottom(i);
            this.o = tccVar.getTop();
            return;
        }
        View h = h();
        h.bringToFront();
        WeakHashMap<View, b0u0> weakHashMap2 = iut0.a;
        h.offsetTopAndBottom(i);
        this.o = h.getTop();
        z();
        postInvalidateOnAnimation();
    }

    @Override // android.view.View
    public final boolean startNestedScroll(int i) {
        return this.i.h(i, 0);
    }

    @Override // xsna.q160
    public final void stopNestedScroll(int i) {
    }

    public final void t(boolean z, boolean z2) {
        if (this.d != z) {
            this.Q = z2;
            j();
            this.d = z;
            a aVar = this.i0;
            if (z) {
                b(this.o, aVar);
                return;
            }
            if (!m()) {
                x(aVar);
                return;
            }
            csw cswVar = this.A;
            if (cswVar != null) {
                cswVar.setRefreshing(false);
                this.f0 = false;
            }
            c(this.o, aVar);
        }
    }

    public final void u(boolean z, boolean z2) {
        if (!z || this.d == z) {
            t(z, false);
            return;
        }
        this.d = z;
        setTargetOffsetTopAndBottom(g() - this.o);
        this.Q = z2;
        if (this.B) {
            h().setVisibility(0);
        } else {
            this.x.setVisibility(0);
            this.I.setAlpha(255);
        }
        tln0 tln0Var = new tln0(this);
        this.L = tln0Var;
        tln0Var.setDuration(this.n);
        boolean z3 = this.B;
        a aVar = this.i0;
        if (z3) {
            this.L.setAnimationListener(aVar);
            h().clearAnimation();
            h().startAnimation(this.L);
        } else {
            if (aVar != null) {
                this.x.setAnimationListener(aVar);
            }
            this.x.clearAnimation();
            this.C = false;
            this.x.startAnimation(this.L);
        }
    }

    public final uln0 v(int i, int i2) {
        uln0 uln0Var = new uln0(this, i, i2);
        uln0Var.setDuration(300L);
        this.x.setAnimationListener(null);
        this.x.clearAnimation();
        this.C = false;
        this.x.startAnimation(uln0Var);
        return uln0Var;
    }

    public final void w(float f2) {
        float f3 = this.q;
        float f4 = f2 - f3;
        float f5 = this.e;
        if (f4 <= f5 || this.r) {
            return;
        }
        this.p = f3 + f5;
        this.r = true;
        if (this.B) {
            return;
        }
        this.I.setAlpha(76);
    }

    public final void x(Animation.AnimationListener animationListener) {
        b bVar = new b();
        this.M = bVar;
        bVar.setDuration(150L);
        if (this.B) {
            this.M.setAnimationListener(animationListener);
            h().clearAnimation();
            h().startAnimation(this.M);
        } else {
            this.x.setAnimationListener(animationListener);
            this.x.clearAnimation();
            this.C = false;
            this.x.startAnimation(this.M);
        }
    }

    public final void y() {
        int round = Math.round(getResources().getDisplayMetrics().density * 64.0f);
        this.G = round;
        this.f = round;
        if (!m() || this.S) {
            return;
        }
        int round2 = Math.round((this.U * 2.0f) + this.R);
        this.G = round2;
        this.f = round2 * 1.1f;
    }

    public final void z() {
        View h = h();
        if (h == null) {
            return;
        }
        RefreshPlacement refreshPlacement = this.T;
        RefreshPlacement refreshPlacement2 = RefreshPlacement.Overlay;
        float f2 = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        if (refreshPlacement == refreshPlacement2) {
            int max = Math.max(0, this.o - this.F);
            boolean z = max > 0;
            h.setVisibility(z ? 0 : 8);
            if (this.A != null) {
                float f3 = this.f;
                if (f3 > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                    f2 = max / f3;
                }
                boolean z2 = this.d;
                i(z2 ? 1.0f : f2, z2 && z);
                return;
            }
            return;
        }
        boolean z3 = this.o > this.F;
        h.setVisibility(z3 ? 0 : 8);
        if (m() && !this.B && this.d && z3 && !this.I.isRunning()) {
            this.I.setAlpha(255);
            this.I.start();
        }
        if (this.A != null) {
            float f4 = this.f;
            if (f4 > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                f2 = this.o / f4;
            }
            boolean z4 = this.d;
            i((z4 && z3) ? 1.0f : f2, z4 && z3);
        }
    }

    /* loaded from: classes17.dex */
    public static class SavedState extends View.BaseSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new a();
        public final boolean b;

        public class a implements Parcelable.Creator<SavedState> {
            @Override // android.os.Parcelable.Creator
            public final SavedState createFromParcel(Parcel parcel) {
                return new SavedState(parcel);
            }

            @Override // android.os.Parcelable.Creator
            public final SavedState[] newArray(int i) {
                return new SavedState[i];
            }
        }

        public SavedState(Parcelable parcelable, boolean z) {
            super(parcelable);
            this.b = z;
        }

        @Override // android.view.View.BaseSavedState, android.view.AbsSavedState, android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeByte(this.b ? (byte) 1 : (byte) 0);
        }

        public SavedState(Parcel parcel) {
            super(parcel);
            this.b = parcel.readByte() != 0;
        }
    }

    @Override // android.view.View
    public final void stopNestedScroll() {
        this.i.i(0);
    }

    /* loaded from: classes17.dex */
    public class a implements Animation.AnimationListener {
        public a() {
        }

        @Override // android.view.animation.Animation.AnimationListener
        public final void onAnimationEnd(Animation animation) {
            g gVar;
            SwipeDrawableRefreshLayout swipeDrawableRefreshLayout = SwipeDrawableRefreshLayout.this;
            if (swipeDrawableRefreshLayout.d) {
                if (swipeDrawableRefreshLayout.B) {
                    swipeDrawableRefreshLayout.z();
                } else {
                    swipeDrawableRefreshLayout.I.setAlpha(255);
                    if (!swipeDrawableRefreshLayout.m() || !swipeDrawableRefreshLayout.I.isRunning()) {
                        swipeDrawableRefreshLayout.I.start();
                    }
                }
                if (swipeDrawableRefreshLayout.Q && (gVar = swipeDrawableRefreshLayout.c) != null) {
                    gVar.h();
                }
                if (swipeDrawableRefreshLayout.m()) {
                    swipeDrawableRefreshLayout.z();
                } else {
                    swipeDrawableRefreshLayout.o = swipeDrawableRefreshLayout.h().getTop();
                }
            } else {
                swipeDrawableRefreshLayout.q();
            }
            swipeDrawableRefreshLayout.C = false;
        }

        @Override // android.view.animation.Animation.AnimationListener
        public final void onAnimationStart(Animation animation) {
            SwipeDrawableRefreshLayout.this.C = true;
        }

        @Override // android.view.animation.Animation.AnimationListener
        public final void onAnimationRepeat(Animation animation) {
        }
    }

    /* loaded from: classes17.dex */
    public class c implements Animation.AnimationListener {
        public c() {
        }

        @Override // android.view.animation.Animation.AnimationListener
        public final void onAnimationEnd(Animation animation) {
            SwipeDrawableRefreshLayout swipeDrawableRefreshLayout = SwipeDrawableRefreshLayout.this;
            if (swipeDrawableRefreshLayout.v) {
                return;
            }
            swipeDrawableRefreshLayout.x(null);
        }

        @Override // android.view.animation.Animation.AnimationListener
        public final void onAnimationRepeat(Animation animation) {
        }

        @Override // android.view.animation.Animation.AnimationListener
        public final void onAnimationStart(Animation animation) {
        }
    }

    public void setOnChildScrollUpCallback(@Nullable f fVar) {
    }
}
