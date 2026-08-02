package defpackage;

import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class bw2 {
    public static final bw2 c = new bw2();
    public final HashMap a = new HashMap();
    public final HashMap b = new HashMap();

    public static void b(HashMap hashMap, aw2 aw2Var, d6b d6bVar, Class cls) {
        d6b d6bVar2 = (d6b) hashMap.get(aw2Var);
        if (d6bVar2 == null || d6bVar == d6bVar2) {
            if (d6bVar2 == null) {
                hashMap.put(aw2Var, d6bVar);
            }
        } else {
            String name = aw2Var.b.getName();
            String name2 = cls.getName();
            a70.p(wt3.m(String.valueOf(d6bVar2), ", new value ", mz1.s("Method ", name, " in ", name2, " already declared with different @OnLifecycleEvent value: previous value "), String.valueOf(d6bVar)));
        }
    }

    public final zv2 a(Class cls, Method[] methodArr) {
        int i;
        Class superclass = cls.getSuperclass();
        HashMap hashMap = new HashMap();
        HashMap hashMap2 = this.a;
        if (superclass != null) {
            zv2 zv2Var = (zv2) hashMap2.get(superclass);
            if (zv2Var == null) {
                zv2Var = a(superclass, null);
            }
            hashMap.putAll(zv2Var.b);
        }
        for (Class<?> cls2 : cls.getInterfaces()) {
            zv2 zv2Var2 = (zv2) hashMap2.get(cls2);
            if (zv2Var2 == null) {
                zv2Var2 = a(cls2, null);
            }
            for (Map.Entry entry : zv2Var2.b.entrySet()) {
                b(hashMap, (aw2) entry.getKey(), (d6b) entry.getValue(), cls);
            }
        }
        if (methodArr == null) {
            try {
                methodArr = cls.getDeclaredMethods();
            } catch (NoClassDefFoundError e) {
                throw new IllegalArgumentException("The observer class has some methods that use newer APIs which are not available in the current OS version. Lifecycles cannot access even other methods so you should make sure that your observer classes only access framework classes that are available in your min API level OR use lifecycle:compiler annotation processor.", e);
            }
        }
        boolean z = false;
        for (Method method : methodArr) {
            eqd eqdVar = (eqd) method.getAnnotation(eqd.class);
            if (eqdVar != null) {
                Class<?>[] parameterTypes = method.getParameterTypes();
                if (parameterTypes.length <= 0) {
                    i = 0;
                } else {
                    if (!u6b.class.isAssignableFrom(parameterTypes[0])) {
                        a70.p("invalid parameter type. Must be one and instanceof LifecycleOwner");
                        return null;
                    }
                    i = 1;
                }
                d6b value = eqdVar.value();
                if (parameterTypes.length > 1) {
                    if (!d6b.class.isAssignableFrom(parameterTypes[1])) {
                        a70.p("invalid parameter type. second arg must be an event");
                        return null;
                    }
                    if (value != d6b.ON_ANY) {
                        a70.p("Second arg is supported only for ON_ANY value");
                        return null;
                    }
                    i = 2;
                }
                if (parameterTypes.length > 2) {
                    a70.p("cannot have more than 2 params");
                    return null;
                }
                b(hashMap, new aw2(method, i), value, cls);
                z = true;
            }
        }
        zv2 zv2Var3 = new zv2(hashMap);
        hashMap2.put(cls, zv2Var3);
        this.b.put(cls, Boolean.valueOf(z));
        return zv2Var3;
    }
}
