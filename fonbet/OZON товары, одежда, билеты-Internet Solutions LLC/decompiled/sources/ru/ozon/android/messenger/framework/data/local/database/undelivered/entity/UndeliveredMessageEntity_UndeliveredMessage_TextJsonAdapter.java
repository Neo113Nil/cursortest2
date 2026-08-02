package ru.ozon.android.messenger.framework.data.local.database.undelivered.entity;

import Ak.b;
import Y9.c;
import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.Moshi;
import com.squareup.moshi.n;
import com.squareup.moshi.x;
import java.lang.reflect.Constructor;
import kotlin.Metadata;
import kotlin.collections.M;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.messenger.blocks.input.CustomBlockDTO;
import ru.ozon.android.messenger.framework.data.local.database.undelivered.entity.UndeliveredMessageEntity;
import ru.ozon.android.messenger.framework.data.remote.models.blocks.BlockDTO;

@Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\f\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\f\u0010\rJ!\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000f\u001a\u00020\u000e2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u001a\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00070\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u001c\u0010\u001a\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00190\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u0018R\u001c\u0010\u001b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u0018R\u001c\u0010\u001d\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001c0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u0018R\u001e\u0010\u001f\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u001e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001f\u0010 ¨\u0006!"}, d2 = {"Lru/ozon/android/messenger/framework/data/local/database/undelivered/entity/UndeliveredMessageEntity_UndeliveredMessage_TextJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lru/ozon/android/messenger/framework/data/local/database/undelivered/entity/UndeliveredMessageEntity$UndeliveredMessage$Text;", "Lcom/squareup/moshi/Moshi;", "moshi", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "", "toString", "()Ljava/lang/String;", "Lcom/squareup/moshi/n;", "reader", "fromJson", "(Lcom/squareup/moshi/n;)Lru/ozon/android/messenger/framework/data/local/database/undelivered/entity/UndeliveredMessageEntity$UndeliveredMessage$Text;", "Lcom/squareup/moshi/x;", "writer", "value_", "", "toJson", "(Lcom/squareup/moshi/x;Lru/ozon/android/messenger/framework/data/local/database/undelivered/entity/UndeliveredMessageEntity$UndeliveredMessage$Text;)V", "Lcom/squareup/moshi/n$a;", "options", "Lcom/squareup/moshi/n$a;", "stringAdapter", "Lcom/squareup/moshi/JsonAdapter;", "Lru/ozon/android/messenger/blocks/input/CustomBlockDTO;", "nullableCustomBlockDTOAdapter", "nullableStringAdapter", "Lru/ozon/android/messenger/framework/data/remote/models/blocks/BlockDTO;", "nullableBlockDTOAdapter", "Ljava/lang/reflect/Constructor;", "constructorRef", "Ljava/lang/reflect/Constructor;", "messenger_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class UndeliveredMessageEntity_UndeliveredMessage_TextJsonAdapter extends JsonAdapter<UndeliveredMessageEntity.UndeliveredMessage.Text> {
    public static final int $stable = 8;
    private volatile Constructor<UndeliveredMessageEntity.UndeliveredMessage.Text> constructorRef;

    @NotNull
    private final JsonAdapter<BlockDTO> nullableBlockDTOAdapter;

    @NotNull
    private final JsonAdapter<CustomBlockDTO> nullableCustomBlockDTOAdapter;

    @NotNull
    private final JsonAdapter<String> nullableStringAdapter;

    @NotNull
    private final n.a options;

    @NotNull
    private final JsonAdapter<String> stringAdapter;

    public UndeliveredMessageEntity_UndeliveredMessage_TextJsonAdapter(@NotNull Moshi moshi) {
        Intrinsics.checkNotNullParameter(moshi, "moshi");
        n.a a11 = n.a.C0918a.a("messageText", "customBlockDTO", "replyToMessageId", "localMessageBlock");
        Intrinsics.checkNotNullExpressionValue(a11, "of(...)");
        this.options = a11;
        M m11 = M.f71699a;
        JsonAdapter<String> f7 = moshi.f(String.class, m11, "messageText");
        Intrinsics.checkNotNullExpressionValue(f7, "adapter(...)");
        this.stringAdapter = f7;
        JsonAdapter<CustomBlockDTO> f11 = moshi.f(CustomBlockDTO.class, m11, "customBlockDTO");
        Intrinsics.checkNotNullExpressionValue(f11, "adapter(...)");
        this.nullableCustomBlockDTOAdapter = f11;
        JsonAdapter<String> f12 = moshi.f(String.class, m11, "replyToMessageId");
        Intrinsics.checkNotNullExpressionValue(f12, "adapter(...)");
        this.nullableStringAdapter = f12;
        JsonAdapter<BlockDTO> f13 = moshi.f(BlockDTO.class, m11, "localMessageBlock");
        Intrinsics.checkNotNullExpressionValue(f13, "adapter(...)");
        this.nullableBlockDTOAdapter = f13;
    }

    @NotNull
    public String toString() {
        return b.c(70, "GeneratedJsonAdapter(UndeliveredMessageEntity.UndeliveredMessage.Text)", "toString(...)");
    }

    @Override // com.squareup.moshi.JsonAdapter
    @NotNull
    public UndeliveredMessageEntity.UndeliveredMessage.Text fromJson(@NotNull n reader) {
        Intrinsics.checkNotNullParameter(reader, "reader");
        reader.beginObject();
        String str = null;
        CustomBlockDTO customBlockDTO = null;
        String str2 = null;
        BlockDTO blockDTO = null;
        int i11 = -1;
        while (reader.hasNext()) {
            int v11 = reader.v(this.options);
            if (v11 == -1) {
                reader.y();
                reader.skipValue();
            } else if (v11 == 0) {
                str = this.stringAdapter.fromJson(reader);
                if (str == null) {
                    throw c.q("messageText", "messageText", reader);
                }
            } else if (v11 == 1) {
                customBlockDTO = this.nullableCustomBlockDTOAdapter.fromJson(reader);
                i11 &= -3;
            } else if (v11 == 2) {
                str2 = this.nullableStringAdapter.fromJson(reader);
                i11 &= -5;
            } else if (v11 == 3) {
                blockDTO = this.nullableBlockDTOAdapter.fromJson(reader);
                i11 &= -9;
            }
        }
        reader.endObject();
        if (i11 == -15) {
            if (str != null) {
                return new UndeliveredMessageEntity.UndeliveredMessage.Text(str, customBlockDTO, str2, blockDTO);
            }
            throw c.j("messageText", "messageText", reader);
        }
        Constructor<UndeliveredMessageEntity.UndeliveredMessage.Text> constructor = this.constructorRef;
        if (constructor == null) {
            constructor = UndeliveredMessageEntity.UndeliveredMessage.Text.class.getDeclaredConstructor(String.class, CustomBlockDTO.class, String.class, BlockDTO.class, Integer.TYPE, c.f34864d);
            this.constructorRef = constructor;
            Intrinsics.checkNotNullExpressionValue(constructor, "also(...)");
        }
        if (str == null) {
            throw c.j("messageText", "messageText", reader);
        }
        UndeliveredMessageEntity.UndeliveredMessage.Text newInstance = constructor.newInstance(str, customBlockDTO, str2, blockDTO, Integer.valueOf(i11), null);
        Intrinsics.checkNotNullExpressionValue(newInstance, "newInstance(...)");
        return newInstance;
    }

    @Override // com.squareup.moshi.JsonAdapter
    /* renamed from: toJson, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
    public void mo44toJson(@NotNull x writer, UndeliveredMessageEntity.UndeliveredMessage.Text value_) {
        Intrinsics.checkNotNullParameter(writer, "writer");
        if (value_ == null) {
            throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
        }
        writer.j();
        writer.w("messageText");
        this.stringAdapter.mo44toJson(writer, (x) value_.getMessageText());
        writer.w("customBlockDTO");
        this.nullableCustomBlockDTOAdapter.mo44toJson(writer, (x) value_.getCustomBlockDTO());
        writer.w("replyToMessageId");
        this.nullableStringAdapter.mo44toJson(writer, (x) value_.getReplyToMessageId());
        writer.w("localMessageBlock");
        this.nullableBlockDTOAdapter.mo44toJson(writer, (x) value_.getLocalMessageBlock());
        writer.p();
    }
}
