package com.facebook.react.runtime;

import android.content.Context;
import android.graphics.Point;
import android.graphics.Rect;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewParent;
import com.facebook.react.ReactRootView;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.config.ReactFeatureFlags;
import com.facebook.react.internal.featureflags.ReactNativeFeatureFlags;
import com.facebook.react.uimanager.IllegalViewOperationException;
import com.facebook.react.uimanager.JSKeyDispatcher;
import com.facebook.react.uimanager.JSPointerDispatcher;
import com.facebook.react.uimanager.JSTouchDispatcher;
import com.facebook.react.uimanager.ViewProps;
import com.facebook.react.uimanager.events.EventDispatcher;
import com.twilio.voice.EventKeys;
import java.util.Objects;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000~\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0003\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u0000 B2\u00020\u0001:\u0001BB\u0019\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u0018\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0011H\u0014J0\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0016\u001a\u00020\u000f2\u0006\u0010\u0017\u001a\u00020\u00112\u0006\u0010\u0018\u001a\u00020\u00112\u0006\u0010\u0019\u001a\u00020\u00112\u0006\u0010\u001a\u001a\u00020\u0011H\u0014J\u0010\u0010\u001f\u001a\u00020\u00142\u0006\u0010 \u001a\u00020\u000fH\u0016J\u001a\u0010!\u001a\u00020\u00142\b\u0010\"\u001a\u0004\u0018\u00010#2\u0006\u0010$\u001a\u00020%H\u0016J\u0018\u0010&\u001a\u00020\u00142\u0006\u0010\"\u001a\u00020#2\u0006\u0010$\u001a\u00020%H\u0016J\u0010\u0010'\u001a\u00020\u00142\u0006\u0010(\u001a\u00020)H\u0016J\u0010\u0010*\u001a\u00020\u00142\u0006\u0010+\u001a\u00020\u000fH\u0016J\b\u0010,\u001a\u00020\u0011H\u0016J\b\u0010-\u001a\u00020.H\u0016J\u0010\u0010/\u001a\u00020\u00142\u0006\u00100\u001a\u00020%H\u0014J\u0018\u00101\u001a\u00020\u00142\u0006\u00100\u001a\u00020%2\u0006\u00102\u001a\u00020\u000fH\u0014J\u0010\u00103\u001a\u00020\u00142\u0006\u00100\u001a\u000204H\u0014J\u001c\u00105\u001a\u00020\u00142\b\u00106\u001a\u0004\u0018\u00010#2\b\u00107\u001a\u0004\u0018\u00010#H\u0016J\"\u00108\u001a\u00020\u00142\u0006\u00109\u001a\u00020\u000f2\u0006\u0010:\u001a\u00020\u00112\b\u0010;\u001a\u0004\u0018\u00010<H\u0014J\b\u0010=\u001a\u00020\u000fH\u0016J\b\u0010>\u001a\u00020\u000fH\u0016J\n\u0010?\u001a\u0004\u0018\u00010@H\u0016J\b\u0010A\u001a\u00020\u000fH\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\n\u001a\u0004\u0018\u00010\u000bX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\f\u001a\u0004\u0018\u00010\rX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0011X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0011X\u0082\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u001b\u001a\u00020\u001c8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u001d\u0010\u001e¨\u0006C"}, d2 = {"Lcom/facebook/react/runtime/ReactSurfaceView;", "Lcom/facebook/react/ReactRootView;", "context", "Landroid/content/Context;", "surface", "Lcom/facebook/react/runtime/ReactSurfaceImpl;", "<init>", "(Landroid/content/Context;Lcom/facebook/react/runtime/ReactSurfaceImpl;)V", "jsTouchDispatcher", "Lcom/facebook/react/uimanager/JSTouchDispatcher;", "jsPointerDispatcher", "Lcom/facebook/react/uimanager/JSPointerDispatcher;", "jsKeyDispatcher", "Lcom/facebook/react/uimanager/JSKeyDispatcher;", "wasMeasured", "", "widthMeasureSpec", "", "heightMeasureSpec", "onMeasure", "", "onLayout", "changed", ViewProps.LEFT, ViewProps.TOP, ViewProps.RIGHT, ViewProps.BOTTOM, "viewportOffset", "Landroid/graphics/Point;", "getViewportOffset", "()Landroid/graphics/Point;", "requestDisallowInterceptTouchEvent", "disallowIntercept", "onChildStartedNativeGesture", "childView", "Landroid/view/View;", "ev", "Landroid/view/MotionEvent;", "onChildEndedNativeGesture", "handleException", "t", "", "setIsFabric", "isFabric", "getUIManagerType", "getJSModuleName", "", "dispatchJSTouchEvent", "event", "dispatchJSPointerEvent", "isCapture", "dispatchJSKeyEvent", "Landroid/view/KeyEvent;", "requestChildFocus", "child", "focused", "onFocusChanged", "gainFocus", EventKeys.DIRECTION_KEY, "previouslyFocusedRect", "Landroid/graphics/Rect;", "hasActiveReactContext", "hasActiveReactInstance", "getCurrentReactContext", "Lcom/facebook/react/bridge/ReactContext;", "isViewAttachedToReactInstance", "Companion", "ReactAndroid_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nReactSurfaceView.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ReactSurfaceView.kt\ncom/facebook/react/runtime/ReactSurfaceView\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,260:1\n1#2:261\n*E\n"})
/* loaded from: classes2.dex */
public final class ReactSurfaceView extends ReactRootView {

