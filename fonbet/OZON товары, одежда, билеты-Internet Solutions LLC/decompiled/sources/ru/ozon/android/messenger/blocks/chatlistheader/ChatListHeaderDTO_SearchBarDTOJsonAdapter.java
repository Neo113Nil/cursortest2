package ru.ozon.android.messenger.blocks.chatlistheader;

import com.squareup.moshi.D;
import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.Moshi;
import com.squareup.moshi.n;
import com.squareup.moshi.x;
import java.lang.reflect.Constructor;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.M;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.messenger.blocks.chatlistheader.ChatListHeaderDTO;
import ru.ozon.android.messenger.framework.analytics.MessengerTrackingInfo;
import ru.ozon.uni.atoms.data.controls.button.ButtonV3DTO;
import ru.ozon.uni.atoms.data.icon.IconDTO;
import ru.ozon.uni.atoms.data.text.TextDTO;

@Metadata(d1 = {"\u0000v\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\f\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\f\u0010\rJ!\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000f\u001a\u00020\u000e2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u001a\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00170\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u001a\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u001a0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u0019R\u001c\u0010\u001c\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001a0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u0019R\u001c\u0010\u001e\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001d0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u0019R\u001c\u0010 \u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001f0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010\u0019R\u001c\u0010\"\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010!0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010\u0019R\u001c\u0010$\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010#0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u0010\u0019R(\u0010'\u001a\u0016\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020&\u0018\u00010%0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b'\u0010\u0019R\u001e\u0010)\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010(8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b)\u0010*¨\u0006+"}, d2 = {"Lru/ozon/android/messenger/blocks/chatlistheader/ChatListHeaderDTO_SearchBarDTOJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lru/ozon/android/messenger/blocks/chatlistheader/ChatListHeaderDTO$SearchBarDTO;", "Lcom/squareup/moshi/Moshi;", "moshi", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "", "toString", "()Ljava/lang/String;", "Lcom/squareup/moshi/n;", "reader", "fromJson", "(Lcom/squareup/moshi/n;)Lru/ozon/android/messenger/blocks/chatlistheader/ChatListHeaderDTO$SearchBarDTO;", "Lcom/squareup/moshi/x;", "writer", "value_", "", "toJson", "(Lcom/squareup/moshi/x;Lru/ozon/android/messenger/blocks/chatlistheader/ChatListHeaderDTO$SearchBarDTO;)V", "Lcom/squareup/moshi/n$a;", "options", "Lcom/squareup/moshi/n$a;", "Lru/ozon/uni/atoms/data/icon/IconDTO;", "iconDTOAdapter", "Lcom/squareup/moshi/JsonAdapter;", "Lru/ozon/uni/atoms/data/text/TextDTO;", "textDTOAdapter", "nullableTextDTOAdapter", "Lru/ozon/uni/atoms/data/controls/button/ButtonV3DTO;", "nullableButtonV3DTOAdapter", "", "nullableLongAdapter", "", "nullableIntAdapter", "Lru/ozon/android/messenger/blocks/chatlistheader/ChatListHeaderDTO$SearchBarDTO$ClearIconDTO;", "nullableClearIconDTOAdapter", "", "Lru/ozon/android/messenger/framework/analytics/MessengerTrackingInfo;", "nullableMapOfStringMessengerTrackingInfoAdapter", "Ljava/lang/reflect/Constructor;", "constructorRef", "Ljava/lang/reflect/Constructor;", "messenger_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class ChatListHeaderDTO_SearchBarDTOJsonAdapter extends JsonAdapter<ChatListHeaderDTO.SearchBarDTO> {
    public static final int $stable = 8;
    private volatile Constructor<ChatListHeaderDTO.SearchBarDTO> constructorRef;

    @NotNull
    private final JsonAdapter<IconDTO> iconDTOAdapter;

    @NotNull
    private final JsonAdapter<ButtonV3DTO> nullableButtonV3DTOAdapter;

    @NotNull
    private final JsonAdapter<ChatListHeaderDTO.SearchBarDTO.ClearIconDTO> nullableClearIconDTOAdapter;

    @NotNull
    private final JsonAdapter<Integer> nullableIntAdapter;

    @NotNull
    private final JsonAdapter<Long> nullableLongAdapter;

    @NotNull
    private final JsonAdapter<Map<String, MessengerTrackingInfo>> nullableMapOfStringMessengerTrackingInfoAdapter;

    @NotNull
    private final JsonAdapter<TextDTO> nullableTextDTOAdapter;

    @NotNull
    private final n.a options;

    @NotNull
    private final JsonAdapter<TextDTO> textDTOAdapter;

    public ChatListHeaderDTO_SearchBarDTOJsonAdapter(@NotNull Moshi moshi) {
        Intrinsics.checkNotNullParameter(moshi, "moshi");
        n.a a11 = n.a.C0918a.a("leftIcon", "hint", "text", "cancelButton", "debounceMillis", "cornerRadius", "minSearchQueryTextLength", "maxSearchQueryTextLength", "clearIcon", "trackingInfo");
        Intrinsics.checkNotNullExpressionValue(a11, "of(...)");
        this.options = a11;
        M m11 = M.f71699a;
        JsonAdapter<IconDTO> f7 = moshi.f(IconDTO.class, m11, "leftIcon");
        Intrinsics.checkNotNullExpressionValue(f7, "adapter(...)");
        this.iconDTOAdapter = f7;
        JsonAdapter<TextDTO> f11 = moshi.f(TextDTO.class, m11, "hint");
        Intrinsics.checkNotNullExpressionValue(f11, "adapter(...)");
        this.textDTOAdapter = f11;
        JsonAdapter<TextDTO> f12 = moshi.f(TextDTO.class, m11, "text");
        Intrinsics.checkNotNullExpressionValue(f12, "adapter(...)");
        this.nullableTextDTOAdapter = f12;
        JsonAdapter<ButtonV3DTO> f13 = moshi.f(ButtonV3DTO.class, m11, "cancelButton");
        Intrinsics.checkNotNullExpressionValue(f13, "adapter(...)");
        this.nullableButtonV3DTOAdapter = f13;
        JsonAdapter<Long> f14 = moshi.f(Long.class, m11, "debounceMillis");
        Intrinsics.checkNotNullExpressionValue(f14, "adapter(...)");
        this.nullableLongAdapter = f14;
        JsonAdapter<Integer> f15 = moshi.f(Integer.class, m11, "cornerRadius");
        Intrinsics.checkNotNullExpressionValue(f15, "adapter(...)");
        this.nullableIntAdapter = f15;
        JsonAdapter<ChatListHeaderDTO.SearchBarDTO.ClearIconDTO> f16 = moshi.f(ChatListHeaderDTO.SearchBarDTO.ClearIconDTO.class, m11, "clearIcon");
        Intrinsics.checkNotNullExpressionValue(f16, "adapter(...)");
        this.nullableClearIconDTOAdapter = f16;
        JsonAdapter<Map<String, MessengerTrackingInfo>> f17 = moshi.f(D.e(Map.class, String.class, MessengerTrackingInfo.class), m11, "trackingInfo");
        Intrinsics.checkNotNullExpressionValue(f17, "adapter(...)");
        this.nullableMapOfStringMessengerTrackingInfoAdapter = f17;
    }

    @NotNull
    public String toString() {
        return Ak.b.c(52, "GeneratedJsonAdapter(ChatListHeaderDTO.SearchBarDTO)", "toString(...)");
    }

    @Override // com.squareup.moshi.JsonAdapter
    @NotNull
    public ChatListHeaderDTO.SearchBarDTO fromJson(@NotNull n reader) {
        int i11;
        Intrinsics.checkNotNullParameter(reader, "reader");
        reader.beginObject();
        int i12 = -1;
        IconDTO iconDTO = null;
        TextDTO textDTO = null;
        TextDTO textDTO2 = null;
        ButtonV3DTO buttonV3DTO = null;
        Long l11 = null;
        Integer num = null;
        Integer num2 = null;
        Integer num3 = null;
        ChatListHeaderDTO.SearchBarDTO.ClearIconDTO clearIconDTO = null;
        Map<String, MessengerTrackingInfo> map = null;
        while (reader.hasNext()) {
            switch (reader.v(this.options)) {
                case -1:
                    reader.y();
                    reader.skipValue();
                    break;
                case 0:
                    iconDTO = this.iconDTOAdapter.fromJson(reader);
                    if (iconDTO == null) {
                        throw Y9.c.q("leftIcon", "leftIcon", reader);
                    }
                    break;
                case 1:
                    textDTO = this.textDTOAdapter.fromJson(reader);
                    if (textDTO == null) {
                        throw Y9.c.q("hint", "hint", reader);
                    }
                    break;
                case 2:
                    textDTO2 = this.nullableTextDTOAdapter.fromJson(reader);
                    break;
                case 3:
                    buttonV3DTO = this.nullableButtonV3DTOAdapter.fromJson(reader);
                    break;
                case 4:
                    l11 = this.nullableLongAdapter.fromJson(reader);
                    break;
                case 5:
                    num = this.nullableIntAdapter.fromJson(reader);
                    break;
                case 6:
                    num2 = this.nullableIntAdapter.fromJson(reader);
                    break;
                case 7:
                    num3 = this.nullableIntAdapter.fromJson(reader);
                    break;
                case 8:
                    clearIconDTO = this.nullableClearIconDTOAdapter.fromJson(reader);
                    break;
                case 9:
                    map = this.nullableMapOfStringMessengerTrackingInfoAdapter.fromJson(reader);
                    i12 = -513;
                    break;
            }
        }
        reader.endObject();
        if (i12 == -513) {
            ChatListHeaderDTO.SearchBarDTO.ClearIconDTO clearIconDTO2 = clearIconDTO;
            Integer num4 = num3;
            Integer num5 = num2;
            Integer num6 = num;
            Long l12 = l11;
            ButtonV3DTO buttonV3DTO2 = buttonV3DTO;
            TextDTO textDTO3 = textDTO2;
            TextDTO textDTO4 = textDTO;
            IconDTO iconDTO2 = iconDTO;
            if (iconDTO2 == null) {
                throw Y9.c.j("leftIcon", "leftIcon", reader);
            }
            if (textDTO4 != null) {
                return new ChatListHeaderDTO.SearchBarDTO(iconDTO2, textDTO4, textDTO3, buttonV3DTO2, l12, num6, num5, num4, clearIconDTO2, map);
            }
            throw Y9.c.j("hint", "hint", reader);
        }
        ChatListHeaderDTO.SearchBarDTO.ClearIconDTO clearIconDTO3 = clearIconDTO;
        Integer num7 = num3;
        Integer num8 = num2;
        Integer num9 = num;
        Long l13 = l11;
        ButtonV3DTO buttonV3DTO3 = buttonV3DTO;
        TextDTO textDTO5 = textDTO2;
        TextDTO textDTO6 = textDTO;
        IconDTO iconDTO3 = iconDTO;
        Constructor<ChatListHeaderDTO.SearchBarDTO> constructor = this.constructorRef;
        if (constructor == null) {
            i11 = i12;
            constructor = ChatListHeaderDTO.SearchBarDTO.class.getDeclaredConstructor(IconDTO.class, TextDTO.class, TextDTO.class, ButtonV3DTO.class, Long.class, Integer.class, Integer.class, Integer.class, ChatListHeaderDTO.SearchBarDTO.ClearIconDTO.class, Map.class, Integer.TYPE, Y9.c.f34864d);
            this.constructorRef = constructor;
            Intrinsics.checkNotNullExpressionValue(constructor, "also(...)");
        } else {
            i11 = i12;
        }
        Constructor<ChatListHeaderDTO.SearchBarDTO> constructor2 = constructor;
        if (iconDTO3 == null) {
            throw Y9.c.j("leftIcon", "leftIcon", reader);
        }
        if (textDTO6 == null) {
            throw Y9.c.j("hint", "hint", reader);
        }
        ChatListHeaderDTO.SearchBarDTO newInstance = constructor2.newInstance(iconDTO3, textDTO6, textDTO5, buttonV3DTO3, l13, num9, num8, num7, clearIconDTO3, map, Integer.valueOf(i11), null);
        Intrinsics.checkNotNullExpressionValue(newInstance, "newInstance(...)");
        return newInstance;
    }

    @Override // com.squareup.moshi.JsonAdapter
    /* renamed from: toJson, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
    public void mo44toJson(@NotNull x writer, ChatListHeaderDTO.SearchBarDTO value_) {
        Intrinsics.checkNotNullParameter(writer, "writer");
        if (value_ == null) {
            throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
        }
        writer.j();
        writer.w("leftIcon");
        this.iconDTOAdapter.mo44toJson(writer, (x) value_.getLeftIcon());
        writer.w("hint");
        this.textDTOAdapter.mo44toJson(writer, (x) value_.getHint());
        writer.w("text");
        this.nullableTextDTOAdapter.mo44toJson(writer, (x) value_.getText());
        writer.w("cancelButton");
        this.nullableButtonV3DTOAdapter.mo44toJson(writer, (x) value_.getCancelButton());
        writer.w("debounceMillis");
        this.nullableLongAdapter.mo44toJson(writer, (x) value_.getDebounceMillis());
        writer.w("cornerRadius");
        this.nullableIntAdapter.mo44toJson(writer, (x) value_.getCornerRadius());
        writer.w("minSearchQueryTextLength");
        this.nullableIntAdapter.mo44toJson(writer, (x) value_.getMinSearchQueryTextLength());
        writer.w("maxSearchQueryTextLength");
        this.nullableIntAdapter.mo44toJson(writer, (x) value_.getMaxSearchQueryTextLength());
        writer.w("clearIcon");
        this.nullableClearIconDTOAdapter.mo44toJson(writer, (x) value_.getClearIcon());
        writer.w("trackingInfo");
        this.nullableMapOfStringMessengerTrackingInfoAdapter.mo44toJson(writer, (x) value_.getTrackingInfo());
        writer.p();
    }
}
