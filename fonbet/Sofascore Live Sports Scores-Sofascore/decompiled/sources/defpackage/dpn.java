package defpackage;

import android.os.Bundle;
import android.os.DeadObjectException;
import com.google.android.gms.common.internal.BaseGmsClient;
import com.google.android.gms.internal.ads.zzbsa;
import com.google.android.gms.internal.ads.zzbsg;
import com.google.android.gms.internal.ads.zzcgo;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class dpn implements BaseGmsClient.BaseConnectionCallbacks {
    public final /* synthetic */ zzcgo a;
    public final /* synthetic */ zzbsg b;

    public dpn(zzbsg zzbsgVar, zzcgo zzcgoVar) {
        this.a = zzcgoVar;
        this.b = zzbsgVar;
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient.BaseConnectionCallbacks
    public final void onConnected(Bundle bundle) {
        try {
            this.a.zzc((zzbsa) this.b.a.getService());
        } catch (DeadObjectException e) {
            this.a.zzd(e);
        }
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient.BaseConnectionCallbacks
    public final void onConnectionSuspended(int i) {
        this.a.zzd(new RuntimeException(me4.g(i, "onConnectionSuspended: ", new StringBuilder(String.valueOf(i).length() + 23))));
    }
}
