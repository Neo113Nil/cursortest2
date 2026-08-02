package ru.ozon.app.android.orderdetails.di;

import Jb.e;
import Jb.j;
import java.util.Set;
import n20.i;
import ru.ozon.android.composerCommonViewKit.parsing.JsonParser;

/* loaded from: classes6.dex */
public final class CSOrderDetailsWidgets2Module_ProvideComposeWidgetsFactory implements e<Set<i>> {
    public static Set<i> provideComposeWidgets(JsonParser jsonParser) {
        Set<i> provideComposeWidgets = CSOrderDetailsWidgets2Module.INSTANCE.provideComposeWidgets(jsonParser);
        j.d(provideComposeWidgets);
        return provideComposeWidgets;
    }
}
