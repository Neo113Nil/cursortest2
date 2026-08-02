package ru.ozon.app.android.favorites.ui.favoritebutton.favoriteentity.delegate;

import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.app.android.favorites.data.favoritebutton.favoriteentity.localstorage.KeyFavoriteEntityModel;
import ru.ozon.app.android.favorites.data.favoritebutton.favoriteentity.model.favorite.FavoriteEntity;

@Metadata(d1 = {"\u0000\u0018\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0017\u0010\u0002\u001a\u0013\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00010\u0003¢\u0006\u0002\b\u0005H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"<anonymous>", "", "map", "", "Lru/ozon/app/android/favorites/data/favoritebutton/favoriteentity/localstorage/KeyFavoriteEntityModel;", "Lkotlin/jvm/internal/EnhancedNullability;", "invoke", "(Ljava/util/Map;)Ljava/lang/Boolean;"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
final class FavoriteEntityViewHolderDelegate$initSubscribers$1 extends AbstractC7737t implements Function1<Map<KeyFavoriteEntityModel, ? extends Boolean>, Boolean> {
    final /* synthetic */ FavoriteEntityViewHolderDelegate this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    FavoriteEntityViewHolderDelegate$initSubscribers$1(FavoriteEntityViewHolderDelegate favoriteEntityViewHolderDelegate) {
        super(1);
        this.this$0 = favoriteEntityViewHolderDelegate;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Boolean invoke(Map<KeyFavoriteEntityModel, ? extends Boolean> map) {
        return invoke2((Map<KeyFavoriteEntityModel, Boolean>) map);
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Boolean invoke2(Map<KeyFavoriteEntityModel, Boolean> map) {
        FavoriteEntity favoriteEntity;
        Intrinsics.checkNotNullParameter(map, "map");
        favoriteEntity = this.this$0.currentFavoriteEntity;
        boolean z11 = false;
        if (favoriteEntity != null && map.get(new KeyFavoriteEntityModel(favoriteEntity.getId(), favoriteEntity.getType())) != null) {
            z11 = true;
        }
        return Boolean.valueOf(z11);
    }
}
