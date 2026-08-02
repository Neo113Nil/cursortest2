package androidx.slidingpanelayout.widget;

import android.R;
import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.customview.view.AbsSavedState;
import androidx.window.layout.adapter.sidecar.SidecarCompat;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import com.unity3d.services.UnityAdsConstants;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.WeakHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.locks.ReentrantLock;
import xsna.am;
import xsna.aor0;
import xsna.b0u0;
import xsna.bqx0;
import xsna.dgn;
import xsna.h4x;
import xsna.hk;
import xsna.hrx0;
import xsna.iut0;
import xsna.myc0;
import xsna.opx0;
import xsna.plj0;
import xsna.po40;
import xsna.qu5;
import xsna.s3q0;
import xsna.upx0;
import xsna.v2s;
import xsna.w2s;
import xsna.yok0;
import xsna.ypx0;
import xsna.zut0;
import xsna.zvj;

/* loaded from: classes12.dex */
public class SlidingPaneLayout extends ViewGroup {
    public static final boolean z;
    public int b;
    public int c;
    public Drawable d;
    public Drawable e;
    public boolean f;
    public View g;
    public float h;
    public float i;
    public int j;
    public boolean k;
    public int l;
    public float m;
    public float n;
    public final CopyOnWriteArrayList o;

    @Nullable
    public f p;
    public final zut0 q;
    public boolean r;
    public boolean s;
    public final Rect t;
    public final ArrayList<c> u;
    public int v;
    public v2s w;
    public final a x;
    public w2s y;

    public static class SavedState extends AbsSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new a();
        public boolean d;
        public int e;

