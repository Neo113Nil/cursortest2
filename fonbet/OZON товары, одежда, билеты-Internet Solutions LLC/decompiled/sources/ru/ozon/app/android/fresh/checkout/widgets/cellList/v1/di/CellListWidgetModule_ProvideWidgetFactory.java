package ru.ozon.app.android.fresh.checkout.widgets.cellList.v1.di;

import Jb.e;
import Jb.j;
import ru.ozon.app.android.composer.widgets.v2.Widget2;
import ru.ozon.app.android.fresh.checkout.widgets.cellList.v1.data.CellListConfig;
import ru.ozon.app.android.fresh.checkout.widgets.cellList.v1.presentation.CellListViewMapper;

/* loaded from: classes6.dex */
public final class CellListWidgetModule_ProvideWidgetFactory implements e<Widget2> {
    public static Widget2 provideWidget(CellListWidgetModule cellListWidgetModule, CellListConfig cellListConfig, CellListViewMapper cellListViewMapper) {
        Widget2 provideWidget = cellListWidgetModule.provideWidget(cellListConfig, cellListViewMapper);
        j.d(provideWidget);
        return provideWidget;
    }
}
