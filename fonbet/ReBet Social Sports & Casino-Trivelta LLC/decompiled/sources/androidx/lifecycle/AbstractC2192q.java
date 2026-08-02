package androidx.lifecycle;

import Ph.C1452g0;
import Ph.X0;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: androidx.lifecycle.q, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC2192q {
    public static final AbstractC2188m a(AbstractC2185j abstractC2185j) {
        LifecycleCoroutineScopeImpl lifecycleCoroutineScopeImpl;
        Intrinsics.checkNotNullParameter(abstractC2185j, "<this>");
        do {
            LifecycleCoroutineScopeImpl lifecycleCoroutineScopeImpl2 = (LifecycleCoroutineScopeImpl) abstractC2185j.c().b();
            if (lifecycleCoroutineScopeImpl2 != null) {
                return lifecycleCoroutineScopeImpl2;
            }
            lifecycleCoroutineScopeImpl = new LifecycleCoroutineScopeImpl(abstractC2185j, X0.b(null, 1, null).plus(C1452g0.c().e2()));
        } while (!abstractC2185j.c().a(null, lifecycleCoroutineScopeImpl));
        lifecycleCoroutineScopeImpl.f();
        return lifecycleCoroutineScopeImpl;
    }
}
