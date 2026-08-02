package com.unity3d.ads.adplayer;

import com.unity3d.ads.adplayer.model.WebViewEvent;
import java.util.Map;
import xsna.baj0;
import xsna.gzs;
import xsna.s3q0;
import xsna.spj;

/* compiled from: WebViewBridge.kt */
/* loaded from: classes14.dex */
public interface WebViewBridge {
    Map<String, gzs<ExposedFunction>> getExposedFunctions();

    baj0<Invocation> getOnInvocation();

    void handleCallback(String str, String str2, String str3);

    void handleInvocation(String str);

    Object request(String str, String str2, Object[] objArr, spj<? super Object[]> spjVar);

    Object sendEvent(WebViewEvent webViewEvent, spj<? super s3q0> spjVar);

    void setExposedFunctions(Map<String, ? extends gzs<? extends ExposedFunction>> map);
}
