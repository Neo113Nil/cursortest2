package ru.ozon.app.android.favorites.domain.favoritebutton.favoriteentity;

import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.app.android.favorites.data.favoritebutton.favoriteentity.localstorage.FavoriteStateStore;
import ru.ozon.app.android.favorites.data.favoritebutton.favoriteentity.model.favorite.ShortFavEntity;
import ru.ozon.app.android.favorites.data.favoritebutton.favoriteentity.model.restriction.MapperKt;
import ru.ozon.app.android.favorites.data.favoritebutton.favoriteentity.model.restriction.RestrictionModel;
import ru.ozon.app.android.favorites.data.favoritebutton.favoriteentity.model.updatefavorite.UpdateFavoriteResponse;
import ru.ozon.app.android.favorites.domain.eventmanager.FavoriteEvent;
import ru.ozon.app.android.favorites.domain.eventmanager.FavoriteEventManager;

@Metadata(d1 = {"\u0000\u0016\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u00012\u000b\u0010\u0003\u001a\u00070\u0004¢\u0006\u0002\b\u0005H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"<anonymous>", "Lru/ozon/app/android/favorites/data/favoritebutton/favoriteentity/model/restriction/RestrictionModel;", "kotlin.jvm.PlatformType", "response", "Lru/ozon/app/android/favorites/data/favoritebutton/favoriteentity/model/updatefavorite/UpdateFavoriteResponse;", "Lkotlin/jvm/internal/EnhancedNullability;", "invoke", "(Lru/ozon/app/android/favorites/data/favoritebutton/favoriteentity/model/updatefavorite/UpdateFavoriteResponse;)Lru/ozon/app/android/favorites/data/favoritebutton/favoriteentity/model/restriction/RestrictionModel;"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
final class FavoriteEntityInteractor$updateFavoriteEntity$1$2 extends AbstractC7737t implements Function1<UpdateFavoriteResponse, RestrictionModel> {
    final /* synthetic */ ShortFavEntity $favoriteEntity;
    final /* synthetic */ FavoriteEntityInteractor this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    FavoriteEntityInteractor$updateFavoriteEntity$1$2(FavoriteEntityInteractor favoriteEntityInteractor, ShortFavEntity shortFavEntity) {
        super(1);
        this.this$0 = favoriteEntityInteractor;
        this.$favoriteEntity = shortFavEntity;
    }

    @Override // kotlin.jvm.functions.Function1
    public final RestrictionModel invoke(UpdateFavoriteResponse response) {
        FavoriteEventManager favoriteEventManager;
        FavoriteStateStore favoriteStateStore;
        Intrinsics.checkNotNullParameter(response, "response");
        favoriteEventManager = this.this$0.favoriteEventManager;
        favoriteEventManager.onFavEntityStateUpdated(FavoriteEvent.FavoriteEntityUpdated.INSTANCE);
        favoriteStateStore = this.this$0.localStore;
        favoriteStateStore.favoriteIsUpdated(this.$favoriteEntity.getKeyModel(), !this.$favoriteEntity.getIsFavorite());
        return MapperKt.toRestriction(response);
    }
}
