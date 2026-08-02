package di;

import Zh.InterfaceC1901b;
import ai.AbstractC2028a;
import java.lang.reflect.Array;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Map;
import kotlin.KotlinNothingValueException;
import kotlin.UByte;
import kotlin.UByteArray;
import kotlin.UInt;
import kotlin.UIntArray;
import kotlin.ULong;
import kotlin.ULongArray;
import kotlin.UShort;
import kotlin.UShortArray;
import kotlin.Unit;
import kotlin.collections.MapsKt;
import kotlin.jvm.JvmClassMappingKt;
import kotlin.jvm.internal.BooleanCompanionObject;
import kotlin.jvm.internal.ByteCompanionObject;
import kotlin.jvm.internal.CharCompanionObject;
import kotlin.jvm.internal.DoubleCompanionObject;
import kotlin.jvm.internal.FloatCompanionObject;
import kotlin.jvm.internal.IntCompanionObject;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.LongCompanionObject;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.ShortCompanionObject;
import kotlin.jvm.internal.StringCompanionObject;
import kotlin.reflect.KClass;
import kotlin.text.StringsKt;
import kotlin.time.Duration;
import kotlin.time.Instant;
import kotlin.uuid.Uuid;

/* loaded from: classes5.dex */
public abstract class D0 {
    public static final Object a(Class cls, String str) {
        try {
            Field declaredField = cls.getDeclaredField(str);
            declaredField.setAccessible(true);
            return declaredField.get(null);
        } catch (Throwable unused) {
            return null;
        }
    }

    public static final InterfaceC1901b b(KClass kClass) {
        Intrinsics.checkNotNullParameter(kClass, "<this>");
        return d(kClass, new InterfaceC1901b[0]);
    }

    public static final InterfaceC1901b c(Class cls, InterfaceC1901b... args) {
        Intrinsics.checkNotNullParameter(cls, "<this>");
        Intrinsics.checkNotNullParameter(args, "args");
        if (cls.isEnum() && m(cls)) {
            return e(cls);
        }
        InterfaceC1901b k10 = k(cls, (InterfaceC1901b[]) Arrays.copyOf(args, args.length));
        if (k10 != null) {
            return k10;
        }
        InterfaceC1901b h10 = h(cls);
        if (h10 != null) {
            return h10;
        }
        InterfaceC1901b f10 = f(cls, (InterfaceC1901b[]) Arrays.copyOf(args, args.length));
        if (f10 != null) {
            return f10;
        }
        if (n(cls)) {
            return new Zh.g(JvmClassMappingKt.getKotlinClass(cls));
        }
        return null;
    }

    public static final InterfaceC1901b d(KClass kClass, InterfaceC1901b... args) {
        Intrinsics.checkNotNullParameter(kClass, "<this>");
        Intrinsics.checkNotNullParameter(args, "args");
        return c(JvmClassMappingKt.getJavaClass(kClass), (InterfaceC1901b[]) Arrays.copyOf(args, args.length));
    }

    public static final InterfaceC1901b e(Class cls) {
        Object[] enumConstants = cls.getEnumConstants();
        String canonicalName = cls.getCanonicalName();
        Intrinsics.checkNotNullExpressionValue(canonicalName, "getCanonicalName(...)");
        Intrinsics.checkNotNull(enumConstants, "null cannot be cast to non-null type kotlin.Array<out kotlin.Enum<*>>");
        return new I(canonicalName, (Enum[]) enumConstants);
    }

