package ru.ozon.android.messenger.framework.data.requests;

import B0.C2454a;
import B4.V;
import B90.C2616s;
import B90.C2618u;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.K;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.messenger.framework.data.remote.models.items.ItemDTO;
import ru.ozon.android.tokenized.model.TokenizedTrackingInfo;
import ru.ozon.app.android.ugc.core.widgets.commentsListV3.data.CommentV3DTO;

@com.squareup.moshi.j(generateAdapter = true)
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0018\n\u0002\u0010\b\n\u0002\b\u0003\b\u0081\b\u0018\u00002\u00020\u0001:\u0001)Bc\u0012\u0010\u0010\u0002\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\b\u001a\u0004\u0018\u00010\t\u0012\u0014\u0010\n\u001a\u0010\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\f\u0018\u00010\u000b\u0012\u0014\u0010\r\u001a\u0010\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u000e\u0018\u00010\u000b¢\u0006\u0004\b\u000f\u0010\u0010J\u0013\u0010\u001c\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u0010\u001d\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0002\u0010\u0014J\u0010\u0010\u001e\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0002\u0010\u0014J\u000b\u0010\u001f\u001a\u0004\u0018\u00010\tHÆ\u0003J\u0017\u0010 \u001a\u0010\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\f\u0018\u00010\u000bHÆ\u0003J\u0017\u0010!\u001a\u0010\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u000e\u0018\u00010\u000bHÆ\u0003Jv\u0010\"\u001a\u00020\u00002\u0012\b\u0002\u0010\u0002\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t2\u0016\b\u0002\u0010\n\u001a\u0010\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\f\u0018\u00010\u000b2\u0016\b\u0002\u0010\r\u001a\u0010\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u000e\u0018\u00010\u000bHÆ\u0001¢\u0006\u0002\u0010#J\u0013\u0010$\u001a\u00020\u00062\b\u0010%\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010&\u001a\u00020'HÖ\u0001J\t\u0010(\u001a\u00020\fHÖ\u0001R\u001b\u0010\u0002\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0015\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\n\n\u0002\u0010\u0015\u001a\u0004\b\u0013\u0010\u0014R\u0015\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\n\n\u0002\u0010\u0015\u001a\u0004\b\u0016\u0010\u0014R\u0013\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u001f\u0010\n\u001a\u0010\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\f\u0018\u00010\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR\u001f\u0010\r\u001a\u0010\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u000e\u0018\u00010\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001a¨\u0006*"}, d2 = {"Lru/ozon/android/messenger/framework/data/requests/GetMessagesResponseDTO;", "", "items", "", "Lru/ozon/android/messenger/framework/data/remote/models/items/ItemDTO;", "hasItemsAfter", "", "hasItemsBefore", "firstPageInfo", "Lru/ozon/android/messenger/framework/data/requests/GetMessagesResponseDTO$FirstPageInfoDTO;", "context", "", "", "trackingInfo", "Lru/ozon/android/tokenized/model/TokenizedTrackingInfo;", "<init>", "(Ljava/util/List;Ljava/lang/Boolean;Ljava/lang/Boolean;Lru/ozon/android/messenger/framework/data/requests/GetMessagesResponseDTO$FirstPageInfoDTO;Ljava/util/Map;Ljava/util/Map;)V", "getItems", "()Ljava/util/List;", "getHasItemsAfter", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "getHasItemsBefore", "getFirstPageInfo", "()Lru/ozon/android/messenger/framework/data/requests/GetMessagesResponseDTO$FirstPageInfoDTO;", "getContext", "()Ljava/util/Map;", "getTrackingInfo", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "(Ljava/util/List;Ljava/lang/Boolean;Ljava/lang/Boolean;Lru/ozon/android/messenger/framework/data/requests/GetMessagesResponseDTO$FirstPageInfoDTO;Ljava/util/Map;Ljava/util/Map;)Lru/ozon/android/messenger/framework/data/requests/GetMessagesResponseDTO;", "equals", "other", "hashCode", "", "toString", "FirstPageInfoDTO", "messenger_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes10.dex */
public final /* data */ class GetMessagesResponseDTO {
    public static final int $stable = 8;
    private final Map<String, String> context;
    private final FirstPageInfoDTO firstPageInfo;
    private final Boolean hasItemsAfter;
    private final Boolean hasItemsBefore;
    private final List<ItemDTO> items;
    private final Map<String, TokenizedTrackingInfo> trackingInfo;

    public GetMessagesResponseDTO(List<ItemDTO> list, Boolean bool, Boolean bool2, FirstPageInfoDTO firstPageInfoDTO, Map<String, String> map, Map<String, TokenizedTrackingInfo> map2) {
        this.items = list;
        this.hasItemsAfter = bool;
        this.hasItemsBefore = bool2;
        this.firstPageInfo = firstPageInfoDTO;
        this.context = map;
        this.trackingInfo = map2;
    }

    public static /* synthetic */ GetMessagesResponseDTO copy$default(GetMessagesResponseDTO getMessagesResponseDTO, List list, Boolean bool, Boolean bool2, FirstPageInfoDTO firstPageInfoDTO, Map map, Map map2, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            list = getMessagesResponseDTO.items;
        }
        if ((i11 & 2) != 0) {
            bool = getMessagesResponseDTO.hasItemsAfter;
        }
        if ((i11 & 4) != 0) {
            bool2 = getMessagesResponseDTO.hasItemsBefore;
        }
        if ((i11 & 8) != 0) {
            firstPageInfoDTO = getMessagesResponseDTO.firstPageInfo;
        }
        if ((i11 & 16) != 0) {
            map = getMessagesResponseDTO.context;
        }
        if ((i11 & 32) != 0) {
            map2 = getMessagesResponseDTO.trackingInfo;
        }
        Map map3 = map;
        Map map4 = map2;
        return getMessagesResponseDTO.copy(list, bool, bool2, firstPageInfoDTO, map3, map4);
    }

    public final List<ItemDTO> component1() {
        return this.items;
    }

    /* renamed from: component2, reason: from getter */
    public final Boolean getHasItemsAfter() {
        return this.hasItemsAfter;
    }

    /* renamed from: component3, reason: from getter */
    public final Boolean getHasItemsBefore() {
        return this.hasItemsBefore;
    }

    /* renamed from: component4, reason: from getter */
    public final FirstPageInfoDTO getFirstPageInfo() {
        return this.firstPageInfo;
    }

    public final Map<String, String> component5() {
        return this.context;
    }

    public final Map<String, TokenizedTrackingInfo> component6() {
        return this.trackingInfo;
    }

    @NotNull
    public final GetMessagesResponseDTO copy(List<ItemDTO> items, Boolean hasItemsAfter, Boolean hasItemsBefore, FirstPageInfoDTO firstPageInfo, Map<String, String> context, Map<String, TokenizedTrackingInfo> trackingInfo) {
        return new GetMessagesResponseDTO(items, hasItemsAfter, hasItemsBefore, firstPageInfo, context, trackingInfo);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof GetMessagesResponseDTO)) {
            return false;
        }
        GetMessagesResponseDTO getMessagesResponseDTO = (GetMessagesResponseDTO) other;
        return Intrinsics.d(this.items, getMessagesResponseDTO.items) && Intrinsics.d(this.hasItemsAfter, getMessagesResponseDTO.hasItemsAfter) && Intrinsics.d(this.hasItemsBefore, getMessagesResponseDTO.hasItemsBefore) && Intrinsics.d(this.firstPageInfo, getMessagesResponseDTO.firstPageInfo) && Intrinsics.d(this.context, getMessagesResponseDTO.context) && Intrinsics.d(this.trackingInfo, getMessagesResponseDTO.trackingInfo);
    }

    public final Map<String, String> getContext() {
        return this.context;
    }

    public final FirstPageInfoDTO getFirstPageInfo() {
        return this.firstPageInfo;
    }

    public final Boolean getHasItemsAfter() {
        return this.hasItemsAfter;
    }

    public final Boolean getHasItemsBefore() {
        return this.hasItemsBefore;
    }

    public final List<ItemDTO> getItems() {
        return this.items;
    }

    public final Map<String, TokenizedTrackingInfo> getTrackingInfo() {
        return this.trackingInfo;
    }

    public int hashCode() {
        List<ItemDTO> list = this.items;
        int hashCode = (list == null ? 0 : list.hashCode()) * 31;
        Boolean bool = this.hasItemsAfter;
        int hashCode2 = (hashCode + (bool == null ? 0 : bool.hashCode())) * 31;
        Boolean bool2 = this.hasItemsBefore;
        int hashCode3 = (hashCode2 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        FirstPageInfoDTO firstPageInfoDTO = this.firstPageInfo;
        int hashCode4 = (hashCode3 + (firstPageInfoDTO == null ? 0 : firstPageInfoDTO.hashCode())) * 31;
        Map<String, String> map = this.context;
        int hashCode5 = (hashCode4 + (map == null ? 0 : map.hashCode())) * 31;
        Map<String, TokenizedTrackingInfo> map2 = this.trackingInfo;
        return hashCode5 + (map2 != null ? map2.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        List<ItemDTO> list = this.items;
        Boolean bool = this.hasItemsAfter;
        Boolean bool2 = this.hasItemsBefore;
        FirstPageInfoDTO firstPageInfoDTO = this.firstPageInfo;
        Map<String, String> map = this.context;
        Map<String, TokenizedTrackingInfo> map2 = this.trackingInfo;
        StringBuilder sb2 = new StringBuilder("GetMessagesResponseDTO(items=");
        sb2.append(list);
        sb2.append(", hasItemsAfter=");
        sb2.append(bool);
        sb2.append(", hasItemsBefore=");
        sb2.append(bool2);
        sb2.append(", firstPageInfo=");
        sb2.append(firstPageInfoDTO);
        sb2.append(", context=");
        return V.c(sb2, map, ", trackingInfo=", map2, ")");
    }

    @com.squareup.moshi.j(generateAdapter = true)
    @Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u001d\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B{\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\u000e\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0006\u0012\u0010\b\u0002\u0010\u0007\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0006\u0012\b\b\u0002\u0010\b\u001a\u00020\t\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0003\u0012\u000e\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0006\u0012\u000e\u0010\r\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0006¢\u0006\u0004\b\u000e\u0010\u000fJ\u000b\u0010\u001c\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001d\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0011\u0010\u001e\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0006HÆ\u0003J\u0011\u0010\u001f\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0006HÆ\u0003J\t\u0010 \u001a\u00020\tHÆ\u0003J\u000b\u0010!\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\"\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0011\u0010#\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0006HÆ\u0003J\u0011\u0010$\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0006HÆ\u0003J\u008b\u0001\u0010%\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\u0010\b\u0002\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00062\u0010\b\u0002\u0010\u0007\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u00062\b\b\u0002\u0010\b\u001a\u00020\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00032\u0010\b\u0002\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00062\u0010\b\u0002\u0010\r\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0006HÆ\u0001J\u0013\u0010&\u001a\u00020'2\b\u0010(\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010)\u001a\u00020\tHÖ\u0001J\t\u0010*\u001a\u00020+HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0011R\u0019\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0019\u0010\u0007\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0014R\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0013\u0010\n\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0011R\u0013\u0010\u000b\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0011R\u0019\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0014R\u0019\u0010\r\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u0014¨\u0006,"}, d2 = {"Lru/ozon/android/messenger/framework/data/requests/GetMessagesResponseDTO$FirstPageInfoDTO;", "", CommentV3DTO.HEADER_FIELD_NAME, "Lru/ozon/android/messenger/framework/data/remote/models/items/ItemDTO;", CommentV3DTO.FOOTER_FIELD_NAME, "chatRoomActions", "", "pinned", "unreadCount", "", "emptyState", "snackbar", "itemsBefore", "itemsAfter", "<init>", "(Lru/ozon/android/messenger/framework/data/remote/models/items/ItemDTO;Lru/ozon/android/messenger/framework/data/remote/models/items/ItemDTO;Ljava/util/List;Ljava/util/List;ILru/ozon/android/messenger/framework/data/remote/models/items/ItemDTO;Lru/ozon/android/messenger/framework/data/remote/models/items/ItemDTO;Ljava/util/List;Ljava/util/List;)V", "getHeader", "()Lru/ozon/android/messenger/framework/data/remote/models/items/ItemDTO;", "getFooter", "getChatRoomActions", "()Ljava/util/List;", "getPinned", "getUnreadCount", "()I", "getEmptyState", "getSnackbar", "getItemsBefore", "getItemsAfter", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", "", "other", "hashCode", "toString", "", "messenger_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class FirstPageInfoDTO {
        public static final int $stable = 8;
        private final List<ItemDTO> chatRoomActions;
        private final ItemDTO emptyState;
        private final ItemDTO footer;
        private final ItemDTO header;
        private final List<ItemDTO> itemsAfter;
        private final List<ItemDTO> itemsBefore;

        @NotNull
        private final List<ItemDTO> pinned;
        private final ItemDTO snackbar;
        private final int unreadCount;

        public FirstPageInfoDTO(ItemDTO itemDTO, ItemDTO itemDTO2, List<ItemDTO> list, @NotNull List<ItemDTO> pinned, int i11, ItemDTO itemDTO3, ItemDTO itemDTO4, List<ItemDTO> list2, List<ItemDTO> list3) {
            Intrinsics.checkNotNullParameter(pinned, "pinned");
            this.header = itemDTO;
            this.footer = itemDTO2;
            this.chatRoomActions = list;
            this.pinned = pinned;
            this.unreadCount = i11;
            this.emptyState = itemDTO3;
            this.snackbar = itemDTO4;
            this.itemsBefore = list2;
            this.itemsAfter = list3;
        }

        public static /* synthetic */ FirstPageInfoDTO copy$default(FirstPageInfoDTO firstPageInfoDTO, ItemDTO itemDTO, ItemDTO itemDTO2, List list, List list2, int i11, ItemDTO itemDTO3, ItemDTO itemDTO4, List list3, List list4, int i12, Object obj) {
            if ((i12 & 1) != 0) {
                itemDTO = firstPageInfoDTO.header;
            }
            if ((i12 & 2) != 0) {
                itemDTO2 = firstPageInfoDTO.footer;
            }
            if ((i12 & 4) != 0) {
                list = firstPageInfoDTO.chatRoomActions;
            }
            if ((i12 & 8) != 0) {
                list2 = firstPageInfoDTO.pinned;
            }
            if ((i12 & 16) != 0) {
                i11 = firstPageInfoDTO.unreadCount;
            }
            if ((i12 & 32) != 0) {
                itemDTO3 = firstPageInfoDTO.emptyState;
            }
            if ((i12 & 64) != 0) {
                itemDTO4 = firstPageInfoDTO.snackbar;
            }
            if ((i12 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0) {
                list3 = firstPageInfoDTO.itemsBefore;
            }
            if ((i12 & 256) != 0) {
                list4 = firstPageInfoDTO.itemsAfter;
            }
            List list5 = list3;
            List list6 = list4;
            ItemDTO itemDTO5 = itemDTO3;
            ItemDTO itemDTO6 = itemDTO4;
            int i13 = i11;
            List list7 = list;
            return firstPageInfoDTO.copy(itemDTO, itemDTO2, list7, list2, i13, itemDTO5, itemDTO6, list5, list6);
        }

        /* renamed from: component1, reason: from getter */
        public final ItemDTO getHeader() {
            return this.header;
        }

        /* renamed from: component2, reason: from getter */
        public final ItemDTO getFooter() {
            return this.footer;
        }

        public final List<ItemDTO> component3() {
            return this.chatRoomActions;
        }

        @NotNull
        public final List<ItemDTO> component4() {
            return this.pinned;
        }

        /* renamed from: component5, reason: from getter */
        public final int getUnreadCount() {
            return this.unreadCount;
        }

        /* renamed from: component6, reason: from getter */
        public final ItemDTO getEmptyState() {
            return this.emptyState;
        }

        /* renamed from: component7, reason: from getter */
        public final ItemDTO getSnackbar() {
            return this.snackbar;
        }

        public final List<ItemDTO> component8() {
            return this.itemsBefore;
        }

        public final List<ItemDTO> component9() {
            return this.itemsAfter;
        }

        @NotNull
        public final FirstPageInfoDTO copy(ItemDTO header, ItemDTO footer, List<ItemDTO> chatRoomActions, @NotNull List<ItemDTO> pinned, int unreadCount, ItemDTO emptyState, ItemDTO snackbar, List<ItemDTO> itemsBefore, List<ItemDTO> itemsAfter) {
            Intrinsics.checkNotNullParameter(pinned, "pinned");
            return new FirstPageInfoDTO(header, footer, chatRoomActions, pinned, unreadCount, emptyState, snackbar, itemsBefore, itemsAfter);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof FirstPageInfoDTO)) {
                return false;
            }
            FirstPageInfoDTO firstPageInfoDTO = (FirstPageInfoDTO) other;
            return Intrinsics.d(this.header, firstPageInfoDTO.header) && Intrinsics.d(this.footer, firstPageInfoDTO.footer) && Intrinsics.d(this.chatRoomActions, firstPageInfoDTO.chatRoomActions) && Intrinsics.d(this.pinned, firstPageInfoDTO.pinned) && this.unreadCount == firstPageInfoDTO.unreadCount && Intrinsics.d(this.emptyState, firstPageInfoDTO.emptyState) && Intrinsics.d(this.snackbar, firstPageInfoDTO.snackbar) && Intrinsics.d(this.itemsBefore, firstPageInfoDTO.itemsBefore) && Intrinsics.d(this.itemsAfter, firstPageInfoDTO.itemsAfter);
        }

        public final List<ItemDTO> getChatRoomActions() {
            return this.chatRoomActions;
        }

        public final ItemDTO getEmptyState() {
            return this.emptyState;
        }

        public final ItemDTO getFooter() {
            return this.footer;
        }

        public final ItemDTO getHeader() {
            return this.header;
        }

        public final List<ItemDTO> getItemsAfter() {
            return this.itemsAfter;
        }

        public final List<ItemDTO> getItemsBefore() {
            return this.itemsBefore;
        }

        @NotNull
        public final List<ItemDTO> getPinned() {
            return this.pinned;
        }

        public final ItemDTO getSnackbar() {
            return this.snackbar;
        }

        public final int getUnreadCount() {
            return this.unreadCount;
        }

        public int hashCode() {
            ItemDTO itemDTO = this.header;
            int hashCode = (itemDTO == null ? 0 : itemDTO.hashCode()) * 31;
            ItemDTO itemDTO2 = this.footer;
            int hashCode2 = (hashCode + (itemDTO2 == null ? 0 : itemDTO2.hashCode())) * 31;
            List<ItemDTO> list = this.chatRoomActions;
            int a11 = C2454a.a(this.unreadCount, G.g.b((hashCode2 + (list == null ? 0 : list.hashCode())) * 31, 31, this.pinned), 31);
            ItemDTO itemDTO3 = this.emptyState;
            int hashCode3 = (a11 + (itemDTO3 == null ? 0 : itemDTO3.hashCode())) * 31;
            ItemDTO itemDTO4 = this.snackbar;
            int hashCode4 = (hashCode3 + (itemDTO4 == null ? 0 : itemDTO4.hashCode())) * 31;
            List<ItemDTO> list2 = this.itemsBefore;
            int hashCode5 = (hashCode4 + (list2 == null ? 0 : list2.hashCode())) * 31;
            List<ItemDTO> list3 = this.itemsAfter;
            return hashCode5 + (list3 != null ? list3.hashCode() : 0);
        }

        @NotNull
        public String toString() {
            ItemDTO itemDTO = this.header;
            ItemDTO itemDTO2 = this.footer;
            List<ItemDTO> list = this.chatRoomActions;
            List<ItemDTO> list2 = this.pinned;
            int i11 = this.unreadCount;
            ItemDTO itemDTO3 = this.emptyState;
            ItemDTO itemDTO4 = this.snackbar;
            List<ItemDTO> list3 = this.itemsBefore;
            List<ItemDTO> list4 = this.itemsAfter;
            StringBuilder sb2 = new StringBuilder("FirstPageInfoDTO(header=");
            sb2.append(itemDTO);
            sb2.append(", footer=");
            sb2.append(itemDTO2);
            sb2.append(", chatRoomActions=");
            C2616s.g(", pinned=", ", unreadCount=", sb2, list, list2);
            sb2.append(i11);
            sb2.append(", emptyState=");
            sb2.append(itemDTO3);
            sb2.append(", snackbar=");
            sb2.append(itemDTO4);
            sb2.append(", itemsBefore=");
            sb2.append(list3);
            sb2.append(", itemsAfter=");
            return C2618u.h(sb2, list4, ")");
        }

        public FirstPageInfoDTO(ItemDTO itemDTO, ItemDTO itemDTO2, List list, List list2, int i11, ItemDTO itemDTO3, ItemDTO itemDTO4, List list3, List list4, int i12, DefaultConstructorMarker defaultConstructorMarker) {
            this(itemDTO, itemDTO2, list, (i12 & 8) != 0 ? K.f71697a : list2, (i12 & 16) != 0 ? 0 : i11, itemDTO3, itemDTO4, list3, list4);
        }
    }
}
