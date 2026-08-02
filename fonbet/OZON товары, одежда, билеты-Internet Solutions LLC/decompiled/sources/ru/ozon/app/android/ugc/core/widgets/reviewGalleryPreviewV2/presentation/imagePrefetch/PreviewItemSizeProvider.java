package ru.ozon.app.android.ugc.core.widgets.reviewGalleryPreviewV2.presentation.imagePrefetch;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.pikazon.image.ImageSize;

@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0005\b`\u0018\u00002\u00020\u0001R\u0012\u0010\u0002\u001a\u00020\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005R\u0012\u0010\u0006\u001a\u00020\u0007X¦\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR\u0012\u0010\n\u001a\u00020\u0007X¦\u0004¢\u0006\u0006\u001a\u0004\b\u000b\u0010\t¨\u0006\f"}, d2 = {"Lru/ozon/app/android/ugc/core/widgets/reviewGalleryPreviewV2/presentation/imagePrefetch/PreviewItemSizeProvider;", "", "imageSize", "Lru/ozon/app/android/pikazon/image/ImageSize;", "getImageSize", "()Lru/ozon/app/android/pikazon/image/ImageSize;", "itemWidth", "", "getItemWidth", "()I", "itemHeight", "getItemHeight", "core_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public interface PreviewItemSizeProvider {
    @NotNull
    ImageSize getImageSize();

    int getItemHeight();

    int getItemWidth();
}
