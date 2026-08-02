package com.facebook.common.references;

import java.util.IdentityHashMap;
import xsna.zag0;

/* loaded from: classes12.dex */
public final class SharedReference<T> {
    public static final IdentityHashMap d = new IdentityHashMap();
    public T a;
    public int b;
    public final zag0<T> c;

    public static class NullReferenceException extends RuntimeException {
        public NullReferenceException() {
            super("Null shared reference");
        }
    }

    public SharedReference(T t, zag0<T> zag0Var, boolean z) {
        t.getClass();
        this.a = t;
        this.c = zag0Var;
        this.b = 1;
        if (z) {
            IdentityHashMap identityHashMap = d;
            synchronized (identityHashMap) {
                try {
                    Integer num = (Integer) identityHashMap.get(t);
                    if (num == null) {
                        identityHashMap.put(t, 1);
                    } else {
                        identityHashMap.put(t, Integer.valueOf(num.intValue() + 1));
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    public final synchronized T a() {
        return this.a;
    }
}
