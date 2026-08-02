package ru.ozon.app.android.returns.ui.domain.actionhandlers;

import Sc.s;
import Wc.a;
import android.os.SystemClock;
import androidx.lifecycle.x0;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.e;
import kotlin.coroutines.jvm.internal.j;
import kotlin.jvm.functions.Function2;
import ru.ozon.app.android.action.v2.models.ActionV2Request;
import ru.ozon.uni.atoms.af.AtomAction;
import xe.C10727i;
import xe.M;
import xe.Y;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lxe/M;", "", "<anonymous>", "(Lxe/M;)V"}, k = 3, mv = {2, 0, 0})
@e(c = "ru.ozon.app.android.returns.ui.domain.actionhandlers.SaveReturnReasonDescriptionViewModel$save$$inlined$invokeWithDebounce$1", f = "SaveReturnReasonDescriptionViewModel.kt", l = {40}, m = "invokeSuspend")
/* loaded from: classes13.dex */
public final class SaveReturnReasonDescriptionViewModel$save$$inlined$invokeWithDebounce$1 extends j implements Function2<M, d<? super Unit>, Object> {
    final /* synthetic */ AtomAction.ComposerAction $action$inlined;
    int label;
    final /* synthetic */ SaveReturnReasonDescriptionViewModel this$0;
    final /* synthetic */ SaveReturnReasonDescriptionViewModel this$0$inline_fun;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SaveReturnReasonDescriptionViewModel$save$$inlined$invokeWithDebounce$1(SaveReturnReasonDescriptionViewModel saveReturnReasonDescriptionViewModel, d dVar, AtomAction.ComposerAction composerAction, SaveReturnReasonDescriptionViewModel saveReturnReasonDescriptionViewModel2) {
        super(2, dVar);
        this.this$0$inline_fun = saveReturnReasonDescriptionViewModel;
        this.$action$inlined = composerAction;
        this.this$0 = saveReturnReasonDescriptionViewModel2;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final d<Unit> create(Object obj, d<?> dVar) {
        return new SaveReturnReasonDescriptionViewModel$save$$inlined$invokeWithDebounce$1(this.this$0$inline_fun, dVar, this.$action$inlined, this.this$0);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        a aVar = a.COROUTINE_SUSPENDED;
        int i11 = this.label;
        if (i11 == 0) {
            s.b(obj);
            this.label = 1;
            if (Y.b(500L, this) == aVar) {
                return aVar;
            }
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            s.b(obj);
        }
        C10727i.c(x0.a(this.this$0), null, null, new SaveReturnReasonDescriptionViewModel$save$1$1$1(this.this$0, new ActionV2Request(this.$action$inlined.getParams(), this.$action$inlined.getActionName(), false, 4, null), null), 3);
        this.this$0$inline_fun.lastTimeInvoked = SystemClock.elapsedRealtime();
        return Unit.f71690a;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(M m11, d<? super Unit> dVar) {
        return ((SaveReturnReasonDescriptionViewModel$save$$inlined$invokeWithDebounce$1) create(m11, dVar)).invokeSuspend(Unit.f71690a);
    }
}
