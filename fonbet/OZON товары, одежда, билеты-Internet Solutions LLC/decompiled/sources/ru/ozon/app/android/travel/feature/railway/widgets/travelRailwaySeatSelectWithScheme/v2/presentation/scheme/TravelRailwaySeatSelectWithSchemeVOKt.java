package ru.ozon.app.android.travel.feature.railway.widgets.travelRailwaySeatSelectWithScheme.v2.presentation.scheme;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.app.android.travel.feature.railway.widgets.travelRailwaySeatSelectWithScheme.v2.presentation.scheme.TravelRailwaySeatSelectWithSchemeVO;

@Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u001a\f\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u0002¨\u0006\u0003"}, d2 = {"toSchemeVO", "Lru/ozon/app/android/travel/feature/railway/widgets/travelRailwaySeatSelectWithScheme/v2/presentation/scheme/TravelRailwaySeatSelectWithSchemeVO$SchemeVO;", "Lru/ozon/app/android/travel/feature/railway/widgets/travelRailwaySeatSelectWithScheme/v2/presentation/scheme/TravelRailwaySeatSelectWithSchemeVO;", "railway_prodGoogleAllVendorsRelease"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class TravelRailwaySeatSelectWithSchemeVOKt {
    /* JADX INFO: Access modifiers changed from: private */
    public static final TravelRailwaySeatSelectWithSchemeVO.SchemeVO toSchemeVO(TravelRailwaySeatSelectWithSchemeVO travelRailwaySeatSelectWithSchemeVO) {
        Object obj;
        List<TravelRailwaySeatSelectWithSchemeVO.SeatVO> seats = travelRailwaySeatSelectWithSchemeVO.getSeats();
        ArrayList arrayList = new ArrayList();
        for (TravelRailwaySeatSelectWithSchemeVO.SeatVO seatVO : seats) {
            SeatItemVO seatItemVO = null;
            if (seatVO.getPosition() != null) {
                Iterator<T> it = travelRailwaySeatSelectWithSchemeVO.getSeatTypes().iterator();
                while (true) {
                    if (!it.hasNext()) {
                        obj = null;
                        break;
                    }
                    obj = it.next();
                    if (Intrinsics.d(((TravelRailwaySeatSelectWithSchemeVO.SeatTypeVO) obj).getName(), seatVO.getSeatTypeName())) {
                        break;
                    }
                }
                TravelRailwaySeatSelectWithSchemeVO.SeatTypeVO seatTypeVO = (TravelRailwaySeatSelectWithSchemeVO.SeatTypeVO) obj;
                if (seatTypeVO != null) {
                    seatItemVO = new SeatItemVO(seatVO, seatTypeVO);
                }
            }
            if (seatItemVO != null) {
                arrayList.add(seatItemVO);
            }
        }
        return new TravelRailwaySeatSelectWithSchemeVO.SchemeVO(travelRailwaySeatSelectWithSchemeVO.getDarkSchemeLink(), travelRailwaySeatSelectWithSchemeVO.getLightSchemeLink(), arrayList, travelRailwaySeatSelectWithSchemeVO.getCompartmentGenders(), travelRailwaySeatSelectWithSchemeVO.getGenderIndicator(), travelRailwaySeatSelectWithSchemeVO.getIsBorderVisible());
    }
}
