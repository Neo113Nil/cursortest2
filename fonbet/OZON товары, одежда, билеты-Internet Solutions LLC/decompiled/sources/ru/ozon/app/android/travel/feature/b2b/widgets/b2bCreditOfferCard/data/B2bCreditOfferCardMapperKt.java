package ru.ozon.app.android.travel.feature.b2b.widgets.b2bCreditOfferCard.data;

import WZ.x;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import l20.d;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.tokenized.model.TokenizedTrackingInfo;
import ru.ozon.app.android.travel.feature.b2b.widgets.b2bCreditOfferCard.data.B2bCreditOfferCardDTO;
import ru.ozon.app.android.travel.feature.b2b.widgets.b2bCreditOfferCard.presentation.B2bCreditOfferCardVI;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.data.controls.CommonControlSettings;
import ru.ozon.uni.atoms.data.controls.button.ButtonV3DTO;
import ru.ozon.uni.atoms.data.dsBadge.BadgeDTO;
import ru.ozon.uni.atoms.data.text.TextDTO;

@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u001b\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0000¢\u0006\u0004\b\u0004\u0010\u0005\u001a\u0013\u0010\u0004\u001a\u00020\u0007*\u00020\u0006H\u0002¢\u0006\u0004\b\u0004\u0010\b¨\u0006\t"}, d2 = {"Lru/ozon/app/android/travel/feature/b2b/widgets/b2bCreditOfferCard/data/B2bCreditOfferCardDTO;", "Ll20/d;", "widgetInfo", "Lru/ozon/app/android/travel/feature/b2b/widgets/b2bCreditOfferCard/presentation/B2bCreditOfferCardVI;", "toVI", "(Lru/ozon/app/android/travel/feature/b2b/widgets/b2bCreditOfferCard/data/B2bCreditOfferCardDTO;Ll20/d;)Lru/ozon/app/android/travel/feature/b2b/widgets/b2bCreditOfferCard/presentation/B2bCreditOfferCardVI;", "Lru/ozon/app/android/travel/feature/b2b/widgets/b2bCreditOfferCard/data/B2bCreditOfferCardDTO$ProgressBarDTO;", "Lru/ozon/app/android/travel/feature/b2b/widgets/b2bCreditOfferCard/presentation/B2bCreditOfferCardVI$ProgressBarVI;", "(Lru/ozon/app/android/travel/feature/b2b/widgets/b2bCreditOfferCard/data/B2bCreditOfferCardDTO$ProgressBarDTO;)Lru/ozon/app/android/travel/feature/b2b/widgets/b2bCreditOfferCard/presentation/B2bCreditOfferCardVI$ProgressBarVI;", "b2b_prodGoogleAllVendorsRelease"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class B2bCreditOfferCardMapperKt {
    @NotNull
    public static final B2bCreditOfferCardVI toVI(@NotNull B2bCreditOfferCardDTO b2bCreditOfferCardDTO, @NotNull d widgetInfo) {
        Intrinsics.checkNotNullParameter(b2bCreditOfferCardDTO, "<this>");
        Intrinsics.checkNotNullParameter(widgetInfo, "widgetInfo");
        long hashCode = widgetInfo.d().hashCode();
        TextDTO title = b2bCreditOfferCardDTO.getTitle();
        List<BadgeDTO> bottomBadgeList = b2bCreditOfferCardDTO.getBottomBadgeList();
        TextDTO description = b2bCreditOfferCardDTO.getDescription();
        B2bCreditOfferCardDTO.ProgressBarDTO progressBar = b2bCreditOfferCardDTO.getProgressBar();
        B2bCreditOfferCardVI.ProgressBarVI vi2 = progressBar != null ? toVI(progressBar) : null;
        CommonControlSettings common = b2bCreditOfferCardDTO.getCommon();
        AtomAction atomAction = common != null ? common.toAtomAction() : null;
        List<ButtonV3DTO> buttonList = b2bCreditOfferCardDTO.getButtonList();
        Map<String, TokenizedTrackingInfo> trackingInfo = b2bCreditOfferCardDTO.getTrackingInfo();
        return new B2bCreditOfferCardVI(hashCode, title, bottomBadgeList, description, vi2, buttonList, atomAction, trackingInfo != null ? x.d(trackingInfo, widgetInfo) : null);
    }

    private static final B2bCreditOfferCardVI.ProgressBarVI toVI(B2bCreditOfferCardDTO.ProgressBarDTO progressBarDTO) {
        return new B2bCreditOfferCardVI.ProgressBarVI(progressBarDTO.getPercent(), progressBarDTO.getColor(), progressBarDTO.getBackgroundColor(), progressBarDTO.getHeight());
    }
}
