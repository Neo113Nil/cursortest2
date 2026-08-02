package ru.ozon.app.android.search.widgets.history.catalog.data;

import D3.h;
import G.g;
import N3.C3660k;
import Nh.a;
import T7.P;
import Tl.b;
import Ul.C4070a;
import com.squareup.moshi.j;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.tokenized.model.TokenizedTrackingInfo;
import ru.ozon.app.android.ugc.widgets.selectionItemForm.data.SelectionItemFormDTO;
import ru.ozon.moshi.adapters.serialize.collection.JsonCollectionDecoding;

@j(generateAdapter = true)
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\u0015\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0081\b\u0018\u00002\u00020\u0001:\u0001'BQ\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u000e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\b\u001a\u00020\u0003\u0012\u0006\u0010\t\u001a\u00020\u0003\u0012\u0014\u0010\n\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\f\u0018\u00010\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u000b\u0010\u001a\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0011\u0010\u001b\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u001c\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\u001d\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001e\u001a\u00020\u0003HÆ\u0003J\u0017\u0010\u001f\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\f\u0018\u00010\u000bHÆ\u0003J_\u0010 \u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\u0010\b\u0002\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\b\u001a\u00020\u00032\b\b\u0002\u0010\t\u001a\u00020\u00032\u0016\b\u0002\u0010\n\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\f\u0018\u00010\u000bHÆ\u0001J\u0013\u0010!\u001a\u00020\"2\b\u0010#\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010$\u001a\u00020%HÖ\u0001J\t\u0010&\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R$\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0010R\u0011\u0010\b\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0010R\u0011\u0010\t\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0010R\u001f\u0010\n\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\f\u0018\u00010\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019¨\u0006("}, d2 = {"Lru/ozon/app/android/search/widgets/history/catalog/data/SearchHistoryDTO;", "", SelectionItemFormDTO.TITLE_FIELD_NAME, "", "items", "", "Lru/ozon/app/android/search/widgets/history/catalog/data/SearchHistoryDTO$ItemDTO;", "error", "removeHistoryActionName", "removeAllHistoryActionName", "clearHistoryTrackingInfo", "", "Lru/ozon/android/tokenized/model/TokenizedTrackingInfo;", "<init>", "(Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;)V", "getTitle", "()Ljava/lang/String;", "getItems$annotations", "()V", "getItems", "()Ljava/util/List;", "getError", "getRemoveHistoryActionName", "getRemoveAllHistoryActionName", "getClearHistoryTrackingInfo", "()Ljava/util/Map;", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "", "other", "hashCode", "", "toString", "ItemDTO", "search_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final /* data */ class SearchHistoryDTO {
    public static final int $stable = 8;
    private final Map<String, TokenizedTrackingInfo> clearHistoryTrackingInfo;
    private final String error;
    private final List<ItemDTO> items;

    @NotNull
    private final String removeAllHistoryActionName;

    @NotNull
    private final String removeHistoryActionName;
    private final String title;

    @j(generateAdapter = true)
    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\u001a\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001Bm\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\u0014\u0010\b\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\n\u0018\u00010\t\u0012\u0014\u0010\u000b\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\n\u0018\u00010\t\u0012\u0014\u0010\f\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\n\u0018\u00010\t¢\u0006\u0004\b\r\u0010\u000eJ\t\u0010\u0019\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001a\u001a\u00020\u0003HÆ\u0003J\u0010\u0010\u001b\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0002\u0010\u0013J\u0010\u0010\u001c\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0002\u0010\u0013J\u0017\u0010\u001d\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\n\u0018\u00010\tHÆ\u0003J\u0017\u0010\u001e\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\n\u0018\u00010\tHÆ\u0003J\u0017\u0010\u001f\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\n\u0018\u00010\tHÆ\u0003J\u0082\u0001\u0010 \u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0016\b\u0002\u0010\b\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\n\u0018\u00010\t2\u0016\b\u0002\u0010\u000b\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\n\u0018\u00010\t2\u0016\b\u0002\u0010\f\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\n\u0018\u00010\tHÆ\u0001¢\u0006\u0002\u0010!J\u0013\u0010\"\u001a\u00020\u00062\b\u0010#\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010$\u001a\u00020%HÖ\u0001J\t\u0010&\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0010R\u0015\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\n\n\u0002\u0010\u0014\u001a\u0004\b\u0012\u0010\u0013R\u0015\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\n\n\u0002\u0010\u0014\u001a\u0004\b\u0007\u0010\u0013R\u001f\u0010\b\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\n\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u001f\u0010\u000b\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\n\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0016R\u001f\u0010\f\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\n\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0016¨\u0006'"}, d2 = {"Lru/ozon/app/android/search/widgets/history/catalog/data/SearchHistoryDTO$ItemDTO;", "", SelectionItemFormDTO.TITLE_FIELD_NAME, "", "deeplink", "shouldPrefetch", "", "isHighlighted", "trackingInfo", "", "Lru/ozon/android/tokenized/model/TokenizedTrackingInfo;", "searchTrackingInfo", "removeTrackingInfo", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/util/Map;Ljava/util/Map;Ljava/util/Map;)V", "getTitle", "()Ljava/lang/String;", "getDeeplink", "getShouldPrefetch", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "getTrackingInfo", "()Ljava/util/Map;", "getSearchTrackingInfo", "getRemoveTrackingInfo", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/util/Map;Ljava/util/Map;Ljava/util/Map;)Lru/ozon/app/android/search/widgets/history/catalog/data/SearchHistoryDTO$ItemDTO;", "equals", "other", "hashCode", "", "toString", "search_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    /* loaded from: classes7.dex */
    public static final /* data */ class ItemDTO {
        public static final int $stable = 8;

        @NotNull
        private final String deeplink;
        private final Boolean isHighlighted;
        private final Map<String, TokenizedTrackingInfo> removeTrackingInfo;
        private final Map<String, TokenizedTrackingInfo> searchTrackingInfo;
        private final Boolean shouldPrefetch;

        @NotNull
        private final String title;
        private final Map<String, TokenizedTrackingInfo> trackingInfo;

        public ItemDTO(@NotNull String title, @NotNull String deeplink, Boolean bool, Boolean bool2, Map<String, TokenizedTrackingInfo> map, Map<String, TokenizedTrackingInfo> map2, Map<String, TokenizedTrackingInfo> map3) {
            Intrinsics.checkNotNullParameter(title, "title");
            Intrinsics.checkNotNullParameter(deeplink, "deeplink");
            this.title = title;
            this.deeplink = deeplink;
            this.shouldPrefetch = bool;
            this.isHighlighted = bool2;
            this.trackingInfo = map;
            this.searchTrackingInfo = map2;
            this.removeTrackingInfo = map3;
        }

        public static /* synthetic */ ItemDTO copy$default(ItemDTO itemDTO, String str, String str2, Boolean bool, Boolean bool2, Map map, Map map2, Map map3, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                str = itemDTO.title;
            }
            if ((i11 & 2) != 0) {
                str2 = itemDTO.deeplink;
            }
            if ((i11 & 4) != 0) {
                bool = itemDTO.shouldPrefetch;
            }
            if ((i11 & 8) != 0) {
                bool2 = itemDTO.isHighlighted;
            }
            if ((i11 & 16) != 0) {
                map = itemDTO.trackingInfo;
            }
            if ((i11 & 32) != 0) {
                map2 = itemDTO.searchTrackingInfo;
            }
            if ((i11 & 64) != 0) {
                map3 = itemDTO.removeTrackingInfo;
            }
            Map map4 = map2;
            Map map5 = map3;
            Map map6 = map;
            Boolean bool3 = bool;
            return itemDTO.copy(str, str2, bool3, bool2, map6, map4, map5);
        }

        @NotNull
        /* renamed from: component1, reason: from getter */
        public final String getTitle() {
            return this.title;
        }

        @NotNull
        /* renamed from: component2, reason: from getter */
        public final String getDeeplink() {
            return this.deeplink;
        }

        /* renamed from: component3, reason: from getter */
        public final Boolean getShouldPrefetch() {
            return this.shouldPrefetch;
        }

        /* renamed from: component4, reason: from getter */
        public final Boolean getIsHighlighted() {
            return this.isHighlighted;
        }

        public final Map<String, TokenizedTrackingInfo> component5() {
            return this.trackingInfo;
        }

        public final Map<String, TokenizedTrackingInfo> component6() {
            return this.searchTrackingInfo;
        }

        public final Map<String, TokenizedTrackingInfo> component7() {
            return this.removeTrackingInfo;
        }

        @NotNull
        public final ItemDTO copy(@NotNull String title, @NotNull String deeplink, Boolean shouldPrefetch, Boolean isHighlighted, Map<String, TokenizedTrackingInfo> trackingInfo, Map<String, TokenizedTrackingInfo> searchTrackingInfo, Map<String, TokenizedTrackingInfo> removeTrackingInfo) {
            Intrinsics.checkNotNullParameter(title, "title");
            Intrinsics.checkNotNullParameter(deeplink, "deeplink");
            return new ItemDTO(title, deeplink, shouldPrefetch, isHighlighted, trackingInfo, searchTrackingInfo, removeTrackingInfo);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof ItemDTO)) {
                return false;
            }
            ItemDTO itemDTO = (ItemDTO) other;
            return Intrinsics.d(this.title, itemDTO.title) && Intrinsics.d(this.deeplink, itemDTO.deeplink) && Intrinsics.d(this.shouldPrefetch, itemDTO.shouldPrefetch) && Intrinsics.d(this.isHighlighted, itemDTO.isHighlighted) && Intrinsics.d(this.trackingInfo, itemDTO.trackingInfo) && Intrinsics.d(this.searchTrackingInfo, itemDTO.searchTrackingInfo) && Intrinsics.d(this.removeTrackingInfo, itemDTO.removeTrackingInfo);
        }

        @NotNull
        public final String getDeeplink() {
            return this.deeplink;
        }

        public final Map<String, TokenizedTrackingInfo> getRemoveTrackingInfo() {
            return this.removeTrackingInfo;
        }

        public final Map<String, TokenizedTrackingInfo> getSearchTrackingInfo() {
            return this.searchTrackingInfo;
        }

        public final Boolean getShouldPrefetch() {
            return this.shouldPrefetch;
        }

        @NotNull
        public final String getTitle() {
            return this.title;
        }

        public final Map<String, TokenizedTrackingInfo> getTrackingInfo() {
            return this.trackingInfo;
        }

        public int hashCode() {
            int a11 = g.a(this.title.hashCode() * 31, 31, this.deeplink);
            Boolean bool = this.shouldPrefetch;
            int hashCode = (a11 + (bool == null ? 0 : bool.hashCode())) * 31;
            Boolean bool2 = this.isHighlighted;
            int hashCode2 = (hashCode + (bool2 == null ? 0 : bool2.hashCode())) * 31;
            Map<String, TokenizedTrackingInfo> map = this.trackingInfo;
            int hashCode3 = (hashCode2 + (map == null ? 0 : map.hashCode())) * 31;
            Map<String, TokenizedTrackingInfo> map2 = this.searchTrackingInfo;
            int hashCode4 = (hashCode3 + (map2 == null ? 0 : map2.hashCode())) * 31;
            Map<String, TokenizedTrackingInfo> map3 = this.removeTrackingInfo;
            return hashCode4 + (map3 != null ? map3.hashCode() : 0);
        }

        public final Boolean isHighlighted() {
            return this.isHighlighted;
        }

        @NotNull
        public String toString() {
            String str = this.title;
            String str2 = this.deeplink;
            Boolean bool = this.shouldPrefetch;
            Boolean bool2 = this.isHighlighted;
            Map<String, TokenizedTrackingInfo> map = this.trackingInfo;
            Map<String, TokenizedTrackingInfo> map2 = this.searchTrackingInfo;
            Map<String, TokenizedTrackingInfo> map3 = this.removeTrackingInfo;
            StringBuilder d11 = C3660k.d("ItemDTO(title=", str, ", deeplink=", str2, ", shouldPrefetch=");
            h.h(d11, bool, ", isHighlighted=", bool2, ", trackingInfo=");
            b.g(d11, map, ", searchTrackingInfo=", map2, ", removeTrackingInfo=");
            return P.f(d11, map3, ")");
        }
    }

    public SearchHistoryDTO(String str, List<ItemDTO> list, String str2, @NotNull String removeHistoryActionName, @NotNull String removeAllHistoryActionName, Map<String, TokenizedTrackingInfo> map) {
        Intrinsics.checkNotNullParameter(removeHistoryActionName, "removeHistoryActionName");
        Intrinsics.checkNotNullParameter(removeAllHistoryActionName, "removeAllHistoryActionName");
        this.title = str;
        this.items = list;
        this.error = str2;
        this.removeHistoryActionName = removeHistoryActionName;
        this.removeAllHistoryActionName = removeAllHistoryActionName;
        this.clearHistoryTrackingInfo = map;
    }

    public static /* synthetic */ SearchHistoryDTO copy$default(SearchHistoryDTO searchHistoryDTO, String str, List list, String str2, String str3, String str4, Map map, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = searchHistoryDTO.title;
        }
        if ((i11 & 2) != 0) {
            list = searchHistoryDTO.items;
        }
        if ((i11 & 4) != 0) {
            str2 = searchHistoryDTO.error;
        }
        if ((i11 & 8) != 0) {
            str3 = searchHistoryDTO.removeHistoryActionName;
        }
        if ((i11 & 16) != 0) {
            str4 = searchHistoryDTO.removeAllHistoryActionName;
        }
        if ((i11 & 32) != 0) {
            map = searchHistoryDTO.clearHistoryTrackingInfo;
        }
        String str5 = str4;
        Map map2 = map;
        return searchHistoryDTO.copy(str, list, str2, str3, str5, map2);
    }

    @JsonCollectionDecoding
    public static /* synthetic */ void getItems$annotations() {
    }

    /* renamed from: component1, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    public final List<ItemDTO> component2() {
        return this.items;
    }

    /* renamed from: component3, reason: from getter */
    public final String getError() {
        return this.error;
    }

    @NotNull
    /* renamed from: component4, reason: from getter */
    public final String getRemoveHistoryActionName() {
        return this.removeHistoryActionName;
    }

    @NotNull
    /* renamed from: component5, reason: from getter */
    public final String getRemoveAllHistoryActionName() {
        return this.removeAllHistoryActionName;
    }

    public final Map<String, TokenizedTrackingInfo> component6() {
        return this.clearHistoryTrackingInfo;
    }

    @NotNull
    public final SearchHistoryDTO copy(String title, List<ItemDTO> items, String error, @NotNull String removeHistoryActionName, @NotNull String removeAllHistoryActionName, Map<String, TokenizedTrackingInfo> clearHistoryTrackingInfo) {
        Intrinsics.checkNotNullParameter(removeHistoryActionName, "removeHistoryActionName");
        Intrinsics.checkNotNullParameter(removeAllHistoryActionName, "removeAllHistoryActionName");
        return new SearchHistoryDTO(title, items, error, removeHistoryActionName, removeAllHistoryActionName, clearHistoryTrackingInfo);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SearchHistoryDTO)) {
            return false;
        }
        SearchHistoryDTO searchHistoryDTO = (SearchHistoryDTO) other;
        return Intrinsics.d(this.title, searchHistoryDTO.title) && Intrinsics.d(this.items, searchHistoryDTO.items) && Intrinsics.d(this.error, searchHistoryDTO.error) && Intrinsics.d(this.removeHistoryActionName, searchHistoryDTO.removeHistoryActionName) && Intrinsics.d(this.removeAllHistoryActionName, searchHistoryDTO.removeAllHistoryActionName) && Intrinsics.d(this.clearHistoryTrackingInfo, searchHistoryDTO.clearHistoryTrackingInfo);
    }

    public final Map<String, TokenizedTrackingInfo> getClearHistoryTrackingInfo() {
        return this.clearHistoryTrackingInfo;
    }

    public final String getError() {
        return this.error;
    }

    public final List<ItemDTO> getItems() {
        return this.items;
    }

    @NotNull
    public final String getRemoveAllHistoryActionName() {
        return this.removeAllHistoryActionName;
    }

    @NotNull
    public final String getRemoveHistoryActionName() {
        return this.removeHistoryActionName;
    }

    public final String getTitle() {
        return this.title;
    }

    public int hashCode() {
        String str = this.title;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        List<ItemDTO> list = this.items;
        int hashCode2 = (hashCode + (list == null ? 0 : list.hashCode())) * 31;
        String str2 = this.error;
        int a11 = g.a(g.a((hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31, 31, this.removeHistoryActionName), 31, this.removeAllHistoryActionName);
        Map<String, TokenizedTrackingInfo> map = this.clearHistoryTrackingInfo;
        return a11 + (map != null ? map.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        String str = this.title;
        List<ItemDTO> list = this.items;
        String str2 = this.error;
        String str3 = this.removeHistoryActionName;
        String str4 = this.removeAllHistoryActionName;
        Map<String, TokenizedTrackingInfo> map = this.clearHistoryTrackingInfo;
        StringBuilder f7 = b.f("SearchHistoryDTO(title=", str, ", items=", ", error=", list);
        a.h(f7, str2, ", removeHistoryActionName=", str3, ", removeAllHistoryActionName=");
        return C4070a.a(f7, str4, ", clearHistoryTrackingInfo=", map, ")");
    }
}
