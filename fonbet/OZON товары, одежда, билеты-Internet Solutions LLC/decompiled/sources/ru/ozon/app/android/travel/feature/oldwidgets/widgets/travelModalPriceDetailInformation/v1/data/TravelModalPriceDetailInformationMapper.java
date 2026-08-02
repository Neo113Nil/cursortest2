package ru.ozon.app.android.travel.feature.oldwidgets.widgets.travelModalPriceDetailInformation.v1.data;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C7714v;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import l20.d;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.travel.feature.oldwidgets.widgets.travelModalPriceDetailInformation.v1.data.TravelModalPriceDetailInformationDTO;
import ru.ozon.app.android.travel.feature.oldwidgets.widgets.travelModalPriceDetailInformation.v1.presentation.sections.TravelModalPriceDetailInformationVO;

@Metadata(d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002*\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u0001j\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0005`\u0006B\u0007¢\u0006\u0004\b\u0007\u0010\bJ'\u0010\u000f\u001a\u00020\u00052\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\rH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0012\u001a\u00020\u0011H\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\u0017\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u0017\u001a\u00020\u0016H\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ*\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u001b\u001a\u00020\u00022\n\u0010\u001d\u001a\u00060\u0003j\u0002`\u001cH\u0096\u0002¢\u0006\u0004\b\u001e\u0010\u001f¨\u0006 "}, d2 = {"Lru/ozon/app/android/travel/feature/oldwidgets/widgets/travelModalPriceDetailInformation/v1/data/TravelModalPriceDetailInformationMapper;", "Lkotlin/Function2;", "Lru/ozon/app/android/travel/feature/oldwidgets/widgets/travelModalPriceDetailInformation/v1/data/TravelModalPriceDetailInformationDTO;", "Ll20/d;", "", "Lru/ozon/app/android/travel/feature/oldwidgets/widgets/travelModalPriceDetailInformation/v1/presentation/sections/TravelModalPriceDetailInformationVO;", "Lru/ozon/app/android/composer/widgets/base/WidgetMapper;", "<init>", "()V", "", "index", "Lru/ozon/app/android/travel/feature/oldwidgets/widgets/travelModalPriceDetailInformation/v1/data/TravelModalPriceDetailInformationDTO$PriceSectionDTO;", "priceSectionDTO", "", "stateId", "mapToVO", "(ILru/ozon/app/android/travel/feature/oldwidgets/widgets/travelModalPriceDetailInformation/v1/data/TravelModalPriceDetailInformationDTO$PriceSectionDTO;Ljava/lang/String;)Lru/ozon/app/android/travel/feature/oldwidgets/widgets/travelModalPriceDetailInformation/v1/presentation/sections/TravelModalPriceDetailInformationVO;", "Lru/ozon/app/android/travel/feature/oldwidgets/widgets/travelModalPriceDetailInformation/v1/data/TravelModalPriceDetailInformationDTO$PriceSectionDTO$PriceDetailsDTO;", "priceDetailsDTO", "Lru/ozon/app/android/travel/feature/oldwidgets/widgets/travelModalPriceDetailInformation/v1/presentation/sections/TravelModalPriceDetailInformationVO$PositionVO;", "mapToPositionVO", "(Lru/ozon/app/android/travel/feature/oldwidgets/widgets/travelModalPriceDetailInformation/v1/data/TravelModalPriceDetailInformationDTO$PriceSectionDTO$PriceDetailsDTO;)Lru/ozon/app/android/travel/feature/oldwidgets/widgets/travelModalPriceDetailInformation/v1/presentation/sections/TravelModalPriceDetailInformationVO$PositionVO;", "Lru/ozon/app/android/travel/feature/oldwidgets/widgets/travelModalPriceDetailInformation/v1/data/TravelModalPriceDetailInformationDTO$PriceSectionDTO$PriceDetailsDTO$PriceDTO;", "priceDTO", "Lru/ozon/app/android/travel/feature/oldwidgets/widgets/travelModalPriceDetailInformation/v1/presentation/sections/TravelModalPriceDetailInformationVO$PositionVO$PositionItemVO;", "mapToPositionItemVO", "(Lru/ozon/app/android/travel/feature/oldwidgets/widgets/travelModalPriceDetailInformation/v1/data/TravelModalPriceDetailInformationDTO$PriceSectionDTO$PriceDetailsDTO$PriceDTO;)Lru/ozon/app/android/travel/feature/oldwidgets/widgets/travelModalPriceDetailInformation/v1/presentation/sections/TravelModalPriceDetailInformationVO$PositionVO$PositionItemVO;", "state", "Lru/ozon/app/android/composer/view/WidgetInfo;", "widgetInfo", "invoke", "(Lru/ozon/app/android/travel/feature/oldwidgets/widgets/travelModalPriceDetailInformation/v1/data/TravelModalPriceDetailInformationDTO;Ll20/d;)Ljava/util/List;", "old-widgets_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class TravelModalPriceDetailInformationMapper implements Function2<TravelModalPriceDetailInformationDTO, d, List<? extends TravelModalPriceDetailInformationVO>> {
    private final TravelModalPriceDetailInformationVO.PositionVO.PositionItemVO mapToPositionItemVO(TravelModalPriceDetailInformationDTO.PriceSectionDTO.PriceDetailsDTO.PriceDTO priceDTO) {
        return new TravelModalPriceDetailInformationVO.PositionVO.PositionItemVO(priceDTO.getTitle(), priceDTO.getPrice());
    }

    private final TravelModalPriceDetailInformationVO.PositionVO mapToPositionVO(TravelModalPriceDetailInformationDTO.PriceSectionDTO.PriceDetailsDTO priceDetailsDTO) {
        ArrayList arrayList;
        String title = priceDetailsDTO.getTitle();
        String price = priceDetailsDTO.getPrice();
        List<TravelModalPriceDetailInformationDTO.PriceSectionDTO.PriceDetailsDTO.PriceDTO> prices = priceDetailsDTO.getPrices();
        if (prices != null) {
            List<TravelModalPriceDetailInformationDTO.PriceSectionDTO.PriceDetailsDTO.PriceDTO> list = prices;
            arrayList = new ArrayList(C7714v.z(list, 10));
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(mapToPositionItemVO((TravelModalPriceDetailInformationDTO.PriceSectionDTO.PriceDetailsDTO.PriceDTO) it.next()));
            }
        } else {
            arrayList = null;
        }
        return new TravelModalPriceDetailInformationVO.PositionVO(title, price, arrayList);
    }

    private final TravelModalPriceDetailInformationVO mapToVO(int index, TravelModalPriceDetailInformationDTO.PriceSectionDTO priceSectionDTO, String stateId) {
        ArrayList arrayList;
        long hashCode = (index + "-" + stateId).hashCode();
        String title = priceSectionDTO.getTitle();
        String totalPrice = priceSectionDTO.getTotalPrice();
        String subtitle = priceSectionDTO.getSubtitle();
        List<TravelModalPriceDetailInformationDTO.PriceSectionDTO.PriceDetailsDTO> priceDetails = priceSectionDTO.getPriceDetails();
        if (priceDetails != null) {
            List<TravelModalPriceDetailInformationDTO.PriceSectionDTO.PriceDetailsDTO> list = priceDetails;
            arrayList = new ArrayList(C7714v.z(list, 10));
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(mapToPositionVO((TravelModalPriceDetailInformationDTO.PriceSectionDTO.PriceDetailsDTO) it.next()));
            }
        } else {
            arrayList = null;
        }
        return new TravelModalPriceDetailInformationVO(hashCode, title, totalPrice, subtitle, arrayList);
    }

    @Override // kotlin.jvm.functions.Function2
    @NotNull
    public List<TravelModalPriceDetailInformationVO> invoke(@NotNull TravelModalPriceDetailInformationDTO state, @NotNull d widgetInfo) {
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(widgetInfo, "widgetInfo");
        List<TravelModalPriceDetailInformationDTO.PriceSectionDTO> priceSections = state.getPriceSections();
        ArrayList arrayList = new ArrayList(C7714v.z(priceSections, 10));
        int i11 = 0;
        for (Object obj : priceSections) {
            int i12 = i11 + 1;
            if (i11 < 0) {
                C7714v.O0();
                throw null;
            }
            arrayList.add(mapToVO(i11, (TravelModalPriceDetailInformationDTO.PriceSectionDTO) obj, widgetInfo.d()));
            i11 = i12;
        }
        return arrayList;
    }
}
