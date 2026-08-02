package ru.ozon.android.messenger.blocks.ai.aiMessageActions;

import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.Moshi;
import com.squareup.moshi.n;
import com.squareup.moshi.x;
import java.lang.reflect.Constructor;
import kotlin.Metadata;
import kotlin.collections.M;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.messenger.blocks.ai.aiMessageActions.AiMessageActionsDTO;
import ru.ozon.uni.atoms.data.controls.button.IconButtonV3DTO;

@Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\f\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\f\u0010\rJ!\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000f\u001a\u00020\u000e2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u001a\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00170\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u001c\u0010\u001b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001a0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u0019R\u001e\u0010\u001d\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u001c8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001d\u0010\u001e¨\u0006\u001f"}, d2 = {"Lru/ozon/android/messenger/blocks/ai/aiMessageActions/AiMessageActionsDTO_IconButtonsWithStyle_IconButtonWithSelectedJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lru/ozon/android/messenger/blocks/ai/aiMessageActions/AiMessageActionsDTO$IconButtonsWithStyle$IconButtonWithSelected;", "Lcom/squareup/moshi/Moshi;", "moshi", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "", "toString", "()Ljava/lang/String;", "Lcom/squareup/moshi/n;", "reader", "fromJson", "(Lcom/squareup/moshi/n;)Lru/ozon/android/messenger/blocks/ai/aiMessageActions/AiMessageActionsDTO$IconButtonsWithStyle$IconButtonWithSelected;", "Lcom/squareup/moshi/x;", "writer", "value_", "", "toJson", "(Lcom/squareup/moshi/x;Lru/ozon/android/messenger/blocks/ai/aiMessageActions/AiMessageActionsDTO$IconButtonsWithStyle$IconButtonWithSelected;)V", "Lcom/squareup/moshi/n$a;", "options", "Lcom/squareup/moshi/n$a;", "Lru/ozon/uni/atoms/data/controls/button/IconButtonV3DTO;", "iconButtonV3DTOAdapter", "Lcom/squareup/moshi/JsonAdapter;", "", "nullableBooleanAdapter", "Ljava/lang/reflect/Constructor;", "constructorRef", "Ljava/lang/reflect/Constructor;", "messenger_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class AiMessageActionsDTO_IconButtonsWithStyle_IconButtonWithSelectedJsonAdapter extends JsonAdapter<AiMessageActionsDTO.IconButtonsWithStyle.IconButtonWithSelected> {
    public static final int $stable = 8;
    private volatile Constructor<AiMessageActionsDTO.IconButtonsWithStyle.IconButtonWithSelected> constructorRef;

    @NotNull
    private final JsonAdapter<IconButtonV3DTO> iconButtonV3DTOAdapter;

    @NotNull
    private final JsonAdapter<Boolean> nullableBooleanAdapter;

    @NotNull
    private final n.a options;

    public AiMessageActionsDTO_IconButtonsWithStyle_IconButtonWithSelectedJsonAdapter(@NotNull Moshi moshi) {
        Intrinsics.checkNotNullParameter(moshi, "moshi");
        n.a a11 = n.a.C0918a.a("icon", "isSelected");
        Intrinsics.checkNotNullExpressionValue(a11, "of(...)");
        this.options = a11;
        M m11 = M.f71699a;
        JsonAdapter<IconButtonV3DTO> f7 = moshi.f(IconButtonV3DTO.class, m11, "icon");
        Intrinsics.checkNotNullExpressionValue(f7, "adapter(...)");
        this.iconButtonV3DTOAdapter = f7;
        JsonAdapter<Boolean> f11 = moshi.f(Boolean.class, m11, "isSelected");
        Intrinsics.checkNotNullExpressionValue(f11, "adapter(...)");
        this.nullableBooleanAdapter = f11;
    }

    @NotNull
    public String toString() {
        return Ak.b.c(85, "GeneratedJsonAdapter(AiMessageActionsDTO.IconButtonsWithStyle.IconButtonWithSelected)", "toString(...)");
    }

    @Override // com.squareup.moshi.JsonAdapter
    @NotNull
    public AiMessageActionsDTO.IconButtonsWithStyle.IconButtonWithSelected fromJson(@NotNull n reader) {
        Intrinsics.checkNotNullParameter(reader, "reader");
        reader.beginObject();
        IconButtonV3DTO iconButtonV3DTO = null;
        Boolean bool = null;
        int i11 = -1;
        while (reader.hasNext()) {
            int v11 = reader.v(this.options);
            if (v11 == -1) {
                reader.y();
                reader.skipValue();
            } else if (v11 == 0) {
                iconButtonV3DTO = this.iconButtonV3DTOAdapter.fromJson(reader);
                if (iconButtonV3DTO == null) {
                    throw Y9.c.q("icon", "icon", reader);
                }
            } else if (v11 == 1) {
                bool = this.nullableBooleanAdapter.fromJson(reader);
                i11 = -3;
            }
        }
        reader.endObject();
        if (i11 == -3) {
            if (iconButtonV3DTO != null) {
                return new AiMessageActionsDTO.IconButtonsWithStyle.IconButtonWithSelected(iconButtonV3DTO, bool);
            }
            throw Y9.c.j("icon", "icon", reader);
        }
        Constructor<AiMessageActionsDTO.IconButtonsWithStyle.IconButtonWithSelected> constructor = this.constructorRef;
        if (constructor == null) {
            constructor = AiMessageActionsDTO.IconButtonsWithStyle.IconButtonWithSelected.class.getDeclaredConstructor(IconButtonV3DTO.class, Boolean.class, Integer.TYPE, Y9.c.f34864d);
            this.constructorRef = constructor;
            Intrinsics.checkNotNullExpressionValue(constructor, "also(...)");
        }
        if (iconButtonV3DTO == null) {
            throw Y9.c.j("icon", "icon", reader);
        }
        AiMessageActionsDTO.IconButtonsWithStyle.IconButtonWithSelected newInstance = constructor.newInstance(iconButtonV3DTO, bool, Integer.valueOf(i11), null);
        Intrinsics.checkNotNullExpressionValue(newInstance, "newInstance(...)");
        return newInstance;
    }

    @Override // com.squareup.moshi.JsonAdapter
    /* renamed from: toJson, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
    public void mo44toJson(@NotNull x writer, AiMessageActionsDTO.IconButtonsWithStyle.IconButtonWithSelected value_) {
        Intrinsics.checkNotNullParameter(writer, "writer");
        if (value_ == null) {
            throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
        }
        writer.j();
        writer.w("icon");
        this.iconButtonV3DTOAdapter.mo44toJson(writer, (x) value_.getIcon());
        writer.w("isSelected");
        this.nullableBooleanAdapter.mo44toJson(writer, (x) value_.isSelected());
        writer.p();
    }
}
