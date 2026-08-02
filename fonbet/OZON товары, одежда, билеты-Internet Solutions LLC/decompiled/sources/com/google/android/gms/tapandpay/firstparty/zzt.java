package com.google.android.gms.tapandpay.firstparty;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.ShowFirstParty;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

@ShowFirstParty
@SafeParcelable.Class(creator = "GetContactlessSetupStatusResponseCreator")
/* loaded from: classes9.dex */
public final class zzt extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzt> CREATOR = new zzu();

    @SafeParcelable.Field(id = 1)
    final ContactlessSetupItem[] zza;

    @SafeParcelable.Constructor
    public zzt(@SafeParcelable.Param(id = 1) ContactlessSetupItem[] contactlessSetupItemArr) {
        this.zza = contactlessSetupItemArr;
    }

    public final String toString() {
        Objects.ToStringHelper stringHelper = Objects.toStringHelper(this);
        for (ContactlessSetupItem contactlessSetupItem : this.zza) {
            stringHelper.add("type", Integer.valueOf(contactlessSetupItem.zza));
            stringHelper.add("status", Integer.valueOf(contactlessSetupItem.zzb));
        }
        return stringHelper.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i11) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeTypedArray(parcel, 1, this.zza, i11, false);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }
}
