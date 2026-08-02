package ru.ozon.app.android.cart.di;

import Jb.e;
import Jb.j;
import java.util.Set;
import n20.i;
import ru.ozon.android.composerCommonViewKit.parsing.JsonParser;

/* loaded from: classes6.dex */
public final class CartWidget2Module_ProvideComposeWidgetsFactory implements e<Set<i>> {
    public static Set<i> provideComposeWidgets(CartWidget2Module cartWidget2Module, JsonParser jsonParser) {
        Set<i> provideComposeWidgets = cartWidget2Module.provideComposeWidgets(jsonParser);
        j.d(provideComposeWidgets);
        return provideComposeWidgets;
    }
}
