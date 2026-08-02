package defpackage;

import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.internal.measurement.zzcy;
import com.google.android.gms.measurement.internal.AppMeasurementDynamiteService;
import com.google.android.gms.measurement.internal.zzgu;
import com.google.android.gms.measurement.internal.zzic;
import com.google.android.gms.measurement.internal.zzjq;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class k2p implements zzjq {
    public final zzcy a;
    public final /* synthetic */ AppMeasurementDynamiteService b;

    public k2p(AppMeasurementDynamiteService appMeasurementDynamiteService, zzcy zzcyVar) {
        this.b = appMeasurementDynamiteService;
        this.a = zzcyVar;
    }

    @Override // com.google.android.gms.measurement.internal.zzjq
    public final void a(long j, Bundle bundle, String str, String str2) {
        try {
            this.a.z2(j, bundle, str, str2);
        } catch (RemoteException e) {
            zzic zzicVar = this.b.a;
            if (zzicVar != null) {
                zzgu zzguVar = zzicVar.f;
                zzic.m(zzguVar);
                zzguVar.j.b(e, "Event listener threw exception");
            }
        }
    }
}
