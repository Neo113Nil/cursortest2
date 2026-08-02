package ru.ozon.app.android.travel.feature.hotels.widgets.transparentNavBar.v2.presentation;

import Sc.o;
import Sc.s;
import Wc.a;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.e;
import kotlin.coroutines.jvm.internal.j;
import kotlin.jvm.functions.Function2;
import ru.ozon.app.android.favorites.domain.favoritemanager.model.FavoriteAdd;
import ru.ozon.app.android.favorites.domain.favoritemanager.model.FavoriteEvent;
import ru.ozon.app.android.favorites.domain.favoritemanager.model.FavoriteRemove;
import ru.ozon.app.android.travel.feature.hotels.widgets.transparentNavBar.v2.view.TransparentNavBarV2View;

@Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, d2 = {"<anonymous>", "", "event", "Lru/ozon/app/android/favorites/domain/favoritemanager/model/FavoriteEvent;"}, k = 3, mv = {2, 0, 0}, xi = 48)
@e(c = "ru.ozon.app.android.travel.feature.hotels.widgets.transparentNavBar.v2.presentation.TransparentNavBarV2WidgetViewHolder$onWidgetCreated$4", f = "TransparentNavBarV2WidgetViewHolder.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes4.dex */
final class TransparentNavBarV2WidgetViewHolder$onWidgetCreated$4 extends j implements Function2<FavoriteEvent, d<? super Unit>, Object> {
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ TransparentNavBarV2WidgetViewHolder this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    TransparentNavBarV2WidgetViewHolder$onWidgetCreated$4(TransparentNavBarV2WidgetViewHolder transparentNavBarV2WidgetViewHolder, d<? super TransparentNavBarV2WidgetViewHolder$onWidgetCreated$4> dVar) {
        super(2, dVar);
        this.this$0 = transparentNavBarV2WidgetViewHolder;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final d<Unit> create(Object obj, d<?> dVar) {
        TransparentNavBarV2WidgetViewHolder$onWidgetCreated$4 transparentNavBarV2WidgetViewHolder$onWidgetCreated$4 = new TransparentNavBarV2WidgetViewHolder$onWidgetCreated$4(this.this$0, dVar);
        transparentNavBarV2WidgetViewHolder$onWidgetCreated$4.L$0 = obj;
        return transparentNavBarV2WidgetViewHolder$onWidgetCreated$4;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        boolean z11;
        TransparentNavBarV2View navbarView;
        a aVar = a.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        s.b(obj);
        FavoriteEvent favoriteEvent = (FavoriteEvent) this.L$0;
        if (favoriteEvent instanceof FavoriteAdd) {
            z11 = true;
        } else {
            if (!(favoriteEvent instanceof FavoriteRemove)) {
                throw new o();
            }
            z11 = false;
        }
        navbarView = this.this$0.getNavbarView();
        navbarView.updateFavInfo(z11);
        return Unit.f71690a;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(FavoriteEvent favoriteEvent, d<? super Unit> dVar) {
        return ((TransparentNavBarV2WidgetViewHolder$onWidgetCreated$4) create(favoriteEvent, dVar)).invokeSuspend(Unit.f71690a);
    }
}
