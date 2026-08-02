package gc0;

import Sc.s;
import hc0.C6910a;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.j;
import kotlin.jvm.functions.Function2;
import xe.M;

@kotlin.coroutines.jvm.internal.e(c = "ru.ozon.id.nativeauth.biometry.BiometryAuthViewModelDelegate$onSignatureIsBroken$1", f = "BiometryAuthViewModelDelegate.kt", l = {129}, m = "invokeSuspend")
/* loaded from: classes3.dex */
final class e extends j implements Function2<M, kotlin.coroutines.d<? super Unit>, Object> {

    /* renamed from: d, reason: collision with root package name */
    int f64247d;

    /* renamed from: e, reason: collision with root package name */
    final /* synthetic */ C6709b f64248e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    e(C6709b c6709b, kotlin.coroutines.d<? super e> dVar) {
        super(2, dVar);
        this.f64248e = c6709b;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
        return new e(this.f64248e, dVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(M m11, kotlin.coroutines.d<? super Unit> dVar) {
        return ((e) create(m11, dVar)).invokeSuspend(Unit.f71690a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
        int i11 = this.f64247d;
        if (i11 == 0) {
            s.b(obj);
            C6910a c6910a = (C6910a) this.f64248e.f64230d.getValue();
            this.f64247d = 1;
            if (c6910a.g(this) == aVar) {
                return aVar;
            }
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            s.b(obj);
        }
        return Unit.f71690a;
    }
}
