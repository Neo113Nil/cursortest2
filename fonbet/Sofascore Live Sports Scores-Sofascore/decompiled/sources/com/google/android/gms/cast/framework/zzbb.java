package com.google.android.gms.cast.framework;

import android.os.Bundle;
import android.os.Parcel;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.internal.cast.zzb;
import com.google.android.gms.internal.cast.zzc;
import defpackage.kmn;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public abstract class zzbb extends zzb implements zzbc {
    public zzbb() {
        super("com.google.android.gms.cast.framework.ISessionProxy");
    }

    @Override // com.google.android.gms.internal.cast.zzb
    public final boolean J(int i, Parcel parcel, Parcel parcel2) {
        switch (i) {
            case 1:
                ObjectWrapper objectWrapper = new ObjectWrapper(((kmn) this).a);
                parcel2.writeNoException();
                zzc.c(parcel2, objectWrapper);
                return true;
            case 2:
                Bundle bundle = (Bundle) zzc.a(parcel, Bundle.CREATOR);
                zzc.d(parcel);
                ((kmn) this).a.g(bundle);
                parcel2.writeNoException();
                return true;
            case 3:
                Bundle bundle2 = (Bundle) zzc.a(parcel, Bundle.CREATOR);
                zzc.d(parcel);
                ((kmn) this).a.f(bundle2);
                parcel2.writeNoException();
                return true;
            case 4:
                int i2 = zzc.a;
                boolean z = parcel.readInt() != 0;
                zzc.d(parcel);
                ((kmn) this).a.a(z);
                parcel2.writeNoException();
                return true;
            case 5:
                long b = ((kmn) this).a.b();
                parcel2.writeNoException();
                parcel2.writeLong(b);
                return true;
            case 6:
                parcel2.writeNoException();
                parcel2.writeInt(12451000);
                return true;
            case 7:
                Bundle bundle3 = (Bundle) zzc.a(parcel, Bundle.CREATOR);
                zzc.d(parcel);
                ((kmn) this).a.e(bundle3);
                parcel2.writeNoException();
                return true;
            case 8:
                Bundle bundle4 = (Bundle) zzc.a(parcel, Bundle.CREATOR);
                zzc.d(parcel);
                ((kmn) this).a.d(bundle4);
                parcel2.writeNoException();
                return true;
            case 9:
                Bundle bundle5 = (Bundle) zzc.a(parcel, Bundle.CREATOR);
                zzc.d(parcel);
                ((kmn) this).a.h(bundle5);
                parcel2.writeNoException();
                return true;
            default:
                return false;
        }
    }
}
