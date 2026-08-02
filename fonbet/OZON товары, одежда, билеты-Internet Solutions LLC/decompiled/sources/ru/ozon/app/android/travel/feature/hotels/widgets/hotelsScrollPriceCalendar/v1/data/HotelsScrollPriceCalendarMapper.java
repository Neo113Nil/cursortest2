package ru.ozon.app.android.travel.feature.hotels.widgets.hotelsScrollPriceCalendar.v1.data;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.C7714v;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import l20.d;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.tokenized.model.TokenizedTrackingInfo;
import ru.ozon.app.android.composer.TrackingInfoMapperKt;
import ru.ozon.app.android.travel.feature.hotels.widgets.hotelsScrollPriceCalendar.v1.data.HotelsScrollPriceCalendarDTO;
import ru.ozon.app.android.travel.feature.hotels.widgets.hotelsScrollPriceCalendar.v1.presentation.HotelsScrollPriceCalendarVO;
import ru.ozon.uni.atoms.data.controls.CommonControlSettings;
import ru.ozon.uni.atoms.data.text.TextDTO;

@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\t\b\u0001\u0018\u00002*\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u0001j\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0005`\u0006B\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u0013\u0010\u000b\u001a\u00020\n*\u00020\tH\u0002¢\u0006\u0004\b\u000b\u0010\fJ%\u0010\u0010\u001a\u0004\u0018\u00010\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\r2\b\u0010\u000f\u001a\u0004\u0018\u00010\rH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J&\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0012\u001a\u00020\u00022\u0006\u0010\u0013\u001a\u00020\u0003H\u0096\u0002¢\u0006\u0004\b\u0014\u0010\u0015¨\u0006\u0016"}, d2 = {"Lru/ozon/app/android/travel/feature/hotels/widgets/hotelsScrollPriceCalendar/v1/data/HotelsScrollPriceCalendarMapper;", "Lkotlin/Function2;", "Lru/ozon/app/android/travel/feature/hotels/widgets/hotelsScrollPriceCalendar/v1/data/HotelsScrollPriceCalendarDTO;", "Ll20/d;", "", "Lru/ozon/app/android/travel/feature/hotels/widgets/hotelsScrollPriceCalendar/v1/presentation/HotelsScrollPriceCalendarVO;", "Lru/ozon/app/android/composer/widgets/base/WidgetMapper;", "<init>", "()V", "Lru/ozon/app/android/travel/feature/hotels/widgets/hotelsScrollPriceCalendar/v1/data/HotelsScrollPriceCalendarDTO$DatePriceItem;", "Lru/ozon/app/android/travel/feature/hotels/widgets/hotelsScrollPriceCalendar/v1/presentation/HotelsScrollPriceCalendarVO$DatePriceItem;", "toVO", "(Lru/ozon/app/android/travel/feature/hotels/widgets/hotelsScrollPriceCalendar/v1/data/HotelsScrollPriceCalendarDTO$DatePriceItem;)Lru/ozon/app/android/travel/feature/hotels/widgets/hotelsScrollPriceCalendar/v1/presentation/HotelsScrollPriceCalendarVO$DatePriceItem;", "", "scrollIndex", "datePricesSize", "calculateValidScrollIndex", "(Ljava/lang/Integer;Ljava/lang/Integer;)Ljava/lang/Integer;", "state", "widgetInfo", "invoke", "(Lru/ozon/app/android/travel/feature/hotels/widgets/hotelsScrollPriceCalendar/v1/data/HotelsScrollPriceCalendarDTO;Ll20/d;)Ljava/util/List;", "hotels_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class HotelsScrollPriceCalendarMapper implements Function2<HotelsScrollPriceCalendarDTO, d, List<? extends HotelsScrollPriceCalendarVO>> {
    private final Integer calculateValidScrollIndex(Integer scrollIndex, Integer datePricesSize) {
        int intValue;
        if (scrollIndex == null || datePricesSize == null || (intValue = scrollIndex.intValue()) < 0 || intValue >= datePricesSize.intValue()) {
            return null;
        }
        return scrollIndex;
    }

    private final HotelsScrollPriceCalendarVO.DatePriceItem toVO(HotelsScrollPriceCalendarDTO.DatePriceItem datePriceItem) {
        int hashCode = datePriceItem.getDateInterval().getText().hashCode();
        TextDTO weekdaysInterval = datePriceItem.getWeekdaysInterval();
        TextDTO dateInterval = datePriceItem.getDateInterval();
        TextDTO price = datePriceItem.getPrice();
        CommonControlSettings common = datePriceItem.getCommon();
        return new HotelsScrollPriceCalendarVO.DatePriceItem(hashCode, weekdaysInterval, dateInterval, price, common != null ? common.toAtomAction() : null);
    }

    @Override // kotlin.jvm.functions.Function2
    @NotNull
    public List<HotelsScrollPriceCalendarVO> invoke(@NotNull HotelsScrollPriceCalendarDTO state, @NotNull d widgetInfo) {
        ArrayList arrayList;
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(widgetInfo, "widgetInfo");
        long hashCode = widgetInfo.d().hashCode();
        TextDTO title = state.getTitle();
        List<HotelsScrollPriceCalendarDTO.DatePriceItem> datePrices = state.getDatePrices();
        if (datePrices != null) {
            List<HotelsScrollPriceCalendarDTO.DatePriceItem> list = datePrices;
            arrayList = new ArrayList(C7714v.z(list, 10));
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(toVO((HotelsScrollPriceCalendarDTO.DatePriceItem) it.next()));
            }
        } else {
            arrayList = null;
        }
        Integer autoScrollIndex = state.getAutoScrollIndex();
        List<HotelsScrollPriceCalendarDTO.DatePriceItem> datePrices2 = state.getDatePrices();
        Integer calculateValidScrollIndex = calculateValidScrollIndex(autoScrollIndex, datePrices2 != null ? Integer.valueOf(datePrices2.size()) : null);
        Map<String, TokenizedTrackingInfo> trackingInfo = state.getTrackingInfo();
        return C7714v.a0(new HotelsScrollPriceCalendarVO(hashCode, title, arrayList, calculateValidScrollIndex, trackingInfo != null ? TrackingInfoMapperKt.mapToTokenizedEvent$default(trackingInfo, Long.valueOf(hashCode), null, 2, null) : null));
    }
}
