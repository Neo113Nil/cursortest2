package ru.ozon.app.android.travel.feature.railway.widgets.railwayTicketList.data;

import B90.C2618u;
import D3.g;
import Kk.c;
import Ns.b;
import com.squareup.moshi.j;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.tokenized.model.TokenizedTrackingInfo;
import ru.ozon.app.android.travel.utils.listtracking.TrackingInfoHolder;
import ru.ozon.app.android.ugc.widgets.selectionItemForm.data.SelectionItemFormDTO;
import ru.ozon.uni.atoms.data.dsBadge.BadgeDTO;
import ru.ozon.uni.atoms.data.dsCell.CellDTO;
import ru.ozon.uni.atoms.data.text.TextDTO;

@j(generateAdapter = true)
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\b\u0081\b\u0018\u00002\u00020\u0001:\u0003\u0019\u001a\u001bB+\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0014\u0010\u0005\u001a\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b\u0018\u00010\u0006¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\u0017\u0010\u0010\u001a\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b\u0018\u00010\u0006HÆ\u0003J1\u0010\u0011\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u0016\b\u0002\u0010\u0005\u001a\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b\u0018\u00010\u0006HÆ\u0001J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015HÖ\u0003J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001J\t\u0010\u0018\u001a\u00020\u0007HÖ\u0001R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\"\u0010\u0005\u001a\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b\u0018\u00010\u0006X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e¨\u0006\u001c"}, d2 = {"Lru/ozon/app/android/travel/feature/railway/widgets/railwayTicketList/data/RailwayTicketListDTO;", "Lru/ozon/app/android/travel/utils/listtracking/TrackingInfoHolder;", "segments", "", "Lru/ozon/app/android/travel/feature/railway/widgets/railwayTicketList/data/RailwayTicketListDTO$SegmentDTO;", "trackingInfo", "", "", "Lru/ozon/android/tokenized/model/TokenizedTrackingInfo;", "<init>", "(Ljava/util/List;Ljava/util/Map;)V", "getSegments", "()Ljava/util/List;", "getTrackingInfo", "()Ljava/util/Map;", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", "", "toString", "SegmentDTO", "TicketSegmentDTO", "StopBlockDTO", "railway_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class RailwayTicketListDTO implements TrackingInfoHolder {
    public static final int $stable = 8;

    @NotNull
    private final List<SegmentDTO> segments;
    private final Map<String, TokenizedTrackingInfo> trackingInfo;

    @j(generateAdapter = true)
    @Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B?\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\b\u001a\u0004\u0018\u00010\t\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\f\u0010\rJ\t\u0010\u0018\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0019\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\u001a\u001a\u00020\u0006HÆ\u0003J\u000b\u0010\u001b\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\u000b\u0010\u001c\u001a\u0004\u0018\u00010\tHÆ\u0003J\u000b\u0010\u001d\u001a\u0004\u0018\u00010\u000bHÆ\u0003JM\u0010\u001e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000bHÆ\u0001J\u0013\u0010\u001f\u001a\u00020 2\b\u0010!\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\"\u001a\u00020#HÖ\u0001J\t\u0010$\u001a\u00020%HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000fR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0012R\u0013\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0013\u0010\n\u001a\u0004\u0018\u00010\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017¨\u0006&"}, d2 = {"Lru/ozon/app/android/travel/feature/railway/widgets/railwayTicketList/data/RailwayTicketListDTO$SegmentDTO;", "", SelectionItemFormDTO.TITLE_FIELD_NAME, "Lru/ozon/uni/atoms/data/text/TextDTO;", "subtitle", "ticketSegment", "Lru/ozon/app/android/travel/feature/railway/widgets/railwayTicketList/data/RailwayTicketListDTO$TicketSegmentDTO;", "transferTicketSegment", "transferInfo", "Lru/ozon/uni/atoms/data/dsCell/CellDTO;", "routeInfo", "Lru/ozon/uni/atoms/data/dsBadge/BadgeDTO;", "<init>", "(Lru/ozon/uni/atoms/data/text/TextDTO;Lru/ozon/uni/atoms/data/text/TextDTO;Lru/ozon/app/android/travel/feature/railway/widgets/railwayTicketList/data/RailwayTicketListDTO$TicketSegmentDTO;Lru/ozon/app/android/travel/feature/railway/widgets/railwayTicketList/data/RailwayTicketListDTO$TicketSegmentDTO;Lru/ozon/uni/atoms/data/dsCell/CellDTO;Lru/ozon/uni/atoms/data/dsBadge/BadgeDTO;)V", "getTitle", "()Lru/ozon/uni/atoms/data/text/TextDTO;", "getSubtitle", "getTicketSegment", "()Lru/ozon/app/android/travel/feature/railway/widgets/railwayTicketList/data/RailwayTicketListDTO$TicketSegmentDTO;", "getTransferTicketSegment", "getTransferInfo", "()Lru/ozon/uni/atoms/data/dsCell/CellDTO;", "getRouteInfo", "()Lru/ozon/uni/atoms/data/dsBadge/BadgeDTO;", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "", "other", "hashCode", "", "toString", "", "railway_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class SegmentDTO {
        public static final int $stable = 8;
        private final BadgeDTO routeInfo;
        private final TextDTO subtitle;

        @NotNull
        private final TicketSegmentDTO ticketSegment;

        @NotNull
        private final TextDTO title;
        private final CellDTO transferInfo;
        private final TicketSegmentDTO transferTicketSegment;

        public SegmentDTO(@NotNull TextDTO title, TextDTO textDTO, @NotNull TicketSegmentDTO ticketSegment, TicketSegmentDTO ticketSegmentDTO, CellDTO cellDTO, BadgeDTO badgeDTO) {
            Intrinsics.checkNotNullParameter(title, "title");
            Intrinsics.checkNotNullParameter(ticketSegment, "ticketSegment");
            this.title = title;
            this.subtitle = textDTO;
            this.ticketSegment = ticketSegment;
            this.transferTicketSegment = ticketSegmentDTO;
            this.transferInfo = cellDTO;
            this.routeInfo = badgeDTO;
        }

        public static /* synthetic */ SegmentDTO copy$default(SegmentDTO segmentDTO, TextDTO textDTO, TextDTO textDTO2, TicketSegmentDTO ticketSegmentDTO, TicketSegmentDTO ticketSegmentDTO2, CellDTO cellDTO, BadgeDTO badgeDTO, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                textDTO = segmentDTO.title;
            }
            if ((i11 & 2) != 0) {
                textDTO2 = segmentDTO.subtitle;
            }
            if ((i11 & 4) != 0) {
                ticketSegmentDTO = segmentDTO.ticketSegment;
            }
            if ((i11 & 8) != 0) {
                ticketSegmentDTO2 = segmentDTO.transferTicketSegment;
            }
            if ((i11 & 16) != 0) {
                cellDTO = segmentDTO.transferInfo;
            }
            if ((i11 & 32) != 0) {
                badgeDTO = segmentDTO.routeInfo;
            }
            CellDTO cellDTO2 = cellDTO;
            BadgeDTO badgeDTO2 = badgeDTO;
            return segmentDTO.copy(textDTO, textDTO2, ticketSegmentDTO, ticketSegmentDTO2, cellDTO2, badgeDTO2);
        }

        @NotNull
        /* renamed from: component1, reason: from getter */
        public final TextDTO getTitle() {
            return this.title;
        }

        /* renamed from: component2, reason: from getter */
        public final TextDTO getSubtitle() {
            return this.subtitle;
        }

        @NotNull
        /* renamed from: component3, reason: from getter */
        public final TicketSegmentDTO getTicketSegment() {
            return this.ticketSegment;
        }

        /* renamed from: component4, reason: from getter */
        public final TicketSegmentDTO getTransferTicketSegment() {
            return this.transferTicketSegment;
        }

        /* renamed from: component5, reason: from getter */
        public final CellDTO getTransferInfo() {
            return this.transferInfo;
        }

        /* renamed from: component6, reason: from getter */
        public final BadgeDTO getRouteInfo() {
            return this.routeInfo;
        }

        @NotNull
        public final SegmentDTO copy(@NotNull TextDTO title, TextDTO subtitle, @NotNull TicketSegmentDTO ticketSegment, TicketSegmentDTO transferTicketSegment, CellDTO transferInfo, BadgeDTO routeInfo) {
            Intrinsics.checkNotNullParameter(title, "title");
            Intrinsics.checkNotNullParameter(ticketSegment, "ticketSegment");
            return new SegmentDTO(title, subtitle, ticketSegment, transferTicketSegment, transferInfo, routeInfo);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof SegmentDTO)) {
                return false;
            }
            SegmentDTO segmentDTO = (SegmentDTO) other;
            return Intrinsics.d(this.title, segmentDTO.title) && Intrinsics.d(this.subtitle, segmentDTO.subtitle) && Intrinsics.d(this.ticketSegment, segmentDTO.ticketSegment) && Intrinsics.d(this.transferTicketSegment, segmentDTO.transferTicketSegment) && Intrinsics.d(this.transferInfo, segmentDTO.transferInfo) && Intrinsics.d(this.routeInfo, segmentDTO.routeInfo);
        }

        public final BadgeDTO getRouteInfo() {
            return this.routeInfo;
        }

        public final TextDTO getSubtitle() {
            return this.subtitle;
        }

        @NotNull
        public final TicketSegmentDTO getTicketSegment() {
            return this.ticketSegment;
        }

        @NotNull
        public final TextDTO getTitle() {
            return this.title;
        }

        public final CellDTO getTransferInfo() {
            return this.transferInfo;
        }

        public final TicketSegmentDTO getTransferTicketSegment() {
            return this.transferTicketSegment;
        }

        public int hashCode() {
            int hashCode = this.title.hashCode() * 31;
            TextDTO textDTO = this.subtitle;
            int hashCode2 = (this.ticketSegment.hashCode() + ((hashCode + (textDTO == null ? 0 : textDTO.hashCode())) * 31)) * 31;
            TicketSegmentDTO ticketSegmentDTO = this.transferTicketSegment;
            int hashCode3 = (hashCode2 + (ticketSegmentDTO == null ? 0 : ticketSegmentDTO.hashCode())) * 31;
            CellDTO cellDTO = this.transferInfo;
            int hashCode4 = (hashCode3 + (cellDTO == null ? 0 : cellDTO.hashCode())) * 31;
            BadgeDTO badgeDTO = this.routeInfo;
            return hashCode4 + (badgeDTO != null ? badgeDTO.hashCode() : 0);
        }

        @NotNull
        public String toString() {
            TextDTO textDTO = this.title;
            TextDTO textDTO2 = this.subtitle;
            TicketSegmentDTO ticketSegmentDTO = this.ticketSegment;
            TicketSegmentDTO ticketSegmentDTO2 = this.transferTicketSegment;
            CellDTO cellDTO = this.transferInfo;
            BadgeDTO badgeDTO = this.routeInfo;
            StringBuilder g10 = g.g("SegmentDTO(title=", textDTO, ", subtitle=", textDTO2, ", ticketSegment=");
            g10.append(ticketSegmentDTO);
            g10.append(", transferTicketSegment=");
            g10.append(ticketSegmentDTO2);
            g10.append(", transferInfo=");
            g10.append(cellDTO);
            g10.append(", routeInfo=");
            g10.append(badgeDTO);
            g10.append(")");
            return g10.toString();
        }
    }

    @j(generateAdapter = true)
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B+\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0010\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0011\u001a\u0004\u0018\u00010\u0003HÆ\u0003J5\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001J\t\u0010\u0018\u001a\u00020\u0019HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\nR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\nR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\n¨\u0006\u001a"}, d2 = {"Lru/ozon/app/android/travel/feature/railway/widgets/railwayTicketList/data/RailwayTicketListDTO$StopBlockDTO;", "", "date", "Lru/ozon/uni/atoms/data/text/TextDTO;", "time", "city", "station", "<init>", "(Lru/ozon/uni/atoms/data/text/TextDTO;Lru/ozon/uni/atoms/data/text/TextDTO;Lru/ozon/uni/atoms/data/text/TextDTO;Lru/ozon/uni/atoms/data/text/TextDTO;)V", "getDate", "()Lru/ozon/uni/atoms/data/text/TextDTO;", "getTime", "getCity", "getStation", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "", "toString", "", "railway_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class StopBlockDTO {
        public static final int $stable = 0;
        private final TextDTO city;

        @NotNull
        private final TextDTO date;
        private final TextDTO station;

        @NotNull
        private final TextDTO time;

        public StopBlockDTO(@NotNull TextDTO date, @NotNull TextDTO time, TextDTO textDTO, TextDTO textDTO2) {
            Intrinsics.checkNotNullParameter(date, "date");
            Intrinsics.checkNotNullParameter(time, "time");
            this.date = date;
            this.time = time;
            this.city = textDTO;
            this.station = textDTO2;
        }

        public static /* synthetic */ StopBlockDTO copy$default(StopBlockDTO stopBlockDTO, TextDTO textDTO, TextDTO textDTO2, TextDTO textDTO3, TextDTO textDTO4, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                textDTO = stopBlockDTO.date;
            }
            if ((i11 & 2) != 0) {
                textDTO2 = stopBlockDTO.time;
            }
            if ((i11 & 4) != 0) {
                textDTO3 = stopBlockDTO.city;
            }
            if ((i11 & 8) != 0) {
                textDTO4 = stopBlockDTO.station;
            }
            return stopBlockDTO.copy(textDTO, textDTO2, textDTO3, textDTO4);
        }

        @NotNull
        /* renamed from: component1, reason: from getter */
        public final TextDTO getDate() {
            return this.date;
        }

        @NotNull
        /* renamed from: component2, reason: from getter */
        public final TextDTO getTime() {
            return this.time;
        }

        /* renamed from: component3, reason: from getter */
        public final TextDTO getCity() {
            return this.city;
        }

        /* renamed from: component4, reason: from getter */
        public final TextDTO getStation() {
            return this.station;
        }

        @NotNull
        public final StopBlockDTO copy(@NotNull TextDTO date, @NotNull TextDTO time, TextDTO city, TextDTO station) {
            Intrinsics.checkNotNullParameter(date, "date");
            Intrinsics.checkNotNullParameter(time, "time");
            return new StopBlockDTO(date, time, city, station);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof StopBlockDTO)) {
                return false;
            }
            StopBlockDTO stopBlockDTO = (StopBlockDTO) other;
            return Intrinsics.d(this.date, stopBlockDTO.date) && Intrinsics.d(this.time, stopBlockDTO.time) && Intrinsics.d(this.city, stopBlockDTO.city) && Intrinsics.d(this.station, stopBlockDTO.station);
        }

        public final TextDTO getCity() {
            return this.city;
        }

        @NotNull
        public final TextDTO getDate() {
            return this.date;
        }

        public final TextDTO getStation() {
            return this.station;
        }

        @NotNull
        public final TextDTO getTime() {
            return this.time;
        }

        public int hashCode() {
            int a11 = b.a(this.time, this.date.hashCode() * 31, 31);
            TextDTO textDTO = this.city;
            int hashCode = (a11 + (textDTO == null ? 0 : textDTO.hashCode())) * 31;
            TextDTO textDTO2 = this.station;
            return hashCode + (textDTO2 != null ? textDTO2.hashCode() : 0);
        }

        @NotNull
        public String toString() {
            TextDTO textDTO = this.date;
            TextDTO textDTO2 = this.time;
            TextDTO textDTO3 = this.city;
            TextDTO textDTO4 = this.station;
            StringBuilder g10 = g.g("StopBlockDTO(date=", textDTO, ", time=", textDTO2, ", city=");
            g10.append(textDTO3);
            g10.append(", station=");
            g10.append(textDTO4);
            g10.append(")");
            return g10.toString();
        }
    }

    @j(generateAdapter = true)
    @Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B;\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\t\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0006HÆ\u0003J\t\u0010\u0017\u001a\u00020\u0006HÆ\u0003J\t\u0010\u0018\u001a\u00020\tHÆ\u0003J\u000f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003JG\u0010\u001a\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\b\u001a\u00020\t2\u000e\b\u0002\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0001J\u0013\u0010\u001b\u001a\u00020\u001c2\b\u0010\u001d\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001e\u001a\u00020\u001fHÖ\u0001J\t\u0010 \u001a\u00020!HÖ\u0001R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0007\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0010R\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0017\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u000e¨\u0006\""}, d2 = {"Lru/ozon/app/android/travel/feature/railway/widgets/railwayTicketList/data/RailwayTicketListDTO$TicketSegmentDTO;", "", "badges", "", "Lru/ozon/uni/atoms/data/dsBadge/BadgeDTO;", "departureStop", "Lru/ozon/app/android/travel/feature/railway/widgets/railwayTicketList/data/RailwayTicketListDTO$StopBlockDTO;", "arrivalStop", "totalTravelTime", "Lru/ozon/uni/atoms/data/text/TextDTO;", "placesInfo", "<init>", "(Ljava/util/List;Lru/ozon/app/android/travel/feature/railway/widgets/railwayTicketList/data/RailwayTicketListDTO$StopBlockDTO;Lru/ozon/app/android/travel/feature/railway/widgets/railwayTicketList/data/RailwayTicketListDTO$StopBlockDTO;Lru/ozon/uni/atoms/data/text/TextDTO;Ljava/util/List;)V", "getBadges", "()Ljava/util/List;", "getDepartureStop", "()Lru/ozon/app/android/travel/feature/railway/widgets/railwayTicketList/data/RailwayTicketListDTO$StopBlockDTO;", "getArrivalStop", "getTotalTravelTime", "()Lru/ozon/uni/atoms/data/text/TextDTO;", "getPlacesInfo", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", "hashCode", "", "toString", "", "railway_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class TicketSegmentDTO {
        public static final int $stable = 8;

        @NotNull
        private final StopBlockDTO arrivalStop;

        @NotNull
        private final List<BadgeDTO> badges;

        @NotNull
        private final StopBlockDTO departureStop;

        @NotNull
        private final List<BadgeDTO> placesInfo;

        @NotNull
        private final TextDTO totalTravelTime;

        public TicketSegmentDTO(@NotNull List<BadgeDTO> badges, @NotNull StopBlockDTO departureStop, @NotNull StopBlockDTO arrivalStop, @NotNull TextDTO totalTravelTime, @NotNull List<BadgeDTO> placesInfo) {
            Intrinsics.checkNotNullParameter(badges, "badges");
            Intrinsics.checkNotNullParameter(departureStop, "departureStop");
            Intrinsics.checkNotNullParameter(arrivalStop, "arrivalStop");
            Intrinsics.checkNotNullParameter(totalTravelTime, "totalTravelTime");
            Intrinsics.checkNotNullParameter(placesInfo, "placesInfo");
            this.badges = badges;
            this.departureStop = departureStop;
            this.arrivalStop = arrivalStop;
            this.totalTravelTime = totalTravelTime;
            this.placesInfo = placesInfo;
        }

        public static /* synthetic */ TicketSegmentDTO copy$default(TicketSegmentDTO ticketSegmentDTO, List list, StopBlockDTO stopBlockDTO, StopBlockDTO stopBlockDTO2, TextDTO textDTO, List list2, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                list = ticketSegmentDTO.badges;
            }
            if ((i11 & 2) != 0) {
                stopBlockDTO = ticketSegmentDTO.departureStop;
            }
            if ((i11 & 4) != 0) {
                stopBlockDTO2 = ticketSegmentDTO.arrivalStop;
            }
            if ((i11 & 8) != 0) {
                textDTO = ticketSegmentDTO.totalTravelTime;
            }
            if ((i11 & 16) != 0) {
                list2 = ticketSegmentDTO.placesInfo;
            }
            List list3 = list2;
            StopBlockDTO stopBlockDTO3 = stopBlockDTO2;
            return ticketSegmentDTO.copy(list, stopBlockDTO, stopBlockDTO3, textDTO, list3);
        }

        @NotNull
        public final List<BadgeDTO> component1() {
            return this.badges;
        }

        @NotNull
        /* renamed from: component2, reason: from getter */
        public final StopBlockDTO getDepartureStop() {
            return this.departureStop;
        }

        @NotNull
        /* renamed from: component3, reason: from getter */
        public final StopBlockDTO getArrivalStop() {
            return this.arrivalStop;
        }

        @NotNull
        /* renamed from: component4, reason: from getter */
        public final TextDTO getTotalTravelTime() {
            return this.totalTravelTime;
        }

        @NotNull
        public final List<BadgeDTO> component5() {
            return this.placesInfo;
        }

        @NotNull
        public final TicketSegmentDTO copy(@NotNull List<BadgeDTO> badges, @NotNull StopBlockDTO departureStop, @NotNull StopBlockDTO arrivalStop, @NotNull TextDTO totalTravelTime, @NotNull List<BadgeDTO> placesInfo) {
            Intrinsics.checkNotNullParameter(badges, "badges");
            Intrinsics.checkNotNullParameter(departureStop, "departureStop");
            Intrinsics.checkNotNullParameter(arrivalStop, "arrivalStop");
            Intrinsics.checkNotNullParameter(totalTravelTime, "totalTravelTime");
            Intrinsics.checkNotNullParameter(placesInfo, "placesInfo");
            return new TicketSegmentDTO(badges, departureStop, arrivalStop, totalTravelTime, placesInfo);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof TicketSegmentDTO)) {
                return false;
            }
            TicketSegmentDTO ticketSegmentDTO = (TicketSegmentDTO) other;
            return Intrinsics.d(this.badges, ticketSegmentDTO.badges) && Intrinsics.d(this.departureStop, ticketSegmentDTO.departureStop) && Intrinsics.d(this.arrivalStop, ticketSegmentDTO.arrivalStop) && Intrinsics.d(this.totalTravelTime, ticketSegmentDTO.totalTravelTime) && Intrinsics.d(this.placesInfo, ticketSegmentDTO.placesInfo);
        }

        @NotNull
        public final StopBlockDTO getArrivalStop() {
            return this.arrivalStop;
        }

        @NotNull
        public final List<BadgeDTO> getBadges() {
            return this.badges;
        }

        @NotNull
        public final StopBlockDTO getDepartureStop() {
            return this.departureStop;
        }

        @NotNull
        public final List<BadgeDTO> getPlacesInfo() {
            return this.placesInfo;
        }

        @NotNull
        public final TextDTO getTotalTravelTime() {
            return this.totalTravelTime;
        }

        public int hashCode() {
            return this.placesInfo.hashCode() + b.a(this.totalTravelTime, (this.arrivalStop.hashCode() + ((this.departureStop.hashCode() + (this.badges.hashCode() * 31)) * 31)) * 31, 31);
        }

        @NotNull
        public String toString() {
            List<BadgeDTO> list = this.badges;
            StopBlockDTO stopBlockDTO = this.departureStop;
            StopBlockDTO stopBlockDTO2 = this.arrivalStop;
            TextDTO textDTO = this.totalTravelTime;
            List<BadgeDTO> list2 = this.placesInfo;
            StringBuilder sb2 = new StringBuilder("TicketSegmentDTO(badges=");
            sb2.append(list);
            sb2.append(", departureStop=");
            sb2.append(stopBlockDTO);
            sb2.append(", arrivalStop=");
            sb2.append(stopBlockDTO2);
            sb2.append(", totalTravelTime=");
            sb2.append(textDTO);
            sb2.append(", placesInfo=");
            return C2618u.h(sb2, list2, ")");
        }
    }

    public RailwayTicketListDTO(@NotNull List<SegmentDTO> segments, Map<String, TokenizedTrackingInfo> map) {
        Intrinsics.checkNotNullParameter(segments, "segments");
        this.segments = segments;
        this.trackingInfo = map;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ RailwayTicketListDTO copy$default(RailwayTicketListDTO railwayTicketListDTO, List list, Map map, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            list = railwayTicketListDTO.segments;
        }
        if ((i11 & 2) != 0) {
            map = railwayTicketListDTO.trackingInfo;
        }
        return railwayTicketListDTO.copy(list, map);
    }

    @NotNull
    public final List<SegmentDTO> component1() {
        return this.segments;
    }

    public final Map<String, TokenizedTrackingInfo> component2() {
        return this.trackingInfo;
    }

    @NotNull
    public final RailwayTicketListDTO copy(@NotNull List<SegmentDTO> segments, Map<String, TokenizedTrackingInfo> trackingInfo) {
        Intrinsics.checkNotNullParameter(segments, "segments");
        return new RailwayTicketListDTO(segments, trackingInfo);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof RailwayTicketListDTO)) {
            return false;
        }
        RailwayTicketListDTO railwayTicketListDTO = (RailwayTicketListDTO) other;
        return Intrinsics.d(this.segments, railwayTicketListDTO.segments) && Intrinsics.d(this.trackingInfo, railwayTicketListDTO.trackingInfo);
    }

    @NotNull
    public final List<SegmentDTO> getSegments() {
        return this.segments;
    }

    @Override // ru.ozon.app.android.travel.utils.listtracking.TrackingInfoHolder
    public Map<String, TokenizedTrackingInfo> getTrackingInfo() {
        return this.trackingInfo;
    }

    public int hashCode() {
        int hashCode = this.segments.hashCode() * 31;
        Map<String, TokenizedTrackingInfo> map = this.trackingInfo;
        return hashCode + (map == null ? 0 : map.hashCode());
    }

    @NotNull
    public String toString() {
        return c.d("RailwayTicketListDTO(segments=", ", trackingInfo=", ")", this.segments, this.trackingInfo);
    }
}
