package ru.ozon.app.android.storefront.domain.onboarding;

import android.content.SharedPreferences;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010%\n\u0002\u0010\u000e\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\b\u0010\n\u001a\u00020\u000bH\u0016J\u0010\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\bH\u0016J\u0018\u0010\u000e\u001a\u00020\t2\u0006\u0010\r\u001a\u00020\b2\u0006\u0010\u000f\u001a\u00020\u0010H\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t0\u0007X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0011"}, d2 = {"Lru/ozon/app/android/storefront/domain/onboarding/CommonOnboardingRepositoryImpl;", "Lru/ozon/app/android/storefront/domain/onboarding/CommonOnboardingRepository;", "sharedPreferences", "Landroid/content/SharedPreferences;", "<init>", "(Landroid/content/SharedPreferences;)V", "isShownMap", "", "", "", "onStartShowOnboarding", "", "onShownOnboarding", "key", "canShowOnboarding", "maxShowCount", "", "onboarding_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class CommonOnboardingRepositoryImpl implements CommonOnboardingRepository {

    @NotNull
    private Map<String, Boolean> isShownMap;

    @NotNull
    private final SharedPreferences sharedPreferences;

    public CommonOnboardingRepositoryImpl(@NotNull SharedPreferences sharedPreferences) {
        Intrinsics.checkNotNullParameter(sharedPreferences, "sharedPreferences");
        this.sharedPreferences = sharedPreferences;
        this.isShownMap = new LinkedHashMap();
    }

    @Override // ru.ozon.app.android.storefront.domain.onboarding.CommonOnboardingRepository
    public boolean canShowOnboarding(@NotNull String key, int maxShowCount) {
        Intrinsics.checkNotNullParameter(key, "key");
        return (CommonOnboardingResolver.INSTANCE.isShowingNow() || Intrinsics.d(this.isShownMap.get(key), Boolean.TRUE) || this.sharedPreferences.getInt(key, 0) >= maxShowCount) ? false : true;
    }

    @Override // ru.ozon.app.android.storefront.domain.onboarding.CommonOnboardingRepository
    public void onShownOnboarding(@NotNull String key) {
        Intrinsics.checkNotNullParameter(key, "key");
        CommonOnboardingResolver.INSTANCE.onStopShow();
        this.isShownMap.put(key, Boolean.TRUE);
        int i11 = this.sharedPreferences.getInt(key, 0);
        SharedPreferences.Editor edit = this.sharedPreferences.edit();
        edit.putInt(key, i11 + 1);
        edit.apply();
    }

    @Override // ru.ozon.app.android.storefront.domain.onboarding.CommonOnboardingRepository
    public void onStartShowOnboarding() {
        CommonOnboardingResolver.INSTANCE.onStartShow();
    }
}
