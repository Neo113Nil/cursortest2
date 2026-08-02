package com.google.android.gms.internal.auth_blockstore;

import android.os.Parcel;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.TaskUtil;
import defpackage.x8p;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public abstract class zzn extends zzb implements zzo {
    public zzn() {
        super("com.google.android.gms.auth.blockstore.internal.IStoreBytesCallback");
    }

    @Override // com.google.android.gms.internal.auth_blockstore.zzb
    public final boolean J(Parcel parcel, int i) {
        if (i != 1) {
            return false;
        }
        Status status = (Status) zzc.a(parcel, Status.CREATOR);
        int readInt = parcel.readInt();
        zzb.S1(parcel);
        TaskUtil.a(status, Integer.valueOf(readInt), ((x8p) this).a);
        return true;
    }
}
