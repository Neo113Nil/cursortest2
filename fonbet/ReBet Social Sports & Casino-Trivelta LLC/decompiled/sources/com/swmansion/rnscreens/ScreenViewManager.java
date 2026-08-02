package com.swmansion.rnscreens;

import android.view.View;
import com.facebook.react.bridge.JSApplicationIllegalArgumentException;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.module.annotations.ReactModule;
import com.facebook.react.uimanager.ReactStylesDiffMap;
import com.facebook.react.uimanager.StateWrapper;
import com.facebook.react.uimanager.ThemedReactContext;
import com.facebook.react.uimanager.ViewGroupManager;
import com.facebook.react.uimanager.ViewManagerDelegate;
import com.facebook.react.uimanager.ViewProps;
import com.facebook.react.viewmanagers.RNSScreenManagerDelegate;
import com.facebook.react.viewmanagers.RNSScreenManagerInterface;
import com.swmansion.rnscreens.C3834z;
import com.twilio.voice.EventKeys;
import java.util.ArrayList;
import java.util.Map;
import kotlin.Metadata;
import kotlin.TuplesKt;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000|\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b \n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010%\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0017\u0018\u0000 k2\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00020\u0003:\u0001lB\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\u000b\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\tH\u0014¢\u0006\u0004\b\u000b\u0010\fJ\u001f\u0010\u0011\u001a\u00020\u00102\u0006\u0010\r\u001a\u00020\u00022\u0006\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u0011\u0010\u0012J'\u0010\u0018\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u00022\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0017\u001a\u00020\u0016H\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u001f\u0010\u001a\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u00022\u0006\u0010\u0017\u001a\u00020\u0016H\u0016¢\u0006\u0004\b\u001a\u0010\u001bJ\u001f\u0010\u001c\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\u0014H\u0016¢\u0006\u0004\b\u001c\u0010\u001dJ-\u0010#\u001a\u0004\u0018\u00010\"2\u0006\u0010\r\u001a\u00020\u00022\b\u0010\u001f\u001a\u0004\u0018\u00010\u001e2\b\u0010!\u001a\u0004\u0018\u00010 H\u0016¢\u0006\u0004\b#\u0010$J\u0017\u0010%\u001a\u00020\u00102\u0006\u0010\r\u001a\u00020\u0002H\u0014¢\u0006\u0004\b%\u0010&J\u001d\u0010\u0011\u001a\u00020\u00102\u0006\u0010\r\u001a\u00020\u00022\u0006\u0010\u000f\u001a\u00020\u0016¢\u0006\u0004\b\u0011\u0010\u001bJ!\u0010(\u001a\u00020\u00102\u0006\u0010\r\u001a\u00020\u00022\b\u0010'\u001a\u0004\u0018\u00010\u0006H\u0016¢\u0006\u0004\b(\u0010)J!\u0010+\u001a\u00020\u00102\u0006\u0010\r\u001a\u00020\u00022\b\u0010*\u001a\u0004\u0018\u00010\u0006H\u0016¢\u0006\u0004\b+\u0010)J\u001f\u0010.\u001a\u00020\u00102\u0006\u0010\r\u001a\u00020\u00022\u0006\u0010-\u001a\u00020,H\u0016¢\u0006\u0004\b.\u0010/J!\u00100\u001a\u00020\u00102\u0006\u0010\r\u001a\u00020\u00022\b\u0010*\u001a\u0004\u0018\u00010\u0006H\u0016¢\u0006\u0004\b0\u0010)J!\u00102\u001a\u00020\u00102\u0006\u0010\r\u001a\u00020\u00022\b\u00101\u001a\u0004\u0018\u00010\u0006H\u0016¢\u0006\u0004\b2\u0010)J!\u00104\u001a\u00020\u00102\u0006\u0010\r\u001a\u00020\u00022\b\u00103\u001a\u0004\u0018\u00010\u0006H\u0016¢\u0006\u0004\b4\u0010)J!\u00106\u001a\u00020\u00102\u0006\u0010\r\u001a\u00020\u00022\b\u00105\u001a\u0004\u0018\u00010\u0006H\u0016¢\u0006\u0004\b6\u0010)J\u001f\u00108\u001a\u00020\u00102\u0006\u0010\r\u001a\u00020\u00022\u0006\u00107\u001a\u00020,H\u0016¢\u0006\u0004\b8\u0010/J\u001f\u0010:\u001a\u00020\u00102\u0006\u0010\r\u001a\u00020\u00022\u0006\u00109\u001a\u00020,H\u0016¢\u0006\u0004\b:\u0010/J\u001f\u0010<\u001a\u00020\u00102\u0006\u0010\r\u001a\u00020\u00022\u0006\u0010;\u001a\u00020,H\u0016¢\u0006\u0004\b<\u0010/J!\u0010>\u001a\u00020\u00102\b\u0010\r\u001a\u0004\u0018\u00010\u00022\u0006\u0010=\u001a\u00020\u0016H\u0016¢\u0006\u0004\b>\u0010\u001bJ!\u0010@\u001a\u00020\u00102\b\u0010\r\u001a\u0004\u0018\u00010\u00022\u0006\u0010?\u001a\u00020,H\u0016¢\u0006\u0004\b@\u0010/J!\u0010B\u001a\u00020\u00102\b\u0010\r\u001a\u0004\u0018\u00010\u00022\u0006\u0010A\u001a\u00020,H\u0016¢\u0006\u0004\bB\u0010/J!\u0010C\u001a\u00020\u00102\u0006\u0010\r\u001a\u00020\u00022\b\u0010=\u001a\u0004\u0018\u00010\u0016H\u0016¢\u0006\u0004\bC\u0010DJ\u001f\u0010E\u001a\u00020\u00102\u0006\u0010\r\u001a\u00020\u00022\u0006\u0010=\u001a\u00020,H\u0016¢\u0006\u0004\bE\u0010/J!\u0010F\u001a\u00020\u00102\u0006\u0010\r\u001a\u00020\u00022\b\u0010=\u001a\u0004\u0018\u00010\u0016H\u0016¢\u0006\u0004\bF\u0010DJ\u001f\u0010G\u001a\u00020\u00102\u0006\u0010\r\u001a\u00020\u00022\u0006\u0010=\u001a\u00020,H\u0016¢\u0006\u0004\bG\u0010/J#\u0010H\u001a\u00020\u00102\b\u0010\r\u001a\u0004\u0018\u00010\u00022\b\u0010=\u001a\u0004\u0018\u00010\u0006H\u0016¢\u0006\u0004\bH\u0010)J!\u0010I\u001a\u00020\u00102\b\u0010\r\u001a\u0004\u0018\u00010\u00022\u0006\u0010=\u001a\u00020,H\u0016¢\u0006\u0004\bI\u0010/J!\u0010J\u001a\u00020\u00102\b\u0010\r\u001a\u0004\u0018\u00010\u00022\u0006\u0010=\u001a\u00020\u0016H\u0016¢\u0006\u0004\bJ\u0010\u001bJ!\u0010K\u001a\u00020\u00102\b\u0010\r\u001a\u0004\u0018\u00010\u00022\u0006\u0010=\u001a\u00020,H\u0016¢\u0006\u0004\bK\u0010/J!\u0010L\u001a\u00020\u00102\b\u0010\r\u001a\u0004\u0018\u00010\u00022\u0006\u0010=\u001a\u00020,H\u0016¢\u0006\u0004\bL\u0010/J#\u0010N\u001a\u00020\u00102\b\u0010\r\u001a\u0004\u0018\u00010\u00022\b\u0010=\u001a\u0004\u0018\u00010MH\u0016¢\u0006\u0004\bN\u0010OJ!\u0010P\u001a\u00020\u00102\b\u0010\r\u001a\u0004\u0018\u00010\u00022\u0006\u0010=\u001a\u00020,H\u0016¢\u0006\u0004\bP\u0010/J!\u0010Q\u001a\u00020\u00102\b\u0010\r\u001a\u0004\u0018\u00010\u00022\u0006\u0010=\u001a\u00020,H\u0016¢\u0006\u0004\bQ\u0010/J#\u0010R\u001a\u00020\u00102\b\u0010\r\u001a\u0004\u0018\u00010\u00022\b\u0010=\u001a\u0004\u0018\u00010\u0006H\u0016¢\u0006\u0004\bR\u0010)J#\u0010S\u001a\u00020\u00102\b\u0010\r\u001a\u0004\u0018\u00010\u00022\b\u0010=\u001a\u0004\u0018\u00010\u0006H\u0016¢\u0006\u0004\bS\u0010)J#\u0010T\u001a\u00020\u00102\b\u0010\r\u001a\u0004\u0018\u00010\u00022\b\u0010=\u001a\u0004\u0018\u00010\u0006H\u0016¢\u0006\u0004\bT\u0010)J#\u0010U\u001a\u00020\u00102\b\u0010\r\u001a\u0004\u0018\u00010\u00022\b\u0010=\u001a\u0004\u0018\u00010\u0006H\u0016¢\u0006\u0004\bU\u0010)J#\u0010V\u001a\u00020\u00102\b\u0010\r\u001a\u0004\u0018\u00010\u00022\b\u0010=\u001a\u0004\u0018\u00010\u0006H\u0016¢\u0006\u0004\bV\u0010)J!\u0010W\u001a\u00020\u00102\b\u0010\r\u001a\u0004\u0018\u00010\u00022\u0006\u0010=\u001a\u00020,H\u0016¢\u0006\u0004\bW\u0010/J!\u0010X\u001a\u00020\u00102\b\u0010\r\u001a\u0004\u0018\u00010\u00022\u0006\u0010=\u001a\u00020,H\u0016¢\u0006\u0004\bX\u0010/J!\u0010Y\u001a\u00020\u00102\b\u0010\r\u001a\u0004\u0018\u00010\u00022\u0006\u0010=\u001a\u00020,H\u0016¢\u0006\u0004\bY\u0010/J!\u0010[\u001a\u00020\u00102\u0006\u0010\r\u001a\u00020\u00022\b\u0010=\u001a\u0004\u0018\u00010ZH\u0016¢\u0006\u0004\b[\u0010\\J\u001f\u0010]\u001a\u00020\u00102\u0006\u0010\r\u001a\u00020\u00022\u0006\u0010=\u001a\u00020\u0016H\u0016¢\u0006\u0004\b]\u0010\u001bJ\u001f\u0010^\u001a\u00020\u00102\u0006\u0010\r\u001a\u00020\u00022\u0006\u0010=\u001a\u00020,H\u0016¢\u0006\u0004\b^\u0010/J\u001f\u0010_\u001a\u00020\u00102\u0006\u0010\r\u001a\u00020\u00022\u0006\u0010=\u001a\u00020\u000eH\u0016¢\u0006\u0004\b_\u0010\u0012J\u001f\u0010`\u001a\u00020\u00102\u0006\u0010\r\u001a\u00020\u00022\u0006\u0010=\u001a\u00020,H\u0016¢\u0006\u0004\b`\u0010/J\u001f\u0010a\u001a\u00020\u00102\u0006\u0010\r\u001a\u00020\u00022\u0006\u0010=\u001a\u00020\u0016H\u0016¢\u0006\u0004\ba\u0010\u001bJ!\u0010b\u001a\u00020\u00102\u0006\u0010\r\u001a\u00020\u00022\b\u0010=\u001a\u0004\u0018\u00010\u0006H\u0016¢\u0006\u0004\bb\u0010)J\u001b\u0010d\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\"0cH\u0016¢\u0006\u0004\bd\u0010eJ\u0015\u0010g\u001a\b\u0012\u0004\u0012\u00020\u00020fH\u0014¢\u0006\u0004\bg\u0010hR\u001a\u0010i\u001a\b\u0012\u0004\u0012\u00020\u00020f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bi\u0010j¨\u0006m"}, d2 = {"Lcom/swmansion/rnscreens/ScreenViewManager;", "Lcom/facebook/react/uimanager/ViewGroupManager;", "Lcom/swmansion/rnscreens/z;", "Lcom/facebook/react/viewmanagers/RNSScreenManagerInterface;", "<init>", "()V", "", "getName", "()Ljava/lang/String;", "Lcom/facebook/react/uimanager/ThemedReactContext;", "reactContext", "createViewInstance", "(Lcom/facebook/react/uimanager/ThemedReactContext;)Lcom/swmansion/rnscreens/z;", "view", "", "activityState", "", "setActivityState", "(Lcom/swmansion/rnscreens/z;F)V", "parent", "Landroid/view/View;", "child", "", "index", "addView", "(Lcom/swmansion/rnscreens/z;Landroid/view/View;I)V", "removeViewAt", "(Lcom/swmansion/rnscreens/z;I)V", "removeView", "(Lcom/swmansion/rnscreens/z;Landroid/view/View;)V", "Lcom/facebook/react/uimanager/ReactStylesDiffMap;", "props", "Lcom/facebook/react/uimanager/StateWrapper;", "stateWrapper", "", "updateState", "(Lcom/swmansion/rnscreens/z;Lcom/facebook/react/uimanager/ReactStylesDiffMap;Lcom/facebook/react/uimanager/StateWrapper;)Ljava/lang/Object;", "onAfterUpdateTransaction", "(Lcom/swmansion/rnscreens/z;)V", "presentation", "setStackPresentation", "(Lcom/swmansion/rnscreens/z;Ljava/lang/String;)V", "animation", "setStackAnimation", "", "gestureEnabled", "setGestureEnabled", "(Lcom/swmansion/rnscreens/z;Z)V", "setReplaceAnimation", "screenOrientation", "setScreenOrientation", "statusBarAnimation", "setStatusBarAnimation", "statusBarStyle", "setStatusBarStyle", "statusBarHidden", "setStatusBarHidden", "navigationBarHidden", "setNavigationBarHidden", "nativeBackButtonDismissalEnabled", "setNativeBackButtonDismissalEnabled", EventKeys.VALUE_KEY, "setSheetElevation", "sheetShouldOverflowTopInset", "setSheetShouldOverflowTopInset", "sheetDefaultResizeAnimationEnabled", "setSheetDefaultResizeAnimationEnabled", "setStatusBarColor", "(Lcom/swmansion/rnscreens/z;Ljava/lang/Integer;)V", "setStatusBarTranslucent", "setNavigationBarColor", "setNavigationBarTranslucent", "setFullScreenSwipeEnabled", "setFullScreenSwipeShadowEnabled", "setTransitionDuration", "setHideKeyboardOnSwipe", "setCustomAnimationOnSwipe", "Lcom/facebook/react/bridge/ReadableMap;", "setGestureResponseDistance", "(Lcom/swmansion/rnscreens/z;Lcom/facebook/react/bridge/ReadableMap;)V", "setHomeIndicatorHidden", "setPreventNativeDismiss", "setSwipeDirection", "setBottomScrollEdgeEffect", "setLeftScrollEdgeEffect", "setRightScrollEdgeEffect", "setTopScrollEdgeEffect", "setSynchronousShadowStateUpdatesEnabled", "setIos26AllowInteractionsDuringTransition", "setAndroidResetScreenShadowStateOnOrientationChangeEnabled", "Lcom/facebook/react/bridge/ReadableArray;", "setSheetAllowedDetents", "(Lcom/swmansion/rnscreens/z;Lcom/facebook/react/bridge/ReadableArray;)V", "setSheetLargestUndimmedDetent", "setSheetGrabberVisible", "setSheetCornerRadius", "setSheetExpandsWhenScrolledToEdge", "setSheetInitialDetent", "setScreenId", "", "getExportedCustomDirectEventTypeConstants", "()Ljava/util/Map;", "Lcom/facebook/react/uimanager/ViewManagerDelegate;", "getDelegate", "()Lcom/facebook/react/uimanager/ViewManagerDelegate;", "delegate", "Lcom/facebook/react/uimanager/ViewManagerDelegate;", "Companion", "a", "react-native-screens_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@ReactModule(name = ScreenViewManager.REACT_CLASS)
@SourceDebugExtension({"SMAP\nScreenViewManager.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ScreenViewManager.kt\ncom/swmansion/rnscreens/ScreenViewManager\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,414:1\n1#2:415\n*E\n"})
/* loaded from: classes4.dex */
public class ScreenViewManager extends ViewGroupManager<C3834z> implements RNSScreenManagerInterface<C3834z> {

