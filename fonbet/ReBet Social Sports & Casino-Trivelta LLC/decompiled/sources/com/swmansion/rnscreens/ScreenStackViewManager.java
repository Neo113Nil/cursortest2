package com.swmansion.rnscreens;

import android.view.View;
import com.facebook.react.module.annotations.ReactModule;
import com.facebook.react.uimanager.ThemedReactContext;
import com.facebook.react.uimanager.ViewGroupManager;
import com.facebook.react.uimanager.ViewManagerDelegate;
import com.facebook.react.viewmanagers.RNSScreenStackManagerDelegate;
import com.facebook.react.viewmanagers.RNSScreenStackManagerInterface;
import com.twilio.voice.EventKeys;
import java.util.Map;
import kotlin.Metadata;
import kotlin.TuplesKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010%\n\u0002\u0010\u0000\n\u0002\b\u000e\b\u0007\u0018\u0000 32\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00020\u0003:\u00014B\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\u0019\u0010\t\u001a\u00020\b2\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0002¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u000f\u001a\u00020\u000eH\u0014¢\u0006\u0004\b\u0010\u0010\u0011J'\u0010\u0017\u001a\u00020\b2\u0006\u0010\u0012\u001a\u00020\u00022\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0016\u001a\u00020\u0015H\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\u001f\u0010\u0019\u001a\u00020\b2\u0006\u0010\u0012\u001a\u00020\u00022\u0006\u0010\u0016\u001a\u00020\u0015H\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ\u000f\u0010\u001b\u001a\u00020\bH\u0016¢\u0006\u0004\b\u001b\u0010\u0005J\u0017\u0010\u001c\u001a\u00020\u00152\u0006\u0010\u0012\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u001c\u0010\u001dJ\u001f\u0010\u001e\u001a\u00020\u00132\u0006\u0010\u0012\u001a\u00020\u00022\u0006\u0010\u0016\u001a\u00020\u0015H\u0016¢\u0006\u0004\b\u001e\u0010\u001fJ\u000f\u0010!\u001a\u00020 H\u0016¢\u0006\u0004\b!\u0010\"J\u0015\u0010$\u001a\b\u0012\u0004\u0012\u00020\u00020#H\u0014¢\u0006\u0004\b$\u0010%J\u001b\u0010(\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020'0&H\u0016¢\u0006\u0004\b(\u0010)J!\u0010,\u001a\u00020\b2\b\u0010*\u001a\u0004\u0018\u00010\u00022\u0006\u0010+\u001a\u00020 H\u0016¢\u0006\u0004\b,\u0010-J!\u0010.\u001a\u00020\b2\b\u0010*\u001a\u0004\u0018\u00010\u00022\u0006\u0010+\u001a\u00020 H\u0016¢\u0006\u0004\b.\u0010-J!\u0010/\u001a\u00020\b2\u0006\u0010*\u001a\u00020\u00022\b\u0010+\u001a\u0004\u0018\u00010\u0015H\u0016¢\u0006\u0004\b/\u00100R\u001a\u00101\u001a\b\u0012\u0004\u0012\u00020\u00020#8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b1\u00102¨\u00065"}, d2 = {"Lcom/swmansion/rnscreens/ScreenStackViewManager;", "Lcom/facebook/react/uimanager/ViewGroupManager;", "Lcom/swmansion/rnscreens/T;", "Lcom/facebook/react/viewmanagers/RNSScreenStackManagerInterface;", "<init>", "()V", "Lcom/swmansion/rnscreens/z;", "screen", "", "prepareOutTransition", "(Lcom/swmansion/rnscreens/z;)V", "", "getName", "()Ljava/lang/String;", "Lcom/facebook/react/uimanager/ThemedReactContext;", "reactContext", "createViewInstance", "(Lcom/facebook/react/uimanager/ThemedReactContext;)Lcom/swmansion/rnscreens/T;", "parent", "Landroid/view/View;", "child", "", "index", "addView", "(Lcom/swmansion/rnscreens/T;Landroid/view/View;I)V", "removeViewAt", "(Lcom/swmansion/rnscreens/T;I)V", "invalidate", "getChildCount", "(Lcom/swmansion/rnscreens/T;)I", "getChildAt", "(Lcom/swmansion/rnscreens/T;I)Landroid/view/View;", "", "needsCustomLayoutForChildren", "()Z", "Lcom/facebook/react/uimanager/ViewManagerDelegate;", "getDelegate", "()Lcom/facebook/react/uimanager/ViewManagerDelegate;", "", "", "getExportedCustomDirectEventTypeConstants", "()Ljava/util/Map;", "view", EventKeys.VALUE_KEY, "setIosPreventReattachmentOfDismissedScreens", "(Lcom/swmansion/rnscreens/T;Z)V", "setIosPreventReattachmentOfDismissedModals", "setNativeContainerBackgroundColor", "(Lcom/swmansion/rnscreens/T;Ljava/lang/Integer;)V", "delegate", "Lcom/facebook/react/uimanager/ViewManagerDelegate;", "Companion", "a", "react-native-screens_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@ReactModule(name = ScreenStackViewManager.REACT_CLASS)
@SourceDebugExtension({"SMAP\nScreenStackViewManager.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ScreenStackViewManager.kt\ncom/swmansion/rnscreens/ScreenStackViewManager\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,97:1\n1#2:98\n*E\n"})
/* loaded from: classes4.dex */
public final class ScreenStackViewManager extends ViewGroupManager<T> implements RNSScreenStackManagerInterface<T> {

