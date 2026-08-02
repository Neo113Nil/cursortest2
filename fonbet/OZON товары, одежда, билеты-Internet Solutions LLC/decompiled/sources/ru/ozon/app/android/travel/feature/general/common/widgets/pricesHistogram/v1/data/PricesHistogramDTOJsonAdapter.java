package ru.ozon.app.android.travel.feature.general.common.widgets.pricesHistogram.v1.data;

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
import ru.ozon.app.android.travel.feature.general.common.widgets.pricesHistogram.v1.data.PricesHistogramDTO;
import ru.ozon.app.android.ugc.widgets.selectionItemForm.data.SelectionItemFormDTO;
import ru.ozon.uni.atoms.data.button.ButtonV3Atom;
import ru.ozon.uni.atoms.data.texts.TextAtom;

@Metadata(d1 = {"\u0000l\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\f\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\f\u0010\rJ!\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000f\u001a\u00020\u000e2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u001a\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00170\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u001c\u0010\u001a\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00170\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u0019R\u001a\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u001b0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u0019R \u0010\u001f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001e0\u001d0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010\u0019R\"\u0010 \u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u001e\u0018\u00010\u001d0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010\u0019R\u001a\u0010\"\u001a\b\u0012\u0004\u0012\u00020!0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010\u0019R\u001a\u0010$\u001a\b\u0012\u0004\u0012\u00020#0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u0010\u0019R\u001a\u0010%\u001a\b\u0012\u0004\u0012\u00020\u00070\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b%\u0010\u0019R\u001c\u0010&\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b&\u0010\u0019R\u001c\u0010(\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010'0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b(\u0010\u0019¨\u0006)"}, d2 = {"Lru/ozon/app/android/travel/feature/general/common/widgets/pricesHistogram/v1/data/PricesHistogramDTOJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lru/ozon/app/android/travel/feature/general/common/widgets/pricesHistogram/v1/data/PricesHistogramDTO;", "Lcom/squareup/moshi/Moshi;", "moshi", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "", "toString", "()Ljava/lang/String;", "Lcom/squareup/moshi/n;", "reader", "fromJson", "(Lcom/squareup/moshi/n;)Lru/ozon/app/android/travel/feature/general/common/widgets/pricesHistogram/v1/data/PricesHistogramDTO;", "Lcom/squareup/moshi/x;", "writer", AppMeasurementSdk.ConditionalUserProperty.VALUE, "", "toJson", "(Lcom/squareup/moshi/x;Lru/ozon/app/android/travel/feature/general/common/widgets/pricesHistogram/v1/data/PricesHistogramDTO;)V", "Lcom/squareup/moshi/n$a;", "options", "Lcom/squareup/moshi/n$a;", "Lru/ozon/uni/atoms/data/texts/TextAtom;", "textAtomAdapter", "Lcom/squareup/moshi/JsonAdapter;", "nullableTextAtomAdapter", "Lru/ozon/uni/atoms/data/button/ButtonV3Atom$SmallBorderlessButton;", "smallBorderlessButtonAdapter", "", "Lru/ozon/app/android/travel/feature/general/common/widgets/pricesHistogram/v1/data/PricesHistogramDTO$MonthDTO;", "listOfMonthDTOAdapter", "nullableListOfMonthDTOAdapter", "Lru/ozon/uni/atoms/data/button/ButtonV3Atom$LargeButton;", "largeButtonAdapter", "Lru/ozon/app/android/travel/feature/general/common/widgets/pricesHistogram/v1/data/PricesHistogramDTO$AvailableColorsDTO;", "availableColorsDTOAdapter", "stringAdapter", "nullableStringAdapter", "", "nullableIntAdapter", "common_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class PricesHistogramDTOJsonAdapter extends JsonAdapter<PricesHistogramDTO> {
    public static final int $stable = 8;

    @NotNull
    private final JsonAdapter<PricesHistogramDTO.AvailableColorsDTO> availableColorsDTOAdapter;

    @NotNull
    private final JsonAdapter<ButtonV3Atom.LargeButton> largeButtonAdapter;

    @NotNull
    private final JsonAdapter<List<PricesHistogramDTO.MonthDTO>> listOfMonthDTOAdapter;

    @NotNull
    private final JsonAdapter<Integer> nullableIntAdapter;

    @NotNull
    private final JsonAdapter<List<PricesHistogramDTO.MonthDTO>> nullableListOfMonthDTOAdapter;

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

    public PricesHistogramDTOJsonAdapter(@NotNull Moshi moshi) {
        Intrinsics.checkNotNullParameter(moshi, "moshi");
        this.options = n.a.C0918a.a(SelectionItemFormDTO.TITLE_FIELD_NAME, "titleFrom", "titleTo", "cancelButton", "monthsFrom", "monthsTo", "findTicketsButton", "availableColors", "dateFrom", "dateTo", "emptyHistogramMessage", "mediumPrice", "medianHeight");
        M m11 = M.f71699a;
        this.textAtomAdapter = moshi.f(TextAtom.class, m11, SelectionItemFormDTO.TITLE_FIELD_NAME);
        this.nullableTextAtomAdapter = moshi.f(TextAtom.class, m11, "titleTo");
        this.smallBorderlessButtonAdapter = moshi.f(ButtonV3Atom.SmallBorderlessButton.class, m11, "cancelButton");
        this.listOfMonthDTOAdapter = moshi.f(D.e(List.class, PricesHistogramDTO.MonthDTO.class), m11, "monthsFrom");
        this.nullableListOfMonthDTOAdapter = moshi.f(D.e(List.class, PricesHistogramDTO.MonthDTO.class), m11, "monthsTo");
        this.largeButtonAdapter = moshi.f(ButtonV3Atom.LargeButton.class, m11, "findTicketsButton");
        this.availableColorsDTOAdapter = moshi.f(PricesHistogramDTO.AvailableColorsDTO.class, m11, "availableColors");
        this.stringAdapter = moshi.f(String.class, m11, "dateFrom");
        this.nullableStringAdapter = moshi.f(String.class, m11, "dateTo");
        this.nullableIntAdapter = moshi.f(Integer.class, m11, "medianHeight");
    }

    @NotNull
    public String toString() {
        return b.c(40, "GeneratedJsonAdapter(PricesHistogramDTO)", "toString(...)");
    }

    @Override // com.squareup.moshi.JsonAdapter
    @NotNull
    public PricesHistogramDTO fromJson(@NotNull n reader) {
        Intrinsics.checkNotNullParameter(reader, "reader");
        reader.beginObject();
        TextAtom textAtom = null;
        TextAtom textAtom2 = null;
        TextAtom textAtom3 = null;
        ButtonV3Atom.SmallBorderlessButton smallBorderlessButton = null;
        List<PricesHistogramDTO.MonthDTO> list = null;
        List<PricesHistogramDTO.MonthDTO> list2 = null;
        ButtonV3Atom.LargeButton largeButton = null;
        PricesHistogramDTO.AvailableColorsDTO availableColorsDTO = null;
        String str = null;
        String str2 = null;
        TextAtom textAtom4 = null;
        TextAtom textAtom5 = null;
        Integer num = null;
        while (true) {
            TextAtom textAtom6 = textAtom;
            TextAtom textAtom7 = textAtom2;
            TextAtom textAtom8 = textAtom3;
            ButtonV3Atom.SmallBorderlessButton smallBorderlessButton2 = smallBorderlessButton;
            List<PricesHistogramDTO.MonthDTO> list3 = list;
            if (!reader.hasNext()) {
                List<PricesHistogramDTO.MonthDTO> list4 = list2;
                reader.endObject();
                if (textAtom6 == null) {
                    throw c.j(SelectionItemFormDTO.TITLE_FIELD_NAME, SelectionItemFormDTO.TITLE_FIELD_NAME, reader);
                }
                if (textAtom7 == null) {
                    throw c.j("titleFrom", "titleFrom", reader);
                }
                if (smallBorderlessButton2 == null) {
                    throw c.j("cancelButton", "cancelButton", reader);
                }
                if (list3 == null) {
                    throw c.j("monthsFrom", "monthsFrom", reader);
                }
                if (largeButton == null) {
                    throw c.j("findTicketsButton", "findTicketsButton", reader);
                }
                if (availableColorsDTO == null) {
                    throw c.j("availableColors", "availableColors", reader);
                }
                if (str != null) {
                    return new PricesHistogramDTO(textAtom6, textAtom7, textAtom8, smallBorderlessButton2, list3, list4, largeButton, availableColorsDTO, str, str2, textAtom4, textAtom5, num);
                }
                throw c.j("dateFrom", "dateFrom", reader);
            }
            List<PricesHistogramDTO.MonthDTO> list5 = list2;
            switch (reader.v(this.options)) {
                case -1:
                    reader.y();
                    reader.skipValue();
                    list2 = list5;
                    textAtom = textAtom6;
                    textAtom2 = textAtom7;
                    textAtom3 = textAtom8;
                    smallBorderlessButton = smallBorderlessButton2;
                    list = list3;
                case 0:
                    textAtom = this.textAtomAdapter.fromJson(reader);
                    if (textAtom == null) {
                        throw c.q(SelectionItemFormDTO.TITLE_FIELD_NAME, SelectionItemFormDTO.TITLE_FIELD_NAME, reader);
                    }
                    list2 = list5;
                    textAtom2 = textAtom7;
                    textAtom3 = textAtom8;
                    smallBorderlessButton = smallBorderlessButton2;
                    list = list3;
                case 1:
                    textAtom2 = this.textAtomAdapter.fromJson(reader);
                    if (textAtom2 == null) {
                        throw c.q("titleFrom", "titleFrom", reader);
                    }
                    list2 = list5;
                    textAtom = textAtom6;
                    textAtom3 = textAtom8;
                    smallBorderlessButton = smallBorderlessButton2;
                    list = list3;
                case 2:
                    textAtom3 = this.nullableTextAtomAdapter.fromJson(reader);
                    list2 = list5;
                    textAtom = textAtom6;
                    textAtom2 = textAtom7;
                    smallBorderlessButton = smallBorderlessButton2;
                    list = list3;
                case 3:
                    smallBorderlessButton = this.smallBorderlessButtonAdapter.fromJson(reader);
                    if (smallBorderlessButton == null) {
                        throw c.q("cancelButton", "cancelButton", reader);
                    }
                    list2 = list5;
                    textAtom = textAtom6;
                    textAtom2 = textAtom7;
                    textAtom3 = textAtom8;
                    list = list3;
                case 4:
                    list = this.listOfMonthDTOAdapter.fromJson(reader);
                    if (list == null) {
                        throw c.q("monthsFrom", "monthsFrom", reader);
                    }
                    list2 = list5;
                    textAtom = textAtom6;
                    textAtom2 = textAtom7;
                    textAtom3 = textAtom8;
                    smallBorderlessButton = smallBorderlessButton2;
                case 5:
                    list2 = this.nullableListOfMonthDTOAdapter.fromJson(reader);
                    textAtom = textAtom6;
                    textAtom2 = textAtom7;
                    textAtom3 = textAtom8;
                    smallBorderlessButton = smallBorderlessButton2;
                    list = list3;
                case 6:
                    largeButton = this.largeButtonAdapter.fromJson(reader);
                    if (largeButton == null) {
                        throw c.q("findTicketsButton", "findTicketsButton", reader);
                    }
                    list2 = list5;
                    textAtom = textAtom6;
                    textAtom2 = textAtom7;
                    textAtom3 = textAtom8;
                    smallBorderlessButton = smallBorderlessButton2;
                    list = list3;
                case 7:
                    availableColorsDTO = this.availableColorsDTOAdapter.fromJson(reader);
                    if (availableColorsDTO == null) {
                        throw c.q("availableColors", "availableColors", reader);
                    }
                    list2 = list5;
                    textAtom = textAtom6;
                    textAtom2 = textAtom7;
                    textAtom3 = textAtom8;
                    smallBorderlessButton = smallBorderlessButton2;
                    list = list3;
                case 8:
                    str = this.stringAdapter.fromJson(reader);
                    if (str == null) {
                        throw c.q("dateFrom", "dateFrom", reader);
                    }
                    list2 = list5;
                    textAtom = textAtom6;
                    textAtom2 = textAtom7;
                    textAtom3 = textAtom8;
                    smallBorderlessButton = smallBorderlessButton2;
                    list = list3;
                case 9:
                    str2 = this.nullableStringAdapter.fromJson(reader);
                    list2 = list5;
                    textAtom = textAtom6;
                    textAtom2 = textAtom7;
                    textAtom3 = textAtom8;
                    smallBorderlessButton = smallBorderlessButton2;
                    list = list3;
                case 10:
                    textAtom4 = this.nullableTextAtomAdapter.fromJson(reader);
                    list2 = list5;
                    textAtom = textAtom6;
                    textAtom2 = textAtom7;
                    textAtom3 = textAtom8;
                    smallBorderlessButton = smallBorderlessButton2;
                    list = list3;
                case 11:
                    textAtom5 = this.nullableTextAtomAdapter.fromJson(reader);
                    list2 = list5;
                    textAtom = textAtom6;
                    textAtom2 = textAtom7;
                    textAtom3 = textAtom8;
                    smallBorderlessButton = smallBorderlessButton2;
                    list = list3;
                case 12:
                    num = this.nullableIntAdapter.fromJson(reader);
                    list2 = list5;
                    textAtom = textAtom6;
                    textAtom2 = textAtom7;
                    textAtom3 = textAtom8;
                    smallBorderlessButton = smallBorderlessButton2;
                    list = list3;
                default:
                    list2 = list5;
                    textAtom = textAtom6;
                    textAtom2 = textAtom7;
                    textAtom3 = textAtom8;
                    smallBorderlessButton = smallBorderlessButton2;
                    list = list3;
            }
        }
    }

    @Override // com.squareup.moshi.JsonAdapter
    /* renamed from: toJson, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
    public void mo44toJson(@NotNull x writer, PricesHistogramDTO value) {
        Intrinsics.checkNotNullParameter(writer, "writer");
        if (value == null) {
            throw new NullPointerException("value was null! Wrap in .nullSafe() to write nullable values.");
        }
        writer.j();
        writer.w(SelectionItemFormDTO.TITLE_FIELD_NAME);
        this.textAtomAdapter.mo44toJson(writer, (x) value.getTitle());
        writer.w("titleFrom");
        this.textAtomAdapter.mo44toJson(writer, (x) value.getTitleFrom());
        writer.w("titleTo");
        this.nullableTextAtomAdapter.mo44toJson(writer, (x) value.getTitleTo());
        writer.w("cancelButton");
        this.smallBorderlessButtonAdapter.mo44toJson(writer, (x) value.getCancelButton());
        writer.w("monthsFrom");
        this.listOfMonthDTOAdapter.mo44toJson(writer, (x) value.getMonthsFrom());
        writer.w("monthsTo");
        this.nullableListOfMonthDTOAdapter.mo44toJson(writer, (x) value.getMonthsTo());
        writer.w("findTicketsButton");
        this.largeButtonAdapter.mo44toJson(writer, (x) value.getFindTicketsButton());
        writer.w("availableColors");
        this.availableColorsDTOAdapter.mo44toJson(writer, (x) value.getAvailableColors());
        writer.w("dateFrom");
        this.stringAdapter.mo44toJson(writer, (x) value.getDateFrom());
        writer.w("dateTo");
        this.nullableStringAdapter.mo44toJson(writer, (x) value.getDateTo());
        writer.w("emptyHistogramMessage");
        this.nullableTextAtomAdapter.mo44toJson(writer, (x) value.getEmptyHistogramMessage());
        writer.w("mediumPrice");
        this.nullableTextAtomAdapter.mo44toJson(writer, (x) value.getMediumPrice());
        writer.w("medianHeight");
        this.nullableIntAdapter.mo44toJson(writer, (x) value.getMedianHeight());
        writer.p();
    }
}
