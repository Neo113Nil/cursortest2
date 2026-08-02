package defpackage;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public final class jo5 implements tm6 {
    public final sn5 c;
    public final r0f d;
    public final sn5 e;
    public final oz8 f;
    public final oz8 g;
    public final oz8 h;
    public ko5 j;
    public boolean k;
    public boolean l;
    public e1g m;
    public int n;
    public boolean o;
    public mz8 p;
    public boolean q;
    public lo5 r;
    public tl4 s;
    public volatile boolean t;
    public final io5 a = new io5(new ArrayList(2));
    public final tdi b = new tdi();
    public final AtomicInteger i = new AtomicInteger();

    public jo5(oz8 oz8Var, oz8 oz8Var2, oz8 oz8Var3, oz8 oz8Var4, sn5 sn5Var, sn5 sn5Var2, sx2 sx2Var) {
        this.f = oz8Var;
        this.g = oz8Var2;
        this.h = oz8Var4;
        this.e = sn5Var;
        this.c = sn5Var2;
        this.d = sx2Var;
    }

    public final synchronized void a(hih hihVar, Executor executor) {
        try {
            this.b.a();
            this.a.a.add(new ho5(hihVar, executor));
            boolean z = false;
            if (this.o) {
                d(1);
                executor.execute(new pyn(this, hihVar, z, 10));
            } else if (this.q) {
                d(1);
                executor.execute(new a8p(this, hihVar, z, 11));
            } else {
                w1a.k("Cannot add callbacks to a cancelled EngineJob", !this.t);
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // defpackage.tm6
    public final tdi b() {
        return this.b;
    }

    public final void c() {
        lo5 lo5Var;
        synchronized (this) {
            try {
                this.b.a();
                w1a.k("Not yet complete!", e());
                int decrementAndGet = this.i.decrementAndGet();
                w1a.k("Can't decrement below 0", decrementAndGet >= 0);
                if (decrementAndGet == 0) {
                    lo5Var = this.r;
                    f();
                } else {
                    lo5Var = null;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (lo5Var != null) {
            lo5Var.e();
        }
    }

    public final synchronized void d(int i) {
        lo5 lo5Var;
        w1a.k("Not yet complete!", e());
        if (this.i.getAndAdd(i) == 0 && (lo5Var = this.r) != null) {
            lo5Var.b();
        }
    }

    public final boolean e() {
        return this.q || this.o || this.t;
    }

    public final synchronized void f() {
        boolean b;
        if (this.j == null) {
            throw new IllegalArgumentException();
        }
        this.a.a.clear();
        this.j = null;
        this.r = null;
        this.m = null;
        this.q = false;
        this.t = false;
        this.o = false;
        tl4 tl4Var = this.s;
        vn0 vn0Var = tl4Var.g;
        synchronized (vn0Var) {
            vn0Var.a = true;
            b = vn0Var.b();
        }
        if (b) {
            tl4Var.j();
        }
        this.s = null;
        this.p = null;
        this.n = 0;
        this.d.b(this);
    }

    public final synchronized void g(hih hihVar) {
        try {
            this.b.a();
            this.a.a.remove(new ho5(hihVar, o1j.f));
            if (this.a.a.isEmpty()) {
                if (!e()) {
                    this.t = true;
                    tl4 tl4Var = this.s;
                    tl4Var.B = true;
                    zd4 zd4Var = tl4Var.z;
                    if (zd4Var != null) {
                        zd4Var.cancel();
                    }
                    sn5 sn5Var = this.e;
                    ko5 ko5Var = this.j;
                    synchronized (sn5Var) {
                        t9d t9dVar = sn5Var.a;
                        t9dVar.getClass();
                        HashMap hashMap = (HashMap) t9dVar.a;
                        if (this == hashMap.get(ko5Var)) {
                            hashMap.remove(ko5Var);
                        }
                    }
                }
                if (!this.o) {
                    if (this.q) {
                    }
                }
                if (this.i.get() == 0) {
                    f();
                }
            }
        } catch (Throwable th) {
            throw th;
        }
    }
}
