package ru.ozon.app.android.sentry.di;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.limb.Limb2ComponentApi;
import ru.ozon.app.android.network.di.NetworkComponentApi;
import ru.ozon.app.android.storage.di.StorageComponentApi;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\ba\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lru/ozon/app/android/sentry/di/SentryApiComponentImpl;", "Lru/ozon/app/android/sentry/di/SentryApiComponent;", "Factory", "sentry_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public interface SentryApiComponentImpl extends SentryApiComponent {

    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bg\u0018\u00002\u00020\u0001J \u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH&¨\u0006\n"}, d2 = {"Lru/ozon/app/android/sentry/di/SentryApiComponentImpl$Factory;", "", "create", "Lru/ozon/app/android/sentry/di/SentryApiComponentImpl;", "limb2ComponentApi", "Lru/ozon/app/android/limb/Limb2ComponentApi;", "networkComponentApi", "Lru/ozon/app/android/network/di/NetworkComponentApi;", "storageComponentApi", "Lru/ozon/app/android/storage/di/StorageComponentApi;", "sentry_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public interface Factory {
        @NotNull
        SentryApiComponentImpl create(@NotNull Limb2ComponentApi limb2ComponentApi, @NotNull NetworkComponentApi networkComponentApi, @NotNull StorageComponentApi storageComponentApi);
    }
}
