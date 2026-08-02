package com.google.android.gms.fido.fido2.api.common;

import R9.z;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.AbstractC3189m;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.Arrays;

/* loaded from: classes2.dex */
public final class zzh extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzh> CREATOR = new z();

    /* renamed from: a, reason: collision with root package name */
    public final boolean f32981a;
    private final byte[] zzb;

    public zzh(boolean z10, byte[] bArr) {
        this.f32981a = z10;
        this.zzb = bArr;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof zzh)) {
            return false;
        }
        zzh zzhVar = (zzh) obj;
        return this.f32981a == zzhVar.f32981a && Arrays.equals(this.zzb, zzhVar.zzb);
    }

    public final int hashCode() {
        return AbstractC3189m.c(Boolean.valueOf(this.f32981a), this.zzb);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int a10 = E9.b.a(parcel);
        E9.b.g(parcel, 1, this.f32981a);
        E9.b.l(parcel, 2, this.zzb, false);
        E9.b.b(parcel, a10);
    }
}
