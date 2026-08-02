package com.unity3d.ads.core.domain;

import com.unity3d.ads.adplayer.AndroidWebViewContainer;
import com.unity3d.ads.adplayer.CommonWebViewBridge;
import com.unity3d.ads.adplayer.WebViewBridge;
import com.unity3d.ads.core.log.Logger;
import defpackage.au3;
import defpackage.ku3;
import defpackage.z45;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u00002\u00020\u0001B!\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ \u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\fH\u0096\u0002¢\u0006\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0011R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0012R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u0013¨\u0006\u0014"}, d2 = {"Lcom/unity3d/ads/core/domain/CommonGetWebViewBridgeUseCase;", "Lcom/unity3d/ads/core/domain/GetWebViewBridgeUseCase;", "Lau3;", "dispatcher", "Lcom/unity3d/ads/core/domain/SendDiagnosticEvent;", "sendDiagnosticEvent", "Lcom/unity3d/ads/core/log/Logger;", "logger", "<init>", "(Lau3;Lcom/unity3d/ads/core/domain/SendDiagnosticEvent;Lcom/unity3d/ads/core/log/Logger;)V", "Lcom/unity3d/ads/adplayer/AndroidWebViewContainer;", "webViewContainer", "Lku3;", "adPlayerScope", "Lcom/unity3d/ads/adplayer/WebViewBridge;", "invoke", "(Lcom/unity3d/ads/adplayer/AndroidWebViewContainer;Lku3;)Lcom/unity3d/ads/adplayer/WebViewBridge;", "Lau3;", "Lcom/unity3d/ads/core/domain/SendDiagnosticEvent;", "Lcom/unity3d/ads/core/log/Logger;", "unity-ads_defaultRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class CommonGetWebViewBridgeUseCase implements GetWebViewBridgeUseCase {

    @NotNull
    private final au3 dispatcher;

    @NotNull
    private final Logger logger;

    @NotNull
    private final SendDiagnosticEvent sendDiagnosticEvent;

    public CommonGetWebViewBridgeUseCase(@NotNull au3 au3Var, @NotNull SendDiagnosticEvent sendDiagnosticEvent, @NotNull Logger logger) {
        au3Var.getClass();
        sendDiagnosticEvent.getClass();
        logger.getClass();
        this.dispatcher = au3Var;
        this.sendDiagnosticEvent = sendDiagnosticEvent;
        this.logger = logger;
    }

    @Override // com.unity3d.ads.core.domain.GetWebViewBridgeUseCase
    @NotNull
    public WebViewBridge invoke(@NotNull AndroidWebViewContainer webViewContainer, @NotNull ku3 adPlayerScope) {
        webViewContainer.getClass();
        adPlayerScope.getClass();
        return new CommonWebViewBridge(this.dispatcher, webViewContainer, adPlayerScope, this.sendDiagnosticEvent, this.logger);
    }

    public CommonGetWebViewBridgeUseCase(au3 au3Var, SendDiagnosticEvent sendDiagnosticEvent, Logger logger, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? z45.a : au3Var, sendDiagnosticEvent, logger);
    }
}
