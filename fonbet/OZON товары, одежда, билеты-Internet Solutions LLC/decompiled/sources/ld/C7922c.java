package ld;

import com.google.android.gms.measurement.api.AppMeasurementSdk;
import java.lang.annotation.Annotation;
import java.lang.annotation.Repeatable;
import java.lang.reflect.Method;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* renamed from: ld.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C7922c {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    public static final C7922c f73175a = new C7922c();

    /* renamed from: b, reason: collision with root package name */
    private static a f73176b;

    /* renamed from: ld.c$a */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        private final Class<? extends Annotation> f73177a;

        /* renamed from: b, reason: collision with root package name */
        private final Method f73178b;

        public a(Class<? extends Annotation> cls, Method method) {
            this.f73177a = cls;
            this.f73178b = method;
        }

        public final Class<? extends Annotation> a() {
            return this.f73177a;
        }

        public final Method b() {
            return this.f73178b;
        }
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 2 */
    public final Class<? extends Annotation> a(@NotNull Class<? extends Annotation> klass) {
        Annotation annotation;
        Method b11;
        Intrinsics.checkNotNullParameter(klass, "klass");
        a aVar = f73176b;
        if (aVar == null) {
            synchronized (this) {
                aVar = f73176b;
                if (aVar == null) {
                    a aVar2 = new a(Repeatable.class, Repeatable.class.getMethod(AppMeasurementSdk.ConditionalUserProperty.VALUE, new Class[0]));
                    f73176b = aVar2;
                    aVar = aVar2;
                }
            }
        }
        Class a11 = aVar.a();
        if (a11 == null || (annotation = klass.getAnnotation(a11)) == null || (b11 = aVar.b()) == null) {
            return null;
        }
        Object invoke = b11.invoke(annotation, new Object[0]);
        Intrinsics.g(invoke, "null cannot be cast to non-null type java.lang.Class<out kotlin.Annotation>");
        return (Class) invoke;
    }
}
