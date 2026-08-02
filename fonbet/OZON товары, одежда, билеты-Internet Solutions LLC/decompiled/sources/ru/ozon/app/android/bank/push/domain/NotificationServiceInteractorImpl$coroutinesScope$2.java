package ru.ozon.app.android.bank.push.domain;

import He.b;
import kotlin.Metadata;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC7737t;
import xe.C10720e0;
import xe.J;
import xe.M;
import xe.N;
import xe.X0;

@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lxe/M;", "invoke", "()Lxe/M;", "<anonymous>"}, k = 3, mv = {2, 0, 0})
/* loaded from: classes11.dex */
final class NotificationServiceInteractorImpl$coroutinesScope$2 extends AbstractC7737t implements Function0<M> {
    final /* synthetic */ NotificationServiceInteractorImpl this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    NotificationServiceInteractorImpl$coroutinesScope$2(NotificationServiceInteractorImpl notificationServiceInteractorImpl) {
        super(0);
        this.this$0 = notificationServiceInteractorImpl;
    }

    @Override // kotlin.jvm.functions.Function0
    public final M invoke() {
        J j11;
        C10720e0 c10720e0 = C10720e0.f105451a;
        CoroutineContext plus = b.f10879b.plus(X0.b());
        j11 = this.this$0.coroutineExceptionHandler;
        return N.a(plus.plus(j11));
    }
}
