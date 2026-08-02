package com.facebook.react.views.virtual.view;

import E6.a;
import com.facebook.react.internal.featureflags.ReactNativeFeatureFlags;
import com.facebook.react.module.annotations.ReactModule;
import com.facebook.react.uimanager.ThemedReactContext;
import com.facebook.react.uimanager.UIManagerHelper;
import com.facebook.react.uimanager.ViewManagerDelegate;
import com.facebook.react.uimanager.annotations.ReactProp;
import com.facebook.react.uimanager.events.EventDispatcher;
import com.facebook.react.viewmanagers.VirtualViewManagerDelegate;
import com.facebook.react.viewmanagers.VirtualViewManagerInterface;
import com.facebook.react.views.view.ReactClippingViewManager;
import com.facebook.react.views.virtual.VirtualViewMode;
import com.facebook.react.views.virtual.VirtualViewRenderState;
import com.twilio.voice.EventKeys;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\b\u0007\u0018\u0000 \u001b2\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00020\u0003:\u0001\u001bB\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\u000e\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00020\nH\u0014J\b\u0010\u000b\u001a\u00020\fH\u0016J\u0010\u0010\r\u001a\u00020\u00022\u0006\u0010\u000e\u001a\u00020\u000fH\u0014J\u0018\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00022\u0006\u0010\u0013\u001a\u00020\u0014H\u0017J\u0018\u0010\u0015\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00022\u0006\u0010\u0013\u001a\u00020\u0016H\u0017J\u001a\u0010\u0017\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00022\b\u0010\u0018\u001a\u0004\u0018\u00010\fH\u0016J\u0018\u0010\u0019\u001a\u00020\u00112\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u0002H\u0014J\u001a\u0010\u001a\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u0002H\u0014R*\u0010\u0006\u001a\u001e\u0012\f\u0012\n \b*\u0004\u0018\u00010\u00020\u0002\u0012\f\u0012\n \b*\u0004\u0018\u00010\u00000\u00000\u0007X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u001c"}, d2 = {"Lcom/facebook/react/views/virtual/view/ReactVirtualViewManager;", "Lcom/facebook/react/views/view/ReactClippingViewManager;", "Lcom/facebook/react/views/virtual/view/ReactVirtualView;", "Lcom/facebook/react/viewmanagers/VirtualViewManagerInterface;", "<init>", "()V", "_delegate", "Lcom/facebook/react/viewmanagers/VirtualViewManagerDelegate;", "kotlin.jvm.PlatformType", "getDelegate", "Lcom/facebook/react/uimanager/ViewManagerDelegate;", "getName", "", "createViewInstance", "reactContext", "Lcom/facebook/react/uimanager/ThemedReactContext;", "setInitialHidden", "", "view", EventKeys.VALUE_KEY, "", "setRenderState", "", "setNativeId", "nativeId", "addEventEmitters", "prepareToRecycleView", "Companion", "ReactAndroid_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@ReactModule(name = ReactVirtualViewManager.REACT_CLASS)
@SourceDebugExtension({"SMAP\nReactVirtualViewManager.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ReactVirtualViewManager.kt\ncom/facebook/react/views/virtual/view/ReactVirtualViewManager\n+ 2 ReactVirtualView.kt\ncom/facebook/react/views/virtual/view/ReactVirtualView\n*L\n1#1,108:1\n431#2,9:109\n*S KotlinDebug\n*F\n+ 1 ReactVirtualViewManager.kt\ncom/facebook/react/views/virtual/view/ReactVirtualViewManager\n*L\n62#1:109,9\n*E\n"})
/* loaded from: classes2.dex */
public final class ReactVirtualViewManager extends ReactClippingViewManager<ReactVirtualView> implements VirtualViewManagerInterface<ReactVirtualView> {

    @NotNull
    public static final String REACT_CLASS = "VirtualView";

    @NotNull
    private final VirtualViewManagerDelegate<ReactVirtualView, ReactVirtualViewManager> _delegate = new VirtualViewManagerDelegate<>(this);

    @Override // com.facebook.react.uimanager.ViewManager
    @NotNull
    public ViewManagerDelegate<ReactVirtualView> getDelegate() {
        return this._delegate;
    }

