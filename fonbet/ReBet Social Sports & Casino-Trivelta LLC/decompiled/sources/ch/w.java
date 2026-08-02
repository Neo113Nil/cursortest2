package ch;

import kotlin.jvm.JvmClassMappingKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KClass;

/* loaded from: classes3.dex */
public abstract class w {
    public static final StackTraceElement a(KClass kClass, String methodName, String fileName, int i10) {
        Intrinsics.checkNotNullParameter(kClass, "kClass");
        Intrinsics.checkNotNullParameter(methodName, "methodName");
        Intrinsics.checkNotNullParameter(fileName, "fileName");
        return new StackTraceElement(JvmClassMappingKt.getJavaClass(kClass).getName(), methodName, fileName, i10);
    }
}
