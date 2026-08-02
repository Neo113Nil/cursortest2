package nd;

import java.lang.reflect.Method;
import kotlin.collections.C7705l;
import kotlin.jvm.internal.Intrinsics;
import zd.C11104f;

/* loaded from: classes10.dex */
public final class e1 {
    public static final String a(Method method) {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(method.getName());
        Class<?>[] parameterTypes = method.getParameterTypes();
        Intrinsics.checkNotNullExpressionValue(parameterTypes, "getParameterTypes(...)");
        sb2.append(C7705l.P(parameterTypes, "", "(", ")", d1.f76961a, 24));
        Class<?> returnType = method.getReturnType();
        Intrinsics.checkNotNullExpressionValue(returnType, "getReturnType(...)");
        sb2.append(C11104f.b(returnType));
        return sb2.toString();
    }
}
