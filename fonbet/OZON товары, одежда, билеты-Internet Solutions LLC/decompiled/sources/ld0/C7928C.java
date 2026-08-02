package ld0;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import ru.ozon.id.ozonLimb.debug.OzonIdDebugActivity;
import xe.M;

@kotlin.coroutines.jvm.internal.e(c = "ru.ozon.id.ozonLimb.debug.OzonIdDebugMainFragment$switchSafe$1", f = "OzonIdDebugMainFragment.kt", l = {198}, m = "invokeSuspend")
/* renamed from: ld0.C, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
final class C7928C extends kotlin.coroutines.jvm.internal.j implements Function2<M, kotlin.coroutines.d<? super Unit>, Object> {

    /* renamed from: d, reason: collision with root package name */
    int f73186d;

    /* renamed from: e, reason: collision with root package name */
    final /* synthetic */ kotlin.coroutines.jvm.internal.j f73187e;

    /* renamed from: f, reason: collision with root package name */
    final /* synthetic */ x f73188f;

    /* renamed from: g, reason: collision with root package name */
    final /* synthetic */ String f73189g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    C7928C(Function1<? super kotlin.coroutines.d<? super Unit>, ? extends Object> function1, x xVar, String str, kotlin.coroutines.d<? super C7928C> dVar) {
        super(2, dVar);
        this.f73187e = (kotlin.coroutines.jvm.internal.j) function1;
        this.f73188f = xVar;
        this.f73189g = str;
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [kotlin.coroutines.jvm.internal.j, kotlin.jvm.functions.Function1] */
    @Override // kotlin.coroutines.jvm.internal.a
    public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
        return new C7928C(this.f73187e, this.f73188f, this.f73189g, dVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(M m11, kotlin.coroutines.d<? super Unit> dVar) {
        return ((C7928C) create(m11, dVar)).invokeSuspend(Unit.f71690a);
    }

    /* JADX WARN: Type inference failed for: r4v5, types: [kotlin.coroutines.jvm.internal.j, kotlin.jvm.functions.Function1] */
    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        OzonIdDebugActivity F11;
        Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
        int i11 = this.f73186d;
        try {
            if (i11 == 0) {
                Sc.s.b(obj);
                ?? r42 = this.f73187e;
                this.f73186d = 1;
                if (r42.invoke(this) == aVar) {
                    return aVar;
                }
            } else {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                Sc.s.b(obj);
            }
        } catch (Throwable th2) {
            F11 = this.f73188f.F();
            if (F11 != null) {
                F11.R(this.f73189g + ": Ошибка " + th2.getMessage());
            }
        }
        return Unit.f71690a;
    }
}
