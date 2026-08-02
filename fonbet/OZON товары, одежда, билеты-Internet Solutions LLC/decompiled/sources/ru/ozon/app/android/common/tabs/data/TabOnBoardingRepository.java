package ru.ozon.app.android.common.tabs.data;

import android.content.SharedPreferences;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.composer.widgets.v2.onboarding.data.OnBoardingDisplayRepository;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\u0018\u0000 \r2\u00020\u0001:\u0001\rB\u0011\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0018\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH\u0016J\u0010\u0010\f\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\tH\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u000e"}, d2 = {"Lru/ozon/app/android/common/tabs/data/TabOnBoardingRepository;", "Lru/ozon/app/android/composer/widgets/v2/onboarding/data/OnBoardingDisplayRepository;", "sharedPreferences", "Landroid/content/SharedPreferences;", "<init>", "(Landroid/content/SharedPreferences;)V", "onShown", "", "widgetKey", "", "isShown", "", "canShow", "Companion", "tabs_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class TabOnBoardingRepository implements OnBoardingDisplayRepository {
    private static boolean isShown;

    @NotNull
    private final SharedPreferences sharedPreferences;

    public TabOnBoardingRepository(@NotNull SharedPreferences sharedPreferences) {
        Intrinsics.checkNotNullParameter(sharedPreferences, "sharedPreferences");
        this.sharedPreferences = sharedPreferences;
    }

    @Override // ru.ozon.app.android.composer.widgets.v2.onboarding.data.OnBoardingDisplayRepository
    public boolean canShow(@NotNull String widgetKey) {
        Intrinsics.checkNotNullParameter(widgetKey, "widgetKey");
        return !isShown && this.sharedPreferences.getInt("tab_on_boarding_is_shown", 0) < 2;
    }

    @Override // ru.ozon.app.android.composer.widgets.v2.onboarding.data.OnBoardingDisplayRepository
    public void onShown(@NotNull String widgetKey, boolean isShown2) {
        Intrinsics.checkNotNullParameter(widgetKey, "widgetKey");
        isShown = isShown2;
        if (isShown2) {
            int i11 = this.sharedPreferences.getInt("tab_on_boarding_is_shown", 0);
            SharedPreferences.Editor edit = this.sharedPreferences.edit();
            edit.putInt("tab_on_boarding_is_shown", i11 + 1);
            edit.apply();
        }
    }
}
