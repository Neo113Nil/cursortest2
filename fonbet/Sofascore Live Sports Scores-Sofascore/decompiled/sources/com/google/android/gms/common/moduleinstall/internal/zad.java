package com.google.android.gms.common.moduleinstall.internal;

import android.os.Parcel;
import com.google.android.gms.internal.base.zab;
import defpackage.a70;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public abstract class zad extends zab implements zae {
    public zad() {
        super("com.google.android.gms.common.moduleinstall.internal.IModuleInstallCallbacks");
    }

    @Override // com.google.android.gms.internal.base.zab
    public final boolean S1(int i, Parcel parcel, Parcel parcel2) {
        if (i == 1) {
            com.google.android.gms.internal.base.zac.c(parcel);
            a70.i();
            return false;
        }
        if (i == 2) {
            com.google.android.gms.internal.base.zac.c(parcel);
            a70.i();
            return false;
        }
        if (i == 3) {
            com.google.android.gms.internal.base.zac.c(parcel);
            a70.i();
            return false;
        }
        if (i != 4) {
            return false;
        }
        com.google.android.gms.internal.base.zac.c(parcel);
        a70.i();
        return false;
    }
}
