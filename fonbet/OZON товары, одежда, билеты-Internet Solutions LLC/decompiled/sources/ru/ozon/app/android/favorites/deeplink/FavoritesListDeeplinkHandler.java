package ru.ozon.app.android.favorites.deeplink;

import B0.C2454a;
import GZ.j;
import IZ.a;
import Kk.C3532b;
import android.content.Context;
import android.net.Uri;
import i10.h;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C7705l;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import pZ.f;
import ru.ozon.app.android.composer.universalscreen.view.ComposerScreenConfig;
import ru.ozon.app.android.favorites.ui.configurators.CreateFavoritesListConfigurator;
import ru.ozon.app.android.favorites.ui.configurators.CreateShoppingListConfigurator;
import ru.ozon.app.android.favorites.ui.configurators.DeleteFavoritesListConfigurator;
import ru.ozon.app.android.favorites.ui.configurators.EditListFavoriteConfigurator;
import ru.ozon.app.android.favorites.ui.configurators.RemoveFavoritesListConfigurator;
import ru.ozon.app.android.favorites.ui.configurators.RenameFavoritesListConfigurator;
import ru.ozon.app.android.favorites.ui.deeplink.FavoritesDeeplinkHandlerDelegate;
import ru.ozon.app.android.utils.AppType;
import ru.ozon.uni.R$color;

@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u001b\u0010\u0011\u001a\u00020\u00102\n\u0010\u000f\u001a\u00060\rj\u0002`\u000eH\u0016¢\u0006\u0004\b\u0011\u0010\u0012J#\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0014\u001a\u00020\u00132\n\u0010\u000f\u001a\u00060\rj\u0002`\u000eH\u0016¢\u0006\u0004\b\u0016\u0010\u0017R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0018R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0019¨\u0006\u001a"}, d2 = {"Lru/ozon/app/android/favorites/deeplink/FavoritesListDeeplinkHandler;", "LIZ/a;", "Lru/ozon/app/android/favorites/ui/deeplink/FavoritesDeeplinkHandlerDelegate;", "favoritesDeeplinkHandlerDelegate", "Lru/ozon/app/android/utils/AppType;", "appType", "<init>", "(Lru/ozon/app/android/favorites/ui/deeplink/FavoritesDeeplinkHandlerDelegate;Lru/ozon/app/android/utils/AppType;)V", "", "deeplink", "Lru/ozon/app/android/composer/universalscreen/view/ComposerScreenConfig;", "buildComposerScreenConfig", "(Ljava/lang/String;)Lru/ozon/app/android/composer/universalscreen/view/ComposerScreenConfig;", "LGZ/j;", "Lru/ozon/app/android/navigation/Route;", "route", "", "canHandle", "(LGZ/j;)Z", "Landroid/content/Context;", "context", "LpZ/f;", "getDestination", "(Landroid/content/Context;LGZ/j;)LpZ/f;", "Lru/ozon/app/android/favorites/ui/deeplink/FavoritesDeeplinkHandlerDelegate;", "Lru/ozon/app/android/utils/AppType;", "favorites_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class FavoritesListDeeplinkHandler implements a {

    @NotNull
    private final AppType appType;

    @NotNull
    private final FavoritesDeeplinkHandlerDelegate favoritesDeeplinkHandlerDelegate;

    public FavoritesListDeeplinkHandler(@NotNull FavoritesDeeplinkHandlerDelegate favoritesDeeplinkHandlerDelegate, @NotNull AppType appType) {
        Intrinsics.checkNotNullParameter(favoritesDeeplinkHandlerDelegate, "favoritesDeeplinkHandlerDelegate");
        Intrinsics.checkNotNullParameter(appType, "appType");
        this.favoritesDeeplinkHandlerDelegate = favoritesDeeplinkHandlerDelegate;
        this.appType = appType;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final ComposerScreenConfig buildComposerScreenConfig(String deeplink) {
        h.c.a aVar = new h.c.a(deeplink, (String) null, (String) null, 14);
        Class[] elements = {CreateFavoritesListConfigurator.class, CreateShoppingListConfigurator.class, RemoveFavoritesListConfigurator.class, DeleteFavoritesListConfigurator.class, RenameFavoritesListConfigurator.class, EditListFavoriteConfigurator.class};
        Intrinsics.checkNotNullParameter(elements, "elements");
        return new ComposerScreenConfig(aVar, new ComposerScreenConfig.ToolbarConfig(new ComposerScreenConfig.ToolbarConfig.DefaultState(0, false, null, null, this.appType == AppType.SELECT ? Integer.valueOf(R$color.bg_dark_key) : null, null, 47, null), 0, 2, null), false, null, false, false, false, false, null, false, false, false, C7705l.j0(elements), null, null, null, false, null, null, null, false, false, null, null, 16773116, null);
    }

    @Override // IZ.a
    public boolean canHandle(@NotNull j route) {
        Intrinsics.checkNotNullParameter(route, "route");
        Uri b11 = route.b();
        boolean z11 = Intrinsics.d(b11.getAuthority(), "my") && C3532b.g(b11, "getPathSegments(...)", "favorites");
        List<String> pathSegments = b11.getPathSegments();
        Intrinsics.checkNotNullExpressionValue(pathSegments, "getPathSegments(...)");
        boolean z12 = pathSegments.size() == 2 && C2454a.h(b11, "list", 1);
        List<String> pathSegments2 = b11.getPathSegments();
        Intrinsics.checkNotNullExpressionValue(pathSegments2, "getPathSegments(...)");
        return z11 && (z12 || (pathSegments2.size() == 1 && b11.getQueryParameterNames().contains("category")));
    }

    @Override // IZ.a
    @NotNull
    public f getDestination(@NotNull Context context, @NotNull j route) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(route, "route");
        return this.favoritesDeeplinkHandlerDelegate.getComposerTabFragmentDestination(route, new FavoritesListDeeplinkHandler$getDestination$1(this));
    }
}
