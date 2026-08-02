package ru.ozon.app.android.returns.ui.domain.actionhandlers;

import Sc.s;
import Wc.a;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.e;
import kotlin.coroutines.jvm.internal.j;
import kotlin.jvm.functions.Function2;
import ru.ozon.app.android.action.v2.ActionV2Repository;
import ru.ozon.app.android.action.v2.models.ActionV2Request;
import xe.M;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lxe/M;", "", "<anonymous>", "(Lxe/M;)V"}, k = 3, mv = {2, 0, 0})
@e(c = "ru.ozon.app.android.returns.ui.domain.actionhandlers.SaveReturnReasonDescriptionViewModel$save$1$1$1", f = "SaveReturnReasonDescriptionViewModel.kt", l = {46}, m = "invokeSuspend")
/* loaded from: classes13.dex */
final class SaveReturnReasonDescriptionViewModel$save$1$1$1 extends j implements Function2<M, d<? super Unit>, Object> {
    final /* synthetic */ ActionV2Request $request;
    int label;
    final /* synthetic */ SaveReturnReasonDescriptionViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    SaveReturnReasonDescriptionViewModel$save$1$1$1(SaveReturnReasonDescriptionViewModel saveReturnReasonDescriptionViewModel, ActionV2Request actionV2Request, d<? super SaveReturnReasonDescriptionViewModel$save$1$1$1> dVar) {
        super(2, dVar);
        this.this$0 = saveReturnReasonDescriptionViewModel;
        this.$request = actionV2Request;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final d<Unit> create(Object obj, d<?> dVar) {
        return new SaveReturnReasonDescriptionViewModel$save$1$1$1(this.this$0, this.$request, dVar);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        ActionV2Repository actionV2Repository;
        a aVar = a.COROUTINE_SUSPENDED;
        int i11 = this.label;
        if (i11 == 0) {
            s.b(obj);
            actionV2Repository = this.this$0.actionV2Repository;
            ActionV2Request actionV2Request = this.$request;
            this.label = 1;
            if (actionV2Repository.callActionSuspend(actionV2Request, Object.class, this) == aVar) {
                return aVar;
            }
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            s.b(obj);
        }
        return Unit.f71690a;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(M m11, d<? super Unit> dVar) {
        return ((SaveReturnReasonDescriptionViewModel$save$1$1$1) create(m11, dVar)).invokeSuspend(Unit.f71690a);
    }
}
