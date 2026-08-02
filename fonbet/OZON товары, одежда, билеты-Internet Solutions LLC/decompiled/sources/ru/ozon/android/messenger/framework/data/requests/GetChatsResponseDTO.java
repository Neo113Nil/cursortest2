package ru.ozon.android.messenger.framework.data.requests;

import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.messenger.framework.data.remote.models.items.ItemDTO;
import ru.ozon.app.android.ugc.core.widgets.commentsListV3.data.CommentV3DTO;

@com.squareup.moshi.j(generateAdapter = true)
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010$\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u001b\b\u0081\b\u0018\u00002\u00020\u0001:\u0002&'BM\u0012\u0010\u0010\u0002\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\u0014\u0010\u0007\u001a\u0010\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u0004\u0018\u00010\b\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010\f\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b\u000e\u0010\u000fJ\u0013\u0010\u001b\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u0010\u001c\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0002\u0010\u0013J\u0017\u0010\u001d\u001a\u0010\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u0004\u0018\u00010\bHÆ\u0003J\u000b\u0010\u001e\u001a\u0004\u0018\u00010\u000bHÆ\u0003J\u000b\u0010\u001f\u001a\u0004\u0018\u00010\rHÆ\u0003J^\u0010 \u001a\u00020\u00002\u0012\b\u0002\u0010\u0002\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\u0016\b\u0002\u0010\u0007\u001a\u0010\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u0004\u0018\u00010\b2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\rHÆ\u0001¢\u0006\u0002\u0010!J\u0013\u0010\"\u001a\u00020\u00062\b\u0010#\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010$\u001a\u00020\tHÖ\u0001J\t\u0010%\u001a\u00020\u000bHÖ\u0001R\u001b\u0010\u0002\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0015\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\n\n\u0002\u0010\u0014\u001a\u0004\b\u0012\u0010\u0013R\u001f\u0010\u0007\u001a\u0010\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u0004\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0013\u0010\n\u001a\u0004\u0018\u00010\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0013\u0010\f\u001a\u0004\u0018\u00010\r¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001a¨\u0006("}, d2 = {"Lru/ozon/android/messenger/framework/data/requests/GetChatsResponseDTO;", "", "items", "", "Lru/ozon/android/messenger/framework/data/remote/models/items/ItemDTO;", "hasItemsAfter", "", "absoluteItems", "", "", "lastUnreadChatId", "", "firstPageInfo", "Lru/ozon/android/messenger/framework/data/requests/GetChatsResponseDTO$ChatListFirstPageInfoDTO;", "<init>", "(Ljava/util/List;Ljava/lang/Boolean;Ljava/util/Map;Ljava/lang/String;Lru/ozon/android/messenger/framework/data/requests/GetChatsResponseDTO$ChatListFirstPageInfoDTO;)V", "getItems", "()Ljava/util/List;", "getHasItemsAfter", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "getAbsoluteItems", "()Ljava/util/Map;", "getLastUnreadChatId", "()Ljava/lang/String;", "getFirstPageInfo", "()Lru/ozon/android/messenger/framework/data/requests/GetChatsResponseDTO$ChatListFirstPageInfoDTO;", "component1", "component2", "component3", "component4", "component5", "copy", "(Ljava/util/List;Ljava/lang/Boolean;Ljava/util/Map;Ljava/lang/String;Lru/ozon/android/messenger/framework/data/requests/GetChatsResponseDTO$ChatListFirstPageInfoDTO;)Lru/ozon/android/messenger/framework/data/requests/GetChatsResponseDTO;", "equals", "other", "hashCode", "toString", "ChatListFirstPageInfoDTO", "ChatGroupsResponseDTO", "messenger_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes10.dex */
public final /* data */ class GetChatsResponseDTO {
    public static final int $stable = 8;
    private final Map<Integer, ItemDTO> absoluteItems;
    private final ChatListFirstPageInfoDTO firstPageInfo;
    private final Boolean hasItemsAfter;
    private final List<ItemDTO> items;
    private final String lastUnreadChatId;

    @com.squareup.moshi.j(generateAdapter = true)
    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B!\u0012\u000e\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\u0007\u0010\bJ\u0011\u0010\r\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u000e\u001a\u0004\u0018\u00010\u0006HÆ\u0003J'\u0010\u000f\u001a\u00020\u00002\u0010\b\u0002\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006HÆ\u0001J\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0006HÖ\u0001R\u0019\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006\u0016"}, d2 = {"Lru/ozon/android/messenger/framework/data/requests/GetChatsResponseDTO$ChatGroupsResponseDTO;", "", "items", "", "Lru/ozon/android/messenger/framework/data/remote/models/items/ItemDTO;", "defaultItemId", "", "<init>", "(Ljava/util/List;Ljava/lang/String;)V", "getItems", "()Ljava/util/List;", "getDefaultItemId", "()Ljava/lang/String;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "messenger_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class ChatGroupsResponseDTO {
        public static final int $stable = 8;
        private final String defaultItemId;
        private final List<ItemDTO> items;

        public ChatGroupsResponseDTO(List<ItemDTO> list, String str) {
            this.items = list;
            this.defaultItemId = str;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ ChatGroupsResponseDTO copy$default(ChatGroupsResponseDTO chatGroupsResponseDTO, List list, String str, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                list = chatGroupsResponseDTO.items;
            }
            if ((i11 & 2) != 0) {
                str = chatGroupsResponseDTO.defaultItemId;
            }
            return chatGroupsResponseDTO.copy(list, str);
        }

        public final List<ItemDTO> component1() {
            return this.items;
        }

        /* renamed from: component2, reason: from getter */
        public final String getDefaultItemId() {
            return this.defaultItemId;
        }

        @NotNull
        public final ChatGroupsResponseDTO copy(List<ItemDTO> items, String defaultItemId) {
            return new ChatGroupsResponseDTO(items, defaultItemId);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof ChatGroupsResponseDTO)) {
                return false;
            }
            ChatGroupsResponseDTO chatGroupsResponseDTO = (ChatGroupsResponseDTO) other;
            return Intrinsics.d(this.items, chatGroupsResponseDTO.items) && Intrinsics.d(this.defaultItemId, chatGroupsResponseDTO.defaultItemId);
        }

        public final String getDefaultItemId() {
            return this.defaultItemId;
        }

        public final List<ItemDTO> getItems() {
            return this.items;
        }

        public int hashCode() {
            List<ItemDTO> list = this.items;
            int hashCode = (list == null ? 0 : list.hashCode()) * 31;
            String str = this.defaultItemId;
            return hashCode + (str != null ? str.hashCode() : 0);
        }

        @NotNull
        public String toString() {
            return Bi.b.e("ChatGroupsResponseDTO(items=", ", defaultItemId=", this.defaultItemId, ")", this.items);
        }
    }

    @com.squareup.moshi.j(generateAdapter = true)
    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0015\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B9\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\n\u0010\u000bJ\u000b\u0010\u0015\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0016\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u0017\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u0018\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u0010\u0010\u0019\u001a\u0004\u0018\u00010\tHÆ\u0003¢\u0006\u0002\u0010\u0013JJ\u0010\u001a\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\tHÆ\u0001¢\u0006\u0002\u0010\u001bJ\u0013\u0010\u001c\u001a\u00020\t2\b\u0010\u001d\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001e\u001a\u00020\u001fHÖ\u0001J\t\u0010 \u001a\u00020!HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000fR\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u000fR\u0015\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\n\n\u0002\u0010\u0014\u001a\u0004\b\u0012\u0010\u0013¨\u0006\""}, d2 = {"Lru/ozon/android/messenger/framework/data/requests/GetChatsResponseDTO$ChatListFirstPageInfoDTO;", "", "chatGroups", "Lru/ozon/android/messenger/framework/data/requests/GetChatsResponseDTO$ChatGroupsResponseDTO;", CommentV3DTO.HEADER_FIELD_NAME, "Lru/ozon/android/messenger/framework/data/remote/models/items/ItemDTO;", "floatButton", "popUp", "showOnlyUnreadFilter", "", "<init>", "(Lru/ozon/android/messenger/framework/data/requests/GetChatsResponseDTO$ChatGroupsResponseDTO;Lru/ozon/android/messenger/framework/data/remote/models/items/ItemDTO;Lru/ozon/android/messenger/framework/data/remote/models/items/ItemDTO;Lru/ozon/android/messenger/framework/data/remote/models/items/ItemDTO;Ljava/lang/Boolean;)V", "getChatGroups", "()Lru/ozon/android/messenger/framework/data/requests/GetChatsResponseDTO$ChatGroupsResponseDTO;", "getHeader", "()Lru/ozon/android/messenger/framework/data/remote/models/items/ItemDTO;", "getFloatButton", "getPopUp", "getShowOnlyUnreadFilter", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "component1", "component2", "component3", "component4", "component5", "copy", "(Lru/ozon/android/messenger/framework/data/requests/GetChatsResponseDTO$ChatGroupsResponseDTO;Lru/ozon/android/messenger/framework/data/remote/models/items/ItemDTO;Lru/ozon/android/messenger/framework/data/remote/models/items/ItemDTO;Lru/ozon/android/messenger/framework/data/remote/models/items/ItemDTO;Ljava/lang/Boolean;)Lru/ozon/android/messenger/framework/data/requests/GetChatsResponseDTO$ChatListFirstPageInfoDTO;", "equals", "other", "hashCode", "", "toString", "", "messenger_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class ChatListFirstPageInfoDTO {
        public static final int $stable = 8;
        private final ChatGroupsResponseDTO chatGroups;
        private final ItemDTO floatButton;
        private final ItemDTO header;
        private final ItemDTO popUp;
        private final Boolean showOnlyUnreadFilter;

        public ChatListFirstPageInfoDTO(ChatGroupsResponseDTO chatGroupsResponseDTO, ItemDTO itemDTO, ItemDTO itemDTO2, ItemDTO itemDTO3, Boolean bool) {
            this.chatGroups = chatGroupsResponseDTO;
            this.header = itemDTO;
            this.floatButton = itemDTO2;
            this.popUp = itemDTO3;
            this.showOnlyUnreadFilter = bool;
        }

        public static /* synthetic */ ChatListFirstPageInfoDTO copy$default(ChatListFirstPageInfoDTO chatListFirstPageInfoDTO, ChatGroupsResponseDTO chatGroupsResponseDTO, ItemDTO itemDTO, ItemDTO itemDTO2, ItemDTO itemDTO3, Boolean bool, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                chatGroupsResponseDTO = chatListFirstPageInfoDTO.chatGroups;
            }
            if ((i11 & 2) != 0) {
                itemDTO = chatListFirstPageInfoDTO.header;
            }
            if ((i11 & 4) != 0) {
                itemDTO2 = chatListFirstPageInfoDTO.floatButton;
            }
            if ((i11 & 8) != 0) {
                itemDTO3 = chatListFirstPageInfoDTO.popUp;
            }
            if ((i11 & 16) != 0) {
                bool = chatListFirstPageInfoDTO.showOnlyUnreadFilter;
            }
            Boolean bool2 = bool;
            ItemDTO itemDTO4 = itemDTO2;
            return chatListFirstPageInfoDTO.copy(chatGroupsResponseDTO, itemDTO, itemDTO4, itemDTO3, bool2);
        }

        /* renamed from: component1, reason: from getter */
        public final ChatGroupsResponseDTO getChatGroups() {
            return this.chatGroups;
        }

        /* renamed from: component2, reason: from getter */
        public final ItemDTO getHeader() {
            return this.header;
        }

        /* renamed from: component3, reason: from getter */
        public final ItemDTO getFloatButton() {
            return this.floatButton;
        }

        /* renamed from: component4, reason: from getter */
        public final ItemDTO getPopUp() {
            return this.popUp;
        }

        /* renamed from: component5, reason: from getter */
        public final Boolean getShowOnlyUnreadFilter() {
            return this.showOnlyUnreadFilter;
        }

        @NotNull
        public final ChatListFirstPageInfoDTO copy(ChatGroupsResponseDTO chatGroups, ItemDTO header, ItemDTO floatButton, ItemDTO popUp, Boolean showOnlyUnreadFilter) {
            return new ChatListFirstPageInfoDTO(chatGroups, header, floatButton, popUp, showOnlyUnreadFilter);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof ChatListFirstPageInfoDTO)) {
                return false;
            }
            ChatListFirstPageInfoDTO chatListFirstPageInfoDTO = (ChatListFirstPageInfoDTO) other;
            return Intrinsics.d(this.chatGroups, chatListFirstPageInfoDTO.chatGroups) && Intrinsics.d(this.header, chatListFirstPageInfoDTO.header) && Intrinsics.d(this.floatButton, chatListFirstPageInfoDTO.floatButton) && Intrinsics.d(this.popUp, chatListFirstPageInfoDTO.popUp) && Intrinsics.d(this.showOnlyUnreadFilter, chatListFirstPageInfoDTO.showOnlyUnreadFilter);
        }

        public final ChatGroupsResponseDTO getChatGroups() {
            return this.chatGroups;
        }

        public final ItemDTO getFloatButton() {
            return this.floatButton;
        }

        public final ItemDTO getHeader() {
            return this.header;
        }

        public final ItemDTO getPopUp() {
            return this.popUp;
        }

        public final Boolean getShowOnlyUnreadFilter() {
            return this.showOnlyUnreadFilter;
        }

        public int hashCode() {
            ChatGroupsResponseDTO chatGroupsResponseDTO = this.chatGroups;
            int hashCode = (chatGroupsResponseDTO == null ? 0 : chatGroupsResponseDTO.hashCode()) * 31;
            ItemDTO itemDTO = this.header;
            int hashCode2 = (hashCode + (itemDTO == null ? 0 : itemDTO.hashCode())) * 31;
            ItemDTO itemDTO2 = this.floatButton;
            int hashCode3 = (hashCode2 + (itemDTO2 == null ? 0 : itemDTO2.hashCode())) * 31;
            ItemDTO itemDTO3 = this.popUp;
            int hashCode4 = (hashCode3 + (itemDTO3 == null ? 0 : itemDTO3.hashCode())) * 31;
            Boolean bool = this.showOnlyUnreadFilter;
            return hashCode4 + (bool != null ? bool.hashCode() : 0);
        }

        @NotNull
        public String toString() {
            ChatGroupsResponseDTO chatGroupsResponseDTO = this.chatGroups;
            ItemDTO itemDTO = this.header;
            ItemDTO itemDTO2 = this.floatButton;
            ItemDTO itemDTO3 = this.popUp;
            Boolean bool = this.showOnlyUnreadFilter;
            StringBuilder sb2 = new StringBuilder("ChatListFirstPageInfoDTO(chatGroups=");
            sb2.append(chatGroupsResponseDTO);
            sb2.append(", header=");
            sb2.append(itemDTO);
            sb2.append(", floatButton=");
            sb2.append(itemDTO2);
            sb2.append(", popUp=");
            sb2.append(itemDTO3);
            sb2.append(", showOnlyUnreadFilter=");
            return D3.g.d(sb2, bool, ")");
        }
    }

    public GetChatsResponseDTO(List<ItemDTO> list, Boolean bool, Map<Integer, ItemDTO> map, String str, ChatListFirstPageInfoDTO chatListFirstPageInfoDTO) {
        this.items = list;
        this.hasItemsAfter = bool;
        this.absoluteItems = map;
        this.lastUnreadChatId = str;
        this.firstPageInfo = chatListFirstPageInfoDTO;
    }

    public static /* synthetic */ GetChatsResponseDTO copy$default(GetChatsResponseDTO getChatsResponseDTO, List list, Boolean bool, Map map, String str, ChatListFirstPageInfoDTO chatListFirstPageInfoDTO, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            list = getChatsResponseDTO.items;
        }
        if ((i11 & 2) != 0) {
            bool = getChatsResponseDTO.hasItemsAfter;
        }
        if ((i11 & 4) != 0) {
            map = getChatsResponseDTO.absoluteItems;
        }
        if ((i11 & 8) != 0) {
            str = getChatsResponseDTO.lastUnreadChatId;
        }
        if ((i11 & 16) != 0) {
            chatListFirstPageInfoDTO = getChatsResponseDTO.firstPageInfo;
        }
        ChatListFirstPageInfoDTO chatListFirstPageInfoDTO2 = chatListFirstPageInfoDTO;
        Map map2 = map;
        return getChatsResponseDTO.copy(list, bool, map2, str, chatListFirstPageInfoDTO2);
    }

    public final List<ItemDTO> component1() {
        return this.items;
    }

    /* renamed from: component2, reason: from getter */
    public final Boolean getHasItemsAfter() {
        return this.hasItemsAfter;
    }

    public final Map<Integer, ItemDTO> component3() {
        return this.absoluteItems;
    }

    /* renamed from: component4, reason: from getter */
    public final String getLastUnreadChatId() {
        return this.lastUnreadChatId;
    }

    /* renamed from: component5, reason: from getter */
    public final ChatListFirstPageInfoDTO getFirstPageInfo() {
        return this.firstPageInfo;
    }

    @NotNull
    public final GetChatsResponseDTO copy(List<ItemDTO> items, Boolean hasItemsAfter, Map<Integer, ItemDTO> absoluteItems, String lastUnreadChatId, ChatListFirstPageInfoDTO firstPageInfo) {
        return new GetChatsResponseDTO(items, hasItemsAfter, absoluteItems, lastUnreadChatId, firstPageInfo);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof GetChatsResponseDTO)) {
            return false;
        }
        GetChatsResponseDTO getChatsResponseDTO = (GetChatsResponseDTO) other;
        return Intrinsics.d(this.items, getChatsResponseDTO.items) && Intrinsics.d(this.hasItemsAfter, getChatsResponseDTO.hasItemsAfter) && Intrinsics.d(this.absoluteItems, getChatsResponseDTO.absoluteItems) && Intrinsics.d(this.lastUnreadChatId, getChatsResponseDTO.lastUnreadChatId) && Intrinsics.d(this.firstPageInfo, getChatsResponseDTO.firstPageInfo);
    }

    public final Map<Integer, ItemDTO> getAbsoluteItems() {
        return this.absoluteItems;
    }

    public final ChatListFirstPageInfoDTO getFirstPageInfo() {
        return this.firstPageInfo;
    }

    public final Boolean getHasItemsAfter() {
        return this.hasItemsAfter;
    }

    public final List<ItemDTO> getItems() {
        return this.items;
    }

    public final String getLastUnreadChatId() {
        return this.lastUnreadChatId;
    }

    public int hashCode() {
        List<ItemDTO> list = this.items;
        int hashCode = (list == null ? 0 : list.hashCode()) * 31;
        Boolean bool = this.hasItemsAfter;
        int hashCode2 = (hashCode + (bool == null ? 0 : bool.hashCode())) * 31;
        Map<Integer, ItemDTO> map = this.absoluteItems;
        int hashCode3 = (hashCode2 + (map == null ? 0 : map.hashCode())) * 31;
        String str = this.lastUnreadChatId;
        int hashCode4 = (hashCode3 + (str == null ? 0 : str.hashCode())) * 31;
        ChatListFirstPageInfoDTO chatListFirstPageInfoDTO = this.firstPageInfo;
        return hashCode4 + (chatListFirstPageInfoDTO != null ? chatListFirstPageInfoDTO.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "GetChatsResponseDTO(items=" + this.items + ", hasItemsAfter=" + this.hasItemsAfter + ", absoluteItems=" + this.absoluteItems + ", lastUnreadChatId=" + this.lastUnreadChatId + ", firstPageInfo=" + this.firstPageInfo + ")";
    }
}
