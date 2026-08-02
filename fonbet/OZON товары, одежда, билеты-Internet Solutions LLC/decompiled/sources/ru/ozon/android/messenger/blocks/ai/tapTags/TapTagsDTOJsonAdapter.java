package ru.ozon.android.messenger.blocks.ai.tapTags;

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
import ru.ozon.android.messenger.blocks.ai.tapTags.TapTagsDTO;
import ru.ozon.app.android.ugc.widgets.selectionItemForm.data.SelectionItemFormDTO;
import ru.ozon.uni.atoms.data.controls.button.ButtonV3DTO;
import ru.ozon.uni.atoms.data.text.TextDTO;

@Metadata(d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\f\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\f\u0010\rJ!\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000f\u001a\u00020\u000e2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u001c\u0010\u0018\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00170\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R \u0010\u001c\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001b0\u001a0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u0019R\u001c\u0010\u001e\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001d0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u0019R\u001c\u0010 \u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001f0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010\u0019¨\u0006!"}, d2 = {"Lru/ozon/android/messenger/blocks/ai/tapTags/TapTagsDTOJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lru/ozon/android/messenger/blocks/ai/tapTags/TapTagsDTO;", "Lcom/squareup/moshi/Moshi;", "moshi", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "", "toString", "()Ljava/lang/String;", "Lcom/squareup/moshi/n;", "reader", "fromJson", "(Lcom/squareup/moshi/n;)Lru/ozon/android/messenger/blocks/ai/tapTags/TapTagsDTO;", "Lcom/squareup/moshi/x;", "writer", "value_", "", "toJson", "(Lcom/squareup/moshi/x;Lru/ozon/android/messenger/blocks/ai/tapTags/TapTagsDTO;)V", "Lcom/squareup/moshi/n$a;", "options", "Lcom/squareup/moshi/n$a;", "Lru/ozon/uni/atoms/data/text/TextDTO;", "nullableTextDTOAdapter", "Lcom/squareup/moshi/JsonAdapter;", "", "Lru/ozon/android/messenger/blocks/ai/tapTags/TapTagsDTO$TagItemDTO;", "listOfTagItemDTOAdapter", "Lru/ozon/uni/atoms/data/controls/button/ButtonV3DTO;", "nullableButtonV3DTOAdapter", "Lru/ozon/android/messenger/blocks/ai/tapTags/TapTagsDTO$PresentationSettingsDTO;", "nullablePresentationSettingsDTOAdapter", "messenger_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class TapTagsDTOJsonAdapter extends JsonAdapter<TapTagsDTO> {
    public static final int $stable = 8;

    @NotNull
    private final JsonAdapter<List<TapTagsDTO.TagItemDTO>> listOfTagItemDTOAdapter;

    @NotNull
    private final JsonAdapter<ButtonV3DTO> nullableButtonV3DTOAdapter;

    @NotNull
    private final JsonAdapter<TapTagsDTO.PresentationSettingsDTO> nullablePresentationSettingsDTOAdapter;

    @NotNull
    private final JsonAdapter<TextDTO> nullableTextDTOAdapter;

    @NotNull
    private final n.a options;

    public TapTagsDTOJsonAdapter(@NotNull Moshi moshi) {
        Intrinsics.checkNotNullParameter(moshi, "moshi");
        n.a a11 = n.a.C0918a.a(SelectionItemFormDTO.TITLE_FIELD_NAME, "tagsItems", "titleRightButton", "presentationSettings");
        Intrinsics.checkNotNullExpressionValue(a11, "of(...)");
        this.options = a11;
        M m11 = M.f71699a;
        JsonAdapter<TextDTO> f7 = moshi.f(TextDTO.class, m11, SelectionItemFormDTO.TITLE_FIELD_NAME);
        Intrinsics.checkNotNullExpressionValue(f7, "adapter(...)");
        this.nullableTextDTOAdapter = f7;
        JsonAdapter<List<TapTagsDTO.TagItemDTO>> f11 = moshi.f(D.e(List.class, TapTagsDTO.TagItemDTO.class), m11, "tagsItems");
        Intrinsics.checkNotNullExpressionValue(f11, "adapter(...)");
        this.listOfTagItemDTOAdapter = f11;
        JsonAdapter<ButtonV3DTO> f12 = moshi.f(ButtonV3DTO.class, m11, "titleRightButton");
        Intrinsics.checkNotNullExpressionValue(f12, "adapter(...)");
        this.nullableButtonV3DTOAdapter = f12;
        JsonAdapter<TapTagsDTO.PresentationSettingsDTO> f13 = moshi.f(TapTagsDTO.PresentationSettingsDTO.class, m11, "presentationSettings");
        Intrinsics.checkNotNullExpressionValue(f13, "adapter(...)");
        this.nullablePresentationSettingsDTOAdapter = f13;
    }

    @NotNull
    public String toString() {
        return Ak.b.c(32, "GeneratedJsonAdapter(TapTagsDTO)", "toString(...)");
    }

    @Override // com.squareup.moshi.JsonAdapter
    @NotNull
    public TapTagsDTO fromJson(@NotNull n reader) {
        Intrinsics.checkNotNullParameter(reader, "reader");
        reader.beginObject();
        TextDTO textDTO = null;
        List<TapTagsDTO.TagItemDTO> list = null;
        ButtonV3DTO buttonV3DTO = null;
        TapTagsDTO.PresentationSettingsDTO presentationSettingsDTO = null;
        while (reader.hasNext()) {
            int v11 = reader.v(this.options);
            if (v11 == -1) {
                reader.y();
                reader.skipValue();
            } else if (v11 == 0) {
                textDTO = this.nullableTextDTOAdapter.fromJson(reader);
            } else if (v11 == 1) {
                list = this.listOfTagItemDTOAdapter.fromJson(reader);
                if (list == null) {
                    throw c.q("tagsItems", "tagsItems", reader);
                }
            } else if (v11 == 2) {
                buttonV3DTO = this.nullableButtonV3DTOAdapter.fromJson(reader);
            } else if (v11 == 3) {
                presentationSettingsDTO = this.nullablePresentationSettingsDTOAdapter.fromJson(reader);
            }
        }
        reader.endObject();
        if (list != null) {
            return new TapTagsDTO(textDTO, list, buttonV3DTO, presentationSettingsDTO);
        }
        throw c.j("tagsItems", "tagsItems", reader);
    }

    @Override // com.squareup.moshi.JsonAdapter
    /* renamed from: toJson, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
    public void mo44toJson(@NotNull x writer, TapTagsDTO value_) {
        Intrinsics.checkNotNullParameter(writer, "writer");
        if (value_ == null) {
            throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
        }
        writer.j();
        writer.w(SelectionItemFormDTO.TITLE_FIELD_NAME);
        this.nullableTextDTOAdapter.mo44toJson(writer, (x) value_.getTitle());
        writer.w("tagsItems");
        this.listOfTagItemDTOAdapter.mo44toJson(writer, (x) value_.getTagsItems());
        writer.w("titleRightButton");
        this.nullableButtonV3DTOAdapter.mo44toJson(writer, (x) value_.getTitleRightButton());
        writer.w("presentationSettings");
        this.nullablePresentationSettingsDTOAdapter.mo44toJson(writer, (x) value_.getPresentationSettings());
        writer.p();
    }
}
