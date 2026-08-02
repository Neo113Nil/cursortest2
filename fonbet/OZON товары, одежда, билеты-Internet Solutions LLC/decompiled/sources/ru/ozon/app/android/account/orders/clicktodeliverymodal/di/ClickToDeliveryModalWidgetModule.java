package ru.ozon.app.android.account.orders.clicktodeliverymodal.di;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.account.orders.clicktodeliverymodal.core.ClickToDeliveryModalConfig;
import ru.ozon.app.android.account.orders.clicktodeliverymodal.core.buttons.ButtonsViewMapper;
import ru.ozon.app.android.account.orders.clicktodeliverymodal.core.delivery.DeliveryViewMapper;
import ru.ozon.app.android.account.orders.clicktodeliverymodal.core.title.TitleViewMapper;
import ru.ozon.app.android.composer.widgets.v2.ViewMapper2;
import ru.ozon.app.android.composer.widgets.v2.Widget2;
import ru.ozon.app.android.separator.core.SeparatorViewMapper;

@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0001\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J0\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000fH\u0007¨\u0006\u0010"}, d2 = {"Lru/ozon/app/android/account/orders/clicktodeliverymodal/di/ClickToDeliveryModalWidgetModule;", "", "<init>", "()V", "provideWidget", "Lru/ozon/app/android/composer/widgets/v2/Widget2;", "config", "Lru/ozon/app/android/account/orders/clicktodeliverymodal/core/ClickToDeliveryModalConfig;", "separatorViewMapper", "Lru/ozon/app/android/separator/core/SeparatorViewMapper;", "titleViewMapper", "Lru/ozon/app/android/account/orders/clicktodeliverymodal/core/title/TitleViewMapper;", "buttonsViewMapper", "Lru/ozon/app/android/account/orders/clicktodeliverymodal/core/buttons/ButtonsViewMapper;", "deliveryViewMapper", "Lru/ozon/app/android/account/orders/clicktodeliverymodal/core/delivery/DeliveryViewMapper;", "cs-orders_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class ClickToDeliveryModalWidgetModule {
    @NotNull
    public final Widget2 provideWidget(@NotNull ClickToDeliveryModalConfig config, @NotNull SeparatorViewMapper separatorViewMapper, @NotNull TitleViewMapper titleViewMapper, @NotNull ButtonsViewMapper buttonsViewMapper, @NotNull DeliveryViewMapper deliveryViewMapper) {
        Intrinsics.checkNotNullParameter(config, "config");
        Intrinsics.checkNotNullParameter(separatorViewMapper, "separatorViewMapper");
        Intrinsics.checkNotNullParameter(titleViewMapper, "titleViewMapper");
        Intrinsics.checkNotNullParameter(buttonsViewMapper, "buttonsViewMapper");
        Intrinsics.checkNotNullParameter(deliveryViewMapper, "deliveryViewMapper");
        return new Widget2("csma", "clickToDeliveryModal", config, new ViewMapper2[]{separatorViewMapper, titleViewMapper, buttonsViewMapper, deliveryViewMapper});
    }
}
