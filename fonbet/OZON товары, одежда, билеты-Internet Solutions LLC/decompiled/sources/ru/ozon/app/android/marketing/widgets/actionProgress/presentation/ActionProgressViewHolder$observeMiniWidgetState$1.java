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
import ru.ozon.app.android.composer.ComposerReferences;
import ru.ozon.app.android.marketing.widgets.actionProgress.core.ActionProgressUpdateState;
import ru.ozon.app.android.marketing.widgets.cartButton.core.CartButtonUpdateState;
import ru.ozon.app.android.marketing.widgets.cartButton.data.CartButtonDTO;
import ru.ozon.app.android.marketing.widgets.highlightsWrapper.data.HighlightsWrapperAsyncState;

@Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, d2 = {"<anonymous>", "", "asyncState", "Lru/ozon/app/android/marketing/widgets/highlightsWrapper/data/HighlightsWrapperAsyncState;"}, k = 3, mv = {2, 0, 0}, xi = 48)
@e(c = "ru.ozon.app.android.marketing.widgets.actionProgress.presentation.ActionProgressViewHolder$observeMiniWidgetState$1", f = "ActionProgressViewHolder.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes12.dex */
final class ActionProgressViewHolder$observeMiniWidgetState$1 extends j implements Function2<HighlightsWrapperAsyncState, d<? super Unit>, Object> {
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ ActionProgressViewHolder this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ActionProgressViewHolder$observeMiniWidgetState$1(ActionProgressViewHolder actionProgressViewHolder, d<? super ActionProgressViewHolder$observeMiniWidgetState$1> dVar) {
        super(2, dVar);
        this.this$0 = actionProgressViewHolder;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final d<Unit> create(Object obj, d<?> dVar) {
        ActionProgressViewHolder$observeMiniWidgetState$1 actionProgressViewHolder$observeMiniWidgetState$1 = new ActionProgressViewHolder$observeMiniWidgetState$1(this.this$0, dVar);
        actionProgressViewHolder$observeMiniWidgetState$1.L$0 = obj;
        return actionProgressViewHolder$observeMiniWidgetState$1;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        ComposerReferences composerReferences;
        ComposerReferences composerReferences2;
        ComposerReferences composerReferences3;
        a aVar = a.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        s.b(obj);
        HighlightsWrapperAsyncState highlightsWrapperAsyncState = (HighlightsWrapperAsyncState) this.L$0;
        if (highlightsWrapperAsyncState instanceof HighlightsWrapperAsyncState.NetworkException) {
            composerReferences3 = this.this$0.refs;
            InterfaceC7851b.a.a(composerReferences3.getController(), null, null, null, null, 15);
        } else if (highlightsWrapperAsyncState instanceof HighlightsWrapperAsyncState.Success) {
            composerReferences = this.this$0.refs;
            HighlightsWrapperAsyncState.Success success = (HighlightsWrapperAsyncState.Success) highlightsWrapperAsyncState;
            composerReferences.getController().update(new ActionProgressUpdateState(success.getState().getActionProgress()));
            composerReferences2 = this.this$0.refs;
            composerReferences2.getController().update(new CartButtonUpdateState(new CartButtonDTO(success.getState().getCartButton())));
        }
        return Unit.f71690a;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(HighlightsWrapperAsyncState highlightsWrapperAsyncState, d<? super Unit> dVar) {
        return ((ActionProgressViewHolder$observeMiniWidgetState$1) create(highlightsWrapperAsyncState, dVar)).invokeSuspend(Unit.f71690a);
    }
}
