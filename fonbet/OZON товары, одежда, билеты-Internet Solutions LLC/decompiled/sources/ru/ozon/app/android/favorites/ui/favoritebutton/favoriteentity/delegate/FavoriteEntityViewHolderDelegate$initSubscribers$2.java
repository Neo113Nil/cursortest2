package ru.ozon.app.android.favorites.ui.favoritebutton.favoriteentity.delegate;

import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import l10.InterfaceC7851b;
import ru.ozon.app.android.composer.ComposerReferences;
import ru.ozon.app.android.favorites.data.favoritebutton.favoriteentity.localstorage.KeyFavoriteEntityModel;
import ru.ozon.app.android.favorites.data.favoritebutton.favoriteentity.model.favorite.FavoriteEntity;
import ru.ozon.app.android.favorites.ui.favoritebutton.favoriteentity.FavoriteEntityUpdateKey;

@Metadata(d1 = {"\u0000\u0018\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012&\u0010\u0002\u001a\"\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0005 \u0006*\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00030\u0003H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"<anonymous>", "", "map", "", "Lru/ozon/app/android/favorites/data/favoritebutton/favoriteentity/localstorage/KeyFavoriteEntityModel;", "", "kotlin.jvm.PlatformType", "invoke", "(Ljava/util/Map;)V"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
final class FavoriteEntityViewHolderDelegate$initSubscribers$2 extends AbstractC7737t implements Function1<Map<KeyFavoriteEntityModel, ? extends Boolean>, Unit> {
    final /* synthetic */ FavoriteEntityViewHolderDelegate this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    FavoriteEntityViewHolderDelegate$initSubscribers$2(FavoriteEntityViewHolderDelegate favoriteEntityViewHolderDelegate) {
        super(1);
        this.this$0 = favoriteEntityViewHolderDelegate;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(Map<KeyFavoriteEntityModel, ? extends Boolean> map) {
        invoke2((Map<KeyFavoriteEntityModel, Boolean>) map);
        return Unit.f71690a;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(Map<KeyFavoriteEntityModel, Boolean> map) {
        FavoriteEntity favoriteEntity;
        ComposerReferences composerReferences;
        favoriteEntity = this.this$0.currentFavoriteEntity;
        if (favoriteEntity != null) {
            FavoriteEntityViewHolderDelegate favoriteEntityViewHolderDelegate = this.this$0;
            Boolean bool = map.get(new KeyFavoriteEntityModel(favoriteEntity.getId(), favoriteEntity.getType()));
            composerReferences = favoriteEntityViewHolderDelegate.composerReferences;
            InterfaceC7851b controller = composerReferences.getController();
            if (bool != null) {
                controller.update(new FavoriteEntityUpdateKey(FavoriteEntity.copy$default(favoriteEntity, null, 0L, bool.booleanValue(), null, null, 27, null)));
            }
        }
    }
}
