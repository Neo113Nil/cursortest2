package defpackage;

import android.content.Context;
import android.os.Binder;
import android.os.Bundle;
import android.os.Looper;
import android.os.Parcel;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.internal.BaseGmsClient;
import com.google.android.gms.internal.ads.zzbew;
import com.google.android.gms.internal.ads.zzfze;
import com.google.android.gms.internal.ads.zzfzi;
import com.google.android.gms.internal.ads.zzfzk;
import com.google.android.gms.internal.ads.zzfzp;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class wao implements BaseGmsClient.BaseConnectionCallbacks, BaseGmsClient.BaseOnConnectionFailedListener {
    public final zzfzk a;
    public final zzfze b;
    public final Object c = new Object();
    public boolean d = false;
    public boolean e = false;

    public wao(Context context, Looper looper, zzfze zzfzeVar) {
        this.b = zzfzeVar;
        this.a = new zzfzk(12800000, context, looper, this, this);
    }

    public final void a() {
        synchronized (this.c) {
            try {
                zzfzk zzfzkVar = this.a;
                if (!zzfzkVar.isConnected()) {
                    if (zzfzkVar.isConnecting()) {
                    }
                    Binder.flushPendingCommands();
                }
                zzfzkVar.disconnect();
                Binder.flushPendingCommands();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient.BaseConnectionCallbacks
    public final void onConnected(Bundle bundle) {
        synchronized (this.c) {
            try {
                if (this.e) {
                    return;
                }
                this.e = true;
                try {
                    zzfzp zzfzpVar = (zzfzp) this.a.getService();
                    zzfzi zzfziVar = new zzfzi(1, this.b.d());
                    Parcel J = zzfzpVar.J();
                    zzbew.c(J, zzfziVar);
                    zzfzpVar.Z1(J, 2);
                } catch (Exception unused) {
                } catch (Throwable th) {
                    a();
                    throw th;
                }
                a();
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient.BaseOnConnectionFailedListener
    public final void J(ConnectionResult connectionResult) {
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient.BaseConnectionCallbacks
    public final void onConnectionSuspended(int i) {
    }
}
