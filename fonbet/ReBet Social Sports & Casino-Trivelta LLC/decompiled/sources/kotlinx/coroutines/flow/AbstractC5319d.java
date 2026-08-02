package kotlinx.coroutines.flow;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.jvm.functions.Function2;

/* renamed from: kotlinx.coroutines.flow.d, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public abstract class AbstractC5319d extends kotlinx.coroutines.flow.internal.e {

    /* renamed from: d, reason: collision with root package name */
    public final Function2 f54679d;

    public AbstractC5319d(Function2 function2, CoroutineContext coroutineContext, int i10, Rh.d dVar) {
        super(coroutineContext, i10, dVar);
        this.f54679d = function2;
    }

    public static /* synthetic */ Object n(AbstractC5319d abstractC5319d, Rh.y yVar, Continuation continuation) {
        Object invoke = abstractC5319d.f54679d.invoke(yVar, continuation);
        return invoke == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? invoke : Unit.INSTANCE;
    }

    @Override // kotlinx.coroutines.flow.internal.e
    public Object f(Rh.y yVar, Continuation continuation) {
        return n(this, yVar, continuation);
    }

    @Override // kotlinx.coroutines.flow.internal.e
    public String toString() {
        return "block[" + this.f54679d + "] -> " + super.toString();
    }
}
