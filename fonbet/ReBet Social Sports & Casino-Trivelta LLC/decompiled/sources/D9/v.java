package D9;

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
import android.os.RemoteException;
import android.util.Log;
import android.util.SparseArray;
import com.google.android.gms.common.internal.AbstractC3191o;
import com.google.android.gms.internal.cloudmessaging.zzf;
import com.twilio.voice.EventKeys;
import java.util.ArrayDeque;
import java.util.Iterator;
import java.util.Queue;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* loaded from: classes2.dex */
public final class v implements ServiceConnection {

    /* renamed from: c, reason: collision with root package name */
    public w f2649c;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ B f2652f;

    /* renamed from: a, reason: collision with root package name */
    public int f2647a = 0;

    /* renamed from: b, reason: collision with root package name */
    public final Messenger f2648b = new Messenger(new zzf(Looper.getMainLooper(), new Handler.Callback() { // from class: D9.s
        @Override // android.os.Handler.Callback
        public final boolean handleMessage(Message message) {
            int i10 = message.arg1;
            Log.isLoggable("MessengerIpcClient", 3);
            v vVar = v.this;
            synchronized (vVar) {
                try {
                    y yVar = (y) vVar.f2651e.get(i10);
                    if (yVar == null) {
                        Log.w("MessengerIpcClient", "Received response for unknown request: " + i10);
                        return true;
                    }
                    vVar.f2651e.remove(i10);
                    vVar.f();
                    Bundle data = message.getData();
                    if (data.getBoolean("unsupported", false)) {
                        yVar.c(new z(4, "Not supported by GmsCore", null));
                        return true;
                    }
                    yVar.a(data);
                    return true;
                } finally {
                }
            }
        }
    }));

    /* renamed from: d, reason: collision with root package name */
    public final Queue f2650d = new ArrayDeque();

    /* renamed from: e, reason: collision with root package name */
    public final SparseArray f2651e = new SparseArray();

    public /* synthetic */ v(B b10, u uVar) {
        this.f2652f = b10;
    }

    public final synchronized void a(int i10, String str) {
        b(i10, str, null);
    }

    public final synchronized void b(int i10, String str, Throwable th2) {
        Context context;
        try {
            if (Log.isLoggable("MessengerIpcClient", 3)) {
                "Disconnected: ".concat(String.valueOf(str));
            }
            int i11 = this.f2647a;
            if (i11 == 0) {
                throw new IllegalStateException();
            }
            if (i11 != 1 && i11 != 2) {
                if (i11 != 3) {
                    return;
                }
                this.f2647a = 4;
                return;
            }
            Log.isLoggable("MessengerIpcClient", 2);
            this.f2647a = 4;
            B b10 = this.f2652f;
            J9.b b11 = J9.b.b();
            context = b10.f2598a;
            b11.c(context, this);
            z zVar = new z(i10, str, th2);
            Iterator it = this.f2650d.iterator();
            while (it.hasNext()) {
                ((y) it.next()).c(zVar);
            }
            this.f2650d.clear();
            for (int i12 = 0; i12 < this.f2651e.size(); i12++) {
                ((y) this.f2651e.valueAt(i12)).c(zVar);
            }
            this.f2651e.clear();
        } catch (Throwable th3) {
            throw th3;
        }
    }

    public final void c() {
        ScheduledExecutorService scheduledExecutorService;
        scheduledExecutorService = this.f2652f.f2599b;
        scheduledExecutorService.execute(new Runnable() { // from class: D9.p
            @Override // java.lang.Runnable
            public final void run() {
                final y yVar;
                ScheduledExecutorService scheduledExecutorService2;
                Context context;
                while (true) {
                    final v vVar = v.this;
                    synchronized (vVar) {
                        try {
                            if (vVar.f2647a != 2) {
                                return;
                            }
                            if (vVar.f2650d.isEmpty()) {
                                vVar.f();
                                return;
                            }
                            yVar = (y) vVar.f2650d.poll();
                            vVar.f2651e.put(yVar.f2655a, yVar);
                            scheduledExecutorService2 = vVar.f2652f.f2599b;
                            scheduledExecutorService2.schedule(new Runnable() { // from class: D9.t
                                @Override // java.lang.Runnable
                                public final void run() {
                                    v.this.e(yVar.f2655a);
                                }
                            }, 30L, TimeUnit.SECONDS);
                        } finally {
                        }
                    }
                    if (Log.isLoggable("MessengerIpcClient", 3)) {
                        "Sending ".concat(String.valueOf(yVar));
                    }
                    B b10 = vVar.f2652f;
                    Messenger messenger = vVar.f2648b;
                    int i10 = yVar.f2657c;
                    context = b10.f2598a;
                    Message obtain = Message.obtain();
                    obtain.what = i10;
                    obtain.arg1 = yVar.f2655a;
                    obtain.replyTo = messenger;
                    Bundle bundle = new Bundle();
                    bundle.putBoolean("oneWay", yVar.b());
                    bundle.putString("pkg", context.getPackageName());
                    bundle.putBundle(EventKeys.DATA, yVar.f2658d);
                    obtain.setData(bundle);
                    try {
                        vVar.f2649c.a(obtain);
                    } catch (RemoteException e10) {
                        vVar.a(2, e10.getMessage());
                    }
                }
            }
        });
    }

