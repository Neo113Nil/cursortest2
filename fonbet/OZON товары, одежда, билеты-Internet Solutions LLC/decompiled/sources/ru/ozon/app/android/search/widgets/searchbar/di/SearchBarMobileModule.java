package ru.ozon.app.android.search.widgets.searchbar.di;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.composer.widgets.v2.ViewMapper2;
import ru.ozon.app.android.composer.widgets.v2.Widget2;
import ru.ozon.app.android.search.widgets.searchbar.core.ActiveSearchBarViewMapper;
import ru.ozon.app.android.search.widgets.searchbar.core.SearchBarConfig;
import ru.ozon.app.android.search.widgets.searchbar.core.SearchBarViewMapper;

@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bÁ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J \u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH\u0007¨\u0006\f"}, d2 = {"Lru/ozon/app/android/search/widgets/searchbar/di/SearchBarMobileModule;", "", "<init>", "()V", "provideSearchBarMobileWidget", "Lru/ozon/app/android/composer/widgets/v2/Widget2;", "searchBarMobileConfig", "Lru/ozon/app/android/search/widgets/searchbar/core/SearchBarConfig;", "searchBarViewMapper", "Lru/ozon/app/android/search/widgets/searchbar/core/SearchBarViewMapper;", "activeSearchBarViewMapper", "Lru/ozon/app/android/search/widgets/searchbar/core/ActiveSearchBarViewMapper;", "search_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class SearchBarMobileModule {

    @NotNull
    public static final SearchBarMobileModule INSTANCE = new SearchBarMobileModule();

    private SearchBarMobileModule() {
    }

    @NotNull
    public final Widget2 provideSearchBarMobileWidget(@NotNull SearchBarConfig searchBarMobileConfig, @NotNull SearchBarViewMapper searchBarViewMapper, @NotNull ActiveSearchBarViewMapper activeSearchBarViewMapper) {
        Intrinsics.checkNotNullParameter(searchBarMobileConfig, "searchBarMobileConfig");
        Intrinsics.checkNotNullParameter(searchBarViewMapper, "searchBarViewMapper");
        Intrinsics.checkNotNullParameter(activeSearchBarViewMapper, "activeSearchBarViewMapper");
        return new Widget2("catalog", "searchBarMobile", searchBarMobileConfig, new ViewMapper2[]{searchBarViewMapper, activeSearchBarViewMapper});
    }
}
