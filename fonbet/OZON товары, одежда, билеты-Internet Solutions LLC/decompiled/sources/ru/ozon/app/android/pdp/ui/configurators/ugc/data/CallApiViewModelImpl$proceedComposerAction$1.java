package ru.ozon.app.android.pdp.ui.configurators.ugc.data;

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
import xe.M;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lxe/M;", "", "<anonymous>", "(Lxe/M;)V"}, k = 3, mv = {2, 0, 0})
@e(c = "ru.ozon.app.android.pdp.ui.configurators.ugc.data.CallApiViewModelImpl$proceedComposerAction$1", f = "CallApiViewModel.kt", l = {47}, m = "invokeSuspend")
/* loaded from: classes13.dex */
final class CallApiViewModelImpl$proceedComposerAction$1 extends j implements Function2<M, d<? super Unit>, Object> {
    final /* synthetic */ String $actionName;
    final /* synthetic */ ActionType $actionType;
    final /* synthetic */ long $id;
    final /* synthetic */ Map<String, String> $params;
    int label;
    final /* synthetic */ CallApiViewModelImpl this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    CallApiViewModelImpl$proceedComposerAction$1(CallApiViewModelImpl callApiViewModelImpl, String str, Map<String, String> map, ActionType actionType, long j11, d<? super CallApiViewModelImpl$proceedComposerAction$1> dVar) {
        super(2, dVar);
        this.this$0 = callApiViewModelImpl;
        this.$actionName = str;
        this.$params = map;
        this.$actionType = actionType;
        this.$id = j11;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final d<Unit> create(Object obj, d<?> dVar) {
        return new CallApiViewModelImpl$proceedComposerAction$1(this.this$0, this.$actionName, this.$params, this.$actionType, this.$id, dVar);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        ProductReviewRepository productReviewRepository;
        Object m874processAction0E7RQCE;
        a aVar = a.COROUTINE_SUSPENDED;
        int i11 = this.label;
        if (i11 == 0) {
            s.b(obj);
            productReviewRepository = this.this$0.productReviewRepository;
            String str = this.$actionName;
            Map<String, String> map = this.$params;
            this.label = 1;
            m874processAction0E7RQCE = productReviewRepository.m874processAction0E7RQCE(str, map, this);
            if (m874processAction0E7RQCE == aVar) {
                return aVar;
            }
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            s.b(obj);
            m874processAction0E7RQCE = ((r) obj).getF26106a();
        }
        CallApiViewModelImpl callApiViewModelImpl = this.this$0;
        ActionType actionType = this.$actionType;
        long j11 = this.$id;
        r.Companion companion = r.INSTANCE;
        if (!(m874processAction0E7RQCE instanceof r.b)) {
            callApiViewModelImpl.onSuccess(actionType, j11);
        }
        CallApiViewModelImpl callApiViewModelImpl2 = this.this$0;
        ActionType actionType2 = this.$actionType;
        long j12 = this.$id;
        Throwable b11 = r.b(m874processAction0E7RQCE);
        if (b11 != null) {
            callApiViewModelImpl2.onFailure(b11, actionType2, j12);
        }
        return Unit.f71690a;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(M m11, d<? super Unit> dVar) {
        return ((CallApiViewModelImpl$proceedComposerAction$1) create(m11, dVar)).invokeSuspend(Unit.f71690a);
    }
}
