package ru.ozon.app.android.favorites.domain.favoritebutton.favoriteentity;

import Bc.l;
import Bc.r;
import DM.g;
import DM.h;
import Mc.a;
import io.reactivex.p;
import io.reactivex.y;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import mc.C8125a;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.action.v2.models.ActionV2Response;
import ru.ozon.app.android.favorites.data.favoritebutton.favoriteentity.FavoriteEntityApi;
import ru.ozon.app.android.favorites.data.favoritebutton.favoriteentity.localstorage.FavoriteStateStore;
import ru.ozon.app.android.favorites.data.favoritebutton.favoriteentity.localstorage.KeyFavoriteEntityModel;
import ru.ozon.app.android.favorites.data.favoritebutton.favoriteentity.model.favorite.ShortFavEntity;
import ru.ozon.app.android.favorites.data.favoritebutton.favoriteentity.model.restriction.RestrictionModel;
import ru.ozon.app.android.favorites.data.favoritebutton.favoriteentity.model.updatefavorite.MapperKt;
import ru.ozon.app.android.favorites.data.favoritebutton.favoriteentity.model.updatefavorite.UpdateFavoriteRequestData;
import ru.ozon.app.android.favorites.data.favoritebutton.favoriteentity.model.updatefavorite.UpdateFavoriteResponse;
import ru.ozon.app.android.favorites.domain.eventmanager.FavoriteEventManager;
import ru.ozon.uni.atoms.af.AtomAction;

@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B!\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u001b\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\f2\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\u000e\u0010\u000fJ#\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\f2\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u0012¢\u0006\u0004\b\u000e\u0010\u0014J\u001f\u0010\u0018\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0017\u0012\u0004\u0012\u00020\u00120\u00160\u0015¢\u0006\u0004\b\u0018\u0010\u0019R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u001aR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u001bR\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u001c¨\u0006\u001d"}, d2 = {"Lru/ozon/app/android/favorites/domain/favoritebutton/favoriteentity/FavoriteEntityInteractor;", "", "Lru/ozon/app/android/favorites/data/favoritebutton/favoriteentity/localstorage/FavoriteStateStore;", "localStore", "Lru/ozon/app/android/favorites/data/favoritebutton/favoriteentity/FavoriteEntityApi;", "favEntityApi", "Lru/ozon/app/android/favorites/domain/eventmanager/FavoriteEventManager;", "favoriteEventManager", "<init>", "(Lru/ozon/app/android/favorites/data/favoritebutton/favoriteentity/localstorage/FavoriteStateStore;Lru/ozon/app/android/favorites/data/favoritebutton/favoriteentity/FavoriteEntityApi;Lru/ozon/app/android/favorites/domain/eventmanager/FavoriteEventManager;)V", "Lru/ozon/app/android/favorites/data/favoritebutton/favoriteentity/model/favorite/ShortFavEntity;", "favoriteEntity", "Lio/reactivex/y;", "Lru/ozon/app/android/favorites/data/favoritebutton/favoriteentity/model/restriction/RestrictionModel;", "updateFavoriteEntity", "(Lru/ozon/app/android/favorites/data/favoritebutton/favoriteentity/model/favorite/ShortFavEntity;)Lio/reactivex/y;", "Lru/ozon/uni/atoms/af/AtomAction$ComposerAction;", "action", "", "isFavorite", "(Lru/ozon/uni/atoms/af/AtomAction$ComposerAction;Z)Lio/reactivex/y;", "Lio/reactivex/p;", "", "Lru/ozon/app/android/favorites/data/favoritebutton/favoriteentity/localstorage/KeyFavoriteEntityModel;", "subscribeOnFavoriteUpdate", "()Lio/reactivex/p;", "Lru/ozon/app/android/favorites/data/favoritebutton/favoriteentity/localstorage/FavoriteStateStore;", "Lru/ozon/app/android/favorites/data/favoritebutton/favoriteentity/FavoriteEntityApi;", "Lru/ozon/app/android/favorites/domain/eventmanager/FavoriteEventManager;", "favorites_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class FavoriteEntityInteractor {

    @NotNull
    private final FavoriteEntityApi favEntityApi;

    @NotNull
    private final FavoriteEventManager favoriteEventManager;

    @NotNull
    private final FavoriteStateStore localStore;

    public FavoriteEntityInteractor(@NotNull FavoriteStateStore localStore, @NotNull FavoriteEntityApi favEntityApi, @NotNull FavoriteEventManager favoriteEventManager) {
        Intrinsics.checkNotNullParameter(localStore, "localStore");
        Intrinsics.checkNotNullParameter(favEntityApi, "favEntityApi");
        Intrinsics.checkNotNullParameter(favoriteEventManager, "favoriteEventManager");
        this.localStore = localStore;
        this.favEntityApi = favEntityApi;
        this.favoriteEventManager = favoriteEventManager;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final UpdateFavoriteResponse updateFavoriteEntity$lambda$2$lambda$0(Function1 function1, Object p02) {
        Intrinsics.checkNotNullParameter(p02, "p0");
        return (UpdateFavoriteResponse) function1.invoke(p02);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final RestrictionModel updateFavoriteEntity$lambda$2$lambda$1(Function1 function1, Object p02) {
        Intrinsics.checkNotNullParameter(p02, "p0");
        return (RestrictionModel) function1.invoke(p02);
    }

    @NotNull
    public final p<Map<KeyFavoriteEntityModel, Boolean>> subscribeOnFavoriteUpdate() {
        return this.localStore.subscribeOnFavoriteUpdate();
    }

    @NotNull
    public final y<RestrictionModel> updateFavoriteEntity(@NotNull ShortFavEntity favoriteEntity) {
        Intrinsics.checkNotNullParameter(favoriteEntity, "favoriteEntity");
        UpdateFavoriteRequestData extractRequestData = MapperKt.extractRequestData(favoriteEntity);
        if (extractRequestData == null) {
            l e11 = y.e(new Exception("null request data"));
            Intrinsics.checkNotNullExpressionValue(e11, "error(...)");
            return e11;
        }
        y<ActionV2Response<UpdateFavoriteResponse>> updateFavorite = this.favEntityApi.updateFavorite(extractRequestData.getActionName(), extractRequestData.getRequestBody());
        g gVar = new g(FavoriteEntityInteractor$updateFavoriteEntity$1$1.INSTANCE, 6);
        updateFavorite.getClass();
        return new r(new r(updateFavorite, gVar), new h(new FavoriteEntityInteractor$updateFavoriteEntity$1$2(this, favoriteEntity), 5)).j(a.b());
    }

    @NotNull
    public final y<RestrictionModel> updateFavoriteEntity(@NotNull AtomAction.ComposerAction action, boolean isFavorite) {
        ShortFavEntity createShortFavEntity;
        Intrinsics.checkNotNullParameter(action, "action");
        createShortFavEntity = FavoriteEntityInteractorKt.createShortFavEntity(action, isFavorite);
        if (createShortFavEntity != null) {
            return updateFavoriteEntity(createShortFavEntity).g(C8125a.a());
        }
        l e11 = y.e(new Exception("error request"));
        Intrinsics.checkNotNullExpressionValue(e11, "error(...)");
        return e11;
    }
}