    @NotNull
    public static final String REACT_CLASS = "RNSScreen";

    @NotNull
    private final ViewManagerDelegate<C3834z> delegate;

    public ScreenViewManager() {
        super(null, 1, null);
        this.delegate = new RNSScreenManagerDelegate(this);
    }

    @Override // com.facebook.react.uimanager.ViewManager
    @NotNull
    public ViewManagerDelegate<C3834z> getDelegate() {
        return this.delegate;
    }

    @Override // com.facebook.react.uimanager.BaseViewManager, com.facebook.react.uimanager.ViewManager
    @NotNull
    public Map<String, Object> getExportedCustomDirectEventTypeConstants() {
        return MapsKt.mutableMapOf(TuplesKt.to("topDismissed", MapsKt.hashMapOf(TuplesKt.to("registrationName", "onDismissed"))), TuplesKt.to("topWillAppear", MapsKt.hashMapOf(TuplesKt.to("registrationName", "onWillAppear"))), TuplesKt.to("topAppear", MapsKt.hashMapOf(TuplesKt.to("registrationName", "onAppear"))), TuplesKt.to("topWillDisappear", MapsKt.hashMapOf(TuplesKt.to("registrationName", "onWillDisappear"))), TuplesKt.to("topDisappear", MapsKt.hashMapOf(TuplesKt.to("registrationName", "onDisappear"))), TuplesKt.to("topHeaderHeightChange", MapsKt.hashMapOf(TuplesKt.to("registrationName", "onHeaderHeightChange"))), TuplesKt.to("topHeaderBackButtonClicked", MapsKt.hashMapOf(TuplesKt.to("registrationName", "onHeaderBackButtonClicked"))), TuplesKt.to("topTransitionProgress", MapsKt.hashMapOf(TuplesKt.to("registrationName", "onTransitionProgress"))), TuplesKt.to("topSheetDetentChanged", MapsKt.hashMapOf(TuplesKt.to("registrationName", "onSheetDetentChanged"))));
    }

