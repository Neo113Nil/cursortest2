package ru.ozon.app.android.search.catalog.components.fullTextSearchHeaderV3.di;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.composer.widgets.v2.ViewMapper2;
import ru.ozon.app.android.composer.widgets.v2.Widget2;
import ru.ozon.app.android.search.catalog.components.fullTextSearchHeaderV3.core.FullTextSearchHeaderV3ViewMapper;
import ru.ozon.app.android.search.catalog.components.fullTextSearchHeaderV3.data.FullTextSearchHeaderV3Config;

@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bÁ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0018\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH\u0007¨\u0006\n"}, d2 = {"Lru/ozon/app/android/search/catalog/components/fullTextSearchHeaderV3/di/FullTextSearchHeaderV3Module;", "", "<init>", "()V", "provideWidgets", "Lru/ozon/app/android/composer/widgets/v2/Widget2;", "fulltextSearchResultConfig", "Lru/ozon/app/android/search/catalog/components/fullTextSearchHeaderV3/data/FullTextSearchHeaderV3Config;", "fullTextSearchHeaderV3ViewMapper", "Lru/ozon/app/android/search/catalog/components/fullTextSearchHeaderV3/core/FullTextSearchHeaderV3ViewMapper;", "search_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class FullTextSearchHeaderV3Module {

    @NotNull
    public static final FullTextSearchHeaderV3Module INSTANCE = new FullTextSearchHeaderV3Module();

    private FullTextSearchHeaderV3Module() {
    }

    @NotNull
    public final Widget2 provideWidgets(@NotNull FullTextSearchHeaderV3Config fulltextSearchResultConfig, @NotNull FullTextSearchHeaderV3ViewMapper fullTextSearchHeaderV3ViewMapper) {
        Intrinsics.checkNotNullParameter(fulltextSearchResultConfig, "fulltextSearchResultConfig");
        Intrinsics.checkNotNullParameter(fullTextSearchHeaderV3ViewMapper, "fullTextSearchHeaderV3ViewMapper");
        return new Widget2("catalog", "fulltextResultsHeader", fulltextSearchResultConfig, new ViewMapper2[]{fullTextSearchHeaderV3ViewMapper});
    }
}
