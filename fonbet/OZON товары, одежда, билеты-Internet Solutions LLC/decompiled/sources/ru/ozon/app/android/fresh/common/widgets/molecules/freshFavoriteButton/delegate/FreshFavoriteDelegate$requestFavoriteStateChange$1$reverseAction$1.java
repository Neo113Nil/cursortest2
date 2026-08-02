package ru.ozon.app.android.fresh.common.widgets.molecules.freshFavoriteButton.delegate;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC7737t;
import ru.ozon.app.android.favorites.domain.favoritemanager.FavoriteManager;

@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
final class FreshFavoriteDelegate$requestFavoriteStateChange$1$reverseAction$1 extends AbstractC7737t implements Function0<Unit> {
    final /* synthetic */ FreshFavoriteState $state;
    final /* synthetic */ boolean $targetFavoriteState;
    final /* synthetic */ FreshFavoriteDelegate this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    FreshFavoriteDelegate$requestFavoriteStateChange$1$reverseAction$1(boolean z11, FreshFavoriteDelegate freshFavoriteDelegate, FreshFavoriteState freshFavoriteState) {
        super(0);
        this.$targetFavoriteState = z11;
        this.this$0 = freshFavoriteDelegate;
        this.$state = freshFavoriteState;
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.f71690a;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2() {
        FavoriteManager favoriteManager;
        FavoriteManager favoriteManager2;
        if (this.$targetFavoriteState) {
            favoriteManager2 = this.this$0.favoriteManager;
            FavoriteManager.DefaultImpls.removeFromFavorites$default(favoriteManager2, this.$state.getSku().longValue(), null, 2, null);
        } else {
            favoriteManager = this.this$0.favoriteManager;
            FavoriteManager.DefaultImpls.addFavorite$default(favoriteManager, this.$state.getSku().longValue(), null, 2, null);
        }
    }
}
