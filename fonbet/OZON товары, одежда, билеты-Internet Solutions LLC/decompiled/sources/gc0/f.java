package gc0;

import Ae.C0;
import Ae.w0;
import Sc.s;
import kc0.InterfaceC7643a;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.j;
import kotlin.jvm.functions.Function2;
import xe.M;

@kotlin.coroutines.jvm.internal.e(c = "ru.ozon.id.nativeauth.biometry.BiometryAuthViewModelDelegate$showAuthByBiometryDialog$1", f = "BiometryAuthViewModelDelegate.kt", l = {124}, m = "invokeSuspend")
/* loaded from: classes3.dex */
final class f extends j implements Function2<M, kotlin.coroutines.d<? super Unit>, Object> {

    /* renamed from: d, reason: collision with root package name */
    int f64249d;

    /* renamed from: e, reason: collision with root package name */
    final /* synthetic */ C6709b f64250e;

    /* renamed from: f, reason: collision with root package name */
    final /* synthetic */ InterfaceC7643a.c f64251f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    f(C6709b c6709b, InterfaceC7643a.c cVar, kotlin.coroutines.d<? super f> dVar) {
        super(2, dVar);
        this.f64250e = c6709b;
        this.f64251f = cVar;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
        return new f(this.f64250e, this.f64251f, dVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(M m11, kotlin.coroutines.d<? super Unit> dVar) {
        return ((f) create(m11, dVar)).invokeSuspend(Unit.f71690a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        w0 w0Var;
        Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
        int i11 = this.f64249d;
        if (i11 == 0) {
            s.b(obj);
            w0Var = this.f64250e.f64233g;
            this.f64249d = 1;
            if (((C0) w0Var).emit(this.f64251f, this) == aVar) {
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
