package defpackage;

import android.os.Bundle;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.google.android.gms.measurement.internal.zzjm;
import com.google.android.gms.measurement.internal.zzlt;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class xxn implements AppMeasurementSdk.OnEventListener {
    public final /* synthetic */ e2o a;

    public xxn(e2o e2oVar) {
        this.a = e2oVar;
    }

    @Override // com.google.android.gms.measurement.internal.zzjq
    public final void a(long j, Bundle bundle, String str, String str2) {
        e2o e2oVar = this.a;
        if (e2oVar.a.contains(str2)) {
            Bundle bundle2 = new Bundle();
            vv9 vv9Var = uqn.a;
            String b = zzlt.b(str2, zzjm.f, zzjm.a);
            if (b != null) {
                str2 = b;
            }
            bundle2.putString("events", str2);
            e2oVar.b.h(2, bundle2);
        }
    }
}
