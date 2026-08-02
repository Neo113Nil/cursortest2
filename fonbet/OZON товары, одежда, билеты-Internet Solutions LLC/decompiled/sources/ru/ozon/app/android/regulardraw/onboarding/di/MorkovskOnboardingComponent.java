package ru.ozon.app.android.regulardraw.onboarding.di;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.network.di.NetworkComponentApi;
import ru.ozon.app.android.storage.di.StorageComponentApi;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\ba\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lru/ozon/app/android/regulardraw/onboarding/di/MorkovskOnboardingComponent;", "Lru/ozon/app/android/regulardraw/onboarding/di/MorkovskOnboardingComponentApi;", "Factory", "regulardraw_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public interface MorkovskOnboardingComponent extends MorkovskOnboardingComponentApi {

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bg\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H&¨\u0006\b"}, d2 = {"Lru/ozon/app/android/regulardraw/onboarding/di/MorkovskOnboardingComponent$Factory;", "", "create", "Lru/ozon/app/android/regulardraw/onboarding/di/MorkovskOnboardingComponent;", "storageComponentApi", "Lru/ozon/app/android/storage/di/StorageComponentApi;", "networkComponentApi", "Lru/ozon/app/android/network/di/NetworkComponentApi;", "regulardraw_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public interface Factory {
        @NotNull
        MorkovskOnboardingComponent create(@NotNull StorageComponentApi storageComponentApi, @NotNull NetworkComponentApi networkComponentApi);
    }
}
