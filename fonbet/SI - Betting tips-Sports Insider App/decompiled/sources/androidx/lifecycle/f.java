package androidx.lifecycle;

import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class f {

    /* renamed from: c, reason: collision with root package name */
    public static final f f2159c = new f();

    /* renamed from: a, reason: collision with root package name */
    public final HashMap f2160a = new HashMap();

    /* renamed from: b, reason: collision with root package name */
    public final HashMap f2161b = new HashMap();

    public static void b(HashMap hashMap, e eVar, w wVar, Class cls) {
        w wVar2 = (w) hashMap.get(eVar);
        if (wVar2 == null || wVar == wVar2) {
            if (wVar2 == null) {
                hashMap.put(eVar, wVar);
                return;
            }
            return;
        }
        throw new IllegalArgumentException("Method " + eVar.f2154b.getName() + " in " + cls.getName() + " already declared with different @OnLifecycleEvent value: previous value " + wVar2 + ", new value " + wVar);
    }

    public final d a(Class cls, Method[] methodArr) {
        int i5;
        Class superclass = cls.getSuperclass();
        HashMap hashMap = new HashMap();
        HashMap hashMap2 = this.f2160a;
        if (superclass != null) {
            d dVar = (d) hashMap2.get(superclass);
            if (dVar == null) {
                dVar = a(superclass, null);
            }
            hashMap.putAll(dVar.f2148b);
        }
        for (Class<?> cls2 : cls.getInterfaces()) {
            d dVar2 = (d) hashMap2.get(cls2);
            if (dVar2 == null) {
                dVar2 = a(cls2, null);
            }
            for (Map.Entry entry : dVar2.f2148b.entrySet()) {
                b(hashMap, (e) entry.getKey(), (w) entry.getValue(), cls);
            }
        }
        if (methodArr == null) {
            try {
                methodArr = cls.getDeclaredMethods();
            } catch (NoClassDefFoundError e7) {
                throw new IllegalArgumentException("The observer class has some methods that use newer APIs which are not available in the current OS version. Lifecycles cannot access even other methods so you should make sure that your observer classes only access framework classes that are available in your min API level OR use lifecycle:compiler annotation processor.", e7);
            }
        }
        boolean z5 = false;
        for (Method method : methodArr) {
            r0 r0Var = (r0) method.getAnnotation(r0.class);
            if (r0Var != null) {
                Class<?>[] parameterTypes = method.getParameterTypes();
                if (parameterTypes.length <= 0) {
                    i5 = 0;
                } else {
                    if (!e0.class.isAssignableFrom(parameterTypes[0])) {
                        throw new IllegalArgumentException("invalid parameter type. Must be one and instanceof LifecycleOwner");
                    }
                    i5 = 1;
                }
                w value = r0Var.value();
                if (parameterTypes.length > 1) {
                    if (!w.class.isAssignableFrom(parameterTypes[1])) {
                        throw new IllegalArgumentException("invalid parameter type. second arg must be an event");
                    }
                    if (value != w.ON_ANY) {
                        throw new IllegalArgumentException("Second arg is supported only for ON_ANY value");
                    }
                    i5 = 2;
                }
                if (parameterTypes.length > 2) {
                    throw new IllegalArgumentException("cannot have more than 2 params");
                }
                b(hashMap, new e(i5, method), value, cls);
                z5 = true;
            }
        }
        d dVar3 = new d(hashMap);
        hashMap2.put(cls, dVar3);
        this.f2161b.put(cls, Boolean.valueOf(z5));
        return dVar3;
    }
}
