package com.ironsource;

import android.content.Context;
import com.ironsource.sdk.IronSourceNetwork;
import com.ironsource.sdk.utils.SDKUtils;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: com.ironsource.pc, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C2600pc implements InterfaceC2582oc {
    @Override // com.ironsource.InterfaceC2582oc
    public void a(Lc onNetworkSDKInitListener) {
        Intrinsics.checkNotNullParameter(onNetworkSDKInitListener, "onNetworkSDKInitListener");
        IronSourceNetwork.addInitListener(onNetworkSDKInitListener);
    }

    @Override // com.ironsource.InterfaceC2582oc
    public void b(String controllerUrl) {
        Intrinsics.checkNotNullParameter(controllerUrl, "controllerUrl");
        SDKUtils.setControllerUrl(controllerUrl);
    }

    @Override // com.ironsource.InterfaceC2582oc
    public void a(Context applicationContext, String applicationKey, String userId, Map<String, String> initParams) {
        Intrinsics.checkNotNullParameter(applicationContext, "applicationContext");
        Intrinsics.checkNotNullParameter(applicationKey, "applicationKey");
        Intrinsics.checkNotNullParameter(userId, "userId");
        Intrinsics.checkNotNullParameter(initParams, "initParams");
        IronSourceNetwork.initSDK(applicationContext, applicationKey, userId, initParams);
    }

    @Override // com.ironsource.InterfaceC2582oc
    public void a(String controllerConfig) {
        Intrinsics.checkNotNullParameter(controllerConfig, "controllerConfig");
        SDKUtils.setControllerConfig(controllerConfig);
    }

    @Override // com.ironsource.InterfaceC2582oc
    public void a(int i) {
        SDKUtils.setDebugMode(i);
    }
}
