package androidx.room.coroutines;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import xsna.wzs;

/* compiled from: ConnectionPool.kt */
/* loaded from: classes.dex */
public interface ConnectionPool extends AutoCloseable {

    /* compiled from: ConnectionPool.kt */
    public static final class RollbackException extends Throwable {
        private final Object result;

        public final Object d() {
            return this.result;
        }
    }

    Object J2(boolean z, wzs wzsVar, ContinuationImpl continuationImpl);
}
