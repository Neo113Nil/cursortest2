package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.ads.dynamite.ModuleDescriptor;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zzbrm extends zzbeu implements zzbro {
    @Override // com.google.android.gms.internal.ads.zzbro
    public final zzbrl x2(ObjectWrapper objectWrapper, zzbvu zzbvuVar, zzbrf zzbrfVar) {
        zzbrl zzbrjVar;
        Parcel J = J();
        zzbew.e(J, objectWrapper);
        zzbew.e(J, zzbvuVar);
        J.writeInt(ModuleDescriptor.MODULE_VERSION);
        zzbew.e(J, zzbrfVar);
        Parcel S1 = S1(J, 1);
        IBinder readStrongBinder = S1.readStrongBinder();
        if (readStrongBinder == null) {
            zzbrjVar = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.h5.client.IH5AdsManager");
            zzbrjVar = queryLocalInterface instanceof zzbrl ? (zzbrl) queryLocalInterface : new zzbrj(readStrongBinder);
        }
        S1.recycle();
        return zzbrjVar;
    }
}
