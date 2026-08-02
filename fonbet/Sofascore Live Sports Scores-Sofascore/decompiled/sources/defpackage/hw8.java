package defpackage;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.nio.charset.Charset;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public abstract class hw8 extends s5 {
    private static final int MEMOIZED_SERIALIZED_SIZE_MASK = Integer.MAX_VALUE;
    private static final int MUTABLE_FLAG_MASK = Integer.MIN_VALUE;
    static final int UNINITIALIZED_HASH_CODE = 0;
    static final int UNINITIALIZED_SERIALIZED_SIZE = Integer.MAX_VALUE;
    private static Map<Object, hw8> defaultInstanceMap = new ConcurrentHashMap();
    private int memoizedSerializedSize;
    protected xbk unknownFields;

    public hw8() {
        this.memoizedHashCode = 0;
        this.memoizedSerializedSize = -1;
        this.unknownFields = xbk.f;
    }

    public static hw8 d(Class cls) {
        hw8 hw8Var = defaultInstanceMap.get(cls);
        if (hw8Var == null) {
            try {
                Class.forName(cls.getName(), true, cls.getClassLoader());
                hw8Var = defaultInstanceMap.get(cls);
            } catch (ClassNotFoundException e) {
                sw9.m("Class initialization cannot fail.", e);
                return null;
            }
        }
        if (hw8Var != null) {
            return hw8Var;
        }
        try {
            hw8 hw8Var2 = (hw8) ((hw8) vck.a.allocateInstance(cls)).c(6);
            if (hw8Var2 != null) {
                defaultInstanceMap.put(cls, hw8Var2);
                return hw8Var2;
            }
            zzl.s();
            return null;
        } catch (InstantiationException e2) {
            yhk.q(e2);
            return null;
        }
    }

    public static Object e(Method method, hw8 hw8Var, Object... objArr) {
        try {
            return method.invoke(hw8Var, objArr);
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

    public static final boolean f(hw8 hw8Var, boolean z) {
        byte byteValue = ((Byte) hw8Var.c(1)).byteValue();
        if (byteValue == 1) {
            return true;
        }
        if (byteValue == 0) {
            return false;
        }
        kff kffVar = kff.c;
        kffVar.getClass();
        boolean c = kffVar.a(hw8Var.getClass()).c(hw8Var);
        if (z) {
            hw8Var.c(2);
        }
        return c;
    }

    public static void j(Class cls, hw8 hw8Var) {
        hw8Var.h();
        defaultInstanceMap.put(cls, hw8Var);
    }

    @Override // defpackage.s5
    public final int a(wsg wsgVar) {
        int g;
        int g2;
        if (g()) {
            if (wsgVar == null) {
                kff kffVar = kff.c;
                kffVar.getClass();
                g2 = kffVar.a(getClass()).g(this);
            } else {
                g2 = wsgVar.g(this);
            }
            if (g2 >= 0) {
                return g2;
            }
            a70.r(ljg.j(g2, "serialized size must be non-negative, was "));
            return 0;
        }
        int i = this.memoizedSerializedSize;
        if ((i & Integer.MAX_VALUE) != Integer.MAX_VALUE) {
            return i & Integer.MAX_VALUE;
        }
        if (wsgVar == null) {
            kff kffVar2 = kff.c;
            kffVar2.getClass();
            g = kffVar2.a(getClass()).g(this);
        } else {
            g = wsgVar.g(this);
        }
        k(g);
        return g;
    }

    @Override // defpackage.s5
    public final void b(h03 h03Var) {
        kff kffVar = kff.c;
        kffVar.getClass();
        wsg a = kffVar.a(getClass());
        t9d t9dVar = h03Var.a;
        if (t9dVar == null) {
            t9dVar = new t9d();
            Charset charset = w7a.a;
            t9dVar.a = h03Var;
            h03Var.a = t9dVar;
        }
        a.i(this, t9dVar);
    }

    public abstract Object c(int i);

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        kff kffVar = kff.c;
        kffVar.getClass();
        return kffVar.a(getClass()).e(this, (hw8) obj);
    }

    public final boolean g() {
        return (this.memoizedSerializedSize & Integer.MIN_VALUE) != 0;
    }

    public final void h() {
        this.memoizedSerializedSize &= Integer.MAX_VALUE;
    }

    public final int hashCode() {
        if (g()) {
            kff kffVar = kff.c;
            kffVar.getClass();
            return kffVar.a(getClass()).f(this);
        }
        int i = this.memoizedHashCode;
        if (i != 0) {
            return i;
        }
        kff kffVar2 = kff.c;
        kffVar2.getClass();
        int f = kffVar2.a(getClass()).f(this);
        this.memoizedHashCode = f;
        return f;
    }

    public final hw8 i() {
        return (hw8) c(4);
    }

    public final void k(int i) {
        if (i < 0) {
            a70.r(ljg.j(i, "serialized size must be non-negative, was "));
        } else {
            this.memoizedSerializedSize = (i & Integer.MAX_VALUE) | (this.memoizedSerializedSize & Integer.MIN_VALUE);
        }
    }

    public final String toString() {
        String obj = super.toString();
        char[] cArr = bhc.a;
        StringBuilder sb = new StringBuilder();
        sb.append("# ");
        sb.append(obj);
        bhc.c(this, sb, 0);
        return sb.toString();
    }
}
