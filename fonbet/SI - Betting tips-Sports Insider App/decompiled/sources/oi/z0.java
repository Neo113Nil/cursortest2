package oi;

import androidx.appcompat.widget.c1;
import j$.util.Objects;
import java.lang.annotation.Annotation;
import java.lang.reflect.Array;
import java.lang.reflect.GenericArrayType;
import java.lang.reflect.GenericDeclaration;
import java.lang.reflect.Method;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.lang.reflect.WildcardType;
import java.util.Arrays;
import java.util.Map;
import java.util.NoSuchElementException;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes3.dex */
public abstract class z0 {

    /* renamed from: a, reason: collision with root package name */
    public static final Type[] f21363a = new Type[0];

    /* renamed from: b, reason: collision with root package name */
    public static boolean f21364b = true;

    public static final Object b(d dVar, Continuation frame) {
        eg.l lVar = new eg.l(1, lf.d.b(frame));
        lVar.s();
        lVar.u(new v(dVar, 0));
        dVar.o0(new w(lVar, 0));
        Object r5 = lVar.r();
        if (r5 == lf.a.f20034a) {
            Intrinsics.checkNotNullParameter(frame, "frame");
        }
        return r5;
    }

    public static final Object c(d dVar, Continuation frame) {
        eg.l lVar = new eg.l(1, lf.d.b(frame));
        lVar.s();
        lVar.u(new v(dVar, 1));
        dVar.o0(new w(lVar, 1));
        Object r5 = lVar.r();
        if (r5 == lf.a.f20034a) {
            Intrinsics.checkNotNullParameter(frame, "frame");
        }
        return r5;
    }

    public static void d(Type type) {
        if ((type instanceof Class) && ((Class) type).isPrimitive()) {
            throw new IllegalArgumentException();
        }
    }

