package ru.ozon.app.android.travel.feature.railway.widgets.railwayTrainInformation.data;

import B90.C2619v;
import G.g;
import HY.a;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.squareup.moshi.j;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.tokenized.model.TokenizedTrackingInfo;
import ru.ozon.app.android.cart.common.dynamicElement.DynamicElementDTO;
import ru.ozon.app.android.travel.molecules.dto.linkButton.LinkButtonDTO;
import ru.ozon.app.android.travel.molecules.dto.timer.TimerDTO;
import ru.ozon.app.android.ugc.widgets.selectionItemForm.data.SelectionItemFormDTO;
import ru.ozon.uni.atoms.data.price.Price;
import ru.ozon.uni.atoms.data.texts.TextAtom;

@j(generateAdapter = true)
@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0015\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\b\u0081\b\u0018\u00002\u00020\u0001:\u0003*+,BS\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\t\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0003\u0012\u0014\u0010\f\u001a\u0010\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u000f\u0018\u00010\r¢\u0006\u0004\b\u0010\u0010\u0011J\u000b\u0010\u001d\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001e\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u001f\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u000f\u0010 \u001a\b\u0012\u0004\u0012\u00020\n0\tHÆ\u0003J\u000b\u0010!\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0017\u0010\"\u001a\u0010\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u000f\u0018\u00010\rHÆ\u0003Ja\u0010#\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\t2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00032\u0016\b\u0002\u0010\f\u001a\u0010\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u000f\u0018\u00010\rHÆ\u0001J\u0013\u0010$\u001a\u00020%2\b\u0010&\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010'\u001a\u00020(HÖ\u0001J\t\u0010)\u001a\u00020\u000eHÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0017\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\t¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u0013\u0010\u000b\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0013R\u001f\u0010\f\u001a\u0010\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u000f\u0018\u00010\r¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001c¨\u0006-"}, d2 = {"Lru/ozon/app/android/travel/feature/railway/widgets/railwayTrainInformation/data/RailwayTrainInformationDTO;", "", SelectionItemFormDTO.TITLE_FIELD_NAME, "Lru/ozon/uni/atoms/data/texts/TextAtom;", DynamicElementDTO.TIMER, "Lru/ozon/app/android/travel/molecules/dto/timer/TimerDTO;", "priceInfo", "Lru/ozon/app/android/travel/feature/railway/widgets/railwayTrainInformation/data/RailwayTrainInformationDTO$PriceInfo;", "segments", "", "Lru/ozon/app/android/travel/feature/railway/widgets/railwayTrainInformation/data/RailwayTrainInformationDTO$Segment;", "localTimeInfo", "trackingInfo", "", "", "Lru/ozon/android/tokenized/model/TokenizedTrackingInfo;", "<init>", "(Lru/ozon/uni/atoms/data/texts/TextAtom;Lru/ozon/app/android/travel/molecules/dto/timer/TimerDTO;Lru/ozon/app/android/travel/feature/railway/widgets/railwayTrainInformation/data/RailwayTrainInformationDTO$PriceInfo;Ljava/util/List;Lru/ozon/uni/atoms/data/texts/TextAtom;Ljava/util/Map;)V", "getTitle", "()Lru/ozon/uni/atoms/data/texts/TextAtom;", "getTimer", "()Lru/ozon/app/android/travel/molecules/dto/timer/TimerDTO;", "getPriceInfo", "()Lru/ozon/app/android/travel/feature/railway/widgets/railwayTrainInformation/data/RailwayTrainInformationDTO$PriceInfo;", "getSegments", "()Ljava/util/List;", "getLocalTimeInfo", "getTrackingInfo", "()Ljava/util/Map;", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "", "other", "hashCode", "", "toString", "PriceInfo", "Segment", "Station", "railway_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class RailwayTrainInformationDTO {
    public static final int $stable = 8;
    private final TextAtom localTimeInfo;
    private final PriceInfo priceInfo;

    @NotNull
    private final List<Segment> segments;
    private final TimerDTO timer;
    private final TextAtom title;
    private final Map<String, TokenizedTrackingInfo> trackingInfo;

    @j(generateAdapter = true)
    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0016"}, d2 = {"Lru/ozon/app/android/travel/feature/railway/widgets/railwayTrainInformation/data/RailwayTrainInformationDTO$PriceInfo;", "", "price", "Lru/ozon/uni/atoms/data/price/Price;", "description", "Lru/ozon/uni/atoms/data/texts/TextAtom;", "<init>", "(Lru/ozon/uni/atoms/data/price/Price;Lru/ozon/uni/atoms/data/texts/TextAtom;)V", "getPrice", "()Lru/ozon/uni/atoms/data/price/Price;", "getDescription", "()Lru/ozon/uni/atoms/data/texts/TextAtom;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "", "railway_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class PriceInfo {
        public static final int $stable = TextAtom.$stable | Price.$stable;

        @NotNull
        private final TextAtom description;

        @NotNull
        private final Price price;

        public PriceInfo(@NotNull Price price, @NotNull TextAtom description) {
            Intrinsics.checkNotNullParameter(price, "price");
            Intrinsics.checkNotNullParameter(description, "description");
            this.price = price;
            this.description = description;
        }

        public static /* synthetic */ PriceInfo copy$default(PriceInfo priceInfo, Price price, TextAtom textAtom, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                price = priceInfo.price;
            }
            if ((i11 & 2) != 0) {
                textAtom = priceInfo.description;
            }
            return priceInfo.copy(price, textAtom);
        }

        @NotNull
        /* renamed from: component1, reason: from getter */
        public final Price getPrice() {
            return this.price;
        }

        @NotNull
        /* renamed from: component2, reason: from getter */
        public final TextAtom getDescription() {
            return this.description;
        }

        @NotNull
        public final PriceInfo copy(@NotNull Price price, @NotNull TextAtom description) {
            Intrinsics.checkNotNullParameter(price, "price");
            Intrinsics.checkNotNullParameter(description, "description");
            return new PriceInfo(price, description);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof PriceInfo)) {
                return false;
            }
            PriceInfo priceInfo = (PriceInfo) other;
            return Intrinsics.d(this.price, priceInfo.price) && Intrinsics.d(this.description, priceInfo.description);
        }

        @NotNull
        public final TextAtom getDescription() {
            return this.description;
        }

        @NotNull
        public final Price getPrice() {
            return this.price;
        }

        public int hashCode() {
            return this.description.hashCode() + (this.price.hashCode() * 31);
        }

        @NotNull
        public String toString() {
            return "PriceInfo(price=" + this.price + ", description=" + this.description + ")";
        }
    }

    @j(generateAdapter = true)
    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0016\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B9\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\t\u001a\u00020\u0003\u0012\u0006\u0010\n\u001a\u00020\u0003¢\u0006\u0004\b\u000b\u0010\fJ\t\u0010\u0016\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0017\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\t\u0010\u0018\u001a\u00020\u0007HÆ\u0003J\t\u0010\u0019\u001a\u00020\u0007HÆ\u0003J\t\u0010\u001a\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001b\u001a\u00020\u0003HÆ\u0003JG\u0010\u001c\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\t\u001a\u00020\u00032\b\b\u0002\u0010\n\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u001d\u001a\u00020\u001e2\b\u0010\u001f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010 \u001a\u00020!HÖ\u0001J\t\u0010\"\u001a\u00020#HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0011\u0010\b\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0012R\u0011\u0010\t\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u000eR\u0011\u0010\n\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u000e¨\u0006$"}, d2 = {"Lru/ozon/app/android/travel/feature/railway/widgets/railwayTrainInformation/data/RailwayTrainInformationDTO$Segment;", "", SelectionItemFormDTO.TITLE_FIELD_NAME, "Lru/ozon/uni/atoms/data/texts/TextAtom;", "routeButton", "Lru/ozon/app/android/travel/molecules/dto/linkButton/LinkButtonDTO;", "departureStation", "Lru/ozon/app/android/travel/feature/railway/widgets/railwayTrainInformation/data/RailwayTrainInformationDTO$Station;", "arrivalStation", "duration", "carriageInfo", "<init>", "(Lru/ozon/uni/atoms/data/texts/TextAtom;Lru/ozon/app/android/travel/molecules/dto/linkButton/LinkButtonDTO;Lru/ozon/app/android/travel/feature/railway/widgets/railwayTrainInformation/data/RailwayTrainInformationDTO$Station;Lru/ozon/app/android/travel/feature/railway/widgets/railwayTrainInformation/data/RailwayTrainInformationDTO$Station;Lru/ozon/uni/atoms/data/texts/TextAtom;Lru/ozon/uni/atoms/data/texts/TextAtom;)V", "getTitle", "()Lru/ozon/uni/atoms/data/texts/TextAtom;", "getRouteButton", "()Lru/ozon/app/android/travel/molecules/dto/linkButton/LinkButtonDTO;", "getDepartureStation", "()Lru/ozon/app/android/travel/feature/railway/widgets/railwayTrainInformation/data/RailwayTrainInformationDTO$Station;", "getArrivalStation", "getDuration", "getCarriageInfo", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "", "other", "hashCode", "", "toString", "", "railway_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class Segment {
        public static final int $stable = 8;

        @NotNull
        private final Station arrivalStation;

        @NotNull
        private final TextAtom carriageInfo;

        @NotNull
        private final Station departureStation;

        @NotNull
        private final TextAtom duration;
        private final LinkButtonDTO routeButton;

        @NotNull
        private final TextAtom title;

        public Segment(@NotNull TextAtom title, LinkButtonDTO linkButtonDTO, @NotNull Station departureStation, @NotNull Station arrivalStation, @NotNull TextAtom duration, @NotNull TextAtom carriageInfo) {
            Intrinsics.checkNotNullParameter(title, "title");
            Intrinsics.checkNotNullParameter(departureStation, "departureStation");
            Intrinsics.checkNotNullParameter(arrivalStation, "arrivalStation");
            Intrinsics.checkNotNullParameter(duration, "duration");
            Intrinsics.checkNotNullParameter(carriageInfo, "carriageInfo");
            this.title = title;
            this.routeButton = linkButtonDTO;
            this.departureStation = departureStation;
            this.arrivalStation = arrivalStation;
            this.duration = duration;
            this.carriageInfo = carriageInfo;
        }

        public static /* synthetic */ Segment copy$default(Segment segment, TextAtom textAtom, LinkButtonDTO linkButtonDTO, Station station, Station station2, TextAtom textAtom2, TextAtom textAtom3, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                textAtom = segment.title;
            }
            if ((i11 & 2) != 0) {
                linkButtonDTO = segment.routeButton;
            }
            if ((i11 & 4) != 0) {
                station = segment.departureStation;
            }
            if ((i11 & 8) != 0) {
                station2 = segment.arrivalStation;
            }
            if ((i11 & 16) != 0) {
                textAtom2 = segment.duration;
            }
            if ((i11 & 32) != 0) {
                textAtom3 = segment.carriageInfo;
            }
            TextAtom textAtom4 = textAtom2;
            TextAtom textAtom5 = textAtom3;
            return segment.copy(textAtom, linkButtonDTO, station, station2, textAtom4, textAtom5);
        }

        @NotNull
        /* renamed from: component1, reason: from getter */
        public final TextAtom getTitle() {
            return this.title;
        }

        /* renamed from: component2, reason: from getter */
        public final LinkButtonDTO getRouteButton() {
            return this.routeButton;
        }

        @NotNull
        /* renamed from: component3, reason: from getter */
        public final Station getDepartureStation() {
            return this.departureStation;
        }

        @NotNull
        /* renamed from: component4, reason: from getter */
        public final Station getArrivalStation() {
            return this.arrivalStation;
        }

        @NotNull
        /* renamed from: component5, reason: from getter */
        public final TextAtom getDuration() {
            return this.duration;
        }

        @NotNull
        /* renamed from: component6, reason: from getter */
        public final TextAtom getCarriageInfo() {
            return this.carriageInfo;
        }

        @NotNull
        public final Segment copy(@NotNull TextAtom title, LinkButtonDTO routeButton, @NotNull Station departureStation, @NotNull Station arrivalStation, @NotNull TextAtom duration, @NotNull TextAtom carriageInfo) {
            Intrinsics.checkNotNullParameter(title, "title");
            Intrinsics.checkNotNullParameter(departureStation, "departureStation");
            Intrinsics.checkNotNullParameter(arrivalStation, "arrivalStation");
            Intrinsics.checkNotNullParameter(duration, "duration");
            Intrinsics.checkNotNullParameter(carriageInfo, "carriageInfo");
            return new Segment(title, routeButton, departureStation, arrivalStation, duration, carriageInfo);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Segment)) {
                return false;
            }
            Segment segment = (Segment) other;
            return Intrinsics.d(this.title, segment.title) && Intrinsics.d(this.routeButton, segment.routeButton) && Intrinsics.d(this.departureStation, segment.departureStation) && Intrinsics.d(this.arrivalStation, segment.arrivalStation) && Intrinsics.d(this.duration, segment.duration) && Intrinsics.d(this.carriageInfo, segment.carriageInfo);
        }

        @NotNull
        public final Station getArrivalStation() {
            return this.arrivalStation;
        }

        @NotNull
        public final TextAtom getCarriageInfo() {
            return this.carriageInfo;
        }

        @NotNull
        public final Station getDepartureStation() {
            return this.departureStation;
        }

        @NotNull
        public final TextAtom getDuration() {
            return this.duration;
        }

        public final LinkButtonDTO getRouteButton() {
            return this.routeButton;
        }

        @NotNull
        public final TextAtom getTitle() {
            return this.title;
        }

        public int hashCode() {
            int hashCode = this.title.hashCode() * 31;
            LinkButtonDTO linkButtonDTO = this.routeButton;
            return this.carriageInfo.hashCode() + C2619v.b((this.arrivalStation.hashCode() + ((this.departureStation.hashCode() + ((hashCode + (linkButtonDTO == null ? 0 : linkButtonDTO.hashCode())) * 31)) * 31)) * 31, 31, this.duration);
        }

        @NotNull
        public String toString() {
            return "Segment(title=" + this.title + ", routeButton=" + this.routeButton + ", departureStation=" + this.departureStation + ", arrivalStation=" + this.arrivalStation + ", duration=" + this.duration + ", carriageInfo=" + this.carriageInfo + ")";
        }
    }

    @j(generateAdapter = true)
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B)\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u000f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J3\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001J\t\u0010\u0018\u001a\u00020\u0019HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\nR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\nR\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\n¨\u0006\u001a"}, d2 = {"Lru/ozon/app/android/travel/feature/railway/widgets/railwayTrainInformation/data/RailwayTrainInformationDTO$Station;", "", AppMeasurementSdk.ConditionalUserProperty.NAME, "Lru/ozon/uni/atoms/data/texts/TextAtom;", "additionalName", "time", "date", "<init>", "(Lru/ozon/uni/atoms/data/texts/TextAtom;Lru/ozon/uni/atoms/data/texts/TextAtom;Lru/ozon/uni/atoms/data/texts/TextAtom;Lru/ozon/uni/atoms/data/texts/TextAtom;)V", "getName", "()Lru/ozon/uni/atoms/data/texts/TextAtom;", "getAdditionalName", "getTime", "getDate", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "", "toString", "", "railway_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class Station {
        public static final int $stable = TextAtom.$stable;
        private final TextAtom additionalName;

        @NotNull
        private final TextAtom date;

        @NotNull
        private final TextAtom name;

        @NotNull
        private final TextAtom time;

        public Station(@NotNull TextAtom name, TextAtom textAtom, @NotNull TextAtom time, @NotNull TextAtom date) {
            Intrinsics.checkNotNullParameter(name, "name");
            Intrinsics.checkNotNullParameter(time, "time");
            Intrinsics.checkNotNullParameter(date, "date");
            this.name = name;
            this.additionalName = textAtom;
            this.time = time;
            this.date = date;
        }

        public static /* synthetic */ Station copy$default(Station station, TextAtom textAtom, TextAtom textAtom2, TextAtom textAtom3, TextAtom textAtom4, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                textAtom = station.name;
            }
            if ((i11 & 2) != 0) {
                textAtom2 = station.additionalName;
            }
            if ((i11 & 4) != 0) {
                textAtom3 = station.time;
            }
            if ((i11 & 8) != 0) {
                textAtom4 = station.date;
            }
            return station.copy(textAtom, textAtom2, textAtom3, textAtom4);
        }

        @NotNull
        /* renamed from: component1, reason: from getter */
        public final TextAtom getName() {
            return this.name;
        }

        /* renamed from: component2, reason: from getter */
        public final TextAtom getAdditionalName() {
            return this.additionalName;
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
        public final Station copy(@NotNull TextAtom name, TextAtom additionalName, @NotNull TextAtom time, @NotNull TextAtom date) {
            Intrinsics.checkNotNullParameter(name, "name");
            Intrinsics.checkNotNullParameter(time, "time");
            Intrinsics.checkNotNullParameter(date, "date");
            return new Station(name, additionalName, time, date);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Station)) {
                return false;
            }
            Station station = (Station) other;
            return Intrinsics.d(this.name, station.name) && Intrinsics.d(this.additionalName, station.additionalName) && Intrinsics.d(this.time, station.time) && Intrinsics.d(this.date, station.date);
        }

        public final TextAtom getAdditionalName() {
            return this.additionalName;
        }

        @NotNull
        public final TextAtom getDate() {
            return this.date;
        }

        @NotNull
        public final TextAtom getName() {
            return this.name;
        }

        @NotNull
        public final TextAtom getTime() {
            return this.time;
        }

        public int hashCode() {
            int hashCode = this.name.hashCode() * 31;
            TextAtom textAtom = this.additionalName;
            return this.date.hashCode() + C2619v.b((hashCode + (textAtom == null ? 0 : textAtom.hashCode())) * 31, 31, this.time);
        }

        @NotNull
        public String toString() {
            TextAtom textAtom = this.name;
            TextAtom textAtom2 = this.additionalName;
            TextAtom textAtom3 = this.time;
            TextAtom textAtom4 = this.date;
            StringBuilder a11 = a.a("Station(name=", textAtom, ", additionalName=", textAtom2, ", time=");
            a11.append(textAtom3);
            a11.append(", date=");
            a11.append(textAtom4);
            a11.append(")");
            return a11.toString();
        }
    }

    public RailwayTrainInformationDTO(TextAtom textAtom, TimerDTO timerDTO, PriceInfo priceInfo, @NotNull List<Segment> segments, TextAtom textAtom2, Map<String, TokenizedTrackingInfo> map) {
        Intrinsics.checkNotNullParameter(segments, "segments");
        this.title = textAtom;
        this.timer = timerDTO;
        this.priceInfo = priceInfo;
        this.segments = segments;
        this.localTimeInfo = textAtom2;
        this.trackingInfo = map;
    }

    public static /* synthetic */ RailwayTrainInformationDTO copy$default(RailwayTrainInformationDTO railwayTrainInformationDTO, TextAtom textAtom, TimerDTO timerDTO, PriceInfo priceInfo, List list, TextAtom textAtom2, Map map, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            textAtom = railwayTrainInformationDTO.title;
        }
        if ((i11 & 2) != 0) {
            timerDTO = railwayTrainInformationDTO.timer;
        }
        if ((i11 & 4) != 0) {
            priceInfo = railwayTrainInformationDTO.priceInfo;
        }
        if ((i11 & 8) != 0) {
            list = railwayTrainInformationDTO.segments;
        }
        if ((i11 & 16) != 0) {
            textAtom2 = railwayTrainInformationDTO.localTimeInfo;
        }
        if ((i11 & 32) != 0) {
            map = railwayTrainInformationDTO.trackingInfo;
        }
        TextAtom textAtom3 = textAtom2;
        Map map2 = map;
        return railwayTrainInformationDTO.copy(textAtom, timerDTO, priceInfo, list, textAtom3, map2);
    }

    /* renamed from: component1, reason: from getter */
    public final TextAtom getTitle() {
        return this.title;
    }

    /* renamed from: component2, reason: from getter */
    public final TimerDTO getTimer() {
        return this.timer;
    }

    /* renamed from: component3, reason: from getter */
    public final PriceInfo getPriceInfo() {
        return this.priceInfo;
    }

    @NotNull
    public final List<Segment> component4() {
        return this.segments;
    }

    /* renamed from: component5, reason: from getter */
    public final TextAtom getLocalTimeInfo() {
        return this.localTimeInfo;
    }

    public final Map<String, TokenizedTrackingInfo> component6() {
        return this.trackingInfo;
    }

    @NotNull
    public final RailwayTrainInformationDTO copy(TextAtom title, TimerDTO timer, PriceInfo priceInfo, @NotNull List<Segment> segments, TextAtom localTimeInfo, Map<String, TokenizedTrackingInfo> trackingInfo) {
        Intrinsics.checkNotNullParameter(segments, "segments");
        return new RailwayTrainInformationDTO(title, timer, priceInfo, segments, localTimeInfo, trackingInfo);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof RailwayTrainInformationDTO)) {
            return false;
        }
        RailwayTrainInformationDTO railwayTrainInformationDTO = (RailwayTrainInformationDTO) other;
        return Intrinsics.d(this.title, railwayTrainInformationDTO.title) && Intrinsics.d(this.timer, railwayTrainInformationDTO.timer) && Intrinsics.d(this.priceInfo, railwayTrainInformationDTO.priceInfo) && Intrinsics.d(this.segments, railwayTrainInformationDTO.segments) && Intrinsics.d(this.localTimeInfo, railwayTrainInformationDTO.localTimeInfo) && Intrinsics.d(this.trackingInfo, railwayTrainInformationDTO.trackingInfo);
    }

    public final TextAtom getLocalTimeInfo() {
        return this.localTimeInfo;
    }

    public final PriceInfo getPriceInfo() {
        return this.priceInfo;
    }

    @NotNull
    public final List<Segment> getSegments() {
        return this.segments;
    }

    public final TimerDTO getTimer() {
        return this.timer;
    }

    public final TextAtom getTitle() {
        return this.title;
    }

    public final Map<String, TokenizedTrackingInfo> getTrackingInfo() {
        return this.trackingInfo;
    }

    public int hashCode() {
        TextAtom textAtom = this.title;
        int hashCode = (textAtom == null ? 0 : textAtom.hashCode()) * 31;
        TimerDTO timerDTO = this.timer;
        int hashCode2 = (hashCode + (timerDTO == null ? 0 : timerDTO.hashCode())) * 31;
        PriceInfo priceInfo = this.priceInfo;
        int b11 = g.b((hashCode2 + (priceInfo == null ? 0 : priceInfo.hashCode())) * 31, 31, this.segments);
        TextAtom textAtom2 = this.localTimeInfo;
        int hashCode3 = (b11 + (textAtom2 == null ? 0 : textAtom2.hashCode())) * 31;
        Map<String, TokenizedTrackingInfo> map = this.trackingInfo;
        return hashCode3 + (map != null ? map.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "RailwayTrainInformationDTO(title=" + this.title + ", timer=" + this.timer + ", priceInfo=" + this.priceInfo + ", segments=" + this.segments + ", localTimeInfo=" + this.localTimeInfo + ", trackingInfo=" + this.trackingInfo + ")";
    }
}
