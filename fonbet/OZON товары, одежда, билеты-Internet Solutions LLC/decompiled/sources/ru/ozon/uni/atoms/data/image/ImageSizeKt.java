package ru.ozon.uni.atoms.data.image;

import hd.C6915b;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.pikazon.image.ImageSize;
import ru.ozon.uni.android.uikit.extensions.ResourceExtKt;
import ru.ozon.uni.atoms.data.image.ImageDTO;

@Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u001a\f\u0010\u0000\u001a\u0004\u0018\u00010\u0001*\u00020\u0002¨\u0006\u0003"}, d2 = {"getImageSize", "Lru/ozon/app/android/pikazon/image/ImageSize;", "Lru/ozon/uni/atoms/data/image/ImageDTO;", "uni_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class ImageSizeKt {
    public static final ImageSize getImageSize(@NotNull ImageDTO imageDTO) {
        Intrinsics.checkNotNullParameter(imageDTO, "<this>");
        if (imageDTO.getImageType() != ImageDTO.ImageType.FIX) {
            return null;
        }
        Integer imageWidth = imageDTO.getImageWidth();
        int px = ResourceExtKt.toPx(imageWidth != null ? imageWidth.intValue() : 168);
        ImageAspectRatio aspectRatio = imageDTO.getAspectRatio();
        if (aspectRatio == null) {
            aspectRatio = ImageAspectRatio.RATIO_1_1;
        }
        return new ImageSize(px, C6915b.c(px * (aspectRatio.getHeightRatio() / aspectRatio.getWidthRatio())));
    }
}
