package ru.ozon.app.android.travel.molecules.dto.tripLeg.v3;

import D40.d;
import Fm.C3051a;
import Tl.b;
import com.squareup.moshi.j;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.uni.atoms.data.price.PriceDTO;
import ru.ozon.uni.atoms.data.text.TextDTO;

@j(generateAdapter = true)
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u0019B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0005HÆ\u0003J'\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001J\t\u0010\u0017\u001a\u00020\u0018HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\f¨\u0006\u001a"}, d2 = {"Lru/ozon/app/android/travel/molecules/dto/tripLeg/v3/TripLegV3DTO;", "", "duration", "Lru/ozon/uni/atoms/data/text/TextDTO;", "departure", "Lru/ozon/app/android/travel/molecules/dto/tripLeg/v3/TripLegV3DTO$TripPoint;", "arrival", "<init>", "(Lru/ozon/uni/atoms/data/text/TextDTO;Lru/ozon/app/android/travel/molecules/dto/tripLeg/v3/TripLegV3DTO$TripPoint;Lru/ozon/app/android/travel/molecules/dto/tripLeg/v3/TripLegV3DTO$TripPoint;)V", "getDuration", "()Lru/ozon/uni/atoms/data/text/TextDTO;", "getDeparture", "()Lru/ozon/app/android/travel/molecules/dto/tripLeg/v3/TripLegV3DTO$TripPoint;", "getArrival", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "", "TripPoint", "molecules_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class TripLegV3DTO {

    @NotNull
    private final TripPoint arrival;

    @NotNull
    private final TripPoint departure;

    @NotNull
    private final TextDTO duration;

    @j(generateAdapter = true)
    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B5\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\t\u0010\nJ\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0014\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\u000b\u0010\u0015\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\u000b\u0010\u0016\u001a\u0004\u0018\u00010\u0006HÆ\u0003JA\u0010\u0017\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0006HÆ\u0001J\u0013\u0010\u0018\u001a\u00020\u00192\b\u0010\u001a\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001b\u001a\u00020\u001cHÖ\u0001J\t\u0010\u001d\u001a\u00020\u001eHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\fR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000fR\u0013\u0010\b\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u000f¨\u0006\u001f"}, d2 = {"Lru/ozon/app/android/travel/molecules/dto/tripLeg/v3/TripLegV3DTO$TripPoint;", "", "date", "Lru/ozon/uni/atoms/data/price/PriceDTO;", "time", "city", "Lru/ozon/uni/atoms/data/text/TextDTO;", "airportName", "airportCode", "<init>", "(Lru/ozon/uni/atoms/data/price/PriceDTO;Lru/ozon/uni/atoms/data/price/PriceDTO;Lru/ozon/uni/atoms/data/text/TextDTO;Lru/ozon/uni/atoms/data/text/TextDTO;Lru/ozon/uni/atoms/data/text/TextDTO;)V", "getDate", "()Lru/ozon/uni/atoms/data/price/PriceDTO;", "getTime", "getCity", "()Lru/ozon/uni/atoms/data/text/TextDTO;", "getAirportName", "getAirportCode", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", "hashCode", "", "toString", "", "molecules_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class TripPoint {
        private final TextDTO airportCode;
        private final TextDTO airportName;
        private final TextDTO city;

        @NotNull
        private final PriceDTO date;

        @NotNull
        private final PriceDTO time;

        public TripPoint(@NotNull PriceDTO date, @NotNull PriceDTO time, TextDTO textDTO, TextDTO textDTO2, TextDTO textDTO3) {
            Intrinsics.checkNotNullParameter(date, "date");
            Intrinsics.checkNotNullParameter(time, "time");
            this.date = date;
            this.time = time;
            this.city = textDTO;
            this.airportName = textDTO2;
            this.airportCode = textDTO3;
            if (textDTO != null) {
                textDTO.setTagSupported(true);
            }
            if (textDTO2 != null) {
                textDTO2.setTagSupported(true);
            }
            if (textDTO3 != null) {
                textDTO3.setTagSupported(true);
            }
        }

        public static /* synthetic */ TripPoint copy$default(TripPoint tripPoint, PriceDTO priceDTO, PriceDTO priceDTO2, TextDTO textDTO, TextDTO textDTO2, TextDTO textDTO3, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                priceDTO = tripPoint.date;
            }
            if ((i11 & 2) != 0) {
                priceDTO2 = tripPoint.time;
            }
            if ((i11 & 4) != 0) {
                textDTO = tripPoint.city;
            }
            if ((i11 & 8) != 0) {
                textDTO2 = tripPoint.airportName;
            }
            if ((i11 & 16) != 0) {
                textDTO3 = tripPoint.airportCode;
            }
            TextDTO textDTO4 = textDTO3;
            TextDTO textDTO5 = textDTO;
            return tripPoint.copy(priceDTO, priceDTO2, textDTO5, textDTO2, textDTO4);
        }

        @NotNull
        /* renamed from: component1, reason: from getter */
        public final PriceDTO getDate() {
            return this.date;
        }

        @NotNull
        /* renamed from: component2, reason: from getter */
        public final PriceDTO getTime() {
            return this.time;
        }

        /* renamed from: component3, reason: from getter */
        public final TextDTO getCity() {
            return this.city;
        }

        /* renamed from: component4, reason: from getter */
        public final TextDTO getAirportName() {
            return this.airportName;
        }

        /* renamed from: component5, reason: from getter */
        public final TextDTO getAirportCode() {
            return this.airportCode;
        }

        @NotNull
        public final TripPoint copy(@NotNull PriceDTO date, @NotNull PriceDTO time, TextDTO city, TextDTO airportName, TextDTO airportCode) {
            Intrinsics.checkNotNullParameter(date, "date");
            Intrinsics.checkNotNullParameter(time, "time");
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

        public final TextDTO getAirportCode() {
            return this.airportCode;
        }

        public final TextDTO getAirportName() {
            return this.airportName;
        }

        public final TextDTO getCity() {
            return this.city;
        }

        @NotNull
        public final PriceDTO getDate() {
            return this.date;
        }

        @NotNull
        public final PriceDTO getTime() {
            return this.time;
        }

        public int hashCode() {
            int b11 = C3051a.b(this.time, this.date.hashCode() * 31, 31);
            TextDTO textDTO = this.city;
            int hashCode = (b11 + (textDTO == null ? 0 : textDTO.hashCode())) * 31;
            TextDTO textDTO2 = this.airportName;
            int hashCode2 = (hashCode + (textDTO2 == null ? 0 : textDTO2.hashCode())) * 31;
            TextDTO textDTO3 = this.airportCode;
            return hashCode2 + (textDTO3 != null ? textDTO3.hashCode() : 0);
        }

        @NotNull
        public String toString() {
            PriceDTO priceDTO = this.date;
            PriceDTO priceDTO2 = this.time;
            TextDTO textDTO = this.city;
            TextDTO textDTO2 = this.airportName;
            TextDTO textDTO3 = this.airportCode;
            StringBuilder sb2 = new StringBuilder("TripPoint(date=");
            sb2.append(priceDTO);
            sb2.append(", time=");
            sb2.append(priceDTO2);
            sb2.append(", city=");
            d.e(", airportName=", ", airportCode=", sb2, textDTO, textDTO2);
            return b.e(sb2, textDTO3, ")");
        }
    }

    public TripLegV3DTO(@NotNull TextDTO duration, @NotNull TripPoint departure, @NotNull TripPoint arrival) {
        Intrinsics.checkNotNullParameter(duration, "duration");
        Intrinsics.checkNotNullParameter(departure, "departure");
        Intrinsics.checkNotNullParameter(arrival, "arrival");
        this.duration = duration;
        this.departure = departure;
        this.arrival = arrival;
        duration.setTagSupported(true);
    }

    public static /* synthetic */ TripLegV3DTO copy$default(TripLegV3DTO tripLegV3DTO, TextDTO textDTO, TripPoint tripPoint, TripPoint tripPoint2, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            textDTO = tripLegV3DTO.duration;
        }
        if ((i11 & 2) != 0) {
            tripPoint = tripLegV3DTO.departure;
        }
        if ((i11 & 4) != 0) {
            tripPoint2 = tripLegV3DTO.arrival;
        }
        return tripLegV3DTO.copy(textDTO, tripPoint, tripPoint2);
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
    public final TripLegV3DTO copy(@NotNull TextDTO duration, @NotNull TripPoint departure, @NotNull TripPoint arrival) {
        Intrinsics.checkNotNullParameter(duration, "duration");
        Intrinsics.checkNotNullParameter(departure, "departure");
        Intrinsics.checkNotNullParameter(arrival, "arrival");
        return new TripLegV3DTO(duration, departure, arrival);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof TripLegV3DTO)) {
            return false;
        }
        TripLegV3DTO tripLegV3DTO = (TripLegV3DTO) other;
        return Intrinsics.d(this.duration, tripLegV3DTO.duration) && Intrinsics.d(this.departure, tripLegV3DTO.departure) && Intrinsics.d(this.arrival, tripLegV3DTO.arrival);
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
        return "TripLegV3DTO(duration=" + this.duration + ", departure=" + this.departure + ", arrival=" + this.arrival + ")";
    }
}
