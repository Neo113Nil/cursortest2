package r1;

import androidx.media3.exoplayer.source.c0;
import e1.AbstractC4134a;
import m1.O0;

/* loaded from: classes.dex */
public final class n implements c0 {

    /* renamed from: a, reason: collision with root package name */
    public final int f63843a;

    /* renamed from: b, reason: collision with root package name */
    public final s f63844b;

    /* renamed from: c, reason: collision with root package name */
    public int f63845c = -1;

    public n(s sVar, int i10) {
        this.f63844b = sVar;
        this.f63843a = i10;
    }

    @Override // androidx.media3.exoplayer.source.c0
    public void a() {
        int i10 = this.f63845c;
        if (i10 == -2) {
            throw new u(this.f63844b.u().b(this.f63843a).a(0).f20543o);
        }
        if (i10 == -1) {
            this.f63844b.X();
        } else if (i10 != -3) {
            this.f63844b.Y(i10);
        }
    }

    public void b() {
        AbstractC4134a.a(this.f63845c == -1);
        this.f63845c = this.f63844b.A(this.f63843a);
    }

    @Override // androidx.media3.exoplayer.source.c0
    public boolean c() {
        if (this.f63845c != -3) {
            return d() && this.f63844b.S(this.f63845c);
        }
        return true;
    }

    public final boolean d() {
        int i10 = this.f63845c;
        return (i10 == -1 || i10 == -3 || i10 == -2) ? false : true;
    }

    public void e() {
        if (this.f63845c != -1) {
            this.f63844b.t0(this.f63843a);
            this.f63845c = -1;
        }
    }

    @Override // androidx.media3.exoplayer.source.c0
    public int q(long j10) {
        if (d()) {
            return this.f63844b.s0(this.f63845c, j10);
        }
        return 0;
    }

    @Override // androidx.media3.exoplayer.source.c0
    public int s(O0 o02, k1.f fVar, int i10) {
        if (this.f63845c == -3) {
            fVar.e(4);
            return -4;
        }
        if (d()) {
            return this.f63844b.i0(this.f63845c, o02, fVar, i10);
        }
        return -3;
    }
}
