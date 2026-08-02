package ru.ozon.app.android.videocover.di;

import Jb.d;
import Jb.j;
import Pc.a;
import ru.ozon.app.android.di.provider.component.ContextComponentDependencies;
import ru.ozon.app.android.network.di.NetworkComponentApi;
import ru.ozon.app.android.video.di.VideoComponentApi;
import ru.ozon.app.android.video.playerV2.videoController.VideoController;
import ru.ozon.app.android.videocover.ContinuousScrollStateListener_Factory;
import ru.ozon.app.android.videocover.VideoTileDelegate;
import ru.ozon.app.android.videocover.VideoTileDelegate_Factory;
import ru.ozon.app.android.videocover.di.VideoCoverComponent;

/* loaded from: classes7.dex */
public final class DaggerVideoCoverComponent {

    private static final class Factory implements VideoCoverComponent.Factory {
        /* synthetic */ Factory(int i11) {
            this();
        }

        @Override // ru.ozon.app.android.videocover.di.VideoCoverComponent.Factory
        public VideoCoverComponent create(ContextComponentDependencies contextComponentDependencies, VideoComponentApi videoComponentApi, NetworkComponentApi networkComponentApi) {
            contextComponentDependencies.getClass();
            videoComponentApi.getClass();
            networkComponentApi.getClass();
            return new VideoCoverComponentImpl(contextComponentDependencies, videoComponentApi, networkComponentApi, 0);
        }

        private Factory() {
        }
    }

    private static final class VideoCoverComponentImpl implements VideoCoverComponent {
        private a<VideoController> getVideoControllerProvider;
        private final VideoCoverComponentImpl videoCoverComponentImpl;
        private a<VideoTileDelegate> videoTileDelegateProvider;

        private static final class GetVideoControllerProvider implements a<VideoController> {
            private final VideoComponentApi videoComponentApi;

            GetVideoControllerProvider(VideoComponentApi videoComponentApi) {
                this.videoComponentApi = videoComponentApi;
            }

            @Override // Pc.a
            public VideoController get() {
                VideoController videoController = this.videoComponentApi.getVideoController();
                j.c(videoController);
                return videoController;
            }
        }

        /* synthetic */ VideoCoverComponentImpl(ContextComponentDependencies contextComponentDependencies, VideoComponentApi videoComponentApi, NetworkComponentApi networkComponentApi, int i11) {
            this(contextComponentDependencies, videoComponentApi, networkComponentApi);
        }

        private void initialize(ContextComponentDependencies contextComponentDependencies, VideoComponentApi videoComponentApi, NetworkComponentApi networkComponentApi) {
            GetVideoControllerProvider getVideoControllerProvider = new GetVideoControllerProvider(videoComponentApi);
            this.getVideoControllerProvider = getVideoControllerProvider;
            this.videoTileDelegateProvider = d.b(VideoTileDelegate_Factory.create(getVideoControllerProvider, ContinuousScrollStateListener_Factory.create()));
        }

        @Override // ru.ozon.app.android.videocover.di.VideoCoverComponentApi
        public VideoTileDelegate getVideoTileDelegate() {
            return this.videoTileDelegateProvider.get();
        }

        private VideoCoverComponentImpl(ContextComponentDependencies contextComponentDependencies, VideoComponentApi videoComponentApi, NetworkComponentApi networkComponentApi) {
            this.videoCoverComponentImpl = this;
            initialize(contextComponentDependencies, videoComponentApi, networkComponentApi);
        }
    }

    public static VideoCoverComponent.Factory factory() {
        return new Factory(0);
    }
}