    @NotNull
    private static final Companion Companion = new Companion(null);

    @NotNull
    private static final String TAG = "ReactSurfaceView";
    private int heightMeasureSpec;

    @Nullable
    private JSKeyDispatcher jsKeyDispatcher;

    @Nullable
    private JSPointerDispatcher jsPointerDispatcher;

    @NotNull
    private final JSTouchDispatcher jsTouchDispatcher;

    @NotNull
    private final ReactSurfaceImpl surface;
    private boolean wasMeasured;
    private int widthMeasureSpec;

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Lcom/facebook/react/runtime/ReactSurfaceView$Companion;", "", "<init>", "()V", "TAG", "", "ReactAndroid_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ReactSurfaceView(@Nullable Context context, @NotNull ReactSurfaceImpl surface) {
        super(context);
        Intrinsics.checkNotNullParameter(surface, "surface");
        this.surface = surface;
        this.jsTouchDispatcher = new JSTouchDispatcher(this);
        if (ReactFeatureFlags.dispatchPointerEvents) {
            this.jsPointerDispatcher = new JSPointerDispatcher(this);
        }
        if (ReactNativeFeatureFlags.enableKeyEvents()) {
            this.jsKeyDispatcher = new JSKeyDispatcher();
        }
    }

    private final Point getViewportOffset() {
        int[] iArr = new int[2];
        getLocationOnScreen(iArr);
        Rect rect = new Rect();
        getWindowVisibleDisplayFrame(rect);
        iArr[0] = iArr[0] - rect.left;
        iArr[1] = iArr[1] - rect.top;
        return new Point(iArr[0], iArr[1]);
    }

    @Override // com.facebook.react.ReactRootView
    public void dispatchJSKeyEvent(@NotNull KeyEvent event) {
        Intrinsics.checkNotNullParameter(event, "event");
        if (this.jsKeyDispatcher == null) {
            if (ReactNativeFeatureFlags.enableKeyEvents()) {
                E6.a.K(TAG, "Unable to dispatch key events to JS before the dispatcher is available");
                return;
            }
            return;
        }
        EventDispatcher eventDispatcher$ReactAndroid_release = this.surface.getEventDispatcher$ReactAndroid_release();
        if (eventDispatcher$ReactAndroid_release == null) {
            E6.a.K(TAG, "Unable to dispatch key events to JS as the React instance has not been attached");
            return;
        }
        JSKeyDispatcher jSKeyDispatcher = this.jsKeyDispatcher;
        if (jSKeyDispatcher != null) {
            jSKeyDispatcher.handleKeyEvent(event, eventDispatcher$ReactAndroid_release, this.surface.getSurfaceID());
        }
    }

    @Override // com.facebook.react.ReactRootView
    public void dispatchJSPointerEvent(@NotNull MotionEvent event, boolean isCapture) {
        Intrinsics.checkNotNullParameter(event, "event");
        if (this.jsPointerDispatcher == null) {
            if (ReactFeatureFlags.dispatchPointerEvents) {
                E6.a.K(TAG, "Unable to dispatch pointer events to JS before the dispatcher is available");
                return;
            }
            return;
        }
        EventDispatcher eventDispatcher$ReactAndroid_release = this.surface.getEventDispatcher$ReactAndroid_release();
        if (eventDispatcher$ReactAndroid_release == null) {
            E6.a.K(TAG, "Unable to dispatch pointer events to JS as the React instance has not been attached");
            return;
        }
        JSPointerDispatcher jSPointerDispatcher = this.jsPointerDispatcher;
        if (jSPointerDispatcher != null) {
            jSPointerDispatcher.handleMotionEvent(event, eventDispatcher$ReactAndroid_release, isCapture);
        }
    }

