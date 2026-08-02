package zd;

import Jd.InterfaceC3391a;
import java.lang.annotation.Annotation;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.C7705l;
import kotlin.collections.C7714v;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.S;
import kotlin.sequences.Sequence;
import org.jetbrains.annotations.NotNull;
import td.r0;
import td.s0;
import xd.C10705a;
import xd.C10706b;
import xd.C10707c;

/* loaded from: classes.dex */
public final class u extends y implements Jd.d, Jd.r, Jd.g {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final Class<?> f108847a;

    public u(@NotNull Class<?> klass) {
        Intrinsics.checkNotNullParameter(klass, "klass");
        this.f108847a = klass;
    }

    static boolean I(u uVar, Method method) {
        boolean equals;
        if (!method.isSynthetic()) {
            if (uVar.f108847a.isEnum()) {
                String name = method.getName();
                if (Intrinsics.d(name, "values")) {
                    Class<?>[] parameterTypes = method.getParameterTypes();
                    Intrinsics.checkNotNullExpressionValue(parameterTypes, "getParameterTypes(...)");
                    if (parameterTypes.length == 0) {
                        equals = true;
                        if (equals) {
                        }
                    }
                    equals = false;
                    if (equals) {
                    }
                } else {
                    if (Intrinsics.d(name, "valueOf")) {
                        equals = Arrays.equals(method.getParameterTypes(), new Class[]{String.class});
                        if (equals) {
                        }
                    }
                    equals = false;
                    if (equals) {
                    }
                }
            }
            return true;
        }
        return false;
    }

    @Override // Jd.g
    public final boolean A() {
        return this.f108847a.isEnum();
    }

    @Override // Jd.g
    public final boolean F() {
        return this.f108847a.isInterface();
    }

    @NotNull
    public final Class<?> J() {
        return this.f108847a;
    }

    @Override // Jd.g
    @NotNull
    public final Sd.c c() {
        return C11104f.a(this.f108847a).a();
    }

    public final boolean equals(Object obj) {
        if (obj instanceof u) {
            return Intrinsics.d(this.f108847a, ((u) obj).f108847a);
        }
        return false;
    }

    @Override // Jd.r
    public final boolean g() {
        return Modifier.isStatic(this.f108847a.getModifiers());
    }

    @Override // Jd.d
    public final Collection getAnnotations() {
        Annotation[] declaredAnnotations;
        Class<?> cls = this.f108847a;
        return (cls == null || (declaredAnnotations = cls.getDeclaredAnnotations()) == null) ? kotlin.collections.K.f71697a : C11108j.b(declaredAnnotations);
    }

    @Override // Jd.g
    public final Collection getFields() {
        Field[] declaredFields = this.f108847a.getDeclaredFields();
        Intrinsics.checkNotNullExpressionValue(declaredFields, "getDeclaredFields(...)");
        return kotlin.sequences.l.C(kotlin.sequences.l.v(kotlin.sequences.l.i(C7705l.g(declaredFields), r.f108844a), s.f108845a));
    }

    @Override // Jd.s
    @NotNull
    public final Sd.f getName() {
        Class<?> cls = this.f108847a;
        if (!cls.isAnonymousClass()) {
            return Sd.f.f(cls.getSimpleName());
        }
        String name = cls.getName();
        Intrinsics.checkNotNullExpressionValue(name, "getName(...)");
        return Sd.f.f(kotlin.text.h.k0(name, ".", name));
    }

    @Override // Jd.y
    @NotNull
    public final ArrayList getTypeParameters() {
        TypeVariable<Class<?>>[] typeParameters = this.f108847a.getTypeParameters();
        Intrinsics.checkNotNullExpressionValue(typeParameters, "getTypeParameters(...)");
        ArrayList arrayList = new ArrayList(typeParameters.length);
        for (TypeVariable<Class<?>> typeVariable : typeParameters) {
            arrayList.add(new I(typeVariable));
        }
        return arrayList;
    }

    @Override // Jd.r
    @NotNull
    public final s0 getVisibility() {
        int modifiers = this.f108847a.getModifiers();
        return Modifier.isPublic(modifiers) ? r0.h.f99425c : Modifier.isPrivate(modifiers) ? r0.e.f99422c : Modifier.isProtected(modifiers) ? Modifier.isStatic(modifiers) ? C10707c.f105371c : C10706b.f105370c : C10705a.f105369c;
    }

    public final int hashCode() {
        return this.f108847a.hashCode();
    }

