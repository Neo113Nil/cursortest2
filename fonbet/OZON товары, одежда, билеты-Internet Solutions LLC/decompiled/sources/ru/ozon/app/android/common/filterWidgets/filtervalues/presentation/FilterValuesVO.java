package ru.ozon.app.android.common.filterWidgets.filtervalues.presentation;

import Bi.b;
import G.g;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import l20.c;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.common.filterWidgets.filtervalues.data.models.FilterValuesDTO;
import ru.ozon.app.android.common.filterWidgets.filtervalues.presentation.models.FilterValuesCell;
import ru.ozon.uni.atoms.data.button.ButtonV3Atom;
import ru.ozon.uni.atoms.data.texts.TextAtom;

@Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0018\b\u0080\b\u0018\u00002\u00060\u0001j\u0002`\u0002BK\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\r\u0012\u0006\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0015\u001a\u00020\u0014HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0018\u001a\u00020\u0017HÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u001a\u0010\u001c\u001a\u00020\u00102\b\u0010\u001b\u001a\u0004\u0018\u00010\u001aHÖ\u0003¢\u0006\u0004\b\u001c\u0010\u001dR\u001a\u0010\u0004\u001a\u00020\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u001e\u001a\u0004\b\u001f\u0010 R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010!\u001a\u0004\b\"\u0010#R\u0019\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010$\u001a\u0004\b%\u0010&R\u0019\u0010\n\u001a\u0004\u0018\u00010\t8\u0006¢\u0006\f\n\u0004\b\n\u0010'\u001a\u0004\b(\u0010)R\u0019\u0010\f\u001a\u0004\u0018\u00010\u000b8\u0006¢\u0006\f\n\u0004\b\f\u0010*\u001a\u0004\b+\u0010,R\u001d\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\r8\u0006¢\u0006\f\n\u0004\b\u000f\u0010-\u001a\u0004\b.\u0010/R\u0017\u0010\u0011\u001a\u00020\u00108\u0006¢\u0006\f\n\u0004\b\u0011\u00100\u001a\u0004\b\u0011\u00101¨\u00062"}, d2 = {"Lru/ozon/app/android/common/filterWidgets/filtervalues/presentation/FilterValuesVO;", "Ll20/c;", "Lru/ozon/app/android/composer/view/ViewObject;", "", "id", "Lru/ozon/app/android/common/filterWidgets/filtervalues/data/models/FilterValuesDTO$FilterInfo;", "filter", "Lru/ozon/uni/atoms/data/texts/TextAtom;", "description", "Lru/ozon/app/android/common/filterWidgets/filtervalues/data/models/FilterValuesDTO$SearchBar;", "searchBar", "Lru/ozon/uni/atoms/data/button/ButtonV3Atom$LargeButton;", "applyButton", "", "Lru/ozon/app/android/common/filterWidgets/filtervalues/presentation/models/FilterValuesCell;", "models", "", "isSelect", "<init>", "(JLru/ozon/app/android/common/filterWidgets/filtervalues/data/models/FilterValuesDTO$FilterInfo;Lru/ozon/uni/atoms/data/texts/TextAtom;Lru/ozon/app/android/common/filterWidgets/filtervalues/data/models/FilterValuesDTO$SearchBar;Lru/ozon/uni/atoms/data/button/ButtonV3Atom$LargeButton;Ljava/util/List;Z)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "J", "getId", "()J", "Lru/ozon/app/android/common/filterWidgets/filtervalues/data/models/FilterValuesDTO$FilterInfo;", "getFilter", "()Lru/ozon/app/android/common/filterWidgets/filtervalues/data/models/FilterValuesDTO$FilterInfo;", "Lru/ozon/uni/atoms/data/texts/TextAtom;", "getDescription", "()Lru/ozon/uni/atoms/data/texts/TextAtom;", "Lru/ozon/app/android/common/filterWidgets/filtervalues/data/models/FilterValuesDTO$SearchBar;", "getSearchBar", "()Lru/ozon/app/android/common/filterWidgets/filtervalues/data/models/FilterValuesDTO$SearchBar;", "Lru/ozon/uni/atoms/data/button/ButtonV3Atom$LargeButton;", "getApplyButton", "()Lru/ozon/uni/atoms/data/button/ButtonV3Atom$LargeButton;", "Ljava/util/List;", "getModels", "()Ljava/util/List;", "Z", "()Z", "filter-widgets_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final /* data */ class FilterValuesVO implements c {
    private final ButtonV3Atom.LargeButton applyButton;
    private final TextAtom description;

    @NotNull
    private final FilterValuesDTO.FilterInfo filter;
    private final long id;
    private final boolean isSelect;

    @NotNull
    private final List<FilterValuesCell> models;
    private final FilterValuesDTO.SearchBar searchBar;

    /* JADX WARN: Multi-variable type inference failed */
    public FilterValuesVO(long j11, @NotNull FilterValuesDTO.FilterInfo filter, TextAtom textAtom, FilterValuesDTO.SearchBar searchBar, ButtonV3Atom.LargeButton largeButton, @NotNull List<? extends FilterValuesCell> models, boolean z11) {
        Intrinsics.checkNotNullParameter(filter, "filter");
        Intrinsics.checkNotNullParameter(models, "models");
        this.id = j11;
        this.filter = filter;
        this.description = textAtom;
        this.searchBar = searchBar;
        this.applyButton = largeButton;
        this.models = models;
        this.isSelect = z11;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof FilterValuesVO)) {
            return false;
        }
        FilterValuesVO filterValuesVO = (FilterValuesVO) other;
        return this.id == filterValuesVO.id && Intrinsics.d(this.filter, filterValuesVO.filter) && Intrinsics.d(this.description, filterValuesVO.description) && Intrinsics.d(this.searchBar, filterValuesVO.searchBar) && Intrinsics.d(this.applyButton, filterValuesVO.applyButton) && Intrinsics.d(this.models, filterValuesVO.models) && this.isSelect == filterValuesVO.isSelect;
    }

    public final ButtonV3Atom.LargeButton getApplyButton() {
        return this.applyButton;
    }

    @NotNull
    public final FilterValuesDTO.FilterInfo getFilter() {
        return this.filter;
    }

    @Override // l20.c
    public long getId() {
        return this.id;
    }

    @NotNull
    public final List<FilterValuesCell> getModels() {
        return this.models;
    }

    @Override // l20.c
    public Integer getScrollWidgetKey() {
        return null;
    }

    public final FilterValuesDTO.SearchBar getSearchBar() {
        return this.searchBar;
    }

    @Override // l20.c
    public int getViewItemKey() {
        return hashCode();
    }

    public int hashCode() {
        int hashCode = (this.filter.hashCode() + (Long.hashCode(this.id) * 31)) * 31;
        TextAtom textAtom = this.description;
        int hashCode2 = (hashCode + (textAtom == null ? 0 : textAtom.hashCode())) * 31;
        FilterValuesDTO.SearchBar searchBar = this.searchBar;
        int hashCode3 = (hashCode2 + (searchBar == null ? 0 : searchBar.hashCode())) * 31;
        ButtonV3Atom.LargeButton largeButton = this.applyButton;
        return Boolean.hashCode(this.isSelect) + g.b((hashCode3 + (largeButton != null ? largeButton.hashCode() : 0)) * 31, 31, this.models);
    }

    @NotNull
    public String toString() {
        long j11 = this.id;
        FilterValuesDTO.FilterInfo filterInfo = this.filter;
        TextAtom textAtom = this.description;
        FilterValuesDTO.SearchBar searchBar = this.searchBar;
        ButtonV3Atom.LargeButton largeButton = this.applyButton;
        List<FilterValuesCell> list = this.models;
        boolean z11 = this.isSelect;
        StringBuilder sb2 = new StringBuilder("FilterValuesVO(id=");
        sb2.append(j11);
        sb2.append(", filter=");
        sb2.append(filterInfo);
        sb2.append(", description=");
        sb2.append(textAtom);
        sb2.append(", searchBar=");
        sb2.append(searchBar);
        sb2.append(", applyButton=");
        sb2.append(largeButton);
        sb2.append(", models=");
        sb2.append(list);
        return b.f(sb2, ", isSelect=", z11, ")");
    }
}
