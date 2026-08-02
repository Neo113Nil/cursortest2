package com.unity3d.services.core.di;

import android.content.Context;
import com.unity3d.ads.adplayer.AdPlayerScope;
import com.unity3d.ads.adplayer.AndroidWebViewClient;
import com.unity3d.ads.core.configuration.AndroidManifestIntPropertyReader;
import com.unity3d.ads.core.configuration.AndroidManifestStringPropertyReader;
import com.unity3d.ads.core.configuration.GameServerIdReader;
import com.unity3d.ads.core.configuration.MediationInitBlobMetadataReader;
import com.unity3d.ads.core.configuration.MediationTraitsMetadataReader;
import com.unity3d.ads.core.data.datasource.AdQualityVersionDataSource;
import com.unity3d.ads.core.data.datasource.AnalyticsDataSource;
import com.unity3d.ads.core.data.datasource.AndroidAdQualityVersionDataSource;
import com.unity3d.ads.core.data.datasource.AndroidAnalyticsDataSource;
import com.unity3d.ads.core.data.datasource.AndroidAppSetIdDataSource;
import com.unity3d.ads.core.data.datasource.AndroidDeveloperConsentDataSource;
import com.unity3d.ads.core.data.datasource.AndroidDynamicDeviceInfoDataSource;
import com.unity3d.ads.core.data.datasource.AndroidFIdDataSource;
import com.unity3d.ads.core.data.datasource.AndroidFIdExistenceDataSource;
import com.unity3d.ads.core.data.datasource.AndroidGoogleAppIdDataSource;
import com.unity3d.ads.core.data.datasource.AndroidInstallReferrerDataSource;
import com.unity3d.ads.core.data.datasource.AndroidLegacyConfigStoreDataSource;
import com.unity3d.ads.core.data.datasource.AndroidLegacyUserConsentDataSource;
import com.unity3d.ads.core.data.datasource.AndroidLifecycleDataSource;
import com.unity3d.ads.core.data.datasource.AndroidLocalCacheDataSource;
import com.unity3d.ads.core.data.datasource.AndroidMediationDataSource;
import com.unity3d.ads.core.data.datasource.AndroidPrivacyDeviceInfoDataSource;
import com.unity3d.ads.core.data.datasource.AndroidRemoteCacheDataSource;
import com.unity3d.ads.core.data.datasource.AndroidStaticDeviceInfoDataSource;
import com.unity3d.ads.core.data.datasource.AndroidStoreDataSource;
import com.unity3d.ads.core.data.datasource.AndroidTcfDataSource;
import com.unity3d.ads.core.data.datasource.AndroidUnityBootConfigDataSource;
import com.unity3d.ads.core.data.datasource.AndroidUnityInfoDataSource;
import com.unity3d.ads.core.data.datasource.AppForegroundDurationObserver;
import com.unity3d.ads.core.data.datasource.ByteStringDataSource;
import com.unity3d.ads.core.data.datasource.CacheDataSource;
import com.unity3d.ads.core.data.datasource.CachedFIdDataSource;
import com.unity3d.ads.core.data.datasource.DeveloperConsentDataSource;
import com.unity3d.ads.core.data.datasource.DynamicDeviceInfoDataSource;
import com.unity3d.ads.core.data.datasource.FIdDataSource;
import com.unity3d.ads.core.data.datasource.FIdExistenceDataSource;
import com.unity3d.ads.core.data.datasource.FetchGLInfoDataMigration;
import com.unity3d.ads.core.data.datasource.ForegroundDurationReader;
import com.unity3d.ads.core.data.datasource.GoogleAppIdDataSource;
import com.unity3d.ads.core.data.datasource.InstallReferrerDataSource;
import com.unity3d.ads.core.data.datasource.LegacyUserConsentDataSource;
import com.unity3d.ads.core.data.datasource.LifecycleDataSource;
import com.unity3d.ads.core.data.datasource.MaxAdRevenueListener;
import com.unity3d.ads.core.data.datasource.MediationDataSource;
import com.unity3d.ads.core.data.datasource.PrivacyDeviceInfoDataSource;
import com.unity3d.ads.core.data.datasource.StaticDeviceInfoDataSource;
import com.unity3d.ads.core.data.datasource.StoreDataSource;
import com.unity3d.ads.core.data.datasource.TcfDataSource;
import com.unity3d.ads.core.data.datasource.UnityBootConfigDataSource;
import com.unity3d.ads.core.data.datasource.UniversalRequestDataSource;
import com.unity3d.ads.core.data.datasource.UniversalRequestDataStoreProvider;
import com.unity3d.ads.core.data.datasource.WebviewConfigurationDataSource;
import com.unity3d.ads.core.data.manager.AndroidOfferwallManager;
import com.unity3d.ads.core.data.manager.AndroidOmidManager;
import com.unity3d.ads.core.data.manager.AndroidSDKPropertiesManager;
import com.unity3d.ads.core.data.manager.AndroidStorageManager;
import com.unity3d.ads.core.data.manager.OfferwallManager;
import com.unity3d.ads.core.data.manager.OmidManager;
import com.unity3d.ads.core.data.manager.SDKPropertiesManager;
import com.unity3d.ads.core.data.manager.StorageManager;
import com.unity3d.ads.core.data.manager.TransactionEventManager;
import com.unity3d.ads.core.data.model.GatewayUrl;
import com.unity3d.ads.core.data.model.OperationType;
import com.unity3d.ads.core.data.repository.AdRepository;
import com.unity3d.ads.core.data.repository.AdRevenueRepository;
import com.unity3d.ads.core.data.repository.AndroidAdRepository;
import com.unity3d.ads.core.data.repository.AndroidAdRevenueRepository;
import com.unity3d.ads.core.data.repository.AndroidCacheRepository;
import com.unity3d.ads.core.data.repository.AndroidCampaignRepository;
import com.unity3d.ads.core.data.repository.AndroidDeveloperConsentRepository;
import com.unity3d.ads.core.data.repository.AndroidDeviceInfoRepository;
import com.unity3d.ads.core.data.repository.AndroidDiagnosticEventRepository;
import com.unity3d.ads.core.data.repository.AndroidLegacyUserConsentRepository;
import com.unity3d.ads.core.data.repository.AndroidMediationRepository;
import com.unity3d.ads.core.data.repository.AndroidOpenMeasurementRepository;
import com.unity3d.ads.core.data.repository.AndroidSessionRepository;
import com.unity3d.ads.core.data.repository.AndroidTcfRepository;
import com.unity3d.ads.core.data.repository.AndroidTransactionEventRepository;
import com.unity3d.ads.core.data.repository.CacheRepository;
import com.unity3d.ads.core.data.repository.CampaignRepository;
import com.unity3d.ads.core.data.repository.DeveloperConsentRepository;
import com.unity3d.ads.core.data.repository.DeviceInfoRepository;
import com.unity3d.ads.core.data.repository.DiagnosticEventRepository;
import com.unity3d.ads.core.data.repository.FocusRepository;
import com.unity3d.ads.core.data.repository.LegacyUserConsentRepository;
import com.unity3d.ads.core.data.repository.MediationRepository;
import com.unity3d.ads.core.data.repository.OpenMeasurementRepository;
import com.unity3d.ads.core.data.repository.OperativeEventRepository;
import com.unity3d.ads.core.data.repository.OrientationRepository;
import com.unity3d.ads.core.data.repository.SessionRepository;
import com.unity3d.ads.core.data.repository.TcfRepository;
import com.unity3d.ads.core.data.repository.TransactionEventRepository;
import com.unity3d.ads.core.domain.AdRefresh;
import com.unity3d.ads.core.domain.AndroidAdRefresh;
import com.unity3d.ads.core.domain.AndroidBuildHeaderBiddingToken;
import com.unity3d.ads.core.domain.AndroidCacheAssets;
import com.unity3d.ads.core.domain.AndroidCacheWebViewAssets;
import com.unity3d.ads.core.domain.AndroidExecuteAdViewerRequest;
import com.unity3d.ads.core.domain.AndroidGenerateByteStringId;
import com.unity3d.ads.core.domain.AndroidGetAdDataRefreshRequest;
import com.unity3d.ads.core.domain.AndroidGetAdPlayerConfigRequest;
import com.unity3d.ads.core.domain.AndroidGetAdPlayerContext;
import com.unity3d.ads.core.domain.AndroidGetAdRequest;
import com.unity3d.ads.core.domain.AndroidGetAdRequestPolicy;
import com.unity3d.ads.core.domain.AndroidGetClientInfo;
import com.unity3d.ads.core.domain.AndroidGetInitializationCompletedRequest;
import com.unity3d.ads.core.domain.AndroidGetInitializationData;
import com.unity3d.ads.core.domain.AndroidGetInitializationRequest;
import com.unity3d.ads.core.domain.AndroidGetInitializationRequestPayload;
import com.unity3d.ads.core.domain.AndroidGetIsAdActivity;
import com.unity3d.ads.core.domain.AndroidGetLifecycleFlow;
import com.unity3d.ads.core.domain.AndroidGetLimitedSessionToken;
import com.unity3d.ads.core.domain.AndroidGetOpenGLRendererInfo;
import com.unity3d.ads.core.domain.AndroidGetSafeguardedInitializationPolicy;
import com.unity3d.ads.core.domain.AndroidGetSharedDataTimestamps;
import com.unity3d.ads.core.domain.AndroidGetUniversalRequestForPayLoad;
import com.unity3d.ads.core.domain.AndroidGetUniversalRequestSharedData;
import com.unity3d.ads.core.domain.AndroidGetWebViewContainerUseCase;
import com.unity3d.ads.core.domain.AndroidHandleFocusCounters;
import com.unity3d.ads.core.domain.AndroidHandleGatewayAdResponse;
import com.unity3d.ads.core.domain.AndroidHandleGatewayInitializationResponse;
import com.unity3d.ads.core.domain.AndroidHandleGatewayUniversalResponse;
import com.unity3d.ads.core.domain.AndroidHandleOpenUrl;
import com.unity3d.ads.core.domain.AndroidHttpClientProvider;
import com.unity3d.ads.core.domain.AndroidInitializeBoldSDK;
import com.unity3d.ads.core.domain.AndroidIntentCreation;
import com.unity3d.ads.core.domain.AndroidLoad;
import com.unity3d.ads.core.domain.AndroidRefresh;
import com.unity3d.ads.core.domain.AndroidRemoveUrlQuery;
import com.unity3d.ads.core.domain.AndroidSendDiagnosticEvent;
import com.unity3d.ads.core.domain.AndroidSendWebViewClientErrorDiagnostics;
import com.unity3d.ads.core.domain.AndroidShow;
import com.unity3d.ads.core.domain.AndroidTestDataInfo;
import com.unity3d.ads.core.domain.AndroidTriggerInitializationCompletedRequest;
import com.unity3d.ads.core.domain.AwaitInitialization;
import com.unity3d.ads.core.domain.BuildHeaderBiddingToken;
import com.unity3d.ads.core.domain.CacheAssets;
import com.unity3d.ads.core.domain.CacheFile;
import com.unity3d.ads.core.domain.CacheWebViewAssets;
import com.unity3d.ads.core.domain.CheckForGameIdAndTestModeChanges;
import com.unity3d.ads.core.domain.CleanAssets;
import com.unity3d.ads.core.domain.CleanUpWhenOpportunityExpires;
import com.unity3d.ads.core.domain.CommonAwaitInitialization;
import com.unity3d.ads.core.domain.CommonCacheFile;
import com.unity3d.ads.core.domain.CommonCheckForGameIdAndTestModeChanges;
import com.unity3d.ads.core.domain.CommonCleanAssets;
import com.unity3d.ads.core.domain.CommonCreateFile;
import com.unity3d.ads.core.domain.CommonGetAdObject;
import com.unity3d.ads.core.domain.CommonGetAdPlayer;
import com.unity3d.ads.core.domain.CommonGetCacheDirectory;
import com.unity3d.ads.core.domain.CommonGetFileExtensionFromUrl;
import com.unity3d.ads.core.domain.CommonGetGameId;
import com.unity3d.ads.core.domain.CommonGetHeaderBiddingToken;
import com.unity3d.ads.core.domain.CommonGetInitializationState;
import com.unity3d.ads.core.domain.CommonGetIsFileCache;
import com.unity3d.ads.core.domain.CommonGetWebViewBridgeUseCase;
import com.unity3d.ads.core.domain.CommonInitAwaitingGetHeaderBiddingToken;
import com.unity3d.ads.core.domain.CommonMediationInfoConverter;
import com.unity3d.ads.core.domain.CommonMediationProviderParser;
import com.unity3d.ads.core.domain.CommonSafeCallbackInvoke;
import com.unity3d.ads.core.domain.CommonSetGameId;
import com.unity3d.ads.core.domain.CommonSetInitializationState;
import com.unity3d.ads.core.domain.CommonShouldAllowInitialization;
import com.unity3d.ads.core.domain.CommonTokenNumberProvider;
import com.unity3d.ads.core.domain.CommonValidateGameId;
import com.unity3d.ads.core.domain.CreateFile;
import com.unity3d.ads.core.domain.ExecuteAdViewerRequest;
import com.unity3d.ads.core.domain.GetAdDataRefreshRequest;
import com.unity3d.ads.core.domain.GetAdObject;
import com.unity3d.ads.core.domain.GetAdPlayer;
import com.unity3d.ads.core.domain.GetAdPlayerConfigRequest;
import com.unity3d.ads.core.domain.GetAdRequest;
import com.unity3d.ads.core.domain.GetAssetFileName;
import com.unity3d.ads.core.domain.GetAsyncHeaderBiddingToken;
import com.unity3d.ads.core.domain.GetByteStringId;
import com.unity3d.ads.core.domain.GetCacheDirectory;
import com.unity3d.ads.core.domain.GetCachedAsset;
import com.unity3d.ads.core.domain.GetClientInfo;
import com.unity3d.ads.core.domain.GetFileExtensionFromUrl;
import com.unity3d.ads.core.domain.GetGameId;
import com.unity3d.ads.core.domain.GetHeaderBiddingToken;
import com.unity3d.ads.core.domain.GetInitRequestPolicy;
import com.unity3d.ads.core.domain.GetInitializationCompletedRequest;
import com.unity3d.ads.core.domain.GetInitializationData;
import com.unity3d.ads.core.domain.GetInitializationRequest;
import com.unity3d.ads.core.domain.GetInitializationRequestPayload;
import com.unity3d.ads.core.domain.GetInitializationState;
import com.unity3d.ads.core.domain.GetIsFileCache;
import com.unity3d.ads.core.domain.GetLatestWebViewConfiguration;
import com.unity3d.ads.core.domain.GetLimitedSessionToken;
import com.unity3d.ads.core.domain.GetOpenGLRendererInfo;
import com.unity3d.ads.core.domain.GetOperativeEventRequestPolicy;
import com.unity3d.ads.core.domain.GetOtherRequestPolicy;
import com.unity3d.ads.core.domain.GetPrivacyUpdateRequest;
import com.unity3d.ads.core.domain.GetRequestPolicy;
import com.unity3d.ads.core.domain.GetSafeguardedInitializationPolicy;
import com.unity3d.ads.core.domain.GetSharedDataTimestamps;
import com.unity3d.ads.core.domain.GetUniversalRequestForPayLoad;
import com.unity3d.ads.core.domain.GetUniversalRequestSharedData;
import com.unity3d.ads.core.domain.GetWebViewBridgeUseCase;
import com.unity3d.ads.core.domain.HandleDebugSettings;
import com.unity3d.ads.core.domain.HandleGatewayAdResponse;
import com.unity3d.ads.core.domain.HandleGatewayInitializationResponse;
import com.unity3d.ads.core.domain.HandleGatewayUniversalResponse;
import com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer;
import com.unity3d.ads.core.domain.HandleOpenUrl;
import com.unity3d.ads.core.domain.HttpClientProvider;
import com.unity3d.ads.core.domain.InitializeBoldSDK;
import com.unity3d.ads.core.domain.IntentCreation;
import com.unity3d.ads.core.domain.LegacyLoadUseCase;
import com.unity3d.ads.core.domain.LegacyShowUseCase;
import com.unity3d.ads.core.domain.Load;
import com.unity3d.ads.core.domain.MediationInfoConverter;
import com.unity3d.ads.core.domain.MediationProviderParser;
import com.unity3d.ads.core.domain.Refresh;
import com.unity3d.ads.core.domain.RemoveUrlQuery;
import com.unity3d.ads.core.domain.SafeCallbackInvoke;
import com.unity3d.ads.core.domain.SendDiagnosticEvent;
import com.unity3d.ads.core.domain.SendPrivacyUpdateRequest;
import com.unity3d.ads.core.domain.SendWebViewClientErrorDiagnostics;
import com.unity3d.ads.core.domain.SetGameId;
import com.unity3d.ads.core.domain.SetInitializationState;
import com.unity3d.ads.core.domain.ShouldAllowInitialization;
import com.unity3d.ads.core.domain.Show;
import com.unity3d.ads.core.domain.TokenNumberProvider;
import com.unity3d.ads.core.domain.TriggerInitializationCompletedRequest;
import com.unity3d.ads.core.domain.TriggerInitializeListener;
import com.unity3d.ads.core.domain.ValidateExtrasSize;
import com.unity3d.ads.core.domain.ValidateGameId;
import com.unity3d.ads.core.domain.adload.AndroidWebViewLessLoadStrategy;
import com.unity3d.ads.core.domain.adload.WebViewLessLoadStrategy;
import com.unity3d.ads.core.domain.adquality.AndroidInitializeAdQuality;
import com.unity3d.ads.core.domain.adquality.AndroidUpdateAdQualitySessionToken;
import com.unity3d.ads.core.domain.adquality.InitializeAdQuality;
import com.unity3d.ads.core.domain.adquality.UpdateAdQualitySessionToken;
import com.unity3d.ads.core.domain.attribution.AndroidAttribution;
import com.unity3d.ads.core.domain.billing.CommonProductDetailsFetcher;
import com.unity3d.ads.core.domain.billing.IsBillingClientAvailable;
import com.unity3d.ads.core.domain.billing.ProductDetailsFetcher;
import com.unity3d.ads.core.domain.billing.ProductDetailsFetcherWithFallback;
import com.unity3d.ads.core.domain.coherence.AndroidCoherenceLibraryManager;
import com.unity3d.ads.core.domain.coherence.CoherenceLibraryManager;
import com.unity3d.ads.core.domain.events.AdRevenueObserver;
import com.unity3d.ads.core.domain.events.AndroidGetAdRevenueEventData;
import com.unity3d.ads.core.domain.events.AndroidGetTransactionData;
import com.unity3d.ads.core.domain.events.AndroidHandleGatewayEventResponse;
import com.unity3d.ads.core.domain.events.CommonGetTransactionRequest;
import com.unity3d.ads.core.domain.events.CommonUniversalRequestTtlValidator;
import com.unity3d.ads.core.domain.events.DiagnosticEventObserver;
import com.unity3d.ads.core.domain.events.EventObservers;
import com.unity3d.ads.core.domain.events.GetAdRevenueEventData;
import com.unity3d.ads.core.domain.events.GetDiagnosticEventBatchRequest;
import com.unity3d.ads.core.domain.events.GetDiagnosticEventRequest;
import com.unity3d.ads.core.domain.events.GetOperativeEventApi;
import com.unity3d.ads.core.domain.events.GetOperativeEventRequest;
import com.unity3d.ads.core.domain.events.GetTransactionData;
import com.unity3d.ads.core.domain.events.GetTransactionRequest;
import com.unity3d.ads.core.domain.events.HandleAdRevenueEvent;
import com.unity3d.ads.core.domain.events.HandleGatewayEventResponse;
import com.unity3d.ads.core.domain.events.LifecycleEventObserver;
import com.unity3d.ads.core.domain.events.MaxAdRevenueCommunicatorProxyFactory;
import com.unity3d.ads.core.domain.events.MaxAdRevenueObserver;
import com.unity3d.ads.core.domain.events.OperativeEventObserver;
import com.unity3d.ads.core.domain.events.TransactionEventObserver;
import com.unity3d.ads.core.domain.events.UniversalRequestEventSender;
import com.unity3d.ads.core.domain.events.UniversalRequestTtlValidator;
import com.unity3d.ads.core.domain.offerwall.GetIsOfferwallAdReady;
import com.unity3d.ads.core.domain.offerwall.LoadOfferwallAd;
import com.unity3d.ads.core.domain.om.AndroidInitializeOMSDK;
import com.unity3d.ads.core.domain.om.AndroidOmFinishSession;
import com.unity3d.ads.core.domain.om.AndroidOmImpressionOccurred;
import com.unity3d.ads.core.domain.om.AndroidOmInteraction;
import com.unity3d.ads.core.domain.om.AndroidOmStartSession;
import com.unity3d.ads.core.domain.om.CommonGetOmData;
import com.unity3d.ads.core.domain.om.CommonIsOMActivated;
import com.unity3d.ads.core.domain.om.GetOmData;
import com.unity3d.ads.core.domain.om.InitializeOMSDK;
import com.unity3d.ads.core.domain.om.IsOMActivated;
import com.unity3d.ads.core.domain.om.OmFinishSession;
import com.unity3d.ads.core.domain.om.OmImpressionOccurred;
import com.unity3d.ads.core.domain.privacy.DeveloperConsentFlattenerRulesUseCase;
import com.unity3d.ads.core.domain.privacy.FlattenerRulesUseCase;
import com.unity3d.ads.core.domain.privacy.LegacyUserConsentFlattenerRulesUseCase;
import com.unity3d.ads.core.domain.work.BackgroundWorker;
import com.unity3d.ads.core.domain.work.DiagnosticEventRequestWorkModifier;
import com.unity3d.ads.core.domain.work.DownloadPriorityQueue;
import com.unity3d.ads.core.log.Logger;
import com.unity3d.ads.core.log.UnityLogger;
import com.unity3d.ads.core.utils.CommonCoroutineTimer;
import com.unity3d.ads.core.utils.CoroutineTimer;
import com.unity3d.ads.gatewayclient.AndroidRequestUrlFactory;
import com.unity3d.ads.gatewayclient.CommonGatewayClient;
import com.unity3d.ads.gatewayclient.GatewayClient;
import com.unity3d.ads.gatewayclient.RequestUrlFactory;
import com.unity3d.services.SDKErrorHandler;
import com.unity3d.services.ads.offerwall.OfferwallAdapterBridge;
import com.unity3d.services.core.device.VolumeChange;
import com.unity3d.services.core.device.VolumeChangeContentObserver;
import com.unity3d.services.core.di.ServiceProvider;
import com.unity3d.services.core.domain.ISDKDispatchers;
import com.unity3d.services.core.fid.Constants;
import com.unity3d.services.core.misc.JsonStorage;
import com.unity3d.services.core.network.core.CronetEngineBuilderFactory;
import com.unity3d.services.core.network.core.HttpClient;
import com.unity3d.services.core.network.domain.CleanupDirectory;
import com.unity3d.services.core.reflection.AppLovinCommunicatorBridge;
import com.unity3d.services.store.StoreMonitor;
import com.unity3d.services.store.core.GatewayStoreExceptionHandler;
import com.unity3d.services.store.core.StoreExceptionHandler;
import com.unity3d.services.store.gpbl.bridges.billingclient.BillingClientAdapter;
import com.unity3d.services.store.gpbl.bridges.billingclient.BillingClientAdapterFactory;
import com.vk.movika.sdk.base.ui.i;
import com.vk.movika.sdk.base.ui.r;
import com.vk.movika.sdk.base.ui.r0;
import gatewayprotocol.v1.NativeConfigurationOuterClass;
import kotlin.coroutines.EmptyCoroutineContext;
import ru.ok.android.webrtc.Privacy;
import xsna.a94;
import xsna.ajd0;
import xsna.b1z;
import xsna.b290;
import xsna.b410;
import xsna.b990;
import xsna.bi80;
import xsna.bpc0;
import xsna.c2c0;
import xsna.c6;
import xsna.c950;
import xsna.cf00;
import xsna.cg1;
import xsna.d2c0;
import xsna.da50;
import xsna.daz;
import xsna.dgc0;
import xsna.e3c0;
import xsna.eyx;
import xsna.f550;
import xsna.fd90;
import xsna.fpf0;
import xsna.fuk;
import xsna.fvk;
import xsna.g4;
import xsna.gd70;
import xsna.gkc0;
import xsna.gvs;
import xsna.gzs;
import xsna.hj60;
import xsna.hk70;
import xsna.hri0;
import xsna.i440;
import xsna.i8c0;
import xsna.ia90;
import xsna.ie3;
import xsna.iia0;
import xsna.io60;
import xsna.iri0;
import xsna.iud0;
import xsna.jaa0;
import xsna.k5f0;
import xsna.kcc0;
import xsna.kg;
import xsna.ko60;
import xsna.l63;
import xsna.l9;
import xsna.ltb0;
import xsna.lva0;
import xsna.mk;
import xsna.ml7;
import xsna.msy;
import xsna.myc0;
import xsna.ob0;
import xsna.oe5;
import xsna.ovj;
import xsna.pdh0;
import xsna.pk;
import xsna.pm60;
import xsna.pvh0;
import xsna.pvj;
import xsna.qbc0;
import xsna.qbe0;
import xsna.qg1;
import xsna.qk;
import xsna.qkd0;
import xsna.qsd0;
import xsna.rf20;
import xsna.rka0;
import xsna.rme0;
import xsna.rp1;
import xsna.rs0;
import xsna.s3q0;
import xsna.s7c0;
import xsna.stg0;
import xsna.su80;
import xsna.tbe0;
import xsna.tqf0;
import xsna.u110;
import xsna.uh80;
import xsna.ume0;
import xsna.vex;
import xsna.wm80;
import xsna.wqf0;
import xsna.x850;
import xsna.xg2;
import xsna.xqi0;
import xsna.xv0;
import xsna.yei0;
import xsna.yu60;
import xsna.yvj;
import xsna.z0h0;
import xsna.zv;

/* compiled from: ServiceProvider.kt */
/* loaded from: classes14.dex */
public final class ServiceProvider implements IServiceProvider {
    public static final String CDN_CREATIVES_HOST = "cdn-creatives-cf-prd.acquire.unity3dusercontent.com";
    public static final int CDN_CREATIVES_PORT = 443;
    public static final String DATA_STORE_GATEWAY_CACHE = "gateway_cache.pb";
    public static final String DATA_STORE_GL_INFO = "glinfo.pb";
    public static final String DATA_STORE_IAP_TRANSACTION = "iap_transaction.pb";
    public static final String DATA_STORE_NATIVE_CONFIG = "native_configuration.pb";
    public static final String DATA_STORE_PRIVACY = "privacy.pb";
    public static final String DATA_STORE_PRIVACY_FSM = "privacy_fsm.pb";
    public static final String DATA_STORE_UNIVERSAL_REQUEST = "universal_request.pb";
    public static final String DATA_STORE_WEBVIEW_CONFIG = "webview_config.pb";
    public static final String DEFAULT_DISPATCHER = "default_dispatcher";
    public static final String DEV_CONSENT_PRIVACY_RULES = "dev_consent_privacy_rules";
    public static final String DIAGNOSTICS_EVENT_SENDER = "diagnostics";
    public static final String GATEWAY_HOST = "gateway.unityads.unity3d.com";
    public static final int GATEWAY_PORT = 443;
    public static final long HTTP_CACHE_DISK_SIZE = 20971520;
    public static final long HTTP_CLIENT_FETCH_TIMEOUT = 500;
    public static final ServiceProvider INSTANCE;
    public static final String IO_DISPATCHER = "io_dispatcher";
    public static final String LEGACY_PRIVACY_RULES = "legacy_privacy_rules";
    public static final String MAIN_DISPATCHER = "main_dispatcher";
    public static final String NAMED_AD_REQ = "ad_req";
    public static final String NAMED_GET_TOKEN_SCOPE = "get_token_scope";
    public static final String NAMED_ILRD_SCOPE = "ilrd_scope";
    public static final String NAMED_INIT_REQ = "init_req";
    public static final String NAMED_INIT_SCOPE = "init_scope";
    public static final String NAMED_LIFECYCLE_SCOPE = "lifecycle_scope";
    public static final String NAMED_LOAD_SCOPE = "load_scope";
    public static final String NAMED_LOCAL = "local";
    public static final String NAMED_OFFERWALL_SCOPE = "offerwall_scope";
    public static final String NAMED_OMID_SCOPE = "omid_scope";
    public static final String NAMED_OPERATIVE_REQ = "op_event_req";
    public static final String NAMED_OTHER_REQ = "other_req";
    public static final String NAMED_PUBLIC_JOB = "public_job";
    public static final String NAMED_REMOTE = "remote";
    public static final String NAMED_SDK = "sdk";
    public static final String NAMED_SHOW_SCOPE = "show_scope";
    public static final String NAMED_TRANSACTION_SCOPE = "transaction_scope";
    public static final String OPERATIVE_EVENT_SENDER = "operative";
    public static final String PREF_GL_INFO = "glinfo";
    public static final String UNIVERSAL_EVENT_SENDER = "universal";
    private static final IServicesRegistry serviceRegistry;

    static {
        ServiceProvider serviceProvider = new ServiceProvider();
        INSTANCE = serviceProvider;
        serviceRegistry = serviceProvider.initialize();
    }

