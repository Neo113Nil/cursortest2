package H1;

import androidx.media3.common.a;
import e1.AbstractC4134a;

/* loaded from: classes.dex */
public final class L implements InterfaceC1183p {

    /* renamed from: a, reason: collision with root package name */
    public final int f4341a;

    /* renamed from: b, reason: collision with root package name */
    public final int f4342b;

    /* renamed from: c, reason: collision with root package name */
    public final String f4343c;

    /* renamed from: d, reason: collision with root package name */
    public int f4344d;

    /* renamed from: e, reason: collision with root package name */
    public int f4345e;

    /* renamed from: f, reason: collision with root package name */
    public r f4346f;

    /* renamed from: g, reason: collision with root package name */
    public O f4347g;

    public L(int i10, int i11, String str) {
        this.f4341a = i10;
        this.f4342b = i11;
        this.f4343c = str;
    }

    @Override // H1.InterfaceC1183p
    public void a(long j10, long j11) {
        if (j10 == 0 || this.f4345e == 1) {
            this.f4345e = 1;
            this.f4344d = 0;
        }
    }

    public final void b(String str) {
        O c10 = this.f4346f.c(1024, 4);
        this.f4347g = c10;
        c10.c(new a.b().W(str).y0(str).P());
        this.f4346f.s();
        this.f4346f.q(new M(-9223372036854775807L));
        this.f4345e = 1;
    }

    @Override // H1.InterfaceC1183p
    public void c(r rVar) {
        this.f4346f = rVar;
        b(this.f4343c);
    }

    public final void d(InterfaceC1184q interfaceC1184q) {
        int e10 = ((O) AbstractC4134a.e(this.f4347g)).e(interfaceC1184q, 1024, true);
        if (e10 != -1) {
            this.f4344d += e10;
            return;
        }
        this.f4345e = 2;
        this.f4347g.g(0L, 1, this.f4344d, 0, null);
        this.f4344d = 0;
    }

    @Override // H1.InterfaceC1183p
    public int g(InterfaceC1184q interfaceC1184q, I i10) {
        int i11 = this.f4345e;
        if (i11 == 1) {
            d(interfaceC1184q);
            return 0;
        }
        if (i11 == 2) {
            return -1;
        }
        throw new IllegalStateException();
    }

    @Override // H1.InterfaceC1183p
    public boolean j(InterfaceC1184q interfaceC1184q) {
        AbstractC4134a.g((this.f4341a == -1 || this.f4342b == -1) ? false : true);
        e1.J j10 = new e1.J(this.f4342b);
        interfaceC1184q.n(j10.f(), 0, this.f4342b);
        return j10.U() == this.f4341a;
    }

    @Override // H1.InterfaceC1183p
    public void release() {
    }
}
