package ru.ozon.app.android.network.di.module;

import Jb.e;
import Jb.j;
import android.content.Context;
import ru.ozon.app.android.ads.data.messaging.AdvertisingMessagingInteractor;
import ru.ozon.app.android.network.common.NetworkHeadersDependencies;
import ru.ozon.app.android.storage.railwaymock.RailwayMockStorage;
import ru.ozon.app.android.storage.user.UserStatusStorage;

/* loaded from: classes6.dex */
public final class NetworkDependencyModule_Companion_ProvideCustomHeadersInterceptorDependenciesFactory implements e<NetworkHeadersDependencies> {
    public static NetworkHeadersDependencies provideCustomHeadersInterceptorDependencies(AdvertisingMessagingInteractor advertisingMessagingInteractor, RailwayMockStorage railwayMockStorage, UserStatusStorage userStatusStorage, Context context) {
        NetworkHeadersDependencies provideCustomHeadersInterceptorDependencies = NetworkDependencyModule.INSTANCE.provideCustomHeadersInterceptorDependencies(advertisingMessagingInteractor, railwayMockStorage, userStatusStorage, context);
        j.d(provideCustomHeadersInterceptorDependencies);
        return provideCustomHeadersInterceptorDependencies;
    }
}
