package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public abstract class kok {
    public final dh0 a;
    public final dh0 b;
    public final dh0 c;

    public kok(dh0 dh0Var, dh0 dh0Var2, dh0 dh0Var3) {
        this.a = dh0Var;
        this.b = dh0Var2;
        this.c = dh0Var3;
    }

    public abstract lok a();

    public final Class b(Class cls) {
        String name = cls.getName();
        dh0 dh0Var = this.c;
        Class cls2 = (Class) dh0Var.get(name);
        if (cls2 != null) {
            return cls2;
        }
        Class<?> cls3 = Class.forName(dmi.r(cls.getPackage().getName(), ".", cls.getSimpleName(), "Parcelizer"), false, cls.getClassLoader());
        dh0Var.put(cls.getName(), cls3);
        return cls3;
    }

    public final Method c(String str) {
        dh0 dh0Var = this.a;
        Method method = (Method) dh0Var.get(str);
        if (method != null) {
            return method;
        }
        System.currentTimeMillis();
        Method declaredMethod = Class.forName(str, true, kok.class.getClassLoader()).getDeclaredMethod("read", kok.class);
        dh0Var.put(str, declaredMethod);
        return declaredMethod;
    }

    public final Method d(Class cls) {
        String name = cls.getName();
        dh0 dh0Var = this.b;
        Method method = (Method) dh0Var.get(name);
        if (method != null) {
            return method;
        }
        Class b = b(cls);
        System.currentTimeMillis();
        Method declaredMethod = b.getDeclaredMethod("write", cls, kok.class);
        dh0Var.put(cls.getName(), declaredMethod);
        return declaredMethod;
    }

    public abstract boolean e(int i);

    public final int f(int i, int i2) {
        return !e(i2) ? i : ((lok) this).e.readInt();
    }

    public final Parcelable g(Parcelable parcelable, int i) {
        if (!e(i)) {
            return parcelable;
        }
        return ((lok) this).e.readParcelable(lok.class.getClassLoader());
    }

    public final mok h() {
        String readString = ((lok) this).e.readString();
        if (readString == null) {
            return null;
        }
        try {
            return (mok) c(readString).invoke(null, a());
        } catch (ClassNotFoundException e) {
            vp2.e("VersionedParcel encountered ClassNotFoundException", e);
            return null;
        } catch (IllegalAccessException e2) {
            vp2.e("VersionedParcel encountered IllegalAccessException", e2);
            return null;
        } catch (NoSuchMethodException e3) {
            vp2.e("VersionedParcel encountered NoSuchMethodException", e3);
            return null;
        } catch (InvocationTargetException e4) {
            if (e4.getCause() instanceof RuntimeException) {
                throw ((RuntimeException) e4.getCause());
            }
            vp2.e("VersionedParcel encountered InvocationTargetException", e4);
            return null;
        }
    }

    public abstract void i(int i);

    public final void j(int i, int i2) {
        i(i2);
        ((lok) this).e.writeInt(i);
    }

    public final void k(Parcelable parcelable, int i) {
        i(i);
        ((lok) this).e.writeParcelable(parcelable, 0);
    }

    public final void l(mok mokVar) {
        if (mokVar == null) {
            ((lok) this).e.writeString(null);
            return;
        }
        try {
            ((lok) this).e.writeString(b(mokVar.getClass()).getName());
            lok a = a();
            try {
                d(mokVar.getClass()).invoke(null, mokVar, a);
                Parcel parcel = a.e;
                int i = a.i;
                if (i >= 0) {
                    int i2 = a.d.get(i);
                    int dataPosition = parcel.dataPosition();
                    parcel.setDataPosition(i2);
                    parcel.writeInt(dataPosition - i2);
                    parcel.setDataPosition(dataPosition);
                }
            } catch (ClassNotFoundException e) {
                vp2.e("VersionedParcel encountered ClassNotFoundException", e);
            } catch (IllegalAccessException e2) {
                vp2.e("VersionedParcel encountered IllegalAccessException", e2);
            } catch (NoSuchMethodException e3) {
                vp2.e("VersionedParcel encountered NoSuchMethodException", e3);
            } catch (InvocationTargetException e4) {
                if (e4.getCause() instanceof RuntimeException) {
                    throw ((RuntimeException) e4.getCause());
                }
                vp2.e("VersionedParcel encountered InvocationTargetException", e4);
            }
        } catch (ClassNotFoundException e5) {
            vp2.e(mokVar.getClass().getSimpleName().concat(" does not have a Parcelizer"), e5);
        }
    }
}
