package com.google.common.collect;

import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.lang.reflect.Field;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;

/* loaded from: classes3.dex */
public abstract class f0 {

    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        public final Field f36816a;

        public void a(Object obj, int i10) {
            try {
                this.f36816a.set(obj, Integer.valueOf(i10));
            } catch (IllegalAccessException e10) {
                throw new AssertionError(e10);
            }
        }

        public void b(Object obj, Object obj2) {
            try {
                this.f36816a.set(obj, obj2);
            } catch (IllegalAccessException e10) {
                throw new AssertionError(e10);
            }
        }

        public b(Field field) {
            this.f36816a = field;
            field.setAccessible(true);
        }
    }

    public static b a(Class cls, String str) {
        try {
            return new b(cls.getDeclaredField(str));
        } catch (NoSuchFieldException e10) {
            throw new AssertionError(e10);
        }
    }

    public static void b(O o10, ObjectInputStream objectInputStream, int i10) {
        for (int i11 = 0; i11 < i10; i11++) {
            Collection collection = o10.get(objectInputStream.readObject());
            int readInt = objectInputStream.readInt();
            for (int i12 = 0; i12 < readInt; i12++) {
                collection.add(objectInputStream.readObject());
            }
        }
    }

    public static int c(ObjectInputStream objectInputStream) {
        return objectInputStream.readInt();
    }

    public static void d(O o10, ObjectOutputStream objectOutputStream) {
        objectOutputStream.writeInt(o10.asMap().size());
        for (Map.Entry entry : o10.asMap().entrySet()) {
            objectOutputStream.writeObject(entry.getKey());
            objectOutputStream.writeInt(((Collection) entry.getValue()).size());
            Iterator it = ((Collection) entry.getValue()).iterator();
            while (it.hasNext()) {
                objectOutputStream.writeObject(it.next());
            }
        }
    }
}
