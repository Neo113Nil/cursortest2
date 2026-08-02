package com.swmansion.rnscreens.gamma.tabs.screen;

import android.content.Context;
import android.graphics.drawable.Drawable;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.module.annotations.ReactModule;
import com.facebook.react.uimanager.ThemedReactContext;
import com.facebook.react.uimanager.ViewGroupManager;
import com.facebook.react.uimanager.ViewManagerDelegate;
import com.facebook.react.viewmanagers.RNSTabsScreenAndroidManagerDelegate;
import com.facebook.react.viewmanagers.RNSTabsScreenAndroidManagerInterface;
import com.twilio.voice.EventKeys;
import dd.C4062i;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.MapsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@ReactModule(name = TabsScreenViewManager.REACT_CLASS)
@Metadata(d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010%\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0014\b\u0007\u0018\u0000 :2\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00020\u0003:\u0001;B\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\t\u0010\nJ\u001b\u0010\r\u001a\u0004\u0018\u00010\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\u0006H\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u0010\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u0017\u0010\u0014\u001a\u00020\u00022\u0006\u0010\u0013\u001a\u00020\u0012H\u0014¢\u0006\u0004\b\u0014\u0010\u0015J\u0015\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00020\u0016H\u0014¢\u0006\u0004\b\u0017\u0010\u0018J\u001b\u0010\u001b\u001a\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u001a0\u0019H\u0016¢\u0006\u0004\b\u001b\u0010\u001cJ\u001f\u0010\u001f\u001a\u00020\u001e2\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u001d\u001a\u00020\u0002H\u0014¢\u0006\u0004\b\u001f\u0010 J!\u0010\"\u001a\u00020\u001e2\u0006\u0010\u001d\u001a\u00020\u00022\b\u0010!\u001a\u0004\u0018\u00010\u000fH\u0016¢\u0006\u0004\b\"\u0010#J!\u0010$\u001a\u00020\u001e2\u0006\u0010\u001d\u001a\u00020\u00022\b\u0010!\u001a\u0004\u0018\u00010\u000fH\u0016¢\u0006\u0004\b$\u0010#J!\u0010%\u001a\u00020\u001e2\u0006\u0010\u001d\u001a\u00020\u00022\b\u0010!\u001a\u0004\u0018\u00010\u000fH\u0016¢\u0006\u0004\b%\u0010#J!\u0010&\u001a\u00020\u001e2\u0006\u0010\u001d\u001a\u00020\u00022\b\u0010!\u001a\u0004\u0018\u00010\u0006H\u0016¢\u0006\u0004\b&\u0010'J\u001f\u0010)\u001a\u00020\u001e2\u0006\u0010\u001d\u001a\u00020\u00022\u0006\u0010!\u001a\u00020(H\u0016¢\u0006\u0004\b)\u0010*J!\u0010+\u001a\u00020\u001e2\u0006\u0010\u001d\u001a\u00020\u00022\b\u0010!\u001a\u0004\u0018\u00010\u000fH\u0016¢\u0006\u0004\b+\u0010#J!\u0010,\u001a\u00020\u001e2\u0006\u0010\u001d\u001a\u00020\u00022\b\u0010!\u001a\u0004\u0018\u00010\u000fH\u0016¢\u0006\u0004\b,\u0010#J!\u0010-\u001a\u00020\u001e2\u0006\u0010\u001d\u001a\u00020\u00022\b\u0010!\u001a\u0004\u0018\u00010\u000fH\u0016¢\u0006\u0004\b-\u0010#J!\u0010.\u001a\u00020\u001e2\u0006\u0010\u001d\u001a\u00020\u00022\b\u0010!\u001a\u0004\u0018\u00010\u000fH\u0016¢\u0006\u0004\b.\u0010#J!\u0010/\u001a\u00020\u001e2\u0006\u0010\u001d\u001a\u00020\u00022\b\u0010!\u001a\u0004\u0018\u00010\u0006H\u0016¢\u0006\u0004\b/\u0010'J!\u00100\u001a\u00020\u001e2\u0006\u0010\u001d\u001a\u00020\u00022\b\u0010!\u001a\u0004\u0018\u00010\u0006H\u0016¢\u0006\u0004\b0\u0010'J!\u00101\u001a\u00020\u001e2\u0006\u0010\u001d\u001a\u00020\u00022\b\u0010!\u001a\u0004\u0018\u00010\u0006H\u0016¢\u0006\u0004\b1\u0010'R\u001a\u00102\u001a\b\u0012\u0004\u0012\u00020\u00020\u00168\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b2\u00103R$\u00104\u001a\u0004\u0018\u00010\u00128\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b4\u00105\u001a\u0004\b6\u00107\"\u0004\b8\u00109¨\u0006<"}, d2 = {"Lcom/swmansion/rnscreens/gamma/tabs/screen/TabsScreenViewManager;", "Lcom/facebook/react/uimanager/ViewGroupManager;", "Lcom/swmansion/rnscreens/gamma/tabs/screen/a;", "Lcom/facebook/react/viewmanagers/RNSTabsScreenAndroidManagerInterface;", "<init>", "()V", "Lcom/facebook/react/bridge/ReadableMap;", "appearance", "LWc/b;", "parseAndroidTabsAppearance", "(Lcom/facebook/react/bridge/ReadableMap;)LWc/b;", "itemStateAppearance", "LWc/a;", "parseItemStateAppearance", "(Lcom/facebook/react/bridge/ReadableMap;)LWc/a;", "", "getName", "()Ljava/lang/String;", "Lcom/facebook/react/uimanager/ThemedReactContext;", "reactContext", "createViewInstance", "(Lcom/facebook/react/uimanager/ThemedReactContext;)Lcom/swmansion/rnscreens/gamma/tabs/screen/a;", "Lcom/facebook/react/uimanager/ViewManagerDelegate;", "getDelegate", "()Lcom/facebook/react/uimanager/ViewManagerDelegate;", "", "", "getExportedCustomDirectEventTypeConstants", "()Ljava/util/Map;", "view", "", "addEventEmitters", "(Lcom/facebook/react/uimanager/ThemedReactContext;Lcom/swmansion/rnscreens/gamma/tabs/screen/a;)V", EventKeys.VALUE_KEY, "setScreenKey", "(Lcom/swmansion/rnscreens/gamma/tabs/screen/a;Ljava/lang/String;)V", "setBadgeValue", "setTitle", "setSpecialEffects", "(Lcom/swmansion/rnscreens/gamma/tabs/screen/a;Lcom/facebook/react/bridge/ReadableMap;)V", "", "setPreventNativeSelection", "(Lcom/swmansion/rnscreens/gamma/tabs/screen/a;Z)V", "setTabBarItemTestID", "setTabBarItemAccessibilityLabel", "setDrawableIconResourceName", "setSelectedDrawableIconResourceName", "setImageIconResource", "setSelectedImageIconResource", "setStandardAppearance", "delegate", "Lcom/facebook/react/uimanager/ViewManagerDelegate;", "context", "Lcom/facebook/react/uimanager/ThemedReactContext;", "getContext", "()Lcom/facebook/react/uimanager/ThemedReactContext;", "setContext", "(Lcom/facebook/react/uimanager/ThemedReactContext;)V", "Companion", "a", "react-native-screens_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class TabsScreenViewManager extends ViewGroupManager<a> implements RNSTabsScreenAndroidManagerInterface<a> {

    @NotNull
    public static final String REACT_CLASS = "RNSTabsScreenAndroid";

    @NotNull
    public static final String TAG = "TabsScreenViewManager";

    @Nullable
    private ThemedReactContext context;

    @NotNull
    private final ViewManagerDelegate<a> delegate;

    public TabsScreenViewManager() {
        super(null, 1, null);
        this.delegate = new RNSTabsScreenAndroidManagerDelegate(this);
    }

    private final Wc.b parseAndroidTabsAppearance(ReadableMap appearance) {
        Integer f10;
        Integer f11;
        String h10;
        Integer f12;
        Boolean e10;
        String h11;
        Float g10;
        Float g11;
        String h12;
        String h13;
        Integer f13;
        Integer f14;
        f10 = h.f(appearance, "tabBarBackgroundColor");
        f11 = h.f(appearance, "tabBarItemRippleColor");
        h10 = h.h(appearance, "tabBarItemLabelVisibilityMode");
        Wc.a parseItemStateAppearance = appearance.hasKey("normal") ? parseItemStateAppearance(appearance.getMap("normal")) : null;
        Wc.a parseItemStateAppearance2 = appearance.hasKey("selected") ? parseItemStateAppearance(appearance.getMap("selected")) : null;
        Wc.a parseItemStateAppearance3 = appearance.hasKey("focused") ? parseItemStateAppearance(appearance.getMap("focused")) : null;
        Wc.a parseItemStateAppearance4 = appearance.hasKey("disabled") ? parseItemStateAppearance(appearance.getMap("disabled")) : null;
        f12 = h.f(appearance, "tabBarItemActiveIndicatorColor");
        e10 = h.e(appearance, "tabBarItemActiveIndicatorEnabled");
        h11 = h.h(appearance, "tabBarItemTitleFontFamily");
        g10 = h.g(appearance, "tabBarItemTitleSmallLabelFontSize");
        g11 = h.g(appearance, "tabBarItemTitleLargeLabelFontSize");
        h12 = h.h(appearance, "tabBarItemTitleFontWeight");
        h13 = h.h(appearance, "tabBarItemTitleFontStyle");
        f13 = h.f(appearance, "tabBarItemBadgeBackgroundColor");
        f14 = h.f(appearance, "tabBarItemBadgeTextColor");
        return new Wc.b(f10, f11, h10, parseItemStateAppearance, parseItemStateAppearance2, parseItemStateAppearance3, parseItemStateAppearance4, f12, e10, h11, g10, g11, h12, h13, f13, f14);
    }

    private final Wc.a parseItemStateAppearance(ReadableMap itemStateAppearance) {
        Integer f10;
        Integer f11;
        if (itemStateAppearance == null) {
            return null;
        }
        f10 = h.f(itemStateAppearance, "tabBarItemIconColor");
        f11 = h.f(itemStateAppearance, "tabBarItemTitleFontColor");
        return new Wc.a(f10, f11);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit setImageIconResource$lambda$1(a aVar, Drawable drawable) {
        Intrinsics.checkNotNullParameter(drawable, "drawable");
        aVar.setIcon(drawable);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit setSelectedImageIconResource$lambda$2(a aVar, Drawable drawable) {
        Intrinsics.checkNotNullParameter(drawable, "drawable");
        aVar.setSelectedIcon(drawable);
        return Unit.INSTANCE;
    }

    @Nullable
    public final ThemedReactContext getContext() {
        return this.context;
    }

    @Override // com.facebook.react.uimanager.ViewManager
    @NotNull
    public ViewManagerDelegate<a> getDelegate() {
        return this.delegate;
    }

    @Override // com.facebook.react.uimanager.BaseViewManager, com.facebook.react.uimanager.ViewManager
    @NotNull
    public Map<String, Object> getExportedCustomDirectEventTypeConstants() {
        return MapsKt.mutableMapOf(Qc.a.a(Yc.c.f14132a), Qc.a.a(Yc.a.f14130a), Qc.a.a(Yc.d.f14133a), Qc.a.a(Yc.b.f14131a));
    }

    @Override // com.facebook.react.uimanager.ViewManager, com.facebook.react.bridge.NativeModule
    @NotNull
    public String getName() {
        return REACT_CLASS;
    }

    public final void setContext(@Nullable ThemedReactContext themedReactContext) {
        this.context = themedReactContext;
    }

    @Override // com.facebook.react.uimanager.BaseViewManager, com.facebook.react.uimanager.ViewManager
    public void addEventEmitters(@NotNull ThemedReactContext reactContext, @NotNull a view) {
        Intrinsics.checkNotNullParameter(reactContext, "reactContext");
        Intrinsics.checkNotNullParameter(view, "view");
        super.addEventEmitters(reactContext, (ThemedReactContext) view);
        view.e();
    }

    @Override // com.facebook.react.uimanager.ViewManager
    @NotNull
    public a createViewInstance(@NotNull ThemedReactContext reactContext) {
        Intrinsics.checkNotNullParameter(reactContext, "reactContext");
        C4062i.f45172a.a(REACT_CLASS, "createViewInstance");
        return new a(reactContext);
    }

    @Override // com.facebook.react.viewmanagers.RNSTabsScreenAndroidManagerInterface
    public void setBadgeValue(@NotNull a view, @Nullable String value) {
        Intrinsics.checkNotNullParameter(view, "view");
        view.setBadgeValue(value);
    }

    @Override // com.facebook.react.viewmanagers.RNSTabsScreenAndroidManagerInterface
    public void setDrawableIconResourceName(@NotNull a view, @Nullable String value) {
        Intrinsics.checkNotNullParameter(view, "view");
        view.setDrawableIconResourceName(value);
    }

    @Override // com.facebook.react.viewmanagers.RNSTabsScreenAndroidManagerInterface
    public void setImageIconResource(@NotNull final a view, @Nullable ReadableMap value) {
        Intrinsics.checkNotNullParameter(view, "view");
        String string = value != null ? value.getString("uri") : null;
        if (string != null) {
            Context context = view.getContext();
            Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
            Qc.f.c(context, string, new Function1() { // from class: com.swmansion.rnscreens.gamma.tabs.screen.g
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    Unit imageIconResource$lambda$1;
                    imageIconResource$lambda$1 = TabsScreenViewManager.setImageIconResource$lambda$1(a.this, (Drawable) obj);
                    return imageIconResource$lambda$1;
                }
            });
        }
    }

    @Override // com.facebook.react.viewmanagers.RNSTabsScreenAndroidManagerInterface
    public void setPreventNativeSelection(@NotNull a view, boolean value) {
        Intrinsics.checkNotNullParameter(view, "view");
        view.setPreventNativeSelection(value);
    }

    @Override // com.facebook.react.viewmanagers.RNSTabsScreenAndroidManagerInterface
    public void setScreenKey(@NotNull a view, @Nullable String value) {
        Intrinsics.checkNotNullParameter(view, "view");
        view.setScreenKey(value);
    }

    @Override // com.facebook.react.viewmanagers.RNSTabsScreenAndroidManagerInterface
    public void setSelectedDrawableIconResourceName(@NotNull a view, @Nullable String value) {
        Intrinsics.checkNotNullParameter(view, "view");
        view.setSelectedDrawableIconResourceName(value);
    }

    @Override // com.facebook.react.viewmanagers.RNSTabsScreenAndroidManagerInterface
    public void setSelectedImageIconResource(@NotNull final a view, @Nullable ReadableMap value) {
        Intrinsics.checkNotNullParameter(view, "view");
        String string = value != null ? value.getString("uri") : null;
        if (string != null) {
            Context context = view.getContext();
            Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
            Qc.f.c(context, string, new Function1() { // from class: com.swmansion.rnscreens.gamma.tabs.screen.f
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    Unit selectedImageIconResource$lambda$2;
                    selectedImageIconResource$lambda$2 = TabsScreenViewManager.setSelectedImageIconResource$lambda$2(a.this, (Drawable) obj);
                    return selectedImageIconResource$lambda$2;
                }
            });
        }
    }

    @Override // com.facebook.react.viewmanagers.RNSTabsScreenAndroidManagerInterface
    public void setSpecialEffects(@NotNull a view, @Nullable ReadableMap value) {
        boolean z10;
        ReadableMap map;
        Intrinsics.checkNotNullParameter(view, "view");
        boolean z11 = true;
        if (!(value != null ? value.hasKey("repeatedTabSelection") : false) || (map = value.getMap("repeatedTabSelection")) == null) {
            z10 = true;
        } else {
            z10 = map.hasKey("scrollToTop") ? map.getBoolean("scrollToTop") : true;
            if (map.hasKey("popToRoot")) {
                z11 = map.getBoolean("popToRoot");
            }
        }
        view.setShouldUseRepeatedTabSelectionPopToRootSpecialEffect(z11);
        view.setShouldUseRepeatedTabSelectionScrollToTopSpecialEffect(z10);
    }

    @Override // com.facebook.react.viewmanagers.RNSTabsScreenAndroidManagerInterface
    public void setStandardAppearance(@NotNull a view, @Nullable ReadableMap value) {
        Intrinsics.checkNotNullParameter(view, "view");
        if (value == null) {
            view.setAppearance$react_native_screens_release(null);
        } else {
            view.setAppearance$react_native_screens_release(parseAndroidTabsAppearance(value));
        }
    }

    @Override // com.facebook.react.viewmanagers.RNSTabsScreenAndroidManagerInterface
    public void setTabBarItemAccessibilityLabel(@NotNull a view, @Nullable String value) {
        Intrinsics.checkNotNullParameter(view, "view");
        view.setTabBarItemAccessibilityLabel(value);
    }

    @Override // com.facebook.react.viewmanagers.RNSTabsScreenAndroidManagerInterface
    public void setTabBarItemTestID(@NotNull a view, @Nullable String value) {
        Intrinsics.checkNotNullParameter(view, "view");
        view.setTabBarItemTestID(value);
    }

    @Override // com.facebook.react.viewmanagers.RNSTabsScreenAndroidManagerInterface
    public void setTitle(@NotNull a view, @Nullable String value) {
        Intrinsics.checkNotNullParameter(view, "view");
        view.setTabTitle(value);
    }
}
