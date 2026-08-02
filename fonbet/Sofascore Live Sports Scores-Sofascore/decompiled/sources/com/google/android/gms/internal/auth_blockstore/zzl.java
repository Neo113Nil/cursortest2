package com.google.android.gms.internal.auth_blockstore;

import android.os.Parcel;
import com.google.android.gms.auth.blockstore.RetrieveBytesResponse;
import com.google.android.gms.common.api.Status;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public abstract class zzl extends zzb implements zzm {
    public zzl() {
        super("com.google.android.gms.auth.blockstore.internal.IRetrieveBytesCallback");
    }

    @Override // com.google.android.gms.internal.auth_blockstore.zzb
    public final boolean J(Parcel parcel, int i) {
        if (i == 1) {
            Status status = (Status) zzc.a(parcel, Status.CREATOR);
            byte[] createByteArray = parcel.createByteArray();
            zzb.S1(parcel);
            u1(status, createByteArray);
            return true;
        }
        if (i != 2) {
            return false;
        }
        Status status2 = (Status) zzc.a(parcel, Status.CREATOR);
        RetrieveBytesResponse retrieveBytesResponse = (RetrieveBytesResponse) zzc.a(parcel, RetrieveBytesResponse.CREATOR);
        zzb.S1(parcel);
        J2(status2, retrieveBytesResponse);
        return true;
    }
}
