package androidx.media3.exoplayer;

import b1.C2340I;
import e1.AbstractC4134a;
import e1.InterfaceC4143j;
import m1.I;
import m1.Q0;
import m1.p1;

/* loaded from: classes.dex */
public final class f implements Q0 {

    /* renamed from: a, reason: collision with root package name */
    public final p1 f21126a;

    /* renamed from: b, reason: collision with root package name */
    public final a f21127b;

    /* renamed from: c, reason: collision with root package name */
    public p f21128c;

    /* renamed from: d, reason: collision with root package name */
    public Q0 f21129d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f21130e = true;

    /* renamed from: f, reason: collision with root package name */
    public boolean f21131f;

    public interface a {
        void u(C2340I c2340i);
    }

    public f(a aVar, InterfaceC4143j interfaceC4143j) {
        this.f21127b = aVar;
        this.f21126a = new p1(interfaceC4143j);
    }

    @Override // m1.Q0
    public long H() {
        return this.f21130e ? this.f21126a.H() : ((Q0) AbstractC4134a.e(this.f21129d)).H();
    }

    public void a(p pVar) {
        if (pVar == this.f21128c) {
            this.f21129d = null;
            this.f21128c = null;
            this.f21130e = true;
        }
    }

    public void b(p pVar) {
        Q0 q02;
        Q0 P10 = pVar.P();
        if (P10 == null || P10 == (q02 = this.f21129d)) {
            return;
        }
        if (q02 != null) {
            throw I.f(new IllegalStateException("Multiple renderer media clocks enabled."), 1000);
        }
        this.f21129d = P10;
        this.f21128c = pVar;
        P10.e(this.f21126a.d());
    }

    public void c(long j10) {
        this.f21126a.a(j10);
    }

    @Override // m1.Q0
    public C2340I d() {
        Q0 q02 = this.f21129d;
        return q02 != null ? q02.d() : this.f21126a.d();
    }

    @Override // m1.Q0
    public void e(C2340I c2340i) {
        Q0 q02 = this.f21129d;
        if (q02 != null) {
            q02.e(c2340i);
            c2340i = this.f21129d.d();
        }
        this.f21126a.e(c2340i);
    }

    public final boolean f(boolean z10) {
        p pVar = this.f21128c;
        if (pVar == null || pVar.b()) {
            return true;
        }
        if (z10 && this.f21128c.getState() != 2) {
            return true;
        }
        if (this.f21128c.c()) {
            return false;
        }
        return z10 || this.f21128c.i();
    }

    public void g() {
        this.f21131f = true;
        this.f21126a.b();
    }

    public void h() {
        this.f21131f = false;
        this.f21126a.c();
    }

    public long i(boolean z10) {
        j(z10);
        return H();
    }

    public final void j(boolean z10) {
        if (f(z10)) {
            this.f21130e = true;
            if (this.f21131f) {
                this.f21126a.b();
                return;
            }
            return;
        }
        Q0 q02 = (Q0) AbstractC4134a.e(this.f21129d);
        long H10 = q02.H();
        if (this.f21130e) {
            if (H10 < this.f21126a.H()) {
                this.f21126a.c();
                return;
            } else {
                this.f21130e = false;
                if (this.f21131f) {
                    this.f21126a.b();
                }
            }
        }
        this.f21126a.a(H10);
        C2340I d10 = q02.d();
        if (d10.equals(this.f21126a.d())) {
            return;
        }
        this.f21126a.e(d10);
        this.f21127b.u(d10);
    }

    @Override // m1.Q0
    public boolean s() {
        return this.f21130e ? this.f21126a.s() : ((Q0) AbstractC4134a.e(this.f21129d)).s();
    }
}
