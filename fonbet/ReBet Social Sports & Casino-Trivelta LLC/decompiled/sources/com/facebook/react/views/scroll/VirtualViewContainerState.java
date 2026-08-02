package com.facebook.react.views.scroll;

import android.graphics.Rect;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import com.facebook.react.internal.featureflags.ReactNativeFeatureFlags;
import java.util.Collection;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0006\n\u0002\b\u0005\n\u0002\u0010\u001f\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\b\b \u0018\u0000 )2\u00020\u0001:\u0001)B\u0011\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0006\u0010!\u001a\u00020\"J\u0010\u0010#\u001a\u00020\"2\u0006\u0010$\u001a\u00020\u000eH\u0016J\u0010\u0010%\u001a\u00020\"2\u0006\u0010$\u001a\u00020\u000eH\u0016J\u0006\u0010&\u001a\u00020\"J\b\u0010'\u001a\u00020\"H\u0004J\u0014\u0010(\u001a\u00020\"2\n\b\u0002\u0010$\u001a\u0004\u0018\u00010\u000eH$R\u0014\u0010\u0006\u001a\u00020\u0007X\u0084\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0014\u0010\n\u001a\u00020\u0007X\u0084\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\tR\u0018\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000e0\rX¤\u0004¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0011\u001a\u00020\u0012X\u0084\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0015\u001a\u00020\u0012X\u0084\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0014R\u0014\u0010\u0017\u001a\u00020\u0012X\u0084\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0014R\u0014\u0010\u0019\u001a\u00020\u0012X\u0084\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0014R\u0016\u0010\u001b\u001a\u0004\u0018\u00010\u001cX\u0084\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001eR\u0014\u0010\u0002\u001a\u00020\u0003X\u0084\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010 ¨\u0006*"}, d2 = {"Lcom/facebook/react/views/scroll/VirtualViewContainerState;", "", "scrollView", "Landroid/view/ViewGroup;", "<init>", "(Landroid/view/ViewGroup;)V", "prerenderRatio", "", "getPrerenderRatio", "()D", "hysteresisRatio", "getHysteresisRatio", "virtualViews", "", "Lcom/facebook/react/views/scroll/VirtualView;", "getVirtualViews", "()Ljava/util/Collection;", "emptyRect", "Landroid/graphics/Rect;", "getEmptyRect", "()Landroid/graphics/Rect;", "visibleRect", "getVisibleRect", "prerenderRect", "getPrerenderRect", "hysteresisRect", "getHysteresisRect", "onWindowFocusChangeListener", "Landroid/view/ViewTreeObserver$OnWindowFocusChangeListener;", "getOnWindowFocusChangeListener", "()Landroid/view/ViewTreeObserver$OnWindowFocusChangeListener;", "getScrollView", "()Landroid/view/ViewGroup;", "cleanup", "", "onChange", "virtualView", "remove", "updateState", "updateRects", "updateModes", "Companion", "ReactAndroid_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nVirtualViewContainer.kt\nKotlin\n*S Kotlin\n*F\n+ 1 VirtualViewContainer.kt\ncom/facebook/react/views/scroll/VirtualViewContainerState\n+ 2 VirtualViewContainer.kt\ncom/facebook/react/views/scroll/VirtualViewContainerKt\n+ 3 VirtualViewContainer.kt\ncom/facebook/react/views/scroll/VirtualViewContainerKt$debugLog$1\n*L\n1#1,165:1\n161#2,4:166\n161#2,4:170\n161#2,4:174\n160#2,3:178\n164#2:182\n161#2,4:183\n161#2,4:187\n160#2,3:191\n164#2:195\n160#3:181\n160#3:194\n*S KotlinDebug\n*F\n+ 1 VirtualViewContainer.kt\ncom/facebook/react/views/scroll/VirtualViewContainerState\n*L\n94#1:166,4\n96#1:170,4\n105#1:174,4\n110#1:178,3\n110#1:182\n125#1:183,4\n145#1:187,4\n60#1:191,3\n60#1:195\n110#1:181\n60#1:194\n*E\n"})
/* loaded from: classes2.dex */
public abstract class VirtualViewContainerState {

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private final Rect emptyRect;
    private final double hysteresisRatio;

