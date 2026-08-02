package ru.ozon.android.messenger.blocks.chat.bx;

import B0.C2454a;
import El.C2971a;
import G.g;
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
import ru.ozon.uni.atoms.data.icon.IconDTO;

@j(generateAdapter = true)
@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u001b\n\u0002\u0010\u000b\n\u0002\b\u0018\b\u0081\b\u0018\u00002\u00020\u0001By\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u000e\u0010\u000f\u001a\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010\r\u0012\u0006\u0010\u0010\u001a\u00020\u0002\u0012\u000e\u0010\u0012\u001a\n\u0012\u0004\u0012\u00020\u0011\u0018\u00010\r\u0012\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013\u0012\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u001d\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b\u001d\u0010\u001eJ\u0012\u0010\u001f\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0004\b\u001f\u0010 J\u0012\u0010!\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b!\u0010\u001aJ\u0010\u0010\"\u001a\u00020\u000bHÆ\u0003¢\u0006\u0004\b\"\u0010#J\u0018\u0010$\u001a\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010\rHÆ\u0003¢\u0006\u0004\b$\u0010%J\u0010\u0010&\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b&\u0010\u001aJ\u0018\u0010'\u001a\n\u0012\u0004\u0012\u00020\u0011\u0018\u00010\rHÆ\u0003¢\u0006\u0004\b'\u0010%J\u0012\u0010(\u001a\u0004\u0018\u00010\u0013HÆ\u0003¢\u0006\u0004\b(\u0010)J\u0012\u0010*\u001a\u0004\u0018\u00010\u0015HÆ\u0003¢\u0006\u0004\b*\u0010+J\u0096\u0001\u0010,\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\f\u001a\u00020\u000b2\u0010\b\u0002\u0010\u000f\u001a\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010\r2\b\b\u0002\u0010\u0010\u001a\u00020\u00022\u0010\b\u0002\u0010\u0012\u001a\n\u0012\u0004\u0012\u00020\u0011\u0018\u00010\r2\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u00132\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u0015HÆ\u0001¢\u0006\u0004\b,\u0010-J\u0010\u0010.\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b.\u0010\u001aJ\u0010\u0010/\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b/\u0010\u001eJ\u001a\u00102\u001a\u0002012\b\u00100\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b2\u00103R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u00104\u001a\u0004\b5\u0010\u001aR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u00106\u001a\u0004\b7\u0010\u001cR \u0010\u0007\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0007\u00108\u0012\u0004\b:\u0010;\u001a\u0004\b9\u0010\u001eR\u0019\u0010\t\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b\t\u0010<\u001a\u0004\b=\u0010 R\u0019\u0010\n\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\n\u00104\u001a\u0004\b>\u0010\u001aR\u0017\u0010\f\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\b\f\u0010?\u001a\u0004\b@\u0010#R\u001f\u0010\u000f\u001a\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010\r8\u0006¢\u0006\f\n\u0004\b\u000f\u0010A\u001a\u0004\bB\u0010%R\u0017\u0010\u0010\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u00104\u001a\u0004\bC\u0010\u001aR\u001f\u0010\u0012\u001a\n\u0012\u0004\u0012\u00020\u0011\u0018\u00010\r8\u0006¢\u0006\f\n\u0004\b\u0012\u0010A\u001a\u0004\bD\u0010%R\u0019\u0010\u0014\u001a\u0004\u0018\u00010\u00138\u0006¢\u0006\f\n\u0004\b\u0014\u0010E\u001a\u0004\bF\u0010)R\u0019\u0010\u0016\u001a\u0004\u0018\u00010\u00158\u0006¢\u0006\f\n\u0004\b\u0016\u0010G\u001a\u0004\bH\u0010+¨\u0006I"}, d2 = {"Lru/ozon/android/messenger/blocks/chat/bx/BxChatDTO;", "", "", SelectionItemFormDTO.TITLE_FIELD_NAME, "Lru/ozon/uni/atoms/data/icon/IconDTO;", "avatarIcon", "", "unreadCount", "Lru/ozon/android/messenger/blocks/chat/common/UnreadCountIndicatorDTO;", "unreadCountIndicator", "firstUnreadMessageId", "Lru/ozon/android/messenger/blocks/chat/common/PreviewDTO;", "preview", "", "Lru/ozon/uni/atoms/data/button/Icon;", "titleIcons", "deeplink", "Lru/ozon/android/messenger/blocks/chat/common/menuItems/ContextMenuItemDTO;", "contextMenuItems", "Lru/ozon/android/messenger/blocks/chat/common/e;", "animation", "Lru/ozon/android/messenger/framework/data/remote/models/items/ContextMenuDTO;", "contextMenu", "<init>", "(Ljava/lang/String;Lru/ozon/uni/atoms/data/icon/IconDTO;ILru/ozon/android/messenger/blocks/chat/common/UnreadCountIndicatorDTO;Ljava/lang/String;Lru/ozon/android/messenger/blocks/chat/common/PreviewDTO;Ljava/util/List;Ljava/lang/String;Ljava/util/List;Lru/ozon/android/messenger/blocks/chat/common/e;Lru/ozon/android/messenger/framework/data/remote/models/items/ContextMenuDTO;)V", "component1", "()Ljava/lang/String;", "component2", "()Lru/ozon/uni/atoms/data/icon/IconDTO;", "component3", "()I", "component4", "()Lru/ozon/android/messenger/blocks/chat/common/UnreadCountIndicatorDTO;", "component5", "component6", "()Lru/ozon/android/messenger/blocks/chat/common/PreviewDTO;", "component7", "()Ljava/util/List;", "component8", "component9", "component10", "()Lru/ozon/android/messenger/blocks/chat/common/e;", "component11", "()Lru/ozon/android/messenger/framework/data/remote/models/items/ContextMenuDTO;", "copy", "(Ljava/lang/String;Lru/ozon/uni/atoms/data/icon/IconDTO;ILru/ozon/android/messenger/blocks/chat/common/UnreadCountIndicatorDTO;Ljava/lang/String;Lru/ozon/android/messenger/blocks/chat/common/PreviewDTO;Ljava/util/List;Ljava/lang/String;Ljava/util/List;Lru/ozon/android/messenger/blocks/chat/common/e;Lru/ozon/android/messenger/framework/data/remote/models/items/ContextMenuDTO;)Lru/ozon/android/messenger/blocks/chat/bx/BxChatDTO;", "toString", "hashCode", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getTitle", "Lru/ozon/uni/atoms/data/icon/IconDTO;", "getAvatarIcon", "I", "getUnreadCount", "getUnreadCount$annotations", "()V", "Lru/ozon/android/messenger/blocks/chat/common/UnreadCountIndicatorDTO;", "getUnreadCountIndicator", "getFirstUnreadMessageId", "Lru/ozon/android/messenger/blocks/chat/common/PreviewDTO;", "getPreview", "Ljava/util/List;", "getTitleIcons", "getDeeplink", "getContextMenuItems", "Lru/ozon/android/messenger/blocks/chat/common/e;", "getAnimation", "Lru/ozon/android/messenger/framework/data/remote/models/items/ContextMenuDTO;", "getContextMenu", "messenger_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes10.dex */
public final /* data */ class BxChatDTO {
    public static final int $stable = 8;
    private final ru.ozon.android.messenger.blocks.chat.common.e animation;

    @NotNull
    private final IconDTO avatarIcon;
    private final ContextMenuDTO contextMenu;
    private final List<ContextMenuItemDTO> contextMenuItems;

    @NotNull
    private final String deeplink;
    private final String firstUnreadMessageId;

    @NotNull
    private final PreviewDTO preview;

    @NotNull
    private final String title;
    private final List<Icon> titleIcons;
    private final int unreadCount;
    private final UnreadCountIndicatorDTO unreadCountIndicator;

    public BxChatDTO(@NotNull String title, @NotNull IconDTO avatarIcon, int i11, UnreadCountIndicatorDTO unreadCountIndicatorDTO, String str, @NotNull PreviewDTO preview, List<Icon> list, @NotNull String deeplink, List<ContextMenuItemDTO> list2, ru.ozon.android.messenger.blocks.chat.common.e eVar, ContextMenuDTO contextMenuDTO) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(avatarIcon, "avatarIcon");
        Intrinsics.checkNotNullParameter(preview, "preview");
        Intrinsics.checkNotNullParameter(deeplink, "deeplink");
        this.title = title;
        this.avatarIcon = avatarIcon;
        this.unreadCount = i11;
        this.unreadCountIndicator = unreadCountIndicatorDTO;
        this.firstUnreadMessageId = str;
        this.preview = preview;
        this.titleIcons = list;
        this.deeplink = deeplink;
        this.contextMenuItems = list2;
        this.animation = eVar;
        this.contextMenu = contextMenuDTO;
    }

    public static /* synthetic */ BxChatDTO copy$default(BxChatDTO bxChatDTO, String str, IconDTO iconDTO, int i11, UnreadCountIndicatorDTO unreadCountIndicatorDTO, String str2, PreviewDTO previewDTO, List list, String str3, List list2, ru.ozon.android.messenger.blocks.chat.common.e eVar, ContextMenuDTO contextMenuDTO, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            str = bxChatDTO.title;
        }
        if ((i12 & 2) != 0) {
            iconDTO = bxChatDTO.avatarIcon;
        }
        if ((i12 & 4) != 0) {
            i11 = bxChatDTO.unreadCount;
        }
        if ((i12 & 8) != 0) {
            unreadCountIndicatorDTO = bxChatDTO.unreadCountIndicator;
        }
        if ((i12 & 16) != 0) {
            str2 = bxChatDTO.firstUnreadMessageId;
        }
        if ((i12 & 32) != 0) {
            previewDTO = bxChatDTO.preview;
        }
        if ((i12 & 64) != 0) {
            list = bxChatDTO.titleIcons;
        }
        if ((i12 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0) {
            str3 = bxChatDTO.deeplink;
        }
        if ((i12 & 256) != 0) {
            list2 = bxChatDTO.contextMenuItems;
        }
        if ((i12 & UserVerificationMethods.USER_VERIFY_NONE) != 0) {
            eVar = bxChatDTO.animation;
        }
        if ((i12 & UserVerificationMethods.USER_VERIFY_ALL) != 0) {
            contextMenuDTO = bxChatDTO.contextMenu;
        }
        ru.ozon.android.messenger.blocks.chat.common.e eVar2 = eVar;
        ContextMenuDTO contextMenuDTO2 = contextMenuDTO;
        String str4 = str3;
        List list3 = list2;
        PreviewDTO previewDTO2 = previewDTO;
        List list4 = list;
        String str5 = str2;
        int i13 = i11;
        return bxChatDTO.copy(str, iconDTO, i13, unreadCountIndicatorDTO, str5, previewDTO2, list4, str4, list3, eVar2, contextMenuDTO2);
    }

    @InterfaceC3999a
    public static /* synthetic */ void getUnreadCount$annotations() {
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    /* renamed from: component10, reason: from getter */
    public final ru.ozon.android.messenger.blocks.chat.common.e getAnimation() {
        return this.animation;
    }

    /* renamed from: component11, reason: from getter */
    public final ContextMenuDTO getContextMenu() {
        return this.contextMenu;
    }

    @NotNull
    /* renamed from: component2, reason: from getter */
    public final IconDTO getAvatarIcon() {
        return this.avatarIcon;
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

    public final List<Icon> component7() {
        return this.titleIcons;
    }

    @NotNull
    /* renamed from: component8, reason: from getter */
    public final String getDeeplink() {
        return this.deeplink;
    }

    public final List<ContextMenuItemDTO> component9() {
        return this.contextMenuItems;
    }

    @NotNull
    public final BxChatDTO copy(@NotNull String title, @NotNull IconDTO avatarIcon, int unreadCount, UnreadCountIndicatorDTO unreadCountIndicator, String firstUnreadMessageId, @NotNull PreviewDTO preview, List<Icon> titleIcons, @NotNull String deeplink, List<ContextMenuItemDTO> contextMenuItems, ru.ozon.android.messenger.blocks.chat.common.e animation, ContextMenuDTO contextMenu) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(avatarIcon, "avatarIcon");
        Intrinsics.checkNotNullParameter(preview, "preview");
        Intrinsics.checkNotNullParameter(deeplink, "deeplink");
        return new BxChatDTO(title, avatarIcon, unreadCount, unreadCountIndicator, firstUnreadMessageId, preview, titleIcons, deeplink, contextMenuItems, animation, contextMenu);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof BxChatDTO)) {
            return false;
        }
        BxChatDTO bxChatDTO = (BxChatDTO) other;
        return Intrinsics.d(this.title, bxChatDTO.title) && Intrinsics.d(this.avatarIcon, bxChatDTO.avatarIcon) && this.unreadCount == bxChatDTO.unreadCount && Intrinsics.d(this.unreadCountIndicator, bxChatDTO.unreadCountIndicator) && Intrinsics.d(this.firstUnreadMessageId, bxChatDTO.firstUnreadMessageId) && Intrinsics.d(this.preview, bxChatDTO.preview) && Intrinsics.d(this.titleIcons, bxChatDTO.titleIcons) && Intrinsics.d(this.deeplink, bxChatDTO.deeplink) && Intrinsics.d(this.contextMenuItems, bxChatDTO.contextMenuItems) && this.animation == bxChatDTO.animation && Intrinsics.d(this.contextMenu, bxChatDTO.contextMenu);
    }

    public final ru.ozon.android.messenger.blocks.chat.common.e getAnimation() {
        return this.animation;
    }

    @NotNull
    public final IconDTO getAvatarIcon() {
        return this.avatarIcon;
    }

    public final ContextMenuDTO getContextMenu() {
        return this.contextMenu;
    }

    public final List<ContextMenuItemDTO> getContextMenuItems() {
        return this.contextMenuItems;
    }

    @NotNull
    public final String getDeeplink() {
        return this.deeplink;
    }

    public final String getFirstUnreadMessageId() {
        return this.firstUnreadMessageId;
    }

    @NotNull
    public final PreviewDTO getPreview() {
        return this.preview;
    }

    @NotNull
    public final String getTitle() {
        return this.title;
    }

    public final List<Icon> getTitleIcons() {
        return this.titleIcons;
    }

    public final int getUnreadCount() {
        return this.unreadCount;
    }

    public final UnreadCountIndicatorDTO getUnreadCountIndicator() {
        return this.unreadCountIndicator;
    }

    public int hashCode() {
        int a11 = C2454a.a(this.unreadCount, C2971a.a(this.avatarIcon, this.title.hashCode() * 31, 31), 31);
        UnreadCountIndicatorDTO unreadCountIndicatorDTO = this.unreadCountIndicator;
        int hashCode = (a11 + (unreadCountIndicatorDTO == null ? 0 : unreadCountIndicatorDTO.hashCode())) * 31;
        String str = this.firstUnreadMessageId;
        int hashCode2 = (this.preview.hashCode() + ((hashCode + (str == null ? 0 : str.hashCode())) * 31)) * 31;
        List<Icon> list = this.titleIcons;
        int a12 = g.a((hashCode2 + (list == null ? 0 : list.hashCode())) * 31, 31, this.deeplink);
        List<ContextMenuItemDTO> list2 = this.contextMenuItems;
        int hashCode3 = (a12 + (list2 == null ? 0 : list2.hashCode())) * 31;
        ru.ozon.android.messenger.blocks.chat.common.e eVar = this.animation;
        int hashCode4 = (hashCode3 + (eVar == null ? 0 : eVar.hashCode())) * 31;
        ContextMenuDTO contextMenuDTO = this.contextMenu;
        return hashCode4 + (contextMenuDTO != null ? contextMenuDTO.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        String str = this.title;
        IconDTO iconDTO = this.avatarIcon;
        int i11 = this.unreadCount;
        UnreadCountIndicatorDTO unreadCountIndicatorDTO = this.unreadCountIndicator;
        String str2 = this.firstUnreadMessageId;
        PreviewDTO previewDTO = this.preview;
        List<Icon> list = this.titleIcons;
        String str3 = this.deeplink;
        List<ContextMenuItemDTO> list2 = this.contextMenuItems;
        ru.ozon.android.messenger.blocks.chat.common.e eVar = this.animation;
        ContextMenuDTO contextMenuDTO = this.contextMenu;
        StringBuilder sb2 = new StringBuilder("BxChatDTO(title=");
        sb2.append(str);
        sb2.append(", avatarIcon=");
        sb2.append(iconDTO);
        sb2.append(", unreadCount=");
        sb2.append(i11);
        sb2.append(", unreadCountIndicator=");
        sb2.append(unreadCountIndicatorDTO);
        sb2.append(", firstUnreadMessageId=");
        sb2.append(str2);
        sb2.append(", preview=");
        sb2.append(previewDTO);
        sb2.append(", titleIcons=");
        Cm.e.i(", deeplink=", str3, ", contextMenuItems=", sb2, list);
        sb2.append(list2);
        sb2.append(", animation=");
        sb2.append(eVar);
        sb2.append(", contextMenu=");
        sb2.append(contextMenuDTO);
        sb2.append(")");
        return sb2.toString();
    }

    public /* synthetic */ BxChatDTO(String str, IconDTO iconDTO, int i11, UnreadCountIndicatorDTO unreadCountIndicatorDTO, String str2, PreviewDTO previewDTO, List list, String str3, List list2, ru.ozon.android.messenger.blocks.chat.common.e eVar, ContextMenuDTO contextMenuDTO, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, iconDTO, i11, unreadCountIndicatorDTO, (i12 & 16) != 0 ? null : str2, previewDTO, list, str3, list2, eVar, contextMenuDTO);
    }
}
