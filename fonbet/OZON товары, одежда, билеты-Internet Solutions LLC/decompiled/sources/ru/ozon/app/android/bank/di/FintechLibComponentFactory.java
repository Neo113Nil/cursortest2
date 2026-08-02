package ru.ozon.app.android.bank.di;

import gi.C6740b;
import hi.InterfaceC6958a;
import ii.InterfaceC7081a;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.account.di.AccountComponentApi;
import ru.ozon.app.android.action.di.ActionComponentApi;
import ru.ozon.app.android.analytics.di.AnalyticsComponentApi;
import ru.ozon.app.android.analytics.screen.storage.di.AnalyticsScreenStorageComponentApi;
import ru.ozon.app.android.bank.di.FintechLibComponent;
import ru.ozon.app.android.bank.domain.FintechLibApi;
import ru.ozon.app.android.di.provider.component.ContextComponentDependencies;
import ru.ozon.app.android.limb.Limb2ComponentApi;
import ru.ozon.app.android.mapcommon.map.di.OzonMapComponentApi;
import ru.ozon.app.android.mapcommon.mapcommon.di.LocationComponentApi;
import ru.ozon.app.android.navigation.di.NavigationComponentApi;
import ru.ozon.app.android.network.di.NetworkComponentApi;
import ru.ozon.app.android.network.di.NetworkOzonIdComponentApi;
import ru.ozon.app.android.platform.di.AndroidPlatformComponentApi;
import ru.ozon.app.android.storage.di.StorageComponentApi;

