package ru.ozon.app.android.payment.feature.di;

import IZ.a;
import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.e0;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.payment.feature.deeplink.PaymentDeeplinkHandler;

@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\b\u0004\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H\u0001¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\t"}, d2 = {"Lru/ozon/app/android/payment/feature/di/PaymentNavigationModule;", "", "<init>", "()V", "", "LIZ/a;", "provideDeeplinkHandlersSet$payment_prodGoogleAllVendorsRelease", "()Ljava/util/Set;", "provideDeeplinkHandlersSet", "payment_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class PaymentNavigationModule {

    @NotNull
    public static final PaymentNavigationModule INSTANCE = new PaymentNavigationModule();

    private PaymentNavigationModule() {
    }

    @NotNull
    public final Set<a> provideDeeplinkHandlersSet$payment_prodGoogleAllVendorsRelease() {
        return e0.b(new PaymentDeeplinkHandler());
    }
}
