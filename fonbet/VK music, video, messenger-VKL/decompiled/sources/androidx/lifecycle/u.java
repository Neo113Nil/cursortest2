package androidx.lifecycle;

import androidx.lifecycle.Lifecycle;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import xsna.f5z;
import xsna.s3q0;
import xsna.wzs;
import xsna.zvj;

/* compiled from: RepeatOnLifecycle.kt */
/* loaded from: classes12.dex */
public final class u {
    public static final Object a(f5z f5zVar, Lifecycle.State state, wzs wzsVar, SuspendLambda suspendLambda) {
        Object d;
        Lifecycle lifecycle = f5zVar.getLifecycle();
        if (state == Lifecycle.State.INITIALIZED) {
            throw new IllegalArgumentException("repeatOnLifecycle cannot start work with the INITIALIZED lifecycle state.");
        }
        if (lifecycle.getCurrentState() == Lifecycle.State.DESTROYED) {
            d = s3q0.a;
        } else {
            d = zvj.d(new t(lifecycle, state, wzsVar, null), suspendLambda);
            if (d != CoroutineSingletons.COROUTINE_SUSPENDED) {
                d = s3q0.a;
            }
        }
        return d == CoroutineSingletons.COROUTINE_SUSPENDED ? d : s3q0.a;
    }
}
