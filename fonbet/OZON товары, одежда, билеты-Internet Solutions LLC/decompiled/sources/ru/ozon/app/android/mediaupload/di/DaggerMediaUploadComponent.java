package ru.ozon.app.android.mediaupload.di;

import Jb.d;
import Jb.j;
import Jb.m;
import Pc.a;
import We.E;
import android.content.Context;
import android.net.Uri;
import retrofit2.Retrofit;
import ru.ozon.app.android.analytics.screen.storage.di.AnalyticsScreenStorageComponentApi;
import ru.ozon.app.android.di.provider.component.ContextComponentDependencies;
import ru.ozon.app.android.mediaupload.di.MediaUploadComponent;
import ru.ozon.app.android.mediaupload.di.factory.ChunksUploaderFactory;
import ru.ozon.app.android.mediaupload.di.modules.ImageUploadModule_Companion_ProvideUploadImageApiFactory;
import ru.ozon.app.android.mediaupload.di.modules.VideoUploadModule_Companion_ProvideCoreHostsFactory;
import ru.ozon.app.android.mediaupload.di.modules.VideoUploadModule_Companion_ProvidePDPHostsFactory;
import ru.ozon.app.android.mediaupload.di.modules.VideoUploadModule_Companion_ProvideUploadingOkHttpFactory;
import ru.ozon.app.android.mediaupload.di.modules.VideoUploadModule_Companion_ProvideVideoUploadingApiFactory;
import ru.ozon.app.android.mediaupload.di.modules.VideoUploadModule_Companion_ProvideVideoUploadingBaseHttpUrlFactory;
import ru.ozon.app.android.mediaupload.di.modules.VideoUploadModule_Companion_ProvideVideoUploadingBaseWsUrlFactory;
import ru.ozon.app.android.mediaupload.di.modules.VideoUploadModule_Companion_ProvideVideoUploadingComposerApiFactory;
import ru.ozon.app.android.mediaupload.di.modules.VideoUploadModule_Companion_ProvideVideoUploadingMetricsApiFactory;
import ru.ozon.app.android.mediaupload.di.modules.VideoUploadModule_Companion_ProvideVideoUploadingMetricsBaseHttpUrlFactory;
import ru.ozon.app.android.mediaupload.hosts.PDPHosts;
import ru.ozon.app.android.mediaupload.image.data.UploadImageApi;
import ru.ozon.app.android.mediaupload.image.data.UploadImageRepositoryImpl;
import ru.ozon.app.android.mediaupload.image.domain.UploadImageRepository;
import ru.ozon.app.android.mediaupload.image.domain.UploadImageUseCase;
import ru.ozon.app.android.mediaupload.image.domain.UploadImageUseCaseImpl;
import ru.ozon.app.android.mediaupload.image.domain.UploadedImageFromDTOMapper;
import ru.ozon.app.android.mediaupload.image.domain.UploadedImageFromDTOMapperImpl;
import ru.ozon.app.android.mediaupload.networkStateMonitor.NetworkStateMonitor;
import ru.ozon.app.android.mediaupload.video.VideoNetworkDataStore;
import ru.ozon.app.android.mediaupload.video.VideoUploadRepository;
import ru.ozon.app.android.mediaupload.video.VideoUploadRepositoryImpl;
import ru.ozon.app.android.mediaupload.video.api.VideoUploadingApi;
import ru.ozon.app.android.mediaupload.video.api.VideoUploadingComposerApi;
import ru.ozon.app.android.mediaupload.video.api.VideoUploadingMetricsApi;
import ru.ozon.app.android.mediaupload.video.chunks.ChunksUploader;
import ru.ozon.app.android.mediaupload.video.metrics.manager.VideoUploadMetricsManager;
import ru.ozon.app.android.mediaupload.video.metrics.manager.VideoUploadMetricsManagerImpl;
import ru.ozon.app.android.mediaupload.video.validation.VideoValidationWebSocket;
import ru.ozon.app.android.network.abtool.FeatureChecker;
import ru.ozon.app.android.network.abtool.FeatureService;
import ru.ozon.app.android.network.di.NetworkComponentApi;
import ru.ozon.app.android.network.gnc.GncOkHttpClientBuilder;
import ru.ozon.app.android.network.version.AppVersionService;
import ru.ozon.app.android.network.websockets.OzonWebSocketFactory;
import ru.ozon.app.android.platform.di.AndroidPlatformComponentDependencies;
import ru.ozon.app.android.storage.di.StorageComponentApi;
import ru.ozon.app.android.storage.environment.EnvironmentService;
import ru.ozon.app.android.storage.hosts.CoreHosts;
import ru.ozon.app.android.utils.AppType;

