package com.unity3d.ads.core.domain;

import com.unity3d.ads.adplayer.AndroidWebViewContainer;
import com.unity3d.ads.adplayer.CommonWebViewBridge;
import com.unity3d.ads.adplayer.WebViewBridge;
import com.unity3d.ads.core.log.Logger;
import xsna.bdn;
import xsna.ovj;
import xsna.yvj;
import xsna.zcl;

/* compiled from: CommonGetWebViewBridgeUseCase.kt */
/* loaded from: classes14.dex */
public final class CommonGetWebViewBridgeUseCase implements GetWebViewBridgeUseCase {
    private final ovj dispatcher;
    private final Logger logger;
    private final SendDiagnosticEvent sendDiagnosticEvent;

    public CommonGetWebViewBridgeUseCase(ovj ovjVar, SendDiagnosticEvent sendDiagnosticEvent, Logger logger) {
        this.dispatcher = ovjVar;
        this.sendDiagnosticEvent = sendDiagnosticEvent;
        this.logger = logger;
    }

    @Override // com.unity3d.ads.core.domain.GetWebViewBridgeUseCase
    public WebViewBridge invoke(AndroidWebViewContainer androidWebViewContainer, yvj yvjVar) {
        return new CommonWebViewBridge(this.dispatcher, androidWebViewContainer, yvjVar, this.sendDiagnosticEvent, this.logger);
    }

    public CommonGetWebViewBridgeUseCase(ovj ovjVar, SendDiagnosticEvent sendDiagnosticEvent, Logger logger, int i, zcl zclVar) {
        this((i & 1) != 0 ? bdn.b : ovjVar, sendDiagnosticEvent, logger);
    }
}
