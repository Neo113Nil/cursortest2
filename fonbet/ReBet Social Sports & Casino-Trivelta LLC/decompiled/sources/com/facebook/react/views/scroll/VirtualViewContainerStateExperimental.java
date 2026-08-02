package com.facebook.react.views.scroll;

import android.graphics.Rect;
import android.view.ViewGroup;
import com.facebook.react.internal.featureflags.ReactNativeFeatureFlags;
import com.facebook.react.views.virtual.VirtualViewMode;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.collections.SetsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010#\n\u0002\u0010\u000e\n\u0002\b\u000b\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u001cH\u0016J\u0012\u0010\u001d\u001a\u00020\u001a2\b\u0010\u001b\u001a\u0004\u0018\u00010\u001cH\u0014J\u0010\u0010\u001e\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u001cH\u0016J\u0010\u0010\u001f\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u001cH\u0002J\b\u0010 \u001a\u00020\u001aH\u0002R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\b\u001a\u00020\tX\u0094\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR \u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000e0\rX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R \u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u000e0\rX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u0010\"\u0004\b\u0015\u0010\u0012R \u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u000e0\rX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\u0010\"\u0004\b\u0018\u0010\u0012¨\u0006!"}, d2 = {"Lcom/facebook/react/views/scroll/VirtualViewContainerStateExperimental;", "Lcom/facebook/react/views/scroll/VirtualViewContainerState;", "scrollView", "Landroid/view/ViewGroup;", "<init>", "(Landroid/view/ViewGroup;)V", "horizontal", "", "virtualViews", "Lcom/facebook/react/views/scroll/IntervalTree;", "getVirtualViews", "()Lcom/facebook/react/views/scroll/IntervalTree;", "HPV", "", "", "getHPV", "()Ljava/util/Set;", "setHPV", "(Ljava/util/Set;)V", "P", "getP", "setP", "V", "getV", "setV", "onChange", "", "virtualView", "Lcom/facebook/react/views/scroll/VirtualView;", "updateModes", "remove", "updateMode", "updateModesAll", "ReactAndroid_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nVirtualViewContainerStateExperimental.kt\nKotlin\n*S Kotlin\n*F\n+ 1 VirtualViewContainerStateExperimental.kt\ncom/facebook/react/views/scroll/VirtualViewContainerStateExperimental\n+ 2 VirtualViewContainerStateExperimental.kt\ncom/facebook/react/views/scroll/VirtualViewContainerStateExperimentalKt\n*L\n1#1,534:1\n530#2,4:535\n530#2,4:539\n530#2,4:543\n530#2,4:547\n530#2,4:551\n*S KotlinDebug\n*F\n+ 1 VirtualViewContainerStateExperimental.kt\ncom/facebook/react/views/scroll/VirtualViewContainerStateExperimental\n*L\n36#1:535,4\n38#1:539,4\n133#1:543,4\n139#1:547,4\n150#1:551,4\n*E\n"})
/* loaded from: classes2.dex */
public final class VirtualViewContainerStateExperimental extends VirtualViewContainerState {

    @NotNull
    private Set<String> HPV;

    @NotNull
    private Set<String> P;

    @NotNull
    private Set<String> V;
    private final boolean horizontal;

    @NotNull
    private final IntervalTree virtualViews;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public VirtualViewContainerStateExperimental(@NotNull ViewGroup scrollView) {
        super(scrollView);
        Intrinsics.checkNotNullParameter(scrollView, "scrollView");
        boolean z10 = false;
        if (!(scrollView instanceof ReactScrollView) && (scrollView instanceof ReactHorizontalScrollView)) {
            z10 = true;
        }
        this.horizontal = z10;
        this.virtualViews = new IntervalTree(z10);
        this.HPV = new LinkedHashSet();
        this.P = new LinkedHashSet();
        this.V = new LinkedHashSet();
    }

    private final void updateMode(VirtualView virtualView) {
        VirtualViewMode virtualViewMode;
        Rect containerRelativeRect = virtualView.getContainerRelativeRect();
        VirtualViewMode virtualViewMode2 = VirtualViewMode.Hidden;
        Rect emptyRect = getEmptyRect();
        if (VirtualViewContainerKt.rectsOverlap(containerRelativeRect, getVisibleRect())) {
            emptyRect = getVisibleRect();
            virtualViewMode = getOnWindowFocusChangeListener() != null ? getScrollView().hasWindowFocus() ? VirtualViewMode.Visible : VirtualViewMode.Prerender : VirtualViewMode.Visible;
        } else if (VirtualViewContainerKt.rectsOverlap(containerRelativeRect, getPrerenderRect())) {
            virtualViewMode = VirtualViewMode.Prerender;
            emptyRect = getPrerenderRect();
        } else {
            virtualViewMode = (getHysteresisRatio() <= 0.0d || !VirtualViewContainerKt.rectsOverlap(containerRelativeRect, getHysteresisRect())) ? virtualViewMode2 : null;
        }
        if (virtualViewMode != null) {
            virtualView.onModeChange(virtualViewMode, emptyRect);
        }
        if (virtualViewMode == VirtualViewMode.Visible) {
            this.HPV.add(virtualView.getVirtualViewID());
            this.P.remove(virtualView.getVirtualViewID());
            this.V.add(virtualView.getVirtualViewID());
        } else if (virtualViewMode == VirtualViewMode.Prerender) {
            this.HPV.add(virtualView.getVirtualViewID());
            this.P.add(virtualView.getVirtualViewID());
            this.V.remove(virtualView.getVirtualViewID());
        } else if (virtualViewMode == virtualViewMode2) {
            this.HPV.remove(virtualView.getVirtualViewID());
            this.P.remove(virtualView.getVirtualViewID());
            this.V.remove(virtualView.getVirtualViewID());
        } else {
            this.HPV.add(virtualView.getVirtualViewID());
            this.P.remove(virtualView.getVirtualViewID());
            this.V.remove(virtualView.getVirtualViewID());
        }
    }

