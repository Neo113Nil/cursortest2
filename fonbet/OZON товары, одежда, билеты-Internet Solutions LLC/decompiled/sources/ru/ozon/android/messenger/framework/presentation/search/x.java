package ru.ozon.android.messenger.framework.presentation.search;

import Ae.B0;
import Ae.InterfaceC2397i;
import Sc.C4005g;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import ru.ozon.android.messenger.framework.navigation.controller.d;

@kotlin.coroutines.jvm.internal.e(c = "ru.ozon.android.messenger.framework.presentation.search.ChatSearchViewModel$observeMessengerEvents$1", f = "ChatSearchViewModel.kt", l = {244}, m = "invokeSuspend")
/* loaded from: classes10.dex */
final class x extends kotlin.coroutines.jvm.internal.j implements Function2<xe.M, kotlin.coroutines.d<? super Unit>, Object> {

    /* renamed from: d, reason: collision with root package name */
    int f91811d;

    /* renamed from: e, reason: collision with root package name */
    final /* synthetic */ C9527g f91812e;

    static final class a<T> implements InterfaceC2397i {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ C9527g f91813a;

        a(C9527g c9527g) {
            this.f91813a = c9527g;
        }

        @Override // Ae.InterfaceC2397i
        public final Object emit(Object obj, kotlin.coroutines.d dVar) {
            ru.ozon.android.messenger.framework.navigation.controller.d dVar2 = (ru.ozon.android.messenger.framework.navigation.controller.d) obj;
            boolean z11 = dVar2 instanceof d.f;
            C9527g c9527g = this.f91813a;
            if (z11) {
                Object r02 = C9527g.r0(c9527g, (d.f) dVar2, dVar);
                return r02 == Wc.a.COROUTINE_SUSPENDED ? r02 : Unit.f71690a;
            }
            if (dVar2 instanceof d.n) {
                C9527g.v0(c9527g, ((d.n) dVar2).a());
            } else if (dVar2 instanceof d.g) {
                C9527g.s0(c9527g, ((d.g) dVar2).a());
            } else if (dVar2 instanceof d.v) {
                C9527g.t0(c9527g, ((d.v) dVar2).a());
            }
            return Unit.f71690a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    x(C9527g c9527g, kotlin.coroutines.d<? super x> dVar) {
        super(2, dVar);
        this.f91812e = c9527g;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
        return new x(this.f91812e, dVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(xe.M m11, kotlin.coroutines.d<? super Unit> dVar) {
        return ((x) create(m11, dVar)).invokeSuspend(Unit.f71690a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
        int i11 = this.f91811d;
        if (i11 == 0) {
            Sc.s.b(obj);
            C9527g c9527g = this.f91812e;
            B0<ru.ozon.android.messenger.framework.navigation.controller.d> b11 = c9527g.M0().b();
            a aVar2 = new a(c9527g);
            this.f91811d = 1;
            if (b11.collect(aVar2, this) == aVar) {
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
