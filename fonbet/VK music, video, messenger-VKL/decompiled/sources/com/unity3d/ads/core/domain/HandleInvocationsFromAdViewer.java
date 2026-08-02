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
import com.unity3d.services.core.network.model.RequestType;
import com.vk.movika.sdk.base.logic.interactor.g;
import com.vk.movika.sdk.base.ui.k;
import com.vk.movika.sdk.base.ui.l;
import com.vk.movika.sdk.base.ui.m;
import com.vk.movika.sdk.base.ui.r0;
import java.util.Map;
import kotlin.Pair;
import xsna.akh;
import xsna.bu0;
import xsna.cfl;
import xsna.cu1;
import xsna.cvs;
import xsna.e20;
import xsna.ecm;
import xsna.fgm;
import xsna.fk;
import xsna.foi;
import xsna.fpf0;
import xsna.gbh;
import xsna.gzs;
import xsna.hn9;
import xsna.ie3;
import xsna.jpf;
import xsna.kbe;
import xsna.kr6;
import xsna.lb6;
import xsna.m1o;
import xsna.m2j;
import xsna.m3g;
import xsna.n1i;
import xsna.n5i;
import xsna.obh;
import xsna.pk;
import xsna.pn00;
import xsna.pvh;
import xsna.q9s;
import xsna.qfj;
import xsna.qg1;
import xsna.rp1;
import xsna.sfg;
import xsna.sim;
import xsna.sk4;
import xsna.u3k;
import xsna.vg0;
import xsna.w4u;
import xsna.w8q;
import xsna.wb1;
import xsna.wnh;
import xsna.wzh;
import xsna.xg2;
import xsna.xk;
import xsna.xyh;
import xsna.yce;
import xsna.yk;
import xsna.zcl;

/* compiled from: HandleInvocationsFromAdViewer.kt */
/* loaded from: classes14.dex */
public final class HandleInvocationsFromAdViewer implements IServiceComponent {
    public static final Companion Companion = new Companion(null);
    public static final String KEY_ACTION = "action";
    public static final String KEY_AD_DATA = "adData";
    public static final String KEY_AD_DATA_REFRESH_TOKEN = "adDataRefreshToken";
    public static final String KEY_AD_REFRESH_INVALIDATION_REASON = "invalidationReason";
    public static final String KEY_AD_STRING = "adString";
    public static final String KEY_AD_TYPE = "type";
    public static final String KEY_AD_UNIT_ID = "adUnitId";
    public static final String KEY_DOWNLOAD_PRIORITY = "priority";
    public static final String KEY_DOWNLOAD_URL = "url";
    public static final String KEY_EXTRAS = "extras";
    public static final String KEY_IMPRESSION_CONFIG = "impressionConfig";
    public static final String KEY_IMPRESSION_OPPORTUNITY_ID = "impressionOpportunityId";
    public static final String KEY_IS_HEADER_BIDDING = "isHeaderBidding";
    public static final String KEY_LOAD_OPTIONS = "loadOptions";
    public static final String KEY_NATIVE_CONTEXT = "nativeContext";
    public static final String KEY_OMID = "openMeasurement";
    public static final String KEY_OMJS_SERVICE = "serviceFilePath";
    public static final String KEY_OMJS_SESSION = "sessionFilePath";
    public static final String KEY_OM_PARTNER = "partnerName";
    public static final String KEY_OM_PARTNER_VERSION = "partnerVersion";
    public static final String KEY_OM_VERSION = "version";
    public static final String KEY_PACKAGE_NAME = "packageName";
    public static final String KEY_PLACEMENT_ID = "placementId";
    public static final String KEY_PLACEMENT_NAME = "placementName";
    public static final String KEY_PRIVACY_UPDATE_CONTENT = "content";
    public static final String KEY_PRIVACY_UPDATE_VERSION = "version";
    public static final String KEY_QUERY_ID = "queryId";
    public static final String KEY_TRACKING_TOKEN = "trackingToken";
    public static final String KEY_USE_ACTIVITY_FOR_RESULT = "useActivityForResult";
    public static final String KEY_VIDEO_LENGTH = "videoLength";

    /* compiled from: HandleInvocationsFromAdViewer.kt */
    public static final class Companion {
        public /* synthetic */ Companion(zcl zclVar) {
            this();
        }

