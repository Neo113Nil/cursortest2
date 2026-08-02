package ru.ozon.app.android.bank.navigation;

import GZ.j;
import KZ.b;
import android.content.Context;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import pZ.f;
import ru.ozon.app.android.navigation.interceptors.AuthDestinationInterceptor;

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J-\u0010\r\u001a\u0004\u0018\u00010\b2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\n\u0010\f\u001a\u00060\nj\u0002`\u000bH\u0016¢\u0006\u0004\b\r\u0010\u000eR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u000f¨\u0006\u0010"}, d2 = {"Lru/ozon/app/android/bank/navigation/BankAuthDestinationInterceptor;", "LKZ/b;", "Lru/ozon/app/android/navigation/interceptors/AuthDestinationInterceptor;", "authDestinationInterceptor", "<init>", "(Lru/ozon/app/android/navigation/interceptors/AuthDestinationInterceptor;)V", "Landroid/content/Context;", "context", "LpZ/f;", "destination", "LGZ/j;", "Lru/ozon/app/android/navigation/Route;", "route", "intercept", "(Landroid/content/Context;LpZ/f;LGZ/j;)LpZ/f;", "Lru/ozon/app/android/navigation/interceptors/AuthDestinationInterceptor;", "ozonbank_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class BankAuthDestinationInterceptor implements b {

    @NotNull
    private final AuthDestinationInterceptor authDestinationInterceptor;

    public BankAuthDestinationInterceptor(@NotNull AuthDestinationInterceptor authDestinationInterceptor) {
        Intrinsics.checkNotNullParameter(authDestinationInterceptor, "authDestinationInterceptor");
        this.authDestinationInterceptor = authDestinationInterceptor;
    }

    @Override // KZ.b
    public f intercept(@NotNull Context context, @NotNull f destination, @NotNull j route) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(destination, "destination");
        Intrinsics.checkNotNullParameter(route, "route");
        return route.b().getPathSegments().contains("auth") ? this.authDestinationInterceptor.intercept(context, destination, route) : destination;
    }
}