/* loaded from: classes6.dex */
public final class DaggerMediaUploadComponent {

    private static final class Factory implements MediaUploadComponent.Factory {
        /* synthetic */ Factory(int i11) {
            this();
        }

        @Override // ru.ozon.app.android.mediaupload.di.MediaUploadComponent.Factory
        public MediaUploadComponent create(NetworkComponentApi networkComponentApi, ContextComponentDependencies contextComponentDependencies, AnalyticsScreenStorageComponentApi analyticsScreenStorageComponentApi, StorageComponentApi storageComponentApi, AndroidPlatformComponentDependencies androidPlatformComponentDependencies) {
            networkComponentApi.getClass();
            contextComponentDependencies.getClass();
            analyticsScreenStorageComponentApi.getClass();
            storageComponentApi.getClass();
            androidPlatformComponentDependencies.getClass();
            return new MediaUploadComponentImpl(networkComponentApi, contextComponentDependencies, analyticsScreenStorageComponentApi, storageComponentApi, androidPlatformComponentDependencies, 0);
        }

        private Factory() {
        }
    }

    private static final class MediaUploadComponentImpl implements MediaUploadComponent {
        private final AnalyticsScreenStorageComponentApi analyticsScreenStorageComponentApi;
        private final AndroidPlatformComponentDependencies androidPlatformComponentDependencies;
        private a<UploadedImageFromDTOMapper> bindUploadImageFromDTOMapperProvider;
        private a<UploadImageRepository> bindUploadImageRepositoryProvider;
        private a<UploadImageUseCase> bindUploadImageUseCaseProvider;
        private a<VideoUploadMetricsManager> bindVideoUploadMetricsManagerProvider;
        private a<VideoUploadRepository> bindVideoUploadingRepositoryProvider;
        private a<ChunksUploaderFactory> chunksUploaderFactoryProvider;
        private final ContextComponentDependencies contextComponentDependencies;
        private a<EnvironmentService> getEnvironmentServiceProvider;
        private final MediaUploadComponentImpl mediaUploadComponentImpl;
        private final NetworkComponentApi networkComponentApi;
        private a<CoreHosts> provideCoreHostsProvider;
        private a<PDPHosts> providePDPHostsProvider;
        private a<UploadImageApi> provideUploadImageApiProvider;
        private a<E> provideUploadingOkHttpProvider;
        private a<VideoUploadingApi> provideVideoUploadingApiProvider;
        private a<String> provideVideoUploadingBaseHttpUrlProvider;
        private a<String> provideVideoUploadingBaseWsUrlProvider;
        private a<VideoUploadingComposerApi> provideVideoUploadingComposerApiProvider;
        private a<VideoUploadingMetricsApi> provideVideoUploadingMetricsApiProvider;
        private a<String> provideVideoUploadingMetricsBaseHttpUrlProvider;
        private final StorageComponentApi storageComponentApi;
        private a<UploadImageRepositoryImpl> uploadImageRepositoryImplProvider;
        private a<UploadImageUseCaseImpl> uploadImageUseCaseImplProvider;
        private a<UploadedImageFromDTOMapperImpl> uploadedImageFromDTOMapperImplProvider;
        private a<VideoUploadMetricsManagerImpl> videoUploadMetricsManagerImplProvider;
        private a<VideoUploadRepositoryImpl> videoUploadRepositoryImplProvider;
        private a<VideoValidationWebSocket> videoValidationWebSocketProvider;

        private static final class SwitchingProvider<T> implements a<T> {

            /* renamed from: id, reason: collision with root package name */
            private final int f92905id;
            private final MediaUploadComponentImpl mediaUploadComponentImpl;

            SwitchingProvider(MediaUploadComponentImpl mediaUploadComponentImpl, int i11) {
                this.mediaUploadComponentImpl = mediaUploadComponentImpl;
                this.f92905id = i11;
            }

