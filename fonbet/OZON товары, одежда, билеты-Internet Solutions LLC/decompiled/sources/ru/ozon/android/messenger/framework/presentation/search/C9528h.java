package ru.ozon.android.messenger.framework.presentation.search;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

@kotlin.coroutines.jvm.internal.e(c = "ru.ozon.android.messenger.framework.presentation.search.ChatSearchViewModel$3$1", f = "ChatSearchViewModel.kt", l = {212}, m = "invokeSuspend")
/* renamed from: ru.ozon.android.messenger.framework.presentation.search.h, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
final class C9528h extends kotlin.coroutines.jvm.internal.j implements Function2<xe.M, kotlin.coroutines.d<? super Unit>, Object> {

    /* renamed from: d, reason: collision with root package name */
    int f91761d;

    /* renamed from: e, reason: collision with root package name */
    final /* synthetic */ C9527g f91762e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    C9528h(C9527g c9527g, kotlin.coroutines.d<? super C9528h> dVar) {
        super(2, dVar);
        this.f91762e = c9527g;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
        return new C9528h(this.f91762e, dVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(xe.M m11, kotlin.coroutines.d<? super Unit> dVar) {
        return ((C9528h) create(m11, dVar)).invokeSuspend(Unit.f71690a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
        int i11 = this.f91761d;
        if (i11 == 0) {
            Sc.s.b(obj);
            this.f91761d = 1;
            if (C9527g.y0(this.f91762e, this) == aVar) {
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
