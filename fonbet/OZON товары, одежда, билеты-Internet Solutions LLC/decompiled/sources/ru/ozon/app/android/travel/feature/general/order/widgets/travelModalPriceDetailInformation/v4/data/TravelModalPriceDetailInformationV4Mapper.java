package ru.ozon.app.android.travel.feature.general.order.widgets.travelModalPriceDetailInformation.v4.data;

import Tc.b;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.C7714v;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.random.c;
import l20.d;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.tokenized.model.TokenizedTrackingInfo;
import ru.ozon.app.android.composer.TrackingInfoMapperKt;
import ru.ozon.app.android.travel.feature.general.order.widgets.travelModalPriceDetailInformation.v4.data.TravelModalPriceDetailInformationV4DTO;
import ru.ozon.app.android.travel.feature.general.order.widgets.travelModalPriceDetailInformation.v4.presentation.TravelModalPriceDetailInformationV4VO;
import ru.ozon.uni.atoms.data.price.PriceDTO;
import ru.ozon.uni.atoms.data.text.TextDTO;
import ru.ozon.uni.atoms.utils.OzonSpannableString;

@Metadata(d1 = {"\u0000h\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002*\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u0001j\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0005`\u0006B\u0007¢\u0006\u0004\b\u0007\u0010\bJ%\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\u00042\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u001d\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\r0\u00042\u0006\u0010\u0011\u001a\u00020\u0010H\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u0017\u0010\u0015\u001a\u00020\u00142\u0006\u0010\f\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\u0017\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0011\u001a\u00020\u0010H\u0002¢\u0006\u0004\b\u0018\u0010\u0019J\u0017\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u0011\u001a\u00020\u001aH\u0002¢\u0006\u0004\b\u001c\u0010\u001dJ\u000f\u0010\u001f\u001a\u00020\u001eH\u0002¢\u0006\u0004\b\u001f\u0010 J\u000f\u0010!\u001a\u00020\u001eH\u0002¢\u0006\u0004\b!\u0010 J\u000f\u0010\"\u001a\u00020\u001eH\u0002¢\u0006\u0004\b\"\u0010 J*\u0010&\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010#\u001a\u00020\u00022\n\u0010%\u001a\u00060\u0003j\u0002`$H\u0096\u0002¢\u0006\u0004\b&\u0010'¨\u0006("}, d2 = {"Lru/ozon/app/android/travel/feature/general/order/widgets/travelModalPriceDetailInformation/v4/data/TravelModalPriceDetailInformationV4Mapper;", "Lkotlin/Function2;", "Lru/ozon/app/android/travel/feature/general/order/widgets/travelModalPriceDetailInformation/v4/data/TravelModalPriceDetailInformationV4DTO;", "Ll20/d;", "", "Lru/ozon/app/android/travel/feature/general/order/widgets/travelModalPriceDetailInformation/v4/presentation/TravelModalPriceDetailInformationV4VO;", "Lru/ozon/app/android/composer/widgets/base/WidgetMapper;", "<init>", "()V", "", "index", "Lru/ozon/app/android/travel/feature/general/order/widgets/travelModalPriceDetailInformation/v4/data/TravelModalPriceDetailInformationV4DTO$PriceSectionDTO;", "priceSection", "Lru/ozon/app/android/travel/feature/general/order/widgets/travelModalPriceDetailInformation/v4/presentation/TravelModalPriceDetailInformationV4VO$PriceItem;", "mapPriceItems", "(ILru/ozon/app/android/travel/feature/general/order/widgets/travelModalPriceDetailInformation/v4/data/TravelModalPriceDetailInformationV4DTO$PriceSectionDTO;)Ljava/util/List;", "Lru/ozon/app/android/travel/feature/general/order/widgets/travelModalPriceDetailInformation/v4/data/TravelModalPriceDetailInformationV4DTO$PriceDetailsDTO;", "priceDetails", "mapPriceDetails", "(Lru/ozon/app/android/travel/feature/general/order/widgets/travelModalPriceDetailInformation/v4/data/TravelModalPriceDetailInformationV4DTO$PriceDetailsDTO;)Ljava/util/List;", "Lru/ozon/app/android/travel/feature/general/order/widgets/travelModalPriceDetailInformation/v4/presentation/TravelModalPriceDetailInformationV4VO$PriceSectionVO;", "mapPriceSectionToVO", "(Lru/ozon/app/android/travel/feature/general/order/widgets/travelModalPriceDetailInformation/v4/data/TravelModalPriceDetailInformationV4DTO$PriceSectionDTO;)Lru/ozon/app/android/travel/feature/general/order/widgets/travelModalPriceDetailInformation/v4/presentation/TravelModalPriceDetailInformationV4VO$PriceSectionVO;", "Lru/ozon/app/android/travel/feature/general/order/widgets/travelModalPriceDetailInformation/v4/presentation/TravelModalPriceDetailInformationV4VO$PriceDetailsVO;", "mapPriceDetailsToVO", "(Lru/ozon/app/android/travel/feature/general/order/widgets/travelModalPriceDetailInformation/v4/data/TravelModalPriceDetailInformationV4DTO$PriceDetailsDTO;)Lru/ozon/app/android/travel/feature/general/order/widgets/travelModalPriceDetailInformation/v4/presentation/TravelModalPriceDetailInformationV4VO$PriceDetailsVO;", "Lru/ozon/app/android/travel/feature/general/order/widgets/travelModalPriceDetailInformation/v4/data/TravelModalPriceDetailInformationV4DTO$PriceItemDTO;", "Lru/ozon/app/android/travel/feature/general/order/widgets/travelModalPriceDetailInformation/v4/presentation/TravelModalPriceDetailInformationV4VO$PriceItemVO;", "mapPriceToVO", "(Lru/ozon/app/android/travel/feature/general/order/widgets/travelModalPriceDetailInformation/v4/data/TravelModalPriceDetailInformationV4DTO$PriceItemDTO;)Lru/ozon/app/android/travel/feature/general/order/widgets/travelModalPriceDetailInformation/v4/presentation/TravelModalPriceDetailInformationV4VO$PriceItemVO;", "Lru/ozon/app/android/travel/feature/general/order/widgets/travelModalPriceDetailInformation/v4/presentation/TravelModalPriceDetailInformationV4VO$PriceSpacer;", "getDivider", "()Lru/ozon/app/android/travel/feature/general/order/widgets/travelModalPriceDetailInformation/v4/presentation/TravelModalPriceDetailInformationV4VO$PriceSpacer;", "getSmallSpacer", "getBigSpacer", "state", "Lru/ozon/app/android/composer/view/WidgetInfo;", "widgetInfo", "invoke", "(Lru/ozon/app/android/travel/feature/general/order/widgets/travelModalPriceDetailInformation/v4/data/TravelModalPriceDetailInformationV4DTO;Ll20/d;)Ljava/util/List;", "order_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class TravelModalPriceDetailInformationV4Mapper implements Function2<TravelModalPriceDetailInformationV4DTO, d, List<? extends TravelModalPriceDetailInformationV4VO>> {
    private final TravelModalPriceDetailInformationV4VO.PriceSpacer getBigSpacer() {
        return new TravelModalPriceDetailInformationV4VO.PriceSpacer(c.INSTANCE.g(), TravelModalPriceDetailInformationV4VO.PriceSpacer.Size.BIG, false);
    }

    private final TravelModalPriceDetailInformationV4VO.PriceSpacer getDivider() {
        return new TravelModalPriceDetailInformationV4VO.PriceSpacer(c.INSTANCE.g(), TravelModalPriceDetailInformationV4VO.PriceSpacer.Size.NONE, true);
    }

    private final TravelModalPriceDetailInformationV4VO.PriceSpacer getSmallSpacer() {
        return new TravelModalPriceDetailInformationV4VO.PriceSpacer(c.INSTANCE.g(), TravelModalPriceDetailInformationV4VO.PriceSpacer.Size.SMALL, false);
    }

    private final List<TravelModalPriceDetailInformationV4VO.PriceItem> mapPriceDetails(TravelModalPriceDetailInformationV4DTO.PriceDetailsDTO priceDetails) {
        TravelModalPriceDetailInformationV4VO.PriceSpacer smallSpacer = getSmallSpacer();
        if (priceDetails.getPrices() == null || !(!r1.isEmpty())) {
            smallSpacer = null;
        }
        b builder = C7714v.B();
        if (smallSpacer != null) {
            builder.add(smallSpacer);
        }
        builder.add(mapPriceDetailsToVO(priceDetails));
        List<TravelModalPriceDetailInformationV4DTO.PriceItemDTO> prices = priceDetails.getPrices();
        if (prices != null) {
            List<TravelModalPriceDetailInformationV4DTO.PriceItemDTO> list = prices;
            ArrayList arrayList = new ArrayList(C7714v.z(list, 10));
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(mapPriceToVO((TravelModalPriceDetailInformationV4DTO.PriceItemDTO) it.next()));
            }
            builder.addAll(arrayList);
        }
        Intrinsics.checkNotNullParameter(builder, "builder");
        return builder.B();
    }

    private final TravelModalPriceDetailInformationV4VO.PriceDetailsVO mapPriceDetailsToVO(TravelModalPriceDetailInformationV4DTO.PriceDetailsDTO priceDetails) {
        OzonSpannableString text = priceDetails.getTitle().getText();
        PriceDTO totalPrice = priceDetails.getTotalPrice();
        List<PriceDTO.Component> price = totalPrice != null ? totalPrice.getPrice() : null;
        StringBuilder sb2 = new StringBuilder();
        sb2.append((Object) text);
        sb2.append(price);
        return new TravelModalPriceDetailInformationV4VO.PriceDetailsVO(sb2.toString().hashCode(), priceDetails.getTitle(), priceDetails.getTotalPrice());
    }

    private final List<TravelModalPriceDetailInformationV4VO.PriceItem> mapPriceItems(int index, TravelModalPriceDetailInformationV4DTO.PriceSectionDTO priceSection) {
        TravelModalPriceDetailInformationV4VO.PriceSpacer divider = getDivider();
        if (index == 0) {
            divider = null;
        }
        TravelModalPriceDetailInformationV4VO.PriceSpacer bigSpacer = (priceSection.getTitle() == null && priceSection.getSubtitle() == null && priceSection.getTotalPrice() == null) ? null : getBigSpacer();
        b builder = C7714v.B();
        if (divider != null) {
            builder.add(divider);
        }
        builder.add(mapPriceSectionToVO(priceSection));
        if (bigSpacer != null) {
            builder.add(bigSpacer);
        }
        List<TravelModalPriceDetailInformationV4DTO.PriceDetailsDTO> priceDetails = priceSection.getPriceDetails();
        if (priceDetails != null) {
            ArrayList arrayList = new ArrayList();
            Iterator<T> it = priceDetails.iterator();
            while (it.hasNext()) {
                C7714v.p(mapPriceDetails((TravelModalPriceDetailInformationV4DTO.PriceDetailsDTO) it.next()), arrayList);
            }
            builder.addAll(arrayList);
        }
        Intrinsics.checkNotNullParameter(builder, "builder");
        return builder.B();
    }

    private final TravelModalPriceDetailInformationV4VO.PriceSectionVO mapPriceSectionToVO(TravelModalPriceDetailInformationV4DTO.PriceSectionDTO priceSection) {
        TextDTO title = priceSection.getTitle();
        OzonSpannableString text = title != null ? title.getText() : null;
        PriceDTO totalPrice = priceSection.getTotalPrice();
        List<PriceDTO.Component> price = totalPrice != null ? totalPrice.getPrice() : null;
        StringBuilder sb2 = new StringBuilder();
        sb2.append((Object) text);
        sb2.append(price);
        return new TravelModalPriceDetailInformationV4VO.PriceSectionVO(sb2.toString().hashCode(), priceSection.getTitle(), priceSection.getSubtitle(), priceSection.getTotalPrice());
    }

    private final TravelModalPriceDetailInformationV4VO.PriceItemVO mapPriceToVO(TravelModalPriceDetailInformationV4DTO.PriceItemDTO priceDetails) {
        OzonSpannableString text = priceDetails.getProduct().getText();
        PriceDTO price = priceDetails.getPrice();
        List<PriceDTO.Component> price2 = price != null ? price.getPrice() : null;
        StringBuilder sb2 = new StringBuilder();
        sb2.append((Object) text);
        sb2.append(price2);
        return new TravelModalPriceDetailInformationV4VO.PriceItemVO(sb2.toString().hashCode(), priceDetails.getProduct(), priceDetails.getPrice(), priceDetails.getBadge());
    }

    @Override // kotlin.jvm.functions.Function2
    @NotNull
    public List<TravelModalPriceDetailInformationV4VO> invoke(@NotNull TravelModalPriceDetailInformationV4DTO state, @NotNull d widgetInfo) {
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(widgetInfo, "widgetInfo");
        long hashCode = widgetInfo.d().hashCode();
        TextDTO header = state.getHeader();
        List<TravelModalPriceDetailInformationV4DTO.PriceSectionDTO> priceSections = state.getPriceSections();
        ArrayList arrayList = new ArrayList();
        Iterator<T> it = priceSections.iterator();
        int i11 = 0;
        while (true) {
            if (!it.hasNext()) {
                Map<String, TokenizedTrackingInfo> trackingInfo = state.getTrackingInfo();
                return C7714v.a0(new TravelModalPriceDetailInformationV4VO(hashCode, header, arrayList, trackingInfo != null ? TrackingInfoMapperKt.toTokenizedEvent$default(trackingInfo, Long.valueOf(hashCode), null, 2, null) : null));
            }
            Object next = it.next();
            int i12 = i11 + 1;
            if (i11 < 0) {
                C7714v.O0();
                throw null;
            }
            C7714v.p(mapPriceItems(i11, (TravelModalPriceDetailInformationV4DTO.PriceSectionDTO) next), arrayList);
            i11 = i12;
        }
    }
}
