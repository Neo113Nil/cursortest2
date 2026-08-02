package com.plaid;

import com.facebook.react.module.annotations.ReactModule;
import com.facebook.react.uimanager.SimpleViewManager;
import com.facebook.react.uimanager.ThemedReactContext;
import com.facebook.react.uimanager.ViewManagerDelegate;
import com.facebook.react.uimanager.annotations.ReactProp;
import com.facebook.react.viewmanagers.PLKEmbeddedViewManagerDelegate;
import com.facebook.react.viewmanagers.PLKEmbeddedViewManagerInterface;
import com.twilio.voice.EventKeys;
import java.util.Map;
import kotlin.Metadata;
import kotlin.TuplesKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@ReactModule(name = PLKEmbeddedViewManager.REACT_CLASS)
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010$\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0007\u0018\u0000 \u00162\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00020\u0003:\u0001\u0016B\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\b\u0010\b\u001a\u00020\tH\u0016J\u0010\u0010\n\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\fH\u0016J\u001a\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00022\b\u0010\u0010\u001a\u0004\u0018\u00010\tH\u0017J\u001a\u0010\u0011\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00022\b\u0010\u0012\u001a\u0004\u0018\u00010\tH\u0016J\u0014\u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u00150\u0014H\u0016R\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0017"}, d2 = {"Lcom/plaid/PLKEmbeddedViewManager;", "Lcom/facebook/react/uimanager/SimpleViewManager;", "Lcom/plaid/PLKEmbeddedView;", "Lcom/facebook/react/viewmanagers/PLKEmbeddedViewManagerInterface;", "<init>", "()V", "delegate", "Lcom/facebook/react/uimanager/ViewManagerDelegate;", "getName", "", "createViewInstance", "context", "Lcom/facebook/react/uimanager/ThemedReactContext;", "setToken", "", "view", "token", "setIOSPresentationStyle", EventKeys.VALUE_KEY, "getExportedCustomBubblingEventTypeConstants", "", "", "Companion", "react-native-plaid-link-sdk_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class PLKEmbeddedViewManager extends SimpleViewManager<PLKEmbeddedView> implements PLKEmbeddedViewManagerInterface<PLKEmbeddedView> {

    @NotNull
    public static final String EVENT_NAME = "onEmbeddedEvent";

    @NotNull
    public static final String REACT_CLASS = "PLKEmbeddedView";

    @NotNull
    private final ViewManagerDelegate<PLKEmbeddedView> delegate = new PLKEmbeddedViewManagerDelegate(this);

    @Override // com.facebook.react.uimanager.BaseViewManager, com.facebook.react.uimanager.ViewManager
    @NotNull
    public Map<String, Object> getExportedCustomBubblingEventTypeConstants() {
        return MapsKt.mutableMapOf(TuplesKt.to(EVENT_NAME, MapsKt.mutableMapOf(TuplesKt.to("phasedRegistrationNames", MapsKt.mutableMapOf(TuplesKt.to("bubbled", EVENT_NAME))))));
    }

    @Override // com.facebook.react.uimanager.ViewManager, com.facebook.react.bridge.NativeModule
    @NotNull
    public String getName() {
        return REACT_CLASS;
    }

    @Override // com.facebook.react.viewmanagers.PLKEmbeddedViewManagerInterface
    public void setIOSPresentationStyle(@NotNull PLKEmbeddedView view, @Nullable String value) {
        Intrinsics.checkNotNullParameter(view, "view");
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.facebook.react.uimanager.ViewManager
    @NotNull
    public PLKEmbeddedView createViewInstance(@NotNull ThemedReactContext context) {
        Intrinsics.checkNotNullParameter(context, "context");
        return new PLKEmbeddedView(context, null, 2, 0 == true ? 1 : 0);
    }

    @Override // com.facebook.react.viewmanagers.PLKEmbeddedViewManagerInterface
    @ReactProp(name = "token")
    public void setToken(@NotNull PLKEmbeddedView view, @Nullable String token) {
        Intrinsics.checkNotNullParameter(view, "view");
        if (token == null) {
            token = "";
        }
        view.setToken(token);
    }
}
