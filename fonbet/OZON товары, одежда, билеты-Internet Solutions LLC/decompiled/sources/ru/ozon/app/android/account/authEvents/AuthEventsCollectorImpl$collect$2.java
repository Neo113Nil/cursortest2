package ru.ozon.app.android.account.authEvents;

import Ae.B0;
import Ae.C2399j;
import Ib0.h;
import Ob0.a;
import Sc.s;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.e;
import kotlin.coroutines.jvm.internal.j;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.C7719a;
import xe.M;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lxe/M;", "", "<anonymous>", "(Lxe/M;)V"}, k = 3, mv = {2, 0, 0})
@e(c = "ru.ozon.app.android.account.authEvents.AuthEventsCollectorImpl$collect$2", f = "AuthEventsCollectorImpl.kt", l = {33}, m = "invokeSuspend")
/* loaded from: classes6.dex */
final class AuthEventsCollectorImpl$collect$2 extends j implements Function2<M, d<? super Unit>, Object> {
    int label;
    final /* synthetic */ AuthEventsCollectorImpl this$0;

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    /* renamed from: ru.ozon.app.android.account.authEvents.AuthEventsCollectorImpl$collect$2$1, reason: invalid class name */
    /* synthetic */ class AnonymousClass1 extends C7719a implements Function2<h, d<? super Unit>, Object> {
        AnonymousClass1(Object obj) {
            super(2, obj, AuthEventsCollectorImpl.class, "onLogout", "onLogout(Lru/ozon/id/core/result/OzonIdLogoutResult;)V", 4);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(h hVar, d<? super Unit> dVar) {
            return AuthEventsCollectorImpl$collect$2.invokeSuspend$onLogout((AuthEventsCollectorImpl) this.receiver, hVar, dVar);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    AuthEventsCollectorImpl$collect$2(AuthEventsCollectorImpl authEventsCollectorImpl, d<? super AuthEventsCollectorImpl$collect$2> dVar) {
        super(2, dVar);
        this.this$0 = authEventsCollectorImpl;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ Object invokeSuspend$onLogout(AuthEventsCollectorImpl authEventsCollectorImpl, h hVar, d dVar) {
        authEventsCollectorImpl.onLogout(hVar);
        return Unit.f71690a;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final d<Unit> create(Object obj, d<?> dVar) {
        return new AuthEventsCollectorImpl$collect$2(this.this$0, dVar);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        a aVar;
        Wc.a aVar2 = Wc.a.COROUTINE_SUSPENDED;
        int i11 = this.label;
        if (i11 == 0) {
            s.b(obj);
            aVar = this.this$0.ozonIdAppApi;
            B0<h> c11 = aVar.n().c();
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0);
            this.label = 1;
            if (C2399j.h(c11, anonymousClass1, this) == aVar2) {
                return aVar2;
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
        return ((AuthEventsCollectorImpl$collect$2) create(m11, dVar)).invokeSuspend(Unit.f71690a);
    }
}
