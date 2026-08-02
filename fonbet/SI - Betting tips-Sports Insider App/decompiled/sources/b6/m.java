package b6;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.os.Looper;
import android.os.Message;
import android.os.Messenger;
import android.util.Log;
import android.util.SparseArray;
import com.google.android.gms.internal.measurement.h0;
import io.sentry.android.core.w0;
import java.util.ArrayDeque;
import java.util.Iterator;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class m implements ServiceConnection {

    /* renamed from: a, reason: collision with root package name */
    public int f3065a = 0;

    /* renamed from: b, reason: collision with root package name */
    public final Messenger f3066b;

    /* renamed from: c, reason: collision with root package name */
    public l1.a f3067c;

    /* renamed from: d, reason: collision with root package name */
    public final ArrayDeque f3068d;

    /* renamed from: e, reason: collision with root package name */
    public final SparseArray f3069e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ p f3070f;

    public m(p pVar) {
        this.f3070f = pVar;
        h0 h0Var = new h0(Looper.getMainLooper(), new Handler.Callback() { // from class: b6.l
            @Override // android.os.Handler.Callback
            public final boolean handleMessage(Message message) {
                int i5 = message.arg1;
                if (Log.isLoggable("MessengerIpcClient", 3)) {
                    Log.d("MessengerIpcClient", "Received response to request: " + i5);
                }
                m mVar = m.this;
                synchronized (mVar) {
                    try {
                        n nVar = (n) mVar.f3069e.get(i5);
                        if (nVar == null) {
                            w0.m("MessengerIpcClient", "Received response for unknown request: " + i5);
                            return true;
                        }
                        mVar.f3069e.remove(i5);
                        mVar.c();
                        Bundle data = message.getData();
                        if (data.getBoolean("unsupported", false)) {
                            nVar.b(new o("Not supported by GmsCore", null));
                            return true;
                        }
                        switch (nVar.f3075e) {
                            case 0:
                                if (data.getBoolean("ack", false)) {
                                    nVar.c(null);
                                    return true;
                                }
                                nVar.b(new o("Invalid response to one way request", null));
                                return true;
                            default:
                                Bundle bundle = data.getBundle("data");
                                if (bundle == null) {
                                    bundle = Bundle.EMPTY;
                                }
                                nVar.c(bundle);
                                return true;
                        }
                    } finally {
                    }
                }
            }
        });
        Looper.getMainLooper();
        this.f3066b = new Messenger(h0Var);
        this.f3068d = new ArrayDeque();
        this.f3069e = new SparseArray();
    }

    public final synchronized void a(String str) {
        b(str, null);
    }

    public final synchronized void b(String str, SecurityException securityException) {
        try {
            if (Log.isLoggable("MessengerIpcClient", 3)) {
                Log.d("MessengerIpcClient", "Disconnected: ".concat(String.valueOf(str)));
            }
            int i5 = this.f3065a;
            if (i5 == 0) {
                throw new IllegalStateException();
            }
            if (i5 != 1 && i5 != 2) {
                if (i5 != 3) {
                    return;
                }
                this.f3065a = 4;
                return;
            }
            if (Log.isLoggable("MessengerIpcClient", 2)) {
                Log.v("MessengerIpcClient", "Unbinding service");
            }
            this.f3065a = 4;
            p6.a.b().c((Context) this.f3070f.f3079b, this);
            o oVar = new o(str, securityException);
            Iterator it = this.f3068d.iterator();
            while (it.hasNext()) {
                ((n) it.next()).b(oVar);
            }
            this.f3068d.clear();
            for (int i10 = 0; i10 < this.f3069e.size(); i10++) {
                ((n) this.f3069e.valueAt(i10)).b(oVar);
            }
            this.f3069e.clear();
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public final synchronized void c() {
        try {
            if (this.f3065a == 2 && this.f3068d.isEmpty() && this.f3069e.size() == 0) {
                if (Log.isLoggable("MessengerIpcClient", 2)) {
                    Log.v("MessengerIpcClient", "Finished handling requests, unbinding");
                }
                this.f3065a = 3;
                p6.a.b().c((Context) this.f3070f.f3079b, this);
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public final synchronized boolean d(n nVar) {
        int i5 = this.f3065a;
        if (i5 != 0) {
            if (i5 == 1) {
                this.f3068d.add(nVar);
                return true;
            }
            if (i5 != 2) {
                return false;
            }
            this.f3068d.add(nVar);
            ((ScheduledExecutorService) this.f3070f.f3080c).execute(new k(this, 0));
            return true;
        }
        this.f3068d.add(nVar);
        if (this.f3065a != 0) {
            throw new IllegalStateException();
        }
        if (Log.isLoggable("MessengerIpcClient", 2)) {
            Log.v("MessengerIpcClient", "Starting bind to GmsCore");
        }
        this.f3065a = 1;
        Intent intent = new Intent("com.google.android.c2dm.intent.REGISTER");
        intent.setPackage("com.google.android.gms");
        try {
            if (p6.a.b().a((Context) this.f3070f.f3079b, intent, this, 1)) {
                ((ScheduledExecutorService) this.f3070f.f3080c).schedule(new k(this, 1), 30L, TimeUnit.SECONDS);
            } else {
                a("Unable to bind to service");
            }
        } catch (SecurityException e7) {
            b("Unable to bind to service", e7);
        }
        return true;
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        if (Log.isLoggable("MessengerIpcClient", 2)) {
            Log.v("MessengerIpcClient", "Service connected");
        }
        ((ScheduledExecutorService) this.f3070f.f3080c).execute(new g8.a(1, this, iBinder));
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        if (Log.isLoggable("MessengerIpcClient", 2)) {
            Log.v("MessengerIpcClient", "Service disconnected");
        }
        ((ScheduledExecutorService) this.f3070f.f3080c).execute(new k(this, 2));
    }
}
