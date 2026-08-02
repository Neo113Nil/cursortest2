package ru.ozon.android.messenger.framework.presentation.messenger;

import Ae.B0;
import Ae.InterfaceC2397i;
import Sc.C4005g;
import androidx.lifecycle.x0;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.android.messenger.framework.navigation.action.d;
import ru.ozon.android.messenger.framework.navigation.action.g;
import ru.ozon.android.messenger.framework.navigation.controller.d;
import ru.ozon.android.messenger.framework.presentation.messenger.f;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.data.AtomActionDTO;
import xe.C10727i;
import xe.M;

@kotlin.coroutines.jvm.internal.e(c = "ru.ozon.android.messenger.framework.presentation.messenger.MessengerViewModel$handleCommonMessengerEvents$1", f = "MessengerViewModel.kt", l = {172}, m = "invokeSuspend")
/* loaded from: classes10.dex */
final class o extends kotlin.coroutines.jvm.internal.j implements Function2<M, kotlin.coroutines.d<? super Unit>, Object> {

    /* renamed from: d, reason: collision with root package name */
    int f91388d;

    /* renamed from: e, reason: collision with root package name */
    final /* synthetic */ l f91389e;

    static final class a<T> implements InterfaceC2397i {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ l f91390a;

        a(l lVar) {
            this.f91390a = lVar;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // Ae.InterfaceC2397i
        public final Object emit(Object obj, kotlin.coroutines.d dVar) {
            f fVar;
            ru.ozon.android.messenger.framework.navigation.action.f fVar2;
            ru.ozon.android.messenger.framework.navigation.controller.b bVar;
            ru.ozon.android.messenger.framework.navigation.controller.b bVar2;
            ru.ozon.android.messenger.framework.navigation.controller.d dVar2 = (ru.ozon.android.messenger.framework.navigation.controller.d) obj;
            boolean z11 = dVar2 instanceof d.h;
            l lVar = this.f91390a;
            if (z11) {
                l.m0(lVar, ((d.h) dVar2).a());
            } else {
                int i11 = 0;
                if (dVar2 instanceof d.f) {
                    d.f fVar3 = (d.f) dVar2;
                    if (!(fVar3.a().c() instanceof AtomAction.Refresh)) {
                        fVar = lVar.f91375i;
                        if (!(fVar instanceof f.a) || !(fVar3.a().c() instanceof AtomAction.Dismiss)) {
                            d.a aVar = ru.ozon.android.messenger.framework.navigation.action.d.Companion;
                            String id2 = fVar3.a().getId();
                            aVar.getClass();
                            if (d.a.a(id2) == null) {
                                g.a aVar2 = ru.ozon.android.messenger.framework.navigation.action.g.Companion;
                                String id3 = fVar3.a().getId();
                                aVar2.getClass();
                                ru.ozon.android.messenger.framework.navigation.action.g[] values = ru.ozon.android.messenger.framework.navigation.action.g.values();
                                int length = values.length;
                                while (true) {
                                    if (i11 >= length) {
                                        break;
                                    }
                                    ru.ozon.android.messenger.framework.navigation.action.g gVar = values[i11];
                                    if (Intrinsics.d(gVar.a(), id3)) {
                                        r1 = gVar;
                                        break;
                                    }
                                    i11++;
                                }
                                if (r1 == null) {
                                    fVar2 = lVar.f91374h;
                                    fVar2.handleAction(fVar3.a().c());
                                }
                            }
                        }
                    } else if (Intrinsics.d(fVar3.a().getId(), "aiRefresh")) {
                        bVar2 = lVar.f91373g;
                        AtomActionDTO b11 = fVar3.a().b();
                        bVar2.w(b11 != null ? b11.getParams() : null);
                    } else {
                        bVar = lVar.f91373g;
                        bVar.o(null);
                    }
                } else if (dVar2 instanceof d.C1642d) {
                    l.f91366o = 0;
                    lVar.getClass();
                    C10727i.c(x0.a(lVar), null, null, new t(lVar, null), 3);
                }
            }
            return Unit.f71690a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    o(l lVar, kotlin.coroutines.d<? super o> dVar) {
        super(2, dVar);
        this.f91389e = lVar;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
        return new o(this.f91389e, dVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(M m11, kotlin.coroutines.d<? super Unit> dVar) {
        return ((o) create(m11, dVar)).invokeSuspend(Unit.f71690a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        ru.ozon.android.messenger.framework.navigation.controller.b bVar;
        Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
        int i11 = this.f91388d;
        if (i11 == 0) {
            Sc.s.b(obj);
            l lVar = this.f91389e;
            bVar = lVar.f91373g;
            B0<ru.ozon.android.messenger.framework.navigation.controller.d> b11 = bVar.b();
            a aVar2 = new a(lVar);
            this.f91388d = 1;
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
