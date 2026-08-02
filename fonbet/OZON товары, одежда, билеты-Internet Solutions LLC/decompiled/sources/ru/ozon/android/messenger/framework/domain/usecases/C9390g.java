package ru.ozon.android.messenger.framework.domain.usecases;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

@kotlin.coroutines.jvm.internal.e(c = "ru.ozon.android.messenger.framework.domain.usecases.ChatEnterUseCase$invoke$2", f = "ChatEnterUseCase.kt", l = {17}, m = "invokeSuspend")
/* renamed from: ru.ozon.android.messenger.framework.domain.usecases.g, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
final class C9390g extends kotlin.coroutines.jvm.internal.j implements Function1<kotlin.coroutines.d<? super ru.ozon.android.messenger.utils.i<? extends ru.ozon.android.messenger.framework.presentation.models.responses.a>>, Object> {

    /* renamed from: d, reason: collision with root package name */
    int f89080d;

    /* renamed from: e, reason: collision with root package name */
    final /* synthetic */ C9391h f89081e;

    /* renamed from: f, reason: collision with root package name */
    final /* synthetic */ ru.ozon.android.messenger.framework.data.requests.a f89082f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    C9390g(C9391h c9391h, ru.ozon.android.messenger.framework.data.requests.a aVar, kotlin.coroutines.d<? super C9390g> dVar) {
        super(1, dVar);
        this.f89081e = c9391h;
        this.f89082f = aVar;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final kotlin.coroutines.d<Unit> create(kotlin.coroutines.d<?> dVar) {
        return new C9390g(this.f89081e, this.f89082f, dVar);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(kotlin.coroutines.d<? super ru.ozon.android.messenger.utils.i<? extends ru.ozon.android.messenger.framework.presentation.models.responses.a>> dVar) {
        return ((C9390g) create(dVar)).invokeSuspend(Unit.f71690a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        ru.ozon.android.messenger.framework.domain.repository.b bVar;
        Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
        int i11 = this.f89080d;
        if (i11 != 0) {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            Sc.s.b(obj);
            return obj;
        }
        Sc.s.b(obj);
        bVar = this.f89081e.f89084a;
        this.f89080d = 1;
        Object u11 = bVar.u(this.f89082f, this);
        return u11 == aVar ? aVar : u11;
    }
}
