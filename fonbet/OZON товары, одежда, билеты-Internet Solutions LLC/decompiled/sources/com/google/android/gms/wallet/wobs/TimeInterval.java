package com.google.android.gms.wallet.wobs;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

@SafeParcelable.Class(creator = "TimeIntervalCreator")
@SafeParcelable.Reserved({1})
/* loaded from: classes9.dex */
public final class TimeInterval extends AbstractSafeParcelable {
    public static final Parcelable.Creator<TimeInterval> CREATOR = new zzk();

    @SafeParcelable.Field(id = 2)
    private long zzge;

    @SafeParcelable.Field(id = 3)
    private long zzgf;

    @SafeParcelable.Constructor
    public TimeInterval(@SafeParcelable.Param(id = 2) long j11, @SafeParcelable.Param(id = 3) long j12) {
        this.zzge = j11;
        this.zzgf = j12;
    }

    public final long getEndTimestamp() {
        return this.zzgf;
    }

    public final long getStartTimestamp() {
        return this.zzge;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i11) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeLong(parcel, 2, this.zzge);
        SafeParcelWriter.writeLong(parcel, 3, this.zzgf);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }

    TimeInterval() {
    }
}
