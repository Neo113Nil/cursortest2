package ru.ozon.app.android.returns.ui.molecules.reason;

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
import ru.ozon.app.android.returns.ui.data.components.RmsTextAreaDto;
import ru.ozon.app.android.ugc.widgets.selectionItemForm.data.SelectionItemFormDTO;
import ru.ozon.uni.atoms.data.AtomActionDTO;

@Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\f\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\f\u0010\rJ!\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000f\u001a\u00020\u000e2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u001a\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00170\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u001a\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u001a0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u0019R\u001a\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u001c0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u0019R\u001c\u0010\u001e\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u0019¨\u0006\u001f"}, d2 = {"Lru/ozon/app/android/returns/ui/molecules/reason/InputDTOJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lru/ozon/app/android/returns/ui/molecules/reason/InputDTO;", "Lcom/squareup/moshi/Moshi;", "moshi", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "", "toString", "()Ljava/lang/String;", "Lcom/squareup/moshi/n;", "reader", "fromJson", "(Lcom/squareup/moshi/n;)Lru/ozon/app/android/returns/ui/molecules/reason/InputDTO;", "Lcom/squareup/moshi/x;", "writer", AppMeasurementSdk.ConditionalUserProperty.VALUE, "", "toJson", "(Lcom/squareup/moshi/x;Lru/ozon/app/android/returns/ui/molecules/reason/InputDTO;)V", "Lcom/squareup/moshi/n$a;", "options", "Lcom/squareup/moshi/n$a;", "Lru/ozon/app/android/returns/ui/data/components/RmsTextAreaDto;", "rmsTextAreaDtoAdapter", "Lcom/squareup/moshi/JsonAdapter;", "Lru/ozon/uni/atoms/data/AtomActionDTO;", "atomActionDTOAdapter", "", "booleanAdapter", "nullableStringAdapter", "returns_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class InputDTOJsonAdapter extends JsonAdapter<InputDTO> {

    @NotNull
    private final JsonAdapter<AtomActionDTO> atomActionDTOAdapter;

    @NotNull
    private final JsonAdapter<Boolean> booleanAdapter;

    @NotNull
    private final JsonAdapter<String> nullableStringAdapter;

    @NotNull
    private final n.a options;

    @NotNull
    private final JsonAdapter<RmsTextAreaDto> rmsTextAreaDtoAdapter;

    public InputDTOJsonAdapter(@NotNull Moshi moshi) {
        Intrinsics.checkNotNullParameter(moshi, "moshi");
        this.options = n.a.C0918a.a(SelectionItemFormDTO.TEXT_AREA_FIELD_NAME, "action", "showValidationBorder", "validationBorderColor");
        M m11 = M.f71699a;
        this.rmsTextAreaDtoAdapter = moshi.f(RmsTextAreaDto.class, m11, SelectionItemFormDTO.TEXT_AREA_FIELD_NAME);
        this.atomActionDTOAdapter = moshi.f(AtomActionDTO.class, m11, "action");
        this.booleanAdapter = moshi.f(Boolean.TYPE, m11, "showValidationBorder");
        this.nullableStringAdapter = moshi.f(String.class, m11, "validationBorderColor");
    }

    @NotNull
    public String toString() {
        return b.c(30, "GeneratedJsonAdapter(InputDTO)", "toString(...)");
    }

    @Override // com.squareup.moshi.JsonAdapter
    @NotNull
    public InputDTO fromJson(@NotNull n reader) {
        Intrinsics.checkNotNullParameter(reader, "reader");
        reader.beginObject();
        RmsTextAreaDto rmsTextAreaDto = null;
        AtomActionDTO atomActionDTO = null;
        Boolean bool = null;
        String str = null;
        while (reader.hasNext()) {
            int v11 = reader.v(this.options);
            if (v11 == -1) {
                reader.y();
                reader.skipValue();
            } else if (v11 == 0) {
                rmsTextAreaDto = this.rmsTextAreaDtoAdapter.fromJson(reader);
                if (rmsTextAreaDto == null) {
                    throw c.q(SelectionItemFormDTO.TEXT_AREA_FIELD_NAME, SelectionItemFormDTO.TEXT_AREA_FIELD_NAME, reader);
                }
            } else if (v11 == 1) {
                atomActionDTO = this.atomActionDTOAdapter.fromJson(reader);
                if (atomActionDTO == null) {
                    throw c.q("action", "action", reader);
                }
            } else if (v11 == 2) {
                bool = this.booleanAdapter.fromJson(reader);
                if (bool == null) {
                    throw c.q("showValidationBorder", "showValidationBorder", reader);
                }
            } else if (v11 == 3) {
                str = this.nullableStringAdapter.fromJson(reader);
            }
        }
        reader.endObject();
        if (rmsTextAreaDto == null) {
            throw c.j(SelectionItemFormDTO.TEXT_AREA_FIELD_NAME, SelectionItemFormDTO.TEXT_AREA_FIELD_NAME, reader);
        }
        if (atomActionDTO == null) {
            throw c.j("action", "action", reader);
        }
        if (bool != null) {
            return new InputDTO(rmsTextAreaDto, atomActionDTO, bool.booleanValue(), str);
        }
        throw c.j("showValidationBorder", "showValidationBorder", reader);
    }

    @Override // com.squareup.moshi.JsonAdapter
    /* renamed from: toJson, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
    public void mo44toJson(@NotNull x writer, InputDTO value) {
        Intrinsics.checkNotNullParameter(writer, "writer");
        if (value == null) {
            throw new NullPointerException("value was null! Wrap in .nullSafe() to write nullable values.");
        }
        writer.j();
        writer.w(SelectionItemFormDTO.TEXT_AREA_FIELD_NAME);
        this.rmsTextAreaDtoAdapter.mo44toJson(writer, (x) value.getTextArea());
        writer.w("action");
        this.atomActionDTOAdapter.mo44toJson(writer, (x) value.getAction());
        writer.w("showValidationBorder");
        this.booleanAdapter.mo44toJson(writer, (x) Boolean.valueOf(value.getShowValidationBorder()));
        writer.w("validationBorderColor");
        this.nullableStringAdapter.mo44toJson(writer, (x) value.getValidationBorderColor());
        writer.p();
    }
}
