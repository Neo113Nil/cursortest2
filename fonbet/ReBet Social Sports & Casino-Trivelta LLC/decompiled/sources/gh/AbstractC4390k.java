package gh;

import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: gh.k, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC4390k {
    public static final Throwable a(Throwable exception, Continuation continuation) {
        Intrinsics.checkNotNullParameter(exception, "exception");
        Intrinsics.checkNotNullParameter(continuation, "continuation");
        try {
            return AbstractC4389j.a(exception, exception.getCause());
        } catch (Throwable unused) {
            return exception;
        }
    }
}
