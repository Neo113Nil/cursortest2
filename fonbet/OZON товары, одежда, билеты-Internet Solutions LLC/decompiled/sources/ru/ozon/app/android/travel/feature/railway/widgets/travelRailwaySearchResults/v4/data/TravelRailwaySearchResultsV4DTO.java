package ru.ozon.app.android.travel.feature.railway.widgets.travelRailwaySearchResults.v4.data;

import Ak.C2436a;
import B90.C2618u;
import D3.g;
import Fj.c;
import Fm.C3051a;
import Ns.b;
import T7.P;
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
import ru.ozon.app.android.composer.widgets.v2.onboarding.data.OnBoardingDTO;
import ru.ozon.app.android.partpayment.formpage.data.FormPageDTO;
import ru.ozon.app.android.storefront.widgets.feedback.result.data.ResultDTO;
import ru.ozon.uni.atoms.data.AtomActionDTO;
import ru.ozon.uni.atoms.data.controls.CommonControlSettings;
import ru.ozon.uni.atoms.data.controls.button.ButtonV3DTO;
import ru.ozon.uni.atoms.data.controls.button.IconButtonV3DTO;
import ru.ozon.uni.atoms.data.dsBadge.BadgeDTO;
import ru.ozon.uni.atoms.data.icon.IconDTO;
import ru.ozon.uni.atoms.data.price.PriceDTO;
import ru.ozon.uni.atoms.data.text.TextDTO;

