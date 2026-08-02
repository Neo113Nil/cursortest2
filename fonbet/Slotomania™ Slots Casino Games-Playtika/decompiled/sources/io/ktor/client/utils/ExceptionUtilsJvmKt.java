package io.ktor.client.utils;

import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: ExceptionUtilsJvm.kt */
@Metadata(d1 = {"\u0000\b\n\u0002\u0010\u0003\n\u0002\b\u0003\u001a\u0011\u0010\u0001\u001a\u00020\u0000*\u00020\u0000¢\u0006\u0004\b\u0001\u0010\u0002¨\u0006\u0003"}, d2 = {"", "unwrapCancellationException", "(Ljava/lang/Throwable;)Ljava/lang/Throwable;", "ktor-client-core"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class ExceptionUtilsJvmKt {
    /* JADX WARN: Code restructure failed: missing block: B:8:0x001f, code lost:
    
        return r3;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Throwable unwrapCancellationException(Throwable th) {
        Intrinsics.checkNotNullParameter(th, "<this>");
        Throwable th2 = th;
        while (true) {
            if (!(th2 instanceof CancellationException)) {
                if (th2 == null) {
                    break;
                }
                return th2;
            }
            CancellationException cancellationException = (CancellationException) th2;
            if (Intrinsics.areEqual(th2, cancellationException.getCause())) {
                break;
            }
            th2 = cancellationException.getCause();
        }
    }
}
