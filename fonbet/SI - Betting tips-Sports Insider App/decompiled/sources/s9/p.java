package s9;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class p implements e0 {

    /* renamed from: b, reason: collision with root package name */
    public static final p f23365b = new p(0);

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f23366a;

    public /* synthetic */ p(int i5) {
        this.f23366a = i5;
    }

    @Override // s9.e0
    public final m0 a(Class cls) {
        switch (this.f23366a) {
            case 0:
                if (!r.class.isAssignableFrom(cls)) {
                    throw new IllegalArgumentException("Unsupported message type: ".concat(cls.getName()));
                }
                try {
                    return (m0) r.b(cls.asSubclass(r.class)).a(3);
                } catch (Exception e7) {
                    throw new RuntimeException("Unable to get message info for ".concat(cls.getName()), e7);
                }
            default:
                throw new IllegalStateException("This should never be called.");
        }
    }

    @Override // s9.e0
    public final boolean b(Class cls) {
        switch (this.f23366a) {
            case 0:
                return r.class.isAssignableFrom(cls);
            default:
                return false;
        }
    }
}
