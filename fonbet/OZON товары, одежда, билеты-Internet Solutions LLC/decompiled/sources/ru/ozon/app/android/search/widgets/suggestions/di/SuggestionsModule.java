package ru.ozon.app.android.search.widgets.suggestions.di;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.common.serviceCarousel.core.ServiceCarouselViewMapper;
import ru.ozon.app.android.composer.widgets.v2.ViewMapper2;
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

@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bÁ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003JX\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u0019H\u0007¨\u0006\u001a"}, d2 = {"Lru/ozon/app/android/search/widgets/suggestions/di/SuggestionsModule;", "", "<init>", "()V", "provideSuggestions", "Lru/ozon/app/android/composer/widgets/v2/Widget2;", "suggestionsConfig", "Lru/ozon/app/android/search/widgets/suggestions/core/SuggestionsConfig;", "suggestionsListViewMapper", "Lru/ozon/app/android/search/widgets/suggestions/ui/suggestionsList/SuggestionsTitleViewMapper;", "commonIslandSeparatorViewMapper", "Lru/ozon/app/android/islandSeparator/core/CommonIslandSeparatorViewMapper2;", "separatorViewMapper", "Lru/ozon/app/android/separator/core/SeparatorViewMapper;", "suggestionsTitleSubtitleViewMapper", "Lru/ozon/app/android/search/widgets/suggestions/ui/suggestions/titlesubtitle/SuggestionsTitleSubtitleViewMapper;", "suggestionsBadgeTitleSubtitleViewMapper", "Lru/ozon/app/android/search/widgets/suggestions/ui/suggestions/badgetitlesubtitle/SuggestionsBadgeTitleSubtitleViewMapper;", "serviceCarouselViewMapper", "Lru/ozon/app/android/common/serviceCarousel/core/ServiceCarouselViewMapper;", "suggestionWithFilterViewMapper", "Lru/ozon/app/android/search/widgets/suggestions/ui/suggestions/suggestionWithFilter/SuggestionWithFilterViewMapper;", "suggestionsPrefetchViewMapper", "Lru/ozon/app/android/search/widgets/suggestions/ui/prefetch/SuggestionsPrefetchViewMapper;", "suggestionsCellViewMapper", "Lru/ozon/app/android/search/widgets/suggestions/ui/suggestions/cell/SuggestionsCellViewMapper;", "search_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class SuggestionsModule {

    @NotNull
    public static final SuggestionsModule INSTANCE = new SuggestionsModule();

    private SuggestionsModule() {
    }

    @NotNull
    public final Widget2 provideSuggestions(@NotNull SuggestionsConfig suggestionsConfig, @NotNull SuggestionsTitleViewMapper suggestionsListViewMapper, @NotNull CommonIslandSeparatorViewMapper2 commonIslandSeparatorViewMapper, @NotNull SeparatorViewMapper separatorViewMapper, @NotNull SuggestionsTitleSubtitleViewMapper suggestionsTitleSubtitleViewMapper, @NotNull SuggestionsBadgeTitleSubtitleViewMapper suggestionsBadgeTitleSubtitleViewMapper, @NotNull ServiceCarouselViewMapper serviceCarouselViewMapper, @NotNull SuggestionWithFilterViewMapper suggestionWithFilterViewMapper, @NotNull SuggestionsPrefetchViewMapper suggestionsPrefetchViewMapper, @NotNull SuggestionsCellViewMapper suggestionsCellViewMapper) {
        Intrinsics.checkNotNullParameter(suggestionsConfig, "suggestionsConfig");
        Intrinsics.checkNotNullParameter(suggestionsListViewMapper, "suggestionsListViewMapper");
        Intrinsics.checkNotNullParameter(commonIslandSeparatorViewMapper, "commonIslandSeparatorViewMapper");
        Intrinsics.checkNotNullParameter(separatorViewMapper, "separatorViewMapper");
        Intrinsics.checkNotNullParameter(suggestionsTitleSubtitleViewMapper, "suggestionsTitleSubtitleViewMapper");
        Intrinsics.checkNotNullParameter(suggestionsBadgeTitleSubtitleViewMapper, "suggestionsBadgeTitleSubtitleViewMapper");
        Intrinsics.checkNotNullParameter(serviceCarouselViewMapper, "serviceCarouselViewMapper");
        Intrinsics.checkNotNullParameter(suggestionWithFilterViewMapper, "suggestionWithFilterViewMapper");
        Intrinsics.checkNotNullParameter(suggestionsPrefetchViewMapper, "suggestionsPrefetchViewMapper");
        Intrinsics.checkNotNullParameter(suggestionsCellViewMapper, "suggestionsCellViewMapper");
        return new Widget2("search", "suggestions", suggestionsConfig, new ViewMapper2[]{suggestionsListViewMapper, commonIslandSeparatorViewMapper, separatorViewMapper, serviceCarouselViewMapper, suggestionsPrefetchViewMapper, suggestionsTitleSubtitleViewMapper, suggestionsBadgeTitleSubtitleViewMapper, suggestionWithFilterViewMapper, suggestionsCellViewMapper});
    }
}
