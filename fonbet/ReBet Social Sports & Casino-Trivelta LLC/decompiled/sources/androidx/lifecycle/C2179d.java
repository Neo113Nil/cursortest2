package androidx.lifecycle;

import androidx.lifecycle.AbstractC2185j;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* renamed from: androidx.lifecycle.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2179d {

    /* renamed from: c, reason: collision with root package name */
    public static C2179d f20376c = new C2179d();

    /* renamed from: a, reason: collision with root package name */
    public final Map f20377a = new HashMap();

    /* renamed from: b, reason: collision with root package name */
    public final Map f20378b = new HashMap();

    /* renamed from: androidx.lifecycle.d$a */
    public static class a {

        /* renamed from: a, reason: collision with root package name */
        public final Map f20379a = new HashMap();

        /* renamed from: b, reason: collision with root package name */
        public final Map f20380b;

        public a(Map map) {
            this.f20380b = map;
            for (Map.Entry entry : map.entrySet()) {
                AbstractC2185j.a aVar = (AbstractC2185j.a) entry.getValue();
                List list = (List) this.f20379a.get(aVar);
                if (list == null) {
                    list = new ArrayList();
                    this.f20379a.put(aVar, list);
                }
                list.add((b) entry.getKey());
            }
        }

        public static void b(List list, InterfaceC2193s interfaceC2193s, AbstractC2185j.a aVar, Object obj) {
            if (list != null) {
                for (int size = list.size() - 1; size >= 0; size--) {
                    ((b) list.get(size)).a(interfaceC2193s, aVar, obj);
                }
            }
        }

        public void a(InterfaceC2193s interfaceC2193s, AbstractC2185j.a aVar, Object obj) {
            b((List) this.f20379a.get(aVar), interfaceC2193s, aVar, obj);
            b((List) this.f20379a.get(AbstractC2185j.a.ON_ANY), interfaceC2193s, aVar, obj);
        }
    }

    /* renamed from: androidx.lifecycle.d$b */
    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        public final int f20381a;

        /* renamed from: b, reason: collision with root package name */
        public final Method f20382b;

        public b(int i10, Method method) {
            this.f20381a = i10;
            this.f20382b = method;
            method.setAccessible(true);
        }

        public void a(InterfaceC2193s interfaceC2193s, AbstractC2185j.a aVar, Object obj) {
            try {
                int i10 = this.f20381a;
                if (i10 == 0) {
                    this.f20382b.invoke(obj, null);
                } else if (i10 == 1) {
                    this.f20382b.invoke(obj, interfaceC2193s);
                } else {
                    if (i10 != 2) {
                        return;
                    }
                    this.f20382b.invoke(obj, interfaceC2193s, aVar);
                }
            } catch (IllegalAccessException e10) {
                throw new RuntimeException(e10);
            } catch (InvocationTargetException e11) {
                throw new RuntimeException("Failed to call observer method", e11.getCause());
            }
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return this.f20381a == bVar.f20381a && this.f20382b.getName().equals(bVar.f20382b.getName());
        }

        public int hashCode() {
            return (this.f20381a * 31) + this.f20382b.getName().hashCode();
        }
    }

    public final a a(Class cls, Method[] methodArr) {
        int i10;
        a c10;
        Class superclass = cls.getSuperclass();
        HashMap hashMap = new HashMap();
        if (superclass != null && (c10 = c(superclass)) != null) {
            hashMap.putAll(c10.f20380b);
        }
        for (Class<?> cls2 : cls.getInterfaces()) {
            for (Map.Entry entry : c(cls2).f20380b.entrySet()) {
                e(hashMap, (b) entry.getKey(), (AbstractC2185j.a) entry.getValue(), cls);
            }
        }
        if (methodArr == null) {
            methodArr = b(cls);
        }
        boolean z10 = false;
        for (Method method : methodArr) {
            D d10 = (D) method.getAnnotation(D.class);
            if (d10 != null) {
                Class<?>[] parameterTypes = method.getParameterTypes();
                if (parameterTypes.length <= 0) {
                    i10 = 0;
                } else {
                    if (!InterfaceC2193s.class.isAssignableFrom(parameterTypes[0])) {
                        throw new IllegalArgumentException("invalid parameter type. Must be one and instanceof LifecycleOwner");
                    }
                    i10 = 1;
                }
                AbstractC2185j.a value = d10.value();
                if (parameterTypes.length > 1) {
                    if (!AbstractC2185j.a.class.isAssignableFrom(parameterTypes[1])) {
                        throw new IllegalArgumentException("invalid parameter type. second arg must be an event");
                    }
                    if (value != AbstractC2185j.a.ON_ANY) {
                        throw new IllegalArgumentException("Second arg is supported only for ON_ANY value");
                    }
                    i10 = 2;
                }
                if (parameterTypes.length > 2) {
                    throw new IllegalArgumentException("cannot have more than 2 params");
                }
                e(hashMap, new b(i10, method), value, cls);
                z10 = true;
            }
        }
        a aVar = new a(hashMap);
        this.f20377a.put(cls, aVar);
        this.f20378b.put(cls, Boolean.valueOf(z10));
        return aVar;
    }

    public final Method[] b(Class cls) {
        try {
            return cls.getDeclaredMethods();
        } catch (NoClassDefFoundError e10) {
            throw new IllegalArgumentException("The observer class has some methods that use newer APIs which are not available in the current OS version. Lifecycles cannot access even other methods so you should make sure that your observer classes only access framework classes that are available in your min API level OR use lifecycle:compiler annotation processor.", e10);
        }
    }

    public a c(Class cls) {
        a aVar = (a) this.f20377a.get(cls);
        return aVar != null ? aVar : a(cls, null);
    }

    public boolean d(Class cls) {
        Boolean bool = (Boolean) this.f20378b.get(cls);
        if (bool != null) {
            return bool.booleanValue();
        }
        Method[] b10 = b(cls);
        for (Method method : b10) {
            if (((D) method.getAnnotation(D.class)) != null) {
                a(cls, b10);
                return true;
            }
        }
        this.f20378b.put(cls, Boolean.FALSE);
        return false;
    }

    public final void e(Map map, b bVar, AbstractC2185j.a aVar, Class cls) {
        AbstractC2185j.a aVar2 = (AbstractC2185j.a) map.get(bVar);
        if (aVar2 == null || aVar == aVar2) {
            if (aVar2 == null) {
                map.put(bVar, aVar);
                return;
            }
            return;
        }
        throw new IllegalArgumentException("Method " + bVar.f20382b.getName() + " in " + cls.getName() + " already declared with different @OnLifecycleEvent value: previous value " + aVar2 + ", new value " + aVar);
    }
}
