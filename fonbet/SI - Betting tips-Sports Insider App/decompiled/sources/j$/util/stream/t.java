package j$.util.stream;

/* loaded from: classes2.dex */
public final class t extends a0 {

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ int f18079s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ t(b bVar, int i5, int i10) {
        super(bVar, i5);
        this.f18079s = i10;
    }

    @Override // j$.util.stream.b
    public final n5 O0(int i5, n5 n5Var) {
        switch (this.f18079s) {
            case 0:
                return new r(this, n5Var, 1);
            case 1:
                return n5Var;
            case 2:
                return new r(this, n5Var, 4);
            case 3:
                return new x0(1, n5Var);
            case 4:
                return new v0(this, n5Var, 4);
            case 5:
                return new e1(n5Var);
            default:
                return new d1(this, n5Var, 3);
        }
    }
}
