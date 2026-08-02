package com.unity3d.ads.adplayer;

import com.bytedance.sdk.component.pglcrypt.PglCryptUtils;
import com.unity3d.ads.adplayer.model.WebViewEvent;
import defpackage.rq3;
import defpackage.xdh;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0011\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\bf\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0005\u0010\u0006J'\u0010\n\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\u0002H&¢\u0006\u0004\b\n\u0010\u000bJ\u0018\u0010\u000e\u001a\u00020\u00042\u0006\u0010\r\u001a\u00020\fH¦@¢\u0006\u0004\b\u000e\u0010\u000fJ:\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00010\u00122\u0006\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u00022\u0012\u0010\u0013\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00010\u0012\"\u00020\u0001H¦@¢\u0006\u0004\b\u0014\u0010\u0015R\u001a\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00170\u00168&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0018\u0010\u0019R.\u0010\"\u001a\u0014\u0012\u0004\u0012\u00020\u0002\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001d0\u001c0\u001b8&@&X¦\u000e¢\u0006\f\u001a\u0004\b\u001e\u0010\u001f\"\u0004\b \u0010!¨\u0006#"}, d2 = {"Lcom/unity3d/ads/adplayer/WebViewBridge;", "", "", PglCryptUtils.KEY_MESSAGE, "", "handleInvocation", "(Ljava/lang/String;)V", "callbackId", "callbackStatus", "rawParameters", "handleCallback", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "Lcom/unity3d/ads/adplayer/model/WebViewEvent;", "event", "sendEvent", "(Lcom/unity3d/ads/adplayer/model/WebViewEvent;Lrq3;)Ljava/lang/Object;", "className", "method", "", "params", "request", "(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;Lrq3;)Ljava/lang/Object;", "Lxdh;", "Lcom/unity3d/ads/adplayer/Invocation;", "getOnInvocation", "()Lxdh;", "onInvocation", "", "Lkotlin/Function0;", "Lcom/unity3d/ads/adplayer/ExposedFunction;", "getExposedFunctions", "()Ljava/util/Map;", "setExposedFunctions", "(Ljava/util/Map;)V", "exposedFunctions", "unity-ads_defaultRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
public interface WebViewBridge {
    @NotNull
    Map<String, Function0<ExposedFunction>> getExposedFunctions();

    @NotNull
    xdh getOnInvocation();

    void handleCallback(@NotNull String callbackId, @NotNull String callbackStatus, @NotNull String rawParameters);

    void handleInvocation(@NotNull String message);

    @Nullable
    Object request(@NotNull String str, @NotNull String str2, @NotNull Object[] objArr, @NotNull rq3<? super Object[]> rq3Var);

    @Nullable
    Object sendEvent(@NotNull WebViewEvent webViewEvent, @NotNull rq3<? super Unit> rq3Var);

    void setExposedFunctions(@NotNull Map<String, ? extends Function0<? extends ExposedFunction>> map);
}
