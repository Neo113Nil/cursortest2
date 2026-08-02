package ru.ozon.app.android.favorites.deeplink;

import De.C2860c;
import GZ.j;
import IZ.a;
import J.d;
import Kk.C3531a;
import android.content.Context;
import android.net.Uri;
import i10.h;
import kotlin.Metadata;
import kotlin.collections.C7705l;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import pZ.f;
import ru.ozon.app.android.composer.initialwidgets.EmptyInitialWidgetProvider;
import ru.ozon.app.android.composer.universalscreen.view.ComposerScreenConfig;
import ru.ozon.app.android.favorites.configurators.CreateFavoritesListAsyncConfigurator;
import ru.ozon.app.android.favorites.configurators.CreateShoppingListAsyncConfigurator;
import ru.ozon.app.android.favorites.configurators.DeleteFavoritesListAsyncConfigurator;
import ru.ozon.app.android.favorites.configurators.EditListFavoriteAsyncConfigurator;
import ru.ozon.app.android.favorites.configurators.PinStatusFavoritesListAsyncConfigurator;
import ru.ozon.app.android.favorites.configurators.RemoveFromFavoritesListAsyncConfigurator;
import ru.ozon.app.android.favorites.configurators.RenameFavoritesListAsyncConfigurator;
import ru.ozon.app.android.favorites.ui.configurators.RemoveFavoritesListConfigurator;
import ru.ozon.app.android.favorites.ui.configurators.UpdateByFavoritesConfigurator;
import ru.ozon.app.android.favorites.ui.deeplink.FavoritesDeeplinkHandlerDelegate;
import ru.ozon.app.android.navigation.miniapp.MiniAppExtKt;

@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001f\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u001b\u0010\u0010\u001a\u00020\b2\n\u0010\u000f\u001a\u00060\rj\u0002`\u000eH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J#\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0013\u001a\u00020\u00122\n\u0010\u000f\u001a\u00060\rj\u0002`\u000eH\u0016¢\u0006\u0004\b\u0015\u0010\u0016R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0017¨\u0006\u0018"}, d2 = {"Lru/ozon/app/android/favorites/deeplink/FavoritesDeeplinkHandler;", "LIZ/a;", "Lru/ozon/app/android/favorites/ui/deeplink/FavoritesDeeplinkHandlerDelegate;", "favoritesDeeplinkHandlerDelegate", "<init>", "(Lru/ozon/app/android/favorites/ui/deeplink/FavoritesDeeplinkHandlerDelegate;)V", "", "deeplink", "", "hideToolbar", "Lru/ozon/app/android/composer/universalscreen/view/ComposerScreenConfig;", "buildComposerScreenConfig", "(Ljava/lang/String;Z)Lru/ozon/app/android/composer/universalscreen/view/ComposerScreenConfig;", "LGZ/j;", "Lru/ozon/app/android/navigation/Route;", "route", "canHandle", "(LGZ/j;)Z", "Landroid/content/Context;", "context", "LpZ/f;", "getDestination", "(Landroid/content/Context;LGZ/j;)LpZ/f;", "Lru/ozon/app/android/favorites/ui/deeplink/FavoritesDeeplinkHandlerDelegate;", "favorites_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class FavoritesDeeplinkHandler implements a {

    @NotNull
    private final FavoritesDeeplinkHandlerDelegate favoritesDeeplinkHandlerDelegate;

    public FavoritesDeeplinkHandler(@NotNull FavoritesDeeplinkHandlerDelegate favoritesDeeplinkHandlerDelegate) {
        Intrinsics.checkNotNullParameter(favoritesDeeplinkHandlerDelegate, "favoritesDeeplinkHandlerDelegate");
        this.favoritesDeeplinkHandlerDelegate = favoritesDeeplinkHandlerDelegate;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final ComposerScreenConfig buildComposerScreenConfig(String deeplink, boolean hideToolbar) {
        h.c.a aVar = new h.c.a(deeplink, (String) null, (String) null, 14);
        Class[] elements = {CreateShoppingListAsyncConfigurator.class, PinStatusFavoritesListAsyncConfigurator.class, DeleteFavoritesListAsyncConfigurator.class, CreateFavoritesListAsyncConfigurator.class, RenameFavoritesListAsyncConfigurator.class, RemoveFavoritesListConfigurator.class, RemoveFromFavoritesListAsyncConfigurator.class, UpdateByFavoritesConfigurator.class, EditListFavoriteAsyncConfigurator.class};
        Intrinsics.checkNotNullParameter(elements, "elements");
        return new ComposerScreenConfig(aVar, MiniAppExtKt.isExpress(Uri.parse(deeplink)) ? new ComposerScreenConfig.ToolbarConfig(new ComposerScreenConfig.ToolbarConfig.DefaultState(0, true, null, null, null, null, 61, null), 0, 2, null) : hideToolbar ? new ComposerScreenConfig.ToolbarConfig(null, 0, 2, null) : new ComposerScreenConfig.ToolbarConfig(null, 0, 3, null), false, null, true, false, false, false, null, false, false, false, C7705l.j0(elements), null, null, null, false, null, null, null, false, false, null, EmptyInitialWidgetProvider.class, 8384492, null);
    }

    @Override // IZ.a
    public boolean canHandle(@NotNull j route) {
        return d.d(route, "route", "favorites") || (Lh.a.f(route, "my") && (C2860c.c(route, "getPathSegments(...)").size() == 1) && C3531a.c(route, "getPathSegments(...)", "favorites") && !route.b().getQueryParameterNames().contains("category"));
    }

    @Override // IZ.a
    @NotNull
    public f getDestination(@NotNull Context context, @NotNull j route) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(route, "route");
        return this.favoritesDeeplinkHandlerDelegate.getComposerTabFragmentDestination(route, new FavoritesDeeplinkHandler$getDestination$1(this, route));
    }
}