    @Override // com.facebook.react.uimanager.ViewManager, com.facebook.react.bridge.NativeModule
    @NotNull
    public String getName() {
        return REACT_CLASS;
    }

    @Override // com.facebook.react.viewmanagers.RNSScreenManagerInterface
    public void setAndroidResetScreenShadowStateOnOrientationChangeEnabled(@Nullable C3834z view, boolean value) {
    }

    @Override // com.facebook.react.viewmanagers.RNSScreenManagerInterface
    public void setBottomScrollEdgeEffect(@Nullable C3834z view, @Nullable String value) {
    }

    @Override // com.facebook.react.viewmanagers.RNSScreenManagerInterface
    public void setCustomAnimationOnSwipe(@Nullable C3834z view, boolean value) {
    }

    @Override // com.facebook.react.viewmanagers.RNSScreenManagerInterface
    public void setFullScreenSwipeEnabled(@Nullable C3834z view, @Nullable String value) {
    }

    @Override // com.facebook.react.viewmanagers.RNSScreenManagerInterface
    public void setFullScreenSwipeShadowEnabled(@Nullable C3834z view, boolean value) {
    }

    @Override // com.facebook.react.viewmanagers.RNSScreenManagerInterface
    public void setGestureResponseDistance(@Nullable C3834z view, @Nullable ReadableMap value) {
    }

