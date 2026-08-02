package gc0;

import Sc.InterfaceC4008j;
import Sc.s;
import hc0.C6910a;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.j;
import kotlin.jvm.functions.Function2;
import xe.M;

@kotlin.coroutines.jvm.internal.e(c = "ru.ozon.id.nativeauth.biometry.BiometryAuthViewModelDelegate$onCryptoError$1", f = "BiometryAuthViewModelDelegate.kt", l = {113}, m = "invokeSuspend")
/* renamed from: gc0.d, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
final class C6711d extends j implements Function2<M, kotlin.coroutines.d<? super Unit>, Object> {

    /* renamed from: d, reason: collision with root package name */
    int f64245d;

    /* renamed from: e, reason: collision with root package name */
    final /* synthetic */ C6709b f64246e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    C6711d(C6709b c6709b, kotlin.coroutines.d<? super C6711d> dVar) {
        super(2, dVar);
        this.f64246e = c6709b;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
        return new C6711d(this.f64246e, dVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(M m11, kotlin.coroutines.d<? super Unit> dVar) {
        return ((C6711d) create(m11, dVar)).invokeSuspend(Unit.f71690a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        InterfaceC4008j interfaceC4008j;
        InterfaceC4008j interfaceC4008j2;
        String str;
        Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
        int i11 = this.f64245d;
        C6709b c6709b = this.f64246e;
        if (i11 == 0) {
            s.b(obj);
            C6910a c6910a = (C6910a) c6709b.f64230d.getValue();
            this.f64245d = 1;
            if (c6910a.g(this) == aVar) {
                return aVar;
            }
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            s.b(obj);
        }
        interfaceC4008j = c6709b.f64231e;
        Pc0.c cVar = (Pc0.c) interfaceC4008j.getValue();
        interfaceC4008j2 = c6709b.f64231e;
        Pc0.c cVar2 = (Pc0.c) interfaceC4008j2.getValue();
        str = c6709b.f64228b;
        cVar.C(cVar2.o(str).b());
        return Unit.f71690a;
    }
}
