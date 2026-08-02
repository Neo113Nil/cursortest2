package ru.ozon.fintech.base.bottom;

import P2.b;
import android.animation.ValueAnimator;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Insets;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.Log;
import android.util.TypedValue;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.WindowInsets;
import androidx.annotation.NonNull;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.core.view.Y;
import i7.C7017a;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import ru.ozon.app.android.R;
import ru.ozon.fintech.base.bottom.m;
import y2.q;
import y7.C10856g;

/* loaded from: classes3.dex */
public class BaseBottomSheetBehaviour<V extends View> extends CoordinatorLayout.c<V> {

    /* renamed from: A, reason: collision with root package name */
    private int f94939A;

    /* renamed from: B, reason: collision with root package name */
    private boolean f94940B;

    /* renamed from: C, reason: collision with root package name */
    int f94941C;

    /* renamed from: D, reason: collision with root package name */
    int f94942D;

    /* renamed from: E, reason: collision with root package name */
    WeakReference<V> f94943E;

    /* renamed from: F, reason: collision with root package name */
    WeakReference<View> f94944F;

    /* renamed from: G, reason: collision with root package name */
    @NonNull
    private final ArrayList<b> f94945G;

    /* renamed from: H, reason: collision with root package name */
    private VelocityTracker f94946H;

    /* renamed from: I, reason: collision with root package name */
    int f94947I;

    /* renamed from: J, reason: collision with root package name */
    private int f94948J;

    /* renamed from: K, reason: collision with root package name */
    boolean f94949K;

    /* renamed from: L, reason: collision with root package name */
    private HashMap f94950L;

    /* renamed from: M, reason: collision with root package name */
    private final b.c f94951M;

    /* renamed from: a, reason: collision with root package name */
    public int f94952a;

    /* renamed from: b, reason: collision with root package name */
    @SuppressLint({"WrongConstant"})
    private int f94953b;

    /* renamed from: c, reason: collision with root package name */
    private boolean f94954c;

    /* renamed from: d, reason: collision with root package name */
    private float f94955d;

    /* renamed from: e, reason: collision with root package name */
    private int f94956e;

    /* renamed from: f, reason: collision with root package name */
    private boolean f94957f;

    /* renamed from: g, reason: collision with root package name */
    private int f94958g;

    /* renamed from: h, reason: collision with root package name */
    private boolean f94959h;

    /* renamed from: i, reason: collision with root package name */
    private C10856g f94960i;

    /* renamed from: j, reason: collision with root package name */
    private boolean f94961j;

    /* renamed from: k, reason: collision with root package name */
    private y7.k f94962k;

    /* renamed from: l, reason: collision with root package name */
    private boolean f94963l;

    /* renamed from: m, reason: collision with root package name */
    private BaseBottomSheetBehaviour<V>.d f94964m;

    /* renamed from: n, reason: collision with root package name */
    private ValueAnimator f94965n;

    /* renamed from: o, reason: collision with root package name */
    int f94966o;

    /* renamed from: p, reason: collision with root package name */
    int f94967p;

    /* renamed from: q, reason: collision with root package name */
    int f94968q;

    /* renamed from: r, reason: collision with root package name */
    float f94969r;

    /* renamed from: s, reason: collision with root package name */
    int f94970s;

    /* renamed from: t, reason: collision with root package name */
    float f94971t;

    /* renamed from: u, reason: collision with root package name */
    boolean f94972u;

    /* renamed from: v, reason: collision with root package name */
    private boolean f94973v;

    /* renamed from: w, reason: collision with root package name */
    private boolean f94974w;

    /* renamed from: x, reason: collision with root package name */
    int f94975x;

    /* renamed from: y, reason: collision with root package name */
    P2.b f94976y;

    /* renamed from: z, reason: collision with root package name */
    private boolean f94977z;

    final class a extends b.c {
        a() {
        }

        @Override // P2.b.c
        public final int clampViewPositionHorizontal(@NonNull View view, int i11, int i12) {
            return view.getLeft();
        }

        @Override // P2.b.c
        public final int clampViewPositionVertical(@NonNull View view, int i11, int i12) {
            BaseBottomSheetBehaviour baseBottomSheetBehaviour = BaseBottomSheetBehaviour.this;
            return com.google.common.primitives.e.b(i11, baseBottomSheetBehaviour.getExpandedOffset(), baseBottomSheetBehaviour.f94972u ? baseBottomSheetBehaviour.f94942D : baseBottomSheetBehaviour.f94970s);
        }

        @Override // P2.b.c
        public final int getViewVerticalDragRange(@NonNull View view) {
            BaseBottomSheetBehaviour baseBottomSheetBehaviour = BaseBottomSheetBehaviour.this;
            return baseBottomSheetBehaviour.f94972u ? baseBottomSheetBehaviour.f94942D : baseBottomSheetBehaviour.f94970s;
        }

        @Override // P2.b.c
        public final void onViewDragStateChanged(int i11) {
            if (i11 == 1) {
                BaseBottomSheetBehaviour baseBottomSheetBehaviour = BaseBottomSheetBehaviour.this;
                if (baseBottomSheetBehaviour.f94974w) {
                    baseBottomSheetBehaviour.setStateInternal(1);
                }
            }
        }

