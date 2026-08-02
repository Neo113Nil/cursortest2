package ru.ozon.app.android.travel.feature.railway.widgets.travelTrainSeatInfo.v2.data;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C7714v;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import l20.d;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.travel.feature.railway.widgets.travelTrainSeatInfo.v2.data.TravelTrainSeatInfoV2DTO;
import ru.ozon.app.android.travel.feature.railway.widgets.travelTrainSeatInfo.v2.presentation.TravelTrainSeatInfoV2VO;
import ru.ozon.uni.atoms.data.text.TextDTO;

@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0001\u0018\u00002*\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u0001j\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0005`\u0006B\t\b\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\tH\u0002¢\u0006\u0004\b\f\u0010\rJ&\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u000e\u001a\u00020\u00022\u0006\u0010\u000f\u001a\u00020\u0003H\u0096\u0002¢\u0006\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, d2 = {"Lru/ozon/app/android/travel/feature/railway/widgets/travelTrainSeatInfo/v2/data/TravelTrainSeatInfoV2Mapper;", "Lkotlin/Function2;", "Lru/ozon/app/android/travel/feature/railway/widgets/travelTrainSeatInfo/v2/data/TravelTrainSeatInfoV2DTO;", "Ll20/d;", "", "Lru/ozon/app/android/travel/feature/railway/widgets/travelTrainSeatInfo/v2/presentation/TravelTrainSeatInfoV2VO;", "Lru/ozon/app/android/composer/widgets/base/WidgetMapper;", "<init>", "()V", "Lru/ozon/app/android/travel/feature/railway/widgets/travelTrainSeatInfo/v2/data/TravelTrainSeatInfoV2DTO$SeatPriceDTO;", "seatPrice", "Lru/ozon/app/android/travel/feature/railway/widgets/travelTrainSeatInfo/v2/presentation/TravelTrainSeatInfoV2VO$SeatPriceVO;", "mapSeatPrice", "(Lru/ozon/app/android/travel/feature/railway/widgets/travelTrainSeatInfo/v2/data/TravelTrainSeatInfoV2DTO$SeatPriceDTO;)Lru/ozon/app/android/travel/feature/railway/widgets/travelTrainSeatInfo/v2/presentation/TravelTrainSeatInfoV2VO$SeatPriceVO;", "state", "widgetInfo", "invoke", "(Lru/ozon/app/android/travel/feature/railway/widgets/travelTrainSeatInfo/v2/data/TravelTrainSeatInfoV2DTO;Ll20/d;)Ljava/util/List;", "railway_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class TravelTrainSeatInfoV2Mapper implements Function2<TravelTrainSeatInfoV2DTO, d, List<? extends TravelTrainSeatInfoV2VO>> {
    private final TravelTrainSeatInfoV2VO.SeatPriceVO mapSeatPrice(TravelTrainSeatInfoV2DTO.SeatPriceDTO seatPrice) {
        return new TravelTrainSeatInfoV2VO.SeatPriceVO(seatPrice.getPrice(), seatPrice.getColor());
    }

    @Override // kotlin.jvm.functions.Function2
    @NotNull
    public List<TravelTrainSeatInfoV2VO> invoke(@NotNull TravelTrainSeatInfoV2DTO state, @NotNull d widgetInfo) {
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(widgetInfo, "widgetInfo");
        long hashCode = widgetInfo.d().hashCode();
        TextDTO type = state.getType();
        TextDTO serviceType = state.getServiceType();
        TextDTO carriageNumber = state.getCarriageNumber();
        TextDTO seatsCount = state.getSeatsCount();
        TextDTO seatsDetailed = state.getSeatsDetailed();
        TextDTO selectionTitle = state.getSelectionTitle();
        List<TravelTrainSeatInfoV2DTO.SeatPriceDTO> seatPrices = state.getSeatPrices();
        ArrayList arrayList = new ArrayList(C7714v.z(seatPrices, 10));
        Iterator<T> it = seatPrices.iterator();
        while (it.hasNext()) {
            arrayList.add(mapSeatPrice((TravelTrainSeatInfoV2DTO.SeatPriceDTO) it.next()));
        }
        TravelTrainSeatInfoV2DTO.SeatDiscountDTO seatDiscount = state.getSeatDiscount();
        return C7714v.a0(new TravelTrainSeatInfoV2VO(hashCode, type, serviceType, carriageNumber, seatsCount, seatsDetailed, selectionTitle, arrayList, seatDiscount != null ? new TravelTrainSeatInfoV2VO.SeatDiscountVO(seatDiscount.getDiscountIcon(), seatDiscount.getDiscount(), seatDiscount.getInfoIcon()) : null, state.getAnnotation(), state.getTypeBadge()));
    }
}
