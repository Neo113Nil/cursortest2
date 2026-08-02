package ru.ozon.app.android.universalwidgets.widgets.uw.sku.skugrid3.di;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.composer.widgets.v2.ViewMapper2;
import ru.ozon.app.android.composer.widgets.v2.Widget2;
import ru.ozon.app.android.product.common.footer.FooterViewMapper;
import ru.ozon.app.android.product.common.header.HeaderWidgetViewMapper;
import ru.ozon.app.android.product.common.richheader.presentation.RichHeaderViewMapper;
import ru.ozon.app.android.universalwidgets.widgets.uw.sku.separator.SkuSeparatorViewMapper;
import ru.ozon.app.android.universalwidgets.widgets.uw.sku.skugrid3.data.SkuGrid3Config;
import ru.ozon.app.android.universalwidgets.widgets.uw.sku.skugrid3.presentation.SkuGrid3ThinViewMapper;
import ru.ozon.app.android.universalwidgets.widgets.uw.sku.skugrid3.presentation.SkuGrid3ViewMapper;

@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bÁ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003JG\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0010H\u0007¢\u0006\u0004\b\u0013\u0010\u0014¨\u0006\u0015"}, d2 = {"Lru/ozon/app/android/universalwidgets/widgets/uw/sku/skugrid3/di/SkuGrid3Module;", "", "<init>", "()V", "Lru/ozon/app/android/universalwidgets/widgets/uw/sku/skugrid3/data/SkuGrid3Config;", "config", "Lru/ozon/app/android/universalwidgets/widgets/uw/sku/skugrid3/presentation/SkuGrid3ViewMapper;", "viewMapper", "Lru/ozon/app/android/universalwidgets/widgets/uw/sku/skugrid3/presentation/SkuGrid3ThinViewMapper;", "thinViewMapper", "Lru/ozon/app/android/product/common/header/HeaderWidgetViewMapper;", "headerWidgetViewMapper", "Lru/ozon/app/android/product/common/footer/FooterViewMapper;", "footerViewMapper", "Lru/ozon/app/android/product/common/richheader/presentation/RichHeaderViewMapper;", "richHeaderWidgetViewMapper", "Lru/ozon/app/android/universalwidgets/widgets/uw/sku/separator/SkuSeparatorViewMapper;", "skuSeparatorViewMapper", "Lru/ozon/app/android/composer/widgets/v2/Widget2;", "provideSkuGrid3", "(Lru/ozon/app/android/universalwidgets/widgets/uw/sku/skugrid3/data/SkuGrid3Config;Lru/ozon/app/android/universalwidgets/widgets/uw/sku/skugrid3/presentation/SkuGrid3ViewMapper;Lru/ozon/app/android/universalwidgets/widgets/uw/sku/skugrid3/presentation/SkuGrid3ThinViewMapper;Lru/ozon/app/android/product/common/header/HeaderWidgetViewMapper;Lru/ozon/app/android/product/common/footer/FooterViewMapper;Lru/ozon/app/android/product/common/richheader/presentation/RichHeaderViewMapper;Lru/ozon/app/android/universalwidgets/widgets/uw/sku/separator/SkuSeparatorViewMapper;)Lru/ozon/app/android/composer/widgets/v2/Widget2;", "universalwidgets_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class SkuGrid3Module {

    @NotNull
    public static final SkuGrid3Module INSTANCE = new SkuGrid3Module();

    private SkuGrid3Module() {
    }

    @NotNull
    public final Widget2 provideSkuGrid3(@NotNull SkuGrid3Config config, @NotNull SkuGrid3ViewMapper viewMapper, @NotNull SkuGrid3ThinViewMapper thinViewMapper, @NotNull HeaderWidgetViewMapper headerWidgetViewMapper, @NotNull FooterViewMapper footerViewMapper, @NotNull RichHeaderViewMapper richHeaderWidgetViewMapper, @NotNull SkuSeparatorViewMapper skuSeparatorViewMapper) {
        Intrinsics.checkNotNullParameter(config, "config");
        Intrinsics.checkNotNullParameter(viewMapper, "viewMapper");
        Intrinsics.checkNotNullParameter(thinViewMapper, "thinViewMapper");
        Intrinsics.checkNotNullParameter(headerWidgetViewMapper, "headerWidgetViewMapper");
        Intrinsics.checkNotNullParameter(footerViewMapper, "footerViewMapper");
        Intrinsics.checkNotNullParameter(richHeaderWidgetViewMapper, "richHeaderWidgetViewMapper");
        Intrinsics.checkNotNullParameter(skuSeparatorViewMapper, "skuSeparatorViewMapper");
        return new Widget2("products", "skuGrid3", config, new ViewMapper2[]{headerWidgetViewMapper, richHeaderWidgetViewMapper, viewMapper, thinViewMapper, footerViewMapper, skuSeparatorViewMapper});
    }
}
