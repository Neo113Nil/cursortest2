package ru.ozon.app.android.pdp.ui.configurators.ugc.singleReview;

import Sc.r;
import Sc.s;
import Wc.a;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.e;
import kotlin.coroutines.jvm.internal.j;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.app.android.action.v2.ActionV2Repository;
import ru.ozon.app.android.action.v2.models.ActionV2Request;
import ru.ozon.app.android.action.v2.models.ActionV2Response;
import ru.ozon.app.android.pdp.ui.configurators.ugc.ActionName;
import ru.ozon.app.android.pdp.ui.configurators.ugc.data.Vote;
import ru.ozon.app.android.pdp.ui.configurators.ugc.data.VoteResponse;
import ru.ozon.app.android.storage.auth.AuthStateStorage;
import ru.ozon.uni.atoms.af.AtomAction;
import xe.M;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lxe/M;", "", "<anonymous>", "(Lxe/M;)V"}, k = 3, mv = {2, 0, 0})
@e(c = "ru.ozon.app.android.pdp.ui.configurators.ugc.singleReview.SingleReviewViewModelImpl$sendVote$1", f = "SingleReviewViewModel.kt", l = {178}, m = "invokeSuspend")
/* loaded from: classes13.dex */
final class SingleReviewViewModelImpl$sendVote$1 extends j implements Function2<M, d<? super Unit>, Object> {
    final /* synthetic */ ButtonsVO $item;
    final /* synthetic */ Vote $vote;
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ SingleReviewViewModelImpl this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    SingleReviewViewModelImpl$sendVote$1(SingleReviewViewModelImpl singleReviewViewModelImpl, ButtonsVO buttonsVO, Vote vote, d<? super SingleReviewViewModelImpl$sendVote$1> dVar) {
        super(2, dVar);
        this.this$0 = singleReviewViewModelImpl;
        this.$item = buttonsVO;
        this.$vote = vote;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final d<Unit> create(Object obj, d<?> dVar) {
        SingleReviewViewModelImpl$sendVote$1 singleReviewViewModelImpl$sendVote$1 = new SingleReviewViewModelImpl$sendVote$1(this.this$0, this.$item, this.$vote, dVar);
        singleReviewViewModelImpl$sendVote$1.L$0 = obj;
        return singleReviewViewModelImpl$sendVote$1;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        Object a11;
        AuthStateStorage authStateStorage;
        ActionV2Request actionV2Request;
        ActionV2Repository actionV2Repository;
        a aVar = a.COROUTINE_SUSPENDED;
        int i11 = this.label;
        try {
        } catch (Throwable th2) {
            r.Companion companion = r.INSTANCE;
            a11 = s.a(th2);
        }
        if (i11 == 0) {
            s.b(obj);
            this.this$0.isProcessingAction = true;
            authStateStorage = this.this$0.authManager;
            if (!authStateStorage.isAuthenticated()) {
                this.this$0.openAuthPage();
                return Unit.f71690a;
            }
            ButtonsVO buttonsVO = this.$item;
            Vote vote = this.$vote;
            SingleReviewViewModelImpl singleReviewViewModelImpl = this.this$0;
            r.Companion companion2 = r.INSTANCE;
            AtomAction rateUsefulnessAction = buttonsVO.getRateUsefulnessAction();
            AtomAction.ComposerAction composerAction = rateUsefulnessAction instanceof AtomAction.ComposerAction ? (AtomAction.ComposerAction) rateUsefulnessAction : null;
            if (composerAction != null) {
                Tc.d builder = new Tc.d();
                Map<String, String> params = composerAction.getParams();
                if (params != null) {
                    builder.putAll(params);
                }
                builder.put("reviewUuid", vote.getReviewUuid());
                builder.put("itemId", new Long(vote.getItemId()));
                builder.put(AppMeasurementSdk.ConditionalUserProperty.VALUE, vote.getValue());
                Intrinsics.checkNotNullParameter(builder, "builder");
                actionV2Request = new ActionV2Request(builder.u(), composerAction.getActionName(), false, 4, null);
            } else {
                actionV2Request = new ActionV2Request(vote, ActionName.VOTE_ACTION_NAME.getAction(), false, 4, null);
            }
            actionV2Repository = singleReviewViewModelImpl.actionV2Repository;
            this.label = 1;
            obj = actionV2Repository.callActionSuspend(actionV2Request, VoteResponse.class, this);
            if (obj == aVar) {
                return aVar;
            }
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            s.b(obj);
        }
        a11 = (VoteResponse) ((ActionV2Response) obj).getData();
        r.Companion companion3 = r.INSTANCE;
        Throwable b11 = r.b(a11);
        if (b11 != null) {
            a11 = s.a(b11);
        } else if (a11 == null) {
            a11 = s.a(new IllegalStateException("Result value is null"));
        }
        SingleReviewViewModelImpl singleReviewViewModelImpl2 = this.this$0;
        ButtonsVO buttonsVO2 = this.$item;
        if (!(a11 instanceof r.b)) {
            singleReviewViewModelImpl2.updateVote(buttonsVO2, (VoteResponse) a11);
        }
        SingleReviewViewModelImpl singleReviewViewModelImpl3 = this.this$0;
        Throwable b12 = r.b(a11);
        if (b12 != null) {
            singleReviewViewModelImpl3.handleError(b12);
        }
        return Unit.f71690a;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(M m11, d<? super Unit> dVar) {
        return ((SingleReviewViewModelImpl$sendVote$1) create(m11, dVar)).invokeSuspend(Unit.f71690a);
    }
}
