package com.google.android.gms.internal.identity;

import android.location.Location;
import android.os.Parcel;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.TaskUtil;
import defpackage.gzn;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public abstract class zzy extends zzb implements zzz {
    public zzy() {
        super("com.google.android.gms.location.internal.ILocationStatusCallback");
    }

    @Override // com.google.android.gms.internal.identity.zzb
    public final boolean J(Parcel parcel, int i) {
        if (i != 1) {
            return false;
        }
        Status status = (Status) zzc.a(parcel, Status.CREATOR);
        Location location = (Location) zzc.a(parcel, Location.CREATOR);
        zzc.b(parcel);
        TaskUtil.a(status, location, ((gzn) this).a);
        return true;
    }
}
