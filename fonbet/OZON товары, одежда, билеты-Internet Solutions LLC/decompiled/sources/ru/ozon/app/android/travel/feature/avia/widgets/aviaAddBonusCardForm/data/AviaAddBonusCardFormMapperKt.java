package ru.ozon.app.android.travel.feature.avia.widgets.aviaAddBonusCardForm.data;

import WZ.x;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import l20.d;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.tokenized.model.TokenizedTrackingInfo;
import ru.ozon.app.android.travel.feature.avia.widgets.aviaAddBonusCardForm.presentation.AviaAddBonusCardFormVI;
import ru.ozon.app.android.travel.molecules.input.v2.CommonInputV2VO;
import ru.ozon.app.android.travel.molecules.input.v2.mapper.CommonInputV2MapperKt;
import ru.ozon.uni.atoms.data.controls.button.ButtonV3DTO;
import ru.ozon.uni.atoms.data.text.TextDTO;

@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u001b\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0000¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lru/ozon/app/android/travel/feature/avia/widgets/aviaAddBonusCardForm/data/AviaAddBonusCardFormDTO;", "Ll20/d;", "widgetInfo", "Lru/ozon/app/android/travel/feature/avia/widgets/aviaAddBonusCardForm/presentation/AviaAddBonusCardFormVI;", "toVI", "(Lru/ozon/app/android/travel/feature/avia/widgets/aviaAddBonusCardForm/data/AviaAddBonusCardFormDTO;Ll20/d;)Lru/ozon/app/android/travel/feature/avia/widgets/aviaAddBonusCardForm/presentation/AviaAddBonusCardFormVI;", "avia_prodGoogleAllVendorsRelease"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class AviaAddBonusCardFormMapperKt {
    @NotNull
    public static final AviaAddBonusCardFormVI toVI(@NotNull AviaAddBonusCardFormDTO aviaAddBonusCardFormDTO, @NotNull d widgetInfo) {
        Intrinsics.checkNotNullParameter(aviaAddBonusCardFormDTO, "<this>");
        Intrinsics.checkNotNullParameter(widgetInfo, "widgetInfo");
        long hashCode = widgetInfo.d().hashCode();
        TextDTO title = aviaAddBonusCardFormDTO.getTitle();
        TextDTO subtitle = aviaAddBonusCardFormDTO.getSubtitle();
        CommonInputV2VO vO$default = CommonInputV2MapperKt.toVO$default(aviaAddBonusCardFormDTO.getAirline(), null, null, aviaAddBonusCardFormDTO.getAirline().getName().hashCode(), 3, null);
        CommonInputV2VO.SelectorV2 selectorV2 = vO$default instanceof CommonInputV2VO.SelectorV2 ? (CommonInputV2VO.SelectorV2) vO$default : null;
        CommonInputV2VO vO$default2 = CommonInputV2MapperKt.toVO$default(aviaAddBonusCardFormDTO.getBonusCardNumber(), null, null, aviaAddBonusCardFormDTO.getBonusCardNumber().getName().hashCode(), 3, null);
        CommonInputV2VO.TextInputV2 textInputV2 = vO$default2 instanceof CommonInputV2VO.TextInputV2 ? (CommonInputV2VO.TextInputV2) vO$default2 : null;
        ButtonV3DTO actionButton = aviaAddBonusCardFormDTO.getActionButton();
        Map<String, TokenizedTrackingInfo> trackingInfo = aviaAddBonusCardFormDTO.getTrackingInfo();
        return new AviaAddBonusCardFormVI(hashCode, title, subtitle, selectorV2, textInputV2, actionButton, trackingInfo != null ? x.d(trackingInfo, widgetInfo) : null);
    }
}
