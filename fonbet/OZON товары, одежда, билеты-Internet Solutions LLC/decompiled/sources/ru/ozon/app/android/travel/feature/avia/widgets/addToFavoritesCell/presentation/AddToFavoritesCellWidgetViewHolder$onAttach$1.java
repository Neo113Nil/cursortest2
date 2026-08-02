package ru.ozon.app.android.travel.feature.avia.widgets.addToFavoritesCell.presentation;

import Sc.o;
import Sc.s;
import Wc.a;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.e;
import kotlin.coroutines.jvm.internal.j;
import kotlin.jvm.functions.Function2;
import l10.i;
import ru.ozon.app.android.favorites.domain.favoritemanager.model.FavoriteAdd;
import ru.ozon.app.android.favorites.domain.favoritemanager.model.FavoriteEvent;
import ru.ozon.app.android.favorites.domain.favoritemanager.model.FavoriteRemove;
import ru.ozon.app.android.travel.feature.avia.widgets.addToFavoritesCell.presentation.AddToFavoritesCellVI;

@Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, d2 = {"<anonymous>", "", "event", "Lru/ozon/app/android/favorites/domain/favoritemanager/model/FavoriteEvent;"}, k = 3, mv = {2, 0, 0}, xi = 48)
@e(c = "ru.ozon.app.android.travel.feature.avia.widgets.addToFavoritesCell.presentation.AddToFavoritesCellWidgetViewHolder$onAttach$1", f = "AddToFavoritesCellWidgetViewHolder.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes10.dex */
final class AddToFavoritesCellWidgetViewHolder$onAttach$1 extends j implements Function2<FavoriteEvent, d<? super Unit>, Object> {
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ AddToFavoritesCellWidgetViewHolder this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    AddToFavoritesCellWidgetViewHolder$onAttach$1(AddToFavoritesCellWidgetViewHolder addToFavoritesCellWidgetViewHolder, d<? super AddToFavoritesCellWidgetViewHolder$onAttach$1> dVar) {
        super(2, dVar);
        this.this$0 = addToFavoritesCellWidgetViewHolder;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final d<Unit> create(Object obj, d<?> dVar) {
        AddToFavoritesCellWidgetViewHolder$onAttach$1 addToFavoritesCellWidgetViewHolder$onAttach$1 = new AddToFavoritesCellWidgetViewHolder$onAttach$1(this.this$0, dVar);
        addToFavoritesCellWidgetViewHolder$onAttach$1.L$0 = obj;
        return addToFavoritesCellWidgetViewHolder$onAttach$1;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        AddToFavoritesCellVI.AddToFavoritesCellModelVI model;
        boolean z11;
        i iVar;
        a aVar = a.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        s.b(obj);
        FavoriteEvent favoriteEvent = (FavoriteEvent) this.L$0;
        AddToFavoritesCellVI boundData = this.this$0.getBoundData();
        if (boundData != null && (model = boundData.getModel()) != null) {
            long sku = favoriteEvent.getSku();
            Long sku2 = model.getSku();
            if (sku2 != null && sku == sku2.longValue()) {
                if (favoriteEvent instanceof FavoriteAdd) {
                    z11 = true;
                } else {
                    if (!(favoriteEvent instanceof FavoriteRemove)) {
                        throw new o();
                    }
                    z11 = false;
                }
                iVar = this.this$0.container;
                iVar.M().update(AddToFavoritesUpdate.m1056boximpl(AddToFavoritesUpdate.m1057constructorimpl(z11)));
            }
        }
        return Unit.f71690a;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(FavoriteEvent favoriteEvent, d<? super Unit> dVar) {
        return ((AddToFavoritesCellWidgetViewHolder$onAttach$1) create(favoriteEvent, dVar)).invokeSuspend(Unit.f71690a);
    }
}
