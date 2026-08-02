package ru.ozon.app.android.search.widgets.suggestions.di;

import Jb.e;
import Jb.j;
import ru.ozon.app.android.common.serviceCarousel.core.ServiceCarouselViewMapper;
import ru.ozon.app.android.composer.widgets.v2.Widget2;
import ru.ozon.app.android.islandSeparator.core.CommonIslandSeparatorViewMapper2;
import ru.ozon.app.android.search.widgets.suggestions.core.SuggestionsConfig;
import ru.ozon.app.android.search.widgets.suggestions.ui.prefetch.SuggestionsPrefetchViewMapper;
import ru.ozon.app.android.search.widgets.suggestions.ui.suggestions.badgetitlesubtitle.SuggestionsBadgeTitleSubtitleViewMapper;
import ru.ozon.app.android.search.widgets.suggestions.ui.suggestions.cell.SuggestionsCellViewMapper;
import ru.ozon.app.android.search.widgets.suggestions.ui.suggestions.suggestionWithFilter.SuggestionWithFilterViewMapper;
import ru.ozon.app.android.search.widgets.suggestions.ui.suggestions.titlesubtitle.SuggestionsTitleSubtitleViewMapper;
import ru.ozon.app.android.search.widgets.suggestions.ui.suggestionsList.SuggestionsTitleViewMapper;
import ru.ozon.app.android.separator.core.SeparatorViewMapper;

/* loaded from: classes7.dex */
public final class SuggestionsModule_ProvideSuggestionsFactory implements e<Widget2> {
    public static Widget2 provideSuggestions(SuggestionsConfig suggestionsConfig, SuggestionsTitleViewMapper suggestionsTitleViewMapper, CommonIslandSeparatorViewMapper2 commonIslandSeparatorViewMapper2, SeparatorViewMapper separatorViewMapper, SuggestionsTitleSubtitleViewMapper suggestionsTitleSubtitleViewMapper, SuggestionsBadgeTitleSubtitleViewMapper suggestionsBadgeTitleSubtitleViewMapper, ServiceCarouselViewMapper serviceCarouselViewMapper, SuggestionWithFilterViewMapper suggestionWithFilterViewMapper, SuggestionsPrefetchViewMapper suggestionsPrefetchViewMapper, SuggestionsCellViewMapper suggestionsCellViewMapper) {
        Widget2 provideSuggestions = SuggestionsModule.INSTANCE.provideSuggestions(suggestionsConfig, suggestionsTitleViewMapper, commonIslandSeparatorViewMapper2, separatorViewMapper, suggestionsTitleSubtitleViewMapper, suggestionsBadgeTitleSubtitleViewMapper, serviceCarouselViewMapper, suggestionWithFilterViewMapper, suggestionsPrefetchViewMapper, suggestionsCellViewMapper);
        j.d(provideSuggestions);
        return provideSuggestions;
    }
}
