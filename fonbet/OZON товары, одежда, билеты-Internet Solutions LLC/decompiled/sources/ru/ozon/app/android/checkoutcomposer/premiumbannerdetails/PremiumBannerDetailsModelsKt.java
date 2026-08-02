package ru.ozon.app.android.checkoutcomposer.premiumbannerdetails;

import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C7714v;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.checkoutcomposer.premiumbannerdetails.PremiumBannerDetailsDTO;
import ru.ozon.app.android.checkoutcomposer.premiumbannerdetails.PremiumBannerDetailsVO;
import ru.ozon.uni.atoms.data.price.Price;

@Metadata(d1 = {"\u0000\u001e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a\u0014\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0004H\u0000\u001a\u0014\u0010\u0005\u001a\u00020\u0006*\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0000¨\u0006\t"}, d2 = {"toVO", "Lru/ozon/app/android/checkoutcomposer/premiumbannerdetails/PremiumBannerDetailsVO;", "Lru/ozon/app/android/checkoutcomposer/premiumbannerdetails/PremiumBannerDetailsDTO;", "stateId", "", "updateStyle", "Lru/ozon/uni/atoms/data/price/Price;", "styleType", "Lru/ozon/uni/atoms/data/price/Price$StyleType;", "checkout_prodGoogleAllVendorsRelease"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class PremiumBannerDetailsModelsKt {
    @NotNull
    public static final PremiumBannerDetailsVO toVO(@NotNull PremiumBannerDetailsDTO premiumBannerDetailsDTO, @NotNull String stateId) {
        Intrinsics.checkNotNullParameter(premiumBannerDetailsDTO, "<this>");
        Intrinsics.checkNotNullParameter(stateId, "stateId");
        long hashCode = stateId.hashCode();
        boolean showBackground = premiumBannerDetailsDTO.getShowBackground();
        List<PremiumBannerDetailsDTO.Tariff> tariffs = premiumBannerDetailsDTO.getTariffs();
        ArrayList arrayList = new ArrayList(C7714v.z(tariffs, 10));
        for (PremiumBannerDetailsDTO.Tariff tariff : tariffs) {
            PremiumBannerDetailsDTO.Tariff.Prices price = tariff.getPrice();
            arrayList.add(new PremiumBannerDetailsVO.Tariff(tariff.getBadge(), new PremiumBannerDetailsVO.Tariff.Header(tariff.getHeader().getImage(), tariff.getHeader().getInfo()), new PremiumBannerDetailsVO.Tariff.Prices(updateStyle(price.getRecurrentPrice(), Price.StyleType.STYLE_TYPE_MEDIUM_LARGE), updateStyle(price.getTotalPrice(), Price.StyleType.STYLE_TYPE_MEDIUM)), tariff.getBenefits(), tariff.getButton()));
        }
        return new PremiumBannerDetailsVO(hashCode, showBackground, arrayList, premiumBannerDetailsDTO.getTrackingInfo());
    }

    @NotNull
    public static final Price updateStyle(@NotNull Price price, @NotNull Price.StyleType styleType) {
        Intrinsics.checkNotNullParameter(price, "<this>");
        Price.StyleType styleType2 = styleType;
        Intrinsics.checkNotNullParameter(styleType2, "styleType");
        if (price.getStyle() != null) {
            styleType2 = price.getStyle();
        }
        return Price.copy$default(price, styleType2, null, null, null, null, null, null, null, null, null, null, null, 4094, null);
    }
}
