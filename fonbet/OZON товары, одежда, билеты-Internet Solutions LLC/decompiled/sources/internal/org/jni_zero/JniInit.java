package internal.org.jni_zero;

import java.util.Collections;

/* loaded from: classes.dex */
public final class JniInit {
    @CalledByNative
    private static void crashIfMultiplexingMisaligned(long j11, long j12) {
        try {
            long j13 = Class.forName("J.N").getField("WHOLE_HASH").getLong(null);
            long j14 = Class.forName("J.N").getField("PRIORITY_HASH").getLong(null);
            if (j13 != j11 && j13 != j12 && j14 != j11) {
                throw new RuntimeException("JNI Zero multiplexing hashes do not align. Native: " + j11 + " or " + j12 + " Java: " + j13 + " or " + j14);
            }
        } catch (ReflectiveOperationException unused) {
        }
    }

    @CalledByNative
    private static Object[] init() {
        return new Object[]{Collections.EMPTY_LIST, Collections.EMPTY_MAP};
    }
}
