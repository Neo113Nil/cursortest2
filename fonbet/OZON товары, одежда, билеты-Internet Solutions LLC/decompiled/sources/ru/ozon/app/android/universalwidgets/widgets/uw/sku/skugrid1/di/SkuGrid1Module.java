package ru.ozon.app.android.universalwidgets.widgets.uw.sku.skugrid1.di;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.composer.widgets.v2.ViewMapper2;
import ru.ozon.app.android.composer.widgets.v2.Widget2;
import ru.ozon.app.android.product.common.footer.FooterViewMapper;
import ru.ozon.app.android.product.common.header.HeaderWidgetViewMapper;
import ru.ozon.app.android.product.common.richheader.presentation.RichHeaderViewMapper;
import ru.ozon.app.android.universalwidgets.widgets.uw.sku.skugrid1.data.SkuGrid1Config;
import ru.ozon.app.android.universalwidgets.widgets.uw.sku.skugrid1.presentation.SkuGrid1ViewMapper;

@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bÁ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J0\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000fH\u0007¨\u0006\u0010"}, d2 = {"Lru/ozon/app/android/universalwidgets/widgets/uw/sku/skugrid1/di/SkuGrid1Module;", "", "<init>", "()V", "provideSkuGrid1", "Lru/ozon/app/android/composer/widgets/v2/Widget2;", "config", "Lru/ozon/app/android/universalwidgets/widgets/uw/sku/skugrid1/data/SkuGrid1Config;", "viewMapper", "Lru/ozon/app/android/universalwidgets/widgets/uw/sku/skugrid1/presentation/SkuGrid1ViewMapper;", "headerWidgetViewMapper", "Lru/ozon/app/android/product/common/header/HeaderWidgetViewMapper;", "footerViewMapper", "Lru/ozon/app/android/product/common/footer/FooterViewMapper;", "richHeaderWidgetViewMapper", "Lru/ozon/app/android/product/common/richheader/presentation/RichHeaderViewMapper;", "universalwidgets_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class SkuGrid1Module {

    @NotNull
    public static final SkuGrid1Module INSTANCE = new SkuGrid1Module();

    private SkuGrid1Module() {
    }

    @NotNull
    public final Widget2 provideSkuGrid1(@NotNull SkuGrid1Config config, @NotNull SkuGrid1ViewMapper viewMapper, @NotNull HeaderWidgetViewMapper headerWidgetViewMapper, @NotNull FooterViewMapper footerViewMapper, @NotNull RichHeaderViewMapper richHeaderWidgetViewMapper) {
        Intrinsics.checkNotNullParameter(config, "config");
        Intrinsics.checkNotNullParameter(viewMapper, "viewMapper");
        Intrinsics.checkNotNullParameter(headerWidgetViewMapper, "headerWidgetViewMapper");
        Intrinsics.checkNotNullParameter(footerViewMapper, "footerViewMapper");
        Intrinsics.checkNotNullParameter(richHeaderWidgetViewMapper, "richHeaderWidgetViewMapper");
        return new Widget2("products", "skuGrid1", config, new ViewMapper2[]{headerWidgetViewMapper, richHeaderWidgetViewMapper, viewMapper, footerViewMapper});
    }
}
