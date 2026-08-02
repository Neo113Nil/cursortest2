package defpackage;

import java.lang.reflect.GenericArrayType;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.lang.reflect.WildcardType;
import java.util.Objects;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class z6n {
    public final Class a;
    public final Type b;
    public final int c;

    public z6n() {
        Type genericSuperclass = z6n.class.getGenericSuperclass();
        if (genericSuperclass instanceof ParameterizedType) {
            ParameterizedType parameterizedType = (ParameterizedType) genericSuperclass;
            if (parameterizedType.getRawType() == z6n.class) {
                Type M = ktm.M(parameterizedType.getActualTypeArguments()[0]);
                if (!Objects.equals(System.getProperty("gson.allowCapturingTypeVariables"), "true")) {
                    a(M);
                }
                this.b = M;
                this.a = ktm.N(M);
                this.c = M.hashCode();
                return;
            }
        } else if (genericSuperclass == z6n.class) {
            a70.r("TypeToken must be created with a type argument: new TypeToken<...>() {}; When using code shrinkers (ProGuard, R8, ...) make sure that generic signatures are preserved.\nSee https://github.com/google/gson/blob/main/Troubleshooting.md#type-token-raw");
            throw null;
        }
        a70.r("Must only create direct subclasses of TypeToken");
        throw null;
    }

    public static void a(Type type) {
        if (type instanceof TypeVariable) {
            TypeVariable typeVariable = (TypeVariable) type;
            String name = typeVariable.getName();
            String valueOf = String.valueOf(typeVariable.getGenericDeclaration());
            StringBuilder sb = new StringBuilder(valueOf.length() + fn0.c(94, name) + 88);
            bf3.v(sb, "TypeToken type argument must not contain a type variable; captured type variable ", name, " declared by ", valueOf);
            vp2.f(sb, "\nSee https://github.com/google/gson/blob/main/Troubleshooting.md#typetoken-type-variable");
            return;
        }
        if (type instanceof GenericArrayType) {
            a(((GenericArrayType) type).getGenericComponentType());
            return;
        }
        int i = 0;
        if (type instanceof ParameterizedType) {
            ParameterizedType parameterizedType = (ParameterizedType) type;
            Type ownerType = parameterizedType.getOwnerType();
            if (ownerType != null) {
                a(ownerType);
            }
            Type[] actualTypeArguments = parameterizedType.getActualTypeArguments();
            int length = actualTypeArguments.length;
            while (i < length) {
                a(actualTypeArguments[i]);
                i++;
            }
            return;
        }
        if (!(type instanceof WildcardType)) {
            if (type != null) {
                return;
            }
            a70.p("TypeToken captured `null` as type argument; probably a compiler / runtime bug");
            return;
        }
        WildcardType wildcardType = (WildcardType) type;
        for (Type type2 : wildcardType.getLowerBounds()) {
            a(type2);
        }
        Type[] upperBounds = wildcardType.getUpperBounds();
        int length2 = upperBounds.length;
        while (i < length2) {
            a(upperBounds[i]);
            i++;
        }
    }

    public final boolean equals(Object obj) {
        if (obj instanceof z6n) {
            return ktm.O(this.b, ((z6n) obj).b);
        }
        return false;
    }

    public final int hashCode() {
        return this.c;
    }

    public final String toString() {
        return ktm.P(this.b);
    }

    public z6n(Type type) {
        Objects.requireNonNull(type);
        Type M = ktm.M(type);
        this.b = M;
        this.a = ktm.N(M);
        this.c = M.hashCode();
    }
}