        @Override // P2.b.c
        public final void onViewPositionChanged(@NonNull View view, int i11, int i12, int i13, int i14) {
            BaseBottomSheetBehaviour.this.dispatchOnSlide(i12);
        }

        @Override // P2.b.c
        @SuppressLint({"WrongConstant"})
        public final void onViewReleased(@NonNull View view, float f7, float f11) {
            int i11;
            BaseBottomSheetBehaviour baseBottomSheetBehaviour = BaseBottomSheetBehaviour.this;
            int i12 = 6;
            if (f11 < 0.0f) {
                if (baseBottomSheetBehaviour.f94954c) {
                    i11 = baseBottomSheetBehaviour.f94967p;
                } else {
                    int top = view.getTop();
                    int i13 = baseBottomSheetBehaviour.f94968q;
                    if (top > i13) {
                        i11 = i13;
                    } else {
                        i11 = baseBottomSheetBehaviour.f94966o;
                    }
                }
                i12 = 3;
            } else if (baseBottomSheetBehaviour.f94972u && baseBottomSheetBehaviour.shouldHide(view, f11)) {
                if (Math.abs(f7) >= Math.abs(f11) || f11 <= 7500.0f) {
                    if (view.getTop() <= (baseBottomSheetBehaviour.getExpandedOffset() + baseBottomSheetBehaviour.f94942D) / baseBottomSheetBehaviour.f94952a) {
                        if (baseBottomSheetBehaviour.f94954c) {
                            i11 = baseBottomSheetBehaviour.f94967p;
                        } else if (Math.abs(view.getTop() - baseBottomSheetBehaviour.f94966o) < Math.abs(view.getTop() - baseBottomSheetBehaviour.f94968q)) {
                            i11 = baseBottomSheetBehaviour.f94966o;
                        } else {
                            i11 = baseBottomSheetBehaviour.f94968q;
                        }
                        i12 = 3;
                    }
                }
                i11 = baseBottomSheetBehaviour.f94942D;
                i12 = 5;
            } else if (f11 == 0.0f || Math.abs(f7) > Math.abs(f11)) {
                int top2 = view.getTop();
                if (!baseBottomSheetBehaviour.f94954c) {
                    int i14 = baseBottomSheetBehaviour.f94968q;
                    if (top2 < i14) {
                        if (top2 < Math.abs(top2 - baseBottomSheetBehaviour.f94970s)) {
                            i11 = baseBottomSheetBehaviour.f94966o;
                            i12 = 3;
                        } else {
                            i11 = baseBottomSheetBehaviour.f94968q;
                        }
                    } else if (Math.abs(top2 - i14) < Math.abs(top2 - baseBottomSheetBehaviour.f94970s)) {
                        i11 = baseBottomSheetBehaviour.f94968q;
                    } else {
                        i11 = baseBottomSheetBehaviour.f94970s;
                        i12 = 4;
                    }
                } else if (Math.abs(top2 - baseBottomSheetBehaviour.f94967p) < Math.abs(top2 - baseBottomSheetBehaviour.f94970s)) {
                    i11 = baseBottomSheetBehaviour.f94967p;
                    i12 = 3;
                } else {
                    i11 = baseBottomSheetBehaviour.f94970s;
                    i12 = 4;
                }
            } else {
                if (baseBottomSheetBehaviour.f94954c) {
                    i11 = baseBottomSheetBehaviour.f94970s;
                } else {
                    int top3 = view.getTop();
                    if (Math.abs(top3 - baseBottomSheetBehaviour.f94968q) < Math.abs(top3 - baseBottomSheetBehaviour.f94970s)) {
                        i11 = baseBottomSheetBehaviour.f94968q;
                    } else {
                        i11 = baseBottomSheetBehaviour.f94970s;
                    }
                }
                i12 = 4;
            }
            baseBottomSheetBehaviour.l(view, i12, i11, true);
        }

        @Override // P2.b.c
        public final boolean tryCaptureView(@NonNull View view, int i11) {
            BaseBottomSheetBehaviour baseBottomSheetBehaviour = BaseBottomSheetBehaviour.this;
            int i12 = baseBottomSheetBehaviour.f94975x;
            if (i12 == 1 || baseBottomSheetBehaviour.f94949K) {
                return false;
            }
            if (i12 == 3 && baseBottomSheetBehaviour.f94947I == i11) {
                WeakReference<View> weakReference = baseBottomSheetBehaviour.f94944F;
                View view2 = weakReference != null ? weakReference.get() : null;
                if (view2 != null && view2.canScrollVertically(-1)) {
                    return false;
                }
            }
            WeakReference<V> weakReference2 = baseBottomSheetBehaviour.f94943E;
            return weakReference2 != null && weakReference2.get() == view;
        }
    }

    public static abstract class b {
        public abstract void a(@NonNull View view, float f7);

        public abstract void b(@NonNull View view, int i11);
    }

    private class d implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        private final View f94984a;

