package ru.ozon.android.messenger.framework.composer.widgets.fastAnswersList.data;

import Ak.b;
import Y9.c;
import com.squareup.moshi.D;
import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.Moshi;
import com.squareup.moshi.n;
import com.squareup.moshi.x;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.M;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.messenger.framework.composer.widgets.fastAnswersList.data.FastAnswerDTO;
import ru.ozon.android.tokenized.model.TokenizedTrackingInfo;
import ru.ozon.uni.atoms.data.AtomActionDTO;
import ru.ozon.uni.atoms.data.controls.button.IconButtonV3DTO;
import ru.ozon.uni.atoms.data.icon.IconDTO;
import ru.ozon.uni.atoms.data.text.TextDTO;

@Metadata(d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\f\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\f\u0010\rJ!\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000f\u001a\u00020\u000e2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u001a\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00170\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u001a\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u001a0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u0019R\u001c\u0010\u001d\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001c0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u0019R\u001c\u0010\u001e\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u0019R\u001c\u0010 \u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001f0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010\u0019R(\u0010#\u001a\u0016\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\"\u0018\u00010!0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010\u0019¨\u0006$"}, d2 = {"Lru/ozon/android/messenger/framework/composer/widgets/fastAnswersList/data/FastAnswerDTO_FastAnswerTemplateCellDTOJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lru/ozon/android/messenger/framework/composer/widgets/fastAnswersList/data/FastAnswerDTO$FastAnswerTemplateCellDTO;", "Lcom/squareup/moshi/Moshi;", "moshi", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "", "toString", "()Ljava/lang/String;", "Lcom/squareup/moshi/n;", "reader", "fromJson", "(Lcom/squareup/moshi/n;)Lru/ozon/android/messenger/framework/composer/widgets/fastAnswersList/data/FastAnswerDTO$FastAnswerTemplateCellDTO;", "Lcom/squareup/moshi/x;", "writer", "value_", "", "toJson", "(Lcom/squareup/moshi/x;Lru/ozon/android/messenger/framework/composer/widgets/fastAnswersList/data/FastAnswerDTO$FastAnswerTemplateCellDTO;)V", "Lcom/squareup/moshi/n$a;", "options", "Lcom/squareup/moshi/n$a;", "Lru/ozon/uni/atoms/data/controls/button/IconButtonV3DTO;", "iconButtonV3DTOAdapter", "Lcom/squareup/moshi/JsonAdapter;", "Lru/ozon/uni/atoms/data/text/TextDTO;", "textDTOAdapter", "Lru/ozon/uni/atoms/data/icon/IconDTO;", "nullableIconDTOAdapter", "nullableStringAdapter", "Lru/ozon/uni/atoms/data/AtomActionDTO;", "nullableAtomActionDTOAdapter", "", "Lru/ozon/android/tokenized/model/TokenizedTrackingInfo;", "nullableMapOfStringTokenizedTrackingInfoAdapter", "messenger_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class FastAnswerDTO_FastAnswerTemplateCellDTOJsonAdapter extends JsonAdapter<FastAnswerDTO.FastAnswerTemplateCellDTO> {
    public static final int $stable = 8;

    @NotNull
    private final JsonAdapter<IconButtonV3DTO> iconButtonV3DTOAdapter;

    @NotNull
    private final JsonAdapter<AtomActionDTO> nullableAtomActionDTOAdapter;

    @NotNull
    private final JsonAdapter<IconDTO> nullableIconDTOAdapter;

    @NotNull
    private final JsonAdapter<Map<String, TokenizedTrackingInfo>> nullableMapOfStringTokenizedTrackingInfoAdapter;

    @NotNull
    private final JsonAdapter<String> nullableStringAdapter;

    @NotNull
    private final n.a options;

    @NotNull
    private final JsonAdapter<TextDTO> textDTOAdapter;

    public FastAnswerDTO_FastAnswerTemplateCellDTOJsonAdapter(@NotNull Moshi moshi) {
        Intrinsics.checkNotNullParameter(moshi, "moshi");
        n.a a11 = n.a.C0918a.a("editButton", "removeButton", "text", "chevronIcon", "backgroundColor", "action", "trackingInfo");
        Intrinsics.checkNotNullExpressionValue(a11, "of(...)");
        this.options = a11;
        M m11 = M.f71699a;
        JsonAdapter<IconButtonV3DTO> f7 = moshi.f(IconButtonV3DTO.class, m11, "editButton");
        Intrinsics.checkNotNullExpressionValue(f7, "adapter(...)");
        this.iconButtonV3DTOAdapter = f7;
        JsonAdapter<TextDTO> f11 = moshi.f(TextDTO.class, m11, "text");
        Intrinsics.checkNotNullExpressionValue(f11, "adapter(...)");
        this.textDTOAdapter = f11;
        JsonAdapter<IconDTO> f12 = moshi.f(IconDTO.class, m11, "chevronIcon");
        Intrinsics.checkNotNullExpressionValue(f12, "adapter(...)");
        this.nullableIconDTOAdapter = f12;
        JsonAdapter<String> f13 = moshi.f(String.class, m11, "backgroundColor");
        Intrinsics.checkNotNullExpressionValue(f13, "adapter(...)");
        this.nullableStringAdapter = f13;
        JsonAdapter<AtomActionDTO> f14 = moshi.f(AtomActionDTO.class, m11, "action");
        Intrinsics.checkNotNullExpressionValue(f14, "adapter(...)");
        this.nullableAtomActionDTOAdapter = f14;
        JsonAdapter<Map<String, TokenizedTrackingInfo>> f15 = moshi.f(D.e(Map.class, String.class, TokenizedTrackingInfo.class), m11, "trackingInfo");
        Intrinsics.checkNotNullExpressionValue(f15, "adapter(...)");
        this.nullableMapOfStringTokenizedTrackingInfoAdapter = f15;
    }

    @NotNull
    public String toString() {
        return b.c(61, "GeneratedJsonAdapter(FastAnswerDTO.FastAnswerTemplateCellDTO)", "toString(...)");
    }

    @Override // com.squareup.moshi.JsonAdapter
    @NotNull
    public FastAnswerDTO.FastAnswerTemplateCellDTO fromJson(@NotNull n reader) {
        Intrinsics.checkNotNullParameter(reader, "reader");
        reader.beginObject();
        IconButtonV3DTO iconButtonV3DTO = null;
        IconButtonV3DTO iconButtonV3DTO2 = null;
        TextDTO textDTO = null;
        IconDTO iconDTO = null;
        String str = null;
        AtomActionDTO atomActionDTO = null;
        Map<String, TokenizedTrackingInfo> map = null;
        while (reader.hasNext()) {
            switch (reader.v(this.options)) {
                case -1:
                    reader.y();
                    reader.skipValue();
                    break;
                case 0:
                    iconButtonV3DTO = this.iconButtonV3DTOAdapter.fromJson(reader);
                    if (iconButtonV3DTO == null) {
                        throw c.q("editButton", "editButton", reader);
                    }
                    break;
                case 1:
                    iconButtonV3DTO2 = this.iconButtonV3DTOAdapter.fromJson(reader);
                    if (iconButtonV3DTO2 == null) {
                        throw c.q("removeButton", "removeButton", reader);
                    }
                    break;
                case 2:
                    textDTO = this.textDTOAdapter.fromJson(reader);
                    if (textDTO == null) {
                        throw c.q("text", "text", reader);
                    }
                    break;
                case 3:
                    iconDTO = this.nullableIconDTOAdapter.fromJson(reader);
                    break;
                case 4:
                    str = this.nullableStringAdapter.fromJson(reader);
                    break;
                case 5:
                    atomActionDTO = this.nullableAtomActionDTOAdapter.fromJson(reader);
                    break;
                case 6:
                    map = this.nullableMapOfStringTokenizedTrackingInfoAdapter.fromJson(reader);
                    break;
            }
        }
        reader.endObject();
        if (iconButtonV3DTO == null) {
            throw c.j("editButton", "editButton", reader);
        }
        if (iconButtonV3DTO2 == null) {
            throw c.j("removeButton", "removeButton", reader);
        }
        if (textDTO != null) {
            return new FastAnswerDTO.FastAnswerTemplateCellDTO(iconButtonV3DTO, iconButtonV3DTO2, textDTO, iconDTO, str, atomActionDTO, map);
        }
        throw c.j("text", "text", reader);
    }

    @Override // com.squareup.moshi.JsonAdapter
    /* renamed from: toJson, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
    public void mo44toJson(@NotNull x writer, FastAnswerDTO.FastAnswerTemplateCellDTO value_) {
        Intrinsics.checkNotNullParameter(writer, "writer");
        if (value_ == null) {
            throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
        }
        writer.j();
        writer.w("editButton");
        this.iconButtonV3DTOAdapter.mo44toJson(writer, (x) value_.getEditButton());
        writer.w("removeButton");
        this.iconButtonV3DTOAdapter.mo44toJson(writer, (x) value_.getRemoveButton());
        writer.w("text");
        this.textDTOAdapter.mo44toJson(writer, (x) value_.getText());
        writer.w("chevronIcon");
        this.nullableIconDTOAdapter.mo44toJson(writer, (x) value_.getChevronIcon());
        writer.w("backgroundColor");
        this.nullableStringAdapter.mo44toJson(writer, (x) value_.getBackgroundColor());
        writer.w("action");
        this.nullableAtomActionDTOAdapter.mo44toJson(writer, (x) value_.getAction());
        writer.w("trackingInfo");
        this.nullableMapOfStringTokenizedTrackingInfoAdapter.mo44toJson(writer, (x) value_.getTrackingInfo());
        writer.p();
    }
}
