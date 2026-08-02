package defpackage;

import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.internal.GoogleApiManager;
import com.google.android.gms.common.api.internal.zabk;
import com.google.android.gms.common.internal.IAccountAccessor;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class j2n implements Runnable {
    public final /* synthetic */ ConnectionResult a;
    public final /* synthetic */ k2n b;

    public j2n(k2n k2nVar, ConnectionResult connectionResult) {
        this.a = connectionResult;
        this.b = k2nVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        IAccountAccessor iAccountAccessor;
        k2n k2nVar = this.b;
        GoogleApiManager googleApiManager = k2nVar.f;
        Api.Client client = k2nVar.a;
        zabk zabkVar = (zabk) googleApiManager.j.get(k2nVar.b);
        if (zabkVar == null) {
            return;
        }
        ConnectionResult connectionResult = this.a;
        if (!connectionResult.Z0()) {
            zabkVar.l(connectionResult, null);
            return;
        }
        k2nVar.e = true;
        if (client.requiresSignIn()) {
            if (!k2nVar.e || (iAccountAccessor = k2nVar.c) == null) {
                return;
            }
            client.getRemoteService(iAccountAccessor, k2nVar.d);
            return;
        }
        try {
            client.getRemoteService(null, client.m());
        } catch (SecurityException unused) {
            client.disconnect("Failed to get service from broker.");
            zabkVar.l(new ConnectionResult(10, null, null), null);
        }
    }
}