@j(generateAdapter = true)
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\b\b\u0081\b\u0018\u00002\u00020\u0001:\u0006'()*+,BK\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\b\u0010\t\u001a\u0004\u0018\u00010\n\u0012\u0014\u0010\u000b\u001a\u0010\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u000e\u0018\u00010\f¢\u0006\u0004\b\u000f\u0010\u0010J\u000b\u0010\u001b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000f\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0003J\u000b\u0010\u001d\u001a\u0004\u0018\u00010\bHÆ\u0003J\u000b\u0010\u001e\u001a\u0004\u0018\u00010\nHÆ\u0003J\u0017\u0010\u001f\u001a\u0010\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u000e\u0018\u00010\fHÆ\u0003JU\u0010 \u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n2\u0016\b\u0002\u0010\u000b\u001a\u0010\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u000e\u0018\u00010\fHÆ\u0001J\u0013\u0010!\u001a\u00020\"2\b\u0010#\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010$\u001a\u00020%HÖ\u0001J\t\u0010&\u001a\u00020\rHÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0013\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0013\u0010\t\u001a\u0004\u0018\u00010\n¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u001f\u0010\u000b\u001a\u0010\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u000e\u0018\u00010\f¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001a¨\u0006-"}, d2 = {"Lru/ozon/app/android/travel/feature/railway/widgets/travelRailwaySearchResults/v4/data/TravelRailwaySearchResultsV4DTO;", "", "requestTrainsAction", "Lru/ozon/uni/atoms/data/AtomActionDTO;", "trains", "", "Lru/ozon/app/android/travel/feature/railway/widgets/travelRailwaySearchResults/v4/data/TravelRailwaySearchResultsV4DTO$TrainDTO;", "onboardingApp", "Lru/ozon/app/android/composer/widgets/v2/onboarding/data/OnBoardingDTO;", "onboardings", "Lru/ozon/app/android/travel/feature/railway/widgets/travelRailwaySearchResults/v4/data/TravelRailwaySearchResultsV4DTO$Onboardings;", "trackingInfo", "", "", "Lru/ozon/android/tokenized/model/TokenizedTrackingInfo;", "<init>", "(Lru/ozon/uni/atoms/data/AtomActionDTO;Ljava/util/List;Lru/ozon/app/android/composer/widgets/v2/onboarding/data/OnBoardingDTO;Lru/ozon/app/android/travel/feature/railway/widgets/travelRailwaySearchResults/v4/data/TravelRailwaySearchResultsV4DTO$Onboardings;Ljava/util/Map;)V", "getRequestTrainsAction", "()Lru/ozon/uni/atoms/data/AtomActionDTO;", "getTrains", "()Ljava/util/List;", "getOnboardingApp", "()Lru/ozon/app/android/composer/widgets/v2/onboarding/data/OnBoardingDTO;", "getOnboardings", "()Lru/ozon/app/android/travel/feature/railway/widgets/travelRailwaySearchResults/v4/data/TravelRailwaySearchResultsV4DTO$Onboardings;", "getTrackingInfo", "()Ljava/util/Map;", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", "hashCode", "", "toString", "TrainDTO", "TrainSummaryDTO", "TimeInfoDTO", "RouteInfoDTO", "CarriageTypeDTO", "Onboardings", "railway_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class TravelRailwaySearchResultsV4DTO {
    public static final int $stable = 8;
    private final OnBoardingDTO onboardingApp;
    private final Onboardings onboardings;
    private final AtomActionDTO requestTrainsAction;
    private final Map<String, TokenizedTrackingInfo> trackingInfo;

    @NotNull
    private final List<TrainDTO> trains;

    @j(generateAdapter = true)
    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0010\u001a\u0004\u0018\u00010\u0006HÆ\u0003J)\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006HÆ\u0001J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001J\t\u0010\u0017\u001a\u00020\u0018HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\nR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\r¨\u0006\u0019"}, d2 = {"Lru/ozon/app/android/travel/feature/railway/widgets/travelRailwaySearchResults/v4/data/TravelRailwaySearchResultsV4DTO$CarriageTypeDTO;", "", "typeName", "Lru/ozon/uni/atoms/data/text/TextDTO;", "seatsCount", "typePrice", "Lru/ozon/uni/atoms/data/price/PriceDTO;", "<init>", "(Lru/ozon/uni/atoms/data/text/TextDTO;Lru/ozon/uni/atoms/data/text/TextDTO;Lru/ozon/uni/atoms/data/price/PriceDTO;)V", "getTypeName", "()Lru/ozon/uni/atoms/data/text/TextDTO;", "getSeatsCount", "getTypePrice", "()Lru/ozon/uni/atoms/data/price/PriceDTO;", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "", "railway_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class CarriageTypeDTO {
        public static final int $stable = PriceDTO.$stable;

        @NotNull
        private final TextDTO seatsCount;

        @NotNull
        private final TextDTO typeName;
        private final PriceDTO typePrice;

        public CarriageTypeDTO(@NotNull TextDTO typeName, @NotNull TextDTO seatsCount, PriceDTO priceDTO) {
            Intrinsics.checkNotNullParameter(typeName, "typeName");
            Intrinsics.checkNotNullParameter(seatsCount, "seatsCount");
            this.typeName = typeName;
            this.seatsCount = seatsCount;
            this.typePrice = priceDTO;
        }

        public static /* synthetic */ CarriageTypeDTO copy$default(CarriageTypeDTO carriageTypeDTO, TextDTO textDTO, TextDTO textDTO2, PriceDTO priceDTO, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                textDTO = carriageTypeDTO.typeName;
            }
            if ((i11 & 2) != 0) {
                textDTO2 = carriageTypeDTO.seatsCount;
            }
            if ((i11 & 4) != 0) {
                priceDTO = carriageTypeDTO.typePrice;
            }
            return carriageTypeDTO.copy(textDTO, textDTO2, priceDTO);
        }

        @NotNull
        /* renamed from: component1, reason: from getter */
        public final TextDTO getTypeName() {
            return this.typeName;
        }

        @NotNull
        /* renamed from: component2, reason: from getter */
        public final TextDTO getSeatsCount() {
            return this.seatsCount;
        }

        /* renamed from: component3, reason: from getter */
        public final PriceDTO getTypePrice() {
            return this.typePrice;
        }

        @NotNull
        public final CarriageTypeDTO copy(@NotNull TextDTO typeName, @NotNull TextDTO seatsCount, PriceDTO typePrice) {
            Intrinsics.checkNotNullParameter(typeName, "typeName");
            Intrinsics.checkNotNullParameter(seatsCount, "seatsCount");
            return new CarriageTypeDTO(typeName, seatsCount, typePrice);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof CarriageTypeDTO)) {
                return false;
            }
            CarriageTypeDTO carriageTypeDTO = (CarriageTypeDTO) other;
            return Intrinsics.d(this.typeName, carriageTypeDTO.typeName) && Intrinsics.d(this.seatsCount, carriageTypeDTO.seatsCount) && Intrinsics.d(this.typePrice, carriageTypeDTO.typePrice);
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
            int a11 = b.a(this.seatsCount, this.typeName.hashCode() * 31, 31);
            PriceDTO priceDTO = this.typePrice;
            return a11 + (priceDTO == null ? 0 : priceDTO.hashCode());
        }

        @NotNull
        public String toString() {
            TextDTO textDTO = this.typeName;
            TextDTO textDTO2 = this.seatsCount;
            PriceDTO priceDTO = this.typePrice;
            StringBuilder g10 = g.g("CarriageTypeDTO(typeName=", textDTO, ", seatsCount=", textDTO2, ", typePrice=");
            g10.append(priceDTO);
            g10.append(")");
            return g10.toString();
        }
    }

    @j(generateAdapter = true)
    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B#\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\u000f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00060\u0003HÆ\u0003J)\u0010\u000e\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u0003HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0006HÖ\u0001R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0017\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\n¨\u0006\u0015"}, d2 = {"Lru/ozon/app/android/travel/feature/railway/widgets/travelRailwaySearchResults/v4/data/TravelRailwaySearchResultsV4DTO$Onboardings;", "", "appOnboardings", "", "Lru/ozon/app/android/composer/widgets/v2/onboarding/data/OnBoardingDTO;", "onboardingKeys", "", "<init>", "(Ljava/util/List;Ljava/util/List;)V", "getAppOnboardings", "()Ljava/util/List;", "getOnboardingKeys", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "railway_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class Onboardings {
        public static final int $stable = 8;

        @NotNull
        private final List<OnBoardingDTO> appOnboardings;

        @NotNull
        private final List<String> onboardingKeys;

        public Onboardings(@NotNull List<OnBoardingDTO> appOnboardings, @NotNull List<String> onboardingKeys) {
            Intrinsics.checkNotNullParameter(appOnboardings, "appOnboardings");
            Intrinsics.checkNotNullParameter(onboardingKeys, "onboardingKeys");
            this.appOnboardings = appOnboardings;
            this.onboardingKeys = onboardingKeys;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ Onboardings copy$default(Onboardings onboardings, List list, List list2, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                list = onboardings.appOnboardings;
            }
            if ((i11 & 2) != 0) {
                list2 = onboardings.onboardingKeys;
            }
            return onboardings.copy(list, list2);
        }

        @NotNull
        public final List<OnBoardingDTO> component1() {
            return this.appOnboardings;
        }

        @NotNull
        public final List<String> component2() {
            return this.onboardingKeys;
        }

        @NotNull
        public final Onboardings copy(@NotNull List<OnBoardingDTO> appOnboardings, @NotNull List<String> onboardingKeys) {
            Intrinsics.checkNotNullParameter(appOnboardings, "appOnboardings");
            Intrinsics.checkNotNullParameter(onboardingKeys, "onboardingKeys");
            return new Onboardings(appOnboardings, onboardingKeys);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Onboardings)) {
                return false;
            }
            Onboardings onboardings = (Onboardings) other;
            return Intrinsics.d(this.appOnboardings, onboardings.appOnboardings) && Intrinsics.d(this.onboardingKeys, onboardings.onboardingKeys);
        }

        @NotNull
        public final List<OnBoardingDTO> getAppOnboardings() {
            return this.appOnboardings;
        }

        @NotNull
        public final List<String> getOnboardingKeys() {
            return this.onboardingKeys;
        }

        public int hashCode() {
            return this.onboardingKeys.hashCode() + (this.appOnboardings.hashCode() * 31);
        }

        @NotNull
        public String toString() {
            return C2436a.b("Onboardings(appOnboardings=", this.appOnboardings, ", onboardingKeys=", ")", this.onboardingKeys);
        }
    }

    @j(generateAdapter = true)
    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\r\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u001f\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0016"}, d2 = {"Lru/ozon/app/android/travel/feature/railway/widgets/travelRailwaySearchResults/v4/data/TravelRailwaySearchResultsV4DTO$RouteInfoDTO;", "", "text", "Lru/ozon/uni/atoms/data/text/TextDTO;", "icon", "Lru/ozon/uni/atoms/data/icon/IconDTO;", "<init>", "(Lru/ozon/uni/atoms/data/text/TextDTO;Lru/ozon/uni/atoms/data/icon/IconDTO;)V", "getText", "()Lru/ozon/uni/atoms/data/text/TextDTO;", "getIcon", "()Lru/ozon/uni/atoms/data/icon/IconDTO;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "", "railway_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class RouteInfoDTO {
        public static final int $stable = IconDTO.$stable;
        private final IconDTO icon;

        @NotNull
        private final TextDTO text;

        public RouteInfoDTO(@NotNull TextDTO text, IconDTO iconDTO) {
            Intrinsics.checkNotNullParameter(text, "text");
            this.text = text;
            this.icon = iconDTO;
        }

        public static /* synthetic */ RouteInfoDTO copy$default(RouteInfoDTO routeInfoDTO, TextDTO textDTO, IconDTO iconDTO, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                textDTO = routeInfoDTO.text;
            }
            if ((i11 & 2) != 0) {
                iconDTO = routeInfoDTO.icon;
            }
            return routeInfoDTO.copy(textDTO, iconDTO);
        }

        @NotNull
        /* renamed from: component1, reason: from getter */
        public final TextDTO getText() {
            return this.text;
        }

        /* renamed from: component2, reason: from getter */
        public final IconDTO getIcon() {
            return this.icon;
        }

        @NotNull
        public final RouteInfoDTO copy(@NotNull TextDTO text, IconDTO icon) {
            Intrinsics.checkNotNullParameter(text, "text");
            return new RouteInfoDTO(text, icon);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof RouteInfoDTO)) {
                return false;
            }
            RouteInfoDTO routeInfoDTO = (RouteInfoDTO) other;
            return Intrinsics.d(this.text, routeInfoDTO.text) && Intrinsics.d(this.icon, routeInfoDTO.icon);
        }

        public final IconDTO getIcon() {
            return this.icon;
        }

        @NotNull
        public final TextDTO getText() {
            return this.text;
        }

        public int hashCode() {
            int hashCode = this.text.hashCode() * 31;
            IconDTO iconDTO = this.icon;
            return hashCode + (iconDTO == null ? 0 : iconDTO.hashCode());
        }

        @NotNull
        public String toString() {
            return "RouteInfoDTO(text=" + this.text + ", icon=" + this.icon + ")";
        }
    }

    @j(generateAdapter = true)
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\r\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J)\u0010\u000f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\tR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\t¨\u0006\u0017"}, d2 = {"Lru/ozon/app/android/travel/feature/railway/widgets/travelRailwaySearchResults/v4/data/TravelRailwaySearchResultsV4DTO$TimeInfoDTO;", "", "departureArrivalTimes", "Lru/ozon/uni/atoms/data/text/TextDTO;", "dayDifference", "travelTime", "<init>", "(Lru/ozon/uni/atoms/data/text/TextDTO;Lru/ozon/uni/atoms/data/text/TextDTO;Lru/ozon/uni/atoms/data/text/TextDTO;)V", "getDepartureArrivalTimes", "()Lru/ozon/uni/atoms/data/text/TextDTO;", "getDayDifference", "getTravelTime", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "", "railway_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class TimeInfoDTO {
        public static final int $stable = 0;
        private final TextDTO dayDifference;

        @NotNull
        private final TextDTO departureArrivalTimes;

        @NotNull
        private final TextDTO travelTime;

        public TimeInfoDTO(@NotNull TextDTO departureArrivalTimes, TextDTO textDTO, @NotNull TextDTO travelTime) {
            Intrinsics.checkNotNullParameter(departureArrivalTimes, "departureArrivalTimes");
            Intrinsics.checkNotNullParameter(travelTime, "travelTime");
            this.departureArrivalTimes = departureArrivalTimes;
            this.dayDifference = textDTO;
            this.travelTime = travelTime;
        }

        public static /* synthetic */ TimeInfoDTO copy$default(TimeInfoDTO timeInfoDTO, TextDTO textDTO, TextDTO textDTO2, TextDTO textDTO3, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                textDTO = timeInfoDTO.departureArrivalTimes;
            }
            if ((i11 & 2) != 0) {
                textDTO2 = timeInfoDTO.dayDifference;
            }
            if ((i11 & 4) != 0) {
                textDTO3 = timeInfoDTO.travelTime;
            }
            return timeInfoDTO.copy(textDTO, textDTO2, textDTO3);
        }

        @NotNull
        /* renamed from: component1, reason: from getter */
        public final TextDTO getDepartureArrivalTimes() {
            return this.departureArrivalTimes;
        }

        /* renamed from: component2, reason: from getter */
        public final TextDTO getDayDifference() {
            return this.dayDifference;
        }

        @NotNull
        /* renamed from: component3, reason: from getter */
        public final TextDTO getTravelTime() {
            return this.travelTime;
        }

        @NotNull
        public final TimeInfoDTO copy(@NotNull TextDTO departureArrivalTimes, TextDTO dayDifference, @NotNull TextDTO travelTime) {
            Intrinsics.checkNotNullParameter(departureArrivalTimes, "departureArrivalTimes");
            Intrinsics.checkNotNullParameter(travelTime, "travelTime");
            return new TimeInfoDTO(departureArrivalTimes, dayDifference, travelTime);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof TimeInfoDTO)) {
                return false;
            }
            TimeInfoDTO timeInfoDTO = (TimeInfoDTO) other;
            return Intrinsics.d(this.departureArrivalTimes, timeInfoDTO.departureArrivalTimes) && Intrinsics.d(this.dayDifference, timeInfoDTO.dayDifference) && Intrinsics.d(this.travelTime, timeInfoDTO.travelTime);
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
            return Tl.b.e(g.g("TimeInfoDTO(departureArrivalTimes=", textDTO, ", dayDifference=", textDTO2, ", travelTime="), this.travelTime, ")");
        }
    }

    public TravelRailwaySearchResultsV4DTO(AtomActionDTO atomActionDTO, @NotNull List<TrainDTO> trains, OnBoardingDTO onBoardingDTO, Onboardings onboardings, Map<String, TokenizedTrackingInfo> map) {
        Intrinsics.checkNotNullParameter(trains, "trains");
        this.requestTrainsAction = atomActionDTO;
        this.trains = trains;
        this.onboardingApp = onBoardingDTO;
        this.onboardings = onboardings;
        this.trackingInfo = map;
    }

    public static /* synthetic */ TravelRailwaySearchResultsV4DTO copy$default(TravelRailwaySearchResultsV4DTO travelRailwaySearchResultsV4DTO, AtomActionDTO atomActionDTO, List list, OnBoardingDTO onBoardingDTO, Onboardings onboardings, Map map, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            atomActionDTO = travelRailwaySearchResultsV4DTO.requestTrainsAction;
        }
        if ((i11 & 2) != 0) {
            list = travelRailwaySearchResultsV4DTO.trains;
        }
        if ((i11 & 4) != 0) {
            onBoardingDTO = travelRailwaySearchResultsV4DTO.onboardingApp;
        }
        if ((i11 & 8) != 0) {
            onboardings = travelRailwaySearchResultsV4DTO.onboardings;
        }
        if ((i11 & 16) != 0) {
            map = travelRailwaySearchResultsV4DTO.trackingInfo;
        }
        Map map2 = map;
        OnBoardingDTO onBoardingDTO2 = onBoardingDTO;
        return travelRailwaySearchResultsV4DTO.copy(atomActionDTO, list, onBoardingDTO2, onboardings, map2);
    }

    /* renamed from: component1, reason: from getter */
    public final AtomActionDTO getRequestTrainsAction() {
        return this.requestTrainsAction;
    }

    @NotNull
    public final List<TrainDTO> component2() {
        return this.trains;
    }

    /* renamed from: component3, reason: from getter */
    public final OnBoardingDTO getOnboardingApp() {
        return this.onboardingApp;
    }

    /* renamed from: component4, reason: from getter */
    public final Onboardings getOnboardings() {
        return this.onboardings;
    }

    public final Map<String, TokenizedTrackingInfo> component5() {
        return this.trackingInfo;
    }

    @NotNull
    public final TravelRailwaySearchResultsV4DTO copy(AtomActionDTO requestTrainsAction, @NotNull List<TrainDTO> trains, OnBoardingDTO onboardingApp, Onboardings onboardings, Map<String, TokenizedTrackingInfo> trackingInfo) {
        Intrinsics.checkNotNullParameter(trains, "trains");
        return new TravelRailwaySearchResultsV4DTO(requestTrainsAction, trains, onboardingApp, onboardings, trackingInfo);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof TravelRailwaySearchResultsV4DTO)) {
            return false;
        }
        TravelRailwaySearchResultsV4DTO travelRailwaySearchResultsV4DTO = (TravelRailwaySearchResultsV4DTO) other;
        return Intrinsics.d(this.requestTrainsAction, travelRailwaySearchResultsV4DTO.requestTrainsAction) && Intrinsics.d(this.trains, travelRailwaySearchResultsV4DTO.trains) && Intrinsics.d(this.onboardingApp, travelRailwaySearchResultsV4DTO.onboardingApp) && Intrinsics.d(this.onboardings, travelRailwaySearchResultsV4DTO.onboardings) && Intrinsics.d(this.trackingInfo, travelRailwaySearchResultsV4DTO.trackingInfo);
    }

    public final OnBoardingDTO getOnboardingApp() {
        return this.onboardingApp;
    }

    public final Onboardings getOnboardings() {
        return this.onboardings;
    }

    public final AtomActionDTO getRequestTrainsAction() {
        return this.requestTrainsAction;
    }

    public final Map<String, TokenizedTrackingInfo> getTrackingInfo() {
        return this.trackingInfo;
    }

    @NotNull
    public final List<TrainDTO> getTrains() {
        return this.trains;
    }

    public int hashCode() {
        AtomActionDTO atomActionDTO = this.requestTrainsAction;
        int b11 = G.g.b((atomActionDTO == null ? 0 : atomActionDTO.hashCode()) * 31, 31, this.trains);
        OnBoardingDTO onBoardingDTO = this.onboardingApp;
        int hashCode = (b11 + (onBoardingDTO == null ? 0 : onBoardingDTO.hashCode())) * 31;
        Onboardings onboardings = this.onboardings;
        int hashCode2 = (hashCode + (onboardings == null ? 0 : onboardings.hashCode())) * 31;
        Map<String, TokenizedTrackingInfo> map = this.trackingInfo;
        return hashCode2 + (map != null ? map.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        AtomActionDTO atomActionDTO = this.requestTrainsAction;
        List<TrainDTO> list = this.trains;
        OnBoardingDTO onBoardingDTO = this.onboardingApp;
        Onboardings onboardings = this.onboardings;
        Map<String, TokenizedTrackingInfo> map = this.trackingInfo;
        StringBuilder sb2 = new StringBuilder("TravelRailwaySearchResultsV4DTO(requestTrainsAction=");
        sb2.append(atomActionDTO);
        sb2.append(", trains=");
        sb2.append(list);
        sb2.append(", onboardingApp=");
        sb2.append(onBoardingDTO);
        sb2.append(", onboardings=");
        sb2.append(onboardings);
        sb2.append(", trackingInfo=");
        return P.f(sb2, map, ")");
    }

    @j(generateAdapter = true)
    @Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B/\u0012\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u0003\u0012\u0006\u0010\u0007\u001a\u00020\b¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\u000f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00060\u0003HÆ\u0003J\t\u0010\u0012\u001a\u00020\bHÆ\u0003J3\u0010\u0013\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u00032\b\b\u0002\u0010\u0007\u001a\u00020\bHÆ\u0001J\u0013\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0017\u001a\u00020\u0018HÖ\u0001J\t\u0010\u0019\u001a\u00020\u001aHÖ\u0001R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0017\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\fR\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u001b"}, d2 = {"Lru/ozon/app/android/travel/feature/railway/widgets/travelRailwaySearchResults/v4/data/TravelRailwaySearchResultsV4DTO$TrainSummaryDTO;", "", "trainIcons", "", "Lru/ozon/uni/atoms/data/icon/IconDTO;", "trainNames", "Lru/ozon/uni/atoms/data/text/TextDTO;", "mobRouteButton", "Lru/ozon/uni/atoms/data/controls/button/ButtonV3DTO;", "<init>", "(Ljava/util/List;Ljava/util/List;Lru/ozon/uni/atoms/data/controls/button/ButtonV3DTO;)V", "getTrainIcons", "()Ljava/util/List;", "getTrainNames", "getMobRouteButton", "()Lru/ozon/uni/atoms/data/controls/button/ButtonV3DTO;", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "", "railway_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class TrainSummaryDTO {
        public static final int $stable = 8;

        @NotNull
        private final ButtonV3DTO mobRouteButton;

        @NotNull
        private final List<IconDTO> trainIcons;

        @NotNull
        private final List<TextDTO> trainNames;

        public TrainSummaryDTO(@NotNull List<IconDTO> trainIcons, @NotNull List<TextDTO> trainNames, @NotNull ButtonV3DTO mobRouteButton) {
            Intrinsics.checkNotNullParameter(trainIcons, "trainIcons");
            Intrinsics.checkNotNullParameter(trainNames, "trainNames");
            Intrinsics.checkNotNullParameter(mobRouteButton, "mobRouteButton");
            this.trainIcons = trainIcons;
            this.trainNames = trainNames;
            this.mobRouteButton = mobRouteButton;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ TrainSummaryDTO copy$default(TrainSummaryDTO trainSummaryDTO, List list, List list2, ButtonV3DTO buttonV3DTO, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                list = trainSummaryDTO.trainIcons;
            }
            if ((i11 & 2) != 0) {
                list2 = trainSummaryDTO.trainNames;
            }
            if ((i11 & 4) != 0) {
                buttonV3DTO = trainSummaryDTO.mobRouteButton;
            }
            return trainSummaryDTO.copy(list, list2, buttonV3DTO);
        }

        @NotNull
        public final List<IconDTO> component1() {
            return this.trainIcons;
        }

        @NotNull
        public final List<TextDTO> component2() {
            return this.trainNames;
        }

        @NotNull
        /* renamed from: component3, reason: from getter */
        public final ButtonV3DTO getMobRouteButton() {
            return this.mobRouteButton;
        }

        @NotNull
        public final TrainSummaryDTO copy(@NotNull List<IconDTO> trainIcons, @NotNull List<TextDTO> trainNames, @NotNull ButtonV3DTO mobRouteButton) {
            Intrinsics.checkNotNullParameter(trainIcons, "trainIcons");
            Intrinsics.checkNotNullParameter(trainNames, "trainNames");
            Intrinsics.checkNotNullParameter(mobRouteButton, "mobRouteButton");
            return new TrainSummaryDTO(trainIcons, trainNames, mobRouteButton);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof TrainSummaryDTO)) {
                return false;
            }
            TrainSummaryDTO trainSummaryDTO = (TrainSummaryDTO) other;
            return Intrinsics.d(this.trainIcons, trainSummaryDTO.trainIcons) && Intrinsics.d(this.trainNames, trainSummaryDTO.trainNames) && Intrinsics.d(this.mobRouteButton, trainSummaryDTO.mobRouteButton);
        }

        @NotNull
        public final ButtonV3DTO getMobRouteButton() {
            return this.mobRouteButton;
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
            return this.mobRouteButton.hashCode() + G.g.b(this.trainIcons.hashCode() * 31, 31, this.trainNames);
        }

        @NotNull
        public String toString() {
            List<IconDTO> list = this.trainIcons;
            List<TextDTO> list2 = this.trainNames;
            ButtonV3DTO buttonV3DTO = this.mobRouteButton;
            StringBuilder d11 = c.d("TrainSummaryDTO(trainIcons=", list, ", trainNames=", ", mobRouteButton=", list2);
            d11.append(buttonV3DTO);
            d11.append(")");
            return d11.toString();
        }

        public TrainSummaryDTO(List list, List list2, ButtonV3DTO buttonV3DTO, int i11, DefaultConstructorMarker defaultConstructorMarker) {
            this((i11 & 1) != 0 ? K.f71697a : list, (i11 & 2) != 0 ? K.f71697a : list2, buttonV3DTO);
        }
    }

    public TravelRailwaySearchResultsV4DTO(AtomActionDTO atomActionDTO, List list, OnBoardingDTO onBoardingDTO, Onboardings onboardings, Map map, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(atomActionDTO, (i11 & 2) != 0 ? K.f71697a : list, onBoardingDTO, onboardings, map);
    }

    @j(generateAdapter = true)
    @Metadata(d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b \n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u008d\u0001\u0012\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u000e\b\u0002\u0010\t\u001a\b\u0012\u0004\u0012\u00020\n0\u0003\u0012\u000e\b\u0002\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\f0\u0003\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u0004\u0012\u000e\b\u0002\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000f0\u0003\u0012\u0006\u0010\u0010\u001a\u00020\u0011\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014\u0012\u000e\u0010\u0015\u001a\n\u0012\u0004\u0012\u00020\u0016\u0018\u00010\u0003¢\u0006\u0004\b\u0017\u0010\u0018J\u000f\u0010*\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\t\u0010+\u001a\u00020\u0006HÆ\u0003J\t\u0010,\u001a\u00020\bHÆ\u0003J\u000f\u0010-\u001a\b\u0012\u0004\u0012\u00020\n0\u0003HÆ\u0003J\u000f\u0010.\u001a\b\u0012\u0004\u0012\u00020\f0\u0003HÆ\u0003J\u000b\u0010/\u001a\u0004\u0018\u00010\u0004HÆ\u0003J\u000f\u00100\u001a\b\u0012\u0004\u0012\u00020\u000f0\u0003HÆ\u0003J\t\u00101\u001a\u00020\u0011HÆ\u0003J\u000b\u00102\u001a\u0004\u0018\u00010\u0004HÆ\u0003J\u000b\u00103\u001a\u0004\u0018\u00010\u0014HÆ\u0003J\u0011\u00104\u001a\n\u0012\u0004\u0012\u00020\u0016\u0018\u00010\u0003HÆ\u0003J\u009d\u0001\u00105\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\b2\u000e\b\u0002\u0010\t\u001a\b\u0012\u0004\u0012\u00020\n0\u00032\u000e\b\u0002\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\f0\u00032\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u00042\u000e\b\u0002\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000f0\u00032\b\b\u0002\u0010\u0010\u001a\u00020\u00112\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00142\u0010\b\u0002\u0010\u0015\u001a\n\u0012\u0004\u0012\u00020\u0016\u0018\u00010\u0003HÆ\u0001J\u0013\u00106\u001a\u0002072\b\u00108\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u00109\u001a\u00020:HÖ\u0001J\t\u0010;\u001a\u00020\u0016HÖ\u0001R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001cR\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001eR\u0017\u0010\t\u001a\b\u0012\u0004\u0012\u00020\n0\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010\u001aR\u0017\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\f0\u0003¢\u0006\b\n\u0000\u001a\u0004\b \u0010\u001aR\u0013\u0010\r\u001a\u0004\u0018\u00010\u0004¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\"R\u0017\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000f0\u0003¢\u0006\b\n\u0000\u001a\u0004\b#\u0010\u001aR\u0011\u0010\u0010\u001a\u00020\u0011¢\u0006\b\n\u0000\u001a\u0004\b$\u0010%R\u0013\u0010\u0012\u001a\u0004\u0018\u00010\u0004¢\u0006\b\n\u0000\u001a\u0004\b&\u0010\"R\u0013\u0010\u0013\u001a\u0004\u0018\u00010\u0014¢\u0006\b\n\u0000\u001a\u0004\b'\u0010(R\u0019\u0010\u0015\u001a\n\u0012\u0004\u0012\u00020\u0016\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b)\u0010\u001a¨\u0006<"}, d2 = {"Lru/ozon/app/android/travel/feature/railway/widgets/travelRailwaySearchResults/v4/data/TravelRailwaySearchResultsV4DTO$TrainDTO;", "", "promotionBadges", "", "Lru/ozon/uni/atoms/data/dsBadge/BadgeDTO;", FormPageDTO.Field.FIELD_TYPE_SUMMARY, "Lru/ozon/app/android/travel/feature/railway/widgets/travelRailwaySearchResults/v4/data/TravelRailwaySearchResultsV4DTO$TrainSummaryDTO;", "timeInfo", "Lru/ozon/app/android/travel/feature/railway/widgets/travelRailwaySearchResults/v4/data/TravelRailwaySearchResultsV4DTO$TimeInfoDTO;", "routeInfo", "Lru/ozon/app/android/travel/feature/railway/widgets/travelRailwaySearchResults/v4/data/TravelRailwaySearchResultsV4DTO$RouteInfoDTO;", ResultDTO.CONTENT_TYPE_SERVICES, "Lru/ozon/uni/atoms/data/controls/button/IconButtonV3DTO;", "notificationBadge", "carriageTypes", "Lru/ozon/app/android/travel/feature/railway/widgets/travelRailwaySearchResults/v4/data/TravelRailwaySearchResultsV4DTO$CarriageTypeDTO;", "price", "Lru/ozon/uni/atoms/data/price/PriceDTO;", "milesBadge", "common", "Lru/ozon/uni/atoms/data/controls/CommonControlSettings;", "onboardingKeys", "", "<init>", "(Ljava/util/List;Lru/ozon/app/android/travel/feature/railway/widgets/travelRailwaySearchResults/v4/data/TravelRailwaySearchResultsV4DTO$TrainSummaryDTO;Lru/ozon/app/android/travel/feature/railway/widgets/travelRailwaySearchResults/v4/data/TravelRailwaySearchResultsV4DTO$TimeInfoDTO;Ljava/util/List;Ljava/util/List;Lru/ozon/uni/atoms/data/dsBadge/BadgeDTO;Ljava/util/List;Lru/ozon/uni/atoms/data/price/PriceDTO;Lru/ozon/uni/atoms/data/dsBadge/BadgeDTO;Lru/ozon/uni/atoms/data/controls/CommonControlSettings;Ljava/util/List;)V", "getPromotionBadges", "()Ljava/util/List;", "getSummary", "()Lru/ozon/app/android/travel/feature/railway/widgets/travelRailwaySearchResults/v4/data/TravelRailwaySearchResultsV4DTO$TrainSummaryDTO;", "getTimeInfo", "()Lru/ozon/app/android/travel/feature/railway/widgets/travelRailwaySearchResults/v4/data/TravelRailwaySearchResultsV4DTO$TimeInfoDTO;", "getRouteInfo", "getServices", "getNotificationBadge", "()Lru/ozon/uni/atoms/data/dsBadge/BadgeDTO;", "getCarriageTypes", "getPrice", "()Lru/ozon/uni/atoms/data/price/PriceDTO;", "getMilesBadge", "getCommon", "()Lru/ozon/uni/atoms/data/controls/CommonControlSettings;", "getOnboardingKeys", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "copy", "equals", "", "other", "hashCode", "", "toString", "railway_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class TrainDTO {
        public static final int $stable = 8;

        @NotNull
        private final List<CarriageTypeDTO> carriageTypes;
        private final CommonControlSettings common;
        private final BadgeDTO milesBadge;
        private final BadgeDTO notificationBadge;
        private final List<String> onboardingKeys;

        @NotNull
        private final PriceDTO price;

        @NotNull
        private final List<BadgeDTO> promotionBadges;

        @NotNull
        private final List<RouteInfoDTO> routeInfo;

        @NotNull
        private final List<IconButtonV3DTO> services;

        @NotNull
        private final TrainSummaryDTO summary;

        @NotNull
        private final TimeInfoDTO timeInfo;

        public TrainDTO(@NotNull List<BadgeDTO> promotionBadges, @NotNull TrainSummaryDTO summary, @NotNull TimeInfoDTO timeInfo, @NotNull List<RouteInfoDTO> routeInfo, @NotNull List<IconButtonV3DTO> services, BadgeDTO badgeDTO, @NotNull List<CarriageTypeDTO> carriageTypes, @NotNull PriceDTO price, BadgeDTO badgeDTO2, CommonControlSettings commonControlSettings, List<String> list) {
            Intrinsics.checkNotNullParameter(promotionBadges, "promotionBadges");
            Intrinsics.checkNotNullParameter(summary, "summary");
            Intrinsics.checkNotNullParameter(timeInfo, "timeInfo");
            Intrinsics.checkNotNullParameter(routeInfo, "routeInfo");
            Intrinsics.checkNotNullParameter(services, "services");
            Intrinsics.checkNotNullParameter(carriageTypes, "carriageTypes");
            Intrinsics.checkNotNullParameter(price, "price");
            this.promotionBadges = promotionBadges;
            this.summary = summary;
            this.timeInfo = timeInfo;
            this.routeInfo = routeInfo;
            this.services = services;
            this.notificationBadge = badgeDTO;
            this.carriageTypes = carriageTypes;
            this.price = price;
            this.milesBadge = badgeDTO2;
            this.common = commonControlSettings;
            this.onboardingKeys = list;
        }

        public static /* synthetic */ TrainDTO copy$default(TrainDTO trainDTO, List list, TrainSummaryDTO trainSummaryDTO, TimeInfoDTO timeInfoDTO, List list2, List list3, BadgeDTO badgeDTO, List list4, PriceDTO priceDTO, BadgeDTO badgeDTO2, CommonControlSettings commonControlSettings, List list5, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                list = trainDTO.promotionBadges;
            }
            if ((i11 & 2) != 0) {
                trainSummaryDTO = trainDTO.summary;
            }
            if ((i11 & 4) != 0) {
                timeInfoDTO = trainDTO.timeInfo;
            }
            if ((i11 & 8) != 0) {
                list2 = trainDTO.routeInfo;
            }
            if ((i11 & 16) != 0) {
                list3 = trainDTO.services;
            }
            if ((i11 & 32) != 0) {
                badgeDTO = trainDTO.notificationBadge;
            }
            if ((i11 & 64) != 0) {
                list4 = trainDTO.carriageTypes;
            }
            if ((i11 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0) {
                priceDTO = trainDTO.price;
            }
            if ((i11 & 256) != 0) {
                badgeDTO2 = trainDTO.milesBadge;
            }
            if ((i11 & UserVerificationMethods.USER_VERIFY_NONE) != 0) {
                commonControlSettings = trainDTO.common;
            }
            if ((i11 & UserVerificationMethods.USER_VERIFY_ALL) != 0) {
                list5 = trainDTO.onboardingKeys;
            }
            CommonControlSettings commonControlSettings2 = commonControlSettings;
            List list6 = list5;
            PriceDTO priceDTO2 = priceDTO;
            BadgeDTO badgeDTO3 = badgeDTO2;
            BadgeDTO badgeDTO4 = badgeDTO;
            List list7 = list4;
            List list8 = list3;
            TimeInfoDTO timeInfoDTO2 = timeInfoDTO;
            return trainDTO.copy(list, trainSummaryDTO, timeInfoDTO2, list2, list8, badgeDTO4, list7, priceDTO2, badgeDTO3, commonControlSettings2, list6);
        }

        @NotNull
        public final List<BadgeDTO> component1() {
            return this.promotionBadges;
        }

        /* renamed from: component10, reason: from getter */
        public final CommonControlSettings getCommon() {
            return this.common;
        }

        public final List<String> component11() {
            return this.onboardingKeys;
        }

        @NotNull
        /* renamed from: component2, reason: from getter */
        public final TrainSummaryDTO getSummary() {
            return this.summary;
        }

        @NotNull
        /* renamed from: component3, reason: from getter */
        public final TimeInfoDTO getTimeInfo() {
            return this.timeInfo;
        }

        @NotNull
        public final List<RouteInfoDTO> component4() {
            return this.routeInfo;
        }

        @NotNull
        public final List<IconButtonV3DTO> component5() {
            return this.services;
        }

        /* renamed from: component6, reason: from getter */
        public final BadgeDTO getNotificationBadge() {
            return this.notificationBadge;
        }

        @NotNull
        public final List<CarriageTypeDTO> component7() {
            return this.carriageTypes;
        }

        @NotNull
        /* renamed from: component8, reason: from getter */
        public final PriceDTO getPrice() {
            return this.price;
        }

        /* renamed from: component9, reason: from getter */
        public final BadgeDTO getMilesBadge() {
            return this.milesBadge;
        }

        @NotNull
        public final TrainDTO copy(@NotNull List<BadgeDTO> promotionBadges, @NotNull TrainSummaryDTO summary, @NotNull TimeInfoDTO timeInfo, @NotNull List<RouteInfoDTO> routeInfo, @NotNull List<IconButtonV3DTO> services, BadgeDTO notificationBadge, @NotNull List<CarriageTypeDTO> carriageTypes, @NotNull PriceDTO price, BadgeDTO milesBadge, CommonControlSettings common, List<String> onboardingKeys) {
            Intrinsics.checkNotNullParameter(promotionBadges, "promotionBadges");
            Intrinsics.checkNotNullParameter(summary, "summary");
            Intrinsics.checkNotNullParameter(timeInfo, "timeInfo");
            Intrinsics.checkNotNullParameter(routeInfo, "routeInfo");
            Intrinsics.checkNotNullParameter(services, "services");
            Intrinsics.checkNotNullParameter(carriageTypes, "carriageTypes");
            Intrinsics.checkNotNullParameter(price, "price");
            return new TrainDTO(promotionBadges, summary, timeInfo, routeInfo, services, notificationBadge, carriageTypes, price, milesBadge, common, onboardingKeys);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof TrainDTO)) {
                return false;
            }
            TrainDTO trainDTO = (TrainDTO) other;
            return Intrinsics.d(this.promotionBadges, trainDTO.promotionBadges) && Intrinsics.d(this.summary, trainDTO.summary) && Intrinsics.d(this.timeInfo, trainDTO.timeInfo) && Intrinsics.d(this.routeInfo, trainDTO.routeInfo) && Intrinsics.d(this.services, trainDTO.services) && Intrinsics.d(this.notificationBadge, trainDTO.notificationBadge) && Intrinsics.d(this.carriageTypes, trainDTO.carriageTypes) && Intrinsics.d(this.price, trainDTO.price) && Intrinsics.d(this.milesBadge, trainDTO.milesBadge) && Intrinsics.d(this.common, trainDTO.common) && Intrinsics.d(this.onboardingKeys, trainDTO.onboardingKeys);
        }

        @NotNull
        public final List<CarriageTypeDTO> getCarriageTypes() {
            return this.carriageTypes;
        }

        public final CommonControlSettings getCommon() {
            return this.common;
        }

        public final BadgeDTO getMilesBadge() {
            return this.milesBadge;
        }

        public final BadgeDTO getNotificationBadge() {
            return this.notificationBadge;
        }

        public final List<String> getOnboardingKeys() {
            return this.onboardingKeys;
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
        public final List<RouteInfoDTO> getRouteInfo() {
            return this.routeInfo;
        }

        @NotNull
        public final List<IconButtonV3DTO> getServices() {
            return this.services;
        }

        @NotNull
        public final TrainSummaryDTO getSummary() {
            return this.summary;
        }

        @NotNull
        public final TimeInfoDTO getTimeInfo() {
            return this.timeInfo;
        }

        public int hashCode() {
            int b11 = G.g.b(G.g.b((this.timeInfo.hashCode() + ((this.summary.hashCode() + (this.promotionBadges.hashCode() * 31)) * 31)) * 31, 31, this.routeInfo), 31, this.services);
            BadgeDTO badgeDTO = this.notificationBadge;
            int b12 = C3051a.b(this.price, G.g.b((b11 + (badgeDTO == null ? 0 : badgeDTO.hashCode())) * 31, 31, this.carriageTypes), 31);
            BadgeDTO badgeDTO2 = this.milesBadge;
            int hashCode = (b12 + (badgeDTO2 == null ? 0 : badgeDTO2.hashCode())) * 31;
            CommonControlSettings commonControlSettings = this.common;
            int hashCode2 = (hashCode + (commonControlSettings == null ? 0 : commonControlSettings.hashCode())) * 31;
            List<String> list = this.onboardingKeys;
            return hashCode2 + (list != null ? list.hashCode() : 0);
        }

        @NotNull
        public String toString() {
            List<BadgeDTO> list = this.promotionBadges;
            TrainSummaryDTO trainSummaryDTO = this.summary;
            TimeInfoDTO timeInfoDTO = this.timeInfo;
            List<RouteInfoDTO> list2 = this.routeInfo;
            List<IconButtonV3DTO> list3 = this.services;
            BadgeDTO badgeDTO = this.notificationBadge;
            List<CarriageTypeDTO> list4 = this.carriageTypes;
            PriceDTO priceDTO = this.price;
            BadgeDTO badgeDTO2 = this.milesBadge;
            CommonControlSettings commonControlSettings = this.common;
            List<String> list5 = this.onboardingKeys;
            StringBuilder sb2 = new StringBuilder("TrainDTO(promotionBadges=");
            sb2.append(list);
            sb2.append(", summary=");
            sb2.append(trainSummaryDTO);
            sb2.append(", timeInfo=");
            sb2.append(timeInfoDTO);
            sb2.append(", routeInfo=");
            sb2.append(list2);
            sb2.append(", services=");
            sb2.append(list3);
            sb2.append(", notificationBadge=");
            sb2.append(badgeDTO);
            sb2.append(", carriageTypes=");
            sb2.append(list4);
            sb2.append(", price=");
            sb2.append(priceDTO);
            sb2.append(", milesBadge=");
            sb2.append(badgeDTO2);
            sb2.append(", common=");
            sb2.append(commonControlSettings);
            sb2.append(", onboardingKeys=");
            return C2618u.h(sb2, list5, ")");
        }

        public TrainDTO(List list, TrainSummaryDTO trainSummaryDTO, TimeInfoDTO timeInfoDTO, List list2, List list3, BadgeDTO badgeDTO, List list4, PriceDTO priceDTO, BadgeDTO badgeDTO2, CommonControlSettings commonControlSettings, List list5, int i11, DefaultConstructorMarker defaultConstructorMarker) {
            this((i11 & 1) != 0 ? K.f71697a : list, trainSummaryDTO, timeInfoDTO, (i11 & 8) != 0 ? K.f71697a : list2, (i11 & 16) != 0 ? K.f71697a : list3, badgeDTO, (i11 & 64) != 0 ? K.f71697a : list4, priceDTO, badgeDTO2, commonControlSettings, list5);
        }
    }
}
