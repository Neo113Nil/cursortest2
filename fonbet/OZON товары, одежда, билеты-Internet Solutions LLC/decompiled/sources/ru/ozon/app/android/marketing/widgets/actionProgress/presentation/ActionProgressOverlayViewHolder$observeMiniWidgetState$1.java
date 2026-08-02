package ru.ozon.app.android.marketing.widgets.actionProgress.presentation;

import Sc.s;
import Wc.a;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.e;
import kotlin.coroutines.jvm.internal.j;
import kotlin.jvm.functions.Function2;
import l10.InterfaceC7851b;
import l10.i;
import ru.ozon.app.android.marketing.widgets.actionProgress.core.ActionProgressUpdateState;
import ru.ozon.app.android.marketing.widgets.cartButton.core.CartButtonUpdateState;
import ru.ozon.app.android.marketing.widgets.cartButton.data.CartButtonDTO;
import ru.ozon.app.android.marketing.widgets.highlightsWrapper.data.HighlightsWrapperAsyncState;

@Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, d2 = {"<anonymous>", "", "asyncState", "Lru/ozon/app/android/marketing/widgets/highlightsWrapper/data/HighlightsWrapperAsyncState;"}, k = 3, mv = {2, 0, 0}, xi = 48)
@e(c = "ru.ozon.app.android.marketing.widgets.actionProgress.presentation.ActionProgressOverlayViewHolder$observeMiniWidgetState$1", f = "ActionProgressOverlayViewHolder.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes12.dex */
final class ActionProgressOverlayViewHolder$observeMiniWidgetState$1 extends j implements Function2<HighlightsWrapperAsyncState, d<? super Unit>, Object> {
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ ActionProgressOverlayViewHolder this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ActionProgressOverlayViewHolder$observeMiniWidgetState$1(ActionProgressOverlayViewHolder actionProgressOverlayViewHolder, d<? super ActionProgressOverlayViewHolder$observeMiniWidgetState$1> dVar) {
        super(2, dVar);
        this.this$0 = actionProgressOverlayViewHolder;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final d<Unit> create(Object obj, d<?> dVar) {
        ActionProgressOverlayViewHolder$observeMiniWidgetState$1 actionProgressOverlayViewHolder$observeMiniWidgetState$1 = new ActionProgressOverlayViewHolder$observeMiniWidgetState$1(this.this$0, dVar);
        actionProgressOverlayViewHolder$observeMiniWidgetState$1.L$0 = obj;
        return actionProgressOverlayViewHolder$observeMiniWidgetState$1;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        i iVar;
        i iVar2;
        i iVar3;
        a aVar = a.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        s.b(obj);
        HighlightsWrapperAsyncState highlightsWrapperAsyncState = (HighlightsWrapperAsyncState) this.L$0;
        if (highlightsWrapperAsyncState instanceof HighlightsWrapperAsyncState.NetworkException) {
            iVar3 = this.this$0.container;
            InterfaceC7851b.a.a(iVar3.M(), null, null, null, null, 15);
        } else if (highlightsWrapperAsyncState instanceof HighlightsWrapperAsyncState.Success) {
            iVar = this.this$0.container;
            HighlightsWrapperAsyncState.Success success = (HighlightsWrapperAsyncState.Success) highlightsWrapperAsyncState;
            iVar.M().update(new ActionProgressUpdateState(success.getState().getActionProgress()));
            iVar2 = this.this$0.container;
            iVar2.M().update(new CartButtonUpdateState(new CartButtonDTO(success.getState().getCartButton())));
        } else if (highlightsWrapperAsyncState instanceof HighlightsWrapperAsyncState.ParseException) {
            Lm0.a.f17149a.e("HighlightsWrapperDTO parse exception", new Object[0]);
        }
        return Unit.f71690a;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(HighlightsWrapperAsyncState highlightsWrapperAsyncState, d<? super Unit> dVar) {
        return ((ActionProgressOverlayViewHolder$observeMiniWidgetState$1) create(highlightsWrapperAsyncState, dVar)).invokeSuspend(Unit.f71690a);
    }
}
