package io.appmetrica.analytics.impl;

import java.util.ArrayList;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public abstract class Hn {
    /* JADX WARN: Removed duplicated region for block: B:15:0x0044  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static Gn a(Throwable th2, int i5, int i10) {
        StackTraceElement[] stackTraceElementArr;
        Gn gn;
        String name = th2.getClass().getName();
        String message = th2.getMessage();
        try {
            stackTraceElementArr = th2.getStackTrace();
        } catch (Throwable unused) {
            stackTraceElementArr = new StackTraceElement[0];
        }
        ArrayList arrayList = new ArrayList(stackTraceElementArr.length);
        for (StackTraceElement stackTraceElement : stackTraceElementArr) {
            arrayList.add(new Dl(stackTraceElement));
        }
        Throwable cause = th2.getCause();
        ArrayList arrayList2 = null;
        if (cause != null) {
            if (i10 >= i5) {
                cause = null;
            }
            if (cause != null) {
                gn = a(cause, 30, i10 + 1);
                if (i10 < i5) {
                    Throwable[] suppressed = th2.getSuppressed();
                    arrayList2 = new ArrayList(suppressed.length);
                    for (Throwable th3 : suppressed) {
                        arrayList2.add(a(th3, 1, i10));
                    }
                }
                return new Gn(name, message, arrayList, gn, arrayList2);
            }
        }
        gn = null;
        if (i10 < i5) {
        }
        return new Gn(name, message, arrayList, gn, arrayList2);
    }
}
