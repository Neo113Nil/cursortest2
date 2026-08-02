package ru.ozon.app.android.account.locale.app.di.factory;

import gi.C6740b;
import hi.InterfaceC6958a;
import ii.InterfaceC7081a;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.account.locale.app.di.AppLocaleComponent;
import ru.ozon.app.android.account.locale.app.di.AppLocaleComponentApi;
import ru.ozon.app.android.account.locale.app.di.AppLocaleDependenciesApi;
import ru.ozon.app.android.account.locale.app.di.DaggerAppLocaleComponent;
import ru.ozon.app.android.di.provider.component.ContextComponentDependencies;
import ru.ozon.app.android.network.di.NetworkComponentApi;
import ru.ozon.app.android.network.di.NetworkOzonIdComponentApi;

@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u0012\u0012\u0004\u0012\u00020\u00020\u0001j\b\u0012\u0004\u0012\u00020\u0002`\u0003B\t\b\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\u001b\u0010\t\u001a\u00020\u00022\n\u0010\b\u001a\u00060\u0006j\u0002`\u0007H\u0016¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lru/ozon/app/android/account/locale/app/di/factory/AppLocaleComponentFactory;", "Lii/a;", "Lru/ozon/app/android/account/locale/app/di/AppLocaleComponentApi;", "Lru/ozon/app/android/di/provider/factory/ComponentFactory;", "<init>", "()V", "Lgi/b;", "Lru/ozon/app/android/di/provider/factory/ComponentStorage;", "componentStorage", "create", "(Lgi/b;)Lru/ozon/app/android/account/locale/app/di/AppLocaleComponentApi;", "account_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class AppLocaleComponentFactory implements InterfaceC7081a<AppLocaleComponentApi> {
    @Override // ii.InterfaceC7081a
    @NotNull
    public AppLocaleComponentApi create(@NotNull C6740b componentStorage) {
        Intrinsics.checkNotNullParameter(componentStorage, "componentStorage");
        AppLocaleComponent.Factory factory = DaggerAppLocaleComponent.factory();
        if (AppLocaleDependenciesApi.class.isAssignableFrom(InterfaceC6958a.class)) {
            throw new IllegalStateException("Requested component AppLocaleDependenciesApi is not DiComponent");
        }
        AppLocaleDependenciesApi appLocaleDependenciesApi = (AppLocaleDependenciesApi) componentStorage.b(AppLocaleDependenciesApi.class);
        if (ContextComponentDependencies.class.isAssignableFrom(InterfaceC6958a.class)) {
            throw new IllegalStateException("Requested component ContextComponentDependencies is not DiComponent");
        }
        ContextComponentDependencies contextComponentDependencies = (ContextComponentDependencies) componentStorage.b(ContextComponentDependencies.class);
        if (NetworkComponentApi.class.isAssignableFrom(InterfaceC6958a.class)) {
            throw new IllegalStateException("Requested component NetworkComponentApi is not DiComponent");
        }
        NetworkComponentApi networkComponentApi = (NetworkComponentApi) componentStorage.b(NetworkComponentApi.class);
        if (NetworkOzonIdComponentApi.class.isAssignableFrom(InterfaceC6958a.class)) {
            throw new IllegalStateException("Requested component NetworkOzonIdComponentApi is not DiComponent");
        }
        return factory.create(appLocaleDependenciesApi, contextComponentDependencies, networkComponentApi, (NetworkOzonIdComponentApi) componentStorage.b(NetworkOzonIdComponentApi.class));
    }
}
