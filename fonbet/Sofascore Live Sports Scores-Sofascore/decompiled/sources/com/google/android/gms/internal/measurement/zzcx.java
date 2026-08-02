package com.google.android.gms.internal.measurement;

import android.os.Bundle;
import android.os.Parcel;
import defpackage.p5o;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public abstract class zzcx extends zzbm implements zzcy {
    public zzcx() {
        super("com.google.android.gms.measurement.api.internal.IEventHandlerProxy");
    }

    @Override // com.google.android.gms.internal.measurement.zzbm
    public final boolean J(int i, Parcel parcel, Parcel parcel2) {
        if (i != 1) {
            if (i != 2) {
                return false;
            }
            int identityHashCode = System.identityHashCode(((p5o) this).a);
            parcel2.writeNoException();
            parcel2.writeInt(identityHashCode);
            return true;
        }
        String readString = parcel.readString();
        String readString2 = parcel.readString();
        Bundle bundle = (Bundle) zzbn.a(parcel, Bundle.CREATOR);
        long readLong = parcel.readLong();
        zzbn.d(parcel);
        ((p5o) this).z2(readLong, bundle, readString, readString2);
        parcel2.writeNoException();
        return true;
    }
}
