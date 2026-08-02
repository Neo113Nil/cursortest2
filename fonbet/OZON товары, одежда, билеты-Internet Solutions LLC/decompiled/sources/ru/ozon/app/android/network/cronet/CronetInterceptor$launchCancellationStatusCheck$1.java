package ru.ozon.app.android.network.cronet;

import Ga.a;
import Ja.i;
import Oa.c;
import Sc.s;
import We.InterfaceC4865g;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.e;
import kotlin.coroutines.jvm.internal.j;
import kotlin.jvm.functions.Function2;
import xe.M;
import xe.l1;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lxe/M;", "", "<anonymous>", "(Lxe/M;)V"}, k = 3, mv = {2, 0, 0})
@e(c = "ru.ozon.app.android.network.cronet.CronetInterceptor$launchCancellationStatusCheck$1", f = "CronetInterceptor.kt", l = {145}, m = "invokeSuspend")
/* loaded from: classes6.dex */
final class CronetInterceptor$launchCancellationStatusCheck$1 extends j implements Function2<M, d<? super Unit>, Object> {
    final /* synthetic */ i $httpRequest;
    final /* synthetic */ InterfaceC4865g $this_launchCancellationStatusCheck;
    int label;
    final /* synthetic */ CronetInterceptor this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    CronetInterceptor$launchCancellationStatusCheck$1(InterfaceC4865g interfaceC4865g, CronetInterceptor cronetInterceptor, i iVar, d<? super CronetInterceptor$launchCancellationStatusCheck$1> dVar) {
        super(2, dVar);
        this.$this_launchCancellationStatusCheck = interfaceC4865g;
        this.this$0 = cronetInterceptor;
        this.$httpRequest = iVar;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final d<Unit> create(Object obj, d<?> dVar) {
        return new CronetInterceptor$launchCancellationStatusCheck$1(this.$this_launchCancellationStatusCheck, this.this$0, this.$httpRequest, dVar);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        a knet;
        Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
        int i11 = this.label;
        if (i11 != 0 && i11 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        s.b(obj);
        while (!this.$this_launchCancellationStatusCheck.isCanceled()) {
            this.label = 1;
            if (l1.a(this) == aVar) {
                return aVar;
            }
        }
        try {
            knet = this.this$0.getKnet();
            ((c) knet.b()).a(this.$httpRequest);
        } catch (Exception e11) {
            Lm0.a.f17149a.e(e11);
        }
        return Unit.f71690a;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(M m11, d<? super Unit> dVar) {
        return ((CronetInterceptor$launchCancellationStatusCheck$1) create(m11, dVar)).invokeSuspend(Unit.f71690a);
    }
}
