package zd;

import Jd.InterfaceC3391a;
import ed.C6345a;
import java.lang.annotation.Annotation;
import java.lang.reflect.Method;
import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* renamed from: zd.g, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C11105g extends y implements InterfaceC3391a {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final Annotation f108832a;

    public C11105g(@NotNull Annotation annotation) {
        Intrinsics.checkNotNullParameter(annotation, "annotation");
        this.f108832a = annotation;
    }

    @NotNull
    public final Annotation I() {
        return this.f108832a;
    }

    @Override // Jd.InterfaceC3391a
    @NotNull
    public final Sd.b b() {
        return C11104f.a(C6345a.b(C6345a.a(this.f108832a)));
    }

    @Override // Jd.InterfaceC3391a
    @NotNull
    public final ArrayList e() {
        Annotation annotation = this.f108832a;
        Method[] declaredMethods = C6345a.b(C6345a.a(annotation)).getDeclaredMethods();
        Intrinsics.checkNotNullExpressionValue(declaredMethods, "getDeclaredMethods(...)");
        ArrayList arrayList = new ArrayList(declaredMethods.length);
        for (Method method : declaredMethods) {
            Object value = method.invoke(annotation, new Object[0]);
            Intrinsics.checkNotNullExpressionValue(value, "invoke(...)");
            Sd.f f7 = Sd.f.f(method.getName());
            Intrinsics.checkNotNullParameter(value, "value");
            arrayList.add(C11104f.h(value.getClass()) ? new z(f7, (Enum) value) : value instanceof Annotation ? new C11107i(f7, (Annotation) value) : value instanceof Object[] ? new C11109k(f7, (Object[]) value) : value instanceof Class ? new v(f7, (Class) value) : new C11094B(f7, value));
        }
        return arrayList;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C11105g) {
            return this.f108832a == ((C11105g) obj).f108832a;
        }
        return false;
    }

    public final int hashCode() {
        return System.identityHashCode(this.f108832a);
    }

    @Override // Jd.InterfaceC3391a
    public final u i() {
        return new u(C6345a.b(C6345a.a(this.f108832a)));
    }

    @NotNull
    public final String toString() {
        return C11105g.class.getName() + ": " + this.f108832a;
    }
}