    @Override // com.facebook.react.viewmanagers.RNSScreenManagerInterface
    public void setHideKeyboardOnSwipe(@Nullable C3834z view, boolean value) {
    }

    @Override // com.facebook.react.viewmanagers.RNSScreenManagerInterface
    public void setHomeIndicatorHidden(@Nullable C3834z view, boolean value) {
    }

    @Override // com.facebook.react.viewmanagers.RNSScreenManagerInterface
    public void setIos26AllowInteractionsDuringTransition(@Nullable C3834z view, boolean value) {
    }

    @Override // com.facebook.react.viewmanagers.RNSScreenManagerInterface
    public void setLeftScrollEdgeEffect(@Nullable C3834z view, @Nullable String value) {
    }

    @Override // com.facebook.react.viewmanagers.RNSScreenManagerInterface
    public void setNavigationBarColor(@NotNull C3834z view, @Nullable Integer value) {
        Intrinsics.checkNotNullParameter(view, "view");
    }

    @Override // com.facebook.react.viewmanagers.RNSScreenManagerInterface
    public void setNavigationBarTranslucent(@NotNull C3834z view, boolean value) {
        Intrinsics.checkNotNullParameter(view, "view");
    }

    @Override // com.facebook.react.viewmanagers.RNSScreenManagerInterface
    public void setPreventNativeDismiss(@Nullable C3834z view, boolean value) {
    }

