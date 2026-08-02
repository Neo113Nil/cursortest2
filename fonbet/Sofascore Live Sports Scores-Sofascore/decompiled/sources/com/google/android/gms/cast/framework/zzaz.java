package com.google.android.gms.cast.framework;

import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.internal.cast.zzb;
import com.google.android.gms.internal.cast.zzc;
import defpackage.umn;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public abstract class zzaz extends zzb implements zzba {
    public zzaz() {
        super("com.google.android.gms.cast.framework.ISessionProvider");
    }

    @Override // com.google.android.gms.internal.cast.zzb
    public final boolean J(int i, Parcel parcel, Parcel parcel2) {
        if (i == 1) {
            String readString = parcel.readString();
            zzc.d(parcel);
            zzau zzauVar = ((umn) this).a.a(readString).a;
            IObjectWrapper iObjectWrapper = null;
            if (zzauVar != null) {
                try {
                    iObjectWrapper = zzauVar.zzf();
                } catch (RemoteException unused) {
                    Session.b.b("Unable to call %s on %s.", "getWrappedObject", "zzau");
                }
            }
            parcel2.writeNoException();
            zzc.c(parcel2, iObjectWrapper);
            return true;
        }
        if (i == 2) {
            boolean b = ((umn) this).a.b();
            parcel2.writeNoException();
            int i2 = zzc.a;
            parcel2.writeInt(b ? 1 : 0);
            return true;
        }
        if (i == 3) {
            String str = ((umn) this).a.b;
            parcel2.writeNoException();
            parcel2.writeString(str);
            return true;
        }
        if (i != 4) {
            return false;
        }
        parcel2.writeNoException();
        parcel2.writeInt(12451000);
        return true;
    }
}
