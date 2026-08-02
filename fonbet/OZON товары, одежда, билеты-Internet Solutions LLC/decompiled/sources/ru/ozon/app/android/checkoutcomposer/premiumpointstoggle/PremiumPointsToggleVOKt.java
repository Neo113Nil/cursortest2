package ru.ozon.app.android.checkoutcomposer.premiumpointstoggle;

import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.tokenized.model.TokenizedTrackingInfo;
import ru.ozon.app.android.checkoutcomposer.premiumpointstoggle.PremiumPointsToggleDTO;
import ru.ozon.app.android.checkoutcomposer.premiumpointstoggle.PremiumPointsToggleVO;
import ru.ozon.app.android.composer.TrackingInfoMapperKt;
import ru.ozon.uni.atoms.data.tabs.Tabs;

@Metadata(d1 = {"\u0000\u001a\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u001a\u0014\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0004H\u0000\u001a\f\u0010\u0000\u001a\u00020\u0005*\u00020\u0006H\u0000¨\u0006\u0007"}, d2 = {"toVO", "Lru/ozon/app/android/checkoutcomposer/premiumpointstoggle/PremiumPointsToggleVO;", "Lru/ozon/app/android/checkoutcomposer/premiumpointstoggle/PremiumPointsToggleDTO;", "stateId", "", "Lru/ozon/app/android/checkoutcomposer/premiumpointstoggle/PremiumPointsToggleVO$Header;", "Lru/ozon/app/android/checkoutcomposer/premiumpointstoggle/PremiumPointsToggleDTO$Header;", "checkout_prodGoogleAllVendorsRelease"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class PremiumPointsToggleVOKt {
    @NotNull
    public static final PremiumPointsToggleVO toVO(@NotNull PremiumPointsToggleDTO premiumPointsToggleDTO, @NotNull String stateId) {
        Intrinsics.checkNotNullParameter(premiumPointsToggleDTO, "<this>");
        Intrinsics.checkNotNullParameter(stateId, "stateId");
        long hashCode = stateId.hashCode();
        PremiumPointsToggleVO.Header vo = toVO(premiumPointsToggleDTO.getHeader());
        Tabs switcherTab = premiumPointsToggleDTO.getSwitcherTab();
        Map<String, TokenizedTrackingInfo> trackingInfo = premiumPointsToggleDTO.getTrackingInfo();
        return new PremiumPointsToggleVO(hashCode, vo, switcherTab, trackingInfo != null ? TrackingInfoMapperKt.toTokenizedEvent$default(trackingInfo, Long.valueOf(stateId.hashCode()), null, 2, null) : null);
    }

    @NotNull
    public static final PremiumPointsToggleVO.Header toVO(@NotNull PremiumPointsToggleDTO.Header header) {
        Intrinsics.checkNotNullParameter(header, "<this>");
        return new PremiumPointsToggleVO.Header(header.getTitle(), header.getButton());
    }
}
