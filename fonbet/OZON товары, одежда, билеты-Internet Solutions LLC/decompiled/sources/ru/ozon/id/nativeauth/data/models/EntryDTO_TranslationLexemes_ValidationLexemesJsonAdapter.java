package ru.ozon.id.nativeauth.data.models;

import Y9.c;
import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.Moshi;
import com.squareup.moshi.n;
import com.squareup.moshi.x;
import kotlin.Metadata;
import kotlin.collections.M;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.id.nativeauth.data.models.EntryDTO;

@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\f\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\f\u0010\rJ!\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000f\u001a\u00020\u000e2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u001a\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00170\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019¨\u0006\u001a"}, d2 = {"Lru/ozon/id/nativeauth/data/models/EntryDTO_TranslationLexemes_ValidationLexemesJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lru/ozon/id/nativeauth/data/models/EntryDTO$TranslationLexemes$ValidationLexemes;", "Lcom/squareup/moshi/Moshi;", "moshi", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "", "toString", "()Ljava/lang/String;", "Lcom/squareup/moshi/n;", "reader", "fromJson", "(Lcom/squareup/moshi/n;)Lru/ozon/id/nativeauth/data/models/EntryDTO$TranslationLexemes$ValidationLexemes;", "Lcom/squareup/moshi/x;", "writer", "value_", "", "toJson", "(Lcom/squareup/moshi/x;Lru/ozon/id/nativeauth/data/models/EntryDTO$TranslationLexemes$ValidationLexemes;)V", "Lcom/squareup/moshi/n$a;", "options", "Lcom/squareup/moshi/n$a;", "Lru/ozon/id/nativeauth/data/models/EntryDTO$TranslationLexemes$ValidationLexemes$IsInvalid;", "isInvalidAdapter", "Lcom/squareup/moshi/JsonAdapter;", "ozon-id-sdk_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class EntryDTO_TranslationLexemes_ValidationLexemesJsonAdapter extends JsonAdapter<EntryDTO.TranslationLexemes.ValidationLexemes> {

    @NotNull
    private final JsonAdapter<EntryDTO.TranslationLexemes.ValidationLexemes.IsInvalid> isInvalidAdapter;

    @NotNull
    private final n.a options;

    public EntryDTO_TranslationLexemes_ValidationLexemesJsonAdapter(@NotNull Moshi moshi) {
        Intrinsics.checkNotNullParameter(moshi, "moshi");
        n.a a11 = n.a.C0918a.a("isInvalid");
        Intrinsics.checkNotNullExpressionValue(a11, "of(...)");
        this.options = a11;
        JsonAdapter<EntryDTO.TranslationLexemes.ValidationLexemes.IsInvalid> f7 = moshi.f(EntryDTO.TranslationLexemes.ValidationLexemes.IsInvalid.class, M.f71699a, "isInvalid");
        Intrinsics.checkNotNullExpressionValue(f7, "adapter(...)");
        this.isInvalidAdapter = f7;
    }

    @NotNull
    public String toString() {
        return Ak.b.c(67, "GeneratedJsonAdapter(EntryDTO.TranslationLexemes.ValidationLexemes)", "toString(...)");
    }

    @Override // com.squareup.moshi.JsonAdapter
    @NotNull
    public EntryDTO.TranslationLexemes.ValidationLexemes fromJson(@NotNull n reader) {
        Intrinsics.checkNotNullParameter(reader, "reader");
        reader.beginObject();
        EntryDTO.TranslationLexemes.ValidationLexemes.IsInvalid isInvalid = null;
        while (reader.hasNext()) {
            int v11 = reader.v(this.options);
            if (v11 == -1) {
                reader.y();
                reader.skipValue();
            } else if (v11 == 0 && (isInvalid = this.isInvalidAdapter.fromJson(reader)) == null) {
                throw c.q("isInvalid", "isInvalid", reader);
            }
        }
        reader.endObject();
        if (isInvalid != null) {
            return new EntryDTO.TranslationLexemes.ValidationLexemes(isInvalid);
        }
        throw c.j("isInvalid", "isInvalid", reader);
    }

    @Override // com.squareup.moshi.JsonAdapter
    /* renamed from: toJson, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
    public void mo44toJson(@NotNull x writer, EntryDTO.TranslationLexemes.ValidationLexemes value_) {
        Intrinsics.checkNotNullParameter(writer, "writer");
        if (value_ == null) {
            throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
        }
        writer.j();
        writer.w("isInvalid");
        this.isInvalidAdapter.mo44toJson(writer, (x) value_.isInvalid());
        writer.p();
    }
}
