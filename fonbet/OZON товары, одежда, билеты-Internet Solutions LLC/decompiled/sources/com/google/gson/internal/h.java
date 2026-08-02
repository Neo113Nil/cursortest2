package com.google.gson.internal;

import java.io.Serializable;
import java.lang.reflect.Array;
import java.lang.reflect.GenericArrayType;
import java.lang.reflect.GenericDeclaration;
import java.lang.reflect.Modifier;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.lang.reflect.WildcardType;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Objects;
import java.util.Properties;

/* loaded from: classes.dex */
public final class h {

    /* renamed from: a, reason: collision with root package name */
    static final Type[] f59963a = new Type[0];

    /* loaded from: classes9.dex */
    private static final class a implements GenericArrayType, Serializable {

        /* renamed from: a, reason: collision with root package name */
        private final Type f59964a;

        a(Type type) {
            Objects.requireNonNull(type);
            this.f59964a = h.b(type);
        }

        public final boolean equals(Object obj) {
            return (obj instanceof GenericArrayType) && h.d(this, (GenericArrayType) obj);
        }

        @Override // java.lang.reflect.GenericArrayType
        public final Type getGenericComponentType() {
            return this.f59964a;
        }

        public final int hashCode() {
            return this.f59964a.hashCode();
        }

        public final String toString() {
            return h.m(this.f59964a) + "[]";
        }
    }

    private static final class b implements ParameterizedType, Serializable {

        /* renamed from: a, reason: collision with root package name */
        private final Type f59965a;

        /* renamed from: b, reason: collision with root package name */
        private final Type f59966b;

        /* renamed from: c, reason: collision with root package name */
        private final Type[] f59967c;

        b(Type type, Class<?> cls, Type... typeArr) {
            Objects.requireNonNull(cls);
            if (type == null && !Modifier.isStatic(cls.getModifiers()) && cls.getDeclaringClass() != null) {
                throw new IllegalArgumentException(U7.m.a(cls, "Must specify owner type for "));
            }
            this.f59965a = type == null ? null : h.b(type);
            this.f59966b = h.b(cls);
            Type[] typeArr2 = (Type[]) typeArr.clone();
            this.f59967c = typeArr2;
            int length = typeArr2.length;
            for (int i11 = 0; i11 < length; i11++) {
                Objects.requireNonNull(this.f59967c[i11]);
                h.c(this.f59967c[i11]);
                Type[] typeArr3 = this.f59967c;
                typeArr3[i11] = h.b(typeArr3[i11]);
            }
        }

        public final boolean equals(Object obj) {
            return (obj instanceof ParameterizedType) && h.d(this, (ParameterizedType) obj);
        }

        @Override // java.lang.reflect.ParameterizedType
        public final Type[] getActualTypeArguments() {
            return (Type[]) this.f59967c.clone();
        }

        @Override // java.lang.reflect.ParameterizedType
        public final Type getOwnerType() {
            return this.f59965a;
        }

        @Override // java.lang.reflect.ParameterizedType
        public final Type getRawType() {
            return this.f59966b;
        }

        public final int hashCode() {
            int hashCode = Arrays.hashCode(this.f59967c) ^ this.f59966b.hashCode();
            Type type = this.f59965a;
            return hashCode ^ (type != null ? type.hashCode() : 0);
        }

        public final String toString() {
            Type[] typeArr = this.f59967c;
            int length = typeArr.length;
            Type type = this.f59966b;
            if (length == 0) {
                return h.m(type);
            }
            StringBuilder sb2 = new StringBuilder((length + 1) * 30);
            sb2.append(h.m(type));
            sb2.append("<");
            sb2.append(h.m(typeArr[0]));
            for (int i11 = 1; i11 < length; i11++) {
                sb2.append(", ");
                sb2.append(h.m(typeArr[i11]));
            }
            sb2.append(">");
            return sb2.toString();
        }
    }

    private static final class c implements WildcardType, Serializable {

        /* renamed from: a, reason: collision with root package name */
        private final Type f59968a;

        /* renamed from: b, reason: collision with root package name */
        private final Type f59969b;

