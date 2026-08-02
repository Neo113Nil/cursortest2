package zd;

import Jd.InterfaceC3391a;
import java.lang.annotation.Annotation;
import java.lang.reflect.AnnotatedElement;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.RandomAccess;
import kotlin.collections.C7714v;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes10.dex */
public final class I extends y implements Jd.d, Jd.x {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final TypeVariable<?> f108806a;

    public I(@NotNull TypeVariable<?> typeVariable) {
        Intrinsics.checkNotNullParameter(typeVariable, "typeVariable");
        this.f108806a = typeVariable;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof I) {
            return Intrinsics.d(this.f108806a, ((I) obj).f108806a);
        }
        return false;
    }

    @Override // Jd.d
    public final Collection getAnnotations() {
        Annotation[] declaredAnnotations;
        TypeVariable<?> typeVariable = this.f108806a;
        AnnotatedElement annotatedElement = typeVariable instanceof AnnotatedElement ? (AnnotatedElement) typeVariable : null;
        return (annotatedElement == null || (declaredAnnotations = annotatedElement.getDeclaredAnnotations()) == null) ? kotlin.collections.K.f71697a : C11108j.b(declaredAnnotations);
    }

    @Override // Jd.s
    @NotNull
    public final Sd.f getName() {
        Sd.f f7 = Sd.f.f(this.f108806a.getName());
        Intrinsics.checkNotNullExpressionValue(f7, "identifier(...)");
        return f7;
    }

    @Override // Jd.x
    public final Collection getUpperBounds() {
        Type[] bounds = this.f108806a.getBounds();
        Intrinsics.checkNotNullExpressionValue(bounds, "getBounds(...)");
        ArrayList arrayList = new ArrayList(bounds.length);
        for (Type type : bounds) {
            arrayList.add(new w(type));
        }
        w wVar = (w) C7714v.D0(arrayList);
        RandomAccess randomAccess = arrayList;
        if (Intrinsics.d(wVar != null ? wVar.I() : null, Object.class)) {
            randomAccess = kotlin.collections.K.f71697a;
        }
        return (Collection) randomAccess;
    }

    public final int hashCode() {
        return this.f108806a.hashCode();
    }

    @Override // Jd.d
    public final InterfaceC3391a j(Sd.c fqName) {
        Annotation[] declaredAnnotations;
        Intrinsics.checkNotNullParameter(fqName, "fqName");
        TypeVariable<?> typeVariable = this.f108806a;
        AnnotatedElement annotatedElement = typeVariable instanceof AnnotatedElement ? (AnnotatedElement) typeVariable : null;
        if (annotatedElement == null || (declaredAnnotations = annotatedElement.getDeclaredAnnotations()) == null) {
            return null;
        }
        return C11108j.a(declaredAnnotations, fqName);
    }

    @NotNull
    public final String toString() {
        return I.class.getName() + ": " + this.f108806a;
    }
}
