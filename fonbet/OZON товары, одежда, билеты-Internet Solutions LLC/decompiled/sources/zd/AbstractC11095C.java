package zd;

import Jd.InterfaceC3391a;
import java.lang.annotation.Annotation;
import java.lang.reflect.AnnotatedElement;
import java.lang.reflect.GenericArrayType;
import java.lang.reflect.Member;
import java.lang.reflect.Modifier;
import java.lang.reflect.Type;
import java.lang.reflect.WildcardType;
import java.util.ArrayList;
import java.util.Collection;
import kotlin.collections.C7714v;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import td.r0;
import td.s0;
import xd.C10705a;
import xd.C10706b;
import xd.C10707c;

/* renamed from: zd.C, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public abstract class AbstractC11095C extends y implements Jd.d, Jd.r, Jd.p {
    @NotNull
    public abstract Member I();

    /* JADX WARN: Removed duplicated region for block: B:12:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x00b8  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00b5  */
    @NotNull
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    protected final ArrayList J(@NotNull Type[] parameterTypes, @NotNull Annotation[][] parameterAnnotations, boolean z11) {
        H lVar;
        String str;
        boolean z12;
        Intrinsics.checkNotNullParameter(parameterTypes, "parameterTypes");
        Intrinsics.checkNotNullParameter(parameterAnnotations, "parameterAnnotations");
        ArrayList arrayList = new ArrayList(parameterTypes.length);
        ArrayList b11 = C11101c.f108821a.b(I());
        int size = b11 != null ? b11.size() - parameterTypes.length : 0;
        int length = parameterTypes.length;
        for (int i11 = 0; i11 < length; i11++) {
            Type type = parameterTypes[i11];
            Intrinsics.checkNotNullParameter(type, "type");
            boolean z13 = type instanceof Class;
            if (z13) {
                Class cls = (Class) type;
                if (cls.isPrimitive()) {
                    lVar = new C11098F(cls);
                    if (b11 == null) {
                        str = (String) C7714v.Q(i11 + size, b11);
                        if (str == null) {
                            throw new IllegalStateException(("No parameter with index " + i11 + '+' + size + " (name=" + getName() + " type=" + lVar + ") in " + this).toString());
                        }
                    } else {
                        str = null;
                    }
                    if (z11) {
                        Intrinsics.checkNotNullParameter(parameterTypes, "<this>");
                        z12 = true;
                        if (i11 == parameterTypes.length - 1) {
                            arrayList.add(new J(lVar, parameterAnnotations[i11], str, z12));
                        }
                    }
                    z12 = false;
                    arrayList.add(new J(lVar, parameterAnnotations[i11], str, z12));
                }
            }
            lVar = ((type instanceof GenericArrayType) || (z13 && ((Class) type).isArray())) ? new l(type) : type instanceof WildcardType ? new K((WildcardType) type) : new w(type);
            if (b11 == null) {
            }
            if (z11) {
            }
            z12 = false;
            arrayList.add(new J(lVar, parameterAnnotations[i11], str, z12));
        }
        return arrayList;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof AbstractC11095C) && Intrinsics.d(I(), ((AbstractC11095C) obj).I());
    }

    @Override // Jd.r
    public final boolean g() {
        return Modifier.isStatic(I().getModifiers());
    }

    @Override // Jd.d
    public final Collection getAnnotations() {
        Member I11 = I();
        Intrinsics.g(I11, "null cannot be cast to non-null type java.lang.reflect.AnnotatedElement");
        Annotation[] declaredAnnotations = ((AnnotatedElement) I11).getDeclaredAnnotations();
        return declaredAnnotations != null ? C11108j.b(declaredAnnotations) : kotlin.collections.K.f71697a;
    }

    @Override // Jd.s
    @NotNull
    public final Sd.f getName() {
        String name = I().getName();
        return name != null ? Sd.f.f(name) : Sd.h.f26144a;
    }

    @Override // Jd.r
    @NotNull
    public final s0 getVisibility() {
        int modifiers = I().getModifiers();
        return Modifier.isPublic(modifiers) ? r0.h.f99425c : Modifier.isPrivate(modifiers) ? r0.e.f99422c : Modifier.isProtected(modifiers) ? Modifier.isStatic(modifiers) ? C10707c.f105371c : C10706b.f105370c : C10705a.f105369c;
    }

    public final int hashCode() {
        return I().hashCode();
    }

    @Override // Jd.r
    public final boolean isAbstract() {
        return Modifier.isAbstract(I().getModifiers());
    }

    @Override // Jd.r
    public final boolean isFinal() {
        return Modifier.isFinal(I().getModifiers());
    }

    @Override // Jd.d
    public final InterfaceC3391a j(Sd.c fqName) {
        Intrinsics.checkNotNullParameter(fqName, "fqName");
        Member I11 = I();
        Intrinsics.g(I11, "null cannot be cast to non-null type java.lang.reflect.AnnotatedElement");
        Annotation[] declaredAnnotations = ((AnnotatedElement) I11).getDeclaredAnnotations();
        if (declaredAnnotations != null) {
            return C11108j.a(declaredAnnotations, fqName);
        }
        return null;
    }

    @NotNull
    public final String toString() {
        return getClass().getName() + ": " + I();
    }

    @Override // Jd.p
    public final u v() {
        Class<?> declaringClass = I().getDeclaringClass();
        Intrinsics.checkNotNullExpressionValue(declaringClass, "getDeclaringClass(...)");
        return new u(declaringClass);
    }
}
