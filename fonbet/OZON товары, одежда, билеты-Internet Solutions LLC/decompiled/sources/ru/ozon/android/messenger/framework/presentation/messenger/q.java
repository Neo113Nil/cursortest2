package ru.ozon.android.messenger.framework.presentation.messenger;

import Ae.InterfaceC2397i;
import Ae.M0;
import Sc.C4005g;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.android.messenger.framework.data.remote.websocket.AbstractC9330a;
import ru.ozon.android.networkinfo.models.NetworkInfo;
import xe.M;

@kotlin.coroutines.jvm.internal.e(c = "ru.ozon.android.messenger.framework.presentation.messenger.MessengerViewModel$observeInternetConnection$1", f = "MessengerViewModel.kt", l = {265}, m = "invokeSuspend")
/* loaded from: classes10.dex */
final class q extends kotlin.coroutines.jvm.internal.j implements Function2<M, kotlin.coroutines.d<? super Unit>, Object> {

    /* renamed from: d, reason: collision with root package name */
    int f91394d;

    /* renamed from: e, reason: collision with root package name */
    final /* synthetic */ l f91395e;

    static final class a<T> implements InterfaceC2397i {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ l f91396a;

        a(l lVar) {
            this.f91396a = lVar;
        }

        @Override // Ae.InterfaceC2397i
        public final Object emit(Object obj, kotlin.coroutines.d dVar) {
            Object t2;
            boolean z11 = ((NetworkInfo) obj) instanceof NetworkInfo.Available;
            l lVar = this.f91396a;
            if (z11) {
                return (Intrinsics.d(lVar.f91368b.l().getValue(), AbstractC9330a.C1590a.f87982a) || (t2 = lVar.f91368b.t(dVar)) != Wc.a.COROUTINE_SUSPENDED) ? Unit.f71690a : t2;
            }
            Object v11 = lVar.f91368b.v(dVar);
            return v11 == Wc.a.COROUTINE_SUSPENDED ? v11 : Unit.f71690a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    q(l lVar, kotlin.coroutines.d<? super q> dVar) {
        super(2, dVar);
        this.f91395e = lVar;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
        return new q(this.f91395e, dVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(M m11, kotlin.coroutines.d<? super Unit> dVar) {
        return ((q) create(m11, dVar)).invokeSuspend(Unit.f71690a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
        int i11 = this.f91394d;
        if (i11 == 0) {
            Sc.s.b(obj);
            l lVar = this.f91395e;
            M0<NetworkInfo> E11 = lVar.f91368b.E();
            a aVar2 = new a(lVar);
            this.f91394d = 1;
            if (E11.collect(aVar2, this) == aVar) {
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
