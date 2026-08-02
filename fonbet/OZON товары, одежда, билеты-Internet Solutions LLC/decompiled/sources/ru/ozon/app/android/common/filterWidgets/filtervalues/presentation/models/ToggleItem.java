package ru.ozon.app.android.common.filterWidgets.filtervalues.presentation.models;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&J\b\u0010\u0004\u001a\u00020\u0003H&J\b\u0010\u0005\u001a\u00020\u0003H&J\b\u0010\u0006\u001a\u00020\u0007H&J\b\u0010\b\u001a\u00020\u0007H&J\b\u0010\t\u001a\u00020\nH&¨\u0006\u000b"}, d2 = {"Lru/ozon/app/android/common/filterWidgets/filtervalues/presentation/models/ToggleItem;", "", "toggleItem", "Lru/ozon/app/android/common/filterWidgets/filtervalues/presentation/models/FilterValuesCell;", "selectItem", "unSelectItem", "getText", "", "getSubtext", "getIsSelected", "", "filter-widgets_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public interface ToggleItem {
    boolean getIsSelected();

    @NotNull
    String getSubtext();

    @NotNull
    String getText();

    @NotNull
    FilterValuesCell selectItem();

    @NotNull
    FilterValuesCell toggleItem();

    @NotNull
    FilterValuesCell unSelectItem();
}
