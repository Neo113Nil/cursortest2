package ru.ozon.app.android.video.di;

import Gg0.f;
import Jb.d;
import Jb.j;
import Ld0.c;
import Pc.a;
import We.E;
import android.content.Context;
import ei0.InterfaceC6369b;
import o3.InterfaceC8635b;
import qj.C9067a;
import ru.ozon.app.android.analytics.di.AnalyticsComponentApi;
import ru.ozon.app.android.analytics.performance.PerformanceTrackerDelegate;
import ru.ozon.app.android.analytics.screen.storage.di.AnalyticsScreenStorageComponentApi;
import ru.ozon.app.android.di.provider.component.ContextComponentDependencies;
import ru.ozon.app.android.limb.Limb2ComponentApi;
import ru.ozon.app.android.network.abtool.FeatureChecker;
import ru.ozon.app.android.network.abtool.FeatureService;
import ru.ozon.app.android.network.cronet.CronetConfig;
import ru.ozon.app.android.network.cronet.CronetOkHttpClientProvider;
import ru.ozon.app.android.network.di.NetworkComponentApi;
import ru.ozon.app.android.video.di.VideoComponent;
import ru.ozon.app.android.video.domainreplacement.domain.VideoDomainReplacementService;
import ru.ozon.app.android.video.domainreplacement.domain.VideoDomainReplacementServiceImpl;
import ru.ozon.app.android.video.manager.CacheTransferInfoProvider;
import ru.ozon.app.android.video.manager.CacheTransferListener;
import ru.ozon.app.android.video.manager.ExoManagerLive;
import ru.ozon.app.android.video.manager.ExoManagerLiveImpl;
import ru.ozon.app.android.video.manager.ExoManagerWithCache;
import ru.ozon.app.android.video.manager.ExoManagerWithCacheImpl;
import ru.ozon.app.android.video.manager.ProgressiveExoManager;
import ru.ozon.app.android.video.manager.ProgressiveWithCacheExoManager;
import ru.ozon.app.android.video.manager.progressiveImpl.ProgressiveExoManagerImpl;
import ru.ozon.app.android.video.manager.progressiveImpl.ProgressiveWithCacheExoManagerImpl;
import ru.ozon.app.android.video.player.CdnChooserSdkVideoService;
import ru.ozon.app.android.video.player.audioRequestService.AudioRequestService;
import ru.ozon.app.android.video.player.audioRequestService.AudioRequestServiceImpl;
import ru.ozon.app.android.video.player.logs.PlayerLogger;
import ru.ozon.app.android.video.player.logs.PlayerLoggerImpl;
import ru.ozon.app.android.video.player.performance.VideoWidgetNamesHolder;
import ru.ozon.app.android.video.player.performance.cronet.VideoCronetMetricListener;
import ru.ozon.app.android.video.player.performance.metricsManager.VideoPerfMetricsManager;
import ru.ozon.app.android.video.player.performance.metricsManager.VideoPerfMetricsManagerHelper;
import ru.ozon.app.android.video.player.performance.metricsManager.VideoPerfMetricsManagerHelperImpl;
import ru.ozon.app.android.video.player.performance.metricsManager.VideoPerfMetricsManagerImpl;
import ru.ozon.app.android.video.player.playerpreferences.PlayerPreferences;
import ru.ozon.app.android.video.player.playerpreferences.PlayerPreferencesImpl;
import ru.ozon.app.android.video.player.soundservice.SoundService;
import ru.ozon.app.android.video.player.soundservice.SoundServiceImpl;
import ru.ozon.app.android.video.player.soundservice.soundContentObserver.SoundContentObserver;
import ru.ozon.app.android.video.playerV2.performance.playback.PlaybackAnalyticsSender;
import ru.ozon.app.android.video.playerV2.videoController.VideoController;
import ru.ozon.app.android.video.playerV2.videoController.VideoControllerImpl;
import ru.ozon.app.android.video.playerV2.videoController.poolManager.PlayerPoolManager;
import ru.ozon.app.android.video.playerV2.videoController.poolManager.PlayerPoolManagerImpl;
import ru.ozon.app.android.video.playerV2.videoController.poolManager.factory.PoolPlayerFactory;
import ru.ozon.app.android.video.playerV2.videoController.poolManager.poolStorage.PlayerPoolStorage;
import ru.ozon.app.android.video.playerV2.videoController.poolManager.poolStorage.PlayerPoolStorageImpl;
import ru.ozon.app.android.video.playerV2.videoController.singleInstanceFactory.SingleInstanceFactory;
import ru.ozon.app.android.video.preload.PlayerPreloader;
import ru.ozon.app.android.video.preload.PlayerPreloaderImpl;

