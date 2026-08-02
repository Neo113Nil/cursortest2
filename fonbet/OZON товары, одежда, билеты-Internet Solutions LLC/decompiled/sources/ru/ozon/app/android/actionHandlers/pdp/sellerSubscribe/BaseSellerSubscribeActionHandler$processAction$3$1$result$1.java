package ru.ozon.app.android.actionHandlers.pdp.sellerSubscribe;

import Ge.f;
import Sc.s;
import Wc.a;
import io.reactivex.y;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.e;
import kotlin.coroutines.jvm.internal.j;
import kotlin.jvm.functions.Function2;
import ru.ozon.app.android.action.v2.ActionV2Repository;
import ru.ozon.app.android.action.v2.models.ActionV2Request;
import ru.ozon.app.android.action.v2.models.ActionV2Response;
import ru.ozon.app.android.actionHandlers.pdp.sellerSubscribe.data.SisLikeResponse;
import ru.ozon.uni.atoms.af.AtomAction;
import xe.M;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u0016\u0012\u0004\u0012\u00020\u0002 \u0003*\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00010\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lxe/M;", "Lru/ozon/app/android/action/v2/models/ActionV2Response;", "Lru/ozon/app/android/actionHandlers/pdp/sellerSubscribe/data/SisLikeResponse;", "kotlin.jvm.PlatformType", "<anonymous>", "(Lxe/M;)Lru/ozon/app/android/action/v2/models/ActionV2Response;"}, k = 3, mv = {2, 0, 0})
@e(c = "ru.ozon.app.android.actionHandlers.pdp.sellerSubscribe.BaseSellerSubscribeActionHandler$processAction$3$1$result$1", f = "BaseSellerSubscribeActionHandler.kt", l = {88}, m = "invokeSuspend")
/* loaded from: classes11.dex */
final class BaseSellerSubscribeActionHandler$processAction$3$1$result$1 extends j implements Function2<M, d<? super ActionV2Response<SisLikeResponse>>, Object> {
    final /* synthetic */ AtomAction $action;
    int label;
    final /* synthetic */ BaseSellerSubscribeActionHandler this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    BaseSellerSubscribeActionHandler$processAction$3$1$result$1(AtomAction atomAction, BaseSellerSubscribeActionHandler baseSellerSubscribeActionHandler, d<? super BaseSellerSubscribeActionHandler$processAction$3$1$result$1> dVar) {
        super(2, dVar);
        this.$action = atomAction;
        this.this$0 = baseSellerSubscribeActionHandler;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final d<Unit> create(Object obj, d<?> dVar) {
        return new BaseSellerSubscribeActionHandler$processAction$3$1$result$1(this.$action, this.this$0, dVar);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        ActionV2Repository actionV2Repository;
        a aVar = a.COROUTINE_SUSPENDED;
        int i11 = this.label;
        if (i11 != 0) {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            s.b(obj);
            return obj;
        }
        s.b(obj);
        ActionV2Request actionV2Request = new ActionV2Request(((AtomAction.ComposerAction) this.$action).getParams(), ((AtomAction.ComposerAction) this.$action).getActionName(), false, 4, null);
        actionV2Repository = this.this$0.actionV2Repository;
        y callAction = actionV2Repository.callAction(actionV2Request, SisLikeResponse.class);
        this.label = 1;
        Object b11 = f.b(callAction, this);
        return b11 == aVar ? aVar : b11;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(M m11, d<? super ActionV2Response<SisLikeResponse>> dVar) {
        return ((BaseSellerSubscribeActionHandler$processAction$3$1$result$1) create(m11, dVar)).invokeSuspend(Unit.f71690a);
    }
}
