package s7;

import android.os.RemoteException;
import com.google.android.gms.measurement.internal.zzr;
import j$.util.Objects;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class t2 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f23091a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ zzr f23092b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ y2 f23093c;

    public /* synthetic */ t2(y2 y2Var, zzr zzrVar, int i5) {
        this.f23091a = i5;
        this.f23092b = zzrVar;
        this.f23093c = y2Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f23091a) {
            case 0:
                y2 y2Var = this.f23093c;
                a0 a0Var = y2Var.f23257d;
                f1 f1Var = (f1) y2Var.f3328a;
                if (a0Var != null) {
                    try {
                        a0Var.k(this.f23092b);
                    } catch (RemoteException e7) {
                        n0 n0Var = f1Var.f22745f;
                        f1.m(n0Var);
                        n0Var.f22903f.b(e7, "Failed to reset data on the service: remote exception");
                    }
                    y2Var.w();
                    break;
                } else {
                    n0 n0Var2 = f1Var.f22745f;
                    f1.m(n0Var2);
                    n0Var2.f22903f.a("Failed to reset data on the service: not connected to service");
                    break;
                }
            case 1:
                y2 y2Var2 = this.f23093c;
                a0 a0Var2 = y2Var2.f23257d;
                f1 f1Var2 = (f1) y2Var2.f3328a;
                if (a0Var2 == null) {
                    n0 n0Var3 = f1Var2.f22745f;
                    f1.m(n0Var3);
                    n0Var3.f22903f.a("Discarding data. Failed to send app launch");
                    break;
                } else {
                    try {
                        zzr zzrVar = this.f23092b;
                        e eVar = f1Var2.f22743d;
                        w wVar = x.f23181c1;
                        if (eVar.t(null, wVar)) {
                            y2Var2.B(a0Var2, null, zzrVar);
                        }
                        a0Var2.D(zzrVar);
                        f1Var2.o().o();
                        f1Var2.f22743d.t(null, wVar);
                        y2Var2.B(a0Var2, null, zzrVar);
                        y2Var2.w();
                        break;
                    } catch (RemoteException e9) {
                        n0 n0Var4 = f1Var2.f22745f;
                        f1.m(n0Var4);
                        n0Var4.f22903f.b(e9, "Failed to send app launch to the service");
                        return;
                    }
                }
            case 2:
                y2 y2Var3 = this.f23093c;
                a0 a0Var3 = y2Var3.f23257d;
                f1 f1Var3 = (f1) y2Var3.f3328a;
                if (a0Var3 == null) {
                    n0 n0Var5 = f1Var3.f22745f;
                    f1.m(n0Var5);
                    n0Var5.f22906i.a("Failed to send app backgrounded");
                    break;
                } else {
                    try {
                        a0Var3.G(this.f23092b);
                        y2Var3.w();
                        break;
                    } catch (RemoteException e10) {
                        n0 n0Var6 = f1Var3.f22745f;
                        f1.m(n0Var6);
                        n0Var6.f22903f.b(e10, "Failed to send app backgrounded to the service");
                        return;
                    }
                }
            case 3:
                y2 y2Var4 = this.f23093c;
                a0 a0Var4 = y2Var4.f23257d;
                f1 f1Var4 = (f1) y2Var4.f3328a;
                if (a0Var4 == null) {
                    n0 n0Var7 = f1Var4.f22745f;
                    f1.m(n0Var7);
                    n0Var7.f22903f.a("Failed to send measurementEnabled to service");
                    break;
                } else {
                    try {
                        a0Var4.r(this.f23092b);
                        y2Var4.w();
                        break;
                    } catch (RemoteException e11) {
                        n0 n0Var8 = f1Var4.f22745f;
                        f1.m(n0Var8);
                        n0Var8.f22903f.b(e11, "Failed to send measurementEnabled to the service");
                        return;
                    }
                }
            default:
                y2 y2Var5 = this.f23093c;
                a0 a0Var5 = y2Var5.f23257d;
                f1 f1Var5 = (f1) y2Var5.f3328a;
                if (a0Var5 == null) {
                    n0 n0Var9 = f1Var5.f22745f;
                    f1.m(n0Var9);
                    n0Var9.f22903f.a("Failed to send consent settings to service");
                    break;
                } else {
                    try {
                        a0Var5.M(this.f23092b);
                        y2Var5.w();
                        break;
                    } catch (RemoteException e12) {
                        n0 n0Var10 = f1Var5.f22745f;
                        f1.m(n0Var10);
                        n0Var10.f22903f.b(e12, "Failed to send consent settings to the service");
                    }
                }
        }
    }

    public t2(y2 y2Var, zzr zzrVar) {
        this.f23091a = 4;
        this.f23092b = zzrVar;
        Objects.requireNonNull(y2Var);
        this.f23093c = y2Var;
    }
}
