package defpackage;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Build;
import android.os.IBinder;
import android.os.StrictMode;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.internal.zzaf;
import com.google.android.gms.common.internal.zzah;
import com.google.android.gms.common.internal.zzn;
import com.google.android.gms.common.internal.zzr;
import com.google.android.gms.common.stats.ConnectionTracker;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Objects;
import java.util.concurrent.Executor;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class szo implements ServiceConnection, zzr {
    public final HashMap a;
    public int b;
    public boolean c;
    public IBinder d;
    public final zzn e;
    public ComponentName f;
    public final /* synthetic */ n2p g;

    public szo(n2p n2pVar, zzn zznVar) {
        Objects.requireNonNull(n2pVar);
        this.g = n2pVar;
        this.e = zznVar;
        this.a = new HashMap();
        this.b = 2;
    }

    public final ConnectionResult a(String str, Executor executor) {
        try {
            Intent a = zzah.a(this.g.e, this.e);
            this.b = 3;
            StrictMode.VmPolicy vmPolicy = StrictMode.getVmPolicy();
            if (Build.VERSION.SDK_INT >= 31) {
                StrictMode.setVmPolicy(xqn.a(new StrictMode.VmPolicy.Builder(vmPolicy)).build());
            }
            try {
                n2p n2pVar = this.g;
                ConnectionTracker connectionTracker = n2pVar.g;
                Context context = n2pVar.e;
                zzn zznVar = this.e;
                boolean d = connectionTracker.d(context, str, a, this, 4225, executor);
                this.c = d;
                if (d) {
                    n2pVar.f.sendMessageDelayed(n2pVar.f.obtainMessage(1, zznVar), n2pVar.i);
                    ConnectionResult connectionResult = ConnectionResult.f;
                    StrictMode.setVmPolicy(vmPolicy);
                    return connectionResult;
                }
                this.b = 2;
                try {
                    n2pVar.g.c(n2pVar.e, this);
                } catch (IllegalArgumentException unused) {
                }
                ConnectionResult connectionResult2 = new ConnectionResult(16, null, null);
                StrictMode.setVmPolicy(vmPolicy);
                return connectionResult2;
            } catch (Throwable th) {
                StrictMode.setVmPolicy(vmPolicy);
                throw th;
            }
        } catch (zzaf e) {
            return e.a;
        }
    }

    @Override // android.content.ServiceConnection
    public final void onBindingDied(ComponentName componentName) {
        onServiceDisconnected(componentName);
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        n2p n2pVar = this.g;
        synchronized (n2pVar.d) {
            try {
                n2pVar.f.removeMessages(1, this.e);
                this.d = iBinder;
                this.f = componentName;
                Iterator it = this.a.values().iterator();
                while (it.hasNext()) {
                    ((ServiceConnection) it.next()).onServiceConnected(componentName, iBinder);
                }
                this.b = 1;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        n2p n2pVar = this.g;
        synchronized (n2pVar.d) {
            try {
                n2pVar.f.removeMessages(1, this.e);
                this.d = null;
                this.f = componentName;
                Iterator it = this.a.values().iterator();
                while (it.hasNext()) {
                    ((ServiceConnection) it.next()).onServiceDisconnected(componentName);
                }
                this.b = 2;
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
