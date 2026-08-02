package ru.ozon.app.android.travel.feature.oldwidgets.widgets.travelScrollPriceCalendar.v1.data;

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
import ru.ozon.app.android.travel.feature.oldwidgets.widgets.travelScrollPriceCalendar.v1.data.TravelScrollPriceCalendarDTO;
import ru.ozon.app.android.travel.feature.oldwidgets.widgets.travelScrollPriceCalendar.v1.presentation.TravelScrollPriceCalendarVO;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.data.AtomActionDTO;
import ru.ozon.uni.atoms.data.AtomActionMapperKt;
import ru.ozon.uni.atoms.data.texts.TextAtom;
import ru.ozon.uni.atoms.utils.OzonSpannableString;

@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002*\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u0001j\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0005`\u0006B\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\tH\u0002¢\u0006\u0004\b\f\u0010\rJ*\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u000e\u001a\u00020\u00022\n\u0010\u0010\u001a\u00060\u0003j\u0002`\u000fH\u0096\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u001b\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u000b0\u00042\u0006\u0010\n\u001a\u00020\u0013¢\u0006\u0004\b\u0014\u0010\u0015¨\u0006\u0016"}, d2 = {"Lru/ozon/app/android/travel/feature/oldwidgets/widgets/travelScrollPriceCalendar/v1/data/TravelScrollPriceCalendarMapper;", "Lkotlin/Function2;", "Lru/ozon/app/android/travel/feature/oldwidgets/widgets/travelScrollPriceCalendar/v1/data/TravelScrollPriceCalendarDTO;", "Ll20/d;", "", "Lru/ozon/app/android/travel/feature/oldwidgets/widgets/travelScrollPriceCalendar/v1/presentation/TravelScrollPriceCalendarVO;", "Lru/ozon/app/android/composer/widgets/base/WidgetMapper;", "<init>", "()V", "Lru/ozon/app/android/travel/feature/oldwidgets/widgets/travelScrollPriceCalendar/v1/data/TravelScrollPriceCalendarDTO$DateTabDTO;", "item", "Lru/ozon/app/android/travel/feature/oldwidgets/widgets/travelScrollPriceCalendar/v1/presentation/TravelScrollPriceCalendarVO$DateTabVO;", "mapDateTabDTO", "(Lru/ozon/app/android/travel/feature/oldwidgets/widgets/travelScrollPriceCalendar/v1/data/TravelScrollPriceCalendarDTO$DateTabDTO;)Lru/ozon/app/android/travel/feature/oldwidgets/widgets/travelScrollPriceCalendar/v1/presentation/TravelScrollPriceCalendarVO$DateTabVO;", "state", "Lru/ozon/app/android/composer/view/WidgetInfo;", "widgetInfo", "invoke", "(Lru/ozon/app/android/travel/feature/oldwidgets/widgets/travelScrollPriceCalendar/v1/data/TravelScrollPriceCalendarDTO;Ll20/d;)Ljava/util/List;", "Lru/ozon/app/android/travel/feature/oldwidgets/widgets/travelScrollPriceCalendar/v1/data/TravelScrollPriceCalendarResponse;", "mapTravelScrollPriceCalendarResponse", "(Lru/ozon/app/android/travel/feature/oldwidgets/widgets/travelScrollPriceCalendar/v1/data/TravelScrollPriceCalendarResponse;)Ljava/util/List;", "old-widgets_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class TravelScrollPriceCalendarMapper implements Function2<TravelScrollPriceCalendarDTO, d, List<? extends TravelScrollPriceCalendarVO>> {
    private final TravelScrollPriceCalendarVO.DateTabVO mapDateTabDTO(TravelScrollPriceCalendarDTO.DateTabDTO item) {
        OzonSpannableString text;
        long hashCode = item.getDate().getText().hashCode();
        TextAtom date = item.getDate();
        TextAtom price = item.getPrice();
        boolean z11 = item.getPrice() == null;
        String borderColor = item.getBorderColor();
        String backgroundColor = item.getBackgroundColor();
        AtomActionDTO action = item.getAction();
        String str = null;
        AtomAction atomAction = action != null ? AtomActionMapperKt.toAtomAction(action, null) : null;
        boolean d11 = Intrinsics.d(item.isSelected(), Boolean.TRUE);
        Map<String, TokenizedTrackingInfo> trackingInfo = item.getTrackingInfo();
        TextAtom price2 = item.getPrice();
        if (price2 != null && (text = price2.getText()) != null) {
            StringBuilder sb2 = new StringBuilder();
            int length = text.length();
            for (int i11 = 0; i11 < length; i11++) {
                char charAt = text.charAt(i11);
                if (Character.isDigit(charAt)) {
                    sb2.append(charAt);
                }
            }
            str = sb2.toString();
        }
        return new TravelScrollPriceCalendarVO.DateTabVO(hashCode, date, price, z11, borderColor, backgroundColor, d11, atomAction, trackingInfo, str);
    }

    @NotNull
    public final List<TravelScrollPriceCalendarVO.DateTabVO> mapTravelScrollPriceCalendarResponse(@NotNull TravelScrollPriceCalendarResponse item) {
        Intrinsics.checkNotNullParameter(item, "item");
        List<TravelScrollPriceCalendarDTO.DateTabDTO> dateTabs = item.getDateTabs();
        ArrayList arrayList = new ArrayList(C7714v.z(dateTabs, 10));
        Iterator<T> it = dateTabs.iterator();
        while (it.hasNext()) {
            arrayList.add(mapDateTabDTO((TravelScrollPriceCalendarDTO.DateTabDTO) it.next()));
        }
        return arrayList;
    }

    @Override // kotlin.jvm.functions.Function2
    @NotNull
    public List<TravelScrollPriceCalendarVO> invoke(@NotNull TravelScrollPriceCalendarDTO state, @NotNull d widgetInfo) {
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(widgetInfo, "widgetInfo");
        Iterator<TravelScrollPriceCalendarDTO.DateTabDTO> it = state.getDateTabs().iterator();
        int i11 = 0;
        while (true) {
            if (!it.hasNext()) {
                i11 = -1;
                break;
            }
            if (Intrinsics.d(it.next().isSelected(), Boolean.TRUE)) {
                break;
            }
            i11++;
        }
        long hashCode = widgetInfo.d().hashCode();
        List<TravelScrollPriceCalendarDTO.DateTabDTO> dateTabs = state.getDateTabs();
        ArrayList arrayList = new ArrayList(C7714v.z(dateTabs, 10));
        Iterator<T> it2 = dateTabs.iterator();
        while (it2.hasNext()) {
            arrayList.add(mapDateTabDTO((TravelScrollPriceCalendarDTO.DateTabDTO) it2.next()));
        }
        Integer valueOf = i11 == -1 ? null : Integer.valueOf(i11);
        AtomActionDTO loadingAction = state.getLoadingAction();
        return C7714v.a0(new TravelScrollPriceCalendarVO(hashCode, arrayList, valueOf, loadingAction != null ? AtomActionMapperKt.toAtomAction(loadingAction, null) : null));
    }
}
