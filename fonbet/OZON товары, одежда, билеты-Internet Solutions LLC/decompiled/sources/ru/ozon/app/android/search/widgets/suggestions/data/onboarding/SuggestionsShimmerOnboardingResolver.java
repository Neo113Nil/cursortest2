package ru.ozon.app.android.search.widgets.suggestions.data.onboarding;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.network.abtool.FeatureChecker;
import ru.ozon.app.android.search.flags.SuggestionWithFilterOnboardingEnabledFlag;

@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\b\u0001\u0018\u0000 \u00102\u00020\u0001:\u0001\u0010B\u0019\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u000e\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bJ\u000e\u0010\f\u001a\u00020\r2\u0006\u0010\n\u001a\u00020\u000bJ\u000e\u0010\u000e\u001a\u00020\r2\u0006\u0010\n\u001a\u00020\u000bJ\b\u0010\u000f\u001a\u00020\u000bH\u0002R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0011"}, d2 = {"Lru/ozon/app/android/search/widgets/suggestions/data/onboarding/SuggestionsShimmerOnboardingResolver;", "", "suggestionShimmerOnboardingRepository", "Lru/ozon/app/android/search/widgets/suggestions/data/onboarding/SuggestionShimmerOnboardingRepository;", "featureChecker", "Lru/ozon/app/android/network/abtool/FeatureChecker;", "<init>", "(Lru/ozon/app/android/search/widgets/suggestions/data/onboarding/SuggestionShimmerOnboardingRepository;Lru/ozon/app/android/network/abtool/FeatureChecker;)V", "needShowShimmerOnboarding", "", "key", "", "onShimmerOnboardingView", "", "onShimmerOnboardingInteraction", "getCurrentDate", "Companion", "search_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class SuggestionsShimmerOnboardingResolver {

    @NotNull
    private final FeatureChecker featureChecker;

    @NotNull
    private final SuggestionShimmerOnboardingRepository suggestionShimmerOnboardingRepository;
    public static final int $stable = 8;

    public SuggestionsShimmerOnboardingResolver(@NotNull SuggestionShimmerOnboardingRepository suggestionShimmerOnboardingRepository, @NotNull FeatureChecker featureChecker) {
        Intrinsics.checkNotNullParameter(suggestionShimmerOnboardingRepository, "suggestionShimmerOnboardingRepository");
        Intrinsics.checkNotNullParameter(featureChecker, "featureChecker");
        this.suggestionShimmerOnboardingRepository = suggestionShimmerOnboardingRepository;
        this.featureChecker = featureChecker;
    }

    private final String getCurrentDate() {
        String format = new SimpleDateFormat("dd.MM.yyyy", Locale.getDefault()).format(new Date());
        Intrinsics.checkNotNullExpressionValue(format, "format(...)");
        return format;
    }

    public final boolean needShowShimmerOnboarding(@NotNull String key) {
        Intrinsics.checkNotNullParameter(key, "key");
        boolean isEnabled = this.featureChecker.isEnabled(SuggestionWithFilterOnboardingEnabledFlag.INSTANCE);
        String currentDate = getCurrentDate();
        ShimmerOnboardingInfo shimmerOnboardingInfo = this.suggestionShimmerOnboardingRepository.getShimmerOnboardingInfo(key);
        return (!isEnabled || shimmerOnboardingInfo.getWasInteraction() || Intrinsics.d(currentDate, shimmerOnboardingInfo.getLastViewDate())) ? false : true;
    }

    public final void onShimmerOnboardingInteraction(@NotNull String key) {
        Intrinsics.checkNotNullParameter(key, "key");
        this.suggestionShimmerOnboardingRepository.saveShimmerOnboardingInfo(key, new ShimmerOnboardingInfo(getCurrentDate(), true));
    }

    public final void onShimmerOnboardingView(@NotNull String key) {
        Intrinsics.checkNotNullParameter(key, "key");
        this.suggestionShimmerOnboardingRepository.saveShimmerOnboardingInfo(key, new ShimmerOnboardingInfo(getCurrentDate(), this.suggestionShimmerOnboardingRepository.getShimmerOnboardingInfo(key).getWasInteraction()));
    }
}
