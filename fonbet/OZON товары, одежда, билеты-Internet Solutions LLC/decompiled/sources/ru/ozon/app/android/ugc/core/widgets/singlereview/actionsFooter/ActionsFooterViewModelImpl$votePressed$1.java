package ru.ozon.app.android.ugc.core.widgets.singlereview.actionsFooter;

import Sc.r;
import Sc.s;
import Wc.a;
import com.google.android.gms.fido.u2f.api.common.RegisterRequest;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.e;
import kotlin.coroutines.jvm.internal.j;
import kotlin.jvm.functions.Function2;
import ru.ozon.app.android.action.v2.ActionV2Repository;
import ru.ozon.app.android.action.v2.models.ActionV2Request;
import ru.ozon.app.android.ugc.core.widgets.singlereview.actionsFooter.ActionsFooterViewModel$SingleEvent;
import xe.M;
import z00.g;
import ze.h;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lxe/M;", "", "<anonymous>", "(Lxe/M;)V"}, k = 3, mv = {2, 0, 0})
@e(c = "ru.ozon.app.android.ugc.core.widgets.singlereview.actionsFooter.ActionsFooterViewModelImpl$votePressed$1", f = "ActionsFooterViewModel.kt", l = {57, 77, RegisterRequest.U2F_V1_CHALLENGE_BYTE_LENGTH, 68, 70}, m = "invokeSuspend")
/* loaded from: classes2.dex */
final class ActionsFooterViewModelImpl$votePressed$1 extends j implements Function2<M, d<? super Unit>, Object> {
    final /* synthetic */ boolean $isLiked;
    final /* synthetic */ String $link;
    final /* synthetic */ Map<String, String> $params;
    final /* synthetic */ String $reactionId;
    final /* synthetic */ String $reviewUuid;
    Object L$0;
    Object L$1;
    Object L$2;
    int label;
    final /* synthetic */ ActionsFooterViewModelImpl this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ActionsFooterViewModelImpl$votePressed$1(ActionsFooterViewModelImpl actionsFooterViewModelImpl, String str, boolean z11, String str2, Map<String, String> map, String str3, d<? super ActionsFooterViewModelImpl$votePressed$1> dVar) {
        super(2, dVar);
        this.this$0 = actionsFooterViewModelImpl;
        this.$reviewUuid = str;
        this.$isLiked = z11;
        this.$reactionId = str2;
        this.$params = map;
        this.$link = str3;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final d<Unit> create(Object obj, d<?> dVar) {
        return new ActionsFooterViewModelImpl$votePressed$1(this.this$0, this.$reviewUuid, this.$isLiked, this.$reactionId, this.$params, this.$link, dVar);
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x00f6, code lost:
    
        if (r14.n(r3, r13) != r0) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x00aa, code lost:
    
        if (r14.n(r9, r13) == r0) goto L36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0084, code lost:
    
        if (r14 == r0) goto L36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0066, code lost:
    
        if (r14.n(r1, r13) == r0) goto L36;
     */
    /* JADX WARN: Removed duplicated region for block: B:21:0x00bc  */
    @Override // kotlin.coroutines.jvm.internal.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        h hVar;
        ActionV2Repository actionV2Repository;
        Object mo479requestActionResult0E7RQCE;
        Object obj2;
        h hVar2;
        Object obj3;
        Throwable b11;
        h hVar3;
        ActionsFooterViewModelImpl actionsFooterViewModelImpl;
        Throwable th2;
        h hVar4;
        a aVar = a.COROUTINE_SUSPENDED;
        int i11 = this.label;
        if (i11 == 0) {
            s.b(obj);
            this.this$0.processing = true;
            hVar = this.this$0._singleEvent;
            ActionsFooterViewModel$SingleEvent.SwitchControlState switchControlState = new ActionsFooterViewModel$SingleEvent.SwitchControlState(this.$reviewUuid, this.$isLiked, this.$reactionId);
            this.label = 1;
        } else if (i11 == 1) {
            s.b(obj);
        } else {
            if (i11 == 2) {
                s.b(obj);
                mo479requestActionResult0E7RQCE = ((r) obj).getF26106a();
                obj2 = mo479requestActionResult0E7RQCE;
                ActionsFooterViewModelImpl actionsFooterViewModelImpl2 = this.this$0;
                String str = this.$reviewUuid;
                boolean z11 = this.$isLiked;
                String str2 = this.$reactionId;
                r.Companion companion = r.INSTANCE;
                if (!(obj2 instanceof r.b)) {
                    hVar2 = actionsFooterViewModelImpl2._singleEvent;
                    ActionsFooterViewModel$SingleEvent.VoteSucceeded voteSucceeded = new ActionsFooterViewModel$SingleEvent.VoteSucceeded(str, z11, str2);
                    this.L$0 = obj2;
                    this.label = 3;
                }
                obj3 = obj2;
                ActionsFooterViewModelImpl actionsFooterViewModelImpl3 = this.this$0;
                String str3 = this.$reviewUuid;
                boolean z12 = this.$isLiked;
                String str4 = this.$reactionId;
                b11 = r.b(obj3);
                if (b11 != null) {
                }
                this.this$0.processing = false;
                return Unit.f71690a;
            }
            if (i11 == 3) {
                obj2 = this.L$0;
                s.b(obj);
                obj3 = obj2;
                ActionsFooterViewModelImpl actionsFooterViewModelImpl32 = this.this$0;
                String str32 = this.$reviewUuid;
                boolean z122 = this.$isLiked;
                String str42 = this.$reactionId;
                b11 = r.b(obj3);
                if (b11 != null) {
                    hVar3 = actionsFooterViewModelImpl32._singleEvent;
                    ActionsFooterViewModel$SingleEvent.SwitchControlState switchControlState2 = new ActionsFooterViewModel$SingleEvent.SwitchControlState(str32, !z122, str42);
                    this.L$0 = obj3;
                    this.L$1 = actionsFooterViewModelImpl32;
                    this.L$2 = b11;
                    this.label = 4;
                    if (hVar3.n(switchControlState2, this) != aVar) {
                        actionsFooterViewModelImpl = actionsFooterViewModelImpl32;
                        th2 = b11;
                        Lm0.a.f17149a.e(th2);
                        hVar4 = actionsFooterViewModelImpl._singleEvent;
                        ActionsFooterViewModel$SingleEvent.ShowError showError = new ActionsFooterViewModel$SingleEvent.ShowError(g.c(th2));
                        this.L$0 = obj3;
                        this.L$1 = null;
                        this.L$2 = null;
                        this.label = 5;
                    }
                    return aVar;
                }
                this.this$0.processing = false;
                return Unit.f71690a;
            }
            if (i11 != 4) {
                if (i11 != 5) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                s.b(obj);
                this.this$0.processing = false;
                return Unit.f71690a;
            }
            th2 = (Throwable) this.L$2;
            actionsFooterViewModelImpl = (ActionsFooterViewModelImpl) this.L$1;
            obj3 = this.L$0;
            s.b(obj);
            Lm0.a.f17149a.e(th2);
            hVar4 = actionsFooterViewModelImpl._singleEvent;
            ActionsFooterViewModel$SingleEvent.ShowError showError2 = new ActionsFooterViewModel$SingleEvent.ShowError(g.c(th2));
            this.L$0 = obj3;
            this.L$1 = null;
            this.L$2 = null;
            this.label = 5;
        }
        actionV2Repository = this.this$0.actionV2Repository;
        ActionV2Request actionV2Request = new ActionV2Request(this.$params, this.$link, false, 4, null);
        this.label = 2;
        mo479requestActionResult0E7RQCE = actionV2Repository.mo479requestActionResult0E7RQCE(actionV2Request, Object.class, this);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(M m11, d<? super Unit> dVar) {
        return ((ActionsFooterViewModelImpl$votePressed$1) create(m11, dVar)).invokeSuspend(Unit.f71690a);
    }
}
