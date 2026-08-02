package ru.ozon.android.messenger.blocks.chat.old;

import Bl.C2639a;
import G.g;
import com.google.android.gms.common.internal.ImagesContract;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import com.squareup.moshi.i;
import com.squareup.moshi.j;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.joda.time.DateTime;
import ru.ozon.android.messenger.blocks.chat.common.UnreadCountIndicatorDTO;
import ru.ozon.android.messenger.blocks.chat.common.menuItems.ContextMenuItemDTO;
import ru.ozon.android.messenger.framework.data.remote.models.items.ContextMenuDTO;
import ru.ozon.uni.atoms.data.button.Icon;
import ru.ozon.uni.atoms.data.icon.IconDTO;
import ru.ozon.uni.atoms.data.text.TextDTO;

@j(generateAdapter = true)
@Metadata(d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u001a\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0018\b\u0081\b\u0018\u00002\u00020\u0001:\u0001LB\u0081\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f\u0012\u000e\u0010\u0010\u001a\n\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u000e\u0012\u0006\u0010\u0011\u001a\u00020\n\u0012\u000e\u0010\u0013\u001a\n\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u000e\u0012\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014\u0012\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001a\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001a\u0010\u001bJ\u0012\u0010\u001c\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u001c\u0010\u001dJ\u0012\u0010\u001e\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b\u001e\u0010\u001fJ\u0010\u0010 \u001a\u00020\bHÆ\u0003¢\u0006\u0004\b \u0010!J\u0012\u0010\"\u001a\u0004\u0018\u00010\nHÆ\u0003¢\u0006\u0004\b\"\u0010#J\u0012\u0010$\u001a\u0004\u0018\u00010\fHÆ\u0003¢\u0006\u0004\b$\u0010%J\u0018\u0010&\u001a\n\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u000eHÆ\u0003¢\u0006\u0004\b&\u0010'J\u0010\u0010(\u001a\u00020\nHÆ\u0003¢\u0006\u0004\b(\u0010#J\u0018\u0010)\u001a\n\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u000eHÆ\u0003¢\u0006\u0004\b)\u0010'J\u0012\u0010*\u001a\u0004\u0018\u00010\u0014HÆ\u0003¢\u0006\u0004\b*\u0010+J\u0012\u0010,\u001a\u0004\u0018\u00010\u0016HÆ\u0003¢\u0006\u0004\b,\u0010-J\u009a\u0001\u0010.\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\b\b\u0002\u0010\t\u001a\u00020\b2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f2\u0010\b\u0002\u0010\u0010\u001a\n\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u000e2\b\b\u0002\u0010\u0011\u001a\u00020\n2\u0010\b\u0002\u0010\u0013\u001a\n\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u000e2\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u00142\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u0016HÆ\u0001¢\u0006\u0004\b.\u0010/J\u0010\u00100\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b0\u0010#J\u0010\u00102\u001a\u000201HÖ\u0001¢\u0006\u0004\b2\u00103J\u001a\u00106\u001a\u0002052\b\u00104\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b6\u00107R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u00108\u001a\u0004\b9\u0010\u001bR\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010:\u001a\u0004\b;\u0010\u001dR\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010<\u001a\u0004\b=\u0010\u001fR\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\t\u0010>\u001a\u0004\b?\u0010!R\u0019\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0006¢\u0006\f\n\u0004\b\u000b\u0010@\u001a\u0004\bA\u0010#R\u0019\u0010\r\u001a\u0004\u0018\u00010\f8\u0006¢\u0006\f\n\u0004\b\r\u0010B\u001a\u0004\bC\u0010%R\u001f\u0010\u0010\u001a\n\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u000e8\u0006¢\u0006\f\n\u0004\b\u0010\u0010D\u001a\u0004\bE\u0010'R\u0017\u0010\u0011\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b\u0011\u0010@\u001a\u0004\bF\u0010#R\u001f\u0010\u0013\u001a\n\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u000e8\u0006¢\u0006\f\n\u0004\b\u0013\u0010D\u001a\u0004\bG\u0010'R\u0019\u0010\u0015\u001a\u0004\u0018\u00010\u00148\u0006¢\u0006\f\n\u0004\b\u0015\u0010H\u001a\u0004\bI\u0010+R\u0019\u0010\u0017\u001a\u0004\u0018\u00010\u00168\u0006¢\u0006\f\n\u0004\b\u0017\u0010J\u001a\u0004\bK\u0010-¨\u0006M"}, d2 = {"Lru/ozon/android/messenger/blocks/chat/old/ChatDTO;", "", "Lru/ozon/uni/atoms/data/text/TextDTO;", "titleAtom", "Lru/ozon/uni/atoms/data/icon/IconDTO;", "avatarIcon", "Lru/ozon/android/messenger/blocks/chat/common/a;", "avatarIconVerticalAlignment", "Lru/ozon/android/messenger/blocks/chat/common/UnreadCountIndicatorDTO;", "unreadCountIndicator", "", "firstUnreadMessageId", "Lru/ozon/android/messenger/blocks/chat/old/ChatDTO$PreviewDTO;", "lastMessagePreview", "", "Lru/ozon/uni/atoms/data/button/Icon;", "titleIcons", "deeplink", "Lru/ozon/android/messenger/blocks/chat/common/menuItems/ContextMenuItemDTO;", "contextMenuItems", "Lru/ozon/android/messenger/blocks/chat/common/e;", "animation", "Lru/ozon/android/messenger/framework/data/remote/models/items/ContextMenuDTO;", "contextMenu", "<init>", "(Lru/ozon/uni/atoms/data/text/TextDTO;Lru/ozon/uni/atoms/data/icon/IconDTO;Lru/ozon/android/messenger/blocks/chat/common/a;Lru/ozon/android/messenger/blocks/chat/common/UnreadCountIndicatorDTO;Ljava/lang/String;Lru/ozon/android/messenger/blocks/chat/old/ChatDTO$PreviewDTO;Ljava/util/List;Ljava/lang/String;Ljava/util/List;Lru/ozon/android/messenger/blocks/chat/common/e;Lru/ozon/android/messenger/framework/data/remote/models/items/ContextMenuDTO;)V", "component1", "()Lru/ozon/uni/atoms/data/text/TextDTO;", "component2", "()Lru/ozon/uni/atoms/data/icon/IconDTO;", "component3", "()Lru/ozon/android/messenger/blocks/chat/common/a;", "component4", "()Lru/ozon/android/messenger/blocks/chat/common/UnreadCountIndicatorDTO;", "component5", "()Ljava/lang/String;", "component6", "()Lru/ozon/android/messenger/blocks/chat/old/ChatDTO$PreviewDTO;", "component7", "()Ljava/util/List;", "component8", "component9", "component10", "()Lru/ozon/android/messenger/blocks/chat/common/e;", "component11", "()Lru/ozon/android/messenger/framework/data/remote/models/items/ContextMenuDTO;", "copy", "(Lru/ozon/uni/atoms/data/text/TextDTO;Lru/ozon/uni/atoms/data/icon/IconDTO;Lru/ozon/android/messenger/blocks/chat/common/a;Lru/ozon/android/messenger/blocks/chat/common/UnreadCountIndicatorDTO;Ljava/lang/String;Lru/ozon/android/messenger/blocks/chat/old/ChatDTO$PreviewDTO;Ljava/util/List;Ljava/lang/String;Ljava/util/List;Lru/ozon/android/messenger/blocks/chat/common/e;Lru/ozon/android/messenger/framework/data/remote/models/items/ContextMenuDTO;)Lru/ozon/android/messenger/blocks/chat/old/ChatDTO;", "toString", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lru/ozon/uni/atoms/data/text/TextDTO;", "getTitleAtom", "Lru/ozon/uni/atoms/data/icon/IconDTO;", "getAvatarIcon", "Lru/ozon/android/messenger/blocks/chat/common/a;", "getAvatarIconVerticalAlignment", "Lru/ozon/android/messenger/blocks/chat/common/UnreadCountIndicatorDTO;", "getUnreadCountIndicator", "Ljava/lang/String;", "getFirstUnreadMessageId", "Lru/ozon/android/messenger/blocks/chat/old/ChatDTO$PreviewDTO;", "getLastMessagePreview", "Ljava/util/List;", "getTitleIcons", "getDeeplink", "getContextMenuItems", "Lru/ozon/android/messenger/blocks/chat/common/e;", "getAnimation", "Lru/ozon/android/messenger/framework/data/remote/models/items/ContextMenuDTO;", "getContextMenu", "PreviewDTO", "messenger_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes10.dex */
public final /* data */ class ChatDTO {
    public static final int $stable = 8;
    private final ru.ozon.android.messenger.blocks.chat.common.e animation;
    private final IconDTO avatarIcon;
    private final ru.ozon.android.messenger.blocks.chat.common.a avatarIconVerticalAlignment;
    private final ContextMenuDTO contextMenu;
    private final List<ContextMenuItemDTO> contextMenuItems;

    @NotNull
    private final String deeplink;
    private final String firstUnreadMessageId;
    private final PreviewDTO lastMessagePreview;

    @NotNull
    private final TextDTO titleAtom;
    private final List<Icon> titleIcons;

    @NotNull
    private final UnreadCountIndicatorDTO unreadCountIndicator;

    public ChatDTO(@NotNull TextDTO titleAtom, IconDTO iconDTO, ru.ozon.android.messenger.blocks.chat.common.a aVar, @NotNull UnreadCountIndicatorDTO unreadCountIndicator, String str, PreviewDTO previewDTO, List<Icon> list, @NotNull String deeplink, List<ContextMenuItemDTO> list2, ru.ozon.android.messenger.blocks.chat.common.e eVar, ContextMenuDTO contextMenuDTO) {
        Intrinsics.checkNotNullParameter(titleAtom, "titleAtom");
        Intrinsics.checkNotNullParameter(unreadCountIndicator, "unreadCountIndicator");
        Intrinsics.checkNotNullParameter(deeplink, "deeplink");
        this.titleAtom = titleAtom;
        this.avatarIcon = iconDTO;
        this.avatarIconVerticalAlignment = aVar;
        this.unreadCountIndicator = unreadCountIndicator;
        this.firstUnreadMessageId = str;
        this.lastMessagePreview = previewDTO;
        this.titleIcons = list;
        this.deeplink = deeplink;
        this.contextMenuItems = list2;
        this.animation = eVar;
        this.contextMenu = contextMenuDTO;
    }

    public static /* synthetic */ ChatDTO copy$default(ChatDTO chatDTO, TextDTO textDTO, IconDTO iconDTO, ru.ozon.android.messenger.blocks.chat.common.a aVar, UnreadCountIndicatorDTO unreadCountIndicatorDTO, String str, PreviewDTO previewDTO, List list, String str2, List list2, ru.ozon.android.messenger.blocks.chat.common.e eVar, ContextMenuDTO contextMenuDTO, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            textDTO = chatDTO.titleAtom;
        }
        if ((i11 & 2) != 0) {
            iconDTO = chatDTO.avatarIcon;
        }
        if ((i11 & 4) != 0) {
            aVar = chatDTO.avatarIconVerticalAlignment;
        }
        if ((i11 & 8) != 0) {
            unreadCountIndicatorDTO = chatDTO.unreadCountIndicator;
        }
        if ((i11 & 16) != 0) {
            str = chatDTO.firstUnreadMessageId;
        }
        if ((i11 & 32) != 0) {
            previewDTO = chatDTO.lastMessagePreview;
        }
        if ((i11 & 64) != 0) {
            list = chatDTO.titleIcons;
        }
        if ((i11 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0) {
            str2 = chatDTO.deeplink;
        }
        if ((i11 & 256) != 0) {
            list2 = chatDTO.contextMenuItems;
        }
        if ((i11 & UserVerificationMethods.USER_VERIFY_NONE) != 0) {
            eVar = chatDTO.animation;
        }
        if ((i11 & UserVerificationMethods.USER_VERIFY_ALL) != 0) {
            contextMenuDTO = chatDTO.contextMenu;
        }
        ru.ozon.android.messenger.blocks.chat.common.e eVar2 = eVar;
        ContextMenuDTO contextMenuDTO2 = contextMenuDTO;
        String str3 = str2;
        List list3 = list2;
        PreviewDTO previewDTO2 = previewDTO;
        List list4 = list;
        String str4 = str;
        ru.ozon.android.messenger.blocks.chat.common.a aVar2 = aVar;
        return chatDTO.copy(textDTO, iconDTO, aVar2, unreadCountIndicatorDTO, str4, previewDTO2, list4, str3, list3, eVar2, contextMenuDTO2);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final TextDTO getTitleAtom() {
        return this.titleAtom;
    }

    /* renamed from: component10, reason: from getter */
    public final ru.ozon.android.messenger.blocks.chat.common.e getAnimation() {
        return this.animation;
    }

    /* renamed from: component11, reason: from getter */
    public final ContextMenuDTO getContextMenu() {
        return this.contextMenu;
    }

    /* renamed from: component2, reason: from getter */
    public final IconDTO getAvatarIcon() {
        return this.avatarIcon;
    }

    /* renamed from: component3, reason: from getter */
    public final ru.ozon.android.messenger.blocks.chat.common.a getAvatarIconVerticalAlignment() {
        return this.avatarIconVerticalAlignment;
    }

    @NotNull
    /* renamed from: component4, reason: from getter */
    public final UnreadCountIndicatorDTO getUnreadCountIndicator() {
        return this.unreadCountIndicator;
    }

    /* renamed from: component5, reason: from getter */
    public final String getFirstUnreadMessageId() {
        return this.firstUnreadMessageId;
    }

    /* renamed from: component6, reason: from getter */
    public final PreviewDTO getLastMessagePreview() {
        return this.lastMessagePreview;
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
    public final ChatDTO copy(@NotNull TextDTO titleAtom, IconDTO avatarIcon, ru.ozon.android.messenger.blocks.chat.common.a avatarIconVerticalAlignment, @NotNull UnreadCountIndicatorDTO unreadCountIndicator, String firstUnreadMessageId, PreviewDTO lastMessagePreview, List<Icon> titleIcons, @NotNull String deeplink, List<ContextMenuItemDTO> contextMenuItems, ru.ozon.android.messenger.blocks.chat.common.e animation, ContextMenuDTO contextMenu) {
        Intrinsics.checkNotNullParameter(titleAtom, "titleAtom");
        Intrinsics.checkNotNullParameter(unreadCountIndicator, "unreadCountIndicator");
        Intrinsics.checkNotNullParameter(deeplink, "deeplink");
        return new ChatDTO(titleAtom, avatarIcon, avatarIconVerticalAlignment, unreadCountIndicator, firstUnreadMessageId, lastMessagePreview, titleIcons, deeplink, contextMenuItems, animation, contextMenu);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ChatDTO)) {
            return false;
        }
        ChatDTO chatDTO = (ChatDTO) other;
        return Intrinsics.d(this.titleAtom, chatDTO.titleAtom) && Intrinsics.d(this.avatarIcon, chatDTO.avatarIcon) && this.avatarIconVerticalAlignment == chatDTO.avatarIconVerticalAlignment && Intrinsics.d(this.unreadCountIndicator, chatDTO.unreadCountIndicator) && Intrinsics.d(this.firstUnreadMessageId, chatDTO.firstUnreadMessageId) && Intrinsics.d(this.lastMessagePreview, chatDTO.lastMessagePreview) && Intrinsics.d(this.titleIcons, chatDTO.titleIcons) && Intrinsics.d(this.deeplink, chatDTO.deeplink) && Intrinsics.d(this.contextMenuItems, chatDTO.contextMenuItems) && this.animation == chatDTO.animation && Intrinsics.d(this.contextMenu, chatDTO.contextMenu);
    }

    public final ru.ozon.android.messenger.blocks.chat.common.e getAnimation() {
        return this.animation;
    }

    public final IconDTO getAvatarIcon() {
        return this.avatarIcon;
    }

    public final ru.ozon.android.messenger.blocks.chat.common.a getAvatarIconVerticalAlignment() {
        return this.avatarIconVerticalAlignment;
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

    public final PreviewDTO getLastMessagePreview() {
        return this.lastMessagePreview;
    }

    @NotNull
    public final TextDTO getTitleAtom() {
        return this.titleAtom;
    }

    public final List<Icon> getTitleIcons() {
        return this.titleIcons;
    }

    @NotNull
    public final UnreadCountIndicatorDTO getUnreadCountIndicator() {
        return this.unreadCountIndicator;
    }

    public int hashCode() {
        int hashCode = this.titleAtom.hashCode() * 31;
        IconDTO iconDTO = this.avatarIcon;
        int hashCode2 = (hashCode + (iconDTO == null ? 0 : iconDTO.hashCode())) * 31;
        ru.ozon.android.messenger.blocks.chat.common.a aVar = this.avatarIconVerticalAlignment;
        int hashCode3 = (this.unreadCountIndicator.hashCode() + ((hashCode2 + (aVar == null ? 0 : aVar.hashCode())) * 31)) * 31;
        String str = this.firstUnreadMessageId;
        int hashCode4 = (hashCode3 + (str == null ? 0 : str.hashCode())) * 31;
        PreviewDTO previewDTO = this.lastMessagePreview;
        int hashCode5 = (hashCode4 + (previewDTO == null ? 0 : previewDTO.hashCode())) * 31;
        List<Icon> list = this.titleIcons;
        int a11 = g.a((hashCode5 + (list == null ? 0 : list.hashCode())) * 31, 31, this.deeplink);
        List<ContextMenuItemDTO> list2 = this.contextMenuItems;
        int hashCode6 = (a11 + (list2 == null ? 0 : list2.hashCode())) * 31;
        ru.ozon.android.messenger.blocks.chat.common.e eVar = this.animation;
        int hashCode7 = (hashCode6 + (eVar == null ? 0 : eVar.hashCode())) * 31;
        ContextMenuDTO contextMenuDTO = this.contextMenu;
        return hashCode7 + (contextMenuDTO != null ? contextMenuDTO.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        TextDTO textDTO = this.titleAtom;
        IconDTO iconDTO = this.avatarIcon;
        ru.ozon.android.messenger.blocks.chat.common.a aVar = this.avatarIconVerticalAlignment;
        UnreadCountIndicatorDTO unreadCountIndicatorDTO = this.unreadCountIndicator;
        String str = this.firstUnreadMessageId;
        PreviewDTO previewDTO = this.lastMessagePreview;
        List<Icon> list = this.titleIcons;
        String str2 = this.deeplink;
        List<ContextMenuItemDTO> list2 = this.contextMenuItems;
        ru.ozon.android.messenger.blocks.chat.common.e eVar = this.animation;
        ContextMenuDTO contextMenuDTO = this.contextMenu;
        StringBuilder d11 = C2639a.d("ChatDTO(titleAtom=", ", avatarIcon=", ", avatarIconVerticalAlignment=", iconDTO, textDTO);
        d11.append(aVar);
        d11.append(", unreadCountIndicator=");
        d11.append(unreadCountIndicatorDTO);
        d11.append(", firstUnreadMessageId=");
        d11.append(str);
        d11.append(", lastMessagePreview=");
        d11.append(previewDTO);
        d11.append(", titleIcons=");
        Cm.e.i(", deeplink=", str2, ", contextMenuItems=", d11, list);
        d11.append(list2);
        d11.append(", animation=");
        d11.append(eVar);
        d11.append(", contextMenu=");
        d11.append(contextMenuDTO);
        d11.append(")");
        return d11.toString();
    }

    @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u000f\b\u0087\b\u0018\u00002\u00020\u0001:\u0001/BE\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0012\u0010\u000f\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u000f\u0010\u0010J\u0012\u0010\u0011\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u0011\u0010\u0012J\u0012\u0010\u0013\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0013\u0010\u0010J\u0010\u0010\u0014\u001a\u00020\u0007HÆ\u0003¢\u0006\u0004\b\u0014\u0010\u0015J\u0012\u0010\u0016\u001a\u0004\u0018\u00010\tHÆ\u0003¢\u0006\u0004\b\u0016\u0010\u0017J\u0012\u0010\u0018\u001a\u0004\u0018\u00010\u000bHÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0019JV\u0010\u001a\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\b\u001a\u00020\u00072\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000bHÆ\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001c\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001c\u0010\u0010J\u0010\u0010\u001e\u001a\u00020\u001dHÖ\u0001¢\u0006\u0004\b\u001e\u0010\u001fJ\u001a\u0010\"\u001a\u00020!2\b\u0010 \u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\"\u0010#R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010$\u001a\u0004\b%\u0010\u0010R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010&\u001a\u0004\b'\u0010\u0012R\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u0010$\u001a\u0004\b(\u0010\u0010R\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010)\u001a\u0004\b*\u0010\u0015R\u0019\u0010\n\u001a\u0004\u0018\u00010\t8\u0006¢\u0006\f\n\u0004\b\n\u0010+\u001a\u0004\b,\u0010\u0017R\u0019\u0010\f\u001a\u0004\u0018\u00010\u000b8\u0006¢\u0006\f\n\u0004\b\f\u0010-\u001a\u0004\b.\u0010\u0019¨\u00060"}, d2 = {"Lru/ozon/android/messenger/blocks/chat/old/ChatDTO$PreviewDTO;", "", "", "text", "Lru/ozon/uni/atoms/data/button/Icon;", "icon", ImagesContract.URL, "Lorg/joda/time/DateTime;", "date", "Lru/ozon/android/messenger/blocks/chat/old/ChatDTO$PreviewDTO$a;", "status", "Lru/ozon/android/messenger/blocks/chat/common/f;", "chatStatus", "<init>", "(Ljava/lang/String;Lru/ozon/uni/atoms/data/button/Icon;Ljava/lang/String;Lorg/joda/time/DateTime;Lru/ozon/android/messenger/blocks/chat/old/ChatDTO$PreviewDTO$a;Lru/ozon/android/messenger/blocks/chat/common/f;)V", "component1", "()Ljava/lang/String;", "component2", "()Lru/ozon/uni/atoms/data/button/Icon;", "component3", "component4", "()Lorg/joda/time/DateTime;", "component5", "()Lru/ozon/android/messenger/blocks/chat/old/ChatDTO$PreviewDTO$a;", "component6", "()Lru/ozon/android/messenger/blocks/chat/common/f;", "copy", "(Ljava/lang/String;Lru/ozon/uni/atoms/data/button/Icon;Ljava/lang/String;Lorg/joda/time/DateTime;Lru/ozon/android/messenger/blocks/chat/old/ChatDTO$PreviewDTO$a;Lru/ozon/android/messenger/blocks/chat/common/f;)Lru/ozon/android/messenger/blocks/chat/old/ChatDTO$PreviewDTO;", "toString", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getText", "Lru/ozon/uni/atoms/data/button/Icon;", "getIcon", "getUrl", "Lorg/joda/time/DateTime;", "getDate", "Lru/ozon/android/messenger/blocks/chat/old/ChatDTO$PreviewDTO$a;", "getStatus", "Lru/ozon/android/messenger/blocks/chat/common/f;", "getChatStatus", "a", "messenger_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    @j(generateAdapter = true)
    public static final /* data */ class PreviewDTO {
        public static final int $stable = 8;
        private final ru.ozon.android.messenger.blocks.chat.common.f chatStatus;

        @NotNull
        private final DateTime date;
        private final Icon icon;
        private final a status;
        private final String text;
        private final String url;

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        public static final class a {
            private static final /* synthetic */ Xc.a $ENTRIES;
            private static final /* synthetic */ a[] $VALUES;

            @i(name = "Delivered")
            public static final a DELIVERED;

            @i(name = "NoStatus")
            public static final a NO_STATUS;

            @i(name = "Read")
            public static final a READ;

            @NotNull
            private final String dtoName;

            static {
                a aVar = new a("NO_STATUS", 0, "NoStatus");
                NO_STATUS = aVar;
                a aVar2 = new a("DELIVERED", 1, "Delivered");
                DELIVERED = aVar2;
                a aVar3 = new a("READ", 2, "Read");
                READ = aVar3;
                a[] aVarArr = {aVar, aVar2, aVar3};
                $VALUES = aVarArr;
                $ENTRIES = Xc.b.a(aVarArr);
            }

            private a(String str, int i11, String str2) {
                this.dtoName = str2;
            }

            public static a valueOf(String str) {
                return (a) Enum.valueOf(a.class, str);
            }

            public static a[] values() {
                return (a[]) $VALUES.clone();
            }
        }

        public PreviewDTO(String str, Icon icon, String str2, @NotNull DateTime date, a aVar, ru.ozon.android.messenger.blocks.chat.common.f fVar) {
            Intrinsics.checkNotNullParameter(date, "date");
            this.text = str;
            this.icon = icon;
            this.url = str2;
            this.date = date;
            this.status = aVar;
            this.chatStatus = fVar;
        }

        public static /* synthetic */ PreviewDTO copy$default(PreviewDTO previewDTO, String str, Icon icon, String str2, DateTime dateTime, a aVar, ru.ozon.android.messenger.blocks.chat.common.f fVar, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                str = previewDTO.text;
            }
            if ((i11 & 2) != 0) {
                icon = previewDTO.icon;
            }
            if ((i11 & 4) != 0) {
                str2 = previewDTO.url;
            }
            if ((i11 & 8) != 0) {
                dateTime = previewDTO.date;
            }
            if ((i11 & 16) != 0) {
                aVar = previewDTO.status;
            }
            if ((i11 & 32) != 0) {
                fVar = previewDTO.chatStatus;
            }
            a aVar2 = aVar;
            ru.ozon.android.messenger.blocks.chat.common.f fVar2 = fVar;
            return previewDTO.copy(str, icon, str2, dateTime, aVar2, fVar2);
        }

        /* renamed from: component1, reason: from getter */
        public final String getText() {
            return this.text;
        }

        /* renamed from: component2, reason: from getter */
        public final Icon getIcon() {
            return this.icon;
        }

        /* renamed from: component3, reason: from getter */
        public final String getUrl() {
            return this.url;
        }

        @NotNull
        /* renamed from: component4, reason: from getter */
        public final DateTime getDate() {
            return this.date;
        }

        /* renamed from: component5, reason: from getter */
        public final a getStatus() {
            return this.status;
        }

        /* renamed from: component6, reason: from getter */
        public final ru.ozon.android.messenger.blocks.chat.common.f getChatStatus() {
            return this.chatStatus;
        }

        @NotNull
        public final PreviewDTO copy(String text, Icon icon, String url, @NotNull DateTime date, a status, ru.ozon.android.messenger.blocks.chat.common.f chatStatus) {
            Intrinsics.checkNotNullParameter(date, "date");
            return new PreviewDTO(text, icon, url, date, status, chatStatus);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof PreviewDTO)) {
                return false;
            }
            PreviewDTO previewDTO = (PreviewDTO) other;
            return Intrinsics.d(this.text, previewDTO.text) && Intrinsics.d(this.icon, previewDTO.icon) && Intrinsics.d(this.url, previewDTO.url) && Intrinsics.d(this.date, previewDTO.date) && this.status == previewDTO.status && this.chatStatus == previewDTO.chatStatus;
        }

        public final ru.ozon.android.messenger.blocks.chat.common.f getChatStatus() {
            return this.chatStatus;
        }

        @NotNull
        public final DateTime getDate() {
            return this.date;
        }

        public final Icon getIcon() {
            return this.icon;
        }

        public final a getStatus() {
            return this.status;
        }

        public final String getText() {
            return this.text;
        }

        public final String getUrl() {
            return this.url;
        }

        public int hashCode() {
            String str = this.text;
            int hashCode = (str == null ? 0 : str.hashCode()) * 31;
            Icon icon = this.icon;
            int hashCode2 = (hashCode + (icon == null ? 0 : icon.hashCode())) * 31;
            String str2 = this.url;
            int a11 = GR.b.a(this.date, (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31, 31);
            a aVar = this.status;
            int hashCode3 = (a11 + (aVar == null ? 0 : aVar.hashCode())) * 31;
            ru.ozon.android.messenger.blocks.chat.common.f fVar = this.chatStatus;
            return hashCode3 + (fVar != null ? fVar.hashCode() : 0);
        }

        @NotNull
        public String toString() {
            return "PreviewDTO(text=" + this.text + ", icon=" + this.icon + ", url=" + this.url + ", date=" + this.date + ", status=" + this.status + ", chatStatus=" + this.chatStatus + ")";
        }

        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public /* synthetic */ PreviewDTO(String str, Icon icon, String str2, DateTime dateTime, a aVar, ru.ozon.android.messenger.blocks.chat.common.f fVar, int i11, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, icon, r5, r6, r7, r8);
            ru.ozon.android.messenger.blocks.chat.common.f fVar2;
            a aVar2;
            DateTime dateTime2;
            String str3;
            icon = (i11 & 2) != 0 ? null : icon;
            if ((i11 & 4) != 0) {
                fVar2 = fVar;
                aVar2 = aVar;
                dateTime2 = dateTime;
                str3 = null;
            } else {
                fVar2 = fVar;
                aVar2 = aVar;
                dateTime2 = dateTime;
                str3 = str2;
            }
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public /* synthetic */ ChatDTO(TextDTO textDTO, IconDTO iconDTO, ru.ozon.android.messenger.blocks.chat.common.a aVar, UnreadCountIndicatorDTO unreadCountIndicatorDTO, String str, PreviewDTO previewDTO, List list, String str2, List list2, ru.ozon.android.messenger.blocks.chat.common.e eVar, ContextMenuDTO contextMenuDTO, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(textDTO, iconDTO, aVar, unreadCountIndicatorDTO, str, r8, r9, r10, r11, r12, r13);
        ContextMenuDTO contextMenuDTO2;
        ru.ozon.android.messenger.blocks.chat.common.e eVar2;
        List list3;
        String str3;
        List list4;
        PreviewDTO previewDTO2;
        iconDTO = (i11 & 2) != 0 ? null : iconDTO;
        str = (i11 & 16) != 0 ? null : str;
        if ((i11 & 32) != 0) {
            contextMenuDTO2 = contextMenuDTO;
            eVar2 = eVar;
            list3 = list2;
            str3 = str2;
            list4 = list;
            previewDTO2 = null;
        } else {
            contextMenuDTO2 = contextMenuDTO;
            eVar2 = eVar;
            list3 = list2;
            str3 = str2;
            list4 = list;
            previewDTO2 = previewDTO;
        }
    }
}
