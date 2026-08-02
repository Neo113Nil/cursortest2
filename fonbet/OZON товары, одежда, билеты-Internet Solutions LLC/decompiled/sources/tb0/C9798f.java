package tb0;

import Sc.s;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.j;
import kotlin.jvm.functions.Function2;
import xe.M;

@kotlin.coroutines.jvm.internal.e(c = "ru.ozon.id.antibot.challenge.js.AntibotJSChallengeManager$send$2", f = "AntibotJSChallengeManager.kt", l = {}, m = "invokeSuspend")
/* renamed from: tb0.f, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
final class C9798f extends j implements Function2<M, kotlin.coroutines.d<? super Unit>, Object> {

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ C9796d f99361d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    C9798f(C9796d c9796d, kotlin.coroutines.d<? super C9798f> dVar) {
        super(2, dVar);
        this.f99361d = c9796d;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
        return new C9798f(this.f99361d, dVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(M m11, kotlin.coroutines.d<? super Unit> dVar) {
        return ((C9798f) create(m11, dVar)).invokeSuspend(Unit.f71690a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
        s.b(obj);
        this.f99361d.f99340g = null;
        return Unit.f71690a;
    }
}
