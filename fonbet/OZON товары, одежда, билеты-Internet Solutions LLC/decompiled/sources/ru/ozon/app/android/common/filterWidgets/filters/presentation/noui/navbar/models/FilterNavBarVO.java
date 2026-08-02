package ru.ozon.app.android.common.filterWidgets.filters.presentation.noui.navbar.models;

import B0.C2454a;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import l20.c;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.common.filterWidgets.filters.data.FiltersDTO;
import ru.ozon.app.android.common.filterWidgets.filtervalues.presentation.models.SelectionButtons;

@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0011\b\u0080\b\u0018\u00002\u00060\u0001j\u0002`\u0002B7\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\b\u0001\u0010\n\u001a\u00020\t\u0012\n\b\u0001\u0010\u000b\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\f\u0010\rJF\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00052\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00072\b\b\u0003\u0010\n\u001a\u00020\t2\n\b\u0003\u0010\u000b\u001a\u0004\u0018\u00010\tHÆ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u001a\u0010\u0018\u001a\u00020\u00172\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015HÖ\u0003¢\u0006\u0004\b\u0018\u0010\u0019R\u001a\u0010\u0004\u001a\u00020\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u0019\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010 \u001a\u0004\b!\u0010\"R\u0017\u0010\n\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\n\u0010#\u001a\u0004\b$\u0010\u0014R\u0019\u0010\u000b\u001a\u0004\u0018\u00010\t8\u0006¢\u0006\f\n\u0004\b\u000b\u0010%\u001a\u0004\b&\u0010'¨\u0006("}, d2 = {"Lru/ozon/app/android/common/filterWidgets/filters/presentation/noui/navbar/models/FilterNavBarVO;", "Ll20/c;", "Lru/ozon/app/android/composer/view/ViewObject;", "", "id", "Lru/ozon/app/android/common/filterWidgets/filters/data/FiltersDTO$NavBar;", "navBar", "Lru/ozon/app/android/common/filterWidgets/filtervalues/presentation/models/SelectionButtons;", "selectionButtons", "", "backgroundColor", "textColor", "<init>", "(JLru/ozon/app/android/common/filterWidgets/filters/data/FiltersDTO$NavBar;Lru/ozon/app/android/common/filterWidgets/filtervalues/presentation/models/SelectionButtons;ILjava/lang/Integer;)V", "copy", "(JLru/ozon/app/android/common/filterWidgets/filters/data/FiltersDTO$NavBar;Lru/ozon/app/android/common/filterWidgets/filtervalues/presentation/models/SelectionButtons;ILjava/lang/Integer;)Lru/ozon/app/android/common/filterWidgets/filters/presentation/noui/navbar/models/FilterNavBarVO;", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "J", "getId", "()J", "Lru/ozon/app/android/common/filterWidgets/filters/data/FiltersDTO$NavBar;", "getNavBar", "()Lru/ozon/app/android/common/filterWidgets/filters/data/FiltersDTO$NavBar;", "Lru/ozon/app/android/common/filterWidgets/filtervalues/presentation/models/SelectionButtons;", "getSelectionButtons", "()Lru/ozon/app/android/common/filterWidgets/filtervalues/presentation/models/SelectionButtons;", "I", "getBackgroundColor", "Ljava/lang/Integer;", "getTextColor", "()Ljava/lang/Integer;", "filter-widgets_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final /* data */ class FilterNavBarVO implements c {
    private final int backgroundColor;
    private final long id;

    @NotNull
    private final FiltersDTO.NavBar navBar;
    private final SelectionButtons selectionButtons;
    private final Integer textColor;

    public FilterNavBarVO(long j11, @NotNull FiltersDTO.NavBar navBar, SelectionButtons selectionButtons, int i11, Integer num) {
        Intrinsics.checkNotNullParameter(navBar, "navBar");
        this.id = j11;
        this.navBar = navBar;
        this.selectionButtons = selectionButtons;
        this.backgroundColor = i11;
        this.textColor = num;
    }

    public static /* synthetic */ FilterNavBarVO copy$default(FilterNavBarVO filterNavBarVO, long j11, FiltersDTO.NavBar navBar, SelectionButtons selectionButtons, int i11, Integer num, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            j11 = filterNavBarVO.id;
        }
        long j12 = j11;
        if ((i12 & 2) != 0) {
            navBar = filterNavBarVO.navBar;
        }
        FiltersDTO.NavBar navBar2 = navBar;
        if ((i12 & 4) != 0) {
            selectionButtons = filterNavBarVO.selectionButtons;
        }
        SelectionButtons selectionButtons2 = selectionButtons;
        if ((i12 & 8) != 0) {
            i11 = filterNavBarVO.backgroundColor;
        }
        int i13 = i11;
        if ((i12 & 16) != 0) {
            num = filterNavBarVO.textColor;
        }
        return filterNavBarVO.copy(j12, navBar2, selectionButtons2, i13, num);
    }

    @NotNull
    public final FilterNavBarVO copy(long id2, @NotNull FiltersDTO.NavBar navBar, SelectionButtons selectionButtons, int backgroundColor, Integer textColor) {
        Intrinsics.checkNotNullParameter(navBar, "navBar");
        return new FilterNavBarVO(id2, navBar, selectionButtons, backgroundColor, textColor);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof FilterNavBarVO)) {
            return false;
        }
        FilterNavBarVO filterNavBarVO = (FilterNavBarVO) other;
        return this.id == filterNavBarVO.id && Intrinsics.d(this.navBar, filterNavBarVO.navBar) && Intrinsics.d(this.selectionButtons, filterNavBarVO.selectionButtons) && this.backgroundColor == filterNavBarVO.backgroundColor && Intrinsics.d(this.textColor, filterNavBarVO.textColor);
    }

    public final int getBackgroundColor() {
        return this.backgroundColor;
    }

    @Override // l20.c
    public long getId() {
        return this.id;
    }

    @NotNull
    public final FiltersDTO.NavBar getNavBar() {
        return this.navBar;
    }

    @Override // l20.c
    public Integer getScrollWidgetKey() {
        return null;
    }

    public final SelectionButtons getSelectionButtons() {
        return this.selectionButtons;
    }

    public final Integer getTextColor() {
        return this.textColor;
    }

    @Override // l20.c
    public int getViewItemKey() {
        return hashCode();
    }

    public int hashCode() {
        int hashCode = (this.navBar.hashCode() + (Long.hashCode(this.id) * 31)) * 31;
        SelectionButtons selectionButtons = this.selectionButtons;
        int a11 = C2454a.a(this.backgroundColor, (hashCode + (selectionButtons == null ? 0 : selectionButtons.hashCode())) * 31, 31);
        Integer num = this.textColor;
        return a11 + (num != null ? num.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "FilterNavBarVO(id=" + this.id + ", navBar=" + this.navBar + ", selectionButtons=" + this.selectionButtons + ", backgroundColor=" + this.backgroundColor + ", textColor=" + this.textColor + ")";
    }
}
