package Qb;

/* loaded from: classes3.dex */
public enum a {
    L(1),
    M(0),
    Q(3),
    H(2);

    private static final a[] FOR_BITS;

    /* renamed from: a, reason: collision with root package name */
    public final int f9604a;

    static {
        a aVar = L;
        a aVar2 = M;
        a aVar3 = Q;
        FOR_BITS = new a[]{aVar2, aVar, H, aVar3};
    }

    a(int i10) {
        this.f9604a = i10;
    }

    public int a() {
        return this.f9604a;
    }
}
