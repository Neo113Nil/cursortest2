package ru.ozon.app.android.checkoutcomposer.total.presentation.main;

import Ae.InterfaceC2397i;
import Sc.s;
import Wc.a;
import fd.InterfaceC6511n;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.e;
import kotlin.coroutines.jvm.internal.j;

@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u0004*\b\u0012\u0004\u0012\u00020\u00010\u00002\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"LAe/i;", "", "", "it", "", "<anonymous>", "(LAe/i;Ljava/lang/Throwable;)V"}, k = 3, mv = {2, 0, 0})
@e(c = "ru.ozon.app.android.checkoutcomposer.total.presentation.main.TotalVH$onAttach$2", f = "TotalVH.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes11.dex */
final class TotalVH$onAttach$2 extends j implements InterfaceC6511n<InterfaceC2397i<? super Boolean>, Throwable, d<? super Unit>, Object> {
    int label;
    final /* synthetic */ TotalVH this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    TotalVH$onAttach$2(TotalVH totalVH, d<? super TotalVH$onAttach$2> dVar) {
        super(3, dVar);
        this.this$0 = totalVH;
    }

    @Override // fd.InterfaceC6511n
    public final Object invoke(InterfaceC2397i<? super Boolean> interfaceC2397i, Throwable th2, d<? super Unit> dVar) {
        return new TotalVH$onAttach$2(this.this$0, dVar).invokeSuspend(Unit.f71690a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        a aVar = a.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        s.b(obj);
        this.this$0.setShimmering(false);
        return Unit.f71690a;
    }
}
