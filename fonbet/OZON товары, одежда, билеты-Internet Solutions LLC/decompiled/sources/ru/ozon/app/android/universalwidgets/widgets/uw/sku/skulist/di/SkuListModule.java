package ru.ozon.app.android.universalwidgets.widgets.uw.sku.skulist.di;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.composer.widgets.v2.ViewMapper2;
import ru.ozon.app.android.composer.widgets.v2.Widget2;
import ru.ozon.app.android.product.common.footer.FooterViewMapper;
import ru.ozon.app.android.product.common.header.HeaderWidgetViewMapper;
import ru.ozon.app.android.product.common.richheader.presentation.RichHeaderViewMapper;
import ru.ozon.app.android.universalwidgets.widgets.uw.sku.skulist.data.SkuListConfig;
import ru.ozon.app.android.universalwidgets.widgets.uw.sku.skulist.presentation.SkuListViewMapper;

@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bÁ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J0\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000fH\u0007¨\u0006\u0010"}, d2 = {"Lru/ozon/app/android/universalwidgets/widgets/uw/sku/skulist/di/SkuListModule;", "", "<init>", "()V", "provideSkuList", "Lru/ozon/app/android/composer/widgets/v2/Widget2;", "config", "Lru/ozon/app/android/universalwidgets/widgets/uw/sku/skulist/data/SkuListConfig;", "viewMapper", "Lru/ozon/app/android/universalwidgets/widgets/uw/sku/skulist/presentation/SkuListViewMapper;", "headerWidgetViewMapper", "Lru/ozon/app/android/product/common/header/HeaderWidgetViewMapper;", "footerViewMapper", "Lru/ozon/app/android/product/common/footer/FooterViewMapper;", "richHeaderWidgetViewMapper", "Lru/ozon/app/android/product/common/richheader/presentation/RichHeaderViewMapper;", "universalwidgets_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class SkuListModule {

    @NotNull
    public static final SkuListModule INSTANCE = new SkuListModule();

    private SkuListModule() {
    }

    @NotNull
    public final Widget2 provideSkuList(@NotNull SkuListConfig config, @NotNull SkuListViewMapper viewMapper, @NotNull HeaderWidgetViewMapper headerWidgetViewMapper, @NotNull FooterViewMapper footerViewMapper, @NotNull RichHeaderViewMapper richHeaderWidgetViewMapper) {
        Intrinsics.checkNotNullParameter(config, "config");
        Intrinsics.checkNotNullParameter(viewMapper, "viewMapper");
        Intrinsics.checkNotNullParameter(headerWidgetViewMapper, "headerWidgetViewMapper");
        Intrinsics.checkNotNullParameter(footerViewMapper, "footerViewMapper");
        Intrinsics.checkNotNullParameter(richHeaderWidgetViewMapper, "richHeaderWidgetViewMapper");
        return new Widget2("products", "skuList", config, new ViewMapper2[]{headerWidgetViewMapper, richHeaderWidgetViewMapper, viewMapper, footerViewMapper});
    }
}
