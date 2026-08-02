package defpackage;

import android.os.Bundle;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.internal.ads.zzbjg;
import com.google.android.gms.internal.ads.zzbkf;
import com.google.android.gms.internal.ads.zzcgj;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class pnn extends t94 {
    public final /* synthetic */ zzbkf b;

    public pnn(zzbkf zzbkfVar) {
        this.b = zzbkfVar;
    }

    @Override // defpackage.t94
    public final void onNavigationEvent(int i, Bundle bundle) {
        if (((Boolean) zzba.zzc().a(zzbjg.H5)).booleanValue()) {
            zzbkf zzbkfVar = this.b;
            if (zzbkfVar.d != null) {
                zzcgj.a.execute(new q61(zzbkfVar, i, 7));
            }
        }
    }
}
