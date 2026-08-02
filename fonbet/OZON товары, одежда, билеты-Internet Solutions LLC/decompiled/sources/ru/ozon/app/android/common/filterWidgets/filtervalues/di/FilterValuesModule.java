package ru.ozon.app.android.common.filterWidgets.filtervalues.di;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.common.filterWidgets.filters.presentation.noui.navbar.FilterNavBarViewMapper;
import ru.ozon.app.android.common.filterWidgets.filtervalues.data.FilterValuesConfig;
import ru.ozon.app.android.common.filterWidgets.filtervalues.presentation.FilterValuesNoUiViewMapper;
import ru.ozon.app.android.composer.widgets.v2.ViewMapper2;
import ru.ozon.app.android.composer.widgets.v2.Widget2;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J%\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH\u0001¢\u0006\u0002\b\f¨\u0006\r"}, d2 = {"Lru/ozon/app/android/common/filterWidgets/filtervalues/di/FilterValuesModule;", "", "<init>", "()V", "provideFiltersWidget", "Lru/ozon/app/android/composer/widgets/v2/Widget2;", "config", "Lru/ozon/app/android/common/filterWidgets/filtervalues/data/FilterValuesConfig;", "filterValuesNoUiViewMapper", "Lru/ozon/app/android/common/filterWidgets/filtervalues/presentation/FilterValuesNoUiViewMapper;", "navBarViewMapper", "Lru/ozon/app/android/common/filterWidgets/filters/presentation/noui/navbar/FilterNavBarViewMapper;", "provideFiltersWidget$filter_widgets_prodGoogleAllVendorsRelease", "filter-widgets_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class FilterValuesModule {

    @NotNull
    public static final FilterValuesModule INSTANCE = new FilterValuesModule();

    private FilterValuesModule() {
    }

    @NotNull
    public static final Widget2 provideFiltersWidget$filter_widgets_prodGoogleAllVendorsRelease(@NotNull FilterValuesConfig config, @NotNull FilterValuesNoUiViewMapper filterValuesNoUiViewMapper, @NotNull FilterNavBarViewMapper navBarViewMapper) {
        Intrinsics.checkNotNullParameter(config, "config");
        Intrinsics.checkNotNullParameter(filterValuesNoUiViewMapper, "filterValuesNoUiViewMapper");
        Intrinsics.checkNotNullParameter(navBarViewMapper, "navBarViewMapper");
        return new Widget2("common", "filterValues", config, new ViewMapper2[]{filterValuesNoUiViewMapper, navBarViewMapper});
    }
}
