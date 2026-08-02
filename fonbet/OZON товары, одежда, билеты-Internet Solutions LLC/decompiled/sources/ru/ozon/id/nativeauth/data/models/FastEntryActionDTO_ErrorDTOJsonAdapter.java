package ru.ozon.id.nativeauth.data.models;

import Y9.c;
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
import ru.ozon.id.nativeauth.data.models.FastEntryActionDTO;

@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\f\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\f\u0010\rJ!\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000f\u001a\u00020\u000e2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u001a\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00170\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\"\u0010\u001c\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u001b\u0018\u00010\u001a0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u0019R\u001c\u0010\u001d\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u0019¨\u0006\u001e"}, d2 = {"Lru/ozon/id/nativeauth/data/models/FastEntryActionDTO_ErrorDTOJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lru/ozon/id/nativeauth/data/models/FastEntryActionDTO$ErrorDTO;", "Lcom/squareup/moshi/Moshi;", "moshi", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "", "toString", "()Ljava/lang/String;", "Lcom/squareup/moshi/n;", "reader", "fromJson", "(Lcom/squareup/moshi/n;)Lru/ozon/id/nativeauth/data/models/FastEntryActionDTO$ErrorDTO;", "Lcom/squareup/moshi/x;", "writer", "value_", "", "toJson", "(Lcom/squareup/moshi/x;Lru/ozon/id/nativeauth/data/models/FastEntryActionDTO$ErrorDTO;)V", "Lcom/squareup/moshi/n$a;", "options", "Lcom/squareup/moshi/n$a;", "Lru/ozon/id/nativeauth/data/models/FastEntryActionDTO$ErrorDTO$b;", "errorTypeAdapter", "Lcom/squareup/moshi/JsonAdapter;", "", "Lru/ozon/id/nativeauth/data/models/FastEntryActionDTO$ErrorDTO$FieldDTO;", "nullableListOfFieldDTOAdapter", "nullableStringAdapter", "ozon-id-sdk_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class FastEntryActionDTO_ErrorDTOJsonAdapter extends JsonAdapter<FastEntryActionDTO.ErrorDTO> {

    @NotNull
    private final JsonAdapter<FastEntryActionDTO.ErrorDTO.b> errorTypeAdapter;

    @NotNull
    private final JsonAdapter<List<FastEntryActionDTO.ErrorDTO.FieldDTO>> nullableListOfFieldDTOAdapter;

    @NotNull
    private final JsonAdapter<String> nullableStringAdapter;

    @NotNull
    private final n.a options;

    public FastEntryActionDTO_ErrorDTOJsonAdapter(@NotNull Moshi moshi) {
        Intrinsics.checkNotNullParameter(moshi, "moshi");
        n.a a11 = n.a.C0918a.a("type", "fields", "message", "errorButtonAction");
        Intrinsics.checkNotNullExpressionValue(a11, "of(...)");
        this.options = a11;
        M m11 = M.f71699a;
        JsonAdapter<FastEntryActionDTO.ErrorDTO.b> f7 = moshi.f(FastEntryActionDTO.ErrorDTO.b.class, m11, "type");
        Intrinsics.checkNotNullExpressionValue(f7, "adapter(...)");
        this.errorTypeAdapter = f7;
        JsonAdapter<List<FastEntryActionDTO.ErrorDTO.FieldDTO>> f11 = moshi.f(D.e(List.class, FastEntryActionDTO.ErrorDTO.FieldDTO.class), m11, "fields");
        Intrinsics.checkNotNullExpressionValue(f11, "adapter(...)");
        this.nullableListOfFieldDTOAdapter = f11;
        JsonAdapter<String> f12 = moshi.f(String.class, m11, "message");
        Intrinsics.checkNotNullExpressionValue(f12, "adapter(...)");
        this.nullableStringAdapter = f12;
    }

    @NotNull
    public String toString() {
        return Ak.b.c(49, "GeneratedJsonAdapter(FastEntryActionDTO.ErrorDTO)", "toString(...)");
    }

    @Override // com.squareup.moshi.JsonAdapter
    @NotNull
    public FastEntryActionDTO.ErrorDTO fromJson(@NotNull n reader) {
        Intrinsics.checkNotNullParameter(reader, "reader");
        reader.beginObject();
        FastEntryActionDTO.ErrorDTO.b bVar = null;
        List<FastEntryActionDTO.ErrorDTO.FieldDTO> list = null;
        String str = null;
        String str2 = null;
        while (reader.hasNext()) {
            int v11 = reader.v(this.options);
            if (v11 == -1) {
                reader.y();
                reader.skipValue();
            } else if (v11 == 0) {
                bVar = this.errorTypeAdapter.fromJson(reader);
                if (bVar == null) {
                    throw c.q("type", "type", reader);
                }
            } else if (v11 == 1) {
                list = this.nullableListOfFieldDTOAdapter.fromJson(reader);
            } else if (v11 == 2) {
                str = this.nullableStringAdapter.fromJson(reader);
            } else if (v11 == 3) {
                str2 = this.nullableStringAdapter.fromJson(reader);
            }
        }
        reader.endObject();
        if (bVar != null) {
            return new FastEntryActionDTO.ErrorDTO(bVar, list, str, str2);
        }
        throw c.j("type", "type", reader);
    }

    @Override // com.squareup.moshi.JsonAdapter
    /* renamed from: toJson, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
    public void mo44toJson(@NotNull x writer, FastEntryActionDTO.ErrorDTO value_) {
        Intrinsics.checkNotNullParameter(writer, "writer");
        if (value_ == null) {
            throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
        }
        writer.j();
        writer.w("type");
        this.errorTypeAdapter.mo44toJson(writer, (x) value_.getType());
        writer.w("fields");
        this.nullableListOfFieldDTOAdapter.mo44toJson(writer, (x) value_.getFields());
        writer.w("message");
        this.nullableStringAdapter.mo44toJson(writer, (x) value_.getMessage());
        writer.w("errorButtonAction");
        this.nullableStringAdapter.mo44toJson(writer, (x) value_.getErrorButtonAction());
        writer.p();
    }
}
