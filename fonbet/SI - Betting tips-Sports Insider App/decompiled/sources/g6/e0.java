package g6;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Build;
import android.os.IBinder;
import android.os.StrictMode;
import com.google.android.gms.common.ConnectionResult;
import java.util.HashMap;
import java.util.Iterator;
import java.util.concurrent.Executor;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class e0 implements ServiceConnection {

    /* renamed from: a, reason: collision with root package name */
    public final HashMap f9826a = new HashMap();

    /* renamed from: b, reason: collision with root package name */
    public int f9827b = 2;

    /* renamed from: c, reason: collision with root package name */
    public boolean f9828c;

    /* renamed from: d, reason: collision with root package name */
    public IBinder f9829d;

    /* renamed from: e, reason: collision with root package name */
    public final d0 f9830e;

    /* renamed from: f, reason: collision with root package name */
    public ComponentName f9831f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ g0 f9832g;

    public e0(g0 g0Var, d0 d0Var) {
        this.f9832g = g0Var;
        this.f9830e = d0Var;
    }

    public final ConnectionResult a(String str, Executor executor) {
        try {
            Intent a7 = x.a(this.f9832g.f9839b, this.f9830e);
            this.f9827b = 3;
            StrictMode.VmPolicy vmPolicy = StrictMode.getVmPolicy();
            if (Build.VERSION.SDK_INT >= 31) {
                StrictMode.setVmPolicy(q6.g.a(new StrictMode.VmPolicy.Builder(vmPolicy)).build());
            }
            try {
                g0 g0Var = this.f9832g;
                p6.a aVar = g0Var.f9841d;
                Context context = g0Var.f9839b;
                d0 d0Var = this.f9830e;
                try {
                    boolean d10 = aVar.d(context, str, a7, this, 4225, executor);
                    this.f9828c = d10;
                    if (d10) {
                        g0Var.f9840c.sendMessageDelayed(g0Var.f9840c.obtainMessage(1, d0Var), g0Var.f9843f);
                        ConnectionResult connectionResult = ConnectionResult.f4439f;
                        StrictMode.setVmPolicy(vmPolicy);
                        return connectionResult;
                    }
                    this.f9827b = 2;
                    try {
                        g0Var.f9841d.c(g0Var.f9839b, this);
                    } catch (IllegalArgumentException unused) {
                    }
                    ConnectionResult connectionResult2 = new ConnectionResult(16, null, null);
                    StrictMode.setVmPolicy(vmPolicy);
                    return connectionResult2;
                } catch (Throwable th2) {
                    th = th2;
                    Throwable th3 = th;
                    StrictMode.setVmPolicy(vmPolicy);
                    throw th3;
                }
            } catch (Throwable th4) {
                th = th4;
            }
        } catch (w e7) {
            return e7.f9875a;
        }
    }

    @Override // android.content.ServiceConnection
    public final void onBindingDied(ComponentName componentName) {
        onServiceDisconnected(componentName);
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        g0 g0Var = this.f9832g;
        synchronized (g0Var.f9838a) {
            try {
                g0Var.f9840c.removeMessages(1, this.f9830e);
                this.f9829d = iBinder;
                this.f9831f = componentName;
                Iterator it = this.f9826a.values().iterator();
                while (it.hasNext()) {
                    ((ServiceConnection) it.next()).onServiceConnected(componentName, iBinder);
                }
                this.f9827b = 1;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        g0 g0Var = this.f9832g;
        synchronized (g0Var.f9838a) {
            try {
                g0Var.f9840c.removeMessages(1, this.f9830e);
                this.f9829d = null;
                this.f9831f = componentName;
                Iterator it = this.f9826a.values().iterator();
                while (it.hasNext()) {
                    ((ServiceConnection) it.next()).onServiceDisconnected(componentName);
                }
                this.f9827b = 2;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
