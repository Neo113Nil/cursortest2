package io.sentry;

import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.net.InetAddress;
import java.net.URI;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collection;
import java.util.Currency;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicIntegerArray;

/* loaded from: classes3.dex */
public final class F0 {

    /* renamed from: a, reason: collision with root package name */
    public Set f50313a;

    /* renamed from: b, reason: collision with root package name */
    public final int f50314b;

    public F0(int i10) {
        this.f50314b = i10;
    }

    public final Set a() {
        if (this.f50313a == null) {
            this.f50313a = new HashSet();
        }
        return this.f50313a;
    }

    public final List b(Collection collection, ILogger iLogger) {
        ArrayList arrayList = new ArrayList();
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            arrayList.add(e(it.next(), iLogger));
        }
        return arrayList;
    }

    public final List c(Object[] objArr, ILogger iLogger) {
        ArrayList arrayList = new ArrayList();
        for (Object obj : objArr) {
            arrayList.add(e(obj, iLogger));
        }
        return arrayList;
    }

    public final Map d(Map map, ILogger iLogger) {
        HashMap hashMap = new HashMap();
        for (Object obj : map.keySet()) {
            Object obj2 = map.get(obj);
            if (obj2 != null) {
                hashMap.put(obj.toString(), e(obj2, iLogger));
            } else {
                hashMap.put(obj.toString(), null);
            }
        }
        return hashMap;
    }

    public Object e(Object obj, ILogger iLogger) {
        Object obj2;
        if (obj == null) {
            return null;
        }
        if (obj instanceof Character) {
            return obj.toString();
        }
        if (obj instanceof Number) {
            return obj;
        }
        if (obj instanceof Boolean) {
            return obj;
        }
        if (obj instanceof String) {
            return obj;
        }
        if (obj instanceof Locale) {
            return obj.toString();
        }
        if (obj instanceof AtomicIntegerArray) {
            return io.sentry.util.o.a((AtomicIntegerArray) obj);
        }
        if (obj instanceof AtomicBoolean) {
            return Boolean.valueOf(((AtomicBoolean) obj).get());
        }
        if (obj instanceof URI) {
            return obj.toString();
        }
        if (obj instanceof InetAddress) {
            return obj.toString();
        }
        if (obj instanceof UUID) {
            return obj.toString();
        }
        if (obj instanceof Currency) {
            return obj.toString();
        }
        if (obj instanceof Calendar) {
            return io.sentry.util.o.d((Calendar) obj);
        }
        if (obj.getClass().isEnum()) {
            return obj.toString();
        }
        Set a10 = a();
        if (a10.contains(obj)) {
            iLogger.c(EnumC4788n3.INFO, "Cyclic reference detected. Calling toString() on object.", new Object[0]);
            return obj.toString();
        }
        a10.add(obj);
        try {
            if (a10.size() > this.f50314b) {
                a10.remove(obj);
                iLogger.c(EnumC4788n3.INFO, "Max depth exceeded. Calling toString() on object.", new Object[0]);
                return obj.toString();
            }
            try {
                if (obj.getClass().isArray()) {
                    obj2 = c((Object[]) obj, iLogger);
                } else if (obj instanceof Collection) {
                    obj2 = b((Collection) obj, iLogger);
                } else if (obj instanceof Map) {
                    obj2 = d((Map) obj, iLogger);
                } else {
                    Map f10 = f(obj, iLogger);
                    obj2 = f10.isEmpty() ? obj.toString() : f10;
                }
                a10.remove(obj);
                return obj2;
            } catch (Exception e10) {
                iLogger.b(EnumC4788n3.INFO, "Not serializing object due to throwing sub-path.", e10);
                a10.remove(obj);
                return null;
            }
        } catch (Throwable th2) {
            a10.remove(obj);
            throw th2;
        }
    }

    public Map f(Object obj, ILogger iLogger) {
        Field[] declaredFields = obj.getClass().getDeclaredFields();
        HashMap hashMap = new HashMap();
        for (Field field : declaredFields) {
            if (!Modifier.isTransient(field.getModifiers()) && !Modifier.isStatic(field.getModifiers())) {
                String name = field.getName();
                try {
                    field.setAccessible(true);
                    hashMap.put(name, e(field.get(obj), iLogger));
                    field.setAccessible(false);
                } catch (Exception unused) {
                    iLogger.c(EnumC4788n3.INFO, "Cannot access field " + name + ".", new Object[0]);
                }
            }
        }
        return hashMap;
    }
}
