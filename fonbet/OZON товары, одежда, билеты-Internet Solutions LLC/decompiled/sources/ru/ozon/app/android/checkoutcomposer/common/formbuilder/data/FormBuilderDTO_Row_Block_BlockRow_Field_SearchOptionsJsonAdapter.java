package ru.ozon.app.android.checkoutcomposer.common.formbuilder.data;

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
import ru.ozon.app.android.checkoutcomposer.common.formbuilder.data.FormBuilderDTO;
import ru.ozon.app.android.ugc.widgets.selectionItemForm.data.SelectionItemFormDTO;

@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\f\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\f\u0010\rJ!\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000f\u001a\u00020\u000e2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u001a\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00070\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u001c\u0010\u0019\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u0018R\u001a\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u001a0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u0018R\u001c\u0010\u001d\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001c0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u0018R\u001c\u0010\u001f\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001e0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010\u0018¨\u0006 "}, d2 = {"Lru/ozon/app/android/checkoutcomposer/common/formbuilder/data/FormBuilderDTO_Row_Block_BlockRow_Field_SearchOptionsJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lru/ozon/app/android/checkoutcomposer/common/formbuilder/data/FormBuilderDTO$Row$Block$BlockRow$Field$SearchOptions;", "Lcom/squareup/moshi/Moshi;", "moshi", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "", "toString", "()Ljava/lang/String;", "Lcom/squareup/moshi/n;", "reader", "fromJson", "(Lcom/squareup/moshi/n;)Lru/ozon/app/android/checkoutcomposer/common/formbuilder/data/FormBuilderDTO$Row$Block$BlockRow$Field$SearchOptions;", "Lcom/squareup/moshi/x;", "writer", AppMeasurementSdk.ConditionalUserProperty.VALUE, "", "toJson", "(Lcom/squareup/moshi/x;Lru/ozon/app/android/checkoutcomposer/common/formbuilder/data/FormBuilderDTO$Row$Block$BlockRow$Field$SearchOptions;)V", "Lcom/squareup/moshi/n$a;", "options", "Lcom/squareup/moshi/n$a;", "stringAdapter", "Lcom/squareup/moshi/JsonAdapter;", "nullableStringAdapter", "", "intAdapter", "Lru/ozon/app/android/checkoutcomposer/common/formbuilder/data/FormBuilderDTO$Row$Block$BlockRow$Field$SearchOptions$BoundingBox;", "nullableBoundingBoxAdapter", "Lru/ozon/app/android/checkoutcomposer/common/formbuilder/data/FormBuilderDTO$Row$Block$BlockRow$Field$SearchOptions$States;", "nullableStatesAdapter", "suggestions-search_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class FormBuilderDTO_Row_Block_BlockRow_Field_SearchOptionsJsonAdapter extends JsonAdapter<FormBuilderDTO.Row.Block.BlockRow.Field.SearchOptions> {

    @NotNull
    private final JsonAdapter<Integer> intAdapter;

    @NotNull
    private final JsonAdapter<FormBuilderDTO.Row.Block.BlockRow.Field.SearchOptions.BoundingBox> nullableBoundingBoxAdapter;

    @NotNull
    private final JsonAdapter<FormBuilderDTO.Row.Block.BlockRow.Field.SearchOptions.States> nullableStatesAdapter;

    @NotNull
    private final JsonAdapter<String> nullableStringAdapter;

    @NotNull
    private final n.a options;

    @NotNull
    private final JsonAdapter<String> stringAdapter;

    public FormBuilderDTO_Row_Block_BlockRow_Field_SearchOptionsJsonAdapter(@NotNull Moshi moshi) {
        Intrinsics.checkNotNullParameter(moshi, "moshi");
        this.options = n.a.C0918a.a("link", SelectionItemFormDTO.TITLE_FIELD_NAME, "threshold", "boundingBox", "states");
        M m11 = M.f71699a;
        this.stringAdapter = moshi.f(String.class, m11, "link");
        this.nullableStringAdapter = moshi.f(String.class, m11, SelectionItemFormDTO.TITLE_FIELD_NAME);
        this.intAdapter = moshi.f(Integer.TYPE, m11, "threshold");
        this.nullableBoundingBoxAdapter = moshi.f(FormBuilderDTO.Row.Block.BlockRow.Field.SearchOptions.BoundingBox.class, m11, "boundingBox");
        this.nullableStatesAdapter = moshi.f(FormBuilderDTO.Row.Block.BlockRow.Field.SearchOptions.States.class, m11, "states");
    }

    @NotNull
    public String toString() {
        return b.c(75, "GeneratedJsonAdapter(FormBuilderDTO.Row.Block.BlockRow.Field.SearchOptions)", "toString(...)");
    }

    @Override // com.squareup.moshi.JsonAdapter
    @NotNull
    public FormBuilderDTO.Row.Block.BlockRow.Field.SearchOptions fromJson(@NotNull n reader) {
        Intrinsics.checkNotNullParameter(reader, "reader");
        reader.beginObject();
        Integer num = null;
        String str = null;
        String str2 = null;
        FormBuilderDTO.Row.Block.BlockRow.Field.SearchOptions.BoundingBox boundingBox = null;
        FormBuilderDTO.Row.Block.BlockRow.Field.SearchOptions.States states = null;
        while (reader.hasNext()) {
            int v11 = reader.v(this.options);
            if (v11 == -1) {
                reader.y();
                reader.skipValue();
            } else if (v11 == 0) {
                str = this.stringAdapter.fromJson(reader);
                if (str == null) {
                    throw c.q("link", "link", reader);
                }
            } else if (v11 == 1) {
                str2 = this.nullableStringAdapter.fromJson(reader);
            } else if (v11 == 2) {
                num = this.intAdapter.fromJson(reader);
                if (num == null) {
                    throw c.q("threshold", "threshold", reader);
                }
            } else if (v11 == 3) {
                boundingBox = this.nullableBoundingBoxAdapter.fromJson(reader);
            } else if (v11 == 4) {
                states = this.nullableStatesAdapter.fromJson(reader);
            }
        }
        reader.endObject();
        if (str == null) {
            throw c.j("link", "link", reader);
        }
        if (num != null) {
            return new FormBuilderDTO.Row.Block.BlockRow.Field.SearchOptions(str, str2, num.intValue(), boundingBox, states);
        }
        throw c.j("threshold", "threshold", reader);
    }

    @Override // com.squareup.moshi.JsonAdapter
    /* renamed from: toJson, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
    public void mo44toJson(@NotNull x writer, FormBuilderDTO.Row.Block.BlockRow.Field.SearchOptions value) {
        Intrinsics.checkNotNullParameter(writer, "writer");
        if (value == null) {
            throw new NullPointerException("value was null! Wrap in .nullSafe() to write nullable values.");
        }
        writer.j();
        writer.w("link");
        this.stringAdapter.mo44toJson(writer, (x) value.getLink());
        writer.w(SelectionItemFormDTO.TITLE_FIELD_NAME);
        this.nullableStringAdapter.mo44toJson(writer, (x) value.getTitle());
        writer.w("threshold");
        this.intAdapter.mo44toJson(writer, (x) Integer.valueOf(value.getThreshold()));
        writer.w("boundingBox");
        this.nullableBoundingBoxAdapter.mo44toJson(writer, (x) value.getBoundingBox());
        writer.w("states");
        this.nullableStatesAdapter.mo44toJson(writer, (x) value.getStates());
        writer.p();
    }
}
