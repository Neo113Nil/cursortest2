package ru.ozon.app.android.network.di.module;

import Jb.e;
import Jb.j;
import We.B;
import java.util.List;
import nf.C8590c;
import ru.ozon.app.android.network.history.NetworkHistoryInterceptor;
import ru.ozon.app.android.network.interceptors.AutoTestTraceIdInterceptor;
import ru.ozon.app.android.network.interceptors.CustomHeadersInterceptor;
import ru.ozon.app.android.network.interceptors.DynamicUrlInterceptor;
import ru.ozon.app.android.network.interceptors.PageViewIdInterceptor;
import ru.ozon.app.android.network.interceptors.PreviousPageInterceptor;

/* loaded from: classes6.dex */
public final class NetworkInterceptorsModule_Companion_ProvideTrailingHostInterceptorsFactory implements e<List<B>> {
    public static List<B> provideTrailingHostInterceptors(AutoTestTraceIdInterceptor autoTestTraceIdInterceptor, NetworkHistoryInterceptor networkHistoryInterceptor, CustomHeadersInterceptor customHeadersInterceptor, PreviousPageInterceptor previousPageInterceptor, PageViewIdInterceptor pageViewIdInterceptor, DynamicUrlInterceptor dynamicUrlInterceptor, C8590c c8590c, B b11, B b12) {
        List<B> provideTrailingHostInterceptors = NetworkInterceptorsModule.INSTANCE.provideTrailingHostInterceptors(autoTestTraceIdInterceptor, networkHistoryInterceptor, customHeadersInterceptor, previousPageInterceptor, pageViewIdInterceptor, dynamicUrlInterceptor, c8590c, b11, b12);
        j.d(provideTrailingHostInterceptors);
        return provideTrailingHostInterceptors;
    }
}
