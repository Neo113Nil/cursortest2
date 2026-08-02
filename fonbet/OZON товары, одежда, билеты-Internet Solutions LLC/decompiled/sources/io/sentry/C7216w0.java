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
import java.util.Locale;
import java.util.Map;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicIntegerArray;
import org.jetbrains.annotations.NotNull;

/* renamed from: io.sentry.w0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C7216w0 {

    /* renamed from: a, reason: collision with root package name */
    private final HashSet f68652a = new HashSet();

    /* renamed from: b, reason: collision with root package name */
    private final int f68653b;

    C7216w0(int i11) {
        this.f68653b = i11;
    }

    @NotNull
    private HashMap a(@NotNull Map map, @NotNull ILogger iLogger) throws Exception {
        HashMap hashMap = new HashMap();
        for (Object obj : map.keySet()) {
            Object obj2 = map.get(obj);
            if (obj2 != null) {
                hashMap.put(obj.toString(), b(iLogger, obj2));
            } else {
                hashMap.put(obj.toString(), null);
            }
        }
        return hashMap;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v2, types: [java.util.HashMap] */
    /* JADX WARN: Type inference failed for: r3v3, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r3v4, types: [java.util.HashMap] */
    /* JADX WARN: Type inference failed for: r3v5, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r3v7, types: [java.util.ArrayList] */
    public final Object b(@NotNull ILogger iLogger, Object obj) throws Exception {
        Object c11;
        if (obj == null) {
            return null;
        }
        if (obj instanceof Character) {
            return obj.toString();
        }
        if ((obj instanceof Number) || (obj instanceof Boolean) || (obj instanceof String)) {
            return obj;
        }
        if (obj instanceof Locale) {
            return obj.toString();
        }
        if (obj instanceof AtomicIntegerArray) {
            return io.sentry.util.k.a((AtomicIntegerArray) obj);
        }
        if (obj instanceof AtomicBoolean) {
            return Boolean.valueOf(((AtomicBoolean) obj).get());
        }
        if (!(obj instanceof URI) && !(obj instanceof InetAddress) && !(obj instanceof UUID) && !(obj instanceof Currency)) {
            if (obj instanceof Calendar) {
                return io.sentry.util.k.c((Calendar) obj);
            }
            if (obj.getClass().isEnum()) {
                return obj.toString();
            }
            HashSet hashSet = this.f68652a;
            if (hashSet.contains(obj)) {
                iLogger.c(I2.INFO, "Cyclic reference detected. Calling toString() on object.", new Object[0]);
                return obj.toString();
            }
            hashSet.add(obj);
            try {
                if (hashSet.size() > this.f68653b) {
                    hashSet.remove(obj);
                    iLogger.c(I2.INFO, "Max depth exceeded. Calling toString() on object.", new Object[0]);
                    return obj.toString();
                }
                try {
                    if (obj.getClass().isArray()) {
                        c11 = new ArrayList();
                        for (Object obj2 : (Object[]) obj) {
                            c11.add(b(iLogger, obj2));
                        }
                    } else if (obj instanceof Collection) {
                        c11 = new ArrayList();
                        Iterator it = ((Collection) obj).iterator();
                        while (it.hasNext()) {
                            c11.add(b(iLogger, it.next()));
                        }
                    } else if (obj instanceof Map) {
                        c11 = a((Map) obj, iLogger);
                    } else {
                        c11 = c(iLogger, obj);
                        if (c11.isEmpty()) {
                            c11 = obj.toString();
                        }
                    }
                    hashSet.remove(obj);
                    return c11;
                } catch (Exception e11) {
                    iLogger.a(I2.INFO, "Not serializing object due to throwing sub-path.", e11);
                    hashSet.remove(obj);
                    return null;
                }
            } catch (Throwable th2) {
                hashSet.remove(obj);
                throw th2;
            }
        }
        return obj.toString();
    }

    @NotNull
    public final HashMap c(@NotNull ILogger iLogger, @NotNull Object obj) throws Exception {
        Field[] declaredFields = obj.getClass().getDeclaredFields();
        HashMap hashMap = new HashMap();
        for (Field field : declaredFields) {
            if (!Modifier.isTransient(field.getModifiers()) && !Modifier.isStatic(field.getModifiers())) {
                String name = field.getName();
                try {
                    field.setAccessible(true);
                    hashMap.put(name, b(iLogger, field.get(obj)));
                    field.setAccessible(false);
                } catch (Exception unused) {
                    iLogger.c(I2.INFO, B0.A0.b("Cannot access field ", name, "."), new Object[0]);
                }
            }
        }
        return hashMap;
    }
}
