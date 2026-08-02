package ru.ozon.app.android.common.filterWidgets.filters.data;

import B0.C2454a;
import Ep.a;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.common.filterWidgets.filters.data.FiltersDTO;
import ru.ozon.app.android.common.filterWidgets.filtervalues.data.models.FilterValuesDTO;
import ru.ozon.uni.core.R$color;

@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0015\b\u0080\b\u0018\u00002\u00020\u0001B9\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\b\u0003\u0010\t\u001a\u00020\b\u0012\n\b\u0003\u0010\n\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0013\u001a\u00020\u00042\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0018\u001a\u0004\b\u0005\u0010\u0019R\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\t\u0010\u001d\u001a\u0004\b\u001e\u0010\u0011R\u0019\u0010\n\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b\n\u0010\u001f\u001a\u0004\b \u0010!¨\u0006\""}, d2 = {"Lru/ozon/app/android/common/filterWidgets/filters/data/FilterNavBarModel;", "", "Lru/ozon/app/android/common/filterWidgets/filters/data/FiltersDTO$NavBar;", "navBar", "", "isInverted", "Lru/ozon/app/android/common/filterWidgets/filtervalues/data/models/FilterValuesDTO$SelectionButtons;", "selectionButtons", "", "backgroundColor", "textColor", "<init>", "(Lru/ozon/app/android/common/filterWidgets/filters/data/FiltersDTO$NavBar;Ljava/lang/Boolean;Lru/ozon/app/android/common/filterWidgets/filtervalues/data/models/FilterValuesDTO$SelectionButtons;ILjava/lang/Integer;)V", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "Lru/ozon/app/android/common/filterWidgets/filters/data/FiltersDTO$NavBar;", "getNavBar", "()Lru/ozon/app/android/common/filterWidgets/filters/data/FiltersDTO$NavBar;", "Ljava/lang/Boolean;", "()Ljava/lang/Boolean;", "Lru/ozon/app/android/common/filterWidgets/filtervalues/data/models/FilterValuesDTO$SelectionButtons;", "getSelectionButtons", "()Lru/ozon/app/android/common/filterWidgets/filtervalues/data/models/FilterValuesDTO$SelectionButtons;", "I", "getBackgroundColor", "Ljava/lang/Integer;", "getTextColor", "()Ljava/lang/Integer;", "filter-widgets_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final /* data */ class FilterNavBarModel {
    private final int backgroundColor;
    private final Boolean isInverted;

    @NotNull
    private final FiltersDTO.NavBar navBar;
    private final FilterValuesDTO.SelectionButtons selectionButtons;
    private final Integer textColor;

    public FilterNavBarModel(@NotNull FiltersDTO.NavBar navBar, Boolean bool, FilterValuesDTO.SelectionButtons selectionButtons, int i11, Integer num) {
        Intrinsics.checkNotNullParameter(navBar, "navBar");
        this.navBar = navBar;
        this.isInverted = bool;
        this.selectionButtons = selectionButtons;
        this.backgroundColor = i11;
        this.textColor = num;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof FilterNavBarModel)) {
            return false;
        }
        FilterNavBarModel filterNavBarModel = (FilterNavBarModel) other;
        return Intrinsics.d(this.navBar, filterNavBarModel.navBar) && Intrinsics.d(this.isInverted, filterNavBarModel.isInverted) && Intrinsics.d(this.selectionButtons, filterNavBarModel.selectionButtons) && this.backgroundColor == filterNavBarModel.backgroundColor && Intrinsics.d(this.textColor, filterNavBarModel.textColor);
    }

    public final int getBackgroundColor() {
        return this.backgroundColor;
    }

    @NotNull
    public final FiltersDTO.NavBar getNavBar() {
        return this.navBar;
    }

    public final FilterValuesDTO.SelectionButtons getSelectionButtons() {
        return this.selectionButtons;
    }

    public final Integer getTextColor() {
        return this.textColor;
    }

    public int hashCode() {
        int hashCode = this.navBar.hashCode() * 31;
        Boolean bool = this.isInverted;
        int hashCode2 = (hashCode + (bool == null ? 0 : bool.hashCode())) * 31;
        FilterValuesDTO.SelectionButtons selectionButtons = this.selectionButtons;
        int a11 = C2454a.a(this.backgroundColor, (hashCode2 + (selectionButtons == null ? 0 : selectionButtons.hashCode())) * 31, 31);
        Integer num = this.textColor;
        return a11 + (num != null ? num.hashCode() : 0);
    }

    /* renamed from: isInverted, reason: from getter */
    public final Boolean getIsInverted() {
        return this.isInverted;
    }

    @NotNull
    public String toString() {
        FiltersDTO.NavBar navBar = this.navBar;
        Boolean bool = this.isInverted;
        FilterValuesDTO.SelectionButtons selectionButtons = this.selectionButtons;
        int i11 = this.backgroundColor;
        Integer num = this.textColor;
        StringBuilder sb2 = new StringBuilder("FilterNavBarModel(navBar=");
        sb2.append(navBar);
        sb2.append(", isInverted=");
        sb2.append(bool);
        sb2.append(", selectionButtons=");
        sb2.append(selectionButtons);
        sb2.append(", backgroundColor=");
        sb2.append(i11);
        sb2.append(", textColor=");
        return a.c(sb2, num, ")");
    }

    public /* synthetic */ FilterNavBarModel(FiltersDTO.NavBar navBar, Boolean bool, FilterValuesDTO.SelectionButtons selectionButtons, int i11, Integer num, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        this(navBar, bool, selectionButtons, (i12 & 8) != 0 ? R$color.layer_floor_1 : i11, (i12 & 16) != 0 ? null : num);
    }
}
