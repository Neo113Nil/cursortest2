package androidx.datastore.preferences.protobuf;

/* loaded from: classes.dex */
public abstract class X {

    /* renamed from: a, reason: collision with root package name */
    public static final V f19455a = c();

    /* renamed from: b, reason: collision with root package name */
    public static final V f19456b = new W();

    public static V a() {
        return f19455a;
    }

    public static V b() {
        return f19456b;
    }

    public static V c() {
        if (b0.f19462d) {
            return null;
        }
        try {
            return (V) Class.forName("androidx.datastore.preferences.protobuf.NewInstanceSchemaFull").getDeclaredConstructor(null).newInstance(null);
        } catch (Exception unused) {
            return null;
        }
    }
}
