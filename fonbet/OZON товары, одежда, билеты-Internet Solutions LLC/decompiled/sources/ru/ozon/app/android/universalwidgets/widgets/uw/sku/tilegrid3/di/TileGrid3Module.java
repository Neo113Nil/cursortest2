package ru.ozon.app.android.universalwidgets.widgets.uw.sku.tilegrid3.di;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.common.header.core.HeaderViewMapper2;
import ru.ozon.app.android.composer.widgets.v2.ViewMapper2;
import ru.ozon.app.android.composer.widgets.v2.Widget2;
import ru.ozon.app.android.universalwidgets.widgets.uw.sku.tilegrid3.data.TileGrid3Config;
import ru.ozon.app.android.universalwidgets.widgets.uw.sku.tilegrid3.presentation.TileGrid3ViewMapper;
import ru.ozon.app.android.universalwidgets.widgets.uw.sku.tilegrid3.presentation.separator.TileGrid3SeparatorMapper;

@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bÁ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J(\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\rH\u0007¨\u0006\u000e"}, d2 = {"Lru/ozon/app/android/universalwidgets/widgets/uw/sku/tilegrid3/di/TileGrid3Module;", "", "<init>", "()V", "provideTileGrid3", "Lru/ozon/app/android/composer/widgets/v2/Widget2;", "config", "Lru/ozon/app/android/universalwidgets/widgets/uw/sku/tilegrid3/data/TileGrid3Config;", "headerViewMapper", "Lru/ozon/app/android/common/header/core/HeaderViewMapper2;", "tileGrid3ViewMapper", "Lru/ozon/app/android/universalwidgets/widgets/uw/sku/tilegrid3/presentation/TileGrid3ViewMapper;", "tileGrid3SeparatorMapper", "Lru/ozon/app/android/universalwidgets/widgets/uw/sku/tilegrid3/presentation/separator/TileGrid3SeparatorMapper;", "universalwidgets_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class TileGrid3Module {

    @NotNull
    public static final TileGrid3Module INSTANCE = new TileGrid3Module();

    private TileGrid3Module() {
    }

    @NotNull
    public final Widget2 provideTileGrid3(@NotNull TileGrid3Config config, @NotNull HeaderViewMapper2 headerViewMapper, @NotNull TileGrid3ViewMapper tileGrid3ViewMapper, @NotNull TileGrid3SeparatorMapper tileGrid3SeparatorMapper) {
        Intrinsics.checkNotNullParameter(config, "config");
        Intrinsics.checkNotNullParameter(headerViewMapper, "headerViewMapper");
        Intrinsics.checkNotNullParameter(tileGrid3ViewMapper, "tileGrid3ViewMapper");
        Intrinsics.checkNotNullParameter(tileGrid3SeparatorMapper, "tileGrid3SeparatorMapper");
        return new Widget2("products", "tileGrid3", config, new ViewMapper2[]{headerViewMapper, tileGrid3ViewMapper, tileGrid3SeparatorMapper});
    }
}
