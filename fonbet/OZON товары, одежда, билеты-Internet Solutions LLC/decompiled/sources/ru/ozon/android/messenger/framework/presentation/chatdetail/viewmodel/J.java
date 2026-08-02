package ru.ozon.android.messenger.framework.presentation.chatdetail.viewmodel;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import ru.ozon.android.messenger.framework.presentation.chatdetail.j;

@kotlin.coroutines.jvm.internal.e(c = "ru.ozon.android.messenger.framework.presentation.chatdetail.viewmodel.ChatViewModelImpl$handleScrollToMessage$2", f = "ChatViewModel.kt", l = {1195}, m = "invokeSuspend")
/* loaded from: classes10.dex */
final class J extends kotlin.coroutines.jvm.internal.j implements Function2<xe.M, kotlin.coroutines.d<? super Unit>, Object> {

    /* renamed from: d, reason: collision with root package name */
    int f90000d;

    /* renamed from: e, reason: collision with root package name */
    final /* synthetic */ C9467e f90001e;

    /* renamed from: f, reason: collision with root package name */
    final /* synthetic */ String f90002f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    J(C9467e c9467e, String str, kotlin.coroutines.d<? super J> dVar) {
        super(2, dVar);
        this.f90001e = c9467e;
        this.f90002f = str;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
        return new J(this.f90001e, this.f90002f, dVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(xe.M m11, kotlin.coroutines.d<? super Unit> dVar) {
        return ((J) create(m11, dVar)).invokeSuspend(Unit.f71690a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        ru.ozon.android.messenger.framework.presentation.chatdetail.viewmodel.delegates.a aVar;
        Wc.a aVar2 = Wc.a.COROUTINE_SUSPENDED;
        int i11 = this.f90000d;
        String str = this.f90002f;
        C9467e c9467e = this.f90001e;
        if (i11 == 0) {
            Sc.s.b(obj);
            aVar = c9467e.f90220p;
            this.f90000d = 1;
            if (aVar.Z(str, this) == aVar2) {
                return aVar2;
            }
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            Sc.s.b(obj);
        }
        C9467e.f1(c9467e, new j.k(str));
        return Unit.f71690a;
    }
}
