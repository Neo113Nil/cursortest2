package androidx.datastore.preferences.protobuf;

/* renamed from: androidx.datastore.preferences.protobuf.v, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C2146v implements O {

    /* renamed from: a, reason: collision with root package name */
    public static final C2146v f19679a = new C2146v();

    public static C2146v a() {
        return f19679a;
    }

    @Override // androidx.datastore.preferences.protobuf.O
    public boolean isSupported(Class cls) {
        return AbstractC2147w.class.isAssignableFrom(cls);
    }

    @Override // androidx.datastore.preferences.protobuf.O
    public N messageInfoFor(Class cls) {
        if (!AbstractC2147w.class.isAssignableFrom(cls)) {
            throw new IllegalArgumentException("Unsupported message type: " + cls.getName());
        }
        try {
            return (N) AbstractC2147w.q(cls.asSubclass(AbstractC2147w.class)).f();
        } catch (Exception e10) {
            throw new RuntimeException("Unable to get message info for " + cls.getName(), e10);
        }
    }
}
