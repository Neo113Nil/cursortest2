package ru.ozon.app.android.common.filterWidgets.filters.presentation.noui.navbar;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.common.filterWidgets.filters.data.FilterNavBarModel;
import ru.ozon.app.android.common.filterWidgets.filters.data.FiltersDTO;
import ru.ozon.app.android.common.filterWidgets.filters.presentation.noui.navbar.models.FilterNavBarVO;
import ru.ozon.app.android.common.filterWidgets.filtervalues.data.models.FilterValuesDTO;
import ru.ozon.app.android.common.filterWidgets.filtervalues.presentation.models.SelectionButtons;

@Metadata(d1 = {"\u0000\u001a\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\u001a\f\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u0000\u001a\u0014\u0010\u0000\u001a\u00020\u0003*\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0002¨\u0006\u0007"}, d2 = {"toVO", "Lru/ozon/app/android/common/filterWidgets/filters/presentation/noui/navbar/models/FilterNavBarVO;", "Lru/ozon/app/android/common/filterWidgets/filters/data/FilterNavBarModel;", "Lru/ozon/app/android/common/filterWidgets/filtervalues/presentation/models/SelectionButtons;", "Lru/ozon/app/android/common/filterWidgets/filtervalues/data/models/FilterValuesDTO$SelectionButtons;", "isInverted", "", "filter-widgets_prodGoogleAllVendorsRelease"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class FilterNavBarMapperKt {
    @NotNull
    public static final FilterNavBarVO toVO(@NotNull FilterNavBarModel filterNavBarModel) {
        SelectionButtons selectionButtons;
        Intrinsics.checkNotNullParameter(filterNavBarModel, "<this>");
        long hashCode = filterNavBarModel.hashCode();
        FiltersDTO.NavBar navBar = filterNavBarModel.getNavBar();
        FilterValuesDTO.SelectionButtons selectionButtons2 = filterNavBarModel.getSelectionButtons();
        if (selectionButtons2 != null) {
            Boolean isInverted = filterNavBarModel.getIsInverted();
            selectionButtons = toVO(selectionButtons2, isInverted != null ? isInverted.booleanValue() : false);
        } else {
            selectionButtons = null;
        }
        return new FilterNavBarVO(hashCode, navBar, selectionButtons, filterNavBarModel.getBackgroundColor(), filterNavBarModel.getTextColor());
    }

    private static final SelectionButtons toVO(FilterValuesDTO.SelectionButtons selectionButtons, boolean z11) {
        return new SelectionButtons(z11, selectionButtons.getSelectAllButton(), selectionButtons.getDeselectAllButton());
    }
}
