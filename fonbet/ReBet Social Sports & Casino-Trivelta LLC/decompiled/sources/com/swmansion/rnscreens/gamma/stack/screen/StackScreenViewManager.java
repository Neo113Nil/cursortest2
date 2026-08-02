package com.swmansion.rnscreens.gamma.stack.screen;

import Vc.e;
import Vc.f;
import Vc.g;
import android.view.View;
import com.facebook.react.bridge.JSApplicationCausedNativeException;
import com.facebook.react.bridge.JSApplicationIllegalArgumentException;
import com.facebook.react.module.annotations.ReactModule;
import com.facebook.react.uimanager.ReactStylesDiffMap;
import com.facebook.react.uimanager.StateWrapper;
import com.facebook.react.uimanager.ThemedReactContext;
import com.facebook.react.uimanager.ViewGroupManager;
import com.facebook.react.uimanager.ViewManagerDelegate;
import com.facebook.react.viewmanagers.RNSStackScreenManagerDelegate;
import com.facebook.react.viewmanagers.RNSStackScreenManagerInterface;
import com.swmansion.rnscreens.gamma.stack.screen.b;
import com.twilio.voice.EventKeys;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\r\n\u0002\u0010$\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0007\u0018\u0000 62\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00020\u0003:\u00017B\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u0015\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\tH\u0014¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\u000e\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\fH\u0014¢\u0006\u0004\b\u000e\u0010\u000fJ'\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u0013H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u001f\u0010\u0019\u001a\u00020\u00152\u0006\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ\u001f\u0010\u001b\u001a\u00020\u00152\u0006\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0014\u001a\u00020\u0013H\u0016¢\u0006\u0004\b\u001b\u0010\u001cJ\u0017\u0010\u001d\u001a\u00020\u00132\u0006\u0010\u0010\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u001d\u0010\u001eJ!\u0010\u001f\u001a\u0004\u0018\u00010\u00112\u0006\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0014\u001a\u00020\u0013H\u0016¢\u0006\u0004\b\u001f\u0010 J\u001f\u0010!\u001a\u00020\u00152\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u0018\u001a\u00020\u0002H\u0014¢\u0006\u0004\b!\u0010\"J\u001b\u0010%\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020$0#H\u0016¢\u0006\u0004\b%\u0010&J-\u0010+\u001a\u0004\u0018\u00010$2\u0006\u0010\u0018\u001a\u00020\u00022\b\u0010(\u001a\u0004\u0018\u00010'2\b\u0010*\u001a\u0004\u0018\u00010)H\u0016¢\u0006\u0004\b+\u0010,J!\u0010.\u001a\u00020\u00152\u0006\u0010\u0018\u001a\u00020\u00022\b\u0010-\u001a\u0004\u0018\u00010\u0006H\u0016¢\u0006\u0004\b.\u0010/J!\u00100\u001a\u00020\u00152\u0006\u0010\u0018\u001a\u00020\u00022\b\u0010-\u001a\u0004\u0018\u00010\u0006H\u0016¢\u0006\u0004\b0\u0010/J\u001f\u00102\u001a\u00020\u00152\u0006\u0010\u0018\u001a\u00020\u00022\u0006\u0010-\u001a\u000201H\u0016¢\u0006\u0004\b2\u00103R\u001a\u00104\u001a\b\u0012\u0004\u0012\u00020\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b4\u00105¨\u00068"}, d2 = {"Lcom/swmansion/rnscreens/gamma/stack/screen/StackScreenViewManager;", "Lcom/facebook/react/uimanager/ViewGroupManager;", "Lcom/swmansion/rnscreens/gamma/stack/screen/b;", "Lcom/facebook/react/viewmanagers/RNSStackScreenManagerInterface;", "<init>", "()V", "", "getName", "()Ljava/lang/String;", "Lcom/facebook/react/uimanager/ViewManagerDelegate;", "getDelegate", "()Lcom/facebook/react/uimanager/ViewManagerDelegate;", "Lcom/facebook/react/uimanager/ThemedReactContext;", "reactContext", "createViewInstance", "(Lcom/facebook/react/uimanager/ThemedReactContext;)Lcom/swmansion/rnscreens/gamma/stack/screen/b;", "parent", "Landroid/view/View;", "child", "", "index", "", "addView", "(Lcom/swmansion/rnscreens/gamma/stack/screen/b;Landroid/view/View;I)V", "view", "removeView", "(Lcom/swmansion/rnscreens/gamma/stack/screen/b;Landroid/view/View;)V", "removeViewAt", "(Lcom/swmansion/rnscreens/gamma/stack/screen/b;I)V", "getChildCount", "(Lcom/swmansion/rnscreens/gamma/stack/screen/b;)I", "getChildAt", "(Lcom/swmansion/rnscreens/gamma/stack/screen/b;I)Landroid/view/View;", "addEventEmitters", "(Lcom/facebook/react/uimanager/ThemedReactContext;Lcom/swmansion/rnscreens/gamma/stack/screen/b;)V", "", "", "getExportedCustomDirectEventTypeConstants", "()Ljava/util/Map;", "Lcom/facebook/react/uimanager/ReactStylesDiffMap;", "props", "Lcom/facebook/react/uimanager/StateWrapper;", "stateWrapper", "updateState", "(Lcom/swmansion/rnscreens/gamma/stack/screen/b;Lcom/facebook/react/uimanager/ReactStylesDiffMap;Lcom/facebook/react/uimanager/StateWrapper;)Ljava/lang/Object;", EventKeys.VALUE_KEY, "setActivityMode", "(Lcom/swmansion/rnscreens/gamma/stack/screen/b;Ljava/lang/String;)V", "setScreenKey", "", "setPreventNativeDismiss", "(Lcom/swmansion/rnscreens/gamma/stack/screen/b;Z)V", "delegate", "Lcom/facebook/react/uimanager/ViewManagerDelegate;", "Companion", "a", "react-native-screens_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@ReactModule(name = StackScreenViewManager.REACT_CLASS)
@SourceDebugExtension({"SMAP\nStackScreenViewManager.kt\nKotlin\n*S Kotlin\n*F\n+ 1 StackScreenViewManager.kt\ncom/swmansion/rnscreens/gamma/stack/screen/StackScreenViewManager\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,152:1\n1#2:153\n*E\n"})
/* loaded from: classes4.dex */
public final class StackScreenViewManager extends ViewGroupManager<b> implements RNSStackScreenManagerInterface<b> {

