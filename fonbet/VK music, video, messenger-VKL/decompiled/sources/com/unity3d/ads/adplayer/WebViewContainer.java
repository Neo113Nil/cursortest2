package com.unity3d.ads.adplayer;

import android.view.InputEvent;
import org.json.JSONArray;
import xsna.s3q0;
import xsna.spj;
import xsna.ttk0;

/* compiled from: WebViewContainer.kt */
/* loaded from: classes14.dex */
public interface WebViewContainer {
    Object addJavascriptInterface(WebViewBridge webViewBridge, String str, spj<? super s3q0> spjVar);

    Object destroy(spj<? super s3q0> spjVar);

    Object evaluateJavascript(HandlerType handlerType, JSONArray jSONArray, spj<? super s3q0> spjVar);

    ttk0<InputEvent> getLastInputEvent();

    Object loadUrl(String str, spj<? super s3q0> spjVar);
}