    @Override // Jd.r
    public final boolean isAbstract() {
        return Modifier.isAbstract(this.f108847a.getModifiers());
    }

    @Override // Jd.r
    public final boolean isFinal() {
        return Modifier.isFinal(this.f108847a.getModifiers());
    }

    @Override // Jd.d
    public final InterfaceC3391a j(Sd.c fqName) {
        Annotation[] declaredAnnotations;
        Intrinsics.checkNotNullParameter(fqName, "fqName");
        Class<?> cls = this.f108847a;
        if (cls == null || (declaredAnnotations = cls.getDeclaredAnnotations()) == null) {
            return null;
        }
        return C11108j.a(declaredAnnotations, fqName);
    }

    @Override // Jd.g
    public final Collection l() {
        Constructor<?>[] declaredConstructors = this.f108847a.getDeclaredConstructors();
        Intrinsics.checkNotNullExpressionValue(declaredConstructors, "getDeclaredConstructors(...)");
        return kotlin.sequences.l.C(kotlin.sequences.l.v(kotlin.sequences.l.i(C7705l.g(declaredConstructors), p.f108842a), q.f108843a));
    }

    @Override // Jd.g
    public final boolean n() {
        Boolean e11 = C11100b.e(this.f108847a);
        if (e11 != null) {
            return e11.booleanValue();
        }
        return false;
    }

    @Override // Jd.g
    @NotNull
    public final Collection<Jd.j> o() {
        Class cls;
        Class<?> cls2 = this.f108847a;
        cls = Object.class;
        if (Intrinsics.d(cls2, cls)) {
            return kotlin.collections.K.f71697a;
        }
        S s11 = new S(2);
        Object genericSuperclass = cls2.getGenericSuperclass();
        s11.a(genericSuperclass != null ? genericSuperclass : Object.class);
        s11.b(cls2.getGenericInterfaces());
        List b02 = C7714v.b0(s11.d(new Type[s11.c()]));
        ArrayList arrayList = new ArrayList(C7714v.z(b02, 10));
        Iterator it = b02.iterator();
        while (it.hasNext()) {
            arrayList.add(new w((Type) it.next()));
        }
        return arrayList;
    }

    @Override // Jd.g
    public final boolean p() {
        return this.f108847a.isAnnotation();
    }

    @Override // Jd.g
    public final Collection q() {
        Class<?>[] declaredClasses = this.f108847a.getDeclaredClasses();
        Intrinsics.checkNotNullExpressionValue(declaredClasses, "getDeclaredClasses(...)");
        return kotlin.sequences.l.C(kotlin.sequences.l.w(kotlin.sequences.l.i(C7705l.g(declaredClasses), m.f108839a), n.f108840a));
    }

    @Override // Jd.g
    public final Collection r() {
        Method[] declaredMethods = this.f108847a.getDeclaredMethods();
        Intrinsics.checkNotNullExpressionValue(declaredMethods, "getDeclaredMethods(...)");
        return kotlin.sequences.l.C(kotlin.sequences.l.v(kotlin.sequences.l.h(C7705l.g(declaredMethods), new o(this)), t.f108846a));
    }

    @Override // Jd.g
    @NotNull
    public final Sequence<Jd.j> s() {
        Class[] b11 = C11100b.b(this.f108847a);
        if (b11 == null) {
            return kotlin.sequences.l.g();
        }
        ArrayList arrayList = new ArrayList(b11.length);
        for (Class cls : b11) {
            arrayList.add(new w(cls));
        }
        return C7714v.w(arrayList);
    }

    @NotNull
    public final String toString() {
        return u.class.getName() + ": " + this.f108847a;
    }

    @Override // Jd.g
    @NotNull
    public final ArrayList u() {
        Object[] c11 = C11100b.c(this.f108847a);
        if (c11 == null) {
            c11 = new Object[0];
        }
        ArrayList arrayList = new ArrayList(c11.length);
        for (Object obj : c11) {
            arrayList.add(new G(obj));
        }
        return arrayList;
    }

    @Override // Jd.g
    public final u w() {
        Class<?> declaringClass = this.f108847a.getDeclaringClass();
        if (declaringClass != null) {
            return new u(declaringClass);
        }
        return null;
    }

    @Override // Jd.g
    public final boolean x() {
        Boolean d11 = C11100b.d(this.f108847a);
        if (d11 != null) {
            return d11.booleanValue();
        }
        return false;
    }
}