    @NotNull
    public static final String REACT_CLASS = "RNSScreenStack";

    @NotNull
    private final ViewManagerDelegate<T> delegate;

    public ScreenStackViewManager() {
        super(null, 1, null);
        this.delegate = new RNSScreenStackManagerDelegate(this);
    }

    private final void prepareOutTransition(C3834z screen) {
        if (screen != null) {
            screen.D();
        }
    }

    @Override // com.facebook.react.uimanager.ViewManager
    @NotNull
    public ViewManagerDelegate<T> getDelegate() {
        return this.delegate;
    }

    @Override // com.facebook.react.uimanager.BaseViewManager, com.facebook.react.uimanager.ViewManager
    @NotNull
    public Map<String, Object> getExportedCustomDirectEventTypeConstants() {
        return MapsKt.mutableMapOf(TuplesKt.to("topFinishTransitioning", MapsKt.mutableMapOf(TuplesKt.to("registrationName", "onFinishTransitioning"))));
    }

    @Override // com.facebook.react.uimanager.ViewManager, com.facebook.react.bridge.NativeModule
    @NotNull
    public String getName() {
        return REACT_CLASS;
    }

    @Override // com.facebook.react.bridge.BaseJavaModule, com.facebook.react.bridge.NativeModule
    public void invalidate() {
        super.invalidate();
        NativeProxy.INSTANCE.b();
    }

    @Override // com.facebook.react.uimanager.ViewGroupManager, com.facebook.react.uimanager.IViewManagerWithChildren
    public boolean needsCustomLayoutForChildren() {
        return true;
    }

    @Override // com.facebook.react.viewmanagers.RNSScreenStackManagerInterface
    public void setIosPreventReattachmentOfDismissedModals(@Nullable T view, boolean value) {
    }

    @Override // com.facebook.react.viewmanagers.RNSScreenStackManagerInterface
    public void setIosPreventReattachmentOfDismissedScreens(@Nullable T view, boolean value) {
    }

    @Override // com.facebook.react.viewmanagers.RNSScreenStackManagerInterface
    public void setNativeContainerBackgroundColor(@NotNull T view, @Nullable Integer value) {
        Intrinsics.checkNotNullParameter(view, "view");
    }

    @Override // com.facebook.react.uimanager.ViewManager
    @NotNull
    public T createViewInstance(@NotNull ThemedReactContext reactContext) {
        Intrinsics.checkNotNullParameter(reactContext, "reactContext");
        return new T(reactContext);
    }

    @Override // com.facebook.react.uimanager.ViewGroupManager
    public void addView(@NotNull T parent, @NotNull View child, int index) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        Intrinsics.checkNotNullParameter(child, "child");
        if (child instanceof C3834z) {
            C3834z c3834z = (C3834z) child;
            NativeProxy.INSTANCE.a(c3834z.getId(), c3834z);
            parent.d(c3834z, index);
            return;
        }
        throw new IllegalArgumentException("Attempt attach child that is not of type Screen");
    }

    @Override // com.facebook.react.uimanager.ViewGroupManager
    @NotNull
    public View getChildAt(@NotNull T parent, int index) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        return parent.l(index);
    }

    @Override // com.facebook.react.uimanager.ViewGroupManager
    public int getChildCount(@NotNull T parent) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        return parent.getScreenCount();
    }

    @Override // com.facebook.react.uimanager.ViewGroupManager
    public void removeViewAt(@NotNull T parent, int index) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        C3834z l10 = parent.l(index);
        prepareOutTransition(l10);
        parent.z(index);
        NativeProxy.INSTANCE.c(l10.getId());
    }
}
