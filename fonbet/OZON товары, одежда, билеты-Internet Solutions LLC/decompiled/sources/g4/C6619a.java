package g4;

import N3.C3658i;
import N3.F;

/* renamed from: g4.a, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
final class C6619a extends C3658i implements InterfaceC6623e {

    /* renamed from: h, reason: collision with root package name */
    private final long f63750h;

    /* renamed from: i, reason: collision with root package name */
    private final int f63751i;

    /* renamed from: j, reason: collision with root package name */
    private final int f63752j;

    /* renamed from: k, reason: collision with root package name */
    private final boolean f63753k;

    /* renamed from: l, reason: collision with root package name */
    private final long f63754l;

    public C6619a(long j11, long j12, F.a aVar, boolean z11) {
        this(aVar.f18499f, aVar.f18496c, j11, j12, z11);
    }

    public final C6619a b(long j11) {
        int i11 = this.f63752j;
        boolean z11 = this.f63753k;
        return new C6619a(this.f63751i, i11, j11, this.f63750h, z11);
    }

    @Override // g4.InterfaceC6623e
    public final long g() {
        return this.f63754l;
    }

    @Override // g4.InterfaceC6623e
    public final int i() {
        return this.f63751i;
    }

    public C6619a(int i11, int i12, long j11, long j12, boolean z11) {
        super(i11, i12, j11, j12, z11);
        this.f63750h = j12;
        this.f63751i = i11;
        this.f63752j = i12;
        this.f63753k = z11;
        this.f63754l = j11 != -1 ? j11 : -1L;
    }
}
