package ld;

import com.google.android.gms.measurement.api.AppMeasurementSdk;
import ed.C6345a;
import java.lang.annotation.Annotation;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.C7705l;
import kotlin.collections.C7714v;
import kotlin.collections.K;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* renamed from: ld.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C7923d {
    @NotNull
    public static final List a(@NotNull kotlin.reflect.d dVar, @NotNull kotlin.reflect.d klass) {
        Object obj;
        Intrinsics.checkNotNullParameter(dVar, "<this>");
        Intrinsics.checkNotNullParameter(klass, "klass");
        ArrayList H11 = C7714v.H(dVar.getAnnotations(), C6345a.b(klass));
        if (!H11.isEmpty()) {
            return H11;
        }
        Class<? extends Annotation> a11 = C7922c.f73175a.a(C6345a.b(klass));
        if (a11 != null) {
            Iterator<T> it = dVar.getAnnotations().iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it.next();
                if (C6345a.b(C6345a.a((Annotation) obj)).equals(a11)) {
                    break;
                }
            }
            Annotation annotation = (Annotation) obj;
            if (annotation != null) {
                Object invoke = annotation.getClass().getMethod(AppMeasurementSdk.ConditionalUserProperty.VALUE, new Class[0]).invoke(annotation, new Object[0]);
                Intrinsics.g(invoke, "null cannot be cast to non-null type kotlin.Array<T of kotlin.reflect.full.KAnnotatedElements.findAnnotations>");
                return C7705l.e((Annotation[]) invoke);
            }
        }
        return K.f71697a;
    }
}
