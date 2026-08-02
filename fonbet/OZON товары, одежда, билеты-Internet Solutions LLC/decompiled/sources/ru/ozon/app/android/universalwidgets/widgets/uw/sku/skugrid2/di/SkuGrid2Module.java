package ru.ozon.app.android.universalwidgets.widgets.uw.sku.skugrid2.di;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.composer.widgets.v2.ViewMapper2;
import ru.ozon.app.android.composer.widgets.v2.Widget2;
import ru.ozon.app.android.product.common.footer.FooterViewMapper;
import ru.ozon.app.android.product.common.header.HeaderWidgetViewMapper;
import ru.ozon.app.android.product.common.richheader.presentation.RichHeaderViewMapper;
import ru.ozon.app.android.universalwidgets.widgets.uw.sku.separator.SkuSeparatorViewMapper;
import ru.ozon.app.android.universalwidgets.widgets.uw.sku.skugrid2.data.SkuGrid2Config;
import ru.ozon.app.android.universalwidgets.widgets.uw.sku.skugrid2.presentation.SkuGrid2ThinViewMapper;
import ru.ozon.app.android.universalwidgets.widgets.uw.sku.skugrid2.presentation.SkuGrid2ViewMapper;

@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bÁ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J@\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0013H\u0007¨\u0006\u0014"}, d2 = {"Lru/ozon/app/android/universalwidgets/widgets/uw/sku/skugrid2/di/SkuGrid2Module;", "", "<init>", "()V", "provideSkuGrid2", "Lru/ozon/app/android/composer/widgets/v2/Widget2;", "config", "Lru/ozon/app/android/universalwidgets/widgets/uw/sku/skugrid2/data/SkuGrid2Config;", "viewMapper", "Lru/ozon/app/android/universalwidgets/widgets/uw/sku/skugrid2/presentation/SkuGrid2ViewMapper;", "thinViewMapper", "Lru/ozon/app/android/universalwidgets/widgets/uw/sku/skugrid2/presentation/SkuGrid2ThinViewMapper;", "headerWidgetViewMapper", "Lru/ozon/app/android/product/common/header/HeaderWidgetViewMapper;", "footerViewMapper", "Lru/ozon/app/android/product/common/footer/FooterViewMapper;", "richHeaderWidgetViewMapper", "Lru/ozon/app/android/product/common/richheader/presentation/RichHeaderViewMapper;", "skuSeparatorViewMapper", "Lru/ozon/app/android/universalwidgets/widgets/uw/sku/separator/SkuSeparatorViewMapper;", "universalwidgets_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class SkuGrid2Module {

    @NotNull
    public static final SkuGrid2Module INSTANCE = new SkuGrid2Module();

    private SkuGrid2Module() {
    }

    @NotNull
    public final Widget2 provideSkuGrid2(@NotNull SkuGrid2Config config, @NotNull SkuGrid2ViewMapper viewMapper, @NotNull SkuGrid2ThinViewMapper thinViewMapper, @NotNull HeaderWidgetViewMapper headerWidgetViewMapper, @NotNull FooterViewMapper footerViewMapper, @NotNull RichHeaderViewMapper richHeaderWidgetViewMapper, @NotNull SkuSeparatorViewMapper skuSeparatorViewMapper) {
        Intrinsics.checkNotNullParameter(config, "config");
        Intrinsics.checkNotNullParameter(viewMapper, "viewMapper");
        Intrinsics.checkNotNullParameter(thinViewMapper, "thinViewMapper");
        Intrinsics.checkNotNullParameter(headerWidgetViewMapper, "headerWidgetViewMapper");
        Intrinsics.checkNotNullParameter(footerViewMapper, "footerViewMapper");
        Intrinsics.checkNotNullParameter(richHeaderWidgetViewMapper, "richHeaderWidgetViewMapper");
        Intrinsics.checkNotNullParameter(skuSeparatorViewMapper, "skuSeparatorViewMapper");
        return new Widget2("products", "skuGrid2", config, new ViewMapper2[]{headerWidgetViewMapper, richHeaderWidgetViewMapper, viewMapper, thinViewMapper, footerViewMapper, skuSeparatorViewMapper});
    }
}
