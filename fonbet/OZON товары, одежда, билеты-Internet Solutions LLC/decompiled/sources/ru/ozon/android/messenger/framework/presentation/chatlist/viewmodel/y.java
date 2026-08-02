package ru.ozon.android.messenger.framework.presentation.chatlist.viewmodel;

import androidx.lifecycle.x0;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import ru.ozon.android.messenger.framework.navigation.controller.d;
import xe.C10727i;

@kotlin.coroutines.jvm.internal.e(c = "ru.ozon.android.messenger.framework.presentation.chatlist.viewmodel.ChatListViewModelImpl$handleActionWrapper$3", f = "ChatListViewModel.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes10.dex */
final class y extends kotlin.coroutines.jvm.internal.j implements Function1<kotlin.coroutines.d<? super Unit>, Object> {

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ C9509v f90749d;

    /* renamed from: e, reason: collision with root package name */
    final /* synthetic */ d.f f90750e;

    @kotlin.coroutines.jvm.internal.e(c = "ru.ozon.android.messenger.framework.presentation.chatlist.viewmodel.ChatListViewModelImpl$handleActionWrapper$3$1", f = "ChatListViewModel.kt", l = {430}, m = "invokeSuspend")
    static final class a extends kotlin.coroutines.jvm.internal.j implements Function2<xe.M, kotlin.coroutines.d<? super Unit>, Object> {

        /* renamed from: d, reason: collision with root package name */
        int f90751d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ C9509v f90752e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ d.f f90753f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(C9509v c9509v, d.f fVar, kotlin.coroutines.d<? super a> dVar) {
            super(2, dVar);
            this.f90752e = c9509v;
            this.f90753f = fVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            return new a(this.f90752e, this.f90753f, dVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(xe.M m11, kotlin.coroutines.d<? super Unit> dVar) {
            return ((a) create(m11, dVar)).invokeSuspend(Unit.f71690a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            ru.ozon.android.messenger.framework.domain.repository.a aVar;
            Wc.a aVar2 = Wc.a.COROUTINE_SUSPENDED;
            int i11 = this.f90751d;
            d.f fVar = this.f90753f;
            C9509v c9509v = this.f90752e;
            if (i11 == 0) {
                Sc.s.b(obj);
                aVar = c9509v.f90704l;
                ru.ozon.android.messenger.framework.navigation.action.a a11 = fVar.a();
                this.f90751d = 1;
                obj = aVar.g(a11, this);
                if (obj == aVar2) {
                    return aVar2;
                }
            } else {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                Sc.s.b(obj);
            }
            C9509v.B0(c9509v, (ru.ozon.android.messenger.utils.i) obj, fVar.a());
            return Unit.f71690a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    y(C9509v c9509v, d.f fVar, kotlin.coroutines.d<? super y> dVar) {
        super(1, dVar);
        this.f90749d = c9509v;
        this.f90750e = fVar;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final kotlin.coroutines.d<Unit> create(kotlin.coroutines.d<?> dVar) {
        return new y(this.f90749d, this.f90750e, dVar);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(kotlin.coroutines.d<? super Unit> dVar) {
        return ((y) create(dVar)).invokeSuspend(Unit.f71690a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
        Sc.s.b(obj);
        C9509v c9509v = this.f90749d;
        C10727i.c(x0.a(c9509v), null, null, new a(c9509v, this.f90750e, null), 3);
        return Unit.f71690a;
    }
}
