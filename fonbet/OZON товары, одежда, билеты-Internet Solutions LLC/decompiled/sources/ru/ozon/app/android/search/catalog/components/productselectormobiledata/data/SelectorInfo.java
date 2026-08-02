package ru.ozon.app.android.search.catalog.components.productselectormobiledata.data;

import An.C2439a;
import B0.A0;
import com.squareup.moshi.j;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.atoms.data.cells.CellAtom;
import ru.ozon.uni.atoms.data.AtomDTO;

@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0002\u0006\u0007¨\u0006\b"}, d2 = {"Lru/ozon/app/android/search/catalog/components/productselectormobiledata/data/SelectorInfo;", "", "<init>", "()V", "SelectorStepData", "SelectorData", "Lru/ozon/app/android/search/catalog/components/productselectormobiledata/data/SelectorInfo$SelectorData;", "Lru/ozon/app/android/search/catalog/components/productselectormobiledata/data/SelectorInfo$SelectorStepData;", "search_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public abstract class SelectorInfo {
    public static final int $stable = 0;

    @j(generateAdapter = true)
    @Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\u000f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0003J#\u0010\u000f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0001J\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013HÖ\u0003J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001J\t\u0010\u0016\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006\u0017"}, d2 = {"Lru/ozon/app/android/search/catalog/components/productselectormobiledata/data/SelectorInfo$SelectorData;", "Lru/ozon/app/android/search/catalog/components/productselectormobiledata/data/SelectorInfo;", "headerTitle", "", "stepCells", "", "Lru/ozon/app/android/atoms/data/cells/CellAtom$CellAtomWithSubtitle$CellWithSubtitleDefault;", "<init>", "(Ljava/lang/String;Ljava/util/List;)V", "getHeaderTitle", "()Ljava/lang/String;", "getStepCells", "()Ljava/util/List;", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", "", "toString", "search_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class SelectorData extends SelectorInfo {
        public static final int $stable = 8;

        @NotNull
        private final String headerTitle;

        @NotNull
        private final List<CellAtom.CellAtomWithSubtitle.CellWithSubtitleDefault> stepCells;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public SelectorData(@NotNull String headerTitle, @NotNull List<CellAtom.CellAtomWithSubtitle.CellWithSubtitleDefault> stepCells) {
            super(null);
            Intrinsics.checkNotNullParameter(headerTitle, "headerTitle");
            Intrinsics.checkNotNullParameter(stepCells, "stepCells");
            this.headerTitle = headerTitle;
            this.stepCells = stepCells;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ SelectorData copy$default(SelectorData selectorData, String str, List list, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                str = selectorData.headerTitle;
            }
            if ((i11 & 2) != 0) {
                list = selectorData.stepCells;
            }
            return selectorData.copy(str, list);
        }

        @NotNull
        /* renamed from: component1, reason: from getter */
        public final String getHeaderTitle() {
            return this.headerTitle;
        }

        @NotNull
        public final List<CellAtom.CellAtomWithSubtitle.CellWithSubtitleDefault> component2() {
            return this.stepCells;
        }

        @NotNull
        public final SelectorData copy(@NotNull String headerTitle, @NotNull List<CellAtom.CellAtomWithSubtitle.CellWithSubtitleDefault> stepCells) {
            Intrinsics.checkNotNullParameter(headerTitle, "headerTitle");
            Intrinsics.checkNotNullParameter(stepCells, "stepCells");
            return new SelectorData(headerTitle, stepCells);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof SelectorData)) {
                return false;
            }
            SelectorData selectorData = (SelectorData) other;
            return Intrinsics.d(this.headerTitle, selectorData.headerTitle) && Intrinsics.d(this.stepCells, selectorData.stepCells);
        }

        @NotNull
        public final String getHeaderTitle() {
            return this.headerTitle;
        }

        @NotNull
        public final List<CellAtom.CellAtomWithSubtitle.CellWithSubtitleDefault> getStepCells() {
            return this.stepCells;
        }

        public int hashCode() {
            return this.stepCells.hashCode() + (this.headerTitle.hashCode() * 31);
        }

        @NotNull
        public String toString() {
            return C2439a.a("SelectorData(headerTitle=", this.headerTitle, ", stepCells=", ")", this.stepCells);
        }
    }

    @Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u0018B\u001f\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u000b\u0010\r\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0003J%\u0010\u000f\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0001J\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013HÖ\u0003J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006\u0019"}, d2 = {"Lru/ozon/app/android/search/catalog/components/productselectormobiledata/data/SelectorInfo$SelectorStepData;", "Lru/ozon/app/android/search/catalog/components/productselectormobiledata/data/SelectorInfo;", "searchBar", "Lru/ozon/app/android/search/catalog/components/productselectormobiledata/data/SelectorInfo$SelectorStepData$SearchBar;", "valueCells", "", "Lru/ozon/uni/atoms/data/AtomDTO;", "<init>", "(Lru/ozon/app/android/search/catalog/components/productselectormobiledata/data/SelectorInfo$SelectorStepData$SearchBar;Ljava/util/List;)V", "getSearchBar", "()Lru/ozon/app/android/search/catalog/components/productselectormobiledata/data/SelectorInfo$SelectorStepData$SearchBar;", "getValueCells", "()Ljava/util/List;", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "SearchBar", "search_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    @j(generateAdapter = true)
    public static final /* data */ class SelectorStepData extends SelectorInfo {
        public static final int $stable = 8;
        private final SearchBar searchBar;

        @NotNull
        private final List<AtomDTO> valueCells;

        @j(generateAdapter = true)
        @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\r\u001a\u00020\u000eHÖ\u0001J\t\u0010\u000f\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0010"}, d2 = {"Lru/ozon/app/android/search/catalog/components/productselectormobiledata/data/SelectorInfo$SelectorStepData$SearchBar;", "", "hint", "", "<init>", "(Ljava/lang/String;)V", "getHint", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "hashCode", "", "toString", "search_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final /* data */ class SearchBar {
            public static final int $stable = 0;

            @NotNull
            private final String hint;

            public SearchBar(@NotNull String hint) {
                Intrinsics.checkNotNullParameter(hint, "hint");
                this.hint = hint;
            }

            public static /* synthetic */ SearchBar copy$default(SearchBar searchBar, String str, int i11, Object obj) {
                if ((i11 & 1) != 0) {
                    str = searchBar.hint;
                }
                return searchBar.copy(str);
            }

            @NotNull
            /* renamed from: component1, reason: from getter */
            public final String getHint() {
                return this.hint;
            }

            @NotNull
            public final SearchBar copy(@NotNull String hint) {
                Intrinsics.checkNotNullParameter(hint, "hint");
                return new SearchBar(hint);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof SearchBar) && Intrinsics.d(this.hint, ((SearchBar) other).hint);
            }

            @NotNull
            public final String getHint() {
                return this.hint;
            }

            public int hashCode() {
                return this.hint.hashCode();
            }

            @NotNull
            public String toString() {
                return A0.b("SearchBar(hint=", this.hint, ")");
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public SelectorStepData(SearchBar searchBar, @NotNull List<? extends AtomDTO> valueCells) {
            super(null);
            Intrinsics.checkNotNullParameter(valueCells, "valueCells");
            this.searchBar = searchBar;
            this.valueCells = valueCells;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ SelectorStepData copy$default(SelectorStepData selectorStepData, SearchBar searchBar, List list, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                searchBar = selectorStepData.searchBar;
            }
            if ((i11 & 2) != 0) {
                list = selectorStepData.valueCells;
            }
            return selectorStepData.copy(searchBar, list);
        }

        /* renamed from: component1, reason: from getter */
        public final SearchBar getSearchBar() {
            return this.searchBar;
        }

        @NotNull
        public final List<AtomDTO> component2() {
            return this.valueCells;
        }

        @NotNull
        public final SelectorStepData copy(SearchBar searchBar, @NotNull List<? extends AtomDTO> valueCells) {
            Intrinsics.checkNotNullParameter(valueCells, "valueCells");
            return new SelectorStepData(searchBar, valueCells);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof SelectorStepData)) {
                return false;
            }
            SelectorStepData selectorStepData = (SelectorStepData) other;
            return Intrinsics.d(this.searchBar, selectorStepData.searchBar) && Intrinsics.d(this.valueCells, selectorStepData.valueCells);
        }

        public final SearchBar getSearchBar() {
            return this.searchBar;
        }

        @NotNull
        public final List<AtomDTO> getValueCells() {
            return this.valueCells;
        }

        public int hashCode() {
            SearchBar searchBar = this.searchBar;
            return this.valueCells.hashCode() + ((searchBar == null ? 0 : searchBar.hashCode()) * 31);
        }

        @NotNull
        public String toString() {
            return "SelectorStepData(searchBar=" + this.searchBar + ", valueCells=" + this.valueCells + ")";
        }
    }

    public /* synthetic */ SelectorInfo(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private SelectorInfo() {
    }
}
