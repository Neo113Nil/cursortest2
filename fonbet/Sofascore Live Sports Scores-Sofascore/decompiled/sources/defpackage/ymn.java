package defpackage;

import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.internal.BaseGmsClient;
import com.google.android.gms.internal.ads.zzbhn;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class ymn implements BaseGmsClient.BaseOnConnectionFailedListener {
    public final /* synthetic */ zzbhn a;

    public ymn(zzbhn zzbhnVar) {
        this.a = zzbhnVar;
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient.BaseOnConnectionFailedListener
    public final void J(ConnectionResult connectionResult) {
        zzbhn zzbhnVar = this.a;
        synchronized (zzbhnVar.c) {
            try {
                zzbhnVar.f = null;
                if (zzbhnVar.d != null) {
                    zzbhnVar.d = null;
                }
                zzbhnVar.c.notifyAll();
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
