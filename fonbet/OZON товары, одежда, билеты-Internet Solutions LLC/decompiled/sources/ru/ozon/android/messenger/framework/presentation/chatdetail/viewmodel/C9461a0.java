package ru.ozon.android.messenger.framework.presentation.chatdetail.viewmodel;

import Ae.C2399j;
import Ae.InterfaceC2397i;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.android.messenger.framework.domain.model.f;
import ru.ozon.android.messenger.framework.navigation.controller.d;
import ru.ozon.android.messenger.framework.presentation.chatdetail.j;
import xe.C10727i;

@kotlin.coroutines.jvm.internal.e(c = "ru.ozon.android.messenger.framework.presentation.chatdetail.viewmodel.ChatViewModelImpl$observeMessengerEvents$1", f = "ChatViewModel.kt", l = {528}, m = "invokeSuspend")
/* renamed from: ru.ozon.android.messenger.framework.presentation.chatdetail.viewmodel.a0, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
final class C9461a0 extends kotlin.coroutines.jvm.internal.j implements Function2<xe.M, kotlin.coroutines.d<? super Unit>, Object> {

    /* renamed from: d, reason: collision with root package name */
    int f90047d;

    /* renamed from: e, reason: collision with root package name */
    final /* synthetic */ C9467e f90048e;

    /* renamed from: ru.ozon.android.messenger.framework.presentation.chatdetail.viewmodel.a0$a */
    static final class a extends AbstractC7737t implements Function1<ru.ozon.android.messenger.framework.navigation.controller.d, Long> {

        /* renamed from: b, reason: collision with root package name */
        public static final a f90049b = new a(1);

        @Override // kotlin.jvm.functions.Function1
        public final Long invoke(ru.ozon.android.messenger.framework.navigation.controller.d dVar) {
            ru.ozon.android.messenger.framework.navigation.controller.d it = dVar;
            Intrinsics.checkNotNullParameter(it, "it");
            return Long.valueOf(it instanceof d.e ? 1000L : 0L);
        }
    }

    /* renamed from: ru.ozon.android.messenger.framework.presentation.chatdetail.viewmodel.a0$b */
    static final class b<T> implements InterfaceC2397i {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ C9467e f90050a;

        b(C9467e c9467e) {
            this.f90050a = c9467e;
        }

        @Override // Ae.InterfaceC2397i
        public final Object emit(Object obj, kotlin.coroutines.d dVar) {
            ru.ozon.android.messenger.framework.domain.usecases.F f7;
            ru.ozon.android.messenger.framework.presentation.chatdetail.viewmodel.delegates.a aVar;
            ru.ozon.android.messenger.framework.navigation.controller.d dVar2 = (ru.ozon.android.messenger.framework.navigation.controller.d) obj;
            boolean z11 = dVar2 instanceof d.b;
            C9467e c9467e = this.f90050a;
            if (z11) {
                Object M02 = C9467e.M0(c9467e, (d.b) dVar2, dVar);
                return M02 == Wc.a.COROUTINE_SUSPENDED ? M02 : Unit.f71690a;
            }
            if (dVar2 instanceof d.c) {
                Object N02 = C9467e.N0(c9467e, (d.c) dVar2, dVar);
                return N02 == Wc.a.COROUTINE_SUSPENDED ? N02 : Unit.f71690a;
            }
            if (dVar2 instanceof d.q) {
                c9467e.m1();
                aVar = c9467e.f90220p;
                Object u11 = aVar.u((d.q) dVar2, dVar);
                return u11 == Wc.a.COROUTINE_SUSPENDED ? u11 : Unit.f71690a;
            }
            if (dVar2 instanceof d.w) {
                Object X02 = C9467e.X0(c9467e, (d.w) dVar2, dVar);
                return X02 == Wc.a.COROUTINE_SUSPENDED ? X02 : Unit.f71690a;
            }
            if (dVar2 instanceof d.t) {
                C9467e.b1(c9467e, ((d.t) dVar2).a());
            } else {
                if (dVar2 instanceof d.r) {
                    f7 = c9467e.f90226t;
                    Object g10 = f7.g(new f.b(((d.r) dVar2).a()), dVar);
                    return g10 == Wc.a.COROUTINE_SUSPENDED ? g10 : Unit.f71690a;
                }
                if (dVar2 instanceof d.f) {
                    C9467e.L0(c9467e, (d.f) dVar2);
                } else if (dVar2 instanceof d.n) {
                    C9467e.Y0(c9467e, ((d.n) dVar2).a());
                } else if (dVar2 instanceof d.g) {
                    C9467e.Q0(c9467e, ((d.g) dVar2).a());
                } else if (dVar2 instanceof d.i) {
                    C9467e.P0(c9467e, ((d.i) dVar2).a());
                } else if (dVar2 instanceof d.e) {
                    String a11 = ((d.e) dVar2).a();
                    int i11 = C9467e.f90182B0;
                    c9467e.getClass();
                    C10727i.c(androidx.lifecycle.x0.a(c9467e), null, null, new d0(c9467e, a11, null), 3);
                } else if (dVar2 instanceof d.v) {
                    C9467e.f1(c9467e, new j.p(((d.v) dVar2).a()));
                } else if (dVar2 instanceof d.s) {
                    C9467e.V0(c9467e, ((d.s) dVar2).a());
                }
            }
            return Unit.f71690a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    C9461a0(kotlin.coroutines.d dVar, C9467e c9467e) {
        super(2, dVar);
        this.f90048e = c9467e;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
        return new C9461a0(dVar, this.f90048e);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(xe.M m11, kotlin.coroutines.d<? super Unit> dVar) {
        return ((C9461a0) create(m11, dVar)).invokeSuspend(Unit.f71690a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
        int i11 = this.f90047d;
        if (i11 == 0) {
            Sc.s.b(obj);
            C9467e c9467e = this.f90048e;
            Be.u m11 = C2399j.m(c9467e.getController().b(), a.f90049b);
            b bVar = new b(c9467e);
            this.f90047d = 1;
            if (m11.collect(bVar, this) == aVar) {
                return aVar;
            }
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            Sc.s.b(obj);
        }
        return Unit.f71690a;
    }
}
