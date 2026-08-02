package ru.ozon.android.messenger.framework.presentation.chatdetail.viewmodel;

import Ae.InterfaceC2397i;
import Ae.M0;
import Sc.C4005g;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import ru.ozon.android.messenger.framework.data.remote.websocket.AbstractC9330a;
import ru.ozon.android.messenger.framework.data.requests.h;
import ru.ozon.android.messenger.framework.presentation.common.screen.m;
import xe.C10727i;

@kotlin.coroutines.jvm.internal.e(c = "ru.ozon.android.messenger.framework.presentation.chatdetail.viewmodel.ChatViewModelImpl$observeConnectionEvents$1", f = "ChatViewModel.kt", l = {1208}, m = "invokeSuspend")
/* loaded from: classes10.dex */
final class Z extends kotlin.coroutines.jvm.internal.j implements Function2<xe.M, kotlin.coroutines.d<? super Unit>, Object> {

    /* renamed from: d, reason: collision with root package name */
    int f90041d;

    /* renamed from: e, reason: collision with root package name */
    final /* synthetic */ C9467e f90042e;

    static final class a<T> implements InterfaceC2397i {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ C9467e f90043a;

        a(C9467e c9467e) {
            this.f90043a = c9467e;
        }

        @Override // Ae.InterfaceC2397i
        public final Object emit(Object obj, kotlin.coroutines.d dVar) {
            ru.ozon.android.messenger.framework.presentation.chatdetail.viewmodel.delegates.a aVar;
            ru.ozon.android.messenger.framework.presentation.chatdetail.viewmodel.delegates.a aVar2;
            AbstractC9330a abstractC9330a = (AbstractC9330a) obj;
            boolean z11 = abstractC9330a instanceof AbstractC9330a.f;
            C9467e c9467e = this.f90043a;
            if (z11) {
                aVar2 = c9467e.f90220p;
                aVar2.w(true, new m.a(null));
            } else if (abstractC9330a instanceof AbstractC9330a.C1590a) {
                h.a aVar3 = h.a.CHAT_ACTIVE;
                int i11 = C9467e.f90182B0;
                c9467e.getClass();
                C10727i.c(androidx.lifecycle.x0.a(c9467e), null, null, new k0(c9467e, aVar3, null), 3);
                C9467e.c1(c9467e);
            } else if (abstractC9330a instanceof AbstractC9330a.e) {
                C9467e.W0((AbstractC9330a.e) abstractC9330a, c9467e);
            } else if (abstractC9330a instanceof AbstractC9330a.c) {
                aVar = c9467e.f90220p;
                aVar.w(false, new m.a(null));
            }
            return Unit.f71690a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    Z(kotlin.coroutines.d dVar, C9467e c9467e) {
        super(2, dVar);
        this.f90042e = c9467e;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
        return new Z(dVar, this.f90042e);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(xe.M m11, kotlin.coroutines.d<? super Unit> dVar) {
        return ((Z) create(m11, dVar)).invokeSuspend(Unit.f71690a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        ru.ozon.android.messenger.framework.domain.repository.b bVar;
        Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
        int i11 = this.f90041d;
        if (i11 == 0) {
            Sc.s.b(obj);
            C9467e c9467e = this.f90042e;
            bVar = c9467e.f90206b;
            M0<AbstractC9330a> l11 = bVar.l();
            a aVar2 = new a(c9467e);
            this.f90041d = 1;
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
