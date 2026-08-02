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
import defpackage.au3;
import gatewayprotocol.v1.DiagnosticEventRequestOuterClass;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Metadata(d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\b\u0000\u0018\u00002\u00020\u0001BW\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\u0006\u0010\u0013\u001a\u00020\u0012\u0012\u0006\u0010\u0015\u001a\u00020\u0014¢\u0006\u0004\b\u0016\u0010\u0017J0\u0010!\u001a\u00020 2\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u001f\u001a\u00020\u001eH\u0096\u0002¢\u0006\u0004\b!\u0010\"R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010#R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010$R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010%R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010&R\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010'R\u0014\u0010\r\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010(R\u0014\u0010\u000f\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010)R\u0014\u0010\u0011\u001a\u00020\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010*R\u0014\u0010\u0013\u001a\u00020\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010+R\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010,¨\u0006-"}, d2 = {"Lcom/unity3d/ads/core/domain/CommonGetAdPlayer;", "Lcom/unity3d/ads/core/domain/GetAdPlayer;", "Lcom/unity3d/ads/core/data/repository/DeviceInfoRepository;", "deviceInfoRepository", "Lcom/unity3d/ads/core/data/repository/SessionRepository;", "sessionRepository", "Lcom/unity3d/ads/core/domain/SendDiagnosticEvent;", "sendDiagnosticEvent", "Lau3;", "defaultDispatcher", "Lcom/unity3d/ads/core/data/repository/OpenMeasurementRepository;", "openMeasurementRepository", "Lcom/unity3d/ads/core/data/manager/OfferwallManager;", "offerwallManager", "Lcom/unity3d/ads/core/data/repository/AdRepository;", "adRepository", "Lcom/unity3d/ads/core/data/datasource/LifecycleDataSource;", "lifecycleDataSource", "Lcom/unity3d/ads/core/data/repository/OrientationRepository;", "orientationRepository", "Landroid/content/Context;", "context", "<init>", "(Lcom/unity3d/ads/core/data/repository/DeviceInfoRepository;Lcom/unity3d/ads/core/data/repository/SessionRepository;Lcom/unity3d/ads/core/domain/SendDiagnosticEvent;Lau3;Lcom/unity3d/ads/core/data/repository/OpenMeasurementRepository;Lcom/unity3d/ads/core/data/manager/OfferwallManager;Lcom/unity3d/ads/core/data/repository/AdRepository;Lcom/unity3d/ads/core/data/datasource/LifecycleDataSource;Lcom/unity3d/ads/core/data/repository/OrientationRepository;Landroid/content/Context;)V", "Lcom/unity3d/ads/adplayer/WebViewBridge;", "webviewBridge", "Lcom/unity3d/ads/adplayer/AndroidWebViewContainer;", "webviewContainer", "Lcom/unity3d/ads/core/data/model/AdObject;", "adObject", "Lgatewayprotocol/v1/DiagnosticEventRequestOuterClass$DiagnosticAdType;", "adType", "Lcom/unity3d/ads/adplayer/AdPlayer;", "invoke", "(Lcom/unity3d/ads/adplayer/WebViewBridge;Lcom/unity3d/ads/adplayer/AndroidWebViewContainer;Lcom/unity3d/ads/core/data/model/AdObject;Lgatewayprotocol/v1/DiagnosticEventRequestOuterClass$DiagnosticAdType;)Lcom/unity3d/ads/adplayer/AdPlayer;", "Lcom/unity3d/ads/core/data/repository/DeviceInfoRepository;", "Lcom/unity3d/ads/core/data/repository/SessionRepository;", "Lcom/unity3d/ads/core/domain/SendDiagnosticEvent;", "Lau3;", "Lcom/unity3d/ads/core/data/repository/OpenMeasurementRepository;", "Lcom/unity3d/ads/core/data/manager/OfferwallManager;", "Lcom/unity3d/ads/core/data/repository/AdRepository;", "Lcom/unity3d/ads/core/data/datasource/LifecycleDataSource;", "Lcom/unity3d/ads/core/data/repository/OrientationRepository;", "Landroid/content/Context;", "unity-ads_defaultRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class CommonGetAdPlayer implements GetAdPlayer {

    @NotNull
    private final AdRepository adRepository;

    @NotNull
    private final Context context;

    @NotNull
    private final au3 defaultDispatcher;

    @NotNull
    private final DeviceInfoRepository deviceInfoRepository;

    @NotNull
    private final LifecycleDataSource lifecycleDataSource;

    @NotNull
    private final OfferwallManager offerwallManager;

    @NotNull
    private final OpenMeasurementRepository openMeasurementRepository;

    @NotNull
    private final OrientationRepository orientationRepository;

    @NotNull
    private final SendDiagnosticEvent sendDiagnosticEvent;

    @NotNull
    private final SessionRepository sessionRepository;

    public CommonGetAdPlayer(@NotNull DeviceInfoRepository deviceInfoRepository, @NotNull SessionRepository sessionRepository, @NotNull SendDiagnosticEvent sendDiagnosticEvent, @NotNull au3 au3Var, @NotNull OpenMeasurementRepository openMeasurementRepository, @NotNull OfferwallManager offerwallManager, @NotNull AdRepository adRepository, @NotNull LifecycleDataSource lifecycleDataSource, @NotNull OrientationRepository orientationRepository, @NotNull Context context) {
        deviceInfoRepository.getClass();
        sessionRepository.getClass();
        sendDiagnosticEvent.getClass();
        au3Var.getClass();
        openMeasurementRepository.getClass();
        offerwallManager.getClass();
        adRepository.getClass();
        lifecycleDataSource.getClass();
        orientationRepository.getClass();
        context.getClass();
        this.deviceInfoRepository = deviceInfoRepository;
        this.sessionRepository = sessionRepository;
        this.sendDiagnosticEvent = sendDiagnosticEvent;
        this.defaultDispatcher = au3Var;
        this.openMeasurementRepository = openMeasurementRepository;
        this.offerwallManager = offerwallManager;
        this.adRepository = adRepository;
        this.lifecycleDataSource = lifecycleDataSource;
        this.orientationRepository = orientationRepository;
        this.context = context;
    }

    @Override // com.unity3d.ads.core.domain.GetAdPlayer
    @NotNull
    public AdPlayer invoke(@NotNull WebViewBridge webviewBridge, @NotNull AndroidWebViewContainer webviewContainer, @NotNull AdObject adObject, @NotNull DiagnosticEventRequestOuterClass.DiagnosticAdType adType) {
        webviewBridge.getClass();
        webviewContainer.getClass();
        adObject.getClass();
        adType.getClass();
        WebViewAdPlayer webViewAdPlayer = new WebViewAdPlayer(webviewBridge, this.deviceInfoRepository, this.sessionRepository, this.defaultDispatcher, this.sendDiagnosticEvent, webviewContainer, adObject.getAdScope());
        if (adType == DiagnosticEventRequestOuterClass.DiagnosticAdType.DIAGNOSTIC_AD_TYPE_FULLSCREEN) {
            String uuid = ProtobufExtensionsKt.toUUID(adObject.getOpportunityId()).toString();
            uuid.getClass();
            return new AndroidFullscreenWebViewAdPlayer(webViewAdPlayer, uuid, webviewContainer, this.deviceInfoRepository, this.sessionRepository, this.openMeasurementRepository, this.offerwallManager, this.sendDiagnosticEvent, this.adRepository, this.orientationRepository, this.context);
        }
        String uuid2 = ProtobufExtensionsKt.toUUID(adObject.getOpportunityId()).toString();
        uuid2.getClass();
        return new AndroidEmbeddableWebViewAdPlayer(webViewAdPlayer, uuid2, webviewContainer, this.openMeasurementRepository, this.lifecycleDataSource, this.context);
    }
}
