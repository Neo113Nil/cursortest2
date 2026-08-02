package com.unity3d.ads.core.domain;

import com.unity3d.ads.adplayer.ExposedFunction;
import com.unity3d.ads.adplayer.ExposedFunctionLocation;
import com.unity3d.ads.core.data.model.AdData;
import com.unity3d.ads.core.data.model.AdDataRefreshToken;
import com.unity3d.ads.core.data.model.AdObject;
import com.unity3d.ads.core.data.model.ImpressionConfig;
import com.unity3d.ads.core.data.repository.CampaignRepository;
import com.unity3d.ads.core.data.repository.DeviceInfoRepository;
import com.unity3d.ads.core.data.repository.SessionRepository;
import com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer;
import com.unity3d.ads.core.domain.attribution.AndroidAttribution;
import com.unity3d.ads.core.domain.events.GetOperativeEventApi;
import com.unity3d.ads.core.domain.exposure.CommonAdViewerExposedFunctionsKt;
import com.unity3d.ads.core.domain.offerwall.GetIsOfferwallAdReady;
import com.unity3d.ads.core.domain.offerwall.LoadOfferwallAd;
import com.unity3d.ads.core.domain.om.AndroidOmInteraction;
import com.unity3d.ads.core.domain.om.GetOmData;
import com.unity3d.ads.core.domain.om.IsOMActivated;
import com.unity3d.ads.core.domain.om.OmFinishSession;
import com.unity3d.ads.core.domain.om.OmImpressionOccurred;
import com.unity3d.services.core.di.IServiceComponent;
import com.unity3d.services.core.di.IServiceProvider;
import com.unity3d.services.core.di.IServicesRegistry;
import com.unity3d.services.core.network.model.RequestType;
import defpackage.duf;
import defpackage.fuf;
import defpackage.j69;
import defpackage.l31;
import defpackage.m69;
import defpackage.tub;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.jvm.functions.Function0;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u0000 \u000e2\u00020\u0001:\u0001\u000eB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J;\u0010\u0004\u001a\u0014\u0012\u0004\u0012\u00020\u0006\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u00052\u0006\u0010\t\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\rH\u0086\u0002¨\u0006\u000f"}, d2 = {"Lcom/unity3d/ads/core/domain/HandleInvocationsFromAdViewer;", "Lcom/unity3d/services/core/di/IServiceComponent;", "<init>", "()V", "invoke", "", "", "Lkotlin/Function0;", "Lcom/unity3d/ads/adplayer/ExposedFunction;", "adData", HandleInvocationsFromAdViewer.KEY_AD_DATA_REFRESH_TOKEN, HandleInvocationsFromAdViewer.KEY_IMPRESSION_CONFIG, "adObject", "Lcom/unity3d/ads/core/data/model/AdObject;", "Companion", "unity-ads_defaultRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class HandleInvocationsFromAdViewer implements IServiceComponent {

    @NotNull
    public static final String KEY_ACTION = "action";

    @NotNull
    public static final String KEY_AD_DATA = "adData";

    @NotNull
    public static final String KEY_AD_DATA_REFRESH_TOKEN = "adDataRefreshToken";

    @NotNull
    public static final String KEY_AD_REFRESH_INVALIDATION_REASON = "invalidationReason";

    @NotNull
    public static final String KEY_AD_STRING = "adString";

    @NotNull
    public static final String KEY_AD_TYPE = "type";

    @NotNull
    public static final String KEY_AD_UNIT_ID = "adUnitId";

    @NotNull
    public static final String KEY_DOWNLOAD_PRIORITY = "priority";

    @NotNull
    public static final String KEY_DOWNLOAD_URL = "url";

    @NotNull
    public static final String KEY_EXTRAS = "extras";

    @NotNull
    public static final String KEY_IMPRESSION_CONFIG = "impressionConfig";

    @NotNull
    public static final String KEY_IMPRESSION_OPPORTUNITY_ID = "impressionOpportunityId";

    @NotNull
    public static final String KEY_IS_HEADER_BIDDING = "isHeaderBidding";

    @NotNull
    public static final String KEY_LOAD_OPTIONS = "loadOptions";

    @NotNull
    public static final String KEY_NATIVE_CONTEXT = "nativeContext";

    @NotNull
    public static final String KEY_OMID = "openMeasurement";

    @NotNull
    public static final String KEY_OMJS_SERVICE = "serviceFilePath";

    @NotNull
    public static final String KEY_OMJS_SESSION = "sessionFilePath";

    @NotNull
    public static final String KEY_OM_PARTNER = "partnerName";

    @NotNull
    public static final String KEY_OM_PARTNER_VERSION = "partnerVersion";

    @NotNull
    public static final String KEY_OM_VERSION = "version";

    @NotNull
    public static final String KEY_PACKAGE_NAME = "packageName";

    @NotNull
    public static final String KEY_PLACEMENT_ID = "placementId";

    @NotNull
    public static final String KEY_PLACEMENT_NAME = "placementName";

    @NotNull
    public static final String KEY_PRIVACY_UPDATE_CONTENT = "content";

    @NotNull
    public static final String KEY_PRIVACY_UPDATE_VERSION = "version";

    @NotNull
    public static final String KEY_QUERY_ID = "queryId";

    @NotNull
    public static final String KEY_TRACKING_TOKEN = "trackingToken";

    @NotNull
    public static final String KEY_USE_ACTIVITY_FOR_RESULT = "useActivityForResult";

    @NotNull
    public static final String KEY_VIDEO_LENGTH = "videoLength";

    /* JADX INFO: Access modifiers changed from: private */
    public static final ExposedFunction invoke$lambda$0(HandleInvocationsFromAdViewer handleInvocationsFromAdViewer, String str, String str2, String str3, AdObject adObject) {
        IServicesRegistry registry = handleInvocationsFromAdViewer.getServiceProvider().getRegistry();
        fuf fufVar = duf.a;
        return CommonAdViewerExposedFunctionsKt.m752getAdContextyLuu4LI((AndroidGetAdPlayerContext) registry.getService("", fufVar.getOrCreateKotlinClass(AndroidGetAdPlayerContext.class)), str, str2, str3, (IsOMActivated) handleInvocationsFromAdViewer.getServiceProvider().getRegistry().getService("", fufVar.getOrCreateKotlinClass(IsOMActivated.class)), adObject);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ExposedFunction invoke$lambda$1(HandleInvocationsFromAdViewer handleInvocationsFromAdViewer) {
        return CommonAdViewerExposedFunctionsKt.getConnectionType((DeviceInfoRepository) handleInvocationsFromAdViewer.getServiceProvider().getRegistry().getService("", duf.a.getOrCreateKotlinClass(DeviceInfoRepository.class)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ExposedFunction invoke$lambda$16(HandleInvocationsFromAdViewer handleInvocationsFromAdViewer) {
        return CommonAdViewerExposedFunctionsKt.getPrivacyFsm((SessionRepository) handleInvocationsFromAdViewer.getServiceProvider().getRegistry().getService("", duf.a.getOrCreateKotlinClass(SessionRepository.class)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ExposedFunction invoke$lambda$17(HandleInvocationsFromAdViewer handleInvocationsFromAdViewer) {
        return CommonAdViewerExposedFunctionsKt.setPrivacyFsm((SessionRepository) handleInvocationsFromAdViewer.getServiceProvider().getRegistry().getService("", duf.a.getOrCreateKotlinClass(SessionRepository.class)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ExposedFunction invoke$lambda$18(HandleInvocationsFromAdViewer handleInvocationsFromAdViewer) {
        return CommonAdViewerExposedFunctionsKt.getPrivacy((SessionRepository) handleInvocationsFromAdViewer.getServiceProvider().getRegistry().getService("", duf.a.getOrCreateKotlinClass(SessionRepository.class)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ExposedFunction invoke$lambda$19(HandleInvocationsFromAdViewer handleInvocationsFromAdViewer) {
        return CommonAdViewerExposedFunctionsKt.setPrivacy((SessionRepository) handleInvocationsFromAdViewer.getServiceProvider().getRegistry().getService("", duf.a.getOrCreateKotlinClass(SessionRepository.class)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ExposedFunction invoke$lambda$2(HandleInvocationsFromAdViewer handleInvocationsFromAdViewer) {
        return CommonAdViewerExposedFunctionsKt.getDeviceVolume((DeviceInfoRepository) handleInvocationsFromAdViewer.getServiceProvider().getRegistry().getService("", duf.a.getOrCreateKotlinClass(DeviceInfoRepository.class)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ExposedFunction invoke$lambda$20(HandleInvocationsFromAdViewer handleInvocationsFromAdViewer) {
        return CommonAdViewerExposedFunctionsKt.getAllowedPii((DeviceInfoRepository) handleInvocationsFromAdViewer.getServiceProvider().getRegistry().getService("", duf.a.getOrCreateKotlinClass(DeviceInfoRepository.class)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ExposedFunction invoke$lambda$21(HandleInvocationsFromAdViewer handleInvocationsFromAdViewer) {
        return CommonAdViewerExposedFunctionsKt.setAllowedPii((DeviceInfoRepository) handleInvocationsFromAdViewer.getServiceProvider().getRegistry().getService("", duf.a.getOrCreateKotlinClass(DeviceInfoRepository.class)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ExposedFunction invoke$lambda$22(HandleInvocationsFromAdViewer handleInvocationsFromAdViewer) {
        return CommonAdViewerExposedFunctionsKt.getSessionToken((SessionRepository) handleInvocationsFromAdViewer.getServiceProvider().getRegistry().getService("", duf.a.getOrCreateKotlinClass(SessionRepository.class)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ExposedFunction invoke$lambda$23(HandleInvocationsFromAdViewer handleInvocationsFromAdViewer, AdObject adObject) {
        return CommonAdViewerExposedFunctionsKt.markCampaignStateShown((CampaignRepository) handleInvocationsFromAdViewer.getServiceProvider().getRegistry().getService("", duf.a.getOrCreateKotlinClass(CampaignRepository.class)), adObject);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ExposedFunction invoke$lambda$24(HandleInvocationsFromAdViewer handleInvocationsFromAdViewer, AdObject adObject) {
        return CommonAdViewerExposedFunctionsKt.refreshAdData((Refresh) handleInvocationsFromAdViewer.getServiceProvider().getRegistry().getService("", duf.a.getOrCreateKotlinClass(Refresh.class)), adObject);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ExposedFunction invoke$lambda$25(HandleInvocationsFromAdViewer handleInvocationsFromAdViewer, AdObject adObject) {
        return CommonAdViewerExposedFunctionsKt.updateCampaignState((CampaignRepository) handleInvocationsFromAdViewer.getServiceProvider().getRegistry().getService("", duf.a.getOrCreateKotlinClass(CampaignRepository.class)), adObject);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ExposedFunction invoke$lambda$27(HandleInvocationsFromAdViewer handleInvocationsFromAdViewer) {
        return CommonAdViewerExposedFunctionsKt.sendPrivacyUpdateRequest((SendPrivacyUpdateRequest) handleInvocationsFromAdViewer.getServiceProvider().getRegistry().getService("", duf.a.getOrCreateKotlinClass(SendPrivacyUpdateRequest.class)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ExposedFunction invoke$lambda$28(HandleInvocationsFromAdViewer handleInvocationsFromAdViewer, AdObject adObject) {
        return CommonAdViewerExposedFunctionsKt.sendDiagnosticEvent((SendDiagnosticEvent) handleInvocationsFromAdViewer.getServiceProvider().getRegistry().getService("", duf.a.getOrCreateKotlinClass(SendDiagnosticEvent.class)), adObject);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ExposedFunction invoke$lambda$29(HandleInvocationsFromAdViewer handleInvocationsFromAdViewer) {
        return CommonAdViewerExposedFunctionsKt.incrementBannerImpressionCount((SessionRepository) handleInvocationsFromAdViewer.getServiceProvider().getRegistry().getService("", duf.a.getOrCreateKotlinClass(SessionRepository.class)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ExposedFunction invoke$lambda$3(HandleInvocationsFromAdViewer handleInvocationsFromAdViewer) {
        return CommonAdViewerExposedFunctionsKt.getDeviceMaxVolume((DeviceInfoRepository) handleInvocationsFromAdViewer.getServiceProvider().getRegistry().getService("", duf.a.getOrCreateKotlinClass(DeviceInfoRepository.class)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ExposedFunction invoke$lambda$30(HandleInvocationsFromAdViewer handleInvocationsFromAdViewer, AdObject adObject) {
        IServicesRegistry registry = handleInvocationsFromAdViewer.getServiceProvider().getRegistry();
        fuf fufVar = duf.a;
        return CommonAdViewerExposedFunctionsKt.download((CacheFile) registry.getService("", fufVar.getOrCreateKotlinClass(CacheFile.class)), adObject, (SessionRepository) handleInvocationsFromAdViewer.getServiceProvider().getRegistry().getService("", fufVar.getOrCreateKotlinClass(SessionRepository.class)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ExposedFunction invoke$lambda$31(HandleInvocationsFromAdViewer handleInvocationsFromAdViewer, AdObject adObject) {
        return CommonAdViewerExposedFunctionsKt.downloadWithProgress((CacheFile) handleInvocationsFromAdViewer.getServiceProvider().getRegistry().getService("", duf.a.getOrCreateKotlinClass(CacheFile.class)), adObject);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ExposedFunction invoke$lambda$32(HandleInvocationsFromAdViewer handleInvocationsFromAdViewer) {
        return CommonAdViewerExposedFunctionsKt.isFileCached((GetIsFileCache) handleInvocationsFromAdViewer.getServiceProvider().getRegistry().getService("", duf.a.getOrCreateKotlinClass(GetIsFileCache.class)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ExposedFunction invoke$lambda$33(HandleInvocationsFromAdViewer handleInvocationsFromAdViewer, AdObject adObject) {
        return CommonAdViewerExposedFunctionsKt.omStartSession((AndroidOmInteraction) handleInvocationsFromAdViewer.getServiceProvider().getRegistry().getService("", duf.a.getOrCreateKotlinClass(AndroidOmInteraction.class)), adObject);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ExposedFunction invoke$lambda$34(HandleInvocationsFromAdViewer handleInvocationsFromAdViewer, AdObject adObject) {
        return CommonAdViewerExposedFunctionsKt.omFinishSession((OmFinishSession) handleInvocationsFromAdViewer.getServiceProvider().getRegistry().getService("", duf.a.getOrCreateKotlinClass(OmFinishSession.class)), adObject);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ExposedFunction invoke$lambda$35(HandleInvocationsFromAdViewer handleInvocationsFromAdViewer, AdObject adObject) {
        return CommonAdViewerExposedFunctionsKt.omImpression((OmImpressionOccurred) handleInvocationsFromAdViewer.getServiceProvider().getRegistry().getService("", duf.a.getOrCreateKotlinClass(OmImpressionOccurred.class)), adObject);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ExposedFunction invoke$lambda$36(HandleInvocationsFromAdViewer handleInvocationsFromAdViewer) {
        return CommonAdViewerExposedFunctionsKt.omGetData((GetOmData) handleInvocationsFromAdViewer.getServiceProvider().getRegistry().getService("", duf.a.getOrCreateKotlinClass(GetOmData.class)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ExposedFunction invoke$lambda$37(HandleInvocationsFromAdViewer handleInvocationsFromAdViewer) {
        return CommonAdViewerExposedFunctionsKt.isAttributionAvailable((AndroidAttribution) handleInvocationsFromAdViewer.getServiceProvider().getRegistry().getService("", duf.a.getOrCreateKotlinClass(AndroidAttribution.class)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ExposedFunction invoke$lambda$38(HandleInvocationsFromAdViewer handleInvocationsFromAdViewer, AdObject adObject) {
        return CommonAdViewerExposedFunctionsKt.attributionRegisterView((AndroidAttribution) handleInvocationsFromAdViewer.getServiceProvider().getRegistry().getService("", duf.a.getOrCreateKotlinClass(AndroidAttribution.class)), adObject);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ExposedFunction invoke$lambda$39(HandleInvocationsFromAdViewer handleInvocationsFromAdViewer, AdObject adObject) {
        return CommonAdViewerExposedFunctionsKt.attributionRegisterClick((AndroidAttribution) handleInvocationsFromAdViewer.getServiceProvider().getRegistry().getService("", duf.a.getOrCreateKotlinClass(AndroidAttribution.class)), adObject);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ExposedFunction invoke$lambda$4(HandleInvocationsFromAdViewer handleInvocationsFromAdViewer) {
        return CommonAdViewerExposedFunctionsKt.getScreenHeight((DeviceInfoRepository) handleInvocationsFromAdViewer.getServiceProvider().getRegistry().getService("", duf.a.getOrCreateKotlinClass(DeviceInfoRepository.class)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ExposedFunction invoke$lambda$40(HandleInvocationsFromAdViewer handleInvocationsFromAdViewer, AdObject adObject) {
        return CommonAdViewerExposedFunctionsKt.hbTokenIncrementWins((SessionRepository) handleInvocationsFromAdViewer.getServiceProvider().getRegistry().getService("", duf.a.getOrCreateKotlinClass(SessionRepository.class)), adObject);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ExposedFunction invoke$lambda$41(HandleInvocationsFromAdViewer handleInvocationsFromAdViewer) {
        return CommonAdViewerExposedFunctionsKt.hbTokenIncrementStarts((SessionRepository) handleInvocationsFromAdViewer.getServiceProvider().getRegistry().getService("", duf.a.getOrCreateKotlinClass(SessionRepository.class)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ExposedFunction invoke$lambda$42(HandleInvocationsFromAdViewer handleInvocationsFromAdViewer) {
        return CommonAdViewerExposedFunctionsKt.hbTokenReset((SessionRepository) handleInvocationsFromAdViewer.getServiceProvider().getRegistry().getService("", duf.a.getOrCreateKotlinClass(SessionRepository.class)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ExposedFunction invoke$lambda$43(HandleInvocationsFromAdViewer handleInvocationsFromAdViewer, AdObject adObject) {
        return CommonAdViewerExposedFunctionsKt.loadOfferwallAd((LoadOfferwallAd) handleInvocationsFromAdViewer.getServiceProvider().getRegistry().getService("", duf.a.getOrCreateKotlinClass(LoadOfferwallAd.class)), adObject);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ExposedFunction invoke$lambda$45(HandleInvocationsFromAdViewer handleInvocationsFromAdViewer) {
        return CommonAdViewerExposedFunctionsKt.isOfferwallAdReady((GetIsOfferwallAdReady) handleInvocationsFromAdViewer.getServiceProvider().getRegistry().getService("", duf.a.getOrCreateKotlinClass(GetIsOfferwallAdReady.class)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ExposedFunction invoke$lambda$46(HandleInvocationsFromAdViewer handleInvocationsFromAdViewer) {
        return CommonAdViewerExposedFunctionsKt.request(RequestType.GET, (ExecuteAdViewerRequest) handleInvocationsFromAdViewer.getServiceProvider().getRegistry().getService("", duf.a.getOrCreateKotlinClass(ExecuteAdViewerRequest.class)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ExposedFunction invoke$lambda$47(HandleInvocationsFromAdViewer handleInvocationsFromAdViewer) {
        return CommonAdViewerExposedFunctionsKt.request(RequestType.POST, (ExecuteAdViewerRequest) handleInvocationsFromAdViewer.getServiceProvider().getRegistry().getService("", duf.a.getOrCreateKotlinClass(ExecuteAdViewerRequest.class)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ExposedFunction invoke$lambda$48(HandleInvocationsFromAdViewer handleInvocationsFromAdViewer) {
        return CommonAdViewerExposedFunctionsKt.request(RequestType.HEAD, (ExecuteAdViewerRequest) handleInvocationsFromAdViewer.getServiceProvider().getRegistry().getService("", duf.a.getOrCreateKotlinClass(ExecuteAdViewerRequest.class)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ExposedFunction invoke$lambda$5(HandleInvocationsFromAdViewer handleInvocationsFromAdViewer) {
        return CommonAdViewerExposedFunctionsKt.getScreenWidth((DeviceInfoRepository) handleInvocationsFromAdViewer.getServiceProvider().getRegistry().getService("", duf.a.getOrCreateKotlinClass(DeviceInfoRepository.class)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ExposedFunction invoke$lambda$50(HandleInvocationsFromAdViewer handleInvocationsFromAdViewer, AdObject adObject) {
        return CommonAdViewerExposedFunctionsKt.getExtra((SessionRepository) handleInvocationsFromAdViewer.getServiceProvider().getRegistry().getService("", duf.a.getOrCreateKotlinClass(SessionRepository.class)), adObject);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ExposedFunction invoke$lambda$6(AdObject adObject, HandleInvocationsFromAdViewer handleInvocationsFromAdViewer) {
        return CommonAdViewerExposedFunctionsKt.openUrl(adObject, (HandleOpenUrl) handleInvocationsFromAdViewer.getServiceProvider().getRegistry().getService("", duf.a.getOrCreateKotlinClass(HandleOpenUrl.class)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ExposedFunction invoke$lambda$8(HandleInvocationsFromAdViewer handleInvocationsFromAdViewer, AdObject adObject) {
        return CommonAdViewerExposedFunctionsKt.sendOperativeEvent((GetOperativeEventApi) handleInvocationsFromAdViewer.getServiceProvider().getRegistry().getService("", duf.a.getOrCreateKotlinClass(GetOperativeEventApi.class)), adObject);
    }

    @Override // com.unity3d.services.core.di.IServiceComponent
    @NotNull
    public IServiceProvider getServiceProvider() {
        return IServiceComponent.DefaultImpls.getServiceProvider(this);
    }

    @NotNull
    public final Map<String, Function0<ExposedFunction>> invoke(@NotNull String adData, @NotNull String adDataRefreshToken, @NotNull String impressionConfig, @NotNull final AdObject adObject) {
        adData.getClass();
        adDataRefreshToken.getClass();
        impressionConfig.getClass();
        adObject.getClass();
        final int i = 1;
        final int i2 = 7;
        final int i3 = 11;
        final int i4 = 18;
        final int i5 = 19;
        final int i6 = 2;
        final int i7 = 20;
        final int i8 = 21;
        final int i9 = 22;
        final int i10 = 0;
        final int i11 = 2;
        final int i12 = 3;
        final int i13 = 4;
        final int i14 = 0;
        final int i15 = 5;
        final int i16 = 6;
        final int i17 = 8;
        final int i18 = 9;
        final int i19 = 10;
        final int i20 = 12;
        final int i21 = 13;
        final int i22 = 14;
        final int i23 = 15;
        final int i24 = 16;
        final int i25 = 17;
        final int i26 = 1;
        return tub.h(new Pair(ExposedFunctionLocation.GET_AD_CONTEXT, new l31(this, AdData.m723constructorimpl(adData), ImpressionConfig.m744constructorimpl(impressionConfig), AdDataRefreshToken.m730constructorimpl(adDataRefreshToken), adObject, 6)), new Pair(ExposedFunctionLocation.GET_CONNECTION_TYPE, new Function0(this) { // from class: l69
            public final /* synthetic */ HandleInvocationsFromAdViewer b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                ExposedFunction invoke$lambda$19;
                ExposedFunction invoke$lambda$1;
                ExposedFunction invoke$lambda$20;
                ExposedFunction invoke$lambda$21;
                ExposedFunction invoke$lambda$22;
                ExposedFunction invoke$lambda$27;
                ExposedFunction invoke$lambda$29;
                ExposedFunction invoke$lambda$2;
                ExposedFunction invoke$lambda$32;
                ExposedFunction invoke$lambda$36;
                ExposedFunction invoke$lambda$37;
                ExposedFunction invoke$lambda$3;
                ExposedFunction invoke$lambda$41;
                ExposedFunction invoke$lambda$42;
                ExposedFunction invoke$lambda$45;
                ExposedFunction invoke$lambda$46;
                ExposedFunction invoke$lambda$47;
                ExposedFunction invoke$lambda$48;
                ExposedFunction invoke$lambda$4;
                ExposedFunction invoke$lambda$5;
                ExposedFunction invoke$lambda$16;
                ExposedFunction invoke$lambda$17;
                ExposedFunction invoke$lambda$18;
                int i27 = i;
                HandleInvocationsFromAdViewer handleInvocationsFromAdViewer = this.b;
                switch (i27) {
                    case 0:
                        invoke$lambda$19 = HandleInvocationsFromAdViewer.invoke$lambda$19(handleInvocationsFromAdViewer);
                        return invoke$lambda$19;
                    case 1:
                        invoke$lambda$1 = HandleInvocationsFromAdViewer.invoke$lambda$1(handleInvocationsFromAdViewer);
                        return invoke$lambda$1;
                    case 2:
                        invoke$lambda$20 = HandleInvocationsFromAdViewer.invoke$lambda$20(handleInvocationsFromAdViewer);
                        return invoke$lambda$20;
                    case 3:
                        invoke$lambda$21 = HandleInvocationsFromAdViewer.invoke$lambda$21(handleInvocationsFromAdViewer);
                        return invoke$lambda$21;
                    case 4:
                        invoke$lambda$22 = HandleInvocationsFromAdViewer.invoke$lambda$22(handleInvocationsFromAdViewer);
                        return invoke$lambda$22;
                    case 5:
                        invoke$lambda$27 = HandleInvocationsFromAdViewer.invoke$lambda$27(handleInvocationsFromAdViewer);
                        return invoke$lambda$27;
                    case 6:
                        invoke$lambda$29 = HandleInvocationsFromAdViewer.invoke$lambda$29(handleInvocationsFromAdViewer);
                        return invoke$lambda$29;
                    case 7:
                        invoke$lambda$2 = HandleInvocationsFromAdViewer.invoke$lambda$2(handleInvocationsFromAdViewer);
                        return invoke$lambda$2;
                    case 8:
                        invoke$lambda$32 = HandleInvocationsFromAdViewer.invoke$lambda$32(handleInvocationsFromAdViewer);
                        return invoke$lambda$32;
                    case 9:
                        invoke$lambda$36 = HandleInvocationsFromAdViewer.invoke$lambda$36(handleInvocationsFromAdViewer);
                        return invoke$lambda$36;
                    case 10:
                        invoke$lambda$37 = HandleInvocationsFromAdViewer.invoke$lambda$37(handleInvocationsFromAdViewer);
                        return invoke$lambda$37;
                    case 11:
                        invoke$lambda$3 = HandleInvocationsFromAdViewer.invoke$lambda$3(handleInvocationsFromAdViewer);
                        return invoke$lambda$3;
                    case 12:
                        invoke$lambda$41 = HandleInvocationsFromAdViewer.invoke$lambda$41(handleInvocationsFromAdViewer);
                        return invoke$lambda$41;
                    case 13:
                        invoke$lambda$42 = HandleInvocationsFromAdViewer.invoke$lambda$42(handleInvocationsFromAdViewer);
                        return invoke$lambda$42;
                    case 14:
                        invoke$lambda$45 = HandleInvocationsFromAdViewer.invoke$lambda$45(handleInvocationsFromAdViewer);
                        return invoke$lambda$45;
                    case 15:
                        invoke$lambda$46 = HandleInvocationsFromAdViewer.invoke$lambda$46(handleInvocationsFromAdViewer);
                        return invoke$lambda$46;
                    case 16:
                        invoke$lambda$47 = HandleInvocationsFromAdViewer.invoke$lambda$47(handleInvocationsFromAdViewer);
                        return invoke$lambda$47;
                    case 17:
                        invoke$lambda$48 = HandleInvocationsFromAdViewer.invoke$lambda$48(handleInvocationsFromAdViewer);
                        return invoke$lambda$48;
                    case 18:
                        invoke$lambda$4 = HandleInvocationsFromAdViewer.invoke$lambda$4(handleInvocationsFromAdViewer);
                        return invoke$lambda$4;
                    case 19:
                        invoke$lambda$5 = HandleInvocationsFromAdViewer.invoke$lambda$5(handleInvocationsFromAdViewer);
                        return invoke$lambda$5;
                    case 20:
                        invoke$lambda$16 = HandleInvocationsFromAdViewer.invoke$lambda$16(handleInvocationsFromAdViewer);
                        return invoke$lambda$16;
                    case 21:
                        invoke$lambda$17 = HandleInvocationsFromAdViewer.invoke$lambda$17(handleInvocationsFromAdViewer);
                        return invoke$lambda$17;
                    default:
                        invoke$lambda$18 = HandleInvocationsFromAdViewer.invoke$lambda$18(handleInvocationsFromAdViewer);
                        return invoke$lambda$18;
                }
            }
        }), new Pair(ExposedFunctionLocation.GET_DEVICE_VOLUME, new Function0(this) { // from class: l69
            public final /* synthetic */ HandleInvocationsFromAdViewer b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                ExposedFunction invoke$lambda$19;
                ExposedFunction invoke$lambda$1;
                ExposedFunction invoke$lambda$20;
                ExposedFunction invoke$lambda$21;
                ExposedFunction invoke$lambda$22;
                ExposedFunction invoke$lambda$27;
                ExposedFunction invoke$lambda$29;
                ExposedFunction invoke$lambda$2;
                ExposedFunction invoke$lambda$32;
                ExposedFunction invoke$lambda$36;
                ExposedFunction invoke$lambda$37;
                ExposedFunction invoke$lambda$3;
                ExposedFunction invoke$lambda$41;
                ExposedFunction invoke$lambda$42;
                ExposedFunction invoke$lambda$45;
                ExposedFunction invoke$lambda$46;
                ExposedFunction invoke$lambda$47;
                ExposedFunction invoke$lambda$48;
                ExposedFunction invoke$lambda$4;
                ExposedFunction invoke$lambda$5;
                ExposedFunction invoke$lambda$16;
                ExposedFunction invoke$lambda$17;
                ExposedFunction invoke$lambda$18;
                int i27 = i2;
                HandleInvocationsFromAdViewer handleInvocationsFromAdViewer = this.b;
                switch (i27) {
                    case 0:
                        invoke$lambda$19 = HandleInvocationsFromAdViewer.invoke$lambda$19(handleInvocationsFromAdViewer);
                        return invoke$lambda$19;
                    case 1:
                        invoke$lambda$1 = HandleInvocationsFromAdViewer.invoke$lambda$1(handleInvocationsFromAdViewer);
                        return invoke$lambda$1;
                    case 2:
                        invoke$lambda$20 = HandleInvocationsFromAdViewer.invoke$lambda$20(handleInvocationsFromAdViewer);
                        return invoke$lambda$20;
                    case 3:
                        invoke$lambda$21 = HandleInvocationsFromAdViewer.invoke$lambda$21(handleInvocationsFromAdViewer);
                        return invoke$lambda$21;
                    case 4:
                        invoke$lambda$22 = HandleInvocationsFromAdViewer.invoke$lambda$22(handleInvocationsFromAdViewer);
                        return invoke$lambda$22;
                    case 5:
                        invoke$lambda$27 = HandleInvocationsFromAdViewer.invoke$lambda$27(handleInvocationsFromAdViewer);
                        return invoke$lambda$27;
                    case 6:
                        invoke$lambda$29 = HandleInvocationsFromAdViewer.invoke$lambda$29(handleInvocationsFromAdViewer);
                        return invoke$lambda$29;
                    case 7:
                        invoke$lambda$2 = HandleInvocationsFromAdViewer.invoke$lambda$2(handleInvocationsFromAdViewer);
                        return invoke$lambda$2;
                    case 8:
                        invoke$lambda$32 = HandleInvocationsFromAdViewer.invoke$lambda$32(handleInvocationsFromAdViewer);
                        return invoke$lambda$32;
                    case 9:
                        invoke$lambda$36 = HandleInvocationsFromAdViewer.invoke$lambda$36(handleInvocationsFromAdViewer);
                        return invoke$lambda$36;
                    case 10:
                        invoke$lambda$37 = HandleInvocationsFromAdViewer.invoke$lambda$37(handleInvocationsFromAdViewer);
                        return invoke$lambda$37;
                    case 11:
                        invoke$lambda$3 = HandleInvocationsFromAdViewer.invoke$lambda$3(handleInvocationsFromAdViewer);
                        return invoke$lambda$3;
                    case 12:
                        invoke$lambda$41 = HandleInvocationsFromAdViewer.invoke$lambda$41(handleInvocationsFromAdViewer);
                        return invoke$lambda$41;
                    case 13:
                        invoke$lambda$42 = HandleInvocationsFromAdViewer.invoke$lambda$42(handleInvocationsFromAdViewer);
                        return invoke$lambda$42;
                    case 14:
                        invoke$lambda$45 = HandleInvocationsFromAdViewer.invoke$lambda$45(handleInvocationsFromAdViewer);
                        return invoke$lambda$45;
                    case 15:
                        invoke$lambda$46 = HandleInvocationsFromAdViewer.invoke$lambda$46(handleInvocationsFromAdViewer);
                        return invoke$lambda$46;
                    case 16:
                        invoke$lambda$47 = HandleInvocationsFromAdViewer.invoke$lambda$47(handleInvocationsFromAdViewer);
                        return invoke$lambda$47;
                    case 17:
                        invoke$lambda$48 = HandleInvocationsFromAdViewer.invoke$lambda$48(handleInvocationsFromAdViewer);
                        return invoke$lambda$48;
                    case 18:
                        invoke$lambda$4 = HandleInvocationsFromAdViewer.invoke$lambda$4(handleInvocationsFromAdViewer);
                        return invoke$lambda$4;
                    case 19:
                        invoke$lambda$5 = HandleInvocationsFromAdViewer.invoke$lambda$5(handleInvocationsFromAdViewer);
                        return invoke$lambda$5;
                    case 20:
                        invoke$lambda$16 = HandleInvocationsFromAdViewer.invoke$lambda$16(handleInvocationsFromAdViewer);
                        return invoke$lambda$16;
                    case 21:
                        invoke$lambda$17 = HandleInvocationsFromAdViewer.invoke$lambda$17(handleInvocationsFromAdViewer);
                        return invoke$lambda$17;
                    default:
                        invoke$lambda$18 = HandleInvocationsFromAdViewer.invoke$lambda$18(handleInvocationsFromAdViewer);
                        return invoke$lambda$18;
                }
            }
        }), new Pair(ExposedFunctionLocation.GET_DEVICE_MAX_VOLUME, new Function0(this) { // from class: l69
            public final /* synthetic */ HandleInvocationsFromAdViewer b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                ExposedFunction invoke$lambda$19;
                ExposedFunction invoke$lambda$1;
                ExposedFunction invoke$lambda$20;
                ExposedFunction invoke$lambda$21;
                ExposedFunction invoke$lambda$22;
                ExposedFunction invoke$lambda$27;
                ExposedFunction invoke$lambda$29;
                ExposedFunction invoke$lambda$2;
                ExposedFunction invoke$lambda$32;
                ExposedFunction invoke$lambda$36;
                ExposedFunction invoke$lambda$37;
                ExposedFunction invoke$lambda$3;
                ExposedFunction invoke$lambda$41;
                ExposedFunction invoke$lambda$42;
                ExposedFunction invoke$lambda$45;
                ExposedFunction invoke$lambda$46;
                ExposedFunction invoke$lambda$47;
                ExposedFunction invoke$lambda$48;
                ExposedFunction invoke$lambda$4;
                ExposedFunction invoke$lambda$5;
                ExposedFunction invoke$lambda$16;
                ExposedFunction invoke$lambda$17;
                ExposedFunction invoke$lambda$18;
                int i27 = i3;
                HandleInvocationsFromAdViewer handleInvocationsFromAdViewer = this.b;
                switch (i27) {
                    case 0:
                        invoke$lambda$19 = HandleInvocationsFromAdViewer.invoke$lambda$19(handleInvocationsFromAdViewer);
                        return invoke$lambda$19;
                    case 1:
                        invoke$lambda$1 = HandleInvocationsFromAdViewer.invoke$lambda$1(handleInvocationsFromAdViewer);
                        return invoke$lambda$1;
                    case 2:
                        invoke$lambda$20 = HandleInvocationsFromAdViewer.invoke$lambda$20(handleInvocationsFromAdViewer);
                        return invoke$lambda$20;
                    case 3:
                        invoke$lambda$21 = HandleInvocationsFromAdViewer.invoke$lambda$21(handleInvocationsFromAdViewer);
                        return invoke$lambda$21;
                    case 4:
                        invoke$lambda$22 = HandleInvocationsFromAdViewer.invoke$lambda$22(handleInvocationsFromAdViewer);
                        return invoke$lambda$22;
                    case 5:
                        invoke$lambda$27 = HandleInvocationsFromAdViewer.invoke$lambda$27(handleInvocationsFromAdViewer);
                        return invoke$lambda$27;
                    case 6:
                        invoke$lambda$29 = HandleInvocationsFromAdViewer.invoke$lambda$29(handleInvocationsFromAdViewer);
                        return invoke$lambda$29;
                    case 7:
                        invoke$lambda$2 = HandleInvocationsFromAdViewer.invoke$lambda$2(handleInvocationsFromAdViewer);
                        return invoke$lambda$2;
                    case 8:
                        invoke$lambda$32 = HandleInvocationsFromAdViewer.invoke$lambda$32(handleInvocationsFromAdViewer);
                        return invoke$lambda$32;
                    case 9:
                        invoke$lambda$36 = HandleInvocationsFromAdViewer.invoke$lambda$36(handleInvocationsFromAdViewer);
                        return invoke$lambda$36;
                    case 10:
                        invoke$lambda$37 = HandleInvocationsFromAdViewer.invoke$lambda$37(handleInvocationsFromAdViewer);
                        return invoke$lambda$37;
                    case 11:
                        invoke$lambda$3 = HandleInvocationsFromAdViewer.invoke$lambda$3(handleInvocationsFromAdViewer);
                        return invoke$lambda$3;
                    case 12:
                        invoke$lambda$41 = HandleInvocationsFromAdViewer.invoke$lambda$41(handleInvocationsFromAdViewer);
                        return invoke$lambda$41;
                    case 13:
                        invoke$lambda$42 = HandleInvocationsFromAdViewer.invoke$lambda$42(handleInvocationsFromAdViewer);
                        return invoke$lambda$42;
                    case 14:
                        invoke$lambda$45 = HandleInvocationsFromAdViewer.invoke$lambda$45(handleInvocationsFromAdViewer);
                        return invoke$lambda$45;
                    case 15:
                        invoke$lambda$46 = HandleInvocationsFromAdViewer.invoke$lambda$46(handleInvocationsFromAdViewer);
                        return invoke$lambda$46;
                    case 16:
                        invoke$lambda$47 = HandleInvocationsFromAdViewer.invoke$lambda$47(handleInvocationsFromAdViewer);
                        return invoke$lambda$47;
                    case 17:
                        invoke$lambda$48 = HandleInvocationsFromAdViewer.invoke$lambda$48(handleInvocationsFromAdViewer);
                        return invoke$lambda$48;
                    case 18:
                        invoke$lambda$4 = HandleInvocationsFromAdViewer.invoke$lambda$4(handleInvocationsFromAdViewer);
                        return invoke$lambda$4;
                    case 19:
                        invoke$lambda$5 = HandleInvocationsFromAdViewer.invoke$lambda$5(handleInvocationsFromAdViewer);
                        return invoke$lambda$5;
                    case 20:
                        invoke$lambda$16 = HandleInvocationsFromAdViewer.invoke$lambda$16(handleInvocationsFromAdViewer);
                        return invoke$lambda$16;
                    case 21:
                        invoke$lambda$17 = HandleInvocationsFromAdViewer.invoke$lambda$17(handleInvocationsFromAdViewer);
                        return invoke$lambda$17;
                    default:
                        invoke$lambda$18 = HandleInvocationsFromAdViewer.invoke$lambda$18(handleInvocationsFromAdViewer);
                        return invoke$lambda$18;
                }
            }
        }), new Pair(ExposedFunctionLocation.GET_SCREEN_HEIGHT, new Function0(this) { // from class: l69
            public final /* synthetic */ HandleInvocationsFromAdViewer b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                ExposedFunction invoke$lambda$19;
                ExposedFunction invoke$lambda$1;
                ExposedFunction invoke$lambda$20;
                ExposedFunction invoke$lambda$21;
                ExposedFunction invoke$lambda$22;
                ExposedFunction invoke$lambda$27;
                ExposedFunction invoke$lambda$29;
                ExposedFunction invoke$lambda$2;
                ExposedFunction invoke$lambda$32;
                ExposedFunction invoke$lambda$36;
                ExposedFunction invoke$lambda$37;
                ExposedFunction invoke$lambda$3;
                ExposedFunction invoke$lambda$41;
                ExposedFunction invoke$lambda$42;
                ExposedFunction invoke$lambda$45;
                ExposedFunction invoke$lambda$46;
                ExposedFunction invoke$lambda$47;
                ExposedFunction invoke$lambda$48;
                ExposedFunction invoke$lambda$4;
                ExposedFunction invoke$lambda$5;
                ExposedFunction invoke$lambda$16;
                ExposedFunction invoke$lambda$17;
                ExposedFunction invoke$lambda$18;
                int i27 = i4;
                HandleInvocationsFromAdViewer handleInvocationsFromAdViewer = this.b;
                switch (i27) {
                    case 0:
                        invoke$lambda$19 = HandleInvocationsFromAdViewer.invoke$lambda$19(handleInvocationsFromAdViewer);
                        return invoke$lambda$19;
                    case 1:
                        invoke$lambda$1 = HandleInvocationsFromAdViewer.invoke$lambda$1(handleInvocationsFromAdViewer);
                        return invoke$lambda$1;
                    case 2:
                        invoke$lambda$20 = HandleInvocationsFromAdViewer.invoke$lambda$20(handleInvocationsFromAdViewer);
                        return invoke$lambda$20;
                    case 3:
                        invoke$lambda$21 = HandleInvocationsFromAdViewer.invoke$lambda$21(handleInvocationsFromAdViewer);
                        return invoke$lambda$21;
                    case 4:
                        invoke$lambda$22 = HandleInvocationsFromAdViewer.invoke$lambda$22(handleInvocationsFromAdViewer);
                        return invoke$lambda$22;
                    case 5:
                        invoke$lambda$27 = HandleInvocationsFromAdViewer.invoke$lambda$27(handleInvocationsFromAdViewer);
                        return invoke$lambda$27;
                    case 6:
                        invoke$lambda$29 = HandleInvocationsFromAdViewer.invoke$lambda$29(handleInvocationsFromAdViewer);
                        return invoke$lambda$29;
                    case 7:
                        invoke$lambda$2 = HandleInvocationsFromAdViewer.invoke$lambda$2(handleInvocationsFromAdViewer);
                        return invoke$lambda$2;
                    case 8:
                        invoke$lambda$32 = HandleInvocationsFromAdViewer.invoke$lambda$32(handleInvocationsFromAdViewer);
                        return invoke$lambda$32;
                    case 9:
                        invoke$lambda$36 = HandleInvocationsFromAdViewer.invoke$lambda$36(handleInvocationsFromAdViewer);
                        return invoke$lambda$36;
                    case 10:
                        invoke$lambda$37 = HandleInvocationsFromAdViewer.invoke$lambda$37(handleInvocationsFromAdViewer);
                        return invoke$lambda$37;
                    case 11:
                        invoke$lambda$3 = HandleInvocationsFromAdViewer.invoke$lambda$3(handleInvocationsFromAdViewer);
                        return invoke$lambda$3;
                    case 12:
                        invoke$lambda$41 = HandleInvocationsFromAdViewer.invoke$lambda$41(handleInvocationsFromAdViewer);
                        return invoke$lambda$41;
                    case 13:
                        invoke$lambda$42 = HandleInvocationsFromAdViewer.invoke$lambda$42(handleInvocationsFromAdViewer);
                        return invoke$lambda$42;
                    case 14:
                        invoke$lambda$45 = HandleInvocationsFromAdViewer.invoke$lambda$45(handleInvocationsFromAdViewer);
                        return invoke$lambda$45;
                    case 15:
                        invoke$lambda$46 = HandleInvocationsFromAdViewer.invoke$lambda$46(handleInvocationsFromAdViewer);
                        return invoke$lambda$46;
                    case 16:
                        invoke$lambda$47 = HandleInvocationsFromAdViewer.invoke$lambda$47(handleInvocationsFromAdViewer);
                        return invoke$lambda$47;
                    case 17:
                        invoke$lambda$48 = HandleInvocationsFromAdViewer.invoke$lambda$48(handleInvocationsFromAdViewer);
                        return invoke$lambda$48;
                    case 18:
                        invoke$lambda$4 = HandleInvocationsFromAdViewer.invoke$lambda$4(handleInvocationsFromAdViewer);
                        return invoke$lambda$4;
                    case 19:
                        invoke$lambda$5 = HandleInvocationsFromAdViewer.invoke$lambda$5(handleInvocationsFromAdViewer);
                        return invoke$lambda$5;
                    case 20:
                        invoke$lambda$16 = HandleInvocationsFromAdViewer.invoke$lambda$16(handleInvocationsFromAdViewer);
                        return invoke$lambda$16;
                    case 21:
                        invoke$lambda$17 = HandleInvocationsFromAdViewer.invoke$lambda$17(handleInvocationsFromAdViewer);
                        return invoke$lambda$17;
                    default:
                        invoke$lambda$18 = HandleInvocationsFromAdViewer.invoke$lambda$18(handleInvocationsFromAdViewer);
                        return invoke$lambda$18;
                }
            }
        }), new Pair(ExposedFunctionLocation.GET_SCREEN_WIDTH, new Function0(this) { // from class: l69
            public final /* synthetic */ HandleInvocationsFromAdViewer b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                ExposedFunction invoke$lambda$19;
                ExposedFunction invoke$lambda$1;
                ExposedFunction invoke$lambda$20;
                ExposedFunction invoke$lambda$21;
                ExposedFunction invoke$lambda$22;
                ExposedFunction invoke$lambda$27;
                ExposedFunction invoke$lambda$29;
                ExposedFunction invoke$lambda$2;
                ExposedFunction invoke$lambda$32;
                ExposedFunction invoke$lambda$36;
                ExposedFunction invoke$lambda$37;
                ExposedFunction invoke$lambda$3;
                ExposedFunction invoke$lambda$41;
                ExposedFunction invoke$lambda$42;
                ExposedFunction invoke$lambda$45;
                ExposedFunction invoke$lambda$46;
                ExposedFunction invoke$lambda$47;
                ExposedFunction invoke$lambda$48;
                ExposedFunction invoke$lambda$4;
                ExposedFunction invoke$lambda$5;
                ExposedFunction invoke$lambda$16;
                ExposedFunction invoke$lambda$17;
                ExposedFunction invoke$lambda$18;
                int i27 = i5;
                HandleInvocationsFromAdViewer handleInvocationsFromAdViewer = this.b;
                switch (i27) {
                    case 0:
                        invoke$lambda$19 = HandleInvocationsFromAdViewer.invoke$lambda$19(handleInvocationsFromAdViewer);
                        return invoke$lambda$19;
                    case 1:
                        invoke$lambda$1 = HandleInvocationsFromAdViewer.invoke$lambda$1(handleInvocationsFromAdViewer);
                        return invoke$lambda$1;
                    case 2:
                        invoke$lambda$20 = HandleInvocationsFromAdViewer.invoke$lambda$20(handleInvocationsFromAdViewer);
                        return invoke$lambda$20;
                    case 3:
                        invoke$lambda$21 = HandleInvocationsFromAdViewer.invoke$lambda$21(handleInvocationsFromAdViewer);
                        return invoke$lambda$21;
                    case 4:
                        invoke$lambda$22 = HandleInvocationsFromAdViewer.invoke$lambda$22(handleInvocationsFromAdViewer);
                        return invoke$lambda$22;
                    case 5:
                        invoke$lambda$27 = HandleInvocationsFromAdViewer.invoke$lambda$27(handleInvocationsFromAdViewer);
                        return invoke$lambda$27;
                    case 6:
                        invoke$lambda$29 = HandleInvocationsFromAdViewer.invoke$lambda$29(handleInvocationsFromAdViewer);
                        return invoke$lambda$29;
                    case 7:
                        invoke$lambda$2 = HandleInvocationsFromAdViewer.invoke$lambda$2(handleInvocationsFromAdViewer);
                        return invoke$lambda$2;
                    case 8:
                        invoke$lambda$32 = HandleInvocationsFromAdViewer.invoke$lambda$32(handleInvocationsFromAdViewer);
                        return invoke$lambda$32;
                    case 9:
                        invoke$lambda$36 = HandleInvocationsFromAdViewer.invoke$lambda$36(handleInvocationsFromAdViewer);
                        return invoke$lambda$36;
                    case 10:
                        invoke$lambda$37 = HandleInvocationsFromAdViewer.invoke$lambda$37(handleInvocationsFromAdViewer);
                        return invoke$lambda$37;
                    case 11:
                        invoke$lambda$3 = HandleInvocationsFromAdViewer.invoke$lambda$3(handleInvocationsFromAdViewer);
                        return invoke$lambda$3;
                    case 12:
                        invoke$lambda$41 = HandleInvocationsFromAdViewer.invoke$lambda$41(handleInvocationsFromAdViewer);
                        return invoke$lambda$41;
                    case 13:
                        invoke$lambda$42 = HandleInvocationsFromAdViewer.invoke$lambda$42(handleInvocationsFromAdViewer);
                        return invoke$lambda$42;
                    case 14:
                        invoke$lambda$45 = HandleInvocationsFromAdViewer.invoke$lambda$45(handleInvocationsFromAdViewer);
                        return invoke$lambda$45;
                    case 15:
                        invoke$lambda$46 = HandleInvocationsFromAdViewer.invoke$lambda$46(handleInvocationsFromAdViewer);
                        return invoke$lambda$46;
                    case 16:
                        invoke$lambda$47 = HandleInvocationsFromAdViewer.invoke$lambda$47(handleInvocationsFromAdViewer);
                        return invoke$lambda$47;
                    case 17:
                        invoke$lambda$48 = HandleInvocationsFromAdViewer.invoke$lambda$48(handleInvocationsFromAdViewer);
                        return invoke$lambda$48;
                    case 18:
                        invoke$lambda$4 = HandleInvocationsFromAdViewer.invoke$lambda$4(handleInvocationsFromAdViewer);
                        return invoke$lambda$4;
                    case 19:
                        invoke$lambda$5 = HandleInvocationsFromAdViewer.invoke$lambda$5(handleInvocationsFromAdViewer);
                        return invoke$lambda$5;
                    case 20:
                        invoke$lambda$16 = HandleInvocationsFromAdViewer.invoke$lambda$16(handleInvocationsFromAdViewer);
                        return invoke$lambda$16;
                    case 21:
                        invoke$lambda$17 = HandleInvocationsFromAdViewer.invoke$lambda$17(handleInvocationsFromAdViewer);
                        return invoke$lambda$17;
                    default:
                        invoke$lambda$18 = HandleInvocationsFromAdViewer.invoke$lambda$18(handleInvocationsFromAdViewer);
                        return invoke$lambda$18;
                }
            }
        }), new Pair(ExposedFunctionLocation.OPEN_URL, new m69(adObject, this)), new Pair(ExposedFunctionLocation.SET_ORIENTATION, new Function0() { // from class: n69
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                ExposedFunction updateTrackingToken;
                ExposedFunction opportunityTTL;
                ExposedFunction orientation;
                int i27 = i6;
                AdObject adObject2 = adObject;
                switch (i27) {
                    case 0:
                        updateTrackingToken = CommonAdViewerExposedFunctionsKt.updateTrackingToken(adObject2);
                        return updateTrackingToken;
                    case 1:
                        opportunityTTL = CommonAdViewerExposedFunctionsKt.setOpportunityTTL(adObject2);
                        return opportunityTTL;
                    default:
                        orientation = CommonAdViewerExposedFunctionsKt.setOrientation(adObject2);
                        return orientation;
                }
            }
        }), new Pair(ExposedFunctionLocation.SEND_OPERATIVE_EVENT, new m69(this, adObject, 15)), new Pair(ExposedFunctionLocation.STORAGE_WRITE, new j69(21)), new Pair(ExposedFunctionLocation.STORAGE_READ, new j69(16)), new Pair(ExposedFunctionLocation.STORAGE_DELETE, new j69(17)), new Pair(ExposedFunctionLocation.STORAGE_CLEAR, new j69(i5)), new Pair(ExposedFunctionLocation.STORAGE_GET_KEYS, new j69(20)), new Pair(ExposedFunctionLocation.STORAGE_GET, new j69(22)), new Pair(ExposedFunctionLocation.STORAGE_SET, new j69(23)), new Pair(ExposedFunctionLocation.GET_PRIVACY_FSM, new Function0(this) { // from class: l69
            public final /* synthetic */ HandleInvocationsFromAdViewer b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                ExposedFunction invoke$lambda$19;
                ExposedFunction invoke$lambda$1;
                ExposedFunction invoke$lambda$20;
                ExposedFunction invoke$lambda$21;
                ExposedFunction invoke$lambda$22;
                ExposedFunction invoke$lambda$27;
                ExposedFunction invoke$lambda$29;
                ExposedFunction invoke$lambda$2;
                ExposedFunction invoke$lambda$32;
                ExposedFunction invoke$lambda$36;
                ExposedFunction invoke$lambda$37;
                ExposedFunction invoke$lambda$3;
                ExposedFunction invoke$lambda$41;
                ExposedFunction invoke$lambda$42;
                ExposedFunction invoke$lambda$45;
                ExposedFunction invoke$lambda$46;
                ExposedFunction invoke$lambda$47;
                ExposedFunction invoke$lambda$48;
                ExposedFunction invoke$lambda$4;
                ExposedFunction invoke$lambda$5;
                ExposedFunction invoke$lambda$16;
                ExposedFunction invoke$lambda$17;
                ExposedFunction invoke$lambda$18;
                int i27 = i7;
                HandleInvocationsFromAdViewer handleInvocationsFromAdViewer = this.b;
                switch (i27) {
                    case 0:
                        invoke$lambda$19 = HandleInvocationsFromAdViewer.invoke$lambda$19(handleInvocationsFromAdViewer);
                        return invoke$lambda$19;
                    case 1:
                        invoke$lambda$1 = HandleInvocationsFromAdViewer.invoke$lambda$1(handleInvocationsFromAdViewer);
                        return invoke$lambda$1;
                    case 2:
                        invoke$lambda$20 = HandleInvocationsFromAdViewer.invoke$lambda$20(handleInvocationsFromAdViewer);
                        return invoke$lambda$20;
                    case 3:
                        invoke$lambda$21 = HandleInvocationsFromAdViewer.invoke$lambda$21(handleInvocationsFromAdViewer);
                        return invoke$lambda$21;
                    case 4:
                        invoke$lambda$22 = HandleInvocationsFromAdViewer.invoke$lambda$22(handleInvocationsFromAdViewer);
                        return invoke$lambda$22;
                    case 5:
                        invoke$lambda$27 = HandleInvocationsFromAdViewer.invoke$lambda$27(handleInvocationsFromAdViewer);
                        return invoke$lambda$27;
                    case 6:
                        invoke$lambda$29 = HandleInvocationsFromAdViewer.invoke$lambda$29(handleInvocationsFromAdViewer);
                        return invoke$lambda$29;
                    case 7:
                        invoke$lambda$2 = HandleInvocationsFromAdViewer.invoke$lambda$2(handleInvocationsFromAdViewer);
                        return invoke$lambda$2;
                    case 8:
                        invoke$lambda$32 = HandleInvocationsFromAdViewer.invoke$lambda$32(handleInvocationsFromAdViewer);
                        return invoke$lambda$32;
                    case 9:
                        invoke$lambda$36 = HandleInvocationsFromAdViewer.invoke$lambda$36(handleInvocationsFromAdViewer);
                        return invoke$lambda$36;
                    case 10:
                        invoke$lambda$37 = HandleInvocationsFromAdViewer.invoke$lambda$37(handleInvocationsFromAdViewer);
                        return invoke$lambda$37;
                    case 11:
                        invoke$lambda$3 = HandleInvocationsFromAdViewer.invoke$lambda$3(handleInvocationsFromAdViewer);
                        return invoke$lambda$3;
                    case 12:
                        invoke$lambda$41 = HandleInvocationsFromAdViewer.invoke$lambda$41(handleInvocationsFromAdViewer);
                        return invoke$lambda$41;
                    case 13:
                        invoke$lambda$42 = HandleInvocationsFromAdViewer.invoke$lambda$42(handleInvocationsFromAdViewer);
                        return invoke$lambda$42;
                    case 14:
                        invoke$lambda$45 = HandleInvocationsFromAdViewer.invoke$lambda$45(handleInvocationsFromAdViewer);
                        return invoke$lambda$45;
                    case 15:
                        invoke$lambda$46 = HandleInvocationsFromAdViewer.invoke$lambda$46(handleInvocationsFromAdViewer);
                        return invoke$lambda$46;
                    case 16:
                        invoke$lambda$47 = HandleInvocationsFromAdViewer.invoke$lambda$47(handleInvocationsFromAdViewer);
                        return invoke$lambda$47;
                    case 17:
                        invoke$lambda$48 = HandleInvocationsFromAdViewer.invoke$lambda$48(handleInvocationsFromAdViewer);
                        return invoke$lambda$48;
                    case 18:
                        invoke$lambda$4 = HandleInvocationsFromAdViewer.invoke$lambda$4(handleInvocationsFromAdViewer);
                        return invoke$lambda$4;
                    case 19:
                        invoke$lambda$5 = HandleInvocationsFromAdViewer.invoke$lambda$5(handleInvocationsFromAdViewer);
                        return invoke$lambda$5;
                    case 20:
                        invoke$lambda$16 = HandleInvocationsFromAdViewer.invoke$lambda$16(handleInvocationsFromAdViewer);
                        return invoke$lambda$16;
                    case 21:
                        invoke$lambda$17 = HandleInvocationsFromAdViewer.invoke$lambda$17(handleInvocationsFromAdViewer);
                        return invoke$lambda$17;
                    default:
                        invoke$lambda$18 = HandleInvocationsFromAdViewer.invoke$lambda$18(handleInvocationsFromAdViewer);
                        return invoke$lambda$18;
                }
            }
        }), new Pair(ExposedFunctionLocation.SET_PRIVACY_FSM, new Function0(this) { // from class: l69
            public final /* synthetic */ HandleInvocationsFromAdViewer b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                ExposedFunction invoke$lambda$19;
                ExposedFunction invoke$lambda$1;
                ExposedFunction invoke$lambda$20;
                ExposedFunction invoke$lambda$21;
                ExposedFunction invoke$lambda$22;
                ExposedFunction invoke$lambda$27;
                ExposedFunction invoke$lambda$29;
                ExposedFunction invoke$lambda$2;
                ExposedFunction invoke$lambda$32;
                ExposedFunction invoke$lambda$36;
                ExposedFunction invoke$lambda$37;
                ExposedFunction invoke$lambda$3;
                ExposedFunction invoke$lambda$41;
                ExposedFunction invoke$lambda$42;
                ExposedFunction invoke$lambda$45;
                ExposedFunction invoke$lambda$46;
                ExposedFunction invoke$lambda$47;
                ExposedFunction invoke$lambda$48;
                ExposedFunction invoke$lambda$4;
                ExposedFunction invoke$lambda$5;
                ExposedFunction invoke$lambda$16;
                ExposedFunction invoke$lambda$17;
                ExposedFunction invoke$lambda$18;
                int i27 = i8;
                HandleInvocationsFromAdViewer handleInvocationsFromAdViewer = this.b;
                switch (i27) {
                    case 0:
                        invoke$lambda$19 = HandleInvocationsFromAdViewer.invoke$lambda$19(handleInvocationsFromAdViewer);
                        return invoke$lambda$19;
                    case 1:
                        invoke$lambda$1 = HandleInvocationsFromAdViewer.invoke$lambda$1(handleInvocationsFromAdViewer);
                        return invoke$lambda$1;
                    case 2:
                        invoke$lambda$20 = HandleInvocationsFromAdViewer.invoke$lambda$20(handleInvocationsFromAdViewer);
                        return invoke$lambda$20;
                    case 3:
                        invoke$lambda$21 = HandleInvocationsFromAdViewer.invoke$lambda$21(handleInvocationsFromAdViewer);
                        return invoke$lambda$21;
                    case 4:
                        invoke$lambda$22 = HandleInvocationsFromAdViewer.invoke$lambda$22(handleInvocationsFromAdViewer);
                        return invoke$lambda$22;
                    case 5:
                        invoke$lambda$27 = HandleInvocationsFromAdViewer.invoke$lambda$27(handleInvocationsFromAdViewer);
                        return invoke$lambda$27;
                    case 6:
                        invoke$lambda$29 = HandleInvocationsFromAdViewer.invoke$lambda$29(handleInvocationsFromAdViewer);
                        return invoke$lambda$29;
                    case 7:
                        invoke$lambda$2 = HandleInvocationsFromAdViewer.invoke$lambda$2(handleInvocationsFromAdViewer);
                        return invoke$lambda$2;
                    case 8:
                        invoke$lambda$32 = HandleInvocationsFromAdViewer.invoke$lambda$32(handleInvocationsFromAdViewer);
                        return invoke$lambda$32;
                    case 9:
                        invoke$lambda$36 = HandleInvocationsFromAdViewer.invoke$lambda$36(handleInvocationsFromAdViewer);
                        return invoke$lambda$36;
                    case 10:
                        invoke$lambda$37 = HandleInvocationsFromAdViewer.invoke$lambda$37(handleInvocationsFromAdViewer);
                        return invoke$lambda$37;
                    case 11:
                        invoke$lambda$3 = HandleInvocationsFromAdViewer.invoke$lambda$3(handleInvocationsFromAdViewer);
                        return invoke$lambda$3;
                    case 12:
                        invoke$lambda$41 = HandleInvocationsFromAdViewer.invoke$lambda$41(handleInvocationsFromAdViewer);
                        return invoke$lambda$41;
                    case 13:
                        invoke$lambda$42 = HandleInvocationsFromAdViewer.invoke$lambda$42(handleInvocationsFromAdViewer);
                        return invoke$lambda$42;
                    case 14:
                        invoke$lambda$45 = HandleInvocationsFromAdViewer.invoke$lambda$45(handleInvocationsFromAdViewer);
                        return invoke$lambda$45;
                    case 15:
                        invoke$lambda$46 = HandleInvocationsFromAdViewer.invoke$lambda$46(handleInvocationsFromAdViewer);
                        return invoke$lambda$46;
                    case 16:
                        invoke$lambda$47 = HandleInvocationsFromAdViewer.invoke$lambda$47(handleInvocationsFromAdViewer);
                        return invoke$lambda$47;
                    case 17:
                        invoke$lambda$48 = HandleInvocationsFromAdViewer.invoke$lambda$48(handleInvocationsFromAdViewer);
                        return invoke$lambda$48;
                    case 18:
                        invoke$lambda$4 = HandleInvocationsFromAdViewer.invoke$lambda$4(handleInvocationsFromAdViewer);
                        return invoke$lambda$4;
                    case 19:
                        invoke$lambda$5 = HandleInvocationsFromAdViewer.invoke$lambda$5(handleInvocationsFromAdViewer);
                        return invoke$lambda$5;
                    case 20:
                        invoke$lambda$16 = HandleInvocationsFromAdViewer.invoke$lambda$16(handleInvocationsFromAdViewer);
                        return invoke$lambda$16;
                    case 21:
                        invoke$lambda$17 = HandleInvocationsFromAdViewer.invoke$lambda$17(handleInvocationsFromAdViewer);
                        return invoke$lambda$17;
                    default:
                        invoke$lambda$18 = HandleInvocationsFromAdViewer.invoke$lambda$18(handleInvocationsFromAdViewer);
                        return invoke$lambda$18;
                }
            }
        }), new Pair(ExposedFunctionLocation.GET_PRIVACY, new Function0(this) { // from class: l69
            public final /* synthetic */ HandleInvocationsFromAdViewer b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                ExposedFunction invoke$lambda$19;
                ExposedFunction invoke$lambda$1;
                ExposedFunction invoke$lambda$20;
                ExposedFunction invoke$lambda$21;
                ExposedFunction invoke$lambda$22;
                ExposedFunction invoke$lambda$27;
                ExposedFunction invoke$lambda$29;
                ExposedFunction invoke$lambda$2;
                ExposedFunction invoke$lambda$32;
                ExposedFunction invoke$lambda$36;
                ExposedFunction invoke$lambda$37;
                ExposedFunction invoke$lambda$3;
                ExposedFunction invoke$lambda$41;
                ExposedFunction invoke$lambda$42;
                ExposedFunction invoke$lambda$45;
                ExposedFunction invoke$lambda$46;
                ExposedFunction invoke$lambda$47;
                ExposedFunction invoke$lambda$48;
                ExposedFunction invoke$lambda$4;
                ExposedFunction invoke$lambda$5;
                ExposedFunction invoke$lambda$16;
                ExposedFunction invoke$lambda$17;
                ExposedFunction invoke$lambda$18;
                int i27 = i9;
                HandleInvocationsFromAdViewer handleInvocationsFromAdViewer = this.b;
                switch (i27) {
                    case 0:
                        invoke$lambda$19 = HandleInvocationsFromAdViewer.invoke$lambda$19(handleInvocationsFromAdViewer);
                        return invoke$lambda$19;
                    case 1:
                        invoke$lambda$1 = HandleInvocationsFromAdViewer.invoke$lambda$1(handleInvocationsFromAdViewer);
                        return invoke$lambda$1;
                    case 2:
                        invoke$lambda$20 = HandleInvocationsFromAdViewer.invoke$lambda$20(handleInvocationsFromAdViewer);
                        return invoke$lambda$20;
                    case 3:
                        invoke$lambda$21 = HandleInvocationsFromAdViewer.invoke$lambda$21(handleInvocationsFromAdViewer);
                        return invoke$lambda$21;
                    case 4:
                        invoke$lambda$22 = HandleInvocationsFromAdViewer.invoke$lambda$22(handleInvocationsFromAdViewer);
                        return invoke$lambda$22;
                    case 5:
                        invoke$lambda$27 = HandleInvocationsFromAdViewer.invoke$lambda$27(handleInvocationsFromAdViewer);
                        return invoke$lambda$27;
                    case 6:
                        invoke$lambda$29 = HandleInvocationsFromAdViewer.invoke$lambda$29(handleInvocationsFromAdViewer);
                        return invoke$lambda$29;
                    case 7:
                        invoke$lambda$2 = HandleInvocationsFromAdViewer.invoke$lambda$2(handleInvocationsFromAdViewer);
                        return invoke$lambda$2;
                    case 8:
                        invoke$lambda$32 = HandleInvocationsFromAdViewer.invoke$lambda$32(handleInvocationsFromAdViewer);
                        return invoke$lambda$32;
                    case 9:
                        invoke$lambda$36 = HandleInvocationsFromAdViewer.invoke$lambda$36(handleInvocationsFromAdViewer);
                        return invoke$lambda$36;
                    case 10:
                        invoke$lambda$37 = HandleInvocationsFromAdViewer.invoke$lambda$37(handleInvocationsFromAdViewer);
                        return invoke$lambda$37;
                    case 11:
                        invoke$lambda$3 = HandleInvocationsFromAdViewer.invoke$lambda$3(handleInvocationsFromAdViewer);
                        return invoke$lambda$3;
                    case 12:
                        invoke$lambda$41 = HandleInvocationsFromAdViewer.invoke$lambda$41(handleInvocationsFromAdViewer);
                        return invoke$lambda$41;
                    case 13:
                        invoke$lambda$42 = HandleInvocationsFromAdViewer.invoke$lambda$42(handleInvocationsFromAdViewer);
                        return invoke$lambda$42;
                    case 14:
                        invoke$lambda$45 = HandleInvocationsFromAdViewer.invoke$lambda$45(handleInvocationsFromAdViewer);
                        return invoke$lambda$45;
                    case 15:
                        invoke$lambda$46 = HandleInvocationsFromAdViewer.invoke$lambda$46(handleInvocationsFromAdViewer);
                        return invoke$lambda$46;
                    case 16:
                        invoke$lambda$47 = HandleInvocationsFromAdViewer.invoke$lambda$47(handleInvocationsFromAdViewer);
                        return invoke$lambda$47;
                    case 17:
                        invoke$lambda$48 = HandleInvocationsFromAdViewer.invoke$lambda$48(handleInvocationsFromAdViewer);
                        return invoke$lambda$48;
                    case 18:
                        invoke$lambda$4 = HandleInvocationsFromAdViewer.invoke$lambda$4(handleInvocationsFromAdViewer);
                        return invoke$lambda$4;
                    case 19:
                        invoke$lambda$5 = HandleInvocationsFromAdViewer.invoke$lambda$5(handleInvocationsFromAdViewer);
                        return invoke$lambda$5;
                    case 20:
                        invoke$lambda$16 = HandleInvocationsFromAdViewer.invoke$lambda$16(handleInvocationsFromAdViewer);
                        return invoke$lambda$16;
                    case 21:
                        invoke$lambda$17 = HandleInvocationsFromAdViewer.invoke$lambda$17(handleInvocationsFromAdViewer);
                        return invoke$lambda$17;
                    default:
                        invoke$lambda$18 = HandleInvocationsFromAdViewer.invoke$lambda$18(handleInvocationsFromAdViewer);
                        return invoke$lambda$18;
                }
            }
        }), new Pair(ExposedFunctionLocation.SET_PRIVACY, new Function0(this) { // from class: l69
            public final /* synthetic */ HandleInvocationsFromAdViewer b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                ExposedFunction invoke$lambda$19;
                ExposedFunction invoke$lambda$1;
                ExposedFunction invoke$lambda$20;
                ExposedFunction invoke$lambda$21;
                ExposedFunction invoke$lambda$22;
                ExposedFunction invoke$lambda$27;
                ExposedFunction invoke$lambda$29;
                ExposedFunction invoke$lambda$2;
                ExposedFunction invoke$lambda$32;
                ExposedFunction invoke$lambda$36;
                ExposedFunction invoke$lambda$37;
                ExposedFunction invoke$lambda$3;
                ExposedFunction invoke$lambda$41;
                ExposedFunction invoke$lambda$42;
                ExposedFunction invoke$lambda$45;
                ExposedFunction invoke$lambda$46;
                ExposedFunction invoke$lambda$47;
                ExposedFunction invoke$lambda$48;
                ExposedFunction invoke$lambda$4;
                ExposedFunction invoke$lambda$5;
                ExposedFunction invoke$lambda$16;
                ExposedFunction invoke$lambda$17;
                ExposedFunction invoke$lambda$18;
                int i27 = i10;
                HandleInvocationsFromAdViewer handleInvocationsFromAdViewer = this.b;
                switch (i27) {
                    case 0:
                        invoke$lambda$19 = HandleInvocationsFromAdViewer.invoke$lambda$19(handleInvocationsFromAdViewer);
                        return invoke$lambda$19;
                    case 1:
                        invoke$lambda$1 = HandleInvocationsFromAdViewer.invoke$lambda$1(handleInvocationsFromAdViewer);
                        return invoke$lambda$1;
                    case 2:
                        invoke$lambda$20 = HandleInvocationsFromAdViewer.invoke$lambda$20(handleInvocationsFromAdViewer);
                        return invoke$lambda$20;
                    case 3:
                        invoke$lambda$21 = HandleInvocationsFromAdViewer.invoke$lambda$21(handleInvocationsFromAdViewer);
                        return invoke$lambda$21;
                    case 4:
                        invoke$lambda$22 = HandleInvocationsFromAdViewer.invoke$lambda$22(handleInvocationsFromAdViewer);
                        return invoke$lambda$22;
                    case 5:
                        invoke$lambda$27 = HandleInvocationsFromAdViewer.invoke$lambda$27(handleInvocationsFromAdViewer);
                        return invoke$lambda$27;
                    case 6:
                        invoke$lambda$29 = HandleInvocationsFromAdViewer.invoke$lambda$29(handleInvocationsFromAdViewer);
                        return invoke$lambda$29;
                    case 7:
                        invoke$lambda$2 = HandleInvocationsFromAdViewer.invoke$lambda$2(handleInvocationsFromAdViewer);
                        return invoke$lambda$2;
                    case 8:
                        invoke$lambda$32 = HandleInvocationsFromAdViewer.invoke$lambda$32(handleInvocationsFromAdViewer);
                        return invoke$lambda$32;
                    case 9:
                        invoke$lambda$36 = HandleInvocationsFromAdViewer.invoke$lambda$36(handleInvocationsFromAdViewer);
                        return invoke$lambda$36;
                    case 10:
                        invoke$lambda$37 = HandleInvocationsFromAdViewer.invoke$lambda$37(handleInvocationsFromAdViewer);
                        return invoke$lambda$37;
                    case 11:
                        invoke$lambda$3 = HandleInvocationsFromAdViewer.invoke$lambda$3(handleInvocationsFromAdViewer);
                        return invoke$lambda$3;
                    case 12:
                        invoke$lambda$41 = HandleInvocationsFromAdViewer.invoke$lambda$41(handleInvocationsFromAdViewer);
                        return invoke$lambda$41;
                    case 13:
                        invoke$lambda$42 = HandleInvocationsFromAdViewer.invoke$lambda$42(handleInvocationsFromAdViewer);
                        return invoke$lambda$42;
                    case 14:
                        invoke$lambda$45 = HandleInvocationsFromAdViewer.invoke$lambda$45(handleInvocationsFromAdViewer);
                        return invoke$lambda$45;
                    case 15:
                        invoke$lambda$46 = HandleInvocationsFromAdViewer.invoke$lambda$46(handleInvocationsFromAdViewer);
                        return invoke$lambda$46;
                    case 16:
                        invoke$lambda$47 = HandleInvocationsFromAdViewer.invoke$lambda$47(handleInvocationsFromAdViewer);
                        return invoke$lambda$47;
                    case 17:
                        invoke$lambda$48 = HandleInvocationsFromAdViewer.invoke$lambda$48(handleInvocationsFromAdViewer);
                        return invoke$lambda$48;
                    case 18:
                        invoke$lambda$4 = HandleInvocationsFromAdViewer.invoke$lambda$4(handleInvocationsFromAdViewer);
                        return invoke$lambda$4;
                    case 19:
                        invoke$lambda$5 = HandleInvocationsFromAdViewer.invoke$lambda$5(handleInvocationsFromAdViewer);
                        return invoke$lambda$5;
                    case 20:
                        invoke$lambda$16 = HandleInvocationsFromAdViewer.invoke$lambda$16(handleInvocationsFromAdViewer);
                        return invoke$lambda$16;
                    case 21:
                        invoke$lambda$17 = HandleInvocationsFromAdViewer.invoke$lambda$17(handleInvocationsFromAdViewer);
                        return invoke$lambda$17;
                    default:
                        invoke$lambda$18 = HandleInvocationsFromAdViewer.invoke$lambda$18(handleInvocationsFromAdViewer);
                        return invoke$lambda$18;
                }
            }
        }), new Pair(ExposedFunctionLocation.GET_ALLOWED_PII, new Function0(this) { // from class: l69
            public final /* synthetic */ HandleInvocationsFromAdViewer b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                ExposedFunction invoke$lambda$19;
                ExposedFunction invoke$lambda$1;
                ExposedFunction invoke$lambda$20;
                ExposedFunction invoke$lambda$21;
                ExposedFunction invoke$lambda$22;
                ExposedFunction invoke$lambda$27;
                ExposedFunction invoke$lambda$29;
                ExposedFunction invoke$lambda$2;
                ExposedFunction invoke$lambda$32;
                ExposedFunction invoke$lambda$36;
                ExposedFunction invoke$lambda$37;
                ExposedFunction invoke$lambda$3;
                ExposedFunction invoke$lambda$41;
                ExposedFunction invoke$lambda$42;
                ExposedFunction invoke$lambda$45;
                ExposedFunction invoke$lambda$46;
                ExposedFunction invoke$lambda$47;
                ExposedFunction invoke$lambda$48;
                ExposedFunction invoke$lambda$4;
                ExposedFunction invoke$lambda$5;
                ExposedFunction invoke$lambda$16;
                ExposedFunction invoke$lambda$17;
                ExposedFunction invoke$lambda$18;
                int i27 = i11;
                HandleInvocationsFromAdViewer handleInvocationsFromAdViewer = this.b;
                switch (i27) {
                    case 0:
                        invoke$lambda$19 = HandleInvocationsFromAdViewer.invoke$lambda$19(handleInvocationsFromAdViewer);
                        return invoke$lambda$19;
                    case 1:
                        invoke$lambda$1 = HandleInvocationsFromAdViewer.invoke$lambda$1(handleInvocationsFromAdViewer);
                        return invoke$lambda$1;
                    case 2:
                        invoke$lambda$20 = HandleInvocationsFromAdViewer.invoke$lambda$20(handleInvocationsFromAdViewer);
                        return invoke$lambda$20;
                    case 3:
                        invoke$lambda$21 = HandleInvocationsFromAdViewer.invoke$lambda$21(handleInvocationsFromAdViewer);
                        return invoke$lambda$21;
                    case 4:
                        invoke$lambda$22 = HandleInvocationsFromAdViewer.invoke$lambda$22(handleInvocationsFromAdViewer);
                        return invoke$lambda$22;
                    case 5:
                        invoke$lambda$27 = HandleInvocationsFromAdViewer.invoke$lambda$27(handleInvocationsFromAdViewer);
                        return invoke$lambda$27;
                    case 6:
                        invoke$lambda$29 = HandleInvocationsFromAdViewer.invoke$lambda$29(handleInvocationsFromAdViewer);
                        return invoke$lambda$29;
                    case 7:
                        invoke$lambda$2 = HandleInvocationsFromAdViewer.invoke$lambda$2(handleInvocationsFromAdViewer);
                        return invoke$lambda$2;
                    case 8:
                        invoke$lambda$32 = HandleInvocationsFromAdViewer.invoke$lambda$32(handleInvocationsFromAdViewer);
                        return invoke$lambda$32;
                    case 9:
                        invoke$lambda$36 = HandleInvocationsFromAdViewer.invoke$lambda$36(handleInvocationsFromAdViewer);
                        return invoke$lambda$36;
                    case 10:
                        invoke$lambda$37 = HandleInvocationsFromAdViewer.invoke$lambda$37(handleInvocationsFromAdViewer);
                        return invoke$lambda$37;
                    case 11:
                        invoke$lambda$3 = HandleInvocationsFromAdViewer.invoke$lambda$3(handleInvocationsFromAdViewer);
                        return invoke$lambda$3;
                    case 12:
                        invoke$lambda$41 = HandleInvocationsFromAdViewer.invoke$lambda$41(handleInvocationsFromAdViewer);
                        return invoke$lambda$41;
                    case 13:
                        invoke$lambda$42 = HandleInvocationsFromAdViewer.invoke$lambda$42(handleInvocationsFromAdViewer);
                        return invoke$lambda$42;
                    case 14:
                        invoke$lambda$45 = HandleInvocationsFromAdViewer.invoke$lambda$45(handleInvocationsFromAdViewer);
                        return invoke$lambda$45;
                    case 15:
                        invoke$lambda$46 = HandleInvocationsFromAdViewer.invoke$lambda$46(handleInvocationsFromAdViewer);
                        return invoke$lambda$46;
                    case 16:
                        invoke$lambda$47 = HandleInvocationsFromAdViewer.invoke$lambda$47(handleInvocationsFromAdViewer);
                        return invoke$lambda$47;
                    case 17:
                        invoke$lambda$48 = HandleInvocationsFromAdViewer.invoke$lambda$48(handleInvocationsFromAdViewer);
                        return invoke$lambda$48;
                    case 18:
                        invoke$lambda$4 = HandleInvocationsFromAdViewer.invoke$lambda$4(handleInvocationsFromAdViewer);
                        return invoke$lambda$4;
                    case 19:
                        invoke$lambda$5 = HandleInvocationsFromAdViewer.invoke$lambda$5(handleInvocationsFromAdViewer);
                        return invoke$lambda$5;
                    case 20:
                        invoke$lambda$16 = HandleInvocationsFromAdViewer.invoke$lambda$16(handleInvocationsFromAdViewer);
                        return invoke$lambda$16;
                    case 21:
                        invoke$lambda$17 = HandleInvocationsFromAdViewer.invoke$lambda$17(handleInvocationsFromAdViewer);
                        return invoke$lambda$17;
                    default:
                        invoke$lambda$18 = HandleInvocationsFromAdViewer.invoke$lambda$18(handleInvocationsFromAdViewer);
                        return invoke$lambda$18;
                }
            }
        }), new Pair(ExposedFunctionLocation.SET_ALLOWED_PII, new Function0(this) { // from class: l69
            public final /* synthetic */ HandleInvocationsFromAdViewer b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                ExposedFunction invoke$lambda$19;
                ExposedFunction invoke$lambda$1;
                ExposedFunction invoke$lambda$20;
                ExposedFunction invoke$lambda$21;
                ExposedFunction invoke$lambda$22;
                ExposedFunction invoke$lambda$27;
                ExposedFunction invoke$lambda$29;
                ExposedFunction invoke$lambda$2;
                ExposedFunction invoke$lambda$32;
                ExposedFunction invoke$lambda$36;
                ExposedFunction invoke$lambda$37;
                ExposedFunction invoke$lambda$3;
                ExposedFunction invoke$lambda$41;
                ExposedFunction invoke$lambda$42;
                ExposedFunction invoke$lambda$45;
                ExposedFunction invoke$lambda$46;
                ExposedFunction invoke$lambda$47;
                ExposedFunction invoke$lambda$48;
                ExposedFunction invoke$lambda$4;
                ExposedFunction invoke$lambda$5;
                ExposedFunction invoke$lambda$16;
                ExposedFunction invoke$lambda$17;
                ExposedFunction invoke$lambda$18;
                int i27 = i12;
                HandleInvocationsFromAdViewer handleInvocationsFromAdViewer = this.b;
                switch (i27) {
                    case 0:
                        invoke$lambda$19 = HandleInvocationsFromAdViewer.invoke$lambda$19(handleInvocationsFromAdViewer);
                        return invoke$lambda$19;
                    case 1:
                        invoke$lambda$1 = HandleInvocationsFromAdViewer.invoke$lambda$1(handleInvocationsFromAdViewer);
                        return invoke$lambda$1;
                    case 2:
                        invoke$lambda$20 = HandleInvocationsFromAdViewer.invoke$lambda$20(handleInvocationsFromAdViewer);
                        return invoke$lambda$20;
                    case 3:
                        invoke$lambda$21 = HandleInvocationsFromAdViewer.invoke$lambda$21(handleInvocationsFromAdViewer);
                        return invoke$lambda$21;
                    case 4:
                        invoke$lambda$22 = HandleInvocationsFromAdViewer.invoke$lambda$22(handleInvocationsFromAdViewer);
                        return invoke$lambda$22;
                    case 5:
                        invoke$lambda$27 = HandleInvocationsFromAdViewer.invoke$lambda$27(handleInvocationsFromAdViewer);
                        return invoke$lambda$27;
                    case 6:
                        invoke$lambda$29 = HandleInvocationsFromAdViewer.invoke$lambda$29(handleInvocationsFromAdViewer);
                        return invoke$lambda$29;
                    case 7:
                        invoke$lambda$2 = HandleInvocationsFromAdViewer.invoke$lambda$2(handleInvocationsFromAdViewer);
                        return invoke$lambda$2;
                    case 8:
                        invoke$lambda$32 = HandleInvocationsFromAdViewer.invoke$lambda$32(handleInvocationsFromAdViewer);
                        return invoke$lambda$32;
                    case 9:
                        invoke$lambda$36 = HandleInvocationsFromAdViewer.invoke$lambda$36(handleInvocationsFromAdViewer);
                        return invoke$lambda$36;
                    case 10:
                        invoke$lambda$37 = HandleInvocationsFromAdViewer.invoke$lambda$37(handleInvocationsFromAdViewer);
                        return invoke$lambda$37;
                    case 11:
                        invoke$lambda$3 = HandleInvocationsFromAdViewer.invoke$lambda$3(handleInvocationsFromAdViewer);
                        return invoke$lambda$3;
                    case 12:
                        invoke$lambda$41 = HandleInvocationsFromAdViewer.invoke$lambda$41(handleInvocationsFromAdViewer);
                        return invoke$lambda$41;
                    case 13:
                        invoke$lambda$42 = HandleInvocationsFromAdViewer.invoke$lambda$42(handleInvocationsFromAdViewer);
                        return invoke$lambda$42;
                    case 14:
                        invoke$lambda$45 = HandleInvocationsFromAdViewer.invoke$lambda$45(handleInvocationsFromAdViewer);
                        return invoke$lambda$45;
                    case 15:
                        invoke$lambda$46 = HandleInvocationsFromAdViewer.invoke$lambda$46(handleInvocationsFromAdViewer);
                        return invoke$lambda$46;
                    case 16:
                        invoke$lambda$47 = HandleInvocationsFromAdViewer.invoke$lambda$47(handleInvocationsFromAdViewer);
                        return invoke$lambda$47;
                    case 17:
                        invoke$lambda$48 = HandleInvocationsFromAdViewer.invoke$lambda$48(handleInvocationsFromAdViewer);
                        return invoke$lambda$48;
                    case 18:
                        invoke$lambda$4 = HandleInvocationsFromAdViewer.invoke$lambda$4(handleInvocationsFromAdViewer);
                        return invoke$lambda$4;
                    case 19:
                        invoke$lambda$5 = HandleInvocationsFromAdViewer.invoke$lambda$5(handleInvocationsFromAdViewer);
                        return invoke$lambda$5;
                    case 20:
                        invoke$lambda$16 = HandleInvocationsFromAdViewer.invoke$lambda$16(handleInvocationsFromAdViewer);
                        return invoke$lambda$16;
                    case 21:
                        invoke$lambda$17 = HandleInvocationsFromAdViewer.invoke$lambda$17(handleInvocationsFromAdViewer);
                        return invoke$lambda$17;
                    default:
                        invoke$lambda$18 = HandleInvocationsFromAdViewer.invoke$lambda$18(handleInvocationsFromAdViewer);
                        return invoke$lambda$18;
                }
            }
        }), new Pair(ExposedFunctionLocation.GET_SESSION_TOKEN, new Function0(this) { // from class: l69
            public final /* synthetic */ HandleInvocationsFromAdViewer b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                ExposedFunction invoke$lambda$19;
                ExposedFunction invoke$lambda$1;
                ExposedFunction invoke$lambda$20;
                ExposedFunction invoke$lambda$21;
                ExposedFunction invoke$lambda$22;
                ExposedFunction invoke$lambda$27;
                ExposedFunction invoke$lambda$29;
                ExposedFunction invoke$lambda$2;
                ExposedFunction invoke$lambda$32;
                ExposedFunction invoke$lambda$36;
                ExposedFunction invoke$lambda$37;
                ExposedFunction invoke$lambda$3;
                ExposedFunction invoke$lambda$41;
                ExposedFunction invoke$lambda$42;
                ExposedFunction invoke$lambda$45;
                ExposedFunction invoke$lambda$46;
                ExposedFunction invoke$lambda$47;
                ExposedFunction invoke$lambda$48;
                ExposedFunction invoke$lambda$4;
                ExposedFunction invoke$lambda$5;
                ExposedFunction invoke$lambda$16;
                ExposedFunction invoke$lambda$17;
                ExposedFunction invoke$lambda$18;
                int i27 = i13;
                HandleInvocationsFromAdViewer handleInvocationsFromAdViewer = this.b;
                switch (i27) {
                    case 0:
                        invoke$lambda$19 = HandleInvocationsFromAdViewer.invoke$lambda$19(handleInvocationsFromAdViewer);
                        return invoke$lambda$19;
                    case 1:
                        invoke$lambda$1 = HandleInvocationsFromAdViewer.invoke$lambda$1(handleInvocationsFromAdViewer);
                        return invoke$lambda$1;
                    case 2:
                        invoke$lambda$20 = HandleInvocationsFromAdViewer.invoke$lambda$20(handleInvocationsFromAdViewer);
                        return invoke$lambda$20;
                    case 3:
                        invoke$lambda$21 = HandleInvocationsFromAdViewer.invoke$lambda$21(handleInvocationsFromAdViewer);
                        return invoke$lambda$21;
                    case 4:
                        invoke$lambda$22 = HandleInvocationsFromAdViewer.invoke$lambda$22(handleInvocationsFromAdViewer);
                        return invoke$lambda$22;
                    case 5:
                        invoke$lambda$27 = HandleInvocationsFromAdViewer.invoke$lambda$27(handleInvocationsFromAdViewer);
                        return invoke$lambda$27;
                    case 6:
                        invoke$lambda$29 = HandleInvocationsFromAdViewer.invoke$lambda$29(handleInvocationsFromAdViewer);
                        return invoke$lambda$29;
                    case 7:
                        invoke$lambda$2 = HandleInvocationsFromAdViewer.invoke$lambda$2(handleInvocationsFromAdViewer);
                        return invoke$lambda$2;
                    case 8:
                        invoke$lambda$32 = HandleInvocationsFromAdViewer.invoke$lambda$32(handleInvocationsFromAdViewer);
                        return invoke$lambda$32;
                    case 9:
                        invoke$lambda$36 = HandleInvocationsFromAdViewer.invoke$lambda$36(handleInvocationsFromAdViewer);
                        return invoke$lambda$36;
                    case 10:
                        invoke$lambda$37 = HandleInvocationsFromAdViewer.invoke$lambda$37(handleInvocationsFromAdViewer);
                        return invoke$lambda$37;
                    case 11:
                        invoke$lambda$3 = HandleInvocationsFromAdViewer.invoke$lambda$3(handleInvocationsFromAdViewer);
                        return invoke$lambda$3;
                    case 12:
                        invoke$lambda$41 = HandleInvocationsFromAdViewer.invoke$lambda$41(handleInvocationsFromAdViewer);
                        return invoke$lambda$41;
                    case 13:
                        invoke$lambda$42 = HandleInvocationsFromAdViewer.invoke$lambda$42(handleInvocationsFromAdViewer);
                        return invoke$lambda$42;
                    case 14:
                        invoke$lambda$45 = HandleInvocationsFromAdViewer.invoke$lambda$45(handleInvocationsFromAdViewer);
                        return invoke$lambda$45;
                    case 15:
                        invoke$lambda$46 = HandleInvocationsFromAdViewer.invoke$lambda$46(handleInvocationsFromAdViewer);
                        return invoke$lambda$46;
                    case 16:
                        invoke$lambda$47 = HandleInvocationsFromAdViewer.invoke$lambda$47(handleInvocationsFromAdViewer);
                        return invoke$lambda$47;
                    case 17:
                        invoke$lambda$48 = HandleInvocationsFromAdViewer.invoke$lambda$48(handleInvocationsFromAdViewer);
                        return invoke$lambda$48;
                    case 18:
                        invoke$lambda$4 = HandleInvocationsFromAdViewer.invoke$lambda$4(handleInvocationsFromAdViewer);
                        return invoke$lambda$4;
                    case 19:
                        invoke$lambda$5 = HandleInvocationsFromAdViewer.invoke$lambda$5(handleInvocationsFromAdViewer);
                        return invoke$lambda$5;
                    case 20:
                        invoke$lambda$16 = HandleInvocationsFromAdViewer.invoke$lambda$16(handleInvocationsFromAdViewer);
                        return invoke$lambda$16;
                    case 21:
                        invoke$lambda$17 = HandleInvocationsFromAdViewer.invoke$lambda$17(handleInvocationsFromAdViewer);
                        return invoke$lambda$17;
                    default:
                        invoke$lambda$18 = HandleInvocationsFromAdViewer.invoke$lambda$18(handleInvocationsFromAdViewer);
                        return invoke$lambda$18;
                }
            }
        }), new Pair(ExposedFunctionLocation.MARK_CAMPAIGN_STATE_SHOWN, new m69(this, adObject, 0)), new Pair(ExposedFunctionLocation.REFRESH_AD_DATA, new m69(this, adObject, 1)), new Pair(ExposedFunctionLocation.UPDATE_CAMPAIGN_STATE, new m69(this, adObject, 2)), new Pair(ExposedFunctionLocation.UPDATE_TRACKING_TOKEN, new Function0() { // from class: n69
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                ExposedFunction updateTrackingToken;
                ExposedFunction opportunityTTL;
                ExposedFunction orientation;
                int i27 = i14;
                AdObject adObject2 = adObject;
                switch (i27) {
                    case 0:
                        updateTrackingToken = CommonAdViewerExposedFunctionsKt.updateTrackingToken(adObject2);
                        return updateTrackingToken;
                    case 1:
                        opportunityTTL = CommonAdViewerExposedFunctionsKt.setOpportunityTTL(adObject2);
                        return opportunityTTL;
                    default:
                        orientation = CommonAdViewerExposedFunctionsKt.setOrientation(adObject2);
                        return orientation;
                }
            }
        }), new Pair(ExposedFunctionLocation.SEND_PRIVACY_UPDATE_REQUEST, new Function0(this) { // from class: l69
            public final /* synthetic */ HandleInvocationsFromAdViewer b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                ExposedFunction invoke$lambda$19;
                ExposedFunction invoke$lambda$1;
                ExposedFunction invoke$lambda$20;
                ExposedFunction invoke$lambda$21;
                ExposedFunction invoke$lambda$22;
                ExposedFunction invoke$lambda$27;
                ExposedFunction invoke$lambda$29;
                ExposedFunction invoke$lambda$2;
                ExposedFunction invoke$lambda$32;
                ExposedFunction invoke$lambda$36;
                ExposedFunction invoke$lambda$37;
                ExposedFunction invoke$lambda$3;
                ExposedFunction invoke$lambda$41;
                ExposedFunction invoke$lambda$42;
                ExposedFunction invoke$lambda$45;
                ExposedFunction invoke$lambda$46;
                ExposedFunction invoke$lambda$47;
                ExposedFunction invoke$lambda$48;
                ExposedFunction invoke$lambda$4;
                ExposedFunction invoke$lambda$5;
                ExposedFunction invoke$lambda$16;
                ExposedFunction invoke$lambda$17;
                ExposedFunction invoke$lambda$18;
                int i27 = i15;
                HandleInvocationsFromAdViewer handleInvocationsFromAdViewer = this.b;
                switch (i27) {
                    case 0:
                        invoke$lambda$19 = HandleInvocationsFromAdViewer.invoke$lambda$19(handleInvocationsFromAdViewer);
                        return invoke$lambda$19;
                    case 1:
                        invoke$lambda$1 = HandleInvocationsFromAdViewer.invoke$lambda$1(handleInvocationsFromAdViewer);
                        return invoke$lambda$1;
                    case 2:
                        invoke$lambda$20 = HandleInvocationsFromAdViewer.invoke$lambda$20(handleInvocationsFromAdViewer);
                        return invoke$lambda$20;
                    case 3:
                        invoke$lambda$21 = HandleInvocationsFromAdViewer.invoke$lambda$21(handleInvocationsFromAdViewer);
                        return invoke$lambda$21;
                    case 4:
                        invoke$lambda$22 = HandleInvocationsFromAdViewer.invoke$lambda$22(handleInvocationsFromAdViewer);
                        return invoke$lambda$22;
                    case 5:
                        invoke$lambda$27 = HandleInvocationsFromAdViewer.invoke$lambda$27(handleInvocationsFromAdViewer);
                        return invoke$lambda$27;
                    case 6:
                        invoke$lambda$29 = HandleInvocationsFromAdViewer.invoke$lambda$29(handleInvocationsFromAdViewer);
                        return invoke$lambda$29;
                    case 7:
                        invoke$lambda$2 = HandleInvocationsFromAdViewer.invoke$lambda$2(handleInvocationsFromAdViewer);
                        return invoke$lambda$2;
                    case 8:
                        invoke$lambda$32 = HandleInvocationsFromAdViewer.invoke$lambda$32(handleInvocationsFromAdViewer);
                        return invoke$lambda$32;
                    case 9:
                        invoke$lambda$36 = HandleInvocationsFromAdViewer.invoke$lambda$36(handleInvocationsFromAdViewer);
                        return invoke$lambda$36;
                    case 10:
                        invoke$lambda$37 = HandleInvocationsFromAdViewer.invoke$lambda$37(handleInvocationsFromAdViewer);
                        return invoke$lambda$37;
                    case 11:
                        invoke$lambda$3 = HandleInvocationsFromAdViewer.invoke$lambda$3(handleInvocationsFromAdViewer);
                        return invoke$lambda$3;
                    case 12:
                        invoke$lambda$41 = HandleInvocationsFromAdViewer.invoke$lambda$41(handleInvocationsFromAdViewer);
                        return invoke$lambda$41;
                    case 13:
                        invoke$lambda$42 = HandleInvocationsFromAdViewer.invoke$lambda$42(handleInvocationsFromAdViewer);
                        return invoke$lambda$42;
                    case 14:
                        invoke$lambda$45 = HandleInvocationsFromAdViewer.invoke$lambda$45(handleInvocationsFromAdViewer);
                        return invoke$lambda$45;
                    case 15:
                        invoke$lambda$46 = HandleInvocationsFromAdViewer.invoke$lambda$46(handleInvocationsFromAdViewer);
                        return invoke$lambda$46;
                    case 16:
                        invoke$lambda$47 = HandleInvocationsFromAdViewer.invoke$lambda$47(handleInvocationsFromAdViewer);
                        return invoke$lambda$47;
                    case 17:
                        invoke$lambda$48 = HandleInvocationsFromAdViewer.invoke$lambda$48(handleInvocationsFromAdViewer);
                        return invoke$lambda$48;
                    case 18:
                        invoke$lambda$4 = HandleInvocationsFromAdViewer.invoke$lambda$4(handleInvocationsFromAdViewer);
                        return invoke$lambda$4;
                    case 19:
                        invoke$lambda$5 = HandleInvocationsFromAdViewer.invoke$lambda$5(handleInvocationsFromAdViewer);
                        return invoke$lambda$5;
                    case 20:
                        invoke$lambda$16 = HandleInvocationsFromAdViewer.invoke$lambda$16(handleInvocationsFromAdViewer);
                        return invoke$lambda$16;
                    case 21:
                        invoke$lambda$17 = HandleInvocationsFromAdViewer.invoke$lambda$17(handleInvocationsFromAdViewer);
                        return invoke$lambda$17;
                    default:
                        invoke$lambda$18 = HandleInvocationsFromAdViewer.invoke$lambda$18(handleInvocationsFromAdViewer);
                        return invoke$lambda$18;
                }
            }
        }), new Pair(ExposedFunctionLocation.SEND_DIAGNOSTIC_EVENT, new m69(this, adObject, 3)), new Pair(ExposedFunctionLocation.INCREMENT_BANNER_IMPRESSION_COUNT, new Function0(this) { // from class: l69
            public final /* synthetic */ HandleInvocationsFromAdViewer b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                ExposedFunction invoke$lambda$19;
                ExposedFunction invoke$lambda$1;
                ExposedFunction invoke$lambda$20;
                ExposedFunction invoke$lambda$21;
                ExposedFunction invoke$lambda$22;
                ExposedFunction invoke$lambda$27;
                ExposedFunction invoke$lambda$29;
                ExposedFunction invoke$lambda$2;
                ExposedFunction invoke$lambda$32;
                ExposedFunction invoke$lambda$36;
                ExposedFunction invoke$lambda$37;
                ExposedFunction invoke$lambda$3;
                ExposedFunction invoke$lambda$41;
                ExposedFunction invoke$lambda$42;
                ExposedFunction invoke$lambda$45;
                ExposedFunction invoke$lambda$46;
                ExposedFunction invoke$lambda$47;
                ExposedFunction invoke$lambda$48;
                ExposedFunction invoke$lambda$4;
                ExposedFunction invoke$lambda$5;
                ExposedFunction invoke$lambda$16;
                ExposedFunction invoke$lambda$17;
                ExposedFunction invoke$lambda$18;
                int i27 = i16;
                HandleInvocationsFromAdViewer handleInvocationsFromAdViewer = this.b;
                switch (i27) {
                    case 0:
                        invoke$lambda$19 = HandleInvocationsFromAdViewer.invoke$lambda$19(handleInvocationsFromAdViewer);
                        return invoke$lambda$19;
                    case 1:
                        invoke$lambda$1 = HandleInvocationsFromAdViewer.invoke$lambda$1(handleInvocationsFromAdViewer);
                        return invoke$lambda$1;
                    case 2:
                        invoke$lambda$20 = HandleInvocationsFromAdViewer.invoke$lambda$20(handleInvocationsFromAdViewer);
                        return invoke$lambda$20;
                    case 3:
                        invoke$lambda$21 = HandleInvocationsFromAdViewer.invoke$lambda$21(handleInvocationsFromAdViewer);
                        return invoke$lambda$21;
                    case 4:
                        invoke$lambda$22 = HandleInvocationsFromAdViewer.invoke$lambda$22(handleInvocationsFromAdViewer);
                        return invoke$lambda$22;
                    case 5:
                        invoke$lambda$27 = HandleInvocationsFromAdViewer.invoke$lambda$27(handleInvocationsFromAdViewer);
                        return invoke$lambda$27;
                    case 6:
                        invoke$lambda$29 = HandleInvocationsFromAdViewer.invoke$lambda$29(handleInvocationsFromAdViewer);
                        return invoke$lambda$29;
                    case 7:
                        invoke$lambda$2 = HandleInvocationsFromAdViewer.invoke$lambda$2(handleInvocationsFromAdViewer);
                        return invoke$lambda$2;
                    case 8:
                        invoke$lambda$32 = HandleInvocationsFromAdViewer.invoke$lambda$32(handleInvocationsFromAdViewer);
                        return invoke$lambda$32;
                    case 9:
                        invoke$lambda$36 = HandleInvocationsFromAdViewer.invoke$lambda$36(handleInvocationsFromAdViewer);
                        return invoke$lambda$36;
                    case 10:
                        invoke$lambda$37 = HandleInvocationsFromAdViewer.invoke$lambda$37(handleInvocationsFromAdViewer);
                        return invoke$lambda$37;
                    case 11:
                        invoke$lambda$3 = HandleInvocationsFromAdViewer.invoke$lambda$3(handleInvocationsFromAdViewer);
                        return invoke$lambda$3;
                    case 12:
                        invoke$lambda$41 = HandleInvocationsFromAdViewer.invoke$lambda$41(handleInvocationsFromAdViewer);
                        return invoke$lambda$41;
                    case 13:
                        invoke$lambda$42 = HandleInvocationsFromAdViewer.invoke$lambda$42(handleInvocationsFromAdViewer);
                        return invoke$lambda$42;
                    case 14:
                        invoke$lambda$45 = HandleInvocationsFromAdViewer.invoke$lambda$45(handleInvocationsFromAdViewer);
                        return invoke$lambda$45;
                    case 15:
                        invoke$lambda$46 = HandleInvocationsFromAdViewer.invoke$lambda$46(handleInvocationsFromAdViewer);
                        return invoke$lambda$46;
                    case 16:
                        invoke$lambda$47 = HandleInvocationsFromAdViewer.invoke$lambda$47(handleInvocationsFromAdViewer);
                        return invoke$lambda$47;
                    case 17:
                        invoke$lambda$48 = HandleInvocationsFromAdViewer.invoke$lambda$48(handleInvocationsFromAdViewer);
                        return invoke$lambda$48;
                    case 18:
                        invoke$lambda$4 = HandleInvocationsFromAdViewer.invoke$lambda$4(handleInvocationsFromAdViewer);
                        return invoke$lambda$4;
                    case 19:
                        invoke$lambda$5 = HandleInvocationsFromAdViewer.invoke$lambda$5(handleInvocationsFromAdViewer);
                        return invoke$lambda$5;
                    case 20:
                        invoke$lambda$16 = HandleInvocationsFromAdViewer.invoke$lambda$16(handleInvocationsFromAdViewer);
                        return invoke$lambda$16;
                    case 21:
                        invoke$lambda$17 = HandleInvocationsFromAdViewer.invoke$lambda$17(handleInvocationsFromAdViewer);
                        return invoke$lambda$17;
                    default:
                        invoke$lambda$18 = HandleInvocationsFromAdViewer.invoke$lambda$18(handleInvocationsFromAdViewer);
                        return invoke$lambda$18;
                }
            }
        }), new Pair(ExposedFunctionLocation.DOWNLOAD, new m69(this, adObject, 4)), new Pair(ExposedFunctionLocation.DOWNLOAD_WITH_PROGRESS, new m69(this, adObject, 5)), new Pair(ExposedFunctionLocation.IS_FILE_CACHED, new Function0(this) { // from class: l69
            public final /* synthetic */ HandleInvocationsFromAdViewer b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                ExposedFunction invoke$lambda$19;
                ExposedFunction invoke$lambda$1;
                ExposedFunction invoke$lambda$20;
                ExposedFunction invoke$lambda$21;
                ExposedFunction invoke$lambda$22;
                ExposedFunction invoke$lambda$27;
                ExposedFunction invoke$lambda$29;
                ExposedFunction invoke$lambda$2;
                ExposedFunction invoke$lambda$32;
                ExposedFunction invoke$lambda$36;
                ExposedFunction invoke$lambda$37;
                ExposedFunction invoke$lambda$3;
                ExposedFunction invoke$lambda$41;
                ExposedFunction invoke$lambda$42;
                ExposedFunction invoke$lambda$45;
                ExposedFunction invoke$lambda$46;
                ExposedFunction invoke$lambda$47;
                ExposedFunction invoke$lambda$48;
                ExposedFunction invoke$lambda$4;
                ExposedFunction invoke$lambda$5;
                ExposedFunction invoke$lambda$16;
                ExposedFunction invoke$lambda$17;
                ExposedFunction invoke$lambda$18;
                int i27 = i17;
                HandleInvocationsFromAdViewer handleInvocationsFromAdViewer = this.b;
                switch (i27) {
                    case 0:
                        invoke$lambda$19 = HandleInvocationsFromAdViewer.invoke$lambda$19(handleInvocationsFromAdViewer);
                        return invoke$lambda$19;
                    case 1:
                        invoke$lambda$1 = HandleInvocationsFromAdViewer.invoke$lambda$1(handleInvocationsFromAdViewer);
                        return invoke$lambda$1;
                    case 2:
                        invoke$lambda$20 = HandleInvocationsFromAdViewer.invoke$lambda$20(handleInvocationsFromAdViewer);
                        return invoke$lambda$20;
                    case 3:
                        invoke$lambda$21 = HandleInvocationsFromAdViewer.invoke$lambda$21(handleInvocationsFromAdViewer);
                        return invoke$lambda$21;
                    case 4:
                        invoke$lambda$22 = HandleInvocationsFromAdViewer.invoke$lambda$22(handleInvocationsFromAdViewer);
                        return invoke$lambda$22;
                    case 5:
                        invoke$lambda$27 = HandleInvocationsFromAdViewer.invoke$lambda$27(handleInvocationsFromAdViewer);
                        return invoke$lambda$27;
                    case 6:
                        invoke$lambda$29 = HandleInvocationsFromAdViewer.invoke$lambda$29(handleInvocationsFromAdViewer);
                        return invoke$lambda$29;
                    case 7:
                        invoke$lambda$2 = HandleInvocationsFromAdViewer.invoke$lambda$2(handleInvocationsFromAdViewer);
                        return invoke$lambda$2;
                    case 8:
                        invoke$lambda$32 = HandleInvocationsFromAdViewer.invoke$lambda$32(handleInvocationsFromAdViewer);
                        return invoke$lambda$32;
                    case 9:
                        invoke$lambda$36 = HandleInvocationsFromAdViewer.invoke$lambda$36(handleInvocationsFromAdViewer);
                        return invoke$lambda$36;
                    case 10:
                        invoke$lambda$37 = HandleInvocationsFromAdViewer.invoke$lambda$37(handleInvocationsFromAdViewer);
                        return invoke$lambda$37;
                    case 11:
                        invoke$lambda$3 = HandleInvocationsFromAdViewer.invoke$lambda$3(handleInvocationsFromAdViewer);
                        return invoke$lambda$3;
                    case 12:
                        invoke$lambda$41 = HandleInvocationsFromAdViewer.invoke$lambda$41(handleInvocationsFromAdViewer);
                        return invoke$lambda$41;
                    case 13:
                        invoke$lambda$42 = HandleInvocationsFromAdViewer.invoke$lambda$42(handleInvocationsFromAdViewer);
                        return invoke$lambda$42;
                    case 14:
                        invoke$lambda$45 = HandleInvocationsFromAdViewer.invoke$lambda$45(handleInvocationsFromAdViewer);
                        return invoke$lambda$45;
                    case 15:
                        invoke$lambda$46 = HandleInvocationsFromAdViewer.invoke$lambda$46(handleInvocationsFromAdViewer);
                        return invoke$lambda$46;
                    case 16:
                        invoke$lambda$47 = HandleInvocationsFromAdViewer.invoke$lambda$47(handleInvocationsFromAdViewer);
                        return invoke$lambda$47;
                    case 17:
                        invoke$lambda$48 = HandleInvocationsFromAdViewer.invoke$lambda$48(handleInvocationsFromAdViewer);
                        return invoke$lambda$48;
                    case 18:
                        invoke$lambda$4 = HandleInvocationsFromAdViewer.invoke$lambda$4(handleInvocationsFromAdViewer);
                        return invoke$lambda$4;
                    case 19:
                        invoke$lambda$5 = HandleInvocationsFromAdViewer.invoke$lambda$5(handleInvocationsFromAdViewer);
                        return invoke$lambda$5;
                    case 20:
                        invoke$lambda$16 = HandleInvocationsFromAdViewer.invoke$lambda$16(handleInvocationsFromAdViewer);
                        return invoke$lambda$16;
                    case 21:
                        invoke$lambda$17 = HandleInvocationsFromAdViewer.invoke$lambda$17(handleInvocationsFromAdViewer);
                        return invoke$lambda$17;
                    default:
                        invoke$lambda$18 = HandleInvocationsFromAdViewer.invoke$lambda$18(handleInvocationsFromAdViewer);
                        return invoke$lambda$18;
                }
            }
        }), new Pair(ExposedFunctionLocation.OM_START_SESSION, new m69(this, adObject, 6)), new Pair(ExposedFunctionLocation.OM_FINISH_SESSION, new m69(this, adObject, 7)), new Pair(ExposedFunctionLocation.OM_IMPRESSION, new m69(this, adObject, 8)), new Pair(ExposedFunctionLocation.OM_GET_DATA, new Function0(this) { // from class: l69
            public final /* synthetic */ HandleInvocationsFromAdViewer b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                ExposedFunction invoke$lambda$19;
                ExposedFunction invoke$lambda$1;
                ExposedFunction invoke$lambda$20;
                ExposedFunction invoke$lambda$21;
                ExposedFunction invoke$lambda$22;
                ExposedFunction invoke$lambda$27;
                ExposedFunction invoke$lambda$29;
                ExposedFunction invoke$lambda$2;
                ExposedFunction invoke$lambda$32;
                ExposedFunction invoke$lambda$36;
                ExposedFunction invoke$lambda$37;
                ExposedFunction invoke$lambda$3;
                ExposedFunction invoke$lambda$41;
                ExposedFunction invoke$lambda$42;
                ExposedFunction invoke$lambda$45;
                ExposedFunction invoke$lambda$46;
                ExposedFunction invoke$lambda$47;
                ExposedFunction invoke$lambda$48;
                ExposedFunction invoke$lambda$4;
                ExposedFunction invoke$lambda$5;
                ExposedFunction invoke$lambda$16;
                ExposedFunction invoke$lambda$17;
                ExposedFunction invoke$lambda$18;
                int i27 = i18;
                HandleInvocationsFromAdViewer handleInvocationsFromAdViewer = this.b;
                switch (i27) {
                    case 0:
                        invoke$lambda$19 = HandleInvocationsFromAdViewer.invoke$lambda$19(handleInvocationsFromAdViewer);
                        return invoke$lambda$19;
                    case 1:
                        invoke$lambda$1 = HandleInvocationsFromAdViewer.invoke$lambda$1(handleInvocationsFromAdViewer);
                        return invoke$lambda$1;
                    case 2:
                        invoke$lambda$20 = HandleInvocationsFromAdViewer.invoke$lambda$20(handleInvocationsFromAdViewer);
                        return invoke$lambda$20;
                    case 3:
                        invoke$lambda$21 = HandleInvocationsFromAdViewer.invoke$lambda$21(handleInvocationsFromAdViewer);
                        return invoke$lambda$21;
                    case 4:
                        invoke$lambda$22 = HandleInvocationsFromAdViewer.invoke$lambda$22(handleInvocationsFromAdViewer);
                        return invoke$lambda$22;
                    case 5:
                        invoke$lambda$27 = HandleInvocationsFromAdViewer.invoke$lambda$27(handleInvocationsFromAdViewer);
                        return invoke$lambda$27;
                    case 6:
                        invoke$lambda$29 = HandleInvocationsFromAdViewer.invoke$lambda$29(handleInvocationsFromAdViewer);
                        return invoke$lambda$29;
                    case 7:
                        invoke$lambda$2 = HandleInvocationsFromAdViewer.invoke$lambda$2(handleInvocationsFromAdViewer);
                        return invoke$lambda$2;
                    case 8:
                        invoke$lambda$32 = HandleInvocationsFromAdViewer.invoke$lambda$32(handleInvocationsFromAdViewer);
                        return invoke$lambda$32;
                    case 9:
                        invoke$lambda$36 = HandleInvocationsFromAdViewer.invoke$lambda$36(handleInvocationsFromAdViewer);
                        return invoke$lambda$36;
                    case 10:
                        invoke$lambda$37 = HandleInvocationsFromAdViewer.invoke$lambda$37(handleInvocationsFromAdViewer);
                        return invoke$lambda$37;
                    case 11:
                        invoke$lambda$3 = HandleInvocationsFromAdViewer.invoke$lambda$3(handleInvocationsFromAdViewer);
                        return invoke$lambda$3;
                    case 12:
                        invoke$lambda$41 = HandleInvocationsFromAdViewer.invoke$lambda$41(handleInvocationsFromAdViewer);
                        return invoke$lambda$41;
                    case 13:
                        invoke$lambda$42 = HandleInvocationsFromAdViewer.invoke$lambda$42(handleInvocationsFromAdViewer);
                        return invoke$lambda$42;
                    case 14:
                        invoke$lambda$45 = HandleInvocationsFromAdViewer.invoke$lambda$45(handleInvocationsFromAdViewer);
                        return invoke$lambda$45;
                    case 15:
                        invoke$lambda$46 = HandleInvocationsFromAdViewer.invoke$lambda$46(handleInvocationsFromAdViewer);
                        return invoke$lambda$46;
                    case 16:
                        invoke$lambda$47 = HandleInvocationsFromAdViewer.invoke$lambda$47(handleInvocationsFromAdViewer);
                        return invoke$lambda$47;
                    case 17:
                        invoke$lambda$48 = HandleInvocationsFromAdViewer.invoke$lambda$48(handleInvocationsFromAdViewer);
                        return invoke$lambda$48;
                    case 18:
                        invoke$lambda$4 = HandleInvocationsFromAdViewer.invoke$lambda$4(handleInvocationsFromAdViewer);
                        return invoke$lambda$4;
                    case 19:
                        invoke$lambda$5 = HandleInvocationsFromAdViewer.invoke$lambda$5(handleInvocationsFromAdViewer);
                        return invoke$lambda$5;
                    case 20:
                        invoke$lambda$16 = HandleInvocationsFromAdViewer.invoke$lambda$16(handleInvocationsFromAdViewer);
                        return invoke$lambda$16;
                    case 21:
                        invoke$lambda$17 = HandleInvocationsFromAdViewer.invoke$lambda$17(handleInvocationsFromAdViewer);
                        return invoke$lambda$17;
                    default:
                        invoke$lambda$18 = HandleInvocationsFromAdViewer.invoke$lambda$18(handleInvocationsFromAdViewer);
                        return invoke$lambda$18;
                }
            }
        }), new Pair(ExposedFunctionLocation.IS_ATTRIBUTION_AVAILABLE, new Function0(this) { // from class: l69
            public final /* synthetic */ HandleInvocationsFromAdViewer b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                ExposedFunction invoke$lambda$19;
                ExposedFunction invoke$lambda$1;
                ExposedFunction invoke$lambda$20;
                ExposedFunction invoke$lambda$21;
                ExposedFunction invoke$lambda$22;
                ExposedFunction invoke$lambda$27;
                ExposedFunction invoke$lambda$29;
                ExposedFunction invoke$lambda$2;
                ExposedFunction invoke$lambda$32;
                ExposedFunction invoke$lambda$36;
                ExposedFunction invoke$lambda$37;
                ExposedFunction invoke$lambda$3;
                ExposedFunction invoke$lambda$41;
                ExposedFunction invoke$lambda$42;
                ExposedFunction invoke$lambda$45;
                ExposedFunction invoke$lambda$46;
                ExposedFunction invoke$lambda$47;
                ExposedFunction invoke$lambda$48;
                ExposedFunction invoke$lambda$4;
                ExposedFunction invoke$lambda$5;
                ExposedFunction invoke$lambda$16;
                ExposedFunction invoke$lambda$17;
                ExposedFunction invoke$lambda$18;
                int i27 = i19;
                HandleInvocationsFromAdViewer handleInvocationsFromAdViewer = this.b;
                switch (i27) {
                    case 0:
                        invoke$lambda$19 = HandleInvocationsFromAdViewer.invoke$lambda$19(handleInvocationsFromAdViewer);
                        return invoke$lambda$19;
                    case 1:
                        invoke$lambda$1 = HandleInvocationsFromAdViewer.invoke$lambda$1(handleInvocationsFromAdViewer);
                        return invoke$lambda$1;
                    case 2:
                        invoke$lambda$20 = HandleInvocationsFromAdViewer.invoke$lambda$20(handleInvocationsFromAdViewer);
                        return invoke$lambda$20;
                    case 3:
                        invoke$lambda$21 = HandleInvocationsFromAdViewer.invoke$lambda$21(handleInvocationsFromAdViewer);
                        return invoke$lambda$21;
                    case 4:
                        invoke$lambda$22 = HandleInvocationsFromAdViewer.invoke$lambda$22(handleInvocationsFromAdViewer);
                        return invoke$lambda$22;
                    case 5:
                        invoke$lambda$27 = HandleInvocationsFromAdViewer.invoke$lambda$27(handleInvocationsFromAdViewer);
                        return invoke$lambda$27;
                    case 6:
                        invoke$lambda$29 = HandleInvocationsFromAdViewer.invoke$lambda$29(handleInvocationsFromAdViewer);
                        return invoke$lambda$29;
                    case 7:
                        invoke$lambda$2 = HandleInvocationsFromAdViewer.invoke$lambda$2(handleInvocationsFromAdViewer);
                        return invoke$lambda$2;
                    case 8:
                        invoke$lambda$32 = HandleInvocationsFromAdViewer.invoke$lambda$32(handleInvocationsFromAdViewer);
                        return invoke$lambda$32;
                    case 9:
                        invoke$lambda$36 = HandleInvocationsFromAdViewer.invoke$lambda$36(handleInvocationsFromAdViewer);
                        return invoke$lambda$36;
                    case 10:
                        invoke$lambda$37 = HandleInvocationsFromAdViewer.invoke$lambda$37(handleInvocationsFromAdViewer);
                        return invoke$lambda$37;
                    case 11:
                        invoke$lambda$3 = HandleInvocationsFromAdViewer.invoke$lambda$3(handleInvocationsFromAdViewer);
                        return invoke$lambda$3;
                    case 12:
                        invoke$lambda$41 = HandleInvocationsFromAdViewer.invoke$lambda$41(handleInvocationsFromAdViewer);
                        return invoke$lambda$41;
                    case 13:
                        invoke$lambda$42 = HandleInvocationsFromAdViewer.invoke$lambda$42(handleInvocationsFromAdViewer);
                        return invoke$lambda$42;
                    case 14:
                        invoke$lambda$45 = HandleInvocationsFromAdViewer.invoke$lambda$45(handleInvocationsFromAdViewer);
                        return invoke$lambda$45;
                    case 15:
                        invoke$lambda$46 = HandleInvocationsFromAdViewer.invoke$lambda$46(handleInvocationsFromAdViewer);
                        return invoke$lambda$46;
                    case 16:
                        invoke$lambda$47 = HandleInvocationsFromAdViewer.invoke$lambda$47(handleInvocationsFromAdViewer);
                        return invoke$lambda$47;
                    case 17:
                        invoke$lambda$48 = HandleInvocationsFromAdViewer.invoke$lambda$48(handleInvocationsFromAdViewer);
                        return invoke$lambda$48;
                    case 18:
                        invoke$lambda$4 = HandleInvocationsFromAdViewer.invoke$lambda$4(handleInvocationsFromAdViewer);
                        return invoke$lambda$4;
                    case 19:
                        invoke$lambda$5 = HandleInvocationsFromAdViewer.invoke$lambda$5(handleInvocationsFromAdViewer);
                        return invoke$lambda$5;
                    case 20:
                        invoke$lambda$16 = HandleInvocationsFromAdViewer.invoke$lambda$16(handleInvocationsFromAdViewer);
                        return invoke$lambda$16;
                    case 21:
                        invoke$lambda$17 = HandleInvocationsFromAdViewer.invoke$lambda$17(handleInvocationsFromAdViewer);
                        return invoke$lambda$17;
                    default:
                        invoke$lambda$18 = HandleInvocationsFromAdViewer.invoke$lambda$18(handleInvocationsFromAdViewer);
                        return invoke$lambda$18;
                }
            }
        }), new Pair(ExposedFunctionLocation.ATTRIBUTION_REGISTER_VIEW, new m69(this, adObject, 9)), new Pair(ExposedFunctionLocation.ATTRIBUTION_REGISTER_CLICK, new m69(this, adObject, 10)), new Pair(ExposedFunctionLocation.HEADER_BIDDING_TOKEN_INCREMENT_WINS, new m69(this, adObject, 11)), new Pair(ExposedFunctionLocation.HEADER_BIDDING_TOKEN_INCREMENT_STARTS, new Function0(this) { // from class: l69
            public final /* synthetic */ HandleInvocationsFromAdViewer b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                ExposedFunction invoke$lambda$19;
                ExposedFunction invoke$lambda$1;
                ExposedFunction invoke$lambda$20;
                ExposedFunction invoke$lambda$21;
                ExposedFunction invoke$lambda$22;
                ExposedFunction invoke$lambda$27;
                ExposedFunction invoke$lambda$29;
                ExposedFunction invoke$lambda$2;
                ExposedFunction invoke$lambda$32;
                ExposedFunction invoke$lambda$36;
                ExposedFunction invoke$lambda$37;
                ExposedFunction invoke$lambda$3;
                ExposedFunction invoke$lambda$41;
                ExposedFunction invoke$lambda$42;
                ExposedFunction invoke$lambda$45;
                ExposedFunction invoke$lambda$46;
                ExposedFunction invoke$lambda$47;
                ExposedFunction invoke$lambda$48;
                ExposedFunction invoke$lambda$4;
                ExposedFunction invoke$lambda$5;
                ExposedFunction invoke$lambda$16;
                ExposedFunction invoke$lambda$17;
                ExposedFunction invoke$lambda$18;
                int i27 = i20;
                HandleInvocationsFromAdViewer handleInvocationsFromAdViewer = this.b;
                switch (i27) {
                    case 0:
                        invoke$lambda$19 = HandleInvocationsFromAdViewer.invoke$lambda$19(handleInvocationsFromAdViewer);
                        return invoke$lambda$19;
                    case 1:
                        invoke$lambda$1 = HandleInvocationsFromAdViewer.invoke$lambda$1(handleInvocationsFromAdViewer);
                        return invoke$lambda$1;
                    case 2:
                        invoke$lambda$20 = HandleInvocationsFromAdViewer.invoke$lambda$20(handleInvocationsFromAdViewer);
                        return invoke$lambda$20;
                    case 3:
                        invoke$lambda$21 = HandleInvocationsFromAdViewer.invoke$lambda$21(handleInvocationsFromAdViewer);
                        return invoke$lambda$21;
                    case 4:
                        invoke$lambda$22 = HandleInvocationsFromAdViewer.invoke$lambda$22(handleInvocationsFromAdViewer);
                        return invoke$lambda$22;
                    case 5:
                        invoke$lambda$27 = HandleInvocationsFromAdViewer.invoke$lambda$27(handleInvocationsFromAdViewer);
                        return invoke$lambda$27;
                    case 6:
                        invoke$lambda$29 = HandleInvocationsFromAdViewer.invoke$lambda$29(handleInvocationsFromAdViewer);
                        return invoke$lambda$29;
                    case 7:
                        invoke$lambda$2 = HandleInvocationsFromAdViewer.invoke$lambda$2(handleInvocationsFromAdViewer);
                        return invoke$lambda$2;
                    case 8:
                        invoke$lambda$32 = HandleInvocationsFromAdViewer.invoke$lambda$32(handleInvocationsFromAdViewer);
                        return invoke$lambda$32;
                    case 9:
                        invoke$lambda$36 = HandleInvocationsFromAdViewer.invoke$lambda$36(handleInvocationsFromAdViewer);
                        return invoke$lambda$36;
                    case 10:
                        invoke$lambda$37 = HandleInvocationsFromAdViewer.invoke$lambda$37(handleInvocationsFromAdViewer);
                        return invoke$lambda$37;
                    case 11:
                        invoke$lambda$3 = HandleInvocationsFromAdViewer.invoke$lambda$3(handleInvocationsFromAdViewer);
                        return invoke$lambda$3;
                    case 12:
                        invoke$lambda$41 = HandleInvocationsFromAdViewer.invoke$lambda$41(handleInvocationsFromAdViewer);
                        return invoke$lambda$41;
                    case 13:
                        invoke$lambda$42 = HandleInvocationsFromAdViewer.invoke$lambda$42(handleInvocationsFromAdViewer);
                        return invoke$lambda$42;
                    case 14:
                        invoke$lambda$45 = HandleInvocationsFromAdViewer.invoke$lambda$45(handleInvocationsFromAdViewer);
                        return invoke$lambda$45;
                    case 15:
                        invoke$lambda$46 = HandleInvocationsFromAdViewer.invoke$lambda$46(handleInvocationsFromAdViewer);
                        return invoke$lambda$46;
                    case 16:
                        invoke$lambda$47 = HandleInvocationsFromAdViewer.invoke$lambda$47(handleInvocationsFromAdViewer);
                        return invoke$lambda$47;
                    case 17:
                        invoke$lambda$48 = HandleInvocationsFromAdViewer.invoke$lambda$48(handleInvocationsFromAdViewer);
                        return invoke$lambda$48;
                    case 18:
                        invoke$lambda$4 = HandleInvocationsFromAdViewer.invoke$lambda$4(handleInvocationsFromAdViewer);
                        return invoke$lambda$4;
                    case 19:
                        invoke$lambda$5 = HandleInvocationsFromAdViewer.invoke$lambda$5(handleInvocationsFromAdViewer);
                        return invoke$lambda$5;
                    case 20:
                        invoke$lambda$16 = HandleInvocationsFromAdViewer.invoke$lambda$16(handleInvocationsFromAdViewer);
                        return invoke$lambda$16;
                    case 21:
                        invoke$lambda$17 = HandleInvocationsFromAdViewer.invoke$lambda$17(handleInvocationsFromAdViewer);
                        return invoke$lambda$17;
                    default:
                        invoke$lambda$18 = HandleInvocationsFromAdViewer.invoke$lambda$18(handleInvocationsFromAdViewer);
                        return invoke$lambda$18;
                }
            }
        }), new Pair(ExposedFunctionLocation.HEADER_BIDDING_TOKEN_RESET, new Function0(this) { // from class: l69
            public final /* synthetic */ HandleInvocationsFromAdViewer b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                ExposedFunction invoke$lambda$19;
                ExposedFunction invoke$lambda$1;
                ExposedFunction invoke$lambda$20;
                ExposedFunction invoke$lambda$21;
                ExposedFunction invoke$lambda$22;
                ExposedFunction invoke$lambda$27;
                ExposedFunction invoke$lambda$29;
                ExposedFunction invoke$lambda$2;
                ExposedFunction invoke$lambda$32;
                ExposedFunction invoke$lambda$36;
                ExposedFunction invoke$lambda$37;
                ExposedFunction invoke$lambda$3;
                ExposedFunction invoke$lambda$41;
                ExposedFunction invoke$lambda$42;
                ExposedFunction invoke$lambda$45;
                ExposedFunction invoke$lambda$46;
                ExposedFunction invoke$lambda$47;
                ExposedFunction invoke$lambda$48;
                ExposedFunction invoke$lambda$4;
                ExposedFunction invoke$lambda$5;
                ExposedFunction invoke$lambda$16;
                ExposedFunction invoke$lambda$17;
                ExposedFunction invoke$lambda$18;
                int i27 = i21;
                HandleInvocationsFromAdViewer handleInvocationsFromAdViewer = this.b;
                switch (i27) {
                    case 0:
                        invoke$lambda$19 = HandleInvocationsFromAdViewer.invoke$lambda$19(handleInvocationsFromAdViewer);
                        return invoke$lambda$19;
                    case 1:
                        invoke$lambda$1 = HandleInvocationsFromAdViewer.invoke$lambda$1(handleInvocationsFromAdViewer);
                        return invoke$lambda$1;
                    case 2:
                        invoke$lambda$20 = HandleInvocationsFromAdViewer.invoke$lambda$20(handleInvocationsFromAdViewer);
                        return invoke$lambda$20;
                    case 3:
                        invoke$lambda$21 = HandleInvocationsFromAdViewer.invoke$lambda$21(handleInvocationsFromAdViewer);
                        return invoke$lambda$21;
                    case 4:
                        invoke$lambda$22 = HandleInvocationsFromAdViewer.invoke$lambda$22(handleInvocationsFromAdViewer);
                        return invoke$lambda$22;
                    case 5:
                        invoke$lambda$27 = HandleInvocationsFromAdViewer.invoke$lambda$27(handleInvocationsFromAdViewer);
                        return invoke$lambda$27;
                    case 6:
                        invoke$lambda$29 = HandleInvocationsFromAdViewer.invoke$lambda$29(handleInvocationsFromAdViewer);
                        return invoke$lambda$29;
                    case 7:
                        invoke$lambda$2 = HandleInvocationsFromAdViewer.invoke$lambda$2(handleInvocationsFromAdViewer);
                        return invoke$lambda$2;
                    case 8:
                        invoke$lambda$32 = HandleInvocationsFromAdViewer.invoke$lambda$32(handleInvocationsFromAdViewer);
                        return invoke$lambda$32;
                    case 9:
                        invoke$lambda$36 = HandleInvocationsFromAdViewer.invoke$lambda$36(handleInvocationsFromAdViewer);
                        return invoke$lambda$36;
                    case 10:
                        invoke$lambda$37 = HandleInvocationsFromAdViewer.invoke$lambda$37(handleInvocationsFromAdViewer);
                        return invoke$lambda$37;
                    case 11:
                        invoke$lambda$3 = HandleInvocationsFromAdViewer.invoke$lambda$3(handleInvocationsFromAdViewer);
                        return invoke$lambda$3;
                    case 12:
                        invoke$lambda$41 = HandleInvocationsFromAdViewer.invoke$lambda$41(handleInvocationsFromAdViewer);
                        return invoke$lambda$41;
                    case 13:
                        invoke$lambda$42 = HandleInvocationsFromAdViewer.invoke$lambda$42(handleInvocationsFromAdViewer);
                        return invoke$lambda$42;
                    case 14:
                        invoke$lambda$45 = HandleInvocationsFromAdViewer.invoke$lambda$45(handleInvocationsFromAdViewer);
                        return invoke$lambda$45;
                    case 15:
                        invoke$lambda$46 = HandleInvocationsFromAdViewer.invoke$lambda$46(handleInvocationsFromAdViewer);
                        return invoke$lambda$46;
                    case 16:
                        invoke$lambda$47 = HandleInvocationsFromAdViewer.invoke$lambda$47(handleInvocationsFromAdViewer);
                        return invoke$lambda$47;
                    case 17:
                        invoke$lambda$48 = HandleInvocationsFromAdViewer.invoke$lambda$48(handleInvocationsFromAdViewer);
                        return invoke$lambda$48;
                    case 18:
                        invoke$lambda$4 = HandleInvocationsFromAdViewer.invoke$lambda$4(handleInvocationsFromAdViewer);
                        return invoke$lambda$4;
                    case 19:
                        invoke$lambda$5 = HandleInvocationsFromAdViewer.invoke$lambda$5(handleInvocationsFromAdViewer);
                        return invoke$lambda$5;
                    case 20:
                        invoke$lambda$16 = HandleInvocationsFromAdViewer.invoke$lambda$16(handleInvocationsFromAdViewer);
                        return invoke$lambda$16;
                    case 21:
                        invoke$lambda$17 = HandleInvocationsFromAdViewer.invoke$lambda$17(handleInvocationsFromAdViewer);
                        return invoke$lambda$17;
                    default:
                        invoke$lambda$18 = HandleInvocationsFromAdViewer.invoke$lambda$18(handleInvocationsFromAdViewer);
                        return invoke$lambda$18;
                }
            }
        }), new Pair(ExposedFunctionLocation.LOAD_OFFERWALL_AD, new m69(this, adObject, 12)), new Pair(ExposedFunctionLocation.SHOW_OFFERWALL_AD, new j69(18)), new Pair(ExposedFunctionLocation.IS_OFFERWALL_AD_READY, new Function0(this) { // from class: l69
            public final /* synthetic */ HandleInvocationsFromAdViewer b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                ExposedFunction invoke$lambda$19;
                ExposedFunction invoke$lambda$1;
                ExposedFunction invoke$lambda$20;
                ExposedFunction invoke$lambda$21;
                ExposedFunction invoke$lambda$22;
                ExposedFunction invoke$lambda$27;
                ExposedFunction invoke$lambda$29;
                ExposedFunction invoke$lambda$2;
                ExposedFunction invoke$lambda$32;
                ExposedFunction invoke$lambda$36;
                ExposedFunction invoke$lambda$37;
                ExposedFunction invoke$lambda$3;
                ExposedFunction invoke$lambda$41;
                ExposedFunction invoke$lambda$42;
                ExposedFunction invoke$lambda$45;
                ExposedFunction invoke$lambda$46;
                ExposedFunction invoke$lambda$47;
                ExposedFunction invoke$lambda$48;
                ExposedFunction invoke$lambda$4;
                ExposedFunction invoke$lambda$5;
                ExposedFunction invoke$lambda$16;
                ExposedFunction invoke$lambda$17;
                ExposedFunction invoke$lambda$18;
                int i27 = i22;
                HandleInvocationsFromAdViewer handleInvocationsFromAdViewer = this.b;
                switch (i27) {
                    case 0:
                        invoke$lambda$19 = HandleInvocationsFromAdViewer.invoke$lambda$19(handleInvocationsFromAdViewer);
                        return invoke$lambda$19;
                    case 1:
                        invoke$lambda$1 = HandleInvocationsFromAdViewer.invoke$lambda$1(handleInvocationsFromAdViewer);
                        return invoke$lambda$1;
                    case 2:
                        invoke$lambda$20 = HandleInvocationsFromAdViewer.invoke$lambda$20(handleInvocationsFromAdViewer);
                        return invoke$lambda$20;
                    case 3:
                        invoke$lambda$21 = HandleInvocationsFromAdViewer.invoke$lambda$21(handleInvocationsFromAdViewer);
                        return invoke$lambda$21;
                    case 4:
                        invoke$lambda$22 = HandleInvocationsFromAdViewer.invoke$lambda$22(handleInvocationsFromAdViewer);
                        return invoke$lambda$22;
                    case 5:
                        invoke$lambda$27 = HandleInvocationsFromAdViewer.invoke$lambda$27(handleInvocationsFromAdViewer);
                        return invoke$lambda$27;
                    case 6:
                        invoke$lambda$29 = HandleInvocationsFromAdViewer.invoke$lambda$29(handleInvocationsFromAdViewer);
                        return invoke$lambda$29;
                    case 7:
                        invoke$lambda$2 = HandleInvocationsFromAdViewer.invoke$lambda$2(handleInvocationsFromAdViewer);
                        return invoke$lambda$2;
                    case 8:
                        invoke$lambda$32 = HandleInvocationsFromAdViewer.invoke$lambda$32(handleInvocationsFromAdViewer);
                        return invoke$lambda$32;
                    case 9:
                        invoke$lambda$36 = HandleInvocationsFromAdViewer.invoke$lambda$36(handleInvocationsFromAdViewer);
                        return invoke$lambda$36;
                    case 10:
                        invoke$lambda$37 = HandleInvocationsFromAdViewer.invoke$lambda$37(handleInvocationsFromAdViewer);
                        return invoke$lambda$37;
                    case 11:
                        invoke$lambda$3 = HandleInvocationsFromAdViewer.invoke$lambda$3(handleInvocationsFromAdViewer);
                        return invoke$lambda$3;
                    case 12:
                        invoke$lambda$41 = HandleInvocationsFromAdViewer.invoke$lambda$41(handleInvocationsFromAdViewer);
                        return invoke$lambda$41;
                    case 13:
                        invoke$lambda$42 = HandleInvocationsFromAdViewer.invoke$lambda$42(handleInvocationsFromAdViewer);
                        return invoke$lambda$42;
                    case 14:
                        invoke$lambda$45 = HandleInvocationsFromAdViewer.invoke$lambda$45(handleInvocationsFromAdViewer);
                        return invoke$lambda$45;
                    case 15:
                        invoke$lambda$46 = HandleInvocationsFromAdViewer.invoke$lambda$46(handleInvocationsFromAdViewer);
                        return invoke$lambda$46;
                    case 16:
                        invoke$lambda$47 = HandleInvocationsFromAdViewer.invoke$lambda$47(handleInvocationsFromAdViewer);
                        return invoke$lambda$47;
                    case 17:
                        invoke$lambda$48 = HandleInvocationsFromAdViewer.invoke$lambda$48(handleInvocationsFromAdViewer);
                        return invoke$lambda$48;
                    case 18:
                        invoke$lambda$4 = HandleInvocationsFromAdViewer.invoke$lambda$4(handleInvocationsFromAdViewer);
                        return invoke$lambda$4;
                    case 19:
                        invoke$lambda$5 = HandleInvocationsFromAdViewer.invoke$lambda$5(handleInvocationsFromAdViewer);
                        return invoke$lambda$5;
                    case 20:
                        invoke$lambda$16 = HandleInvocationsFromAdViewer.invoke$lambda$16(handleInvocationsFromAdViewer);
                        return invoke$lambda$16;
                    case 21:
                        invoke$lambda$17 = HandleInvocationsFromAdViewer.invoke$lambda$17(handleInvocationsFromAdViewer);
                        return invoke$lambda$17;
                    default:
                        invoke$lambda$18 = HandleInvocationsFromAdViewer.invoke$lambda$18(handleInvocationsFromAdViewer);
                        return invoke$lambda$18;
                }
            }
        }), new Pair(ExposedFunctionLocation.REQUEST_GET, new Function0(this) { // from class: l69
            public final /* synthetic */ HandleInvocationsFromAdViewer b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                ExposedFunction invoke$lambda$19;
                ExposedFunction invoke$lambda$1;
                ExposedFunction invoke$lambda$20;
                ExposedFunction invoke$lambda$21;
                ExposedFunction invoke$lambda$22;
                ExposedFunction invoke$lambda$27;
                ExposedFunction invoke$lambda$29;
                ExposedFunction invoke$lambda$2;
                ExposedFunction invoke$lambda$32;
                ExposedFunction invoke$lambda$36;
                ExposedFunction invoke$lambda$37;
                ExposedFunction invoke$lambda$3;
                ExposedFunction invoke$lambda$41;
                ExposedFunction invoke$lambda$42;
                ExposedFunction invoke$lambda$45;
                ExposedFunction invoke$lambda$46;
                ExposedFunction invoke$lambda$47;
                ExposedFunction invoke$lambda$48;
                ExposedFunction invoke$lambda$4;
                ExposedFunction invoke$lambda$5;
                ExposedFunction invoke$lambda$16;
                ExposedFunction invoke$lambda$17;
                ExposedFunction invoke$lambda$18;
                int i27 = i23;
                HandleInvocationsFromAdViewer handleInvocationsFromAdViewer = this.b;
                switch (i27) {
                    case 0:
                        invoke$lambda$19 = HandleInvocationsFromAdViewer.invoke$lambda$19(handleInvocationsFromAdViewer);
                        return invoke$lambda$19;
                    case 1:
                        invoke$lambda$1 = HandleInvocationsFromAdViewer.invoke$lambda$1(handleInvocationsFromAdViewer);
                        return invoke$lambda$1;
                    case 2:
                        invoke$lambda$20 = HandleInvocationsFromAdViewer.invoke$lambda$20(handleInvocationsFromAdViewer);
                        return invoke$lambda$20;
                    case 3:
                        invoke$lambda$21 = HandleInvocationsFromAdViewer.invoke$lambda$21(handleInvocationsFromAdViewer);
                        return invoke$lambda$21;
                    case 4:
                        invoke$lambda$22 = HandleInvocationsFromAdViewer.invoke$lambda$22(handleInvocationsFromAdViewer);
                        return invoke$lambda$22;
                    case 5:
                        invoke$lambda$27 = HandleInvocationsFromAdViewer.invoke$lambda$27(handleInvocationsFromAdViewer);
                        return invoke$lambda$27;
                    case 6:
                        invoke$lambda$29 = HandleInvocationsFromAdViewer.invoke$lambda$29(handleInvocationsFromAdViewer);
                        return invoke$lambda$29;
                    case 7:
                        invoke$lambda$2 = HandleInvocationsFromAdViewer.invoke$lambda$2(handleInvocationsFromAdViewer);
                        return invoke$lambda$2;
                    case 8:
                        invoke$lambda$32 = HandleInvocationsFromAdViewer.invoke$lambda$32(handleInvocationsFromAdViewer);
                        return invoke$lambda$32;
                    case 9:
                        invoke$lambda$36 = HandleInvocationsFromAdViewer.invoke$lambda$36(handleInvocationsFromAdViewer);
                        return invoke$lambda$36;
                    case 10:
                        invoke$lambda$37 = HandleInvocationsFromAdViewer.invoke$lambda$37(handleInvocationsFromAdViewer);
                        return invoke$lambda$37;
                    case 11:
                        invoke$lambda$3 = HandleInvocationsFromAdViewer.invoke$lambda$3(handleInvocationsFromAdViewer);
                        return invoke$lambda$3;
                    case 12:
                        invoke$lambda$41 = HandleInvocationsFromAdViewer.invoke$lambda$41(handleInvocationsFromAdViewer);
                        return invoke$lambda$41;
                    case 13:
                        invoke$lambda$42 = HandleInvocationsFromAdViewer.invoke$lambda$42(handleInvocationsFromAdViewer);
                        return invoke$lambda$42;
                    case 14:
                        invoke$lambda$45 = HandleInvocationsFromAdViewer.invoke$lambda$45(handleInvocationsFromAdViewer);
                        return invoke$lambda$45;
                    case 15:
                        invoke$lambda$46 = HandleInvocationsFromAdViewer.invoke$lambda$46(handleInvocationsFromAdViewer);
                        return invoke$lambda$46;
                    case 16:
                        invoke$lambda$47 = HandleInvocationsFromAdViewer.invoke$lambda$47(handleInvocationsFromAdViewer);
                        return invoke$lambda$47;
                    case 17:
                        invoke$lambda$48 = HandleInvocationsFromAdViewer.invoke$lambda$48(handleInvocationsFromAdViewer);
                        return invoke$lambda$48;
                    case 18:
                        invoke$lambda$4 = HandleInvocationsFromAdViewer.invoke$lambda$4(handleInvocationsFromAdViewer);
                        return invoke$lambda$4;
                    case 19:
                        invoke$lambda$5 = HandleInvocationsFromAdViewer.invoke$lambda$5(handleInvocationsFromAdViewer);
                        return invoke$lambda$5;
                    case 20:
                        invoke$lambda$16 = HandleInvocationsFromAdViewer.invoke$lambda$16(handleInvocationsFromAdViewer);
                        return invoke$lambda$16;
                    case 21:
                        invoke$lambda$17 = HandleInvocationsFromAdViewer.invoke$lambda$17(handleInvocationsFromAdViewer);
                        return invoke$lambda$17;
                    default:
                        invoke$lambda$18 = HandleInvocationsFromAdViewer.invoke$lambda$18(handleInvocationsFromAdViewer);
                        return invoke$lambda$18;
                }
            }
        }), new Pair(ExposedFunctionLocation.REQUEST_POST, new Function0(this) { // from class: l69
            public final /* synthetic */ HandleInvocationsFromAdViewer b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                ExposedFunction invoke$lambda$19;
                ExposedFunction invoke$lambda$1;
                ExposedFunction invoke$lambda$20;
                ExposedFunction invoke$lambda$21;
                ExposedFunction invoke$lambda$22;
                ExposedFunction invoke$lambda$27;
                ExposedFunction invoke$lambda$29;
                ExposedFunction invoke$lambda$2;
                ExposedFunction invoke$lambda$32;
                ExposedFunction invoke$lambda$36;
                ExposedFunction invoke$lambda$37;
                ExposedFunction invoke$lambda$3;
                ExposedFunction invoke$lambda$41;
                ExposedFunction invoke$lambda$42;
                ExposedFunction invoke$lambda$45;
                ExposedFunction invoke$lambda$46;
                ExposedFunction invoke$lambda$47;
                ExposedFunction invoke$lambda$48;
                ExposedFunction invoke$lambda$4;
                ExposedFunction invoke$lambda$5;
                ExposedFunction invoke$lambda$16;
                ExposedFunction invoke$lambda$17;
                ExposedFunction invoke$lambda$18;
                int i27 = i24;
                HandleInvocationsFromAdViewer handleInvocationsFromAdViewer = this.b;
                switch (i27) {
                    case 0:
                        invoke$lambda$19 = HandleInvocationsFromAdViewer.invoke$lambda$19(handleInvocationsFromAdViewer);
                        return invoke$lambda$19;
                    case 1:
                        invoke$lambda$1 = HandleInvocationsFromAdViewer.invoke$lambda$1(handleInvocationsFromAdViewer);
                        return invoke$lambda$1;
                    case 2:
                        invoke$lambda$20 = HandleInvocationsFromAdViewer.invoke$lambda$20(handleInvocationsFromAdViewer);
                        return invoke$lambda$20;
                    case 3:
                        invoke$lambda$21 = HandleInvocationsFromAdViewer.invoke$lambda$21(handleInvocationsFromAdViewer);
                        return invoke$lambda$21;
                    case 4:
                        invoke$lambda$22 = HandleInvocationsFromAdViewer.invoke$lambda$22(handleInvocationsFromAdViewer);
                        return invoke$lambda$22;
                    case 5:
                        invoke$lambda$27 = HandleInvocationsFromAdViewer.invoke$lambda$27(handleInvocationsFromAdViewer);
                        return invoke$lambda$27;
                    case 6:
                        invoke$lambda$29 = HandleInvocationsFromAdViewer.invoke$lambda$29(handleInvocationsFromAdViewer);
                        return invoke$lambda$29;
                    case 7:
                        invoke$lambda$2 = HandleInvocationsFromAdViewer.invoke$lambda$2(handleInvocationsFromAdViewer);
                        return invoke$lambda$2;
                    case 8:
                        invoke$lambda$32 = HandleInvocationsFromAdViewer.invoke$lambda$32(handleInvocationsFromAdViewer);
                        return invoke$lambda$32;
                    case 9:
                        invoke$lambda$36 = HandleInvocationsFromAdViewer.invoke$lambda$36(handleInvocationsFromAdViewer);
                        return invoke$lambda$36;
                    case 10:
                        invoke$lambda$37 = HandleInvocationsFromAdViewer.invoke$lambda$37(handleInvocationsFromAdViewer);
                        return invoke$lambda$37;
                    case 11:
                        invoke$lambda$3 = HandleInvocationsFromAdViewer.invoke$lambda$3(handleInvocationsFromAdViewer);
                        return invoke$lambda$3;
                    case 12:
                        invoke$lambda$41 = HandleInvocationsFromAdViewer.invoke$lambda$41(handleInvocationsFromAdViewer);
                        return invoke$lambda$41;
                    case 13:
                        invoke$lambda$42 = HandleInvocationsFromAdViewer.invoke$lambda$42(handleInvocationsFromAdViewer);
                        return invoke$lambda$42;
                    case 14:
                        invoke$lambda$45 = HandleInvocationsFromAdViewer.invoke$lambda$45(handleInvocationsFromAdViewer);
                        return invoke$lambda$45;
                    case 15:
                        invoke$lambda$46 = HandleInvocationsFromAdViewer.invoke$lambda$46(handleInvocationsFromAdViewer);
                        return invoke$lambda$46;
                    case 16:
                        invoke$lambda$47 = HandleInvocationsFromAdViewer.invoke$lambda$47(handleInvocationsFromAdViewer);
                        return invoke$lambda$47;
                    case 17:
                        invoke$lambda$48 = HandleInvocationsFromAdViewer.invoke$lambda$48(handleInvocationsFromAdViewer);
                        return invoke$lambda$48;
                    case 18:
                        invoke$lambda$4 = HandleInvocationsFromAdViewer.invoke$lambda$4(handleInvocationsFromAdViewer);
                        return invoke$lambda$4;
                    case 19:
                        invoke$lambda$5 = HandleInvocationsFromAdViewer.invoke$lambda$5(handleInvocationsFromAdViewer);
                        return invoke$lambda$5;
                    case 20:
                        invoke$lambda$16 = HandleInvocationsFromAdViewer.invoke$lambda$16(handleInvocationsFromAdViewer);
                        return invoke$lambda$16;
                    case 21:
                        invoke$lambda$17 = HandleInvocationsFromAdViewer.invoke$lambda$17(handleInvocationsFromAdViewer);
                        return invoke$lambda$17;
                    default:
                        invoke$lambda$18 = HandleInvocationsFromAdViewer.invoke$lambda$18(handleInvocationsFromAdViewer);
                        return invoke$lambda$18;
                }
            }
        }), new Pair(ExposedFunctionLocation.REQUEST_HEAD, new Function0(this) { // from class: l69
            public final /* synthetic */ HandleInvocationsFromAdViewer b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                ExposedFunction invoke$lambda$19;
                ExposedFunction invoke$lambda$1;
                ExposedFunction invoke$lambda$20;
                ExposedFunction invoke$lambda$21;
                ExposedFunction invoke$lambda$22;
                ExposedFunction invoke$lambda$27;
                ExposedFunction invoke$lambda$29;
                ExposedFunction invoke$lambda$2;
                ExposedFunction invoke$lambda$32;
                ExposedFunction invoke$lambda$36;
                ExposedFunction invoke$lambda$37;
                ExposedFunction invoke$lambda$3;
                ExposedFunction invoke$lambda$41;
                ExposedFunction invoke$lambda$42;
                ExposedFunction invoke$lambda$45;
                ExposedFunction invoke$lambda$46;
                ExposedFunction invoke$lambda$47;
                ExposedFunction invoke$lambda$48;
                ExposedFunction invoke$lambda$4;
                ExposedFunction invoke$lambda$5;
                ExposedFunction invoke$lambda$16;
                ExposedFunction invoke$lambda$17;
                ExposedFunction invoke$lambda$18;
                int i27 = i25;
                HandleInvocationsFromAdViewer handleInvocationsFromAdViewer = this.b;
                switch (i27) {
                    case 0:
                        invoke$lambda$19 = HandleInvocationsFromAdViewer.invoke$lambda$19(handleInvocationsFromAdViewer);
                        return invoke$lambda$19;
                    case 1:
                        invoke$lambda$1 = HandleInvocationsFromAdViewer.invoke$lambda$1(handleInvocationsFromAdViewer);
                        return invoke$lambda$1;
                    case 2:
                        invoke$lambda$20 = HandleInvocationsFromAdViewer.invoke$lambda$20(handleInvocationsFromAdViewer);
                        return invoke$lambda$20;
                    case 3:
                        invoke$lambda$21 = HandleInvocationsFromAdViewer.invoke$lambda$21(handleInvocationsFromAdViewer);
                        return invoke$lambda$21;
                    case 4:
                        invoke$lambda$22 = HandleInvocationsFromAdViewer.invoke$lambda$22(handleInvocationsFromAdViewer);
                        return invoke$lambda$22;
                    case 5:
                        invoke$lambda$27 = HandleInvocationsFromAdViewer.invoke$lambda$27(handleInvocationsFromAdViewer);
                        return invoke$lambda$27;
                    case 6:
                        invoke$lambda$29 = HandleInvocationsFromAdViewer.invoke$lambda$29(handleInvocationsFromAdViewer);
                        return invoke$lambda$29;
                    case 7:
                        invoke$lambda$2 = HandleInvocationsFromAdViewer.invoke$lambda$2(handleInvocationsFromAdViewer);
                        return invoke$lambda$2;
                    case 8:
                        invoke$lambda$32 = HandleInvocationsFromAdViewer.invoke$lambda$32(handleInvocationsFromAdViewer);
                        return invoke$lambda$32;
                    case 9:
                        invoke$lambda$36 = HandleInvocationsFromAdViewer.invoke$lambda$36(handleInvocationsFromAdViewer);
                        return invoke$lambda$36;
                    case 10:
                        invoke$lambda$37 = HandleInvocationsFromAdViewer.invoke$lambda$37(handleInvocationsFromAdViewer);
                        return invoke$lambda$37;
                    case 11:
                        invoke$lambda$3 = HandleInvocationsFromAdViewer.invoke$lambda$3(handleInvocationsFromAdViewer);
                        return invoke$lambda$3;
                    case 12:
                        invoke$lambda$41 = HandleInvocationsFromAdViewer.invoke$lambda$41(handleInvocationsFromAdViewer);
                        return invoke$lambda$41;
                    case 13:
                        invoke$lambda$42 = HandleInvocationsFromAdViewer.invoke$lambda$42(handleInvocationsFromAdViewer);
                        return invoke$lambda$42;
                    case 14:
                        invoke$lambda$45 = HandleInvocationsFromAdViewer.invoke$lambda$45(handleInvocationsFromAdViewer);
                        return invoke$lambda$45;
                    case 15:
                        invoke$lambda$46 = HandleInvocationsFromAdViewer.invoke$lambda$46(handleInvocationsFromAdViewer);
                        return invoke$lambda$46;
                    case 16:
                        invoke$lambda$47 = HandleInvocationsFromAdViewer.invoke$lambda$47(handleInvocationsFromAdViewer);
                        return invoke$lambda$47;
                    case 17:
                        invoke$lambda$48 = HandleInvocationsFromAdViewer.invoke$lambda$48(handleInvocationsFromAdViewer);
                        return invoke$lambda$48;
                    case 18:
                        invoke$lambda$4 = HandleInvocationsFromAdViewer.invoke$lambda$4(handleInvocationsFromAdViewer);
                        return invoke$lambda$4;
                    case 19:
                        invoke$lambda$5 = HandleInvocationsFromAdViewer.invoke$lambda$5(handleInvocationsFromAdViewer);
                        return invoke$lambda$5;
                    case 20:
                        invoke$lambda$16 = HandleInvocationsFromAdViewer.invoke$lambda$16(handleInvocationsFromAdViewer);
                        return invoke$lambda$16;
                    case 21:
                        invoke$lambda$17 = HandleInvocationsFromAdViewer.invoke$lambda$17(handleInvocationsFromAdViewer);
                        return invoke$lambda$17;
                    default:
                        invoke$lambda$18 = HandleInvocationsFromAdViewer.invoke$lambda$18(handleInvocationsFromAdViewer);
                        return invoke$lambda$18;
                }
            }
        }), new Pair(ExposedFunctionLocation.SET_OPPORTUNITY_TTL, new Function0() { // from class: n69
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                ExposedFunction updateTrackingToken;
                ExposedFunction opportunityTTL;
                ExposedFunction orientation;
                int i27 = i26;
                AdObject adObject2 = adObject;
                switch (i27) {
                    case 0:
                        updateTrackingToken = CommonAdViewerExposedFunctionsKt.updateTrackingToken(adObject2);
                        return updateTrackingToken;
                    case 1:
                        opportunityTTL = CommonAdViewerExposedFunctionsKt.setOpportunityTTL(adObject2);
                        return opportunityTTL;
                    default:
                        orientation = CommonAdViewerExposedFunctionsKt.setOrientation(adObject2);
                        return orientation;
                }
            }
        }), new Pair(ExposedFunctionLocation.GET_EXTRA, new m69(this, adObject, 13)));
    }
}
