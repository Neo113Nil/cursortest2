package com.google.android.gms.internal.auth_blockstore;

import android.os.Parcel;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.TaskUtil;
import defpackage.cdp;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public abstract class zzh extends zzb implements zzi {
    public zzh() {
        super("com.google.android.gms.auth.blockstore.internal.IDeleteBytesCallback");
    }

    @Override // com.google.android.gms.internal.auth_blockstore.zzb
    public final boolean J(Parcel parcel, int i) {
        if (i != 1) {
            return false;
        }
        Status status = (Status) zzc.a(parcel, Status.CREATOR);
        boolean z = parcel.readInt() != 0;
        zzb.S1(parcel);
        TaskUtil.a(status, Boolean.valueOf(z), ((cdp) this).a);
        return true;
    }
}
