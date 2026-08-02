package ru.ozon.app.android.ugc.core.widgets.reviewGalleryPreviewV2.presentation.imagePrefetch;

import com.google.android.gms.measurement.api.AppMeasurementSdk;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.pikazon.image.ImageSize;
import ru.ozon.app.android.ugc.core.widgets.reviewGalleryPreviewV2.presentation.ReviewGalleryPreviewV2VO;
import ru.ozon.uni.android.uikit.extensions.ResourceExtKt;
import ru.ozon.uni.atoms.data.image.ImageAspectRatio;

@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0001\u0018\u0000 \u00142\u00020\u00012\u00020\u0002:\u0001\u0014B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0013H\u0016R\u0014\u0010\u0005\u001a\u00020\u00068VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0007\u0010\bR\u0014\u0010\t\u001a\u00020\u00068VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\n\u0010\bR\u001e\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\f@RX\u0096\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u0015"}, d2 = {"Lru/ozon/app/android/ugc/core/widgets/reviewGalleryPreviewV2/presentation/imagePrefetch/PreviewGalleryItemSizeHolder;", "Lru/ozon/app/android/ugc/core/widgets/reviewGalleryPreviewV2/presentation/imagePrefetch/PreviewItemSizeProvider;", "Lru/ozon/app/android/ugc/core/widgets/reviewGalleryPreviewV2/presentation/imagePrefetch/PreviewItemSizeSetter;", "<init>", "()V", "itemWidth", "", "getItemWidth", "()I", "itemHeight", "getItemHeight", AppMeasurementSdk.ConditionalUserProperty.VALUE, "Lru/ozon/app/android/pikazon/image/ImageSize;", "imageSize", "getImageSize", "()Lru/ozon/app/android/pikazon/image/ImageSize;", "setupPreviewItemsSize", "", "item", "Lru/ozon/app/android/ugc/core/widgets/reviewGalleryPreviewV2/presentation/ReviewGalleryPreviewV2VO$ItemVO;", "Companion", "core_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class PreviewGalleryItemSizeHolder implements PreviewItemSizeProvider, PreviewItemSizeSetter {

    @NotNull
    private ImageSize imageSize = defaultImageSize;
    public static final int $stable = 8;

    @NotNull
    private static final ImageSize defaultImageSize = new ImageSize(0, 0);

    @Override // ru.ozon.app.android.ugc.core.widgets.reviewGalleryPreviewV2.presentation.imagePrefetch.PreviewItemSizeProvider
    @NotNull
    public ImageSize getImageSize() {
        return this.imageSize;
    }

    @Override // ru.ozon.app.android.ugc.core.widgets.reviewGalleryPreviewV2.presentation.imagePrefetch.PreviewItemSizeProvider
    public int getItemHeight() {
        return getImageSize().getHeight();
    }

    @Override // ru.ozon.app.android.ugc.core.widgets.reviewGalleryPreviewV2.presentation.imagePrefetch.PreviewItemSizeProvider
    public int getItemWidth() {
        return getImageSize().getWidth();
    }

    @Override // ru.ozon.app.android.ugc.core.widgets.reviewGalleryPreviewV2.presentation.imagePrefetch.PreviewItemSizeSetter
    public void setupPreviewItemsSize(@NotNull ReviewGalleryPreviewV2VO.ItemVO item) {
        ImageAspectRatio aspectRatio;
        Integer imageWidth;
        Intrinsics.checkNotNullParameter(item, "item");
        if (getImageSize() != defaultImageSize || (aspectRatio = item.getImage().getAspectRatio()) == null || (imageWidth = item.getImage().getImageWidth()) == null) {
            return;
        }
        int px = ResourceExtKt.toPx(imageWidth.intValue());
        this.imageSize = new ImageSize(px, (aspectRatio.getHeightRatio() * px) / aspectRatio.getWidthRatio());
    }
}
