package androidx.datastore.preferences.protobuf;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class v implements n0 {

    /* renamed from: b, reason: collision with root package name */
    public static final v f1718b = new v(0);

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1719a;

    public /* synthetic */ v(int i5) {
        this.f1719a = i5;
    }

    @Override // androidx.datastore.preferences.protobuf.n0
    public final w0 a(Class cls) {
        switch (this.f1719a) {
            case 0:
                if (!y.class.isAssignableFrom(cls)) {
                    throw new IllegalArgumentException("Unsupported message type: ".concat(cls.getName()));
                }
                try {
                    return (w0) y.d(cls.asSubclass(y.class)).c(3);
                } catch (Exception e7) {
                    throw new RuntimeException("Unable to get message info for ".concat(cls.getName()), e7);
                }
            default:
                throw new IllegalStateException("This should never be called.");
        }
    }

    @Override // androidx.datastore.preferences.protobuf.n0
    public final boolean b(Class cls) {
        switch (this.f1719a) {
            case 0:
                return y.class.isAssignableFrom(cls);
            default:
                return false;
        }
    }
}
