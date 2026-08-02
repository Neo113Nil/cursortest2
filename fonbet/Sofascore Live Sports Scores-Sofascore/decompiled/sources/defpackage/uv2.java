package defpackage;

import java.lang.reflect.Constructor;
import java.lang.reflect.GenericDeclaration;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.collections.b;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.reflect.KClass;
import kotlin.reflect.KVisibility;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes7.dex */
public final class uv2 implements KClass, rv2, eka {

    @NotNull
    public static final tv2 b = new tv2(null);
    public static final Map c;
    public final Class a;

    static {
        List j = b.j(Function0.class, Function1.class, Function2.class, ct8.class, et8.class, ft8.class, gt8.class, ht8.class, it8.class, jt8.class, ns8.class, os8.class, ps8.class, qs8.class, rs8.class, ss8.class, ts8.class, us8.class, vs8.class, ws8.class, ys8.class, zs8.class, at8.class);
        ArrayList arrayList = new ArrayList(k13.r(j, 10));
        int i = 0;
        for (Object obj : j) {
            int i2 = i + 1;
            if (i < 0) {
                b.q();
                throw null;
            }
            arrayList.add(new Pair((Class) obj, Integer.valueOf(i)));
            i = i2;
        }
        c = tub.o(arrayList);
    }

    public uv2(Class cls) {
        cls.getClass();
        this.a = cls;
    }

    public static void a() {
        throw new hka();
    }

    @Override // kotlin.reflect.KClass
    public final boolean equals(Object obj) {
        return (obj instanceof uv2) && sha.y(this).equals(sha.y((KClass) obj));
    }

    @Override // defpackage.eka
    public final GenericDeclaration findJavaDeclaration() {
        return this.a;
    }

    @Override // kotlin.reflect.KAnnotatedElement
    public final List getAnnotations() {
        a();
        throw null;
    }

    @Override // kotlin.reflect.KClass
    public final Collection getConstructors() {
        a();
        throw null;
    }

    @Override // defpackage.rv2
    public final Class getJClass() {
        return this.a;
    }

    @Override // kotlin.reflect.KClass, kotlin.reflect.KDeclarationContainer
    public final Collection getMembers() {
        a();
        throw null;
    }

    @Override // kotlin.reflect.KClass
    public final Collection getNestedClasses() {
        a();
        throw null;
    }

    @Override // kotlin.reflect.KClass
    public final Object getObjectInstance() {
        a();
        throw null;
    }

    @Override // kotlin.reflect.KClass
    public final String getQualifiedName() {
        String a;
        b.getClass();
        Class cls = this.a;
        cls.getClass();
        String str = null;
        if (cls.isAnonymousClass() || cls.isLocalClass()) {
            return null;
        }
        if (!cls.isArray()) {
            String a2 = tv2.a(cls.getName());
            return a2 == null ? cls.getCanonicalName() : a2;
        }
        Class<?> componentType = cls.getComponentType();
        if (componentType.isPrimitive() && (a = tv2.a(componentType.getName())) != null) {
            str = a.concat("Array");
        }
        return str == null ? "kotlin.Array" : str;
    }

    @Override // kotlin.reflect.KClass
    public final List getSealedSubclasses() {
        a();
        throw null;
    }

    @Override // kotlin.reflect.KClass
    public final String getSimpleName() {
        String b2;
        b.getClass();
        Class cls = this.a;
        cls.getClass();
        String str = null;
        if (cls.isAnonymousClass()) {
            return null;
        }
        if (!cls.isLocalClass()) {
            if (!cls.isArray()) {
                String b3 = tv2.b(cls.getName());
                return b3 == null ? cls.getSimpleName() : b3;
            }
            Class<?> componentType = cls.getComponentType();
            if (componentType.isPrimitive() && (b2 = tv2.b(componentType.getName())) != null) {
                str = b2.concat("Array");
            }
            return str == null ? "Array" : str;
        }
        String simpleName = cls.getSimpleName();
        Method enclosingMethod = cls.getEnclosingMethod();
        if (enclosingMethod != null) {
            return StringsKt.d0(simpleName, enclosingMethod.getName() + '$', simpleName);
        }
        Constructor<?> enclosingConstructor = cls.getEnclosingConstructor();
        if (enclosingConstructor == null) {
            int O = StringsKt.O(simpleName, '$', 0, 6);
            return O == -1 ? simpleName : simpleName.substring(O + 1, simpleName.length());
        }
        return StringsKt.d0(simpleName, enclosingConstructor.getName() + '$', simpleName);
    }

    @Override // kotlin.reflect.KClass
    public final List getSupertypes() {
        a();
        throw null;
    }

    @Override // kotlin.reflect.KClass
    public final List getTypeParameters() {
        a();
        throw null;
    }

    @Override // kotlin.reflect.KClass
    public final KVisibility getVisibility() {
        a();
        throw null;
    }

    @Override // kotlin.reflect.KClass
    public final int hashCode() {
        return sha.y(this).hashCode();
    }

    @Override // kotlin.reflect.KClass
    public final boolean isAbstract() {
        a();
        throw null;
    }

    @Override // kotlin.reflect.KClass
    public final boolean isCompanion() {
        a();
        throw null;
    }

    @Override // kotlin.reflect.KClass
    public final boolean isData() {
        a();
        throw null;
    }

    @Override // kotlin.reflect.KClass
    public final boolean isFinal() {
        a();
        throw null;
    }

    @Override // kotlin.reflect.KClass
    public final boolean isFun() {
        a();
        throw null;
    }

    @Override // kotlin.reflect.KClass
    public final boolean isInner() {
        a();
        throw null;
    }

    @Override // kotlin.reflect.KClass
    public final boolean isInstance(Object obj) {
        b.getClass();
        Class cls = this.a;
        cls.getClass();
        Map map = c;
        map.getClass();
        Integer num = (Integer) map.get(cls);
        if (num != null) {
            return i5k.f(num.intValue(), obj);
        }
        if (cls.isPrimitive()) {
            cls = sha.y(duf.a.getOrCreateKotlinClass(cls));
        }
        return cls.isInstance(obj);
    }

    @Override // kotlin.reflect.KClass
    public final boolean isOpen() {
        a();
        throw null;
    }

    @Override // kotlin.reflect.KClass
    public final boolean isSealed() {
        a();
        throw null;
    }

    @Override // kotlin.reflect.KClass
    public final boolean isValue() {
        a();
        throw null;
    }

    public final String toString() {
        return this.a.toString() + " (Kotlin reflection is not available)";
    }
}
