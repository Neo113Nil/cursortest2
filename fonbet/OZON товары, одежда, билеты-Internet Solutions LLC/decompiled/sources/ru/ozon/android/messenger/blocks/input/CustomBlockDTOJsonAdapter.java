package ru.ozon.android.messenger.blocks.input;

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
import ru.ozon.android.messenger.utils.view.LabeledIconMetaDTO;
import ru.ozon.android.tokenized.model.TokenizedTrackingInfo;
import ru.ozon.app.android.ugc.widgets.selectionItemForm.data.SelectionItemFormDTO;
import ru.ozon.uni.atoms.data.controls.button.IconButtonV3DTO;
import ru.ozon.uni.atoms.data.icon.IconDTO;
import ru.ozon.uni.atoms.data.text.TextDTO;

@Metadata(d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\f\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\f\u0010\rJ!\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000f\u001a\u00020\u000e2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R&\u0010\u0018\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00070\u00170\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u001a\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u001a0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u0019R\u001c\u0010\u001c\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001a0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u0019R\u001c\u0010\u001d\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u0019R\u001c\u0010\u001f\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001e0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010\u0019R\u001c\u0010!\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010 0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010\u0019R(\u0010#\u001a\u0016\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\"\u0018\u00010\u00170\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010\u0019R\u001c\u0010%\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010$0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b%\u0010\u0019¨\u0006&"}, d2 = {"Lru/ozon/android/messenger/blocks/input/CustomBlockDTOJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lru/ozon/android/messenger/blocks/input/CustomBlockDTO;", "Lcom/squareup/moshi/Moshi;", "moshi", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "", "toString", "()Ljava/lang/String;", "Lcom/squareup/moshi/n;", "reader", "fromJson", "(Lcom/squareup/moshi/n;)Lru/ozon/android/messenger/blocks/input/CustomBlockDTO;", "Lcom/squareup/moshi/x;", "writer", "value_", "", "toJson", "(Lcom/squareup/moshi/x;Lru/ozon/android/messenger/blocks/input/CustomBlockDTO;)V", "Lcom/squareup/moshi/n$a;", "options", "Lcom/squareup/moshi/n$a;", "", "mapOfStringStringAdapter", "Lcom/squareup/moshi/JsonAdapter;", "Lru/ozon/uni/atoms/data/text/TextDTO;", "textDTOAdapter", "nullableTextDTOAdapter", "nullableStringAdapter", "Lru/ozon/uni/atoms/data/icon/IconDTO;", "nullableIconDTOAdapter", "Lru/ozon/android/messenger/utils/view/LabeledIconMetaDTO;", "nullableLabeledIconMetaDTOAdapter", "Lru/ozon/android/tokenized/model/TokenizedTrackingInfo;", "nullableMapOfStringTokenizedTrackingInfoAdapter", "Lru/ozon/uni/atoms/data/controls/button/IconButtonV3DTO;", "nullableIconButtonV3DTOAdapter", "messenger_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class CustomBlockDTOJsonAdapter extends JsonAdapter<CustomBlockDTO> {
    public static final int $stable = 8;

    @NotNull
    private final JsonAdapter<Map<String, String>> mapOfStringStringAdapter;

    @NotNull
    private final JsonAdapter<IconButtonV3DTO> nullableIconButtonV3DTOAdapter;

    @NotNull
    private final JsonAdapter<IconDTO> nullableIconDTOAdapter;

    @NotNull
    private final JsonAdapter<LabeledIconMetaDTO> nullableLabeledIconMetaDTOAdapter;

    @NotNull
    private final JsonAdapter<Map<String, TokenizedTrackingInfo>> nullableMapOfStringTokenizedTrackingInfoAdapter;

    @NotNull
    private final JsonAdapter<String> nullableStringAdapter;

    @NotNull
    private final JsonAdapter<TextDTO> nullableTextDTOAdapter;

    @NotNull
    private final n.a options;

    @NotNull
    private final JsonAdapter<TextDTO> textDTOAdapter;

    public CustomBlockDTOJsonAdapter(@NotNull Moshi moshi) {
        Intrinsics.checkNotNullParameter(moshi, "moshi");
        n.a a11 = n.a.C0918a.a("payload", SelectionItemFormDTO.TITLE_FIELD_NAME, "subtitle", "backgroundColor", "image", "labeledIcon", "trackingInfo", "removeIcon");
        Intrinsics.checkNotNullExpressionValue(a11, "of(...)");
        this.options = a11;
        Y9.b e11 = D.e(Map.class, String.class, String.class);
        M m11 = M.f71699a;
        JsonAdapter<Map<String, String>> f7 = moshi.f(e11, m11, "payload");
        Intrinsics.checkNotNullExpressionValue(f7, "adapter(...)");
        this.mapOfStringStringAdapter = f7;
        JsonAdapter<TextDTO> f11 = moshi.f(TextDTO.class, m11, SelectionItemFormDTO.TITLE_FIELD_NAME);
        Intrinsics.checkNotNullExpressionValue(f11, "adapter(...)");
        this.textDTOAdapter = f11;
        JsonAdapter<TextDTO> f12 = moshi.f(TextDTO.class, m11, "subtitle");
        Intrinsics.checkNotNullExpressionValue(f12, "adapter(...)");
        this.nullableTextDTOAdapter = f12;
        JsonAdapter<String> f13 = moshi.f(String.class, m11, "backgroundColor");
        Intrinsics.checkNotNullExpressionValue(f13, "adapter(...)");
        this.nullableStringAdapter = f13;
        JsonAdapter<IconDTO> f14 = moshi.f(IconDTO.class, m11, "image");
        Intrinsics.checkNotNullExpressionValue(f14, "adapter(...)");
        this.nullableIconDTOAdapter = f14;
        JsonAdapter<LabeledIconMetaDTO> f15 = moshi.f(LabeledIconMetaDTO.class, m11, "labeledIcon");
        Intrinsics.checkNotNullExpressionValue(f15, "adapter(...)");
        this.nullableLabeledIconMetaDTOAdapter = f15;
        JsonAdapter<Map<String, TokenizedTrackingInfo>> f16 = moshi.f(D.e(Map.class, String.class, TokenizedTrackingInfo.class), m11, "trackingInfo");
        Intrinsics.checkNotNullExpressionValue(f16, "adapter(...)");
        this.nullableMapOfStringTokenizedTrackingInfoAdapter = f16;
        JsonAdapter<IconButtonV3DTO> f17 = moshi.f(IconButtonV3DTO.class, m11, "removeIcon");
        Intrinsics.checkNotNullExpressionValue(f17, "adapter(...)");
        this.nullableIconButtonV3DTOAdapter = f17;
    }

    @NotNull
    public String toString() {
        return Ak.b.c(36, "GeneratedJsonAdapter(CustomBlockDTO)", "toString(...)");
    }

    @Override // com.squareup.moshi.JsonAdapter
    @NotNull
    public CustomBlockDTO fromJson(@NotNull n reader) {
        Intrinsics.checkNotNullParameter(reader, "reader");
        reader.beginObject();
        Map<String, String> map = null;
        TextDTO textDTO = null;
        TextDTO textDTO2 = null;
        String str = null;
        IconDTO iconDTO = null;
        LabeledIconMetaDTO labeledIconMetaDTO = null;
        Map<String, TokenizedTrackingInfo> map2 = null;
        IconButtonV3DTO iconButtonV3DTO = null;
        while (reader.hasNext()) {
            switch (reader.v(this.options)) {
                case -1:
                    reader.y();
                    reader.skipValue();
                    break;
                case 0:
                    map = this.mapOfStringStringAdapter.fromJson(reader);
                    if (map == null) {
                        throw Y9.c.q("payload", "payload", reader);
                    }
                    break;
                case 1:
                    textDTO = this.textDTOAdapter.fromJson(reader);
                    if (textDTO == null) {
                        throw Y9.c.q(SelectionItemFormDTO.TITLE_FIELD_NAME, SelectionItemFormDTO.TITLE_FIELD_NAME, reader);
                    }
                    break;
                case 2:
                    textDTO2 = this.nullableTextDTOAdapter.fromJson(reader);
                    break;
                case 3:
                    str = this.nullableStringAdapter.fromJson(reader);
                    break;
                case 4:
                    iconDTO = this.nullableIconDTOAdapter.fromJson(reader);
                    break;
                case 5:
                    labeledIconMetaDTO = this.nullableLabeledIconMetaDTOAdapter.fromJson(reader);
                    break;
                case 6:
                    map2 = this.nullableMapOfStringTokenizedTrackingInfoAdapter.fromJson(reader);
                    break;
                case 7:
                    iconButtonV3DTO = this.nullableIconButtonV3DTOAdapter.fromJson(reader);
                    break;
            }
        }
        reader.endObject();
        if (map == null) {
            throw Y9.c.j("payload", "payload", reader);
        }
        if (textDTO != null) {
            return new CustomBlockDTO(map, textDTO, textDTO2, str, iconDTO, labeledIconMetaDTO, map2, iconButtonV3DTO);
        }
        throw Y9.c.j(SelectionItemFormDTO.TITLE_FIELD_NAME, SelectionItemFormDTO.TITLE_FIELD_NAME, reader);
    }

    @Override // com.squareup.moshi.JsonAdapter
    /* renamed from: toJson, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
    public void mo44toJson(@NotNull x writer, CustomBlockDTO value_) {
        Intrinsics.checkNotNullParameter(writer, "writer");
        if (value_ == null) {
            throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
        }
        writer.j();
        writer.w("payload");
        this.mapOfStringStringAdapter.mo44toJson(writer, (x) value_.getPayload());
        writer.w(SelectionItemFormDTO.TITLE_FIELD_NAME);
        this.textDTOAdapter.mo44toJson(writer, (x) value_.getTitle());
        writer.w("subtitle");
        this.nullableTextDTOAdapter.mo44toJson(writer, (x) value_.getSubtitle());
        writer.w("backgroundColor");
        this.nullableStringAdapter.mo44toJson(writer, (x) value_.getBackgroundColor());
        writer.w("image");
        this.nullableIconDTOAdapter.mo44toJson(writer, (x) value_.getImage());
        writer.w("labeledIcon");
        this.nullableLabeledIconMetaDTOAdapter.mo44toJson(writer, (x) value_.getLabeledIcon());
        writer.w("trackingInfo");
        this.nullableMapOfStringTokenizedTrackingInfoAdapter.mo44toJson(writer, (x) value_.getTrackingInfo());
        writer.w("removeIcon");
        this.nullableIconButtonV3DTOAdapter.mo44toJson(writer, (x) value_.getRemoveIcon());
        writer.p();
    }
}
