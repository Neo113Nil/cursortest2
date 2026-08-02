package ru.ozon.android.messenger.framework.presentation.chatlist.viewmodel;

import Ae.C0;
import androidx.lifecycle.x0;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import ru.ozon.android.messenger.framework.navigation.controller.d;
import ru.ozon.android.messenger.framework.presentation.chatlist.j;
import ru.ozon.android.messenger.utils.i;
import xe.C10727i;

@kotlin.coroutines.jvm.internal.e(c = "ru.ozon.android.messenger.framework.presentation.chatlist.viewmodel.ChatListViewModelImpl$handleActionWrapper$4", f = "ChatListViewModel.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes10.dex */
final class z extends kotlin.coroutines.jvm.internal.j implements Function1<kotlin.coroutines.d<? super Unit>, Object> {

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ C9509v f90754d;

    /* renamed from: e, reason: collision with root package name */
    final /* synthetic */ d.f f90755e;

    @kotlin.coroutines.jvm.internal.e(c = "ru.ozon.android.messenger.framework.presentation.chatlist.viewmodel.ChatListViewModelImpl$handleActionWrapper$4$1", f = "ChatListViewModel.kt", l = {484}, m = "invokeSuspend")
    static final class a extends kotlin.coroutines.jvm.internal.j implements Function2<xe.M, kotlin.coroutines.d<? super Unit>, Object> {

        /* renamed from: d, reason: collision with root package name */
        int f90756d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ C9509v f90757e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ d.f f90758f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(C9509v c9509v, d.f fVar, kotlin.coroutines.d<? super a> dVar) {
            super(2, dVar);
            this.f90757e = c9509v;
            this.f90758f = fVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            return new a(this.f90757e, this.f90758f, dVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(xe.M m11, kotlin.coroutines.d<? super Unit> dVar) {
            return ((a) create(m11, dVar)).invokeSuspend(Unit.f71690a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            ru.ozon.android.messenger.framework.domain.repository.a aVar;
            ru.ozon.android.messenger.blocks.curtain.c cVar;
            C0 c02;
            Wc.a aVar2 = Wc.a.COROUTINE_SUSPENDED;
            int i11 = this.f90756d;
            C9509v c9509v = this.f90757e;
            if (i11 == 0) {
                Sc.s.b(obj);
                aVar = c9509v.f90704l;
                ru.ozon.android.messenger.framework.navigation.action.a a11 = this.f90758f.a();
                this.f90756d = 1;
                obj = aVar.b(a11, this);
                if (obj == aVar2) {
                    return aVar2;
                }
            } else {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                Sc.s.b(obj);
            }
            ru.ozon.android.messenger.utils.i iVar = (ru.ozon.android.messenger.utils.i) obj;
            if ((iVar instanceof i.b) && (cVar = (ru.ozon.android.messenger.blocks.curtain.c) ((i.b) iVar).b()) != null) {
                c02 = c9509v.f90716x;
                c02.tryEmit(new j.c(cVar));
            }
            if (iVar instanceof i.a) {
                Lm0.a.f17149a.w(Nk.a.b("getChatCurtain failed ", ((i.a) iVar).c()), new Object[0]);
            }
            return Unit.f71690a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    z(C9509v c9509v, d.f fVar, kotlin.coroutines.d<? super z> dVar) {
        super(1, dVar);
        this.f90754d = c9509v;
        this.f90755e = fVar;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final kotlin.coroutines.d<Unit> create(kotlin.coroutines.d<?> dVar) {
        return new z(this.f90754d, this.f90755e, dVar);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(kotlin.coroutines.d<? super Unit> dVar) {
        return ((z) create(dVar)).invokeSuspend(Unit.f71690a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
        Sc.s.b(obj);
        C9509v c9509v = this.f90754d;
        C10727i.c(x0.a(c9509v), null, null, new a(c9509v, this.f90755e, null), 3);
        return Unit.f71690a;
    }
}
