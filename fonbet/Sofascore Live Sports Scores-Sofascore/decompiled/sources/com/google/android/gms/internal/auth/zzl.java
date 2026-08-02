package com.google.android.gms.internal.auth;

import android.os.Parcel;
import com.google.android.gms.auth.AccountChangeEventsResponse;
import com.google.android.gms.common.api.Status;
import defpackage.j6n;
import defpackage.uep;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public abstract class zzl extends zzb implements zzm {
    public zzl() {
        super("com.google.android.gms.auth.account.data.IGetAccountChangeEventsCallback");
    }

    @Override // com.google.android.gms.internal.auth.zzb
    public final boolean J(int i, Parcel parcel, Parcel parcel2) {
        if (i != 2) {
            return false;
        }
        Status status = (Status) zzc.a(parcel, Status.CREATOR);
        AccountChangeEventsResponse accountChangeEventsResponse = (AccountChangeEventsResponse) zzc.a(parcel, AccountChangeEventsResponse.CREATOR);
        zzc.b(parcel);
        j6n.i(status, accountChangeEventsResponse, ((uep) this).a);
        return true;
    }
}
