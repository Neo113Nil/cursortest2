package ru.ozon.app.android.travel.feature.entry.pushOnboarding.di;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.navigation.di.NavigationComponentApi;
import ru.ozon.app.android.platform.di.AndroidPlatformComponentApi;
import ru.ozon.app.android.travel.feature.entry.pushOnboarding.presentation.PushOnboardingFragment;

@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\ba\u0018\u00002\u00020\u0001:\u0001\u0006J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&¨\u0006\u0007"}, d2 = {"Lru/ozon/app/android/travel/feature/entry/pushOnboarding/di/PushOnboardingFragmentComponent;", "", "inject", "", "target", "Lru/ozon/app/android/travel/feature/entry/pushOnboarding/presentation/PushOnboardingFragment;", "Factory", "entry_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public interface PushOnboardingFragmentComponent {

    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bg\u0018\u00002\u00020\u0001J \u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH&¨\u0006\n"}, d2 = {"Lru/ozon/app/android/travel/feature/entry/pushOnboarding/di/PushOnboardingFragmentComponent$Factory;", "", "create", "Lru/ozon/app/android/travel/feature/entry/pushOnboarding/di/PushOnboardingFragmentComponent;", "navigationComponentApi", "Lru/ozon/app/android/navigation/di/NavigationComponentApi;", "travelPushOnboardingComponentApi", "Lru/ozon/app/android/travel/feature/entry/pushOnboarding/di/TravelPushOnboardingComponentApi;", "androidPlatformComponentApi", "Lru/ozon/app/android/platform/di/AndroidPlatformComponentApi;", "entry_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public interface Factory {
        @NotNull
        PushOnboardingFragmentComponent create(@NotNull NavigationComponentApi navigationComponentApi, @NotNull TravelPushOnboardingComponentApi travelPushOnboardingComponentApi, @NotNull AndroidPlatformComponentApi androidPlatformComponentApi);
    }

    void inject(@NotNull PushOnboardingFragment target);
}
