package ru.ozon.android.messenger.framework.presentation.chatlist.viewmodel;

import Ae.InterfaceC2397i;
import Ae.M0;
import Sc.C4005g;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import ru.ozon.android.messenger.framework.data.remote.websocket.AbstractC9330a;
import ru.ozon.android.messenger.framework.data.requests.GetChatsRequest;

@kotlin.coroutines.jvm.internal.e(c = "ru.ozon.android.messenger.framework.presentation.chatlist.viewmodel.ChatListViewModelImpl$observeConnectionEvents$1", f = "ChatListViewModel.kt", l = {261}, m = "invokeSuspend")
/* loaded from: classes10.dex */
final class G extends kotlin.coroutines.jvm.internal.j implements Function2<xe.M, kotlin.coroutines.d<? super Unit>, Object> {

    /* renamed from: d, reason: collision with root package name */
    int f90576d;

    /* renamed from: e, reason: collision with root package name */
    final /* synthetic */ C9509v f90577e;

    static final class a<T> implements InterfaceC2397i {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ C9509v f90578a;

        a(C9509v c9509v) {
            this.f90578a = c9509v;
        }

        @Override // Ae.InterfaceC2397i
        public final Object emit(Object obj, kotlin.coroutines.d dVar) {
            ru.ozon.android.messenger.framework.presentation.chatlist.v vVar;
            ru.ozon.android.messenger.framework.presentation.chatlist.d dVar2;
            AbstractC9330a abstractC9330a = (AbstractC9330a) obj;
            boolean z11 = abstractC9330a instanceof AbstractC9330a.f;
            C9509v c9509v = this.f90578a;
            if (z11) {
                dVar2 = c9509v.f90700h;
                dVar2.a(F.f90575b);
            } else if (abstractC9330a instanceof AbstractC9330a.C1590a) {
                vVar = c9509v.f90691C;
                c9509v.D0(!C9509v.q0(c9509v).k().isEmpty(), vVar != null ? new GetChatsRequest.Filter(vVar.a(), vVar.c(), vVar.b()) : null);
            } else if (abstractC9330a instanceof AbstractC9330a.e) {
                C9509v.z0(c9509v);
            }
            return Unit.f71690a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    G(C9509v c9509v, kotlin.coroutines.d<? super G> dVar) {
        super(2, dVar);
        this.f90577e = c9509v;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
        return new G(this.f90577e, dVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(xe.M m11, kotlin.coroutines.d<? super Unit> dVar) {
        return ((G) create(m11, dVar)).invokeSuspend(Unit.f71690a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        ru.ozon.android.messenger.framework.domain.repository.b bVar;
        Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
        int i11 = this.f90576d;
        if (i11 == 0) {
            Sc.s.b(obj);
            C9509v c9509v = this.f90577e;
            bVar = c9509v.f90696d;
            M0<AbstractC9330a> l11 = bVar.l();
            a aVar2 = new a(c9509v);
            this.f90576d = 1;
            if (l11.collect(aVar2, this) == aVar) {
                return aVar;
            }
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            Sc.s.b(obj);
        }
        throw new C4005g();
    }
}
