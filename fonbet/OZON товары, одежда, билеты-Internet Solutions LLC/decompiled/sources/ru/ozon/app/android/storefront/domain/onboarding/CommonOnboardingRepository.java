package ru.ozon.app.android.storefront.domain.onboarding;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&J\u0010\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0006H&J\u0018\u0010\u0007\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\nH&¨\u0006\u000b"}, d2 = {"Lru/ozon/app/android/storefront/domain/onboarding/CommonOnboardingRepository;", "", "onStartShowOnboarding", "", "onShownOnboarding", "key", "", "canShowOnboarding", "", "maxShowCount", "", "onboarding_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public interface CommonOnboardingRepository {
    boolean canShowOnboarding(@NotNull String key, int maxShowCount);

    void onShownOnboarding(@NotNull String key);

    void onStartShowOnboarding();
}
