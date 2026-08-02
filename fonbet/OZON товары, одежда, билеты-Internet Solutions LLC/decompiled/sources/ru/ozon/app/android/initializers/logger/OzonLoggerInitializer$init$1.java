package ru.ozon.app.android.initializers.logger;

import Ob0.a;
import Sc.s;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.e;
import kotlin.coroutines.jvm.internal.j;
import kotlin.jvm.functions.Function2;
import sj.c;
import xe.M;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lxe/M;", "", "<anonymous>", "(Lxe/M;)V"}, k = 3, mv = {2, 0, 0})
@e(c = "ru.ozon.app.android.initializers.logger.OzonLoggerInitializer$init$1", f = "OzonLoggerInitializer.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes6.dex */
final class OzonLoggerInitializer$init$1 extends j implements Function2<M, d<? super Unit>, Object> {
    final /* synthetic */ c $config;
    int label;
    final /* synthetic */ OzonLoggerInitializer this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    OzonLoggerInitializer$init$1(c cVar, OzonLoggerInitializer ozonLoggerInitializer, d<? super OzonLoggerInitializer$init$1> dVar) {
        super(2, dVar);
        this.$config = cVar;
        this.this$0 = ozonLoggerInitializer;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final d<Unit> create(Object obj, d<?> dVar) {
        return new OzonLoggerInitializer$init$1(this.$config, this.this$0, dVar);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        a aVar;
        a aVar2;
        Wc.a aVar3 = Wc.a.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        s.b(obj);
        c cVar = this.$config;
        aVar = this.this$0.ozonIdAppApi;
        cVar.w(String.valueOf(aVar.getUserId()));
        c cVar2 = this.$config;
        aVar2 = this.this$0.ozonIdAppApi;
        String sessionId = aVar2.getSessionId();
        if (sessionId == null) {
            sessionId = "";
        }
        cVar2.r(sessionId);
        return Unit.f71690a;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(M m11, d<? super Unit> dVar) {
        return ((OzonLoggerInitializer$init$1) create(m11, dVar)).invokeSuspend(Unit.f71690a);
    }
}
