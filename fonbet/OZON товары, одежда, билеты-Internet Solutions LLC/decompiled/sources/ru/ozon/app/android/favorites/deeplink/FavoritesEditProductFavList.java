package ru.ozon.app.android.favorites.deeplink;

import B0.C2454a;
import GZ.j;
import IZ.a;
import android.content.Context;
import android.net.Uri;
import i10.h;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import pZ.f;
import qZ.C9010b;
import ru.ozon.app.android.composer.universalscreen.view.ComposerScreenConfig;
import ru.ozon.app.android.favorites.domain.flags.FavoritesWishlistsEnabledFlag;
import ru.ozon.app.android.favorites.ui.R$string;
import ru.ozon.app.android.favorites.ui.deeplink.FavoritesDeeplinkHandlerDelegate;
import ru.ozon.app.android.network.abtool.FeatureChecker;
import ru.ozon.app.android.uikit.text.StringProvider;
import ru.ozon.uni.R$color;

@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\u000e\u001a\u00020\rH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u001b\u0010\u0014\u001a\u00020\u00132\n\u0010\u0012\u001a\u00060\u0010j\u0002`\u0011H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J#\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u0017\u001a\u00020\u00162\n\u0010\u0012\u001a\u00060\u0010j\u0002`\u0011H\u0016¢\u0006\u0004\b\u0019\u0010\u001aR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u001bR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u001c¨\u0006\u001d"}, d2 = {"Lru/ozon/app/android/favorites/deeplink/FavoritesEditProductFavList;", "LIZ/a;", "Lru/ozon/app/android/favorites/ui/deeplink/FavoritesDeeplinkHandlerDelegate;", "favoritesDeeplinkHandlerDelegate", "Lru/ozon/app/android/network/abtool/FeatureChecker;", "featureChecker", "<init>", "(Lru/ozon/app/android/favorites/ui/deeplink/FavoritesDeeplinkHandlerDelegate;Lru/ozon/app/android/network/abtool/FeatureChecker;)V", "", "deeplink", "Lru/ozon/app/android/composer/universalscreen/view/ComposerScreenConfig;", "buildComposerScreenConfig", "(Ljava/lang/String;)Lru/ozon/app/android/composer/universalscreen/view/ComposerScreenConfig;", "LqZ/b;", "buildFlowConfig", "()LqZ/b;", "LGZ/j;", "Lru/ozon/app/android/navigation/Route;", "route", "", "canHandle", "(LGZ/j;)Z", "Landroid/content/Context;", "context", "LpZ/f;", "getDestination", "(Landroid/content/Context;LGZ/j;)LpZ/f;", "Lru/ozon/app/android/favorites/ui/deeplink/FavoritesDeeplinkHandlerDelegate;", "Lru/ozon/app/android/network/abtool/FeatureChecker;", "favorites_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class FavoritesEditProductFavList implements a {

    @NotNull
    private final FavoritesDeeplinkHandlerDelegate favoritesDeeplinkHandlerDelegate;

    @NotNull
    private final FeatureChecker featureChecker;

    public FavoritesEditProductFavList(@NotNull FavoritesDeeplinkHandlerDelegate favoritesDeeplinkHandlerDelegate, @NotNull FeatureChecker featureChecker) {
        Intrinsics.checkNotNullParameter(favoritesDeeplinkHandlerDelegate, "favoritesDeeplinkHandlerDelegate");
        Intrinsics.checkNotNullParameter(featureChecker, "featureChecker");
        this.favoritesDeeplinkHandlerDelegate = favoritesDeeplinkHandlerDelegate;
        this.featureChecker = featureChecker;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final ComposerScreenConfig buildComposerScreenConfig(String deeplink) {
        return new ComposerScreenConfig(new h.c.a(deeplink, (String) null, (String) null, 14), new ComposerScreenConfig.ToolbarConfig(new ComposerScreenConfig.ToolbarConfig.DefaultState(0, false, this.featureChecker.isEnabled(FavoritesWishlistsEnabledFlag.INSTANCE) ? null : StringProvider.getString(R$string.favorites_pick_products_android), null, null, null, 59, null), 0, 2, null), false, null, false, false, false, false, null, false, false, false, null, null, Integer.valueOf(R$color.layer_floor_1), null, false, null, null, null, false, false, null, null, 16760764, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final C9010b buildFlowConfig() {
        return new C9010b(null, 11);
    }

    @Override // IZ.a
    public boolean canHandle(@NotNull j route) {
        Intrinsics.checkNotNullParameter(route, "route");
        Uri b11 = route.b();
        if (Intrinsics.d(b11.getAuthority(), "my")) {
            List<String> pathSegments = b11.getPathSegments();
            Intrinsics.checkNotNullExpressionValue(pathSegments, "getPathSegments(...)");
            if (pathSegments.size() >= 2 && C2454a.h(b11, "favorites", 0) && C2454a.h(b11, "edit", 1)) {
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
        return this.favoritesDeeplinkHandlerDelegate.getComposerFlowDestination(route, new FavoritesEditProductFavList$getDestination$1(this), new FavoritesEditProductFavList$getDestination$2(this));
    }
}
