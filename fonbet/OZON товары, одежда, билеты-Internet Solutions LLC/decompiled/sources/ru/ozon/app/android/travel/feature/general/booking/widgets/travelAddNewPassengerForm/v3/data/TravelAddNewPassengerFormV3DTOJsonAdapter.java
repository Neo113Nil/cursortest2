package ru.ozon.app.android.travel.feature.general.booking.widgets.travelAddNewPassengerForm.v3.data;

import Y9.b;
import Y9.c;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.squareup.moshi.D;
import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.Moshi;
import com.squareup.moshi.n;
import com.squareup.moshi.x;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.M;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.tokenized.model.TokenizedTrackingInfo;
import ru.ozon.app.android.travel.feature.general.booking.widgets.travelAddNewPassengerForm.v3.data.TravelAddNewPassengerFormV3DTO;
import ru.ozon.uni.atoms.data.controls.button.ButtonV3DTO;
import ru.ozon.uni.atoms.data.dsCell.CellDTO;
import ru.ozon.uni.atoms.data.text.TextDTO;

@Metadata(d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\f\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\f\u0010\rJ!\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000f\u001a\u00020\u000e2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R \u0010\u0019\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00180\u00170\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u001a\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u001b0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001aR\u001c\u0010\u001e\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001d0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001aR\u001c\u0010 \u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001f0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010\u001aR(\u0010#\u001a\u0016\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\"\u0018\u00010!0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010\u001aR\"\u0010$\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00170\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u0010\u001a¨\u0006%"}, d2 = {"Lru/ozon/app/android/travel/feature/general/booking/widgets/travelAddNewPassengerForm/v3/data/TravelAddNewPassengerFormV3DTOJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lru/ozon/app/android/travel/feature/general/booking/widgets/travelAddNewPassengerForm/v3/data/TravelAddNewPassengerFormV3DTO;", "Lcom/squareup/moshi/Moshi;", "moshi", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "", "toString", "()Ljava/lang/String;", "Lcom/squareup/moshi/n;", "reader", "fromJson", "(Lcom/squareup/moshi/n;)Lru/ozon/app/android/travel/feature/general/booking/widgets/travelAddNewPassengerForm/v3/data/TravelAddNewPassengerFormV3DTO;", "Lcom/squareup/moshi/x;", "writer", AppMeasurementSdk.ConditionalUserProperty.VALUE, "", "toJson", "(Lcom/squareup/moshi/x;Lru/ozon/app/android/travel/feature/general/booking/widgets/travelAddNewPassengerForm/v3/data/TravelAddNewPassengerFormV3DTO;)V", "Lcom/squareup/moshi/n$a;", "options", "Lcom/squareup/moshi/n$a;", "", "Lru/ozon/app/android/travel/feature/general/booking/widgets/travelAddNewPassengerForm/v3/data/TravelAddNewPassengerFormV3DTO$InputItemDTO;", "listOfInputItemDTOAdapter", "Lcom/squareup/moshi/JsonAdapter;", "Lru/ozon/uni/atoms/data/controls/button/ButtonV3DTO;", "buttonV3DTOAdapter", "Lru/ozon/uni/atoms/data/text/TextDTO;", "nullableTextDTOAdapter", "Lru/ozon/uni/atoms/data/dsCell/CellDTO;", "nullableCellDTOAdapter", "", "Lru/ozon/android/tokenized/model/TokenizedTrackingInfo;", "nullableMapOfStringTokenizedTrackingInfoAdapter", "nullableListOfStringAdapter", "booking_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class TravelAddNewPassengerFormV3DTOJsonAdapter extends JsonAdapter<TravelAddNewPassengerFormV3DTO> {

    @NotNull
    private final JsonAdapter<ButtonV3DTO> buttonV3DTOAdapter;

    @NotNull
    private final JsonAdapter<List<TravelAddNewPassengerFormV3DTO.InputItemDTO>> listOfInputItemDTOAdapter;

    @NotNull
    private final JsonAdapter<CellDTO> nullableCellDTOAdapter;

    @NotNull
    private final JsonAdapter<List<String>> nullableListOfStringAdapter;

    @NotNull
    private final JsonAdapter<Map<String, TokenizedTrackingInfo>> nullableMapOfStringTokenizedTrackingInfoAdapter;

    @NotNull
    private final JsonAdapter<TextDTO> nullableTextDTOAdapter;

    @NotNull
    private final n.a options;

    public TravelAddNewPassengerFormV3DTOJsonAdapter(@NotNull Moshi moshi) {
        Intrinsics.checkNotNullParameter(moshi, "moshi");
        this.options = n.a.C0918a.a("inputs", "saveButton", "agreementText", "useBankDetails", "trackingInfo", "actionNamesToSkip");
        b e11 = D.e(List.class, TravelAddNewPassengerFormV3DTO.InputItemDTO.class);
        M m11 = M.f71699a;
        this.listOfInputItemDTOAdapter = moshi.f(e11, m11, "inputs");
        this.buttonV3DTOAdapter = moshi.f(ButtonV3DTO.class, m11, "saveButton");
        this.nullableTextDTOAdapter = moshi.f(TextDTO.class, m11, "agreementText");
        this.nullableCellDTOAdapter = moshi.f(CellDTO.class, m11, "useBankDetails");
        this.nullableMapOfStringTokenizedTrackingInfoAdapter = moshi.f(D.e(Map.class, String.class, TokenizedTrackingInfo.class), m11, "trackingInfo");
        this.nullableListOfStringAdapter = moshi.f(D.e(List.class, String.class), m11, "actionNamesToSkip");
    }

    @NotNull
    public String toString() {
        return Ak.b.c(52, "GeneratedJsonAdapter(TravelAddNewPassengerFormV3DTO)", "toString(...)");
    }

    @Override // com.squareup.moshi.JsonAdapter
    @NotNull
    public TravelAddNewPassengerFormV3DTO fromJson(@NotNull n reader) {
        Intrinsics.checkNotNullParameter(reader, "reader");
        reader.beginObject();
        List<TravelAddNewPassengerFormV3DTO.InputItemDTO> list = null;
        ButtonV3DTO buttonV3DTO = null;
        TextDTO textDTO = null;
        CellDTO cellDTO = null;
        Map<String, TokenizedTrackingInfo> map = null;
        List<String> list2 = null;
        while (reader.hasNext()) {
            switch (reader.v(this.options)) {
                case -1:
                    reader.y();
                    reader.skipValue();
                    break;
                case 0:
                    list = this.listOfInputItemDTOAdapter.fromJson(reader);
                    if (list == null) {
                        throw c.q("inputs", "inputs", reader);
                    }
                    break;
                case 1:
                    buttonV3DTO = this.buttonV3DTOAdapter.fromJson(reader);
                    if (buttonV3DTO == null) {
                        throw c.q("saveButton", "saveButton", reader);
                    }
                    break;
                case 2:
                    textDTO = this.nullableTextDTOAdapter.fromJson(reader);
                    break;
                case 3:
                    cellDTO = this.nullableCellDTOAdapter.fromJson(reader);
                    break;
                case 4:
                    map = this.nullableMapOfStringTokenizedTrackingInfoAdapter.fromJson(reader);
                    break;
                case 5:
                    list2 = this.nullableListOfStringAdapter.fromJson(reader);
                    break;
            }
        }
        reader.endObject();
        if (list == null) {
            throw c.j("inputs", "inputs", reader);
        }
        if (buttonV3DTO != null) {
            return new TravelAddNewPassengerFormV3DTO(list, buttonV3DTO, textDTO, cellDTO, map, list2);
        }
        throw c.j("saveButton", "saveButton", reader);
    }

    @Override // com.squareup.moshi.JsonAdapter
    /* renamed from: toJson, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
    public void mo44toJson(@NotNull x writer, TravelAddNewPassengerFormV3DTO value) {
        Intrinsics.checkNotNullParameter(writer, "writer");
        if (value == null) {
            throw new NullPointerException("value was null! Wrap in .nullSafe() to write nullable values.");
        }
        writer.j();
        writer.w("inputs");
        this.listOfInputItemDTOAdapter.mo44toJson(writer, (x) value.getInputs());
        writer.w("saveButton");
        this.buttonV3DTOAdapter.mo44toJson(writer, (x) value.getSaveButton());
        writer.w("agreementText");
        this.nullableTextDTOAdapter.mo44toJson(writer, (x) value.getAgreementText());
        writer.w("useBankDetails");
        this.nullableCellDTOAdapter.mo44toJson(writer, (x) value.getUseBankDetails());
        writer.w("trackingInfo");
        this.nullableMapOfStringTokenizedTrackingInfoAdapter.mo44toJson(writer, (x) value.getTrackingInfo());
        writer.w("actionNamesToSkip");
        this.nullableListOfStringAdapter.mo44toJson(writer, (x) value.getActionNamesToSkip());
        writer.p();
    }
}
