package ru.ozon.app.android.travel.feature.railway.widgets.travelRailwaySeatSelectWithScheme.v2.data.models;

import Ak.b;
import Y9.c;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.squareup.moshi.D;
import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.Moshi;
import com.squareup.moshi.n;
import com.squareup.moshi.x;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.M;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.atoms.data.cells.CellAtom;
import ru.ozon.app.android.storefront.widgets.feedback.result.data.ResultDTO;
import ru.ozon.app.android.travel.molecules.dto.railwayServices.RailwayServicesDTO;
import ru.ozon.uni.atoms.data.button.ButtonV3Atom;
import ru.ozon.uni.atoms.data.texts.TextAtom;

@Metadata(d1 = {"\u0000\u0088\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\f\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\f\u0010\rJ!\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000f\u001a\u00020\u000e2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u001c\u0010\u0018\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00170\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u001c\u0010\u001b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001a0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u0019R\u001c\u0010\u001d\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001c0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u0019R\"\u0010 \u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u001f\u0018\u00010\u001e0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010\u0019R\"\u0010\"\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020!\u0018\u00010\u001e0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010\u0019R\u001c\u0010$\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010#0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u0010\u0019R\"\u0010&\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020%\u0018\u00010\u001e0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b&\u0010\u0019R\"\u0010(\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020'\u0018\u00010\u001e0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b(\u0010\u0019R\u001c\u0010*\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010)0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b*\u0010\u0019R\u001c\u0010+\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010'0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b+\u0010\u0019R\u001a\u0010-\u001a\b\u0012\u0004\u0012\u00020,0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b-\u0010\u0019R\u001c\u0010/\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010.0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b/\u0010\u0019¨\u00060"}, d2 = {"Lru/ozon/app/android/travel/feature/railway/widgets/travelRailwaySeatSelectWithScheme/v2/data/models/TravelRailwaySeatSelectFooterDTOJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lru/ozon/app/android/travel/feature/railway/widgets/travelRailwaySeatSelectWithScheme/v2/data/models/TravelRailwaySeatSelectFooterDTO;", "Lcom/squareup/moshi/Moshi;", "moshi", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "", "toString", "()Ljava/lang/String;", "Lcom/squareup/moshi/n;", "reader", "fromJson", "(Lcom/squareup/moshi/n;)Lru/ozon/app/android/travel/feature/railway/widgets/travelRailwaySeatSelectWithScheme/v2/data/models/TravelRailwaySeatSelectFooterDTO;", "Lcom/squareup/moshi/x;", "writer", AppMeasurementSdk.ConditionalUserProperty.VALUE, "", "toJson", "(Lcom/squareup/moshi/x;Lru/ozon/app/android/travel/feature/railway/widgets/travelRailwaySeatSelectWithScheme/v2/data/models/TravelRailwaySeatSelectFooterDTO;)V", "Lcom/squareup/moshi/n$a;", "options", "Lcom/squareup/moshi/n$a;", "Lru/ozon/uni/atoms/data/texts/TextAtom;", "nullableTextAtomAdapter", "Lcom/squareup/moshi/JsonAdapter;", "Lru/ozon/app/android/travel/molecules/dto/railwayServices/RailwayServicesDTO;", "nullableRailwayServicesDTOAdapter", "Lru/ozon/app/android/travel/feature/railway/widgets/travelRailwaySeatSelectWithScheme/v2/data/models/CarriageDetailsDTO;", "nullableCarriageDetailsDTOAdapter", "", "Lru/ozon/app/android/travel/feature/railway/widgets/travelRailwaySeatSelectWithScheme/v2/data/models/AdditionalServiceDTO;", "nullableListOfAdditionalServiceDTOAdapter", "Lru/ozon/app/android/travel/feature/railway/widgets/travelRailwaySeatSelectWithScheme/v2/data/models/TariffDTO;", "nullableListOfTariffDTOAdapter", "Lru/ozon/app/android/atoms/data/cells/CellAtom$CellAtomWithSubtitle$CellWithSubtitle24Icon;", "nullableCellWithSubtitle24IconAdapter", "Lru/ozon/app/android/travel/feature/railway/widgets/travelRailwaySeatSelectWithScheme/v2/data/models/SelectedSeatDTO;", "nullableListOfSelectedSeatDTOAdapter", "Lru/ozon/app/android/travel/feature/railway/widgets/travelRailwaySeatSelectWithScheme/v2/data/models/PriceBlockDTO;", "nullableListOfPriceBlockDTOAdapter", "Lru/ozon/app/android/travel/feature/railway/widgets/travelRailwaySeatSelectWithScheme/v2/data/models/BonusDTO;", "nullableBonusDTOAdapter", "nullablePriceBlockDTOAdapter", "Lru/ozon/uni/atoms/data/button/ButtonV3Atom$LargeButton;", "largeButtonAdapter", "Lru/ozon/app/android/travel/feature/railway/widgets/travelRailwaySeatSelectWithScheme/v2/data/models/AlternativePriceBlockDTO;", "nullableAlternativePriceBlockDTOAdapter", "railway_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class TravelRailwaySeatSelectFooterDTOJsonAdapter extends JsonAdapter<TravelRailwaySeatSelectFooterDTO> {
    public static final int $stable = 8;

    @NotNull
    private final JsonAdapter<ButtonV3Atom.LargeButton> largeButtonAdapter;

    @NotNull
    private final JsonAdapter<AlternativePriceBlockDTO> nullableAlternativePriceBlockDTOAdapter;

    @NotNull
    private final JsonAdapter<BonusDTO> nullableBonusDTOAdapter;

    @NotNull
    private final JsonAdapter<CarriageDetailsDTO> nullableCarriageDetailsDTOAdapter;

    @NotNull
    private final JsonAdapter<CellAtom.CellAtomWithSubtitle.CellWithSubtitle24Icon> nullableCellWithSubtitle24IconAdapter;

    @NotNull
    private final JsonAdapter<List<AdditionalServiceDTO>> nullableListOfAdditionalServiceDTOAdapter;

    @NotNull
    private final JsonAdapter<List<PriceBlockDTO>> nullableListOfPriceBlockDTOAdapter;

    @NotNull
    private final JsonAdapter<List<SelectedSeatDTO>> nullableListOfSelectedSeatDTOAdapter;

    @NotNull
    private final JsonAdapter<List<TariffDTO>> nullableListOfTariffDTOAdapter;

    @NotNull
    private final JsonAdapter<PriceBlockDTO> nullablePriceBlockDTOAdapter;

    @NotNull
    private final JsonAdapter<RailwayServicesDTO> nullableRailwayServicesDTOAdapter;

    @NotNull
    private final JsonAdapter<TextAtom> nullableTextAtomAdapter;

    @NotNull
    private final n.a options;

    public TravelRailwaySeatSelectFooterDTOJsonAdapter(@NotNull Moshi moshi) {
        Intrinsics.checkNotNullParameter(moshi, "moshi");
        this.options = n.a.C0918a.a("seatsLeft", ResultDTO.CONTENT_TYPE_SERVICES, "carriageDetails", "additionalServices", "tariffs", "premiumButton", "orderTitle", "selectedSeats", "selectedOptions", "bonuses", "orderPrice", "continueButton", "alternativePriceBlock");
        M m11 = M.f71699a;
        this.nullableTextAtomAdapter = moshi.f(TextAtom.class, m11, "seatsLeft");
        this.nullableRailwayServicesDTOAdapter = moshi.f(RailwayServicesDTO.class, m11, ResultDTO.CONTENT_TYPE_SERVICES);
        this.nullableCarriageDetailsDTOAdapter = moshi.f(CarriageDetailsDTO.class, m11, "carriageDetails");
        this.nullableListOfAdditionalServiceDTOAdapter = moshi.f(D.e(List.class, AdditionalServiceDTO.class), m11, "additionalServices");
        this.nullableListOfTariffDTOAdapter = moshi.f(D.e(List.class, TariffDTO.class), m11, "tariffs");
        this.nullableCellWithSubtitle24IconAdapter = moshi.f(CellAtom.CellAtomWithSubtitle.CellWithSubtitle24Icon.class, m11, "premiumButton");
        this.nullableListOfSelectedSeatDTOAdapter = moshi.f(D.e(List.class, SelectedSeatDTO.class), m11, "selectedSeats");
        this.nullableListOfPriceBlockDTOAdapter = moshi.f(D.e(List.class, PriceBlockDTO.class), m11, "selectedOptions");
        this.nullableBonusDTOAdapter = moshi.f(BonusDTO.class, m11, "bonuses");
        this.nullablePriceBlockDTOAdapter = moshi.f(PriceBlockDTO.class, m11, "orderPrice");
        this.largeButtonAdapter = moshi.f(ButtonV3Atom.LargeButton.class, m11, "continueButton");
        this.nullableAlternativePriceBlockDTOAdapter = moshi.f(AlternativePriceBlockDTO.class, m11, "alternativePriceBlock");
    }

    @NotNull
    public String toString() {
        return b.c(54, "GeneratedJsonAdapter(TravelRailwaySeatSelectFooterDTO)", "toString(...)");
    }

    @Override // com.squareup.moshi.JsonAdapter
    @NotNull
    public TravelRailwaySeatSelectFooterDTO fromJson(@NotNull n reader) {
        Intrinsics.checkNotNullParameter(reader, "reader");
        reader.beginObject();
        TextAtom textAtom = null;
        RailwayServicesDTO railwayServicesDTO = null;
        CarriageDetailsDTO carriageDetailsDTO = null;
        List<AdditionalServiceDTO> list = null;
        List<TariffDTO> list2 = null;
        CellAtom.CellAtomWithSubtitle.CellWithSubtitle24Icon cellWithSubtitle24Icon = null;
        TextAtom textAtom2 = null;
        List<SelectedSeatDTO> list3 = null;
        List<PriceBlockDTO> list4 = null;
        BonusDTO bonusDTO = null;
        PriceBlockDTO priceBlockDTO = null;
        ButtonV3Atom.LargeButton largeButton = null;
        AlternativePriceBlockDTO alternativePriceBlockDTO = null;
        while (reader.hasNext()) {
            switch (reader.v(this.options)) {
                case -1:
                    reader.y();
                    reader.skipValue();
                    break;
                case 0:
                    textAtom = this.nullableTextAtomAdapter.fromJson(reader);
                    break;
                case 1:
                    railwayServicesDTO = this.nullableRailwayServicesDTOAdapter.fromJson(reader);
                    break;
                case 2:
                    carriageDetailsDTO = this.nullableCarriageDetailsDTOAdapter.fromJson(reader);
                    break;
                case 3:
                    list = this.nullableListOfAdditionalServiceDTOAdapter.fromJson(reader);
                    break;
                case 4:
                    list2 = this.nullableListOfTariffDTOAdapter.fromJson(reader);
                    break;
                case 5:
                    cellWithSubtitle24Icon = this.nullableCellWithSubtitle24IconAdapter.fromJson(reader);
                    break;
                case 6:
                    textAtom2 = this.nullableTextAtomAdapter.fromJson(reader);
                    break;
                case 7:
                    list3 = this.nullableListOfSelectedSeatDTOAdapter.fromJson(reader);
                    break;
                case 8:
                    list4 = this.nullableListOfPriceBlockDTOAdapter.fromJson(reader);
                    break;
                case 9:
                    bonusDTO = this.nullableBonusDTOAdapter.fromJson(reader);
                    break;
                case 10:
                    priceBlockDTO = this.nullablePriceBlockDTOAdapter.fromJson(reader);
                    break;
                case 11:
                    largeButton = this.largeButtonAdapter.fromJson(reader);
                    if (largeButton == null) {
                        throw c.q("continueButton", "continueButton", reader);
                    }
                    break;
                case 12:
                    alternativePriceBlockDTO = this.nullableAlternativePriceBlockDTOAdapter.fromJson(reader);
                    break;
            }
        }
        reader.endObject();
        if (largeButton != null) {
            return new TravelRailwaySeatSelectFooterDTO(textAtom, railwayServicesDTO, carriageDetailsDTO, list, list2, cellWithSubtitle24Icon, textAtom2, list3, list4, bonusDTO, priceBlockDTO, largeButton, alternativePriceBlockDTO);
        }
        throw c.j("continueButton", "continueButton", reader);
    }

    @Override // com.squareup.moshi.JsonAdapter
    /* renamed from: toJson, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
    public void mo44toJson(@NotNull x writer, TravelRailwaySeatSelectFooterDTO value) {
        Intrinsics.checkNotNullParameter(writer, "writer");
        if (value == null) {
            throw new NullPointerException("value was null! Wrap in .nullSafe() to write nullable values.");
        }
        writer.j();
        writer.w("seatsLeft");
        this.nullableTextAtomAdapter.mo44toJson(writer, (x) value.getSeatsLeft());
        writer.w(ResultDTO.CONTENT_TYPE_SERVICES);
        this.nullableRailwayServicesDTOAdapter.mo44toJson(writer, (x) value.getServices());
        writer.w("carriageDetails");
        this.nullableCarriageDetailsDTOAdapter.mo44toJson(writer, (x) value.getCarriageDetails());
        writer.w("additionalServices");
        this.nullableListOfAdditionalServiceDTOAdapter.mo44toJson(writer, (x) value.getAdditionalServices());
        writer.w("tariffs");
        this.nullableListOfTariffDTOAdapter.mo44toJson(writer, (x) value.getTariffs());
        writer.w("premiumButton");
        this.nullableCellWithSubtitle24IconAdapter.mo44toJson(writer, (x) value.getPremiumButton());
        writer.w("orderTitle");
        this.nullableTextAtomAdapter.mo44toJson(writer, (x) value.getOrderTitle());
        writer.w("selectedSeats");
        this.nullableListOfSelectedSeatDTOAdapter.mo44toJson(writer, (x) value.getSelectedSeats());
        writer.w("selectedOptions");
        this.nullableListOfPriceBlockDTOAdapter.mo44toJson(writer, (x) value.getSelectedOptions());
        writer.w("bonuses");
        this.nullableBonusDTOAdapter.mo44toJson(writer, (x) value.getBonuses());
        writer.w("orderPrice");
        this.nullablePriceBlockDTOAdapter.mo44toJson(writer, (x) value.getOrderPrice());
        writer.w("continueButton");
        this.largeButtonAdapter.mo44toJson(writer, (x) value.getContinueButton());
        writer.w("alternativePriceBlock");
        this.nullableAlternativePriceBlockDTOAdapter.mo44toJson(writer, (x) value.getAlternativePriceBlock());
        writer.p();
    }
}
