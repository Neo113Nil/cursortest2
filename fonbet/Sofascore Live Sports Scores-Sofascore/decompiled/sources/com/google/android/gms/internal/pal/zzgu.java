package com.google.android.gms.internal.pal;

import android.os.Bundle;
import android.os.Parcel;
import defpackage.oko;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zzgu extends zzfj implements zzgw {
    @Override // com.google.android.gms.internal.pal.zzgw
    public final void p2(Bundle bundle, oko okoVar) {
        Parcel obtain = Parcel.obtain();
        obtain.writeInterfaceToken(this.b);
        int i = zzfl.a;
        obtain.writeInt(1);
        bundle.writeToParcel(obtain, 0);
        obtain.writeStrongBinder(okoVar);
        try {
            this.a.transact(1, obtain, null, 1);
        } finally {
            obtain.recycle();
        }
    }
}
