package ru.ozon.app.android.cscore.orderdetails.molecule.images.presentation;

import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.tokenized.model.TokenizedTrackingInfo;
import ru.ozon.app.android.cscore.orderdetails.molecule.images.data.ImageDTO;
import ru.ozon.app.android.gallery.GalleryRequest;
import ru.ozon.uni.atoms.data.AtomActionDTO;
import ru.ozon.uni.atoms.data.controls.CommonControlSettings;
import ru.ozon.uni.atoms.data.dsBadge.BadgeDTO;
import ru.ozon.uni.atoms.data.productMedia.ProductMediaDTO;
import ru.ozon.uni.atoms.data.text.TextDTO;

@Metadata(d1 = {"\u0000*\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\u001a8\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\b\u0010\u0003\u001a\u0004\u0018\u00010\u00042\u0014\u0010\u0005\u001a\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b\u0018\u00010\u00062\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\n¨\u0006\f"}, d2 = {"toVo", "Lru/ozon/app/android/cscore/orderdetails/molecule/images/presentation/ImageVO;", "Lru/ozon/app/android/cscore/orderdetails/molecule/images/data/ImageDTO;", "action", "Lru/ozon/uni/atoms/data/AtomActionDTO;", "trackingInfo", "", "", "Lru/ozon/android/tokenized/model/TokenizedTrackingInfo;", "galleryItems", "", "Lru/ozon/app/android/gallery/GalleryRequest$GalleryItem;", "csma_prodGoogleAllVendorsRelease"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class ImageVOKt {
    @NotNull
    public static final ImageVO toVo(@NotNull ImageDTO imageDTO, AtomActionDTO atomActionDTO, Map<String, TokenizedTrackingInfo> map, @NotNull List<? extends GalleryRequest.GalleryItem> galleryItems) {
        Intrinsics.checkNotNullParameter(imageDTO, "<this>");
        Intrinsics.checkNotNullParameter(galleryItems, "galleryItems");
        ru.ozon.uni.atoms.data.image.ImageDTO image = imageDTO.getImage();
        ProductMediaDTO productMedia = imageDTO.getProductMedia();
        TextDTO counter = imageDTO.getCounter();
        Boolean isAdult = imageDTO.isAdult();
        boolean booleanValue = isAdult != null ? isAdult.booleanValue() : false;
        Boolean isTranslucent = imageDTO.isTranslucent();
        boolean booleanValue2 = isTranslucent != null ? isTranslucent.booleanValue() : false;
        BadgeDTO badge = imageDTO.getBadge();
        String blurImageUrl = imageDTO.getBlurImageUrl();
        ImageDTO.Border border = imageDTO.getBorder();
        CommonControlSettings common = imageDTO.getCommon();
        return new ImageVO(image, productMedia, counter, booleanValue, false, booleanValue2, galleryItems, badge, blurImageUrl, border, common == null ? new CommonControlSettings(atomActionDTO, map, null, 4, null) : common, 16, null);
    }
}
