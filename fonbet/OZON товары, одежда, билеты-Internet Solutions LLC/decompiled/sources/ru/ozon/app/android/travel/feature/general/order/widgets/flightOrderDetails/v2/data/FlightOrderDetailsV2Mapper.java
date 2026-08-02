package ru.ozon.app.android.travel.feature.general.order.widgets.flightOrderDetails.v2.data;

import Tc.b;
import WZ.t;
import android.content.Context;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.collections.C7714v;
import kotlin.collections.U;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import l20.d;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.tokenized.model.TokenizedTrackingInfo;
import ru.ozon.app.android.atoms.data.cells.CellAtom;
import ru.ozon.app.android.composer.TrackingInfoMapperKt;
import ru.ozon.app.android.travel.feature.general.order.widgets.flightOrderDetails.v2.data.FlightOrderDetailsV2DTO;
import ru.ozon.app.android.travel.feature.general.order.widgets.flightOrderDetails.v2.presentation.FlightOrderDetailsV2VO;
import ru.ozon.app.android.travel.molecules.mapper.MapperExtKt;
import ru.ozon.uni.android.uikit.extensions.ResourceExtKt;
import ru.ozon.uni.atoms.data.dsCell.CellDTO;
import ru.ozon.uni.atoms.data.texts.TextAtom;

@Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\b\u0001\u0018\u00002*\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u0001j\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0005`\u0006B\u000f\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJE\u0010\u0015\u001a\u00020\u00052\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\r2\u0014\u0010\u0012\u001a\u0010\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u000f2\u0006\u0010\u0013\u001a\u00020\u00102\u0006\u0010\u0014\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\u001d\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00180\u00042\u0006\u0010\u000e\u001a\u00020\u0017H\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ*\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u001b\u001a\u00020\u00022\n\u0010\u001d\u001a\u00060\u0003j\u0002`\u001cH\u0096\u0002¢\u0006\u0004\b\u001e\u0010\u001fR\u0014\u0010 \u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010!R\u0014\u0010\"\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010!R \u0010#\u001a\u000e\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u000b0\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010$¨\u0006%"}, d2 = {"Lru/ozon/app/android/travel/feature/general/order/widgets/flightOrderDetails/v2/data/FlightOrderDetailsV2Mapper;", "Lkotlin/Function2;", "Lru/ozon/app/android/travel/feature/general/order/widgets/flightOrderDetails/v2/data/FlightOrderDetailsV2DTO;", "Ll20/d;", "", "Lru/ozon/app/android/travel/feature/general/order/widgets/flightOrderDetails/v2/presentation/FlightOrderDetailsV2VO;", "Lru/ozon/app/android/composer/widgets/base/WidgetMapper;", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "", "index", "Lru/ozon/app/android/travel/feature/general/order/widgets/flightOrderDetails/v2/data/FlightOrderDetailsV2DTO$SegmentDTO;", "item", "", "", "Lru/ozon/android/tokenized/model/TokenizedTrackingInfo;", "trackingInfo", "stateId", "horizontalOffset", "mapSegmentDTO", "(ILru/ozon/app/android/travel/feature/general/order/widgets/flightOrderDetails/v2/data/FlightOrderDetailsV2DTO$SegmentDTO;Ljava/util/Map;Ljava/lang/String;I)Lru/ozon/app/android/travel/feature/general/order/widgets/flightOrderDetails/v2/presentation/FlightOrderDetailsV2VO;", "Lru/ozon/app/android/travel/feature/general/order/widgets/flightOrderDetails/v2/data/FlightOrderDetailsV2DTO$SegmentDTO$SegmentContentDTO;", "Lru/ozon/app/android/travel/feature/general/order/widgets/flightOrderDetails/v2/presentation/FlightOrderDetailsV2VO$Segment;", "mapSegmentContentDTO", "(Lru/ozon/app/android/travel/feature/general/order/widgets/flightOrderDetails/v2/data/FlightOrderDetailsV2DTO$SegmentDTO$SegmentContentDTO;)Ljava/util/List;", "state", "Lru/ozon/app/android/composer/view/WidgetInfo;", "widgetInfo", "invoke", "(Lru/ozon/app/android/travel/feature/general/order/widgets/flightOrderDetails/v2/data/FlightOrderDetailsV2DTO;Ll20/d;)Ljava/util/List;", "defaultOffset", "I", "noOffset", "mapOffset", "Ljava/util/Map;", "order_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class FlightOrderDetailsV2Mapper implements Function2<FlightOrderDetailsV2DTO, d, List<? extends FlightOrderDetailsV2VO>> {
    private final int defaultOffset;

    @NotNull
    private final Map<String, Integer> mapOffset;
    private final int noOffset;

    public FlightOrderDetailsV2Mapper(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        int px = ResourceExtKt.toPx(16, context);
        this.defaultOffset = px;
        int px2 = ResourceExtKt.toPx(0, context);
        this.noOffset = px2;
        this.mapOffset = U.j(new Pair("flightOrderDetails", Integer.valueOf(px)), new Pair("travelFlightOrderDetails", Integer.valueOf(px2)));
    }

    private final List<FlightOrderDetailsV2VO.Segment> mapSegmentContentDTO(FlightOrderDetailsV2DTO.SegmentDTO.SegmentContentDTO item) {
        b builder = C7714v.B();
        builder.add(new FlightOrderDetailsV2VO.Segment.AirlineInfo(item.getTitle(), item.getImageLink(), item.getSmallButton()));
        builder.add(FlightOrderDetailsV2VO.Segment.TripLeg.m1300boximpl(FlightOrderDetailsV2VO.Segment.TripLeg.m1301constructorimpl(MapperExtKt.toVO(item.getTripLeg()))));
        TextAtom additionalInfo = item.getAdditionalInfo();
        if (additionalInfo != null) {
            builder.add(FlightOrderDetailsV2VO.Segment.AdditionalInfo.m1288boximpl(FlightOrderDetailsV2VO.Segment.AdditionalInfo.m1289constructorimpl(additionalInfo)));
        }
        if (item.getBookingInfo() != null) {
            builder.add(FlightOrderDetailsV2VO.Segment.DashedSeparator.INSTANCE);
        }
        CellDTO bookingInfo = item.getBookingInfo();
        if (bookingInfo != null) {
            bookingInfo.getCenterBlock().getTitle().setTagSupported(true);
            builder.add(FlightOrderDetailsV2VO.Segment.BookingInfo.m1294boximpl(FlightOrderDetailsV2VO.Segment.BookingInfo.m1295constructorimpl(bookingInfo)));
        }
        CellAtom.CellAtomWithSubtitle.CellWithSubtitle24IconCounter transfer = item.getTransfer();
        if (transfer != null) {
            builder.add(new FlightOrderDetailsV2VO.Segment.Transfer(transfer, item.getTransferCellBackgroundColor()));
        }
        Intrinsics.checkNotNullParameter(builder, "builder");
        return builder.B();
    }

    private final FlightOrderDetailsV2VO mapSegmentDTO(int index, FlightOrderDetailsV2DTO.SegmentDTO item, Map<String, TokenizedTrackingInfo> trackingInfo, String stateId, int horizontalOffset) {
        long hashCode = ("segment-" + index + "-" + stateId).hashCode();
        TextAtom title = item.getHeader().getTitle();
        TextAtom subtitle = item.getHeader().getSubtitle();
        List<FlightOrderDetailsV2DTO.SegmentDTO.SegmentContentDTO> content = item.getContent();
        ArrayList arrayList = new ArrayList();
        Iterator<T> it = content.iterator();
        while (it.hasNext()) {
            C7714v.p(mapSegmentContentDTO((FlightOrderDetailsV2DTO.SegmentDTO.SegmentContentDTO) it.next()), arrayList);
        }
        t tVar = null;
        if (index == 0 && trackingInfo != null) {
            tVar = TrackingInfoMapperKt.toTokenizedEvent$default(trackingInfo, Long.valueOf(hashCode), null, 2, null);
        }
        return new FlightOrderDetailsV2VO(hashCode, title, subtitle, arrayList, tVar, horizontalOffset);
    }

    @Override // kotlin.jvm.functions.Function2
    @NotNull
    public List<FlightOrderDetailsV2VO> invoke(@NotNull FlightOrderDetailsV2DTO state, @NotNull d widgetInfo) {
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(widgetInfo, "widgetInfo");
        List<FlightOrderDetailsV2DTO.SegmentDTO> segments = state.getSegments();
        ArrayList arrayList = new ArrayList(C7714v.z(segments, 10));
        int i11 = 0;
        for (Object obj : segments) {
            int i12 = i11 + 1;
            if (i11 < 0) {
                C7714v.O0();
                throw null;
            }
            FlightOrderDetailsV2DTO.SegmentDTO segmentDTO = (FlightOrderDetailsV2DTO.SegmentDTO) obj;
            Map<String, TokenizedTrackingInfo> trackingInfo = state.getTrackingInfo();
            String d11 = widgetInfo.d();
            Integer num = this.mapOffset.get(widgetInfo.c().b());
            arrayList.add(mapSegmentDTO(i11, segmentDTO, trackingInfo, d11, num != null ? num.intValue() : this.defaultOffset));
            i11 = i12;
        }
        return arrayList;
    }
}
