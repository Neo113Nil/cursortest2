package defpackage;

import android.content.Context;
import android.os.Bundle;
import android.os.DeadObjectException;
import android.os.HandlerThread;
import android.os.Parcel;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.internal.BaseGmsClient;
import com.google.android.gms.internal.ads.zzbei;
import com.google.android.gms.internal.ads.zzbew;
import com.google.android.gms.internal.ads.zzfyi;
import com.google.android.gms.internal.ads.zzfzk;
import com.google.android.gms.internal.ads.zzfzp;
import com.google.android.gms.internal.ads.zzfzu;
import com.google.android.gms.internal.ads.zzfzw;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import java.util.concurrent.LinkedBlockingQueue;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class vao implements BaseGmsClient.BaseConnectionCallbacks, BaseGmsClient.BaseOnConnectionFailedListener {
    public final zzfzk a;
    public final String b;
    public final String c;
    public final zzbei d;
    public final LinkedBlockingQueue e;
    public final HandlerThread f;
    public final zzfyi g;
    public final long h;

    public vao(Context context, zzbei zzbeiVar, String str, String str2, zzfyi zzfyiVar) {
        this.b = str;
        this.d = zzbeiVar;
        this.c = str2;
        this.g = zzfyiVar;
        HandlerThread handlerThread = new HandlerThread("GassDGClient");
        this.f = handlerThread;
        handlerThread.start();
        this.h = System.currentTimeMillis();
        zzfzk zzfzkVar = new zzfzk(19621000, context, handlerThread.getLooper(), this, this);
        this.a = zzfzkVar;
        this.e = new LinkedBlockingQueue();
        zzfzkVar.checkAvailabilityAndConnect();
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient.BaseOnConnectionFailedListener
    public final void J(ConnectionResult connectionResult) {
        try {
            b(4012, this.h, null);
            this.e.put(new zzfzw());
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

    public final void b(int i, long j, Exception exc) {
        zzfyi zzfyiVar = this.g;
        if (zzfyiVar != null) {
            zzfyiVar.c(i, System.currentTimeMillis() - j, exc);
        }
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient.BaseConnectionCallbacks
    public final void onConnected(Bundle bundle) {
        zzfzp zzfzpVar;
        long j = this.h;
        HandlerThread handlerThread = this.f;
        try {
            zzfzpVar = (zzfzp) this.a.getService();
        } catch (DeadObjectException | IllegalStateException unused) {
            zzfzpVar = null;
        }
        if (zzfzpVar != null) {
            try {
                zzfzu zzfzuVar = new zzfzu(1, 1, this.b, this.c, this.d.a);
                Parcel J = zzfzpVar.J();
                zzbew.c(J, zzfzuVar);
                Parcel S1 = zzfzpVar.S1(J, 3);
                zzfzw zzfzwVar = (zzfzw) zzbew.b(S1, zzfzw.CREATOR);
                S1.recycle();
                b(IronSourceConstants.errorCode_internal, j, null);
                this.e.put(zzfzwVar);
            } finally {
                try {
                } finally {
                }
            }
        }
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient.BaseConnectionCallbacks
    public final void onConnectionSuspended(int i) {
        try {
            b(4011, this.h, null);
            this.e.put(new zzfzw());
        } catch (InterruptedException unused) {
        }
    }
}