    @NotNull
    private final Rect hysteresisRect;

    @Nullable
    private final ViewTreeObserver.OnWindowFocusChangeListener onWindowFocusChangeListener;
    private final double prerenderRatio;

    @NotNull
    private final Rect prerenderRect;

    @NotNull
    private final ViewGroup scrollView;

    @NotNull
    private final Rect visibleRect;

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0007¨\u0006\b"}, d2 = {"Lcom/facebook/react/views/scroll/VirtualViewContainerState$Companion;", "", "<init>", "()V", "create", "Lcom/facebook/react/views/scroll/VirtualViewContainerState;", "scrollView", "Landroid/view/ViewGroup;", "ReactAndroid_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @JvmStatic
        @NotNull
        public final VirtualViewContainerState create(@NotNull ViewGroup scrollView) {
            Intrinsics.checkNotNullParameter(scrollView, "scrollView");
            return ReactNativeFeatureFlags.enableVirtualViewContainerStateExperimental() ? new VirtualViewContainerStateExperimental(scrollView) : new VirtualViewContainerStateClassic(scrollView);
        }

        private Companion() {
        }
    }

    public VirtualViewContainerState(@NotNull ViewGroup scrollView) {
        Intrinsics.checkNotNullParameter(scrollView, "scrollView");
        this.prerenderRatio = ReactNativeFeatureFlags.virtualViewPrerenderRatio();
        this.hysteresisRatio = ReactNativeFeatureFlags.virtualViewHysteresisRatio();
        this.emptyRect = new Rect();
        this.visibleRect = new Rect();
        this.prerenderRect = new Rect();
        this.hysteresisRect = new Rect();
        ViewTreeObserver.OnWindowFocusChangeListener onWindowFocusChangeListener = ReactNativeFeatureFlags.enableVirtualViewWindowFocusDetection() ? new ViewTreeObserver.OnWindowFocusChangeListener() { // from class: com.facebook.react.views.scroll.b
            @Override // android.view.ViewTreeObserver.OnWindowFocusChangeListener
            public final void onWindowFocusChanged(boolean z10) {
                VirtualViewContainerState.onWindowFocusChangeListener$lambda$0(VirtualViewContainerState.this, z10);
            }
        } : null;
        this.onWindowFocusChangeListener = onWindowFocusChangeListener;
        this.scrollView = scrollView;
        if (onWindowFocusChangeListener != null) {
            scrollView.getViewTreeObserver().addOnWindowFocusChangeListener(onWindowFocusChangeListener);
        }
    }

    @JvmStatic
    @NotNull
    public static final VirtualViewContainerState create(@NotNull ViewGroup viewGroup) {
        return INSTANCE.create(viewGroup);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onWindowFocusChangeListener$lambda$0(VirtualViewContainerState virtualViewContainerState, boolean z10) {
        if (VirtualViewContainerKt.getIS_DEBUG_BUILD() && ReactNativeFeatureFlags.enableVirtualViewDebugFeatures()) {
            E6.a.b("VirtualViewContainerState:onWindowFocusChanged", "");
        }
        updateModes$default(virtualViewContainerState, null, 1, null);
    }

    public static /* synthetic */ void updateModes$default(VirtualViewContainerState virtualViewContainerState, VirtualView virtualView, int i10, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: updateModes");
        }
        if ((i10 & 1) != 0) {
            virtualView = null;
        }
        virtualViewContainerState.updateModes(virtualView);
    }

    public final void cleanup() {
        if (this.onWindowFocusChangeListener != null) {
            this.scrollView.getViewTreeObserver().removeOnWindowFocusChangeListener(this.onWindowFocusChangeListener);
        }
    }

    @NotNull
    public final Rect getEmptyRect() {
        return this.emptyRect;
    }

    public final double getHysteresisRatio() {
        return this.hysteresisRatio;
    }

    @NotNull
    public final Rect getHysteresisRect() {
        return this.hysteresisRect;
    }

    @Nullable
    public final ViewTreeObserver.OnWindowFocusChangeListener getOnWindowFocusChangeListener() {
        return this.onWindowFocusChangeListener;
    }

    public final double getPrerenderRatio() {
        return this.prerenderRatio;
    }

    @NotNull
    public final Rect getPrerenderRect() {
        return this.prerenderRect;
    }

    @NotNull
    public final ViewGroup getScrollView() {
        return this.scrollView;
    }

    @NotNull
    public abstract Collection<VirtualView> getVirtualViews();

    @NotNull
    public final Rect getVisibleRect() {
        return this.visibleRect;
    }

    public void onChange(@NotNull VirtualView virtualView) {
        Intrinsics.checkNotNullParameter(virtualView, "virtualView");
        if (getVirtualViews().add(virtualView)) {
            if (VirtualViewContainerKt.getIS_DEBUG_BUILD() && ReactNativeFeatureFlags.enableVirtualViewDebugFeatures()) {
                E6.a.b("VirtualViewContainerState:add", "virtualViewID=" + virtualView.getVirtualViewID());
            }
        } else if (VirtualViewContainerKt.getIS_DEBUG_BUILD() && ReactNativeFeatureFlags.enableVirtualViewDebugFeatures()) {
            E6.a.b("VirtualViewContainerState:update", "virtualViewID=" + virtualView.getVirtualViewID());
        }
        updateModes(virtualView);
    }

    public void remove(@NotNull VirtualView virtualView) {
        Intrinsics.checkNotNullParameter(virtualView, "virtualView");
        getVirtualViews().remove(virtualView);
        if (VirtualViewContainerKt.getIS_DEBUG_BUILD() && ReactNativeFeatureFlags.enableVirtualViewDebugFeatures()) {
            E6.a.b("VirtualViewContainerState:remove", "virtualViewID=" + virtualView.getVirtualViewID());
        }
    }

    public abstract void updateModes(@Nullable VirtualView virtualView);

    public final void updateRects() {
        this.scrollView.getDrawingRect(this.visibleRect);
        if (this.visibleRect.isEmpty()) {
            if (VirtualViewContainerKt.getIS_DEBUG_BUILD() && ReactNativeFeatureFlags.enableVirtualViewDebugFeatures()) {
                E6.a.b("VirtualViewContainerState:updateRects", "scrollView visibleRect is empty");
            }
            this.prerenderRect.set(this.visibleRect);
            this.hysteresisRect.set(this.prerenderRect);
            return;
        }
        this.prerenderRect.set(this.visibleRect);
        this.prerenderRect.inset((int) ((-r0.width()) * this.prerenderRatio), (int) ((-this.prerenderRect.height()) * this.prerenderRatio));
        this.hysteresisRect.set(this.prerenderRect);
        this.hysteresisRect.inset((int) ((-this.visibleRect.width()) * this.hysteresisRatio), (int) ((-this.visibleRect.height()) * this.hysteresisRatio));
        if (VirtualViewContainerKt.getIS_DEBUG_BUILD() && ReactNativeFeatureFlags.enableVirtualViewDebugFeatures()) {
            E6.a.b("VirtualViewContainerState:updateRects", "visibleRect " + this.visibleRect + " prerenderRect " + this.prerenderRect + " hysteresisRect " + this.hysteresisRect);
        }
    }

    public final void updateState() {
        if (VirtualViewContainerKt.getIS_DEBUG_BUILD() && ReactNativeFeatureFlags.enableVirtualViewDebugFeatures()) {
            E6.a.b("VirtualViewContainerState:updateState", "");
        }
        updateModes$default(this, null, 1, null);
    }
}
