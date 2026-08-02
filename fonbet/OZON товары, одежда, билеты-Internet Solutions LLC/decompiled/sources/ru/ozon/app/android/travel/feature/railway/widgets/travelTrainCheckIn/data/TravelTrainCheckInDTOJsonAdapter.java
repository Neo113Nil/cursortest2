package ru.ozon.app.android.travel.feature.railway.widgets.travelTrainCheckIn.data;

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
import ru.ozon.app.android.travel.feature.railway.widgets.travelTrainCheckIn.data.TravelTrainCheckInDTO;
import ru.ozon.app.android.ugc.widgets.selectionItemForm.data.SelectionItemFormDTO;
import ru.ozon.uni.atoms.data.texts.TextAtom;

@Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\f\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\f\u0010\rJ!\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000f\u001a\u00020\u000e2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u001c\u0010\u0018\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00170\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R \u0010\u001c\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001b0\u001a0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u0019R\u001a\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u001d0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u0019R\"\u0010\u001f\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u001a0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010\u0019¨\u0006 "}, d2 = {"Lru/ozon/app/android/travel/feature/railway/widgets/travelTrainCheckIn/data/TravelTrainCheckInDTOJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lru/ozon/app/android/travel/feature/railway/widgets/travelTrainCheckIn/data/TravelTrainCheckInDTO;", "Lcom/squareup/moshi/Moshi;", "moshi", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "", "toString", "()Ljava/lang/String;", "Lcom/squareup/moshi/n;", "reader", "fromJson", "(Lcom/squareup/moshi/n;)Lru/ozon/app/android/travel/feature/railway/widgets/travelTrainCheckIn/data/TravelTrainCheckInDTO;", "Lcom/squareup/moshi/x;", "writer", AppMeasurementSdk.ConditionalUserProperty.VALUE, "", "toJson", "(Lcom/squareup/moshi/x;Lru/ozon/app/android/travel/feature/railway/widgets/travelTrainCheckIn/data/TravelTrainCheckInDTO;)V", "Lcom/squareup/moshi/n$a;", "options", "Lcom/squareup/moshi/n$a;", "Lru/ozon/uni/atoms/data/texts/TextAtom;", "nullableTextAtomAdapter", "Lcom/squareup/moshi/JsonAdapter;", "", "Lru/ozon/app/android/atoms/data/cells/CellAtom$CellAtomWithSubtitle$CellWithSubtitle24IconCheckboxRadio;", "listOfCellWithSubtitle24IconCheckboxRadioAdapter", "Lru/ozon/app/android/travel/feature/railway/widgets/travelTrainCheckIn/data/TravelTrainCheckInDTO$Button;", "buttonAdapter", "nullableListOfStringAdapter", "railway_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class TravelTrainCheckInDTOJsonAdapter extends JsonAdapter<TravelTrainCheckInDTO> {
    public static final int $stable = 8;

    @NotNull
    private final JsonAdapter<TravelTrainCheckInDTO.Button> buttonAdapter;

    @NotNull
    private final JsonAdapter<List<CellAtom.CellAtomWithSubtitle.CellWithSubtitle24IconCheckboxRadio>> listOfCellWithSubtitle24IconCheckboxRadioAdapter;

    @NotNull
    private final JsonAdapter<List<String>> nullableListOfStringAdapter;

    @NotNull
    private final JsonAdapter<TextAtom> nullableTextAtomAdapter;

    @NotNull
    private final n.a options;

    public TravelTrainCheckInDTOJsonAdapter(@NotNull Moshi moshi) {
        Intrinsics.checkNotNullParameter(moshi, "moshi");
        this.options = n.a.C0918a.a(SelectionItemFormDTO.TITLE_FIELD_NAME, "passengersList", "checkInButton", "cancelButton", "errors");
        M m11 = M.f71699a;
        this.nullableTextAtomAdapter = moshi.f(TextAtom.class, m11, SelectionItemFormDTO.TITLE_FIELD_NAME);
        this.listOfCellWithSubtitle24IconCheckboxRadioAdapter = moshi.f(D.e(List.class, CellAtom.CellAtomWithSubtitle.CellWithSubtitle24IconCheckboxRadio.class), m11, "passengersList");
        this.buttonAdapter = moshi.f(TravelTrainCheckInDTO.Button.class, m11, "checkInButton");
        this.nullableListOfStringAdapter = moshi.f(D.e(List.class, String.class), m11, "errors");
    }

    @NotNull
    public String toString() {
        return b.c(43, "GeneratedJsonAdapter(TravelTrainCheckInDTO)", "toString(...)");
    }

    @Override // com.squareup.moshi.JsonAdapter
    @NotNull
    public TravelTrainCheckInDTO fromJson(@NotNull n reader) {
        Intrinsics.checkNotNullParameter(reader, "reader");
        reader.beginObject();
        TextAtom textAtom = null;
        List<CellAtom.CellAtomWithSubtitle.CellWithSubtitle24IconCheckboxRadio> list = null;
        TravelTrainCheckInDTO.Button button = null;
        TravelTrainCheckInDTO.Button button2 = null;
        List<String> list2 = null;
        while (reader.hasNext()) {
            int v11 = reader.v(this.options);
            if (v11 == -1) {
                reader.y();
                reader.skipValue();
            } else if (v11 == 0) {
                textAtom = this.nullableTextAtomAdapter.fromJson(reader);
            } else if (v11 == 1) {
                list = this.listOfCellWithSubtitle24IconCheckboxRadioAdapter.fromJson(reader);
                if (list == null) {
                    throw c.q("passengersList", "passengersList", reader);
                }
            } else if (v11 == 2) {
                button = this.buttonAdapter.fromJson(reader);
                if (button == null) {
                    throw c.q("checkInButton", "checkInButton", reader);
                }
            } else if (v11 == 3) {
                button2 = this.buttonAdapter.fromJson(reader);
                if (button2 == null) {
                    throw c.q("cancelButton", "cancelButton", reader);
                }
            } else if (v11 == 4) {
                list2 = this.nullableListOfStringAdapter.fromJson(reader);
            }
        }
        reader.endObject();
        if (list == null) {
            throw c.j("passengersList", "passengersList", reader);
        }
        if (button == null) {
            throw c.j("checkInButton", "checkInButton", reader);
        }
        if (button2 != null) {
            return new TravelTrainCheckInDTO(textAtom, list, button, button2, list2);
        }
        throw c.j("cancelButton", "cancelButton", reader);
    }

    @Override // com.squareup.moshi.JsonAdapter
    /* renamed from: toJson, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
    public void mo44toJson(@NotNull x writer, TravelTrainCheckInDTO value) {
        Intrinsics.checkNotNullParameter(writer, "writer");
        if (value == null) {
            throw new NullPointerException("value was null! Wrap in .nullSafe() to write nullable values.");
        }
        writer.j();
        writer.w(SelectionItemFormDTO.TITLE_FIELD_NAME);
        this.nullableTextAtomAdapter.mo44toJson(writer, (x) value.getTitle());
        writer.w("passengersList");
        this.listOfCellWithSubtitle24IconCheckboxRadioAdapter.mo44toJson(writer, (x) value.getPassengersList());
        writer.w("checkInButton");
        this.buttonAdapter.mo44toJson(writer, (x) value.getCheckInButton());
        writer.w("cancelButton");
        this.buttonAdapter.mo44toJson(writer, (x) value.getCancelButton());
        writer.w("errors");
        this.nullableListOfStringAdapter.mo44toJson(writer, (x) value.getErrors());
        writer.p();
    }
}
