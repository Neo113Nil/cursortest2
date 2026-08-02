package com.google.android.material.bottomsheet;

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
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Property;
import android.util.SparseIntArray;
import android.util.TypedValue;
import android.view.MotionEvent;
import android.view.RoundedCorner;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.WindowInsets;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.customview.view.AbsSavedState;
import com.google.android.material.R$attr;
import com.google.android.material.R$dimen;
import com.google.android.material.R$string;
import com.google.android.material.R$style;
import com.google.android.material.R$styleable;
import com.google.android.material.shape.MaterialShapeDrawable;
import com.mbridge.msdk.playercommon.exoplayer2.source.ExtractorMediaSource;
import com.unity3d.services.UnityAdsConstants;
import io.requery.android.database.sqlite.SQLiteDatabase;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.WeakHashMap;
import xsna.am;
import xsna.aqx0;
import xsna.b0u0;
import xsna.gq;
import xsna.h78;
import xsna.hk;
import xsna.i4x;
import xsna.i5s;
import xsna.i78;
import xsna.ilq;
import xsna.iut0;
import xsna.j78;
import xsna.lhg;
import xsna.nl10;
import xsna.ql10;
import xsna.qm10;
import xsna.rl10;
import xsna.rq2;
import xsna.t1u0;
import xsna.wu5;
import xsna.xwk;
import xsna.zut0;

/* loaded from: classes13.dex */
public class BottomSheetBehavior<V extends View> extends CoordinatorLayout.c<V> implements nl10 {
    public static final int i0 = R$style.Widget_Design_BottomSheet_Modal;
    public boolean A;
    public final BottomSheetBehavior<V>.e B;

    @Nullable
    public final ValueAnimator C;
    public int D;
    public int E;
    public int F;
    public float G;
    public int H;
    public final float I;
    public boolean J;
    public boolean K;
    public boolean L;
    public int M;
    public int N;

    @Nullable
    public zut0 O;
    public boolean P;
    public int Q;
    public boolean R;
    public final float S;
    public int T;
    public int U;
    public int V;

    @Nullable
    public WeakReference<V> W;

    @Nullable
    public WeakReference<View> X;

    @Nullable
    public WeakReference<View> Y;

    @NonNull
    public final ArrayList<d> Z;

    @Nullable
    public VelocityTracker a0;
    public final int b;

    @Nullable
    public rl10 b0;
    public boolean c;
    public int c0;
    public final float d;
    public int d0;
    public final int e;
    public boolean e0;
    public int f;

    @Nullable
    public HashMap f0;
    public boolean g;
    public final SparseIntArray g0;
    public int h;
    public final c h0;
    public final int i;
    public final MaterialShapeDrawable j;

    @Nullable
    public final ColorStateList k;
    public final int l;
    public final int m;
    public int n;
    public final boolean o;
    public final boolean p;
    public final boolean q;
    public final boolean r;
    public final boolean s;
    public final boolean t;
    public final boolean u;
    public final boolean v;
    public int w;
    public int x;
    public final boolean y;
    public final com.google.android.material.shape.a z;

    public class a implements Runnable {
        public final /* synthetic */ View b;
        public final /* synthetic */ int c;

        public a(View view, int i) {
            this.b = view;
            this.c = i;
        }

        @Override // java.lang.Runnable
        public final void run() {
            int i = BottomSheetBehavior.i0;
            BottomSheetBehavior.this.a0(this.b, this.c, false);
        }
    }

    public class b extends AnimatorListenerAdapter {
        public b() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public final void onAnimationEnd(Animator animator) {
            BottomSheetBehavior bottomSheetBehavior = BottomSheetBehavior.this;
            bottomSheetBehavior.Y(5);
            WeakReference<V> weakReference = bottomSheetBehavior.W;
            if (weakReference == null || weakReference.get() == null) {
                return;
            }
            bottomSheetBehavior.W.get().requestLayout();
        }
    }

    public class c extends zut0.c {
        public c() {
        }

        @Override // xsna.zut0.c
        public final int clampViewPositionHorizontal(@NonNull View view, int i, int i2) {
            return view.getLeft();
        }

        @Override // xsna.zut0.c
        public final int clampViewPositionVertical(@NonNull View view, int i, int i2) {
            return xwk.b(i, BottomSheetBehavior.this.N(), getViewVerticalDragRange(view));
        }

        @Override // xsna.zut0.c
        public final int getViewVerticalDragRange(@NonNull View view) {
            int i = BottomSheetBehavior.i0;
            BottomSheetBehavior bottomSheetBehavior = BottomSheetBehavior.this;
            return bottomSheetBehavior.J ? bottomSheetBehavior.V : bottomSheetBehavior.H;
        }

        @Override // xsna.zut0.c
        public final void onViewDragStateChanged(int i) {
            if (i == 1) {
                BottomSheetBehavior bottomSheetBehavior = BottomSheetBehavior.this;
                if (bottomSheetBehavior.L) {
                    bottomSheetBehavior.Y(1);
                }
            }
        }

        @Override // xsna.zut0.c
        public final void onViewPositionChanged(@NonNull View view, int i, int i2, int i3, int i4) {
            BottomSheetBehavior.this.J(i2);
        }

