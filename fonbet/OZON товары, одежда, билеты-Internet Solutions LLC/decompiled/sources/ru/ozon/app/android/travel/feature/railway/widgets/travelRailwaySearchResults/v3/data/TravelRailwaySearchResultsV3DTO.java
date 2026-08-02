package ru.ozon.app.android.travel.feature.railway.widgets.travelRailwaySearchResults.v3.data;

import D3.g;
import D40.d;
import El.C2971a;
import Fm.C3051a;
import Gl.C3124a;
import Ns.b;
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
import ru.ozon.app.android.storefront.widgets.feedback.result.data.ResultDTO;
import ru.ozon.uni.atoms.data.AtomActionDTO;
import ru.ozon.uni.atoms.data.controls.CommonControlSettings;
import ru.ozon.uni.atoms.data.controls.button.IconButtonV3DTO;
import ru.ozon.uni.atoms.data.dsBadge.BadgeDTO;
import ru.ozon.uni.atoms.data.icon.IconDTO;
import ru.ozon.uni.atoms.data.price.PriceDTO;
import ru.ozon.uni.atoms.data.text.TextDTO;

@j(generateAdapter = true)
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\b\u0081\b\u0018\u00002\u00020\u0001:\u0002\"#BA\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\u0014\u0010\t\u001a\u0010\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f\u0018\u00010\n¢\u0006\u0004\b\r\u0010\u000eJ\u000b\u0010\u0017\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0003J\u000b\u0010\u0019\u001a\u0004\u0018\u00010\bHÆ\u0003J\u0017\u0010\u001a\u001a\u0010\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f\u0018\u00010\nHÆ\u0003JI\u0010\u001b\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b2\u0016\b\u0002\u0010\t\u001a\u0010\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f\u0018\u00010\nHÆ\u0001J\u0013\u0010\u001c\u001a\u00020\u001d2\b\u0010\u001e\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001f\u001a\u00020 HÖ\u0001J\t\u0010!\u001a\u00020\u000bHÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0013\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u001f\u0010\t\u001a\u0010\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f\u0018\u00010\n¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016¨\u0006$"}, d2 = {"Lru/ozon/app/android/travel/feature/railway/widgets/travelRailwaySearchResults/v3/data/TravelRailwaySearchResultsV3DTO;", "", "requestTrainsAction", "Lru/ozon/uni/atoms/data/AtomActionDTO;", "trains", "", "Lru/ozon/app/android/travel/feature/railway/widgets/travelRailwaySearchResults/v3/data/TravelRailwaySearchResultsV3DTO$TrainDTO;", "onboardingApp", "Lru/ozon/app/android/composer/widgets/v2/onboarding/data/OnBoardingDTO;", "trackingInfo", "", "", "Lru/ozon/android/tokenized/model/TokenizedTrackingInfo;", "<init>", "(Lru/ozon/uni/atoms/data/AtomActionDTO;Ljava/util/List;Lru/ozon/app/android/composer/widgets/v2/onboarding/data/OnBoardingDTO;Ljava/util/Map;)V", "getRequestTrainsAction", "()Lru/ozon/uni/atoms/data/AtomActionDTO;", "getTrains", "()Ljava/util/List;", "getOnboardingApp", "()Lru/ozon/app/android/composer/widgets/v2/onboarding/data/OnBoardingDTO;", "getTrackingInfo", "()Ljava/util/Map;", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "", "toString", "TrainDTO", "CarriageTypeDTO", "railway_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class TravelRailwaySearchResultsV3DTO {
    public static final int $stable = 8;
    private final OnBoardingDTO onboardingApp;
    private final AtomActionDTO requestTrainsAction;
    private final Map<String, TokenizedTrackingInfo> trackingInfo;

    @NotNull
    private final List<TrainDTO> trains;

    @j(generateAdapter = true)
    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0010\u001a\u0004\u0018\u00010\u0006HÆ\u0003J)\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006HÆ\u0001J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001J\t\u0010\u0017\u001a\u00020\u0018HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\nR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\r¨\u0006\u0019"}, d2 = {"Lru/ozon/app/android/travel/feature/railway/widgets/travelRailwaySearchResults/v3/data/TravelRailwaySearchResultsV3DTO$CarriageTypeDTO;", "", "typeName", "Lru/ozon/uni/atoms/data/text/TextDTO;", "seatsCount", "typePrice", "Lru/ozon/uni/atoms/data/price/PriceDTO;", "<init>", "(Lru/ozon/uni/atoms/data/text/TextDTO;Lru/ozon/uni/atoms/data/text/TextDTO;Lru/ozon/uni/atoms/data/price/PriceDTO;)V", "getTypeName", "()Lru/ozon/uni/atoms/data/text/TextDTO;", "getSeatsCount", "getTypePrice", "()Lru/ozon/uni/atoms/data/price/PriceDTO;", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "", "railway_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
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

    public TravelRailwaySearchResultsV3DTO(AtomActionDTO atomActionDTO, @NotNull List<TrainDTO> trains, OnBoardingDTO onBoardingDTO, Map<String, TokenizedTrackingInfo> map) {
        Intrinsics.checkNotNullParameter(trains, "trains");
        this.requestTrainsAction = atomActionDTO;
        this.trains = trains;
        this.onboardingApp = onBoardingDTO;
        this.trackingInfo = map;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ TravelRailwaySearchResultsV3DTO copy$default(TravelRailwaySearchResultsV3DTO travelRailwaySearchResultsV3DTO, AtomActionDTO atomActionDTO, List list, OnBoardingDTO onBoardingDTO, Map map, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            atomActionDTO = travelRailwaySearchResultsV3DTO.requestTrainsAction;
        }
        if ((i11 & 2) != 0) {
            list = travelRailwaySearchResultsV3DTO.trains;
        }
        if ((i11 & 4) != 0) {
            onBoardingDTO = travelRailwaySearchResultsV3DTO.onboardingApp;
        }
        if ((i11 & 8) != 0) {
            map = travelRailwaySearchResultsV3DTO.trackingInfo;
        }
        return travelRailwaySearchResultsV3DTO.copy(atomActionDTO, list, onBoardingDTO, map);
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

    public final Map<String, TokenizedTrackingInfo> component4() {
        return this.trackingInfo;
    }

    @NotNull
    public final TravelRailwaySearchResultsV3DTO copy(AtomActionDTO requestTrainsAction, @NotNull List<TrainDTO> trains, OnBoardingDTO onboardingApp, Map<String, TokenizedTrackingInfo> trackingInfo) {
        Intrinsics.checkNotNullParameter(trains, "trains");
        return new TravelRailwaySearchResultsV3DTO(requestTrainsAction, trains, onboardingApp, trackingInfo);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof TravelRailwaySearchResultsV3DTO)) {
            return false;
        }
        TravelRailwaySearchResultsV3DTO travelRailwaySearchResultsV3DTO = (TravelRailwaySearchResultsV3DTO) other;
        return Intrinsics.d(this.requestTrainsAction, travelRailwaySearchResultsV3DTO.requestTrainsAction) && Intrinsics.d(this.trains, travelRailwaySearchResultsV3DTO.trains) && Intrinsics.d(this.onboardingApp, travelRailwaySearchResultsV3DTO.onboardingApp) && Intrinsics.d(this.trackingInfo, travelRailwaySearchResultsV3DTO.trackingInfo);
    }

    public final OnBoardingDTO getOnboardingApp() {
        return this.onboardingApp;
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
        Map<String, TokenizedTrackingInfo> map = this.trackingInfo;
        return hashCode + (map != null ? map.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "TravelRailwaySearchResultsV3DTO(requestTrainsAction=" + this.requestTrainsAction + ", trains=" + this.trains + ", onboardingApp=" + this.onboardingApp + ", trackingInfo=" + this.trackingInfo + ")";
    }

    public TravelRailwaySearchResultsV3DTO(AtomActionDTO atomActionDTO, List list, OnBoardingDTO onBoardingDTO, Map map, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(atomActionDTO, (i11 & 2) != 0 ? K.f71697a : list, onBoardingDTO, map);
    }

    @j(generateAdapter = true)
    @Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b*\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B§\u0001\u0012\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\u0004\u0012\u0006\u0010\n\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\b\u0012\u0006\u0010\f\u001a\u00020\b\u0012\b\u0010\r\u001a\u0004\u0018\u00010\b\u0012\u0006\u0010\u000e\u001a\u00020\b\u0012\u0006\u0010\u000f\u001a\u00020\b\u0012\u000e\b\u0002\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00110\u0003\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0004\u0012\u000e\b\u0002\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00140\u0003\u0012\u0006\u0010\u0015\u001a\u00020\u0016\u0012\b\u0010\u0017\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0018\u001a\u0004\u0018\u00010\u0019¢\u0006\u0004\b\u001a\u0010\u001bJ\u000f\u00102\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\t\u00103\u001a\u00020\u0006HÆ\u0003J\t\u00104\u001a\u00020\bHÆ\u0003J\t\u00105\u001a\u00020\u0004HÆ\u0003J\t\u00106\u001a\u00020\bHÆ\u0003J\t\u00107\u001a\u00020\bHÆ\u0003J\t\u00108\u001a\u00020\bHÆ\u0003J\u000b\u00109\u001a\u0004\u0018\u00010\bHÆ\u0003J\t\u0010:\u001a\u00020\bHÆ\u0003J\t\u0010;\u001a\u00020\bHÆ\u0003J\u000f\u0010<\u001a\b\u0012\u0004\u0012\u00020\u00110\u0003HÆ\u0003J\u000b\u0010=\u001a\u0004\u0018\u00010\u0004HÆ\u0003J\u000f\u0010>\u001a\b\u0012\u0004\u0012\u00020\u00140\u0003HÆ\u0003J\t\u0010?\u001a\u00020\u0016HÆ\u0003J\u000b\u0010@\u001a\u0004\u0018\u00010\u0004HÆ\u0003J\u000b\u0010A\u001a\u0004\u0018\u00010\u0019HÆ\u0003JÃ\u0001\u0010B\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\u00042\b\b\u0002\u0010\n\u001a\u00020\b2\b\b\u0002\u0010\u000b\u001a\u00020\b2\b\b\u0002\u0010\f\u001a\u00020\b2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\b2\b\b\u0002\u0010\u000e\u001a\u00020\b2\b\b\u0002\u0010\u000f\u001a\u00020\b2\u000e\b\u0002\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00110\u00032\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00042\u000e\b\u0002\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00140\u00032\b\b\u0002\u0010\u0015\u001a\u00020\u00162\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u0019HÆ\u0001J\u0013\u0010C\u001a\u00020D2\b\u0010E\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010F\u001a\u00020GHÖ\u0001J\t\u0010H\u001a\u00020IHÖ\u0001R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001dR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001fR\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b \u0010!R\u0011\u0010\t\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010#R\u0011\u0010\n\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b$\u0010!R\u0011\u0010\u000b\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b%\u0010!R\u0011\u0010\f\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b&\u0010!R\u0013\u0010\r\u001a\u0004\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\b'\u0010!R\u0011\u0010\u000e\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b(\u0010!R\u0011\u0010\u000f\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b)\u0010!R\u0017\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00110\u0003¢\u0006\b\n\u0000\u001a\u0004\b*\u0010\u001dR\u0013\u0010\u0012\u001a\u0004\u0018\u00010\u0004¢\u0006\b\n\u0000\u001a\u0004\b+\u0010#R\u0017\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00140\u0003¢\u0006\b\n\u0000\u001a\u0004\b,\u0010\u001dR\u0011\u0010\u0015\u001a\u00020\u0016¢\u0006\b\n\u0000\u001a\u0004\b-\u0010.R\u0013\u0010\u0017\u001a\u0004\u0018\u00010\u0004¢\u0006\b\n\u0000\u001a\u0004\b/\u0010#R\u0013\u0010\u0018\u001a\u0004\u0018\u00010\u0019¢\u0006\b\n\u0000\u001a\u0004\b0\u00101¨\u0006J"}, d2 = {"Lru/ozon/app/android/travel/feature/railway/widgets/travelRailwaySearchResults/v3/data/TravelRailwaySearchResultsV3DTO$TrainDTO;", "", "promotionBadges", "", "Lru/ozon/uni/atoms/data/dsBadge/BadgeDTO;", "trainIcon", "Lru/ozon/uni/atoms/data/icon/IconDTO;", "trainName", "Lru/ozon/uni/atoms/data/text/TextDTO;", "route", "travelTime", "travelTimeCaption", "departureArrivalTimes", "dayDifference", "departureStation", "arrivalStation", ResultDTO.CONTENT_TYPE_SERVICES, "Lru/ozon/uni/atoms/data/controls/button/IconButtonV3DTO;", "notificationBadge", "carriageTypes", "Lru/ozon/app/android/travel/feature/railway/widgets/travelRailwaySearchResults/v3/data/TravelRailwaySearchResultsV3DTO$CarriageTypeDTO;", "price", "Lru/ozon/uni/atoms/data/price/PriceDTO;", "milesBadge", "common", "Lru/ozon/uni/atoms/data/controls/CommonControlSettings;", "<init>", "(Ljava/util/List;Lru/ozon/uni/atoms/data/icon/IconDTO;Lru/ozon/uni/atoms/data/text/TextDTO;Lru/ozon/uni/atoms/data/dsBadge/BadgeDTO;Lru/ozon/uni/atoms/data/text/TextDTO;Lru/ozon/uni/atoms/data/text/TextDTO;Lru/ozon/uni/atoms/data/text/TextDTO;Lru/ozon/uni/atoms/data/text/TextDTO;Lru/ozon/uni/atoms/data/text/TextDTO;Lru/ozon/uni/atoms/data/text/TextDTO;Ljava/util/List;Lru/ozon/uni/atoms/data/dsBadge/BadgeDTO;Ljava/util/List;Lru/ozon/uni/atoms/data/price/PriceDTO;Lru/ozon/uni/atoms/data/dsBadge/BadgeDTO;Lru/ozon/uni/atoms/data/controls/CommonControlSettings;)V", "getPromotionBadges", "()Ljava/util/List;", "getTrainIcon", "()Lru/ozon/uni/atoms/data/icon/IconDTO;", "getTrainName", "()Lru/ozon/uni/atoms/data/text/TextDTO;", "getRoute", "()Lru/ozon/uni/atoms/data/dsBadge/BadgeDTO;", "getTravelTime", "getTravelTimeCaption", "getDepartureArrivalTimes", "getDayDifference", "getDepartureStation", "getArrivalStation", "getServices", "getNotificationBadge", "getCarriageTypes", "getPrice", "()Lru/ozon/uni/atoms/data/price/PriceDTO;", "getMilesBadge", "getCommon", "()Lru/ozon/uni/atoms/data/controls/CommonControlSettings;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "copy", "equals", "", "other", "hashCode", "", "toString", "", "railway_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class TrainDTO {
        public static final int $stable = 8;

        @NotNull
        private final TextDTO arrivalStation;

        @NotNull
        private final List<CarriageTypeDTO> carriageTypes;
        private final CommonControlSettings common;
        private final TextDTO dayDifference;

        @NotNull
        private final TextDTO departureArrivalTimes;

        @NotNull
        private final TextDTO departureStation;
        private final BadgeDTO milesBadge;
        private final BadgeDTO notificationBadge;

        @NotNull
        private final PriceDTO price;

        @NotNull
        private final List<BadgeDTO> promotionBadges;

        @NotNull
        private final BadgeDTO route;

        @NotNull
        private final List<IconButtonV3DTO> services;

        @NotNull
        private final IconDTO trainIcon;

        @NotNull
        private final TextDTO trainName;

        @NotNull
        private final TextDTO travelTime;

        @NotNull
        private final TextDTO travelTimeCaption;

        public TrainDTO(@NotNull List<BadgeDTO> promotionBadges, @NotNull IconDTO trainIcon, @NotNull TextDTO trainName, @NotNull BadgeDTO route, @NotNull TextDTO travelTime, @NotNull TextDTO travelTimeCaption, @NotNull TextDTO departureArrivalTimes, TextDTO textDTO, @NotNull TextDTO departureStation, @NotNull TextDTO arrivalStation, @NotNull List<IconButtonV3DTO> services, BadgeDTO badgeDTO, @NotNull List<CarriageTypeDTO> carriageTypes, @NotNull PriceDTO price, BadgeDTO badgeDTO2, CommonControlSettings commonControlSettings) {
            Intrinsics.checkNotNullParameter(promotionBadges, "promotionBadges");
            Intrinsics.checkNotNullParameter(trainIcon, "trainIcon");
            Intrinsics.checkNotNullParameter(trainName, "trainName");
            Intrinsics.checkNotNullParameter(route, "route");
            Intrinsics.checkNotNullParameter(travelTime, "travelTime");
            Intrinsics.checkNotNullParameter(travelTimeCaption, "travelTimeCaption");
            Intrinsics.checkNotNullParameter(departureArrivalTimes, "departureArrivalTimes");
            Intrinsics.checkNotNullParameter(departureStation, "departureStation");
            Intrinsics.checkNotNullParameter(arrivalStation, "arrivalStation");
            Intrinsics.checkNotNullParameter(services, "services");
            Intrinsics.checkNotNullParameter(carriageTypes, "carriageTypes");
            Intrinsics.checkNotNullParameter(price, "price");
            this.promotionBadges = promotionBadges;
            this.trainIcon = trainIcon;
            this.trainName = trainName;
            this.route = route;
            this.travelTime = travelTime;
            this.travelTimeCaption = travelTimeCaption;
            this.departureArrivalTimes = departureArrivalTimes;
            this.dayDifference = textDTO;
            this.departureStation = departureStation;
            this.arrivalStation = arrivalStation;
            this.services = services;
            this.notificationBadge = badgeDTO;
            this.carriageTypes = carriageTypes;
            this.price = price;
            this.milesBadge = badgeDTO2;
            this.common = commonControlSettings;
        }

        @NotNull
        public final List<BadgeDTO> component1() {
            return this.promotionBadges;
        }

        @NotNull
        /* renamed from: component10, reason: from getter */
        public final TextDTO getArrivalStation() {
            return this.arrivalStation;
        }

        @NotNull
        public final List<IconButtonV3DTO> component11() {
            return this.services;
        }

        /* renamed from: component12, reason: from getter */
        public final BadgeDTO getNotificationBadge() {
            return this.notificationBadge;
        }

        @NotNull
        public final List<CarriageTypeDTO> component13() {
            return this.carriageTypes;
        }

        @NotNull
        /* renamed from: component14, reason: from getter */
        public final PriceDTO getPrice() {
            return this.price;
        }

        /* renamed from: component15, reason: from getter */
        public final BadgeDTO getMilesBadge() {
            return this.milesBadge;
        }

        /* renamed from: component16, reason: from getter */
        public final CommonControlSettings getCommon() {
            return this.common;
        }

        @NotNull
        /* renamed from: component2, reason: from getter */
        public final IconDTO getTrainIcon() {
            return this.trainIcon;
        }

        @NotNull
        /* renamed from: component3, reason: from getter */
        public final TextDTO getTrainName() {
            return this.trainName;
        }

        @NotNull
        /* renamed from: component4, reason: from getter */
        public final BadgeDTO getRoute() {
            return this.route;
        }

        @NotNull
        /* renamed from: component5, reason: from getter */
        public final TextDTO getTravelTime() {
            return this.travelTime;
        }

        @NotNull
        /* renamed from: component6, reason: from getter */
        public final TextDTO getTravelTimeCaption() {
            return this.travelTimeCaption;
        }

        @NotNull
        /* renamed from: component7, reason: from getter */
        public final TextDTO getDepartureArrivalTimes() {
            return this.departureArrivalTimes;
        }

        /* renamed from: component8, reason: from getter */
        public final TextDTO getDayDifference() {
            return this.dayDifference;
        }

        @NotNull
        /* renamed from: component9, reason: from getter */
        public final TextDTO getDepartureStation() {
            return this.departureStation;
        }

        @NotNull
        public final TrainDTO copy(@NotNull List<BadgeDTO> promotionBadges, @NotNull IconDTO trainIcon, @NotNull TextDTO trainName, @NotNull BadgeDTO route, @NotNull TextDTO travelTime, @NotNull TextDTO travelTimeCaption, @NotNull TextDTO departureArrivalTimes, TextDTO dayDifference, @NotNull TextDTO departureStation, @NotNull TextDTO arrivalStation, @NotNull List<IconButtonV3DTO> services, BadgeDTO notificationBadge, @NotNull List<CarriageTypeDTO> carriageTypes, @NotNull PriceDTO price, BadgeDTO milesBadge, CommonControlSettings common) {
            Intrinsics.checkNotNullParameter(promotionBadges, "promotionBadges");
            Intrinsics.checkNotNullParameter(trainIcon, "trainIcon");
            Intrinsics.checkNotNullParameter(trainName, "trainName");
            Intrinsics.checkNotNullParameter(route, "route");
            Intrinsics.checkNotNullParameter(travelTime, "travelTime");
            Intrinsics.checkNotNullParameter(travelTimeCaption, "travelTimeCaption");
            Intrinsics.checkNotNullParameter(departureArrivalTimes, "departureArrivalTimes");
            Intrinsics.checkNotNullParameter(departureStation, "departureStation");
            Intrinsics.checkNotNullParameter(arrivalStation, "arrivalStation");
            Intrinsics.checkNotNullParameter(services, "services");
            Intrinsics.checkNotNullParameter(carriageTypes, "carriageTypes");
            Intrinsics.checkNotNullParameter(price, "price");
            return new TrainDTO(promotionBadges, trainIcon, trainName, route, travelTime, travelTimeCaption, departureArrivalTimes, dayDifference, departureStation, arrivalStation, services, notificationBadge, carriageTypes, price, milesBadge, common);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof TrainDTO)) {
                return false;
            }
            TrainDTO trainDTO = (TrainDTO) other;
            return Intrinsics.d(this.promotionBadges, trainDTO.promotionBadges) && Intrinsics.d(this.trainIcon, trainDTO.trainIcon) && Intrinsics.d(this.trainName, trainDTO.trainName) && Intrinsics.d(this.route, trainDTO.route) && Intrinsics.d(this.travelTime, trainDTO.travelTime) && Intrinsics.d(this.travelTimeCaption, trainDTO.travelTimeCaption) && Intrinsics.d(this.departureArrivalTimes, trainDTO.departureArrivalTimes) && Intrinsics.d(this.dayDifference, trainDTO.dayDifference) && Intrinsics.d(this.departureStation, trainDTO.departureStation) && Intrinsics.d(this.arrivalStation, trainDTO.arrivalStation) && Intrinsics.d(this.services, trainDTO.services) && Intrinsics.d(this.notificationBadge, trainDTO.notificationBadge) && Intrinsics.d(this.carriageTypes, trainDTO.carriageTypes) && Intrinsics.d(this.price, trainDTO.price) && Intrinsics.d(this.milesBadge, trainDTO.milesBadge) && Intrinsics.d(this.common, trainDTO.common);
        }

        @NotNull
        public final TextDTO getArrivalStation() {
            return this.arrivalStation;
        }

        @NotNull
        public final List<CarriageTypeDTO> getCarriageTypes() {
            return this.carriageTypes;
        }

        public final CommonControlSettings getCommon() {
            return this.common;
        }

        public final TextDTO getDayDifference() {
            return this.dayDifference;
        }

        @NotNull
        public final TextDTO getDepartureArrivalTimes() {
            return this.departureArrivalTimes;
        }

        @NotNull
        public final TextDTO getDepartureStation() {
            return this.departureStation;
        }

        public final BadgeDTO getMilesBadge() {
            return this.milesBadge;
        }

        public final BadgeDTO getNotificationBadge() {
            return this.notificationBadge;
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
        public final BadgeDTO getRoute() {
            return this.route;
        }

        @NotNull
        public final List<IconButtonV3DTO> getServices() {
            return this.services;
        }

        @NotNull
        public final IconDTO getTrainIcon() {
            return this.trainIcon;
        }

        @NotNull
        public final TextDTO getTrainName() {
            return this.trainName;
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
            int a11 = b.a(this.departureArrivalTimes, b.a(this.travelTimeCaption, b.a(this.travelTime, C3124a.c(this.route, b.a(this.trainName, C2971a.a(this.trainIcon, this.promotionBadges.hashCode() * 31, 31), 31), 31), 31), 31), 31);
            TextDTO textDTO = this.dayDifference;
            int b11 = G.g.b(b.a(this.arrivalStation, b.a(this.departureStation, (a11 + (textDTO == null ? 0 : textDTO.hashCode())) * 31, 31), 31), 31, this.services);
            BadgeDTO badgeDTO = this.notificationBadge;
            int b12 = C3051a.b(this.price, G.g.b((b11 + (badgeDTO == null ? 0 : badgeDTO.hashCode())) * 31, 31, this.carriageTypes), 31);
            BadgeDTO badgeDTO2 = this.milesBadge;
            int hashCode = (b12 + (badgeDTO2 == null ? 0 : badgeDTO2.hashCode())) * 31;
            CommonControlSettings commonControlSettings = this.common;
            return hashCode + (commonControlSettings != null ? commonControlSettings.hashCode() : 0);
        }

        @NotNull
        public String toString() {
            List<BadgeDTO> list = this.promotionBadges;
            IconDTO iconDTO = this.trainIcon;
            TextDTO textDTO = this.trainName;
            BadgeDTO badgeDTO = this.route;
            TextDTO textDTO2 = this.travelTime;
            TextDTO textDTO3 = this.travelTimeCaption;
            TextDTO textDTO4 = this.departureArrivalTimes;
            TextDTO textDTO5 = this.dayDifference;
            TextDTO textDTO6 = this.departureStation;
            TextDTO textDTO7 = this.arrivalStation;
            List<IconButtonV3DTO> list2 = this.services;
            BadgeDTO badgeDTO2 = this.notificationBadge;
            List<CarriageTypeDTO> list3 = this.carriageTypes;
            PriceDTO priceDTO = this.price;
            BadgeDTO badgeDTO3 = this.milesBadge;
            CommonControlSettings commonControlSettings = this.common;
            StringBuilder sb2 = new StringBuilder("TrainDTO(promotionBadges=");
            sb2.append(list);
            sb2.append(", trainIcon=");
            sb2.append(iconDTO);
            sb2.append(", trainName=");
            sb2.append(textDTO);
            sb2.append(", route=");
            sb2.append(badgeDTO);
            sb2.append(", travelTime=");
            d.e(", travelTimeCaption=", ", departureArrivalTimes=", sb2, textDTO2, textDTO3);
            d.e(", dayDifference=", ", departureStation=", sb2, textDTO4, textDTO5);
            d.e(", arrivalStation=", ", services=", sb2, textDTO6, textDTO7);
            sb2.append(list2);
            sb2.append(", notificationBadge=");
            sb2.append(badgeDTO2);
            sb2.append(", carriageTypes=");
            sb2.append(list3);
            sb2.append(", price=");
            sb2.append(priceDTO);
            sb2.append(", milesBadge=");
            sb2.append(badgeDTO3);
            sb2.append(", common=");
            sb2.append(commonControlSettings);
            sb2.append(")");
            return sb2.toString();
        }

        public TrainDTO(List list, IconDTO iconDTO, TextDTO textDTO, BadgeDTO badgeDTO, TextDTO textDTO2, TextDTO textDTO3, TextDTO textDTO4, TextDTO textDTO5, TextDTO textDTO6, TextDTO textDTO7, List list2, BadgeDTO badgeDTO2, List list3, PriceDTO priceDTO, BadgeDTO badgeDTO3, CommonControlSettings commonControlSettings, int i11, DefaultConstructorMarker defaultConstructorMarker) {
            this((i11 & 1) != 0 ? K.f71697a : list, iconDTO, textDTO, badgeDTO, textDTO2, textDTO3, textDTO4, textDTO5, textDTO6, textDTO7, (i11 & UserVerificationMethods.USER_VERIFY_ALL) != 0 ? K.f71697a : list2, badgeDTO2, (i11 & 4096) != 0 ? K.f71697a : list3, priceDTO, badgeDTO3, commonControlSettings);
        }
    }
}
