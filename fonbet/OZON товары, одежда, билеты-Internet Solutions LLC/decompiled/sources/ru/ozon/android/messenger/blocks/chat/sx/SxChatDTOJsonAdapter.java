package ru.ozon.android.messenger.blocks.chat.sx;

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
import ru.ozon.android.messenger.blocks.chat.sx.SxChatDTO;
import ru.ozon.android.messenger.framework.data.remote.models.items.ContextMenuDTO;
import ru.ozon.app.android.ugc.widgets.selectionItemForm.data.SelectionItemFormDTO;
import ru.ozon.uni.atoms.data.button.Icon;
import ru.ozon.uni.atoms.data.dsBadge.BadgeDTO;

@Metadata(d1 = {"\u0000\u0082\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\f\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\f\u0010\rJ!\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000f\u001a\u00020\u000e2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u001a\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00070\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\"\u0010\u001b\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u001a\u0018\u00010\u00190\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u0018R\u001a\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u001c0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u0018R\u001c\u0010\u001f\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001e0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010\u0018R\u001c\u0010 \u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010\u0018R\u001a\u0010\"\u001a\b\u0012\u0004\u0012\u00020!0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010\u0018R\u001c\u0010#\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001a0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010\u0018R\"\u0010%\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020$\u0018\u00010\u00190\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b%\u0010\u0018R\u001a\u0010'\u001a\b\u0012\u0004\u0012\u00020&0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b'\u0010\u0018R\"\u0010)\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020(\u0018\u00010\u00190\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b)\u0010\u0018R\u001c\u0010+\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010*0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b+\u0010\u0018R\u001c\u0010-\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010,0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b-\u0010\u0018R\u001e\u0010/\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010.8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b/\u00100¨\u00061"}, d2 = {"Lru/ozon/android/messenger/blocks/chat/sx/SxChatDTOJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lru/ozon/android/messenger/blocks/chat/sx/SxChatDTO;", "Lcom/squareup/moshi/Moshi;", "moshi", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "", "toString", "()Ljava/lang/String;", "Lcom/squareup/moshi/n;", "reader", "fromJson", "(Lcom/squareup/moshi/n;)Lru/ozon/android/messenger/blocks/chat/sx/SxChatDTO;", "Lcom/squareup/moshi/x;", "writer", "value_", "", "toJson", "(Lcom/squareup/moshi/x;Lru/ozon/android/messenger/blocks/chat/sx/SxChatDTO;)V", "Lcom/squareup/moshi/n$a;", "options", "Lcom/squareup/moshi/n$a;", "stringAdapter", "Lcom/squareup/moshi/JsonAdapter;", "", "Lru/ozon/uni/atoms/data/button/Icon;", "nullableListOfIconAdapter", "", "intAdapter", "Lru/ozon/android/messenger/blocks/chat/common/UnreadCountIndicatorDTO;", "nullableUnreadCountIndicatorDTOAdapter", "nullableStringAdapter", "Lru/ozon/android/messenger/blocks/chat/common/PreviewDTO;", "previewDTOAdapter", "nullableIconAdapter", "Lru/ozon/uni/atoms/data/dsBadge/BadgeDTO;", "nullableListOfBadgeDTOAdapter", "Lru/ozon/android/messenger/blocks/chat/sx/SxChatDTO$a;", "displayTypeDTOAdapter", "Lru/ozon/android/messenger/blocks/chat/common/menuItems/ContextMenuItemDTO;", "nullableListOfContextMenuItemDTOAdapter", "Lru/ozon/android/messenger/blocks/chat/common/e;", "nullableChatBlockAnimationTypeAdapter", "Lru/ozon/android/messenger/framework/data/remote/models/items/ContextMenuDTO;", "nullableContextMenuDTOAdapter", "Ljava/lang/reflect/Constructor;", "constructorRef", "Ljava/lang/reflect/Constructor;", "messenger_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class SxChatDTOJsonAdapter extends JsonAdapter<SxChatDTO> {
    public static final int $stable = 8;
    private volatile Constructor<SxChatDTO> constructorRef;

    @NotNull
    private final JsonAdapter<SxChatDTO.a> displayTypeDTOAdapter;

    @NotNull
    private final JsonAdapter<Integer> intAdapter;

    @NotNull
    private final JsonAdapter<ru.ozon.android.messenger.blocks.chat.common.e> nullableChatBlockAnimationTypeAdapter;

    @NotNull
    private final JsonAdapter<ContextMenuDTO> nullableContextMenuDTOAdapter;

    @NotNull
    private final JsonAdapter<Icon> nullableIconAdapter;

    @NotNull
    private final JsonAdapter<List<BadgeDTO>> nullableListOfBadgeDTOAdapter;

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

    public SxChatDTOJsonAdapter(@NotNull Moshi moshi) {
        Intrinsics.checkNotNullParameter(moshi, "moshi");
        n.a a11 = n.a.C0918a.a(SelectionItemFormDTO.TITLE_FIELD_NAME, "titleIcons", "unreadCount", "unreadCountIndicator", "firstUnreadMessageId", "preview", "trustIcon", "previewBadges", "conversationId", "deeplink", "displayType", "contextMenuItems", "animation", "contextMenu");
        Intrinsics.checkNotNullExpressionValue(a11, "of(...)");
        this.options = a11;
        M m11 = M.f71699a;
        JsonAdapter<String> f7 = moshi.f(String.class, m11, SelectionItemFormDTO.TITLE_FIELD_NAME);
        Intrinsics.checkNotNullExpressionValue(f7, "adapter(...)");
        this.stringAdapter = f7;
        JsonAdapter<List<Icon>> f11 = moshi.f(D.e(List.class, Icon.class), m11, "titleIcons");
        Intrinsics.checkNotNullExpressionValue(f11, "adapter(...)");
        this.nullableListOfIconAdapter = f11;
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
        JsonAdapter<Icon> f16 = moshi.f(Icon.class, m11, "trustIcon");
        Intrinsics.checkNotNullExpressionValue(f16, "adapter(...)");
        this.nullableIconAdapter = f16;
        JsonAdapter<List<BadgeDTO>> f17 = moshi.f(D.e(List.class, BadgeDTO.class), m11, "previewBadges");
        Intrinsics.checkNotNullExpressionValue(f17, "adapter(...)");
        this.nullableListOfBadgeDTOAdapter = f17;
        JsonAdapter<SxChatDTO.a> f18 = moshi.f(SxChatDTO.a.class, m11, "displayType");
        Intrinsics.checkNotNullExpressionValue(f18, "adapter(...)");
        this.displayTypeDTOAdapter = f18;
        JsonAdapter<List<ContextMenuItemDTO>> f19 = moshi.f(D.e(List.class, ContextMenuItemDTO.class), m11, "contextMenuItems");
        Intrinsics.checkNotNullExpressionValue(f19, "adapter(...)");
        this.nullableListOfContextMenuItemDTOAdapter = f19;
        JsonAdapter<ru.ozon.android.messenger.blocks.chat.common.e> f21 = moshi.f(ru.ozon.android.messenger.blocks.chat.common.e.class, m11, "animation");
        Intrinsics.checkNotNullExpressionValue(f21, "adapter(...)");
        this.nullableChatBlockAnimationTypeAdapter = f21;
        JsonAdapter<ContextMenuDTO> f22 = moshi.f(ContextMenuDTO.class, m11, "contextMenu");
        Intrinsics.checkNotNullExpressionValue(f22, "adapter(...)");
        this.nullableContextMenuDTOAdapter = f22;
    }

    @NotNull
    public String toString() {
        return Ak.b.c(31, "GeneratedJsonAdapter(SxChatDTO)", "toString(...)");
    }

    @Override // com.squareup.moshi.JsonAdapter
    @NotNull
    public SxChatDTO fromJson(@NotNull n reader) {
        String str;
        Intrinsics.checkNotNullParameter(reader, "reader");
        reader.beginObject();
        int i11 = -1;
        String str2 = null;
        List<Icon> list = null;
        Integer num = null;
        UnreadCountIndicatorDTO unreadCountIndicatorDTO = null;
        String str3 = null;
        PreviewDTO previewDTO = null;
        Icon icon = null;
        List<BadgeDTO> list2 = null;
        String str4 = null;
        String str5 = null;
        SxChatDTO.a aVar = null;
        List<ContextMenuItemDTO> list3 = null;
        ru.ozon.android.messenger.blocks.chat.common.e eVar = null;
        ContextMenuDTO contextMenuDTO = null;
        while (true) {
            String str6 = str2;
            List<Icon> list4 = list;
            Integer num2 = num;
            if (!reader.hasNext()) {
                UnreadCountIndicatorDTO unreadCountIndicatorDTO2 = unreadCountIndicatorDTO;
                reader.endObject();
                if (i11 == -465) {
                    if (str6 == null) {
                        throw Y9.c.j(SelectionItemFormDTO.TITLE_FIELD_NAME, SelectionItemFormDTO.TITLE_FIELD_NAME, reader);
                    }
                    if (num2 == null) {
                        throw Y9.c.j("unreadCount", "unreadCount", reader);
                    }
                    int intValue = num2.intValue();
                    if (previewDTO == null) {
                        throw Y9.c.j("preview", "preview", reader);
                    }
                    if (str5 == null) {
                        throw Y9.c.j("deeplink", "deeplink", reader);
                    }
                    if (aVar == null) {
                        throw Y9.c.j("displayType", "displayType", reader);
                    }
                    String str7 = str4;
                    List<BadgeDTO> list5 = list2;
                    return new SxChatDTO(str6, list4, intValue, unreadCountIndicatorDTO2, str3, previewDTO, icon, list5, str7, str5, aVar, list3, eVar, contextMenuDTO);
                }
                int i12 = i11;
                Constructor<SxChatDTO> constructor = this.constructorRef;
                if (constructor == null) {
                    Class<?> cls = Y9.c.f34864d;
                    Class cls2 = Integer.TYPE;
                    str = str6;
                    constructor = SxChatDTO.class.getDeclaredConstructor(String.class, List.class, cls2, UnreadCountIndicatorDTO.class, String.class, PreviewDTO.class, Icon.class, List.class, String.class, String.class, SxChatDTO.a.class, List.class, ru.ozon.android.messenger.blocks.chat.common.e.class, ContextMenuDTO.class, cls2, cls);
                    this.constructorRef = constructor;
                    Intrinsics.checkNotNullExpressionValue(constructor, "also(...)");
                } else {
                    str = str6;
                }
                if (str == null) {
                    throw Y9.c.j(SelectionItemFormDTO.TITLE_FIELD_NAME, SelectionItemFormDTO.TITLE_FIELD_NAME, reader);
                }
                if (num2 == null) {
                    throw Y9.c.j("unreadCount", "unreadCount", reader);
                }
                if (previewDTO == null) {
                    throw Y9.c.j("preview", "preview", reader);
                }
                if (str5 == null) {
                    throw Y9.c.j("deeplink", "deeplink", reader);
                }
                if (aVar == null) {
                    throw Y9.c.j("displayType", "displayType", reader);
                }
                SxChatDTO newInstance = constructor.newInstance(str, list4, num2, unreadCountIndicatorDTO2, str3, previewDTO, icon, list2, str4, str5, aVar, list3, eVar, contextMenuDTO, Integer.valueOf(i12), null);
                Intrinsics.checkNotNullExpressionValue(newInstance, "newInstance(...)");
                return newInstance;
            }
            UnreadCountIndicatorDTO unreadCountIndicatorDTO3 = unreadCountIndicatorDTO;
            switch (reader.v(this.options)) {
                case -1:
                    reader.y();
                    reader.skipValue();
                    unreadCountIndicatorDTO = unreadCountIndicatorDTO3;
                    str2 = str6;
                    list = list4;
                    num = num2;
                case 0:
                    str2 = this.stringAdapter.fromJson(reader);
                    if (str2 == null) {
                        throw Y9.c.q(SelectionItemFormDTO.TITLE_FIELD_NAME, SelectionItemFormDTO.TITLE_FIELD_NAME, reader);
                    }
                    unreadCountIndicatorDTO = unreadCountIndicatorDTO3;
                    list = list4;
                    num = num2;
                case 1:
                    list = this.nullableListOfIconAdapter.fromJson(reader);
                    unreadCountIndicatorDTO = unreadCountIndicatorDTO3;
                    str2 = str6;
                    num = num2;
                case 2:
                    num = this.intAdapter.fromJson(reader);
                    if (num == null) {
                        throw Y9.c.q("unreadCount", "unreadCount", reader);
                    }
                    unreadCountIndicatorDTO = unreadCountIndicatorDTO3;
                    str2 = str6;
                    list = list4;
                case 3:
                    unreadCountIndicatorDTO = this.nullableUnreadCountIndicatorDTOAdapter.fromJson(reader);
                    str2 = str6;
                    list = list4;
                    num = num2;
                case 4:
                    str3 = this.nullableStringAdapter.fromJson(reader);
                    i11 &= -17;
                    unreadCountIndicatorDTO = unreadCountIndicatorDTO3;
                    str2 = str6;
                    list = list4;
                    num = num2;
                case 5:
                    previewDTO = this.previewDTOAdapter.fromJson(reader);
                    if (previewDTO == null) {
                        throw Y9.c.q("preview", "preview", reader);
                    }
                    unreadCountIndicatorDTO = unreadCountIndicatorDTO3;
                    str2 = str6;
                    list = list4;
                    num = num2;
                case 6:
                    icon = this.nullableIconAdapter.fromJson(reader);
                    i11 &= -65;
                    unreadCountIndicatorDTO = unreadCountIndicatorDTO3;
                    str2 = str6;
                    list = list4;
                    num = num2;
                case 7:
                    list2 = this.nullableListOfBadgeDTOAdapter.fromJson(reader);
                    i11 &= -129;
                    unreadCountIndicatorDTO = unreadCountIndicatorDTO3;
                    str2 = str6;
                    list = list4;
                    num = num2;
                case 8:
                    str4 = this.nullableStringAdapter.fromJson(reader);
                    i11 &= -257;
                    unreadCountIndicatorDTO = unreadCountIndicatorDTO3;
                    str2 = str6;
                    list = list4;
                    num = num2;
                case 9:
                    str5 = this.stringAdapter.fromJson(reader);
                    if (str5 == null) {
                        throw Y9.c.q("deeplink", "deeplink", reader);
                    }
                    unreadCountIndicatorDTO = unreadCountIndicatorDTO3;
                    str2 = str6;
                    list = list4;
                    num = num2;
                case 10:
                    aVar = this.displayTypeDTOAdapter.fromJson(reader);
                    if (aVar == null) {
                        throw Y9.c.q("displayType", "displayType", reader);
                    }
                    unreadCountIndicatorDTO = unreadCountIndicatorDTO3;
                    str2 = str6;
                    list = list4;
                    num = num2;
                case 11:
                    list3 = this.nullableListOfContextMenuItemDTOAdapter.fromJson(reader);
                    unreadCountIndicatorDTO = unreadCountIndicatorDTO3;
                    str2 = str6;
                    list = list4;
                    num = num2;
                case 12:
                    eVar = this.nullableChatBlockAnimationTypeAdapter.fromJson(reader);
                    unreadCountIndicatorDTO = unreadCountIndicatorDTO3;
                    str2 = str6;
                    list = list4;
                    num = num2;
                case 13:
                    contextMenuDTO = this.nullableContextMenuDTOAdapter.fromJson(reader);
                    unreadCountIndicatorDTO = unreadCountIndicatorDTO3;
                    str2 = str6;
                    list = list4;
                    num = num2;
                default:
                    unreadCountIndicatorDTO = unreadCountIndicatorDTO3;
                    str2 = str6;
                    list = list4;
                    num = num2;
            }
        }
    }

    @Override // com.squareup.moshi.JsonAdapter
    /* renamed from: toJson, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
    public void mo44toJson(@NotNull x writer, SxChatDTO value_) {
        Intrinsics.checkNotNullParameter(writer, "writer");
        if (value_ == null) {
            throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
        }
        writer.j();
        writer.w(SelectionItemFormDTO.TITLE_FIELD_NAME);
        this.stringAdapter.mo44toJson(writer, (x) value_.getTitle());
        writer.w("titleIcons");
        this.nullableListOfIconAdapter.mo44toJson(writer, (x) value_.getTitleIcons());
        writer.w("unreadCount");
        this.intAdapter.mo44toJson(writer, (x) Integer.valueOf(value_.getUnreadCount()));
        writer.w("unreadCountIndicator");
        this.nullableUnreadCountIndicatorDTOAdapter.mo44toJson(writer, (x) value_.getUnreadCountIndicator());
        writer.w("firstUnreadMessageId");
        this.nullableStringAdapter.mo44toJson(writer, (x) value_.getFirstUnreadMessageId());
        writer.w("preview");
        this.previewDTOAdapter.mo44toJson(writer, (x) value_.getPreview());
        writer.w("trustIcon");
        this.nullableIconAdapter.mo44toJson(writer, (x) value_.getTrustIcon());
        writer.w("previewBadges");
        this.nullableListOfBadgeDTOAdapter.mo44toJson(writer, (x) value_.getPreviewBadges());
        writer.w("conversationId");
        this.nullableStringAdapter.mo44toJson(writer, (x) value_.getConversationId());
        writer.w("deeplink");
        this.stringAdapter.mo44toJson(writer, (x) value_.getDeeplink());
        writer.w("displayType");
        this.displayTypeDTOAdapter.mo44toJson(writer, (x) value_.getDisplayType());
        writer.w("contextMenuItems");
        this.nullableListOfContextMenuItemDTOAdapter.mo44toJson(writer, (x) value_.getContextMenuItems());
        writer.w("animation");
        this.nullableChatBlockAnimationTypeAdapter.mo44toJson(writer, (x) value_.getAnimation());
        writer.w("contextMenu");
        this.nullableContextMenuDTOAdapter.mo44toJson(writer, (x) value_.getContextMenu());
        writer.p();
    }
}
