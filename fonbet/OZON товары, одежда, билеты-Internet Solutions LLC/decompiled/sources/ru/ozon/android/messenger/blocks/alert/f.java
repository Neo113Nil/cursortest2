package ru.ozon.android.messenger.blocks.alert;

import Sc.s;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.j;
import kotlin.jvm.functions.Function2;
import ru.ozon.android.messenger.framework.presentation.models.h;
import xe.M;
import xe.Y;

@kotlin.coroutines.jvm.internal.e(c = "ru.ozon.android.messenger.blocks.alert.AlertNoUiViewMapper$setupTtl$1", f = "AlertNoUiViewMapper.kt", l = {90}, m = "invokeSuspend")
/* loaded from: classes10.dex */
final class f extends j implements Function2<M, kotlin.coroutines.d<? super Unit>, Object> {

    /* renamed from: d, reason: collision with root package name */
    int f84391d;

    /* renamed from: e, reason: collision with root package name */
    final /* synthetic */ g f84392e;

    /* renamed from: f, reason: collision with root package name */
    final /* synthetic */ ru.ozon.android.messenger.framework.navigation.controller.a f84393f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    f(g gVar, ru.ozon.android.messenger.framework.navigation.controller.a aVar, kotlin.coroutines.d<? super f> dVar) {
        super(2, dVar);
        this.f84392e = gVar;
        this.f84393f = aVar;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
        return new f(this.f84392e, this.f84393f, dVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(M m11, kotlin.coroutines.d<? super Unit> dVar) {
        return ((f) create(m11, dVar)).invokeSuspend(Unit.f71690a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
        int i11 = this.f84391d;
        g gVar = this.f84392e;
        if (i11 == 0) {
            s.b(obj);
            long longValue = gVar.b().longValue();
            this.f84391d = 1;
            if (Y.b(longValue, this) == aVar) {
                return aVar;
            }
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            s.b(obj);
        }
        this.f84393f.t(h.b(gVar));
        return Unit.f71690a;
    }
}
