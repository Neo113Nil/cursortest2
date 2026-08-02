package ru.ozon.app.android.search.widgets.searchOnboarding.data;

import C.C2702w;
import android.content.SharedPreferences;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\b\u0001\u0018\u0000 \n2\u00020\u0001:\u0001\nB\u0011\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\b\u0010\u0006\u001a\u00020\u0007H\u0016J\b\u0010\b\u001a\u00020\tH\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u000b"}, d2 = {"Lru/ozon/app/android/search/widgets/searchOnboarding/data/SearchOnboardingRepositoryImpl;", "Lru/ozon/app/android/search/widgets/searchOnboarding/data/SearchOnboardingRepository;", "sharedPreferences", "Landroid/content/SharedPreferences;", "<init>", "(Landroid/content/SharedPreferences;)V", "wasShowOnboarding", "", "saveShowingOnboarding", "", "Companion", "search_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class SearchOnboardingRepositoryImpl implements SearchOnboardingRepository {

    @NotNull
    private final SharedPreferences sharedPreferences;
    public static final int $stable = 8;

    public SearchOnboardingRepositoryImpl(@NotNull SharedPreferences sharedPreferences) {
        Intrinsics.checkNotNullParameter(sharedPreferences, "sharedPreferences");
        this.sharedPreferences = sharedPreferences;
    }

    @Override // ru.ozon.app.android.search.widgets.searchOnboarding.data.SearchOnboardingRepository
    public void saveShowingOnboarding() {
        C2702w.e(this.sharedPreferences, "SearchOnboardingRepositoryImpl.searchOnboardingKey", true);
    }

    @Override // ru.ozon.app.android.search.widgets.searchOnboarding.data.SearchOnboardingRepository
    public boolean wasShowOnboarding() {
        return this.sharedPreferences.getBoolean("SearchOnboardingRepositoryImpl.searchOnboardingKey", false);
    }
}
