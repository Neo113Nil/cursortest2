package G5;

import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    public static final f f3897a = new f();

    public final CoralogixStackTrace a(StackTraceElement[] elements) {
        Intrinsics.checkNotNullParameter(elements, "elements");
        ArrayList arrayList = new ArrayList(elements.length);
        for (StackTraceElement stackTraceElement : elements) {
            String className = stackTraceElement.getClassName();
            String str = "";
            if (className == null) {
                className = "";
            }
            String methodName = stackTraceElement.getMethodName();
            if (methodName == null) {
                methodName = "";
            }
            int lineNumber = stackTraceElement.getLineNumber();
            String fileName = stackTraceElement.getFileName();
            if (fileName != null) {
                str = fileName;
            }
            arrayList.add(new CoralogixAndroidStackFrame(className, methodName, lineNumber, str));
        }
        return new CoralogixStackTrace(arrayList);
    }
}
