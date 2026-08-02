package ru.ozon.app.android.fresh.feature.b2b.widgets.addConsignee.data;

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
import ru.ozon.app.android.fresh.feature.b2b.widgets.addConsignee.data.AddConsigneeDTO;
import ru.ozon.uni.atoms.data.controls.button.ButtonV3DTO;
import ru.ozon.uni.atoms.data.dsCell.CellDTO;
import ru.ozon.uni.atoms.data.text.TextDTO;

@Metadata(d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\f\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\f\u0010\rJ!\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000f\u001a\u00020\u000e2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u001a\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00170\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u001a\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u001a0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u0019R\"\u0010\u001e\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u001d\u0018\u00010\u001c0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u0019R\u001c\u0010 \u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001f0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010\u0019R\u001c\u0010\"\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010!0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010\u0019¨\u0006#"}, d2 = {"Lru/ozon/app/android/fresh/feature/b2b/widgets/addConsignee/data/AddConsigneeDTOJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lru/ozon/app/android/fresh/feature/b2b/widgets/addConsignee/data/AddConsigneeDTO;", "Lcom/squareup/moshi/Moshi;", "moshi", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "", "toString", "()Ljava/lang/String;", "Lcom/squareup/moshi/n;", "reader", "fromJson", "(Lcom/squareup/moshi/n;)Lru/ozon/app/android/fresh/feature/b2b/widgets/addConsignee/data/AddConsigneeDTO;", "Lcom/squareup/moshi/x;", "writer", AppMeasurementSdk.ConditionalUserProperty.VALUE, "", "toJson", "(Lcom/squareup/moshi/x;Lru/ozon/app/android/fresh/feature/b2b/widgets/addConsignee/data/AddConsigneeDTO;)V", "Lcom/squareup/moshi/n$a;", "options", "Lcom/squareup/moshi/n$a;", "Lru/ozon/uni/atoms/data/text/TextDTO;", "textDTOAdapter", "Lcom/squareup/moshi/JsonAdapter;", "Lru/ozon/app/android/fresh/feature/b2b/widgets/addConsignee/data/AddConsigneeDTO$InputField;", "inputFieldAdapter", "", "Lru/ozon/uni/atoms/data/dsCell/CellDTO;", "nullableListOfCellDTOAdapter", "Lru/ozon/app/android/fresh/feature/b2b/widgets/addConsignee/data/AddConsigneeDTO$AdditionalFields;", "nullableAdditionalFieldsAdapter", "Lru/ozon/uni/atoms/data/controls/button/ButtonV3DTO;", "nullableButtonV3DTOAdapter", "b2b_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class AddConsigneeDTOJsonAdapter extends JsonAdapter<AddConsigneeDTO> {
    public static final int $stable = 8;

    @NotNull
    private final JsonAdapter<AddConsigneeDTO.InputField> inputFieldAdapter;

    @NotNull
    private final JsonAdapter<AddConsigneeDTO.AdditionalFields> nullableAdditionalFieldsAdapter;

    @NotNull
    private final JsonAdapter<ButtonV3DTO> nullableButtonV3DTOAdapter;

    @NotNull
    private final JsonAdapter<List<CellDTO>> nullableListOfCellDTOAdapter;

    @NotNull
    private final n.a options;

    @NotNull
    private final JsonAdapter<TextDTO> textDTOAdapter;

    public AddConsigneeDTOJsonAdapter(@NotNull Moshi moshi) {
        Intrinsics.checkNotNullParameter(moshi, "moshi");
        this.options = n.a.C0918a.a("description", "kppField", "requisitesCells", "additionalFields", "button");
        M m11 = M.f71699a;
        this.textDTOAdapter = moshi.f(TextDTO.class, m11, "description");
        this.inputFieldAdapter = moshi.f(AddConsigneeDTO.InputField.class, m11, "kppField");
        this.nullableListOfCellDTOAdapter = moshi.f(D.e(List.class, CellDTO.class), m11, "requisitesCells");
        this.nullableAdditionalFieldsAdapter = moshi.f(AddConsigneeDTO.AdditionalFields.class, m11, "additionalFields");
        this.nullableButtonV3DTOAdapter = moshi.f(ButtonV3DTO.class, m11, "button");
    }

    @NotNull
    public String toString() {
        return b.c(37, "GeneratedJsonAdapter(AddConsigneeDTO)", "toString(...)");
    }

    @Override // com.squareup.moshi.JsonAdapter
    @NotNull
    public AddConsigneeDTO fromJson(@NotNull n reader) {
        Intrinsics.checkNotNullParameter(reader, "reader");
        reader.beginObject();
        TextDTO textDTO = null;
        AddConsigneeDTO.InputField inputField = null;
        List<CellDTO> list = null;
        AddConsigneeDTO.AdditionalFields additionalFields = null;
        ButtonV3DTO buttonV3DTO = null;
        while (reader.hasNext()) {
            int v11 = reader.v(this.options);
            if (v11 == -1) {
                reader.y();
                reader.skipValue();
            } else if (v11 == 0) {
                textDTO = this.textDTOAdapter.fromJson(reader);
                if (textDTO == null) {
                    throw c.q("description", "description", reader);
                }
            } else if (v11 == 1) {
                inputField = this.inputFieldAdapter.fromJson(reader);
                if (inputField == null) {
                    throw c.q("kppField", "kppField", reader);
                }
            } else if (v11 == 2) {
                list = this.nullableListOfCellDTOAdapter.fromJson(reader);
            } else if (v11 == 3) {
                additionalFields = this.nullableAdditionalFieldsAdapter.fromJson(reader);
            } else if (v11 == 4) {
                buttonV3DTO = this.nullableButtonV3DTOAdapter.fromJson(reader);
            }
        }
        reader.endObject();
        if (textDTO == null) {
            throw c.j("description", "description", reader);
        }
        if (inputField != null) {
            return new AddConsigneeDTO(textDTO, inputField, list, additionalFields, buttonV3DTO);
        }
        throw c.j("kppField", "kppField", reader);
    }

    @Override // com.squareup.moshi.JsonAdapter
    /* renamed from: toJson, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
    public void mo44toJson(@NotNull x writer, AddConsigneeDTO value) {
        Intrinsics.checkNotNullParameter(writer, "writer");
        if (value == null) {
            throw new NullPointerException("value was null! Wrap in .nullSafe() to write nullable values.");
        }
        writer.j();
        writer.w("description");
        this.textDTOAdapter.mo44toJson(writer, (x) value.getDescription());
        writer.w("kppField");
        this.inputFieldAdapter.mo44toJson(writer, (x) value.getKppField());
        writer.w("requisitesCells");
        this.nullableListOfCellDTOAdapter.mo44toJson(writer, (x) value.getRequisitesCells());
        writer.w("additionalFields");
        this.nullableAdditionalFieldsAdapter.mo44toJson(writer, (x) value.getAdditionalFields());
        writer.w("button");
        this.nullableButtonV3DTOAdapter.mo44toJson(writer, (x) value.getButton());
        writer.p();
    }
}
