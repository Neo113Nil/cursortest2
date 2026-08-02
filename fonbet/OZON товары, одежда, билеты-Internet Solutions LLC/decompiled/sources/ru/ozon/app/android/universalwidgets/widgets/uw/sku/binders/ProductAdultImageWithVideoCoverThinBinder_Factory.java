package ru.ozon.app.android.universalwidgets.widgets.uw.sku.binders;

import Jb.e;
import Pc.a;
import ru.ozon.app.android.account.adult.presenter.AdultHandler;
import ru.ozon.app.android.network.abtool.FeatureChecker;
import ru.ozon.app.android.video.preload.PlayerPreloader;
import ru.ozon.app.android.videocover.VideoTileDelegate;

/* loaded from: classes2.dex */
public final class ProductAdultImageWithVideoCoverThinBinder_Factory implements e<ProductAdultImageWithVideoCoverThinBinder> {
    private final a<AdultHandler> adultHandlerProvider;
    private final a<FeatureChecker> featureCheckerProvider;
    private final a<PlayerPreloader> playerPreloaderProvider;
    private final a<VideoTileDelegate> videoTileDelegateProvider;

    public ProductAdultImageWithVideoCoverThinBinder_Factory(a<AdultHandler> aVar, a<FeatureChecker> aVar2, a<VideoTileDelegate> aVar3, a<PlayerPreloader> aVar4) {
        this.adultHandlerProvider = aVar;
        this.featureCheckerProvider = aVar2;
        this.videoTileDelegateProvider = aVar3;
        this.playerPreloaderProvider = aVar4;
    }

    public static ProductAdultImageWithVideoCoverThinBinder_Factory create(a<AdultHandler> aVar, a<FeatureChecker> aVar2, a<VideoTileDelegate> aVar3, a<PlayerPreloader> aVar4) {
        return new ProductAdultImageWithVideoCoverThinBinder_Factory(aVar, aVar2, aVar3, aVar4);
    }

    public static ProductAdultImageWithVideoCoverThinBinder newInstance(AdultHandler adultHandler, FeatureChecker featureChecker, VideoTileDelegate videoTileDelegate, PlayerPreloader playerPreloader) {
        return new ProductAdultImageWithVideoCoverThinBinder(adultHandler, featureChecker, videoTileDelegate, playerPreloader);
    }

    @Override // Pc.a
    public ProductAdultImageWithVideoCoverThinBinder get() {
        return newInstance(this.adultHandlerProvider.get(), this.featureCheckerProvider.get(), this.videoTileDelegateProvider.get(), this.playerPreloaderProvider.get());
    }
}
