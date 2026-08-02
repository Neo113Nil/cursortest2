package ru.ozon.android.messenger.blocks.replymessageblock;

import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.Moshi;
import com.squareup.moshi.n;
import com.squareup.moshi.x;
import kotlin.Metadata;
import kotlin.collections.M;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.uni.atoms.data.productMedia.ProductMediaDTO;
import ru.ozon.uni.atoms.data.text.TextDTO;

@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\f\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\f\u0010\rJ!\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000f\u001a\u00020\u000e2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u001c\u0010\u0017\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u001c\u0010\u001a\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00190\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u0018R\u001c\u0010\u001c\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001b0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u0018R\u001a\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u001d0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u0018R\u001c\u0010\u001f\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001d0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010\u0018¨\u0006 "}, d2 = {"Lru/ozon/android/messenger/blocks/replymessageblock/ReplyMessageBlockDTOJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lru/ozon/android/messenger/blocks/replymessageblock/ReplyMessageBlockDTO;", "Lcom/squareup/moshi/Moshi;", "moshi", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "", "toString", "()Ljava/lang/String;", "Lcom/squareup/moshi/n;", "reader", "fromJson", "(Lcom/squareup/moshi/n;)Lru/ozon/android/messenger/blocks/replymessageblock/ReplyMessageBlockDTO;", "Lcom/squareup/moshi/x;", "writer", "value_", "", "toJson", "(Lcom/squareup/moshi/x;Lru/ozon/android/messenger/blocks/replymessageblock/ReplyMessageBlockDTO;)V", "Lcom/squareup/moshi/n$a;", "options", "Lcom/squareup/moshi/n$a;", "nullableStringAdapter", "Lcom/squareup/moshi/JsonAdapter;", "Lru/ozon/android/messenger/blocks/replymessageblock/VerticalLineStyleDTO;", "nullableVerticalLineStyleDTOAdapter", "Lru/ozon/uni/atoms/data/productMedia/ProductMediaDTO;", "nullableProductMediaDTOAdapter", "Lru/ozon/uni/atoms/data/text/TextDTO;", "textDTOAdapter", "nullableTextDTOAdapter", "messenger_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class ReplyMessageBlockDTOJsonAdapter extends JsonAdapter<ReplyMessageBlockDTO> {
    public static final int $stable = 8;

    @NotNull
    private final JsonAdapter<ProductMediaDTO> nullableProductMediaDTOAdapter;

    @NotNull
    private final JsonAdapter<String> nullableStringAdapter;

    @NotNull
    private final JsonAdapter<TextDTO> nullableTextDTOAdapter;

    @NotNull
    private final JsonAdapter<VerticalLineStyleDTO> nullableVerticalLineStyleDTOAdapter;

    @NotNull
    private final n.a options;

    @NotNull
    private final JsonAdapter<TextDTO> textDTOAdapter;

    public ReplyMessageBlockDTOJsonAdapter(@NotNull Moshi moshi) {
        Intrinsics.checkNotNullParameter(moshi, "moshi");
        n.a a11 = n.a.C0918a.a("replyMessageId", "verticalLineStyle", "messageMedia", "titleAtom", "subtitleAtom");
        Intrinsics.checkNotNullExpressionValue(a11, "of(...)");
        this.options = a11;
        M m11 = M.f71699a;
        JsonAdapter<String> f7 = moshi.f(String.class, m11, "replyMessageId");
        Intrinsics.checkNotNullExpressionValue(f7, "adapter(...)");
        this.nullableStringAdapter = f7;
        JsonAdapter<VerticalLineStyleDTO> f11 = moshi.f(VerticalLineStyleDTO.class, m11, "verticalLineStyle");
        Intrinsics.checkNotNullExpressionValue(f11, "adapter(...)");
        this.nullableVerticalLineStyleDTOAdapter = f11;
        JsonAdapter<ProductMediaDTO> f12 = moshi.f(ProductMediaDTO.class, m11, "messageMedia");
        Intrinsics.checkNotNullExpressionValue(f12, "adapter(...)");
        this.nullableProductMediaDTOAdapter = f12;
        JsonAdapter<TextDTO> f13 = moshi.f(TextDTO.class, m11, "titleAtom");
        Intrinsics.checkNotNullExpressionValue(f13, "adapter(...)");
        this.textDTOAdapter = f13;
        JsonAdapter<TextDTO> f14 = moshi.f(TextDTO.class, m11, "subtitleAtom");
        Intrinsics.checkNotNullExpressionValue(f14, "adapter(...)");
        this.nullableTextDTOAdapter = f14;
    }

    @NotNull
    public String toString() {
        return Ak.b.c(42, "GeneratedJsonAdapter(ReplyMessageBlockDTO)", "toString(...)");
    }

    @Override // com.squareup.moshi.JsonAdapter
    @NotNull
    public ReplyMessageBlockDTO fromJson(@NotNull n reader) {
        Intrinsics.checkNotNullParameter(reader, "reader");
        reader.beginObject();
        String str = null;
        VerticalLineStyleDTO verticalLineStyleDTO = null;
        ProductMediaDTO productMediaDTO = null;
        TextDTO textDTO = null;
        TextDTO textDTO2 = null;
        while (reader.hasNext()) {
            int v11 = reader.v(this.options);
            if (v11 == -1) {
                reader.y();
                reader.skipValue();
            } else if (v11 == 0) {
                str = this.nullableStringAdapter.fromJson(reader);
            } else if (v11 == 1) {
                verticalLineStyleDTO = this.nullableVerticalLineStyleDTOAdapter.fromJson(reader);
            } else if (v11 == 2) {
                productMediaDTO = this.nullableProductMediaDTOAdapter.fromJson(reader);
            } else if (v11 == 3) {
                textDTO = this.textDTOAdapter.fromJson(reader);
                if (textDTO == null) {
                    throw Y9.c.q("titleAtom", "titleAtom", reader);
                }
            } else if (v11 == 4) {
                textDTO2 = this.nullableTextDTOAdapter.fromJson(reader);
            }
        }
        reader.endObject();
        if (textDTO != null) {
            return new ReplyMessageBlockDTO(str, verticalLineStyleDTO, productMediaDTO, textDTO, textDTO2);
        }
        throw Y9.c.j("titleAtom", "titleAtom", reader);
    }

    @Override // com.squareup.moshi.JsonAdapter
    /* renamed from: toJson, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
    public void mo44toJson(@NotNull x writer, ReplyMessageBlockDTO value_) {
        Intrinsics.checkNotNullParameter(writer, "writer");
        if (value_ == null) {
            throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
        }
        writer.j();
        writer.w("replyMessageId");
        this.nullableStringAdapter.mo44toJson(writer, (x) value_.getReplyMessageId());
        writer.w("verticalLineStyle");
        this.nullableVerticalLineStyleDTOAdapter.mo44toJson(writer, (x) value_.getVerticalLineStyle());
        writer.w("messageMedia");
        this.nullableProductMediaDTOAdapter.mo44toJson(writer, (x) value_.getMessageMedia());
        writer.w("titleAtom");
        this.textDTOAdapter.mo44toJson(writer, (x) value_.getTitleAtom());
        writer.w("subtitleAtom");
        this.nullableTextDTOAdapter.mo44toJson(writer, (x) value_.getSubtitleAtom());
        writer.p();
    }
}