    @Override // com.facebook.react.viewmanagers.RNSScreenManagerInterface
    public void setRightScrollEdgeEffect(@Nullable C3834z view, @Nullable String value) {
    }

    @Override // com.facebook.react.viewmanagers.RNSScreenManagerInterface
    public void setStatusBarColor(@NotNull C3834z view, @Nullable Integer value) {
        Intrinsics.checkNotNullParameter(view, "view");
    }

    @Override // com.facebook.react.viewmanagers.RNSScreenManagerInterface
    public void setStatusBarTranslucent(@NotNull C3834z view, boolean value) {
        Intrinsics.checkNotNullParameter(view, "view");
    }

    @Override // com.facebook.react.viewmanagers.RNSScreenManagerInterface
    public void setSwipeDirection(@Nullable C3834z view, @Nullable String value) {
    }

    @Override // com.facebook.react.viewmanagers.RNSScreenManagerInterface
    public void setSynchronousShadowStateUpdatesEnabled(@Nullable C3834z view, boolean value) {
    }

    @Override // com.facebook.react.viewmanagers.RNSScreenManagerInterface
    public void setTopScrollEdgeEffect(@Nullable C3834z view, @Nullable String value) {
    }

    @Override // com.facebook.react.viewmanagers.RNSScreenManagerInterface
    public void setTransitionDuration(@Nullable C3834z view, int value) {
    }

    @Override // com.facebook.react.uimanager.ViewManager
    @NotNull
    public C3834z createViewInstance(@NotNull ThemedReactContext reactContext) {
        Intrinsics.checkNotNullParameter(reactContext, "reactContext");
        return new C3834z(reactContext);
    }

