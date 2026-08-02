package ru.ozon.app.android.universalwidgets.widgets.uw.sku.tileGrid2.di;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.common.header.core.HeaderViewMapper2;
import ru.ozon.app.android.composer.widgets.v2.ViewMapper2;
import ru.ozon.app.android.composer.widgets.v2.Widget2;
import ru.ozon.app.android.universalwidgets.widgets.uw.sku.tileGrid2.data.TileGrid2Config;
import ru.ozon.app.android.universalwidgets.widgets.uw.sku.tileGrid2.presentation.multibutton.doubleCartButton.TileGrid2DoubleCartButtonViewMapper;
import ru.ozon.app.android.universalwidgets.widgets.uw.sku.tileGrid2.presentation.multibutton.emptyCartButton.TileGrid2EmptyCartButtonViewMapper;
import ru.ozon.app.android.universalwidgets.widgets.uw.sku.tileGrid2.presentation.multibutton.reservebutton.TileGrid2ReserveButtonViewMapper;
import ru.ozon.app.android.universalwidgets.widgets.uw.sku.tileGrid2.presentation.multibutton.singleCartButton.TileGrid2CartButtonViewMapper;
import ru.ozon.app.android.universalwidgets.widgets.uw.sku.tileGrid2.presentation.multibutton.singleCartContainer.TileGrid2CartContainerViewMapper;
import ru.ozon.app.android.universalwidgets.widgets.uw.sku.tileGrid2.presentation.separator.TileGrid2SimpleSeparatorMapper;
import ru.ozon.app.android.universalwidgets.widgets.uw.sku.tileGrid2.presentation.viewmapper.TileGrid2BannerButtonViewMapper;
import ru.ozon.app.android.universalwidgets.widgets.uw.sku.tileGrid2.presentation.viewmapper.TileGrid2BannerViewMapper;
import ru.ozon.app.android.universalwidgets.widgets.uw.sku.tileGrid2.presentation.viewmapper.TileGrid2DefaultViewMapper;
import ru.ozon.app.android.universalwidgets.widgets.uw.sku.tileGrid2.presentation.viewmapper.TileGrid2SimpleRightViewMapper;
import ru.ozon.app.android.universalwidgets.widgets.uw.sku.tileGrid2.presentation.viewmapper.TileGrid2ThinViewMapper;