        private Companion() {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ExposedFunction invoke$lambda$0(HandleInvocationsFromAdViewer handleInvocationsFromAdViewer, String str, String str2, String str3, AdObject adObject) {
        return CommonAdViewerExposedFunctionsKt.m73getAdContextyLuu4LI((AndroidGetAdPlayerContext) handleInvocationsFromAdViewer.getServiceProvider().getRegistry().getService("", fpf0.a(AndroidGetAdPlayerContext.class)), str, str2, str3, (IsOMActivated) handleInvocationsFromAdViewer.getServiceProvider().getRegistry().getService("", fpf0.a(IsOMActivated.class)), adObject);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ExposedFunction invoke$lambda$1(HandleInvocationsFromAdViewer handleInvocationsFromAdViewer) {
        return CommonAdViewerExposedFunctionsKt.getConnectionType((DeviceInfoRepository) handleInvocationsFromAdViewer.getServiceProvider().getRegistry().getService("", fpf0.a(DeviceInfoRepository.class)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ExposedFunction invoke$lambda$16(HandleInvocationsFromAdViewer handleInvocationsFromAdViewer) {
        return CommonAdViewerExposedFunctionsKt.getPrivacyFsm((SessionRepository) handleInvocationsFromAdViewer.getServiceProvider().getRegistry().getService("", fpf0.a(SessionRepository.class)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ExposedFunction invoke$lambda$17(HandleInvocationsFromAdViewer handleInvocationsFromAdViewer) {
        return CommonAdViewerExposedFunctionsKt.setPrivacyFsm((SessionRepository) handleInvocationsFromAdViewer.getServiceProvider().getRegistry().getService("", fpf0.a(SessionRepository.class)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ExposedFunction invoke$lambda$18(HandleInvocationsFromAdViewer handleInvocationsFromAdViewer) {
        return CommonAdViewerExposedFunctionsKt.getPrivacy((SessionRepository) handleInvocationsFromAdViewer.getServiceProvider().getRegistry().getService("", fpf0.a(SessionRepository.class)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ExposedFunction invoke$lambda$19(HandleInvocationsFromAdViewer handleInvocationsFromAdViewer) {
        return CommonAdViewerExposedFunctionsKt.setPrivacy((SessionRepository) handleInvocationsFromAdViewer.getServiceProvider().getRegistry().getService("", fpf0.a(SessionRepository.class)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ExposedFunction invoke$lambda$2(HandleInvocationsFromAdViewer handleInvocationsFromAdViewer) {
        return CommonAdViewerExposedFunctionsKt.getDeviceVolume((DeviceInfoRepository) handleInvocationsFromAdViewer.getServiceProvider().getRegistry().getService("", fpf0.a(DeviceInfoRepository.class)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ExposedFunction invoke$lambda$20(HandleInvocationsFromAdViewer handleInvocationsFromAdViewer) {
        return CommonAdViewerExposedFunctionsKt.getAllowedPii((DeviceInfoRepository) handleInvocationsFromAdViewer.getServiceProvider().getRegistry().getService("", fpf0.a(DeviceInfoRepository.class)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ExposedFunction invoke$lambda$21(HandleInvocationsFromAdViewer handleInvocationsFromAdViewer) {
        return CommonAdViewerExposedFunctionsKt.setAllowedPii((DeviceInfoRepository) handleInvocationsFromAdViewer.getServiceProvider().getRegistry().getService("", fpf0.a(DeviceInfoRepository.class)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ExposedFunction invoke$lambda$22(HandleInvocationsFromAdViewer handleInvocationsFromAdViewer) {
        return CommonAdViewerExposedFunctionsKt.getSessionToken((SessionRepository) handleInvocationsFromAdViewer.getServiceProvider().getRegistry().getService("", fpf0.a(SessionRepository.class)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ExposedFunction invoke$lambda$23(HandleInvocationsFromAdViewer handleInvocationsFromAdViewer, AdObject adObject) {
        return CommonAdViewerExposedFunctionsKt.markCampaignStateShown((CampaignRepository) handleInvocationsFromAdViewer.getServiceProvider().getRegistry().getService("", fpf0.a(CampaignRepository.class)), adObject);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ExposedFunction invoke$lambda$24(HandleInvocationsFromAdViewer handleInvocationsFromAdViewer, AdObject adObject) {
        return CommonAdViewerExposedFunctionsKt.refreshAdData((Refresh) handleInvocationsFromAdViewer.getServiceProvider().getRegistry().getService("", fpf0.a(Refresh.class)), adObject);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ExposedFunction invoke$lambda$25(HandleInvocationsFromAdViewer handleInvocationsFromAdViewer, AdObject adObject) {
        return CommonAdViewerExposedFunctionsKt.updateCampaignState((CampaignRepository) handleInvocationsFromAdViewer.getServiceProvider().getRegistry().getService("", fpf0.a(CampaignRepository.class)), adObject);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ExposedFunction invoke$lambda$27(HandleInvocationsFromAdViewer handleInvocationsFromAdViewer) {
        return CommonAdViewerExposedFunctionsKt.sendPrivacyUpdateRequest((SendPrivacyUpdateRequest) handleInvocationsFromAdViewer.getServiceProvider().getRegistry().getService("", fpf0.a(SendPrivacyUpdateRequest.class)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ExposedFunction invoke$lambda$28(HandleInvocationsFromAdViewer handleInvocationsFromAdViewer, AdObject adObject) {
        return CommonAdViewerExposedFunctionsKt.sendDiagnosticEvent((SendDiagnosticEvent) handleInvocationsFromAdViewer.getServiceProvider().getRegistry().getService("", fpf0.a(SendDiagnosticEvent.class)), adObject);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ExposedFunction invoke$lambda$29(HandleInvocationsFromAdViewer handleInvocationsFromAdViewer) {
        return CommonAdViewerExposedFunctionsKt.incrementBannerImpressionCount((SessionRepository) handleInvocationsFromAdViewer.getServiceProvider().getRegistry().getService("", fpf0.a(SessionRepository.class)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ExposedFunction invoke$lambda$3(HandleInvocationsFromAdViewer handleInvocationsFromAdViewer) {
        return CommonAdViewerExposedFunctionsKt.getDeviceMaxVolume((DeviceInfoRepository) handleInvocationsFromAdViewer.getServiceProvider().getRegistry().getService("", fpf0.a(DeviceInfoRepository.class)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ExposedFunction invoke$lambda$30(HandleInvocationsFromAdViewer handleInvocationsFromAdViewer, AdObject adObject) {
        return CommonAdViewerExposedFunctionsKt.download((CacheFile) handleInvocationsFromAdViewer.getServiceProvider().getRegistry().getService("", fpf0.a(CacheFile.class)), adObject, (SessionRepository) handleInvocationsFromAdViewer.getServiceProvider().getRegistry().getService("", fpf0.a(SessionRepository.class)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ExposedFunction invoke$lambda$31(HandleInvocationsFromAdViewer handleInvocationsFromAdViewer, AdObject adObject) {
        return CommonAdViewerExposedFunctionsKt.downloadWithProgress((CacheFile) handleInvocationsFromAdViewer.getServiceProvider().getRegistry().getService("", fpf0.a(CacheFile.class)), adObject);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ExposedFunction invoke$lambda$32(HandleInvocationsFromAdViewer handleInvocationsFromAdViewer) {
        return CommonAdViewerExposedFunctionsKt.isFileCached((GetIsFileCache) handleInvocationsFromAdViewer.getServiceProvider().getRegistry().getService("", fpf0.a(GetIsFileCache.class)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ExposedFunction invoke$lambda$33(HandleInvocationsFromAdViewer handleInvocationsFromAdViewer, AdObject adObject) {
        return CommonAdViewerExposedFunctionsKt.omStartSession((AndroidOmInteraction) handleInvocationsFromAdViewer.getServiceProvider().getRegistry().getService("", fpf0.a(AndroidOmInteraction.class)), adObject);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ExposedFunction invoke$lambda$34(HandleInvocationsFromAdViewer handleInvocationsFromAdViewer, AdObject adObject) {
        return CommonAdViewerExposedFunctionsKt.omFinishSession((OmFinishSession) handleInvocationsFromAdViewer.getServiceProvider().getRegistry().getService("", fpf0.a(OmFinishSession.class)), adObject);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ExposedFunction invoke$lambda$35(HandleInvocationsFromAdViewer handleInvocationsFromAdViewer, AdObject adObject) {
        return CommonAdViewerExposedFunctionsKt.omImpression((OmImpressionOccurred) handleInvocationsFromAdViewer.getServiceProvider().getRegistry().getService("", fpf0.a(OmImpressionOccurred.class)), adObject);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ExposedFunction invoke$lambda$36(HandleInvocationsFromAdViewer handleInvocationsFromAdViewer) {
        return CommonAdViewerExposedFunctionsKt.omGetData((GetOmData) handleInvocationsFromAdViewer.getServiceProvider().getRegistry().getService("", fpf0.a(GetOmData.class)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ExposedFunction invoke$lambda$37(HandleInvocationsFromAdViewer handleInvocationsFromAdViewer) {
        return CommonAdViewerExposedFunctionsKt.isAttributionAvailable((AndroidAttribution) handleInvocationsFromAdViewer.getServiceProvider().getRegistry().getService("", fpf0.a(AndroidAttribution.class)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ExposedFunction invoke$lambda$38(HandleInvocationsFromAdViewer handleInvocationsFromAdViewer, AdObject adObject) {
        return CommonAdViewerExposedFunctionsKt.attributionRegisterView((AndroidAttribution) handleInvocationsFromAdViewer.getServiceProvider().getRegistry().getService("", fpf0.a(AndroidAttribution.class)), adObject);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ExposedFunction invoke$lambda$39(HandleInvocationsFromAdViewer handleInvocationsFromAdViewer, AdObject adObject) {
        return CommonAdViewerExposedFunctionsKt.attributionRegisterClick((AndroidAttribution) handleInvocationsFromAdViewer.getServiceProvider().getRegistry().getService("", fpf0.a(AndroidAttribution.class)), adObject);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ExposedFunction invoke$lambda$4(HandleInvocationsFromAdViewer handleInvocationsFromAdViewer) {
        return CommonAdViewerExposedFunctionsKt.getScreenHeight((DeviceInfoRepository) handleInvocationsFromAdViewer.getServiceProvider().getRegistry().getService("", fpf0.a(DeviceInfoRepository.class)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ExposedFunction invoke$lambda$40(HandleInvocationsFromAdViewer handleInvocationsFromAdViewer, AdObject adObject) {
        return CommonAdViewerExposedFunctionsKt.hbTokenIncrementWins((SessionRepository) handleInvocationsFromAdViewer.getServiceProvider().getRegistry().getService("", fpf0.a(SessionRepository.class)), adObject);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ExposedFunction invoke$lambda$41(HandleInvocationsFromAdViewer handleInvocationsFromAdViewer) {
        return CommonAdViewerExposedFunctionsKt.hbTokenIncrementStarts((SessionRepository) handleInvocationsFromAdViewer.getServiceProvider().getRegistry().getService("", fpf0.a(SessionRepository.class)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ExposedFunction invoke$lambda$42(HandleInvocationsFromAdViewer handleInvocationsFromAdViewer) {
        return CommonAdViewerExposedFunctionsKt.hbTokenReset((SessionRepository) handleInvocationsFromAdViewer.getServiceProvider().getRegistry().getService("", fpf0.a(SessionRepository.class)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ExposedFunction invoke$lambda$43(HandleInvocationsFromAdViewer handleInvocationsFromAdViewer, AdObject adObject) {
        return CommonAdViewerExposedFunctionsKt.loadOfferwallAd((LoadOfferwallAd) handleInvocationsFromAdViewer.getServiceProvider().getRegistry().getService("", fpf0.a(LoadOfferwallAd.class)), adObject);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ExposedFunction invoke$lambda$45(HandleInvocationsFromAdViewer handleInvocationsFromAdViewer) {
        return CommonAdViewerExposedFunctionsKt.isOfferwallAdReady((GetIsOfferwallAdReady) handleInvocationsFromAdViewer.getServiceProvider().getRegistry().getService("", fpf0.a(GetIsOfferwallAdReady.class)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ExposedFunction invoke$lambda$46(HandleInvocationsFromAdViewer handleInvocationsFromAdViewer) {
        return CommonAdViewerExposedFunctionsKt.request(RequestType.GET, (ExecuteAdViewerRequest) handleInvocationsFromAdViewer.getServiceProvider().getRegistry().getService("", fpf0.a(ExecuteAdViewerRequest.class)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ExposedFunction invoke$lambda$47(HandleInvocationsFromAdViewer handleInvocationsFromAdViewer) {
        return CommonAdViewerExposedFunctionsKt.request(RequestType.POST, (ExecuteAdViewerRequest) handleInvocationsFromAdViewer.getServiceProvider().getRegistry().getService("", fpf0.a(ExecuteAdViewerRequest.class)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ExposedFunction invoke$lambda$48(HandleInvocationsFromAdViewer handleInvocationsFromAdViewer) {
        return CommonAdViewerExposedFunctionsKt.request(RequestType.HEAD, (ExecuteAdViewerRequest) handleInvocationsFromAdViewer.getServiceProvider().getRegistry().getService("", fpf0.a(ExecuteAdViewerRequest.class)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ExposedFunction invoke$lambda$5(HandleInvocationsFromAdViewer handleInvocationsFromAdViewer) {
        return CommonAdViewerExposedFunctionsKt.getScreenWidth((DeviceInfoRepository) handleInvocationsFromAdViewer.getServiceProvider().getRegistry().getService("", fpf0.a(DeviceInfoRepository.class)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ExposedFunction invoke$lambda$50(HandleInvocationsFromAdViewer handleInvocationsFromAdViewer, AdObject adObject) {
        return CommonAdViewerExposedFunctionsKt.getExtra((SessionRepository) handleInvocationsFromAdViewer.getServiceProvider().getRegistry().getService("", fpf0.a(SessionRepository.class)), adObject);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ExposedFunction invoke$lambda$6(AdObject adObject, HandleInvocationsFromAdViewer handleInvocationsFromAdViewer) {
        return CommonAdViewerExposedFunctionsKt.openUrl(adObject, (HandleOpenUrl) handleInvocationsFromAdViewer.getServiceProvider().getRegistry().getService("", fpf0.a(HandleOpenUrl.class)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ExposedFunction invoke$lambda$8(HandleInvocationsFromAdViewer handleInvocationsFromAdViewer, AdObject adObject) {
        return CommonAdViewerExposedFunctionsKt.sendOperativeEvent((GetOperativeEventApi) handleInvocationsFromAdViewer.getServiceProvider().getRegistry().getService("", fpf0.a(GetOperativeEventApi.class)), adObject);
    }

    @Override // com.unity3d.services.core.di.IServiceComponent
    public IServiceProvider getServiceProvider() {
        return IServiceComponent.DefaultImpls.getServiceProvider(this);
    }

    public final Map<String, gzs<ExposedFunction>> invoke(String str, String str2, String str3, AdObject adObject) {
        return pn00.k(new Pair(ExposedFunctionLocation.GET_AD_CONTEXT, new q9s(this, AdData.m44constructorimpl(str), ImpressionConfig.m65constructorimpl(str3), AdDataRefreshToken.m51constructorimpl(str2), adObject, 1)), new Pair(ExposedFunctionLocation.GET_CONNECTION_TYPE, new kbe(this, 27)), new Pair(ExposedFunctionLocation.GET_DEVICE_VOLUME, new xyh(this, 19)), new Pair(ExposedFunctionLocation.GET_DEVICE_MAX_VOLUME, new fgm(this, 13)), new Pair(ExposedFunctionLocation.GET_SCREEN_HEIGHT, new wnh(this, 18)), new Pair(ExposedFunctionLocation.GET_SCREEN_WIDTH, new sim(this, 10)), new Pair(ExposedFunctionLocation.OPEN_URL, new yk(10, adObject, this)), new Pair(ExposedFunctionLocation.SET_ORIENTATION, new m1o(adObject, 11)), new Pair(ExposedFunctionLocation.SEND_OPERATIVE_EVENT, new lb6(14, this, adObject)), new Pair(ExposedFunctionLocation.STORAGE_WRITE, new cu1(14)), new Pair(ExposedFunctionLocation.STORAGE_READ, new sk4(17)), new Pair(ExposedFunctionLocation.STORAGE_DELETE, new g(18)), new Pair(ExposedFunctionLocation.STORAGE_CLEAR, new wb1(14)), new Pair(ExposedFunctionLocation.STORAGE_GET_KEYS, new vg0(16)), new Pair(ExposedFunctionLocation.STORAGE_GET, new bu0(13)), new Pair(ExposedFunctionLocation.STORAGE_SET, new kr6(12)), new Pair(ExposedFunctionLocation.GET_PRIVACY_FSM, new u3k(this, 18)), new Pair(ExposedFunctionLocation.SET_PRIVACY_FSM, new w8q(this, 7)), new Pair(ExposedFunctionLocation.GET_PRIVACY, new n5i(this, 22)), new Pair(ExposedFunctionLocation.SET_PRIVACY, new yce(this, 24)), new Pair(ExposedFunctionLocation.GET_ALLOWED_PII, new jpf(this, 25)), new Pair(ExposedFunctionLocation.SET_ALLOWED_PII, new sfg(this, 23)), new Pair(ExposedFunctionLocation.GET_SESSION_TOKEN, new m2j(this, 16)), new Pair(ExposedFunctionLocation.MARK_CAMPAIGN_STATE_SHOWN, new k(13, this, adObject)), new Pair(ExposedFunctionLocation.REFRESH_AD_DATA, new l(13, this, adObject)), new Pair(ExposedFunctionLocation.UPDATE_CAMPAIGN_STATE, new m(8, this, adObject)), new Pair(ExposedFunctionLocation.UPDATE_TRACKING_TOKEN, new cvs(adObject, 3)), new Pair(ExposedFunctionLocation.SEND_PRIVACY_UPDATE_REQUEST, new gbh(this, 22)), new Pair(ExposedFunctionLocation.SEND_DIAGNOSTIC_EVENT, new xg2(6, this, adObject)), new Pair(ExposedFunctionLocation.INCREMENT_BANNER_IMPRESSION_COUNT, new akh(this, 23)), new Pair(ExposedFunctionLocation.DOWNLOAD, new ie3(13, this, adObject)), new Pair(ExposedFunctionLocation.DOWNLOAD_WITH_PROGRESS, new qg1(11, this, adObject)), new Pair(ExposedFunctionLocation.IS_FILE_CACHED, new cfl(this, 14)), new Pair(ExposedFunctionLocation.OM_START_SESSION, new com.vk.movika.sdk.base.logic.interactor.c(12, this, adObject)), new Pair(ExposedFunctionLocation.OM_FINISH_SESSION, new fk(8, this, adObject)), new Pair(ExposedFunctionLocation.OM_IMPRESSION, new com.vk.catalog2.common.ui.holders.a(14, this, adObject)), new Pair(ExposedFunctionLocation.OM_GET_DATA, new wzh(this, 14)), new Pair(ExposedFunctionLocation.IS_ATTRIBUTION_AVAILABLE, new ecm(this, 14)), new Pair(ExposedFunctionLocation.ATTRIBUTION_REGISTER_VIEW, new hn9(12, this, adObject)), new Pair(ExposedFunctionLocation.ATTRIBUTION_REGISTER_CLICK, new rp1(12, this, adObject)), new Pair(ExposedFunctionLocation.HEADER_BIDDING_TOKEN_INCREMENT_WINS, new r0(12, this, adObject)), new Pair(ExposedFunctionLocation.HEADER_BIDDING_TOKEN_INCREMENT_STARTS, new foi(this, 11)), new Pair(ExposedFunctionLocation.HEADER_BIDDING_TOKEN_RESET, new n1i(this, 17)), new Pair(ExposedFunctionLocation.LOAD_OFFERWALL_AD, new pk(11, this, adObject)), new Pair(ExposedFunctionLocation.SHOW_OFFERWALL_AD, new e20(14)), new Pair(ExposedFunctionLocation.IS_OFFERWALL_AD_READY, new m3g(this, 22)), new Pair(ExposedFunctionLocation.REQUEST_GET, new qfj(this, 9)), new Pair(ExposedFunctionLocation.REQUEST_POST, new w4u(this, 2)), new Pair(ExposedFunctionLocation.REQUEST_HEAD, new pvh(this, 10)), new Pair(ExposedFunctionLocation.SET_OPPORTUNITY_TTL, new obh(adObject, 13)), new Pair(ExposedFunctionLocation.GET_EXTRA, new xk(16, this, adObject)));
    }
}
