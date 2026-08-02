package ru.ozon.app.android.fresh.main.widgets.catalogueTabs.v1.di;

import Jb.e;
import Jb.j;
import android.content.Context;
import com.squareup.moshi.Moshi;
import ru.ozon.android.composerCommonViewKit.parsing.JsonParser;
import ru.ozon.app.android.composer.widgets.v2.Widget2;
import ru.ozon.app.android.fresh.main.widgets.catalogueTabs.v1.viewMapper.CatalogueTabsViewMapper;

/* loaded from: classes6.dex */
public final class CatalogueTabsWidgetModule_ProvideWidgetFactory implements e<Widget2> {
    public static Widget2 provideWidget(CatalogueTabsWidgetModule catalogueTabsWidgetModule, CatalogueTabsViewMapper catalogueTabsViewMapper, JsonParser jsonParser, Context context, Moshi moshi) {
        Widget2 provideWidget = catalogueTabsWidgetModule.provideWidget(catalogueTabsViewMapper, jsonParser, context, moshi);
        j.d(provideWidget);
        return provideWidget;
    }
}