    @NotNull
    public static final String REACT_CLASS = "RNSStackScreen";

    @NotNull
    private final ViewManagerDelegate<b> delegate;

    public StackScreenViewManager() {
        super(null, 1, null);
        this.delegate = new RNSStackScreenManagerDelegate(this);
    }

    @Override // com.facebook.react.uimanager.ViewManager
    @NotNull
    public ViewManagerDelegate<b> getDelegate() {
        return this.delegate;
    }

    @Override // com.facebook.react.uimanager.BaseViewManager, com.facebook.react.uimanager.ViewManager
    @NotNull
    public Map<String, Object> getExportedCustomDirectEventTypeConstants() {
        return MapsKt.mutableMapOf(Qc.a.a(f.f12867c), Qc.a.a(g.f12868c), Qc.a.a(Vc.a.f12860c), Qc.a.a(Vc.b.f12861c), Qc.a.a(Vc.c.f12862d), Qc.a.a(e.f12866c));
    }

    @Override // com.facebook.react.uimanager.ViewManager, com.facebook.react.bridge.NativeModule
    @NotNull
    public String getName() {
        return REACT_CLASS;
    }

    @Override // com.facebook.react.uimanager.BaseViewManager, com.facebook.react.uimanager.ViewManager
    public void addEventEmitters(@NotNull ThemedReactContext reactContext, @NotNull b view) {
        Intrinsics.checkNotNullParameter(reactContext, "reactContext");
        Intrinsics.checkNotNullParameter(view, "view");
        super.addEventEmitters(reactContext, (ThemedReactContext) view);
        view.h();
    }

