package com.google.android.material.bottomsheet;

import C.o0;
import P2.b;
import android.R;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
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
import androidx.annotation.NonNull;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.core.view.C5353y0;
import androidx.core.view.Y;
import androidx.recyclerview.widget.LinearLayoutManager;
import i7.C7017a;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import s7.C9621p;
import y2.q;
import y2.s;
import y7.C10856g;
import y7.k;

/* loaded from: classes.dex */
public class BottomSheetBehavior<V extends View> extends CoordinatorLayout.c<V> {
    private static final int DEF_STYLE_RES = 2132019007;
    int activePointerId;
    private ColorStateList backgroundTint;

    @NonNull
    private final ArrayList<f> callbacks;
    private int childHeight;
    int collapsedOffset;
    private final b.c dragCallback;
    private boolean draggable;
    float elevation;
    private int expandHalfwayActionId;
    int expandedOffset;
    private boolean fitToContents;
    int fitToContentsOffset;
    private int gestureInsetBottom;
    private boolean gestureInsetBottomIgnored;
    int halfExpandedOffset;
    float halfExpandedRatio;
    boolean hideable;
    private boolean ignoreEvents;
    private Map<View, Integer> importantForAccessibilityMap;
    private int initialY;
    private int insetBottom;
    private int insetTop;
    private ValueAnimator interpolatorAnimator;
    private boolean isShapeExpanded;
    private int lastNestedScrollDy;
    int lastStableState;
    private boolean marginLeftSystemWindowInsets;
    private boolean marginRightSystemWindowInsets;
    private boolean marginTopSystemWindowInsets;
    private C10856g materialShapeDrawable;
    private int maxHeight;
    private int maxWidth;
    private float maximumVelocity;
    private boolean nestedScrolled;
    WeakReference<View> nestedScrollingChildRef;
    private boolean paddingBottomSystemWindowInsets;
    private boolean paddingLeftSystemWindowInsets;
    private boolean paddingRightSystemWindowInsets;
    private boolean paddingTopSystemWindowInsets;
    int parentHeight;
    int parentWidth;
    private int peekHeight;
    private boolean peekHeightAuto;
    private int peekHeightGestureInsetBuffer;
    private int peekHeightMin;
    private int saveFlags;
    private k shapeAppearanceModelDefault;
    private boolean skipCollapsed;
    int state;
    private final BottomSheetBehavior<V>.h stateSettlingTracker;
    boolean touchingScrollingChild;
    private boolean updateImportantForAccessibilityOnSiblings;
    private VelocityTracker velocityTracker;
    P2.b viewDragHelper;
    WeakReference<V> viewRef;

    /* loaded from: classes9.dex */
    final class a implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ View f58027a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ int f58028b;

        a(View view, int i11) {
            this.f58027a = view;
            this.f58028b = i11;
        }

