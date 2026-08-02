package ru.ozon.app.android.travel.feature.b2b.widgets.b2bUpcomingTrips.data;

import Cm.e;
import D3.g;
import D40.d;
import Hj.C3143a;
import Ns.b;
import com.squareup.moshi.j;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.tokenized.model.TokenizedTrackingInfo;
import ru.ozon.app.android.ugc.widgets.selectionItemForm.data.SelectionItemFormDTO;
import ru.ozon.uni.atoms.data.controls.CommonControlSettings;
import ru.ozon.uni.atoms.data.dsBadge.BadgeDTO;
import ru.ozon.uni.atoms.data.icon.IconDTO;
import ru.ozon.uni.atoms.data.text.TextDTO;

@j(generateAdapter = true)
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0081\b\u0018\u00002\u00020\u0001:\u0001\"B=\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007\u0012\u0014\u0010\t\u001a\u0010\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f\u0018\u00010\n¢\u0006\u0004\b\r\u0010\u000eJ\t\u0010\u0017\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0018\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\b0\u0007HÆ\u0003J\u0017\u0010\u001a\u001a\u0010\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f\u0018\u00010\nHÆ\u0003JG\u0010\u001b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\u0016\b\u0002\u0010\t\u001a\u0010\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f\u0018\u00010\nHÆ\u0001J\u0013\u0010\u001c\u001a\u00020\u001d2\b\u0010\u001e\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001f\u001a\u00020 HÖ\u0001J\t\u0010!\u001a\u00020\u000bHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u001f\u0010\t\u001a\u0010\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f\u0018\u00010\n¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016¨\u0006#"}, d2 = {"Lru/ozon/app/android/travel/feature/b2b/widgets/b2bUpcomingTrips/data/B2BUpcomingTripsDTO;", "", SelectionItemFormDTO.TITLE_FIELD_NAME, "Lru/ozon/uni/atoms/data/text/TextDTO;", "badge", "Lru/ozon/uni/atoms/data/dsBadge/BadgeDTO;", "trips", "", "Lru/ozon/app/android/travel/feature/b2b/widgets/b2bUpcomingTrips/data/B2BUpcomingTripsDTO$UpcomingTrip;", "trackingInfo", "", "", "Lru/ozon/android/tokenized/model/TokenizedTrackingInfo;", "<init>", "(Lru/ozon/uni/atoms/data/text/TextDTO;Lru/ozon/uni/atoms/data/dsBadge/BadgeDTO;Ljava/util/List;Ljava/util/Map;)V", "getTitle", "()Lru/ozon/uni/atoms/data/text/TextDTO;", "getBadge", "()Lru/ozon/uni/atoms/data/dsBadge/BadgeDTO;", "getTrips", "()Ljava/util/List;", "getTrackingInfo", "()Ljava/util/Map;", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "", "toString", "UpcomingTrip", "b2b_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final /* data */ class B2BUpcomingTripsDTO {
    public static final int $stable = 8;
    private final BadgeDTO badge;

    @NotNull
    private final TextDTO title;
    private final Map<String, TokenizedTrackingInfo> trackingInfo;

    @NotNull
    private final List<UpcomingTrip> trips;

    @j(generateAdapter = true)
    @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0016\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0081\b\u0018\u00002\u00020\u0001BK\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u000e\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\b\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010\f\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b\u000e\u0010\u000fJ\t\u0010\u001b\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001c\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001d\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001e\u001a\u00020\u0003HÆ\u0003J\u0011\u0010\u001f\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\bHÆ\u0003J\u000b\u0010 \u001a\u0004\u0018\u00010\u000bHÆ\u0003J\u000b\u0010!\u001a\u0004\u0018\u00010\rHÆ\u0003J[\u0010\"\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\u0010\b\u0002\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\b2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\rHÆ\u0001J\u0013\u0010#\u001a\u00020$2\b\u0010%\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010&\u001a\u00020'HÖ\u0001J\t\u0010(\u001a\u00020\u000bHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0011R\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0011R\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0011R\u0019\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0013\u0010\n\u001a\u0004\u0018\u00010\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0013\u0010\f\u001a\u0004\u0018\u00010\r¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001a¨\u0006)"}, d2 = {"Lru/ozon/app/android/travel/feature/b2b/widgets/b2bUpcomingTrips/data/B2BUpcomingTripsDTO$UpcomingTrip;", "", "status", "Lru/ozon/uni/atoms/data/text/TextDTO;", "route", "dates", "employees", "icons", "", "Lru/ozon/uni/atoms/data/icon/IconDTO;", "backgroundColor", "", "common", "Lru/ozon/uni/atoms/data/controls/CommonControlSettings;", "<init>", "(Lru/ozon/uni/atoms/data/text/TextDTO;Lru/ozon/uni/atoms/data/text/TextDTO;Lru/ozon/uni/atoms/data/text/TextDTO;Lru/ozon/uni/atoms/data/text/TextDTO;Ljava/util/List;Ljava/lang/String;Lru/ozon/uni/atoms/data/controls/CommonControlSettings;)V", "getStatus", "()Lru/ozon/uni/atoms/data/text/TextDTO;", "getRoute", "getDates", "getEmployees", "getIcons", "()Ljava/util/List;", "getBackgroundColor", "()Ljava/lang/String;", "getCommon", "()Lru/ozon/uni/atoms/data/controls/CommonControlSettings;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "equals", "", "other", "hashCode", "", "toString", "b2b_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class UpcomingTrip {
        public static final int $stable = 8;
        private final String backgroundColor;
        private final CommonControlSettings common;

        @NotNull
        private final TextDTO dates;

        @NotNull
        private final TextDTO employees;
        private final List<IconDTO> icons;

        @NotNull
        private final TextDTO route;

        @NotNull
        private final TextDTO status;

        public UpcomingTrip(@NotNull TextDTO status, @NotNull TextDTO route, @NotNull TextDTO dates, @NotNull TextDTO employees, List<IconDTO> list, String str, CommonControlSettings commonControlSettings) {
            Intrinsics.checkNotNullParameter(status, "status");
            Intrinsics.checkNotNullParameter(route, "route");
            Intrinsics.checkNotNullParameter(dates, "dates");
            Intrinsics.checkNotNullParameter(employees, "employees");
            this.status = status;
            this.route = route;
            this.dates = dates;
            this.employees = employees;
            this.icons = list;
            this.backgroundColor = str;
            this.common = commonControlSettings;
        }

        public static /* synthetic */ UpcomingTrip copy$default(UpcomingTrip upcomingTrip, TextDTO textDTO, TextDTO textDTO2, TextDTO textDTO3, TextDTO textDTO4, List list, String str, CommonControlSettings commonControlSettings, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                textDTO = upcomingTrip.status;
            }
            if ((i11 & 2) != 0) {
                textDTO2 = upcomingTrip.route;
            }
            if ((i11 & 4) != 0) {
                textDTO3 = upcomingTrip.dates;
            }
            if ((i11 & 8) != 0) {
                textDTO4 = upcomingTrip.employees;
            }
            if ((i11 & 16) != 0) {
                list = upcomingTrip.icons;
            }
            if ((i11 & 32) != 0) {
                str = upcomingTrip.backgroundColor;
            }
            if ((i11 & 64) != 0) {
                commonControlSettings = upcomingTrip.common;
            }
            String str2 = str;
            CommonControlSettings commonControlSettings2 = commonControlSettings;
            List list2 = list;
            TextDTO textDTO5 = textDTO3;
            return upcomingTrip.copy(textDTO, textDTO2, textDTO5, textDTO4, list2, str2, commonControlSettings2);
        }

        @NotNull
        /* renamed from: component1, reason: from getter */
        public final TextDTO getStatus() {
            return this.status;
        }

        @NotNull
        /* renamed from: component2, reason: from getter */
        public final TextDTO getRoute() {
            return this.route;
        }

        @NotNull
        /* renamed from: component3, reason: from getter */
        public final TextDTO getDates() {
            return this.dates;
        }

        @NotNull
        /* renamed from: component4, reason: from getter */
        public final TextDTO getEmployees() {
            return this.employees;
        }

        public final List<IconDTO> component5() {
            return this.icons;
        }

        /* renamed from: component6, reason: from getter */
        public final String getBackgroundColor() {
            return this.backgroundColor;
        }

        /* renamed from: component7, reason: from getter */
        public final CommonControlSettings getCommon() {
            return this.common;
        }

        @NotNull
        public final UpcomingTrip copy(@NotNull TextDTO status, @NotNull TextDTO route, @NotNull TextDTO dates, @NotNull TextDTO employees, List<IconDTO> icons, String backgroundColor, CommonControlSettings common) {
            Intrinsics.checkNotNullParameter(status, "status");
            Intrinsics.checkNotNullParameter(route, "route");
            Intrinsics.checkNotNullParameter(dates, "dates");
            Intrinsics.checkNotNullParameter(employees, "employees");
            return new UpcomingTrip(status, route, dates, employees, icons, backgroundColor, common);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof UpcomingTrip)) {
                return false;
            }
            UpcomingTrip upcomingTrip = (UpcomingTrip) other;
            return Intrinsics.d(this.status, upcomingTrip.status) && Intrinsics.d(this.route, upcomingTrip.route) && Intrinsics.d(this.dates, upcomingTrip.dates) && Intrinsics.d(this.employees, upcomingTrip.employees) && Intrinsics.d(this.icons, upcomingTrip.icons) && Intrinsics.d(this.backgroundColor, upcomingTrip.backgroundColor) && Intrinsics.d(this.common, upcomingTrip.common);
        }

        public final String getBackgroundColor() {
            return this.backgroundColor;
        }

        public final CommonControlSettings getCommon() {
            return this.common;
        }

        @NotNull
        public final TextDTO getDates() {
            return this.dates;
        }

        @NotNull
        public final TextDTO getEmployees() {
            return this.employees;
        }

        public final List<IconDTO> getIcons() {
            return this.icons;
        }

        @NotNull
        public final TextDTO getRoute() {
            return this.route;
        }

        @NotNull
        public final TextDTO getStatus() {
            return this.status;
        }

        public int hashCode() {
            int a11 = b.a(this.employees, b.a(this.dates, b.a(this.route, this.status.hashCode() * 31, 31), 31), 31);
            List<IconDTO> list = this.icons;
            int hashCode = (a11 + (list == null ? 0 : list.hashCode())) * 31;
            String str = this.backgroundColor;
            int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
            CommonControlSettings commonControlSettings = this.common;
            return hashCode2 + (commonControlSettings != null ? commonControlSettings.hashCode() : 0);
        }

        @NotNull
        public String toString() {
            TextDTO textDTO = this.status;
            TextDTO textDTO2 = this.route;
            TextDTO textDTO3 = this.dates;
            TextDTO textDTO4 = this.employees;
            List<IconDTO> list = this.icons;
            String str = this.backgroundColor;
            CommonControlSettings commonControlSettings = this.common;
            StringBuilder g10 = g.g("UpcomingTrip(status=", textDTO, ", route=", textDTO2, ", dates=");
            d.e(", employees=", ", icons=", g10, textDTO3, textDTO4);
            e.i(", backgroundColor=", str, ", common=", g10, list);
            return Ak.b.g(g10, commonControlSettings, ")");
        }
    }

    public B2BUpcomingTripsDTO(@NotNull TextDTO title, BadgeDTO badgeDTO, @NotNull List<UpcomingTrip> trips, Map<String, TokenizedTrackingInfo> map) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(trips, "trips");
        this.title = title;
        this.badge = badgeDTO;
        this.trips = trips;
        this.trackingInfo = map;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ B2BUpcomingTripsDTO copy$default(B2BUpcomingTripsDTO b2BUpcomingTripsDTO, TextDTO textDTO, BadgeDTO badgeDTO, List list, Map map, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            textDTO = b2BUpcomingTripsDTO.title;
        }
        if ((i11 & 2) != 0) {
            badgeDTO = b2BUpcomingTripsDTO.badge;
        }
        if ((i11 & 4) != 0) {
            list = b2BUpcomingTripsDTO.trips;
        }
        if ((i11 & 8) != 0) {
            map = b2BUpcomingTripsDTO.trackingInfo;
        }
        return b2BUpcomingTripsDTO.copy(textDTO, badgeDTO, list, map);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final TextDTO getTitle() {
        return this.title;
    }

    /* renamed from: component2, reason: from getter */
    public final BadgeDTO getBadge() {
        return this.badge;
    }

    @NotNull
    public final List<UpcomingTrip> component3() {
        return this.trips;
    }

    public final Map<String, TokenizedTrackingInfo> component4() {
        return this.trackingInfo;
    }

    @NotNull
    public final B2BUpcomingTripsDTO copy(@NotNull TextDTO title, BadgeDTO badge, @NotNull List<UpcomingTrip> trips, Map<String, TokenizedTrackingInfo> trackingInfo) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(trips, "trips");
        return new B2BUpcomingTripsDTO(title, badge, trips, trackingInfo);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof B2BUpcomingTripsDTO)) {
            return false;
        }
        B2BUpcomingTripsDTO b2BUpcomingTripsDTO = (B2BUpcomingTripsDTO) other;
        return Intrinsics.d(this.title, b2BUpcomingTripsDTO.title) && Intrinsics.d(this.badge, b2BUpcomingTripsDTO.badge) && Intrinsics.d(this.trips, b2BUpcomingTripsDTO.trips) && Intrinsics.d(this.trackingInfo, b2BUpcomingTripsDTO.trackingInfo);
    }

    public final BadgeDTO getBadge() {
        return this.badge;
    }

    @NotNull
    public final TextDTO getTitle() {
        return this.title;
    }

    public final Map<String, TokenizedTrackingInfo> getTrackingInfo() {
        return this.trackingInfo;
    }

    @NotNull
    public final List<UpcomingTrip> getTrips() {
        return this.trips;
    }

    public int hashCode() {
        int hashCode = this.title.hashCode() * 31;
        BadgeDTO badgeDTO = this.badge;
        int b11 = G.g.b((hashCode + (badgeDTO == null ? 0 : badgeDTO.hashCode())) * 31, 31, this.trips);
        Map<String, TokenizedTrackingInfo> map = this.trackingInfo;
        return b11 + (map != null ? map.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        TextDTO textDTO = this.title;
        BadgeDTO badgeDTO = this.badge;
        List<UpcomingTrip> list = this.trips;
        Map<String, TokenizedTrackingInfo> map = this.trackingInfo;
        StringBuilder sb2 = new StringBuilder("B2BUpcomingTripsDTO(title=");
        sb2.append(textDTO);
        sb2.append(", badge=");
        sb2.append(badgeDTO);
        sb2.append(", trips=");
        return C3143a.h(sb2, list, ", trackingInfo=", map, ")");
    }
}
