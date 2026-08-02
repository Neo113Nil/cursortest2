package h90;

import Sc.s;
import g30.InterfaceC6618a;
import j90.InterfaceC7310a;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import retrofit2.HttpException;
import ru.ozon.fintech.notifications.models.NotificationGwt3dsResponse;
import xe.M;

@kotlin.coroutines.jvm.internal.e(c = "ru.ozon.fintech.notifications.domains.interactors.NotificationInteractorImpl$updateJwt$2", f = "NotificationInteractorImpl.kt", l = {101}, m = "invokeSuspend")
/* loaded from: classes3.dex */
final class i extends kotlin.coroutines.jvm.internal.j implements Function2<M, kotlin.coroutines.d<? super Unit>, Object> {

    /* renamed from: d, reason: collision with root package name */
    int f65181d;

    /* renamed from: e, reason: collision with root package name */
    final /* synthetic */ g f65182e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    i(g gVar, kotlin.coroutines.d<? super i> dVar) {
        super(2, dVar);
        this.f65182e = gVar;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
        return new i(this.f65182e, dVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(M m11, kotlin.coroutines.d<? super Unit> dVar) {
        return ((i) create(m11, dVar)).invokeSuspend(Unit.f71690a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        InterfaceC6618a interfaceC6618a;
        InterfaceC7310a interfaceC7310a;
        S30.a aVar;
        InterfaceC6618a interfaceC6618a2;
        Wc.a aVar2 = Wc.a.COROUTINE_SUSPENDED;
        int i11 = this.f65181d;
        final g gVar = this.f65182e;
        try {
            if (i11 == 0) {
                s.b(obj);
                interfaceC7310a = gVar.f65165a;
                aVar = gVar.f65168d;
                String uniqueApplicationId = aVar.getUniqueApplicationId();
                String g10 = gVar.g();
                this.f65181d = 1;
                obj = interfaceC7310a.a(uniqueApplicationId, g10, this);
                if (obj == aVar2) {
                    return aVar2;
                }
            } else {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                s.b(obj);
            }
            NotificationGwt3dsResponse notificationGwt3dsResponse = (NotificationGwt3dsResponse) obj;
            E30.g.a(new Function2() { // from class: h90.h
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj2, Object obj3) {
                    g.this.e((String) obj2, (String) obj3);
                    return Unit.f71690a;
                }
            }, notificationGwt3dsResponse.getJwt(), notificationGwt3dsResponse.getBankPublicKey());
            interfaceC6618a2 = gVar.f65169e;
            InterfaceC6618a.C1033a.g(interfaceC6618a2, notificationGwt3dsResponse.getJwt(), null, null, 30);
        } catch (Exception e11) {
            String valueOf = e11 instanceof HttpException ? String.valueOf(((HttpException) e11).code()) : "Unknown ErrorCode";
            L80.a.b("NotificationInteractorImpl", "Error updating JWT token e=" + e11);
            interfaceC6618a = gVar.f65169e;
            InterfaceC6618a.C1033a.g(interfaceC6618a, null, e11.getLocalizedMessage(), valueOf, 9);
        }
        return Unit.f71690a;
    }
}
