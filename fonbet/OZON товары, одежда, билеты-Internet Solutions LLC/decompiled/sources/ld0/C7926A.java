package ld0;

import Kb0.K;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import ru.ozon.id.ozonLimb.debug.OzonIdDebugActivity;

@kotlin.coroutines.jvm.internal.e(c = "ru.ozon.id.ozonLimb.debug.OzonIdDebugMainFragment$switchBiometry$1", f = "OzonIdDebugMainFragment.kt", l = {190}, m = "invokeSuspend")
/* renamed from: ld0.A, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
final class C7926A extends kotlin.coroutines.jvm.internal.j implements Function1<kotlin.coroutines.d<? super Unit>, Object> {

    /* renamed from: d, reason: collision with root package name */
    int f73180d;

    /* renamed from: e, reason: collision with root package name */
    final /* synthetic */ boolean f73181e;

    /* renamed from: f, reason: collision with root package name */
    final /* synthetic */ x f73182f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    C7926A(boolean z11, x xVar, kotlin.coroutines.d<? super C7926A> dVar) {
        super(1, dVar);
        this.f73181e = z11;
        this.f73182f = xVar;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final kotlin.coroutines.d<Unit> create(kotlin.coroutines.d<?> dVar) {
        return new C7926A(this.f73181e, this.f73182f, dVar);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(kotlin.coroutines.d<? super Unit> dVar) {
        return ((C7926A) create(dVar)).invokeSuspend(Unit.f71690a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        OzonIdDebugActivity F11;
        Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
        int i11 = this.f73180d;
        boolean z11 = this.f73181e;
        if (i11 == 0) {
            Sc.s.b(obj);
            K k11 = Tb0.a.f26975d;
            if (k11 == null) {
                throw new Lb0.a();
            }
            Fb0.a value = k11.q().getValue();
            this.f73180d = 1;
            if (value.a(z11, "entry", this) == aVar) {
                return aVar;
            }
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            Sc.s.b(obj);
        }
        F11 = this.f73182f.F();
        if (F11 != null) {
            F11.R("Биометрия: ".concat(z11 ? "Включена" : "Отключена"));
        }
        return Unit.f71690a;
    }
}
