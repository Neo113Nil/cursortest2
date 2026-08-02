package defpackage;

import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.internal.BaseGmsClient;
import com.google.android.gms.internal.ads.zzbsg;
import com.google.android.gms.internal.ads.zzcgo;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class epn implements BaseGmsClient.BaseOnConnectionFailedListener {
    public final /* synthetic */ zzcgo a;

    public epn(zzbsg zzbsgVar, zzcgo zzcgoVar) {
        this.a = zzcgoVar;
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient.BaseOnConnectionFailedListener
    public final void J(ConnectionResult connectionResult) {
        this.a.zzd(new RuntimeException("Connection failed."));
    }
}
