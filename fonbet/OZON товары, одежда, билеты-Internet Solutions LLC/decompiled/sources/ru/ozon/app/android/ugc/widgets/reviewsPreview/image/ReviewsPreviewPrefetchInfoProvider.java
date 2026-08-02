package ru.ozon.app.android.ugc.widgets.reviewsPreview.image;

import android.content.Context;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.pdp.utils.Dimens;
import ru.ozon.app.android.pikazon.image.ImageSize;
import ru.ozon.app.android.pikazon.preload.ImagePrefetchInfoProvider;
import ru.ozon.app.android.ugc.widgets.reviewsPreview.data.ReviewsPreviewVO;
import ru.ozon.uni.android.uikit.extensions.ResourceExtKt;
import ru.ozon.uni.atoms.data.image.ImageAspectRatio;

@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\nH\u0016J\u0012\u0010\u000b\u001a\u0004\u0018\u00010\f2\u0006\u0010\b\u001a\u00020\u0002H\u0016R\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\r"}, d2 = {"Lru/ozon/app/android/ugc/widgets/reviewsPreview/image/ReviewsPreviewPrefetchInfoProvider;", "Lru/ozon/app/android/pikazon/preload/ImagePrefetchInfoProvider;", "Lru/ozon/app/android/ugc/widgets/reviewsPreview/data/ReviewsPreviewVO$ReviewsPreviewImageVO;", "<init>", "()V", "imageSize", "Lru/ozon/app/android/pikazon/image/ImageSize;", "getSize", "item", "context", "Landroid/content/Context;", "getUrl", "", "ugc_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class ReviewsPreviewPrefetchInfoProvider implements ImagePrefetchInfoProvider<ReviewsPreviewVO.ReviewsPreviewImageVO> {
    private ImageSize imageSize;

    @Override // ru.ozon.app.android.pikazon.preload.ImagePrefetchInfoProvider
    @NotNull
    public ImageSize getSize(@NotNull ReviewsPreviewVO.ReviewsPreviewImageVO item, @NotNull Context context) {
        Intrinsics.checkNotNullParameter(item, "item");
        Intrinsics.checkNotNullParameter(context, "context");
        ImageSize imageSize = this.imageSize;
        if (imageSize != null) {
            return imageSize;
        }
        ImageAspectRatio imageAspectRatio = ImageAspectRatio.RATIO_2_3;
        int intValue = (ResourceExtKt.getDisplaySizePx(context).e().intValue() / 2) - Dimens.INSTANCE.getDP_12();
        ImageSize imageSize2 = new ImageSize(intValue, (imageAspectRatio.getHeightRatio() * intValue) / imageAspectRatio.getWidthRatio());
        this.imageSize = imageSize2;
        return imageSize2;
    }

    @Override // ru.ozon.app.android.pikazon.preload.ImagePrefetchInfoProvider
    public String getUrl(@NotNull ReviewsPreviewVO.ReviewsPreviewImageVO item) {
        Intrinsics.checkNotNullParameter(item, "item");
        return item.getImage().getImage();
    }
}
