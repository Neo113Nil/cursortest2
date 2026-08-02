package ru.ozon.app.android.composer.widgets.v2.onboarding.data;

import android.content.SharedPreferences;
import java.util.Calendar;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.composer.flags.OnboardingBxLimitFlag;
import ru.ozon.app.android.composer.flags.OnboardingSelectLimitFlag;
import ru.ozon.app.android.network.abtool.FeatureService;
import ru.ozon.app.android.network.version.AppVersionService;

@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001:\u0001\bJ\b\u0010\u0002\u001a\u00020\u0003H&J\b\u0010\u0004\u001a\u00020\u0005H&J\u0010\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\u0005H&¨\u0006\t"}, d2 = {"Lru/ozon/app/android/composer/widgets/v2/onboarding/data/OnBoardingDisplayDisableRepository;", "", "disable", "", "canShow", "", "onShown", "isShown", "Default", "composer_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public interface OnBoardingDisplayDisableRepository {

    @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0002\b\u0007\u0018\u0000 \u00132\u00020\u0001:\u0001\u0013B!\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\b\u0010\n\u001a\u00020\u000bH\u0016J\b\u0010\f\u001a\u00020\rH\u0016J\u0010\u0010\u000e\u001a\u00020\u000b2\u0006\u0010\u000f\u001a\u00020\rH\u0016J\b\u0010\u0010\u001a\u00020\rH\u0002J\b\u0010\u0011\u001a\u00020\u0012H\u0002R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0014"}, d2 = {"Lru/ozon/app/android/composer/widgets/v2/onboarding/data/OnBoardingDisplayDisableRepository$Default;", "Lru/ozon/app/android/composer/widgets/v2/onboarding/data/OnBoardingDisplayDisableRepository;", "sharedPreferences", "Landroid/content/SharedPreferences;", "featureService", "Lru/ozon/app/android/network/abtool/FeatureService;", "appVersionService", "Lru/ozon/app/android/network/version/AppVersionService;", "<init>", "(Landroid/content/SharedPreferences;Lru/ozon/app/android/network/abtool/FeatureService;Lru/ozon/app/android/network/version/AppVersionService;)V", "disable", "", "canShow", "", "onShown", "isShown", "canShowByLimit", "getCurrentDay", "", "Companion", "composer_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Default implements OnBoardingDisplayDisableRepository {

        @NotNull
        private final AppVersionService appVersionService;

        @NotNull
        private final FeatureService featureService;

        @NotNull
        private final SharedPreferences sharedPreferences;
        public static final int $stable = 8;

        public Default(@NotNull SharedPreferences sharedPreferences, @NotNull FeatureService featureService, @NotNull AppVersionService appVersionService) {
            Intrinsics.checkNotNullParameter(sharedPreferences, "sharedPreferences");
            Intrinsics.checkNotNullParameter(featureService, "featureService");
            Intrinsics.checkNotNullParameter(appVersionService, "appVersionService");
            this.sharedPreferences = sharedPreferences;
            this.featureService = featureService;
            this.appVersionService = appVersionService;
        }

        private final boolean canShowByLimit() {
            int intKey = AppVersionService.INSTANCE.isSelect(this.appVersionService) ? this.featureService.getIntKey(OnboardingSelectLimitFlag.INSTANCE) : this.featureService.getIntKey(OnboardingBxLimitFlag.INSTANCE);
            if (intKey != -1) {
                return intKey != 0 && (this.sharedPreferences.getInt("LIMIT_ONBOARDING_DAY_NUMBER", 0) != getCurrentDay() || this.sharedPreferences.getInt("SHOW_ONBOARDING_LIMIT", 0) < intKey);
            }
            return true;
        }

        private final int getCurrentDay() {
            return Calendar.getInstance().get(6);
        }

        @Override // ru.ozon.app.android.composer.widgets.v2.onboarding.data.OnBoardingDisplayDisableRepository
        public boolean canShow() {
            return this.sharedPreferences.getBoolean("OnBoardingDisplayDisableRepository.Default.KEY_DISABLE_ONBOARDING", true) && canShowByLimit();
        }

        @Override // ru.ozon.app.android.composer.widgets.v2.onboarding.data.OnBoardingDisplayDisableRepository
        public void disable() {
            this.sharedPreferences.edit().putBoolean("OnBoardingDisplayDisableRepository.Default.KEY_DISABLE_ONBOARDING", false).apply();
        }

        @Override // ru.ozon.app.android.composer.widgets.v2.onboarding.data.OnBoardingDisplayDisableRepository
        public void onShown(boolean isShown) {
            if (isShown) {
                int i11 = this.sharedPreferences.getInt("SHOW_ONBOARDING_LIMIT", 0);
                SharedPreferences.Editor edit = this.sharedPreferences.edit();
                edit.putInt("SHOW_ONBOARDING_LIMIT", i11 + 1);
                edit.putInt("LIMIT_ONBOARDING_DAY_NUMBER", getCurrentDay());
                edit.apply();
            }
        }
    }

    boolean canShow();

    void disable();

    void onShown(boolean isShown);
}
