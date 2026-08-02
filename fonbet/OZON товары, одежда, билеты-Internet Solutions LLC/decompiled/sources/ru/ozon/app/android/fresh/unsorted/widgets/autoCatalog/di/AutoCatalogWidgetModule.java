package ru.ozon.app.android.fresh.unsorted.widgets.autoCatalog.di;

import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.C7705l;
import kotlin.collections.e0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.composer.widgets.v2.ViewMapper2;
import ru.ozon.app.android.composer.widgets.v2.Widget2;
import ru.ozon.app.android.fresh.common.widgets.header.HeaderApi;
import ru.ozon.app.android.fresh.unsorted.widgets.autoCatalog.data.AutoCatalogConfig;
import ru.ozon.app.android.fresh.unsorted.widgets.autoCatalog.presentation.AutoCatalogTileGridMediumViewMapper;
import ru.ozon.app.android.fresh.unsorted.widgets.autoCatalog.presentation.AutoCatalogTileGridMiniViewMapper;
import ru.ozon.app.android.fresh.unsorted.widgets.freshTileGrid.presentation.plug.FreshTileGridPlugViewMapper;

@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0001\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J8\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010H\u0007¨\u0006\u0011"}, d2 = {"Lru/ozon/app/android/fresh/unsorted/widgets/autoCatalog/di/AutoCatalogWidgetModule;", "", "<init>", "()V", "provideWidget", "", "Lru/ozon/app/android/composer/widgets/v2/Widget2;", "config", "Lru/ozon/app/android/fresh/unsorted/widgets/autoCatalog/data/AutoCatalogConfig;", "mediumMapper", "Lru/ozon/app/android/fresh/unsorted/widgets/autoCatalog/presentation/AutoCatalogTileGridMediumViewMapper;", "miniMapper", "Lru/ozon/app/android/fresh/unsorted/widgets/autoCatalog/presentation/AutoCatalogTileGridMiniViewMapper;", "plugMapper", "Lru/ozon/app/android/fresh/unsorted/widgets/freshTileGrid/presentation/plug/FreshTileGridPlugViewMapper;", "headerApi", "Lru/ozon/app/android/fresh/common/widgets/header/HeaderApi;", "widgets-unsorted_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class AutoCatalogWidgetModule {
    @NotNull
    public final Set<Widget2> provideWidget(@NotNull AutoCatalogConfig config, @NotNull AutoCatalogTileGridMediumViewMapper mediumMapper, @NotNull AutoCatalogTileGridMiniViewMapper miniMapper, @NotNull FreshTileGridPlugViewMapper plugMapper, HeaderApi headerApi) {
        Intrinsics.checkNotNullParameter(config, "config");
        Intrinsics.checkNotNullParameter(mediumMapper, "mediumMapper");
        Intrinsics.checkNotNullParameter(miniMapper, "miniMapper");
        Intrinsics.checkNotNullParameter(plugMapper, "plugMapper");
        ViewMapper2[] elements = {headerApi != null ? headerApi.getViewMapper() : null, mediumMapper, miniMapper, plugMapper};
        Intrinsics.checkNotNullParameter(elements, "elements");
        return e0.h(new Widget2("express", "autoCatalog", config, (ViewMapper2[]) C7705l.B(elements).toArray(new ViewMapper2[0])));
    }
}
