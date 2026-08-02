package ru.ozon.android.messenger.framework.presentation.chatlist.viewmodel;

import Ae.x0;
import com.google.android.gms.wallet.WalletConstants;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.C7714v;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.android.messenger.framework.navigation.controller.d;
import ru.ozon.android.messenger.framework.presentation.chatlist.disclaimermodal.a;
import ru.ozon.android.messenger.utils.i;
import xe.C10727i;

@kotlin.coroutines.jvm.internal.e(c = "ru.ozon.android.messenger.framework.presentation.chatlist.viewmodel.ChatListViewModelImpl$handleActionWrapper$2", f = "ChatListViewModel.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes10.dex */
final class x extends kotlin.coroutines.jvm.internal.j implements Function1<kotlin.coroutines.d<? super Unit>, Object> {

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ C9509v f90743d;

    /* renamed from: e, reason: collision with root package name */
    final /* synthetic */ d.f f90744e;

    @kotlin.coroutines.jvm.internal.e(c = "ru.ozon.android.messenger.framework.presentation.chatlist.viewmodel.ChatListViewModelImpl$handleActionWrapper$2$1", f = "ChatListViewModel.kt", l = {WalletConstants.ERROR_CODE_INVALID_PARAMETERS}, m = "invokeSuspend")
    static final class a extends kotlin.coroutines.jvm.internal.j implements Function2<xe.M, kotlin.coroutines.d<? super Unit>, Object> {

        /* renamed from: d, reason: collision with root package name */
        int f90745d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ C9509v f90746e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ d.f f90747f;

        /* renamed from: ru.ozon.android.messenger.framework.presentation.chatlist.viewmodel.x$a$a, reason: collision with other inner class name */
        static final class C1684a extends AbstractC7737t implements Function1<ru.ozon.android.messenger.framework.presentation.chatlist.f, ru.ozon.android.messenger.framework.presentation.chatlist.f> {

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ C9509v f90748b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C1684a(C9509v c9509v) {
                super(1);
                this.f90748b = c9509v;
            }

            @Override // kotlin.jvm.functions.Function1
            public final ru.ozon.android.messenger.framework.presentation.chatlist.f invoke(ru.ozon.android.messenger.framework.presentation.chatlist.f fVar) {
                ru.ozon.android.messenger.blocks.alert.a aVar;
                ru.ozon.android.messenger.framework.presentation.chatlist.f old = fVar;
                Intrinsics.checkNotNullParameter(old, "old");
                List<ru.ozon.android.messenger.framework.presentation.models.q> f7 = old.f();
                aVar = this.f90748b.f90703k;
                return ru.ozon.android.messenger.framework.presentation.chatlist.f.a(old, null, C7714v.q0(aVar.b(3000L), f7), null, null, null, null, null, null, null, 2045);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(C9509v c9509v, d.f fVar, kotlin.coroutines.d<? super a> dVar) {
            super(2, dVar);
            this.f90746e = c9509v;
            this.f90747f = fVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            return new a(this.f90746e, this.f90747f, dVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(xe.M m11, kotlin.coroutines.d<? super Unit> dVar) {
            return ((a) create(m11, dVar)).invokeSuspend(Unit.f71690a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            ru.ozon.android.messenger.framework.domain.repository.a aVar;
            ru.ozon.android.messenger.framework.presentation.chatlist.d dVar;
            ru.ozon.android.messenger.blocks.disclaimer.modal.e eVar;
            x0 x0Var;
            Wc.a aVar2 = Wc.a.COROUTINE_SUSPENDED;
            int i11 = this.f90745d;
            C9509v c9509v = this.f90746e;
            if (i11 == 0) {
                Sc.s.b(obj);
                aVar = c9509v.f90704l;
                ru.ozon.android.messenger.framework.navigation.action.a a11 = this.f90747f.a();
                this.f90745d = 1;
                obj = aVar.c(a11, this);
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
            if ((iVar instanceof i.b) && (eVar = (ru.ozon.android.messenger.blocks.disclaimer.modal.e) ((i.b) iVar).b()) != null) {
                x0Var = c9509v.f90711s;
                x0Var.tryEmit(new a.c(eVar));
            }
            if (iVar instanceof i.a) {
                dVar = c9509v.f90700h;
                dVar.a(new C1684a(c9509v));
            }
            return Unit.f71690a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    x(C9509v c9509v, d.f fVar, kotlin.coroutines.d<? super x> dVar) {
        super(1, dVar);
        this.f90743d = c9509v;
        this.f90744e = fVar;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final kotlin.coroutines.d<Unit> create(kotlin.coroutines.d<?> dVar) {
        return new x(this.f90743d, this.f90744e, dVar);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(kotlin.coroutines.d<? super Unit> dVar) {
        return ((x) create(dVar)).invokeSuspend(Unit.f71690a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
        Sc.s.b(obj);
        C9509v c9509v = this.f90743d;
        C10727i.c(androidx.lifecycle.x0.a(c9509v), null, null, new a(c9509v, this.f90744e, null), 3);
        return Unit.f71690a;
    }
}
