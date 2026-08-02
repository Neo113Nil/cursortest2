package com.unity3d.ads.core.domain;

import android.content.Context;
import com.unity3d.ads.adplayer.AdPlayer;
import com.unity3d.ads.adplayer.AndroidEmbeddableWebViewAdPlayer;
import com.unity3d.ads.adplayer.AndroidFullscreenWebViewAdPlayer;
import com.unity3d.ads.adplayer.AndroidWebViewContainer;
import com.unity3d.ads.adplayer.WebViewAdPlayer;
import com.unity3d.ads.adplayer.WebViewBridge;
import com.unity3d.ads.core.data.datasource.LifecycleDataSource;
import com.unity3d.ads.core.data.manager.OfferwallManager;
import com.unity3d.ads.core.data.model.AdObject;
import com.unity3d.ads.core.data.repository.AdRepository;
import com.unity3d.ads.core.data.repository.DeviceInfoRepository;
import com.unity3d.ads.core.data.repository.OpenMeasurementRepository;
import com.unity3d.ads.core.data.repository.OrientationRepository;
import com.unity3d.ads.core.data.repository.SessionRepository;
import com.unity3d.ads.core.extensions.ProtobufExtensionsKt;
import gatewayprotocol.v1.DiagnosticEventRequestOuterClass;
import xsna.ovj;

/* compiled from: CommonGetAdPlayer.kt */
/* loaded from: classes14.dex */
public final class CommonGetAdPlayer implements GetAdPlayer {
    private final AdRepository adRepository;
    private final Context context;
    private final ovj defaultDispatcher;
    private final DeviceInfoRepository deviceInfoRepository;
    private final LifecycleDataSource lifecycleDataSource;
    private final OfferwallManager offerwallManager;
    private final OpenMeasurementRepository openMeasurementRepository;
    private final OrientationRepository orientationRepository;
    private final SendDiagnosticEvent sendDiagnosticEvent;
    private final SessionRepository sessionRepository;

    public CommonGetAdPlayer(DeviceInfoRepository deviceInfoRepository, SessionRepository sessionRepository, SendDiagnosticEvent sendDiagnosticEvent, ovj ovjVar, OpenMeasurementRepository openMeasurementRepository, OfferwallManager offerwallManager, AdRepository adRepository, LifecycleDataSource lifecycleDataSource, OrientationRepository orientationRepository, Context context) {
        this.deviceInfoRepository = deviceInfoRepository;
        this.sessionRepository = sessionRepository;
        this.sendDiagnosticEvent = sendDiagnosticEvent;
        this.defaultDispatcher = ovjVar;
        this.openMeasurementRepository = openMeasurementRepository;
        this.offerwallManager = offerwallManager;
        this.adRepository = adRepository;
        this.lifecycleDataSource = lifecycleDataSource;
        this.orientationRepository = orientationRepository;
        this.context = context;
    }

    @Override // com.unity3d.ads.core.domain.GetAdPlayer
    public AdPlayer invoke(WebViewBridge webViewBridge, AndroidWebViewContainer androidWebViewContainer, AdObject adObject, DiagnosticEventRequestOuterClass.DiagnosticAdType diagnosticAdType) {
        WebViewAdPlayer webViewAdPlayer = new WebViewAdPlayer(webViewBridge, this.deviceInfoRepository, this.sessionRepository, this.defaultDispatcher, this.sendDiagnosticEvent, androidWebViewContainer, adObject.getAdScope());
        return diagnosticAdType == DiagnosticEventRequestOuterClass.DiagnosticAdType.DIAGNOSTIC_AD_TYPE_FULLSCREEN ? new AndroidFullscreenWebViewAdPlayer(webViewAdPlayer, ProtobufExtensionsKt.toUUID(adObject.getOpportunityId()).toString(), androidWebViewContainer, this.deviceInfoRepository, this.sessionRepository, this.openMeasurementRepository, this.offerwallManager, this.sendDiagnosticEvent, this.adRepository, this.orientationRepository, this.context) : new AndroidEmbeddableWebViewAdPlayer(webViewAdPlayer, ProtobufExtensionsKt.toUUID(adObject.getOpportunityId()).toString(), androidWebViewContainer, this.openMeasurementRepository, this.lifecycleDataSource, this.context);
    }
}
