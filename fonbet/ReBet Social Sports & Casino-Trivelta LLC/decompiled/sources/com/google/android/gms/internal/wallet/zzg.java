package com.google.android.gms.internal.wallet;

import E9.b;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

/* loaded from: classes2.dex */
public final class zzg extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzg> CREATOR = new zzh();
    final byte[] zza;

    public zzg() {
        this.zza = new byte[0];
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        byte[] bArr = this.zza;
        int a10 = b.a(parcel);
        b.l(parcel, 2, bArr, false);
        b.b(parcel, a10);
    }

    public zzg(byte[] bArr) {
        this.zza = bArr;
    }
}
