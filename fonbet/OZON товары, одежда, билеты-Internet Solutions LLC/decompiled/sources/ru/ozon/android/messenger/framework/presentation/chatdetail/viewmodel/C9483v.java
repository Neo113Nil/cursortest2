package ru.ozon.android.messenger.framework.presentation.chatdetail.viewmodel;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import ru.ozon.android.messenger.framework.domain.usecases.C9402t;

@kotlin.coroutines.jvm.internal.e(c = "ru.ozon.android.messenger.framework.presentation.chatdetail.viewmodel.ChatViewModelImpl$handleExternalAction$1$1", f = "ChatViewModel.kt", l = {1027}, m = "invokeSuspend")
/* renamed from: ru.ozon.android.messenger.framework.presentation.chatdetail.viewmodel.v, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
final class C9483v extends kotlin.coroutines.jvm.internal.j implements Function2<xe.M, kotlin.coroutines.d<? super Unit>, Object> {

    /* renamed from: d, reason: collision with root package name */
    int f90363d;

    /* renamed from: e, reason: collision with root package name */
    final /* synthetic */ C9467e f90364e;

    /* renamed from: f, reason: collision with root package name */
    final /* synthetic */ ru.ozon.android.messenger.framework.presentation.models.q f90365f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    C9483v(C9467e c9467e, ru.ozon.android.messenger.framework.presentation.models.q qVar, kotlin.coroutines.d<? super C9483v> dVar) {
        super(2, dVar);
        this.f90364e = c9467e;
        this.f90365f = qVar;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
        return new C9483v(this.f90364e, this.f90365f, dVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(xe.M m11, kotlin.coroutines.d<? super Unit> dVar) {
        return ((C9483v) create(m11, dVar)).invokeSuspend(Unit.f71690a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
        int i11 = this.f90363d;
        if (i11 == 0) {
            Sc.s.b(obj);
            C9402t c9402t = this.f90364e.f90222r;
            C9402t.a.C1638a c1638a = new C9402t.a.C1638a(this.f90365f, ru.ozon.android.messenger.framework.presentation.models.x.FOOTER, "button_alert");
            this.f90363d = 1;
            c9402t.getClass();
            if (C9402t.e(c9402t, c1638a, this) == aVar) {
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
