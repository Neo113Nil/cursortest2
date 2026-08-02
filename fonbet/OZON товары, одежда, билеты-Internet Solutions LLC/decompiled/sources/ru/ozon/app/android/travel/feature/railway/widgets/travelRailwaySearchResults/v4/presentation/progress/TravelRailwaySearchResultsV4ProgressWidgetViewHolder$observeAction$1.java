package ru.ozon.app.android.travel.feature.railway.widgets.travelRailwaySearchResults.v4.presentation.progress;

import Sc.o;
import Sc.s;
import Wc.a;
import androidx.lifecycle.D;
import androidx.lifecycle.K;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.e;
import kotlin.coroutines.jvm.internal.j;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import l10.i;
import ru.ozon.app.android.travel.actionhandler.utils.NotificationBarUtilsKt;
import ru.ozon.app.android.travel.feature.railway.widgets.travelRailwaySearchResults.v4.presentation.progress.TravelRailwaySearchResultsV4ProgressViewModel;
import ru.ozon.app.android.travel.feature.railway.widgets.travelRailwaySearchResults.v4.presentation.progress.view.TravelRailwaySearchResultsV4LoaderView;
import ru.ozon.uni.atoms.af.AtomAction;

@Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, d2 = {"<anonymous>", "", "action", "Lru/ozon/app/android/travel/feature/railway/widgets/travelRailwaySearchResults/v4/presentation/progress/TravelRailwaySearchResultsV4ProgressViewModel$Action;"}, k = 3, mv = {2, 0, 0}, xi = 48)
@e(c = "ru.ozon.app.android.travel.feature.railway.widgets.travelRailwaySearchResults.v4.presentation.progress.TravelRailwaySearchResultsV4ProgressWidgetViewHolder$observeAction$1", f = "TravelRailwaySearchResultsV4ProgressWidgetViewHolder.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes4.dex */
final class TravelRailwaySearchResultsV4ProgressWidgetViewHolder$observeAction$1 extends j implements Function2<TravelRailwaySearchResultsV4ProgressViewModel.Action, d<? super Unit>, Object> {
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ TravelRailwaySearchResultsV4ProgressWidgetViewHolder this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    TravelRailwaySearchResultsV4ProgressWidgetViewHolder$observeAction$1(TravelRailwaySearchResultsV4ProgressWidgetViewHolder travelRailwaySearchResultsV4ProgressWidgetViewHolder, d<? super TravelRailwaySearchResultsV4ProgressWidgetViewHolder$observeAction$1> dVar) {
        super(2, dVar);
        this.this$0 = travelRailwaySearchResultsV4ProgressWidgetViewHolder;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final d<Unit> create(Object obj, d<?> dVar) {
        TravelRailwaySearchResultsV4ProgressWidgetViewHolder$observeAction$1 travelRailwaySearchResultsV4ProgressWidgetViewHolder$observeAction$1 = new TravelRailwaySearchResultsV4ProgressWidgetViewHolder$observeAction$1(this.this$0, dVar);
        travelRailwaySearchResultsV4ProgressWidgetViewHolder$observeAction$1.L$0 = obj;
        return travelRailwaySearchResultsV4ProgressWidgetViewHolder$observeAction$1;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        TravelRailwaySearchResultsV4LoaderView travelRailwaySearchResultsV4LoaderView;
        Function1<? super AtomAction, Unit> function1;
        i iVar;
        TravelRailwaySearchResultsV4LoaderView travelRailwaySearchResultsV4LoaderView2;
        a aVar = a.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        s.b(obj);
        TravelRailwaySearchResultsV4ProgressViewModel.Action action = (TravelRailwaySearchResultsV4ProgressViewModel.Action) this.L$0;
        if (Intrinsics.d(action, TravelRailwaySearchResultsV4ProgressViewModel.Action.Error.INSTANCE)) {
            iVar = this.this$0.composerScreenUiContainer;
            NotificationBarUtilsKt.showDefaultError(iVar.Q());
            travelRailwaySearchResultsV4LoaderView2 = this.this$0.containerView;
            travelRailwaySearchResultsV4LoaderView2.cancelAnimation();
        } else {
            if (!(action instanceof TravelRailwaySearchResultsV4ProgressViewModel.Action.Success)) {
                throw new o();
            }
            travelRailwaySearchResultsV4LoaderView = this.this$0.containerView;
            D a11 = K.a(this.this$0);
            function1 = this.this$0.actionHandler;
            travelRailwaySearchResultsV4LoaderView.completeAnimationAndRefresh(a11, function1, ((TravelRailwaySearchResultsV4ProgressViewModel.Action.Success) action).getAtomAction());
        }
        return Unit.f71690a;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(TravelRailwaySearchResultsV4ProgressViewModel.Action action, d<? super Unit> dVar) {
        return ((TravelRailwaySearchResultsV4ProgressWidgetViewHolder$observeAction$1) create(action, dVar)).invokeSuspend(Unit.f71690a);
    }
}
