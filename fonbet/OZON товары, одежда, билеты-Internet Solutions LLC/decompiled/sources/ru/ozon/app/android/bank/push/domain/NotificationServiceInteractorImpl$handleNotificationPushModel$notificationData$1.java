package ru.ozon.app.android.bank.push.domain;

import Ib.a;
import Sc.s;
import fh0.C6568c;
import h90.k;
import k90.b;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.e;
import kotlin.coroutines.jvm.internal.j;
import kotlin.jvm.functions.Function2;
import ru.ozon.fintech.lib.FintechCoreLib;
import xe.M;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lxe/M;", "Lh90/k$a;", "<anonymous>", "(Lxe/M;)Lh90/k$a;"}, k = 3, mv = {2, 0, 0})
@e(c = "ru.ozon.app.android.bank.push.domain.NotificationServiceInteractorImpl$handleNotificationPushModel$notificationData$1", f = "NotificationServiceInteractorImpl.kt", l = {54}, m = "invokeSuspend")
/* loaded from: classes11.dex */
final class NotificationServiceInteractorImpl$handleNotificationPushModel$notificationData$1 extends j implements Function2<M, d<? super k.a>, Object> {
    final /* synthetic */ C6568c $pushModel;
    int label;
    final /* synthetic */ NotificationServiceInteractorImpl this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    NotificationServiceInteractorImpl$handleNotificationPushModel$notificationData$1(NotificationServiceInteractorImpl notificationServiceInteractorImpl, C6568c c6568c, d<? super NotificationServiceInteractorImpl$handleNotificationPushModel$notificationData$1> dVar) {
        super(2, dVar);
        this.this$0 = notificationServiceInteractorImpl;
        this.$pushModel = c6568c;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final d<Unit> create(Object obj, d<?> dVar) {
        return new NotificationServiceInteractorImpl$handleNotificationPushModel$notificationData$1(this.this$0, this.$pushModel, dVar);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        a aVar;
        b fintechRemoteMessage;
        Wc.a aVar2 = Wc.a.COROUTINE_SUSPENDED;
        int i11 = this.label;
        if (i11 != 0) {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            s.b(obj);
            return obj;
        }
        s.b(obj);
        aVar = this.this$0.fintechCoreLib;
        k notificationServiceInteractor = ((FintechCoreLib) aVar.get()).getNotificationServiceInteractor();
        fintechRemoteMessage = this.this$0.toFintechRemoteMessage(this.$pushModel);
        this.label = 1;
        Object a11 = notificationServiceInteractor.a(fintechRemoteMessage, "ozon://", this);
        return a11 == aVar2 ? aVar2 : a11;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(M m11, d<? super k.a> dVar) {
        return ((NotificationServiceInteractorImpl$handleNotificationPushModel$notificationData$1) create(m11, dVar)).invokeSuspend(Unit.f71690a);
    }
}
