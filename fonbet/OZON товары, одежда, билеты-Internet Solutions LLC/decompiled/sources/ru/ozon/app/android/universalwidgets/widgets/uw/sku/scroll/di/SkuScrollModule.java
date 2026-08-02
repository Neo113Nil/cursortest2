package ru.ozon.app.android.universalwidgets.widgets.uw.sku.scroll.di;

import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.e0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.composer.widgets.v2.ViewMapper2;
import ru.ozon.app.android.composer.widgets.v2.Widget2;
import ru.ozon.app.android.product.common.footer.FooterViewMapper;
import ru.ozon.app.android.product.common.header.HeaderWidgetViewMapper;
import ru.ozon.app.android.product.common.richheader.presentation.RichHeaderViewMapper;
import ru.ozon.app.android.universalwidgets.widgets.uw.sku.scroll.data.ScrollConfig;
import ru.ozon.app.android.universalwidgets.widgets.uw.sku.scroll.presentation.SkuScrollViewMapper;

@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bÁ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J6\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0010H\u0007¨\u0006\u0011"}, d2 = {"Lru/ozon/app/android/universalwidgets/widgets/uw/sku/scroll/di/SkuScrollModule;", "", "<init>", "()V", "provideSkuScroll", "", "Lru/ozon/app/android/composer/widgets/v2/Widget2;", "viewMapper", "Lru/ozon/app/android/universalwidgets/widgets/uw/sku/scroll/presentation/SkuScrollViewMapper;", "config", "Lru/ozon/app/android/universalwidgets/widgets/uw/sku/scroll/data/ScrollConfig;", "headerWidgetViewMapper", "Lru/ozon/app/android/product/common/header/HeaderWidgetViewMapper;", "footerViewMapper", "Lru/ozon/app/android/product/common/footer/FooterViewMapper;", "richHeaderWidgetViewMapper", "Lru/ozon/app/android/product/common/richheader/presentation/RichHeaderViewMapper;", "universalwidgets_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class SkuScrollModule {

    @NotNull
    public static final SkuScrollModule INSTANCE = new SkuScrollModule();

    private SkuScrollModule() {
    }

    @NotNull
    public static final Set<Widget2> provideSkuScroll(@NotNull SkuScrollViewMapper viewMapper, @NotNull ScrollConfig config, @NotNull HeaderWidgetViewMapper headerWidgetViewMapper, @NotNull FooterViewMapper footerViewMapper, @NotNull RichHeaderViewMapper richHeaderWidgetViewMapper) {
        Intrinsics.checkNotNullParameter(viewMapper, "viewMapper");
        Intrinsics.checkNotNullParameter(config, "config");
        Intrinsics.checkNotNullParameter(headerWidgetViewMapper, "headerWidgetViewMapper");
        Intrinsics.checkNotNullParameter(footerViewMapper, "footerViewMapper");
        Intrinsics.checkNotNullParameter(richHeaderWidgetViewMapper, "richHeaderWidgetViewMapper");
        return e0.h(new Widget2("products", "skuScroll", config, new ViewMapper2[]{headerWidgetViewMapper, richHeaderWidgetViewMapper, viewMapper, footerViewMapper}));
    }
}
