package com.google.android.gms.internal.appset;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.appset.AppSetIdInfo;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.TaskUtil;
import defpackage.tzo;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public abstract class zze extends zzb implements zzf {
    public zze() {
        attachInterface(this, "com.google.android.gms.appset.internal.IAppSetIdCallback");
    }

    @Override // com.google.android.gms.internal.appset.zzb
    public final boolean J(Parcel parcel, int i) {
        if (i != 1) {
            return false;
        }
        Parcelable.Creator<Status> creator = Status.CREATOR;
        int i2 = zzc.a;
        Status createFromParcel = parcel.readInt() == 0 ? null : creator.createFromParcel(parcel);
        com.google.android.gms.appset.zzc createFromParcel2 = parcel.readInt() == 0 ? null : com.google.android.gms.appset.zzc.CREATOR.createFromParcel(parcel);
        TaskUtil.a(createFromParcel, createFromParcel2 != null ? new AppSetIdInfo(createFromParcel2.zzb(), createFromParcel2.zza()) : null, ((tzo) this).a);
        return true;
    }
}
