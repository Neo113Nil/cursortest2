package com.google.android.gms.fido.fido2.api.common;

import R9.y;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.AbstractC3189m;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.Arrays;

/* loaded from: classes2.dex */
public final class zzf extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzf> CREATOR = new y();
    private final byte[] zza;
    private final byte[] zzb;

    public zzf(byte[] bArr, byte[] bArr2) {
        this.zza = bArr;
        this.zzb = bArr2;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof zzf)) {
            return false;
        }
        zzf zzfVar = (zzf) obj;
        return Arrays.equals(this.zza, zzfVar.zza) && Arrays.equals(this.zzb, zzfVar.zzb);
    }

    public final int hashCode() {
        return AbstractC3189m.c(this.zza, this.zzb);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int a10 = E9.b.a(parcel);
        E9.b.l(parcel, 1, this.zza, false);
        E9.b.l(parcel, 2, this.zzb, false);
        E9.b.b(parcel, a10);
    }
}
