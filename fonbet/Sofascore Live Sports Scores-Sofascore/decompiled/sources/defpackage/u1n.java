package defpackage;

import android.os.Looper;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.internal.zaar;
import com.google.android.gms.common.internal.BaseGmsClient;
import com.google.android.gms.common.internal.Preconditions;
import java.lang.ref.WeakReference;
import java.util.concurrent.locks.Lock;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class u1n implements BaseGmsClient.ConnectionProgressReportCallbacks {
    public final WeakReference a;
    public final Api b;
    public final boolean c;

    public u1n(zaar zaarVar, Api api, boolean z) {
        this.a = new WeakReference(zaarVar);
        this.b = api;
        this.c = z;
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient.ConnectionProgressReportCallbacks
    public final void a(ConnectionResult connectionResult) {
        zaar zaarVar = (zaar) this.a.get();
        if (zaarVar == null) {
            return;
        }
        Lock lock = zaarVar.b;
        Preconditions.k("onReportServiceBinding must be called on the GoogleApiClient handler thread", Looper.myLooper() == zaarVar.a.m.g);
        lock.lock();
        try {
            if (zaarVar.g(0)) {
                if (!connectionResult.Z0()) {
                    zaarVar.c(connectionResult, this.b, this.c);
                }
                if (zaarVar.h()) {
                    zaarVar.a();
                }
            }
        } finally {
            lock.unlock();
        }
    }
}
