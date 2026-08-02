package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.ads.dynamite.ModuleDescriptor;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zzbzn extends zzbeu implements zzbzp {
    @Override // com.google.android.gms.internal.ads.zzbzp
    public final zzbzm C(ObjectWrapper objectWrapper, zzbvu zzbvuVar) {
        zzbzm zzbzkVar;
        Parcel J = J();
        zzbew.e(J, objectWrapper);
        zzbew.e(J, zzbvuVar);
        J.writeInt(ModuleDescriptor.MODULE_VERSION);
        Parcel S1 = S1(J, 1);
        IBinder readStrongBinder = S1.readStrongBinder();
        if (readStrongBinder == null) {
            zzbzkVar = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.offline.IOfflineUtils");
            zzbzkVar = queryLocalInterface instanceof zzbzm ? (zzbzm) queryLocalInterface : new zzbzk(readStrongBinder);
        }
        S1.recycle();
        return zzbzkVar;
    }
}
