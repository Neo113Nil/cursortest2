package androidx.datastore.preferences.protobuf;

/* renamed from: androidx.datastore.preferences.protobuf.n, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC2139n {

    /* renamed from: a, reason: collision with root package name */
    public static final Class f19541a = c();

    public static C2140o a() {
        C2140o b10 = b("getEmptyRegistry");
        return b10 != null ? b10 : C2140o.f19547c;
    }

    public static final C2140o b(String str) {
        Class cls = f19541a;
        if (cls == null) {
            return null;
        }
        try {
            return (C2140o) cls.getDeclaredMethod(str, null).invoke(null, null);
        } catch (Exception unused) {
            return null;
        }
    }

    public static Class c() {
        try {
            return Class.forName("androidx.datastore.preferences.protobuf.ExtensionRegistry");
        } catch (ClassNotFoundException unused) {
            return null;
        }
    }
}
