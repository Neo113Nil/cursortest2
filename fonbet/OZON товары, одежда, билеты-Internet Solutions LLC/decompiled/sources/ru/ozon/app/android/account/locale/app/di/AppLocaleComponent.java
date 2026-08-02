package ru.ozon.app.android.account.locale.app.di;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.di.provider.component.ContextComponentDependencies;
import ru.ozon.app.android.network.di.NetworkComponentApi;
import ru.ozon.app.android.network.di.NetworkOzonIdComponentApi;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\ba\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lru/ozon/app/android/account/locale/app/di/AppLocaleComponent;", "Lru/ozon/app/android/account/locale/app/di/AppLocaleComponentApi;", "Factory", "account_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public interface AppLocaleComponent extends AppLocaleComponentApi {

    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bg\u0018\u00002\u00020\u0001J(\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH&¨\u0006\f"}, d2 = {"Lru/ozon/app/android/account/locale/app/di/AppLocaleComponent$Factory;", "", "create", "Lru/ozon/app/android/account/locale/app/di/AppLocaleComponent;", "appLocaleDependenciesApi", "Lru/ozon/app/android/account/locale/app/di/AppLocaleDependenciesApi;", "contextComponentDependencies", "Lru/ozon/app/android/di/provider/component/ContextComponentDependencies;", "networkComponentApi", "Lru/ozon/app/android/network/di/NetworkComponentApi;", "networkOzonIdComponentApi", "Lru/ozon/app/android/network/di/NetworkOzonIdComponentApi;", "account_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public interface Factory {
        @NotNull
        AppLocaleComponent create(@NotNull AppLocaleDependenciesApi appLocaleDependenciesApi, @NotNull ContextComponentDependencies contextComponentDependencies, @NotNull NetworkComponentApi networkComponentApi, @NotNull NetworkOzonIdComponentApi networkOzonIdComponentApi);
    }
}