        @Override // java.lang.Runnable
        public final void run() {
            BottomSheetBehavior.this.startSettling(this.f58027a, this.f58028b, false);
        }
    }

    final class b implements ValueAnimator.AnimatorUpdateListener {
        b() {
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public final void onAnimationUpdate(@NonNull ValueAnimator valueAnimator) {
            float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
            BottomSheetBehavior bottomSheetBehavior = BottomSheetBehavior.this;
            if (bottomSheetBehavior.materialShapeDrawable != null) {
                bottomSheetBehavior.materialShapeDrawable.C(floatValue);
            }
        }
    }

    /* loaded from: classes9.dex */
    final class c implements C9621p.c {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ boolean f58031a;

        c(boolean z11) {
            this.f58031a = z11;
        }

        /* JADX WARN: Removed duplicated region for block: B:32:0x008d  */
        /* JADX WARN: Removed duplicated region for block: B:35:0x009b  */
        @Override // s7.C9621p.c
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final C5353y0 a(View view, C5353y0 c5353y0, C9621p.d dVar) {
            boolean z11;
            boolean z12;
            androidx.core.graphics.d f7 = c5353y0.f(7);
            androidx.core.graphics.d f11 = c5353y0.f(32);
            int i11 = f7.f42127b;
            BottomSheetBehavior bottomSheetBehavior = BottomSheetBehavior.this;
            bottomSheetBehavior.insetTop = i11;
            boolean d11 = C9621p.d(view);
            int paddingBottom = view.getPaddingBottom();
            int paddingLeft = view.getPaddingLeft();
            int paddingRight = view.getPaddingRight();
            if (bottomSheetBehavior.paddingBottomSystemWindowInsets) {
                bottomSheetBehavior.insetBottom = c5353y0.i();
                paddingBottom = dVar.f98350d + bottomSheetBehavior.insetBottom;
            }
            boolean z13 = bottomSheetBehavior.paddingLeftSystemWindowInsets;
            int i12 = f7.f42126a;
            if (z13) {
                paddingLeft = (d11 ? dVar.f98349c : dVar.f98347a) + i12;
            }
            boolean z14 = bottomSheetBehavior.paddingRightSystemWindowInsets;
            int i13 = f7.f42128c;
            if (z14) {
                paddingRight = (d11 ? dVar.f98347a : dVar.f98349c) + i13;
            }
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
            boolean z15 = true;
            if (!bottomSheetBehavior.marginLeftSystemWindowInsets || marginLayoutParams.leftMargin == i12) {
                z11 = false;
            } else {
                marginLayoutParams.leftMargin = i12;
                z11 = true;
            }
            if (bottomSheetBehavior.marginRightSystemWindowInsets && marginLayoutParams.rightMargin != i13) {
                marginLayoutParams.rightMargin = i13;
                z11 = true;
            }
            if (bottomSheetBehavior.marginTopSystemWindowInsets) {
                int i14 = marginLayoutParams.topMargin;
                int i15 = f7.f42127b;
                if (i14 != i15) {
                    marginLayoutParams.topMargin = i15;
                    if (z15) {
                        view.setLayoutParams(marginLayoutParams);
                    }
                    view.setPadding(paddingLeft, view.getPaddingTop(), paddingRight, paddingBottom);
                    z12 = this.f58031a;
                    if (z12) {
                        bottomSheetBehavior.gestureInsetBottom = f11.f42129d;
                    }
                    if (bottomSheetBehavior.paddingBottomSystemWindowInsets && !z12) {
                        return c5353y0;
                    }
                    bottomSheetBehavior.updatePeekHeight(false);
                    return c5353y0;
                }
            }
            z15 = z11;
            if (z15) {
            }
            view.setPadding(paddingLeft, view.getPaddingTop(), paddingRight, paddingBottom);
            z12 = this.f58031a;
            if (z12) {
            }
            if (bottomSheetBehavior.paddingBottomSystemWindowInsets) {
            }
            bottomSheetBehavior.updatePeekHeight(false);
            return c5353y0;
        }
    }

    final class d extends b.c {

        /* renamed from: a, reason: collision with root package name */
        private long f58033a;

        d() {
        }

        @Override // P2.b.c
        public final int clampViewPositionHorizontal(@NonNull View view, int i11, int i12) {
            return view.getLeft();
        }

        @Override // P2.b.c
        public final int clampViewPositionVertical(@NonNull View view, int i11, int i12) {
            BottomSheetBehavior bottomSheetBehavior = BottomSheetBehavior.this;
            return com.google.common.primitives.e.b(i11, bottomSheetBehavior.getExpandedOffset(), bottomSheetBehavior.hideable ? bottomSheetBehavior.parentHeight : bottomSheetBehavior.collapsedOffset);
        }

        @Override // P2.b.c
        public final int getViewVerticalDragRange(@NonNull View view) {
            BottomSheetBehavior bottomSheetBehavior = BottomSheetBehavior.this;
            return bottomSheetBehavior.hideable ? bottomSheetBehavior.parentHeight : bottomSheetBehavior.collapsedOffset;
        }

        @Override // P2.b.c
        public final void onViewDragStateChanged(int i11) {
            if (i11 == 1) {
                BottomSheetBehavior bottomSheetBehavior = BottomSheetBehavior.this;
                if (bottomSheetBehavior.draggable) {
                    bottomSheetBehavior.setStateInternal(1);
                }
            }
        }

        @Override // P2.b.c
        public final void onViewPositionChanged(@NonNull View view, int i11, int i12, int i13, int i14) {
            BottomSheetBehavior.this.dispatchOnSlide(i12);
        }

        /* JADX WARN: Code restructure failed: missing block: B:12:0x0030, code lost:
        
            if (r5.shouldExpandOnUpwardDrag(r0, (r10 * 100.0f) / r5.parentHeight) != false) goto L6;
         */
        /* JADX WARN: Code restructure failed: missing block: B:15:0x0035, code lost:
        
            if (r10 > r5.halfExpandedOffset) goto L63;
         */
        /* JADX WARN: Code restructure failed: missing block: B:30:0x0086, code lost:
        
            if (java.lang.Math.abs(r9.getTop() - r5.getExpandedOffset()) < java.lang.Math.abs(r9.getTop() - r5.halfExpandedOffset)) goto L6;
         */
        /* JADX WARN: Code restructure failed: missing block: B:40:0x00bb, code lost:
        
            if (r5.shouldSkipHalfExpandedStateWhenDragging() == false) goto L63;
         */
        /* JADX WARN: Code restructure failed: missing block: B:44:0x00d7, code lost:
        
            if (java.lang.Math.abs(r10 - r5.fitToContentsOffset) < java.lang.Math.abs(r10 - r5.collapsedOffset)) goto L6;
         */
        /* JADX WARN: Code restructure failed: missing block: B:50:0x00ef, code lost:
        
            if (r5.shouldSkipHalfExpandedStateWhenDragging() != false) goto L39;
         */
        /* JADX WARN: Code restructure failed: missing block: B:54:0x0105, code lost:
        
            if (r5.shouldSkipHalfExpandedStateWhenDragging() == false) goto L63;
         */
        @Override // P2.b.c
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final void onViewReleased(@NonNull View view, float f7, float f11) {
            int i11 = 6;
            BottomSheetBehavior bottomSheetBehavior = BottomSheetBehavior.this;
            if (f11 < 0.0f) {
                if (!bottomSheetBehavior.fitToContents) {
                    int top = view.getTop();
                    long currentTimeMillis = System.currentTimeMillis() - this.f58033a;
                    if (bottomSheetBehavior.shouldSkipHalfExpandedStateWhenDragging()) {
                    }
                }
                i11 = 3;
            } else if (bottomSheetBehavior.hideable && bottomSheetBehavior.shouldHide(view, f11)) {
                if (Math.abs(f7) >= Math.abs(f11) || f11 <= 500.0f) {
                    if (view.getTop() <= (bottomSheetBehavior.getExpandedOffset() + bottomSheetBehavior.parentHeight) / 2) {
                        if (!bottomSheetBehavior.fitToContents) {
                        }
                        i11 = 3;
                    }
                }
                i11 = 5;
            } else if (f11 == 0.0f || Math.abs(f7) > Math.abs(f11)) {
                int top2 = view.getTop();
                if (!bottomSheetBehavior.fitToContents) {
                    int i12 = bottomSheetBehavior.halfExpandedOffset;
                    if (top2 < i12) {
                        if (top2 >= Math.abs(top2 - bottomSheetBehavior.collapsedOffset)) {
                        }
                        i11 = 3;
                    } else {
                        if (Math.abs(top2 - i12) < Math.abs(top2 - bottomSheetBehavior.collapsedOffset)) {
                        }
                        i11 = 4;
                    }
                }
            } else {
                if (!bottomSheetBehavior.fitToContents) {
                    int top3 = view.getTop();
                    if (Math.abs(top3 - bottomSheetBehavior.halfExpandedOffset) < Math.abs(top3 - bottomSheetBehavior.collapsedOffset)) {
                    }
                }
                i11 = 4;
            }
            bottomSheetBehavior.startSettling(view, i11, bottomSheetBehavior.shouldSkipSmoothAnimation());
        }

        @Override // P2.b.c
        public final boolean tryCaptureView(@NonNull View view, int i11) {
            BottomSheetBehavior bottomSheetBehavior = BottomSheetBehavior.this;
            int i12 = bottomSheetBehavior.state;
            if (i12 == 1 || bottomSheetBehavior.touchingScrollingChild) {
                return false;
            }
            if (i12 == 3 && bottomSheetBehavior.activePointerId == i11) {
                WeakReference<View> weakReference = bottomSheetBehavior.nestedScrollingChildRef;
                View view2 = weakReference != null ? weakReference.get() : null;
                if (view2 != null && view2.canScrollVertically(-1)) {
                    return false;
                }
            }
            this.f58033a = System.currentTimeMillis();
            WeakReference<V> weakReference2 = bottomSheetBehavior.viewRef;
            return weakReference2 != null && weakReference2.get() == view;
        }
    }

    final class e implements s {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ int f58035a;

        e(int i11) {
            this.f58035a = i11;
        }

        @Override // y2.s
        public final boolean a(@NonNull View view) {
            BottomSheetBehavior.this.setState(this.f58035a);
            return true;
        }
    }

    public static abstract class f {
        void onLayout(@NonNull View view) {
        }

        public abstract void onSlide(@NonNull View view, float f7);

        public abstract void onStateChanged(@NonNull View view, int i11);
    }

    private class h {

        /* renamed from: a, reason: collision with root package name */
        private int f58042a;

        /* renamed from: b, reason: collision with root package name */
        private boolean f58043b;

        /* renamed from: c, reason: collision with root package name */
        private final Runnable f58044c = new a();

        final class a implements Runnable {
            a() {
            }

            @Override // java.lang.Runnable
            public final void run() {
                h hVar = h.this;
                hVar.f58043b = false;
                BottomSheetBehavior bottomSheetBehavior = BottomSheetBehavior.this;
                P2.b bVar = bottomSheetBehavior.viewDragHelper;
                if (bVar != null && bVar.f()) {
                    hVar.c(hVar.f58042a);
                } else if (bottomSheetBehavior.state == 2) {
                    bottomSheetBehavior.setStateInternal(hVar.f58042a);
                }
            }
        }

        h() {
        }

        final void c(int i11) {
            BottomSheetBehavior bottomSheetBehavior = BottomSheetBehavior.this;
            WeakReference<V> weakReference = bottomSheetBehavior.viewRef;
            if (weakReference == null || weakReference.get() == null) {
                return;
            }
            this.f58042a = i11;
            if (this.f58043b) {
                return;
            }
            V v11 = bottomSheetBehavior.viewRef.get();
            Runnable runnable = this.f58044c;
            int i12 = Y.f42258g;
            v11.postOnAnimation(runnable);
            this.f58043b = true;
        }
    }

    public BottomSheetBehavior() {
        this.saveFlags = 0;
        this.fitToContents = true;
        this.updateImportantForAccessibilityOnSiblings = false;
        this.maxWidth = -1;
        this.maxHeight = -1;
        this.stateSettlingTracker = new h();
        this.halfExpandedRatio = 0.5f;
        this.elevation = -1.0f;
        this.draggable = true;
        this.state = 4;
        this.lastStableState = 4;
        this.callbacks = new ArrayList<>();
        this.expandHalfwayActionId = -1;
        this.dragCallback = new d();
    }

    private int addAccessibilityActionForState(V v11, int i11, int i12) {
        return Y.a(v11, v11.getResources().getString(i11), createAccessibilityViewCommandForState(i12));
    }

    private void calculateCollapsedOffset() {
        int calculatePeekHeight = calculatePeekHeight();
        if (this.fitToContents) {
            this.collapsedOffset = Math.max(this.parentHeight - calculatePeekHeight, this.fitToContentsOffset);
        } else {
            this.collapsedOffset = this.parentHeight - calculatePeekHeight;
        }
    }

    private void calculateHalfExpandedOffset() {
        this.halfExpandedOffset = (int) ((1.0f - this.halfExpandedRatio) * this.parentHeight);
    }

    private int calculatePeekHeight() {
        int i11;
        return this.peekHeightAuto ? Math.min(Math.max(this.peekHeightMin, this.parentHeight - ((this.parentWidth * 9) / 16)), this.childHeight) + this.insetBottom : (this.gestureInsetBottomIgnored || this.paddingBottomSystemWindowInsets || (i11 = this.gestureInsetBottom) <= 0) ? this.peekHeight + this.insetBottom : Math.max(this.peekHeight, i11 + this.peekHeightGestureInsetBuffer);
    }

    private s createAccessibilityViewCommandForState(int i11) {
        return new e(i11);
    }

    private void createMaterialShapeDrawableIfNeeded(@NonNull Context context) {
        if (this.shapeAppearanceModelDefault == null) {
            return;
        }
        C10856g c10856g = new C10856g(this.shapeAppearanceModelDefault);
        this.materialShapeDrawable = c10856g;
        c10856g.v(context);
        ColorStateList colorStateList = this.backgroundTint;
        if (colorStateList != null) {
            this.materialShapeDrawable.B(colorStateList);
            return;
        }
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(R.attr.colorBackground, typedValue, true);
        this.materialShapeDrawable.setTint(typedValue.data);
    }

    private void createShapeValueAnimator() {
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        this.interpolatorAnimator = ofFloat;
        ofFloat.setDuration(500L);
        this.interpolatorAnimator.addUpdateListener(new b());
    }

    @NonNull
    public static <V extends View> BottomSheetBehavior<V> from(@NonNull V v11) {
        ViewGroup.LayoutParams layoutParams = v11.getLayoutParams();
        if (!(layoutParams instanceof CoordinatorLayout.f)) {
            throw new IllegalArgumentException("The view is not a child of CoordinatorLayout");
        }
        CoordinatorLayout.c c11 = ((CoordinatorLayout.f) layoutParams).c();
        if (c11 instanceof BottomSheetBehavior) {
            return (BottomSheetBehavior) c11;
        }
        throw new IllegalArgumentException("The view is not associated with BottomSheetBehavior");
    }

    private int getChildMeasureSpec(int i11, int i12, int i13, int i14) {
        int childMeasureSpec = ViewGroup.getChildMeasureSpec(i11, i12, i14);
        if (i13 == -1) {
            return childMeasureSpec;
        }
        int mode = View.MeasureSpec.getMode(childMeasureSpec);
        int size = View.MeasureSpec.getSize(childMeasureSpec);
        if (mode == 1073741824) {
            return View.MeasureSpec.makeMeasureSpec(Math.min(size, i13), 1073741824);
        }
        if (size != 0) {
            i13 = Math.min(size, i13);
        }
        return View.MeasureSpec.makeMeasureSpec(i13, LinearLayoutManager.INVALID_OFFSET);
    }

    private int getTopOffsetForState(int i11) {
        if (i11 == 3) {
            return getExpandedOffset();
        }
        if (i11 == 4) {
            return this.collapsedOffset;
        }
        if (i11 == 5) {
            return this.parentHeight;
        }
        if (i11 == 6) {
            return this.halfExpandedOffset;
        }
        throw new IllegalArgumentException(Ej.b.a(i11, "Invalid state to get top offset: "));
    }

    private float getYVelocity() {
        VelocityTracker velocityTracker = this.velocityTracker;
        if (velocityTracker == null) {
            return 0.0f;
        }
        velocityTracker.computeCurrentVelocity(1000, this.maximumVelocity);
        return this.velocityTracker.getYVelocity(this.activePointerId);
    }

    private boolean isLayouting(V v11) {
        ViewParent parent = v11.getParent();
        if (parent == null || !parent.isLayoutRequested()) {
            return false;
        }
        int i11 = Y.f42258g;
        return v11.isAttachedToWindow();
    }

    private void replaceAccessibilityActionForState(V v11, q.a aVar, int i11) {
        Y.z(v11, aVar, createAccessibilityViewCommandForState(i11));
    }

    private void reset() {
        this.activePointerId = -1;
        VelocityTracker velocityTracker = this.velocityTracker;
        if (velocityTracker != null) {
            velocityTracker.recycle();
            this.velocityTracker = null;
        }
    }

    private void restoreOptionalState(@NonNull g gVar) {
        int i11 = this.saveFlags;
        if (i11 == 0) {
            return;
        }
        if (i11 == -1 || (i11 & 1) == 1) {
            this.peekHeight = gVar.f58038d;
        }
        if (i11 == -1 || (i11 & 2) == 2) {
            this.fitToContents = gVar.f58039e;
        }
        if (i11 == -1 || (i11 & 4) == 4) {
            this.hideable = gVar.f58040f;
        }
        if (i11 == -1 || (i11 & 8) == 8) {
            this.skipCollapsed = gVar.f58041g;
        }
    }

    private void runAfterLayout(V v11, Runnable runnable) {
        if (isLayouting(v11)) {
            v11.post(runnable);
        } else {
            runnable.run();
        }
    }

    private void setWindowInsetsListener(@NonNull View view) {
        boolean z11 = (Build.VERSION.SDK_INT < 29 || isGestureInsetBottomIgnored() || this.peekHeightAuto) ? false : true;
        if (this.paddingBottomSystemWindowInsets || this.paddingLeftSystemWindowInsets || this.paddingRightSystemWindowInsets || this.marginLeftSystemWindowInsets || this.marginRightSystemWindowInsets || this.marginTopSystemWindowInsets || z11) {
            C9621p.a(view, new c(z11));
        }
    }

    private boolean shouldHandleDraggingWithHelper() {
        if (this.viewDragHelper != null) {
            return this.draggable || this.state == 1;
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void startSettling(View view, int i11, boolean z11) {
        int topOffsetForState = getTopOffsetForState(i11);
        P2.b bVar = this.viewDragHelper;
        if (bVar == null || (!z11 ? bVar.t(view, view.getLeft(), topOffsetForState) : bVar.r(view.getLeft(), topOffsetForState))) {
            setStateInternal(i11);
            return;
        }
        setStateInternal(2);
        updateDrawableForTargetState(i11);
        this.stateSettlingTracker.c(i11);
    }

    private void updateAccessibilityActions() {
        V v11;
        WeakReference<V> weakReference = this.viewRef;
        if (weakReference == null || (v11 = weakReference.get()) == null) {
            return;
        }
        Y.x(524288, v11);
        Y.x(262144, v11);
        Y.x(1048576, v11);
        int i11 = this.expandHalfwayActionId;
        if (i11 != -1) {
            Y.x(i11, v11);
        }
        if (!this.fitToContents && this.state != 6) {
            this.expandHalfwayActionId = addAccessibilityActionForState(v11, ru.ozon.app.android.R.string.bottomsheet_action_expand_halfway, 6);
        }
        if (this.hideable && this.state != 5) {
            replaceAccessibilityActionForState(v11, q.a.f105949l, 5);
        }
        int i12 = this.state;
        if (i12 == 3) {
            replaceAccessibilityActionForState(v11, q.a.f105948k, this.fitToContents ? 4 : 6);
            return;
        }
        if (i12 == 4) {
            replaceAccessibilityActionForState(v11, q.a.f105947j, this.fitToContents ? 3 : 6);
        } else {
            if (i12 != 6) {
                return;
            }
            replaceAccessibilityActionForState(v11, q.a.f105948k, 4);
            replaceAccessibilityActionForState(v11, q.a.f105947j, 3);
        }
    }

    private void updateDrawableForTargetState(int i11) {
        ValueAnimator valueAnimator;
        if (i11 == 2) {
            return;
        }
        boolean z11 = i11 == 3;
        if (this.isShapeExpanded != z11) {
            this.isShapeExpanded = z11;
            if (this.materialShapeDrawable == null || (valueAnimator = this.interpolatorAnimator) == null) {
                return;
            }
            if (valueAnimator.isRunning()) {
                this.interpolatorAnimator.reverse();
                return;
            }
            float f7 = z11 ? 0.0f : 1.0f;
            this.interpolatorAnimator.setFloatValues(1.0f - f7, f7);
            this.interpolatorAnimator.start();
        }
    }

    private void updateImportantForAccessibility(boolean z11) {
        Map<View, Integer> map;
        WeakReference<V> weakReference = this.viewRef;
        if (weakReference == null) {
            return;
        }
        ViewParent parent = weakReference.get().getParent();
        if (parent instanceof CoordinatorLayout) {
            CoordinatorLayout coordinatorLayout = (CoordinatorLayout) parent;
            int childCount = coordinatorLayout.getChildCount();
            if (z11) {
                if (this.importantForAccessibilityMap != null) {
                    return;
                } else {
                    this.importantForAccessibilityMap = new HashMap(childCount);
                }
            }
            for (int i11 = 0; i11 < childCount; i11++) {
                View childAt = coordinatorLayout.getChildAt(i11);
                if (childAt != this.viewRef.get()) {
                    if (z11) {
                        this.importantForAccessibilityMap.put(childAt, Integer.valueOf(childAt.getImportantForAccessibility()));
                        if (this.updateImportantForAccessibilityOnSiblings) {
                            int i12 = Y.f42258g;
                            childAt.setImportantForAccessibility(4);
                        }
                    } else if (this.updateImportantForAccessibilityOnSiblings && (map = this.importantForAccessibilityMap) != null && map.containsKey(childAt)) {
                        int intValue = this.importantForAccessibilityMap.get(childAt).intValue();
                        int i13 = Y.f42258g;
                        childAt.setImportantForAccessibility(intValue);
                    }
                }
            }
            if (!z11) {
                this.importantForAccessibilityMap = null;
            } else if (this.updateImportantForAccessibilityOnSiblings) {
                this.viewRef.get().sendAccessibilityEvent(8);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void updatePeekHeight(boolean z11) {
        V v11;
        if (this.viewRef != null) {
            calculateCollapsedOffset();
            if (this.state != 4 || (v11 = this.viewRef.get()) == null) {
                return;
            }
            if (z11) {
                setState(4);
            } else {
                v11.requestLayout();
            }
        }
    }

    public void addBottomSheetCallback(@NonNull f fVar) {
        if (this.callbacks.contains(fVar)) {
            return;
        }
        this.callbacks.add(fVar);
    }

    void dispatchOnSlide(int i11) {
        float f7;
        float f11;
        V v11 = this.viewRef.get();
        if (v11 == null || this.callbacks.isEmpty()) {
            return;
        }
        int i12 = this.collapsedOffset;
        if (i11 > i12 || i12 == getExpandedOffset()) {
            int i13 = this.collapsedOffset;
            f7 = i13 - i11;
            f11 = this.parentHeight - i13;
        } else {
            int i14 = this.collapsedOffset;
            f7 = i14 - i11;
            f11 = i14 - getExpandedOffset();
        }
        float f12 = f7 / f11;
        for (int i15 = 0; i15 < this.callbacks.size(); i15++) {
            this.callbacks.get(i15).onSlide(v11, f12);
        }
    }

    View findScrollingChild(View view) {
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

    public int getExpandedOffset() {
        if (this.fitToContents) {
            return this.fitToContentsOffset;
        }
        return Math.max(this.expandedOffset, this.paddingTopSystemWindowInsets ? 0 : this.insetTop);
    }

    public float getHalfExpandedRatio() {
        return this.halfExpandedRatio;
    }

    C10856g getMaterialShapeDrawable() {
        return this.materialShapeDrawable;
    }

    public int getPeekHeight() {
        if (this.peekHeightAuto) {
            return -1;
        }
        return this.peekHeight;
    }

    public int getState() {
        return this.state;
    }

    public boolean isDraggable() {
        return this.draggable;
    }

    public boolean isGestureInsetBottomIgnored() {
        return this.gestureInsetBottomIgnored;
    }

    public boolean isHideable() {
        return this.hideable;
    }

    public boolean isNestedScrollingCheckEnabled() {
        return true;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public void onAttachedToLayoutParams(@NonNull CoordinatorLayout.f fVar) {
        super.onAttachedToLayoutParams(fVar);
        this.viewRef = null;
        this.viewDragHelper = null;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public void onDetachedFromLayoutParams() {
        super.onDetachedFromLayoutParams();
        this.viewRef = null;
        this.viewDragHelper = null;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public boolean onInterceptTouchEvent(@NonNull CoordinatorLayout coordinatorLayout, @NonNull V v11, @NonNull MotionEvent motionEvent) {
        P2.b bVar;
        if (!v11.isShown() || !this.draggable) {
            this.ignoreEvents = true;
            return false;
        }
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            reset();
        }
        if (this.velocityTracker == null) {
            this.velocityTracker = VelocityTracker.obtain();
        }
        this.velocityTracker.addMovement(motionEvent);
        if (actionMasked == 0) {
            int x11 = (int) motionEvent.getX();
            this.initialY = (int) motionEvent.getY();
            if (this.state != 2) {
                WeakReference<View> weakReference = this.nestedScrollingChildRef;
                View view = weakReference != null ? weakReference.get() : null;
                if (view != null && coordinatorLayout.isPointInChildBounds(view, x11, this.initialY)) {
                    this.activePointerId = motionEvent.getPointerId(motionEvent.getActionIndex());
                    this.touchingScrollingChild = true;
                }
            }
            this.ignoreEvents = this.activePointerId == -1 && !coordinatorLayout.isPointInChildBounds(v11, x11, this.initialY);
        } else if (actionMasked == 1 || actionMasked == 3) {
            this.touchingScrollingChild = false;
            this.activePointerId = -1;
            if (this.ignoreEvents) {
                this.ignoreEvents = false;
                return false;
            }
        }
        if (!this.ignoreEvents && (bVar = this.viewDragHelper) != null && bVar.s(motionEvent)) {
            return true;
        }
        WeakReference<View> weakReference2 = this.nestedScrollingChildRef;
        View view2 = weakReference2 != null ? weakReference2.get() : null;
        return (actionMasked != 2 || view2 == null || this.ignoreEvents || this.state == 1 || coordinatorLayout.isPointInChildBounds(view2, (int) motionEvent.getX(), (int) motionEvent.getY()) || this.viewDragHelper == null || Math.abs(((float) this.initialY) - motionEvent.getY()) <= ((float) this.viewDragHelper.k())) ? false : true;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public boolean onLayoutChild(@NonNull CoordinatorLayout coordinatorLayout, @NonNull V v11, int i11) {
        int i12 = Y.f42258g;
        if (coordinatorLayout.getFitsSystemWindows() && !v11.getFitsSystemWindows()) {
            v11.setFitsSystemWindows(true);
        }
        if (this.viewRef == null) {
            this.peekHeightMin = coordinatorLayout.getResources().getDimensionPixelSize(ru.ozon.app.android.R.dimen.design_bottom_sheet_peek_height_min);
            setWindowInsetsListener(v11);
            this.viewRef = new WeakReference<>(v11);
            C10856g c10856g = this.materialShapeDrawable;
            if (c10856g != null) {
                v11.setBackground(c10856g);
                C10856g c10856g2 = this.materialShapeDrawable;
                float f7 = this.elevation;
                if (f7 == -1.0f) {
                    f7 = Y.k(v11);
                }
                c10856g2.A(f7);
                boolean z11 = this.state == 3;
                this.isShapeExpanded = z11;
                this.materialShapeDrawable.C(z11 ? 0.0f : 1.0f);
            } else {
                ColorStateList colorStateList = this.backgroundTint;
                if (colorStateList != null) {
                    Y.F(v11, colorStateList);
                }
            }
            updateAccessibilityActions();
            if (v11.getImportantForAccessibility() == 0) {
                v11.setImportantForAccessibility(1);
            }
        }
        if (this.viewDragHelper == null) {
            this.viewDragHelper = P2.b.g(coordinatorLayout, this.dragCallback);
        }
        int top = v11.getTop();
        coordinatorLayout.onLayoutChild(v11, i11);
        this.parentWidth = coordinatorLayout.getWidth();
        this.parentHeight = coordinatorLayout.getHeight();
        int height = v11.getHeight();
        this.childHeight = height;
        int i13 = this.parentHeight;
        int i14 = i13 - height;
        int i15 = this.insetTop;
        if (i14 < i15) {
            if (this.paddingTopSystemWindowInsets) {
                this.childHeight = i13;
            } else {
                this.childHeight = i13 - i15;
            }
        }
        this.fitToContentsOffset = Math.max(0, i13 - this.childHeight);
        calculateHalfExpandedOffset();
        calculateCollapsedOffset();
        int i16 = this.state;
        if (i16 == 3) {
            v11.offsetTopAndBottom(getExpandedOffset());
        } else if (i16 == 6) {
            v11.offsetTopAndBottom(this.halfExpandedOffset);
        } else if (this.hideable && i16 == 5) {
            v11.offsetTopAndBottom(this.parentHeight);
        } else if (i16 == 4) {
            v11.offsetTopAndBottom(this.collapsedOffset);
        } else if (i16 == 1 || i16 == 2) {
            v11.offsetTopAndBottom(top - v11.getTop());
        }
        this.nestedScrollingChildRef = new WeakReference<>(findScrollingChild(v11));
        for (int i17 = 0; i17 < this.callbacks.size(); i17++) {
            this.callbacks.get(i17).onLayout(v11);
        }
        return true;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public boolean onMeasureChild(@NonNull CoordinatorLayout coordinatorLayout, @NonNull V v11, int i11, int i12, int i13, int i14) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) v11.getLayoutParams();
        v11.measure(getChildMeasureSpec(i11, coordinatorLayout.getPaddingRight() + coordinatorLayout.getPaddingLeft() + marginLayoutParams.leftMargin + marginLayoutParams.rightMargin + i12, this.maxWidth, marginLayoutParams.width), getChildMeasureSpec(i13, coordinatorLayout.getPaddingBottom() + coordinatorLayout.getPaddingTop() + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin + i14, this.maxHeight, marginLayoutParams.height));
        return true;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public boolean onNestedPreFling(@NonNull CoordinatorLayout coordinatorLayout, @NonNull V v11, @NonNull View view, float f7, float f11) {
        WeakReference<View> weakReference;
        return isNestedScrollingCheckEnabled() && (weakReference = this.nestedScrollingChildRef) != null && view == weakReference.get() && (this.state != 3 || super.onNestedPreFling(coordinatorLayout, v11, view, f7, f11));
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public void onNestedPreScroll(@NonNull CoordinatorLayout coordinatorLayout, @NonNull V v11, @NonNull View view, int i11, int i12, @NonNull int[] iArr, int i13) {
        if (i13 == 1) {
            return;
        }
        WeakReference<View> weakReference = this.nestedScrollingChildRef;
        View view2 = weakReference != null ? weakReference.get() : null;
        if (!isNestedScrollingCheckEnabled() || view == view2) {
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
                    if (!this.draggable) {
                        return;
                    }
                    iArr[1] = i12;
                    int i17 = Y.f42258g;
                    v11.offsetTopAndBottom(-i12);
                    setStateInternal(1);
                }
            } else if (i12 < 0 && !view.canScrollVertically(-1)) {
                int i18 = this.collapsedOffset;
                if (i14 > i18 && !this.hideable) {
                    int i19 = top - i18;
                    iArr[1] = i19;
                    int i21 = -i19;
                    int i22 = Y.f42258g;
                    v11.offsetTopAndBottom(i21);
                    setStateInternal(4);
                } else {
                    if (!this.draggable) {
                        return;
                    }
                    iArr[1] = i12;
                    int i23 = Y.f42258g;
                    v11.offsetTopAndBottom(-i12);
                    setStateInternal(1);
                }
            }
            dispatchOnSlide(v11.getTop());
            this.lastNestedScrollDy = i12;
            this.nestedScrolled = true;
        }
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public void onNestedScroll(@NonNull CoordinatorLayout coordinatorLayout, @NonNull V v11, @NonNull View view, int i11, int i12, int i13, int i14, int i15, @NonNull int[] iArr) {
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public void onRestoreInstanceState(@NonNull CoordinatorLayout coordinatorLayout, @NonNull V v11, @NonNull Parcelable parcelable) {
        g gVar = (g) parcelable;
        super.onRestoreInstanceState(coordinatorLayout, v11, gVar.a());
        restoreOptionalState(gVar);
        int i11 = gVar.f58037c;
        if (i11 == 1 || i11 == 2) {
            this.state = 4;
            this.lastStableState = 4;
        } else {
            this.state = i11;
            this.lastStableState = i11;
        }
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    @NonNull
    public Parcelable onSaveInstanceState(@NonNull CoordinatorLayout coordinatorLayout, @NonNull V v11) {
        return new g(super.onSaveInstanceState(coordinatorLayout, v11), (BottomSheetBehavior<?>) this);
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public boolean onStartNestedScroll(@NonNull CoordinatorLayout coordinatorLayout, @NonNull V v11, @NonNull View view, @NonNull View view2, int i11, int i12) {
        this.lastNestedScrollDy = 0;
        this.nestedScrolled = false;
        return (i11 & 2) != 0;
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x0035, code lost:
    
        if (r4.getTop() <= r2.halfExpandedOffset) goto L52;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x00a9, code lost:
    
        r0 = 6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x0065, code lost:
    
        if (java.lang.Math.abs(r3 - r2.fitToContentsOffset) < java.lang.Math.abs(r3 - r2.collapsedOffset)) goto L52;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x007b, code lost:
    
        if (shouldSkipHalfExpandedStateWhenDragging() != false) goto L48;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x008b, code lost:
    
        if (java.lang.Math.abs(r3 - r1) < java.lang.Math.abs(r3 - r2.collapsedOffset)) goto L51;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x00a7, code lost:
    
        if (java.lang.Math.abs(r3 - r2.halfExpandedOffset) < java.lang.Math.abs(r3 - r2.collapsedOffset)) goto L51;
     */
    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void onStopNestedScroll(@NonNull CoordinatorLayout coordinatorLayout, @NonNull V v11, @NonNull View view, int i11) {
        WeakReference<View> weakReference;
        int i12 = 3;
        if (v11.getTop() == getExpandedOffset()) {
            setStateInternal(3);
            return;
        }
        if (!isNestedScrollingCheckEnabled() || ((weakReference = this.nestedScrollingChildRef) != null && view == weakReference.get() && this.nestedScrolled)) {
            if (this.lastNestedScrollDy > 0) {
                if (!this.fitToContents) {
                }
                startSettling(v11, i12, false);
                this.nestedScrolled = false;
            }
            if (this.hideable && shouldHide(v11, getYVelocity())) {
                i12 = 5;
            } else if (this.lastNestedScrollDy == 0) {
                int top = v11.getTop();
                if (!this.fitToContents) {
                    int i13 = this.halfExpandedOffset;
                    if (top < i13) {
                        if (top >= Math.abs(top - this.collapsedOffset)) {
                        }
                    }
                }
            } else {
                if (!this.fitToContents) {
                    int top2 = v11.getTop();
                }
                i12 = 4;
            }
            startSettling(v11, i12, false);
            this.nestedScrolled = false;
        }
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public boolean onTouchEvent(@NonNull CoordinatorLayout coordinatorLayout, @NonNull V v11, @NonNull MotionEvent motionEvent) {
        if (!v11.isShown()) {
            return false;
        }
        int actionMasked = motionEvent.getActionMasked();
        if (this.state == 1 && actionMasked == 0) {
            return true;
        }
        if (shouldHandleDraggingWithHelper()) {
            this.viewDragHelper.m(motionEvent);
        }
        if (actionMasked == 0) {
            reset();
        }
        if (this.velocityTracker == null) {
            this.velocityTracker = VelocityTracker.obtain();
        }
        this.velocityTracker.addMovement(motionEvent);
        if (shouldHandleDraggingWithHelper() && actionMasked == 2 && !this.ignoreEvents && Math.abs(this.initialY - motionEvent.getY()) > this.viewDragHelper.k()) {
            this.viewDragHelper.b(motionEvent.getPointerId(motionEvent.getActionIndex()), v11);
        }
        return !this.ignoreEvents;
    }

    public void removeBottomSheetCallback(@NonNull f fVar) {
        this.callbacks.remove(fVar);
    }

    public void setDraggable(boolean z11) {
        this.draggable = z11;
    }

    public void setExpandedOffset(int i11) {
        if (i11 < 0) {
            throw new IllegalArgumentException("offset must be greater than or equal to 0");
        }
        this.expandedOffset = i11;
    }

    public void setFitToContents(boolean z11) {
        if (this.fitToContents == z11) {
            return;
        }
        this.fitToContents = z11;
        if (this.viewRef != null) {
            calculateCollapsedOffset();
        }
        setStateInternal((this.fitToContents && this.state == 6) ? 3 : this.state);
        updateAccessibilityActions();
    }

    public void setGestureInsetBottomIgnored(boolean z11) {
        this.gestureInsetBottomIgnored = z11;
    }

    public void setHalfExpandedRatio(float f7) {
        if (f7 <= 0.0f || f7 >= 1.0f) {
            throw new IllegalArgumentException("ratio must be a float value between 0 and 1");
        }
        this.halfExpandedRatio = f7;
        if (this.viewRef != null) {
            calculateHalfExpandedOffset();
        }
    }

    public void setHideable(boolean z11) {
        if (this.hideable != z11) {
            this.hideable = z11;
            if (!z11 && this.state == 5) {
                setState(4);
            }
            updateAccessibilityActions();
        }
    }

    public void setMaxHeight(int i11) {
        this.maxHeight = i11;
    }

    public void setMaxWidth(int i11) {
        this.maxWidth = i11;
    }

    public void setPeekHeight(int i11) {
        setPeekHeight(i11, false);
    }

    public void setSaveFlags(int i11) {
        this.saveFlags = i11;
    }

    public void setSkipCollapsed(boolean z11) {
        this.skipCollapsed = z11;
    }

    public void setState(int i11) {
        if (i11 == 1 || i11 == 2) {
            throw new IllegalArgumentException(o0.c(new StringBuilder("STATE_"), i11 == 1 ? "DRAGGING" : "SETTLING", " should not be set externally."));
        }
        if (!this.hideable && i11 == 5) {
            Log.w("BottomSheetBehavior", "Cannot set state: " + i11);
            return;
        }
        int i12 = (i11 == 6 && this.fitToContents && getTopOffsetForState(i11) <= this.fitToContentsOffset) ? 3 : i11;
        WeakReference<V> weakReference = this.viewRef;
        if (weakReference == null || weakReference.get() == null) {
            setStateInternal(i11);
        } else {
            V v11 = this.viewRef.get();
            runAfterLayout(v11, new a(v11, i12));
        }
    }

    void setStateInternal(int i11) {
        V v11;
        if (this.state == i11) {
            return;
        }
        this.state = i11;
        if (i11 == 4 || i11 == 3 || i11 == 6 || (this.hideable && i11 == 5)) {
            this.lastStableState = i11;
        }
        WeakReference<V> weakReference = this.viewRef;
        if (weakReference == null || (v11 = weakReference.get()) == null) {
            return;
        }
        if (i11 == 3) {
            updateImportantForAccessibility(true);
        } else if (i11 == 6 || i11 == 5 || i11 == 4) {
            updateImportantForAccessibility(false);
        }
        updateDrawableForTargetState(i11);
        for (int i12 = 0; i12 < this.callbacks.size(); i12++) {
            this.callbacks.get(i12).onStateChanged(v11, i11);
        }
        updateAccessibilityActions();
    }

    public boolean shouldExpandOnUpwardDrag(long j11, float f7) {
        return false;
    }

    boolean shouldHide(@NonNull View view, float f7) {
        if (this.skipCollapsed) {
            return true;
        }
        if (view.getTop() < this.collapsedOffset) {
            return false;
        }
        return Math.abs(((f7 * 0.1f) + ((float) view.getTop())) - ((float) this.collapsedOffset)) / ((float) calculatePeekHeight()) > 0.5f;
    }

    public boolean shouldSkipHalfExpandedStateWhenDragging() {
        return false;
    }

    public boolean shouldSkipSmoothAnimation() {
        return true;
    }

    public final void setPeekHeight(int i11, boolean z11) {
        if (i11 == -1) {
            if (this.peekHeightAuto) {
                return;
            } else {
                this.peekHeightAuto = true;
            }
        } else {
            if (!this.peekHeightAuto && this.peekHeight == i11) {
                return;
            }
            this.peekHeightAuto = false;
            this.peekHeight = Math.max(0, i11);
        }
        updatePeekHeight(z11);
    }

    /* loaded from: classes9.dex */
    protected static class g extends O2.a {
        public static final Parcelable.Creator<g> CREATOR = new a();

        /* renamed from: c, reason: collision with root package name */
        final int f58037c;

        /* renamed from: d, reason: collision with root package name */
        int f58038d;

        /* renamed from: e, reason: collision with root package name */
        boolean f58039e;

        /* renamed from: f, reason: collision with root package name */
        boolean f58040f;

        /* renamed from: g, reason: collision with root package name */
        boolean f58041g;

        final class a implements Parcelable.ClassLoaderCreator<g> {
            @Override // android.os.Parcelable.ClassLoaderCreator
            @NonNull
            public final g createFromParcel(@NonNull Parcel parcel, ClassLoader classLoader) {
                return new g(parcel, classLoader);
            }

            @Override // android.os.Parcelable.Creator
            @NonNull
            public final Object[] newArray(int i11) {
                return new g[i11];
            }

            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(@NonNull Parcel parcel) {
                return new g(parcel, (ClassLoader) null);
            }
        }

        public g(@NonNull Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.f58037c = parcel.readInt();
            this.f58038d = parcel.readInt();
            this.f58039e = parcel.readInt() == 1;
            this.f58040f = parcel.readInt() == 1;
            this.f58041g = parcel.readInt() == 1;
        }

        @Override // O2.a, android.os.Parcelable
        public final void writeToParcel(@NonNull Parcel parcel, int i11) {
            super.writeToParcel(parcel, i11);
            parcel.writeInt(this.f58037c);
            parcel.writeInt(this.f58038d);
            parcel.writeInt(this.f58039e ? 1 : 0);
            parcel.writeInt(this.f58040f ? 1 : 0);
            parcel.writeInt(this.f58041g ? 1 : 0);
        }

        public g(Parcelable parcelable, @NonNull BottomSheetBehavior<?> bottomSheetBehavior) {
            super(parcelable);
            this.f58037c = bottomSheetBehavior.state;
            this.f58038d = ((BottomSheetBehavior) bottomSheetBehavior).peekHeight;
            this.f58039e = ((BottomSheetBehavior) bottomSheetBehavior).fitToContents;
            this.f58040f = bottomSheetBehavior.hideable;
            this.f58041g = ((BottomSheetBehavior) bottomSheetBehavior).skipCollapsed;
        }
    }

    public BottomSheetBehavior(@NonNull Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        int i11;
        this.saveFlags = 0;
        this.fitToContents = true;
        this.updateImportantForAccessibilityOnSiblings = false;
        this.maxWidth = -1;
        this.maxHeight = -1;
        this.stateSettlingTracker = new h();
        this.halfExpandedRatio = 0.5f;
        this.elevation = -1.0f;
        this.draggable = true;
        this.state = 4;
        this.lastStableState = 4;
        this.callbacks = new ArrayList<>();
        this.expandHalfwayActionId = -1;
        this.dragCallback = new d();
        this.peekHeightGestureInsetBuffer = context.getResources().getDimensionPixelSize(ru.ozon.app.android.R.dimen.mtrl_min_touch_target_size);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C7017a.f65939e);
        if (obtainStyledAttributes.hasValue(3)) {
            this.backgroundTint = v7.c.a(context, obtainStyledAttributes, 3);
        }
        if (obtainStyledAttributes.hasValue(20)) {
            this.shapeAppearanceModelDefault = k.c(context, attributeSet, ru.ozon.app.android.R.attr.bottomSheetStyle, DEF_STYLE_RES).a();
        }
        createMaterialShapeDrawableIfNeeded(context);
        createShapeValueAnimator();
        this.elevation = obtainStyledAttributes.getDimension(2, -1.0f);
        if (obtainStyledAttributes.hasValue(0)) {
            setMaxWidth(obtainStyledAttributes.getDimensionPixelSize(0, -1));
        }
        if (obtainStyledAttributes.hasValue(1)) {
            setMaxHeight(obtainStyledAttributes.getDimensionPixelSize(1, -1));
        }
        TypedValue peekValue = obtainStyledAttributes.peekValue(9);
        if (peekValue != null && (i11 = peekValue.data) == -1) {
            setPeekHeight(i11);
        } else {
            setPeekHeight(obtainStyledAttributes.getDimensionPixelSize(9, -1));
        }
        setHideable(obtainStyledAttributes.getBoolean(8, false));
        setGestureInsetBottomIgnored(obtainStyledAttributes.getBoolean(12, false));
        setFitToContents(obtainStyledAttributes.getBoolean(6, true));
        setSkipCollapsed(obtainStyledAttributes.getBoolean(11, false));
        setDraggable(obtainStyledAttributes.getBoolean(4, true));
        setSaveFlags(obtainStyledAttributes.getInt(10, 0));
        setHalfExpandedRatio(obtainStyledAttributes.getFloat(7, 0.5f));
        TypedValue peekValue2 = obtainStyledAttributes.peekValue(5);
        if (peekValue2 != null && peekValue2.type == 16) {
            setExpandedOffset(peekValue2.data);
        } else {
            setExpandedOffset(obtainStyledAttributes.getDimensionPixelOffset(5, 0));
        }
        this.paddingBottomSystemWindowInsets = obtainStyledAttributes.getBoolean(16, false);
        this.paddingLeftSystemWindowInsets = obtainStyledAttributes.getBoolean(17, false);
        this.paddingRightSystemWindowInsets = obtainStyledAttributes.getBoolean(18, false);
        this.paddingTopSystemWindowInsets = obtainStyledAttributes.getBoolean(19, true);
        this.marginLeftSystemWindowInsets = obtainStyledAttributes.getBoolean(13, false);
        this.marginRightSystemWindowInsets = obtainStyledAttributes.getBoolean(14, false);
        this.marginTopSystemWindowInsets = obtainStyledAttributes.getBoolean(15, false);
        obtainStyledAttributes.recycle();
        this.maximumVelocity = ViewConfiguration.get(context).getScaledMaximumFlingVelocity();
    }
}
