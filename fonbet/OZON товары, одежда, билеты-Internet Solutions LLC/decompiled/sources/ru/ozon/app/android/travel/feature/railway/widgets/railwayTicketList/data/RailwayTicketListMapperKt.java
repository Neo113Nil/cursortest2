package ru.ozon.app.android.travel.feature.railway.widgets.railwayTicketList.data;

import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C7714v;
import kotlin.jvm.internal.Intrinsics;
import l20.d;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.travel.feature.railway.widgets.railwayTicketList.data.RailwayTicketListDTO;
import ru.ozon.app.android.travel.feature.railway.widgets.railwayTicketList.presentation.RailwayTicketListVI;
import ru.ozon.uni.atoms.data.dsBadge.BadgeDTO;
import ru.ozon.uni.atoms.data.dsCell.CellDTO;
import ru.ozon.uni.atoms.data.text.TextDTO;
import ru.ozon.uni.atoms.utils.OzonSpannableString;

@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a%\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004*\u00020\u00002\n\u0010\u0003\u001a\u00060\u0001j\u0002`\u0002H\u0000¢\u0006\u0004\b\u0006\u0010\u0007\u001a\u0017\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\u000b\u0010\f\u001a\u0017\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\t\u001a\u00020\rH\u0002¢\u0006\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, d2 = {"Lru/ozon/app/android/travel/feature/railway/widgets/railwayTicketList/data/RailwayTicketListDTO;", "Ll20/d;", "Lru/ozon/app/android/composer/view/WidgetInfo;", "info", "", "Lru/ozon/app/android/travel/feature/railway/widgets/railwayTicketList/presentation/RailwayTicketListVI;", "toVI", "(Lru/ozon/app/android/travel/feature/railway/widgets/railwayTicketList/data/RailwayTicketListDTO;Ll20/d;)Ljava/util/List;", "Lru/ozon/app/android/travel/feature/railway/widgets/railwayTicketList/data/RailwayTicketListDTO$TicketSegmentDTO;", "item", "Lru/ozon/app/android/travel/feature/railway/widgets/railwayTicketList/presentation/RailwayTicketListVI$TicketSegmentVI;", "mapTicketSegment", "(Lru/ozon/app/android/travel/feature/railway/widgets/railwayTicketList/data/RailwayTicketListDTO$TicketSegmentDTO;)Lru/ozon/app/android/travel/feature/railway/widgets/railwayTicketList/presentation/RailwayTicketListVI$TicketSegmentVI;", "Lru/ozon/app/android/travel/feature/railway/widgets/railwayTicketList/data/RailwayTicketListDTO$StopBlockDTO;", "Lru/ozon/app/android/travel/feature/railway/widgets/railwayTicketList/presentation/RailwayTicketListVI$StopBlockVI;", "mapStopBlock", "(Lru/ozon/app/android/travel/feature/railway/widgets/railwayTicketList/data/RailwayTicketListDTO$StopBlockDTO;)Lru/ozon/app/android/travel/feature/railway/widgets/railwayTicketList/presentation/RailwayTicketListVI$StopBlockVI;", "railway_prodGoogleAllVendorsRelease"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class RailwayTicketListMapperKt {
    private static final RailwayTicketListVI.StopBlockVI mapStopBlock(RailwayTicketListDTO.StopBlockDTO stopBlockDTO) {
        return new RailwayTicketListVI.StopBlockVI(stopBlockDTO.getDate(), stopBlockDTO.getTime(), stopBlockDTO.getCity(), stopBlockDTO.getStation());
    }

    private static final RailwayTicketListVI.TicketSegmentVI mapTicketSegment(RailwayTicketListDTO.TicketSegmentDTO ticketSegmentDTO) {
        return new RailwayTicketListVI.TicketSegmentVI(ticketSegmentDTO.getBadges(), mapStopBlock(ticketSegmentDTO.getDepartureStop()), mapStopBlock(ticketSegmentDTO.getArrivalStop()), ticketSegmentDTO.getTotalTravelTime(), ticketSegmentDTO.getPlacesInfo());
    }

    @NotNull
    public static final List<RailwayTicketListVI> toVI(@NotNull RailwayTicketListDTO railwayTicketListDTO, @NotNull d info) {
        Intrinsics.checkNotNullParameter(railwayTicketListDTO, "<this>");
        Intrinsics.checkNotNullParameter(info, "info");
        List<RailwayTicketListDTO.SegmentDTO> segments = railwayTicketListDTO.getSegments();
        ArrayList arrayList = new ArrayList(C7714v.z(segments, 10));
        int i11 = 0;
        for (Object obj : segments) {
            int i12 = i11 + 1;
            if (i11 < 0) {
                C7714v.O0();
                throw null;
            }
            RailwayTicketListDTO.SegmentDTO segmentDTO = (RailwayTicketListDTO.SegmentDTO) obj;
            OzonSpannableString text = segmentDTO.getTitle().getText();
            long hashCode = (((Object) text) + info.d()).hashCode();
            TextDTO title = segmentDTO.getTitle();
            TextDTO subtitle = segmentDTO.getSubtitle();
            TextDTO copy$default = subtitle != null ? TextDTO.copy$default(subtitle, null, null, null, null, null, null, null, null, null, null, null, null, null, true, null, null, null, null, null, 516095, null) : null;
            CellDTO transferInfo = segmentDTO.getTransferInfo();
            RailwayTicketListVI.TicketSegmentVI mapTicketSegment = mapTicketSegment(segmentDTO.getTicketSegment());
            RailwayTicketListDTO.TicketSegmentDTO transferTicketSegment = segmentDTO.getTransferTicketSegment();
            RailwayTicketListVI.TicketSegmentVI mapTicketSegment2 = transferTicketSegment != null ? mapTicketSegment(transferTicketSegment) : null;
            BadgeDTO routeInfo = segmentDTO.getRouteInfo();
            arrayList.add(new RailwayTicketListVI(hashCode, title, copy$default, mapTicketSegment, mapTicketSegment2, transferInfo, routeInfo == null ? new BadgeDTO(null, null, null, null, null, null, null, null, null, null, null, null, 4095, null) : routeInfo, segmentDTO.getRouteInfo() != null, i11 != 0));
            i11 = i12;
        }
        return arrayList;
    }
}