    @Override // com.facebook.react.ReactRootView
    public void dispatchJSTouchEvent(@NotNull MotionEvent event) {
        Intrinsics.checkNotNullParameter(event, "event");
        EventDispatcher eventDispatcher$ReactAndroid_release = this.surface.getEventDispatcher$ReactAndroid_release();
        if (eventDispatcher$ReactAndroid_release == null) {
            E6.a.K(TAG, "Unable to dispatch touch events to JS as the React instance has not been attached");
            return;
        }
        JSTouchDispatcher jSTouchDispatcher = this.jsTouchDispatcher;
        ReactHostImpl reactHost$ReactAndroid_release = this.surface.getReactHost$ReactAndroid_release();
        jSTouchDispatcher.handleTouchEvent(event, eventDispatcher$ReactAndroid_release, reactHost$ReactAndroid_release != null ? reactHost$ReactAndroid_release.getCurrentReactContext() : null);
    }

    @Override // com.facebook.react.ReactRootView
    @Nullable
    public ReactContext getCurrentReactContext() {
        ReactHostImpl reactHost$ReactAndroid_release;
        if (!this.surface.isAttached$ReactAndroid_release() || (reactHost$ReactAndroid_release = this.surface.getReactHost$ReactAndroid_release()) == null) {
            return null;
        }
        return reactHost$ReactAndroid_release.getCurrentReactContext();
    }

    @Override // com.facebook.react.ReactRootView, com.facebook.react.uimanager.ReactRoot
    @NotNull
    public String getJSModuleName() {
        return this.surface.getModuleName();
    }

    @Override // com.facebook.react.ReactRootView, com.facebook.react.uimanager.ReactRoot
    public int getUIManagerType() {
        return 2;
    }

    @Override // com.facebook.react.ReactRootView, com.facebook.react.uimanager.RootView
    public void handleException(@NotNull Throwable t10) {
        Intrinsics.checkNotNullParameter(t10, "t");
        String objects = Objects.toString(t10.getMessage(), "");
        Intrinsics.checkNotNullExpressionValue(objects, "toString(...)");
        IllegalViewOperationException illegalViewOperationException = new IllegalViewOperationException(objects, this, t10);
        ReactHostImpl reactHost$ReactAndroid_release = this.surface.getReactHost$ReactAndroid_release();
        if (reactHost$ReactAndroid_release == null) {
            throw illegalViewOperationException;
        }
        reactHost$ReactAndroid_release.handleHostException$ReactAndroid_release(illegalViewOperationException);
    }

    @Override // com.facebook.react.ReactRootView
    public boolean hasActiveReactContext() {
        if (!this.surface.isAttached$ReactAndroid_release()) {
            return false;
        }
        ReactHostImpl reactHost$ReactAndroid_release = this.surface.getReactHost$ReactAndroid_release();
        return (reactHost$ReactAndroid_release != null ? reactHost$ReactAndroid_release.getCurrentReactContext() : null) != null;
    }

    @Override // com.facebook.react.ReactRootView
    public boolean hasActiveReactInstance() {
        ReactHostImpl reactHost$ReactAndroid_release;
        return this.surface.isAttached$ReactAndroid_release() && (reactHost$ReactAndroid_release = this.surface.getReactHost$ReactAndroid_release()) != null && reactHost$ReactAndroid_release.isInstanceInitialized$ReactAndroid_release();
    }

    @Override // com.facebook.react.ReactRootView
    public boolean isViewAttachedToReactInstance() {
        return this.surface.isAttached$ReactAndroid_release();
    }

    @Override // com.facebook.react.ReactRootView, com.facebook.react.uimanager.RootView
    public void onChildEndedNativeGesture(@NotNull View childView, @NotNull MotionEvent ev) {
        Intrinsics.checkNotNullParameter(childView, "childView");
        Intrinsics.checkNotNullParameter(ev, "ev");
        EventDispatcher eventDispatcher$ReactAndroid_release = this.surface.getEventDispatcher$ReactAndroid_release();
        if (eventDispatcher$ReactAndroid_release == null) {
            return;
        }
        this.jsTouchDispatcher.onChildEndedNativeGesture(ev, eventDispatcher$ReactAndroid_release);
        JSPointerDispatcher jSPointerDispatcher = this.jsPointerDispatcher;
        if (jSPointerDispatcher != null) {
            jSPointerDispatcher.onChildEndedNativeGesture();
        }
    }

    @Override // com.facebook.react.ReactRootView, com.facebook.react.uimanager.RootView
    public void onChildStartedNativeGesture(@Nullable View childView, @NotNull MotionEvent ev) {
        JSPointerDispatcher jSPointerDispatcher;
        Intrinsics.checkNotNullParameter(ev, "ev");
        EventDispatcher eventDispatcher$ReactAndroid_release = this.surface.getEventDispatcher$ReactAndroid_release();
        if (eventDispatcher$ReactAndroid_release == null) {
            return;
        }
        JSTouchDispatcher jSTouchDispatcher = this.jsTouchDispatcher;
        ReactHostImpl reactHost$ReactAndroid_release = this.surface.getReactHost$ReactAndroid_release();
        jSTouchDispatcher.onChildStartedNativeGesture(ev, eventDispatcher$ReactAndroid_release, reactHost$ReactAndroid_release != null ? reactHost$ReactAndroid_release.getCurrentReactContext() : null);
        if (childView == null || (jSPointerDispatcher = this.jsPointerDispatcher) == null) {
            return;
        }
        jSPointerDispatcher.onChildStartedNativeGesture(childView, ev, eventDispatcher$ReactAndroid_release);
    }

