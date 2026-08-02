package ru.ozon.app.android.fresh.unsorted.widgets.recShelf.di;

import Jb.e;
import Jb.j;
import ru.ozon.app.android.composer.widgets.v2.Widget2;
import ru.ozon.app.android.fresh.unsorted.widgets.recShelf.data.RecShelfConfig;
import ru.ozon.app.android.fresh.unsorted.widgets.recShelf.presentation.RecShelfViewMapper;

/* loaded from: classes6.dex */
public final class RecShelfWidgetModule_ProvideWidgetFactory implements e<Widget2> {
    public static Widget2 provideWidget(RecShelfWidgetModule recShelfWidgetModule, RecShelfConfig recShelfConfig, RecShelfViewMapper recShelfViewMapper) {
        Widget2 provideWidget = recShelfWidgetModule.provideWidget(recShelfConfig, recShelfViewMapper);
        j.d(provideWidget);
        return provideWidget;
    }
}
