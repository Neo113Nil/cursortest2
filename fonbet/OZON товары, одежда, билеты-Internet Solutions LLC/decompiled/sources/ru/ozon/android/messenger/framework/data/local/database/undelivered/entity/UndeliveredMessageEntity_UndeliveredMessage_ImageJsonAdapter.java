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
import ru.ozon.android.messenger.blocks.messageimage.ImageDTO;
import ru.ozon.android.messenger.framework.data.local.database.undelivered.entity.UndeliveredMessageEntity;
import ru.ozon.android.messenger.framework.data.remote.models.blocks.BlockDTO;

@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\f\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\f\u0010\rJ!\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000f\u001a\u00020\u000e2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u001a\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00070\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u001c\u0010\u0019\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u0018R\u001a\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u001a0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u0018R\u001c\u0010\u001d\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001c0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u0018R\u001e\u0010\u001f\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u001e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001f\u0010 ¨\u0006!"}, d2 = {"Lru/ozon/android/messenger/framework/data/local/database/undelivered/entity/UndeliveredMessageEntity_UndeliveredMessage_ImageJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lru/ozon/android/messenger/framework/data/local/database/undelivered/entity/UndeliveredMessageEntity$UndeliveredMessage$Image;", "Lcom/squareup/moshi/Moshi;", "moshi", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "", "toString", "()Ljava/lang/String;", "Lcom/squareup/moshi/n;", "reader", "fromJson", "(Lcom/squareup/moshi/n;)Lru/ozon/android/messenger/framework/data/local/database/undelivered/entity/UndeliveredMessageEntity$UndeliveredMessage$Image;", "Lcom/squareup/moshi/x;", "writer", "value_", "", "toJson", "(Lcom/squareup/moshi/x;Lru/ozon/android/messenger/framework/data/local/database/undelivered/entity/UndeliveredMessageEntity$UndeliveredMessage$Image;)V", "Lcom/squareup/moshi/n$a;", "options", "Lcom/squareup/moshi/n$a;", "stringAdapter", "Lcom/squareup/moshi/JsonAdapter;", "nullableStringAdapter", "Lru/ozon/android/messenger/blocks/messageimage/ImageDTO;", "imageDTOAdapter", "Lru/ozon/android/messenger/framework/data/remote/models/blocks/BlockDTO;", "nullableBlockDTOAdapter", "Ljava/lang/reflect/Constructor;", "constructorRef", "Ljava/lang/reflect/Constructor;", "messenger_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class UndeliveredMessageEntity_UndeliveredMessage_ImageJsonAdapter extends JsonAdapter<UndeliveredMessageEntity.UndeliveredMessage.Image> {
    public static final int $stable = 8;
    private volatile Constructor<UndeliveredMessageEntity.UndeliveredMessage.Image> constructorRef;

    @NotNull
    private final JsonAdapter<ImageDTO> imageDTOAdapter;

    @NotNull
    private final JsonAdapter<BlockDTO> nullableBlockDTOAdapter;

    @NotNull
    private final JsonAdapter<String> nullableStringAdapter;

    @NotNull
    private final n.a options;

    @NotNull
    private final JsonAdapter<String> stringAdapter;

    public UndeliveredMessageEntity_UndeliveredMessage_ImageJsonAdapter(@NotNull Moshi moshi) {
        Intrinsics.checkNotNullParameter(moshi, "moshi");
        n.a a11 = n.a.C0918a.a("localUriString", "remoteUrlString", "imageDTO", "replyToMessageId", "localMessageBlock");
        Intrinsics.checkNotNullExpressionValue(a11, "of(...)");
        this.options = a11;
        M m11 = M.f71699a;
        JsonAdapter<String> f7 = moshi.f(String.class, m11, "localUriString");
        Intrinsics.checkNotNullExpressionValue(f7, "adapter(...)");
        this.stringAdapter = f7;
        JsonAdapter<String> f11 = moshi.f(String.class, m11, "remoteUrlString");
        Intrinsics.checkNotNullExpressionValue(f11, "adapter(...)");
        this.nullableStringAdapter = f11;
        JsonAdapter<ImageDTO> f12 = moshi.f(ImageDTO.class, m11, "imageDTO");
        Intrinsics.checkNotNullExpressionValue(f12, "adapter(...)");
        this.imageDTOAdapter = f12;
        JsonAdapter<BlockDTO> f13 = moshi.f(BlockDTO.class, m11, "localMessageBlock");
        Intrinsics.checkNotNullExpressionValue(f13, "adapter(...)");
        this.nullableBlockDTOAdapter = f13;
    }

    @NotNull
    public String toString() {
        return b.c(71, "GeneratedJsonAdapter(UndeliveredMessageEntity.UndeliveredMessage.Image)", "toString(...)");
    }

    @Override // com.squareup.moshi.JsonAdapter
    @NotNull
    public UndeliveredMessageEntity.UndeliveredMessage.Image fromJson(@NotNull n reader) {
        Intrinsics.checkNotNullParameter(reader, "reader");
        reader.beginObject();
        String str = null;
        String str2 = null;
        ImageDTO imageDTO = null;
        String str3 = null;
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
                    throw c.q("localUriString", "localUriString", reader);
                }
            } else if (v11 == 1) {
                str2 = this.nullableStringAdapter.fromJson(reader);
                i11 &= -3;
            } else if (v11 == 2) {
                imageDTO = this.imageDTOAdapter.fromJson(reader);
                if (imageDTO == null) {
                    throw c.q("imageDTO", "imageDTO", reader);
                }
            } else if (v11 == 3) {
                str3 = this.nullableStringAdapter.fromJson(reader);
                i11 &= -9;
            } else if (v11 == 4) {
                blockDTO = this.nullableBlockDTOAdapter.fromJson(reader);
                i11 &= -17;
            }
        }
        reader.endObject();
        if (i11 == -27) {
            BlockDTO blockDTO2 = blockDTO;
            String str4 = str3;
            ImageDTO imageDTO2 = imageDTO;
            String str5 = str2;
            String str6 = str;
            if (str6 == null) {
                throw c.j("localUriString", "localUriString", reader);
            }
            if (imageDTO2 != null) {
                return new UndeliveredMessageEntity.UndeliveredMessage.Image(str6, str5, imageDTO2, str4, blockDTO2);
            }
            throw c.j("imageDTO", "imageDTO", reader);
        }
        BlockDTO blockDTO3 = blockDTO;
        String str7 = str3;
        ImageDTO imageDTO3 = imageDTO;
        String str8 = str2;
        String str9 = str;
        Constructor<UndeliveredMessageEntity.UndeliveredMessage.Image> constructor = this.constructorRef;
        if (constructor == null) {
            constructor = UndeliveredMessageEntity.UndeliveredMessage.Image.class.getDeclaredConstructor(String.class, String.class, ImageDTO.class, String.class, BlockDTO.class, Integer.TYPE, c.f34864d);
            this.constructorRef = constructor;
            Intrinsics.checkNotNullExpressionValue(constructor, "also(...)");
        }
        if (str9 == null) {
            throw c.j("localUriString", "localUriString", reader);
        }
        if (imageDTO3 == null) {
            throw c.j("imageDTO", "imageDTO", reader);
        }
        UndeliveredMessageEntity.UndeliveredMessage.Image newInstance = constructor.newInstance(str9, str8, imageDTO3, str7, blockDTO3, Integer.valueOf(i11), null);
        Intrinsics.checkNotNullExpressionValue(newInstance, "newInstance(...)");
        return newInstance;
    }

    @Override // com.squareup.moshi.JsonAdapter
    /* renamed from: toJson, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
    public void mo44toJson(@NotNull x writer, UndeliveredMessageEntity.UndeliveredMessage.Image value_) {
        Intrinsics.checkNotNullParameter(writer, "writer");
        if (value_ == null) {
            throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
        }
        writer.j();
        writer.w("localUriString");
        this.stringAdapter.mo44toJson(writer, (x) value_.getLocalUriString());
        writer.w("remoteUrlString");
        this.nullableStringAdapter.mo44toJson(writer, (x) value_.getRemoteUrlString());
        writer.w("imageDTO");
        this.imageDTOAdapter.mo44toJson(writer, (x) value_.getImageDTO());
        writer.w("replyToMessageId");
        this.nullableStringAdapter.mo44toJson(writer, (x) value_.getReplyToMessageId());
        writer.w("localMessageBlock");
        this.nullableBlockDTOAdapter.mo44toJson(writer, (x) value_.getLocalMessageBlock());
        writer.p();
    }
}
