package a2;

import H1.C1176i;
import H1.F;

/* renamed from: a2.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1909a extends C1176i implements InterfaceC1915g {

    /* renamed from: h, reason: collision with root package name */
    public final long f14984h;

    /* renamed from: i, reason: collision with root package name */
    public final int f14985i;

    /* renamed from: j, reason: collision with root package name */
    public final int f14986j;

    /* renamed from: k, reason: collision with root package name */
    public final boolean f14987k;

    /* renamed from: l, reason: collision with root package name */
    public final long f14988l;

    public C1909a(long j10, long j11, F.a aVar, boolean z10) {
        this(j10, j11, aVar.f4331f, aVar.f4328c, z10);
    }

    @Override // a2.InterfaceC1915g
    public long b(long j10) {
        return c(j10);
    }

    @Override // a2.InterfaceC1915g
    public long d() {
        return this.f14984h;
    }

    public C1909a g(long j10) {
        return new C1909a(j10, this.f14984h, this.f14985i, this.f14986j, this.f14987k);
    }

    @Override // a2.InterfaceC1915g
    public long h() {
        return this.f14988l;
    }

    @Override // a2.InterfaceC1915g
    public int l() {
        return this.f14985i;
    }

    public C1909a(long j10, long j11, int i10, int i11, boolean z10) {
        super(j10, j11, i10, i11, z10);
        long j12 = j10;
        this.f14984h = j11;
        this.f14985i = i10;
        this.f14986j = i11;
        this.f14987k = z10;
        this.f14988l = j12 == -1 ? -1L : j12;
    }
}
