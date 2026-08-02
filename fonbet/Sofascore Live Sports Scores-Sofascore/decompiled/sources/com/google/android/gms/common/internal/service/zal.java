package com.google.android.gms.common.internal.service;

import android.os.Parcel;
import com.google.android.gms.internal.base.zac;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public abstract class zal extends com.google.android.gms.internal.base.zab implements zam {
    public zal() {
        super("com.google.android.gms.common.internal.service.ICommonCallbacks");
    }

    @Override // com.google.android.gms.internal.base.zab
    public final boolean S1(int i, Parcel parcel, Parcel parcel2) {
        if (i != 1) {
            return false;
        }
        parcel.readInt();
        zac.c(parcel);
        return true;
    }
}
