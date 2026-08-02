package ru.ozon.app.android.partpayment.di;

import IZ.a;
import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.e0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.navigation.interceptors.AuthDestinationInterceptor;
import ru.ozon.app.android.partpayment.deeplink.PartPaymentContractDeeplinkHandler;
import ru.ozon.app.android.partpayment.deeplink.PartPaymentDeeplinkHandler;
import ru.ozon.app.android.partpayment.deeplink.PartPaymentLandingDeeplinkHandler;
import ru.ozon.app.android.partpayment.deeplink.PartPaymentNewLandingDeeplinkHandler;
import ru.ozon.app.android.partpayment.deeplink.PartPaymentScroingResultDeeplinkHandler;
import ru.ozon.app.android.partpayment.deeplink.PartPaymentUserInfoDeeplinkHandler;
import ru.ozon.app.android.partpayment.deeplink.SmsSignDeeplinkHandler;

@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001d\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lru/ozon/app/android/partpayment/di/HomeCreditNavigationModule;", "", "<init>", "()V", "Lru/ozon/app/android/navigation/interceptors/AuthDestinationInterceptor;", "authDestinationInterceptor", "", "LIZ/a;", "provideDeeplinkHandlersSet", "(Lru/ozon/app/android/navigation/interceptors/AuthDestinationInterceptor;)Ljava/util/Set;", "homecredit_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class HomeCreditNavigationModule {

    @NotNull
    public static final HomeCreditNavigationModule INSTANCE = new HomeCreditNavigationModule();

    private HomeCreditNavigationModule() {
    }

    @NotNull
    public static final Set<a> provideDeeplinkHandlersSet(@NotNull AuthDestinationInterceptor authDestinationInterceptor) {
        Intrinsics.checkNotNullParameter(authDestinationInterceptor, "authDestinationInterceptor");
        return e0.b(new PartPaymentDeeplinkHandler(authDestinationInterceptor), new PartPaymentLandingDeeplinkHandler(), new PartPaymentUserInfoDeeplinkHandler(authDestinationInterceptor), new PartPaymentScroingResultDeeplinkHandler(authDestinationInterceptor), new PartPaymentContractDeeplinkHandler(), new SmsSignDeeplinkHandler(authDestinationInterceptor), new PartPaymentNewLandingDeeplinkHandler(authDestinationInterceptor));
    }
}
