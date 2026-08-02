package com.reactnativekeyboardcontroller.views;

import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ScrollView;
import com.facebook.appevents.internal.ViewHierarchyConstants;
import com.facebook.react.uimanager.ThemedReactContext;
import com.facebook.react.views.view.ReactViewGroup;
import com.reactnativekeyboardcontroller.extensions.FloatKt;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: ClippingScrollViewDecoratorView.kt */
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u0000 !2\u00020\u0001:\u0001!B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\b\u0010\u000f\u001a\u00020\u0010H\u0014J\u0010\u0010\u0011\u001a\u00020\u000e2\u0006\u0010\u0012\u001a\u00020\u0013H\u0016J\u000e\u0010\u0014\u001a\u00020\u00102\u0006\u0010\u0015\u001a\u00020\tJ\u000e\u0010\u0016\u001a\u00020\u00102\u0006\u0010\u0015\u001a\u00020\tJ\u000e\u0010\u0017\u001a\u00020\u00102\u0006\u0010\u0015\u001a\u00020\u000eJ\b\u0010\u0018\u001a\u00020\u0010H\u0002J\u0018\u0010\u0019\u001a\u00020\u000e2\u0006\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u0012\u001a\u00020\u0013H\u0002J\u0018\u0010\u001c\u001a\u00020\u000e2\u0006\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u0012\u001a\u00020\u0013H\u0002J\u0018\u0010\u001d\u001a\u00020\u000e2\u0006\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u0012\u001a\u00020\u0013H\u0002J\u0014\u0010\u001e\u001a\u0004\u0018\u00010\u001b2\b\u0010\u001f\u001a\u0004\u0018\u00010 H\u0002R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u000e\u0010\b\u001a\u00020\tX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\tX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000eX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\""}, d2 = {"Lcom/reactnativekeyboardcontroller/views/ClippingScrollViewDecoratorView;", "Lcom/facebook/react/views/view/ReactViewGroup;", "reactContext", "Lcom/facebook/react/uimanager/ThemedReactContext;", "<init>", "(Lcom/facebook/react/uimanager/ThemedReactContext;)V", "getReactContext", "()Lcom/facebook/react/uimanager/ThemedReactContext;", "insetBottom", "", "insetTop", "appliedTopInsetPx", "", "paddingScrollWorkaroundActive", "", "onAttachedToWindow", "", "dispatchTouchEvent", "event", "Landroid/view/MotionEvent;", "setContentInsetBottom", "value", "setContentInsetTop", "setApplyWorkaroundForContentInsetHitTestBug", "decorateScrollView", "shouldUsePaddingScrollWorkaround", "scrollView", "Landroid/widget/ScrollView;", "dispatchWithExpandedContentRange", "isTouchInScrollContent", "findScrollView", ViewHierarchyConstants.VIEW_KEY, "Landroid/view/View;", "Companion", "react-native-keyboard-controller_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class ClippingScrollViewDecoratorView extends ReactViewGroup {
    private static final int COORDINATES_SIZE = 2;
    private static final int MIN_SCROLL_RANGE_PX = 2;
    private int appliedTopInsetPx;
    private double insetBottom;
    private double insetTop;
    private boolean paddingScrollWorkaroundActive;
    private final ThemedReactContext reactContext;

    public final void setApplyWorkaroundForContentInsetHitTestBug(boolean value) {
    }

    public final ThemedReactContext getReactContext() {
        return this.reactContext;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ClippingScrollViewDecoratorView(ThemedReactContext reactContext) {
        super(reactContext);
        Intrinsics.checkNotNullParameter(reactContext, "reactContext");
        this.reactContext = reactContext;
    }

    @Override // com.facebook.react.views.view.ReactViewGroup, android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        decorateScrollView();
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(MotionEvent event) {
        boolean dispatchTouchEvent;
        Intrinsics.checkNotNullParameter(event, "event");
        ScrollView findScrollView = findScrollView(this);
        if (findScrollView == null) {
            return super.dispatchTouchEvent(event);
        }
        if (event.getActionMasked() == 0) {
            this.paddingScrollWorkaroundActive = shouldUsePaddingScrollWorkaround(findScrollView, event);
        }
        if (this.paddingScrollWorkaroundActive) {
            dispatchTouchEvent = dispatchWithExpandedContentRange(findScrollView, event);
        } else {
            dispatchTouchEvent = super.dispatchTouchEvent(event);
        }
        if (event.getActionMasked() != 1 && event.getActionMasked() != 3) {
            return dispatchTouchEvent;
        }
        this.paddingScrollWorkaroundActive = false;
        return dispatchTouchEvent;
    }

    public final void setContentInsetBottom(double value) {
        this.insetBottom = value;
        decorateScrollView();
    }

    public final void setContentInsetTop(double value) {
        this.insetTop = value;
        decorateScrollView();
    }

    private final void decorateScrollView() {
        ScrollView findScrollView = findScrollView(this);
        if (findScrollView == null) {
            return;
        }
        findScrollView.setClipToPadding(false);
        int px = (int) FloatKt.getPx((float) this.insetTop);
        View childAt = findScrollView.getChildAt(0);
        ViewGroup viewGroup = childAt instanceof ViewGroup ? (ViewGroup) childAt : null;
        if (viewGroup == null) {
            return;
        }
        viewGroup.setTranslationY(px);
        findScrollView.setPadding(findScrollView.getPaddingLeft(), findScrollView.getPaddingTop(), findScrollView.getPaddingRight(), (int) FloatKt.getPx((float) (this.insetBottom + this.insetTop)));
        int i = px - this.appliedTopInsetPx;
        if (i != 0) {
            findScrollView.scrollBy(0, i);
        }
        this.appliedTopInsetPx = px;
    }

    private final boolean shouldUsePaddingScrollWorkaround(ScrollView scrollView, MotionEvent event) {
        View childAt = scrollView.getChildAt(0);
        if (childAt == null) {
            return false;
        }
        return scrollView.getScrollY() == 0 && (childAt.getHeight() > (scrollView.getHeight() - scrollView.getPaddingTop()) - scrollView.getPaddingBottom()) && !scrollView.canScrollVertically(1) && isTouchInScrollContent(scrollView, event);
    }

    private final boolean dispatchWithExpandedContentRange(ScrollView scrollView, MotionEvent event) {
        View childAt = scrollView.getChildAt(0);
        int bottom = childAt != null ? childAt.getBottom() : 0;
        int max = Math.max(bottom, scrollView.getHeight() + scrollView.getScrollY() + 2);
        if (childAt == null || max == bottom) {
            return super.dispatchTouchEvent(event);
        }
        try {
            childAt.setBottom(max);
            return super.dispatchTouchEvent(event);
        } finally {
            childAt.setBottom(bottom);
        }
    }

    private final boolean isTouchInScrollContent(ScrollView scrollView, MotionEvent event) {
        View childAt = scrollView.getChildAt(0);
        if (childAt == null) {
            return false;
        }
        getLocationOnScreen(new int[2]);
        scrollView.getLocationOnScreen(new int[2]);
        float x = (event.getX() + r3[0]) - r2[0];
        float y = (event.getY() + r3[1]) - r2[1];
        int scrollY = scrollView.getScrollY();
        return y >= ((float) (childAt.getTop() - scrollY)) && y < ((float) (childAt.getBottom() - scrollY)) && x >= ((float) childAt.getLeft()) && x < ((float) childAt.getRight());
    }

    private final ScrollView findScrollView(View view) {
        if (view instanceof ScrollView) {
            return (ScrollView) view;
        }
        ScrollView scrollView = null;
        if (view instanceof ViewGroup) {
            int i = 0;
            while (true) {
                ViewGroup viewGroup = (ViewGroup) view;
                if (i >= viewGroup.getChildCount() || scrollView != null) {
                    break;
                }
                scrollView = findScrollView(viewGroup.getChildAt(i));
                i++;
            }
        }
        return scrollView;
    }
}