/* loaded from: classes7.dex */
public final class DaggerVideoComponent {

    private static final class Factory implements VideoComponent.Factory {
        /* synthetic */ Factory(int i11) {
            this();
        }

        @Override // ru.ozon.app.android.video.di.VideoComponent.Factory
        public VideoComponent create(ContextComponentDependencies contextComponentDependencies, AnalyticsComponentApi analyticsComponentApi, NetworkComponentApi networkComponentApi, CdnVideoComponentApi cdnVideoComponentApi, ImagesAnalyticsComponentApi imagesAnalyticsComponentApi, AnalyticsScreenStorageComponentApi analyticsScreenStorageComponentApi, Limb2ComponentApi limb2ComponentApi) {
            contextComponentDependencies.getClass();
            analyticsComponentApi.getClass();
            networkComponentApi.getClass();
            cdnVideoComponentApi.getClass();
            imagesAnalyticsComponentApi.getClass();
            analyticsScreenStorageComponentApi.getClass();
            limb2ComponentApi.getClass();
            return new VideoComponentImpl(contextComponentDependencies, analyticsComponentApi, networkComponentApi, cdnVideoComponentApi, imagesAnalyticsComponentApi, analyticsScreenStorageComponentApi, limb2ComponentApi, 0);
        }

        private Factory() {
        }
    }

    private static final class VideoComponentImpl implements VideoComponent {
        private final AnalyticsComponentApi analyticsComponentApi;
        private final AnalyticsScreenStorageComponentApi analyticsScreenStorageComponentApi;
        private a<AudioRequestServiceImpl> audioRequestServiceImplProvider;
        private a<AudioRequestService> bindAudioRequestServiceProvider;
        private a<CacheTransferInfoProvider> bindCacheTransferListenerProvider;
        private a<ExoManagerLive> bindExoManagerLiveProvider;
        private a<ExoManagerWithCache> bindExoManagerWithCacheProvider;
        private a<PlayerLogger> bindPlayerLoggerProvider;
        private a<PlayerPoolManager> bindPlayerPoolManagerProvider;
        private a<PlayerPoolStorage> bindPlayerPoolStorageProvider;
        private a<PlayerPreferences> bindPlayerPreferencesProvider;
        private a<PlayerPreloader> bindPlayerPreloaderProvider;
        private a<ProgressiveExoManager> bindProgressiveExoManagerProvider;
        private a<ProgressiveWithCacheExoManager> bindProgressiveWithCacheExoManagerProvider;
        private a<SoundService> bindSoundServiceProvider;
        private a<VideoController> bindVideoControllerProvider;
        private a<VideoDomainReplacementService> bindVideoDomainReplacementServiceProvider;
        private a<VideoPerfMetricsManagerHelper> bindVideoPerfMetricsHelperProvider;
        private a<VideoPerfMetricsManager> bindVideoPerfMetricsManagerProvider;
        private a<CacheTransferListener> cacheTransferListenerProvider;
        private final CdnVideoComponentApi cdnVideoComponentApi;
        private final ContextComponentDependencies contextComponentDependencies;
        private a<ExoManagerLiveImpl> exoManagerLiveImplProvider;
        private a<ExoManagerWithCacheImpl> exoManagerWithCacheImplProvider;
        private final ImagesAnalyticsComponentApi imagesAnalyticsComponentApi;
        private final Limb2ComponentApi limb2ComponentApi;
        private final NetworkComponentApi networkComponentApi;
        private a<PlaybackAnalyticsSender> playbackAnalyticsSenderProvider;
        private a<PlayerLoggerImpl> playerLoggerImplProvider;
        private a<PlayerPoolManagerImpl> playerPoolManagerImplProvider;
        private a<PlayerPoolStorageImpl> playerPoolStorageImplProvider;
        private a<PlayerPreferencesImpl> playerPreferencesImplProvider;
        private a<PlayerPreloaderImpl> playerPreloaderImplProvider;
        private a<PoolPlayerFactory> poolPlayerFactoryProvider;
        private a<ProgressiveExoManagerImpl> progressiveExoManagerImplProvider;
        private a<ProgressiveWithCacheExoManagerImpl> progressiveWithCacheExoManagerImplProvider;
        private a<InterfaceC8635b> provideDatabaseProvider;
        private a<E> provideOkHttpClientProvider;
        private a<CronetConfig> providerCronetConfigProvider;
        private a<SingleInstanceFactory> singleInstanceFactoryProvider;
        private a<SoundServiceImpl> soundServiceImplProvider;
        private final VideoComponentImpl videoComponentImpl;
        private a<VideoControllerImpl> videoControllerImplProvider;
        private a<VideoCronetMetricListener> videoCronetMetricListenerProvider;
        private a<VideoDomainReplacementServiceImpl> videoDomainReplacementServiceImplProvider;
        private a<VideoPerfMetricsManagerHelperImpl> videoPerfMetricsManagerHelperImplProvider;
        private a<VideoPerfMetricsManagerImpl> videoPerfMetricsManagerImplProvider;
        private a<VideoWidgetNamesHolder> videoWidgetNamesHolderProvider;

