package ru.ozon.android.messenger.blocks.replyInputBlock;

import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.Moshi;
import com.squareup.moshi.n;
import com.squareup.moshi.x;
import kotlin.Metadata;
import kotlin.collections.M;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.messenger.framework.data.remote.models.blocks.BlockDTO;
import ru.ozon.uni.atoms.data.controls.button.IconButtonV3DTO;
import ru.ozon.uni.atoms.data.icon.IconDTO;
import ru.ozon.uni.atoms.data.productMedia.ProductMediaDTO;
import ru.ozon.uni.atoms.data.text.TextDTO;

@Metadata(d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\f\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\f\u0010\rJ!\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000f\u001a\u00020\u000e2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u001c\u0010\u0018\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00170\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u001a\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u001a0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u0019R\u001c\u0010\u001d\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001c0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u0019R\u001a\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u001e0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010\u0019R\u001a\u0010!\u001a\b\u0012\u0004\u0012\u00020 0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010\u0019R\u001c\u0010#\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\"0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010\u0019¨\u0006$"}, d2 = {"Lru/ozon/android/messenger/blocks/replyInputBlock/ReplyInputBlockDTOJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lru/ozon/android/messenger/blocks/replyInputBlock/ReplyInputBlockDTO;", "Lcom/squareup/moshi/Moshi;", "moshi", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "", "toString", "()Ljava/lang/String;", "Lcom/squareup/moshi/n;", "reader", "fromJson", "(Lcom/squareup/moshi/n;)Lru/ozon/android/messenger/blocks/replyInputBlock/ReplyInputBlockDTO;", "Lcom/squareup/moshi/x;", "writer", "value_", "", "toJson", "(Lcom/squareup/moshi/x;Lru/ozon/android/messenger/blocks/replyInputBlock/ReplyInputBlockDTO;)V", "Lcom/squareup/moshi/n$a;", "options", "Lcom/squareup/moshi/n$a;", "Lru/ozon/android/messenger/blocks/replyInputBlock/SeparatorDTO;", "nullableSeparatorDTOAdapter", "Lcom/squareup/moshi/JsonAdapter;", "Lru/ozon/uni/atoms/data/icon/IconDTO;", "iconDTOAdapter", "Lru/ozon/uni/atoms/data/productMedia/ProductMediaDTO;", "nullableProductMediaDTOAdapter", "Lru/ozon/uni/atoms/data/text/TextDTO;", "textDTOAdapter", "Lru/ozon/uni/atoms/data/controls/button/IconButtonV3DTO;", "iconButtonV3DTOAdapter", "Lru/ozon/android/messenger/framework/data/remote/models/blocks/BlockDTO;", "nullableBlockDTOAdapter", "messenger_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class ReplyInputBlockDTOJsonAdapter extends JsonAdapter<ReplyInputBlockDTO> {
    public static final int $stable = 8;

    @NotNull
    private final JsonAdapter<IconButtonV3DTO> iconButtonV3DTOAdapter;

    @NotNull
    private final JsonAdapter<IconDTO> iconDTOAdapter;

    @NotNull
    private final JsonAdapter<BlockDTO> nullableBlockDTOAdapter;

    @NotNull
    private final JsonAdapter<ProductMediaDTO> nullableProductMediaDTOAdapter;

    @NotNull
    private final JsonAdapter<SeparatorDTO> nullableSeparatorDTOAdapter;

    @NotNull
    private final n.a options;

    @NotNull
    private final JsonAdapter<TextDTO> textDTOAdapter;

    public ReplyInputBlockDTOJsonAdapter(@NotNull Moshi moshi) {
        Intrinsics.checkNotNullParameter(moshi, "moshi");
        n.a a11 = n.a.C0918a.a("separator", "leftIcon", "messageMedia", "titleAtom", "subtitleAtom", "closeIconButton", "localMessageBlock");
        Intrinsics.checkNotNullExpressionValue(a11, "of(...)");
        this.options = a11;
        M m11 = M.f71699a;
        JsonAdapter<SeparatorDTO> f7 = moshi.f(SeparatorDTO.class, m11, "separator");
        Intrinsics.checkNotNullExpressionValue(f7, "adapter(...)");
        this.nullableSeparatorDTOAdapter = f7;
        JsonAdapter<IconDTO> f11 = moshi.f(IconDTO.class, m11, "leftIcon");
        Intrinsics.checkNotNullExpressionValue(f11, "adapter(...)");
        this.iconDTOAdapter = f11;
        JsonAdapter<ProductMediaDTO> f12 = moshi.f(ProductMediaDTO.class, m11, "messageMedia");
        Intrinsics.checkNotNullExpressionValue(f12, "adapter(...)");
        this.nullableProductMediaDTOAdapter = f12;
        JsonAdapter<TextDTO> f13 = moshi.f(TextDTO.class, m11, "titleAtom");
        Intrinsics.checkNotNullExpressionValue(f13, "adapter(...)");
        this.textDTOAdapter = f13;
        JsonAdapter<IconButtonV3DTO> f14 = moshi.f(IconButtonV3DTO.class, m11, "closeIconButton");
        Intrinsics.checkNotNullExpressionValue(f14, "adapter(...)");
        this.iconButtonV3DTOAdapter = f14;
        JsonAdapter<BlockDTO> f15 = moshi.f(BlockDTO.class, m11, "localMessageBlock");
        Intrinsics.checkNotNullExpressionValue(f15, "adapter(...)");
        this.nullableBlockDTOAdapter = f15;
    }

    @NotNull
    public String toString() {
        return Ak.b.c(40, "GeneratedJsonAdapter(ReplyInputBlockDTO)", "toString(...)");
    }

    @Override // com.squareup.moshi.JsonAdapter
    @NotNull
    public ReplyInputBlockDTO fromJson(@NotNull n reader) {
        Intrinsics.checkNotNullParameter(reader, "reader");
        reader.beginObject();
        SeparatorDTO separatorDTO = null;
        IconDTO iconDTO = null;
        ProductMediaDTO productMediaDTO = null;
        TextDTO textDTO = null;
        TextDTO textDTO2 = null;
        IconButtonV3DTO iconButtonV3DTO = null;
        BlockDTO blockDTO = null;
        while (reader.hasNext()) {
            switch (reader.v(this.options)) {
                case -1:
                    reader.y();
                    reader.skipValue();
                    break;
                case 0:
                    separatorDTO = this.nullableSeparatorDTOAdapter.fromJson(reader);
                    break;
                case 1:
                    iconDTO = this.iconDTOAdapter.fromJson(reader);
                    if (iconDTO == null) {
                        throw Y9.c.q("leftIcon", "leftIcon", reader);
                    }
                    break;
                case 2:
                    productMediaDTO = this.nullableProductMediaDTOAdapter.fromJson(reader);
                    break;
                case 3:
                    textDTO = this.textDTOAdapter.fromJson(reader);
                    if (textDTO == null) {
                        throw Y9.c.q("titleAtom", "titleAtom", reader);
                    }
                    break;
                case 4:
                    textDTO2 = this.textDTOAdapter.fromJson(reader);
                    if (textDTO2 == null) {
                        throw Y9.c.q("subtitleAtom", "subtitleAtom", reader);
                    }
                    break;
                case 5:
                    iconButtonV3DTO = this.iconButtonV3DTOAdapter.fromJson(reader);
                    if (iconButtonV3DTO == null) {
                        throw Y9.c.q("closeIconButton", "closeIconButton", reader);
                    }
                    break;
                case 6:
                    blockDTO = this.nullableBlockDTOAdapter.fromJson(reader);
                    break;
            }
        }
        reader.endObject();
        if (iconDTO == null) {
            throw Y9.c.j("leftIcon", "leftIcon", reader);
        }
        if (textDTO == null) {
            throw Y9.c.j("titleAtom", "titleAtom", reader);
        }
        if (textDTO2 == null) {
            throw Y9.c.j("subtitleAtom", "subtitleAtom", reader);
        }
        if (iconButtonV3DTO != null) {
            return new ReplyInputBlockDTO(separatorDTO, iconDTO, productMediaDTO, textDTO, textDTO2, iconButtonV3DTO, blockDTO);
        }
        throw Y9.c.j("closeIconButton", "closeIconButton", reader);
    }

    @Override // com.squareup.moshi.JsonAdapter
    /* renamed from: toJson, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
    public void mo44toJson(@NotNull x writer, ReplyInputBlockDTO value_) {
        Intrinsics.checkNotNullParameter(writer, "writer");
        if (value_ == null) {
            throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
        }
        writer.j();
        writer.w("separator");
        this.nullableSeparatorDTOAdapter.mo44toJson(writer, (x) value_.getSeparator());
        writer.w("leftIcon");
        this.iconDTOAdapter.mo44toJson(writer, (x) value_.getLeftIcon());
        writer.w("messageMedia");
        this.nullableProductMediaDTOAdapter.mo44toJson(writer, (x) value_.getMessageMedia());
        writer.w("titleAtom");
        this.textDTOAdapter.mo44toJson(writer, (x) value_.getTitleAtom());
        writer.w("subtitleAtom");
        this.textDTOAdapter.mo44toJson(writer, (x) value_.getSubtitleAtom());
        writer.w("closeIconButton");
        this.iconButtonV3DTOAdapter.mo44toJson(writer, (x) value_.getCloseIconButton());
        writer.w("localMessageBlock");
        this.nullableBlockDTOAdapter.mo44toJson(writer, (x) value_.getLocalMessageBlock());
        writer.p();
    }
}
