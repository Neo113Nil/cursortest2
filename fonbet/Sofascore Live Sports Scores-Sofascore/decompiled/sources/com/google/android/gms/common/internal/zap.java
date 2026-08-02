package com.google.android.gms.common.internal;

import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zap extends com.google.android.gms.internal.base.zaa implements IInterface {
    public final IObjectWrapper Z1(ObjectWrapper objectWrapper, zaaa zaaaVar) {
        Parcel J = J();
        int i = com.google.android.gms.internal.base.zac.a;
        J.writeStrongBinder(objectWrapper);
        com.google.android.gms.internal.base.zac.b(J, zaaaVar);
        Parcel obtain = Parcel.obtain();
        try {
            try {
                this.a.transact(2, J, obtain, 0);
                obtain.readException();
                J.recycle();
                IObjectWrapper S1 = IObjectWrapper.Stub.S1(obtain.readStrongBinder());
                obtain.recycle();
                return S1;
            } catch (RuntimeException e) {
                obtain.recycle();
                throw e;
            }
        } catch (Throwable th) {
            J.recycle();
            throw th;
        }
    }
}