        c(Type[] typeArr, Type[] typeArr2) {
            if (typeArr2.length > 1) {
                throw new IllegalArgumentException("At most one lower bound is supported");
            }
            if (typeArr.length != 1) {
                throw new IllegalArgumentException("Exactly one upper bound must be specified");
            }
            if (typeArr2.length != 1) {
                Objects.requireNonNull(typeArr[0]);
                h.c(typeArr[0]);
                this.f59969b = null;
                this.f59968a = h.b(typeArr[0]);
                return;
            }
            Objects.requireNonNull(typeArr2[0]);
            h.c(typeArr2[0]);
            if (typeArr[0] != Object.class) {
                throw new IllegalArgumentException("When lower bound is specified, upper bound must be Object");
            }
            this.f59969b = h.b(typeArr2[0]);
            this.f59968a = Object.class;
        }

        public final boolean equals(Object obj) {
            return (obj instanceof WildcardType) && h.d(this, (WildcardType) obj);
        }

        @Override // java.lang.reflect.WildcardType
        public final Type[] getLowerBounds() {
            Type type = this.f59969b;
            return type != null ? new Type[]{type} : h.f59963a;
        }

        @Override // java.lang.reflect.WildcardType
        public final Type[] getUpperBounds() {
            return new Type[]{this.f59968a};
        }

        public final int hashCode() {
            Type type = this.f59969b;
            return (type != null ? type.hashCode() + 31 : 1) ^ (this.f59968a.hashCode() + 31);
        }

        public final String toString() {
            Type type = this.f59969b;
            if (type != null) {
                return "? super " + h.m(type);
            }
            Type type2 = this.f59968a;
            if (type2 == Object.class) {
                return "?";
            }
            return "? extends " + h.m(type2);
        }
    }

    public static GenericArrayType a(Type type) {
        return new a(type);
    }

    public static Type b(Type type) {
        if (type instanceof Class) {
            Class cls = (Class) type;
            return cls.isArray() ? new a(b(cls.getComponentType())) : cls;
        }
        if (type instanceof ParameterizedType) {
            ParameterizedType parameterizedType = (ParameterizedType) type;
            return new b(parameterizedType.getOwnerType(), (Class) parameterizedType.getRawType(), parameterizedType.getActualTypeArguments());
        }
        if (type instanceof GenericArrayType) {
            return new a(((GenericArrayType) type).getGenericComponentType());
        }
        if (!(type instanceof WildcardType)) {
            return type;
        }
        WildcardType wildcardType = (WildcardType) type;
        return new c(wildcardType.getUpperBounds(), wildcardType.getLowerBounds());
    }

    static void c(Type type) {
        if ((type instanceof Class) && ((Class) type).isPrimitive()) {
            throw new IllegalArgumentException("Primitive type is not allowed");
        }
    }

    public static boolean d(Type type, Type type2) {
        if (type == type2) {
            return true;
        }
        if (type instanceof Class) {
            return type.equals(type2);
        }
        if (type instanceof ParameterizedType) {
            if (!(type2 instanceof ParameterizedType)) {
                return false;
            }
            ParameterizedType parameterizedType = (ParameterizedType) type;
            ParameterizedType parameterizedType2 = (ParameterizedType) type2;
            return Objects.equals(parameterizedType.getOwnerType(), parameterizedType2.getOwnerType()) && parameterizedType.getRawType().equals(parameterizedType2.getRawType()) && Arrays.equals(parameterizedType.getActualTypeArguments(), parameterizedType2.getActualTypeArguments());
        }
        if (type instanceof GenericArrayType) {
            if (type2 instanceof GenericArrayType) {
                return d(((GenericArrayType) type).getGenericComponentType(), ((GenericArrayType) type2).getGenericComponentType());
            }
            return false;
        }
        if (type instanceof WildcardType) {
            if (!(type2 instanceof WildcardType)) {
                return false;
            }
            WildcardType wildcardType = (WildcardType) type;
            WildcardType wildcardType2 = (WildcardType) type2;
            return Arrays.equals(wildcardType.getUpperBounds(), wildcardType2.getUpperBounds()) && Arrays.equals(wildcardType.getLowerBounds(), wildcardType2.getLowerBounds());
        }
        if (!(type instanceof TypeVariable) || !(type2 instanceof TypeVariable)) {
            return false;
        }
        TypeVariable typeVariable = (TypeVariable) type;
        TypeVariable typeVariable2 = (TypeVariable) type2;
        return Objects.equals(typeVariable.getGenericDeclaration(), typeVariable2.getGenericDeclaration()) && typeVariable.getName().equals(typeVariable2.getName());
    }

    public static Type e(Type type, Class<?> cls) {
        Type i11 = i(type, cls, Collection.class);
        return i11 instanceof ParameterizedType ? ((ParameterizedType) i11).getActualTypeArguments()[0] : Object.class;
    }

