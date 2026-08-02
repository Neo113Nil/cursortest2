package ru.ozon.app.android.search.widgets.searchRequest.di;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.composer.widgets.v2.ViewMapper2;
import ru.ozon.app.android.composer.widgets.v2.Widget2;
import ru.ozon.app.android.search.widgets.searchRequest.data.SearchRequestConfig;
import ru.ozon.app.android.search.widgets.searchRequest.presentation.SearchRequestViewMapper;

@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bÁ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0018\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH\u0007¨\u0006\n"}, d2 = {"Lru/ozon/app/android/search/widgets/searchRequest/di/SearchRequestDiModule;", "", "<init>", "()V", "provideSearchRequestWidget", "Lru/ozon/app/android/composer/widgets/v2/Widget2;", "config", "Lru/ozon/app/android/search/widgets/searchRequest/data/SearchRequestConfig;", "searchRequestViewMapper", "Lru/ozon/app/android/search/widgets/searchRequest/presentation/SearchRequestViewMapper;", "search_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class SearchRequestDiModule {

    @NotNull
    public static final SearchRequestDiModule INSTANCE = new SearchRequestDiModule();

    private SearchRequestDiModule() {
    }

    @NotNull
    public final Widget2 provideSearchRequestWidget(@NotNull SearchRequestConfig config, @NotNull SearchRequestViewMapper searchRequestViewMapper) {
        Intrinsics.checkNotNullParameter(config, "config");
        Intrinsics.checkNotNullParameter(searchRequestViewMapper, "searchRequestViewMapper");
        return new Widget2("catalog", "searchRequest", config, new ViewMapper2[]{searchRequestViewMapper});
    }
}
