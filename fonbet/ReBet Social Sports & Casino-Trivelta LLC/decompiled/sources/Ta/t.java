package Ta;

import java.util.concurrent.locks.LockSupport;

/* loaded from: classes3.dex */
public abstract class t {
    public static void a(Object obj, long j10) {
        LockSupport.parkNanos(obj, Math.min(j10, 2147483647999999999L));
    }
}