        private static final class SwitchingProvider<T> implements a<T> {

            /* renamed from: id, reason: collision with root package name */
            private final int f94583id;
            private final VideoComponentImpl videoComponentImpl;

            SwitchingProvider(VideoComponentImpl videoComponentImpl, int i11) {
                this.videoComponentImpl = videoComponentImpl;
                this.f94583id = i11;
            }

            @Override // Pc.a
            public T get() {
                switch (this.f94583id) {
                    case 0:
                        return (T) new VideoControllerImpl((SingleInstanceFactory) this.videoComponentImpl.singleInstanceFactoryProvider.get(), (PlayerPoolManager) this.videoComponentImpl.bindPlayerPoolManagerProvider.get(), this.videoComponentImpl.bindExoManagerLiveProvider, this.videoComponentImpl.bindExoManagerWithCacheProvider, this.videoComponentImpl.bindProgressiveExoManagerProvider, this.videoComponentImpl.bindProgressiveWithCacheExoManagerProvider);
                    case 1:
                        Context context = this.videoComponentImpl.contextComponentDependencies.getContext();
                        j.c(context);
                        AudioRequestService audioRequestService = (AudioRequestService) this.videoComponentImpl.bindAudioRequestServiceProvider.get();
                        PlayerPreferences playerPreferences = (PlayerPreferences) this.videoComponentImpl.bindPlayerPreferencesProvider.get();
                        VideoWidgetNamesHolder videoWidgetNamesHolder = (VideoWidgetNamesHolder) this.videoComponentImpl.videoWidgetNamesHolderProvider.get();
                        f placeholderTimeHandler = this.videoComponentImpl.imagesAnalyticsComponentApi.getPlaceholderTimeHandler();
                        j.c(placeholderTimeHandler);
                        FeatureService featureService = this.videoComponentImpl.networkComponentApi.getFeatureService();
                        j.c(featureService);
                        VideoDomainReplacementService videoDomainReplacementService = (VideoDomainReplacementService) this.videoComponentImpl.bindVideoDomainReplacementServiceProvider.get();
                        VideoPerfMetricsManagerHelper videoPerfMetricsManagerHelper = (VideoPerfMetricsManagerHelper) this.videoComponentImpl.bindVideoPerfMetricsHelperProvider.get();
                        Sg.a analyticsScreenStorage = this.videoComponentImpl.analyticsScreenStorageComponentApi.getAnalyticsScreenStorage();
                        j.c(analyticsScreenStorage);
                        return (T) new SingleInstanceFactory(context, audioRequestService, playerPreferences, videoWidgetNamesHolder, placeholderTimeHandler, featureService, videoDomainReplacementService, videoPerfMetricsManagerHelper, analyticsScreenStorage, (PlaybackAnalyticsSender) this.videoComponentImpl.playbackAnalyticsSenderProvider.get(), (VideoPerfMetricsManager) this.videoComponentImpl.bindVideoPerfMetricsManagerProvider.get(), (PlayerLogger) this.videoComponentImpl.bindPlayerLoggerProvider.get());
                    case 2:
                        Context context2 = this.videoComponentImpl.contextComponentDependencies.getContext();
                        j.c(context2);
                        return (T) new AudioRequestServiceImpl(context2);
                    case 3:
                        Context context3 = this.videoComponentImpl.contextComponentDependencies.getContext();
                        j.c(context3);
                        return (T) new PlayerPreferencesImpl(context3);
                    case 4:
                        return (T) new VideoWidgetNamesHolder();
                    case 5:
                        CdnChooserSdkVideoService cdnChooserSdkVideoService = this.videoComponentImpl.cdnVideoComponentApi.getCdnChooserSdkVideoService();
                        j.c(cdnChooserSdkVideoService);
                        return (T) new VideoDomainReplacementServiceImpl(cdnChooserSdkVideoService);
                    case 6:
                        FeatureChecker featureChecker = this.videoComponentImpl.networkComponentApi.getFeatureChecker();
                        j.c(featureChecker);
                        return (T) new VideoPerfMetricsManagerHelperImpl(featureChecker);
                    case 7:
                        FeatureChecker featureChecker2 = this.videoComponentImpl.networkComponentApi.getFeatureChecker();
                        j.c(featureChecker2);
                        C9067a networkInfoProvider = this.videoComponentImpl.networkComponentApi.getNetworkInfoProvider();
                        j.c(networkInfoProvider);
                        return (T) new PlaybackAnalyticsSender(featureChecker2, networkInfoProvider);
                    case 8:
                        CacheTransferInfoProvider cacheTransferInfoProvider = (CacheTransferInfoProvider) this.videoComponentImpl.bindCacheTransferListenerProvider.get();
                        PerformanceTrackerDelegate performanceTrackerDelegate = this.videoComponentImpl.analyticsComponentApi.getPerformanceTrackerDelegate();
                        j.c(performanceTrackerDelegate);
                        return (T) new VideoPerfMetricsManagerImpl(cacheTransferInfoProvider, performanceTrackerDelegate, (VideoPerfMetricsManagerHelper) this.videoComponentImpl.bindVideoPerfMetricsHelperProvider.get());
                    case 9:
                        return (T) new CacheTransferListener((VideoPerfMetricsManagerHelper) this.videoComponentImpl.bindVideoPerfMetricsHelperProvider.get());
                    case 10:
                        return (T) new PlayerLoggerImpl();
                    case 11:
                        return (T) new PlayerPoolManagerImpl((PlayerPoolStorage) this.videoComponentImpl.bindPlayerPoolStorageProvider.get());
                    case 12:
                        PoolPlayerFactory poolPlayerFactory = (PoolPlayerFactory) this.videoComponentImpl.poolPlayerFactoryProvider.get();
                        FeatureService featureService2 = this.videoComponentImpl.networkComponentApi.getFeatureService();
                        j.c(featureService2);
                        return (T) new PlayerPoolStorageImpl(poolPlayerFactory, featureService2, (PlayerLogger) this.videoComponentImpl.bindPlayerLoggerProvider.get());
                    case 13:
                        Context context4 = this.videoComponentImpl.contextComponentDependencies.getContext();
                        j.c(context4);
                        AudioRequestService audioRequestService2 = (AudioRequestService) this.videoComponentImpl.bindAudioRequestServiceProvider.get();
                        PlayerPreferences playerPreferences2 = (PlayerPreferences) this.videoComponentImpl.bindPlayerPreferencesProvider.get();
                        VideoWidgetNamesHolder videoWidgetNamesHolder2 = (VideoWidgetNamesHolder) this.videoComponentImpl.videoWidgetNamesHolderProvider.get();
                        f placeholderTimeHandler2 = this.videoComponentImpl.imagesAnalyticsComponentApi.getPlaceholderTimeHandler();
                        j.c(placeholderTimeHandler2);
                        FeatureService featureService3 = this.videoComponentImpl.networkComponentApi.getFeatureService();
                        j.c(featureService3);
                        VideoDomainReplacementService videoDomainReplacementService2 = (VideoDomainReplacementService) this.videoComponentImpl.bindVideoDomainReplacementServiceProvider.get();
                        Sg.a analyticsScreenStorage2 = this.videoComponentImpl.analyticsScreenStorageComponentApi.getAnalyticsScreenStorage();
                        j.c(analyticsScreenStorage2);
                        return (T) new PoolPlayerFactory(context4, audioRequestService2, playerPreferences2, videoWidgetNamesHolder2, placeholderTimeHandler2, featureService3, videoDomainReplacementService2, analyticsScreenStorage2, (PlaybackAnalyticsSender) this.videoComponentImpl.playbackAnalyticsSenderProvider.get(), (VideoPerfMetricsManager) this.videoComponentImpl.bindVideoPerfMetricsManagerProvider.get(), (VideoPerfMetricsManagerHelper) this.videoComponentImpl.bindVideoPerfMetricsHelperProvider.get(), (PlayerLogger) this.videoComponentImpl.bindPlayerLoggerProvider.get());
                    case 14:
                        Context context5 = this.videoComponentImpl.contextComponentDependencies.getContext();
                        j.c(context5);
                        FeatureChecker featureChecker3 = this.videoComponentImpl.networkComponentApi.getFeatureChecker();
                        j.c(featureChecker3);
                        return (T) new ExoManagerLiveImpl(context5, featureChecker3, (E) this.videoComponentImpl.provideOkHttpClientProvider.get(), (VideoPerfMetricsManager) this.videoComponentImpl.bindVideoPerfMetricsManagerProvider.get());
                    case 15:
                        C9067a networkInfoProvider2 = this.videoComponentImpl.networkComponentApi.getNetworkInfoProvider();
                        j.c(networkInfoProvider2);
                        PerformanceTrackerDelegate performanceTrackerDelegate2 = this.videoComponentImpl.analyticsComponentApi.getPerformanceTrackerDelegate();
                        j.c(performanceTrackerDelegate2);
                        FeatureChecker featureChecker4 = this.videoComponentImpl.networkComponentApi.getFeatureChecker();
                        j.c(featureChecker4);
                        VideoPerfMetricsManager videoPerfMetricsManager = (VideoPerfMetricsManager) this.videoComponentImpl.bindVideoPerfMetricsManagerProvider.get();
                        CronetOkHttpClientProvider cronetOkHttpClientProvider = this.videoComponentImpl.networkComponentApi.getCronetOkHttpClientProvider();
                        j.c(cronetOkHttpClientProvider);
                        CronetConfig cronetConfig = (CronetConfig) this.videoComponentImpl.providerCronetConfigProvider.get();
                        VideoCronetMetricListener videoCronetMetricListener = (VideoCronetMetricListener) this.videoComponentImpl.videoCronetMetricListenerProvider.get();
                        InterfaceC6369b ozonTracker = this.videoComponentImpl.analyticsComponentApi.getOzonTracker();
                        j.c(ozonTracker);
                        c ozonLimbDiStore = this.videoComponentImpl.limb2ComponentApi.getOzonLimbDiStore();
                        j.c(ozonLimbDiStore);
                        return (T) VideoModule_Companion_ProvideOkHttpClientFactory.provideOkHttpClient(networkInfoProvider2, performanceTrackerDelegate2, featureChecker4, videoPerfMetricsManager, cronetOkHttpClientProvider, cronetConfig, videoCronetMetricListener, ozonTracker, ozonLimbDiStore);
                    case 16:
                        return (T) VideoModule_Companion_ProviderCronetConfigFactory.providerCronetConfig();
                    case 17:
                        VideoPerfMetricsManager videoPerfMetricsManager2 = (VideoPerfMetricsManager) this.videoComponentImpl.bindVideoPerfMetricsManagerProvider.get();
                        PerformanceTrackerDelegate performanceTrackerDelegate3 = this.videoComponentImpl.analyticsComponentApi.getPerformanceTrackerDelegate();
                        j.c(performanceTrackerDelegate3);
                        return (T) new VideoCronetMetricListener(videoPerfMetricsManager2, performanceTrackerDelegate3, (CronetConfig) this.videoComponentImpl.providerCronetConfigProvider.get());
                    case 18:
                        Context context6 = this.videoComponentImpl.contextComponentDependencies.getContext();
                        j.c(context6);
                        VideoDomainReplacementService videoDomainReplacementService3 = (VideoDomainReplacementService) this.videoComponentImpl.bindVideoDomainReplacementServiceProvider.get();
                        FeatureChecker featureChecker5 = this.videoComponentImpl.networkComponentApi.getFeatureChecker();
                        j.c(featureChecker5);
                        return (T) new ExoManagerWithCacheImpl(context6, videoDomainReplacementService3, featureChecker5, (E) this.videoComponentImpl.provideOkHttpClientProvider.get(), (VideoPerfMetricsManager) this.videoComponentImpl.bindVideoPerfMetricsManagerProvider.get(), (InterfaceC8635b) this.videoComponentImpl.provideDatabaseProvider.get(), (CacheTransferInfoProvider) this.videoComponentImpl.bindCacheTransferListenerProvider.get());
                    case 19:
                        Context context7 = this.videoComponentImpl.contextComponentDependencies.getContext();
                        j.c(context7);
                        return (T) VideoModule_Companion_ProvideDatabaseProviderFactory.provideDatabaseProvider(context7);
                    case 20:
                        Context context8 = this.videoComponentImpl.contextComponentDependencies.getContext();
                        j.c(context8);
                        InterfaceC8635b interfaceC8635b = (InterfaceC8635b) this.videoComponentImpl.provideDatabaseProvider.get();
                        E e11 = (E) this.videoComponentImpl.provideOkHttpClientProvider.get();
                        FeatureService featureService4 = this.videoComponentImpl.networkComponentApi.getFeatureService();
                        j.c(featureService4);
                        return (T) new ProgressiveExoManagerImpl(context8, interfaceC8635b, e11, featureService4, (VideoPerfMetricsManager) this.videoComponentImpl.bindVideoPerfMetricsManagerProvider.get(), (CacheTransferInfoProvider) this.videoComponentImpl.bindCacheTransferListenerProvider.get(), (VideoDomainReplacementService) this.videoComponentImpl.bindVideoDomainReplacementServiceProvider.get());
                    case 21:
                        Context context9 = this.videoComponentImpl.contextComponentDependencies.getContext();
                        j.c(context9);
                        InterfaceC8635b interfaceC8635b2 = (InterfaceC8635b) this.videoComponentImpl.provideDatabaseProvider.get();
                        E e12 = (E) this.videoComponentImpl.provideOkHttpClientProvider.get();
                        FeatureService featureService5 = this.videoComponentImpl.networkComponentApi.getFeatureService();
                        j.c(featureService5);
                        return (T) new ProgressiveWithCacheExoManagerImpl(context9, interfaceC8635b2, e12, featureService5, (VideoPerfMetricsManager) this.videoComponentImpl.bindVideoPerfMetricsManagerProvider.get(), (CacheTransferInfoProvider) this.videoComponentImpl.bindCacheTransferListenerProvider.get(), (VideoDomainReplacementService) this.videoComponentImpl.bindVideoDomainReplacementServiceProvider.get());
                    case 22:
                        return (T) new SoundServiceImpl(this.videoComponentImpl.soundContentObserver());
                    case 23:
                        return (T) new PlayerPreloaderImpl((VideoController) this.videoComponentImpl.bindVideoControllerProvider.get(), (ProgressiveExoManager) this.videoComponentImpl.bindProgressiveExoManagerProvider.get(), (ExoManagerLive) this.videoComponentImpl.bindExoManagerLiveProvider.get());
                    default:
                        throw new AssertionError(this.f94583id);
                }
            }
        }

