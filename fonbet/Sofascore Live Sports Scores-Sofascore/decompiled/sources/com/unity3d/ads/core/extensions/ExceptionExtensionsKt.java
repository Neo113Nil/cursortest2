package com.unity3d.ads.core.extensions;

import com.unity3d.services.SDKErrorHandler;
import defpackage.i5h;
import defpackage.oh0;
import java.io.PrintWriter;
import java.io.StringWriter;
import kotlin.Metadata;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u000e\n\u0002\u0010\u0003\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\u001a\n\u0010\u0000\u001a\u00020\u0001*\u00020\u0002\u001a\u0014\u0010\u0003\u001a\u00020\u0001*\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u0005¨\u0006\u0006"}, d2 = {"retrieveUnityCrashValue", "", "", "getShortenedStackTrace", "maxLines", "", "unity-ads_defaultRelease"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class ExceptionExtensionsKt {
    @NotNull
    public static final String getShortenedStackTrace(@NotNull Throwable th, int i) {
        th.getClass();
        try {
            StringWriter stringWriter = new StringWriter();
            try {
                PrintWriter printWriter = new PrintWriter(stringWriter);
                try {
                    th.printStackTrace(printWriter);
                    String stringWriter2 = stringWriter.toString();
                    stringWriter2.getClass();
                    String obj = StringsKt.l0(stringWriter2).toString();
                    obj.getClass();
                    String l = i5h.l(i5h.p(new oh0(obj, 7), i), "\n");
                    printWriter.close();
                    stringWriter.close();
                    return l;
                } finally {
                }
            } finally {
            }
        } catch (Throwable unused) {
            return "";
        }
    }

    public static /* synthetic */ String getShortenedStackTrace$default(Throwable th, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = 15;
        }
        return getShortenedStackTrace(th, i);
    }

    @NotNull
    public static final String retrieveUnityCrashValue(@NotNull Throwable th) {
        StackTraceElement stackTraceElement;
        String className;
        th.getClass();
        StackTraceElement[] stackTrace = th.getStackTrace();
        stackTrace.getClass();
        int length = stackTrace.length;
        int i = 0;
        while (true) {
            if (i >= length) {
                stackTraceElement = null;
                break;
            }
            stackTraceElement = stackTrace[i];
            if ((stackTraceElement == null || (className = stackTraceElement.getClassName()) == null) ? false : StringsKt.J(className, SDKErrorHandler.UNITY_PACKAGE, false)) {
                break;
            }
            i++;
        }
        if (stackTraceElement == null) {
            return "unknown";
        }
        String fileName = stackTraceElement.getFileName();
        return (fileName != null ? fileName : "unknown") + '_' + stackTraceElement.getLineNumber();
    }
}