    private static Type f(Type type, Class<?> cls, Class<?> cls2) {
        if (cls2 == cls) {
            return type;
        }
        if (cls2.isInterface()) {
            Class<?>[] interfaces = cls.getInterfaces();
            int length = interfaces.length;
            for (int i11 = 0; i11 < length; i11++) {
                Class<?> cls3 = interfaces[i11];
                if (cls3 == cls2) {
                    return cls.getGenericInterfaces()[i11];
                }
                if (cls2.isAssignableFrom(cls3)) {
                    return f(cls.getGenericInterfaces()[i11], interfaces[i11], cls2);
                }
            }
        }
        if (!cls.isInterface()) {
            while (cls != Object.class) {
                Class<? super Object> superclass = cls.getSuperclass();
                if (superclass == cls2) {
                    return cls.getGenericSuperclass();
                }
                if (cls2.isAssignableFrom(superclass)) {
                    return f(cls.getGenericSuperclass(), superclass, cls2);
                }
                cls = superclass;
            }
        }
        return cls2;
    }

    public static Type[] g(Type type, Class<?> cls) {
        if (Properties.class.isAssignableFrom(cls)) {
            return new Type[]{String.class, String.class};
        }
        Type i11 = i(type, cls, Map.class);
        return i11 instanceof ParameterizedType ? ((ParameterizedType) i11).getActualTypeArguments() : new Type[]{Object.class, Object.class};
    }

    public static Class<?> h(Type type) {
        if (type instanceof Class) {
            return (Class) type;
        }
        if (type instanceof ParameterizedType) {
            return (Class) ((ParameterizedType) type).getRawType();
        }
        if (type instanceof GenericArrayType) {
            return Array.newInstance(h(((GenericArrayType) type).getGenericComponentType()), 0).getClass();
        }
        if (type instanceof TypeVariable) {
            return Object.class;
        }
        if (type instanceof WildcardType) {
            return h(((WildcardType) type).getUpperBounds()[0]);
        }
        throw new IllegalArgumentException("Expected a Class, ParameterizedType, or GenericArrayType, but <" + type + "> is of type " + (type == null ? "null" : type.getClass().getName()));
    }

    private static Type i(Type type, Class<?> cls, Class<?> cls2) {
        if (type instanceof WildcardType) {
            type = ((WildcardType) type).getUpperBounds()[0];
        }
        if (cls2.isAssignableFrom(cls)) {
            return k(type, cls, f(type, cls, cls2));
        }
        throw new IllegalArgumentException(cls + " is not the same as or a subtype of " + cls2);
    }

    public static ParameterizedType j(Class cls, Type... typeArr) {
        return new b(null, cls, typeArr);
    }

