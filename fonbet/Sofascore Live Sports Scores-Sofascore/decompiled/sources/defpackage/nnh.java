package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public abstract class nnh {
    public rnh a;
    public long b;
    public boolean c;
    public int d;

    public nnh(long j, rnh rnhVar) {
        int i;
        int numberOfTrailingZeros;
        this.a = rnhVar;
        this.b = j;
        z1h z1hVar = snh.a;
        if (j != 0) {
            rnh d = d();
            long j2 = d.c;
            long[] jArr = d.d;
            if (jArr != null) {
                j = jArr[0];
            } else {
                long j3 = d.b;
                if (j3 != 0) {
                    numberOfTrailingZeros = Long.numberOfTrailingZeros(j3);
                } else {
                    long j4 = d.a;
                    if (j4 != 0) {
                        j2 += 64;
                        numberOfTrailingZeros = Long.numberOfTrailingZeros(j4);
                    }
                }
                j = numberOfTrailingZeros + j2;
            }
            synchronized (snh.c) {
                i = snh.f.a(j);
            }
        } else {
            i = -1;
        }
        this.d = i;
    }

    public static void q(nnh nnhVar) {
        snh.b.I(nnhVar);
    }

    public final void a() {
        synchronized (snh.c) {
            b();
            p();
            Unit unit = Unit.a;
        }
    }

    public void b() {
        snh.d = snh.d.c(g());
    }

    public void c() {
        this.c = true;
        synchronized (snh.c) {
            o();
            Unit unit = Unit.a;
        }
    }

    public rnh d() {
        return this.a;
    }

    public abstract Function1 e();

    public abstract boolean f();

    public long g() {
        return this.b;
    }

    public int h() {
        return 0;
    }

    public abstract Function1 i();

    public final nnh j() {
        l2a l2aVar = snh.b;
        nnh nnhVar = (nnh) l2aVar.l();
        l2aVar.I(this);
        return nnhVar;
    }

    public abstract void k();

    public abstract void l();

    public abstract void m();

    public abstract void n(qdi qdiVar);

    public final void o() {
        int i = this.d;
        if (i >= 0) {
            snh.t(i);
            this.d = -1;
        }
    }

    public void p() {
        o();
    }

    public void r(rnh rnhVar) {
        this.a = rnhVar;
    }

    public void s(long j) {
        this.b = j;
    }

    public void t(int i) {
        throw new IllegalStateException("Updating write count is not supported for this snapshot");
    }

    public abstract nnh u(Function1 function1);
}
