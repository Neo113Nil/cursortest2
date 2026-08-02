package com.braze.reactbridge;

import com.facebook.appevents.internal.ViewHierarchyConstants;
import com.facebook.gamingservices.cloudgaming.internal.SDKConstants;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.module.annotations.ReactModule;
import com.facebook.react.uimanager.SimpleViewManager;
import com.facebook.react.uimanager.ThemedReactContext;
import com.facebook.react.uimanager.ViewManagerDelegate;
import com.facebook.react.uimanager.annotations.ReactProp;
import com.facebook.react.viewmanagers.BrazeBannerViewManagerDelegate;
import com.facebook.react.viewmanagers.BrazeBannerViewManagerInterface;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: BrazeBannerManager.kt */
@ReactModule(name = BrazeBannerManagerImpl.NAME)
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\u0010\u0000\n\u0000\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00020\u0003B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u000e\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\u000bH\u0014J\b\u0010\f\u001a\u00020\rH\u0016J\u0010\u0010\u000e\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u000fH\u0014J\u001a\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00022\b\u0010\u0013\u001a\u0004\u0018\u00010\rH\u0017J\u001a\u0010\u0014\u001a\u0014\u0012\u0006\u0012\u0004\u0018\u00010\r\u0012\u0006\u0012\u0004\u0018\u00010\u0016\u0018\u00010\u0015H\u0016R\u001a\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00000\tX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0017"}, d2 = {"Lcom/braze/reactbridge/BrazeBannerManager;", "Lcom/facebook/react/uimanager/SimpleViewManager;", "Lcom/braze/reactbridge/BannerContainer;", "Lcom/facebook/react/viewmanagers/BrazeBannerViewManagerInterface;", "context", "Lcom/facebook/react/bridge/ReactApplicationContext;", "<init>", "(Lcom/facebook/react/bridge/ReactApplicationContext;)V", "delegate", "Lcom/facebook/react/viewmanagers/BrazeBannerViewManagerDelegate;", "getDelegate", "Lcom/facebook/react/uimanager/ViewManagerDelegate;", "getName", "", "createViewInstance", "Lcom/facebook/react/uimanager/ThemedReactContext;", "setPlacementID", "", ViewHierarchyConstants.VIEW_KEY, SDKConstants.PARAM_PLACEMENT_ID, "getExportedCustomBubblingEventTypeConstants", "", "", "braze_react-native-sdk_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class BrazeBannerManager extends SimpleViewManager<BannerContainer> implements BrazeBannerViewManagerInterface<BannerContainer> {
    private final BrazeBannerViewManagerDelegate<BannerContainer, BrazeBannerManager> delegate;

    public BrazeBannerManager(ReactApplicationContext context) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.delegate = new BrazeBannerViewManagerDelegate<>(this);
    }

    @Override // com.facebook.react.uimanager.ViewManager
    protected ViewManagerDelegate<BannerContainer> getDelegate() {
        return this.delegate;
    }

    @Override // com.facebook.react.uimanager.ViewManager, com.facebook.react.bridge.NativeModule
    public String getName() {
        return BrazeBannerManagerImpl.NAME;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.facebook.react.uimanager.ViewManager
    public BannerContainer createViewInstance(ThemedReactContext context) {
        Intrinsics.checkNotNullParameter(context, "context");
        return BrazeBannerManagerImpl.INSTANCE.createViewInstance(context);
    }

    @Override // com.facebook.react.viewmanagers.BrazeBannerViewManagerInterface
    @ReactProp(name = SDKConstants.PARAM_PLACEMENT_ID)
    public void setPlacementID(BannerContainer view, String placementID) {
        Intrinsics.checkNotNullParameter(view, "view");
        BrazeBannerManagerImpl.INSTANCE.setPlacementID(view, placementID);
    }

    @Override // com.facebook.react.uimanager.BaseViewManager, com.facebook.react.uimanager.ViewManager
    public Map<String, Object> getExportedCustomBubblingEventTypeConstants() {
        return BrazeBannerManagerImpl.INSTANCE.getExportedCustomBubblingEventTypeConstants();
    }
}
