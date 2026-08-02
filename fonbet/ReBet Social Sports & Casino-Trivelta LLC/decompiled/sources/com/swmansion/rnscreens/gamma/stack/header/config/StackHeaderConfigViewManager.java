package com.swmansion.rnscreens.gamma.stack.header.config;

import Tc.d;
import Tc.f;
import android.view.View;
import com.facebook.react.bridge.JSApplicationIllegalArgumentException;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.module.annotations.ReactModule;
import com.facebook.react.uimanager.ReactStylesDiffMap;
import com.facebook.react.uimanager.StateWrapper;
import com.facebook.react.uimanager.ThemedReactContext;
import com.facebook.react.uimanager.ViewGroupManager;
import com.facebook.react.uimanager.ViewManagerDelegate;
import com.facebook.react.viewmanagers.RNSStackHeaderConfigAndroidManagerDelegate;
import com.facebook.react.viewmanagers.RNSStackHeaderConfigAndroidManagerInterface;
import com.swmansion.rnscreens.gamma.stack.header.subview.b;
import com.twilio.voice.EventKeys;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@ReactModule(name = StackHeaderConfigViewManager.REACT_CLASS)
@Metadata(d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\f\b\u0017\u0018\u0000 C2\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00020\u0003:\u0001DB\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\u000b\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\tH\u0014¢\u0006\u0004\b\u000b\u0010\fJ\u0015\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00020\rH\u0014¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0011\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0011\u0010\u0012J'\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u0013\u001a\u00020\u00022\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0017\u001a\u00020\u0016H\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ\u001f\u0010\u001c\u001a\u00020\u00182\u0006\u0010\u0013\u001a\u00020\u00022\u0006\u0010\u001b\u001a\u00020\u0014H\u0016¢\u0006\u0004\b\u001c\u0010\u001dJ\u001f\u0010\u001e\u001a\u00020\u00182\u0006\u0010\u0013\u001a\u00020\u00022\u0006\u0010\u0017\u001a\u00020\u0016H\u0016¢\u0006\u0004\b\u001e\u0010\u001fJ\u0017\u0010 \u001a\u00020\u00182\u0006\u0010\u0013\u001a\u00020\u0002H\u0016¢\u0006\u0004\b \u0010!J\u0017\u0010\"\u001a\u00020\u00162\u0006\u0010\u0013\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\"\u0010#J!\u0010$\u001a\u0004\u0018\u00010\u00142\u0006\u0010\u0013\u001a\u00020\u00022\u0006\u0010\u0017\u001a\u00020\u0016H\u0016¢\u0006\u0004\b$\u0010%J-\u0010+\u001a\u0004\u0018\u00010*2\u0006\u0010\u001b\u001a\u00020\u00022\b\u0010'\u001a\u0004\u0018\u00010&2\b\u0010)\u001a\u0004\u0018\u00010(H\u0016¢\u0006\u0004\b+\u0010,J\u0017\u0010-\u001a\u00020\u00182\u0006\u0010\u001b\u001a\u00020\u0002H\u0014¢\u0006\u0004\b-\u0010!J!\u0010/\u001a\u00020\u00182\u0006\u0010\u001b\u001a\u00020\u00022\b\u0010.\u001a\u0004\u0018\u00010\u0006H\u0016¢\u0006\u0004\b/\u00100J!\u00101\u001a\u00020\u00182\u0006\u0010\u001b\u001a\u00020\u00022\b\u0010.\u001a\u0004\u0018\u00010\u0006H\u0016¢\u0006\u0004\b1\u00100J\u001f\u00102\u001a\u00020\u00182\u0006\u0010\u001b\u001a\u00020\u00022\u0006\u0010.\u001a\u00020\u0010H\u0016¢\u0006\u0004\b2\u00103J\u001f\u00104\u001a\u00020\u00182\u0006\u0010\u001b\u001a\u00020\u00022\u0006\u0010.\u001a\u00020\u0010H\u0016¢\u0006\u0004\b4\u00103J\u001f\u00105\u001a\u00020\u00182\u0006\u0010\u001b\u001a\u00020\u00022\u0006\u0010.\u001a\u00020\u0010H\u0016¢\u0006\u0004\b5\u00103J!\u00106\u001a\u00020\u00182\u0006\u0010\u001b\u001a\u00020\u00022\b\u0010.\u001a\u0004\u0018\u00010\u0016H\u0016¢\u0006\u0004\b6\u00107J!\u00108\u001a\u00020\u00182\u0006\u0010\u001b\u001a\u00020\u00022\b\u0010.\u001a\u0004\u0018\u00010\u0006H\u0016¢\u0006\u0004\b8\u00100J!\u0010:\u001a\u00020\u00182\u0006\u0010\u001b\u001a\u00020\u00022\b\u0010.\u001a\u0004\u0018\u000109H\u0016¢\u0006\u0004\b:\u0010;J\u001f\u0010<\u001a\u00020\u00182\u0006\u0010\u001b\u001a\u00020\u00022\u0006\u0010.\u001a\u00020\u0010H\u0016¢\u0006\u0004\b<\u00103J\u001f\u0010=\u001a\u00020\u00182\u0006\u0010\u001b\u001a\u00020\u00022\u0006\u0010.\u001a\u00020\u0010H\u0016¢\u0006\u0004\b=\u00103J\u001f\u0010>\u001a\u00020\u00182\u0006\u0010\u001b\u001a\u00020\u00022\u0006\u0010.\u001a\u00020\u0010H\u0016¢\u0006\u0004\b>\u00103J\u001f\u0010?\u001a\u00020\u00182\u0006\u0010\u001b\u001a\u00020\u00022\u0006\u0010.\u001a\u00020\u0010H\u0016¢\u0006\u0004\b?\u00103J\u001f\u0010@\u001a\u00020\u00182\u0006\u0010\u001b\u001a\u00020\u00022\u0006\u0010.\u001a\u00020\u0010H\u0016¢\u0006\u0004\b@\u00103R\u001a\u0010A\u001a\b\u0012\u0004\u0012\u00020\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bA\u0010B¨\u0006E"}, d2 = {"Lcom/swmansion/rnscreens/gamma/stack/header/config/StackHeaderConfigViewManager;", "Lcom/facebook/react/uimanager/ViewGroupManager;", "LTc/d;", "Lcom/facebook/react/viewmanagers/RNSStackHeaderConfigAndroidManagerInterface;", "<init>", "()V", "", "getName", "()Ljava/lang/String;", "Lcom/facebook/react/uimanager/ThemedReactContext;", "reactContext", "createViewInstance", "(Lcom/facebook/react/uimanager/ThemedReactContext;)LTc/d;", "Lcom/facebook/react/uimanager/ViewManagerDelegate;", "getDelegate", "()Lcom/facebook/react/uimanager/ViewManagerDelegate;", "", "needsCustomLayoutForChildren", "()Z", "parent", "Landroid/view/View;", "child", "", "index", "", "addView", "(LTc/d;Landroid/view/View;I)V", "view", "removeView", "(LTc/d;Landroid/view/View;)V", "removeViewAt", "(LTc/d;I)V", "removeAllViews", "(LTc/d;)V", "getChildCount", "(LTc/d;)I", "getChildAt", "(LTc/d;I)Landroid/view/View;", "Lcom/facebook/react/uimanager/ReactStylesDiffMap;", "props", "Lcom/facebook/react/uimanager/StateWrapper;", "stateWrapper", "", "updateState", "(LTc/d;Lcom/facebook/react/uimanager/ReactStylesDiffMap;Lcom/facebook/react/uimanager/StateWrapper;)Ljava/lang/Object;", "onAfterUpdateTransaction", EventKeys.VALUE_KEY, "setType", "(LTc/d;Ljava/lang/String;)V", "setTitle", "setHidden", "(LTc/d;Z)V", "setTransparent", "setBackButtonHidden", "setBackButtonTintColor", "(LTc/d;Ljava/lang/Integer;)V", "setBackButtonDrawableIconResourceName", "Lcom/facebook/react/bridge/ReadableMap;", "setBackButtonImageIconResource", "(LTc/d;Lcom/facebook/react/bridge/ReadableMap;)V", "setScrollFlagScroll", "setScrollFlagEnterAlways", "setScrollFlagEnterAlwaysCollapsed", "setScrollFlagExitUntilCollapsed", "setScrollFlagSnap", "delegate", "Lcom/facebook/react/uimanager/ViewManagerDelegate;", "Companion", "a", "react-native-screens_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public class StackHeaderConfigViewManager extends ViewGroupManager<d> implements RNSStackHeaderConfigAndroidManagerInterface<d> {

    @NotNull
    public static final String REACT_CLASS = "RNSStackHeaderConfigAndroid";

    @NotNull
    private final ViewManagerDelegate<d> delegate;

    public StackHeaderConfigViewManager() {
        super(null, 1, null);
        this.delegate = new RNSStackHeaderConfigAndroidManagerDelegate(this);
    }

    @Override // com.facebook.react.uimanager.ViewManager
    @NotNull
    public ViewManagerDelegate<d> getDelegate() {
        return this.delegate;
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

    @Override // com.facebook.react.uimanager.ViewManager
    @NotNull
    public d createViewInstance(@NotNull ThemedReactContext reactContext) {
        Intrinsics.checkNotNullParameter(reactContext, "reactContext");
        return new d(reactContext);
    }

    @Override // com.facebook.react.uimanager.BaseViewManager, com.facebook.react.uimanager.ViewManager
    public void onAfterUpdateTransaction(@NotNull d view) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onAfterUpdateTransaction((StackHeaderConfigViewManager) view);
        view.w();
        view.r();
    }

    @Override // com.facebook.react.uimanager.IViewGroupManager
    public void removeAllViews(@NotNull d parent) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        parent.s();
    }

    @Override // com.facebook.react.uimanager.ViewGroupManager
    public void removeView(@NotNull d parent, @NotNull View view) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        Intrinsics.checkNotNullParameter(view, "view");
        if (view instanceof b) {
            parent.t((b) view);
            return;
        }
        throw new IllegalArgumentException(("[RNScreens] StackHeaderConfig can only have children of type StackHeaderSubview. Attempted to remove " + view + " instead.").toString());
    }

    @Override // com.facebook.react.viewmanagers.RNSStackHeaderConfigAndroidManagerInterface
    public void setBackButtonDrawableIconResourceName(@NotNull d view, @Nullable String value) {
        Intrinsics.checkNotNullParameter(view, "view");
        view.setBackButtonDrawableIconResourceName$react_native_screens_release(value);
    }

    @Override // com.facebook.react.viewmanagers.RNSStackHeaderConfigAndroidManagerInterface
    public void setBackButtonHidden(@NotNull d view, boolean value) {
        Intrinsics.checkNotNullParameter(view, "view");
        view.setBackButtonHidden$react_native_screens_release(value);
    }

    @Override // com.facebook.react.viewmanagers.RNSStackHeaderConfigAndroidManagerInterface
    public void setBackButtonImageIconResource(@NotNull d view, @Nullable ReadableMap value) {
        Intrinsics.checkNotNullParameter(view, "view");
        view.setBackButtonImageIconUri$react_native_screens_release(value != null ? value.getString("uri") : null);
    }

    @Override // com.facebook.react.viewmanagers.RNSStackHeaderConfigAndroidManagerInterface
    public void setBackButtonTintColor(@NotNull d view, @Nullable Integer value) {
        Intrinsics.checkNotNullParameter(view, "view");
        view.setBackButtonTintColor$react_native_screens_release(value);
    }

    @Override // com.facebook.react.viewmanagers.RNSStackHeaderConfigAndroidManagerInterface
    public void setHidden(@NotNull d view, boolean value) {
        Intrinsics.checkNotNullParameter(view, "view");
        view.setHidden$react_native_screens_release(value);
    }

    @Override // com.facebook.react.viewmanagers.RNSStackHeaderConfigAndroidManagerInterface
    public void setScrollFlagEnterAlways(@NotNull d view, boolean value) {
        Intrinsics.checkNotNullParameter(view, "view");
        view.setScrollFlagEnterAlways$react_native_screens_release(value);
    }

    @Override // com.facebook.react.viewmanagers.RNSStackHeaderConfigAndroidManagerInterface
    public void setScrollFlagEnterAlwaysCollapsed(@NotNull d view, boolean value) {
        Intrinsics.checkNotNullParameter(view, "view");
        view.setScrollFlagEnterAlwaysCollapsed$react_native_screens_release(value);
    }

    @Override // com.facebook.react.viewmanagers.RNSStackHeaderConfigAndroidManagerInterface
    public void setScrollFlagExitUntilCollapsed(@NotNull d view, boolean value) {
        Intrinsics.checkNotNullParameter(view, "view");
        view.setScrollFlagExitUntilCollapsed$react_native_screens_release(value);
    }

    @Override // com.facebook.react.viewmanagers.RNSStackHeaderConfigAndroidManagerInterface
    public void setScrollFlagScroll(@NotNull d view, boolean value) {
        Intrinsics.checkNotNullParameter(view, "view");
        view.setScrollFlagScroll$react_native_screens_release(value);
    }

    @Override // com.facebook.react.viewmanagers.RNSStackHeaderConfigAndroidManagerInterface
    public void setScrollFlagSnap(@NotNull d view, boolean value) {
        Intrinsics.checkNotNullParameter(view, "view");
        view.setScrollFlagSnap$react_native_screens_release(value);
    }

    @Override // com.facebook.react.viewmanagers.RNSStackHeaderConfigAndroidManagerInterface
    public void setTitle(@NotNull d view, @Nullable String value) {
        Intrinsics.checkNotNullParameter(view, "view");
        if (value == null) {
            value = "";
        }
        view.setTitle$react_native_screens_release(value);
    }

    @Override // com.facebook.react.viewmanagers.RNSStackHeaderConfigAndroidManagerInterface
    public void setTransparent(@NotNull d view, boolean value) {
        Intrinsics.checkNotNullParameter(view, "view");
        view.setTransparent$react_native_screens_release(value);
    }

    @Override // com.facebook.react.viewmanagers.RNSStackHeaderConfigAndroidManagerInterface
    public void setType(@NotNull d view, @Nullable String value) {
        f fVar;
        Intrinsics.checkNotNullParameter(view, "view");
        if (value != null) {
            int hashCode = value.hashCode();
            if (hashCode != -1078030475) {
                if (hashCode != 102742843) {
                    if (hashCode == 109548807 && value.equals("small")) {
                        fVar = f.f11449a;
                        view.setType$react_native_screens_release(fVar);
                        return;
                    }
                } else if (value.equals("large")) {
                    fVar = f.f11451c;
                    view.setType$react_native_screens_release(fVar);
                    return;
                }
            } else if (value.equals("medium")) {
                fVar = f.f11450b;
                view.setType$react_native_screens_release(fVar);
                return;
            }
        }
        throw new JSApplicationIllegalArgumentException("[RNScreens] Invalid StackHeaderConfig type: " + value + ".");
    }

    @Override // com.facebook.react.uimanager.ViewManager
    @Nullable
    public Object updateState(@NotNull d view, @Nullable ReactStylesDiffMap props, @Nullable StateWrapper stateWrapper) {
        Intrinsics.checkNotNullParameter(view, "view");
        view.setStateWrapper$react_native_screens_release(stateWrapper);
        return super.updateState((StackHeaderConfigViewManager) view, props, stateWrapper);
    }

    @Override // com.facebook.react.uimanager.ViewGroupManager
    public void addView(@NotNull d parent, @NotNull View child, int index) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        Intrinsics.checkNotNullParameter(child, "child");
        if (child instanceof b) {
            parent.p((b) child);
            return;
        }
        throw new IllegalArgumentException(("[RNScreens] StackHeaderConfig can only have children of type StackHeaderSubview. Received " + child + " instead.").toString());
    }

    @Override // com.facebook.react.uimanager.ViewGroupManager
    @Nullable
    public View getChildAt(@NotNull d parent, int index) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        return parent.q(index);
    }

    @Override // com.facebook.react.uimanager.ViewGroupManager
    public int getChildCount(@NotNull d parent) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        return parent.getConfigSubviewsCount$react_native_screens_release();
    }

    @Override // com.facebook.react.uimanager.ViewGroupManager
    public void removeViewAt(@NotNull d parent, int index) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        parent.u(index);
    }
}