    @Override // com.facebook.react.uimanager.BaseViewManager, com.facebook.react.uimanager.ViewManager
    public void onAfterUpdateTransaction(@NotNull C3834z view) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onAfterUpdateTransaction((ScreenViewManager) view);
        view.v();
    }

    @Override // com.facebook.react.uimanager.ViewGroupManager
    public void removeView(@NotNull C3834z parent, @NotNull View view) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        Intrinsics.checkNotNullParameter(view, "view");
        super.removeView((ScreenViewManager) parent, view);
        if (view instanceof E) {
            parent.setFooter(null);
        }
    }

    @Override // com.facebook.react.viewmanagers.RNSScreenManagerInterface
    public void setActivityState(@NotNull C3834z view, float activityState) {
        Intrinsics.checkNotNullParameter(view, "view");
        setActivityState(view, (int) activityState);
    }

    @Override // com.facebook.react.viewmanagers.RNSScreenManagerInterface
    public void setGestureEnabled(@NotNull C3834z view, boolean gestureEnabled) {
        Intrinsics.checkNotNullParameter(view, "view");
        view.setGestureEnabled(gestureEnabled);
    }

    @Override // com.facebook.react.viewmanagers.RNSScreenManagerInterface
    public void setNativeBackButtonDismissalEnabled(@NotNull C3834z view, boolean nativeBackButtonDismissalEnabled) {
        Intrinsics.checkNotNullParameter(view, "view");
        view.setNativeBackButtonDismissalEnabled(nativeBackButtonDismissalEnabled);
    }

    @Override // com.facebook.react.viewmanagers.RNSScreenManagerInterface
    public void setNavigationBarHidden(@NotNull C3834z view, boolean navigationBarHidden) {
        Intrinsics.checkNotNullParameter(view, "view");
        view.setNavigationBarHidden(Boolean.valueOf(navigationBarHidden));
    }

    @Override // com.facebook.react.viewmanagers.RNSScreenManagerInterface
    public void setReplaceAnimation(@NotNull C3834z view, @Nullable String animation) {
        C3834z.c cVar;
        Intrinsics.checkNotNullParameter(view, "view");
        if (animation == null || Intrinsics.areEqual(animation, "pop")) {
            cVar = C3834z.c.f42109b;
        } else {
            if (!Intrinsics.areEqual(animation, "push")) {
                throw new JSApplicationIllegalArgumentException("Unknown replace animation type " + animation);
            }
            cVar = C3834z.c.f42108a;
        }
        view.setReplaceAnimation(cVar);
    }

    @Override // com.facebook.react.viewmanagers.RNSScreenManagerInterface
    public void setScreenId(@NotNull C3834z view, @Nullable String value) {
        Intrinsics.checkNotNullParameter(view, "view");
        if (value == null || value.length() == 0) {
            value = null;
        }
        view.setScreenId(value);
    }

    @Override // com.facebook.react.viewmanagers.RNSScreenManagerInterface
    public void setScreenOrientation(@NotNull C3834z view, @Nullable String screenOrientation) {
        Intrinsics.checkNotNullParameter(view, "view");
        view.setScreenOrientation(screenOrientation);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r1v2, types: [java.util.ArrayList] */
    @Override // com.facebook.react.viewmanagers.RNSScreenManagerInterface
    public void setSheetAllowedDetents(@NotNull C3834z view, @Nullable ReadableArray value) {
        ?? listOf;
        Intrinsics.checkNotNullParameter(view, "view");
        if (value == null || value.size() <= 0) {
            listOf = CollectionsKt.listOf(Double.valueOf(1.0d));
        } else {
            int size = value.size();
            listOf = new ArrayList(size);
            for (int i10 = 0; i10 < size; i10++) {
                listOf.add(Double.valueOf(value.getDouble(i10)));
            }
        }
        view.setSheetDetents(new Lc.o(listOf));
    }

    @Override // com.facebook.react.viewmanagers.RNSScreenManagerInterface
    public void setSheetCornerRadius(@NotNull C3834z view, float value) {
        Intrinsics.checkNotNullParameter(view, "view");
        view.setSheetCornerRadius(value);
    }

    @Override // com.facebook.react.viewmanagers.RNSScreenManagerInterface
    public void setSheetDefaultResizeAnimationEnabled(@Nullable C3834z view, boolean sheetDefaultResizeAnimationEnabled) {
        if (view != null) {
            view.setSheetDefaultResizeAnimationEnabled(sheetDefaultResizeAnimationEnabled);
        }
    }

    @Override // com.facebook.react.viewmanagers.RNSScreenManagerInterface
    public void setSheetElevation(@Nullable C3834z view, int value) {
        if (view != null) {
            view.setSheetElevation(value);
        }
    }

    @Override // com.facebook.react.viewmanagers.RNSScreenManagerInterface
    public void setSheetExpandsWhenScrolledToEdge(@NotNull C3834z view, boolean value) {
        Intrinsics.checkNotNullParameter(view, "view");
        view.setSheetExpandsWhenScrolledToEdge(value);
    }

    @Override // com.facebook.react.viewmanagers.RNSScreenManagerInterface
    public void setSheetGrabberVisible(@NotNull C3834z view, boolean value) {
        Intrinsics.checkNotNullParameter(view, "view");
        view.setSheetGrabberVisible(value);
    }

    @Override // com.facebook.react.viewmanagers.RNSScreenManagerInterface
    public void setSheetInitialDetent(@NotNull C3834z view, int value) {
        Intrinsics.checkNotNullParameter(view, "view");
        view.setSheetInitialDetentIndex(value);
    }

    @Override // com.facebook.react.viewmanagers.RNSScreenManagerInterface
    public void setSheetLargestUndimmedDetent(@NotNull C3834z view, int value) {
        Intrinsics.checkNotNullParameter(view, "view");
        if (-1 > value || value >= 3) {
            throw new IllegalStateException("[RNScreens] sheetLargestUndimmedDetent on Android supports values between -1 and 2");
        }
        view.setSheetLargestUndimmedDetentIndex(value);
    }

    @Override // com.facebook.react.viewmanagers.RNSScreenManagerInterface
    public void setSheetShouldOverflowTopInset(@Nullable C3834z view, boolean sheetShouldOverflowTopInset) {
        if (view != null) {
            view.setSheetShouldOverflowTopInset(sheetShouldOverflowTopInset);
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0022, code lost:
    
        if (r4.equals(com.facebook.hermes.intl.Constants.COLLATION_DEFAULT) != false) goto L42;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x004e, code lost:
    
        if (r4.equals("flip") != false) goto L42;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x0083, code lost:
    
        if (r4.equals("simple_push") != false) goto L42;
     */
    @Override // com.facebook.react.viewmanagers.RNSScreenManagerInterface
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void setStackAnimation(@NotNull C3834z view, @Nullable String animation) {
        C3834z.d dVar;
        Intrinsics.checkNotNullParameter(view, "view");
        if (animation != null) {
            switch (animation.hashCode()) {
                case -1418955385:
                    break;
                case -1198710326:
                    if (animation.equals("ios_from_left")) {
                        dVar = C3834z.d.f42119i;
                        view.setStackAnimation(dVar);
                    }
                    throw new JSApplicationIllegalArgumentException("Unknown animation type " + animation);
                case -427095442:
                    if (animation.equals("slide_from_left")) {
                        dVar = C3834z.d.f42116f;
                        view.setStackAnimation(dVar);
                    }
                    throw new JSApplicationIllegalArgumentException("Unknown animation type " + animation);
                case -349395819:
                    if (animation.equals("slide_from_right")) {
                        dVar = C3834z.d.f42115e;
                        view.setStackAnimation(dVar);
                    }
                    throw new JSApplicationIllegalArgumentException("Unknown animation type " + animation);
                case 3135100:
                    if (animation.equals("fade")) {
                        dVar = C3834z.d.f42113c;
                        view.setStackAnimation(dVar);
                    }
                    throw new JSApplicationIllegalArgumentException("Unknown animation type " + animation);
                case 3145837:
                    break;
                case 3387192:
                    if (animation.equals(ViewProps.NONE)) {
                        dVar = C3834z.d.f42112b;
                        view.setStackAnimation(dVar);
                    }
                    throw new JSApplicationIllegalArgumentException("Unknown animation type " + animation);
                case 182437661:
                    if (animation.equals("fade_from_bottom")) {
                        dVar = C3834z.d.f42117g;
                        view.setStackAnimation(dVar);
                    }
                    throw new JSApplicationIllegalArgumentException("Unknown animation type " + animation);
                case 1500346553:
                    if (animation.equals("ios_from_right")) {
                        dVar = C3834z.d.f42118h;
                        view.setStackAnimation(dVar);
                    }
                    throw new JSApplicationIllegalArgumentException("Unknown animation type " + animation);
                case 1544803905:
                    break;
                case 1601504978:
                    if (animation.equals("slide_from_bottom")) {
                        dVar = C3834z.d.f42114d;
                        view.setStackAnimation(dVar);
                    }
                    throw new JSApplicationIllegalArgumentException("Unknown animation type " + animation);
                default:
                    throw new JSApplicationIllegalArgumentException("Unknown animation type " + animation);
            }
        }
        dVar = C3834z.d.f42111a;
        view.setStackAnimation(dVar);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0020, code lost:
    
        if (r4.equals("fullScreenModal") != false) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0046, code lost:
    
        r4 = com.swmansion.rnscreens.C3834z.e.f42122b;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0029, code lost:
    
        if (r4.equals("containedTransparentModal") != false) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x005c, code lost:
    
        r4 = com.swmansion.rnscreens.C3834z.e.f42123c;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0032, code lost:
    
        if (r4.equals("pageSheet") != false) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x003b, code lost:
    
        if (r4.equals("containedModal") != false) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0044, code lost:
    
        if (r4.equals("modal") != false) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x005a, code lost:
    
        if (r4.equals("transparentModal") != false) goto L30;
     */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue
    java.lang.NullPointerException: Cannot invoke "java.util.List.iterator()" because the return value of "jadx.core.dex.visitors.regions.SwitchOverStringVisitor$SwitchData.getNewCases()" is null
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.restoreSwitchOverString(SwitchOverStringVisitor.java:109)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.visitRegion(SwitchOverStringVisitor.java:66)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:77)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:82)
     */
    @Override // com.facebook.react.viewmanagers.RNSScreenManagerInterface
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void setStackPresentation(@NotNull C3834z view, @Nullable String presentation) {
        C3834z.e eVar;
        Intrinsics.checkNotNullParameter(view, "view");
        if (presentation != null) {
            switch (presentation.hashCode()) {
                case -76271493:
                    break;
                case 3452698:
                    if (presentation.equals("push")) {
                        eVar = C3834z.e.f42121a;
                        view.setStackPresentation(eVar);
                        return;
                    }
                    break;
                case 104069805:
                    break;
                case 438078970:
                    break;
                case 872434704:
                    break;
                case 955284238:
                    break;
                case 1171936146:
                    break;
                case 1798290171:
                    if (presentation.equals("formSheet")) {
                        eVar = C3834z.e.f42124d;
                        view.setStackPresentation(eVar);
                        return;
                    }
                    break;
            }
        }
        throw new JSApplicationIllegalArgumentException("Unknown presentation type " + presentation);
    }

    @Override // com.facebook.react.viewmanagers.RNSScreenManagerInterface
    public void setStatusBarAnimation(@NotNull C3834z view, @Nullable String statusBarAnimation) {
        Intrinsics.checkNotNullParameter(view, "view");
        view.setStatusBarAnimated(Boolean.valueOf((statusBarAnimation == null || Intrinsics.areEqual(ViewProps.NONE, statusBarAnimation)) ? false : true));
    }

    @Override // com.facebook.react.viewmanagers.RNSScreenManagerInterface
    public void setStatusBarHidden(@NotNull C3834z view, boolean statusBarHidden) {
        Intrinsics.checkNotNullParameter(view, "view");
        view.setStatusBarHidden(Boolean.valueOf(statusBarHidden));
    }

    @Override // com.facebook.react.viewmanagers.RNSScreenManagerInterface
    public void setStatusBarStyle(@NotNull C3834z view, @Nullable String statusBarStyle) {
        Intrinsics.checkNotNullParameter(view, "view");
        view.setStatusBarStyle(statusBarStyle);
    }

    @Override // com.facebook.react.uimanager.ViewManager
    @Nullable
    public Object updateState(@NotNull C3834z view, @Nullable ReactStylesDiffMap props, @Nullable StateWrapper stateWrapper) {
        Intrinsics.checkNotNullParameter(view, "view");
        view.setStateWrapper(stateWrapper);
        return super.updateState((ScreenViewManager) view, props, stateWrapper);
    }

    @Override // com.facebook.react.uimanager.ViewGroupManager
    public void addView(@NotNull C3834z parent, @NotNull View child, int index) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        Intrinsics.checkNotNullParameter(child, "child");
        if (child instanceof C) {
            parent.z((C) child);
        } else if (child instanceof E) {
            parent.setFooter((E) child);
        }
        super.addView((ScreenViewManager) parent, child, index);
    }

    @Override // com.facebook.react.uimanager.ViewGroupManager
    public void removeViewAt(@NotNull C3834z parent, int index) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        if (parent.getChildAt(index) instanceof E) {
            parent.setFooter(null);
        }
        super.removeViewAt((ScreenViewManager) parent, index);
    }

    public final void setActivityState(@NotNull C3834z view, int activityState) {
        Intrinsics.checkNotNullParameter(view, "view");
        if (activityState == -1) {
            return;
        }
        if (activityState == 0) {
            view.setActivityState(C3834z.a.f42104a);
        } else if (activityState == 1) {
            view.setActivityState(C3834z.a.f42105b);
        } else {
            if (activityState != 2) {
                return;
            }
            view.setActivityState(C3834z.a.f42106c);
        }
    }
}
