package ru.ozon.app.android.travel.feature.railway.widgets.railwayTrainInformation.presentation;

import B90.C2619v;
import Bl.C2639a;
import G.g;
import HY.a;
import WZ.t;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import l20.c;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.cart.common.dynamicElement.DynamicElementDTO;
import ru.ozon.app.android.travel.molecules.dto.timer.TimerDTO;
import ru.ozon.app.android.travel.molecules.view.linkButton.LinkButtonVO;
import ru.ozon.app.android.ugc.widgets.selectionItemForm.data.SelectionItemFormDTO;
import ru.ozon.uni.atoms.data.price.Price;
import ru.ozon.uni.atoms.data.texts.TextAtom;

@Metadata(d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0019\b\u0081\b\u0018\u00002\u00060\u0001j\u0002`\u0002:\u0003234BU\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t\u0012\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000b\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u0005\u0012\u000e\u0010\u0011\u001a\n\u0018\u00010\u000fj\u0004\u0018\u0001`\u0010¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0015\u001a\u00020\u0014HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0018\u001a\u00020\u0017HÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u001a\u0010\u001d\u001a\u00020\u001c2\b\u0010\u001b\u001a\u0004\u0018\u00010\u001aHÖ\u0003¢\u0006\u0004\b\u001d\u0010\u001eR\u001a\u0010\u0004\u001a\u00020\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u001f\u001a\u0004\b \u0010!R\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010\"\u001a\u0004\b#\u0010$R\u0019\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010%\u001a\u0004\b&\u0010'R\u0019\u0010\n\u001a\u0004\u0018\u00010\t8\u0006¢\u0006\f\n\u0004\b\n\u0010(\u001a\u0004\b)\u0010*R\u001d\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000b8\u0006¢\u0006\f\n\u0004\b\r\u0010+\u001a\u0004\b,\u0010-R\u0019\u0010\u000e\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b\u000e\u0010\"\u001a\u0004\b.\u0010$R\u001f\u0010\u0011\u001a\n\u0018\u00010\u000fj\u0004\u0018\u0001`\u00108\u0006¢\u0006\f\n\u0004\b\u0011\u0010/\u001a\u0004\b0\u00101¨\u00065"}, d2 = {"Lru/ozon/app/android/travel/feature/railway/widgets/railwayTrainInformation/presentation/RailwayTrainInformationVO;", "Ll20/c;", "Lru/ozon/app/android/composer/view/ViewObject;", "", "id", "Lru/ozon/uni/atoms/data/texts/TextAtom;", SelectionItemFormDTO.TITLE_FIELD_NAME, "Lru/ozon/app/android/travel/molecules/dto/timer/TimerDTO;", DynamicElementDTO.TIMER, "Lru/ozon/app/android/travel/feature/railway/widgets/railwayTrainInformation/presentation/RailwayTrainInformationVO$PriceInfoVO;", "priceInfo", "", "Lru/ozon/app/android/travel/feature/railway/widgets/railwayTrainInformation/presentation/RailwayTrainInformationVO$SegmentVO;", "segments", "localTimeInfo", "LWZ/t;", "Lru/ozon/app/android/analytics/modules/tokenized/TokenizedEvent;", "viewEvent", "<init>", "(JLru/ozon/uni/atoms/data/texts/TextAtom;Lru/ozon/app/android/travel/molecules/dto/timer/TimerDTO;Lru/ozon/app/android/travel/feature/railway/widgets/railwayTrainInformation/presentation/RailwayTrainInformationVO$PriceInfoVO;Ljava/util/List;Lru/ozon/uni/atoms/data/texts/TextAtom;LWZ/t;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "J", "getId", "()J", "Lru/ozon/uni/atoms/data/texts/TextAtom;", "getTitle", "()Lru/ozon/uni/atoms/data/texts/TextAtom;", "Lru/ozon/app/android/travel/molecules/dto/timer/TimerDTO;", "getTimer", "()Lru/ozon/app/android/travel/molecules/dto/timer/TimerDTO;", "Lru/ozon/app/android/travel/feature/railway/widgets/railwayTrainInformation/presentation/RailwayTrainInformationVO$PriceInfoVO;", "getPriceInfo", "()Lru/ozon/app/android/travel/feature/railway/widgets/railwayTrainInformation/presentation/RailwayTrainInformationVO$PriceInfoVO;", "Ljava/util/List;", "getSegments", "()Ljava/util/List;", "getLocalTimeInfo", "LWZ/t;", "getViewEvent", "()LWZ/t;", "PriceInfoVO", "SegmentVO", "StationVO", "railway_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class RailwayTrainInformationVO implements c {
    private final long id;
    private final TextAtom localTimeInfo;
    private final PriceInfoVO priceInfo;

    @NotNull
    private final List<SegmentVO> segments;
    private final TimerDTO timer;
    private final TextAtom title;
    private final t viewEvent;

    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\t\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, d2 = {"Lru/ozon/app/android/travel/feature/railway/widgets/railwayTrainInformation/presentation/RailwayTrainInformationVO$PriceInfoVO;", "", "Lru/ozon/uni/atoms/data/price/Price;", "price", "Lru/ozon/uni/atoms/data/texts/TextAtom;", "description", "<init>", "(Lru/ozon/uni/atoms/data/price/Price;Lru/ozon/uni/atoms/data/texts/TextAtom;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lru/ozon/uni/atoms/data/price/Price;", "getPrice", "()Lru/ozon/uni/atoms/data/price/Price;", "Lru/ozon/uni/atoms/data/texts/TextAtom;", "getDescription", "()Lru/ozon/uni/atoms/data/texts/TextAtom;", "railway_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class PriceInfoVO {
        public static final int $stable = TextAtom.$stable | Price.$stable;

        @NotNull
        private final TextAtom description;

        @NotNull
        private final Price price;

        public PriceInfoVO(@NotNull Price price, @NotNull TextAtom description) {
            Intrinsics.checkNotNullParameter(price, "price");
            Intrinsics.checkNotNullParameter(description, "description");
            this.price = price;
            this.description = description;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof PriceInfoVO)) {
                return false;
            }
            PriceInfoVO priceInfoVO = (PriceInfoVO) other;
            return Intrinsics.d(this.price, priceInfoVO.price) && Intrinsics.d(this.description, priceInfoVO.description);
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
            return "PriceInfoVO(price=" + this.price + ", description=" + this.description + ")";
        }
    }

    @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0012\b\u0087\b\u0018\u00002\u00020\u0001BA\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\n\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\u0004\u0012\u0006\u0010\f\u001a\u00020\u0004¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u001a\u0010\u0017\u001a\u00020\u00162\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0017\u0010\u0018R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u001f\u001a\u0004\b \u0010!R\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\t\u0010\"\u001a\u0004\b#\u0010$R\u0017\u0010\n\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\n\u0010\"\u001a\u0004\b%\u0010$R\u0017\u0010\u000b\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u000b\u0010\u001c\u001a\u0004\b&\u0010\u001eR\u0017\u0010\f\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\f\u0010\u001c\u001a\u0004\b'\u0010\u001e¨\u0006("}, d2 = {"Lru/ozon/app/android/travel/feature/railway/widgets/railwayTrainInformation/presentation/RailwayTrainInformationVO$SegmentVO;", "", "", "id", "Lru/ozon/uni/atoms/data/texts/TextAtom;", SelectionItemFormDTO.TITLE_FIELD_NAME, "Lru/ozon/app/android/travel/molecules/view/linkButton/LinkButtonVO;", "routeButton", "Lru/ozon/app/android/travel/feature/railway/widgets/railwayTrainInformation/presentation/RailwayTrainInformationVO$StationVO;", "departureStation", "arrivalStation", "duration", "carriageInfo", "<init>", "(JLru/ozon/uni/atoms/data/texts/TextAtom;Lru/ozon/app/android/travel/molecules/view/linkButton/LinkButtonVO;Lru/ozon/app/android/travel/feature/railway/widgets/railwayTrainInformation/presentation/RailwayTrainInformationVO$StationVO;Lru/ozon/app/android/travel/feature/railway/widgets/railwayTrainInformation/presentation/RailwayTrainInformationVO$StationVO;Lru/ozon/uni/atoms/data/texts/TextAtom;Lru/ozon/uni/atoms/data/texts/TextAtom;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "J", "getId", "()J", "Lru/ozon/uni/atoms/data/texts/TextAtom;", "getTitle", "()Lru/ozon/uni/atoms/data/texts/TextAtom;", "Lru/ozon/app/android/travel/molecules/view/linkButton/LinkButtonVO;", "getRouteButton", "()Lru/ozon/app/android/travel/molecules/view/linkButton/LinkButtonVO;", "Lru/ozon/app/android/travel/feature/railway/widgets/railwayTrainInformation/presentation/RailwayTrainInformationVO$StationVO;", "getDepartureStation", "()Lru/ozon/app/android/travel/feature/railway/widgets/railwayTrainInformation/presentation/RailwayTrainInformationVO$StationVO;", "getArrivalStation", "getDuration", "getCarriageInfo", "railway_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class SegmentVO {
        public static final int $stable;

        @NotNull
        private final StationVO arrivalStation;

        @NotNull
        private final TextAtom carriageInfo;

        @NotNull
        private final StationVO departureStation;

        @NotNull
        private final TextAtom duration;
        private final long id;
        private final LinkButtonVO routeButton;

        @NotNull
        private final TextAtom title;

        static {
            int i11 = TextAtom.$stable;
            $stable = i11 | LinkButtonVO.$stable | i11;
        }

        public SegmentVO(long j11, @NotNull TextAtom title, LinkButtonVO linkButtonVO, @NotNull StationVO departureStation, @NotNull StationVO arrivalStation, @NotNull TextAtom duration, @NotNull TextAtom carriageInfo) {
            Intrinsics.checkNotNullParameter(title, "title");
            Intrinsics.checkNotNullParameter(departureStation, "departureStation");
            Intrinsics.checkNotNullParameter(arrivalStation, "arrivalStation");
            Intrinsics.checkNotNullParameter(duration, "duration");
            Intrinsics.checkNotNullParameter(carriageInfo, "carriageInfo");
            this.id = j11;
            this.title = title;
            this.routeButton = linkButtonVO;
            this.departureStation = departureStation;
            this.arrivalStation = arrivalStation;
            this.duration = duration;
            this.carriageInfo = carriageInfo;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof SegmentVO)) {
                return false;
            }
            SegmentVO segmentVO = (SegmentVO) other;
            return this.id == segmentVO.id && Intrinsics.d(this.title, segmentVO.title) && Intrinsics.d(this.routeButton, segmentVO.routeButton) && Intrinsics.d(this.departureStation, segmentVO.departureStation) && Intrinsics.d(this.arrivalStation, segmentVO.arrivalStation) && Intrinsics.d(this.duration, segmentVO.duration) && Intrinsics.d(this.carriageInfo, segmentVO.carriageInfo);
        }

        @NotNull
        public final StationVO getArrivalStation() {
            return this.arrivalStation;
        }

        @NotNull
        public final TextAtom getCarriageInfo() {
            return this.carriageInfo;
        }

        @NotNull
        public final StationVO getDepartureStation() {
            return this.departureStation;
        }

        @NotNull
        public final TextAtom getDuration() {
            return this.duration;
        }

        public final long getId() {
            return this.id;
        }

        public final LinkButtonVO getRouteButton() {
            return this.routeButton;
        }

        @NotNull
        public final TextAtom getTitle() {
            return this.title;
        }

        public int hashCode() {
            int b11 = C2619v.b(Long.hashCode(this.id) * 31, 31, this.title);
            LinkButtonVO linkButtonVO = this.routeButton;
            return this.carriageInfo.hashCode() + C2619v.b((this.arrivalStation.hashCode() + ((this.departureStation.hashCode() + ((b11 + (linkButtonVO == null ? 0 : linkButtonVO.hashCode())) * 31)) * 31)) * 31, 31, this.duration);
        }

        @NotNull
        public String toString() {
            long j11 = this.id;
            TextAtom textAtom = this.title;
            LinkButtonVO linkButtonVO = this.routeButton;
            StationVO stationVO = this.departureStation;
            StationVO stationVO2 = this.arrivalStation;
            TextAtom textAtom2 = this.duration;
            TextAtom textAtom3 = this.carriageInfo;
            StringBuilder c11 = C2639a.c("SegmentVO(id=", j11, ", title=", textAtom);
            c11.append(", routeButton=");
            c11.append(linkButtonVO);
            c11.append(", departureStation=");
            c11.append(stationVO);
            c11.append(", arrivalStation=");
            c11.append(stationVO2);
            c11.append(", duration=");
            c11.append(textAtom2);
            c11.append(", carriageInfo=");
            c11.append(textAtom3);
            c11.append(")");
            return c11.toString();
        }
    }

    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\t\b\u0087\b\u0018\u00002\u00020\u0001B)\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0013\u001a\u0004\b\u0016\u0010\u0015R\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0013\u001a\u0004\b\u0017\u0010\u0015R\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0013\u001a\u0004\b\u0018\u0010\u0015¨\u0006\u0019"}, d2 = {"Lru/ozon/app/android/travel/feature/railway/widgets/railwayTrainInformation/presentation/RailwayTrainInformationVO$StationVO;", "", "Lru/ozon/uni/atoms/data/texts/TextAtom;", AppMeasurementSdk.ConditionalUserProperty.NAME, "additionalName", "time", "date", "<init>", "(Lru/ozon/uni/atoms/data/texts/TextAtom;Lru/ozon/uni/atoms/data/texts/TextAtom;Lru/ozon/uni/atoms/data/texts/TextAtom;Lru/ozon/uni/atoms/data/texts/TextAtom;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lru/ozon/uni/atoms/data/texts/TextAtom;", "getName", "()Lru/ozon/uni/atoms/data/texts/TextAtom;", "getAdditionalName", "getTime", "getDate", "railway_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class StationVO {
        public static final int $stable = TextAtom.$stable;
        private final TextAtom additionalName;

        @NotNull
        private final TextAtom date;

        @NotNull
        private final TextAtom name;

        @NotNull
        private final TextAtom time;

        public StationVO(@NotNull TextAtom name, TextAtom textAtom, @NotNull TextAtom time, @NotNull TextAtom date) {
            Intrinsics.checkNotNullParameter(name, "name");
            Intrinsics.checkNotNullParameter(time, "time");
            Intrinsics.checkNotNullParameter(date, "date");
            this.name = name;
            this.additionalName = textAtom;
            this.time = time;
            this.date = date;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof StationVO)) {
                return false;
            }
            StationVO stationVO = (StationVO) other;
            return Intrinsics.d(this.name, stationVO.name) && Intrinsics.d(this.additionalName, stationVO.additionalName) && Intrinsics.d(this.time, stationVO.time) && Intrinsics.d(this.date, stationVO.date);
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
            StringBuilder a11 = a.a("StationVO(name=", textAtom, ", additionalName=", textAtom2, ", time=");
            a11.append(textAtom3);
            a11.append(", date=");
            a11.append(textAtom4);
            a11.append(")");
            return a11.toString();
        }
    }

    public RailwayTrainInformationVO(long j11, TextAtom textAtom, TimerDTO timerDTO, PriceInfoVO priceInfoVO, @NotNull List<SegmentVO> segments, TextAtom textAtom2, t tVar) {
        Intrinsics.checkNotNullParameter(segments, "segments");
        this.id = j11;
        this.title = textAtom;
        this.timer = timerDTO;
        this.priceInfo = priceInfoVO;
        this.segments = segments;
        this.localTimeInfo = textAtom2;
        this.viewEvent = tVar;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof RailwayTrainInformationVO)) {
            return false;
        }
        RailwayTrainInformationVO railwayTrainInformationVO = (RailwayTrainInformationVO) other;
        return this.id == railwayTrainInformationVO.id && Intrinsics.d(this.title, railwayTrainInformationVO.title) && Intrinsics.d(this.timer, railwayTrainInformationVO.timer) && Intrinsics.d(this.priceInfo, railwayTrainInformationVO.priceInfo) && Intrinsics.d(this.segments, railwayTrainInformationVO.segments) && Intrinsics.d(this.localTimeInfo, railwayTrainInformationVO.localTimeInfo) && Intrinsics.d(this.viewEvent, railwayTrainInformationVO.viewEvent);
    }

    @Override // l20.c
    public long getId() {
        return this.id;
    }

    public final TextAtom getLocalTimeInfo() {
        return this.localTimeInfo;
    }

    public final PriceInfoVO getPriceInfo() {
        return this.priceInfo;
    }

    @Override // l20.c
    public Integer getScrollWidgetKey() {
        return null;
    }

    @NotNull
    public final List<SegmentVO> getSegments() {
        return this.segments;
    }

    public final TimerDTO getTimer() {
        return this.timer;
    }

    public final TextAtom getTitle() {
        return this.title;
    }

    public final t getViewEvent() {
        return this.viewEvent;
    }

    @Override // l20.c
    public int getViewItemKey() {
        return hashCode();
    }

    public int hashCode() {
        int hashCode = Long.hashCode(this.id) * 31;
        TextAtom textAtom = this.title;
        int hashCode2 = (hashCode + (textAtom == null ? 0 : textAtom.hashCode())) * 31;
        TimerDTO timerDTO = this.timer;
        int hashCode3 = (hashCode2 + (timerDTO == null ? 0 : timerDTO.hashCode())) * 31;
        PriceInfoVO priceInfoVO = this.priceInfo;
        int b11 = g.b((hashCode3 + (priceInfoVO == null ? 0 : priceInfoVO.hashCode())) * 31, 31, this.segments);
        TextAtom textAtom2 = this.localTimeInfo;
        int hashCode4 = (b11 + (textAtom2 == null ? 0 : textAtom2.hashCode())) * 31;
        t tVar = this.viewEvent;
        return hashCode4 + (tVar != null ? tVar.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        long j11 = this.id;
        TextAtom textAtom = this.title;
        TimerDTO timerDTO = this.timer;
        PriceInfoVO priceInfoVO = this.priceInfo;
        List<SegmentVO> list = this.segments;
        TextAtom textAtom2 = this.localTimeInfo;
        t tVar = this.viewEvent;
        StringBuilder c11 = C2639a.c("RailwayTrainInformationVO(id=", j11, ", title=", textAtom);
        c11.append(", timer=");
        c11.append(timerDTO);
        c11.append(", priceInfo=");
        c11.append(priceInfoVO);
        c11.append(", segments=");
        c11.append(list);
        c11.append(", localTimeInfo=");
        c11.append(textAtom2);
        return Lh.a.b(c11, ", viewEvent=", tVar, ")");
    }
}
