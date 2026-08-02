package defpackage;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.util.Log;
import com.google.android.gms.common.util.concurrent.NamedThreadFactory;
import com.google.android.gms.tasks.Task;
import java.util.ArrayDeque;
import java.util.Objects;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class hbl implements ServiceConnection {
    public final Context a;
    public final Intent b;
    public final ScheduledThreadPoolExecutor c;
    public final ArrayDeque d;
    public fbl e;
    public boolean f;

    public hbl(Context context) {
        ScheduledThreadPoolExecutor scheduledThreadPoolExecutor = new ScheduledThreadPoolExecutor(1, new NamedThreadFactory("Firebase-FirebaseInstanceIdServiceConnection"));
        scheduledThreadPoolExecutor.setKeepAliveTime(40L, TimeUnit.SECONDS);
        scheduledThreadPoolExecutor.allowCoreThreadTimeOut(true);
        this.d = new ArrayDeque();
        this.f = false;
        Context applicationContext = context.getApplicationContext();
        this.a = applicationContext;
        this.b = new Intent("com.google.firebase.MESSAGING_EVENT").setPackage(applicationContext.getPackageName());
        this.c = scheduledThreadPoolExecutor;
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0039, code lost:
    
        if (com.google.android.gms.common.stats.ConnectionTracker.b().a(r4.a, r4.b, r4, 65) != false) goto L25;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final synchronized void l() {
        while (!this.d.isEmpty()) {
            try {
                fbl fblVar = this.e;
                if (fblVar == null || !fblVar.isBinderAlive()) {
                    if (!this.f) {
                        this.f = true;
                    }
                } else {
                    this.e.a((gbl) this.d.poll());
                }
            } finally {
            }
        }
        return;
        this.f = false;
        ArrayDeque arrayDeque = this.d;
        while (!arrayDeque.isEmpty()) {
            ((gbl) arrayDeque.poll()).b.trySetResult(null);
        }
    }

    public final synchronized Task m(Intent intent) {
        gbl gblVar;
        gblVar = new gbl(intent);
        ScheduledThreadPoolExecutor scheduledThreadPoolExecutor = this.c;
        gblVar.b.getTask().addOnCompleteListener(scheduledThreadPoolExecutor, new ada(scheduledThreadPoolExecutor.schedule(new t4f(gblVar, 24), 20L, TimeUnit.SECONDS)));
        this.d.add(gblVar);
        l();
        return gblVar.b.getTask();
    }

    @Override // android.content.ServiceConnection
    public final synchronized void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        try {
            if (Log.isLoggable("FirebaseMessaging", 3)) {
                Objects.toString(componentName);
            }
            this.f = false;
            if (iBinder instanceof fbl) {
                this.e = (fbl) iBinder;
                l();
            } else {
                Objects.toString(iBinder);
                ArrayDeque arrayDeque = this.d;
                while (!arrayDeque.isEmpty()) {
                    ((gbl) arrayDeque.poll()).b.trySetResult(null);
                }
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        if (Log.isLoggable("FirebaseMessaging", 3)) {
            Objects.toString(componentName);
        }
        l();
    }
}
