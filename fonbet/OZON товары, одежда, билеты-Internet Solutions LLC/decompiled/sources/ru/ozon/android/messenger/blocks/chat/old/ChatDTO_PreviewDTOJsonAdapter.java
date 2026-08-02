package ru.ozon.android.messenger.blocks.chat.old;

import com.google.android.gms.common.internal.ImagesContract;
import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.Moshi;
import com.squareup.moshi.n;
import com.squareup.moshi.x;
import java.lang.reflect.Constructor;
import kotlin.Metadata;
import kotlin.collections.M;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.joda.time.DateTime;
import ru.ozon.android.messenger.blocks.chat.old.ChatDTO;
import ru.ozon.uni.atoms.data.button.Icon;

@Metadata(d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\f\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\f\u0010\rJ!\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000f\u001a\u00020\u000e2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u001c\u0010\u0017\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u001c\u0010\u001a\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00190\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u0018R\u001a\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u001b0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u0018R\u001c\u0010\u001e\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001d0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u0018R\u001c\u0010 \u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001f0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010\u0018R\u001e\u0010\"\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010!8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\"\u0010#¨\u0006$"}, d2 = {"Lru/ozon/android/messenger/blocks/chat/old/ChatDTO_PreviewDTOJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lru/ozon/android/messenger/blocks/chat/old/ChatDTO$PreviewDTO;", "Lcom/squareup/moshi/Moshi;", "moshi", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "", "toString", "()Ljava/lang/String;", "Lcom/squareup/moshi/n;", "reader", "fromJson", "(Lcom/squareup/moshi/n;)Lru/ozon/android/messenger/blocks/chat/old/ChatDTO$PreviewDTO;", "Lcom/squareup/moshi/x;", "writer", "value_", "", "toJson", "(Lcom/squareup/moshi/x;Lru/ozon/android/messenger/blocks/chat/old/ChatDTO$PreviewDTO;)V", "Lcom/squareup/moshi/n$a;", "options", "Lcom/squareup/moshi/n$a;", "nullableStringAdapter", "Lcom/squareup/moshi/JsonAdapter;", "Lru/ozon/uni/atoms/data/button/Icon;", "nullableIconAdapter", "Lorg/joda/time/DateTime;", "dateTimeAdapter", "Lru/ozon/android/messenger/blocks/chat/old/ChatDTO$PreviewDTO$a;", "nullableStatusDTOAdapter", "Lru/ozon/android/messenger/blocks/chat/common/f;", "nullableChatStatusAdapter", "Ljava/lang/reflect/Constructor;", "constructorRef", "Ljava/lang/reflect/Constructor;", "messenger_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class ChatDTO_PreviewDTOJsonAdapter extends JsonAdapter<ChatDTO.PreviewDTO> {
    public static final int $stable = 8;
    private volatile Constructor<ChatDTO.PreviewDTO> constructorRef;

    @NotNull
    private final JsonAdapter<DateTime> dateTimeAdapter;

    @NotNull
    private final JsonAdapter<ru.ozon.android.messenger.blocks.chat.common.f> nullableChatStatusAdapter;

    @NotNull
    private final JsonAdapter<Icon> nullableIconAdapter;

    @NotNull
    private final JsonAdapter<ChatDTO.PreviewDTO.a> nullableStatusDTOAdapter;

    @NotNull
    private final JsonAdapter<String> nullableStringAdapter;

    @NotNull
    private final n.a options;

    public ChatDTO_PreviewDTOJsonAdapter(@NotNull Moshi moshi) {
        Intrinsics.checkNotNullParameter(moshi, "moshi");
        n.a a11 = n.a.C0918a.a("text", "icon", ImagesContract.URL, "date", "status", "chatStatus");
        Intrinsics.checkNotNullExpressionValue(a11, "of(...)");
        this.options = a11;
        M m11 = M.f71699a;
        JsonAdapter<String> f7 = moshi.f(String.class, m11, "text");
        Intrinsics.checkNotNullExpressionValue(f7, "adapter(...)");
        this.nullableStringAdapter = f7;
        JsonAdapter<Icon> f11 = moshi.f(Icon.class, m11, "icon");
        Intrinsics.checkNotNullExpressionValue(f11, "adapter(...)");
        this.nullableIconAdapter = f11;
        JsonAdapter<DateTime> f12 = moshi.f(DateTime.class, m11, "date");
        Intrinsics.checkNotNullExpressionValue(f12, "adapter(...)");
        this.dateTimeAdapter = f12;
        JsonAdapter<ChatDTO.PreviewDTO.a> f13 = moshi.f(ChatDTO.PreviewDTO.a.class, m11, "status");
        Intrinsics.checkNotNullExpressionValue(f13, "adapter(...)");
        this.nullableStatusDTOAdapter = f13;
        JsonAdapter<ru.ozon.android.messenger.blocks.chat.common.f> f14 = moshi.f(ru.ozon.android.messenger.blocks.chat.common.f.class, m11, "chatStatus");
        Intrinsics.checkNotNullExpressionValue(f14, "adapter(...)");
        this.nullableChatStatusAdapter = f14;
    }

    @NotNull
    public String toString() {
        return Ak.b.c(40, "GeneratedJsonAdapter(ChatDTO.PreviewDTO)", "toString(...)");
    }

    @Override // com.squareup.moshi.JsonAdapter
    @NotNull
    public ChatDTO.PreviewDTO fromJson(@NotNull n reader) {
        Intrinsics.checkNotNullParameter(reader, "reader");
        reader.beginObject();
        int i11 = -1;
        String str = null;
        Icon icon = null;
        String str2 = null;
        DateTime dateTime = null;
        ChatDTO.PreviewDTO.a aVar = null;
        ru.ozon.android.messenger.blocks.chat.common.f fVar = null;
        while (reader.hasNext()) {
            switch (reader.v(this.options)) {
                case -1:
                    reader.y();
                    reader.skipValue();
                    break;
                case 0:
                    str = this.nullableStringAdapter.fromJson(reader);
                    break;
                case 1:
                    icon = this.nullableIconAdapter.fromJson(reader);
                    i11 &= -3;
                    break;
                case 2:
                    str2 = this.nullableStringAdapter.fromJson(reader);
                    i11 &= -5;
                    break;
                case 3:
                    dateTime = this.dateTimeAdapter.fromJson(reader);
                    if (dateTime == null) {
                        throw Y9.c.q("date", "date", reader);
                    }
                    break;
                case 4:
                    aVar = this.nullableStatusDTOAdapter.fromJson(reader);
                    break;
                case 5:
                    fVar = this.nullableChatStatusAdapter.fromJson(reader);
                    break;
            }
        }
        reader.endObject();
        if (i11 == -7) {
            ru.ozon.android.messenger.blocks.chat.common.f fVar2 = fVar;
            ChatDTO.PreviewDTO.a aVar2 = aVar;
            DateTime dateTime2 = dateTime;
            String str3 = str2;
            Icon icon2 = icon;
            String str4 = str;
            if (dateTime2 != null) {
                return new ChatDTO.PreviewDTO(str4, icon2, str3, dateTime2, aVar2, fVar2);
            }
            throw Y9.c.j("date", "date", reader);
        }
        ru.ozon.android.messenger.blocks.chat.common.f fVar3 = fVar;
        ChatDTO.PreviewDTO.a aVar3 = aVar;
        DateTime dateTime3 = dateTime;
        String str5 = str2;
        Icon icon3 = icon;
        String str6 = str;
        Constructor<ChatDTO.PreviewDTO> constructor = this.constructorRef;
        if (constructor == null) {
            constructor = ChatDTO.PreviewDTO.class.getDeclaredConstructor(String.class, Icon.class, String.class, DateTime.class, ChatDTO.PreviewDTO.a.class, ru.ozon.android.messenger.blocks.chat.common.f.class, Integer.TYPE, Y9.c.f34864d);
            this.constructorRef = constructor;
            Intrinsics.checkNotNullExpressionValue(constructor, "also(...)");
        }
        if (dateTime3 == null) {
            throw Y9.c.j("date", "date", reader);
        }
        ChatDTO.PreviewDTO newInstance = constructor.newInstance(str6, icon3, str5, dateTime3, aVar3, fVar3, Integer.valueOf(i11), null);
        Intrinsics.checkNotNullExpressionValue(newInstance, "newInstance(...)");
        return newInstance;
    }

    @Override // com.squareup.moshi.JsonAdapter
    /* renamed from: toJson, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
    public void mo44toJson(@NotNull x writer, ChatDTO.PreviewDTO value_) {
        Intrinsics.checkNotNullParameter(writer, "writer");
        if (value_ == null) {
            throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
        }
        writer.j();
        writer.w("text");
        this.nullableStringAdapter.mo44toJson(writer, (x) value_.getText());
        writer.w("icon");
        this.nullableIconAdapter.mo44toJson(writer, (x) value_.getIcon());
        writer.w(ImagesContract.URL);
        this.nullableStringAdapter.mo44toJson(writer, (x) value_.getUrl());
        writer.w("date");
        this.dateTimeAdapter.mo44toJson(writer, (x) value_.getDate());
        writer.w("status");
        this.nullableStatusDTOAdapter.mo44toJson(writer, (x) value_.getStatus());
        writer.w("chatStatus");
        this.nullableChatStatusAdapter.mo44toJson(writer, (x) value_.getChatStatus());
        writer.p();
    }
}
