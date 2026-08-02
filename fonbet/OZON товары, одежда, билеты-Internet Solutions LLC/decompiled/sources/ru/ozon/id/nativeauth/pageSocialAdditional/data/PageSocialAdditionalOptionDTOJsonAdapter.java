package ru.ozon.id.nativeauth.pageSocialAdditional.data;

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
import ru.ozon.app.android.ugc.widgets.selectionItemForm.data.SelectionItemFormDTO;
import ru.ozon.id.nativeauth.data.models.EntryDTO;
import ru.ozon.uni.atoms.utils.OzonSpannableString;

@Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\f\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\f\u0010\rJ!\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000f\u001a\u00020\u000e2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u001a\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00170\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u001c\u0010\u001a\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00170\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u0019R\u001c\u0010\u001c\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001b0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u0019R\u001c\u0010\u001e\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001d0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u0019¨\u0006\u001f"}, d2 = {"Lru/ozon/id/nativeauth/pageSocialAdditional/data/PageSocialAdditionalOptionDTOJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lru/ozon/id/nativeauth/pageSocialAdditional/data/PageSocialAdditionalOptionDTO;", "Lcom/squareup/moshi/Moshi;", "moshi", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "", "toString", "()Ljava/lang/String;", "Lcom/squareup/moshi/n;", "reader", "fromJson", "(Lcom/squareup/moshi/n;)Lru/ozon/id/nativeauth/pageSocialAdditional/data/PageSocialAdditionalOptionDTO;", "Lcom/squareup/moshi/x;", "writer", "value_", "", "toJson", "(Lcom/squareup/moshi/x;Lru/ozon/id/nativeauth/pageSocialAdditional/data/PageSocialAdditionalOptionDTO;)V", "Lcom/squareup/moshi/n$a;", "options", "Lcom/squareup/moshi/n$a;", "Lru/ozon/uni/atoms/utils/OzonSpannableString;", "ozonSpannableStringAdapter", "Lcom/squareup/moshi/JsonAdapter;", "nullableOzonSpannableStringAdapter", "Lru/ozon/id/nativeauth/data/models/EntryDTO$SocialButtonDTO;", "nullableSocialButtonDTOAdapter", "Lru/ozon/id/nativeauth/data/models/EntryDTO$EntryButtonDTO;", "nullableEntryButtonDTOAdapter", "ozon-id-sdk_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class PageSocialAdditionalOptionDTOJsonAdapter extends JsonAdapter<PageSocialAdditionalOptionDTO> {

    @NotNull
    private final JsonAdapter<EntryDTO.EntryButtonDTO> nullableEntryButtonDTOAdapter;

    @NotNull
    private final JsonAdapter<OzonSpannableString> nullableOzonSpannableStringAdapter;

    @NotNull
    private final JsonAdapter<EntryDTO.SocialButtonDTO> nullableSocialButtonDTOAdapter;

    @NotNull
    private final n.a options;

    @NotNull
    private final JsonAdapter<OzonSpannableString> ozonSpannableStringAdapter;

    public PageSocialAdditionalOptionDTOJsonAdapter(@NotNull Moshi moshi) {
        Intrinsics.checkNotNullParameter(moshi, "moshi");
        n.a a11 = n.a.C0918a.a(SelectionItemFormDTO.TITLE_FIELD_NAME, "subtitle", "socialLoginButton", "submitButton", "cancelButton");
        Intrinsics.checkNotNullExpressionValue(a11, "of(...)");
        this.options = a11;
        M m11 = M.f71699a;
        JsonAdapter<OzonSpannableString> f7 = moshi.f(OzonSpannableString.class, m11, SelectionItemFormDTO.TITLE_FIELD_NAME);
        Intrinsics.checkNotNullExpressionValue(f7, "adapter(...)");
        this.ozonSpannableStringAdapter = f7;
        JsonAdapter<OzonSpannableString> f11 = moshi.f(OzonSpannableString.class, m11, "subtitle");
        Intrinsics.checkNotNullExpressionValue(f11, "adapter(...)");
        this.nullableOzonSpannableStringAdapter = f11;
        JsonAdapter<EntryDTO.SocialButtonDTO> f12 = moshi.f(EntryDTO.SocialButtonDTO.class, m11, "socialLoginButton");
        Intrinsics.checkNotNullExpressionValue(f12, "adapter(...)");
        this.nullableSocialButtonDTOAdapter = f12;
        JsonAdapter<EntryDTO.EntryButtonDTO> f13 = moshi.f(EntryDTO.EntryButtonDTO.class, m11, "submitButton");
        Intrinsics.checkNotNullExpressionValue(f13, "adapter(...)");
        this.nullableEntryButtonDTOAdapter = f13;
    }

    @NotNull
    public String toString() {
        return b.c(51, "GeneratedJsonAdapter(PageSocialAdditionalOptionDTO)", "toString(...)");
    }

    @Override // com.squareup.moshi.JsonAdapter
    @NotNull
    public PageSocialAdditionalOptionDTO fromJson(@NotNull n reader) {
        Intrinsics.checkNotNullParameter(reader, "reader");
        reader.beginObject();
        OzonSpannableString ozonSpannableString = null;
        OzonSpannableString ozonSpannableString2 = null;
        EntryDTO.SocialButtonDTO socialButtonDTO = null;
        EntryDTO.EntryButtonDTO entryButtonDTO = null;
        EntryDTO.EntryButtonDTO entryButtonDTO2 = null;
        while (reader.hasNext()) {
            int v11 = reader.v(this.options);
            if (v11 == -1) {
                reader.y();
                reader.skipValue();
            } else if (v11 == 0) {
                ozonSpannableString = this.ozonSpannableStringAdapter.fromJson(reader);
                if (ozonSpannableString == null) {
                    throw c.q(SelectionItemFormDTO.TITLE_FIELD_NAME, SelectionItemFormDTO.TITLE_FIELD_NAME, reader);
                }
            } else if (v11 == 1) {
                ozonSpannableString2 = this.nullableOzonSpannableStringAdapter.fromJson(reader);
            } else if (v11 == 2) {
                socialButtonDTO = this.nullableSocialButtonDTOAdapter.fromJson(reader);
            } else if (v11 == 3) {
                entryButtonDTO = this.nullableEntryButtonDTOAdapter.fromJson(reader);
            } else if (v11 == 4) {
                entryButtonDTO2 = this.nullableEntryButtonDTOAdapter.fromJson(reader);
            }
        }
        reader.endObject();
        if (ozonSpannableString != null) {
            return new PageSocialAdditionalOptionDTO(ozonSpannableString, ozonSpannableString2, socialButtonDTO, entryButtonDTO, entryButtonDTO2);
        }
        throw c.j(SelectionItemFormDTO.TITLE_FIELD_NAME, SelectionItemFormDTO.TITLE_FIELD_NAME, reader);
    }

    @Override // com.squareup.moshi.JsonAdapter
    /* renamed from: toJson, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
    public void mo44toJson(@NotNull x writer, PageSocialAdditionalOptionDTO value_) {
        Intrinsics.checkNotNullParameter(writer, "writer");
        if (value_ == null) {
            throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
        }
        writer.j();
        writer.w(SelectionItemFormDTO.TITLE_FIELD_NAME);
        this.ozonSpannableStringAdapter.mo44toJson(writer, (x) value_.getTitle());
        writer.w("subtitle");
        this.nullableOzonSpannableStringAdapter.mo44toJson(writer, (x) value_.getSubtitle());
        writer.w("socialLoginButton");
        this.nullableSocialButtonDTOAdapter.mo44toJson(writer, (x) value_.getSocialLoginButton());
        writer.w("submitButton");
        this.nullableEntryButtonDTOAdapter.mo44toJson(writer, (x) value_.getSubmitButton());
        writer.w("cancelButton");
        this.nullableEntryButtonDTOAdapter.mo44toJson(writer, (x) value_.getCancelButton());
        writer.p();
    }
}
