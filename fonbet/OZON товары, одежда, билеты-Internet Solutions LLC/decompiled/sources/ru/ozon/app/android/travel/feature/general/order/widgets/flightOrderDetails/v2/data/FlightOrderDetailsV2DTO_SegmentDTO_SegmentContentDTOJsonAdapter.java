package ru.ozon.app.android.travel.feature.general.order.widgets.flightOrderDetails.v2.data;

import Ak.b;
import Y9.c;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.Moshi;
import com.squareup.moshi.n;
import com.squareup.moshi.x;
import kotlin.Metadata;
import kotlin.collections.M;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.atoms.data.cells.CellAtom;
import ru.ozon.app.android.travel.feature.general.order.widgets.flightOrderDetails.v2.data.FlightOrderDetailsV2DTO;
import ru.ozon.app.android.travel.molecules.dto.tripLeg.v1.TripLegDTO;
import ru.ozon.app.android.ugc.widgets.selectionItemForm.data.SelectionItemFormDTO;
import ru.ozon.uni.atoms.data.button.ButtonV3Atom;
import ru.ozon.uni.atoms.data.dsCell.CellDTO;
import ru.ozon.uni.atoms.data.texts.TextAtom;

@Metadata(d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\f\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\f\u0010\rJ!\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000f\u001a\u00020\u000e2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u001a\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00170\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u001a\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00070\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u0019R\u001a\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u001b0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u0019R\u001a\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u001d0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u0019R\u001c\u0010 \u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001f0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010\u0019R\u001c\u0010!\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010\u0019R\u001c\u0010\"\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00170\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010\u0019R\u001c\u0010$\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010#0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u0010\u0019¨\u0006%"}, d2 = {"Lru/ozon/app/android/travel/feature/general/order/widgets/flightOrderDetails/v2/data/FlightOrderDetailsV2DTO_SegmentDTO_SegmentContentDTOJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lru/ozon/app/android/travel/feature/general/order/widgets/flightOrderDetails/v2/data/FlightOrderDetailsV2DTO$SegmentDTO$SegmentContentDTO;", "Lcom/squareup/moshi/Moshi;", "moshi", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "", "toString", "()Ljava/lang/String;", "Lcom/squareup/moshi/n;", "reader", "fromJson", "(Lcom/squareup/moshi/n;)Lru/ozon/app/android/travel/feature/general/order/widgets/flightOrderDetails/v2/data/FlightOrderDetailsV2DTO$SegmentDTO$SegmentContentDTO;", "Lcom/squareup/moshi/x;", "writer", AppMeasurementSdk.ConditionalUserProperty.VALUE, "", "toJson", "(Lcom/squareup/moshi/x;Lru/ozon/app/android/travel/feature/general/order/widgets/flightOrderDetails/v2/data/FlightOrderDetailsV2DTO$SegmentDTO$SegmentContentDTO;)V", "Lcom/squareup/moshi/n$a;", "options", "Lcom/squareup/moshi/n$a;", "Lru/ozon/uni/atoms/data/texts/TextAtom;", "textAtomAdapter", "Lcom/squareup/moshi/JsonAdapter;", "stringAdapter", "Lru/ozon/uni/atoms/data/button/ButtonV3Atom$SmallBorderlessButton;", "smallBorderlessButtonAdapter", "Lru/ozon/app/android/travel/molecules/dto/tripLeg/v1/TripLegDTO;", "tripLegDTOAdapter", "Lru/ozon/app/android/atoms/data/cells/CellAtom$CellAtomWithSubtitle$CellWithSubtitle24IconCounter;", "nullableCellWithSubtitle24IconCounterAdapter", "nullableStringAdapter", "nullableTextAtomAdapter", "Lru/ozon/uni/atoms/data/dsCell/CellDTO;", "nullableCellDTOAdapter", "order_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class FlightOrderDetailsV2DTO_SegmentDTO_SegmentContentDTOJsonAdapter extends JsonAdapter<FlightOrderDetailsV2DTO.SegmentDTO.SegmentContentDTO> {
    public static final int $stable = 8;

    @NotNull
    private final JsonAdapter<CellDTO> nullableCellDTOAdapter;

    @NotNull
    private final JsonAdapter<CellAtom.CellAtomWithSubtitle.CellWithSubtitle24IconCounter> nullableCellWithSubtitle24IconCounterAdapter;

    @NotNull
    private final JsonAdapter<String> nullableStringAdapter;

    @NotNull
    private final JsonAdapter<TextAtom> nullableTextAtomAdapter;

    @NotNull
    private final n.a options;

    @NotNull
    private final JsonAdapter<ButtonV3Atom.SmallBorderlessButton> smallBorderlessButtonAdapter;

    @NotNull
    private final JsonAdapter<String> stringAdapter;

    @NotNull
    private final JsonAdapter<TextAtom> textAtomAdapter;

    @NotNull
    private final JsonAdapter<TripLegDTO> tripLegDTOAdapter;

    public FlightOrderDetailsV2DTO_SegmentDTO_SegmentContentDTOJsonAdapter(@NotNull Moshi moshi) {
        Intrinsics.checkNotNullParameter(moshi, "moshi");
        this.options = n.a.C0918a.a(SelectionItemFormDTO.TITLE_FIELD_NAME, "imageLink", "smallButton", "tripLeg", "transfer", "transferCellBackgroundColor", "additionalInfo", "bookingInfo");
        M m11 = M.f71699a;
        this.textAtomAdapter = moshi.f(TextAtom.class, m11, SelectionItemFormDTO.TITLE_FIELD_NAME);
        this.stringAdapter = moshi.f(String.class, m11, "imageLink");
        this.smallBorderlessButtonAdapter = moshi.f(ButtonV3Atom.SmallBorderlessButton.class, m11, "smallButton");
        this.tripLegDTOAdapter = moshi.f(TripLegDTO.class, m11, "tripLeg");
        this.nullableCellWithSubtitle24IconCounterAdapter = moshi.f(CellAtom.CellAtomWithSubtitle.CellWithSubtitle24IconCounter.class, m11, "transfer");
        this.nullableStringAdapter = moshi.f(String.class, m11, "transferCellBackgroundColor");
        this.nullableTextAtomAdapter = moshi.f(TextAtom.class, m11, "additionalInfo");
        this.nullableCellDTOAdapter = moshi.f(CellDTO.class, m11, "bookingInfo");
    }

    @NotNull
    public String toString() {
        return b.c(74, "GeneratedJsonAdapter(FlightOrderDetailsV2DTO.SegmentDTO.SegmentContentDTO)", "toString(...)");
    }

    @Override // com.squareup.moshi.JsonAdapter
    @NotNull
    public FlightOrderDetailsV2DTO.SegmentDTO.SegmentContentDTO fromJson(@NotNull n reader) {
        Intrinsics.checkNotNullParameter(reader, "reader");
        reader.beginObject();
        TextAtom textAtom = null;
        String str = null;
        ButtonV3Atom.SmallBorderlessButton smallBorderlessButton = null;
        TripLegDTO tripLegDTO = null;
        CellAtom.CellAtomWithSubtitle.CellWithSubtitle24IconCounter cellWithSubtitle24IconCounter = null;
        String str2 = null;
        TextAtom textAtom2 = null;
        CellDTO cellDTO = null;
        while (reader.hasNext()) {
            switch (reader.v(this.options)) {
                case -1:
                    reader.y();
                    reader.skipValue();
                    break;
                case 0:
                    textAtom = this.textAtomAdapter.fromJson(reader);
                    if (textAtom == null) {
                        throw c.q(SelectionItemFormDTO.TITLE_FIELD_NAME, SelectionItemFormDTO.TITLE_FIELD_NAME, reader);
                    }
                    break;
                case 1:
                    str = this.stringAdapter.fromJson(reader);
                    if (str == null) {
                        throw c.q("imageLink", "imageLink", reader);
                    }
                    break;
                case 2:
                    smallBorderlessButton = this.smallBorderlessButtonAdapter.fromJson(reader);
                    if (smallBorderlessButton == null) {
                        throw c.q("smallButton", "smallButton", reader);
                    }
                    break;
                case 3:
                    tripLegDTO = this.tripLegDTOAdapter.fromJson(reader);
                    if (tripLegDTO == null) {
                        throw c.q("tripLeg", "tripLeg", reader);
                    }
                    break;
                case 4:
                    cellWithSubtitle24IconCounter = this.nullableCellWithSubtitle24IconCounterAdapter.fromJson(reader);
                    break;
                case 5:
                    str2 = this.nullableStringAdapter.fromJson(reader);
                    break;
                case 6:
                    textAtom2 = this.nullableTextAtomAdapter.fromJson(reader);
                    break;
                case 7:
                    cellDTO = this.nullableCellDTOAdapter.fromJson(reader);
                    break;
            }
        }
        reader.endObject();
        if (textAtom == null) {
            throw c.j(SelectionItemFormDTO.TITLE_FIELD_NAME, SelectionItemFormDTO.TITLE_FIELD_NAME, reader);
        }
        if (str == null) {
            throw c.j("imageLink", "imageLink", reader);
        }
        if (smallBorderlessButton == null) {
            throw c.j("smallButton", "smallButton", reader);
        }
        if (tripLegDTO != null) {
            return new FlightOrderDetailsV2DTO.SegmentDTO.SegmentContentDTO(textAtom, str, smallBorderlessButton, tripLegDTO, cellWithSubtitle24IconCounter, str2, textAtom2, cellDTO);
        }
        throw c.j("tripLeg", "tripLeg", reader);
    }

    @Override // com.squareup.moshi.JsonAdapter
    /* renamed from: toJson, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
    public void mo44toJson(@NotNull x writer, FlightOrderDetailsV2DTO.SegmentDTO.SegmentContentDTO value) {
        Intrinsics.checkNotNullParameter(writer, "writer");
        if (value == null) {
            throw new NullPointerException("value was null! Wrap in .nullSafe() to write nullable values.");
        }
        writer.j();
        writer.w(SelectionItemFormDTO.TITLE_FIELD_NAME);
        this.textAtomAdapter.mo44toJson(writer, (x) value.getTitle());
        writer.w("imageLink");
        this.stringAdapter.mo44toJson(writer, (x) value.getImageLink());
        writer.w("smallButton");
        this.smallBorderlessButtonAdapter.mo44toJson(writer, (x) value.getSmallButton());
        writer.w("tripLeg");
        this.tripLegDTOAdapter.mo44toJson(writer, (x) value.getTripLeg());
        writer.w("transfer");
        this.nullableCellWithSubtitle24IconCounterAdapter.mo44toJson(writer, (x) value.getTransfer());
        writer.w("transferCellBackgroundColor");
        this.nullableStringAdapter.mo44toJson(writer, (x) value.getTransferCellBackgroundColor());
        writer.w("additionalInfo");
        this.nullableTextAtomAdapter.mo44toJson(writer, (x) value.getAdditionalInfo());
        writer.w("bookingInfo");
        this.nullableCellDTOAdapter.mo44toJson(writer, (x) value.getBookingInfo());
        writer.p();
    }
}
