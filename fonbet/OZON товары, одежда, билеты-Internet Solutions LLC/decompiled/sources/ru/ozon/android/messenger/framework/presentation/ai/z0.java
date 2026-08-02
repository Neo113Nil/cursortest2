package ru.ozon.android.messenger.framework.presentation.ai;

import Ae.InterfaceC2397i;
import Sc.C4005g;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import ru.ozon.android.messenger.framework.domain.model.f;
import ru.ozon.android.messenger.framework.navigation.action.c;
import ru.ozon.android.messenger.framework.navigation.controller.d;

@kotlin.coroutines.jvm.internal.e(c = "ru.ozon.android.messenger.framework.presentation.ai.AiAssistantViewModel$observeMessengerEvents$1", f = "AiAssistantViewModel.kt", l = {326}, m = "invokeSuspend")
/* loaded from: classes10.dex */
final class z0 extends kotlin.coroutines.jvm.internal.j implements Function2<xe.M, kotlin.coroutines.d<? super Unit>, Object> {

    /* renamed from: d, reason: collision with root package name */
    int f89719d;

    /* renamed from: e, reason: collision with root package name */
    final /* synthetic */ C9414c0 f89720e;

    static final class a<T> implements InterfaceC2397i {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ C9414c0 f89721a;

        a(C9414c0 c9414c0) {
            this.f89721a = c9414c0;
        }

        @Override // Ae.InterfaceC2397i
        public final Object emit(Object obj, kotlin.coroutines.d dVar) {
            ru.ozon.android.messenger.framework.domain.usecases.F f7;
            ru.ozon.android.messenger.framework.navigation.controller.d dVar2 = (ru.ozon.android.messenger.framework.navigation.controller.d) obj;
            boolean z11 = dVar2 instanceof d.q;
            C9414c0 c9414c0 = this.f89721a;
            if (z11) {
                C9414c0.W0(c9414c0, new x0(c9414c0, dVar2));
            } else if (dVar2 instanceof d.a) {
                C9414c0.W0(c9414c0, new y0(c9414c0, dVar2));
            } else {
                if (dVar2 instanceof d.w) {
                    Object C02 = C9414c0.C0(c9414c0, (d.w) dVar2, dVar);
                    return C02 == Wc.a.COROUTINE_SUSPENDED ? C02 : Unit.f71690a;
                }
                if (dVar2 instanceof d.r) {
                    f7 = c9414c0.f89510m;
                    Object g10 = f7.g(new f.b(((d.r) dVar2).a()), dVar);
                    return g10 == Wc.a.COROUTINE_SUSPENDED ? g10 : Unit.f71690a;
                }
                if (dVar2 instanceof d.f) {
                    C9414c0.v0(c9414c0, (d.f) dVar2);
                } else if (dVar2 instanceof d.g) {
                    C9414c0.y0(c9414c0, ((d.g) dVar2).a());
                } else if (dVar2 instanceof d.h) {
                    ru.ozon.android.messenger.framework.navigation.action.c a11 = ((d.h) dVar2).a();
                    c9414c0.getClass();
                    if (a11 instanceof c.b) {
                        Map<String, String> a12 = ((c.b) a11).a();
                        if (a12 == null) {
                            a12 = kotlin.collections.U.c();
                        }
                        C9414c0.W0(c9414c0, new B0(c9414c0, a12));
                    }
                } else if (dVar2 instanceof d.n) {
                    C9414c0.D0(c9414c0, ((d.n) dVar2).a());
                } else if (dVar2 instanceof d.i) {
                    C9414c0.x0(c9414c0, ((d.i) dVar2).a());
                } else if (dVar2 instanceof d.j) {
                    C9414c0.z0(c9414c0, ((d.j) dVar2).a());
                }
            }
            return Unit.f71690a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    z0(kotlin.coroutines.d dVar, C9414c0 c9414c0) {
        super(2, dVar);
        this.f89720e = c9414c0;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
        return new z0(dVar, this.f89720e);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(xe.M m11, kotlin.coroutines.d<? super Unit> dVar) {
        return ((z0) create(m11, dVar)).invokeSuspend(Unit.f71690a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
        int i11 = this.f89719d;
        if (i11 == 0) {
            Sc.s.b(obj);
            C9414c0 c9414c0 = this.f89720e;
            Ae.B0<ru.ozon.android.messenger.framework.navigation.controller.d> b11 = c9414c0.getController().b();
            a aVar2 = new a(c9414c0);
            this.f89719d = 1;
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
