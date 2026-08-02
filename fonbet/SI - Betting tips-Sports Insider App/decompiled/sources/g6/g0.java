package g6;

import android.content.Context;
import android.content.ServiceConnection;
import android.os.HandlerThread;
import android.os.Looper;
import com.google.android.gms.common.ConnectionResult;
import java.util.HashMap;
import java.util.concurrent.Executor;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class g0 {

    /* renamed from: g, reason: collision with root package name */
    public static final Object f9835g = new Object();

    /* renamed from: h, reason: collision with root package name */
    public static g0 f9836h = null;

    /* renamed from: i, reason: collision with root package name */
    public static HandlerThread f9837i = null;
    public static boolean j = false;

    /* renamed from: a, reason: collision with root package name */
    public final HashMap f9838a = new HashMap();

    /* renamed from: b, reason: collision with root package name */
    public final Context f9839b;

    /* renamed from: c, reason: collision with root package name */
    public volatile com.google.android.gms.internal.measurement.h0 f9840c;

    /* renamed from: d, reason: collision with root package name */
    public final p6.a f9841d;

    /* renamed from: e, reason: collision with root package name */
    public final long f9842e;

    /* renamed from: f, reason: collision with root package name */
    public final long f9843f;

    public g0(Context context, Looper looper) {
        f0 f0Var = new f0(this);
        this.f9839b = context.getApplicationContext();
        com.google.android.gms.internal.measurement.h0 h0Var = new com.google.android.gms.internal.measurement.h0(looper, f0Var);
        Looper.getMainLooper();
        this.f9840c = h0Var;
        this.f9841d = p6.a.b();
        this.f9842e = 5000L;
        this.f9843f = 300000L;
    }

    public static g0 a(Context context) {
        synchronized (f9835g) {
            try {
                if (f9836h == null) {
                    if (!j) {
                        context.getPackageName();
                        j = true;
                    }
                    f9836h = new g0(context.getApplicationContext(), j ? b().getLooper() : context.getMainLooper());
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return f9836h;
    }

    public static HandlerThread b() {
        synchronized (f9835g) {
            try {
                HandlerThread handlerThread = f9837i;
                if (handlerThread != null && handlerThread.isAlive()) {
                    return f9837i;
                }
                HandlerThread handlerThread2 = new HandlerThread("GoogleApiHandler", 9);
                f9837i = handlerThread2;
                handlerThread2.start();
                return f9837i;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final ConnectionResult c(d0 d0Var, a0 a0Var, String str, Executor executor) {
        ConnectionResult connectionResult;
        HashMap hashMap = this.f9838a;
        synchronized (hashMap) {
            try {
                e0 e0Var = (e0) hashMap.get(d0Var);
                if (executor == null) {
                    executor = null;
                }
                if (e0Var == null) {
                    e0Var = new e0(this, d0Var);
                    e0Var.f9826a.put(a0Var, a0Var);
                    connectionResult = e0Var.a(str, executor);
                    hashMap.put(d0Var, e0Var);
                } else {
                    this.f9840c.removeMessages(0, d0Var);
                    if (e0Var.f9826a.containsKey(a0Var)) {
                        String d0Var2 = d0Var.toString();
                        StringBuilder sb2 = new StringBuilder(d0Var2.length() + 81);
                        sb2.append("Trying to bind a GmsServiceConnection that was already connected before.  config=");
                        sb2.append(d0Var2);
                        throw new IllegalStateException(sb2.toString());
                    }
                    e0Var.f9826a.put(a0Var, a0Var);
                    int i5 = e0Var.f9827b;
                    if (i5 == 1) {
                        a0Var.onServiceConnected(e0Var.f9831f, e0Var.f9829d);
                    } else if (i5 == 2) {
                        connectionResult = e0Var.a(str, executor);
                    }
                    connectionResult = null;
                }
                if (e0Var.f9828c) {
                    return ConnectionResult.f4439f;
                }
                if (connectionResult == null) {
                    connectionResult = new ConnectionResult(-1, null, null);
                }
                return connectionResult;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void d(d0 d0Var, ServiceConnection serviceConnection) {
        v.i(serviceConnection, "ServiceConnection must not be null");
        HashMap hashMap = this.f9838a;
        synchronized (hashMap) {
            try {
                e0 e0Var = (e0) hashMap.get(d0Var);
                if (e0Var == null) {
                    String d0Var2 = d0Var.toString();
                    StringBuilder sb2 = new StringBuilder(d0Var2.length() + 50);
                    sb2.append("Nonexistent connection status for service config: ");
                    sb2.append(d0Var2);
                    throw new IllegalStateException(sb2.toString());
                }
                if (!e0Var.f9826a.containsKey(serviceConnection)) {
                    String d0Var3 = d0Var.toString();
                    StringBuilder sb3 = new StringBuilder(d0Var3.length() + 76);
                    sb3.append("Trying to unbind a GmsServiceConnection  that was not bound before.  config=");
                    sb3.append(d0Var3);
                    throw new IllegalStateException(sb3.toString());
                }
                e0Var.f9826a.remove(serviceConnection);
                if (e0Var.f9826a.isEmpty()) {
                    this.f9840c.sendMessageDelayed(this.f9840c.obtainMessage(0, d0Var), this.f9842e);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
