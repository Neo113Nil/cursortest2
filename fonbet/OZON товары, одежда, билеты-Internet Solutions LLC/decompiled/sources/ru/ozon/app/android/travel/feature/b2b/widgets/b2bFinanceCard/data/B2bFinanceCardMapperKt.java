package ru.ozon.app.android.travel.feature.b2b.widgets.b2bFinanceCard.data;

import WZ.x;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import l20.d;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.tokenized.model.TokenizedTrackingInfo;
import ru.ozon.app.android.travel.feature.b2b.widgets.b2bFinanceCard.presentation.B2bFinanceCardVI;
import ru.ozon.uni.atoms.data.controls.button.ButtonV3DTO;
import ru.ozon.uni.atoms.data.dsBadge.BadgeDTO;
import ru.ozon.uni.atoms.data.text.TextDTO;

@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u001b\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0000¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lru/ozon/app/android/travel/feature/b2b/widgets/b2bFinanceCard/data/B2bFinanceCardDTO;", "Ll20/d;", "widgetInfo", "Lru/ozon/app/android/travel/feature/b2b/widgets/b2bFinanceCard/presentation/B2bFinanceCardVI;", "toVI", "(Lru/ozon/app/android/travel/feature/b2b/widgets/b2bFinanceCard/data/B2bFinanceCardDTO;Ll20/d;)Lru/ozon/app/android/travel/feature/b2b/widgets/b2bFinanceCard/presentation/B2bFinanceCardVI;", "b2b_prodGoogleAllVendorsRelease"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class B2bFinanceCardMapperKt {
    @NotNull
    public static final B2bFinanceCardVI toVI(@NotNull B2bFinanceCardDTO b2bFinanceCardDTO, @NotNull d widgetInfo) {
        Intrinsics.checkNotNullParameter(b2bFinanceCardDTO, "<this>");
        Intrinsics.checkNotNullParameter(widgetInfo, "widgetInfo");
        long hashCode = widgetInfo.d().hashCode();
        TextDTO title = b2bFinanceCardDTO.getTitle();
        TextDTO amount = b2bFinanceCardDTO.getAmount();
        TextDTO additionalAmount = b2bFinanceCardDTO.getAdditionalAmount();
        List<BadgeDTO> badgeList = b2bFinanceCardDTO.getBadgeList();
        List<ButtonV3DTO> buttonList = b2bFinanceCardDTO.getButtonList();
        Map<String, TokenizedTrackingInfo> trackingInfo = b2bFinanceCardDTO.getTrackingInfo();
        return new B2bFinanceCardVI(hashCode, title, amount, additionalAmount, badgeList, buttonList, trackingInfo != null ? x.d(trackingInfo, widgetInfo) : null);
    }
}
