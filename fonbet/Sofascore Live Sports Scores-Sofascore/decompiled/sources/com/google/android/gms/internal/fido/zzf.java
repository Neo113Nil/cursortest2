package com.google.android.gms.internal.fido;

import android.os.Parcel;
import com.google.android.gms.common.api.ApiException;
import com.google.android.gms.common.api.Status;
import defpackage.v8p;
import java.util.ArrayList;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public abstract class zzf extends zzb implements zzg {
    public zzf() {
        super("com.google.android.gms.fido.fido2.api.ICredentialListCallback");
    }

    @Override // com.google.android.gms.internal.fido.zzb
    public final boolean J(int i, Parcel parcel, Parcel parcel2) {
        if (i == 1) {
            ArrayList readArrayList = parcel.readArrayList(zzc.a);
            zzc.b(parcel);
            ((v8p) this).a.setResult(readArrayList);
        } else {
            if (i != 2) {
                return false;
            }
            Status status = (Status) zzc.a(parcel, Status.CREATOR);
            zzc.b(parcel);
            ((v8p) this).a.trySetException(new ApiException(status));
        }
        parcel2.writeNoException();
        return true;
    }
}
