package ru.ozon.app.android.network.di.module;

import Jb.e;
import Jb.j;
import We.B;
import java.util.List;
import ru.ozon.app.android.network.interceptors.DomainCheckInterceptor;
import ru.ozon.app.android.network.interceptors.LongPollingTimeoutInterceptor;

/* loaded from: classes6.dex */
public final class NetworkInterceptorsModule_Companion_ProvideLeadingHostInterceptorsFactory implements e<List<B>> {
    public static List<B> provideLeadingHostInterceptors(LongPollingTimeoutInterceptor longPollingTimeoutInterceptor, DomainCheckInterceptor domainCheckInterceptor) {
        List<B> provideLeadingHostInterceptors = NetworkInterceptorsModule.INSTANCE.provideLeadingHostInterceptors(longPollingTimeoutInterceptor, domainCheckInterceptor);
        j.d(provideLeadingHostInterceptors);
        return provideLeadingHostInterceptors;
    }
}
