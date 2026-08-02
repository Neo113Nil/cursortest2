package ru.ozon.app.android.travel.feature.oldwidgets.widgets.travelPriceDetailInformation.v1.data;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C7714v;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import l20.d;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.travel.feature.oldwidgets.widgets.travelPriceDetailInformation.v1.data.TravelPriceDetailInformationDTO;
import ru.ozon.app.android.travel.feature.oldwidgets.widgets.travelPriceDetailInformation.v1.presentation.TravelPriceDetailInformationVO;
import ru.ozon.app.android.travel.molecules.dto.linkButton.LinkButtonDTO;
import ru.ozon.app.android.travel.molecules.mapper.MapperExtKt;

@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002*\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u0001j\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0005`\u0006B\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u001f\u0010\f\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\f\u001a\u00020\u00102\u0006\u0010\u000f\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\f\u0010\u0011J*\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0012\u001a\u00020\u00022\n\u0010\u0014\u001a\u00060\u0003j\u0002`\u0013H\u0096\u0002¢\u0006\u0004\b\u0015\u0010\u0016¨\u0006\u0017"}, d2 = {"Lru/ozon/app/android/travel/feature/oldwidgets/widgets/travelPriceDetailInformation/v1/data/TravelPriceDetailInformationMapper;", "Lkotlin/Function2;", "Lru/ozon/app/android/travel/feature/oldwidgets/widgets/travelPriceDetailInformation/v1/data/TravelPriceDetailInformationDTO;", "Ll20/d;", "", "Lru/ozon/app/android/travel/feature/oldwidgets/widgets/travelPriceDetailInformation/v1/presentation/TravelPriceDetailInformationVO;", "Lru/ozon/app/android/composer/widgets/base/WidgetMapper;", "<init>", "()V", "dto", "", "stateId", "mapToVO", "(Lru/ozon/app/android/travel/feature/oldwidgets/widgets/travelPriceDetailInformation/v1/data/TravelPriceDetailInformationDTO;Ljava/lang/String;)Lru/ozon/app/android/travel/feature/oldwidgets/widgets/travelPriceDetailInformation/v1/presentation/TravelPriceDetailInformationVO;", "Lru/ozon/app/android/travel/feature/oldwidgets/widgets/travelPriceDetailInformation/v1/data/TravelPriceDetailInformationDTO$PriceBlockDTO$PriceDTO;", "priceDTO", "Lru/ozon/app/android/travel/feature/oldwidgets/widgets/travelPriceDetailInformation/v1/presentation/TravelPriceDetailInformationVO$PriceVO;", "(Lru/ozon/app/android/travel/feature/oldwidgets/widgets/travelPriceDetailInformation/v1/data/TravelPriceDetailInformationDTO$PriceBlockDTO$PriceDTO;)Lru/ozon/app/android/travel/feature/oldwidgets/widgets/travelPriceDetailInformation/v1/presentation/TravelPriceDetailInformationVO$PriceVO;", "state", "Lru/ozon/app/android/composer/view/WidgetInfo;", "widgetInfo", "invoke", "(Lru/ozon/app/android/travel/feature/oldwidgets/widgets/travelPriceDetailInformation/v1/data/TravelPriceDetailInformationDTO;Ll20/d;)Ljava/util/List;", "old-widgets_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class TravelPriceDetailInformationMapper implements Function2<TravelPriceDetailInformationDTO, d, List<? extends TravelPriceDetailInformationVO>> {
    private final TravelPriceDetailInformationVO mapToVO(TravelPriceDetailInformationDTO dto, String stateId) {
        long hashCode = stateId.hashCode();
        String title = dto.getPrices().getTitle();
        String subtitle = dto.getPrices().getSubtitle();
        List<TravelPriceDetailInformationDTO.PriceBlockDTO.PriceDTO> orderPrice = dto.getPrices().getOrderPrice();
        ArrayList arrayList = new ArrayList(C7714v.z(orderPrice, 10));
        Iterator<T> it = orderPrice.iterator();
        while (it.hasNext()) {
            arrayList.add(mapToVO((TravelPriceDetailInformationDTO.PriceBlockDTO.PriceDTO) it.next()));
        }
        return new TravelPriceDetailInformationVO(hashCode, title, subtitle, arrayList, dto.getTotalPrice().getTitle(), dto.getTotalPrice().getTotalPrice(), dto.getTotalPrice().getSmallIconButton(), dto.getLargeButton(), dto.getAgreementText(), dto.getBonusButton(), dto.getBonusButton() != null);
    }

    @Override // kotlin.jvm.functions.Function2
    @NotNull
    public List<TravelPriceDetailInformationVO> invoke(@NotNull TravelPriceDetailInformationDTO state, @NotNull d widgetInfo) {
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(widgetInfo, "widgetInfo");
        return C7714v.a0(mapToVO(state, widgetInfo.d()));
    }

    private final TravelPriceDetailInformationVO.PriceVO mapToVO(TravelPriceDetailInformationDTO.PriceBlockDTO.PriceDTO priceDTO) {
        String title = priceDTO.getTitle();
        String price = priceDTO.getPrice();
        LinkButtonDTO detailsButton = priceDTO.getDetailsButton();
        return new TravelPriceDetailInformationVO.PriceVO(title, price, detailsButton != null ? MapperExtKt.toVO(detailsButton) : null);
    }
}
