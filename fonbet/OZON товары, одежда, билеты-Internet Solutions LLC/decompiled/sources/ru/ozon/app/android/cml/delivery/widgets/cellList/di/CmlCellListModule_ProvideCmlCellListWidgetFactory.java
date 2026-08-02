package ru.ozon.app.android.cml.delivery.widgets.cellList.di;

import Jb.e;
import Jb.j;
import ru.ozon.app.android.cml.delivery.widgets.cellList.data.CmlCellListConfig;
import ru.ozon.app.android.cml.delivery.widgets.cellList.presentation.buttons.viewMapper.ButtonsViewMapper;
import ru.ozon.app.android.cml.delivery.widgets.cellList.presentation.cellList.viewMapper.CellListViewMapper;
import ru.ozon.app.android.cml.delivery.widgets.cellList.presentation.header.viewMapper.HeaderViewMapper;
import ru.ozon.app.android.composer.widgets.v2.Widget2;
import ru.ozon.app.android.islandSeparator.core.CommonIslandSeparatorViewMapper2;
import ru.ozon.app.android.separator.core.SeparatorViewMapper;

/* loaded from: classes6.dex */
public final class CmlCellListModule_ProvideCmlCellListWidgetFactory implements e<Widget2> {
    public static Widget2 provideCmlCellListWidget(CmlCellListConfig cmlCellListConfig, HeaderViewMapper headerViewMapper, CellListViewMapper cellListViewMapper, ButtonsViewMapper buttonsViewMapper, CommonIslandSeparatorViewMapper2 commonIslandSeparatorViewMapper2, SeparatorViewMapper separatorViewMapper) {
        Widget2 provideCmlCellListWidget = CmlCellListModule.INSTANCE.provideCmlCellListWidget(cmlCellListConfig, headerViewMapper, cellListViewMapper, buttonsViewMapper, commonIslandSeparatorViewMapper2, separatorViewMapper);
        j.d(provideCmlCellListWidget);
        return provideCmlCellListWidget;
    }
}
