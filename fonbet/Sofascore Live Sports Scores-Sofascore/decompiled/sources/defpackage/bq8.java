package defpackage;

import android.os.Handler;
import android.os.Looper;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.s;
import java.util.Set;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public abstract class bq8 {
    public static final aq8 a = aq8.c;

    public static aq8 a(Fragment fragment) {
        while (fragment != null) {
            if (fragment.isAdded()) {
                fragment.getParentFragmentManager().getClass();
            }
            fragment = fragment.getParentFragment();
        }
        return a;
    }

    public static void b(aq8 aq8Var, wvk wvkVar) {
        Fragment fragment = wvkVar.a;
        String name = fragment.getClass().getName();
        Set set = aq8Var.a;
        set.contains(zp8.a);
        if (set.contains(zp8.b)) {
            yp8 yp8Var = new yp8(name, wvkVar);
            if (!fragment.isAdded()) {
                throw wvkVar;
            }
            Handler handler = fragment.getParentFragmentManager().x.c;
            if (Intrinsics.c(handler.getLooper(), Looper.myLooper())) {
                throw wvkVar;
            }
            handler.post(yp8Var);
        }
    }

    public static void c(wvk wvkVar) {
        if (s.O(3)) {
            wvkVar.a.getClass();
        }
    }

    public static final void d(Fragment fragment, String str) {
        fragment.getClass();
        str.getClass();
        pp8 pp8Var = new pp8(fragment, "Attempting to reuse fragment " + fragment + " with previous ID " + str);
        c(pp8Var);
        aq8 a2 = a(fragment);
        if (a2.a.contains(zp8.c) && e(a2, fragment.getClass(), pp8.class)) {
            b(a2, pp8Var);
        }
    }

    public static boolean e(aq8 aq8Var, Class cls, Class cls2) {
        Set set = (Set) aq8Var.b.get(cls.getName());
        if (set == null) {
            return true;
        }
        if (Intrinsics.c(cls2.getSuperclass(), wvk.class) || !CollectionsKt.R(set, cls2.getSuperclass())) {
            return !set.contains(cls2);
        }
        return false;
    }
}
