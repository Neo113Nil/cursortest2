package defpackage;

import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes7.dex */
public class i5k {
    public static Collection a(Object obj) {
        if ((obj instanceof eia) && !(obj instanceof fia)) {
            h(obj, "kotlin.collections.MutableCollection");
            throw null;
        }
        try {
            return (Collection) obj;
        } catch (ClassCastException e) {
            Intrinsics.f(e, i5k.class.getName());
            throw e;
        }
    }

    public static List b(Object obj) {
        if ((obj instanceof eia) && !(obj instanceof gia)) {
            h(obj, "kotlin.collections.MutableList");
            throw null;
        }
        try {
            return (List) obj;
        } catch (ClassCastException e) {
            Intrinsics.f(e, i5k.class.getName());
            throw e;
        }
    }

    public static Map c(Object obj) {
        if ((obj instanceof eia) && !(obj instanceof iia)) {
            h(obj, "kotlin.collections.MutableMap");
            throw null;
        }
        try {
            return (Map) obj;
        } catch (ClassCastException e) {
            Intrinsics.f(e, i5k.class.getName());
            throw e;
        }
    }

    public static Set d(Object obj) {
        if ((obj instanceof eia) && !(obj instanceof jia)) {
            h(obj, "kotlin.collections.MutableSet");
            throw null;
        }
        try {
            return (Set) obj;
        } catch (ClassCastException e) {
            Intrinsics.f(e, i5k.class.getName());
            throw e;
        }
    }

    public static void e(int i, Object obj) {
        if (obj == null || f(i, obj)) {
            return;
        }
        h(obj, "kotlin.jvm.functions.Function" + i);
        throw null;
    }

    public static boolean f(int i, Object obj) {
        if (obj instanceof dt8) {
            if ((obj instanceof mt8 ? ((mt8) obj).getArity() : obj instanceof Function0 ? 0 : obj instanceof Function1 ? 1 : obj instanceof Function2 ? 2 : obj instanceof ct8 ? 3 : obj instanceof et8 ? 4 : obj instanceof ft8 ? 5 : obj instanceof gt8 ? 6 : obj instanceof ht8 ? 7 : obj instanceof it8 ? 8 : obj instanceof jt8 ? 9 : obj instanceof ns8 ? 10 : obj instanceof os8 ? 11 : obj instanceof ps8 ? 12 : obj instanceof qs8 ? 13 : obj instanceof rs8 ? 14 : obj instanceof ss8 ? 15 : obj instanceof ts8 ? 16 : obj instanceof us8 ? 17 : obj instanceof vs8 ? 18 : obj instanceof ws8 ? 19 : obj instanceof ys8 ? 20 : obj instanceof zs8 ? 21 : obj instanceof at8 ? 22 : -1) == i) {
                return true;
            }
        }
        return false;
    }

    public static boolean g(Object obj) {
        if (obj instanceof List) {
            return !(obj instanceof eia) || (obj instanceof gia);
        }
        return false;
    }

    public static void h(Object obj, String str) {
        ClassCastException classCastException = new ClassCastException(lnb.o(obj == null ? "null" : obj.getClass().getName(), " cannot be cast to ", str));
        Intrinsics.f(classCastException, i5k.class.getName());
        throw classCastException;
    }
}
