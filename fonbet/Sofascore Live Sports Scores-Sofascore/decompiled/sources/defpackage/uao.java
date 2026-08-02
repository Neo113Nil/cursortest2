package defpackage;

import android.content.Context;
import android.os.Bundle;
import android.os.DeadObjectException;
import android.os.HandlerThread;
import android.os.Parcel;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.internal.BaseGmsClient;
import com.google.android.gms.internal.ads.zzaya;
import com.google.android.gms.internal.ads.zzaza;
import com.google.android.gms.internal.ads.zzbew;
import com.google.android.gms.internal.ads.zzfzk;
import com.google.android.gms.internal.ads.zzfzl;
import com.google.android.gms.internal.ads.zzfzn;
import com.google.android.gms.internal.ads.zzfzp;
import com.google.android.gms.internal.ads.zziew;
import com.google.android.gms.internal.ads.zzige;
import java.util.concurrent.LinkedBlockingQueue;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class uao implements BaseGmsClient.BaseConnectionCallbacks, BaseGmsClient.BaseOnConnectionFailedListener {
    public final zzfzk a;
    public final String b;
    public final String c;
    public final LinkedBlockingQueue d;
    public final HandlerThread e;

    public uao(Context context, String str, String str2) {
        this.b = str;
        this.c = str2;
        HandlerThread handlerThread = new HandlerThread("GassClient");
        this.e = handlerThread;
        handlerThread.start();
        zzfzk zzfzkVar = new zzfzk(9200000, context, handlerThread.getLooper(), this, this);
        this.a = zzfzkVar;
        this.d = new LinkedBlockingQueue();
        zzfzkVar.checkAvailabilityAndConnect();
    }

    public static zzaza b() {
        zzaya G0 = zzaza.G0();
        G0.r(32768L);
        return (zzaza) G0.o();
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient.BaseOnConnectionFailedListener
    public final void J(ConnectionResult connectionResult) {
        try {
            this.d.put(b());
        } catch (InterruptedException unused) {
        }
    }

    public final void a() {
        zzfzk zzfzkVar = this.a;
        if (zzfzkVar != null) {
            if (zzfzkVar.isConnected() || zzfzkVar.isConnecting()) {
                zzfzkVar.disconnect();
            }
        }
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient.BaseConnectionCallbacks
    public final void onConnected(Bundle bundle) {
        zzfzp zzfzpVar;
        LinkedBlockingQueue linkedBlockingQueue = this.d;
        HandlerThread handlerThread = this.e;
        try {
            zzfzpVar = (zzfzp) this.a.getService();
        } catch (DeadObjectException | IllegalStateException unused) {
            zzfzpVar = null;
        }
        if (zzfzpVar != null) {
            try {
                try {
                    zzfzl zzfzlVar = new zzfzl(1, this.b, this.c);
                    Parcel J = zzfzpVar.J();
                    zzbew.c(J, zzfzlVar);
                    Parcel S1 = zzfzpVar.S1(J, 1);
                    zzfzn zzfznVar = (zzfzn) zzbew.b(S1, zzfzn.CREATOR);
                    S1.recycle();
                    if (zzfznVar.b == null) {
                        try {
                            byte[] bArr = zzfznVar.c;
                            zziew zziewVar = zziew.b;
                            int i = dpo.a;
                            zzfznVar.b = zzaza.F0(bArr, zziew.c);
                            zzfznVar.c = null;
                        } catch (zzige | NullPointerException e) {
                            throw new IllegalStateException(e);
                        }
                    }
                    zzfznVar.Y0();
                    linkedBlockingQueue.put(zzfznVar.b);
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
