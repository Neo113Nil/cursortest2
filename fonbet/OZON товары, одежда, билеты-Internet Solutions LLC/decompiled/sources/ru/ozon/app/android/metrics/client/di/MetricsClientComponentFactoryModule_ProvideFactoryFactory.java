package ru.ozon.app.android.metrics.client.di;

import Jb.e;
import Jb.j;
import hi.InterfaceC6958a;
import ii.InterfaceC7081a;

/* loaded from: classes6.dex */
public final class MetricsClientComponentFactoryModule_ProvideFactoryFactory implements e<InterfaceC7081a<? extends InterfaceC6958a>> {
    public static InterfaceC7081a<? extends InterfaceC6958a> provideFactory(MetricsClientComponentFactoryModule metricsClientComponentFactoryModule) {
        InterfaceC7081a<? extends InterfaceC6958a> provideFactory = metricsClientComponentFactoryModule.provideFactory();
        j.d(provideFactory);
        return provideFactory;
    }
}