        /* JADX WARN: Code restructure failed: missing block: B:10:0x001c, code lost:
        
            if (r7 > r4.F) goto L52;
         */
        /* JADX WARN: Code restructure failed: missing block: B:25:0x006c, code lost:
        
            if (java.lang.Math.abs(r6.getTop() - r4.N()) < java.lang.Math.abs(r6.getTop() - r4.F)) goto L6;
         */
        /* JADX WARN: Code restructure failed: missing block: B:39:0x00b7, code lost:
        
            if (java.lang.Math.abs(r7 - r4.E) < java.lang.Math.abs(r7 - r4.H)) goto L6;
         */
        @Override // xsna.zut0.c
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final void onViewReleased(@NonNull View view, float f, float f2) {
            int i = 6;
            BottomSheetBehavior bottomSheetBehavior = BottomSheetBehavior.this;
            if (f2 < UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                if (!bottomSheetBehavior.c) {
                    int top = view.getTop();
                    System.currentTimeMillis();
                    bottomSheetBehavior.getClass();
                }
                i = 3;
            } else if (bottomSheetBehavior.J && bottomSheetBehavior.Z(view, f2)) {
                if (Math.abs(f) >= Math.abs(f2) || f2 <= bottomSheetBehavior.e) {
                    if (view.getTop() <= (bottomSheetBehavior.N() + bottomSheetBehavior.V) / 2) {
                        if (!bottomSheetBehavior.c) {
                        }
                        i = 3;
                    }
                }
                i = 5;
            } else if (f2 == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT || Math.abs(f) > Math.abs(f2)) {
                int top2 = view.getTop();
                if (!bottomSheetBehavior.c) {
                    int i2 = bottomSheetBehavior.F;
                    if (top2 < i2) {
                        if (top2 >= Math.abs(top2 - bottomSheetBehavior.H)) {
                            bottomSheetBehavior.getClass();
                        }
                        i = 3;
                    } else {
                        if (Math.abs(top2 - i2) < Math.abs(top2 - bottomSheetBehavior.H)) {
                            bottomSheetBehavior.getClass();
                        }
                        i = 4;
                    }
                }
            } else {
                if (!bottomSheetBehavior.c) {
                    int top3 = view.getTop();
                    if (Math.abs(top3 - bottomSheetBehavior.F) < Math.abs(top3 - bottomSheetBehavior.H)) {
                        bottomSheetBehavior.getClass();
                    }
                }
                i = 4;
            }
            bottomSheetBehavior.getClass();
            bottomSheetBehavior.a0(view, i, true);
        }

        @Override // xsna.zut0.c
        public final boolean tryCaptureView(@NonNull View view, int i) {
            BottomSheetBehavior bottomSheetBehavior = BottomSheetBehavior.this;
            int i2 = bottomSheetBehavior.M;
            if (i2 == 1 || bottomSheetBehavior.e0) {
                return false;
            }
            if (i2 == 3 && bottomSheetBehavior.c0 == i) {
                WeakReference<View> weakReference = bottomSheetBehavior.Y;
                View view2 = weakReference != null ? weakReference.get() : null;
                if (view2 != null && view2.canScrollVertically(-1)) {
                    return false;
                }
            }
            System.currentTimeMillis();
            WeakReference<V> weakReference2 = bottomSheetBehavior.W;
            return weakReference2 != null && weakReference2.get() == view;
        }
    }

    public class e {
        public int a;
        public boolean b;
        public final a c = new a();

        public class a implements Runnable {
            public a() {
            }

            @Override // java.lang.Runnable
            public final void run() {
                e eVar = e.this;
                eVar.b = false;
                BottomSheetBehavior bottomSheetBehavior = BottomSheetBehavior.this;
                zut0 zut0Var = bottomSheetBehavior.O;
                if (zut0Var != null && zut0Var.h()) {
                    eVar.a(eVar.a);
                } else if (bottomSheetBehavior.M == 2) {
                    bottomSheetBehavior.Y(eVar.a);
                }
            }
        }

        public e() {
        }

        public final void a(int i) {
            BottomSheetBehavior bottomSheetBehavior = BottomSheetBehavior.this;
            WeakReference<V> weakReference = bottomSheetBehavior.W;
            if (weakReference == null || weakReference.get() == null) {
                return;
            }
            this.a = i;
            if (this.b) {
                return;
            }
            V v = bottomSheetBehavior.W.get();
            WeakHashMap<View, b0u0> weakHashMap = iut0.a;
            v.postOnAnimation(this.c);
            this.b = true;
        }
    }

    public BottomSheetBehavior() {
        this.b = 0;
        this.c = true;
        this.l = -1;
        this.m = -1;
        this.B = new e();
        this.G = 0.5f;
        this.I = -1.0f;
        this.L = true;
        this.M = 4;
        this.N = 4;
        this.S = 0.1f;
        this.Z = new ArrayList<>();
        this.d0 = -1;
        this.g0 = new SparseIntArray();
        this.h0 = new c();
    }

    @NonNull
    public static <V extends View> BottomSheetBehavior<V> L(@NonNull V v) {
        ViewGroup.LayoutParams layoutParams = v.getLayoutParams();
        if (!(layoutParams instanceof CoordinatorLayout.f)) {
            throw new IllegalArgumentException("The view is not a child of CoordinatorLayout");
        }
        CoordinatorLayout.c cVar = ((CoordinatorLayout.f) layoutParams).a;
        if (cVar instanceof BottomSheetBehavior) {
            return (BottomSheetBehavior) cVar;
        }
        throw new IllegalArgumentException("The view is not associated with BottomSheetBehavior");
    }

