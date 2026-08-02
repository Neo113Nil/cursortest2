package ru.ozon.app.android.common.roundedcells.di;

import Jb.e;
import Jb.j;
import ru.ozon.app.android.common.roundedcells.core.RoundedCellsConfig;
import ru.ozon.app.android.common.roundedcells.core.RoundedCellsViewMapper;
import ru.ozon.app.android.composer.di.Widget;

/* loaded from: classes6.dex */
public final class RoundedCellsModule_ProvideRoundedCellsModuleWidgetFactory implements e<Widget> {
    public static Widget provideRoundedCellsModuleWidget(RoundedCellsConfig roundedCellsConfig, RoundedCellsViewMapper roundedCellsViewMapper) {
        Widget provideRoundedCellsModuleWidget = RoundedCellsModule.provideRoundedCellsModuleWidget(roundedCellsConfig, roundedCellsViewMapper);
        j.d(provideRoundedCellsModuleWidget);
        return provideRoundedCellsModuleWidget;
    }
}
