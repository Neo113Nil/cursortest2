package ru.ozon.app.android.common.filterWidgets.filtervalues.data.models;

import B0.A0;
import G.g;
import N3.C3660k;
import T7.P;
import Tl.b;
import com.squareup.moshi.j;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.K;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.tokenized.model.TokenizedTrackingInfo;
import ru.ozon.app.android.atoms.data.cells.CellAtom;
import ru.ozon.app.android.common.filterWidgets.filters.data.FiltersDTO;
import ru.ozon.app.android.ugc.core.widgets.commentsListV3.data.CommentV3DTO;
import ru.ozon.app.android.ugc.widgets.selectionItemForm.data.SelectionItemFormDTO;
import ru.ozon.moshi.adapters.serialize.proto.ProtoOneOf;
import ru.ozon.moshi.adapters.serialize.proto.ProtoOneOfSignature;
import ru.ozon.uni.atoms.data.button.ButtonV3Atom;
import ru.ozon.uni.atoms.data.dsCell.CellDTO;
import ru.ozon.uni.atoms.data.texts.TextAtom;

@j(generateAdapter = true)
@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0019\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0081\b\u0018\u00002\u00020\u0001:\u000501234BM\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\b\u001a\u0004\u0018\u00010\t\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u000b\u0012\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000e0\r\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010¢\u0006\u0004\b\u0011\u0010\u0012J\t\u0010!\u001a\u00020\u0003HÆ\u0003J\t\u0010\"\u001a\u00020\u0005HÆ\u0003J\u000b\u0010#\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u000b\u0010$\u001a\u0004\u0018\u00010\tHÆ\u0003J\u000b\u0010%\u001a\u0004\u0018\u00010\u000bHÆ\u0003J\u000f\u0010&\u001a\b\u0012\u0004\u0012\u00020\u000e0\rHÆ\u0003J\u000b\u0010'\u001a\u0004\u0018\u00010\u0010HÆ\u0003J]\u0010(\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b2\u000e\b\u0002\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000e0\r2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0010HÆ\u0001J\u0013\u0010)\u001a\u00020*2\b\u0010+\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010,\u001a\u00020-HÖ\u0001J\t\u0010.\u001a\u00020/HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0013\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR\u0013\u0010\n\u001a\u0004\u0018\u00010\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001cR\u0017\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000e0\r¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001eR\u0013\u0010\u000f\u001a\u0004\u0018\u00010\u0010¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010 ¨\u00065"}, d2 = {"Lru/ozon/app/android/common/filterWidgets/filtervalues/data/models/FilterValuesDTO;", "", "filter", "Lru/ozon/app/android/common/filterWidgets/filtervalues/data/models/FilterValuesDTO$FilterInfo;", "navBar", "Lru/ozon/app/android/common/filterWidgets/filters/data/FiltersDTO$NavBar;", "description", "Lru/ozon/uni/atoms/data/texts/TextAtom;", "searchBar", "Lru/ozon/app/android/common/filterWidgets/filtervalues/data/models/FilterValuesDTO$SearchBar;", "selectionButtons", "Lru/ozon/app/android/common/filterWidgets/filtervalues/data/models/FilterValuesDTO$SelectionButtons;", "sections", "", "Lru/ozon/app/android/common/filterWidgets/filtervalues/data/models/FilterValuesDTO$Section;", "applyButton", "Lru/ozon/uni/atoms/data/button/ButtonV3Atom$LargeButton;", "<init>", "(Lru/ozon/app/android/common/filterWidgets/filtervalues/data/models/FilterValuesDTO$FilterInfo;Lru/ozon/app/android/common/filterWidgets/filters/data/FiltersDTO$NavBar;Lru/ozon/uni/atoms/data/texts/TextAtom;Lru/ozon/app/android/common/filterWidgets/filtervalues/data/models/FilterValuesDTO$SearchBar;Lru/ozon/app/android/common/filterWidgets/filtervalues/data/models/FilterValuesDTO$SelectionButtons;Ljava/util/List;Lru/ozon/uni/atoms/data/button/ButtonV3Atom$LargeButton;)V", "getFilter", "()Lru/ozon/app/android/common/filterWidgets/filtervalues/data/models/FilterValuesDTO$FilterInfo;", "getNavBar", "()Lru/ozon/app/android/common/filterWidgets/filters/data/FiltersDTO$NavBar;", "getDescription", "()Lru/ozon/uni/atoms/data/texts/TextAtom;", "getSearchBar", "()Lru/ozon/app/android/common/filterWidgets/filtervalues/data/models/FilterValuesDTO$SearchBar;", "getSelectionButtons", "()Lru/ozon/app/android/common/filterWidgets/filtervalues/data/models/FilterValuesDTO$SelectionButtons;", "getSections", "()Ljava/util/List;", "getApplyButton", "()Lru/ozon/uni/atoms/data/button/ButtonV3Atom$LargeButton;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "equals", "", "other", "hashCode", "", "toString", "", "FilterInfo", "SearchBar", "SelectionButtons", "Section", "WrappedCell", "filter-widgets_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final /* data */ class FilterValuesDTO {
    private final ButtonV3Atom.LargeButton applyButton;
    private final TextAtom description;

    @NotNull
    private final FilterInfo filter;

    @NotNull
    private final FiltersDTO.NavBar navBar;
    private final SearchBar searchBar;

    @NotNull
    private final List<Section> sections;
    private final SelectionButtons selectionButtons;

    @j(generateAdapter = true)
    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\r\u001a\u00020\u000eHÖ\u0001J\t\u0010\u000f\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0010"}, d2 = {"Lru/ozon/app/android/common/filterWidgets/filtervalues/data/models/FilterValuesDTO$SearchBar;", "", "hint", "", "<init>", "(Ljava/lang/String;)V", "getHint", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "hashCode", "", "toString", "filter-widgets_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class SearchBar {

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

    @j(generateAdapter = true)
    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B=\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0010\b\u0001\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0005\u0012\u000e\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\t\u0010\nJ\u000b\u0010\u0011\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0011\u0010\u0012\u001a\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0005HÆ\u0003J\u0011\u0010\u0013\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u0014\u001a\u0004\u0018\u00010\u0003HÆ\u0003JE\u0010\u0015\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\u0010\b\u0003\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u00052\u0010\b\u0002\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00052\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\u0016\u001a\u00020\u00172\b\u0010\u0018\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0019\u001a\u00020\u001aHÖ\u0001J\t\u0010\u001b\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0019\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0019\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000eR\u0013\u0010\b\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\f¨\u0006\u001c"}, d2 = {"Lru/ozon/app/android/common/filterWidgets/filtervalues/data/models/FilterValuesDTO$Section;", "", SelectionItemFormDTO.TITLE_FIELD_NAME, "", "values", "", "roundedCells", "Lru/ozon/app/android/atoms/data/cells/CellAtom$CellAtomWithSubtitle$CellWithSubtitle40IconCheckboxRadio;", CommentV3DTO.HEADER_FIELD_NAME, "<init>", "(Ljava/lang/String;Ljava/util/List;Ljava/util/List;Ljava/lang/String;)V", "getTitle", "()Ljava/lang/String;", "getValues", "()Ljava/util/List;", "getRoundedCells", "getHeader", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "", "toString", "filter-widgets_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class Section {
        private final String header;
        private final List<CellAtom.CellAtomWithSubtitle.CellWithSubtitle40IconCheckboxRadio> roundedCells;
        private final String title;
        private final List<Object> values;

        public Section(String str, @ProtoOneOfSignature.Container({@ProtoOneOfSignature(name = "cellWithSubtitle24IconCheckboxRadioCounter", type = CellAtom.CellAtomWithSubtitle.CellWithSubtitle24IconCheckboxRadioCounter.class), @ProtoOneOfSignature(name = "cellWithSubtitleCheckboxRadioCounter", type = CellAtom.CellAtomWithSubtitle.CellWithSubtitleCheckboxRadioCounter.class), @ProtoOneOfSignature(name = "cell", type = WrappedCell.class)}) @ProtoOneOf List<? extends Object> list, List<CellAtom.CellAtomWithSubtitle.CellWithSubtitle40IconCheckboxRadio> list2, String str2) {
            this.title = str;
            this.values = list;
            this.roundedCells = list2;
            this.header = str2;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ Section copy$default(Section section, String str, List list, List list2, String str2, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                str = section.title;
            }
            if ((i11 & 2) != 0) {
                list = section.values;
            }
            if ((i11 & 4) != 0) {
                list2 = section.roundedCells;
            }
            if ((i11 & 8) != 0) {
                str2 = section.header;
            }
            return section.copy(str, list, list2, str2);
        }

        /* renamed from: component1, reason: from getter */
        public final String getTitle() {
            return this.title;
        }

        public final List<Object> component2() {
            return this.values;
        }

        public final List<CellAtom.CellAtomWithSubtitle.CellWithSubtitle40IconCheckboxRadio> component3() {
            return this.roundedCells;
        }

        /* renamed from: component4, reason: from getter */
        public final String getHeader() {
            return this.header;
        }

        @NotNull
        public final Section copy(String title, @ProtoOneOfSignature.Container({@ProtoOneOfSignature(name = "cellWithSubtitle24IconCheckboxRadioCounter", type = CellAtom.CellAtomWithSubtitle.CellWithSubtitle24IconCheckboxRadioCounter.class), @ProtoOneOfSignature(name = "cellWithSubtitleCheckboxRadioCounter", type = CellAtom.CellAtomWithSubtitle.CellWithSubtitleCheckboxRadioCounter.class), @ProtoOneOfSignature(name = "cell", type = WrappedCell.class)}) @ProtoOneOf List<? extends Object> values, List<CellAtom.CellAtomWithSubtitle.CellWithSubtitle40IconCheckboxRadio> roundedCells, String header) {
            return new Section(title, values, roundedCells, header);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Section)) {
                return false;
            }
            Section section = (Section) other;
            return Intrinsics.d(this.title, section.title) && Intrinsics.d(this.values, section.values) && Intrinsics.d(this.roundedCells, section.roundedCells) && Intrinsics.d(this.header, section.header);
        }

        public final String getHeader() {
            return this.header;
        }

        public final List<CellAtom.CellAtomWithSubtitle.CellWithSubtitle40IconCheckboxRadio> getRoundedCells() {
            return this.roundedCells;
        }

        public final String getTitle() {
            return this.title;
        }

        public final List<Object> getValues() {
            return this.values;
        }

        public int hashCode() {
            String str = this.title;
            int hashCode = (str == null ? 0 : str.hashCode()) * 31;
            List<Object> list = this.values;
            int hashCode2 = (hashCode + (list == null ? 0 : list.hashCode())) * 31;
            List<CellAtom.CellAtomWithSubtitle.CellWithSubtitle40IconCheckboxRadio> list2 = this.roundedCells;
            int hashCode3 = (hashCode2 + (list2 == null ? 0 : list2.hashCode())) * 31;
            String str2 = this.header;
            return hashCode3 + (str2 != null ? str2.hashCode() : 0);
        }

        @NotNull
        public String toString() {
            String str = this.title;
            List<Object> list = this.values;
            List<CellAtom.CellAtomWithSubtitle.CellWithSubtitle40IconCheckboxRadio> list2 = this.roundedCells;
            String str2 = this.header;
            StringBuilder f7 = b.f("Section(title=", str, ", values=", ", roundedCells=", list);
            f7.append(list2);
            f7.append(", header=");
            f7.append(str2);
            f7.append(")");
            return f7.toString();
        }
    }

    @j(generateAdapter = true)
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\b¨\u0006\u0014"}, d2 = {"Lru/ozon/app/android/common/filterWidgets/filtervalues/data/models/FilterValuesDTO$SelectionButtons;", "", "selectAllButton", "Lru/ozon/uni/atoms/data/button/ButtonV3Atom$LargeBorderlessButton;", "deselectAllButton", "<init>", "(Lru/ozon/uni/atoms/data/button/ButtonV3Atom$LargeBorderlessButton;Lru/ozon/uni/atoms/data/button/ButtonV3Atom$LargeBorderlessButton;)V", "getSelectAllButton", "()Lru/ozon/uni/atoms/data/button/ButtonV3Atom$LargeBorderlessButton;", "getDeselectAllButton", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "", "filter-widgets_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class SelectionButtons {

        @NotNull
        private final ButtonV3Atom.LargeBorderlessButton deselectAllButton;

        @NotNull
        private final ButtonV3Atom.LargeBorderlessButton selectAllButton;

        public SelectionButtons(@NotNull ButtonV3Atom.LargeBorderlessButton selectAllButton, @NotNull ButtonV3Atom.LargeBorderlessButton deselectAllButton) {
            Intrinsics.checkNotNullParameter(selectAllButton, "selectAllButton");
            Intrinsics.checkNotNullParameter(deselectAllButton, "deselectAllButton");
            this.selectAllButton = selectAllButton;
            this.deselectAllButton = deselectAllButton;
        }

        public static /* synthetic */ SelectionButtons copy$default(SelectionButtons selectionButtons, ButtonV3Atom.LargeBorderlessButton largeBorderlessButton, ButtonV3Atom.LargeBorderlessButton largeBorderlessButton2, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                largeBorderlessButton = selectionButtons.selectAllButton;
            }
            if ((i11 & 2) != 0) {
                largeBorderlessButton2 = selectionButtons.deselectAllButton;
            }
            return selectionButtons.copy(largeBorderlessButton, largeBorderlessButton2);
        }

        @NotNull
        /* renamed from: component1, reason: from getter */
        public final ButtonV3Atom.LargeBorderlessButton getSelectAllButton() {
            return this.selectAllButton;
        }

        @NotNull
        /* renamed from: component2, reason: from getter */
        public final ButtonV3Atom.LargeBorderlessButton getDeselectAllButton() {
            return this.deselectAllButton;
        }

        @NotNull
        public final SelectionButtons copy(@NotNull ButtonV3Atom.LargeBorderlessButton selectAllButton, @NotNull ButtonV3Atom.LargeBorderlessButton deselectAllButton) {
            Intrinsics.checkNotNullParameter(selectAllButton, "selectAllButton");
            Intrinsics.checkNotNullParameter(deselectAllButton, "deselectAllButton");
            return new SelectionButtons(selectAllButton, deselectAllButton);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof SelectionButtons)) {
                return false;
            }
            SelectionButtons selectionButtons = (SelectionButtons) other;
            return Intrinsics.d(this.selectAllButton, selectionButtons.selectAllButton) && Intrinsics.d(this.deselectAllButton, selectionButtons.deselectAllButton);
        }

        @NotNull
        public final ButtonV3Atom.LargeBorderlessButton getDeselectAllButton() {
            return this.deselectAllButton;
        }

        @NotNull
        public final ButtonV3Atom.LargeBorderlessButton getSelectAllButton() {
            return this.selectAllButton;
        }

        public int hashCode() {
            return this.deselectAllButton.hashCode() + (this.selectAllButton.hashCode() * 31);
        }

        @NotNull
        public String toString() {
            return "SelectionButtons(selectAllButton=" + this.selectAllButton + ", deselectAllButton=" + this.deselectAllButton + ")";
        }
    }

    @j(generateAdapter = true)
    @Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B;\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0014\u0010\u0004\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0005\u0012\u0014\u0010\b\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0005¢\u0006\u0004\b\t\u0010\nJ\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\u0017\u0010\u0011\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0005HÆ\u0003J\u0017\u0010\u0012\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0005HÆ\u0003JC\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u0016\b\u0002\u0010\u0004\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00052\u0016\b\u0002\u0010\b\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0005HÆ\u0001J\u0013\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0017\u001a\u00020\u0018HÖ\u0001J\t\u0010\u0019\u001a\u00020\u0006HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u001f\u0010\u0004\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u001f\u0010\b\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000e¨\u0006\u001a"}, d2 = {"Lru/ozon/app/android/common/filterWidgets/filtervalues/data/models/FilterValuesDTO$WrappedCell;", "", "cell", "Lru/ozon/uni/atoms/data/dsCell/CellDTO;", "trackingInfo", "", "", "Lru/ozon/android/tokenized/model/TokenizedTrackingInfo;", "selectedTrackingInfo", "<init>", "(Lru/ozon/uni/atoms/data/dsCell/CellDTO;Ljava/util/Map;Ljava/util/Map;)V", "getCell", "()Lru/ozon/uni/atoms/data/dsCell/CellDTO;", "getTrackingInfo", "()Ljava/util/Map;", "getSelectedTrackingInfo", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "filter-widgets_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class WrappedCell {

        @NotNull
        private final CellDTO cell;
        private final Map<String, TokenizedTrackingInfo> selectedTrackingInfo;
        private final Map<String, TokenizedTrackingInfo> trackingInfo;

        public WrappedCell(@NotNull CellDTO cell, Map<String, TokenizedTrackingInfo> map, Map<String, TokenizedTrackingInfo> map2) {
            Intrinsics.checkNotNullParameter(cell, "cell");
            this.cell = cell;
            this.trackingInfo = map;
            this.selectedTrackingInfo = map2;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ WrappedCell copy$default(WrappedCell wrappedCell, CellDTO cellDTO, Map map, Map map2, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                cellDTO = wrappedCell.cell;
            }
            if ((i11 & 2) != 0) {
                map = wrappedCell.trackingInfo;
            }
            if ((i11 & 4) != 0) {
                map2 = wrappedCell.selectedTrackingInfo;
            }
            return wrappedCell.copy(cellDTO, map, map2);
        }

        @NotNull
        /* renamed from: component1, reason: from getter */
        public final CellDTO getCell() {
            return this.cell;
        }

        public final Map<String, TokenizedTrackingInfo> component2() {
            return this.trackingInfo;
        }

        public final Map<String, TokenizedTrackingInfo> component3() {
            return this.selectedTrackingInfo;
        }

        @NotNull
        public final WrappedCell copy(@NotNull CellDTO cell, Map<String, TokenizedTrackingInfo> trackingInfo, Map<String, TokenizedTrackingInfo> selectedTrackingInfo) {
            Intrinsics.checkNotNullParameter(cell, "cell");
            return new WrappedCell(cell, trackingInfo, selectedTrackingInfo);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof WrappedCell)) {
                return false;
            }
            WrappedCell wrappedCell = (WrappedCell) other;
            return Intrinsics.d(this.cell, wrappedCell.cell) && Intrinsics.d(this.trackingInfo, wrappedCell.trackingInfo) && Intrinsics.d(this.selectedTrackingInfo, wrappedCell.selectedTrackingInfo);
        }

        @NotNull
        public final CellDTO getCell() {
            return this.cell;
        }

        public final Map<String, TokenizedTrackingInfo> getSelectedTrackingInfo() {
            return this.selectedTrackingInfo;
        }

        public final Map<String, TokenizedTrackingInfo> getTrackingInfo() {
            return this.trackingInfo;
        }

        public int hashCode() {
            int hashCode = this.cell.hashCode() * 31;
            Map<String, TokenizedTrackingInfo> map = this.trackingInfo;
            int hashCode2 = (hashCode + (map == null ? 0 : map.hashCode())) * 31;
            Map<String, TokenizedTrackingInfo> map2 = this.selectedTrackingInfo;
            return hashCode2 + (map2 != null ? map2.hashCode() : 0);
        }

        @NotNull
        public String toString() {
            CellDTO cellDTO = this.cell;
            Map<String, TokenizedTrackingInfo> map = this.trackingInfo;
            Map<String, TokenizedTrackingInfo> map2 = this.selectedTrackingInfo;
            StringBuilder sb2 = new StringBuilder("WrappedCell(cell=");
            sb2.append(cellDTO);
            sb2.append(", trackingInfo=");
            sb2.append(map);
            sb2.append(", selectedTrackingInfo=");
            return P.f(sb2, map2, ")");
        }
    }

    public FilterValuesDTO(@NotNull FilterInfo filter, @NotNull FiltersDTO.NavBar navBar, TextAtom textAtom, SearchBar searchBar, SelectionButtons selectionButtons, @NotNull List<Section> sections, ButtonV3Atom.LargeButton largeButton) {
        Intrinsics.checkNotNullParameter(filter, "filter");
        Intrinsics.checkNotNullParameter(navBar, "navBar");
        Intrinsics.checkNotNullParameter(sections, "sections");
        this.filter = filter;
        this.navBar = navBar;
        this.description = textAtom;
        this.searchBar = searchBar;
        this.selectionButtons = selectionButtons;
        this.sections = sections;
        this.applyButton = largeButton;
    }

    public static /* synthetic */ FilterValuesDTO copy$default(FilterValuesDTO filterValuesDTO, FilterInfo filterInfo, FiltersDTO.NavBar navBar, TextAtom textAtom, SearchBar searchBar, SelectionButtons selectionButtons, List list, ButtonV3Atom.LargeButton largeButton, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            filterInfo = filterValuesDTO.filter;
        }
        if ((i11 & 2) != 0) {
            navBar = filterValuesDTO.navBar;
        }
        if ((i11 & 4) != 0) {
            textAtom = filterValuesDTO.description;
        }
        if ((i11 & 8) != 0) {
            searchBar = filterValuesDTO.searchBar;
        }
        if ((i11 & 16) != 0) {
            selectionButtons = filterValuesDTO.selectionButtons;
        }
        if ((i11 & 32) != 0) {
            list = filterValuesDTO.sections;
        }
        if ((i11 & 64) != 0) {
            largeButton = filterValuesDTO.applyButton;
        }
        List list2 = list;
        ButtonV3Atom.LargeButton largeButton2 = largeButton;
        SelectionButtons selectionButtons2 = selectionButtons;
        TextAtom textAtom2 = textAtom;
        return filterValuesDTO.copy(filterInfo, navBar, textAtom2, searchBar, selectionButtons2, list2, largeButton2);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final FilterInfo getFilter() {
        return this.filter;
    }

    @NotNull
    /* renamed from: component2, reason: from getter */
    public final FiltersDTO.NavBar getNavBar() {
        return this.navBar;
    }

    /* renamed from: component3, reason: from getter */
    public final TextAtom getDescription() {
        return this.description;
    }

    /* renamed from: component4, reason: from getter */
    public final SearchBar getSearchBar() {
        return this.searchBar;
    }

    /* renamed from: component5, reason: from getter */
    public final SelectionButtons getSelectionButtons() {
        return this.selectionButtons;
    }

    @NotNull
    public final List<Section> component6() {
        return this.sections;
    }

    /* renamed from: component7, reason: from getter */
    public final ButtonV3Atom.LargeButton getApplyButton() {
        return this.applyButton;
    }

    @NotNull
    public final FilterValuesDTO copy(@NotNull FilterInfo filter, @NotNull FiltersDTO.NavBar navBar, TextAtom description, SearchBar searchBar, SelectionButtons selectionButtons, @NotNull List<Section> sections, ButtonV3Atom.LargeButton applyButton) {
        Intrinsics.checkNotNullParameter(filter, "filter");
        Intrinsics.checkNotNullParameter(navBar, "navBar");
        Intrinsics.checkNotNullParameter(sections, "sections");
        return new FilterValuesDTO(filter, navBar, description, searchBar, selectionButtons, sections, applyButton);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof FilterValuesDTO)) {
            return false;
        }
        FilterValuesDTO filterValuesDTO = (FilterValuesDTO) other;
        return Intrinsics.d(this.filter, filterValuesDTO.filter) && Intrinsics.d(this.navBar, filterValuesDTO.navBar) && Intrinsics.d(this.description, filterValuesDTO.description) && Intrinsics.d(this.searchBar, filterValuesDTO.searchBar) && Intrinsics.d(this.selectionButtons, filterValuesDTO.selectionButtons) && Intrinsics.d(this.sections, filterValuesDTO.sections) && Intrinsics.d(this.applyButton, filterValuesDTO.applyButton);
    }

    public final ButtonV3Atom.LargeButton getApplyButton() {
        return this.applyButton;
    }

    public final TextAtom getDescription() {
        return this.description;
    }

    @NotNull
    public final FilterInfo getFilter() {
        return this.filter;
    }

    @NotNull
    public final FiltersDTO.NavBar getNavBar() {
        return this.navBar;
    }

    public final SearchBar getSearchBar() {
        return this.searchBar;
    }

    @NotNull
    public final List<Section> getSections() {
        return this.sections;
    }

    public final SelectionButtons getSelectionButtons() {
        return this.selectionButtons;
    }

    public int hashCode() {
        int hashCode = (this.navBar.hashCode() + (this.filter.hashCode() * 31)) * 31;
        TextAtom textAtom = this.description;
        int hashCode2 = (hashCode + (textAtom == null ? 0 : textAtom.hashCode())) * 31;
        SearchBar searchBar = this.searchBar;
        int hashCode3 = (hashCode2 + (searchBar == null ? 0 : searchBar.hashCode())) * 31;
        SelectionButtons selectionButtons = this.selectionButtons;
        int b11 = g.b((hashCode3 + (selectionButtons == null ? 0 : selectionButtons.hashCode())) * 31, 31, this.sections);
        ButtonV3Atom.LargeButton largeButton = this.applyButton;
        return b11 + (largeButton != null ? largeButton.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "FilterValuesDTO(filter=" + this.filter + ", navBar=" + this.navBar + ", description=" + this.description + ", searchBar=" + this.searchBar + ", selectionButtons=" + this.selectionButtons + ", sections=" + this.sections + ", applyButton=" + this.applyButton + ")";
    }

    @j(generateAdapter = true)
    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0014\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B=\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0010\b\u0002\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0006\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\n\u0010\u000bJ\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J\u0011\u0010\u0015\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0006HÆ\u0003J\u0010\u0010\u0016\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0002\u0010\u0011J\u0010\u0010\u0017\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0002\u0010\u0011JL\u0010\u0018\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\u0010\b\u0002\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\bHÆ\u0001¢\u0006\u0002\u0010\u0019J\u0013\u0010\u001a\u001a\u00020\b2\b\u0010\u001b\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001c\u001a\u00020\u001dHÖ\u0001J\t\u0010\u001e\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\rR\u0019\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0015\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\n\n\u0002\u0010\u0012\u001a\u0004\b\u0007\u0010\u0011R\u0015\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\n\n\u0002\u0010\u0012\u001a\u0004\b\t\u0010\u0011¨\u0006\u001f"}, d2 = {"Lru/ozon/app/android/common/filterWidgets/filtervalues/data/models/FilterValuesDTO$FilterInfo;", "", "key", "", "type", "activeValues", "", "isSingle", "", "isInverted", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/Boolean;Ljava/lang/Boolean;)V", "getKey", "()Ljava/lang/String;", "getType", "getActiveValues", "()Ljava/util/List;", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "component1", "component2", "component3", "component4", "component5", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/Boolean;Ljava/lang/Boolean;)Lru/ozon/app/android/common/filterWidgets/filtervalues/data/models/FilterValuesDTO$FilterInfo;", "equals", "other", "hashCode", "", "toString", "filter-widgets_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class FilterInfo {
        private final List<String> activeValues;
        private final Boolean isInverted;
        private final Boolean isSingle;

        @NotNull
        private final String key;

        @NotNull
        private final String type;

        public FilterInfo(@NotNull String key, @NotNull String type, List<String> list, Boolean bool, Boolean bool2) {
            Intrinsics.checkNotNullParameter(key, "key");
            Intrinsics.checkNotNullParameter(type, "type");
            this.key = key;
            this.type = type;
            this.activeValues = list;
            this.isSingle = bool;
            this.isInverted = bool2;
        }

        public static /* synthetic */ FilterInfo copy$default(FilterInfo filterInfo, String str, String str2, List list, Boolean bool, Boolean bool2, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                str = filterInfo.key;
            }
            if ((i11 & 2) != 0) {
                str2 = filterInfo.type;
            }
            if ((i11 & 4) != 0) {
                list = filterInfo.activeValues;
            }
            if ((i11 & 8) != 0) {
                bool = filterInfo.isSingle;
            }
            if ((i11 & 16) != 0) {
                bool2 = filterInfo.isInverted;
            }
            Boolean bool3 = bool2;
            List list2 = list;
            return filterInfo.copy(str, str2, list2, bool, bool3);
        }

        @NotNull
        /* renamed from: component1, reason: from getter */
        public final String getKey() {
            return this.key;
        }

        @NotNull
        /* renamed from: component2, reason: from getter */
        public final String getType() {
            return this.type;
        }

        public final List<String> component3() {
            return this.activeValues;
        }

        /* renamed from: component4, reason: from getter */
        public final Boolean getIsSingle() {
            return this.isSingle;
        }

        /* renamed from: component5, reason: from getter */
        public final Boolean getIsInverted() {
            return this.isInverted;
        }

        @NotNull
        public final FilterInfo copy(@NotNull String key, @NotNull String type, List<String> activeValues, Boolean isSingle, Boolean isInverted) {
            Intrinsics.checkNotNullParameter(key, "key");
            Intrinsics.checkNotNullParameter(type, "type");
            return new FilterInfo(key, type, activeValues, isSingle, isInverted);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof FilterInfo)) {
                return false;
            }
            FilterInfo filterInfo = (FilterInfo) other;
            return Intrinsics.d(this.key, filterInfo.key) && Intrinsics.d(this.type, filterInfo.type) && Intrinsics.d(this.activeValues, filterInfo.activeValues) && Intrinsics.d(this.isSingle, filterInfo.isSingle) && Intrinsics.d(this.isInverted, filterInfo.isInverted);
        }

        public final List<String> getActiveValues() {
            return this.activeValues;
        }

        @NotNull
        public final String getKey() {
            return this.key;
        }

        @NotNull
        public final String getType() {
            return this.type;
        }

        public int hashCode() {
            int a11 = g.a(this.key.hashCode() * 31, 31, this.type);
            List<String> list = this.activeValues;
            int hashCode = (a11 + (list == null ? 0 : list.hashCode())) * 31;
            Boolean bool = this.isSingle;
            int hashCode2 = (hashCode + (bool == null ? 0 : bool.hashCode())) * 31;
            Boolean bool2 = this.isInverted;
            return hashCode2 + (bool2 != null ? bool2.hashCode() : 0);
        }

        public final Boolean isInverted() {
            return this.isInverted;
        }

        public final Boolean isSingle() {
            return this.isSingle;
        }

        @NotNull
        public String toString() {
            String str = this.key;
            String str2 = this.type;
            List<String> list = this.activeValues;
            Boolean bool = this.isSingle;
            Boolean bool2 = this.isInverted;
            StringBuilder d11 = C3660k.d("FilterInfo(key=", str, ", type=", str2, ", activeValues=");
            d11.append(list);
            d11.append(", isSingle=");
            d11.append(bool);
            d11.append(", isInverted=");
            return D3.g.d(d11, bool2, ")");
        }

        public FilterInfo(String str, String str2, List list, Boolean bool, Boolean bool2, int i11, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, str2, (i11 & 4) != 0 ? K.f71697a : list, bool, bool2);
        }
    }
}
