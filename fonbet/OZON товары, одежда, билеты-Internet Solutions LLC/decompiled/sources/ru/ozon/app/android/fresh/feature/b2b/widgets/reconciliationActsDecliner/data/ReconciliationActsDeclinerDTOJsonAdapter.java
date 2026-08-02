package ru.ozon.app.android.fresh.feature.b2b.widgets.reconciliationActsDecliner.data;

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
import ru.ozon.app.android.fresh.feature.b2b.widgets.reconciliationActsDecliner.data.ReconciliationActsDeclinerDTO;
import ru.ozon.uni.atoms.data.controls.button.ButtonV3DTO;
import ru.ozon.uni.atoms.data.text.TextDTO;

@Metadata(d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\f\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\f\u0010\rJ!\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000f\u001a\u00020\u000e2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u001a\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00170\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R \u0010\u001c\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001b0\u001a0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u0019R\u001a\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u001d0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u0019R\u001a\u0010 \u001a\b\u0012\u0004\u0012\u00020\u001f0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010\u0019¨\u0006!"}, d2 = {"Lru/ozon/app/android/fresh/feature/b2b/widgets/reconciliationActsDecliner/data/ReconciliationActsDeclinerDTOJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lru/ozon/app/android/fresh/feature/b2b/widgets/reconciliationActsDecliner/data/ReconciliationActsDeclinerDTO;", "Lcom/squareup/moshi/Moshi;", "moshi", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "", "toString", "()Ljava/lang/String;", "Lcom/squareup/moshi/n;", "reader", "fromJson", "(Lcom/squareup/moshi/n;)Lru/ozon/app/android/fresh/feature/b2b/widgets/reconciliationActsDecliner/data/ReconciliationActsDeclinerDTO;", "Lcom/squareup/moshi/x;", "writer", AppMeasurementSdk.ConditionalUserProperty.VALUE, "", "toJson", "(Lcom/squareup/moshi/x;Lru/ozon/app/android/fresh/feature/b2b/widgets/reconciliationActsDecliner/data/ReconciliationActsDeclinerDTO;)V", "Lcom/squareup/moshi/n$a;", "options", "Lcom/squareup/moshi/n$a;", "Lru/ozon/app/android/fresh/feature/b2b/widgets/reconciliationActsDecliner/data/ReconciliationActsDeclinerDTO$AttachField;", "attachFieldAdapter", "Lcom/squareup/moshi/JsonAdapter;", "", "Lru/ozon/app/android/fresh/feature/b2b/widgets/reconciliationActsDecliner/data/ReconciliationActsDeclinerDTO$TextField;", "listOfTextFieldAdapter", "Lru/ozon/uni/atoms/data/controls/button/ButtonV3DTO;", "buttonV3DTOAdapter", "Lru/ozon/uni/atoms/data/text/TextDTO;", "textDTOAdapter", "b2b_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class ReconciliationActsDeclinerDTOJsonAdapter extends JsonAdapter<ReconciliationActsDeclinerDTO> {
    public static final int $stable = 8;

    @NotNull
    private final JsonAdapter<ReconciliationActsDeclinerDTO.AttachField> attachFieldAdapter;

    @NotNull
    private final JsonAdapter<ButtonV3DTO> buttonV3DTOAdapter;

    @NotNull
    private final JsonAdapter<List<ReconciliationActsDeclinerDTO.TextField>> listOfTextFieldAdapter;

    @NotNull
    private final n.a options;

    @NotNull
    private final JsonAdapter<TextDTO> textDTOAdapter;

    public ReconciliationActsDeclinerDTOJsonAdapter(@NotNull Moshi moshi) {
        Intrinsics.checkNotNullParameter(moshi, "moshi");
        this.options = n.a.C0918a.a("attachField", "textFields", "submitButton", "policyField");
        M m11 = M.f71699a;
        this.attachFieldAdapter = moshi.f(ReconciliationActsDeclinerDTO.AttachField.class, m11, "attachField");
        this.listOfTextFieldAdapter = moshi.f(D.e(List.class, ReconciliationActsDeclinerDTO.TextField.class), m11, "textFields");
        this.buttonV3DTOAdapter = moshi.f(ButtonV3DTO.class, m11, "submitButton");
        this.textDTOAdapter = moshi.f(TextDTO.class, m11, "policyField");
    }

    @NotNull
    public String toString() {
        return b.c(51, "GeneratedJsonAdapter(ReconciliationActsDeclinerDTO)", "toString(...)");
    }

    @Override // com.squareup.moshi.JsonAdapter
    @NotNull
    public ReconciliationActsDeclinerDTO fromJson(@NotNull n reader) {
        Intrinsics.checkNotNullParameter(reader, "reader");
        reader.beginObject();
        ReconciliationActsDeclinerDTO.AttachField attachField = null;
        List<ReconciliationActsDeclinerDTO.TextField> list = null;
        ButtonV3DTO buttonV3DTO = null;
        TextDTO textDTO = null;
        while (reader.hasNext()) {
            int v11 = reader.v(this.options);
            if (v11 == -1) {
                reader.y();
                reader.skipValue();
            } else if (v11 == 0) {
                attachField = this.attachFieldAdapter.fromJson(reader);
                if (attachField == null) {
                    throw c.q("attachField", "attachField", reader);
                }
            } else if (v11 == 1) {
                list = this.listOfTextFieldAdapter.fromJson(reader);
                if (list == null) {
                    throw c.q("textFields", "textFields", reader);
                }
            } else if (v11 == 2) {
                buttonV3DTO = this.buttonV3DTOAdapter.fromJson(reader);
                if (buttonV3DTO == null) {
                    throw c.q("submitButton", "submitButton", reader);
                }
            } else if (v11 == 3 && (textDTO = this.textDTOAdapter.fromJson(reader)) == null) {
                throw c.q("policyField", "policyField", reader);
            }
        }
        reader.endObject();
        if (attachField == null) {
            throw c.j("attachField", "attachField", reader);
        }
        if (list == null) {
            throw c.j("textFields", "textFields", reader);
        }
        if (buttonV3DTO == null) {
            throw c.j("submitButton", "submitButton", reader);
        }
        if (textDTO != null) {
            return new ReconciliationActsDeclinerDTO(attachField, list, buttonV3DTO, textDTO);
        }
        throw c.j("policyField", "policyField", reader);
    }

    @Override // com.squareup.moshi.JsonAdapter
    /* renamed from: toJson, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
    public void mo44toJson(@NotNull x writer, ReconciliationActsDeclinerDTO value) {
        Intrinsics.checkNotNullParameter(writer, "writer");
        if (value == null) {
            throw new NullPointerException("value was null! Wrap in .nullSafe() to write nullable values.");
        }
        writer.j();
        writer.w("attachField");
        this.attachFieldAdapter.mo44toJson(writer, (x) value.getAttachField());
        writer.w("textFields");
        this.listOfTextFieldAdapter.mo44toJson(writer, (x) value.getTextFields());
        writer.w("submitButton");
        this.buttonV3DTOAdapter.mo44toJson(writer, (x) value.getSubmitButton());
        writer.w("policyField");
        this.textDTOAdapter.mo44toJson(writer, (x) value.getPolicyField());
        writer.p();
    }
}
