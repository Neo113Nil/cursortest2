package ru.ozon.app.android.ads.widgets.advVideoBannerV2.di;

import Jb.j;
import Pc.a;
import WZ.l;
import android.content.Context;
import l10.InterfaceC7851b;
import ru.ozon.app.android.ads.data.pixel.PixelApiRepository;
import ru.ozon.app.android.ads.data.pixel.di.PixelRepositoryComponentApi;
import ru.ozon.app.android.ads.widgets.advVideoBannerV2.analytics.AdvVideoBannerV2TrackerAnalyticsDelegate_Factory;
import ru.ozon.app.android.ads.widgets.advVideoBannerV2.data.AdvVideoBannerV2Mapper;
import ru.ozon.app.android.ads.widgets.advVideoBannerV2.di.AdvVideoBannerV2DiComponent;
import ru.ozon.app.android.ads.widgets.advVideoBannerV2.presentation.AdvVideoBannerV2ViewModelNew;
import ru.ozon.app.android.ads.widgets.advVideoBannerV2.presentation.AdvVideoBannerV2ViewModelNew_Factory;
import ru.ozon.app.android.composer.di.composer.RetainComposerComponentApi;
import ru.ozon.app.android.di.provider.component.ContextComponentDependencies;
import ru.ozon.app.android.network.di.NetworkComponentApi;
import ru.ozon.app.android.video.di.VideoComponentApi;
import ru.ozon.app.android.video.player.playerpreferences.PlayerPreferences;
import ru.ozon.app.android.video.player.soundservice.SoundService;
import ru.ozon.app.android.video.playerV2.videoController.VideoController;
import ru.ozon.app.android.video.preload.PlayerPreloader;

/* loaded from: classes6.dex */
public final class DaggerAdvVideoBannerV2DiComponent {

    private static final class AdvVideoBannerV2DiComponentImpl implements AdvVideoBannerV2DiComponent {
        private final AdvVideoBannerV2DiComponentImpl advVideoBannerV2DiComponentImpl;
        private a<AdvVideoBannerV2ViewModelNew> advVideoBannerV2ViewModelNewProvider;
        private final ContextComponentDependencies contextComponentDependencies;
        private a<InterfaceC7851b> getComposerControllerProvider;
        private a<PixelApiRepository> getPixelRepositoryProvider;
        private a<l> getTokenizedAnalyticsProvider;
        private final NetworkComponentApi networkComponentApi;
        private final VideoComponentApi videoComponentApi;

        private static final class GetComposerControllerProvider implements a<InterfaceC7851b> {
            private final RetainComposerComponentApi retainComposerComponentApi;

            GetComposerControllerProvider(RetainComposerComponentApi retainComposerComponentApi) {
                this.retainComposerComponentApi = retainComposerComponentApi;
            }

            @Override // Pc.a
            public InterfaceC7851b get() {
                InterfaceC7851b composerController = this.retainComposerComponentApi.getComposerController();
                j.c(composerController);
                return composerController;
            }
        }

        private static final class GetPixelRepositoryProvider implements a<PixelApiRepository> {
            private final PixelRepositoryComponentApi pixelRepositoryComponentApi;

            GetPixelRepositoryProvider(PixelRepositoryComponentApi pixelRepositoryComponentApi) {
                this.pixelRepositoryComponentApi = pixelRepositoryComponentApi;
            }

            @Override // Pc.a
            public PixelApiRepository get() {
                PixelApiRepository pixelRepository = this.pixelRepositoryComponentApi.getPixelRepository();
                j.c(pixelRepository);
                return pixelRepository;
            }
        }

        private static final class GetTokenizedAnalyticsProvider implements a<l> {
            private final RetainComposerComponentApi retainComposerComponentApi;

            GetTokenizedAnalyticsProvider(RetainComposerComponentApi retainComposerComponentApi) {
                this.retainComposerComponentApi = retainComposerComponentApi;
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // Pc.a
            public l get() {
                l tokenizedAnalytics = this.retainComposerComponentApi.getTokenizedAnalytics();
                j.c(tokenizedAnalytics);
                return tokenizedAnalytics;
            }
        }

        /* synthetic */ AdvVideoBannerV2DiComponentImpl(ContextComponentDependencies contextComponentDependencies, VideoComponentApi videoComponentApi, PixelRepositoryComponentApi pixelRepositoryComponentApi, RetainComposerComponentApi retainComposerComponentApi, NetworkComponentApi networkComponentApi, int i11) {
            this(contextComponentDependencies, videoComponentApi, pixelRepositoryComponentApi, retainComposerComponentApi, networkComponentApi);
        }