            @Override // Pc.a
            public T get() {
                switch (this.f92905id) {
                    case 0:
                        return (T) new UploadImageUseCaseImpl((UploadImageRepository) this.mediaUploadComponentImpl.bindUploadImageRepositoryProvider.get(), (UploadedImageFromDTOMapper) this.mediaUploadComponentImpl.bindUploadImageFromDTOMapperProvider.get());
                    case 1:
                        return (T) new UploadImageRepositoryImpl((UploadImageApi) this.mediaUploadComponentImpl.provideUploadImageApiProvider.get());
                    case 2:
                        Retrofit retrofit = this.mediaUploadComponentImpl.networkComponentApi.getRetrofit();
                        j.c(retrofit);
                        return (T) ImageUploadModule_Companion_ProvideUploadImageApiFactory.provideUploadImageApi(retrofit);
                    case 3:
                        return (T) new UploadedImageFromDTOMapperImpl();
                    case 4:
                        return (T) new VideoUploadRepositoryImpl(this.mediaUploadComponentImpl.videoNetworkDataStore(), this.mediaUploadComponentImpl.networkStateMonitor(), (VideoUploadMetricsManager) this.mediaUploadComponentImpl.bindVideoUploadMetricsManagerProvider.get());
                    case 5:
                        Retrofit retrofit3 = this.mediaUploadComponentImpl.networkComponentApi.getRetrofit();
                        j.c(retrofit3);
                        return (T) VideoUploadModule_Companion_ProvideVideoUploadingComposerApiFactory.provideVideoUploadingComposerApi(retrofit3);
                    case 6:
                        OzonWebSocketFactory ozonWebSocketFactory = this.mediaUploadComponentImpl.networkComponentApi.getOzonWebSocketFactory();
                        j.c(ozonWebSocketFactory);
                        String str = (String) this.mediaUploadComponentImpl.provideVideoUploadingBaseWsUrlProvider.get();
                        FeatureService featureService = this.mediaUploadComponentImpl.networkComponentApi.getFeatureService();
                        j.c(featureService);
                        return (T) new VideoValidationWebSocket(ozonWebSocketFactory, str, featureService);
                    case 7:
                        return (T) VideoUploadModule_Companion_ProvideVideoUploadingBaseWsUrlFactory.provideVideoUploadingBaseWsUrl((PDPHosts) this.mediaUploadComponentImpl.providePDPHostsProvider.get());
                    case 8:
                        return (T) VideoUploadModule_Companion_ProvidePDPHostsFactory.providePDPHosts((CoreHosts) this.mediaUploadComponentImpl.provideCoreHostsProvider.get());
                    case 9:
                        Ib.a a11 = d.a(this.mediaUploadComponentImpl.getEnvironmentServiceProvider);
                        AppType appType = this.mediaUploadComponentImpl.androidPlatformComponentDependencies.getAppType();
                        j.c(appType);
                        return (T) VideoUploadModule_Companion_ProvideCoreHostsFactory.provideCoreHosts(a11, appType);
                    case 10:
                        T t2 = (T) this.mediaUploadComponentImpl.storageComponentApi.getEnvironmentService();
                        j.c(t2);
                        return t2;
                    case 11:
                        return (T) new ChunksUploaderFactory() { // from class: ru.ozon.app.android.mediaupload.di.DaggerMediaUploadComponent.MediaUploadComponentImpl.SwitchingProvider.1
                            @Override // ru.ozon.app.android.mediaupload.di.factory.ChunksUploaderFactory
                            public ChunksUploader create(String str2, String str3, Uri uri, long j11, boolean z11) {
                                VideoUploadingApi videoUploadingApi = (VideoUploadingApi) SwitchingProvider.this.mediaUploadComponentImpl.provideVideoUploadingApiProvider.get();
                                Context context = SwitchingProvider.this.mediaUploadComponentImpl.contextComponentDependencies.getContext();
                                j.c(context);
                                FeatureService featureService2 = SwitchingProvider.this.mediaUploadComponentImpl.networkComponentApi.getFeatureService();
                                j.c(featureService2);
                                return new ChunksUploader(videoUploadingApi, context, featureService2, str2, str3, uri, j11, z11);
                            }
                        };
                    case 12:
                        E e11 = (E) this.mediaUploadComponentImpl.provideUploadingOkHttpProvider.get();
                        String str2 = (String) this.mediaUploadComponentImpl.provideVideoUploadingBaseHttpUrlProvider.get();
                        Retrofit retrofit4 = this.mediaUploadComponentImpl.networkComponentApi.getRetrofit();
                        j.c(retrofit4);
                        return (T) VideoUploadModule_Companion_ProvideVideoUploadingApiFactory.provideVideoUploadingApi(e11, str2, retrofit4);
                    case 13:
                        return (T) VideoUploadModule_Companion_ProvideUploadingOkHttpFactory.provideUploadingOkHttp(this.mediaUploadComponentImpl.videoUploadingOkHttpProvider());
                    case 14:
                        Sg.a analyticsScreenStorage = this.mediaUploadComponentImpl.analyticsScreenStorageComponentApi.getAnalyticsScreenStorage();
                        j.c(analyticsScreenStorage);
                        VideoUploadingMetricsApi videoUploadingMetricsApi = (VideoUploadingMetricsApi) this.mediaUploadComponentImpl.provideVideoUploadingMetricsApiProvider.get();
                        AppVersionService appVersionService = this.mediaUploadComponentImpl.networkComponentApi.getAppVersionService();
                        j.c(appVersionService);
                        FeatureChecker featureChecker = this.mediaUploadComponentImpl.networkComponentApi.getFeatureChecker();
                        j.c(featureChecker);
                        return (T) new VideoUploadMetricsManagerImpl(analyticsScreenStorage, videoUploadingMetricsApi, appVersionService, featureChecker);
                    case 15:
                        E okHttpClient = this.mediaUploadComponentImpl.networkComponentApi.getOkHttpClient();
                        j.c(okHttpClient);
                        String str3 = (String) this.mediaUploadComponentImpl.provideVideoUploadingMetricsBaseHttpUrlProvider.get();
                        Retrofit retrofit5 = this.mediaUploadComponentImpl.networkComponentApi.getRetrofit();
                        j.c(retrofit5);
                        return (T) VideoUploadModule_Companion_ProvideVideoUploadingMetricsApiFactory.provideVideoUploadingMetricsApi(okHttpClient, str3, retrofit5);
                    case 16:
                        return (T) VideoUploadModule_Companion_ProvideVideoUploadingMetricsBaseHttpUrlFactory.provideVideoUploadingMetricsBaseHttpUrl((PDPHosts) this.mediaUploadComponentImpl.providePDPHostsProvider.get());
                    case 17:
                        return (T) VideoUploadModule_Companion_ProvideVideoUploadingBaseHttpUrlFactory.provideVideoUploadingBaseHttpUrl((PDPHosts) this.mediaUploadComponentImpl.providePDPHostsProvider.get());
                    default:
                        throw new AssertionError(this.f92905id);
                }
            }
        }

