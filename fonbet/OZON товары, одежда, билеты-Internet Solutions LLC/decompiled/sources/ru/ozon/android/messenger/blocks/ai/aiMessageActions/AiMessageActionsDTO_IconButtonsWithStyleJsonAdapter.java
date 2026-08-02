package ru.ozon.android.messenger.blocks.ai.aiMessageActions;

import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.Moshi;
import com.squareup.moshi.n;
import com.squareup.moshi.x;
import kotlin.Metadata;
import kotlin.collections.M;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.messenger.blocks.ai.aiMessageActions.AiMessageActionsDTO;

@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\f\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\f\u0010\rJ!\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000f\u001a\u00020\u000e2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u001a\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00170\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u001c\u0010\u001a\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00170\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u0019R\u001c\u0010\u001c\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001b0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u0019¨\u0006\u001d"}, d2 = {"Lru/ozon/android/messenger/blocks/ai/aiMessageActions/AiMessageActionsDTO_IconButtonsWithStyleJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lru/ozon/android/messenger/blocks/ai/aiMessageActions/AiMessageActionsDTO$IconButtonsWithStyle;", "Lcom/squareup/moshi/Moshi;", "moshi", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "", "toString", "()Ljava/lang/String;", "Lcom/squareup/moshi/n;", "reader", "fromJson", "(Lcom/squareup/moshi/n;)Lru/ozon/android/messenger/blocks/ai/aiMessageActions/AiMessageActionsDTO$IconButtonsWithStyle;", "Lcom/squareup/moshi/x;", "writer", "value_", "", "toJson", "(Lcom/squareup/moshi/x;Lru/ozon/android/messenger/blocks/ai/aiMessageActions/AiMessageActionsDTO$IconButtonsWithStyle;)V", "Lcom/squareup/moshi/n$a;", "options", "Lcom/squareup/moshi/n$a;", "Lru/ozon/android/messenger/blocks/ai/aiMessageActions/AiMessageActionsDTO$IconButtonsWithStyle$IconButtonWithSelected;", "iconButtonWithSelectedAdapter", "Lcom/squareup/moshi/JsonAdapter;", "nullableIconButtonWithSelectedAdapter", "", "nullableIntAdapter", "messenger_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class AiMessageActionsDTO_IconButtonsWithStyleJsonAdapter extends JsonAdapter<AiMessageActionsDTO.IconButtonsWithStyle> {
    public static final int $stable = 8;

    @NotNull
    private final JsonAdapter<AiMessageActionsDTO.IconButtonsWithStyle.IconButtonWithSelected> iconButtonWithSelectedAdapter;

    @NotNull
    private final JsonAdapter<AiMessageActionsDTO.IconButtonsWithStyle.IconButtonWithSelected> nullableIconButtonWithSelectedAdapter;

    @NotNull
    private final JsonAdapter<Integer> nullableIntAdapter;

    @NotNull
    private final n.a options;

    public AiMessageActionsDTO_IconButtonsWithStyleJsonAdapter(@NotNull Moshi moshi) {
        Intrinsics.checkNotNullParameter(moshi, "moshi");
        n.a a11 = n.a.C0918a.a("default", "clicked", "ttl");
        Intrinsics.checkNotNullExpressionValue(a11, "of(...)");
        this.options = a11;
        M m11 = M.f71699a;
        JsonAdapter<AiMessageActionsDTO.IconButtonsWithStyle.IconButtonWithSelected> f7 = moshi.f(AiMessageActionsDTO.IconButtonsWithStyle.IconButtonWithSelected.class, m11, "default");
        Intrinsics.checkNotNullExpressionValue(f7, "adapter(...)");
        this.iconButtonWithSelectedAdapter = f7;
        JsonAdapter<AiMessageActionsDTO.IconButtonsWithStyle.IconButtonWithSelected> f11 = moshi.f(AiMessageActionsDTO.IconButtonsWithStyle.IconButtonWithSelected.class, m11, "clicked");
        Intrinsics.checkNotNullExpressionValue(f11, "adapter(...)");
        this.nullableIconButtonWithSelectedAdapter = f11;
        JsonAdapter<Integer> f12 = moshi.f(Integer.class, m11, "ttl");
        Intrinsics.checkNotNullExpressionValue(f12, "adapter(...)");
        this.nullableIntAdapter = f12;
    }

    @NotNull
    public String toString() {
        return Ak.b.c(62, "GeneratedJsonAdapter(AiMessageActionsDTO.IconButtonsWithStyle)", "toString(...)");
    }

    @Override // com.squareup.moshi.JsonAdapter
    @NotNull
    public AiMessageActionsDTO.IconButtonsWithStyle fromJson(@NotNull n reader) {
        Intrinsics.checkNotNullParameter(reader, "reader");
        reader.beginObject();
        AiMessageActionsDTO.IconButtonsWithStyle.IconButtonWithSelected iconButtonWithSelected = null;
        AiMessageActionsDTO.IconButtonsWithStyle.IconButtonWithSelected iconButtonWithSelected2 = null;
        Integer num = null;
        while (reader.hasNext()) {
            int v11 = reader.v(this.options);
            if (v11 == -1) {
                reader.y();
                reader.skipValue();
            } else if (v11 == 0) {
                iconButtonWithSelected = this.iconButtonWithSelectedAdapter.fromJson(reader);
                if (iconButtonWithSelected == null) {
                    throw Y9.c.q("default", "default", reader);
                }
            } else if (v11 == 1) {
                iconButtonWithSelected2 = this.nullableIconButtonWithSelectedAdapter.fromJson(reader);
            } else if (v11 == 2) {
                num = this.nullableIntAdapter.fromJson(reader);
            }
        }
        reader.endObject();
        if (iconButtonWithSelected != null) {
            return new AiMessageActionsDTO.IconButtonsWithStyle(iconButtonWithSelected, iconButtonWithSelected2, num);
        }
        throw Y9.c.j("default", "default", reader);
    }

    @Override // com.squareup.moshi.JsonAdapter
    /* renamed from: toJson, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
    public void mo44toJson(@NotNull x writer, AiMessageActionsDTO.IconButtonsWithStyle value_) {
        Intrinsics.checkNotNullParameter(writer, "writer");
        if (value_ == null) {
            throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
        }
        writer.j();
        writer.w("default");
        this.iconButtonWithSelectedAdapter.mo44toJson(writer, (x) value_.getDefault());
        writer.w("clicked");
        this.nullableIconButtonWithSelectedAdapter.mo44toJson(writer, (x) value_.getClicked());
        writer.w("ttl");
        this.nullableIntAdapter.mo44toJson(writer, (x) value_.getTtl());
        writer.p();
    }
}
