package ru.ozon.app.android.network.di.module;

import Jb.e;
import Jb.j;
import nf.C8590c;

/* loaded from: classes6.dex */
public final class NetworkInterceptorsModule_Companion_ProvideHttpLoggingInterceptorFactory implements e<C8590c> {
    public static C8590c provideHttpLoggingInterceptor() {
        C8590c provideHttpLoggingInterceptor = NetworkInterceptorsModule.INSTANCE.provideHttpLoggingInterceptor();
        j.d(provideHttpLoggingInterceptor);
        return provideHttpLoggingInterceptor;
    }
}