        /* synthetic */ MediaUploadComponentImpl(NetworkComponentApi networkComponentApi, ContextComponentDependencies contextComponentDependencies, AnalyticsScreenStorageComponentApi analyticsScreenStorageComponentApi, StorageComponentApi storageComponentApi, AndroidPlatformComponentDependencies androidPlatformComponentDependencies, int i11) {
            this(networkComponentApi, contextComponentDependencies, analyticsScreenStorageComponentApi, storageComponentApi, androidPlatformComponentDependencies);
        }

        private void initialize(NetworkComponentApi networkComponentApi, ContextComponentDependencies contextComponentDependencies, AnalyticsScreenStorageComponentApi analyticsScreenStorageComponentApi, StorageComponentApi storageComponentApi, AndroidPlatformComponentDependencies androidPlatformComponentDependencies) {
            this.provideUploadImageApiProvider = d.b(new SwitchingProvider(this.mediaUploadComponentImpl, 2));
            SwitchingProvider switchingProvider = new SwitchingProvider(this.mediaUploadComponentImpl, 1);
            this.uploadImageRepositoryImplProvider = switchingProvider;
            this.bindUploadImageRepositoryProvider = d.b(switchingProvider);
            SwitchingProvider switchingProvider2 = new SwitchingProvider(this.mediaUploadComponentImpl, 3);
            this.uploadedImageFromDTOMapperImplProvider = switchingProvider2;
            this.bindUploadImageFromDTOMapperProvider = d.b(switchingProvider2);
            SwitchingProvider switchingProvider3 = new SwitchingProvider(this.mediaUploadComponentImpl, 0);
            this.uploadImageUseCaseImplProvider = switchingProvider3;
            this.bindUploadImageUseCaseProvider = d.b(switchingProvider3);
            this.provideVideoUploadingComposerApiProvider = m.a(new SwitchingProvider(this.mediaUploadComponentImpl, 5));
            this.getEnvironmentServiceProvider = new SwitchingProvider(this.mediaUploadComponentImpl, 10);
            this.provideCoreHostsProvider = d.b(new SwitchingProvider(this.mediaUploadComponentImpl, 9));
            this.providePDPHostsProvider = d.b(new SwitchingProvider(this.mediaUploadComponentImpl, 8));
            this.provideVideoUploadingBaseWsUrlProvider = d.b(new SwitchingProvider(this.mediaUploadComponentImpl, 7));
            this.videoValidationWebSocketProvider = new SwitchingProvider(this.mediaUploadComponentImpl, 6);
            this.provideVideoUploadingMetricsBaseHttpUrlProvider = d.b(new SwitchingProvider(this.mediaUploadComponentImpl, 16));
            this.provideVideoUploadingMetricsApiProvider = m.a(new SwitchingProvider(this.mediaUploadComponentImpl, 15));
            SwitchingProvider switchingProvider4 = new SwitchingProvider(this.mediaUploadComponentImpl, 14);
            this.videoUploadMetricsManagerImplProvider = switchingProvider4;
            this.bindVideoUploadMetricsManagerProvider = d.b(switchingProvider4);
            this.provideUploadingOkHttpProvider = m.a(new SwitchingProvider(this.mediaUploadComponentImpl, 13));
            this.provideVideoUploadingBaseHttpUrlProvider = d.b(new SwitchingProvider(this.mediaUploadComponentImpl, 17));
            this.provideVideoUploadingApiProvider = m.a(new SwitchingProvider(this.mediaUploadComponentImpl, 12));
            this.chunksUploaderFactoryProvider = m.a(new SwitchingProvider(this.mediaUploadComponentImpl, 11));
            SwitchingProvider switchingProvider5 = new SwitchingProvider(this.mediaUploadComponentImpl, 4);
            this.videoUploadRepositoryImplProvider = switchingProvider5;
            this.bindVideoUploadingRepositoryProvider = d.b(switchingProvider5);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public NetworkStateMonitor networkStateMonitor() {
            Context context = this.contextComponentDependencies.getContext();
            j.c(context);
            return new NetworkStateMonitor(context);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public VideoNetworkDataStore videoNetworkDataStore() {
            VideoUploadingComposerApi videoUploadingComposerApi = this.provideVideoUploadingComposerApiProvider.get();
            a<VideoValidationWebSocket> aVar = this.videoValidationWebSocketProvider;
            ChunksUploaderFactory chunksUploaderFactory = this.chunksUploaderFactoryProvider.get();
            Context context = this.contextComponentDependencies.getContext();
            j.c(context);
            return new VideoNetworkDataStore(videoUploadingComposerApi, aVar, chunksUploaderFactory, context, this.bindVideoUploadMetricsManagerProvider.get());
        }

        /* JADX INFO: Access modifiers changed from: private */
        public VideoUploadingOkHttpProvider videoUploadingOkHttpProvider() {
            E okHttpClient = this.networkComponentApi.getOkHttpClient();
            j.c(okHttpClient);
            VideoUploadMetricsManager videoUploadMetricsManager = this.bindVideoUploadMetricsManagerProvider.get();
            GncOkHttpClientBuilder gncOkHttpClientBuilder = this.networkComponentApi.getGncOkHttpClientBuilder();
            j.c(gncOkHttpClientBuilder);
            FeatureChecker featureChecker = this.networkComponentApi.getFeatureChecker();
            j.c(featureChecker);
            return new VideoUploadingOkHttpProvider(okHttpClient, videoUploadMetricsManager, gncOkHttpClientBuilder, featureChecker);
        }

        @Override // ru.ozon.app.android.mediaupload.di.MediaUploadComponentApi
        public UploadImageUseCase getUploadImageUseCase() {
            return this.bindUploadImageUseCaseProvider.get();
        }

        @Override // ru.ozon.app.android.mediaupload.di.MediaUploadComponentApi
        public VideoUploadRepository getUploadVideoRepository() {
            return this.bindVideoUploadingRepositoryProvider.get();
        }

        private MediaUploadComponentImpl(NetworkComponentApi networkComponentApi, ContextComponentDependencies contextComponentDependencies, AnalyticsScreenStorageComponentApi analyticsScreenStorageComponentApi, StorageComponentApi storageComponentApi, AndroidPlatformComponentDependencies androidPlatformComponentDependencies) {
            this.mediaUploadComponentImpl = this;
            this.networkComponentApi = networkComponentApi;
            this.storageComponentApi = storageComponentApi;
            this.androidPlatformComponentDependencies = androidPlatformComponentDependencies;
            this.analyticsScreenStorageComponentApi = analyticsScreenStorageComponentApi;
            this.contextComponentDependencies = contextComponentDependencies;
            initialize(networkComponentApi, contextComponentDependencies, analyticsScreenStorageComponentApi, storageComponentApi, androidPlatformComponentDependencies);
        }
    }

    public static MediaUploadComponent.Factory factory() {
        return new Factory(0);
    }
}
