package com.logrocket.protobuf;

import j$.util.concurrent.ConcurrentHashMap;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Map;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public abstract class z extends a {
    private static final int MEMOIZED_SERIALIZED_SIZE_MASK = Integer.MAX_VALUE;
    private static final int MUTABLE_FLAG_MASK = Integer.MIN_VALUE;
    static final int UNINITIALIZED_HASH_CODE = 0;
    static final int UNINITIALIZED_SERIALIZED_SIZE = Integer.MAX_VALUE;
    private static Map<Object, z> defaultInstanceMap = new ConcurrentHashMap();
    private int memoizedSerializedSize;
    protected o1 unknownFields;

    public z() {
        this.memoizedHashCode = 0;
        this.memoizedSerializedSize = -1;
        this.unknownFields = o1.f6767f;
    }

    public static z h(Class cls) {
        z zVar = defaultInstanceMap.get(cls);
        if (zVar == null) {
            try {
                Class.forName(cls.getName(), true, cls.getClassLoader());
                zVar = defaultInstanceMap.get(cls);
            } catch (ClassNotFoundException e7) {
                throw new IllegalStateException("Class initialization cannot fail.", e7);
            }
        }
        if (zVar != null) {
            return zVar;
        }
        z zVar2 = (z) ((z) x1.b(cls)).g(6);
        if (zVar2 == null) {
            throw new IllegalStateException();
        }
        defaultInstanceMap.put(cls, zVar2);
        return zVar2;
    }

    public static Object i(Method method, z zVar, Object... objArr) {
        try {
            return method.invoke(zVar, objArr);
        } catch (IllegalAccessException e7) {
            throw new RuntimeException("Couldn't use Java reflection to implement protocol message reflection.", e7);
        } catch (InvocationTargetException e9) {
            Throwable cause = e9.getCause();
            if (cause instanceof RuntimeException) {
                throw ((RuntimeException) cause);
            }
            if (cause instanceof Error) {
                throw ((Error) cause);
            }
            throw new RuntimeException("Unexpected exception thrown by generated accessor method.", cause);
        }
    }

    public static c0 m(c0 c0Var) {
        int size = c0Var.size();
        return c0Var.r(size == 0 ? 10 : size * 2);
    }

    public static void n(Class cls, z zVar) {
        zVar.l();
        defaultInstanceMap.put(cls, zVar);
    }

    @Override // com.logrocket.protobuf.a
    public final int b(g1 g1Var) {
        int h10;
        int h11;
        if (j()) {
            if (g1Var == null) {
                a1 a1Var = a1.f6664c;
                a1Var.getClass();
                h11 = a1Var.a(getClass()).h(this);
            } else {
                h11 = g1Var.h(this);
            }
            if (h11 >= 0) {
                return h11;
            }
            throw new IllegalStateException(androidx.appcompat.widget.c1.i(h11, "serialized size must be non-negative, was "));
        }
        int i5 = this.memoizedSerializedSize;
        if ((i5 & Integer.MAX_VALUE) != Integer.MAX_VALUE) {
            return i5 & Integer.MAX_VALUE;
        }
        if (g1Var == null) {
            a1 a1Var2 = a1.f6664c;
            a1Var2.getClass();
            h10 = a1Var2.a(getClass()).h(this);
        } else {
            h10 = g1Var.h(this);
        }
        o(h10);
        return h10;
    }

    @Override // com.logrocket.protobuf.a
    public final void e(p pVar) {
        a1 a1Var = a1.f6664c;
        a1Var.getClass();
        g1 a7 = a1Var.a(getClass());
        n0 n0Var = pVar.f6775c;
        if (n0Var == null) {
            n0Var = new n0(pVar);
        }
        a7.g(this, n0Var);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        a1 a1Var = a1.f6664c;
        a1Var.getClass();
        return a1Var.a(getClass()).e(this, (z) obj);
    }

    public final x f() {
        return (x) g(5);
    }

    public abstract Object g(int i5);

    public final int hashCode() {
        if (j()) {
            a1 a1Var = a1.f6664c;
            a1Var.getClass();
            return a1Var.a(getClass()).f(this);
        }
        if (this.memoizedHashCode == 0) {
            a1 a1Var2 = a1.f6664c;
            a1Var2.getClass();
            this.memoizedHashCode = a1Var2.a(getClass()).f(this);
        }
        return this.memoizedHashCode;
    }

    public final boolean j() {
        return (this.memoizedSerializedSize & Integer.MIN_VALUE) != 0;
    }

    public final void k() {
        a1 a1Var = a1.f6664c;
        a1Var.getClass();
        a1Var.a(getClass()).b(this);
        l();
    }

    public final void l() {
        this.memoizedSerializedSize &= Integer.MAX_VALUE;
    }

    public final void o(int i5) {
        if (i5 < 0) {
            throw new IllegalStateException(androidx.appcompat.widget.c1.i(i5, "serialized size must be non-negative, was "));
        }
        this.memoizedSerializedSize = (i5 & Integer.MAX_VALUE) | (this.memoizedSerializedSize & Integer.MIN_VALUE);
    }

    public final String toString() {
        String obj = super.toString();
        char[] cArr = t0.f6788a;
        StringBuilder sb2 = new StringBuilder();
        sb2.append("# ");
        sb2.append(obj);
        t0.c(this, sb2, 0);
        return sb2.toString();
    }
}
