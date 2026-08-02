package androidx.lifecycle;

import androidx.lifecycle.AbstractC2185j;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.jvm.functions.Function2;

/* loaded from: classes.dex */
public abstract class RepeatOnLifecycleKt {
    public static final Object a(AbstractC2185j abstractC2185j, AbstractC2185j.b bVar, Function2 function2, Continuation continuation) {
        if (bVar == AbstractC2185j.b.f20391b) {
            throw new IllegalArgumentException("repeatOnLifecycle cannot start work with the INITIALIZED lifecycle state.");
        }
        if (abstractC2185j.b() == AbstractC2185j.b.f20390a) {
            return Unit.INSTANCE;
        }
        Object g10 = Ph.Q.g(new RepeatOnLifecycleKt$repeatOnLifecycle$3(abstractC2185j, bVar, function2, null), continuation);
        return g10 == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? g10 : Unit.INSTANCE;
    }

    public static final Object b(InterfaceC2193s interfaceC2193s, AbstractC2185j.b bVar, Function2 function2, Continuation continuation) {
        Object a10 = a(interfaceC2193s.getLifecycle(), bVar, function2, continuation);
        return a10 == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? a10 : Unit.INSTANCE;
    }
}
