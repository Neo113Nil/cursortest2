package io.sentry;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes.dex */
public final class a3 {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final W2 f66826a;

    public a3(@NotNull W2 w22) {
        this.f66826a = w22;
    }

    public static Boolean c(String str, @NotNull List<String> list, @NotNull List<String> list2) {
        if (str == null || str.isEmpty()) {
            return Boolean.TRUE;
        }
        Iterator<String> it = list.iterator();
        while (it.hasNext()) {
            if (str.startsWith(it.next())) {
                return Boolean.TRUE;
            }
        }
        Iterator<String> it2 = list2.iterator();
        while (it2.hasNext()) {
            if (str.startsWith(it2.next())) {
                return Boolean.FALSE;
            }
        }
        return null;
    }

    public final ArrayList a(StackTraceElement[] stackTraceElementArr, boolean z11) {
        if (stackTraceElementArr == null || stackTraceElementArr.length <= 0) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (StackTraceElement stackTraceElement : stackTraceElementArr) {
            if (stackTraceElement != null) {
                String className = stackTraceElement.getClassName();
                if (z11 || !className.startsWith("io.sentry.") || className.startsWith("io.sentry.samples.") || className.startsWith("io.sentry.mobile.")) {
                    io.sentry.protocol.x xVar = new io.sentry.protocol.x();
                    xVar.z(b(className));
                    xVar.D(className);
                    xVar.y(stackTraceElement.getMethodName());
                    xVar.x(stackTraceElement.getFileName());
                    if (stackTraceElement.getLineNumber() >= 0) {
                        xVar.B(Integer.valueOf(stackTraceElement.getLineNumber()));
                    }
                    xVar.E(Boolean.valueOf(stackTraceElement.isNativeMethod()));
                    arrayList.add(xVar);
                    if (arrayList.size() >= 100) {
                        break;
                    }
                }
            }
        }
        Collections.reverse(arrayList);
        return arrayList;
    }

    public final Boolean b(String str) {
        W2 w22 = this.f66826a;
        return c(str, w22.getInAppIncludes(), w22.getInAppExcludes());
    }
}
