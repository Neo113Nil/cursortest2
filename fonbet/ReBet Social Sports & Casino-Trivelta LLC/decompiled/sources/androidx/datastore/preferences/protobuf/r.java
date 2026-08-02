package androidx.datastore.preferences.protobuf;

/* loaded from: classes.dex */
public abstract class r {

    /* renamed from: a, reason: collision with root package name */
    public static final AbstractC2141p f19576a = new C2142q();

    /* renamed from: b, reason: collision with root package name */
    public static final AbstractC2141p f19577b = c();

    public static AbstractC2141p a() {
        AbstractC2141p abstractC2141p = f19577b;
        if (abstractC2141p != null) {
            return abstractC2141p;
        }
        throw new IllegalStateException("Protobuf runtime is not correctly loaded.");
    }

    public static AbstractC2141p b() {
        return f19576a;
    }

    public static AbstractC2141p c() {
        if (b0.f19462d) {
            return null;
        }
        try {
            return (AbstractC2141p) Class.forName("androidx.datastore.preferences.protobuf.ExtensionSchemaFull").getDeclaredConstructor(null).newInstance(null);
        } catch (Exception unused) {
            return null;
        }
    }
}
