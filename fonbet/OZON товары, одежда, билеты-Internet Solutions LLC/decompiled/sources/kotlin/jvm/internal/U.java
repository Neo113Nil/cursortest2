package kotlin.jvm.internal;

import Sc.InterfaceC4003e;
import fd.InterfaceC6498a;
import fd.InterfaceC6499b;
import fd.InterfaceC6500c;
import fd.InterfaceC6501d;
import fd.InterfaceC6502e;
import fd.InterfaceC6503f;
import fd.InterfaceC6504g;
import fd.InterfaceC6505h;
import fd.InterfaceC6506i;
import fd.InterfaceC6507j;
import fd.InterfaceC6508k;
import fd.InterfaceC6509l;
import fd.InterfaceC6510m;
import fd.InterfaceC6511n;
import fd.InterfaceC6512o;
import gd.InterfaceC6712a;
import gd.InterfaceC6713b;
import gd.InterfaceC6714c;
import gd.InterfaceC6715d;
import gd.InterfaceC6716e;
import java.util.AbstractCollection;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* loaded from: classes.dex */
public final class U {
    public static Collection a(AbstractCollection abstractCollection) {
        if (!(abstractCollection instanceof InterfaceC6712a) || (abstractCollection instanceof InterfaceC6713b)) {
            return abstractCollection;
        }
        j(abstractCollection, "kotlin.collections.MutableCollection");
        throw null;
    }

    public static Iterable b(List list) {
        if ((list instanceof InterfaceC6712a) && !(list instanceof InterfaceC6713b)) {
            j(list, "kotlin.collections.MutableIterable");
            throw null;
        }
        try {
            return list;
        } catch (ClassCastException e11) {
            Intrinsics.k(e11, U.class.getName());
            throw e11;
        }
    }

    public static List c(Object obj) {
        if ((obj instanceof InterfaceC6712a) && !(obj instanceof InterfaceC6714c)) {
            j(obj, "kotlin.collections.MutableList");
            throw null;
        }
        try {
            return (List) obj;
        } catch (ClassCastException e11) {
            Intrinsics.k(e11, U.class.getName());
            throw e11;
        }
    }

    public static Map d(Object obj) {
        if ((obj instanceof InterfaceC6712a) && !(obj instanceof InterfaceC6715d)) {
            j(obj, "kotlin.collections.MutableMap");
            throw null;
        }
        try {
            return (Map) obj;
        } catch (ClassCastException e11) {
            Intrinsics.k(e11, U.class.getName());
            throw e11;
        }
    }

    public static Map.Entry e(Map.Entry entry) {
        if (!(entry instanceof InterfaceC6712a) || (entry instanceof InterfaceC6715d.a)) {
            return entry;
        }
        j(entry, "kotlin.collections.MutableMap.MutableEntry");
        throw null;
    }

    public static Set f(Object obj) {
        if ((obj instanceof InterfaceC6712a) && !(obj instanceof InterfaceC6716e)) {
            j(obj, "kotlin.collections.MutableSet");
            throw null;
        }
        try {
            return (Set) obj;
        } catch (ClassCastException e11) {
            Intrinsics.k(e11, U.class.getName());
            throw e11;
        }
    }

    public static Object g(int i11, Object obj) {
        if (obj == null || h(i11, obj)) {
            return obj;
        }
        j(obj, "kotlin.jvm.functions.Function" + i11);
        throw null;
    }

    public static boolean h(int i11, Object obj) {
        if (obj instanceof InterfaceC4003e) {
            if ((obj instanceof InterfaceC7733o ? ((InterfaceC7733o) obj).getArity() : obj instanceof Function0 ? 0 : obj instanceof Function1 ? 1 : obj instanceof Function2 ? 2 : obj instanceof InterfaceC6511n ? 3 : obj instanceof InterfaceC6512o ? 4 : obj instanceof fd.p ? 5 : obj instanceof fd.q ? 6 : obj instanceof fd.r ? 7 : obj instanceof fd.s ? 8 : obj instanceof fd.t ? 9 : obj instanceof InterfaceC6498a ? 10 : obj instanceof InterfaceC6499b ? 11 : obj instanceof InterfaceC6500c ? 12 : obj instanceof InterfaceC6501d ? 13 : obj instanceof InterfaceC6502e ? 14 : obj instanceof InterfaceC6503f ? 15 : obj instanceof InterfaceC6504g ? 16 : obj instanceof InterfaceC6505h ? 17 : obj instanceof InterfaceC6506i ? 18 : obj instanceof InterfaceC6507j ? 19 : obj instanceof InterfaceC6508k ? 20 : obj instanceof InterfaceC6509l ? 21 : obj instanceof InterfaceC6510m ? 22 : -1) == i11) {
                return true;
            }
        }
        return false;
    }

    public static boolean i(Object obj) {
        if (obj instanceof Map.Entry) {
            return !(obj instanceof InterfaceC6712a) || (obj instanceof InterfaceC6715d.a);
        }
        return false;
    }

    public static void j(Object obj, String str) {
        ClassCastException classCastException = new ClassCastException(G.g.c(obj == null ? "null" : obj.getClass().getName(), " cannot be cast to ", str));
        Intrinsics.k(classCastException, U.class.getName());
        throw classCastException;
    }
}
