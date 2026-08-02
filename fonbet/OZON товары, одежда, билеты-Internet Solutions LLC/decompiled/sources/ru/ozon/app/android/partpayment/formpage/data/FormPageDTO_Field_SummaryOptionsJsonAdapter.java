package ru.ozon.app.android.partpayment.formpage.data;

import Y9.b;
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
import ru.ozon.app.android.partpayment.formpage.data.FormPageDTO;

@Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\f\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\f\u0010\rJ!\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000f\u001a\u00020\u000e2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\"\u0010\u0019\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u0018\u0018\u00010\u00170\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u001c\u0010\u001b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001aR\"\u0010\u001d\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u001c\u0018\u00010\u00170\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001aR\u001c\u0010\u001f\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001e0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010\u001a¨\u0006 "}, d2 = {"Lru/ozon/app/android/partpayment/formpage/data/FormPageDTO_Field_SummaryOptionsJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lru/ozon/app/android/partpayment/formpage/data/FormPageDTO$Field$SummaryOptions;", "Lcom/squareup/moshi/Moshi;", "moshi", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "", "toString", "()Ljava/lang/String;", "Lcom/squareup/moshi/n;", "reader", "fromJson", "(Lcom/squareup/moshi/n;)Lru/ozon/app/android/partpayment/formpage/data/FormPageDTO$Field$SummaryOptions;", "Lcom/squareup/moshi/x;", "writer", AppMeasurementSdk.ConditionalUserProperty.VALUE, "", "toJson", "(Lcom/squareup/moshi/x;Lru/ozon/app/android/partpayment/formpage/data/FormPageDTO$Field$SummaryOptions;)V", "Lcom/squareup/moshi/n$a;", "options", "Lcom/squareup/moshi/n$a;", "", "Lru/ozon/app/android/partpayment/formpage/data/FormPageDTO$Field$SummaryOptions$Button;", "nullableListOfButtonAdapter", "Lcom/squareup/moshi/JsonAdapter;", "nullableStringAdapter", "Lru/ozon/app/android/partpayment/formpage/data/FormPageDTO$Field$SummaryOptions$SummaryFields;", "nullableListOfSummaryFieldsAdapter", "", "nullableBooleanAdapter", "homecredit_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class FormPageDTO_Field_SummaryOptionsJsonAdapter extends JsonAdapter<FormPageDTO.Field.SummaryOptions> {

    @NotNull
    private final JsonAdapter<Boolean> nullableBooleanAdapter;

    @NotNull
    private final JsonAdapter<List<FormPageDTO.Field.SummaryOptions.Button>> nullableListOfButtonAdapter;

    @NotNull
    private final JsonAdapter<List<FormPageDTO.Field.SummaryOptions.SummaryFields>> nullableListOfSummaryFieldsAdapter;

    @NotNull
    private final JsonAdapter<String> nullableStringAdapter;

    @NotNull
    private final n.a options;

    public FormPageDTO_Field_SummaryOptionsJsonAdapter(@NotNull Moshi moshi) {
        Intrinsics.checkNotNullParameter(moshi, "moshi");
        this.options = n.a.C0918a.a("buttons", "changeDeeplink", "fields", "description", "loader", "statusIcon");
        b e11 = D.e(List.class, FormPageDTO.Field.SummaryOptions.Button.class);
        M m11 = M.f71699a;
        this.nullableListOfButtonAdapter = moshi.f(e11, m11, "buttons");
        this.nullableStringAdapter = moshi.f(String.class, m11, "changeDeeplink");
        this.nullableListOfSummaryFieldsAdapter = moshi.f(D.e(List.class, FormPageDTO.Field.SummaryOptions.SummaryFields.class), m11, "fields");
        this.nullableBooleanAdapter = moshi.f(Boolean.class, m11, "loader");
    }

    @NotNull
    public String toString() {
        return Ak.b.c(54, "GeneratedJsonAdapter(FormPageDTO.Field.SummaryOptions)", "toString(...)");
    }

    @Override // com.squareup.moshi.JsonAdapter
    @NotNull
    public FormPageDTO.Field.SummaryOptions fromJson(@NotNull n reader) {
        Intrinsics.checkNotNullParameter(reader, "reader");
        reader.beginObject();
        List<FormPageDTO.Field.SummaryOptions.Button> list = null;
        String str = null;
        List<FormPageDTO.Field.SummaryOptions.SummaryFields> list2 = null;
        String str2 = null;
        Boolean bool = null;
        String str3 = null;
        while (reader.hasNext()) {
            switch (reader.v(this.options)) {
                case -1:
                    reader.y();
                    reader.skipValue();
                    break;
                case 0:
                    list = this.nullableListOfButtonAdapter.fromJson(reader);
                    break;
                case 1:
                    str = this.nullableStringAdapter.fromJson(reader);
                    break;
                case 2:
                    list2 = this.nullableListOfSummaryFieldsAdapter.fromJson(reader);
                    break;
                case 3:
                    str2 = this.nullableStringAdapter.fromJson(reader);
                    break;
                case 4:
                    bool = this.nullableBooleanAdapter.fromJson(reader);
                    break;
                case 5:
                    str3 = this.nullableStringAdapter.fromJson(reader);
                    break;
            }
        }
        reader.endObject();
        return new FormPageDTO.Field.SummaryOptions(list, str, list2, str2, bool, str3);
    }

    @Override // com.squareup.moshi.JsonAdapter
    /* renamed from: toJson, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
    public void mo44toJson(@NotNull x writer, FormPageDTO.Field.SummaryOptions value) {
        Intrinsics.checkNotNullParameter(writer, "writer");
        if (value == null) {
            throw new NullPointerException("value was null! Wrap in .nullSafe() to write nullable values.");
        }
        writer.j();
        writer.w("buttons");
        this.nullableListOfButtonAdapter.mo44toJson(writer, (x) value.getButtons());
        writer.w("changeDeeplink");
        this.nullableStringAdapter.mo44toJson(writer, (x) value.getChangeDeeplink());
        writer.w("fields");
        this.nullableListOfSummaryFieldsAdapter.mo44toJson(writer, (x) value.getFields());
        writer.w("description");
        this.nullableStringAdapter.mo44toJson(writer, (x) value.getDescription());
        writer.w("loader");
        this.nullableBooleanAdapter.mo44toJson(writer, (x) value.getLoader());
        writer.w("statusIcon");
        this.nullableStringAdapter.mo44toJson(writer, (x) value.getStatusIcon());
        writer.p();
    }
}
