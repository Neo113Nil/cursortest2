package ru.ozon.android.messenger.framework.presentation.search;

import Ae.InterfaceC2397i;
import Ae.M0;
import Sc.C4005g;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import ru.ozon.android.messenger.framework.data.remote.websocket.AbstractC9330a;
import ru.ozon.android.messenger.framework.presentation.search.InterfaceC9524d;

@kotlin.coroutines.jvm.internal.e(c = "ru.ozon.android.messenger.framework.presentation.search.ChatSearchViewModel$observeConnectionEvents$1", f = "ChatSearchViewModel.kt", l = {307}, m = "invokeSuspend")
/* loaded from: classes10.dex */
final class w extends kotlin.coroutines.jvm.internal.j implements Function2<xe.M, kotlin.coroutines.d<? super Unit>, Object> {

    /* renamed from: d, reason: collision with root package name */
    int f91808d;

    /* renamed from: e, reason: collision with root package name */
    final /* synthetic */ C9527g f91809e;

    static final class a<T> implements InterfaceC2397i {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ C9527g f91810a;

        a(C9527g c9527g) {
            this.f91810a = c9527g;
        }

        @Override // Ae.InterfaceC2397i
        public final Object emit(Object obj, kotlin.coroutines.d dVar) {
            AbstractC9330a abstractC9330a = (AbstractC9330a) obj;
            boolean z11 = abstractC9330a instanceof AbstractC9330a.f;
            C9527g c9527g = this.f91810a;
            if (z11) {
                c9527g.T0(new InterfaceC9524d.b(null));
            } else if (abstractC9330a instanceof AbstractC9330a.e) {
                C9527g.u0(c9527g);
            }
            return Unit.f71690a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    w(C9527g c9527g, kotlin.coroutines.d<? super w> dVar) {
        super(2, dVar);
        this.f91809e = c9527g;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
        return new w(this.f91809e, dVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(xe.M m11, kotlin.coroutines.d<? super Unit> dVar) {
        return ((w) create(m11, dVar)).invokeSuspend(Unit.f71690a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        ru.ozon.android.messenger.framework.domain.repository.b bVar;
        Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
        int i11 = this.f91808d;
        if (i11 == 0) {
            Sc.s.b(obj);
            C9527g c9527g = this.f91809e;
            bVar = c9527g.f91729b;
            M0<AbstractC9330a> l11 = bVar.l();
            a aVar2 = new a(c9527g);
            this.f91808d = 1;
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
