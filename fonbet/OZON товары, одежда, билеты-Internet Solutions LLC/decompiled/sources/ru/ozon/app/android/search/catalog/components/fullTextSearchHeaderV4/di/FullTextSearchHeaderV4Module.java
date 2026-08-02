package ru.ozon.app.android.search.catalog.components.fullTextSearchHeaderV4.di;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.composer.widgets.v2.ViewMapper2;
import ru.ozon.app.android.composer.widgets.v2.Widget2;
import ru.ozon.app.android.search.catalog.components.fullTextSearchHeaderV4.core.FullTextSearchHeaderV4ViewMapper;
import ru.ozon.app.android.search.catalog.components.fullTextSearchHeaderV4.data.FullTextSearchHeaderV4Config;

@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bÁ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0018\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH\u0007¨\u0006\n"}, d2 = {"Lru/ozon/app/android/search/catalog/components/fullTextSearchHeaderV4/di/FullTextSearchHeaderV4Module;", "", "<init>", "()V", "provideWidgets", "Lru/ozon/app/android/composer/widgets/v2/Widget2;", "fulltextSearchResultConfig", "Lru/ozon/app/android/search/catalog/components/fullTextSearchHeaderV4/data/FullTextSearchHeaderV4Config;", "fullTextSearchHeaderViewMapper", "Lru/ozon/app/android/search/catalog/components/fullTextSearchHeaderV4/core/FullTextSearchHeaderV4ViewMapper;", "search_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class FullTextSearchHeaderV4Module {

    @NotNull
    public static final FullTextSearchHeaderV4Module INSTANCE = new FullTextSearchHeaderV4Module();

    private FullTextSearchHeaderV4Module() {
    }

    @NotNull
    public final Widget2 provideWidgets(@NotNull FullTextSearchHeaderV4Config fulltextSearchResultConfig, @NotNull FullTextSearchHeaderV4ViewMapper fullTextSearchHeaderViewMapper) {
        Intrinsics.checkNotNullParameter(fulltextSearchResultConfig, "fulltextSearchResultConfig");
        Intrinsics.checkNotNullParameter(fullTextSearchHeaderViewMapper, "fullTextSearchHeaderViewMapper");
        return new Widget2("catalog", "fulltextResultsHeader", fulltextSearchResultConfig, new ViewMapper2[]{fullTextSearchHeaderViewMapper});
    }
}