@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u0012\u0012\u0004\u0012\u00020\u00020\u0001j\b\u0012\u0004\u0012\u00020\u0002`\u0003B\t\b\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\u001b\u0010\t\u001a\u00020\u00022\n\u0010\b\u001a\u00060\u0006j\u0002`\u0007H\u0016¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lru/ozon/app/android/bank/di/FintechLibComponentFactory;", "Lii/a;", "Lru/ozon/app/android/bank/domain/FintechLibApi;", "Lru/ozon/app/android/di/provider/factory/ComponentFactory;", "<init>", "()V", "Lgi/b;", "Lru/ozon/app/android/di/provider/factory/ComponentStorage;", "componentStorage", "create", "(Lgi/b;)Lru/ozon/app/android/bank/domain/FintechLibApi;", "ozonbank_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class FintechLibComponentFactory implements InterfaceC7081a<FintechLibApi> {
    @Override // ii.InterfaceC7081a
    @NotNull
    public FintechLibApi create(@NotNull C6740b componentStorage) {
        Intrinsics.checkNotNullParameter(componentStorage, "componentStorage");
        FintechLibComponent.Builder builder = DaggerFintechLibComponent.builder();
        if (ContextComponentDependencies.class.isAssignableFrom(InterfaceC6958a.class)) {
            throw new IllegalStateException("Requested component ContextComponentDependencies is not DiComponent");
        }
        FintechLibComponent.Builder contextComponentDependencies = builder.contextComponentDependencies((ContextComponentDependencies) componentStorage.b(ContextComponentDependencies.class));
        if (NavigationComponentApi.class.isAssignableFrom(InterfaceC6958a.class)) {
            throw new IllegalStateException("Requested component NavigationComponentApi is not DiComponent");
        }
        FintechLibComponent.Builder navigationComponentApi = contextComponentDependencies.navigationComponentApi((NavigationComponentApi) componentStorage.b(NavigationComponentApi.class));
        if (StorageComponentApi.class.isAssignableFrom(InterfaceC6958a.class)) {
            throw new IllegalStateException("Requested component StorageComponentApi is not DiComponent");
        }
        FintechLibComponent.Builder storageComponentApi = navigationComponentApi.storageComponentApi((StorageComponentApi) componentStorage.b(StorageComponentApi.class));
        if (AndroidPlatformComponentApi.class.isAssignableFrom(InterfaceC6958a.class)) {
            throw new IllegalStateException("Requested component AndroidPlatformComponentApi is not DiComponent");
        }
        FintechLibComponent.Builder androidPlatformComponentApi = storageComponentApi.androidPlatformComponentApi((AndroidPlatformComponentApi) componentStorage.b(AndroidPlatformComponentApi.class));
        if (NetworkComponentApi.class.isAssignableFrom(InterfaceC6958a.class)) {
            throw new IllegalStateException("Requested component NetworkComponentApi is not DiComponent");
        }
        FintechLibComponent.Builder networkComponentApi = androidPlatformComponentApi.networkComponentApi((NetworkComponentApi) componentStorage.b(NetworkComponentApi.class));
        if (AnalyticsComponentApi.class.isAssignableFrom(InterfaceC6958a.class)) {
            throw new IllegalStateException("Requested component AnalyticsComponentApi is not DiComponent");
        }
        FintechLibComponent.Builder analyticsComponentApi = networkComponentApi.analyticsComponentApi((AnalyticsComponentApi) componentStorage.b(AnalyticsComponentApi.class));
        if (AnalyticsScreenStorageComponentApi.class.isAssignableFrom(InterfaceC6958a.class)) {
            throw new IllegalStateException("Requested component AnalyticsScreenStorageComponentApi is not DiComponent");
        }
        FintechLibComponent.Builder analyticsScreenStorageComponentApi = analyticsComponentApi.analyticsScreenStorageComponentApi((AnalyticsScreenStorageComponentApi) componentStorage.b(AnalyticsScreenStorageComponentApi.class));
        if (OzonMapComponentApi.class.isAssignableFrom(InterfaceC6958a.class)) {
            throw new IllegalStateException("Requested component OzonMapComponentApi is not DiComponent");
        }
        FintechLibComponent.Builder ozonMapComponentApi = analyticsScreenStorageComponentApi.ozonMapComponentApi((OzonMapComponentApi) componentStorage.b(OzonMapComponentApi.class));
        if (AccountComponentApi.class.isAssignableFrom(InterfaceC6958a.class)) {
            throw new IllegalStateException("Requested component AccountComponentApi is not DiComponent");
        }
        FintechLibComponent.Builder accountComponentApi = ozonMapComponentApi.accountComponentApi((AccountComponentApi) componentStorage.b(AccountComponentApi.class));
        if (LocationComponentApi.class.isAssignableFrom(InterfaceC6958a.class)) {
            throw new IllegalStateException("Requested component LocationComponentApi is not DiComponent");
        }
        FintechLibComponent.Builder locationComponentApi = accountComponentApi.locationComponentApi((LocationComponentApi) componentStorage.b(LocationComponentApi.class));
        if (ActionComponentApi.class.isAssignableFrom(InterfaceC6958a.class)) {
            throw new IllegalStateException("Requested component ActionComponentApi is not DiComponent");
        }
        FintechLibComponent.Builder actionComponentApi = locationComponentApi.actionComponentApi((ActionComponentApi) componentStorage.b(ActionComponentApi.class));
        if (NetworkOzonIdComponentApi.class.isAssignableFrom(InterfaceC6958a.class)) {
            throw new IllegalStateException("Requested component NetworkOzonIdComponentApi is not DiComponent");
        }
        FintechLibComponent.Builder networkOzonIdComponentApi = actionComponentApi.networkOzonIdComponentApi((NetworkOzonIdComponentApi) componentStorage.b(NetworkOzonIdComponentApi.class));
        if (FintechComponentDependencies.class.isAssignableFrom(InterfaceC6958a.class)) {
            throw new IllegalStateException("Requested component FintechComponentDependencies is not DiComponent");
        }
        FintechLibComponent.Builder fintechComponentDependencies = networkOzonIdComponentApi.fintechComponentDependencies((FintechComponentDependencies) componentStorage.b(FintechComponentDependencies.class));
        if (Limb2ComponentApi.class.isAssignableFrom(InterfaceC6958a.class)) {
            throw new IllegalStateException("Requested component Limb2ComponentApi is not DiComponent");
        }
        return fintechComponentDependencies.limb2ComponentApi((Limb2ComponentApi) componentStorage.b(Limb2ComponentApi.class)).build();
    }
}
