package com.ironsource;

import android.webkit.JavascriptInterface;
import com.safedk.android.analytics.brandsafety.creatives.CreativeInfoManager;
import com.safedk.android.utils.Logger;

/* renamed from: com.ironsource.h8, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public class C2453h8 {
    private C2506k8 a;

    C2453h8(C2506k8 c2506k8) {
        this.a = c2506k8;
    }

    @JavascriptInterface
    public void receiveMessageFromExternal(String str) {
        Logger.d("IronSource|SafeDK: Execution> Lcom/ironsource/h8;->receiveMessageFromExternal(Ljava/lang/String;)V");
        CreativeInfoManager.onReceiveMessageFromExternal(com.safedk.android.utils.h.f, this, str);
        safedk_h8_receiveMessageFromExternal_efba2b3215cd6949549d33ed84c11330(str);
    }

    @JavascriptInterface
    public void safedk_h8_receiveMessageFromExternal_efba2b3215cd6949549d33ed84c11330(String p0) {
        this.a.handleMessageFromAd(p0);
    }
}
