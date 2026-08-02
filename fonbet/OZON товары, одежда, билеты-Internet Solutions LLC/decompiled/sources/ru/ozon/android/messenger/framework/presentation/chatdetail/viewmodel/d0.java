package ru.ozon.android.messenger.framework.presentation.chatdetail.viewmodel;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

@kotlin.coroutines.jvm.internal.e(c = "ru.ozon.android.messenger.framework.presentation.chatdetail.viewmodel.ChatViewModelImpl$onMessageEdited$1", f = "ChatViewModel.kt", l = {1061}, m = "invokeSuspend")
/* loaded from: classes10.dex */
final class d0 extends kotlin.coroutines.jvm.internal.j implements Function2<xe.M, kotlin.coroutines.d<? super Unit>, Object> {

    /* renamed from: d, reason: collision with root package name */
    int f90063d;

    /* renamed from: e, reason: collision with root package name */
    final /* synthetic */ C9467e f90064e;

    /* renamed from: f, reason: collision with root package name */
    final /* synthetic */ String f90065f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    d0(C9467e c9467e, String str, kotlin.coroutines.d<? super d0> dVar) {
        super(2, dVar);
        this.f90064e = c9467e;
        this.f90065f = str;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
        return new d0(this.f90064e, this.f90065f, dVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(xe.M m11, kotlin.coroutines.d<? super Unit> dVar) {
        return ((d0) create(m11, dVar)).invokeSuspend(Unit.f71690a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        ru.ozon.android.messenger.framework.domain.usecases.g0 g0Var;
        Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
        int i11 = this.f90063d;
        if (i11 == 0) {
            Sc.s.b(obj);
            g0Var = this.f90064e.f90215k;
            ru.ozon.android.messenger.framework.data.requests.k kVar = new ru.ozon.android.messenger.framework.data.requests.k(this.f90065f);
            this.f90063d = 1;
            if (g0Var.a(kVar, this) == aVar) {
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
