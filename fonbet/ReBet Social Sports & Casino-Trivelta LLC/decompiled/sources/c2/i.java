package c2;

import H1.I;
import H1.InterfaceC1184q;
import H1.J;
import H1.O;
import H1.r;
import e1.AbstractC4134a;
import e1.J;
import e1.Z;

/* loaded from: classes.dex */
public abstract class i {

    /* renamed from: b, reason: collision with root package name */
    public O f26887b;

    /* renamed from: c, reason: collision with root package name */
    public r f26888c;

    /* renamed from: d, reason: collision with root package name */
    public g f26889d;

    /* renamed from: e, reason: collision with root package name */
    public long f26890e;

    /* renamed from: f, reason: collision with root package name */
    public long f26891f;

    /* renamed from: g, reason: collision with root package name */
    public long f26892g;

    /* renamed from: h, reason: collision with root package name */
    public int f26893h;

    /* renamed from: i, reason: collision with root package name */
    public int f26894i;

    /* renamed from: k, reason: collision with root package name */
    public long f26896k;

    /* renamed from: l, reason: collision with root package name */
    public boolean f26897l;

    /* renamed from: m, reason: collision with root package name */
    public boolean f26898m;

    /* renamed from: a, reason: collision with root package name */
    public final e f26886a = new e();

    /* renamed from: j, reason: collision with root package name */
    public b f26895j = new b();

    public static class b {

        /* renamed from: a, reason: collision with root package name */
        public androidx.media3.common.a f26899a;

        /* renamed from: b, reason: collision with root package name */
        public g f26900b;
    }

    public final void a() {
        AbstractC4134a.i(this.f26887b);
        Z.i(this.f26888c);
    }

    public long b(long j10) {
        return (j10 * 1000000) / this.f26894i;
    }

    public long c(long j10) {
        return (this.f26894i * j10) / 1000000;
    }

    public void d(r rVar, O o10) {
        this.f26888c = rVar;
        this.f26887b = o10;
        l(true);
    }

    public void e(long j10) {
        this.f26892g = j10;
    }

    public abstract long f(J j10);

    public final int g(InterfaceC1184q interfaceC1184q, I i10) {
        a();
        int i11 = this.f26893h;
        if (i11 == 0) {
            return j(interfaceC1184q);
        }
        if (i11 == 1) {
            interfaceC1184q.l((int) this.f26891f);
            this.f26893h = 2;
            return 0;
        }
        if (i11 == 2) {
            Z.i(this.f26889d);
            return k(interfaceC1184q, i10);
        }
        if (i11 == 3) {
            return -1;
        }
        throw new IllegalStateException();
    }

    public final boolean h(InterfaceC1184q interfaceC1184q) {
        while (this.f26886a.d(interfaceC1184q)) {
            this.f26896k = interfaceC1184q.getPosition() - this.f26891f;
            if (!i(this.f26886a.c(), this.f26891f, this.f26895j)) {
                return true;
            }
            this.f26891f = interfaceC1184q.getPosition();
        }
        this.f26893h = 3;
        return false;
    }

    public abstract boolean i(J j10, long j11, b bVar);

    public final int j(InterfaceC1184q interfaceC1184q) {
        if (!h(interfaceC1184q)) {
            return -1;
        }
        androidx.media3.common.a aVar = this.f26895j.f26899a;
        this.f26894i = aVar.f20519G;
        if (!this.f26898m) {
            this.f26887b.c(aVar);
            this.f26898m = true;
        }
        g gVar = this.f26895j.f26900b;
        if (gVar != null) {
            this.f26889d = gVar;
        } else if (interfaceC1184q.getLength() == -1) {
            this.f26889d = new c();
        } else {
            f b10 = this.f26886a.b();
            this.f26889d = new C2486a(this, this.f26891f, interfaceC1184q.getLength(), b10.f26882h + b10.f26883i, b10.f26877c, (b10.f26876b & 4) != 0);
        }
        this.f26893h = 2;
        this.f26886a.f();
        return 0;
    }

    public final int k(InterfaceC1184q interfaceC1184q, I i10) {
        long a10 = this.f26889d.a(interfaceC1184q);
        if (a10 >= 0) {
            i10.f4333a = a10;
            return 1;
        }
        if (a10 < -1) {
            e(-(a10 + 2));
        }
        if (!this.f26897l) {
            H1.J j10 = (H1.J) AbstractC4134a.i(this.f26889d.b());
            this.f26888c.q(j10);
            this.f26887b.d(j10.m());
            this.f26897l = true;
        }
        if (this.f26896k <= 0 && !this.f26886a.d(interfaceC1184q)) {
            this.f26893h = 3;
            return -1;
        }
        this.f26896k = 0L;
        J c10 = this.f26886a.c();
        long f10 = f(c10);
        if (f10 >= 0) {
            long j11 = this.f26892g;
            if (j11 + f10 >= this.f26890e) {
                long b10 = b(j11);
                this.f26887b.a(c10, c10.j());
                this.f26887b.g(b10, 1, c10.j(), 0, null);
                this.f26890e = -1L;
            }
        }
        this.f26892g += f10;
        return 0;
    }

    public void l(boolean z10) {
        if (z10) {
            this.f26895j = new b();
            this.f26891f = 0L;
            this.f26893h = 0;
        } else {
            this.f26893h = 1;
        }
        this.f26890e = -1L;
        this.f26892g = 0L;
    }

    public final void m(long j10, long j11) {
        this.f26886a.e();
        if (j10 == 0) {
            l(!this.f26897l);
        } else if (this.f26893h != 0) {
            this.f26890e = c(j11);
            ((g) Z.i(this.f26889d)).c(this.f26890e);
            this.f26893h = 2;
        }
    }

    public static final class c implements g {
        public c() {
        }

        @Override // c2.g
        public long a(InterfaceC1184q interfaceC1184q) {
            return -1L;
        }

        @Override // c2.g
        public H1.J b() {
            return new J.b(-9223372036854775807L);
        }

        @Override // c2.g
        public void c(long j10) {
        }
    }
}
