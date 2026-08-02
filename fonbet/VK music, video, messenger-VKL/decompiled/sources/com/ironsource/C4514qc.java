package com.ironsource;

import android.content.Context;
import com.ironsource.sdk.IronSourceNetwork;
import com.ironsource.sdk.utils.SDKUtils;
import java.util.Map;

/* renamed from: com.ironsource.qc, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C4514qc implements InterfaceC4496pc {
    @Override // com.ironsource.InterfaceC4496pc
    public void a(Mc mc) {
        IronSourceNetwork.addInitListener(mc);
    }

    @Override // com.ironsource.InterfaceC4496pc
    public void b(String str) {
        SDKUtils.setControllerUrl(str);
    }

    @Override // com.ironsource.InterfaceC4496pc
    public void a(Context context, String str, String str2, Map<String, String> map) {
        IronSourceNetwork.initSDK(context, str, str2, map);
    }

    @Override // com.ironsource.InterfaceC4496pc
    public void a(String str) {
        SDKUtils.setControllerConfig(str);
    }

    @Override // com.ironsource.InterfaceC4496pc
    public void a(int i) {
        SDKUtils.setDebugMode(i);
    }
}
