package androidx.room;

import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import xsna.gxi0;
import xsna.nvb0;
import xsna.s3q0;

/* compiled from: Transactor.kt */
/* loaded from: classes.dex */
public final class q {
    public static final Object a(nvb0 nvb0Var, String str, ContinuationImpl continuationImpl) {
        Object b = nvb0Var.b(str, new gxi0(1), continuationImpl);
        return b == CoroutineSingletons.COROUTINE_SUSPENDED ? b : s3q0.a;
    }
}
