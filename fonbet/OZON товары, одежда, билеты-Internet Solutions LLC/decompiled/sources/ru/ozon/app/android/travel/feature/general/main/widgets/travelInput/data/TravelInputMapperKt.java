package ru.ozon.app.android.travel.feature.general.main.widgets.travelInput.data;

import WZ.t;
import WZ.x;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import l20.d;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.tokenized.model.TokenizedTrackingInfo;
import ru.ozon.app.android.travel.feature.general.main.widgets.travelInput.presentation.TravelInputVI;
import ru.ozon.app.android.travel.molecules.input.v2.CommonInputV2VO;
import ru.ozon.app.android.travel.molecules.input.v2.mapper.CommonInputV2MapperKt;
import ru.ozon.uni.atoms.data.controls.CommonControlSettings;
import ru.ozon.uni.atoms.data.controls.button.ButtonV3DTO;

@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u001b\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0000¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lru/ozon/app/android/travel/feature/general/main/widgets/travelInput/data/TravelInputDTO;", "Ll20/d;", "widgetInfo", "Lru/ozon/app/android/travel/feature/general/main/widgets/travelInput/presentation/TravelInputVI;", "toVI", "(Lru/ozon/app/android/travel/feature/general/main/widgets/travelInput/data/TravelInputDTO;Ll20/d;)Lru/ozon/app/android/travel/feature/general/main/widgets/travelInput/presentation/TravelInputVI;", "main_prodGoogleAllVendorsRelease"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class TravelInputMapperKt {
    @NotNull
    public static final TravelInputVI toVI(@NotNull TravelInputDTO travelInputDTO, @NotNull d widgetInfo) {
        t tVar;
        CommonInputV2VO.TextInputV2 textInputV2;
        Map<String, TokenizedTrackingInfo> trackingInfo;
        Intrinsics.checkNotNullParameter(travelInputDTO, "<this>");
        Intrinsics.checkNotNullParameter(widgetInfo, "widgetInfo");
        long hashCode = widgetInfo.d().hashCode();
        CommonInputV2VO vO$default = CommonInputV2MapperKt.toVO$default(travelInputDTO.getInput(), null, null, (hashCode + "-" + travelInputDTO.getInput().getName()).hashCode(), 3, null);
        if (vO$default instanceof CommonInputV2VO.TextInputV2) {
            textInputV2 = (CommonInputV2VO.TextInputV2) vO$default;
            tVar = null;
        } else {
            tVar = null;
            textInputV2 = null;
        }
        ButtonV3DTO button = travelInputDTO.getButton();
        CommonControlSettings common = travelInputDTO.getButton().getCommon();
        t d11 = (common == null || (trackingInfo = common.getTrackingInfo()) == null) ? tVar : x.d(trackingInfo, widgetInfo);
        Map<String, TokenizedTrackingInfo> trackingInfo2 = travelInputDTO.getTrackingInfo();
        return new TravelInputVI(hashCode, textInputV2, button, d11, trackingInfo2 != null ? x.d(trackingInfo2, widgetInfo) : tVar);
    }
}
