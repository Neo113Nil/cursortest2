package com.unity3d.ads.adplayer;

import defpackage.ddi;
import defpackage.rq3;
import kotlin.Metadata;
import kotlin.Unit;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONArray;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001J\u0018\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H¦@¢\u0006\u0004\b\u0005\u0010\u0006J \u0010\u000b\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\tH¦@¢\u0006\u0004\b\u000b\u0010\fJ \u0010\u0010\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\u0002H¦@¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0004H¦@¢\u0006\u0004\b\u0012\u0010\u0013R\u001c\u0010\u0018\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00150\u00148&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0019"}, d2 = {"Lcom/unity3d/ads/adplayer/WebViewContainer;", "", "", "url", "", "loadUrl", "(Ljava/lang/String;Lrq3;)Ljava/lang/Object;", "Lcom/unity3d/ads/adplayer/HandlerType;", "handlerType", "Lorg/json/JSONArray;", "arguments", "evaluateJavascript", "(Lcom/unity3d/ads/adplayer/HandlerType;Lorg/json/JSONArray;Lrq3;)Ljava/lang/Object;", "Lcom/unity3d/ads/adplayer/WebViewBridge;", "webViewBridgeInterface", "name", "addJavascriptInterface", "(Lcom/unity3d/ads/adplayer/WebViewBridge;Ljava/lang/String;Lrq3;)Ljava/lang/Object;", "destroy", "(Lrq3;)Ljava/lang/Object;", "Lddi;", "Landroid/view/InputEvent;", "getLastInputEvent", "()Lddi;", "lastInputEvent", "unity-ads_defaultRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
public interface WebViewContainer {
    @Nullable
    Object addJavascriptInterface(@NotNull WebViewBridge webViewBridge, @NotNull String str, @NotNull rq3<? super Unit> rq3Var);

    @Nullable
    Object destroy(@NotNull rq3<? super Unit> rq3Var);

    @Nullable
    Object evaluateJavascript(@NotNull HandlerType handlerType, @NotNull JSONArray jSONArray, @NotNull rq3<? super Unit> rq3Var);

    @NotNull
    ddi getLastInputEvent();

    @Nullable
    Object loadUrl(@NotNull String str, @NotNull rq3<? super Unit> rq3Var);
}
