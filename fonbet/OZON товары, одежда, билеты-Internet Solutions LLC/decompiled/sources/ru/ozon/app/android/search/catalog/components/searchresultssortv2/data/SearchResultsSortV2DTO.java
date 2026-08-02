package ru.ozon.app.android.search.catalog.components.searchresultssortv2.data;

import Pk0.h;
import Sh.b;
import V.e;
import com.squareup.moshi.j;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.tokenized.model.TokenizedTrackingInfo;
import ru.ozon.app.android.atoms.data.list.ListElementAtom;
import ru.ozon.app.android.atoms.data.list.Select;
import ru.ozon.uni.atoms.data.AtomActionDTO;
import ru.ozon.uni.atoms.data.TestInfo;
import ru.ozon.uni.atoms.data.button.ButtonV3Atom;

@j(generateAdapter = true)
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u001bB#\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\b\u0010\tJ\u000b\u0010\u0010\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0005HÆ\u0003J\u000b\u0010\u0012\u001a\u0004\u0018\u00010\u0007HÆ\u0003J+\u0010\u0013\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÆ\u0001J\u0013\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0017\u001a\u00020\u0018HÖ\u0001J\t\u0010\u0019\u001a\u00020\u001aHÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u001c"}, d2 = {"Lru/ozon/app/android/search/catalog/components/searchresultssortv2/data/SearchResultsSortV2DTO;", "", "viewButton", "Lru/ozon/uni/atoms/data/button/ButtonV3Atom$SmallIconButton;", "sortButton", "Lru/ozon/app/android/atoms/data/list/Select;", "filterButton", "Lru/ozon/app/android/search/catalog/components/searchresultssortv2/data/SearchResultsSortV2DTO$FilterButton;", "<init>", "(Lru/ozon/uni/atoms/data/button/ButtonV3Atom$SmallIconButton;Lru/ozon/app/android/atoms/data/list/Select;Lru/ozon/app/android/search/catalog/components/searchresultssortv2/data/SearchResultsSortV2DTO$FilterButton;)V", "getViewButton", "()Lru/ozon/uni/atoms/data/button/ButtonV3Atom$SmallIconButton;", "getSortButton", "()Lru/ozon/app/android/atoms/data/list/Select;", "getFilterButton", "()Lru/ozon/app/android/search/catalog/components/searchresultssortv2/data/SearchResultsSortV2DTO$FilterButton;", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "", "FilterButton", "search_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final /* data */ class SearchResultsSortV2DTO {
    public static final int $stable = 8;
    private final FilterButton filterButton;

    @NotNull
    private final Select sortButton;
    private final ButtonV3Atom.SmallIconButton viewButton;

    @Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001:\u0001&BC\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\u0014\u0010\b\u001a\u0010\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\t\u0012\b\u0010\f\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b\u000e\u0010\u000fJ\t\u0010\u001a\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u001b\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u001c\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u0017\u0010\u001d\u001a\u0010\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\tHÆ\u0003J\u000b\u0010\u001e\u001a\u0004\u0018\u00010\rHÆ\u0003JO\u0010\u001f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\u0016\b\u0002\u0010\b\u001a\u0010\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\t2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\rHÆ\u0001J\u0013\u0010 \u001a\u00020!2\b\u0010\"\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010#\u001a\u00020$HÖ\u0001J\t\u0010%\u001a\u00020\nHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u001f\u0010\b\u001a\u0010\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0013\u0010\f\u001a\u0004\u0018\u00010\r¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019¨\u0006'"}, d2 = {"Lru/ozon/app/android/search/catalog/components/searchresultssortv2/data/SearchResultsSortV2DTO$FilterButton;", "", "icon", "Lru/ozon/app/android/atoms/data/list/ListElementAtom$Marker$Icon;", "badge", "Lru/ozon/app/android/search/catalog/components/searchresultssortv2/data/SearchResultsSortV2DTO$FilterButton$FilterBadge;", "action", "Lru/ozon/uni/atoms/data/AtomActionDTO;", "trackingInfo", "", "", "Lru/ozon/android/tokenized/model/TokenizedTrackingInfo;", "testInfo", "Lru/ozon/uni/atoms/data/TestInfo;", "<init>", "(Lru/ozon/app/android/atoms/data/list/ListElementAtom$Marker$Icon;Lru/ozon/app/android/search/catalog/components/searchresultssortv2/data/SearchResultsSortV2DTO$FilterButton$FilterBadge;Lru/ozon/uni/atoms/data/AtomActionDTO;Ljava/util/Map;Lru/ozon/uni/atoms/data/TestInfo;)V", "getIcon", "()Lru/ozon/app/android/atoms/data/list/ListElementAtom$Marker$Icon;", "getBadge", "()Lru/ozon/app/android/search/catalog/components/searchresultssortv2/data/SearchResultsSortV2DTO$FilterButton$FilterBadge;", "getAction", "()Lru/ozon/uni/atoms/data/AtomActionDTO;", "getTrackingInfo", "()Ljava/util/Map;", "getTestInfo", "()Lru/ozon/uni/atoms/data/TestInfo;", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", "hashCode", "", "toString", "FilterBadge", "search_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    @j(generateAdapter = true)
    public static final /* data */ class FilterButton {
        public static final int $stable = 8;
        private final AtomActionDTO action;
        private final FilterBadge badge;

        @NotNull
        private final ListElementAtom.Marker.Icon icon;
        private final TestInfo testInfo;
        private final Map<String, TokenizedTrackingInfo> trackingInfo;

        @j(generateAdapter = true)
        @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u000b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u001f\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001J\t\u0010\u0012\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\b¨\u0006\u0013"}, d2 = {"Lru/ozon/app/android/search/catalog/components/searchresultssortv2/data/SearchResultsSortV2DTO$FilterButton$FilterBadge;", "", "text", "", "backgroundColor", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "getText", "()Ljava/lang/String;", "getBackgroundColor", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "search_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final /* data */ class FilterBadge {
            public static final int $stable = 0;
            private final String backgroundColor;

            @NotNull
            private final String text;

            public FilterBadge(@NotNull String text, String str) {
                Intrinsics.checkNotNullParameter(text, "text");
                this.text = text;
                this.backgroundColor = str;
            }

            public static /* synthetic */ FilterBadge copy$default(FilterBadge filterBadge, String str, String str2, int i11, Object obj) {
                if ((i11 & 1) != 0) {
                    str = filterBadge.text;
                }
                if ((i11 & 2) != 0) {
                    str2 = filterBadge.backgroundColor;
                }
                return filterBadge.copy(str, str2);
            }

            @NotNull
            /* renamed from: component1, reason: from getter */
            public final String getText() {
                return this.text;
            }

            /* renamed from: component2, reason: from getter */
            public final String getBackgroundColor() {
                return this.backgroundColor;
            }

            @NotNull
            public final FilterBadge copy(@NotNull String text, String backgroundColor) {
                Intrinsics.checkNotNullParameter(text, "text");
                return new FilterBadge(text, backgroundColor);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof FilterBadge)) {
                    return false;
                }
                FilterBadge filterBadge = (FilterBadge) other;
                return Intrinsics.d(this.text, filterBadge.text) && Intrinsics.d(this.backgroundColor, filterBadge.backgroundColor);
            }

            public final String getBackgroundColor() {
                return this.backgroundColor;
            }

            @NotNull
            public final String getText() {
                return this.text;
            }

            public int hashCode() {
                int hashCode = this.text.hashCode() * 31;
                String str = this.backgroundColor;
                return hashCode + (str == null ? 0 : str.hashCode());
            }

            @NotNull
            public String toString() {
                return e.a("FilterBadge(text=", this.text, ", backgroundColor=", this.backgroundColor, ")");
            }
        }

        public FilterButton(@NotNull ListElementAtom.Marker.Icon icon, FilterBadge filterBadge, AtomActionDTO atomActionDTO, Map<String, TokenizedTrackingInfo> map, TestInfo testInfo) {
            Intrinsics.checkNotNullParameter(icon, "icon");
            this.icon = icon;
            this.badge = filterBadge;
            this.action = atomActionDTO;
            this.trackingInfo = map;
            this.testInfo = testInfo;
        }

        public static /* synthetic */ FilterButton copy$default(FilterButton filterButton, ListElementAtom.Marker.Icon icon, FilterBadge filterBadge, AtomActionDTO atomActionDTO, Map map, TestInfo testInfo, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                icon = filterButton.icon;
            }
            if ((i11 & 2) != 0) {
                filterBadge = filterButton.badge;
            }
            if ((i11 & 4) != 0) {
                atomActionDTO = filterButton.action;
            }
            if ((i11 & 8) != 0) {
                map = filterButton.trackingInfo;
            }
            if ((i11 & 16) != 0) {
                testInfo = filterButton.testInfo;
            }
            TestInfo testInfo2 = testInfo;
            AtomActionDTO atomActionDTO2 = atomActionDTO;
            return filterButton.copy(icon, filterBadge, atomActionDTO2, map, testInfo2);
        }

        @NotNull
        /* renamed from: component1, reason: from getter */
        public final ListElementAtom.Marker.Icon getIcon() {
            return this.icon;
        }

        /* renamed from: component2, reason: from getter */
        public final FilterBadge getBadge() {
            return this.badge;
        }

        /* renamed from: component3, reason: from getter */
        public final AtomActionDTO getAction() {
            return this.action;
        }

        public final Map<String, TokenizedTrackingInfo> component4() {
            return this.trackingInfo;
        }

        /* renamed from: component5, reason: from getter */
        public final TestInfo getTestInfo() {
            return this.testInfo;
        }

        @NotNull
        public final FilterButton copy(@NotNull ListElementAtom.Marker.Icon icon, FilterBadge badge, AtomActionDTO action, Map<String, TokenizedTrackingInfo> trackingInfo, TestInfo testInfo) {
            Intrinsics.checkNotNullParameter(icon, "icon");
            return new FilterButton(icon, badge, action, trackingInfo, testInfo);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof FilterButton)) {
                return false;
            }
            FilterButton filterButton = (FilterButton) other;
            return Intrinsics.d(this.icon, filterButton.icon) && Intrinsics.d(this.badge, filterButton.badge) && Intrinsics.d(this.action, filterButton.action) && Intrinsics.d(this.trackingInfo, filterButton.trackingInfo) && Intrinsics.d(this.testInfo, filterButton.testInfo);
        }

        public final AtomActionDTO getAction() {
            return this.action;
        }

        public final FilterBadge getBadge() {
            return this.badge;
        }

        @NotNull
        public final ListElementAtom.Marker.Icon getIcon() {
            return this.icon;
        }

        public final TestInfo getTestInfo() {
            return this.testInfo;
        }

        public final Map<String, TokenizedTrackingInfo> getTrackingInfo() {
            return this.trackingInfo;
        }

        public int hashCode() {
            int hashCode = this.icon.hashCode() * 31;
            FilterBadge filterBadge = this.badge;
            int hashCode2 = (hashCode + (filterBadge == null ? 0 : filterBadge.hashCode())) * 31;
            AtomActionDTO atomActionDTO = this.action;
            int hashCode3 = (hashCode2 + (atomActionDTO == null ? 0 : atomActionDTO.hashCode())) * 31;
            Map<String, TokenizedTrackingInfo> map = this.trackingInfo;
            int hashCode4 = (hashCode3 + (map == null ? 0 : map.hashCode())) * 31;
            TestInfo testInfo = this.testInfo;
            return hashCode4 + (testInfo != null ? testInfo.hashCode() : 0);
        }

        @NotNull
        public String toString() {
            ListElementAtom.Marker.Icon icon = this.icon;
            FilterBadge filterBadge = this.badge;
            AtomActionDTO atomActionDTO = this.action;
            Map<String, TokenizedTrackingInfo> map = this.trackingInfo;
            TestInfo testInfo = this.testInfo;
            StringBuilder sb2 = new StringBuilder("FilterButton(icon=");
            sb2.append(icon);
            sb2.append(", badge=");
            sb2.append(filterBadge);
            sb2.append(", action=");
            b.f(sb2, atomActionDTO, ", trackingInfo=", map, ", testInfo=");
            return h.c(sb2, testInfo, ")");
        }
    }

    public SearchResultsSortV2DTO(ButtonV3Atom.SmallIconButton smallIconButton, @NotNull Select sortButton, FilterButton filterButton) {
        Intrinsics.checkNotNullParameter(sortButton, "sortButton");
        this.viewButton = smallIconButton;
        this.sortButton = sortButton;
        this.filterButton = filterButton;
    }

    public static /* synthetic */ SearchResultsSortV2DTO copy$default(SearchResultsSortV2DTO searchResultsSortV2DTO, ButtonV3Atom.SmallIconButton smallIconButton, Select select, FilterButton filterButton, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            smallIconButton = searchResultsSortV2DTO.viewButton;
        }
        if ((i11 & 2) != 0) {
            select = searchResultsSortV2DTO.sortButton;
        }
        if ((i11 & 4) != 0) {
            filterButton = searchResultsSortV2DTO.filterButton;
        }
        return searchResultsSortV2DTO.copy(smallIconButton, select, filterButton);
    }

    /* renamed from: component1, reason: from getter */
    public final ButtonV3Atom.SmallIconButton getViewButton() {
        return this.viewButton;
    }

    @NotNull
    /* renamed from: component2, reason: from getter */
    public final Select getSortButton() {
        return this.sortButton;
    }

    /* renamed from: component3, reason: from getter */
    public final FilterButton getFilterButton() {
        return this.filterButton;
    }

    @NotNull
    public final SearchResultsSortV2DTO copy(ButtonV3Atom.SmallIconButton viewButton, @NotNull Select sortButton, FilterButton filterButton) {
        Intrinsics.checkNotNullParameter(sortButton, "sortButton");
        return new SearchResultsSortV2DTO(viewButton, sortButton, filterButton);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SearchResultsSortV2DTO)) {
            return false;
        }
        SearchResultsSortV2DTO searchResultsSortV2DTO = (SearchResultsSortV2DTO) other;
        return Intrinsics.d(this.viewButton, searchResultsSortV2DTO.viewButton) && Intrinsics.d(this.sortButton, searchResultsSortV2DTO.sortButton) && Intrinsics.d(this.filterButton, searchResultsSortV2DTO.filterButton);
    }

    public final FilterButton getFilterButton() {
        return this.filterButton;
    }

    @NotNull
    public final Select getSortButton() {
        return this.sortButton;
    }

    public final ButtonV3Atom.SmallIconButton getViewButton() {
        return this.viewButton;
    }

    public int hashCode() {
        ButtonV3Atom.SmallIconButton smallIconButton = this.viewButton;
        int hashCode = (this.sortButton.hashCode() + ((smallIconButton == null ? 0 : smallIconButton.hashCode()) * 31)) * 31;
        FilterButton filterButton = this.filterButton;
        return hashCode + (filterButton != null ? filterButton.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "SearchResultsSortV2DTO(viewButton=" + this.viewButton + ", sortButton=" + this.sortButton + ", filterButton=" + this.filterButton + ")";
    }
}
