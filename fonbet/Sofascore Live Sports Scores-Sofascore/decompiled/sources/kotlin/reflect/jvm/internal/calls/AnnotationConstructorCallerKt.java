package kotlin.reflect.jvm.internal.calls;

import defpackage.duf;
import defpackage.fuf;
import defpackage.joa;
import defpackage.k13;
import defpackage.mqi;
import defpackage.ph0;
import defpackage.sha;
import defpackage.ypa;
import java.lang.annotation.Annotation;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KClass;
import kotlin.reflect.jvm.internal.KotlinReflectionInternalError;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Metadata(d1 = {"\u00004\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\u001aI\u0010\u0000\u001a\u0002H\u0001\"\b\b\u0000\u0010\u0001*\u00020\u00022\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u0002H\u00010\u00042\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00020\u00062\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\tH\u0000¢\u0006\u0002\u0010\u000b\u001a$\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00072\n\u0010\u0011\u001a\u0006\u0012\u0002\b\u00030\u0004H\u0002\u001a\u001c\u0010\u0012\u001a\u0004\u0018\u00010\u0002*\u0004\u0018\u00010\u00022\n\u0010\u0013\u001a\u0006\u0012\u0002\b\u00030\u0004H\u0002¨\u0006\u0014²\u0006\u0014\u0010\u0015\u001a\u00020\u000f\"\b\b\u0000\u0010\u0001*\u00020\u0002X\u008a\u0084\u0002²\u0006\u0014\u0010\u0016\u001a\u00020\u0007\"\b\b\u0000\u0010\u0001*\u00020\u0002X\u008a\u0084\u0002"}, d2 = {"createAnnotationInstance", "T", "", "annotationClass", "Ljava/lang/Class;", "values", "", "", "methods", "", "Ljava/lang/reflect/Method;", "(Ljava/lang/Class;Ljava/util/Map;Ljava/util/List;)Ljava/lang/Object;", "throwIllegalArgumentType", "", "index", "", "name", "expectedJvmType", "transformKotlinToJvm", "expectedType", "kotlin-reflection", "hashCode", "toString"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class AnnotationConstructorCallerKt {
    @NotNull
    public static final <T> T createAnnotationInstance(@NotNull final Class<T> cls, @NotNull final Map<String, ? extends Object> map, @NotNull final List<Method> list) {
        cls.getClass();
        map.getClass();
        list.getClass();
        final mqi b = ypa.b(new AnnotationConstructorCallerKt$createAnnotationInstance$hashCode$2(map));
        final mqi b2 = ypa.b(new AnnotationConstructorCallerKt$createAnnotationInstance$toString$2(cls, map));
        T t = (T) Proxy.newProxyInstance(cls.getClassLoader(), new Class[]{cls}, new InvocationHandler(cls, map, b2, b, list) { // from class: kotlin.reflect.jvm.internal.calls.AnnotationConstructorCallerKt$$Lambda$0
            private final Class arg$0;
            private final Map arg$1;
            private final joa arg$2;
            private final joa arg$3;
            private final List arg$4;

            {
                this.arg$0 = cls;
                this.arg$1 = map;
                this.arg$2 = b2;
                this.arg$3 = b;
                this.arg$4 = list;
            }

            @Override // java.lang.reflect.InvocationHandler
            public Object invoke(Object obj, Method method, Object[] objArr) {
                Object createAnnotationInstance$lambda$4;
                createAnnotationInstance$lambda$4 = AnnotationConstructorCallerKt.createAnnotationInstance$lambda$4(this.arg$0, this.arg$1, this.arg$2, this.arg$3, this.arg$4, obj, method, objArr);
                return createAnnotationInstance$lambda$4;
            }
        });
        t.getClass();
        return t;
    }

    public static /* synthetic */ Object createAnnotationInstance$default(Class cls, Map map, List list, int i, Object obj) {
        if ((i & 4) != 0) {
            Set keySet = map.keySet();
            ArrayList arrayList = new ArrayList(k13.r(keySet, 10));
            Iterator it = keySet.iterator();
            while (it.hasNext()) {
                arrayList.add(cls.getDeclaredMethod((String) it.next(), null));
            }
            list = arrayList;
        }
        return createAnnotationInstance(cls, map, list);
    }

    private static final <T> boolean createAnnotationInstance$equals(Class<T> cls, List<Method> list, Map<String, ? extends Object> map, Object obj) {
        boolean c;
        Annotation annotation = obj instanceof Annotation ? (Annotation) obj : null;
        if (!Intrinsics.c(annotation != null ? sha.x(sha.v(annotation)) : null, cls)) {
            return false;
        }
        if (list != null && list.isEmpty()) {
            return true;
        }
        for (Method method : list) {
            Object obj2 = map.get(method.getName());
            Object invoke = method.invoke(obj, null);
            if (obj2 instanceof boolean[]) {
                invoke.getClass();
                c = Arrays.equals((boolean[]) obj2, (boolean[]) invoke);
            } else if (obj2 instanceof char[]) {
                invoke.getClass();
                c = Arrays.equals((char[]) obj2, (char[]) invoke);
            } else if (obj2 instanceof byte[]) {
                invoke.getClass();
                c = Arrays.equals((byte[]) obj2, (byte[]) invoke);
            } else if (obj2 instanceof short[]) {
                invoke.getClass();
                c = Arrays.equals((short[]) obj2, (short[]) invoke);
            } else if (obj2 instanceof int[]) {
                invoke.getClass();
                c = Arrays.equals((int[]) obj2, (int[]) invoke);
            } else if (obj2 instanceof float[]) {
                invoke.getClass();
                c = Arrays.equals((float[]) obj2, (float[]) invoke);
            } else if (obj2 instanceof long[]) {
                invoke.getClass();
                c = Arrays.equals((long[]) obj2, (long[]) invoke);
            } else if (obj2 instanceof double[]) {
                invoke.getClass();
                c = Arrays.equals((double[]) obj2, (double[]) invoke);
            } else if (obj2 instanceof Object[]) {
                invoke.getClass();
                c = Arrays.equals((Object[]) obj2, (Object[]) invoke);
            } else {
                c = Intrinsics.c(obj2, invoke);
            }
            if (!c) {
                return false;
            }
        }
        return true;
    }

    private static final int createAnnotationInstance$lambda$2(joa joaVar) {
        return ((Number) joaVar.getValue()).intValue();
    }

    private static final String createAnnotationInstance$lambda$3(joa joaVar) {
        return (String) joaVar.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Object createAnnotationInstance$lambda$4(Class cls, Map map, joa joaVar, joa joaVar2, List list, Object obj, Method method, Object[] objArr) {
        cls.getClass();
        map.getClass();
        joaVar.getClass();
        joaVar2.getClass();
        list.getClass();
        String name = method.getName();
        if (name != null) {
            int hashCode = name.hashCode();
            if (hashCode != -1776922004) {
                if (hashCode != 147696667) {
                    if (hashCode == 1444986633 && name.equals("annotationType")) {
                        return cls;
                    }
                } else if (name.equals("hashCode")) {
                    return Integer.valueOf(createAnnotationInstance$lambda$2(joaVar2));
                }
            } else if (name.equals("toString")) {
                return createAnnotationInstance$lambda$3(joaVar);
            }
        }
        if (Intrinsics.c(name, "equals") && objArr != null && objArr.length == 1) {
            objArr.getClass();
            return Boolean.valueOf(createAnnotationInstance$equals(cls, list, map, ph0.Q(objArr)));
        }
        if (map.containsKey(name)) {
            return map.get(name);
        }
        StringBuilder sb = new StringBuilder("Method is not supported: ");
        sb.append(method);
        sb.append(" (args: ");
        if (objArr == null) {
            objArr = new Object[0];
        }
        sb.append(ph0.X(objArr));
        sb.append(')');
        throw new KotlinReflectionInternalError(sb.toString());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Void throwIllegalArgumentType(int i, String str, Class<?> cls) {
        KClass orCreateKotlinClass;
        fuf fufVar;
        String qualifiedName;
        if (Intrinsics.c(cls, Class.class)) {
            fufVar = duf.a;
            orCreateKotlinClass = fufVar.getOrCreateKotlinClass(KClass.class);
        } else if (cls.isArray() && Intrinsics.c(cls.getComponentType(), Class.class)) {
            fufVar = duf.a;
            orCreateKotlinClass = fufVar.getOrCreateKotlinClass(KClass[].class);
        } else {
            fuf fufVar2 = duf.a;
            orCreateKotlinClass = fufVar2.getOrCreateKotlinClass(cls);
            fufVar = fufVar2;
        }
        if (Intrinsics.c(orCreateKotlinClass.getQualifiedName(), fufVar.getOrCreateKotlinClass(Object[].class).getQualifiedName())) {
            StringBuilder sb = new StringBuilder();
            sb.append(orCreateKotlinClass.getQualifiedName());
            sb.append('<');
            Class<?> componentType = sha.x(orCreateKotlinClass).getComponentType();
            componentType.getClass();
            sb.append(sha.A(componentType).getQualifiedName());
            sb.append('>');
            qualifiedName = sb.toString();
        } else {
            qualifiedName = orCreateKotlinClass.getQualifiedName();
        }
        throw new IllegalArgumentException("Argument #" + i + ' ' + str + " is not of the required type " + qualifiedName);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Object transformKotlinToJvm(Object obj, Class<?> cls) {
        if (obj instanceof Class) {
            return null;
        }
        if (obj instanceof KClass) {
            obj = sha.x((KClass) obj);
        } else if (obj instanceof Object[]) {
            Object[] objArr = (Object[]) obj;
            if (objArr instanceof Class[]) {
                return null;
            }
            if (objArr instanceof KClass[]) {
                KClass[] kClassArr = (KClass[]) obj;
                ArrayList arrayList = new ArrayList(kClassArr.length);
                for (KClass kClass : kClassArr) {
                    arrayList.add(sha.x(kClass));
                }
                obj = arrayList.toArray(new Class[0]);
            } else {
                obj = objArr;
            }
        }
        if (cls.isInstance(obj)) {
            return obj;
        }
        return null;
    }
}
