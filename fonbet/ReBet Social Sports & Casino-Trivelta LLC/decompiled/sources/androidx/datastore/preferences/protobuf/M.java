package androidx.datastore.preferences.protobuf;

/* loaded from: classes.dex */
public abstract class M {

    /* renamed from: a, reason: collision with root package name */
    public static final K f19434a = c();

    /* renamed from: b, reason: collision with root package name */
    public static final K f19435b = new L();

    public static K a() {
        return f19434a;
    }

    public static K b() {
        return f19435b;
    }

    public static K c() {
        if (b0.f19462d) {
            return null;
        }
        try {
            return (K) Class.forName("androidx.datastore.preferences.protobuf.MapFieldSchemaFull").getDeclaredConstructor(null).newInstance(null);
        } catch (Exception unused) {
            return null;
        }
    }
}
