package ru.ozon.app.android.travel.feature.railway.widgets.travelCarriageTypeSelect.v2.data;

import WZ.t;
import WZ.x;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.C7714v;
import kotlin.collections.K;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import l20.d;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.tokenized.model.TokenizedTrackingInfo;
import ru.ozon.app.android.travel.feature.railway.widgets.travelCarriageTypeSelect.v2.data.TravelCarriageTypeSelectV2DTO;
import ru.ozon.app.android.travel.feature.railway.widgets.travelCarriageTypeSelect.v2.presentation.TravelCarriageTypeSelectV2VO;

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002*\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u0001j\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0005`\u0006B\u0007¢\u0006\u0004\b\u0007\u0010\bJ*\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\t\u001a\u00020\u00022\n\u0010\u000b\u001a\u00060\u0003j\u0002`\nH\u0096\u0002¢\u0006\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"Lru/ozon/app/android/travel/feature/railway/widgets/travelCarriageTypeSelect/v2/data/TravelCarriageTypeSelectV2Mapper;", "Lkotlin/Function2;", "Lru/ozon/app/android/travel/feature/railway/widgets/travelCarriageTypeSelect/v2/data/TravelCarriageTypeSelectV2DTO;", "Ll20/d;", "", "Lru/ozon/app/android/travel/feature/railway/widgets/travelCarriageTypeSelect/v2/presentation/TravelCarriageTypeSelectV2VO;", "Lru/ozon/app/android/composer/widgets/base/WidgetMapper;", "<init>", "()V", "state", "Lru/ozon/app/android/composer/view/WidgetInfo;", "widgetInfo", "invoke", "(Lru/ozon/app/android/travel/feature/railway/widgets/travelCarriageTypeSelect/v2/data/TravelCarriageTypeSelectV2DTO;Ll20/d;)Ljava/util/List;", "railway_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class TravelCarriageTypeSelectV2Mapper implements Function2<TravelCarriageTypeSelectV2DTO, d, List<? extends TravelCarriageTypeSelectV2VO>> {
    @Override // kotlin.jvm.functions.Function2
    @NotNull
    public List<TravelCarriageTypeSelectV2VO> invoke(@NotNull TravelCarriageTypeSelectV2DTO state, @NotNull d widgetInfo) {
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(widgetInfo, "widgetInfo");
        if (state.getCarriageTypes().isEmpty()) {
            return K.f71697a;
        }
        long hashCode = widgetInfo.d().hashCode();
        Map<String, TokenizedTrackingInfo> trackingInfo = state.getTrackingInfo();
        t d11 = trackingInfo != null ? x.d(trackingInfo, widgetInfo) : null;
        List<TravelCarriageTypeSelectV2DTO.CarriageTypeDTO> carriageTypes = state.getCarriageTypes();
        ArrayList arrayList = new ArrayList(C7714v.z(carriageTypes, 10));
        for (TravelCarriageTypeSelectV2DTO.CarriageTypeDTO carriageTypeDTO : carriageTypes) {
            arrayList.add(new TravelCarriageTypeSelectV2VO.CarriageTypeVO(carriageTypeDTO.getName().getText().hashCode(), carriageTypeDTO.getName(), carriageTypeDTO.getSeatsNumber(), carriageTypeDTO.getPrice(), carriageTypeDTO.getAspect(), state.isSeatsNumberOnNewLine()));
        }
        return C7714v.a0(new TravelCarriageTypeSelectV2VO(hashCode, arrayList, d11));
    }
}
