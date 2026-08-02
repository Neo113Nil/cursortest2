package ru.ozon.app.android.checkoutorderdone.di;

import Jb.e;
import Jb.j;
import java.util.Set;
import n20.i;
import ru.ozon.android.composerCommonViewKit.parsing.JsonParser;

/* loaded from: classes6.dex */
public final class OrderDoneWidgets2Module_ProvideComposeWidgetsFactory implements e<Set<i>> {
    public static Set<i> provideComposeWidgets(OrderDoneWidgets2Module orderDoneWidgets2Module, JsonParser jsonParser) {
        Set<i> provideComposeWidgets = orderDoneWidgets2Module.provideComposeWidgets(jsonParser);
        j.d(provideComposeWidgets);
        return provideComposeWidgets;
    }
}
