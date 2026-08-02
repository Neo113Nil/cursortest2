package ru.ozon.app.android.geo.deeplink;

import GZ.j;
import J.d;
import Kk.C3531a;
import Kk.c;
import android.content.Context;
import android.net.Uri;
import i10.h;
import kotlin.Metadata;
import kotlin.collections.e0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import pZ.f;
import ru.ozon.app.android.checkoutgeo.checkout.configurators.ConfirmDeleteResultConfigurator;
import ru.ozon.app.android.composer.navigations.destinations.BottomSheetComposerFragmentDestination;
import ru.ozon.app.android.composer.navigator.redirect.RedirectDeeplinkHandler;
import ru.ozon.app.android.composer.navigator.redirect.RedirectStrategy;
import ru.ozon.app.android.composer.universalscreen.view.BackgroundColorAttr;
import ru.ozon.app.android.composer.universalscreen.view.ComposerFragment;
import ru.ozon.app.android.composer.universalscreen.view.ComposerScreenConfig;
import ru.ozon.app.android.geo.common.configurators.AddressBookStateConfigurator;
import ru.ozon.app.android.navigation.miniapp.MiniAppExtKt;
import ru.ozon.uni.R$attr;
import uZ.C9992d;

@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u0000 \u00152\u00020\u0001:\u0001\u0015B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u001b\u0010\b\u001a\u00020\u00072\n\u0010\u0006\u001a\u00060\u0004j\u0002`\u0005H\u0016¢\u0006\u0004\b\b\u0010\tJ#\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\n2\n\u0010\u0006\u001a\u00060\u0004j\u0002`\u0005H\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u001f\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0011\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0013\u0010\u0014¨\u0006\u0016"}, d2 = {"Lru/ozon/app/android/geo/deeplink/AddressBookDeeplinkHandler;", "Lru/ozon/app/android/composer/navigator/redirect/RedirectDeeplinkHandler;", "<init>", "()V", "LGZ/j;", "Lru/ozon/app/android/navigation/Route;", "route", "", "canHandle", "(LGZ/j;)Z", "Landroid/content/Context;", "context", "LpZ/f;", "getDestination", "(Landroid/content/Context;LGZ/j;)LpZ/f;", "", "origin", "deeplink", "Lru/ozon/app/android/composer/navigator/redirect/RedirectStrategy;", "handleRedirect", "(Ljava/lang/String;Ljava/lang/String;)Lru/ozon/app/android/composer/navigator/redirect/RedirectStrategy;", "Companion", "geo_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class AddressBookDeeplinkHandler implements RedirectDeeplinkHandler {
    @Override // IZ.a
    public boolean canHandle(@NotNull j route) {
        if (d.d(route, "route", "modal")) {
            return C3531a.c(route, "getPathSegments(...)", "addressbook") || C3531a.c(route, "getPathSegments(...)", "returnsAddressbook") || C3531a.c(route, "getPathSegments(...)", "sisAddressbook");
        }
        return false;
    }

    @Override // IZ.a
    @NotNull
    public f getDestination(@NotNull Context context, @NotNull j route) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(route, "route");
        String str = null;
        return new BottomSheetComposerFragmentDestination(c.c(route, "toString(...)"), new ComposerScreenConfig(new h.c.a(c.c(route, "toString(...)"), str, str, 14), null, false, new ComposerScreenConfig.BottomSheetConfig(ComposerFragment.DisplayMode.BOTTOM_SHEET_WRAP, false, false, null, 0, false, true, false, false, false, false, 1982, null), false, false, false, false, null, false, false, false, e0.h(ConfirmDeleteResultConfigurator.class), e0.e(AddressBookStateConfigurator.class), null, BackgroundColorAttr.m672boximpl(BackgroundColorAttr.m673constructorimpl(R$attr.layerFloor1)), false, null, null, null, false, false, null, null, 16732150, null), MiniAppExtKt.isExpress(context) ? C9992d.b.c.f100438a : C9992d.b.a.f100436a, null, null, null, 56, null);
    }

    @Override // ru.ozon.app.android.composer.navigator.redirect.RedirectDeeplinkHandler
    @NotNull
    public RedirectStrategy handleRedirect(@NotNull String origin, @NotNull String deeplink) {
        Intrinsics.checkNotNullParameter(origin, "origin");
        Intrinsics.checkNotNullParameter(deeplink, "deeplink");
        return canHandle(new j(Uri.parse(deeplink), Uri.parse(origin))) ? RedirectStrategy.Refresh.INSTANCE : RedirectStrategy.Navigate.INSTANCE;
    }
}
