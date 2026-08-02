package ru.ozon.app.android.network.di.module;

import Jb.e;
import Jb.j;
import We.C4876s;

/* loaded from: classes6.dex */
public final class NetworkModule_Companion_ProvideDispatcherFactory implements e<C4876s> {
    public static C4876s provideDispatcher() {
        C4876s provideDispatcher = NetworkModule.INSTANCE.provideDispatcher();
        j.d(provideDispatcher);
        return provideDispatcher;
    }
}
