package com.google.android.gms.internal.play_billing;

import android.os.Parcel;
import defpackage.ixn;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class zzay extends zzau implements zzba {
    @Override // com.google.android.gms.internal.play_billing.zzba
    public final void F2(String str, String str2, ixn ixnVar) {
        Parcel J = J();
        J.writeString(str);
        J.writeString(str2);
        int i = zzaw.a;
        J.writeStrongBinder(ixnVar);
        l2(J, 1);
    }
}
