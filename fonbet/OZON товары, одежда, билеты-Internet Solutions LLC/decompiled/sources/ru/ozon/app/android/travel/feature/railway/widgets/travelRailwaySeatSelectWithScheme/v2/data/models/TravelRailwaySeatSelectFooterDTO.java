package ru.ozon.app.android.travel.feature.railway.widgets.travelRailwaySeatSelectWithScheme.v2.data.models;

import Tl.b;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import com.squareup.moshi.j;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.atoms.data.cells.CellAtom;
import ru.ozon.app.android.storefront.widgets.feedback.result.data.ResultDTO;
import ru.ozon.app.android.travel.molecules.dto.railwayServices.RailwayServicesDTO;
import ru.ozon.uni.atoms.data.button.ButtonV3Atom;
import ru.ozon.uni.atoms.data.texts.TextAtom;

@j(generateAdapter = true)
@Metadata(d1 = {"\u0000j\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0019\n\u0002\u0010\u000b\n\u0002\b\u0011\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0081\b\u0018\u00002\u00020\u0001B\u009f\u0001\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\u000e\u0010\b\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\t\u0012\u000e\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\t\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u000e\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u0003\u0012\u000e\u0010\u0010\u001a\n\u0012\u0004\u0012\u00020\u0011\u0018\u00010\t\u0012\u000e\u0010\u0012\u001a\n\u0012\u0004\u0012\u00020\u0013\u0018\u00010\t\u0012\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015\u0012\b\u0010\u0016\u001a\u0004\u0018\u00010\u0013\u0012\u0006\u0010\u0017\u001a\u00020\u0018\u0012\b\u0010\u0019\u001a\u0004\u0018\u00010\u001a¢\u0006\u0004\b\u001b\u0010\u001cJ\u0006\u00103\u001a\u000204J\u000b\u00105\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u00106\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u00107\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u0011\u00108\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\tHÆ\u0003J\u0011\u00109\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\tHÆ\u0003J\u000b\u0010:\u001a\u0004\u0018\u00010\u000eHÆ\u0003J\u000b\u0010;\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0011\u0010<\u001a\n\u0012\u0004\u0012\u00020\u0011\u0018\u00010\tHÆ\u0003J\u0011\u0010=\u001a\n\u0012\u0004\u0012\u00020\u0013\u0018\u00010\tHÆ\u0003J\u000b\u0010>\u001a\u0004\u0018\u00010\u0015HÆ\u0003J\u000b\u0010?\u001a\u0004\u0018\u00010\u0013HÆ\u0003J\t\u0010@\u001a\u00020\u0018HÆ\u0003J\u000b\u0010A\u001a\u0004\u0018\u00010\u001aHÆ\u0003J»\u0001\u0010B\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\u0010\b\u0002\u0010\b\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\t2\u0010\b\u0002\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\t2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000e2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00032\u0010\b\u0002\u0010\u0010\u001a\n\u0012\u0004\u0012\u00020\u0011\u0018\u00010\t2\u0010\b\u0002\u0010\u0012\u001a\n\u0012\u0004\u0012\u00020\u0013\u0018\u00010\t2\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u00152\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u00132\b\b\u0002\u0010\u0017\u001a\u00020\u00182\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u001aHÆ\u0001J\u0013\u0010C\u001a\u0002042\b\u0010D\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010E\u001a\u00020FHÖ\u0001J\t\u0010G\u001a\u00020HHÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001eR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010 R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\"R\u0019\u0010\b\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b#\u0010$R\u0019\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b%\u0010$R\u0013\u0010\r\u001a\u0004\u0018\u00010\u000e¢\u0006\b\n\u0000\u001a\u0004\b&\u0010'R\u0013\u0010\u000f\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b(\u0010\u001eR\u0019\u0010\u0010\u001a\n\u0012\u0004\u0012\u00020\u0011\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b)\u0010$R\u0019\u0010\u0012\u001a\n\u0012\u0004\u0012\u00020\u0013\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b*\u0010$R\u0013\u0010\u0014\u001a\u0004\u0018\u00010\u0015¢\u0006\b\n\u0000\u001a\u0004\b+\u0010,R\u0013\u0010\u0016\u001a\u0004\u0018\u00010\u0013¢\u0006\b\n\u0000\u001a\u0004\b-\u0010.R\u0011\u0010\u0017\u001a\u00020\u0018¢\u0006\b\n\u0000\u001a\u0004\b/\u00100R\u0013\u0010\u0019\u001a\u0004\u0018\u00010\u001a¢\u0006\b\n\u0000\u001a\u0004\b1\u00102¨\u0006I"}, d2 = {"Lru/ozon/app/android/travel/feature/railway/widgets/travelRailwaySeatSelectWithScheme/v2/data/models/TravelRailwaySeatSelectFooterDTO;", "", "seatsLeft", "Lru/ozon/uni/atoms/data/texts/TextAtom;", ResultDTO.CONTENT_TYPE_SERVICES, "Lru/ozon/app/android/travel/molecules/dto/railwayServices/RailwayServicesDTO;", "carriageDetails", "Lru/ozon/app/android/travel/feature/railway/widgets/travelRailwaySeatSelectWithScheme/v2/data/models/CarriageDetailsDTO;", "additionalServices", "", "Lru/ozon/app/android/travel/feature/railway/widgets/travelRailwaySeatSelectWithScheme/v2/data/models/AdditionalServiceDTO;", "tariffs", "Lru/ozon/app/android/travel/feature/railway/widgets/travelRailwaySeatSelectWithScheme/v2/data/models/TariffDTO;", "premiumButton", "Lru/ozon/app/android/atoms/data/cells/CellAtom$CellAtomWithSubtitle$CellWithSubtitle24Icon;", "orderTitle", "selectedSeats", "Lru/ozon/app/android/travel/feature/railway/widgets/travelRailwaySeatSelectWithScheme/v2/data/models/SelectedSeatDTO;", "selectedOptions", "Lru/ozon/app/android/travel/feature/railway/widgets/travelRailwaySeatSelectWithScheme/v2/data/models/PriceBlockDTO;", "bonuses", "Lru/ozon/app/android/travel/feature/railway/widgets/travelRailwaySeatSelectWithScheme/v2/data/models/BonusDTO;", "orderPrice", "continueButton", "Lru/ozon/uni/atoms/data/button/ButtonV3Atom$LargeButton;", "alternativePriceBlock", "Lru/ozon/app/android/travel/feature/railway/widgets/travelRailwaySeatSelectWithScheme/v2/data/models/AlternativePriceBlockDTO;", "<init>", "(Lru/ozon/uni/atoms/data/texts/TextAtom;Lru/ozon/app/android/travel/molecules/dto/railwayServices/RailwayServicesDTO;Lru/ozon/app/android/travel/feature/railway/widgets/travelRailwaySeatSelectWithScheme/v2/data/models/CarriageDetailsDTO;Ljava/util/List;Ljava/util/List;Lru/ozon/app/android/atoms/data/cells/CellAtom$CellAtomWithSubtitle$CellWithSubtitle24Icon;Lru/ozon/uni/atoms/data/texts/TextAtom;Ljava/util/List;Ljava/util/List;Lru/ozon/app/android/travel/feature/railway/widgets/travelRailwaySeatSelectWithScheme/v2/data/models/BonusDTO;Lru/ozon/app/android/travel/feature/railway/widgets/travelRailwaySeatSelectWithScheme/v2/data/models/PriceBlockDTO;Lru/ozon/uni/atoms/data/button/ButtonV3Atom$LargeButton;Lru/ozon/app/android/travel/feature/railway/widgets/travelRailwaySeatSelectWithScheme/v2/data/models/AlternativePriceBlockDTO;)V", "getSeatsLeft", "()Lru/ozon/uni/atoms/data/texts/TextAtom;", "getServices", "()Lru/ozon/app/android/travel/molecules/dto/railwayServices/RailwayServicesDTO;", "getCarriageDetails", "()Lru/ozon/app/android/travel/feature/railway/widgets/travelRailwaySeatSelectWithScheme/v2/data/models/CarriageDetailsDTO;", "getAdditionalServices", "()Ljava/util/List;", "getTariffs", "getPremiumButton", "()Lru/ozon/app/android/atoms/data/cells/CellAtom$CellAtomWithSubtitle$CellWithSubtitle24Icon;", "getOrderTitle", "getSelectedSeats", "getSelectedOptions", "getBonuses", "()Lru/ozon/app/android/travel/feature/railway/widgets/travelRailwaySeatSelectWithScheme/v2/data/models/BonusDTO;", "getOrderPrice", "()Lru/ozon/app/android/travel/feature/railway/widgets/travelRailwaySeatSelectWithScheme/v2/data/models/PriceBlockDTO;", "getContinueButton", "()Lru/ozon/uni/atoms/data/button/ButtonV3Atom$LargeButton;", "getAlternativePriceBlock", "()Lru/ozon/app/android/travel/feature/railway/widgets/travelRailwaySeatSelectWithScheme/v2/data/models/AlternativePriceBlockDTO;", "isEmptyState", "", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "component13", "copy", "equals", "other", "hashCode", "", "toString", "", "railway_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class TravelRailwaySeatSelectFooterDTO {
    public static final int $stable = 8;
    private final List<AdditionalServiceDTO> additionalServices;
    private final AlternativePriceBlockDTO alternativePriceBlock;
    private final BonusDTO bonuses;
    private final CarriageDetailsDTO carriageDetails;

    @NotNull
    private final ButtonV3Atom.LargeButton continueButton;
    private final PriceBlockDTO orderPrice;
    private final TextAtom orderTitle;
    private final CellAtom.CellAtomWithSubtitle.CellWithSubtitle24Icon premiumButton;
    private final TextAtom seatsLeft;
    private final List<PriceBlockDTO> selectedOptions;
    private final List<SelectedSeatDTO> selectedSeats;
    private final RailwayServicesDTO services;
    private final List<TariffDTO> tariffs;

    public TravelRailwaySeatSelectFooterDTO(TextAtom textAtom, RailwayServicesDTO railwayServicesDTO, CarriageDetailsDTO carriageDetailsDTO, List<AdditionalServiceDTO> list, List<TariffDTO> list2, CellAtom.CellAtomWithSubtitle.CellWithSubtitle24Icon cellWithSubtitle24Icon, TextAtom textAtom2, List<SelectedSeatDTO> list3, List<PriceBlockDTO> list4, BonusDTO bonusDTO, PriceBlockDTO priceBlockDTO, @NotNull ButtonV3Atom.LargeButton continueButton, AlternativePriceBlockDTO alternativePriceBlockDTO) {
        Intrinsics.checkNotNullParameter(continueButton, "continueButton");
        this.seatsLeft = textAtom;
        this.services = railwayServicesDTO;
        this.carriageDetails = carriageDetailsDTO;
        this.additionalServices = list;
        this.tariffs = list2;
        this.premiumButton = cellWithSubtitle24Icon;
        this.orderTitle = textAtom2;
        this.selectedSeats = list3;
        this.selectedOptions = list4;
        this.bonuses = bonusDTO;
        this.orderPrice = priceBlockDTO;
        this.continueButton = continueButton;
        this.alternativePriceBlock = alternativePriceBlockDTO;
    }

    public static /* synthetic */ TravelRailwaySeatSelectFooterDTO copy$default(TravelRailwaySeatSelectFooterDTO travelRailwaySeatSelectFooterDTO, TextAtom textAtom, RailwayServicesDTO railwayServicesDTO, CarriageDetailsDTO carriageDetailsDTO, List list, List list2, CellAtom.CellAtomWithSubtitle.CellWithSubtitle24Icon cellWithSubtitle24Icon, TextAtom textAtom2, List list3, List list4, BonusDTO bonusDTO, PriceBlockDTO priceBlockDTO, ButtonV3Atom.LargeButton largeButton, AlternativePriceBlockDTO alternativePriceBlockDTO, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            textAtom = travelRailwaySeatSelectFooterDTO.seatsLeft;
        }
        return travelRailwaySeatSelectFooterDTO.copy(textAtom, (i11 & 2) != 0 ? travelRailwaySeatSelectFooterDTO.services : railwayServicesDTO, (i11 & 4) != 0 ? travelRailwaySeatSelectFooterDTO.carriageDetails : carriageDetailsDTO, (i11 & 8) != 0 ? travelRailwaySeatSelectFooterDTO.additionalServices : list, (i11 & 16) != 0 ? travelRailwaySeatSelectFooterDTO.tariffs : list2, (i11 & 32) != 0 ? travelRailwaySeatSelectFooterDTO.premiumButton : cellWithSubtitle24Icon, (i11 & 64) != 0 ? travelRailwaySeatSelectFooterDTO.orderTitle : textAtom2, (i11 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0 ? travelRailwaySeatSelectFooterDTO.selectedSeats : list3, (i11 & 256) != 0 ? travelRailwaySeatSelectFooterDTO.selectedOptions : list4, (i11 & UserVerificationMethods.USER_VERIFY_NONE) != 0 ? travelRailwaySeatSelectFooterDTO.bonuses : bonusDTO, (i11 & UserVerificationMethods.USER_VERIFY_ALL) != 0 ? travelRailwaySeatSelectFooterDTO.orderPrice : priceBlockDTO, (i11 & 2048) != 0 ? travelRailwaySeatSelectFooterDTO.continueButton : largeButton, (i11 & 4096) != 0 ? travelRailwaySeatSelectFooterDTO.alternativePriceBlock : alternativePriceBlockDTO);
    }

    /* renamed from: component1, reason: from getter */
    public final TextAtom getSeatsLeft() {
        return this.seatsLeft;
    }

    /* renamed from: component10, reason: from getter */
    public final BonusDTO getBonuses() {
        return this.bonuses;
    }

    /* renamed from: component11, reason: from getter */
    public final PriceBlockDTO getOrderPrice() {
        return this.orderPrice;
    }

    @NotNull
    /* renamed from: component12, reason: from getter */
    public final ButtonV3Atom.LargeButton getContinueButton() {
        return this.continueButton;
    }

    /* renamed from: component13, reason: from getter */
    public final AlternativePriceBlockDTO getAlternativePriceBlock() {
        return this.alternativePriceBlock;
    }

    /* renamed from: component2, reason: from getter */
    public final RailwayServicesDTO getServices() {
        return this.services;
    }

    /* renamed from: component3, reason: from getter */
    public final CarriageDetailsDTO getCarriageDetails() {
        return this.carriageDetails;
    }

    public final List<AdditionalServiceDTO> component4() {
        return this.additionalServices;
    }

    public final List<TariffDTO> component5() {
        return this.tariffs;
    }

    /* renamed from: component6, reason: from getter */
    public final CellAtom.CellAtomWithSubtitle.CellWithSubtitle24Icon getPremiumButton() {
        return this.premiumButton;
    }

    /* renamed from: component7, reason: from getter */
    public final TextAtom getOrderTitle() {
        return this.orderTitle;
    }

    public final List<SelectedSeatDTO> component8() {
        return this.selectedSeats;
    }

    public final List<PriceBlockDTO> component9() {
        return this.selectedOptions;
    }

    @NotNull
    public final TravelRailwaySeatSelectFooterDTO copy(TextAtom seatsLeft, RailwayServicesDTO services, CarriageDetailsDTO carriageDetails, List<AdditionalServiceDTO> additionalServices, List<TariffDTO> tariffs, CellAtom.CellAtomWithSubtitle.CellWithSubtitle24Icon premiumButton, TextAtom orderTitle, List<SelectedSeatDTO> selectedSeats, List<PriceBlockDTO> selectedOptions, BonusDTO bonuses, PriceBlockDTO orderPrice, @NotNull ButtonV3Atom.LargeButton continueButton, AlternativePriceBlockDTO alternativePriceBlock) {
        Intrinsics.checkNotNullParameter(continueButton, "continueButton");
        return new TravelRailwaySeatSelectFooterDTO(seatsLeft, services, carriageDetails, additionalServices, tariffs, premiumButton, orderTitle, selectedSeats, selectedOptions, bonuses, orderPrice, continueButton, alternativePriceBlock);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof TravelRailwaySeatSelectFooterDTO)) {
            return false;
        }
        TravelRailwaySeatSelectFooterDTO travelRailwaySeatSelectFooterDTO = (TravelRailwaySeatSelectFooterDTO) other;
        return Intrinsics.d(this.seatsLeft, travelRailwaySeatSelectFooterDTO.seatsLeft) && Intrinsics.d(this.services, travelRailwaySeatSelectFooterDTO.services) && Intrinsics.d(this.carriageDetails, travelRailwaySeatSelectFooterDTO.carriageDetails) && Intrinsics.d(this.additionalServices, travelRailwaySeatSelectFooterDTO.additionalServices) && Intrinsics.d(this.tariffs, travelRailwaySeatSelectFooterDTO.tariffs) && Intrinsics.d(this.premiumButton, travelRailwaySeatSelectFooterDTO.premiumButton) && Intrinsics.d(this.orderTitle, travelRailwaySeatSelectFooterDTO.orderTitle) && Intrinsics.d(this.selectedSeats, travelRailwaySeatSelectFooterDTO.selectedSeats) && Intrinsics.d(this.selectedOptions, travelRailwaySeatSelectFooterDTO.selectedOptions) && Intrinsics.d(this.bonuses, travelRailwaySeatSelectFooterDTO.bonuses) && Intrinsics.d(this.orderPrice, travelRailwaySeatSelectFooterDTO.orderPrice) && Intrinsics.d(this.continueButton, travelRailwaySeatSelectFooterDTO.continueButton) && Intrinsics.d(this.alternativePriceBlock, travelRailwaySeatSelectFooterDTO.alternativePriceBlock);
    }

    public final List<AdditionalServiceDTO> getAdditionalServices() {
        return this.additionalServices;
    }

    public final AlternativePriceBlockDTO getAlternativePriceBlock() {
        return this.alternativePriceBlock;
    }

    public final BonusDTO getBonuses() {
        return this.bonuses;
    }

    public final CarriageDetailsDTO getCarriageDetails() {
        return this.carriageDetails;
    }

    @NotNull
    public final ButtonV3Atom.LargeButton getContinueButton() {
        return this.continueButton;
    }

    public final PriceBlockDTO getOrderPrice() {
        return this.orderPrice;
    }

    public final TextAtom getOrderTitle() {
        return this.orderTitle;
    }

    public final CellAtom.CellAtomWithSubtitle.CellWithSubtitle24Icon getPremiumButton() {
        return this.premiumButton;
    }

    public final TextAtom getSeatsLeft() {
        return this.seatsLeft;
    }

    public final List<PriceBlockDTO> getSelectedOptions() {
        return this.selectedOptions;
    }

    public final List<SelectedSeatDTO> getSelectedSeats() {
        return this.selectedSeats;
    }

    public final RailwayServicesDTO getServices() {
        return this.services;
    }

    public final List<TariffDTO> getTariffs() {
        return this.tariffs;
    }

    public int hashCode() {
        TextAtom textAtom = this.seatsLeft;
        int hashCode = (textAtom == null ? 0 : textAtom.hashCode()) * 31;
        RailwayServicesDTO railwayServicesDTO = this.services;
        int hashCode2 = (hashCode + (railwayServicesDTO == null ? 0 : railwayServicesDTO.hashCode())) * 31;
        CarriageDetailsDTO carriageDetailsDTO = this.carriageDetails;
        int hashCode3 = (hashCode2 + (carriageDetailsDTO == null ? 0 : carriageDetailsDTO.hashCode())) * 31;
        List<AdditionalServiceDTO> list = this.additionalServices;
        int hashCode4 = (hashCode3 + (list == null ? 0 : list.hashCode())) * 31;
        List<TariffDTO> list2 = this.tariffs;
        int hashCode5 = (hashCode4 + (list2 == null ? 0 : list2.hashCode())) * 31;
        CellAtom.CellAtomWithSubtitle.CellWithSubtitle24Icon cellWithSubtitle24Icon = this.premiumButton;
        int hashCode6 = (hashCode5 + (cellWithSubtitle24Icon == null ? 0 : cellWithSubtitle24Icon.hashCode())) * 31;
        TextAtom textAtom2 = this.orderTitle;
        int hashCode7 = (hashCode6 + (textAtom2 == null ? 0 : textAtom2.hashCode())) * 31;
        List<SelectedSeatDTO> list3 = this.selectedSeats;
        int hashCode8 = (hashCode7 + (list3 == null ? 0 : list3.hashCode())) * 31;
        List<PriceBlockDTO> list4 = this.selectedOptions;
        int hashCode9 = (hashCode8 + (list4 == null ? 0 : list4.hashCode())) * 31;
        BonusDTO bonusDTO = this.bonuses;
        int hashCode10 = (hashCode9 + (bonusDTO == null ? 0 : bonusDTO.hashCode())) * 31;
        PriceBlockDTO priceBlockDTO = this.orderPrice;
        int a11 = b.a(this.continueButton, (hashCode10 + (priceBlockDTO == null ? 0 : priceBlockDTO.hashCode())) * 31, 31);
        AlternativePriceBlockDTO alternativePriceBlockDTO = this.alternativePriceBlock;
        return a11 + (alternativePriceBlockDTO != null ? alternativePriceBlockDTO.hashCode() : 0);
    }

    public final boolean isEmptyState() {
        if (this.seatsLeft != null || this.services != null) {
            return false;
        }
        List<AdditionalServiceDTO> list = this.additionalServices;
        if (list != null && !list.isEmpty()) {
            return false;
        }
        List<TariffDTO> list2 = this.tariffs;
        if ((list2 != null && !list2.isEmpty()) || this.premiumButton != null || this.orderTitle != null) {
            return false;
        }
        List<SelectedSeatDTO> list3 = this.selectedSeats;
        if (list3 != null && !list3.isEmpty()) {
            return false;
        }
        List<PriceBlockDTO> list4 = this.selectedOptions;
        return (list4 == null || list4.isEmpty()) && this.bonuses == null && this.orderPrice == null;
    }

    @NotNull
    public String toString() {
        return "TravelRailwaySeatSelectFooterDTO(seatsLeft=" + this.seatsLeft + ", services=" + this.services + ", carriageDetails=" + this.carriageDetails + ", additionalServices=" + this.additionalServices + ", tariffs=" + this.tariffs + ", premiumButton=" + this.premiumButton + ", orderTitle=" + this.orderTitle + ", selectedSeats=" + this.selectedSeats + ", selectedOptions=" + this.selectedOptions + ", bonuses=" + this.bonuses + ", orderPrice=" + this.orderPrice + ", continueButton=" + this.continueButton + ", alternativePriceBlock=" + this.alternativePriceBlock + ")";
    }
}
