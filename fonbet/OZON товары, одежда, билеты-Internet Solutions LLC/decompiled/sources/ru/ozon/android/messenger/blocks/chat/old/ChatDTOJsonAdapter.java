package ru.ozon.android.messenger.blocks.chat.old;

import com.squareup.moshi.D;
import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.Moshi;
import com.squareup.moshi.n;
import com.squareup.moshi.x;
import java.lang.reflect.Constructor;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.M;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.messenger.blocks.chat.common.UnreadCountIndicatorDTO;
import ru.ozon.android.messenger.blocks.chat.common.menuItems.ContextMenuItemDTO;
import ru.ozon.android.messenger.blocks.chat.old.ChatDTO;
import ru.ozon.android.messenger.framework.data.remote.models.items.ContextMenuDTO;
import ru.ozon.uni.atoms.data.button.Icon;
import ru.ozon.uni.atoms.data.icon.IconDTO;
import ru.ozon.uni.atoms.data.text.TextDTO;

@Metadata(d1 = {"\u0000\u0084\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\f\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\f\u0010\rJ!\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000f\u001a\u00020\u000e2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u001a\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00170\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u001c\u0010\u001b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001a0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u0019R\u001c\u0010\u001d\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001c0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u0019R\u001a\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u001e0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010\u0019R\u001c\u0010 \u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010\u0019R\u001c\u0010\"\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010!0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010\u0019R\"\u0010%\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020$\u0018\u00010#0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b%\u0010\u0019R\u001a\u0010&\u001a\b\u0012\u0004\u0012\u00020\u00070\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b&\u0010\u0019R\"\u0010(\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020'\u0018\u00010#0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b(\u0010\u0019R\u001c\u0010*\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010)0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b*\u0010\u0019R\u001c\u0010,\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010+0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b,\u0010\u0019R\u001e\u0010.\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010-8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b.\u0010/¨\u00060"}, d2 = {"Lru/ozon/android/messenger/blocks/chat/old/ChatDTOJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lru/ozon/android/messenger/blocks/chat/old/ChatDTO;", "Lcom/squareup/moshi/Moshi;", "moshi", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "", "toString", "()Ljava/lang/String;", "Lcom/squareup/moshi/n;", "reader", "fromJson", "(Lcom/squareup/moshi/n;)Lru/ozon/android/messenger/blocks/chat/old/ChatDTO;", "Lcom/squareup/moshi/x;", "writer", "value_", "", "toJson", "(Lcom/squareup/moshi/x;Lru/ozon/android/messenger/blocks/chat/old/ChatDTO;)V", "Lcom/squareup/moshi/n$a;", "options", "Lcom/squareup/moshi/n$a;", "Lru/ozon/uni/atoms/data/text/TextDTO;", "textDTOAdapter", "Lcom/squareup/moshi/JsonAdapter;", "Lru/ozon/uni/atoms/data/icon/IconDTO;", "nullableIconDTOAdapter", "Lru/ozon/android/messenger/blocks/chat/common/a;", "nullableAlignmentDTOAdapter", "Lru/ozon/android/messenger/blocks/chat/common/UnreadCountIndicatorDTO;", "unreadCountIndicatorDTOAdapter", "nullableStringAdapter", "Lru/ozon/android/messenger/blocks/chat/old/ChatDTO$PreviewDTO;", "nullablePreviewDTOAdapter", "", "Lru/ozon/uni/atoms/data/button/Icon;", "nullableListOfIconAdapter", "stringAdapter", "Lru/ozon/android/messenger/blocks/chat/common/menuItems/ContextMenuItemDTO;", "nullableListOfContextMenuItemDTOAdapter", "Lru/ozon/android/messenger/blocks/chat/common/e;", "nullableChatBlockAnimationTypeAdapter", "Lru/ozon/android/messenger/framework/data/remote/models/items/ContextMenuDTO;", "nullableContextMenuDTOAdapter", "Ljava/lang/reflect/Constructor;", "constructorRef", "Ljava/lang/reflect/Constructor;", "messenger_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class ChatDTOJsonAdapter extends JsonAdapter<ChatDTO> {
    public static final int $stable = 8;
    private volatile Constructor<ChatDTO> constructorRef;

    @NotNull
    private final JsonAdapter<ru.ozon.android.messenger.blocks.chat.common.a> nullableAlignmentDTOAdapter;

    @NotNull
    private final JsonAdapter<ru.ozon.android.messenger.blocks.chat.common.e> nullableChatBlockAnimationTypeAdapter;

    @NotNull
    private final JsonAdapter<ContextMenuDTO> nullableContextMenuDTOAdapter;

    @NotNull
    private final JsonAdapter<IconDTO> nullableIconDTOAdapter;

    @NotNull
    private final JsonAdapter<List<ContextMenuItemDTO>> nullableListOfContextMenuItemDTOAdapter;

    @NotNull
    private final JsonAdapter<List<Icon>> nullableListOfIconAdapter;

    @NotNull
    private final JsonAdapter<ChatDTO.PreviewDTO> nullablePreviewDTOAdapter;

    @NotNull
    private final JsonAdapter<String> nullableStringAdapter;

    @NotNull
    private final n.a options;

    @NotNull
    private final JsonAdapter<String> stringAdapter;

    @NotNull
    private final JsonAdapter<TextDTO> textDTOAdapter;

    @NotNull
    private final JsonAdapter<UnreadCountIndicatorDTO> unreadCountIndicatorDTOAdapter;

    public ChatDTOJsonAdapter(@NotNull Moshi moshi) {
        Intrinsics.checkNotNullParameter(moshi, "moshi");
        n.a a11 = n.a.C0918a.a("titleAtom", "avatarIcon", "avatarIconVerticalAlignment", "unreadCountIndicator", "firstUnreadMessageId", "lastMessagePreview", "titleIcons", "deeplink", "contextMenuItems", "animation", "contextMenu");
        Intrinsics.checkNotNullExpressionValue(a11, "of(...)");
        this.options = a11;
        M m11 = M.f71699a;
        JsonAdapter<TextDTO> f7 = moshi.f(TextDTO.class, m11, "titleAtom");
        Intrinsics.checkNotNullExpressionValue(f7, "adapter(...)");
        this.textDTOAdapter = f7;
        JsonAdapter<IconDTO> f11 = moshi.f(IconDTO.class, m11, "avatarIcon");
        Intrinsics.checkNotNullExpressionValue(f11, "adapter(...)");
        this.nullableIconDTOAdapter = f11;
        JsonAdapter<ru.ozon.android.messenger.blocks.chat.common.a> f12 = moshi.f(ru.ozon.android.messenger.blocks.chat.common.a.class, m11, "avatarIconVerticalAlignment");
        Intrinsics.checkNotNullExpressionValue(f12, "adapter(...)");
        this.nullableAlignmentDTOAdapter = f12;
        JsonAdapter<UnreadCountIndicatorDTO> f13 = moshi.f(UnreadCountIndicatorDTO.class, m11, "unreadCountIndicator");
        Intrinsics.checkNotNullExpressionValue(f13, "adapter(...)");
        this.unreadCountIndicatorDTOAdapter = f13;
        JsonAdapter<String> f14 = moshi.f(String.class, m11, "firstUnreadMessageId");
        Intrinsics.checkNotNullExpressionValue(f14, "adapter(...)");
        this.nullableStringAdapter = f14;
        JsonAdapter<ChatDTO.PreviewDTO> f15 = moshi.f(ChatDTO.PreviewDTO.class, m11, "lastMessagePreview");
        Intrinsics.checkNotNullExpressionValue(f15, "adapter(...)");
        this.nullablePreviewDTOAdapter = f15;
        JsonAdapter<List<Icon>> f16 = moshi.f(D.e(List.class, Icon.class), m11, "titleIcons");
        Intrinsics.checkNotNullExpressionValue(f16, "adapter(...)");
        this.nullableListOfIconAdapter = f16;
        JsonAdapter<String> f17 = moshi.f(String.class, m11, "deeplink");
        Intrinsics.checkNotNullExpressionValue(f17, "adapter(...)");
        this.stringAdapter = f17;
        JsonAdapter<List<ContextMenuItemDTO>> f18 = moshi.f(D.e(List.class, ContextMenuItemDTO.class), m11, "contextMenuItems");
        Intrinsics.checkNotNullExpressionValue(f18, "adapter(...)");
        this.nullableListOfContextMenuItemDTOAdapter = f18;
        JsonAdapter<ru.ozon.android.messenger.blocks.chat.common.e> f19 = moshi.f(ru.ozon.android.messenger.blocks.chat.common.e.class, m11, "animation");
        Intrinsics.checkNotNullExpressionValue(f19, "adapter(...)");
        this.nullableChatBlockAnimationTypeAdapter = f19;
        JsonAdapter<ContextMenuDTO> f21 = moshi.f(ContextMenuDTO.class, m11, "contextMenu");
        Intrinsics.checkNotNullExpressionValue(f21, "adapter(...)");
        this.nullableContextMenuDTOAdapter = f21;
    }

    @NotNull
    public String toString() {
        return Ak.b.c(29, "GeneratedJsonAdapter(ChatDTO)", "toString(...)");
    }

    @Override // com.squareup.moshi.JsonAdapter
    @NotNull
    public ChatDTO fromJson(@NotNull n reader) {
        int i11;
        Intrinsics.checkNotNullParameter(reader, "reader");
        reader.beginObject();
        int i12 = -1;
        TextDTO textDTO = null;
        IconDTO iconDTO = null;
        ru.ozon.android.messenger.blocks.chat.common.a aVar = null;
        UnreadCountIndicatorDTO unreadCountIndicatorDTO = null;
        String str = null;
        ChatDTO.PreviewDTO previewDTO = null;
        List<Icon> list = null;
        String str2 = null;
        List<ContextMenuItemDTO> list2 = null;
        ru.ozon.android.messenger.blocks.chat.common.e eVar = null;
        ContextMenuDTO contextMenuDTO = null;
        while (true) {
            TextDTO textDTO2 = textDTO;
            if (!reader.hasNext()) {
                IconDTO iconDTO2 = iconDTO;
                reader.endObject();
                if (i12 == -51) {
                    if (textDTO2 == null) {
                        throw Y9.c.j("titleAtom", "titleAtom", reader);
                    }
                    if (unreadCountIndicatorDTO == null) {
                        throw Y9.c.j("unreadCountIndicator", "unreadCountIndicator", reader);
                    }
                    if (str2 == null) {
                        throw Y9.c.j("deeplink", "deeplink", reader);
                    }
                    List<ContextMenuItemDTO> list3 = list2;
                    String str3 = str2;
                    List<Icon> list4 = list;
                    ChatDTO.PreviewDTO previewDTO2 = previewDTO;
                    return new ChatDTO(textDTO2, iconDTO2, aVar, unreadCountIndicatorDTO, str, previewDTO2, list4, str3, list3, eVar, contextMenuDTO);
                }
                Constructor<ChatDTO> constructor = this.constructorRef;
                if (constructor == null) {
                    i11 = i12;
                    constructor = ChatDTO.class.getDeclaredConstructor(TextDTO.class, IconDTO.class, ru.ozon.android.messenger.blocks.chat.common.a.class, UnreadCountIndicatorDTO.class, String.class, ChatDTO.PreviewDTO.class, List.class, String.class, List.class, ru.ozon.android.messenger.blocks.chat.common.e.class, ContextMenuDTO.class, Integer.TYPE, Y9.c.f34864d);
                    this.constructorRef = constructor;
                    Intrinsics.checkNotNullExpressionValue(constructor, "also(...)");
                } else {
                    i11 = i12;
                }
                Constructor<ChatDTO> constructor2 = constructor;
                if (textDTO2 == null) {
                    throw Y9.c.j("titleAtom", "titleAtom", reader);
                }
                if (unreadCountIndicatorDTO == null) {
                    throw Y9.c.j("unreadCountIndicator", "unreadCountIndicator", reader);
                }
                if (str2 == null) {
                    throw Y9.c.j("deeplink", "deeplink", reader);
                }
                ChatDTO newInstance = constructor2.newInstance(textDTO2, iconDTO2, aVar, unreadCountIndicatorDTO, str, previewDTO, list, str2, list2, eVar, contextMenuDTO, Integer.valueOf(i11), null);
                Intrinsics.checkNotNullExpressionValue(newInstance, "newInstance(...)");
                return newInstance;
            }
            IconDTO iconDTO3 = iconDTO;
            switch (reader.v(this.options)) {
                case -1:
                    reader.y();
                    reader.skipValue();
                    iconDTO = iconDTO3;
                    textDTO = textDTO2;
                case 0:
                    textDTO = this.textDTOAdapter.fromJson(reader);
                    if (textDTO == null) {
                        throw Y9.c.q("titleAtom", "titleAtom", reader);
                    }
                    iconDTO = iconDTO3;
                case 1:
                    iconDTO = this.nullableIconDTOAdapter.fromJson(reader);
                    i12 &= -3;
                    textDTO = textDTO2;
                case 2:
                    aVar = this.nullableAlignmentDTOAdapter.fromJson(reader);
                    iconDTO = iconDTO3;
                    textDTO = textDTO2;
                case 3:
                    unreadCountIndicatorDTO = this.unreadCountIndicatorDTOAdapter.fromJson(reader);
                    if (unreadCountIndicatorDTO == null) {
                        throw Y9.c.q("unreadCountIndicator", "unreadCountIndicator", reader);
                    }
                    iconDTO = iconDTO3;
                    textDTO = textDTO2;
                case 4:
                    str = this.nullableStringAdapter.fromJson(reader);
                    i12 &= -17;
                    iconDTO = iconDTO3;
                    textDTO = textDTO2;
                case 5:
                    previewDTO = this.nullablePreviewDTOAdapter.fromJson(reader);
                    i12 &= -33;
                    iconDTO = iconDTO3;
                    textDTO = textDTO2;
                case 6:
                    list = this.nullableListOfIconAdapter.fromJson(reader);
                    iconDTO = iconDTO3;
                    textDTO = textDTO2;
                case 7:
                    str2 = this.stringAdapter.fromJson(reader);
                    if (str2 == null) {
                        throw Y9.c.q("deeplink", "deeplink", reader);
                    }
                    iconDTO = iconDTO3;
                    textDTO = textDTO2;
                case 8:
                    list2 = this.nullableListOfContextMenuItemDTOAdapter.fromJson(reader);
                    iconDTO = iconDTO3;
                    textDTO = textDTO2;
                case 9:
                    eVar = this.nullableChatBlockAnimationTypeAdapter.fromJson(reader);
                    iconDTO = iconDTO3;
                    textDTO = textDTO2;
                case 10:
                    contextMenuDTO = this.nullableContextMenuDTOAdapter.fromJson(reader);
                    iconDTO = iconDTO3;
                    textDTO = textDTO2;
                default:
                    iconDTO = iconDTO3;
                    textDTO = textDTO2;
            }
        }
    }

    @Override // com.squareup.moshi.JsonAdapter
    /* renamed from: toJson, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
    public void mo44toJson(@NotNull x writer, ChatDTO value_) {
        Intrinsics.checkNotNullParameter(writer, "writer");
        if (value_ == null) {
            throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
        }
        writer.j();
        writer.w("titleAtom");
        this.textDTOAdapter.mo44toJson(writer, (x) value_.getTitleAtom());
        writer.w("avatarIcon");
        this.nullableIconDTOAdapter.mo44toJson(writer, (x) value_.getAvatarIcon());
        writer.w("avatarIconVerticalAlignment");
        this.nullableAlignmentDTOAdapter.mo44toJson(writer, (x) value_.getAvatarIconVerticalAlignment());
        writer.w("unreadCountIndicator");
        this.unreadCountIndicatorDTOAdapter.mo44toJson(writer, (x) value_.getUnreadCountIndicator());
        writer.w("firstUnreadMessageId");
        this.nullableStringAdapter.mo44toJson(writer, (x) value_.getFirstUnreadMessageId());
        writer.w("lastMessagePreview");
        this.nullablePreviewDTOAdapter.mo44toJson(writer, (x) value_.getLastMessagePreview());
        writer.w("titleIcons");
        this.nullableListOfIconAdapter.mo44toJson(writer, (x) value_.getTitleIcons());
        writer.w("deeplink");
        this.stringAdapter.mo44toJson(writer, (x) value_.getDeeplink());
        writer.w("contextMenuItems");
        this.nullableListOfContextMenuItemDTOAdapter.mo44toJson(writer, (x) value_.getContextMenuItems());
        writer.w("animation");
        this.nullableChatBlockAnimationTypeAdapter.mo44toJson(writer, (x) value_.getAnimation());
        writer.w("contextMenu");
        this.nullableContextMenuDTOAdapter.mo44toJson(writer, (x) value_.getContextMenu());
        writer.p();
    }
}
