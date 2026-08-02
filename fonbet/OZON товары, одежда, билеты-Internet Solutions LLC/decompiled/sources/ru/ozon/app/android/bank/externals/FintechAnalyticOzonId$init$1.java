package ru.ozon.app.android.bank.externals;

import Sc.s;
import Wc.a;
import g30.InterfaceC6618a;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.e;
import kotlin.coroutines.jvm.internal.j;
import kotlin.jvm.functions.Function2;

@Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\t\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, d2 = {"<anonymous>", "", "it", ""}, k = 3, mv = {2, 0, 0}, xi = 48)
@e(c = "ru.ozon.app.android.bank.externals.FintechAnalyticOzonId$init$1", f = "FintechAnalyticOzonId.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes11.dex */
final class FintechAnalyticOzonId$init$1 extends j implements Function2<Long, d<? super Unit>, Object> {
    /* synthetic */ long J$0;
    int label;
    final /* synthetic */ FintechAnalyticOzonId this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    FintechAnalyticOzonId$init$1(FintechAnalyticOzonId fintechAnalyticOzonId, d<? super FintechAnalyticOzonId$init$1> dVar) {
        super(2, dVar);
        this.this$0 = fintechAnalyticOzonId;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final d<Unit> create(Object obj, d<?> dVar) {
        FintechAnalyticOzonId$init$1 fintechAnalyticOzonId$init$1 = new FintechAnalyticOzonId$init$1(this.this$0, dVar);
        fintechAnalyticOzonId$init$1.J$0 = ((Number) obj).longValue();
        return fintechAnalyticOzonId$init$1;
    }

    public final Object invoke(long j11, d<? super Unit> dVar) {
        return ((FintechAnalyticOzonId$init$1) create(Long.valueOf(j11), dVar)).invokeSuspend(Unit.f71690a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        InterfaceC6618a interfaceC6618a;
        a aVar = a.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        s.b(obj);
        long j11 = this.J$0;
        interfaceC6618a = this.this$0.fintechAnalyticInteractor;
        interfaceC6618a.j1(String.valueOf(j11));
        return Unit.f71690a;
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(Long l11, d<? super Unit> dVar) {
        return invoke(l11.longValue(), dVar);
    }
}
