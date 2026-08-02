package ru.ozon.app.android.returns.creation.di;

import Jb.e;
import Jb.j;
import java.util.Set;
import n20.i;
import ru.ozon.android.composerCommonViewKit.parsing.JsonParser;

/* loaded from: classes7.dex */
public final class ReturnCreationWidgetsModule_ProvideComposeWidgetsFactory implements e<Set<i>> {
    public static Set<i> provideComposeWidgets(ReturnCreationWidgetsModule returnCreationWidgetsModule, JsonParser jsonParser) {
        Set<i> provideComposeWidgets = returnCreationWidgetsModule.provideComposeWidgets(jsonParser);
        j.d(provideComposeWidgets);
        return provideComposeWidgets;
    }
}