    public static boolean e(Type type, Type type2) {
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
            Type ownerType = parameterizedType.getOwnerType();
            Type ownerType2 = parameterizedType2.getOwnerType();
            return (ownerType == ownerType2 || (ownerType != null && ownerType.equals(ownerType2))) && parameterizedType.getRawType().equals(parameterizedType2.getRawType()) && Arrays.equals(parameterizedType.getActualTypeArguments(), parameterizedType2.getActualTypeArguments());
        }
        if (type instanceof GenericArrayType) {
            if (type2 instanceof GenericArrayType) {
                return e(((GenericArrayType) type).getGenericComponentType(), ((GenericArrayType) type2).getGenericComponentType());
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
        return typeVariable.getGenericDeclaration() == typeVariable2.getGenericDeclaration() && typeVariable.getName().equals(typeVariable2.getName());
    }

    public static Type f(Type type, Class cls, Class cls2) {
        if (cls2 == cls) {
            return type;
        }
        if (cls2.isInterface()) {
            Class<?>[] interfaces = cls.getInterfaces();
            int length = interfaces.length;
            for (int i5 = 0; i5 < length; i5++) {
                Class<?> cls3 = interfaces[i5];
                if (cls3 == cls2) {
                    return cls.getGenericInterfaces()[i5];
                }
                if (cls2.isAssignableFrom(cls3)) {
                    return f(cls.getGenericInterfaces()[i5], interfaces[i5], cls2);
                }
            }
        }
        if (!cls.isInterface()) {
            while (cls != Object.class) {
                Class<?> superclass = cls.getSuperclass();
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

    public static Type g(int i5, ParameterizedType parameterizedType) {
        Type[] actualTypeArguments = parameterizedType.getActualTypeArguments();
        if (i5 >= 0 && i5 < actualTypeArguments.length) {
            Type type = actualTypeArguments[i5];
            return type instanceof WildcardType ? ((WildcardType) type).getUpperBounds()[0] : type;
        }
        StringBuilder r5 = c1.r(i5, "Index ", " not in range [0,");
        r5.append(actualTypeArguments.length);
        r5.append(") for ");
        r5.append(parameterizedType);
        throw new IllegalArgumentException(r5.toString());
    }

    public static Class h(Type type) {
        Objects.requireNonNull(type, "type == null");
        if (type instanceof Class) {
            return (Class) type;
        }
        if (type instanceof ParameterizedType) {
            Type rawType = ((ParameterizedType) type).getRawType();
            if (rawType instanceof Class) {
                return (Class) rawType;
            }
            throw new IllegalArgumentException();
        }
        if (type instanceof GenericArrayType) {
            return Array.newInstance((Class<?>) h(((GenericArrayType) type).getGenericComponentType()), 0).getClass();
        }
        if (type instanceof TypeVariable) {
            return Object.class;
        }
        if (type instanceof WildcardType) {
            return h(((WildcardType) type).getUpperBounds()[0]);
        }
        throw new IllegalArgumentException("Expected a Class, ParameterizedType, or GenericArrayType, but <" + type + "> is of type " + type.getClass().getName());
    }

    public static Type i(Type type, Class cls) {
        if (Map.class.isAssignableFrom(cls)) {
            return o(type, cls, f(type, cls, Map.class));
        }
        throw new IllegalArgumentException();
    }

    public static boolean j(Type type) {
        if (type instanceof Class) {
            return false;
        }
        if (type instanceof ParameterizedType) {
            for (Type type2 : ((ParameterizedType) type).getActualTypeArguments()) {
                if (j(type2)) {
                    return true;
                }
            }
            return false;
        }
        if (type instanceof GenericArrayType) {
            return j(((GenericArrayType) type).getGenericComponentType());
        }
        if ((type instanceof TypeVariable) || (type instanceof WildcardType)) {
            return true;
        }
        throw new IllegalArgumentException("Expected a Class, ParameterizedType, or GenericArrayType, but <" + type + "> is of type " + (type == null ? "null" : type.getClass().getName()));
    }

    public static boolean k(Annotation[] annotationArr, Class cls) {
        for (Annotation annotation : annotationArr) {
            if (cls.isInstance(annotation)) {
                return true;
            }
        }
        return false;
    }

    public static IllegalArgumentException l(Method method, Exception exc, String str, Object... objArr) {
        StringBuilder c2 = v.f.c(String.format(str, objArr), "\n    for method ");
        c2.append(method.getDeclaringClass().getSimpleName());
        c2.append(".");
        c2.append(method.getName());
        return new IllegalArgumentException(c2.toString(), exc);
    }

    public static IllegalArgumentException m(Method method, int i5, String str, Object... objArr) {
        return l(method, null, str + " (" + l0.f21277b.c(i5, method) + ")", objArr);
    }

    public static IllegalArgumentException n(Method method, Exception exc, int i5, String str, Object... objArr) {
        return l(method, exc, str + " (" + l0.f21277b.c(i5, method) + ")", objArr);
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0043 A[LOOP:0: B:1:0x0000->B:18:0x0043, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0042 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static Type o(Type type, Class cls, Type type2) {
        Type type3;
        Type type4 = type2;
        while (true) {
            int i5 = 0;
            if (!(type4 instanceof TypeVariable)) {
                if (type4 instanceof Class) {
                    Class cls2 = (Class) type4;
                    if (cls2.isArray()) {
                        Class<?> componentType = cls2.getComponentType();
                        Type o3 = o(type, cls, componentType);
                        return componentType == o3 ? cls2 : new w0(o3);
                    }
                }
                if (type4 instanceof GenericArrayType) {
                    GenericArrayType genericArrayType = (GenericArrayType) type4;
                    Type genericComponentType = genericArrayType.getGenericComponentType();
                    Type o4 = o(type, cls, genericComponentType);
                    return genericComponentType == o4 ? genericArrayType : new w0(o4);
                }
                if (type4 instanceof ParameterizedType) {
                    ParameterizedType parameterizedType = (ParameterizedType) type4;
                    Type ownerType = parameterizedType.getOwnerType();
                    Type o7 = o(type, cls, ownerType);
                    boolean z5 = o7 != ownerType;
                    Type[] actualTypeArguments = parameterizedType.getActualTypeArguments();
                    int length = actualTypeArguments.length;
                    while (i5 < length) {
                        Type o10 = o(type, cls, actualTypeArguments[i5]);
                        if (o10 != actualTypeArguments[i5]) {
                            if (!z5) {
                                actualTypeArguments = (Type[]) actualTypeArguments.clone();
                                z5 = true;
                            }
                            actualTypeArguments[i5] = o10;
                        }
                        i5++;
                    }
                    return z5 ? new x0(o7, parameterizedType.getRawType(), actualTypeArguments) : parameterizedType;
                }
                boolean z7 = type4 instanceof WildcardType;
                Type type5 = type4;
                if (z7) {
                    WildcardType wildcardType = (WildcardType) type4;
                    Type[] lowerBounds = wildcardType.getLowerBounds();
                    Type[] upperBounds = wildcardType.getUpperBounds();
                    if (lowerBounds.length == 1) {
                        Type o11 = o(type, cls, lowerBounds[0]);
                        type5 = wildcardType;
                        if (o11 != lowerBounds[0]) {
                            return new y0(new Type[]{Object.class}, new Type[]{o11});
                        }
                    } else {
                        type5 = wildcardType;
                        if (upperBounds.length == 1) {
                            Type o12 = o(type, cls, upperBounds[0]);
                            type5 = wildcardType;
                            if (o12 != upperBounds[0]) {
                                return new y0(new Type[]{o12}, f21363a);
                            }
                        }
                    }
                }
                return type5;
            }
            TypeVariable typeVariable = (TypeVariable) type4;
            GenericDeclaration genericDeclaration = typeVariable.getGenericDeclaration();
            Class cls3 = genericDeclaration instanceof Class ? (Class) genericDeclaration : null;
            if (cls3 != null) {
                Type f6 = f(type, cls, cls3);
                if (f6 instanceof ParameterizedType) {
                    TypeVariable[] typeParameters = cls3.getTypeParameters();
                    while (i5 < typeParameters.length) {
                        if (typeVariable.equals(typeParameters[i5])) {
                            type3 = ((ParameterizedType) f6).getActualTypeArguments()[i5];
                            if (type3 != typeVariable) {
                                return type3;
                            }
                            type4 = type3;
                        } else {
                            i5++;
                        }
                    }
                    throw new NoSuchElementException();
                }
            }
            type3 = typeVariable;
            if (type3 != typeVariable) {
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void p(Throwable th2, Continuation continuation) {
        x frame;
        int i5;
        if (continuation instanceof x) {
            frame = (x) continuation;
            int i10 = frame.f21352b;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                frame.f21352b = i10 - Integer.MIN_VALUE;
                Object obj = frame.f21351a;
                lf.a aVar = lf.a.f20034a;
                i5 = frame.f21352b;
                if (i5 == 0) {
                    if (i5 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    h8.b.B(obj);
                    throw new gf.f();
                }
                h8.b.B(obj);
                frame.f21352b = 1;
                eg.m0.f9201a.c0(frame.getContext(), new g8.a(27, frame, th2));
                Intrinsics.checkNotNullParameter(frame, "frame");
                return;
            }
        }
        frame = new x(continuation);
        Object obj2 = frame.f21351a;
        lf.a aVar2 = lf.a.f20034a;
        i5 = frame.f21352b;
        if (i5 == 0) {
        }
    }

    public static void q(Throwable th2) {
        if (th2 instanceof VirtualMachineError) {
            throw ((VirtualMachineError) th2);
        }
        if (th2 instanceof ThreadDeath) {
            throw ((ThreadDeath) th2);
        }
        if (th2 instanceof LinkageError) {
            throw ((LinkageError) th2);
        }
    }

    public static String r(Type type) {
        return type instanceof Class ? ((Class) type).getName() : type.toString();
    }

    public abstract void a(p0 p0Var, Object obj);
}
