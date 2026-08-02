package o2;

import androidx.media3.common.a;
import e1.AbstractC4134a;
import e1.AbstractC4156x;
import o2.L;

/* loaded from: classes.dex */
public final class r implements InterfaceC5793m {

    /* renamed from: a, reason: collision with root package name */
    public final String f59211a;

    /* renamed from: c, reason: collision with root package name */
    public H1.O f59213c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f59214d;

    /* renamed from: f, reason: collision with root package name */
    public int f59216f;

    /* renamed from: g, reason: collision with root package name */
    public int f59217g;

    /* renamed from: b, reason: collision with root package name */
    public final e1.J f59212b = new e1.J(10);

    /* renamed from: e, reason: collision with root package name */
    public long f59215e = -9223372036854775807L;

    public r(String str) {
        this.f59211a = str;
    }

    @Override // o2.InterfaceC5793m
    public void a(e1.J j10) {
        AbstractC4134a.i(this.f59213c);
        if (this.f59214d) {
            int a10 = j10.a();
            int i10 = this.f59217g;
            if (i10 < 10) {
                int min = Math.min(a10, 10 - i10);
                System.arraycopy(j10.f(), j10.g(), this.f59212b.f(), this.f59217g, min);
                if (this.f59217g + min == 10) {
                    this.f59212b.b0(0);
                    if (73 != this.f59212b.M() || 68 != this.f59212b.M() || 51 != this.f59212b.M()) {
                        AbstractC4156x.i("Id3Reader", "Discarding invalid ID3 tag");
                        this.f59214d = false;
                        return;
                    } else {
                        this.f59212b.c0(3);
                        this.f59216f = this.f59212b.L() + 10;
                    }
                }
            }
            int min2 = Math.min(a10, this.f59216f - this.f59217g);
            this.f59213c.a(j10, min2);
            this.f59217g += min2;
        }
    }

    @Override // o2.InterfaceC5793m
    public void b() {
        this.f59214d = false;
        this.f59215e = -9223372036854775807L;
    }

    @Override // o2.InterfaceC5793m
    public void c(boolean z10) {
        int i10;
        AbstractC4134a.i(this.f59213c);
        if (this.f59214d && (i10 = this.f59216f) != 0 && this.f59217g == i10) {
            AbstractC4134a.g(this.f59215e != -9223372036854775807L);
            this.f59213c.g(this.f59215e, 1, this.f59216f, 0, null);
            this.f59214d = false;
        }
    }

    @Override // o2.InterfaceC5793m
    public void d(H1.r rVar, L.d dVar) {
        dVar.a();
        H1.O c10 = rVar.c(dVar.c(), 5);
        this.f59213c = c10;
        c10.c(new a.b().j0(dVar.b()).W(this.f59211a).y0("application/id3").P());
    }

    @Override // o2.InterfaceC5793m
    public void e(long j10, int i10) {
        if ((i10 & 4) == 0) {
            return;
        }
        this.f59214d = true;
        this.f59215e = j10;
        this.f59216f = 0;
        this.f59217g = 0;
    }
}
