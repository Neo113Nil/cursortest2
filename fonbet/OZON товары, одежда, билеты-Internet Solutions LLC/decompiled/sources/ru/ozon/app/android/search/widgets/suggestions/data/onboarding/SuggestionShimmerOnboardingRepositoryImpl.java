package ru.ozon.app.android.search.widgets.suggestions.data.onboarding;

import android.content.SharedPreferences;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\b\u0001\u0018\u0000 \r2\u00020\u0001:\u0001\rB\u0011\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH\u0016J\u0018\u0010\n\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u0007H\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u000e"}, d2 = {"Lru/ozon/app/android/search/widgets/suggestions/data/onboarding/SuggestionShimmerOnboardingRepositoryImpl;", "Lru/ozon/app/android/search/widgets/suggestions/data/onboarding/SuggestionShimmerOnboardingRepository;", "sharedPreferences", "Landroid/content/SharedPreferences;", "<init>", "(Landroid/content/SharedPreferences;)V", "getShimmerOnboardingInfo", "Lru/ozon/app/android/search/widgets/suggestions/data/onboarding/ShimmerOnboardingInfo;", "key", "", "saveShimmerOnboardingInfo", "", "onboardingInfo", "Companion", "search_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class SuggestionShimmerOnboardingRepositoryImpl implements SuggestionShimmerOnboardingRepository {

    @NotNull
    private final SharedPreferences sharedPreferences;

    @NotNull
    private static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0007"}, d2 = {"Lru/ozon/app/android/search/widgets/suggestions/data/onboarding/SuggestionShimmerOnboardingRepositoryImpl$Companion;", "", "<init>", "()V", "LAST_VIEW_DATE_PREF_KEY", "", "WAS_INTERACTION_PREF_KEY", "search_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    private static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    public SuggestionShimmerOnboardingRepositoryImpl(@NotNull SharedPreferences sharedPreferences) {
        Intrinsics.checkNotNullParameter(sharedPreferences, "sharedPreferences");
        this.sharedPreferences = sharedPreferences;
    }

    @Override // ru.ozon.app.android.search.widgets.suggestions.data.onboarding.SuggestionShimmerOnboardingRepository
    @NotNull
    public ShimmerOnboardingInfo getShimmerOnboardingInfo(@NotNull String key) {
        Intrinsics.checkNotNullParameter(key, "key");
        String string = this.sharedPreferences.getString("shimmer_onboarding_last_view_date", "");
        return new ShimmerOnboardingInfo(string != null ? string : "", this.sharedPreferences.getBoolean("shimmer_onboarding_was_interaction", false));
    }

    @Override // ru.ozon.app.android.search.widgets.suggestions.data.onboarding.SuggestionShimmerOnboardingRepository
    public void saveShimmerOnboardingInfo(@NotNull String key, @NotNull ShimmerOnboardingInfo onboardingInfo) {
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(onboardingInfo, "onboardingInfo");
        SharedPreferences.Editor edit = this.sharedPreferences.edit();
        edit.putString("shimmer_onboarding_last_view_date", onboardingInfo.getLastViewDate());
        edit.putBoolean("shimmer_onboarding_was_interaction", onboardingInfo.getWasInteraction());
        edit.apply();
    }
}
