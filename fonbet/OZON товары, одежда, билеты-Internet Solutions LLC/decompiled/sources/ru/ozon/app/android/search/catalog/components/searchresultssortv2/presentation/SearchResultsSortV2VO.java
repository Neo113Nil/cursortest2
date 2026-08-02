package ru.ozon.app.android.search.catalog.components.searchresultssortv2.presentation;

import Cm.e;
import Lh.a;
import Pk0.b;
import WZ.t;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import l20.c;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.atoms.data.list.Select;
import ru.ozon.app.android.search.catalog.components.searchresultssortv2.data.SearchResultsSortV2DTO;
import ru.ozon.uni.atoms.data.button.ButtonV3Atom;

@Metadata(d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0019\b\u0087\b\u0018\u00002\u00060\u0001j\u0002`\u0002:\u00014BK\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\r\u0012\u000e\u0010\u0011\u001a\n\u0018\u00010\u000fj\u0004\u0018\u0001`\u0010¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0015\u001a\u00020\u0014HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0018\u001a\u00020\u0017HÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u001a\u0010\u001d\u001a\u00020\u001c2\b\u0010\u001b\u001a\u0004\u0018\u00010\u001aHÖ\u0003¢\u0006\u0004\b\u001d\u0010\u001eR\u001a\u0010\u0004\u001a\u00020\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u001f\u001a\u0004\b \u0010!R\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010\"\u001a\u0004\b#\u0010$R\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010%\u001a\u0004\b&\u0010'R\u0017\u0010\n\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\n\u0010(\u001a\u0004\b)\u0010*R\u0017\u0010\f\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\b\f\u0010+\u001a\u0004\b,\u0010-R\u0019\u0010\u000e\u001a\u0004\u0018\u00010\r8\u0006¢\u0006\f\n\u0004\b\u000e\u0010.\u001a\u0004\b/\u00100R\u001f\u0010\u0011\u001a\n\u0018\u00010\u000fj\u0004\u0018\u0001`\u00108\u0006¢\u0006\f\n\u0004\b\u0011\u00101\u001a\u0004\b2\u00103¨\u00065"}, d2 = {"Lru/ozon/app/android/search/catalog/components/searchresultssortv2/presentation/SearchResultsSortV2VO;", "Ll20/c;", "Lru/ozon/app/android/composer/view/ViewObject;", "", "id", "Lru/ozon/uni/atoms/data/button/ButtonV3Atom$SmallIconButton;", "viewButton", "Lru/ozon/app/android/atoms/data/list/Select;", "sortButton", "", "sortBias", "Lru/ozon/app/android/search/catalog/components/searchresultssortv2/presentation/SearchResultsSortV2VO$SortButtonMargins;", "sortMargins", "Lru/ozon/app/android/search/catalog/components/searchresultssortv2/data/SearchResultsSortV2DTO$FilterButton;", "filterButton", "LWZ/t;", "Lru/ozon/app/android/analytics/modules/tokenized/TokenizedEvent;", "filterButtonEvent", "<init>", "(JLru/ozon/uni/atoms/data/button/ButtonV3Atom$SmallIconButton;Lru/ozon/app/android/atoms/data/list/Select;FLru/ozon/app/android/search/catalog/components/searchresultssortv2/presentation/SearchResultsSortV2VO$SortButtonMargins;Lru/ozon/app/android/search/catalog/components/searchresultssortv2/data/SearchResultsSortV2DTO$FilterButton;LWZ/t;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "J", "getId", "()J", "Lru/ozon/uni/atoms/data/button/ButtonV3Atom$SmallIconButton;", "getViewButton", "()Lru/ozon/uni/atoms/data/button/ButtonV3Atom$SmallIconButton;", "Lru/ozon/app/android/atoms/data/list/Select;", "getSortButton", "()Lru/ozon/app/android/atoms/data/list/Select;", "F", "getSortBias", "()F", "Lru/ozon/app/android/search/catalog/components/searchresultssortv2/presentation/SearchResultsSortV2VO$SortButtonMargins;", "getSortMargins", "()Lru/ozon/app/android/search/catalog/components/searchresultssortv2/presentation/SearchResultsSortV2VO$SortButtonMargins;", "Lru/ozon/app/android/search/catalog/components/searchresultssortv2/data/SearchResultsSortV2DTO$FilterButton;", "getFilterButton", "()Lru/ozon/app/android/search/catalog/components/searchresultssortv2/data/SearchResultsSortV2DTO$FilterButton;", "LWZ/t;", "getFilterButtonEvent", "()LWZ/t;", "SortButtonMargins", "search_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final /* data */ class SearchResultsSortV2VO implements c {
    private final SearchResultsSortV2DTO.FilterButton filterButton;
    private final t filterButtonEvent;
    private final long id;
    private final float sortBias;

    @NotNull
    private final Select sortButton;

    @NotNull
    private final SortButtonMargins sortMargins;
    private final ButtonV3Atom.SmallIconButton viewButton;

    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0010\u001a\u0004\b\u0011\u0010\u000bR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0010\u001a\u0004\b\u0012\u0010\u000b¨\u0006\u0013"}, d2 = {"Lru/ozon/app/android/search/catalog/components/searchresultssortv2/presentation/SearchResultsSortV2VO$SortButtonMargins;", "", "", "marginStart", "marginEnd", "<init>", "(II)V", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "I", "getMarginStart", "getMarginEnd", "search_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class SortButtonMargins {
        private final int marginEnd;
        private final int marginStart;

        public SortButtonMargins(int i11, int i12) {
            this.marginStart = i11;
            this.marginEnd = i12;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof SortButtonMargins)) {
                return false;
            }
            SortButtonMargins sortButtonMargins = (SortButtonMargins) other;
            return this.marginStart == sortButtonMargins.marginStart && this.marginEnd == sortButtonMargins.marginEnd;
        }

        public final int getMarginEnd() {
            return this.marginEnd;
        }

        public final int getMarginStart() {
            return this.marginStart;
        }

        public int hashCode() {
            return Integer.hashCode(this.marginEnd) + (Integer.hashCode(this.marginStart) * 31);
        }

        @NotNull
        public String toString() {
            return e.c("SortButtonMargins(marginStart=", this.marginStart, ", marginEnd=", ")", this.marginEnd);
        }
    }

    public SearchResultsSortV2VO(long j11, ButtonV3Atom.SmallIconButton smallIconButton, @NotNull Select sortButton, float f7, @NotNull SortButtonMargins sortMargins, SearchResultsSortV2DTO.FilterButton filterButton, t tVar) {
        Intrinsics.checkNotNullParameter(sortButton, "sortButton");
        Intrinsics.checkNotNullParameter(sortMargins, "sortMargins");
        this.id = j11;
        this.viewButton = smallIconButton;
        this.sortButton = sortButton;
        this.sortBias = f7;
        this.sortMargins = sortMargins;
        this.filterButton = filterButton;
        this.filterButtonEvent = tVar;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SearchResultsSortV2VO)) {
            return false;
        }
        SearchResultsSortV2VO searchResultsSortV2VO = (SearchResultsSortV2VO) other;
        return this.id == searchResultsSortV2VO.id && Intrinsics.d(this.viewButton, searchResultsSortV2VO.viewButton) && Intrinsics.d(this.sortButton, searchResultsSortV2VO.sortButton) && Float.compare(this.sortBias, searchResultsSortV2VO.sortBias) == 0 && Intrinsics.d(this.sortMargins, searchResultsSortV2VO.sortMargins) && Intrinsics.d(this.filterButton, searchResultsSortV2VO.filterButton) && Intrinsics.d(this.filterButtonEvent, searchResultsSortV2VO.filterButtonEvent);
    }

    public final SearchResultsSortV2DTO.FilterButton getFilterButton() {
        return this.filterButton;
    }

    public final t getFilterButtonEvent() {
        return this.filterButtonEvent;
    }

    @Override // l20.c
    public long getId() {
        return this.id;
    }

    @Override // l20.c
    public Integer getScrollWidgetKey() {
        return null;
    }

    public final float getSortBias() {
        return this.sortBias;
    }

    @NotNull
    public final Select getSortButton() {
        return this.sortButton;
    }

    @NotNull
    public final SortButtonMargins getSortMargins() {
        return this.sortMargins;
    }

    public final ButtonV3Atom.SmallIconButton getViewButton() {
        return this.viewButton;
    }

    @Override // l20.c
    public int getViewItemKey() {
        return hashCode();
    }

    public int hashCode() {
        int hashCode = Long.hashCode(this.id) * 31;
        ButtonV3Atom.SmallIconButton smallIconButton = this.viewButton;
        int hashCode2 = (this.sortMargins.hashCode() + b.a(this.sortBias, (this.sortButton.hashCode() + ((hashCode + (smallIconButton == null ? 0 : smallIconButton.hashCode())) * 31)) * 31, 31)) * 31;
        SearchResultsSortV2DTO.FilterButton filterButton = this.filterButton;
        int hashCode3 = (hashCode2 + (filterButton == null ? 0 : filterButton.hashCode())) * 31;
        t tVar = this.filterButtonEvent;
        return hashCode3 + (tVar != null ? tVar.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        long j11 = this.id;
        ButtonV3Atom.SmallIconButton smallIconButton = this.viewButton;
        Select select = this.sortButton;
        float f7 = this.sortBias;
        SortButtonMargins sortButtonMargins = this.sortMargins;
        SearchResultsSortV2DTO.FilterButton filterButton = this.filterButton;
        t tVar = this.filterButtonEvent;
        StringBuilder sb2 = new StringBuilder("SearchResultsSortV2VO(id=");
        sb2.append(j11);
        sb2.append(", viewButton=");
        sb2.append(smallIconButton);
        sb2.append(", sortButton=");
        sb2.append(select);
        sb2.append(", sortBias=");
        sb2.append(f7);
        sb2.append(", sortMargins=");
        sb2.append(sortButtonMargins);
        sb2.append(", filterButton=");
        sb2.append(filterButton);
        return a.b(sb2, ", filterButtonEvent=", tVar, ")");
    }
}
