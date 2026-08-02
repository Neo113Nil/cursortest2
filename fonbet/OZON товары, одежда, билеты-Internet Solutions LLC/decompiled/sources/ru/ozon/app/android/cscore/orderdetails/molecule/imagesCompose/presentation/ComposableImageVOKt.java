package ru.ozon.app.android.cscore.orderdetails.molecule.imagesCompose.presentation;

import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.tokenized.model.TokenizedTrackingInfo;
import ru.ozon.app.android.cscore.orderdetails.molecule.imagesCompose.data.ComposableImageDTO;
import ru.ozon.app.android.gallery.GalleryRequest;
import ru.ozon.uni.atoms.data.AtomActionDTO;
import ru.ozon.uni.atoms.data.controls.CommonControlSettings;
import ru.ozon.uni.atoms.data.dsBadge.BadgeDTO;
import ru.ozon.uni.atoms.data.image.ImageDTO;
import ru.ozon.uni.atoms.data.productMedia.ProductMediaDTO;
import ru.ozon.uni.atoms.data.text.TextDTO;

@Metadata(d1 = {"\u0000*\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\u001a8\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\b\u0010\u0003\u001a\u0004\u0018\u00010\u00042\u0014\u0010\u0005\u001a\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b\u0018\u00010\u00062\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\n¨\u0006\f"}, d2 = {"toVo", "Lru/ozon/app/android/cscore/orderdetails/molecule/imagesCompose/presentation/ComposableImageVO;", "Lru/ozon/app/android/cscore/orderdetails/molecule/imagesCompose/data/ComposableImageDTO;", "action", "Lru/ozon/uni/atoms/data/AtomActionDTO;", "trackingInfo", "", "", "Lru/ozon/android/tokenized/model/TokenizedTrackingInfo;", "galleryItems", "", "Lru/ozon/app/android/gallery/GalleryRequest$GalleryItem;", "csma_prodGoogleAllVendorsRelease"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class ComposableImageVOKt {
    @NotNull
    public static final ComposableImageVO toVo(@NotNull ComposableImageDTO composableImageDTO, AtomActionDTO atomActionDTO, Map<String, TokenizedTrackingInfo> map, @NotNull List<? extends GalleryRequest.GalleryItem> galleryItems) {
        Intrinsics.checkNotNullParameter(composableImageDTO, "<this>");
        Intrinsics.checkNotNullParameter(galleryItems, "galleryItems");
        ImageDTO image = composableImageDTO.getImage();
        ProductMediaDTO productMedia = composableImageDTO.getProductMedia();
        TextDTO counter = composableImageDTO.getCounter();
        Boolean isAdult = composableImageDTO.isAdult();
        boolean booleanValue = isAdult != null ? isAdult.booleanValue() : false;
        Boolean isTranslucent = composableImageDTO.isTranslucent();
        boolean booleanValue2 = isTranslucent != null ? isTranslucent.booleanValue() : false;
        BadgeDTO badge = composableImageDTO.getBadge();
        String blurImageUrl = composableImageDTO.getBlurImageUrl();
        ComposableImageDTO.Border border = composableImageDTO.getBorder();
        CommonControlSettings common = composableImageDTO.getCommon();
        return new ComposableImageVO(image, productMedia, counter, booleanValue, false, booleanValue2, galleryItems, badge, blurImageUrl, border, common == null ? new CommonControlSettings(atomActionDTO, map, null, 4, null) : common, composableImageDTO.getKey(), 16, null);
    }
}
