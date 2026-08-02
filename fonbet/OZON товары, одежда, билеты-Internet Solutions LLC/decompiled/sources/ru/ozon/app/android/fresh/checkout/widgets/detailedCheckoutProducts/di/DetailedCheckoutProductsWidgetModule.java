package ru.ozon.app.android.fresh.checkout.widgets.detailedCheckoutProducts.di;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.composer.widgets.v2.ViewMapper2;
import ru.ozon.app.android.composer.widgets.v2.Widget2;
import ru.ozon.app.android.fresh.checkout.widgets.detailedCheckoutProducts.data.DetailedCheckoutProductsConfig;
import ru.ozon.app.android.fresh.checkout.widgets.detailedCheckoutProducts.presentation.DetailedCheckoutProductsViewMapper;
import ru.ozon.app.android.fresh.common.widgets.header.HeaderApi;

@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0001\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J \u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH\u0007¨\u0006\f"}, d2 = {"Lru/ozon/app/android/fresh/checkout/widgets/detailedCheckoutProducts/di/DetailedCheckoutProductsWidgetModule;", "", "<init>", "()V", "provideWidget", "Lru/ozon/app/android/composer/widgets/v2/Widget2;", "config", "Lru/ozon/app/android/fresh/checkout/widgets/detailedCheckoutProducts/data/DetailedCheckoutProductsConfig;", "viewMapper", "Lru/ozon/app/android/fresh/checkout/widgets/detailedCheckoutProducts/presentation/DetailedCheckoutProductsViewMapper;", "headerApi", "Lru/ozon/app/android/fresh/common/widgets/header/HeaderApi;", "widgets-checkout_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class DetailedCheckoutProductsWidgetModule {
    @NotNull
    public final Widget2 provideWidget(@NotNull DetailedCheckoutProductsConfig config, @NotNull DetailedCheckoutProductsViewMapper viewMapper, @NotNull HeaderApi headerApi) {
        Intrinsics.checkNotNullParameter(config, "config");
        Intrinsics.checkNotNullParameter(viewMapper, "viewMapper");
        Intrinsics.checkNotNullParameter(headerApi, "headerApi");
        return new Widget2("express", "detailedCheckoutProducts", config, new ViewMapper2[]{viewMapper, headerApi.getViewMapper()});
    }
}
