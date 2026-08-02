package defpackage;

import android.os.Handler;
import android.os.Message;
import android.os.SystemClock;
import android.view.Surface;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class z3c implements Handler.Callback {
    public final /* synthetic */ int a = 1;
    public final Handler b;
    public final /* synthetic */ Object c;

    public z3c(a4c a4cVar, q2c q2cVar) {
        this.c = a4cVar;
        Handler j = lik.j(this);
        this.b = j;
        q2cVar.F(this, j);
    }

    public void a(long j) {
        Surface surface;
        b4c b4cVar = (b4c) this.c;
        ro0 ro0Var = b4cVar.I0;
        if (this != b4cVar.t1 || b4cVar.M == null) {
            return;
        }
        if (j == Long.MAX_VALUE) {
            b4cVar.t0 = true;
            return;
        }
        try {
            b4cVar.A0(j);
            zqk zqkVar = b4cVar.o1;
            if (!zqkVar.equals(zqk.d) && !zqkVar.equals(b4cVar.p1)) {
                b4cVar.p1 = zqkVar;
                ro0Var.b(zqkVar);
            }
            b4cVar.v0.f++;
            ppk ppkVar = b4cVar.L0;
            boolean z = ppkVar.e != 3;
            ppkVar.e = 3;
            ppkVar.l.getClass();
            ppkVar.g = nik.T(SystemClock.elapsedRealtime());
            if (z && (surface = b4cVar.Y0) != null) {
                Handler handler = ro0Var.a;
                if (handler != null) {
                    handler.post(new jd(ro0Var, surface, SystemClock.elapsedRealtime(), 6));
                }
                b4cVar.b1 = true;
            }
            b4cVar.f0(j);
        } catch (tf6 e) {
            b4cVar.u0 = e;
        }
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        switch (this.a) {
            case 0:
                if (message.what == 0) {
                    int i = message.arg1;
                    int i2 = message.arg2;
                    String str = nik.a;
                    a(((i & 4294967295L) << 32) | (4294967295L & i2));
                    break;
                }
                break;
            default:
                if (message.what == 0) {
                    int i3 = message.arg1;
                    int i4 = message.arg2;
                    int i5 = lik.a;
                    long j = ((i3 & 4294967295L) << 32) | (4294967295L & i4);
                    a4c a4cVar = (a4c) this.c;
                    if (this == a4cVar.l1) {
                        if (j == Long.MAX_VALUE) {
                            a4cVar.x0 = true;
                        } else {
                            try {
                                a4cVar.k0(j);
                                a4cVar.s0();
                                a4cVar.z0.f++;
                                a4cVar.r0();
                                a4cVar.T(j);
                            } catch (sf6 e) {
                                a4cVar.y0 = e;
                            }
                        }
                    }
                    break;
                }
                break;
        }
        return true;
    }

    public z3c(b4c b4cVar, r2c r2cVar) {
        this.c = b4cVar;
        Handler q = nik.q(this);
        this.b = q;
        r2cVar.s(this, q);
    }
}
