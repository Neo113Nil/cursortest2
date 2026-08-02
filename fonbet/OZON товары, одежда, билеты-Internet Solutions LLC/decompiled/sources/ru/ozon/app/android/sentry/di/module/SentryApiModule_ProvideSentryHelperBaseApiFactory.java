package ru.ozon.app.android.sentry.di.module;

import Jb.e;
import Jb.j;
import Ld0.c;
import hg0.InterfaceC6951a;
import ru.ozon.app.android.network.abtool.FeatureChecker;

/* loaded from: classes7.dex */
public final class SentryApiModule_ProvideSentryHelperBaseApiFactory implements e<InterfaceC6951a> {
    public static InterfaceC6951a provideSentryHelperBaseApi(SentryApiModule sentryApiModule, c cVar, FeatureChecker featureChecker) {
        InterfaceC6951a provideSentryHelperBaseApi = sentryApiModule.provideSentryHelperBaseApi(cVar, featureChecker);
        j.d(provideSentryHelperBaseApi);
        return provideSentryHelperBaseApi;
    }
}