    @Override // com.facebook.react.uimanager.ViewManager, com.facebook.react.bridge.NativeModule
    @NotNull
    public String getName() {
        return REACT_CLASS;
    }

    @Override // com.facebook.react.viewmanagers.VirtualViewManagerInterface
    public /* bridge */ /* synthetic */ void setRemoveClippedSubviews(ReactVirtualView reactVirtualView, boolean z10) {
        setRemoveClippedSubviews((ReactVirtualViewManager) reactVirtualView, z10);
    }

    @Override // com.facebook.react.uimanager.BaseViewManager, com.facebook.react.uimanager.ViewManager
    public void addEventEmitters(@NotNull ThemedReactContext reactContext, @NotNull ReactVirtualView view) {
        Intrinsics.checkNotNullParameter(reactContext, "reactContext");
        Intrinsics.checkNotNullParameter(view, "view");
        EventDispatcher eventDispatcherForReactTag = UIManagerHelper.getEventDispatcherForReactTag(reactContext, view.getId());
        if (eventDispatcherForReactTag == null) {
            return;
        }
        view.setModeChangeEmitter$ReactAndroid_release(new VirtualViewEventEmitter(view.getId(), UIManagerHelper.getSurfaceId(reactContext), eventDispatcherForReactTag));
    }

    @Override // com.facebook.react.uimanager.ViewManager
    @NotNull
    public ReactVirtualView createViewInstance(@NotNull ThemedReactContext reactContext) {
        Intrinsics.checkNotNullParameter(reactContext, "reactContext");
        return new ReactVirtualView(reactContext);
    }

    @Override // com.facebook.react.uimanager.BaseViewManager, com.facebook.react.uimanager.ViewManager
    @Nullable
    public ReactVirtualView prepareToRecycleView(@NotNull ThemedReactContext reactContext, @NotNull ReactVirtualView view) {
        Intrinsics.checkNotNullParameter(reactContext, "reactContext");
        Intrinsics.checkNotNullParameter(view, "view");
        view.recycleView$ReactAndroid_release();
        return (ReactVirtualView) super.prepareToRecycleView(reactContext, (ThemedReactContext) view);
    }

    @Override // com.facebook.react.viewmanagers.VirtualViewManagerInterface
    @ReactProp(name = "initialHidden")
    public void setInitialHidden(@NotNull ReactVirtualView view, boolean value) {
        Intrinsics.checkNotNullParameter(view, "view");
        if (view.getMode() == null) {
            view.setMode$ReactAndroid_release(value ? VirtualViewMode.Hidden : VirtualViewMode.Visible);
        }
    }

    @Override // com.facebook.react.uimanager.BaseViewManager
    public void setNativeId(@NotNull ReactVirtualView view, @Nullable String nativeId) {
        boolean z10;
        Intrinsics.checkNotNullParameter(view, "view");
        super.setNativeId((ReactVirtualViewManager) view, nativeId);
        if (view.getDebugLogEnabled()) {
            z10 = ReactVirtualViewKt.IS_DEBUG_BUILD;
            if (z10) {
                String valueOf = String.valueOf(view.getId());
                a.b("ReactVirtualView:setNativeId", ((Object) valueOf) + " [" + view.getId() + "][" + view.getNativeId$ReactAndroid_release() + "]");
                return;
            }
            String valueOf2 = String.valueOf(view.getId());
            a.K("ReactVirtualView:setNativeId", ((Object) valueOf2) + " [" + view.getId() + "][" + view.getNativeId$ReactAndroid_release() + "]");
        }
    }

    @Override // com.facebook.react.viewmanagers.VirtualViewManagerInterface
    @ReactProp(name = "renderState")
    public void setRenderState(@NotNull ReactVirtualView view, int value) {
        Intrinsics.checkNotNullParameter(view, "view");
        if (ReactNativeFeatureFlags.enableVirtualViewRenderState()) {
            view.setRenderState$ReactAndroid_release(value != 1 ? value != 2 ? VirtualViewRenderState.Unknown : VirtualViewRenderState.None : VirtualViewRenderState.Rendered);
        }
    }
}
