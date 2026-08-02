package ru.ozon.app.android.travel.molecules.dto.tripLeg.v2;

import D3.g;
import D40.d;
import Ns.b;
import com.squareup.moshi.j;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.uni.atoms.data.text.TextDTO;

@j(generateAdapter = true)
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u0019B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0005HÆ\u0003J'\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001J\t\u0010\u0017\u001a\u00020\u0018HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\f¨\u0006\u001a"}, d2 = {"Lru/ozon/app/android/travel/molecules/dto/tripLeg/v2/TripLegV2DTO;", "", "duration", "Lru/ozon/uni/atoms/data/text/TextDTO;", "departure", "Lru/ozon/app/android/travel/molecules/dto/tripLeg/v2/TripLegV2DTO$TripPoint;", "arrival", "<init>", "(Lru/ozon/uni/atoms/data/text/TextDTO;Lru/ozon/app/android/travel/molecules/dto/tripLeg/v2/TripLegV2DTO$TripPoint;Lru/ozon/app/android/travel/molecules/dto/tripLeg/v2/TripLegV2DTO$TripPoint;)V", "getDuration", "()Lru/ozon/uni/atoms/data/text/TextDTO;", "getDeparture", "()Lru/ozon/app/android/travel/molecules/dto/tripLeg/v2/TripLegV2DTO$TripPoint;", "getArrival", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "", "TripPoint", "molecules_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class TripLegV2DTO {

    @NotNull
    private final TripPoint arrival;

    @NotNull
    private final TripPoint departure;

    @NotNull
    private final TextDTO duration;

    @j(generateAdapter = true)
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0003¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J;\u0010\u0015\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0016\u001a\u00020\u00172\b\u0010\u0018\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0019\u001a\u00020\u001aHÖ\u0001J\t\u0010\u001b\u001a\u00020\u001cHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000bR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000bR\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000bR\u0011\u0010\u0007\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000b¨\u0006\u001d"}, d2 = {"Lru/ozon/app/android/travel/molecules/dto/tripLeg/v2/TripLegV2DTO$TripPoint;", "", "date", "Lru/ozon/uni/atoms/data/text/TextDTO;", "time", "city", "airportName", "airportCode", "<init>", "(Lru/ozon/uni/atoms/data/text/TextDTO;Lru/ozon/uni/atoms/data/text/TextDTO;Lru/ozon/uni/atoms/data/text/TextDTO;Lru/ozon/uni/atoms/data/text/TextDTO;Lru/ozon/uni/atoms/data/text/TextDTO;)V", "getDate", "()Lru/ozon/uni/atoms/data/text/TextDTO;", "getTime", "getCity", "getAirportName", "getAirportCode", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", "hashCode", "", "toString", "", "molecules_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class TripPoint {

        @NotNull
        private final TextDTO airportCode;

        @NotNull
        private final TextDTO airportName;

        @NotNull
        private final TextDTO city;

        @NotNull
        private final TextDTO date;

        @NotNull
        private final TextDTO time;

        public TripPoint(@NotNull TextDTO date, @NotNull TextDTO time, @NotNull TextDTO city, @NotNull TextDTO airportName, @NotNull TextDTO airportCode) {
            Intrinsics.checkNotNullParameter(date, "date");
            Intrinsics.checkNotNullParameter(time, "time");
            Intrinsics.checkNotNullParameter(city, "city");
            Intrinsics.checkNotNullParameter(airportName, "airportName");
            Intrinsics.checkNotNullParameter(airportCode, "airportCode");
            this.date = date;
            this.time = time;
            this.city = city;
            this.airportName = airportName;
            this.airportCode = airportCode;
            date.setTagSupported(true);
            time.setTagSupported(true);
            city.setTagSupported(true);
            airportName.setTagSupported(true);
            airportCode.setTagSupported(true);
        }

        public static /* synthetic */ TripPoint copy$default(TripPoint tripPoint, TextDTO textDTO, TextDTO textDTO2, TextDTO textDTO3, TextDTO textDTO4, TextDTO textDTO5, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                textDTO = tripPoint.date;
            }
            if ((i11 & 2) != 0) {
                textDTO2 = tripPoint.time;
            }
            if ((i11 & 4) != 0) {
                textDTO3 = tripPoint.city;
            }
            if ((i11 & 8) != 0) {
                textDTO4 = tripPoint.airportName;
            }
            if ((i11 & 16) != 0) {
                textDTO5 = tripPoint.airportCode;
            }
            TextDTO textDTO6 = textDTO5;
            TextDTO textDTO7 = textDTO3;
            return tripPoint.copy(textDTO, textDTO2, textDTO7, textDTO4, textDTO6);
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

        @NotNull
        /* renamed from: component3, reason: from getter */
        public final TextDTO getCity() {
            return this.city;
        }

        @NotNull
        /* renamed from: component4, reason: from getter */
        public final TextDTO getAirportName() {
            return this.airportName;
        }

        @NotNull
        /* renamed from: component5, reason: from getter */
        public final TextDTO getAirportCode() {
            return this.airportCode;
        }

        @NotNull
        public final TripPoint copy(@NotNull TextDTO date, @NotNull TextDTO time, @NotNull TextDTO city, @NotNull TextDTO airportName, @NotNull TextDTO airportCode) {
            Intrinsics.checkNotNullParameter(date, "date");
            Intrinsics.checkNotNullParameter(time, "time");
            Intrinsics.checkNotNullParameter(city, "city");
            Intrinsics.checkNotNullParameter(airportName, "airportName");
            Intrinsics.checkNotNullParameter(airportCode, "airportCode");
            return new TripPoint(date, time, city, airportName, airportCode);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof TripPoint)) {
                return false;
            }
            TripPoint tripPoint = (TripPoint) other;
            return Intrinsics.d(this.date, tripPoint.date) && Intrinsics.d(this.time, tripPoint.time) && Intrinsics.d(this.city, tripPoint.city) && Intrinsics.d(this.airportName, tripPoint.airportName) && Intrinsics.d(this.airportCode, tripPoint.airportCode);
        }

        @NotNull
        public final TextDTO getAirportCode() {
            return this.airportCode;
        }

        @NotNull
        public final TextDTO getAirportName() {
            return this.airportName;
        }

        @NotNull
        public final TextDTO getCity() {
            return this.city;
        }

        @NotNull
        public final TextDTO getDate() {
            return this.date;
        }

        @NotNull
        public final TextDTO getTime() {
            return this.time;
        }

        public int hashCode() {
            return this.airportCode.hashCode() + b.a(this.airportName, b.a(this.city, b.a(this.time, this.date.hashCode() * 31, 31), 31), 31);
        }

        @NotNull
        public String toString() {
            TextDTO textDTO = this.date;
            TextDTO textDTO2 = this.time;
            TextDTO textDTO3 = this.city;
            TextDTO textDTO4 = this.airportName;
            TextDTO textDTO5 = this.airportCode;
            StringBuilder g10 = g.g("TripPoint(date=", textDTO, ", time=", textDTO2, ", city=");
            d.e(", airportName=", ", airportCode=", g10, textDTO3, textDTO4);
            return Tl.b.e(g10, textDTO5, ")");
        }
    }

    public TripLegV2DTO(@NotNull TextDTO duration, @NotNull TripPoint departure, @NotNull TripPoint arrival) {
        Intrinsics.checkNotNullParameter(duration, "duration");
        Intrinsics.checkNotNullParameter(departure, "departure");
        Intrinsics.checkNotNullParameter(arrival, "arrival");
        this.duration = duration;
        this.departure = departure;
        this.arrival = arrival;
        duration.setTagSupported(true);
    }

    public static /* synthetic */ TripLegV2DTO copy$default(TripLegV2DTO tripLegV2DTO, TextDTO textDTO, TripPoint tripPoint, TripPoint tripPoint2, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            textDTO = tripLegV2DTO.duration;
        }
        if ((i11 & 2) != 0) {
            tripPoint = tripLegV2DTO.departure;
        }
        if ((i11 & 4) != 0) {
            tripPoint2 = tripLegV2DTO.arrival;
        }
        return tripLegV2DTO.copy(textDTO, tripPoint, tripPoint2);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final TextDTO getDuration() {
        return this.duration;
    }

    @NotNull
    /* renamed from: component2, reason: from getter */
    public final TripPoint getDeparture() {
        return this.departure;
    }

    @NotNull
    /* renamed from: component3, reason: from getter */
    public final TripPoint getArrival() {
        return this.arrival;
    }

    @NotNull
    public final TripLegV2DTO copy(@NotNull TextDTO duration, @NotNull TripPoint departure, @NotNull TripPoint arrival) {
        Intrinsics.checkNotNullParameter(duration, "duration");
        Intrinsics.checkNotNullParameter(departure, "departure");
        Intrinsics.checkNotNullParameter(arrival, "arrival");
        return new TripLegV2DTO(duration, departure, arrival);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof TripLegV2DTO)) {
            return false;
        }
        TripLegV2DTO tripLegV2DTO = (TripLegV2DTO) other;
        return Intrinsics.d(this.duration, tripLegV2DTO.duration) && Intrinsics.d(this.departure, tripLegV2DTO.departure) && Intrinsics.d(this.arrival, tripLegV2DTO.arrival);
    }

    @NotNull
    public final TripPoint getArrival() {
        return this.arrival;
    }

    @NotNull
    public final TripPoint getDeparture() {
        return this.departure;
    }

    @NotNull
    public final TextDTO getDuration() {
        return this.duration;
    }

    public int hashCode() {
        return this.arrival.hashCode() + ((this.departure.hashCode() + (this.duration.hashCode() * 31)) * 31);
    }

    @NotNull
    public String toString() {
        return "TripLegV2DTO(duration=" + this.duration + ", departure=" + this.departure + ", arrival=" + this.arrival + ")";
    }
}
