package androidx.fragment.app;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import xsna.dpj0;
import xsna.zr;

/* compiled from: FragmentFactory.java */
/* loaded from: classes.dex */
public class f {
    public static final dpj0<ClassLoader, dpj0<String, Class<?>>> a = new dpj0<>();

    @NonNull
    public static Class<?> b(@NonNull ClassLoader classLoader, @NonNull String str) throws ClassNotFoundException {
        dpj0<ClassLoader, dpj0<String, Class<?>>> dpj0Var = a;
        dpj0<String, Class<?>> dpj0Var2 = dpj0Var.get(classLoader);
        if (dpj0Var2 == null) {
            dpj0Var2 = new dpj0<>();
            dpj0Var.put(classLoader, dpj0Var2);
        }
        Class<?> cls = dpj0Var2.get(str);
        if (cls != null) {
            return cls;
        }
        Class<?> cls2 = Class.forName(str, false, classLoader);
        dpj0Var2.put(str, cls2);
        return cls2;
    }

    @NonNull
    public static Class<? extends Fragment> c(@NonNull ClassLoader classLoader, @NonNull String str) {
        try {
            return b(classLoader, str);
        } catch (ClassCastException e) {
            throw new Fragment.InstantiationException(zr.a("Unable to instantiate fragment ", str, ": make sure class is a valid subclass of Fragment"), e);
        } catch (ClassNotFoundException e2) {
            throw new Fragment.InstantiationException(zr.a("Unable to instantiate fragment ", str, ": make sure class name exists"), e2);
        }
    }

    @NonNull
    public Fragment a(@NonNull String str) {
        throw null;
    }
}
