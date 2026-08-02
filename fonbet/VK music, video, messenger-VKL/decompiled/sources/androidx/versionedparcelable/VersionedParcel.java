package androidx.versionedparcelable;

import android.os.Parcelable;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import xsna.eor0;
import xsna.for0;
import xsna.fw3;
import xsna.zk3;

/* loaded from: classes12.dex */
public abstract class VersionedParcel {
    public final zk3<String, Method> a;
    public final zk3<String, Method> b;
    public final zk3<String, Class> c;

    public static class ParcelException extends RuntimeException {
    }

    public VersionedParcel(zk3<String, Method> zk3Var, zk3<String, Method> zk3Var2, zk3<String, Class> zk3Var3) {
        this.a = zk3Var;
        this.b = zk3Var2;
        this.c = zk3Var3;
    }

    public abstract eor0 a();

    public final Class b(Class<? extends for0> cls) throws ClassNotFoundException {
        String name = cls.getName();
        zk3<String, Class> zk3Var = this.c;
        Class cls2 = zk3Var.get(name);
        if (cls2 != null) {
            return cls2;
        }
        Class<?> cls3 = Class.forName(fw3.c(cls.getPackage().getName(), ".", cls.getSimpleName(), "Parcelizer"), false, cls.getClassLoader());
        zk3Var.put(cls.getName(), cls3);
        return cls3;
    }

    public final Method c(String str) throws IllegalAccessException, NoSuchMethodException, ClassNotFoundException {
        zk3<String, Method> zk3Var = this.a;
        Method method = zk3Var.get(str);
        if (method != null) {
            return method;
        }
        System.currentTimeMillis();
        Method declaredMethod = Class.forName(str, true, VersionedParcel.class.getClassLoader()).getDeclaredMethod("read", VersionedParcel.class);
        zk3Var.put(str, declaredMethod);
        return declaredMethod;
    }

    public final Method d(Class cls) throws IllegalAccessException, NoSuchMethodException, ClassNotFoundException {
        String name = cls.getName();
        zk3<String, Method> zk3Var = this.b;
        Method method = zk3Var.get(name);
        if (method != null) {
            return method;
        }
        Class b = b(cls);
        System.currentTimeMillis();
        Method declaredMethod = b.getDeclaredMethod("write", cls, VersionedParcel.class);
        zk3Var.put(cls.getName(), declaredMethod);
        return declaredMethod;
    }

    public abstract boolean e();

    public abstract byte[] f();

    public abstract CharSequence g();

    public abstract boolean h(int i);

    public abstract int i();

    public final int j(int i, int i2) {
        return !h(i2) ? i : i();
    }

    public abstract <T extends Parcelable> T k();

    public abstract String l();

    public final <T extends for0> T m() {
        String l = l();
        if (l == null) {
            return null;
        }
        try {
            return (T) c(l).invoke(null, a());
        } catch (ClassNotFoundException e) {
            throw new RuntimeException("VersionedParcel encountered ClassNotFoundException", e);
        } catch (IllegalAccessException e2) {
            throw new RuntimeException("VersionedParcel encountered IllegalAccessException", e2);
        } catch (NoSuchMethodException e3) {
            throw new RuntimeException("VersionedParcel encountered NoSuchMethodException", e3);
        } catch (InvocationTargetException e4) {
            if (e4.getCause() instanceof RuntimeException) {
                throw ((RuntimeException) e4.getCause());
            }
            throw new RuntimeException("VersionedParcel encountered InvocationTargetException", e4);
        }
    }

    public abstract void n(int i);

    public abstract void o(boolean z);

    public abstract void p(byte[] bArr);

    public abstract void q(CharSequence charSequence);

    public abstract void r(int i);

    public final void s(int i, int i2) {
        n(i2);
        r(i);
    }

    public abstract void t(Parcelable parcelable);

    public abstract void u(String str);

    /* JADX WARN: Multi-variable type inference failed */
    public final void v(for0 for0Var) {
        if (for0Var == null) {
            u(null);
            return;
        }
        try {
            u(b(for0Var.getClass()).getName());
            eor0 a = a();
            try {
                d(for0Var.getClass()).invoke(null, for0Var, a);
                a.w();
            } catch (ClassNotFoundException e) {
                throw new RuntimeException("VersionedParcel encountered ClassNotFoundException", e);
            } catch (IllegalAccessException e2) {
                throw new RuntimeException("VersionedParcel encountered IllegalAccessException", e2);
            } catch (NoSuchMethodException e3) {
                throw new RuntimeException("VersionedParcel encountered NoSuchMethodException", e3);
            } catch (InvocationTargetException e4) {
                if (!(e4.getCause() instanceof RuntimeException)) {
                    throw new RuntimeException("VersionedParcel encountered InvocationTargetException", e4);
                }
                throw ((RuntimeException) e4.getCause());
            }
        } catch (ClassNotFoundException e5) {
            throw new RuntimeException(for0Var.getClass().getSimpleName().concat(" does not have a Parcelizer"), e5);
        }
    }
}
