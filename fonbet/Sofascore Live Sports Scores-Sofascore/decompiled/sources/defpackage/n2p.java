package defpackage;

import android.content.Context;
import android.content.ServiceConnection;
import android.os.Looper;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.internal.GmsClientSupervisor;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.zze;
import com.google.android.gms.common.internal.zzn;
import com.google.android.gms.common.stats.ConnectionTracker;
import com.google.android.gms.internal.common.zzg;
import java.util.HashMap;
import java.util.concurrent.Executor;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class n2p extends GmsClientSupervisor {
    public final HashMap d = new HashMap();
    public final Context e;
    public volatile zzg f;
    public final ConnectionTracker g;
    public final long h;
    public final long i;

    public n2p(Context context, Looper looper) {
        cy8 cy8Var = new cy8(this, 5);
        this.e = context.getApplicationContext();
        zzg zzgVar = new zzg(looper, cy8Var);
        Looper.getMainLooper();
        this.f = zzgVar;
        this.g = ConnectionTracker.b();
        this.h = 5000L;
        this.i = 300000L;
    }

    @Override // com.google.android.gms.common.internal.GmsClientSupervisor
    public final ConnectionResult b(zzn zznVar, zze zzeVar, String str, Executor executor) {
        ConnectionResult connectionResult;
        HashMap hashMap = this.d;
        synchronized (hashMap) {
            try {
                szo szoVar = (szo) hashMap.get(zznVar);
                if (executor == null) {
                    executor = null;
                }
                if (szoVar == null) {
                    szoVar = new szo(this, zznVar);
                    szoVar.a.put(zzeVar, zzeVar);
                    connectionResult = szoVar.a(str, executor);
                    hashMap.put(zznVar, szoVar);
                } else {
                    this.f.removeMessages(0, zznVar);
                    if (szoVar.a.containsKey(zzeVar)) {
                        String zznVar2 = zznVar.toString();
                        StringBuilder sb = new StringBuilder(zznVar2.length() + 81);
                        sb.append("Trying to bind a GmsServiceConnection that was already connected before.  config=");
                        sb.append(zznVar2);
                        throw new IllegalStateException(sb.toString());
                    }
                    szoVar.a.put(zzeVar, zzeVar);
                    int i = szoVar.b;
                    if (i == 1) {
                        zzeVar.onServiceConnected(szoVar.f, szoVar.d);
                    } else if (i == 2) {
                        connectionResult = szoVar.a(str, executor);
                    }
                    connectionResult = null;
                }
                if (szoVar.c) {
                    return ConnectionResult.f;
                }
                if (connectionResult == null) {
                    connectionResult = new ConnectionResult(-1, null, null);
                }
                return connectionResult;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // com.google.android.gms.common.internal.GmsClientSupervisor
    public final void c(zzn zznVar, ServiceConnection serviceConnection) {
        Preconditions.j(serviceConnection, "ServiceConnection must not be null");
        HashMap hashMap = this.d;
        synchronized (hashMap) {
            try {
                szo szoVar = (szo) hashMap.get(zznVar);
                if (szoVar == null) {
                    String zznVar2 = zznVar.toString();
                    StringBuilder sb = new StringBuilder(zznVar2.length() + 50);
                    sb.append("Nonexistent connection status for service config: ");
                    sb.append(zznVar2);
                    throw new IllegalStateException(sb.toString());
                }
                if (!szoVar.a.containsKey(serviceConnection)) {
                    String zznVar3 = zznVar.toString();
                    StringBuilder sb2 = new StringBuilder(zznVar3.length() + 76);
                    sb2.append("Trying to unbind a GmsServiceConnection  that was not bound before.  config=");
                    sb2.append(zznVar3);
                    throw new IllegalStateException(sb2.toString());
                }
                szoVar.a.remove(serviceConnection);
                if (szoVar.a.isEmpty()) {
                    this.f.sendMessageDelayed(this.f.obtainMessage(0, zznVar), this.h);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
