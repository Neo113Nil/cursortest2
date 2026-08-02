package ru.ozon.app.android.universalwidgets.widgets.uw.sku.tileGrid2.presentation.toprightbuttons;

import Sc.s;
import Wc.a;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.K;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.e;
import kotlin.coroutines.jvm.internal.j;
import kotlin.jvm.functions.Function2;
import ru.ozon.app.android.favorites.domain.favoritemanager.model.FavoriteAdd;
import ru.ozon.app.android.favorites.domain.favoritemanager.model.FavoriteEvent;
import ru.ozon.app.android.universalwidgets.widgets.uw.sku.tileGrid2.presentation.toprightbuttons.TileGrid2TopRightButtonsDelegate;

@Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, d2 = {"<anonymous>", "", "event", "Lru/ozon/app/android/favorites/domain/favoritemanager/model/FavoriteEvent;"}, k = 3, mv = {2, 0, 0}, xi = 48)
@e(c = "ru.ozon.app.android.universalwidgets.widgets.uw.sku.tileGrid2.presentation.toprightbuttons.TileGrid2TopRightButtonsDelegate$subscribeFavoriteChanged$2", f = "TileGrid2TopRightButtonsDelegate.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes7.dex */
final class TileGrid2TopRightButtonsDelegate$subscribeFavoriteChanged$2 extends j implements Function2<FavoriteEvent, d<? super Unit>, Object> {
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ TileGrid2TopRightButtonsDelegate this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    TileGrid2TopRightButtonsDelegate$subscribeFavoriteChanged$2(TileGrid2TopRightButtonsDelegate tileGrid2TopRightButtonsDelegate, d<? super TileGrid2TopRightButtonsDelegate$subscribeFavoriteChanged$2> dVar) {
        super(2, dVar);
        this.this$0 = tileGrid2TopRightButtonsDelegate;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final d<Unit> create(Object obj, d<?> dVar) {
        TileGrid2TopRightButtonsDelegate$subscribeFavoriteChanged$2 tileGrid2TopRightButtonsDelegate$subscribeFavoriteChanged$2 = new TileGrid2TopRightButtonsDelegate$subscribeFavoriteChanged$2(this.this$0, dVar);
        tileGrid2TopRightButtonsDelegate$subscribeFavoriteChanged$2.L$0 = obj;
        return tileGrid2TopRightButtonsDelegate$subscribeFavoriteChanged$2;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        TileGrid2TopRightButtonsDelegate.State state;
        List list;
        a aVar = a.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        s.b(obj);
        TileGrid2TopRightButtonsDelegate.State state2 = ((FavoriteEvent) this.L$0) instanceof FavoriteAdd ? TileGrid2TopRightButtonsDelegate.State.EXPANDED : TileGrid2TopRightButtonsDelegate.State.COLLAPSED;
        state = this.this$0.currentState;
        if (state == state2) {
            return Unit.f71690a;
        }
        TileGrid2TopRightButtonsDelegate tileGrid2TopRightButtonsDelegate = this.this$0;
        list = tileGrid2TopRightButtonsDelegate.topRightButtons;
        if (list == null) {
            list = K.f71697a;
        }
        tileGrid2TopRightButtonsDelegate.submitTopRightButtons(list, state2);
        return Unit.f71690a;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(FavoriteEvent favoriteEvent, d<? super Unit> dVar) {
        return ((TileGrid2TopRightButtonsDelegate$subscribeFavoriteChanged$2) create(favoriteEvent, dVar)).invokeSuspend(Unit.f71690a);
    }
}
