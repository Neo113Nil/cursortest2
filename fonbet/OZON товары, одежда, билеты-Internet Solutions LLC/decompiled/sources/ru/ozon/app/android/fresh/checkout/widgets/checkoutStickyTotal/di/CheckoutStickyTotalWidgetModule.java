package ru.ozon.app.android.fresh.checkout.widgets.checkoutStickyTotal.di;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.composer.widgets.v2.ViewMapper2;
import ru.ozon.app.android.composer.widgets.v2.Widget2;
import ru.ozon.app.android.fresh.checkout.widgets.checkoutProgressBar.presentation.FreshCheckoutProgressBarViewMapper;
import ru.ozon.app.android.fresh.checkout.widgets.checkoutStickyTotal.data.CheckoutStickyTotalConfig;
import ru.ozon.app.android.fresh.checkout.widgets.checkoutStickyTotal.presentation.CheckoutStickyTotalOverlayViewMapper;

@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bÁ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J \u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH\u0007¨\u0006\f"}, d2 = {"Lru/ozon/app/android/fresh/checkout/widgets/checkoutStickyTotal/di/CheckoutStickyTotalWidgetModule;", "", "<init>", "()V", "provideWidget", "Lru/ozon/app/android/composer/widgets/v2/Widget2;", "config", "Lru/ozon/app/android/fresh/checkout/widgets/checkoutStickyTotal/data/CheckoutStickyTotalConfig;", "mapper", "Lru/ozon/app/android/fresh/checkout/widgets/checkoutStickyTotal/presentation/CheckoutStickyTotalOverlayViewMapper;", "progressBarMapper", "Lru/ozon/app/android/fresh/checkout/widgets/checkoutProgressBar/presentation/FreshCheckoutProgressBarViewMapper;", "widgets-checkout_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class CheckoutStickyTotalWidgetModule {

    @NotNull
    public static final CheckoutStickyTotalWidgetModule INSTANCE = new CheckoutStickyTotalWidgetModule();

    private CheckoutStickyTotalWidgetModule() {
    }

    @NotNull
    public final Widget2 provideWidget(@NotNull CheckoutStickyTotalConfig config, @NotNull CheckoutStickyTotalOverlayViewMapper mapper, @NotNull FreshCheckoutProgressBarViewMapper progressBarMapper) {
        Intrinsics.checkNotNullParameter(config, "config");
        Intrinsics.checkNotNullParameter(mapper, "mapper");
        Intrinsics.checkNotNullParameter(progressBarMapper, "progressBarMapper");
        return new Widget2("express", "checkoutStickyTotal", config, new ViewMapper2[]{mapper, progressBarMapper});
    }
}
