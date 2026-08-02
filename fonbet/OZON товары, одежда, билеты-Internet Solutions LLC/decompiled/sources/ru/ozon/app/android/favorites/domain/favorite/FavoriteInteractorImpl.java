package ru.ozon.app.android.favorites.domain.favorite;

import AF.a;
import BT.b;
import BT.c;
import Bc.r;
import Dp.C2877a;
import Lz.d;
import io.reactivex.AbstractC7094b;
import io.reactivex.f;
import io.reactivex.p;
import io.reactivex.y;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import qc.InterfaceC9019a;
import ru.ozon.app.android.account.subscription.SubscriptionService;
import ru.ozon.app.android.favorites.data.service.ChangeFavoriteAnalyticsData;
import ru.ozon.app.android.favorites.data.service.FavoritesServiceProvider;
import ru.ozon.app.android.favorites.domain.favorite.FavoriteInteractorImpl;
import ru.ozon.app.android.favorites.domain.favoritemanager.FavoriteManager;
import ru.ozon.app.android.favorites.domain.favoritemanager.model.FavoriteEvent;
import ru.ozon.app.android.utils.rx.RxExtKt;
import vc.C10297b;
import vc.j;
import vc.n;

@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u00002\u00020\u0001B!\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u000f\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\u000f\u0010\u000eJ\u001f\u0010\u0012\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0011\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u001f\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0014\u001a\u00020\n2\u0006\u0010\u0011\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u0015\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00190\u0018H\u0016¢\u0006\u0004\b\u001a\u0010\u001bJ\u001d\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00100\u001c2\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\u0011\u0010\u001dJ\u0017\u0010\u001e\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\u001e\u0010\u000eR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u001fR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010 R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010!¨\u0006\""}, d2 = {"Lru/ozon/app/android/favorites/domain/favorite/FavoriteInteractorImpl;", "Lru/ozon/app/android/favorites/domain/favorite/FavoriteInteractor;", "Lru/ozon/app/android/favorites/data/service/FavoritesServiceProvider;", "favoritesServiceProvider", "Lru/ozon/app/android/favorites/domain/favoritemanager/FavoriteManager;", "favoriteManager", "Lru/ozon/app/android/account/subscription/SubscriptionService;", "subscriptionService", "<init>", "(Lru/ozon/app/android/favorites/data/service/FavoritesServiceProvider;Lru/ozon/app/android/favorites/domain/favoritemanager/FavoriteManager;Lru/ozon/app/android/account/subscription/SubscriptionService;)V", "", "productId", "Lio/reactivex/b;", "addToFavorite", "(J)Lio/reactivex/b;", "removeFromFavorite", "", "isFavorite", "addOrRemoveFavorite", "(JZ)Lio/reactivex/b;", "sku", "", "shareFavoriteState", "(JZ)V", "Lio/reactivex/p;", "Lru/ozon/app/android/favorites/domain/favoritemanager/model/FavoriteEvent;", "favoriteChangeEvents", "()Lio/reactivex/p;", "Lio/reactivex/y;", "(J)Lio/reactivex/y;", "checkAndAddToFavorite", "Lru/ozon/app/android/favorites/data/service/FavoritesServiceProvider;", "Lru/ozon/app/android/favorites/domain/favoritemanager/FavoriteManager;", "Lru/ozon/app/android/account/subscription/SubscriptionService;", "favorites_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class FavoriteInteractorImpl implements FavoriteInteractor {

    @NotNull
    private final FavoriteManager favoriteManager;

    @NotNull
    private final FavoritesServiceProvider favoritesServiceProvider;

    @NotNull
    private final SubscriptionService subscriptionService;

    public FavoriteInteractorImpl(@NotNull FavoritesServiceProvider favoritesServiceProvider, @NotNull FavoriteManager favoriteManager, @NotNull SubscriptionService subscriptionService) {
        Intrinsics.checkNotNullParameter(favoritesServiceProvider, "favoritesServiceProvider");
        Intrinsics.checkNotNullParameter(favoriteManager, "favoriteManager");
        Intrinsics.checkNotNullParameter(subscriptionService, "subscriptionService");
        this.favoritesServiceProvider = favoritesServiceProvider;
        this.favoriteManager = favoriteManager;
        this.subscriptionService = subscriptionService;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final f checkAndAddToFavorite$lambda$15(Function1 function1, Object p02) {
        Intrinsics.checkNotNullParameter(p02, "p0");
        return (f) function1.invoke(p02);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Boolean isFavorite$lambda$14(Function1 function1, Object p02) {
        Intrinsics.checkNotNullParameter(p02, "p0");
        return (Boolean) function1.invoke(p02);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void removeFromFavorite$lambda$9$lambda$7(FavoriteInteractorImpl favoriteInteractorImpl, long j11) {
        favoriteInteractorImpl.subscriptionService.unsubscribeProduct(j11);
    }

    @Override // ru.ozon.app.android.favorites.domain.favorite.FavoriteInteractor
    @NotNull
    public AbstractC7094b addOrRemoveFavorite(long productId, boolean isFavorite) {
        return !isFavorite ? addToFavorite(productId) : removeFromFavorite(productId);
    }

    @Override // ru.ozon.app.android.favorites.domain.favorite.FavoriteInteractor
    @NotNull
    public AbstractC7094b addToFavorite(long productId) {
        y<ChangeFavoriteAnalyticsData> addFavorite = this.favoritesServiceProvider.addFavorite(productId);
        addFavorite.getClass();
        C10297b c10297b = new C10297b(new j(addFavorite));
        n e11 = c10297b.f(new b(new FavoriteInteractorImpl$addToFavorite$1$1(this, productId), 5)).e(new c(new FavoriteInteractorImpl$addToFavorite$1$2(this, productId), 4));
        Intrinsics.checkNotNullExpressionValue(e11, "doOnError(...)");
        RxExtKt.subscribeBy$default(e11, null, null, 3, null);
        Intrinsics.checkNotNullExpressionValue(c10297b, "also(...)");
        return c10297b;
    }

    @Override // ru.ozon.app.android.favorites.domain.favorite.FavoriteInteractor
    @NotNull
    public AbstractC7094b checkAndAddToFavorite(long productId) {
        y<Boolean> isFavorite = isFavorite(productId);
        d dVar = new d(new FavoriteInteractorImpl$checkAndAddToFavorite$1(this, productId), 2);
        isFavorite.getClass();
        Bc.n nVar = new Bc.n(isFavorite, dVar);
        Intrinsics.checkNotNullExpressionValue(nVar, "flatMapCompletable(...)");
        return nVar;
    }

    @Override // ru.ozon.app.android.favorites.domain.favorite.FavoriteInteractor
    @NotNull
    public p<FavoriteEvent> favoriteChangeEvents() {
        return this.favoriteManager.onFavoriteChange();
    }

    @Override // ru.ozon.app.android.favorites.domain.favorite.FavoriteInteractor
    @NotNull
    public y<Boolean> isFavorite(long productId) {
        y<List<Long>> checkFavorite = this.favoritesServiceProvider.checkFavorite(productId);
        AF.b bVar = new AF.b(new FavoriteInteractorImpl$isFavorite$1(productId), 7);
        checkFavorite.getClass();
        r rVar = new r(checkFavorite, bVar);
        Intrinsics.checkNotNullExpressionValue(rVar, "map(...)");
        return rVar;
    }

    @NotNull
    public AbstractC7094b removeFromFavorite(final long productId) {
        y<ChangeFavoriteAnalyticsData> removeFromFavorites = this.favoritesServiceProvider.removeFromFavorites(productId);
        removeFromFavorites.getClass();
        C10297b c10297b = new C10297b(new j(removeFromFavorites));
        n e11 = c10297b.f(new C2877a(new FavoriteInteractorImpl$removeFromFavorite$1$1(this, productId), 6)).d(new InterfaceC9019a() { // from class: ft.a
            @Override // qc.InterfaceC9019a
            public final void run() {
                FavoriteInteractorImpl.removeFromFavorite$lambda$9$lambda$7(FavoriteInteractorImpl.this, productId);
            }
        }).e(new a(new FavoriteInteractorImpl$removeFromFavorite$1$3(this, productId), 8));
        Intrinsics.checkNotNullExpressionValue(e11, "doOnError(...)");
        RxExtKt.subscribeBy$default(e11, null, null, 3, null);
        Intrinsics.checkNotNullExpressionValue(c10297b, "also(...)");
        return c10297b;
    }

    @Override // ru.ozon.app.android.favorites.domain.favorite.FavoriteInteractor
    public void shareFavoriteState(long sku, boolean isFavorite) {
        if (isFavorite) {
            FavoriteManager.DefaultImpls.addFavorite$default(this.favoriteManager, sku, null, 2, null);
        } else {
            FavoriteManager.DefaultImpls.removeFromFavorites$default(this.favoriteManager, sku, null, 2, null);
        }
    }
}
