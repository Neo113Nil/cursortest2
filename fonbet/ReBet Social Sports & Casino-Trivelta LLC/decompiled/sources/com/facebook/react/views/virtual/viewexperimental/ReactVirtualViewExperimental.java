package com.facebook.react.views.virtual.viewexperimental;

import E6.a;
import android.content.Context;
import android.graphics.Rect;
import android.view.View;
import android.view.ViewParent;
import com.facebook.react.R;
import com.facebook.react.internal.featureflags.ReactNativeFeatureFlags;
import com.facebook.react.uimanager.ReactClippingViewGroup;
import com.facebook.react.uimanager.ReactRoot;
import com.facebook.react.uimanager.ViewProps;
import com.facebook.react.views.scroll.VirtualView;
import com.facebook.react.views.scroll.VirtualViewContainer;
import com.facebook.react.views.scroll.VirtualViewContainerState;
import com.facebook.react.views.view.ReactViewGroup;
import com.facebook.react.views.virtual.VirtualViewMode;
import com.facebook.react.views.virtual.VirtualViewModeChangeEmitter;
import com.facebook.react.views.virtual.VirtualViewRenderState;
import i3.C4527h;
import java.util.Set;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000v\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0010\"\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\b\u0010+\u001a\u00020,H\u0014J\r\u0010-\u001a\u00020,H\u0001¢\u0006\u0002\b.J0\u0010/\u001a\u00020,2\u0006\u00100\u001a\u00020&2\u0006\u00101\u001a\u00020#2\u0006\u00102\u001a\u00020#2\u0006\u00103\u001a\u00020#2\u0006\u00104\u001a\u00020#H\u0014JR\u00105\u001a\u00020,2\b\u00106\u001a\u0004\u0018\u0001072\u0006\u00101\u001a\u00020#2\u0006\u00102\u001a\u00020#2\u0006\u00103\u001a\u00020#2\u0006\u00104\u001a\u00020#2\u0006\u00108\u001a\u00020#2\u0006\u00109\u001a\u00020#2\u0006\u0010:\u001a\u00020#2\u0006\u0010;\u001a\u00020#H\u0016J(\u0010<\u001a\u00020,2\u0006\u0010=\u001a\u00020#2\u0006\u0010>\u001a\u00020#2\u0006\u0010?\u001a\u00020#2\u0006\u0010@\u001a\u00020#H\u0014J\b\u0010A\u001a\u00020,H\u0014J\r\u0010B\u001a\u00020,H\u0010¢\u0006\u0002\bCJ\u0018\u0010F\u001a\u00020,2\u0006\u0010G\u001a\u00020\t2\u0006\u0010H\u001a\u00020\u001dH\u0016J\u0018\u0010I\u001a\u00020,2\u000e\u0010J\u001a\n\u0012\u0004\u0012\u00020#\u0018\u00010KH\u0016J\b\u0010L\u001a\u00020,H\u0002J\b\u0010M\u001a\u00020,H\u0002J\n\u0010N\u001a\u0004\u0018\u00010\u001bH\u0002J\b\u0010O\u001a\u00020,H\u0002J\u0012\u0010P\u001a\u0004\u0018\u00010\u001b2\u0006\u0010Q\u001a\u00020&H\u0002J)\u0010R\u001a\u00020,2\u0006\u0010S\u001a\u00020(2\u000e\b\u0002\u0010T\u001a\b\u0012\u0004\u0012\u00020(0UH\u0080\bø\u0001\u0000¢\u0006\u0002\bVR\u001c\u0010\b\u001a\u0004\u0018\u00010\tX\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR\u001c\u0010\u000e\u001a\u0004\u0018\u00010\u000fX\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R\u001a\u0010\u0014\u001a\u00020\u0015X\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019R\u0010\u0010\u001a\u001a\u0004\u0018\u00010\u001bX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u001c\u001a\u00020\u001dX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u001e\u001a\u00020\u001dX\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u001f\u001a\u00020\u001dX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b \u0010!R\u000e\u0010\"\u001a\u00020#X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010$\u001a\u00020#X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010%\u001a\u00020&X\u0082\u000e¢\u0006\u0002\n\u0000R\u0016\u0010'\u001a\u0004\u0018\u00010(8@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b)\u0010*R\u0014\u0010D\u001a\u00020(8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bE\u0010*\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006W"}, d2 = {"Lcom/facebook/react/views/virtual/viewexperimental/ReactVirtualViewExperimental;", "Lcom/facebook/react/views/view/ReactViewGroup;", "Lcom/facebook/react/views/scroll/VirtualView;", "Landroid/view/View$OnLayoutChangeListener;", "context", "Landroid/content/Context;", "<init>", "(Landroid/content/Context;)V", "mode", "Lcom/facebook/react/views/virtual/VirtualViewMode;", "getMode$ReactAndroid_release", "()Lcom/facebook/react/views/virtual/VirtualViewMode;", "setMode$ReactAndroid_release", "(Lcom/facebook/react/views/virtual/VirtualViewMode;)V", "modeChangeEmitter", "Lcom/facebook/react/views/virtual/VirtualViewModeChangeEmitter;", "getModeChangeEmitter$ReactAndroid_release", "()Lcom/facebook/react/views/virtual/VirtualViewModeChangeEmitter;", "setModeChangeEmitter$ReactAndroid_release", "(Lcom/facebook/react/views/virtual/VirtualViewModeChangeEmitter;)V", "renderState", "Lcom/facebook/react/views/virtual/VirtualViewRenderState;", "getRenderState$ReactAndroid_release", "()Lcom/facebook/react/views/virtual/VirtualViewRenderState;", "setRenderState$ReactAndroid_release", "(Lcom/facebook/react/views/virtual/VirtualViewRenderState;)V", "scrollView", "Lcom/facebook/react/views/scroll/VirtualViewContainer;", "lastContainerRelativeRect", "Landroid/graphics/Rect;", "lastClippingRect", "containerRelativeRect", "getContainerRelativeRect", "()Landroid/graphics/Rect;", "offsetX", "", "offsetY", "hadLayout", "", "nativeId", "", "getNativeId$ReactAndroid_release", "()Ljava/lang/String;", "onAttachedToWindow", "", "doAttachedToWindow", "doAttachedToWindow$ReactAndroid_release", "onLayout", "changed", ViewProps.LEFT, ViewProps.TOP, ViewProps.RIGHT, ViewProps.BOTTOM, "onLayoutChange", "v", "Landroid/view/View;", "oldLeft", "oldTop", "oldRight", "oldBottom", "onSizeChanged", "w", C4527h.f48087o, "oldw", "oldh", "onDetachedFromWindow", "recycleView", "recycleView$ReactAndroid_release", "virtualViewID", "getVirtualViewID", "onModeChange", "newMode", "thresholdRect", "updateClippingRect", "excludedViews", "", "updateParentOffset", "reportRectChangeToContainer", "getScrollView", "cleanupLayoutListeners", "traverseParentStack", "addListeners", "debugLog", "subtag", "block", "Lkotlin/Function0;", "debugLog$ReactAndroid_release", "ReactAndroid_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nReactVirtualViewExperimental.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ReactVirtualViewExperimental.kt\ncom/facebook/react/views/virtual/viewexperimental/ReactVirtualViewExperimental\n+ 2 ReactVirtualViewExperimental.kt\ncom/facebook/react/views/virtual/viewexperimental/ReactVirtualViewExperimental$debugLog$1\n*L\n1#1,306:1\n296#1,3:307\n300#1:311\n297#1,4:312\n297#1,4:316\n297#1,4:320\n297#1,4:324\n297#1,4:328\n297#1,4:332\n296#2:310\n*S KotlinDebug\n*F\n+ 1 ReactVirtualViewExperimental.kt\ncom/facebook/react/views/virtual/viewexperimental/ReactVirtualViewExperimental\n*L\n61#1:307,3\n61#1:311\n76#1:312,4\n95#1:316,4\n108#1:320,4\n143#1:324,4\n150#1:328,4\n258#1:332,4\n61#1:310\n*E\n"})
/* loaded from: classes2.dex */
public final class ReactVirtualViewExperimental extends ReactViewGroup implements VirtualView, View.OnLayoutChangeListener {

