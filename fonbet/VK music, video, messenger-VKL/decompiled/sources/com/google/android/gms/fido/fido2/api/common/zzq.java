package com.google.android.gms.fido.fido2.api.common;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.internal.fido.zzgx;
import java.util.Arrays;
import xsna.dq70;
import xsna.exc0;
import xsna.ozg0;
import xsna.wo01;

/* compiled from: com.google.android.gms:play-services-fido@@21.0.0 */
/* loaded from: classes12.dex */
public final class zzq extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzq> CREATOR = new wo01();
    public final long b;

    @NonNull
    public final zzgx c;

    @NonNull
    public final zzgx d;

    @NonNull
    public final zzgx e;

    public zzq(long j, @NonNull byte[] bArr, @NonNull byte[] bArr2, @NonNull byte[] bArr3) {
        exc0.i(bArr);
        zzgx zzl = zzgx.zzl(bArr, 0, bArr.length);
        exc0.i(bArr2);
        zzgx zzl2 = zzgx.zzl(bArr2, 0, bArr2.length);
        exc0.i(bArr3);
        zzgx zzl3 = zzgx.zzl(bArr3, 0, bArr3.length);
        this.b = j;
        exc0.i(zzl);
        this.c = zzl;
        exc0.i(zzl2);
        this.d = zzl2;
        exc0.i(zzl3);
        this.e = zzl3;
    }

    public final boolean equals(@Nullable Object obj) {
        if (!(obj instanceof zzq)) {
            return false;
        }
        zzq zzqVar = (zzq) obj;
        return this.b == zzqVar.b && dq70.b(this.c, zzqVar.c) && dq70.b(this.d, zzqVar.d) && dq70.b(this.e, zzqVar.e);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Long.valueOf(this.b), this.c, this.d, this.e});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int w = ozg0.w(20293, parcel);
        ozg0.v(parcel, 1, 8);
        parcel.writeLong(this.b);
        ozg0.e(parcel, 2, this.c.zzm(), false);
        ozg0.e(parcel, 3, this.d.zzm(), false);
        ozg0.e(parcel, 4, this.e.zzm(), false);
        ozg0.x(w, parcel);
    }
}
