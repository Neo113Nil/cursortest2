package ru.ozon.android.messenger.framework.presentation.chatdetail.viewmodel;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import ru.ozon.android.messenger.framework.domain.model.g;

@kotlin.coroutines.jvm.internal.e(c = "ru.ozon.android.messenger.framework.presentation.chatdetail.viewmodel.ChatViewModelImpl$handleAction$1", f = "ChatViewModel.kt", l = {617}, m = "invokeSuspend")
/* renamed from: ru.ozon.android.messenger.framework.presentation.chatdetail.viewmodel.k, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
final class C9473k extends kotlin.coroutines.jvm.internal.j implements Function2<xe.M, kotlin.coroutines.d<? super Unit>, Object> {

    /* renamed from: d, reason: collision with root package name */
    int f90277d;

    /* renamed from: e, reason: collision with root package name */
    final /* synthetic */ C9467e f90278e;

    /* renamed from: f, reason: collision with root package name */
    final /* synthetic */ String f90279f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    C9473k(C9467e c9467e, String str, kotlin.coroutines.d<? super C9473k> dVar) {
        super(2, dVar);
        this.f90278e = c9467e;
        this.f90279f = str;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
        return new C9473k(this.f90278e, this.f90279f, dVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(xe.M m11, kotlin.coroutines.d<? super Unit> dVar) {
        return ((C9473k) create(m11, dVar)).invokeSuspend(Unit.f71690a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        ru.ozon.android.messenger.framework.domain.usecases.P p11;
        Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
        int i11 = this.f90277d;
        if (i11 == 0) {
            Sc.s.b(obj);
            p11 = this.f90278e.f90224s;
            g.b bVar = new g.b(this.f90279f);
            this.f90277d = 1;
            if (p11.i(bVar, this) == aVar) {
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