    public static int M(int i, int i2, int i3, int i4) {
        int childMeasureSpec = ViewGroup.getChildMeasureSpec(i, i2, i4);
        if (i3 == -1) {
            return childMeasureSpec;
        }
        int mode = View.MeasureSpec.getMode(childMeasureSpec);
        int size = View.MeasureSpec.getSize(childMeasureSpec);
        if (mode == 1073741824) {
            return View.MeasureSpec.makeMeasureSpec(Math.min(size, i3), 1073741824);
        }
        if (size != 0) {
            i3 = Math.min(size, i3);
        }
        return View.MeasureSpec.makeMeasureSpec(i3, Integer.MIN_VALUE);
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x0030, code lost:
    
        if (r4.getTop() <= r2.F) goto L51;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x0071, code lost:
    
        if (java.lang.Math.abs(r3 - r2.E) < java.lang.Math.abs(r3 - r2.H)) goto L51;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x0080, code lost:
    
        if (r3 < java.lang.Math.abs(r3 - r2.H)) goto L51;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x0090, code lost:
    
        if (java.lang.Math.abs(r3 - r1) < java.lang.Math.abs(r3 - r2.H)) goto L50;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x00ac, code lost:
    
        if (java.lang.Math.abs(r3 - r2.F) < java.lang.Math.abs(r3 - r2.H)) goto L50;
     */
    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void B(@NonNull CoordinatorLayout coordinatorLayout, @NonNull V v, @NonNull View view, int i) {
        float yVelocity;
        int i2 = 3;
        if (v.getTop() == N()) {
            Y(3);
            return;
        }
        WeakReference<View> weakReference = this.Y;
        if (weakReference != null && view == weakReference.get() && this.R) {
            if (this.Q > 0) {
                if (!this.c) {
                }
                a0(v, i2, false);
                this.R = false;
            }
            if (this.J) {
                VelocityTracker velocityTracker = this.a0;
                if (velocityTracker == null) {
                    yVelocity = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
                } else {
                    velocityTracker.computeCurrentVelocity(1000, this.d);
                    yVelocity = this.a0.getYVelocity(this.c0);
                }
                if (Z(v, yVelocity)) {
                    i2 = 5;
                    a0(v, i2, false);
                    this.R = false;
                }
            }
            if (this.Q == 0) {
                int top = v.getTop();
                if (!this.c) {
                    int i3 = this.F;
                    if (top < i3) {
                    }
                    i2 = 6;
                }
            } else {
                if (!this.c) {
                    int top2 = v.getTop();
                }
                i2 = 4;
            }
            a0(v, i2, false);
            this.R = false;
        }
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public boolean C(@NonNull CoordinatorLayout coordinatorLayout, @NonNull V v, @NonNull MotionEvent motionEvent) {
        if (!v.isShown()) {
            return false;
        }
        int actionMasked = motionEvent.getActionMasked();
        int i = this.M;
        if (i == 1 && actionMasked == 0) {
            return true;
        }
        zut0 zut0Var = this.O;
        if (zut0Var != null && (this.L || i == 1)) {
            zut0Var.m(motionEvent);
        }
        if (actionMasked == 0) {
            this.c0 = -1;
            this.d0 = -1;
            VelocityTracker velocityTracker = this.a0;
            if (velocityTracker != null) {
                velocityTracker.recycle();
                this.a0 = null;
            }
        }
        if (this.a0 == null) {
            this.a0 = VelocityTracker.obtain();
        }
        this.a0.addMovement(motionEvent);
        if (this.O != null && ((this.L || this.M == 1) && actionMasked == 2 && !this.P)) {
            float a2 = gq.a(motionEvent, this.d0);
            zut0 zut0Var2 = this.O;
            if (a2 > zut0Var2.b) {
                zut0Var2.c(motionEvent.getPointerId(motionEvent.getActionIndex()), v);
            }
        }
        return !this.P;
    }

    public final void D(@NonNull d dVar) {
        ArrayList<d> arrayList = this.Z;
        if (arrayList.contains(dVar)) {
            return;
        }
        arrayList.add(dVar);
    }

    public final void E() {
        int G = G();
        if (this.c) {
            this.H = Math.max(this.V - G, this.E);
        } else {
            this.H = this.V - G;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0051  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final float F() {
        WeakReference<V> weakReference;
        WindowInsets rootWindowInsets;
        RoundedCorner roundedCorner;
        float f;
        RoundedCorner roundedCorner2;
        int radius;
        int radius2;
        MaterialShapeDrawable materialShapeDrawable = this.j;
        float f2 = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        if (materialShapeDrawable != null && (weakReference = this.W) != null && weakReference.get() != null && Build.VERSION.SDK_INT >= 31) {
            V v = this.W.get();
            if (P() && (rootWindowInsets = v.getRootWindowInsets()) != null) {
                float topLeftCornerResolvedSize = this.j.getTopLeftCornerResolvedSize();
                roundedCorner = rootWindowInsets.getRoundedCorner(0);
                if (roundedCorner != null) {
                    radius2 = roundedCorner.getRadius();
                    float f3 = radius2;
                    if (f3 > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT && topLeftCornerResolvedSize > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                        f = f3 / topLeftCornerResolvedSize;
                        float topRightCornerResolvedSize = this.j.getTopRightCornerResolvedSize();
                        roundedCorner2 = rootWindowInsets.getRoundedCorner(1);
                        if (roundedCorner2 != null) {
                            radius = roundedCorner2.getRadius();
                            float f4 = radius;
                            if (f4 > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT && topRightCornerResolvedSize > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                                f2 = f4 / topRightCornerResolvedSize;
                            }
                        }
                        return Math.max(f, f2);
                    }
                }
                f = 0.0f;
                float topRightCornerResolvedSize2 = this.j.getTopRightCornerResolvedSize();
                roundedCorner2 = rootWindowInsets.getRoundedCorner(1);
                if (roundedCorner2 != null) {
                }
                return Math.max(f, f2);
            }
        }
        return UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
    }

    public final int G() {
        int i;
        return this.g ? Math.min(Math.max(this.h, this.V - ((this.U * 9) / 16)), this.T) + this.w : (this.o || this.p || (i = this.n) <= 0) ? this.f + this.w : Math.max(this.f, i + this.i);
    }

    public final float H(int i) {
        float f;
        float f2;
        int i2 = this.H;
        if (i > i2 || i2 == N()) {
            int i3 = this.H;
            f = i3 - i;
            f2 = this.V - i3;
        } else {
            int i4 = this.H;
            f = i4 - i;
            f2 = i4 - N();
        }
        return f / f2;
    }

    public final void I(int i, View view) {
        if (view == null) {
            return;
        }
        iut0.n(524288, view);
        iut0.k(0, view);
        iut0.n(SQLiteDatabase.OPEN_PRIVATECACHE, view);
        iut0.k(0, view);
        iut0.n(ExtractorMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES, view);
        iut0.k(0, view);
        SparseIntArray sparseIntArray = this.g0;
        int i2 = sparseIntArray.get(i, -1);
        if (i2 != -1) {
            iut0.n(i2, view);
            iut0.k(0, view);
            sparseIntArray.delete(i);
        }
    }

    public final void J(int i) {
        V v = this.W.get();
        if (v != null) {
            ArrayList<d> arrayList = this.Z;
            if (arrayList.isEmpty()) {
                return;
            }
            float H = H(i);
            for (int i2 = 0; i2 < arrayList.size(); i2++) {
                arrayList.get(i2).b(v, H);
            }
        }
    }

    @Nullable
    public View K(View view) {
        if (view.getVisibility() != 0) {
            return null;
        }
        WeakHashMap<View, b0u0> weakHashMap = iut0.a;
        if (view.isNestedScrollingEnabled()) {
            return view;
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            int childCount = viewGroup.getChildCount();
            for (int i = 0; i < childCount; i++) {
                View K = K(viewGroup.getChildAt(i));
                if (K != null) {
                    return K;
                }
            }
        }
        return null;
    }

    public final int N() {
        if (this.c) {
            return this.E;
        }
        return Math.max(this.D, this.s ? 0 : this.x);
    }

    public final int O(int i) {
        if (i == 3) {
            return N();
        }
        if (i == 4) {
            return this.H;
        }
        if (i == 5) {
            return this.V;
        }
        if (i == 6) {
            return this.F;
        }
        throw new IllegalArgumentException(lhg.a(i, "Invalid state to get top offset: "));
    }

    public final boolean P() {
        WeakReference<V> weakReference = this.W;
        if (weakReference != null && weakReference.get() != null) {
            int[] iArr = new int[2];
            this.W.get().getLocationOnScreen(iArr);
            if (iArr[1] == 0) {
                return true;
            }
        }
        return false;
    }

    public final void Q(@NonNull d dVar) {
        this.Z.remove(dVar);
    }

    public final void R(@Nullable BottomSheetDragHandleView bottomSheetDragHandleView) {
        WeakReference<View> weakReference;
        if (bottomSheetDragHandleView != null || (weakReference = this.X) == null) {
            this.X = new WeakReference<>(bottomSheetDragHandleView);
            c0(1, bottomSheetDragHandleView);
        } else {
            I(1, weakReference.get());
            this.X = null;
        }
    }

    public final void S(int i) {
        if (i < 0) {
            throw new IllegalArgumentException("offset must be greater than or equal to 0");
        }
        this.D = i;
        d0(this.M, true);
    }

    public final void T(boolean z) {
        if (this.c == z) {
            return;
        }
        this.c = z;
        if (this.W != null) {
            E();
        }
        Y((this.c && this.M == 6) ? 3 : this.M);
        d0(this.M, true);
        b0();
    }

    public final void U(float f) {
        if (f <= UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT || f >= 1.0f) {
            throw new IllegalArgumentException("ratio must be a float value between 0 and 1");
        }
        this.G = f;
        if (this.W != null) {
            this.F = (int) ((1.0f - f) * this.V);
        }
    }

    public final void V(boolean z) {
        if (this.J != z) {
            this.J = z;
            if (!z && this.M == 5) {
                X(4);
            }
            b0();
        }
    }

    public final void W(int i, boolean z) {
        if (i == -1) {
            if (this.g) {
                return;
            } else {
                this.g = true;
            }
        } else {
            if (!this.g && this.f == i) {
                return;
            }
            this.g = false;
            this.f = Math.max(0, i);
        }
        f0(z);
    }

    public void X(int i) {
        if (i == 1 || i == 2) {
            throw new IllegalArgumentException(i5s.a(new StringBuilder("STATE_"), i == 1 ? "DRAGGING" : "SETTLING", " should not be set externally."));
        }
        if (this.J || i != 5) {
            int i2 = (i == 6 && this.c && O(i) <= this.E) ? 3 : i;
            WeakReference<V> weakReference = this.W;
            if (weakReference == null || weakReference.get() == null) {
                Y(i);
                return;
            }
            V v = this.W.get();
            a aVar = new a(v, i2);
            ViewParent parent = v.getParent();
            if (parent != null && parent.isLayoutRequested()) {
                WeakHashMap<View, b0u0> weakHashMap = iut0.a;
                if (v.isAttachedToWindow()) {
                    v.post(aVar);
                    return;
                }
            }
            aVar.run();
        }
    }

    public final void Y(int i) {
        V v;
        if (this.M == i) {
            return;
        }
        this.M = i;
        if (i == 4 || i == 3 || i == 6 || (this.J && i == 5)) {
            this.N = i;
        }
        WeakReference<V> weakReference = this.W;
        if (weakReference == null || (v = weakReference.get()) == null) {
            return;
        }
        int i2 = 0;
        if (i == 3) {
            e0(true);
        } else if (i == 6 || i == 5 || i == 4) {
            e0(false);
        }
        d0(i, true);
        while (true) {
            ArrayList<d> arrayList = this.Z;
            if (i2 >= arrayList.size()) {
                b0();
                return;
            } else {
                arrayList.get(i2).c(i, v);
                i2++;
            }
        }
    }

    public final boolean Z(@NonNull View view, float f) {
        if (this.K) {
            return true;
        }
        if (view.getTop() < this.H) {
            return false;
        }
        return Math.abs(((f * this.S) + ((float) view.getTop())) - ((float) this.H)) / ((float) G()) > 0.5f;
    }

    @Override // xsna.nl10
    public final void a(@NonNull wu5 wu5Var) {
        rl10 rl10Var = this.b0;
        if (rl10Var == null) {
            return;
        }
        rl10Var.f = wu5Var;
    }

    public final void a0(View view, int i, boolean z) {
        int O = O(i);
        zut0 zut0Var = this.O;
        if (zut0Var == null || (!z ? zut0Var.u(view.getLeft(), O, view) : zut0Var.s(view.getLeft(), O))) {
            Y(i);
            return;
        }
        Y(2);
        d0(i, true);
        this.B.a(i);
    }

    @Override // xsna.nl10
    public final void b() {
        rl10 rl10Var = this.b0;
        if (rl10Var == null) {
            return;
        }
        int i = rl10Var.d;
        int i2 = rl10Var.c;
        wu5 wu5Var = rl10Var.f;
        rl10Var.f = null;
        if (wu5Var != null) {
            float f = wu5Var.c;
            if (Build.VERSION.SDK_INT >= 34) {
                if (!this.J) {
                    AnimatorSet a2 = rl10Var.a();
                    a2.setDuration(rq2.c(i2, i, f));
                    a2.start();
                    X(4);
                    return;
                }
                b bVar = new b();
                V v = rl10Var.b;
                ObjectAnimator ofFloat = ObjectAnimator.ofFloat(v, (Property<V, Float>) View.TRANSLATION_Y, v.getScaleY() * v.getHeight());
                ofFloat.setInterpolator(new ilq());
                ofFloat.setDuration(rq2.c(i2, i, f));
                ofFloat.addListener(new ql10(rl10Var));
                ofFloat.addListener(bVar);
                ofFloat.start();
                return;
            }
        }
        X(this.J ? 5 : 4);
    }

    public final void b0() {
        WeakReference<V> weakReference = this.W;
        if (weakReference != null) {
            c0(0, weakReference.get());
        }
        WeakReference<View> weakReference2 = this.X;
        if (weakReference2 != null) {
            c0(1, weakReference2.get());
        }
    }

    public final void c0(int i, View view) {
        int i2;
        int i3;
        if (view == null) {
            return;
        }
        I(i, view);
        if (!this.c && this.M != 6) {
            String string = view.getResources().getString(R$string.bottomsheet_action_expand_halfway);
            j78 j78Var = new j78(this, 6);
            ArrayList g = iut0.g(view);
            int i4 = 0;
            while (true) {
                if (i4 >= g.size()) {
                    int i5 = 0;
                    int i6 = -1;
                    while (true) {
                        int[] iArr = iut0.e;
                        if (i5 >= 32 || i6 != -1) {
                            break;
                        }
                        int i7 = iArr[i5];
                        boolean z = true;
                        for (int i8 = 0; i8 < g.size(); i8++) {
                            z &= ((am.a) g.get(i8)).b() != i7;
                        }
                        if (z) {
                            i6 = i7;
                        }
                        i5++;
                    }
                    i2 = i6;
                } else {
                    if (TextUtils.equals(string, ((am.a) g.get(i4)).c())) {
                        i2 = ((am.a) g.get(i4)).b();
                        break;
                    }
                    i4++;
                }
            }
            if (i2 != -1) {
                i3 = i2;
                am.a aVar = new am.a(null, i3, string, j78Var, null);
                hk d2 = iut0.d(view);
                if (d2 == null) {
                    d2 = new hk();
                }
                iut0.q(view, d2);
                iut0.n(aVar.b(), view);
                iut0.g(view).add(aVar);
                iut0.k(0, view);
            } else {
                i3 = i2;
            }
            this.g0.put(i, i3);
        }
        if (this.J && this.M != 5) {
            iut0.o(view, am.a.m, null, new j78(this, 5));
        }
        int i9 = this.M;
        if (i9 == 3) {
            iut0.o(view, am.a.l, null, new j78(this, this.c ? 4 : 6));
            return;
        }
        if (i9 == 4) {
            iut0.o(view, am.a.k, null, new j78(this, this.c ? 3 : 6));
        } else {
            if (i9 != 6) {
                return;
            }
            iut0.o(view, am.a.l, null, new j78(this, 4));
            iut0.o(view, am.a.k, null, new j78(this, 3));
        }
    }

    @Override // xsna.nl10
    public final void d() {
        rl10 rl10Var = this.b0;
        if (rl10Var == null) {
            return;
        }
        wu5 wu5Var = rl10Var.f;
        rl10Var.f = null;
        if (wu5Var == null) {
            return;
        }
        AnimatorSet a2 = rl10Var.a();
        a2.setDuration(rl10Var.e);
        a2.start();
    }

    public final void d0(int i, boolean z) {
        MaterialShapeDrawable materialShapeDrawable;
        if (i == 2) {
            return;
        }
        boolean z2 = this.M == 3 && (this.y || P());
        if (this.A == z2 || (materialShapeDrawable = this.j) == null) {
            return;
        }
        this.A = z2;
        ValueAnimator valueAnimator = this.C;
        if (!z || valueAnimator == null) {
            if (valueAnimator != null && valueAnimator.isRunning()) {
                valueAnimator.cancel();
            }
            materialShapeDrawable.setInterpolation(this.A ? F() : 1.0f);
            return;
        }
        if (valueAnimator.isRunning()) {
            valueAnimator.reverse();
        } else {
            valueAnimator.setFloatValues(materialShapeDrawable.getInterpolation(), z2 ? F() : 1.0f);
            valueAnimator.start();
        }
    }

    @Override // xsna.nl10
    public final void e(@NonNull wu5 wu5Var) {
        rl10 rl10Var = this.b0;
        if (rl10Var == null) {
            return;
        }
        wu5 wu5Var2 = rl10Var.f;
        rl10Var.f = wu5Var;
        if (wu5Var2 == null) {
            return;
        }
        rl10Var.b(wu5Var.c);
    }

    public final void e0(boolean z) {
        WeakReference<V> weakReference = this.W;
        if (weakReference == null) {
            return;
        }
        ViewParent parent = weakReference.get().getParent();
        if (parent instanceof CoordinatorLayout) {
            CoordinatorLayout coordinatorLayout = (CoordinatorLayout) parent;
            int childCount = coordinatorLayout.getChildCount();
            if (z) {
                if (this.f0 != null) {
                    return;
                } else {
                    this.f0 = new HashMap(childCount);
                }
            }
            for (int i = 0; i < childCount; i++) {
                View childAt = coordinatorLayout.getChildAt(i);
                if (childAt != this.W.get() && z) {
                    this.f0.put(childAt, Integer.valueOf(childAt.getImportantForAccessibility()));
                }
            }
            if (z) {
                return;
            }
            this.f0 = null;
        }
    }

    public final void f0(boolean z) {
        V v;
        if (this.W != null) {
            E();
            if (this.M != 4 || (v = this.W.get()) == null) {
                return;
            }
            if (z) {
                X(4);
            } else {
                v.requestLayout();
            }
        }
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public final void i(@NonNull CoordinatorLayout.f fVar) {
        this.W = null;
        this.O = null;
        this.b0 = null;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public final void l() {
        this.W = null;
        this.O = null;
        this.b0 = null;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public boolean m(@NonNull CoordinatorLayout coordinatorLayout, @NonNull V v, @NonNull MotionEvent motionEvent) {
        int i;
        zut0 zut0Var;
        if (!v.isShown() || !this.L) {
            this.P = true;
            return false;
        }
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            this.c0 = -1;
            this.d0 = -1;
            VelocityTracker velocityTracker = this.a0;
            if (velocityTracker != null) {
                velocityTracker.recycle();
                this.a0 = null;
            }
        }
        if (this.a0 == null) {
            this.a0 = VelocityTracker.obtain();
        }
        this.a0.addMovement(motionEvent);
        if (actionMasked == 0) {
            int x = (int) motionEvent.getX();
            this.d0 = (int) motionEvent.getY();
            if (this.M != 2) {
                WeakReference<View> weakReference = this.Y;
                View view = weakReference != null ? weakReference.get() : null;
                if (view != null && coordinatorLayout.O(x, this.d0, view)) {
                    this.c0 = motionEvent.getPointerId(motionEvent.getActionIndex());
                    this.e0 = true;
                }
            }
            this.P = this.c0 == -1 && !coordinatorLayout.O(x, this.d0, v);
        } else if (actionMasked == 1 || actionMasked == 3) {
            this.e0 = false;
            this.c0 = -1;
            if (this.P) {
                this.P = false;
                return false;
            }
        }
        if (this.P || (zut0Var = this.O) == null || !zut0Var.t(motionEvent)) {
            WeakReference<View> weakReference2 = this.Y;
            View view2 = weakReference2 != null ? weakReference2.get() : null;
            if (actionMasked != 2 || view2 == null || this.P || this.M == 1 || coordinatorLayout.O((int) motionEvent.getX(), (int) motionEvent.getY(), view2) || this.O == null || (i = this.d0) == -1 || gq.a(motionEvent, i) <= this.O.b) {
                return false;
            }
        }
        return true;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public final boolean n(@NonNull CoordinatorLayout coordinatorLayout, @NonNull V v, int i) {
        WeakHashMap<View, b0u0> weakHashMap = iut0.a;
        if (coordinatorLayout.getFitsSystemWindows() && !v.getFitsSystemWindows()) {
            v.setFitsSystemWindows(true);
        }
        int i2 = 0;
        if (this.W == null) {
            this.h = coordinatorLayout.getResources().getDimensionPixelSize(R$dimen.design_bottom_sheet_peek_height_min);
            boolean z = (Build.VERSION.SDK_INT < 29 || this.o || this.g) ? false : true;
            if (this.p || this.q || this.r || this.t || this.u || this.v || z) {
                t1u0.a(v, new i78(this, z));
            }
            aqx0.a(v, new i4x(v));
            this.W = new WeakReference<>(v);
            this.b0 = new rl10(v);
            MaterialShapeDrawable materialShapeDrawable = this.j;
            if (materialShapeDrawable != null) {
                v.setBackground(materialShapeDrawable);
                float f = this.I;
                if (f == -1.0f) {
                    f = v.getElevation();
                }
                materialShapeDrawable.setElevation(f);
            } else {
                ColorStateList colorStateList = this.k;
                if (colorStateList != null) {
                    v.setBackgroundTintList(colorStateList);
                }
            }
            b0();
            if (v.getImportantForAccessibility() == 0) {
                v.setImportantForAccessibility(1);
            }
        }
        if (this.O == null) {
            this.O = new zut0(coordinatorLayout.getContext(), coordinatorLayout, this.h0);
        }
        int top = v.getTop();
        coordinatorLayout.R(i, v);
        this.U = coordinatorLayout.getWidth();
        this.V = coordinatorLayout.getHeight();
        int height = v.getHeight();
        this.T = height;
        int i3 = this.V;
        int i4 = i3 - height;
        int i5 = this.x;
        if (i4 < i5) {
            boolean z2 = this.s;
            int i6 = this.m;
            if (z2) {
                if (i6 != -1) {
                    i3 = Math.min(i3, i6);
                }
                this.T = i3;
            } else {
                int i7 = i3 - i5;
                if (i6 != -1) {
                    i7 = Math.min(i7, i6);
                }
                this.T = i7;
            }
        }
        this.E = Math.max(0, this.V - this.T);
        this.F = (int) ((1.0f - this.G) * this.V);
        E();
        int i8 = this.M;
        if (i8 == 3) {
            v.offsetTopAndBottom(N());
        } else if (i8 == 6) {
            v.offsetTopAndBottom(this.F);
        } else if (this.J && i8 == 5) {
            v.offsetTopAndBottom(this.V);
        } else if (i8 == 4) {
            v.offsetTopAndBottom(this.H);
        } else if (i8 == 1 || i8 == 2) {
            v.offsetTopAndBottom(top - v.getTop());
        }
        d0(this.M, false);
        this.Y = new WeakReference<>(K(v));
        while (true) {
            ArrayList<d> arrayList = this.Z;
            if (i2 >= arrayList.size()) {
                return true;
            }
            arrayList.get(i2).a(v);
            i2++;
        }
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public final boolean o(@NonNull CoordinatorLayout coordinatorLayout, @NonNull View view, int i, int i2, int i3) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        view.measure(M(i, coordinatorLayout.getPaddingRight() + coordinatorLayout.getPaddingLeft() + marginLayoutParams.leftMargin + marginLayoutParams.rightMargin + i2, this.l, marginLayoutParams.width), M(i3, coordinatorLayout.getPaddingBottom() + coordinatorLayout.getPaddingTop() + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin, this.m, marginLayoutParams.height));
        return true;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public final boolean p(@NonNull View view, @NonNull View view2, float f) {
        WeakReference<View> weakReference = this.Y;
        return (weakReference == null || view2 != weakReference.get() || this.M == 3) ? false : true;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public final void r(@NonNull CoordinatorLayout coordinatorLayout, @NonNull V v, @NonNull View view, int i, int i2, @NonNull int[] iArr, int i3) {
        if (i3 == 1) {
            return;
        }
        WeakReference<View> weakReference = this.Y;
        if (view != (weakReference != null ? weakReference.get() : null)) {
            return;
        }
        int top = v.getTop();
        int i4 = top - i2;
        if (i2 > 0) {
            if (i4 < N()) {
                int N = top - N();
                iArr[1] = N;
                int i5 = -N;
                WeakHashMap<View, b0u0> weakHashMap = iut0.a;
                v.offsetTopAndBottom(i5);
                Y(3);
            } else {
                if (!this.L) {
                    return;
                }
                iArr[1] = i2;
                WeakHashMap<View, b0u0> weakHashMap2 = iut0.a;
                v.offsetTopAndBottom(-i2);
                Y(1);
            }
        } else if (i2 < 0 && !view.canScrollVertically(-1)) {
            int i6 = this.H;
            if (i4 > i6 && !this.J) {
                int i7 = top - i6;
                iArr[1] = i7;
                int i8 = -i7;
                WeakHashMap<View, b0u0> weakHashMap3 = iut0.a;
                v.offsetTopAndBottom(i8);
                Y(4);
            } else {
                if (!this.L) {
                    return;
                }
                iArr[1] = i2;
                WeakHashMap<View, b0u0> weakHashMap4 = iut0.a;
                v.offsetTopAndBottom(-i2);
                Y(1);
            }
        }
        J(v.getTop());
        this.Q = i2;
        this.R = true;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public final void w(@NonNull View view, @NonNull Parcelable parcelable) {
        SavedState savedState = (SavedState) parcelable;
        int i = this.b;
        if (i != 0) {
            if (i == -1 || (i & 1) == 1) {
                this.f = savedState.e;
            }
            if (i == -1 || (i & 2) == 2) {
                this.c = savedState.f;
            }
            if (i == -1 || (i & 4) == 4) {
                this.J = savedState.g;
            }
            if (i == -1 || (i & 8) == 8) {
                this.K = savedState.h;
            }
        }
        int i2 = savedState.d;
        if (i2 == 1 || i2 == 2) {
            this.M = 4;
            this.N = 4;
        } else {
            this.M = i2;
            this.N = i2;
        }
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    @NonNull
    public final Parcelable x(@NonNull View view) {
        return new SavedState((Parcelable) View.BaseSavedState.EMPTY_STATE, (BottomSheetBehavior<?>) this);
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public boolean z(@NonNull CoordinatorLayout coordinatorLayout, @NonNull V v, @NonNull View view, @NonNull View view2, int i, int i2) {
        this.Q = 0;
        this.R = false;
        return (i & 2) != 0;
    }

    public static class SavedState extends AbsSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new a();
        public final int d;
        public final int e;
        public final boolean f;
        public final boolean g;
        public final boolean h;

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
            this.e = parcel.readInt();
            this.f = parcel.readInt() == 1;
            this.g = parcel.readInt() == 1;
            this.h = parcel.readInt() == 1;
        }

        @Override // androidx.customview.view.AbsSavedState, android.os.Parcelable
        public final void writeToParcel(@NonNull Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeInt(this.d);
            parcel.writeInt(this.e);
            parcel.writeInt(this.f ? 1 : 0);
            parcel.writeInt(this.g ? 1 : 0);
            parcel.writeInt(this.h ? 1 : 0);
        }

        public SavedState(Parcelable parcelable, @NonNull BottomSheetBehavior<?> bottomSheetBehavior) {
            super(parcelable);
            this.d = bottomSheetBehavior.M;
            this.e = bottomSheetBehavior.f;
            this.f = bottomSheetBehavior.c;
            this.g = bottomSheetBehavior.J;
            this.h = bottomSheetBehavior.K;
        }
    }

    public BottomSheetBehavior(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        int i;
        this.b = 0;
        this.c = true;
        this.l = -1;
        this.m = -1;
        this.B = new e();
        this.G = 0.5f;
        this.I = -1.0f;
        this.L = true;
        this.M = 4;
        this.N = 4;
        this.S = 0.1f;
        this.Z = new ArrayList<>();
        this.d0 = -1;
        this.g0 = new SparseIntArray();
        this.h0 = new c();
        this.i = context.getResources().getDimensionPixelSize(R$dimen.mtrl_min_touch_target_size);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R$styleable.BottomSheetBehavior_Layout);
        if (obtainStyledAttributes.hasValue(R$styleable.BottomSheetBehavior_Layout_backgroundTint)) {
            this.k = qm10.a(context, obtainStyledAttributes, R$styleable.BottomSheetBehavior_Layout_backgroundTint);
        }
        if (obtainStyledAttributes.hasValue(R$styleable.BottomSheetBehavior_Layout_shapeAppearance)) {
            this.z = com.google.android.material.shape.a.c(context, attributeSet, R$attr.bottomSheetStyle, i0).a();
        }
        com.google.android.material.shape.a aVar = this.z;
        if (aVar != null) {
            MaterialShapeDrawable materialShapeDrawable = new MaterialShapeDrawable(aVar);
            this.j = materialShapeDrawable;
            materialShapeDrawable.initializeElevationOverlay(context);
            ColorStateList colorStateList = this.k;
            if (colorStateList != null) {
                this.j.setFillColor(colorStateList);
            } else {
                TypedValue typedValue = new TypedValue();
                context.getTheme().resolveAttribute(R.attr.colorBackground, typedValue, true);
                this.j.setTint(typedValue.data);
            }
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(F(), 1.0f);
        this.C = ofFloat;
        ofFloat.setDuration(500L);
        this.C.addUpdateListener(new h78(this));
        this.I = obtainStyledAttributes.getDimension(R$styleable.BottomSheetBehavior_Layout_android_elevation, -1.0f);
        if (obtainStyledAttributes.hasValue(R$styleable.BottomSheetBehavior_Layout_android_maxWidth)) {
            this.l = obtainStyledAttributes.getDimensionPixelSize(R$styleable.BottomSheetBehavior_Layout_android_maxWidth, -1);
        }
        if (obtainStyledAttributes.hasValue(R$styleable.BottomSheetBehavior_Layout_android_maxHeight)) {
            this.m = obtainStyledAttributes.getDimensionPixelSize(R$styleable.BottomSheetBehavior_Layout_android_maxHeight, -1);
        }
        TypedValue peekValue = obtainStyledAttributes.peekValue(R$styleable.BottomSheetBehavior_Layout_behavior_peekHeight);
        if (peekValue != null && (i = peekValue.data) == -1) {
            W(i, false);
        } else {
            W(obtainStyledAttributes.getDimensionPixelSize(R$styleable.BottomSheetBehavior_Layout_behavior_peekHeight, -1), false);
        }
        V(obtainStyledAttributes.getBoolean(R$styleable.BottomSheetBehavior_Layout_behavior_hideable, false));
        this.o = obtainStyledAttributes.getBoolean(R$styleable.BottomSheetBehavior_Layout_gestureInsetBottomIgnored, false);
        T(obtainStyledAttributes.getBoolean(R$styleable.BottomSheetBehavior_Layout_behavior_fitToContents, true));
        this.K = obtainStyledAttributes.getBoolean(R$styleable.BottomSheetBehavior_Layout_behavior_skipCollapsed, false);
        this.L = obtainStyledAttributes.getBoolean(R$styleable.BottomSheetBehavior_Layout_behavior_draggable, true);
        this.b = obtainStyledAttributes.getInt(R$styleable.BottomSheetBehavior_Layout_behavior_saveFlags, 0);
        U(obtainStyledAttributes.getFloat(R$styleable.BottomSheetBehavior_Layout_behavior_halfExpandedRatio, 0.5f));
        TypedValue peekValue2 = obtainStyledAttributes.peekValue(R$styleable.BottomSheetBehavior_Layout_behavior_expandedOffset);
        if (peekValue2 != null && peekValue2.type == 16) {
            S(peekValue2.data);
        } else {
            S(obtainStyledAttributes.getDimensionPixelOffset(R$styleable.BottomSheetBehavior_Layout_behavior_expandedOffset, 0));
        }
        this.e = obtainStyledAttributes.getInt(R$styleable.BottomSheetBehavior_Layout_behavior_significantVelocityThreshold, 500);
        this.p = obtainStyledAttributes.getBoolean(R$styleable.BottomSheetBehavior_Layout_paddingBottomSystemWindowInsets, false);
        this.q = obtainStyledAttributes.getBoolean(R$styleable.BottomSheetBehavior_Layout_paddingLeftSystemWindowInsets, false);
        this.r = obtainStyledAttributes.getBoolean(R$styleable.BottomSheetBehavior_Layout_paddingRightSystemWindowInsets, false);
        this.s = obtainStyledAttributes.getBoolean(R$styleable.BottomSheetBehavior_Layout_paddingTopSystemWindowInsets, true);
        this.t = obtainStyledAttributes.getBoolean(R$styleable.BottomSheetBehavior_Layout_marginLeftSystemWindowInsets, false);
        this.u = obtainStyledAttributes.getBoolean(R$styleable.BottomSheetBehavior_Layout_marginRightSystemWindowInsets, false);
        this.v = obtainStyledAttributes.getBoolean(R$styleable.BottomSheetBehavior_Layout_marginTopSystemWindowInsets, false);
        this.y = obtainStyledAttributes.getBoolean(R$styleable.BottomSheetBehavior_Layout_shouldRemoveExpandedCorners, true);
        obtainStyledAttributes.recycle();
        this.d = ViewConfiguration.get(context).getScaledMaximumFlingVelocity();
    }

    public static abstract class d {
        public abstract void b(@NonNull View view, float f);

        public abstract void c(int i, @NonNull View view);

        public void a(@NonNull View view) {
        }
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public final void u(@NonNull CoordinatorLayout coordinatorLayout, @NonNull V v, @NonNull View view, int i, int i2, int i3, int i4, int i5, @NonNull int[] iArr) {
    }
}
