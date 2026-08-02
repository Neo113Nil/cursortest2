package com.google.android.gms.internal.wallet;

import android.os.Parcel;
import android.os.Parcelable;
import android.widget.RemoteViews;
import com.google.android.gms.common.internal.ShowFirstParty;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

@ShowFirstParty
@SafeParcelable.Class(creator = "GetSaveInstrumentDetailsResponseCreator")
/* loaded from: classes9.dex */
public final class zzr extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzr> CREATOR = new zzu();

    @SafeParcelable.Field(id = 1)
    private String[] zzfi;

    @SafeParcelable.Field(id = 2)
    private int[] zzfj;

    @SafeParcelable.Field(id = 3)
    private RemoteViews zzfk;

    @SafeParcelable.Field(id = 4)
    private byte[] zzfl;

    @SafeParcelable.Constructor
    public zzr(@SafeParcelable.Param(id = 1) String[] strArr, @SafeParcelable.Param(id = 2) int[] iArr, @SafeParcelable.Param(id = 3) RemoteViews remoteViews, @SafeParcelable.Param(id = 4) byte[] bArr) {
        this.zzfi = strArr;
        this.zzfj = iArr;
        this.zzfk = remoteViews;
        this.zzfl = bArr;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i11) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeStringArray(parcel, 1, this.zzfi, false);
        SafeParcelWriter.writeIntArray(parcel, 2, this.zzfj, false);
        SafeParcelWriter.writeParcelable(parcel, 3, this.zzfk, i11, false);
        SafeParcelWriter.writeByteArray(parcel, 4, this.zzfl, false);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }

    private zzr() {
    }
}
