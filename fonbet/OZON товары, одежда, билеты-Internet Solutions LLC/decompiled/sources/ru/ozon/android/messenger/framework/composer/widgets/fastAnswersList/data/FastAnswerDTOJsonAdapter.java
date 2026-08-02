package ru.ozon.android.messenger.framework.composer.widgets.fastAnswersList.data;

import Ak.b;
import Y9.c;
import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.Moshi;
import com.squareup.moshi.n;
import com.squareup.moshi.x;
import kotlin.Metadata;
import kotlin.collections.M;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.composerCommonViewKit.islandSeparator.data.IslandSeparatorDTO;
import ru.ozon.android.messenger.framework.composer.widgets.fastAnswersList.data.FastAnswerDTO;

@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\f\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\f\u0010\rJ!\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000f\u001a\u00020\u000e2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u001a\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00070\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u001c\u0010\u001a\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00190\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u0018R\u001c\u0010\u001c\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001b0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u0018¨\u0006\u001d"}, d2 = {"Lru/ozon/android/messenger/framework/composer/widgets/fastAnswersList/data/FastAnswerDTOJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lru/ozon/android/messenger/framework/composer/widgets/fastAnswersList/data/FastAnswerDTO;", "Lcom/squareup/moshi/Moshi;", "moshi", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "", "toString", "()Ljava/lang/String;", "Lcom/squareup/moshi/n;", "reader", "fromJson", "(Lcom/squareup/moshi/n;)Lru/ozon/android/messenger/framework/composer/widgets/fastAnswersList/data/FastAnswerDTO;", "Lcom/squareup/moshi/x;", "writer", "value_", "", "toJson", "(Lcom/squareup/moshi/x;Lru/ozon/android/messenger/framework/composer/widgets/fastAnswersList/data/FastAnswerDTO;)V", "Lcom/squareup/moshi/n$a;", "options", "Lcom/squareup/moshi/n$a;", "stringAdapter", "Lcom/squareup/moshi/JsonAdapter;", "Lru/ozon/android/messenger/framework/composer/widgets/fastAnswersList/data/FastAnswerDTO$FastAnswerTemplateCellDTO;", "nullableFastAnswerTemplateCellDTOAdapter", "Lru/ozon/android/composerCommonViewKit/islandSeparator/data/IslandSeparatorDTO;", "nullableIslandSeparatorDTOAdapter", "messenger_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class FastAnswerDTOJsonAdapter extends JsonAdapter<FastAnswerDTO> {
    public static final int $stable = 8;

    @NotNull
    private final JsonAdapter<FastAnswerDTO.FastAnswerTemplateCellDTO> nullableFastAnswerTemplateCellDTOAdapter;

    @NotNull
    private final JsonAdapter<IslandSeparatorDTO> nullableIslandSeparatorDTOAdapter;

    @NotNull
    private final n.a options;

    @NotNull
    private final JsonAdapter<String> stringAdapter;

    public FastAnswerDTOJsonAdapter(@NotNull Moshi moshi) {
        Intrinsics.checkNotNullParameter(moshi, "moshi");
        n.a a11 = n.a.C0918a.a("type", "cell", "islandSeparator");
        Intrinsics.checkNotNullExpressionValue(a11, "of(...)");
        this.options = a11;
        M m11 = M.f71699a;
        JsonAdapter<String> f7 = moshi.f(String.class, m11, "type");
        Intrinsics.checkNotNullExpressionValue(f7, "adapter(...)");
        this.stringAdapter = f7;
        JsonAdapter<FastAnswerDTO.FastAnswerTemplateCellDTO> f11 = moshi.f(FastAnswerDTO.FastAnswerTemplateCellDTO.class, m11, "cell");
        Intrinsics.checkNotNullExpressionValue(f11, "adapter(...)");
        this.nullableFastAnswerTemplateCellDTOAdapter = f11;
        JsonAdapter<IslandSeparatorDTO> f12 = moshi.f(IslandSeparatorDTO.class, m11, "islandSeparator");
        Intrinsics.checkNotNullExpressionValue(f12, "adapter(...)");
        this.nullableIslandSeparatorDTOAdapter = f12;
    }

    @NotNull
    public String toString() {
        return b.c(35, "GeneratedJsonAdapter(FastAnswerDTO)", "toString(...)");
    }

    @Override // com.squareup.moshi.JsonAdapter
    @NotNull
    public FastAnswerDTO fromJson(@NotNull n reader) {
        Intrinsics.checkNotNullParameter(reader, "reader");
        reader.beginObject();
        String str = null;
        FastAnswerDTO.FastAnswerTemplateCellDTO fastAnswerTemplateCellDTO = null;
        IslandSeparatorDTO islandSeparatorDTO = null;
        while (reader.hasNext()) {
            int v11 = reader.v(this.options);
            if (v11 == -1) {
                reader.y();
                reader.skipValue();
            } else if (v11 == 0) {
                str = this.stringAdapter.fromJson(reader);
                if (str == null) {
                    throw c.q("type", "type", reader);
                }
            } else if (v11 == 1) {
                fastAnswerTemplateCellDTO = this.nullableFastAnswerTemplateCellDTOAdapter.fromJson(reader);
            } else if (v11 == 2) {
                islandSeparatorDTO = this.nullableIslandSeparatorDTOAdapter.fromJson(reader);
            }
        }
        reader.endObject();
        if (str != null) {
            return new FastAnswerDTO(str, fastAnswerTemplateCellDTO, islandSeparatorDTO);
        }
        throw c.j("type", "type", reader);
    }

    @Override // com.squareup.moshi.JsonAdapter
    /* renamed from: toJson, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
    public void mo44toJson(@NotNull x writer, FastAnswerDTO value_) {
        Intrinsics.checkNotNullParameter(writer, "writer");
        if (value_ == null) {
            throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
        }
        writer.j();
        writer.w("type");
        this.stringAdapter.mo44toJson(writer, (x) value_.getType());
        writer.w("cell");
        this.nullableFastAnswerTemplateCellDTOAdapter.mo44toJson(writer, (x) value_.getCell());
        writer.w("islandSeparator");
        this.nullableIslandSeparatorDTOAdapter.mo44toJson(writer, (x) value_.getIslandSeparator());
        writer.p();
    }
}
