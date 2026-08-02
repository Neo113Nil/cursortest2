package de;

import java.lang.annotation.Annotation;
import java.lang.reflect.Method;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.Request;
import retrofit2.Invocation;

/* renamed from: de.a, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC4064a {
    public static final Annotation a(Request request, Class annotationClass) {
        Method method;
        Intrinsics.checkNotNullParameter(request, "<this>");
        Intrinsics.checkNotNullParameter(annotationClass, "annotationClass");
        Invocation invocation = (Invocation) request.tag(Invocation.class);
        if (invocation == null || (method = invocation.method()) == null) {
            return null;
        }
        return method.getAnnotation(annotationClass);
    }
}