@Metadata(d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bÁ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003Jp\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u001fH\u0007¨\u0006 "}, d2 = {"Lru/ozon/app/android/universalwidgets/widgets/uw/sku/tileGrid2/di/TileGridV2Module;", "", "<init>", "()V", "provideTileGrid2", "Lru/ozon/app/android/composer/widgets/v2/Widget2;", "config", "Lru/ozon/app/android/universalwidgets/widgets/uw/sku/tileGrid2/data/TileGrid2Config;", "headerViewMapper", "Lru/ozon/app/android/common/header/core/HeaderViewMapper2;", "tileGrid2DefaultViewMapper", "Lru/ozon/app/android/universalwidgets/widgets/uw/sku/tileGrid2/presentation/viewmapper/TileGrid2DefaultViewMapper;", "tileGrid2SimpleRightViewMapper", "Lru/ozon/app/android/universalwidgets/widgets/uw/sku/tileGrid2/presentation/viewmapper/TileGrid2SimpleRightViewMapper;", "tileGrid2SimpleSeparatorMapper", "Lru/ozon/app/android/universalwidgets/widgets/uw/sku/tileGrid2/presentation/separator/TileGrid2SimpleSeparatorMapper;", "tileGrid2CartButtonViewMapper", "Lru/ozon/app/android/universalwidgets/widgets/uw/sku/tileGrid2/presentation/multibutton/singleCartButton/TileGrid2CartButtonViewMapper;", "tileGrid2CartContainerViewMapper", "Lru/ozon/app/android/universalwidgets/widgets/uw/sku/tileGrid2/presentation/multibutton/singleCartContainer/TileGrid2CartContainerViewMapper;", "tileGrid2EmptyCartButtonViewMapper", "Lru/ozon/app/android/universalwidgets/widgets/uw/sku/tileGrid2/presentation/multibutton/emptyCartButton/TileGrid2EmptyCartButtonViewMapper;", "tileGrid2DoubleCartButtonViewMapper", "Lru/ozon/app/android/universalwidgets/widgets/uw/sku/tileGrid2/presentation/multibutton/doubleCartButton/TileGrid2DoubleCartButtonViewMapper;", "tileGrid2ThinViewMapper", "Lru/ozon/app/android/universalwidgets/widgets/uw/sku/tileGrid2/presentation/viewmapper/TileGrid2ThinViewMapper;", "reserveButtonViewMapper", "Lru/ozon/app/android/universalwidgets/widgets/uw/sku/tileGrid2/presentation/multibutton/reservebutton/TileGrid2ReserveButtonViewMapper;", "tileGrid2BannerViewMapper", "Lru/ozon/app/android/universalwidgets/widgets/uw/sku/tileGrid2/presentation/viewmapper/TileGrid2BannerViewMapper;", "tileGrid2BannerButtonViewMapper", "Lru/ozon/app/android/universalwidgets/widgets/uw/sku/tileGrid2/presentation/viewmapper/TileGrid2BannerButtonViewMapper;", "universalwidgets_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class TileGridV2Module {

    @NotNull
    public static final TileGridV2Module INSTANCE = new TileGridV2Module();

    private TileGridV2Module() {
    }

    @NotNull
    public final Widget2 provideTileGrid2(@NotNull TileGrid2Config config, @NotNull HeaderViewMapper2 headerViewMapper, @NotNull TileGrid2DefaultViewMapper tileGrid2DefaultViewMapper, @NotNull TileGrid2SimpleRightViewMapper tileGrid2SimpleRightViewMapper, @NotNull TileGrid2SimpleSeparatorMapper tileGrid2SimpleSeparatorMapper, @NotNull TileGrid2CartButtonViewMapper tileGrid2CartButtonViewMapper, @NotNull TileGrid2CartContainerViewMapper tileGrid2CartContainerViewMapper, @NotNull TileGrid2EmptyCartButtonViewMapper tileGrid2EmptyCartButtonViewMapper, @NotNull TileGrid2DoubleCartButtonViewMapper tileGrid2DoubleCartButtonViewMapper, @NotNull TileGrid2ThinViewMapper tileGrid2ThinViewMapper, @NotNull TileGrid2ReserveButtonViewMapper reserveButtonViewMapper, @NotNull TileGrid2BannerViewMapper tileGrid2BannerViewMapper, @NotNull TileGrid2BannerButtonViewMapper tileGrid2BannerButtonViewMapper) {
        Intrinsics.checkNotNullParameter(config, "config");
        Intrinsics.checkNotNullParameter(headerViewMapper, "headerViewMapper");
        Intrinsics.checkNotNullParameter(tileGrid2DefaultViewMapper, "tileGrid2DefaultViewMapper");
        Intrinsics.checkNotNullParameter(tileGrid2SimpleRightViewMapper, "tileGrid2SimpleRightViewMapper");
        Intrinsics.checkNotNullParameter(tileGrid2SimpleSeparatorMapper, "tileGrid2SimpleSeparatorMapper");
        Intrinsics.checkNotNullParameter(tileGrid2CartButtonViewMapper, "tileGrid2CartButtonViewMapper");
        Intrinsics.checkNotNullParameter(tileGrid2CartContainerViewMapper, "tileGrid2CartContainerViewMapper");
        Intrinsics.checkNotNullParameter(tileGrid2EmptyCartButtonViewMapper, "tileGrid2EmptyCartButtonViewMapper");
        Intrinsics.checkNotNullParameter(tileGrid2DoubleCartButtonViewMapper, "tileGrid2DoubleCartButtonViewMapper");
        Intrinsics.checkNotNullParameter(tileGrid2ThinViewMapper, "tileGrid2ThinViewMapper");
        Intrinsics.checkNotNullParameter(reserveButtonViewMapper, "reserveButtonViewMapper");
        Intrinsics.checkNotNullParameter(tileGrid2BannerViewMapper, "tileGrid2BannerViewMapper");
        Intrinsics.checkNotNullParameter(tileGrid2BannerButtonViewMapper, "tileGrid2BannerButtonViewMapper");
        return new Widget2("products", "tileGrid2", config, new ViewMapper2[]{headerViewMapper, tileGrid2DefaultViewMapper, tileGrid2SimpleRightViewMapper, tileGrid2SimpleSeparatorMapper, tileGrid2CartButtonViewMapper, tileGrid2CartContainerViewMapper, tileGrid2EmptyCartButtonViewMapper, tileGrid2DoubleCartButtonViewMapper, reserveButtonViewMapper, tileGrid2ThinViewMapper, tileGrid2BannerViewMapper, tileGrid2BannerButtonViewMapper});
    }
}