    public static final InterfaceC1901b f(Class cls, InterfaceC1901b... interfaceC1901bArr) {
        Field field;
        InterfaceC1901b j10;
        Object g10 = g(cls);
        if (g10 != null && (j10 = j(g10, (InterfaceC1901b[]) Arrays.copyOf(interfaceC1901bArr, interfaceC1901bArr.length))) != null) {
            return j10;
        }
        try {
            Class<?>[] declaredClasses = cls.getDeclaredClasses();
            Intrinsics.checkNotNullExpressionValue(declaredClasses, "getDeclaredClasses(...)");
            int length = declaredClasses.length;
            int i10 = 0;
            Class<?> cls2 = null;
            boolean z10 = false;
            while (true) {
                if (i10 < length) {
                    Class<?> cls3 = declaredClasses[i10];
                    if (Intrinsics.areEqual(cls3.getSimpleName(), "$serializer")) {
                        if (z10) {
                            break;
                        }
                        z10 = true;
                        cls2 = cls3;
                    }
                    i10++;
                } else if (!z10) {
                }
            }
            cls2 = null;
            Object obj = (cls2 == null || (field = cls2.getField("INSTANCE")) == null) ? null : field.get(null);
            if (obj instanceof InterfaceC1901b) {
                return (InterfaceC1901b) obj;
            }
        } catch (NoSuchFieldException unused) {
        }
        return null;
    }

    public static final Object g(Class cls) {
        Class<?> cls2;
        Class<?>[] declaredClasses = cls.getDeclaredClasses();
        Intrinsics.checkNotNullExpressionValue(declaredClasses, "getDeclaredClasses(...)");
        int length = declaredClasses.length;
        int i10 = 0;
        while (true) {
            if (i10 >= length) {
                cls2 = null;
                break;
            }
            cls2 = declaredClasses[i10];
            if (cls2.getAnnotation(InterfaceC4108p0.class) != null) {
                break;
            }
            i10++;
        }
        if (cls2 == null) {
            return null;
        }
        String simpleName = cls2.getSimpleName();
        Intrinsics.checkNotNullExpressionValue(simpleName, "getSimpleName(...)");
        return a(cls, simpleName);
    }

