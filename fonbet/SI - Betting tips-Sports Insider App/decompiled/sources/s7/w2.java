package s7;

import android.os.RemoteException;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final /* synthetic */ class w2 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f23169a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ y2 f23170b;

    public /* synthetic */ w2(y2 y2Var, int i5) {
        this.f23169a = i5;
        this.f23170b = y2Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f23169a) {
            case 0:
                this.f23170b.p();
                break;
            case 1:
                y2 y2Var = this.f23170b;
                f1 f1Var = (f1) y2Var.f3328a;
                a0 a0Var = y2Var.f23257d;
                if (a0Var == null) {
                    n0 n0Var = f1Var.f22745f;
                    f1.m(n0Var);
                    n0Var.f22903f.a("Failed to send Dma consent settings to service");
                    break;
                } else {
                    try {
                        a0Var.s(y2Var.z(false));
                        y2Var.w();
                        break;
                    } catch (RemoteException e7) {
                        n0 n0Var2 = f1Var.f22745f;
                        f1.m(n0Var2);
                        n0Var2.f22903f.b(e7, "Failed to send Dma consent settings to the service");
                        return;
                    }
                }
            default:
                y2 y2Var2 = this.f23170b;
                f1 f1Var2 = (f1) y2Var2.f3328a;
                a0 a0Var2 = y2Var2.f23257d;
                if (a0Var2 == null) {
                    n0 n0Var3 = f1Var2.f22745f;
                    f1.m(n0Var3);
                    n0Var3.f22903f.a("Failed to send storage consent settings to service");
                    break;
                } else {
                    try {
                        a0Var2.n(y2Var2.z(false));
                        y2Var2.w();
                        break;
                    } catch (RemoteException e9) {
                        n0 n0Var4 = f1Var2.f22745f;
                        f1.m(n0Var4);
                        n0Var4.f22903f.b(e9, "Failed to send storage consent settings to the service");
                    }
                }
        }
    }
}
