package ru.ozon.app.android.favorites.domain.actionhandlers;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import ru.ozon.app.android.action.v2.models.ActionV2Response;
import ru.ozon.app.android.favorites.domain.eventmanager.FavoriteEvent;
import ru.ozon.app.android.favorites.domain.eventmanager.FavoriteEventManager;

@Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u001e\u0010\u0002\u001a\u001a\u0012\u0006\u0012\u0004\u0018\u00010\u0004 \u0005*\f\u0012\u0006\u0012\u0004\u0018\u00010\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"<anonymous>", "", "it", "Lru/ozon/app/android/action/v2/models/ActionV2Response;", "", "kotlin.jvm.PlatformType", "invoke", "(Lru/ozon/app/android/action/v2/models/ActionV2Response;)V"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
final class FavoritesComposerActionHandler$favoriteListAdd$1 extends AbstractC7737t implements Function1<ActionV2Response<Object>, Unit> {
    final /* synthetic */ FavoritesComposerActionHandler this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    FavoritesComposerActionHandler$favoriteListAdd$1(FavoritesComposerActionHandler favoritesComposerActionHandler) {
        super(1);
        this.this$0 = favoritesComposerActionHandler;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(ActionV2Response<Object> actionV2Response) {
        invoke2(actionV2Response);
        return Unit.f71690a;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(ActionV2Response<Object> actionV2Response) {
        FavoriteEventManager favoriteEventManager;
        favoriteEventManager = this.this$0.favoriteEventManager;
        favoriteEventManager.onFavListEdited(new FavoriteEvent.OnFavoriteListEdited(null, false, 3, null));
    }
}
