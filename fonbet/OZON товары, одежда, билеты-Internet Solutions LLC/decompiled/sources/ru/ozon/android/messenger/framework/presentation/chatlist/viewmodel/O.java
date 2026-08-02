package ru.ozon.android.messenger.framework.presentation.chatlist.viewmodel;

import Ae.InterfaceC2397i;
import Ae.M0;
import Sc.C4005g;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

@kotlin.coroutines.jvm.internal.e(c = "ru.ozon.android.messenger.framework.presentation.chatlist.viewmodel.ChatListViewModelImpl$observeSocketEvents$1", f = "ChatListViewModel.kt", l = {291}, m = "invokeSuspend")
/* loaded from: classes10.dex */
final class O extends kotlin.coroutines.jvm.internal.j implements Function2<xe.M, kotlin.coroutines.d<? super Unit>, Object> {

    /* renamed from: d, reason: collision with root package name */
    int f90589d;

    /* renamed from: e, reason: collision with root package name */
    final /* synthetic */ C9509v f90590e;

    static final class a<T> implements InterfaceC2397i {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ kotlin.jvm.internal.M<String> f90591a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ C9509v f90592b;

        a(kotlin.jvm.internal.M<String> m11, C9509v c9509v) {
            this.f90591a = m11;
            this.f90592b = c9509v;
        }

        @Override // Ae.InterfaceC2397i
        public final Object emit(Object obj, kotlin.coroutines.d dVar) {
            ru.ozon.android.messenger.framework.presentation.chatlist.f fVar = (ru.ozon.android.messenger.framework.presentation.chatlist.f) obj;
            kotlin.jvm.internal.M<String> m11 = this.f90591a;
            if (!Intrinsics.d(m11.f71787a, ru.ozon.android.messenger.framework.presentation.chatlist.i.b(fVar))) {
                m11.f71787a = (T) ru.ozon.android.messenger.framework.presentation.chatlist.i.b(fVar);
                C9509v.e0(this.f90592b);
            }
            return Unit.f71690a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    O(C9509v c9509v, kotlin.coroutines.d<? super O> dVar) {
        super(2, dVar);
        this.f90590e = c9509v;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
        return new O(this.f90590e, dVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(xe.M m11, kotlin.coroutines.d<? super Unit> dVar) {
        return ((O) create(m11, dVar)).invokeSuspend(Unit.f71690a);
    }

    /* JADX WARN: Type inference failed for: r3v1, types: [T, java.lang.String] */
    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
        int i11 = this.f90589d;
        if (i11 == 0) {
            Sc.s.b(obj);
            C9509v c9509v = this.f90590e;
            C9509v.e0(c9509v);
            kotlin.jvm.internal.M m11 = new kotlin.jvm.internal.M();
            m11.f71787a = ru.ozon.android.messenger.framework.presentation.chatlist.i.b(C9509v.q0(c9509v));
            M0<ru.ozon.android.messenger.framework.presentation.chatlist.f> uiState = c9509v.getUiState();
            a aVar2 = new a(m11, c9509v);
            this.f90589d = 1;
            if (uiState.collect(aVar2, this) == aVar) {
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
