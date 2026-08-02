package ru.ozon.id.nativeauth.crossApp.dto;

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
import ru.ozon.id.nativeauth.crossApp.dto.ModalCrossAppResponseDTO;
import ru.ozon.uni.atoms.utils.OzonSpannableString;

@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\f\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\f\u0010\rJ!\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000f\u001a\u00020\u000e2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u001a\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00070\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u001c\u0010\u001a\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00190\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u0018R\u001a\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u001b0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u0018R\u001a\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u001d0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u0018¨\u0006\u001f"}, d2 = {"Lru/ozon/id/nativeauth/crossApp/dto/ModalCrossAppResponseDTO_ModalDTOJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lru/ozon/id/nativeauth/crossApp/dto/ModalCrossAppResponseDTO$ModalDTO;", "Lcom/squareup/moshi/Moshi;", "moshi", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "", "toString", "()Ljava/lang/String;", "Lcom/squareup/moshi/n;", "reader", "fromJson", "(Lcom/squareup/moshi/n;)Lru/ozon/id/nativeauth/crossApp/dto/ModalCrossAppResponseDTO$ModalDTO;", "Lcom/squareup/moshi/x;", "writer", "value_", "", "toJson", "(Lcom/squareup/moshi/x;Lru/ozon/id/nativeauth/crossApp/dto/ModalCrossAppResponseDTO$ModalDTO;)V", "Lcom/squareup/moshi/n$a;", "options", "Lcom/squareup/moshi/n$a;", "stringAdapter", "Lcom/squareup/moshi/JsonAdapter;", "Lru/ozon/id/nativeauth/crossApp/dto/ModalCrossAppResponseDTO$ModalDTO$AvatarDTO;", "nullableAvatarDTOAdapter", "Lru/ozon/uni/atoms/utils/OzonSpannableString;", "ozonSpannableStringAdapter", "Lru/ozon/id/nativeauth/crossApp/dto/ModalCrossAppResponseDTO$ModalDTO$CrossAppButtonDTO;", "crossAppButtonDTOAdapter", "ozon-id-sdk_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class ModalCrossAppResponseDTO_ModalDTOJsonAdapter extends JsonAdapter<ModalCrossAppResponseDTO.ModalDTO> {

    @NotNull
    private final JsonAdapter<ModalCrossAppResponseDTO.ModalDTO.CrossAppButtonDTO> crossAppButtonDTOAdapter;

    @NotNull
    private final JsonAdapter<ModalCrossAppResponseDTO.ModalDTO.AvatarDTO> nullableAvatarDTOAdapter;

    @NotNull
    private final n.a options;

    @NotNull
    private final JsonAdapter<OzonSpannableString> ozonSpannableStringAdapter;

    @NotNull
    private final JsonAdapter<String> stringAdapter;

    public ModalCrossAppResponseDTO_ModalDTOJsonAdapter(@NotNull Moshi moshi) {
        Intrinsics.checkNotNullParameter(moshi, "moshi");
        n.a a11 = n.a.C0918a.a("logo", "avatar", SelectionItemFormDTO.TITLE_FIELD_NAME, "subtitle", "crossAppButton", "entryButton");
        Intrinsics.checkNotNullExpressionValue(a11, "of(...)");
        this.options = a11;
        M m11 = M.f71699a;
        JsonAdapter<String> f7 = moshi.f(String.class, m11, "logo");
        Intrinsics.checkNotNullExpressionValue(f7, "adapter(...)");
        this.stringAdapter = f7;
        JsonAdapter<ModalCrossAppResponseDTO.ModalDTO.AvatarDTO> f11 = moshi.f(ModalCrossAppResponseDTO.ModalDTO.AvatarDTO.class, m11, "avatar");
        Intrinsics.checkNotNullExpressionValue(f11, "adapter(...)");
        this.nullableAvatarDTOAdapter = f11;
        JsonAdapter<OzonSpannableString> f12 = moshi.f(OzonSpannableString.class, m11, SelectionItemFormDTO.TITLE_FIELD_NAME);
        Intrinsics.checkNotNullExpressionValue(f12, "adapter(...)");
        this.ozonSpannableStringAdapter = f12;
        JsonAdapter<ModalCrossAppResponseDTO.ModalDTO.CrossAppButtonDTO> f13 = moshi.f(ModalCrossAppResponseDTO.ModalDTO.CrossAppButtonDTO.class, m11, "crossAppButton");
        Intrinsics.checkNotNullExpressionValue(f13, "adapter(...)");
        this.crossAppButtonDTOAdapter = f13;
    }

    @NotNull
    public String toString() {
        return b.c(55, "GeneratedJsonAdapter(ModalCrossAppResponseDTO.ModalDTO)", "toString(...)");
    }

    @Override // com.squareup.moshi.JsonAdapter
    @NotNull
    public ModalCrossAppResponseDTO.ModalDTO fromJson(@NotNull n reader) {
        Intrinsics.checkNotNullParameter(reader, "reader");
        reader.beginObject();
        String str = null;
        ModalCrossAppResponseDTO.ModalDTO.AvatarDTO avatarDTO = null;
        OzonSpannableString ozonSpannableString = null;
        OzonSpannableString ozonSpannableString2 = null;
        ModalCrossAppResponseDTO.ModalDTO.CrossAppButtonDTO crossAppButtonDTO = null;
        ModalCrossAppResponseDTO.ModalDTO.CrossAppButtonDTO crossAppButtonDTO2 = null;
        while (reader.hasNext()) {
            switch (reader.v(this.options)) {
                case -1:
                    reader.y();
                    reader.skipValue();
                    break;
                case 0:
                    str = this.stringAdapter.fromJson(reader);
                    if (str == null) {
                        throw c.q("logo", "logo", reader);
                    }
                    break;
                case 1:
                    avatarDTO = this.nullableAvatarDTOAdapter.fromJson(reader);
                    break;
                case 2:
                    ozonSpannableString = this.ozonSpannableStringAdapter.fromJson(reader);
                    if (ozonSpannableString == null) {
                        throw c.q(SelectionItemFormDTO.TITLE_FIELD_NAME, SelectionItemFormDTO.TITLE_FIELD_NAME, reader);
                    }
                    break;
                case 3:
                    ozonSpannableString2 = this.ozonSpannableStringAdapter.fromJson(reader);
                    if (ozonSpannableString2 == null) {
                        throw c.q("subtitle", "subtitle", reader);
                    }
                    break;
                case 4:
                    crossAppButtonDTO = this.crossAppButtonDTOAdapter.fromJson(reader);
                    if (crossAppButtonDTO == null) {
                        throw c.q("crossAppButton", "crossAppButton", reader);
                    }
                    break;
                case 5:
                    crossAppButtonDTO2 = this.crossAppButtonDTOAdapter.fromJson(reader);
                    if (crossAppButtonDTO2 == null) {
                        throw c.q("entryButton", "entryButton", reader);
                    }
                    break;
            }
        }
        reader.endObject();
        if (str == null) {
            throw c.j("logo", "logo", reader);
        }
        if (ozonSpannableString == null) {
            throw c.j(SelectionItemFormDTO.TITLE_FIELD_NAME, SelectionItemFormDTO.TITLE_FIELD_NAME, reader);
        }
        if (ozonSpannableString2 == null) {
            throw c.j("subtitle", "subtitle", reader);
        }
        if (crossAppButtonDTO == null) {
            throw c.j("crossAppButton", "crossAppButton", reader);
        }
        if (crossAppButtonDTO2 != null) {
            return new ModalCrossAppResponseDTO.ModalDTO(str, avatarDTO, ozonSpannableString, ozonSpannableString2, crossAppButtonDTO, crossAppButtonDTO2);
        }
        throw c.j("entryButton", "entryButton", reader);
    }

    @Override // com.squareup.moshi.JsonAdapter
    /* renamed from: toJson, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
    public void mo44toJson(@NotNull x writer, ModalCrossAppResponseDTO.ModalDTO value_) {
        Intrinsics.checkNotNullParameter(writer, "writer");
        if (value_ == null) {
            throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
        }
        writer.j();
        writer.w("logo");
        this.stringAdapter.mo44toJson(writer, (x) value_.getLogo());
        writer.w("avatar");
        this.nullableAvatarDTOAdapter.mo44toJson(writer, (x) value_.getAvatar());
        writer.w(SelectionItemFormDTO.TITLE_FIELD_NAME);
        this.ozonSpannableStringAdapter.mo44toJson(writer, (x) value_.getTitle());
        writer.w("subtitle");
        this.ozonSpannableStringAdapter.mo44toJson(writer, (x) value_.getSubtitle());
        writer.w("crossAppButton");
        this.crossAppButtonDTOAdapter.mo44toJson(writer, (x) value_.getCrossAppButton());
        writer.w("entryButton");
        this.crossAppButtonDTOAdapter.mo44toJson(writer, (x) value_.getEntryButton());
        writer.p();
    }
}
