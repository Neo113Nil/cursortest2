package ru.ozon.app.android.travel.feature.b2b.widgets.travelPersonalAccountReplenishment.v3.data;

import WZ.x;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import l20.d;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.tokenized.model.TokenizedTrackingInfo;
import ru.ozon.app.android.travel.feature.b2b.widgets.travelPersonalAccountReplenishment.v3.presentation.TravelPersonalAccountReplenishmentV3VI;
import ru.ozon.app.android.travel.molecules.input.v2.CommonInputV2VO;
import ru.ozon.app.android.travel.molecules.input.v2.mapper.CommonInputV2MapperKt;
import ru.ozon.uni.atoms.data.controls.button.ButtonV3DTO;
import ru.ozon.uni.atoms.data.controls.tag.TagButtonDTO;
import ru.ozon.uni.atoms.data.disclaimer.DisclaimerDTO;
import ru.ozon.uni.atoms.data.text.TextDTO;

@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u001b\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0000¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lru/ozon/app/android/travel/feature/b2b/widgets/travelPersonalAccountReplenishment/v3/data/TravelPersonalAccountReplenishmentV3DTO;", "Ll20/d;", "widgetInfo", "Lru/ozon/app/android/travel/feature/b2b/widgets/travelPersonalAccountReplenishment/v3/presentation/TravelPersonalAccountReplenishmentV3VI;", "toVI", "(Lru/ozon/app/android/travel/feature/b2b/widgets/travelPersonalAccountReplenishment/v3/data/TravelPersonalAccountReplenishmentV3DTO;Ll20/d;)Lru/ozon/app/android/travel/feature/b2b/widgets/travelPersonalAccountReplenishment/v3/presentation/TravelPersonalAccountReplenishmentV3VI;", "b2b_prodGoogleAllVendorsRelease"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class TravelPersonalAccountReplenishmentV3MapperKt {
    @NotNull
    public static final TravelPersonalAccountReplenishmentV3VI toVI(@NotNull TravelPersonalAccountReplenishmentV3DTO travelPersonalAccountReplenishmentV3DTO, @NotNull d widgetInfo) {
        Intrinsics.checkNotNullParameter(travelPersonalAccountReplenishmentV3DTO, "<this>");
        Intrinsics.checkNotNullParameter(widgetInfo, "widgetInfo");
        long hashCode = widgetInfo.d().hashCode();
        TextDTO title = travelPersonalAccountReplenishmentV3DTO.getTitle();
        TextDTO subtitle = travelPersonalAccountReplenishmentV3DTO.getSubtitle();
        CommonInputV2VO vO$default = CommonInputV2MapperKt.toVO$default(travelPersonalAccountReplenishmentV3DTO.getInput(), null, null, travelPersonalAccountReplenishmentV3DTO.getInput().getName().hashCode(), 3, null);
        CommonInputV2VO.TextInputV2 textInputV2 = vO$default instanceof CommonInputV2VO.TextInputV2 ? (CommonInputV2VO.TextInputV2) vO$default : null;
        DisclaimerDTO disclaimer = travelPersonalAccountReplenishmentV3DTO.getDisclaimer();
        List<TagButtonDTO> inputVariants = travelPersonalAccountReplenishmentV3DTO.getInputVariants();
        ButtonV3DTO submitButton = travelPersonalAccountReplenishmentV3DTO.getSubmitButton();
        Map<String, TokenizedTrackingInfo> trackingInfo = travelPersonalAccountReplenishmentV3DTO.getTrackingInfo();
        return new TravelPersonalAccountReplenishmentV3VI(hashCode, title, subtitle, textInputV2, inputVariants, disclaimer, submitButton, trackingInfo != null ? x.d(trackingInfo, widgetInfo) : null);
    }
}
