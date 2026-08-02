package defpackage;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public abstract class gw8 extends r5 {
    private static final int MEMOIZED_SERIALIZED_SIZE_MASK = Integer.MAX_VALUE;
    private static final int MUTABLE_FLAG_MASK = Integer.MIN_VALUE;
    static final int UNINITIALIZED_HASH_CODE = 0;
    static final int UNINITIALIZED_SERIALIZED_SIZE = Integer.MAX_VALUE;
    private static Map<Object, gw8> defaultInstanceMap = new ConcurrentHashMap();
    private int memoizedSerializedSize;
    protected wbk unknownFields;

    public gw8() {
        this.memoizedHashCode = 0;
        this.memoizedSerializedSize = -1;
        this.unknownFields = wbk.f;
    }

    public static gw8 c(Class cls) {
        gw8 gw8Var = defaultInstanceMap.get(cls);
        if (gw8Var == null) {
            try {
                Class.forName(cls.getName(), true, cls.getClassLoader());
                gw8Var = defaultInstanceMap.get(cls);
            } catch (ClassNotFoundException e) {
                sw9.m("Class initialization cannot fail.", e);
                return null;
            }
        }
        if (gw8Var != null) {
            return gw8Var;
        }
        try {
            gw8 gw8Var2 = (gw8) ((gw8) tck.a.allocateInstance(cls)).b(6);
            if (gw8Var2 != null) {
                defaultInstanceMap.put(cls, gw8Var2);
                return gw8Var2;
            }
            zzl.s();
            return null;
        } catch (InstantiationException e2) {
            yhk.q(e2);
            return null;
        }
    }

    public static Object d(Method method, gw8 gw8Var, Object... objArr) {
        try {
            return method.invoke(gw8Var, objArr);
        } catch (IllegalAccessException e) {
            vp2.e("Couldn't use Java reflection to implement protocol message reflection.", e);
            return null;
        } catch (InvocationTargetException e2) {
            Throwable cause = e2.getCause();
            if (cause instanceof RuntimeException) {
                throw ((RuntimeException) cause);
            }
            if (cause instanceof Error) {
                throw ((Error) cause);
            }
            vp2.e("Unexpected exception thrown by generated accessor method.", cause);
            return null;
        }
    }

    public static final boolean e(gw8 gw8Var, boolean z) {
        byte byteValue = ((Byte) gw8Var.b(1)).byteValue();
        if (byteValue == 1) {
            return true;
        }
        if (byteValue == 0) {
            return false;
        }
        hff hffVar = hff.c;
        hffVar.getClass();
        boolean c = hffVar.a(gw8Var.getClass()).c(gw8Var);
        if (z) {
            gw8Var.b(2);
        }
        return c;
    }

    public static void i(Class cls, gw8 gw8Var) {
        gw8Var.g();
        defaultInstanceMap.put(cls, gw8Var);
    }

    @Override // defpackage.r5
    public final int a(usg usgVar) {
        int h;
        int h2;
        if (f()) {
            if (usgVar == null) {
                hff hffVar = hff.c;
                hffVar.getClass();
                h2 = hffVar.a(getClass()).h(this);
            } else {
                h2 = usgVar.h(this);
            }
            if (h2 >= 0) {
                return h2;
            }
            a70.r(ljg.j(h2, "serialized size must be non-negative, was "));
            return 0;
        }
        int i = this.memoizedSerializedSize;
        if ((i & Integer.MAX_VALUE) != Integer.MAX_VALUE) {
            return i & Integer.MAX_VALUE;
        }
        if (usgVar == null) {
            hff hffVar2 = hff.c;
            hffVar2.getClass();
            h = hffVar2.a(getClass()).h(this);
        } else {
            h = usgVar.h(this);
        }
        j(h);
        return h;
    }

    public abstract Object b(int i);

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        hff hffVar = hff.c;
        hffVar.getClass();
        return hffVar.a(getClass()).g(this, (gw8) obj);
    }

    public final boolean f() {
        return (this.memoizedSerializedSize & Integer.MIN_VALUE) != 0;
    }

    public final void g() {
        this.memoizedSerializedSize &= Integer.MAX_VALUE;
    }

    public final gw8 h() {
        return (gw8) b(4);
    }

    public final int hashCode() {
        if (f()) {
            hff hffVar = hff.c;
            hffVar.getClass();
            return hffVar.a(getClass()).i(this);
        }
        int i = this.memoizedHashCode;
        if (i != 0) {
            return i;
        }
        hff hffVar2 = hff.c;
        hffVar2.getClass();
        int i2 = hffVar2.a(getClass()).i(this);
        this.memoizedHashCode = i2;
        return i2;
    }

    public final void j(int i) {
        if (i < 0) {
            a70.r(ljg.j(i, "serialized size must be non-negative, was "));
        } else {
            this.memoizedSerializedSize = (i & Integer.MAX_VALUE) | (this.memoizedSerializedSize & Integer.MIN_VALUE);
        }
    }

    public final String toString() {
        String obj = super.toString();
        char[] cArr = ahc.a;
        StringBuilder sb = new StringBuilder();
        sb.append("# ");
        sb.append(obj);
        ahc.c(this, sb, 0);
        return sb.toString();
    }
}
