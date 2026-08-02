package j$.util.stream;

/* loaded from: classes2.dex */
public final class u extends b1 {

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ int f18095s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ u(b bVar, int i5, int i10) {
        super(bVar, i5);
        this.f18095s = i10;
    }

    @Override // j$.util.stream.b
    public final n5 O0(int i5, n5 n5Var) {
        switch (this.f18095s) {
            case 0:
                return new r(this, n5Var, 2);
            case 1:
                return new v0(this, n5Var, 2);
            case 2:
                return n5Var;
            case 3:
                return new v0(this, n5Var, 5);
            default:
                return new d1(this, n5Var, 2);
        }
    }
}
