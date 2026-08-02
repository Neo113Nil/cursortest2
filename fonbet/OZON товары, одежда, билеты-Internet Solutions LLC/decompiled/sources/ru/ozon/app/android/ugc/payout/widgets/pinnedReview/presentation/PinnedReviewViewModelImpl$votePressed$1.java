package ru.ozon.app.android.ugc.payout.widgets.pinnedReview.presentation;

import Sc.r;
import Sc.s;
import Wc.a;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.e;
import kotlin.coroutines.jvm.internal.j;
import kotlin.jvm.functions.Function2;
import ru.ozon.app.android.action.v2.ActionV2Repository;
import ru.ozon.app.android.action.v2.models.ActionV2Request;
import xe.M;
import z00.g;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lxe/M;", "", "<anonymous>", "(Lxe/M;)V"}, k = 3, mv = {2, 0, 0})
@e(c = "ru.ozon.app.android.ugc.payout.widgets.pinnedReview.presentation.PinnedReviewViewModelImpl$votePressed$1", f = "PinnedReviewViewModel.kt", l = {79}, m = "invokeSuspend")
/* loaded from: classes2.dex */
final class PinnedReviewViewModelImpl$votePressed$1 extends j implements Function2<M, d<? super Unit>, Object> {
    final /* synthetic */ String $link;
    final /* synthetic */ Map<String, String> $params;
    final /* synthetic */ PinnedReviewViewModel$PreviousVoteState $previousState;
    int label;
    final /* synthetic */ PinnedReviewViewModelImpl this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    PinnedReviewViewModelImpl$votePressed$1(PinnedReviewViewModelImpl pinnedReviewViewModelImpl, Map<String, String> map, String str, PinnedReviewViewModel$PreviousVoteState pinnedReviewViewModel$PreviousVoteState, d<? super PinnedReviewViewModelImpl$votePressed$1> dVar) {
        super(2, dVar);
        this.this$0 = pinnedReviewViewModelImpl;
        this.$params = map;
        this.$link = str;
        this.$previousState = pinnedReviewViewModel$PreviousVoteState;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final d<Unit> create(Object obj, d<?> dVar) {
        return new PinnedReviewViewModelImpl$votePressed$1(this.this$0, this.$params, this.$link, this.$previousState, dVar);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        ActionV2Repository actionV2Repository;
        Object mo479requestActionResult0E7RQCE;
        a aVar = a.COROUTINE_SUSPENDED;
        int i11 = this.label;
        if (i11 == 0) {
            s.b(obj);
            actionV2Repository = this.this$0.actionV2Repository;
            ActionV2Request actionV2Request = new ActionV2Request(this.$params, this.$link, false, 4, null);
            this.label = 1;
            mo479requestActionResult0E7RQCE = actionV2Repository.mo479requestActionResult0E7RQCE(actionV2Request, Object.class, this);
            if (mo479requestActionResult0E7RQCE == aVar) {
                return aVar;
            }
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            s.b(obj);
            mo479requestActionResult0E7RQCE = ((r) obj).getF26106a();
        }
        PinnedReviewViewModelImpl pinnedReviewViewModelImpl = this.this$0;
        PinnedReviewViewModel$PreviousVoteState pinnedReviewViewModel$PreviousVoteState = this.$previousState;
        Throwable b11 = r.b(mo479requestActionResult0E7RQCE);
        if (b11 != null) {
            pinnedReviewViewModelImpl.revertVote(pinnedReviewViewModel$PreviousVoteState);
            Lm0.a.f17149a.e(b11);
            pinnedReviewViewModelImpl.getShowErrorEvent().postValue(g.c(b11) ? PinnedReviewViewModel$VoteError.NETWORK : PinnedReviewViewModel$VoteError.UNKNOWN);
        }
        this.this$0.previousState = null;
        return Unit.f71690a;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(M m11, d<? super Unit> dVar) {
        return ((PinnedReviewViewModelImpl$votePressed$1) create(m11, dVar)).invokeSuspend(Unit.f71690a);
    }
}