    @Override // com.facebook.react.uimanager.ViewManager
    @NotNull
    public b createViewInstance(@NotNull ThemedReactContext reactContext) {
        Intrinsics.checkNotNullParameter(reactContext, "reactContext");
        return new b(reactContext);
    }

    @Override // com.facebook.react.uimanager.ViewGroupManager
    public void removeView(@NotNull b parent, @NotNull View view) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        Intrinsics.checkNotNullParameter(view, "view");
        if (view instanceof Tc.d) {
            parent.c((Tc.d) view);
        } else {
            super.removeView((StackScreenViewManager) parent, view);
        }
    }

    @Override // com.facebook.react.viewmanagers.RNSStackScreenManagerInterface
    public void setActivityMode(@NotNull b view, @Nullable String value) {
        Intrinsics.checkNotNullParameter(view, "view");
        if (Intrinsics.areEqual(value, "attached")) {
            view.setActivityMode(b.a.f41853b);
            return;
        }
        if (Intrinsics.areEqual(value, "detached")) {
            view.setActivityMode(b.a.f41852a);
            return;
        }
        throw new JSApplicationIllegalArgumentException("[RNScreens] Invalid activity mode: " + value + ".");
    }

    @Override // com.facebook.react.viewmanagers.RNSStackScreenManagerInterface
    public void setPreventNativeDismiss(@NotNull b view, boolean value) {
        Intrinsics.checkNotNullParameter(view, "view");
        view.setPreventNativeDismissEnabled$react_native_screens_release(value);
    }

    @Override // com.facebook.react.viewmanagers.RNSStackScreenManagerInterface
    public void setScreenKey(@NotNull b view, @Nullable String value) {
        Intrinsics.checkNotNullParameter(view, "view");
        if (value == null) {
            throw new IllegalArgumentException("[RNScreens] screenKey must not be null.");
        }
        view.setScreenKey(value);
    }

    @Override // com.facebook.react.uimanager.ViewManager
    @Nullable
    public Object updateState(@NotNull b view, @Nullable ReactStylesDiffMap props, @Nullable StateWrapper stateWrapper) {
        Intrinsics.checkNotNullParameter(view, "view");
        view.setStateWrapper$react_native_screens_release(stateWrapper);
        return super.updateState((StackScreenViewManager) view, props, stateWrapper);
    }

    @Override // com.facebook.react.uimanager.ViewGroupManager
    public void addView(@NotNull b parent, @NotNull View child, int index) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        Intrinsics.checkNotNullParameter(child, "child");
        if (child instanceof Tc.d) {
            if (index >= parent.getChildCount()) {
                parent.a((Tc.d) child);
                return;
            }
            throw new JSApplicationCausedNativeException("[RNScreens] StackHeaderConfig must be the last child of StackScreen. ");
        }
        if (index <= parent.getChildCount()) {
            super.addView((StackScreenViewManager) parent, child, index);
            return;
        }
        throw new JSApplicationCausedNativeException("[RNScreens] StackHeaderConfig must be the last child of StackScreen. ");
    }

    @Override // com.facebook.react.uimanager.ViewGroupManager
    @Nullable
    public View getChildAt(@NotNull b parent, int index) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        if (index == parent.getChildCount() && parent.getHeaderConfig$react_native_screens_release() != null) {
            return parent.getHeaderConfig$react_native_screens_release();
        }
        return parent.getChildAt(index);
    }

    @Override // com.facebook.react.uimanager.ViewGroupManager
    public int getChildCount(@NotNull b parent) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        return parent.getChildCount() + (parent.getHeaderConfig$react_native_screens_release() != null ? 1 : 0);
    }

    @Override // com.facebook.react.uimanager.ViewGroupManager
    public void removeViewAt(@NotNull b parent, int index) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        if (index == getChildCount(parent) - 1 && parent.getHeaderConfig$react_native_screens_release() != null) {
            Tc.d headerConfig$react_native_screens_release = parent.getHeaderConfig$react_native_screens_release();
            if (headerConfig$react_native_screens_release != null) {
                parent.c(headerConfig$react_native_screens_release);
                return;
            }
            return;
        }
        super.removeViewAt((StackScreenViewManager) parent, index);
    }
}
