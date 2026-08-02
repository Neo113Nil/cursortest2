package io.sentry;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes3.dex */
public final class J3 {

    /* renamed from: a, reason: collision with root package name */
    public final F3 f50405a;

    public J3(F3 f32) {
        this.f50405a = f32;
    }

    public static Boolean c(String str, List list, List list2) {
        if (str == null || str.isEmpty()) {
            return Boolean.TRUE;
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            if (str.startsWith((String) it.next())) {
                return Boolean.TRUE;
            }
        }
        Iterator it2 = list2.iterator();
        while (it2.hasNext()) {
            if (str.startsWith((String) it2.next())) {
                return Boolean.FALSE;
            }
        }
        return null;
    }

    public List a(StackTraceElement[] stackTraceElementArr, boolean z10) {
        if (stackTraceElementArr == null || stackTraceElementArr.length <= 0) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (StackTraceElement stackTraceElement : stackTraceElementArr) {
            if (stackTraceElement != null) {
                String className = stackTraceElement.getClassName();
                if (z10 || !className.startsWith("io.sentry.") || className.startsWith("io.sentry.samples.") || className.startsWith("io.sentry.mobile.")) {
                    io.sentry.protocol.y yVar = new io.sentry.protocol.y();
                    yVar.A(b(className));
                    yVar.E(className);
                    yVar.z(stackTraceElement.getMethodName());
                    yVar.y(stackTraceElement.getFileName());
                    if (stackTraceElement.getLineNumber() >= 0) {
                        yVar.C(Integer.valueOf(stackTraceElement.getLineNumber()));
                    }
                    yVar.F(Boolean.valueOf(stackTraceElement.isNativeMethod()));
                    arrayList.add(yVar);
                    if (arrayList.size() >= 100) {
                        break;
                    }
                }
            }
        }
        Collections.reverse(arrayList);
        return arrayList;
    }

    public Boolean b(String str) {
        return c(str, this.f50405a.getInAppIncludes(), this.f50405a.getInAppExcludes());
    }
}
