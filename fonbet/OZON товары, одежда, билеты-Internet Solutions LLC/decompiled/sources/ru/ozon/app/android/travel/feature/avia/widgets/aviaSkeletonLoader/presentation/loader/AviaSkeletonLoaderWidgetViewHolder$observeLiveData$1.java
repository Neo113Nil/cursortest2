package ru.ozon.app.android.travel.feature.avia.widgets.aviaSkeletonLoader.presentation.loader;

import A00.e;
import Sc.o;
import Sc.s;
import Wc.a;
import androidx.recyclerview.widget.LinearLayoutManager;
import i10.h;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.e;
import kotlin.coroutines.jvm.internal.j;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import l10.InterfaceC7851b;
import l10.i;
import ru.ozon.app.android.travel.actionhandler.utils.NotificationBarUtilsKt;
import ru.ozon.app.android.travel.feature.avia.widgets.aviaSkeletonLoader.presentation.loader.AviaSkeletonLoaderWidgetViewModel;
import ru.ozon.uni.atoms.af.AtomAction;

@Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, d2 = {"<anonymous>", "", "result", "Lru/ozon/app/android/travel/feature/avia/widgets/aviaSkeletonLoader/presentation/loader/AviaSkeletonLoaderWidgetViewModel$ActionResult;"}, k = 3, mv = {2, 0, 0}, xi = 48)
@e(c = "ru.ozon.app.android.travel.feature.avia.widgets.aviaSkeletonLoader.presentation.loader.AviaSkeletonLoaderWidgetViewHolder$observeLiveData$1", f = "AviaSkeletonLoaderWidgetViewHolder.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes10.dex */
final class AviaSkeletonLoaderWidgetViewHolder$observeLiveData$1 extends j implements Function2<AviaSkeletonLoaderWidgetViewModel.ActionResult, d<? super Unit>, Object> {
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ AviaSkeletonLoaderWidgetViewHolder this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    AviaSkeletonLoaderWidgetViewHolder$observeLiveData$1(AviaSkeletonLoaderWidgetViewHolder aviaSkeletonLoaderWidgetViewHolder, d<? super AviaSkeletonLoaderWidgetViewHolder$observeLiveData$1> dVar) {
        super(2, dVar);
        this.this$0 = aviaSkeletonLoaderWidgetViewHolder;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final d<Unit> create(Object obj, d<?> dVar) {
        AviaSkeletonLoaderWidgetViewHolder$observeLiveData$1 aviaSkeletonLoaderWidgetViewHolder$observeLiveData$1 = new AviaSkeletonLoaderWidgetViewHolder$observeLiveData$1(this.this$0, dVar);
        aviaSkeletonLoaderWidgetViewHolder$observeLiveData$1.L$0 = obj;
        return aviaSkeletonLoaderWidgetViewHolder$observeLiveData$1;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        i iVar;
        AviaSkeletonLoaderWidgetViewModel aviaSkeletonLoaderWidgetViewModel;
        Function1 function1;
        i iVar2;
        int i11;
        LinearLayoutManager linearLayoutManager;
        a aVar = a.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        s.b(obj);
        AviaSkeletonLoaderWidgetViewModel.ActionResult actionResult = (AviaSkeletonLoaderWidgetViewModel.ActionResult) this.L$0;
        if (actionResult instanceof AviaSkeletonLoaderWidgetViewModel.ActionResult.Action) {
            AviaSkeletonLoaderWidgetViewModel.ActionResult.Action action = (AviaSkeletonLoaderWidgetViewModel.ActionResult.Action) actionResult;
            if (action.getAction() instanceof AtomAction.Refresh) {
                iVar2 = this.this$0.container;
                InterfaceC7851b M11 = iVar2.M();
                String link = ((AtomAction.Refresh) action.getAction()).getLink();
                e.a aVar2 = new e.a();
                aVar2.h();
                i11 = this.this$0.dp16;
                aVar2.d(i11);
                linearLayoutManager = this.this$0.composerLlm;
                aVar2.g(linearLayoutManager != null ? linearLayoutManager.findFirstCompletelyVisibleItemPosition() : 0);
                InterfaceC7851b.a.a(M11, link, null, null, new h.b(aVar2.b()), 6);
            } else {
                function1 = this.this$0.actionHandler;
                function1.invoke(action.getAction());
            }
        } else if (Intrinsics.d(actionResult, AviaSkeletonLoaderWidgetViewModel.ActionResult.RepeatRequest.INSTANCE)) {
            aviaSkeletonLoaderWidgetViewModel = this.this$0.viewModel;
            AviaSkeletonLoaderVO boundData = this.this$0.getBoundData();
            aviaSkeletonLoaderWidgetViewModel.performAction(boundData != null ? boundData.getAction() : null, this.this$0.getTrackingData());
        } else {
            if (!Intrinsics.d(actionResult, AviaSkeletonLoaderWidgetViewModel.ActionResult.Error.INSTANCE)) {
                throw new o();
            }
            iVar = this.this$0.container;
            NotificationBarUtilsKt.showDefaultError(iVar.Q());
        }
        return Unit.f71690a;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(AviaSkeletonLoaderWidgetViewModel.ActionResult actionResult, d<? super Unit> dVar) {
        return ((AviaSkeletonLoaderWidgetViewHolder$observeLiveData$1) create(actionResult, dVar)).invokeSuspend(Unit.f71690a);
    }
}
