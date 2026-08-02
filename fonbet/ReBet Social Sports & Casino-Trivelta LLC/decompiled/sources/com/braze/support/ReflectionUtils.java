package com.braze.support;

import com.braze.support.BrazeLogger;
import com.braze.support.ReflectionUtils;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.List;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;

@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0011\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010 \n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003JC\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\u0010\u0006\u001a\u0006\u0012\u0002\b\u00030\u00072\u0006\u0010\b\u001a\u00020\t2\u001e\u0010\n\u001a\u0010\u0012\f\b\u0001\u0012\b\u0012\u0002\b\u0003\u0018\u00010\u00070\u000b\"\b\u0012\u0002\b\u0003\u0018\u00010\u0007H\u0007¢\u0006\u0002\u0010\fJ?\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u0006\u0010\r\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\t2\u001e\u0010\n\u001a\u0010\u0012\f\b\u0001\u0012\b\u0012\u0002\b\u0003\u0018\u00010\u00070\u000b\"\b\u0012\u0002\b\u0003\u0018\u00010\u0007H\u0007¢\u0006\u0002\u0010\u000eJC\u0010\u000f\u001a\u0004\u0018\u00010\u00052\n\u0010\u0006\u001a\u0006\u0012\u0002\b\u00030\u00072\u0006\u0010\b\u001a\u00020\t2\u001e\u0010\n\u001a\u0010\u0012\f\b\u0001\u0012\b\u0012\u0002\b\u0003\u0018\u00010\u00070\u000b\"\b\u0012\u0002\b\u0003\u0018\u00010\u0007H\u0002¢\u0006\u0002\u0010\fJ?\u0010\u000f\u001a\u0004\u0018\u00010\u00052\u0006\u0010\r\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\t2\u001e\u0010\n\u001a\u0010\u0012\f\b\u0001\u0012\b\u0012\u0002\b\u0003\u0018\u00010\u00070\u000b\"\b\u0012\u0002\b\u0003\u0018\u00010\u0007H\u0007¢\u0006\u0002\u0010\u000eJE\u0010\u0010\u001a\u0010\u0012\u0004\u0012\u00020\u0012\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u00112\b\u0010\u0013\u001a\u0004\u0018\u00010\u00012\u0006\u0010\u0014\u001a\u00020\u00052\u0016\u0010\u0015\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u00010\u000b\"\u0004\u0018\u00010\u0001H\u0007¢\u0006\u0002\u0010\u0016J6\u0010\u0017\u001a\u0004\u0018\u00010\u00012\u0006\u0010\u0018\u001a\u00020\t2\u0012\b\u0002\u0010\n\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00070\u00192\u0010\b\u0002\u0010\u0015\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0019J=\u0010\u001a\u001a\u00020\u00122\u0006\u0010\r\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\t2\u001e\u0010\n\u001a\u0010\u0012\f\b\u0001\u0012\b\u0012\u0002\b\u0003\u0018\u00010\u00070\u000b\"\b\u0012\u0002\b\u0003\u0018\u00010\u0007H\u0007¢\u0006\u0002\u0010\u001b¨\u0006\u001c"}, d2 = {"Lcom/braze/support/ReflectionUtils;", "", "<init>", "()V", "getMethodQuietly", "Ljava/lang/reflect/Method;", "clazz", "Ljava/lang/Class;", "methodName", "", "parameterTypes", "", "(Ljava/lang/Class;Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;", "className", "(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;", "getDeclaredMethodQuietly", "invokeMethodQuietly", "Lkotlin/Pair;", "", "receiver", "method", "args", "(Ljava/lang/Object;Ljava/lang/reflect/Method;[Ljava/lang/Object;)Lkotlin/Pair;", "constructObjectQuietly", "classpath", "", "doesMethodExist", "(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Class;)Z", "android-sdk-base_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes.dex */
public final class ReflectionUtils {
    public static final ReflectionUtils INSTANCE = new ReflectionUtils();

    private ReflectionUtils() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ Object constructObjectQuietly$default(ReflectionUtils reflectionUtils, String str, List list, List list2, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            list = CollectionsKt.emptyList();
        }
        if ((i10 & 4) != 0) {
            list2 = CollectionsKt.emptyList();
        }
        return reflectionUtils.constructObjectQuietly(str, list, list2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String constructObjectQuietly$lambda$0() {
        return "Failed constructObjectQuietly";
    }

    @JvmStatic
    public static final boolean doesMethodExist(String className, String methodName, Class<?>... parameterTypes) {
        Intrinsics.checkNotNullParameter(className, "className");
        Intrinsics.checkNotNullParameter(methodName, "methodName");
        Intrinsics.checkNotNullParameter(parameterTypes, "parameterTypes");
        return getMethodQuietly(className, methodName, (Class<?>[]) Arrays.copyOf(parameterTypes, parameterTypes.length)) != null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v5, types: [T, java.lang.Class] */
    private final Method getDeclaredMethodQuietly(Class<?> clazz, String methodName, Class<?>... parameterTypes) {
        final String str = methodName;
        final Ref.ObjectRef objectRef = new Ref.ObjectRef();
        objectRef.element = clazz;
        while (true) {
            T t10 = objectRef.element;
            if (t10 == 0) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.f29469D, (Throwable) null, false, new Function0() { // from class: Y3.w0
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        String declaredMethodQuietly$lambda$1;
                        declaredMethodQuietly$lambda$1 = ReflectionUtils.getDeclaredMethodQuietly$lambda$1(str);
                        return declaredMethodQuietly$lambda$1;
                    }
                }, 6, (Object) null);
                return null;
            }
            try {
                return ((Class) t10).getDeclaredMethod(str, (Class[]) Arrays.copyOf(parameterTypes, parameterTypes.length));
            } catch (Exception unused) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.f29469D, (Throwable) null, false, new Function0() { // from class: Y3.v0
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        String declaredMethodQuietly$lambda$0;
                        declaredMethodQuietly$lambda$0 = ReflectionUtils.getDeclaredMethodQuietly$lambda$0(str, objectRef);
                        return declaredMethodQuietly$lambda$0;
                    }
                }, 6, (Object) null);
                objectRef.element = ((Class) objectRef.element).getSuperclass();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final String getDeclaredMethodQuietly$lambda$0(String str, Ref.ObjectRef objectRef) {
        Class cls = (Class) objectRef.element;
        return "Could not find " + str + " on " + (cls != null ? cls.getName() : null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String getDeclaredMethodQuietly$lambda$1(String str) {
        return "Failed to find " + str + " on ${clazz.name} or any parent classes";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String getDeclaredMethodQuietly$lambda$2() {
        return "Failed getDeclaredMethodQuietly";
    }

    @JvmStatic
    public static final Method getMethodQuietly(Class<?> clazz, String methodName, Class<?>... parameterTypes) {
        Intrinsics.checkNotNullParameter(clazz, "clazz");
        Intrinsics.checkNotNullParameter(methodName, "methodName");
        Intrinsics.checkNotNullParameter(parameterTypes, "parameterTypes");
        try {
            return clazz.getMethod(methodName, (Class[]) Arrays.copyOf(parameterTypes, parameterTypes.length));
        } catch (Exception e10) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) INSTANCE, BrazeLogger.Priority.f29469D, (Throwable) e10, false, new Function0() { // from class: Y3.x0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    String methodQuietly$lambda$0;
                    methodQuietly$lambda$0 = ReflectionUtils.getMethodQuietly$lambda$0();
                    return methodQuietly$lambda$0;
                }
            }, 4, (Object) null);
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String getMethodQuietly$lambda$0() {
        return "Failed getMethodQuietly";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String getMethodQuietly$lambda$1() {
        return "Failed getMethodQuietly";
    }

    @JvmStatic
    public static final Pair<Boolean, Object> invokeMethodQuietly(Object receiver, Method method, Object... args) {
        Intrinsics.checkNotNullParameter(method, "method");
        Intrinsics.checkNotNullParameter(args, "args");
        try {
            return new Pair<>(Boolean.TRUE, method.invoke(receiver, Arrays.copyOf(args, args.length)));
        } catch (Exception e10) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) INSTANCE, BrazeLogger.Priority.f29469D, (Throwable) e10, false, new Function0() { // from class: Y3.r0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    String invokeMethodQuietly$lambda$0;
                    invokeMethodQuietly$lambda$0 = ReflectionUtils.invokeMethodQuietly$lambda$0();
                    return invokeMethodQuietly$lambda$0;
                }
            }, 4, (Object) null);
            return new Pair<>(Boolean.FALSE, null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String invokeMethodQuietly$lambda$0() {
        return "Failed invokeMethodQuietly";
    }

    public final Object constructObjectQuietly(String classpath, List<? extends Class<?>> parameterTypes, List<? extends Object> args) {
        Intrinsics.checkNotNullParameter(classpath, "classpath");
        Intrinsics.checkNotNullParameter(parameterTypes, "parameterTypes");
        Intrinsics.checkNotNullParameter(args, "args");
        try {
            Class<?> cls = Class.forName(classpath);
            Class[] clsArr = (Class[]) parameterTypes.toArray(new Class[0]);
            Constructor<?> constructor = cls.getConstructor((Class[]) Arrays.copyOf(clsArr, clsArr.length));
            Object[] array = args.toArray(new Object[0]);
            return constructor.newInstance(Arrays.copyOf(array, array.length));
        } catch (Exception e10) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.f29470E, (Throwable) e10, false, new Function0() { // from class: Y3.u0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    String constructObjectQuietly$lambda$0;
                    constructObjectQuietly$lambda$0 = ReflectionUtils.constructObjectQuietly$lambda$0();
                    return constructObjectQuietly$lambda$0;
                }
            }, 4, (Object) null);
            return null;
        }
    }

    @JvmStatic
    public static final Method getMethodQuietly(String className, String methodName, Class<?>... parameterTypes) {
        Intrinsics.checkNotNullParameter(className, "className");
        Intrinsics.checkNotNullParameter(methodName, "methodName");
        Intrinsics.checkNotNullParameter(parameterTypes, "parameterTypes");
        try {
            Class<?> cls = Class.forName(className);
            Intrinsics.checkNotNull(cls);
            return getMethodQuietly(cls, methodName, (Class<?>[]) Arrays.copyOf(parameterTypes, parameterTypes.length));
        } catch (Exception e10) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) INSTANCE, BrazeLogger.Priority.f29469D, (Throwable) e10, false, new Function0() { // from class: Y3.s0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    String methodQuietly$lambda$1;
                    methodQuietly$lambda$1 = ReflectionUtils.getMethodQuietly$lambda$1();
                    return methodQuietly$lambda$1;
                }
            }, 4, (Object) null);
            return null;
        }
    }

    public final Method getDeclaredMethodQuietly(String className, String methodName, Class<?>... parameterTypes) {
        Intrinsics.checkNotNullParameter(className, "className");
        Intrinsics.checkNotNullParameter(methodName, "methodName");
        Intrinsics.checkNotNullParameter(parameterTypes, "parameterTypes");
        try {
            Class<?> cls = Class.forName(className);
            Intrinsics.checkNotNull(cls);
            return getDeclaredMethodQuietly(cls, methodName, (Class<?>[]) Arrays.copyOf(parameterTypes, parameterTypes.length));
        } catch (Exception e10) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.f29469D, (Throwable) e10, false, new Function0() { // from class: Y3.t0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    String declaredMethodQuietly$lambda$2;
                    declaredMethodQuietly$lambda$2 = ReflectionUtils.getDeclaredMethodQuietly$lambda$2();
                    return declaredMethodQuietly$lambda$2;
                }
            }, 4, (Object) null);
            return null;
        }
    }
}