    private ServiceProvider() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final s3q0 initialize$lambda$220(final ServicesRegistry servicesRegistry) {
        final UnityAdsModule unityAdsModule = new UnityAdsModule();
        servicesRegistry.updateService(new ServiceKey("", fpf0.a(Context.class)), msy.b(new daz(17)));
        servicesRegistry.updateService(new ServiceKey(MAIN_DISPATCHER, fpf0.a(ovj.class)), msy.b(new yei0(unityAdsModule, 1)));
        servicesRegistry.updateService(new ServiceKey(DEFAULT_DISPATCHER, fpf0.a(ovj.class)), msy.b(new su80(unityAdsModule, 17)));
        servicesRegistry.updateService(new ServiceKey(IO_DISPATCHER, fpf0.a(ovj.class)), msy.b(new rf20(unityAdsModule, 26)));
        servicesRegistry.updateService(new ServiceKey("", fpf0.a(ISDKDispatchers.class)), msy.b(new qkd0(unityAdsModule, 5)));
        servicesRegistry.updateService(new ServiceKey(NAMED_INIT_SCOPE, fpf0.a(yvj.class)), ServiceFactoryKt.factoryOf(new cg1(23, unityAdsModule, servicesRegistry)));
        servicesRegistry.updateService(new ServiceKey(NAMED_LOAD_SCOPE, fpf0.a(yvj.class)), ServiceFactoryKt.factoryOf(new qsd0(3, unityAdsModule, servicesRegistry)));
        servicesRegistry.updateService(new ServiceKey(NAMED_SHOW_SCOPE, fpf0.a(yvj.class)), ServiceFactoryKt.factoryOf(new rs0(21, unityAdsModule, servicesRegistry)));
        servicesRegistry.updateService(new ServiceKey(NAMED_TRANSACTION_SCOPE, fpf0.a(yvj.class)), ServiceFactoryKt.factoryOf(new r(16, unityAdsModule, servicesRegistry)));
        servicesRegistry.updateService(new ServiceKey(NAMED_ILRD_SCOPE, fpf0.a(yvj.class)), ServiceFactoryKt.factoryOf(new rp1(18, unityAdsModule, servicesRegistry)));
        servicesRegistry.updateService(new ServiceKey(NAMED_LIFECYCLE_SCOPE, fpf0.a(yvj.class)), ServiceFactoryKt.factoryOf(new xg2(11, unityAdsModule, servicesRegistry)));
        final int i = 1;
        servicesRegistry.updateService(new ServiceKey(NAMED_GET_TOKEN_SCOPE, fpf0.a(yvj.class)), ServiceFactoryKt.factoryOf(new gzs() { // from class: xsna.bqi0
            @Override // xsna.gzs
            public final Object invoke() {
                ByteStringDataSource initialize$lambda$220$lambda$23;
                yvj initialize$lambda$220$lambda$11;
                switch (i) {
                    case 0:
                        initialize$lambda$220$lambda$23 = ServiceProvider.initialize$lambda$220$lambda$23(unityAdsModule, servicesRegistry);
                        return initialize$lambda$220$lambda$23;
                    default:
                        initialize$lambda$220$lambda$11 = ServiceProvider.initialize$lambda$220$lambda$11(unityAdsModule, servicesRegistry);
                        return initialize$lambda$220$lambda$11;
                }
            }
        }));
        servicesRegistry.updateService(new ServiceKey(NAMED_OFFERWALL_SCOPE, fpf0.a(yvj.class)), ServiceFactoryKt.factoryOf(new kg(25, unityAdsModule, servicesRegistry)));
        servicesRegistry.updateService(new ServiceKey(NAMED_OMID_SCOPE, fpf0.a(yvj.class)), ServiceFactoryKt.factoryOf(new g4(19, unityAdsModule, servicesRegistry)));
        servicesRegistry.updateService(new ServiceKey(NAMED_PUBLIC_JOB, fpf0.a(eyx.class)), ServiceFactoryKt.factoryOf(new a94(16, unityAdsModule, servicesRegistry)));
        final int i2 = 1;
        servicesRegistry.updateService(new ServiceKey(DATA_STORE_GATEWAY_CACHE, fpf0.a(ByteStringDataSource.class)), msy.b(new gzs() { // from class: xsna.yqi0
            @Override // xsna.gzs
            public final Object invoke() {
                BillingClientAdapter initialize$lambda$220$lambda$64;
                ByteStringDataSource initialize$lambda$220$lambda$15;
                switch (i2) {
                    case 0:
                        initialize$lambda$220$lambda$64 = ServiceProvider.initialize$lambda$220$lambda$64(servicesRegistry);
                        return initialize$lambda$220$lambda$64;
                    default:
                        initialize$lambda$220$lambda$15 = ServiceProvider.initialize$lambda$220$lambda$15(servicesRegistry);
                        return initialize$lambda$220$lambda$15;
                }
            }
        }));
        servicesRegistry.updateService(new ServiceKey(DATA_STORE_PRIVACY, fpf0.a(fvk.class)), msy.b(new zv(18, unityAdsModule, servicesRegistry)));
        servicesRegistry.updateService(new ServiceKey(DATA_STORE_PRIVACY, fpf0.a(ByteStringDataSource.class)), msy.b(new i(27, unityAdsModule, servicesRegistry)));
        servicesRegistry.updateService(new ServiceKey(DATA_STORE_PRIVACY_FSM, fpf0.a(fvk.class)), msy.b(new qg1(20, unityAdsModule, servicesRegistry)));
        servicesRegistry.updateService(new ServiceKey(DATA_STORE_PRIVACY_FSM, fpf0.a(ByteStringDataSource.class)), msy.b(new ume0(3, unityAdsModule, servicesRegistry)));
        servicesRegistry.updateService(new ServiceKey(DATA_STORE_NATIVE_CONFIG, fpf0.a(fvk.class)), msy.b(new ie3(25, unityAdsModule, servicesRegistry)));
        servicesRegistry.updateService(new ServiceKey(DATA_STORE_NATIVE_CONFIG, fpf0.a(ByteStringDataSource.class)), msy.b(new mk(21, unityAdsModule, servicesRegistry)));
        servicesRegistry.updateService(new ServiceKey(DATA_STORE_GL_INFO, fpf0.a(fvk.class)), msy.b(new r0(23, unityAdsModule, servicesRegistry)));
        final int i3 = 0;
        servicesRegistry.updateService(new ServiceKey(DATA_STORE_GL_INFO, fpf0.a(ByteStringDataSource.class)), msy.b(new gzs() { // from class: xsna.bqi0
            @Override // xsna.gzs
            public final Object invoke() {
                ByteStringDataSource initialize$lambda$220$lambda$23;
                yvj initialize$lambda$220$lambda$11;
                switch (i3) {
                    case 0:
                        initialize$lambda$220$lambda$23 = ServiceProvider.initialize$lambda$220$lambda$23(unityAdsModule, servicesRegistry);
                        return initialize$lambda$220$lambda$23;
                    default:
                        initialize$lambda$220$lambda$11 = ServiceProvider.initialize$lambda$220$lambda$11(unityAdsModule, servicesRegistry);
                        return initialize$lambda$220$lambda$11;
                }
            }
        }));
        final int i4 = 0;
        servicesRegistry.updateService(new ServiceKey("", fpf0.a(UniversalRequestDataStoreProvider.class)), msy.b(new gzs() { // from class: xsna.cqi0
            @Override // xsna.gzs
            public final Object invoke() {
                UniversalRequestDataStoreProvider initialize$lambda$220$lambda$24;
                GetRequestPolicy initialize$lambda$220$lambda$121;
                switch (i4) {
                    case 0:
                        initialize$lambda$220$lambda$24 = ServiceProvider.initialize$lambda$220$lambda$24(servicesRegistry);
                        return initialize$lambda$220$lambda$24;
                    default:
                        initialize$lambda$220$lambda$121 = ServiceProvider.initialize$lambda$220$lambda$121(servicesRegistry);
                        return initialize$lambda$220$lambda$121;
                }
            }
        }));
        servicesRegistry.updateService(new ServiceKey(DATA_STORE_IAP_TRANSACTION, fpf0.a(fvk.class)), msy.b(new pk(18, unityAdsModule, servicesRegistry)));
        servicesRegistry.updateService(new ServiceKey(DATA_STORE_IAP_TRANSACTION, fpf0.a(ByteStringDataSource.class)), msy.b(new qk(17, unityAdsModule, servicesRegistry)));
        servicesRegistry.updateService(new ServiceKey(DATA_STORE_WEBVIEW_CONFIG, fpf0.a(fvk.class)), msy.b(new oe5(20, unityAdsModule, servicesRegistry)));
        servicesRegistry.updateService(new ServiceKey(Privacy.PUBLIC, fpf0.a(JsonStorage.class)), msy.b(new b290(unityAdsModule, 17)));
        servicesRegistry.updateService(new ServiceKey("PRIVATE", fpf0.a(JsonStorage.class)), msy.b(new lva0(unityAdsModule, 15)));
        servicesRegistry.updateService(new ServiceKey("MEMORY", fpf0.a(JsonStorage.class)), msy.b(new wm80(unityAdsModule, 17)));
        servicesRegistry.updateService(new ServiceKey("", fpf0.a(NativeConfigurationOuterClass.NativeConfiguration.class)), msy.b(new c950(unityAdsModule, 29)));
        servicesRegistry.updateService(new ServiceKey("", fpf0.a(CronetEngineBuilderFactory.class)), msy.b(new pdh0(1)));
        servicesRegistry.updateService(new ServiceKey("", fpf0.a(HttpClientProvider.class)), msy.b(new b990(servicesRegistry, 13)));
        final int i5 = 0;
        servicesRegistry.updateService(new ServiceKey("", fpf0.a(HttpClient.class)), msy.b(new gzs() { // from class: xsna.eqi0
            @Override // xsna.gzs
            public final Object invoke() {
                HttpClient initialize$lambda$220$lambda$34;
                SendPrivacyUpdateRequest initialize$lambda$220$lambda$131;
                switch (i5) {
                    case 0:
                        initialize$lambda$220$lambda$34 = ServiceProvider.initialize$lambda$220$lambda$34(servicesRegistry);
                        return initialize$lambda$220$lambda$34;
                    default:
                        initialize$lambda$220$lambda$131 = ServiceProvider.initialize$lambda$220$lambda$131(servicesRegistry);
                        return initialize$lambda$220$lambda$131;
                }
            }
        }));
        final int i6 = 0;
        servicesRegistry.updateService(new ServiceKey("", fpf0.a(MediationTraitsMetadataReader.class)), ServiceFactoryKt.factoryOf(new gzs() { // from class: xsna.fqi0
            @Override // xsna.gzs
            public final Object invoke() {
                MediationTraitsMetadataReader initialize$lambda$220$lambda$35;
                TriggerInitializationCompletedRequest initialize$lambda$220$lambda$132;
                switch (i6) {
                    case 0:
                        initialize$lambda$220$lambda$35 = ServiceProvider.initialize$lambda$220$lambda$35(servicesRegistry);
                        return initialize$lambda$220$lambda$35;
                    default:
                        initialize$lambda$220$lambda$132 = ServiceProvider.initialize$lambda$220$lambda$132(servicesRegistry);
                        return initialize$lambda$220$lambda$132;
                }
            }
        }));
        servicesRegistry.updateService(new ServiceKey("", fpf0.a(TcfDataSource.class)), msy.b(new ob0(28)));
        final int i7 = 0;
        servicesRegistry.updateService(new ServiceKey("", fpf0.a(TcfRepository.class)), msy.b(new gzs() { // from class: xsna.gqi0
            @Override // xsna.gzs
            public final Object invoke() {
                TcfRepository initialize$lambda$220$lambda$37;
                DiagnosticEventObserver initialize$lambda$220$lambda$134;
                switch (i7) {
                    case 0:
                        initialize$lambda$220$lambda$37 = ServiceProvider.initialize$lambda$220$lambda$37(servicesRegistry);
                        return initialize$lambda$220$lambda$37;
                    default:
                        initialize$lambda$220$lambda$134 = ServiceProvider.initialize$lambda$220$lambda$134(servicesRegistry);
                        return initialize$lambda$220$lambda$134;
                }
            }
        }));
        final int i8 = 0;
        servicesRegistry.updateService(new ServiceKey("", fpf0.a(AndroidManifestIntPropertyReader.class)), msy.b(new gzs() { // from class: xsna.iqi0
            @Override // xsna.gzs
            public final Object invoke() {
                AndroidManifestIntPropertyReader initialize$lambda$220$lambda$38;
                GetTransactionData initialize$lambda$220$lambda$136;
                switch (i8) {
                    case 0:
                        initialize$lambda$220$lambda$38 = ServiceProvider.initialize$lambda$220$lambda$38(servicesRegistry);
                        return initialize$lambda$220$lambda$38;
                    default:
                        initialize$lambda$220$lambda$136 = ServiceProvider.initialize$lambda$220$lambda$136(servicesRegistry);
                        return initialize$lambda$220$lambda$136;
                }
            }
        }));
        final int i9 = 0;
        servicesRegistry.updateService(new ServiceKey("", fpf0.a(AndroidManifestStringPropertyReader.class)), msy.b(new gzs() { // from class: xsna.jqi0
            @Override // xsna.gzs
            public final Object invoke() {
                AndroidManifestStringPropertyReader initialize$lambda$220$lambda$39;
                GetInitializationState initialize$lambda$220$lambda$103;
                switch (i9) {
                    case 0:
                        initialize$lambda$220$lambda$39 = ServiceProvider.initialize$lambda$220$lambda$39(servicesRegistry);
                        return initialize$lambda$220$lambda$39;
                    default:
                        initialize$lambda$220$lambda$103 = ServiceProvider.initialize$lambda$220$lambda$103(servicesRegistry);
                        return initialize$lambda$220$lambda$103;
                }
            }
        }));
        servicesRegistry.updateService(new ServiceKey("", fpf0.a(GatewayUrl.class)), msy.b(new gzs<GatewayUrl>() { // from class: com.unity3d.services.core.di.ServiceProvider$initialize$1$41
            @Override // xsna.gzs
            public /* bridge */ /* synthetic */ GatewayUrl invoke() {
                return GatewayUrl.m57boximpl(m76invokeBZg6m_U());
            }

            /* renamed from: invoke-BZg6m_U, reason: not valid java name */
            public final String m76invokeBZg6m_U() {
                String provideGatewayUrl;
                provideGatewayUrl = ServiceProviderKt.provideGatewayUrl((AndroidManifestStringPropertyReader) ServicesRegistry.this.resolveService(new ServiceKey("", fpf0.a(AndroidManifestStringPropertyReader.class))));
                return provideGatewayUrl;
            }
        }));
        servicesRegistry.updateService(new ServiceKey("", fpf0.a(AndroidTestDataInfo.class)), msy.b(new hk70(servicesRegistry, 18)));
        final int i10 = 0;
        servicesRegistry.updateService(new ServiceKey("", fpf0.a(GameServerIdReader.class)), msy.b(new gzs() { // from class: xsna.kqi0
            @Override // xsna.gzs
            public final Object invoke() {
                GameServerIdReader initialize$lambda$220$lambda$41;
                HandleAdRevenueEvent initialize$lambda$220$lambda$139;
                switch (i10) {
                    case 0:
                        initialize$lambda$220$lambda$41 = ServiceProvider.initialize$lambda$220$lambda$41(servicesRegistry);
                        return initialize$lambda$220$lambda$41;
                    default:
                        initialize$lambda$220$lambda$139 = ServiceProvider.initialize$lambda$220$lambda$139(servicesRegistry);
                        return initialize$lambda$220$lambda$139;
                }
            }
        }));
        servicesRegistry.updateService(new ServiceKey("", fpf0.a(StoreDataSource.class)), msy.b(new b410(servicesRegistry, 26)));
        servicesRegistry.updateService(new ServiceKey("", fpf0.a(AnalyticsDataSource.class)), msy.b(new kcc0(3)));
        final int i11 = 0;
        servicesRegistry.updateService(new ServiceKey("", fpf0.a(DeveloperConsentDataSource.class)), msy.b(new gzs() { // from class: xsna.lqi0
            @Override // xsna.gzs
            public final Object invoke() {
                DeveloperConsentDataSource initialize$lambda$220$lambda$44;
                GetDiagnosticEventRequest initialize$lambda$220$lambda$141;
                switch (i11) {
                    case 0:
                        initialize$lambda$220$lambda$44 = ServiceProvider.initialize$lambda$220$lambda$44(servicesRegistry);
                        return initialize$lambda$220$lambda$44;
                    default:
                        initialize$lambda$220$lambda$141 = ServiceProvider.initialize$lambda$220$lambda$141(servicesRegistry);
                        return initialize$lambda$220$lambda$141;
                }
            }
        }));
        final int i12 = 0;
        servicesRegistry.updateService(new ServiceKey("", fpf0.a(DynamicDeviceInfoDataSource.class)), msy.b(new gzs() { // from class: xsna.mqi0
            @Override // xsna.gzs
            public final Object invoke() {
                DynamicDeviceInfoDataSource initialize$lambda$220$lambda$45;
                GetOperativeEventApi initialize$lambda$220$lambda$142;
                switch (i12) {
                    case 0:
                        initialize$lambda$220$lambda$45 = ServiceProvider.initialize$lambda$220$lambda$45(servicesRegistry);
                        return initialize$lambda$220$lambda$45;
                    default:
                        initialize$lambda$220$lambda$142 = ServiceProvider.initialize$lambda$220$lambda$142(servicesRegistry);
                        return initialize$lambda$220$lambda$142;
                }
            }
        }));
        final int i13 = 0;
        servicesRegistry.updateService(new ServiceKey("", fpf0.a(LegacyUserConsentDataSource.class)), msy.b(new gzs() { // from class: xsna.nqi0
            @Override // xsna.gzs
            public final Object invoke() {
                LegacyUserConsentDataSource initialize$lambda$220$lambda$46;
                GetOperativeEventRequest initialize$lambda$220$lambda$143;
                switch (i13) {
                    case 0:
                        initialize$lambda$220$lambda$46 = ServiceProvider.initialize$lambda$220$lambda$46(servicesRegistry);
                        return initialize$lambda$220$lambda$46;
                    default:
                        initialize$lambda$220$lambda$143 = ServiceProvider.initialize$lambda$220$lambda$143(servicesRegistry);
                        return initialize$lambda$220$lambda$143;
                }
            }
        }));
        servicesRegistry.updateService(new ServiceKey("", fpf0.a(LifecycleDataSource.class)), msy.b(new tqf0(2)));
        final int i14 = 0;
        servicesRegistry.updateService(new ServiceKey("", fpf0.a(ForegroundDurationReader.class)), msy.b(new gzs() { // from class: xsna.oqi0
            @Override // xsna.gzs
            public final Object invoke() {
                ForegroundDurationReader initialize$lambda$220$lambda$49;
                GetIsFileCache initialize$lambda$220$lambda$104;
                switch (i14) {
                    case 0:
                        initialize$lambda$220$lambda$49 = ServiceProvider.initialize$lambda$220$lambda$49(servicesRegistry);
                        return initialize$lambda$220$lambda$49;
                    default:
                        initialize$lambda$220$lambda$104 = ServiceProvider.initialize$lambda$220$lambda$104(servicesRegistry);
                        return initialize$lambda$220$lambda$104;
                }
            }
        }));
        final int i15 = 0;
        servicesRegistry.updateService(new ServiceKey("local", fpf0.a(CacheDataSource.class)), msy.b(new gzs() { // from class: xsna.pqi0
            @Override // xsna.gzs
            public final Object invoke() {
                CacheDataSource initialize$lambda$220$lambda$50;
                TransactionEventObserver initialize$lambda$220$lambda$146;
                switch (i15) {
                    case 0:
                        initialize$lambda$220$lambda$50 = ServiceProvider.initialize$lambda$220$lambda$50(servicesRegistry);
                        return initialize$lambda$220$lambda$50;
                    default:
                        initialize$lambda$220$lambda$146 = ServiceProvider.initialize$lambda$220$lambda$146(servicesRegistry);
                        return initialize$lambda$220$lambda$146;
                }
            }
        }));
        servicesRegistry.updateService(new ServiceKey("", fpf0.a(CreateFile.class)), msy.b(new wqf0(1)));
        final int i16 = 0;
        servicesRegistry.updateService(new ServiceKey("", fpf0.a(GetFileExtensionFromUrl.class)), msy.b(new gzs() { // from class: xsna.qqi0
            @Override // xsna.gzs
            public final Object invoke() {
                GetFileExtensionFromUrl initialize$lambda$220$lambda$52;
                AppLovinCommunicatorBridge initialize$lambda$220$lambda$149;
                switch (i16) {
                    case 0:
                        initialize$lambda$220$lambda$52 = ServiceProvider.initialize$lambda$220$lambda$52(servicesRegistry);
                        return initialize$lambda$220$lambda$52;
                    default:
                        initialize$lambda$220$lambda$149 = ServiceProvider.initialize$lambda$220$lambda$149(servicesRegistry);
                        return initialize$lambda$220$lambda$149;
                }
            }
        }));
        servicesRegistry.updateService(new ServiceKey("", fpf0.a(RemoveUrlQuery.class)), msy.b(new k5f0(3)));
        servicesRegistry.updateService(new ServiceKey("", fpf0.a(MediationDataSource.class)), msy.b(new f550(servicesRegistry, 26)));
        final int i17 = 0;
        servicesRegistry.updateService(new ServiceKey("", fpf0.a(PrivacyDeviceInfoDataSource.class)), msy.b(new gzs() { // from class: xsna.rqi0
            @Override // xsna.gzs
            public final Object invoke() {
                PrivacyDeviceInfoDataSource initialize$lambda$220$lambda$55;
                MaxAdRevenueListener initialize$lambda$220$lambda$151;
                switch (i17) {
                    case 0:
                        initialize$lambda$220$lambda$55 = ServiceProvider.initialize$lambda$220$lambda$55(servicesRegistry);
                        return initialize$lambda$220$lambda$55;
                    default:
                        initialize$lambda$220$lambda$151 = ServiceProvider.initialize$lambda$220$lambda$151(servicesRegistry);
                        return initialize$lambda$220$lambda$151;
                }
            }
        }));
        final int i18 = 0;
        servicesRegistry.updateService(new ServiceKey("remote", fpf0.a(CacheDataSource.class)), msy.b(new gzs() { // from class: xsna.sqi0
            @Override // xsna.gzs
            public final Object invoke() {
                CacheDataSource initialize$lambda$220$lambda$56;
                MaxAdRevenueObserver initialize$lambda$220$lambda$152;
                switch (i18) {
                    case 0:
                        initialize$lambda$220$lambda$56 = ServiceProvider.initialize$lambda$220$lambda$56(servicesRegistry);
                        return initialize$lambda$220$lambda$56;
                    default:
                        initialize$lambda$220$lambda$152 = ServiceProvider.initialize$lambda$220$lambda$152(servicesRegistry);
                        return initialize$lambda$220$lambda$152;
                }
            }
        }));
        final int i19 = 0;
        servicesRegistry.updateService(new ServiceKey("", fpf0.a(StaticDeviceInfoDataSource.class)), msy.b(new gzs() { // from class: xsna.tqi0
            @Override // xsna.gzs
            public final Object invoke() {
                StaticDeviceInfoDataSource initialize$lambda$220$lambda$57;
                UniversalRequestEventSender initialize$lambda$220$lambda$154;
                switch (i19) {
                    case 0:
                        initialize$lambda$220$lambda$57 = ServiceProvider.initialize$lambda$220$lambda$57(servicesRegistry);
                        return initialize$lambda$220$lambda$57;
                    default:
                        initialize$lambda$220$lambda$154 = ServiceProvider.initialize$lambda$220$lambda$154(servicesRegistry);
                        return initialize$lambda$220$lambda$154;
                }
            }
        }));
        final int i20 = 0;
        servicesRegistry.updateService(new ServiceKey(PREF_GL_INFO, fpf0.a(fuk.class)), msy.b(new gzs() { // from class: xsna.uqi0
            @Override // xsna.gzs
            public final Object invoke() {
                fuk initialize$lambda$220$lambda$58;
                SetInitializationState initialize$lambda$220$lambda$105;
                switch (i20) {
                    case 0:
                        initialize$lambda$220$lambda$58 = ServiceProvider.initialize$lambda$220$lambda$58(servicesRegistry);
                        return initialize$lambda$220$lambda$58;
                    default:
                        initialize$lambda$220$lambda$105 = ServiceProvider.initialize$lambda$220$lambda$105(servicesRegistry);
                        return initialize$lambda$220$lambda$105;
                }
            }
        }));
        final int i21 = 0;
        servicesRegistry.updateService(new ServiceKey("", fpf0.a(UniversalRequestDataSource.class)), msy.b(new gzs() { // from class: xsna.vqi0
            @Override // xsna.gzs
            public final Object invoke() {
                UniversalRequestDataSource initialize$lambda$220$lambda$59;
                UniversalRequestEventSender initialize$lambda$220$lambda$155;
                switch (i21) {
                    case 0:
                        initialize$lambda$220$lambda$59 = ServiceProvider.initialize$lambda$220$lambda$59(servicesRegistry);
                        return initialize$lambda$220$lambda$59;
                    default:
                        initialize$lambda$220$lambda$155 = ServiceProvider.initialize$lambda$220$lambda$155(servicesRegistry);
                        return initialize$lambda$220$lambda$155;
                }
            }
        }));
        final int i22 = 0;
        servicesRegistry.updateService(new ServiceKey("", fpf0.a(WebviewConfigurationDataSource.class)), msy.b(new gzs() { // from class: xsna.wqi0
            @Override // xsna.gzs
            public final Object invoke() {
                WebviewConfigurationDataSource initialize$lambda$220$lambda$60;
                UniversalRequestEventSender initialize$lambda$220$lambda$156;
                switch (i22) {
                    case 0:
                        initialize$lambda$220$lambda$60 = ServiceProvider.initialize$lambda$220$lambda$60(servicesRegistry);
                        return initialize$lambda$220$lambda$60;
                    default:
                        initialize$lambda$220$lambda$156 = ServiceProvider.initialize$lambda$220$lambda$156(servicesRegistry);
                        return initialize$lambda$220$lambda$156;
                }
            }
        }));
        servicesRegistry.updateService(new ServiceKey("", fpf0.a(OmidManager.class)), msy.b(new qbe0(6)));
        servicesRegistry.updateService(new ServiceKey("", fpf0.a(SDKPropertiesManager.class)), msy.b(new xv0(23)));
        servicesRegistry.updateService(new ServiceKey("", fpf0.a(StorageManager.class)), msy.b(new xqi0(0)));
        final int i23 = 0;
        servicesRegistry.updateService(new ServiceKey("", fpf0.a(BillingClientAdapter.class)), msy.b(new gzs() { // from class: xsna.yqi0
            @Override // xsna.gzs
            public final Object invoke() {
                BillingClientAdapter initialize$lambda$220$lambda$64;
                ByteStringDataSource initialize$lambda$220$lambda$15;
                switch (i23) {
                    case 0:
                        initialize$lambda$220$lambda$64 = ServiceProvider.initialize$lambda$220$lambda$64(servicesRegistry);
                        return initialize$lambda$220$lambda$64;
                    default:
                        initialize$lambda$220$lambda$15 = ServiceProvider.initialize$lambda$220$lambda$15(servicesRegistry);
                        return initialize$lambda$220$lambda$15;
                }
            }
        }));
        final int i24 = 0;
        servicesRegistry.updateService(new ServiceKey("", fpf0.a(ProductDetailsFetcher.class)), msy.b(new gzs() { // from class: xsna.zqi0
            @Override // xsna.gzs
            public final Object invoke() {
                ProductDetailsFetcher initialize$lambda$220$lambda$65;
                IsOMActivated initialize$lambda$220$lambda$161;
                switch (i24) {
                    case 0:
                        initialize$lambda$220$lambda$65 = ServiceProvider.initialize$lambda$220$lambda$65(servicesRegistry);
                        return initialize$lambda$220$lambda$65;
                    default:
                        initialize$lambda$220$lambda$161 = ServiceProvider.initialize$lambda$220$lambda$161(servicesRegistry);
                        return initialize$lambda$220$lambda$161;
                }
            }
        }));
        final int i25 = 0;
        servicesRegistry.updateService(new ServiceKey("", fpf0.a(TransactionEventManager.class)), msy.b(new gzs() { // from class: xsna.bri0
            @Override // xsna.gzs
            public final Object invoke() {
                TransactionEventManager initialize$lambda$220$lambda$66;
                InitializeAdQuality initialize$lambda$220$lambda$163;
                switch (i25) {
                    case 0:
                        initialize$lambda$220$lambda$66 = ServiceProvider.initialize$lambda$220$lambda$66(servicesRegistry);
                        return initialize$lambda$220$lambda$66;
                    default:
                        initialize$lambda$220$lambda$163 = ServiceProvider.initialize$lambda$220$lambda$163(servicesRegistry);
                        return initialize$lambda$220$lambda$163;
                }
            }
        }));
        servicesRegistry.updateService(new ServiceKey("", fpf0.a(AdRepository.class)), msy.b(new iud0(2)));
        final int i26 = 0;
        servicesRegistry.updateService(new ServiceKey("", fpf0.a(CacheRepository.class)), msy.b(new gzs() { // from class: xsna.cri0
            @Override // xsna.gzs
            public final Object invoke() {
                CacheRepository initialize$lambda$220$lambda$68;
                CoherenceLibraryManager initialize$lambda$220$lambda$164;
                switch (i26) {
                    case 0:
                        initialize$lambda$220$lambda$68 = ServiceProvider.initialize$lambda$220$lambda$68(servicesRegistry);
                        return initialize$lambda$220$lambda$68;
                    default:
                        initialize$lambda$220$lambda$164 = ServiceProvider.initialize$lambda$220$lambda$164(servicesRegistry);
                        return initialize$lambda$220$lambda$164;
                }
            }
        }));
        servicesRegistry.updateService(new ServiceKey("", fpf0.a(GetCacheDirectory.class)), msy.b(new z0h0(2)));
        servicesRegistry.updateService(new ServiceKey("", fpf0.a(GetAssetFileName.class)), msy.b(new e3c0(2)));
        final int i27 = 0;
        servicesRegistry.updateService(new ServiceKey("", fpf0.a(CampaignRepository.class)), msy.b(new gzs() { // from class: xsna.dri0
            @Override // xsna.gzs
            public final Object invoke() {
                CampaignRepository initialize$lambda$220$lambda$71;
                DiagnosticEventRequestWorkModifier initialize$lambda$220$lambda$168;
                switch (i27) {
                    case 0:
                        initialize$lambda$220$lambda$71 = ServiceProvider.initialize$lambda$220$lambda$71(servicesRegistry);
                        return initialize$lambda$220$lambda$71;
                    default:
                        initialize$lambda$220$lambda$168 = ServiceProvider.initialize$lambda$220$lambda$168(servicesRegistry);
                        return initialize$lambda$220$lambda$168;
                }
            }
        }));
        final int i28 = 0;
        servicesRegistry.updateService(new ServiceKey("", fpf0.a(DeveloperConsentRepository.class)), msy.b(new gzs() { // from class: xsna.eri0
            @Override // xsna.gzs
            public final Object invoke() {
                DeveloperConsentRepository initialize$lambda$220$lambda$72;
                GatewayClient initialize$lambda$220$lambda$169;
                switch (i28) {
                    case 0:
                        initialize$lambda$220$lambda$72 = ServiceProvider.initialize$lambda$220$lambda$72(servicesRegistry);
                        return initialize$lambda$220$lambda$72;
                    default:
                        initialize$lambda$220$lambda$169 = ServiceProvider.initialize$lambda$220$lambda$169(servicesRegistry);
                        return initialize$lambda$220$lambda$169;
                }
            }
        }));
        final int i29 = 1;
        servicesRegistry.updateService(new ServiceKey("", fpf0.a(DeviceInfoRepository.class)), msy.b(new gzs() { // from class: xsna.bpi0
            @Override // xsna.gzs
            public final Object invoke() {
                ValidateGameId initialize$lambda$220$lambda$191;
                DeviceInfoRepository initialize$lambda$220$lambda$73;
                pvj initialize$lambda$220$lambda$170;
                switch (i29) {
                    case 0:
                        initialize$lambda$220$lambda$191 = ServiceProvider.initialize$lambda$220$lambda$191(servicesRegistry);
                        return initialize$lambda$220$lambda$191;
                    case 1:
                        initialize$lambda$220$lambda$73 = ServiceProvider.initialize$lambda$220$lambda$73(servicesRegistry);
                        return initialize$lambda$220$lambda$73;
                    default:
                        initialize$lambda$220$lambda$170 = ServiceProvider.initialize$lambda$220$lambda$170(servicesRegistry);
                        return initialize$lambda$220$lambda$170;
                }
            }
        }));
        final int i30 = 1;
        servicesRegistry.updateService(new ServiceKey("", fpf0.a(DiagnosticEventRepository.class)), msy.b(new gzs() { // from class: xsna.cpi0
            @Override // xsna.gzs
            public final Object invoke() {
                ValidateExtrasSize initialize$lambda$220$lambda$192;
                DiagnosticEventRepository initialize$lambda$220$lambda$74;
                switch (i30) {
                    case 0:
                        initialize$lambda$220$lambda$192 = ServiceProvider.initialize$lambda$220$lambda$192(servicesRegistry);
                        return initialize$lambda$220$lambda$192;
                    default:
                        initialize$lambda$220$lambda$74 = ServiceProvider.initialize$lambda$220$lambda$74(servicesRegistry);
                        return initialize$lambda$220$lambda$74;
                }
            }
        }));
        final int i31 = 1;
        servicesRegistry.updateService(new ServiceKey("", fpf0.a(LegacyUserConsentRepository.class)), msy.b(new gzs() { // from class: xsna.epi0
            @Override // xsna.gzs
            public final Object invoke() {
                CheckForGameIdAndTestModeChanges initialize$lambda$220$lambda$194;
                LegacyUserConsentRepository initialize$lambda$220$lambda$75;
                StoreMonitor initialize$lambda$220$lambda$172;
                switch (i31) {
                    case 0:
                        initialize$lambda$220$lambda$194 = ServiceProvider.initialize$lambda$220$lambda$194(servicesRegistry);
                        return initialize$lambda$220$lambda$194;
                    case 1:
                        initialize$lambda$220$lambda$75 = ServiceProvider.initialize$lambda$220$lambda$75(servicesRegistry);
                        return initialize$lambda$220$lambda$75;
                    default:
                        initialize$lambda$220$lambda$172 = ServiceProvider.initialize$lambda$220$lambda$172(servicesRegistry);
                        return initialize$lambda$220$lambda$172;
                }
            }
        }));
        servicesRegistry.updateService(new ServiceKey("", fpf0.a(MediationProviderParser.class)), msy.b(new ko60(4)));
        final int i32 = 1;
        servicesRegistry.updateService(new ServiceKey("", fpf0.a(MediationInfoConverter.class)), msy.b(new gzs() { // from class: xsna.gpi0
            @Override // xsna.gzs
            public final Object invoke() {
                CleanupDirectory initialize$lambda$220$lambda$196;
                MediationInfoConverter initialize$lambda$220$lambda$77;
                switch (i32) {
                    case 0:
                        initialize$lambda$220$lambda$196 = ServiceProvider.initialize$lambda$220$lambda$196(servicesRegistry);
                        return initialize$lambda$220$lambda$196;
                    default:
                        initialize$lambda$220$lambda$77 = ServiceProvider.initialize$lambda$220$lambda$77(servicesRegistry);
                        return initialize$lambda$220$lambda$77;
                }
            }
        }));
        final int i33 = 1;
        servicesRegistry.updateService(new ServiceKey("", fpf0.a(MediationRepository.class)), msy.b(new gzs() { // from class: xsna.hpi0
            @Override // xsna.gzs
            public final Object invoke() {
                FocusRepository initialize$lambda$220$lambda$197;
                MediationRepository initialize$lambda$220$lambda$78;
                AndroidAttribution initialize$lambda$220$lambda$174;
                switch (i33) {
                    case 0:
                        initialize$lambda$220$lambda$197 = ServiceProvider.initialize$lambda$220$lambda$197(servicesRegistry);
                        return initialize$lambda$220$lambda$197;
                    case 1:
                        initialize$lambda$220$lambda$78 = ServiceProvider.initialize$lambda$220$lambda$78(servicesRegistry);
                        return initialize$lambda$220$lambda$78;
                    default:
                        initialize$lambda$220$lambda$174 = ServiceProvider.initialize$lambda$220$lambda$174(servicesRegistry);
                        return initialize$lambda$220$lambda$174;
                }
            }
        }));
        final int i34 = 1;
        servicesRegistry.updateService(new ServiceKey("", fpf0.a(OpenMeasurementRepository.class)), msy.b(new gzs() { // from class: xsna.ipi0
            @Override // xsna.gzs
            public final Object invoke() {
                AndroidGetIsAdActivity initialize$lambda$220$lambda$198;
                OpenMeasurementRepository initialize$lambda$220$lambda$79;
                AdPlayerScope initialize$lambda$220$lambda$175;
                switch (i34) {
                    case 0:
                        initialize$lambda$220$lambda$198 = ServiceProvider.initialize$lambda$220$lambda$198(servicesRegistry);
                        return initialize$lambda$220$lambda$198;
                    case 1:
                        initialize$lambda$220$lambda$79 = ServiceProvider.initialize$lambda$220$lambda$79(servicesRegistry);
                        return initialize$lambda$220$lambda$79;
                    default:
                        initialize$lambda$220$lambda$175 = ServiceProvider.initialize$lambda$220$lambda$175(servicesRegistry);
                        return initialize$lambda$220$lambda$175;
                }
            }
        }));
        final int i35 = 1;
        servicesRegistry.updateService(new ServiceKey("", fpf0.a(SessionRepository.class)), msy.b(new gzs() { // from class: xsna.jpi0
            @Override // xsna.gzs
            public final Object invoke() {
                AndroidGetLifecycleFlow initialize$lambda$220$lambda$199;
                SessionRepository initialize$lambda$220$lambda$80;
                AndroidWebViewClient initialize$lambda$220$lambda$176;
                switch (i35) {
                    case 0:
                        initialize$lambda$220$lambda$199 = ServiceProvider.initialize$lambda$220$lambda$199(servicesRegistry);
                        return initialize$lambda$220$lambda$199;
                    case 1:
                        initialize$lambda$220$lambda$80 = ServiceProvider.initialize$lambda$220$lambda$80(servicesRegistry);
                        return initialize$lambda$220$lambda$80;
                    default:
                        initialize$lambda$220$lambda$176 = ServiceProvider.initialize$lambda$220$lambda$176(servicesRegistry);
                        return initialize$lambda$220$lambda$176;
                }
            }
        }));
        servicesRegistry.updateService(new ServiceKey("", fpf0.a(TransactionEventRepository.class)), msy.b(new dgc0(8)));
        servicesRegistry.updateService(new ServiceKey("", fpf0.a(AdRevenueRepository.class)), msy.b(new c6(26)));
        servicesRegistry.updateService(new ServiceKey("", fpf0.a(OperativeEventRepository.class)), msy.b(new s7c0(4)));
        final int i36 = 1;
        servicesRegistry.updateService(new ServiceKey("", fpf0.a(ExecuteAdViewerRequest.class)), msy.b(new gzs() { // from class: xsna.opi0
            @Override // xsna.gzs
            public final Object invoke() {
                LoadOfferwallAd initialize$lambda$220$lambda$203;
                ExecuteAdViewerRequest initialize$lambda$220$lambda$84;
                GetAdPlayerConfigRequest initialize$lambda$220$lambda$108;
                switch (i36) {
                    case 0:
                        initialize$lambda$220$lambda$203 = ServiceProvider.initialize$lambda$220$lambda$203(servicesRegistry);
                        return initialize$lambda$220$lambda$203;
                    case 1:
                        initialize$lambda$220$lambda$84 = ServiceProvider.initialize$lambda$220$lambda$84(servicesRegistry);
                        return initialize$lambda$220$lambda$84;
                    default:
                        initialize$lambda$220$lambda$108 = ServiceProvider.initialize$lambda$220$lambda$108(servicesRegistry);
                        return initialize$lambda$220$lambda$108;
                }
            }
        }));
        servicesRegistry.updateService(new ServiceKey("", fpf0.a(GetByteStringId.class)), msy.b(new c2c0(9)));
        servicesRegistry.updateService(new ServiceKey("", fpf0.a(IntentCreation.class)), ServiceFactoryKt.factoryOf(new l63(28)));
        servicesRegistry.updateService(new ServiceKey("", fpf0.a(HandleOpenUrl.class)), ServiceFactoryKt.factoryOf(new gd70(servicesRegistry, 27)));
        final int i37 = 1;
        servicesRegistry.updateService(new ServiceKey("", fpf0.a(Refresh.class)), msy.b(new gzs() { // from class: xsna.rpi0
            @Override // xsna.gzs
            public final Object invoke() {
                AdQualityVersionDataSource initialize$lambda$220$lambda$207;
                Refresh initialize$lambda$220$lambda$88;
                LegacyLoadUseCase initialize$lambda$220$lambda$185;
                switch (i37) {
                    case 0:
                        initialize$lambda$220$lambda$207 = ServiceProvider.initialize$lambda$220$lambda$207(servicesRegistry);
                        return initialize$lambda$220$lambda$207;
                    case 1:
                        initialize$lambda$220$lambda$88 = ServiceProvider.initialize$lambda$220$lambda$88(servicesRegistry);
                        return initialize$lambda$220$lambda$88;
                    default:
                        initialize$lambda$220$lambda$185 = ServiceProvider.initialize$lambda$220$lambda$185(servicesRegistry);
                        return initialize$lambda$220$lambda$185;
                }
            }
        }));
        final int i38 = 1;
        servicesRegistry.updateService(new ServiceKey("", fpf0.a(CacheAssets.class)), msy.b(new gzs() { // from class: xsna.spi0
            @Override // xsna.gzs
            public final Object invoke() {
                CleanUpWhenOpportunityExpires initialize$lambda$220$lambda$208;
                CacheAssets initialize$lambda$220$lambda$89;
                WebViewLessLoadStrategy initialize$lambda$220$lambda$186;
                switch (i38) {
                    case 0:
                        initialize$lambda$220$lambda$208 = ServiceProvider.initialize$lambda$220$lambda$208(servicesRegistry);
                        return initialize$lambda$220$lambda$208;
                    case 1:
                        initialize$lambda$220$lambda$89 = ServiceProvider.initialize$lambda$220$lambda$89(servicesRegistry);
                        return initialize$lambda$220$lambda$89;
                    default:
                        initialize$lambda$220$lambda$186 = ServiceProvider.initialize$lambda$220$lambda$186(servicesRegistry);
                        return initialize$lambda$220$lambda$186;
                }
            }
        }));
        final int i39 = 0;
        servicesRegistry.updateService(new ServiceKey("", fpf0.a(AdRefresh.class)), ServiceFactoryKt.factoryOf(new gzs() { // from class: xsna.fri0
            @Override // xsna.gzs
            public final Object invoke() {
                AdRefresh initialize$lambda$220$lambda$90;
                SafeCallbackInvoke initialize$lambda$220$lambda$187;
                switch (i39) {
                    case 0:
                        initialize$lambda$220$lambda$90 = ServiceProvider.initialize$lambda$220$lambda$90(servicesRegistry);
                        return initialize$lambda$220$lambda$90;
                    default:
                        initialize$lambda$220$lambda$187 = ServiceProvider.initialize$lambda$220$lambda$187(servicesRegistry);
                        return initialize$lambda$220$lambda$187;
                }
            }
        }));
        final int i40 = 1;
        servicesRegistry.updateService(new ServiceKey("", fpf0.a(SendDiagnosticEvent.class)), msy.b(new gzs() { // from class: xsna.upi0
            @Override // xsna.gzs
            public final Object invoke() {
                AndroidAppSetIdDataSource initialize$lambda$220$lambda$210;
                SendDiagnosticEvent initialize$lambda$220$lambda$91;
                SetGameId initialize$lambda$220$lambda$189;
                switch (i40) {
                    case 0:
                        initialize$lambda$220$lambda$210 = ServiceProvider.initialize$lambda$220$lambda$210(servicesRegistry);
                        return initialize$lambda$220$lambda$210;
                    case 1:
                        initialize$lambda$220$lambda$91 = ServiceProvider.initialize$lambda$220$lambda$91(servicesRegistry);
                        return initialize$lambda$220$lambda$91;
                    default:
                        initialize$lambda$220$lambda$189 = ServiceProvider.initialize$lambda$220$lambda$189(servicesRegistry);
                        return initialize$lambda$220$lambda$189;
                }
            }
        }));
        final int i41 = 0;
        servicesRegistry.updateService(new ServiceKey("", fpf0.a(SendWebViewClientErrorDiagnostics.class)), msy.b(new gzs() { // from class: xsna.gri0
            @Override // xsna.gzs
            public final Object invoke() {
                SendWebViewClientErrorDiagnostics initialize$lambda$220$lambda$92;
                GetGameId initialize$lambda$220$lambda$190;
                switch (i41) {
                    case 0:
                        initialize$lambda$220$lambda$92 = ServiceProvider.initialize$lambda$220$lambda$92(servicesRegistry);
                        return initialize$lambda$220$lambda$92;
                    default:
                        initialize$lambda$220$lambda$190 = ServiceProvider.initialize$lambda$220$lambda$190(servicesRegistry);
                        return initialize$lambda$220$lambda$190;
                }
            }
        }));
        final int i42 = 1;
        servicesRegistry.updateService(new ServiceKey("", fpf0.a(Show.class)), ServiceFactoryKt.factoryOf(new gzs() { // from class: xsna.wpi0
            @Override // xsna.gzs
            public final Object invoke() {
                InstallReferrerDataSource initialize$lambda$220$lambda$212;
                Show initialize$lambda$220$lambda$93;
                AndroidGetAdPlayerContext initialize$lambda$220$lambda$109;
                switch (i42) {
                    case 0:
                        initialize$lambda$220$lambda$212 = ServiceProvider.initialize$lambda$220$lambda$212(servicesRegistry);
                        return initialize$lambda$220$lambda$212;
                    case 1:
                        initialize$lambda$220$lambda$93 = ServiceProvider.initialize$lambda$220$lambda$93(servicesRegistry);
                        return initialize$lambda$220$lambda$93;
                    default:
                        initialize$lambda$220$lambda$109 = ServiceProvider.initialize$lambda$220$lambda$109(servicesRegistry);
                        return initialize$lambda$220$lambda$109;
                }
            }
        }));
        final int i43 = 1;
        servicesRegistry.updateService(new ServiceKey("", fpf0.a(CacheFile.class)), msy.b(new gzs() { // from class: xsna.xpi0
            @Override // xsna.gzs
            public final Object invoke() {
                GoogleAppIdDataSource initialize$lambda$220$lambda$213;
                CacheFile initialize$lambda$220$lambda$94;
                switch (i43) {
                    case 0:
                        initialize$lambda$220$lambda$213 = ServiceProvider.initialize$lambda$220$lambda$213(servicesRegistry);
                        return initialize$lambda$220$lambda$213;
                    default:
                        initialize$lambda$220$lambda$94 = ServiceProvider.initialize$lambda$220$lambda$94(servicesRegistry);
                        return initialize$lambda$220$lambda$94;
                }
            }
        }));
        servicesRegistry.updateService(new ServiceKey("", fpf0.a(CleanAssets.class)), msy.b(new hri0(servicesRegistry, 0)));
        final int i44 = 1;
        servicesRegistry.updateService(new ServiceKey("", fpf0.a(GetAdObject.class)), msy.b(new gzs() { // from class: xsna.ypi0
            @Override // xsna.gzs
            public final Object invoke() {
                Logger initialize$lambda$220$lambda$215;
                GetAdObject initialize$lambda$220$lambda$96;
                switch (i44) {
                    case 0:
                        initialize$lambda$220$lambda$215 = ServiceProvider.initialize$lambda$220$lambda$215(servicesRegistry);
                        return initialize$lambda$220$lambda$215;
                    default:
                        initialize$lambda$220$lambda$96 = ServiceProvider.initialize$lambda$220$lambda$96(servicesRegistry);
                        return initialize$lambda$220$lambda$96;
                }
            }
        }));
        servicesRegistry.updateService(new ServiceKey("", fpf0.a(GetHeaderBiddingToken.class)), ServiceFactoryKt.factoryOf(new x850(servicesRegistry, 24)));
        final int i45 = 1;
        servicesRegistry.updateService(new ServiceKey("", fpf0.a(BuildHeaderBiddingToken.class)), ServiceFactoryKt.factoryOf(new gzs() { // from class: xsna.zpi0
            @Override // xsna.gzs
            public final Object invoke() {
                UnityBootConfigDataSource initialize$lambda$220$lambda$217;
                BuildHeaderBiddingToken initialize$lambda$220$lambda$98;
                switch (i45) {
                    case 0:
                        initialize$lambda$220$lambda$217 = ServiceProvider.initialize$lambda$220$lambda$217(servicesRegistry);
                        return initialize$lambda$220$lambda$217;
                    default:
                        initialize$lambda$220$lambda$98 = ServiceProvider.initialize$lambda$220$lambda$98(servicesRegistry);
                        return initialize$lambda$220$lambda$98;
                }
            }
        }));
        final int i46 = 1;
        servicesRegistry.updateService(new ServiceKey("", fpf0.a(TokenNumberProvider.class)), ServiceFactoryKt.factoryOf(new gzs() { // from class: xsna.aqi0
            @Override // xsna.gzs
            public final Object invoke() {
                GetClientInfo initialize$lambda$220$lambda$111;
                TokenNumberProvider initialize$lambda$220$lambda$99;
                switch (i46) {
                    case 0:
                        initialize$lambda$220$lambda$111 = ServiceProvider.initialize$lambda$220$lambda$111(servicesRegistry);
                        return initialize$lambda$220$lambda$111;
                    default:
                        initialize$lambda$220$lambda$99 = ServiceProvider.initialize$lambda$220$lambda$99(servicesRegistry);
                        return initialize$lambda$220$lambda$99;
                }
            }
        }));
        servicesRegistry.updateService(new ServiceKey("", fpf0.a(GetInitializationData.class)), msy.b(new pvh0(servicesRegistry, 1)));
        final int i47 = 1;
        servicesRegistry.updateService(new ServiceKey("", fpf0.a(MediationInitBlobMetadataReader.class)), ServiceFactoryKt.factoryOf(new gzs() { // from class: xsna.npi0
            @Override // xsna.gzs
            public final Object invoke() {
                OfferwallManager initialize$lambda$220$lambda$202;
                MediationInitBlobMetadataReader initialize$lambda$220$lambda$101;
                GetAdPlayer initialize$lambda$220$lambda$181;
                switch (i47) {
                    case 0:
                        initialize$lambda$220$lambda$202 = ServiceProvider.initialize$lambda$220$lambda$202(servicesRegistry);
                        return initialize$lambda$220$lambda$202;
                    case 1:
                        initialize$lambda$220$lambda$101 = ServiceProvider.initialize$lambda$220$lambda$101(servicesRegistry);
                        return initialize$lambda$220$lambda$101;
                    default:
                        initialize$lambda$220$lambda$181 = ServiceProvider.initialize$lambda$220$lambda$181(servicesRegistry);
                        return initialize$lambda$220$lambda$181;
                }
            }
        }));
        servicesRegistry.updateService(new ServiceKey("", fpf0.a(GetInitializationRequestPayload.class)), msy.b(new su80(servicesRegistry, 18)));
        final int i48 = 1;
        servicesRegistry.updateService(new ServiceKey("", fpf0.a(GetInitializationState.class)), msy.b(new gzs() { // from class: xsna.jqi0
            @Override // xsna.gzs
            public final Object invoke() {
                AndroidManifestStringPropertyReader initialize$lambda$220$lambda$39;
                GetInitializationState initialize$lambda$220$lambda$103;
                switch (i48) {
                    case 0:
                        initialize$lambda$220$lambda$39 = ServiceProvider.initialize$lambda$220$lambda$39(servicesRegistry);
                        return initialize$lambda$220$lambda$39;
                    default:
                        initialize$lambda$220$lambda$103 = ServiceProvider.initialize$lambda$220$lambda$103(servicesRegistry);
                        return initialize$lambda$220$lambda$103;
                }
            }
        }));
        final int i49 = 1;
        servicesRegistry.updateService(new ServiceKey("", fpf0.a(GetIsFileCache.class)), msy.b(new gzs() { // from class: xsna.oqi0
            @Override // xsna.gzs
            public final Object invoke() {
                ForegroundDurationReader initialize$lambda$220$lambda$49;
                GetIsFileCache initialize$lambda$220$lambda$104;
                switch (i49) {
                    case 0:
                        initialize$lambda$220$lambda$49 = ServiceProvider.initialize$lambda$220$lambda$49(servicesRegistry);
                        return initialize$lambda$220$lambda$49;
                    default:
                        initialize$lambda$220$lambda$104 = ServiceProvider.initialize$lambda$220$lambda$104(servicesRegistry);
                        return initialize$lambda$220$lambda$104;
                }
            }
        }));
        final int i50 = 1;
        servicesRegistry.updateService(new ServiceKey("", fpf0.a(SetInitializationState.class)), msy.b(new gzs() { // from class: xsna.uqi0
            @Override // xsna.gzs
            public final Object invoke() {
                fuk initialize$lambda$220$lambda$58;
                SetInitializationState initialize$lambda$220$lambda$105;
                switch (i50) {
                    case 0:
                        initialize$lambda$220$lambda$58 = ServiceProvider.initialize$lambda$220$lambda$58(servicesRegistry);
                        return initialize$lambda$220$lambda$58;
                    default:
                        initialize$lambda$220$lambda$105 = ServiceProvider.initialize$lambda$220$lambda$105(servicesRegistry);
                        return initialize$lambda$220$lambda$105;
                }
            }
        }));
        servicesRegistry.updateService(new ServiceKey(NAMED_AD_REQ, fpf0.a(GetRequestPolicy.class)), msy.b(new tbe0(servicesRegistry, 5)));
        final int i51 = 1;
        servicesRegistry.updateService(new ServiceKey("", fpf0.a(GetAdDataRefreshRequest.class)), msy.b(new gzs() { // from class: xsna.fpi0
            @Override // xsna.gzs
            public final Object invoke() {
                DownloadPriorityQueue initialize$lambda$220$lambda$195;
                GetAdDataRefreshRequest initialize$lambda$220$lambda$107;
                switch (i51) {
                    case 0:
                        initialize$lambda$220$lambda$195 = ServiceProvider.initialize$lambda$220$lambda$195(servicesRegistry);
                        return initialize$lambda$220$lambda$195;
                    default:
                        initialize$lambda$220$lambda$107 = ServiceProvider.initialize$lambda$220$lambda$107(servicesRegistry);
                        return initialize$lambda$220$lambda$107;
                }
            }
        }));
        final int i52 = 2;
        servicesRegistry.updateService(new ServiceKey("", fpf0.a(GetAdPlayerConfigRequest.class)), msy.b(new gzs() { // from class: xsna.opi0
            @Override // xsna.gzs
            public final Object invoke() {
                LoadOfferwallAd initialize$lambda$220$lambda$203;
                ExecuteAdViewerRequest initialize$lambda$220$lambda$84;
                GetAdPlayerConfigRequest initialize$lambda$220$lambda$108;
                switch (i52) {
                    case 0:
                        initialize$lambda$220$lambda$203 = ServiceProvider.initialize$lambda$220$lambda$203(servicesRegistry);
                        return initialize$lambda$220$lambda$203;
                    case 1:
                        initialize$lambda$220$lambda$84 = ServiceProvider.initialize$lambda$220$lambda$84(servicesRegistry);
                        return initialize$lambda$220$lambda$84;
                    default:
                        initialize$lambda$220$lambda$108 = ServiceProvider.initialize$lambda$220$lambda$108(servicesRegistry);
                        return initialize$lambda$220$lambda$108;
                }
            }
        }));
        final int i53 = 2;
        servicesRegistry.updateService(new ServiceKey("", fpf0.a(AndroidGetAdPlayerContext.class)), msy.b(new gzs() { // from class: xsna.wpi0
            @Override // xsna.gzs
            public final Object invoke() {
                InstallReferrerDataSource initialize$lambda$220$lambda$212;
                Show initialize$lambda$220$lambda$93;
                AndroidGetAdPlayerContext initialize$lambda$220$lambda$109;
                switch (i53) {
                    case 0:
                        initialize$lambda$220$lambda$212 = ServiceProvider.initialize$lambda$220$lambda$212(servicesRegistry);
                        return initialize$lambda$220$lambda$212;
                    case 1:
                        initialize$lambda$220$lambda$93 = ServiceProvider.initialize$lambda$220$lambda$93(servicesRegistry);
                        return initialize$lambda$220$lambda$93;
                    default:
                        initialize$lambda$220$lambda$109 = ServiceProvider.initialize$lambda$220$lambda$109(servicesRegistry);
                        return initialize$lambda$220$lambda$109;
                }
            }
        }));
        final int i54 = 0;
        servicesRegistry.updateService(new ServiceKey("", fpf0.a(GetAdRequest.class)), msy.b(new gzs() { // from class: xsna.lpi0
            @Override // xsna.gzs
            public final Object invoke() {
                GetAdRequest initialize$lambda$220$lambda$110;
                Load initialize$lambda$220$lambda$178;
                switch (i54) {
                    case 0:
                        initialize$lambda$220$lambda$110 = ServiceProvider.initialize$lambda$220$lambda$110(servicesRegistry);
                        return initialize$lambda$220$lambda$110;
                    default:
                        initialize$lambda$220$lambda$178 = ServiceProvider.initialize$lambda$220$lambda$178(servicesRegistry);
                        return initialize$lambda$220$lambda$178;
                }
            }
        }));
        final int i55 = 0;
        servicesRegistry.updateService(new ServiceKey("", fpf0.a(GetClientInfo.class)), msy.b(new gzs() { // from class: xsna.aqi0
            @Override // xsna.gzs
            public final Object invoke() {
                GetClientInfo initialize$lambda$220$lambda$111;
                TokenNumberProvider initialize$lambda$220$lambda$99;
                switch (i55) {
                    case 0:
                        initialize$lambda$220$lambda$111 = ServiceProvider.initialize$lambda$220$lambda$111(servicesRegistry);
                        return initialize$lambda$220$lambda$111;
                    default:
                        initialize$lambda$220$lambda$99 = ServiceProvider.initialize$lambda$220$lambda$99(servicesRegistry);
                        return initialize$lambda$220$lambda$99;
                }
            }
        }));
        final int i56 = 0;
        servicesRegistry.updateService(new ServiceKey("", fpf0.a(GetInitializationCompletedRequest.class)), msy.b(new gzs() { // from class: xsna.dqi0
            @Override // xsna.gzs
            public final Object invoke() {
                GetInitializationCompletedRequest initialize$lambda$220$lambda$112;
                HandleGatewayInitializationResponse initialize$lambda$220$lambda$126;
                switch (i56) {
                    case 0:
                        initialize$lambda$220$lambda$112 = ServiceProvider.initialize$lambda$220$lambda$112(servicesRegistry);
                        return initialize$lambda$220$lambda$112;
                    default:
                        initialize$lambda$220$lambda$126 = ServiceProvider.initialize$lambda$220$lambda$126(servicesRegistry);
                        return initialize$lambda$220$lambda$126;
                }
            }
        }));
        final int i57 = 0;
        servicesRegistry.updateService(new ServiceKey("", fpf0.a(GetInitializationRequest.class)), msy.b(new gzs() { // from class: xsna.hqi0
            @Override // xsna.gzs
            public final Object invoke() {
                GetInitializationRequest initialize$lambda$220$lambda$113;
                EventObservers initialize$lambda$220$lambda$135;
                switch (i57) {
                    case 0:
                        initialize$lambda$220$lambda$113 = ServiceProvider.initialize$lambda$220$lambda$113(servicesRegistry);
                        return initialize$lambda$220$lambda$113;
                    default:
                        initialize$lambda$220$lambda$135 = ServiceProvider.initialize$lambda$220$lambda$135(servicesRegistry);
                        return initialize$lambda$220$lambda$135;
                }
            }
        }));
        servicesRegistry.updateService(new ServiceKey("", fpf0.a(GetLimitedSessionToken.class)), msy.b(new rka0(servicesRegistry, 17)));
        servicesRegistry.updateService(new ServiceKey("", fpf0.a(GetOpenGLRendererInfo.class)), msy.b(new yu60(servicesRegistry, 21)));
        final int i58 = 0;
        servicesRegistry.updateService(new ServiceKey("", fpf0.a(GetSharedDataTimestamps.class)), msy.b(new gzs() { // from class: xsna.ari0
            @Override // xsna.gzs
            public final Object invoke() {
                GetSharedDataTimestamps initialize$lambda$220$lambda$116;
                InitializeOMSDK initialize$lambda$220$lambda$162;
                switch (i58) {
                    case 0:
                        initialize$lambda$220$lambda$116 = ServiceProvider.initialize$lambda$220$lambda$116(servicesRegistry);
                        return initialize$lambda$220$lambda$116;
                    default:
                        initialize$lambda$220$lambda$162 = ServiceProvider.initialize$lambda$220$lambda$162(servicesRegistry);
                        return initialize$lambda$220$lambda$162;
                }
            }
        }));
        final int i59 = 1;
        servicesRegistry.updateService(new ServiceKey("", fpf0.a(GetUniversalRequestForPayLoad.class)), msy.b(new gzs() { // from class: xsna.dpi0
            @Override // xsna.gzs
            public final Object invoke() {
                ShouldAllowInitialization initialize$lambda$220$lambda$193;
                GetUniversalRequestForPayLoad initialize$lambda$220$lambda$117;
                switch (i59) {
                    case 0:
                        initialize$lambda$220$lambda$193 = ServiceProvider.initialize$lambda$220$lambda$193(servicesRegistry);
                        return initialize$lambda$220$lambda$193;
                    default:
                        initialize$lambda$220$lambda$117 = ServiceProvider.initialize$lambda$220$lambda$117(servicesRegistry);
                        return initialize$lambda$220$lambda$117;
                }
            }
        }));
        final int i60 = 1;
        servicesRegistry.updateService(new ServiceKey("", fpf0.a(GetUniversalRequestSharedData.class)), msy.b(new gzs() { // from class: xsna.mpi0
            @Override // xsna.gzs
            public final Object invoke() {
                OfferwallAdapterBridge initialize$lambda$220$lambda$201;
                GetUniversalRequestSharedData initialize$lambda$220$lambda$118;
                switch (i60) {
                    case 0:
                        initialize$lambda$220$lambda$201 = ServiceProvider.initialize$lambda$220$lambda$201(servicesRegistry);
                        return initialize$lambda$220$lambda$201;
                    default:
                        initialize$lambda$220$lambda$118 = ServiceProvider.initialize$lambda$220$lambda$118(servicesRegistry);
                        return initialize$lambda$220$lambda$118;
                }
            }
        }));
        final int i61 = 1;
        servicesRegistry.updateService(new ServiceKey("", fpf0.a(GetCachedAsset.class)), msy.b(new gzs() { // from class: xsna.vpi0
            @Override // xsna.gzs
            public final Object invoke() {
                AndroidUnityInfoDataSource initialize$lambda$220$lambda$211;
                GetCachedAsset initialize$lambda$220$lambda$119;
                switch (i61) {
                    case 0:
                        initialize$lambda$220$lambda$211 = ServiceProvider.initialize$lambda$220$lambda$211(servicesRegistry);
                        return initialize$lambda$220$lambda$211;
                    default:
                        initialize$lambda$220$lambda$119 = ServiceProvider.initialize$lambda$220$lambda$119(servicesRegistry);
                        return initialize$lambda$220$lambda$119;
                }
            }
        }));
        servicesRegistry.updateService(new ServiceKey("", fpf0.a(GetWebViewBridgeUseCase.class)), msy.b(new ajd0(servicesRegistry, 5)));
        final int i62 = 1;
        servicesRegistry.updateService(new ServiceKey(NAMED_INIT_REQ, fpf0.a(GetRequestPolicy.class)), msy.b(new gzs() { // from class: xsna.cqi0
            @Override // xsna.gzs
            public final Object invoke() {
                UniversalRequestDataStoreProvider initialize$lambda$220$lambda$24;
                GetRequestPolicy initialize$lambda$220$lambda$121;
                switch (i62) {
                    case 0:
                        initialize$lambda$220$lambda$24 = ServiceProvider.initialize$lambda$220$lambda$24(servicesRegistry);
                        return initialize$lambda$220$lambda$24;
                    default:
                        initialize$lambda$220$lambda$121 = ServiceProvider.initialize$lambda$220$lambda$121(servicesRegistry);
                        return initialize$lambda$220$lambda$121;
                }
            }
        }));
        servicesRegistry.updateService(new ServiceKey("", fpf0.a(GetLatestWebViewConfiguration.class)), msy.b(new b1z(servicesRegistry, 26)));
        servicesRegistry.updateService(new ServiceKey(NAMED_OPERATIVE_REQ, fpf0.a(GetRequestPolicy.class)), msy.b(new cf00(servicesRegistry, 25)));
        servicesRegistry.updateService(new ServiceKey(NAMED_OTHER_REQ, fpf0.a(GetRequestPolicy.class)), msy.b(new u110(servicesRegistry, 17)));
        servicesRegistry.updateService(new ServiceKey("", fpf0.a(GetPrivacyUpdateRequest.class)), msy.b(new b290(servicesRegistry, 18)));
        final int i63 = 1;
        servicesRegistry.updateService(new ServiceKey("", fpf0.a(HandleGatewayInitializationResponse.class)), msy.b(new gzs() { // from class: xsna.dqi0
            @Override // xsna.gzs
            public final Object invoke() {
                GetInitializationCompletedRequest initialize$lambda$220$lambda$112;
                HandleGatewayInitializationResponse initialize$lambda$220$lambda$126;
                switch (i63) {
                    case 0:
                        initialize$lambda$220$lambda$112 = ServiceProvider.initialize$lambda$220$lambda$112(servicesRegistry);
                        return initialize$lambda$220$lambda$112;
                    default:
                        initialize$lambda$220$lambda$126 = ServiceProvider.initialize$lambda$220$lambda$126(servicesRegistry);
                        return initialize$lambda$220$lambda$126;
                }
            }
        }));
        servicesRegistry.updateService(new ServiceKey("", fpf0.a(UpdateAdQualitySessionToken.class)), msy.b(new lva0(servicesRegistry, 16)));
        servicesRegistry.updateService(new ServiceKey("", fpf0.a(HandleGatewayUniversalResponse.class)), msy.b(new wm80(servicesRegistry, 18)));
        servicesRegistry.updateService(new ServiceKey("", fpf0.a(InitializeBoldSDK.class)), msy.b(new iri0(servicesRegistry, 0)));
        servicesRegistry.updateService(new ServiceKey("", fpf0.a(LegacyShowUseCase.class)), ServiceFactoryKt.factoryOf(new jaa0(servicesRegistry, 12)));
        final int i64 = 1;
        servicesRegistry.updateService(new ServiceKey("", fpf0.a(SendPrivacyUpdateRequest.class)), msy.b(new gzs() { // from class: xsna.eqi0
            @Override // xsna.gzs
            public final Object invoke() {
                HttpClient initialize$lambda$220$lambda$34;
                SendPrivacyUpdateRequest initialize$lambda$220$lambda$131;
                switch (i64) {
                    case 0:
                        initialize$lambda$220$lambda$34 = ServiceProvider.initialize$lambda$220$lambda$34(servicesRegistry);
                        return initialize$lambda$220$lambda$34;
                    default:
                        initialize$lambda$220$lambda$131 = ServiceProvider.initialize$lambda$220$lambda$131(servicesRegistry);
                        return initialize$lambda$220$lambda$131;
                }
            }
        }));
        final int i65 = 1;
        servicesRegistry.updateService(new ServiceKey("", fpf0.a(TriggerInitializationCompletedRequest.class)), msy.b(new gzs() { // from class: xsna.fqi0
            @Override // xsna.gzs
            public final Object invoke() {
                MediationTraitsMetadataReader initialize$lambda$220$lambda$35;
                TriggerInitializationCompletedRequest initialize$lambda$220$lambda$132;
                switch (i65) {
                    case 0:
                        initialize$lambda$220$lambda$35 = ServiceProvider.initialize$lambda$220$lambda$35(servicesRegistry);
                        return initialize$lambda$220$lambda$35;
                    default:
                        initialize$lambda$220$lambda$132 = ServiceProvider.initialize$lambda$220$lambda$132(servicesRegistry);
                        return initialize$lambda$220$lambda$132;
                }
            }
        }));
        servicesRegistry.updateService(new ServiceKey("", fpf0.a(TriggerInitializeListener.class)), msy.b(new bi80(servicesRegistry, 17)));
        final int i66 = 1;
        servicesRegistry.updateService(new ServiceKey("", fpf0.a(DiagnosticEventObserver.class)), msy.b(new gzs() { // from class: xsna.gqi0
            @Override // xsna.gzs
            public final Object invoke() {
                TcfRepository initialize$lambda$220$lambda$37;
                DiagnosticEventObserver initialize$lambda$220$lambda$134;
                switch (i66) {
                    case 0:
                        initialize$lambda$220$lambda$37 = ServiceProvider.initialize$lambda$220$lambda$37(servicesRegistry);
                        return initialize$lambda$220$lambda$37;
                    default:
                        initialize$lambda$220$lambda$134 = ServiceProvider.initialize$lambda$220$lambda$134(servicesRegistry);
                        return initialize$lambda$220$lambda$134;
                }
            }
        }));
        final int i67 = 1;
        servicesRegistry.updateService(new ServiceKey("", fpf0.a(EventObservers.class)), msy.b(new gzs() { // from class: xsna.hqi0
            @Override // xsna.gzs
            public final Object invoke() {
                GetInitializationRequest initialize$lambda$220$lambda$113;
                EventObservers initialize$lambda$220$lambda$135;
                switch (i67) {
                    case 0:
                        initialize$lambda$220$lambda$113 = ServiceProvider.initialize$lambda$220$lambda$113(servicesRegistry);
                        return initialize$lambda$220$lambda$113;
                    default:
                        initialize$lambda$220$lambda$135 = ServiceProvider.initialize$lambda$220$lambda$135(servicesRegistry);
                        return initialize$lambda$220$lambda$135;
                }
            }
        }));
        final int i68 = 1;
        servicesRegistry.updateService(new ServiceKey("", fpf0.a(GetTransactionData.class)), msy.b(new gzs() { // from class: xsna.iqi0
            @Override // xsna.gzs
            public final Object invoke() {
                AndroidManifestIntPropertyReader initialize$lambda$220$lambda$38;
                GetTransactionData initialize$lambda$220$lambda$136;
                switch (i68) {
                    case 0:
                        initialize$lambda$220$lambda$38 = ServiceProvider.initialize$lambda$220$lambda$38(servicesRegistry);
                        return initialize$lambda$220$lambda$38;
                    default:
                        initialize$lambda$220$lambda$136 = ServiceProvider.initialize$lambda$220$lambda$136(servicesRegistry);
                        return initialize$lambda$220$lambda$136;
                }
            }
        }));
        servicesRegistry.updateService(new ServiceKey("", fpf0.a(GetTransactionRequest.class)), msy.b(new rf20(servicesRegistry, 27)));
        servicesRegistry.updateService(new ServiceKey("", fpf0.a(GetAdRevenueEventData.class)), msy.b(new ltb0(5)));
        final int i69 = 1;
        servicesRegistry.updateService(new ServiceKey("", fpf0.a(HandleAdRevenueEvent.class)), msy.b(new gzs() { // from class: xsna.kqi0
            @Override // xsna.gzs
            public final Object invoke() {
                GameServerIdReader initialize$lambda$220$lambda$41;
                HandleAdRevenueEvent initialize$lambda$220$lambda$139;
                switch (i69) {
                    case 0:
                        initialize$lambda$220$lambda$41 = ServiceProvider.initialize$lambda$220$lambda$41(servicesRegistry);
                        return initialize$lambda$220$lambda$41;
                    default:
                        initialize$lambda$220$lambda$139 = ServiceProvider.initialize$lambda$220$lambda$139(servicesRegistry);
                        return initialize$lambda$220$lambda$139;
                }
            }
        }));
        servicesRegistry.updateService(new ServiceKey("", fpf0.a(GetDiagnosticEventBatchRequest.class)), msy.b(new bpc0(3)));
        final int i70 = 1;
        servicesRegistry.updateService(new ServiceKey("", fpf0.a(GetDiagnosticEventRequest.class)), msy.b(new gzs() { // from class: xsna.lqi0
            @Override // xsna.gzs
            public final Object invoke() {
                DeveloperConsentDataSource initialize$lambda$220$lambda$44;
                GetDiagnosticEventRequest initialize$lambda$220$lambda$141;
                switch (i70) {
                    case 0:
                        initialize$lambda$220$lambda$44 = ServiceProvider.initialize$lambda$220$lambda$44(servicesRegistry);
                        return initialize$lambda$220$lambda$44;
                    default:
                        initialize$lambda$220$lambda$141 = ServiceProvider.initialize$lambda$220$lambda$141(servicesRegistry);
                        return initialize$lambda$220$lambda$141;
                }
            }
        }));
        final int i71 = 1;
        servicesRegistry.updateService(new ServiceKey("", fpf0.a(GetOperativeEventApi.class)), msy.b(new gzs() { // from class: xsna.mqi0
            @Override // xsna.gzs
            public final Object invoke() {
                DynamicDeviceInfoDataSource initialize$lambda$220$lambda$45;
                GetOperativeEventApi initialize$lambda$220$lambda$142;
                switch (i71) {
                    case 0:
                        initialize$lambda$220$lambda$45 = ServiceProvider.initialize$lambda$220$lambda$45(servicesRegistry);
                        return initialize$lambda$220$lambda$45;
                    default:
                        initialize$lambda$220$lambda$142 = ServiceProvider.initialize$lambda$220$lambda$142(servicesRegistry);
                        return initialize$lambda$220$lambda$142;
                }
            }
        }));
        final int i72 = 1;
        servicesRegistry.updateService(new ServiceKey("", fpf0.a(GetOperativeEventRequest.class)), msy.b(new gzs() { // from class: xsna.nqi0
            @Override // xsna.gzs
            public final Object invoke() {
                LegacyUserConsentDataSource initialize$lambda$220$lambda$46;
                GetOperativeEventRequest initialize$lambda$220$lambda$143;
                switch (i72) {
                    case 0:
                        initialize$lambda$220$lambda$46 = ServiceProvider.initialize$lambda$220$lambda$46(servicesRegistry);
                        return initialize$lambda$220$lambda$46;
                    default:
                        initialize$lambda$220$lambda$143 = ServiceProvider.initialize$lambda$220$lambda$143(servicesRegistry);
                        return initialize$lambda$220$lambda$143;
                }
            }
        }));
        servicesRegistry.updateService(new ServiceKey("", fpf0.a(HandleGatewayEventResponse.class)), msy.b(new fd90(6)));
        servicesRegistry.updateService(new ServiceKey("", fpf0.a(OperativeEventObserver.class)), msy.b(new iia0(servicesRegistry, 17)));
        final int i73 = 1;
        servicesRegistry.updateService(new ServiceKey("", fpf0.a(TransactionEventObserver.class)), msy.b(new gzs() { // from class: xsna.pqi0
            @Override // xsna.gzs
            public final Object invoke() {
                CacheDataSource initialize$lambda$220$lambda$50;
                TransactionEventObserver initialize$lambda$220$lambda$146;
                switch (i73) {
                    case 0:
                        initialize$lambda$220$lambda$50 = ServiceProvider.initialize$lambda$220$lambda$50(servicesRegistry);
                        return initialize$lambda$220$lambda$50;
                    default:
                        initialize$lambda$220$lambda$146 = ServiceProvider.initialize$lambda$220$lambda$146(servicesRegistry);
                        return initialize$lambda$220$lambda$146;
                }
            }
        }));
        servicesRegistry.updateService(new ServiceKey("", fpf0.a(AdRevenueObserver.class)), msy.b(new qkd0(servicesRegistry, 6)));
        servicesRegistry.updateService(new ServiceKey("", fpf0.a(LifecycleEventObserver.class)), msy.b(new i440(servicesRegistry, 28)));
        final int i74 = 1;
        servicesRegistry.updateService(new ServiceKey("", fpf0.a(AppLovinCommunicatorBridge.class)), msy.b(new gzs() { // from class: xsna.qqi0
            @Override // xsna.gzs
            public final Object invoke() {
                GetFileExtensionFromUrl initialize$lambda$220$lambda$52;
                AppLovinCommunicatorBridge initialize$lambda$220$lambda$149;
                switch (i74) {
                    case 0:
                        initialize$lambda$220$lambda$52 = ServiceProvider.initialize$lambda$220$lambda$52(servicesRegistry);
                        return initialize$lambda$220$lambda$52;
                    default:
                        initialize$lambda$220$lambda$149 = ServiceProvider.initialize$lambda$220$lambda$149(servicesRegistry);
                        return initialize$lambda$220$lambda$149;
                }
            }
        }));
        servicesRegistry.updateService(new ServiceKey("", fpf0.a(MaxAdRevenueCommunicatorProxyFactory.class)), msy.b(new hj60(servicesRegistry, 25)));
        final int i75 = 1;
        servicesRegistry.updateService(new ServiceKey("", fpf0.a(MaxAdRevenueListener.class)), ServiceFactoryKt.factoryOf(new gzs() { // from class: xsna.rqi0
            @Override // xsna.gzs
            public final Object invoke() {
                PrivacyDeviceInfoDataSource initialize$lambda$220$lambda$55;
                MaxAdRevenueListener initialize$lambda$220$lambda$151;
                switch (i75) {
                    case 0:
                        initialize$lambda$220$lambda$55 = ServiceProvider.initialize$lambda$220$lambda$55(servicesRegistry);
                        return initialize$lambda$220$lambda$55;
                    default:
                        initialize$lambda$220$lambda$151 = ServiceProvider.initialize$lambda$220$lambda$151(servicesRegistry);
                        return initialize$lambda$220$lambda$151;
                }
            }
        }));
        final int i76 = 1;
        servicesRegistry.updateService(new ServiceKey("", fpf0.a(MaxAdRevenueObserver.class)), msy.b(new gzs() { // from class: xsna.sqi0
            @Override // xsna.gzs
            public final Object invoke() {
                CacheDataSource initialize$lambda$220$lambda$56;
                MaxAdRevenueObserver initialize$lambda$220$lambda$152;
                switch (i76) {
                    case 0:
                        initialize$lambda$220$lambda$56 = ServiceProvider.initialize$lambda$220$lambda$56(servicesRegistry);
                        return initialize$lambda$220$lambda$56;
                    default:
                        initialize$lambda$220$lambda$152 = ServiceProvider.initialize$lambda$220$lambda$152(servicesRegistry);
                        return initialize$lambda$220$lambda$152;
                }
            }
        }));
        servicesRegistry.updateService(new ServiceKey("", fpf0.a(UniversalRequestTtlValidator.class)), msy.b(new ia90(7)));
        final int i77 = 1;
        servicesRegistry.updateService(new ServiceKey("universal", fpf0.a(UniversalRequestEventSender.class)), ServiceFactoryKt.factoryOf(new gzs() { // from class: xsna.tqi0
            @Override // xsna.gzs
            public final Object invoke() {
                StaticDeviceInfoDataSource initialize$lambda$220$lambda$57;
                UniversalRequestEventSender initialize$lambda$220$lambda$154;
                switch (i77) {
                    case 0:
                        initialize$lambda$220$lambda$57 = ServiceProvider.initialize$lambda$220$lambda$57(servicesRegistry);
                        return initialize$lambda$220$lambda$57;
                    default:
                        initialize$lambda$220$lambda$154 = ServiceProvider.initialize$lambda$220$lambda$154(servicesRegistry);
                        return initialize$lambda$220$lambda$154;
                }
            }
        }));
        final int i78 = 1;
        servicesRegistry.updateService(new ServiceKey(DIAGNOSTICS_EVENT_SENDER, fpf0.a(UniversalRequestEventSender.class)), ServiceFactoryKt.factoryOf(new gzs() { // from class: xsna.vqi0
            @Override // xsna.gzs
            public final Object invoke() {
                UniversalRequestDataSource initialize$lambda$220$lambda$59;
                UniversalRequestEventSender initialize$lambda$220$lambda$155;
                switch (i78) {
                    case 0:
                        initialize$lambda$220$lambda$59 = ServiceProvider.initialize$lambda$220$lambda$59(servicesRegistry);
                        return initialize$lambda$220$lambda$59;
                    default:
                        initialize$lambda$220$lambda$155 = ServiceProvider.initialize$lambda$220$lambda$155(servicesRegistry);
                        return initialize$lambda$220$lambda$155;
                }
            }
        }));
        final int i79 = 1;
        servicesRegistry.updateService(new ServiceKey(OPERATIVE_EVENT_SENDER, fpf0.a(UniversalRequestEventSender.class)), ServiceFactoryKt.factoryOf(new gzs() { // from class: xsna.wqi0
            @Override // xsna.gzs
            public final Object invoke() {
                WebviewConfigurationDataSource initialize$lambda$220$lambda$60;
                UniversalRequestEventSender initialize$lambda$220$lambda$156;
                switch (i79) {
                    case 0:
                        initialize$lambda$220$lambda$60 = ServiceProvider.initialize$lambda$220$lambda$60(servicesRegistry);
                        return initialize$lambda$220$lambda$60;
                    default:
                        initialize$lambda$220$lambda$156 = ServiceProvider.initialize$lambda$220$lambda$156(servicesRegistry);
                        return initialize$lambda$220$lambda$156;
                }
            }
        }));
        servicesRegistry.updateService(new ServiceKey("", fpf0.a(OmFinishSession.class)), msy.b(new vex(servicesRegistry, 28)));
        servicesRegistry.updateService(new ServiceKey("", fpf0.a(OmImpressionOccurred.class)), msy.b(new gkc0(servicesRegistry, 7)));
        servicesRegistry.updateService(new ServiceKey("", fpf0.a(AndroidOmInteraction.class)), msy.b(new da50(servicesRegistry, 19)));
        servicesRegistry.updateService(new ServiceKey("", fpf0.a(GetOmData.class)), msy.b(new io60(servicesRegistry, 25)));
        final int i80 = 1;
        servicesRegistry.updateService(new ServiceKey("", fpf0.a(IsOMActivated.class)), msy.b(new gzs() { // from class: xsna.zqi0
            @Override // xsna.gzs
            public final Object invoke() {
                ProductDetailsFetcher initialize$lambda$220$lambda$65;
                IsOMActivated initialize$lambda$220$lambda$161;
                switch (i80) {
                    case 0:
                        initialize$lambda$220$lambda$65 = ServiceProvider.initialize$lambda$220$lambda$65(servicesRegistry);
                        return initialize$lambda$220$lambda$65;
                    default:
                        initialize$lambda$220$lambda$161 = ServiceProvider.initialize$lambda$220$lambda$161(servicesRegistry);
                        return initialize$lambda$220$lambda$161;
                }
            }
        }));
        final int i81 = 1;
        servicesRegistry.updateService(new ServiceKey("", fpf0.a(InitializeOMSDK.class)), msy.b(new gzs() { // from class: xsna.ari0
            @Override // xsna.gzs
            public final Object invoke() {
                GetSharedDataTimestamps initialize$lambda$220$lambda$116;
                InitializeOMSDK initialize$lambda$220$lambda$162;
                switch (i81) {
                    case 0:
                        initialize$lambda$220$lambda$116 = ServiceProvider.initialize$lambda$220$lambda$116(servicesRegistry);
                        return initialize$lambda$220$lambda$116;
                    default:
                        initialize$lambda$220$lambda$162 = ServiceProvider.initialize$lambda$220$lambda$162(servicesRegistry);
                        return initialize$lambda$220$lambda$162;
                }
            }
        }));
        final int i82 = 1;
        servicesRegistry.updateService(new ServiceKey("", fpf0.a(InitializeAdQuality.class)), msy.b(new gzs() { // from class: xsna.bri0
            @Override // xsna.gzs
            public final Object invoke() {
                TransactionEventManager initialize$lambda$220$lambda$66;
                InitializeAdQuality initialize$lambda$220$lambda$163;
                switch (i82) {
                    case 0:
                        initialize$lambda$220$lambda$66 = ServiceProvider.initialize$lambda$220$lambda$66(servicesRegistry);
                        return initialize$lambda$220$lambda$66;
                    default:
                        initialize$lambda$220$lambda$163 = ServiceProvider.initialize$lambda$220$lambda$163(servicesRegistry);
                        return initialize$lambda$220$lambda$163;
                }
            }
        }));
        final int i83 = 1;
        servicesRegistry.updateService(new ServiceKey("", fpf0.a(CoherenceLibraryManager.class)), msy.b(new gzs() { // from class: xsna.cri0
            @Override // xsna.gzs
            public final Object invoke() {
                CacheRepository initialize$lambda$220$lambda$68;
                CoherenceLibraryManager initialize$lambda$220$lambda$164;
                switch (i83) {
                    case 0:
                        initialize$lambda$220$lambda$68 = ServiceProvider.initialize$lambda$220$lambda$68(servicesRegistry);
                        return initialize$lambda$220$lambda$68;
                    default:
                        initialize$lambda$220$lambda$164 = ServiceProvider.initialize$lambda$220$lambda$164(servicesRegistry);
                        return initialize$lambda$220$lambda$164;
                }
            }
        }));
        servicesRegistry.updateService(new ServiceKey(DEV_CONSENT_PRIVACY_RULES, fpf0.a(FlattenerRulesUseCase.class)), msy.b(new z0h0(3)));
        servicesRegistry.updateService(new ServiceKey(LEGACY_PRIVACY_RULES, fpf0.a(FlattenerRulesUseCase.class)), msy.b(new e3c0(3)));
        servicesRegistry.updateService(new ServiceKey("", fpf0.a(BackgroundWorker.class)), msy.b(new qbc0(servicesRegistry, 10)));
        final int i84 = 1;
        servicesRegistry.updateService(new ServiceKey("", fpf0.a(DiagnosticEventRequestWorkModifier.class)), msy.b(new gzs() { // from class: xsna.dri0
            @Override // xsna.gzs
            public final Object invoke() {
                CampaignRepository initialize$lambda$220$lambda$71;
                DiagnosticEventRequestWorkModifier initialize$lambda$220$lambda$168;
                switch (i84) {
                    case 0:
                        initialize$lambda$220$lambda$71 = ServiceProvider.initialize$lambda$220$lambda$71(servicesRegistry);
                        return initialize$lambda$220$lambda$71;
                    default:
                        initialize$lambda$220$lambda$168 = ServiceProvider.initialize$lambda$220$lambda$168(servicesRegistry);
                        return initialize$lambda$220$lambda$168;
                }
            }
        }));
        final int i85 = 1;
        servicesRegistry.updateService(new ServiceKey("", fpf0.a(GatewayClient.class)), msy.b(new gzs() { // from class: xsna.eri0
            @Override // xsna.gzs
            public final Object invoke() {
                DeveloperConsentRepository initialize$lambda$220$lambda$72;
                GatewayClient initialize$lambda$220$lambda$169;
                switch (i85) {
                    case 0:
                        initialize$lambda$220$lambda$72 = ServiceProvider.initialize$lambda$220$lambda$72(servicesRegistry);
                        return initialize$lambda$220$lambda$72;
                    default:
                        initialize$lambda$220$lambda$169 = ServiceProvider.initialize$lambda$220$lambda$169(servicesRegistry);
                        return initialize$lambda$220$lambda$169;
                }
            }
        }));
        final int i86 = 2;
        servicesRegistry.updateService(new ServiceKey("sdk", fpf0.a(pvj.class)), msy.b(new gzs() { // from class: xsna.bpi0
            @Override // xsna.gzs
            public final Object invoke() {
                ValidateGameId initialize$lambda$220$lambda$191;
                DeviceInfoRepository initialize$lambda$220$lambda$73;
                pvj initialize$lambda$220$lambda$170;
                switch (i86) {
                    case 0:
                        initialize$lambda$220$lambda$191 = ServiceProvider.initialize$lambda$220$lambda$191(servicesRegistry);
                        return initialize$lambda$220$lambda$191;
                    case 1:
                        initialize$lambda$220$lambda$73 = ServiceProvider.initialize$lambda$220$lambda$73(servicesRegistry);
                        return initialize$lambda$220$lambda$73;
                    default:
                        initialize$lambda$220$lambda$170 = ServiceProvider.initialize$lambda$220$lambda$170(servicesRegistry);
                        return initialize$lambda$220$lambda$170;
                }
            }
        }));
        servicesRegistry.updateService(new ServiceKey("", fpf0.a(VolumeChange.class)), msy.b(new ml7(26)));
        final int i87 = 2;
        servicesRegistry.updateService(new ServiceKey("", fpf0.a(StoreMonitor.class)), msy.b(new gzs() { // from class: xsna.epi0
            @Override // xsna.gzs
            public final Object invoke() {
                CheckForGameIdAndTestModeChanges initialize$lambda$220$lambda$194;
                LegacyUserConsentRepository initialize$lambda$220$lambda$75;
                StoreMonitor initialize$lambda$220$lambda$172;
                switch (i87) {
                    case 0:
                        initialize$lambda$220$lambda$194 = ServiceProvider.initialize$lambda$220$lambda$194(servicesRegistry);
                        return initialize$lambda$220$lambda$194;
                    case 1:
                        initialize$lambda$220$lambda$75 = ServiceProvider.initialize$lambda$220$lambda$75(servicesRegistry);
                        return initialize$lambda$220$lambda$75;
                    default:
                        initialize$lambda$220$lambda$172 = ServiceProvider.initialize$lambda$220$lambda$172(servicesRegistry);
                        return initialize$lambda$220$lambda$172;
                }
            }
        }));
        servicesRegistry.updateService(new ServiceKey("", fpf0.a(StoreExceptionHandler.class)), msy.b(new l9(27)));
        final int i88 = 2;
        servicesRegistry.updateService(new ServiceKey("", fpf0.a(AndroidAttribution.class)), msy.b(new gzs() { // from class: xsna.hpi0
            @Override // xsna.gzs
            public final Object invoke() {
                FocusRepository initialize$lambda$220$lambda$197;
                MediationRepository initialize$lambda$220$lambda$78;
                AndroidAttribution initialize$lambda$220$lambda$174;
                switch (i88) {
                    case 0:
                        initialize$lambda$220$lambda$197 = ServiceProvider.initialize$lambda$220$lambda$197(servicesRegistry);
                        return initialize$lambda$220$lambda$197;
                    case 1:
                        initialize$lambda$220$lambda$78 = ServiceProvider.initialize$lambda$220$lambda$78(servicesRegistry);
                        return initialize$lambda$220$lambda$78;
                    default:
                        initialize$lambda$220$lambda$174 = ServiceProvider.initialize$lambda$220$lambda$174(servicesRegistry);
                        return initialize$lambda$220$lambda$174;
                }
            }
        }));
        final int i89 = 2;
        servicesRegistry.updateService(new ServiceKey("", fpf0.a(AdPlayerScope.class)), ServiceFactoryKt.factoryOf(new gzs() { // from class: xsna.ipi0
            @Override // xsna.gzs
            public final Object invoke() {
                AndroidGetIsAdActivity initialize$lambda$220$lambda$198;
                OpenMeasurementRepository initialize$lambda$220$lambda$79;
                AdPlayerScope initialize$lambda$220$lambda$175;
                switch (i89) {
                    case 0:
                        initialize$lambda$220$lambda$198 = ServiceProvider.initialize$lambda$220$lambda$198(servicesRegistry);
                        return initialize$lambda$220$lambda$198;
                    case 1:
                        initialize$lambda$220$lambda$79 = ServiceProvider.initialize$lambda$220$lambda$79(servicesRegistry);
                        return initialize$lambda$220$lambda$79;
                    default:
                        initialize$lambda$220$lambda$175 = ServiceProvider.initialize$lambda$220$lambda$175(servicesRegistry);
                        return initialize$lambda$220$lambda$175;
                }
            }
        }));
        final int i90 = 2;
        servicesRegistry.updateService(new ServiceKey("", fpf0.a(AndroidWebViewClient.class)), ServiceFactoryKt.factoryOf(new gzs() { // from class: xsna.jpi0
            @Override // xsna.gzs
            public final Object invoke() {
                AndroidGetLifecycleFlow initialize$lambda$220$lambda$199;
                SessionRepository initialize$lambda$220$lambda$80;
                AndroidWebViewClient initialize$lambda$220$lambda$176;
                switch (i90) {
                    case 0:
                        initialize$lambda$220$lambda$199 = ServiceProvider.initialize$lambda$220$lambda$199(servicesRegistry);
                        return initialize$lambda$220$lambda$199;
                    case 1:
                        initialize$lambda$220$lambda$80 = ServiceProvider.initialize$lambda$220$lambda$80(servicesRegistry);
                        return initialize$lambda$220$lambda$80;
                    default:
                        initialize$lambda$220$lambda$176 = ServiceProvider.initialize$lambda$220$lambda$176(servicesRegistry);
                        return initialize$lambda$220$lambda$176;
                }
            }
        }));
        final int i91 = 1;
        servicesRegistry.updateService(new ServiceKey("", fpf0.a(AndroidGetWebViewContainerUseCase.class)), ServiceFactoryKt.factoryOf(new gzs() { // from class: xsna.kpi0
            @Override // xsna.gzs
            public final Object invoke() {
                AndroidHandleFocusCounters initialize$lambda$220$lambda$200;
                AndroidGetWebViewContainerUseCase initialize$lambda$220$lambda$177;
                switch (i91) {
                    case 0:
                        initialize$lambda$220$lambda$200 = ServiceProvider.initialize$lambda$220$lambda$200(servicesRegistry);
                        return initialize$lambda$220$lambda$200;
                    default:
                        initialize$lambda$220$lambda$177 = ServiceProvider.initialize$lambda$220$lambda$177(servicesRegistry);
                        return initialize$lambda$220$lambda$177;
                }
            }
        }));
        final int i92 = 1;
        servicesRegistry.updateService(new ServiceKey("", fpf0.a(Load.class)), ServiceFactoryKt.factoryOf(new gzs() { // from class: xsna.lpi0
            @Override // xsna.gzs
            public final Object invoke() {
                GetAdRequest initialize$lambda$220$lambda$110;
                Load initialize$lambda$220$lambda$178;
                switch (i92) {
                    case 0:
                        initialize$lambda$220$lambda$110 = ServiceProvider.initialize$lambda$220$lambda$110(servicesRegistry);
                        return initialize$lambda$220$lambda$110;
                    default:
                        initialize$lambda$220$lambda$178 = ServiceProvider.initialize$lambda$220$lambda$178(servicesRegistry);
                        return initialize$lambda$220$lambda$178;
                }
            }
        }));
        servicesRegistry.updateService(new ServiceKey("", fpf0.a(AwaitInitialization.class)), ServiceFactoryKt.factoryOf(new stg0(servicesRegistry, 4)));
        servicesRegistry.updateService(new ServiceKey("", fpf0.a(GetAsyncHeaderBiddingToken.class)), ServiceFactoryKt.factoryOf(new yei0(servicesRegistry, 2)));
        final int i93 = 2;
        servicesRegistry.updateService(new ServiceKey("", fpf0.a(GetAdPlayer.class)), ServiceFactoryKt.factoryOf(new gzs() { // from class: xsna.npi0
            @Override // xsna.gzs
            public final Object invoke() {
                OfferwallManager initialize$lambda$220$lambda$202;
                MediationInitBlobMetadataReader initialize$lambda$220$lambda$101;
                GetAdPlayer initialize$lambda$220$lambda$181;
                switch (i93) {
                    case 0:
                        initialize$lambda$220$lambda$202 = ServiceProvider.initialize$lambda$220$lambda$202(servicesRegistry);
                        return initialize$lambda$220$lambda$202;
                    case 1:
                        initialize$lambda$220$lambda$101 = ServiceProvider.initialize$lambda$220$lambda$101(servicesRegistry);
                        return initialize$lambda$220$lambda$101;
                    default:
                        initialize$lambda$220$lambda$181 = ServiceProvider.initialize$lambda$220$lambda$181(servicesRegistry);
                        return initialize$lambda$220$lambda$181;
                }
            }
        }));
        final int i94 = 1;
        servicesRegistry.updateService(new ServiceKey("", fpf0.a(CacheWebViewAssets.class)), msy.b(new gzs() { // from class: xsna.ppi0
            @Override // xsna.gzs
            public final Object invoke() {
                GetIsOfferwallAdReady initialize$lambda$220$lambda$204;
                CacheWebViewAssets initialize$lambda$220$lambda$182;
                switch (i94) {
                    case 0:
                        initialize$lambda$220$lambda$204 = ServiceProvider.initialize$lambda$220$lambda$204(servicesRegistry);
                        return initialize$lambda$220$lambda$204;
                    default:
                        initialize$lambda$220$lambda$182 = ServiceProvider.initialize$lambda$220$lambda$182(servicesRegistry);
                        return initialize$lambda$220$lambda$182;
                }
            }
        }));
        final int i95 = 1;
        servicesRegistry.updateService(new ServiceKey("", fpf0.a(HandleGatewayAdResponse.class)), ServiceFactoryKt.factoryOf(new gzs() { // from class: xsna.qpi0
            @Override // xsna.gzs
            public final Object invoke() {
                FIdDataSource initialize$lambda$220$lambda$205;
                HandleGatewayAdResponse initialize$lambda$220$lambda$183;
                switch (i95) {
                    case 0:
                        initialize$lambda$220$lambda$205 = ServiceProvider.initialize$lambda$220$lambda$205(servicesRegistry);
                        return initialize$lambda$220$lambda$205;
                    default:
                        initialize$lambda$220$lambda$183 = ServiceProvider.initialize$lambda$220$lambda$183(servicesRegistry);
                        return initialize$lambda$220$lambda$183;
                }
            }
        }));
        servicesRegistry.updateService(new ServiceKey("", fpf0.a(HandleInvocationsFromAdViewer.class)), ServiceFactoryKt.factoryOf(new uh80(6)));
        final int i96 = 2;
        servicesRegistry.updateService(new ServiceKey("", fpf0.a(LegacyLoadUseCase.class)), ServiceFactoryKt.factoryOf(new gzs() { // from class: xsna.rpi0
            @Override // xsna.gzs
            public final Object invoke() {
                AdQualityVersionDataSource initialize$lambda$220$lambda$207;
                Refresh initialize$lambda$220$lambda$88;
                LegacyLoadUseCase initialize$lambda$220$lambda$185;
                switch (i96) {
                    case 0:
                        initialize$lambda$220$lambda$207 = ServiceProvider.initialize$lambda$220$lambda$207(servicesRegistry);
                        return initialize$lambda$220$lambda$207;
                    case 1:
                        initialize$lambda$220$lambda$88 = ServiceProvider.initialize$lambda$220$lambda$88(servicesRegistry);
                        return initialize$lambda$220$lambda$88;
                    default:
                        initialize$lambda$220$lambda$185 = ServiceProvider.initialize$lambda$220$lambda$185(servicesRegistry);
                        return initialize$lambda$220$lambda$185;
                }
            }
        }));
        final int i97 = 2;
        servicesRegistry.updateService(new ServiceKey("", fpf0.a(WebViewLessLoadStrategy.class)), msy.b(new gzs() { // from class: xsna.spi0
            @Override // xsna.gzs
            public final Object invoke() {
                CleanUpWhenOpportunityExpires initialize$lambda$220$lambda$208;
                CacheAssets initialize$lambda$220$lambda$89;
                WebViewLessLoadStrategy initialize$lambda$220$lambda$186;
                switch (i97) {
                    case 0:
                        initialize$lambda$220$lambda$208 = ServiceProvider.initialize$lambda$220$lambda$208(servicesRegistry);
                        return initialize$lambda$220$lambda$208;
                    case 1:
                        initialize$lambda$220$lambda$89 = ServiceProvider.initialize$lambda$220$lambda$89(servicesRegistry);
                        return initialize$lambda$220$lambda$89;
                    default:
                        initialize$lambda$220$lambda$186 = ServiceProvider.initialize$lambda$220$lambda$186(servicesRegistry);
                        return initialize$lambda$220$lambda$186;
                }
            }
        }));
        final int i98 = 1;
        servicesRegistry.updateService(new ServiceKey("", fpf0.a(SafeCallbackInvoke.class)), msy.b(new gzs() { // from class: xsna.fri0
            @Override // xsna.gzs
            public final Object invoke() {
                AdRefresh initialize$lambda$220$lambda$90;
                SafeCallbackInvoke initialize$lambda$220$lambda$187;
                switch (i98) {
                    case 0:
                        initialize$lambda$220$lambda$90 = ServiceProvider.initialize$lambda$220$lambda$90(servicesRegistry);
                        return initialize$lambda$220$lambda$90;
                    default:
                        initialize$lambda$220$lambda$187 = ServiceProvider.initialize$lambda$220$lambda$187(servicesRegistry);
                        return initialize$lambda$220$lambda$187;
                }
            }
        }));
        final int i99 = 1;
        servicesRegistry.updateService(new ServiceKey("", fpf0.a(CoroutineTimer.class)), ServiceFactoryKt.factoryOf(new gzs() { // from class: xsna.tpi0
            @Override // xsna.gzs
            public final Object invoke() {
                OrientationRepository initialize$lambda$220$lambda$209;
                CoroutineTimer initialize$lambda$220$lambda$188;
                switch (i99) {
                    case 0:
                        initialize$lambda$220$lambda$209 = ServiceProvider.initialize$lambda$220$lambda$209(servicesRegistry);
                        return initialize$lambda$220$lambda$209;
                    default:
                        initialize$lambda$220$lambda$188 = ServiceProvider.initialize$lambda$220$lambda$188(servicesRegistry);
                        return initialize$lambda$220$lambda$188;
                }
            }
        }));
        final int i100 = 2;
        servicesRegistry.updateService(new ServiceKey("", fpf0.a(SetGameId.class)), msy.b(new gzs() { // from class: xsna.upi0
            @Override // xsna.gzs
            public final Object invoke() {
                AndroidAppSetIdDataSource initialize$lambda$220$lambda$210;
                SendDiagnosticEvent initialize$lambda$220$lambda$91;
                SetGameId initialize$lambda$220$lambda$189;
                switch (i100) {
                    case 0:
                        initialize$lambda$220$lambda$210 = ServiceProvider.initialize$lambda$220$lambda$210(servicesRegistry);
                        return initialize$lambda$220$lambda$210;
                    case 1:
                        initialize$lambda$220$lambda$91 = ServiceProvider.initialize$lambda$220$lambda$91(servicesRegistry);
                        return initialize$lambda$220$lambda$91;
                    default:
                        initialize$lambda$220$lambda$189 = ServiceProvider.initialize$lambda$220$lambda$189(servicesRegistry);
                        return initialize$lambda$220$lambda$189;
                }
            }
        }));
        final int i101 = 1;
        servicesRegistry.updateService(new ServiceKey("", fpf0.a(GetGameId.class)), msy.b(new gzs() { // from class: xsna.gri0
            @Override // xsna.gzs
            public final Object invoke() {
                SendWebViewClientErrorDiagnostics initialize$lambda$220$lambda$92;
                GetGameId initialize$lambda$220$lambda$190;
                switch (i101) {
                    case 0:
                        initialize$lambda$220$lambda$92 = ServiceProvider.initialize$lambda$220$lambda$92(servicesRegistry);
                        return initialize$lambda$220$lambda$92;
                    default:
                        initialize$lambda$220$lambda$190 = ServiceProvider.initialize$lambda$220$lambda$190(servicesRegistry);
                        return initialize$lambda$220$lambda$190;
                }
            }
        }));
        final int i102 = 0;
        servicesRegistry.updateService(new ServiceKey("", fpf0.a(ValidateGameId.class)), msy.b(new gzs() { // from class: xsna.bpi0
            @Override // xsna.gzs
            public final Object invoke() {
                ValidateGameId initialize$lambda$220$lambda$191;
                DeviceInfoRepository initialize$lambda$220$lambda$73;
                pvj initialize$lambda$220$lambda$170;
                switch (i102) {
                    case 0:
                        initialize$lambda$220$lambda$191 = ServiceProvider.initialize$lambda$220$lambda$191(servicesRegistry);
                        return initialize$lambda$220$lambda$191;
                    case 1:
                        initialize$lambda$220$lambda$73 = ServiceProvider.initialize$lambda$220$lambda$73(servicesRegistry);
                        return initialize$lambda$220$lambda$73;
                    default:
                        initialize$lambda$220$lambda$170 = ServiceProvider.initialize$lambda$220$lambda$170(servicesRegistry);
                        return initialize$lambda$220$lambda$170;
                }
            }
        }));
        final int i103 = 0;
        servicesRegistry.updateService(new ServiceKey("", fpf0.a(ValidateExtrasSize.class)), msy.b(new gzs() { // from class: xsna.cpi0
            @Override // xsna.gzs
            public final Object invoke() {
                ValidateExtrasSize initialize$lambda$220$lambda$192;
                DiagnosticEventRepository initialize$lambda$220$lambda$74;
                switch (i103) {
                    case 0:
                        initialize$lambda$220$lambda$192 = ServiceProvider.initialize$lambda$220$lambda$192(servicesRegistry);
                        return initialize$lambda$220$lambda$192;
                    default:
                        initialize$lambda$220$lambda$74 = ServiceProvider.initialize$lambda$220$lambda$74(servicesRegistry);
                        return initialize$lambda$220$lambda$74;
                }
            }
        }));
        final int i104 = 0;
        servicesRegistry.updateService(new ServiceKey("", fpf0.a(ShouldAllowInitialization.class)), msy.b(new gzs() { // from class: xsna.dpi0
            @Override // xsna.gzs
            public final Object invoke() {
                ShouldAllowInitialization initialize$lambda$220$lambda$193;
                GetUniversalRequestForPayLoad initialize$lambda$220$lambda$117;
                switch (i104) {
                    case 0:
                        initialize$lambda$220$lambda$193 = ServiceProvider.initialize$lambda$220$lambda$193(servicesRegistry);
                        return initialize$lambda$220$lambda$193;
                    default:
                        initialize$lambda$220$lambda$117 = ServiceProvider.initialize$lambda$220$lambda$117(servicesRegistry);
                        return initialize$lambda$220$lambda$117;
                }
            }
        }));
        final int i105 = 0;
        servicesRegistry.updateService(new ServiceKey("", fpf0.a(CheckForGameIdAndTestModeChanges.class)), msy.b(new gzs() { // from class: xsna.epi0
            @Override // xsna.gzs
            public final Object invoke() {
                CheckForGameIdAndTestModeChanges initialize$lambda$220$lambda$194;
                LegacyUserConsentRepository initialize$lambda$220$lambda$75;
                StoreMonitor initialize$lambda$220$lambda$172;
                switch (i105) {
                    case 0:
                        initialize$lambda$220$lambda$194 = ServiceProvider.initialize$lambda$220$lambda$194(servicesRegistry);
                        return initialize$lambda$220$lambda$194;
                    case 1:
                        initialize$lambda$220$lambda$75 = ServiceProvider.initialize$lambda$220$lambda$75(servicesRegistry);
                        return initialize$lambda$220$lambda$75;
                    default:
                        initialize$lambda$220$lambda$172 = ServiceProvider.initialize$lambda$220$lambda$172(servicesRegistry);
                        return initialize$lambda$220$lambda$172;
                }
            }
        }));
        final int i106 = 0;
        servicesRegistry.updateService(new ServiceKey("", fpf0.a(DownloadPriorityQueue.class)), msy.b(new gzs() { // from class: xsna.fpi0
            @Override // xsna.gzs
            public final Object invoke() {
                DownloadPriorityQueue initialize$lambda$220$lambda$195;
                GetAdDataRefreshRequest initialize$lambda$220$lambda$107;
                switch (i106) {
                    case 0:
                        initialize$lambda$220$lambda$195 = ServiceProvider.initialize$lambda$220$lambda$195(servicesRegistry);
                        return initialize$lambda$220$lambda$195;
                    default:
                        initialize$lambda$220$lambda$107 = ServiceProvider.initialize$lambda$220$lambda$107(servicesRegistry);
                        return initialize$lambda$220$lambda$107;
                }
            }
        }));
        final int i107 = 0;
        servicesRegistry.updateService(new ServiceKey("", fpf0.a(CleanupDirectory.class)), msy.b(new gzs() { // from class: xsna.gpi0
            @Override // xsna.gzs
            public final Object invoke() {
                CleanupDirectory initialize$lambda$220$lambda$196;
                MediationInfoConverter initialize$lambda$220$lambda$77;
                switch (i107) {
                    case 0:
                        initialize$lambda$220$lambda$196 = ServiceProvider.initialize$lambda$220$lambda$196(servicesRegistry);
                        return initialize$lambda$220$lambda$196;
                    default:
                        initialize$lambda$220$lambda$77 = ServiceProvider.initialize$lambda$220$lambda$77(servicesRegistry);
                        return initialize$lambda$220$lambda$77;
                }
            }
        }));
        final int i108 = 0;
        servicesRegistry.updateService(new ServiceKey("", fpf0.a(FocusRepository.class)), msy.b(new gzs() { // from class: xsna.hpi0
            @Override // xsna.gzs
            public final Object invoke() {
                FocusRepository initialize$lambda$220$lambda$197;
                MediationRepository initialize$lambda$220$lambda$78;
                AndroidAttribution initialize$lambda$220$lambda$174;
                switch (i108) {
                    case 0:
                        initialize$lambda$220$lambda$197 = ServiceProvider.initialize$lambda$220$lambda$197(servicesRegistry);
                        return initialize$lambda$220$lambda$197;
                    case 1:
                        initialize$lambda$220$lambda$78 = ServiceProvider.initialize$lambda$220$lambda$78(servicesRegistry);
                        return initialize$lambda$220$lambda$78;
                    default:
                        initialize$lambda$220$lambda$174 = ServiceProvider.initialize$lambda$220$lambda$174(servicesRegistry);
                        return initialize$lambda$220$lambda$174;
                }
            }
        }));
        final int i109 = 0;
        servicesRegistry.updateService(new ServiceKey("", fpf0.a(AndroidGetIsAdActivity.class)), msy.b(new gzs() { // from class: xsna.ipi0
            @Override // xsna.gzs
            public final Object invoke() {
                AndroidGetIsAdActivity initialize$lambda$220$lambda$198;
                OpenMeasurementRepository initialize$lambda$220$lambda$79;
                AdPlayerScope initialize$lambda$220$lambda$175;
                switch (i109) {
                    case 0:
                        initialize$lambda$220$lambda$198 = ServiceProvider.initialize$lambda$220$lambda$198(servicesRegistry);
                        return initialize$lambda$220$lambda$198;
                    case 1:
                        initialize$lambda$220$lambda$79 = ServiceProvider.initialize$lambda$220$lambda$79(servicesRegistry);
                        return initialize$lambda$220$lambda$79;
                    default:
                        initialize$lambda$220$lambda$175 = ServiceProvider.initialize$lambda$220$lambda$175(servicesRegistry);
                        return initialize$lambda$220$lambda$175;
                }
            }
        }));
        final int i110 = 0;
        servicesRegistry.updateService(new ServiceKey("", fpf0.a(AndroidGetLifecycleFlow.class)), msy.b(new gzs() { // from class: xsna.jpi0
            @Override // xsna.gzs
            public final Object invoke() {
                AndroidGetLifecycleFlow initialize$lambda$220$lambda$199;
                SessionRepository initialize$lambda$220$lambda$80;
                AndroidWebViewClient initialize$lambda$220$lambda$176;
                switch (i110) {
                    case 0:
                        initialize$lambda$220$lambda$199 = ServiceProvider.initialize$lambda$220$lambda$199(servicesRegistry);
                        return initialize$lambda$220$lambda$199;
                    case 1:
                        initialize$lambda$220$lambda$80 = ServiceProvider.initialize$lambda$220$lambda$80(servicesRegistry);
                        return initialize$lambda$220$lambda$80;
                    default:
                        initialize$lambda$220$lambda$176 = ServiceProvider.initialize$lambda$220$lambda$176(servicesRegistry);
                        return initialize$lambda$220$lambda$176;
                }
            }
        }));
        final int i111 = 0;
        servicesRegistry.updateService(new ServiceKey("", fpf0.a(AndroidHandleFocusCounters.class)), msy.b(new gzs() { // from class: xsna.kpi0
            @Override // xsna.gzs
            public final Object invoke() {
                AndroidHandleFocusCounters initialize$lambda$220$lambda$200;
                AndroidGetWebViewContainerUseCase initialize$lambda$220$lambda$177;
                switch (i111) {
                    case 0:
                        initialize$lambda$220$lambda$200 = ServiceProvider.initialize$lambda$220$lambda$200(servicesRegistry);
                        return initialize$lambda$220$lambda$200;
                    default:
                        initialize$lambda$220$lambda$177 = ServiceProvider.initialize$lambda$220$lambda$177(servicesRegistry);
                        return initialize$lambda$220$lambda$177;
                }
            }
        }));
        final int i112 = 0;
        servicesRegistry.updateService(new ServiceKey("", fpf0.a(OfferwallAdapterBridge.class)), msy.b(new gzs() { // from class: xsna.mpi0
            @Override // xsna.gzs
            public final Object invoke() {
                OfferwallAdapterBridge initialize$lambda$220$lambda$201;
                GetUniversalRequestSharedData initialize$lambda$220$lambda$118;
                switch (i112) {
                    case 0:
                        initialize$lambda$220$lambda$201 = ServiceProvider.initialize$lambda$220$lambda$201(servicesRegistry);
                        return initialize$lambda$220$lambda$201;
                    default:
                        initialize$lambda$220$lambda$118 = ServiceProvider.initialize$lambda$220$lambda$118(servicesRegistry);
                        return initialize$lambda$220$lambda$118;
                }
            }
        }));
        final int i113 = 0;
        servicesRegistry.updateService(new ServiceKey("", fpf0.a(OfferwallManager.class)), msy.b(new gzs() { // from class: xsna.npi0
            @Override // xsna.gzs
            public final Object invoke() {
                OfferwallManager initialize$lambda$220$lambda$202;
                MediationInitBlobMetadataReader initialize$lambda$220$lambda$101;
                GetAdPlayer initialize$lambda$220$lambda$181;
                switch (i113) {
                    case 0:
                        initialize$lambda$220$lambda$202 = ServiceProvider.initialize$lambda$220$lambda$202(servicesRegistry);
                        return initialize$lambda$220$lambda$202;
                    case 1:
                        initialize$lambda$220$lambda$101 = ServiceProvider.initialize$lambda$220$lambda$101(servicesRegistry);
                        return initialize$lambda$220$lambda$101;
                    default:
                        initialize$lambda$220$lambda$181 = ServiceProvider.initialize$lambda$220$lambda$181(servicesRegistry);
                        return initialize$lambda$220$lambda$181;
                }
            }
        }));
        final int i114 = 0;
        servicesRegistry.updateService(new ServiceKey("", fpf0.a(LoadOfferwallAd.class)), msy.b(new gzs() { // from class: xsna.opi0
            @Override // xsna.gzs
            public final Object invoke() {
                LoadOfferwallAd initialize$lambda$220$lambda$203;
                ExecuteAdViewerRequest initialize$lambda$220$lambda$84;
                GetAdPlayerConfigRequest initialize$lambda$220$lambda$108;
                switch (i114) {
                    case 0:
                        initialize$lambda$220$lambda$203 = ServiceProvider.initialize$lambda$220$lambda$203(servicesRegistry);
                        return initialize$lambda$220$lambda$203;
                    case 1:
                        initialize$lambda$220$lambda$84 = ServiceProvider.initialize$lambda$220$lambda$84(servicesRegistry);
                        return initialize$lambda$220$lambda$84;
                    default:
                        initialize$lambda$220$lambda$108 = ServiceProvider.initialize$lambda$220$lambda$108(servicesRegistry);
                        return initialize$lambda$220$lambda$108;
                }
            }
        }));
        final int i115 = 0;
        servicesRegistry.updateService(new ServiceKey("", fpf0.a(GetIsOfferwallAdReady.class)), msy.b(new gzs() { // from class: xsna.ppi0
            @Override // xsna.gzs
            public final Object invoke() {
                GetIsOfferwallAdReady initialize$lambda$220$lambda$204;
                CacheWebViewAssets initialize$lambda$220$lambda$182;
                switch (i115) {
                    case 0:
                        initialize$lambda$220$lambda$204 = ServiceProvider.initialize$lambda$220$lambda$204(servicesRegistry);
                        return initialize$lambda$220$lambda$204;
                    default:
                        initialize$lambda$220$lambda$182 = ServiceProvider.initialize$lambda$220$lambda$182(servicesRegistry);
                        return initialize$lambda$220$lambda$182;
                }
            }
        }));
        final int i116 = 0;
        servicesRegistry.updateService(new ServiceKey("", fpf0.a(FIdDataSource.class)), msy.b(new gzs() { // from class: xsna.qpi0
            @Override // xsna.gzs
            public final Object invoke() {
                FIdDataSource initialize$lambda$220$lambda$205;
                HandleGatewayAdResponse initialize$lambda$220$lambda$183;
                switch (i116) {
                    case 0:
                        initialize$lambda$220$lambda$205 = ServiceProvider.initialize$lambda$220$lambda$205(servicesRegistry);
                        return initialize$lambda$220$lambda$205;
                    default:
                        initialize$lambda$220$lambda$183 = ServiceProvider.initialize$lambda$220$lambda$183(servicesRegistry);
                        return initialize$lambda$220$lambda$183;
                }
            }
        }));
        servicesRegistry.updateService(new ServiceKey("", fpf0.a(FIdExistenceDataSource.class)), msy.b(new uh80(5)));
        final int i117 = 0;
        servicesRegistry.updateService(new ServiceKey("", fpf0.a(AdQualityVersionDataSource.class)), msy.b(new gzs() { // from class: xsna.rpi0
            @Override // xsna.gzs
            public final Object invoke() {
                AdQualityVersionDataSource initialize$lambda$220$lambda$207;
                Refresh initialize$lambda$220$lambda$88;
                LegacyLoadUseCase initialize$lambda$220$lambda$185;
                switch (i117) {
                    case 0:
                        initialize$lambda$220$lambda$207 = ServiceProvider.initialize$lambda$220$lambda$207(servicesRegistry);
                        return initialize$lambda$220$lambda$207;
                    case 1:
                        initialize$lambda$220$lambda$88 = ServiceProvider.initialize$lambda$220$lambda$88(servicesRegistry);
                        return initialize$lambda$220$lambda$88;
                    default:
                        initialize$lambda$220$lambda$185 = ServiceProvider.initialize$lambda$220$lambda$185(servicesRegistry);
                        return initialize$lambda$220$lambda$185;
                }
            }
        }));
        final int i118 = 0;
        servicesRegistry.updateService(new ServiceKey("", fpf0.a(CleanUpWhenOpportunityExpires.class)), msy.b(new gzs() { // from class: xsna.spi0
            @Override // xsna.gzs
            public final Object invoke() {
                CleanUpWhenOpportunityExpires initialize$lambda$220$lambda$208;
                CacheAssets initialize$lambda$220$lambda$89;
                WebViewLessLoadStrategy initialize$lambda$220$lambda$186;
                switch (i118) {
                    case 0:
                        initialize$lambda$220$lambda$208 = ServiceProvider.initialize$lambda$220$lambda$208(servicesRegistry);
                        return initialize$lambda$220$lambda$208;
                    case 1:
                        initialize$lambda$220$lambda$89 = ServiceProvider.initialize$lambda$220$lambda$89(servicesRegistry);
                        return initialize$lambda$220$lambda$89;
                    default:
                        initialize$lambda$220$lambda$186 = ServiceProvider.initialize$lambda$220$lambda$186(servicesRegistry);
                        return initialize$lambda$220$lambda$186;
                }
            }
        }));
        final int i119 = 0;
        servicesRegistry.updateService(new ServiceKey("", fpf0.a(OrientationRepository.class)), msy.b(new gzs() { // from class: xsna.tpi0
            @Override // xsna.gzs
            public final Object invoke() {
                OrientationRepository initialize$lambda$220$lambda$209;
                CoroutineTimer initialize$lambda$220$lambda$188;
                switch (i119) {
                    case 0:
                        initialize$lambda$220$lambda$209 = ServiceProvider.initialize$lambda$220$lambda$209(servicesRegistry);
                        return initialize$lambda$220$lambda$209;
                    default:
                        initialize$lambda$220$lambda$188 = ServiceProvider.initialize$lambda$220$lambda$188(servicesRegistry);
                        return initialize$lambda$220$lambda$188;
                }
            }
        }));
        final int i120 = 0;
        servicesRegistry.updateService(new ServiceKey("", fpf0.a(AndroidAppSetIdDataSource.class)), msy.b(new gzs() { // from class: xsna.upi0
            @Override // xsna.gzs
            public final Object invoke() {
                AndroidAppSetIdDataSource initialize$lambda$220$lambda$210;
                SendDiagnosticEvent initialize$lambda$220$lambda$91;
                SetGameId initialize$lambda$220$lambda$189;
                switch (i120) {
                    case 0:
                        initialize$lambda$220$lambda$210 = ServiceProvider.initialize$lambda$220$lambda$210(servicesRegistry);
                        return initialize$lambda$220$lambda$210;
                    case 1:
                        initialize$lambda$220$lambda$91 = ServiceProvider.initialize$lambda$220$lambda$91(servicesRegistry);
                        return initialize$lambda$220$lambda$91;
                    default:
                        initialize$lambda$220$lambda$189 = ServiceProvider.initialize$lambda$220$lambda$189(servicesRegistry);
                        return initialize$lambda$220$lambda$189;
                }
            }
        }));
        final int i121 = 0;
        servicesRegistry.updateService(new ServiceKey("", fpf0.a(AndroidUnityInfoDataSource.class)), msy.b(new gzs() { // from class: xsna.vpi0
            @Override // xsna.gzs
            public final Object invoke() {
                AndroidUnityInfoDataSource initialize$lambda$220$lambda$211;
                GetCachedAsset initialize$lambda$220$lambda$119;
                switch (i121) {
                    case 0:
                        initialize$lambda$220$lambda$211 = ServiceProvider.initialize$lambda$220$lambda$211(servicesRegistry);
                        return initialize$lambda$220$lambda$211;
                    default:
                        initialize$lambda$220$lambda$119 = ServiceProvider.initialize$lambda$220$lambda$119(servicesRegistry);
                        return initialize$lambda$220$lambda$119;
                }
            }
        }));
        final int i122 = 0;
        servicesRegistry.updateService(new ServiceKey("", fpf0.a(InstallReferrerDataSource.class)), msy.b(new gzs() { // from class: xsna.wpi0
            @Override // xsna.gzs
            public final Object invoke() {
                InstallReferrerDataSource initialize$lambda$220$lambda$212;
                Show initialize$lambda$220$lambda$93;
                AndroidGetAdPlayerContext initialize$lambda$220$lambda$109;
                switch (i122) {
                    case 0:
                        initialize$lambda$220$lambda$212 = ServiceProvider.initialize$lambda$220$lambda$212(servicesRegistry);
                        return initialize$lambda$220$lambda$212;
                    case 1:
                        initialize$lambda$220$lambda$93 = ServiceProvider.initialize$lambda$220$lambda$93(servicesRegistry);
                        return initialize$lambda$220$lambda$93;
                    default:
                        initialize$lambda$220$lambda$109 = ServiceProvider.initialize$lambda$220$lambda$109(servicesRegistry);
                        return initialize$lambda$220$lambda$109;
                }
            }
        }));
        final int i123 = 0;
        servicesRegistry.updateService(new ServiceKey("", fpf0.a(GoogleAppIdDataSource.class)), msy.b(new gzs() { // from class: xsna.xpi0
            @Override // xsna.gzs
            public final Object invoke() {
                GoogleAppIdDataSource initialize$lambda$220$lambda$213;
                CacheFile initialize$lambda$220$lambda$94;
                switch (i123) {
                    case 0:
                        initialize$lambda$220$lambda$213 = ServiceProvider.initialize$lambda$220$lambda$213(servicesRegistry);
                        return initialize$lambda$220$lambda$213;
                    default:
                        initialize$lambda$220$lambda$94 = ServiceProvider.initialize$lambda$220$lambda$94(servicesRegistry);
                        return initialize$lambda$220$lambda$94;
                }
            }
        }));
        servicesRegistry.updateService(new ServiceKey("", fpf0.a(HandleDebugSettings.class)), msy.b(new i8c0(7)));
        final int i124 = 0;
        servicesRegistry.updateService(new ServiceKey("", fpf0.a(Logger.class)), msy.b(new gzs() { // from class: xsna.ypi0
            @Override // xsna.gzs
            public final Object invoke() {
                Logger initialize$lambda$220$lambda$215;
                GetAdObject initialize$lambda$220$lambda$96;
                switch (i124) {
                    case 0:
                        initialize$lambda$220$lambda$215 = ServiceProvider.initialize$lambda$220$lambda$215(servicesRegistry);
                        return initialize$lambda$220$lambda$215;
                    default:
                        initialize$lambda$220$lambda$96 = ServiceProvider.initialize$lambda$220$lambda$96(servicesRegistry);
                        return initialize$lambda$220$lambda$96;
                }
            }
        }));
        servicesRegistry.updateService(new ServiceKey("", fpf0.a(IsBillingClientAvailable.class)), msy.b(new pm60(7)));
        final int i125 = 0;
        servicesRegistry.updateService(new ServiceKey("", fpf0.a(UnityBootConfigDataSource.class)), msy.b(new gzs() { // from class: xsna.zpi0
            @Override // xsna.gzs
            public final Object invoke() {
                UnityBootConfigDataSource initialize$lambda$220$lambda$217;
                BuildHeaderBiddingToken initialize$lambda$220$lambda$98;
                switch (i125) {
                    case 0:
                        initialize$lambda$220$lambda$217 = ServiceProvider.initialize$lambda$220$lambda$217(servicesRegistry);
                        return initialize$lambda$220$lambda$217;
                    default:
                        initialize$lambda$220$lambda$98 = ServiceProvider.initialize$lambda$220$lambda$98(servicesRegistry);
                        return initialize$lambda$220$lambda$98;
                }
            }
        }));
        servicesRegistry.updateService(new ServiceKey("", fpf0.a(GetSafeguardedInitializationPolicy.class)), msy.b(new d2c0(5)));
        servicesRegistry.updateService(new ServiceKey("", fpf0.a(RequestUrlFactory.class)), ServiceFactoryKt.factoryOf(new rme0(servicesRegistry, 5)));
        return s3q0.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final yvj initialize$lambda$220$lambda$10(UnityAdsModule unityAdsModule, ServicesRegistry servicesRegistry) {
        return unityAdsModule.lifecycleCoroutineScope((ISDKDispatchers) servicesRegistry.resolveService(new ServiceKey("", fpf0.a(ISDKDispatchers.class))), (pvj) servicesRegistry.resolveService(new ServiceKey("sdk", fpf0.a(pvj.class))), (eyx) servicesRegistry.resolveService(new ServiceKey(NAMED_PUBLIC_JOB, fpf0.a(eyx.class))));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final GetInitializationData initialize$lambda$220$lambda$100(ServicesRegistry servicesRegistry) {
        return new AndroidGetInitializationData((GetInitializationRequestPayload) servicesRegistry.resolveService(new ServiceKey("", fpf0.a(GetInitializationRequestPayload.class))), (GetUniversalRequestSharedData) servicesRegistry.resolveService(new ServiceKey("", fpf0.a(GetUniversalRequestSharedData.class))));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final MediationInitBlobMetadataReader initialize$lambda$220$lambda$101(ServicesRegistry servicesRegistry) {
        return new MediationInitBlobMetadataReader((JsonStorage) servicesRegistry.resolveService(new ServiceKey("MEMORY", fpf0.a(JsonStorage.class))));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final GetInitializationRequestPayload initialize$lambda$220$lambda$102(ServicesRegistry servicesRegistry) {
        return new AndroidGetInitializationRequestPayload((GetClientInfo) servicesRegistry.resolveService(new ServiceKey("", fpf0.a(GetClientInfo.class))), (SessionRepository) servicesRegistry.resolveService(new ServiceKey("", fpf0.a(SessionRepository.class))), (DeviceInfoRepository) servicesRegistry.resolveService(new ServiceKey("", fpf0.a(DeviceInfoRepository.class))), (LegacyUserConsentRepository) servicesRegistry.resolveService(new ServiceKey("", fpf0.a(LegacyUserConsentRepository.class))), (MediationInitBlobMetadataReader) servicesRegistry.resolveService(new ServiceKey("", fpf0.a(MediationInitBlobMetadataReader.class))), (InstallReferrerDataSource) servicesRegistry.resolveService(new ServiceKey("", fpf0.a(InstallReferrerDataSource.class))), (GoogleAppIdDataSource) servicesRegistry.resolveService(new ServiceKey("", fpf0.a(GoogleAppIdDataSource.class))));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final GetInitializationState initialize$lambda$220$lambda$103(ServicesRegistry servicesRegistry) {
        return new CommonGetInitializationState((SessionRepository) servicesRegistry.resolveService(new ServiceKey("", fpf0.a(SessionRepository.class))), (SDKPropertiesManager) servicesRegistry.resolveService(new ServiceKey("", fpf0.a(SDKPropertiesManager.class))));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final GetIsFileCache initialize$lambda$220$lambda$104(ServicesRegistry servicesRegistry) {
        return new CommonGetIsFileCache((CacheRepository) servicesRegistry.resolveService(new ServiceKey("", fpf0.a(CacheRepository.class))), (SessionRepository) servicesRegistry.resolveService(new ServiceKey("", fpf0.a(SessionRepository.class))), (SendDiagnosticEvent) servicesRegistry.resolveService(new ServiceKey("", fpf0.a(SendDiagnosticEvent.class))), (GetAssetFileName) servicesRegistry.resolveService(new ServiceKey("", fpf0.a(GetAssetFileName.class))));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final SetInitializationState initialize$lambda$220$lambda$105(ServicesRegistry servicesRegistry) {
        return new CommonSetInitializationState((SessionRepository) servicesRegistry.resolveService(new ServiceKey("", fpf0.a(SessionRepository.class))), (SDKPropertiesManager) servicesRegistry.resolveService(new ServiceKey("", fpf0.a(SDKPropertiesManager.class))));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final GetRequestPolicy initialize$lambda$220$lambda$106(ServicesRegistry servicesRegistry) {
        return new AndroidGetAdRequestPolicy((SessionRepository) servicesRegistry.resolveService(new ServiceKey("", fpf0.a(SessionRepository.class))));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final GetAdDataRefreshRequest initialize$lambda$220$lambda$107(ServicesRegistry servicesRegistry) {
        return new AndroidGetAdDataRefreshRequest((GetUniversalRequestForPayLoad) servicesRegistry.resolveService(new ServiceKey("", fpf0.a(GetUniversalRequestForPayLoad.class))), (SessionRepository) servicesRegistry.resolveService(new ServiceKey("", fpf0.a(SessionRepository.class))), (DeviceInfoRepository) servicesRegistry.resolveService(new ServiceKey("", fpf0.a(DeviceInfoRepository.class))), (CampaignRepository) servicesRegistry.resolveService(new ServiceKey("", fpf0.a(CampaignRepository.class))));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final GetAdPlayerConfigRequest initialize$lambda$220$lambda$108(ServicesRegistry servicesRegistry) {
        return new AndroidGetAdPlayerConfigRequest((GetUniversalRequestForPayLoad) servicesRegistry.resolveService(new ServiceKey("", fpf0.a(GetUniversalRequestForPayLoad.class))), (MediationInfoConverter) servicesRegistry.resolveService(new ServiceKey("", fpf0.a(MediationInfoConverter.class))));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final AndroidGetAdPlayerContext initialize$lambda$220$lambda$109(ServicesRegistry servicesRegistry) {
        return new AndroidGetAdPlayerContext((DeviceInfoRepository) servicesRegistry.resolveService(new ServiceKey("", fpf0.a(DeviceInfoRepository.class))), (SessionRepository) servicesRegistry.resolveService(new ServiceKey("", fpf0.a(SessionRepository.class))));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final yvj initialize$lambda$220$lambda$11(UnityAdsModule unityAdsModule, ServicesRegistry servicesRegistry) {
        return unityAdsModule.getTokenCoroutineScope((ISDKDispatchers) servicesRegistry.resolveService(new ServiceKey("", fpf0.a(ISDKDispatchers.class))), (pvj) servicesRegistry.resolveService(new ServiceKey("sdk", fpf0.a(pvj.class))), (eyx) servicesRegistry.resolveService(new ServiceKey(NAMED_PUBLIC_JOB, fpf0.a(eyx.class))));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final GetAdRequest initialize$lambda$220$lambda$110(ServicesRegistry servicesRegistry) {
        return new AndroidGetAdRequest((GetUniversalRequestForPayLoad) servicesRegistry.resolveService(new ServiceKey("", fpf0.a(GetUniversalRequestForPayLoad.class))), (SessionRepository) servicesRegistry.resolveService(new ServiceKey("", fpf0.a(SessionRepository.class))), (DeviceInfoRepository) servicesRegistry.resolveService(new ServiceKey("", fpf0.a(DeviceInfoRepository.class))), (CampaignRepository) servicesRegistry.resolveService(new ServiceKey("", fpf0.a(CampaignRepository.class))), (WebviewConfigurationDataSource) servicesRegistry.resolveService(new ServiceKey("", fpf0.a(WebviewConfigurationDataSource.class))), (TcfRepository) servicesRegistry.resolveService(new ServiceKey("", fpf0.a(TcfRepository.class))));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final GetClientInfo initialize$lambda$220$lambda$111(ServicesRegistry servicesRegistry) {
        return new AndroidGetClientInfo((SessionRepository) servicesRegistry.resolveService(new ServiceKey("", fpf0.a(SessionRepository.class))), (MediationRepository) servicesRegistry.resolveService(new ServiceKey("", fpf0.a(MediationRepository.class))), (OmidManager) servicesRegistry.resolveService(new ServiceKey("", fpf0.a(OmidManager.class))), (OfferwallManager) servicesRegistry.resolveService(new ServiceKey("", fpf0.a(OfferwallManager.class))), (FIdExistenceDataSource) servicesRegistry.resolveService(new ServiceKey("", fpf0.a(FIdExistenceDataSource.class))), (AdQualityVersionDataSource) servicesRegistry.resolveService(new ServiceKey("", fpf0.a(AdQualityVersionDataSource.class))));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final GetInitializationCompletedRequest initialize$lambda$220$lambda$112(ServicesRegistry servicesRegistry) {
        return new AndroidGetInitializationCompletedRequest((GetUniversalRequestForPayLoad) servicesRegistry.resolveService(new ServiceKey("", fpf0.a(GetUniversalRequestForPayLoad.class))), (DeviceInfoRepository) servicesRegistry.resolveService(new ServiceKey("", fpf0.a(DeviceInfoRepository.class))), (SessionRepository) servicesRegistry.resolveService(new ServiceKey("", fpf0.a(SessionRepository.class))), (CoherenceLibraryManager) servicesRegistry.resolveService(new ServiceKey("", fpf0.a(CoherenceLibraryManager.class))));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final GetInitializationRequest initialize$lambda$220$lambda$113(ServicesRegistry servicesRegistry) {
        return new AndroidGetInitializationRequest((GetInitializationRequestPayload) servicesRegistry.resolveService(new ServiceKey("", fpf0.a(GetInitializationRequestPayload.class))), (GetUniversalRequestForPayLoad) servicesRegistry.resolveService(new ServiceKey("", fpf0.a(GetUniversalRequestForPayLoad.class))));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final GetLimitedSessionToken initialize$lambda$220$lambda$114(ServicesRegistry servicesRegistry) {
        return new AndroidGetLimitedSessionToken((DeviceInfoRepository) servicesRegistry.resolveService(new ServiceKey("", fpf0.a(DeviceInfoRepository.class))), (SessionRepository) servicesRegistry.resolveService(new ServiceKey("", fpf0.a(SessionRepository.class))), (MediationRepository) servicesRegistry.resolveService(new ServiceKey("", fpf0.a(MediationRepository.class))));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final GetOpenGLRendererInfo initialize$lambda$220$lambda$115(ServicesRegistry servicesRegistry) {
        return new AndroidGetOpenGLRendererInfo((SessionRepository) servicesRegistry.resolveService(new ServiceKey("", fpf0.a(SessionRepository.class))));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final GetSharedDataTimestamps initialize$lambda$220$lambda$116(ServicesRegistry servicesRegistry) {
        return new AndroidGetSharedDataTimestamps((ForegroundDurationReader) servicesRegistry.resolveService(new ServiceKey("", fpf0.a(ForegroundDurationReader.class))));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final GetUniversalRequestForPayLoad initialize$lambda$220$lambda$117(ServicesRegistry servicesRegistry) {
        return new AndroidGetUniversalRequestForPayLoad((GetUniversalRequestSharedData) servicesRegistry.resolveService(new ServiceKey("", fpf0.a(GetUniversalRequestSharedData.class))));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final GetUniversalRequestSharedData initialize$lambda$220$lambda$118(ServicesRegistry servicesRegistry) {
        return new AndroidGetUniversalRequestSharedData((GetSharedDataTimestamps) servicesRegistry.resolveService(new ServiceKey("", fpf0.a(GetSharedDataTimestamps.class))), (SessionRepository) servicesRegistry.resolveService(new ServiceKey("", fpf0.a(SessionRepository.class))), (DeviceInfoRepository) servicesRegistry.resolveService(new ServiceKey("", fpf0.a(DeviceInfoRepository.class))), (GetLimitedSessionToken) servicesRegistry.resolveService(new ServiceKey("", fpf0.a(GetLimitedSessionToken.class))), (DeveloperConsentRepository) servicesRegistry.resolveService(new ServiceKey("", fpf0.a(DeveloperConsentRepository.class))));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final GetCachedAsset initialize$lambda$220$lambda$119(ServicesRegistry servicesRegistry) {
        return new GetCachedAsset((CacheRepository) servicesRegistry.resolveService(new ServiceKey("", fpf0.a(CacheRepository.class))), (SessionRepository) servicesRegistry.resolveService(new ServiceKey("", fpf0.a(SessionRepository.class))), (Context) servicesRegistry.resolveService(new ServiceKey("", fpf0.a(Context.class))), (CacheWebViewAssets) servicesRegistry.resolveService(new ServiceKey("", fpf0.a(CacheWebViewAssets.class))), (GetAssetFileName) servicesRegistry.resolveService(new ServiceKey("", fpf0.a(GetAssetFileName.class))));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final yvj initialize$lambda$220$lambda$12(UnityAdsModule unityAdsModule, ServicesRegistry servicesRegistry) {
        return unityAdsModule.offerwallSignalsCoroutineScope((ISDKDispatchers) servicesRegistry.resolveService(new ServiceKey("", fpf0.a(ISDKDispatchers.class))), (pvj) servicesRegistry.resolveService(new ServiceKey("sdk", fpf0.a(pvj.class))), (eyx) servicesRegistry.resolveService(new ServiceKey(NAMED_PUBLIC_JOB, fpf0.a(eyx.class))));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final GetWebViewBridgeUseCase initialize$lambda$220$lambda$120(ServicesRegistry servicesRegistry) {
        return new CommonGetWebViewBridgeUseCase((ovj) servicesRegistry.resolveService(new ServiceKey(DEFAULT_DISPATCHER, fpf0.a(ovj.class))), (SendDiagnosticEvent) servicesRegistry.resolveService(new ServiceKey("", fpf0.a(SendDiagnosticEvent.class))), (Logger) servicesRegistry.resolveService(new ServiceKey("", fpf0.a(Logger.class))));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final GetRequestPolicy initialize$lambda$220$lambda$121(ServicesRegistry servicesRegistry) {
        return new GetInitRequestPolicy((SessionRepository) servicesRegistry.resolveService(new ServiceKey("", fpf0.a(SessionRepository.class))));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final GetLatestWebViewConfiguration initialize$lambda$220$lambda$122(ServicesRegistry servicesRegistry) {
        return new GetLatestWebViewConfiguration((WebviewConfigurationDataSource) servicesRegistry.resolveService(new ServiceKey("", fpf0.a(WebviewConfigurationDataSource.class))));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final GetRequestPolicy initialize$lambda$220$lambda$123(ServicesRegistry servicesRegistry) {
        return new GetOperativeEventRequestPolicy((SessionRepository) servicesRegistry.resolveService(new ServiceKey("", fpf0.a(SessionRepository.class))));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final GetRequestPolicy initialize$lambda$220$lambda$124(ServicesRegistry servicesRegistry) {
        return new GetOtherRequestPolicy((SessionRepository) servicesRegistry.resolveService(new ServiceKey("", fpf0.a(SessionRepository.class))));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final GetPrivacyUpdateRequest initialize$lambda$220$lambda$125(ServicesRegistry servicesRegistry) {
        return new GetPrivacyUpdateRequest((GetUniversalRequestForPayLoad) servicesRegistry.resolveService(new ServiceKey("", fpf0.a(GetUniversalRequestForPayLoad.class))));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final HandleGatewayInitializationResponse initialize$lambda$220$lambda$126(ServicesRegistry servicesRegistry) {
        return new AndroidHandleGatewayInitializationResponse((TransactionEventManager) servicesRegistry.resolveService(new ServiceKey("", fpf0.a(TransactionEventManager.class))), (AdRevenueObserver) servicesRegistry.resolveService(new ServiceKey("", fpf0.a(AdRevenueObserver.class))), (MaxAdRevenueObserver) servicesRegistry.resolveService(new ServiceKey("", fpf0.a(MaxAdRevenueObserver.class))), (LifecycleEventObserver) servicesRegistry.resolveService(new ServiceKey("", fpf0.a(LifecycleEventObserver.class))), (TriggerInitializationCompletedRequest) servicesRegistry.resolveService(new ServiceKey("", fpf0.a(TriggerInitializationCompletedRequest.class))), (SessionRepository) servicesRegistry.resolveService(new ServiceKey("", fpf0.a(SessionRepository.class))), (yvj) servicesRegistry.resolveService(new ServiceKey(NAMED_INIT_SCOPE, fpf0.a(yvj.class))), (HandleDebugSettings) servicesRegistry.resolveService(new ServiceKey("", fpf0.a(HandleDebugSettings.class))), (GetSafeguardedInitializationPolicy) servicesRegistry.resolveService(new ServiceKey("", fpf0.a(GetSafeguardedInitializationPolicy.class))), (NativeConfigurationOuterClass.NativeConfiguration) servicesRegistry.resolveService(new ServiceKey("", fpf0.a(NativeConfigurationOuterClass.NativeConfiguration.class))), (InitializeAdQuality) servicesRegistry.resolveService(new ServiceKey("", fpf0.a(InitializeAdQuality.class))));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final UpdateAdQualitySessionToken initialize$lambda$220$lambda$127(ServicesRegistry servicesRegistry) {
        return new AndroidUpdateAdQualitySessionToken((Logger) servicesRegistry.resolveService(new ServiceKey("", fpf0.a(Logger.class))), (AdQualityVersionDataSource) servicesRegistry.resolveService(new ServiceKey("", fpf0.a(AdQualityVersionDataSource.class))));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final HandleGatewayUniversalResponse initialize$lambda$220$lambda$128(ServicesRegistry servicesRegistry) {
        return new AndroidHandleGatewayUniversalResponse((SessionRepository) servicesRegistry.resolveService(new ServiceKey("", fpf0.a(SessionRepository.class))), (DeviceInfoRepository) servicesRegistry.resolveService(new ServiceKey("", fpf0.a(DeviceInfoRepository.class))), (AndroidAppSetIdDataSource) servicesRegistry.resolveService(new ServiceKey("", fpf0.a(AndroidAppSetIdDataSource.class))), (UpdateAdQualitySessionToken) servicesRegistry.resolveService(new ServiceKey("", fpf0.a(UpdateAdQualitySessionToken.class))));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final InitializeBoldSDK initialize$lambda$220$lambda$129(ServicesRegistry servicesRegistry) {
        return new AndroidInitializeBoldSDK((ovj) servicesRegistry.resolveService(new ServiceKey(DEFAULT_DISPATCHER, fpf0.a(ovj.class))), (InitializeOMSDK) servicesRegistry.resolveService(new ServiceKey("", fpf0.a(InitializeOMSDK.class))), (GetInitializationRequest) servicesRegistry.resolveService(new ServiceKey("", fpf0.a(GetInitializationRequest.class))), (GetRequestPolicy) servicesRegistry.resolveService(new ServiceKey(NAMED_INIT_REQ, fpf0.a(GetRequestPolicy.class))), (CleanAssets) servicesRegistry.resolveService(new ServiceKey("", fpf0.a(CleanAssets.class))), (HandleGatewayInitializationResponse) servicesRegistry.resolveService(new ServiceKey("", fpf0.a(HandleGatewayInitializationResponse.class))), (GatewayClient) servicesRegistry.resolveService(new ServiceKey("", fpf0.a(GatewayClient.class))), (SessionRepository) servicesRegistry.resolveService(new ServiceKey("", fpf0.a(SessionRepository.class))), (EventObservers) servicesRegistry.resolveService(new ServiceKey("", fpf0.a(EventObservers.class))), (TriggerInitializeListener) servicesRegistry.resolveService(new ServiceKey("", fpf0.a(TriggerInitializeListener.class))), (SendDiagnosticEvent) servicesRegistry.resolveService(new ServiceKey("", fpf0.a(SendDiagnosticEvent.class))), (DiagnosticEventRepository) servicesRegistry.resolveService(new ServiceKey("", fpf0.a(DiagnosticEventRepository.class))), (StorageManager) servicesRegistry.resolveService(new ServiceKey("", fpf0.a(StorageManager.class))), (SDKPropertiesManager) servicesRegistry.resolveService(new ServiceKey("", fpf0.a(SDKPropertiesManager.class))), (GetGameId) servicesRegistry.resolveService(new ServiceKey("", fpf0.a(GetGameId.class))), (Logger) servicesRegistry.resolveService(new ServiceKey("", fpf0.a(Logger.class))), (AndroidHandleFocusCounters) servicesRegistry.resolveService(new ServiceKey("", fpf0.a(AndroidHandleFocusCounters.class))));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final yvj initialize$lambda$220$lambda$13(UnityAdsModule unityAdsModule, ServicesRegistry servicesRegistry) {
        return unityAdsModule.omidCoroutineScope((ISDKDispatchers) servicesRegistry.resolveService(new ServiceKey("", fpf0.a(ISDKDispatchers.class))), (pvj) servicesRegistry.resolveService(new ServiceKey("sdk", fpf0.a(pvj.class))), (eyx) servicesRegistry.resolveService(new ServiceKey(NAMED_PUBLIC_JOB, fpf0.a(eyx.class))));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final LegacyShowUseCase initialize$lambda$220$lambda$130(ServicesRegistry servicesRegistry) {
        return new LegacyShowUseCase((Show) servicesRegistry.resolveService(new ServiceKey("", fpf0.a(Show.class))), (AdRepository) servicesRegistry.resolveService(new ServiceKey("", fpf0.a(AdRepository.class))), (SendDiagnosticEvent) servicesRegistry.resolveService(new ServiceKey("", fpf0.a(SendDiagnosticEvent.class))), (GetOperativeEventApi) servicesRegistry.resolveService(new ServiceKey("", fpf0.a(GetOperativeEventApi.class))), (GetInitializationState) servicesRegistry.resolveService(new ServiceKey("", fpf0.a(GetInitializationState.class))), (SessionRepository) servicesRegistry.resolveService(new ServiceKey("", fpf0.a(SessionRepository.class))), (SafeCallbackInvoke) servicesRegistry.resolveService(new ServiceKey("", fpf0.a(SafeCallbackInvoke.class))), (Logger) servicesRegistry.resolveService(new ServiceKey("", fpf0.a(Logger.class))));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final SendPrivacyUpdateRequest initialize$lambda$220$lambda$131(ServicesRegistry servicesRegistry) {
        return new SendPrivacyUpdateRequest((GetPrivacyUpdateRequest) servicesRegistry.resolveService(new ServiceKey("", fpf0.a(GetPrivacyUpdateRequest.class))), (GetRequestPolicy) servicesRegistry.resolveService(new ServiceKey(NAMED_OTHER_REQ, fpf0.a(GetRequestPolicy.class))), (GatewayClient) servicesRegistry.resolveService(new ServiceKey("", fpf0.a(GatewayClient.class))));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final TriggerInitializationCompletedRequest initialize$lambda$220$lambda$132(ServicesRegistry servicesRegistry) {
        return new AndroidTriggerInitializationCompletedRequest((GetInitializationCompletedRequest) servicesRegistry.resolveService(new ServiceKey("", fpf0.a(GetInitializationCompletedRequest.class))), (GetRequestPolicy) servicesRegistry.resolveService(new ServiceKey(NAMED_INIT_REQ, fpf0.a(GetRequestPolicy.class))), (GatewayClient) servicesRegistry.resolveService(new ServiceKey("", fpf0.a(GatewayClient.class))), (SendDiagnosticEvent) servicesRegistry.resolveService(new ServiceKey("", fpf0.a(SendDiagnosticEvent.class))));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final TriggerInitializeListener initialize$lambda$220$lambda$133(ServicesRegistry servicesRegistry) {
        return new TriggerInitializeListener((ovj) servicesRegistry.resolveService(new ServiceKey(MAIN_DISPATCHER, fpf0.a(ovj.class))));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final DiagnosticEventObserver initialize$lambda$220$lambda$134(ServicesRegistry servicesRegistry) {
        return new DiagnosticEventObserver((GetUniversalRequestForPayLoad) servicesRegistry.resolveService(new ServiceKey("", fpf0.a(GetUniversalRequestForPayLoad.class))), (GetDiagnosticEventBatchRequest) servicesRegistry.resolveService(new ServiceKey("", fpf0.a(GetDiagnosticEventBatchRequest.class))), (ovj) servicesRegistry.resolveService(new ServiceKey(DEFAULT_DISPATCHER, fpf0.a(ovj.class))), (DiagnosticEventRepository) servicesRegistry.resolveService(new ServiceKey("", fpf0.a(DiagnosticEventRepository.class))), (UniversalRequestDataSource) servicesRegistry.resolveService(new ServiceKey("", fpf0.a(UniversalRequestDataSource.class))), (BackgroundWorker) servicesRegistry.resolveService(new ServiceKey("", fpf0.a(BackgroundWorker.class))), (UniversalRequestEventSender) servicesRegistry.resolveService(new ServiceKey(DIAGNOSTICS_EVENT_SENDER, fpf0.a(UniversalRequestEventSender.class))), (GetRequestPolicy) servicesRegistry.resolveService(new ServiceKey(NAMED_OTHER_REQ, fpf0.a(GetRequestPolicy.class))));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final EventObservers initialize$lambda$220$lambda$135(ServicesRegistry servicesRegistry) {
        return new EventObservers((OperativeEventObserver) servicesRegistry.resolveService(new ServiceKey("", fpf0.a(OperativeEventObserver.class))), (DiagnosticEventObserver) servicesRegistry.resolveService(new ServiceKey("", fpf0.a(DiagnosticEventObserver.class))), (TransactionEventObserver) servicesRegistry.resolveService(new ServiceKey("", fpf0.a(TransactionEventObserver.class))));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final GetTransactionData initialize$lambda$220$lambda$136(ServicesRegistry servicesRegistry) {
        return new AndroidGetTransactionData((GetByteStringId) servicesRegistry.resolveService(new ServiceKey("", fpf0.a(GetByteStringId.class))));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final GetTransactionRequest initialize$lambda$220$lambda$137(ServicesRegistry servicesRegistry) {
        return new CommonGetTransactionRequest((DeviceInfoRepository) servicesRegistry.resolveService(new ServiceKey("", fpf0.a(DeviceInfoRepository.class))));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final GetAdRevenueEventData initialize$lambda$220$lambda$138() {
        return new AndroidGetAdRevenueEventData();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final HandleAdRevenueEvent initialize$lambda$220$lambda$139(ServicesRegistry servicesRegistry) {
        return new HandleAdRevenueEvent((AdRevenueRepository) servicesRegistry.resolveService(new ServiceKey("", fpf0.a(AdRevenueRepository.class))), (DeviceInfoRepository) servicesRegistry.resolveService(new ServiceKey("", fpf0.a(DeviceInfoRepository.class))), (GetAdRevenueEventData) servicesRegistry.resolveService(new ServiceKey("", fpf0.a(GetAdRevenueEventData.class))));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final eyx initialize$lambda$220$lambda$14(UnityAdsModule unityAdsModule, ServicesRegistry servicesRegistry) {
        return unityAdsModule.publicApiJob((DiagnosticEventRepository) servicesRegistry.resolveService(new ServiceKey("", fpf0.a(DiagnosticEventRepository.class))));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final GetDiagnosticEventBatchRequest initialize$lambda$220$lambda$140() {
        return new GetDiagnosticEventBatchRequest();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final GetDiagnosticEventRequest initialize$lambda$220$lambda$141(ServicesRegistry servicesRegistry) {
        return new GetDiagnosticEventRequest((GetSharedDataTimestamps) servicesRegistry.resolveService(new ServiceKey("", fpf0.a(GetSharedDataTimestamps.class))));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final GetOperativeEventApi initialize$lambda$220$lambda$142(ServicesRegistry servicesRegistry) {
        return new GetOperativeEventApi((OperativeEventRepository) servicesRegistry.resolveService(new ServiceKey("", fpf0.a(OperativeEventRepository.class))), (GetOperativeEventRequest) servicesRegistry.resolveService(new ServiceKey("", fpf0.a(GetOperativeEventRequest.class))));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final GetOperativeEventRequest initialize$lambda$220$lambda$143(ServicesRegistry servicesRegistry) {
        return new GetOperativeEventRequest((GetByteStringId) servicesRegistry.resolveService(new ServiceKey("", fpf0.a(GetByteStringId.class))), (DeviceInfoRepository) servicesRegistry.resolveService(new ServiceKey("", fpf0.a(DeviceInfoRepository.class))), (SessionRepository) servicesRegistry.resolveService(new ServiceKey("", fpf0.a(SessionRepository.class))), (CampaignRepository) servicesRegistry.resolveService(new ServiceKey("", fpf0.a(CampaignRepository.class))));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final HandleGatewayEventResponse initialize$lambda$220$lambda$144() {
        return new AndroidHandleGatewayEventResponse();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final OperativeEventObserver initialize$lambda$220$lambda$145(ServicesRegistry servicesRegistry) {
        return new OperativeEventObserver((GetUniversalRequestForPayLoad) servicesRegistry.resolveService(new ServiceKey("", fpf0.a(GetUniversalRequestForPayLoad.class))), (ovj) servicesRegistry.resolveService(new ServiceKey(DEFAULT_DISPATCHER, fpf0.a(ovj.class))), (OperativeEventRepository) servicesRegistry.resolveService(new ServiceKey("", fpf0.a(OperativeEventRepository.class))), (UniversalRequestDataSource) servicesRegistry.resolveService(new ServiceKey("", fpf0.a(UniversalRequestDataSource.class))), (BackgroundWorker) servicesRegistry.resolveService(new ServiceKey("", fpf0.a(BackgroundWorker.class))), (UniversalRequestEventSender) servicesRegistry.resolveService(new ServiceKey(OPERATIVE_EVENT_SENDER, fpf0.a(UniversalRequestEventSender.class))), (GetRequestPolicy) servicesRegistry.resolveService(new ServiceKey(NAMED_OPERATIVE_REQ, fpf0.a(GetRequestPolicy.class))), (SendDiagnosticEvent) servicesRegistry.resolveService(new ServiceKey("", fpf0.a(SendDiagnosticEvent.class))));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final TransactionEventObserver initialize$lambda$220$lambda$146(ServicesRegistry servicesRegistry) {
        return new TransactionEventObserver((GetUniversalRequestForPayLoad) servicesRegistry.resolveService(new ServiceKey("", fpf0.a(GetUniversalRequestForPayLoad.class))), (yvj) servicesRegistry.resolveService(new ServiceKey(NAMED_TRANSACTION_SCOPE, fpf0.a(yvj.class))), (TransactionEventRepository) servicesRegistry.resolveService(new ServiceKey("", fpf0.a(TransactionEventRepository.class))), (GatewayClient) servicesRegistry.resolveService(new ServiceKey("", fpf0.a(GatewayClient.class))), (GetRequestPolicy) servicesRegistry.resolveService(new ServiceKey(NAMED_OTHER_REQ, fpf0.a(GetRequestPolicy.class))), (ByteStringDataSource) servicesRegistry.resolveService(new ServiceKey(DATA_STORE_IAP_TRANSACTION, fpf0.a(ByteStringDataSource.class))), (SendDiagnosticEvent) servicesRegistry.resolveService(new ServiceKey("", fpf0.a(SendDiagnosticEvent.class))));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final AdRevenueObserver initialize$lambda$220$lambda$147(ServicesRegistry servicesRegistry) {
        return new AdRevenueObserver((GetUniversalRequestForPayLoad) servicesRegistry.resolveService(new ServiceKey("", fpf0.a(GetUniversalRequestForPayLoad.class))), (yvj) servicesRegistry.resolveService(new ServiceKey(NAMED_ILRD_SCOPE, fpf0.a(yvj.class))), (AdRevenueRepository) servicesRegistry.resolveService(new ServiceKey("", fpf0.a(AdRevenueRepository.class))), (GatewayClient) servicesRegistry.resolveService(new ServiceKey("", fpf0.a(GatewayClient.class))), (GetRequestPolicy) servicesRegistry.resolveService(new ServiceKey(NAMED_OTHER_REQ, fpf0.a(GetRequestPolicy.class))), (Logger) servicesRegistry.resolveService(new ServiceKey("", fpf0.a(Logger.class))));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final LifecycleEventObserver initialize$lambda$220$lambda$148(ServicesRegistry servicesRegistry) {
        return new LifecycleEventObserver((GetUniversalRequestForPayLoad) servicesRegistry.resolveService(new ServiceKey("", fpf0.a(GetUniversalRequestForPayLoad.class))), (yvj) servicesRegistry.resolveService(new ServiceKey(NAMED_LIFECYCLE_SCOPE, fpf0.a(yvj.class))), (LifecycleDataSource) servicesRegistry.resolveService(new ServiceKey("", fpf0.a(LifecycleDataSource.class))), (DeviceInfoRepository) servicesRegistry.resolveService(new ServiceKey("", fpf0.a(DeviceInfoRepository.class))), (GatewayClient) servicesRegistry.resolveService(new ServiceKey("", fpf0.a(GatewayClient.class))), (GetRequestPolicy) servicesRegistry.resolveService(new ServiceKey(NAMED_OTHER_REQ, fpf0.a(GetRequestPolicy.class))), (GetByteStringId) servicesRegistry.resolveService(new ServiceKey("", fpf0.a(GetByteStringId.class))), (Logger) servicesRegistry.resolveService(new ServiceKey("", fpf0.a(Logger.class))));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final AppLovinCommunicatorBridge initialize$lambda$220$lambda$149(ServicesRegistry servicesRegistry) {
        return new AppLovinCommunicatorBridge((Context) servicesRegistry.resolveService(new ServiceKey("", fpf0.a(Context.class))));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ByteStringDataSource initialize$lambda$220$lambda$15(ServicesRegistry servicesRegistry) {
        return new AndroidLegacyConfigStoreDataSource((StorageManager) servicesRegistry.resolveService(new ServiceKey("", fpf0.a(StorageManager.class))));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final MaxAdRevenueCommunicatorProxyFactory initialize$lambda$220$lambda$150(ServicesRegistry servicesRegistry) {
        return new MaxAdRevenueCommunicatorProxyFactory((Logger) servicesRegistry.resolveService(new ServiceKey("", fpf0.a(Logger.class))));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final MaxAdRevenueListener initialize$lambda$220$lambda$151(ServicesRegistry servicesRegistry) {
        return new MaxAdRevenueListener((HandleAdRevenueEvent) servicesRegistry.resolveService(new ServiceKey("", fpf0.a(HandleAdRevenueEvent.class))), (yvj) servicesRegistry.resolveService(new ServiceKey(NAMED_ILRD_SCOPE, fpf0.a(yvj.class))), (Logger) servicesRegistry.resolveService(new ServiceKey("", fpf0.a(Logger.class))));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final MaxAdRevenueObserver initialize$lambda$220$lambda$152(ServicesRegistry servicesRegistry) {
        return new MaxAdRevenueObserver((SessionRepository) servicesRegistry.resolveService(new ServiceKey("", fpf0.a(SessionRepository.class))), (Logger) servicesRegistry.resolveService(new ServiceKey("", fpf0.a(Logger.class))), (AppLovinCommunicatorBridge) servicesRegistry.resolveService(new ServiceKey("", fpf0.a(AppLovinCommunicatorBridge.class))), (MaxAdRevenueListener) servicesRegistry.resolveService(new ServiceKey("", fpf0.a(MaxAdRevenueListener.class))), (MaxAdRevenueCommunicatorProxyFactory) servicesRegistry.resolveService(new ServiceKey("", fpf0.a(MaxAdRevenueCommunicatorProxyFactory.class))));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final UniversalRequestTtlValidator initialize$lambda$220$lambda$153() {
        return new CommonUniversalRequestTtlValidator();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final UniversalRequestEventSender initialize$lambda$220$lambda$154(ServicesRegistry servicesRegistry) {
        return new UniversalRequestEventSender((GatewayClient) servicesRegistry.resolveService(new ServiceKey("", fpf0.a(GatewayClient.class))), (HandleGatewayEventResponse) servicesRegistry.resolveService(new ServiceKey("", fpf0.a(HandleGatewayEventResponse.class))), (UniversalRequestTtlValidator) servicesRegistry.resolveService(new ServiceKey("", fpf0.a(UniversalRequestTtlValidator.class))), null, 8, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final UniversalRequestEventSender initialize$lambda$220$lambda$155(ServicesRegistry servicesRegistry) {
        return new UniversalRequestEventSender((GatewayClient) servicesRegistry.resolveService(new ServiceKey("", fpf0.a(GatewayClient.class))), (HandleGatewayEventResponse) servicesRegistry.resolveService(new ServiceKey("", fpf0.a(HandleGatewayEventResponse.class))), (UniversalRequestTtlValidator) servicesRegistry.resolveService(new ServiceKey("", fpf0.a(UniversalRequestTtlValidator.class))), OperationType.DIAGNOSTIC_EVENT);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final UniversalRequestEventSender initialize$lambda$220$lambda$156(ServicesRegistry servicesRegistry) {
        return new UniversalRequestEventSender((GatewayClient) servicesRegistry.resolveService(new ServiceKey("", fpf0.a(GatewayClient.class))), (HandleGatewayEventResponse) servicesRegistry.resolveService(new ServiceKey("", fpf0.a(HandleGatewayEventResponse.class))), (UniversalRequestTtlValidator) servicesRegistry.resolveService(new ServiceKey("", fpf0.a(UniversalRequestTtlValidator.class))), OperationType.OPERATIVE_EVENT);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final OmFinishSession initialize$lambda$220$lambda$157(ServicesRegistry servicesRegistry) {
        return new AndroidOmFinishSession((OpenMeasurementRepository) servicesRegistry.resolveService(new ServiceKey("", fpf0.a(OpenMeasurementRepository.class))), (SendDiagnosticEvent) servicesRegistry.resolveService(new ServiceKey("", fpf0.a(SendDiagnosticEvent.class))));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final OmImpressionOccurred initialize$lambda$220$lambda$158(ServicesRegistry servicesRegistry) {
        return new AndroidOmImpressionOccurred((OpenMeasurementRepository) servicesRegistry.resolveService(new ServiceKey("", fpf0.a(OpenMeasurementRepository.class))), (SendDiagnosticEvent) servicesRegistry.resolveService(new ServiceKey("", fpf0.a(SendDiagnosticEvent.class))));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final AndroidOmInteraction initialize$lambda$220$lambda$159(ServicesRegistry servicesRegistry) {
        return new AndroidOmStartSession((OpenMeasurementRepository) servicesRegistry.resolveService(new ServiceKey("", fpf0.a(OpenMeasurementRepository.class))), (SendDiagnosticEvent) servicesRegistry.resolveService(new ServiceKey("", fpf0.a(SendDiagnosticEvent.class))));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final fvk initialize$lambda$220$lambda$16(UnityAdsModule unityAdsModule, ServicesRegistry servicesRegistry) {
        return unityAdsModule.privacyDataStore((Context) servicesRegistry.resolveService(new ServiceKey("", fpf0.a(Context.class))), (ovj) servicesRegistry.resolveService(new ServiceKey(IO_DISPATCHER, fpf0.a(ovj.class))));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final GetOmData initialize$lambda$220$lambda$160(ServicesRegistry servicesRegistry) {
        return new CommonGetOmData((OpenMeasurementRepository) servicesRegistry.resolveService(new ServiceKey("", fpf0.a(OpenMeasurementRepository.class))));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final IsOMActivated initialize$lambda$220$lambda$161(ServicesRegistry servicesRegistry) {
        return new CommonIsOMActivated((OpenMeasurementRepository) servicesRegistry.resolveService(new ServiceKey("", fpf0.a(OpenMeasurementRepository.class))));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final InitializeOMSDK initialize$lambda$220$lambda$162(ServicesRegistry servicesRegistry) {
        return new AndroidInitializeOMSDK((Context) servicesRegistry.resolveService(new ServiceKey("", fpf0.a(Context.class))), (SendDiagnosticEvent) servicesRegistry.resolveService(new ServiceKey("", fpf0.a(SendDiagnosticEvent.class))), (SessionRepository) servicesRegistry.resolveService(new ServiceKey("", fpf0.a(SessionRepository.class))), (OpenMeasurementRepository) servicesRegistry.resolveService(new ServiceKey("", fpf0.a(OpenMeasurementRepository.class))));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final InitializeAdQuality initialize$lambda$220$lambda$163(ServicesRegistry servicesRegistry) {
        return new AndroidInitializeAdQuality((Context) servicesRegistry.resolveService(new ServiceKey("", fpf0.a(Context.class))), (SendDiagnosticEvent) servicesRegistry.resolveService(new ServiceKey("", fpf0.a(SendDiagnosticEvent.class))), (Logger) servicesRegistry.resolveService(new ServiceKey("", fpf0.a(Logger.class))), (GetGameId) servicesRegistry.resolveService(new ServiceKey("", fpf0.a(GetGameId.class))));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final CoherenceLibraryManager initialize$lambda$220$lambda$164(ServicesRegistry servicesRegistry) {
        return new AndroidCoherenceLibraryManager((Context) servicesRegistry.resolveService(new ServiceKey("", fpf0.a(Context.class))), (Logger) servicesRegistry.resolveService(new ServiceKey("", fpf0.a(Logger.class))));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final FlattenerRulesUseCase initialize$lambda$220$lambda$165() {
        return new DeveloperConsentFlattenerRulesUseCase();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final FlattenerRulesUseCase initialize$lambda$220$lambda$166() {
        return new LegacyUserConsentFlattenerRulesUseCase();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final BackgroundWorker initialize$lambda$220$lambda$167(ServicesRegistry servicesRegistry) {
        return new BackgroundWorker((Context) servicesRegistry.resolveService(new ServiceKey("", fpf0.a(Context.class))));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final DiagnosticEventRequestWorkModifier initialize$lambda$220$lambda$168(ServicesRegistry servicesRegistry) {
        return new DiagnosticEventRequestWorkModifier((SessionRepository) servicesRegistry.resolveService(new ServiceKey("", fpf0.a(SessionRepository.class))));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final GatewayClient initialize$lambda$220$lambda$169(ServicesRegistry servicesRegistry) {
        return new CommonGatewayClient((HttpClientProvider) servicesRegistry.resolveService(new ServiceKey("", fpf0.a(HttpClientProvider.class))), (HandleGatewayUniversalResponse) servicesRegistry.resolveService(new ServiceKey("", fpf0.a(HandleGatewayUniversalResponse.class))), (SendDiagnosticEvent) servicesRegistry.resolveService(new ServiceKey("", fpf0.a(SendDiagnosticEvent.class))), (SessionRepository) servicesRegistry.resolveService(new ServiceKey("", fpf0.a(SessionRepository.class))), (RequestUrlFactory) servicesRegistry.resolveService(new ServiceKey("", fpf0.a(RequestUrlFactory.class))), (Logger) servicesRegistry.resolveService(new ServiceKey("", fpf0.a(Logger.class))));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ByteStringDataSource initialize$lambda$220$lambda$17(UnityAdsModule unityAdsModule, ServicesRegistry servicesRegistry) {
        return unityAdsModule.privacyDataStore((fvk) servicesRegistry.resolveService(new ServiceKey(DATA_STORE_PRIVACY, fpf0.a(fvk.class))));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final pvj initialize$lambda$220$lambda$170(ServicesRegistry servicesRegistry) {
        return new SDKErrorHandler((ovj) servicesRegistry.resolveService(new ServiceKey(DEFAULT_DISPATCHER, fpf0.a(ovj.class))), (SendDiagnosticEvent) servicesRegistry.resolveService(new ServiceKey("", fpf0.a(SendDiagnosticEvent.class))));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final VolumeChange initialize$lambda$220$lambda$171() {
        return new VolumeChangeContentObserver();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final StoreMonitor initialize$lambda$220$lambda$172(ServicesRegistry servicesRegistry) {
        return new StoreMonitor((StoreExceptionHandler) servicesRegistry.resolveService(new ServiceKey("", fpf0.a(StoreExceptionHandler.class))));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final StoreExceptionHandler initialize$lambda$220$lambda$173() {
        return new GatewayStoreExceptionHandler();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final AndroidAttribution initialize$lambda$220$lambda$174(ServicesRegistry servicesRegistry) {
        return new AndroidAttribution((Context) servicesRegistry.resolveService(new ServiceKey("", fpf0.a(Context.class))), (ISDKDispatchers) servicesRegistry.resolveService(new ServiceKey("", fpf0.a(ISDKDispatchers.class))), (SessionRepository) servicesRegistry.resolveService(new ServiceKey("", fpf0.a(SessionRepository.class))));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final AdPlayerScope initialize$lambda$220$lambda$175(ServicesRegistry servicesRegistry) {
        return new AdPlayerScope((ovj) servicesRegistry.resolveService(new ServiceKey(DEFAULT_DISPATCHER, fpf0.a(ovj.class))), (pvj) servicesRegistry.resolveService(new ServiceKey("sdk", fpf0.a(pvj.class))));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final AndroidWebViewClient initialize$lambda$220$lambda$176(ServicesRegistry servicesRegistry) {
        return new AndroidWebViewClient((GetCachedAsset) servicesRegistry.resolveService(new ServiceKey("", fpf0.a(GetCachedAsset.class))), (SendDiagnosticEvent) servicesRegistry.resolveService(new ServiceKey("", fpf0.a(SendDiagnosticEvent.class))));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final AndroidGetWebViewContainerUseCase initialize$lambda$220$lambda$177(ServicesRegistry servicesRegistry) {
        return new AndroidGetWebViewContainerUseCase((Context) servicesRegistry.resolveService(new ServiceKey("", fpf0.a(Context.class))), (AndroidWebViewClient) servicesRegistry.resolveService(new ServiceKey("", fpf0.a(AndroidWebViewClient.class))), (SendWebViewClientErrorDiagnostics) servicesRegistry.resolveService(new ServiceKey("", fpf0.a(SendWebViewClientErrorDiagnostics.class))), (ovj) servicesRegistry.resolveService(new ServiceKey(MAIN_DISPATCHER, fpf0.a(ovj.class))), (ovj) servicesRegistry.resolveService(new ServiceKey(DEFAULT_DISPATCHER, fpf0.a(ovj.class))), (SendDiagnosticEvent) servicesRegistry.resolveService(new ServiceKey("", fpf0.a(SendDiagnosticEvent.class))));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Load initialize$lambda$220$lambda$178(ServicesRegistry servicesRegistry) {
        return new AndroidLoad((ovj) servicesRegistry.resolveService(new ServiceKey(DEFAULT_DISPATCHER, fpf0.a(ovj.class))), (GetAdRequest) servicesRegistry.resolveService(new ServiceKey("", fpf0.a(GetAdRequest.class))), (GetAdPlayerConfigRequest) servicesRegistry.resolveService(new ServiceKey("", fpf0.a(GetAdPlayerConfigRequest.class))), (GetRequestPolicy) servicesRegistry.resolveService(new ServiceKey(NAMED_AD_REQ, fpf0.a(GetRequestPolicy.class))), (HandleGatewayAdResponse) servicesRegistry.resolveService(new ServiceKey("", fpf0.a(HandleGatewayAdResponse.class))), (SessionRepository) servicesRegistry.resolveService(new ServiceKey("", fpf0.a(SessionRepository.class))), (GatewayClient) servicesRegistry.resolveService(new ServiceKey("", fpf0.a(GatewayClient.class))), (AdRepository) servicesRegistry.resolveService(new ServiceKey("", fpf0.a(AdRepository.class))), (SendDiagnosticEvent) servicesRegistry.resolveService(new ServiceKey("", fpf0.a(SendDiagnosticEvent.class))), (ValidateExtrasSize) servicesRegistry.resolveService(new ServiceKey("", fpf0.a(ValidateExtrasSize.class))));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final AwaitInitialization initialize$lambda$220$lambda$179(ServicesRegistry servicesRegistry) {
        return new CommonAwaitInitialization((SessionRepository) servicesRegistry.resolveService(new ServiceKey("", fpf0.a(SessionRepository.class))));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final fvk initialize$lambda$220$lambda$18(UnityAdsModule unityAdsModule, ServicesRegistry servicesRegistry) {
        return unityAdsModule.privacyFsmDataStore((Context) servicesRegistry.resolveService(new ServiceKey("", fpf0.a(Context.class))), (ovj) servicesRegistry.resolveService(new ServiceKey(IO_DISPATCHER, fpf0.a(ovj.class))));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final GetAsyncHeaderBiddingToken initialize$lambda$220$lambda$180(ServicesRegistry servicesRegistry) {
        return new CommonInitAwaitingGetHeaderBiddingToken((GetHeaderBiddingToken) servicesRegistry.resolveService(new ServiceKey("", fpf0.a(GetHeaderBiddingToken.class))), (SendDiagnosticEvent) servicesRegistry.resolveService(new ServiceKey("", fpf0.a(SendDiagnosticEvent.class))), (GetInitializationState) servicesRegistry.resolveService(new ServiceKey("", fpf0.a(GetInitializationState.class))), (AwaitInitialization) servicesRegistry.resolveService(new ServiceKey("", fpf0.a(AwaitInitialization.class))), (SessionRepository) servicesRegistry.resolveService(new ServiceKey("", fpf0.a(SessionRepository.class))), (SafeCallbackInvoke) servicesRegistry.resolveService(new ServiceKey("", fpf0.a(SafeCallbackInvoke.class))), (Logger) servicesRegistry.resolveService(new ServiceKey("", fpf0.a(Logger.class))));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final GetAdPlayer initialize$lambda$220$lambda$181(ServicesRegistry servicesRegistry) {
        return new CommonGetAdPlayer((DeviceInfoRepository) servicesRegistry.resolveService(new ServiceKey("", fpf0.a(DeviceInfoRepository.class))), (SessionRepository) servicesRegistry.resolveService(new ServiceKey("", fpf0.a(SessionRepository.class))), (SendDiagnosticEvent) servicesRegistry.resolveService(new ServiceKey("", fpf0.a(SendDiagnosticEvent.class))), (ovj) servicesRegistry.resolveService(new ServiceKey(DEFAULT_DISPATCHER, fpf0.a(ovj.class))), (OpenMeasurementRepository) servicesRegistry.resolveService(new ServiceKey("", fpf0.a(OpenMeasurementRepository.class))), (OfferwallManager) servicesRegistry.resolveService(new ServiceKey("", fpf0.a(OfferwallManager.class))), (AdRepository) servicesRegistry.resolveService(new ServiceKey("", fpf0.a(AdRepository.class))), (LifecycleDataSource) servicesRegistry.resolveService(new ServiceKey("", fpf0.a(LifecycleDataSource.class))), (OrientationRepository) servicesRegistry.resolveService(new ServiceKey("", fpf0.a(OrientationRepository.class))), (Context) servicesRegistry.resolveService(new ServiceKey("", fpf0.a(Context.class))));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final CacheWebViewAssets initialize$lambda$220$lambda$182(ServicesRegistry servicesRegistry) {
        return new AndroidCacheWebViewAssets((CacheRepository) servicesRegistry.resolveService(new ServiceKey("", fpf0.a(CacheRepository.class))), (SessionRepository) servicesRegistry.resolveService(new ServiceKey("", fpf0.a(SessionRepository.class))));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final HandleGatewayAdResponse initialize$lambda$220$lambda$183(ServicesRegistry servicesRegistry) {
        return new AndroidHandleGatewayAdResponse((AdRepository) servicesRegistry.resolveService(new ServiceKey("", fpf0.a(AdRepository.class))), (AndroidGetWebViewContainerUseCase) servicesRegistry.resolveService(new ServiceKey("", fpf0.a(AndroidGetWebViewContainerUseCase.class))), (GetWebViewBridgeUseCase) servicesRegistry.resolveService(new ServiceKey("", fpf0.a(GetWebViewBridgeUseCase.class))), (DeviceInfoRepository) servicesRegistry.resolveService(new ServiceKey("", fpf0.a(DeviceInfoRepository.class))), (HandleInvocationsFromAdViewer) servicesRegistry.resolveService(new ServiceKey("", fpf0.a(HandleInvocationsFromAdViewer.class))), (CampaignRepository) servicesRegistry.resolveService(new ServiceKey("", fpf0.a(CampaignRepository.class))), (SendDiagnosticEvent) servicesRegistry.resolveService(new ServiceKey("", fpf0.a(SendDiagnosticEvent.class))), (GetOperativeEventApi) servicesRegistry.resolveService(new ServiceKey("", fpf0.a(GetOperativeEventApi.class))), (GetLatestWebViewConfiguration) servicesRegistry.resolveService(new ServiceKey("", fpf0.a(GetLatestWebViewConfiguration.class))), (AdPlayerScope) servicesRegistry.resolveService(new ServiceKey("", fpf0.a(AdPlayerScope.class))), (GetAdPlayer) servicesRegistry.resolveService(new ServiceKey("", fpf0.a(GetAdPlayer.class))), (CacheWebViewAssets) servicesRegistry.resolveService(new ServiceKey("", fpf0.a(CacheWebViewAssets.class))), (WebViewLessLoadStrategy) servicesRegistry.resolveService(new ServiceKey("", fpf0.a(WebViewLessLoadStrategy.class))), (SessionRepository) servicesRegistry.resolveService(new ServiceKey("", fpf0.a(SessionRepository.class))));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final HandleInvocationsFromAdViewer initialize$lambda$220$lambda$184() {
        return new HandleInvocationsFromAdViewer();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final LegacyLoadUseCase initialize$lambda$220$lambda$185(ServicesRegistry servicesRegistry) {
        return new LegacyLoadUseCase((Load) servicesRegistry.resolveService(new ServiceKey("", fpf0.a(Load.class))), (SendDiagnosticEvent) servicesRegistry.resolveService(new ServiceKey("", fpf0.a(SendDiagnosticEvent.class))), (GetInitializationState) servicesRegistry.resolveService(new ServiceKey("", fpf0.a(GetInitializationState.class))), (AwaitInitialization) servicesRegistry.resolveService(new ServiceKey("", fpf0.a(AwaitInitialization.class))), (SessionRepository) servicesRegistry.resolveService(new ServiceKey("", fpf0.a(SessionRepository.class))), (AdRepository) servicesRegistry.resolveService(new ServiceKey("", fpf0.a(AdRepository.class))), (SafeCallbackInvoke) servicesRegistry.resolveService(new ServiceKey("", fpf0.a(SafeCallbackInvoke.class))), (CleanUpWhenOpportunityExpires) servicesRegistry.resolveService(new ServiceKey("", fpf0.a(CleanUpWhenOpportunityExpires.class))), (Logger) servicesRegistry.resolveService(new ServiceKey("", fpf0.a(Logger.class))));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final WebViewLessLoadStrategy initialize$lambda$220$lambda$186(ServicesRegistry servicesRegistry) {
        return new AndroidWebViewLessLoadStrategy((AdRepository) servicesRegistry.resolveService(new ServiceKey("", fpf0.a(AdRepository.class))), (CampaignRepository) servicesRegistry.resolveService(new ServiceKey("", fpf0.a(CampaignRepository.class))), (CacheAssets) servicesRegistry.resolveService(new ServiceKey("", fpf0.a(CacheAssets.class))), (AdRefresh) servicesRegistry.resolveService(new ServiceKey("", fpf0.a(AdRefresh.class))), (SessionRepository) servicesRegistry.resolveService(new ServiceKey("", fpf0.a(SessionRepository.class))));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final SafeCallbackInvoke initialize$lambda$220$lambda$187(ServicesRegistry servicesRegistry) {
        return new CommonSafeCallbackInvoke((ovj) servicesRegistry.resolveService(new ServiceKey(MAIN_DISPATCHER, fpf0.a(ovj.class))));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final CoroutineTimer initialize$lambda$220$lambda$188(ServicesRegistry servicesRegistry) {
        return new CommonCoroutineTimer((ovj) servicesRegistry.resolveService(new ServiceKey(DEFAULT_DISPATCHER, fpf0.a(ovj.class))));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final SetGameId initialize$lambda$220$lambda$189(ServicesRegistry servicesRegistry) {
        return new CommonSetGameId((SessionRepository) servicesRegistry.resolveService(new ServiceKey("", fpf0.a(SessionRepository.class))));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ByteStringDataSource initialize$lambda$220$lambda$19(UnityAdsModule unityAdsModule, ServicesRegistry servicesRegistry) {
        return unityAdsModule.privacyFsmDataStore((fvk) servicesRegistry.resolveService(new ServiceKey(DATA_STORE_PRIVACY_FSM, fpf0.a(fvk.class))));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final GetGameId initialize$lambda$220$lambda$190(ServicesRegistry servicesRegistry) {
        return new CommonGetGameId((SessionRepository) servicesRegistry.resolveService(new ServiceKey("", fpf0.a(SessionRepository.class))));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ValidateGameId initialize$lambda$220$lambda$191(ServicesRegistry servicesRegistry) {
        return new CommonValidateGameId((GetGameId) servicesRegistry.resolveService(new ServiceKey("", fpf0.a(GetGameId.class))), (SetGameId) servicesRegistry.resolveService(new ServiceKey("", fpf0.a(SetGameId.class))));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ValidateExtrasSize initialize$lambda$220$lambda$192(ServicesRegistry servicesRegistry) {
        return new ValidateExtrasSize((SessionRepository) servicesRegistry.resolveService(new ServiceKey("", fpf0.a(SessionRepository.class))), (SendDiagnosticEvent) servicesRegistry.resolveService(new ServiceKey("", fpf0.a(SendDiagnosticEvent.class))));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ShouldAllowInitialization initialize$lambda$220$lambda$193(ServicesRegistry servicesRegistry) {
        return new CommonShouldAllowInitialization((CheckForGameIdAndTestModeChanges) servicesRegistry.resolveService(new ServiceKey("", fpf0.a(CheckForGameIdAndTestModeChanges.class))), (GetInitializationState) servicesRegistry.resolveService(new ServiceKey("", fpf0.a(GetInitializationState.class))), (SetInitializationState) servicesRegistry.resolveService(new ServiceKey("", fpf0.a(SetInitializationState.class))), (ValidateGameId) servicesRegistry.resolveService(new ServiceKey("", fpf0.a(ValidateGameId.class))));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final CheckForGameIdAndTestModeChanges initialize$lambda$220$lambda$194(ServicesRegistry servicesRegistry) {
        return new CommonCheckForGameIdAndTestModeChanges((GetGameId) servicesRegistry.resolveService(new ServiceKey("", fpf0.a(GetGameId.class))), (SendDiagnosticEvent) servicesRegistry.resolveService(new ServiceKey("", fpf0.a(SendDiagnosticEvent.class))));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final DownloadPriorityQueue initialize$lambda$220$lambda$195(ServicesRegistry servicesRegistry) {
        return new DownloadPriorityQueue((SessionRepository) servicesRegistry.resolveService(new ServiceKey("", fpf0.a(SessionRepository.class))));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final CleanupDirectory initialize$lambda$220$lambda$196(ServicesRegistry servicesRegistry) {
        return new CleanupDirectory((Logger) servicesRegistry.resolveService(new ServiceKey("", fpf0.a(Logger.class))));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final FocusRepository initialize$lambda$220$lambda$197(ServicesRegistry servicesRegistry) {
        return new FocusRepository((AndroidGetLifecycleFlow) servicesRegistry.resolveService(new ServiceKey("", fpf0.a(AndroidGetLifecycleFlow.class))), (ovj) servicesRegistry.resolveService(new ServiceKey(DEFAULT_DISPATCHER, fpf0.a(ovj.class))), (Logger) servicesRegistry.resolveService(new ServiceKey("", fpf0.a(Logger.class))));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final AndroidGetIsAdActivity initialize$lambda$220$lambda$198(ServicesRegistry servicesRegistry) {
        return new AndroidGetIsAdActivity((SessionRepository) servicesRegistry.resolveService(new ServiceKey("", fpf0.a(SessionRepository.class))));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final AndroidGetLifecycleFlow initialize$lambda$220$lambda$199(ServicesRegistry servicesRegistry) {
        return new AndroidGetLifecycleFlow((Context) servicesRegistry.resolveService(new ServiceKey("", fpf0.a(Context.class))));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final fvk initialize$lambda$220$lambda$20(UnityAdsModule unityAdsModule, ServicesRegistry servicesRegistry) {
        return unityAdsModule.nativeConfigurationDataStore((Context) servicesRegistry.resolveService(new ServiceKey("", fpf0.a(Context.class))), (ovj) servicesRegistry.resolveService(new ServiceKey(IO_DISPATCHER, fpf0.a(ovj.class))));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final AndroidHandleFocusCounters initialize$lambda$220$lambda$200(ServicesRegistry servicesRegistry) {
        return new AndroidHandleFocusCounters((SessionRepository) servicesRegistry.resolveService(new ServiceKey("", fpf0.a(SessionRepository.class))), (FocusRepository) servicesRegistry.resolveService(new ServiceKey("", fpf0.a(FocusRepository.class))), (AndroidGetIsAdActivity) servicesRegistry.resolveService(new ServiceKey("", fpf0.a(AndroidGetIsAdActivity.class))), (ovj) servicesRegistry.resolveService(new ServiceKey(DEFAULT_DISPATCHER, fpf0.a(ovj.class))), null, 16, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final OfferwallAdapterBridge initialize$lambda$220$lambda$201(ServicesRegistry servicesRegistry) {
        return new OfferwallAdapterBridge((yvj) servicesRegistry.resolveService(new ServiceKey(NAMED_OFFERWALL_SCOPE, fpf0.a(yvj.class))));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final OfferwallManager initialize$lambda$220$lambda$202(ServicesRegistry servicesRegistry) {
        return new AndroidOfferwallManager((OfferwallAdapterBridge) servicesRegistry.resolveService(new ServiceKey("", fpf0.a(OfferwallAdapterBridge.class))), (Logger) servicesRegistry.resolveService(new ServiceKey("", fpf0.a(Logger.class))));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final LoadOfferwallAd initialize$lambda$220$lambda$203(ServicesRegistry servicesRegistry) {
        return new LoadOfferwallAd((OfferwallManager) servicesRegistry.resolveService(new ServiceKey("", fpf0.a(OfferwallManager.class))));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final GetIsOfferwallAdReady initialize$lambda$220$lambda$204(ServicesRegistry servicesRegistry) {
        return new GetIsOfferwallAdReady((OfferwallManager) servicesRegistry.resolveService(new ServiceKey("", fpf0.a(OfferwallManager.class))));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final FIdDataSource initialize$lambda$220$lambda$205(ServicesRegistry servicesRegistry) {
        return new CachedFIdDataSource((ovj) servicesRegistry.resolveService(new ServiceKey(IO_DISPATCHER, fpf0.a(ovj.class))), new AndroidFIdDataSource((Context) servicesRegistry.resolveService(new ServiceKey("", fpf0.a(Context.class)))));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final FIdExistenceDataSource initialize$lambda$220$lambda$206() {
        return new AndroidFIdExistenceDataSource(Constants.FID_CLASS);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final AdQualityVersionDataSource initialize$lambda$220$lambda$207(ServicesRegistry servicesRegistry) {
        return new AndroidAdQualityVersionDataSource((Logger) servicesRegistry.resolveService(new ServiceKey("", fpf0.a(Logger.class))));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final CleanUpWhenOpportunityExpires initialize$lambda$220$lambda$208(ServicesRegistry servicesRegistry) {
        return new CleanUpWhenOpportunityExpires((ovj) servicesRegistry.resolveService(new ServiceKey(DEFAULT_DISPATCHER, fpf0.a(ovj.class))), (Logger) servicesRegistry.resolveService(new ServiceKey("", fpf0.a(Logger.class))));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final OrientationRepository initialize$lambda$220$lambda$209(ServicesRegistry servicesRegistry) {
        return new OrientationRepository((AndroidGetLifecycleFlow) servicesRegistry.resolveService(new ServiceKey("", fpf0.a(AndroidGetLifecycleFlow.class))), (ovj) servicesRegistry.resolveService(new ServiceKey(DEFAULT_DISPATCHER, fpf0.a(ovj.class))));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ByteStringDataSource initialize$lambda$220$lambda$21(UnityAdsModule unityAdsModule, ServicesRegistry servicesRegistry) {
        return unityAdsModule.nativeConfigurationDataStore((fvk) servicesRegistry.resolveService(new ServiceKey(DATA_STORE_NATIVE_CONFIG, fpf0.a(fvk.class))));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final AndroidAppSetIdDataSource initialize$lambda$220$lambda$210(ServicesRegistry servicesRegistry) {
        return new AndroidAppSetIdDataSource((Context) servicesRegistry.resolveService(new ServiceKey("", fpf0.a(Context.class))));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final AndroidUnityInfoDataSource initialize$lambda$220$lambda$211(ServicesRegistry servicesRegistry) {
        return new AndroidUnityInfoDataSource((Context) servicesRegistry.resolveService(new ServiceKey("", fpf0.a(Context.class))));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final InstallReferrerDataSource initialize$lambda$220$lambda$212(ServicesRegistry servicesRegistry) {
        return new AndroidInstallReferrerDataSource((Context) servicesRegistry.resolveService(new ServiceKey("", fpf0.a(Context.class))), (SendDiagnosticEvent) servicesRegistry.resolveService(new ServiceKey("", fpf0.a(SendDiagnosticEvent.class))), (yvj) servicesRegistry.resolveService(new ServiceKey(NAMED_INIT_SCOPE, fpf0.a(yvj.class))));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final GoogleAppIdDataSource initialize$lambda$220$lambda$213(ServicesRegistry servicesRegistry) {
        return new AndroidGoogleAppIdDataSource((Context) servicesRegistry.resolveService(new ServiceKey("", fpf0.a(Context.class))));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final HandleDebugSettings initialize$lambda$220$lambda$214() {
        return new HandleDebugSettings();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Logger initialize$lambda$220$lambda$215(ServicesRegistry servicesRegistry) {
        return new UnityLogger((SessionRepository) servicesRegistry.resolveService(new ServiceKey("", fpf0.a(SessionRepository.class))), (CreateFile) servicesRegistry.resolveService(new ServiceKey("", fpf0.a(CreateFile.class))));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final IsBillingClientAvailable initialize$lambda$220$lambda$216() {
        return new IsBillingClientAvailable();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final UnityBootConfigDataSource initialize$lambda$220$lambda$217(ServicesRegistry servicesRegistry) {
        return new AndroidUnityBootConfigDataSource((Context) servicesRegistry.resolveService(new ServiceKey("", fpf0.a(Context.class))));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final GetSafeguardedInitializationPolicy initialize$lambda$220$lambda$218() {
        return new AndroidGetSafeguardedInitializationPolicy();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final RequestUrlFactory initialize$lambda$220$lambda$219(ServicesRegistry servicesRegistry) {
        return new AndroidRequestUrlFactory((SessionRepository) servicesRegistry.resolveService(new ServiceKey("", fpf0.a(SessionRepository.class))));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final fvk initialize$lambda$220$lambda$22(UnityAdsModule unityAdsModule, ServicesRegistry servicesRegistry) {
        return unityAdsModule.glInfoDataStore((Context) servicesRegistry.resolveService(new ServiceKey("", fpf0.a(Context.class))), (ovj) servicesRegistry.resolveService(new ServiceKey(IO_DISPATCHER, fpf0.a(ovj.class))), (fuk) servicesRegistry.resolveService(new ServiceKey(PREF_GL_INFO, fpf0.a(fuk.class))));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ByteStringDataSource initialize$lambda$220$lambda$23(UnityAdsModule unityAdsModule, ServicesRegistry servicesRegistry) {
        return unityAdsModule.glInfoDataStore((fvk) servicesRegistry.resolveService(new ServiceKey(DATA_STORE_GL_INFO, fpf0.a(fvk.class))));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final UniversalRequestDataStoreProvider initialize$lambda$220$lambda$24(ServicesRegistry servicesRegistry) {
        return new UniversalRequestDataStoreProvider((Context) servicesRegistry.resolveService(new ServiceKey("", fpf0.a(Context.class))), (ovj) servicesRegistry.resolveService(new ServiceKey(IO_DISPATCHER, fpf0.a(ovj.class))));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final fvk initialize$lambda$220$lambda$25(UnityAdsModule unityAdsModule, ServicesRegistry servicesRegistry) {
        return unityAdsModule.iapTransactionDataStore((Context) servicesRegistry.resolveService(new ServiceKey("", fpf0.a(Context.class))), (ovj) servicesRegistry.resolveService(new ServiceKey(IO_DISPATCHER, fpf0.a(ovj.class))));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ByteStringDataSource initialize$lambda$220$lambda$26(UnityAdsModule unityAdsModule, ServicesRegistry servicesRegistry) {
        return unityAdsModule.iapTransactionDataStore((fvk) servicesRegistry.resolveService(new ServiceKey(DATA_STORE_IAP_TRANSACTION, fpf0.a(fvk.class))));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final fvk initialize$lambda$220$lambda$27(UnityAdsModule unityAdsModule, ServicesRegistry servicesRegistry) {
        return unityAdsModule.webViewConfigurationDataStore((Context) servicesRegistry.resolveService(new ServiceKey("", fpf0.a(Context.class))), (ovj) servicesRegistry.resolveService(new ServiceKey(IO_DISPATCHER, fpf0.a(ovj.class))));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final CronetEngineBuilderFactory initialize$lambda$220$lambda$32() {
        return new CronetEngineBuilderFactory();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final HttpClientProvider initialize$lambda$220$lambda$33(ServicesRegistry servicesRegistry) {
        return new AndroidHttpClientProvider((ISDKDispatchers) servicesRegistry.resolveService(new ServiceKey("", fpf0.a(ISDKDispatchers.class))), (SendDiagnosticEvent) servicesRegistry.resolveService(new ServiceKey("", fpf0.a(SendDiagnosticEvent.class))), (Context) servicesRegistry.resolveService(new ServiceKey("", fpf0.a(Context.class))), (CronetEngineBuilderFactory) servicesRegistry.resolveService(new ServiceKey("", fpf0.a(CronetEngineBuilderFactory.class))), (MediationTraitsMetadataReader) servicesRegistry.resolveService(new ServiceKey("", fpf0.a(MediationTraitsMetadataReader.class))));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final HttpClient initialize$lambda$220$lambda$34(ServicesRegistry servicesRegistry) {
        return (HttpClient) myc0.i(EmptyCoroutineContext.b, new ServiceProvider$initialize$1$35$1(servicesRegistry, null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final MediationTraitsMetadataReader initialize$lambda$220$lambda$35(ServicesRegistry servicesRegistry) {
        return new MediationTraitsMetadataReader((JsonStorage) servicesRegistry.resolveService(new ServiceKey("MEMORY", fpf0.a(JsonStorage.class))));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final TcfDataSource initialize$lambda$220$lambda$36() {
        return new AndroidTcfDataSource();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final TcfRepository initialize$lambda$220$lambda$37(ServicesRegistry servicesRegistry) {
        return new AndroidTcfRepository((TcfDataSource) servicesRegistry.resolveService(new ServiceKey("", fpf0.a(TcfDataSource.class))));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final AndroidManifestIntPropertyReader initialize$lambda$220$lambda$38(ServicesRegistry servicesRegistry) {
        return new AndroidManifestIntPropertyReader((Context) servicesRegistry.resolveService(new ServiceKey("", fpf0.a(Context.class))));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final AndroidManifestStringPropertyReader initialize$lambda$220$lambda$39(ServicesRegistry servicesRegistry) {
        return new AndroidManifestStringPropertyReader((Context) servicesRegistry.resolveService(new ServiceKey("", fpf0.a(Context.class))));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final AndroidTestDataInfo initialize$lambda$220$lambda$40(ServicesRegistry servicesRegistry) {
        return new AndroidTestDataInfo((AndroidManifestIntPropertyReader) servicesRegistry.resolveService(new ServiceKey("", fpf0.a(AndroidManifestIntPropertyReader.class))));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final GameServerIdReader initialize$lambda$220$lambda$41(ServicesRegistry servicesRegistry) {
        return new GameServerIdReader((JsonStorage) servicesRegistry.resolveService(new ServiceKey(Privacy.PUBLIC, fpf0.a(JsonStorage.class))));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final StoreDataSource initialize$lambda$220$lambda$42(ServicesRegistry servicesRegistry) {
        return new AndroidStoreDataSource((Context) servicesRegistry.resolveService(new ServiceKey("", fpf0.a(Context.class))));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final AnalyticsDataSource initialize$lambda$220$lambda$43() {
        return new AndroidAnalyticsDataSource();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final DeveloperConsentDataSource initialize$lambda$220$lambda$44(ServicesRegistry servicesRegistry) {
        return new AndroidDeveloperConsentDataSource((FlattenerRulesUseCase) servicesRegistry.resolveService(new ServiceKey(DEV_CONSENT_PRIVACY_RULES, fpf0.a(FlattenerRulesUseCase.class))), (JsonStorage) servicesRegistry.resolveService(new ServiceKey(Privacy.PUBLIC, fpf0.a(JsonStorage.class))), (SessionRepository) servicesRegistry.resolveService(new ServiceKey("", fpf0.a(SessionRepository.class))));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final DynamicDeviceInfoDataSource initialize$lambda$220$lambda$45(ServicesRegistry servicesRegistry) {
        return new AndroidDynamicDeviceInfoDataSource((Context) servicesRegistry.resolveService(new ServiceKey("", fpf0.a(Context.class))), (LifecycleDataSource) servicesRegistry.resolveService(new ServiceKey("", fpf0.a(LifecycleDataSource.class))), (Logger) servicesRegistry.resolveService(new ServiceKey("", fpf0.a(Logger.class))));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final LegacyUserConsentDataSource initialize$lambda$220$lambda$46(ServicesRegistry servicesRegistry) {
        return new AndroidLegacyUserConsentDataSource((FlattenerRulesUseCase) servicesRegistry.resolveService(new ServiceKey(LEGACY_PRIVACY_RULES, fpf0.a(FlattenerRulesUseCase.class))), (JsonStorage) servicesRegistry.resolveService(new ServiceKey("PRIVATE", fpf0.a(JsonStorage.class))));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final LifecycleDataSource initialize$lambda$220$lambda$47() {
        return new AndroidLifecycleDataSource();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ForegroundDurationReader initialize$lambda$220$lambda$49(ServicesRegistry servicesRegistry) {
        AppForegroundDurationObserver appForegroundDurationObserver = new AppForegroundDurationObserver((LifecycleDataSource) servicesRegistry.resolveService(new ServiceKey("", fpf0.a(LifecycleDataSource.class))), (ovj) servicesRegistry.resolveService(new ServiceKey(DEFAULT_DISPATCHER, fpf0.a(ovj.class))), null, null, 12, null);
        appForegroundDurationObserver.invoke();
        return appForegroundDurationObserver;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final yvj initialize$lambda$220$lambda$5(UnityAdsModule unityAdsModule, ServicesRegistry servicesRegistry) {
        return unityAdsModule.initCoroutineScope((ISDKDispatchers) servicesRegistry.resolveService(new ServiceKey("", fpf0.a(ISDKDispatchers.class))), (pvj) servicesRegistry.resolveService(new ServiceKey("sdk", fpf0.a(pvj.class))), (eyx) servicesRegistry.resolveService(new ServiceKey(NAMED_PUBLIC_JOB, fpf0.a(eyx.class))));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final CacheDataSource initialize$lambda$220$lambda$50(ServicesRegistry servicesRegistry) {
        return new AndroidLocalCacheDataSource((CreateFile) servicesRegistry.resolveService(new ServiceKey("", fpf0.a(CreateFile.class))), (GetFileExtensionFromUrl) servicesRegistry.resolveService(new ServiceKey("", fpf0.a(GetFileExtensionFromUrl.class))));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final CreateFile initialize$lambda$220$lambda$51() {
        return new CommonCreateFile();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final GetFileExtensionFromUrl initialize$lambda$220$lambda$52(ServicesRegistry servicesRegistry) {
        return new CommonGetFileExtensionFromUrl((RemoveUrlQuery) servicesRegistry.resolveService(new ServiceKey("", fpf0.a(RemoveUrlQuery.class))));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final RemoveUrlQuery initialize$lambda$220$lambda$53() {
        return new AndroidRemoveUrlQuery();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final MediationDataSource initialize$lambda$220$lambda$54(ServicesRegistry servicesRegistry) {
        return new AndroidMediationDataSource((JsonStorage) servicesRegistry.resolveService(new ServiceKey("MEMORY", fpf0.a(JsonStorage.class))));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final PrivacyDeviceInfoDataSource initialize$lambda$220$lambda$55(ServicesRegistry servicesRegistry) {
        return new AndroidPrivacyDeviceInfoDataSource((Context) servicesRegistry.resolveService(new ServiceKey("", fpf0.a(Context.class))), (FIdDataSource) servicesRegistry.resolveService(new ServiceKey("", fpf0.a(FIdDataSource.class))), (AndroidAppSetIdDataSource) servicesRegistry.resolveService(new ServiceKey("", fpf0.a(AndroidAppSetIdDataSource.class))));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final CacheDataSource initialize$lambda$220$lambda$56(ServicesRegistry servicesRegistry) {
        return new AndroidRemoteCacheDataSource((ovj) servicesRegistry.resolveService(new ServiceKey(IO_DISPATCHER, fpf0.a(ovj.class))), (CreateFile) servicesRegistry.resolveService(new ServiceKey("", fpf0.a(CreateFile.class))), (GetFileExtensionFromUrl) servicesRegistry.resolveService(new ServiceKey("", fpf0.a(GetFileExtensionFromUrl.class))), (HttpClientProvider) servicesRegistry.resolveService(new ServiceKey("", fpf0.a(HttpClientProvider.class))), (SessionRepository) servicesRegistry.resolveService(new ServiceKey("", fpf0.a(SessionRepository.class))));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final StaticDeviceInfoDataSource initialize$lambda$220$lambda$57(ServicesRegistry servicesRegistry) {
        return new AndroidStaticDeviceInfoDataSource((Context) servicesRegistry.resolveService(new ServiceKey("", fpf0.a(Context.class))), (ByteStringDataSource) servicesRegistry.resolveService(new ServiceKey(DATA_STORE_GL_INFO, fpf0.a(ByteStringDataSource.class))), (AnalyticsDataSource) servicesRegistry.resolveService(new ServiceKey("", fpf0.a(AnalyticsDataSource.class))), (StoreDataSource) servicesRegistry.resolveService(new ServiceKey("", fpf0.a(StoreDataSource.class))), (UnityBootConfigDataSource) servicesRegistry.resolveService(new ServiceKey("", fpf0.a(UnityBootConfigDataSource.class))), (Logger) servicesRegistry.resolveService(new ServiceKey("", fpf0.a(Logger.class))));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final fuk initialize$lambda$220$lambda$58(ServicesRegistry servicesRegistry) {
        return new FetchGLInfoDataMigration((GetOpenGLRendererInfo) servicesRegistry.resolveService(new ServiceKey("", fpf0.a(GetOpenGLRendererInfo.class))));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final UniversalRequestDataSource initialize$lambda$220$lambda$59(ServicesRegistry servicesRegistry) {
        return new UniversalRequestDataSource((UniversalRequestDataStoreProvider) servicesRegistry.resolveService(new ServiceKey("", fpf0.a(UniversalRequestDataStoreProvider.class))));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final yvj initialize$lambda$220$lambda$6(UnityAdsModule unityAdsModule, ServicesRegistry servicesRegistry) {
        return unityAdsModule.loadCoroutineScope((ISDKDispatchers) servicesRegistry.resolveService(new ServiceKey("", fpf0.a(ISDKDispatchers.class))), (pvj) servicesRegistry.resolveService(new ServiceKey("sdk", fpf0.a(pvj.class))), (eyx) servicesRegistry.resolveService(new ServiceKey(NAMED_PUBLIC_JOB, fpf0.a(eyx.class))));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final WebviewConfigurationDataSource initialize$lambda$220$lambda$60(ServicesRegistry servicesRegistry) {
        return new WebviewConfigurationDataSource((fvk) servicesRegistry.resolveService(new ServiceKey(DATA_STORE_WEBVIEW_CONFIG, fpf0.a(fvk.class))));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final OmidManager initialize$lambda$220$lambda$61() {
        return new AndroidOmidManager();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final SDKPropertiesManager initialize$lambda$220$lambda$62() {
        return new AndroidSDKPropertiesManager();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final StorageManager initialize$lambda$220$lambda$63() {
        return new AndroidStorageManager();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final BillingClientAdapter initialize$lambda$220$lambda$64(ServicesRegistry servicesRegistry) {
        return new BillingClientAdapterFactory().createBillingClientAdapter((Context) servicesRegistry.resolveService(new ServiceKey("", fpf0.a(Context.class))));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ProductDetailsFetcher initialize$lambda$220$lambda$65(ServicesRegistry servicesRegistry) {
        return new ProductDetailsFetcherWithFallback(new CommonProductDetailsFetcher((BillingClientAdapter) servicesRegistry.resolveService(new ServiceKey("", fpf0.a(BillingClientAdapter.class))), "inapp"), new CommonProductDetailsFetcher((BillingClientAdapter) servicesRegistry.resolveService(new ServiceKey("", fpf0.a(BillingClientAdapter.class))), "subs"));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final TransactionEventManager initialize$lambda$220$lambda$66(ServicesRegistry servicesRegistry) {
        return new TransactionEventManager((yvj) servicesRegistry.resolveService(new ServiceKey(NAMED_TRANSACTION_SCOPE, fpf0.a(yvj.class))), (BillingClientAdapter) servicesRegistry.resolveService(new ServiceKey("", fpf0.a(BillingClientAdapter.class))), (GetTransactionData) servicesRegistry.resolveService(new ServiceKey("", fpf0.a(GetTransactionData.class))), (GetTransactionRequest) servicesRegistry.resolveService(new ServiceKey("", fpf0.a(GetTransactionRequest.class))), (TransactionEventRepository) servicesRegistry.resolveService(new ServiceKey("", fpf0.a(TransactionEventRepository.class))), (ByteStringDataSource) servicesRegistry.resolveService(new ServiceKey(DATA_STORE_IAP_TRANSACTION, fpf0.a(ByteStringDataSource.class))), (IsBillingClientAvailable) servicesRegistry.resolveService(new ServiceKey("", fpf0.a(IsBillingClientAvailable.class))), (SessionRepository) servicesRegistry.resolveService(new ServiceKey("", fpf0.a(SessionRepository.class))), (ProductDetailsFetcher) servicesRegistry.resolveService(new ServiceKey("", fpf0.a(ProductDetailsFetcher.class))), (Logger) servicesRegistry.resolveService(new ServiceKey("", fpf0.a(Logger.class))));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final AdRepository initialize$lambda$220$lambda$67() {
        return new AndroidAdRepository();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final CacheRepository initialize$lambda$220$lambda$68(ServicesRegistry servicesRegistry) {
        return new AndroidCacheRepository((ovj) servicesRegistry.resolveService(new ServiceKey(IO_DISPATCHER, fpf0.a(ovj.class))), (GetCacheDirectory) servicesRegistry.resolveService(new ServiceKey("", fpf0.a(GetCacheDirectory.class))), (CacheDataSource) servicesRegistry.resolveService(new ServiceKey("local", fpf0.a(CacheDataSource.class))), (CacheDataSource) servicesRegistry.resolveService(new ServiceKey("remote", fpf0.a(CacheDataSource.class))), (Context) servicesRegistry.resolveService(new ServiceKey("", fpf0.a(Context.class))), (SessionRepository) servicesRegistry.resolveService(new ServiceKey("", fpf0.a(SessionRepository.class))), (CleanupDirectory) servicesRegistry.resolveService(new ServiceKey("", fpf0.a(CleanupDirectory.class))), (DownloadPriorityQueue) servicesRegistry.resolveService(new ServiceKey("", fpf0.a(DownloadPriorityQueue.class))), (CreateFile) servicesRegistry.resolveService(new ServiceKey("", fpf0.a(CreateFile.class))), (SendDiagnosticEvent) servicesRegistry.resolveService(new ServiceKey("", fpf0.a(SendDiagnosticEvent.class))), (GetAssetFileName) servicesRegistry.resolveService(new ServiceKey("", fpf0.a(GetAssetFileName.class))));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final GetCacheDirectory initialize$lambda$220$lambda$69() {
        return new CommonGetCacheDirectory();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final yvj initialize$lambda$220$lambda$7(UnityAdsModule unityAdsModule, ServicesRegistry servicesRegistry) {
        return unityAdsModule.showCoroutineScope((ISDKDispatchers) servicesRegistry.resolveService(new ServiceKey("", fpf0.a(ISDKDispatchers.class))), (pvj) servicesRegistry.resolveService(new ServiceKey("sdk", fpf0.a(pvj.class))), (eyx) servicesRegistry.resolveService(new ServiceKey(NAMED_PUBLIC_JOB, fpf0.a(eyx.class))));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final GetAssetFileName initialize$lambda$220$lambda$70() {
        return new GetAssetFileName();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final CampaignRepository initialize$lambda$220$lambda$71(ServicesRegistry servicesRegistry) {
        return new AndroidCampaignRepository((GetSharedDataTimestamps) servicesRegistry.resolveService(new ServiceKey("", fpf0.a(GetSharedDataTimestamps.class))));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final DeveloperConsentRepository initialize$lambda$220$lambda$72(ServicesRegistry servicesRegistry) {
        return new AndroidDeveloperConsentRepository((DeveloperConsentDataSource) servicesRegistry.resolveService(new ServiceKey("", fpf0.a(DeveloperConsentDataSource.class))));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final DeviceInfoRepository initialize$lambda$220$lambda$73(ServicesRegistry servicesRegistry) {
        return new AndroidDeviceInfoRepository((StaticDeviceInfoDataSource) servicesRegistry.resolveService(new ServiceKey("", fpf0.a(StaticDeviceInfoDataSource.class))), (DynamicDeviceInfoDataSource) servicesRegistry.resolveService(new ServiceKey("", fpf0.a(DynamicDeviceInfoDataSource.class))), (PrivacyDeviceInfoDataSource) servicesRegistry.resolveService(new ServiceKey("", fpf0.a(PrivacyDeviceInfoDataSource.class))), (SessionRepository) servicesRegistry.resolveService(new ServiceKey("", fpf0.a(SessionRepository.class))));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final DiagnosticEventRepository initialize$lambda$220$lambda$74(ServicesRegistry servicesRegistry) {
        return new AndroidDiagnosticEventRepository((CoroutineTimer) servicesRegistry.resolveService(new ServiceKey("", fpf0.a(CoroutineTimer.class))), (GetDiagnosticEventRequest) servicesRegistry.resolveService(new ServiceKey("", fpf0.a(GetDiagnosticEventRequest.class))), (ovj) servicesRegistry.resolveService(new ServiceKey(DEFAULT_DISPATCHER, fpf0.a(ovj.class))));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final LegacyUserConsentRepository initialize$lambda$220$lambda$75(ServicesRegistry servicesRegistry) {
        return new AndroidLegacyUserConsentRepository((LegacyUserConsentDataSource) servicesRegistry.resolveService(new ServiceKey("", fpf0.a(LegacyUserConsentDataSource.class))));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final MediationProviderParser initialize$lambda$220$lambda$76() {
        return new CommonMediationProviderParser();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final MediationInfoConverter initialize$lambda$220$lambda$77(ServicesRegistry servicesRegistry) {
        return new CommonMediationInfoConverter((MediationProviderParser) servicesRegistry.resolveService(new ServiceKey("", fpf0.a(MediationProviderParser.class))));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final MediationRepository initialize$lambda$220$lambda$78(ServicesRegistry servicesRegistry) {
        return new AndroidMediationRepository((MediationDataSource) servicesRegistry.resolveService(new ServiceKey("", fpf0.a(MediationDataSource.class))), (MediationProviderParser) servicesRegistry.resolveService(new ServiceKey("", fpf0.a(MediationProviderParser.class))));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final OpenMeasurementRepository initialize$lambda$220$lambda$79(ServicesRegistry servicesRegistry) {
        return new AndroidOpenMeasurementRepository((ovj) servicesRegistry.resolveService(new ServiceKey(MAIN_DISPATCHER, fpf0.a(ovj.class))), (OmidManager) servicesRegistry.resolveService(new ServiceKey("", fpf0.a(OmidManager.class))));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final yvj initialize$lambda$220$lambda$8(UnityAdsModule unityAdsModule, ServicesRegistry servicesRegistry) {
        return unityAdsModule.transactionCoroutineScope((ISDKDispatchers) servicesRegistry.resolveService(new ServiceKey("", fpf0.a(ISDKDispatchers.class))), (pvj) servicesRegistry.resolveService(new ServiceKey("sdk", fpf0.a(pvj.class))), (eyx) servicesRegistry.resolveService(new ServiceKey(NAMED_PUBLIC_JOB, fpf0.a(eyx.class))));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final SessionRepository initialize$lambda$220$lambda$80(ServicesRegistry servicesRegistry) {
        return new AndroidSessionRepository((ByteStringDataSource) servicesRegistry.resolveService(new ServiceKey(DATA_STORE_GATEWAY_CACHE, fpf0.a(ByteStringDataSource.class))), (ByteStringDataSource) servicesRegistry.resolveService(new ServiceKey(DATA_STORE_PRIVACY, fpf0.a(ByteStringDataSource.class))), (ByteStringDataSource) servicesRegistry.resolveService(new ServiceKey(DATA_STORE_PRIVACY_FSM, fpf0.a(ByteStringDataSource.class))), (ByteStringDataSource) servicesRegistry.resolveService(new ServiceKey(DATA_STORE_NATIVE_CONFIG, fpf0.a(ByteStringDataSource.class))), (AndroidUnityInfoDataSource) servicesRegistry.resolveService(new ServiceKey("", fpf0.a(AndroidUnityInfoDataSource.class))), (NativeConfigurationOuterClass.NativeConfiguration) servicesRegistry.resolveService(new ServiceKey("", fpf0.a(NativeConfigurationOuterClass.NativeConfiguration.class))), (ovj) servicesRegistry.resolveService(new ServiceKey(IO_DISPATCHER, fpf0.a(ovj.class))), (SendDiagnosticEvent) servicesRegistry.resolveService(new ServiceKey("", fpf0.a(SendDiagnosticEvent.class))), ((GatewayUrl) servicesRegistry.resolveService(new ServiceKey("", fpf0.a(GatewayUrl.class)))).m63unboximpl(), null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final TransactionEventRepository initialize$lambda$220$lambda$81() {
        return new AndroidTransactionEventRepository();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final AdRevenueRepository initialize$lambda$220$lambda$82() {
        return new AndroidAdRevenueRepository();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final OperativeEventRepository initialize$lambda$220$lambda$83() {
        return new OperativeEventRepository();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ExecuteAdViewerRequest initialize$lambda$220$lambda$84(ServicesRegistry servicesRegistry) {
        return new AndroidExecuteAdViewerRequest((ovj) servicesRegistry.resolveService(new ServiceKey(IO_DISPATCHER, fpf0.a(ovj.class))), (HttpClientProvider) servicesRegistry.resolveService(new ServiceKey("", fpf0.a(HttpClientProvider.class))), (GetCachedAsset) servicesRegistry.resolveService(new ServiceKey("", fpf0.a(GetCachedAsset.class))));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final GetByteStringId initialize$lambda$220$lambda$85() {
        return new AndroidGenerateByteStringId();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final IntentCreation initialize$lambda$220$lambda$86() {
        return new AndroidIntentCreation();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final HandleOpenUrl initialize$lambda$220$lambda$87(ServicesRegistry servicesRegistry) {
        return new AndroidHandleOpenUrl((Context) servicesRegistry.resolveService(new ServiceKey("", fpf0.a(Context.class))), (IntentCreation) servicesRegistry.resolveService(new ServiceKey("", fpf0.a(IntentCreation.class))));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Refresh initialize$lambda$220$lambda$88(ServicesRegistry servicesRegistry) {
        return new AndroidRefresh((ovj) servicesRegistry.resolveService(new ServiceKey(DEFAULT_DISPATCHER, fpf0.a(ovj.class))), (GetAdDataRefreshRequest) servicesRegistry.resolveService(new ServiceKey("", fpf0.a(GetAdDataRefreshRequest.class))), (GetRequestPolicy) servicesRegistry.resolveService(new ServiceKey(NAMED_AD_REQ, fpf0.a(GetRequestPolicy.class))), (GatewayClient) servicesRegistry.resolveService(new ServiceKey("", fpf0.a(GatewayClient.class))));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final CacheAssets initialize$lambda$220$lambda$89(ServicesRegistry servicesRegistry) {
        return new AndroidCacheAssets((yvj) servicesRegistry.resolveService(new ServiceKey(NAMED_LOAD_SCOPE, fpf0.a(yvj.class))), (CacheFile) servicesRegistry.resolveService(new ServiceKey("", fpf0.a(CacheFile.class))), (SendDiagnosticEvent) servicesRegistry.resolveService(new ServiceKey("", fpf0.a(SendDiagnosticEvent.class))));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final yvj initialize$lambda$220$lambda$9(UnityAdsModule unityAdsModule, ServicesRegistry servicesRegistry) {
        return unityAdsModule.ilrdCoroutineScope((ISDKDispatchers) servicesRegistry.resolveService(new ServiceKey("", fpf0.a(ISDKDispatchers.class))), (pvj) servicesRegistry.resolveService(new ServiceKey("sdk", fpf0.a(pvj.class))), (eyx) servicesRegistry.resolveService(new ServiceKey(NAMED_PUBLIC_JOB, fpf0.a(eyx.class))));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final AdRefresh initialize$lambda$220$lambda$90(ServicesRegistry servicesRegistry) {
        return new AndroidAdRefresh((AdRepository) servicesRegistry.resolveService(new ServiceKey("", fpf0.a(AdRepository.class))), (CacheAssets) servicesRegistry.resolveService(new ServiceKey("", fpf0.a(CacheAssets.class))), (Refresh) servicesRegistry.resolveService(new ServiceKey("", fpf0.a(Refresh.class))));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final SendDiagnosticEvent initialize$lambda$220$lambda$91(ServicesRegistry servicesRegistry) {
        return new AndroidSendDiagnosticEvent((DiagnosticEventRepository) servicesRegistry.resolveService(new ServiceKey("", fpf0.a(DiagnosticEventRepository.class))), (GetDiagnosticEventRequest) servicesRegistry.resolveService(new ServiceKey("", fpf0.a(GetDiagnosticEventRequest.class))), (LifecycleDataSource) servicesRegistry.resolveService(new ServiceKey("", fpf0.a(LifecycleDataSource.class))));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final SendWebViewClientErrorDiagnostics initialize$lambda$220$lambda$92(ServicesRegistry servicesRegistry) {
        return new AndroidSendWebViewClientErrorDiagnostics((SendDiagnosticEvent) servicesRegistry.resolveService(new ServiceKey("", fpf0.a(SendDiagnosticEvent.class))));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Show initialize$lambda$220$lambda$93(ServicesRegistry servicesRegistry) {
        return new AndroidShow((Context) servicesRegistry.resolveService(new ServiceKey("", fpf0.a(Context.class))), (AdRepository) servicesRegistry.resolveService(new ServiceKey("", fpf0.a(AdRepository.class))), (GameServerIdReader) servicesRegistry.resolveService(new ServiceKey("", fpf0.a(GameServerIdReader.class))), (SendDiagnosticEvent) servicesRegistry.resolveService(new ServiceKey("", fpf0.a(SendDiagnosticEvent.class))), (ValidateExtrasSize) servicesRegistry.resolveService(new ServiceKey("", fpf0.a(ValidateExtrasSize.class))), (HandleGatewayAdResponse) servicesRegistry.resolveService(new ServiceKey("", fpf0.a(HandleGatewayAdResponse.class))));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final CacheFile initialize$lambda$220$lambda$94(ServicesRegistry servicesRegistry) {
        return new CommonCacheFile((CacheRepository) servicesRegistry.resolveService(new ServiceKey("", fpf0.a(CacheRepository.class))), (SendDiagnosticEvent) servicesRegistry.resolveService(new ServiceKey("", fpf0.a(SendDiagnosticEvent.class))));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final CleanAssets initialize$lambda$220$lambda$95(ServicesRegistry servicesRegistry) {
        return new CommonCleanAssets((CacheRepository) servicesRegistry.resolveService(new ServiceKey("", fpf0.a(CacheRepository.class))));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final GetAdObject initialize$lambda$220$lambda$96(ServicesRegistry servicesRegistry) {
        return new CommonGetAdObject((AdRepository) servicesRegistry.resolveService(new ServiceKey("", fpf0.a(AdRepository.class))));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final GetHeaderBiddingToken initialize$lambda$220$lambda$97(ServicesRegistry servicesRegistry) {
        return new CommonGetHeaderBiddingToken((BuildHeaderBiddingToken) servicesRegistry.resolveService(new ServiceKey("", fpf0.a(BuildHeaderBiddingToken.class))));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final BuildHeaderBiddingToken initialize$lambda$220$lambda$98(ServicesRegistry servicesRegistry) {
        return new AndroidBuildHeaderBiddingToken((GetByteStringId) servicesRegistry.resolveService(new ServiceKey("", fpf0.a(GetByteStringId.class))), (GetClientInfo) servicesRegistry.resolveService(new ServiceKey("", fpf0.a(GetClientInfo.class))), (GetSharedDataTimestamps) servicesRegistry.resolveService(new ServiceKey("", fpf0.a(GetSharedDataTimestamps.class))), (GetLimitedSessionToken) servicesRegistry.resolveService(new ServiceKey("", fpf0.a(GetLimitedSessionToken.class))), (GetInitializationData) servicesRegistry.resolveService(new ServiceKey("", fpf0.a(GetInitializationData.class))), (DeviceInfoRepository) servicesRegistry.resolveService(new ServiceKey("", fpf0.a(DeviceInfoRepository.class))), (SessionRepository) servicesRegistry.resolveService(new ServiceKey("", fpf0.a(SessionRepository.class))), (CampaignRepository) servicesRegistry.resolveService(new ServiceKey("", fpf0.a(CampaignRepository.class))), (TcfRepository) servicesRegistry.resolveService(new ServiceKey("", fpf0.a(TcfRepository.class))), (AndroidTestDataInfo) servicesRegistry.resolveService(new ServiceKey("", fpf0.a(AndroidTestDataInfo.class))), (OfferwallManager) servicesRegistry.resolveService(new ServiceKey("", fpf0.a(OfferwallManager.class))), (MediationInfoConverter) servicesRegistry.resolveService(new ServiceKey("", fpf0.a(MediationInfoConverter.class))));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final TokenNumberProvider initialize$lambda$220$lambda$99(ServicesRegistry servicesRegistry) {
        return new CommonTokenNumberProvider((SessionRepository) servicesRegistry.resolveService(new ServiceKey("", fpf0.a(SessionRepository.class))));
    }

    @Override // com.unity3d.services.core.di.IServiceProvider
    public IServicesRegistry getRegistry() {
        return serviceRegistry;
    }

    @Override // com.unity3d.services.core.di.IServiceProvider
    public IServicesRegistry initialize() {
        return ServicesRegistryKt.registry(new gvs(29));
    }
}
