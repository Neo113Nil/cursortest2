package defpackage;

import android.os.Bundle;
import com.google.android.gms.measurement.api.AppMeasurementSdk;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class b7o implements AppMeasurementSdk.OnEventListener {
    public final /* synthetic */ bbo a;

    public b7o(bbo bboVar) {
        this.a = bboVar;
    }

    @Override // com.google.android.gms.measurement.internal.zzjq
    public final void a(long j, Bundle bundle, String str, String str2) {
        if (str == null || uqn.a.contains(str2)) {
            return;
        }
        Bundle bundle2 = new Bundle();
        bundle2.putString("name", str2);
        bundle2.putLong("timestampInMillis", j);
        bundle2.putBundle("params", bundle);
        this.a.a.h(3, bundle2);
    }
}
