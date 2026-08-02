package ru.ozon.app.android.network.di.module;

import Jb.e;
import Jb.j;
import We.C4871m;
import ru.ozon.app.android.network.CustomConnectionPoolProvider;

/* loaded from: classes6.dex */
public final class NetworkModule_Companion_ProvideConnectionPoolFactory implements e<C4871m> {
    public static C4871m provideConnectionPool(CustomConnectionPoolProvider customConnectionPoolProvider) {
        C4871m provideConnectionPool = NetworkModule.INSTANCE.provideConnectionPool(customConnectionPoolProvider);
        j.d(provideConnectionPool);
        return provideConnectionPool;
    }
}
