package androidx.fragment.app;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class b1 {

    /* renamed from: b, reason: collision with root package name */
    public static final s.n f1869b = new s.n(0);

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ j1 f1870a;

    public b1(j1 j1Var) {
        this.f1870a = j1Var;
    }

    public static Class b(ClassLoader classLoader, String str) {
        s.n nVar = f1869b;
        s.n nVar2 = (s.n) nVar.get(classLoader);
        if (nVar2 == null) {
            nVar2 = new s.n(0);
            nVar.put(classLoader, nVar2);
        }
        Class cls = (Class) nVar2.get(str);
        if (cls != null) {
            return cls;
        }
        Class<?> cls2 = Class.forName(str, false, classLoader);
        nVar2.put(str, cls2);
        return cls2;
    }

    public static Class c(ClassLoader classLoader, String str) {
        try {
            return b(classLoader, str);
        } catch (ClassCastException e7) {
            throw new i0(androidx.appcompat.widget.c1.n("Unable to instantiate fragment ", str, ": make sure class is a valid subclass of Fragment"), e7);
        } catch (ClassNotFoundException e9) {
            throw new i0(androidx.appcompat.widget.c1.n("Unable to instantiate fragment ", str, ": make sure class name exists"), e9);
        }
    }

    public final Fragment a(String str) {
        return Fragment.instantiate(this.f1870a.f1983w.f2087b, str, null);
    }
}
