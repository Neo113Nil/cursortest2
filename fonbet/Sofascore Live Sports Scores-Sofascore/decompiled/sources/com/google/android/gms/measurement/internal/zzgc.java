package com.google.android.gms.measurement.internal;

import android.os.Parcel;
import com.google.android.gms.internal.measurement.zzbl;
import java.util.List;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zzgc extends zzbl implements zzge {
    @Override // com.google.android.gms.measurement.internal.zzge
    public final void z(List list) {
        Parcel S1 = S1();
        S1.writeTypedList(list);
        l2(S1);
    }
}
