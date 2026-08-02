package ru.ozon.app.android.favorites.domain.actionhandlers;

import AF.d;
import Bc.h;
import Bc.l;
import Bc.r;
import Fn.C3055d;
import Fn.C3056e;
import HC.a;
import io.reactivex.y;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.favorites.data.service.ChangeFavoriteAnalyticsData;
import ru.ozon.app.android.favorites.data.service.FavoritesServiceProvider;
import ru.ozon.app.android.favorites.data.utils.AnalyticRefs;
import ru.ozon.app.android.favorites.domain.favoritemanager.FavoriteManager;
import ru.ozon.app.android.favorites.domain.utils.ActionHandlersUtilsKt;
import ru.ozon.uni.atoms.af.AtomAction;

@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u0019\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J#\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\f2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\u000e\u0010\u000fJ#\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\r0\f2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\u0010\u0010\u000fR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0011R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0012¨\u0006\u0013"}, d2 = {"Lru/ozon/app/android/favorites/domain/actionhandlers/FavoriteComposerActionExecutor;", "", "Lru/ozon/app/android/favorites/data/service/FavoritesServiceProvider;", "favoritesServiceProvider", "Lru/ozon/app/android/favorites/domain/favoritemanager/FavoriteManager;", "favoriteManager", "<init>", "(Lru/ozon/app/android/favorites/data/service/FavoritesServiceProvider;Lru/ozon/app/android/favorites/domain/favoritemanager/FavoriteManager;)V", "Lru/ozon/uni/atoms/af/AtomAction$ComposerAction;", "action", "Lru/ozon/app/android/favorites/data/utils/AnalyticRefs;", "analyticRefs", "Lio/reactivex/y;", "", "addToFavorite", "(Lru/ozon/uni/atoms/af/AtomAction$ComposerAction;Lru/ozon/app/android/favorites/data/utils/AnalyticRefs;)Lio/reactivex/y;", "removeFromFavorites", "Lru/ozon/app/android/favorites/data/service/FavoritesServiceProvider;", "Lru/ozon/app/android/favorites/domain/favoritemanager/FavoriteManager;", "favorites_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class FavoriteComposerActionExecutor {

    @NotNull
    private final FavoriteManager favoriteManager;

    @NotNull
    private final FavoritesServiceProvider favoritesServiceProvider;

    public FavoriteComposerActionExecutor(@NotNull FavoritesServiceProvider favoritesServiceProvider, @NotNull FavoriteManager favoriteManager) {
        Intrinsics.checkNotNullParameter(favoritesServiceProvider, "favoritesServiceProvider");
        Intrinsics.checkNotNullParameter(favoriteManager, "favoriteManager");
        this.favoritesServiceProvider = favoritesServiceProvider;
        this.favoriteManager = favoriteManager;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Long addToFavorite$lambda$0(Function1 function1, Object p02) {
        Intrinsics.checkNotNullParameter(p02, "p0");
        return (Long) function1.invoke(p02);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Long removeFromFavorites$lambda$2(Function1 function1, Object p02) {
        Intrinsics.checkNotNullParameter(p02, "p0");
        return (Long) function1.invoke(p02);
    }

    @NotNull
    public final y<Long> addToFavorite(@NotNull AtomAction.ComposerAction action, @NotNull AnalyticRefs analyticRefs) {
        Intrinsics.checkNotNullParameter(action, "action");
        Intrinsics.checkNotNullParameter(analyticRefs, "analyticRefs");
        Long extractSkuFromFavoriteAction = ActionHandlersUtilsKt.extractSkuFromFavoriteAction(action);
        if (extractSkuFromFavoriteAction == null) {
            l e11 = y.e(new Exception("empty sku"));
            Intrinsics.checkNotNullExpressionValue(e11, "error(...)");
            return e11;
        }
        long longValue = extractSkuFromFavoriteAction.longValue();
        y<ChangeFavoriteAnalyticsData> addFavorite = this.favoritesServiceProvider.addFavorite(longValue);
        C3055d c3055d = new C3055d(new FavoriteComposerActionExecutor$addToFavorite$1(analyticRefs, action, this, longValue), 10);
        addFavorite.getClass();
        h hVar = new h(new r(addFavorite, c3055d), new d(new FavoriteComposerActionExecutor$addToFavorite$2(this, longValue), 7));
        Intrinsics.checkNotNullExpressionValue(hVar, "doOnError(...)");
        return hVar;
    }

    @NotNull
    public final y<Long> removeFromFavorites(@NotNull AtomAction.ComposerAction action, @NotNull AnalyticRefs analyticRefs) {
        Intrinsics.checkNotNullParameter(action, "action");
        Intrinsics.checkNotNullParameter(analyticRefs, "analyticRefs");
        Long extractSkuFromFavoriteAction = ActionHandlersUtilsKt.extractSkuFromFavoriteAction(action);
        if (extractSkuFromFavoriteAction == null) {
            l e11 = y.e(new Exception("empty sku"));
            Intrinsics.checkNotNullExpressionValue(e11, "error(...)");
            return e11;
        }
        long longValue = extractSkuFromFavoriteAction.longValue();
        y<ChangeFavoriteAnalyticsData> removeFromFavorites = this.favoritesServiceProvider.removeFromFavorites(longValue);
        C3056e c3056e = new C3056e(new FavoriteComposerActionExecutor$removeFromFavorites$1(analyticRefs, action, this, longValue), 8);
        removeFromFavorites.getClass();
        h hVar = new h(new r(removeFromFavorites, c3056e), new a(new FavoriteComposerActionExecutor$removeFromFavorites$2(this, longValue), 5));
        Intrinsics.checkNotNullExpressionValue(hVar, "doOnError(...)");
        return hVar;
    }
}
