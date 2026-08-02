package androidx.datastore.preferences.protobuf;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class g0 implements n0 {

    /* renamed from: a, reason: collision with root package name */
    public n0[] f1613a;

    @Override // androidx.datastore.preferences.protobuf.n0
    public final w0 a(Class cls) {
        for (n0 n0Var : this.f1613a) {
            if (n0Var.b(cls)) {
                return n0Var.a(cls);
            }
        }
        throw new UnsupportedOperationException("No factory is available for message type: ".concat(cls.getName()));
    }

    @Override // androidx.datastore.preferences.protobuf.n0
    public final boolean b(Class cls) {
        for (n0 n0Var : this.f1613a) {
            if (n0Var.b(cls)) {
                return true;
            }
        }
        return false;
    }
}
