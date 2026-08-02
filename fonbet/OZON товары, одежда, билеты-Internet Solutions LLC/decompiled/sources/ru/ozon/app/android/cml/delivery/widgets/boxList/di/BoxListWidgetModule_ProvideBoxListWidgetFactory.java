package ru.ozon.app.android.cml.delivery.widgets.boxList.di;

import Jb.e;
import Jb.j;
import ru.ozon.app.android.cml.delivery.widgets.boxList.data.BoxListConfig;
import ru.ozon.app.android.cml.delivery.widgets.boxList.presentation.mapper.BoxListViewMapper;
import ru.ozon.app.android.cml.delivery.widgets.boxList.presentation.mapper.SelectButtonViewMapper;
import ru.ozon.app.android.composer.widgets.v2.Widget2;

/* loaded from: classes6.dex */
public final class BoxListWidgetModule_ProvideBoxListWidgetFactory implements e<Widget2> {
    public static Widget2 provideBoxListWidget(BoxListConfig boxListConfig, BoxListViewMapper boxListViewMapper, SelectButtonViewMapper selectButtonViewMapper) {
        Widget2 provideBoxListWidget = BoxListWidgetModule.INSTANCE.provideBoxListWidget(boxListConfig, boxListViewMapper, selectButtonViewMapper);
        j.d(provideBoxListWidget);
        return provideBoxListWidget;
    }
}
