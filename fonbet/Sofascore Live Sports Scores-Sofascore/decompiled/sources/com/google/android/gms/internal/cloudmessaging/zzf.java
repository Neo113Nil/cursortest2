package com.google.android.gms.internal.cloudmessaging;

import android.os.BadParcelableException;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.api.ApiMetadata;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.TaskUtil;
import defpackage.doo;
import defpackage.me4;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public abstract class zzf extends zzb implements zzg {
    public zzf() {
        attachInterface(this, "com.google.android.gms.cloudmessaging.internal.IRegisterCallback");
    }

    @Override // com.google.android.gms.internal.cloudmessaging.zzb
    public final boolean J(Parcel parcel, int i) {
        if (i != 1) {
            return false;
        }
        Parcelable.Creator<Status> creator = Status.CREATOR;
        int i2 = zzc.a;
        Status createFromParcel = parcel.readInt() == 0 ? null : creator.createFromParcel(parcel);
        String readString = parcel.readString();
        ApiMetadata createFromParcel2 = parcel.readInt() != 0 ? ApiMetadata.CREATOR.createFromParcel(parcel) : null;
        int dataAvail = parcel.dataAvail();
        if (dataAvail > 0) {
            throw new BadParcelableException(me4.g(dataAvail, "Parcel data not fully consumed, unread size: ", new StringBuilder(String.valueOf(dataAvail).length() + 45)));
        }
        TaskUtil.a(createFromParcel, readString, ((doo) this).a);
        return true;
    }
}
