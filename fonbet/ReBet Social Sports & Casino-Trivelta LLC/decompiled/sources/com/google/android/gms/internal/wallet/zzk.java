package com.google.android.gms.internal.wallet;

import E9.b;
import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

/* loaded from: classes2.dex */
public final class zzk extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzk> CREATOR = new zzl();
    final PendingIntent zza;

    public zzk(PendingIntent pendingIntent) {
        this.zza = pendingIntent;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int a10 = b.a(parcel);
        b.D(parcel, 1, this.zza, i10, false);
        b.b(parcel, a10);
    }
}
