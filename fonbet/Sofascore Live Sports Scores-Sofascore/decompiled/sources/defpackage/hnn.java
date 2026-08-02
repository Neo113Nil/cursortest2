package defpackage;

import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.internal.BaseGmsClient;
import com.google.android.gms.internal.ads.zzbib;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class hnn implements BaseGmsClient.BaseOnConnectionFailedListener {
    public final /* synthetic */ zmn a;
    public final /* synthetic */ zzbib b;

    public hnn(zzbib zzbibVar, zmn zmnVar) {
        this.a = zmnVar;
        this.b = zzbibVar;
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient.BaseOnConnectionFailedListener
    public final void J(ConnectionResult connectionResult) {
        synchronized (this.b.d) {
            this.a.zzd(new RuntimeException("Connection failed."));
        }
    }
}
