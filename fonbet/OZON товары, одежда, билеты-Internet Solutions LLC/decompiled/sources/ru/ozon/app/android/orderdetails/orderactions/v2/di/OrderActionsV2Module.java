package ru.ozon.app.android.orderdetails.orderactions.v2.di;

import kotlin.Metadata;
import n20.i;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.orderdetails.orderactions.v2.core.OrderActionsV2ComposeWidgetCoreKt;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0007\u001a\u00020\u0004H\u0001¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\b"}, d2 = {"Lru/ozon/app/android/orderdetails/orderactions/v2/di/OrderActionsV2Module;", "", "<init>", "()V", "Ln20/i;", "provideWidgetFactories$orderdetails_prodGoogleAllVendorsRelease", "()Ln20/i;", "provideWidgetFactories", "orderdetails_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class OrderActionsV2Module {
    @NotNull
    public final i provideWidgetFactories$orderdetails_prodGoogleAllVendorsRelease() {
        return OrderActionsV2ComposeWidgetCoreKt.orderActionsV2WidgetFactory();
    }
}
