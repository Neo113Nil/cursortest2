package xe;

import java.util.concurrent.CancellationException;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;

@kotlin.coroutines.jvm.internal.e(c = "kotlinx.coroutines.InterruptibleKt$runInterruptible$2", f = "Interruptible.kt", l = {}, m = "invokeSuspend")
/* renamed from: xe.x0, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
final class C10757x0 extends kotlin.coroutines.jvm.internal.j implements Function2<M, kotlin.coroutines.d<Object>, Object> {

    /* renamed from: d, reason: collision with root package name */
    private /* synthetic */ Object f105502d;

    /* renamed from: e, reason: collision with root package name */
    final /* synthetic */ AbstractC7737t f105503e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    C10757x0(Function0<Object> function0, kotlin.coroutines.d<? super C10757x0> dVar) {
        super(2, dVar);
        this.f105503e = (AbstractC7737t) function0;
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [kotlin.jvm.functions.Function0, kotlin.jvm.internal.t] */
    @Override // kotlin.coroutines.jvm.internal.a
    public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
        C10757x0 c10757x0 = new C10757x0(this.f105503e, dVar);
        c10757x0.f105502d = obj;
        return c10757x0;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(M m11, kotlin.coroutines.d<Object> dVar) {
        return ((C10757x0) create(m11, dVar)).invokeSuspend(Unit.f71690a);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [kotlin.jvm.functions.Function0, kotlin.jvm.internal.t] */
    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
        Sc.s.b(obj);
        CoroutineContext coroutineContext = ((M) this.f105502d).getCoroutineContext();
        ?? r02 = this.f105503e;
        try {
            c1 c1Var = new c1();
            c1Var.r(E0.g(coroutineContext));
            try {
                return r02.invoke();
            } finally {
                c1Var.p();
            }
        } catch (InterruptedException e11) {
            throw new CancellationException("Blocking call was interrupted due to parent cancellation").initCause(e11);
        }
    }
}