    public final synchronized void d() {
        if (this.f2647a == 1) {
            a(1, "Timed out while binding");
        }
    }

    public final synchronized void e(int i10) {
        y yVar = (y) this.f2651e.get(i10);
        if (yVar != null) {
            Log.w("MessengerIpcClient", "Timing out request: " + i10);
            this.f2651e.remove(i10);
            yVar.c(new z(3, "Timed out waiting for response", null));
            f();
        }
    }

    public final synchronized void f() {
        Context context;
        if (this.f2647a == 2 && this.f2650d.isEmpty() && this.f2651e.size() == 0) {
            Log.isLoggable("MessengerIpcClient", 2);
            this.f2647a = 3;
            B b10 = this.f2652f;
            J9.b b11 = J9.b.b();
            context = b10.f2598a;
            b11.c(context, this);
        }
    }

    public final synchronized boolean g(y yVar) {
        Context context;
        ScheduledExecutorService scheduledExecutorService;
        int i10 = this.f2647a;
        if (i10 != 0) {
            if (i10 == 1) {
                this.f2650d.add(yVar);
                return true;
            }
            if (i10 != 2) {
                return false;
            }
            this.f2650d.add(yVar);
            c();
            return true;
        }
        this.f2650d.add(yVar);
        AbstractC3191o.p(this.f2647a == 0);
        Log.isLoggable("MessengerIpcClient", 2);
        this.f2647a = 1;
        Intent intent = new Intent("com.google.android.c2dm.intent.REGISTER");
        intent.setPackage("com.google.android.gms");
        try {
            J9.b b10 = J9.b.b();
            context = this.f2652f.f2598a;
            if (b10.a(context, intent, this, 1)) {
                scheduledExecutorService = this.f2652f.f2599b;
                scheduledExecutorService.schedule(new Runnable() { // from class: D9.q
                    @Override // java.lang.Runnable
                    public final void run() {
                        v.this.d();
                    }
                }, 30L, TimeUnit.SECONDS);
            } else {
                a(0, "Unable to bind to service");
            }
        } catch (SecurityException e10) {
            b(0, "Unable to bind to service", e10);
        }
        return true;
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, final IBinder iBinder) {
        ScheduledExecutorService scheduledExecutorService;
        Log.isLoggable("MessengerIpcClient", 2);
        scheduledExecutorService = this.f2652f.f2599b;
        scheduledExecutorService.execute(new Runnable() { // from class: D9.o
            @Override // java.lang.Runnable
            public final void run() {
                v vVar = v.this;
                IBinder iBinder2 = iBinder;
                synchronized (vVar) {
                    if (iBinder2 == null) {
                        vVar.a(0, "Null service connection");
                        return;
                    }
                    try {
                        vVar.f2649c = new w(iBinder2);
                        vVar.f2647a = 2;
                        vVar.c();
                    } catch (RemoteException e10) {
                        vVar.a(0, e10.getMessage());
                    }
                }
            }
        });
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        ScheduledExecutorService scheduledExecutorService;
        Log.isLoggable("MessengerIpcClient", 2);
        scheduledExecutorService = this.f2652f.f2599b;
        scheduledExecutorService.execute(new Runnable() { // from class: D9.r
            @Override // java.lang.Runnable
            public final void run() {
                v.this.a(2, "Service disconnected");
            }
        });
    }
}
