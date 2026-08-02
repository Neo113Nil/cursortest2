package ru.ozon.app.android.cscore.orderdetails.molecule.media.presentation;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.cscore.orderdetails.molecule.media.data.ProductMediaImageDTO;
import ru.ozon.uni.atoms.data.dsBadge.BadgeDTO;
import ru.ozon.uni.atoms.data.productMedia.ProductMediaDTO;

@Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u001a\n\u0010\u0000\u001a\u00020\u0001*\u00020\u0002¨\u0006\u0003"}, d2 = {"toVO", "Lru/ozon/app/android/cscore/orderdetails/molecule/media/presentation/ProductMediaImageVO;", "Lru/ozon/app/android/cscore/orderdetails/molecule/media/data/ProductMediaImageDTO;", "csma_prodGoogleAllVendorsRelease"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class ProductMediaImageMapperKt {
    @NotNull
    public static final ProductMediaImageVO toVO(@NotNull ProductMediaImageDTO productMediaImageDTO) {
        Intrinsics.checkNotNullParameter(productMediaImageDTO, "<this>");
        ProductMediaDTO productMedia = productMediaImageDTO.getProductMedia();
        BadgeDTO badgeCounter = productMediaImageDTO.getBadgeCounter();
        Boolean isDisabled = productMediaImageDTO.isDisabled();
        return new ProductMediaImageVO(productMedia, badgeCounter, isDisabled != null ? isDisabled.booleanValue() : false);
    }
}
