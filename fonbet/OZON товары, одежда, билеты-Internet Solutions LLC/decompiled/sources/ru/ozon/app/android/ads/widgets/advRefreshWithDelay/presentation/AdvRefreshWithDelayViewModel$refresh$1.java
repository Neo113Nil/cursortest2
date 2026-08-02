package ru.ozon.app.android.ads.widgets.advRefreshWithDelay.presentation;

import Ae.w0;
import Sc.s;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.e;
import kotlin.coroutines.jvm.internal.j;
import kotlin.jvm.functions.Function2;
import xe.M;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lxe/M;", "", "<anonymous>", "(Lxe/M;)V"}, k = 3, mv = {2, 0, 0})
@e(c = "ru.ozon.app.android.ads.widgets.advRefreshWithDelay.presentation.AdvRefreshWithDelayViewModel$refresh$1", f = "AdvRefreshWithDelayViewModel.kt", l = {85}, m = "invokeSuspend")
/* loaded from: classes11.dex */
final class AdvRefreshWithDelayViewModel$refresh$1 extends j implements Function2<M, d<? super Unit>, Object> {
    int label;
    final /* synthetic */ AdvRefreshWithDelayViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    AdvRefreshWithDelayViewModel$refresh$1(AdvRefreshWithDelayViewModel advRefreshWithDelayViewModel, d<? super AdvRefreshWithDelayViewModel$refresh$1> dVar) {
        super(2, dVar);
        this.this$0 = advRefreshWithDelayViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final d<Unit> create(Object obj, d<?> dVar) {
        return new AdvRefreshWithDelayViewModel$refresh$1(this.this$0, dVar);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        int i11;
        w0 w0Var;
        int i12;
        Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
        int i13 = this.label;
        if (i13 == 0) {
            s.b(obj);
            i11 = this.this$0.refreshCounter;
            this.this$0.refreshCounter = i11 + 1;
            w0Var = this.this$0._refreshEventFlow;
            i12 = this.this$0.refreshCounter;
            Integer num = new Integer(i12);
            this.label = 1;
            if (w0Var.emit(num, this) == aVar) {
                return aVar;
            }
        } else {
            if (i13 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            s.b(obj);
        }
        return Unit.f71690a;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(M m11, d<? super Unit> dVar) {
        return ((AdvRefreshWithDelayViewModel$refresh$1) create(m11, dVar)).invokeSuspend(Unit.f71690a);
    }
}
