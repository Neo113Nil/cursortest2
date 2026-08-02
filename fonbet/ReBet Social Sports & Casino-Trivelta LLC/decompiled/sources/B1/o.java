package B1;

import H1.C1177j;
import H1.O;
import h1.AbstractC4417m;
import h1.C4418n;
import h1.InterfaceC4411g;

/* loaded from: classes.dex */
public final class o extends a {

    /* renamed from: n, reason: collision with root package name */
    public final int f607n;

    /* renamed from: o, reason: collision with root package name */
    public final androidx.media3.common.a f608o;

    /* renamed from: p, reason: collision with root package name */
    public long f609p;

    /* renamed from: q, reason: collision with root package name */
    public boolean f610q;

    public o(InterfaceC4411g interfaceC4411g, C4418n c4418n, androidx.media3.common.a aVar, int i10, Object obj, long j10, long j11, long j12, int i11, androidx.media3.common.a aVar2) {
        super(interfaceC4411g, c4418n, aVar, i10, obj, j10, j11, -9223372036854775807L, -9223372036854775807L, j12);
        this.f607n = i11;
        this.f608o = aVar2;
    }

    @Override // D1.m.e
    public void a() {
        c j10 = j();
        j10.b(0L);
        O c10 = j10.c(0, this.f607n);
        c10.c(this.f608o);
        try {
            long b10 = this.f564i.b(this.f557b.e(this.f609p));
            if (b10 != -1) {
                b10 += this.f609p;
            }
            C1177j c1177j = new C1177j(this.f564i, this.f609p, b10);
            for (int i10 = 0; i10 != -1; i10 = c10.e(c1177j, Integer.MAX_VALUE, true)) {
                this.f609p += i10;
            }
            c10.g(this.f562g, 1, (int) this.f609p, 0, null);
            AbstractC4417m.a(this.f564i);
            this.f610q = true;
        } catch (Throwable th2) {
            AbstractC4417m.a(this.f564i);
            throw th2;
        }
    }

    @Override // B1.m
    public boolean h() {
        return this.f610q;
    }

    @Override // D1.m.e
    public void c() {
    }
}
