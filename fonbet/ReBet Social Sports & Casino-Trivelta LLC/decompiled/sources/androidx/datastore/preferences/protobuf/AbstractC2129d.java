package androidx.datastore.preferences.protobuf;

/* renamed from: androidx.datastore.preferences.protobuf.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC2129d {

    /* renamed from: a, reason: collision with root package name */
    public static boolean f19468a;

    /* renamed from: b, reason: collision with root package name */
    public static final Class f19469b = a("libcore.io.Memory");

    /* renamed from: c, reason: collision with root package name */
    public static final boolean f19470c;

    static {
        f19470c = (f19468a || a("org.robolectric.Robolectric") == null) ? false : true;
    }

    public static Class a(String str) {
        try {
            return Class.forName(str);
        } catch (Throwable unused) {
            return null;
        }
    }

    public static Class b() {
        return f19469b;
    }

    public static boolean c() {
        if (f19468a) {
            return true;
        }
        return (f19469b == null || f19470c) ? false : true;
    }
}
