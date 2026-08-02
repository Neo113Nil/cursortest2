package ru.ozon.app.android.videocover;

import Jb.e;
import Pc.a;
import ru.ozon.app.android.video.playerV2.videoController.VideoController;

/* loaded from: classes7.dex */
public final class VideoTileDelegate_Factory implements e<VideoTileDelegate> {
    private final a<VideoController> videoControllerProvider;
    private final a<ContinuousScrollStateListener> widgetsScrollStateListenerProvider;

    public VideoTileDelegate_Factory(a<VideoController> aVar, a<ContinuousScrollStateListener> aVar2) {
        this.videoControllerProvider = aVar;
        this.widgetsScrollStateListenerProvider = aVar2;
    }

    public static VideoTileDelegate_Factory create(a<VideoController> aVar, a<ContinuousScrollStateListener> aVar2) {
        return new VideoTileDelegate_Factory(aVar, aVar2);
    }

    public static VideoTileDelegate newInstance(VideoController videoController, ContinuousScrollStateListener continuousScrollStateListener) {
        return new VideoTileDelegate(videoController, continuousScrollStateListener);
    }

    @Override // Pc.a
    public VideoTileDelegate get() {
        return newInstance(this.videoControllerProvider.get(), this.widgetsScrollStateListenerProvider.get());
    }
}
