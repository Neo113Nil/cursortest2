package androidx.datastore.preferences.protobuf;

import j$.util.concurrent.ConcurrentHashMap;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Map;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public abstract class y extends a {
    private static final int MEMOIZED_SERIALIZED_SIZE_MASK = Integer.MAX_VALUE;
    private static final int MUTABLE_FLAG_MASK = Integer.MIN_VALUE;
    static final int UNINITIALIZED_HASH_CODE = 0;
    static final int UNINITIALIZED_SERIALIZED_SIZE = Integer.MAX_VALUE;
    private static Map<Object, y> defaultInstanceMap = new ConcurrentHashMap();
    private int memoizedSerializedSize;
    protected e1 unknownFields;

    public y() {
        this.memoizedHashCode = 0;
        this.memoizedSerializedSize = -1;
        this.unknownFields = e1.f1603f;
    }

    public static y d(Class cls) {
        y yVar = defaultInstanceMap.get(cls);
        if (yVar == null) {
            try {
                Class.forName(cls.getName(), true, cls.getClassLoader());
                yVar = defaultInstanceMap.get(cls);
            } catch (ClassNotFoundException e7) {
                throw new IllegalStateException("Class initialization cannot fail.", e7);
            }
        }
        if (yVar != null) {
            return yVar;
        }
        y yVar2 = (y) ((y) k1.d(cls)).c(6);
        if (yVar2 == null) {
            throw new IllegalStateException();
        }
        defaultInstanceMap.put(cls, yVar2);
        return yVar2;
    }

    public static Object e(Method method, y yVar, Object... objArr) {
        try {
            return method.invoke(yVar, objArr);
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

    public static final boolean f(y yVar, boolean z5) {
        byte byteValue = ((Byte) yVar.c(1)).byteValue();
        if (byteValue == 1) {
            return true;
        }
        if (byteValue == 0) {
            return false;
        }
        u0 u0Var = u0.f1715c;
        u0Var.getClass();
        boolean c2 = u0Var.a(yVar.getClass()).c(yVar);
        if (z5) {
            yVar.c(2);
        }
        return c2;
    }

    public static void j(Class cls, y yVar) {
        yVar.h();
        defaultInstanceMap.put(cls, yVar);
    }

    @Override // androidx.datastore.preferences.protobuf.a
    public final int a(x0 x0Var) {
        int f6;
        int f10;
        if (g()) {
            if (x0Var == null) {
                u0 u0Var = u0.f1715c;
                u0Var.getClass();
                f10 = u0Var.a(getClass()).f(this);
            } else {
                f10 = x0Var.f(this);
            }
            if (f10 >= 0) {
                return f10;
            }
            throw new IllegalStateException(androidx.appcompat.widget.c1.i(f10, "serialized size must be non-negative, was "));
        }
        int i5 = this.memoizedSerializedSize;
        if ((i5 & Integer.MAX_VALUE) != Integer.MAX_VALUE) {
            return i5 & Integer.MAX_VALUE;
        }
        if (x0Var == null) {
            u0 u0Var2 = u0.f1715c;
            u0Var2.getClass();
            f6 = u0Var2.a(getClass()).f(this);
        } else {
            f6 = x0Var.f(this);
        }
        k(f6);
        return f6;
    }

    @Override // androidx.datastore.preferences.protobuf.a
    public final void b(o oVar) {
        u0 u0Var = u0.f1715c;
        u0Var.getClass();
        x0 a7 = u0Var.a(getClass());
        h0 h0Var = oVar.f1662a;
        if (h0Var == null) {
            h0Var = new h0(oVar);
        }
        a7.e(this, h0Var);
    }

    public abstract Object c(int i5);

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        u0 u0Var = u0.f1715c;
        u0Var.getClass();
        return u0Var.a(getClass()).h(this, (y) obj);
    }

    public final boolean g() {
        return (this.memoizedSerializedSize & Integer.MIN_VALUE) != 0;
    }

    public final void h() {
        this.memoizedSerializedSize &= Integer.MAX_VALUE;
    }

    public final int hashCode() {
        if (g()) {
            u0 u0Var = u0.f1715c;
            u0Var.getClass();
            return u0Var.a(getClass()).g(this);
        }
        if (this.memoizedHashCode == 0) {
            u0 u0Var2 = u0.f1715c;
            u0Var2.getClass();
            this.memoizedHashCode = u0Var2.a(getClass()).g(this);
        }
        return this.memoizedHashCode;
    }

    public final y i() {
        return (y) c(4);
    }

    public final void k(int i5) {
        if (i5 < 0) {
            throw new IllegalStateException(androidx.appcompat.widget.c1.i(i5, "serialized size must be non-negative, was "));
        }
        this.memoizedSerializedSize = (i5 & Integer.MAX_VALUE) | (this.memoizedSerializedSize & Integer.MIN_VALUE);
    }

    public final String toString() {
        String obj = super.toString();
        char[] cArr = o0.f1667a;
        StringBuilder sb2 = new StringBuilder();
        sb2.append("# ");
        sb2.append(obj);
        o0.c(this, sb2, 0);
        return sb2.toString();
    }
}
