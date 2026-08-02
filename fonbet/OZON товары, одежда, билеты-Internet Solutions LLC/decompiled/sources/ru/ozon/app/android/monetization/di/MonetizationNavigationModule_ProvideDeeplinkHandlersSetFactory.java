package ru.ozon.app.android.monetization.di;

import IZ.a;
import Jb.e;
import Jb.j;
import java.util.Set;
import ru.ozon.app.android.storage.teensMode.TeensModeStorage;

/* loaded from: classes6.dex */
public final class MonetizationNavigationModule_ProvideDeeplinkHandlersSetFactory implements e<Set<a>> {
    public static Set<a> provideDeeplinkHandlersSet(TeensModeStorage teensModeStorage) {
        Set<a> provideDeeplinkHandlersSet = MonetizationNavigationModule.INSTANCE.provideDeeplinkHandlersSet(teensModeStorage);
        j.d(provideDeeplinkHandlersSet);
        return provideDeeplinkHandlersSet;
    }
}