    public static Type k(Type type, Class<?> cls, Type type2) {
        return l(type, cls, type2, new HashMap());
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x0140, code lost:
    
        if (r3 == null) goto L82;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0142, code lost:
    
        r13.put(r3, r12);
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0145, code lost:
    
        return r12;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0140 A[EDGE_INSN: B:24:0x0140->B:25:0x0140 BREAK  A[LOOP:0: B:2:0x0004->B:29:?], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:29:? A[LOOP:0: B:2:0x0004->B:29:?, LOOP_END, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r12v0, types: [java.lang.reflect.Type] */
    /* JADX WARN: Type inference failed for: r12v1, types: [java.lang.reflect.Type] */
    /* JADX WARN: Type inference failed for: r12v10, types: [java.lang.Object, java.lang.reflect.Type] */
    /* JADX WARN: Type inference failed for: r12v14 */
    /* JADX WARN: Type inference failed for: r12v15 */
    /* JADX WARN: Type inference failed for: r12v17, types: [java.lang.reflect.Type[]] */
    /* JADX WARN: Type inference failed for: r12v18 */
    /* JADX WARN: Type inference failed for: r12v2, types: [java.lang.reflect.WildcardType] */
    /* JADX WARN: Type inference failed for: r12v3, types: [com.google.gson.internal.h$c] */
    /* JADX WARN: Type inference failed for: r12v4, types: [com.google.gson.internal.h$c] */
    /* JADX WARN: Type inference failed for: r12v5, types: [java.lang.reflect.ParameterizedType] */
    /* JADX WARN: Type inference failed for: r12v6, types: [java.lang.reflect.GenericArrayType] */
    /* JADX WARN: Type inference failed for: r12v7 */
    /* JADX WARN: Type inference failed for: r12v9 */
    /* JADX WARN: Type inference failed for: r13v0, types: [java.util.HashMap] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static Type l(Type type, Class cls, Type type2, HashMap hashMap) {
        Type l11;
        Type bVar;
        TypeVariable typeVariable = null;
        while (true) {
            if (type2 instanceof TypeVariable) {
                TypeVariable typeVariable2 = type2;
                Type type3 = (Type) hashMap.get(typeVariable2);
                Class cls2 = Void.TYPE;
                if (type3 != null) {
                    return type3 == cls2 ? type2 : type3;
                }
                hashMap.put(typeVariable2, cls2);
                if (typeVariable == null) {
                    typeVariable = typeVariable2;
                }
                GenericDeclaration genericDeclaration = typeVariable2.getGenericDeclaration();
                Class cls3 = genericDeclaration instanceof Class ? (Class) genericDeclaration : null;
                if (cls3 != null) {
                    Type f7 = f(type, cls, cls3);
                    if (f7 instanceof ParameterizedType) {
                        TypeVariable[] typeParameters = cls3.getTypeParameters();
                        int length = typeParameters.length;
                        for (int i11 = 0; i11 < length; i11++) {
                            if (typeVariable2.equals(typeParameters[i11])) {
                                type2 = ((ParameterizedType) f7).getActualTypeArguments()[i11];
                                if (type2 != typeVariable2) {
                                    break;
                                }
                            }
                        }
                        throw new NoSuchElementException();
                    }
                }
                type2 = typeVariable2;
                if (type2 != typeVariable2) {
                }
            } else {
                if (type2 instanceof Class) {
                    Class cls4 = type2;
                    if (cls4.isArray()) {
                        Class<?> componentType = cls4.getComponentType();
                        Type l12 = l(type, cls, componentType, hashMap);
                        if (Objects.equals(componentType, l12)) {
                            type2 = cls4;
                        } else {
                            bVar = new a(l12);
                            type2 = bVar;
                        }
                    }
                }
                if (type2 instanceof GenericArrayType) {
                    type2 = (GenericArrayType) type2;
                    Type genericComponentType = type2.getGenericComponentType();
                    Type l13 = l(type, cls, genericComponentType, hashMap);
                    if (!Objects.equals(genericComponentType, l13)) {
                        bVar = new a(l13);
                        type2 = bVar;
                    }
                } else if (type2 instanceof ParameterizedType) {
                    type2 = (ParameterizedType) type2;
                    Type ownerType = type2.getOwnerType();
                    Type l14 = l(type, cls, ownerType, hashMap);
                    boolean equals = Objects.equals(l14, ownerType);
                    Type[] actualTypeArguments = type2.getActualTypeArguments();
                    int length2 = actualTypeArguments.length;
                    Type[] typeArr = actualTypeArguments;
                    boolean z11 = false;
                    for (int i12 = 0; i12 < length2; i12++) {
                        Type l15 = l(type, cls, typeArr[i12], hashMap);
                        if (!Objects.equals(l15, typeArr[i12])) {
                            if (!z11) {
                                typeArr = (Type[]) typeArr.clone();
                                z11 = true;
                            }
                            typeArr[i12] = l15;
                        }
                    }
                    if (!equals || z11) {
                        bVar = new b(l14, (Class) type2.getRawType(), typeArr);
                        type2 = bVar;
                    }
                } else if (type2 instanceof WildcardType) {
                    type2 = (WildcardType) type2;
                    Type[] lowerBounds = type2.getLowerBounds();
                    Type[] upperBounds = type2.getUpperBounds();
                    if (lowerBounds.length == 1) {
                        Type l16 = l(type, cls, lowerBounds[0], hashMap);
                        if (l16 != lowerBounds[0]) {
                            type2 = new c(new Type[]{Object.class}, l16 instanceof WildcardType ? ((WildcardType) l16).getLowerBounds() : new Type[]{l16});
                        }
                    } else if (upperBounds.length == 1 && (l11 = l(type, cls, upperBounds[0], hashMap)) != upperBounds[0]) {
                        type2 = new c(l11 instanceof WildcardType ? ((WildcardType) l11).getUpperBounds() : new Type[]{l11}, f59963a);
                    }
                }
            }
        }
    }

    public static String m(Type type) {
        return type instanceof Class ? ((Class) type).getName() : type.toString();
    }
}
