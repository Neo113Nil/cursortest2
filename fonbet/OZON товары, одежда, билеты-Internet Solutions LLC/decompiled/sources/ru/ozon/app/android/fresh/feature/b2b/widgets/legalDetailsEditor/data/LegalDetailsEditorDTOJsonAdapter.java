package ru.ozon.app.android.fresh.feature.b2b.widgets.legalDetailsEditor.data;

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
import ru.ozon.app.android.fresh.feature.b2b.widgets.legalDetailsEditor.data.LegalDetailsEditorDTO;
import ru.ozon.uni.atoms.data.controls.button.ButtonDTO;
import ru.ozon.uni.atoms.data.text.TextDTO;

@Metadata(d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\f\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\f\u0010\rJ!\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000f\u001a\u00020\u000e2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u001a\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00170\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u001a\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u001a0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u0019R\u001a\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u001c0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u0019R\u001c\u0010\u001f\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001e0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010\u0019¨\u0006 "}, d2 = {"Lru/ozon/app/android/fresh/feature/b2b/widgets/legalDetailsEditor/data/LegalDetailsEditorDTOJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lru/ozon/app/android/fresh/feature/b2b/widgets/legalDetailsEditor/data/LegalDetailsEditorDTO;", "Lcom/squareup/moshi/Moshi;", "moshi", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "", "toString", "()Ljava/lang/String;", "Lcom/squareup/moshi/n;", "reader", "fromJson", "(Lcom/squareup/moshi/n;)Lru/ozon/app/android/fresh/feature/b2b/widgets/legalDetailsEditor/data/LegalDetailsEditorDTO;", "Lcom/squareup/moshi/x;", "writer", AppMeasurementSdk.ConditionalUserProperty.VALUE, "", "toJson", "(Lcom/squareup/moshi/x;Lru/ozon/app/android/fresh/feature/b2b/widgets/legalDetailsEditor/data/LegalDetailsEditorDTO;)V", "Lcom/squareup/moshi/n$a;", "options", "Lcom/squareup/moshi/n$a;", "Lru/ozon/app/android/fresh/feature/b2b/widgets/legalDetailsEditor/data/LegalDetailsEditorDTO$TextFieldDTO;", "textFieldDTOAdapter", "Lcom/squareup/moshi/JsonAdapter;", "Lru/ozon/app/android/fresh/feature/b2b/widgets/legalDetailsEditor/data/LegalDetailsEditorDTO$AttachFieldDTO;", "attachFieldDTOAdapter", "Lru/ozon/uni/atoms/data/controls/button/ButtonDTO;", "buttonDTOAdapter", "Lru/ozon/uni/atoms/data/text/TextDTO;", "nullableTextDTOAdapter", "b2b_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class LegalDetailsEditorDTOJsonAdapter extends JsonAdapter<LegalDetailsEditorDTO> {
    public static final int $stable = 8;

    @NotNull
    private final JsonAdapter<LegalDetailsEditorDTO.AttachFieldDTO> attachFieldDTOAdapter;

    @NotNull
    private final JsonAdapter<ButtonDTO> buttonDTOAdapter;

    @NotNull
    private final JsonAdapter<TextDTO> nullableTextDTOAdapter;

    @NotNull
    private final n.a options;

    @NotNull
    private final JsonAdapter<LegalDetailsEditorDTO.TextFieldDTO> textFieldDTOAdapter;

    public LegalDetailsEditorDTOJsonAdapter(@NotNull Moshi moshi) {
        Intrinsics.checkNotNullParameter(moshi, "moshi");
        this.options = n.a.C0918a.a("textField", "attachField", "submitButton", "policyField");
        M m11 = M.f71699a;
        this.textFieldDTOAdapter = moshi.f(LegalDetailsEditorDTO.TextFieldDTO.class, m11, "textField");
        this.attachFieldDTOAdapter = moshi.f(LegalDetailsEditorDTO.AttachFieldDTO.class, m11, "attachField");
        this.buttonDTOAdapter = moshi.f(ButtonDTO.class, m11, "submitButton");
        this.nullableTextDTOAdapter = moshi.f(TextDTO.class, m11, "policyField");
    }

    @NotNull
    public String toString() {
        return b.c(43, "GeneratedJsonAdapter(LegalDetailsEditorDTO)", "toString(...)");
    }

    @Override // com.squareup.moshi.JsonAdapter
    @NotNull
    public LegalDetailsEditorDTO fromJson(@NotNull n reader) {
        Intrinsics.checkNotNullParameter(reader, "reader");
        reader.beginObject();
        LegalDetailsEditorDTO.TextFieldDTO textFieldDTO = null;
        LegalDetailsEditorDTO.AttachFieldDTO attachFieldDTO = null;
        ButtonDTO buttonDTO = null;
        TextDTO textDTO = null;
        while (reader.hasNext()) {
            int v11 = reader.v(this.options);
            if (v11 == -1) {
                reader.y();
                reader.skipValue();
            } else if (v11 == 0) {
                textFieldDTO = this.textFieldDTOAdapter.fromJson(reader);
                if (textFieldDTO == null) {
                    throw c.q("textField", "textField", reader);
                }
            } else if (v11 == 1) {
                attachFieldDTO = this.attachFieldDTOAdapter.fromJson(reader);
                if (attachFieldDTO == null) {
                    throw c.q("attachField", "attachField", reader);
                }
            } else if (v11 == 2) {
                buttonDTO = this.buttonDTOAdapter.fromJson(reader);
                if (buttonDTO == null) {
                    throw c.q("submitButton", "submitButton", reader);
                }
            } else if (v11 == 3) {
                textDTO = this.nullableTextDTOAdapter.fromJson(reader);
            }
        }
        reader.endObject();
        if (textFieldDTO == null) {
            throw c.j("textField", "textField", reader);
        }
        if (attachFieldDTO == null) {
            throw c.j("attachField", "attachField", reader);
        }
        if (buttonDTO != null) {
            return new LegalDetailsEditorDTO(textFieldDTO, attachFieldDTO, buttonDTO, textDTO);
        }
        throw c.j("submitButton", "submitButton", reader);
    }

    @Override // com.squareup.moshi.JsonAdapter
    /* renamed from: toJson, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
    public void mo44toJson(@NotNull x writer, LegalDetailsEditorDTO value) {
        Intrinsics.checkNotNullParameter(writer, "writer");
        if (value == null) {
            throw new NullPointerException("value was null! Wrap in .nullSafe() to write nullable values.");
        }
        writer.j();
        writer.w("textField");
        this.textFieldDTOAdapter.mo44toJson(writer, (x) value.getTextField());
        writer.w("attachField");
        this.attachFieldDTOAdapter.mo44toJson(writer, (x) value.getAttachField());
        writer.w("submitButton");
        this.buttonDTOAdapter.mo44toJson(writer, (x) value.getSubmitButton());
        writer.w("policyField");
        this.nullableTextDTOAdapter.mo44toJson(writer, (x) value.getPolicyField());
        writer.p();
    }
}
