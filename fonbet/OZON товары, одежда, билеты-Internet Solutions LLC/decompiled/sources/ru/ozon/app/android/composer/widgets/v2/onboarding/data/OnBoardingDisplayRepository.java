package ru.ozon.app.android.composer.widgets.v2.onboarding.data;

import android.content.SharedPreferences;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001:\u0002\t\nJ\u0018\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H&J\u0010\u0010\b\u001a\u00020\u00072\u0006\u0010\u0004\u001a\u00020\u0005H&¨\u0006\u000b"}, d2 = {"Lru/ozon/app/android/composer/widgets/v2/onboarding/data/OnBoardingDisplayRepository;", "", "onShown", "", "widgetKey", "", "isShown", "", "canShow", "Default", "Empty", "composer_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public interface OnBoardingDisplayRepository {

    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\b\u0007\u0018\u0000 \r2\u00020\u0001:\u0001\rB\u0011\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0018\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH\u0016J\u0010\u0010\f\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\tH\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u000e"}, d2 = {"Lru/ozon/app/android/composer/widgets/v2/onboarding/data/OnBoardingDisplayRepository$Default;", "Lru/ozon/app/android/composer/widgets/v2/onboarding/data/OnBoardingDisplayRepository;", "sharedPreferences", "Landroid/content/SharedPreferences;", "<init>", "(Landroid/content/SharedPreferences;)V", "onShown", "", "widgetKey", "", "isShown", "", "canShow", "Companion", "composer_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Default implements OnBoardingDisplayRepository {

        @NotNull
        private final SharedPreferences sharedPreferences;
        public static final int $stable = 8;

        @NotNull
        private static final Map<String, Boolean> shownOnboardingsMap = new LinkedHashMap();

        public Default(@NotNull SharedPreferences sharedPreferences) {
            Intrinsics.checkNotNullParameter(sharedPreferences, "sharedPreferences");
            this.sharedPreferences = sharedPreferences;
        }

        @Override // ru.ozon.app.android.composer.widgets.v2.onboarding.data.OnBoardingDisplayRepository
        public boolean canShow(@NotNull String widgetKey) {
            Intrinsics.checkNotNullParameter(widgetKey, "widgetKey");
            if (Intrinsics.d(shownOnboardingsMap.get(widgetKey), Boolean.TRUE)) {
                return false;
            }
            SharedPreferences sharedPreferences = this.sharedPreferences;
            StringBuilder sb2 = new StringBuilder();
            sb2.append(widgetKey);
            sb2.append("_BASE_ON_BOARDING_IS_SHOWN_KEY");
            return !sharedPreferences.getBoolean(sb2.toString(), false);
        }

        @Override // ru.ozon.app.android.composer.widgets.v2.onboarding.data.OnBoardingDisplayRepository
        public void onShown(@NotNull String widgetKey, boolean isShown) {
            Intrinsics.checkNotNullParameter(widgetKey, "widgetKey");
            shownOnboardingsMap.put(widgetKey, Boolean.valueOf(isShown));
            SharedPreferences.Editor edit = this.sharedPreferences.edit();
            edit.putBoolean(widgetKey + "_BASE_ON_BOARDING_IS_SHOWN_KEY", isShown);
            edit.apply();
        }
    }

    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0018\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH\u0016J\u0010\u0010\n\u001a\u00020\t2\u0006\u0010\u0006\u001a\u00020\u0007H\u0016¨\u0006\u000b"}, d2 = {"Lru/ozon/app/android/composer/widgets/v2/onboarding/data/OnBoardingDisplayRepository$Empty;", "Lru/ozon/app/android/composer/widgets/v2/onboarding/data/OnBoardingDisplayRepository;", "<init>", "()V", "onShown", "", "widgetKey", "", "isShown", "", "canShow", "composer_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    /* loaded from: classes11.dex */
    public static final class Empty implements OnBoardingDisplayRepository {
        @Override // ru.ozon.app.android.composer.widgets.v2.onboarding.data.OnBoardingDisplayRepository
        public boolean canShow(@NotNull String widgetKey) {
            Intrinsics.checkNotNullParameter(widgetKey, "widgetKey");
            return true;
        }

        @Override // ru.ozon.app.android.composer.widgets.v2.onboarding.data.OnBoardingDisplayRepository
        public void onShown(@NotNull String widgetKey, boolean isShown) {
            Intrinsics.checkNotNullParameter(widgetKey, "widgetKey");
        }
    }

    boolean canShow(@NotNull String widgetKey);

    void onShown(@NotNull String widgetKey, boolean isShown);
}
