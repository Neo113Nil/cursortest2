package com.swmansion.rnscreens;

import android.view.View;
import com.facebook.react.bridge.JSApplicationCausedNativeException;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.module.annotations.ReactModule;
import com.facebook.react.uimanager.ReactStylesDiffMap;
import com.facebook.react.uimanager.StateWrapper;
import com.facebook.react.uimanager.ThemedReactContext;
import com.facebook.react.uimanager.ViewGroupManager;
import com.facebook.react.uimanager.ViewManagerDelegate;
import com.facebook.react.uimanager.ViewProps;
import com.facebook.react.viewmanagers.RNSScreenStackHeaderConfigManagerDelegate;
import com.facebook.react.viewmanagers.RNSScreenStackHeaderConfigManagerInterface;
import com.twilio.voice.EventKeys;
import java.util.Map;
import kotlin.Metadata;
import kotlin.TuplesKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@ReactModule(name = ScreenStackHeaderConfigViewManager.REACT_CLASS)
@Metadata(d1 = {"\u0000l\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b'\n\u0002\u0010$\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0018\u0002\n\u0002\b\t\b\u0007\u0018\u0000 k2\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00020\u0003:\u0001lB\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\u000b\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\tH\u0014¢\u0006\u0004\b\u000b\u0010\fJ'\u0010\u0013\u001a\u00020\u00122\u0006\u0010\r\u001a\u00020\u00022\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J-\u0010\u001b\u001a\u0004\u0018\u00010\u001a2\u0006\u0010\u0015\u001a\u00020\u00022\b\u0010\u0017\u001a\u0004\u0018\u00010\u00162\b\u0010\u0019\u001a\u0004\u0018\u00010\u0018H\u0016¢\u0006\u0004\b\u001b\u0010\u001cJ\u0019\u0010\u001d\u001a\u00020\u00122\b\b\u0001\u0010\u0015\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u001d\u0010\u001eJ\u0017\u0010\u001f\u001a\u00020\u00122\u0006\u0010\r\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u001f\u0010\u001eJ\u001f\u0010 \u001a\u00020\u00122\u0006\u0010\r\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u0010H\u0016¢\u0006\u0004\b \u0010!J\u0017\u0010\"\u001a\u00020\u00102\u0006\u0010\r\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\"\u0010#J\u001f\u0010$\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u0010H\u0016¢\u0006\u0004\b$\u0010%J\u000f\u0010'\u001a\u00020&H\u0016¢\u0006\u0004\b'\u0010(J\u0017\u0010)\u001a\u00020\u00122\u0006\u0010\r\u001a\u00020\u0002H\u0014¢\u0006\u0004\b)\u0010\u001eJ\u001f\u0010,\u001a\u00020\u00122\u0006\u0010*\u001a\u00020\u00022\u0006\u0010+\u001a\u00020&H\u0016¢\u0006\u0004\b,\u0010-J\u001f\u0010/\u001a\u00020\u00122\u0006\u0010*\u001a\u00020\u00022\u0006\u0010.\u001a\u00020&H\u0016¢\u0006\u0004\b/\u0010-J!\u00101\u001a\u00020\u00122\u0006\u0010*\u001a\u00020\u00022\b\u00100\u001a\u0004\u0018\u00010\u0006H\u0016¢\u0006\u0004\b1\u00102J!\u00104\u001a\u00020\u00122\u0006\u0010*\u001a\u00020\u00022\b\u00103\u001a\u0004\u0018\u00010\u0006H\u0016¢\u0006\u0004\b4\u00102J\u001f\u00106\u001a\u00020\u00122\u0006\u0010*\u001a\u00020\u00022\u0006\u00105\u001a\u00020\u0010H\u0016¢\u0006\u0004\b6\u0010!J!\u00108\u001a\u00020\u00122\u0006\u0010*\u001a\u00020\u00022\b\u00107\u001a\u0004\u0018\u00010\u0006H\u0016¢\u0006\u0004\b8\u00102J!\u0010:\u001a\u00020\u00122\u0006\u0010*\u001a\u00020\u00022\b\u00109\u001a\u0004\u0018\u00010\u0010H\u0016¢\u0006\u0004\b:\u0010;J!\u0010=\u001a\u00020\u00122\u0006\u0010*\u001a\u00020\u00022\b\u0010<\u001a\u0004\u0018\u00010\u0010H\u0016¢\u0006\u0004\b=\u0010;J\u001f\u0010?\u001a\u00020\u00122\u0006\u0010*\u001a\u00020\u00022\u0006\u0010>\u001a\u00020&H\u0016¢\u0006\u0004\b?\u0010-J\u001f\u0010A\u001a\u00020\u00122\u0006\u0010*\u001a\u00020\u00022\u0006\u0010@\u001a\u00020&H\u0016¢\u0006\u0004\bA\u0010-J!\u0010C\u001a\u00020\u00122\u0006\u0010*\u001a\u00020\u00022\b\u0010B\u001a\u0004\u0018\u00010\u0010H\u0016¢\u0006\u0004\bC\u0010;J\u001f\u0010E\u001a\u00020\u00122\u0006\u0010*\u001a\u00020\u00022\u0006\u0010D\u001a\u00020&H\u0016¢\u0006\u0004\bE\u0010-J\u001f\u0010G\u001a\u00020\u00122\u0006\u0010*\u001a\u00020\u00022\u0006\u0010F\u001a\u00020&H\u0016¢\u0006\u0004\bG\u0010-J\u001f\u0010I\u001a\u00020\u00122\u0006\u0010*\u001a\u00020\u00022\u0006\u0010H\u001a\u00020&H\u0016¢\u0006\u0004\bI\u0010-J!\u0010K\u001a\u00020\u00122\u0006\u0010*\u001a\u00020\u00022\b\u0010J\u001a\u0004\u0018\u00010\u0006H\u0016¢\u0006\u0004\bK\u00102J!\u0010M\u001a\u00020\u00122\b\u0010*\u001a\u0004\u0018\u00010\u00022\u0006\u0010L\u001a\u00020&H\u0016¢\u0006\u0004\bM\u0010-J\u001b\u0010O\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u001a0NH\u0016¢\u0006\u0004\bO\u0010PJ\u0015\u0010R\u001a\b\u0012\u0004\u0012\u00020\u00020QH\u0014¢\u0006\u0004\bR\u0010SJ#\u0010T\u001a\u00020\u00122\b\u0010\u0015\u001a\u0004\u0018\u00010\u00022\b\u0010L\u001a\u0004\u0018\u00010\u0006H\u0016¢\u0006\u0004\bT\u00102J#\u0010U\u001a\u00020\u00122\b\u0010\u0015\u001a\u0004\u0018\u00010\u00022\b\u0010L\u001a\u0004\u0018\u00010\u0006H\u0016¢\u0006\u0004\bU\u00102J!\u0010V\u001a\u00020\u00122\b\u0010\u0015\u001a\u0004\u0018\u00010\u00022\u0006\u0010L\u001a\u00020\u0010H\u0016¢\u0006\u0004\bV\u0010!J!\u0010W\u001a\u00020\u00122\b\u0010\u0015\u001a\u0004\u0018\u00010\u00022\u0006\u0010L\u001a\u00020&H\u0016¢\u0006\u0004\bW\u0010-J!\u0010X\u001a\u00020\u00122\b\u0010\u0015\u001a\u0004\u0018\u00010\u00022\u0006\u0010L\u001a\u00020&H\u0016¢\u0006\u0004\bX\u0010-J#\u0010Y\u001a\u00020\u00122\b\u0010\u0015\u001a\u0004\u0018\u00010\u00022\b\u0010L\u001a\u0004\u0018\u00010\u0006H\u0016¢\u0006\u0004\bY\u00102J!\u0010Z\u001a\u00020\u00122\b\u0010\u0015\u001a\u0004\u0018\u00010\u00022\u0006\u0010L\u001a\u00020\u0010H\u0016¢\u0006\u0004\bZ\u0010!J#\u0010[\u001a\u00020\u00122\b\u0010\u0015\u001a\u0004\u0018\u00010\u00022\b\u0010L\u001a\u0004\u0018\u00010\u0006H\u0016¢\u0006\u0004\b[\u00102J#\u0010\\\u001a\u00020\u00122\b\u0010\u0015\u001a\u0004\u0018\u00010\u00022\b\u0010L\u001a\u0004\u0018\u00010\u0010H\u0016¢\u0006\u0004\b\\\u0010;J!\u0010]\u001a\u00020\u00122\b\u0010\u0015\u001a\u0004\u0018\u00010\u00022\u0006\u0010L\u001a\u00020&H\u0016¢\u0006\u0004\b]\u0010-J#\u0010^\u001a\u00020\u00122\b\u0010\u0015\u001a\u0004\u0018\u00010\u00022\b\u0010L\u001a\u0004\u0018\u00010\u0010H\u0016¢\u0006\u0004\b^\u0010;J!\u0010_\u001a\u00020\u00122\b\u0010\u0015\u001a\u0004\u0018\u00010\u00022\u0006\u0010L\u001a\u00020&H\u0016¢\u0006\u0004\b_\u0010-J#\u0010`\u001a\u00020\u00122\b\u0010\u0015\u001a\u0004\u0018\u00010\u00022\b\u0010L\u001a\u0004\u0018\u00010\u0006H\u0016¢\u0006\u0004\b`\u00102J#\u0010a\u001a\u00020\u00122\b\u0010\u0015\u001a\u0004\u0018\u00010\u00022\b\u0010L\u001a\u0004\u0018\u00010\u0006H\u0016¢\u0006\u0004\ba\u00102J\u001f\u0010c\u001a\u00020\u00122\u0006\u0010*\u001a\u00020\u00022\u0006\u0010b\u001a\u00020&H\u0016¢\u0006\u0004\bc\u0010-J#\u0010e\u001a\u00020\u00122\b\u0010\u0015\u001a\u0004\u0018\u00010\u00022\b\u0010L\u001a\u0004\u0018\u00010dH\u0016¢\u0006\u0004\be\u0010fJ#\u0010g\u001a\u00020\u00122\b\u0010\u0015\u001a\u0004\u0018\u00010\u00022\b\u0010L\u001a\u0004\u0018\u00010dH\u0016¢\u0006\u0004\bg\u0010fJ#\u0010h\u001a\u00020\u00122\b\u0010\u0015\u001a\u0004\u0018\u00010\u00022\b\u0010L\u001a\u0004\u0018\u00010\u0006H\u0016¢\u0006\u0004\bh\u00102R\u001a\u0010i\u001a\b\u0012\u0004\u0012\u00020\u00020Q8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bi\u0010j¨\u0006m"}, d2 = {"Lcom/swmansion/rnscreens/ScreenStackHeaderConfigViewManager;", "Lcom/facebook/react/uimanager/ViewGroupManager;", "Lcom/swmansion/rnscreens/b0;", "Lcom/facebook/react/viewmanagers/RNSScreenStackHeaderConfigManagerInterface;", "<init>", "()V", "", "getName", "()Ljava/lang/String;", "Lcom/facebook/react/uimanager/ThemedReactContext;", "reactContext", "createViewInstance", "(Lcom/facebook/react/uimanager/ThemedReactContext;)Lcom/swmansion/rnscreens/b0;", "parent", "Landroid/view/View;", "child", "", "index", "", "addView", "(Lcom/swmansion/rnscreens/b0;Landroid/view/View;I)V", "view", "Lcom/facebook/react/uimanager/ReactStylesDiffMap;", "props", "Lcom/facebook/react/uimanager/StateWrapper;", "stateWrapper", "", "updateState", "(Lcom/swmansion/rnscreens/b0;Lcom/facebook/react/uimanager/ReactStylesDiffMap;Lcom/facebook/react/uimanager/StateWrapper;)Ljava/lang/Object;", "onDropViewInstance", "(Lcom/swmansion/rnscreens/b0;)V", "removeAllViews", "removeViewAt", "(Lcom/swmansion/rnscreens/b0;I)V", "getChildCount", "(Lcom/swmansion/rnscreens/b0;)I", "getChildAt", "(Lcom/swmansion/rnscreens/b0;I)Landroid/view/View;", "", "needsCustomLayoutForChildren", "()Z", "onAfterUpdateTransaction", "config", "consumeTopInset", "setConsumeTopInset", "(Lcom/swmansion/rnscreens/b0;Z)V", "legacyTopInsetBehavior", "setLegacyTopInsetBehavior", "title", "setTitle", "(Lcom/swmansion/rnscreens/b0;Ljava/lang/String;)V", "titleFontFamily", "setTitleFontFamily", "titleFontSize", "setTitleFontSize", "titleFontWeight", "setTitleFontWeight", "titleColor", "setTitleColor", "(Lcom/swmansion/rnscreens/b0;Ljava/lang/Integer;)V", ViewProps.BACKGROUND_COLOR, "setBackgroundColor", "hideShadow", "setHideShadow", "hideBackButton", "setHideBackButton", ViewProps.COLOR, "setColor", ViewProps.HIDDEN, "setHidden", "translucent", "setTranslucent", "backButtonInCustomView", "setBackButtonInCustomView", EventKeys.DIRECTION_KEY, "setDirection", EventKeys.VALUE_KEY, "setSynchronousShadowStateUpdatesEnabled", "", "getExportedCustomDirectEventTypeConstants", "()Ljava/util/Map;", "Lcom/facebook/react/uimanager/ViewManagerDelegate;", "getDelegate", "()Lcom/facebook/react/uimanager/ViewManagerDelegate;", "setBackTitle", "setBackTitleFontFamily", "setBackTitleFontSize", "setBackTitleVisible", "setLargeTitle", "setLargeTitleFontFamily", "setLargeTitleFontSize", "setLargeTitleFontWeight", "setLargeTitleBackgroundColor", "setLargeTitleHideShadow", "setLargeTitleColor", "setDisableBackButtonMenu", "setBackButtonDisplayMode", "setBlurEffect", "topInsetEnabled", "setTopInsetEnabled", "Lcom/facebook/react/bridge/ReadableArray;", "setHeaderLeftBarButtonItems", "(Lcom/swmansion/rnscreens/b0;Lcom/facebook/react/bridge/ReadableArray;)V", "setHeaderRightBarButtonItems", "setUserInterfaceStyle", "delegate", "Lcom/facebook/react/uimanager/ViewManagerDelegate;", "Companion", "a", "react-native-screens_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class ScreenStackHeaderConfigViewManager extends ViewGroupManager<b0> implements RNSScreenStackHeaderConfigManagerInterface<b0> {

    @NotNull
    public static final String REACT_CLASS = "RNSScreenStackHeaderConfig";

    @NotNull
    private final ViewManagerDelegate<b0> delegate;

    public ScreenStackHeaderConfigViewManager() {
        super(null, 1, null);
        this.delegate = new RNSScreenStackHeaderConfigManagerDelegate(this);
    }

    @Override // com.facebook.react.uimanager.ViewManager
    @NotNull
    public ViewManagerDelegate<b0> getDelegate() {
        return this.delegate;
    }

    @Override // com.facebook.react.uimanager.BaseViewManager, com.facebook.react.uimanager.ViewManager
    @NotNull
    public Map<String, Object> getExportedCustomDirectEventTypeConstants() {
        return MapsKt.hashMapOf(TuplesKt.to("topAttached", MapsKt.hashMapOf(TuplesKt.to("registrationName", "onAttached"))), TuplesKt.to("topDetached", MapsKt.hashMapOf(TuplesKt.to("registrationName", "onDetached"))));
    }

    @Override // com.facebook.react.uimanager.ViewManager, com.facebook.react.bridge.NativeModule
    @NotNull
    public String getName() {
        return REACT_CLASS;
    }

    @Override // com.facebook.react.uimanager.ViewGroupManager, com.facebook.react.uimanager.IViewManagerWithChildren
    public boolean needsCustomLayoutForChildren() {
        return true;
    }

    @Override // com.facebook.react.viewmanagers.RNSScreenStackHeaderConfigManagerInterface
    public void setBackButtonDisplayMode(@Nullable b0 view, @Nullable String value) {
    }

    @Override // com.facebook.react.viewmanagers.RNSScreenStackHeaderConfigManagerInterface
    public void setBackTitle(@Nullable b0 view, @Nullable String value) {
    }

    @Override // com.facebook.react.viewmanagers.RNSScreenStackHeaderConfigManagerInterface
    public void setBackTitleFontFamily(@Nullable b0 view, @Nullable String value) {
    }

    @Override // com.facebook.react.viewmanagers.RNSScreenStackHeaderConfigManagerInterface
    public void setBackTitleFontSize(@Nullable b0 view, int value) {
    }

    @Override // com.facebook.react.viewmanagers.RNSScreenStackHeaderConfigManagerInterface
    public void setBackTitleVisible(@Nullable b0 view, boolean value) {
    }

    @Override // com.facebook.react.viewmanagers.RNSScreenStackHeaderConfigManagerInterface
    public void setBlurEffect(@Nullable b0 view, @Nullable String value) {
    }

    @Override // com.facebook.react.viewmanagers.RNSScreenStackHeaderConfigManagerInterface
    public void setDisableBackButtonMenu(@Nullable b0 view, boolean value) {
    }

    @Override // com.facebook.react.viewmanagers.RNSScreenStackHeaderConfigManagerInterface
    public void setHeaderLeftBarButtonItems(@Nullable b0 view, @Nullable ReadableArray value) {
    }

    @Override // com.facebook.react.viewmanagers.RNSScreenStackHeaderConfigManagerInterface
    public void setHeaderRightBarButtonItems(@Nullable b0 view, @Nullable ReadableArray value) {
    }

    @Override // com.facebook.react.viewmanagers.RNSScreenStackHeaderConfigManagerInterface
    public void setLargeTitle(@Nullable b0 view, boolean value) {
    }

    @Override // com.facebook.react.viewmanagers.RNSScreenStackHeaderConfigManagerInterface
    public void setLargeTitleBackgroundColor(@Nullable b0 view, @Nullable Integer value) {
    }

    @Override // com.facebook.react.viewmanagers.RNSScreenStackHeaderConfigManagerInterface
    public void setLargeTitleColor(@Nullable b0 view, @Nullable Integer value) {
    }

    @Override // com.facebook.react.viewmanagers.RNSScreenStackHeaderConfigManagerInterface
    public void setLargeTitleFontFamily(@Nullable b0 view, @Nullable String value) {
    }

    @Override // com.facebook.react.viewmanagers.RNSScreenStackHeaderConfigManagerInterface
    public void setLargeTitleFontSize(@Nullable b0 view, int value) {
    }

    @Override // com.facebook.react.viewmanagers.RNSScreenStackHeaderConfigManagerInterface
    public void setLargeTitleFontWeight(@Nullable b0 view, @Nullable String value) {
    }

    @Override // com.facebook.react.viewmanagers.RNSScreenStackHeaderConfigManagerInterface
    public void setLargeTitleHideShadow(@Nullable b0 view, boolean value) {
    }

    @Override // com.facebook.react.viewmanagers.RNSScreenStackHeaderConfigManagerInterface
    public void setSynchronousShadowStateUpdatesEnabled(@Nullable b0 config, boolean value) {
    }

    @Override // com.facebook.react.viewmanagers.RNSScreenStackHeaderConfigManagerInterface
    public void setTopInsetEnabled(@NotNull b0 config, boolean topInsetEnabled) {
        Intrinsics.checkNotNullParameter(config, "config");
    }

    @Override // com.facebook.react.viewmanagers.RNSScreenStackHeaderConfigManagerInterface
    public void setUserInterfaceStyle(@Nullable b0 view, @Nullable String value) {
    }

    @Override // com.facebook.react.uimanager.ViewManager
    @NotNull
    public b0 createViewInstance(@NotNull ThemedReactContext reactContext) {
        Intrinsics.checkNotNullParameter(reactContext, "reactContext");
        return new b0(reactContext);
    }

    @Override // com.facebook.react.uimanager.BaseViewManager, com.facebook.react.uimanager.ViewManager
    public void onAfterUpdateTransaction(@NotNull b0 parent) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        super.onAfterUpdateTransaction((ScreenStackHeaderConfigViewManager) parent);
        parent.m();
    }

    @Override // com.facebook.react.uimanager.BaseViewManager, com.facebook.react.uimanager.ViewManager
    public void onDropViewInstance(@NotNull b0 view) {
        Intrinsics.checkNotNullParameter(view, "view");
        view.h();
    }

    @Override // com.facebook.react.uimanager.IViewGroupManager
    public void removeAllViews(@NotNull b0 parent) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        parent.n();
    }

    @Override // com.facebook.react.viewmanagers.RNSScreenStackHeaderConfigManagerInterface
    public void setBackButtonInCustomView(@NotNull b0 config, boolean backButtonInCustomView) {
        Intrinsics.checkNotNullParameter(config, "config");
        config.setBackButtonInCustomView(backButtonInCustomView);
    }

    @Override // com.facebook.react.viewmanagers.RNSScreenStackHeaderConfigManagerInterface
    public void setBackgroundColor(@NotNull b0 config, @Nullable Integer backgroundColor) {
        Intrinsics.checkNotNullParameter(config, "config");
        config.setBackgroundColor(backgroundColor);
    }

    @Override // com.facebook.react.viewmanagers.RNSScreenStackHeaderConfigManagerInterface
    public void setColor(@NotNull b0 config, @Nullable Integer color) {
        Intrinsics.checkNotNullParameter(config, "config");
        config.setTintColor(color != null ? color.intValue() : 0);
    }

    @Override // com.facebook.react.viewmanagers.RNSScreenStackHeaderConfigManagerInterface
    public void setConsumeTopInset(@NotNull b0 config, boolean consumeTopInset) {
        Intrinsics.checkNotNullParameter(config, "config");
        config.setConsumeTopInset(consumeTopInset);
    }

    @Override // com.facebook.react.viewmanagers.RNSScreenStackHeaderConfigManagerInterface
    public void setDirection(@NotNull b0 config, @Nullable String direction) {
        Intrinsics.checkNotNullParameter(config, "config");
        config.setDirection(direction);
    }

    @Override // com.facebook.react.viewmanagers.RNSScreenStackHeaderConfigManagerInterface
    public void setHidden(@NotNull b0 config, boolean hidden) {
        Intrinsics.checkNotNullParameter(config, "config");
        config.setHidden(hidden);
    }

    @Override // com.facebook.react.viewmanagers.RNSScreenStackHeaderConfigManagerInterface
    public void setHideBackButton(@NotNull b0 config, boolean hideBackButton) {
        Intrinsics.checkNotNullParameter(config, "config");
        config.setHideBackButton(hideBackButton);
    }

    @Override // com.facebook.react.viewmanagers.RNSScreenStackHeaderConfigManagerInterface
    public void setHideShadow(@NotNull b0 config, boolean hideShadow) {
        Intrinsics.checkNotNullParameter(config, "config");
        config.setHideShadow(hideShadow);
    }

    @Override // com.facebook.react.viewmanagers.RNSScreenStackHeaderConfigManagerInterface
    public void setLegacyTopInsetBehavior(@NotNull b0 config, boolean legacyTopInsetBehavior) {
        Intrinsics.checkNotNullParameter(config, "config");
        config.setLegacyTopInsetBehavior(legacyTopInsetBehavior);
    }

    @Override // com.facebook.react.viewmanagers.RNSScreenStackHeaderConfigManagerInterface
    public void setTitle(@NotNull b0 config, @Nullable String title) {
        Intrinsics.checkNotNullParameter(config, "config");
        config.setTitle(title);
    }

    @Override // com.facebook.react.viewmanagers.RNSScreenStackHeaderConfigManagerInterface
    public void setTitleColor(@NotNull b0 config, @Nullable Integer titleColor) {
        Intrinsics.checkNotNullParameter(config, "config");
        if (titleColor != null) {
            config.setTitleColor(titleColor.intValue());
        }
    }

    @Override // com.facebook.react.viewmanagers.RNSScreenStackHeaderConfigManagerInterface
    public void setTitleFontFamily(@NotNull b0 config, @Nullable String titleFontFamily) {
        Intrinsics.checkNotNullParameter(config, "config");
        config.setTitleFontFamily(titleFontFamily);
    }

    @Override // com.facebook.react.viewmanagers.RNSScreenStackHeaderConfigManagerInterface
    public void setTitleFontSize(@NotNull b0 config, int titleFontSize) {
        Intrinsics.checkNotNullParameter(config, "config");
        config.setTitleFontSize(titleFontSize);
    }

    @Override // com.facebook.react.viewmanagers.RNSScreenStackHeaderConfigManagerInterface
    public void setTitleFontWeight(@NotNull b0 config, @Nullable String titleFontWeight) {
        Intrinsics.checkNotNullParameter(config, "config");
        config.setTitleFontWeight(titleFontWeight);
    }

    @Override // com.facebook.react.viewmanagers.RNSScreenStackHeaderConfigManagerInterface
    public void setTranslucent(@NotNull b0 config, boolean translucent) {
        Intrinsics.checkNotNullParameter(config, "config");
        config.setTranslucent(translucent);
    }

    @Override // com.facebook.react.uimanager.ViewManager
    @Nullable
    public Object updateState(@NotNull b0 view, @Nullable ReactStylesDiffMap props, @Nullable StateWrapper stateWrapper) {
        Intrinsics.checkNotNullParameter(view, "view");
        view.setStateWrapper(stateWrapper);
        return super.updateState((ScreenStackHeaderConfigViewManager) view, props, stateWrapper);
    }

    @Override // com.facebook.react.uimanager.ViewGroupManager
    public void addView(@NotNull b0 parent, @NotNull View child, int index) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        Intrinsics.checkNotNullParameter(child, "child");
        if (child instanceof d0) {
            parent.e((d0) child, index);
            return;
        }
        throw new JSApplicationCausedNativeException("Config children should be of type RNSScreenStackHeaderSubview");
    }

    @Override // com.facebook.react.uimanager.ViewGroupManager
    @NotNull
    public View getChildAt(@NotNull b0 parent, int index) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        return parent.i(index);
    }

    @Override // com.facebook.react.uimanager.ViewGroupManager
    public int getChildCount(@NotNull b0 parent) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        return parent.getConfigSubviewsCount();
    }

    @Override // com.facebook.react.uimanager.ViewGroupManager
    public void removeViewAt(@NotNull b0 parent, int index) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        parent.o(index);
    }
}
