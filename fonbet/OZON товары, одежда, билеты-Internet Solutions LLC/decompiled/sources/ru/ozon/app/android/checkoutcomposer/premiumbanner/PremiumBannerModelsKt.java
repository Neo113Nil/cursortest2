package ru.ozon.app.android.checkoutcomposer.premiumbanner;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.atoms.data.deprecated.CommonButton;

@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\u001a\u0014\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0004H\u0000¨\u0006\u0005"}, d2 = {"toVO", "Lru/ozon/app/android/checkoutcomposer/premiumbanner/PremiumBannerVO;", "Lru/ozon/app/android/checkoutcomposer/premiumbanner/PremiumBannerDTO;", "stateId", "", "checkout_prodGoogleAllVendorsRelease"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class PremiumBannerModelsKt {
    @NotNull
    public static final PremiumBannerVO toVO(@NotNull PremiumBannerDTO premiumBannerDTO, @NotNull String stateId) {
        Intrinsics.checkNotNullParameter(premiumBannerDTO, "<this>");
        Intrinsics.checkNotNullParameter(stateId, "stateId");
        return new PremiumBannerVO(stateId.hashCode(), premiumBannerDTO.getIcon(), premiumBannerDTO.getShowBackground(), new CommonButton.ButtonSecondarySmall(premiumBannerDTO.getButton().getText(), premiumBannerDTO.getButton().getAction(), null, null, premiumBannerDTO.getButton().getTrackingInfo(), 12, null), premiumBannerDTO.getBenefits(), premiumBannerDTO.getTrackingInfo());
    }
}
