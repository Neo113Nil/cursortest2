package ru.ozon.app.android.composer.navigator.redirect;

import B0.C2454a;
import GZ.j;
import GZ.k;
import HZ.a;
import Sc.InterfaceC4008j;
import Sc.o;
import android.app.Application;
import android.net.Uri;
import i10.h;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.h;
import l10.InterfaceC7851b;
import l10.i;
import org.jetbrains.annotations.NotNull;
import pZ.e;
import pZ.g;
import ru.ozon.app.android.composer.ComposerNavigator;
import ru.ozon.app.android.composer.navigator.redirect.RedirectStrategy;
import ru.ozon.app.android.navigation.di.NavigationComponentApi;
import ru.ozon.app.android.utils.LazyUtilsKt;
import y00.AbstractC10819a;

@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u001f\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\nH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u001f\u0010\u0010\u001a\u00020\r2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\nH\u0002¢\u0006\u0004\b\u0010\u0010\u000fJ\u0017\u0010\u0011\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\nH\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u0015\u0010\u0014\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u0013¢\u0006\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0016R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0017R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u0018R\u001b\u0010\u001e\u001a\u00020\u00198BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u0014\u0010\"\u001a\u00020\u001f8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b \u0010!R\u0014\u0010&\u001a\u00020#8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b$\u0010%¨\u0006'"}, d2 = {"Lru/ozon/app/android/composer/navigator/redirect/ComposerRedirectHandler;", "", "Landroid/app/Application;", "application", "Lru/ozon/app/android/composer/ComposerNavigator;", "navigator", "Ll10/i;", "container", "<init>", "(Landroid/app/Application;Lru/ozon/app/android/composer/ComposerNavigator;Ll10/i;)V", "", "redirectKey", "deeplink", "", "refresh", "(Ljava/lang/String;Ljava/lang/String;)V", "redirect", "convertToDeeplink", "(Ljava/lang/String;)Ljava/lang/String;", "Ly00/a$e;", "handleRedirect", "(Ly00/a$e;)V", "Landroid/app/Application;", "Lru/ozon/app/android/composer/ComposerNavigator;", "Ll10/i;", "Lru/ozon/app/android/navigation/di/NavigationComponentApi;", "navigationDependencies$delegate", "LSc/j;", "getNavigationDependencies", "()Lru/ozon/app/android/navigation/di/NavigationComponentApi;", "navigationDependencies", "LHZ/a;", "getDeeplinkHandlersCache", "()LHZ/a;", "deeplinkHandlersCache", "LGZ/k;", "getRouteFactory", "()LGZ/k;", "routeFactory", "composer_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class ComposerRedirectHandler {

    @NotNull
    private final Application application;

    @NotNull
    private final i container;

    /* renamed from: navigationDependencies$delegate, reason: from kotlin metadata */
    @NotNull
    private final InterfaceC4008j navigationDependencies;

    @NotNull
    private final ComposerNavigator navigator;

    public ComposerRedirectHandler(@NotNull Application application, @NotNull ComposerNavigator navigator, @NotNull i container) {
        Intrinsics.checkNotNullParameter(application, "application");
        Intrinsics.checkNotNullParameter(navigator, "navigator");
        Intrinsics.checkNotNullParameter(container, "container");
        this.application = application;
        this.navigator = navigator;
        this.container = container;
        this.navigationDependencies = LazyUtilsKt.unsafeLazy(new ComposerRedirectHandler$navigationDependencies$2(this));
    }

    private final String convertToDeeplink(String deeplink) {
        if (Uri.parse(deeplink).getScheme() != null) {
            return deeplink;
        }
        String uri = new Uri.Builder().scheme("ozon").encodedAuthority(h.S(deeplink, "/")).build().toString();
        Intrinsics.checkNotNullExpressionValue(uri, "toString(...)");
        return uri;
    }

    private final a getDeeplinkHandlersCache() {
        return getNavigationDependencies().getDeeplinkHandlersCache();
    }

    private final NavigationComponentApi getNavigationDependencies() {
        return (NavigationComponentApi) this.navigationDependencies.getValue();
    }

    private final k getRouteFactory() {
        return getNavigationDependencies().getRouteFactory();
    }

    private final void redirect(String redirectKey, String deeplink) {
        this.navigator.navigate(new g(new e(deeplink, C2454a.b("redirectKey", redirectKey))), null);
    }

    private final void refresh(String redirectKey, String deeplink) {
        h.c d11 = this.container.J().r().b().l().d();
        if (d11 instanceof h.c.a) {
            ((h.c.a) d11).a(redirectKey);
        }
        InterfaceC7851b.a.a(this.container.M(), deeplink, null, null, null, 14);
    }

    public final void handleRedirect(@NotNull AbstractC10819a.e redirect) {
        Intrinsics.checkNotNullParameter(redirect, "redirect");
        String c11 = redirect.c();
        if (c11 == null) {
            c11 = "";
        }
        String convertToDeeplink = convertToDeeplink(redirect.b());
        String convertToDeeplink2 = convertToDeeplink(redirect.a());
        j b11 = k.b(getRouteFactory(), convertToDeeplink, null, 6);
        if (b11 == null) {
            redirect(c11, convertToDeeplink2);
            return;
        }
        IZ.a b12 = getDeeplinkHandlersCache().b(b11);
        if (!(b12 instanceof RedirectDeeplinkHandler)) {
            redirect(c11, convertToDeeplink2);
            return;
        }
        RedirectStrategy handleRedirect = ((RedirectDeeplinkHandler) b12).handleRedirect(convertToDeeplink, convertToDeeplink2);
        if (handleRedirect instanceof RedirectStrategy.Refresh) {
            refresh(c11, convertToDeeplink2);
        } else {
            if (!(handleRedirect instanceof RedirectStrategy.Navigate)) {
                throw new o();
            }
            redirect(c11, convertToDeeplink2);
        }
    }
}
