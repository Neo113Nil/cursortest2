package androidx.test.internal.util;

import androidx.test.internal.platform.ServiceLoaderWrapper;
import androidx.test.internal.platform.ThreadChecker;
import java.util.List;

/* loaded from: classes.dex */
public abstract class Checks {

    /* renamed from: a, reason: collision with root package name */
    public static final ThreadChecker f23540a;

    static {
        List a10 = ServiceLoaderWrapper.a(ThreadChecker.class);
        if (a10.isEmpty()) {
            f23540a = new ThreadChecker() { // from class: androidx.test.internal.util.Checks.1
            };
        } else {
            if (a10.size() != 1) {
                throw new IllegalStateException(String.format("Found more than one %s implementations.", ThreadChecker.class.getName()));
            }
            f23540a = (ThreadChecker) a10.get(0);
        }
    }

    public static Object a(Object obj) {
        obj.getClass();
        return obj;
    }
}
