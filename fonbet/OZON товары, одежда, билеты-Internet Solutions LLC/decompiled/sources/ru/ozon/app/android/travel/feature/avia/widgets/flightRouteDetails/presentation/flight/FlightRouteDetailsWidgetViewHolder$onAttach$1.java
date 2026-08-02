package ru.ozon.app.android.travel.feature.avia.widgets.flightRouteDetails.presentation.flight;

import Sc.o;
import Sc.s;
import Wc.a;
import androidx.core.app.n;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.e;
import kotlin.coroutines.jvm.internal.j;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import ru.ozon.app.android.favorites.domain.favoritemanager.model.FavoriteAdd;
import ru.ozon.app.android.favorites.domain.favoritemanager.model.FavoriteEvent;
import ru.ozon.app.android.favorites.domain.favoritemanager.model.FavoriteRemove;
import ru.ozon.app.android.travel.feature.avia.shared.favorites.AddToFavoritesViewModel;
import ru.ozon.uni.atoms.af.AtomAction;

@Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, d2 = {"<anonymous>", "", "event", "Lru/ozon/app/android/favorites/domain/favoritemanager/model/FavoriteEvent;"}, k = 3, mv = {2, 0, 0}, xi = 48)
@e(c = "ru.ozon.app.android.travel.feature.avia.widgets.flightRouteDetails.presentation.flight.FlightRouteDetailsWidgetViewHolder$onAttach$1", f = "FlightRouteDetailsWidgetViewHolder.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes10.dex */
final class FlightRouteDetailsWidgetViewHolder$onAttach$1 extends j implements Function2<FavoriteEvent, d<? super Unit>, Object> {
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ FlightRouteDetailsWidgetViewHolder this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    FlightRouteDetailsWidgetViewHolder$onAttach$1(FlightRouteDetailsWidgetViewHolder flightRouteDetailsWidgetViewHolder, d<? super FlightRouteDetailsWidgetViewHolder$onAttach$1> dVar) {
        super(2, dVar);
        this.this$0 = flightRouteDetailsWidgetViewHolder;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final d<Unit> create(Object obj, d<?> dVar) {
        FlightRouteDetailsWidgetViewHolder$onAttach$1 flightRouteDetailsWidgetViewHolder$onAttach$1 = new FlightRouteDetailsWidgetViewHolder$onAttach$1(this.this$0, dVar);
        flightRouteDetailsWidgetViewHolder$onAttach$1.L$0 = obj;
        return flightRouteDetailsWidgetViewHolder$onAttach$1;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        Pair<Long, AtomAction> modalAction;
        boolean z11;
        AddToFavoritesViewModel addToFavoritesViewModel;
        Function1 function1;
        AddToFavoritesViewModel addToFavoritesViewModel2;
        Pair<Long, AtomAction> modalAction2;
        a aVar = a.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        s.b(obj);
        FavoriteEvent favoriteEvent = (FavoriteEvent) this.L$0;
        FlightRouteDetailsVO boundData = this.this$0.getBoundData();
        if (boundData != null && (modalAction = boundData.getModalAction()) != null && favoriteEvent.getSku() == modalAction.a().longValue()) {
            if (favoriteEvent instanceof FavoriteAdd) {
                z11 = true;
            } else {
                if (!(favoriteEvent instanceof FavoriteRemove)) {
                    throw new o();
                }
                z11 = false;
            }
            FlightRouteDetailsVO boundData2 = this.this$0.getBoundData();
            AtomAction b11 = (boundData2 == null || (modalAction2 = boundData2.getModalAction()) == null) ? null : modalAction2.b();
            if (z11 && b11 != null && !n.e(this.this$0.getContext()).a()) {
                addToFavoritesViewModel = this.this$0.viewModel;
                if (!addToFavoritesViewModel.getNotificationDialogShownInSession()) {
                    function1 = this.this$0.actionHandler;
                    function1.invoke(b11);
                    addToFavoritesViewModel2 = this.this$0.viewModel;
                    addToFavoritesViewModel2.changeNotificationDialogShownInSession();
                }
            }
        }
        return Unit.f71690a;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(FavoriteEvent favoriteEvent, d<? super Unit> dVar) {
        return ((FlightRouteDetailsWidgetViewHolder$onAttach$1) create(favoriteEvent, dVar)).invokeSuspend(Unit.f71690a);
    }
}
