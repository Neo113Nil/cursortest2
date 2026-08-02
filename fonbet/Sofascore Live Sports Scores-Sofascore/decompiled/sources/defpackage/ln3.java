package defpackage;

import java.lang.reflect.Constructor;
import java.lang.reflect.Modifier;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.Collection;
import java.util.EnumMap;
import java.util.EnumSet;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.Set;
import java.util.SortedMap;
import java.util.SortedSet;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.ConcurrentNavigableMap;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class ln3 {
    public final Map a;
    public final boolean b;
    public final List c;

    public ln3(Map map, boolean z, List list) {
        this.a = map;
        this.b = z;
        this.c = list;
    }

    public static String a(Class cls) {
        int modifiers = cls.getModifiers();
        if (Modifier.isInterface(modifiers)) {
            return "Interfaces can't be instantiated! Register an InstanceCreator or a TypeAdapter for this type. Interface name: ".concat(cls.getName());
        }
        if (Modifier.isAbstract(modifiers)) {
            return "Abstract classes can't be instantiated! Register an InstanceCreator or a TypeAdapter for this type. Class name: ".concat(cls.getName());
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x007e A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:16:0x007f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final pjd b(u5k u5kVar) {
        String str;
        pjd f79Var;
        Type type = u5kVar.b;
        Class cls = u5kVar.a;
        Map map = this.a;
        pjd pjdVar = null;
        if (map.get(type) != null) {
            pvd.j();
            return null;
        }
        if (map.get(cls) != null) {
            pvd.j();
            return null;
        }
        int i = 15;
        pjd sz8Var = EnumSet.class.isAssignableFrom(cls) ? new sz8(type, i) : cls == EnumMap.class ? new va3(type) : null;
        if (sz8Var != null) {
            return sz8Var;
        }
        sha.w(this.c);
        if (!Modifier.isAbstract(cls.getModifiers())) {
            try {
                Constructor declaredConstructor = cls.getDeclaredConstructor(null);
                vha vhaVar = iuf.a;
                try {
                    declaredConstructor.setAccessible(true);
                    str = null;
                } catch (Exception e) {
                    str = "Failed making constructor '" + iuf.b(declaredConstructor) + "' accessible; either increase its visibility or write a custom InstanceCreator or TypeAdapter for its declaring type: " + e.getMessage();
                }
                f79Var = str != null ? new f79(str, 1, false) : new j0l(declaredConstructor, i);
            } catch (NoSuchMethodException unused) {
            }
            if (f79Var == null) {
                return f79Var;
            }
            int i2 = 19;
            if (Collection.class.isAssignableFrom(cls)) {
                pjdVar = SortedSet.class.isAssignableFrom(cls) ? new f7a(i2) : Set.class.isAssignableFrom(cls) ? new inb(i2) : Queue.class.isAssignableFrom(cls) ? new uic(i2) : new zic(i2);
            } else if (Map.class.isAssignableFrom(cls)) {
                pjdVar = ConcurrentNavigableMap.class.isAssignableFrom(cls) ? new uxf(i2) : ConcurrentMap.class.isAssignableFrom(cls) ? new wxf(i2) : SortedMap.class.isAssignableFrom(cls) ? new p4h(i2) : (!(type instanceof ParameterizedType) || String.class.isAssignableFrom(new u5k(((ParameterizedType) type).getActualTypeArguments()[0]).a)) ? new rik(i2) : new f8h(i2);
            }
            if (pjdVar != null) {
                return pjdVar;
            }
            String a = a(cls);
            if (a != null) {
                return new k02(a);
            }
            if (this.b) {
                return new j0l(cls, 14);
            }
            return new kn3("Unable to create instance of " + cls + "; usage of JDK Unsafe is disabled. Registering an InstanceCreator or a TypeAdapter for this type, adding a no-args constructor, or enabling usage of JDK Unsafe may fix this problem.");
        }
        f79Var = null;
        if (f79Var == null) {
        }
    }

    public final String toString() {
        return this.a.toString();
    }
}
