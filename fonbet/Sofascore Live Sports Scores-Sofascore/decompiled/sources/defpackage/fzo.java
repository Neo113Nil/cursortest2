package defpackage;

import android.content.Context;
import android.os.Bundle;
import android.os.DeadObjectException;
import android.os.HandlerThread;
import android.os.Parcel;
import com.google.ads.interactivemedia.v3.internal.zzod;
import com.google.ads.interactivemedia.v3.internal.zzof;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.internal.BaseGmsClient;
import java.util.concurrent.LinkedBlockingQueue;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public final class fzo implements BaseGmsClient.BaseConnectionCallbacks, BaseGmsClient.BaseOnConnectionFailedListener {
    public final yzo a;
    public final String b;
    public final String c;
    public final LinkedBlockingQueue d;
    public final HandlerThread e;

    public fzo(Context context, String str, String str2) {
        this.b = str;
        this.c = str2;
        HandlerThread handlerThread = new HandlerThread("GassClient");
        this.e = handlerThread;
        handlerThread.start();
        yzo yzoVar = new yzo(9200000, context, handlerThread.getLooper(), this, this);
        this.a = yzoVar;
        this.d = new LinkedBlockingQueue();
        yzoVar.checkAvailabilityAndConnect();
    }

    public static cmn b() {
        s9n m0 = cmn.m0();
        m0.b();
        ((cmn) m0.b).z0(32768L);
        return (cmn) m0.c();
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient.BaseOnConnectionFailedListener
    public final void J(ConnectionResult connectionResult) {
        try {
            this.d.put(b());
        } catch (InterruptedException unused) {
        }
    }

    public final void a() {
        yzo yzoVar = this.a;
        if (yzoVar != null) {
            if (yzoVar.isConnected() || yzoVar.isConnecting()) {
                yzoVar.disconnect();
            }
        }
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient.BaseConnectionCallbacks
    public final void onConnected(Bundle bundle) {
        e0p e0pVar;
        LinkedBlockingQueue linkedBlockingQueue = this.d;
        HandlerThread handlerThread = this.e;
        try {
            e0pVar = (e0p) this.a.getService();
        } catch (DeadObjectException | IllegalStateException unused) {
            e0pVar = null;
        }
        if (e0pVar != null) {
            try {
                try {
                    zzod zzodVar = new zzod(1, this.b, this.c);
                    Parcel J = e0pVar.J();
                    int i = avo.a;
                    J.writeInt(1);
                    zzodVar.writeToParcel(J, 0);
                    Parcel S1 = e0pVar.S1(J, 1);
                    zzof zzofVar = (zzof) avo.a(S1, zzof.CREATOR);
                    S1.recycle();
                    if (zzofVar.b == null) {
                        try {
                            byte[] bArr = zzofVar.c;
                            z8n z8nVar = z8n.b;
                            int i2 = o7n.a;
                            zzofVar.b = cmn.l0(bArr, z8n.c);
                            zzofVar.c = null;
                        } catch (NullPointerException | lan e) {
                            throw new IllegalStateException(e);
                        }
                    }
                    zzofVar.zzb();
                    linkedBlockingQueue.put(zzofVar.b);
                } catch (Throwable unused2) {
                    linkedBlockingQueue.put(b());
                }
            } catch (InterruptedException unused3) {
            } catch (Throwable th) {
                a();
                handlerThread.quit();
                throw th;
            }
            a();
            handlerThread.quit();
        }
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient.BaseConnectionCallbacks
    public final void onConnectionSuspended(int i) {
        try {
            this.d.put(b());
        } catch (InterruptedException unused) {
        }
    }
}
