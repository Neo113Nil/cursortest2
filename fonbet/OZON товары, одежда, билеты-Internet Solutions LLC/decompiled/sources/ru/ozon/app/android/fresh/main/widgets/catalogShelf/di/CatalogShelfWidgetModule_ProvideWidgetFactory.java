package ru.ozon.app.android.fresh.main.widgets.catalogShelf.di;

import Jb.e;
import Jb.j;
import android.content.Context;
import ru.ozon.android.composerCommonViewKit.parsing.JsonParser;
import ru.ozon.app.android.composer.widgets.v2.Widget2;
import ru.ozon.app.android.fresh.main.widgets.catalogShelf.presentation.header.CatalogShelfHeaderViewMapper;
import ru.ozon.app.android.fresh.main.widgets.catalogShelf.presentation.row.CatalogShelfRowViewMapper;
import ru.ozon.app.android.fresh.main.widgets.catalogShelf.presentation.row.optimized.CatalogShelfRowViewMapperNew;

/* loaded from: classes6.dex */
public final class CatalogShelfWidgetModule_ProvideWidgetFactory implements e<Widget2> {
    public static Widget2 provideWidget(CatalogShelfWidgetModule catalogShelfWidgetModule, CatalogShelfHeaderViewMapper catalogShelfHeaderViewMapper, CatalogShelfRowViewMapper catalogShelfRowViewMapper, JsonParser jsonParser, Context context, CatalogShelfRowViewMapperNew catalogShelfRowViewMapperNew) {
        Widget2 provideWidget = catalogShelfWidgetModule.provideWidget(catalogShelfHeaderViewMapper, catalogShelfRowViewMapper, jsonParser, context, catalogShelfRowViewMapperNew);
        j.d(provideWidget);
        return provideWidget;
    }
}
