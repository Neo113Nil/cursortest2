package ru.ozon.app.android.network.di.module;

import Jb.e;
import Jb.j;
import android.content.Context;
import qj.C9067a;

/* loaded from: classes6.dex */
public final class NetworkModule_Companion_ProvideNetworkInfoProviderFactory implements e<C9067a> {
    public static C9067a provideNetworkInfoProvider(Context context) {
        C9067a provideNetworkInfoProvider = NetworkModule.INSTANCE.provideNetworkInfoProvider(context);
        j.d(provideNetworkInfoProvider);
        return provideNetworkInfoProvider;
    }
}