        public class a implements Parcelable.ClassLoaderCreator<SavedState> {
            @Override // android.os.Parcelable.ClassLoaderCreator
            public final SavedState createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new SavedState(parcel);
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new SavedState[i];
            }

            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                return new SavedState(parcel);
            }
        }

        public SavedState(Parcel parcel) {
            super(parcel, null);
            this.d = parcel.readInt() != 0;
            this.e = parcel.readInt();
        }

        @Override // androidx.customview.view.AbsSavedState, android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeInt(this.d ? 1 : 0);
            parcel.writeInt(this.e);
        }
    }

    public class a {
        public a() {
        }
    }

    public class b extends hk {
        public final Rect b = new Rect();

        public b() {
        }

        @Override // xsna.hk
        public final void onInitializeAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
            super.onInitializeAccessibilityEvent(view, accessibilityEvent);
            accessibilityEvent.setClassName("androidx.slidingpanelayout.widget.SlidingPaneLayout");
        }

        @Override // xsna.hk
        public final void onInitializeAccessibilityNodeInfo(View view, am amVar) {
            AccessibilityNodeInfo obtain = AccessibilityNodeInfo.obtain(amVar.a);
            super.onInitializeAccessibilityNodeInfo(view, new am(obtain));
            Rect rect = this.b;
            obtain.getBoundsInScreen(rect);
            amVar.k(rect);
            amVar.C(obtain.isVisibleToUser());
            CharSequence packageName = obtain.getPackageName();
            AccessibilityNodeInfo accessibilityNodeInfo = amVar.a;
            accessibilityNodeInfo.setPackageName(packageName);
            amVar.n(obtain.getClassName());
            amVar.r(obtain.getContentDescription());
            accessibilityNodeInfo.setEnabled(obtain.isEnabled());
            amVar.o(obtain.isClickable());
            amVar.t(obtain.isFocusable());
            accessibilityNodeInfo.setFocused(obtain.isFocused());
            accessibilityNodeInfo.setAccessibilityFocused(obtain.isAccessibilityFocused());
            accessibilityNodeInfo.setSelected(obtain.isSelected());
            accessibilityNodeInfo.setLongClickable(obtain.isLongClickable());
            amVar.a(obtain.getActions());
            accessibilityNodeInfo.setMovementGranularities(obtain.getMovementGranularities());
            amVar.n("androidx.slidingpanelayout.widget.SlidingPaneLayout");
            amVar.c = -1;
            accessibilityNodeInfo.setSource(view);
            WeakHashMap<View, b0u0> weakHashMap = iut0.a;
            Object parentForAccessibility = view.getParentForAccessibility();
            if (parentForAccessibility instanceof View) {
                amVar.b = -1;
                accessibilityNodeInfo.setParent((View) parentForAccessibility);
            }
            SlidingPaneLayout slidingPaneLayout = SlidingPaneLayout.this;
            int childCount = slidingPaneLayout.getChildCount();
            for (int i = 0; i < childCount; i++) {
                View childAt = slidingPaneLayout.getChildAt(i);
                if (!slidingPaneLayout.b(childAt) && childAt.getVisibility() == 0) {
                    childAt.setImportantForAccessibility(1);
                    accessibilityNodeInfo.addChild(childAt);
                }
            }
        }

        @Override // xsna.hk
        public final boolean onRequestSendAccessibilityEvent(ViewGroup viewGroup, View view, AccessibilityEvent accessibilityEvent) {
            if (SlidingPaneLayout.this.b(view)) {
                return false;
            }
            return super.onRequestSendAccessibilityEvent(viewGroup, view, accessibilityEvent);
        }
    }

    public class c implements Runnable {
        @Override // java.lang.Runnable
        public final void run() {
            throw null;
        }
    }

    public class d extends zut0.c {
        public d() {
        }

        public final boolean a() {
            SlidingPaneLayout slidingPaneLayout = SlidingPaneLayout.this;
            if (slidingPaneLayout.k || slidingPaneLayout.getLockMode() == 3) {
                return false;
            }
            if (slidingPaneLayout.d() && slidingPaneLayout.getLockMode() == 1) {
                return false;
            }
            return slidingPaneLayout.d() || slidingPaneLayout.getLockMode() != 2;
        }

        @Override // xsna.zut0.c
        public final int clampViewPositionHorizontal(View view, int i, int i2) {
            SlidingPaneLayout slidingPaneLayout = SlidingPaneLayout.this;
            e eVar = (e) slidingPaneLayout.g.getLayoutParams();
            if (!slidingPaneLayout.c()) {
                int paddingLeft = slidingPaneLayout.getPaddingLeft() + ((ViewGroup.MarginLayoutParams) eVar).leftMargin;
                return Math.min(Math.max(i, paddingLeft), slidingPaneLayout.j + paddingLeft);
            }
            int width = slidingPaneLayout.getWidth() - (slidingPaneLayout.g.getWidth() + (slidingPaneLayout.getPaddingRight() + ((ViewGroup.MarginLayoutParams) eVar).rightMargin));
            return Math.max(Math.min(i, width), width - slidingPaneLayout.j);
        }

        @Override // xsna.zut0.c
        public final int clampViewPositionVertical(View view, int i, int i2) {
            return view.getTop();
        }

        @Override // xsna.zut0.c
        public final int getViewHorizontalDragRange(View view) {
            return SlidingPaneLayout.this.j;
        }

        @Override // xsna.zut0.c
        public final void onEdgeDragStarted(int i, int i2) {
            if (a()) {
                SlidingPaneLayout slidingPaneLayout = SlidingPaneLayout.this;
                slidingPaneLayout.q.c(i2, slidingPaneLayout.g);
            }
        }

        @Override // xsna.zut0.c
        public final void onEdgeTouched(int i, int i2) {
            if (a()) {
                SlidingPaneLayout slidingPaneLayout = SlidingPaneLayout.this;
                slidingPaneLayout.q.c(i2, slidingPaneLayout.g);
            }
        }

        @Override // xsna.zut0.c
        public final void onViewCaptured(View view, int i) {
            SlidingPaneLayout slidingPaneLayout = SlidingPaneLayout.this;
            int childCount = slidingPaneLayout.getChildCount();
            for (int i2 = 0; i2 < childCount; i2++) {
                View childAt = slidingPaneLayout.getChildAt(i2);
                if (childAt.getVisibility() == 4) {
                    childAt.setVisibility(0);
                }
            }
        }

        @Override // xsna.zut0.c
        public final void onViewDragStateChanged(int i) {
            SlidingPaneLayout slidingPaneLayout = SlidingPaneLayout.this;
            CopyOnWriteArrayList copyOnWriteArrayList = slidingPaneLayout.o;
            if (slidingPaneLayout.q.a == 0) {
                if (slidingPaneLayout.h != 1.0f) {
                    Iterator it = copyOnWriteArrayList.iterator();
                    while (it.hasNext()) {
                        ((f) it.next()).d();
                    }
                    slidingPaneLayout.sendAccessibilityEvent(32);
                    slidingPaneLayout.r = true;
                    return;
                }
                slidingPaneLayout.h(slidingPaneLayout.g);
                Iterator it2 = copyOnWriteArrayList.iterator();
                while (it2.hasNext()) {
                    ((f) it2.next()).g();
                }
                slidingPaneLayout.sendAccessibilityEvent(32);
                slidingPaneLayout.r = false;
            }
        }

        @Override // xsna.zut0.c
        public final void onViewPositionChanged(View view, int i, int i2, int i3, int i4) {
            SlidingPaneLayout slidingPaneLayout = SlidingPaneLayout.this;
            if (slidingPaneLayout.g == null) {
                slidingPaneLayout.h = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
            } else {
                boolean c = slidingPaneLayout.c();
                e eVar = (e) slidingPaneLayout.g.getLayoutParams();
                int width = slidingPaneLayout.g.getWidth();
                if (c) {
                    i = (slidingPaneLayout.getWidth() - i) - width;
                }
                float paddingRight = (i - ((c ? slidingPaneLayout.getPaddingRight() : slidingPaneLayout.getPaddingLeft()) + (c ? ((ViewGroup.MarginLayoutParams) eVar).rightMargin : ((ViewGroup.MarginLayoutParams) eVar).leftMargin))) / slidingPaneLayout.j;
                slidingPaneLayout.h = paddingRight;
                if (slidingPaneLayout.l != 0) {
                    slidingPaneLayout.f(paddingRight);
                }
                Iterator it = slidingPaneLayout.o.iterator();
                while (it.hasNext()) {
                    ((f) it.next()).c(slidingPaneLayout.h);
                }
            }
            slidingPaneLayout.invalidate();
        }

        @Override // xsna.zut0.c
        public final void onViewReleased(View view, float f, float f2) {
            int paddingLeft;
            e eVar = (e) view.getLayoutParams();
            SlidingPaneLayout slidingPaneLayout = SlidingPaneLayout.this;
            if (slidingPaneLayout.c()) {
                int paddingRight = slidingPaneLayout.getPaddingRight() + ((ViewGroup.MarginLayoutParams) eVar).rightMargin;
                if (f < UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT || (f == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT && slidingPaneLayout.h > 0.5f)) {
                    paddingRight += slidingPaneLayout.j;
                }
                paddingLeft = (slidingPaneLayout.getWidth() - paddingRight) - slidingPaneLayout.g.getWidth();
            } else {
                paddingLeft = ((ViewGroup.MarginLayoutParams) eVar).leftMargin + slidingPaneLayout.getPaddingLeft();
                if (f > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT || (f == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT && slidingPaneLayout.h > 0.5f)) {
                    paddingLeft += slidingPaneLayout.j;
                }
            }
            slidingPaneLayout.q.s(paddingLeft, view.getTop());
            slidingPaneLayout.invalidate();
        }

        @Override // xsna.zut0.c
        public final boolean tryCaptureView(View view, int i) {
            if (a()) {
                return ((e) view.getLayoutParams()).b;
            }
            return false;
        }
    }

    public interface f {
        void c(float f);

        void d();

        void g();
    }

    public static class g extends FrameLayout {
        @Override // android.view.View
        public final boolean onGenericMotionEvent(MotionEvent motionEvent) {
            return true;
        }

        @Override // android.view.View
        public final boolean onTouchEvent(MotionEvent motionEvent) {
            return true;
        }
    }

    static {
        z = Build.VERSION.SDK_INT >= 29;
    }

    public SlidingPaneLayout(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        this.b = 0;
        this.h = 1.0f;
        this.o = new CopyOnWriteArrayList();
        this.s = true;
        this.t = new Rect();
        this.u = new ArrayList<>();
        this.x = new a();
        float f2 = context.getResources().getDisplayMetrics().density;
        setWillNotDraw(false);
        iut0.q(this, new b());
        setImportantForAccessibility(1);
        zut0 zut0Var = new zut0(getContext(), this, new d());
        zut0Var.b = (int) (2.0f * zut0Var.b);
        this.q = zut0Var;
        zut0Var.n = f2 * 400.0f;
        upx0.a.getClass();
        opx0 opx0Var = (opx0) upx0.a.b.getValue();
        if (opx0Var == null) {
            plj0 plj0Var = plj0.c;
            if (plj0.c == null) {
                ReentrantLock reentrantLock = plj0.d;
                reentrantLock.lock();
                try {
                    if (plj0.c == null) {
                        SidecarCompat sidecarCompat = null;
                        try {
                            aor0 b2 = SidecarCompat.a.b();
                            if (b2 != null) {
                                if (((BigInteger) b2.f.getValue()).compareTo((BigInteger) aor0.g.f.getValue()) >= 0) {
                                    SidecarCompat sidecarCompat2 = new SidecarCompat(context);
                                    if (sidecarCompat2.f()) {
                                        sidecarCompat = sidecarCompat2;
                                    }
                                }
                            }
                        } catch (Throwable unused) {
                        }
                        plj0.c = new plj0(sidecarCompat);
                    }
                    s3q0 s3q0Var = s3q0.a;
                    reentrantLock.unlock();
                } catch (Throwable th) {
                    reentrantLock.unlock();
                    throw th;
                }
            }
            opx0Var = plj0.c;
        }
        hrx0 hrx0Var = new hrx0();
        new po40(22);
        ypx0 ypx0Var = new ypx0(hrx0Var, opx0Var);
        upx0.a.c.getClass();
        setFoldingFeatureObserver(new w2s(ypx0Var, context.getMainExecutor()));
    }

    private h4x getSystemGestureInsets() {
        if (!z) {
            return null;
        }
        WeakHashMap<View, b0u0> weakHashMap = iut0.a;
        bqx0 a2 = iut0.e.a(this);
        if (a2 != null) {
            return a2.a.m();
        }
        return null;
    }

    private void setFoldingFeatureObserver(w2s w2sVar) {
        this.y = w2sVar;
        w2sVar.d = this.x;
    }

    public final boolean a() {
        if (!this.f) {
            this.r = false;
        }
        if (!this.s && !g(1.0f)) {
            return false;
        }
        this.r = false;
        return true;
    }

    @Override // android.view.ViewGroup
    public final void addView(@NonNull View view, int i, @Nullable ViewGroup.LayoutParams layoutParams) {
        if (getChildCount() != 1) {
            super.addView(view, i, layoutParams);
            return;
        }
        g gVar = new g(view.getContext());
        gVar.addView(view);
        super.addView(gVar, i, layoutParams);
    }

    public final boolean b(View view) {
        if (view == null) {
            return false;
        }
        return this.f && ((e) view.getLayoutParams()).c && this.h > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
    }

    public final boolean c() {
        WeakHashMap<View, b0u0> weakHashMap = iut0.a;
        return getLayoutDirection() == 1;
    }

    @Override // android.view.ViewGroup
    public final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return (layoutParams instanceof e) && super.checkLayoutParams(layoutParams);
    }

    @Override // android.view.View
    public final void computeScroll() {
        zut0 zut0Var = this.q;
        if (zut0Var.h()) {
            if (!this.f) {
                zut0Var.a();
            } else {
                WeakHashMap<View, b0u0> weakHashMap = iut0.a;
                postInvalidateOnAnimation();
            }
        }
    }

    public final boolean d() {
        return !this.f || this.h == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
        int i;
        int i2;
        super.draw(canvas);
        Drawable drawable = c() ? this.e : this.d;
        View childAt = getChildCount() > 1 ? getChildAt(1) : null;
        if (childAt == null || drawable == null) {
            return;
        }
        int top = childAt.getTop();
        int bottom = childAt.getBottom();
        int intrinsicWidth = drawable.getIntrinsicWidth();
        if (c()) {
            i2 = childAt.getRight();
            i = intrinsicWidth + i2;
        } else {
            int left = childAt.getLeft();
            int i3 = left - intrinsicWidth;
            i = left;
            i2 = i3;
        }
        drawable.setBounds(i2, top, i, bottom);
        drawable.draw(canvas);
    }

    @Override // android.view.ViewGroup
    public final boolean drawChild(Canvas canvas, View view, long j) {
        boolean c2 = c() ^ d();
        zut0 zut0Var = this.q;
        if (c2) {
            zut0Var.q = 1;
            h4x systemGestureInsets = getSystemGestureInsets();
            if (systemGestureInsets != null) {
                zut0Var.o = Math.max(zut0Var.p, systemGestureInsets.a);
            }
        } else {
            zut0Var.q = 2;
            h4x systemGestureInsets2 = getSystemGestureInsets();
            if (systemGestureInsets2 != null) {
                zut0Var.o = Math.max(zut0Var.p, systemGestureInsets2.c);
            }
        }
        e eVar = (e) view.getLayoutParams();
        int save = canvas.save();
        if (this.f && !eVar.b && this.g != null) {
            Rect rect = this.t;
            canvas.getClipBounds(rect);
            if (c()) {
                rect.left = Math.max(rect.left, this.g.getRight());
            } else {
                rect.right = Math.min(rect.right, this.g.getLeft());
            }
            canvas.clipRect(rect);
        }
        boolean drawChild = super.drawChild(canvas, view, j);
        canvas.restoreToCount(save);
        return drawChild;
    }

    public final void e() {
        if (!this.f) {
            this.r = true;
        }
        if (this.s || g(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT)) {
            this.r = true;
        }
    }

    public final void f(float f2) {
        boolean c2 = c();
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            if (childAt != this.g) {
                float f3 = 1.0f - this.i;
                int i2 = this.l;
                this.i = f2;
                int i3 = ((int) (f3 * i2)) - ((int) ((1.0f - f2) * i2));
                if (c2) {
                    i3 = -i3;
                }
                childAt.offsetLeftAndRight(i3);
            }
        }
    }

    public final boolean g(float f2) {
        int paddingLeft;
        if (this.f) {
            boolean c2 = c();
            e eVar = (e) this.g.getLayoutParams();
            if (c2) {
                int paddingRight = getPaddingRight() + ((ViewGroup.MarginLayoutParams) eVar).rightMargin;
                paddingLeft = (int) (getWidth() - (((f2 * this.j) + paddingRight) + this.g.getWidth()));
            } else {
                paddingLeft = (int) ((f2 * this.j) + getPaddingLeft() + ((ViewGroup.MarginLayoutParams) eVar).leftMargin);
            }
            View view = this.g;
            if (this.q.u(paddingLeft, view.getTop(), view)) {
                int childCount = getChildCount();
                for (int i = 0; i < childCount; i++) {
                    View childAt = getChildAt(i);
                    if (childAt.getVisibility() == 4) {
                        childAt.setVisibility(0);
                    }
                }
                WeakHashMap<View, b0u0> weakHashMap = iut0.a;
                postInvalidateOnAnimation();
                return true;
            }
        }
        return false;
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new e();
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            e eVar = new e((ViewGroup.MarginLayoutParams) layoutParams);
            eVar.a = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
            return eVar;
        }
        e eVar2 = new e(layoutParams);
        eVar2.a = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        return eVar2;
    }

    @Deprecated
    public int getCoveredFadeColor() {
        return this.c;
    }

    public final int getLockMode() {
        return this.v;
    }

    public int getParallaxDistance() {
        return this.l;
    }

    @Deprecated
    public int getSliderFadeColor() {
        return this.b;
    }

    public final void h(View view) {
        int i;
        int i2;
        int i3;
        int i4;
        View childAt;
        boolean z2;
        View view2 = view;
        boolean c2 = c();
        int width = c2 ? getWidth() - getPaddingRight() : getPaddingLeft();
        int paddingLeft = c2 ? getPaddingLeft() : getWidth() - getPaddingRight();
        int paddingTop = getPaddingTop();
        int height = getHeight() - getPaddingBottom();
        if (view2 == null || !view2.isOpaque()) {
            i = 0;
            i2 = 0;
            i3 = 0;
            i4 = 0;
        } else {
            i = view2.getLeft();
            i2 = view2.getRight();
            i3 = view2.getTop();
            i4 = view2.getBottom();
        }
        int childCount = getChildCount();
        int i5 = 0;
        while (i5 < childCount && (childAt = getChildAt(i5)) != view2) {
            if (childAt.getVisibility() == 8) {
                z2 = c2;
            } else {
                z2 = c2;
                childAt.setVisibility((Math.max(c2 ? paddingLeft : width, childAt.getLeft()) < i || Math.max(paddingTop, childAt.getTop()) < i3 || Math.min(c2 ? width : paddingLeft, childAt.getRight()) > i2 || Math.min(height, childAt.getBottom()) > i4) ? 0 : 4);
            }
            i5++;
            view2 = view;
            c2 = z2;
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        Activity activity;
        super.onAttachedToWindow();
        this.s = true;
        if (this.y != null) {
            Context context = getContext();
            while (true) {
                if (!(context instanceof ContextWrapper)) {
                    activity = null;
                    break;
                } else {
                    if (context instanceof Activity) {
                        activity = (Activity) context;
                        break;
                    }
                    context = ((ContextWrapper) context).getBaseContext();
                }
            }
            if (activity != null) {
                w2s w2sVar = this.y;
                yok0 yok0Var = w2sVar.c;
                if (yok0Var != null) {
                    yok0Var.b(null);
                }
                w2sVar.c = myc0.h(zvj.a(qu5.b(w2sVar.b)), null, null, new FoldingFeatureObserver$registerLayoutStateChangeCallback$1(w2sVar, activity, null), 3);
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        yok0 yok0Var;
        super.onDetachedFromWindow();
        this.s = true;
        w2s w2sVar = this.y;
        if (w2sVar != null && (yok0Var = w2sVar.c) != null) {
            yok0Var.b(null);
        }
        ArrayList<c> arrayList = this.u;
        if (arrayList.size() <= 0) {
            arrayList.clear();
        } else {
            arrayList.get(0).getClass();
            throw null;
        }
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        boolean z2;
        View childAt;
        int actionMasked = motionEvent.getActionMasked();
        boolean z3 = this.f;
        zut0 zut0Var = this.q;
        if (!z3 && actionMasked == 0 && getChildCount() > 1 && (childAt = getChildAt(1)) != null) {
            int x = (int) motionEvent.getX();
            int y = (int) motionEvent.getY();
            zut0Var.getClass();
            this.r = zut0.l(x, y, childAt);
        }
        if (!this.f || (this.k && actionMasked != 0)) {
            zut0Var.b();
            return super.onInterceptTouchEvent(motionEvent);
        }
        if (actionMasked == 3 || actionMasked == 1) {
            zut0Var.b();
            return false;
        }
        if (actionMasked == 0) {
            this.k = false;
            float x2 = motionEvent.getX();
            float y2 = motionEvent.getY();
            this.m = x2;
            this.n = y2;
            View view = this.g;
            zut0Var.getClass();
            if (zut0.l((int) x2, (int) y2, view) && b(this.g)) {
                z2 = true;
                return !zut0Var.t(motionEvent) || z2;
            }
        } else if (actionMasked == 2) {
            float x3 = motionEvent.getX();
            float y3 = motionEvent.getY();
            float abs = Math.abs(x3 - this.m);
            float abs2 = Math.abs(y3 - this.n);
            if (abs > zut0Var.b && abs2 > abs) {
                zut0Var.b();
                this.k = true;
                return false;
            }
        }
        z2 = false;
        if (zut0Var.t(motionEvent)) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x00a7  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00ad  */
    @Override // android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void onLayout(boolean z2, int i, int i2, int i3, int i4) {
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        boolean c2 = c();
        int i10 = i3 - i;
        int paddingRight = c2 ? getPaddingRight() : getPaddingLeft();
        int paddingLeft = c2 ? getPaddingLeft() : getPaddingRight();
        int paddingTop = getPaddingTop();
        int childCount = getChildCount();
        if (this.s) {
            this.h = (this.f && this.r) ? UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT : 1.0f;
        }
        int i11 = paddingRight;
        for (int i12 = 0; i12 < childCount; i12++) {
            View childAt = getChildAt(i12);
            if (childAt.getVisibility() != 8) {
                e eVar = (e) childAt.getLayoutParams();
                int measuredWidth = childAt.getMeasuredWidth();
                if (eVar.b) {
                    int i13 = i10 - paddingLeft;
                    int min = (Math.min(paddingRight, i13) - i11) - (((ViewGroup.MarginLayoutParams) eVar).leftMargin + ((ViewGroup.MarginLayoutParams) eVar).rightMargin);
                    this.j = min;
                    int i14 = c2 ? ((ViewGroup.MarginLayoutParams) eVar).rightMargin : ((ViewGroup.MarginLayoutParams) eVar).leftMargin;
                    eVar.c = (measuredWidth / 2) + ((i11 + i14) + min) > i13;
                    float f2 = min;
                    int i15 = (int) (this.h * f2);
                    i5 = i14 + i15 + i11;
                    this.h = i15 / f2;
                } else if (!this.f || (i6 = this.l) == 0) {
                    i5 = paddingRight;
                } else {
                    i7 = (int) ((1.0f - this.h) * i6);
                    i5 = paddingRight;
                    if (c2) {
                        i8 = i5 - i7;
                        i9 = i8 + measuredWidth;
                    } else {
                        i9 = (i10 - i5) + i7;
                        i8 = i9 - measuredWidth;
                    }
                    dgn.b(childAt, paddingTop, i8, paddingTop, i9);
                    v2s v2sVar = this.w;
                    paddingRight = Math.abs((v2sVar == null && v2sVar.getOrientation() == v2s.a.b && this.w.a()) ? this.w.getBounds().width() : 0) + childAt.getWidth() + paddingRight;
                    i11 = i5;
                }
                i7 = 0;
                if (c2) {
                }
                dgn.b(childAt, paddingTop, i8, paddingTop, i9);
                v2s v2sVar2 = this.w;
                paddingRight = Math.abs((v2sVar2 == null && v2sVar2.getOrientation() == v2s.a.b && this.w.a()) ? this.w.getBounds().width() : 0) + childAt.getWidth() + paddingRight;
                i11 = i5;
            }
        }
        if (this.s) {
            if (this.f && this.l != 0) {
                f(this.h);
            }
            h(this.g);
        }
        this.s = false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:89:0x02d1, code lost:
    
        if (r2.width() < (r12 ? ((androidx.slidingpanelayout.widget.SlidingPaneLayout.g) r1).getChildAt(r4).getMinimumWidth() : r1.getMinimumWidth())) goto L126;
     */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0259  */
    /* JADX WARN: Type inference failed for: r7v0 */
    /* JADX WARN: Type inference failed for: r7v1, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r7v31 */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void onMeasure(int i, int i2) {
        int paddingTop;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        ArrayList arrayList;
        zut0 zut0Var;
        int i8;
        int i9;
        int i10;
        int minimumWidth;
        int makeMeasureSpec;
        int mode = View.MeasureSpec.getMode(i);
        int size = View.MeasureSpec.getSize(i);
        int mode2 = View.MeasureSpec.getMode(i2);
        int size2 = View.MeasureSpec.getSize(i2);
        ?? r7 = 0;
        if (mode2 != Integer.MIN_VALUE) {
            i3 = mode2 != 1073741824 ? 0 : (size2 - getPaddingTop()) - getPaddingBottom();
            paddingTop = i3;
        } else {
            paddingTop = (size2 - getPaddingTop()) - getPaddingBottom();
            i3 = 0;
        }
        int max = Math.max((size - getPaddingLeft()) - getPaddingRight(), 0);
        int childCount = getChildCount();
        if (childCount > 2) {
            Log.e("SlidingPaneLayout", "onMeasure: More than two child views are not supported.");
        }
        this.g = null;
        int i11 = 0;
        boolean z2 = false;
        int i12 = max;
        float f2 = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        while (true) {
            i4 = 8;
            if (i11 >= childCount) {
                break;
            }
            View childAt = getChildAt(i11);
            e eVar = (e) childAt.getLayoutParams();
            if (childAt.getVisibility() == 8) {
                eVar.c = r7;
            } else {
                float f3 = eVar.a;
                if (f3 > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                    f2 += f3;
                    if (((ViewGroup.MarginLayoutParams) eVar).width == 0) {
                    }
                }
                int max2 = Math.max(max - (((ViewGroup.MarginLayoutParams) eVar).leftMargin + ((ViewGroup.MarginLayoutParams) eVar).rightMargin), (int) r7);
                int i13 = ((ViewGroup.MarginLayoutParams) eVar).width;
                if (i13 == -2) {
                    makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(max2, mode == 0 ? mode : Integer.MIN_VALUE);
                } else {
                    makeMeasureSpec = i13 == -1 ? View.MeasureSpec.makeMeasureSpec(max2, mode) : View.MeasureSpec.makeMeasureSpec(i13, 1073741824);
                }
                childAt.measure(makeMeasureSpec, ViewGroup.getChildMeasureSpec(i2, getPaddingBottom() + getPaddingTop(), ((ViewGroup.MarginLayoutParams) eVar).height));
                int measuredWidth = childAt.getMeasuredWidth();
                int measuredHeight = childAt.getMeasuredHeight();
                if (measuredHeight > i3) {
                    if (mode2 == Integer.MIN_VALUE) {
                        i3 = Math.min(measuredHeight, paddingTop);
                    } else if (mode2 == 0) {
                        i3 = measuredHeight;
                    }
                }
                i12 -= measuredWidth;
                if (i11 != 0) {
                    boolean z3 = i12 < 0;
                    eVar.b = z3;
                    z2 |= z3;
                    if (z3) {
                        this.g = childAt;
                    }
                }
            }
            i11++;
            r7 = 0;
        }
        int i14 = 1;
        if (z2 || f2 > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
            int i15 = 0;
            while (i15 < childCount) {
                View childAt2 = getChildAt(i15);
                if (childAt2.getVisibility() == i4) {
                    i7 = i15;
                } else {
                    e eVar2 = (e) childAt2.getLayoutParams();
                    int i16 = ((ViewGroup.MarginLayoutParams) eVar2).width;
                    float f4 = eVar2.a;
                    int measuredWidth2 = (i16 != 0 || f4 <= UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) ? childAt2.getMeasuredWidth() : 0;
                    if (z2) {
                        i5 = max - (((ViewGroup.MarginLayoutParams) eVar2).leftMargin + ((ViewGroup.MarginLayoutParams) eVar2).rightMargin);
                        i6 = View.MeasureSpec.makeMeasureSpec(i5, 1073741824);
                    } else if (f4 > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                        i5 = ((int) ((f4 * Math.max(0, i12)) / f2)) + measuredWidth2;
                        i6 = View.MeasureSpec.makeMeasureSpec(i5, 1073741824);
                    } else {
                        i5 = measuredWidth2;
                        i6 = 0;
                    }
                    int paddingBottom = getPaddingBottom() + getPaddingTop();
                    e eVar3 = (e) childAt2.getLayoutParams();
                    i7 = i15;
                    int makeMeasureSpec2 = (((ViewGroup.MarginLayoutParams) eVar3).width != 0 || eVar3.a <= UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) ? View.MeasureSpec.makeMeasureSpec(childAt2.getMeasuredHeight(), 1073741824) : ViewGroup.getChildMeasureSpec(i2, paddingBottom, ((ViewGroup.MarginLayoutParams) eVar3).height);
                    if (measuredWidth2 != i5) {
                        childAt2.measure(i6, makeMeasureSpec2);
                        int measuredHeight2 = childAt2.getMeasuredHeight();
                        if (measuredHeight2 > i3) {
                            if (mode2 == Integer.MIN_VALUE) {
                                measuredHeight2 = Math.min(measuredHeight2, paddingTop);
                            } else if (mode2 != 0) {
                            }
                            i3 = measuredHeight2;
                        }
                    }
                }
                i15 = i7 + 1;
                i4 = 8;
            }
        }
        v2s v2sVar = this.w;
        if (v2sVar != null && v2sVar.a() && this.w.getBounds().left != 0 && this.w.getBounds().top == 0) {
            v2s v2sVar2 = this.w;
            int[] iArr = new int[2];
            getLocationInWindow(iArr);
            int i17 = iArr[0];
            Rect rect = new Rect(i17, iArr[1], getWidth() + i17, getWidth() + iArr[1]);
            Rect rect2 = new Rect(v2sVar2.getBounds());
            boolean intersect = rect2.intersect(rect);
            if (!(rect2.width() == 0 && rect2.height() == 0) && intersect) {
                rect2.offset(-iArr[0], -iArr[1]);
            } else {
                rect2 = null;
            }
            if (rect2 != null) {
                Rect rect3 = new Rect(getPaddingLeft(), getPaddingTop(), Math.max(getPaddingLeft(), rect2.left), getHeight() - getPaddingBottom());
                int width = getWidth() - getPaddingRight();
                arrayList = new ArrayList(Arrays.asList(rect3, new Rect(Math.min(width, rect2.right), getPaddingTop(), width, getHeight() - getPaddingBottom())));
                if (arrayList != null && !z2) {
                    i8 = 0;
                    while (i8 < childCount) {
                        View childAt3 = getChildAt(i8);
                        if (childAt3.getVisibility() != 8) {
                            Rect rect4 = (Rect) arrayList.get(i8);
                            e eVar4 = (e) childAt3.getLayoutParams();
                            int i18 = ((ViewGroup.MarginLayoutParams) eVar4).leftMargin + ((ViewGroup.MarginLayoutParams) eVar4).rightMargin;
                            int makeMeasureSpec3 = View.MeasureSpec.makeMeasureSpec(childAt3.getMeasuredHeight(), 1073741824);
                            childAt3.measure(View.MeasureSpec.makeMeasureSpec(rect4.width(), Integer.MIN_VALUE), makeMeasureSpec3);
                            if ((childAt3.getMeasuredWidthAndState() & C.DEFAULT_MUXED_BUFFER_SIZE) != i14) {
                                boolean z4 = childAt3 instanceof g;
                                if (z4) {
                                    i10 = 0;
                                    View childAt4 = ((g) childAt3).getChildAt(0);
                                    WeakHashMap<View, b0u0> weakHashMap = iut0.a;
                                    minimumWidth = childAt4.getMinimumWidth();
                                } else {
                                    i10 = 0;
                                    WeakHashMap<View, b0u0> weakHashMap2 = iut0.a;
                                    minimumWidth = childAt3.getMinimumWidth();
                                }
                                if (minimumWidth != 0) {
                                }
                                childAt3.measure(View.MeasureSpec.makeMeasureSpec(rect4.width(), 1073741824), makeMeasureSpec3);
                            }
                            childAt3.measure(View.MeasureSpec.makeMeasureSpec(max - i18, 1073741824), makeMeasureSpec3);
                            if (i8 != 0) {
                                i9 = 1;
                                eVar4.b = true;
                                this.g = childAt3;
                                z2 = true;
                                i8++;
                                i14 = i9;
                            }
                        }
                        i9 = 1;
                        i8++;
                        i14 = i9;
                    }
                }
                boolean z5 = z2;
                setMeasuredDimension(size, getPaddingBottom() + getPaddingTop() + i3);
                this.f = z5;
                zut0Var = this.q;
                if (zut0Var.a != 0 || z5) {
                }
                zut0Var.a();
                return;
            }
        }
        arrayList = null;
        if (arrayList != null) {
            i8 = 0;
            while (i8 < childCount) {
            }
        }
        boolean z52 = z2;
        setMeasuredDimension(size, getPaddingBottom() + getPaddingTop() + i3);
        this.f = z52;
        zut0Var = this.q;
        if (zut0Var.a != 0) {
        }
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.b);
        if (savedState.d) {
            e();
        } else {
            a();
        }
        this.r = savedState.d;
        setLockMode(savedState.e);
    }

    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        savedState.d = this.f ? d() : this.r;
        savedState.e = this.v;
        return savedState;
    }

    @Override // android.view.View
    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        if (i != i3) {
            this.s = true;
        }
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (!this.f) {
            return super.onTouchEvent(motionEvent);
        }
        zut0 zut0Var = this.q;
        zut0Var.m(motionEvent);
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            float x = motionEvent.getX();
            float y = motionEvent.getY();
            this.m = x;
            this.n = y;
            return true;
        }
        if (actionMasked == 1 && b(this.g)) {
            float x2 = motionEvent.getX();
            float y2 = motionEvent.getY();
            float f2 = x2 - this.m;
            float f3 = y2 - this.n;
            int i = zut0Var.b;
            if ((f3 * f3) + (f2 * f2) < i * i) {
                if (zut0.l((int) x2, (int) y2, this.g)) {
                    a();
                }
            }
        }
        return true;
    }

    @Override // android.view.ViewGroup, android.view.ViewManager
    public final void removeView(@NonNull View view) {
        if (view.getParent() instanceof g) {
            super.removeView((View) view.getParent());
        } else {
            super.removeView(view);
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void requestChildFocus(View view, View view2) {
        super.requestChildFocus(view, view2);
        if (isInTouchMode() || this.f) {
            return;
        }
        this.r = view == this.g;
    }

    @Deprecated
    public void setCoveredFadeColor(int i) {
        this.c = i;
    }

    public final void setLockMode(int i) {
        this.v = i;
    }

    @Deprecated
    public void setPanelSlideListener(@Nullable f fVar) {
        f fVar2 = this.p;
        CopyOnWriteArrayList copyOnWriteArrayList = this.o;
        if (fVar2 != null) {
            copyOnWriteArrayList.remove(fVar2);
        }
        if (fVar != null) {
            copyOnWriteArrayList.add(fVar);
        }
        this.p = fVar;
    }

    public void setParallaxDistance(int i) {
        this.l = i;
        requestLayout();
    }

    @Deprecated
    public void setShadowDrawable(Drawable drawable) {
        setShadowDrawableLeft(drawable);
    }

    public void setShadowDrawableLeft(@Nullable Drawable drawable) {
        this.d = drawable;
    }

    public void setShadowDrawableRight(@Nullable Drawable drawable) {
        this.e = drawable;
    }

    @Deprecated
    public void setShadowResource(int i) {
        setShadowDrawableLeft(getResources().getDrawable(i));
    }

    public void setShadowResourceLeft(int i) {
        setShadowDrawableLeft(getContext().getDrawable(i));
    }

    public void setShadowResourceRight(int i) {
        setShadowDrawableRight(getContext().getDrawable(i));
    }

    @Deprecated
    public void setSliderFadeColor(int i) {
        this.b = i;
    }

    public static class e extends ViewGroup.MarginLayoutParams {
        public static final int[] d = {R.attr.layout_weight};
        public float a;
        public boolean b;
        public boolean c;

        public e() {
            super(-1, -1);
            this.a = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        }

        public e(int i) {
            super(i, -1);
            this.a = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        }
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        Context context = getContext();
        e eVar = new e(context, attributeSet);
        eVar.a = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, e.d);
        eVar.a = obtainStyledAttributes.getFloat(0, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
        obtainStyledAttributes.recycle();
        return eVar;
    }
}
