package ru.ozon.app.android.travel.feature.railway.widgets.travelRailwaySearchResults.v3.presentation.train;

import D3.g;
import Fm.C3051a;
import Gl.C3124a;
import Kk.C3532b;
import Ns.b;
import Tz.C4055a;
import WZ.t;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import l20.c;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.composer.widgets.v2.onboarding.data.OnBoardingDTO;
import ru.ozon.app.android.storefront.widgets.feedback.result.data.ResultDTO;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.data.controls.button.IconButtonV3DTO;
import ru.ozon.uni.atoms.data.dsBadge.BadgeDTO;
import ru.ozon.uni.atoms.data.icon.IconDTO;
import ru.ozon.uni.atoms.data.price.PriceDTO;
import ru.ozon.uni.atoms.data.text.TextDTO;

@Metadata(d1 = {"\u0000t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b(\b\u0081\b\u0018\u00002\u00060\u0001j\u0002`\u0002:\u0003KLMB\u0099\u0001\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\u0005\u0012\u0006\u0010\u0010\u001a\u00020\b\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0006\u0012\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u0005\u0012\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014\u0012\u0006\u0010\u0017\u001a\u00020\u0016\u0012\b\u0010\u0018\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\u001a\u001a\u0004\u0018\u00010\u0019\u0012\u000e\u0010\u001d\u001a\n\u0018\u00010\u001bj\u0004\u0018\u0001`\u001c¢\u0006\u0004\b\u001e\u0010\u001fJ\u0010\u0010!\u001a\u00020 HÖ\u0001¢\u0006\u0004\b!\u0010\"J\u0010\u0010$\u001a\u00020#HÖ\u0001¢\u0006\u0004\b$\u0010%J\u001a\u0010(\u001a\u00020\b2\b\u0010'\u001a\u0004\u0018\u00010&HÖ\u0003¢\u0006\u0004\b(\u0010)R\u001a\u0010\u0004\u001a\u00020\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0004\u0010*\u001a\u0004\b+\u0010,R\u001d\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0006¢\u0006\f\n\u0004\b\u0007\u0010-\u001a\u0004\b.\u0010/R\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\t\u00100\u001a\u0004\b1\u00102R\u0017\u0010\u000b\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b\u000b\u00103\u001a\u0004\b4\u00105R\u0017\u0010\r\u001a\u00020\f8\u0006¢\u0006\f\n\u0004\b\r\u00106\u001a\u0004\b7\u00108R\u001d\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\u00058\u0006¢\u0006\f\n\u0004\b\u000f\u0010-\u001a\u0004\b9\u0010/R\u0017\u0010\u0010\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\u0010\u00100\u001a\u0004\b\u0010\u00102R\u0019\u0010\u0011\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\u0011\u0010:\u001a\u0004\b;\u0010<R\u001d\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u00058\u0006¢\u0006\f\n\u0004\b\u0013\u0010-\u001a\u0004\b=\u0010/R\u0019\u0010\u0015\u001a\u0004\u0018\u00010\u00148\u0006¢\u0006\f\n\u0004\b\u0015\u0010>\u001a\u0004\b?\u0010@R\u0017\u0010\u0017\u001a\u00020\u00168\u0006¢\u0006\f\n\u0004\b\u0017\u0010A\u001a\u0004\bB\u0010CR\u0019\u0010\u0018\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\u0018\u0010:\u001a\u0004\bD\u0010<R\u0019\u0010\u001a\u001a\u0004\u0018\u00010\u00198\u0006¢\u0006\f\n\u0004\b\u001a\u0010E\u001a\u0004\bF\u0010GR\u001f\u0010\u001d\u001a\n\u0018\u00010\u001bj\u0004\u0018\u0001`\u001c8\u0006¢\u0006\f\n\u0004\b\u001d\u0010H\u001a\u0004\bI\u0010J¨\u0006N"}, d2 = {"Lru/ozon/app/android/travel/feature/railway/widgets/travelRailwaySearchResults/v3/presentation/train/TravelRailwaySearchResultsV3TrainVO;", "Ll20/c;", "Lru/ozon/app/android/composer/view/ViewObject;", "", "id", "", "Lru/ozon/uni/atoms/data/dsBadge/BadgeDTO;", "promotionBadges", "", "hasBadges", "Lru/ozon/app/android/travel/feature/railway/widgets/travelRailwaySearchResults/v3/presentation/train/TravelRailwaySearchResultsV3TrainVO$TrainInfo;", "trainInfo", "Lru/ozon/app/android/travel/feature/railway/widgets/travelRailwaySearchResults/v3/presentation/train/TravelRailwaySearchResultsV3TrainVO$TimeInfo;", "timeInfo", "Lru/ozon/uni/atoms/data/controls/button/IconButtonV3DTO;", ResultDTO.CONTENT_TYPE_SERVICES, "isServiceVisible", "notificationBadge", "Lru/ozon/app/android/travel/feature/railway/widgets/travelRailwaySearchResults/v3/presentation/train/TravelRailwaySearchResultsV3TrainVO$CarriageTypeVO;", "carriageTypes", "Lru/ozon/uni/atoms/af/AtomAction;", "selectTrainAction", "Lru/ozon/uni/atoms/data/price/PriceDTO;", "price", "milesBadge", "Lru/ozon/app/android/composer/widgets/v2/onboarding/data/OnBoardingDTO;", "onboardingApp", "LWZ/t;", "Lru/ozon/app/android/analytics/modules/tokenized/TokenizedEvent;", "viewTokenizedEvent", "<init>", "(JLjava/util/List;ZLru/ozon/app/android/travel/feature/railway/widgets/travelRailwaySearchResults/v3/presentation/train/TravelRailwaySearchResultsV3TrainVO$TrainInfo;Lru/ozon/app/android/travel/feature/railway/widgets/travelRailwaySearchResults/v3/presentation/train/TravelRailwaySearchResultsV3TrainVO$TimeInfo;Ljava/util/List;ZLru/ozon/uni/atoms/data/dsBadge/BadgeDTO;Ljava/util/List;Lru/ozon/uni/atoms/af/AtomAction;Lru/ozon/uni/atoms/data/price/PriceDTO;Lru/ozon/uni/atoms/data/dsBadge/BadgeDTO;Lru/ozon/app/android/composer/widgets/v2/onboarding/data/OnBoardingDTO;LWZ/t;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "J", "getId", "()J", "Ljava/util/List;", "getPromotionBadges", "()Ljava/util/List;", "Z", "getHasBadges", "()Z", "Lru/ozon/app/android/travel/feature/railway/widgets/travelRailwaySearchResults/v3/presentation/train/TravelRailwaySearchResultsV3TrainVO$TrainInfo;", "getTrainInfo", "()Lru/ozon/app/android/travel/feature/railway/widgets/travelRailwaySearchResults/v3/presentation/train/TravelRailwaySearchResultsV3TrainVO$TrainInfo;", "Lru/ozon/app/android/travel/feature/railway/widgets/travelRailwaySearchResults/v3/presentation/train/TravelRailwaySearchResultsV3TrainVO$TimeInfo;", "getTimeInfo", "()Lru/ozon/app/android/travel/feature/railway/widgets/travelRailwaySearchResults/v3/presentation/train/TravelRailwaySearchResultsV3TrainVO$TimeInfo;", "getServices", "Lru/ozon/uni/atoms/data/dsBadge/BadgeDTO;", "getNotificationBadge", "()Lru/ozon/uni/atoms/data/dsBadge/BadgeDTO;", "getCarriageTypes", "Lru/ozon/uni/atoms/af/AtomAction;", "getSelectTrainAction", "()Lru/ozon/uni/atoms/af/AtomAction;", "Lru/ozon/uni/atoms/data/price/PriceDTO;", "getPrice", "()Lru/ozon/uni/atoms/data/price/PriceDTO;", "getMilesBadge", "Lru/ozon/app/android/composer/widgets/v2/onboarding/data/OnBoardingDTO;", "getOnboardingApp", "()Lru/ozon/app/android/composer/widgets/v2/onboarding/data/OnBoardingDTO;", "LWZ/t;", "getViewTokenizedEvent", "()LWZ/t;", "CarriageTypeVO", "TrainInfo", "TimeInfo", "railway_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class TravelRailwaySearchResultsV3TrainVO implements c {

    @NotNull
    private final List<CarriageTypeVO> carriageTypes;
    private final boolean hasBadges;
    private final long id;
    private final boolean isServiceVisible;
    private final BadgeDTO milesBadge;
    private final BadgeDTO notificationBadge;
    private final OnBoardingDTO onboardingApp;

    @NotNull
    private final PriceDTO price;

    @NotNull
    private final List<BadgeDTO> promotionBadges;
    private final AtomAction selectTrainAction;

    @NotNull
    private final List<IconButtonV3DTO> services;

    @NotNull
    private final TimeInfo timeInfo;

    @NotNull
    private final TrainInfo trainInfo;
    private final t viewTokenizedEvent;

    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\f\b\u0087\b\u0018\u00002\u00020\u0001B)\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0014\u001a\u0004\b\u0015\u0010\u000fR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u0017\u0010\u0006\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0016\u001a\u0004\b\u0019\u0010\u0018R\u0019\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010\u001a\u001a\u0004\b\u001b\u0010\u001c¨\u0006\u001d"}, d2 = {"Lru/ozon/app/android/travel/feature/railway/widgets/travelRailwaySearchResults/v3/presentation/train/TravelRailwaySearchResultsV3TrainVO$CarriageTypeVO;", "", "", "id", "Lru/ozon/uni/atoms/data/text/TextDTO;", "typeName", "seatsCount", "Lru/ozon/uni/atoms/data/price/PriceDTO;", "typePrice", "<init>", "(ILru/ozon/uni/atoms/data/text/TextDTO;Lru/ozon/uni/atoms/data/text/TextDTO;Lru/ozon/uni/atoms/data/price/PriceDTO;)V", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "I", "getId", "Lru/ozon/uni/atoms/data/text/TextDTO;", "getTypeName", "()Lru/ozon/uni/atoms/data/text/TextDTO;", "getSeatsCount", "Lru/ozon/uni/atoms/data/price/PriceDTO;", "getTypePrice", "()Lru/ozon/uni/atoms/data/price/PriceDTO;", "railway_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class CarriageTypeVO {
        public static final int $stable = PriceDTO.$stable;
        private final int id;

        @NotNull
        private final TextDTO seatsCount;

        @NotNull
        private final TextDTO typeName;
        private final PriceDTO typePrice;

        public CarriageTypeVO(int i11, @NotNull TextDTO typeName, @NotNull TextDTO seatsCount, PriceDTO priceDTO) {
            Intrinsics.checkNotNullParameter(typeName, "typeName");
            Intrinsics.checkNotNullParameter(seatsCount, "seatsCount");
            this.id = i11;
            this.typeName = typeName;
            this.seatsCount = seatsCount;
            this.typePrice = priceDTO;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof CarriageTypeVO)) {
                return false;
            }
            CarriageTypeVO carriageTypeVO = (CarriageTypeVO) other;
            return this.id == carriageTypeVO.id && Intrinsics.d(this.typeName, carriageTypeVO.typeName) && Intrinsics.d(this.seatsCount, carriageTypeVO.seatsCount) && Intrinsics.d(this.typePrice, carriageTypeVO.typePrice);
        }

        public final int getId() {
            return this.id;
        }

        @NotNull
        public final TextDTO getSeatsCount() {
            return this.seatsCount;
        }

        @NotNull
        public final TextDTO getTypeName() {
            return this.typeName;
        }

        public final PriceDTO getTypePrice() {
            return this.typePrice;
        }

        public int hashCode() {
            int a11 = b.a(this.seatsCount, b.a(this.typeName, Integer.hashCode(this.id) * 31, 31), 31);
            PriceDTO priceDTO = this.typePrice;
            return a11 + (priceDTO == null ? 0 : priceDTO.hashCode());
        }

        @NotNull
        public String toString() {
            int i11 = this.id;
            TextDTO textDTO = this.typeName;
            TextDTO textDTO2 = this.seatsCount;
            PriceDTO priceDTO = this.typePrice;
            StringBuilder b11 = C4055a.b(textDTO, "CarriageTypeVO(id=", ", typeName=", ", seatsCount=", i11);
            b11.append(textDTO2);
            b11.append(", typePrice=");
            b11.append(priceDTO);
            b11.append(")");
            return b11.toString();
        }
    }

    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\t\b\u0087\b\u0018\u00002\u00020\u0001B)\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0013\u001a\u0004\b\u0016\u0010\u0015R\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0013\u001a\u0004\b\u0017\u0010\u0015R\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0013\u001a\u0004\b\u0018\u0010\u0015¨\u0006\u0019"}, d2 = {"Lru/ozon/app/android/travel/feature/railway/widgets/travelRailwaySearchResults/v3/presentation/train/TravelRailwaySearchResultsV3TrainVO$TimeInfo;", "", "Lru/ozon/uni/atoms/data/text/TextDTO;", "travelTime", "travelTimeCaption", "departureArrivalTimes", "dayDifference", "<init>", "(Lru/ozon/uni/atoms/data/text/TextDTO;Lru/ozon/uni/atoms/data/text/TextDTO;Lru/ozon/uni/atoms/data/text/TextDTO;Lru/ozon/uni/atoms/data/text/TextDTO;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lru/ozon/uni/atoms/data/text/TextDTO;", "getTravelTime", "()Lru/ozon/uni/atoms/data/text/TextDTO;", "getTravelTimeCaption", "getDepartureArrivalTimes", "getDayDifference", "railway_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class TimeInfo {
        private final TextDTO dayDifference;

        @NotNull
        private final TextDTO departureArrivalTimes;

        @NotNull
        private final TextDTO travelTime;

        @NotNull
        private final TextDTO travelTimeCaption;

        public TimeInfo(@NotNull TextDTO travelTime, @NotNull TextDTO travelTimeCaption, @NotNull TextDTO departureArrivalTimes, TextDTO textDTO) {
            Intrinsics.checkNotNullParameter(travelTime, "travelTime");
            Intrinsics.checkNotNullParameter(travelTimeCaption, "travelTimeCaption");
            Intrinsics.checkNotNullParameter(departureArrivalTimes, "departureArrivalTimes");
            this.travelTime = travelTime;
            this.travelTimeCaption = travelTimeCaption;
            this.departureArrivalTimes = departureArrivalTimes;
            this.dayDifference = textDTO;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof TimeInfo)) {
                return false;
            }
            TimeInfo timeInfo = (TimeInfo) other;
            return Intrinsics.d(this.travelTime, timeInfo.travelTime) && Intrinsics.d(this.travelTimeCaption, timeInfo.travelTimeCaption) && Intrinsics.d(this.departureArrivalTimes, timeInfo.departureArrivalTimes) && Intrinsics.d(this.dayDifference, timeInfo.dayDifference);
        }

        public final TextDTO getDayDifference() {
            return this.dayDifference;
        }

        @NotNull
        public final TextDTO getDepartureArrivalTimes() {
            return this.departureArrivalTimes;
        }

        @NotNull
        public final TextDTO getTravelTime() {
            return this.travelTime;
        }

        @NotNull
        public final TextDTO getTravelTimeCaption() {
            return this.travelTimeCaption;
        }

        public int hashCode() {
            int a11 = b.a(this.departureArrivalTimes, b.a(this.travelTimeCaption, this.travelTime.hashCode() * 31, 31), 31);
            TextDTO textDTO = this.dayDifference;
            return a11 + (textDTO == null ? 0 : textDTO.hashCode());
        }

        @NotNull
        public String toString() {
            TextDTO textDTO = this.travelTime;
            TextDTO textDTO2 = this.travelTimeCaption;
            TextDTO textDTO3 = this.departureArrivalTimes;
            TextDTO textDTO4 = this.dayDifference;
            StringBuilder g10 = g.g("TimeInfo(travelTime=", textDTO, ", travelTimeCaption=", textDTO2, ", departureArrivalTimes=");
            g10.append(textDTO3);
            g10.append(", dayDifference=");
            g10.append(textDTO4);
            g10.append(")");
            return g10.toString();
        }
    }

    @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u000e\b\u0087\b\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\u0004\u0012\u0006\u0010\t\u001a\u00020\u0004¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR\u0017\u0010\b\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\b\u0010\u0019\u001a\u0004\b\u001f\u0010\u001bR\u0017\u0010\t\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\t\u0010\u0019\u001a\u0004\b \u0010\u001b¨\u0006!"}, d2 = {"Lru/ozon/app/android/travel/feature/railway/widgets/travelRailwaySearchResults/v3/presentation/train/TravelRailwaySearchResultsV3TrainVO$TrainInfo;", "", "Lru/ozon/uni/atoms/data/icon/IconDTO;", "trainIcon", "Lru/ozon/uni/atoms/data/text/TextDTO;", "trainName", "Lru/ozon/uni/atoms/data/dsBadge/BadgeDTO;", "route", "departureStation", "arrivalStation", "<init>", "(Lru/ozon/uni/atoms/data/icon/IconDTO;Lru/ozon/uni/atoms/data/text/TextDTO;Lru/ozon/uni/atoms/data/dsBadge/BadgeDTO;Lru/ozon/uni/atoms/data/text/TextDTO;Lru/ozon/uni/atoms/data/text/TextDTO;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lru/ozon/uni/atoms/data/icon/IconDTO;", "getTrainIcon", "()Lru/ozon/uni/atoms/data/icon/IconDTO;", "Lru/ozon/uni/atoms/data/text/TextDTO;", "getTrainName", "()Lru/ozon/uni/atoms/data/text/TextDTO;", "Lru/ozon/uni/atoms/data/dsBadge/BadgeDTO;", "getRoute", "()Lru/ozon/uni/atoms/data/dsBadge/BadgeDTO;", "getDepartureStation", "getArrivalStation", "railway_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class TrainInfo {
        public static final int $stable = IconDTO.$stable;

        @NotNull
        private final TextDTO arrivalStation;

        @NotNull
        private final TextDTO departureStation;

        @NotNull
        private final BadgeDTO route;

        @NotNull
        private final IconDTO trainIcon;

        @NotNull
        private final TextDTO trainName;

        public TrainInfo(@NotNull IconDTO trainIcon, @NotNull TextDTO trainName, @NotNull BadgeDTO route, @NotNull TextDTO departureStation, @NotNull TextDTO arrivalStation) {
            Intrinsics.checkNotNullParameter(trainIcon, "trainIcon");
            Intrinsics.checkNotNullParameter(trainName, "trainName");
            Intrinsics.checkNotNullParameter(route, "route");
            Intrinsics.checkNotNullParameter(departureStation, "departureStation");
            Intrinsics.checkNotNullParameter(arrivalStation, "arrivalStation");
            this.trainIcon = trainIcon;
            this.trainName = trainName;
            this.route = route;
            this.departureStation = departureStation;
            this.arrivalStation = arrivalStation;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof TrainInfo)) {
                return false;
            }
            TrainInfo trainInfo = (TrainInfo) other;
            return Intrinsics.d(this.trainIcon, trainInfo.trainIcon) && Intrinsics.d(this.trainName, trainInfo.trainName) && Intrinsics.d(this.route, trainInfo.route) && Intrinsics.d(this.departureStation, trainInfo.departureStation) && Intrinsics.d(this.arrivalStation, trainInfo.arrivalStation);
        }

        @NotNull
        public final TextDTO getArrivalStation() {
            return this.arrivalStation;
        }

        @NotNull
        public final TextDTO getDepartureStation() {
            return this.departureStation;
        }

        @NotNull
        public final BadgeDTO getRoute() {
            return this.route;
        }

        @NotNull
        public final IconDTO getTrainIcon() {
            return this.trainIcon;
        }

        @NotNull
        public final TextDTO getTrainName() {
            return this.trainName;
        }

        public int hashCode() {
            return this.arrivalStation.hashCode() + b.a(this.departureStation, C3124a.c(this.route, b.a(this.trainName, this.trainIcon.hashCode() * 31, 31), 31), 31);
        }

        @NotNull
        public String toString() {
            IconDTO iconDTO = this.trainIcon;
            TextDTO textDTO = this.trainName;
            BadgeDTO badgeDTO = this.route;
            TextDTO textDTO2 = this.departureStation;
            TextDTO textDTO3 = this.arrivalStation;
            StringBuilder i11 = Bi.b.i("TrainInfo(trainIcon=", ", trainName=", ", route=", iconDTO, textDTO);
            i11.append(badgeDTO);
            i11.append(", departureStation=");
            i11.append(textDTO2);
            i11.append(", arrivalStation=");
            return Tl.b.e(i11, textDTO3, ")");
        }
    }

    public TravelRailwaySearchResultsV3TrainVO(long j11, @NotNull List<BadgeDTO> promotionBadges, boolean z11, @NotNull TrainInfo trainInfo, @NotNull TimeInfo timeInfo, @NotNull List<IconButtonV3DTO> services, boolean z12, BadgeDTO badgeDTO, @NotNull List<CarriageTypeVO> carriageTypes, AtomAction atomAction, @NotNull PriceDTO price, BadgeDTO badgeDTO2, OnBoardingDTO onBoardingDTO, t tVar) {
        Intrinsics.checkNotNullParameter(promotionBadges, "promotionBadges");
        Intrinsics.checkNotNullParameter(trainInfo, "trainInfo");
        Intrinsics.checkNotNullParameter(timeInfo, "timeInfo");
        Intrinsics.checkNotNullParameter(services, "services");
        Intrinsics.checkNotNullParameter(carriageTypes, "carriageTypes");
        Intrinsics.checkNotNullParameter(price, "price");
        this.id = j11;
        this.promotionBadges = promotionBadges;
        this.hasBadges = z11;
        this.trainInfo = trainInfo;
        this.timeInfo = timeInfo;
        this.services = services;
        this.isServiceVisible = z12;
        this.notificationBadge = badgeDTO;
        this.carriageTypes = carriageTypes;
        this.selectTrainAction = atomAction;
        this.price = price;
        this.milesBadge = badgeDTO2;
        this.onboardingApp = onBoardingDTO;
        this.viewTokenizedEvent = tVar;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof TravelRailwaySearchResultsV3TrainVO)) {
            return false;
        }
        TravelRailwaySearchResultsV3TrainVO travelRailwaySearchResultsV3TrainVO = (TravelRailwaySearchResultsV3TrainVO) other;
        return this.id == travelRailwaySearchResultsV3TrainVO.id && Intrinsics.d(this.promotionBadges, travelRailwaySearchResultsV3TrainVO.promotionBadges) && this.hasBadges == travelRailwaySearchResultsV3TrainVO.hasBadges && Intrinsics.d(this.trainInfo, travelRailwaySearchResultsV3TrainVO.trainInfo) && Intrinsics.d(this.timeInfo, travelRailwaySearchResultsV3TrainVO.timeInfo) && Intrinsics.d(this.services, travelRailwaySearchResultsV3TrainVO.services) && this.isServiceVisible == travelRailwaySearchResultsV3TrainVO.isServiceVisible && Intrinsics.d(this.notificationBadge, travelRailwaySearchResultsV3TrainVO.notificationBadge) && Intrinsics.d(this.carriageTypes, travelRailwaySearchResultsV3TrainVO.carriageTypes) && Intrinsics.d(this.selectTrainAction, travelRailwaySearchResultsV3TrainVO.selectTrainAction) && Intrinsics.d(this.price, travelRailwaySearchResultsV3TrainVO.price) && Intrinsics.d(this.milesBadge, travelRailwaySearchResultsV3TrainVO.milesBadge) && Intrinsics.d(this.onboardingApp, travelRailwaySearchResultsV3TrainVO.onboardingApp) && Intrinsics.d(this.viewTokenizedEvent, travelRailwaySearchResultsV3TrainVO.viewTokenizedEvent);
    }

    @NotNull
    public final List<CarriageTypeVO> getCarriageTypes() {
        return this.carriageTypes;
    }

    public final boolean getHasBadges() {
        return this.hasBadges;
    }

    @Override // l20.c
    public long getId() {
        return this.id;
    }

    public final BadgeDTO getMilesBadge() {
        return this.milesBadge;
    }

    public final BadgeDTO getNotificationBadge() {
        return this.notificationBadge;
    }

    public final OnBoardingDTO getOnboardingApp() {
        return this.onboardingApp;
    }

    @NotNull
    public final PriceDTO getPrice() {
        return this.price;
    }

    @NotNull
    public final List<BadgeDTO> getPromotionBadges() {
        return this.promotionBadges;
    }

    @Override // l20.c
    public Integer getScrollWidgetKey() {
        return null;
    }

    public final AtomAction getSelectTrainAction() {
        return this.selectTrainAction;
    }

    @NotNull
    public final List<IconButtonV3DTO> getServices() {
        return this.services;
    }

    @NotNull
    public final TimeInfo getTimeInfo() {
        return this.timeInfo;
    }

    @NotNull
    public final TrainInfo getTrainInfo() {
        return this.trainInfo;
    }

    @Override // l20.c
    public int getViewItemKey() {
        return hashCode();
    }

    public final t getViewTokenizedEvent() {
        return this.viewTokenizedEvent;
    }

    public int hashCode() {
        int a11 = C3532b.a(G.g.b((this.timeInfo.hashCode() + ((this.trainInfo.hashCode() + C3532b.a(G.g.b(Long.hashCode(this.id) * 31, 31, this.promotionBadges), 31, this.hasBadges)) * 31)) * 31, 31, this.services), 31, this.isServiceVisible);
        BadgeDTO badgeDTO = this.notificationBadge;
        int b11 = G.g.b((a11 + (badgeDTO == null ? 0 : badgeDTO.hashCode())) * 31, 31, this.carriageTypes);
        AtomAction atomAction = this.selectTrainAction;
        int b12 = C3051a.b(this.price, (b11 + (atomAction == null ? 0 : atomAction.hashCode())) * 31, 31);
        BadgeDTO badgeDTO2 = this.milesBadge;
        int hashCode = (b12 + (badgeDTO2 == null ? 0 : badgeDTO2.hashCode())) * 31;
        OnBoardingDTO onBoardingDTO = this.onboardingApp;
        int hashCode2 = (hashCode + (onBoardingDTO == null ? 0 : onBoardingDTO.hashCode())) * 31;
        t tVar = this.viewTokenizedEvent;
        return hashCode2 + (tVar != null ? tVar.hashCode() : 0);
    }

    /* renamed from: isServiceVisible, reason: from getter */
    public final boolean getIsServiceVisible() {
        return this.isServiceVisible;
    }

    @NotNull
    public String toString() {
        long j11 = this.id;
        List<BadgeDTO> list = this.promotionBadges;
        boolean z11 = this.hasBadges;
        TrainInfo trainInfo = this.trainInfo;
        TimeInfo timeInfo = this.timeInfo;
        List<IconButtonV3DTO> list2 = this.services;
        boolean z12 = this.isServiceVisible;
        BadgeDTO badgeDTO = this.notificationBadge;
        List<CarriageTypeVO> list3 = this.carriageTypes;
        AtomAction atomAction = this.selectTrainAction;
        PriceDTO priceDTO = this.price;
        BadgeDTO badgeDTO2 = this.milesBadge;
        OnBoardingDTO onBoardingDTO = this.onboardingApp;
        t tVar = this.viewTokenizedEvent;
        StringBuilder b11 = Lh.b.b(j11, "TravelRailwaySearchResultsV3TrainVO(id=", ", promotionBadges=", list);
        b11.append(", hasBadges=");
        b11.append(z11);
        b11.append(", trainInfo=");
        b11.append(trainInfo);
        b11.append(", timeInfo=");
        b11.append(timeInfo);
        b11.append(", services=");
        b11.append(list2);
        b11.append(", isServiceVisible=");
        b11.append(z12);
        b11.append(", notificationBadge=");
        b11.append(badgeDTO);
        b11.append(", carriageTypes=");
        b11.append(list3);
        b11.append(", selectTrainAction=");
        b11.append(atomAction);
        b11.append(", price=");
        b11.append(priceDTO);
        b11.append(", milesBadge=");
        b11.append(badgeDTO2);
        b11.append(", onboardingApp=");
        b11.append(onBoardingDTO);
        b11.append(", viewTokenizedEvent=");
        b11.append(tVar);
        b11.append(")");
        return b11.toString();
    }
}
