package s9;

import j$.util.concurrent.ConcurrentHashMap;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public abstract class r extends a {

    /* renamed from: d, reason: collision with root package name */
    public static final ConcurrentHashMap f23372d = new ConcurrentHashMap();

    /* renamed from: b, reason: collision with root package name */
    public int f23373b;

    /* renamed from: c, reason: collision with root package name */
    public q0 f23374c;

    public r() {
        this.f23280a = 0;
        this.f23373b = -1;
        this.f23374c = q0.f23367e;
    }

    public static r b(Class cls) {
        ConcurrentHashMap concurrentHashMap = f23372d;
        r rVar = (r) concurrentHashMap.get(cls);
        if (rVar == null) {
            try {
                Class.forName(cls.getName(), true, cls.getClassLoader());
                rVar = (r) concurrentHashMap.get(cls);
            } catch (ClassNotFoundException e7) {
                throw new IllegalStateException("Class initialization cannot fail.", e7);
            }
        }
        if (rVar != null) {
            return rVar;
        }
        r rVar2 = (r) ((r) w0.d(cls)).a(6);
        if (rVar2 == null) {
            throw new IllegalStateException();
        }
        concurrentHashMap.put(cls, rVar2);
        return rVar2;
    }

    public static Object c(Method method, r rVar, Object... objArr) {
        try {
            return method.invoke(rVar, objArr);
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

    public abstract Object a(int i5);

    public final boolean d() {
        return (this.f23373b & Integer.MIN_VALUE) != 0;
    }

    public final r e() {
        return (r) a(4);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        k0 k0Var = k0.f23346c;
        k0Var.getClass();
        return k0Var.a(getClass()).e(this, (r) obj);
    }

    public final int hashCode() {
        if (d()) {
            k0 k0Var = k0.f23346c;
            k0Var.getClass();
            return k0Var.a(getClass()).g(this);
        }
        if (this.f23280a == 0) {
            k0 k0Var2 = k0.f23346c;
            k0Var2.getClass();
            this.f23280a = k0Var2.a(getClass()).g(this);
        }
        return this.f23280a;
    }

    public final String toString() {
        String obj = super.toString();
        char[] cArr = f0.f23306a;
        StringBuilder sb2 = new StringBuilder();
        sb2.append("# ");
        sb2.append(obj);
        f0.c(this, sb2, 0);
        return sb2.toString();
    }
}
