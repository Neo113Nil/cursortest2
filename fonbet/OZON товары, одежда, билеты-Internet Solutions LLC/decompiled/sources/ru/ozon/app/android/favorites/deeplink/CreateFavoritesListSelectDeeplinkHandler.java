package ru.ozon.app.android.favorites.deeplink;

import B0.C2454a;
import GZ.j;
import IZ.a;
import android.content.Context;
import android.net.Uri;
import i10.h;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.e0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import pZ.f;
import ru.ozon.app.android.composer.universalscreen.view.ComposerScreenConfig;
import ru.ozon.app.android.favorites.ui.R$string;
import ru.ozon.app.android.favorites.ui.configurators.CreateShoppingListConfigurator;
import ru.ozon.app.android.favorites.ui.deeplink.FavoritesDeeplinkHandlerDelegate;
import ru.ozon.app.android.uikit.text.StringProvider;
import ru.ozon.uni.R$color;

@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\t\u0010\nJ\u001b\u0010\u000f\u001a\u00020\u000e2\n\u0010\r\u001a\u00060\u000bj\u0002`\fH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J#\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0012\u001a\u00020\u00112\n\u0010\r\u001a\u00060\u000bj\u0002`\fH\u0016¢\u0006\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0016¨\u0006\u0017"}, d2 = {"Lru/ozon/app/android/favorites/deeplink/CreateFavoritesListSelectDeeplinkHandler;", "LIZ/a;", "Lru/ozon/app/android/favorites/ui/deeplink/FavoritesDeeplinkHandlerDelegate;", "favoritesDeeplinkHandlerDelegate", "<init>", "(Lru/ozon/app/android/favorites/ui/deeplink/FavoritesDeeplinkHandlerDelegate;)V", "", "deeplink", "Lru/ozon/app/android/composer/universalscreen/view/ComposerScreenConfig;", "buildComposerScreenConfig", "(Ljava/lang/String;)Lru/ozon/app/android/composer/universalscreen/view/ComposerScreenConfig;", "LGZ/j;", "Lru/ozon/app/android/navigation/Route;", "route", "", "canHandle", "(LGZ/j;)Z", "Landroid/content/Context;", "context", "LpZ/f;", "getDestination", "(Landroid/content/Context;LGZ/j;)LpZ/f;", "Lru/ozon/app/android/favorites/ui/deeplink/FavoritesDeeplinkHandlerDelegate;", "favorites_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class CreateFavoritesListSelectDeeplinkHandler implements a {

    @NotNull
    private final FavoritesDeeplinkHandlerDelegate favoritesDeeplinkHandlerDelegate;

    public CreateFavoritesListSelectDeeplinkHandler(@NotNull FavoritesDeeplinkHandlerDelegate favoritesDeeplinkHandlerDelegate) {
        Intrinsics.checkNotNullParameter(favoritesDeeplinkHandlerDelegate, "favoritesDeeplinkHandlerDelegate");
        this.favoritesDeeplinkHandlerDelegate = favoritesDeeplinkHandlerDelegate;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final ComposerScreenConfig buildComposerScreenConfig(String deeplink) {
        return new ComposerScreenConfig(new h.c.a(deeplink, (String) null, (String) null, 14), new ComposerScreenConfig.ToolbarConfig(new ComposerScreenConfig.ToolbarConfig.DefaultState(0, false, StringProvider.getString(R$string.favorites_pick_products_android), null, null, null, 59, null), 0, 2, null), false, null, false, false, false, false, null, false, false, false, e0.h(CreateShoppingListConfigurator.class), null, Integer.valueOf(R$color.layer_floor_1), null, false, null, null, null, false, false, null, null, 16756668, null);
    }

    @Override // IZ.a
    public boolean canHandle(@NotNull j route) {
        Intrinsics.checkNotNullParameter(route, "route");
        Uri b11 = route.b();
        if (Intrinsics.d(b11.getAuthority(), "my")) {
            List<String> pathSegments = b11.getPathSegments();
            Intrinsics.checkNotNullExpressionValue(pathSegments, "getPathSegments(...)");
            if (pathSegments.size() == 3 && C2454a.h(b11, "favorites", 0) && C2454a.h(b11, "create", 1) && C2454a.h(b11, "select", 2)) {
                return true;
            }
        }
        return false;
    }

    @Override // IZ.a
    @NotNull
    public f getDestination(@NotNull Context context, @NotNull j route) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(route, "route");
        return this.favoritesDeeplinkHandlerDelegate.getComposerFlowDestination(route, new CreateFavoritesListSelectDeeplinkHandler$getDestination$1(this), CreateFavoritesListSelectDeeplinkHandler$getDestination$2.INSTANCE);
    }
}
