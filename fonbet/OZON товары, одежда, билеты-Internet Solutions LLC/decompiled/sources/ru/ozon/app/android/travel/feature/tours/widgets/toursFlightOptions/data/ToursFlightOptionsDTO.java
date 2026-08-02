package ru.ozon.app.android.travel.feature.tours.widgets.toursFlightOptions.data;

import B90.C2618u;
import B90.C2619v;
import Bl.b;
import Fm.C3051a;
import G.g;
import Ih.a;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import com.squareup.moshi.j;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.K;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.tokenized.model.TokenizedTrackingInfo;
import ru.ozon.uni.atoms.data.AtomActionDTO;
import ru.ozon.uni.atoms.data.badge.Badge;
import ru.ozon.uni.atoms.data.price.Price;
import ru.ozon.uni.atoms.data.texts.TextAtom;

@j(generateAdapter = true)
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0015\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\b\u0081\b\u0018\u00002\u00020\u0001:\u0002()BG\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0014\u0010\b\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\n\u0018\u00010\t\u0012\u000e\b\u0002\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\r0\f¢\u0006\u0004\b\u000e\u0010\u000fJ\t\u0010\u001b\u001a\u00020\u0003HÆ\u0003J\u0010\u0010\u001c\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010\u0013J\t\u0010\u001d\u001a\u00020\u0007HÆ\u0003J\u0017\u0010\u001e\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\n\u0018\u00010\tHÆ\u0003J\u000f\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\r0\fHÆ\u0003JV\u0010 \u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\u0016\b\u0002\u0010\b\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\n\u0018\u00010\t2\u000e\b\u0002\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\r0\fHÆ\u0001¢\u0006\u0002\u0010!J\u0013\u0010\"\u001a\u00020#2\b\u0010$\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010%\u001a\u00020&HÖ\u0001J\t\u0010'\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0015\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\n\n\u0002\u0010\u0014\u001a\u0004\b\u0012\u0010\u0013R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u001f\u0010\b\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\n\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0017\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\r0\f¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001a¨\u0006*"}, d2 = {"Lru/ozon/app/android/travel/feature/tours/widgets/toursFlightOptions/data/ToursFlightOptionsDTO;", "", "timeoutDate", "", "timeoutMs", "", "timeoutAction", "Lru/ozon/uni/atoms/data/AtomActionDTO;", "trackingInfo", "", "Lru/ozon/android/tokenized/model/TokenizedTrackingInfo;", "flights", "", "Lru/ozon/app/android/travel/feature/tours/widgets/toursFlightOptions/data/ToursFlightOptionsDTO$TourFlightDTO;", "<init>", "(Ljava/lang/String;Ljava/lang/Long;Lru/ozon/uni/atoms/data/AtomActionDTO;Ljava/util/Map;Ljava/util/List;)V", "getTimeoutDate", "()Ljava/lang/String;", "getTimeoutMs", "()Ljava/lang/Long;", "Ljava/lang/Long;", "getTimeoutAction", "()Lru/ozon/uni/atoms/data/AtomActionDTO;", "getTrackingInfo", "()Ljava/util/Map;", "getFlights", "()Ljava/util/List;", "component1", "component2", "component3", "component4", "component5", "copy", "(Ljava/lang/String;Ljava/lang/Long;Lru/ozon/uni/atoms/data/AtomActionDTO;Ljava/util/Map;Ljava/util/List;)Lru/ozon/app/android/travel/feature/tours/widgets/toursFlightOptions/data/ToursFlightOptionsDTO;", "equals", "", "other", "hashCode", "", "toString", "TourFlightDTO", "TourFlightDetailsDTO", "tours_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class ToursFlightOptionsDTO {
    public static final int $stable = 8;

    @NotNull
    private final List<TourFlightDTO> flights;

    @NotNull
    private final AtomActionDTO timeoutAction;

    @NotNull
    private final String timeoutDate;
    private final Long timeoutMs;
    private final Map<String, TokenizedTrackingInfo> trackingInfo;

    @j(generateAdapter = true)
    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B)\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0003¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0011\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J3\u0010\u0014\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0018\u001a\u00020\u0019HÖ\u0001J\t\u0010\u001a\u001a\u00020\u0005HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000bR\u0011\u0010\u0007\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000b¨\u0006\u001b"}, d2 = {"Lru/ozon/app/android/travel/feature/tours/widgets/toursFlightOptions/data/ToursFlightOptionsDTO$TourFlightDetailsDTO;", "", "time", "Lru/ozon/uni/atoms/data/texts/TextAtom;", "counter", "", "airportCodes", "duration", "<init>", "(Lru/ozon/uni/atoms/data/texts/TextAtom;Ljava/lang/String;Lru/ozon/uni/atoms/data/texts/TextAtom;Lru/ozon/uni/atoms/data/texts/TextAtom;)V", "getTime", "()Lru/ozon/uni/atoms/data/texts/TextAtom;", "getCounter", "()Ljava/lang/String;", "getAirportCodes", "getDuration", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "", "toString", "tours_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class TourFlightDetailsDTO {
        public static final int $stable = TextAtom.$stable;

        @NotNull
        private final TextAtom airportCodes;
        private final String counter;

        @NotNull
        private final TextAtom duration;

        @NotNull
        private final TextAtom time;

        public TourFlightDetailsDTO(@NotNull TextAtom time, String str, @NotNull TextAtom airportCodes, @NotNull TextAtom duration) {
            Intrinsics.checkNotNullParameter(time, "time");
            Intrinsics.checkNotNullParameter(airportCodes, "airportCodes");
            Intrinsics.checkNotNullParameter(duration, "duration");
            this.time = time;
            this.counter = str;
            this.airportCodes = airportCodes;
            this.duration = duration;
        }

        public static /* synthetic */ TourFlightDetailsDTO copy$default(TourFlightDetailsDTO tourFlightDetailsDTO, TextAtom textAtom, String str, TextAtom textAtom2, TextAtom textAtom3, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                textAtom = tourFlightDetailsDTO.time;
            }
            if ((i11 & 2) != 0) {
                str = tourFlightDetailsDTO.counter;
            }
            if ((i11 & 4) != 0) {
                textAtom2 = tourFlightDetailsDTO.airportCodes;
            }
            if ((i11 & 8) != 0) {
                textAtom3 = tourFlightDetailsDTO.duration;
            }
            return tourFlightDetailsDTO.copy(textAtom, str, textAtom2, textAtom3);
        }

        @NotNull
        /* renamed from: component1, reason: from getter */
        public final TextAtom getTime() {
            return this.time;
        }

        /* renamed from: component2, reason: from getter */
        public final String getCounter() {
            return this.counter;
        }

        @NotNull
        /* renamed from: component3, reason: from getter */
        public final TextAtom getAirportCodes() {
            return this.airportCodes;
        }

        @NotNull
        /* renamed from: component4, reason: from getter */
        public final TextAtom getDuration() {
            return this.duration;
        }

        @NotNull
        public final TourFlightDetailsDTO copy(@NotNull TextAtom time, String counter, @NotNull TextAtom airportCodes, @NotNull TextAtom duration) {
            Intrinsics.checkNotNullParameter(time, "time");
            Intrinsics.checkNotNullParameter(airportCodes, "airportCodes");
            Intrinsics.checkNotNullParameter(duration, "duration");
            return new TourFlightDetailsDTO(time, counter, airportCodes, duration);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof TourFlightDetailsDTO)) {
                return false;
            }
            TourFlightDetailsDTO tourFlightDetailsDTO = (TourFlightDetailsDTO) other;
            return Intrinsics.d(this.time, tourFlightDetailsDTO.time) && Intrinsics.d(this.counter, tourFlightDetailsDTO.counter) && Intrinsics.d(this.airportCodes, tourFlightDetailsDTO.airportCodes) && Intrinsics.d(this.duration, tourFlightDetailsDTO.duration);
        }

        @NotNull
        public final TextAtom getAirportCodes() {
            return this.airportCodes;
        }

        public final String getCounter() {
            return this.counter;
        }

        @NotNull
        public final TextAtom getDuration() {
            return this.duration;
        }

        @NotNull
        public final TextAtom getTime() {
            return this.time;
        }

        public int hashCode() {
            int hashCode = this.time.hashCode() * 31;
            String str = this.counter;
            return this.duration.hashCode() + C2619v.b((hashCode + (str == null ? 0 : str.hashCode())) * 31, 31, this.airportCodes);
        }

        @NotNull
        public String toString() {
            TextAtom textAtom = this.time;
            String str = this.counter;
            TextAtom textAtom2 = this.airportCodes;
            TextAtom textAtom3 = this.duration;
            StringBuilder d11 = b.d("TourFlightDetailsDTO(time=", ", counter=", str, ", airportCodes=", textAtom);
            d11.append(textAtom2);
            d11.append(", duration=");
            d11.append(textAtom3);
            d11.append(")");
            return d11.toString();
        }
    }

    public ToursFlightOptionsDTO(@NotNull String timeoutDate, Long l11, @NotNull AtomActionDTO timeoutAction, Map<String, TokenizedTrackingInfo> map, @NotNull List<TourFlightDTO> flights) {
        Intrinsics.checkNotNullParameter(timeoutDate, "timeoutDate");
        Intrinsics.checkNotNullParameter(timeoutAction, "timeoutAction");
        Intrinsics.checkNotNullParameter(flights, "flights");
        this.timeoutDate = timeoutDate;
        this.timeoutMs = l11;
        this.timeoutAction = timeoutAction;
        this.trackingInfo = map;
        this.flights = flights;
    }

    public static /* synthetic */ ToursFlightOptionsDTO copy$default(ToursFlightOptionsDTO toursFlightOptionsDTO, String str, Long l11, AtomActionDTO atomActionDTO, Map map, List list, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = toursFlightOptionsDTO.timeoutDate;
        }
        if ((i11 & 2) != 0) {
            l11 = toursFlightOptionsDTO.timeoutMs;
        }
        if ((i11 & 4) != 0) {
            atomActionDTO = toursFlightOptionsDTO.timeoutAction;
        }
        if ((i11 & 8) != 0) {
            map = toursFlightOptionsDTO.trackingInfo;
        }
        if ((i11 & 16) != 0) {
            list = toursFlightOptionsDTO.flights;
        }
        List list2 = list;
        AtomActionDTO atomActionDTO2 = atomActionDTO;
        return toursFlightOptionsDTO.copy(str, l11, atomActionDTO2, map, list2);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final String getTimeoutDate() {
        return this.timeoutDate;
    }

    /* renamed from: component2, reason: from getter */
    public final Long getTimeoutMs() {
        return this.timeoutMs;
    }

    @NotNull
    /* renamed from: component3, reason: from getter */
    public final AtomActionDTO getTimeoutAction() {
        return this.timeoutAction;
    }

    public final Map<String, TokenizedTrackingInfo> component4() {
        return this.trackingInfo;
    }

    @NotNull
    public final List<TourFlightDTO> component5() {
        return this.flights;
    }

    @NotNull
    public final ToursFlightOptionsDTO copy(@NotNull String timeoutDate, Long timeoutMs, @NotNull AtomActionDTO timeoutAction, Map<String, TokenizedTrackingInfo> trackingInfo, @NotNull List<TourFlightDTO> flights) {
        Intrinsics.checkNotNullParameter(timeoutDate, "timeoutDate");
        Intrinsics.checkNotNullParameter(timeoutAction, "timeoutAction");
        Intrinsics.checkNotNullParameter(flights, "flights");
        return new ToursFlightOptionsDTO(timeoutDate, timeoutMs, timeoutAction, trackingInfo, flights);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ToursFlightOptionsDTO)) {
            return false;
        }
        ToursFlightOptionsDTO toursFlightOptionsDTO = (ToursFlightOptionsDTO) other;
        return Intrinsics.d(this.timeoutDate, toursFlightOptionsDTO.timeoutDate) && Intrinsics.d(this.timeoutMs, toursFlightOptionsDTO.timeoutMs) && Intrinsics.d(this.timeoutAction, toursFlightOptionsDTO.timeoutAction) && Intrinsics.d(this.trackingInfo, toursFlightOptionsDTO.trackingInfo) && Intrinsics.d(this.flights, toursFlightOptionsDTO.flights);
    }

    @NotNull
    public final List<TourFlightDTO> getFlights() {
        return this.flights;
    }

    @NotNull
    public final AtomActionDTO getTimeoutAction() {
        return this.timeoutAction;
    }

    @NotNull
    public final String getTimeoutDate() {
        return this.timeoutDate;
    }

    public final Long getTimeoutMs() {
        return this.timeoutMs;
    }

    public final Map<String, TokenizedTrackingInfo> getTrackingInfo() {
        return this.trackingInfo;
    }

    public int hashCode() {
        int hashCode = this.timeoutDate.hashCode() * 31;
        Long l11 = this.timeoutMs;
        int b11 = a.b(this.timeoutAction, (hashCode + (l11 == null ? 0 : l11.hashCode())) * 31, 31);
        Map<String, TokenizedTrackingInfo> map = this.trackingInfo;
        return this.flights.hashCode() + ((b11 + (map != null ? map.hashCode() : 0)) * 31);
    }

    @NotNull
    public String toString() {
        String str = this.timeoutDate;
        Long l11 = this.timeoutMs;
        AtomActionDTO atomActionDTO = this.timeoutAction;
        Map<String, TokenizedTrackingInfo> map = this.trackingInfo;
        List<TourFlightDTO> list = this.flights;
        StringBuilder sb2 = new StringBuilder("ToursFlightOptionsDTO(timeoutDate=");
        sb2.append(str);
        sb2.append(", timeoutMs=");
        sb2.append(l11);
        sb2.append(", timeoutAction=");
        Sh.b.f(sb2, atomActionDTO, ", trackingInfo=", map, ", flights=");
        return C2618u.h(sb2, list, ")");
    }

    public ToursFlightOptionsDTO(String str, Long l11, AtomActionDTO atomActionDTO, Map map, List list, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, l11, atomActionDTO, map, (i11 & 16) != 0 ? K.f71697a : list);
    }

    @j(generateAdapter = true)
    @Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b#\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0081\u0001\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0006\u0010\u000b\u001a\u00020\f\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f\u0012\u0006\u0010\u000e\u001a\u00020\u000f\u0012\u0014\u0010\u0010\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u0011\u0012\u000e\b\u0002\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00030\u0014\u0012\u000e\b\u0002\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00050\u0014¢\u0006\u0004\b\u0016\u0010\u0017J\t\u0010+\u001a\u00020\u0003HÆ\u0003J\u000b\u0010,\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\t\u0010-\u001a\u00020\u0007HÆ\u0003J\t\u0010.\u001a\u00020\u0007HÆ\u0003J\t\u0010/\u001a\u00020\nHÆ\u0003J\t\u00100\u001a\u00020\fHÆ\u0003J\u000b\u00101\u001a\u0004\u0018\u00010\fHÆ\u0003J\t\u00102\u001a\u00020\u000fHÆ\u0003J\u0017\u00103\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u0011HÆ\u0003J\u000f\u00104\u001a\b\u0012\u0004\u0012\u00020\u00030\u0014HÆ\u0003J\u000f\u00105\u001a\b\u0012\u0004\u0012\u00020\u00050\u0014HÆ\u0003J\u0095\u0001\u00106\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\f2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f2\b\b\u0002\u0010\u000e\u001a\u00020\u000f2\u0016\b\u0002\u0010\u0010\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u00112\u000e\b\u0002\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00030\u00142\u000e\b\u0002\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00050\u0014HÆ\u0001J\u0013\u00107\u001a\u0002082\b\u00109\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010:\u001a\u00020;HÖ\u0001J\t\u0010<\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001bR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001dR\u0011\u0010\b\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001dR\u0011\u0010\t\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010 R\u0011\u0010\u000b\u001a\u00020\f¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\"R\u0013\u0010\r\u001a\u0004\u0018\u00010\f¢\u0006\b\n\u0000\u001a\u0004\b#\u0010\"R\u0011\u0010\u000e\u001a\u00020\u000f¢\u0006\b\n\u0000\u001a\u0004\b$\u0010%R\u001f\u0010\u0010\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u0011¢\u0006\b\n\u0000\u001a\u0004\b&\u0010'R\u0017\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00030\u0014¢\u0006\b\n\u0000\u001a\u0004\b(\u0010)R\u0017\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00050\u0014¢\u0006\b\n\u0000\u001a\u0004\b*\u0010)¨\u0006="}, d2 = {"Lru/ozon/app/android/travel/feature/tours/widgets/toursFlightOptions/data/ToursFlightOptionsDTO$TourFlightDTO;", "", "agencyLogoImageURL", "", "warningBadge", "Lru/ozon/uni/atoms/data/badge/Badge;", "wayThereDetails", "Lru/ozon/app/android/travel/feature/tours/widgets/toursFlightOptions/data/ToursFlightOptionsDTO$TourFlightDetailsDTO;", "wayBackDetails", "price", "Lru/ozon/uni/atoms/data/price/Price;", "priceDescription", "Lru/ozon/uni/atoms/data/texts/TextAtom;", "marketingText", "selectAction", "Lru/ozon/uni/atoms/data/AtomActionDTO;", "trackingInfo", "", "Lru/ozon/android/tokenized/model/TokenizedTrackingInfo;", "airlineLogoURLs", "", "flightFeatures", "<init>", "(Ljava/lang/String;Lru/ozon/uni/atoms/data/badge/Badge;Lru/ozon/app/android/travel/feature/tours/widgets/toursFlightOptions/data/ToursFlightOptionsDTO$TourFlightDetailsDTO;Lru/ozon/app/android/travel/feature/tours/widgets/toursFlightOptions/data/ToursFlightOptionsDTO$TourFlightDetailsDTO;Lru/ozon/uni/atoms/data/price/Price;Lru/ozon/uni/atoms/data/texts/TextAtom;Lru/ozon/uni/atoms/data/texts/TextAtom;Lru/ozon/uni/atoms/data/AtomActionDTO;Ljava/util/Map;Ljava/util/List;Ljava/util/List;)V", "getAgencyLogoImageURL", "()Ljava/lang/String;", "getWarningBadge", "()Lru/ozon/uni/atoms/data/badge/Badge;", "getWayThereDetails", "()Lru/ozon/app/android/travel/feature/tours/widgets/toursFlightOptions/data/ToursFlightOptionsDTO$TourFlightDetailsDTO;", "getWayBackDetails", "getPrice", "()Lru/ozon/uni/atoms/data/price/Price;", "getPriceDescription", "()Lru/ozon/uni/atoms/data/texts/TextAtom;", "getMarketingText", "getSelectAction", "()Lru/ozon/uni/atoms/data/AtomActionDTO;", "getTrackingInfo", "()Ljava/util/Map;", "getAirlineLogoURLs", "()Ljava/util/List;", "getFlightFeatures", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "copy", "equals", "", "other", "hashCode", "", "toString", "tours_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class TourFlightDTO {
        public static final int $stable = 8;

        @NotNull
        private final String agencyLogoImageURL;

        @NotNull
        private final List<String> airlineLogoURLs;

        @NotNull
        private final List<Badge> flightFeatures;
        private final TextAtom marketingText;

        @NotNull
        private final Price price;

        @NotNull
        private final TextAtom priceDescription;

        @NotNull
        private final AtomActionDTO selectAction;
        private final Map<String, TokenizedTrackingInfo> trackingInfo;
        private final Badge warningBadge;

        @NotNull
        private final TourFlightDetailsDTO wayBackDetails;

        @NotNull
        private final TourFlightDetailsDTO wayThereDetails;

        public TourFlightDTO(@NotNull String agencyLogoImageURL, Badge badge, @NotNull TourFlightDetailsDTO wayThereDetails, @NotNull TourFlightDetailsDTO wayBackDetails, @NotNull Price price, @NotNull TextAtom priceDescription, TextAtom textAtom, @NotNull AtomActionDTO selectAction, Map<String, TokenizedTrackingInfo> map, @NotNull List<String> airlineLogoURLs, @NotNull List<Badge> flightFeatures) {
            Intrinsics.checkNotNullParameter(agencyLogoImageURL, "agencyLogoImageURL");
            Intrinsics.checkNotNullParameter(wayThereDetails, "wayThereDetails");
            Intrinsics.checkNotNullParameter(wayBackDetails, "wayBackDetails");
            Intrinsics.checkNotNullParameter(price, "price");
            Intrinsics.checkNotNullParameter(priceDescription, "priceDescription");
            Intrinsics.checkNotNullParameter(selectAction, "selectAction");
            Intrinsics.checkNotNullParameter(airlineLogoURLs, "airlineLogoURLs");
            Intrinsics.checkNotNullParameter(flightFeatures, "flightFeatures");
            this.agencyLogoImageURL = agencyLogoImageURL;
            this.warningBadge = badge;
            this.wayThereDetails = wayThereDetails;
            this.wayBackDetails = wayBackDetails;
            this.price = price;
            this.priceDescription = priceDescription;
            this.marketingText = textAtom;
            this.selectAction = selectAction;
            this.trackingInfo = map;
            this.airlineLogoURLs = airlineLogoURLs;
            this.flightFeatures = flightFeatures;
        }

        public static /* synthetic */ TourFlightDTO copy$default(TourFlightDTO tourFlightDTO, String str, Badge badge, TourFlightDetailsDTO tourFlightDetailsDTO, TourFlightDetailsDTO tourFlightDetailsDTO2, Price price, TextAtom textAtom, TextAtom textAtom2, AtomActionDTO atomActionDTO, Map map, List list, List list2, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                str = tourFlightDTO.agencyLogoImageURL;
            }
            if ((i11 & 2) != 0) {
                badge = tourFlightDTO.warningBadge;
            }
            if ((i11 & 4) != 0) {
                tourFlightDetailsDTO = tourFlightDTO.wayThereDetails;
            }
            if ((i11 & 8) != 0) {
                tourFlightDetailsDTO2 = tourFlightDTO.wayBackDetails;
            }
            if ((i11 & 16) != 0) {
                price = tourFlightDTO.price;
            }
            if ((i11 & 32) != 0) {
                textAtom = tourFlightDTO.priceDescription;
            }
            if ((i11 & 64) != 0) {
                textAtom2 = tourFlightDTO.marketingText;
            }
            if ((i11 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0) {
                atomActionDTO = tourFlightDTO.selectAction;
            }
            if ((i11 & 256) != 0) {
                map = tourFlightDTO.trackingInfo;
            }
            if ((i11 & UserVerificationMethods.USER_VERIFY_NONE) != 0) {
                list = tourFlightDTO.airlineLogoURLs;
            }
            if ((i11 & UserVerificationMethods.USER_VERIFY_ALL) != 0) {
                list2 = tourFlightDTO.flightFeatures;
            }
            List list3 = list;
            List list4 = list2;
            AtomActionDTO atomActionDTO2 = atomActionDTO;
            Map map2 = map;
            TextAtom textAtom3 = textAtom;
            TextAtom textAtom4 = textAtom2;
            Price price2 = price;
            TourFlightDetailsDTO tourFlightDetailsDTO3 = tourFlightDetailsDTO;
            return tourFlightDTO.copy(str, badge, tourFlightDetailsDTO3, tourFlightDetailsDTO2, price2, textAtom3, textAtom4, atomActionDTO2, map2, list3, list4);
        }

        @NotNull
        /* renamed from: component1, reason: from getter */
        public final String getAgencyLogoImageURL() {
            return this.agencyLogoImageURL;
        }

        @NotNull
        public final List<String> component10() {
            return this.airlineLogoURLs;
        }

        @NotNull
        public final List<Badge> component11() {
            return this.flightFeatures;
        }

        /* renamed from: component2, reason: from getter */
        public final Badge getWarningBadge() {
            return this.warningBadge;
        }

        @NotNull
        /* renamed from: component3, reason: from getter */
        public final TourFlightDetailsDTO getWayThereDetails() {
            return this.wayThereDetails;
        }

        @NotNull
        /* renamed from: component4, reason: from getter */
        public final TourFlightDetailsDTO getWayBackDetails() {
            return this.wayBackDetails;
        }

        @NotNull
        /* renamed from: component5, reason: from getter */
        public final Price getPrice() {
            return this.price;
        }

        @NotNull
        /* renamed from: component6, reason: from getter */
        public final TextAtom getPriceDescription() {
            return this.priceDescription;
        }

        /* renamed from: component7, reason: from getter */
        public final TextAtom getMarketingText() {
            return this.marketingText;
        }

        @NotNull
        /* renamed from: component8, reason: from getter */
        public final AtomActionDTO getSelectAction() {
            return this.selectAction;
        }

        public final Map<String, TokenizedTrackingInfo> component9() {
            return this.trackingInfo;
        }

        @NotNull
        public final TourFlightDTO copy(@NotNull String agencyLogoImageURL, Badge warningBadge, @NotNull TourFlightDetailsDTO wayThereDetails, @NotNull TourFlightDetailsDTO wayBackDetails, @NotNull Price price, @NotNull TextAtom priceDescription, TextAtom marketingText, @NotNull AtomActionDTO selectAction, Map<String, TokenizedTrackingInfo> trackingInfo, @NotNull List<String> airlineLogoURLs, @NotNull List<Badge> flightFeatures) {
            Intrinsics.checkNotNullParameter(agencyLogoImageURL, "agencyLogoImageURL");
            Intrinsics.checkNotNullParameter(wayThereDetails, "wayThereDetails");
            Intrinsics.checkNotNullParameter(wayBackDetails, "wayBackDetails");
            Intrinsics.checkNotNullParameter(price, "price");
            Intrinsics.checkNotNullParameter(priceDescription, "priceDescription");
            Intrinsics.checkNotNullParameter(selectAction, "selectAction");
            Intrinsics.checkNotNullParameter(airlineLogoURLs, "airlineLogoURLs");
            Intrinsics.checkNotNullParameter(flightFeatures, "flightFeatures");
            return new TourFlightDTO(agencyLogoImageURL, warningBadge, wayThereDetails, wayBackDetails, price, priceDescription, marketingText, selectAction, trackingInfo, airlineLogoURLs, flightFeatures);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof TourFlightDTO)) {
                return false;
            }
            TourFlightDTO tourFlightDTO = (TourFlightDTO) other;
            return Intrinsics.d(this.agencyLogoImageURL, tourFlightDTO.agencyLogoImageURL) && Intrinsics.d(this.warningBadge, tourFlightDTO.warningBadge) && Intrinsics.d(this.wayThereDetails, tourFlightDTO.wayThereDetails) && Intrinsics.d(this.wayBackDetails, tourFlightDTO.wayBackDetails) && Intrinsics.d(this.price, tourFlightDTO.price) && Intrinsics.d(this.priceDescription, tourFlightDTO.priceDescription) && Intrinsics.d(this.marketingText, tourFlightDTO.marketingText) && Intrinsics.d(this.selectAction, tourFlightDTO.selectAction) && Intrinsics.d(this.trackingInfo, tourFlightDTO.trackingInfo) && Intrinsics.d(this.airlineLogoURLs, tourFlightDTO.airlineLogoURLs) && Intrinsics.d(this.flightFeatures, tourFlightDTO.flightFeatures);
        }

        @NotNull
        public final String getAgencyLogoImageURL() {
            return this.agencyLogoImageURL;
        }

        @NotNull
        public final List<String> getAirlineLogoURLs() {
            return this.airlineLogoURLs;
        }

        @NotNull
        public final List<Badge> getFlightFeatures() {
            return this.flightFeatures;
        }

        public final TextAtom getMarketingText() {
            return this.marketingText;
        }

        @NotNull
        public final Price getPrice() {
            return this.price;
        }

        @NotNull
        public final TextAtom getPriceDescription() {
            return this.priceDescription;
        }

        @NotNull
        public final AtomActionDTO getSelectAction() {
            return this.selectAction;
        }

        public final Map<String, TokenizedTrackingInfo> getTrackingInfo() {
            return this.trackingInfo;
        }

        public final Badge getWarningBadge() {
            return this.warningBadge;
        }

        @NotNull
        public final TourFlightDetailsDTO getWayBackDetails() {
            return this.wayBackDetails;
        }

        @NotNull
        public final TourFlightDetailsDTO getWayThereDetails() {
            return this.wayThereDetails;
        }

        public int hashCode() {
            int hashCode = this.agencyLogoImageURL.hashCode() * 31;
            Badge badge = this.warningBadge;
            int b11 = C2619v.b(C3051a.a(this.price, (this.wayBackDetails.hashCode() + ((this.wayThereDetails.hashCode() + ((hashCode + (badge == null ? 0 : badge.hashCode())) * 31)) * 31)) * 31, 31), 31, this.priceDescription);
            TextAtom textAtom = this.marketingText;
            int b12 = a.b(this.selectAction, (b11 + (textAtom == null ? 0 : textAtom.hashCode())) * 31, 31);
            Map<String, TokenizedTrackingInfo> map = this.trackingInfo;
            return this.flightFeatures.hashCode() + g.b((b12 + (map != null ? map.hashCode() : 0)) * 31, 31, this.airlineLogoURLs);
        }

        @NotNull
        public String toString() {
            String str = this.agencyLogoImageURL;
            Badge badge = this.warningBadge;
            TourFlightDetailsDTO tourFlightDetailsDTO = this.wayThereDetails;
            TourFlightDetailsDTO tourFlightDetailsDTO2 = this.wayBackDetails;
            Price price = this.price;
            TextAtom textAtom = this.priceDescription;
            TextAtom textAtom2 = this.marketingText;
            AtomActionDTO atomActionDTO = this.selectAction;
            Map<String, TokenizedTrackingInfo> map = this.trackingInfo;
            List<String> list = this.airlineLogoURLs;
            List<Badge> list2 = this.flightFeatures;
            StringBuilder sb2 = new StringBuilder("TourFlightDTO(agencyLogoImageURL=");
            sb2.append(str);
            sb2.append(", warningBadge=");
            sb2.append(badge);
            sb2.append(", wayThereDetails=");
            sb2.append(tourFlightDetailsDTO);
            sb2.append(", wayBackDetails=");
            sb2.append(tourFlightDetailsDTO2);
            sb2.append(", price=");
            sb2.append(price);
            sb2.append(", priceDescription=");
            sb2.append(textAtom);
            sb2.append(", marketingText=");
            sb2.append(textAtom2);
            sb2.append(", selectAction=");
            sb2.append(atomActionDTO);
            sb2.append(", trackingInfo=");
            sb2.append(map);
            sb2.append(", airlineLogoURLs=");
            sb2.append(list);
            sb2.append(", flightFeatures=");
            return C2618u.h(sb2, list2, ")");
        }

        public TourFlightDTO(String str, Badge badge, TourFlightDetailsDTO tourFlightDetailsDTO, TourFlightDetailsDTO tourFlightDetailsDTO2, Price price, TextAtom textAtom, TextAtom textAtom2, AtomActionDTO atomActionDTO, Map map, List list, List list2, int i11, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, badge, tourFlightDetailsDTO, tourFlightDetailsDTO2, price, textAtom, textAtom2, atomActionDTO, map, (i11 & UserVerificationMethods.USER_VERIFY_NONE) != 0 ? K.f71697a : list, (i11 & UserVerificationMethods.USER_VERIFY_ALL) != 0 ? K.f71697a : list2);
        }
    }
}
