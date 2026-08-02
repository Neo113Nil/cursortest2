package ru.ozon.app.android.storefront.widgets.financeWidgetV2.di;

import Jb.e;
import Jb.j;
import java.util.Set;
import n20.i;
import ru.ozon.android.composerCommonViewKit.parsing.JsonParser;

/* loaded from: classes7.dex */
public final class FinanceWidgetV2Module_ProvideComposeWidgetsFactory implements e<Set<i>> {
    public static Set<i> provideComposeWidgets(FinanceWidgetV2Module financeWidgetV2Module, JsonParser jsonParser) {
        Set<i> provideComposeWidgets = financeWidgetV2Module.provideComposeWidgets(jsonParser);
        j.d(provideComposeWidgets);
        return provideComposeWidgets;
    }
}
