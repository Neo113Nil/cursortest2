package defpackage;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public final class ky2 implements ipg {
    public final ipg a;
    public boolean b;
    public final /* synthetic */ my2 c;

    public ky2(my2 my2Var, ipg ipgVar) {
        this.c = my2Var;
        this.a = ipgVar;
    }

    @Override // defpackage.ipg
    public final int a(fp4 fp4Var, hm4 hm4Var, int i) {
        my2 my2Var = this.c;
        if (my2Var.f()) {
            return -3;
        }
        if (this.b) {
            hm4Var.b = 4;
            return -4;
        }
        int a = this.a.a(fp4Var, hm4Var, i);
        if (a != -5) {
            long j = my2Var.f;
            if (j == Long.MIN_VALUE || ((a != -4 || hm4Var.j < j) && !(a == -3 && my2Var.getBufferedPositionUs() == Long.MIN_VALUE && !hm4Var.i))) {
                return a;
            }
            hm4Var.A();
            hm4Var.b = 4;
            this.b = true;
            return -4;
        }
        sm8 sm8Var = (sm8) fp4Var.c;
        sm8Var.getClass();
        int i2 = sm8Var.C;
        int i3 = sm8Var.B;
        if (i3 == 0 && i2 == 0) {
            return -5;
        }
        if (my2Var.e != 0) {
            i3 = 0;
        }
        if (my2Var.f != Long.MIN_VALUE) {
            i2 = 0;
        }
        pm8 a2 = sm8Var.a();
        a2.A = i3;
        a2.B = i2;
        fp4Var.c = new sm8(a2);
        return -5;
    }

    @Override // defpackage.ipg
    public final boolean isReady() {
        return !this.c.f() && this.a.isReady();
    }

    @Override // defpackage.ipg
    public final void maybeThrowError() {
        this.a.maybeThrowError();
    }

    @Override // defpackage.ipg
    public final int skipData(long j) {
        if (this.c.f()) {
            return -3;
        }
        return this.a.skipData(j);
    }
}
