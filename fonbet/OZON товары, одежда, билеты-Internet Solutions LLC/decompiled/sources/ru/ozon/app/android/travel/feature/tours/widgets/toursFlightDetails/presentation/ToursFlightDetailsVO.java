package ru.ozon.app.android.travel.feature.tours.widgets.toursFlightDetails.presentation;

import Ak.C2436a;
import B90.C2619v;
import Bl.C2639a;
import Co.a;
import G.g;
import Kk.C3532b;
import WZ.t;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import l20.c;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.atoms.data.disclaimer.DisclaimerAtom;
import ru.ozon.app.android.travel.feature.tours.widgets.toursFlightDetails.data.ToursFlightDetailsDTO;
import ru.ozon.app.android.ugc.core.widgets.commentsListV3.data.CommentV3DTO;
import ru.ozon.app.android.ugc.widgets.selectionItemForm.data.SelectionItemFormDTO;
import ru.ozon.uni.atoms.data.badge.Badge;
import ru.ozon.uni.atoms.data.texts.TextAtom;

@Metadata(d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u001d\b\u0081\b\u0018\u00002\u00060\u0001j\u0002`\u0002:\u00029:Bg\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\u0006\u0010\u000f\u001a\u00020\r\u0012\u0006\u0010\u0010\u001a\u00020\r\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011\u0012\u000e\u0010\u0015\u001a\n\u0018\u00010\u0013j\u0004\u0018\u0001`\u0014¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0019\u001a\u00020\u0018HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001c\u001a\u00020\u001bHÖ\u0001¢\u0006\u0004\b\u001c\u0010\u001dJ\u001a\u0010 \u001a\u00020\r2\b\u0010\u001f\u001a\u0004\u0018\u00010\u001eHÖ\u0003¢\u0006\u0004\b \u0010!R\u001a\u0010\u0004\u001a\u00020\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0004\u0010\"\u001a\u0004\b#\u0010$R\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010%\u001a\u0004\b&\u0010'R\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010(\u001a\u0004\b)\u0010*R\u0019\u0010\n\u001a\u0004\u0018\u00010\t8\u0006¢\u0006\f\n\u0004\b\n\u0010+\u001a\u0004\b,\u0010-R\u0019\u0010\f\u001a\u0004\u0018\u00010\u000b8\u0006¢\u0006\f\n\u0004\b\f\u0010.\u001a\u0004\b/\u00100R\u0017\u0010\u000e\u001a\u00020\r8\u0006¢\u0006\f\n\u0004\b\u000e\u00101\u001a\u0004\b\u000e\u00102R\u0017\u0010\u000f\u001a\u00020\r8\u0006¢\u0006\f\n\u0004\b\u000f\u00101\u001a\u0004\b\u000f\u00102R\u0017\u0010\u0010\u001a\u00020\r8\u0006¢\u0006\f\n\u0004\b\u0010\u00101\u001a\u0004\b\u0010\u00102R\u0019\u0010\u0012\u001a\u0004\u0018\u00010\u00118\u0006¢\u0006\f\n\u0004\b\u0012\u00103\u001a\u0004\b4\u00105R\u001f\u0010\u0015\u001a\n\u0018\u00010\u0013j\u0004\u0018\u0001`\u00148\u0006¢\u0006\f\n\u0004\b\u0015\u00106\u001a\u0004\b7\u00108¨\u0006;"}, d2 = {"Lru/ozon/app/android/travel/feature/tours/widgets/toursFlightDetails/presentation/ToursFlightDetailsVO;", "Ll20/c;", "Lru/ozon/app/android/composer/view/ViewObject;", "", "id", "Lru/ozon/app/android/travel/feature/tours/widgets/toursFlightDetails/presentation/ToursFlightDetailsVO$Header;", CommentV3DTO.HEADER_FIELD_NAME, "Lru/ozon/app/android/travel/feature/tours/widgets/toursFlightDetails/presentation/ToursFlightDetailsVO$FlightVO;", "flight", "Lru/ozon/app/android/travel/feature/tours/widgets/toursFlightDetails/data/ToursFlightDetailsDTO$Transfer;", "transfer", "Lru/ozon/uni/atoms/data/texts/TextAtom;", "caption", "", "isFirstFlight", "isLastFlight", "isFirstForwardFlight", "Lru/ozon/app/android/atoms/data/disclaimer/DisclaimerAtom;", SelectionItemFormDTO.DISCLAIMER_FIELD_NAME, "LWZ/t;", "Lru/ozon/app/android/analytics/modules/tokenized/TokenizedEvent;", "trackingInfo", "<init>", "(JLru/ozon/app/android/travel/feature/tours/widgets/toursFlightDetails/presentation/ToursFlightDetailsVO$Header;Lru/ozon/app/android/travel/feature/tours/widgets/toursFlightDetails/presentation/ToursFlightDetailsVO$FlightVO;Lru/ozon/app/android/travel/feature/tours/widgets/toursFlightDetails/data/ToursFlightDetailsDTO$Transfer;Lru/ozon/uni/atoms/data/texts/TextAtom;ZZZLru/ozon/app/android/atoms/data/disclaimer/DisclaimerAtom;LWZ/t;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "J", "getId", "()J", "Lru/ozon/app/android/travel/feature/tours/widgets/toursFlightDetails/presentation/ToursFlightDetailsVO$Header;", "getHeader", "()Lru/ozon/app/android/travel/feature/tours/widgets/toursFlightDetails/presentation/ToursFlightDetailsVO$Header;", "Lru/ozon/app/android/travel/feature/tours/widgets/toursFlightDetails/presentation/ToursFlightDetailsVO$FlightVO;", "getFlight", "()Lru/ozon/app/android/travel/feature/tours/widgets/toursFlightDetails/presentation/ToursFlightDetailsVO$FlightVO;", "Lru/ozon/app/android/travel/feature/tours/widgets/toursFlightDetails/data/ToursFlightDetailsDTO$Transfer;", "getTransfer", "()Lru/ozon/app/android/travel/feature/tours/widgets/toursFlightDetails/data/ToursFlightDetailsDTO$Transfer;", "Lru/ozon/uni/atoms/data/texts/TextAtom;", "getCaption", "()Lru/ozon/uni/atoms/data/texts/TextAtom;", "Z", "()Z", "Lru/ozon/app/android/atoms/data/disclaimer/DisclaimerAtom;", "getDisclaimer", "()Lru/ozon/app/android/atoms/data/disclaimer/DisclaimerAtom;", "LWZ/t;", "getTrackingInfo", "()LWZ/t;", "Header", "FlightVO", "tours_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class ToursFlightDetailsVO implements c {
    private final TextAtom caption;
    private final DisclaimerAtom disclaimer;

    @NotNull
    private final FlightVO flight;
    private final Header header;
    private final long id;
    private final boolean isFirstFlight;
    private final boolean isFirstForwardFlight;
    private final boolean isLastFlight;
    private final t trackingInfo;
    private final ToursFlightDetailsDTO.Transfer transfer;

    @Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0018\b\u0087\b\u0018\u00002\u00020\u0001BO\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u000e\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\t\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u0006\u0010\u0010\u001a\u00020\u000e¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0016\u001a\u00020\u0015HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u001a\u0010\u0019\u001a\u00020\f2\b\u0010\u0018\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0019\u0010\u001aR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u001e\u001a\u0004\b\u001f\u0010 R\u0017\u0010\u0006\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u001e\u001a\u0004\b!\u0010 R\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010\"\u001a\u0004\b#\u0010\u0014R\u001f\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\t8\u0006¢\u0006\f\n\u0004\b\u000b\u0010$\u001a\u0004\b%\u0010&R\u0017\u0010\r\u001a\u00020\f8\u0006¢\u0006\f\n\u0004\b\r\u0010'\u001a\u0004\b\r\u0010(R\u0017\u0010\u000f\u001a\u00020\u000e8\u0006¢\u0006\f\n\u0004\b\u000f\u0010)\u001a\u0004\b*\u0010+R\u0017\u0010\u0010\u001a\u00020\u000e8\u0006¢\u0006\f\n\u0004\b\u0010\u0010)\u001a\u0004\b,\u0010+¨\u0006-"}, d2 = {"Lru/ozon/app/android/travel/feature/tours/widgets/toursFlightDetails/presentation/ToursFlightDetailsVO$FlightVO;", "", "", "id", "Lru/ozon/uni/atoms/data/texts/TextAtom;", "airlineName", "subtitle", "", "logoImageURL", "", "Lru/ozon/uni/atoms/data/badge/Badge;", "badges", "", "isBadgesVisible", "Lru/ozon/app/android/travel/feature/tours/widgets/toursFlightDetails/data/ToursFlightDetailsDTO$Flight$FlightPoint;", "departure", "arrival", "<init>", "(JLru/ozon/uni/atoms/data/texts/TextAtom;Lru/ozon/uni/atoms/data/texts/TextAtom;Ljava/lang/String;Ljava/util/List;ZLru/ozon/app/android/travel/feature/tours/widgets/toursFlightDetails/data/ToursFlightDetailsDTO$Flight$FlightPoint;Lru/ozon/app/android/travel/feature/tours/widgets/toursFlightDetails/data/ToursFlightDetailsDTO$Flight$FlightPoint;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "J", "getId", "()J", "Lru/ozon/uni/atoms/data/texts/TextAtom;", "getAirlineName", "()Lru/ozon/uni/atoms/data/texts/TextAtom;", "getSubtitle", "Ljava/lang/String;", "getLogoImageURL", "Ljava/util/List;", "getBadges", "()Ljava/util/List;", "Z", "()Z", "Lru/ozon/app/android/travel/feature/tours/widgets/toursFlightDetails/data/ToursFlightDetailsDTO$Flight$FlightPoint;", "getDeparture", "()Lru/ozon/app/android/travel/feature/tours/widgets/toursFlightDetails/data/ToursFlightDetailsDTO$Flight$FlightPoint;", "getArrival", "tours_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class FlightVO {

        @NotNull
        private final TextAtom airlineName;

        @NotNull
        private final ToursFlightDetailsDTO.Flight.FlightPoint arrival;
        private final List<Badge> badges;

        @NotNull
        private final ToursFlightDetailsDTO.Flight.FlightPoint departure;
        private final long id;
        private final boolean isBadgesVisible;

        @NotNull
        private final String logoImageURL;

        @NotNull
        private final TextAtom subtitle;

        public FlightVO(long j11, @NotNull TextAtom airlineName, @NotNull TextAtom subtitle, @NotNull String logoImageURL, List<Badge> list, boolean z11, @NotNull ToursFlightDetailsDTO.Flight.FlightPoint departure, @NotNull ToursFlightDetailsDTO.Flight.FlightPoint arrival) {
            Intrinsics.checkNotNullParameter(airlineName, "airlineName");
            Intrinsics.checkNotNullParameter(subtitle, "subtitle");
            Intrinsics.checkNotNullParameter(logoImageURL, "logoImageURL");
            Intrinsics.checkNotNullParameter(departure, "departure");
            Intrinsics.checkNotNullParameter(arrival, "arrival");
            this.id = j11;
            this.airlineName = airlineName;
            this.subtitle = subtitle;
            this.logoImageURL = logoImageURL;
            this.badges = list;
            this.isBadgesVisible = z11;
            this.departure = departure;
            this.arrival = arrival;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof FlightVO)) {
                return false;
            }
            FlightVO flightVO = (FlightVO) other;
            return this.id == flightVO.id && Intrinsics.d(this.airlineName, flightVO.airlineName) && Intrinsics.d(this.subtitle, flightVO.subtitle) && Intrinsics.d(this.logoImageURL, flightVO.logoImageURL) && Intrinsics.d(this.badges, flightVO.badges) && this.isBadgesVisible == flightVO.isBadgesVisible && Intrinsics.d(this.departure, flightVO.departure) && Intrinsics.d(this.arrival, flightVO.arrival);
        }

        @NotNull
        public final TextAtom getAirlineName() {
            return this.airlineName;
        }

        @NotNull
        public final ToursFlightDetailsDTO.Flight.FlightPoint getArrival() {
            return this.arrival;
        }

        public final List<Badge> getBadges() {
            return this.badges;
        }

        @NotNull
        public final ToursFlightDetailsDTO.Flight.FlightPoint getDeparture() {
            return this.departure;
        }

        public final long getId() {
            return this.id;
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
            int a11 = g.a(C2619v.b(C2619v.b(Long.hashCode(this.id) * 31, 31, this.airlineName), 31, this.subtitle), 31, this.logoImageURL);
            List<Badge> list = this.badges;
            return this.arrival.hashCode() + ((this.departure.hashCode() + C3532b.a((a11 + (list == null ? 0 : list.hashCode())) * 31, 31, this.isBadgesVisible)) * 31);
        }

        /* renamed from: isBadgesVisible, reason: from getter */
        public final boolean getIsBadgesVisible() {
            return this.isBadgesVisible;
        }

        @NotNull
        public String toString() {
            long j11 = this.id;
            TextAtom textAtom = this.airlineName;
            TextAtom textAtom2 = this.subtitle;
            String str = this.logoImageURL;
            List<Badge> list = this.badges;
            boolean z11 = this.isBadgesVisible;
            ToursFlightDetailsDTO.Flight.FlightPoint flightPoint = this.departure;
            ToursFlightDetailsDTO.Flight.FlightPoint flightPoint2 = this.arrival;
            StringBuilder c11 = C2639a.c("FlightVO(id=", j11, ", airlineName=", textAtom);
            c11.append(", subtitle=");
            c11.append(textAtom2);
            c11.append(", logoImageURL=");
            c11.append(str);
            AZ.c.c(c11, ", badges=", list, ", isBadgesVisible=", z11);
            c11.append(", departure=");
            c11.append(flightPoint);
            c11.append(", arrival=");
            c11.append(flightPoint2);
            c11.append(")");
            return c11.toString();
        }
    }

    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0087\b\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0011\u001a\u0004\b\u0014\u0010\u0013¨\u0006\u0015"}, d2 = {"Lru/ozon/app/android/travel/feature/tours/widgets/toursFlightDetails/presentation/ToursFlightDetailsVO$Header;", "", "Lru/ozon/uni/atoms/data/texts/TextAtom;", SelectionItemFormDTO.TITLE_FIELD_NAME, "time", "<init>", "(Lru/ozon/uni/atoms/data/texts/TextAtom;Lru/ozon/uni/atoms/data/texts/TextAtom;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lru/ozon/uni/atoms/data/texts/TextAtom;", "getTitle", "()Lru/ozon/uni/atoms/data/texts/TextAtom;", "getTime", "tours_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class Header {
        public static final int $stable = TextAtom.$stable;
        private final TextAtom time;

        @NotNull
        private final TextAtom title;

        public Header(@NotNull TextAtom title, TextAtom textAtom) {
            Intrinsics.checkNotNullParameter(title, "title");
            this.title = title;
            this.time = textAtom;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Header)) {
                return false;
            }
            Header header = (Header) other;
            return Intrinsics.d(this.title, header.title) && Intrinsics.d(this.time, header.time);
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
            return hashCode + (textAtom == null ? 0 : textAtom.hashCode());
        }

        @NotNull
        public String toString() {
            return a.a("Header(title=", this.title, ", time=", this.time, ")");
        }
    }

    public ToursFlightDetailsVO(long j11, Header header, @NotNull FlightVO flight, ToursFlightDetailsDTO.Transfer transfer, TextAtom textAtom, boolean z11, boolean z12, boolean z13, DisclaimerAtom disclaimerAtom, t tVar) {
        Intrinsics.checkNotNullParameter(flight, "flight");
        this.id = j11;
        this.header = header;
        this.flight = flight;
        this.transfer = transfer;
        this.caption = textAtom;
        this.isFirstFlight = z11;
        this.isLastFlight = z12;
        this.isFirstForwardFlight = z13;
        this.disclaimer = disclaimerAtom;
        this.trackingInfo = tVar;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ToursFlightDetailsVO)) {
            return false;
        }
        ToursFlightDetailsVO toursFlightDetailsVO = (ToursFlightDetailsVO) other;
        return this.id == toursFlightDetailsVO.id && Intrinsics.d(this.header, toursFlightDetailsVO.header) && Intrinsics.d(this.flight, toursFlightDetailsVO.flight) && Intrinsics.d(this.transfer, toursFlightDetailsVO.transfer) && Intrinsics.d(this.caption, toursFlightDetailsVO.caption) && this.isFirstFlight == toursFlightDetailsVO.isFirstFlight && this.isLastFlight == toursFlightDetailsVO.isLastFlight && this.isFirstForwardFlight == toursFlightDetailsVO.isFirstForwardFlight && Intrinsics.d(this.disclaimer, toursFlightDetailsVO.disclaimer) && Intrinsics.d(this.trackingInfo, toursFlightDetailsVO.trackingInfo);
    }

    public final TextAtom getCaption() {
        return this.caption;
    }

    public final DisclaimerAtom getDisclaimer() {
        return this.disclaimer;
    }

    @NotNull
    public final FlightVO getFlight() {
        return this.flight;
    }

    public final Header getHeader() {
        return this.header;
    }

    @Override // l20.c
    public long getId() {
        return this.id;
    }

    @Override // l20.c
    public Integer getScrollWidgetKey() {
        return null;
    }

    public final t getTrackingInfo() {
        return this.trackingInfo;
    }

    public final ToursFlightDetailsDTO.Transfer getTransfer() {
        return this.transfer;
    }

    @Override // l20.c
    public int getViewItemKey() {
        return hashCode();
    }

    public int hashCode() {
        int hashCode = Long.hashCode(this.id) * 31;
        Header header = this.header;
        int hashCode2 = (this.flight.hashCode() + ((hashCode + (header == null ? 0 : header.hashCode())) * 31)) * 31;
        ToursFlightDetailsDTO.Transfer transfer = this.transfer;
        int hashCode3 = (hashCode2 + (transfer == null ? 0 : transfer.hashCode())) * 31;
        TextAtom textAtom = this.caption;
        int a11 = C3532b.a(C3532b.a(C3532b.a((hashCode3 + (textAtom == null ? 0 : textAtom.hashCode())) * 31, 31, this.isFirstFlight), 31, this.isLastFlight), 31, this.isFirstForwardFlight);
        DisclaimerAtom disclaimerAtom = this.disclaimer;
        int hashCode4 = (a11 + (disclaimerAtom == null ? 0 : disclaimerAtom.hashCode())) * 31;
        t tVar = this.trackingInfo;
        return hashCode4 + (tVar != null ? tVar.hashCode() : 0);
    }

    /* renamed from: isFirstFlight, reason: from getter */
    public final boolean getIsFirstFlight() {
        return this.isFirstFlight;
    }

    /* renamed from: isFirstForwardFlight, reason: from getter */
    public final boolean getIsFirstForwardFlight() {
        return this.isFirstForwardFlight;
    }

    /* renamed from: isLastFlight, reason: from getter */
    public final boolean getIsLastFlight() {
        return this.isLastFlight;
    }

    @NotNull
    public String toString() {
        long j11 = this.id;
        Header header = this.header;
        FlightVO flightVO = this.flight;
        ToursFlightDetailsDTO.Transfer transfer = this.transfer;
        TextAtom textAtom = this.caption;
        boolean z11 = this.isFirstFlight;
        boolean z12 = this.isLastFlight;
        boolean z13 = this.isFirstForwardFlight;
        DisclaimerAtom disclaimerAtom = this.disclaimer;
        t tVar = this.trackingInfo;
        StringBuilder sb2 = new StringBuilder("ToursFlightDetailsVO(id=");
        sb2.append(j11);
        sb2.append(", header=");
        sb2.append(header);
        sb2.append(", flight=");
        sb2.append(flightVO);
        sb2.append(", transfer=");
        sb2.append(transfer);
        sb2.append(", caption=");
        sb2.append(textAtom);
        sb2.append(", isFirstFlight=");
        sb2.append(z11);
        C2436a.e(", isLastFlight=", ", isFirstForwardFlight=", sb2, z12, z13);
        sb2.append(", disclaimer=");
        sb2.append(disclaimerAtom);
        sb2.append(", trackingInfo=");
        sb2.append(tVar);
        sb2.append(")");
        return sb2.toString();
    }
}
