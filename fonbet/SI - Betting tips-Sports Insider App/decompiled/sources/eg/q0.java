package eg;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes3.dex */
public final class q0 implements b1 {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f9212a;

    public q0(boolean z5) {
        this.f9212a = z5;
    }

    @Override // eg.b1
    public final boolean c() {
        return this.f9212a;
    }

    @Override // eg.b1
    public final o1 d() {
        return null;
    }

    public final String toString() {
        return d9.e.k(new StringBuilder("Empty{"), this.f9212a ? "Active" : "New", '}');
    }
}
