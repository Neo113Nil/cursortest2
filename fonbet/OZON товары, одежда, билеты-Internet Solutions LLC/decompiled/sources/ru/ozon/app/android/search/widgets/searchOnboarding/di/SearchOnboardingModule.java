package ru.ozon.app.android.search.widgets.searchOnboarding.di;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.composer.widgets.v2.ViewMapper2;
import ru.ozon.app.android.composer.widgets.v2.Widget2;
import ru.ozon.app.android.search.widgets.searchOnboarding.data.SearchOnboardingConfig;
import ru.ozon.app.android.search.widgets.searchOnboarding.presentation.SearchOnboardingViewMapper;

@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bÁ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0018\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH\u0007¨\u0006\n"}, d2 = {"Lru/ozon/app/android/search/widgets/searchOnboarding/di/SearchOnboardingModule;", "", "<init>", "()V", "provideSearchOnboardingWidget", "Lru/ozon/app/android/composer/widgets/v2/Widget2;", "config", "Lru/ozon/app/android/search/widgets/searchOnboarding/data/SearchOnboardingConfig;", "searchOnboardingViewMapper", "Lru/ozon/app/android/search/widgets/searchOnboarding/presentation/SearchOnboardingViewMapper;", "search_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class SearchOnboardingModule {

    @NotNull
    public static final SearchOnboardingModule INSTANCE = new SearchOnboardingModule();

    private SearchOnboardingModule() {
    }

    @NotNull
    public final Widget2 provideSearchOnboardingWidget(@NotNull SearchOnboardingConfig config, @NotNull SearchOnboardingViewMapper searchOnboardingViewMapper) {
        Intrinsics.checkNotNullParameter(config, "config");
        Intrinsics.checkNotNullParameter(searchOnboardingViewMapper, "searchOnboardingViewMapper");
        return new Widget2("catalog", "searchOnboarding", config, new ViewMapper2[]{searchOnboardingViewMapper});
    }
}
