package com.facebook.react.views.virtual.view;

import E6.a;
import android.content.Context;
import android.graphics.Rect;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewTreeObserver;
import com.facebook.react.R;
import com.facebook.react.internal.featureflags.ReactNativeFeatureFlags;
import com.facebook.react.uimanager.ReactClippingViewGroup;
import com.facebook.react.uimanager.ReactRoot;
import com.facebook.react.uimanager.ViewProps;
import com.facebook.react.views.scroll.ReactHorizontalScrollView;
import com.facebook.react.views.scroll.ReactScrollView;
import com.facebook.react.views.scroll.ReactScrollViewHelper;
import com.facebook.react.views.scroll.ScrollEventType;
import com.facebook.react.views.view.ReactViewGroup;
import com.facebook.react.views.virtual.VirtualViewMode;
import com.facebook.react.views.virtual.VirtualViewModeChangeEmitter;
import com.facebook.react.views.virtual.VirtualViewRenderState;
import com.facebook.react.views.virtual.view.ReactVirtualView;
import i3.C4527h;
import java.util.Set;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000\u0096\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0006\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0013\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\b\n\u0002\u0010\"\n\u0002\b\u0012\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u0004B\u000f\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\r\u00107\u001a\u000208H\u0010¢\u0006\u0002\b9J\b\u0010:\u001a\u000208H\u0014J\r\u0010;\u001a\u000208H\u0001¢\u0006\u0002\b<J\b\u0010=\u001a\u000208H\u0014J0\u0010>\u001a\u0002082\u0006\u0010?\u001a\u00020\"2\u0006\u0010@\u001a\u0002002\u0006\u0010A\u001a\u0002002\u0006\u0010B\u001a\u0002002\u0006\u0010C\u001a\u000200H\u0014JR\u0010D\u001a\u0002082\b\u0010E\u001a\u0004\u0018\u00010)2\u0006\u0010@\u001a\u0002002\u0006\u0010A\u001a\u0002002\u0006\u0010B\u001a\u0002002\u0006\u0010C\u001a\u0002002\u0006\u0010F\u001a\u0002002\u0006\u0010G\u001a\u0002002\u0006\u0010H\u001a\u0002002\u0006\u0010I\u001a\u000200H\u0016J,\u0010J\u001a\u0002082\b\u0010K\u001a\u0004\u0018\u00010L2\b\u0010M\u001a\u0004\u0018\u00010N2\u0006\u0010O\u001a\u00020P2\u0006\u0010Q\u001a\u00020PH\u0016J\u0012\u0010>\u001a\u0002082\b\u0010K\u001a\u0004\u0018\u00010LH\u0016J\u0010\u0010D\u001a\u0002082\u0006\u0010K\u001a\u00020LH\u0016J(\u0010R\u001a\u0002082\u0006\u0010S\u001a\u0002002\u0006\u0010T\u001a\u0002002\u0006\u0010U\u001a\u0002002\u0006\u0010V\u001a\u000200H\u0014J\u0018\u0010W\u001a\u0002082\u000e\u0010X\u001a\n\u0012\u0004\u0012\u000200\u0018\u00010YH\u0016J\u0010\u0010Z\u001a\u0002082\u0006\u0010[\u001a\u00020\"H\u0002J\u0018\u0010\\\u001a\u00020\"2\u0006\u0010]\u001a\u00020+2\u0006\u0010^\u001a\u00020+H\u0002J\u001a\u0010_\u001a\u0002082\b\u0010`\u001a\u0004\u0018\u00010\n2\u0006\u0010a\u001a\u00020\nH\u0002J\u0010\u0010b\u001a\u0002082\u0006\u0010\t\u001a\u00020\nH\u0002J\u0010\u0010c\u001a\u0002082\u0006\u0010\t\u001a\u00020\nH\u0002J\n\u0010d\u001a\u0004\u0018\u00010LH\u0002J\b\u0010e\u001a\u000208H\u0002J\u0012\u0010f\u001a\u0004\u0018\u00010L2\u0006\u0010g\u001a\u00020\"H\u0002J\b\u0010h\u001a\u000208H\u0002J)\u0010i\u001a\u0002082\u0006\u0010j\u001a\u0002042\u000e\b\u0002\u0010k\u001a\b\u0012\u0004\u0012\u0002040lH\u0080\bø\u0001\u0000¢\u0006\u0002\bmR\u001c\u0010\t\u001a\u0004\u0018\u00010\nX\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u001a\u0010\u000f\u001a\u00020\u0010X\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R\u001c\u0010\u0015\u001a\u0004\u0018\u00010\u0016X\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001aR\u001a\u0010\u001b\u001a\u00020\u001cX\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001d\u0010\u001e\"\u0004\b\u001f\u0010 R\u0014\u0010!\u001a\u00020\"X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b#\u0010$R\u000e\u0010%\u001a\u00020\u001cX\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010&\u001a\u0004\u0018\u00010'X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010(\u001a\u0004\u0018\u00010)X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010*\u001a\u00020+X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010,\u001a\u00020+X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010-\u001a\u00020+X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010.\u001a\u00020+X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010/\u001a\u000200X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u00101\u001a\u000200X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u00102\u001a\u00020\"X\u0082\u000e¢\u0006\u0002\n\u0000R\u0016\u00103\u001a\u0004\u0018\u0001048@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b5\u00106\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006n"}, d2 = {"Lcom/facebook/react/views/virtual/view/ReactVirtualView;", "Lcom/facebook/react/views/view/ReactViewGroup;", "Lcom/facebook/react/views/scroll/ReactScrollViewHelper$ScrollListener;", "Lcom/facebook/react/views/scroll/ReactScrollViewHelper$LayoutChangeListener;", "Landroid/view/View$OnLayoutChangeListener;", "context", "Landroid/content/Context;", "<init>", "(Landroid/content/Context;)V", "mode", "Lcom/facebook/react/views/virtual/VirtualViewMode;", "getMode$ReactAndroid_release", "()Lcom/facebook/react/views/virtual/VirtualViewMode;", "setMode$ReactAndroid_release", "(Lcom/facebook/react/views/virtual/VirtualViewMode;)V", "renderState", "Lcom/facebook/react/views/virtual/VirtualViewRenderState;", "getRenderState$ReactAndroid_release", "()Lcom/facebook/react/views/virtual/VirtualViewRenderState;", "setRenderState$ReactAndroid_release", "(Lcom/facebook/react/views/virtual/VirtualViewRenderState;)V", "modeChangeEmitter", "Lcom/facebook/react/views/virtual/VirtualViewModeChangeEmitter;", "getModeChangeEmitter$ReactAndroid_release", "()Lcom/facebook/react/views/virtual/VirtualViewModeChangeEmitter;", "setModeChangeEmitter$ReactAndroid_release", "(Lcom/facebook/react/views/virtual/VirtualViewModeChangeEmitter;)V", "prerenderRatio", "", "getPrerenderRatio$ReactAndroid_release", "()D", "setPrerenderRatio$ReactAndroid_release", "(D)V", "debugLogEnabled", "", "getDebugLogEnabled$ReactAndroid_release", "()Z", "hysteresisRatio", "onWindowFocusChangeListener", "Landroid/view/ViewTreeObserver$OnWindowFocusChangeListener;", "parentScrollView", "Landroid/view/View;", "lastRect", "Landroid/graphics/Rect;", "targetRect", "thresholdRect", "lastClippingRect", "offsetX", "", "offsetY", "offsetChanged", "nativeId", "", "getNativeId$ReactAndroid_release", "()Ljava/lang/String;", "recycleView", "", "recycleView$ReactAndroid_release", "onAttachedToWindow", "doAttachedToWindow", "doAttachedToWindow$ReactAndroid_release", "onDetachedFromWindow", "onLayout", "changed", ViewProps.LEFT, ViewProps.TOP, ViewProps.RIGHT, ViewProps.BOTTOM, "onLayoutChange", "v", "oldLeft", "oldTop", "oldRight", "oldBottom", "onScroll", "scrollView", "Landroid/view/ViewGroup;", "scrollEventType", "Lcom/facebook/react/views/scroll/ScrollEventType;", "xVelocity", "", "yVelocity", "onSizeChanged", "w", C4527h.f48087o, "oldw", "oldh", "updateClippingRect", "excludedViews", "", "dispatchOnModeChangeIfNeeded", "checkRectChange", "rectsOverlap", "rect1", "rect2", "maybeEmitModeChanges", "oldMode", "newMode", "emitAsyncModeChange", "emitSyncModeChange", "getParentScrollView", "cleanupLayoutListeners", "traverseParentStack", "addListeners", "updateParentOffset", "debugLog", "subtag", "block", "Lkotlin/Function0;", "debugLog$ReactAndroid_release", "ReactAndroid_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nReactVirtualView.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ReactVirtualView.kt\ncom/facebook/react/views/virtual/view/ReactVirtualView\n+ 2 ReactVirtualView.kt\ncom/facebook/react/views/virtual/view/ReactVirtualView$debugLog$1\n*L\n1#1,446:1\n430#1,4:447\n436#1,4:452\n431#1,9:456\n431#1,9:465\n431#1,9:474\n431#1,9:483\n431#1,9:492\n430#2:451\n*S KotlinDebug\n*F\n+ 1 ReactVirtualView.kt\ncom/facebook/react/views/virtual/view/ReactVirtualView\n*L\n99#1:447,4\n99#1:452,4\n238#1:456,9\n248#1:465,9\n286#1:474,9\n297#1:483,9\n336#1:492,9\n99#1:451\n*E\n"})
/* loaded from: classes2.dex */
public final class ReactVirtualView extends ReactViewGroup implements ReactScrollViewHelper.ScrollListener, ReactScrollViewHelper.LayoutChangeListener, View.OnLayoutChangeListener {
    private final boolean debugLogEnabled;
    private final double hysteresisRatio;

