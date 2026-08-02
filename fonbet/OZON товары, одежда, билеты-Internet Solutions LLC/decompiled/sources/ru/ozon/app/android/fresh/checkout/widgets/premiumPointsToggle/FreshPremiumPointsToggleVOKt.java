package ru.ozon.app.android.fresh.checkout.widgets.premiumPointsToggle;

import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.tokenized.model.TokenizedTrackingInfo;
import ru.ozon.app.android.composer.TrackingInfoMapperKt;
import ru.ozon.app.android.fresh.checkout.widgets.premiumPointsToggle.FreshPremiumPointsToggleDTO;
import ru.ozon.app.android.fresh.checkout.widgets.premiumPointsToggle.FreshPremiumPointsToggleVO;
import ru.ozon.uni.atoms.data.tabs.Tabs;

@Metadata(d1 = {"\u0000\u001a\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u001a\u0014\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0004H\u0000\u001a\f\u0010\u0000\u001a\u00020\u0005*\u00020\u0006H\u0000¨\u0006\u0007"}, d2 = {"toVO", "Lru/ozon/app/android/fresh/checkout/widgets/premiumPointsToggle/FreshPremiumPointsToggleVO;", "Lru/ozon/app/android/fresh/checkout/widgets/premiumPointsToggle/FreshPremiumPointsToggleDTO;", "stateId", "", "Lru/ozon/app/android/fresh/checkout/widgets/premiumPointsToggle/FreshPremiumPointsToggleVO$Header;", "Lru/ozon/app/android/fresh/checkout/widgets/premiumPointsToggle/FreshPremiumPointsToggleDTO$Header;", "widgets-checkout_prodGoogleAllVendorsRelease"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class FreshPremiumPointsToggleVOKt {
    @NotNull
    public static final FreshPremiumPointsToggleVO toVO(@NotNull FreshPremiumPointsToggleDTO freshPremiumPointsToggleDTO, @NotNull String stateId) {
        Intrinsics.checkNotNullParameter(freshPremiumPointsToggleDTO, "<this>");
        Intrinsics.checkNotNullParameter(stateId, "stateId");
        long hashCode = stateId.hashCode();
        FreshPremiumPointsToggleVO.Header vo = toVO(freshPremiumPointsToggleDTO.getHeader());
        Tabs switcherTab = freshPremiumPointsToggleDTO.getSwitcherTab();
        Map<String, TokenizedTrackingInfo> trackingInfo = freshPremiumPointsToggleDTO.getTrackingInfo();
        return new FreshPremiumPointsToggleVO(hashCode, vo, switcherTab, trackingInfo != null ? TrackingInfoMapperKt.toTokenizedEvent$default(trackingInfo, Long.valueOf(stateId.hashCode()), null, 2, null) : null);
    }

    @NotNull
    public static final FreshPremiumPointsToggleVO.Header toVO(@NotNull FreshPremiumPointsToggleDTO.Header header) {
        Intrinsics.checkNotNullParameter(header, "<this>");
        return new FreshPremiumPointsToggleVO.Header(header.getTitle(), header.getButton());
    }
}
