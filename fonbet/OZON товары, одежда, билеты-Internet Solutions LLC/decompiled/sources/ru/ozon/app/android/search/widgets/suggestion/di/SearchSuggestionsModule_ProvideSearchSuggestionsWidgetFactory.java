package ru.ozon.app.android.search.widgets.suggestion.di;

import Jb.e;
import Jb.j;
import java.util.Set;
import ru.ozon.app.android.composer.widgets.v2.Widget2;
import ru.ozon.app.android.search.widgets.suggestion.data.SuggestionConfig;
import ru.ozon.app.android.search.widgets.suggestion.presentation.SuggestionsViewMapper;
import ru.ozon.app.android.search.widgets.title.core.SuggestionTitleViewMapper;

/* loaded from: classes7.dex */
public final class SearchSuggestionsModule_ProvideSearchSuggestionsWidgetFactory implements e<Set<Widget2>> {
    public static Set<Widget2> provideSearchSuggestionsWidget(SuggestionConfig suggestionConfig, SuggestionsViewMapper suggestionsViewMapper, SuggestionTitleViewMapper suggestionTitleViewMapper) {
        Set<Widget2> provideSearchSuggestionsWidget = SearchSuggestionsModule.INSTANCE.provideSearchSuggestionsWidget(suggestionConfig, suggestionsViewMapper, suggestionTitleViewMapper);
        j.d(provideSearchSuggestionsWidget);
        return provideSearchSuggestionsWidget;
    }
}