    @NotNull
    private final Rect lastClippingRect;

    @NotNull
    private final Rect lastRect;

    @Nullable
    private VirtualViewMode mode;

    @Nullable
    private VirtualViewModeChangeEmitter modeChangeEmitter;
    private boolean offsetChanged;
    private int offsetX;
    private int offsetY;

    @Nullable
    private final ViewTreeObserver.OnWindowFocusChangeListener onWindowFocusChangeListener;

    @Nullable
    private View parentScrollView;
    private double prerenderRatio;

    @NotNull
    private VirtualViewRenderState renderState;

    @NotNull
    private final Rect targetRect;

    @NotNull
    private final Rect thresholdRect;

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[VirtualViewMode.values().length];
            try {
                iArr[VirtualViewMode.Visible.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[VirtualViewMode.Prerender.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[VirtualViewMode.Hidden.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ReactVirtualView(@NotNull Context context) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        this.renderState = VirtualViewRenderState.Unknown;
        this.prerenderRatio = ReactNativeFeatureFlags.virtualViewPrerenderRatio();
        this.debugLogEnabled = ReactNativeFeatureFlags.enableVirtualViewDebugFeatures();
        this.hysteresisRatio = ReactNativeFeatureFlags.virtualViewHysteresisRatio();
        this.onWindowFocusChangeListener = ReactNativeFeatureFlags.enableVirtualViewWindowFocusDetection() ? new ViewTreeObserver.OnWindowFocusChangeListener() { // from class: s8.a
            @Override // android.view.ViewTreeObserver.OnWindowFocusChangeListener
            public final void onWindowFocusChanged(boolean z10) {
                ReactVirtualView.this.dispatchOnModeChangeIfNeeded(false);
            }
        } : null;
        this.lastRect = new Rect();
        this.targetRect = new Rect();
        this.thresholdRect = new Rect();
        this.lastClippingRect = new Rect();
    }

    private final void cleanupLayoutListeners() {
        traverseParentStack(false);
    }

    public static /* synthetic */ void debugLog$ReactAndroid_release$default(ReactVirtualView reactVirtualView, String subtag, Function0 block, int i10, Object obj) {
        boolean z10;
        if ((i10 & 2) != 0) {
            block = new Function0<String>() { // from class: com.facebook.react.views.virtual.view.ReactVirtualView$debugLog$1
                @Override // kotlin.jvm.functions.Function0
                public final String invoke() {
                    return "";
                }
            };
        }
        Intrinsics.checkNotNullParameter(subtag, "subtag");
        Intrinsics.checkNotNullParameter(block, "block");
        if (reactVirtualView.getDebugLogEnabled()) {
            z10 = ReactVirtualViewKt.IS_DEBUG_BUILD;
            if (z10) {
                a.b("ReactVirtualView:" + subtag, block.invoke() + " [" + reactVirtualView.getId() + "][" + reactVirtualView.getNativeId$ReactAndroid_release() + "]");
                return;
            }
            a.K("ReactVirtualView:" + subtag, block.invoke() + " [" + reactVirtualView.getId() + "][" + reactVirtualView.getNativeId$ReactAndroid_release() + "]");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void dispatchOnModeChangeIfNeeded(boolean checkRectChange) {
        View view;
        double d10;
        boolean z10;
        VirtualViewMode virtualViewMode;
        boolean z11;
        boolean z12;
        boolean z13;
        boolean z14;
        if (this.modeChangeEmitter == null || (view = this.parentScrollView) == null) {
            return;
        }
        if (this.offsetChanged) {
            updateParentOffset();
        }
        this.targetRect.set(getLeft() + this.offsetX, getTop() + this.offsetY, getRight() + this.offsetX, getBottom() + this.offsetY);
        view.getDrawingRect(this.thresholdRect);
        int height = this.thresholdRect.height();
        int width = this.thresholdRect.width();
        if ((this.targetRect.width() == 0 && this.targetRect.height() == 0) || this.thresholdRect.isEmpty()) {
            if (getDebugLogEnabled()) {
                z14 = ReactVirtualViewKt.IS_DEBUG_BUILD;
                if (z14) {
                    String str = "empty rects target=" + this.targetRect.toShortString() + " threshold=" + this.thresholdRect.toShortString();
                    a.b("ReactVirtualView:dispatchOnModeChangeIfNeeded", ((Object) str) + " [" + getId() + "][" + getNativeId$ReactAndroid_release() + "]");
                    return;
                }
                String str2 = "empty rects target=" + this.targetRect.toShortString() + " threshold=" + this.thresholdRect.toShortString();
                a.K("ReactVirtualView:dispatchOnModeChangeIfNeeded", ((Object) str2) + " [" + getId() + "][" + getNativeId$ReactAndroid_release() + "]");
                return;
            }
            return;
        }
        updateClippingRect();
        if (checkRectChange) {
            if (!this.lastRect.isEmpty() && Intrinsics.areEqual(this.lastRect, this.targetRect)) {
                if (getDebugLogEnabled()) {
                    z13 = ReactVirtualViewKt.IS_DEBUG_BUILD;
                    if (z13) {
                        a.b("ReactVirtualView:dispatchOnModeChangeIfNeeded", ((Object) "no rect change") + " [" + getId() + "][" + getNativeId$ReactAndroid_release() + "]");
                        return;
                    }
                    a.K("ReactVirtualView:dispatchOnModeChangeIfNeeded", ((Object) "no rect change") + " [" + getId() + "][" + getNativeId$ReactAndroid_release() + "]");
                    return;
                }
                return;
            }
            this.lastRect.set(this.targetRect);
        }
        if (rectsOverlap(this.targetRect, this.thresholdRect)) {
            virtualViewMode = this.onWindowFocusChangeListener != null ? hasWindowFocus() ? VirtualViewMode.Visible : VirtualViewMode.Prerender : VirtualViewMode.Visible;
        } else {
            double d11 = this.prerenderRatio;
            if (d11 > 0.0d) {
                d10 = 0.0d;
                this.thresholdRect.inset((int) ((-width) * d11), (int) ((-height) * d11));
                z10 = rectsOverlap(this.targetRect, this.thresholdRect);
            } else {
                d10 = 0.0d;
                z10 = false;
            }
            if (z10) {
                virtualViewMode = VirtualViewMode.Prerender;
            } else {
                VirtualViewMode virtualViewMode2 = this.mode;
                if (virtualViewMode2 != null) {
                    double d12 = this.hysteresisRatio;
                    if (d12 > d10) {
                        this.thresholdRect.inset((int) ((-width) * d12), (int) ((-height) * d12));
                        if (rectsOverlap(this.targetRect, this.thresholdRect)) {
                            if (getDebugLogEnabled()) {
                                z11 = ReactVirtualViewKt.IS_DEBUG_BUILD;
                                if (z11) {
                                    int id2 = getId();
                                    String nativeId$ReactAndroid_release = getNativeId$ReactAndroid_release();
                                    a.b("ReactVirtualView:dispatchOnModeChangeIfNeeded", ((Object) ("hysteresis, mode=" + virtualViewMode2)) + " [" + id2 + "][" + nativeId$ReactAndroid_release + "]");
                                } else {
                                    int id3 = getId();
                                    String nativeId$ReactAndroid_release2 = getNativeId$ReactAndroid_release();
                                    a.K("ReactVirtualView:dispatchOnModeChangeIfNeeded", ((Object) ("hysteresis, mode=" + virtualViewMode2)) + " [" + id3 + "][" + nativeId$ReactAndroid_release2 + "]");
                                }
                            }
                            virtualViewMode = virtualViewMode2;
                        } else {
                            virtualViewMode = VirtualViewMode.Hidden;
                            this.thresholdRect.setEmpty();
                        }
                    }
                }
                virtualViewMode = VirtualViewMode.Hidden;
                this.thresholdRect.setEmpty();
            }
        }
        if (getDebugLogEnabled()) {
            z12 = ReactVirtualViewKt.IS_DEBUG_BUILD;
            if (z12) {
                String str3 = "mode=" + this.mode + " target=" + this.targetRect.toShortString() + " threshold=" + this.thresholdRect.toShortString();
                a.b("ReactVirtualView:dispatchOnModeChangeIfNeeded", ((Object) str3) + " [" + getId() + "][" + getNativeId$ReactAndroid_release() + "]");
            } else {
                String str4 = "mode=" + this.mode + " target=" + this.targetRect.toShortString() + " threshold=" + this.thresholdRect.toShortString();
                a.K("ReactVirtualView:dispatchOnModeChangeIfNeeded", ((Object) str4) + " [" + getId() + "][" + getNativeId$ReactAndroid_release() + "]");
            }
        }
        VirtualViewMode virtualViewMode3 = this.mode;
        if (virtualViewMode == virtualViewMode3) {
            return;
        }
        this.mode = virtualViewMode;
        maybeEmitModeChanges(virtualViewMode3, virtualViewMode);
    }

    private final void emitAsyncModeChange(VirtualViewMode mode) {
        VirtualViewModeChangeEmitter virtualViewModeChangeEmitter = this.modeChangeEmitter;
        if (virtualViewModeChangeEmitter != null) {
            virtualViewModeChangeEmitter.emitModeChange(mode, this.targetRect, this.thresholdRect, false);
        }
    }

    private final void emitSyncModeChange(VirtualViewMode mode) {
        VirtualViewModeChangeEmitter virtualViewModeChangeEmitter = this.modeChangeEmitter;
        if (virtualViewModeChangeEmitter != null) {
            virtualViewModeChangeEmitter.emitModeChange(mode, this.targetRect, this.thresholdRect, true);
        }
    }

    private final ViewGroup getParentScrollView() {
        return traverseParentStack(true);
    }

    private final void maybeEmitModeChanges(VirtualViewMode oldMode, VirtualViewMode newMode) {
        boolean z10;
        if (getDebugLogEnabled()) {
            z10 = ReactVirtualViewKt.IS_DEBUG_BUILD;
            if (z10) {
                int id2 = getId();
                String nativeId$ReactAndroid_release = getNativeId$ReactAndroid_release();
                a.b("ReactVirtualView:Mode change", ((Object) (oldMode + "->" + newMode)) + " [" + id2 + "][" + nativeId$ReactAndroid_release + "]");
            } else {
                int id3 = getId();
                String nativeId$ReactAndroid_release2 = getNativeId$ReactAndroid_release();
                a.K("ReactVirtualView:Mode change", ((Object) (oldMode + "->" + newMode)) + " [" + id3 + "][" + nativeId$ReactAndroid_release2 + "]");
            }
        }
        A8.a.c(0L, "VirtualView::mode change " + oldMode + " -> " + newMode + ", nativeID=" + getNativeId$ReactAndroid_release());
        int i10 = WhenMappings.$EnumSwitchMapping$0[newMode.ordinal()];
        if (i10 == 1) {
            VirtualViewRenderState virtualViewRenderState = this.renderState;
            if (virtualViewRenderState == VirtualViewRenderState.Unknown) {
                emitSyncModeChange(VirtualViewMode.Visible);
            } else if (oldMode != VirtualViewMode.Prerender || virtualViewRenderState != VirtualViewRenderState.Rendered) {
                emitSyncModeChange(VirtualViewMode.Visible);
            }
        } else if (i10 != 2) {
            if (i10 != 3) {
                throw new NoWhenBranchMatchedException();
            }
            emitAsyncModeChange(VirtualViewMode.Hidden);
        } else if (oldMode != VirtualViewMode.Visible) {
            emitAsyncModeChange(VirtualViewMode.Prerender);
        }
        A8.a.i(0L);
    }

    private final boolean rectsOverlap(Rect rect1, Rect rect2) {
        return rect1.top < rect2.bottom && rect2.top < rect1.bottom && rect1.left < rect2.right && rect2.left < rect1.right;
    }

    private final ViewGroup traverseParentStack(boolean addListeners) {
        for (ViewParent parent = getParent(); parent != null; parent = parent.getParent()) {
            if (parent instanceof ReactScrollView) {
                return (ViewGroup) parent;
            }
            if (parent instanceof ReactHorizontalScrollView) {
                return (ViewGroup) parent;
            }
            if (parent instanceof ReactRoot) {
                return null;
            }
            if (parent instanceof View) {
                View view = (View) parent;
                view.removeOnLayoutChangeListener(this);
                if (addListeners) {
                    view.addOnLayoutChangeListener(this);
                }
            }
        }
        return null;
    }

    private final void updateParentOffset() {
        View view = this.parentScrollView;
        if (view == null) {
            return;
        }
        this.offsetX = 0;
        this.offsetY = 0;
        this.offsetChanged = false;
        for (ViewParent parent = getParent(); parent != null && !Intrinsics.areEqual(parent, view); parent = parent.getParent()) {
            if (parent instanceof View) {
                View view2 = (View) parent;
                this.offsetX += view2.getLeft();
                this.offsetY += view2.getTop();
            }
        }
    }

    public final void debugLog$ReactAndroid_release(@NotNull String subtag, @NotNull Function0<String> block) {
        boolean z10;
        Intrinsics.checkNotNullParameter(subtag, "subtag");
        Intrinsics.checkNotNullParameter(block, "block");
        if (getDebugLogEnabled()) {
            z10 = ReactVirtualViewKt.IS_DEBUG_BUILD;
            if (z10) {
                String invoke = block.invoke();
                a.b("ReactVirtualView:" + subtag, ((Object) invoke) + " [" + getId() + "][" + getNativeId$ReactAndroid_release() + "]");
                return;
            }
            String invoke2 = block.invoke();
            a.K("ReactVirtualView:" + subtag, ((Object) invoke2) + " [" + getId() + "][" + getNativeId$ReactAndroid_release() + "]");
        }
    }

    public final void doAttachedToWindow$ReactAndroid_release() {
        boolean z10;
        ViewGroup parentScrollView = getParentScrollView();
        if (parentScrollView != null) {
            this.offsetChanged = true;
            ReactScrollViewHelper.addScrollListener(this);
            ReactScrollViewHelper.addLayoutChangeListener(this);
        } else {
            parentScrollView = null;
        }
        this.parentScrollView = parentScrollView;
        if (getDebugLogEnabled()) {
            z10 = ReactVirtualViewKt.IS_DEBUG_BUILD;
            if (z10) {
                a.b("ReactVirtualView:onAttachedToWindow", ((Object) "") + " [" + getId() + "][" + getNativeId$ReactAndroid_release() + "]");
            } else {
                a.K("ReactVirtualView:onAttachedToWindow", ((Object) "") + " [" + getId() + "][" + getNativeId$ReactAndroid_release() + "]");
            }
        }
        if (this.onWindowFocusChangeListener != null) {
            getViewTreeObserver().addOnWindowFocusChangeListener(this.onWindowFocusChangeListener);
        }
        dispatchOnModeChangeIfNeeded(false);
    }

    /* renamed from: getDebugLogEnabled$ReactAndroid_release, reason: from getter */
    public final boolean getDebugLogEnabled() {
        return this.debugLogEnabled;
    }

    @Nullable
    /* renamed from: getMode$ReactAndroid_release, reason: from getter */
    public final VirtualViewMode getMode() {
        return this.mode;
    }

    @Nullable
    /* renamed from: getModeChangeEmitter$ReactAndroid_release, reason: from getter */
    public final VirtualViewModeChangeEmitter getModeChangeEmitter() {
        return this.modeChangeEmitter;
    }

    @Nullable
    public final String getNativeId$ReactAndroid_release() {
        Object tag = getTag(R.id.view_tag_native_id);
        if (tag instanceof String) {
            return (String) tag;
        }
        return null;
    }

    /* renamed from: getPrerenderRatio$ReactAndroid_release, reason: from getter */
    public final double getPrerenderRatio() {
        return this.prerenderRatio;
    }

    @NotNull
    /* renamed from: getRenderState$ReactAndroid_release, reason: from getter */
    public final VirtualViewRenderState getRenderState() {
        return this.renderState;
    }

    @Override // com.facebook.react.views.view.ReactViewGroup, android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        doAttachedToWindow$ReactAndroid_release();
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        ReactScrollViewHelper.removeScrollListener(this);
        ReactScrollViewHelper.removeLayoutChangeListener(this);
        if (this.onWindowFocusChangeListener != null) {
            getViewTreeObserver().removeOnWindowFocusChangeListener(this.onWindowFocusChangeListener);
        }
        cleanupLayoutListeners();
    }

    @Override // com.facebook.react.views.view.ReactViewGroup, android.view.ViewGroup, android.view.View
    public void onLayout(boolean changed, int left, int top, int right, int bottom) {
        super.onLayout(changed, left, top, right, bottom);
        if (changed) {
            this.offsetChanged = true;
            dispatchOnModeChangeIfNeeded(false);
        }
    }

    @Override // android.view.View.OnLayoutChangeListener
    public void onLayoutChange(@Nullable View v10, int left, int top, int right, int bottom, int oldLeft, int oldTop, int oldRight, int oldBottom) {
        this.offsetChanged = (!this.offsetChanged && oldLeft == left && oldTop == top) ? false : true;
        dispatchOnModeChangeIfNeeded(true);
    }

    @Override // com.facebook.react.views.scroll.ReactScrollViewHelper.ScrollListener
    public void onScroll(@Nullable ViewGroup scrollView, @Nullable ScrollEventType scrollEventType, float xVelocity, float yVelocity) {
        if (Intrinsics.areEqual(scrollView, this.parentScrollView)) {
            dispatchOnModeChangeIfNeeded(false);
        }
    }

    @Override // com.facebook.react.views.view.ReactViewGroup, android.view.View
    public void onSizeChanged(int w10, int h10, int oldw, int oldh) {
        super.onSizeChanged(w10, h10, oldw, oldh);
        dispatchOnModeChangeIfNeeded(true);
    }

    @Override // com.facebook.react.views.view.ReactViewGroup
    public void recycleView$ReactAndroid_release() {
        ReactScrollViewHelper.removeScrollListener(this);
        ReactScrollViewHelper.removeLayoutChangeListener(this);
        cleanupLayoutListeners();
        this.mode = null;
        this.modeChangeEmitter = null;
        this.lastRect.setEmpty();
        this.parentScrollView = null;
        this.offsetX = 0;
        this.offsetY = 0;
        this.offsetChanged = false;
        this.lastClippingRect.setEmpty();
    }

    public final void setMode$ReactAndroid_release(@Nullable VirtualViewMode virtualViewMode) {
        this.mode = virtualViewMode;
    }

    public final void setModeChangeEmitter$ReactAndroid_release(@Nullable VirtualViewModeChangeEmitter virtualViewModeChangeEmitter) {
        this.modeChangeEmitter = virtualViewModeChangeEmitter;
    }

    public final void setPrerenderRatio$ReactAndroid_release(double d10) {
        this.prerenderRatio = d10;
    }

    public final void setRenderState$ReactAndroid_release(@NotNull VirtualViewRenderState virtualViewRenderState) {
        Intrinsics.checkNotNullParameter(virtualViewRenderState, "<set-?>");
        this.renderState = virtualViewRenderState;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.facebook.react.views.view.ReactViewGroup, com.facebook.react.uimanager.ReactClippingViewGroup
    public void updateClippingRect(@Nullable Set<Integer> excludedViews) {
        if (get_removeClippedSubviews()) {
            if (this.parentScrollView == null) {
                super.updateClippingRect(excludedViews);
                return;
            }
            Rect clippingRect = getClippingRect();
            if (clippingRect == null) {
                throw new IllegalStateException("Required value was null.");
            }
            KeyEvent.Callback callback = this.parentScrollView;
            if (callback == null) {
                throw new IllegalStateException("Required value was null.");
            }
            Intrinsics.checkNotNull(callback, "null cannot be cast to non-null type com.facebook.react.uimanager.ReactClippingViewGroup");
            ReactClippingViewGroup reactClippingViewGroup = (ReactClippingViewGroup) callback;
            if (reactClippingViewGroup.getRemoveClippedSubviews()) {
                reactClippingViewGroup.getClippingRect(clippingRect);
            } else {
                ((View) reactClippingViewGroup).getDrawingRect(clippingRect);
            }
            clippingRect.intersect(this.targetRect);
            Rect rect = this.targetRect;
            clippingRect.offset(-rect.left, -rect.top);
            if (Intrinsics.areEqual(this.lastClippingRect, clippingRect)) {
                return;
            }
            updateClippingToRect$ReactAndroid_release(clippingRect, excludedViews);
            this.lastClippingRect.set(clippingRect);
        }
    }

    @Override // com.facebook.react.views.scroll.ReactScrollViewHelper.LayoutChangeListener
    public void onLayoutChange(@NotNull ViewGroup scrollView) {
        Intrinsics.checkNotNullParameter(scrollView, "scrollView");
        if (Intrinsics.areEqual(scrollView, this.parentScrollView)) {
            this.offsetChanged = true;
            dispatchOnModeChangeIfNeeded(false);
        }
    }

    @Override // com.facebook.react.views.scroll.ReactScrollViewHelper.ScrollListener
    public void onLayout(@Nullable ViewGroup scrollView) {
        if (Intrinsics.areEqual(scrollView, this.parentScrollView)) {
            dispatchOnModeChangeIfNeeded(false);
        }
    }
}
