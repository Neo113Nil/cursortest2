package ru.ozon.app.android.returns.creation.di;

import IZ.a;
import Jb.e;
import Jb.j;
import android.content.Context;
import java.util.Set;

/* loaded from: classes7.dex */
public final class ReturnCreationNavigationModule_ProvideDeeplinkHandlersFactory implements e<Set<a>> {
    public static Set<a> provideDeeplinkHandlers(ReturnCreationNavigationModule returnCreationNavigationModule, Context context) {
        Set<a> provideDeeplinkHandlers = returnCreationNavigationModule.provideDeeplinkHandlers(context);
        j.d(provideDeeplinkHandlers);
        return provideDeeplinkHandlers;
    }
}
