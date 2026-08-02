package ru.ozon.app.android.universalwidgets.widgets.uw.sku.tilescroll.di;

import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.e0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.common.header.core.HeaderViewMapper2;
import ru.ozon.app.android.composer.widgets.v2.ViewMapper2;
import ru.ozon.app.android.composer.widgets.v2.Widget2;
import ru.ozon.app.android.universalwidgets.widgets.uw.sku.tilescroll.data.TileScrollConfig;
import ru.ozon.app.android.universalwidgets.widgets.uw.sku.tilescroll.ui.TileScrollViewMapper;

@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J+\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fH\u0001¢\u0006\u0002\b\r¨\u0006\u000e"}, d2 = {"Lru/ozon/app/android/universalwidgets/widgets/uw/sku/tilescroll/di/StorefrontWidgetsModule;", "", "<init>", "()V", "provideWidgets", "", "Lru/ozon/app/android/composer/widgets/v2/Widget2;", "tileScrollConfig", "Lru/ozon/app/android/universalwidgets/widgets/uw/sku/tilescroll/data/TileScrollConfig;", "tileScrollViewMapper", "Lru/ozon/app/android/universalwidgets/widgets/uw/sku/tilescroll/ui/TileScrollViewMapper;", "tileScrollHeaderViewMapper", "Lru/ozon/app/android/common/header/core/HeaderViewMapper2;", "provideWidgets$universalwidgets_prodGoogleAllVendorsRelease", "universalwidgets_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class StorefrontWidgetsModule {

    @NotNull
    public static final StorefrontWidgetsModule INSTANCE = new StorefrontWidgetsModule();

    private StorefrontWidgetsModule() {
    }

    @NotNull
    public final Set<Widget2> provideWidgets$universalwidgets_prodGoogleAllVendorsRelease(@NotNull TileScrollConfig tileScrollConfig, @NotNull TileScrollViewMapper tileScrollViewMapper, @NotNull HeaderViewMapper2 tileScrollHeaderViewMapper) {
        Intrinsics.checkNotNullParameter(tileScrollConfig, "tileScrollConfig");
        Intrinsics.checkNotNullParameter(tileScrollViewMapper, "tileScrollViewMapper");
        Intrinsics.checkNotNullParameter(tileScrollHeaderViewMapper, "tileScrollHeaderViewMapper");
        return e0.h(new Widget2("products", "tileScroll", tileScrollConfig, new ViewMapper2[]{tileScrollViewMapper, tileScrollHeaderViewMapper}));
    }
}
