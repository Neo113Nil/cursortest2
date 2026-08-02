package ru.ozon.app.android.travel.feature.general.order.widgets.travelModalPriceDetailInformation.v3.data;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C7714v;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import l20.d;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.travel.feature.general.order.widgets.travelModalPriceDetailInformation.v3.data.TravelModalPriceDetailInformationV3DTO;
import ru.ozon.app.android.travel.feature.general.order.widgets.travelModalPriceDetailInformation.v3.presentation.TravelModalPriceDetailInformationV3VO;
import ru.ozon.uni.atoms.data.texts.TextAtom;
import ru.ozon.uni.atoms.utils.OzonSpannableString;

@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002*\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u0001j\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0005`\u0006B\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\tH\u0002¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000f\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u0017\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u000f\u001a\u00020\u0013H\u0002¢\u0006\u0004\b\u0015\u0010\u0016J*\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0017\u001a\u00020\u00022\n\u0010\u0019\u001a\u00060\u0003j\u0002`\u0018H\u0096\u0002¢\u0006\u0004\b\u001a\u0010\u001b¨\u0006\u001c"}, d2 = {"Lru/ozon/app/android/travel/feature/general/order/widgets/travelModalPriceDetailInformation/v3/data/TravelModalPriceDetailInformationV3Mapper;", "Lkotlin/Function2;", "Lru/ozon/app/android/travel/feature/general/order/widgets/travelModalPriceDetailInformation/v3/data/TravelModalPriceDetailInformationV3DTO;", "Ll20/d;", "", "Lru/ozon/app/android/travel/feature/general/order/widgets/travelModalPriceDetailInformation/v3/presentation/TravelModalPriceDetailInformationV3VO;", "Lru/ozon/app/android/composer/widgets/base/WidgetMapper;", "<init>", "()V", "Lru/ozon/app/android/travel/feature/general/order/widgets/travelModalPriceDetailInformation/v3/data/TravelModalPriceDetailInformationV3DTO$PriceSection;", "priceSection", "Lru/ozon/app/android/travel/feature/general/order/widgets/travelModalPriceDetailInformation/v3/presentation/TravelModalPriceDetailInformationV3VO$PriceSectionVO;", "mapPriceSectionToVO", "(Lru/ozon/app/android/travel/feature/general/order/widgets/travelModalPriceDetailInformation/v3/data/TravelModalPriceDetailInformationV3DTO$PriceSection;)Lru/ozon/app/android/travel/feature/general/order/widgets/travelModalPriceDetailInformation/v3/presentation/TravelModalPriceDetailInformationV3VO$PriceSectionVO;", "Lru/ozon/app/android/travel/feature/general/order/widgets/travelModalPriceDetailInformation/v3/data/TravelModalPriceDetailInformationV3DTO$PriceDetails;", "priceDetails", "Lru/ozon/app/android/travel/feature/general/order/widgets/travelModalPriceDetailInformation/v3/presentation/TravelModalPriceDetailInformationV3VO$PriceDetailsVO;", "mapPriceDetailsToVO", "(Lru/ozon/app/android/travel/feature/general/order/widgets/travelModalPriceDetailInformation/v3/data/TravelModalPriceDetailInformationV3DTO$PriceDetails;)Lru/ozon/app/android/travel/feature/general/order/widgets/travelModalPriceDetailInformation/v3/presentation/TravelModalPriceDetailInformationV3VO$PriceDetailsVO;", "Lru/ozon/app/android/travel/feature/general/order/widgets/travelModalPriceDetailInformation/v3/data/TravelModalPriceDetailInformationV3DTO$Price;", "Lru/ozon/app/android/travel/feature/general/order/widgets/travelModalPriceDetailInformation/v3/presentation/TravelModalPriceDetailInformationV3VO$PriceVO;", "mapPriceToVO", "(Lru/ozon/app/android/travel/feature/general/order/widgets/travelModalPriceDetailInformation/v3/data/TravelModalPriceDetailInformationV3DTO$Price;)Lru/ozon/app/android/travel/feature/general/order/widgets/travelModalPriceDetailInformation/v3/presentation/TravelModalPriceDetailInformationV3VO$PriceVO;", "state", "Lru/ozon/app/android/composer/view/WidgetInfo;", "widgetInfo", "invoke", "(Lru/ozon/app/android/travel/feature/general/order/widgets/travelModalPriceDetailInformation/v3/data/TravelModalPriceDetailInformationV3DTO;Ll20/d;)Ljava/util/List;", "order_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class TravelModalPriceDetailInformationV3Mapper implements Function2<TravelModalPriceDetailInformationV3DTO, d, List<? extends TravelModalPriceDetailInformationV3VO>> {
    private final TravelModalPriceDetailInformationV3VO.PriceDetailsVO mapPriceDetailsToVO(TravelModalPriceDetailInformationV3DTO.PriceDetails priceDetails) {
        OzonSpannableString text = priceDetails.getTitle().getText();
        TextAtom totalPrice = priceDetails.getTotalPrice();
        ArrayList arrayList = null;
        OzonSpannableString text2 = totalPrice != null ? totalPrice.getText() : null;
        StringBuilder sb2 = new StringBuilder();
        sb2.append((Object) text);
        sb2.append((Object) text2);
        long hashCode = sb2.toString().hashCode();
        TextAtom title = priceDetails.getTitle();
        TextAtom totalPrice2 = priceDetails.getTotalPrice();
        List<TravelModalPriceDetailInformationV3DTO.Price> prices = priceDetails.getPrices();
        boolean z11 = !(prices == null || prices.isEmpty());
        List<TravelModalPriceDetailInformationV3DTO.Price> prices2 = priceDetails.getPrices();
        if (prices2 != null) {
            List<TravelModalPriceDetailInformationV3DTO.Price> list = prices2;
            arrayList = new ArrayList(C7714v.z(list, 10));
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(mapPriceToVO((TravelModalPriceDetailInformationV3DTO.Price) it.next()));
            }
        }
        return new TravelModalPriceDetailInformationV3VO.PriceDetailsVO(hashCode, title, totalPrice2, z11, arrayList);
    }

    private final TravelModalPriceDetailInformationV3VO.PriceSectionVO mapPriceSectionToVO(TravelModalPriceDetailInformationV3DTO.PriceSection priceSection) {
        boolean z11;
        TextAtom title = priceSection.getTitle();
        ArrayList arrayList = null;
        OzonSpannableString text = title != null ? title.getText() : null;
        TextAtom totalPrice = priceSection.getTotalPrice();
        OzonSpannableString text2 = totalPrice != null ? totalPrice.getText() : null;
        StringBuilder sb2 = new StringBuilder();
        sb2.append((Object) text);
        sb2.append((Object) text2);
        long hashCode = sb2.toString().hashCode();
        TextAtom title2 = priceSection.getTitle();
        TextAtom subtitle = priceSection.getSubtitle();
        TextAtom totalPrice2 = priceSection.getTotalPrice();
        boolean z12 = true;
        if (priceSection.getTitle() == null && priceSection.getSubtitle() == null && priceSection.getTotalPrice() == null) {
            z11 = true;
        } else {
            z11 = true;
            z12 = false;
        }
        List<TravelModalPriceDetailInformationV3DTO.PriceDetails> priceDetails = priceSection.getPriceDetails();
        boolean z13 = !((priceDetails == null || priceDetails.isEmpty()) ? z11 : false);
        List<TravelModalPriceDetailInformationV3DTO.PriceDetails> priceDetails2 = priceSection.getPriceDetails();
        if (priceDetails2 != null) {
            List<TravelModalPriceDetailInformationV3DTO.PriceDetails> list = priceDetails2;
            arrayList = new ArrayList(C7714v.z(list, 10));
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(mapPriceDetailsToVO((TravelModalPriceDetailInformationV3DTO.PriceDetails) it.next()));
            }
        }
        return new TravelModalPriceDetailInformationV3VO.PriceSectionVO(hashCode, title2, subtitle, totalPrice2, z12, z13, arrayList);
    }

    private final TravelModalPriceDetailInformationV3VO.PriceVO mapPriceToVO(TravelModalPriceDetailInformationV3DTO.Price priceDetails) {
        OzonSpannableString text = priceDetails.getProduct().getText();
        TextAtom price = priceDetails.getPrice();
        OzonSpannableString text2 = price != null ? price.getText() : null;
        StringBuilder sb2 = new StringBuilder();
        sb2.append((Object) text);
        sb2.append((Object) text2);
        return new TravelModalPriceDetailInformationV3VO.PriceVO(sb2.toString().hashCode(), priceDetails.getProduct(), priceDetails.getPrice());
    }

    @Override // kotlin.jvm.functions.Function2
    @NotNull
    public List<TravelModalPriceDetailInformationV3VO> invoke(@NotNull TravelModalPriceDetailInformationV3DTO state, @NotNull d widgetInfo) {
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(widgetInfo, "widgetInfo");
        long hashCode = widgetInfo.d().hashCode();
        TextAtom header = state.getHeader();
        List<TravelModalPriceDetailInformationV3DTO.PriceSection> priceSections = state.getPriceSections();
        ArrayList arrayList = new ArrayList(C7714v.z(priceSections, 10));
        Iterator<T> it = priceSections.iterator();
        while (it.hasNext()) {
            arrayList.add(mapPriceSectionToVO((TravelModalPriceDetailInformationV3DTO.PriceSection) it.next()));
        }
        return C7714v.a0(new TravelModalPriceDetailInformationV3VO(hashCode, header, arrayList));
    }
}
