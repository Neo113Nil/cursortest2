package com.google.android.gms.internal.play_billing;

import android.os.Parcel;
import defpackage.ixn;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public abstract class zzbb extends zzav implements zzbc {
    public zzbb() {
        super("com.google.android.apps.play.billingtestcompanion.aidl.IBillingOverrideServiceCallback");
    }

    @Override // com.google.android.gms.internal.play_billing.zzav
    public final boolean J(int i, Parcel parcel, Parcel parcel2) {
        if (i != 1) {
            return false;
        }
        int readInt = parcel.readInt();
        zzav.S1(parcel);
        ((ixn) this).a.a(Integer.valueOf(readInt));
        return true;
    }
}
