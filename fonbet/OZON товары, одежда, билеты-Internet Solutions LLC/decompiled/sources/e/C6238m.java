package e;

import Sc.s;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import org.jetbrains.annotations.NotNull;
import xe.M;

@kotlin.coroutines.jvm.internal.e(c = "androidx.activity.compose.PredictiveBackHandlerKt$PredictiveBackHandler$1$1", f = "PredictiveBackHandler.kt", l = {}, m = "invokeSuspend")
/* renamed from: e.m, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
final class C6238m extends kotlin.coroutines.jvm.internal.j implements Function2<M, kotlin.coroutines.d<? super Unit>, Object> {

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ C6242q f61714d;

    /* renamed from: e, reason: collision with root package name */
    final /* synthetic */ boolean f61715e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    C6238m(C6242q c6242q, boolean z11, kotlin.coroutines.d<? super C6238m> dVar) {
        super(2, dVar);
        this.f61714d = c6242q;
        this.f61715e = z11;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    @NotNull
    public final kotlin.coroutines.d<Unit> create(Object obj, @NotNull kotlin.coroutines.d<?> dVar) {
        return new C6238m(this.f61714d, this.f61715e, dVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(M m11, kotlin.coroutines.d<? super Unit> dVar) {
        return ((C6238m) create(m11, dVar)).invokeSuspend(Unit.f71690a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(@NotNull Object obj) {
        Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
        s.b(obj);
        this.f61714d.setEnabled(this.f61715e);
        return Unit.f71690a;
    }
}
