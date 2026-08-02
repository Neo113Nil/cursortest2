package ru.ozon.app.android.travel.feature.general.order.widgets.flightOrderDetails.v3.data;

import WZ.t;
import WZ.x;
import android.content.Context;
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
import ru.ozon.app.android.travel.feature.general.order.widgets.flightOrderDetails.v3.presentation.FlightOrderDetailsV3VO;
import ru.ozon.app.android.travel.feature.general.order.widgets.flightOrderDetails.v3.presentation.SegmentPartVO;
import ru.ozon.app.android.travel.molecules.mapper.MapperExtKt;
import ru.ozon.uni.atoms.data.text.TextDTO;

@Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0001\u0018\u00002*\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u0001j\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0005`\u0006B\u000f\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ=\u0010\u0014\u001a\u00020\u00052\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\r2\u0014\u0010\u0012\u001a\u0010\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u000f2\u0006\u0010\u0013\u001a\u00020\u0010H\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\u0017\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u000e\u001a\u00020\u0016H\u0002¢\u0006\u0004\b\u0018\u0010\u0019J*\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u001a\u001a\u00020\u00022\n\u0010\u001c\u001a\u00060\u0003j\u0002`\u001bH\u0096\u0002¢\u0006\u0004\b\u001d\u0010\u001eR\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\u001f¨\u0006 "}, d2 = {"Lru/ozon/app/android/travel/feature/general/order/widgets/flightOrderDetails/v3/data/FlightOrderDetailsV3Mapper;", "Lkotlin/Function2;", "Lru/ozon/app/android/travel/feature/general/order/widgets/flightOrderDetails/v3/data/FlightOrderDetailsV3DTO;", "Ll20/d;", "", "Lru/ozon/app/android/travel/feature/general/order/widgets/flightOrderDetails/v3/presentation/FlightOrderDetailsV3VO;", "Lru/ozon/app/android/composer/widgets/base/WidgetMapper;", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "", "index", "Lru/ozon/app/android/travel/feature/general/order/widgets/flightOrderDetails/v3/data/SegmentDTO;", "item", "", "", "Lru/ozon/android/tokenized/model/TokenizedTrackingInfo;", "trackingInfo", "stateId", "mapSegmentDTO", "(ILru/ozon/app/android/travel/feature/general/order/widgets/flightOrderDetails/v3/data/SegmentDTO;Ljava/util/Map;Ljava/lang/String;)Lru/ozon/app/android/travel/feature/general/order/widgets/flightOrderDetails/v3/presentation/FlightOrderDetailsV3VO;", "Lru/ozon/app/android/travel/feature/general/order/widgets/flightOrderDetails/v3/data/SegmentPartDTO;", "Lru/ozon/app/android/travel/feature/general/order/widgets/flightOrderDetails/v3/presentation/SegmentPartVO;", "mapSegmentContentDTO", "(Lru/ozon/app/android/travel/feature/general/order/widgets/flightOrderDetails/v3/data/SegmentPartDTO;)Lru/ozon/app/android/travel/feature/general/order/widgets/flightOrderDetails/v3/presentation/SegmentPartVO;", "state", "Lru/ozon/app/android/composer/view/WidgetInfo;", "widgetInfo", "invoke", "(Lru/ozon/app/android/travel/feature/general/order/widgets/flightOrderDetails/v3/data/FlightOrderDetailsV3DTO;Ll20/d;)Ljava/util/List;", "Landroid/content/Context;", "order_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class FlightOrderDetailsV3Mapper implements Function2<FlightOrderDetailsV3DTO, d, List<? extends FlightOrderDetailsV3VO>> {

    @NotNull
    private final Context context;

    public FlightOrderDetailsV3Mapper(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.context = context;
    }

    private final SegmentPartVO mapSegmentContentDTO(SegmentPartDTO item) {
        return new SegmentPartVO(item.hashCode(), MapperExtKt.toVO(item.getAirlineCell(), this.context), item.getTripLeg(), item.getTransferCell());
    }

    private final FlightOrderDetailsV3VO mapSegmentDTO(int index, SegmentDTO item, Map<String, TokenizedTrackingInfo> trackingInfo, String stateId) {
        long hashCode = ("segment-" + index + "-" + stateId).hashCode();
        TextDTO title = item.getTitle();
        TextDTO subtitle = item.getSubtitle();
        List<SegmentPartDTO> segmentParts = item.getSegmentParts();
        ArrayList arrayList = new ArrayList(C7714v.z(segmentParts, 10));
        Iterator<T> it = segmentParts.iterator();
        while (it.hasNext()) {
            arrayList.add(mapSegmentContentDTO((SegmentPartDTO) it.next()));
        }
        t tVar = null;
        if (index == 0 && trackingInfo != null) {
            tVar = x.b(trackingInfo, Long.valueOf(hashCode), null);
        }
        return new FlightOrderDetailsV3VO(hashCode, title, subtitle, arrayList, tVar);
    }

    @Override // kotlin.jvm.functions.Function2
    @NotNull
    public List<FlightOrderDetailsV3VO> invoke(@NotNull FlightOrderDetailsV3DTO state, @NotNull d widgetInfo) {
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(widgetInfo, "widgetInfo");
        List<SegmentDTO> segments = state.getSegments();
        ArrayList arrayList = new ArrayList(C7714v.z(segments, 10));
        int i11 = 0;
        for (Object obj : segments) {
            int i12 = i11 + 1;
            if (i11 < 0) {
                C7714v.O0();
                throw null;
            }
            arrayList.add(mapSegmentDTO(i11, (SegmentDTO) obj, state.getTrackingInfo(), widgetInfo.d()));
            i11 = i12;
        }
        return arrayList;
    }
}
