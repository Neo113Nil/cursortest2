package ru.ozon.app.android.network.di.module;

import Jb.e;
import Jb.j;
import android.content.Context;
import ru.ozon.app.android.network.whitelist.domain.DomainsInteractor;

/* loaded from: classes6.dex */
public final class NetworkModule_Companion_ProvideDomainsInteractorFactory implements e<DomainsInteractor> {
    public static DomainsInteractor provideDomainsInteractor(Context context) {
        DomainsInteractor provideDomainsInteractor = NetworkModule.INSTANCE.provideDomainsInteractor(context);
        j.d(provideDomainsInteractor);
        return provideDomainsInteractor;
    }
}
