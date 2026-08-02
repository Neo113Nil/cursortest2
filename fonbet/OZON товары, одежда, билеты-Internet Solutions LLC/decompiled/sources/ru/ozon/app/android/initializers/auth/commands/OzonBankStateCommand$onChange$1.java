package ru.ozon.app.android.initializers.auth.commands;

import A30.m;
import Ib.a;
import Sc.s;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.e;
import kotlin.coroutines.jvm.internal.j;
import kotlin.jvm.functions.Function2;
import ru.ozon.fintech.lib.FintechCoreLib;
import xe.M;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lxe/M;", "", "<anonymous>", "(Lxe/M;)V"}, k = 3, mv = {2, 0, 0})
@e(c = "ru.ozon.app.android.initializers.auth.commands.OzonBankStateCommand$onChange$1", f = "OzonBankStateCommand.kt", l = {29}, m = "invokeSuspend")
/* loaded from: classes12.dex */
final class OzonBankStateCommand$onChange$1 extends j implements Function2<M, d<? super Unit>, Object> {
    int label;
    final /* synthetic */ OzonBankStateCommand this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    OzonBankStateCommand$onChange$1(OzonBankStateCommand ozonBankStateCommand, d<? super OzonBankStateCommand$onChange$1> dVar) {
        super(2, dVar);
        this.this$0 = ozonBankStateCommand;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final d<Unit> create(Object obj, d<?> dVar) {
        return new OzonBankStateCommand$onChange$1(this.this$0, dVar);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        a aVar;
        Wc.a aVar2 = Wc.a.COROUTINE_SUSPENDED;
        int i11 = this.label;
        if (i11 == 0) {
            s.b(obj);
            aVar = this.this$0.fintechLib;
            m fintechAuthInteractor = ((FintechCoreLib) aVar.get()).getFintechAuthInteractor();
            this.label = 1;
            if (fintechAuthInteractor.w(false, this) == aVar2) {
                return aVar2;
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
        return ((OzonBankStateCommand$onChange$1) create(m11, dVar)).invokeSuspend(Unit.f71690a);
    }
}
