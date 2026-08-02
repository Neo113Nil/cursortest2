package defpackage;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class vt1 implements k55, k3f {
    public final rkd a;
    public final wt1 b;
    public boolean c;
    public boolean d;
    public b10 e;
    public boolean f;
    public volatile boolean g;
    public long h;

    public vt1(rkd rkdVar, wt1 wt1Var) {
        this.a = rkdVar;
        this.b = wt1Var;
    }

    public final void a(Object obj, long j) {
        if (this.g) {
            return;
        }
        if (!this.f) {
            synchronized (this) {
                try {
                    if (this.g) {
                        return;
                    }
                    if (this.h == j) {
                        return;
                    }
                    if (this.d) {
                        b10 b10Var = this.e;
                        int i = 0;
                        if (b10Var == null) {
                            b10Var = new b10((byte) 0, 1);
                            this.e = b10Var;
                        }
                        int i2 = b10Var.b;
                        if (i2 == 4) {
                            Object[] objArr = new Object[5];
                            ((Object[]) b10Var.d)[4] = objArr;
                            b10Var.d = objArr;
                        } else {
                            i = i2;
                        }
                        ((Object[]) b10Var.d)[i] = obj;
                        b10Var.b = i + 1;
                        return;
                    }
                    this.c = true;
                    this.f = true;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        test(obj);
    }

    @Override // defpackage.k55
    public final void d() {
        if (this.g) {
            return;
        }
        this.g = true;
        this.b.o0(this);
    }

    @Override // defpackage.k3f
    public final boolean test(Object obj) {
        if (this.g) {
            return true;
        }
        rkd rkdVar = this.a;
        if (obj == agd.a) {
            rkdVar.onComplete();
            return true;
        }
        if (obj instanceof zfd) {
            rkdVar.onError(((zfd) obj).a);
            return true;
        }
        rkdVar.onNext(obj);
        return false;
    }
}
