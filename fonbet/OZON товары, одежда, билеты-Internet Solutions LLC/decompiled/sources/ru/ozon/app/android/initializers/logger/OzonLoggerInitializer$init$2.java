package ru.ozon.app.android.initializers.logger;

import Ae.InterfaceC2395h;
import Ae.InterfaceC2397i;
import Sc.s;
import Wc.a;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.e;
import kotlin.coroutines.jvm.internal.j;
import kotlin.jvm.functions.Function2;
import ru.ozon.app.android.storage.auth.OzonIdCookieEvents;
import sj.c;
import xe.M;
import zb0.f;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lxe/M;", "", "<anonymous>", "(Lxe/M;)V"}, k = 3, mv = {2, 0, 0})
@e(c = "ru.ozon.app.android.initializers.logger.OzonLoggerInitializer$init$2", f = "OzonLoggerInitializer.kt", l = {48}, m = "invokeSuspend")
/* loaded from: classes6.dex */
final class OzonLoggerInitializer$init$2 extends j implements Function2<M, d<? super Unit>, Object> {
    final /* synthetic */ c $config;
    int label;
    final /* synthetic */ OzonLoggerInitializer this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    OzonLoggerInitializer$init$2(OzonLoggerInitializer ozonLoggerInitializer, c cVar, d<? super OzonLoggerInitializer$init$2> dVar) {
        super(2, dVar);
        this.this$0 = ozonLoggerInitializer;
        this.$config = cVar;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final d<Unit> create(Object obj, d<?> dVar) {
        return new OzonLoggerInitializer$init$2(this.this$0, this.$config, dVar);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        OzonIdCookieEvents ozonIdCookieEvents;
        a aVar = a.COROUTINE_SUSPENDED;
        int i11 = this.label;
        if (i11 == 0) {
            s.b(obj);
            ozonIdCookieEvents = this.this$0.cookieEvents;
            InterfaceC2395h<f> flow = ozonIdCookieEvents.getFlow();
            final c cVar = this.$config;
            final OzonLoggerInitializer ozonLoggerInitializer = this.this$0;
            InterfaceC2397i<? super f> interfaceC2397i = new InterfaceC2397i() { // from class: ru.ozon.app.android.initializers.logger.OzonLoggerInitializer$init$2.1
                @Override // Ae.InterfaceC2397i
                public /* bridge */ /* synthetic */ Object emit(Object obj2, d dVar) {
                    return emit((f) obj2, (d<? super Unit>) dVar);
                }

                public final Object emit(f fVar, d<? super Unit> dVar) {
                    Ob0.a aVar2;
                    Ob0.a aVar3;
                    c cVar2 = c.this;
                    aVar2 = ozonLoggerInitializer.ozonIdAppApi;
                    cVar2.w(String.valueOf(aVar2.getUserId()));
                    c cVar3 = c.this;
                    aVar3 = ozonLoggerInitializer.ozonIdAppApi;
                    String sessionId = aVar3.getSessionId();
                    if (sessionId == null) {
                        sessionId = "";
                    }
                    cVar3.r(sessionId);
                    return Unit.f71690a;
                }
            };
            this.label = 1;
            if (flow.collect(interfaceC2397i, this) == aVar) {
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
        return ((OzonLoggerInitializer$init$2) create(m11, dVar)).invokeSuspend(Unit.f71690a);
    }
}
