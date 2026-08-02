package com.google.android.gms.internal.pal;

import android.os.IBinder;
import android.os.IInterface;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zzhh extends zzfu {
    @Override // com.google.android.gms.common.internal.BaseGmsClient
    public final IInterface b(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.gass.internal.IGassService");
        return queryLocalInterface instanceof zzhm ? (zzhm) queryLocalInterface : new zzhm(iBinder, "com.google.android.gms.gass.internal.IGassService");
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient
    public final String g() {
        return "com.google.android.gms.gass.internal.IGassService";
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient, com.google.android.gms.common.api.Api.Client
    public final int getMinApkVersion() {
        return 0;
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient
    public final String h() {
        return "com.google.android.gms.gass.START";
    }
}
