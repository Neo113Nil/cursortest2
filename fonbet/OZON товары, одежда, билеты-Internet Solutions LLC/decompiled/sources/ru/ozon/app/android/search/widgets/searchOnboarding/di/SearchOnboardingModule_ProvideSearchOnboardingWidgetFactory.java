package ru.ozon.app.android.search.widgets.searchOnboarding.di;

import Jb.e;
import Jb.j;
import ru.ozon.app.android.composer.widgets.v2.Widget2;
import ru.ozon.app.android.search.widgets.searchOnboarding.data.SearchOnboardingConfig;
import ru.ozon.app.android.search.widgets.searchOnboarding.presentation.SearchOnboardingViewMapper;

/* loaded from: classes7.dex */
public final class SearchOnboardingModule_ProvideSearchOnboardingWidgetFactory implements e<Widget2> {
    public static Widget2 provideSearchOnboardingWidget(SearchOnboardingConfig searchOnboardingConfig, SearchOnboardingViewMapper searchOnboardingViewMapper) {
        Widget2 provideSearchOnboardingWidget = SearchOnboardingModule.INSTANCE.provideSearchOnboardingWidget(searchOnboardingConfig, searchOnboardingViewMapper);
        j.d(provideSearchOnboardingWidget);
        return provideSearchOnboardingWidget;
    }
}
