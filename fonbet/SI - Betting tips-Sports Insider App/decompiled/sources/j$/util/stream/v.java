package j$.util.stream;

/* loaded from: classes2.dex */
public final class v extends j1 {

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ int f18104s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ v(b bVar, int i5, int i10) {
        super(bVar, i5);
        this.f18104s = i10;
    }

    @Override // j$.util.stream.b
    public final n5 O0(int i5, n5 n5Var) {
        switch (this.f18104s) {
            case 0:
                return new r(this, n5Var, 3);
            case 1:
                return new x0(0, n5Var);
            case 2:
                return new v0(this, n5Var, 3);
            case 3:
                return new d1(this, n5Var, 1);
            case 4:
                return n5Var;
            default:
                return new d1(this, n5Var, 4);
        }
    }
}
