package androidx.datastore.preferences.protobuf;

/* loaded from: classes.dex */
public abstract class F {

    /* renamed from: a, reason: collision with root package name */
    public static final D f19421a = c();

    /* renamed from: b, reason: collision with root package name */
    public static final D f19422b = new E();

    public static D a() {
        return f19421a;
    }

    public static D b() {
        return f19422b;
    }

    public static D c() {
        if (b0.f19462d) {
            return null;
        }
        try {
            return (D) Class.forName("androidx.datastore.preferences.protobuf.ListFieldSchemaFull").getDeclaredConstructor(null).newInstance(null);
        } catch (Exception unused) {
            return null;
        }
    }
}
