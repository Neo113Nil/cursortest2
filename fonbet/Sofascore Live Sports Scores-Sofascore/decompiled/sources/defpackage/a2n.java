package defpackage;

import android.os.Bundle;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.internal.zaar;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.signin.zae;
import java.util.concurrent.locks.Lock;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class a2n implements GoogleApiClient.ConnectionCallbacks, GoogleApiClient.OnConnectionFailedListener {
    public final /* synthetic */ zaar a;

    public /* synthetic */ a2n(zaar zaarVar) {
        this.a = zaarVar;
    }

    @Override // com.google.android.gms.common.api.internal.OnConnectionFailedListener
    public final void J(ConnectionResult connectionResult) {
        zaar zaarVar = this.a;
        Lock lock = zaarVar.b;
        lock.lock();
        try {
            if (zaarVar.l && !connectionResult.Y0()) {
                zaarVar.d();
                zaarVar.a();
            } else {
                zaarVar.e(connectionResult);
            }
            lock.unlock();
        } catch (Throwable th) {
            lock.unlock();
            throw th;
        }
    }

    @Override // com.google.android.gms.common.api.internal.ConnectionCallbacks
    public final void onConnected(Bundle bundle) {
        zaar zaarVar = this.a;
        Preconditions.i(zaarVar.r);
        zae zaeVar = zaarVar.k;
        Preconditions.i(zaeVar);
        zaeVar.d(new z1n(zaarVar));
    }

    @Override // com.google.android.gms.common.api.internal.ConnectionCallbacks
    public final void onConnectionSuspended(int i) {
    }
}
