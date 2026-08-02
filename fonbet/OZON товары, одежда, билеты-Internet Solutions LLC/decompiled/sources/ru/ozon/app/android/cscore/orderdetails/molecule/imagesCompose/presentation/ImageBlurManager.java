package ru.ozon.app.android.cscore.orderdetails.molecule.imagesCompose.presentation;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.C7714v;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.fresh.common.widgets.R$drawable;
import ru.ozon.uni.atoms.data.image.ImageDTO;
import ru.ozon.uni.atoms.data.productMedia.ProductMediaDTO;

@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0010\b\n\u0000\n\u0002\u0010%\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÁ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\n\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\fJ\u001a\u0010\r\u001a\u00020\u0006*\b\u0012\u0004\u0012\u00020\u00060\u00052\b\u0010\u000e\u001a\u0004\u0018\u00010\tR\u0014\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u001c\u0010\u0007\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\t\u0012\u0004\u0012\u00020\u00060\bX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u000f"}, d2 = {"Lru/ozon/app/android/cscore/orderdetails/molecule/imagesCompose/presentation/ImageBlurManager;", "", "<init>", "()V", "blurDrawableIdList", "", "", "blurCache", "", "", "getBlurImageRes", "item", "Lru/ozon/app/android/cscore/orderdetails/molecule/imagesCompose/presentation/ComposableImageVO;", "getByUrl", "imageUrl", "csma_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class ImageBlurManager {

    @NotNull
    public static final ImageBlurManager INSTANCE = new ImageBlurManager();

    @NotNull
    private static final List<Integer> blurDrawableIdList = C7714v.b0(Integer.valueOf(R$drawable.blur_gray), Integer.valueOf(R$drawable.blur_pink), Integer.valueOf(R$drawable.blur_green));

    @NotNull
    private static final Map<String, Integer> blurCache = new LinkedHashMap();
    public static final int $stable = 8;

    private ImageBlurManager() {
    }

    public final int getBlurImageRes(@NotNull ComposableImageVO item) {
        String image;
        ProductMediaDTO.Image image2;
        Intrinsics.checkNotNullParameter(item, "item");
        ProductMediaDTO productMedia = item.getProductMedia();
        if (productMedia == null || (image2 = productMedia.getImage()) == null || (image = image2.getUrl()) == null) {
            ImageDTO image3 = item.getImage();
            image = image3 != null ? image3.getImage() : null;
        }
        Map<String, Integer> map = blurCache;
        Integer num = map.get(image);
        if (num == null) {
            num = Integer.valueOf(INSTANCE.getByUrl(blurDrawableIdList, image));
            map.put(image, num);
        }
        return num.intValue();
    }

    public final int getByUrl(@NotNull List<Integer> list, String str) {
        Intrinsics.checkNotNullParameter(list, "<this>");
        return list.get(Math.abs((str != null ? str.hashCode() : 0) % list.size())).intValue();
    }
}
