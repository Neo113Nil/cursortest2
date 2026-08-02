package com.google.android.gms.common.internal;

import N9.b;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.internal.base.zaa;
import com.google.android.gms.internal.base.zac;

/* loaded from: classes2.dex */
public final class I extends zaa implements IInterface {
    public I(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.common.internal.ISignInButtonCreator");
    }

    public final N9.b c(N9.b bVar, zax zaxVar) {
        Parcel zaa = zaa();
        zac.zad(zaa, bVar);
        zac.zac(zaa, zaxVar);
        Parcel zab = zab(2, zaa);
        N9.b c10 = b.a.c(zab.readStrongBinder());
        zab.recycle();
        return c10;
    }
}
