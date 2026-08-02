package ru.ozon.app.android.checkoutcomposer.stickyTotal.presentation;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.checkoutcomposer.stickyTotal.data.StickyTotalDTO;
import ru.ozon.app.android.checkoutcomposer.stickyTotal.presentation.StickyTotalVO;
import ru.ozon.uni.atoms.data.badge.Badge;
import ru.ozon.uni.atoms.data.dsBadge.BadgeDTO;
import ru.ozon.uni.atoms.v3.mappers.BadgeMapperKt;

@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\u001a\u0014\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0004H\u0000¨\u0006\u0005"}, d2 = {"toVO", "Lru/ozon/app/android/checkoutcomposer/stickyTotal/presentation/StickyTotalVO;", "Lru/ozon/app/android/checkoutcomposer/stickyTotal/data/StickyTotalDTO;", "id", "", "checkout_prodGoogleAllVendorsRelease"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class StickyTotalMapperKt {
    @NotNull
    public static final StickyTotalVO toVO(@NotNull StickyTotalDTO stickyTotalDTO, long j11) {
        BadgeDTO mapToDsBadge;
        Intrinsics.checkNotNullParameter(stickyTotalDTO, "<this>");
        Badge badgeInfo = stickyTotalDTO.getBadgeInfo();
        return new StickyTotalVO(j11, (badgeInfo == null || (mapToDsBadge = BadgeMapperKt.mapToDsBadge(badgeInfo)) == null) ? null : BadgeDTO.copy$default(mapToDsBadge, null, null, null, null, null, null, null, Boolean.TRUE, null, null, null, null, 3967, null), new StickyTotalVO.Summary(stickyTotalDTO.getSummary().getNewPrice(), stickyTotalDTO.getSummary().getNewAtomInfoText()), stickyTotalDTO.getButton(), stickyTotalDTO.getButtonColor(), stickyTotalDTO.getDisableSeparator(), stickyTotalDTO.getBackgroundColor(), stickyTotalDTO.getShowIsland(), stickyTotalDTO.getTaxAmount(), stickyTotalDTO.getButtonTextColor());
    }
}
