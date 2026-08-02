package ru.ozon.app.android.core.navigation.interceptors.predicate.di;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.injection.IDaggerComponentDependencies;
import ru.ozon.app.android.network.di.NetworkUserDependencies;
import ru.ozon.app.android.storage.di.StorageComponentApi;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bg\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u0003¨\u0006\u0004"}, d2 = {"Lru/ozon/app/android/core/navigation/interceptors/predicate/di/InterceptorPredicatesComponent;", "Lru/ozon/app/android/core/navigation/interceptors/predicate/di/InterceptorPredicatesComponentApi;", "Lru/ozon/app/android/network/di/NetworkUserDependencies;", "Factory", "main_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public interface InterceptorPredicatesComponent extends InterceptorPredicatesComponentApi, NetworkUserDependencies {

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bg\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H&¨\u0006\b"}, d2 = {"Lru/ozon/app/android/core/navigation/interceptors/predicate/di/InterceptorPredicatesComponent$Factory;", "", "create", "Lru/ozon/app/android/core/navigation/interceptors/predicate/di/InterceptorPredicatesComponent;", "daggerComponentDependencies", "Lru/ozon/app/android/injection/IDaggerComponentDependencies;", "storageComponentApi", "Lru/ozon/app/android/storage/di/StorageComponentApi;", "main_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public interface Factory {
        @NotNull
        InterceptorPredicatesComponent create(@NotNull IDaggerComponentDependencies daggerComponentDependencies, @NotNull StorageComponentApi storageComponentApi);
    }
}
