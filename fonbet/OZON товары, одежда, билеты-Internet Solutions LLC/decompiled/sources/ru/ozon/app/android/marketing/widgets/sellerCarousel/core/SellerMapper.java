package ru.ozon.app.android.marketing.widgets.sellerCarousel.core;

import android.widget.ImageView;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kd.C7665d;
import kotlin.Metadata;
import kotlin.collections.C7714v;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.IntRange;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.tokenized.model.TokenizedTrackingInfo;
import ru.ozon.app.android.account.favorites.seller.SellerFavoriteService;
import ru.ozon.app.android.composer.TrackingInfoMapperKt;
import ru.ozon.app.android.marketing.widgets.sellerCarousel.data.SellerListDTO;
import ru.ozon.app.android.marketing.widgets.sellerCarousel.presentation.SellerVO;
import ru.ozon.app.android.product.imagesswipeview.AdultImageView;
import ru.ozon.app.android.product.imagesswipeview.Paranja;

@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u000e\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tJ\u0014\u0010\n\u001a\u00020\u000b*\u00020\f2\u0006\u0010\r\u001a\u00020\u000eH\u0002R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u000f"}, d2 = {"Lru/ozon/app/android/marketing/widgets/sellerCarousel/core/SellerMapper;", "", "sellerFavoriteService", "Lru/ozon/app/android/account/favorites/seller/SellerFavoriteService;", "<init>", "(Lru/ozon/app/android/account/favorites/seller/SellerFavoriteService;)V", "transform", "Lru/ozon/app/android/marketing/widgets/sellerCarousel/presentation/SellerVO;", "dto", "Lru/ozon/app/android/marketing/widgets/sellerCarousel/data/SellerListDTO$SellerDTO;", "mapToVO", "Lru/ozon/app/android/marketing/widgets/sellerCarousel/presentation/SellerVO$ProductVO;", "Lru/ozon/app/android/marketing/widgets/sellerCarousel/data/SellerListDTO$SellerDTO$ProductDTO;", "sellerId", "", "marketing_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class SellerMapper {

    @NotNull
    private final SellerFavoriteService sellerFavoriteService;

    public SellerMapper(@NotNull SellerFavoriteService sellerFavoriteService) {
        Intrinsics.checkNotNullParameter(sellerFavoriteService, "sellerFavoriteService");
        this.sellerFavoriteService = sellerFavoriteService;
    }

    private final SellerVO.ProductVO mapToVO(SellerListDTO.SellerDTO.ProductDTO productDTO, long j11) {
        Long sku = productDTO.getSku();
        long longValue = sku != null ? sku.longValue() : 0L;
        String title = productDTO.getTitle();
        AdultImageView.Image image = new AdultImageView.Image(productDTO.getImage(), AdultImageView.Image.HeightMode.Unspecified.INSTANCE, 190.0f, false, productDTO.isAdult(), false, null, Paranja.PARANJA_DISABLED, ImageView.ScaleType.FIT_CENTER, false, null, false, 1568, null);
        BigDecimal finalPrice = productDTO.getFinalPrice();
        String priceString = productDTO.getPriceString();
        Integer discount = productDTO.getDiscount();
        int intValue = discount != null ? discount.intValue() : 0;
        BigDecimal price = productDTO.getPrice();
        String deeplink = productDTO.getDeeplink();
        boolean isAdult = productDTO.isAdult();
        Map<String, TokenizedTrackingInfo> trackingInfo = productDTO.getTrackingInfo();
        return new SellerVO.ProductVO(longValue, title, image, finalPrice, priceString, price, intValue, deeplink, false, trackingInfo != null ? TrackingInfoMapperKt.toTokenizedEvent$default(trackingInfo, Long.valueOf(j11), null, 2, null) : null, isAdult, false, 2304, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x00b1  */
    @NotNull
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final SellerVO transform(@NotNull SellerListDTO.SellerDTO dto) {
        ArrayList arrayList;
        boolean z11;
        Intrinsics.checkNotNullParameter(dto, "dto");
        IntRange intRange = new IntRange(0, 3, 1);
        ArrayList arrayList2 = new ArrayList(C7714v.z(intRange, 10));
        C7665d it = intRange.iterator();
        while (it.hasNext()) {
            int b11 = it.b();
            List<SellerListDTO.SellerDTO.ProductDTO> items = dto.getItems();
            Intrinsics.f(items);
            arrayList2.add(items.size() > b11 ? mapToVO(dto.getItems().get(b11), dto.getId()) : new SellerVO.ProductVO(0L, null, null, null, null, null, 0, null, false, null, false, false, 3839, null));
        }
        long id2 = dto.getId();
        long id3 = dto.getId();
        String title = dto.getTitle();
        if (title == null) {
            title = "";
        }
        String subtitle = dto.getSubtitle();
        if (subtitle == null) {
            subtitle = "";
        }
        Integer productsCount = dto.getProductsCount();
        String logoImage = dto.getLogoImage();
        String deeplink = dto.getDeeplink();
        if (dto.isFavorite()) {
            arrayList = arrayList2;
        } else {
            arrayList = arrayList2;
            if (!this.sellerFavoriteService.isSellerFavoriteLocally(dto.getId())) {
                z11 = false;
                Map<String, TokenizedTrackingInfo> trackingInfo = dto.getTrackingInfo();
                return new SellerVO(id2, id3, title, subtitle, productsCount, logoImage, deeplink, arrayList, z11, trackingInfo != null ? TrackingInfoMapperKt.toTokenizedEvent$default(trackingInfo, Long.valueOf(dto.getId()), null, 2, null) : null, dto.isPremium(), dto.getPremiumIcon(), dto.getRatingBadge());
            }
        }
        z11 = true;
        Map<String, TokenizedTrackingInfo> trackingInfo2 = dto.getTrackingInfo();
        return new SellerVO(id2, id3, title, subtitle, productsCount, logoImage, deeplink, arrayList, z11, trackingInfo2 != null ? TrackingInfoMapperKt.toTokenizedEvent$default(trackingInfo2, Long.valueOf(dto.getId()), null, 2, null) : null, dto.isPremium(), dto.getPremiumIcon(), dto.getRatingBadge());
    }
}
