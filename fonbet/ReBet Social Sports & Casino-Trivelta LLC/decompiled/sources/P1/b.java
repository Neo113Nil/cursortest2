package P1;

import H1.I;
import H1.InterfaceC1183p;
import H1.InterfaceC1184q;
import H1.J;
import H1.r;
import androidx.media3.common.a;
import b1.C2334C;
import b2.n;
import com.reactnativecommunity.clipboard.ClipboardModule;
import e1.AbstractC4134a;
import e1.J;
import e2.s;

/* loaded from: classes.dex */
public final class b implements InterfaceC1183p {

    /* renamed from: b, reason: collision with root package name */
    public r f8691b;

    /* renamed from: c, reason: collision with root package name */
    public int f8692c;

    /* renamed from: d, reason: collision with root package name */
    public int f8693d;

    /* renamed from: e, reason: collision with root package name */
    public int f8694e;

    /* renamed from: g, reason: collision with root package name */
    public W1.a f8696g;

    /* renamed from: h, reason: collision with root package name */
    public InterfaceC1184q f8697h;

    /* renamed from: i, reason: collision with root package name */
    public d f8698i;

    /* renamed from: j, reason: collision with root package name */
    public n f8699j;

    /* renamed from: a, reason: collision with root package name */
    public final J f8690a = new J(2);

    /* renamed from: f, reason: collision with root package name */
    public long f8695f = -1;

    public static W1.a e(String str, long j10) {
        c a10;
        if (j10 == -1 || (a10 = f.a(str)) == null) {
            return null;
        }
        return a10.a(j10);
    }

    private void m(InterfaceC1184q interfaceC1184q) {
        String G10;
        if (this.f8693d == 65505) {
            J j10 = new J(this.f8694e);
            interfaceC1184q.readFully(j10.f(), 0, this.f8694e);
            if (this.f8696g == null && "http://ns.adobe.com/xap/1.0/".equals(j10.G()) && (G10 = j10.G()) != null) {
                W1.a e10 = e(G10, interfaceC1184q.getLength());
                this.f8696g = e10;
                if (e10 != null) {
                    this.f8695f = e10.f12966d;
                }
            }
        } else {
            interfaceC1184q.l(this.f8694e);
        }
        this.f8692c = 0;
    }

    @Override // H1.InterfaceC1183p
    public void a(long j10, long j11) {
        if (j10 == 0) {
            this.f8692c = 0;
            this.f8699j = null;
        } else if (this.f8692c == 5) {
            ((n) AbstractC4134a.e(this.f8699j)).a(j10, j11);
        }
    }

    public final void b(InterfaceC1184q interfaceC1184q) {
        this.f8690a.X(2);
        interfaceC1184q.n(this.f8690a.f(), 0, 2);
        interfaceC1184q.j(this.f8690a.U() - 2);
    }

    @Override // H1.InterfaceC1183p
    public void c(r rVar) {
        this.f8691b = rVar;
    }

    public final void d() {
        ((r) AbstractC4134a.e(this.f8691b)).s();
        this.f8691b.q(new J.b(-9223372036854775807L));
        this.f8692c = 6;
    }

    @Override // H1.InterfaceC1183p
    public int g(InterfaceC1184q interfaceC1184q, I i10) {
        int i11 = this.f8692c;
        if (i11 == 0) {
            l(interfaceC1184q);
            return 0;
        }
        if (i11 == 1) {
            n(interfaceC1184q);
            return 0;
        }
        if (i11 == 2) {
            m(interfaceC1184q);
            return 0;
        }
        if (i11 == 4) {
            long position = interfaceC1184q.getPosition();
            long j10 = this.f8695f;
            if (position != j10) {
                i10.f4333a = j10;
                return 1;
            }
            o(interfaceC1184q);
            return 0;
        }
        if (i11 != 5) {
            if (i11 == 6) {
                return -1;
            }
            throw new IllegalStateException();
        }
        if (this.f8698i == null || interfaceC1184q != this.f8697h) {
            this.f8697h = interfaceC1184q;
            this.f8698i = new d(interfaceC1184q, this.f8695f);
        }
        int g10 = ((n) AbstractC4134a.e(this.f8699j)).g(this.f8698i, i10);
        if (g10 == 1) {
            i10.f4333a += this.f8695f;
        }
        return g10;
    }

    public final void h(W1.a aVar) {
        ((r) AbstractC4134a.e(this.f8691b)).c(1024, 4).c(new a.b().W(ClipboardModule.MIMETYPE_JPEG).r0(new C2334C(aVar)).P());
    }

    public final int i(InterfaceC1184q interfaceC1184q) {
        this.f8690a.X(2);
        interfaceC1184q.n(this.f8690a.f(), 0, 2);
        return this.f8690a.U();
    }

    @Override // H1.InterfaceC1183p
    public boolean j(InterfaceC1184q interfaceC1184q) {
        if (i(interfaceC1184q) != 65496) {
            return false;
        }
        int i10 = i(interfaceC1184q);
        this.f8693d = i10;
        if (i10 == 65504) {
            b(interfaceC1184q);
            this.f8693d = i(interfaceC1184q);
        }
        return this.f8693d == 65505;
    }

    public final void l(InterfaceC1184q interfaceC1184q) {
        this.f8690a.X(2);
        interfaceC1184q.readFully(this.f8690a.f(), 0, 2);
        int U10 = this.f8690a.U();
        this.f8693d = U10;
        if (U10 == 65498) {
            if (this.f8695f != -1) {
                this.f8692c = 4;
                return;
            } else {
                d();
                return;
            }
        }
        if ((U10 < 65488 || U10 > 65497) && U10 != 65281) {
            this.f8692c = 1;
        }
    }

    public final void n(InterfaceC1184q interfaceC1184q) {
        this.f8690a.X(2);
        interfaceC1184q.readFully(this.f8690a.f(), 0, 2);
        this.f8694e = this.f8690a.U() - 2;
        this.f8692c = 2;
    }

    public final void o(InterfaceC1184q interfaceC1184q) {
        if (!interfaceC1184q.e(this.f8690a.f(), 0, 1, true)) {
            d();
            return;
        }
        interfaceC1184q.g();
        if (this.f8699j == null) {
            this.f8699j = new n(s.a.f45617a, 8);
        }
        d dVar = new d(interfaceC1184q, this.f8695f);
        this.f8698i = dVar;
        if (!this.f8699j.j(dVar)) {
            d();
        } else {
            this.f8699j.c(new e(this.f8695f, (r) AbstractC4134a.e(this.f8691b)));
            p();
        }
    }

    public final void p() {
        h((W1.a) AbstractC4134a.e(this.f8696g));
        this.f8692c = 5;
    }

    @Override // H1.InterfaceC1183p
    public void release() {
        n nVar = this.f8699j;
        if (nVar != null) {
            nVar.release();
        }
    }
}
