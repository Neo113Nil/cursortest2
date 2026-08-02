package od;

import Sc.InterfaceC4008j;
import ed.C6345a;
import java.lang.annotation.Annotation;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import kotlin.collections.C7705l;
import kotlin.jvm.internal.Intrinsics;
import nd.V0;

/* loaded from: classes.dex */
final class d implements InvocationHandler {

    /* renamed from: a, reason: collision with root package name */
    private final Class f78038a;

    /* renamed from: b, reason: collision with root package name */
    private final Map f78039b;

    /* renamed from: c, reason: collision with root package name */
    private final InterfaceC4008j f78040c;

    /* renamed from: d, reason: collision with root package name */
    private final InterfaceC4008j f78041d;

    /* renamed from: e, reason: collision with root package name */
    private final List f78042e;

    public d(Class cls, Map map, InterfaceC4008j interfaceC4008j, InterfaceC4008j interfaceC4008j2, List list) {
        this.f78038a = cls;
        this.f78039b = map;
        this.f78040c = interfaceC4008j;
        this.f78041d = interfaceC4008j2;
        this.f78042e = list;
    }

    @Override // java.lang.reflect.InvocationHandler
    public final Object invoke(Object obj, Method method, Object[] objArr) {
        boolean d11;
        boolean z11;
        String name = method.getName();
        Class cls = this.f78038a;
        if (name != null) {
            int hashCode = name.hashCode();
            if (hashCode != -1776922004) {
                if (hashCode != 147696667) {
                    if (hashCode == 1444986633 && name.equals("annotationType")) {
                        return cls;
                    }
                } else if (name.equals("hashCode")) {
                    return Integer.valueOf(((Number) this.f78041d.getValue()).intValue());
                }
            } else if (name.equals("toString")) {
                return (String) this.f78040c.getValue();
            }
        }
        boolean d12 = Intrinsics.d(name, "equals");
        Map map = this.f78039b;
        boolean z12 = false;
        if (!d12 || objArr == null || objArr.length != 1) {
            if (map.containsKey(name)) {
                return map.get(name);
            }
            StringBuilder sb2 = new StringBuilder("Method is not supported: ");
            sb2.append(method);
            sb2.append(" (args: ");
            if (objArr == null) {
                objArr = new Object[0];
            }
            sb2.append(C7705l.f0(objArr));
            sb2.append(')');
            throw new V0(sb2.toString());
        }
        Object Y11 = C7705l.Y(objArr);
        Annotation annotation = Y11 instanceof Annotation ? (Annotation) Y11 : null;
        if (Intrinsics.d(annotation != null ? C6345a.b(C6345a.a(annotation)) : null, cls)) {
            List<Method> list = this.f78042e;
            if (!(list instanceof Collection) || !list.isEmpty()) {
                for (Method method2 : list) {
                    Object obj2 = map.get(method2.getName());
                    Object invoke = method2.invoke(Y11, new Object[0]);
                    if (obj2 instanceof boolean[]) {
                        Intrinsics.g(invoke, "null cannot be cast to non-null type kotlin.BooleanArray");
                        d11 = Arrays.equals((boolean[]) obj2, (boolean[]) invoke);
                    } else if (obj2 instanceof char[]) {
                        Intrinsics.g(invoke, "null cannot be cast to non-null type kotlin.CharArray");
                        d11 = Arrays.equals((char[]) obj2, (char[]) invoke);
                    } else if (obj2 instanceof byte[]) {
                        Intrinsics.g(invoke, "null cannot be cast to non-null type kotlin.ByteArray");
                        d11 = Arrays.equals((byte[]) obj2, (byte[]) invoke);
                    } else if (obj2 instanceof short[]) {
                        Intrinsics.g(invoke, "null cannot be cast to non-null type kotlin.ShortArray");
                        d11 = Arrays.equals((short[]) obj2, (short[]) invoke);
                    } else if (obj2 instanceof int[]) {
                        Intrinsics.g(invoke, "null cannot be cast to non-null type kotlin.IntArray");
                        d11 = Arrays.equals((int[]) obj2, (int[]) invoke);
                    } else if (obj2 instanceof float[]) {
                        Intrinsics.g(invoke, "null cannot be cast to non-null type kotlin.FloatArray");
                        d11 = Arrays.equals((float[]) obj2, (float[]) invoke);
                    } else if (obj2 instanceof long[]) {
                        Intrinsics.g(invoke, "null cannot be cast to non-null type kotlin.LongArray");
                        d11 = Arrays.equals((long[]) obj2, (long[]) invoke);
                    } else if (obj2 instanceof double[]) {
                        Intrinsics.g(invoke, "null cannot be cast to non-null type kotlin.DoubleArray");
                        d11 = Arrays.equals((double[]) obj2, (double[]) invoke);
                    } else if (obj2 instanceof Object[]) {
                        Intrinsics.g(invoke, "null cannot be cast to non-null type kotlin.Array<*>");
                        d11 = Arrays.equals((Object[]) obj2, (Object[]) invoke);
                    } else {
                        d11 = Intrinsics.d(obj2, invoke);
                    }
                    if (!d11) {
                        z11 = false;
                        break;
                    }
                }
            }
            z11 = true;
            if (z11) {
                z12 = true;
            }
        }
        return Boolean.valueOf(z12);
    }
}
