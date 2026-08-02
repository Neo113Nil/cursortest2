package ru.ozon.android.messenger.blocks.chat.sx;

import B0.C2454a;
import Sc.InterfaceC3999a;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import com.squareup.moshi.j;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.messenger.blocks.chat.common.PreviewDTO;
import ru.ozon.android.messenger.blocks.chat.common.UnreadCountIndicatorDTO;
import ru.ozon.android.messenger.blocks.chat.common.menuItems.ContextMenuItemDTO;
import ru.ozon.android.messenger.framework.data.remote.models.items.ContextMenuDTO;
import ru.ozon.app.android.ugc.widgets.selectionItemForm.data.SelectionItemFormDTO;
import ru.ozon.uni.atoms.data.button.Icon;
import ru.ozon.uni.atoms.data.dsBadge.BadgeDTO;

@j(generateAdapter = true)
@Metadata(d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u001f\n\u0002\u0010\u000b\n\u0002\b\u001d\b\u0081\b\u0018\u00002\u00020\u0001:\u0001UB£\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u000e\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\r\u001a\u00020\f\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u0005\u0012\u0010\b\u0002\u0010\u0010\u001a\n\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0012\u001a\u00020\u0002\u0012\u0006\u0010\u0014\u001a\u00020\u0013\u0012\u000e\u0010\u0016\u001a\n\u0012\u0004\u0012\u00020\u0015\u0018\u00010\u0004\u0012\b\u0010\u0018\u001a\u0004\u0018\u00010\u0017\u0012\b\u0010\u001a\u001a\u0004\u0018\u00010\u0019¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u001d\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001d\u0010\u001eJ\u0018\u0010\u001f\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u001f\u0010 J\u0010\u0010!\u001a\u00020\u0007HÆ\u0003¢\u0006\u0004\b!\u0010\"J\u0012\u0010#\u001a\u0004\u0018\u00010\tHÆ\u0003¢\u0006\u0004\b#\u0010$J\u0012\u0010%\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b%\u0010\u001eJ\u0010\u0010&\u001a\u00020\fHÆ\u0003¢\u0006\u0004\b&\u0010'J\u0012\u0010(\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0004\b(\u0010)J\u0018\u0010*\u001a\n\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b*\u0010 J\u0012\u0010+\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b+\u0010\u001eJ\u0010\u0010,\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b,\u0010\u001eJ\u0010\u0010-\u001a\u00020\u0013HÆ\u0003¢\u0006\u0004\b-\u0010.J\u0018\u0010/\u001a\n\u0012\u0004\u0012\u00020\u0015\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b/\u0010 J\u0012\u00100\u001a\u0004\u0018\u00010\u0017HÆ\u0003¢\u0006\u0004\b0\u00101J\u0012\u00102\u001a\u0004\u0018\u00010\u0019HÆ\u0003¢\u0006\u0004\b2\u00103JÀ\u0001\u00104\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\u0010\b\u0002\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00042\b\b\u0002\u0010\b\u001a\u00020\u00072\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\r\u001a\u00020\f2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u00052\u0010\b\u0002\u0010\u0010\u001a\n\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u00042\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u0012\u001a\u00020\u00022\b\b\u0002\u0010\u0014\u001a\u00020\u00132\u0010\b\u0002\u0010\u0016\u001a\n\u0012\u0004\u0012\u00020\u0015\u0018\u00010\u00042\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u00172\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u0019HÆ\u0001¢\u0006\u0004\b4\u00105J\u0010\u00106\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b6\u0010\u001eJ\u0010\u00107\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b7\u0010\"J\u001a\u0010:\u001a\u0002092\b\u00108\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b:\u0010;R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010<\u001a\u0004\b=\u0010\u001eR\u001f\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0006\u0010>\u001a\u0004\b?\u0010 R \u0010\b\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\b\u0010@\u0012\u0004\bB\u0010C\u001a\u0004\bA\u0010\"R\u0019\u0010\n\u001a\u0004\u0018\u00010\t8\u0006¢\u0006\f\n\u0004\b\n\u0010D\u001a\u0004\bE\u0010$R\u0019\u0010\u000b\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u000b\u0010<\u001a\u0004\bF\u0010\u001eR\u0017\u0010\r\u001a\u00020\f8\u0006¢\u0006\f\n\u0004\b\r\u0010G\u001a\u0004\bH\u0010'R\u0019\u0010\u000e\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b\u000e\u0010I\u001a\u0004\bJ\u0010)R\u001f\u0010\u0010\u001a\n\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0010\u0010>\u001a\u0004\bK\u0010 R\u0019\u0010\u0011\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010<\u001a\u0004\bL\u0010\u001eR\u0017\u0010\u0012\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010<\u001a\u0004\bM\u0010\u001eR\u0017\u0010\u0014\u001a\u00020\u00138\u0006¢\u0006\f\n\u0004\b\u0014\u0010N\u001a\u0004\bO\u0010.R\u001f\u0010\u0016\u001a\n\u0012\u0004\u0012\u00020\u0015\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0016\u0010>\u001a\u0004\bP\u0010 R\u0019\u0010\u0018\u001a\u0004\u0018\u00010\u00178\u0006¢\u0006\f\n\u0004\b\u0018\u0010Q\u001a\u0004\bR\u00101R\u0019\u0010\u001a\u001a\u0004\u0018\u00010\u00198\u0006¢\u0006\f\n\u0004\b\u001a\u0010S\u001a\u0004\bT\u00103¨\u0006V"}, d2 = {"Lru/ozon/android/messenger/blocks/chat/sx/SxChatDTO;", "", "", SelectionItemFormDTO.TITLE_FIELD_NAME, "", "Lru/ozon/uni/atoms/data/button/Icon;", "titleIcons", "", "unreadCount", "Lru/ozon/android/messenger/blocks/chat/common/UnreadCountIndicatorDTO;", "unreadCountIndicator", "firstUnreadMessageId", "Lru/ozon/android/messenger/blocks/chat/common/PreviewDTO;", "preview", "trustIcon", "Lru/ozon/uni/atoms/data/dsBadge/BadgeDTO;", "previewBadges", "conversationId", "deeplink", "Lru/ozon/android/messenger/blocks/chat/sx/SxChatDTO$a;", "displayType", "Lru/ozon/android/messenger/blocks/chat/common/menuItems/ContextMenuItemDTO;", "contextMenuItems", "Lru/ozon/android/messenger/blocks/chat/common/e;", "animation", "Lru/ozon/android/messenger/framework/data/remote/models/items/ContextMenuDTO;", "contextMenu", "<init>", "(Ljava/lang/String;Ljava/util/List;ILru/ozon/android/messenger/blocks/chat/common/UnreadCountIndicatorDTO;Ljava/lang/String;Lru/ozon/android/messenger/blocks/chat/common/PreviewDTO;Lru/ozon/uni/atoms/data/button/Icon;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Lru/ozon/android/messenger/blocks/chat/sx/SxChatDTO$a;Ljava/util/List;Lru/ozon/android/messenger/blocks/chat/common/e;Lru/ozon/android/messenger/framework/data/remote/models/items/ContextMenuDTO;)V", "component1", "()Ljava/lang/String;", "component2", "()Ljava/util/List;", "component3", "()I", "component4", "()Lru/ozon/android/messenger/blocks/chat/common/UnreadCountIndicatorDTO;", "component5", "component6", "()Lru/ozon/android/messenger/blocks/chat/common/PreviewDTO;", "component7", "()Lru/ozon/uni/atoms/data/button/Icon;", "component8", "component9", "component10", "component11", "()Lru/ozon/android/messenger/blocks/chat/sx/SxChatDTO$a;", "component12", "component13", "()Lru/ozon/android/messenger/blocks/chat/common/e;", "component14", "()Lru/ozon/android/messenger/framework/data/remote/models/items/ContextMenuDTO;", "copy", "(Ljava/lang/String;Ljava/util/List;ILru/ozon/android/messenger/blocks/chat/common/UnreadCountIndicatorDTO;Ljava/lang/String;Lru/ozon/android/messenger/blocks/chat/common/PreviewDTO;Lru/ozon/uni/atoms/data/button/Icon;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Lru/ozon/android/messenger/blocks/chat/sx/SxChatDTO$a;Ljava/util/List;Lru/ozon/android/messenger/blocks/chat/common/e;Lru/ozon/android/messenger/framework/data/remote/models/items/ContextMenuDTO;)Lru/ozon/android/messenger/blocks/chat/sx/SxChatDTO;", "toString", "hashCode", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getTitle", "Ljava/util/List;", "getTitleIcons", "I", "getUnreadCount", "getUnreadCount$annotations", "()V", "Lru/ozon/android/messenger/blocks/chat/common/UnreadCountIndicatorDTO;", "getUnreadCountIndicator", "getFirstUnreadMessageId", "Lru/ozon/android/messenger/blocks/chat/common/PreviewDTO;", "getPreview", "Lru/ozon/uni/atoms/data/button/Icon;", "getTrustIcon", "getPreviewBadges", "getConversationId", "getDeeplink", "Lru/ozon/android/messenger/blocks/chat/sx/SxChatDTO$a;", "getDisplayType", "getContextMenuItems", "Lru/ozon/android/messenger/blocks/chat/common/e;", "getAnimation", "Lru/ozon/android/messenger/framework/data/remote/models/items/ContextMenuDTO;", "getContextMenu", "a", "messenger_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes10.dex */
public final /* data */ class SxChatDTO {
    public static final int $stable = 8;
    private final ru.ozon.android.messenger.blocks.chat.common.e animation;
    private final ContextMenuDTO contextMenu;
    private final List<ContextMenuItemDTO> contextMenuItems;
    private final String conversationId;

    @NotNull
    private final String deeplink;

    @NotNull
    private final a displayType;
    private final String firstUnreadMessageId;

    @NotNull
    private final PreviewDTO preview;
    private final List<BadgeDTO> previewBadges;

    @NotNull
    private final String title;
    private final List<Icon> titleIcons;
    private final Icon trustIcon;
    private final int unreadCount;
    private final UnreadCountIndicatorDTO unreadCountIndicator;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class a {
        private static final /* synthetic */ Xc.a $ENTRIES;
        private static final /* synthetic */ a[] $VALUES;
        public static final a EXTENDED;
        public static final a INVALID;
        public static final a REGULAR;

        static {
            a aVar = new a("INVALID", 0);
            INVALID = aVar;
            a aVar2 = new a("REGULAR", 1);
            REGULAR = aVar2;
            a aVar3 = new a("EXTENDED", 2);
            EXTENDED = aVar3;
            a[] aVarArr = {aVar, aVar2, aVar3};
            $VALUES = aVarArr;
            $ENTRIES = Xc.b.a(aVarArr);
        }

        private a() {
            throw null;
        }

        public static a valueOf(String str) {
            return (a) Enum.valueOf(a.class, str);
        }

        public static a[] values() {
            return (a[]) $VALUES.clone();
        }
    }

    public SxChatDTO(@NotNull String title, List<Icon> list, int i11, UnreadCountIndicatorDTO unreadCountIndicatorDTO, String str, @NotNull PreviewDTO preview, Icon icon, List<BadgeDTO> list2, String str2, @NotNull String deeplink, @NotNull a displayType, List<ContextMenuItemDTO> list3, ru.ozon.android.messenger.blocks.chat.common.e eVar, ContextMenuDTO contextMenuDTO) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(preview, "preview");
        Intrinsics.checkNotNullParameter(deeplink, "deeplink");
        Intrinsics.checkNotNullParameter(displayType, "displayType");
        this.title = title;
        this.titleIcons = list;
        this.unreadCount = i11;
        this.unreadCountIndicator = unreadCountIndicatorDTO;
        this.firstUnreadMessageId = str;
        this.preview = preview;
        this.trustIcon = icon;
        this.previewBadges = list2;
        this.conversationId = str2;
        this.deeplink = deeplink;
        this.displayType = displayType;
        this.contextMenuItems = list3;
        this.animation = eVar;
        this.contextMenu = contextMenuDTO;
    }

    @InterfaceC3999a
    public static /* synthetic */ void getUnreadCount$annotations() {
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    @NotNull
    /* renamed from: component10, reason: from getter */
    public final String getDeeplink() {
        return this.deeplink;
    }

    @NotNull
    /* renamed from: component11, reason: from getter */
    public final a getDisplayType() {
        return this.displayType;
    }

    public final List<ContextMenuItemDTO> component12() {
        return this.contextMenuItems;
    }

    /* renamed from: component13, reason: from getter */
    public final ru.ozon.android.messenger.blocks.chat.common.e getAnimation() {
        return this.animation;
    }

    /* renamed from: component14, reason: from getter */
    public final ContextMenuDTO getContextMenu() {
        return this.contextMenu;
    }

    public final List<Icon> component2() {
        return this.titleIcons;
    }

    /* renamed from: component3, reason: from getter */
    public final int getUnreadCount() {
        return this.unreadCount;
    }

    /* renamed from: component4, reason: from getter */
    public final UnreadCountIndicatorDTO getUnreadCountIndicator() {
        return this.unreadCountIndicator;
    }

    /* renamed from: component5, reason: from getter */
    public final String getFirstUnreadMessageId() {
        return this.firstUnreadMessageId;
    }

    @NotNull
    /* renamed from: component6, reason: from getter */
    public final PreviewDTO getPreview() {
        return this.preview;
    }

    /* renamed from: component7, reason: from getter */
    public final Icon getTrustIcon() {
        return this.trustIcon;
    }

    public final List<BadgeDTO> component8() {
        return this.previewBadges;
    }

    /* renamed from: component9, reason: from getter */
    public final String getConversationId() {
        return this.conversationId;
    }

    @NotNull
    public final SxChatDTO copy(@NotNull String title, List<Icon> titleIcons, int unreadCount, UnreadCountIndicatorDTO unreadCountIndicator, String firstUnreadMessageId, @NotNull PreviewDTO preview, Icon trustIcon, List<BadgeDTO> previewBadges, String conversationId, @NotNull String deeplink, @NotNull a displayType, List<ContextMenuItemDTO> contextMenuItems, ru.ozon.android.messenger.blocks.chat.common.e animation, ContextMenuDTO contextMenu) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(preview, "preview");
        Intrinsics.checkNotNullParameter(deeplink, "deeplink");
        Intrinsics.checkNotNullParameter(displayType, "displayType");
        return new SxChatDTO(title, titleIcons, unreadCount, unreadCountIndicator, firstUnreadMessageId, preview, trustIcon, previewBadges, conversationId, deeplink, displayType, contextMenuItems, animation, contextMenu);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SxChatDTO)) {
            return false;
        }
        SxChatDTO sxChatDTO = (SxChatDTO) other;
        return Intrinsics.d(this.title, sxChatDTO.title) && Intrinsics.d(this.titleIcons, sxChatDTO.titleIcons) && this.unreadCount == sxChatDTO.unreadCount && Intrinsics.d(this.unreadCountIndicator, sxChatDTO.unreadCountIndicator) && Intrinsics.d(this.firstUnreadMessageId, sxChatDTO.firstUnreadMessageId) && Intrinsics.d(this.preview, sxChatDTO.preview) && Intrinsics.d(this.trustIcon, sxChatDTO.trustIcon) && Intrinsics.d(this.previewBadges, sxChatDTO.previewBadges) && Intrinsics.d(this.conversationId, sxChatDTO.conversationId) && Intrinsics.d(this.deeplink, sxChatDTO.deeplink) && this.displayType == sxChatDTO.displayType && Intrinsics.d(this.contextMenuItems, sxChatDTO.contextMenuItems) && this.animation == sxChatDTO.animation && Intrinsics.d(this.contextMenu, sxChatDTO.contextMenu);
    }

    public final ru.ozon.android.messenger.blocks.chat.common.e getAnimation() {
        return this.animation;
    }

    public final ContextMenuDTO getContextMenu() {
        return this.contextMenu;
    }

    public final List<ContextMenuItemDTO> getContextMenuItems() {
        return this.contextMenuItems;
    }

    public final String getConversationId() {
        return this.conversationId;
    }

    @NotNull
    public final String getDeeplink() {
        return this.deeplink;
    }

    @NotNull
    public final a getDisplayType() {
        return this.displayType;
    }

    public final String getFirstUnreadMessageId() {
        return this.firstUnreadMessageId;
    }

    @NotNull
    public final PreviewDTO getPreview() {
        return this.preview;
    }

    public final List<BadgeDTO> getPreviewBadges() {
        return this.previewBadges;
    }

    @NotNull
    public final String getTitle() {
        return this.title;
    }

    public final List<Icon> getTitleIcons() {
        return this.titleIcons;
    }

    public final Icon getTrustIcon() {
        return this.trustIcon;
    }

    public final int getUnreadCount() {
        return this.unreadCount;
    }

    public final UnreadCountIndicatorDTO getUnreadCountIndicator() {
        return this.unreadCountIndicator;
    }

    public int hashCode() {
        int hashCode = this.title.hashCode() * 31;
        List<Icon> list = this.titleIcons;
        int a11 = C2454a.a(this.unreadCount, (hashCode + (list == null ? 0 : list.hashCode())) * 31, 31);
        UnreadCountIndicatorDTO unreadCountIndicatorDTO = this.unreadCountIndicator;
        int hashCode2 = (a11 + (unreadCountIndicatorDTO == null ? 0 : unreadCountIndicatorDTO.hashCode())) * 31;
        String str = this.firstUnreadMessageId;
        int hashCode3 = (this.preview.hashCode() + ((hashCode2 + (str == null ? 0 : str.hashCode())) * 31)) * 31;
        Icon icon = this.trustIcon;
        int hashCode4 = (hashCode3 + (icon == null ? 0 : icon.hashCode())) * 31;
        List<BadgeDTO> list2 = this.previewBadges;
        int hashCode5 = (hashCode4 + (list2 == null ? 0 : list2.hashCode())) * 31;
        String str2 = this.conversationId;
        int hashCode6 = (this.displayType.hashCode() + G.g.a((hashCode5 + (str2 == null ? 0 : str2.hashCode())) * 31, 31, this.deeplink)) * 31;
        List<ContextMenuItemDTO> list3 = this.contextMenuItems;
        int hashCode7 = (hashCode6 + (list3 == null ? 0 : list3.hashCode())) * 31;
        ru.ozon.android.messenger.blocks.chat.common.e eVar = this.animation;
        int hashCode8 = (hashCode7 + (eVar == null ? 0 : eVar.hashCode())) * 31;
        ContextMenuDTO contextMenuDTO = this.contextMenu;
        return hashCode8 + (contextMenuDTO != null ? contextMenuDTO.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        String str = this.title;
        List<Icon> list = this.titleIcons;
        int i11 = this.unreadCount;
        UnreadCountIndicatorDTO unreadCountIndicatorDTO = this.unreadCountIndicator;
        String str2 = this.firstUnreadMessageId;
        PreviewDTO previewDTO = this.preview;
        Icon icon = this.trustIcon;
        List<BadgeDTO> list2 = this.previewBadges;
        String str3 = this.conversationId;
        String str4 = this.deeplink;
        a aVar = this.displayType;
        List<ContextMenuItemDTO> list3 = this.contextMenuItems;
        ru.ozon.android.messenger.blocks.chat.common.e eVar = this.animation;
        ContextMenuDTO contextMenuDTO = this.contextMenu;
        StringBuilder f7 = Tl.b.f("SxChatDTO(title=", str, ", titleIcons=", ", unreadCount=", list);
        f7.append(i11);
        f7.append(", unreadCountIndicator=");
        f7.append(unreadCountIndicatorDTO);
        f7.append(", firstUnreadMessageId=");
        f7.append(str2);
        f7.append(", preview=");
        f7.append(previewDTO);
        f7.append(", trustIcon=");
        f7.append(icon);
        f7.append(", previewBadges=");
        f7.append(list2);
        f7.append(", conversationId=");
        Nh.a.h(f7, str3, ", deeplink=", str4, ", displayType=");
        f7.append(aVar);
        f7.append(", contextMenuItems=");
        f7.append(list3);
        f7.append(", animation=");
        f7.append(eVar);
        f7.append(", contextMenu=");
        f7.append(contextMenuDTO);
        f7.append(")");
        return f7.toString();
    }

    public /* synthetic */ SxChatDTO(String str, List list, int i11, UnreadCountIndicatorDTO unreadCountIndicatorDTO, String str2, PreviewDTO previewDTO, Icon icon, List list2, String str3, String str4, a aVar, List list3, ru.ozon.android.messenger.blocks.chat.common.e eVar, ContextMenuDTO contextMenuDTO, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, list, i11, unreadCountIndicatorDTO, (i12 & 16) != 0 ? null : str2, previewDTO, (i12 & 64) != 0 ? null : icon, (i12 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0 ? null : list2, (i12 & 256) != 0 ? null : str3, str4, aVar, list3, eVar, contextMenuDTO);
    }
}
