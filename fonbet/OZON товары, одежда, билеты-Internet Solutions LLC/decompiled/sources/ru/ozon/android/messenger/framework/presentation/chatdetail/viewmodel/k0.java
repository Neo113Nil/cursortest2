package ru.ozon.android.messenger.framework.presentation.chatdetail.viewmodel;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import ru.ozon.android.messenger.framework.data.requests.h;
import ru.ozon.android.messenger.framework.presentation.common.notification.i;

@kotlin.coroutines.jvm.internal.e(c = "ru.ozon.android.messenger.framework.presentation.chatdetail.viewmodel.ChatViewModelImpl$setChatState$1", f = "ChatViewModel.kt", l = {458}, m = "invokeSuspend")
/* loaded from: classes10.dex */
final class k0 extends kotlin.coroutines.jvm.internal.j implements Function2<xe.M, kotlin.coroutines.d<? super Unit>, Object> {

    /* renamed from: d, reason: collision with root package name */
    int f90280d;

    /* renamed from: e, reason: collision with root package name */
    final /* synthetic */ C9467e f90281e;

    /* renamed from: f, reason: collision with root package name */
    final /* synthetic */ h.a f90282f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    k0(C9467e c9467e, h.a aVar, kotlin.coroutines.d<? super k0> dVar) {
        super(2, dVar);
        this.f90281e = c9467e;
        this.f90282f = aVar;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
        return new k0(this.f90281e, this.f90282f, dVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(xe.M m11, kotlin.coroutines.d<? super Unit> dVar) {
        return ((k0) create(m11, dVar)).invokeSuspend(Unit.f71690a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        ru.ozon.android.messenger.framework.domain.usecases.b0 b0Var;
        ru.ozon.android.messenger.framework.presentation.common.notification.i iVar;
        Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
        int i11 = this.f90280d;
        if (i11 == 0) {
            Sc.s.b(obj);
            C9467e c9467e = this.f90281e;
            b0Var = c9467e.f90211g;
            String value = c9467e.e().getValue();
            if (value == null) {
                value = "";
            }
            iVar = c9467e.f90217m;
            boolean a11 = ((i.a) iVar).a();
            this.f90280d = 1;
            if (b0Var.a(this.f90282f, value, a11, this) == aVar) {
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
