package ru.ozon.app.android.fresh.main.widgets.product.scroll.di;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.composer.widgets.v2.ViewMapper2;
import ru.ozon.app.android.composer.widgets.v2.Widget2;
import ru.ozon.app.android.fresh.main.widgets.product.common.footer.FooterViewMapper;
import ru.ozon.app.android.fresh.main.widgets.product.common.header.HeaderWidgetViewMapper;
import ru.ozon.app.android.fresh.main.widgets.product.common.richheader.presentation.RichHeaderViewMapper;
import ru.ozon.app.android.fresh.main.widgets.product.scroll.data.ScrollConfig;
import ru.ozon.app.android.fresh.main.widgets.product.scroll.presentation.ScrollViewMapper;

@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0001\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J0\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000fH\u0007¨\u0006\u0010"}, d2 = {"Lru/ozon/app/android/fresh/main/widgets/product/scroll/di/ScrollWidgetModule;", "", "<init>", "()V", "provideWidget", "Lru/ozon/app/android/composer/widgets/v2/Widget2;", "scrollViewMapper", "Lru/ozon/app/android/fresh/main/widgets/product/scroll/presentation/ScrollViewMapper;", "headerWidgetViewMapper", "Lru/ozon/app/android/fresh/main/widgets/product/common/header/HeaderWidgetViewMapper;", "richHeaderWidgetViewMapper", "Lru/ozon/app/android/fresh/main/widgets/product/common/richheader/presentation/RichHeaderViewMapper;", "footerViewMapper", "Lru/ozon/app/android/fresh/main/widgets/product/common/footer/FooterViewMapper;", "scrollConfig", "Lru/ozon/app/android/fresh/main/widgets/product/scroll/data/ScrollConfig;", "widgets-main_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class ScrollWidgetModule {
    @NotNull
    public final Widget2 provideWidget(@NotNull ScrollViewMapper scrollViewMapper, @NotNull HeaderWidgetViewMapper headerWidgetViewMapper, @NotNull RichHeaderViewMapper richHeaderWidgetViewMapper, @NotNull FooterViewMapper footerViewMapper, @NotNull ScrollConfig scrollConfig) {
        Intrinsics.checkNotNullParameter(scrollViewMapper, "scrollViewMapper");
        Intrinsics.checkNotNullParameter(headerWidgetViewMapper, "headerWidgetViewMapper");
        Intrinsics.checkNotNullParameter(richHeaderWidgetViewMapper, "richHeaderWidgetViewMapper");
        Intrinsics.checkNotNullParameter(footerViewMapper, "footerViewMapper");
        Intrinsics.checkNotNullParameter(scrollConfig, "scrollConfig");
        return new Widget2("express", "skuScroll", scrollConfig, new ViewMapper2[]{headerWidgetViewMapper, richHeaderWidgetViewMapper, scrollViewMapper, footerViewMapper});
    }
}