        private void initialize(ContextComponentDependencies contextComponentDependencies, VideoComponentApi videoComponentApi, PixelRepositoryComponentApi pixelRepositoryComponentApi, RetainComposerComponentApi retainComposerComponentApi, NetworkComponentApi networkComponentApi) {
            this.getPixelRepositoryProvider = new GetPixelRepositoryProvider(pixelRepositoryComponentApi);
            this.getTokenizedAnalyticsProvider = new GetTokenizedAnalyticsProvider(retainComposerComponentApi);
            this.getComposerControllerProvider = new GetComposerControllerProvider(retainComposerComponentApi);
            this.advVideoBannerV2ViewModelNewProvider = AdvVideoBannerV2ViewModelNew_Factory.create(this.getPixelRepositoryProvider, AdvVideoBannerV2TrackerAnalyticsDelegate_Factory.create(), this.getTokenizedAnalyticsProvider, this.getComposerControllerProvider);
        }

        @Override // ru.ozon.app.android.ads.widgets.advVideoBannerV2.di.AdvVideoBannerV2DiComponent
        public AdvVideoBannerV2Mapper getMapper() {
            Context context = this.contextComponentDependencies.getContext();
            j.c(context);
            return new AdvVideoBannerV2Mapper(context);
        }

        @Override // ru.ozon.app.android.video.di.VideoComponentApi
        public PlayerPreferences getPlayerPreferences() {
            PlayerPreferences playerPreferences = this.videoComponentApi.getPlayerPreferences();
            j.c(playerPreferences);
            return playerPreferences;
        }

        @Override // ru.ozon.app.android.video.di.VideoComponentApi
        public PlayerPreloader getPlayerPreloader() {
            PlayerPreloader playerPreloader = this.videoComponentApi.getPlayerPreloader();
            j.c(playerPreloader);
            return playerPreloader;
        }

        @Override // ru.ozon.app.android.video.di.VideoComponentApi
        public SoundService getSoundService() {
            SoundService soundService = this.videoComponentApi.getSoundService();
            j.c(soundService);
            return soundService;
        }

        @Override // ru.ozon.app.android.video.di.VideoComponentApi
        public VideoController getVideoController() {
            VideoController videoController = this.videoComponentApi.getVideoController();
            j.c(videoController);
            return videoController;
        }

        @Override // ru.ozon.app.android.ads.widgets.advVideoBannerV2.di.AdvVideoBannerV2DiComponent
        public a<AdvVideoBannerV2ViewModelNew> getViewModelProviderNew() {
            return this.advVideoBannerV2ViewModelNewProvider;
        }

        private AdvVideoBannerV2DiComponentImpl(ContextComponentDependencies contextComponentDependencies, VideoComponentApi videoComponentApi, PixelRepositoryComponentApi pixelRepositoryComponentApi, RetainComposerComponentApi retainComposerComponentApi, NetworkComponentApi networkComponentApi) {
            this.advVideoBannerV2DiComponentImpl = this;
            this.videoComponentApi = videoComponentApi;
            this.contextComponentDependencies = contextComponentDependencies;
            this.networkComponentApi = networkComponentApi;
            initialize(contextComponentDependencies, videoComponentApi, pixelRepositoryComponentApi, retainComposerComponentApi, networkComponentApi);
        }
    }

    private static final class Factory implements AdvVideoBannerV2DiComponent.Factory {
        /* synthetic */ Factory(int i11) {
            this();
        }

        @Override // ru.ozon.app.android.ads.widgets.advVideoBannerV2.di.AdvVideoBannerV2DiComponent.Factory
        public AdvVideoBannerV2DiComponent create(ContextComponentDependencies contextComponentDependencies, VideoComponentApi videoComponentApi, PixelRepositoryComponentApi pixelRepositoryComponentApi, RetainComposerComponentApi retainComposerComponentApi, NetworkComponentApi networkComponentApi) {
            contextComponentDependencies.getClass();
            videoComponentApi.getClass();
            pixelRepositoryComponentApi.getClass();
            retainComposerComponentApi.getClass();
            networkComponentApi.getClass();
            return new AdvVideoBannerV2DiComponentImpl(contextComponentDependencies, videoComponentApi, pixelRepositoryComponentApi, retainComposerComponentApi, networkComponentApi, 0);
        }

        private Factory() {
        }
    }

    public static AdvVideoBannerV2DiComponent.Factory factory() {
        return new Factory(0);
    }
}
