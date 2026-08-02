package ru.ozon.android.messenger.framework.data.remote.serialize;

import android.util.Log;
import java.io.Serializable;

/* loaded from: classes10.dex */
public final class a {
    public static void a(Serializable serializable) {
        Log.e("RootBeer", b() + String.valueOf(serializable));
        Log.e("QLog", b() + String.valueOf(serializable));
    }

    private static String b() {
        StackTraceElement[] stackTrace = new Throwable().getStackTrace();
        String methodName = stackTrace[2].getMethodName();
        String className = stackTrace[2].getClassName();
        int lineNumber = stackTrace[2].getLineNumber();
        return className.substring(className.lastIndexOf(46) + 1) + ": " + methodName + "() [" + lineNumber + "] - ";
    }

    public static void c(String str) {
        Log.v("RootBeer", b() + String.valueOf(str));
    }
}
