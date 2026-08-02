package com.google.android.gms.fido.fido2.api.common;

import R9.G;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import com.google.android.gms.common.internal.AbstractC3189m;
import com.google.android.gms.common.internal.AbstractC3191o;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.Arrays;

/* loaded from: classes2.dex */
public final class zzq extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzq> CREATOR = new G();

    /* renamed from: a, reason: collision with root package name */
    public final long f32982a;

    @NonNull
    private final byte[] zzb;

    @NonNull
    private final byte[] zzc;

    @NonNull
    private final byte[] zzd;

    public zzq(long j10, byte[] bArr, byte[] bArr2, byte[] bArr3) {
        this.f32982a = j10;
        this.zzb = (byte[]) AbstractC3191o.m(bArr);
        this.zzc = (byte[]) AbstractC3191o.m(bArr2);
        this.zzd = (byte[]) AbstractC3191o.m(bArr3);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof zzq)) {
            return false;
        }
        zzq zzqVar = (zzq) obj;
        return this.f32982a == zzqVar.f32982a && Arrays.equals(this.zzb, zzqVar.zzb) && Arrays.equals(this.zzc, zzqVar.zzc) && Arrays.equals(this.zzd, zzqVar.zzd);
    }

    public final int hashCode() {
        return AbstractC3189m.c(Long.valueOf(this.f32982a), this.zzb, this.zzc, this.zzd);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int a10 = E9.b.a(parcel);
        E9.b.y(parcel, 1, this.f32982a);
        E9.b.l(parcel, 2, this.zzb, false);
        E9.b.l(parcel, 3, this.zzc, false);
        E9.b.l(parcel, 4, this.zzd, false);
        E9.b.b(parcel, a10);
    }
}