        /* synthetic */ VideoComponentImpl(ContextComponentDependencies contextComponentDependencies, AnalyticsComponentApi analyticsComponentApi, NetworkComponentApi networkComponentApi, CdnVideoComponentApi cdnVideoComponentApi, ImagesAnalyticsComponentApi imagesAnalyticsComponentApi, AnalyticsScreenStorageComponentApi analyticsScreenStorageComponentApi, Limb2ComponentApi limb2ComponentApi, int i11) {
            this(contextComponentDependencies, analyticsComponentApi, networkComponentApi, cdnVideoComponentApi, imagesAnalyticsComponentApi, analyticsScreenStorageComponentApi, limb2ComponentApi);
        }

        private void initialize(ContextComponentDependencies contextComponentDependencies, AnalyticsComponentApi analyticsComponentApi, NetworkComponentApi networkComponentApi, CdnVideoComponentApi cdnVideoComponentApi, ImagesAnalyticsComponentApi imagesAnalyticsComponentApi, AnalyticsScreenStorageComponentApi analyticsScreenStorageComponentApi, Limb2ComponentApi limb2ComponentApi) {
            SwitchingProvider switchingProvider = new SwitchingProvider(this.videoComponentImpl, 2);
            this.audioRequestServiceImplProvider = switchingProvider;
            this.bindAudioRequestServiceProvider = d.b(switchingProvider);
            SwitchingProvider switchingProvider2 = new SwitchingProvider(this.videoComponentImpl, 3);
            this.playerPreferencesImplProvider = switchingProvider2;
            this.bindPlayerPreferencesProvider = d.b(switchingProvider2);
            this.videoWidgetNamesHolderProvider = d.b(new SwitchingProvider(this.videoComponentImpl, 4));
            SwitchingProvider switchingProvider3 = new SwitchingProvider(this.videoComponentImpl, 5);
            this.videoDomainReplacementServiceImplProvider = switchingProvider3;
            this.bindVideoDomainReplacementServiceProvider = d.b(switchingProvider3);
            SwitchingProvider switchingProvider4 = new SwitchingProvider(this.videoComponentImpl, 6);
            this.videoPerfMetricsManagerHelperImplProvider = switchingProvider4;
            this.bindVideoPerfMetricsHelperProvider = d.b(switchingProvider4);
            this.playbackAnalyticsSenderProvider = d.b(new SwitchingProvider(this.videoComponentImpl, 7));
            SwitchingProvider switchingProvider5 = new SwitchingProvider(this.videoComponentImpl, 9);
            this.cacheTransferListenerProvider = switchingProvider5;
            this.bindCacheTransferListenerProvider = d.b(switchingProvider5);
            SwitchingProvider switchingProvider6 = new SwitchingProvider(this.videoComponentImpl, 8);
            this.videoPerfMetricsManagerImplProvider = switchingProvider6;
            this.bindVideoPerfMetricsManagerProvider = d.b(switchingProvider6);
            SwitchingProvider switchingProvider7 = new SwitchingProvider(this.videoComponentImpl, 10);
            this.playerLoggerImplProvider = switchingProvider7;
            this.bindPlayerLoggerProvider = d.b(switchingProvider7);
            this.singleInstanceFactoryProvider = d.b(new SwitchingProvider(this.videoComponentImpl, 1));
            this.poolPlayerFactoryProvider = d.b(new SwitchingProvider(this.videoComponentImpl, 13));
            SwitchingProvider switchingProvider8 = new SwitchingProvider(this.videoComponentImpl, 12);
            this.playerPoolStorageImplProvider = switchingProvider8;
            this.bindPlayerPoolStorageProvider = d.b(switchingProvider8);
            SwitchingProvider switchingProvider9 = new SwitchingProvider(this.videoComponentImpl, 11);
            this.playerPoolManagerImplProvider = switchingProvider9;
            this.bindPlayerPoolManagerProvider = d.b(switchingProvider9);
            this.providerCronetConfigProvider = d.b(new SwitchingProvider(this.videoComponentImpl, 16));
            this.videoCronetMetricListenerProvider = d.b(new SwitchingProvider(this.videoComponentImpl, 17));
            this.provideOkHttpClientProvider = d.b(new SwitchingProvider(this.videoComponentImpl, 15));
            SwitchingProvider switchingProvider10 = new SwitchingProvider(this.videoComponentImpl, 14);
            this.exoManagerLiveImplProvider = switchingProvider10;
            this.bindExoManagerLiveProvider = d.b(switchingProvider10);
            this.provideDatabaseProvider = d.b(new SwitchingProvider(this.videoComponentImpl, 19));
            SwitchingProvider switchingProvider11 = new SwitchingProvider(this.videoComponentImpl, 18);
            this.exoManagerWithCacheImplProvider = switchingProvider11;
            this.bindExoManagerWithCacheProvider = d.b(switchingProvider11);
            SwitchingProvider switchingProvider12 = new SwitchingProvider(this.videoComponentImpl, 20);
            this.progressiveExoManagerImplProvider = switchingProvider12;
            this.bindProgressiveExoManagerProvider = d.b(switchingProvider12);
            SwitchingProvider switchingProvider13 = new SwitchingProvider(this.videoComponentImpl, 21);
            this.progressiveWithCacheExoManagerImplProvider = switchingProvider13;
            this.bindProgressiveWithCacheExoManagerProvider = d.b(switchingProvider13);
            SwitchingProvider switchingProvider14 = new SwitchingProvider(this.videoComponentImpl, 0);
            this.videoControllerImplProvider = switchingProvider14;
            this.bindVideoControllerProvider = d.b(switchingProvider14);
            SwitchingProvider switchingProvider15 = new SwitchingProvider(this.videoComponentImpl, 22);
            this.soundServiceImplProvider = switchingProvider15;
            this.bindSoundServiceProvider = d.b(switchingProvider15);
            SwitchingProvider switchingProvider16 = new SwitchingProvider(this.videoComponentImpl, 23);
            this.playerPreloaderImplProvider = switchingProvider16;
            this.bindPlayerPreloaderProvider = d.b(switchingProvider16);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public SoundContentObserver soundContentObserver() {
            Context context = this.contextComponentDependencies.getContext();
            j.c(context);
            return new SoundContentObserver(context);
        }

        @Override // ru.ozon.app.android.video.di.VideoComponentApi
        public PlayerPreferences getPlayerPreferences() {
            return this.bindPlayerPreferencesProvider.get();
        }

        @Override // ru.ozon.app.android.video.di.VideoComponentApi
        public PlayerPreloader getPlayerPreloader() {
            return this.bindPlayerPreloaderProvider.get();
        }

        @Override // ru.ozon.app.android.video.di.VideoComponentApi
        public SoundService getSoundService() {
            return this.bindSoundServiceProvider.get();
        }

        @Override // ru.ozon.app.android.video.di.VideoComponentApi
        public VideoController getVideoController() {
            return this.bindVideoControllerProvider.get();
        }

        private VideoComponentImpl(ContextComponentDependencies contextComponentDependencies, AnalyticsComponentApi analyticsComponentApi, NetworkComponentApi networkComponentApi, CdnVideoComponentApi cdnVideoComponentApi, ImagesAnalyticsComponentApi imagesAnalyticsComponentApi, AnalyticsScreenStorageComponentApi analyticsScreenStorageComponentApi, Limb2ComponentApi limb2ComponentApi) {
            this.videoComponentImpl = this;
            this.contextComponentDependencies = contextComponentDependencies;
            this.imagesAnalyticsComponentApi = imagesAnalyticsComponentApi;
            this.networkComponentApi = networkComponentApi;
            this.cdnVideoComponentApi = cdnVideoComponentApi;
            this.analyticsScreenStorageComponentApi = analyticsScreenStorageComponentApi;
            this.analyticsComponentApi = analyticsComponentApi;
            this.limb2ComponentApi = limb2ComponentApi;
            initialize(contextComponentDependencies, analyticsComponentApi, networkComponentApi, cdnVideoComponentApi, imagesAnalyticsComponentApi, analyticsScreenStorageComponentApi, limb2ComponentApi);
        }
    }

    public static VideoComponent.Factory factory() {
        return new Factory(0);
    }
}
