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
import androidx.core.view.q0;
import androidx.core.view.s;
import androidx.core.view.t;
import androidx.core.view.u;
import androidx.core.view.v;
import androidx.core.view.w;
import androidx.core.view.z0;
import io.sentry.android.core.w0;
import java.util.WeakHashMap;
import kotlin.KotlinVersion;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public class SwipeRefreshLayout extends ViewGroup implements v, u, s {
    public static final int[] K = {R.attr.enabled};
    public f A;
    public f B;
    public g C;
    public g D;
    public boolean E;
    public int F;
    public boolean G;
    public final e H;
    public final f I;
    public final f J;

    /* renamed from: a, reason: collision with root package name */
    public View f2614a;

    /* renamed from: b, reason: collision with root package name */
    public i f2615b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f2616c;

    /* renamed from: d, reason: collision with root package name */
    public final int f2617d;

    /* renamed from: e, reason: collision with root package name */
    public float f2618e;

    /* renamed from: f, reason: collision with root package name */
    public float f2619f;

    /* renamed from: g, reason: collision with root package name */
    public final w f2620g;

    /* renamed from: h, reason: collision with root package name */
    public final t f2621h;

    /* renamed from: i, reason: collision with root package name */
    public final int[] f2622i;
    public final int[] j;

    /* renamed from: k, reason: collision with root package name */
    public final int[] f2623k;

    /* renamed from: l, reason: collision with root package name */
    public boolean f2624l;

    /* renamed from: m, reason: collision with root package name */
    public final int f2625m;

    /* renamed from: n, reason: collision with root package name */
    public int f2626n;

    /* renamed from: o, reason: collision with root package name */
    public float f2627o;

    /* renamed from: p, reason: collision with root package name */
    public float f2628p;
    public boolean q;

    /* renamed from: r, reason: collision with root package name */
    public int f2629r;

    /* renamed from: s, reason: collision with root package name */
    public final DecelerateInterpolator f2630s;

    /* renamed from: t, reason: collision with root package name */
    public final a f2631t;

    /* renamed from: u, reason: collision with root package name */
    public int f2632u;

    /* renamed from: v, reason: collision with root package name */
    public int f2633v;

    /* renamed from: w, reason: collision with root package name */
    public final int f2634w;

    /* renamed from: x, reason: collision with root package name */
    public final int f2635x;

    /* renamed from: y, reason: collision with root package name */
    public int f2636y;

    /* renamed from: z, reason: collision with root package name */
    public final d f2637z;

    public SwipeRefreshLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f2616c = false;
        this.f2618e = -1.0f;
        this.f2622i = new int[2];
        this.j = new int[2];
        this.f2623k = new int[2];
        this.f2629r = -1;
        this.f2632u = -1;
        this.H = new e(this, 0);
        this.I = new f(this, 2);
        this.J = new f(this, 3);
        this.f2617d = ViewConfiguration.get(context).getScaledTouchSlop();
        this.f2625m = getResources().getInteger(R.integer.config_mediumAnimTime);
        setWillNotDraw(false);
        this.f2630s = new DecelerateInterpolator(2.0f);
        DisplayMetrics displayMetrics = getResources().getDisplayMetrics();
        this.F = (int) (displayMetrics.density * 40.0f);
        a aVar = new a(getContext());
        float f6 = aVar.getContext().getResources().getDisplayMetrics().density;
        TypedArray obtainStyledAttributes = aVar.getContext().obtainStyledAttributes(y2.a.f25670a);
        aVar.f2640b = obtainStyledAttributes.getColor(0, -328966);
        obtainStyledAttributes.recycle();
        ShapeDrawable shapeDrawable = new ShapeDrawable(new OvalShape());
        WeakHashMap weakHashMap = z0.f1413a;
        q0.k(aVar, f6 * 4.0f);
        shapeDrawable.getPaint().setColor(aVar.f2640b);
        aVar.setBackground(shapeDrawable);
        this.f2631t = aVar;
        d dVar = new d(getContext());
        this.f2637z = dVar;
        dVar.c(1);
        this.f2631t.setImageDrawable(this.f2637z);
        this.f2631t.setVisibility(8);
        addView(this.f2631t);
        setChildrenDrawingOrderEnabled(true);
        int i5 = (int) (displayMetrics.density * 64.0f);
        this.f2635x = i5;
        this.f2618e = i5;
        this.f2620g = new w();
        this.f2621h = new t(this);
        setNestedScrollingEnabled(true);
        int i10 = -this.F;
        this.f2626n = i10;
        this.f2634w = i10;
        e(1.0f);
        TypedArray obtainStyledAttributes2 = context.obtainStyledAttributes(attributeSet, K);
        setEnabled(obtainStyledAttributes2.getBoolean(0, true));
        obtainStyledAttributes2.recycle();
    }

    private void setColorViewAlpha(int i5) {
        this.f2631t.getBackground().setAlpha(i5);
        this.f2637z.setAlpha(i5);
    }

    public final boolean a() {
        View view = this.f2614a;
        return view instanceof ListView ? ((ListView) view).canScrollList(-1) : view.canScrollVertically(-1);
    }

    public final void b() {
        if (this.f2614a == null) {
            for (int i5 = 0; i5 < getChildCount(); i5++) {
                View childAt = getChildAt(i5);
                if (!childAt.equals(this.f2631t)) {
                    this.f2614a = childAt;
                    return;
                }
            }
        }
    }

    public final void c(float f6) {
        if (f6 > this.f2618e) {
            g(true, true);
            return;
        }
        this.f2616c = false;
        d dVar = this.f2637z;
        c cVar = dVar.f2665a;
        cVar.f2647e = 0.0f;
        cVar.f2648f = 0.0f;
        dVar.invalidateSelf();
        e eVar = new e(this, 1);
        this.f2633v = this.f2626n;
        f fVar = this.J;
        fVar.reset();
        fVar.setDuration(200L);
        fVar.setInterpolator(this.f2630s);
        a aVar = this.f2631t;
        aVar.f2639a = eVar;
        aVar.clearAnimation();
        this.f2631t.startAnimation(fVar);
        d dVar2 = this.f2637z;
        c cVar2 = dVar2.f2665a;
        if (cVar2.f2655n) {
            cVar2.f2655n = false;
        }
        dVar2.invalidateSelf();
    }

    public final void d(float f6) {
        g gVar;
        g gVar2;
        d dVar = this.f2637z;
        c cVar = dVar.f2665a;
        if (!cVar.f2655n) {
            cVar.f2655n = true;
        }
        dVar.invalidateSelf();
        float min = Math.min(1.0f, Math.abs(f6 / this.f2618e));
        float max = (((float) Math.max(min - 0.4d, 0.0d)) * 5.0f) / 3.0f;
        float abs = Math.abs(f6) - this.f2618e;
        int i5 = this.f2636y;
        if (i5 <= 0) {
            i5 = this.f2635x;
        }
        float f10 = i5;
        double max2 = Math.max(0.0f, Math.min(abs, f10 * 2.0f) / f10) / 4.0f;
        float pow = ((float) (max2 - Math.pow(max2, 2.0d))) * 2.0f;
        int i10 = this.f2634w + ((int) ((f10 * min) + (f10 * pow * 2.0f)));
        if (this.f2631t.getVisibility() != 0) {
            this.f2631t.setVisibility(0);
        }
        this.f2631t.setScaleX(1.0f);
        this.f2631t.setScaleY(1.0f);
        if (f6 < this.f2618e) {
            if (this.f2637z.f2665a.f2660t > 76 && ((gVar2 = this.C) == null || !gVar2.hasStarted() || gVar2.hasEnded())) {
                g gVar3 = new g(this, this.f2637z.f2665a.f2660t, 76);
                gVar3.setDuration(300L);
                a aVar = this.f2631t;
                aVar.f2639a = null;
                aVar.clearAnimation();
                this.f2631t.startAnimation(gVar3);
                this.C = gVar3;
            }
        } else if (this.f2637z.f2665a.f2660t < 255 && ((gVar = this.D) == null || !gVar.hasStarted() || gVar.hasEnded())) {
            g gVar4 = new g(this, this.f2637z.f2665a.f2660t, KotlinVersion.MAX_COMPONENT_VALUE);
            gVar4.setDuration(300L);
            a aVar2 = this.f2631t;
            aVar2.f2639a = null;
            aVar2.clearAnimation();
            this.f2631t.startAnimation(gVar4);
            this.D = gVar4;
        }
        float min2 = Math.min(0.8f, max * 0.8f);
        d dVar2 = this.f2637z;
        c cVar2 = dVar2.f2665a;
        cVar2.f2647e = 0.0f;
        cVar2.f2648f = min2;
        dVar2.invalidateSelf();
        float min3 = Math.min(1.0f, max);
        d dVar3 = this.f2637z;
        c cVar3 = dVar3.f2665a;
        if (min3 != cVar3.f2657p) {
            cVar3.f2657p = min3;
        }
        dVar3.invalidateSelf();
        d dVar4 = this.f2637z;
        dVar4.f2665a.f2649g = ((pow * 2.0f) + ((max * 0.4f) - 0.25f)) * 0.5f;
        dVar4.invalidateSelf();
        setTargetOffsetTopAndBottom(i10 - this.f2626n);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        if (keyEvent == null || keyEvent.getAction() != 1 || keyEvent.getKeyCode() != 285) {
            return super.dispatchKeyEvent(keyEvent);
        }
        h(true, true);
        return true;
    }

    @Override // android.view.View
    public final boolean dispatchNestedFling(float f6, float f10, boolean z5) {
        return this.f2621h.a(f6, f10, z5);
    }

    @Override // android.view.View
    public final boolean dispatchNestedPreFling(float f6, float f10) {
        return this.f2621h.b(f6, f10);
    }

    @Override // android.view.View
    public final boolean dispatchNestedPreScroll(int i5, int i10, int[] iArr, int[] iArr2) {
        return this.f2621h.c(i5, i10, iArr, iArr2, 0);
    }

    @Override // android.view.View
    public final boolean dispatchNestedScroll(int i5, int i10, int i11, int i12, int[] iArr) {
        return this.f2621h.d(i5, i10, i11, i12, iArr, 0, null);
    }

    public final void e(float f6) {
        setTargetOffsetTopAndBottom((this.f2633v + ((int) ((this.f2634w - r0) * f6))) - this.f2631t.getTop());
    }

    public final void f() {
        this.f2631t.clearAnimation();
        this.f2637z.stop();
        this.f2631t.setVisibility(8);
        setColorViewAlpha(KotlinVersion.MAX_COMPONENT_VALUE);
        setTargetOffsetTopAndBottom(this.f2634w - this.f2626n);
        this.f2626n = this.f2631t.getTop();
    }

    public final void g(boolean z5, boolean z7) {
        if (this.f2616c != z5) {
            this.E = z7;
            b();
            this.f2616c = z5;
            e eVar = this.H;
            if (!z5) {
                f fVar = new f(this, 1);
                this.B = fVar;
                fVar.setDuration(150L);
                a aVar = this.f2631t;
                aVar.f2639a = eVar;
                aVar.clearAnimation();
                this.f2631t.startAnimation(this.B);
                return;
            }
            this.f2633v = this.f2626n;
            f fVar2 = this.I;
            fVar2.reset();
            fVar2.setDuration(200L);
            fVar2.setInterpolator(this.f2630s);
            if (eVar != null) {
                this.f2631t.f2639a = eVar;
            }
            this.f2631t.clearAnimation();
            this.f2631t.startAnimation(fVar2);
        }
    }

    @Override // android.view.ViewGroup
    public final int getChildDrawingOrder(int i5, int i10) {
        int i11 = this.f2632u;
        return i11 < 0 ? i10 : i10 == i5 + (-1) ? i11 : i10 >= i11 ? i10 + 1 : i10;
    }

    @Override // android.view.ViewGroup
    public int getNestedScrollAxes() {
        w wVar = this.f2620g;
        return wVar.f1405b | wVar.f1404a;
    }

    public int getProgressCircleDiameter() {
        return this.F;
    }

    public int getProgressViewEndOffset() {
        return this.f2635x;
    }

    public int getProgressViewStartOffset() {
        return this.f2634w;
    }

    public final void h(boolean z5, boolean z7) {
        if (!z5 || this.f2616c == z5) {
            g(z5, false);
            return;
        }
        this.f2616c = z5;
        setTargetOffsetTopAndBottom((this.f2635x + this.f2634w) - this.f2626n);
        this.E = z7;
        this.f2631t.setVisibility(0);
        this.f2637z.setAlpha(KotlinVersion.MAX_COMPONENT_VALUE);
        f fVar = new f(this, 0);
        this.A = fVar;
        fVar.setDuration(this.f2625m);
        e eVar = this.H;
        if (eVar != null) {
            this.f2631t.f2639a = eVar;
        }
        this.f2631t.clearAnimation();
        this.f2631t.startAnimation(this.A);
    }

    @Override // android.view.View
    public final boolean hasNestedScrollingParent() {
        return this.f2621h.f(0);
    }

    public final void i(float f6) {
        float f10 = this.f2628p;
        float f11 = f6 - f10;
        float f12 = this.f2617d;
        if (f11 <= f12 || this.q) {
            return;
        }
        this.f2627o = f10 + f12;
        this.q = true;
        this.f2637z.setAlpha(76);
    }

    @Override // android.view.View
    public final boolean isNestedScrollingEnabled() {
        return this.f2621h.f1395d;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        f();
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        b();
        int actionMasked = motionEvent.getActionMasked();
        if (isEnabled() && !a() && !this.f2616c && !this.f2624l) {
            if (actionMasked != 0) {
                if (actionMasked != 1) {
                    if (actionMasked == 2) {
                        int i5 = this.f2629r;
                        if (i5 == -1) {
                            w0.d("SwipeRefreshLayout", "Got ACTION_MOVE event but don't have an active pointer id.");
                            return false;
                        }
                        int findPointerIndex = motionEvent.findPointerIndex(i5);
                        if (findPointerIndex >= 0) {
                            i(motionEvent.getY(findPointerIndex));
                        }
                    } else if (actionMasked != 3) {
                        if (actionMasked == 6) {
                            int actionIndex = motionEvent.getActionIndex();
                            if (motionEvent.getPointerId(actionIndex) == this.f2629r) {
                                this.f2629r = motionEvent.getPointerId(actionIndex == 0 ? 1 : 0);
                            }
                        }
                    }
                    return this.q;
                }
                this.q = false;
                this.f2629r = -1;
                return this.q;
            }
            setTargetOffsetTopAndBottom(this.f2634w - this.f2631t.getTop());
            int pointerId = motionEvent.getPointerId(0);
            this.f2629r = pointerId;
            this.q = false;
            int findPointerIndex2 = motionEvent.findPointerIndex(pointerId);
            if (findPointerIndex2 >= 0) {
                this.f2628p = motionEvent.getY(findPointerIndex2);
                return this.q;
            }
        }
        return false;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z5, int i5, int i10, int i11, int i12) {
        int measuredWidth = getMeasuredWidth();
        int measuredHeight = getMeasuredHeight();
        if (getChildCount() == 0) {
            return;
        }
        if (this.f2614a == null) {
            b();
        }
        View view = this.f2614a;
        if (view == null) {
            return;
        }
        int paddingLeft = getPaddingLeft();
        int paddingTop = getPaddingTop();
        view.layout(paddingLeft, paddingTop, ((measuredWidth - getPaddingLeft()) - getPaddingRight()) + paddingLeft, ((measuredHeight - getPaddingTop()) - getPaddingBottom()) + paddingTop);
        int measuredWidth2 = this.f2631t.getMeasuredWidth();
        int measuredHeight2 = this.f2631t.getMeasuredHeight();
        int i13 = measuredWidth / 2;
        int i14 = measuredWidth2 / 2;
        int i15 = this.f2626n;
        this.f2631t.layout(i13 - i14, i15, i13 + i14, measuredHeight2 + i15);
    }

    @Override // android.view.View
    public final void onMeasure(int i5, int i10) {
        super.onMeasure(i5, i10);
        if (this.f2614a == null) {
            b();
        }
        View view = this.f2614a;
        if (view == null) {
            return;
        }
        view.measure(View.MeasureSpec.makeMeasureSpec((getMeasuredWidth() - getPaddingLeft()) - getPaddingRight(), 1073741824), View.MeasureSpec.makeMeasureSpec((getMeasuredHeight() - getPaddingTop()) - getPaddingBottom(), 1073741824));
        this.f2631t.measure(View.MeasureSpec.makeMeasureSpec(this.F, 1073741824), View.MeasureSpec.makeMeasureSpec(this.F, 1073741824));
        this.f2632u = -1;
        for (int i11 = 0; i11 < getChildCount(); i11++) {
            if (getChildAt(i11) == this.f2631t) {
                this.f2632u = i11;
                return;
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onNestedFling(View view, float f6, float f10, boolean z5) {
        return this.f2621h.a(f6, f10, z5);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onNestedPreFling(View view, float f6, float f10) {
        return this.f2621h.b(f6, f10);
    }

    @Override // androidx.core.view.u
    public final void onNestedPreScroll(View view, int i5, int i10, int[] iArr, int i11) {
        if (i11 == 0) {
            onNestedPreScroll(view, i5, i10, iArr);
        }
    }

    @Override // androidx.core.view.v
    public final void onNestedScroll(View view, int i5, int i10, int i11, int i12, int i13, int[] iArr) {
        if (i13 != 0) {
            return;
        }
        int i14 = iArr[1];
        if (i13 == 0) {
            this.f2621h.d(i5, i10, i11, i12, this.j, i13, iArr);
        }
        int i15 = i12 - (iArr[1] - i14);
        if ((i15 == 0 ? i12 + this.j[1] : i15) >= 0 || a()) {
            return;
        }
        float abs = this.f2619f + Math.abs(r14);
        this.f2619f = abs;
        d(abs);
        iArr[1] = iArr[1] + i15;
    }

    @Override // androidx.core.view.u
    public final void onNestedScrollAccepted(View view, View view2, int i5, int i10) {
        if (i10 == 0) {
            onNestedScrollAccepted(view, view2, i5);
        }
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.getSuperState());
        setRefreshing(savedState.f2638a);
    }

    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        return new SavedState(super.onSaveInstanceState(), this.f2616c);
    }

    @Override // androidx.core.view.u
    public final boolean onStartNestedScroll(View view, View view2, int i5, int i10) {
        if (i10 == 0) {
            return onStartNestedScroll(view, view2, i5);
        }
        return false;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onStopNestedScroll(View view) {
        this.f2620g.f1404a = 0;
        this.f2624l = false;
        float f6 = this.f2619f;
        if (f6 > 0.0f) {
            c(f6);
            this.f2619f = 0.0f;
        } else {
            post(new aa.c(4, this));
        }
        stopNestedScroll();
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (isEnabled() && !a() && !this.f2616c && !this.f2624l) {
            if (actionMasked == 0) {
                this.f2629r = motionEvent.getPointerId(0);
                this.q = false;
                return true;
            }
            if (actionMasked == 1) {
                int findPointerIndex = motionEvent.findPointerIndex(this.f2629r);
                if (findPointerIndex < 0) {
                    w0.d("SwipeRefreshLayout", "Got ACTION_UP event but don't have an active pointer id.");
                    return false;
                }
                if (this.q) {
                    float y5 = (motionEvent.getY(findPointerIndex) - this.f2627o) * 0.5f;
                    this.q = false;
                    c(y5);
                }
                this.f2629r = -1;
                return false;
            }
            if (actionMasked == 2) {
                int findPointerIndex2 = motionEvent.findPointerIndex(this.f2629r);
                if (findPointerIndex2 < 0) {
                    w0.d("SwipeRefreshLayout", "Got ACTION_MOVE event but have an invalid active pointer id.");
                    return false;
                }
                float y10 = motionEvent.getY(findPointerIndex2);
                i(y10);
                if (this.q) {
                    float f6 = (y10 - this.f2627o) * 0.5f;
                    if (f6 > 0.0f) {
                        getParent().requestDisallowInterceptTouchEvent(true);
                        d(f6);
                    }
                }
                return true;
            }
            if (actionMasked != 3) {
                if (actionMasked != 5) {
                    if (actionMasked == 6) {
                        int actionIndex = motionEvent.getActionIndex();
                        if (motionEvent.getPointerId(actionIndex) == this.f2629r) {
                            this.f2629r = motionEvent.getPointerId(actionIndex == 0 ? 1 : 0);
                            return true;
                        }
                    }
                    return true;
                }
                int actionIndex2 = motionEvent.getActionIndex();
                if (actionIndex2 < 0) {
                    w0.d("SwipeRefreshLayout", "Got ACTION_POINTER_DOWN event but have an invalid action index.");
                    return false;
                }
                this.f2629r = motionEvent.getPointerId(actionIndex2);
                return true;
            }
        }
        return false;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void requestDisallowInterceptTouchEvent(boolean z5) {
        View view;
        if (this.G && (view = this.f2614a) != null) {
            WeakHashMap weakHashMap = z0.f1413a;
            if (!q0.h(view)) {
                return;
            }
        }
        super.requestDisallowInterceptTouchEvent(z5);
    }

    public void setAnimationProgress(float f6) {
        this.f2631t.setScaleX(f6);
        this.f2631t.setScaleY(f6);
    }

    @Deprecated
    public void setColorScheme(int... iArr) {
        setColorSchemeResources(iArr);
    }

    public void setColorSchemeColors(int... iArr) {
        b();
        d dVar = this.f2637z;
        c cVar = dVar.f2665a;
        cVar.f2651i = iArr;
        cVar.a(0);
        cVar.a(0);
        dVar.invalidateSelf();
    }

    public void setColorSchemeResources(int... iArr) {
        Context context = getContext();
        int[] iArr2 = new int[iArr.length];
        for (int i5 = 0; i5 < iArr.length; i5++) {
            iArr2[i5] = context.getColor(iArr[i5]);
        }
        setColorSchemeColors(iArr2);
    }

    public void setDistanceToTriggerSync(int i5) {
        this.f2618e = i5;
    }

    @Override // android.view.View
    public void setEnabled(boolean z5) {
        super.setEnabled(z5);
        if (z5) {
            return;
        }
        f();
    }

    @Deprecated
    public void setLegacyRequestDisallowInterceptTouchEventEnabled(boolean z5) {
        this.G = z5;
    }

    @Override // android.view.View
    public void setNestedScrollingEnabled(boolean z5) {
        t tVar = this.f2621h;
        if (tVar.f1395d) {
            ViewGroup viewGroup = tVar.f1394c;
            WeakHashMap weakHashMap = z0.f1413a;
            q0.n(viewGroup);
        }
        tVar.f1395d = z5;
    }

    public void setOnRefreshListener(i iVar) {
        this.f2615b = iVar;
    }

    @Deprecated
    public void setProgressBackgroundColor(int i5) {
        setProgressBackgroundColorSchemeResource(i5);
    }

    public void setProgressBackgroundColorSchemeColor(int i5) {
        this.f2631t.setBackgroundColor(i5);
    }

    public void setProgressBackgroundColorSchemeResource(int i5) {
        setProgressBackgroundColorSchemeColor(getContext().getColor(i5));
    }

    public void setRefreshing(boolean z5) {
        h(z5, false);
    }

    public void setSize(int i5) {
        if (i5 == 0 || i5 == 1) {
            DisplayMetrics displayMetrics = getResources().getDisplayMetrics();
            if (i5 == 0) {
                this.F = (int) (displayMetrics.density * 56.0f);
            } else {
                this.F = (int) (displayMetrics.density * 40.0f);
            }
            this.f2631t.setImageDrawable(null);
            this.f2637z.c(i5);
            this.f2631t.setImageDrawable(this.f2637z);
        }
    }

    public void setSlingshotDistance(int i5) {
        this.f2636y = i5;
    }

    public void setTargetOffsetTopAndBottom(int i5) {
        a aVar = this.f2631t;
        aVar.bringToFront();
        WeakHashMap weakHashMap = z0.f1413a;
        aVar.offsetTopAndBottom(i5);
        this.f2626n = aVar.getTop();
    }

    @Override // android.view.View
    public final boolean startNestedScroll(int i5) {
        return this.f2621h.g(i5, 0);
    }

    @Override // android.view.View
    public final void stopNestedScroll() {
        this.f2621h.h(0);
    }

    /* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
    public static class SavedState extends View.BaseSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new j();

        /* renamed from: a, reason: collision with root package name */
        public final boolean f2638a;

        public SavedState(Parcelable parcelable, boolean z5) {
            super(parcelable);
            this.f2638a = z5;
        }

        @Override // android.view.View.BaseSavedState, android.view.AbsSavedState, android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i5) {
            super.writeToParcel(parcel, i5);
            parcel.writeByte(this.f2638a ? (byte) 1 : (byte) 0);
        }

        public SavedState(Parcel parcel) {
            super(parcel);
            this.f2638a = parcel.readByte() != 0;
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedPreScroll(View view, int i5, int i10, int[] iArr) {
        if (i10 > 0) {
            float f6 = this.f2619f;
            if (f6 > 0.0f) {
                float f10 = i10;
                if (f10 > f6) {
                    iArr[1] = (int) f6;
                    this.f2619f = 0.0f;
                } else {
                    this.f2619f = f6 - f10;
                    iArr[1] = i10;
                }
                d(this.f2619f);
            }
        }
        int i11 = i5 - iArr[0];
        int i12 = i10 - iArr[1];
        int[] iArr2 = this.f2622i;
        if (dispatchNestedPreScroll(i11, i12, iArr2, null)) {
            iArr[0] = iArr[0] + iArr2[0];
            iArr[1] = iArr[1] + iArr2[1];
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedScrollAccepted(View view, View view2, int i5) {
        this.f2620g.f1404a = i5;
        startNestedScroll(i5 & 2);
        this.f2619f = 0.0f;
        this.f2624l = true;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onStartNestedScroll(View view, View view2, int i5) {
        return (!isEnabled() || this.f2616c || (i5 & 2) == 0) ? false : true;
    }

    @Override // androidx.core.view.u
    public final void onStopNestedScroll(View view, int i5) {
        if (i5 == 0) {
            onStopNestedScroll(view);
        }
    }

    @Override // androidx.core.view.u
    public final void onNestedScroll(View view, int i5, int i10, int i11, int i12, int i13) {
        onNestedScroll(view, i5, i10, i11, i12, i13, this.f2623k);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedScroll(View view, int i5, int i10, int i11, int i12) {
        onNestedScroll(view, i5, i10, i11, i12, 0, this.f2623k);
    }

    public void setOnChildScrollUpCallback(h hVar) {
    }
}
