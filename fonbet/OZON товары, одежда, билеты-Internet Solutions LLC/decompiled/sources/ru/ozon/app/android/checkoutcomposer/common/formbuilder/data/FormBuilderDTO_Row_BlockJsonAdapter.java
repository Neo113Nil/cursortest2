package ru.ozon.app.android.checkoutcomposer.common.formbuilder.data;

import Y9.b;
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
import ru.ozon.app.android.checkoutcomposer.common.formbuilder.data.FormBuilderDTO;
import ru.ozon.uni.atoms.data.AtomDTO;

@Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\f\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\f\u0010\rJ!\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000f\u001a\u00020\u000e2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\"\u0010\u0019\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u0018\u0018\u00010\u00170\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u001c\u0010\u001c\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001b0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001aR \u0010\u001e\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001d0\u00170\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001a¨\u0006\u001f"}, d2 = {"Lru/ozon/app/android/checkoutcomposer/common/formbuilder/data/FormBuilderDTO_Row_BlockJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lru/ozon/app/android/checkoutcomposer/common/formbuilder/data/FormBuilderDTO$Row$Block;", "Lcom/squareup/moshi/Moshi;", "moshi", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "", "toString", "()Ljava/lang/String;", "Lcom/squareup/moshi/n;", "reader", "fromJson", "(Lcom/squareup/moshi/n;)Lru/ozon/app/android/checkoutcomposer/common/formbuilder/data/FormBuilderDTO$Row$Block;", "Lcom/squareup/moshi/x;", "writer", AppMeasurementSdk.ConditionalUserProperty.VALUE, "", "toJson", "(Lcom/squareup/moshi/x;Lru/ozon/app/android/checkoutcomposer/common/formbuilder/data/FormBuilderDTO$Row$Block;)V", "Lcom/squareup/moshi/n$a;", "options", "Lcom/squareup/moshi/n$a;", "", "Lru/ozon/uni/atoms/data/AtomDTO;", "nullableListOfAtomDTOAdapter", "Lcom/squareup/moshi/JsonAdapter;", "", "nullableIntAdapter", "Lru/ozon/app/android/checkoutcomposer/common/formbuilder/data/FormBuilderDTO$Row$Block$BlockRow;", "listOfBlockRowAdapter", "suggestions-search_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class FormBuilderDTO_Row_BlockJsonAdapter extends JsonAdapter<FormBuilderDTO.Row.Block> {

    @NotNull
    private final JsonAdapter<List<FormBuilderDTO.Row.Block.BlockRow>> listOfBlockRowAdapter;

    @NotNull
    private final JsonAdapter<Integer> nullableIntAdapter;

    @NotNull
    private final JsonAdapter<List<AtomDTO>> nullableListOfAtomDTOAdapter;

    @NotNull
    private final n.a options;

    public FormBuilderDTO_Row_BlockJsonAdapter(@NotNull Moshi moshi) {
        Intrinsics.checkNotNullParameter(moshi, "moshi");
        this.options = n.a.C0918a.a("elements", "blockSize", "rows");
        b e11 = D.e(List.class, AtomDTO.class);
        M m11 = M.f71699a;
        this.nullableListOfAtomDTOAdapter = moshi.f(e11, m11, "elements");
        this.nullableIntAdapter = moshi.f(Integer.class, m11, "blockSize");
        this.listOfBlockRowAdapter = moshi.f(D.e(List.class, FormBuilderDTO.Row.Block.BlockRow.class), m11, "rows");
    }

    @NotNull
    public String toString() {
        return Ak.b.c(46, "GeneratedJsonAdapter(FormBuilderDTO.Row.Block)", "toString(...)");
    }

    @Override // com.squareup.moshi.JsonAdapter
    @NotNull
    public FormBuilderDTO.Row.Block fromJson(@NotNull n reader) {
        Intrinsics.checkNotNullParameter(reader, "reader");
        reader.beginObject();
        List<AtomDTO> list = null;
        Integer num = null;
        List<FormBuilderDTO.Row.Block.BlockRow> list2 = null;
        while (reader.hasNext()) {
            int v11 = reader.v(this.options);
            if (v11 == -1) {
                reader.y();
                reader.skipValue();
            } else if (v11 == 0) {
                list = this.nullableListOfAtomDTOAdapter.fromJson(reader);
            } else if (v11 == 1) {
                num = this.nullableIntAdapter.fromJson(reader);
            } else if (v11 == 2 && (list2 = this.listOfBlockRowAdapter.fromJson(reader)) == null) {
                throw c.q("rows", "rows", reader);
            }
        }
        reader.endObject();
        if (list2 != null) {
            return new FormBuilderDTO.Row.Block(list, num, list2);
        }
        throw c.j("rows", "rows", reader);
    }

    @Override // com.squareup.moshi.JsonAdapter
    /* renamed from: toJson, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
    public void mo44toJson(@NotNull x writer, FormBuilderDTO.Row.Block value) {
        Intrinsics.checkNotNullParameter(writer, "writer");
        if (value == null) {
            throw new NullPointerException("value was null! Wrap in .nullSafe() to write nullable values.");
        }
        writer.j();
        writer.w("elements");
        this.nullableListOfAtomDTOAdapter.mo44toJson(writer, (x) value.getElements());
        writer.w("blockSize");
        this.nullableIntAdapter.mo44toJson(writer, (x) value.getBlockSize());
        writer.w("rows");
        this.listOfBlockRowAdapter.mo44toJson(writer, (x) value.getRows());
        writer.p();
    }
}
