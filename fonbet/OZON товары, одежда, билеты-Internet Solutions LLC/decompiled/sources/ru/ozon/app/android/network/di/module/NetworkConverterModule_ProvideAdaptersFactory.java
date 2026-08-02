package ru.ozon.app.android.network.di.module;

import Jb.e;
import Jb.j;
import android.app.Application;
import java.util.Set;

/* loaded from: classes6.dex */
public final class NetworkConverterModule_ProvideAdaptersFactory implements e<Set<Object>> {
    public static Set<Object> provideAdapters(NetworkConverterModule networkConverterModule, Application application) {
        Set<Object> provideAdapters = networkConverterModule.provideAdapters(application);
        j.d(provideAdapters);
        return provideAdapters;
    }
}
