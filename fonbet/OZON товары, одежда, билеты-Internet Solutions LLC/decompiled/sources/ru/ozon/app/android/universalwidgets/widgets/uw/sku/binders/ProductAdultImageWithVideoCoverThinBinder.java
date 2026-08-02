package ru.ozon.app.android.universalwidgets.widgets.uw.sku.binders;

import android.widget.ImageView;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.account.adult.presenter.AdultHandler;
import ru.ozon.app.android.network.abtool.FeatureChecker;
import ru.ozon.app.android.video.preload.PlayerPreloader;
import ru.ozon.app.android.videocover.VideoTileDelegate;

@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B)\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0004\b\n\u0010\u000bR\u0016\u0010\f\u001a\u0004\u0018\u00010\r8TX\u0094\u0004¢\u0006\u0006\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, d2 = {"Lru/ozon/app/android/universalwidgets/widgets/uw/sku/binders/ProductAdultImageWithVideoCoverThinBinder;", "Lru/ozon/app/android/universalwidgets/widgets/uw/sku/binders/ProductAdultImageWithVideoCoverBinder;", "adultHandler", "Lru/ozon/app/android/account/adult/presenter/AdultHandler;", "featureChecker", "Lru/ozon/app/android/network/abtool/FeatureChecker;", "videoTileDelegate", "Lru/ozon/app/android/videocover/VideoTileDelegate;", "playerPreloader", "Lru/ozon/app/android/video/preload/PlayerPreloader;", "<init>", "(Lru/ozon/app/android/account/adult/presenter/AdultHandler;Lru/ozon/app/android/network/abtool/FeatureChecker;Lru/ozon/app/android/videocover/VideoTileDelegate;Lru/ozon/app/android/video/preload/PlayerPreloader;)V", "overlayImage", "Landroid/widget/ImageView;", "getOverlayImage", "()Landroid/widget/ImageView;", "universalwidgets_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class ProductAdultImageWithVideoCoverThinBinder extends ProductAdultImageWithVideoCoverBinder {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ProductAdultImageWithVideoCoverThinBinder(@NotNull AdultHandler adultHandler, @NotNull FeatureChecker featureChecker, @NotNull VideoTileDelegate videoTileDelegate, @NotNull PlayerPreloader playerPreloader) {
        super(adultHandler, featureChecker, videoTileDelegate, playerPreloader);
        Intrinsics.checkNotNullParameter(adultHandler, "adultHandler");
        Intrinsics.checkNotNullParameter(featureChecker, "featureChecker");
        Intrinsics.checkNotNullParameter(videoTileDelegate, "videoTileDelegate");
        Intrinsics.checkNotNullParameter(playerPreloader, "playerPreloader");
    }

    @Override // ru.ozon.app.android.universalwidgets.widgets.uw.sku.binders.ProductAdultImageWithVideoCoverBinder
    protected ImageView getOverlayImage() {
        return null;
    }
}
