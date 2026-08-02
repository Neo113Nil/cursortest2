package ru.ozon.app.android.travel.feature.general.order.widgets.flightOrderDetails.v4.data;

import WZ.t;
import WZ.x;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.C7714v;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import l20.d;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.tokenized.model.TokenizedTrackingInfo;
import ru.ozon.app.android.travel.feature.general.order.widgets.flightOrderDetails.v4.data.FlightOrderDetailsV4DTO;
import ru.ozon.app.android.travel.feature.general.order.widgets.flightOrderDetails.v4.presentation.FlightOrderDetailsV4VO;
import ru.ozon.uni.atoms.data.text.TextDTO;

@Metadata(d1 = {"\u0000h\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002*\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u0001j\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0005`\u0006B\u0007¢\u0006\u0004\b\u0007\u0010\bJ=\u0010\u0012\u001a\u00020\u00052\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000b2\u0014\u0010\u0010\u001a\u0010\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u000f\u0018\u00010\r2\u0006\u0010\u0011\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u0017\u0010\u0016\u001a\u00020\u00152\u0006\u0010\f\u001a\u00020\u0014H\u0002¢\u0006\u0004\b\u0016\u0010\u0017J\u0013\u0010\u001a\u001a\u00020\u0019*\u00020\u0018H\u0002¢\u0006\u0004\b\u001a\u0010\u001bJ\u0013\u0010\u001a\u001a\u00020\u001d*\u00020\u001cH\u0002¢\u0006\u0004\b\u001a\u0010\u001eJ*\u0010\"\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u001f\u001a\u00020\u00022\n\u0010!\u001a\u00060\u0003j\u0002` H\u0096\u0002¢\u0006\u0004\b\"\u0010#¨\u0006$"}, d2 = {"Lru/ozon/app/android/travel/feature/general/order/widgets/flightOrderDetails/v4/data/FlightOrderDetailsV4Mapper;", "Lkotlin/Function2;", "Lru/ozon/app/android/travel/feature/general/order/widgets/flightOrderDetails/v4/data/FlightOrderDetailsV4DTO;", "Ll20/d;", "", "Lru/ozon/app/android/travel/feature/general/order/widgets/flightOrderDetails/v4/presentation/FlightOrderDetailsV4VO;", "Lru/ozon/app/android/composer/widgets/base/WidgetMapper;", "<init>", "()V", "", "index", "Lru/ozon/app/android/travel/feature/general/order/widgets/flightOrderDetails/v4/data/FlightOrderDetailsV4DTO$SegmentDTO;", "item", "", "", "Lru/ozon/android/tokenized/model/TokenizedTrackingInfo;", "trackingInfo", "stateId", "mapSegmentDTO", "(ILru/ozon/app/android/travel/feature/general/order/widgets/flightOrderDetails/v4/data/FlightOrderDetailsV4DTO$SegmentDTO;Ljava/util/Map;Ljava/lang/String;)Lru/ozon/app/android/travel/feature/general/order/widgets/flightOrderDetails/v4/presentation/FlightOrderDetailsV4VO;", "Lru/ozon/app/android/travel/feature/general/order/widgets/flightOrderDetails/v4/data/FlightOrderDetailsV4DTO$SegmentDTO$SegmentPartDTO;", "Lru/ozon/app/android/travel/feature/general/order/widgets/flightOrderDetails/v4/presentation/FlightOrderDetailsV4VO$SegmentPartVO;", "mapSegmentContentDTO", "(Lru/ozon/app/android/travel/feature/general/order/widgets/flightOrderDetails/v4/data/FlightOrderDetailsV4DTO$SegmentDTO$SegmentPartDTO;)Lru/ozon/app/android/travel/feature/general/order/widgets/flightOrderDetails/v4/presentation/FlightOrderDetailsV4VO$SegmentPartVO;", "Lru/ozon/app/android/travel/feature/general/order/widgets/flightOrderDetails/v4/data/FlightOrderDetailsV4DTO$SegmentDTO$SegmentPartDTO$LuggageBlockDTO;", "Lru/ozon/app/android/travel/feature/general/order/widgets/flightOrderDetails/v4/presentation/FlightOrderDetailsV4VO$SegmentPartVO$FlightSegmentVO$LuggageBlockVO;", "toVO", "(Lru/ozon/app/android/travel/feature/general/order/widgets/flightOrderDetails/v4/data/FlightOrderDetailsV4DTO$SegmentDTO$SegmentPartDTO$LuggageBlockDTO;)Lru/ozon/app/android/travel/feature/general/order/widgets/flightOrderDetails/v4/presentation/FlightOrderDetailsV4VO$SegmentPartVO$FlightSegmentVO$LuggageBlockVO;", "Lru/ozon/app/android/travel/feature/general/order/widgets/flightOrderDetails/v4/data/FlightOrderDetailsV4DTO$SegmentDTO$SegmentPartDTO$LuggageBlockDTO$LuggageItemDTO;", "Lru/ozon/app/android/travel/feature/general/order/widgets/flightOrderDetails/v4/presentation/FlightOrderDetailsV4VO$SegmentPartVO$FlightSegmentVO$LuggageBlockVO$LuggageItemVO;", "(Lru/ozon/app/android/travel/feature/general/order/widgets/flightOrderDetails/v4/data/FlightOrderDetailsV4DTO$SegmentDTO$SegmentPartDTO$LuggageBlockDTO$LuggageItemDTO;)Lru/ozon/app/android/travel/feature/general/order/widgets/flightOrderDetails/v4/presentation/FlightOrderDetailsV4VO$SegmentPartVO$FlightSegmentVO$LuggageBlockVO$LuggageItemVO;", "state", "Lru/ozon/app/android/composer/view/WidgetInfo;", "widgetInfo", "invoke", "(Lru/ozon/app/android/travel/feature/general/order/widgets/flightOrderDetails/v4/data/FlightOrderDetailsV4DTO;Ll20/d;)Ljava/util/List;", "order_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class FlightOrderDetailsV4Mapper implements Function2<FlightOrderDetailsV4DTO, d, List<? extends FlightOrderDetailsV4VO>> {
    private final FlightOrderDetailsV4VO.SegmentPartVO mapSegmentContentDTO(FlightOrderDetailsV4DTO.SegmentDTO.SegmentPartDTO item) {
        return new FlightOrderDetailsV4VO.SegmentPartVO(item.hashCode(), new FlightOrderDetailsV4VO.SegmentPartVO.FlightSegmentVO(item.getBadge(), item.getAirlineCell(), item.getTripLeg(), toVO(item.getLuggageBlock())), item.getTransferCell());
    }

    private final FlightOrderDetailsV4VO mapSegmentDTO(int index, FlightOrderDetailsV4DTO.SegmentDTO item, Map<String, TokenizedTrackingInfo> trackingInfo, String stateId) {
        long hashCode = ("index" + item.getSegmentParts().hashCode() + "-" + stateId).hashCode();
        TextDTO title = item.getTitle();
        if (title != null) {
            title.setTagSupported(true);
        }
        Unit unit = Unit.f71690a;
        TextDTO subtitle = item.getSubtitle();
        if (subtitle != null) {
            subtitle.setTagSupported(true);
        }
        List<FlightOrderDetailsV4DTO.SegmentDTO.SegmentPartDTO> segmentParts = item.getSegmentParts();
        ArrayList arrayList = new ArrayList(C7714v.z(segmentParts, 10));
        Iterator<T> it = segmentParts.iterator();
        while (it.hasNext()) {
            arrayList.add(mapSegmentContentDTO((FlightOrderDetailsV4DTO.SegmentDTO.SegmentPartDTO) it.next()));
        }
        TextDTO info = item.getInfo();
        t tVar = null;
        if (index == 0 && trackingInfo != null) {
            tVar = x.b(trackingInfo, Long.valueOf(hashCode), null);
        }
        return new FlightOrderDetailsV4VO(hashCode, title, subtitle, arrayList, info, tVar);
    }

    private final FlightOrderDetailsV4VO.SegmentPartVO.FlightSegmentVO.LuggageBlockVO toVO(FlightOrderDetailsV4DTO.SegmentDTO.SegmentPartDTO.LuggageBlockDTO luggageBlockDTO) {
        FlightOrderDetailsV4VO.SegmentPartVO.FlightSegmentVO.LuggageBlockVO.LuggageItemVO vo = toVO(luggageBlockDTO.getHandCarry());
        FlightOrderDetailsV4VO.SegmentPartVO.FlightSegmentVO.LuggageBlockVO.LuggageItemVO vo2 = toVO(luggageBlockDTO.getLuggage());
        FlightOrderDetailsV4DTO.SegmentDTO.SegmentPartDTO.LuggageBlockDTO.LuggageItemDTO extraLuggage = luggageBlockDTO.getExtraLuggage();
        return new FlightOrderDetailsV4VO.SegmentPartVO.FlightSegmentVO.LuggageBlockVO(vo, vo2, extraLuggage != null ? toVO(extraLuggage) : null, luggageBlockDTO.getButton(), luggageBlockDTO.getTitle(), false);
    }

    @Override // kotlin.jvm.functions.Function2
    @NotNull
    public List<FlightOrderDetailsV4VO> invoke(@NotNull FlightOrderDetailsV4DTO state, @NotNull d widgetInfo) {
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(widgetInfo, "widgetInfo");
        List<FlightOrderDetailsV4DTO.SegmentDTO> segments = state.getSegments();
        ArrayList arrayList = new ArrayList(C7714v.z(segments, 10));
        int i11 = 0;
        for (Object obj : segments) {
            int i12 = i11 + 1;
            if (i11 < 0) {
                C7714v.O0();
                throw null;
            }
            arrayList.add(mapSegmentDTO(i11, (FlightOrderDetailsV4DTO.SegmentDTO) obj, state.getTrackingInfo(), widgetInfo.d()));
            i11 = i12;
        }
        return arrayList;
    }

    private final FlightOrderDetailsV4VO.SegmentPartVO.FlightSegmentVO.LuggageBlockVO.LuggageItemVO toVO(FlightOrderDetailsV4DTO.SegmentDTO.SegmentPartDTO.LuggageBlockDTO.LuggageItemDTO luggageItemDTO) {
        return new FlightOrderDetailsV4VO.SegmentPartVO.FlightSegmentVO.LuggageBlockVO.LuggageItemVO(luggageItemDTO.getIcon(), luggageItemDTO.getTitle());
    }
}