    @NotNull
    private final Rect containerRelativeRect;
    private boolean hadLayout;

    @NotNull
    private final Rect lastClippingRect;

    @NotNull
    private final Rect lastContainerRelativeRect;

    @Nullable
    private VirtualViewMode mode;

    @Nullable
    private VirtualViewModeChangeEmitter modeChangeEmitter;
    private int offsetX;
    private int offsetY;

    @NotNull
    private VirtualViewRenderState renderState;

    @Nullable
    private VirtualViewContainer scrollView;

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
    public ReactVirtualViewExperimental(@NotNull Context context) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        this.renderState = VirtualViewRenderState.Unknown;
        this.lastContainerRelativeRect = new Rect();
        this.lastClippingRect = new Rect();
        this.containerRelativeRect = new Rect();
    }

    private final void cleanupLayoutListeners() {
        traverseParentStack(false);
    }

    public static /* synthetic */ void debugLog$ReactAndroid_release$default(ReactVirtualViewExperimental reactVirtualViewExperimental, String subtag, Function0 block, int i10, Object obj) {
        boolean z10;
        if ((i10 & 2) != 0) {
            block = new Function0<String>() { // from class: com.facebook.react.views.virtual.viewexperimental.ReactVirtualViewExperimental$debugLog$1
                @Override // kotlin.jvm.functions.Function0
                public final String invoke() {
                    return "";
                }
            };
        }
        Intrinsics.checkNotNullParameter(subtag, "subtag");
        Intrinsics.checkNotNullParameter(block, "block");
        z10 = ReactVirtualViewExperimentalKt.IS_DEBUG_BUILD;
        if (z10 && ReactNativeFeatureFlags.enableVirtualViewDebugFeatures()) {
            a.b("ReactVirtualViewExperimental:[" + reactVirtualViewExperimental.getVirtualViewID() + "]:" + subtag, (String) block.invoke());
        }
    }

    private final VirtualViewContainer getScrollView() {
        return traverseParentStack(true);
    }

    private final void reportRectChangeToContainer() {
        VirtualViewContainerState virtualViewContainerState;
        boolean z10;
        if (!Intrinsics.areEqual(this.lastContainerRelativeRect, getContainerRelativeRect())) {
            VirtualViewContainer virtualViewContainer = this.scrollView;
            if (virtualViewContainer != null) {
                if (virtualViewContainer != null && (virtualViewContainerState = virtualViewContainer.getVirtualViewContainerState()) != null) {
                    virtualViewContainerState.onChange(this);
                }
                this.lastContainerRelativeRect.set(getContainerRelativeRect());
                return;
            }
            return;
        }
        z10 = ReactVirtualViewExperimentalKt.IS_DEBUG_BUILD;
        if (z10 && ReactNativeFeatureFlags.enableVirtualViewDebugFeatures()) {
            a.b("ReactVirtualViewExperimental:[" + getVirtualViewID() + "]:reportRectChangeToContainer", "no rect change " + getContainerRelativeRect());
        }
    }

    private final VirtualViewContainer traverseParentStack(boolean addListeners) {
        for (ViewParent parent = getParent(); parent != null; parent = parent.getParent()) {
            if (parent instanceof VirtualViewContainer) {
                return (VirtualViewContainer) parent;
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
        VirtualViewContainer virtualViewContainer = this.scrollView;
        if (virtualViewContainer == null) {
            return;
        }
        this.offsetX = 0;
        this.offsetY = 0;
        for (ViewParent parent = getParent(); parent != null && !Intrinsics.areEqual(parent, virtualViewContainer); parent = parent.getParent()) {
            if (parent instanceof View) {
                View view = (View) parent;
                this.offsetX += view.getLeft();
                this.offsetY += view.getTop();
            }
        }
        getContainerRelativeRect().set(getLeft() + this.offsetX, getTop() + this.offsetY, getRight() + this.offsetX, getBottom() + this.offsetY);
    }

    public final void debugLog$ReactAndroid_release(@NotNull String subtag, @NotNull Function0<String> block) {
        boolean z10;
        Intrinsics.checkNotNullParameter(subtag, "subtag");
        Intrinsics.checkNotNullParameter(block, "block");
        z10 = ReactVirtualViewExperimentalKt.IS_DEBUG_BUILD;
        if (z10 && ReactNativeFeatureFlags.enableVirtualViewDebugFeatures()) {
            a.b("ReactVirtualViewExperimental:[" + getVirtualViewID() + "]:" + subtag, block.invoke());
        }
    }

    public final void doAttachedToWindow$ReactAndroid_release() {
        boolean z10;
        this.scrollView = getScrollView();
        if (this.hadLayout) {
            updateParentOffset();
            reportRectChangeToContainer();
        }
        z10 = ReactVirtualViewExperimentalKt.IS_DEBUG_BUILD;
        if (z10 && ReactNativeFeatureFlags.enableVirtualViewDebugFeatures()) {
            a.b("ReactVirtualViewExperimental:[" + getVirtualViewID() + "]:doAttachedToWindow", "");
        }
    }

    @Override // com.facebook.react.views.scroll.VirtualView
    @NotNull
    public Rect getContainerRelativeRect() {
        return this.containerRelativeRect;
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

    @NotNull
    /* renamed from: getRenderState$ReactAndroid_release, reason: from getter */
    public final VirtualViewRenderState getRenderState() {
        return this.renderState;
    }

    @Override // com.facebook.react.views.scroll.VirtualView
    @NotNull
    public String getVirtualViewID() {
        String nativeId$ReactAndroid_release = getNativeId$ReactAndroid_release();
        if (nativeId$ReactAndroid_release == null) {
            nativeId$ReactAndroid_release = "unknown";
        }
        return nativeId$ReactAndroid_release + ":::" + getId();
    }

    @Override // com.facebook.react.views.view.ReactViewGroup, android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        doAttachedToWindow$ReactAndroid_release();
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        recycleView$ReactAndroid_release();
    }

    @Override // com.facebook.react.views.view.ReactViewGroup, android.view.ViewGroup, android.view.View
    public void onLayout(boolean changed, int left, int top, int right, int bottom) {
        boolean z10;
        super.onLayout(changed, left, top, right, bottom);
        this.hadLayout = true;
        if (changed) {
            Rect containerRelativeRect = getContainerRelativeRect();
            int i10 = this.offsetX;
            int i11 = this.offsetY;
            containerRelativeRect.set(left + i10, top + i11, right + i10, bottom + i11);
            z10 = ReactVirtualViewExperimentalKt.IS_DEBUG_BUILD;
            if (z10 && ReactNativeFeatureFlags.enableVirtualViewDebugFeatures()) {
                a.b("ReactVirtualViewExperimental:[" + getVirtualViewID() + "]:onLayout", "containerRelativeRect=" + getContainerRelativeRect());
            }
            reportRectChangeToContainer();
        }
    }

    @Override // android.view.View.OnLayoutChangeListener
    public void onLayoutChange(@Nullable View v10, int left, int top, int right, int bottom, int oldLeft, int oldTop, int oldRight, int oldBottom) {
        boolean z10;
        if (oldLeft == left && oldTop == top) {
            return;
        }
        updateParentOffset();
        z10 = ReactVirtualViewExperimentalKt.IS_DEBUG_BUILD;
        if (z10 && ReactNativeFeatureFlags.enableVirtualViewDebugFeatures()) {
            a.b("ReactVirtualViewExperimental:[" + getVirtualViewID() + "]:onLayoutChange", "containerRelativeRect=" + getContainerRelativeRect());
        }
        reportRectChangeToContainer();
    }

    @Override // com.facebook.react.views.scroll.VirtualView
    public void onModeChange(@NotNull VirtualViewMode newMode, @NotNull Rect thresholdRect) {
        boolean z10;
        VirtualViewModeChangeEmitter virtualViewModeChangeEmitter;
        VirtualViewModeChangeEmitter virtualViewModeChangeEmitter2;
        boolean z11;
        Intrinsics.checkNotNullParameter(newMode, "newMode");
        Intrinsics.checkNotNullParameter(thresholdRect, "thresholdRect");
        if (this.modeChangeEmitter == null || this.scrollView == null) {
            return;
        }
        VirtualViewMode virtualViewMode = VirtualViewMode.Visible;
        if (newMode == virtualViewMode) {
            updateClippingRect(null);
        }
        VirtualViewMode virtualViewMode2 = this.mode;
        if (newMode == virtualViewMode2) {
            z11 = ReactVirtualViewExperimentalKt.IS_DEBUG_BUILD;
            if (z11 && ReactNativeFeatureFlags.enableVirtualViewDebugFeatures()) {
                a.b("ReactVirtualViewExperimental:[" + getVirtualViewID() + "]:onModeChange", "no change " + newMode);
                return;
            }
            return;
        }
        this.mode = newMode;
        z10 = ReactVirtualViewExperimentalKt.IS_DEBUG_BUILD;
        if (z10 && ReactNativeFeatureFlags.enableVirtualViewDebugFeatures()) {
            a.b("ReactVirtualViewExperimental:[" + getVirtualViewID() + "]:onModeChange", virtualViewMode2 + "->" + newMode);
        }
        if (virtualViewMode2 == virtualViewMode) {
            updateClippingRect(null);
        }
        int i10 = WhenMappings.$EnumSwitchMapping$0[newMode.ordinal()];
        if (i10 != 1) {
            if (i10 == 2) {
                if (virtualViewMode2 == virtualViewMode || (virtualViewModeChangeEmitter2 = this.modeChangeEmitter) == null) {
                    return;
                }
                virtualViewModeChangeEmitter2.emitModeChange(VirtualViewMode.Prerender, getContainerRelativeRect(), thresholdRect, false);
                return;
            }
            if (i10 != 3) {
                throw new NoWhenBranchMatchedException();
            }
            VirtualViewModeChangeEmitter virtualViewModeChangeEmitter3 = this.modeChangeEmitter;
            if (virtualViewModeChangeEmitter3 != null) {
                virtualViewModeChangeEmitter3.emitModeChange(VirtualViewMode.Hidden, getContainerRelativeRect(), thresholdRect, false);
                return;
            }
            return;
        }
        VirtualViewRenderState virtualViewRenderState = this.renderState;
        if (virtualViewRenderState == VirtualViewRenderState.Unknown) {
            VirtualViewModeChangeEmitter virtualViewModeChangeEmitter4 = this.modeChangeEmitter;
            if (virtualViewModeChangeEmitter4 != null) {
                virtualViewModeChangeEmitter4.emitModeChange(virtualViewMode, getContainerRelativeRect(), thresholdRect, true);
                return;
            }
            return;
        }
        if ((virtualViewMode2 == VirtualViewMode.Prerender && virtualViewRenderState == VirtualViewRenderState.Rendered) || (virtualViewModeChangeEmitter = this.modeChangeEmitter) == null) {
            return;
        }
        virtualViewModeChangeEmitter.emitModeChange(virtualViewMode, getContainerRelativeRect(), thresholdRect, true);
    }

    @Override // com.facebook.react.views.view.ReactViewGroup, android.view.View
    public void onSizeChanged(int w10, int h10, int oldw, int oldh) {
        boolean z10;
        super.onSizeChanged(w10, h10, oldw, oldh);
        getContainerRelativeRect().set(getLeft() + this.offsetX, getTop() + this.offsetY, getRight() + this.offsetX, getBottom() + this.offsetY);
        z10 = ReactVirtualViewExperimentalKt.IS_DEBUG_BUILD;
        if (z10 && ReactNativeFeatureFlags.enableVirtualViewDebugFeatures()) {
            a.b("ReactVirtualViewExperimental:[" + getVirtualViewID() + "]:onSizeChanged", "container=" + getContainerRelativeRect());
        }
        reportRectChangeToContainer();
    }

    @Override // com.facebook.react.views.view.ReactViewGroup
    public void recycleView$ReactAndroid_release() {
        VirtualViewContainerState virtualViewContainerState;
        cleanupLayoutListeners();
        VirtualViewContainer virtualViewContainer = this.scrollView;
        if (virtualViewContainer != null && (virtualViewContainerState = virtualViewContainer.getVirtualViewContainerState()) != null) {
            virtualViewContainerState.remove(this);
        }
        this.scrollView = null;
        this.mode = null;
        this.modeChangeEmitter = null;
        this.hadLayout = false;
        this.lastContainerRelativeRect.setEmpty();
        this.lastClippingRect.setEmpty();
        getContainerRelativeRect().setEmpty();
    }

    public final void setMode$ReactAndroid_release(@Nullable VirtualViewMode virtualViewMode) {
        this.mode = virtualViewMode;
    }

    public final void setModeChangeEmitter$ReactAndroid_release(@Nullable VirtualViewModeChangeEmitter virtualViewModeChangeEmitter) {
        this.modeChangeEmitter = virtualViewModeChangeEmitter;
    }

    public final void setRenderState$ReactAndroid_release(@NotNull VirtualViewRenderState virtualViewRenderState) {
        Intrinsics.checkNotNullParameter(virtualViewRenderState, "<set-?>");
        this.renderState = virtualViewRenderState;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.facebook.react.views.view.ReactViewGroup, com.facebook.react.uimanager.ReactClippingViewGroup
    public void updateClippingRect(@Nullable Set<Integer> excludedViews) {
        if (get_removeClippedSubviews()) {
            if (this.scrollView == null) {
                super.updateClippingRect(excludedViews);
                return;
            }
            Rect clippingRect = getClippingRect();
            if (clippingRect == null) {
                throw new IllegalStateException("Required value was null.");
            }
            VirtualViewContainer virtualViewContainer = this.scrollView;
            if (virtualViewContainer == null) {
                throw new IllegalStateException("Required value was null.");
            }
            Intrinsics.checkNotNull(virtualViewContainer, "null cannot be cast to non-null type com.facebook.react.uimanager.ReactClippingViewGroup");
            ReactClippingViewGroup reactClippingViewGroup = (ReactClippingViewGroup) virtualViewContainer;
            if (reactClippingViewGroup.getRemoveClippedSubviews()) {
                reactClippingViewGroup.getClippingRect(clippingRect);
            } else {
                ((View) reactClippingViewGroup).getDrawingRect(clippingRect);
            }
            clippingRect.intersect(getContainerRelativeRect());
            clippingRect.offset(-getContainerRelativeRect().left, -getContainerRelativeRect().top);
            if (Intrinsics.areEqual(this.lastClippingRect, clippingRect)) {
                return;
            }
            updateClippingToRect$ReactAndroid_release(clippingRect, excludedViews);
            this.lastClippingRect.set(clippingRect);
        }
    }
}
