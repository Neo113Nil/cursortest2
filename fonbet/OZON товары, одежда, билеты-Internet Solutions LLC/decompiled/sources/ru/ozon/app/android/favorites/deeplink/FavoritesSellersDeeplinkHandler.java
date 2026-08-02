package ru.ozon.app.android.favorites.deeplink;

import GZ.j;
import IZ.a;
import J.d;
import Kk.C3531a;
import android.content.Context;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import pZ.f;
import ru.ozon.app.android.favorites.ui.deeplink.FavoritesDeeplinkHandlerDelegate;
import ru.ozon.app.android.utils.AppType;

@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u001b\u0010\f\u001a\u00020\u000b2\n\u0010\n\u001a\u00060\bj\u0002`\tH\u0016¢\u0006\u0004\b\f\u0010\rJ#\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000f\u001a\u00020\u000e2\n\u0010\n\u001a\u00060\bj\u0002`\tH\u0016¢\u0006\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0013R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0014¨\u0006\u0015"}, d2 = {"Lru/ozon/app/android/favorites/deeplink/FavoritesSellersDeeplinkHandler;", "LIZ/a;", "Lru/ozon/app/android/favorites/ui/deeplink/FavoritesDeeplinkHandlerDelegate;", "favoritesDeeplinkHandlerDelegate", "Lru/ozon/app/android/utils/AppType;", "appType", "<init>", "(Lru/ozon/app/android/favorites/ui/deeplink/FavoritesDeeplinkHandlerDelegate;Lru/ozon/app/android/utils/AppType;)V", "LGZ/j;", "Lru/ozon/app/android/navigation/Route;", "route", "", "canHandle", "(LGZ/j;)Z", "Landroid/content/Context;", "context", "LpZ/f;", "getDestination", "(Landroid/content/Context;LGZ/j;)LpZ/f;", "Lru/ozon/app/android/favorites/ui/deeplink/FavoritesDeeplinkHandlerDelegate;", "Lru/ozon/app/android/utils/AppType;", "favorites_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class FavoritesSellersDeeplinkHandler implements a {

    @NotNull
    private final AppType appType;

    @NotNull
    private final FavoritesDeeplinkHandlerDelegate favoritesDeeplinkHandlerDelegate;

    public FavoritesSellersDeeplinkHandler(@NotNull FavoritesDeeplinkHandlerDelegate favoritesDeeplinkHandlerDelegate, @NotNull AppType appType) {
        Intrinsics.checkNotNullParameter(favoritesDeeplinkHandlerDelegate, "favoritesDeeplinkHandlerDelegate");
        Intrinsics.checkNotNullParameter(appType, "appType");
        this.favoritesDeeplinkHandlerDelegate = favoritesDeeplinkHandlerDelegate;
        this.appType = appType;
    }

    @Override // IZ.a
    public boolean canHandle(@NotNull j route) {
        return d.d(route, "route", "my") && C3531a.c(route, "getPathSegments(...)", "favorites") && Kk.d.c(route, "getPathSegments(...)", 1, "sellers");
    }

    @Override // IZ.a
    @NotNull
    public f getDestination(@NotNull Context context, @NotNull j route) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(route, "route");
        return this.favoritesDeeplinkHandlerDelegate.getComposerTabFragmentDestination(route, new FavoritesSellersDeeplinkHandler$getDestination$1(this));
    }
}
