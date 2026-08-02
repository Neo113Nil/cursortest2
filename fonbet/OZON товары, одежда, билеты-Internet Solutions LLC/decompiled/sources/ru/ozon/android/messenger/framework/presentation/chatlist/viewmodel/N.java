package ru.ozon.android.messenger.framework.presentation.chatlist.viewmodel;

import Ae.B0;
import Ae.C0;
import Ae.InterfaceC2397i;
import Sc.C4005g;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import ru.ozon.android.messenger.framework.navigation.controller.d;
import ru.ozon.android.messenger.framework.presentation.chatlist.j;

@kotlin.coroutines.jvm.internal.e(c = "ru.ozon.android.messenger.framework.presentation.chatlist.viewmodel.ChatListViewModelImpl$observeMessengerEvents$1", f = "ChatListViewModel.kt", l = {337}, m = "invokeSuspend")
/* loaded from: classes10.dex */
final class N extends kotlin.coroutines.jvm.internal.j implements Function2<xe.M, kotlin.coroutines.d<? super Unit>, Object> {

    /* renamed from: d, reason: collision with root package name */
    int f90586d;

    /* renamed from: e, reason: collision with root package name */
    final /* synthetic */ C9509v f90587e;

    static final class a<T> implements InterfaceC2397i {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ C9509v f90588a;

        a(C9509v c9509v) {
            this.f90588a = c9509v;
        }

        @Override // Ae.InterfaceC2397i
        public final Object emit(Object obj, kotlin.coroutines.d dVar) {
            C0 c02;
            ru.ozon.android.messenger.framework.presentation.chatlist.d dVar2;
            ru.ozon.android.messenger.framework.presentation.chatlist.d dVar3;
            ru.ozon.android.messenger.framework.presentation.chatlist.d dVar4;
            ru.ozon.android.messenger.framework.presentation.chatlist.d dVar5;
            ru.ozon.android.messenger.framework.navigation.controller.d dVar6 = (ru.ozon.android.messenger.framework.navigation.controller.d) obj;
            boolean z11 = dVar6 instanceof d.o;
            C9509v c9509v = this.f90588a;
            if (z11) {
                dVar5 = c9509v.f90700h;
                dVar5.a(new H(dVar6));
            } else if (dVar6 instanceof d.u) {
                dVar4 = c9509v.f90700h;
                dVar4.a(new I(dVar6));
            } else if (dVar6 instanceof d.w) {
                dVar3 = c9509v.f90700h;
                dVar3.a(new J(c9509v, dVar6));
            } else {
                if (dVar6 instanceof d.f) {
                    Object v02 = C9509v.v0(c9509v, (d.f) dVar6, dVar);
                    return v02 == Wc.a.COROUTINE_SUSPENDED ? v02 : Unit.f71690a;
                }
                if (dVar6 instanceof d.q) {
                    c9509v.H0((d.q) dVar6);
                } else if (dVar6 instanceof d.r) {
                    dVar2 = c9509v.f90700h;
                    dVar2.a(new M(dVar6));
                } else if (dVar6 instanceof d.g) {
                    C9509v.x0(c9509v, ((d.g) dVar6).a());
                } else if (dVar6 instanceof d.n) {
                    C9509v.A0(c9509v, ((d.n) dVar6).a());
                } else if (dVar6 instanceof d.i) {
                    C9509v.w0(c9509v, ((d.i) dVar6).a());
                } else if (dVar6 instanceof d.v) {
                    c02 = c9509v.f90716x;
                    c02.tryEmit(new j.c(((d.v) dVar6).a()));
                }
            }
            return Unit.f71690a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    N(C9509v c9509v, kotlin.coroutines.d<? super N> dVar) {
        super(2, dVar);
        this.f90587e = c9509v;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
        return new N(this.f90587e, dVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(xe.M m11, kotlin.coroutines.d<? super Unit> dVar) {
        return ((N) create(m11, dVar)).invokeSuspend(Unit.f71690a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
        int i11 = this.f90586d;
        if (i11 == 0) {
            Sc.s.b(obj);
            C9509v c9509v = this.f90587e;
            B0<ru.ozon.android.messenger.framework.navigation.controller.d> b11 = c9509v.E0().b();
            a aVar2 = new a(c9509v);
            this.f90586d = 1;
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
