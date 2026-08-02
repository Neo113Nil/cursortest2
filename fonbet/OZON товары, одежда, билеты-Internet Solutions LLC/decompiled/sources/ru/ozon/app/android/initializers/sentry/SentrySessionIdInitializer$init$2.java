package ru.ozon.app.android.initializers.sentry;

import Ob0.a;
import Sc.s;
import io.sentry.K1;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.e;
import kotlin.coroutines.jvm.internal.j;
import kotlin.jvm.functions.Function2;
import zb0.f;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lzb0/f;", "it", "", "<anonymous>", "(Lzb0/f;)V"}, k = 3, mv = {2, 0, 0})
@e(c = "ru.ozon.app.android.initializers.sentry.SentrySessionIdInitializer$init$2", f = "SentrySessionIdInitializer.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes12.dex */
final class SentrySessionIdInitializer$init$2 extends j implements Function2<f, d<? super Unit>, Object> {
    int label;
    final /* synthetic */ SentrySessionIdInitializer this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    SentrySessionIdInitializer$init$2(SentrySessionIdInitializer sentrySessionIdInitializer, d<? super SentrySessionIdInitializer$init$2> dVar) {
        super(2, dVar);
        this.this$0 = sentrySessionIdInitializer;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final d<Unit> create(Object obj, d<?> dVar) {
        return new SentrySessionIdInitializer$init$2(this.this$0, dVar);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        a aVar;
        Wc.a aVar2 = Wc.a.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        s.b(obj);
        aVar = this.this$0.ozonIdAppApi;
        String sessionId = aVar.getSessionId();
        if (sessionId == null) {
            sessionId = "";
        }
        K1.j("sessionId", sessionId);
        return Unit.f71690a;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(f fVar, d<? super Unit> dVar) {
        return ((SentrySessionIdInitializer$init$2) create(fVar, dVar)).invokeSuspend(Unit.f71690a);
    }
}
