package ru.ozon.app.android.search.widgets.suggestion.di;

import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.e0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.composer.widgets.v2.ViewMapper2;
import ru.ozon.app.android.composer.widgets.v2.Widget2;
import ru.ozon.app.android.search.widgets.suggestion.data.SuggestionConfig;
import ru.ozon.app.android.search.widgets.suggestion.presentation.SuggestionsViewMapper;
import ru.ozon.app.android.search.widgets.title.core.SuggestionTitleViewMapper;

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bÁ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J&\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fH\u0007¨\u0006\r"}, d2 = {"Lru/ozon/app/android/search/widgets/suggestion/di/SearchSuggestionsModule;", "", "<init>", "()V", "provideSearchSuggestionsWidget", "", "Lru/ozon/app/android/composer/widgets/v2/Widget2;", "searchSuggestionsConfig", "Lru/ozon/app/android/search/widgets/suggestion/data/SuggestionConfig;", "searchSuggestionsViewMapper", "Lru/ozon/app/android/search/widgets/suggestion/presentation/SuggestionsViewMapper;", "searchSuggestionsTitleViewMapper", "Lru/ozon/app/android/search/widgets/title/core/SuggestionTitleViewMapper;", "search_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class SearchSuggestionsModule {

    @NotNull
    public static final SearchSuggestionsModule INSTANCE = new SearchSuggestionsModule();

    private SearchSuggestionsModule() {
    }

    @NotNull
    public final Set<Widget2> provideSearchSuggestionsWidget(@NotNull SuggestionConfig searchSuggestionsConfig, @NotNull SuggestionsViewMapper searchSuggestionsViewMapper, @NotNull SuggestionTitleViewMapper searchSuggestionsTitleViewMapper) {
        Intrinsics.checkNotNullParameter(searchSuggestionsConfig, "searchSuggestionsConfig");
        Intrinsics.checkNotNullParameter(searchSuggestionsViewMapper, "searchSuggestionsViewMapper");
        Intrinsics.checkNotNullParameter(searchSuggestionsTitleViewMapper, "searchSuggestionsTitleViewMapper");
        return e0.h(new Widget2("catalog", "searchSuggestions", searchSuggestionsConfig, new ViewMapper2[]{searchSuggestionsTitleViewMapper, searchSuggestionsViewMapper}));
    }
}