    /* JADX WARN: Code restructure failed: missing block: B:49:0x009d, code lost:
    
        if (r4 == false) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x0056, code lost:
    
        if (r5 == false) goto L19;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final InterfaceC1901b h(Class cls) {
        String canonicalName = cls.getCanonicalName();
        if (canonicalName != null) {
            int i10 = 0;
            if (!StringsKt.startsWith$default(canonicalName, "java.", false, 2, (Object) null) && !StringsKt.startsWith$default(canonicalName, "kotlin.", false, 2, (Object) null)) {
                Field[] declaredFields = cls.getDeclaredFields();
                Intrinsics.checkNotNullExpressionValue(declaredFields, "getDeclaredFields(...)");
                int length = declaredFields.length;
                Field field = null;
                int i11 = 0;
                boolean z10 = false;
                while (true) {
                    if (i11 < length) {
                        Field field2 = declaredFields[i11];
                        if (Intrinsics.areEqual(field2.getName(), "INSTANCE") && Intrinsics.areEqual(field2.getType(), cls) && Modifier.isStatic(field2.getModifiers())) {
                            if (z10) {
                                break;
                            }
                            z10 = true;
                            field = field2;
                        }
                        i11++;
                    }
                }
                field = null;
                if (field == null) {
                    return null;
                }
                Object obj = field.get(null);
                Method[] methods = cls.getMethods();
                Intrinsics.checkNotNullExpressionValue(methods, "getMethods(...)");
                int length2 = methods.length;
                Method method = null;
                boolean z11 = false;
                while (true) {
                    if (i10 < length2) {
                        Method method2 = methods[i10];
                        if (Intrinsics.areEqual(method2.getName(), "serializer")) {
                            Class<?>[] parameterTypes = method2.getParameterTypes();
                            Intrinsics.checkNotNullExpressionValue(parameterTypes, "getParameterTypes(...)");
                            if (parameterTypes.length == 0 && Intrinsics.areEqual(method2.getReturnType(), InterfaceC1901b.class)) {
                                if (z11) {
                                    break;
                                }
                                method = method2;
                                z11 = true;
                            }
                        }
                        i10++;
                    }
                }
                method = null;
                if (method == null) {
                    return null;
                }
                Object invoke = method.invoke(obj, null);
                if (invoke instanceof InterfaceC1901b) {
                    return (InterfaceC1901b) invoke;
                }
            }
        }
        return null;
    }

    public static final Map i() {
        Map createMapBuilder = MapsKt.createMapBuilder();
        createMapBuilder.put(Reflection.getOrCreateKotlinClass(String.class), AbstractC2028a.H(StringCompanionObject.INSTANCE));
        createMapBuilder.put(Reflection.getOrCreateKotlinClass(Character.TYPE), AbstractC2028a.B(CharCompanionObject.INSTANCE));
        createMapBuilder.put(Reflection.getOrCreateKotlinClass(char[].class), AbstractC2028a.d());
        createMapBuilder.put(Reflection.getOrCreateKotlinClass(Double.TYPE), AbstractC2028a.C(DoubleCompanionObject.INSTANCE));
        createMapBuilder.put(Reflection.getOrCreateKotlinClass(double[].class), AbstractC2028a.e());
        createMapBuilder.put(Reflection.getOrCreateKotlinClass(Float.TYPE), AbstractC2028a.D(FloatCompanionObject.INSTANCE));
        createMapBuilder.put(Reflection.getOrCreateKotlinClass(float[].class), AbstractC2028a.f());
        createMapBuilder.put(Reflection.getOrCreateKotlinClass(Long.TYPE), AbstractC2028a.F(LongCompanionObject.INSTANCE));
        createMapBuilder.put(Reflection.getOrCreateKotlinClass(long[].class), AbstractC2028a.i());
        createMapBuilder.put(Reflection.getOrCreateKotlinClass(ULong.class), AbstractC2028a.w(ULong.INSTANCE));
        createMapBuilder.put(Reflection.getOrCreateKotlinClass(Integer.TYPE), AbstractC2028a.E(IntCompanionObject.INSTANCE));
        createMapBuilder.put(Reflection.getOrCreateKotlinClass(int[].class), AbstractC2028a.g());
        createMapBuilder.put(Reflection.getOrCreateKotlinClass(UInt.class), AbstractC2028a.v(UInt.INSTANCE));
        createMapBuilder.put(Reflection.getOrCreateKotlinClass(Short.TYPE), AbstractC2028a.G(ShortCompanionObject.INSTANCE));
        createMapBuilder.put(Reflection.getOrCreateKotlinClass(short[].class), AbstractC2028a.n());
        createMapBuilder.put(Reflection.getOrCreateKotlinClass(UShort.class), AbstractC2028a.x(UShort.INSTANCE));
        createMapBuilder.put(Reflection.getOrCreateKotlinClass(Byte.TYPE), AbstractC2028a.A(ByteCompanionObject.INSTANCE));
        createMapBuilder.put(Reflection.getOrCreateKotlinClass(byte[].class), AbstractC2028a.c());
        createMapBuilder.put(Reflection.getOrCreateKotlinClass(UByte.class), AbstractC2028a.u(UByte.INSTANCE));
        createMapBuilder.put(Reflection.getOrCreateKotlinClass(Boolean.TYPE), AbstractC2028a.z(BooleanCompanionObject.INSTANCE));
        createMapBuilder.put(Reflection.getOrCreateKotlinClass(boolean[].class), AbstractC2028a.b());
        createMapBuilder.put(Reflection.getOrCreateKotlinClass(Unit.class), AbstractC2028a.y(Unit.INSTANCE));
        createMapBuilder.put(Reflection.getOrCreateKotlinClass(Void.class), AbstractC2028a.l());
        try {
            createMapBuilder.put(Reflection.getOrCreateKotlinClass(Duration.class), AbstractC2028a.I(Duration.INSTANCE));
        } catch (ClassNotFoundException | NoClassDefFoundError unused) {
        }
        try {
            createMapBuilder.put(Reflection.getOrCreateKotlinClass(ULongArray.class), AbstractC2028a.r());
        } catch (ClassNotFoundException | NoClassDefFoundError unused2) {
        }
        try {
            createMapBuilder.put(Reflection.getOrCreateKotlinClass(UIntArray.class), AbstractC2028a.q());
        } catch (ClassNotFoundException | NoClassDefFoundError unused3) {
        }
        try {
            createMapBuilder.put(Reflection.getOrCreateKotlinClass(UShortArray.class), AbstractC2028a.s());
        } catch (ClassNotFoundException | NoClassDefFoundError unused4) {
        }
        try {
            createMapBuilder.put(Reflection.getOrCreateKotlinClass(UByteArray.class), AbstractC2028a.p());
        } catch (ClassNotFoundException | NoClassDefFoundError unused5) {
        }
        try {
            createMapBuilder.put(Reflection.getOrCreateKotlinClass(Uuid.class), AbstractC2028a.K(Uuid.INSTANCE));
        } catch (ClassNotFoundException | NoClassDefFoundError unused6) {
        }
        try {
            createMapBuilder.put(Reflection.getOrCreateKotlinClass(Instant.class), AbstractC2028a.J(Instant.INSTANCE));
        } catch (ClassNotFoundException | NoClassDefFoundError unused7) {
        }
        return MapsKt.build(createMapBuilder);
    }

    public static final InterfaceC1901b j(Object obj, InterfaceC1901b... interfaceC1901bArr) {
        Class[] clsArr;
        try {
            if (interfaceC1901bArr.length == 0) {
                clsArr = new Class[0];
            } else {
                int length = interfaceC1901bArr.length;
                Class[] clsArr2 = new Class[length];
                for (int i10 = 0; i10 < length; i10++) {
                    clsArr2[i10] = InterfaceC1901b.class;
                }
                clsArr = clsArr2;
            }
            Object invoke = obj.getClass().getDeclaredMethod("serializer", (Class[]) Arrays.copyOf(clsArr, clsArr.length)).invoke(obj, Arrays.copyOf(interfaceC1901bArr, interfaceC1901bArr.length));
            if (invoke instanceof InterfaceC1901b) {
                return (InterfaceC1901b) invoke;
            }
            return null;
        } catch (NoSuchMethodException unused) {
            return null;
        } catch (InvocationTargetException e10) {
            Throwable cause = e10.getCause();
            if (cause == null) {
                throw e10;
            }
            String message = cause.getMessage();
            if (message == null) {
                message = e10.getMessage();
            }
            throw new InvocationTargetException(cause, message);
        }
    }

    public static final InterfaceC1901b k(Class cls, InterfaceC1901b... interfaceC1901bArr) {
        Object a10 = a(cls, "Companion");
        if (a10 == null) {
            return null;
        }
        return j(a10, (InterfaceC1901b[]) Arrays.copyOf(interfaceC1901bArr, interfaceC1901bArr.length));
    }

    public static final boolean l(KClass kClass) {
        Intrinsics.checkNotNullParameter(kClass, "<this>");
        return JvmClassMappingKt.getJavaClass(kClass).isInterface();
    }

    public static final boolean m(Class cls) {
        return cls.getAnnotation(Zh.n.class) == null && cls.getAnnotation(Zh.d.class) == null;
    }

    public static final boolean n(Class cls) {
        if (cls.getAnnotation(Zh.d.class) != null) {
            return true;
        }
        Zh.n nVar = (Zh.n) cls.getAnnotation(Zh.n.class);
        return nVar != null && Intrinsics.areEqual(Reflection.getOrCreateKotlinClass(nVar.with()), Reflection.getOrCreateKotlinClass(Zh.g.class));
    }

    public static final boolean o(KClass rootClass) {
        Intrinsics.checkNotNullParameter(rootClass, "rootClass");
        return JvmClassMappingKt.getJavaClass(rootClass).isArray();
    }

    public static final Void p(KClass kClass) {
        Intrinsics.checkNotNullParameter(kClass, "<this>");
        E0.f(kClass);
        throw new KotlinNothingValueException();
    }

    public static final Object[] q(ArrayList arrayList, KClass eClass) {
        Intrinsics.checkNotNullParameter(arrayList, "<this>");
        Intrinsics.checkNotNullParameter(eClass, "eClass");
        Object newInstance = Array.newInstance((Class<?>) JvmClassMappingKt.getJavaClass(eClass), arrayList.size());
        Intrinsics.checkNotNull(newInstance, "null cannot be cast to non-null type kotlin.Array<E of kotlinx.serialization.internal.PlatformKt.toNativeArrayImpl>");
        Object[] array = arrayList.toArray((Object[]) newInstance);
        Intrinsics.checkNotNullExpressionValue(array, "toArray(...)");
        return array;
    }
}
