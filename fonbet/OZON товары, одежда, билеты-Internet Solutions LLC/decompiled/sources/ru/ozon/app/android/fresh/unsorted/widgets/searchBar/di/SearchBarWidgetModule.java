package ru.ozon.app.android.fresh.unsorted.widgets.searchBar.di;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.composer.widgets.v2.ViewMapper2;
import ru.ozon.app.android.composer.widgets.v2.Widget2;
import ru.ozon.app.android.fresh.unsorted.widgets.searchBar.data.SearchBarConfig;
import ru.ozon.app.android.fresh.unsorted.widgets.searchBar.presentation.SearchBarViewMapper;

@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0001\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0018\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH\u0007¨\u0006\n"}, d2 = {"Lru/ozon/app/android/fresh/unsorted/widgets/searchBar/di/SearchBarWidgetModule;", "", "<init>", "()V", "provideWidget", "Lru/ozon/app/android/composer/widgets/v2/Widget2;", "searchBarConfig", "Lru/ozon/app/android/fresh/unsorted/widgets/searchBar/data/SearchBarConfig;", "searchBarViewMapper", "Lru/ozon/app/android/fresh/unsorted/widgets/searchBar/presentation/SearchBarViewMapper;", "widgets-unsorted_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class SearchBarWidgetModule {
    @NotNull
    public final Widget2 provideWidget(@NotNull SearchBarConfig searchBarConfig, @NotNull SearchBarViewMapper searchBarViewMapper) {
        Intrinsics.checkNotNullParameter(searchBarConfig, "searchBarConfig");
        Intrinsics.checkNotNullParameter(searchBarViewMapper, "searchBarViewMapper");
        return new Widget2("express", "searchBar", searchBarConfig, new ViewMapper2[]{searchBarViewMapper});
    }
}
