package defpackage;

import android.os.Bundle;
import com.google.android.gms.common.internal.BaseGmsClient;
import com.google.android.gms.internal.ads.zzbhq;
import com.google.android.gms.internal.ads.zzbhr;
import com.google.android.gms.internal.ads.zzbib;
import com.google.android.gms.internal.ads.zzcgj;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class cnn implements BaseGmsClient.BaseConnectionCallbacks {
    public final /* synthetic */ zzbhr a;
    public final /* synthetic */ zmn b;
    public final /* synthetic */ zzbib c;

    public cnn(zzbib zzbibVar, zzbhr zzbhrVar, zmn zmnVar) {
        this.a = zzbhrVar;
        this.b = zmnVar;
        this.c = zzbibVar;
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient.BaseConnectionCallbacks
    public final void onConnected(Bundle bundle) {
        zzbib zzbibVar = this.c;
        synchronized (zzbibVar.d) {
            try {
                if (zzbibVar.b) {
                    return;
                }
                zzbibVar.b = true;
                zzbhq zzbhqVar = zzbibVar.a;
                if (zzbhqVar == null) {
                    return;
                }
                hsn hsnVar = zzcgj.a;
                zzbhr zzbhrVar = this.a;
                zmn zmnVar = this.b;
                zmnVar.addListener(new bnn(0, zmnVar, hsnVar.submit(new n2(7, this, zzbhqVar, zzbhrVar, zmnVar, false))), zzcgj.h);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient.BaseConnectionCallbacks
    public final void onConnectionSuspended(int i) {
    }
}
