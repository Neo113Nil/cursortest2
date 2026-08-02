package ru.ozon.app.android.favorites.wishlistMultiselect.presentation;

import GZ.g;
import GZ.l;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import ru.ozon.app.android.action.v2.models.ActionV2Response;
import ru.ozon.app.android.favorites.common.SelectedProductsManager;
import ru.ozon.app.android.favorites.data.favoritebutton.favoriteproduct.model.FavoriteActionV2Response;
import ru.ozon.app.android.favorites.domain.eventmanager.FavoriteEvent;
import ru.ozon.app.android.favorites.domain.eventmanager.FavoriteEventManager;
import ru.ozon.app.android.favorites.domain.wishlistManager.WishlistEvent;
import ru.ozon.app.android.favorites.domain.wishlistManager.WishlistEvent$Result$ActionResult;
import ru.ozon.app.android.favorites.domain.wishlistManager.WishlistEventManager;

@Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u001a\u0010\u0002\u001a\u0016\u0012\u0004\u0012\u00020\u0004 \u0005*\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"<anonymous>", "", "it", "Lru/ozon/app/android/action/v2/models/ActionV2Response;", "Lru/ozon/app/android/favorites/data/favoritebutton/favoriteproduct/model/FavoriteActionV2Response;", "kotlin.jvm.PlatformType", "invoke", "(Lru/ozon/app/android/action/v2/models/ActionV2Response;)V"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
final class WishlistMultiselectOverlayViewHolder$execute$1 extends AbstractC7737t implements Function1<ActionV2Response<FavoriteActionV2Response>, Unit> {
    final /* synthetic */ long $listId;
    final /* synthetic */ WishlistMultiselectOverlayViewHolder this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    WishlistMultiselectOverlayViewHolder$execute$1(WishlistMultiselectOverlayViewHolder wishlistMultiselectOverlayViewHolder, long j11) {
        super(1);
        this.this$0 = wishlistMultiselectOverlayViewHolder;
        this.$listId = j11;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(ActionV2Response<FavoriteActionV2Response> actionV2Response) {
        invoke2(actionV2Response);
        return Unit.f71690a;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(ActionV2Response<FavoriteActionV2Response> actionV2Response) {
        SelectedProductsManager selectedProductsManager;
        FavoriteEventManager favoriteEventManager;
        g gVar;
        WishlistEventManager wishlistEventManager;
        selectedProductsManager = this.this$0.selectedProductsManager;
        List<Long> selectedIds = selectedProductsManager.getSelectedIds();
        WishlistMultiselectOverlayViewHolder wishlistMultiselectOverlayViewHolder = this.this$0;
        long j11 = this.$listId;
        Iterator<T> it = selectedIds.iterator();
        while (it.hasNext()) {
            long longValue = ((Number) it.next()).longValue();
            wishlistEventManager = wishlistMultiselectOverlayViewHolder.wishlistEventManager;
            wishlistEventManager.onWishlistChanged(new WishlistEvent.ProductAdded(Long.valueOf(longValue), j11, WishlistEvent$Result$ActionResult.SUCCEED, null, null, 24, null));
        }
        favoriteEventManager = this.this$0.favoriteEventManager;
        FavoriteActionV2Response data = actionV2Response.getData();
        favoriteEventManager.onFavWishlistEdited(new FavoriteEvent.OnFavoriteWishlistEdited(data != null ? data.getNotification() : null, false, true, 2, null));
        gVar = this.this$0.router;
        l.a(gVar);
    }
}
