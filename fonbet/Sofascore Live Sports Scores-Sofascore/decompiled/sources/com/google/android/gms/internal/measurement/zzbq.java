package com.google.android.gms.internal.measurement;

import android.os.Bundle;
import android.os.Parcel;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zzbq extends zzbl implements zzbs {
    @Override // com.google.android.gms.internal.measurement.zzbs
    public final Bundle u(Bundle bundle) {
        Parcel S1 = S1();
        zzbn.b(S1, bundle);
        Parcel J = J(S1, 1);
        Bundle bundle2 = (Bundle) zzbn.a(J, Bundle.CREATOR);
        J.recycle();
        return bundle2;
    }
}
