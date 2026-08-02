package ru.ozon.app.android.fresh.checkout.widgets.checkoutProducts.di;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.composer.widgets.v2.ViewMapper2;
import ru.ozon.app.android.composer.widgets.v2.Widget2;
import ru.ozon.app.android.fresh.checkout.widgets.checkoutProducts.data.CheckoutProductsConfig;
import ru.ozon.app.android.fresh.checkout.widgets.checkoutProducts.presentation.CheckoutProductsViewMapper;

@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bÁ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0018\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH\u0007¨\u0006\n"}, d2 = {"Lru/ozon/app/android/fresh/checkout/widgets/checkoutProducts/di/CheckoutProductsWidgetModule;", "", "<init>", "()V", "provideWidget", "Lru/ozon/app/android/composer/widgets/v2/Widget2;", "config", "Lru/ozon/app/android/fresh/checkout/widgets/checkoutProducts/data/CheckoutProductsConfig;", "viewMapper", "Lru/ozon/app/android/fresh/checkout/widgets/checkoutProducts/presentation/CheckoutProductsViewMapper;", "widgets-checkout_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class CheckoutProductsWidgetModule {

    @NotNull
    public static final CheckoutProductsWidgetModule INSTANCE = new CheckoutProductsWidgetModule();

    private CheckoutProductsWidgetModule() {
    }

    @NotNull
    public final Widget2 provideWidget(@NotNull CheckoutProductsConfig config, @NotNull CheckoutProductsViewMapper viewMapper) {
        Intrinsics.checkNotNullParameter(config, "config");
        Intrinsics.checkNotNullParameter(viewMapper, "viewMapper");
        return new Widget2("express", "checkoutProducts", config, new ViewMapper2[]{viewMapper});
    }
}
