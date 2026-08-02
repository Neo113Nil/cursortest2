package ru.ozon.app.android.search.widgets.searchOnboarding.presentation;

import androidx.lifecycle.w0;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.search.widgets.searchOnboarding.data.SearchOnboardingRepository;

@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u0001B\u0011\b\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\r\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\r\u0010\n\u001a\u00020\t¢\u0006\u0004\b\n\u0010\u000bR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\f¨\u0006\r"}, d2 = {"Lru/ozon/app/android/search/widgets/searchOnboarding/presentation/SearchOnboardingViewModel;", "Landroidx/lifecycle/w0;", "Lru/ozon/app/android/search/widgets/searchOnboarding/data/SearchOnboardingRepository;", "repository", "<init>", "(Lru/ozon/app/android/search/widgets/searchOnboarding/data/SearchOnboardingRepository;)V", "", "wasShowOnboarding", "()Z", "", "closeOnboarding", "()V", "Lru/ozon/app/android/search/widgets/searchOnboarding/data/SearchOnboardingRepository;", "search_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class SearchOnboardingViewModel extends w0 {

    @NotNull
    private final SearchOnboardingRepository repository;

    public SearchOnboardingViewModel(@NotNull SearchOnboardingRepository repository) {
        Intrinsics.checkNotNullParameter(repository, "repository");
        this.repository = repository;
    }

    public final void closeOnboarding() {
        this.repository.saveShowingOnboarding();
    }

    public final boolean wasShowOnboarding() {
        return this.repository.wasShowOnboarding();
    }
}
