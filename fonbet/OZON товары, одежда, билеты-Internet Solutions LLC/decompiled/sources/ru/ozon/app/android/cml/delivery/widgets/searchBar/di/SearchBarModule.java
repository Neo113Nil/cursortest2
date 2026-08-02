package ru.ozon.app.android.cml.delivery.widgets.searchBar.di;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.cml.delivery.widgets.searchBar.data.SearchBarConfig;
import ru.ozon.app.android.cml.delivery.widgets.searchBar.presentation.SearchBarViewMapper;
import ru.ozon.app.android.composer.widgets.v2.ViewMapper2;
import ru.ozon.app.android.composer.widgets.v2.Widget2;

@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bÁ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0018\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH\u0007¨\u0006\n"}, d2 = {"Lru/ozon/app/android/cml/delivery/widgets/searchBar/di/SearchBarModule;", "", "<init>", "()V", "provideSearchBarWidget", "Lru/ozon/app/android/composer/widgets/v2/Widget2;", "config", "Lru/ozon/app/android/cml/delivery/widgets/searchBar/data/SearchBarConfig;", "viewMapper", "Lru/ozon/app/android/cml/delivery/widgets/searchBar/presentation/SearchBarViewMapper;", "delivery_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class SearchBarModule {

    @NotNull
    public static final SearchBarModule INSTANCE = new SearchBarModule();

    private SearchBarModule() {
    }

    @NotNull
    public final Widget2 provideSearchBarWidget(@NotNull SearchBarConfig config, @NotNull SearchBarViewMapper viewMapper) {
        Intrinsics.checkNotNullParameter(config, "config");
        Intrinsics.checkNotNullParameter(viewMapper, "viewMapper");
        return new Widget2("cml", "searchBar", config, new ViewMapper2[]{viewMapper});
    }
}
