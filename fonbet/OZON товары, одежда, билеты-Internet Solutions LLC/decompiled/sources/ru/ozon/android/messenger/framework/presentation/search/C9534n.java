package ru.ozon.android.messenger.framework.presentation.search;

import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

@kotlin.coroutines.jvm.internal.e(c = "ru.ozon.android.messenger.framework.presentation.search.ChatSearchViewModel$handleSocketConnectionError$2$1", f = "ChatSearchViewModel.kt", l = {347}, m = "invokeSuspend")
/* renamed from: ru.ozon.android.messenger.framework.presentation.search.n, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
final class C9534n extends kotlin.coroutines.jvm.internal.j implements Function2<xe.M, kotlin.coroutines.d<? super Unit>, Object> {

    /* renamed from: d, reason: collision with root package name */
    int f91777d;

    /* renamed from: e, reason: collision with root package name */
    final /* synthetic */ C9527g f91778e;

    /* renamed from: f, reason: collision with root package name */
    final /* synthetic */ List<ru.ozon.android.messenger.framework.presentation.models.q> f91779f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    C9534n(C9527g c9527g, List<ru.ozon.android.messenger.framework.presentation.models.q> list, kotlin.coroutines.d<? super C9534n> dVar) {
        super(2, dVar);
        this.f91778e = c9527g;
        this.f91779f = list;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
        return new C9534n(this.f91778e, this.f91779f, dVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(xe.M m11, kotlin.coroutines.d<? super Unit> dVar) {
        return ((C9534n) create(m11, dVar)).invokeSuspend(Unit.f71690a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        Object G02;
        Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
        int i11 = this.f91777d;
        if (i11 == 0) {
            Sc.s.b(obj);
            this.f91777d = 1;
            G02 = this.f91778e.G0(this.f91779f, this);
            if (G02 == aVar) {
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
