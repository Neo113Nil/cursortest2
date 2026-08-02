package ru.ozon.app.android.update.di.factory;

import Pr.a;
import gi.C6740b;
import hi.InterfaceC6958a;
import ii.InterfaceC7081a;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.analytics.di.AnalyticsComponentApi;
import ru.ozon.app.android.analytics.screen.storage.di.AnalyticsScreenStorageComponentApi;
import ru.ozon.app.android.di.provider.component.ContextComponentDependencies;
import ru.ozon.app.android.navigation.di.NavigationComponentApi;
import ru.ozon.app.android.network.di.NetworkComponentApi;
import ru.ozon.app.android.network.di.NetworkOzonIdComponentApi;
import ru.ozon.app.android.storage.di.StorageComponentApi;
import ru.ozon.app.android.update.di.DaggerInAppUpdateComponent;
import ru.ozon.app.android.update.di.InAppUpdateComponent;
import ru.ozon.app.android.update.di.InAppUpdateComponentApi;
import ru.ozon.app.android.update.di.InAppUpdateComponentDependencies;

@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J+\u0010\n\u001a\u001e\u0012\n\b\u0001\u0012\u00060\u0005j\u0002`\u00060\u0004j\u000e\u0012\n\b\u0001\u0012\u00060\u0005j\u0002`\u0006`\u0007H\u0001¢\u0006\u0004\b\b\u0010\t¨\u0006\u000b"}, d2 = {"Lru/ozon/app/android/update/di/factory/InAppUpdateComponentFactoryModule;", "", "<init>", "()V", "Lii/a;", "Lhi/a;", "Lru/ozon/app/android/di/provider/component/DiComponent;", "Lru/ozon/app/android/di/provider/factory/ComponentFactory;", "provideInAppUpdateComponentFactory$in_app_update_prodGoogleAllVendorsRelease", "()Lii/a;", "provideInAppUpdateComponentFactory", "in-app-update_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class InAppUpdateComponentFactoryModule {
    /* JADX INFO: Access modifiers changed from: private */
    public static final InAppUpdateComponentApi provideInAppUpdateComponentFactory$lambda$0(C6740b it) {
        Intrinsics.checkNotNullParameter(it, "it");
        InAppUpdateComponent.Factory factory = DaggerInAppUpdateComponent.factory();
        if (NetworkComponentApi.class.isAssignableFrom(InterfaceC6958a.class)) {
            throw new IllegalStateException("Requested component NetworkComponentApi is not DiComponent");
        }
        NetworkComponentApi networkComponentApi = (NetworkComponentApi) it.b(NetworkComponentApi.class);
        if (NetworkOzonIdComponentApi.class.isAssignableFrom(InterfaceC6958a.class)) {
            throw new IllegalStateException("Requested component NetworkOzonIdComponentApi is not DiComponent");
        }
        NetworkOzonIdComponentApi networkOzonIdComponentApi = (NetworkOzonIdComponentApi) it.b(NetworkOzonIdComponentApi.class);
        if (NavigationComponentApi.class.isAssignableFrom(InterfaceC6958a.class)) {
            throw new IllegalStateException("Requested component NavigationComponentApi is not DiComponent");
        }
        NavigationComponentApi navigationComponentApi = (NavigationComponentApi) it.b(NavigationComponentApi.class);
        if (ContextComponentDependencies.class.isAssignableFrom(InterfaceC6958a.class)) {
            throw new IllegalStateException("Requested component ContextComponentDependencies is not DiComponent");
        }
        ContextComponentDependencies contextComponentDependencies = (ContextComponentDependencies) it.b(ContextComponentDependencies.class);
        if (StorageComponentApi.class.isAssignableFrom(InterfaceC6958a.class)) {
            throw new IllegalStateException("Requested component StorageComponentApi is not DiComponent");
        }
        StorageComponentApi storageComponentApi = (StorageComponentApi) it.b(StorageComponentApi.class);
        if (AnalyticsComponentApi.class.isAssignableFrom(InterfaceC6958a.class)) {
            throw new IllegalStateException("Requested component AnalyticsComponentApi is not DiComponent");
        }
        AnalyticsComponentApi analyticsComponentApi = (AnalyticsComponentApi) it.b(AnalyticsComponentApi.class);
        if (AnalyticsScreenStorageComponentApi.class.isAssignableFrom(InterfaceC6958a.class)) {
            throw new IllegalStateException("Requested component AnalyticsScreenStorageComponentApi is not DiComponent");
        }
        AnalyticsScreenStorageComponentApi analyticsScreenStorageComponentApi = (AnalyticsScreenStorageComponentApi) it.b(AnalyticsScreenStorageComponentApi.class);
        if (InAppUpdateComponentDependencies.class.isAssignableFrom(InterfaceC6958a.class)) {
            throw new IllegalStateException("Requested component InAppUpdateComponentDependencies is not DiComponent");
        }
        return factory.create(networkComponentApi, networkOzonIdComponentApi, navigationComponentApi, contextComponentDependencies, storageComponentApi, analyticsComponentApi, analyticsScreenStorageComponentApi, (InAppUpdateComponentDependencies) it.b(InAppUpdateComponentDependencies.class));
    }

    @NotNull
    public final InterfaceC7081a<? extends InterfaceC6958a> provideInAppUpdateComponentFactory$in_app_update_prodGoogleAllVendorsRelease() {
        return new a(1);
    }
}
