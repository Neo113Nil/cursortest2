package com.squareup.moshi;

import Y9.b;
import java.lang.annotation.Annotation;
import java.lang.reflect.Array;
import java.lang.reflect.GenericArrayType;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.lang.reflect.WildcardType;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes.dex */
public final class D {
    @NotNull
    public static final Type a(@NotNull Type context) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(Collection.class, "contextRawType");
        Type d11 = d(context, Collection.class, Collection.class);
        if (d11 instanceof WildcardType) {
            d11 = ((WildcardType) d11).getUpperBounds()[0];
        }
        if (!(d11 instanceof ParameterizedType)) {
            return Object.class;
        }
        Type type = ((ParameterizedType) d11).getActualTypeArguments()[0];
        Intrinsics.checkNotNullExpressionValue(type, "{\n      collectionType.a…ualTypeArguments[0]\n    }");
        return type;
    }

    public static final boolean b(Type type, Type type2) {
        if (type == type2) {
            return true;
        }
        if (type instanceof Class) {
            return type2 instanceof GenericArrayType ? b(((Class) type).getComponentType(), ((GenericArrayType) type2).getGenericComponentType()) : Intrinsics.d(type, type2);
        }
        if (type instanceof ParameterizedType) {
            if (!(type2 instanceof ParameterizedType)) {
                return false;
            }
            Type[] actualTypeArguments = type instanceof Y9.b ? ((Y9.b) type).f34860c : ((ParameterizedType) type).getActualTypeArguments();
            Type[] actualTypeArguments2 = type2 instanceof Y9.b ? ((Y9.b) type2).f34860c : ((ParameterizedType) type2).getActualTypeArguments();
            ParameterizedType parameterizedType = (ParameterizedType) type;
            ParameterizedType parameterizedType2 = (ParameterizedType) type2;
            return b(parameterizedType.getOwnerType(), parameterizedType2.getOwnerType()) && Intrinsics.d(parameterizedType.getRawType(), parameterizedType2.getRawType()) && Arrays.equals(actualTypeArguments, actualTypeArguments2);
        }
        if (type instanceof GenericArrayType) {
            if (type2 instanceof Class) {
                return b(((Class) type2).getComponentType(), ((GenericArrayType) type).getGenericComponentType());
            }
            if (type2 instanceof GenericArrayType) {
                return b(((GenericArrayType) type).getGenericComponentType(), ((GenericArrayType) type2).getGenericComponentType());
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
        return typeVariable.getGenericDeclaration() == typeVariable2.getGenericDeclaration() && Intrinsics.d(typeVariable.getName(), typeVariable2.getName());
    }

    @NotNull
    public static final Class<?> c(Type type) {
        if (type instanceof Class) {
            return (Class) type;
        }
        if (type instanceof ParameterizedType) {
            Type rawType = ((ParameterizedType) type).getRawType();
            Intrinsics.g(rawType, "null cannot be cast to non-null type java.lang.Class<*>");
            return (Class) rawType;
        }
        if (type instanceof GenericArrayType) {
            return Array.newInstance(c(((GenericArrayType) type).getGenericComponentType()), 0).getClass();
        }
        if (type instanceof TypeVariable) {
            return Object.class;
        }
        if (type instanceof WildcardType) {
            return c(((WildcardType) type).getUpperBounds()[0]);
        }
        throw new IllegalArgumentException("Expected a Class, ParameterizedType, or GenericArrayType, but <" + type + "> is of type " + (type != null ? type.getClass().getName().toString() : null));
    }

    @NotNull
    public static final Type d(@NotNull Type context, @NotNull Class<?> contextRawType, @NotNull Class<?> supertype) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(contextRawType, "contextRawType");
        Intrinsics.checkNotNullParameter(supertype, "supertype");
        if (supertype.isAssignableFrom(contextRawType)) {
            return Y9.c.l(Y9.c.d(context, contextRawType, supertype), contextRawType, context);
        }
        throw new IllegalArgumentException();
    }

    @NotNull
    public static final Y9.b e(@NotNull Class rawType, @NotNull Type... typeArguments) {
        Intrinsics.checkNotNullParameter(rawType, "rawType");
        Intrinsics.checkNotNullParameter(typeArguments, "typeArguments");
        if (typeArguments.length != 0) {
            return b.a.a(null, rawType, (Type[]) Arrays.copyOf(typeArguments, typeArguments.length));
        }
        throw new IllegalArgumentException(U7.m.a(rawType, "Missing type arguments for ").toString());
    }

    public static final Set<Annotation> f(@NotNull Set<? extends Annotation> annotations, @NotNull Class<? extends Annotation> jsonQualifier) {
        Intrinsics.checkNotNullParameter(annotations, "annotations");
        Intrinsics.checkNotNullParameter(jsonQualifier, "jsonQualifier");
        if (!jsonQualifier.isAnnotationPresent(m.class)) {
            throw new IllegalArgumentException((jsonQualifier + " is not a JsonQualifier.").toString());
        }
        if (annotations.isEmpty()) {
            return null;
        }
        for (Annotation annotation : annotations) {
            Intrinsics.g(annotation, "null cannot be cast to non-null type java.lang.annotation.Annotation");
            if (jsonQualifier.equals(annotation.annotationType())) {
                LinkedHashSet linkedHashSet = new LinkedHashSet(annotations);
                linkedHashSet.remove(annotation);
                return Collections.unmodifiableSet(linkedHashSet);
            }
        }
        return null;
    }
}
