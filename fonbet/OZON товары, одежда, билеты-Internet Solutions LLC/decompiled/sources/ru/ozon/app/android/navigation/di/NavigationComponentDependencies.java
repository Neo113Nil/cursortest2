package ru.ozon.app.android.navigation.di;

import GZ.a;
import KZ.c;
import KZ.d;
import hi.InterfaceC6958a;
import kotlin.Metadata;
import nZ.C8475a;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.navigation.NativePageDomainsInteractor;
import yZ.InterfaceC10874a;

@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0006\u001a\u00020\u0005H&¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\bH&¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\f\u001a\u00020\u000bH&¢\u0006\u0004\b\f\u0010\rJ\u0015\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000eH&¢\u0006\u0004\b\u0010\u0010\u0011J\u0015\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u000eH&¢\u0006\u0004\b\u0013\u0010\u0014¨\u0006\u0015"}, d2 = {"Lru/ozon/app/android/navigation/di/NavigationComponentDependencies;", "Lhi/a;", "LnZ/a$c;", "getNavigationConfig", "()LnZ/a$c;", "Lru/ozon/app/android/navigation/NativePageDomainsInteractor;", "getNativePageDomainsInteractor", "()Lru/ozon/app/android/navigation/NativePageDomainsInteractor;", "LGZ/a;", "getCommonPageProvider", "()LGZ/a;", "LyZ/a;", "getCustomActivityNavigatorChecker", "()LyZ/a;", "", "LKZ/c;", "getGlobalDeeplinkInterceptors", "()[LKZ/c;", "LKZ/d;", "getGlobalDestinationInterceptors", "()[LKZ/d;", "navigation_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public interface NavigationComponentDependencies extends InterfaceC6958a {
    @NotNull
    a getCommonPageProvider();

    @NotNull
    InterfaceC10874a getCustomActivityNavigatorChecker();

    @NotNull
    c[] getGlobalDeeplinkInterceptors();

    @NotNull
    d[] getGlobalDestinationInterceptors();

    @NotNull
    NativePageDomainsInteractor getNativePageDomainsInteractor();

    @NotNull
    C8475a.c getNavigationConfig();
}
