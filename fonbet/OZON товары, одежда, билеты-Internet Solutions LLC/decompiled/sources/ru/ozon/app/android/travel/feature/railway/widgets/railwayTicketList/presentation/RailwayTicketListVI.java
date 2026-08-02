package ru.ozon.app.android.travel.feature.railway.widgets.railwayTicketList.presentation;

import B90.C2618u;
import D3.g;
import Gl.C3124a;
import Kk.C3532b;
import Ns.b;
import TY.a;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import l20.c;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.ugc.widgets.selectionItemForm.data.SelectionItemFormDTO;
import ru.ozon.uni.atoms.data.dsBadge.BadgeDTO;
import ru.ozon.uni.atoms.data.dsCell.CellDTO;
import ru.ozon.uni.atoms.data.text.TextDTO;

@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0019\b\u0081\b\u0018\u00002\u00020\u0001:\u000201BU\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u0006\u0010\u0010\u001a\u00020\u000e¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0017\u001a\u00020\u0016HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u001a\u0010\u001b\u001a\u00020\u000e2\b\u0010\u001a\u001a\u0004\u0018\u00010\u0019HÖ\u0003¢\u0006\u0004\b\u001b\u0010\u001cR\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010 \u001a\u0004\b!\u0010\"R\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0006\u0010 \u001a\u0004\b#\u0010\"R\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010$\u001a\u0004\b%\u0010&R\u0019\u0010\t\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b\t\u0010$\u001a\u0004\b'\u0010&R\u0019\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0006¢\u0006\f\n\u0004\b\u000b\u0010(\u001a\u0004\b)\u0010*R\u0017\u0010\r\u001a\u00020\f8\u0006¢\u0006\f\n\u0004\b\r\u0010+\u001a\u0004\b,\u0010-R\u0017\u0010\u000f\u001a\u00020\u000e8\u0006¢\u0006\f\n\u0004\b\u000f\u0010.\u001a\u0004\b\u000f\u0010/R\u0017\u0010\u0010\u001a\u00020\u000e8\u0006¢\u0006\f\n\u0004\b\u0010\u0010.\u001a\u0004\b\u0010\u0010/¨\u00062"}, d2 = {"Lru/ozon/app/android/travel/feature/railway/widgets/railwayTicketList/presentation/RailwayTicketListVI;", "Ll20/c;", "", "id", "Lru/ozon/uni/atoms/data/text/TextDTO;", SelectionItemFormDTO.TITLE_FIELD_NAME, "subtitle", "Lru/ozon/app/android/travel/feature/railway/widgets/railwayTicketList/presentation/RailwayTicketListVI$TicketSegmentVI;", "ticketSegment", "transferTicketSegment", "Lru/ozon/uni/atoms/data/dsCell/CellDTO;", "transferInfo", "Lru/ozon/uni/atoms/data/dsBadge/BadgeDTO;", "routeInfo", "", "isRouteInfoVisible", "isTopPaddingVisible", "<init>", "(JLru/ozon/uni/atoms/data/text/TextDTO;Lru/ozon/uni/atoms/data/text/TextDTO;Lru/ozon/app/android/travel/feature/railway/widgets/railwayTicketList/presentation/RailwayTicketListVI$TicketSegmentVI;Lru/ozon/app/android/travel/feature/railway/widgets/railwayTicketList/presentation/RailwayTicketListVI$TicketSegmentVI;Lru/ozon/uni/atoms/data/dsCell/CellDTO;Lru/ozon/uni/atoms/data/dsBadge/BadgeDTO;ZZ)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "J", "getId", "()J", "Lru/ozon/uni/atoms/data/text/TextDTO;", "getTitle", "()Lru/ozon/uni/atoms/data/text/TextDTO;", "getSubtitle", "Lru/ozon/app/android/travel/feature/railway/widgets/railwayTicketList/presentation/RailwayTicketListVI$TicketSegmentVI;", "getTicketSegment", "()Lru/ozon/app/android/travel/feature/railway/widgets/railwayTicketList/presentation/RailwayTicketListVI$TicketSegmentVI;", "getTransferTicketSegment", "Lru/ozon/uni/atoms/data/dsCell/CellDTO;", "getTransferInfo", "()Lru/ozon/uni/atoms/data/dsCell/CellDTO;", "Lru/ozon/uni/atoms/data/dsBadge/BadgeDTO;", "getRouteInfo", "()Lru/ozon/uni/atoms/data/dsBadge/BadgeDTO;", "Z", "()Z", "TicketSegmentVI", "StopBlockVI", "railway_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class RailwayTicketListVI implements c {
    private final long id;
    private final boolean isRouteInfoVisible;
    private final boolean isTopPaddingVisible;

    @NotNull
    private final BadgeDTO routeInfo;
    private final TextDTO subtitle;

    @NotNull
    private final TicketSegmentVI ticketSegment;

    @NotNull
    private final TextDTO title;
    private final CellDTO transferInfo;
    private final TicketSegmentVI transferTicketSegment;

    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\t\b\u0087\b\u0018\u00002\u00020\u0001B+\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0013\u001a\u0004\b\u0016\u0010\u0015R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0013\u001a\u0004\b\u0017\u0010\u0015R\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0013\u001a\u0004\b\u0018\u0010\u0015¨\u0006\u0019"}, d2 = {"Lru/ozon/app/android/travel/feature/railway/widgets/railwayTicketList/presentation/RailwayTicketListVI$StopBlockVI;", "", "Lru/ozon/uni/atoms/data/text/TextDTO;", "date", "time", "city", "station", "<init>", "(Lru/ozon/uni/atoms/data/text/TextDTO;Lru/ozon/uni/atoms/data/text/TextDTO;Lru/ozon/uni/atoms/data/text/TextDTO;Lru/ozon/uni/atoms/data/text/TextDTO;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lru/ozon/uni/atoms/data/text/TextDTO;", "getDate", "()Lru/ozon/uni/atoms/data/text/TextDTO;", "getTime", "getCity", "getStation", "railway_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class StopBlockVI {
        private final TextDTO city;

        @NotNull
        private final TextDTO date;
        private final TextDTO station;

        @NotNull
        private final TextDTO time;

        public StopBlockVI(@NotNull TextDTO date, @NotNull TextDTO time, TextDTO textDTO, TextDTO textDTO2) {
            Intrinsics.checkNotNullParameter(date, "date");
            Intrinsics.checkNotNullParameter(time, "time");
            this.date = date;
            this.time = time;
            this.city = textDTO;
            this.station = textDTO2;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof StopBlockVI)) {
                return false;
            }
            StopBlockVI stopBlockVI = (StopBlockVI) other;
            return Intrinsics.d(this.date, stopBlockVI.date) && Intrinsics.d(this.time, stopBlockVI.time) && Intrinsics.d(this.city, stopBlockVI.city) && Intrinsics.d(this.station, stopBlockVI.station);
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
            StringBuilder g10 = g.g("StopBlockVI(date=", textDTO, ", time=", textDTO2, ", city=");
            g10.append(textDTO3);
            g10.append(", station=");
            g10.append(textDTO4);
            g10.append(")");
            return g10.toString();
        }
    }

    @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u000e\b\u0087\b\u0018\u00002\u00020\u0001B;\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005\u0012\u0006\u0010\t\u001a\u00020\b\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u001a\u0010\u0015\u001a\u00020\u00142\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0015\u0010\u0016R\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u0017\u0010\u0007\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u001a\u001a\u0004\b\u001d\u0010\u001cR\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\t\u0010\u001e\u001a\u0004\b\u001f\u0010 R\u001d\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\n\u0010\u0017\u001a\u0004\b!\u0010\u0019¨\u0006\""}, d2 = {"Lru/ozon/app/android/travel/feature/railway/widgets/railwayTicketList/presentation/RailwayTicketListVI$TicketSegmentVI;", "", "", "Lru/ozon/uni/atoms/data/dsBadge/BadgeDTO;", "badges", "Lru/ozon/app/android/travel/feature/railway/widgets/railwayTicketList/presentation/RailwayTicketListVI$StopBlockVI;", "departureStop", "arrivalStop", "Lru/ozon/uni/atoms/data/text/TextDTO;", "totalTravelTime", "placesInfo", "<init>", "(Ljava/util/List;Lru/ozon/app/android/travel/feature/railway/widgets/railwayTicketList/presentation/RailwayTicketListVI$StopBlockVI;Lru/ozon/app/android/travel/feature/railway/widgets/railwayTicketList/presentation/RailwayTicketListVI$StopBlockVI;Lru/ozon/uni/atoms/data/text/TextDTO;Ljava/util/List;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/util/List;", "getBadges", "()Ljava/util/List;", "Lru/ozon/app/android/travel/feature/railway/widgets/railwayTicketList/presentation/RailwayTicketListVI$StopBlockVI;", "getDepartureStop", "()Lru/ozon/app/android/travel/feature/railway/widgets/railwayTicketList/presentation/RailwayTicketListVI$StopBlockVI;", "getArrivalStop", "Lru/ozon/uni/atoms/data/text/TextDTO;", "getTotalTravelTime", "()Lru/ozon/uni/atoms/data/text/TextDTO;", "getPlacesInfo", "railway_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class TicketSegmentVI {

        @NotNull
        private final StopBlockVI arrivalStop;

        @NotNull
        private final List<BadgeDTO> badges;

        @NotNull
        private final StopBlockVI departureStop;

        @NotNull
        private final List<BadgeDTO> placesInfo;

        @NotNull
        private final TextDTO totalTravelTime;

        public TicketSegmentVI(@NotNull List<BadgeDTO> badges, @NotNull StopBlockVI departureStop, @NotNull StopBlockVI arrivalStop, @NotNull TextDTO totalTravelTime, @NotNull List<BadgeDTO> placesInfo) {
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

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof TicketSegmentVI)) {
                return false;
            }
            TicketSegmentVI ticketSegmentVI = (TicketSegmentVI) other;
            return Intrinsics.d(this.badges, ticketSegmentVI.badges) && Intrinsics.d(this.departureStop, ticketSegmentVI.departureStop) && Intrinsics.d(this.arrivalStop, ticketSegmentVI.arrivalStop) && Intrinsics.d(this.totalTravelTime, ticketSegmentVI.totalTravelTime) && Intrinsics.d(this.placesInfo, ticketSegmentVI.placesInfo);
        }

        @NotNull
        public final StopBlockVI getArrivalStop() {
            return this.arrivalStop;
        }

        @NotNull
        public final List<BadgeDTO> getBadges() {
            return this.badges;
        }

        @NotNull
        public final StopBlockVI getDepartureStop() {
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
            StopBlockVI stopBlockVI = this.departureStop;
            StopBlockVI stopBlockVI2 = this.arrivalStop;
            TextDTO textDTO = this.totalTravelTime;
            List<BadgeDTO> list2 = this.placesInfo;
            StringBuilder sb2 = new StringBuilder("TicketSegmentVI(badges=");
            sb2.append(list);
            sb2.append(", departureStop=");
            sb2.append(stopBlockVI);
            sb2.append(", arrivalStop=");
            sb2.append(stopBlockVI2);
            sb2.append(", totalTravelTime=");
            sb2.append(textDTO);
            sb2.append(", placesInfo=");
            return C2618u.h(sb2, list2, ")");
        }
    }

    public RailwayTicketListVI(long j11, @NotNull TextDTO title, TextDTO textDTO, @NotNull TicketSegmentVI ticketSegment, TicketSegmentVI ticketSegmentVI, CellDTO cellDTO, @NotNull BadgeDTO routeInfo, boolean z11, boolean z12) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(ticketSegment, "ticketSegment");
        Intrinsics.checkNotNullParameter(routeInfo, "routeInfo");
        this.id = j11;
        this.title = title;
        this.subtitle = textDTO;
        this.ticketSegment = ticketSegment;
        this.transferTicketSegment = ticketSegmentVI;
        this.transferInfo = cellDTO;
        this.routeInfo = routeInfo;
        this.isRouteInfoVisible = z11;
        this.isTopPaddingVisible = z12;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof RailwayTicketListVI)) {
            return false;
        }
        RailwayTicketListVI railwayTicketListVI = (RailwayTicketListVI) other;
        return this.id == railwayTicketListVI.id && Intrinsics.d(this.title, railwayTicketListVI.title) && Intrinsics.d(this.subtitle, railwayTicketListVI.subtitle) && Intrinsics.d(this.ticketSegment, railwayTicketListVI.ticketSegment) && Intrinsics.d(this.transferTicketSegment, railwayTicketListVI.transferTicketSegment) && Intrinsics.d(this.transferInfo, railwayTicketListVI.transferInfo) && Intrinsics.d(this.routeInfo, railwayTicketListVI.routeInfo) && this.isRouteInfoVisible == railwayTicketListVI.isRouteInfoVisible && this.isTopPaddingVisible == railwayTicketListVI.isTopPaddingVisible;
    }

    @Override // l20.c
    public long getId() {
        return this.id;
    }

    @NotNull
    public final BadgeDTO getRouteInfo() {
        return this.routeInfo;
    }

    @Override // l20.c
    public Integer getScrollWidgetKey() {
        return null;
    }

    public final TextDTO getSubtitle() {
        return this.subtitle;
    }

    @NotNull
    public final TicketSegmentVI getTicketSegment() {
        return this.ticketSegment;
    }

    @NotNull
    public final TextDTO getTitle() {
        return this.title;
    }

    public final CellDTO getTransferInfo() {
        return this.transferInfo;
    }

    public final TicketSegmentVI getTransferTicketSegment() {
        return this.transferTicketSegment;
    }

    @Override // l20.c
    public int getViewItemKey() {
        return hashCode();
    }

    public int hashCode() {
        int a11 = b.a(this.title, Long.hashCode(this.id) * 31, 31);
        TextDTO textDTO = this.subtitle;
        int hashCode = (this.ticketSegment.hashCode() + ((a11 + (textDTO == null ? 0 : textDTO.hashCode())) * 31)) * 31;
        TicketSegmentVI ticketSegmentVI = this.transferTicketSegment;
        int hashCode2 = (hashCode + (ticketSegmentVI == null ? 0 : ticketSegmentVI.hashCode())) * 31;
        CellDTO cellDTO = this.transferInfo;
        return Boolean.hashCode(this.isTopPaddingVisible) + C3532b.a(C3124a.c(this.routeInfo, (hashCode2 + (cellDTO != null ? cellDTO.hashCode() : 0)) * 31, 31), 31, this.isRouteInfoVisible);
    }

    /* renamed from: isRouteInfoVisible, reason: from getter */
    public final boolean getIsRouteInfoVisible() {
        return this.isRouteInfoVisible;
    }

    /* renamed from: isTopPaddingVisible, reason: from getter */
    public final boolean getIsTopPaddingVisible() {
        return this.isTopPaddingVisible;
    }

    @NotNull
    public String toString() {
        long j11 = this.id;
        TextDTO textDTO = this.title;
        TextDTO textDTO2 = this.subtitle;
        TicketSegmentVI ticketSegmentVI = this.ticketSegment;
        TicketSegmentVI ticketSegmentVI2 = this.transferTicketSegment;
        CellDTO cellDTO = this.transferInfo;
        BadgeDTO badgeDTO = this.routeInfo;
        boolean z11 = this.isRouteInfoVisible;
        boolean z12 = this.isTopPaddingVisible;
        StringBuilder b11 = a.b("RailwayTicketListVI(id=", j11, ", title=", textDTO);
        b11.append(", subtitle=");
        b11.append(textDTO2);
        b11.append(", ticketSegment=");
        b11.append(ticketSegmentVI);
        b11.append(", transferTicketSegment=");
        b11.append(ticketSegmentVI2);
        b11.append(", transferInfo=");
        b11.append(cellDTO);
        b11.append(", routeInfo=");
        b11.append(badgeDTO);
        b11.append(", isRouteInfoVisible=");
        b11.append(z11);
        return Bi.b.f(b11, ", isTopPaddingVisible=", z12, ")");
    }
}
