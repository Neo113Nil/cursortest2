package ru.ozon.app.android.pdp.widgets.othersellers.presentation.seller;

import kotlin.Metadata;
import kotlin.Pair;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.app.android.favorites.domain.favoritemanager.model.FavoriteEvent;

@Metadata(d1 = {"\u0000\u001c\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u0013\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u0001¢\u0006\u0002\b\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\n¢\u0006\u0002\b\b"}, d2 = {"<anonymous>", "Lkotlin/Pair;", "", "Lkotlin/jvm/internal/EnhancedNullability;", "event", "Lru/ozon/app/android/favorites/domain/favoritemanager/model/FavoriteEvent;", "model", "Lru/ozon/app/android/pdp/widgets/othersellers/presentation/seller/OtherSellerVO;", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
final class OtherSellerViewHolder$onAttach$2 extends AbstractC7737t implements Function2<FavoriteEvent, OtherSellerVO, Pair<? extends Boolean, ? extends Boolean>> {
    final /* synthetic */ OtherSellerViewHolder this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    OtherSellerViewHolder$onAttach$2(OtherSellerViewHolder otherSellerViewHolder) {
        super(2);
        this.this$0 = otherSellerViewHolder;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Pair<Boolean, Boolean> invoke(FavoriteEvent event, OtherSellerVO model) {
        Pair<Boolean, Boolean> mapFavoriteByEvent;
        Intrinsics.checkNotNullParameter(event, "event");
        Intrinsics.checkNotNullParameter(model, "model");
        mapFavoriteByEvent = this.this$0.mapFavoriteByEvent(model, event);
        return mapFavoriteByEvent;
    }
}
