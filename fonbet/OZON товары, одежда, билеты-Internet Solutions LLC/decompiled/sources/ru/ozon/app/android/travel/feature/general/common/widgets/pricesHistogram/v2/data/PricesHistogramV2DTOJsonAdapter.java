package ru.ozon.app.android.travel.feature.general.common.widgets.pricesHistogram.v2.data;

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
import ru.ozon.app.android.travel.feature.general.common.widgets.pricesHistogram.v2.data.PricesHistogramV2DTO;
import ru.ozon.uni.atoms.data.cell.ToggleTitleSubtitleCellDTO;
import ru.ozon.uni.atoms.data.controls.button.ButtonV3DTO;
import ru.ozon.uni.atoms.data.controls.chip.ChipDTO;
import ru.ozon.uni.atoms.data.text.TextDTO;

@Metadata(d1 = {"\u0000j\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\f\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\f\u0010\rJ!\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000f\u001a\u00020\u000e2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u001a\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00170\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u001c\u0010\u001b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001a0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u0019R \u0010\u001e\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001d0\u001c0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u0019R\"\u0010\u001f\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u001d\u0018\u00010\u001c0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010\u0019R\u001a\u0010!\u001a\b\u0012\u0004\u0012\u00020 0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010\u0019R\u001a\u0010#\u001a\b\u0012\u0004\u0012\u00020\"0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010\u0019R\u001c\u0010%\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010$0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b%\u0010\u0019¨\u0006&"}, d2 = {"Lru/ozon/app/android/travel/feature/general/common/widgets/pricesHistogram/v2/data/PricesHistogramV2DTOJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lru/ozon/app/android/travel/feature/general/common/widgets/pricesHistogram/v2/data/PricesHistogramV2DTO;", "Lcom/squareup/moshi/Moshi;", "moshi", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "", "toString", "()Ljava/lang/String;", "Lcom/squareup/moshi/n;", "reader", "fromJson", "(Lcom/squareup/moshi/n;)Lru/ozon/app/android/travel/feature/general/common/widgets/pricesHistogram/v2/data/PricesHistogramV2DTO;", "Lcom/squareup/moshi/x;", "writer", AppMeasurementSdk.ConditionalUserProperty.VALUE, "", "toJson", "(Lcom/squareup/moshi/x;Lru/ozon/app/android/travel/feature/general/common/widgets/pricesHistogram/v2/data/PricesHistogramV2DTO;)V", "Lcom/squareup/moshi/n$a;", "options", "Lcom/squareup/moshi/n$a;", "Lru/ozon/uni/atoms/data/text/TextDTO;", "textDTOAdapter", "Lcom/squareup/moshi/JsonAdapter;", "Lru/ozon/uni/atoms/data/controls/chip/ChipDTO;", "nullableChipDTOAdapter", "", "Lru/ozon/app/android/travel/feature/general/common/widgets/pricesHistogram/v2/data/PricesHistogramV2DTO$MonthDTO;", "listOfMonthDTOAdapter", "nullableListOfMonthDTOAdapter", "Lru/ozon/uni/atoms/data/controls/button/ButtonV3DTO;", "buttonV3DTOAdapter", "Lru/ozon/app/android/travel/feature/general/common/widgets/pricesHistogram/v2/data/PricesHistogramV2DTO$AvailableColorsDTO;", "availableColorsDTOAdapter", "Lru/ozon/uni/atoms/data/cell/ToggleTitleSubtitleCellDTO;", "nullableToggleTitleSubtitleCellDTOAdapter", "common_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class PricesHistogramV2DTOJsonAdapter extends JsonAdapter<PricesHistogramV2DTO> {
    public static final int $stable = 8;

    @NotNull
    private final JsonAdapter<PricesHistogramV2DTO.AvailableColorsDTO> availableColorsDTOAdapter;

    @NotNull
    private final JsonAdapter<ButtonV3DTO> buttonV3DTOAdapter;

    @NotNull
    private final JsonAdapter<List<PricesHistogramV2DTO.MonthDTO>> listOfMonthDTOAdapter;

    @NotNull
    private final JsonAdapter<ChipDTO> nullableChipDTOAdapter;

    @NotNull
    private final JsonAdapter<List<PricesHistogramV2DTO.MonthDTO>> nullableListOfMonthDTOAdapter;

    @NotNull
    private final JsonAdapter<ToggleTitleSubtitleCellDTO> nullableToggleTitleSubtitleCellDTOAdapter;

    @NotNull
    private final n.a options;

    @NotNull
    private final JsonAdapter<TextDTO> textDTOAdapter;

    public PricesHistogramV2DTOJsonAdapter(@NotNull Moshi moshi) {
        Intrinsics.checkNotNullParameter(moshi, "moshi");
        this.options = n.a.C0918a.a("direction", "tabThere", "tabBack", "monthsThere", "monthsBack", "findTicketsButton", "availableColors", "toggleCalendarButton");
        M m11 = M.f71699a;
        this.textDTOAdapter = moshi.f(TextDTO.class, m11, "direction");
        this.nullableChipDTOAdapter = moshi.f(ChipDTO.class, m11, "tabThere");
        this.listOfMonthDTOAdapter = moshi.f(D.e(List.class, PricesHistogramV2DTO.MonthDTO.class), m11, "monthsThere");
        this.nullableListOfMonthDTOAdapter = moshi.f(D.e(List.class, PricesHistogramV2DTO.MonthDTO.class), m11, "monthsBack");
        this.buttonV3DTOAdapter = moshi.f(ButtonV3DTO.class, m11, "findTicketsButton");
        this.availableColorsDTOAdapter = moshi.f(PricesHistogramV2DTO.AvailableColorsDTO.class, m11, "availableColors");
        this.nullableToggleTitleSubtitleCellDTOAdapter = moshi.f(ToggleTitleSubtitleCellDTO.class, m11, "toggleCalendarButton");
    }

    @NotNull
    public String toString() {
        return b.c(42, "GeneratedJsonAdapter(PricesHistogramV2DTO)", "toString(...)");
    }

    @Override // com.squareup.moshi.JsonAdapter
    @NotNull
    public PricesHistogramV2DTO fromJson(@NotNull n reader) {
        Intrinsics.checkNotNullParameter(reader, "reader");
        reader.beginObject();
        TextDTO textDTO = null;
        ChipDTO chipDTO = null;
        ChipDTO chipDTO2 = null;
        List<PricesHistogramV2DTO.MonthDTO> list = null;
        List<PricesHistogramV2DTO.MonthDTO> list2 = null;
        ButtonV3DTO buttonV3DTO = null;
        PricesHistogramV2DTO.AvailableColorsDTO availableColorsDTO = null;
        ToggleTitleSubtitleCellDTO toggleTitleSubtitleCellDTO = null;
        while (reader.hasNext()) {
            switch (reader.v(this.options)) {
                case -1:
                    reader.y();
                    reader.skipValue();
                    break;
                case 0:
                    textDTO = this.textDTOAdapter.fromJson(reader);
                    if (textDTO == null) {
                        throw c.q("direction", "direction", reader);
                    }
                    break;
                case 1:
                    chipDTO = this.nullableChipDTOAdapter.fromJson(reader);
                    break;
                case 2:
                    chipDTO2 = this.nullableChipDTOAdapter.fromJson(reader);
                    break;
                case 3:
                    list = this.listOfMonthDTOAdapter.fromJson(reader);
                    if (list == null) {
                        throw c.q("monthsThere", "monthsThere", reader);
                    }
                    break;
                case 4:
                    list2 = this.nullableListOfMonthDTOAdapter.fromJson(reader);
                    break;
                case 5:
                    buttonV3DTO = this.buttonV3DTOAdapter.fromJson(reader);
                    if (buttonV3DTO == null) {
                        throw c.q("findTicketsButton", "findTicketsButton", reader);
                    }
                    break;
                case 6:
                    availableColorsDTO = this.availableColorsDTOAdapter.fromJson(reader);
                    if (availableColorsDTO == null) {
                        throw c.q("availableColors", "availableColors", reader);
                    }
                    break;
                case 7:
                    toggleTitleSubtitleCellDTO = this.nullableToggleTitleSubtitleCellDTOAdapter.fromJson(reader);
                    break;
            }
        }
        reader.endObject();
        if (textDTO == null) {
            throw c.j("direction", "direction", reader);
        }
        if (list == null) {
            throw c.j("monthsThere", "monthsThere", reader);
        }
        if (buttonV3DTO == null) {
            throw c.j("findTicketsButton", "findTicketsButton", reader);
        }
        if (availableColorsDTO != null) {
            return new PricesHistogramV2DTO(textDTO, chipDTO, chipDTO2, list, list2, buttonV3DTO, availableColorsDTO, toggleTitleSubtitleCellDTO);
        }
        throw c.j("availableColors", "availableColors", reader);
    }

    @Override // com.squareup.moshi.JsonAdapter
    /* renamed from: toJson, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
    public void mo44toJson(@NotNull x writer, PricesHistogramV2DTO value) {
        Intrinsics.checkNotNullParameter(writer, "writer");
        if (value == null) {
            throw new NullPointerException("value was null! Wrap in .nullSafe() to write nullable values.");
        }
        writer.j();
        writer.w("direction");
        this.textDTOAdapter.mo44toJson(writer, (x) value.getDirection());
        writer.w("tabThere");
        this.nullableChipDTOAdapter.mo44toJson(writer, (x) value.getTabThere());
        writer.w("tabBack");
        this.nullableChipDTOAdapter.mo44toJson(writer, (x) value.getTabBack());
        writer.w("monthsThere");
        this.listOfMonthDTOAdapter.mo44toJson(writer, (x) value.getMonthsThere());
        writer.w("monthsBack");
        this.nullableListOfMonthDTOAdapter.mo44toJson(writer, (x) value.getMonthsBack());
        writer.w("findTicketsButton");
        this.buttonV3DTOAdapter.mo44toJson(writer, (x) value.getFindTicketsButton());
        writer.w("availableColors");
        this.availableColorsDTOAdapter.mo44toJson(writer, (x) value.getAvailableColors());
        writer.w("toggleCalendarButton");
        this.nullableToggleTitleSubtitleCellDTOAdapter.mo44toJson(writer, (x) value.getToggleCalendarButton());
        writer.p();
    }
}
