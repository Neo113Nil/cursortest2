package ru.ozon.android.messenger.framework.data.requests;

import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.messenger.framework.analytics.MessengerTrackingInfo;
import ru.ozon.android.messenger.framework.data.remote.models.items.ItemDTO;
import ru.ozon.app.android.ugc.widgets.selectionItemForm.data.SelectionItemFormDTO;

@com.squareup.moshi.j(generateAdapter = true)
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\u0010\b\n\u0002\b\u0003\b\u0081\b\u0018\u00002\u00020\u0001:\u0001!B5\u0012\u000e\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\b\u0010\t\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\u000b\u0010\fJ\u0011\u0010\u0016\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u0010\u0017\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0002\u0010\u0010J\u000b\u0010\u0018\u001a\u0004\u0018\u00010\bHÆ\u0003J\u000b\u0010\u0019\u001a\u0004\u0018\u00010\nHÆ\u0003JD\u0010\u001a\u001a\u00020\u00002\u0010\b\u0002\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\nHÆ\u0001¢\u0006\u0002\u0010\u001bJ\u0013\u0010\u001c\u001a\u00020\u00062\b\u0010\u001d\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001e\u001a\u00020\u001fHÖ\u0001J\t\u0010 \u001a\u00020\bHÖ\u0001R\u0019\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0015\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\n\n\u0002\u0010\u0011\u001a\u0004\b\u000f\u0010\u0010R\u0013\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0013\u0010\t\u001a\u0004\u0018\u00010\n¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015¨\u0006\""}, d2 = {"Lru/ozon/android/messenger/framework/data/requests/SearchResponseDTO;", "", "items", "", "Lru/ozon/android/messenger/framework/data/remote/models/items/ItemDTO;", "hasItemsAfter", "", "nextPageCursor", "", "successResultHeader", "Lru/ozon/android/messenger/framework/data/requests/SearchResponseDTO$SuccessResultHeader;", "<init>", "(Ljava/util/List;Ljava/lang/Boolean;Ljava/lang/String;Lru/ozon/android/messenger/framework/data/requests/SearchResponseDTO$SuccessResultHeader;)V", "getItems", "()Ljava/util/List;", "getHasItemsAfter", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "getNextPageCursor", "()Ljava/lang/String;", "getSuccessResultHeader", "()Lru/ozon/android/messenger/framework/data/requests/SearchResponseDTO$SuccessResultHeader;", "component1", "component2", "component3", "component4", "copy", "(Ljava/util/List;Ljava/lang/Boolean;Ljava/lang/String;Lru/ozon/android/messenger/framework/data/requests/SearchResponseDTO$SuccessResultHeader;)Lru/ozon/android/messenger/framework/data/requests/SearchResponseDTO;", "equals", "other", "hashCode", "", "toString", "SuccessResultHeader", "messenger_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes10.dex */
public final /* data */ class SearchResponseDTO {
    public static final int $stable = 8;
    private final Boolean hasItemsAfter;
    private final List<ItemDTO> items;
    private final String nextPageCursor;
    private final SuccessResultHeader successResultHeader;

    public SearchResponseDTO(List<ItemDTO> list, Boolean bool, String str, SuccessResultHeader successResultHeader) {
        this.items = list;
        this.hasItemsAfter = bool;
        this.nextPageCursor = str;
        this.successResultHeader = successResultHeader;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ SearchResponseDTO copy$default(SearchResponseDTO searchResponseDTO, List list, Boolean bool, String str, SuccessResultHeader successResultHeader, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            list = searchResponseDTO.items;
        }
        if ((i11 & 2) != 0) {
            bool = searchResponseDTO.hasItemsAfter;
        }
        if ((i11 & 4) != 0) {
            str = searchResponseDTO.nextPageCursor;
        }
        if ((i11 & 8) != 0) {
            successResultHeader = searchResponseDTO.successResultHeader;
        }
        return searchResponseDTO.copy(list, bool, str, successResultHeader);
    }

    public final List<ItemDTO> component1() {
        return this.items;
    }

    /* renamed from: component2, reason: from getter */
    public final Boolean getHasItemsAfter() {
        return this.hasItemsAfter;
    }

    /* renamed from: component3, reason: from getter */
    public final String getNextPageCursor() {
        return this.nextPageCursor;
    }

    /* renamed from: component4, reason: from getter */
    public final SuccessResultHeader getSuccessResultHeader() {
        return this.successResultHeader;
    }

    @NotNull
    public final SearchResponseDTO copy(List<ItemDTO> items, Boolean hasItemsAfter, String nextPageCursor, SuccessResultHeader successResultHeader) {
        return new SearchResponseDTO(items, hasItemsAfter, nextPageCursor, successResultHeader);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SearchResponseDTO)) {
            return false;
        }
        SearchResponseDTO searchResponseDTO = (SearchResponseDTO) other;
        return Intrinsics.d(this.items, searchResponseDTO.items) && Intrinsics.d(this.hasItemsAfter, searchResponseDTO.hasItemsAfter) && Intrinsics.d(this.nextPageCursor, searchResponseDTO.nextPageCursor) && Intrinsics.d(this.successResultHeader, searchResponseDTO.successResultHeader);
    }

    public final Boolean getHasItemsAfter() {
        return this.hasItemsAfter;
    }

    public final List<ItemDTO> getItems() {
        return this.items;
    }

    public final String getNextPageCursor() {
        return this.nextPageCursor;
    }

    public final SuccessResultHeader getSuccessResultHeader() {
        return this.successResultHeader;
    }

    public int hashCode() {
        List<ItemDTO> list = this.items;
        int hashCode = (list == null ? 0 : list.hashCode()) * 31;
        Boolean bool = this.hasItemsAfter;
        int hashCode2 = (hashCode + (bool == null ? 0 : bool.hashCode())) * 31;
        String str = this.nextPageCursor;
        int hashCode3 = (hashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        SuccessResultHeader successResultHeader = this.successResultHeader;
        return hashCode3 + (successResultHeader != null ? successResultHeader.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "SearchResponseDTO(items=" + this.items + ", hasItemsAfter=" + this.hasItemsAfter + ", nextPageCursor=" + this.nextPageCursor + ", successResultHeader=" + this.successResultHeader + ")";
    }

    @com.squareup.moshi.j(generateAdapter = true)
    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0081\b\u0018\u00002\u00020\u0001B)\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0016\b\u0002\u0010\u0004\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u000b\u0010\r\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0017\u0010\u000e\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005HÆ\u0003J-\u0010\u000f\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\u0016\b\u0002\u0010\u0004\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005HÆ\u0001J\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u001f\u0010\u0004\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006\u0016"}, d2 = {"Lru/ozon/android/messenger/framework/data/requests/SearchResponseDTO$SuccessResultHeader;", "", SelectionItemFormDTO.TITLE_FIELD_NAME, "", "trackingInfo", "", "Lru/ozon/android/messenger/framework/analytics/MessengerTrackingInfo;", "<init>", "(Ljava/lang/String;Ljava/util/Map;)V", "getTitle", "()Ljava/lang/String;", "getTrackingInfo", "()Ljava/util/Map;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "messenger_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class SuccessResultHeader {
        public static final int $stable = 8;
        private final String title;
        private final Map<String, MessengerTrackingInfo> trackingInfo;

        public SuccessResultHeader(String str, Map<String, MessengerTrackingInfo> map) {
            this.title = str;
            this.trackingInfo = map;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ SuccessResultHeader copy$default(SuccessResultHeader successResultHeader, String str, Map map, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                str = successResultHeader.title;
            }
            if ((i11 & 2) != 0) {
                map = successResultHeader.trackingInfo;
            }
            return successResultHeader.copy(str, map);
        }

        /* renamed from: component1, reason: from getter */
        public final String getTitle() {
            return this.title;
        }

        public final Map<String, MessengerTrackingInfo> component2() {
            return this.trackingInfo;
        }

        @NotNull
        public final SuccessResultHeader copy(String title, Map<String, MessengerTrackingInfo> trackingInfo) {
            return new SuccessResultHeader(title, trackingInfo);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof SuccessResultHeader)) {
                return false;
            }
            SuccessResultHeader successResultHeader = (SuccessResultHeader) other;
            return Intrinsics.d(this.title, successResultHeader.title) && Intrinsics.d(this.trackingInfo, successResultHeader.trackingInfo);
        }

        public final String getTitle() {
            return this.title;
        }

        public final Map<String, MessengerTrackingInfo> getTrackingInfo() {
            return this.trackingInfo;
        }

        public int hashCode() {
            String str = this.title;
            int hashCode = (str == null ? 0 : str.hashCode()) * 31;
            Map<String, MessengerTrackingInfo> map = this.trackingInfo;
            return hashCode + (map != null ? map.hashCode() : 0);
        }

        @NotNull
        public String toString() {
            return Nh.a.d("SuccessResultHeader(title=", this.title, ", trackingInfo=", ")", this.trackingInfo);
        }

        public /* synthetic */ SuccessResultHeader(String str, Map map, int i11, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, (i11 & 2) != 0 ? null : map);
        }
    }
}