    private final void updateModesAll() {
        Set<String> query = getVirtualViews().query(getVisibleRect());
        Set<String> query2 = getVirtualViews().query(getPrerenderRect());
        Set<String> query3 = getVirtualViews().query(getHysteresisRect());
        if (VirtualViewContainerKt.getIS_DEBUG_BUILD() && ReactNativeFeatureFlags.enableVirtualViewDebugFeatures()) {
            E6.a.b("VirtualViewContainerStateExperimental:updateModes", "V: " + this.V + ", P: " + this.P + ", HPV: " + this.HPV);
        }
        Set minus = SetsKt.minus((Set) query2, (Iterable) query);
        if (VirtualViewContainerKt.getIS_DEBUG_BUILD() && ReactNativeFeatureFlags.enableVirtualViewDebugFeatures()) {
            E6.a.b("VirtualViewContainerStateExperimental:updateModes", "V': " + query + ", P': " + minus + ", HPV': " + query3);
        }
        Set minus2 = SetsKt.minus((Set) query, (Iterable) this.V);
        Set minus3 = SetsKt.minus(minus, (Iterable) this.P);
        Set minus4 = SetsKt.minus((Set) this.HPV, (Iterable) query3);
        if (VirtualViewContainerKt.getIS_DEBUG_BUILD() && ReactNativeFeatureFlags.enableVirtualViewDebugFeatures()) {
            E6.a.b("VirtualViewContainerStateExperimental:updateModes", "toV: " + minus2 + ", toP: " + minus3 + ", toH: " + minus4);
        }
        Iterator it = minus2.iterator();
        while (it.hasNext()) {
            VirtualView virtualView = getVirtualViews().getVirtualView((String) it.next());
            if (virtualView != null) {
                virtualView.onModeChange(VirtualViewMode.Visible, getVisibleRect());
            }
        }
        Iterator it2 = minus3.iterator();
        while (it2.hasNext()) {
            VirtualView virtualView2 = getVirtualViews().getVirtualView((String) it2.next());
            if (virtualView2 != null) {
                virtualView2.onModeChange(VirtualViewMode.Prerender, getPrerenderRect());
            }
        }
        Iterator it3 = minus4.iterator();
        while (it3.hasNext()) {
            VirtualView virtualView3 = getVirtualViews().getVirtualView((String) it3.next());
            if (virtualView3 != null) {
                virtualView3.onModeChange(VirtualViewMode.Hidden, getEmptyRect());
            }
        }
        this.V = query;
        this.P = CollectionsKt.toMutableSet(minus);
        this.HPV = CollectionsKt.toMutableSet(query3);
    }

    @NotNull
    public final Set<String> getHPV() {
        return this.HPV;
    }

    @NotNull
    public final Set<String> getP() {
        return this.P;
    }

    @NotNull
    public final Set<String> getV() {
        return this.V;
    }

    @Override // com.facebook.react.views.scroll.VirtualViewContainerState
    public void onChange(@NotNull VirtualView virtualView) {
        Intrinsics.checkNotNullParameter(virtualView, "virtualView");
        if (getVirtualViews().add(virtualView)) {
            if (VirtualViewContainerKt.getIS_DEBUG_BUILD() && ReactNativeFeatureFlags.enableVirtualViewDebugFeatures()) {
                E6.a.b("VirtualViewContainerStateExperimental:add", "virtualViewID=" + virtualView.getVirtualViewID());
            }
        } else if (VirtualViewContainerKt.getIS_DEBUG_BUILD() && ReactNativeFeatureFlags.enableVirtualViewDebugFeatures()) {
            E6.a.b("VirtualViewContainerStateExperimental:update", "virtualViewID=" + virtualView.getVirtualViewID());
        }
        updateModes(virtualView);
    }

    @Override // com.facebook.react.views.scroll.VirtualViewContainerState
    public void remove(@NotNull VirtualView virtualView) {
        Intrinsics.checkNotNullParameter(virtualView, "virtualView");
        super.remove(virtualView);
        this.HPV.remove(virtualView.getVirtualViewID());
        this.P.remove(virtualView.getVirtualViewID());
        this.V.remove(virtualView.getVirtualViewID());
    }

    public final void setHPV(@NotNull Set<String> set) {
        Intrinsics.checkNotNullParameter(set, "<set-?>");
        this.HPV = set;
    }

    public final void setP(@NotNull Set<String> set) {
        Intrinsics.checkNotNullParameter(set, "<set-?>");
        this.P = set;
    }

    public final void setV(@NotNull Set<String> set) {
        Intrinsics.checkNotNullParameter(set, "<set-?>");
        this.V = set;
    }

    @Override // com.facebook.react.views.scroll.VirtualViewContainerState
    public void updateModes(@Nullable VirtualView virtualView) {
        updateRects();
        if (virtualView != null) {
            updateMode(virtualView);
        } else {
            updateModesAll();
        }
    }

    @Override // com.facebook.react.views.scroll.VirtualViewContainerState
    @NotNull
    public IntervalTree getVirtualViews() {
        return this.virtualViews;
    }
}