    @Override // com.facebook.react.ReactRootView, android.view.View
    public void onFocusChanged(boolean gainFocus, int direction, @Nullable Rect previouslyFocusedRect) {
        JSKeyDispatcher jSKeyDispatcher;
        super.onFocusChanged(gainFocus, direction, previouslyFocusedRect);
        if (ReactNativeFeatureFlags.enableKeyEvents()) {
            if (!gainFocus) {
                JSKeyDispatcher jSKeyDispatcher2 = this.jsKeyDispatcher;
                if (jSKeyDispatcher2 != null) {
                    jSKeyDispatcher2.clearFocus();
                    return;
                }
                return;
            }
            View focusedChild = getFocusedChild();
            Integer valueOf = focusedChild != null ? Integer.valueOf(focusedChild.getId()) : null;
            if (valueOf == null || (jSKeyDispatcher = this.jsKeyDispatcher) == null) {
                return;
            }
            jSKeyDispatcher.setFocusedView(valueOf.intValue());
        }
    }

    @Override // com.facebook.react.ReactRootView, android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public void onLayout(boolean changed, int left, int top, int right, int bottom) {
        if (this.wasMeasured && changed) {
            Point viewportOffset = getViewportOffset();
            this.surface.updateLayoutSpecs$ReactAndroid_release(this.widthMeasureSpec, this.heightMeasureSpec, viewportOffset.x, viewportOffset.y);
        }
    }

    @Override // com.facebook.react.ReactRootView, android.widget.FrameLayout, android.view.View
    public void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        int i10;
        int i11;
        A8.a.c(0L, "ReactSurfaceView.onMeasure");
        int mode = View.MeasureSpec.getMode(widthMeasureSpec);
        if (mode == Integer.MIN_VALUE || mode == 0) {
            int childCount = getChildCount();
            int i12 = 0;
            for (int i13 = 0; i13 < childCount; i13++) {
                View childAt = getChildAt(i13);
                i12 = Math.max(i12, childAt.getLeft() + childAt.getMeasuredWidth() + childAt.getPaddingLeft() + childAt.getPaddingRight());
            }
            i10 = i12;
        } else {
            i10 = View.MeasureSpec.getSize(widthMeasureSpec);
        }
        int mode2 = View.MeasureSpec.getMode(heightMeasureSpec);
        if (mode2 == Integer.MIN_VALUE || mode2 == 0) {
            int childCount2 = getChildCount();
            int i14 = 0;
            for (int i15 = 0; i15 < childCount2; i15++) {
                View childAt2 = getChildAt(i15);
                i14 = Math.max(i14, childAt2.getTop() + childAt2.getMeasuredHeight() + childAt2.getPaddingTop() + childAt2.getPaddingBottom());
            }
            i11 = i14;
        } else {
            i11 = View.MeasureSpec.getSize(heightMeasureSpec);
        }
        setMeasuredDimension(i10, i11);
        this.wasMeasured = true;
        this.widthMeasureSpec = widthMeasureSpec;
        this.heightMeasureSpec = heightMeasureSpec;
        Point viewportOffset = getViewportOffset();
        this.surface.updateLayoutSpecs$ReactAndroid_release(widthMeasureSpec, heightMeasureSpec, viewportOffset.x, viewportOffset.y);
        A8.a.i(0L);
    }

    @Override // com.facebook.react.ReactRootView, android.view.ViewGroup, android.view.ViewParent
    public void requestChildFocus(@Nullable View child, @Nullable View focused) {
        JSKeyDispatcher jSKeyDispatcher;
        super.requestChildFocus(child, focused);
        if (ReactNativeFeatureFlags.enableKeyEvents()) {
            Integer valueOf = focused != null ? Integer.valueOf(focused.getId()) : null;
            if (valueOf == null || (jSKeyDispatcher = this.jsKeyDispatcher) == null) {
                return;
            }
            jSKeyDispatcher.setFocusedView(valueOf.intValue());
        }
    }

    @Override // com.facebook.react.ReactRootView, android.view.ViewGroup, android.view.ViewParent
    public void requestDisallowInterceptTouchEvent(boolean disallowIntercept) {
        ViewParent parent = getParent();
        if (parent != null) {
            parent.requestDisallowInterceptTouchEvent(disallowIntercept);
        }
    }

    @Override // com.facebook.react.ReactRootView
    public void setIsFabric(boolean isFabric) {
        super.setIsFabric(true);
    }
}
