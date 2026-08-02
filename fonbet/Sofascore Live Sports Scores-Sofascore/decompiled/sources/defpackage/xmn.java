package defpackage;

import android.os.Bundle;
import android.os.DeadObjectException;
import com.google.android.gms.ads.internal.util.client.zzo;
import com.google.android.gms.ads.internal.util.zze;
import com.google.android.gms.common.internal.BaseGmsClient;
import com.google.android.gms.internal.ads.zzbhn;
import com.google.android.gms.internal.ads.zzbhq;
import com.google.android.gms.internal.ads.zzbht;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class xmn implements BaseGmsClient.BaseConnectionCallbacks {
    public final /* synthetic */ zzbhn a;

    public xmn(zzbhn zzbhnVar) {
        this.a = zzbhnVar;
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient.BaseConnectionCallbacks
    public final void onConnected(Bundle bundle) {
        zzbhn zzbhnVar = this.a;
        synchronized (zzbhnVar.c) {
            try {
                zzbhq zzbhqVar = zzbhnVar.d;
                if (zzbhqVar != null) {
                    zzbhnVar.f = (zzbht) zzbhqVar.getService();
                }
            } catch (DeadObjectException e) {
                int i = zze.zza;
                zzo.zzg("Unable to obtain a cache service instance.", e);
                this.a.c();
            }
            this.a.c.notifyAll();
        }
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient.BaseConnectionCallbacks
    public final void onConnectionSuspended(int i) {
        zzbhn zzbhnVar = this.a;
        synchronized (zzbhnVar.c) {
            zzbhnVar.f = null;
            zzbhnVar.c.notifyAll();
        }
    }
}
