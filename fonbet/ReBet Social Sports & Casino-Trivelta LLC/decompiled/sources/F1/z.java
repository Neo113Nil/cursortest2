package F1;

import android.content.Context;
import android.view.Surface;
import e1.AbstractC4134a;
import e1.InterfaceC4143j;
import e1.Z;

/* loaded from: classes.dex */
public final class z {

    /* renamed from: a, reason: collision with root package name */
    public final b f3477a;

    /* renamed from: b, reason: collision with root package name */
    public final C f3478b;

    /* renamed from: c, reason: collision with root package name */
    public final long f3479c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f3480d;

    /* renamed from: g, reason: collision with root package name */
    public long f3483g;

    /* renamed from: j, reason: collision with root package name */
    public boolean f3486j;

    /* renamed from: m, reason: collision with root package name */
    public boolean f3489m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f3490n;

    /* renamed from: o, reason: collision with root package name */
    public boolean f3491o;

    /* renamed from: e, reason: collision with root package name */
    public int f3481e = 0;

    /* renamed from: f, reason: collision with root package name */
    public long f3482f = -9223372036854775807L;

    /* renamed from: h, reason: collision with root package name */
    public long f3484h = -9223372036854775807L;

    /* renamed from: i, reason: collision with root package name */
    public long f3485i = -9223372036854775807L;

    /* renamed from: k, reason: collision with root package name */
    public float f3487k = 1.0f;

    /* renamed from: l, reason: collision with root package name */
    public InterfaceC4143j f3488l = InterfaceC4143j.f45530a;

    public static class a {

        /* renamed from: a, reason: collision with root package name */
        public long f3492a = -9223372036854775807L;

        /* renamed from: b, reason: collision with root package name */
        public long f3493b = -9223372036854775807L;

        public long f() {
            return this.f3492a;
        }

        public long g() {
            return this.f3493b;
        }

        public final void h() {
            this.f3492a = -9223372036854775807L;
            this.f3493b = -9223372036854775807L;
        }
    }

    public interface b {
        boolean J(long j10, long j11, boolean z10);

        boolean x(long j10, long j11);

        boolean z(long j10, long j11, long j12, boolean z10, boolean z11);
    }

    public z(Context context, b bVar, long j10) {
        this.f3477a = bVar;
        this.f3479c = j10;
        this.f3478b = new C(context);
    }

    public void a() {
        if (this.f3481e == 0) {
            this.f3481e = 1;
        }
    }

    public final long b(long j10, long j11, long j12) {
        long j13 = (long) ((j12 - j10) / this.f3487k);
        return this.f3480d ? j13 - (Z.a1(this.f3488l.b()) - j11) : j13;
    }

    public int c(long j10, long j11, long j12, long j13, boolean z10, boolean z11, a aVar) {
        aVar.h();
        if (this.f3480d && this.f3482f == -9223372036854775807L) {
            this.f3482f = j11;
        }
        if (this.f3484h != j10) {
            this.f3478b.h(j10);
            this.f3484h = j10;
        }
        aVar.f3492a = b(j11, j12, j10);
        if (z10 && !z11) {
            return 3;
        }
        if (!this.f3489m) {
            this.f3490n = true;
            if (this.f3477a.z(aVar.f3492a, j11, j12, z11, true)) {
                return 4;
            }
            return (!this.f3480d || aVar.f3492a >= 30000) ? 5 : 3;
        }
        if (q(j11, aVar.f3492a, j13)) {
            return 0;
        }
        if (!this.f3480d || j11 == this.f3482f) {
            return 5;
        }
        long nanoTime = this.f3488l.nanoTime();
        aVar.f3493b = this.f3478b.b((aVar.f3492a * 1000) + nanoTime);
        aVar.f3492a = (aVar.f3493b - nanoTime) / 1000;
        boolean z12 = (this.f3485i == -9223372036854775807L || this.f3486j) ? false : true;
        if (this.f3477a.z(aVar.f3492a, j11, j12, z11, z12)) {
            return 4;
        }
        return this.f3477a.J(aVar.f3492a, j12, z11) ? z12 ? 3 : 2 : aVar.f3492a > 50000 ? 5 : 1;
    }

    public boolean d(boolean z10) {
        if (z10 && (this.f3481e == 3 || (!this.f3489m && this.f3490n))) {
            this.f3485i = -9223372036854775807L;
            return true;
        }
        if (this.f3485i == -9223372036854775807L) {
            return false;
        }
        if (this.f3488l.b() < this.f3485i) {
            return true;
        }
        this.f3485i = -9223372036854775807L;
        return false;
    }

    public void e(boolean z10) {
        this.f3486j = z10;
        this.f3485i = this.f3479c > 0 ? this.f3488l.b() + this.f3479c : -9223372036854775807L;
    }

    public final void f(int i10) {
        this.f3481e = Math.min(this.f3481e, i10);
    }

    public boolean g() {
        boolean z10 = this.f3481e != 3;
        this.f3481e = 3;
        this.f3483g = Z.a1(this.f3488l.b());
        return z10;
    }

    public void h() {
        this.f3480d = true;
        this.f3483g = Z.a1(this.f3488l.b());
        this.f3478b.k();
    }

    public void i() {
        this.f3480d = false;
        this.f3485i = -9223372036854775807L;
        this.f3478b.l();
    }

    public void j(int i10) {
        if (i10 == 0) {
            this.f3481e = 1;
        } else if (i10 == 1) {
            this.f3481e = 0;
        } else {
            if (i10 != 2) {
                throw new IllegalStateException();
            }
            f(2);
        }
    }

    public void k() {
        this.f3478b.j();
        this.f3484h = -9223372036854775807L;
        this.f3482f = -9223372036854775807L;
        f(1);
        this.f3485i = -9223372036854775807L;
    }

    public void l(int i10) {
        this.f3478b.o(i10);
    }

    public void m(InterfaceC4143j interfaceC4143j) {
        this.f3488l = interfaceC4143j;
    }

    public void n(float f10) {
        this.f3478b.g(f10);
    }

    public void o(Surface surface) {
        this.f3489m = surface != null;
        this.f3490n = false;
        this.f3478b.m(surface);
        f(1);
    }

    public void p(float f10) {
        AbstractC4134a.a(f10 > 0.0f);
        if (f10 == this.f3487k) {
            return;
        }
        this.f3487k = f10;
        this.f3478b.i(f10);
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x003b, code lost:
    
        if (r5 != r8) goto L23;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean q(long j10, long j11, long j12) {
        if (this.f3485i != -9223372036854775807L && !this.f3486j) {
            return false;
        }
        int i10 = this.f3481e;
        if (i10 == 0) {
            return this.f3480d;
        }
        if (i10 == 1) {
            return true;
        }
        if (i10 == 2) {
            return j10 >= j12;
        }
        if (i10 != 3) {
            throw new IllegalStateException();
        }
        long a12 = Z.a1(this.f3488l.b()) - this.f3483g;
        if (this.f3480d) {
            if (!this.f3491o) {
                long j13 = this.f3482f;
                if (j13 != -9223372036854775807L) {
                }
            }
            if (this.f3477a.x(j11, a12)) {
                return true;
            }
        }
        return false;
    }
}
