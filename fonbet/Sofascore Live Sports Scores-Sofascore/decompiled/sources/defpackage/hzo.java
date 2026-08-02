package defpackage;

import android.content.Context;
import android.os.Bundle;
import android.os.DeadObjectException;
import android.os.HandlerThread;
import android.os.Parcel;
import com.google.ads.interactivemedia.v3.internal.zzom;
import com.google.ads.interactivemedia.v3.internal.zzoo;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.internal.BaseGmsClient;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import java.util.concurrent.LinkedBlockingQueue;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public final class hzo implements BaseGmsClient.BaseConnectionCallbacks, BaseGmsClient.BaseOnConnectionFailedListener {
    public final yzo a;
    public final String b;
    public final String c;
    public final LinkedBlockingQueue d;
    public final HandlerThread e;
    public final en0 f;
    public final long g;
    public final int h;

    public hzo(Context context, int i, String str, String str2, en0 en0Var) {
        this.b = str;
        this.h = i;
        this.c = str2;
        this.f = en0Var;
        HandlerThread handlerThread = new HandlerThread("GassDGClient");
        this.e = handlerThread;
        handlerThread.start();
        this.g = System.currentTimeMillis();
        yzo yzoVar = new yzo(19621000, context, handlerThread.getLooper(), this, this);
        this.a = yzoVar;
        this.d = new LinkedBlockingQueue();
        yzoVar.checkAvailabilityAndConnect();
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient.BaseOnConnectionFailedListener
    public final void J(ConnectionResult connectionResult) {
        try {
            b(4012, this.g, null);
            this.d.put(new zzoo());
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

    public final void b(int i, long j, Exception exc) {
        this.f.z(i, System.currentTimeMillis() - j, exc);
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient.BaseConnectionCallbacks
    public final void onConnected(Bundle bundle) {
        e0p e0pVar;
        long j = this.g;
        HandlerThread handlerThread = this.e;
        try {
            e0pVar = (e0p) this.a.getService();
        } catch (DeadObjectException | IllegalStateException unused) {
            e0pVar = null;
        }
        if (e0pVar != null) {
            try {
                zzom zzomVar = new zzom(1, 1, this.b, this.c, this.h - 1);
                Parcel J = e0pVar.J();
                int i = avo.a;
                J.writeInt(1);
                zzomVar.writeToParcel(J, 0);
                Parcel S1 = e0pVar.S1(J, 3);
                zzoo zzooVar = (zzoo) avo.a(S1, zzoo.CREATOR);
                S1.recycle();
                b(IronSourceConstants.errorCode_internal, j, null);
                this.d.put(zzooVar);
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
            b(4011, this.g, null);
            this.d.put(new zzoo());
        } catch (InterruptedException unused) {
        }
    }
}
