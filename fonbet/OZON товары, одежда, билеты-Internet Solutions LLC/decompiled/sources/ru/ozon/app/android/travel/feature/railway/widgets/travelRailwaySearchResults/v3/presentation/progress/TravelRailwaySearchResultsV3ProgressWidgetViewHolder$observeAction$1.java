package ru.ozon.app.android.travel.feature.railway.widgets.travelRailwaySearchResults.v3.presentation.progress;

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
import ru.ozon.app.android.travel.feature.railway.widgets.travelRailwaySearchResults.v3.presentation.progress.TravelRailwaySearchResultsV3ProgressViewModel;
import ru.ozon.app.android.travel.feature.railway.widgets.travelRailwaySearchResults.v3.presentation.progress.view.TravelRailwaySearchResultsV3LoaderView;
import ru.ozon.uni.atoms.af.AtomAction;

@Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, d2 = {"<anonymous>", "", "action", "Lru/ozon/app/android/travel/feature/railway/widgets/travelRailwaySearchResults/v3/presentation/progress/TravelRailwaySearchResultsV3ProgressViewModel$Action;"}, k = 3, mv = {2, 0, 0}, xi = 48)
@e(c = "ru.ozon.app.android.travel.feature.railway.widgets.travelRailwaySearchResults.v3.presentation.progress.TravelRailwaySearchResultsV3ProgressWidgetViewHolder$observeAction$1", f = "TravelRailwaySearchResultsV3ProgressWidgetViewHolder.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes4.dex */
final class TravelRailwaySearchResultsV3ProgressWidgetViewHolder$observeAction$1 extends j implements Function2<TravelRailwaySearchResultsV3ProgressViewModel.Action, d<? super Unit>, Object> {
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ TravelRailwaySearchResultsV3ProgressWidgetViewHolder this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    TravelRailwaySearchResultsV3ProgressWidgetViewHolder$observeAction$1(TravelRailwaySearchResultsV3ProgressWidgetViewHolder travelRailwaySearchResultsV3ProgressWidgetViewHolder, d<? super TravelRailwaySearchResultsV3ProgressWidgetViewHolder$observeAction$1> dVar) {
        super(2, dVar);
        this.this$0 = travelRailwaySearchResultsV3ProgressWidgetViewHolder;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final d<Unit> create(Object obj, d<?> dVar) {
        TravelRailwaySearchResultsV3ProgressWidgetViewHolder$observeAction$1 travelRailwaySearchResultsV3ProgressWidgetViewHolder$observeAction$1 = new TravelRailwaySearchResultsV3ProgressWidgetViewHolder$observeAction$1(this.this$0, dVar);
        travelRailwaySearchResultsV3ProgressWidgetViewHolder$observeAction$1.L$0 = obj;
        return travelRailwaySearchResultsV3ProgressWidgetViewHolder$observeAction$1;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        TravelRailwaySearchResultsV3LoaderView travelRailwaySearchResultsV3LoaderView;
        Function1<? super AtomAction, Unit> function1;
        i iVar;
        TravelRailwaySearchResultsV3LoaderView travelRailwaySearchResultsV3LoaderView2;
        a aVar = a.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        s.b(obj);
        TravelRailwaySearchResultsV3ProgressViewModel.Action action = (TravelRailwaySearchResultsV3ProgressViewModel.Action) this.L$0;
        if (Intrinsics.d(action, TravelRailwaySearchResultsV3ProgressViewModel.Action.Error.INSTANCE)) {
            iVar = this.this$0.composerScreenUiContainer;
            NotificationBarUtilsKt.showDefaultError(iVar.Q());
            travelRailwaySearchResultsV3LoaderView2 = this.this$0.containerView;
            travelRailwaySearchResultsV3LoaderView2.cancelAnimation();
        } else {
            if (!(action instanceof TravelRailwaySearchResultsV3ProgressViewModel.Action.Success)) {
                throw new o();
            }
            travelRailwaySearchResultsV3LoaderView = this.this$0.containerView;
            D a11 = K.a(this.this$0);
            function1 = this.this$0.actionHandler;
            travelRailwaySearchResultsV3LoaderView.completeAnimationAndRefresh(a11, function1, ((TravelRailwaySearchResultsV3ProgressViewModel.Action.Success) action).getAtomAction());
        }
        return Unit.f71690a;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(TravelRailwaySearchResultsV3ProgressViewModel.Action action, d<? super Unit> dVar) {
        return ((TravelRailwaySearchResultsV3ProgressWidgetViewHolder$observeAction$1) create(action, dVar)).invokeSuspend(Unit.f71690a);
    }
}
