package j$.util.stream;

/* loaded from: classes2.dex */
public abstract class k2 implements i2 {

    /* renamed from: a, reason: collision with root package name */
    public final i2 f17948a;

    /* renamed from: b, reason: collision with root package name */
    public final i2 f17949b;

    /* renamed from: c, reason: collision with root package name */
    public final long f17950c;

    @Override // j$.util.stream.i2
    public final int o() {
        return 2;
    }

    public k2(i2 i2Var, i2 i2Var2) {
        this.f17948a = i2Var;
        this.f17949b = i2Var2;
        this.f17950c = i2Var2.count() + i2Var.count();
    }

    @Override // j$.util.stream.i2
    public final i2 a(int i5) {
        if (i5 == 0) {
            return this.f17948a;
        }
        if (i5 == 1) {
            return this.f17949b;
        }
        throw new IndexOutOfBoundsException();
    }

    @Override // j$.util.stream.i2
    public final long count() {
        return this.f17950c;
    }

    @Override // j$.util.stream.i2
    public /* bridge */ /* synthetic */ h2 a(int i5) {
        return (h2) a(i5);
    }
}
