package ru.ozon.app.android.travel.feature.tours.widgets.toursFlightDetails.data;

import B90.C2618u;
import B90.C2619v;
import G.g;
import HY.a;
import I1.w;
import com.squareup.moshi.j;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.tokenized.model.TokenizedTrackingInfo;
import ru.ozon.app.android.atoms.data.disclaimer.DisclaimerAtom;
import ru.ozon.app.android.ugc.widgets.selectionItemForm.data.SelectionItemFormDTO;
import ru.ozon.moshi.adapters.serialize.proto.ProtoOneOf;
import ru.ozon.moshi.adapters.serialize.proto.ProtoOneOfSignature;
import ru.ozon.uni.atoms.data.badge.Badge;
import ru.ozon.uni.atoms.data.button.Icon;
import ru.ozon.uni.atoms.data.texts.TextAtom;

@j(generateAdapter = true)
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\b\u0081\b\u0018\u00002\u00020\u0001:\u0003\"#$B?\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\u0014\u0010\t\u001a\u0010\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f\u0018\u00010\n¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\u000b\u0010\u0018\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\u000b\u0010\u0019\u001a\u0004\u0018\u00010\bHÆ\u0003J\u0017\u0010\u001a\u001a\u0010\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f\u0018\u00010\nHÆ\u0003JI\u0010\u001b\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b2\u0016\b\u0002\u0010\t\u001a\u0010\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f\u0018\u00010\nHÆ\u0001J\u0013\u0010\u001c\u001a\u00020\u001d2\b\u0010\u001e\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001f\u001a\u00020 HÖ\u0001J\t\u0010!\u001a\u00020\u000bHÖ\u0001R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0013\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u001f\u0010\t\u001a\u0010\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f\u0018\u00010\n¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016¨\u0006%"}, d2 = {"Lru/ozon/app/android/travel/feature/tours/widgets/toursFlightDetails/data/ToursFlightDetailsDTO;", "", "routes", "", "Lru/ozon/app/android/travel/feature/tours/widgets/toursFlightDetails/data/ToursFlightDetailsDTO$Route;", "caption", "Lru/ozon/uni/atoms/data/texts/TextAtom;", SelectionItemFormDTO.DISCLAIMER_FIELD_NAME, "Lru/ozon/app/android/atoms/data/disclaimer/DisclaimerAtom;", "trackingInfo", "", "", "Lru/ozon/android/tokenized/model/TokenizedTrackingInfo;", "<init>", "(Ljava/util/List;Lru/ozon/uni/atoms/data/texts/TextAtom;Lru/ozon/app/android/atoms/data/disclaimer/DisclaimerAtom;Ljava/util/Map;)V", "getRoutes", "()Ljava/util/List;", "getCaption", "()Lru/ozon/uni/atoms/data/texts/TextAtom;", "getDisclaimer", "()Lru/ozon/app/android/atoms/data/disclaimer/DisclaimerAtom;", "getTrackingInfo", "()Ljava/util/Map;", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "", "toString", "Route", "Flight", "Transfer", "tours_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class ToursFlightDetailsDTO {
    public static final int $stable = 8;
    private final TextAtom caption;
    private final DisclaimerAtom disclaimer;

    @NotNull
    private final List<Route> routes;
    private final Map<String, TokenizedTrackingInfo> trackingInfo;

    @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0015\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001:\u0001&B?\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u000e\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\b\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\t\u0010\u0019\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001a\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001b\u001a\u00020\u0006HÆ\u0003J\u0011\u0010\u001c\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\bHÆ\u0003J\t\u0010\u001d\u001a\u00020\u000bHÆ\u0003J\t\u0010\u001e\u001a\u00020\u000bHÆ\u0003JM\u0010\u001f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\u0010\b\u0002\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\b2\b\b\u0002\u0010\n\u001a\u00020\u000b2\b\b\u0002\u0010\f\u001a\u00020\u000bHÆ\u0001J\u0013\u0010 \u001a\u00020!2\b\u0010\"\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010#\u001a\u00020$HÖ\u0001J\t\u0010%\u001a\u00020\u0006HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0010R\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0019\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0011\u0010\n\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0011\u0010\f\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0017¨\u0006'"}, d2 = {"Lru/ozon/app/android/travel/feature/tours/widgets/toursFlightDetails/data/ToursFlightDetailsDTO$Flight;", "", "airlineName", "Lru/ozon/uni/atoms/data/texts/TextAtom;", "subtitle", "logoImageURL", "", "badges", "", "Lru/ozon/uni/atoms/data/badge/Badge;", "departure", "Lru/ozon/app/android/travel/feature/tours/widgets/toursFlightDetails/data/ToursFlightDetailsDTO$Flight$FlightPoint;", "arrival", "<init>", "(Lru/ozon/uni/atoms/data/texts/TextAtom;Lru/ozon/uni/atoms/data/texts/TextAtom;Ljava/lang/String;Ljava/util/List;Lru/ozon/app/android/travel/feature/tours/widgets/toursFlightDetails/data/ToursFlightDetailsDTO$Flight$FlightPoint;Lru/ozon/app/android/travel/feature/tours/widgets/toursFlightDetails/data/ToursFlightDetailsDTO$Flight$FlightPoint;)V", "getAirlineName", "()Lru/ozon/uni/atoms/data/texts/TextAtom;", "getSubtitle", "getLogoImageURL", "()Ljava/lang/String;", "getBadges", "()Ljava/util/List;", "getDeparture", "()Lru/ozon/app/android/travel/feature/tours/widgets/toursFlightDetails/data/ToursFlightDetailsDTO$Flight$FlightPoint;", "getArrival", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "", "other", "hashCode", "", "toString", "FlightPoint", "tours_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    @j(generateAdapter = true)
    public static final /* data */ class Flight {
        public static final int $stable = 8;

        @NotNull
        private final TextAtom airlineName;

        @NotNull
        private final FlightPoint arrival;
        private final List<Badge> badges;

        @NotNull
        private final FlightPoint departure;

        @NotNull
        private final String logoImageURL;

        @NotNull
        private final TextAtom subtitle;

        @j(generateAdapter = true)
        @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J1\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001J\t\u0010\u0018\u001a\u00020\u0019HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\nR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\nR\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\n¨\u0006\u001a"}, d2 = {"Lru/ozon/app/android/travel/feature/tours/widgets/toursFlightDetails/data/ToursFlightDetailsDTO$Flight$FlightPoint;", "", "city", "Lru/ozon/uni/atoms/data/texts/TextAtom;", "airport", "time", "date", "<init>", "(Lru/ozon/uni/atoms/data/texts/TextAtom;Lru/ozon/uni/atoms/data/texts/TextAtom;Lru/ozon/uni/atoms/data/texts/TextAtom;Lru/ozon/uni/atoms/data/texts/TextAtom;)V", "getCity", "()Lru/ozon/uni/atoms/data/texts/TextAtom;", "getAirport", "getTime", "getDate", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "", "toString", "", "tours_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final /* data */ class FlightPoint {
            public static final int $stable = TextAtom.$stable;

            @NotNull
            private final TextAtom airport;

            @NotNull
            private final TextAtom city;

            @NotNull
            private final TextAtom date;

            @NotNull
            private final TextAtom time;

            public FlightPoint(@NotNull TextAtom city, @NotNull TextAtom airport, @NotNull TextAtom time, @NotNull TextAtom date) {
                Intrinsics.checkNotNullParameter(city, "city");
                Intrinsics.checkNotNullParameter(airport, "airport");
                Intrinsics.checkNotNullParameter(time, "time");
                Intrinsics.checkNotNullParameter(date, "date");
                this.city = city;
                this.airport = airport;
                this.time = time;
                this.date = date;
            }

            public static /* synthetic */ FlightPoint copy$default(FlightPoint flightPoint, TextAtom textAtom, TextAtom textAtom2, TextAtom textAtom3, TextAtom textAtom4, int i11, Object obj) {
                if ((i11 & 1) != 0) {
                    textAtom = flightPoint.city;
                }
                if ((i11 & 2) != 0) {
                    textAtom2 = flightPoint.airport;
                }
                if ((i11 & 4) != 0) {
                    textAtom3 = flightPoint.time;
                }
                if ((i11 & 8) != 0) {
                    textAtom4 = flightPoint.date;
                }
                return flightPoint.copy(textAtom, textAtom2, textAtom3, textAtom4);
            }

            @NotNull
            /* renamed from: component1, reason: from getter */
            public final TextAtom getCity() {
                return this.city;
            }

            @NotNull
            /* renamed from: component2, reason: from getter */
            public final TextAtom getAirport() {
                return this.airport;
            }

            @NotNull
            /* renamed from: component3, reason: from getter */
            public final TextAtom getTime() {
                return this.time;
            }

            @NotNull
            /* renamed from: component4, reason: from getter */
            public final TextAtom getDate() {
                return this.date;
            }

            @NotNull
            public final FlightPoint copy(@NotNull TextAtom city, @NotNull TextAtom airport, @NotNull TextAtom time, @NotNull TextAtom date) {
                Intrinsics.checkNotNullParameter(city, "city");
                Intrinsics.checkNotNullParameter(airport, "airport");
                Intrinsics.checkNotNullParameter(time, "time");
                Intrinsics.checkNotNullParameter(date, "date");
                return new FlightPoint(city, airport, time, date);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof FlightPoint)) {
                    return false;
                }
                FlightPoint flightPoint = (FlightPoint) other;
                return Intrinsics.d(this.city, flightPoint.city) && Intrinsics.d(this.airport, flightPoint.airport) && Intrinsics.d(this.time, flightPoint.time) && Intrinsics.d(this.date, flightPoint.date);
            }

            @NotNull
            public final TextAtom getAirport() {
                return this.airport;
            }

            @NotNull
            public final TextAtom getCity() {
                return this.city;
            }

            @NotNull
            public final TextAtom getDate() {
                return this.date;
            }

            @NotNull
            public final TextAtom getTime() {
                return this.time;
            }

            public int hashCode() {
                return this.date.hashCode() + C2619v.b(C2619v.b(this.city.hashCode() * 31, 31, this.airport), 31, this.time);
            }

            @NotNull
            public String toString() {
                TextAtom textAtom = this.city;
                TextAtom textAtom2 = this.airport;
                TextAtom textAtom3 = this.time;
                TextAtom textAtom4 = this.date;
                StringBuilder a11 = a.a("FlightPoint(city=", textAtom, ", airport=", textAtom2, ", time=");
                a11.append(textAtom3);
                a11.append(", date=");
                a11.append(textAtom4);
                a11.append(")");
                return a11.toString();
            }
        }

        public Flight(@NotNull TextAtom airlineName, @NotNull TextAtom subtitle, @NotNull String logoImageURL, List<Badge> list, @NotNull FlightPoint departure, @NotNull FlightPoint arrival) {
            Intrinsics.checkNotNullParameter(airlineName, "airlineName");
            Intrinsics.checkNotNullParameter(subtitle, "subtitle");
            Intrinsics.checkNotNullParameter(logoImageURL, "logoImageURL");
            Intrinsics.checkNotNullParameter(departure, "departure");
            Intrinsics.checkNotNullParameter(arrival, "arrival");
            this.airlineName = airlineName;
            this.subtitle = subtitle;
            this.logoImageURL = logoImageURL;
            this.badges = list;
            this.departure = departure;
            this.arrival = arrival;
        }

        public static /* synthetic */ Flight copy$default(Flight flight, TextAtom textAtom, TextAtom textAtom2, String str, List list, FlightPoint flightPoint, FlightPoint flightPoint2, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                textAtom = flight.airlineName;
            }
            if ((i11 & 2) != 0) {
                textAtom2 = flight.subtitle;
            }
            if ((i11 & 4) != 0) {
                str = flight.logoImageURL;
            }
            if ((i11 & 8) != 0) {
                list = flight.badges;
            }
            if ((i11 & 16) != 0) {
                flightPoint = flight.departure;
            }
            if ((i11 & 32) != 0) {
                flightPoint2 = flight.arrival;
            }
            FlightPoint flightPoint3 = flightPoint;
            FlightPoint flightPoint4 = flightPoint2;
            return flight.copy(textAtom, textAtom2, str, list, flightPoint3, flightPoint4);
        }

        @NotNull
        /* renamed from: component1, reason: from getter */
        public final TextAtom getAirlineName() {
            return this.airlineName;
        }

        @NotNull
        /* renamed from: component2, reason: from getter */
        public final TextAtom getSubtitle() {
            return this.subtitle;
        }

        @NotNull
        /* renamed from: component3, reason: from getter */
        public final String getLogoImageURL() {
            return this.logoImageURL;
        }

        public final List<Badge> component4() {
            return this.badges;
        }

        @NotNull
        /* renamed from: component5, reason: from getter */
        public final FlightPoint getDeparture() {
            return this.departure;
        }

        @NotNull
        /* renamed from: component6, reason: from getter */
        public final FlightPoint getArrival() {
            return this.arrival;
        }

        @NotNull
        public final Flight copy(@NotNull TextAtom airlineName, @NotNull TextAtom subtitle, @NotNull String logoImageURL, List<Badge> badges, @NotNull FlightPoint departure, @NotNull FlightPoint arrival) {
            Intrinsics.checkNotNullParameter(airlineName, "airlineName");
            Intrinsics.checkNotNullParameter(subtitle, "subtitle");
            Intrinsics.checkNotNullParameter(logoImageURL, "logoImageURL");
            Intrinsics.checkNotNullParameter(departure, "departure");
            Intrinsics.checkNotNullParameter(arrival, "arrival");
            return new Flight(airlineName, subtitle, logoImageURL, badges, departure, arrival);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Flight)) {
                return false;
            }
            Flight flight = (Flight) other;
            return Intrinsics.d(this.airlineName, flight.airlineName) && Intrinsics.d(this.subtitle, flight.subtitle) && Intrinsics.d(this.logoImageURL, flight.logoImageURL) && Intrinsics.d(this.badges, flight.badges) && Intrinsics.d(this.departure, flight.departure) && Intrinsics.d(this.arrival, flight.arrival);
        }

        @NotNull
        public final TextAtom getAirlineName() {
            return this.airlineName;
        }

        @NotNull
        public final FlightPoint getArrival() {
            return this.arrival;
        }

        public final List<Badge> getBadges() {
            return this.badges;
        }

        @NotNull
        public final FlightPoint getDeparture() {
            return this.departure;
        }

        @NotNull
        public final String getLogoImageURL() {
            return this.logoImageURL;
        }

        @NotNull
        public final TextAtom getSubtitle() {
            return this.subtitle;
        }

        public int hashCode() {
            int a11 = g.a(C2619v.b(this.airlineName.hashCode() * 31, 31, this.subtitle), 31, this.logoImageURL);
            List<Badge> list = this.badges;
            return this.arrival.hashCode() + ((this.departure.hashCode() + ((a11 + (list == null ? 0 : list.hashCode())) * 31)) * 31);
        }

        @NotNull
        public String toString() {
            TextAtom textAtom = this.airlineName;
            TextAtom textAtom2 = this.subtitle;
            String str = this.logoImageURL;
            List<Badge> list = this.badges;
            FlightPoint flightPoint = this.departure;
            FlightPoint flightPoint2 = this.arrival;
            StringBuilder a11 = a.a("Flight(airlineName=", textAtom, ", subtitle=", textAtom2, ", logoImageURL=");
            w.d(str, ", badges=", ", departure=", a11, list);
            a11.append(flightPoint);
            a11.append(", arrival=");
            a11.append(flightPoint2);
            a11.append(")");
            return a11.toString();
        }
    }

    @j(generateAdapter = true)
    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B)\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\u000e\b\u0001\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00010\u0006¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u000f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00010\u0006HÆ\u0003J/\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\u000e\b\u0003\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00010\u0006HÆ\u0001J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001J\t\u0010\u0017\u001a\u00020\u0018HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\nR\u0017\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\r¨\u0006\u0019"}, d2 = {"Lru/ozon/app/android/travel/feature/tours/widgets/toursFlightDetails/data/ToursFlightDetailsDTO$Route;", "", SelectionItemFormDTO.TITLE_FIELD_NAME, "Lru/ozon/uni/atoms/data/texts/TextAtom;", "time", "routeStages", "", "<init>", "(Lru/ozon/uni/atoms/data/texts/TextAtom;Lru/ozon/uni/atoms/data/texts/TextAtom;Ljava/util/List;)V", "getTitle", "()Lru/ozon/uni/atoms/data/texts/TextAtom;", "getTime", "getRouteStages", "()Ljava/util/List;", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "", "tours_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class Route {
        public static final int $stable = 8;

        @NotNull
        private final List<Object> routeStages;
        private final TextAtom time;

        @NotNull
        private final TextAtom title;

        public Route(@NotNull TextAtom title, TextAtom textAtom, @ProtoOneOfSignature.Container({@ProtoOneOfSignature(name = "flight", type = Flight.class), @ProtoOneOfSignature(name = "transfer", type = Transfer.class)}) @NotNull @ProtoOneOf(label = "type") List<? extends Object> routeStages) {
            Intrinsics.checkNotNullParameter(title, "title");
            Intrinsics.checkNotNullParameter(routeStages, "routeStages");
            this.title = title;
            this.time = textAtom;
            this.routeStages = routeStages;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ Route copy$default(Route route, TextAtom textAtom, TextAtom textAtom2, List list, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                textAtom = route.title;
            }
            if ((i11 & 2) != 0) {
                textAtom2 = route.time;
            }
            if ((i11 & 4) != 0) {
                list = route.routeStages;
            }
            return route.copy(textAtom, textAtom2, list);
        }

        @NotNull
        /* renamed from: component1, reason: from getter */
        public final TextAtom getTitle() {
            return this.title;
        }

        /* renamed from: component2, reason: from getter */
        public final TextAtom getTime() {
            return this.time;
        }

        @NotNull
        public final List<Object> component3() {
            return this.routeStages;
        }

        @NotNull
        public final Route copy(@NotNull TextAtom title, TextAtom time, @ProtoOneOfSignature.Container({@ProtoOneOfSignature(name = "flight", type = Flight.class), @ProtoOneOfSignature(name = "transfer", type = Transfer.class)}) @NotNull @ProtoOneOf(label = "type") List<? extends Object> routeStages) {
            Intrinsics.checkNotNullParameter(title, "title");
            Intrinsics.checkNotNullParameter(routeStages, "routeStages");
            return new Route(title, time, routeStages);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Route)) {
                return false;
            }
            Route route = (Route) other;
            return Intrinsics.d(this.title, route.title) && Intrinsics.d(this.time, route.time) && Intrinsics.d(this.routeStages, route.routeStages);
        }

        @NotNull
        public final List<Object> getRouteStages() {
            return this.routeStages;
        }

        public final TextAtom getTime() {
            return this.time;
        }

        @NotNull
        public final TextAtom getTitle() {
            return this.title;
        }

        public int hashCode() {
            int hashCode = this.title.hashCode() * 31;
            TextAtom textAtom = this.time;
            return this.routeStages.hashCode() + ((hashCode + (textAtom == null ? 0 : textAtom.hashCode())) * 31);
        }

        @NotNull
        public String toString() {
            TextAtom textAtom = this.title;
            TextAtom textAtom2 = this.time;
            return C2618u.h(a.a("Route(title=", textAtom, ", time=", textAtom2, ", routeStages="), this.routeStages, ")");
        }
    }

    @j(generateAdapter = true)
    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B)\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0012\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0007HÆ\u0003J3\u0010\u0014\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u0007HÆ\u0001J\u0013\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0018\u001a\u00020\u0019HÖ\u0001J\t\u0010\u001a\u001a\u00020\u001bHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000bR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000bR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u001c"}, d2 = {"Lru/ozon/app/android/travel/feature/tours/widgets/toursFlightDetails/data/ToursFlightDetailsDTO$Transfer;", "", SelectionItemFormDTO.TITLE_FIELD_NAME, "Lru/ozon/uni/atoms/data/texts/TextAtom;", "description", "notification", "icon", "Lru/ozon/uni/atoms/data/button/Icon;", "<init>", "(Lru/ozon/uni/atoms/data/texts/TextAtom;Lru/ozon/uni/atoms/data/texts/TextAtom;Lru/ozon/uni/atoms/data/texts/TextAtom;Lru/ozon/uni/atoms/data/button/Icon;)V", "getTitle", "()Lru/ozon/uni/atoms/data/texts/TextAtom;", "getDescription", "getNotification", "getIcon", "()Lru/ozon/uni/atoms/data/button/Icon;", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "", "toString", "", "tours_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class Transfer {
        public static final int $stable;

        @NotNull
        private final TextAtom description;

        @NotNull
        private final Icon icon;
        private final TextAtom notification;

        @NotNull
        private final TextAtom title;

        static {
            int i11 = Icon.$stable;
            int i12 = TextAtom.$stable;
            $stable = i11 | i12 | i12 | i12;
        }

        public Transfer(@NotNull TextAtom title, @NotNull TextAtom description, TextAtom textAtom, @NotNull Icon icon) {
            Intrinsics.checkNotNullParameter(title, "title");
            Intrinsics.checkNotNullParameter(description, "description");
            Intrinsics.checkNotNullParameter(icon, "icon");
            this.title = title;
            this.description = description;
            this.notification = textAtom;
            this.icon = icon;
        }

        public static /* synthetic */ Transfer copy$default(Transfer transfer, TextAtom textAtom, TextAtom textAtom2, TextAtom textAtom3, Icon icon, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                textAtom = transfer.title;
            }
            if ((i11 & 2) != 0) {
                textAtom2 = transfer.description;
            }
            if ((i11 & 4) != 0) {
                textAtom3 = transfer.notification;
            }
            if ((i11 & 8) != 0) {
                icon = transfer.icon;
            }
            return transfer.copy(textAtom, textAtom2, textAtom3, icon);
        }

        @NotNull
        /* renamed from: component1, reason: from getter */
        public final TextAtom getTitle() {
            return this.title;
        }

        @NotNull
        /* renamed from: component2, reason: from getter */
        public final TextAtom getDescription() {
            return this.description;
        }

        /* renamed from: component3, reason: from getter */
        public final TextAtom getNotification() {
            return this.notification;
        }

        @NotNull
        /* renamed from: component4, reason: from getter */
        public final Icon getIcon() {
            return this.icon;
        }

        @NotNull
        public final Transfer copy(@NotNull TextAtom title, @NotNull TextAtom description, TextAtom notification, @NotNull Icon icon) {
            Intrinsics.checkNotNullParameter(title, "title");
            Intrinsics.checkNotNullParameter(description, "description");
            Intrinsics.checkNotNullParameter(icon, "icon");
            return new Transfer(title, description, notification, icon);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Transfer)) {
                return false;
            }
            Transfer transfer = (Transfer) other;
            return Intrinsics.d(this.title, transfer.title) && Intrinsics.d(this.description, transfer.description) && Intrinsics.d(this.notification, transfer.notification) && Intrinsics.d(this.icon, transfer.icon);
        }

        @NotNull
        public final TextAtom getDescription() {
            return this.description;
        }

        @NotNull
        public final Icon getIcon() {
            return this.icon;
        }

        public final TextAtom getNotification() {
            return this.notification;
        }

        @NotNull
        public final TextAtom getTitle() {
            return this.title;
        }

        public int hashCode() {
            int b11 = C2619v.b(this.title.hashCode() * 31, 31, this.description);
            TextAtom textAtom = this.notification;
            return this.icon.hashCode() + ((b11 + (textAtom == null ? 0 : textAtom.hashCode())) * 31);
        }

        @NotNull
        public String toString() {
            TextAtom textAtom = this.title;
            TextAtom textAtom2 = this.description;
            TextAtom textAtom3 = this.notification;
            Icon icon = this.icon;
            StringBuilder a11 = a.a("Transfer(title=", textAtom, ", description=", textAtom2, ", notification=");
            a11.append(textAtom3);
            a11.append(", icon=");
            a11.append(icon);
            a11.append(")");
            return a11.toString();
        }
    }

    public ToursFlightDetailsDTO(@NotNull List<Route> routes, TextAtom textAtom, DisclaimerAtom disclaimerAtom, Map<String, TokenizedTrackingInfo> map) {
        Intrinsics.checkNotNullParameter(routes, "routes");
        this.routes = routes;
        this.caption = textAtom;
        this.disclaimer = disclaimerAtom;
        this.trackingInfo = map;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ ToursFlightDetailsDTO copy$default(ToursFlightDetailsDTO toursFlightDetailsDTO, List list, TextAtom textAtom, DisclaimerAtom disclaimerAtom, Map map, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            list = toursFlightDetailsDTO.routes;
        }
        if ((i11 & 2) != 0) {
            textAtom = toursFlightDetailsDTO.caption;
        }
        if ((i11 & 4) != 0) {
            disclaimerAtom = toursFlightDetailsDTO.disclaimer;
        }
        if ((i11 & 8) != 0) {
            map = toursFlightDetailsDTO.trackingInfo;
        }
        return toursFlightDetailsDTO.copy(list, textAtom, disclaimerAtom, map);
    }

    @NotNull
    public final List<Route> component1() {
        return this.routes;
    }

    /* renamed from: component2, reason: from getter */
    public final TextAtom getCaption() {
        return this.caption;
    }

    /* renamed from: component3, reason: from getter */
    public final DisclaimerAtom getDisclaimer() {
        return this.disclaimer;
    }

    public final Map<String, TokenizedTrackingInfo> component4() {
        return this.trackingInfo;
    }

    @NotNull
    public final ToursFlightDetailsDTO copy(@NotNull List<Route> routes, TextAtom caption, DisclaimerAtom disclaimer, Map<String, TokenizedTrackingInfo> trackingInfo) {
        Intrinsics.checkNotNullParameter(routes, "routes");
        return new ToursFlightDetailsDTO(routes, caption, disclaimer, trackingInfo);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ToursFlightDetailsDTO)) {
            return false;
        }
        ToursFlightDetailsDTO toursFlightDetailsDTO = (ToursFlightDetailsDTO) other;
        return Intrinsics.d(this.routes, toursFlightDetailsDTO.routes) && Intrinsics.d(this.caption, toursFlightDetailsDTO.caption) && Intrinsics.d(this.disclaimer, toursFlightDetailsDTO.disclaimer) && Intrinsics.d(this.trackingInfo, toursFlightDetailsDTO.trackingInfo);
    }

    public final TextAtom getCaption() {
        return this.caption;
    }

    public final DisclaimerAtom getDisclaimer() {
        return this.disclaimer;
    }

    @NotNull
    public final List<Route> getRoutes() {
        return this.routes;
    }

    public final Map<String, TokenizedTrackingInfo> getTrackingInfo() {
        return this.trackingInfo;
    }

    public int hashCode() {
        int hashCode = this.routes.hashCode() * 31;
        TextAtom textAtom = this.caption;
        int hashCode2 = (hashCode + (textAtom == null ? 0 : textAtom.hashCode())) * 31;
        DisclaimerAtom disclaimerAtom = this.disclaimer;
        int hashCode3 = (hashCode2 + (disclaimerAtom == null ? 0 : disclaimerAtom.hashCode())) * 31;
        Map<String, TokenizedTrackingInfo> map = this.trackingInfo;
        return hashCode3 + (map != null ? map.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "ToursFlightDetailsDTO(routes=" + this.routes + ", caption=" + this.caption + ", disclaimer=" + this.disclaimer + ", trackingInfo=" + this.trackingInfo + ")";
    }
}
