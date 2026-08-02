package ru.ozon.android.messenger.blocks.chat.bx;

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
import ru.ozon.android.messenger.blocks.chat.common.PreviewDTO;
import ru.ozon.android.messenger.blocks.chat.common.UnreadCountIndicatorDTO;
import ru.ozon.android.messenger.blocks.chat.common.menuItems.ContextMenuItemDTO;
import ru.ozon.android.messenger.framework.data.remote.models.items.ContextMenuDTO;
import ru.ozon.app.android.ugc.widgets.selectionItemForm.data.SelectionItemFormDTO;
import ru.ozon.uni.atoms.data.button.Icon;
import ru.ozon.uni.atoms.data.icon.IconDTO;

@Metadata(d1 = {"\u0000z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\f\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\f\u0010\rJ!\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000f\u001a\u00020\u000e2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u001a\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00070\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u001a\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00190\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u0018R\u001a\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u001b0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u0018R\u001c\u0010\u001e\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001d0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u0018R\u001c\u0010\u001f\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010\u0018R\u001a\u0010!\u001a\b\u0012\u0004\u0012\u00020 0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010\u0018R\"\u0010$\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020#\u0018\u00010\"0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u0010\u0018R\"\u0010&\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020%\u0018\u00010\"0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b&\u0010\u0018R\u001c\u0010(\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010'0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b(\u0010\u0018R\u001c\u0010*\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010)0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b*\u0010\u0018R\u001e\u0010,\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010+8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b,\u0010-¨\u0006."}, d2 = {"Lru/ozon/android/messenger/blocks/chat/bx/BxChatDTOJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lru/ozon/android/messenger/blocks/chat/bx/BxChatDTO;", "Lcom/squareup/moshi/Moshi;", "moshi", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "", "toString", "()Ljava/lang/String;", "Lcom/squareup/moshi/n;", "reader", "fromJson", "(Lcom/squareup/moshi/n;)Lru/ozon/android/messenger/blocks/chat/bx/BxChatDTO;", "Lcom/squareup/moshi/x;", "writer", "value_", "", "toJson", "(Lcom/squareup/moshi/x;Lru/ozon/android/messenger/blocks/chat/bx/BxChatDTO;)V", "Lcom/squareup/moshi/n$a;", "options", "Lcom/squareup/moshi/n$a;", "stringAdapter", "Lcom/squareup/moshi/JsonAdapter;", "Lru/ozon/uni/atoms/data/icon/IconDTO;", "iconDTOAdapter", "", "intAdapter", "Lru/ozon/android/messenger/blocks/chat/common/UnreadCountIndicatorDTO;", "nullableUnreadCountIndicatorDTOAdapter", "nullableStringAdapter", "Lru/ozon/android/messenger/blocks/chat/common/PreviewDTO;", "previewDTOAdapter", "", "Lru/ozon/uni/atoms/data/button/Icon;", "nullableListOfIconAdapter", "Lru/ozon/android/messenger/blocks/chat/common/menuItems/ContextMenuItemDTO;", "nullableListOfContextMenuItemDTOAdapter", "Lru/ozon/android/messenger/blocks/chat/common/e;", "nullableChatBlockAnimationTypeAdapter", "Lru/ozon/android/messenger/framework/data/remote/models/items/ContextMenuDTO;", "nullableContextMenuDTOAdapter", "Ljava/lang/reflect/Constructor;", "constructorRef", "Ljava/lang/reflect/Constructor;", "messenger_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class BxChatDTOJsonAdapter extends JsonAdapter<BxChatDTO> {
    public static final int $stable = 8;
    private volatile Constructor<BxChatDTO> constructorRef;

    @NotNull
    private final JsonAdapter<IconDTO> iconDTOAdapter;

    @NotNull
    private final JsonAdapter<Integer> intAdapter;

    @NotNull
    private final JsonAdapter<ru.ozon.android.messenger.blocks.chat.common.e> nullableChatBlockAnimationTypeAdapter;

    @NotNull
    private final JsonAdapter<ContextMenuDTO> nullableContextMenuDTOAdapter;

    @NotNull
    private final JsonAdapter<List<ContextMenuItemDTO>> nullableListOfContextMenuItemDTOAdapter;

    @NotNull
    private final JsonAdapter<List<Icon>> nullableListOfIconAdapter;

    @NotNull
    private final JsonAdapter<String> nullableStringAdapter;

    @NotNull
    private final JsonAdapter<UnreadCountIndicatorDTO> nullableUnreadCountIndicatorDTOAdapter;

    @NotNull
    private final n.a options;

    @NotNull
    private final JsonAdapter<PreviewDTO> previewDTOAdapter;

    @NotNull
    private final JsonAdapter<String> stringAdapter;

    public BxChatDTOJsonAdapter(@NotNull Moshi moshi) {
        Intrinsics.checkNotNullParameter(moshi, "moshi");
        n.a a11 = n.a.C0918a.a(SelectionItemFormDTO.TITLE_FIELD_NAME, "avatarIcon", "unreadCount", "unreadCountIndicator", "firstUnreadMessageId", "preview", "titleIcons", "deeplink", "contextMenuItems", "animation", "contextMenu");
        Intrinsics.checkNotNullExpressionValue(a11, "of(...)");
        this.options = a11;
        M m11 = M.f71699a;
        JsonAdapter<String> f7 = moshi.f(String.class, m11, SelectionItemFormDTO.TITLE_FIELD_NAME);
        Intrinsics.checkNotNullExpressionValue(f7, "adapter(...)");
        this.stringAdapter = f7;
        JsonAdapter<IconDTO> f11 = moshi.f(IconDTO.class, m11, "avatarIcon");
        Intrinsics.checkNotNullExpressionValue(f11, "adapter(...)");
        this.iconDTOAdapter = f11;
        JsonAdapter<Integer> f12 = moshi.f(Integer.TYPE, m11, "unreadCount");
        Intrinsics.checkNotNullExpressionValue(f12, "adapter(...)");
        this.intAdapter = f12;
        JsonAdapter<UnreadCountIndicatorDTO> f13 = moshi.f(UnreadCountIndicatorDTO.class, m11, "unreadCountIndicator");
        Intrinsics.checkNotNullExpressionValue(f13, "adapter(...)");
        this.nullableUnreadCountIndicatorDTOAdapter = f13;
        JsonAdapter<String> f14 = moshi.f(String.class, m11, "firstUnreadMessageId");
        Intrinsics.checkNotNullExpressionValue(f14, "adapter(...)");
        this.nullableStringAdapter = f14;
        JsonAdapter<PreviewDTO> f15 = moshi.f(PreviewDTO.class, m11, "preview");
        Intrinsics.checkNotNullExpressionValue(f15, "adapter(...)");
        this.previewDTOAdapter = f15;
        JsonAdapter<List<Icon>> f16 = moshi.f(D.e(List.class, Icon.class), m11, "titleIcons");
        Intrinsics.checkNotNullExpressionValue(f16, "adapter(...)");
        this.nullableListOfIconAdapter = f16;
        JsonAdapter<List<ContextMenuItemDTO>> f17 = moshi.f(D.e(List.class, ContextMenuItemDTO.class), m11, "contextMenuItems");
        Intrinsics.checkNotNullExpressionValue(f17, "adapter(...)");
        this.nullableListOfContextMenuItemDTOAdapter = f17;
        JsonAdapter<ru.ozon.android.messenger.blocks.chat.common.e> f18 = moshi.f(ru.ozon.android.messenger.blocks.chat.common.e.class, m11, "animation");
        Intrinsics.checkNotNullExpressionValue(f18, "adapter(...)");
        this.nullableChatBlockAnimationTypeAdapter = f18;
        JsonAdapter<ContextMenuDTO> f19 = moshi.f(ContextMenuDTO.class, m11, "contextMenu");
        Intrinsics.checkNotNullExpressionValue(f19, "adapter(...)");
        this.nullableContextMenuDTOAdapter = f19;
    }

    @NotNull
    public String toString() {
        return Ak.b.c(31, "GeneratedJsonAdapter(BxChatDTO)", "toString(...)");
    }

    @Override // com.squareup.moshi.JsonAdapter
    @NotNull
    public BxChatDTO fromJson(@NotNull n reader) {
        int i11;
        Intrinsics.checkNotNullParameter(reader, "reader");
        reader.beginObject();
        int i12 = -1;
        String str = null;
        IconDTO iconDTO = null;
        Integer num = null;
        UnreadCountIndicatorDTO unreadCountIndicatorDTO = null;
        String str2 = null;
        PreviewDTO previewDTO = null;
        List<Icon> list = null;
        String str3 = null;
        List<ContextMenuItemDTO> list2 = null;
        ru.ozon.android.messenger.blocks.chat.common.e eVar = null;
        ContextMenuDTO contextMenuDTO = null;
        while (true) {
            String str4 = str;
            IconDTO iconDTO2 = iconDTO;
            Integer num2 = num;
            if (!reader.hasNext()) {
                UnreadCountIndicatorDTO unreadCountIndicatorDTO2 = unreadCountIndicatorDTO;
                reader.endObject();
                if (i12 == -17) {
                    if (str4 == null) {
                        throw Y9.c.j(SelectionItemFormDTO.TITLE_FIELD_NAME, SelectionItemFormDTO.TITLE_FIELD_NAME, reader);
                    }
                    if (iconDTO2 == null) {
                        throw Y9.c.j("avatarIcon", "avatarIcon", reader);
                    }
                    if (num2 == null) {
                        throw Y9.c.j("unreadCount", "unreadCount", reader);
                    }
                    int intValue = num2.intValue();
                    if (previewDTO == null) {
                        throw Y9.c.j("preview", "preview", reader);
                    }
                    if (str3 == null) {
                        throw Y9.c.j("deeplink", "deeplink", reader);
                    }
                    List<ContextMenuItemDTO> list3 = list2;
                    String str5 = str3;
                    return new BxChatDTO(str4, iconDTO2, intValue, unreadCountIndicatorDTO2, str2, previewDTO, list, str5, list3, eVar, contextMenuDTO);
                }
                Constructor<BxChatDTO> constructor = this.constructorRef;
                if (constructor == null) {
                    Class<?> cls = Y9.c.f34864d;
                    Class cls2 = Integer.TYPE;
                    i11 = i12;
                    constructor = BxChatDTO.class.getDeclaredConstructor(String.class, IconDTO.class, cls2, UnreadCountIndicatorDTO.class, String.class, PreviewDTO.class, List.class, String.class, List.class, ru.ozon.android.messenger.blocks.chat.common.e.class, ContextMenuDTO.class, cls2, cls);
                    this.constructorRef = constructor;
                    Intrinsics.checkNotNullExpressionValue(constructor, "also(...)");
                } else {
                    i11 = i12;
                }
                Constructor<BxChatDTO> constructor2 = constructor;
                if (str4 == null) {
                    throw Y9.c.j(SelectionItemFormDTO.TITLE_FIELD_NAME, SelectionItemFormDTO.TITLE_FIELD_NAME, reader);
                }
                if (iconDTO2 == null) {
                    throw Y9.c.j("avatarIcon", "avatarIcon", reader);
                }
                if (num2 == null) {
                    throw Y9.c.j("unreadCount", "unreadCount", reader);
                }
                if (previewDTO == null) {
                    throw Y9.c.j("preview", "preview", reader);
                }
                if (str3 == null) {
                    throw Y9.c.j("deeplink", "deeplink", reader);
                }
                BxChatDTO newInstance = constructor2.newInstance(str4, iconDTO2, num2, unreadCountIndicatorDTO2, str2, previewDTO, list, str3, list2, eVar, contextMenuDTO, Integer.valueOf(i11), null);
                Intrinsics.checkNotNullExpressionValue(newInstance, "newInstance(...)");
                return newInstance;
            }
            UnreadCountIndicatorDTO unreadCountIndicatorDTO3 = unreadCountIndicatorDTO;
            switch (reader.v(this.options)) {
                case -1:
                    reader.y();
                    reader.skipValue();
                    unreadCountIndicatorDTO = unreadCountIndicatorDTO3;
                    str = str4;
                    iconDTO = iconDTO2;
                    num = num2;
                case 0:
                    str = this.stringAdapter.fromJson(reader);
                    if (str == null) {
                        throw Y9.c.q(SelectionItemFormDTO.TITLE_FIELD_NAME, SelectionItemFormDTO.TITLE_FIELD_NAME, reader);
                    }
                    unreadCountIndicatorDTO = unreadCountIndicatorDTO3;
                    iconDTO = iconDTO2;
                    num = num2;
                case 1:
                    iconDTO = this.iconDTOAdapter.fromJson(reader);
                    if (iconDTO == null) {
                        throw Y9.c.q("avatarIcon", "avatarIcon", reader);
                    }
                    unreadCountIndicatorDTO = unreadCountIndicatorDTO3;
                    str = str4;
                    num = num2;
                case 2:
                    num = this.intAdapter.fromJson(reader);
                    if (num == null) {
                        throw Y9.c.q("unreadCount", "unreadCount", reader);
                    }
                    unreadCountIndicatorDTO = unreadCountIndicatorDTO3;
                    str = str4;
                    iconDTO = iconDTO2;
                case 3:
                    unreadCountIndicatorDTO = this.nullableUnreadCountIndicatorDTOAdapter.fromJson(reader);
                    str = str4;
                    iconDTO = iconDTO2;
                    num = num2;
                case 4:
                    str2 = this.nullableStringAdapter.fromJson(reader);
                    unreadCountIndicatorDTO = unreadCountIndicatorDTO3;
                    str = str4;
                    iconDTO = iconDTO2;
                    num = num2;
                    i12 = -17;
                case 5:
                    previewDTO = this.previewDTOAdapter.fromJson(reader);
                    if (previewDTO == null) {
                        throw Y9.c.q("preview", "preview", reader);
                    }
                    unreadCountIndicatorDTO = unreadCountIndicatorDTO3;
                    str = str4;
                    iconDTO = iconDTO2;
                    num = num2;
                case 6:
                    list = this.nullableListOfIconAdapter.fromJson(reader);
                    unreadCountIndicatorDTO = unreadCountIndicatorDTO3;
                    str = str4;
                    iconDTO = iconDTO2;
                    num = num2;
                case 7:
                    str3 = this.stringAdapter.fromJson(reader);
                    if (str3 == null) {
                        throw Y9.c.q("deeplink", "deeplink", reader);
                    }
                    unreadCountIndicatorDTO = unreadCountIndicatorDTO3;
                    str = str4;
                    iconDTO = iconDTO2;
                    num = num2;
                case 8:
                    list2 = this.nullableListOfContextMenuItemDTOAdapter.fromJson(reader);
                    unreadCountIndicatorDTO = unreadCountIndicatorDTO3;
                    str = str4;
                    iconDTO = iconDTO2;
                    num = num2;
                case 9:
                    eVar = this.nullableChatBlockAnimationTypeAdapter.fromJson(reader);
                    unreadCountIndicatorDTO = unreadCountIndicatorDTO3;
                    str = str4;
                    iconDTO = iconDTO2;
                    num = num2;
                case 10:
                    contextMenuDTO = this.nullableContextMenuDTOAdapter.fromJson(reader);
                    unreadCountIndicatorDTO = unreadCountIndicatorDTO3;
                    str = str4;
                    iconDTO = iconDTO2;
                    num = num2;
                default:
                    unreadCountIndicatorDTO = unreadCountIndicatorDTO3;
                    str = str4;
                    iconDTO = iconDTO2;
                    num = num2;
            }
        }
    }

    @Override // com.squareup.moshi.JsonAdapter
    /* renamed from: toJson, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
    public void mo44toJson(@NotNull x writer, BxChatDTO value_) {
        Intrinsics.checkNotNullParameter(writer, "writer");
        if (value_ == null) {
            throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
        }
        writer.j();
        writer.w(SelectionItemFormDTO.TITLE_FIELD_NAME);
        this.stringAdapter.mo44toJson(writer, (x) value_.getTitle());
        writer.w("avatarIcon");
        this.iconDTOAdapter.mo44toJson(writer, (x) value_.getAvatarIcon());
        writer.w("unreadCount");
        this.intAdapter.mo44toJson(writer, (x) Integer.valueOf(value_.getUnreadCount()));
        writer.w("unreadCountIndicator");
        this.nullableUnreadCountIndicatorDTOAdapter.mo44toJson(writer, (x) value_.getUnreadCountIndicator());
        writer.w("firstUnreadMessageId");
        this.nullableStringAdapter.mo44toJson(writer, (x) value_.getFirstUnreadMessageId());
        writer.w("preview");
        this.previewDTOAdapter.mo44toJson(writer, (x) value_.getPreview());
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
