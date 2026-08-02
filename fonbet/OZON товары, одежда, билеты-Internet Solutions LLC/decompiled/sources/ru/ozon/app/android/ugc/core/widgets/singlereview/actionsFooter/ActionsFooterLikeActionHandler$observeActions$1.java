package ru.ozon.app.android.ugc.core.widgets.singlereview.actionsFooter;

import Sc.o;
import Sc.s;
import Wc.a;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.e;
import kotlin.coroutines.jvm.internal.j;
import kotlin.jvm.functions.Function2;
import ru.ozon.app.android.action.custom.CustomActionHandler;
import ru.ozon.app.android.ugc.core.widgets.common.UgcCachedActionsSharedViewModel;
import ru.ozon.app.android.ugc.core.widgets.singlereview.actionsFooter.ActionsFooterViewModel$SingleEvent;

@Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, d2 = {"<anonymous>", "", "state", "Lru/ozon/app/android/ugc/core/widgets/singlereview/actionsFooter/ActionsFooterViewModel$SingleEvent;"}, k = 3, mv = {2, 0, 0}, xi = 48)
@e(c = "ru.ozon.app.android.ugc.core.widgets.singlereview.actionsFooter.ActionsFooterLikeActionHandler$observeActions$1", f = "ActionsFooterLikeActionHandler.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes2.dex */
final class ActionsFooterLikeActionHandler$observeActions$1 extends j implements Function2<ActionsFooterViewModel$SingleEvent, d<? super Unit>, Object> {
    final /* synthetic */ CustomActionHandler.HandlerReferences $handlerRefs;
    final /* synthetic */ UgcCachedActionsSharedViewModel $viewModel;
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ ActionsFooterLikeActionHandler this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ActionsFooterLikeActionHandler$observeActions$1(ActionsFooterLikeActionHandler actionsFooterLikeActionHandler, CustomActionHandler.HandlerReferences handlerReferences, UgcCachedActionsSharedViewModel ugcCachedActionsSharedViewModel, d<? super ActionsFooterLikeActionHandler$observeActions$1> dVar) {
        super(2, dVar);
        this.this$0 = actionsFooterLikeActionHandler;
        this.$handlerRefs = handlerReferences;
        this.$viewModel = ugcCachedActionsSharedViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final d<Unit> create(Object obj, d<?> dVar) {
        ActionsFooterLikeActionHandler$observeActions$1 actionsFooterLikeActionHandler$observeActions$1 = new ActionsFooterLikeActionHandler$observeActions$1(this.this$0, this.$handlerRefs, this.$viewModel, dVar);
        actionsFooterLikeActionHandler$observeActions$1.L$0 = obj;
        return actionsFooterLikeActionHandler$observeActions$1;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        a aVar = a.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        s.b(obj);
        ActionsFooterViewModel$SingleEvent actionsFooterViewModel$SingleEvent = (ActionsFooterViewModel$SingleEvent) this.L$0;
        if (actionsFooterViewModel$SingleEvent instanceof ActionsFooterViewModel$SingleEvent.ShowError) {
            this.this$0.showErrorNotification(this.$handlerRefs.getRefs(), ((ActionsFooterViewModel$SingleEvent.ShowError) actionsFooterViewModel$SingleEvent).getIsNetworkError());
        } else if (actionsFooterViewModel$SingleEvent instanceof ActionsFooterViewModel$SingleEvent.SwitchControlState) {
            ActionsFooterViewModel$SingleEvent.SwitchControlState switchControlState = (ActionsFooterViewModel$SingleEvent.SwitchControlState) actionsFooterViewModel$SingleEvent;
            this.$handlerRefs.getRefs().getController().update(new ActionsFooterStateUpdateKey(switchControlState.getReviewUuid(), switchControlState.getIsLiked(), switchControlState.getReactionId()));
        } else {
            if (!(actionsFooterViewModel$SingleEvent instanceof ActionsFooterViewModel$SingleEvent.VoteSucceeded)) {
                throw new o();
            }
            UgcCachedActionsSharedViewModel ugcCachedActionsSharedViewModel = this.$viewModel;
            ActionsFooterViewModel$SingleEvent.VoteSucceeded voteSucceeded = (ActionsFooterViewModel$SingleEvent.VoteSucceeded) actionsFooterViewModel$SingleEvent;
            String reviewUuid = voteSucceeded.getReviewUuid();
            boolean isLiked = voteSucceeded.getIsLiked();
            String reactionId = voteSucceeded.getReactionId();
            if (reactionId == null) {
                reactionId = "like";
            }
            ugcCachedActionsSharedViewModel.saveActionState(reviewUuid, isLiked, reactionId);
        }
        return Unit.f71690a;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(ActionsFooterViewModel$SingleEvent actionsFooterViewModel$SingleEvent, d<? super Unit> dVar) {
        return ((ActionsFooterLikeActionHandler$observeActions$1) create(actionsFooterViewModel$SingleEvent, dVar)).invokeSuspend(Unit.f71690a);
    }
}
