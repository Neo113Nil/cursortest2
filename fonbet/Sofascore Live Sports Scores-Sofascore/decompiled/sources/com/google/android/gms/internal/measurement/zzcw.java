package com.google.android.gms.internal.measurement;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zzcw extends zzbl implements zzcy {
    public zzcw(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.measurement.api.internal.IEventHandlerProxy");
    }

    @Override // com.google.android.gms.internal.measurement.zzcy
    public final void z2(long j, Bundle bundle, String str, String str2) {
        Parcel S1 = S1();
        S1.writeString(str);
        S1.writeString(str2);
        zzbn.b(S1, bundle);
        S1.writeLong(j);
        Z1(S1, 1);
    }

    @Override // com.google.android.gms.internal.measurement.zzcy
    public final int zzf() {
        Parcel J = J(S1(), 2);
        int readInt = J.readInt();
        J.recycle();
        return readInt;
    }
}
