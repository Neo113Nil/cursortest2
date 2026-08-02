package ru.ozon.app.android.navigation;

import GZ.c;
import GZ.j;
import GZ.k;
import kotlin.Metadata;
import kotlin.collections.U;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.bank.navigation.BankGlobalDeeplinkInterceptor;
import ru.ozon.app.android.deeplinks.KeepActivityHandler;

@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\u000b\u0010\fR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\rR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u000e¨\u0006\u000f"}, d2 = {"Lru/ozon/app/android/navigation/KeepActivityHandlerImpl;", "Lru/ozon/app/android/deeplinks/KeepActivityHandler;", "Lru/ozon/app/android/bank/navigation/BankGlobalDeeplinkInterceptor;", "bankGlobalDeeplinkInterceptor", "LGZ/k;", "routeFactory", "<init>", "(Lru/ozon/app/android/bank/navigation/BankGlobalDeeplinkInterceptor;LGZ/k;)V", "", "deeplink", "", "shouldKeepActivityOnExternalDeeplink", "(Ljava/lang/String;)Z", "Lru/ozon/app/android/bank/navigation/BankGlobalDeeplinkInterceptor;", "LGZ/k;", "main_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class KeepActivityHandlerImpl implements KeepActivityHandler {

    @NotNull
    private final BankGlobalDeeplinkInterceptor bankGlobalDeeplinkInterceptor;

    @NotNull
    private final k routeFactory;

    public KeepActivityHandlerImpl(@NotNull BankGlobalDeeplinkInterceptor bankGlobalDeeplinkInterceptor, @NotNull k routeFactory) {
        Intrinsics.checkNotNullParameter(bankGlobalDeeplinkInterceptor, "bankGlobalDeeplinkInterceptor");
        Intrinsics.checkNotNullParameter(routeFactory, "routeFactory");
        this.bankGlobalDeeplinkInterceptor = bankGlobalDeeplinkInterceptor;
        this.routeFactory = routeFactory;
    }

    @Override // ru.ozon.app.android.deeplinks.KeepActivityHandler
    public boolean shouldKeepActivityOnExternalDeeplink(@NotNull String deeplink) {
        Intrinsics.checkNotNullParameter(deeplink, "deeplink");
        j a11 = this.routeFactory.a(deeplink, U.c(), c.EXTERNAL);
        if (a11 == null) {
            return false;
        }
        return this.bankGlobalDeeplinkInterceptor.canIntercept(a11);
    }
}
