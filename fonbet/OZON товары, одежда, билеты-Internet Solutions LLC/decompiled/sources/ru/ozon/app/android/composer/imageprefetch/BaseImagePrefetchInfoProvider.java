package ru.ozon.app.android.composer.imageprefetch;

import android.content.Context;
import hd.C6915b;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.pikazon.image.ImageSize;
import ru.ozon.app.android.pikazon.preload.ImagePrefetchInfoProvider;
import ru.ozon.uni.android.uikit.extensions.ResourceExtKt;
import ru.ozon.uni.atoms.data.image.ImageAspectRatio;
import ru.ozon.uni.atoms.data.image.ImageDTO;
import ru.ozon.uni.atoms.data.image.ImageSizeKt;

@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u001a\u0010\u0005\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0007\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\tH\u0016J\u0012\u0010\n\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\u0007\u001a\u00020\u0002H\u0016¨\u0006\f"}, d2 = {"Lru/ozon/app/android/composer/imageprefetch/BaseImagePrefetchInfoProvider;", "Lru/ozon/app/android/pikazon/preload/ImagePrefetchInfoProvider;", "Lru/ozon/uni/atoms/data/image/ImageDTO;", "<init>", "()V", "getSize", "Lru/ozon/app/android/pikazon/image/ImageSize;", "item", "context", "Landroid/content/Context;", "getUrl", "", "composer_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class BaseImagePrefetchInfoProvider implements ImagePrefetchInfoProvider<ImageDTO> {
    @Override // ru.ozon.app.android.pikazon.preload.ImagePrefetchInfoProvider
    public ImageSize getSize(@NotNull ImageDTO item, @NotNull Context context) {
        int px;
        int c11;
        Intrinsics.checkNotNullParameter(item, "item");
        Intrinsics.checkNotNullParameter(context, "context");
        if (item.getImageType() == ImageDTO.ImageType.FIX) {
            ImageSize imageSize = ImageSizeKt.getImageSize(item);
            if (imageSize == null) {
                return null;
            }
            px = imageSize.getWidth();
            c11 = imageSize.getHeight();
        } else {
            Integer imageWidth = item.getImageWidth();
            if (imageWidth == null) {
                return null;
            }
            px = ResourceExtKt.toPx(imageWidth.intValue(), context);
            ImageAspectRatio aspectRatio = item.getAspectRatio();
            if (aspectRatio == null) {
                aspectRatio = ImageAspectRatio.RATIO_1_1;
            }
            c11 = C6915b.c(px * (aspectRatio.getHeightRatio() / aspectRatio.getWidthRatio()));
        }
        return new ImageSize(px, c11);
    }

    @Override // ru.ozon.app.android.pikazon.preload.ImagePrefetchInfoProvider
    public String getUrl(@NotNull ImageDTO item) {
        Intrinsics.checkNotNullParameter(item, "item");
        return item.getImage();
    }
}
