package internal.org.jni_zero;

import java.util.Collections;

@JNINamespace("jni_zero")
/* loaded from: classes9.dex */
public class JniInit {
    static final /* synthetic */ boolean $assertionsDisabled = false;

    private static Object[] init() {
        return new Object[]{Collections.EMPTY_LIST, Collections.EMPTY_MAP};
    }

    private static void crashIfMultiplexingMisaligned(long wholeHash, long priorityHash) {
        try {
            long j = Class.forName("J.N").getField("WHOLE_HASH").getLong(null);
            long j2 = Class.forName("J.N").getField("PRIORITY_HASH").getLong(null);
            if (j != wholeHash && j != priorityHash && j2 != wholeHash) {
                throw new RuntimeException("JNI Zero multiplexing hashes do not align. Native: " + wholeHash + " or " + priorityHash + " Java: " + j + " or " + j2);
            }
        } catch (ReflectiveOperationException unused) {
        }
    }
}
