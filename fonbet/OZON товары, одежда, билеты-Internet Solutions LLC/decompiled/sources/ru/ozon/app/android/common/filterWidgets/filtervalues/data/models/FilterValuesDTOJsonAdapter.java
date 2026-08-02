package ru.ozon.app.android.common.filterWidgets.filtervalues.data.models;

import Ak.b;
import Y9.c;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.squareup.moshi.D;
import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.Moshi;
import com.squareup.moshi.n;
import com.squareup.moshi.x;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.M;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.common.filterWidgets.filters.data.FiltersDTO;
import ru.ozon.app.android.common.filterWidgets.filtervalues.data.models.FilterValuesDTO;
import ru.ozon.uni.atoms.data.button.ButtonV3Atom;
import ru.ozon.uni.atoms.data.texts.TextAtom;

@Metadata(d1 = {"\u0000n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\f\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\f\u0010\rJ!\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000f\u001a\u00020\u000e2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u001a\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00170\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u001a\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u001a0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u0019R\u001c\u0010\u001d\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001c0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u0019R\u001c\u0010\u001f\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001e0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010\u0019R\u001c\u0010!\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010 0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010\u0019R \u0010$\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020#0\"0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u0010\u0019R\u001c\u0010&\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010%0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b&\u0010\u0019¨\u0006'"}, d2 = {"Lru/ozon/app/android/common/filterWidgets/filtervalues/data/models/FilterValuesDTOJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lru/ozon/app/android/common/filterWidgets/filtervalues/data/models/FilterValuesDTO;", "Lcom/squareup/moshi/Moshi;", "moshi", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "", "toString", "()Ljava/lang/String;", "Lcom/squareup/moshi/n;", "reader", "fromJson", "(Lcom/squareup/moshi/n;)Lru/ozon/app/android/common/filterWidgets/filtervalues/data/models/FilterValuesDTO;", "Lcom/squareup/moshi/x;", "writer", AppMeasurementSdk.ConditionalUserProperty.VALUE, "", "toJson", "(Lcom/squareup/moshi/x;Lru/ozon/app/android/common/filterWidgets/filtervalues/data/models/FilterValuesDTO;)V", "Lcom/squareup/moshi/n$a;", "options", "Lcom/squareup/moshi/n$a;", "Lru/ozon/app/android/common/filterWidgets/filtervalues/data/models/FilterValuesDTO$FilterInfo;", "filterInfoAdapter", "Lcom/squareup/moshi/JsonAdapter;", "Lru/ozon/app/android/common/filterWidgets/filters/data/FiltersDTO$NavBar;", "navBarAdapter", "Lru/ozon/uni/atoms/data/texts/TextAtom;", "nullableTextAtomAdapter", "Lru/ozon/app/android/common/filterWidgets/filtervalues/data/models/FilterValuesDTO$SearchBar;", "nullableSearchBarAdapter", "Lru/ozon/app/android/common/filterWidgets/filtervalues/data/models/FilterValuesDTO$SelectionButtons;", "nullableSelectionButtonsAdapter", "", "Lru/ozon/app/android/common/filterWidgets/filtervalues/data/models/FilterValuesDTO$Section;", "listOfSectionAdapter", "Lru/ozon/uni/atoms/data/button/ButtonV3Atom$LargeButton;", "nullableLargeButtonAdapter", "filter-widgets_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class FilterValuesDTOJsonAdapter extends JsonAdapter<FilterValuesDTO> {

    @NotNull
    private final JsonAdapter<FilterValuesDTO.FilterInfo> filterInfoAdapter;

    @NotNull
    private final JsonAdapter<List<FilterValuesDTO.Section>> listOfSectionAdapter;

    @NotNull
    private final JsonAdapter<FiltersDTO.NavBar> navBarAdapter;

    @NotNull
    private final JsonAdapter<ButtonV3Atom.LargeButton> nullableLargeButtonAdapter;

    @NotNull
    private final JsonAdapter<FilterValuesDTO.SearchBar> nullableSearchBarAdapter;

    @NotNull
    private final JsonAdapter<FilterValuesDTO.SelectionButtons> nullableSelectionButtonsAdapter;

    @NotNull
    private final JsonAdapter<TextAtom> nullableTextAtomAdapter;

    @NotNull
    private final n.a options;

    public FilterValuesDTOJsonAdapter(@NotNull Moshi moshi) {
        Intrinsics.checkNotNullParameter(moshi, "moshi");
        this.options = n.a.C0918a.a("filter", "navBar", "description", "searchBar", "selectionButtons", "sections", "applyButton");
        M m11 = M.f71699a;
        this.filterInfoAdapter = moshi.f(FilterValuesDTO.FilterInfo.class, m11, "filter");
        this.navBarAdapter = moshi.f(FiltersDTO.NavBar.class, m11, "navBar");
        this.nullableTextAtomAdapter = moshi.f(TextAtom.class, m11, "description");
        this.nullableSearchBarAdapter = moshi.f(FilterValuesDTO.SearchBar.class, m11, "searchBar");
        this.nullableSelectionButtonsAdapter = moshi.f(FilterValuesDTO.SelectionButtons.class, m11, "selectionButtons");
        this.listOfSectionAdapter = moshi.f(D.e(List.class, FilterValuesDTO.Section.class), m11, "sections");
        this.nullableLargeButtonAdapter = moshi.f(ButtonV3Atom.LargeButton.class, m11, "applyButton");
    }

    @NotNull
    public String toString() {
        return b.c(37, "GeneratedJsonAdapter(FilterValuesDTO)", "toString(...)");
    }

    @Override // com.squareup.moshi.JsonAdapter
    @NotNull
    public FilterValuesDTO fromJson(@NotNull n reader) {
        Intrinsics.checkNotNullParameter(reader, "reader");
        reader.beginObject();
        FilterValuesDTO.FilterInfo filterInfo = null;
        FiltersDTO.NavBar navBar = null;
        TextAtom textAtom = null;
        FilterValuesDTO.SearchBar searchBar = null;
        FilterValuesDTO.SelectionButtons selectionButtons = null;
        List<FilterValuesDTO.Section> list = null;
        ButtonV3Atom.LargeButton largeButton = null;
        while (reader.hasNext()) {
            switch (reader.v(this.options)) {
                case -1:
                    reader.y();
                    reader.skipValue();
                    break;
                case 0:
                    filterInfo = this.filterInfoAdapter.fromJson(reader);
                    if (filterInfo == null) {
                        throw c.q("filter", "filter", reader);
                    }
                    break;
                case 1:
                    navBar = this.navBarAdapter.fromJson(reader);
                    if (navBar == null) {
                        throw c.q("navBar", "navBar", reader);
                    }
                    break;
                case 2:
                    textAtom = this.nullableTextAtomAdapter.fromJson(reader);
                    break;
                case 3:
                    searchBar = this.nullableSearchBarAdapter.fromJson(reader);
                    break;
                case 4:
                    selectionButtons = this.nullableSelectionButtonsAdapter.fromJson(reader);
                    break;
                case 5:
                    list = this.listOfSectionAdapter.fromJson(reader);
                    if (list == null) {
                        throw c.q("sections", "sections", reader);
                    }
                    break;
                case 6:
                    largeButton = this.nullableLargeButtonAdapter.fromJson(reader);
                    break;
            }
        }
        reader.endObject();
        if (filterInfo == null) {
            throw c.j("filter", "filter", reader);
        }
        if (navBar == null) {
            throw c.j("navBar", "navBar", reader);
        }
        if (list != null) {
            return new FilterValuesDTO(filterInfo, navBar, textAtom, searchBar, selectionButtons, list, largeButton);
        }
        throw c.j("sections", "sections", reader);
    }

    @Override // com.squareup.moshi.JsonAdapter
    /* renamed from: toJson, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
    public void mo44toJson(@NotNull x writer, FilterValuesDTO value) {
        Intrinsics.checkNotNullParameter(writer, "writer");
        if (value == null) {
            throw new NullPointerException("value was null! Wrap in .nullSafe() to write nullable values.");
        }
        writer.j();
        writer.w("filter");
        this.filterInfoAdapter.mo44toJson(writer, (x) value.getFilter());
        writer.w("navBar");
        this.navBarAdapter.mo44toJson(writer, (x) value.getNavBar());
        writer.w("description");
        this.nullableTextAtomAdapter.mo44toJson(writer, (x) value.getDescription());
        writer.w("searchBar");
        this.nullableSearchBarAdapter.mo44toJson(writer, (x) value.getSearchBar());
        writer.w("selectionButtons");
        this.nullableSelectionButtonsAdapter.mo44toJson(writer, (x) value.getSelectionButtons());
        writer.w("sections");
        this.listOfSectionAdapter.mo44toJson(writer, (x) value.getSections());
        writer.w("applyButton");
        this.nullableLargeButtonAdapter.mo44toJson(writer, (x) value.getApplyButton());
        writer.p();
    }
}
