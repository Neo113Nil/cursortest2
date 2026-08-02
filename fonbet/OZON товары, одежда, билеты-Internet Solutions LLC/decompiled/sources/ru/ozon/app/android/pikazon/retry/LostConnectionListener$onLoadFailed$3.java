package ru.ozon.app.android.pikazon.retry;

import Ae.InterfaceC2397i;
import Sc.s;
import Wc.a;
import fd.InterfaceC6511n;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.e;
import kotlin.coroutines.jvm.internal.j;
import rj.AbstractC9286a;
import ru.ozon.app.android.pikazon.logging.PikazonLogger;

@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u0004*\b\u0012\u0004\u0012\u00020\u00010\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"LAe/i;", "Lrj/a;", "", "it", "", "<anonymous>", "(LAe/i;Ljava/lang/Throwable;)V"}, k = 3, mv = {2, 0, 0})
@e(c = "ru.ozon.app.android.pikazon.retry.LostConnectionListener$onLoadFailed$3", f = "LostConnectionListener.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes13.dex */
final class LostConnectionListener$onLoadFailed$3 extends j implements InterfaceC6511n<InterfaceC2397i<? super AbstractC9286a>, Throwable, d<? super Unit>, Object> {
    /* synthetic */ Object L$0;
    int label;

    LostConnectionListener$onLoadFailed$3(d<? super LostConnectionListener$onLoadFailed$3> dVar) {
        super(3, dVar);
    }

    @Override // fd.InterfaceC6511n
    public final Object invoke(InterfaceC2397i<? super AbstractC9286a> interfaceC2397i, Throwable th2, d<? super Unit> dVar) {
        LostConnectionListener$onLoadFailed$3 lostConnectionListener$onLoadFailed$3 = new LostConnectionListener$onLoadFailed$3(dVar);
        lostConnectionListener$onLoadFailed$3.L$0 = th2;
        return lostConnectionListener$onLoadFailed$3.invokeSuspend(Unit.f71690a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        a aVar = a.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        s.b(obj);
        PikazonLogger.INSTANCE.logError("Error in awaiting network Flow", (Throwable) this.L$0);
        return Unit.f71690a;
    }
}
