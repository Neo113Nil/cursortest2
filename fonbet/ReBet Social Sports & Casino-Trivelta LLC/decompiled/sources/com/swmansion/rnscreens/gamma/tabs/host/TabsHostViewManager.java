package com.swmansion.rnscreens.gamma.tabs.host;

import android.view.View;
import com.facebook.react.bridge.JSApplicationIllegalArgumentException;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.module.annotations.ReactModule;
import com.facebook.react.uimanager.ThemedReactContext;
import com.facebook.react.uimanager.ViewGroupManager;
import com.facebook.react.uimanager.ViewManagerDelegate;
import com.facebook.react.viewmanagers.RNSTabsHostAndroidManagerDelegate;
import com.facebook.react.viewmanagers.RNSTabsHostAndroidManagerInterface;
import com.swmansion.rnscreens.gamma.tabs.container.r;
import com.twilio.voice.EventKeys;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\b\n\u0002\u0010%\n\u0002\u0010\u0000\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\r\b\u0007\u0018\u0000 52\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00020\u0003:\u00016B\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\u000b\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\tH\u0014¢\u0006\u0004\b\u000b\u0010\fJ\u0015\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00020\rH\u0014¢\u0006\u0004\b\u000e\u0010\u000fJ'\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u0013H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u001f\u0010\u0018\u001a\u00020\u00152\u0006\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0012\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u001f\u0010\u001a\u001a\u00020\u00152\u0006\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0014\u001a\u00020\u0013H\u0016¢\u0006\u0004\b\u001a\u0010\u001bJ\u0017\u0010\u001c\u001a\u00020\u00152\u0006\u0010\u0010\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u001c\u0010\u001dJ\u001b\u0010 \u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u001f0\u001eH\u0016¢\u0006\u0004\b \u0010!J\u001f\u0010#\u001a\u00020\u00152\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\"\u001a\u00020\u0002H\u0014¢\u0006\u0004\b#\u0010$J\u0017\u0010%\u001a\u00020\u00152\u0006\u0010\"\u001a\u00020\u0002H\u0016¢\u0006\u0004\b%\u0010\u001dJ!\u0010(\u001a\u00020\u00152\u0006\u0010\"\u001a\u00020\u00022\b\u0010'\u001a\u0004\u0018\u00010&H\u0016¢\u0006\u0004\b(\u0010)J\u001f\u0010+\u001a\u00020\u00152\u0006\u0010\"\u001a\u00020\u00022\u0006\u0010'\u001a\u00020*H\u0016¢\u0006\u0004\b+\u0010,J\u001f\u0010-\u001a\u00020\u00152\u0006\u0010\"\u001a\u00020\u00022\u0006\u0010'\u001a\u00020*H\u0016¢\u0006\u0004\b-\u0010,J!\u0010.\u001a\u00020\u00152\u0006\u0010\"\u001a\u00020\u00022\b\u0010'\u001a\u0004\u0018\u00010\u0013H\u0016¢\u0006\u0004\b.\u0010/J\u001f\u00100\u001a\u00020\u00152\u0006\u0010\"\u001a\u00020\u00022\u0006\u0010'\u001a\u00020*H\u0016¢\u0006\u0004\b0\u0010,J!\u00101\u001a\u00020\u00152\u0006\u0010\"\u001a\u00020\u00022\b\u0010'\u001a\u0004\u0018\u00010\u0006H\u0016¢\u0006\u0004\b1\u00102R\u001a\u00103\u001a\b\u0012\u0004\u0012\u00020\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b3\u00104¨\u00067"}, d2 = {"Lcom/swmansion/rnscreens/gamma/tabs/host/TabsHostViewManager;", "Lcom/facebook/react/uimanager/ViewGroupManager;", "Lcom/swmansion/rnscreens/gamma/tabs/host/d;", "Lcom/facebook/react/viewmanagers/RNSTabsHostAndroidManagerInterface;", "<init>", "()V", "", "getName", "()Ljava/lang/String;", "Lcom/facebook/react/uimanager/ThemedReactContext;", "reactContext", "createViewInstance", "(Lcom/facebook/react/uimanager/ThemedReactContext;)Lcom/swmansion/rnscreens/gamma/tabs/host/d;", "Lcom/facebook/react/uimanager/ViewManagerDelegate;", "getDelegate", "()Lcom/facebook/react/uimanager/ViewManagerDelegate;", "parent", "Landroid/view/View;", "child", "", "index", "", "addView", "(Lcom/swmansion/rnscreens/gamma/tabs/host/d;Landroid/view/View;I)V", "removeView", "(Lcom/swmansion/rnscreens/gamma/tabs/host/d;Landroid/view/View;)V", "removeViewAt", "(Lcom/swmansion/rnscreens/gamma/tabs/host/d;I)V", "removeAllViews", "(Lcom/swmansion/rnscreens/gamma/tabs/host/d;)V", "", "", "getExportedCustomDirectEventTypeConstants", "()Ljava/util/Map;", "view", "addEventEmitters", "(Lcom/facebook/react/uimanager/ThemedReactContext;Lcom/swmansion/rnscreens/gamma/tabs/host/d;)V", "onDropViewInstance", "Lcom/facebook/react/bridge/ReadableMap;", EventKeys.VALUE_KEY, "setNavStateRequest", "(Lcom/swmansion/rnscreens/gamma/tabs/host/d;Lcom/facebook/react/bridge/ReadableMap;)V", "", "setRejectStaleNavStateUpdates", "(Lcom/swmansion/rnscreens/gamma/tabs/host/d;Z)V", "setTabBarHidden", "setNativeContainerBackgroundColor", "(Lcom/swmansion/rnscreens/gamma/tabs/host/d;Ljava/lang/Integer;)V", "setTabBarRespectsIMEInsets", "setColorScheme", "(Lcom/swmansion/rnscreens/gamma/tabs/host/d;Ljava/lang/String;)V", "delegate", "Lcom/facebook/react/uimanager/ViewManagerDelegate;", "Companion", "a", "react-native-screens_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@ReactModule(name = TabsHostViewManager.REACT_CLASS)
@SourceDebugExtension({"SMAP\nTabsHostViewManager.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TabsHostViewManager.kt\ncom/swmansion/rnscreens/gamma/tabs/host/TabsHostViewManager\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,141:1\n1#2:142\n*E\n"})
/* loaded from: classes4.dex */
public final class TabsHostViewManager extends ViewGroupManager<d> implements RNSTabsHostAndroidManagerInterface<d> {

    @NotNull
    public static final String REACT_CLASS = "RNSTabsHostAndroid";

    @NotNull
    private final ViewManagerDelegate<d> delegate;

    public TabsHostViewManager() {
        super(null, 1, null);
        this.delegate = new RNSTabsHostAndroidManagerDelegate(this);
    }

    @Override // com.facebook.react.uimanager.ViewManager
    @NotNull
    public ViewManagerDelegate<d> getDelegate() {
        return this.delegate;
    }

    @Override // com.facebook.react.uimanager.BaseViewManager, com.facebook.react.uimanager.ViewManager
    @NotNull
    public Map<String, Object> getExportedCustomDirectEventTypeConstants() {
        return MapsKt.mutableMapOf(Qc.a.a(Xc.a.f13708f), Qc.a.a(Xc.b.f13714c), Qc.a.a(Xc.c.f13717d));
    }

    @Override // com.facebook.react.uimanager.ViewManager, com.facebook.react.bridge.NativeModule
    @NotNull
    public String getName() {
        return REACT_CLASS;
    }

    @Override // com.facebook.react.uimanager.BaseViewManager, com.facebook.react.uimanager.ViewManager
    public void addEventEmitters(@NotNull ThemedReactContext reactContext, @NotNull d view) {
        Intrinsics.checkNotNullParameter(reactContext, "reactContext");
        Intrinsics.checkNotNullParameter(view, "view");
        super.addEventEmitters(reactContext, (ThemedReactContext) view);
        view.k();
    }

    @Override // com.facebook.react.uimanager.ViewManager
    @NotNull
    public d createViewInstance(@NotNull ThemedReactContext reactContext) {
        Intrinsics.checkNotNullParameter(reactContext, "reactContext");
        return new d(reactContext);
    }

    @Override // com.facebook.react.uimanager.BaseViewManager, com.facebook.react.uimanager.ViewManager
    public void onDropViewInstance(@NotNull d view) {
        Intrinsics.checkNotNullParameter(view, "view");
        view.m();
        super.onDropViewInstance((TabsHostViewManager) view);
    }

    @Override // com.facebook.react.uimanager.IViewGroupManager
    public void removeAllViews(@NotNull d parent) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        parent.n();
    }

    @Override // com.facebook.react.uimanager.ViewGroupManager
    public void removeView(@NotNull d parent, @NotNull View child) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        Intrinsics.checkNotNullParameter(child, "child");
        if (!(child instanceof com.swmansion.rnscreens.gamma.tabs.screen.a)) {
            throw new IllegalArgumentException("[RNScreens] Attempt to detach child that is not of type javaClass");
        }
        parent.q((com.swmansion.rnscreens.gamma.tabs.screen.a) child);
    }

    @Override // com.facebook.react.viewmanagers.RNSTabsHostAndroidManagerInterface
    public void setColorScheme(@NotNull d view, @Nullable String value) {
        Intrinsics.checkNotNullParameter(view, "view");
        if (value != null) {
            int hashCode = value.hashCode();
            if (hashCode != 3075958) {
                if (hashCode != 102970646) {
                    if (hashCode == 1946980603 && value.equals("inherit")) {
                        view.setColorScheme$react_native_screens_release(com.swmansion.rnscreens.gamma.common.colorscheme.a.f41808a);
                        return;
                    }
                } else if (value.equals("light")) {
                    view.setColorScheme$react_native_screens_release(com.swmansion.rnscreens.gamma.common.colorscheme.a.f41809b);
                    return;
                }
            } else if (value.equals("dark")) {
                view.setColorScheme$react_native_screens_release(com.swmansion.rnscreens.gamma.common.colorscheme.a.f41810c);
                return;
            }
        }
        throw new JSApplicationIllegalArgumentException("[RNScreens] Invalid color scheme: " + value + ".");
    }

    @Override // com.facebook.react.viewmanagers.RNSTabsHostAndroidManagerInterface
    public void setNativeContainerBackgroundColor(@NotNull d view, @Nullable Integer value) {
        Intrinsics.checkNotNullParameter(view, "view");
        view.setNativeContainerBackgroundColor(value);
    }

    @Override // com.facebook.react.viewmanagers.RNSTabsHostAndroidManagerInterface
    public void setNavStateRequest(@NotNull d view, @Nullable ReadableMap value) {
        Intrinsics.checkNotNullParameter(view, "view");
        if (value == null) {
            throw new IllegalArgumentException("[RNScreens] navStateRequest must not be nullish");
        }
        String string = value.getString("selectedScreenKey");
        if (string == null) {
            throw new IllegalArgumentException("Required value was null.");
        }
        view.s(new r(string, value.getInt("baseProvenance"), com.swmansion.rnscreens.gamma.tabs.container.b.f41864b));
    }

    @Override // com.facebook.react.viewmanagers.RNSTabsHostAndroidManagerInterface
    public void setRejectStaleNavStateUpdates(@NotNull d view, boolean value) {
        Intrinsics.checkNotNullParameter(view, "view");
        view.setRejectStaleNavigationStateUpdates$react_native_screens_release(value);
    }

    @Override // com.facebook.react.viewmanagers.RNSTabsHostAndroidManagerInterface
    public void setTabBarHidden(@NotNull d view, boolean value) {
        Intrinsics.checkNotNullParameter(view, "view");
        view.setTabBarHidden(value);
    }

    @Override // com.facebook.react.viewmanagers.RNSTabsHostAndroidManagerInterface
    public void setTabBarRespectsIMEInsets(@NotNull d view, boolean value) {
        Intrinsics.checkNotNullParameter(view, "view");
        view.setTabBarRespectsIMEInsets(value);
    }

    @Override // com.facebook.react.uimanager.ViewGroupManager
    public void addView(@NotNull d parent, @NotNull View child, int index) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        Intrinsics.checkNotNullParameter(child, "child");
        if (child instanceof com.swmansion.rnscreens.gamma.tabs.screen.a) {
            parent.j((com.swmansion.rnscreens.gamma.tabs.screen.a) child, index);
            return;
        }
        throw new IllegalArgumentException("[RNScreens] Attempt to attach child that is not of type javaClass");
    }

    @Override // com.facebook.react.uimanager.ViewGroupManager
    public void removeViewAt(@NotNull d parent, int index) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        parent.r(index);
    }
}
