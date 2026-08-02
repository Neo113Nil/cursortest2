package ru.ozon.app.android.cml.delivery.widgets.personalInfoVerification.data;

import Ak.b;
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
import ru.ozon.app.android.cml.delivery.molecules.button.data.CmlButtonDTO;
import ru.ozon.app.android.cml.delivery.molecules.input.data.InputMoleculeDTO;
import ru.ozon.app.android.ugc.widgets.selectionItemForm.data.SelectionItemFormDTO;
import ru.ozon.uni.atoms.data.dsCell.CellDTO;
import ru.ozon.uni.atoms.data.text.TextDTO;

@Metadata(d1 = {"\u0000j\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\f\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\f\u0010\rJ!\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000f\u001a\u00020\u000e2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u001a\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00170\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R \u0010\u001b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00170\u001a0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u0019R\u001a\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00070\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u0019R\u001a\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u001d0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u0019R\u001a\u0010 \u001a\b\u0012\u0004\u0012\u00020\u001f0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010\u0019R\u001a\u0010\"\u001a\b\u0012\u0004\u0012\u00020!0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010\u0019R(\u0010%\u001a\u0016\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020$\u0018\u00010#0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b%\u0010\u0019¨\u0006&"}, d2 = {"Lru/ozon/app/android/cml/delivery/widgets/personalInfoVerification/data/PersonalInfoVerificationDTOJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lru/ozon/app/android/cml/delivery/widgets/personalInfoVerification/data/PersonalInfoVerificationDTO;", "Lcom/squareup/moshi/Moshi;", "moshi", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "", "toString", "()Ljava/lang/String;", "Lcom/squareup/moshi/n;", "reader", "fromJson", "(Lcom/squareup/moshi/n;)Lru/ozon/app/android/cml/delivery/widgets/personalInfoVerification/data/PersonalInfoVerificationDTO;", "Lcom/squareup/moshi/x;", "writer", AppMeasurementSdk.ConditionalUserProperty.VALUE, "", "toJson", "(Lcom/squareup/moshi/x;Lru/ozon/app/android/cml/delivery/widgets/personalInfoVerification/data/PersonalInfoVerificationDTO;)V", "Lcom/squareup/moshi/n$a;", "options", "Lcom/squareup/moshi/n$a;", "Lru/ozon/uni/atoms/data/text/TextDTO;", "textDTOAdapter", "Lcom/squareup/moshi/JsonAdapter;", "", "listOfTextDTOAdapter", "stringAdapter", "Lru/ozon/app/android/cml/delivery/molecules/input/data/InputMoleculeDTO;", "inputMoleculeDTOAdapter", "Lru/ozon/uni/atoms/data/dsCell/CellDTO;", "cellDTOAdapter", "Lru/ozon/app/android/cml/delivery/molecules/button/data/CmlButtonDTO;", "cmlButtonDTOAdapter", "", "Lru/ozon/android/tokenized/model/TokenizedTrackingInfo;", "nullableMapOfStringTokenizedTrackingInfoAdapter", "delivery_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class PersonalInfoVerificationDTOJsonAdapter extends JsonAdapter<PersonalInfoVerificationDTO> {

    @NotNull
    private final JsonAdapter<CellDTO> cellDTOAdapter;

    @NotNull
    private final JsonAdapter<CmlButtonDTO> cmlButtonDTOAdapter;

    @NotNull
    private final JsonAdapter<InputMoleculeDTO> inputMoleculeDTOAdapter;

    @NotNull
    private final JsonAdapter<List<TextDTO>> listOfTextDTOAdapter;

    @NotNull
    private final JsonAdapter<Map<String, TokenizedTrackingInfo>> nullableMapOfStringTokenizedTrackingInfoAdapter;

    @NotNull
    private final n.a options;

    @NotNull
    private final JsonAdapter<String> stringAdapter;

    @NotNull
    private final JsonAdapter<TextDTO> textDTOAdapter;

    public PersonalInfoVerificationDTOJsonAdapter(@NotNull Moshi moshi) {
        Intrinsics.checkNotNullParameter(moshi, "moshi");
        this.options = n.a.C0918a.a(SelectionItemFormDTO.TITLE_FIELD_NAME, "subtitle", "formBackgroundColor", "surnameInput", "nameInput", "patronymicInput", "patronymicSettingsCell", "birthDateInput", "passportInput", "confirmButton", "trackingInfo");
        M m11 = M.f71699a;
        this.textDTOAdapter = moshi.f(TextDTO.class, m11, SelectionItemFormDTO.TITLE_FIELD_NAME);
        this.listOfTextDTOAdapter = moshi.f(D.e(List.class, TextDTO.class), m11, "subtitle");
        this.stringAdapter = moshi.f(String.class, m11, "formBackgroundColor");
        this.inputMoleculeDTOAdapter = moshi.f(InputMoleculeDTO.class, m11, "surnameInput");
        this.cellDTOAdapter = moshi.f(CellDTO.class, m11, "patronymicSettingsCell");
        this.cmlButtonDTOAdapter = moshi.f(CmlButtonDTO.class, m11, "confirmButton");
        this.nullableMapOfStringTokenizedTrackingInfoAdapter = moshi.f(D.e(Map.class, String.class, TokenizedTrackingInfo.class), m11, "trackingInfo");
    }

    @NotNull
    public String toString() {
        return b.c(49, "GeneratedJsonAdapter(PersonalInfoVerificationDTO)", "toString(...)");
    }

    @Override // com.squareup.moshi.JsonAdapter
    @NotNull
    public PersonalInfoVerificationDTO fromJson(@NotNull n reader) {
        Intrinsics.checkNotNullParameter(reader, "reader");
        reader.beginObject();
        TextDTO textDTO = null;
        List<TextDTO> list = null;
        String str = null;
        InputMoleculeDTO inputMoleculeDTO = null;
        InputMoleculeDTO inputMoleculeDTO2 = null;
        InputMoleculeDTO inputMoleculeDTO3 = null;
        CellDTO cellDTO = null;
        InputMoleculeDTO inputMoleculeDTO4 = null;
        InputMoleculeDTO inputMoleculeDTO5 = null;
        CmlButtonDTO cmlButtonDTO = null;
        Map<String, TokenizedTrackingInfo> map = null;
        while (true) {
            TextDTO textDTO2 = textDTO;
            List<TextDTO> list2 = list;
            String str2 = str;
            InputMoleculeDTO inputMoleculeDTO6 = inputMoleculeDTO;
            InputMoleculeDTO inputMoleculeDTO7 = inputMoleculeDTO2;
            InputMoleculeDTO inputMoleculeDTO8 = inputMoleculeDTO3;
            CellDTO cellDTO2 = cellDTO;
            if (!reader.hasNext()) {
                InputMoleculeDTO inputMoleculeDTO9 = inputMoleculeDTO4;
                reader.endObject();
                if (textDTO2 == null) {
                    throw c.j(SelectionItemFormDTO.TITLE_FIELD_NAME, SelectionItemFormDTO.TITLE_FIELD_NAME, reader);
                }
                if (list2 == null) {
                    throw c.j("subtitle", "subtitle", reader);
                }
                if (str2 == null) {
                    throw c.j("formBackgroundColor", "formBackgroundColor", reader);
                }
                if (inputMoleculeDTO6 == null) {
                    throw c.j("surnameInput", "surnameInput", reader);
                }
                if (inputMoleculeDTO7 == null) {
                    throw c.j("nameInput", "nameInput", reader);
                }
                if (inputMoleculeDTO8 == null) {
                    throw c.j("patronymicInput", "patronymicInput", reader);
                }
                if (cellDTO2 == null) {
                    throw c.j("patronymicSettingsCell", "patronymicSettingsCell", reader);
                }
                if (inputMoleculeDTO9 == null) {
                    throw c.j("birthDateInput", "birthDateInput", reader);
                }
                if (inputMoleculeDTO5 == null) {
                    throw c.j("passportInput", "passportInput", reader);
                }
                if (cmlButtonDTO != null) {
                    return new PersonalInfoVerificationDTO(textDTO2, list2, str2, inputMoleculeDTO6, inputMoleculeDTO7, inputMoleculeDTO8, cellDTO2, inputMoleculeDTO9, inputMoleculeDTO5, cmlButtonDTO, map);
                }
                throw c.j("confirmButton", "confirmButton", reader);
            }
            InputMoleculeDTO inputMoleculeDTO10 = inputMoleculeDTO4;
            switch (reader.v(this.options)) {
                case -1:
                    reader.y();
                    reader.skipValue();
                    inputMoleculeDTO4 = inputMoleculeDTO10;
                    textDTO = textDTO2;
                    list = list2;
                    str = str2;
                    inputMoleculeDTO = inputMoleculeDTO6;
                    inputMoleculeDTO2 = inputMoleculeDTO7;
                    inputMoleculeDTO3 = inputMoleculeDTO8;
                    cellDTO = cellDTO2;
                case 0:
                    textDTO = this.textDTOAdapter.fromJson(reader);
                    if (textDTO == null) {
                        throw c.q(SelectionItemFormDTO.TITLE_FIELD_NAME, SelectionItemFormDTO.TITLE_FIELD_NAME, reader);
                    }
                    inputMoleculeDTO4 = inputMoleculeDTO10;
                    list = list2;
                    str = str2;
                    inputMoleculeDTO = inputMoleculeDTO6;
                    inputMoleculeDTO2 = inputMoleculeDTO7;
                    inputMoleculeDTO3 = inputMoleculeDTO8;
                    cellDTO = cellDTO2;
                case 1:
                    list = this.listOfTextDTOAdapter.fromJson(reader);
                    if (list == null) {
                        throw c.q("subtitle", "subtitle", reader);
                    }
                    inputMoleculeDTO4 = inputMoleculeDTO10;
                    textDTO = textDTO2;
                    str = str2;
                    inputMoleculeDTO = inputMoleculeDTO6;
                    inputMoleculeDTO2 = inputMoleculeDTO7;
                    inputMoleculeDTO3 = inputMoleculeDTO8;
                    cellDTO = cellDTO2;
                case 2:
                    str = this.stringAdapter.fromJson(reader);
                    if (str == null) {
                        throw c.q("formBackgroundColor", "formBackgroundColor", reader);
                    }
                    inputMoleculeDTO4 = inputMoleculeDTO10;
                    textDTO = textDTO2;
                    list = list2;
                    inputMoleculeDTO = inputMoleculeDTO6;
                    inputMoleculeDTO2 = inputMoleculeDTO7;
                    inputMoleculeDTO3 = inputMoleculeDTO8;
                    cellDTO = cellDTO2;
                case 3:
                    inputMoleculeDTO = this.inputMoleculeDTOAdapter.fromJson(reader);
                    if (inputMoleculeDTO == null) {
                        throw c.q("surnameInput", "surnameInput", reader);
                    }
                    inputMoleculeDTO4 = inputMoleculeDTO10;
                    textDTO = textDTO2;
                    list = list2;
                    str = str2;
                    inputMoleculeDTO2 = inputMoleculeDTO7;
                    inputMoleculeDTO3 = inputMoleculeDTO8;
                    cellDTO = cellDTO2;
                case 4:
                    inputMoleculeDTO2 = this.inputMoleculeDTOAdapter.fromJson(reader);
                    if (inputMoleculeDTO2 == null) {
                        throw c.q("nameInput", "nameInput", reader);
                    }
                    inputMoleculeDTO4 = inputMoleculeDTO10;
                    textDTO = textDTO2;
                    list = list2;
                    str = str2;
                    inputMoleculeDTO = inputMoleculeDTO6;
                    inputMoleculeDTO3 = inputMoleculeDTO8;
                    cellDTO = cellDTO2;
                case 5:
                    inputMoleculeDTO3 = this.inputMoleculeDTOAdapter.fromJson(reader);
                    if (inputMoleculeDTO3 == null) {
                        throw c.q("patronymicInput", "patronymicInput", reader);
                    }
                    inputMoleculeDTO4 = inputMoleculeDTO10;
                    textDTO = textDTO2;
                    list = list2;
                    str = str2;
                    inputMoleculeDTO = inputMoleculeDTO6;
                    inputMoleculeDTO2 = inputMoleculeDTO7;
                    cellDTO = cellDTO2;
                case 6:
                    cellDTO = this.cellDTOAdapter.fromJson(reader);
                    if (cellDTO == null) {
                        throw c.q("patronymicSettingsCell", "patronymicSettingsCell", reader);
                    }
                    inputMoleculeDTO4 = inputMoleculeDTO10;
                    textDTO = textDTO2;
                    list = list2;
                    str = str2;
                    inputMoleculeDTO = inputMoleculeDTO6;
                    inputMoleculeDTO2 = inputMoleculeDTO7;
                    inputMoleculeDTO3 = inputMoleculeDTO8;
                case 7:
                    inputMoleculeDTO4 = this.inputMoleculeDTOAdapter.fromJson(reader);
                    if (inputMoleculeDTO4 == null) {
                        throw c.q("birthDateInput", "birthDateInput", reader);
                    }
                    textDTO = textDTO2;
                    list = list2;
                    str = str2;
                    inputMoleculeDTO = inputMoleculeDTO6;
                    inputMoleculeDTO2 = inputMoleculeDTO7;
                    inputMoleculeDTO3 = inputMoleculeDTO8;
                    cellDTO = cellDTO2;
                case 8:
                    inputMoleculeDTO5 = this.inputMoleculeDTOAdapter.fromJson(reader);
                    if (inputMoleculeDTO5 == null) {
                        throw c.q("passportInput", "passportInput", reader);
                    }
                    inputMoleculeDTO4 = inputMoleculeDTO10;
                    textDTO = textDTO2;
                    list = list2;
                    str = str2;
                    inputMoleculeDTO = inputMoleculeDTO6;
                    inputMoleculeDTO2 = inputMoleculeDTO7;
                    inputMoleculeDTO3 = inputMoleculeDTO8;
                    cellDTO = cellDTO2;
                case 9:
                    cmlButtonDTO = this.cmlButtonDTOAdapter.fromJson(reader);
                    if (cmlButtonDTO == null) {
                        throw c.q("confirmButton", "confirmButton", reader);
                    }
                    inputMoleculeDTO4 = inputMoleculeDTO10;
                    textDTO = textDTO2;
                    list = list2;
                    str = str2;
                    inputMoleculeDTO = inputMoleculeDTO6;
                    inputMoleculeDTO2 = inputMoleculeDTO7;
                    inputMoleculeDTO3 = inputMoleculeDTO8;
                    cellDTO = cellDTO2;
                case 10:
                    map = this.nullableMapOfStringTokenizedTrackingInfoAdapter.fromJson(reader);
                    inputMoleculeDTO4 = inputMoleculeDTO10;
                    textDTO = textDTO2;
                    list = list2;
                    str = str2;
                    inputMoleculeDTO = inputMoleculeDTO6;
                    inputMoleculeDTO2 = inputMoleculeDTO7;
                    inputMoleculeDTO3 = inputMoleculeDTO8;
                    cellDTO = cellDTO2;
                default:
                    inputMoleculeDTO4 = inputMoleculeDTO10;
                    textDTO = textDTO2;
                    list = list2;
                    str = str2;
                    inputMoleculeDTO = inputMoleculeDTO6;
                    inputMoleculeDTO2 = inputMoleculeDTO7;
                    inputMoleculeDTO3 = inputMoleculeDTO8;
                    cellDTO = cellDTO2;
            }
        }
    }

    @Override // com.squareup.moshi.JsonAdapter
    /* renamed from: toJson, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
    public void mo44toJson(@NotNull x writer, PersonalInfoVerificationDTO value) {
        Intrinsics.checkNotNullParameter(writer, "writer");
        if (value == null) {
            throw new NullPointerException("value was null! Wrap in .nullSafe() to write nullable values.");
        }
        writer.j();
        writer.w(SelectionItemFormDTO.TITLE_FIELD_NAME);
        this.textDTOAdapter.mo44toJson(writer, (x) value.getTitle());
        writer.w("subtitle");
        this.listOfTextDTOAdapter.mo44toJson(writer, (x) value.getSubtitle());
        writer.w("formBackgroundColor");
        this.stringAdapter.mo44toJson(writer, (x) value.getFormBackgroundColor());
        writer.w("surnameInput");
        this.inputMoleculeDTOAdapter.mo44toJson(writer, (x) value.getSurnameInput());
        writer.w("nameInput");
        this.inputMoleculeDTOAdapter.mo44toJson(writer, (x) value.getNameInput());
        writer.w("patronymicInput");
        this.inputMoleculeDTOAdapter.mo44toJson(writer, (x) value.getPatronymicInput());
        writer.w("patronymicSettingsCell");
        this.cellDTOAdapter.mo44toJson(writer, (x) value.getPatronymicSettingsCell());
        writer.w("birthDateInput");
        this.inputMoleculeDTOAdapter.mo44toJson(writer, (x) value.getBirthDateInput());
        writer.w("passportInput");
        this.inputMoleculeDTOAdapter.mo44toJson(writer, (x) value.getPassportInput());
        writer.w("confirmButton");
        this.cmlButtonDTOAdapter.mo44toJson(writer, (x) value.getConfirmButton());
        writer.w("trackingInfo");
        this.nullableMapOfStringTokenizedTrackingInfoAdapter.mo44toJson(writer, (x) value.getTrackingInfo());
        writer.p();
    }
}