        /* renamed from: b, reason: collision with root package name */
        private boolean f94985b;

        /* renamed from: c, reason: collision with root package name */
        int f94986c;

        d(View view, int i11) {
            this.f94984a = view;
            this.f94986c = i11;
        }

        @Override // java.lang.Runnable
        public final void run() {
            BaseBottomSheetBehaviour baseBottomSheetBehaviour = BaseBottomSheetBehaviour.this;
            P2.b bVar = baseBottomSheetBehaviour.f94976y;
            if (bVar == null || !bVar.f()) {
                baseBottomSheetBehaviour.setStateInternal(this.f94986c);
            } else {
                int i11 = Y.f42258g;
                this.f94984a.postOnAnimation(this);
            }
            this.f94985b = false;
        }
    }

    public BaseBottomSheetBehaviour() {
        this.f94952a = 2;
        this.f94953b = 0;
        this.f94954c = true;
        this.f94964m = null;
        this.f94969r = 0.5f;
        this.f94971t = -1.0f;
        this.f94974w = true;
        this.f94975x = 4;
        this.f94945G = new ArrayList<>();
        this.f94951M = new a();
    }

    private void calculateCollapsedOffset() {
        int max = this.f94957f ? Math.max(this.f94958g, this.f94942D - ((this.f94941C * 9) / 16)) : this.f94956e;
        if (this.f94954c) {
            this.f94970s = Math.max(this.f94942D - max, this.f94967p);
        } else {
            this.f94970s = this.f94942D - max;
        }
    }

    @NonNull
    public static BaseBottomSheetBehaviour h(@NonNull ViewGroup viewGroup) {
        ViewGroup.LayoutParams layoutParams = viewGroup.getLayoutParams();
        if (!(layoutParams instanceof CoordinatorLayout.f)) {
            throw new IllegalArgumentException("The view is not a child of CoordinatorLayout");
        }
        CoordinatorLayout.c c11 = ((CoordinatorLayout.f) layoutParams).c();
        if (c11 instanceof BaseBottomSheetBehaviour) {
            return (BaseBottomSheetBehaviour) c11;
        }
        throw new IllegalArgumentException("The view is not associated with BottomSheetBehavior");
    }

    private void updateAccessibilityActions() {
        V v11;
        WeakReference<V> weakReference = this.f94943E;
        if (weakReference == null || (v11 = weakReference.get()) == null) {
            return;
        }
        Y.x(524288, v11);
        Y.x(262144, v11);
        Y.x(1048576, v11);
        if (this.f94972u && this.f94975x != 5) {
            Y.z(v11, q.a.f105949l, new ru.ozon.fintech.base.bottom.c(this, 5));
        }
        int i11 = this.f94975x;
        if (i11 == 3) {
            Y.z(v11, q.a.f105948k, new ru.ozon.fintech.base.bottom.c(this, this.f94954c ? 4 : 6));
            return;
        }
        if (i11 == 4) {
            Y.z(v11, q.a.f105947j, new ru.ozon.fintech.base.bottom.c(this, this.f94954c ? 3 : 6));
        } else {
            if (i11 != 6) {
                return;
            }
            Y.z(v11, q.a.f105948k, new ru.ozon.fintech.base.bottom.c(this, 4));
            Y.z(v11, q.a.f105947j, new ru.ozon.fintech.base.bottom.c(this, 3));
        }
    }

    private void updateDrawableForTargetState(int i11) {
        ValueAnimator valueAnimator;
        if (i11 == 2) {
            return;
        }
        boolean z11 = i11 == 3;
        if (this.f94963l != z11) {
            this.f94963l = z11;
            if (this.f94960i == null || (valueAnimator = this.f94965n) == null) {
                return;
            }
            if (valueAnimator.isRunning()) {
                this.f94965n.reverse();
                return;
            }
            float f7 = z11 ? 0.0f : 1.0f;
            this.f94965n.setFloatValues(1.0f - f7, f7);
            this.f94965n.start();
        }
    }

    private void updateImportantForAccessibility(boolean z11) {
        WeakReference<V> weakReference = this.f94943E;
        if (weakReference == null) {
            return;
        }
        ViewParent parent = weakReference.get().getParent();
        if (parent instanceof CoordinatorLayout) {
            CoordinatorLayout coordinatorLayout = (CoordinatorLayout) parent;
            int childCount = coordinatorLayout.getChildCount();
            if (z11) {
                if (this.f94950L != null) {
                    return;
                } else {
                    this.f94950L = new HashMap(childCount);
                }
            }
            for (int i11 = 0; i11 < childCount; i11++) {
                View childAt = coordinatorLayout.getChildAt(i11);
                if (childAt != this.f94943E.get() && z11) {
                    this.f94950L.put(childAt, Integer.valueOf(childAt.getImportantForAccessibility()));
                }
            }
            if (z11) {
                return;
            }
            this.f94950L = null;
        }
    }

    final void dispatchOnSlide(int i11) {
        float f7;
        float f11;
        V v11 = this.f94943E.get();
        if (v11 != null) {
            ArrayList<b> arrayList = this.f94945G;
            if (arrayList.isEmpty()) {
                return;
            }
            int i12 = this.f94970s;
            if (i11 > i12 || i12 == getExpandedOffset()) {
                int i13 = this.f94970s;
                f7 = i13 - i11;
                f11 = this.f94942D - i13;
            } else {
                int i14 = this.f94970s;
                f7 = i14 - i11;
                f11 = i14 - getExpandedOffset();
            }
            float f12 = f7 / f11;
            for (int i15 = 0; i15 < arrayList.size(); i15++) {
                arrayList.get(i15).a(v11, f12);
            }
        }
    }

    final View findScrollingChild(View view) {
        if (Y.s(view)) {
            return view;
        }
        if (!(view instanceof ViewGroup)) {
            return null;
        }
        ViewGroup viewGroup = (ViewGroup) view;
        int childCount = viewGroup.getChildCount();
        for (int i11 = 0; i11 < childCount; i11++) {
            View findScrollingChild = findScrollingChild(viewGroup.getChildAt(i11));
            if (findScrollingChild != null) {
                return findScrollingChild;
            }
        }
        return null;
    }

    public final void g(@NonNull b bVar) {
        ArrayList<b> arrayList = this.f94945G;
        if (arrayList.contains(bVar)) {
            return;
        }
        arrayList.add(bVar);
    }

    public final int getExpandedOffset() {
        return this.f94954c ? this.f94967p : this.f94966o;
    }

    public final void i(@NonNull b bVar) {
        this.f94945G.remove(bVar);
    }

    public final boolean isDraggable() {
        return this.f94974w;
    }

    @Deprecated
    public final void j(m.d dVar) {
        Log.w("BottomSheetBehavior", "BottomSheetBehavior now supports multiple callbacks. `setBottomSheetCallback()` removes all existing callbacks, including ones set internally by library authors, which may result in unintended behavior. This may change in the future. Please use `addBottomSheetCallback()` and `removeBottomSheetCallback()` instead to set your own callbacks.");
        ArrayList<b> arrayList = this.f94945G;
        arrayList.clear();
        arrayList.add(dVar);
    }

    final void k(int i11, @NonNull View view) {
        int i12;
        int i13;
        if (i11 == 4) {
            i12 = this.f94970s;
        } else if (i11 == 6) {
            i12 = this.f94968q;
            if (this.f94954c && i12 <= (i13 = this.f94967p)) {
                i11 = 3;
                i12 = i13;
            }
        } else if (i11 == 3) {
            i12 = getExpandedOffset();
        } else {
            if (!this.f94972u || i11 != 5) {
                throw new IllegalArgumentException(Ej.b.a(i11, "Illegal state argument: "));
            }
            i12 = this.f94942D;
        }
        l(view, i11, i12, false);
    }

    final void l(View view, int i11, int i12, boolean z11) {
        if (!(z11 ? this.f94976y.r(view.getLeft(), i12) : this.f94976y.t(view, view.getLeft(), i12))) {
            setStateInternal(i11);
            return;
        }
        setStateInternal(2);
        updateDrawableForTargetState(i11);
        if (this.f94964m == null) {
            this.f94964m = new d(view, i11);
        }
        if (((d) this.f94964m).f94985b) {
            this.f94964m.f94986c = i11;
            return;
        }
        BaseBottomSheetBehaviour<V>.d dVar = this.f94964m;
        dVar.f94986c = i11;
        int i13 = Y.f42258g;
        view.postOnAnimation(dVar);
        ((d) this.f94964m).f94985b = true;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public final void onAttachedToLayoutParams(@NonNull CoordinatorLayout.f fVar) {
        super.onAttachedToLayoutParams(fVar);
        this.f94943E = null;
        this.f94976y = null;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public final void onDetachedFromLayoutParams() {
        super.onDetachedFromLayoutParams();
        this.f94943E = null;
        this.f94976y = null;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public final boolean onInterceptTouchEvent(@NonNull CoordinatorLayout coordinatorLayout, @NonNull V v11, @NonNull MotionEvent motionEvent) {
        P2.b bVar;
        if (!v11.isShown() || !this.f94974w) {
            this.f94977z = true;
            return false;
        }
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            this.f94947I = -1;
            VelocityTracker velocityTracker = this.f94946H;
            if (velocityTracker != null) {
                velocityTracker.recycle();
                this.f94946H = null;
            }
        }
        if (this.f94946H == null) {
            this.f94946H = VelocityTracker.obtain();
        }
        this.f94946H.addMovement(motionEvent);
        if (actionMasked == 0) {
            int x11 = (int) motionEvent.getX();
            this.f94948J = (int) motionEvent.getY();
            if (this.f94975x != 2) {
                WeakReference<View> weakReference = this.f94944F;
                View view = weakReference != null ? weakReference.get() : null;
                if (view != null && coordinatorLayout.isPointInChildBounds(view, x11, this.f94948J)) {
                    this.f94947I = motionEvent.getPointerId(motionEvent.getActionIndex());
                    this.f94949K = true;
                }
            }
            this.f94977z = this.f94947I == -1 && !coordinatorLayout.isPointInChildBounds(v11, x11, this.f94948J);
        } else if (actionMasked == 1 || actionMasked == 3) {
            this.f94949K = false;
            this.f94947I = -1;
            if (this.f94977z) {
                this.f94977z = false;
                return false;
            }
        }
        if (this.f94977z || (bVar = this.f94976y) == null || !bVar.s(motionEvent)) {
            WeakReference<View> weakReference2 = this.f94944F;
            View view2 = weakReference2 != null ? weakReference2.get() : null;
            if (actionMasked != 2 || view2 == null || this.f94977z || this.f94975x == 1 || coordinatorLayout.isPointInChildBounds(view2, (int) motionEvent.getX(), (int) motionEvent.getY()) || this.f94976y == null || Math.abs(this.f94948J - motionEvent.getY()) <= this.f94976y.k()) {
                return false;
            }
        }
        return true;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public final boolean onLayoutChild(@NonNull CoordinatorLayout coordinatorLayout, @NonNull V v11, int i11) {
        C10856g c10856g;
        WindowInsets rootWindowInsets;
        Insets systemGestureInsets;
        int i12;
        int i13 = Y.f42258g;
        if (coordinatorLayout.getFitsSystemWindows() && !v11.getFitsSystemWindows()) {
            v11.setFitsSystemWindows(true);
        }
        if (this.f94943E == null) {
            this.f94958g = coordinatorLayout.getResources().getDimensionPixelSize(R.dimen.design_bottom_sheet_peek_height_min);
            if (Build.VERSION.SDK_INT >= 29 && !this.f94961j && (rootWindowInsets = coordinatorLayout.getRootWindowInsets()) != null) {
                systemGestureInsets = rootWindowInsets.getSystemGestureInsets();
                i12 = systemGestureInsets.bottom;
                this.f94956e += i12;
            }
            this.f94943E = new WeakReference<>(v11);
            if (this.f94959h && (c10856g = this.f94960i) != null) {
                v11.setBackground(c10856g);
            }
            C10856g c10856g2 = this.f94960i;
            if (c10856g2 != null) {
                float f7 = this.f94971t;
                if (f7 == -1.0f) {
                    f7 = Y.k(v11);
                }
                c10856g2.A(f7);
                boolean z11 = this.f94975x == 3;
                this.f94963l = z11;
                this.f94960i.C(z11 ? 0.0f : 1.0f);
            }
            updateAccessibilityActions();
            if (v11.getImportantForAccessibility() == 0) {
                v11.setImportantForAccessibility(1);
            }
        }
        if (this.f94976y == null) {
            this.f94976y = P2.b.h(coordinatorLayout, this.f94951M);
        }
        int top = v11.getTop();
        coordinatorLayout.onLayoutChild(v11, i11);
        this.f94941C = coordinatorLayout.getWidth();
        int height = coordinatorLayout.getHeight();
        this.f94942D = height;
        this.f94967p = Math.max(0, height - v11.getHeight());
        this.f94968q = (int) ((1.0f - this.f94969r) * this.f94942D);
        calculateCollapsedOffset();
        int i14 = this.f94975x;
        if (i14 == 3) {
            v11.offsetTopAndBottom(getExpandedOffset());
        } else if (i14 == 6) {
            v11.offsetTopAndBottom(this.f94968q);
        } else if (this.f94972u && i14 == 5) {
            v11.offsetTopAndBottom(this.f94942D);
        } else if (i14 == 4) {
            v11.offsetTopAndBottom(this.f94970s);
        } else if (i14 == 1 || i14 == 2) {
            v11.offsetTopAndBottom(top - v11.getTop());
        }
        this.f94944F = new WeakReference<>(findScrollingChild(v11));
        return true;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public final boolean onNestedPreFling(@NonNull CoordinatorLayout coordinatorLayout, @NonNull V v11, @NonNull View view, float f7, float f11) {
        WeakReference<View> weakReference = this.f94944F;
        return weakReference != null && view == weakReference.get() && (this.f94975x != 3 || super.onNestedPreFling(coordinatorLayout, v11, view, f7, f11));
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public final void onNestedPreScroll(@NonNull CoordinatorLayout coordinatorLayout, @NonNull V v11, @NonNull View view, int i11, int i12, @NonNull int[] iArr, int i13) {
        if (i13 == 1) {
            return;
        }
        WeakReference<View> weakReference = this.f94944F;
        if (view != (weakReference != null ? weakReference.get() : null)) {
            return;
        }
        int top = v11.getTop();
        int i14 = top - i12;
        if (i12 > 0) {
            if (i14 < getExpandedOffset()) {
                int expandedOffset = top - getExpandedOffset();
                iArr[1] = expandedOffset;
                int i15 = -expandedOffset;
                int i16 = Y.f42258g;
                v11.offsetTopAndBottom(i15);
                setStateInternal(3);
            } else {
                if (!this.f94974w) {
                    return;
                }
                iArr[1] = i12;
                int i17 = Y.f42258g;
                v11.offsetTopAndBottom(-i12);
                setStateInternal(1);
            }
        } else if (i12 < 0 && !view.canScrollVertically(-1)) {
            int i18 = this.f94970s;
            if (i14 > i18 && !this.f94972u) {
                int i19 = top - i18;
                iArr[1] = i19;
                int i21 = -i19;
                int i22 = Y.f42258g;
                v11.offsetTopAndBottom(i21);
                setStateInternal(4);
            } else {
                if (!this.f94974w) {
                    return;
                }
                iArr[1] = i12;
                int i23 = Y.f42258g;
                v11.offsetTopAndBottom(-i12);
                setStateInternal(1);
            }
        }
        dispatchOnSlide(v11.getTop());
        this.f94939A = i12;
        this.f94940B = true;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public final void onNestedScroll(@NonNull CoordinatorLayout coordinatorLayout, @NonNull V v11, @NonNull View view, int i11, int i12, int i13, int i14, int i15, @NonNull int[] iArr) {
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public final void onRestoreInstanceState(@NonNull CoordinatorLayout coordinatorLayout, @NonNull V v11, @NonNull Parcelable parcelable) {
        c cVar = (c) parcelable;
        super.onRestoreInstanceState(coordinatorLayout, v11, cVar.a());
        int i11 = this.f94953b;
        if (i11 != 0) {
            if (i11 == -1 || (i11 & 1) == 1) {
                this.f94956e = cVar.f94980d;
            }
            if (i11 == -1 || (i11 & 2) == 2) {
                this.f94954c = cVar.f94981e;
            }
            if (i11 == -1 || (i11 & 4) == 4) {
                this.f94972u = cVar.f94982f;
            }
            if (i11 == -1 || (i11 & 8) == 8) {
                this.f94973v = cVar.f94983g;
            }
        }
        int i12 = cVar.f94979c;
        if (i12 == 1 || i12 == 2) {
            this.f94975x = 4;
        } else {
            this.f94975x = i12;
        }
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    @NonNull
    public final Parcelable onSaveInstanceState(@NonNull CoordinatorLayout coordinatorLayout, @NonNull V v11) {
        return new c(super.onSaveInstanceState(coordinatorLayout, v11), (BaseBottomSheetBehaviour<?>) this);
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public final boolean onStartNestedScroll(@NonNull CoordinatorLayout coordinatorLayout, @NonNull V v11, @NonNull View view, @NonNull View view2, int i11, int i12) {
        this.f94939A = 0;
        this.f94940B = false;
        return (i11 & 2) != 0;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public final void onStopNestedScroll(@NonNull CoordinatorLayout coordinatorLayout, @NonNull V v11, @NonNull View view, int i11) {
        int i12;
        float yVelocity;
        int i13 = 3;
        if (v11.getTop() == getExpandedOffset()) {
            setStateInternal(3);
            return;
        }
        WeakReference<View> weakReference = this.f94944F;
        if (weakReference != null && view == weakReference.get() && this.f94940B) {
            if (this.f94939A <= 0) {
                if (this.f94972u) {
                    VelocityTracker velocityTracker = this.f94946H;
                    if (velocityTracker == null) {
                        yVelocity = 0.0f;
                    } else {
                        velocityTracker.computeCurrentVelocity(1000, this.f94955d);
                        yVelocity = this.f94946H.getYVelocity(this.f94947I);
                    }
                    if (shouldHide(v11, yVelocity)) {
                        i12 = this.f94942D;
                        i13 = 5;
                    }
                }
                if (this.f94939A == 0) {
                    int top = v11.getTop();
                    if (!this.f94954c) {
                        int i14 = this.f94968q;
                        if (top < i14) {
                            if (top < Math.abs(top - this.f94970s)) {
                                i12 = this.f94966o;
                            } else {
                                i12 = this.f94968q;
                            }
                        } else if (Math.abs(top - i14) < Math.abs(top - this.f94970s)) {
                            i12 = this.f94968q;
                        } else {
                            i12 = this.f94970s;
                            i13 = 4;
                        }
                        i13 = 6;
                    } else if (Math.abs(top - this.f94967p) < Math.abs(top - this.f94970s)) {
                        i12 = this.f94967p;
                    } else {
                        i12 = this.f94970s;
                        i13 = 4;
                    }
                } else {
                    if (this.f94954c) {
                        i12 = this.f94970s;
                    } else {
                        int top2 = v11.getTop();
                        if (Math.abs(top2 - this.f94968q) < Math.abs(top2 - this.f94970s)) {
                            i12 = this.f94968q;
                            i13 = 6;
                        } else {
                            i12 = this.f94970s;
                        }
                    }
                    i13 = 4;
                }
            } else if (this.f94954c) {
                i12 = this.f94967p;
            } else {
                int top3 = v11.getTop();
                int i15 = this.f94968q;
                if (top3 > i15) {
                    i13 = 6;
                    i12 = i15;
                } else {
                    i12 = this.f94966o;
                }
            }
            l(v11, i13, i12, false);
            this.f94940B = false;
        }
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public final boolean onTouchEvent(@NonNull CoordinatorLayout coordinatorLayout, @NonNull V v11, @NonNull MotionEvent motionEvent) {
        if (!v11.isShown()) {
            return false;
        }
        int actionMasked = motionEvent.getActionMasked();
        if (this.f94975x == 1 && actionMasked == 0) {
            return true;
        }
        P2.b bVar = this.f94976y;
        if (bVar != null) {
            bVar.m(motionEvent);
        }
        if (actionMasked == 0) {
            this.f94947I = -1;
            VelocityTracker velocityTracker = this.f94946H;
            if (velocityTracker != null) {
                velocityTracker.recycle();
                this.f94946H = null;
            }
        }
        if (this.f94946H == null) {
            this.f94946H = VelocityTracker.obtain();
        }
        this.f94946H.addMovement(motionEvent);
        if (actionMasked == 2 && !this.f94977z && Math.abs(this.f94948J - motionEvent.getY()) > this.f94976y.k()) {
            this.f94976y.b(motionEvent.getPointerId(motionEvent.getActionIndex()), v11);
        }
        return !this.f94977z;
    }

    public final void setDraggable(boolean z11) {
        this.f94974w = z11;
    }

    public final void setFitToContents(boolean z11) {
        if (this.f94954c == z11) {
            return;
        }
        this.f94954c = z11;
        if (this.f94943E != null) {
            calculateCollapsedOffset();
        }
        setStateInternal((this.f94954c && this.f94975x == 6) ? 3 : this.f94975x);
        updateAccessibilityActions();
    }

    public final void setHideable(boolean z11) {
        if (this.f94972u != z11) {
            this.f94972u = z11;
            if (!z11 && this.f94975x == 5) {
                setState(4);
            }
            updateAccessibilityActions();
        }
    }

    public final void setPeekHeight(int i11) {
        V v11;
        if (i11 == -1) {
            if (this.f94957f) {
                return;
            } else {
                this.f94957f = true;
            }
        } else {
            if (!this.f94957f && this.f94956e == i11) {
                return;
            }
            this.f94957f = false;
            this.f94956e = Math.max(0, i11);
        }
        if (this.f94943E != null) {
            calculateCollapsedOffset();
            if (this.f94975x != 4 || (v11 = this.f94943E.get()) == null) {
                return;
            }
            v11.requestLayout();
        }
    }

    public final void setSkipCollapsed(boolean z11) {
        this.f94973v = true;
    }

    public final void setState(int i11) {
        if (i11 == this.f94975x) {
            return;
        }
        WeakReference<V> weakReference = this.f94943E;
        if (weakReference == null) {
            if (i11 == 4 || i11 == 3 || i11 == 6 || (this.f94972u && i11 == 5)) {
                this.f94975x = i11;
                return;
            }
            return;
        }
        V v11 = weakReference.get();
        if (v11 == null) {
            return;
        }
        ViewParent parent = v11.getParent();
        if (parent != null && parent.isLayoutRequested()) {
            int i12 = Y.f42258g;
            if (v11.isAttachedToWindow()) {
                v11.post(new ru.ozon.fintech.base.bottom.a(this, v11, i11));
                return;
            }
        }
        k(i11, v11);
    }

    final void setStateInternal(int i11) {
        V v11;
        if (this.f94975x == i11) {
            return;
        }
        this.f94975x = i11;
        WeakReference<V> weakReference = this.f94943E;
        if (weakReference == null || (v11 = weakReference.get()) == null) {
            return;
        }
        int i12 = 0;
        if (i11 == 3) {
            updateImportantForAccessibility(true);
        } else if (i11 == 6 || i11 == 5 || i11 == 4) {
            updateImportantForAccessibility(false);
        }
        updateDrawableForTargetState(i11);
        while (true) {
            ArrayList<b> arrayList = this.f94945G;
            if (i12 >= arrayList.size()) {
                updateAccessibilityActions();
                return;
            } else {
                arrayList.get(i12).b(v11, i11);
                i12++;
            }
        }
    }

    final boolean shouldHide(@NonNull View view, float f7) {
        if (this.f94973v) {
            return true;
        }
        if (view.getTop() < this.f94970s) {
            return false;
        }
        return Math.abs(((f7 * 0.5f) + ((float) view.getTop())) - ((float) this.f94970s)) / ((float) (this.f94957f ? Math.max(this.f94958g, this.f94942D - ((this.f94941C * 9) / 16)) : this.f94956e)) > 0.5f;
    }

    protected static class c extends O2.a {
        public static final Parcelable.Creator<c> CREATOR = new a();

        /* renamed from: c, reason: collision with root package name */
        final int f94979c;

        /* renamed from: d, reason: collision with root package name */
        int f94980d;

        /* renamed from: e, reason: collision with root package name */
        boolean f94981e;

        /* renamed from: f, reason: collision with root package name */
        boolean f94982f;

        /* renamed from: g, reason: collision with root package name */
        boolean f94983g;

        final class a implements Parcelable.ClassLoaderCreator<c> {
            @Override // android.os.Parcelable.ClassLoaderCreator
            @NonNull
            public final c createFromParcel(@NonNull Parcel parcel, ClassLoader classLoader) {
                return new c(parcel, classLoader);
            }

            @Override // android.os.Parcelable.Creator
            @NonNull
            public final Object[] newArray(int i11) {
                return new c[i11];
            }

            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(@NonNull Parcel parcel) {
                return new c(parcel, (ClassLoader) null);
            }
        }

        public c(@NonNull Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.f94979c = parcel.readInt();
            this.f94980d = parcel.readInt();
            this.f94981e = parcel.readInt() == 1;
            this.f94982f = parcel.readInt() == 1;
            this.f94983g = parcel.readInt() == 1;
        }

        @Override // O2.a, android.os.Parcelable
        public final void writeToParcel(@NonNull Parcel parcel, int i11) {
            super.writeToParcel(parcel, i11);
            parcel.writeInt(this.f94979c);
            parcel.writeInt(this.f94980d);
            parcel.writeInt(this.f94981e ? 1 : 0);
            parcel.writeInt(this.f94982f ? 1 : 0);
            parcel.writeInt(this.f94983g ? 1 : 0);
        }

        public c(Parcelable parcelable, @NonNull BaseBottomSheetBehaviour<?> baseBottomSheetBehaviour) {
            super(parcelable);
            this.f94979c = baseBottomSheetBehaviour.f94975x;
            this.f94980d = ((BaseBottomSheetBehaviour) baseBottomSheetBehaviour).f94956e;
            this.f94981e = ((BaseBottomSheetBehaviour) baseBottomSheetBehaviour).f94954c;
            this.f94982f = baseBottomSheetBehaviour.f94972u;
            this.f94983g = ((BaseBottomSheetBehaviour) baseBottomSheetBehaviour).f94973v;
        }
    }

    public BaseBottomSheetBehaviour(@NonNull Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        int i11;
        this.f94952a = 2;
        this.f94953b = 0;
        this.f94954c = true;
        this.f94964m = null;
        this.f94969r = 0.5f;
        this.f94971t = -1.0f;
        this.f94974w = true;
        this.f94975x = 4;
        this.f94945G = new ArrayList<>();
        this.f94951M = new a();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C7017a.f65939e);
        boolean hasValue = obtainStyledAttributes.hasValue(20);
        this.f94959h = hasValue;
        if (!obtainStyledAttributes.hasValue(3) && hasValue) {
            this.f94962k = y7.k.c(context, attributeSet, R.attr.bottomSheetStyle, R.style.Widget_Design_BottomSheet_Modal).a();
            C10856g c10856g = new C10856g(this.f94962k);
            this.f94960i = c10856g;
            c10856g.v(context);
            TypedValue typedValue = new TypedValue();
            context.getTheme().resolveAttribute(android.R.attr.colorBackground, typedValue, true);
            this.f94960i.setTint(typedValue.data);
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        this.f94965n = ofFloat;
        ofFloat.setDuration(500L);
        this.f94965n.addUpdateListener(new ru.ozon.fintech.base.bottom.b(this));
        this.f94971t = obtainStyledAttributes.getDimension(2, -1.0f);
        TypedValue peekValue = obtainStyledAttributes.peekValue(9);
        if (peekValue != null && (i11 = peekValue.data) == -1) {
            setPeekHeight(i11);
        } else {
            setPeekHeight(obtainStyledAttributes.getDimensionPixelSize(9, -1));
        }
        setHideable(obtainStyledAttributes.getBoolean(8, false));
        this.f94961j = obtainStyledAttributes.getBoolean(12, false);
        setFitToContents(obtainStyledAttributes.getBoolean(6, true));
        this.f94973v = obtainStyledAttributes.getBoolean(11, false);
        this.f94974w = obtainStyledAttributes.getBoolean(4, true);
        this.f94953b = obtainStyledAttributes.getInt(10, 0);
        float f7 = obtainStyledAttributes.getFloat(7, 0.5f);
        if (f7 > 0.0f && f7 < 1.0f) {
            this.f94969r = f7;
            if (this.f94943E != null) {
                this.f94968q = (int) ((1.0f - f7) * this.f94942D);
            }
            TypedValue peekValue2 = obtainStyledAttributes.peekValue(5);
            if (peekValue2 != null && peekValue2.type == 16) {
                int i12 = peekValue2.data;
                if (i12 >= 0) {
                    this.f94966o = i12;
                } else {
                    throw new IllegalArgumentException("offset must be greater than or equal to 0");
                }
            } else {
                int dimensionPixelOffset = obtainStyledAttributes.getDimensionPixelOffset(5, 0);
                if (dimensionPixelOffset >= 0) {
                    this.f94966o = dimensionPixelOffset;
                } else {
                    throw new IllegalArgumentException("offset must be greater than or equal to 0");
                }
            }
            obtainStyledAttributes.recycle();
            this.f94955d = ViewConfiguration.get(context).getScaledMaximumFlingVelocity();
            return;
        }
        throw new IllegalArgumentException("ratio must be a float value between 0 and 1");
    }
}
