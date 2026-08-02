package ru.ozon.app.android.orderdetails.orderactions.v1.di;

import hi.InterfaceC6958a;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.composer.widgets.v2.ViewMapper2;
import ru.ozon.app.android.composer.widgets.v2.Widget2;
import ru.ozon.app.android.orderdetails.orderactions.v1.data.OrderActionsConfig;
import ru.ozon.app.android.orderdetails.orderactions.v1.presentation.OrderActionsViewMapper;

@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\u00060\u0001j\u0002`\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u001f\u0010\n\u001a\u00020\t2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0007¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"Lru/ozon/app/android/orderdetails/orderactions/v1/di/OrderActionsModule;", "Lhi/a;", "Lru/ozon/app/android/di/provider/component/DiComponent;", "<init>", "()V", "Lru/ozon/app/android/orderdetails/orderactions/v1/data/OrderActionsConfig;", "config", "Lru/ozon/app/android/orderdetails/orderactions/v1/presentation/OrderActionsViewMapper;", "orderActionsViewMapper", "Lru/ozon/app/android/composer/widgets/v2/Widget2;", "provideWidget", "(Lru/ozon/app/android/orderdetails/orderactions/v1/data/OrderActionsConfig;Lru/ozon/app/android/orderdetails/orderactions/v1/presentation/OrderActionsViewMapper;)Lru/ozon/app/android/composer/widgets/v2/Widget2;", "orderdetails_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class OrderActionsModule implements InterfaceC6958a {
    @NotNull
    public final Widget2 provideWidget(@NotNull OrderActionsConfig config, @NotNull OrderActionsViewMapper orderActionsViewMapper) {
        Intrinsics.checkNotNullParameter(config, "config");
        Intrinsics.checkNotNullParameter(orderActionsViewMapper, "orderActionsViewMapper");
        return new Widget2("csma", "orderActions", config, new ViewMapper2[]{orderActionsViewMapper});
    }
}
