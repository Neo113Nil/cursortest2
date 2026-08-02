package s7;

import android.content.ComponentName;
import android.content.Context;
import android.content.ServiceConnection;
import android.os.DeadObjectException;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.os.RemoteException;
import com.google.android.gms.common.ConnectionResult;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class x2 implements ServiceConnection, g6.b, g6.c {

    /* renamed from: a, reason: collision with root package name */
    public volatile boolean f23239a;

    /* renamed from: b, reason: collision with root package name */
    public volatile j0 f23240b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ y2 f23241c;

    public x2(y2 y2Var) {
        this.f23241c = y2Var;
    }

    @Override // g6.b
    public final void a(int i5) {
        f1 f1Var = (f1) this.f23241c.f3328a;
        d1 d1Var = f1Var.f22746g;
        f1.m(d1Var);
        d1Var.o();
        n0 n0Var = f1Var.f22745f;
        f1.m(n0Var);
        n0Var.f22909m.a("Service connection suspended");
        d1 d1Var2 = f1Var.f22746g;
        f1.m(d1Var2);
        d1Var2.s(new androidx.core.widget.b(21, this));
    }

    public final void b() {
        y2 y2Var = this.f23241c;
        y2Var.j();
        Context context = ((f1) y2Var.f3328a).f22740a;
        synchronized (this) {
            try {
                try {
                    if (this.f23239a) {
                        n0 n0Var = ((f1) this.f23241c.f3328a).f22745f;
                        f1.m(n0Var);
                        n0Var.f22910n.a("Connection attempt already in progress");
                    } else {
                        if (this.f23240b != null && (this.f23240b.r() || this.f23240b.q())) {
                            n0 n0Var2 = ((f1) this.f23241c.f3328a).f22745f;
                            f1.m(n0Var2);
                            n0Var2.f22910n.a("Already awaiting connection attempt");
                            return;
                        }
                        this.f23240b = new j0(context, Looper.getMainLooper(), g6.g0.a(context), c6.d.f3660b, 93, this, this, null);
                        n0 n0Var3 = ((f1) this.f23241c.f3328a).f22745f;
                        f1.m(n0Var3);
                        n0Var3.f22910n.a("Connecting to remote service");
                        this.f23239a = true;
                        g6.v.h(this.f23240b);
                        this.f23240b.c();
                    }
                } catch (Throwable th2) {
                    th = th2;
                    throw th;
                }
            } catch (Throwable th3) {
                th = th3;
            }
        }
    }

    @Override // g6.b
    public final void e() {
        d1 d1Var = ((f1) this.f23241c.f3328a).f22746g;
        f1.m(d1Var);
        d1Var.o();
        synchronized (this) {
            try {
                g6.v.h(this.f23240b);
                a0 a0Var = (a0) this.f23240b.m();
                d1 d1Var2 = ((f1) this.f23241c.f3328a).f22746g;
                f1.m(d1Var2);
                d1Var2.s(new v2(this, a0Var, 1));
            } catch (DeadObjectException | IllegalStateException unused) {
                this.f23240b = null;
                this.f23239a = false;
            }
        }
    }

    @Override // g6.c
    public final void f(ConnectionResult connectionResult) {
        y2 y2Var = this.f23241c;
        d1 d1Var = ((f1) y2Var.f3328a).f22746g;
        f1.m(d1Var);
        d1Var.o();
        n0 n0Var = ((f1) y2Var.f3328a).f22745f;
        if (n0Var == null || !n0Var.f22870b) {
            n0Var = null;
        }
        if (n0Var != null) {
            n0Var.f22910n.b(connectionResult, "Service connection failed");
        }
        synchronized (this) {
            this.f23239a = false;
            this.f23240b = null;
        }
        d1 d1Var2 = ((f1) this.f23241c.f3328a).f22746g;
        f1.m(d1Var2);
        d1Var2.s(new w0(10, this, connectionResult));
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        d1 d1Var = ((f1) this.f23241c.f3328a).f22746g;
        f1.m(d1Var);
        d1Var.o();
        synchronized (this) {
            if (iBinder == null) {
                this.f23239a = false;
                n0 n0Var = ((f1) this.f23241c.f3328a).f22745f;
                f1.m(n0Var);
                n0Var.f22903f.a("Service connected with null binder");
                return;
            }
            a0 a0Var = null;
            try {
                String interfaceDescriptor = iBinder.getInterfaceDescriptor();
                if ("com.google.android.gms.measurement.internal.IMeasurementService".equals(interfaceDescriptor)) {
                    IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.measurement.internal.IMeasurementService");
                    a0Var = queryLocalInterface instanceof a0 ? (a0) queryLocalInterface : new y(iBinder);
                    n0 n0Var2 = ((f1) this.f23241c.f3328a).f22745f;
                    f1.m(n0Var2);
                    n0Var2.f22910n.a("Bound to IMeasurementService interface");
                } else {
                    n0 n0Var3 = ((f1) this.f23241c.f3328a).f22745f;
                    f1.m(n0Var3);
                    n0Var3.f22903f.b(interfaceDescriptor, "Got binder with a wrong descriptor");
                }
            } catch (RemoteException unused) {
                n0 n0Var4 = ((f1) this.f23241c.f3328a).f22745f;
                f1.m(n0Var4);
                n0Var4.f22903f.a("Service connect failed to get IMeasurementService");
            }
            if (a0Var == null) {
                this.f23239a = false;
                try {
                    p6.a b10 = p6.a.b();
                    y2 y2Var = this.f23241c;
                    b10.c(((f1) y2Var.f3328a).f22740a, y2Var.f23256c);
                } catch (IllegalArgumentException unused2) {
                }
            } else {
                d1 d1Var2 = ((f1) this.f23241c.f3328a).f22746g;
                f1.m(d1Var2);
                d1Var2.s(new v2(this, a0Var, 0));
            }
        }
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        f1 f1Var = (f1) this.f23241c.f3328a;
        d1 d1Var = f1Var.f22746g;
        f1.m(d1Var);
        d1Var.o();
        n0 n0Var = f1Var.f22745f;
        f1.m(n0Var);
        n0Var.f22909m.a("Service disconnected");
        d1 d1Var2 = f1Var.f22746g;
        f1.m(d1Var2);
        d1Var2.s(new w0(9, this, componentName));
    }
}
