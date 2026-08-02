package ru.ozon.app.android.travel.feature.railway.widgets.travelRailwaySearchResults.v4.presentation.train;

import D3.g;
import Fm.C3051a;
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
import ru.ozon.app.android.partpayment.formpage.data.FormPageDTO;
import ru.ozon.app.android.storefront.widgets.feedback.result.data.ResultDTO;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.data.controls.button.ButtonV3DTO;
import ru.ozon.uni.atoms.data.controls.button.IconButtonV3DTO;
import ru.ozon.uni.atoms.data.dsBadge.BadgeDTO;
import ru.ozon.uni.atoms.data.icon.IconDTO;
import ru.ozon.uni.atoms.data.price.PriceDTO;
import ru.ozon.uni.atoms.data.text.TextDTO;

@Metadata(d1 = {"\u0000|\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b)\b\u0081\b\u0018\u00002\u00060\u0001j\u0002`\u0002:\u0004PQRSBÍ\u0001\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\u0005\u0012\u0006\u0010\u0010\u001a\u00020\b\u0012\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00110\u0005\u0012\u0006\u0010\u0013\u001a\u00020\b\u0012\b\u0010\u0014\u001a\u0004\u0018\u00010\u0006\u0012\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00150\u0005\u0012\u0006\u0010\u0017\u001a\u00020\b\u0012\b\u0010\u0019\u001a\u0004\u0018\u00010\u0018\u0012\u0006\u0010\u001b\u001a\u00020\u001a\u0012\b\u0010\u001c\u001a\u0004\u0018\u00010\u0006\u0012\u000e\u0010\u001e\u001a\n\u0012\u0004\u0012\u00020\u001d\u0018\u00010\u0005\u0012\u000e\u0010 \u001a\n\u0012\u0004\u0012\u00020\u001f\u0018\u00010\u0005\u0012\u000e\u0010#\u001a\n\u0018\u00010!j\u0004\u0018\u0001`\"¢\u0006\u0004\b$\u0010%J\u0010\u0010&\u001a\u00020\u001fHÖ\u0001¢\u0006\u0004\b&\u0010'J\u0010\u0010)\u001a\u00020(HÖ\u0001¢\u0006\u0004\b)\u0010*J\u001a\u0010-\u001a\u00020\b2\b\u0010,\u001a\u0004\u0018\u00010+HÖ\u0003¢\u0006\u0004\b-\u0010.R\u001a\u0010\u0004\u001a\u00020\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0004\u0010/\u001a\u0004\b0\u00101R\u001d\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0006¢\u0006\f\n\u0004\b\u0007\u00102\u001a\u0004\b3\u00104R\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\t\u00105\u001a\u0004\b6\u00107R\u0017\u0010\u000b\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b\u000b\u00108\u001a\u0004\b9\u0010:R\u0017\u0010\r\u001a\u00020\f8\u0006¢\u0006\f\n\u0004\b\r\u0010;\u001a\u0004\b<\u0010=R\u001d\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\u00058\u0006¢\u0006\f\n\u0004\b\u000f\u00102\u001a\u0004\b>\u00104R\u0017\u0010\u0010\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\u0010\u00105\u001a\u0004\b\u0010\u00107R\u001d\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00110\u00058\u0006¢\u0006\f\n\u0004\b\u0012\u00102\u001a\u0004\b?\u00104R\u0017\u0010\u0013\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\u0013\u00105\u001a\u0004\b\u0013\u00107R\u0019\u0010\u0014\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\u0014\u0010@\u001a\u0004\bA\u0010BR\u001d\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00150\u00058\u0006¢\u0006\f\n\u0004\b\u0016\u00102\u001a\u0004\bC\u00104R\u0017\u0010\u0017\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\u0017\u00105\u001a\u0004\b\u0017\u00107R\u0019\u0010\u0019\u001a\u0004\u0018\u00010\u00188\u0006¢\u0006\f\n\u0004\b\u0019\u0010D\u001a\u0004\bE\u0010FR\u0017\u0010\u001b\u001a\u00020\u001a8\u0006¢\u0006\f\n\u0004\b\u001b\u0010G\u001a\u0004\bH\u0010IR\u0019\u0010\u001c\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\u001c\u0010@\u001a\u0004\bJ\u0010BR\u001f\u0010\u001e\u001a\n\u0012\u0004\u0012\u00020\u001d\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b\u001e\u00102\u001a\u0004\bK\u00104R\u001f\u0010 \u001a\n\u0012\u0004\u0012\u00020\u001f\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b \u00102\u001a\u0004\bL\u00104R\u001f\u0010#\u001a\n\u0018\u00010!j\u0004\u0018\u0001`\"8\u0006¢\u0006\f\n\u0004\b#\u0010M\u001a\u0004\bN\u0010O¨\u0006T"}, d2 = {"Lru/ozon/app/android/travel/feature/railway/widgets/travelRailwaySearchResults/v4/presentation/train/TravelRailwaySearchResultsV4TrainVO;", "Ll20/c;", "Lru/ozon/app/android/composer/view/ViewObject;", "", "id", "", "Lru/ozon/uni/atoms/data/dsBadge/BadgeDTO;", "promotionBadges", "", "hasBadges", "Lru/ozon/app/android/travel/feature/railway/widgets/travelRailwaySearchResults/v4/presentation/train/TravelRailwaySearchResultsV4TrainVO$TrainSummaryVO;", FormPageDTO.Field.FIELD_TYPE_SUMMARY, "Lru/ozon/app/android/travel/feature/railway/widgets/travelRailwaySearchResults/v4/presentation/train/TravelRailwaySearchResultsV4TrainVO$TimeInfoVO;", "timeInfo", "Lru/ozon/app/android/travel/feature/railway/widgets/travelRailwaySearchResults/v4/presentation/train/TravelRailwaySearchResultsV4TrainVO$RouteInfoVO;", "routeInfo", "isRouteInfoVisible", "Lru/ozon/uni/atoms/data/controls/button/IconButtonV3DTO;", ResultDTO.CONTENT_TYPE_SERVICES, "isServiceVisible", "notificationBadge", "Lru/ozon/app/android/travel/feature/railway/widgets/travelRailwaySearchResults/v4/presentation/train/TravelRailwaySearchResultsV4TrainVO$CarriageTypeVO;", "carriageTypes", "isCarriageTypesVisible", "Lru/ozon/uni/atoms/af/AtomAction;", "selectTrainAction", "Lru/ozon/uni/atoms/data/price/PriceDTO;", "price", "milesBadge", "Lru/ozon/app/android/composer/widgets/v2/onboarding/data/OnBoardingDTO;", "onboardingApp", "", "allOnboardingKeys", "LWZ/t;", "Lru/ozon/app/android/analytics/modules/tokenized/TokenizedEvent;", "viewTokenizedEvent", "<init>", "(JLjava/util/List;ZLru/ozon/app/android/travel/feature/railway/widgets/travelRailwaySearchResults/v4/presentation/train/TravelRailwaySearchResultsV4TrainVO$TrainSummaryVO;Lru/ozon/app/android/travel/feature/railway/widgets/travelRailwaySearchResults/v4/presentation/train/TravelRailwaySearchResultsV4TrainVO$TimeInfoVO;Ljava/util/List;ZLjava/util/List;ZLru/ozon/uni/atoms/data/dsBadge/BadgeDTO;Ljava/util/List;ZLru/ozon/uni/atoms/af/AtomAction;Lru/ozon/uni/atoms/data/price/PriceDTO;Lru/ozon/uni/atoms/data/dsBadge/BadgeDTO;Ljava/util/List;Ljava/util/List;LWZ/t;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "J", "getId", "()J", "Ljava/util/List;", "getPromotionBadges", "()Ljava/util/List;", "Z", "getHasBadges", "()Z", "Lru/ozon/app/android/travel/feature/railway/widgets/travelRailwaySearchResults/v4/presentation/train/TravelRailwaySearchResultsV4TrainVO$TrainSummaryVO;", "getSummary", "()Lru/ozon/app/android/travel/feature/railway/widgets/travelRailwaySearchResults/v4/presentation/train/TravelRailwaySearchResultsV4TrainVO$TrainSummaryVO;", "Lru/ozon/app/android/travel/feature/railway/widgets/travelRailwaySearchResults/v4/presentation/train/TravelRailwaySearchResultsV4TrainVO$TimeInfoVO;", "getTimeInfo", "()Lru/ozon/app/android/travel/feature/railway/widgets/travelRailwaySearchResults/v4/presentation/train/TravelRailwaySearchResultsV4TrainVO$TimeInfoVO;", "getRouteInfo", "getServices", "Lru/ozon/uni/atoms/data/dsBadge/BadgeDTO;", "getNotificationBadge", "()Lru/ozon/uni/atoms/data/dsBadge/BadgeDTO;", "getCarriageTypes", "Lru/ozon/uni/atoms/af/AtomAction;", "getSelectTrainAction", "()Lru/ozon/uni/atoms/af/AtomAction;", "Lru/ozon/uni/atoms/data/price/PriceDTO;", "getPrice", "()Lru/ozon/uni/atoms/data/price/PriceDTO;", "getMilesBadge", "getOnboardingApp", "getAllOnboardingKeys", "LWZ/t;", "getViewTokenizedEvent", "()LWZ/t;", "TrainSummaryVO", "TimeInfoVO", "RouteInfoVO", "CarriageTypeVO", "railway_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class TravelRailwaySearchResultsV4TrainVO implements c {
    private final List<String> allOnboardingKeys;

    @NotNull
    private final List<CarriageTypeVO> carriageTypes;
    private final boolean hasBadges;
    private final long id;
    private final boolean isCarriageTypesVisible;
    private final boolean isRouteInfoVisible;
    private final boolean isServiceVisible;
    private final BadgeDTO milesBadge;
    private final BadgeDTO notificationBadge;
    private final List<OnBoardingDTO> onboardingApp;

    @NotNull
    private final PriceDTO price;

    @NotNull
    private final List<BadgeDTO> promotionBadges;

    @NotNull
    private final List<RouteInfoVO> routeInfo;
    private final AtomAction selectTrainAction;

    @NotNull
    private final List<IconButtonV3DTO> services;

    @NotNull
    private final TrainSummaryVO summary;

    @NotNull
    private final TimeInfoVO timeInfo;
    private final t viewTokenizedEvent;

    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\f\b\u0087\b\u0018\u00002\u00020\u0001B)\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0014\u001a\u0004\b\u0015\u0010\u000fR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u0017\u0010\u0006\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0016\u001a\u0004\b\u0019\u0010\u0018R\u0019\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010\u001a\u001a\u0004\b\u001b\u0010\u001c¨\u0006\u001d"}, d2 = {"Lru/ozon/app/android/travel/feature/railway/widgets/travelRailwaySearchResults/v4/presentation/train/TravelRailwaySearchResultsV4TrainVO$CarriageTypeVO;", "", "", "id", "Lru/ozon/uni/atoms/data/text/TextDTO;", "typeName", "seatsCount", "Lru/ozon/uni/atoms/data/price/PriceDTO;", "typePrice", "<init>", "(ILru/ozon/uni/atoms/data/text/TextDTO;Lru/ozon/uni/atoms/data/text/TextDTO;Lru/ozon/uni/atoms/data/price/PriceDTO;)V", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "I", "getId", "Lru/ozon/uni/atoms/data/text/TextDTO;", "getTypeName", "()Lru/ozon/uni/atoms/data/text/TextDTO;", "getSeatsCount", "Lru/ozon/uni/atoms/data/price/PriceDTO;", "getTypePrice", "()Lru/ozon/uni/atoms/data/price/PriceDTO;", "railway_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
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

    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u000b\b\u0087\b\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0013\u001a\u0004\b\u0014\u0010\u000eR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u0018\u001a\u0004\b\u0019\u0010\u001a¨\u0006\u001b"}, d2 = {"Lru/ozon/app/android/travel/feature/railway/widgets/travelRailwaySearchResults/v4/presentation/train/TravelRailwaySearchResultsV4TrainVO$RouteInfoVO;", "", "", "id", "Lru/ozon/uni/atoms/data/text/TextDTO;", "text", "Lru/ozon/uni/atoms/data/icon/IconDTO;", "icon", "<init>", "(ILru/ozon/uni/atoms/data/text/TextDTO;Lru/ozon/uni/atoms/data/icon/IconDTO;)V", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "I", "getId", "Lru/ozon/uni/atoms/data/text/TextDTO;", "getText", "()Lru/ozon/uni/atoms/data/text/TextDTO;", "Lru/ozon/uni/atoms/data/icon/IconDTO;", "getIcon", "()Lru/ozon/uni/atoms/data/icon/IconDTO;", "railway_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class RouteInfoVO {
        public static final int $stable = IconDTO.$stable;
        private final IconDTO icon;
        private final int id;

        @NotNull
        private final TextDTO text;

        public RouteInfoVO(int i11, @NotNull TextDTO text, IconDTO iconDTO) {
            Intrinsics.checkNotNullParameter(text, "text");
            this.id = i11;
            this.text = text;
            this.icon = iconDTO;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof RouteInfoVO)) {
                return false;
            }
            RouteInfoVO routeInfoVO = (RouteInfoVO) other;
            return this.id == routeInfoVO.id && Intrinsics.d(this.text, routeInfoVO.text) && Intrinsics.d(this.icon, routeInfoVO.icon);
        }

        public final IconDTO getIcon() {
            return this.icon;
        }

        public final int getId() {
            return this.id;
        }

        @NotNull
        public final TextDTO getText() {
            return this.text;
        }

        public int hashCode() {
            int a11 = b.a(this.text, Integer.hashCode(this.id) * 31, 31);
            IconDTO iconDTO = this.icon;
            return a11 + (iconDTO == null ? 0 : iconDTO.hashCode());
        }

        @NotNull
        public String toString() {
            int i11 = this.id;
            TextDTO textDTO = this.text;
            IconDTO iconDTO = this.icon;
            StringBuilder b11 = C4055a.b(textDTO, "RouteInfoVO(id=", ", text=", ", icon=", i11);
            b11.append(iconDTO);
            b11.append(")");
            return b11.toString();
        }
    }

    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\b\b\u0087\b\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0012\u001a\u0004\b\u0015\u0010\u0014R\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0012\u001a\u0004\b\u0016\u0010\u0014¨\u0006\u0017"}, d2 = {"Lru/ozon/app/android/travel/feature/railway/widgets/travelRailwaySearchResults/v4/presentation/train/TravelRailwaySearchResultsV4TrainVO$TimeInfoVO;", "", "Lru/ozon/uni/atoms/data/text/TextDTO;", "departureArrivalTimes", "dayDifference", "travelTime", "<init>", "(Lru/ozon/uni/atoms/data/text/TextDTO;Lru/ozon/uni/atoms/data/text/TextDTO;Lru/ozon/uni/atoms/data/text/TextDTO;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lru/ozon/uni/atoms/data/text/TextDTO;", "getDepartureArrivalTimes", "()Lru/ozon/uni/atoms/data/text/TextDTO;", "getDayDifference", "getTravelTime", "railway_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class TimeInfoVO {
        private final TextDTO dayDifference;

        @NotNull
        private final TextDTO departureArrivalTimes;

        @NotNull
        private final TextDTO travelTime;

        public TimeInfoVO(@NotNull TextDTO departureArrivalTimes, TextDTO textDTO, @NotNull TextDTO travelTime) {
            Intrinsics.checkNotNullParameter(departureArrivalTimes, "departureArrivalTimes");
            Intrinsics.checkNotNullParameter(travelTime, "travelTime");
            this.departureArrivalTimes = departureArrivalTimes;
            this.dayDifference = textDTO;
            this.travelTime = travelTime;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof TimeInfoVO)) {
                return false;
            }
            TimeInfoVO timeInfoVO = (TimeInfoVO) other;
            return Intrinsics.d(this.departureArrivalTimes, timeInfoVO.departureArrivalTimes) && Intrinsics.d(this.dayDifference, timeInfoVO.dayDifference) && Intrinsics.d(this.travelTime, timeInfoVO.travelTime);
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

        public int hashCode() {
            int hashCode = this.departureArrivalTimes.hashCode() * 31;
            TextDTO textDTO = this.dayDifference;
            return this.travelTime.hashCode() + ((hashCode + (textDTO == null ? 0 : textDTO.hashCode())) * 31);
        }

        @NotNull
        public String toString() {
            TextDTO textDTO = this.departureArrivalTimes;
            TextDTO textDTO2 = this.dayDifference;
            return Tl.b.e(g.g("TimeInfoVO(departureArrivalTimes=", textDTO, ", dayDifference=", textDTO2, ", travelTime="), this.travelTime, ")");
        }
    }

    @Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\n\b\u0087\b\u0018\u00002\u00020\u0001B+\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0002\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014R\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0015\u001a\u0004\b\u0018\u0010\u0017R\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010\u0019\u001a\u0004\b\u001a\u0010\u001b¨\u0006\u001c"}, d2 = {"Lru/ozon/app/android/travel/feature/railway/widgets/travelRailwaySearchResults/v4/presentation/train/TravelRailwaySearchResultsV4TrainVO$TrainSummaryVO;", "", "", "Lru/ozon/uni/atoms/data/icon/IconDTO;", "trainIcons", "Lru/ozon/uni/atoms/data/text/TextDTO;", "trainNames", "Lru/ozon/uni/atoms/data/controls/button/ButtonV3DTO;", "routeButton", "<init>", "(Ljava/util/List;Ljava/util/List;Lru/ozon/uni/atoms/data/controls/button/ButtonV3DTO;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/util/List;", "getTrainIcons", "()Ljava/util/List;", "getTrainNames", "Lru/ozon/uni/atoms/data/controls/button/ButtonV3DTO;", "getRouteButton", "()Lru/ozon/uni/atoms/data/controls/button/ButtonV3DTO;", "railway_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class TrainSummaryVO {

        @NotNull
        private final ButtonV3DTO routeButton;

        @NotNull
        private final List<IconDTO> trainIcons;

        @NotNull
        private final List<TextDTO> trainNames;

        public TrainSummaryVO(@NotNull List<IconDTO> trainIcons, @NotNull List<TextDTO> trainNames, @NotNull ButtonV3DTO routeButton) {
            Intrinsics.checkNotNullParameter(trainIcons, "trainIcons");
            Intrinsics.checkNotNullParameter(trainNames, "trainNames");
            Intrinsics.checkNotNullParameter(routeButton, "routeButton");
            this.trainIcons = trainIcons;
            this.trainNames = trainNames;
            this.routeButton = routeButton;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof TrainSummaryVO)) {
                return false;
            }
            TrainSummaryVO trainSummaryVO = (TrainSummaryVO) other;
            return Intrinsics.d(this.trainIcons, trainSummaryVO.trainIcons) && Intrinsics.d(this.trainNames, trainSummaryVO.trainNames) && Intrinsics.d(this.routeButton, trainSummaryVO.routeButton);
        }

        @NotNull
        public final ButtonV3DTO getRouteButton() {
            return this.routeButton;
        }

        @NotNull
        public final List<IconDTO> getTrainIcons() {
            return this.trainIcons;
        }

        @NotNull
        public final List<TextDTO> getTrainNames() {
            return this.trainNames;
        }

        public int hashCode() {
            return this.routeButton.hashCode() + G.g.b(this.trainIcons.hashCode() * 31, 31, this.trainNames);
        }

        @NotNull
        public String toString() {
            List<IconDTO> list = this.trainIcons;
            List<TextDTO> list2 = this.trainNames;
            ButtonV3DTO buttonV3DTO = this.routeButton;
            StringBuilder d11 = Fj.c.d("TrainSummaryVO(trainIcons=", list, ", trainNames=", ", routeButton=", list2);
            d11.append(buttonV3DTO);
            d11.append(")");
            return d11.toString();
        }
    }

    public TravelRailwaySearchResultsV4TrainVO(long j11, @NotNull List<BadgeDTO> promotionBadges, boolean z11, @NotNull TrainSummaryVO summary, @NotNull TimeInfoVO timeInfo, @NotNull List<RouteInfoVO> routeInfo, boolean z12, @NotNull List<IconButtonV3DTO> services, boolean z13, BadgeDTO badgeDTO, @NotNull List<CarriageTypeVO> carriageTypes, boolean z14, AtomAction atomAction, @NotNull PriceDTO price, BadgeDTO badgeDTO2, List<OnBoardingDTO> list, List<String> list2, t tVar) {
        Intrinsics.checkNotNullParameter(promotionBadges, "promotionBadges");
        Intrinsics.checkNotNullParameter(summary, "summary");
        Intrinsics.checkNotNullParameter(timeInfo, "timeInfo");
        Intrinsics.checkNotNullParameter(routeInfo, "routeInfo");
        Intrinsics.checkNotNullParameter(services, "services");
        Intrinsics.checkNotNullParameter(carriageTypes, "carriageTypes");
        Intrinsics.checkNotNullParameter(price, "price");
        this.id = j11;
        this.promotionBadges = promotionBadges;
        this.hasBadges = z11;
        this.summary = summary;
        this.timeInfo = timeInfo;
        this.routeInfo = routeInfo;
        this.isRouteInfoVisible = z12;
        this.services = services;
        this.isServiceVisible = z13;
        this.notificationBadge = badgeDTO;
        this.carriageTypes = carriageTypes;
        this.isCarriageTypesVisible = z14;
        this.selectTrainAction = atomAction;
        this.price = price;
        this.milesBadge = badgeDTO2;
        this.onboardingApp = list;
        this.allOnboardingKeys = list2;
        this.viewTokenizedEvent = tVar;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof TravelRailwaySearchResultsV4TrainVO)) {
            return false;
        }
        TravelRailwaySearchResultsV4TrainVO travelRailwaySearchResultsV4TrainVO = (TravelRailwaySearchResultsV4TrainVO) other;
        return this.id == travelRailwaySearchResultsV4TrainVO.id && Intrinsics.d(this.promotionBadges, travelRailwaySearchResultsV4TrainVO.promotionBadges) && this.hasBadges == travelRailwaySearchResultsV4TrainVO.hasBadges && Intrinsics.d(this.summary, travelRailwaySearchResultsV4TrainVO.summary) && Intrinsics.d(this.timeInfo, travelRailwaySearchResultsV4TrainVO.timeInfo) && Intrinsics.d(this.routeInfo, travelRailwaySearchResultsV4TrainVO.routeInfo) && this.isRouteInfoVisible == travelRailwaySearchResultsV4TrainVO.isRouteInfoVisible && Intrinsics.d(this.services, travelRailwaySearchResultsV4TrainVO.services) && this.isServiceVisible == travelRailwaySearchResultsV4TrainVO.isServiceVisible && Intrinsics.d(this.notificationBadge, travelRailwaySearchResultsV4TrainVO.notificationBadge) && Intrinsics.d(this.carriageTypes, travelRailwaySearchResultsV4TrainVO.carriageTypes) && this.isCarriageTypesVisible == travelRailwaySearchResultsV4TrainVO.isCarriageTypesVisible && Intrinsics.d(this.selectTrainAction, travelRailwaySearchResultsV4TrainVO.selectTrainAction) && Intrinsics.d(this.price, travelRailwaySearchResultsV4TrainVO.price) && Intrinsics.d(this.milesBadge, travelRailwaySearchResultsV4TrainVO.milesBadge) && Intrinsics.d(this.onboardingApp, travelRailwaySearchResultsV4TrainVO.onboardingApp) && Intrinsics.d(this.allOnboardingKeys, travelRailwaySearchResultsV4TrainVO.allOnboardingKeys) && Intrinsics.d(this.viewTokenizedEvent, travelRailwaySearchResultsV4TrainVO.viewTokenizedEvent);
    }

    public final List<String> getAllOnboardingKeys() {
        return this.allOnboardingKeys;
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

    public final List<OnBoardingDTO> getOnboardingApp() {
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

    @NotNull
    public final List<RouteInfoVO> getRouteInfo() {
        return this.routeInfo;
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
    public final TrainSummaryVO getSummary() {
        return this.summary;
    }

    @NotNull
    public final TimeInfoVO getTimeInfo() {
        return this.timeInfo;
    }

    @Override // l20.c
    public int getViewItemKey() {
        return hashCode();
    }

    public final t getViewTokenizedEvent() {
        return this.viewTokenizedEvent;
    }

    public int hashCode() {
        int a11 = C3532b.a(G.g.b(C3532b.a(G.g.b((this.timeInfo.hashCode() + ((this.summary.hashCode() + C3532b.a(G.g.b(Long.hashCode(this.id) * 31, 31, this.promotionBadges), 31, this.hasBadges)) * 31)) * 31, 31, this.routeInfo), 31, this.isRouteInfoVisible), 31, this.services), 31, this.isServiceVisible);
        BadgeDTO badgeDTO = this.notificationBadge;
        int a12 = C3532b.a(G.g.b((a11 + (badgeDTO == null ? 0 : badgeDTO.hashCode())) * 31, 31, this.carriageTypes), 31, this.isCarriageTypesVisible);
        AtomAction atomAction = this.selectTrainAction;
        int b11 = C3051a.b(this.price, (a12 + (atomAction == null ? 0 : atomAction.hashCode())) * 31, 31);
        BadgeDTO badgeDTO2 = this.milesBadge;
        int hashCode = (b11 + (badgeDTO2 == null ? 0 : badgeDTO2.hashCode())) * 31;
        List<OnBoardingDTO> list = this.onboardingApp;
        int hashCode2 = (hashCode + (list == null ? 0 : list.hashCode())) * 31;
        List<String> list2 = this.allOnboardingKeys;
        int hashCode3 = (hashCode2 + (list2 == null ? 0 : list2.hashCode())) * 31;
        t tVar = this.viewTokenizedEvent;
        return hashCode3 + (tVar != null ? tVar.hashCode() : 0);
    }

    /* renamed from: isCarriageTypesVisible, reason: from getter */
    public final boolean getIsCarriageTypesVisible() {
        return this.isCarriageTypesVisible;
    }

    /* renamed from: isRouteInfoVisible, reason: from getter */
    public final boolean getIsRouteInfoVisible() {
        return this.isRouteInfoVisible;
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
        TrainSummaryVO trainSummaryVO = this.summary;
        TimeInfoVO timeInfoVO = this.timeInfo;
        List<RouteInfoVO> list2 = this.routeInfo;
        boolean z12 = this.isRouteInfoVisible;
        List<IconButtonV3DTO> list3 = this.services;
        boolean z13 = this.isServiceVisible;
        BadgeDTO badgeDTO = this.notificationBadge;
        List<CarriageTypeVO> list4 = this.carriageTypes;
        boolean z14 = this.isCarriageTypesVisible;
        AtomAction atomAction = this.selectTrainAction;
        PriceDTO priceDTO = this.price;
        BadgeDTO badgeDTO2 = this.milesBadge;
        List<OnBoardingDTO> list5 = this.onboardingApp;
        List<String> list6 = this.allOnboardingKeys;
        t tVar = this.viewTokenizedEvent;
        StringBuilder b11 = Lh.b.b(j11, "TravelRailwaySearchResultsV4TrainVO(id=", ", promotionBadges=", list);
        b11.append(", hasBadges=");
        b11.append(z11);
        b11.append(", summary=");
        b11.append(trainSummaryVO);
        b11.append(", timeInfo=");
        b11.append(timeInfoVO);
        b11.append(", routeInfo=");
        b11.append(list2);
        b11.append(", isRouteInfoVisible=");
        b11.append(z12);
        b11.append(", services=");
        b11.append(list3);
        b11.append(", isServiceVisible=");
        b11.append(z13);
        b11.append(", notificationBadge=");
        b11.append(badgeDTO);
        AZ.c.c(b11, ", carriageTypes=", list4, ", isCarriageTypesVisible=", z14);
        b11.append(", selectTrainAction=");
        b11.append(atomAction);
        b11.append(", price=");
        b11.append(priceDTO);
        b11.append(", milesBadge=");
        b11.append(badgeDTO2);
        b11.append(", onboardingApp=");
        b11.append(list5);
        Ak.b.h(b11, ", allOnboardingKeys=", list6, ", viewTokenizedEvent=", tVar);
        b11.append(")");
        return b11.toString();
    }
}
