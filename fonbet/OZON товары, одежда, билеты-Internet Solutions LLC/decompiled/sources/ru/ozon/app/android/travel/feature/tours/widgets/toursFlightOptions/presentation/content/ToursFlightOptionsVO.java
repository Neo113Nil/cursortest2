package ru.ozon.app.android.travel.feature.tours.widgets.toursFlightOptions.presentation.content;

import B90.C2619v;
import Bl.C2639a;
import Bl.b;
import El.C2971a;
import Fm.C3051a;
import G.g;
import Kk.C3532b;
import Ve.C4598rp;
import WZ.t;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import l20.c;
import org.jetbrains.annotations.NotNull;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.data.badge.Badge;
import ru.ozon.uni.atoms.data.price.Price;
import ru.ozon.uni.atoms.data.texts.TextAtom;

@Metadata(d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b$\b\u0081\b\u0018\u00002\u00060\u0001j\u0002`\u0002:\u0001FB\u008f\u0001\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u0005\u0012\u0006\u0010\n\u001a\u00020\u0006\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\b\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000e\u001a\u00020\f\u0012\u0006\u0010\u0010\u001a\u00020\u000f\u0012\u0006\u0010\u0012\u001a\u00020\u0011\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0011\u0012\u0006\u0010\u0015\u001a\u00020\u0014\u0012\u0006\u0010\u0017\u001a\u00020\u0016\u0012\u0006\u0010\u0018\u001a\u00020\u0016\u0012\u000e\u0010\u001b\u001a\n\u0018\u00010\u0019j\u0004\u0018\u0001`\u001a¢\u0006\u0004\b\u001c\u0010\u001dJ\u0010\u0010\u001e\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u001e\u0010\u001fJ\u0010\u0010!\u001a\u00020 HÖ\u0001¢\u0006\u0004\b!\u0010\"J\u001a\u0010%\u001a\u00020\u00162\b\u0010$\u001a\u0004\u0018\u00010#HÖ\u0003¢\u0006\u0004\b%\u0010&R\u001a\u0010\u0004\u001a\u00020\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0004\u0010'\u001a\u0004\b(\u0010)R\u001d\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0006¢\u0006\f\n\u0004\b\u0007\u0010*\u001a\u0004\b+\u0010,R\u001d\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00058\u0006¢\u0006\f\n\u0004\b\t\u0010*\u001a\u0004\b-\u0010,R\u0017\u0010\n\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\n\u0010.\u001a\u0004\b/\u0010\u001fR\u0019\u0010\u000b\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b\u000b\u00100\u001a\u0004\b1\u00102R\u0017\u0010\r\u001a\u00020\f8\u0006¢\u0006\f\n\u0004\b\r\u00103\u001a\u0004\b4\u00105R\u0017\u0010\u000e\u001a\u00020\f8\u0006¢\u0006\f\n\u0004\b\u000e\u00103\u001a\u0004\b6\u00105R\u0017\u0010\u0010\u001a\u00020\u000f8\u0006¢\u0006\f\n\u0004\b\u0010\u00107\u001a\u0004\b8\u00109R\u0017\u0010\u0012\u001a\u00020\u00118\u0006¢\u0006\f\n\u0004\b\u0012\u0010:\u001a\u0004\b;\u0010<R\u0019\u0010\u0013\u001a\u0004\u0018\u00010\u00118\u0006¢\u0006\f\n\u0004\b\u0013\u0010:\u001a\u0004\b=\u0010<R\u0017\u0010\u0015\u001a\u00020\u00148\u0006¢\u0006\f\n\u0004\b\u0015\u0010>\u001a\u0004\b?\u0010@R\u0017\u0010\u0017\u001a\u00020\u00168\u0006¢\u0006\f\n\u0004\b\u0017\u0010A\u001a\u0004\b\u0017\u0010BR\u0017\u0010\u0018\u001a\u00020\u00168\u0006¢\u0006\f\n\u0004\b\u0018\u0010A\u001a\u0004\b\u0018\u0010BR\u001f\u0010\u001b\u001a\n\u0018\u00010\u0019j\u0004\u0018\u0001`\u001a8\u0006¢\u0006\f\n\u0004\b\u001b\u0010C\u001a\u0004\bD\u0010E¨\u0006G"}, d2 = {"Lru/ozon/app/android/travel/feature/tours/widgets/toursFlightOptions/presentation/content/ToursFlightOptionsVO;", "Ll20/c;", "Lru/ozon/app/android/composer/view/ViewObject;", "", "id", "", "", "airlineLogoUrls", "Lru/ozon/uni/atoms/data/badge/Badge;", "flightFeatures", "agencyLogoImageUrl", "warningBadge", "Lru/ozon/app/android/travel/feature/tours/widgets/toursFlightOptions/presentation/content/ToursFlightOptionsVO$TourFlightDetails;", "wayThereDetails", "wayBackDetails", "Lru/ozon/uni/atoms/data/price/Price;", "price", "Lru/ozon/uni/atoms/data/texts/TextAtom;", "priceDescription", "marketingText", "Lru/ozon/uni/atoms/af/AtomAction;", "selectAction", "", "isFirstFlight", "isLastFlight", "LWZ/t;", "Lru/ozon/app/android/analytics/modules/tokenized/TokenizedEvent;", "viewEvent", "<init>", "(JLjava/util/List;Ljava/util/List;Ljava/lang/String;Lru/ozon/uni/atoms/data/badge/Badge;Lru/ozon/app/android/travel/feature/tours/widgets/toursFlightOptions/presentation/content/ToursFlightOptionsVO$TourFlightDetails;Lru/ozon/app/android/travel/feature/tours/widgets/toursFlightOptions/presentation/content/ToursFlightOptionsVO$TourFlightDetails;Lru/ozon/uni/atoms/data/price/Price;Lru/ozon/uni/atoms/data/texts/TextAtom;Lru/ozon/uni/atoms/data/texts/TextAtom;Lru/ozon/uni/atoms/af/AtomAction;ZZLWZ/t;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "J", "getId", "()J", "Ljava/util/List;", "getAirlineLogoUrls", "()Ljava/util/List;", "getFlightFeatures", "Ljava/lang/String;", "getAgencyLogoImageUrl", "Lru/ozon/uni/atoms/data/badge/Badge;", "getWarningBadge", "()Lru/ozon/uni/atoms/data/badge/Badge;", "Lru/ozon/app/android/travel/feature/tours/widgets/toursFlightOptions/presentation/content/ToursFlightOptionsVO$TourFlightDetails;", "getWayThereDetails", "()Lru/ozon/app/android/travel/feature/tours/widgets/toursFlightOptions/presentation/content/ToursFlightOptionsVO$TourFlightDetails;", "getWayBackDetails", "Lru/ozon/uni/atoms/data/price/Price;", "getPrice", "()Lru/ozon/uni/atoms/data/price/Price;", "Lru/ozon/uni/atoms/data/texts/TextAtom;", "getPriceDescription", "()Lru/ozon/uni/atoms/data/texts/TextAtom;", "getMarketingText", "Lru/ozon/uni/atoms/af/AtomAction;", "getSelectAction", "()Lru/ozon/uni/atoms/af/AtomAction;", "Z", "()Z", "LWZ/t;", "getViewEvent", "()LWZ/t;", "TourFlightDetails", "tours_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class ToursFlightOptionsVO implements c {

    @NotNull
    private final String agencyLogoImageUrl;

    @NotNull
    private final List<String> airlineLogoUrls;

    @NotNull
    private final List<Badge> flightFeatures;
    private final long id;
    private final boolean isFirstFlight;
    private final boolean isLastFlight;
    private final TextAtom marketingText;

    @NotNull
    private final Price price;

    @NotNull
    private final TextAtom priceDescription;

    @NotNull
    private final AtomAction selectAction;
    private final t viewEvent;
    private final Badge warningBadge;

    @NotNull
    private final TourFlightDetails wayBackDetails;

    @NotNull
    private final TourFlightDetails wayThereDetails;

    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\n\b\u0087\b\u0018\u00002\u00020\u0001B)\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0016\u001a\u0004\b\u0017\u0010\u000bR\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0013\u001a\u0004\b\u0018\u0010\u0015R\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u0013\u001a\u0004\b\u0019\u0010\u0015¨\u0006\u001a"}, d2 = {"Lru/ozon/app/android/travel/feature/tours/widgets/toursFlightOptions/presentation/content/ToursFlightOptionsVO$TourFlightDetails;", "", "Lru/ozon/uni/atoms/data/texts/TextAtom;", "time", "", "counter", "airportCodes", "duration", "<init>", "(Lru/ozon/uni/atoms/data/texts/TextAtom;Ljava/lang/String;Lru/ozon/uni/atoms/data/texts/TextAtom;Lru/ozon/uni/atoms/data/texts/TextAtom;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lru/ozon/uni/atoms/data/texts/TextAtom;", "getTime", "()Lru/ozon/uni/atoms/data/texts/TextAtom;", "Ljava/lang/String;", "getCounter", "getAirportCodes", "getDuration", "tours_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class TourFlightDetails {
        public static final int $stable = TextAtom.$stable;

        @NotNull
        private final TextAtom airportCodes;
        private final String counter;

        @NotNull
        private final TextAtom duration;

        @NotNull
        private final TextAtom time;

        public TourFlightDetails(@NotNull TextAtom time, String str, @NotNull TextAtom airportCodes, @NotNull TextAtom duration) {
            Intrinsics.checkNotNullParameter(time, "time");
            Intrinsics.checkNotNullParameter(airportCodes, "airportCodes");
            Intrinsics.checkNotNullParameter(duration, "duration");
            this.time = time;
            this.counter = str;
            this.airportCodes = airportCodes;
            this.duration = duration;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof TourFlightDetails)) {
                return false;
            }
            TourFlightDetails tourFlightDetails = (TourFlightDetails) other;
            return Intrinsics.d(this.time, tourFlightDetails.time) && Intrinsics.d(this.counter, tourFlightDetails.counter) && Intrinsics.d(this.airportCodes, tourFlightDetails.airportCodes) && Intrinsics.d(this.duration, tourFlightDetails.duration);
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
            StringBuilder d11 = b.d("TourFlightDetails(time=", ", counter=", str, ", airportCodes=", textAtom);
            d11.append(textAtom2);
            d11.append(", duration=");
            d11.append(textAtom3);
            d11.append(")");
            return d11.toString();
        }
    }

    public ToursFlightOptionsVO(long j11, @NotNull List<String> airlineLogoUrls, @NotNull List<Badge> flightFeatures, @NotNull String agencyLogoImageUrl, Badge badge, @NotNull TourFlightDetails wayThereDetails, @NotNull TourFlightDetails wayBackDetails, @NotNull Price price, @NotNull TextAtom priceDescription, TextAtom textAtom, @NotNull AtomAction selectAction, boolean z11, boolean z12, t tVar) {
        Intrinsics.checkNotNullParameter(airlineLogoUrls, "airlineLogoUrls");
        Intrinsics.checkNotNullParameter(flightFeatures, "flightFeatures");
        Intrinsics.checkNotNullParameter(agencyLogoImageUrl, "agencyLogoImageUrl");
        Intrinsics.checkNotNullParameter(wayThereDetails, "wayThereDetails");
        Intrinsics.checkNotNullParameter(wayBackDetails, "wayBackDetails");
        Intrinsics.checkNotNullParameter(price, "price");
        Intrinsics.checkNotNullParameter(priceDescription, "priceDescription");
        Intrinsics.checkNotNullParameter(selectAction, "selectAction");
        this.id = j11;
        this.airlineLogoUrls = airlineLogoUrls;
        this.flightFeatures = flightFeatures;
        this.agencyLogoImageUrl = agencyLogoImageUrl;
        this.warningBadge = badge;
        this.wayThereDetails = wayThereDetails;
        this.wayBackDetails = wayBackDetails;
        this.price = price;
        this.priceDescription = priceDescription;
        this.marketingText = textAtom;
        this.selectAction = selectAction;
        this.isFirstFlight = z11;
        this.isLastFlight = z12;
        this.viewEvent = tVar;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ToursFlightOptionsVO)) {
            return false;
        }
        ToursFlightOptionsVO toursFlightOptionsVO = (ToursFlightOptionsVO) other;
        return this.id == toursFlightOptionsVO.id && Intrinsics.d(this.airlineLogoUrls, toursFlightOptionsVO.airlineLogoUrls) && Intrinsics.d(this.flightFeatures, toursFlightOptionsVO.flightFeatures) && Intrinsics.d(this.agencyLogoImageUrl, toursFlightOptionsVO.agencyLogoImageUrl) && Intrinsics.d(this.warningBadge, toursFlightOptionsVO.warningBadge) && Intrinsics.d(this.wayThereDetails, toursFlightOptionsVO.wayThereDetails) && Intrinsics.d(this.wayBackDetails, toursFlightOptionsVO.wayBackDetails) && Intrinsics.d(this.price, toursFlightOptionsVO.price) && Intrinsics.d(this.priceDescription, toursFlightOptionsVO.priceDescription) && Intrinsics.d(this.marketingText, toursFlightOptionsVO.marketingText) && Intrinsics.d(this.selectAction, toursFlightOptionsVO.selectAction) && this.isFirstFlight == toursFlightOptionsVO.isFirstFlight && this.isLastFlight == toursFlightOptionsVO.isLastFlight && Intrinsics.d(this.viewEvent, toursFlightOptionsVO.viewEvent);
    }

    @NotNull
    public final String getAgencyLogoImageUrl() {
        return this.agencyLogoImageUrl;
    }

    @NotNull
    public final List<String> getAirlineLogoUrls() {
        return this.airlineLogoUrls;
    }

    @NotNull
    public final List<Badge> getFlightFeatures() {
        return this.flightFeatures;
    }

    @Override // l20.c
    public long getId() {
        return this.id;
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

    @Override // l20.c
    public Integer getScrollWidgetKey() {
        return null;
    }

    @NotNull
    public final AtomAction getSelectAction() {
        return this.selectAction;
    }

    public final t getViewEvent() {
        return this.viewEvent;
    }

    @Override // l20.c
    public int getViewItemKey() {
        return hashCode();
    }

    public final Badge getWarningBadge() {
        return this.warningBadge;
    }

    @NotNull
    public final TourFlightDetails getWayBackDetails() {
        return this.wayBackDetails;
    }

    @NotNull
    public final TourFlightDetails getWayThereDetails() {
        return this.wayThereDetails;
    }

    public int hashCode() {
        int a11 = g.a(g.b(g.b(Long.hashCode(this.id) * 31, 31, this.airlineLogoUrls), 31, this.flightFeatures), 31, this.agencyLogoImageUrl);
        Badge badge = this.warningBadge;
        int b11 = C2619v.b(C3051a.a(this.price, (this.wayBackDetails.hashCode() + ((this.wayThereDetails.hashCode() + ((a11 + (badge == null ? 0 : badge.hashCode())) * 31)) * 31)) * 31, 31), 31, this.priceDescription);
        TextAtom textAtom = this.marketingText;
        int a12 = C3532b.a(C3532b.a(C4598rp.a(this.selectAction, (b11 + (textAtom == null ? 0 : textAtom.hashCode())) * 31, 31), 31, this.isFirstFlight), 31, this.isLastFlight);
        t tVar = this.viewEvent;
        return a12 + (tVar != null ? tVar.hashCode() : 0);
    }

    /* renamed from: isFirstFlight, reason: from getter */
    public final boolean getIsFirstFlight() {
        return this.isFirstFlight;
    }

    /* renamed from: isLastFlight, reason: from getter */
    public final boolean getIsLastFlight() {
        return this.isLastFlight;
    }

    @NotNull
    public String toString() {
        long j11 = this.id;
        List<String> list = this.airlineLogoUrls;
        List<Badge> list2 = this.flightFeatures;
        String str = this.agencyLogoImageUrl;
        Badge badge = this.warningBadge;
        TourFlightDetails tourFlightDetails = this.wayThereDetails;
        TourFlightDetails tourFlightDetails2 = this.wayBackDetails;
        Price price = this.price;
        TextAtom textAtom = this.priceDescription;
        TextAtom textAtom2 = this.marketingText;
        AtomAction atomAction = this.selectAction;
        boolean z11 = this.isFirstFlight;
        boolean z12 = this.isLastFlight;
        t tVar = this.viewEvent;
        StringBuilder b11 = Lh.b.b(j11, "ToursFlightOptionsVO(id=", ", airlineLogoUrls=", list);
        b11.append(", flightFeatures=");
        b11.append(list2);
        b11.append(", agencyLogoImageUrl=");
        b11.append(str);
        b11.append(", warningBadge=");
        b11.append(badge);
        b11.append(", wayThereDetails=");
        b11.append(tourFlightDetails);
        b11.append(", wayBackDetails=");
        b11.append(tourFlightDetails2);
        b11.append(", price=");
        b11.append(price);
        C2639a.e(", priceDescription=", ", marketingText=", b11, textAtom, textAtom2);
        b11.append(", selectAction=");
        b11.append(atomAction);
        b11.append(", isFirstFlight=");
        b11.append(z11);
        C2971a.d(b11, ", isLastFlight=", z12, ", viewEvent=", tVar);
        b11.append(")");
        return b11.toString();
    }
}
