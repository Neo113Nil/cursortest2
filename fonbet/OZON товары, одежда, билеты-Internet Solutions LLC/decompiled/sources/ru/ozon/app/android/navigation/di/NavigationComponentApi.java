package ru.ozon.app.android.navigation.di;

import EZ.h;
import GZ.g;
import GZ.k;
import HZ.a;
import HZ.d;
import HZ.e;
import hi.InterfaceC6958a;
import kotlin.Metadata;
import nZ.C8475a;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.navigation.NativePageDomainsInteractor;
import ru.ozon.app.android.navigation.miniapp.CurrentMiniAppHolder;

@Metadata(d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0006\u001a\u00020\u0005H&¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\bH&¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\f\u001a\u00020\u000bH&¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000f\u001a\u00020\u000eH&¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0012\u001a\u00020\u0011H&¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0015\u001a\u00020\u0014H&¢\u0006\u0004\b\u0015\u0010\u0016J\u000f\u0010\u0018\u001a\u00020\u0017H&¢\u0006\u0004\b\u0018\u0010\u0019J\u000f\u0010\u001b\u001a\u00020\u001aH&¢\u0006\u0004\b\u001b\u0010\u001cJ\u000f\u0010\u001e\u001a\u00020\u001dH&¢\u0006\u0004\b\u001e\u0010\u001f¨\u0006 "}, d2 = {"Lru/ozon/app/android/navigation/di/NavigationComponentApi;", "Lhi/a;", "LnZ/a;", "getNavigation", "()LnZ/a;", "LEZ/h;", "getNavigatorHolder", "()LEZ/h;", "LGZ/g;", "getOzonRouter", "()LGZ/g;", "Lru/ozon/app/android/navigation/NativePageDomainsInteractor;", "getNativePageDomainsInteractor", "()Lru/ozon/app/android/navigation/NativePageDomainsInteractor;", "LHZ/a;", "getDeeplinkHandlersCache", "()LHZ/a;", "LHZ/e;", "getDeeplinkPageResolver", "()LHZ/e;", "LHZ/d;", "getDeeplinkMiniAppMapper", "()LHZ/d;", "LGZ/k;", "getRouteFactory", "()LGZ/k;", "LBZ/e;", "getMiniAppConfigHolder", "()LBZ/e;", "Lru/ozon/app/android/navigation/miniapp/CurrentMiniAppHolder;", "getCurrentMiniAppHolder", "()Lru/ozon/app/android/navigation/miniapp/CurrentMiniAppHolder;", "navigation_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public interface NavigationComponentApi extends InterfaceC6958a {
    @NotNull
    CurrentMiniAppHolder getCurrentMiniAppHolder();

    @NotNull
    a getDeeplinkHandlersCache();

    @NotNull
    d getDeeplinkMiniAppMapper();

    @NotNull
    e getDeeplinkPageResolver();

    @NotNull
    BZ.e getMiniAppConfigHolder();

    @NotNull
    NativePageDomainsInteractor getNativePageDomainsInteractor();

    @NotNull
    C8475a getNavigation();

    @NotNull
    h getNavigatorHolder();

    @NotNull
    g getOzonRouter();

    @NotNull
    k getRouteFactory();
}
