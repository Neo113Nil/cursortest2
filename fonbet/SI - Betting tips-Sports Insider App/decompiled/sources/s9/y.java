package s9;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class y implements e0 {

    /* renamed from: a, reason: collision with root package name */
    public e0[] f23389a;

    @Override // s9.e0
    public final m0 a(Class cls) {
        for (e0 e0Var : this.f23389a) {
            if (e0Var.b(cls)) {
                return e0Var.a(cls);
            }
        }
        throw new UnsupportedOperationException("No factory is available for message type: ".concat(cls.getName()));
    }

    @Override // s9.e0
    public final boolean b(Class cls) {
        for (e0 e0Var : this.f23389a) {
            if (e0Var.b(cls)) {
                return true;
            }
        }
        return false;
    }
}
