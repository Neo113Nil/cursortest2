package com.google.android.gms.wallet.callback;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

@SafeParcelable.Class(creator = "IntermediatePaymentDataCreator")
/* loaded from: classes9.dex */
public class IntermediatePaymentData extends AbstractSafeParcelable {
    public static final Parcelable.Creator<IntermediatePaymentData> CREATOR = new zzi();

    @SafeParcelable.Field(id = 2)
    private Bundle zzdh;

    @SafeParcelable.Field(id = 1)
    private String zzfe;

    @SafeParcelable.Constructor
    IntermediatePaymentData(@SafeParcelable.Param(id = 1) String str, @SafeParcelable.Param(id = 2) Bundle bundle) {
        this.zzfe = str;
        this.zzdh = bundle;
    }

    public static IntermediatePaymentData fromJson(String str) {
        return new IntermediatePaymentData((String) Preconditions.checkNotNull(str, "JSON cannot be null!"), null);
    }

    public Bundle getLastSavedState() {
        return this.zzdh;
    }

    public String toJson() {
        return this.zzfe;
    }

    public IntermediatePaymentData withLastSavedState(Bundle bundle) {
        this.zzdh = bundle;
        return this;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i11) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeString(parcel, 1, this.zzfe, false);
        SafeParcelWriter.writeBundle(parcel, 2, this.zzdh, false);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }
}
